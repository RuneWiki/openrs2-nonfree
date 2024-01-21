import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class10 implements Runnable {

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "Lclient!oc;")
	private Class56 aClass56_1;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	private int anInt435 = 0;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	private int anInt436 = 0;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Lclient!ue;")
	private final Class74 aClass74_2;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ue;)V")
	public Class10(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class74 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass74_2 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)I")
	public int method254() throws IOException {
		return this.aBoolean36 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public void method255() {
		if (this.aBoolean36) {
			return;
		}
		synchronized (this) {
			this.aBoolean36 = true;
			this.notifyAll();
		}
		if (this.aClass56_1 != null) {
			while (this.aClass56_1.anInt2056 == 0) {
				Static62.method1070(1L);
			}
			if (this.aClass56_1.anInt2056 == 1) {
				try {
					((Thread) this.aClass56_1.anObject2).join();
				} catch (@Pc(51) InterruptedException local51) {
				}
			}
		}
		this.aClass56_1 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[BBI)V")
	public void method256(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean36) {
			return;
		}
		if (this.aBoolean37) {
			this.aBoolean37 = false;
			throw new IOException();
		}
		if (this.aByteArray9 == null) {
			this.aByteArray9 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
				this.aByteArray9[this.anInt436] = arg0[local36];
				this.anInt436 = (this.anInt436 + 1) % 5000;
				if (this.anInt436 == (this.anInt435 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass56_1 == null) {
				this.aClass56_1 = this.aClass74_2.method1875(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!cb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(36) int local36;
					@Pc(48) int local48;
					synchronized (this) {
						if (this.anInt435 == this.anInt436) {
							if (this.aBoolean36) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt436 < this.anInt435) {
							local36 = 5000 - this.anInt435;
						} else {
							local36 = this.anInt436 - this.anInt435;
						}
						local48 = this.anInt435;
					}
					if (local36 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray9, local48, local36);
					} catch (@Pc(65) IOException local65) {
						this.aBoolean37 = true;
					}
					this.anInt435 = (this.anInt435 + local36) % 5000;
					try {
						if (this.anInt435 == this.anInt436) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(90) IOException local90) {
						this.aBoolean37 = true;
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
				this.aByteArray9 = null;
				return;
			}
		} catch (@Pc(119) Exception local119) {
			Static53.method953(null, local119);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[BII)V")
	public void method257(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean36) {
			return;
		}
		while (arg1 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg1 -= local19;
			arg2 += local19;
		}
	}

	@OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method255();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I")
	public int method259() throws IOException {
		return this.aBoolean36 ? 0 : this.anInputStream1.available();
	}
}
