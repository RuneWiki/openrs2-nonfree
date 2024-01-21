import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!vd", name = "eb", descriptor = "J")
	public static long aLong138;

	@OriginalMember(owner = "client!vd", name = "ab", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2022 = Static193.method3027(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!vd", name = "db", descriptor = "I")
	public static int anInt4074 = 100;

	@OriginalMember(owner = "client!vd", name = "gb", descriptor = "I")
	public static int anInt4076 = -1;

	@OriginalMember(owner = "client!vd", name = "kb", descriptor = "[I")
	public static final int[] anIntArray356 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIIILclient!m;IZJ)Z")
	public static boolean method3178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class26 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static89.anInt659 || local4 >= Static126.anInt2489) {
					return false;
				}
				@Pc(25) Class3_Sub6 local25 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][local1][local4];
				if (local25 != null && local25.anInt827 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class99 local49 = new Class99();
		local49.aLong144 = arg11;
		local49.anInt4225 = arg0;
		local49.anInt4235 = arg5;
		local49.anInt4236 = arg6;
		local49.anInt4231 = arg7;
		local49.aClass26_11 = arg8;
		local49.anInt4232 = arg9;
		local49.anInt4226 = arg1;
		local49.anInt4239 = arg2;
		local49.anInt4224 = arg1 + arg3 - 1;
		local49.anInt4230 = arg2 + arg4 - 1;
		for (@Pc(92) int local92 = arg1; local92 < arg1 + arg3; local92++) {
			for (@Pc(95) int local95 = arg2; local95 < arg2 + arg4; local95++) {
				@Pc(98) int local98 = 0;
				if (local92 > arg1) {
					local98++;
				}
				if (local92 < arg1 + arg3 - 1) {
					local98 += 4;
				}
				if (local95 > arg2) {
					local98 += 8;
				}
				if (local95 < arg2 + arg4 - 1) {
					local98 += 2;
				}
				for (@Pc(124) int local124 = arg0; local124 >= 0; local124--) {
					if (Static118.aClass3_Sub6ArrayArrayArray1[local124][local92][local95] == null) {
						Static118.aClass3_Sub6ArrayArrayArray1[local124][local92][local95] = new Class3_Sub6(local124, local92, local95);
					}
				}
				@Pc(157) Class3_Sub6 local157 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][local92][local95];
				local157.aClass99Array1[local157.anInt827] = local49;
				local157.anIntArray40[local157.anInt827] = local98;
				local157.anInt829 |= local98;
				local157.anInt827++;
			}
		}
		if (arg10) {
			Static109.aClass99Array2[Static191.anInt3884++] = local49;
		}
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIBI)I")
	public static int method3180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return 7 - arg2;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIII)V")
	public static void method3181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg0; local3 <= arg0 + arg4; local3++) {
			for (local7 = arg3; local7 <= arg1 + arg3; local7++) {
				if (local7 >= 0 && local7 < 104 && local3 >= 0 && local3 < 104) {
					Static119.aByteArrayArrayArray12[arg2][local7][local3] = 127;
				}
			}
		}
		@Pc(72) int local72;
		for (local7 = arg0; local7 < arg0 + arg4; local7++) {
			for (local72 = arg3; local72 < arg1 + arg3; local72++) {
				if (local72 >= 0 && local72 < 104 && local7 >= 0 && local7 < 104) {
					Static23.anIntArrayArrayArray4[arg2][local72][local7] = arg2 <= 0 ? 0 : Static23.anIntArrayArrayArray4[arg2 - 1][local72][local7];
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (local72 = arg0 + 1; local72 < arg4 + arg0; local72++) {
				if (local72 >= 0 && local72 < 104) {
					Static23.anIntArrayArrayArray4[arg2][arg3][local72] = Static23.anIntArrayArrayArray4[arg2][arg3 - 1][local72];
				}
			}
		}
		if (arg0 > 0 && arg0 < 104) {
			for (local72 = arg3 + 1; local72 < arg3 + arg1; local72++) {
				if (local72 >= 0 && local72 < 104) {
					Static23.anIntArrayArrayArray4[arg2][local72][arg0] = Static23.anIntArrayArrayArray4[arg2][local72][arg0 - 1];
				}
			}
		}
		if (arg3 < 0 || arg0 < 0 || arg3 >= 104 || arg0 >= 104) {
			return;
		}
		if (arg2 == 0) {
			if (arg3 > 0 && Static23.anIntArrayArrayArray4[arg2][arg3 - 1][arg0] != 0) {
				Static23.anIntArrayArrayArray4[arg2][arg3][arg0] = Static23.anIntArrayArrayArray4[arg2][arg3 - 1][arg0];
				return;
			}
			if (arg0 > 0 && Static23.anIntArrayArrayArray4[arg2][arg3][arg0 - 1] != 0) {
				Static23.anIntArrayArrayArray4[arg2][arg3][arg0] = Static23.anIntArrayArrayArray4[arg2][arg3][arg0 - 1];
				return;
			}
			if (arg3 > 0 && arg0 > 0 && Static23.anIntArrayArrayArray4[arg2][arg3 - 1][arg0 - 1] != 0) {
				Static23.anIntArrayArrayArray4[arg2][arg3][arg0] = Static23.anIntArrayArrayArray4[arg2][arg3 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && Static23.anIntArrayArrayArray4[arg2 - 1][arg3 - 1][arg0] != Static23.anIntArrayArrayArray4[arg2][arg3 - 1][arg0]) {
			Static23.anIntArrayArrayArray4[arg2][arg3][arg0] = Static23.anIntArrayArrayArray4[arg2][arg3 - 1][arg0];
			return;
		}
		if (arg0 > 0 && Static23.anIntArrayArrayArray4[arg2 - 1][arg3][arg0 - 1] != Static23.anIntArrayArrayArray4[arg2][arg3][arg0 - 1]) {
			Static23.anIntArrayArrayArray4[arg2][arg3][arg0] = Static23.anIntArrayArrayArray4[arg2][arg3][arg0 - 1];
			return;
		}
		if (arg3 > 0 && arg0 > 0 && Static23.anIntArrayArrayArray4[arg2 - 1][arg3 - 1][arg0 - 1] != Static23.anIntArrayArrayArray4[arg2][arg3 - 1][arg0 - 1]) {
			Static23.anIntArrayArrayArray4[arg2][arg3][arg0] = Static23.anIntArrayArrayArray4[arg2][arg3 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIILclient!m;IJZ)Z")
	public static boolean method3182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class26 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return method3178(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}
}
