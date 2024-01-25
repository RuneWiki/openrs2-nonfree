import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
	public static int anInt4102;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIBIIII)V")
	public static void method3212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg3;
		@Pc(20) int local20 = arg5 - arg3;
		@Pc(24) int local24 = arg2 * arg2;
		@Pc(28) int local28 = arg5 * arg5;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg5 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + (1 - local56) * local24;
		@Pc(77) int local77 = local28 - local44 * (local56 - 1);
		@Pc(86) int local86 = (1 - local60) * local32 + local48;
		@Pc(95) int local95 = local36 - local52 * (local60 - 1);
		@Pc(99) int local99 = local24 << 2;
		@Pc(103) int local103 = local28 << 2;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 * 3;
		@Pc(121) int local121 = (local56 - 3) * local44;
		@Pc(125) int local125 = local48 * 3;
		@Pc(139) int local139 = (local60 - 3) * local52;
		@Pc(141) int local141 = local103;
		@Pc(147) int local147 = (arg5 - 1) * local99;
		@Pc(149) int local149 = local111;
		@Pc(172) int local172;
		@Pc(181) int local181;
		@Pc(190) int local190;
		@Pc(198) int local198;
		if (Static142.anInt2163 <= arg4 && Static182.anInt3402 >= arg4) {
			@Pc(163) int[] local163 = Static194.anIntArrayArray28[arg4];
			local172 = Static241.method3467(arg1 - arg2, Static281.anInt4757, Static457.anInt7264);
			local181 = Static241.method3467(arg1 + arg2, Static281.anInt4757, Static457.anInt7264);
			local190 = Static241.method3467(arg1 - local16, Static281.anInt4757, Static457.anInt7264);
			local198 = Static241.method3467(local16 + arg1, Static281.anInt4757, Static457.anInt7264);
			Static298.method3977(local172, arg0, local190, local163);
			Static298.method3977(local190, arg6, local198, local163);
			Static298.method3977(local198, arg0, local181, local163);
		}
		@Pc(222) int local222 = (local20 - 1) * local107;
		while (local9 > 0) {
			@Pc(231) boolean local231 = local9 <= local20;
			if (local231) {
				if (local86 < 0) {
					while (local86 < 0) {
						local86 += local125;
						local95 += local149;
						local125 += local111;
						local11++;
						local149 += local111;
					}
				}
				if (local95 < 0) {
					local95 += local149;
					local86 += local125;
					local11++;
					local125 += local111;
					local149 += local111;
				}
				local86 += -local222;
				local95 += -local139;
				local222 -= local107;
				local139 -= local107;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local115;
					local77 += local141;
					local7++;
					local141 += local103;
					local115 += local103;
				}
			}
			if (local77 < 0) {
				local77 += local141;
				local69 += local115;
				local141 += local103;
				local7++;
				local115 += local103;
			}
			local77 += -local121;
			local69 += -local147;
			local121 -= local99;
			local147 -= local99;
			local9--;
			local172 = arg4 - local9;
			local181 = arg4 + local9;
			if (Static142.anInt2163 <= local181 && Static182.anInt3402 >= local172) {
				local190 = Static241.method3467(arg1 + local7, Static281.anInt4757, Static457.anInt7264);
				local198 = Static241.method3467(arg1 - local7, Static281.anInt4757, Static457.anInt7264);
				if (local231) {
					@Pc(446) int local446 = Static241.method3467(local11 + arg1, Static281.anInt4757, Static457.anInt7264);
					@Pc(454) int local454 = Static241.method3467(arg1 - local11, Static281.anInt4757, Static457.anInt7264);
					@Pc(465) int[] local465;
					if (local172 >= Static142.anInt2163) {
						local465 = Static194.anIntArrayArray28[local172];
						Static298.method3977(local198, arg0, local454, local465);
						Static298.method3977(local454, arg6, local446, local465);
						Static298.method3977(local446, arg0, local190, local465);
					}
					if (Static182.anInt3402 >= local181) {
						local465 = Static194.anIntArrayArray28[local181];
						Static298.method3977(local198, arg0, local454, local465);
						Static298.method3977(local454, arg6, local446, local465);
						Static298.method3977(local446, arg0, local190, local465);
					}
				} else {
					if (Static142.anInt2163 <= local172) {
						Static298.method3977(local198, arg0, local190, Static194.anIntArrayArray28[local172]);
					}
					if (Static182.anInt3402 >= local181) {
						Static298.method3977(local198, arg0, local190, Static194.anIntArrayArray28[local181]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V")
	public static void method3215() {
		Static210.method5858();
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			Static385.aClass158Array1[local13].method3624();
		}
		Static349.method4563();
		Static167.method2199();
		System.gc();
	}
}
