import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class221 implements Runnable {

	@OriginalMember(owner = "client!mea", name = "p", descriptor = "[B")
	private byte[] aByteArray66;

	@OriginalMember(owner = "client!mea", name = "t", descriptor = "Lclient!pga;")
	private Class260 aClass260_8;

	@OriginalMember(owner = "client!mea", name = "g", descriptor = "Z")
	private boolean aBoolean439 = false;

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "I")
	private int anInt5427 = 0;

	@OriginalMember(owner = "client!mea", name = "j", descriptor = "I")
	private int anInt5432 = 0;

	@OriginalMember(owner = "client!mea", name = "s", descriptor = "Z")
	private boolean aBoolean440 = false;

	@OriginalMember(owner = "client!mea", name = "k", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!mea", name = "l", descriptor = "Lclient!ft;")
	private final Class109 aClass109_8;

	@OriginalMember(owner = "client!mea", name = "u", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!mea", name = "i", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ft;)V")
	public Class221(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class109 arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aClass109_8 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I[BII)V")
	public void method4413(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean440) {
			return;
		}
		while (arg1 > 0) {
			@Pc(14) int local14 = this.anInputStream2.read(arg0, arg2, arg1);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg1 -= local14;
			arg2 += local14;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "([BIII)V")
	public void method4414(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean440) {
			return;
		}
		if (this.aBoolean439) {
			this.aBoolean439 = false;
			throw new IOException();
		}
		if (this.aByteArray66 == null) {
			this.aByteArray66 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
				this.aByteArray66[this.anInt5432] = arg0[local40];
				this.anInt5432 = (this.anInt5432 + 1) % 5000;
				if ((this.anInt5427 + 4900) % 5000 == this.anInt5432) {
					throw new IOException();
				}
			}
			if (this.aClass260_8 == null) {
				this.aClass260_8 = this.aClass109_8.method2177(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V")
	public void method4415() throws IOException {
		if (!this.aBoolean440 && this.aBoolean439) {
			this.aBoolean439 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!mea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4421();
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)V")
	public void method4417() {
		if (!this.aBoolean440) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "(I)I")
	public int method4418() throws IOException {
		return this.aBoolean440 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!mea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(41) int local41;
					@Pc(52) int local52;
					synchronized (this) {
						if (this.anInt5427 == this.anInt5432) {
							if (this.aBoolean440) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt5432 >= this.anInt5427) {
							local41 = this.anInt5432 - this.anInt5427;
						} else {
							local41 = 5000 - this.anInt5427;
						}
						local52 = this.anInt5427;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray66, local52, local41);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean439 = true;
					}
					this.anInt5427 = (this.anInt5427 + local41) % 5000;
					try {
						if (this.anInt5432 == this.anInt5427) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(97) IOException local97) {
						this.aBoolean439 = true;
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
				} catch (@Pc(121) IOException local121) {
				}
				this.aByteArray66 = null;
				return;
			}
		} catch (@Pc(126) Exception local126) {
			Static345.method4708(local126, null);
		}
	}

	@OriginalMember(owner = "client!mea", name = "e", descriptor = "(I)I")
	public int method4420() throws IOException {
		return this.aBoolean440 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!mea", name = "f", descriptor = "(I)V")
	public void method4421() {
		if (this.aBoolean440) {
			return;
		}
		synchronized (this) {
			this.aBoolean440 = true;
			this.notifyAll();
		}
		if (this.aClass260_8 != null) {
			while (this.aClass260_8.anInt7041 == 0) {
				Static391.method5400(1L);
			}
			if (this.aClass260_8.anInt7041 == 1) {
				try {
					((Thread) this.aClass260_8.anObject16).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass260_8 = null;
	}
}
