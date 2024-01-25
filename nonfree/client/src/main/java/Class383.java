import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class Class383 implements Runnable {

	@OriginalMember(owner = "client!wfa", name = "f", descriptor = "J")
	private long aLong306;

	@OriginalMember(owner = "client!wfa", name = "h", descriptor = "Lclient!iba;")
	private Class148 aClass148_1;

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "Z")
	private volatile boolean aBoolean800 = true;

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "[Lclient!uca;")
	private final Class3_Sub15[] aClass3_Sub15Array6 = new Class3_Sub15[8];

	@OriginalMember(owner = "client!wfa", name = "g", descriptor = "[I")
	private final int[] anIntArray931 = new int[3];

	@OriginalMember(owner = "client!wfa", name = "i", descriptor = "Z")
	private volatile boolean aBoolean801 = true;

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "Z")
	private volatile boolean aBoolean799 = false;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "I")
	private final int anInt10545;

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "Lclient!ha;")
	private final Class13 aClass13_20;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(ILclient!ha;)V")
	public Class383(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1) {
		this.anInt10545 = arg0;
		this.aClass13_20 = arg1;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lclient!iba;)V")
	public void method9127(@OriginalArg(0) Class148 arg0) {
		if (this.aClass148_1 != null) {
			this.aClass148_1.method4027((Class383) null);
		}
		this.aClass148_1 = arg0;
		if (this.aClass148_1 != null) {
			this.aClass148_1.method4027(this);
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "()J")
	public long method9128() {
		return this.aLong306;
	}

	@OriginalMember(owner = "client!wfa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean801) {
			this.method9133();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "()V")
	public void method9129() {
		this.aBoolean800 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "()V")
	public void method9130() {
		this.aBoolean800 = false;
		this.aBoolean801 = false;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "()Z")
	public boolean method9131() {
		return this.aClass148_1 == null || !this.aBoolean799 && this.aClass148_1.method4031();
	}

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "()V")
	public void method9132() {
		this.aBoolean800 = true;
		synchronized (this) {
			this.notify();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "f", descriptor = "()V")
	private void method9133() {
		this.aClass13_20.method8458(this.anInt10545);
		while (!this.aBoolean800 && this.aBoolean801) {
			if (this.aClass148_1 == null || this.aClass148_1.method4031()) {
				this.aBoolean799 = false;
				this.aLong306 = Class239_Sub3.lb.method9231();
				synchronized (this) {
					try {
						this.wait();
					} catch (@Pc(168) InterruptedException local168) {
					}
				}
			} else {
				this.aBoolean799 = true;
				@Pc(21) Class28 local21 = this.aClass148_1.method4028();
				if (local21 instanceof Class28_Sub1) {
					@Pc(27) Class28_Sub1 local27 = (Class28_Sub1) local21;
					if (local27.aBoolean816) {
						local27.method9288(Static671.aClass13_21);
					} else {
						Static548.method7842(local27, this.aClass3_Sub15Array6);
						if (Static2.aClass69_13 != null) {
							Static2.aClass69_13.method8862(local27.anInt10725, -16777216, this.aClass148_1.aString40, -256, local27.anInt10721);
						}
					}
				} else {
					@Pc(58) int local58 = ((Class28_Sub5) local21).anInt7043;
					if (local58 >= 1 && local58 <= 4) {
						@Pc(70) Class21 local70 = Static121.aClass21Array2[local58 - 1];
						for (@Pc(72) int local72 = 0; local72 < Static7.anInt94 + Static7.anInt94; local72++) {
							for (@Pc(75) int local75 = 0; local75 < Static7.anInt94 + Static7.anInt94; local75++) {
								if (Static614.aBooleanArrayArrayArray2[local58 - 1][local72][local75]) {
									@Pc(92) int local92 = Static220.anInt4183 + local72 - Static7.anInt94;
									@Pc(98) int local98 = Static547.anInt8968 + local75 - Static7.anInt94;
									if (local92 >= 0 && local92 < local70.anInt9129 && local98 >= 0 && local98 < local70.anInt9128) {
										Static671.aClass13_21.H(local92 << Static391.anInt10262, local70.method7973(local92, local98), local98 << Static391.anInt10262, this.anIntArray931);
										if (Static636.method8870(this.anIntArray931[0]) == this.anInt10545 - 1) {
											local70.method7979(local92, local98);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		this.aClass13_20.method8475(this.anInt10545);
		while (this.aBoolean800 && this.aBoolean801) {
			synchronized (this) {
				try {
					this.wait();
				} catch (@Pc(195) InterruptedException local195) {
				}
			}
		}
	}
}
