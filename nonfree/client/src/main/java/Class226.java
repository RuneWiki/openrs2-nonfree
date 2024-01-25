import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class226 implements Runnable {

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "[B")
	private byte[] aByteArray96;

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "Lclient!gj;")
	private Class86 aClass86_10;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "Z")
	private boolean aBoolean460 = false;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
	private int anInt6379 = 0;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
	private int anInt6385 = 0;

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "Z")
	private boolean aBoolean461 = false;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "Lclient!kd;")
	private final Class123 aClass123_5;

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	static {
		new Class62("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!kd;)V")
	public Class226(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class123 arg1) throws IOException {
		this.aClass123_5 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public void method5542() throws IOException {
		if (!this.aBoolean460 && this.aBoolean461) {
			this.aBoolean461 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	public void method5543() {
		if (this.aBoolean460) {
			return;
		}
		synchronized (this) {
			this.aBoolean460 = true;
			this.notifyAll();
		}
		if (this.aClass86_10 != null) {
			while (this.aClass86_10.anInt2590 == 0) {
				Static215.method3855(1L);
			}
			if (this.aClass86_10.anInt2590 == 1) {
				try {
					((Thread) this.aClass86_10.anObject2).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass86_10 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	public void method5544() {
		if (!this.aBoolean460) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!ue", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5543();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "([BIBI)V")
	public void method5546(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean460) {
			return;
		}
		while (arg2 > 0) {
			@Pc(27) int local27 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local27 <= 0) {
				throw new EOFException();
			}
			arg1 += local27;
			arg2 -= local27;
		}
	}

	@OriginalMember(owner = "client!ue", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt6379 == this.anInt6385) {
							if (this.aBoolean460) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt6385;
						if (this.anInt6385 <= this.anInt6379) {
							local44 = this.anInt6379 - this.anInt6385;
						} else {
							local44 = 5000 - this.anInt6385;
						}
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray96, local32, local44);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean461 = true;
					}
					this.anInt6385 = (this.anInt6385 + local44) % 5000;
					try {
						if (this.anInt6385 == this.anInt6379) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean461 = true;
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
				} catch (@Pc(116) IOException local116) {
				}
				this.aByteArray96 = null;
				return;
			}
		} catch (@Pc(121) Exception local121) {
			Static346.method5531(local121, null);
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I")
	public int method5547() throws IOException {
		return this.aBoolean460 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIB[B)V")
	public void method5549(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean460) {
			return;
		}
		if (this.aBoolean461) {
			this.aBoolean461 = false;
			throw new IOException();
		}
		if (this.aByteArray96 == null) {
			this.aByteArray96 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray96[this.anInt6379] = arg1[local32];
				this.anInt6379 = (this.anInt6379 + 1) % 5000;
				if (this.anInt6379 == (this.anInt6385 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass86_10 == null) {
				this.aClass86_10 = this.aClass123_5.method3251(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)I")
	public int method5550() throws IOException {
		return this.aBoolean460 ? 0 : this.anInputStream1.available();
	}
}
