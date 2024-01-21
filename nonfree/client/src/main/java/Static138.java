import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
	public static int anInt655;

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_153 = Static158.method3034("null");

	@OriginalMember(owner = "client!pe", name = "E", descriptor = "Lclient!md;")
	public static final Class51 aClass51_2 = new Class51(32);

	@OriginalMember(owner = "client!pe", name = "W", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_154 = Static158.method3034("Hidden)2use");

	@OriginalMember(owner = "client!pe", name = "Z", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_155 = Static158.method3034("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
	public static int anInt686 = 128;

	@OriginalMember(owner = "client!pe", name = "bb", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_156 = Static158.method3034("No reply from loginserver)3");

	@OriginalMember(owner = "client!pe", name = "cb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_157 = aClass60_156;

	@OriginalMember(owner = "client!pe", name = "db", descriptor = "[J")
	public static final long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	public static void method510() {
		Static145.aClass89_55.method3439();
		Static47.aClass89_38.method3439();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!i;ILclient!i;)V")
	public static void method534(@OriginalArg(0) Class2_Sub1_Sub7_Sub3_Sub1 arg0, @OriginalArg(2) Class2_Sub1_Sub7_Sub3_Sub1 arg1) {
		if (Static80.aBoolean96) {
			Static26.method641(arg1, arg0);
			return;
		}
		if (Static144.anInt3778 == 0 || Static144.anInt3778 == 5) {
			arg0.method1793(Static76.aClass60_619, 382, 225, 16777215, -1);
			Static133.method2111(230, 233, 304, 34, 9179409);
			Static133.method2111(231, 234, 302, 32, 0);
			Static133.method2120(232, 235, Static180.anInt3284 * 3, 30, 9179409);
			Static133.method2120(Static180.anInt3284 * 3 + 232, 235, 300 - Static180.anInt3284 * 3, 30, 0);
			arg0.method1793(Static95.aClass60_775, 382, 256, 16777215, -1);
		}
		@Pc(90) short local90;
		@Pc(113) int local113;
		if (Static144.anInt3778 == 20) {
			local90 = 211;
			Static140.aClass2_Sub1_Sub7_Sub2_1.method1202(382 - Static140.aClass2_Sub1_Sub7_Sub2_1.anInt1596 / 2, 271 - Static140.aClass2_Sub1_Sub7_Sub2_1.anInt1594 / 2);
			arg0.method1793(Static95.aClass60_776, 382, 211, 16776960, 0);
			local113 = local90 + 15;
			arg0.method1793(Static95.aClass60_781, 382, 226, 16776960, 0);
			@Pc(121) int local121 = local113 + 15;
			arg0.method1793(Static95.aClass60_782, 382, 241, 16776960, 0);
			@Pc(129) int local129 = local121 + 15;
			@Pc(130) int local130 = local129 + 10;
			arg0.method1786(Static193.method3536(new Class60[] { Static165.aClass60_1125, Static124.method1777(Static95.aClass60_784) }), 272, 266, 16777215, 0);
			@Pc(150) int local150 = local130 + 15;
			arg0.method1786(Static193.method3536(new Class60[] { Static103.aClass60_837, Static95.aClass60_778.method2696() }), 274, 281, 16777215, 0);
			@Pc(171) int local171 = local150 + 15;
		}
		if (Static144.anInt3778 == 10) {
			Static140.aClass2_Sub1_Sub7_Sub2_1.method1202(202, 171);
			if (Static58.anInt1813 == 0) {
				local90 = 251;
				arg0.method1793(Static125.aClass60_955, 382, 251, 16776960, 0);
				local113 = local90 + 30;
				Static191.aClass2_Sub1_Sub7_Sub2_4.method1202(229, 271);
				arg0.method1791(Static7.aClass60_1326, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static191.aClass2_Sub1_Sub7_Sub2_4.method1202(389, 271);
				arg0.method1791(Static83.aClass60_667, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static58.anInt1813 == 2) {
				local90 = 211;
				arg0.method1793(Static95.aClass60_776, 382, 211, 16776960, 0);
				local113 = local90 + 15;
				arg0.method1793(Static95.aClass60_781, 382, 226, 16776960, 0);
				local113 += 15;
				arg0.method1793(Static95.aClass60_782, 382, 241, 16776960, 0);
				@Pc(363) boolean local363;
				if (Static190.anInt4541 == 0 && Static20.anInt580 % 40 < 20 && Static101.aBoolean113) {
					local363 = true;
				} else {
					local363 = false;
				}
				local113 += 15;
				local113 += 10;
				arg0.method1786(Static193.method3536(new Class60[] { Static165.aClass60_1125, Static124.method1777(Static95.aClass60_784), local363 ? Static130.aClass60_980 : Static95.aClass60_777 }), 272, 266, 16777215, 0);
				if (Static190.anInt4541 == 1 && Static20.anInt580 % 40 < 20 && Static101.aBoolean113) {
					local363 = true;
				} else {
					local363 = false;
				}
				local113 += 15;
				arg0.method1786(Static193.method3536(new Class60[] { Static103.aClass60_837, Static95.aClass60_778.method2696(), local363 ? Static130.aClass60_980 : Static95.aClass60_777 }), 274, 281, 16777215, 0);
				local113 += 15;
				Static191.aClass2_Sub1_Sub7_Sub2_4.method1202(229, 301);
				arg0.method1793(Static75.aClass60_610, 302, 326, 16777215, 0);
				Static191.aClass2_Sub1_Sub7_Sub2_4.method1202(389, 301);
				arg0.method1793(Static43.aClass60_311, 462, 326, 16777215, 0);
			} else if (Static58.anInt1813 == 3) {
				local90 = 236;
				arg0.method1793(Static164.aClass60_1117, 382, 211, 16776960, 0);
				arg0.method1793(Static113.aClass60_888, 382, 236, 16777215, 0);
				local113 = local90 + 15;
				arg0.method1793(Static65.aClass60_493, 382, 251, 16777215, 0);
				local113 += 15;
				arg0.method1793(Static86.aClass60_693, 382, 266, 16777215, 0);
				local113 += 15;
				arg0.method1793(Static1.aClass60_8, 382, 281, 16777215, 0);
				Static191.aClass2_Sub1_Sub7_Sub2_4.method1202(309, 301);
				local113 += 15;
				arg0.method1793(Static43.aClass60_311, 382, 326, 16777215, 0);
			}
		}
		if (Static143.anInt3755 != 1) {
			if (Static102.anInt2944 > 0) {
				Static94.method2241(Static102.anInt2944);
				Static102.anInt2944 = 0;
			}
			Static164.method3096();
		}
		Static181.aClass2_Sub1_Sub7_Sub2Array9[Static125.aBoolean126 ? 1 : 0].method1202(725, 463);
		if (Static144.anInt3778 <= 5 || Static128.anInt3498 == 2 || Static132.anInt3564 != 0) {
			return;
		}
		if (Static145.aClass2_Sub1_Sub7_Sub2_3 == null) {
			Static145.aClass2_Sub1_Sub7_Sub2_3 = Static48.method1097(Static99.aClass13_Sub1_13, Static115.anInt3212);
		}
		if (Static145.aClass2_Sub1_Sub7_Sub2_3 == null) {
			return;
		}
		Static145.aClass2_Sub1_Sub7_Sub2_3.method1202(5, 463);
		arg0.method1793(Static193.method3536(new Class60[] { Static57.aClass60_411, Static46.aClass60_330, Static72.method1661(Static156.anInt3974) }), 55, 478, 16777215, 0);
		if (Static21.aClass92_1 == null) {
			arg1.method1793(Static100.aClass60_797, 55, 492, 16777215, 0);
			return;
		}
		arg1.method1793(Static177.aClass60_1187, 55, 492, 16777215, 0);
		return;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!ra;BI)V")
	public static void method539(@OriginalArg(0) int arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(3) int arg2) {
		if (Static166.anInt4104 != 0 && Static166.anInt4104 != 3) {
			return;
		}
		@Pc(21) int local21 = arg0 - arg1.anInt3871 / 2;
		@Pc(28) int local28 = arg2 - arg1.anInt3878 / 2;
		@Pc(34) int local34 = Static88.anInt2591 + Static188.anInt4484 & 0x7FF;
		@Pc(38) int local38 = Class2_Sub1_Sub7_Sub1.anIntArray133[local34];
		@Pc(42) int local42 = Class2_Sub1_Sub7_Sub1.anIntArray129[local34];
		@Pc(50) int local50 = (Static105.anInt3614 + 256) * local38 >> 8;
		@Pc(58) int local58 = local42 * (Static105.anInt3614 + 256) >> 8;
		@Pc(68) int local68 = local21 * local50 + local28 * local58 >> 11;
		@Pc(76) int local76 = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302 + local68 >> 7;
		@Pc(86) int local86 = local21 * local58 - local28 * local50 >> 11;
		@Pc(94) int local94 = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273 - local86 >> 7;
		@Pc(114) boolean local114 = Static145.method2926(1, 0, local76, local94, true, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 0);
		if (!local114) {
			return;
		}
		Static7.aClass2_Sub3_Sub1_43.method224(local28);
		Static7.aClass2_Sub3_Sub1_43.method224(local21);
		Static7.aClass2_Sub3_Sub1_43.method199(Static188.anInt4484);
		Static7.aClass2_Sub3_Sub1_43.method224(57);
		Static7.aClass2_Sub3_Sub1_43.method224(Static88.anInt2591);
		Static7.aClass2_Sub3_Sub1_43.method224(Static105.anInt3614);
		Static7.aClass2_Sub3_Sub1_43.method224(89);
		Static7.aClass2_Sub3_Sub1_43.method199(Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3302);
		Static7.aClass2_Sub3_Sub1_43.method199(Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anInt3273);
		Static7.aClass2_Sub3_Sub1_43.method224(Static15.anInt516);
		Static7.aClass2_Sub3_Sub1_43.method224(63);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg5 && arg0 == arg3 && arg6 == arg8 && arg1 == arg7) {
			Static164.method3100(arg7, arg0, arg4, arg5, arg8);
			return;
		}
		@Pc(36) int local36 = arg5;
		@Pc(38) int local38 = arg0;
		@Pc(42) int local42 = arg5 * 3;
		@Pc(46) int local46 = arg2 * 3;
		@Pc(50) int local50 = arg0 * 3;
		@Pc(54) int local54 = arg6 * 3;
		@Pc(58) int local58 = arg3 * 3;
		@Pc(62) int local62 = arg1 * 3;
		@Pc(72) int local72 = arg8 + local46 - local54 - arg5;
		@Pc(81) int local81 = arg7 + local58 - local62 - arg0;
		@Pc(91) int local91 = local62 + local50 - local58 - local58;
		@Pc(101) int local101 = local42 + local54 - local46 - local46;
		@Pc(106) int local106 = local58 - local50;
		@Pc(111) int local111 = local46 - local42;
		for (@Pc(113) int local113 = 128; local113 <= 4096; local113 += 128) {
			@Pc(121) int local121 = local113 * local113 >> 12;
			@Pc(127) int local127 = local121 * local113 >> 12;
			@Pc(131) int local131 = local127 * local72;
			@Pc(135) int local135 = local101 * local121;
			@Pc(139) int local139 = local91 * local121;
			@Pc(143) int local143 = local106 * local113;
			@Pc(147) int local147 = local111 * local113;
			@Pc(157) int local157 = (local147 + local135 + local131 >> 12) + arg5;
			@Pc(161) int local161 = local127 * local81;
			@Pc(172) int local172 = arg0 + (local143 + local161 + local139 >> 12);
			Static164.method3100(local172, local38, arg4, local36, local157);
			local38 = local172;
			local36 = local157;
		}
	}
}
