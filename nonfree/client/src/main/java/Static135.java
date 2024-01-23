import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "Lclient!pk;")
	public static Class132 aClass132_48;

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "Lclient!pk;")
	public static Class132 aClass132_49;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
	public static int anInt2729 = 0;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "[I")
	public static int[] anIntArray226 = new int[] { 0, 0, 0, 0, 0, 2, 0, 12, 12, 4, 0, 3, 0, 0, 0, 14, -2, 0, 0, 0, 0, 0, -1, 0, 0, 0, 17, 0, -1, 3, 0, 0, 0, 0, -1, 0, 0, 12, 3, 0, 0, 6, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, -1, 0, 5, 0, -1, 10, -1, 4, 7, 0, 0, 4, 3, 12, 0, 0, 3, 0, 0, 0, 0, 2, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 15, -2, 0, 8, -2, 0, 0, 0, 0, 0, 6, -2, 0, 28, 2, 8, -2, 0, 0, 3, 0, 8, 0, 8, 3, -1, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 5, 6, 0, 14, 8, 0, 5, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 1, 0, -1, 0, 0, 10, 7, 0, 0, 0, 2, 0, 0, 0, 11, 0, 20, 1, 0, 8, 0, 1, 0, 0, 0, 2, 6, 0, 0, 0, 0, 0, -1, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 8, 0, -1, 0, 7, -2, 0, 6, 6, 0, 0, 0, 0, 6, 0, 0, 0, 6, -2, -2, -2, -2, 8, 6, 6, 0, 0, 0, -1, 0, 0, -1, 0, 1, 0, 15, 0, 0, 0, 0, 9, 0, 7, 0, 2, 0, 8, 0, 3, 0, -1, 0, 2, 0, 0, 6, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
	public static void method2190() {
		for (@Pc(1) int local1 = 0; local1 < Static54.anInt1199; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static24.anInt639; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static27.anInt665; local11++) {
					@Pc(22) Class8_Sub27 local22 = Static178.aClass8_Sub27ArrayArrayArray1[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Class134 local27 = local22.aClass134_1;
						if (local27 != null && local27.aClass36_6.method4174()) {
							Static50.method802(local27.aClass36_6, local1, local6, local11, 1, 1);
							if (local27.aClass36_7 != null && local27.aClass36_7.method4174()) {
								Static50.method802(local27.aClass36_7, local1, local6, local11, 1, 1);
								local27.aClass36_6.method4179(local27.aClass36_7, 0, 0, 0, false);
								local27.aClass36_7 = local27.aClass36_7.method4178();
							}
							local27.aClass36_6 = local27.aClass36_6.method4178();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.anInt4857; local83++) {
							@Pc(92) Class170 local92 = local22.aClass170Array3[local83];
							if (local92 != null && local92.aClass36_10.method4174()) {
								Static50.method802(local92.aClass36_10, local1, local6, local11, local92.anInt5455 + 1 - local92.anInt5463, local92.anInt5458 - local92.anInt5460 + 1);
								local92.aClass36_10 = local92.aClass36_10.method4178();
							}
						}
						@Pc(131) Class120 local131 = local22.aClass120_1;
						if (local131 != null && local131.aClass36_5.method4174()) {
							Static124.method1982(local131.aClass36_5, local1, local6, local11);
							local131.aClass36_5 = local131.aClass36_5.method4178();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V")
	public static void method2191() {
		Static62.aClass61_48.method1381(5);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII)V")
	public static void method2192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static275.anInt5409 * arg0 >> 8;
		if (arg1 == -1 && !Static140.aBoolean230) {
			Static188.method2942();
		} else if (arg1 != -1 && (Static236.anInt4769 != arg1 || !Static177.method1353()) && local9 != 0 && !Static140.aBoolean230) {
			Static256.method3844(arg1, Static88.aClass132_35, local9);
		}
		Static236.anInt4769 = arg1;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)Lclient!re;")
	public static Class141 method2194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class141 local14 = local7.aClass141_1;
			local7.aClass141_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)Z")
	public static boolean method2195(@OriginalArg(0) int arg0) {
		if (arg0 == Static258.anInt5124) {
			return false;
		}
		Static82.anIntArrayArray7 = new int[104][104];
		Static4.anIntArrayArrayArray1 = new int[4][13][13];
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			Static159.aClass112Array1[local25] = new Class112(104, 104);
		}
		Static170.aByteArrayArrayArray9 = new byte[4][104][104];
		Static124.aClass182ArrayArrayArray1 = new Class182[4][104][104];
		Static123.aByteArrayArrayArray5 = new byte[4][104][104];
		if (Static116.aBoolean188) {
			Static186.method2916();
			Static6.method43();
			Static169.aClass24ArrayArray1 = new Class24[13][13];
		}
		Static258.anInt5124 = arg0;
		return true;
	}
}
