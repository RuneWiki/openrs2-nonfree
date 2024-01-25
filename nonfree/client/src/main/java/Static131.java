import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!gg", name = "U", descriptor = "Lclient!dp;")
	public static Class2_Sub11 aClass2_Sub11_1;

	@OriginalMember(owner = "client!gg", name = "J", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_42 = new Class134("M", "M", "M", "M");

	@OriginalMember(owner = "client!gg", name = "X", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_43 = new Class134("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!gg", name = "Y", descriptor = "Z")
	public static boolean aBoolean155 = true;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!dc;IIII)V")
	public static void method1960(@OriginalArg(0) Class3_Sub4_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class173 local9 = arg0.method4001();
		@Pc(19) int local19 = arg0.anInt4906 - arg0.aClass12_7.anInt198 & 0x3FFF;
		if (arg2 == -1) {
			if (local19 != 0 || arg0.anInt4953 > 25) {
				arg0.aBoolean353 = false;
				if (arg3 < 0 && local9.anInt4458 != -1) {
					arg0.anInt4922 = local9.anInt4458;
				} else if (arg3 <= 0 || local9.anInt4450 == -1) {
					arg0.anInt4922 = local9.anInt4482;
				} else {
					arg0.anInt4922 = local9.anInt4450;
				}
			} else if (!arg0.aBoolean353 || !local9.method3666(arg0.anInt4922)) {
				arg0.anInt4922 = local9.method3669();
				arg0.aBoolean353 = arg0.anInt4922 != -1;
			}
		} else if (arg0.anInt4936 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(52) int local52 = Static68.anIntArray420[arg1] - arg0.aClass12_7.anInt198 & 0x3FFF;
			arg0.aBoolean353 = false;
			if (arg2 == 2 && local9.anInt4463 != -1) {
				if (local52 > 2048 && local52 <= 6144 && local9.anInt4459 != -1) {
					arg0.anInt4922 = local9.anInt4459;
				} else if (local52 >= 10240 && local52 < 14336 && local9.anInt4460 != -1) {
					arg0.anInt4922 = local9.anInt4460;
				} else if (local52 <= 6144 || local52 >= 10240 || local9.anInt4485 == -1) {
					arg0.anInt4922 = local9.anInt4463;
				} else {
					arg0.anInt4922 = local9.anInt4485;
				}
			} else if (arg2 == 0 && local9.anInt4488 != -1) {
				if (local52 > 2048 && local52 <= 6144 && local9.anInt4476 != -1) {
					arg0.anInt4922 = local9.anInt4476;
				} else if (local52 >= 10240 && local52 < 14336 && local9.anInt4454 != -1) {
					arg0.anInt4922 = local9.anInt4454;
				} else if (local52 <= 6144 || local52 >= 10240 || local9.anInt4472 == -1) {
					arg0.anInt4922 = local9.anInt4488;
				} else {
					arg0.anInt4922 = local9.anInt4472;
				}
			} else if (local52 > 2048 && local52 <= 6144 && local9.anInt4483 != -1) {
				arg0.anInt4922 = local9.anInt4483;
			} else if (local52 >= 10240 && local52 < 14336 && local9.anInt4449 != -1) {
				arg0.anInt4922 = local9.anInt4449;
			} else if (local52 <= 6144 || local52 >= 10240 || local9.anInt4465 == -1) {
				arg0.anInt4922 = local9.anInt4482;
			} else {
				arg0.anInt4922 = local9.anInt4465;
			}
		} else if (local19 == 0 && arg0.anInt4953 <= 25) {
			if (arg2 == 2 && local9.anInt4463 != -1) {
				arg0.anInt4922 = local9.anInt4463;
			} else if (arg2 == 0 && local9.anInt4488 != -1) {
				arg0.anInt4922 = local9.anInt4488;
			} else {
				arg0.anInt4922 = local9.anInt4482;
			}
			arg0.aBoolean353 = false;
		} else {
			if (arg2 == 2 && local9.anInt4463 != -1) {
				if (arg3 < 0 && local9.anInt4491 != -1) {
					arg0.anInt4922 = local9.anInt4491;
				} else if (arg3 <= 0 || local9.anInt4475 == -1) {
					arg0.anInt4922 = local9.anInt4463;
				} else {
					arg0.anInt4922 = local9.anInt4475;
				}
			} else if (arg2 == 0 && local9.anInt4488 != -1) {
				if (arg3 < 0 && local9.anInt4462 != -1) {
					arg0.anInt4922 = local9.anInt4462;
				} else if (arg3 <= 0 || local9.anInt4477 == -1) {
					arg0.anInt4922 = local9.anInt4488;
				} else {
					arg0.anInt4922 = local9.anInt4477;
				}
			} else if (arg3 < 0 && local9.anInt4468 != -1) {
				arg0.anInt4922 = local9.anInt4468;
			} else if (arg3 <= 0 || local9.anInt4452 == -1) {
				arg0.anInt4922 = local9.anInt4482;
			} else {
				arg0.anInt4922 = local9.anInt4452;
			}
			arg0.aBoolean353 = false;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1961(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static29.method451(Static124.aClass102_38);
			Static456.aClass2_Sub13_Sub2_2.method3602(Static385.method4939(arg0));
			Static456.aClass2_Sub13_Sub2_2.method3590(arg0);
		}
	}
}
