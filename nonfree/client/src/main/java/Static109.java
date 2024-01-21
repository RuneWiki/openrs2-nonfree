import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "Lclient!oc;")
	public static Class56 aClass56_75;

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_17;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	public static int anInt2506 = 0;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1199 = Static78.method1313("Prepared sound engine");

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1205 = Static78.method1313("Existing User");

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1200 = aClass25_1205;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1202 = Static78.method1313("flash1:");

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1201 = aClass25_1202;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	public static final int anInt2508 = 5063219;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1203 = Static78.method1313("nav");

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1204 = aClass25_1199;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
	public static int anInt2512 = 10;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1206 = Static78.method1313("Registrierter Benutzer");

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
	public static int anInt2515 = 0;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1207 = Static78.method1313("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1208 = aClass25_1202;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1209 = Static78.method1313("Fps:");

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1210 = Static78.method1313(",Zffentlicher Chat");

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1211 = Static78.method1313("blinken2:");

	@OriginalMember(owner = "client!sc", name = "A", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1212 = Static78.method1313("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
	public static void method1746() {
		for (@Pc(3) int local3 = 0; local3 < Static13.anInt383; local3++) {
			@Pc(9) int local9 = Static106.anIntArray423[local3];
			@Pc(13) Class1_Sub2_Sub3_Sub4_Sub1 local13 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local9];
			if (local13 != null) {
				Static35.method785(local13, local13.aClass1_Sub2_Sub13_1.anInt1863);
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!mf;B)V")
	public static void method1747(@OriginalArg(0) int arg0, @OriginalArg(1) Class56_Sub1 arg1) {
		if (Static122.aClass1_Sub5_62 == null) {
			Static53.method1780(255, null, 255, true, (byte) 0, 0);
			Static88.aClass56_Sub1Array1[arg0] = arg1;
		} else {
			Static122.aClass1_Sub5_62.anInt792 = arg0 * 8 + 5;
			@Pc(16) int local16 = Static122.aClass1_Sub5_62.method663();
			@Pc(20) int local20 = Static122.aClass1_Sub5_62.method663();
			arg1.method1291(local16, local20);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public static void method1748() {
		Static94.aClass63_18.method1513();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBILclient!oc;)Z")
	public static boolean method1749(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class56 arg2) {
		@Pc(15) byte[] local15 = arg2.method1269(arg1, arg0);
		if (local15 == null) {
			return false;
		} else {
			Static6.method102(local15);
			return true;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public static void method1750() {
		for (@Pc(3) int local3 = 0; local3 < Static122.anInt2922; local3++) {
			@Pc(9) int local9 = Static1.anIntArray7[local3]--;
			if (Static1.anIntArray7[local3] >= -10) {
				@Pc(78) Class16 local78 = Static22.aClass16Array2[local3];
				if (local78 == null) {
					local78 = Static131.method389(Static45.aClass56_Sub1_6, Static78.anIntArray312[local3], 0);
					if (local78 == null) {
						continue;
					}
					Static1.anIntArray7[local3] += local78.method387();
					Static22.aClass16Array2[local3] = local78;
				}
				if (Static1.anIntArray7[local3] < 0) {
					@Pc(205) int local205;
					if (Static42.anIntArray217[local3] == 0) {
						local205 = Static39.anInt1104;
					} else {
						@Pc(122) int local122 = (Static42.anIntArray217[local3] & 0xFF) * 128;
						@Pc(130) int local130 = Static42.anIntArray217[local3] >> 16 & 0xFF;
						@Pc(138) int local138 = Static42.anIntArray217[local3] >> 8 & 0xFF;
						@Pc(147) int local147 = local130 * 128 + 64 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832;
						@Pc(157) int local157 = local138 * 128 + 64 - Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827;
						if (local147 < 0) {
							local147 = -local147;
						}
						if (local157 < 0) {
							local157 = -local157;
						}
						@Pc(179) int local179 = local157 + local147 - 128;
						if (local122 < local179) {
							Static1.anIntArray7[local3] = -100;
							continue;
						}
						if (local179 < 0) {
							local179 = 0;
						}
						local205 = (local122 - local179) * Static21.anInt601 / local122;
					}
					if (local205 > 0) {
						@Pc(219) Class1_Sub14_Sub1 local219 = local78.method386().method1538(Static55.aClass58_1);
						@Pc(224) Class1_Sub3_Sub3 local224 = Static135.method1504(local219, local205);
						local224.method1474(Static122.anIntArray496[local3] - 1);
						Static33.aClass1_Sub3_Sub2_1.method925(local224);
					}
					Static1.anIntArray7[local3] = -100;
				}
			} else {
				Static122.anInt2922--;
				for (@Pc(25) int local25 = local3; local25 < Static122.anInt2922; local25++) {
					Static78.anIntArray312[local25] = Static78.anIntArray312[local25 + 1];
					Static22.aClass16Array2[local25] = Static22.aClass16Array2[local25 + 1];
					Static122.anIntArray496[local25] = Static122.anIntArray496[local25 + 1];
					Static1.anIntArray7[local25] = Static1.anIntArray7[local25 + 1];
					Static42.anIntArray217[local25] = Static42.anIntArray217[local25 + 1];
				}
				local3--;
			}
		}
		if (Static8.aBoolean5 && !Static97.method1642()) {
			if (Static33.anInt909 != 0 && Static47.anInt1203 != -1) {
				Static64.method1129(Static47.anInt1203, 0, Static49.aClass56_Sub1_10, Static33.anInt909);
			}
			Static8.aBoolean5 = false;
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	public static void method1751() {
		aClass25_1203 = null;
		aClass1_Sub2_Sub2_Sub4_17 = null;
		aClass25_1204 = null;
		aClass25_1211 = null;
		aClass25_1200 = null;
		aClass25_1199 = null;
		aClass25_1209 = null;
		aClass25_1208 = null;
		aClass25_1205 = null;
		aClass25_1212 = null;
		aClass25_1202 = null;
		aClass25_1201 = null;
		aClass25_1210 = null;
		aClass56_75 = null;
		aClass25_1207 = null;
		aClass25_1206 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ob;I)Lclient!ob;")
	public static Class1_Sub2_Sub14 method1752(@OriginalArg(0) Class1_Sub2_Sub14 arg0) {
		@Pc(12) Class1_Sub2_Sub14 local12 = Static35.method788(arg0);
		if (local12 == null) {
			local12 = arg0.aClass1_Sub2_Sub14_5;
		}
		return local12;
	}
}
