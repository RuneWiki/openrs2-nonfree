import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class25 implements Runnable {

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Lclient!be;")
	private Class10 aClass10_3;

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
	private int anInt935 = 0;

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
	private int anInt942 = 0;

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "Lclient!je;")
	private final Class40 aClass40_1;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!je;)V")
	public Class25(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class40 arg1) throws IOException {
		this.aClass40_1 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)I")
	public int method582() throws IOException {
		return this.aBoolean43 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!fd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(38) int local38;
					@Pc(48) int local48;
					synchronized (this) {
						if (this.anInt942 == this.anInt935) {
							if (this.aBoolean43) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(26) InterruptedException local26) {
							}
						}
						if (this.anInt935 > this.anInt942) {
							local38 = 5000 - this.anInt935;
						} else {
							local38 = this.anInt942 - this.anInt935;
						}
						local48 = this.anInt935;
					}
					if (local38 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray12, local48, local38);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean44 = true;
					}
					this.anInt935 = (local38 + this.anInt935) % 5000;
					try {
						if (this.anInt942 == this.anInt935) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean44 = true;
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
				} catch (@Pc(113) IOException local113) {
				}
				this.aByteArray12 = null;
				return;
			}
		} catch (@Pc(118) Exception local118) {
			Static79.method1133(local118, null);
		}
	}

	@OriginalMember(owner = "client!fd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method588();
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)I")
	public int method585() throws IOException {
		return this.aBoolean43 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III[B)V")
	public void method586(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean43) {
			return;
		}
		if (this.aBoolean44) {
			this.aBoolean44 = false;
			throw new IOException();
		}
		if (this.aByteArray12 == null) {
			this.aByteArray12 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(30) int local30 = 0; local30 < arg0; local30++) {
				this.aByteArray12[this.anInt942] = arg1[local30];
				this.anInt942 = (this.anInt942 + 1) % 5000;
				if (this.anInt942 == (this.anInt935 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass10_3 == null) {
				this.aClass10_3 = this.aClass40_1.method951(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
	public void method588() {
		if (this.aBoolean43) {
			return;
		}
		synchronized (this) {
			this.aBoolean43 = true;
			this.notifyAll();
		}
		if (this.aClass10_3 != null) {
			while (this.aClass10_3.anInt295 == 0) {
				Static107.method1511(1L);
			}
			if (this.aClass10_3.anInt295 == 1) {
				try {
					((Thread) this.aClass10_3.anObject1).join();
				} catch (@Pc(53) InterruptedException local53) {
				}
			}
		}
		this.aClass10_3 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBI[B)V")
	public void method589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean43) {
			return;
		}
		while (arg1 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg2, arg0, arg1);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg1 -= local19;
			arg0 += local19;
		}
	}
}
