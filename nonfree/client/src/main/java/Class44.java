import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class44 implements Runnable {

	@OriginalMember(owner = "client!je", name = "d", descriptor = "Lclient!pe;")
	private Class63 aClass63_2;

	@OriginalMember(owner = "client!je", name = "r", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "I")
	private int anInt2150 = 0;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "I")
	private int anInt2152 = 0;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "Lclient!rf;")
	private final Class74 aClass74_3;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!rf;)V")
	public Class44(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class74 arg1) throws IOException {
		this.aClass74_3 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	public void method1417() {
		if (this.aBoolean108) {
			return;
		}
		synchronized (this) {
			this.aBoolean108 = true;
			this.notifyAll();
		}
		if (this.aClass63_2 != null) {
			while (this.aClass63_2.anInt3324 == 0) {
				Static35.method583(1L);
			}
			if (this.aClass63_2.anInt3324 == 1) {
				try {
					((Thread) this.aClass63_2.anObject3).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass63_2 = null;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)I")
	public int method1418() throws IOException {
		return this.aBoolean108 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([BIBI)V")
	public void method1419(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aBoolean108) {
			return;
		}
		if (this.aBoolean109) {
			this.aBoolean109 = false;
			throw new IOException();
		}
		if (this.aByteArray19 == null) {
			this.aByteArray19 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray19[this.anInt2152] = arg0[local32];
				this.anInt2152 = (this.anInt2152 + 1) % 5000;
				if (this.anInt2152 == (this.anInt2150 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass63_2 == null) {
				this.aClass63_2 = this.aClass74_3.method2484(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(32) int local32;
					@Pc(42) int local42;
					synchronized (this) {
						if (this.anInt2150 == this.anInt2152) {
							if (this.aBoolean108) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						if (this.anInt2152 >= this.anInt2150) {
							local32 = this.anInt2152 - this.anInt2150;
						} else {
							local32 = 5000 - this.anInt2150;
						}
						local42 = this.anInt2150;
					}
					if (local32 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray19, local42, local32);
					} catch (@Pc(59) IOException local59) {
						this.aBoolean109 = true;
					}
					this.anInt2150 = (this.anInt2150 + local32) % 5000;
					try {
						if (this.anInt2150 == this.anInt2152) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(81) IOException local81) {
						this.aBoolean109 = true;
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
				} catch (@Pc(105) IOException local105) {
				}
				this.aByteArray19 = null;
				break;
			}
		} catch (@Pc(110) Exception local110) {
			Static153.method2616(null, local110);
		}
	}

	@OriginalMember(owner = "client!je", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1417();
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)I")
	public int method1420() throws IOException {
		return this.aBoolean108 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IBI[B)V")
	public void method1421(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean108) {
			return;
		}
		while (arg0 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg1 += local19;
			arg0 -= local19;
		}
	}
}
