import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class92 implements Runnable {

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "Lclient!ci;")
	private Class55 aClass55_4;

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
	private int anInt2736 = 0;

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
	private int anInt2747 = 0;

	@OriginalMember(owner = "client!eo", name = "o", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!eo", name = "B", descriptor = "Lclient!dj;")
	private final Class71 aClass71_1;

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!eo", name = "u", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!eo", name = "z", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!dj;)V")
	public Class92(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class71 arg1) throws IOException {
		this.aClass71_1 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!eo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2475();
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZII[B)V")
	public void method2468(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean220) {
			return;
		}
		if (this.aBoolean221) {
			this.aBoolean221 = false;
			throw new IOException();
		}
		if (this.aByteArray28 == null) {
			this.aByteArray28 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray28[this.anInt2747] = arg1[local32];
				this.anInt2747 = (this.anInt2747 + 1) % 5000;
				if ((this.anInt2736 + 4900) % 5000 == this.anInt2747) {
					throw new IOException();
				}
			}
			if (this.aClass55_4 == null) {
				this.aClass55_4 = this.aClass71_1.method1988(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
	public void method2469() throws IOException {
		if (!this.aBoolean220 && this.aBoolean221) {
			this.aBoolean221 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "([BIII)V")
	public void method2470(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean220) {
			return;
		}
		while (arg1 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg2 += local18;
			arg1 -= local18;
		}
	}

	@OriginalMember(owner = "client!eo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(39) int local39;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt2747 == this.anInt2736) {
							if (this.aBoolean220) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt2736;
						if (this.anInt2747 < this.anInt2736) {
							local39 = 5000 - this.anInt2736;
						} else {
							local39 = this.anInt2747 - this.anInt2736;
						}
					}
					if (local39 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray28, local24, local39);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean221 = true;
					}
					this.anInt2736 = (this.anInt2736 + local39) % 5000;
					try {
						if (this.anInt2736 == this.anInt2747) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(90) IOException local90) {
						this.aBoolean221 = true;
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
				} catch (@Pc(114) IOException local114) {
				}
				this.aByteArray28 = null;
				break;
			}
		} catch (@Pc(119) Exception local119) {
			Static508.method7541(local119, null);
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
	public void method2471() {
		if (!this.aBoolean220) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)I")
	public int method2473() throws IOException {
		return this.aBoolean220 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)I")
	public int method2474() throws IOException {
		return this.aBoolean220 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)V")
	public void method2475() {
		if (this.aBoolean220) {
			return;
		}
		synchronized (this) {
			this.aBoolean220 = true;
			this.notifyAll();
		}
		if (this.aClass55_4 != null) {
			while (this.aClass55_4.anInt1481 == 0) {
				Static17.method388(1L);
			}
			if (this.aClass55_4.anInt1481 == 1) {
				try {
					((Thread) this.aClass55_4.anObject5).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass55_4 = null;
	}
}
