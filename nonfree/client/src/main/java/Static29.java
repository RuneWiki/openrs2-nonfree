import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_12 = new Class211(12, 12);

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIBI)V")
	public static void method480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg2;
		@Pc(17) int local17 = -arg2;
		@Pc(19) int local19 = -1;
		@Pc(28) int local28 = Static140.method5231(arg1 + arg2, Static98.anInt1774, Static372.anInt1561);
		@Pc(36) int local36 = Static140.method5231(arg1 - arg2, Static98.anInt1774, Static372.anInt1561);
		Static382.method5419(Static369.anIntArrayArray35[arg0], local36, local28, arg3);
		while (local14 > local12) {
			local19 += 2;
			local17 += local19;
			@Pc(68) int local68;
			@Pc(72) int local72;
			@Pc(90) int local90;
			@Pc(99) int local99;
			if (local17 > 0) {
				local14--;
				local17 -= local14 << 1;
				local68 = arg0 - local14;
				local72 = local14 + arg0;
				if (local72 >= Static194.anInt3448 && Static264.anInt4589 >= local68) {
					local90 = Static140.method5231(arg1 + local12, Static98.anInt1774, Static372.anInt1561);
					local99 = Static140.method5231(arg1 - local12, Static98.anInt1774, Static372.anInt1561);
					if (local72 <= Static264.anInt4589) {
						Static382.method5419(Static369.anIntArrayArray35[local72], local99, local90, arg3);
					}
					if (local68 >= Static194.anInt3448) {
						Static382.method5419(Static369.anIntArrayArray35[local68], local99, local90, arg3);
					}
				}
			}
			local12++;
			local68 = arg0 - local12;
			local72 = arg0 + local12;
			if (local72 >= Static194.anInt3448 && local68 <= Static264.anInt4589) {
				local90 = Static140.method5231(arg1 + local14, Static98.anInt1774, Static372.anInt1561);
				local99 = Static140.method5231(arg1 - local14, Static98.anInt1774, Static372.anInt1561);
				if (local72 <= Static264.anInt4589) {
					Static382.method5419(Static369.anIntArrayArray35[local72], local99, local90, arg3);
				}
				if (local68 >= Static194.anInt3448) {
					Static382.method5419(Static369.anIntArrayArray35[local68], local99, local90, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILclient!je;ZIILclient!us;II)V")
	public static void method481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class34 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg7 * arg7 + arg1 * arg1;
		if (arg0 < local11) {
			return;
		}
		@Pc(29) int local29 = Math.min(arg2.anInt3074 / 2, arg2.anInt3071 / 2);
		if (local29 * local29 >= local11) {
			Static159.method2374(arg2, arg1, Static231.aClass51Array19[arg6], arg5, arg4, arg3, arg7);
			return;
		}
		local29 -= 10;
		@Pc(51) int local51;
		if (Static323.anInt5463 == 4) {
			local51 = (int) Static386.aFloat82 & 0x3FFF;
		} else {
			local51 = Static246.anInt4136 + (int) Static386.aFloat82 & 0x3FFF;
		}
		@Pc(62) int local62 = Class13.anIntArray20[local51];
		@Pc(66) int local66 = Class13.anIntArray21[local51];
		if (Static323.anInt5463 != 4) {
			local62 = local62 * 256 / (Static205.anInt3600 + 256);
			local66 = local66 * 256 / (Static205.anInt3600 + 256);
		}
		@Pc(96) int local96 = local62 * arg7 + local66 * arg1 >> 15;
		@Pc(107) int local107 = local66 * arg7 - local62 * arg1 >> 15;
		@Pc(113) double local113 = Math.atan2((double) local96, (double) local107);
		@Pc(120) int local120 = (int) ((double) local29 * Math.sin(local113));
		@Pc(127) int local127 = (int) (Math.cos(local113) * (double) local29);
		Static61.aClass51Array4[arg6].method4678((float) arg2.anInt3074 / 2.0F + (float) arg3 + (float) local120, (float) arg4 + (float) arg2.anInt3071 / 2.0F - (float) local127, 4096, (int) (-local113 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!ui;B)V")
	public static void method482(@OriginalArg(0) Class230 arg0) {
		Static386.anInt6288 = arg0.method4970("titlebg");
		Static187.anInt3284 = arg0.method4970("logo");
	}
}
