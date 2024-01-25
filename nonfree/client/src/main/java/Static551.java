import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!tia", name = "K", descriptor = "I")
	public static int anInt9128;

	@OriginalMember(owner = "client!tia", name = "E", descriptor = "S")
	public static short aShort104 = 32767;

	@OriginalMember(owner = "client!tia", name = "G", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_77 = new Class181(57, 3);

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "([Lclient!kf;II)V")
	public static void method7787(@OriginalArg(0) Class14_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class14_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9320;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9320 > local27 + (local29 & 0x1)) {
				@Pc(44) Class14_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method7787(arg0, arg1, local10 - 1);
		method7787(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(IILclient!kb;II[IZIIIII[III)I")
	public static int method7788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static608.anIntArrayArray61[local7][local11] = 0;
				Static151.anIntArrayArray14[local7][local11] = 99999999;
			}
		}
		@Pc(60) boolean local60;
		if (arg4 == 1) {
			local60 = Static189.method3007(arg2, arg0, arg12, arg13, arg1, arg3, arg10, arg9, arg7, arg8);
		} else if (arg4 == 2) {
			local60 = Static641.method8812(arg13, arg12, arg0, arg7, arg3, arg2, arg10, arg9, arg1, arg8);
		} else {
			local60 = Static535.method7635(arg4, arg0, arg13, arg9, arg3, arg2, arg10, arg8, arg7, arg1, arg12);
		}
		@Pc(98) int local98 = arg1 - 64;
		@Pc(102) int local102 = arg3 - 64;
		@Pc(104) int local104 = Static142.anInt8583;
		@Pc(106) int local106 = Static30.anInt607;
		@Pc(112) int local112;
		@Pc(114) int local114;
		@Pc(121) int local121;
		if (!local60) {
			if (!arg6) {
				return -1;
			}
			local112 = Integer.MAX_VALUE;
			local114 = Integer.MAX_VALUE;
			for (local121 = arg12 - 10; local121 <= arg12 + 10; local121++) {
				for (@Pc(127) int local127 = arg9 - 10; local127 <= arg9 + 10; local127++) {
					@Pc(134) int local134 = local121 - local98;
					@Pc(139) int local139 = local127 - local102;
					if (local134 >= 0 && local139 >= 0 && local134 < 128 && local139 < 128 && Static151.anIntArrayArray14[local134][local139] < 100) {
						@Pc(160) int local160 = 0;
						if (local121 < arg12) {
							local160 = arg12 - local121;
						} else if (arg0 + arg12 - 1 < local121) {
							local160 = local121 + 1 - arg0 - arg12;
						}
						@Pc(195) int local195 = 0;
						if (local127 < arg9) {
							local195 = arg9 - local127;
						} else if (arg7 + arg9 - 1 < local127) {
							local195 = local127 + 1 - arg9 - arg7;
						}
						@Pc(232) int local232 = local195 * local195 + local160 * local160;
						if (local112 > local232 || local112 == local232 && Static151.anIntArrayArray14[local134][local139] < local114) {
							local106 = local127;
							local112 = local232;
							local104 = local121;
							local114 = Static151.anIntArrayArray14[local134][local139];
						}
					}
				}
			}
			if (~local112 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local104 == arg1 && local106 == arg3) {
			return 0;
		}
		@Pc(297) byte local297 = 0;
		Static9.anIntArray13[0] = local104;
		local112 = local297 + 1;
		Static84.anIntArray110[0] = local106;
		@Pc(318) int local318;
		local114 = local318 = Static608.anIntArrayArray61[local104 - local98][local106 - local102];
		while (arg1 != local104 || local106 != arg3) {
			if (local318 != local114) {
				local318 = local114;
				Static9.anIntArray13[local112] = local104;
				Static84.anIntArray110[local112++] = local106;
			}
			if ((local114 & 0x1) != 0) {
				local106++;
			} else if ((local114 & 0x4) != 0) {
				local106--;
			}
			if ((local114 & 0x2) != 0) {
				local104++;
			} else if ((local114 & 0x8) != 0) {
				local104--;
			}
			local114 = Static608.anIntArrayArray61[local104 - local98][local106 - local102];
		}
		local121 = 0;
		while (local112-- > 0) {
			arg5[local121] = Static9.anIntArray13[local112];
			arg11[local121++] = Static84.anIntArray110[local112];
			if (arg5.length <= local121) {
				break;
			}
		}
		return local121;
	}
}
