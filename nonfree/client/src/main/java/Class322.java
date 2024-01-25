import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class322 implements Interface4 {

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "Lclient!tr;")
	private final Class321 aClass321_3 = new Class321(256);

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "Lclient!ri;")
	private final Class284 aClass284_149;

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "Lclient!ri;")
	private final Class284 aClass284_150;

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
	private final int anInt9180;

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "[Lclient!kd;")
	private final Class172[] aClass172Array1;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!ri;Lclient!ri;Lclient!ri;)V")
	public Class322(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_149 = arg2;
		this.aClass284_150 = arg1;
		@Pc(24) Class3_Sub26 local24 = new Class3_Sub26(arg0.method6331(0, 0));
		this.anInt9180 = local24.method6811();
		this.aClass172Array1 = new Class172[this.anInt9180];
		for (@Pc(36) int local36 = 0; local36 < this.anInt9180; local36++) {
			if (local24.method6814() == 1) {
				this.aClass172Array1[local36] = new Class172();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt9180; local61++) {
			if (this.aClass172Array1[local61] != null) {
				this.aClass172Array1[local61].aBoolean349 = local24.method6814() == 0;
			}
		}
		for (@Pc(91) int local91 = 0; local91 < this.anInt9180; local91++) {
			if (this.aClass172Array1[local91] != null) {
				this.aClass172Array1[local91].aBoolean350 = local24.method6814() == 1;
			}
		}
		for (@Pc(124) int local124 = 0; local124 < this.anInt9180; local124++) {
			if (this.aClass172Array1[local124] != null) {
				this.aClass172Array1[local124].aBoolean358 = local24.method6814() == 1;
			}
		}
		for (@Pc(151) int local151 = 0; local151 < this.anInt9180; local151++) {
			if (this.aClass172Array1[local151] != null) {
				this.aClass172Array1[local151].aBoolean357 = local24.method6814() == 1;
			}
		}
		for (@Pc(178) int local178 = 0; local178 < this.anInt9180; local178++) {
			if (this.aClass172Array1[local178] != null) {
				this.aClass172Array1[local178].aByte58 = local24.method6825();
			}
		}
		for (@Pc(204) int local204 = 0; local204 < this.anInt9180; local204++) {
			if (this.aClass172Array1[local204] != null) {
				this.aClass172Array1[local204].aByte61 = local24.method6825();
			}
		}
		for (@Pc(226) int local226 = 0; local226 < this.anInt9180; local226++) {
			if (this.aClass172Array1[local226] != null) {
				this.aClass172Array1[local226].aByte62 = local24.method6825();
			}
		}
		for (@Pc(248) int local248 = 0; local248 < this.anInt9180; local248++) {
			if (this.aClass172Array1[local248] != null) {
				this.aClass172Array1[local248].aByte60 = local24.method6825();
			}
		}
		for (@Pc(270) int local270 = 0; local270 < this.anInt9180; local270++) {
			if (this.aClass172Array1[local270] != null) {
				this.aClass172Array1[local270].aShort66 = (short) local24.method6811();
			}
		}
		for (@Pc(297) int local297 = 0; local297 < this.anInt9180; local297++) {
			if (this.aClass172Array1[local297] != null) {
				this.aClass172Array1[local297].aByte57 = local24.method6825();
			}
		}
		for (@Pc(323) int local323 = 0; local323 < this.anInt9180; local323++) {
			if (this.aClass172Array1[local323] != null) {
				this.aClass172Array1[local323].aByte56 = local24.method6825();
			}
		}
		for (@Pc(345) int local345 = 0; local345 < this.anInt9180; local345++) {
			if (this.aClass172Array1[local345] != null) {
				this.aClass172Array1[local345].aBoolean352 = local24.method6814() == 1;
			}
		}
		for (@Pc(376) int local376 = 0; local376 < this.anInt9180; local376++) {
			if (this.aClass172Array1[local376] != null) {
				this.aClass172Array1[local376].aBoolean355 = local24.method6814() == 1;
			}
		}
		for (@Pc(405) int local405 = 0; local405 < this.anInt9180; local405++) {
			if (this.aClass172Array1[local405] != null) {
				this.aClass172Array1[local405].aByte59 = local24.method6825();
			}
		}
		for (@Pc(431) int local431 = 0; local431 < this.anInt9180; local431++) {
			if (this.aClass172Array1[local431] != null) {
				this.aClass172Array1[local431].aBoolean353 = local24.method6814() == 1;
			}
		}
		for (@Pc(460) int local460 = 0; local460 < this.anInt9180; local460++) {
			if (this.aClass172Array1[local460] != null) {
				this.aClass172Array1[local460].aBoolean354 = local24.method6814() == 1;
			}
		}
		for (@Pc(487) int local487 = 0; local487 < this.anInt9180; local487++) {
			if (this.aClass172Array1[local487] != null) {
				this.aClass172Array1[local487].aBoolean356 = local24.method6814() == 1;
			}
		}
		for (@Pc(520) int local520 = 0; local520 < this.anInt9180; local520++) {
			if (this.aClass172Array1[local520] != null) {
				this.aClass172Array1[local520].anInt5206 = local24.method6814();
			}
		}
		for (@Pc(542) int local542 = 0; local542 < this.anInt9180; local542++) {
			if (this.aClass172Array1[local542] != null) {
				this.aClass172Array1[local542].anInt5204 = local24.method6816();
			}
		}
		for (@Pc(568) int local568 = 0; local568 < this.anInt9180; local568++) {
			if (this.aClass172Array1[local568] != null) {
				this.aClass172Array1[local568].aBoolean351 = local24.method6814() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(II)Lclient!fv;")
	private Class3_Sub7_Sub7 method7232(@OriginalArg(0) int arg0) {
		@Pc(18) Class3_Sub7 local18 = this.aClass321_3.method7220((long) arg0);
		if (local18 != null) {
			return (Class3_Sub7_Sub7) local18;
		}
		@Pc(29) byte[] local29 = this.aClass284_150.method6357(arg0);
		if (local29 == null) {
			return null;
		} else {
			@Pc(41) Class3_Sub7_Sub7 local41 = new Class3_Sub7_Sub7(new Class3_Sub26(local29));
			this.aClass321_3.method7223((long) arg0, local41);
			return local41;
		}
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)Lclient!kd;")
	@Override
	public Class172 method7229(@OriginalArg(1) int arg0) {
		return this.aClass172Array1[arg0];
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(FZIBII)[I")
	@Override
	public int[] method7228(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method7232(arg1).method2922(arg3, this, (double) arg0, this.aClass172Array1[arg1].aBoolean355, arg2, this.aClass284_149);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIZIF)[I")
	@Override
	public int[] method7226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4) {
		return this.method7232(arg1).method2926(this.aClass284_149, this.aClass172Array1[arg1].aBoolean355, arg0, (double) arg4, arg3, this, arg2);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method7227(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub7_Sub7 local13 = this.method7232(arg0);
		return local13 != null && local13.method2923(this.aClass284_149, this);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIFIZZ)[F")
	@Override
	public float[] method7230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		return this.method7232(arg3).method2921(arg0, this.aClass284_149, arg1, this, this.aClass172Array1[arg3].aBoolean355);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)I")
	@Override
	public int method7231() {
		return this.anInt9180;
	}
}
