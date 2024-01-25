import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!fm", name = "F", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!fm", name = "H", descriptor = "[S")
	public static short[] aShortArray27;

	@OriginalMember(owner = "client!fm", name = "J", descriptor = "[Lclient!f;")
	public static Class76[] aClass76Array11;

	@OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
	public static int anInt2385;

	@OriginalMember(owner = "client!fm", name = "M", descriptor = "Lclient!fr;")
	public static Class90 aClass90_9;

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "Lclient!vf;")
	public static final Class254 aClass254_1 = new Class254(14, 1);

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "Lclient!vf;")
	public static final Class254 aClass254_2 = new Class254(15, 4);

	@OriginalMember(owner = "client!fm", name = "v", descriptor = "Lclient!vf;")
	public static final Class254 aClass254_3 = new Class254(16, -2);

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "Lclient!vf;")
	public static final Class254 aClass254_4 = new Class254(17, 0);

	@OriginalMember(owner = "client!fm", name = "x", descriptor = "Lclient!vf;")
	public static final Class254 aClass254_5 = new Class254(18, -2);

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "Lclient!vf;")
	public static final Class254 aClass254_6 = new Class254(20, 6);

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "Lclient!vf;")
	public static final Class254 aClass254_7 = new Class254(21, 8);

	@OriginalMember(owner = "client!fm", name = "A", descriptor = "Lclient!vf;")
	public static final Class254 aClass254_8 = new Class254(22, -2);

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "Lclient!vf;")
	public static final Class254 aClass254_9 = new Class254(23, 4);

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "Lclient!vf;")
	public static final Class254 aClass254_10 = new Class254(24, -1);

	@OriginalMember(owner = "client!fm", name = "E", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_52 = new Class81(40, -1);

	@OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
	public static int anInt2383 = 0;

	@OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
	public static int anInt2384 = 0;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIB)Z")
	public static boolean method1741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIBI)V")
	public static void method1742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static440.method5950(arg3, Static175.anInt3399, Static75.anInt1858);
		@Pc(17) int local17 = Static440.method5950(arg0, Static175.anInt3399, Static75.anInt1858);
		@Pc(23) int local23 = Static440.method5950(arg2, Static351.anInt6176, Static331.anInt5894);
		@Pc(37) int local37 = Static440.method5950(arg4, Static351.anInt6176, Static331.anInt5894);
		for (@Pc(39) int local39 = local11; local39 <= local17; local39++) {
			Static49.method990(Static277.anIntArrayArray40[local39], local37, local23, arg1);
		}
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V")
	public static void method1743() {
		Static168.method2616(Static191.aClass41_7);
		Static190.anInt3757++;
		if (Static30.aBoolean590 && Static238.aBoolean374) {
			@Pc(36) int local36 = Static304.aClass40_1.method1164();
			@Pc(40) int local40 = Static304.aClass40_1.method1159();
			local36 -= Static77.anInt7116;
			local40 -= Static396.anInt6928;
			if (Static328.anInt5877 > local36) {
				local36 = Static328.anInt5877;
			}
			if (local40 < Static194.anInt3808) {
				local40 = Static194.anInt3808;
			}
			if (Static328.anInt5877 + Static309.aClass41_11.anInt1622 < local36 + Static191.aClass41_7.anInt1622) {
				local36 = Static328.anInt5877 + Static309.aClass41_11.anInt1622 - Static191.aClass41_7.anInt1622;
			}
			if (local40 + Static191.aClass41_7.anInt1599 > Static309.aClass41_11.anInt1599 + Static194.anInt3808) {
				local40 = Static309.aClass41_11.anInt1599 + Static194.anInt3808 - Static191.aClass41_7.anInt1599;
			}
			@Pc(111) int local111 = local36 + Static309.aClass41_11.anInt1665 - Static328.anInt5877;
			@Pc(118) int local118 = Static309.aClass41_11.anInt1620 + local40 - Static194.anInt3808;
			@Pc(133) Class2_Sub14 local133;
			if (Static304.aClass40_1.method1162()) {
				if (Static190.anInt3757 > Static191.aClass41_7.anInt1630) {
					@Pc(206) int local206 = local36 - Static121.anInt2404;
					@Pc(210) int local210 = local40 - Static112.anInt2294;
					if (local206 > Static191.aClass41_7.anInt1679 || local206 < -Static191.aClass41_7.anInt1679 || local210 > Static191.aClass41_7.anInt1679 || local210 < -Static191.aClass41_7.anInt1679) {
						Static150.aBoolean255 = true;
					}
				}
				if (Static191.aClass41_7.anObjectArray14 != null && Static150.aBoolean255) {
					local133 = new Class2_Sub14();
					local133.aClass41_5 = Static191.aClass41_7;
					local133.anInt1856 = local111;
					local133.anObjectArray32 = Static191.aClass41_7.anObjectArray14;
					local133.anInt1852 = local118;
					Static290.method4227(local133);
				}
			} else {
				if (Static150.aBoolean255) {
					Static342.method4802();
					if (Static191.aClass41_7.anObjectArray30 != null) {
						local133 = new Class2_Sub14();
						local133.anObjectArray32 = Static191.aClass41_7.anObjectArray30;
						local133.anInt1856 = local111;
						local133.aClass41_5 = Static191.aClass41_7;
						local133.anInt1852 = local118;
						local133.aClass41_4 = Static153.aClass41_6;
						Static290.method4227(local133);
					}
					if (Static153.aClass41_6 != null && Static56.method1120(Static191.aClass41_7) != null) {
						Static374.method5254(Static191.aClass41_7, Static153.aClass41_6);
					}
				} else if ((Static296.anInt5336 == 1 || Static269.method4013()) && Static168.anInt3255 > 2) {
					Static389.method5366(Static121.anInt2404 + Static77.anInt7116, Static112.anInt2294 + Static396.anInt6928);
				} else if (Static253.method3873()) {
					Static389.method5366(Static121.anInt2404 + Static77.anInt7116, Static112.anInt2294 + Static396.anInt6928);
				}
				Static191.aClass41_7 = null;
			}
		} else if (Static190.anInt3757 > 1) {
			Static191.aClass41_7 = null;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZIII)V")
	public static void method1744(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static169.anInt3160 / (float) Static169.anInt3168;
		@Pc(11) int local11 = arg2;
		@Pc(13) int local13 = arg0;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg2);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(40) int local40 = arg3 - (arg0 - local13) / 2;
		@Pc(48) int local48 = arg1 - (arg2 - local11) / 2;
		Static393.anInt6878 = Static169.anInt3160 - Static169.anInt3160 * local40 / local13;
		Static452.anInt7845 = -1;
		Static67.anInt1777 = local48 * Static169.anInt3168 / local11;
		Static168.anInt3256 = -1;
		Static39.method728();
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIII)V")
	public static void method1745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 - arg3;
		@Pc(14) int local14 = arg4 - arg0;
		if (local9 == 0) {
			if (local14 != 0) {
				Static221.method3413(arg4, arg3, arg1, arg0);
			}
		} else if (local14 == 0) {
			Static449.method1958(arg1, arg3, arg2, arg0);
		} else {
			@Pc(51) int local51 = (local14 << 12) / local9;
			@Pc(60) int local60 = arg0 - (local51 * arg3 >> 12);
			@Pc(69) int local69;
			@Pc(78) int local78;
			if (Static331.anInt5894 > arg2) {
				local69 = Static331.anInt5894;
				local78 = local60 + (local51 * Static331.anInt5894 >> 12);
			} else if (Static351.anInt6176 >= arg2) {
				local69 = arg2;
				local78 = arg4;
			} else {
				local69 = Static351.anInt6176;
				local78 = local60 + (Static351.anInt6176 * local51 >> 12);
			}
			@Pc(116) int local116;
			@Pc(118) int local118;
			if (arg3 < Static331.anInt5894) {
				local118 = local60 + (Static331.anInt5894 * local51 >> 12);
				local116 = Static331.anInt5894;
			} else if (arg3 <= Static351.anInt6176) {
				local116 = arg3;
				local118 = arg0;
			} else {
				local118 = (local51 * Static351.anInt6176 >> 12) + local60;
				local116 = Static351.anInt6176;
			}
			if (local118 < Static75.anInt1858) {
				local116 = (Static75.anInt1858 - local60 << 12) / local51;
				local118 = Static75.anInt1858;
			} else if (local118 > Static175.anInt3399) {
				local118 = Static175.anInt3399;
				local116 = (Static175.anInt3399 - local60 << 12) / local51;
			}
			if (Static75.anInt1858 > local78) {
				local69 = (Static75.anInt1858 - local60 << 12) / local51;
				local78 = Static75.anInt1858;
			} else if (Static175.anInt3399 < local78) {
				local78 = Static175.anInt3399;
				local69 = (Static175.anInt3399 - local60 << 12) / local51;
			}
			Static419.method5687(local116, local78, local69, local118, arg1);
		}
	}
}
