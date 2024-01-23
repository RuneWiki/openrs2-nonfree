import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!nl", name = "P", descriptor = "[Lclient!rg;")
	public static Class151[] aClass151Array1;

	@OriginalMember(owner = "client!nl", name = "S", descriptor = "I")
	public static int anInt3752;

	@OriginalMember(owner = "client!nl", name = "R", descriptor = "[[B")
	public static byte[][] aByteArrayArray85 = new byte[250][];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method3179(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15;
		for (local15 = 0; local13 > local15 && Static235.method3989(arg0.charAt(local15)); local15++) {
		}
		while (local13 > local15 && Static235.method3989(arg0.charAt(local13 - 1))) {
			local13--;
		}
		@Pc(49) int local49 = local13 - local15;
		if (local49 < 1 || local49 > 20) {
			return null;
		}
		@Pc(65) StringBuffer local65 = new StringBuffer(local49);
		for (@Pc(67) int local67 = local15; local67 < local13; local67++) {
			@Pc(78) char local78 = arg0.charAt(local67);
			if (Static244.method4135(local78)) {
				@Pc(86) char local86 = Static166.method2761(local78);
				if (local86 != '\u0000') {
					local65.append(local86);
				}
			}
		}
		if (local65.length() == 0) {
			return null;
		} else {
			return local65.toString();
		}
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "(II)V")
	public static void method3181(@OriginalArg(0) int arg0) {
		@Pc(6) Class41 local6 = Static125.aClass41_1;
		synchronized (Static125.aClass41_1) {
			Static141.anInt2718 = arg0;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLclient!rn;)V")
	public static void method3182(@OriginalArg(1) Class155 arg0) {
		Static60.aClass3_Sub4_Sub12Array2 = Static276.method4531(Static310.anInt6109, arg0);
		Static186.aClass3_Sub4_Sub12Array5 = Static276.method4531(Static18.anInt341, arg0);
		Static300.aClass3_Sub4_Sub12Array11 = Static276.method4531(Static9.anInt188, arg0);
		Static86.aClass3_Sub4_Sub12Array3 = Static276.method4531(Static292.anInt5825, arg0);
		Static270.aClass3_Sub4_Sub12Array10 = Static276.method4531(Static206.anInt4073, arg0);
		Static206.aClass3_Sub4_Sub12Array7 = Static276.method4531(Static145.anInt2767, arg0);
		Static237.aClass3_Sub4_Sub12Array9 = Static267.method4415(arg0, Static250.anInt5140);
		Static209.aClass3_Sub4_Sub12Array12 = Static267.method4415(arg0, Static67.anInt1238);
		Static161.aClass3_Sub4_Sub12Array4 = Static267.method4415(arg0, Static107.anInt1964);
		Static269.aClass81Array5 = Static280.method3545(Static166.anInt3122, arg0);
		Static96.aClass81Array2 = Static280.method3545(Static123.anInt2332, arg0);
		Static25.aClass3_Sub4_Sub2_4.method3686(Static96.aClass81Array2, null);
		Static248.aClass3_Sub4_Sub2_11.method3686(Static96.aClass81Array2, null);
		Static224.aClass3_Sub4_Sub2_14.method3686(Static96.aClass81Array2, null);
		if (Static283.aBoolean393) {
			Static193.aClass81_Sub2Array2 = Static152.method2567(Static112.anInt5730, arg0);
			for (@Pc(102) int local102 = 0; local102 < Static193.aClass81_Sub2Array2.length; local102++) {
				Static193.aClass81_Sub2Array2[local102].method2514();
			}
		}
		@Pc(119) Class3_Sub4_Sub12_Sub2 local119 = Static216.method3551(Static75.anInt1407, arg0, 0);
		local119.method4723();
		if (Static283.aBoolean393) {
			Static260.aClass3_Sub4_Sub12_7 = new Class3_Sub4_Sub12_Sub1(local119);
		} else {
			Static260.aClass3_Sub4_Sub12_7 = local119;
		}
		@Pc(138) Class3_Sub4_Sub12_Sub2[] local138 = Static300.method4859(Static6.anInt132, arg0);
		@Pc(140) int local140;
		for (local140 = 0; local140 < local138.length; local140++) {
			local138[local140].method4723();
		}
		if (Static283.aBoolean393) {
			Static200.aClass3_Sub4_Sub12Array6 = new Class3_Sub4_Sub12[local138.length];
			for (local140 = 0; local140 < local138.length; local140++) {
				Static200.aClass3_Sub4_Sub12Array6[local140] = new Class3_Sub4_Sub12_Sub1(local138[local140]);
			}
		} else {
			Static200.aClass3_Sub4_Sub12Array6 = local138;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(JI)V")
	public static void method3183(@OriginalArg(0) long arg0) {
		if (Static25.anInt467 == 1 || Static25.anInt467 == 5) {
			Static32.method503(arg0);
		} else if (Static25.anInt467 == 2) {
			Static60.method609();
		} else if (Static25.anInt467 == 4) {
			Static39.method563(arg0);
		} else {
			Static65.method1017();
		}
		if (!Static118.aBoolean169) {
			if (Static212.anInt4151 != 0) {
				Static216.anInt4245 = Static112.anInt5726;
				Static79.anInt1910 = Static83.anInt1550;
			} else if (Static40.anInt6052 == 0) {
				Static216.anInt4245 = Static167.anInt3153;
				Static79.anInt1910 = Static153.anInt2892;
			} else {
				Static216.anInt4245 = Static293.anInt5844;
				Static79.anInt1910 = Static7.anInt169;
			}
			Static259.aShortArray87[0] = 1011;
			Static153.anIntArray332[0] = Static144.anInt4821;
			Static152.anInt2876 = 1;
			Static73.aStringArray13[0] = Static255.aString186;
			Static103.aStringArray19[0] = "";
		}
		Static71.method1081((long) Static124.anInt2371);
		if (Static66.anInt1232 != -1) {
			Static267.method4421(Static66.anInt1232);
		}
		@Pc(93) int local93;
		for (local93 = 0; local93 < Static123.anInt2326; local93++) {
			if (Static292.aBooleanArray129[local93]) {
				Static223.aBooleanArray102[local93] = true;
			}
			Static308.aBooleanArray134[local93] = Static292.aBooleanArray129[local93];
			Static292.aBooleanArray129[local93] = false;
		}
		Static201.anInt3957 = Static124.anInt2371;
		Static215.aClass151_12 = null;
		if (Static283.aBoolean393) {
			Static28.aBoolean42 = true;
		}
		Static93.anInt1704 = -1;
		Static38.anInt673 = -1;
		Static278.aClass151_17 = null;
		if (Static66.anInt1232 != -1) {
			Static123.anInt2326 = 0;
			Static200.method3310();
		}
		if (Static283.aBoolean393) {
			Static234.method3976();
		} else {
			Static143.method2458();
		}
		Static277.method4541();
		if (Static118.aBoolean169) {
			if (Static34.aBoolean53) {
				Static249.method4214();
			} else {
				Static67.method1034();
			}
		} else if (Static278.aClass151_17 != null) {
			Static178.method2942(Static148.anInt2815, Static278.aClass151_17, Static146.anInt5855);
		} else if (Static93.anInt1704 != -1) {
			Static178.method2942(Static93.anInt1704, null, Static38.anInt673);
		}
		local93 = Static118.aBoolean169 ? -1 : Static79.method1662();
		if (local93 == -1) {
			local93 = Static257.anInt5293;
		}
		Static45.method687(local93);
		if (Static44.anInt829 == 1) {
			Static44.anInt829 = 2;
		}
		if (Static250.anInt5136 == 1) {
			Static250.anInt5136 = 2;
		}
		if (Static111.anInt2048 == 3) {
			for (@Pc(220) int local220 = 0; local220 < Static123.anInt2326; local220++) {
				if (Static308.aBooleanArray134[local220]) {
					if (Static283.aBoolean393) {
						Static234.method3974(Static150.anIntArray329[local220], Static73.anIntArray134[local220], Static125.anIntArray288[local220], Static278.anIntArray540[local220], 16711935, 128);
					} else {
						Static143.method2452(Static150.anIntArray329[local220], Static73.anIntArray134[local220], Static125.anIntArray288[local220], Static278.anIntArray540[local220], 16711935, 128);
					}
				} else if (Static223.aBooleanArray102[local220]) {
					if (Static283.aBoolean393) {
						Static234.method3974(Static150.anIntArray329[local220], Static73.anIntArray134[local220], Static125.anIntArray288[local220], Static278.anIntArray540[local220], 16711680, 128);
					} else {
						Static143.method2452(Static150.anIntArray329[local220], Static73.anIntArray134[local220], Static125.anIntArray288[local220], Static278.anIntArray540[local220], 16711680, 128);
					}
				}
			}
		}
		Static92.method1364(Static136.aClass10_Sub5_Sub1_1.anInt5073, Static136.aClass10_Sub5_Sub1_1.anInt5016, Static140.anInt2709, Static99.anInt1826);
		Static140.anInt2709 = 0;
	}

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "(III)Lclient!jg;")
	public static Class85 method3184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 0 || arg1 >= Static295.anInt4973 || arg2 < 0 || arg2 >= Static307.anInt6023) {
			return null;
		}
		@Pc(19) Class3_Sub25 local19 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		if (local19 == null) {
			return null;
		}
		@Pc(25) Class85 local25 = null;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = -1;
		for (@Pc(31) int local31 = 0; local31 < local19.anInt4483; local31++) {
			@Pc(40) Class85 local40 = local19.aClass85Array3[local31];
			if ((local40.aLong107 >> 29 & 0x3L) <= 1L && local40.anInt2482 == arg1 && local40.anInt2480 == arg2 && (local40.anInt2474 > local27 || local40.anInt2478 > local29)) {
				local25 = local40;
				local27 = local40.anInt2474;
				local29 = local40.anInt2478;
			}
		}
		return local25;
	}
}
