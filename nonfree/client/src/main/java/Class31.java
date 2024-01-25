import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class31 implements Runnable {

	@OriginalMember(owner = "client!caa", name = "o", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!caa", name = "y", descriptor = "Lclient!bca;")
	private Class20 aClass20_6;

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "I")
	private int anInt933 = 0;

	@OriginalMember(owner = "client!caa", name = "m", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!caa", name = "s", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!caa", name = "u", descriptor = "I")
	private int anInt944 = 0;

	@OriginalMember(owner = "client!caa", name = "l", descriptor = "Lclient!uf;")
	private final Class283 aClass283_1;

	@OriginalMember(owner = "client!caa", name = "t", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!caa", name = "v", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!caa", name = "x", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!uf;)V")
	public Class31(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class283 arg1) throws IOException {
		this.aClass283_1 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)V")
	public void method949() {
		if (!this.aBoolean55) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIZ[B)V")
	public void method950(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean55) {
			return;
		}
		if (this.aBoolean56) {
			this.aBoolean56 = false;
			throw new IOException();
		}
		if (this.aByteArray32 == null) {
			this.aByteArray32 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray32[this.anInt944] = arg1[local32];
				this.anInt944 = (this.anInt944 + 1) % 5000;
				if ((this.anInt933 + 4900) % 5000 == this.anInt944) {
					throw new IOException();
				}
			}
			if (this.aClass20_6 == null) {
				this.aClass20_6 = this.aClass283_1.method7164(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)I")
	public int method952() throws IOException {
		return this.aBoolean55 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "([BIII)V")
	public void method954(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean55) {
			return;
		}
		while (arg2 > 0) {
			@Pc(26) int local26 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local26 <= 0) {
				throw new EOFException();
			}
			arg2 -= local26;
			arg1 += local26;
		}
	}

	@OriginalMember(owner = "client!caa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method959();
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(Z)V")
	public void method958() throws IOException {
		if (!this.aBoolean55 && this.aBoolean56) {
			this.aBoolean56 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(B)V")
	public void method959() {
		if (this.aBoolean55) {
			return;
		}
		synchronized (this) {
			this.aBoolean55 = true;
			this.notifyAll();
		}
		if (this.aClass20_6 != null) {
			while (this.aClass20_6.anInt593 == 0) {
				Static379.method5233(1L);
			}
			if (this.aClass20_6.anInt593 == 1) {
				try {
					((Thread) this.aClass20_6.anObject2).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass20_6 = null;
	}

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "(I)I")
	public int method960() throws IOException {
		return this.aBoolean55 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!caa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(37) int local37;
					@Pc(48) int local48;
					synchronized (this) {
						if (this.anInt933 == this.anInt944) {
							if (this.aBoolean55) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt933 <= this.anInt944) {
							local37 = this.anInt944 - this.anInt933;
						} else {
							local37 = 5000 - this.anInt933;
						}
						local48 = this.anInt933;
					}
					if (local37 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray32, local48, local37);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean56 = true;
					}
					this.anInt933 = (local37 + this.anInt933) % 5000;
					try {
						if (this.anInt944 == this.anInt933) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean56 = true;
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
				} catch (@Pc(113) IOException local113) {
				}
				this.aByteArray32 = null;
				return;
			}
		} catch (@Pc(118) Exception local118) {
			Static459.method6984(null, local118);
		}
	}
}
