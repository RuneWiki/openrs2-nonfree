import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
	public static int anInt2569;

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "B")
	public static byte aByte7;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
	public static int anInt2572;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!sg;")
	private static Class77 aClass77_998 = Static146.method2172(" is already on your friend list)3");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Lclient!sg;")
	public static Class77 aClass77_993 = aClass77_998;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
	public static int anInt2568 = 0;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Lclient!sg;")
	private static Class77 aClass77_997 = Static146.method2172("Malformed login packet)3");

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Lclient!sg;")
	public static Class77 aClass77_994 = aClass77_997;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
	public static int anInt2571 = 0;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!sg;")
	public static Class77 aClass77_995 = Static146.method2172("");

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "Lclient!sg;")
	public static Class77 aClass77_996 = Static146.method2172("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "Z")
	public static volatile boolean aBoolean108 = true;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "[[I")
	public static int[][] anIntArrayArray20 = new int[104][104];

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(JI)V")
	public static void method1832(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static51.anInt1395; local17++) {
			if (arg0 == Static125.aLongArray6[local17]) {
				Static51.anInt1395--;
				for (@Pc(35) int local35 = local17; local35 < Static51.anInt1395; local35++) {
					Static120.aClass77Array7[local35] = Static120.aClass77Array7[local35 + 1];
					Static11.anIntArray41[local35] = Static11.anIntArray41[local35 + 1];
					Static125.aLongArray6[local35] = Static125.aLongArray6[local35 + 1];
					Static169.anIntArray599[local35] = Static169.anIntArray599[local35 + 1];
				}
				Static8.anInt229 = Static52.anInt1417;
				Static124.aClass2_Sub18_Sub1_3.method2398(12);
				Static124.aClass2_Sub18_Sub1_3.method2384(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZB)V")
	public static void method1833(@OriginalArg(0) boolean arg0) {
		Static158.aBoolean162 = arg0;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(61) int local61;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(135) int local135;
		@Pc(143) int local143;
		@Pc(151) int local151;
		if (!Static158.aBoolean162) {
			local25 = (Static25.anInt731 - Static74.aClass2_Sub18_Sub1_1.anInt3423) / 16;
			Static37.anIntArrayArray9 = new int[local25][4];
			for (local31 = 0; local31 < local25; local31++) {
				for (local35 = 0; local35 < 4; local35++) {
					Static37.anIntArrayArray9[local31][local35] = Static74.aClass2_Sub18_Sub1_1.method2359();
				}
			}
			local35 = Static74.aClass2_Sub18_Sub1_1.method2363();
			local61 = Static74.aClass2_Sub18_Sub1_1.method2353();
			local65 = Static74.aClass2_Sub18_Sub1_1.method2374();
			local69 = Static74.aClass2_Sub18_Sub1_1.method2395();
			local73 = Static74.aClass2_Sub18_Sub1_1.method2353();
			Static51.aByteArrayArray1 = new byte[local25][];
			Static117.aByteArrayArray7 = new byte[local25][];
			Static111.anIntArray427 = new int[local25];
			@Pc(84) boolean local84 = false;
			if ((local69 / 8 == 48 || local69 / 8 == 49) && (local73 / 8) == 48) {
				local84 = true;
			}
			Static159.anIntArray570 = new int[local25];
			Static60.anIntArray250 = new int[local25];
			if (local69 / 8 == 48 && local73 / 8 == 148) {
				local84 = true;
			}
			local25 = 0;
			for (local135 = (local69 - 6) / 8; local135 <= (local69 + 6) / 8; local135++) {
				for (local143 = (local73 - 6) / 8; local143 <= (local73 + 6) / 8; local143++) {
					local151 = local143 + (local135 << 8);
					if (!local84 || local143 != 49 && local143 != 149 && local143 != 147 && local135 != 50 && (local135 != 49 || local143 != 47)) {
						Static60.anIntArray250[local25] = local151;
						Static111.anIntArray427[local25] = Static120.aClass43_Sub1_6.method2206(Static146.method2168(new Class77[] { Static98.aClass77_962, Static2.method61(local135), Static118.aClass77_1096, Static2.method61(local143) }));
						Static159.anIntArray570[local25] = Static120.aClass43_Sub1_6.method2206(Static146.method2168(new Class77[] { Static58.aClass77_602, Static2.method61(local135), Static118.aClass77_1096, Static2.method61(local143) }));
						local25++;
					}
				}
			}
			Static71.method1388(local65, local73, local69, local61, local35);
			return;
		}
		local25 = Static74.aClass2_Sub18_Sub1_1.method2353();
		local31 = Static74.aClass2_Sub18_Sub1_1.method2374();
		local35 = Static74.aClass2_Sub18_Sub1_1.method2395();
		Static74.aClass2_Sub18_Sub1_1.method2407();
		for (local61 = 0; local61 < 4; local61++) {
			for (local65 = 0; local65 < 13; local65++) {
				for (local69 = 0; local69 < 13; local69++) {
					local73 = Static74.aClass2_Sub18_Sub1_1.method2405(1);
					if (local73 == 1) {
						Static181.anIntArrayArrayArray9[local61][local65][local69] = Static74.aClass2_Sub18_Sub1_1.method2405(26);
					} else {
						Static181.anIntArrayArrayArray9[local61][local65][local69] = -1;
					}
				}
			}
		}
		Static74.aClass2_Sub18_Sub1_1.method2403();
		local65 = (Static25.anInt731 - Static74.aClass2_Sub18_Sub1_1.anInt3423) / 16;
		Static37.anIntArrayArray9 = new int[local65][4];
		for (local69 = 0; local69 < local65; local69++) {
			for (local73 = 0; local73 < 4; local73++) {
				Static37.anIntArrayArray9[local69][local73] = Static74.aClass2_Sub18_Sub1_1.method2359();
			}
		}
		local73 = Static74.aClass2_Sub18_Sub1_1.method2363();
		@Pc(395) int local395 = Static74.aClass2_Sub18_Sub1_1.method2363();
		Static51.aByteArrayArray1 = new byte[local65][];
		Static159.anIntArray570 = new int[local65];
		Static60.anIntArray250 = new int[local65];
		Static111.anIntArray427 = new int[local65];
		Static117.aByteArrayArray7 = new byte[local65][];
		local65 = 0;
		for (local135 = 0; local135 < 4; local135++) {
			for (local143 = 0; local143 < 13; local143++) {
				for (local151 = 0; local151 < 13; local151++) {
					@Pc(432) int local432 = Static181.anIntArrayArrayArray9[local135][local143][local151];
					if (local432 != -1) {
						@Pc(441) int local441 = local432 >> 14 & 0x3FF;
						@Pc(447) int local447 = local432 >> 3 & 0x7FF;
						@Pc(457) int local457 = (local441 / 8 << 8) + local447 / 8;
						for (@Pc(459) int local459 = 0; local459 < local65; local459++) {
							if (Static60.anIntArray250[local459] == local457) {
								local457 = -1;
								break;
							}
						}
						if (local457 != -1) {
							Static60.anIntArray250[local65] = local457;
							@Pc(495) int local495 = local457 >> 8 & 0xFF;
							@Pc(499) int local499 = local457 & 0xFF;
							Static111.anIntArray427[local65] = Static120.aClass43_Sub1_6.method2206(Static146.method2168(new Class77[] { Static98.aClass77_962, Static2.method61(local495), Static118.aClass77_1096, Static2.method61(local499) }));
							Static159.anIntArray570[local65] = Static120.aClass43_Sub1_6.method2206(Static146.method2168(new Class77[] { Static58.aClass77_602, Static2.method61(local495), Static118.aClass77_1096, Static2.method61(local499) }));
							local65++;
						}
					}
				}
			}
		}
		Static71.method1388(local31, local395, local35, local73, local25);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method1834() {
		aClass77_996 = null;
		anIntArrayArray20 = null;
		aClass77_993 = null;
		aClass77_994 = null;
		aClass77_997 = null;
		aClass77_995 = null;
		aClass77_998 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Lclient!qf;")
	public static Class66 method1835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class66 local7 = Static55.method1034(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass66Array2 == null || local7.aClass66Array2.length <= arg1) {
			return null;
		} else {
			return local7.aClass66Array2[arg1];
		}
	}
}
