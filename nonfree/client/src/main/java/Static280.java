import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
	public static int anInt4896;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
	public static int anInt4897;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "[I")
	public static int[] anIntArray442 = new int[1];

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "Z")
	public static boolean aBoolean347 = true;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "[Lclient!nl;")
	public static final Class4_Sub1_Sub12[] aClass4_Sub1_Sub12Array5 = new Class4_Sub1_Sub12[14];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method3737() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static293.aBooleanArray21[local7] = false;
		}
		Static134.anInt2621 = 5;
		Static195.anInt2839 = Static175.anInt3261;
		Static151.anInt2870 = Static292.anInt5287;
		Static15.anInt417 = 0;
		anInt4896 = 0;
		Static60.anInt1574 = Static30.anInt696;
		Static277.anInt4877 = Static183.anInt3503;
		Static370.anInt6532 = Static142.anInt2687;
		Static282.anInt4959 = -1;
		Static52.anInt1388 = -1;
		Static227.anInt4162 = Static254.anInt4614;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!jb;BLclient!qa;)V")
	public static void method3739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(4) Class30 arg3) {
		@Pc(10) Class57 local10 = arg2.method2671(arg3);
		if (local10 == null) {
			return;
		}
		arg3.pa(arg1, arg0, arg2.anInt3421 + arg1, arg0 - -arg2.anInt3442);
		if (Static421.anInt7104 == 2 || Static421.anInt7104 == 5 || Static195.aClass3_8 == null) {
			arg3.j(-16777216, local10, arg1, arg0);
			return;
		}
		@Pc(56) int local56;
		@Pc(73) int local73;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (Static134.anInt2621 == 4) {
			local64 = (int) -Static146.aFloat82 & 0x3FFF;
			local56 = Static207.anInt3914;
			local73 = Static110.anInt2331;
			local70 = 4096;
		} else {
			local56 = Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062;
			local64 = Static94.anInt2046 + (int) -Static146.aFloat82 & 0x3FFF;
			local70 = 4096 - Static109.anInt6939 * 16;
			local73 = Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061;
		}
		@Pc(100) int local100 = local56 / 32 + 48 - (Static126.anInt2569 - 104) * 2;
		@Pc(117) int local117 = Static190.anInt3697 * 4 + 48 - (Static190.anInt3697 - 104) * 2 - local73 / 32;
		Static195.aClass3_8.method5880((float) arg2.anInt3421 / 2.0F + (float) arg1, (float) arg2.anInt3442 / 2.0F + (float) arg0, (float) local100, (float) local117, local70, local64 << 2, local10, arg1, arg0);
		@Pc(169) int local169;
		@Pc(179) int local179;
		@Pc(190) int local190;
		@Pc(200) int local200;
		for (@Pc(153) Class4_Sub15 local153 = (Class4_Sub15) Static87.aClass258_15.method5538(); local153 != null; local153 = (Class4_Sub15) Static87.aClass258_15.method5528()) {
			@Pc(158) int local158 = local153.anInt2603;
			local169 = (Static406.aClass257_3.anIntArray631[local158] >> 14 & 0x3FFF) - Static381.anInt6688;
			local179 = (Static406.aClass257_3.anIntArray631[local158] & 0x3FFF) - Static285.anInt5187;
			local190 = local169 * 4 + 2 - local56 / 32;
			local200 = local179 * 4 + 2 - local73 / 32;
			Static424.method5493(Static406.aClass257_3.anIntArray632[local158], local200, arg0, arg3, arg1, local190, arg2, local10);
		}
		for (local169 = 0; local169 < Static202.anInt3890; local169++) {
			local179 = Static421.anIntArray626[local169] * 4 + 2 - local56 / 32;
			local190 = Static272.anIntArray437[local169] * 4 + 2 - local73 / 32;
			@Pc(257) Class71 local257 = Static2.aClass74_13.method1683(Static277.anIntArray441[local169]);
			if (local257.anIntArray138 != null) {
				local257 = local257.method1626(Static155.aClass149_1);
				if (local257 == null || local257.anInt2201 == -1) {
					continue;
				}
			}
			Static424.method5493(local257.anInt2201, local190, arg0, arg3, arg1, local179, arg2, local10);
		}
		for (@Pc(300) Class4_Sub20 local300 = (Class4_Sub20) Static437.aClass196_41.method4482(); local300 != null; local300 = (Class4_Sub20) Static437.aClass196_41.method4472()) {
			local190 = (int) (local300.aLong225 >> 28 & 0x3L);
			if (local190 == Static416.anInt7072) {
				local200 = (int) (local300.aLong225 & 0x3FFFL) * 4 + 2 - local56 / 32;
				@Pc(345) int local345 = (int) (local300.aLong225 >> 14 & 0x3FFFL) * 4 + 2 - local73 / 32;
				Static134.method1948(local10, arg2, Static134.aClass3Array5[0], local345, local200, arg1, arg0);
			}
		}
		@Pc(421) int local421;
		for (local190 = 0; local190 < Static249.anInt4520; local190++) {
			@Pc(373) Class6_Sub2_Sub1_Sub2 local373 = Static176.aClass6_Sub2_Sub1_Sub2Array1[Static128.anIntArray171[local190]];
			if (local373 != null && local373.method4777() && Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86 == local373.aByte86) {
				@Pc(393) Class243 local393 = local373.aClass243_1;
				if (local393 != null && local393.anIntArray613 != null) {
					local393 = local393.method5337(Static155.aClass149_1);
				}
				if (local393 != null && local393.aBoolean458 && local393.aBoolean461) {
					local421 = local373.anInt6062 / 32 - local56 / 32;
					@Pc(431) int local431 = local373.anInt6061 / 32 - local73 / 32;
					if (local393.anInt6908 == -1) {
						Static134.method1948(local10, arg2, Static134.aClass3Array5[1], local431, local421, arg1, arg0);
					} else {
						Static424.method5493(local393.anInt6908, local431, arg0, arg3, arg1, local421, arg2, local10);
					}
				}
			}
		}
		local200 = Static58.anInt4352;
		@Pc(467) int[] local467 = Static144.anIntArray186;
		@Pc(505) int local505;
		@Pc(515) int local515;
		@Pc(519) int local519;
		for (local421 = 0; local421 < local200; local421++) {
			@Pc(477) Class6_Sub2_Sub1_Sub1 local477 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local467[local421]];
			if (local477 != null && local477.method714() && Static375.aClass6_Sub2_Sub1_Sub1_3 != local477 && local477.aByte86 == Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86) {
				local505 = local477.anInt6062 / 32 - local56 / 32;
				local515 = local477.anInt6061 / 32 - local73 / 32;
				@Pc(517) boolean local517 = false;
				for (local519 = 0; local519 < Static22.anInt6850; local519++) {
					if (local477.aString11.equals(Static291.aStringArray33[local519]) && Static265.anIntArray275[local519] != 0) {
						local517 = true;
						break;
					}
				}
				@Pc(542) boolean local542 = false;
				for (@Pc(544) int local544 = 0; local544 < Static223.anInt4124; local544++) {
					if (local477.aString11.equals(Static2.aClass219Array10[local544].aString61)) {
						local542 = true;
						break;
					}
				}
				@Pc(568) boolean local568 = false;
				if (Static375.aClass6_Sub2_Sub1_Sub1_3.anInt986 != 0 && local477.anInt986 != 0 && Static375.aClass6_Sub2_Sub1_Sub1_3.anInt986 == local477.anInt986) {
					local568 = true;
				}
				if (local477.aBoolean54) {
					Static134.method1948(local10, arg2, Static134.aClass3Array5[6], local515, local505, arg1, arg0);
				} else if (local517) {
					Static134.method1948(local10, arg2, Static134.aClass3Array5[3], local515, local505, arg1, arg0);
				} else if (local542) {
					Static134.method1948(local10, arg2, Static134.aClass3Array5[5], local515, local505, arg1, arg0);
				} else if (local568) {
					Static134.method1948(local10, arg2, Static134.aClass3Array5[4], local515, local505, arg1, arg0);
				} else {
					Static134.method1948(local10, arg2, Static134.aClass3Array5[2], local515, local505, arg1, arg0);
				}
			}
		}
		@Pc(672) Class80[] local672 = Static118.aClass80Array1;
		@Pc(758) int local758;
		for (local505 = 0; local505 < local672.length; local505++) {
			@Pc(680) Class80 local680 = local672[local505];
			if (local680 != null && local680.anInt2470 != 0 && Static175.anInt3261 % 20 < 10) {
				@Pc(732) int local732;
				if (local680.anInt2470 == 1 && local680.anInt2465 >= 0 && Static176.aClass6_Sub2_Sub1_Sub2Array1.length > local680.anInt2465) {
					@Pc(710) Class6_Sub2_Sub1_Sub2 local710 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local680.anInt2465];
					if (local710 != null) {
						local519 = local710.anInt6062 / 32 - local56 / 32;
						local732 = local710.anInt6061 / 32 - local73 / 32;
						Static21.method446(arg2, 360000L, arg1, local10, local680.anInt2468, arg0, local519, local732);
					}
				}
				if (local680.anInt2470 == 2) {
					local758 = local680.anInt2463 / 32 - local56 / 32;
					local519 = local680.anInt2467 / 32 - local73 / 32;
					@Pc(774) long local774 = (long) (local680.anInt2460 << 5);
					@Pc(778) long local778 = local774 * local774;
					Static21.method446(arg2, local778, arg1, local10, local680.anInt2468, arg0, local758, local519);
				}
				if (local680.anInt2470 == 10 && local680.anInt2465 >= 0 && local680.anInt2465 < Static171.aClass6_Sub2_Sub1_Sub1Array1.length) {
					@Pc(815) Class6_Sub2_Sub1_Sub1 local815 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local680.anInt2465];
					if (local815 != null) {
						local519 = local815.anInt6062 / 32 - local56 / 32;
						local732 = local815.anInt6061 / 32 - local73 / 32;
						Static21.method446(arg2, 360000L, arg1, local10, local680.anInt2468, arg0, local519, local732);
					}
				}
			}
		}
		if (Static134.anInt2621 == 4) {
			return;
		}
		if (Static454.anInt7591 != 0) {
			local515 = Static454.anInt7591 * 4 + Static375.aClass6_Sub2_Sub1_Sub1_3.method4763() * 2 + 2 - local56 / 32 - 2;
			local758 = Static52.anInt1390 * 4 + (Static375.aClass6_Sub2_Sub1_Sub1_3.method4763() + -1) * 2 + 2 - local73 / 32;
			Static134.method1948(local10, arg2, Static145.aClass3Array7[Static319.aBoolean380 ? 1 : 0], local758, local515, arg1, arg0);
		}
		arg3.method4692(3, 3, arg2.anInt3421 / 2 + arg1 - 1, -1, arg2.anInt3442 / 2 + arg0 - 1);
	}
}
