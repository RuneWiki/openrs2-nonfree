import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
	public static int anInt9460 = 0;

	@OriginalMember(owner = "client!tu", name = "r", descriptor = "Lclient!wq;")
	public static final Class359 aClass359_14 = new Class359();

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III[IIII[IIZLclient!wca;IIII)I")
	public static int method7678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) Class350 arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		for (@Pc(6) int local6 = 0; local6 < 128; local6++) {
			for (@Pc(9) int local9 = 0; local9 < 128; local9++) {
				Static114.anIntArrayArray22[local6][local9] = 0;
				Static187.anIntArrayArray30[local6][local9] = 99999999;
			}
		}
		@Pc(52) boolean local52;
		if (arg13 == 1) {
			local52 = Static501.method7562(arg4, arg11, arg0, arg8, arg6, arg5, arg10, arg1, arg12, arg2);
		} else if (arg13 == 2) {
			local52 = Static561.method8101(arg11, arg5, arg4, arg0, arg10, arg1, arg12, arg8, arg2, arg6);
		} else {
			local52 = Static486.method7418(arg12, arg6, arg11, arg5, arg0, arg8, arg1, arg10, arg13, arg4, arg2);
		}
		@Pc(88) int local88 = arg11 - 64;
		@Pc(92) int local92 = arg12 - 64;
		@Pc(94) int local94 = Static364.anInt7216;
		@Pc(96) int local96 = Static524.anInt9583;
		@Pc(104) int local104;
		@Pc(106) int local106;
		@Pc(113) int local113;
		if (!local52) {
			if (!arg9) {
				return -1;
			}
			local104 = Integer.MAX_VALUE;
			local106 = Integer.MAX_VALUE;
			for (local113 = arg0 - 10; local113 <= arg0 + 10; local113++) {
				for (@Pc(119) int local119 = arg4 - 10; local119 <= arg4 + 10; local119++) {
					@Pc(125) int local125 = local113 - local88;
					@Pc(129) int local129 = local119 - local92;
					if (local125 >= 0 && local129 >= 0 && local125 < 128 && local129 < 128 && Static187.anIntArrayArray30[local125][local129] < 100) {
						@Pc(153) int local153 = 0;
						if (arg0 > local113) {
							local153 = arg0 - local113;
						} else if (local113 > arg2 + arg0 - 1) {
							local153 = local113 + 1 - arg0 - arg2;
						}
						@Pc(179) int local179 = 0;
						if (local119 < arg4) {
							local179 = arg4 - local119;
						} else if (local119 > arg4 + arg8 - 1) {
							local179 = local119 + 1 - arg8 - arg4;
						}
						@Pc(214) int local214 = local179 * local179 + local153 * local153;
						if (local214 < local104 || local214 == local104 && local106 > Static187.anIntArrayArray30[local125][local129]) {
							local106 = Static187.anIntArrayArray30[local125][local129];
							local104 = local214;
							local94 = local113;
							local96 = local119;
						}
					}
				}
			}
			if (~local104 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local94 == arg11 && local96 == arg12) {
			return 0;
		}
		@Pc(280) byte local280 = 0;
		Static299.anIntArray374[0] = local94;
		local104 = local280 + 1;
		Static279.anIntArray360[0] = local96;
		@Pc(301) int local301;
		local106 = local301 = Static114.anIntArrayArray22[local94 - local88][local96 - local92];
		while (arg11 != local94 || local96 != arg12) {
			if (local106 != local301) {
				local301 = local106;
				Static299.anIntArray374[local104] = local94;
				Static279.anIntArray360[local104++] = local96;
			}
			if ((local106 & 0x2) != 0) {
				local94++;
			} else if ((local106 & 0x8) != 0) {
				local94--;
			}
			if ((local106 & 0x1) != 0) {
				local96++;
			} else if ((local106 & 0x4) != 0) {
				local96--;
			}
			local106 = Static114.anIntArrayArray22[local94 - local88][local96 - local92];
		}
		local113 = 0;
		while (local104-- > 0) {
			arg3[local113] = Static299.anIntArray374[local104];
			arg7[local113++] = Static279.anIntArray360[local104];
			if (local113 >= arg3.length) {
				break;
			}
		}
		return local113;
	}
}
