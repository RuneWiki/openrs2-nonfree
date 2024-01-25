import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class199 implements Interface7 {

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Lclient!dc;")
	private final Class52 aClass52_2 = new Class52(256);

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "Lclient!ph;")
	private final Class187 aClass187_97;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "Lclient!ph;")
	private final Class187 aClass187_98;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "[Lclient!vm;")
	private final Class259[] aClass259Array1;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!ph;Lclient!ph;Lclient!ph;)V")
	public Class199(@OriginalArg(0) Class187 arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) Class187 arg2) {
		this.aClass187_97 = arg2;
		this.aClass187_98 = arg1;
		@Pc(24) Class10_Sub8 local24 = new Class10_Sub8(arg0.method4300(0, 0));
		@Pc(28) int local28 = local24.method2485();
		this.aClass259Array1 = new Class259[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method2502() == 1) {
				this.aClass259Array1[local34] = new Class259();
			}
		}
		for (@Pc(56) int local56 = 0; local56 < local28; local56++) {
			if (this.aClass259Array1[local56] != null) {
				this.aClass259Array1[local56].aBoolean476 = local24.method2502() == 0;
			}
		}
		for (@Pc(88) int local88 = 0; local88 < local28; local88++) {
			if (this.aClass259Array1[local88] != null) {
				this.aClass259Array1[local88].aBoolean475 = local24.method2502() == 1;
			}
		}
		for (@Pc(120) int local120 = 0; local120 < local28; local120++) {
			if (this.aClass259Array1[local120] != null) {
				this.aClass259Array1[local120].aBoolean474 = local24.method2502() == 1;
			}
		}
		for (@Pc(150) int local150 = 0; local150 < local28; local150++) {
			if (this.aClass259Array1[local150] != null) {
				this.aClass259Array1[local150].aBoolean479 = local24.method2502() == 1;
			}
		}
		for (@Pc(182) int local182 = 0; local182 < local28; local182++) {
			if (this.aClass259Array1[local182] != null) {
				this.aClass259Array1[local182].aByte102 = local24.method2460();
			}
		}
		for (@Pc(203) int local203 = 0; local203 < local28; local203++) {
			if (this.aClass259Array1[local203] != null) {
				this.aClass259Array1[local203].aByte99 = local24.method2460();
			}
		}
		for (@Pc(228) int local228 = 0; local228 < local28; local228++) {
			if (this.aClass259Array1[local228] != null) {
				this.aClass259Array1[local228].aByte100 = local24.method2460();
			}
		}
		for (@Pc(253) int local253 = 0; local253 < local28; local253++) {
			if (this.aClass259Array1[local253] != null) {
				this.aClass259Array1[local253].aByte105 = local24.method2460();
			}
		}
		for (@Pc(278) int local278 = 0; local278 < local28; local278++) {
			if (this.aClass259Array1[local278] != null) {
				this.aClass259Array1[local278].aShort108 = (short) local24.method2485();
			}
		}
		for (@Pc(304) int local304 = 0; local304 < local28; local304++) {
			if (this.aClass259Array1[local304] != null) {
				this.aClass259Array1[local304].aByte101 = local24.method2460();
			}
		}
		for (@Pc(325) int local325 = 0; local325 < local28; local325++) {
			if (this.aClass259Array1[local325] != null) {
				this.aClass259Array1[local325].aByte104 = local24.method2460();
			}
		}
		for (@Pc(350) int local350 = 0; local350 < local28; local350++) {
			if (this.aClass259Array1[local350] != null) {
				this.aClass259Array1[local350].aBoolean473 = local24.method2502() == 1;
			}
		}
		for (@Pc(376) int local376 = 0; local376 < local28; local376++) {
			if (this.aClass259Array1[local376] != null) {
				this.aClass259Array1[local376].aBoolean478 = local24.method2502() == 1;
			}
		}
		for (@Pc(402) int local402 = 0; local402 < local28; local402++) {
			if (this.aClass259Array1[local402] != null) {
				this.aClass259Array1[local402].aByte103 = local24.method2460();
			}
		}
		for (@Pc(427) int local427 = 0; local427 < local28; local427++) {
			if (this.aClass259Array1[local427] != null) {
				this.aClass259Array1[local427].aBoolean477 = local24.method2502() == 1;
			}
		}
		for (@Pc(457) int local457 = 0; local457 < local28; local457++) {
			if (this.aClass259Array1[local457] != null) {
				this.aClass259Array1[local457].aBoolean480 = local24.method2502() == 1;
			}
		}
		for (@Pc(487) int local487 = 0; local487 < local28; local487++) {
			if (this.aClass259Array1[local487] != null) {
				this.aClass259Array1[local487].aBoolean472 = local24.method2502() == 1;
			}
		}
		for (@Pc(517) int local517 = 0; local517 < local28; local517++) {
			if (this.aClass259Array1[local517] != null) {
				this.aClass259Array1[local517].anInt7252 = local24.method2502();
			}
		}
		for (@Pc(542) int local542 = 0; local542 < local28; local542++) {
			if (this.aClass259Array1[local542] != null) {
				this.aClass259Array1[local542].anInt7256 = local24.method2459();
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BZIFII)[I")
	@Override
	public int[] method4448(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		return this.method4452(arg3).method111(arg4, arg0, this, (double) arg2, arg1, this.aClass187_97, this.aClass259Array1[arg3].aBoolean478);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)Lclient!aj;")
	private Class10_Sub1_Sub1 method4452(@OriginalArg(0) int arg0) {
		@Pc(10) Class10_Sub1 local10 = this.aClass52_2.method1350((long) arg0);
		if (local10 != null) {
			return (Class10_Sub1_Sub1) local10;
		}
		@Pc(26) byte[] local26 = this.aClass187_98.method4303(arg0);
		if (local26 == null) {
			return null;
		} else {
			@Pc(38) Class10_Sub1_Sub1 local38 = new Class10_Sub1_Sub1(new Class10_Sub8(local26));
			this.aClass52_2.method1347((long) arg0, local38);
			return local38;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method4450(@OriginalArg(1) int arg0) {
		@Pc(13) Class10_Sub1_Sub1 local13 = this.method4452(arg0);
		return local13 != null && local13.method113(this.aClass187_97, this);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIZZFI)[I")
	@Override
	public int[] method4451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3) {
		return this.method4452(arg1).method115(this.aClass259Array1[arg1].aBoolean478, arg0, (double) arg2, this, this.aClass187_97, arg3);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(FBIIZI)[F")
	@Override
	public float[] method4449(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method4452(arg1).method116(arg2, arg3, this.aClass187_97, this, this.aClass259Array1[arg1].aBoolean478);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lclient!vm;")
	@Override
	public Class259 method4447(@OriginalArg(1) int arg0) {
		return this.aClass259Array1[arg0];
	}
}
