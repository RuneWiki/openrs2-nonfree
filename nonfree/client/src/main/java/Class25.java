import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class25 implements Runnable {

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "Lclient!gm;")
	private Class87 aClass87_1;

	@OriginalMember(owner = "client!bj", name = "u", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
	private int anInt477 = 0;

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "Z")
	private boolean aBoolean22 = false;

	@OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
	private int anInt481 = 0;

	@OriginalMember(owner = "client!bj", name = "o", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!bj", name = "t", descriptor = "Lclient!ul;")
	private final Class255 aClass255_1;

	@OriginalMember(owner = "client!bj", name = "l", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!bj", name = "m", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ul;)V")
	public Class25(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class255 arg1) throws IOException {
		this.aClass255_1 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket2.getInputStream();
		this.anOutputStream1 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!bj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method408();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[BII)V")
	public void method403(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean22) {
			return;
		}
		if (this.aBoolean23) {
			this.aBoolean23 = false;
			throw new IOException();
		}
		if (this.aByteArray2 == null) {
			this.aByteArray2 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
				this.aByteArray2[this.anInt477] = arg0[local37];
				this.anInt477 = (this.anInt477 + 1) % 5000;
				if ((this.anInt481 + 4900) % 5000 == this.anInt477) {
					throw new IOException();
				}
			}
			if (this.aClass87_1 == null) {
				this.aClass87_1 = this.aClass255_1.method5820(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I")
	public int method404() throws IOException {
		return this.aBoolean22 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
	public void method405() throws IOException {
		if (!this.aBoolean22 && this.aBoolean23) {
			this.aBoolean23 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I[BII)V")
	public void method406(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean22) {
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

	@OriginalMember(owner = "client!bj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(34) int local34;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt477 == this.anInt481) {
							if (this.aBoolean22) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt481;
						if (this.anInt481 > this.anInt477) {
							local34 = 5000 - this.anInt481;
						} else {
							local34 = this.anInt477 - this.anInt481;
						}
					}
					if (local34 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray2, local24, local34);
					} catch (@Pc(63) IOException local63) {
						this.aBoolean23 = true;
					}
					this.anInt481 = (this.anInt481 + local34) % 5000;
					try {
						if (this.anInt477 == this.anInt481) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(85) IOException local85) {
						this.aBoolean23 = true;
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
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(109) IOException local109) {
				}
				this.aByteArray2 = null;
				break;
			}
		} catch (@Pc(114) Exception local114) {
			Static417.method5814(local114, null);
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
	public void method407() {
		if (!this.aBoolean22) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V")
	public void method408() {
		if (this.aBoolean22) {
			return;
		}
		synchronized (this) {
			this.aBoolean22 = true;
			this.notifyAll();
		}
		if (this.aClass87_1 != null) {
			while (this.aClass87_1.anInt2679 == 0) {
				Static77.method1653(1L);
			}
			if (this.aClass87_1.anInt2679 == 1) {
				try {
					((Thread) this.aClass87_1.anObject3).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass87_1 = null;
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)I")
	public int method409() throws IOException {
		return this.aBoolean22 ? 0 : this.anInputStream1.available();
	}
}
