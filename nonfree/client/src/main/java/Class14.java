import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class14 implements Interface10 {

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "Lclient!ba;")
	private final Class21 aClass21_1 = new Class21(256);

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "Lclient!b;")
	private final Class20 aClass20_4;

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "Lclient!b;")
	private final Class20 aClass20_5;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "[Lclient!jc;")
	private final Class121[] aClass121Array1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!b;Lclient!b;Lclient!b;)V")
	public Class14(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class20 arg2) {
		this.aClass20_4 = arg1;
		this.aClass20_5 = arg2;
		@Pc(24) Class3_Sub5 local24 = new Class3_Sub5(arg0.method253(0, 0));
		@Pc(28) int local28 = local24.method2767();
		this.aClass121Array1 = new Class121[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method2739() == 1) {
				this.aClass121Array1[local34] = new Class121();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
			if (this.aClass121Array1[local58] != null) {
				this.aClass121Array1[local58].aBoolean223 = local24.method2739() == 0;
			}
		}
		for (@Pc(86) int local86 = 0; local86 < local28; local86++) {
			if (this.aClass121Array1[local86] != null) {
				this.aClass121Array1[local86].aBoolean218 = local24.method2739() == 1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < local28; local116++) {
			if (this.aClass121Array1[local116] != null) {
				this.aClass121Array1[local116].aBoolean224 = local24.method2739() == 1;
			}
		}
		for (@Pc(142) int local142 = 0; local142 < local28; local142++) {
			if (this.aClass121Array1[local142] != null) {
				this.aClass121Array1[local142].aBoolean225 = local24.method2739() == 1;
			}
		}
		for (@Pc(168) int local168 = 0; local168 < local28; local168++) {
			if (this.aClass121Array1[local168] != null) {
				this.aClass121Array1[local168].aByte42 = local24.method2753();
			}
		}
		for (@Pc(189) int local189 = 0; local189 < local28; local189++) {
			if (this.aClass121Array1[local189] != null) {
				this.aClass121Array1[local189].aByte44 = local24.method2753();
			}
		}
		for (@Pc(210) int local210 = 0; local210 < local28; local210++) {
			if (this.aClass121Array1[local210] != null) {
				this.aClass121Array1[local210].aByte40 = local24.method2753();
			}
		}
		for (@Pc(235) int local235 = 0; local235 < local28; local235++) {
			if (this.aClass121Array1[local235] != null) {
				this.aClass121Array1[local235].aByte43 = local24.method2753();
			}
		}
		for (@Pc(256) int local256 = 0; local256 < local28; local256++) {
			if (this.aClass121Array1[local256] != null) {
				this.aClass121Array1[local256].aShort32 = (short) local24.method2767();
			}
		}
		for (@Pc(282) int local282 = 0; local282 < local28; local282++) {
			if (this.aClass121Array1[local282] != null) {
				this.aClass121Array1[local282].aByte41 = local24.method2753();
			}
		}
		for (@Pc(303) int local303 = 0; local303 < local28; local303++) {
			if (this.aClass121Array1[local303] != null) {
				this.aClass121Array1[local303].aByte39 = local24.method2753();
			}
		}
		for (@Pc(324) int local324 = 0; local324 < local28; local324++) {
			if (this.aClass121Array1[local324] != null) {
				this.aClass121Array1[local324].aBoolean226 = local24.method2739() == 1;
			}
		}
		for (@Pc(352) int local352 = 0; local352 < local28; local352++) {
			if (this.aClass121Array1[local352] != null) {
				this.aClass121Array1[local352].aBoolean221 = local24.method2739() == 1;
			}
		}
		for (@Pc(380) int local380 = 0; local380 < local28; local380++) {
			if (this.aClass121Array1[local380] != null) {
				this.aClass121Array1[local380].aByte38 = local24.method2753();
			}
		}
		for (@Pc(405) int local405 = 0; local405 < local28; local405++) {
			if (this.aClass121Array1[local405] != null) {
				this.aClass121Array1[local405].aBoolean222 = local24.method2739() == 1;
			}
		}
		for (@Pc(433) int local433 = 0; local433 < local28; local433++) {
			if (this.aClass121Array1[local433] != null) {
				this.aClass121Array1[local433].aBoolean219 = local24.method2739() == 1;
			}
		}
		for (@Pc(465) int local465 = 0; local465 < local28; local465++) {
			if (this.aClass121Array1[local465] != null) {
				this.aClass121Array1[local465].aBoolean220 = local24.method2739() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(II)Lclient!pg;")
	private Class3_Sub7_Sub12 method196(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub7 local10 = this.aClass21_1.method261((long) arg0);
		if (local10 != null) {
			return (Class3_Sub7_Sub12) local10;
		}
		@Pc(23) byte[] local23 = this.aClass20_4.method224(arg0);
		if (local23 == null) {
			return null;
		} else {
			@Pc(42) Class3_Sub7_Sub12 local42 = new Class3_Sub7_Sub12(new Class3_Sub5(local23));
			this.aClass21_1.method259((long) arg0, local42);
			return local42;
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)Lclient!jc;")
	@Override
	public Class121 method192(@OriginalArg(1) int arg0) {
		return this.aClass121Array1[arg0];
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IBIFZI)[F")
	@Override
	public float[] method195(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3) {
		return this.method196(arg0).method4235(arg3, this.aClass20_5, this, arg1, this.aClass121Array1[arg0].aBoolean221);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZFIZII)[I")
	@Override
	public int[] method193(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method196(arg2).method4232(arg1, arg3, this.aClass20_5, this, (double) arg0, this.aClass121Array1[arg2].aBoolean221);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method191(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub7_Sub12 local8 = this.method196(arg0);
		return local8 != null && local8.method4233(this.aClass20_5, this);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IFZIII)[I")
	@Override
	public int[] method194(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.method196(arg4).method4231(this.aClass121Array1[arg4].aBoolean221, arg3, this.aClass20_5, arg0, this, arg2, (double) arg1);
	}
}
