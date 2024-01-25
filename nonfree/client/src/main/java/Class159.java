import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class159 implements Runnable {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "Lclient!vd;")
	private Class205 aClass205_9;

	@OriginalMember(owner = "client!ol", name = "z", descriptor = "[B")
	private byte[] aByteArray126;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
	private int anInt4552 = 0;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
	private int anInt4549 = 0;

	@OriginalMember(owner = "client!ol", name = "v", descriptor = "Z")
	private boolean aBoolean302 = false;

	@OriginalMember(owner = "client!ol", name = "A", descriptor = "Z")
	private boolean aBoolean303 = false;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "Lclient!ap;")
	private final Class15 aClass15_5;

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ap;)V")
	public Class159(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class15 arg1) throws IOException {
		this.aClass15_5 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ol", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(36) int local36;
					@Pc(47) int local47;
					synchronized (this) {
						if (this.anInt4549 == this.anInt4552) {
							if (this.aBoolean302) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt4549 > this.anInt4552) {
							local36 = 5000 - this.anInt4549;
						} else {
							local36 = this.anInt4552 - this.anInt4549;
						}
						local47 = this.anInt4549;
					}
					if (local36 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray126, local47, local36);
					} catch (@Pc(67) IOException local67) {
						this.aBoolean303 = true;
					}
					this.anInt4549 = (local36 + this.anInt4549) % 5000;
					try {
						if (this.anInt4552 == this.anInt4549) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean303 = true;
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
				this.aByteArray126 = null;
				break;
			}
		} catch (@Pc(121) Exception local121) {
			Static47.method1149(local121, null);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	public void method4077() {
		if (!this.aBoolean302) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	public void method4079() {
		if (this.aBoolean302) {
			return;
		}
		synchronized (this) {
			this.aBoolean302 = true;
			this.notifyAll();
		}
		if (this.aClass205_9 != null) {
			while (this.aClass205_9.anInt6370 == 0) {
				Static15.method5425(1L);
			}
			if (this.aClass205_9.anInt6370 == 1) {
				try {
					((Thread) this.aClass205_9.anObject7).join();
				} catch (@Pc(53) InterruptedException local53) {
				}
			}
		}
		this.aClass205_9 = null;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([BIII)V")
	public void method4082(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean302) {
			return;
		}
		if (this.aBoolean303) {
			this.aBoolean303 = false;
			throw new IOException();
		}
		if (this.aByteArray126 == null) {
			this.aByteArray126 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
				this.aByteArray126[this.anInt4552] = arg0[local39];
				this.anInt4552 = (this.anInt4552 + 1) % 5000;
				if (this.anInt4552 == (this.anInt4549 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass205_9 == null) {
				this.aClass205_9 = this.aClass15_5.method287(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)I")
	public int method4083() throws IOException {
		return this.aBoolean302 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[BII)V")
	public void method4084(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean302) {
			return;
		}
		while (arg1 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg1 -= local14;
			arg2 += local14;
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
	public void method4085() throws IOException {
		if (!this.aBoolean302 && this.aBoolean303) {
			this.aBoolean303 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)I")
	public int method4086() throws IOException {
		return this.aBoolean302 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ol", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4079();
	}
}
