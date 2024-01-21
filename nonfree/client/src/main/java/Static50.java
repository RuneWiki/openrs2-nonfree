import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
	public static int anInt1300;

	@OriginalMember(owner = "client!fa", name = "N", descriptor = "J")
	public static long aLong40 = 0L;

	@OriginalMember(owner = "client!fa", name = "O", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_391 = Static181.method2795("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
	public static int anInt1305 = 0;

	@OriginalMember(owner = "client!fa", name = "Z", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_393 = Static181.method2795("Connection timed out)3");

	@OriginalMember(owner = "client!fa", name = "W", descriptor = "Lclient!qe;")
	public static Class83 aClass83_392 = aClass83_393;

	@OriginalMember(owner = "client!fa", name = "Y", descriptor = "Lclient!oe;")
	public static final Class71 aClass71_1 = new Class71();

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!od;ILclient!od;)V")
	public static void method993(@OriginalArg(0) Class2_Sub2_Sub5 arg0, @OriginalArg(2) Class2_Sub2_Sub5 arg1) {
		if (Static18.aClass2_Sub2_Sub17Array6 == null) {
			Static18.aClass2_Sub2_Sub17Array6 = Static90.method1584(Static113.aClass28_Sub1_18, 0, Static159.anInt3221);
		}
		if (Static149.aClass29Array6 == null) {
			Static149.aClass29Array6 = Static208.method3143(Static113.aClass28_Sub1_18, Static49.anInt1274, 0);
		}
		if (Static6.aClass29Array1 == null) {
			Static6.aClass29Array1 = Static208.method3143(Static113.aClass28_Sub1_18, Static11.anInt374, 0);
		}
		if (Static204.aClass29Array9 == null) {
			Static204.aClass29Array9 = Static208.method3143(Static113.aClass28_Sub1_18, Static71.anInt1688, 0);
		}
		Static126.method2138(0, 23, 765, 480, 0);
		Static126.method2125(0, 0, 138, 23, 12425273, 9135624);
		Static126.method2125(138, 0, 640, 23, 5197647, 2697513);
		arg1.method1083(Static19.aClass83_118, 69, 15, 0, -1);
		if (Static204.aClass29Array9 != null) {
			Static204.aClass29Array9[1].method1184(140, 1);
			arg0.method1100(Static173.aClass83_1026, 152, 10, 16777215, -1);
			Static204.aClass29Array9[0].method1184(140, 12);
			arg0.method1100(Static152.aClass83_919, 152, 21, 16777215, -1);
		}
		if (Static6.aClass29Array1 != null) {
			if (Static201.anIntArray394[0] == 0 && Static149.anIntArray301[0] == 0) {
				Static6.aClass29Array1[2].method1184(280, 4);
			} else {
				Static6.aClass29Array1[0].method1184(280, 4);
			}
			if (Static201.anIntArray394[0] == 0 && Static149.anIntArray301[0] == 1) {
				Static6.aClass29Array1[3].method1184(295, 4);
			} else {
				Static6.aClass29Array1[1].method1184(295, 4);
			}
			arg1.method1100(Static55.aClass83_416, 312, 17, 16777215, -1);
			if (Static201.anIntArray394[0] == 1 && Static149.anIntArray301[0] == 0) {
				Static6.aClass29Array1[2].method1184(390, 4);
			} else {
				Static6.aClass29Array1[0].method1184(390, 4);
			}
			if (Static201.anIntArray394[0] == 1 && Static149.anIntArray301[0] == 1) {
				Static6.aClass29Array1[3].method1184(405, 4);
			} else {
				Static6.aClass29Array1[1].method1184(405, 4);
			}
			arg1.method1100(Static121.aClass83_817, 422, 17, 16777215, -1);
			if (Static201.anIntArray394[0] == 2 && Static149.anIntArray301[0] == 0) {
				Static6.aClass29Array1[2].method1184(500, 4);
			} else {
				Static6.aClass29Array1[0].method1184(500, 4);
			}
			if (Static201.anIntArray394[0] == 2 && Static149.anIntArray301[0] == 1) {
				Static6.aClass29Array1[3].method1184(515, 4);
			} else {
				Static6.aClass29Array1[1].method1184(515, 4);
			}
			arg1.method1100(Static150.aClass83_907, 532, 17, 16777215, -1);
			if (Static201.anIntArray394[0] == 3 && Static149.anIntArray301[0] == 0) {
				Static6.aClass29Array1[2].method1184(610, 4);
			} else {
				Static6.aClass29Array1[0].method1184(610, 4);
			}
			if (Static201.anIntArray394[0] == 3 && Static149.anIntArray301[0] == 1) {
				Static6.aClass29Array1[3].method1184(625, 4);
			} else {
				Static6.aClass29Array1[1].method1184(625, 4);
			}
			arg1.method1100(Static17.aClass83_100, 642, 17, 16777215, -1);
		}
		Static126.method2138(700, 4, 58, 16, 0);
		arg0.method1083(Static165.aClass83_979, 729, 16, 16777215, -1);
		Static193.anInt3832 = -1;
		if (Static18.aClass2_Sub2_Sub17Array6 == null) {
			return;
		}
		@Pc(387) int local387 = 8;
		@Pc(393) int local393 = 24;
		@Pc(395) int local395;
		@Pc(397) int local397;
		do {
			local395 = local393;
			local397 = local387;
			if (Static33.anInt869 <= local393 * (local387 - 1)) {
				local387--;
			}
			if (Static33.anInt869 <= local387 * (local393 - 1)) {
				local393--;
			}
			if (Static33.anInt869 <= local387 * (local393 - 1)) {
				local393--;
			}
		} while (local393 != local395 || local397 != local387);
		local395 = (765 - local387 * 88) / (local387 + 1);
		local397 = (480 - local393 * 19) / (local393 - -1);
		if (local397 > 5) {
			local397 = 5;
		}
		@Pc(481) int local481 = (480 - (local393 - 1) * local397 - local393 * 19) / 2;
		if (local395 > 5) {
			local395 = 5;
		}
		@Pc(504) int local504 = (765 - (local387 - 1) * local395 - local387 * 88) / 2;
		@Pc(508) int local508 = local481 + 23;
		@Pc(510) int local510 = local504;
		@Pc(512) int local512 = 0;
		for (@Pc(514) int local514 = 0; local514 < Static33.anInt869; local514++) {
			@Pc(520) Class75 local520 = Static13.aClass75Array1[local514];
			@Pc(522) boolean local522 = true;
			@Pc(527) Class83 local527 = Static129.method2179(local520.anInt2986);
			if (local520.anInt2986 == -1) {
				local522 = false;
				local527 = Static172.aClass83_1018;
			} else if (local520.anInt2986 > 1980) {
				local527 = Static127.aClass83_827;
				local522 = false;
			}
			if (local510 <= Static4.anInt95 && Static121.anInt2740 >= local508 && local510 + 88 > Static4.anInt95 && Static121.anInt2740 < local508 + 19 && local522) {
				Static193.anInt3832 = local514;
				Static18.aClass2_Sub2_Sub17Array6[local520.aBoolean142 ? 1 : 0].method1914(local510, local508);
			} else {
				Static18.aClass2_Sub2_Sub17Array6[local520.aBoolean142 ? 1 : 0].method1907(local510, local508);
			}
			if (Static149.aClass29Array6 != null) {
				Static149.aClass29Array6[(local520.aBoolean142 ? 8 : 0) + local520.anInt2981].method1184(local510 + 29, local508);
			}
			arg1.method1083(Static129.method2179(local520.anInt2988), local510 + 15, local508 - -9 + 5, 0, -1);
			arg0.method1083(local527, local510 + 60, local508 + 9 + 5, 268435455, -1);
			local508 += local397 + 19;
			local512++;
			if (local512 >= local393) {
				local512 = 0;
				local508 = local481 + 23;
				local510 += local395 + 88;
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([BB)V")
	public static void method995(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = 0;
		while (true) {
			while (arg0.length > local11) {
				@Pc(25) int local25 = (arg0[local11++] & 0xFF) * 64 - Static154.anInt3114;
				@Pc(36) int local36 = (arg0[local11++] & 0xFF) * 64 - Static57.anInt1431;
				@Pc(87) byte local87;
				@Pc(65) int local65;
				if (local25 > 0 && local36 > 0 && Static127.anInt2810 > local25 + 64 && Static177.anInt3615 > local36 + 64) {
					local65 = local25 >> 6;
					@Pc(74) int local74 = Static177.anInt3615 - local36 - 1 >> 6;
					for (@Pc(76) int local76 = 0; local76 < 64; local76++) {
						for (@Pc(80) int local80 = -64; local80 < 0; local80++) {
							local87 = arg0[local11++];
							if (local87 != 0) {
								if (Static89.aByteArrayArrayArray94[local65][local74] == null) {
									Static89.aByteArrayArrayArray94[local65][local74] = new byte[4096];
								}
								Static89.aByteArrayArrayArray94[local65][local74][local76 + (-(local80 + 1) << 6)] = local87;
								@Pc(125) byte local125 = arg0[local11++];
								if (Static110.aByteArrayArrayArray45[local65][local74] == null) {
									Static110.aByteArrayArrayArray45[local65][local74] = new byte[4096];
								}
								Static110.aByteArrayArrayArray45[local65][local74][(-(local80 + 1) << 6) + local76] = local125;
							}
						}
					}
				} else {
					for (local65 = -4096; local65 < 0; local65++) {
						local87 = arg0[local11++];
						if (local87 != 0) {
							local11++;
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILclient!ee;)V")
	public static void method996(@OriginalArg(0) int arg0, @OriginalArg(2) Class28_Sub1 arg1) {
		if (Static142.aClass2_Sub3_2 == null) {
			Static182.method2820((byte) 0, true, 255, 255, 0, null);
			Static8.aClass28_Sub1Array1[arg0] = arg1;
		} else {
			Static142.aClass2_Sub3_2.anInt340 = arg0 * 8 + 5;
			@Pc(18) int local18 = Static142.aClass2_Sub3_2.method248();
			@Pc(24) int local24 = Static142.aClass2_Sub3_2.method248();
			arg1.method878(local18, local24);
		}
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)V")
	public static void method997() {
		if (Static36.anIntArray74 != null && Static203.anIntArray399 != null) {
			return;
		}
		Static36.anIntArray74 = new int[256];
		Static203.anIntArray399 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static36.anIntArray74[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static203.anIntArray399[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIII)I")
	public static int method998(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < arg1) {
			return arg1;
		} else if (arg2 <= arg0) {
			return arg2;
		} else {
			return arg0;
		}
	}
}
