import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class43 implements Runnable {

	@OriginalMember(owner = "client!k", name = "q", descriptor = "Lclient!ca;")
	private Class11 aClass11_6;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "I")
	private int anInt1920 = 0;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "I")
	private int anInt1922 = 0;

	@OriginalMember(owner = "client!k", name = "n", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "Lclient!ih;")
	private final Class36 aClass36_3;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ih;)V")
	public Class43(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class36 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass36_3 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)I")
	public int method1235() throws IOException {
		return this.aBoolean74 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public void method1236() {
		if (this.aBoolean74) {
			return;
		}
		synchronized (this) {
			this.aBoolean74 = true;
			this.notifyAll();
		}
		if (this.aClass11_6 != null) {
			while (this.aClass11_6.anInt467 == 0) {
				Static155.method2675(1L);
			}
			if (this.aClass11_6.anInt467 == 1) {
				try {
					((Thread) this.aClass11_6.anObject2).join();
				} catch (@Pc(59) InterruptedException local59) {
				}
			}
		}
		this.aClass11_6 = null;
	}

	@OriginalMember(owner = "client!k", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(35) int local35;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt1922 == this.anInt1920) {
							if (this.aBoolean74) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt1920;
						if (this.anInt1922 < this.anInt1920) {
							local35 = 5000 - this.anInt1920;
						} else {
							local35 = this.anInt1922 - this.anInt1920;
						}
					}
					if (local35 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray12, local24, local35);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean75 = true;
					}
					this.anInt1920 = (this.anInt1920 + local35) % 5000;
					try {
						if (this.anInt1922 == this.anInt1920) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(85) IOException local85) {
						this.aBoolean75 = true;
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
				} catch (@Pc(109) IOException local109) {
				}
				this.aByteArray12 = null;
				break;
			}
		} catch (@Pc(114) Exception local114) {
			Static97.method1572(local114, null);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)I")
	public int method1238() throws IOException {
		return this.aBoolean74 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1236();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI[BI)V")
	public void method1240(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean74) {
			return;
		}
		while (arg0 > 0) {
			@Pc(22) int local22 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local22 <= 0) {
				throw new EOFException();
			}
			arg2 += local22;
			arg0 -= local22;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I[BII)V")
	public void method1241(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (this.aBoolean74) {
			return;
		}
		if (this.aBoolean75) {
			this.aBoolean75 = false;
			throw new IOException();
		}
		if (this.aByteArray12 == null) {
			this.aByteArray12 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
				this.aByteArray12[this.anInt1922] = arg1[local37];
				this.anInt1922 = (this.anInt1922 + 1) % 5000;
				if (this.anInt1922 == (this.anInt1920 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass11_6 == null) {
				this.aClass11_6 = this.aClass36_3.method1109(3, this);
			}
			this.notifyAll();
		}
	}
}
