import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class43 implements Runnable {

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "Lclient!ea;")
	private Class18 aClass18_5;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
	private int anInt2755 = 0;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	private int anInt2758 = 0;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!kg", name = "y", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "Lclient!gg;")
	private final Class32 aClass32_4;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!gg;)V")
	public Class43(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class32 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass32_4 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I")
	public int method2041() throws IOException {
		return this.aBoolean110 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
	public void method2042() {
		if (this.aBoolean110) {
			return;
		}
		synchronized (this) {
			this.aBoolean110 = true;
			this.notifyAll();
		}
		if (this.aClass18_5 != null) {
			while (this.aClass18_5.anInt1403 == 0) {
				Static24.method517(1L);
			}
			if (this.aClass18_5.anInt1403 == 1) {
				try {
					((Thread) this.aClass18_5.anObject2).join();
				} catch (@Pc(57) InterruptedException local57) {
				}
			}
		}
		this.aClass18_5 = null;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)I")
	public int method2043() throws IOException {
		return this.aBoolean110 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([BIBI)V")
	public void method2045(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aBoolean110) {
			return;
		}
		if (this.aBoolean111) {
			this.aBoolean111 = false;
			throw new IOException();
		}
		if (this.aByteArray38 == null) {
			this.aByteArray38 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				this.aByteArray38[this.anInt2758] = arg0[local38];
				this.anInt2758 = (this.anInt2758 + 1) % 5000;
				if (this.anInt2758 == (this.anInt2755 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass18_5 == null) {
				this.aClass18_5 = this.aClass32_4.method1483(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!kg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(56) int local56;
					synchronized (this) {
						if (this.anInt2755 == this.anInt2758) {
							if (this.aBoolean110) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt2758 < this.anInt2755) {
							local44 = 5000 - this.anInt2755;
						} else {
							local44 = this.anInt2758 - this.anInt2755;
						}
						local56 = this.anInt2755;
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray38, local56, local44);
					} catch (@Pc(73) IOException local73) {
						this.aBoolean111 = true;
					}
					this.anInt2755 = (this.anInt2755 + local44) % 5000;
					try {
						if (this.anInt2758 == this.anInt2755) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(99) IOException local99) {
						this.aBoolean111 = true;
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
				} catch (@Pc(123) IOException local123) {
				}
				this.aByteArray38 = null;
				return;
			}
		} catch (@Pc(128) Exception local128) {
			Static141.method2762(local128, null);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZI[B)V")
	public void method2047(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean110) {
			return;
		}
		while (arg1 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg0 += local14;
			arg1 -= local14;
		}
	}

	@OriginalMember(owner = "client!kg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2042();
	}
}
