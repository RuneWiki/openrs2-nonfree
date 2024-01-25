import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class301 implements Runnable {

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "Lclient!ei;")
	private Class83 aClass83_8;

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "[B")
	private byte[] aByteArray120;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "Z")
	private boolean aBoolean634 = false;

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
	private int anInt8758 = 0;

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
	private int anInt8759 = 0;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "Z")
	private boolean aBoolean633 = false;

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "Lclient!ae;")
	private final Class9 aClass9_22;

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ae;)V")
	public Class301(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class9 arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aClass9_22 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II[BZ)V")
	public void method7099(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean633) {
			return;
		}
		if (this.aBoolean634) {
			this.aBoolean634 = false;
			throw new IOException();
		}
		if (this.aByteArray120 == null) {
			this.aByteArray120 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray120[this.anInt8758] = arg1[local32];
				this.anInt8758 = (this.anInt8758 + 1) % 5000;
				if (this.anInt8758 == (this.anInt8759 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass83_8 == null) {
				this.aClass83_8 = this.aClass9_22.method282(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	public void method7100() throws IOException {
		if (!this.aBoolean633 && this.aBoolean634) {
			this.aBoolean634 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public void method7101() {
		if (this.aBoolean633) {
			return;
		}
		synchronized (this) {
			this.aBoolean633 = true;
			this.notifyAll();
		}
		if (this.aClass83_8 != null) {
			while (this.aClass83_8.anInt2495 == 0) {
				Static213.method3465(1L);
			}
			if (this.aClass83_8.anInt2495 == 1) {
				try {
					((Thread) this.aClass83_8.anObject8).join();
				} catch (@Pc(55) InterruptedException local55) {
				}
			}
		}
		this.aClass83_8 = null;
	}

	@OriginalMember(owner = "client!vi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7101();
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)I")
	public int method7102() throws IOException {
		return this.aBoolean633 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)I")
	public int method7103() throws IOException {
		return this.aBoolean633 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III[B)V")
	public void method7104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean633) {
			return;
		}
		while (arg0 > 0) {
			@Pc(14) int local14 = this.anInputStream2.read(arg2, arg1, arg0);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg0 -= local14;
			arg1 += local14;
		}
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V")
	public void method7105() {
		if (!this.aBoolean633) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!vi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt8758 == this.anInt8759) {
							if (this.aBoolean633) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt8759;
						if (this.anInt8759 <= this.anInt8758) {
							local40 = this.anInt8758 - this.anInt8759;
						} else {
							local40 = 5000 - this.anInt8759;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray120, local28, local40);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean634 = true;
					}
					this.anInt8759 = (this.anInt8759 + local40) % 5000;
					try {
						if (this.anInt8758 == this.anInt8759) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(90) IOException local90) {
						this.aBoolean634 = true;
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
				} catch (@Pc(114) IOException local114) {
				}
				this.aByteArray120 = null;
				break;
			}
		} catch (@Pc(119) Exception local119) {
			Static370.method6434(null, local119);
		}
	}
}
