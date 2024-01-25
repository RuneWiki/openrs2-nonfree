import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class291 implements Runnable {

	@OriginalMember(owner = "client!re", name = "m", descriptor = "Lclient!of;")
	private Class240 aClass240_13;

	@OriginalMember(owner = "client!re", name = "r", descriptor = "[B")
	private byte[] aByteArray114;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	private int anInt8976 = 0;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "Z")
	private boolean aBoolean651 = false;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "I")
	private int anInt8981 = 0;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Z")
	private boolean aBoolean652 = false;

	@OriginalMember(owner = "client!re", name = "w", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Lclient!wea;")
	private final Class370 aClass370_5;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!re", name = "l", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!re", name = "x", descriptor = "I")
	private final int anInt8987;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!wea;I)V")
	public Class291(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class370 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket2 = arg0;
		this.aClass370_5 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream1 = this.aSocket2.getOutputStream();
		this.anInt8987 = arg2;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)I")
	public int method7517() throws IOException {
		return this.aBoolean651 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public void method7518() {
		if (!this.aBoolean651) {
			this.anInputStream2 = new InputStream_Sub2();
			this.anOutputStream1 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([BIII)V")
	public void method7520(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aBoolean651) {
			return;
		}
		if (this.aBoolean652) {
			this.aBoolean652 = false;
			throw new IOException();
		}
		if (this.aByteArray114 == null) {
			this.aByteArray114 = new byte[this.anInt8987];
		}
		synchronized (this) {
			for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
				this.aByteArray114[this.anInt8976] = arg0[local39];
				this.anInt8976 = (this.anInt8976 + 1) % this.anInt8987;
				if ((this.anInt8981 + this.anInt8987 - 100) % this.anInt8987 == this.anInt8976) {
					throw new IOException();
				}
			}
			if (this.aClass240_13 == null) {
				this.aClass240_13 = this.aClass370_5.method9071(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
	public void method7522() throws IOException {
		if (!this.aBoolean651 && this.aBoolean652) {
			this.aBoolean652 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)I")
	public int method7523() throws IOException {
		return this.aBoolean651 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!re", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(35) int local35;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt8976 == this.anInt8981) {
							if (this.aBoolean651) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt8981;
						if (this.anInt8981 > this.anInt8976) {
							local35 = this.anInt8987 - this.anInt8981;
						} else {
							local35 = this.anInt8976 - this.anInt8981;
						}
					}
					if (local35 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray114, local24, local35);
					} catch (@Pc(61) IOException local61) {
						this.aBoolean652 = true;
					}
					this.anInt8981 = (local35 + this.anInt8981) % this.anInt8987;
					try {
						if (this.anInt8976 == this.anInt8981) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(83) IOException local83) {
						this.aBoolean652 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream2 != null) {
						this.anInputStream2.close();
					}
					if (this.anOutputStream1 != null) {
						this.anOutputStream1.close();
					}
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(107) IOException local107) {
				}
				this.aByteArray114 = null;
				break;
			}
		} catch (@Pc(112) Exception local112) {
			Static408.method6625(null, local112);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([BIBI)V")
	public void method7524(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean651) {
			return;
		}
		while (arg2 > 0) {
			@Pc(14) int local14 = this.anInputStream2.read(arg0, arg1, arg2);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg2 -= local14;
			arg1 += local14;
		}
	}

	@OriginalMember(owner = "client!re", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7526();
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V")
	public void method7526() {
		if (this.aBoolean651) {
			return;
		}
		synchronized (this) {
			this.aBoolean651 = true;
			this.notifyAll();
		}
		if (this.aClass240_13 != null) {
			while (this.aClass240_13.anInt7566 == 0) {
				Static190.method3914(1L);
			}
			if (this.aClass240_13.anInt7566 == 1) {
				try {
					((Thread) this.aClass240_13.anObject13).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass240_13 = null;
	}
}
