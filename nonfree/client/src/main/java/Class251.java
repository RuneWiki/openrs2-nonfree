import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class251 implements Runnable {

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
	private int anInt7192 = 0;

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
	private int anInt7196 = 0;

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
	private final int anInt7194;

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "[B")
	private final byte[] aByteArray118;

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	static {
		new Class174("Player ", "Spieler ", "Joueur ", "Jogador ");
	}

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class251(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream2 = arg0;
		this.anInt7194 = arg1 + 1;
		this.aByteArray118 = new byte[this.anInt7194];
		this.aThread5 = new Thread(this);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!uv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt7192 < this.anInt7196) {
						local30 = this.anInt7192 + this.anInt7194 - this.anInt7196;
					} else {
						local30 = this.anInt7192 - this.anInt7196;
					}
					if (local30 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(48) InterruptedException local48) {
					}
				}
			}
			try {
				if (this.anInt7196 + local30 > this.anInt7194) {
					@Pc(74) int local74 = this.anInt7194 - this.anInt7196;
					this.anOutputStream2.write(this.aByteArray118, this.anInt7196, local74);
					this.anOutputStream2.write(this.aByteArray118, 0, local30 - local74);
				} else {
					this.anOutputStream2.write(this.aByteArray118, this.anInt7196, local30);
				}
			} catch (@Pc(103) IOException local103) {
				@Pc(103) IOException local103x = local103;
				synchronized (this) {
					this.anIOException2 = local103x;
					return;
				}
			}
			synchronized (this) {
				this.anInt7196 = (local30 + this.anInt7196) % this.anInt7194;
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I[BII)V")
	public void method5824(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg0 > arg1.length) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(61) int local61;
			if (this.anInt7196 <= this.anInt7192) {
				local61 = this.anInt7196 + this.anInt7194 - this.anInt7192 - 1;
			} else {
				local61 = this.anInt7196 - this.anInt7192 - 1;
			}
			if (local61 < arg0) {
				throw new IOException("");
			}
			if (this.anInt7194 < arg0 + this.anInt7192) {
				@Pc(98) int local98 = this.anInt7194 - this.anInt7192;
				Static466.method205(arg1, 0, this.aByteArray118, this.anInt7192, local98);
				Static466.method205(arg1, local98, this.aByteArray118, 0, arg0 - local98);
			} else {
				Static466.method205(arg1, 0, this.aByteArray118, this.anInt7192, arg0);
			}
			this.anInt7192 = (this.anInt7192 + arg0) % this.anInt7194;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
	public void method5825() {
		this.anOutputStream2 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V")
	public void method5826() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
	}
}
