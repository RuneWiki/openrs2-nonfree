import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
	public static int anInt6685;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!oc", name = "Q", descriptor = "Lclient!dn;")
	public static Class75 aClass75_3;

	@OriginalMember(owner = "client!oc", name = "J", descriptor = "Lclient!lj;")
	public static final Class210 aClass210_8 = new Class210(1, 2, 2, 0);

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)V")
	public static void method5570(@OriginalArg(0) int arg0) {
		Static474.anInt4410 = arg0;
		@Pc(11) Class223 local11 = Static476.aClass223_57;
		synchronized (Static476.aClass223_57) {
			Static476.aClass223_57.method4932();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg8 && arg6 == arg3 && arg7 == arg0 && arg4 == arg5) {
			Static298.method4646(arg2, arg0, arg4, arg1, arg3);
			return;
		}
		@Pc(37) int local37 = arg1;
		@Pc(39) int local39 = arg3;
		@Pc(43) int local43 = arg1 * 3;
		@Pc(47) int local47 = arg3 * 3;
		@Pc(51) int local51 = arg8 * 3;
		@Pc(55) int local55 = arg6 * 3;
		@Pc(59) int local59 = arg7 * 3;
		@Pc(63) int local63 = arg5 * 3;
		@Pc(72) int local72 = local51 + arg0 - local59 - arg1;
		@Pc(81) int local81 = arg4 + local55 - local63 - arg3;
		@Pc(90) int local90 = local43 + local59 - local51 - local51;
		@Pc(100) int local100 = local63 + local47 - local55 - local55;
		@Pc(104) int local104 = local51 - local43;
		@Pc(109) int local109 = local55 - local47;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(119) int local119 = local111 * local111 >> 12;
			@Pc(125) int local125 = local111 * local119 >> 12;
			@Pc(129) int local129 = local72 * local125;
			@Pc(133) int local133 = local125 * local81;
			@Pc(137) int local137 = local90 * local119;
			@Pc(141) int local141 = local119 * local100;
			@Pc(145) int local145 = local111 * local104;
			@Pc(149) int local149 = local109 * local111;
			@Pc(159) int local159 = (local145 + local129 + local137 >> 12) + arg1;
			@Pc(171) int local171 = arg3 + (local141 + local133 + local149 >> 12);
			Static298.method4646(arg2, local159, local171, local37, local39);
			local37 = local159;
			local39 = local171;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	public static void method5572() {
		Static5.aClass223_1.method4932();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIII)V")
	public static void method5573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg0; local7 <= arg1; local7++) {
			Static336.method5023(arg4, arg2, Static383.anIntArrayArray62[local7], arg3);
		}
	}
}
