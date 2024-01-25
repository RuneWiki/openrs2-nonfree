import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
	public static int anInt3805 = 3;

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
	public static int anInt3806 = 0;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
	public static int anInt3807 = 0;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "J")
	public static long aLong106 = 0L;

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
	public static int anInt3808 = 0;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "Z")
	public static boolean aBoolean289 = false;

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
	public static int anInt3809 = 1;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIIIIZ)V")
	public static void method3229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg1 == arg4 && arg6 == arg0 && arg8 == arg5 && arg7 == arg2) {
			Static90.method1436(arg1, arg0, arg3, arg7, arg5);
			return;
		}
		@Pc(27) int local27 = arg1;
		@Pc(29) int local29 = arg0;
		@Pc(33) int local33 = arg1 * 3;
		@Pc(37) int local37 = arg0 * 3;
		@Pc(41) int local41 = arg4 * 3;
		@Pc(45) int local45 = arg6 * 3;
		@Pc(49) int local49 = arg8 * 3;
		@Pc(53) int local53 = arg2 * 3;
		@Pc(64) int local64 = arg5 + local41 - local49 - arg1;
		@Pc(72) int local72 = local45 + arg7 - local53 - arg0;
		@Pc(82) int local82 = local49 + local33 - local41 - local41;
		@Pc(92) int local92 = local37 + local53 - local45 - local45;
		@Pc(97) int local97 = local41 - local33;
		@Pc(101) int local101 = local45 - local37;
		for (@Pc(103) int local103 = 128; local103 <= 4096; local103 += 128) {
			@Pc(111) int local111 = local103 * local103 >> 12;
			@Pc(117) int local117 = local111 * local103 >> 12;
			@Pc(121) int local121 = local64 * local117;
			@Pc(125) int local125 = local72 * local117;
			@Pc(129) int local129 = local82 * local111;
			@Pc(133) int local133 = local111 * local92;
			@Pc(137) int local137 = local103 * local97;
			@Pc(141) int local141 = local103 * local101;
			@Pc(152) int local152 = arg1 + (local137 + local129 + local121 >> 12);
			@Pc(163) int local163 = arg0 + (local141 + local125 + local133 >> 12);
			Static90.method1436(local27, local29, arg3, local163, local152);
			local27 = local152;
			local29 = local163;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!lm;BI)Lclient!ln;")
	public static Class1_Sub2_Sub8 method3230(@OriginalArg(0) int arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class1_Sub21 local14 = new Class1_Sub21(arg1.method3009(arg2, arg0));
		@Pc(42) Class1_Sub2_Sub8 local42 = new Class1_Sub2_Sub8(arg2, local14.method5701(), local14.method5701(), local14.method5716(), local14.method5716(), local14.method5720() == 1, local14.method5720());
		@Pc(54) int local54 = local14.method5720();
		for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
			local42.aClass14_13.method300(new Class1_Sub4(local14.method5720(), local14.method5715(), local14.method5715(), local14.method5715(), local14.method5715(), local14.method5715(), local14.method5715(), local14.method5715(), local14.method5715()));
		}
		local42.method3056();
		return local42;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "()V")
	public static void method3231() {
		Static30.method500(Static132.anInt6773);
	}
}
