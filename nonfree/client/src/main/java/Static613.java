import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!ur", name = "jb", descriptor = "Lclient!ae;")
	public static Class8 aClass8_137;

	@OriginalMember(owner = "client!ur", name = "Db", descriptor = "I")
	public static int anInt10037;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIII)V")
	public static void method8477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(39) int local39 = (1 - local29) * local13 + local21;
		@Pc(48) int local48 = local17 - (local29 - 1) * local25;
		@Pc(52) int local52 = local13 << 2;
		@Pc(56) int local56 = local17 << 2;
		@Pc(64) int local64 = local21 * 3;
		@Pc(76) int local76 = ((arg3 << 1) - 3) * local25;
		@Pc(82) int local82 = local56;
		Static270.method3998(arg4, arg1 - arg2, arg2 + arg1, Static173.anIntArrayArray15[arg0]);
		@Pc(101) int local101 = (arg3 - 1) * local52;
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local48 += local82;
					local39 += local64;
					local7++;
					local82 += local56;
					local64 += local56;
				}
			}
			if (local48 < 0) {
				local39 += local64;
				local48 += local82;
				local82 += local56;
				local7++;
				local64 += local56;
			}
			local48 += -local76;
			local39 += -local101;
			local101 -= local52;
			local9--;
			local76 -= local52;
			@Pc(172) int local172 = arg0 - local9;
			@Pc(176) int local176 = local9 + arg0;
			@Pc(180) int local180 = arg1 + local7;
			@Pc(185) int local185 = arg1 - local7;
			Static270.method3998(arg4, local185, local180, Static173.anIntArrayArray15[local172]);
			Static270.method3998(arg4, local185, local180, Static173.anIntArrayArray15[local176]);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
	public static int method8478(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local15 - local19 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(52) char local52;
			if (local17 == '\u0000') {
				local52 = arg2.charAt(local13++);
			} else {
				local52 = local17;
			}
			@Pc(65) char local65;
			if (local19 == '\u0000') {
				local65 = arg1.charAt(local15++);
			} else {
				local65 = local19;
			}
			local17 = Static401.method5785(local52);
			local19 = Static401.method5785(local65);
			local52 = Static247.method3620(arg0, local52);
			local65 = Static247.method3620(arg0, local65);
			if (local65 != local52 && Character.toUpperCase(local52) != Character.toUpperCase(local65)) {
				local52 = Character.toLowerCase(local52);
				local65 = Character.toLowerCase(local65);
				if (local65 != local52) {
					return Static496.method8134(arg0, local52) - Static496.method8134(arg0, local65);
				}
			}
		}
		@Pc(128) int local128 = Math.min(local8, local11);
		for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
			if (arg0 == 2) {
				local15 = local11 - local130 - 1;
				local13 = local8 - local130 - 1;
			} else {
				local15 = local130;
				local13 = local130;
			}
			@Pc(159) char local159 = arg2.charAt(local13);
			@Pc(163) char local163 = arg1.charAt(local15);
			if (local163 != local159 && Character.toUpperCase(local159) != Character.toUpperCase(local163)) {
				local159 = Character.toLowerCase(local159);
				local163 = Character.toLowerCase(local163);
				if (local163 != local159) {
					return Static496.method8134(arg0, local159) - Static496.method8134(arg0, local163);
				}
			}
		}
		@Pc(211) int local211 = local8 - local11;
		if (local211 != 0) {
			return local211;
		}
		for (@Pc(225) int local225 = 0; local225 < local128; local225++) {
			@Pc(231) char local231 = arg2.charAt(local225);
			@Pc(235) char local235 = arg1.charAt(local225);
			if (local231 != local235) {
				return Static496.method8134(arg0, local231) - Static496.method8134(arg0, local235);
			}
		}
		return 0;
	}
}
