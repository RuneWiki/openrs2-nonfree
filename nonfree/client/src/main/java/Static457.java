import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "F")
	public static float aFloat103;

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "[I")
	public static final int[] anIntArray575 = new int[100];

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BIIII)V")
	public static void method6054(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class4_Sub2_Sub17 local8 = Static34.method1709(4, arg3);
		local8.method5529();
		local8.anInt6873 = arg2;
		local8.anInt6869 = arg1;
		local8.anInt6871 = arg0;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)V")
	public static void method6055(@OriginalArg(1) int arg0) {
		Static440.anInt7328 = arg0;
		@Pc(11) Class137 local11 = Static264.aClass137_46;
		synchronized (Static264.aClass137_46) {
			Static264.aClass137_46.method2739();
		}
		local11 = Static144.aClass137_23;
		synchronized (Static144.aClass137_23) {
			Static144.aClass137_23.method2739();
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg3 - arg2;
		@Pc(20) int local20 = arg6 - arg2;
		@Pc(24) int local24 = arg3 * arg3;
		@Pc(28) int local28 = arg6 * arg6;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg6 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + (1 - local56) * local24;
		@Pc(77) int local77 = local28 - local44 * (local56 - 1);
		@Pc(87) int local87 = (1 - local60) * local32 + local48;
		@Pc(95) int local95 = local36 - local52 * (local60 - 1);
		@Pc(99) int local99 = local24 << 2;
		@Pc(103) int local103 = local28 << 2;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 * 3;
		@Pc(121) int local121 = (local56 - 3) * local44;
		@Pc(125) int local125 = local48 * 3;
		@Pc(131) int local131 = local52 * (local60 - 3);
		@Pc(133) int local133 = local103;
		@Pc(139) int local139 = local99 * (arg6 - 1);
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = local107 * (local20 - 1);
		@Pc(151) int[] local151 = Static267.anIntArrayArray50[arg0];
		Static249.method6044(local151, arg5, arg1 - local15, -arg3 + arg1);
		Static249.method6044(local151, arg4, local15 + arg1, -local15 + arg1);
		Static249.method6044(local151, arg5, arg3 + arg1, arg1 + local15);
		while (local9 > 0) {
			@Pc(196) boolean local196 = local9 <= local20;
			if (local69 < 0) {
				while (local69 < 0) {
					local77 += local133;
					local69 += local115;
					local7++;
					local133 += local103;
					local115 += local103;
				}
			}
			if (local196) {
				if (local87 < 0) {
					while (local87 < 0) {
						local95 += local141;
						local87 += local125;
						local141 += local111;
						local125 += local111;
						local11++;
					}
				}
				if (local95 < 0) {
					local95 += local141;
					local87 += local125;
					local125 += local111;
					local11++;
					local141 += local111;
				}
				local95 += -local131;
				local87 += -local147;
				local147 -= local107;
				local131 -= local107;
			}
			if (local77 < 0) {
				local77 += local133;
				local69 += local115;
				local7++;
				local115 += local103;
				local133 += local103;
			}
			local69 += -local139;
			local77 += -local121;
			local139 -= local99;
			local9--;
			local121 -= local99;
			@Pc(333) int local333 = arg0 - local9;
			@Pc(338) int local338 = arg0 + local9;
			@Pc(342) int local342 = local7 + arg1;
			@Pc(347) int local347 = arg1 - local7;
			if (local196) {
				@Pc(354) int local354 = arg1 + local11;
				@Pc(359) int local359 = arg1 - local11;
				Static249.method6044(Static267.anIntArrayArray50[local333], arg5, local359, local347);
				Static249.method6044(Static267.anIntArrayArray50[local333], arg4, local354, local359);
				Static249.method6044(Static267.anIntArrayArray50[local333], arg5, local342, local354);
				Static249.method6044(Static267.anIntArrayArray50[local338], arg5, local359, local347);
				Static249.method6044(Static267.anIntArrayArray50[local338], arg4, local354, local359);
				Static249.method6044(Static267.anIntArrayArray50[local338], arg5, local342, local354);
			} else {
				Static249.method6044(Static267.anIntArrayArray50[local333], arg5, local342, local347);
				Static249.method6044(Static267.anIntArrayArray50[local338], arg5, local342, local347);
			}
		}
	}
}
