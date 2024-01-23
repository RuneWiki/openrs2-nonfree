import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
	public static int anInt1969;

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
	public static int anInt1962 = 0;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
	public static int anInt1964 = 1;

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
	public static int anInt1968 = -1;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIILclient!fc;IJZ)Z")
	public static boolean method1661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class36 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static286.method4734(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 >= Static68.anInt1509 && Static43.anInt1054 >= arg6 && arg3 >= Static127.anInt2664 && arg4 <= Static290.anInt6021) {
			Static102.method1928(arg5, arg1, arg6, arg0, arg2, arg3, arg4);
		} else {
			Static242.method3952(arg4, arg5, arg3, arg6, arg2, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!kk;)I")
	public static int method1663(@OriginalArg(1) Class36_Sub3_Sub1 arg0) {
		@Pc(16) Class33 local16 = arg0.aClass33_1;
		if (local16.anIntArray55 != null) {
			local16 = local16.method719();
			if (local16 == null) {
				return -1;
			}
		}
		@Pc(30) int local30 = local16.anInt854;
		@Pc(34) Class70 local34 = arg0.method4104();
		if (arg0.anInt5138 == local34.anInt2124) {
			local30 = local16.anInt886;
		} else if (arg0.anInt5138 == local34.anInt2096 || local34.anInt2116 == arg0.anInt5138 || arg0.anInt5138 == local34.anInt2092 || arg0.anInt5138 == local34.anInt2106) {
			local30 = local16.anInt885;
		} else if (local34.anInt2097 == arg0.anInt5138 || arg0.anInt5138 == local34.anInt2113 || arg0.anInt5138 == local34.anInt2093 || arg0.anInt5138 == local34.anInt2122) {
			local30 = local16.anInt862;
		}
		return local30;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
	public static void method1664() {
		if (Static155.anInt6185 == 2) {
			if (Static9.anInt275 == Static104.anInt2262 && Static68.anInt1506 == Static118.anInt2534) {
				Static155.anInt6185 = 0;
				if (Static42.aBoolean74 && Static79.aBooleanArray8[81] && Static216.anInt4481 > 2) {
					Static137.method2427(Static216.anInt4481 - 2);
				} else {
					Static137.method2427(Static216.anInt4481 - 1);
				}
			}
		} else if (Static9.anInt275 == Static199.anInt4139 && Static68.anInt1506 == Static122.anInt2587) {
			Static155.anInt6185 = 0;
			if (Static42.aBoolean74 && Static79.aBooleanArray8[81] && Static216.anInt4481 > 2) {
				Static137.method2427(Static216.anInt4481 - 2);
			} else {
				Static137.method2427(Static216.anInt4481 - 1);
			}
		} else {
			Static104.anInt2262 = Static199.anInt4139;
			Static118.anInt2534 = Static122.anInt2587;
			Static155.anInt6185 = 2;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "([Lclient!mn;II)V")
	public static void method1667(@OriginalArg(0) Class115[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
			@Pc(27) Class115 local27 = arg0[local15];
			if (local27 != null) {
				if (local27.anInt3538 == 0) {
					if (local27.aClass115Array1 != null) {
						method1667(local27.aClass115Array1, arg1);
					}
					@Pc(53) Class2_Sub15 local53 = (Class2_Sub15) Static152.aClass79_14.method2002((long) local27.anInt3552);
					if (local53 != null) {
						Static11.method254(arg1, local53.anInt2424);
					}
				}
				@Pc(70) Class2_Sub6 local70;
				if (arg1 == 0 && local27.anObjectArray29 != null) {
					local70 = new Class2_Sub6();
					local70.aClass115_4 = local27;
					local70.anObjectArray1 = local27.anObjectArray29;
					Static73.method1363(local70);
				}
				if (arg1 == 1 && local27.anObjectArray27 != null) {
					if (local27.anInt3499 >= 0) {
						@Pc(100) Class115 local100 = Static90.method1692(local27.anInt3552);
						if (local100 == null || local100.aClass115Array1 == null || local27.anInt3499 >= local100.aClass115Array1.length || local100.aClass115Array1[local27.anInt3499] != local27) {
							continue;
						}
					}
					local70 = new Class2_Sub6();
					local70.aClass115_4 = local27;
					local70.anObjectArray1 = local27.anObjectArray27;
					Static73.method1363(local70);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)V")
	public static void method1668(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static92.aFloat22 = 3.0F;
		} else if (arg0 == 50) {
			Static92.aFloat22 = 4.0F;
		} else if (arg0 == 75) {
			Static92.aFloat22 = 6.0F;
		} else if (arg0 == 100) {
			Static92.aFloat22 = 8.0F;
		} else if (arg0 == 200) {
			Static92.aFloat22 = 16.0F;
		}
		anInt1968 = -1;
		anInt1968 = -1;
	}
}
