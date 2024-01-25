import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class328 implements Runnable {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "J")
	private long aLong388;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "Lclient!sf;")
	private Class294 aClass294_1;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "[Lclient!qea;")
	private final Class1_Sub5[] aClass1_Sub5Array7 = new Class1_Sub5[8];

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "[I")
	private final int[] anIntArray596 = new int[3];

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "Z")
	private volatile boolean aBoolean653 = true;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Z")
	private volatile boolean aBoolean651 = true;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Z")
	private volatile boolean aBoolean652 = false;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
	private final int anInt8830;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "Lclient!r;")
	private final Class12 aClass12_14;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(ILclient!r;)V")
	public Class328(@OriginalArg(0) int arg0, @OriginalArg(1) Class12 arg1) {
		this.anInt8830 = arg0;
		this.aClass12_14 = arg1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "()V")
	public void method7285() {
		this.aBoolean653 = false;
		this.aBoolean651 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "()V")
	private void method7286() {
		this.aClass12_14.method6428(this.anInt8830);
		while (!this.aBoolean653 && this.aBoolean651) {
			if (this.aClass294_1 == null || this.aClass294_1.method6722()) {
				this.aBoolean652 = false;
				this.aLong388 = Static301.aClass132_1.method6704();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean652 = true;
				@Pc(21) Class20 local21 = this.aClass294_1.method6718();
				if (local21 instanceof Class20_Sub2) {
					@Pc(27) Class20_Sub2 local27 = (Class20_Sub2) local21;
					if (local27.aBoolean644) {
						local27.method7265(Static63.aClass12_5);
					} else {
						Static238.method7879(local27, this.aClass1_Sub5Array7);
						if (Static319.aClass35_8 != null) {
							Static319.aClass35_8.method4935(local27.anInt8791, -256, local27.anInt8788, this.aClass294_1.aString83, -16777216);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class20_Sub9) local21).anInt8296;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class17 local70 = Static20.aClass17Array1[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static246.anInt8757 + Static246.anInt8757; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static246.anInt8757 + Static246.anInt8757; local75++) {
								if (Static471.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static251.anInt4676 + local72 - Static246.anInt8757;
									@Pc(98) int local98 = Static63.anInt1544 + local75 - Static246.anInt8757;
									if (local92 >= 0 && local92 < local70.anInt7983 && local98 >= 0 && local98 < local70.anInt7984) {
										Static63.aClass12_5.MA(local92 << Static378.anInt6665, local70.method6642(local92, local98), local98 << Static378.anInt6665, this.anIntArray596);
										if (Static244.method3976(this.anIntArray596[0]) == this.anInt8830 - 1) {
											local70.method6644(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass12_14.method6401(this.anInt8830);
		while (this.aBoolean653 && this.aBoolean651) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "()J")
	public long method7287() {
		return this.aLong388;
	}

	@OriginalMember(owner = "client!ui", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean651) {
			this.method7286();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!sf;)V")
	public void method7288(@OriginalArg(0) Class294 arg0) {
		if (this.aClass294_1 != null) {
			this.aClass294_1.method6721(null);
		}
		this.aClass294_1 = arg0;
		if (this.aClass294_1 != null) {
			this.aClass294_1.method6721(this);
		}
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "()V")
	public void method7289() {
		this.aBoolean653 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "()Z")
	public boolean method7290() {
		return this.aClass294_1 == null || !this.aBoolean652 && this.aClass294_1.method6722();
	}

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "()V")
	public void method7291() {
		this.aBoolean653 = false;
		synchronized (this) {
			this.notify();
		}
	}
}
