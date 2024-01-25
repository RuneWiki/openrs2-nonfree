import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
	public static int anInt89;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "[I")
	public static final int[] anIntArray8 = new int[8];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Lclient!mia;")
	public static Class8_Sub1_Sub5 method96(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class174 local7 = Static260.aClass174ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(15) Class8_Sub1_Sub5 local15 = local7.aClass8_Sub1_Sub5_1;
			local7.aClass8_Sub1_Sub5_1 = null;
			Static577.method8285(local15);
			return local15;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Z")
	public static boolean method97(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIZIIIIIII)V")
	public static void method98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg5 && arg4 == arg2 && arg3 == arg1 && arg6 == arg8) {
			Static380.method5561(arg7, arg0, arg1, arg4, arg6);
			return;
		}
		@Pc(48) int local48 = arg0;
		@Pc(50) int local50 = arg4;
		@Pc(54) int local54 = arg0 * 3;
		@Pc(58) int local58 = arg4 * 3;
		@Pc(62) int local62 = arg5 * 3;
		@Pc(66) int local66 = arg2 * 3;
		@Pc(70) int local70 = arg3 * 3;
		@Pc(74) int local74 = arg8 * 3;
		@Pc(83) int local83 = local62 + arg1 - local70 - arg0;
		@Pc(92) int local92 = arg6 + local66 - arg4 - local74;
		@Pc(102) int local102 = local70 + local54 - local62 - local62;
		@Pc(112) int local112 = local58 + local74 - local66 - local66;
		@Pc(117) int local117 = local62 - local54;
		@Pc(122) int local122 = local66 - local58;
		for (@Pc(124) int local124 = 128; local124 <= 4096; local124 += 128) {
			@Pc(132) int local132 = local124 * local124 >> 12;
			@Pc(138) int local138 = local124 * local132 >> 12;
			@Pc(142) int local142 = local138 * local83;
			@Pc(146) int local146 = local92 * local138;
			@Pc(150) int local150 = local132 * local102;
			@Pc(154) int local154 = local112 * local132;
			@Pc(158) int local158 = local117 * local124;
			@Pc(162) int local162 = local122 * local124;
			@Pc(172) int local172 = (local158 + local150 + local142 >> 12) + arg0;
			@Pc(185) int local185 = arg4 + (local146 + local154 + local162 >> 12);
			Static380.method5561(arg7, local48, local172, local50, local185);
			local50 = local185;
			local48 = local172;
		}
	}
}
