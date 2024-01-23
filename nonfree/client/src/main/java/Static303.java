import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!vm", name = "u", descriptor = "F")
	public static float aFloat55;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
	public static int anInt5848 = -1;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
	public static int anInt5850 = 0;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "[Lclient!ji;")
	public static Class86[] aClass86Array1 = new Class86[50];

	@OriginalMember(owner = "client!vm", name = "K", descriptor = "I")
	public static int anInt5868 = -1;

	@OriginalMember(owner = "client!vm", name = "ub", descriptor = "[I")
	public static int[] anIntArray574 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!g;)V")
	public static void method4606(@OriginalArg(1) Class56 arg0) {
		@Pc(8) int local8 = arg0.anInt2074;
		if (local8 == 324) {
			if (Static15.anInt321 == -1) {
				Static301.anInt5804 = arg0.anInt2059;
				Static15.anInt321 = arg0.anInt2112;
			}
			if (Static108.aClass97_1.aBoolean234) {
				arg0.anInt2112 = Static15.anInt321;
			} else {
				arg0.anInt2112 = Static301.anInt5804;
			}
		} else if (local8 == 325) {
			if (Static15.anInt321 == -1) {
				Static301.anInt5804 = arg0.anInt2059;
				Static15.anInt321 = arg0.anInt2112;
			}
			if (Static108.aClass97_1.aBoolean234) {
				arg0.anInt2112 = Static301.anInt5804;
			} else {
				arg0.anInt2112 = Static15.anInt321;
			}
		} else if (local8 == 327) {
			arg0.anInt2042 = 150;
			arg0.anInt2109 = (int) (Math.sin((double) Static268.anInt5236 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2043 = -1;
			arg0.anInt2103 = 5;
		} else if (local8 == 328) {
			if (Static22.aClass15_Sub2_Sub2_1.aString184 == null) {
				arg0.anInt2043 = 0;
				arg0.anInt2040 = 0;
			} else {
				arg0.anInt2042 = 150;
				arg0.anInt2109 = (int) (Math.sin((double) Static268.anInt5236 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt2103 = 5;
				arg0.anInt2043 = 2047;
				arg0.anInt2040 = Static274.method4321(Static22.aClass15_Sub2_Sub2_1.aString184);
				arg0.anInt2047 = Static22.aClass15_Sub2_Sub2_1.anInt5318;
				arg0.anInt2089 = Static22.aClass15_Sub2_Sub2_1.anInt5365;
				arg0.anInt2095 = 0;
				arg0.anInt2093 = Static22.aClass15_Sub2_Sub2_1.anInt5319;
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIII)V")
	public static void method4609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class2_Sub8_Sub10 local12 = Static92.method1633(8, arg3);
		local12.method2052();
		local12.anInt2700 = arg0;
		local12.anInt2698 = arg2;
		local12.anInt2702 = arg1;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg6 && arg0 == arg8 && arg7 == arg5 && arg3 == arg1) {
			Static88.method1568(arg2, arg7, arg6, arg8, arg3);
			return;
		}
		@Pc(25) int local25 = arg8 * 3;
		@Pc(27) int local27 = arg8;
		@Pc(31) int local31 = arg4 * 3;
		@Pc(35) int local35 = arg6 * 3;
		@Pc(39) int local39 = arg0 * 3;
		@Pc(41) int local41 = arg6;
		@Pc(45) int local45 = arg1 * 3;
		@Pc(49) int local49 = arg5 * 3;
		@Pc(58) int local58 = local31 + arg7 - local49 - arg6;
		@Pc(68) int local68 = local35 + local49 - local31 - local31;
		@Pc(79) int local79 = arg3 + local39 - local45 - arg8;
		@Pc(89) int local89 = local45 + local25 - local39 - local39;
		@Pc(94) int local94 = local31 - local35;
		@Pc(99) int local99 = local39 - local25;
		for (@Pc(101) int local101 = 128; local101 <= 4096; local101 += 128) {
			@Pc(110) int local110 = local101 * local101 >> 12;
			@Pc(116) int local116 = local101 * local110 >> 12;
			@Pc(120) int local120 = local116 * local79;
			@Pc(124) int local124 = local116 * local58;
			@Pc(128) int local128 = local68 * local110;
			@Pc(132) int local132 = local110 * local89;
			@Pc(136) int local136 = local94 * local101;
			@Pc(140) int local140 = local99 * local101;
			@Pc(150) int local150 = (local136 + local128 + local124 >> 12) + arg6;
			@Pc(160) int local160 = arg8 + (local132 + local120 + local140 >> 12);
			Static88.method1568(arg2, local150, local41, local27, local160);
			local27 = local160;
			local41 = local150;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BII)Z")
	public static boolean method4614(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(28) Class146 local28 = Static10.method158(arg0);
		return local28.method3813(arg1);
	}
}
