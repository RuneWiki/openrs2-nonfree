import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class217 implements Interface1 {

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "Lclient!ar;")
	private final Class15 aClass15_10 = new Class15(256);

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "Lclient!am;")
	private final Class11 aClass11_153;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "Lclient!am;")
	private final Class11 aClass11_152;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "[Lclient!ne;")
	private final Class135[] aClass135Array1;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!am;Lclient!am;Lclient!am;)V")
	public Class217(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class11 arg2) {
		this.aClass11_153 = arg2;
		this.aClass11_152 = arg1;
		@Pc(24) Class4_Sub7 local24 = new Class4_Sub7(arg0.method288(0, 0));
		@Pc(28) int local28 = local24.method2404();
		this.aClass135Array1 = new Class135[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method2380() == 1) {
				this.aClass135Array1[local34] = new Class135();
			}
		}
		for (@Pc(56) int local56 = 0; local56 < local28; local56++) {
			if (this.aClass135Array1[local56] != null) {
				this.aClass135Array1[local56].aBoolean359 = local24.method2380() == 0;
			}
		}
		for (@Pc(84) int local84 = 0; local84 < local28; local84++) {
			if (this.aClass135Array1[local84] != null) {
				this.aClass135Array1[local84].aBoolean362 = local24.method2380() == 1;
			}
		}
		for (@Pc(112) int local112 = 0; local112 < local28; local112++) {
			if (this.aClass135Array1[local112] != null) {
				this.aClass135Array1[local112].aBoolean360 = local24.method2380() == 1;
			}
		}
		for (@Pc(142) int local142 = 0; local142 < local28; local142++) {
			if (this.aClass135Array1[local142] != null) {
				this.aClass135Array1[local142].aBoolean358 = local24.method2380() == 1;
			}
		}
		for (@Pc(172) int local172 = 0; local172 < local28; local172++) {
			if (this.aClass135Array1[local172] != null) {
				this.aClass135Array1[local172].aByte52 = local24.method2393();
			}
		}
		for (@Pc(193) int local193 = 0; local193 < local28; local193++) {
			if (this.aClass135Array1[local193] != null) {
				this.aClass135Array1[local193].aByte53 = local24.method2393();
			}
		}
		for (@Pc(214) int local214 = 0; local214 < local28; local214++) {
			if (this.aClass135Array1[local214] != null) {
				this.aClass135Array1[local214].aByte49 = local24.method2393();
			}
		}
		for (@Pc(235) int local235 = 0; local235 < local28; local235++) {
			if (this.aClass135Array1[local235] != null) {
				this.aClass135Array1[local235].aByte50 = local24.method2393();
			}
		}
		for (@Pc(260) int local260 = 0; local260 < local28; local260++) {
			if (this.aClass135Array1[local260] != null) {
				this.aClass135Array1[local260].aShort57 = (short) local24.method2404();
			}
		}
		for (@Pc(286) int local286 = 0; local286 < local28; local286++) {
			if (this.aClass135Array1[local286] != null) {
				this.aClass135Array1[local286].aByte51 = local24.method2393();
			}
		}
		for (@Pc(311) int local311 = 0; local311 < local28; local311++) {
			if (this.aClass135Array1[local311] != null) {
				this.aClass135Array1[local311].aByte54 = local24.method2393();
			}
		}
		for (@Pc(336) int local336 = 0; local336 < local28; local336++) {
			if (this.aClass135Array1[local336] != null) {
				this.aClass135Array1[local336].aBoolean364 = local24.method2380() == 1;
			}
		}
		for (@Pc(362) int local362 = 0; local362 < local28; local362++) {
			if (this.aClass135Array1[local362] != null) {
				this.aClass135Array1[local362].aBoolean363 = local24.method2380() == 1;
			}
		}
		for (@Pc(392) int local392 = 0; local392 < local28; local392++) {
			if (this.aClass135Array1[local392] != null) {
				this.aClass135Array1[local392].aByte48 = local24.method2393();
			}
		}
		for (@Pc(417) int local417 = 0; local417 < local28; local417++) {
			if (this.aClass135Array1[local417] != null) {
				this.aClass135Array1[local417].aBoolean361 = local24.method2380() == 1;
			}
		}
		for (@Pc(449) int local449 = 0; local449 < local28; local449++) {
			if (this.aClass135Array1[local449] != null) {
				this.aClass135Array1[local449].aBoolean366 = local24.method2380() == 1;
			}
		}
		for (@Pc(481) int local481 = 0; local481 < local28; local481++) {
			if (this.aClass135Array1[local481] != null) {
				this.aClass135Array1[local481].aBoolean365 = local24.method2380() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(FIZIII)[I")
	@Override
	public int[] method5636(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method5640(arg1).method3128(this.aClass11_153, arg3, this.aClass135Array1[arg1].aBoolean363, arg2, this, (double) arg0);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)Lclient!ne;")
	@Override
	public Class135 method5634(@OriginalArg(0) int arg0) {
		return this.aClass135Array1[arg0];
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZIIIFI)[I")
	@Override
	public int[] method5633(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4) {
		return this.method5640(arg4).method3124(this, arg1, this.aClass135Array1[arg4].aBoolean363, this.aClass11_153, arg0, arg2, (double) arg3);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IFZIIB)[F")
	@Override
	public float[] method5635(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method5640(arg3).method3127(this.aClass11_153, this.aClass135Array1[arg3].aBoolean363, arg0, arg2, this);
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method5637(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub1_Sub12 local13 = this.method5640(arg0);
		return local13 != null && local13.method3126(this, this.aClass11_153);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Lclient!ko;")
	private Class4_Sub1_Sub12 method5640(@OriginalArg(0) int arg0) {
		@Pc(15) Class4_Sub1 local15 = this.aClass15_10.method356((long) arg0);
		if (local15 != null) {
			return (Class4_Sub1_Sub12) local15;
		}
		@Pc(28) byte[] local28 = this.aClass11_152.method300(arg0);
		if (local28 == null) {
			return null;
		} else {
			@Pc(40) Class4_Sub1_Sub12 local40 = new Class4_Sub1_Sub12(new Class4_Sub7(local28));
			this.aClass15_10.method352((long) arg0, local40);
			return local40;
		}
	}
}
