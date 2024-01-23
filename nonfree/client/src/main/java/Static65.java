import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "Lclient!rn;")
	public static Class155 aClass155_31;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Lclient!rn;")
	public static Class155 aClass155_32;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Lclient!db;")
	public static Class31 aClass31_1 = new Class31();

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
	public static int anInt1222 = 0;

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
	public static int anInt1223 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method1016(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) short[] local4 = new short[16];
		@Pc(7) String local7 = arg0.toLowerCase();
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static300.anInt5928; local15++) {
			@Pc(28) Class21 local28 = Static133.method2309(local15);
			if ((!arg1 || local28.aBoolean43) && local28.anInt529 == -1 && local28.anInt553 == -1 && local28.anInt545 == 0 && local28.aString18.toLowerCase().indexOf(local7) != -1) {
				if (local13 >= 250) {
					Static255.aShortArray86 = null;
					Static6.anInt133 = -1;
					return;
				}
				if (local13 >= local4.length) {
					@Pc(79) short[] local79 = new short[local4.length * 2];
					for (@Pc(81) int local81 = 0; local81 < local13; local81++) {
						local79[local81] = local4[local81];
					}
					local4 = local79;
				}
				local4[local13++] = (short) local15;
			}
		}
		Static49.anInt939 = 0;
		Static255.aShortArray86 = local4;
		Static6.anInt133 = local13;
		@Pc(113) String[] local113 = new String[Static6.anInt133];
		for (@Pc(120) int local120 = 0; local120 < Static6.anInt133; local120++) {
			local113[local120] = Static133.method2309(local4[local120]).aString18;
		}
		Static92.method1371(local113, Static255.aShortArray86);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static void method1017() {
		if (Static257.anInt5292 == -1 || Static102.anInt1860 == -1) {
			return;
		}
		@Pc(20) float[] local20 = new float[3];
		@Pc(35) int local35 = ((Static282.anInt5667 - Static107.anInt1969) * Static75.anInt1409 >> 16) + Static107.anInt1969;
		@Pc(39) int local39 = Static123.anInt2319 * 2;
		Static75.anInt1409 += local35;
		if (Static75.anInt1409 < 65535) {
			Static223.aBoolean311 = false;
			Static88.aBoolean136 = false;
		} else {
			Static75.anInt1409 = 65535;
			if (Static88.aBoolean136) {
				Static223.aBoolean311 = false;
			} else {
				Static223.aBoolean311 = true;
			}
			Static88.aBoolean136 = true;
		}
		@Pc(69) float local69 = (float) Static75.anInt1409 / 65535.0F;
		@Pc(86) int local86;
		@Pc(98) int local98;
		@Pc(132) int local132;
		@Pc(140) int local140;
		@Pc(154) int local154;
		@Pc(149) int local149;
		@Pc(172) int local172;
		for (@Pc(71) int local71 = 0; local71 < 3; local71++) {
			local86 = Static153.anIntArrayArrayArray11[Static257.anInt5292][local39][local71] * 3;
			local98 = Static153.anIntArrayArrayArray11[Static257.anInt5292][local39 + 1][local71] * 3;
			local132 = (Static153.anIntArrayArrayArray11[Static257.anInt5292][local39 + 2][local71] + Static153.anIntArrayArrayArray11[Static257.anInt5292][local39 + 2][local71] - Static153.anIntArrayArrayArray11[Static257.anInt5292][local39 + 3][local71]) * 3;
			local140 = Static153.anIntArrayArrayArray11[Static257.anInt5292][local39][local71];
			local149 = local86 + local132 - local98 * 2;
			local154 = local98 - local86;
			local172 = Static153.anIntArrayArrayArray11[Static257.anInt5292][local39 + 2][local71] + local98 - local140 - local132;
			local20[local71] = (float) local140 + local69 * ((float) local154 + local69 * ((float) local149 + (float) local172 * local69));
		}
		Static230.anInt4492 = (int) local20[0] - Static101.anInt1844 * 128;
		Static173.anInt3251 = (int) local20[2] - Static43.anInt798 * 128;
		Static224.anInt6075 = (int) local20[1] * -1;
		@Pc(225) float[] local225 = new float[3];
		local86 = Static145.anInt2777 * 2;
		for (local98 = 0; local98 < 3; local98++) {
			local132 = Static153.anIntArrayArrayArray11[Static102.anInt1860][local86][local98] * 3;
			local140 = Static153.anIntArrayArrayArray11[Static102.anInt1860][local86 + 1][local98] * 3;
			local154 = (Static153.anIntArrayArrayArray11[Static102.anInt1860][local86 + 2][local98] + Static153.anIntArrayArrayArray11[Static102.anInt1860][local86 + 2][local98] - Static153.anIntArrayArrayArray11[Static102.anInt1860][local86 + 3][local98]) * 3;
			local149 = Static153.anIntArrayArrayArray11[Static102.anInt1860][local86][local98];
			local172 = local140 - local132;
			@Pc(310) int local310 = local132 + local154 - local140 * 2;
			@Pc(327) int local327 = local140 + Static153.anIntArrayArrayArray11[Static102.anInt1860][local86 + 2][local98] - local149 - local154;
			local225[local98] = (float) local149 + local69 * (((float) local327 * local69 + (float) local310) * local69 + (float) local172);
		}
		@Pc(358) float local358 = local225[0] - local20[0];
		@Pc(369) float local369 = -1.0F * (local225[1] - local20[1]);
		@Pc(377) float local377 = local225[2] - local20[2];
		@Pc(387) double local387 = Math.sqrt((double) (local377 * local377 + local358 * local358));
		Static170.aFloat46 = (float) Math.atan2((double) local369, local387);
		Static103.aFloat32 = -((float) Math.atan2((double) local358, (double) local377));
		Static113.anInt2103 = (int) ((double) Static103.aFloat32 * 325.949D) & 0x7FF;
		Static79.anInt1912 = (int) ((double) Static170.aFloat46 * 325.949D) & 0x7FF;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public static void method1019() {
		if (Static289.anInt5784 != -1) {
			Static186.method3129(false, -1, Static289.anInt5784, -1);
			Static289.anInt5784 = -1;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 0 || arg5 < 0 || arg3 >= 103 || arg5 >= 103) {
			return;
		}
		@Pc(48) int local48;
		if (arg6 == 0) {
			@Pc(37) Class19 local37 = Static201.method3343(arg4, arg3, arg5);
			if (local37 != null) {
				local48 = Integer.MAX_VALUE & (int) (local37.aLong20 >>> 32);
				if (arg2 == 2) {
					local37.aClass10_3 = new Class10_Sub6(local48, 2, arg1 + 4, arg4, arg3, arg5, arg0, false, local37.aClass10_3);
					local37.aClass10_2 = new Class10_Sub6(local48, 2, arg1 + 1 & 0x3, arg4, arg3, arg5, arg0, false, local37.aClass10_2);
				} else {
					local37.aClass10_3 = new Class10_Sub6(local48, arg2, arg1, arg4, arg3, arg5, arg0, false, local37.aClass10_3);
				}
			}
		}
		if (arg6 == 1) {
			@Pc(115) Class95 local115 = Static155.method2591(arg4, arg3, arg5);
			if (local115 != null) {
				local48 = Integer.MAX_VALUE & (int) (local115.aLong124 >>> 32);
				if (arg2 == 4 || arg2 == 5) {
					local115.aClass10_9 = new Class10_Sub6(local48, 4, arg1, arg4, arg3, arg5, arg0, false, local115.aClass10_9);
				} else if (arg2 == 6) {
					local115.aClass10_9 = new Class10_Sub6(local48, 4, arg1 + 4, arg4, arg3, arg5, arg0, false, local115.aClass10_9);
				} else if (arg2 == 7) {
					local115.aClass10_9 = new Class10_Sub6(local48, 4, (arg1 + 2 & 0x3) + 4, arg4, arg3, arg5, arg0, false, local115.aClass10_9);
				} else if (arg2 == 8) {
					local115.aClass10_9 = new Class10_Sub6(local48, 4, arg1 + 4, arg4, arg3, arg5, arg0, false, local115.aClass10_9);
					local115.aClass10_8 = new Class10_Sub6(local48, 4, (arg1 + 2 & 0x3) + 4, arg4, arg3, arg5, arg0, false, local115.aClass10_8);
				}
			}
		}
		if (arg6 == 2) {
			if (arg2 == 11) {
				arg2 = 10;
			}
			@Pc(263) Class85 local263 = Static108.method1768(arg4, arg3, arg5);
			if (local263 != null) {
				local263.aClass10_7 = new Class10_Sub6(Integer.MAX_VALUE & (int) (local263.aLong107 >>> 32), arg2, arg1, arg4, arg3, arg5, arg0, false, local263.aClass10_7);
			}
		}
		if (arg6 == 3) {
			@Pc(297) Class13 local297 = Static313.method5004(arg4, arg3, arg5);
			if (local297 != null) {
				local297.aClass10_1 = new Class10_Sub6(Integer.MAX_VALUE & (int) (local297.aLong15 >>> 32), 22, arg1, arg4, arg3, arg5, arg0, false, local297.aClass10_1);
			}
		}
	}
}
