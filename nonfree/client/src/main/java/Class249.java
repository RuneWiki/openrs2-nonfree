import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class249 implements Runnable {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "J")
	private long aLong185;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "Lclient!dc;")
	private Class56 aClass56_1;

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "[I")
	private final int[] anIntArray476 = new int[3];

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "Z")
	private volatile boolean aBoolean655 = true;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "[Lclient!pk;")
	private final Class3_Sub27[] aClass3_Sub27Array6 = new Class3_Sub27[8];

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "Z")
	private volatile boolean aBoolean653 = true;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "Z")
	private volatile boolean aBoolean654 = false;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
	private final int anInt7670;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "Lclient!ha;")
	private final Class33 aClass33_14;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class249(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1) {
		this.anInt7670 = arg0;
		this.aClass33_14 = arg1;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "()V")
	public void method6422() {
		this.aBoolean655 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "()Z")
	public boolean method6423() {
		return this.aClass56_1 == null || !this.aBoolean654 && this.aClass56_1.method2233();
	}

	@OriginalMember(owner = "client!ol", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean653) {
			this.method6427();
		}
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "()J")
	public long method6424() {
		return this.aLong185;
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "()V")
	public void method6425() {
		this.aBoolean655 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "()V")
	public void method6426() {
		this.aBoolean655 = false;
		this.aBoolean653 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "()V")
	private void method6427() {
		this.aClass33_14.method6154(this.anInt7670);
		while (!this.aBoolean655 && this.aBoolean653) {
			if (this.aClass56_1 == null || this.aClass56_1.method2233()) {
				this.aBoolean654 = false;
				this.aLong185 = Static638.aClass206_1.method8384();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean654 = true;
				@Pc(21) Class2 local21 = this.aClass56_1.method2236();
				if (local21 instanceof Class2_Sub3) {
					@Pc(27) Class2_Sub3 local27 = (Class2_Sub3) local21;
					if (local27.aBoolean873) {
						local27.method8565(Static185.aClass33_8);
					} else {
						Static151.method3294(local27, this.aClass3_Sub27Array6);
						if (Static259.aClass25_9 != null) {
							Static259.aClass25_9.method5838(-256, -16777216, this.aClass56_1.aString16, local27.anInt10421, local27.anInt10422);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class2_Sub8) local21).anInt8611;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class274 local70 = Static500.aClass274Array2[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static157.anInt3831 + Static157.anInt3831; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static157.anInt3831 + Static157.anInt3831; local75++) {
								if (Static437.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static607.anInt10024 + local72 - Static157.anInt3831;
									@Pc(98) int local98 = Static23.anInt369 + local75 - Static157.anInt3831;
									if (local92 >= 0 && local92 < local70.anInt9726 && local98 >= 0 && local98 < local70.anInt9723) {
										Static185.aClass33_8.H(local92 << Static276.anInt5846, local70.method8041(local92, local98), local98 << Static276.anInt5846, this.anIntArray476);
										if (Static295.method5062(this.anIntArray476[0]) == this.anInt7670 - 1) {
											local70.method8037(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass33_14.method6184(this.anInt7670);
		while (this.aBoolean655 && this.aBoolean653) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!dc;)V")
	public void method6428(@OriginalArg(0) Class56 arg0) {
		if (this.aClass56_1 != null) {
			this.aClass56_1.method2238(null);
		}
		this.aClass56_1 = arg0;
		if (this.aClass56_1 != null) {
			this.aClass56_1.method2238(this);
		}
	}
}
