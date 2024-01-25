import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
	public static int anInt5988 = -1;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
	public static int anInt5989 = 0;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[B)Z")
	public static boolean method4783(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub20 local8 = new Class2_Sub20(arg0);
		@Pc(20) int local20 = local8.method3737();
		if (local20 != 1) {
			return false;
		}
		@Pc(36) boolean local36 = local8.method3737() == 1;
		if (local36) {
			Static105.method1626(local8);
		}
		Static26.method369(local8);
		return true;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
	public static void method4784(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(arg0, 2);
		local8.method435();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
	public static void method4785() {
		Static446.method6043(25);
		Static256.method3903();
		System.gc();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg2 && arg3 == arg8 && arg1 == arg7 && arg0 == arg6) {
			Static119.method1745(arg3, arg5, arg1, arg2, arg6);
			return;
		}
		@Pc(32) int local32 = arg2;
		@Pc(34) int local34 = arg3;
		@Pc(38) int local38 = arg2 * 3;
		@Pc(42) int local42 = arg3 * 3;
		@Pc(46) int local46 = arg4 * 3;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(58) int local58 = arg0 * 3;
		@Pc(67) int local67 = local46 + arg1 - local54 - arg2;
		@Pc(77) int local77 = local50 + arg6 - arg3 - local58;
		@Pc(87) int local87 = local54 + local38 - local46 - local46;
		@Pc(95) int local95 = local42 + local58 - local50 - local50;
		@Pc(99) int local99 = local46 - local38;
		@Pc(104) int local104 = local50 - local42;
		for (@Pc(106) int local106 = 128; local106 <= 4096; local106 += 128) {
			@Pc(114) int local114 = local106 * local106 >> 12;
			@Pc(120) int local120 = local106 * local114 >> 12;
			@Pc(124) int local124 = local67 * local120;
			@Pc(128) int local128 = local77 * local120;
			@Pc(132) int local132 = local114 * local87;
			@Pc(136) int local136 = local114 * local95;
			@Pc(140) int local140 = local99 * local106;
			@Pc(144) int local144 = local106 * local104;
			@Pc(155) int local155 = (local124 + local132 + local140 >> 12) + arg2;
			@Pc(166) int local166 = (local136 + local128 + local144 >> 12) + arg3;
			Static119.method1745(local34, arg5, local155, local32, local166);
			local32 = local155;
			local34 = local166;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)V")
	public static void method4788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static399.aClass167_Sub1_1.anInt5568 * arg1 >> 8;
		if (local6 != 0 && arg2 != -1) {
			Static408.method5525(arg2, Static22.aClass188_10, local6);
			Static256.aBoolean398 = true;
		}
	}
}
