import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class75 implements Runnable {

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "Lclient!fc;")
	private Class24 aClass24_7;

	@OriginalMember(owner = "client!uf", name = "M", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "Z")
	private boolean aBoolean153 = false;

	@OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
	private int anInt2630 = 0;

	@OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
	private int anInt2628 = 0;

	@OriginalMember(owner = "client!uf", name = "H", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!uf", name = "B", descriptor = "Lclient!cf;")
	private final Class14 aClass14_4;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!uf", name = "K", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!cf;)V")
	public Class75(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class14 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass14_4 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!uf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1842();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public void method1842() {
		if (this.aBoolean152) {
			return;
		}
		synchronized (this) {
			this.aBoolean152 = true;
			this.notifyAll();
		}
		if (this.aClass24_7 != null) {
			while (this.aClass24_7.anInt814 == 0) {
				Static6.method84(1L);
			}
			if (this.aClass24_7.anInt814 == 1) {
				try {
					((Thread) this.aClass24_7.anObject10).join();
				} catch (@Pc(53) InterruptedException local53) {
				}
			}
		}
		this.aClass24_7 = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[BIB)V")
	public void method1843(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean152) {
			return;
		}
		while (arg2 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg2 -= local14;
			arg0 += local14;
		}
	}

	@OriginalMember(owner = "client!uf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(37) int local37;
					@Pc(48) int local48;
					synchronized (this) {
						if (this.anInt2630 == this.anInt2628) {
							if (this.aBoolean152) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt2628 <= this.anInt2630) {
							local37 = this.anInt2630 - this.anInt2628;
						} else {
							local37 = 5000 - this.anInt2628;
						}
						local48 = this.anInt2628;
					}
					if (local37 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray70, local48, local37);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean153 = true;
					}
					this.anInt2628 = (this.anInt2628 + local37) % 5000;
					try {
						if (this.anInt2630 == this.anInt2628) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean153 = true;
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
				this.aByteArray70 = null;
				return;
			}
		} catch (@Pc(118) Exception local118) {
			Static102.method1593(null, local118);
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)I")
	public int method1844() throws IOException {
		return this.aBoolean152 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)I")
	public int method1848() throws IOException {
		return this.aBoolean152 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III[B)V")
	public void method1849(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean152) {
			return;
		}
		if (this.aBoolean153) {
			this.aBoolean153 = false;
			throw new IOException();
		}
		if (this.aByteArray70 == null) {
			this.aByteArray70 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg0; local36++) {
				this.aByteArray70[this.anInt2630] = arg1[local36];
				this.anInt2630 = (this.anInt2630 + 1) % 5000;
				if ((this.anInt2628 + 4900) % 5000 == this.anInt2630) {
					throw new IOException();
				}
			}
			if (this.aClass24_7 == null) {
				this.aClass24_7 = this.aClass14_4.method192(this, 3);
			}
			this.notifyAll();
		}
	}
}
