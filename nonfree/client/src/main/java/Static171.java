import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!kq", name = "K", descriptor = "[I")
	public static int[] anIntArray265;

	@OriginalMember(owner = "client!kq", name = "L", descriptor = "[S")
	public static short[] aShortArray76;

	@OriginalMember(owner = "client!kq", name = "U", descriptor = "Lclient!ct;")
	public static Class30 aClass30_54;

	@OriginalMember(owner = "client!kq", name = "V", descriptor = "I")
	public static int anInt3574;

	@OriginalMember(owner = "client!kq", name = "X", descriptor = "I")
	public static int anInt3576;

	@OriginalMember(owner = "client!kq", name = "N", descriptor = "Lclient!hj;")
	public static final Class81 aClass81_1 = new Class81("runescape", 0);

	@OriginalMember(owner = "client!kq", name = "S", descriptor = "Z")
	public static boolean aBoolean246 = false;

	@OriginalMember(owner = "client!kq", name = "Y", descriptor = "I")
	public static int anInt3577 = -2;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZLclient!we;Z)V")
	public static void method3203(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class11_Sub2_Sub6_Sub2 arg1) {
		if (Static224.anInt4512 >= 400) {
			return;
		}
		@Pc(12) Class208 local12 = arg1.aClass208_1;
		if (local12.anIntArray480 != null) {
			local12 = local12.method5539();
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean458) {
			return;
		}
		@Pc(34) String local34 = local12.aString57;
		if (local12.anInt6159 != 0) {
			@Pc(57) String local57 = Static215.aClass81_2 == Static285.aClass81_4 ? Static127.aClass106_100.method2927(Static254.anInt5172) : Static230.aClass106_70.method2927(Static254.anInt5172);
			local34 = local34 + Static363.method6018(Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6685, local12.anInt6159) + " (" + local57 + local12.anInt6159 + ")";
		}
		if (!Static77.aBoolean119) {
			if (!arg0) {
				@Pc(87) String[] local87 = local12.aStringArray41;
				if (Static284.aBoolean484) {
					local87 = Static22.method5876(local87);
				}
				@Pc(97) int local97;
				if (local87 != null) {
					for (local97 = 4; local97 >= 0; local97--) {
						if (local87[local97] != null && (Static285.aClass81_4 != aClass81_1 || !local87[local97].equalsIgnoreCase(Static312.aClass106_207.method2927(Static254.anInt5172)))) {
							@Pc(117) byte local117 = 0;
							if (local97 == 0) {
								local117 = 60;
							}
							@Pc(123) int local123 = Static324.anInt6150;
							if (local97 == 1) {
								local117 = 23;
							}
							if (local97 == 2) {
								local117 = 22;
							}
							if (local97 == 3) {
								local117 = 4;
							}
							if (local97 == 4) {
								local117 = 47;
							}
							if (local97 == local12.anInt6195) {
								local123 = local12.anInt6165;
							}
							if (local12.anInt6188 == local97) {
								local123 = local12.anInt6182;
							}
							Static295.method5151(local123, 0, false, true, local87[local97], (long) arg1.anInt6792, "<col=ffff00>" + local34, local117, 0);
						}
					}
				}
				if (Static285.aClass81_4 == aClass81_1 && local87 != null) {
					for (local97 = 4; local97 >= 0; local97--) {
						if (local87[local97] != null && local87[local97].equalsIgnoreCase(Static312.aClass106_207.method2927(Static254.anInt5172))) {
							@Pc(215) short local215 = 0;
							if (Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6685 < local12.anInt6159) {
								local215 = 2000;
							}
							@Pc(224) short local224 = 0;
							if (local97 == 0) {
								local224 = 60;
							}
							if (local97 == 1) {
								local224 = 23;
							}
							if (local97 == 2) {
								local224 = 22;
							}
							if (local97 == 3) {
								local224 = 4;
							}
							if (local97 == 4) {
								local224 = 47;
							}
							if (local224 != 0) {
								local224 += local215;
							}
							Static295.method5151(local12.anInt6158, 0, false, true, local87[local97], (long) arg1.anInt6792, "<col=ffff00>" + local34, local224, 0);
						}
					}
				}
			}
			Static295.method5151(Static270.anInt5273, 0, arg0, true, Static351.aClass106_95.method2927(Static254.anInt5172), (long) arg1.anInt6792, "<col=ffff00>" + local34, 1002, 0);
		} else if (!arg0) {
			@Pc(335) Class1_Sub4_Sub6 local335 = Static37.anInt936 == -1 ? null : Static296.method5175(Static37.anInt936);
			if ((Static127.anInt2772 & 0x2) != 0) {
				if (local335 == null || local12.method5535(local335.anInt1431, Static37.anInt936) != local335.anInt1431) {
					Static295.method5151(Static62.anInt1506, 0, false, true, Static365.aString65, (long) arg1.anInt6792, Static196.aString39 + " -> <col=ffff00>" + local34, 12, 0);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "(I)[Lclient!mg;")
	public static Class134[] method3205() {
		if (Static2.aClass134Array1 == null) {
			@Pc(7) Class134[] local7 = Static154.method2926(Static227.aClass75_5);
			@Pc(11) Class134[] local11 = new Class134[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(64) int local64;
			@Pc(70) Class134 local70;
			label63: for (@Pc(15) int local15 = 0; local15 < local7.length; local15++) {
				@Pc(21) Class134 local21 = local7[local15];
				if ((local21.anInt3968 <= 0 || local21.anInt3968 >= 24) && local21.anInt3972 >= 800 && local21.anInt3973 >= 600 && (Static268.anInt5269 >= 96 || Static241.anInt4925 != 0 || local21.anInt3972 <= 1024 && local21.anInt3973 <= 768)) {
					for (local64 = 0; local64 < local13; local64++) {
						local70 = local11[local64];
						if (local21.anInt3972 == local70.anInt3972 && local70.anInt3973 == local21.anInt3973) {
							if (local70.anInt3968 < local21.anInt3968) {
								local11[local64] = local21;
							}
							continue label63;
						}
					}
					local11[local13] = local21;
					local13++;
				}
			}
			Static2.aClass134Array1 = new Class134[local13];
			Static374.method2825(local11, 0, Static2.aClass134Array1, 0, local13);
			@Pc(126) int[] local126 = new int[Static2.aClass134Array1.length];
			for (local64 = 0; local64 < Static2.aClass134Array1.length; local64++) {
				local70 = Static2.aClass134Array1[local64];
				local126[local64] = local70.anInt3973 * local70.anInt3972;
			}
			Static67.method1546(local126, Static2.aClass134Array1);
		}
		return Static2.aClass134Array1;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII)I")
	public static int method3206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 & 0x3;
		if (local16 == 0) {
			return arg2;
		} else if (local16 == 1) {
			return arg0;
		} else if (local16 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3207(@OriginalArg(0) String arg0) {
		return Static8.method289(arg0, 10);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3208(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZ)V")
	public static void method3209(@OriginalArg(1) boolean arg0) {
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static359.aByteArrayArray20;
		} else {
			local9 = Static355.aByteArrayArray19;
		}
		@Pc(16) int local16 = Static349.aByteArrayArray18.length;
		for (@Pc(26) int local26 = 0; local26 < local16; local26++) {
			@Pc(32) byte[] local32 = local9[local26];
			if (local32 != null) {
				@Pc(45) int local45 = (Static37.anIntArray60[local26] >> 8) * 64 - Static50.anInt1271;
				@Pc(55) int local55 = (Static37.anIntArray60[local26] & 0xFF) * 64 - Static299.anInt4036;
				Static82.method1769();
				Static334.method5885(local55, local32, arg0, Static9.aClass63_1, Static11.aClass196Array2, local45);
			}
		}
	}
}
