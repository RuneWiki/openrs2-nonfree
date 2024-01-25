import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!el", name = "J", descriptor = "I")
	public static int anInt1382;

	@OriginalMember(owner = "client!el", name = "L", descriptor = "Lclient!ho;")
	public static Class94 aClass94_1;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IZIIIIII)V")
	public static void method1301(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg5;
		@Pc(20) int local20 = arg1 - arg5;
		@Pc(24) int local24 = arg2 * arg2;
		@Pc(28) int local28 = arg1 * arg1;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg1 << 1;
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
		@Pc(122) int local122 = (local56 - 3) * local44;
		@Pc(126) int local126 = local48 * 3;
		@Pc(132) int local132 = (local60 - 3) * local52;
		@Pc(134) int local134 = local104;
		@Pc(144) int local144 = local100 * (arg1 - 1);
		@Pc(146) int local146 = local112;
		@Pc(152) int local152 = (local20 - 1) * local108;
		@Pc(156) int[] local156 = Static11.anIntArrayArray11[arg3];
		Static14.method247(arg4 - local16, arg0, local156, arg4 - arg2);
		Static14.method247(arg4 + local16, arg6, local156, arg4 - local16);
		Static14.method247(arg4 + arg2, arg0, local156, arg4 + local16);
		while (local9 > 0) {
			@Pc(199) boolean local199 = local9 <= local20;
			if (local199) {
				if (local87 < 0) {
					while (local87 < 0) {
						local96 += local146;
						local87 += local126;
						local126 += local112;
						local146 += local112;
						local11++;
					}
				}
				if (local96 < 0) {
					local87 += local126;
					local96 += local146;
					local126 += local112;
					local11++;
					local146 += local112;
				}
				local87 += -local152;
				local96 += -local132;
				local132 -= local108;
				local152 -= local108;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local116;
					local78 += local134;
					local134 += local104;
					local116 += local104;
					local7++;
				}
			}
			if (local78 < 0) {
				local69 += local116;
				local78 += local134;
				local134 += local104;
				local7++;
				local116 += local104;
			}
			local78 += -local122;
			local69 += -local144;
			local9--;
			local144 -= local100;
			local122 -= local100;
			@Pc(333) int local333 = arg3 - local9;
			@Pc(338) int local338 = arg3 + local9;
			@Pc(343) int local343 = arg4 + local7;
			@Pc(347) int local347 = arg4 - local7;
			if (local199) {
				@Pc(371) int local371 = arg4 + local11;
				@Pc(376) int local376 = arg4 - local11;
				Static14.method247(local376, arg0, Static11.anIntArrayArray11[local333], local347);
				Static14.method247(local371, arg6, Static11.anIntArrayArray11[local333], local376);
				Static14.method247(local343, arg0, Static11.anIntArrayArray11[local333], local371);
				Static14.method247(local376, arg0, Static11.anIntArrayArray11[local338], local347);
				Static14.method247(local371, arg6, Static11.anIntArrayArray11[local338], local376);
				Static14.method247(local343, arg0, Static11.anIntArrayArray11[local338], local371);
			} else {
				Static14.method247(local343, arg0, Static11.anIntArrayArray11[local333], local347);
				Static14.method247(local343, arg0, Static11.anIntArrayArray11[local338], local347);
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)I")
	public static int method1302(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(25) Class6_Sub38 local25 = (Class6_Sub38) Static297.aClass108_31.method2900((long) arg0);
		if (local25 == null) {
			return Static29.method477(arg0).anInt6325;
		}
		@Pc(34) int local34 = 0;
		for (@Pc(36) int local36 = 0; local36 < local25.anIntArray653.length; local36++) {
			if (local25.anIntArray653[local36] == -1) {
				local34++;
			}
		}
		return local34 + Static29.method477(arg0).anInt6325 - local25.anIntArray653.length;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(IB)V")
	public static void method1304(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(12, arg0);
		local8.method2645();
	}
}
