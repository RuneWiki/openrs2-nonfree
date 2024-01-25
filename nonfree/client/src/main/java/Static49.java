import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ch", name = "I", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_33 = new Class214(29, 3);

	@OriginalMember(owner = "client!ch", name = "K", descriptor = "[B")
	public static final byte[] aByteArray5 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([BIB)[B")
	public static byte[] method725(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static459.method2110(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!dt;Lclient!qa;IILclient!cn;)Z")
	public static boolean method727(@OriginalArg(1) Class56 arg0, @OriginalArg(2) Class128 arg1, @OriginalArg(5) Class1_Sub7 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray73 != null) {
			local11 = Static114.anInt6801 - (arg2.anInt968 + arg0.anInt1496 - Static114.anInt6806) * (-Static114.anInt6802 + Static114.anInt6801) / (Static114.anInt6805 - Static114.anInt6806);
			local7 = Static114.anInt6807 + (Static114.anInt6799 - Static114.anInt6807) * (arg2.anInt973 + arg0.anInt1473 - Static114.anInt6797) / (Static114.anInt6804 - Static114.anInt6797);
			local13 = Static114.anInt6801 - (arg2.anInt968 + arg0.anInt1467 - Static114.anInt6806) * (Static114.anInt6801 - Static114.anInt6802) / (Static114.anInt6805 - Static114.anInt6806);
			local9 = (Static114.anInt6799 - Static114.anInt6807) * (arg0.anInt1470 + arg2.anInt973 - Static114.anInt6797) / (Static114.anInt6804 - Static114.anInt6797) + Static114.anInt6807;
		}
		@Pc(102) Class49 local102 = null;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		if (arg0.anInt1476 != -1) {
			if (arg2.aBoolean77 && arg0.anInt1486 != -1) {
				local102 = arg0.method1230(arg1, true);
			} else {
				local102 = arg0.method1230(arg1, false);
			}
			if (local102 != null) {
				local104 = arg2.anInt974 - (local102.ja() + 1 >> 1);
				local106 = arg2.anInt974 + (local102.ja() + 1 >> 1);
				if (local104 < local7) {
					local7 = local104;
				}
				if (local9 < local106) {
					local9 = local106;
				}
				local108 = arg2.anInt971 - (local102.JA() + 1 >> 1);
				if (local11 > local108) {
					local11 = local108;
				}
				local110 = arg2.anInt971 + (local102.JA() + 1 >> 1);
				if (local110 > local13) {
					local13 = local110;
				}
			}
		}
		@Pc(208) Class244 local208 = null;
		@Pc(210) int local210 = 0;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(273) int local273;
		@Pc(296) int local296;
		if (arg0.aString10 != null) {
			local208 = Static422.method5248(arg0.anInt1475);
			if (local208 != null) {
				local210 = Static308.aClass122_6.method2472(null, arg0.aString10, null, Static144.aStringArray21);
				local212 = arg2.anInt971;
				if (local102 == null) {
					local212 -= local210 * local208.method5144() / 2;
				} else {
					local212 -= (local102.JA() >> 1) + local208.method5142() * local210;
				}
				for (local273 = 0; local273 < local210; local273++) {
					@Pc(279) String local279 = Static144.aStringArray21[local273];
					if (local210 - 1 > local273) {
						local279 = local279.substring(0, local279.length() - 4);
					}
					local296 = local208.method5145(local279);
					if (local296 > local214) {
						local214 = local296;
					}
				}
				local216 = arg2.anInt974 - local214 / 2;
				if (local7 > local216) {
					local7 = local216;
				}
				local218 = local214 / 2 + arg2.anInt974;
				local220 = local212;
				if (local218 > local9) {
					local9 = local218;
				}
				local222 = local208.method5142() * local210 + local212;
				if (local11 > local220) {
					local11 = local220;
				}
				if (local222 > local13) {
					local13 = local222;
				}
			}
		}
		if (Static114.anInt6807 > local9 || Static114.anInt6799 < local7 || local13 < Static114.anInt6802 || Static114.anInt6801 < local11) {
			return true;
		}
		@Pc(401) int local401;
		if (arg0.anIntArray73 != null) {
			@Pc(399) int[] local399 = new int[arg0.anIntArray73.length];
			for (local401 = 0; local401 < local399.length / 2; local401++) {
				local296 = arg0.anIntArray73[local401 * 2] + arg2.anInt973;
				@Pc(425) int local425 = arg2.anInt968 + arg0.anIntArray73[local401 * 2 + 1];
				local399[local401 * 2] = Static114.anInt6807 + (local296 - Static114.anInt6797) * (Static114.anInt6799 + -Static114.anInt6807) / (Static114.anInt6804 - Static114.anInt6797);
				local399[local401 * 2 + 1] = Static114.anInt6801 - (Static114.anInt6801 - Static114.anInt6802) * (local425 + -Static114.anInt6806) / (Static114.anInt6805 - Static114.anInt6806);
			}
			Static424.method5281(arg1, local399, arg0.anInt1469);
			for (local296 = 0; local296 < local399.length / 2 - 1; local296++) {
				arg1.method3539(local399[local296 * 2 + 2], local399[local296 * 2 + 1], local399[local296 * 2], local399[local296 * 2 + 3], arg0.anInt1495);
			}
			arg1.method3539(local399[0], local399[local399.length - 1], local399[local399.length - 2], local399[1], arg0.anInt1495);
		}
		if (local102 != null) {
			if (Static409.anInt6639 > 0 && (Static176.anInt2869 != -1 && Static176.anInt2869 == arg2.anInt969 || Static157.anInt2629 != -1 && arg0.anInt1479 == Static157.anInt2629)) {
				if (Static92.anInt1629 <= 50) {
					local273 = Static92.anInt1629 * 2;
				} else {
					local273 = 200 - Static92.anInt1629 * 2;
				}
				local401 = local273 << 24 | 0xFFFF00;
				arg1.method3552(local102.UA() / 2 + 7, arg2.anInt974, arg2.anInt971, local401);
				arg1.method3552(local102.UA() / 2 + 5, arg2.anInt974, arg2.anInt971, local401);
				arg1.method3552(local102.UA() / 2 + 3, arg2.anInt974, arg2.anInt971, local401);
				arg1.method3552(local102.UA() / 2 + 1, arg2.anInt974, arg2.anInt971, local401);
				arg1.method3552(local102.UA() / 2, arg2.anInt974, arg2.anInt971, local401);
			}
			local102.method5636(arg2.anInt974 - (local102.ja() >> 1), arg2.anInt971 - (local102.JA() >> 1));
		}
		if (arg0.aString10 != null && local208 != null) {
			Static155.method2184(local214, local212, arg2, arg1, arg0, local208, local210);
		}
		if (arg0.anInt1476 != -1 || arg0.aString10 != null) {
			@Pc(707) Class1_Sub8 local707 = new Class1_Sub8(arg2);
			local707.anInt1029 = local108;
			local707.anInt1028 = local220;
			local707.anInt1023 = local110;
			local707.anInt1031 = local106;
			local707.anInt1022 = local104;
			local707.anInt1021 = local222;
			local707.anInt1030 = local218;
			local707.anInt1024 = local216;
			Static110.aClass254_11.method5430(local707);
		}
		return false;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
	public static void method728() {
		if (!Static246.aBoolean318) {
			return;
		}
		while (true) {
			while (Static108.anInt1921 < Static237.aClass114_Sub1Array3.length) {
				@Pc(29) Class114_Sub1 local29 = Static237.aClass114_Sub1Array3[Static108.anInt1921];
				if (local29 != null && local29.anInt2761 == -1) {
					if (Static317.aClass1_Sub10_2 == null) {
						Static317.aClass1_Sub10_2 = Static30.aClass255_1.method5466(local29.aString25);
					}
					@Pc(53) int local53 = Static317.aClass1_Sub10_2.anInt1094;
					if (local53 == -1) {
						return;
					}
					Static317.aClass1_Sub10_2 = null;
					Static108.anInt1921++;
					local29.anInt2761 = local53;
				} else {
					Static108.anInt1921++;
				}
			}
			return;
		}
	}
}
