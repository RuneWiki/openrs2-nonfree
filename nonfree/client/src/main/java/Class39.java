import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class39 implements Runnable {

	@OriginalMember(owner = "client!he", name = "h", descriptor = "Lclient!mb;")
	private Class65 aClass65_4;

	@OriginalMember(owner = "client!he", name = "w", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!he", name = "t", descriptor = "I")
	private int anInt1564 = 0;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "I")
	private int anInt1560 = 0;

	@OriginalMember(owner = "client!he", name = "v", descriptor = "Lclient!bi;")
	private final Class12 aClass12_3;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!he", name = "x", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!bi;)V")
	public Class39(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class12 arg1) throws IOException {
		this.aClass12_3 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)I")
	public int method1170() throws IOException {
		return this.aBoolean81 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!he", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt1560 == this.anInt1564) {
							if (this.aBoolean81) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt1564;
						if (this.anInt1564 > this.anInt1560) {
							local43 = 5000 - this.anInt1564;
						} else {
							local43 = this.anInt1560 - this.anInt1564;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray19, local28, local43);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean80 = true;
					}
					this.anInt1564 = (this.anInt1564 + local43) % 5000;
					try {
						if (this.anInt1564 == this.anInt1560) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean80 = true;
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
				} catch (@Pc(117) IOException local117) {
				}
				this.aByteArray19 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static51.method890(local122, null);
		}
	}

	@OriginalMember(owner = "client!he", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1175();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)I")
	public int method1172() throws IOException {
		return this.aBoolean81 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III[B)V")
	public void method1173(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean81) {
			return;
		}
		while (arg0 > 0) {
			@Pc(20) int local20 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg1 += local20;
			arg0 -= local20;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
	public void method1175() {
		if (this.aBoolean81) {
			return;
		}
		synchronized (this) {
			this.aBoolean81 = true;
			this.notifyAll();
		}
		if (this.aClass65_4 != null) {
			while (this.aClass65_4.anInt2446 == 0) {
				Static210.method739(1L);
			}
			if (this.aClass65_4.anInt2446 == 1) {
				try {
					((Thread) this.aClass65_4.anObject3).join();
				} catch (@Pc(57) InterruptedException local57) {
				}
			}
		}
		this.aClass65_4 = null;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(III[B)V")
	public void method1176(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean81) {
			return;
		}
		if (this.aBoolean80) {
			this.aBoolean80 = false;
			throw new IOException();
		}
		if (this.aByteArray19 == null) {
			this.aByteArray19 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray19[this.anInt1560] = arg1[local32];
				this.anInt1560 = (this.anInt1560 + 1) % 5000;
				if (this.anInt1560 == (this.anInt1564 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass65_4 == null) {
				this.aClass65_4 = this.aClass12_3.method297(3, this);
			}
			this.notifyAll();
		}
	}
}
