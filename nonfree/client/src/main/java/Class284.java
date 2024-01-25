import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class284 implements Runnable {

	@OriginalMember(owner = "client!uba", name = "e", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "I")
	private int anInt8176 = 0;

	@OriginalMember(owner = "client!uba", name = "n", descriptor = "I")
	private int anInt8182 = 0;

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!uba", name = "m", descriptor = "I")
	private final int anInt8181;

	@OriginalMember(owner = "client!uba", name = "d", descriptor = "[B")
	private final byte[] aByteArray99;

	@OriginalMember(owner = "client!uba", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	static {
		new Class114("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class284(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream2 = arg0;
		this.anInt8181 = arg1 + 1;
		this.aByteArray99 = new byte[this.anInt8181];
		this.aThread5 = new Thread(this);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V")
	public void method6935() {
		this.anOutputStream2 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
	public void method6936() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(I[BIB)V")
	public void method6937(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (arg1 < 0 || arg1 > arg0.length) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(65) int local65;
			if (this.anInt8176 <= this.anInt8182) {
				local65 = this.anInt8176 + this.anInt8181 - this.anInt8182 - 1;
			} else {
				local65 = this.anInt8176 - this.anInt8182 - 1;
			}
			if (arg1 > local65) {
				throw new IOException("");
			}
			if (this.anInt8182 + arg1 > this.anInt8181) {
				@Pc(101) int local101 = this.anInt8181 - this.anInt8182;
				Static555.method5095(arg0, 0, this.aByteArray99, this.anInt8182, local101);
				Static555.method5095(arg0, local101, this.aByteArray99, 0, arg1 - local101);
			} else {
				Static555.method5095(arg0, 0, this.aByteArray99, this.anInt8182, arg1);
			}
			this.anInt8182 = (arg1 + this.anInt8182) % this.anInt8181;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!uba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt8182 >= this.anInt8176) {
						local27 = this.anInt8182 - this.anInt8176;
					} else {
						local27 = this.anInt8182 + this.anInt8181 - this.anInt8176;
					}
					if (local27 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(48) InterruptedException local48) {
					}
				}
			}
			try {
				if (this.anInt8181 >= local27 + this.anInt8176) {
					this.anOutputStream2.write(this.aByteArray99, this.anInt8176, local27);
				} else {
					@Pc(84) int local84 = this.anInt8181 - this.anInt8176;
					this.anOutputStream2.write(this.aByteArray99, this.anInt8176, local84);
					this.anOutputStream2.write(this.aByteArray99, 0, local27 - local84);
				}
			} catch (@Pc(104) IOException local104) {
				@Pc(104) IOException local104x = local104;
				synchronized (this) {
					this.anIOException2 = local104x;
					return;
				}
			}
			synchronized (this) {
				this.anInt8176 = (local27 + this.anInt8176) % this.anInt8181;
			}
		}
	}
}
