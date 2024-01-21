import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!uc", name = "Ib", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!uc", name = "Kb", descriptor = "I")
	public static int anInt4074;

	@OriginalMember(owner = "client!uc", name = "Rb", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!uc", name = "Fb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1896 = Static187.method3089("sch-Utteln:");

	@OriginalMember(owner = "client!uc", name = "Jb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1897 = Static187.method3089("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!uc", name = "Mb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1898 = Static187.method3089("<col=ffff00>");

	@OriginalMember(owner = "client!uc", name = "Qb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1899 = aClass92_1897;

	@OriginalMember(owner = "client!uc", name = "Sb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1900 = null;

	@OriginalMember(owner = "client!uc", name = "Ub", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1901 = Static187.method3089("cross");

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg0 && arg5 == arg8 && arg3 == arg4 && arg2 == arg6) {
			Static76.method1147(arg1, arg5, arg3, arg6, arg0);
			return;
		}
		@Pc(43) int local43 = arg0;
		@Pc(45) int local45 = arg5;
		@Pc(49) int local49 = arg5 * 3;
		@Pc(53) int local53 = arg8 * 3;
		@Pc(57) int local57 = arg7 * 3;
		@Pc(61) int local61 = arg2 * 3;
		@Pc(65) int local65 = arg0 * 3;
		@Pc(69) int local69 = arg4 * 3;
		@Pc(78) int local78 = arg3 + local57 - local69 - arg0;
		@Pc(87) int local87 = local53 + arg6 - local61 - arg5;
		@Pc(96) int local96 = local69 + local65 - local57 - local57;
		@Pc(101) int local101 = local57 - local65;
		@Pc(105) int local105 = local53 - local49;
		@Pc(114) int local114 = local49 + local61 - local53 - local53;
		for (@Pc(116) int local116 = 128; local116 <= 4096; local116 += 128) {
			@Pc(124) int local124 = local116 * local116 >> 12;
			@Pc(130) int local130 = local124 * local116 >> 12;
			@Pc(134) int local134 = local87 * local130;
			@Pc(138) int local138 = local78 * local130;
			@Pc(142) int local142 = local114 * local124;
			@Pc(146) int local146 = local116 * local101;
			@Pc(150) int local150 = local124 * local96;
			@Pc(160) int local160 = (local150 + local138 + local146 >> 12) + arg0;
			@Pc(164) int local164 = local105 * local116;
			@Pc(176) int local176 = arg5 + (local142 + local134 + local164 >> 12);
			Static76.method1147(arg1, local45, local160, local176, local43);
			local45 = local176;
			local43 = local160;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ba;III)V")
	public static void method3066(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static61.anInt1466 != 0 && Static61.anInt1466 != 3) {
			return;
		}
		@Pc(18) int local18 = arg1 - arg0.anInt263 / 2;
		@Pc(25) int local25 = arg2 - arg0.anInt312 / 2;
		@Pc(31) int local31 = Static31.anInt742 + Static106.anInt2306 & 0x7FF;
		@Pc(35) int local35 = Class1_Sub3_Sub1_Sub4.anIntArray317[local31];
		@Pc(43) int local43 = local35 * (Static183.anInt3930 + 256) >> 8;
		@Pc(47) int local47 = Class1_Sub3_Sub1_Sub4.anIntArray320[local31];
		@Pc(55) int local55 = local47 * (Static183.anInt3930 + 256) >> 8;
		@Pc(71) int local71 = local18 * local43 - local55 * local25 >> 11;
		@Pc(82) int local82 = local55 * local18 + local43 * local25 >> 11;
		@Pc(89) int local89 = Static15.aClass8_Sub3_Sub1_1.anInt3600 + local82 >> 7;
		@Pc(97) int local97 = Static15.aClass8_Sub3_Sub1_1.anInt3606 - local71 >> 7;
		@Pc(117) boolean local117 = Static55.method911(true, 1, 0, 0, 0, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local97, local89);
		if (!local117) {
			return;
		}
		Static38.aClass1_Sub14_Sub1_3.method3024(local25);
		Static38.aClass1_Sub14_Sub1_3.method3024(local18);
		Static38.aClass1_Sub14_Sub1_3.method3020(Static106.anInt2306);
		Static38.aClass1_Sub14_Sub1_3.method3024(57);
		Static38.aClass1_Sub14_Sub1_3.method3024(Static31.anInt742);
		Static38.aClass1_Sub14_Sub1_3.method3024(Static183.anInt3930);
		Static38.aClass1_Sub14_Sub1_3.method3024(89);
		Static38.aClass1_Sub14_Sub1_3.method3020(Static15.aClass8_Sub3_Sub1_1.anInt3600);
		Static38.aClass1_Sub14_Sub1_3.method3020(Static15.aClass8_Sub3_Sub1_1.anInt3606);
		Static38.aClass1_Sub14_Sub1_3.method3024(Static36.anInt1019);
		Static38.aClass1_Sub14_Sub1_3.method3024(63);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZILclient!ab;ILclient!ab;)Lclient!r;")
	public static Class1_Sub3_Sub1_Sub3_Sub1 method3068(@OriginalArg(1) int arg0, @OriginalArg(2) Class3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3 arg3) {
		return Static42.method736(arg1, arg2, arg0) ? Static7.method139(arg3.method3265(arg0, arg2)) : null;
	}
}
