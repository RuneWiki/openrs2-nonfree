import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_56 = new Class319(20, 3);

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[200];

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "J")
	public static long aLong131 = 0L;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg6 - arg2;
		@Pc(20) int local20 = arg0 - arg2;
		@Pc(24) int local24 = arg6 * arg6;
		@Pc(28) int local28 = arg0 * arg0;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg0 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local24 * (1 - local56) + local40;
		@Pc(78) int local78 = local28 - (local56 - 1) * local44;
		@Pc(87) int local87 = (1 - local60) * local32 + local48;
		@Pc(96) int local96 = local36 - local52 * (local60 - 1);
		@Pc(100) int local100 = local24 << 2;
		@Pc(104) int local104 = local28 << 2;
		@Pc(108) int local108 = local32 << 2;
		@Pc(112) int local112 = local36 << 2;
		@Pc(116) int local116 = local40 * 3;
		@Pc(122) int local122 = local44 * (local56 - 3);
		@Pc(126) int local126 = local48 * 3;
		@Pc(132) int local132 = local52 * (local60 - 3);
		@Pc(134) int local134 = local104;
		@Pc(140) int local140 = (arg0 - 1) * local100;
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = local108 * (local20 - 1);
		@Pc(152) int[] local152 = Static478.anIntArrayArray51[arg1];
		Static250.method4000(arg4 - local15, local152, arg4 - arg6, arg5);
		Static250.method4000(local15 + arg4, local152, arg4 - local15, arg3);
		Static250.method4000(arg6 + arg4, local152, local15 + arg4, arg5);
		while (local9 > 0) {
			@Pc(198) boolean local198 = local20 >= local9;
			if (local198) {
				if (local87 < 0) {
					while (local87 < 0) {
						local87 += local126;
						local96 += local142;
						local126 += local112;
						local142 += local112;
						local11++;
					}
				}
				if (local96 < 0) {
					local87 += local126;
					local96 += local142;
					local142 += local112;
					local11++;
					local126 += local112;
				}
				local96 += -local132;
				local87 += -local148;
				local132 -= local108;
				local148 -= local108;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local116;
					local78 += local134;
					local134 += local104;
					local7++;
					local116 += local104;
				}
			}
			if (local78 < 0) {
				local78 += local134;
				local69 += local116;
				local7++;
				local116 += local104;
				local134 += local104;
			}
			local78 += -local122;
			local69 += -local140;
			local9--;
			local122 -= local100;
			local140 -= local100;
			@Pc(326) int local326 = arg1 - local9;
			@Pc(330) int local330 = arg1 + local9;
			@Pc(334) int local334 = arg4 + local7;
			@Pc(339) int local339 = arg4 - local7;
			if (local198) {
				@Pc(345) int local345 = local11 + arg4;
				@Pc(349) int local349 = arg4 - local11;
				Static250.method4000(local349, Static478.anIntArrayArray51[local326], local339, arg5);
				Static250.method4000(local345, Static478.anIntArrayArray51[local326], local349, arg3);
				Static250.method4000(local334, Static478.anIntArrayArray51[local326], local345, arg5);
				Static250.method4000(local349, Static478.anIntArrayArray51[local330], local339, arg5);
				Static250.method4000(local345, Static478.anIntArrayArray51[local330], local349, arg3);
				Static250.method4000(local334, Static478.anIntArrayArray51[local330], local345, arg5);
			} else {
				Static250.method4000(local334, Static478.anIntArrayArray51[local326], local339, arg5);
				Static250.method4000(local334, Static478.anIntArrayArray51[local330], local339, arg5);
			}
		}
	}
}
