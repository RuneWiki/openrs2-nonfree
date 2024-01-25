import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class329 implements Runnable {

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "[B")
	private byte[] aByteArray117;

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "Lclient!hu;")
	private Class150 aClass150_8;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "Z")
	private boolean aBoolean664 = false;

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "Z")
	private boolean aBoolean665 = false;

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
	private int anInt9479 = 0;

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
	private int anInt9489 = 0;

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "Lclient!td;")
	private final Class333 aClass333_7;

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!sv", name = "x", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
	private final int anInt9491;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!td;I)V")
	public Class329(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class333 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass333_7 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt9491 = arg2;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
	public void method7836() throws IOException {
		if (!this.aBoolean665 && this.aBoolean664) {
			this.aBoolean664 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
	public void method7837() {
		if (!this.aBoolean665) {
			this.anInputStream2 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)I")
	public int method7839() throws IOException {
		return this.aBoolean665 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!sv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7842();
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(B)I")
	public int method7840() throws IOException {
		return this.aBoolean665 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!sv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(52) int local52;
					synchronized (this) {
						if (this.anInt9489 == this.anInt9479) {
							if (this.aBoolean665) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt9489 <= this.anInt9479) {
							local40 = this.anInt9479 - this.anInt9489;
						} else {
							local40 = this.anInt9491 - this.anInt9489;
						}
						local52 = this.anInt9489;
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray117, local52, local40);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean664 = true;
					}
					this.anInt9489 = (this.anInt9489 + local40) % this.anInt9491;
					try {
						if (this.anInt9489 == this.anInt9479) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(96) IOException local96) {
						this.aBoolean664 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream2 != null) {
						this.anInputStream2.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(120) IOException local120) {
				}
				this.aByteArray117 = null;
				break;
			}
		} catch (@Pc(125) Exception local125) {
			Static524.method7532((String) null, local125);
		}
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(B)V")
	public void method7842() {
		if (this.aBoolean665) {
			return;
		}
		synchronized (this) {
			this.aBoolean665 = true;
			this.notifyAll();
		}
		if (this.aClass150_8 != null) {
			while (this.aClass150_8.anInt4247 == 0) {
				Static20.method9254(1L);
			}
			if (this.aClass150_8.anInt4247 == 1) {
				try {
					((Thread) this.aClass150_8.anObject8).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass150_8 = null;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZI[B)V")
	public void method7843(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean665) {
			return;
		}
		while (arg1 > 0) {
			@Pc(20) int local20 = this.anInputStream2.read(arg2, arg0, arg1);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg0 += local20;
			arg1 -= local20;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II[BI)V")
	public void method7846(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean665) {
			return;
		}
		if (this.aBoolean664) {
			this.aBoolean664 = false;
			throw new IOException();
		}
		if (this.aByteArray117 == null) {
			this.aByteArray117 = new byte[this.anInt9491];
		}
		synchronized (this) {
			for (@Pc(41) int local41 = 0; local41 < arg1; local41++) {
				this.aByteArray117[this.anInt9479] = arg0[local41];
				this.anInt9479 = (this.anInt9479 + 1) % this.anInt9491;
				if (this.anInt9479 == (this.anInt9491 + this.anInt9489 - 100) % this.anInt9491) {
					throw new IOException();
				}
			}
			if (this.aClass150_8 == null) {
				this.aClass150_8 = this.aClass333_7.method8151(3, this);
			}
			this.notifyAll();
		}
	}
}
