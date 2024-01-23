import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "Lclient!fh;")
	public static Class58 aClass58_92;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!cc;")
	public static Class26 aClass26_52 = new Class26(16);

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
	public static int anInt4908 = 0;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method4065(@OriginalArg(1) int arg0) {
		@Pc(22) byte[] local22;
		if (arg0 == 100 && Static65.anInt1266 > 0) {
			local22 = Static50.aByteArrayArray9[--Static65.anInt1266];
			Static50.aByteArrayArray9[Static65.anInt1266] = null;
			return local22;
		} else if (arg0 == 5000 && Static182.anInt3472 > 0) {
			local22 = Static212.aByteArrayArray30[--Static182.anInt3472];
			Static212.aByteArrayArray30[Static182.anInt3472] = null;
			return local22;
		} else if (arg0 == 30000 && Static56.anInt1161 > 0) {
			local22 = Static68.aByteArrayArray11[--Static56.anInt1161];
			Static68.aByteArrayArray11[Static56.anInt1161] = null;
			return local22;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)V")
	public static void method4067() {
		Static164.aClass26_30.method517(5);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(7) int local7 = arg3 - arg6;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg6;
		@Pc(20) int local20 = arg5 * arg5;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local28 << 1;
		@Pc(40) int local40 = local7 * local7;
		@Pc(44) int local44 = local20 << 1;
		@Pc(48) int local48 = local40 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg3 << 1;
		@Pc(60) int local60 = local7 << 1;
		@Pc(69) int local69 = local36 + (1 - local56) * local20;
		@Pc(78) int local78 = local28 - (local56 - 1) * local44;
		@Pc(87) int local87 = local32 * (1 - local60) + local48;
		@Pc(91) int local91 = local20 << 2;
		@Pc(104) int local104 = local40 - local52 * (local60 - 1);
		@Pc(108) int local108 = local28 << 2;
		@Pc(112) int local112 = local32 << 2;
		@Pc(116) int local116 = local40 << 2;
		@Pc(120) int local120 = local36 * 3;
		@Pc(124) int local124 = local48 * 3;
		@Pc(130) int local130 = local44 * (local56 - 3);
		@Pc(132) int local132 = local108;
		@Pc(138) int local138 = (local60 - 3) * local52;
		@Pc(144) int local144 = local91 * (arg3 - 1);
		@Pc(146) int local146 = local116;
		@Pc(152) int local152 = (local7 - 1) * local112;
		@Pc(177) int local177;
		@Pc(185) int local185;
		@Pc(193) int local193;
		@Pc(203) int local203;
		if (arg4 >= Static156.anInt3086 && Static218.anInt4231 >= arg4) {
			@Pc(166) int[] local166 = Static220.anIntArrayArray36[arg4];
			local177 = Static3.method9(Static48.anInt902, arg2 - arg5, Static131.anInt2553);
			local185 = Static3.method9(Static48.anInt902, arg2 + arg5, Static131.anInt2553);
			local193 = Static3.method9(Static48.anInt902, arg2 - local16, Static131.anInt2553);
			local203 = Static3.method9(Static48.anInt902, arg2 + local16, Static131.anInt2553);
			Static99.method1656(local166, arg1, local177, local193);
			Static99.method1656(local166, arg0, local193, local203);
			Static99.method1656(local166, arg1, local203, local185);
		}
		while (local9 > 0) {
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local120;
					local3++;
					local120 += local108;
					local78 += local132;
					local132 += local108;
				}
			}
			if (local78 < 0) {
				local3++;
				local69 += local120;
				local120 += local108;
				local78 += local132;
				local132 += local108;
			}
			@Pc(281) boolean local281 = local7 >= local9;
			local78 += -local130;
			local9--;
			if (local281) {
				if (local87 < 0) {
					while (local87 < 0) {
						local87 += local124;
						local104 += local146;
						local124 += local116;
						local146 += local116;
						local11++;
					}
				}
				if (local104 < 0) {
					local87 += local124;
					local124 += local116;
					local104 += local146;
					local146 += local116;
					local11++;
				}
				local104 += -local138;
				local138 -= local112;
				local87 += -local152;
				local152 -= local112;
			}
			local69 += -local144;
			local185 = local9 + arg4;
			local177 = arg4 - local9;
			local144 -= local91;
			local130 -= local91;
			if (local185 >= Static156.anInt3086 && Static218.anInt4231 >= local177) {
				local193 = Static3.method9(Static48.anInt902, local3 + arg2, Static131.anInt2553);
				local203 = Static3.method9(Static48.anInt902, arg2 - local3, Static131.anInt2553);
				if (local281) {
					@Pc(409) int local409 = Static3.method9(Static48.anInt902, arg2 + local11, Static131.anInt2553);
					@Pc(418) int local418 = Static3.method9(Static48.anInt902, arg2 - local11, Static131.anInt2553);
					@Pc(426) int[] local426;
					if (Static156.anInt3086 <= local177) {
						local426 = Static220.anIntArrayArray36[local177];
						Static99.method1656(local426, arg1, local203, local418);
						Static99.method1656(local426, arg0, local418, local409);
						Static99.method1656(local426, arg1, local409, local193);
					}
					if (Static218.anInt4231 >= local185) {
						local426 = Static220.anIntArrayArray36[local185];
						Static99.method1656(local426, arg1, local203, local418);
						Static99.method1656(local426, arg0, local418, local409);
						Static99.method1656(local426, arg1, local409, local193);
					}
				} else {
					if (local177 >= Static156.anInt3086) {
						Static99.method1656(Static220.anIntArrayArray36[local177], arg1, local203, local193);
					}
					if (Static218.anInt4231 >= local185) {
						Static99.method1656(Static220.anIntArrayArray36[local185], arg1, local203, local193);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIZII)V")
	public static void method4069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 - arg0 >= Static48.anInt902 && Static131.anInt2553 >= arg3 + arg0 && arg2 - arg0 >= Static156.anInt3086 && arg2 + arg0 <= Static218.anInt4231) {
			Static37.method565(arg2, arg3, arg0, arg1);
		} else {
			Static213.method3476(arg2, arg3, arg0, arg1);
		}
	}
}
