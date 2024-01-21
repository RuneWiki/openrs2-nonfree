import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class77 implements Runnable {

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "Lclient!le;")
	private Class50 aClass50_8;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	private int anInt2705 = 0;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "Z")
	private boolean aBoolean122 = false;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
	private int anInt2712 = 0;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!tc;")
	private final Class74 aClass74_3;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!tc;)V")
	public Class77(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class74 arg1) throws IOException {
		this.aClass74_3 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I")
	public int method1902() throws IOException {
		return this.aBoolean121 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!uc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1909();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZII[B)V")
	public void method1904(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean121) {
			return;
		}
		if (this.aBoolean122) {
			this.aBoolean122 = false;
			throw new IOException();
		}
		if (this.aByteArray38 == null) {
			this.aByteArray38 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray38[this.anInt2712] = arg1[local38];
				this.anInt2712 = (this.anInt2712 + 1) % 5000;
				if (this.anInt2712 == (this.anInt2705 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass50_8 == null) {
				this.aClass50_8 = this.aClass74_3.method1821(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI[BI)V")
	public void method1905(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean121) {
			return;
		}
		while (arg2 > 0) {
			@Pc(23) int local23 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg2 -= local23;
			arg0 += local23;
		}
	}

	@OriginalMember(owner = "client!uc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(50) int local50;
					synchronized (this) {
						if (this.anInt2712 == this.anInt2705) {
							if (this.aBoolean121) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt2705 <= this.anInt2712) {
							local40 = this.anInt2712 - this.anInt2705;
						} else {
							local40 = 5000 - this.anInt2705;
						}
						local50 = this.anInt2705;
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray38, local50, local40);
					} catch (@Pc(70) IOException local70) {
						this.aBoolean122 = true;
					}
					this.anInt2705 = (local40 + this.anInt2705) % 5000;
					try {
						if (this.anInt2712 == this.anInt2705) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(91) IOException local91) {
						this.aBoolean122 = true;
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
				} catch (@Pc(115) IOException local115) {
				}
				this.aByteArray38 = null;
				return;
			}
		} catch (@Pc(120) Exception local120) {
			Static120.method1980(null, local120);
		}
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)I")
	public int method1907() throws IOException {
		return this.aBoolean121 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V")
	public void method1909() {
		if (this.aBoolean121) {
			return;
		}
		synchronized (this) {
			this.aBoolean121 = true;
			this.notifyAll();
		}
		if (this.aClass50_8 != null) {
			while (this.aClass50_8.anInt1485 == 0) {
				Static53.method1782(1L);
			}
			if (this.aClass50_8.anInt1485 == 1) {
				try {
					((Thread) this.aClass50_8.anObject4).join();
				} catch (@Pc(50) InterruptedException local50) {
				}
			}
		}
		this.aClass50_8 = null;
	}
}
