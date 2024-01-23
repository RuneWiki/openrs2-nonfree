import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!pa;")
	public static Class1_Sub2_Sub1 aClass1_Sub2_Sub1_33;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	public static int anInt3292;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "[[Lclient!wb;")
	public static Class1_Sub31[][] aClass1_Sub31ArrayArray2;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	public static int anInt3291 = 0;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString187 = "flash2:";

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!nk;)V")
	public static void method2844(@OriginalArg(1) Class121 arg0) {
		Static310.aClass1_Sub2_Sub1Array9 = Static131.method2240(Static255.anInt4618, arg0);
		Static6.aClass1_Sub2_Sub1Array1 = Static131.method2240(Static82.anInt1644, arg0);
		Static110.aClass1_Sub2_Sub1Array5 = Static131.method2240(Static251.anInt4554, arg0);
		Static41.aClass1_Sub2_Sub1Array2 = Static131.method2240(Static182.anInt3493, arg0);
		Static311.aClass1_Sub2_Sub1Array10 = Static131.method2240(Static102.anInt2059, arg0);
		Static64.aClass1_Sub2_Sub1Array4 = Static131.method2240(Static123.anInt2529, arg0);
		Static175.aClass1_Sub2_Sub1Array7 = Static13.method170(arg0, Static314.anInt867);
		Static113.aClass1_Sub2_Sub1Array6 = Static13.method170(arg0, Static218.anInt1148);
		Static294.aClass1_Sub2_Sub1Array8 = Static13.method170(arg0, Static314.anInt870);
		Static17.aClass23Array1 = Static272.method4767(arg0, Static63.anInt3246);
		Static84.aClass23Array3 = Static272.method4767(arg0, Static263.anInt4829);
		Static11.aClass1_Sub2_Sub6_1.method4031(Static84.aClass23Array3, null);
		Static140.aClass1_Sub2_Sub6_3.method4031(Static84.aClass23Array3, null);
		Static307.aClass1_Sub2_Sub6_4.method4031(Static84.aClass23Array3, null);
		if (Static156.aBoolean211) {
			Static150.aClass23_Sub1Array2 = Static2.method18(arg0, Static213.anInt4455);
			for (@Pc(100) int local100 = 0; local100 < Static150.aClass23_Sub1Array2.length; local100++) {
				Static150.aClass23_Sub1Array2[local100].method1494();
			}
		}
		@Pc(121) Class1_Sub2_Sub1_Sub2 local121 = Static69.method4283(0, arg0, Static61.anInt1171);
		local121.method3854();
		if (Static156.aBoolean211) {
			Static243.aClass1_Sub2_Sub1_50 = new Class1_Sub2_Sub1_Sub1(local121);
		} else {
			Static243.aClass1_Sub2_Sub1_50 = local121;
		}
		@Pc(140) Class1_Sub2_Sub1_Sub2[] local140 = Static88.method1625(Static278.anInt5013, arg0);
		@Pc(142) int local142;
		for (local142 = 0; local142 < local140.length; local142++) {
			local140[local142].method3854();
		}
		if (Static156.aBoolean211) {
			Static41.aClass1_Sub2_Sub1Array3 = new Class1_Sub2_Sub1[local140.length];
			for (local142 = 0; local142 < local140.length; local142++) {
				Static41.aClass1_Sub2_Sub1Array3[local142] = new Class1_Sub2_Sub1_Sub1(local140[local142]);
			}
		} else {
			Static41.aClass1_Sub2_Sub1Array3 = local140;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method2846(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static91.aBoolean93) {
			try {
				@Pc(28) Class27 local28 = (Class27) Class.forName("Class27_Sub1").getDeclaredConstructor().newInstance();
				local28.method606(arg0);
				return local28;
			} catch (@Pc(35) Throwable local35) {
				Static91.aBoolean93 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!hi;)V")
	public static void method2847(@OriginalArg(1) Class66 arg0) {
		@Pc(16) int local16 = arg0.anInt2210;
		if (local16 == 324) {
			if (Static304.anInt5398 == -1) {
				Static157.anInt1471 = arg0.anInt2168;
				Static304.anInt5398 = arg0.anInt2218;
			}
			if (Static213.aClass167_5.aBoolean336) {
				arg0.anInt2218 = Static304.anInt5398;
			} else {
				arg0.anInt2218 = Static157.anInt1471;
			}
		} else if (local16 == 325) {
			if (Static304.anInt5398 == -1) {
				Static304.anInt5398 = arg0.anInt2218;
				Static157.anInt1471 = arg0.anInt2168;
			}
			if (Static213.aClass167_5.aBoolean336) {
				arg0.anInt2218 = Static157.anInt1471;
			} else {
				arg0.anInt2218 = Static304.anInt5398;
			}
		} else if (local16 == 327) {
			arg0.anInt2136 = 150;
			arg0.anInt2156 = (int) (Math.sin((double) Static313.anInt2966 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2198 = 5;
			arg0.anInt2130 = -1;
		} else if (local16 == 328) {
			if (Static90.aClass15_Sub5_Sub2_2.aString336 == null) {
				arg0.anInt2130 = 0;
			} else {
				arg0.anInt2136 = 150;
				arg0.anInt2156 = (int) (Math.sin((double) Static313.anInt2966 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt2198 = 5;
				arg0.anInt2130 = ((int) Static124.method4681(Static90.aClass15_Sub5_Sub2_2.aString336) << 11) + 2047;
				arg0.anInt2182 = Static90.aClass15_Sub5_Sub2_2.anInt5516;
				arg0.anInt2149 = Static90.aClass15_Sub5_Sub2_2.anInt5521;
				arg0.anInt2134 = Static90.aClass15_Sub5_Sub2_2.anInt5569;
				arg0.anInt2131 = 0;
			}
		}
	}
}
