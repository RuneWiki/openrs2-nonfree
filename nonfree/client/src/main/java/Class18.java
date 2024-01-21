import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class18 implements Runnable {

	@OriginalMember(owner = "client!da", name = "n", descriptor = "Lclient!sc;")
	private Class58 aClass58_1;

	@OriginalMember(owner = "client!da", name = "r", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "I")
	private int anInt621 = 0;

	@OriginalMember(owner = "client!da", name = "k", descriptor = "Z")
	private boolean aBoolean27 = false;

	@OriginalMember(owner = "client!da", name = "x", descriptor = "I")
	private int anInt631 = 0;

	@OriginalMember(owner = "client!da", name = "B", descriptor = "Z")
	private boolean aBoolean28 = false;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "Lclient!ed;")
	private final Class23 aClass23_2;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ed;)V")
	public Class18(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class23 arg1) throws IOException {
		this.aClass23_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!da", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt621 == this.anInt631) {
							if (this.aBoolean27) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt621;
						if (this.anInt631 < this.anInt621) {
							local43 = 5000 - this.anInt621;
						} else {
							local43 = this.anInt631 - this.anInt621;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray4, local28, local43);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean28 = true;
					}
					this.anInt621 = (this.anInt621 + local43) % 5000;
					try {
						if (this.anInt631 == this.anInt621) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(98) IOException local98) {
						this.aBoolean28 = true;
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
				} catch (@Pc(122) IOException local122) {
				}
				this.aByteArray4 = null;
				return;
			}
		} catch (@Pc(127) Exception local127) {
			Static69.method1187(local127, null);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[BII)V")
	public void method404(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean27) {
			return;
		}
		while (arg0 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg2 += local19;
			arg0 -= local19;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	public void method405() {
		if (this.aBoolean27) {
			return;
		}
		synchronized (this) {
			this.aBoolean27 = true;
			this.notifyAll();
		}
		if (this.aClass58_1 != null) {
			while (this.aClass58_1.anInt2474 == 0) {
				Static74.method1220(1L);
			}
			if (this.aClass58_1.anInt2474 == 1) {
				try {
					((Thread) this.aClass58_1.anObject4).join();
				} catch (@Pc(53) InterruptedException local53) {
				}
			}
		}
		this.aClass58_1 = null;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)I")
	public int method407() throws IOException {
		return this.aBoolean27 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method405();
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)I")
	public int method408() throws IOException {
		return this.aBoolean27 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I[BII)V")
	public void method409(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean27) {
			return;
		}
		if (this.aBoolean28) {
			this.aBoolean28 = false;
			throw new IOException();
		}
		if (this.aByteArray4 == null) {
			this.aByteArray4 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(30) int local30 = 0; local30 < arg1; local30++) {
				this.aByteArray4[this.anInt631] = arg0[local30];
				this.anInt631 = (this.anInt631 + 1) % 5000;
				if (this.anInt631 == (this.anInt621 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass58_1 == null) {
				this.aClass58_1 = this.aClass23_2.method520(this, 3);
			}
			this.notifyAll();
		}
	}
}
