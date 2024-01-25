import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "F")
	public static float aFloat144;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
	public static int anInt6773 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V")
	public static void method5887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg0 + arg1);
		@Pc(31) int local31 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg1 - arg0);
		Static82.method1400(arg3, local31, local22, Static71.anIntArrayArray5[arg2]);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(62) int local62;
			@Pc(66) int local66;
			@Pc(88) int local88;
			@Pc(96) int local96;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local62 = arg2 - local9;
				local66 = arg2 + local9;
				if (local66 >= Static298.anInt5919 && local62 <= Static596.anInt9703) {
					local88 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, local7 + arg1);
					local96 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg1 - local7);
					if (Static596.anInt9703 >= local66) {
						Static82.method1400(arg3, local96, local88, Static71.anIntArrayArray5[local66]);
					}
					if (local62 >= Static298.anInt5919) {
						Static82.method1400(arg3, local96, local88, Static71.anIntArrayArray5[local62]);
					}
				}
			}
			local7++;
			local62 = arg2 - local7;
			local66 = local7 + arg2;
			if (local66 >= Static298.anInt5919 && Static596.anInt9703 >= local62) {
				local88 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg1 + local9);
				local96 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg1 - local9);
				if (local66 <= Static596.anInt9703) {
					Static82.method1400(arg3, local96, local88, Static71.anIntArrayArray5[local66]);
				}
				if (local62 >= Static298.anInt5919) {
					Static82.method1400(arg3, local96, local88, Static71.anIntArrayArray5[local62]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIB)V")
	public static void method5888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub7_Sub5 local8 = Static138.method2377(6, arg1);
		local8.method1474();
		local8.anInt1728 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIZ)V")
	public static void method5889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		if (arg2 > arg1) {
			for (local18 = arg1; local18 < arg2; local18++) {
				Static71.anIntArrayArray5[local18][arg3] = arg0;
			}
		} else {
			for (local18 = arg2; local18 < arg1; local18++) {
				Static71.anIntArrayArray5[local18][arg3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Z")
	public static boolean method5890(@OriginalArg(0) int arg0) {
		if (arg0 == 12 || arg0 == 47 || arg0 == 6 || arg0 == 25 || arg0 == 49) {
			return true;
		} else {
			return arg0 == 46 || arg0 == 1003;
		}
	}
}
