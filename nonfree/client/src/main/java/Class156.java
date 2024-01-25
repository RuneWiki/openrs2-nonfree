import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class156 implements Runnable {

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "[B")
	private byte[] aByteArray83;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "Lclient!aa;")
	private Class2 aClass2_7;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Z")
	private boolean aBoolean315 = false;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "Z")
	private boolean aBoolean316 = false;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
	private int anInt4754 = 0;

	@OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
	private int anInt4770 = 0;

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "Lclient!ko;")
	private final Class118 aClass118_6;

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ko;)V")
	public Class156(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class118 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass118_6 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([BIII)V")
	public void method4183(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean315) {
			return;
		}
		if (this.aBoolean316) {
			this.aBoolean316 = false;
			throw new IOException();
		}
		if (this.aByteArray83 == null) {
			this.aByteArray83 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
				this.aByteArray83[this.anInt4754] = arg0[local40];
				this.anInt4754 = (this.anInt4754 + 1) % 5000;
				if ((this.anInt4770 + 4900) % 5000 == this.anInt4754) {
					throw new IOException();
				}
			}
			if (this.aClass2_7 == null) {
				this.aClass2_7 = this.aClass118_6.method2712(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(37) int local37;
					@Pc(48) int local48;
					synchronized (this) {
						if (this.anInt4770 == this.anInt4754) {
							if (this.aBoolean315) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt4770 <= this.anInt4754) {
							local37 = this.anInt4754 - this.anInt4770;
						} else {
							local37 = 5000 - this.anInt4770;
						}
						local48 = this.anInt4770;
					}
					if (local37 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray83, local48, local37);
					} catch (@Pc(65) IOException local65) {
						this.aBoolean316 = true;
					}
					this.anInt4770 = (this.anInt4770 + local37) % 5000;
					try {
						if (this.anInt4770 == this.anInt4754) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(86) IOException local86) {
						this.aBoolean316 = true;
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
				} catch (@Pc(110) IOException local110) {
				}
				this.aByteArray83 = null;
				return;
			}
		} catch (@Pc(115) Exception local115) {
			Static38.method554(local115, null);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public void method4186() throws IOException {
		if (!this.aBoolean315 && this.aBoolean316) {
			this.aBoolean316 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!pf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4190();
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)I")
	public int method4187() throws IOException {
		return this.aBoolean315 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[BII)V")
	public void method4189(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean315) {
			return;
		}
		while (arg0 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg0 -= local14;
			arg2 += local14;
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
	public void method4190() {
		if (this.aBoolean315) {
			return;
		}
		synchronized (this) {
			this.aBoolean315 = true;
			this.notifyAll();
		}
		if (this.aClass2_7 != null) {
			while (this.aClass2_7.anInt6 == 0) {
				Static244.method4311(1L);
			}
			if (this.aClass2_7.anInt6 == 1) {
				try {
					((Thread) this.aClass2_7.anObject1).join();
				} catch (@Pc(62) InterruptedException local62) {
				}
			}
		}
		this.aClass2_7 = null;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
	public void method4192() {
		if (!this.aBoolean315) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)I")
	public int method4193() throws IOException {
		return this.aBoolean315 ? 0 : this.anInputStream1.available();
	}
}
