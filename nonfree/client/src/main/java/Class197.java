import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class197 implements Runnable {

	@OriginalMember(owner = "client!nda", name = "i", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
	private int anInt6026 = 0;

	@OriginalMember(owner = "client!nda", name = "l", descriptor = "I")
	private int anInt6029 = 0;

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
	private final int anInt6025;

	@OriginalMember(owner = "client!nda", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!nda", name = "f", descriptor = "[B")
	private final byte[] aByteArray78;

	@OriginalMember(owner = "client!nda", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	static {
		new Class45("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class197(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt6025 = arg1 + 1;
		this.anOutputStream1 = arg0;
		this.aByteArray78 = new byte[this.anInt6025];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIB[B)V")
	public void method5463(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg1.length < arg0) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(56) int local56;
			if (this.anInt6026 > this.anInt6029) {
				local56 = this.anInt6026 - this.anInt6029 - 1;
			} else {
				local56 = this.anInt6025 + this.anInt6026 - this.anInt6029 - 1;
			}
			if (local56 < arg0) {
				throw new IOException("");
			}
			if (this.anInt6029 + arg0 > this.anInt6025) {
				@Pc(101) int local101 = this.anInt6025 - this.anInt6029;
				Static556.method7044(arg1, 0, this.aByteArray78, this.anInt6029, local101);
				Static556.method7044(arg1, local101, this.aByteArray78, 0, arg0 - local101);
			} else {
				Static556.method7044(arg1, 0, this.aByteArray78, this.anInt6029, arg0);
			}
			this.anInt6029 = (this.anInt6029 + arg0) % this.anInt6025;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)V")
	public void method5465() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V")
	public void method5467() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(37) InterruptedException local37) {
		}
	}

	@OriginalMember(owner = "client!nda", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt6029 >= this.anInt6026) {
						local27 = this.anInt6029 - this.anInt6026;
					} else {
						local27 = this.anInt6025 + this.anInt6029 - this.anInt6026;
					}
					if (local27 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(45) InterruptedException local45) {
					}
				}
			}
			try {
				if (this.anInt6026 + local27 > this.anInt6025) {
					@Pc(68) int local68 = this.anInt6025 - this.anInt6026;
					this.anOutputStream1.write(this.aByteArray78, this.anInt6026, local68);
					this.anOutputStream1.write(this.aByteArray78, 0, local27 - local68);
				} else {
					this.anOutputStream1.write(this.aByteArray78, this.anInt6026, local27);
				}
			} catch (@Pc(97) IOException local97) {
				@Pc(97) IOException local97x = local97;
				synchronized (this) {
					this.anIOException2 = local97x;
					return;
				}
			}
			synchronized (this) {
				this.anInt6026 = (this.anInt6026 + local27) % this.anInt6025;
			}
		}
	}
}
