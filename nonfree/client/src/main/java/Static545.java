import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!tfa", name = "e", descriptor = "Lclient!du;")
	public static final Class81 aClass81_62 = new Class81(512);

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)I")
	public static int method7732() {
		return 16;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method7733(@OriginalArg(0) String arg0) {
		@Pc(18) String local18 = Static67.method1113(Static561.method7887(arg0));
		if (local18 == null) {
			local18 = "";
		}
		return local18;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg3;
		@Pc(20) int local20 = arg1 - arg3;
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(28) int local28 = arg1 * arg1;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg1 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(68) int local68 = local24 * (1 - local56) + local40;
		@Pc(77) int local77 = local28 - (local56 - 1) * local44;
		@Pc(86) int local86 = local48 + (1 - local60) * local32;
		@Pc(95) int local95 = local36 - (local60 - 1) * local52;
		@Pc(99) int local99 = local24 << 2;
		@Pc(103) int local103 = local28 << 2;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 * 3;
		@Pc(121) int local121 = local44 * (local56 - 3);
		@Pc(125) int local125 = local48 * 3;
		@Pc(136) int local136 = local52 * (local60 - 3);
		@Pc(138) int local138 = local103;
		@Pc(144) int local144 = (arg1 - 1) * local99;
		@Pc(146) int local146 = local111;
		@Pc(152) int local152 = local107 * (local20 - 1);
		@Pc(156) int[] local156 = Static267.anIntArrayArray20[arg6];
		Static260.method3979(arg2, arg5 - arg0, local156, arg5 - local16);
		Static260.method3979(arg4, arg5 - local16, local156, local16 + arg5);
		Static260.method3979(arg2, local16 + arg5, local156, arg0 + arg5);
		while (local9 > 0) {
			@Pc(201) boolean local201 = local9 <= local20;
			if (local201) {
				if (local86 < 0) {
					while (local86 < 0) {
						local95 += local146;
						local86 += local125;
						local11++;
						local146 += local111;
						local125 += local111;
					}
				}
				if (local95 < 0) {
					local86 += local125;
					local95 += local146;
					local146 += local111;
					local125 += local111;
					local11++;
				}
				local86 += -local152;
				local95 += -local136;
				local152 -= local107;
				local136 -= local107;
			}
			if (local68 < 0) {
				while (local68 < 0) {
					local77 += local138;
					local68 += local115;
					local138 += local103;
					local115 += local103;
					local7++;
				}
			}
			if (local77 < 0) {
				local77 += local138;
				local68 += local115;
				local7++;
				local115 += local103;
				local138 += local103;
			}
			local77 += -local121;
			local68 += -local144;
			local121 -= local99;
			local9--;
			local144 -= local99;
			@Pc(341) int local341 = arg6 - local9;
			@Pc(345) int local345 = local9 + arg6;
			@Pc(349) int local349 = local7 + arg5;
			@Pc(354) int local354 = arg5 - local7;
			if (local201) {
				@Pc(361) int local361 = arg5 + local11;
				@Pc(366) int local366 = arg5 - local11;
				Static260.method3979(arg2, local354, Static267.anIntArrayArray20[local341], local366);
				Static260.method3979(arg4, local366, Static267.anIntArrayArray20[local341], local361);
				Static260.method3979(arg2, local361, Static267.anIntArrayArray20[local341], local349);
				Static260.method3979(arg2, local354, Static267.anIntArrayArray20[local345], local366);
				Static260.method3979(arg4, local366, Static267.anIntArrayArray20[local345], local361);
				Static260.method3979(arg2, local361, Static267.anIntArrayArray20[local345], local349);
			} else {
				Static260.method3979(arg2, local354, Static267.anIntArrayArray20[local341], local349);
				Static260.method3979(arg2, local354, Static267.anIntArrayArray20[local345], local349);
			}
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZ)Z")
	public static boolean method7736(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
