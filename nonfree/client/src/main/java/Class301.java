import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class301 implements Runnable {

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "Lclient!jr;")
	private Class157 aClass157_8;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "[B")
	private byte[] aByteArray120;

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "Z")
	private boolean aBoolean611 = false;

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
	private int anInt8626 = 0;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "Z")
	private boolean aBoolean612 = false;

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
	private int anInt8630 = 0;

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "Lclient!gaa;")
	private final Class102 aClass102_6;

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	static {
		new Class306("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!gaa;)V")
	public Class301(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class102 arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aClass102_6 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)I")
	public int method7061() throws IOException {
		return this.aBoolean611 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[BII)V")
	public void method7062(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean611) {
			return;
		}
		while (arg2 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg2 -= local19;
			arg0 += local19;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	public void method7063() {
		if (!this.aBoolean611) {
			this.anInputStream1 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!vi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(36) int local36;
					@Pc(48) int local48;
					synchronized (this) {
						if (this.anInt8626 == this.anInt8630) {
							if (this.aBoolean611) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						if (this.anInt8630 < this.anInt8626) {
							local36 = 5000 - this.anInt8626;
						} else {
							local36 = this.anInt8630 - this.anInt8626;
						}
						local48 = this.anInt8626;
					}
					if (local36 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray120, local48, local36);
					} catch (@Pc(65) IOException local65) {
						this.aBoolean612 = true;
					}
					this.anInt8626 = (this.anInt8626 + local36) % 5000;
					try {
						if (this.anInt8630 == this.anInt8626) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(91) IOException local91) {
						this.aBoolean612 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(115) IOException local115) {
				}
				this.aByteArray120 = null;
				break;
			}
		} catch (@Pc(120) Exception local120) {
			Static234.method4051(local120, null);
		}
	}

	@OriginalMember(owner = "client!vi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7069();
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I[BII)V")
	public void method7065(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (this.aBoolean611) {
			return;
		}
		if (this.aBoolean612) {
			this.aBoolean612 = false;
			throw new IOException();
		}
		if (this.aByteArray120 == null) {
			this.aByteArray120 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray120[this.anInt8630] = arg1[local32];
				this.anInt8630 = (this.anInt8630 + 1) % 5000;
				if (this.anInt8630 == (this.anInt8626 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass157_8 == null) {
				this.aClass157_8 = this.aClass102_6.method2391(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)I")
	public int method7067() throws IOException {
		return this.aBoolean611 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
	public void method7069() {
		if (this.aBoolean611) {
			return;
		}
		synchronized (this) {
			this.aBoolean611 = true;
			this.notifyAll();
		}
		if (this.aClass157_8 != null) {
			while (this.aClass157_8.anInt4742 == 0) {
				Static209.method3565(1L);
			}
			if (this.aClass157_8.anInt4742 == 1) {
				try {
					((Thread) this.aClass157_8.anObject12).join();
				} catch (@Pc(55) InterruptedException local55) {
				}
			}
		}
		this.aClass157_8 = null;
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V")
	public void method7070() throws IOException {
		if (!this.aBoolean611 && this.aBoolean612) {
			this.aBoolean612 = false;
			throw new IOException();
		}
	}
}
