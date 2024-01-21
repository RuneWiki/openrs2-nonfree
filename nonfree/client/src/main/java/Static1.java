import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Lclient!gd;")
	public static Class29_Sub1 aClass29_Sub1_1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Lclient!cd;")
	private static Class10 aClass10_5 = Static51.method932("Please try again)3");

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1 = aClass10_5;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	public static int anInt5 = 0;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!cd;")
	public static Class10 aClass10_2 = Static51.method932(" <col=00ff80>");

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Lclient!cd;")
	public static Class10 aClass10_3 = Static51.method932("<col=ffff00>*V");

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Lclient!cd;")
	public static Class10 aClass10_4 = Static51.method932("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Lclient!cd;")
	public static Class10 aClass10_6 = Static51.method932("blaugr-Un:");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
	public static void method1(@OriginalArg(0) int arg0) {
		if (!Static76.method1263(arg0)) {
			return;
		}
		@Pc(14) Class23[] local14 = Static90.aClass23ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			@Pc(27) Class23 local27 = local14[local21];
			if (local27 != null) {
				local27.anInt1062 = 0;
				local27.anInt1098 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIB)V")
	public static void method2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static54.anInt1339 == 1) {
			Static45.aClass2_Sub1_Sub4_Sub2Array4[Static90.anInt2132 / 100].method738(Static160.anInt3405 - 8, Static136.anInt3023 + -8);
		}
		if (Static54.anInt1339 == 2) {
			Static45.aClass2_Sub1_Sub4_Sub2Array4[Static90.anInt2132 / 100 + 4].method738(Static160.anInt3405 - 8, Static136.anInt3023 + -8);
		}
		Static119.method1924();
		if (!Static90.aBoolean88) {
			return;
		}
		@Pc(48) int local48 = arg1 + 20;
		@Pc(54) int local54 = arg2 + 512 - 5;
		@Pc(56) int local56 = 16776960;
		Static13.aClass2_Sub1_Sub4_Sub1_Sub1_2.method505(Static3.method36(new Class10[] { Static179.aClass10_1621, Static164.method2485(Static92.anInt2189) }), local54, local48, 16776960, -1);
		@Pc(77) int local77 = local48 + 15;
		@Pc(79) Runtime local79 = Runtime.getRuntime();
		@Pc(89) int local89 = (int) ((local79.totalMemory() - local79.freeMemory()) / 1024L);
		if (local89 > 32768 && Static170.aBoolean163) {
			local56 = 16711680;
		}
		if (local89 > 65536 && !Static170.aBoolean163) {
			local56 = 16711680;
		}
		Static13.aClass2_Sub1_Sub4_Sub1_Sub1_2.method505(Static3.method36(new Class10[] { Static75.aClass10_775, Static164.method2485(local89), Static39.aClass10_480 }), local54, local77, local56, -1);
		local48 = local77 + 15;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method3() {
		aClass29_Sub1_1 = null;
		aClass10_5 = null;
		aClass10_6 = null;
		aClass10_4 = null;
		aClass10_3 = null;
		aClass10_1 = null;
		aClass10_2 = null;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)[B")
	public static synchronized byte[] method4(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static13.anInt379 > 0) {
			local18 = Static180.aByteArrayArray10[--Static13.anInt379];
			Static180.aByteArrayArray10[Static13.anInt379] = null;
			return local18;
		} else if (arg0 == 5000 && Static64.anInt1579 > 0) {
			local18 = Static10.aByteArrayArray1[--Static64.anInt1579];
			Static10.aByteArrayArray1[Static64.anInt1579] = null;
			return local18;
		} else if (arg0 == 30000 && Static175.anInt3777 > 0) {
			local18 = Static12.aByteArrayArray2[--Static175.anInt3777];
			Static12.aByteArrayArray2[Static175.anInt3777] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!nb;)V")
	public static void method5(@OriginalArg(1) Class2_Sub5 arg0) {
		if (arg0.aClass2_Sub10_5 != null) {
			arg0.aClass2_Sub10_5.anInt1796 = 0;
		}
		arg0.aBoolean165 = false;
		for (@Pc(21) Class2_Sub5 local21 = arg0.method2652(); local21 != null; local21 = arg0.method2655()) {
			method5(local21);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZB)V")
	public static void method6(@OriginalArg(0) boolean arg0) {
		Static165.aBoolean158 = arg0;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(33) int local33;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(129) int local129;
		@Pc(137) int local137;
		@Pc(145) int local145;
		if (!Static165.aBoolean158) {
			local13 = Static75.aClass2_Sub11_Sub1_1.method1443();
			local17 = Static75.aClass2_Sub11_Sub1_1.method1443();
			local21 = Static75.aClass2_Sub11_Sub1_1.method1475();
			local25 = Static75.aClass2_Sub11_Sub1_1.method1462();
			local33 = (Static174.anInt3743 - Static75.aClass2_Sub11_Sub1_1.anInt2077) / 16;
			Static64.anIntArrayArray22 = new int[local33][4];
			for (local39 = 0; local39 < local33; local39++) {
				for (local43 = 0; local43 < 4; local43++) {
					Static64.anIntArrayArray22[local39][local43] = Static75.aClass2_Sub11_Sub1_1.method1454();
				}
			}
			@Pc(67) boolean local67 = false;
			if ((local13 / 8 == 48 || local13 / 8 == 49) && (local17 / 8) == 48) {
				local67 = true;
			}
			local43 = Static75.aClass2_Sub11_Sub1_1.method1475();
			Static120.anIntArray294 = new int[local33];
			Static106.anIntArray249 = new int[local33];
			Static15.aByteArrayArray3 = new byte[local33][];
			if (local13 / 8 == 48 && local17 / 8 == 148) {
				local67 = true;
			}
			Static52.aByteArrayArray6 = new byte[local33][];
			Static32.anIntArray64 = new int[local33];
			local33 = 0;
			for (local129 = (local13 - 6) / 8; local129 <= (local13 + 6) / 8; local129++) {
				for (local137 = (local17 - 6) / 8; local137 <= (local17 + 6) / 8; local137++) {
					local145 = local137 + (local129 << 8);
					if (!local67 || local137 != 49 && local137 != 149 && local137 != 147 && local129 != 50 && (local129 != 49 || local137 != 47)) {
						Static106.anIntArray249[local33] = local145;
						Static120.anIntArray294[local33] = Static76.aClass29_Sub1_27.method1026(Static3.method36(new Class10[] { Static52.aClass10_566, Static164.method2485(local129), Static130.aClass10_1250, Static164.method2485(local137) }));
						Static32.anIntArray64[local33] = Static76.aClass29_Sub1_27.method1026(Static3.method36(new Class10[] { Static44.aClass10_502, Static164.method2485(local129), Static130.aClass10_1250, Static164.method2485(local137) }));
						local33++;
					}
				}
			}
			Static40.method790(local17, local43, local25, local13, local21);
			return;
		}
		local13 = Static75.aClass2_Sub11_Sub1_1.method1443();
		Static75.aClass2_Sub11_Sub1_1.method1498();
		for (local17 = 0; local17 < 4; local17++) {
			for (local21 = 0; local21 < 13; local21++) {
				for (local25 = 0; local25 < 13; local25++) {
					local33 = Static75.aClass2_Sub11_Sub1_1.method1490(1);
					if (local33 == 1) {
						Static91.anIntArrayArrayArray4[local17][local21][local25] = Static75.aClass2_Sub11_Sub1_1.method1490(26);
					} else {
						Static91.anIntArrayArrayArray4[local17][local21][local25] = -1;
					}
				}
			}
		}
		Static75.aClass2_Sub11_Sub1_1.method1494();
		local21 = (Static174.anInt3743 - Static75.aClass2_Sub11_Sub1_1.anInt2077) / 16;
		Static64.anIntArrayArray22 = new int[local21][4];
		for (local25 = 0; local25 < local21; local25++) {
			for (local33 = 0; local33 < 4; local33++) {
				Static64.anIntArrayArray22[local25][local33] = Static75.aClass2_Sub11_Sub1_1.method1489();
			}
		}
		local33 = Static75.aClass2_Sub11_Sub1_1.method1459();
		local39 = Static75.aClass2_Sub11_Sub1_1.method1459();
		local43 = Static75.aClass2_Sub11_Sub1_1.method1461();
		@Pc(392) int local392 = Static75.aClass2_Sub11_Sub1_1.method1456();
		Static120.anIntArray294 = new int[local21];
		Static32.anIntArray64 = new int[local21];
		Static15.aByteArrayArray3 = new byte[local21][];
		Static106.anIntArray249 = new int[local21];
		Static52.aByteArrayArray6 = new byte[local21][];
		local21 = 0;
		for (local129 = 0; local129 < 4; local129++) {
			for (local137 = 0; local137 < 13; local137++) {
				for (local145 = 0; local145 < 13; local145++) {
					@Pc(429) int local429 = Static91.anIntArrayArrayArray4[local129][local137][local145];
					if (local429 != -1) {
						@Pc(438) int local438 = local429 >> 14 & 0x3FF;
						@Pc(444) int local444 = local429 >> 3 & 0x7FF;
						@Pc(454) int local454 = local444 / 8 + (local438 / 8 << 8);
						for (@Pc(456) int local456 = 0; local456 < local21; local456++) {
							if (Static106.anIntArray249[local456] == local454) {
								local454 = -1;
								break;
							}
						}
						if (local454 != -1) {
							Static106.anIntArray249[local21] = local454;
							@Pc(489) int local489 = local454 >> 8 & 0xFF;
							@Pc(493) int local493 = local454 & 0xFF;
							Static120.anIntArray294[local21] = Static76.aClass29_Sub1_27.method1026(Static3.method36(new Class10[] { Static52.aClass10_566, Static164.method2485(local489), Static130.aClass10_1250, Static164.method2485(local493) }));
							Static32.anIntArray64[local21] = Static76.aClass29_Sub1_27.method1026(Static3.method36(new Class10[] { Static44.aClass10_502, Static164.method2485(local489), Static130.aClass10_1250, Static164.method2485(local493) }));
							local21++;
						}
					}
				}
			}
		}
		Static40.method790(local13, local33, local43, local39, local392);
	}
}
