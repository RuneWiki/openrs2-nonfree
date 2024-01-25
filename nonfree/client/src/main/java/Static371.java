import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
	public static void method5921() {
		Static59.method8063();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static334.aClass291Array20[local8].method7196();
		}
		Static603.method8219();
		Static598.method8184();
		Static235.method4530();
		System.gc();
		Static47.aClass33_3.ya();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg8 && arg3 == arg5 && arg0 == arg6 && arg2 == arg1) {
			Static194.method3872(arg5, arg0, arg2, arg8, arg4);
			return;
		}
		@Pc(44) int local44 = arg8;
		@Pc(46) int local46 = arg5;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(54) int local54 = arg5 * 3;
		@Pc(58) int local58 = arg7 * 3;
		@Pc(62) int local62 = arg3 * 3;
		@Pc(66) int local66 = arg6 * 3;
		@Pc(70) int local70 = arg1 * 3;
		@Pc(79) int local79 = arg0 + local58 - local66 - arg8;
		@Pc(89) int local89 = local62 + arg2 - arg5 - local70;
		@Pc(99) int local99 = local50 + local66 - local58 - local58;
		@Pc(109) int local109 = local54 + local70 - local62 - local62;
		@Pc(113) int local113 = local58 - local50;
		@Pc(117) int local117 = local62 - local54;
		for (@Pc(119) int local119 = 128; local119 <= 4096; local119 += 128) {
			@Pc(127) int local127 = local119 * local119 >> 12;
			@Pc(133) int local133 = local119 * local127 >> 12;
			@Pc(137) int local137 = local79 * local133;
			@Pc(141) int local141 = local89 * local133;
			@Pc(145) int local145 = local127 * local99;
			@Pc(149) int local149 = local109 * local127;
			@Pc(153) int local153 = local119 * local113;
			@Pc(157) int local157 = local117 * local119;
			@Pc(167) int local167 = (local145 + local137 + local153 >> 12) + arg8;
			@Pc(177) int local177 = arg5 + (local157 + local149 + local141 >> 12);
			Static194.method3872(local46, local167, local177, local44, arg4);
			local44 = local167;
			local46 = local177;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;BIZ)Z")
	public static boolean method5927(@OriginalArg(0) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(39) int local39 = 0;
		@Pc(42) int local42 = arg0.length();
		for (@Pc(44) int local44 = 0; local44 < local42; local44++) {
			@Pc(50) char local50 = arg0.charAt(local44);
			if (local44 == 0) {
				if (local50 == '-') {
					local26 = true;
					continue;
				}
				if (local50 == '+') {
					continue;
				}
			}
			@Pc(79) int local79;
			if (local50 >= '0' && local50 <= '9') {
				local79 = local50 - '0';
			} else if (local50 >= 'A' && local50 <= 'Z') {
				local79 = local50 - '7';
			} else if (local50 >= 'a' && local50 <= 'z') {
				local79 = local50 - 'W';
			} else {
				return false;
			}
			if (local79 >= 10) {
				return false;
			}
			if (local26) {
				local79 = -local79;
			}
			@Pc(123) int local123 = local79 + local39 * 10;
			if (local123 / 10 != local39) {
				return false;
			}
			local39 = local123;
			local28 = true;
		}
		return local28;
	}
}
