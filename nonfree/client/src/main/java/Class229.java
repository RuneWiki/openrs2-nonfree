import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class229 implements Runnable {

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "Lclient!am;")
	private Class9 aClass9_8;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "[B")
	private byte[] aByteArray81;

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "Z")
	private boolean aBoolean435 = false;

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
	private int anInt6252 = 0;

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "Z")
	private boolean aBoolean437 = false;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
	private int anInt6250 = 0;

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "Lclient!od;")
	private final Class180 aClass180_4;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	static {
		new Class7("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!od;)V")
	public Class229(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class180 arg1) throws IOException {
		this.aClass180_4 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
	public void method5202() throws IOException {
		if (!this.aBoolean437 && this.aBoolean435) {
			this.aBoolean435 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIB[B)V")
	public void method5203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean437) {
			return;
		}
		while (arg1 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg0 += local19;
			arg1 -= local19;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public void method5204() {
		if (this.aBoolean437) {
			return;
		}
		synchronized (this) {
			this.aBoolean437 = true;
			this.notifyAll();
		}
		if (this.aClass9_8 != null) {
			while (this.aClass9_8.anInt368 == 0) {
				Static224.method3441(1L);
			}
			if (this.aClass9_8.anInt368 == 1) {
				try {
					((Thread) this.aClass9_8.anObject2).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass9_8 = null;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)I")
	public int method5206() throws IOException {
		return this.aBoolean437 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "([BIBI)V")
	public void method5207(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean437) {
			return;
		}
		if (this.aBoolean435) {
			this.aBoolean435 = false;
			throw new IOException();
		}
		if (this.aByteArray81 == null) {
			this.aByteArray81 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				this.aByteArray81[this.anInt6250] = arg0[local38];
				this.anInt6250 = (this.anInt6250 + 1) % 5000;
				if (this.anInt6250 == (this.anInt6252 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass9_8 == null) {
				this.aClass9_8 = this.aClass180_4.method4084(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ti", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5204();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)I")
	public int method5208() throws IOException {
		return this.aBoolean437 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V")
	public void method5210() {
		if (!this.aBoolean437) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!ti", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(41) int local41;
					@Pc(52) int local52;
					synchronized (this) {
						if (this.anInt6252 == this.anInt6250) {
							if (this.aBoolean437) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt6252 <= this.anInt6250) {
							local41 = this.anInt6250 - this.anInt6252;
						} else {
							local41 = 5000 - this.anInt6252;
						}
						local52 = this.anInt6252;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray81, local52, local41);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean435 = true;
					}
					this.anInt6252 = (this.anInt6252 + local41) % 5000;
					try {
						if (this.anInt6250 == this.anInt6252) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(97) IOException local97) {
						this.aBoolean435 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream1 != null) {
						this.anOutputStream1.close();
					}
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(121) IOException local121) {
				}
				this.aByteArray81 = null;
				break;
			}
		} catch (@Pc(126) Exception local126) {
			Static158.method2570(local126, null);
		}
	}
}
