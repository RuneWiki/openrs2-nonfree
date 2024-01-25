import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Lclient!oa;")
	public static Class14 aClass14_12;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	public static int anInt7237 = 0;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
	public static final int anInt7240 = 1339;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
	public static int anInt7243 = -1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBI)Z")
	public static boolean method5967(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static421.method6084(arg0, arg1) & Static472.method6557(arg1, arg0);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)I")
	public static int method5968(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local76 < 0.5D) {
				local70 = (local46 - local32) / (local46 + local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local76 >= 0.5D) {
				local70 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(165) int local165 = (int) (local60 * 256.0D);
		@Pc(170) int local170 = (int) (local70 * 256.0D);
		@Pc(175) int local175 = (int) (local76 * 256.0D);
		if (local170 < 0) {
			local170 = 0;
		} else if (local170 > 255) {
			local170 = 255;
		}
		if (local175 < 0) {
			local175 = 0;
		} else if (local175 > 255) {
			local175 = 255;
		}
		if (local175 > 243) {
			local170 >>= 0x4;
		} else if (local175 > 217) {
			local170 >>= 0x3;
		} else if (local175 > 192) {
			local170 >>= 0x2;
		} else if (local175 > 179) {
			local170 >>= 0x1;
		}
		return (local170 >> 5 << 7) + ((local165 & 0xFF) >> 2 << 10) + (local175 >> 1);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5970(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static201.method3634(arg1, Static415.anInt9494, Static583.anInt9478);
		@Pc(17) int local17 = Static201.method3634(arg3, Static415.anInt9494, Static583.anInt9478);
		@Pc(23) int local23 = Static201.method3634(arg0, Static461.anInt7899, Static13.anInt7634);
		@Pc(29) int local29 = Static201.method3634(arg6, Static461.anInt7899, Static13.anInt7634);
		@Pc(37) int local37 = Static201.method3634(arg1 + arg4, Static415.anInt9494, Static583.anInt9478);
		@Pc(46) int local46 = Static201.method3634(arg3 - arg4, Static415.anInt9494, Static583.anInt9478);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static208.method3687(local23, arg5, Static454.anIntArrayArray71[local48], local29);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static208.method3687(local23, arg5, Static454.anIntArrayArray71[local68], local29);
		}
		@Pc(91) int local91 = Static201.method3634(arg0 + arg4, Static461.anInt7899, Static13.anInt7634);
		@Pc(100) int local100 = Static201.method3634(arg6 - arg4, Static461.anInt7899, Static13.anInt7634);
		for (@Pc(107) int local107 = local37; local107 <= local46; local107++) {
			@Pc(113) int[] local113 = Static454.anIntArrayArray71[local107];
			Static208.method3687(local23, arg5, local113, local91);
			Static208.method3687(local91, arg2, local113, local100);
			Static208.method3687(local100, arg5, local113, local29);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)Z")
	public static boolean method5971(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static587.aBoolean734) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(22) int local22 = arg1 & 0xFFFF;
		if (Static14.aClass292ArrayArray1[local13] == null || Static14.aClass292ArrayArray1[local13][local22] == null) {
			return false;
		}
		@Pc(40) Class292 local40 = Static14.aClass292ArrayArray1[local13][local22];
		@Pc(52) Class6_Sub45 local52;
		if (arg0 == -1 && local40.lb == 0) {
			for (local52 = (Class6_Sub45) Static182.aClass361_23.method7838(); local52 != null; local52 = (Class6_Sub45) Static182.aClass361_23.method7845()) {
				if (local52.anInt8730 == 60 || local52.anInt8730 == 1002 || local52.anInt8730 == 3 || local52.anInt8730 == 22 || local52.anInt8730 == 44) {
					for (@Pc(134) Class292 local134 = Static367.method5505(local52.anInt8735); local134 != null; local134 = Static264.method4416(local134)) {
						if (local134.anInt7890 == local40.anInt7890) {
							return true;
						}
					}
				}
			}
		} else {
			for (local52 = (Class6_Sub45) Static182.aClass361_23.method7838(); local52 != null; local52 = (Class6_Sub45) Static182.aClass361_23.method7845()) {
				if (local52.anInt8733 == arg0 && local40.anInt7890 == local52.anInt8735 && (local52.anInt8730 == 60 || local52.anInt8730 == 1002 || local52.anInt8730 == 3 || local52.anInt8730 == 22 || local52.anInt8730 == 44)) {
					return true;
				}
			}
		}
		return false;
	}
}
