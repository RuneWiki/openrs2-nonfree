import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "Lclient!n;")
	public static Class1_Sub6_Sub3 aClass1_Sub6_Sub3_2;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray40;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "[Lclient!hm;")
	public static Class32_Sub3_Sub1_Sub1[] aClass32_Sub3_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "Lclient!ae;")
	public static Class4 aClass4_21;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_164 = new Class21(50);

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
	public static int anInt6150 = -1;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_208 = new Class18(32, 8);

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "Lclient!il;")
	public static final Class93 aClass93_19 = new Class93(13, 5);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I")
	public static int method5525(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIBIII)V")
	public static void method5526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg3 - arg0;
		@Pc(14) int local14 = arg4 - arg1;
		if (local14 == 0) {
			if (local9 != 0) {
				Static313.method5412(arg2, arg3, arg1, arg0);
			}
		} else if (local9 == 0) {
			Static51.method1234(arg2, arg0, arg4, arg1);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local9 < 0) {
				local9 = -local9;
			}
			@Pc(64) boolean local64 = local14 < local9;
			@Pc(68) int local68;
			@Pc(72) int local72;
			if (local64) {
				local68 = arg1;
				arg1 = arg0;
				local72 = arg4;
				arg0 = local68;
				arg4 = arg3;
				arg3 = local72;
			}
			if (arg4 < arg1) {
				local68 = arg1;
				arg1 = arg4;
				local72 = arg0;
				arg0 = arg3;
				arg4 = local68;
				arg3 = local72;
			}
			local68 = arg0;
			local72 = arg4 - arg1;
			@Pc(108) int local108 = arg3 - arg0;
			@Pc(113) int local113 = -(local72 >> 1);
			@Pc(124) int local124 = arg0 >= arg3 ? -1 : 1;
			if (local108 < 0) {
				local108 = -local108;
			}
			@Pc(141) int local141;
			if (local64) {
				for (local141 = arg1; local141 <= arg4; local141++) {
					Static43.anIntArrayArray57[local141][local68] = arg2;
					local113 += local108;
					if (local113 > 0) {
						local113 -= local72;
						local68 += local124;
					}
				}
			} else {
				for (local141 = arg1; local141 <= arg4; local141++) {
					local113 += local108;
					Static43.anIntArrayArray57[local68][local141] = arg2;
					if (local113 > 0) {
						local68 += local124;
						local113 -= local72;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
	public static void method5527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static339.aClass1_Sub7_Sub2_4.anInt2219 = 0;
		Static339.aClass1_Sub7_Sub2_4.method2121(Static204.aClass103_6.anInt3138);
		Static339.aClass1_Sub7_Sub2_4.method2121(arg2);
		Static339.aClass1_Sub7_Sub2_4.method2121(arg3);
		Static339.aClass1_Sub7_Sub2_4.method2144(arg0);
		Static339.aClass1_Sub7_Sub2_4.method2144(arg1);
		Static280.anInt5464 = 0;
		Static2.anInt125 = -3;
		Static180.anInt3696 = 1;
		Static100.anInt2306 = 0;
	}
}
