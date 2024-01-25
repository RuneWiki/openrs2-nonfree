import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!vba;")
	public static Class363 aClass363_33;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "Z")
	public static boolean aBoolean768 = false;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "Lclient!el;")
	public static final Class109 aClass109_219 = new Class109(59, 8);

	@OriginalMember(owner = "client!te", name = "j", descriptor = "[F")
	public static final float[] aFloatArray107 = new float[4];

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIZ)V")
	public static void method8890(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		Static126.method1775(arg1, Static582.aClass335_13.method8349(Static323.anInt5795), arg0);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!ec;IIIILclient!ec;IIB)V")
	public static void method8891(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1_Sub3_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class8_Sub1_Sub3_Sub2 arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5.method5992();
		if (local7 == -1) {
			return;
		}
		@Pc(29) Class134 local29 = (Class134) Static30.aClass391_4.method9275((long) local7);
		if (local29 == null) {
			@Pc(36) Class173[] local36 = Static684.method3653(Static345.aClass208_78, local7);
			if (local36 == null) {
				return;
			}
			local29 = Static457.aClass57_11.method7654(local36[0], true);
			Static30.aClass391_4.method9273((long) local7, local29, 1);
		}
		Static109.method1569(arg1.method5993() * 256, arg3 >> 1, 0, arg1.aByte145, arg1.anInt10363, arg1.anInt10355, arg4 >> 1);
		@Pc(83) int local83 = arg6 + Static13.anIntArray19[0] - 18;
		@Pc(91) int local91 = local83 + arg0 / 4 * 18;
		@Pc(99) int local99 = Static13.anIntArray19[1] + arg2 - 70;
		@Pc(107) int local107 = local99 + arg0 % 4 * 18;
		local29.method9235(local91, local107);
		if (arg1 == arg5) {
			Static457.aClass57_11.method7723(local91 - 1, 18, -256, 18, local107 - 1);
		}
		Static82.method9318(local107 + 18, local107 - 1, local91 + 18, local91 + -1);
		@Pc(145) Class8_Sub3 local145 = Static590.method8462();
		local145.aClass8_Sub1_Sub3_Sub2_1 = arg5;
		local145.anInt1793 = local91 + 16;
		local145.anInt1798 = local107 + 16;
		local145.anInt1792 = local91;
		local145.anInt1797 = local107;
		Static571.aClass98_7.method1780(local145);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)I")
	public static int method8894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + (arg1 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10);
	}
}
