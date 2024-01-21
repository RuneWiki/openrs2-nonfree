import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "[S")
	public static short[] aShortArray25;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "Lclient!kb;")
	private static Class46 aClass46_979 = Static65.method1172("wave:");

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!kb;")
	public static Class46 aClass46_976 = aClass46_979;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "[Lclient!kb;")
	public static Class46[] aClass46Array17 = new Class46[100];

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!kb;")
	public static Class46 aClass46_977 = aClass46_979;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "Lclient!kb;")
	private static Class46 aClass46_981 = Static65.method1172("Malformed login packet)3");

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!kb;")
	public static Class46 aClass46_978 = aClass46_981;

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "Lclient!kb;")
	public static Class46 aClass46_980 = Static65.method1172("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)V")
	public static void method2038(@OriginalArg(1) int arg0) {
		@Pc(8) int[] local8 = Static12.aClass3_Sub2_Sub3_Sub3_43.anIntArray301;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 1;
		}
		@Pc(48) int local48;
		@Pc(50) int local50;
		for (@Pc(35) int local35 = 1; local35 < 103; local35++) {
			local48 = (52736 - local35 * 512) * 4 + 24628;
			for (local50 = 1; local50 < 103; local50++) {
				if ((Static119.aByteArrayArrayArray5[arg0][local50][local35] & 0x18) == 0) {
					Static154.aClass62_1.method1969(local8, local48, arg0, local50, local35);
				}
				if (arg0 < 3 && (Static119.aByteArrayArrayArray5[arg0 + 1][local50][local35] & 0x8) != 0) {
					Static154.aClass62_1.method1969(local8, local48, arg0 + 1, local50, local35);
				}
				local48 += 4;
			}
		}
		Static12.aClass3_Sub2_Sub3_Sub3_43.method1879();
		local48 = ((int) (Math.random() * 20.0D) + 228 << 16) - (-((int) (Math.random() * 20.0D) + 238 - 10 << 8) - 238) + (int) (Math.random() * 20.0D) - 10;
		local50 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(160) int local160;
		for (@Pc(156) int local156 = 1; local156 < 103; local156++) {
			for (local160 = 1; local160 < 103; local160++) {
				if ((Static119.aByteArrayArrayArray5[arg0][local160][local156] & 0x18) == 0) {
					Static81.method1388(local156, local50, arg0, local160, local48);
				}
				if (arg0 < 3 && (Static119.aByteArrayArrayArray5[arg0 + 1][local160][local156] & 0x8) != 0) {
					Static81.method1388(local156, local50, arg0 + 1, local160, local48);
				}
			}
		}
		Static161.anInt3579 = 0;
		for (local160 = 0; local160 < 104; local160++) {
			for (@Pc(224) int local224 = 0; local224 < 104; local224++) {
				@Pc(232) int local232 = Static154.aClass62_1.method1973(Static99.anInt2422, local160, local224);
				if (local232 != 0) {
					local232 = local232 >> 14 & 0x7FFF;
					@Pc(245) int local245 = Static136.method2319(local232).anInt1808;
					if (local245 >= 0) {
						@Pc(252) int local252 = local160;
						@Pc(254) int local254 = local224;
						if (local245 != 22 && local245 != 29 && local245 != 34 && local245 != 36 && local245 != 46 && local245 != 47 && local245 != 48) {
							@Pc(286) int[][] local286 = Static128.aClass69Array1[Static99.anInt2422].anIntArrayArray35;
							for (@Pc(288) int local288 = 0; local288 < 10; local288++) {
								@Pc(295) int local295 = (int) (Math.random() * 4.0D);
								if (local295 == 0 && local252 > 0 && local160 - 3 < local252 && (local286[local252 - 1][local254] & 0x12C0108) == 0) {
									local252--;
								}
								if (local295 == 1 && local252 < 103 && local252 < local160 + 3 && (local286[local252 + 1][local254] & 0x12C0180) == 0) {
									local252++;
								}
								if (local295 == 2 && local254 > 0 && local254 > local224 - 3 && (local286[local252][local254 - 1] & 0x12C0102) == 0) {
									local254--;
								}
								if (local295 == 3 && local254 < 103 && local254 < local224 + 3 && (local286[local252][local254 + 1] & 0x12C0120) == 0) {
									local254++;
								}
							}
						}
						Static88.aClass3_Sub2_Sub3_Sub3Array5[Static161.anInt3579] = Static2.aClass3_Sub2_Sub3_Sub3Array1[local245];
						Static118.anIntArray325[Static161.anInt3579] = local252;
						Static104.anIntArray251[Static161.anInt3579] = local254;
						Static161.anInt3579++;
					}
				}
			}
		}
		Static139.aClass8_1.method523();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!h;I)Z")
	public static boolean method2039(@OriginalArg(0) Class33 arg0) {
		if (arg0.anIntArray136 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray136.length; local12++) {
			@Pc(24) int local24 = Static102.method1677(arg0, local12);
			@Pc(29) int local29 = arg0.anIntArray143[local12];
			if (arg0.anIntArray136[local12] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray136[local12] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray136[local12] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local24 != local29) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method2040() {
		aClass46_979 = null;
		aClass46_976 = null;
		aShortArray25 = null;
		aClass46_981 = null;
		aClass46_980 = null;
		aClass46_978 = null;
		aClass46Array17 = null;
		aClass46_977 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!kb;IIILclient!kb;II)V")
	public static void method2041(@OriginalArg(0) Class46 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class46 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static105.aBoolean103 || Static87.anInt2129 >= 500) {
			return;
		}
		Static150.aClass46Array22[Static87.anInt2129] = arg0;
		Static32.aClass46Array5[Static87.anInt2129] = arg3;
		Static134.anIntArray352[Static87.anInt2129] = arg1;
		Static157.anIntArray402[Static87.anInt2129] = arg4;
		Static46.anIntArray122[Static87.anInt2129] = arg2;
		Static97.anIntArray164[Static87.anInt2129] = arg5;
		Static87.anInt2129++;
	}
}
