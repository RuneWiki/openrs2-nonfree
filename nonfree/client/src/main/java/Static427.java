import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!pea", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray36;

	@OriginalMember(owner = "client!pea", name = "p", descriptor = "I")
	public static int anInt6729;

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "Z")
	public static boolean aBoolean500 = false;

	@OriginalMember(owner = "client!pea", name = "o", descriptor = "I")
	public static int anInt6728 = 0;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V")
	public static void method5706() {
		Static28.aClass32_7.method640();
		Static489.aClass32_18.method640();
		Static154.aClass32_23.method640();
		Static589.aClass32_84.method640();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method5707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg2;
		@Pc(20) int local20 = arg4 - arg2;
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(28) int local28 = arg4 * arg4;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg4 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + (1 - local56) * local24;
		@Pc(78) int local78 = local28 - (local56 - 1) * local44;
		@Pc(87) int local87 = local48 + (1 - local60) * local32;
		@Pc(96) int local96 = local36 - (local60 - 1) * local52;
		@Pc(100) int local100 = local24 << 2;
		@Pc(104) int local104 = local28 << 2;
		@Pc(108) int local108 = local32 << 2;
		@Pc(112) int local112 = local36 << 2;
		@Pc(116) int local116 = local40 * 3;
		@Pc(122) int local122 = local44 * (local56 - 3);
		@Pc(126) int local126 = local48 * 3;
		@Pc(132) int local132 = (local60 - 3) * local52;
		@Pc(139) int local139 = local104;
		@Pc(145) int local145 = local100 * (arg4 - 1);
		@Pc(147) int local147 = local112;
		@Pc(153) int local153 = (local20 - 1) * local108;
		@Pc(172) int local172;
		@Pc(180) int local180;
		@Pc(189) int local189;
		@Pc(197) int local197;
		if (Static257.anInt4068 <= arg6 && arg6 <= Static67.anInt1214) {
			@Pc(163) int[] local163 = Static543.anIntArrayArray57[arg6];
			local172 = Static414.method5547(arg3 - arg0, Static379.anInt5914, Static624.anInt10032);
			local180 = Static414.method5547(arg0 + arg3, Static379.anInt5914, Static624.anInt10032);
			local189 = Static414.method5547(arg3 - local16, Static379.anInt5914, Static624.anInt10032);
			local197 = Static414.method5547(local16 + arg3, Static379.anInt5914, Static624.anInt10032);
			Static134.method1841(local163, local172, local189, arg1);
			Static134.method1841(local163, local189, local197, arg5);
			Static134.method1841(local163, local197, local180, arg1);
		}
		while (local9 > 0) {
			@Pc(224) boolean local224 = local9 <= local20;
			if (local69 < 0) {
				while (local69 < 0) {
					local78 += local139;
					local69 += local116;
					local116 += local104;
					local139 += local104;
					local7++;
				}
			}
			if (local224) {
				if (local87 < 0) {
					while (local87 < 0) {
						local96 += local147;
						local87 += local126;
						local11++;
						local147 += local112;
						local126 += local112;
					}
				}
				if (local96 < 0) {
					local87 += local126;
					local96 += local147;
					local147 += local112;
					local11++;
					local126 += local112;
				}
				local96 += -local132;
				local87 += -local153;
				local153 -= local108;
				local132 -= local108;
			}
			if (local78 < 0) {
				local69 += local116;
				local78 += local139;
				local7++;
				local116 += local104;
				local139 += local104;
			}
			local69 += -local145;
			local78 += -local122;
			local122 -= local100;
			local145 -= local100;
			local9--;
			local172 = arg6 - local9;
			local180 = arg6 + local9;
			if (Static257.anInt4068 <= local180 && Static67.anInt1214 >= local172) {
				local189 = Static414.method5547(local7 + arg3, Static379.anInt5914, Static624.anInt10032);
				local197 = Static414.method5547(arg3 - local7, Static379.anInt5914, Static624.anInt10032);
				if (local224) {
					@Pc(423) int local423 = Static414.method5547(local11 + arg3, Static379.anInt5914, Static624.anInt10032);
					@Pc(432) int local432 = Static414.method5547(arg3 - local11, Static379.anInt5914, Static624.anInt10032);
					@Pc(443) int[] local443;
					if (Static257.anInt4068 <= local172) {
						local443 = Static543.anIntArrayArray57[local172];
						Static134.method1841(local443, local197, local432, arg1);
						Static134.method1841(local443, local432, local423, arg5);
						Static134.method1841(local443, local423, local189, arg1);
					}
					if (local180 <= Static67.anInt1214) {
						local443 = Static543.anIntArrayArray57[local180];
						Static134.method1841(local443, local197, local432, arg1);
						Static134.method1841(local443, local432, local423, arg5);
						Static134.method1841(local443, local423, local189, arg1);
					}
				} else {
					if (Static257.anInt4068 <= local172) {
						Static134.method1841(Static543.anIntArrayArray57[local172], local197, local189, arg1);
					}
					if (Static67.anInt1214 >= local180) {
						Static134.method1841(Static543.anIntArrayArray57[local180], local197, local189, arg1);
					}
				}
			}
		}
	}
}
