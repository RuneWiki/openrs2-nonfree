import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class405 implements Runnable {

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "Lclient!tba;")
	private Class353 aClass353_1;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "J")
	private long aLong342;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "Z")
	private volatile boolean aBoolean757 = true;

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "[Lclient!jw;")
	private final Class3_Sub5[] aClass3_Sub5Array6 = new Class3_Sub5[8];

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "[I")
	private final int[] anIntArray792 = new int[3];

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "Z")
	private volatile boolean aBoolean756 = true;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "Z")
	private volatile boolean aBoolean758 = false;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
	private final int anInt11141;

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "Lclient!ha;")
	private final Class22 aClass22_15;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class405(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1) {
		this.anInt11141 = arg0;
		this.aClass22_15 = arg1;
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "()V")
	private void method9481() {
		this.aClass22_15.method9357(this.anInt11141);
		while (!this.aBoolean757 && this.aBoolean756) {
			if (this.aClass353_1 == null || this.aClass353_1.method7813()) {
				this.aBoolean758 = false;
				this.aLong342 = Static310.aClass157_1.method6916();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(187) InterruptedException local187) {
					}
				}
			} else {
				this.aBoolean758 = true;
				@Pc(23) Class9 local23 = this.aClass353_1.method7810();
				if (local23 instanceof Class9_Sub1) {
					@Pc(29) Class9_Sub1 local29 = (Class9_Sub1) local23;
					if (local29.aBoolean723) {
						local29.method9085(Static404.aClass22_6);
					} else {
						Static516.method6962(local29, this.aClass3_Sub5Array6);
						if (Static187.aClass57_4 != null) {
							Static187.aClass57_4.method9131(-16777216, local29.anInt10697, -256, local29.anInt10686, this.aClass353_1.aString117);
						}
					}
				} else {
					@Pc(62) int local62 = ((Class9_Sub8) local23).anInt8282;
					if (local62 >= 1 && local62 <= 4) {
						@Pc(76) Class259 local76 = Static477.aClass259Array3[local62 - 1];
						for (@Pc(78) int local78 = 0; local78 < Static720.anInt11190 + Static720.anInt11190; local78++) {
							for (@Pc(81) int local81 = 0; local81 < Static720.anInt11190 + Static720.anInt11190; local81++) {
								if (Static194.aBooleanArrayArrayArray1[local62 - 1][local78][local81]) {
									@Pc(98) int local98 = Static507.anInt8070 + local78 - Static720.anInt11190;
									@Pc(104) int local104 = Static527.anInt8230 + local81 - Static720.anInt11190;
									if (local98 >= 0 && local98 < local76.anInt10949 && local104 >= 0 && local104 < local76.anInt10946) {
										Static404.aClass22_6.H(local98 << Static626.anInt9669, local76.method9295(local104, local98), local104 << Static626.anInt9669, this.anIntArray792);
										if (Static410.method2597(this.anIntArray792[0]) == this.anInt11141 - 1) {
											local76.method9298(local98, local104);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass22_15.method9387(this.anInt11141);
		while (this.aBoolean757 && this.aBoolean756) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(216) InterruptedException local216) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "()V")
	public void method9482() {
		this.aBoolean757 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!wk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean756) {
			this.method9481();
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "()J")
	public long method9483() {
		return this.aLong342;
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "()V")
	public void method9484() {
		this.aBoolean757 = false;
		this.aBoolean756 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!tba;)V")
	public void method9485(@OriginalArg(0) Class353 arg0) {
		if (this.aClass353_1 != null) {
			this.aClass353_1.method7811((Class405) null);
		}
		this.aClass353_1 = arg0;
		if (this.aClass353_1 != null) {
			this.aClass353_1.method7811(this);
		}
	}

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "()Z")
	public boolean method9486() {
		return this.aClass353_1 == null || !this.aBoolean758 && this.aClass353_1.method7813();
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "()V")
	public void method9487() {
		this.aBoolean757 = false;
		synchronized (this) {
			this.notify();
		}
	}
}
