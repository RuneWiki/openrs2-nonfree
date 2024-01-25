import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
	public static int anInt6255;

	@OriginalMember(owner = "client!wg", name = "X", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!wg", name = "Y", descriptor = "[I")
	public static int[] anIntArray732;

	@OriginalMember(owner = "client!wg", name = "P", descriptor = "Lclient!rt;")
	public static final Class205 aClass205_4 = new Class205(2);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIZIII)V")
	public static void method5440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg5 && arg0 == arg4 && arg1 == arg8 && arg6 == arg3) {
			Static181.method4752(arg3, arg5, arg1, arg4, arg7);
			return;
		}
		@Pc(36) int local36 = arg5;
		@Pc(38) int local38 = arg4;
		@Pc(42) int local42 = arg5 * 3;
		@Pc(46) int local46 = arg4 * 3;
		@Pc(50) int local50 = arg2 * 3;
		@Pc(54) int local54 = arg0 * 3;
		@Pc(58) int local58 = arg8 * 3;
		@Pc(62) int local62 = arg6 * 3;
		@Pc(71) int local71 = arg1 + local50 - local58 - arg5;
		@Pc(80) int local80 = local54 + arg3 - local62 - arg4;
		@Pc(89) int local89 = local58 + local42 - local50 - local50;
		@Pc(98) int local98 = local46 + local62 - local54 - local54;
		@Pc(103) int local103 = local50 - local42;
		@Pc(108) int local108 = local54 - local46;
		for (@Pc(110) int local110 = 128; local110 <= 4096; local110 += 128) {
			@Pc(118) int local118 = local110 * local110 >> 12;
			@Pc(124) int local124 = local110 * local118 >> 12;
			@Pc(128) int local128 = local124 * local71;
			@Pc(132) int local132 = local80 * local124;
			@Pc(136) int local136 = local118 * local89;
			@Pc(140) int local140 = local118 * local98;
			@Pc(144) int local144 = local110 * local103;
			@Pc(148) int local148 = local110 * local108;
			@Pc(158) int local158 = (local144 + local136 + local128 >> 12) + arg5;
			@Pc(169) int local169 = arg4 + (local148 + local140 + local132 >> 12);
			Static181.method4752(local169, local36, local158, local38, arg7);
			local36 = local158;
			local38 = local169;
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
	public static void method5442() {
		if (Static6.aClass130_1 != null) {
			Static6.aClass130_1.method2668();
			Static6.aClass130_1 = null;
		}
		Static81.method1214();
		Static314.method4644();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static257.aClass222Array1[local17].method4831();
		}
		Static32.method500(false);
		System.gc();
		Static301.method4496();
		Static12.aBoolean13 = false;
		Static91.anInt1663 = -1;
		Static269.method785(true);
		Static53.aBoolean97 = false;
		Static275.anInt4800 = 0;
		Static293.anInt5053 = 0;
		Static256.anInt4410 = 0;
		Static35.anInt682 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static274.aClass11Array1.length; local58++) {
			Static274.aClass11Array1[local58] = null;
		}
		Static155.method2337();
		for (@Pc(77) int local77 = 0; local77 < 2048; local77++) {
			Static225.aClass25_Sub1_Sub1_Sub1Array3[local77] = null;
		}
		Static309.anInt5243 = 0;
		for (@Pc(93) int local93 = 0; local93 < 32768; local93++) {
			Static171.aClass25_Sub1_Sub1_Sub2Array1[local93] = null;
		}
		Static338.aClass77_34.method1362();
		Static223.method3098();
		Static68.anInt1378 = 0;
		Static230.aClass72_3.method1344();
		Static130.method1901();
		Static3.method18();
		Static176.method2587(true);
		try {
			Static396.method1248(Static341.aClass162_5.anApplet1, "loggedout");
		} catch (@Pc(128) Throwable local128) {
		}
		Static88.aClass1_Sub21_1 = null;
		Static370.aLong196 = 0L;
	}
}
