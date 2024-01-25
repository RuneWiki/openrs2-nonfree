import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class301 implements Runnable {

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
	private int anInt9067 = 0;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
	private int anInt9075 = 0;

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
	private final int anInt9070;

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "[B")
	private final byte[] aByteArray103;

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class301(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt9070 = arg1 + 1;
		this.aByteArray103 = new byte[this.anInt9070];
		this.aThread5 = new Thread(this);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[B)I")
	public int method7417(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (arg0 < 0 || arg1 < 0 || arg1 + arg0 > arg2.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(44) int local44;
			if (this.anInt9067 > this.anInt9075) {
				local44 = this.anInt9075 + this.anInt9070 - this.anInt9067;
			} else {
				local44 = this.anInt9075 - this.anInt9067;
			}
			if (local44 < arg0) {
				arg0 = local44;
			}
			if (arg0 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt9067 + arg0 <= this.anInt9070) {
				Static602.method4666(this.aByteArray103, this.anInt9067, arg2, arg1, arg0);
			} else {
				@Pc(95) int local95 = this.anInt9070 - this.anInt9067;
				Static602.method4666(this.aByteArray103, this.anInt9067, arg2, arg1, local95);
				Static602.method4666(this.aByteArray103, 0, arg2, arg1 + local95, -local95 + arg0);
			}
			this.anInt9067 = (arg0 + this.anInt9067) % this.anInt9070;
			this.notifyAll();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
	public void method7419() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BI)Z")
	public boolean method7420(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt9070 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(45) int local45;
			if (this.anInt9075 < this.anInt9067) {
				local45 = this.anInt9075 + this.anInt9070 - this.anInt9067;
			} else {
				local45 = this.anInt9075 - this.anInt9067;
			}
			if (arg0 <= local45) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt9067 == 0) {
						local29 = this.anInt9070 - this.anInt9075 - 1;
					} else if (this.anInt9075 > this.anInt9067) {
						local29 = this.anInt9070 - this.anInt9075;
					} else {
						local29 = this.anInt9067 - this.anInt9075 - 1;
					}
					if (local29 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(59) InterruptedException local59) {
					}
				}
			}
			@Pc(76) int local76;
			try {
				local76 = this.anInputStream1.read(this.aByteArray103, this.anInt9075, local29);
				if (local76 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(85) IOException local85) {
				@Pc(85) IOException local85x = local85;
				synchronized (this) {
					this.anIOException2 = local85x;
					return;
				}
			}
			synchronized (this) {
				this.anInt9075 = (local76 + this.anInt9075) % this.anInt9070;
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)V")
	public void method7422() {
		this.anInputStream1 = new InputStream_Sub2();
	}
}
