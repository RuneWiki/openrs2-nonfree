import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 implements Runnable {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!hh;")
	private Class108 aClass108_1;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Z")
	private boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "Z")
	private boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
	private int anInt157 = 0;

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
	private int anInt160 = 0;

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!hu;")
	private final Class114 aClass114_1;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!hu;)V")
	public Class5(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class114 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass114_1 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ad", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method119();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public void method115() {
		if (!this.aBoolean7) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public void method119() {
		if (this.aBoolean7) {
			return;
		}
		synchronized (this) {
			this.aBoolean7 = true;
			this.notifyAll();
		}
		if (this.aClass108_1 != null) {
			while (this.aClass108_1.anInt2803 == 0) {
				Static20.method1515(1L);
			}
			if (this.aClass108_1.anInt2803 == 1) {
				try {
					((Thread) this.aClass108_1.anObject4).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass108_1 = null;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)I")
	public int method120() throws IOException {
		return this.aBoolean7 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ad", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(39) int local39;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt157 == this.anInt160) {
							if (this.aBoolean7) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt157;
						if (this.anInt160 >= this.anInt157) {
							local39 = this.anInt160 - this.anInt157;
						} else {
							local39 = 5000 - this.anInt157;
						}
					}
					if (local39 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray3, local24, local39);
					} catch (@Pc(67) IOException local67) {
						this.aBoolean8 = true;
					}
					this.anInt157 = (this.anInt157 + local39) % 5000;
					try {
						if (this.anInt160 == this.anInt157) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(88) IOException local88) {
						this.aBoolean8 = true;
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
				} catch (@Pc(112) IOException local112) {
				}
				this.aByteArray3 = null;
				break;
			}
		} catch (@Pc(117) Exception local117) {
			Static273.method3690(null, local117);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([BIBI)V")
	public void method122(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean7) {
			return;
		}
		while (arg1 > 0) {
			@Pc(23) int local23 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg2 += local23;
			arg1 -= local23;
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	public void method123() throws IOException {
		if (!this.aBoolean7 && this.aBoolean8) {
			this.aBoolean8 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([BIII)V")
	public void method124(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aBoolean7) {
			return;
		}
		if (this.aBoolean8) {
			this.aBoolean8 = false;
			throw new IOException();
		}
		if (this.aByteArray3 == null) {
			this.aByteArray3 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
				this.aByteArray3[this.anInt160] = arg0[local37];
				this.anInt160 = (this.anInt160 + 1) % 5000;
				if ((this.anInt157 + 4900) % 5000 == this.anInt160) {
					throw new IOException();
				}
			}
			if (this.aClass108_1 == null) {
				this.aClass108_1 = this.aClass114_1.method2342(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)I")
	public int method125() throws IOException {
		return this.aBoolean7 ? 0 : this.anInputStream1.read();
	}
}
