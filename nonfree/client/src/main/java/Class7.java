import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class7 implements Runnable {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!aj;")
	private Class10 aClass10_1;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
	private int anInt125 = 0;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
	private int anInt132 = 0;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "Z")
	private boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ag", name = "A", descriptor = "Z")
	private boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ag", name = "z", descriptor = "Lclient!nf;")
	private Class117 aClass117_1;

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!nf;)V")
	public Class7(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class117 arg1) throws IOException {
		this.aClass117_1 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public void method101() throws IOException {
		if (!this.aBoolean6 && this.aBoolean7) {
			this.aBoolean7 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([BIIB)V")
	public void method102(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean6) {
			return;
		}
		while (arg2 > 0) {
			@Pc(23) int local23 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg1 += local23;
			arg2 -= local23;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)I")
	public int method103() throws IOException {
		return this.aBoolean6 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)I")
	public int method104() throws IOException {
		return this.aBoolean6 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
	public void method105() {
		if (this.aBoolean6) {
			return;
		}
		synchronized (this) {
			this.aBoolean6 = true;
			this.notifyAll();
		}
		if (this.aClass10_1 != null) {
			while (this.aClass10_1.anInt151 == 0) {
				Static202.method3246(1L);
			}
			if (this.aClass10_1.anInt151 == 1) {
				try {
					((Thread) this.aClass10_1.anObject1).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass10_1 = null;
	}

	@OriginalMember(owner = "client!ag", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method105();
	}

	@OriginalMember(owner = "client!ag", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				@Pc(33) int var1;
				@Pc(44) int var2;
				label89: {
					synchronized (this) {
						label90: {
							if (this.anInt132 == this.anInt125) {
								if (this.aBoolean6) {
									break label90;
								}
								try {
									this.wait();
								} catch (@Pc(22) InterruptedException local22) {
								}
							}
							if (this.anInt132 < this.anInt125) {
								var1 = 5000 - this.anInt125;
							} else {
								var1 = this.anInt132 - this.anInt125;
							}
							var2 = this.anInt125;
							break label89;
						}
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
					this.aByteArray1 = null;
					break;
				}
				if (var1 > 0) {
					try {
						this.anOutputStream1.write(this.aByteArray1, var2, var1);
					} catch (@Pc(67) IOException local67) {
						this.aBoolean7 = true;
					}
					this.anInt125 = (this.anInt125 + var1) % 5000;
					try {
						if (this.anInt132 == this.anInt125) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean7 = true;
					}
				}
			}
		} catch (@Pc(121) Exception local121) {
			Static195.method3178(null, local121);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I[BII)V")
	public void method108(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean6) {
			return;
		}
		if (this.aBoolean7) {
			this.aBoolean7 = false;
			throw new IOException();
		}
		if (this.aByteArray1 == null) {
			this.aByteArray1 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(35) int local35 = 0; local35 < arg1; local35++) {
				this.aByteArray1[this.anInt132] = arg0[local35];
				this.anInt132 = (this.anInt132 + 1) % 5000;
				if ((this.anInt125 + 4900) % 5000 == this.anInt132) {
					throw new IOException();
				}
			}
			if (this.aClass10_1 == null) {
				this.aClass10_1 = this.aClass117_1.method3000(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(B)V")
	public void method111() {
		if (!this.aBoolean6) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}
}
