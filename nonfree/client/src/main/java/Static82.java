import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!p", name = "q", descriptor = "Lclient!bf;")
	public static Class11 aClass11_46;

	@OriginalMember(owner = "client!p", name = "x", descriptor = "I")
	public static int anInt2023;

	@OriginalMember(owner = "client!p", name = "A", descriptor = "Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!p", name = "G", descriptor = "Lclient!da;")
	public static Class18 aClass18_2;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!ae;")
	public static Class5 aClass5_927 = Static56.method972("Handel)4Duell");

	@OriginalMember(owner = "client!p", name = "D", descriptor = "Lclient!ae;")
	private static Class5 aClass5_931 = Static56.method972("Password: ");

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!ae;")
	public static Class5 aClass5_928 = aClass5_931;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "[I")
	public static int[] anIntArray227 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

	@OriginalMember(owner = "client!p", name = "f", descriptor = "I")
	public static int anInt2010 = 78;

	@OriginalMember(owner = "client!p", name = "h", descriptor = "Lclient!ae;")
	public static Class5 aClass5_929 = Static56.method972("Offline");

	@OriginalMember(owner = "client!p", name = "i", descriptor = "Z")
	public static boolean aBoolean97 = false;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "I")
	public static int anInt2015 = 0;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "Lclient!bd;")
	public static Class9 aClass9_21 = new Class9(20);

	@OriginalMember(owner = "client!p", name = "p", descriptor = "Lclient!ae;")
	public static Class5 aClass5_930 = Static56.method972("welle:");

	@OriginalMember(owner = "client!p", name = "I", descriptor = "Lclient!ae;")
	private static Class5 aClass5_932 = Static56.method972("Loading fonts )2 ");

	@OriginalMember(owner = "client!p", name = "J", descriptor = "Lclient!ae;")
	public static Class5 aClass5_933 = aClass5_932;

	@OriginalMember(owner = "client!p", name = "K", descriptor = "Lclient!ae;")
	public static Class5 aClass5_934 = Static56.method972("mapdots");

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(JB)Lclient!ae;")
	public static Class5 method1301(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) long local31 = arg0;
			@Pc(33) int local33 = 0;
			while (local31 != 0L) {
				local31 /= 37L;
				local33++;
			}
			@Pc(49) byte[] local49 = new byte[local33];
			while (arg0 != 0L) {
				@Pc(65) long local65 = arg0;
				arg0 /= 37L;
				local33--;
				local49[local33] = Static9.aByteArray3[(int) (local65 - arg0 * 37L)];
			}
			@Pc(92) Class5 local92 = new Class5();
			local92.aByteArray1 = local49;
			local92.anInt311 = local49.length;
			return local92;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method1302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		return Static18.method406(arg2) ? Static24.method462(Static31.aClass3_Sub1_Sub17ArrayArray3[arg2], arg3, 0, -1, 0, 0, arg1, arg0, 0) : false;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)V")
	public static void method1305(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = Static40.aClass3_Sub1_Sub2_Sub3_3.anIntArray237;
		@Pc(23) int local23 = local20.length;
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			local20[local25] = 0;
		}
		@Pc(53) int local53;
		@Pc(55) int local55;
		for (@Pc(41) int local41 = 1; local41 < 103; local41++) {
			local53 = (52736 - local41 * 512) * 4 + 24628;
			for (local55 = 1; local55 < 103; local55++) {
				if ((Static93.aByteArrayArrayArray5[arg0][local55][local41] & 0x18) == 0) {
					Static73.aClass42_1.method1043(local20, local53, arg0, local55, local41);
				}
				if (arg0 < 3 && (Static93.aByteArrayArrayArray5[arg0 + 1][local55][local41] & 0x8) != 0) {
					Static73.aClass42_1.method1043(local20, local53, arg0 + 1, local55, local41);
				}
				local53 += 4;
			}
		}
		Static40.aClass3_Sub1_Sub2_Sub3_3.method1446();
		local53 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
		local55 = (int) (Math.random() * 20.0D) + 228 << 16;
		@Pc(166) int local166;
		for (@Pc(162) int local162 = 1; local162 < 103; local162++) {
			for (local166 = 1; local166 < 103; local166++) {
				if ((Static93.aByteArrayArrayArray5[arg0][local166][local162] & 0x18) == 0) {
					Static84.method1334(arg0, local53, local166, local162, local55);
				}
				if (arg0 < 3 && (Static93.aByteArrayArrayArray5[arg0 + 1][local166][local162] & 0x8) != 0) {
					Static84.method1334(arg0 + 1, local53, local166, local162, local55);
				}
			}
		}
		anInt2015 = 0;
		for (local166 = 0; local166 < 104; local166++) {
			for (@Pc(228) int local228 = 0; local228 < 104; local228++) {
				@Pc(236) int local236 = Static73.aClass42_1.method1060(Static12.anInt480, local166, local228);
				if (local236 != 0) {
					local236 = local236 >> 14 & 0x7FFF;
					@Pc(249) int local249 = Static72.method1211(local236).anInt2336;
					if (local249 >= 0) {
						@Pc(256) int local256 = local228;
						@Pc(258) int local258 = local166;
						if (local249 != 22 && local249 != 29 && local249 != 34 && local249 != 36 && local249 != 46 && local249 != 47 && local249 != 48) {
							@Pc(288) int[][] local288 = Static80.aClass30Array1[Static12.anInt480].anIntArrayArray9;
							for (@Pc(290) int local290 = 0; local290 < 10; local290++) {
								@Pc(297) int local297 = (int) (Math.random() * 4.0D);
								if (local297 == 0 && local258 > 0 && local166 - 3 < local258 && (local288[local258 - 1][local256] & 0x1280108) == 0) {
									local258--;
								}
								if (local297 == 1 && local258 < 103 && local166 + 3 > local258 && (local288[local258 + 1][local256] & 0x1280180) == 0) {
									local258++;
								}
								if (local297 == 2 && local256 > 0 && local228 - 3 < local256 && (local288[local258][local256 - 1] & 0x1280102) == 0) {
									local256--;
								}
								if (local297 == 3 && local256 < 103 && local228 + 3 > local256 && (local288[local258][local256 + 1] & 0x1280120) == 0) {
									local256++;
								}
							}
						}
						Static47.aClass3_Sub1_Sub2_Sub3Array7[anInt2015] = Static34.aClass3_Sub1_Sub2_Sub3Array4[local249];
						Static50.anIntArray158[anInt2015] = local258;
						Static102.anIntArray311[anInt2015] = local256;
						anInt2015++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!m;IIIIII)V")
	public static void method1308(@OriginalArg(1) Class3_Sub6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(23) int local23;
		if (arg5 < 0 || arg5 >= 104 || arg3 < 0 || arg3 >= 104) {
			while (true) {
				local23 = arg0.method1587();
				if (local23 == 0) {
					break;
				}
				if (local23 == 1) {
					arg0.method1587();
					break;
				}
				if (local23 <= 49) {
					arg0.method1587();
				}
			}
			return;
		}
		Static93.aByteArrayArrayArray5[arg6][arg5][arg3] = 0;
		while (true) {
			local23 = arg0.method1587();
			if (local23 == 0) {
				if (arg6 == 0) {
					Static111.anIntArrayArrayArray7[0][arg5][arg3] = -Static104.method1160(arg4 + arg3 + 556238, 932731 - -arg5 + arg2) * 8;
				} else {
					Static111.anIntArrayArrayArray7[arg6][arg5][arg3] = Static111.anIntArrayArrayArray7[arg6 - 1][arg5][arg3] - 240;
				}
				break;
			}
			if (local23 == 1) {
				@Pc(118) int local118 = arg0.method1587();
				if (local118 == 1) {
					local118 = 0;
				}
				if (arg6 == 0) {
					Static111.anIntArrayArrayArray7[0][arg5][arg3] = -local118 * 8;
				} else {
					Static111.anIntArrayArrayArray7[arg6][arg5][arg3] = Static111.anIntArrayArrayArray7[arg6 - 1][arg5][arg3] - local118 * 8;
				}
				break;
			}
			if (local23 <= 49) {
				Static49.aByteArrayArrayArray3[arg6][arg5][arg3] = arg0.method1605();
				Static111.aByteArrayArrayArray8[arg6][arg5][arg3] = (byte) ((local23 - 2) / 4);
				Static100.aByteArrayArrayArray6[arg6][arg5][arg3] = (byte) (local23 + arg1 - 2 & 0x3);
			} else if (local23 <= 81) {
				Static93.aByteArrayArrayArray5[arg6][arg5][arg3] = (byte) (local23 - 49);
			} else {
				Static116.aByteArrayArrayArray9[arg6][arg5][arg3] = (byte) (local23 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
	public static void method1311() {
		Static74.aBoolean91 = false;
		Static59.aBoolean75 = false;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!te;B)V")
	public static void method1314(@OriginalArg(0) Class3_Sub1_Sub17 arg0) {
		@Pc(12) int local12 = arg0.anInt2651 >> 16;
		if (Static88.anInt2255 == local12 || Static100.anInt2515 == local12) {
			Static15.aBoolean22 = true;
		}
		if (Static106.anInt2736 == local12 || local12 == Static88.anIntArray255[Static60.anInt2979]) {
			Static116.aBoolean157 = true;
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
	public static void method1315() {
		anIntArray227 = null;
		aClass5_928 = null;
		aClass5_931 = null;
		aClass5_932 = null;
		aClass11_46 = null;
		aClass3_Sub1_Sub2_Sub3_4 = null;
		aClass5_930 = null;
		aClass5_929 = null;
		aClass5_927 = null;
		aClass9_21 = null;
		aClass5_933 = null;
		aClass5_934 = null;
		aClass18_2 = null;
	}
}
