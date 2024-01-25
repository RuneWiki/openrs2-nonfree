import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class152 implements Runnable {

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!kq", name = "q", descriptor = "Lclient!cw;")
	private Class45 aClass45_4;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "Z")
	private boolean aBoolean272 = false;

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
	private int anInt3675 = 0;

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
	private int anInt3674 = 0;

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "Z")
	private boolean aBoolean273 = false;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "Lclient!pc;")
	private final Class196 aClass196_7;

	@OriginalMember(owner = "client!kq", name = "r", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!kq", name = "v", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!pc;)V")
	public Class152(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class196 arg1) throws IOException {
		this.aClass196_7 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)I")
	public int method2921() throws IOException {
		return this.aBoolean272 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)V")
	public void method2922() {
		if (!this.aBoolean272) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II[BI)V")
	public void method2923(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean272) {
			return;
		}
		while (arg0 > 0) {
			@Pc(20) int local20 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg0 -= local20;
			arg2 += local20;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	public void method2924() {
		if (this.aBoolean272) {
			return;
		}
		synchronized (this) {
			this.aBoolean272 = true;
			this.notifyAll();
		}
		if (this.aClass45_4 != null) {
			while (this.aClass45_4.anInt1129 == 0) {
				Static435.method5777(1L);
			}
			if (this.aClass45_4.anInt1129 == 1) {
				try {
					((Thread) this.aClass45_4.anObject5).join();
				} catch (@Pc(51) InterruptedException local51) {
				}
			}
		}
		this.aClass45_4 = null;
	}

	@OriginalMember(owner = "client!kq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(44) int local44;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt3675 == this.anInt3674) {
							if (this.aBoolean272) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt3674;
						if (this.anInt3674 <= this.anInt3675) {
							local44 = this.anInt3675 - this.anInt3674;
						} else {
							local44 = 5000 - this.anInt3674;
						}
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray41, local28, local44);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean273 = true;
					}
					this.anInt3674 = (local44 + this.anInt3674) % 5000;
					try {
						if (this.anInt3675 == this.anInt3674) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(94) IOException local94) {
						this.aBoolean273 = true;
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
				} catch (@Pc(118) IOException local118) {
				}
				this.aByteArray41 = null;
				break;
			}
		} catch (@Pc(123) Exception local123) {
			Static33.method448(local123, null);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)I")
	public int method2925() throws IOException {
		return this.aBoolean272 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBI[B)V")
	public void method2926(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean272) {
			return;
		}
		if (this.aBoolean273) {
			this.aBoolean273 = false;
			throw new IOException();
		}
		if (this.aByteArray41 == null) {
			this.aByteArray41 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg0; local36++) {
				this.aByteArray41[this.anInt3675] = arg1[local36];
				this.anInt3675 = (this.anInt3675 + 1) % 5000;
				if (this.anInt3675 == (this.anInt3674 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass45_4 == null) {
				this.aClass45_4 = this.aClass196_7.method3896(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
	public void method2928() throws IOException {
		if (!this.aBoolean272 && this.aBoolean273) {
			this.aBoolean273 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!kq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2924();
	}
}
