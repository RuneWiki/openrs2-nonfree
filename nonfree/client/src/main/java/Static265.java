import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!l", name = "g", descriptor = "F")
	public static float aFloat102;

	@OriginalMember(owner = "client!l", name = "i", descriptor = "I")
	public static int anInt5150;

	@OriginalMember(owner = "client!l", name = "k", descriptor = "Lclient!kda;")
	public static Class160 aClass160_60;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "I")
	public static int anInt5151;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "J")
	public static long aLong134 = 0L;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Lclient!gw;")
	public static final Class1_Sub13 aClass1_Sub13_4 = new Class1_Sub13(new byte[5000]);

	@OriginalMember(owner = "client!l", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!l", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray21 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	public static void method4399() {
		method4401(10);
		Static41.method1360();
		System.gc();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIBII[FI)V")
	public static void method4400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static183.method3500(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static183.method3500(arg5)) {
			@Pc(36) int local36 = Static72.method1940(6408);
			@Pc(38) int local38 = 0;
			@Pc(49) int local49 = arg2 < arg5 ? arg2 : arg5;
			@Pc(53) int local53 = arg2 >> 1;
			@Pc(57) int local57 = arg5 >> 1;
			@Pc(59) float[] local59 = arg4;
			@Pc(66) float[] local66 = new float[local53 * local57 * local36];
			while (true) {
				OpenGL.glTexImage2Df(3553, local38, 34842, arg2, arg5, 0, 6408, 5126, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(84) int local84 = local36 * arg2;
				@Pc(86) float[] local86 = local66;
				for (@Pc(88) int local88 = 0; local88 < local36; local88++) {
					@Pc(91) int local91 = local88;
					@Pc(93) int local93 = local88;
					@Pc(97) int local97 = local84 + local88;
					for (@Pc(99) int local99 = 0; local99 < local57; local99++) {
						for (@Pc(102) int local102 = 0; local102 < local53; local102++) {
							@Pc(107) float local107 = local59[local93];
							local93 += local36;
							@Pc(117) float local117 = local107 + local59[local93];
							@Pc(123) float local123 = local117 + local59[local97];
							local93 += local36;
							local97 += local36;
							@Pc(137) float local137 = local123 + local59[local97];
							local97 += local36;
							local66[local91] = local137 * 0.25F;
							local91 += local36;
						}
						local93 += local84;
						local97 += local84;
					}
				}
				local66 = local59;
				local59 = local86;
				arg5 = local57;
				arg2 = local53;
				local49 >>= 0x1;
				local57 >>= 0x1;
				local53 >>= 0x1;
				local38++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)V")
	public static void method4401(@OriginalArg(1) int arg0) {
		if (arg0 == Static51.anInt7926) {
			return;
		}
		if (Static51.anInt7926 == 0) {
			Static397.method5991();
		}
		if (arg0 == 12) {
			if (Static150.aString23 == null) {
				Static458.method6747(Static29.aString5, Static15.anInt836, Static469.aString68);
			} else {
				Static122.method2699(Static15.anInt836);
			}
		}
		if (arg0 != 12 && Static494.aClass154_2 != null) {
			Static494.aClass154_2.method4020();
			Static494.aClass154_2 = null;
		}
		if (arg0 == 2) {
			Static41.method1361(Static85.anInt2201 != Static72.anInt2013);
		}
		if (arg0 == 6) {
			Static438.method2399(Static90.anInt2328 != Static85.anInt2201);
		}
		if (arg0 == 4) {
			if (Static150.aString23 == null) {
				Static33.method1295(Static29.aString5, Static469.aString68);
			} else {
				Static74.method1950();
			}
		} else if (arg0 == 5) {
			if (Static150.aString23 == null) {
				Static458.method6747(Static29.aString5, Static15.anInt836, Static469.aString68);
			} else {
				Static122.method2699(Static15.anInt836);
			}
		} else if (arg0 == 8) {
			if (Static150.aString23 == null) {
				Static458.method6747(Static29.aString5, Static15.anInt836, Static469.aString68);
			} else {
				Static122.method2699(Static15.anInt836);
			}
		} else if (arg0 == 11) {
			if (Static150.aString23 == null) {
				Static33.method1295(Static29.aString5, Static469.aString68);
			} else {
				Static74.method1950();
			}
		}
		if (Static329.method5372(Static51.anInt7926)) {
			Static68.aClass160_17.anInt4800 = 2;
			Static76.aClass160_18.anInt4800 = 2;
			Static439.aClass160_71.anInt4800 = 2;
			Static154.aClass160_34.anInt4800 = 2;
			Static542.aClass160_105.anInt4800 = 2;
			Static223.aClass160_49.anInt4800 = 2;
			Static153.aClass160_33.anInt4800 = 2;
		}
		if (Static329.method5372(arg0)) {
			Static68.anInt1930 = 1;
			Static156.anInt3475 = 1;
			Static541.anInt9379 = 0;
			Static188.anInt3984 = 0;
			Static140.anInt3290 = 0;
			Static165.method3262(true);
			Static68.aClass160_17.anInt4800 = 1;
			Static76.aClass160_18.anInt4800 = 1;
			Static439.aClass160_71.anInt4800 = 1;
			Static154.aClass160_34.anInt4800 = 1;
			Static542.aClass160_105.anInt4800 = 1;
			Static223.aClass160_49.anInt4800 = 1;
			Static153.aClass160_33.anInt4800 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static274.method4671();
		}
		if (arg0 == 1) {
			Static501.method7180(Static390.aClass160_80, Static478.aClass9_10);
		} else {
			Static169.method3302();
		}
		@Pc(228) boolean local228 = arg0 == 1 || Static197.method3654(arg0) || Static124.method4352(arg0);
		@Pc(247) boolean local247 = Static51.anInt7926 == 1 || Static197.method3654(Static51.anInt7926) || Static124.method4352(Static51.anInt7926);
		if (local228 != local247) {
			if (local228) {
				Static547.anInt9477 = Static229.anInt4562;
				if (Static89.aClass1_Sub28_Sub1_1.anInt4899 == 0) {
					Static499.method7147();
				} else {
					Static151.method3090(Static45.aClass160_10, Static89.aClass1_Sub28_Sub1_1.anInt4899, Static229.anInt4562);
				}
				Static181.aClass115_2.method3362(false);
			} else {
				Static499.method7147();
				Static181.aClass115_2.method3362(true);
			}
		}
		if (Static329.method5372(arg0) || arg0 == 12) {
			Static478.aClass9_10.method7586();
		}
		Static51.anInt7926 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
	public static void method4402(@OriginalArg(1) int arg0) {
		if (Static331.anInt6223 == arg0) {
			return;
		}
		Static542.anInt9387 = Static36.anInt1324 = Static318.anIntArray428[arg0];
		Static442.method6768();
		Static443.anIntArrayArray74 = new int[Static542.anInt9387][Static36.anInt1324];
		Static520.anIntArrayArray94 = new int[Static542.anInt9387][Static36.anInt1324];
		Static131.anIntArrayArrayArray3 = new int[4][Static542.anInt9387 >> 3][Static36.anInt1324 >> 3];
		for (@Pc(39) int local39 = 0; local39 < 4; local39++) {
			Static70.aClass299Array1[local39] = Static399.method6010(Static542.anInt9387, Static36.anInt1324);
		}
		Static388.aByteArrayArrayArray16 = new byte[4][Static542.anInt9387][Static36.anInt1324];
		Static458.method6746(Static36.anInt1324, Static542.anInt9387);
		Static485.method7021(Static478.aClass9_10, Static36.anInt1324 >> 3, Static542.anInt9387 >> 3);
		Static331.anInt6223 = arg0;
	}
}
