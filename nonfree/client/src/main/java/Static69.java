import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!he", name = "z", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!he", name = "C", descriptor = "Lclient!fc;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!he", name = "D", descriptor = "Z")
	public static boolean aBoolean85;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!qe;")
	public static Class83 aClass83_514 = null;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "I")
	public static int anInt1633 = 0;

	@OriginalMember(owner = "client!he", name = "s", descriptor = "Lclient!ai;")
	public static final Class2_Sub3_Sub1 aClass2_Sub3_Sub1_2 = new Class2_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!he", name = "x", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_515 = Static181.method2795("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!he", name = "F", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_518 = Static181.method2795(" has logged out)3");

	@OriginalMember(owner = "client!he", name = "A", descriptor = "Lclient!qe;")
	public static Class83 aClass83_516 = aClass83_518;

	@OriginalMember(owner = "client!he", name = "B", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_517 = Static181.method2795(")4slr2)3ws?order=LPWM");

	@OriginalMember(owner = "client!he", name = "E", descriptor = "Z")
	public static boolean aBoolean86 = false;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public static void method1293() {
		while (true) {
			if (Static33.aClass2_Sub3_Sub1_1.method277(Static131.anInt2843) >= 27) {
				@Pc(14) int local14 = Static33.aClass2_Sub3_Sub1_1.method285(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static47.aClass24_Sub4_Sub2Array1[local14] == null) {
						Static47.aClass24_Sub4_Sub2Array1[local14] = new Class24_Sub4_Sub2();
						local19 = true;
					}
					@Pc(35) Class24_Sub4_Sub2 local35 = Static47.aClass24_Sub4_Sub2Array1[local14];
					Static207.anIntArray402[Static162.anInt3930++] = local14;
					local35.anInt3309 = Static13.anInt386;
					@Pc(53) int local53 = Static79.anIntArray171[Static33.aClass2_Sub3_Sub1_1.method285(3)];
					if (local19) {
						local35.anInt3318 = local35.anInt3331 = local53;
					}
					@Pc(66) int local66 = Static33.aClass2_Sub3_Sub1_1.method285(5);
					@Pc(71) int local71 = Static33.aClass2_Sub3_Sub1_1.method285(5);
					@Pc(76) int local76 = Static33.aClass2_Sub3_Sub1_1.method285(1);
					if (local76 == 1) {
						Static64.anIntArray130[Static177.anInt3619++] = local14;
					}
					if (local71 > 15) {
						local71 -= 32;
					}
					if (local66 > 15) {
						local66 -= 32;
					}
					local35.aClass2_Sub2_Sub24_1 = Static133.method2214(Static33.aClass2_Sub3_Sub1_1.method285(14));
					@Pc(108) int local108 = Static33.aClass2_Sub3_Sub1_1.method285(1);
					local35.anInt3345 = local35.aClass2_Sub2_Sub24_1.anInt3202;
					local35.anInt3327 = local35.aClass2_Sub2_Sub24_1.anInt3206;
					local35.anInt3350 = local35.aClass2_Sub2_Sub24_1.anInt3200;
					local35.anInt3324 = local35.aClass2_Sub2_Sub24_1.anInt3196;
					local35.anInt3328 = local35.aClass2_Sub2_Sub24_1.anInt3193;
					local35.anInt3292 = local35.aClass2_Sub2_Sub24_1.anInt3219;
					local35.anInt3290 = local35.aClass2_Sub2_Sub24_1.anInt3214;
					if (local35.anInt3345 == 0) {
						local35.anInt3331 = 0;
					}
					local35.anInt3332 = local35.aClass2_Sub2_Sub24_1.anInt3188;
					local35.anInt3289 = local35.aClass2_Sub2_Sub24_1.anInt3195;
					local35.method2524(local71 + Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], local108 == 1, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0] + local66);
					continue;
				}
			}
			Static33.aClass2_Sub3_Sub1_1.method279();
			return;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public static void method1294() {
		@Pc(8) int local8;
		if (Static11.anInt375 > 0) {
			for (local8 = 0; local8 < 256; local8++) {
				if (Static11.anInt375 > 768) {
					Static111.anIntArray254[local8] = Static49.method969(Static106.anIntArray239[local8], Static52.anIntArray105[local8], 1024 - Static11.anInt375);
				} else if (Static11.anInt375 > 256) {
					Static111.anIntArray254[local8] = Static106.anIntArray239[local8];
				} else {
					Static111.anIntArray254[local8] = Static49.method969(Static52.anIntArray105[local8], Static106.anIntArray239[local8], 256 - Static11.anInt375);
				}
			}
		} else if (Static49.anInt1273 > 0) {
			for (local8 = 0; local8 < 256; local8++) {
				if (Static49.anInt1273 > 768) {
					Static111.anIntArray254[local8] = Static49.method969(Static90.anIntArray200[local8], Static52.anIntArray105[local8], 1024 - Static49.anInt1273);
				} else if (Static49.anInt1273 <= 256) {
					Static111.anIntArray254[local8] = Static49.method969(Static52.anIntArray105[local8], Static90.anIntArray200[local8], 256 - Static49.anInt1273);
				} else {
					Static111.anIntArray254[local8] = Static90.anIntArray200[local8];
				}
			}
		} else {
			for (local8 = 0; local8 < 256; local8++) {
				Static111.anIntArray254[local8] = Static52.anIntArray105[local8];
			}
		}
		local8 = 0;
		@Pc(159) int local159 = Static174.aClass2_Sub2_Sub17_Sub1_4.anInt2527 * 9;
		@Pc(161) int local161 = 0;
		@Pc(177) int local177;
		@Pc(187) int local187;
		@Pc(200) int local200;
		@Pc(195) int local195;
		@Pc(204) int local204;
		@Pc(209) int local209;
		for (@Pc(163) int local163 = 1; local163 < 255; local163++) {
			local177 = Static84.anIntArray179[local163] * (256 - local163) / 256 + 22;
			if (local177 < 0) {
				local177 = 0;
			}
			local8 += local177;
			for (local187 = local177; local187 < 128; local187++) {
				local195 = Static174.aClass2_Sub2_Sub17_Sub1_4.anIntArray252[local159++];
				local200 = Static166.anIntArray322[local8++];
				if (local200 == 0) {
					Static188.aClass2_Sub2_Sub17_Sub1_5.anIntArray252[local161++] = local195;
				} else {
					local204 = local200;
					local209 = 256 - local200;
					local200 = Static111.anIntArray254[local200];
					Static188.aClass2_Sub2_Sub17_Sub1_5.anIntArray252[local161++] = ((local195 & 0xFF00FF) * local209 + local204 * (local200 & 0xFF00FF) & 0xFF00FF00) + (local204 * (local200 & 0xFF00) + local209 * (local195 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			for (local200 = 0; local200 < local177; local200++) {
				Static188.aClass2_Sub2_Sub17_Sub1_5.anIntArray252[local161++] = Static174.aClass2_Sub2_Sub17_Sub1_4.anIntArray252[local159++];
			}
			local159 += Static174.aClass2_Sub2_Sub17_Sub1_4.anInt2527 - 128;
		}
		Static188.aClass2_Sub2_Sub17_Sub1_5.method1907(0, 9);
		local8 = 0;
		local159 = Static174.aClass2_Sub2_Sub17_Sub1_4.anInt2527 * 9 + 128;
		local161 = 0;
		for (local177 = 1; local177 < 255; local177++) {
			local187 = (256 - local177) * Static84.anIntArray179[local177] / 256 + 22;
			if (local187 < 0) {
				local187 = 0;
			}
			for (local200 = 0; local200 < local187; local200++) {
				@Pc(334) int local334 = local161++;
				local159--;
				Static27.aClass2_Sub2_Sub17_Sub1_2.anIntArray252[local334] = Static174.aClass2_Sub2_Sub17_Sub1_4.anIntArray252[local159];
			}
			for (local195 = local187; local195 < 128; local195++) {
				local204 = Static166.anIntArray322[local8++];
				local159--;
				local209 = Static174.aClass2_Sub2_Sub17_Sub1_4.anIntArray252[local159];
				if (local204 == 0) {
					Static27.aClass2_Sub2_Sub17_Sub1_2.anIntArray252[local161++] = local209;
				} else {
					@Pc(372) int local372 = local204;
					@Pc(376) int local376 = 256 - local204;
					local204 = Static111.anIntArray254[local204];
					Static27.aClass2_Sub2_Sub17_Sub1_2.anIntArray252[local161++] = ((local209 & 0xFF00) * local376 + (local204 & 0xFF00) * local372 & 0xFF0000) + (local376 * (local209 & 0xFF00FF) + local372 * (local204 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local159 += Static174.aClass2_Sub2_Sub17_Sub1_4.anInt2527 + 128;
			local8 += local187;
		}
		Static27.aClass2_Sub2_Sub17_Sub1_2.method1907(637, 9);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!eh;Lclient!eh;ZLclient!eh;)V")
	public static void method1295(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(3) Class28 arg2) {
		Static92.aClass28_94 = arg1;
		Static74.aClass28_80 = arg0;
		Static138.aClass28_138 = arg2;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIII)V")
	public static void method1300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg3 - arg2;
		@Pc(14) int local14 = arg1 - arg0;
		if (local14 == 0) {
			if (local5 != 0) {
				Static211.method3197(arg0, arg2, arg4, arg3);
			}
		} else if (local5 == 0) {
			Static99.method1686(arg1, arg0, arg4, arg2);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local5 < 0) {
				local5 = -local5;
			}
			@Pc(57) boolean local57 = local14 < local5;
			@Pc(61) int local61;
			@Pc(63) int local63;
			if (local57) {
				local61 = arg0;
				local63 = arg1;
				arg0 = arg2;
				arg2 = local61;
				arg1 = arg3;
				arg3 = local63;
			}
			if (arg1 < arg0) {
				local61 = arg0;
				arg0 = arg1;
				local63 = arg2;
				arg2 = arg3;
				arg1 = local61;
				arg3 = local63;
			}
			local61 = arg2;
			local63 = arg1 - arg0;
			@Pc(103) int local103 = arg2 >= arg3 ? -1 : 1;
			@Pc(113) int local113 = -(local63 >> 1);
			@Pc(118) int local118 = arg3 - arg2;
			if (local118 < 0) {
				local118 = -local118;
			}
			@Pc(127) int local127;
			if (local57) {
				for (local127 = arg0; local127 <= arg1; local127++) {
					Static14.anIntArrayArray18[local127][local61] = arg4;
					local113 += local118;
					if (local113 > 0) {
						local61 += local103;
						local113 -= local63;
					}
				}
			} else {
				for (local127 = arg0; local127 <= arg1; local127++) {
					Static14.anIntArrayArray18[local61][local127] = arg4;
					local113 += local118;
					if (local113 > 0) {
						local61 += local103;
						local113 -= local63;
					}
				}
			}
		}
	}
}
