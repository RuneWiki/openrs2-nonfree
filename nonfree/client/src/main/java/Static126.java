import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "Lclient!k;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_40;

	@OriginalMember(owner = "client!vc", name = "F", descriptor = "Lclient!ba;")
	public static Class7 aClass7_4;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1170 = Static119.method1462("Lade)3)3)3");

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!bc;")
	public static Class8 aClass8_60 = new Class8(64);

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "[I")
	public static int[] anIntArray355 = new int[500];

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1173 = Static119.method1462("Close");

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1171 = aClass65_1173;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1172 = Static119.method1462("Art");

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1174 = Static119.method1462("(Udns");

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1175 = Static119.method1462("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1176 = Static119.method1462("Choose Option");

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
	public static int anInt2710 = 0;

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[250][];

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1177 = aClass65_1176;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)Z")
	public static boolean method1924(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!na;Lclient!na;Z)V")
	public static void method1925(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1) {
		Static12.aClass56_4 = arg1;
		Static95.aClass56_30 = arg0;
		Static100.anInt2281 = Static95.aClass56_30.method1678(3);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method1926() {
		aByteArrayArray9 = null;
		aClass65_1171 = null;
		aClass65_1176 = null;
		aClass65_1173 = null;
		aClass65_1170 = null;
		aClass65_1172 = null;
		aClass8_60 = null;
		aClass65_1177 = null;
		aClass2_Sub1_Sub4_Sub2_40 = null;
		aClass65_1174 = null;
		aClass7_4 = null;
		aClass65_1175 = null;
		anIntArray355 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V")
	public static void method1927(@OriginalArg(0) int arg0) {
		if (!Static94.method1566(arg0)) {
			return;
		}
		@Pc(14) Class2_Sub22[] local14 = Static95.aClass2_Sub22ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			@Pc(27) Class2_Sub22 local27 = local14[local21];
			if (local27 != null) {
				local27.anInt2771 = 0;
				local27.anInt2830 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)V")
	public static void method1928(@OriginalArg(1) boolean arg0) {
		Static68.aBoolean129 = arg0;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(59) int local59;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(104) int local104;
		@Pc(127) int local127;
		@Pc(135) int local135;
		@Pc(144) int local144;
		if (!Static68.aBoolean129) {
			local21 = (Static90.anInt1997 - Static66.aClass2_Sub4_Sub1_2.anInt1298) / 16;
			Static96.anIntArrayArray20 = new int[local21][4];
			for (local27 = 0; local27 < local21; local27++) {
				for (local31 = 0; local31 < 4; local31++) {
					Static96.anIntArrayArray20[local27][local31] = Static66.aClass2_Sub4_Sub1_2.method918();
				}
			}
			local31 = Static66.aClass2_Sub4_Sub1_2.method896();
			local59 = Static66.aClass2_Sub4_Sub1_2.method927();
			@Pc(61) boolean local61 = false;
			local65 = Static66.aClass2_Sub4_Sub1_2.method902();
			local69 = Static66.aClass2_Sub4_Sub1_2.method896();
			if ((local69 / 8 == 48 || local69 / 8 == 49) && local65 / 8 == 48) {
				local61 = true;
			}
			if (local69 / 8 == 48 && local65 / 8 == 148) {
				local61 = true;
			}
			local104 = Static66.aClass2_Sub4_Sub1_2.method933();
			Static58.anIntArray177 = new int[local21];
			Static15.aByteArrayArray1 = new byte[local21][];
			Static43.aByteArrayArray4 = new byte[local21][];
			Static77.anIntArray226 = new int[local21];
			Static79.anIntArray227 = new int[local21];
			local21 = 0;
			for (local127 = (local69 - 6) / 8; local127 <= (local69 + 6) / 8; local127++) {
				for (local135 = (local65 - 6) / 8; local135 <= (local65 + 6) / 8; local135++) {
					local144 = (local127 << 8) + local135;
					if (!local61 || local135 != 49 && local135 != 149 && local135 != 147 && local127 != 50 && (local127 != 49 || local135 != 47)) {
						Static58.anIntArray177[local21] = local144;
						Static77.anIntArray226[local21] = Static95.aClass56_Sub1_22.method1690(Static35.method647(new Class65[] { Static121.aClass65_1132, Static120.method1871(local127), Static10.aClass65_1280, Static120.method1871(local135) }));
						Static79.anIntArray227[local21] = Static95.aClass56_Sub1_22.method1690(Static35.method647(new Class65[] { Static81.aClass65_765, Static120.method1871(local127), Static10.aClass65_1280, Static120.method1871(local135) }));
						local21++;
					}
				}
			}
			Static34.method638(local59, local65, local31, local69, local104);
			return;
		}
		local21 = Static66.aClass2_Sub4_Sub1_2.method902();
		local27 = Static66.aClass2_Sub4_Sub1_2.method919();
		local31 = Static66.aClass2_Sub4_Sub1_2.method933();
		local59 = Static66.aClass2_Sub4_Sub1_2.method927();
		Static66.aClass2_Sub4_Sub1_2.method954();
		@Pc(307) int local307;
		for (local65 = 0; local65 < 4; local65++) {
			for (local69 = 0; local69 < 13; local69++) {
				for (local104 = 0; local104 < 13; local104++) {
					local307 = Static66.aClass2_Sub4_Sub1_2.method953(1);
					if (local307 == 1) {
						Static119.anIntArrayArrayArray9[local65][local69][local104] = Static66.aClass2_Sub4_Sub1_2.method953(26);
					} else {
						Static119.anIntArrayArrayArray9[local65][local69][local104] = -1;
					}
				}
			}
		}
		Static66.aClass2_Sub4_Sub1_2.method963();
		local69 = (Static90.anInt1997 - Static66.aClass2_Sub4_Sub1_2.anInt1298) / 16;
		Static96.anIntArrayArray20 = new int[local69][4];
		for (local104 = 0; local104 < local69; local104++) {
			for (local307 = 0; local307 < 4; local307++) {
				Static96.anIntArrayArray20[local104][local307] = Static66.aClass2_Sub4_Sub1_2.method915();
			}
		}
		local307 = Static66.aClass2_Sub4_Sub1_2.method919();
		Static43.aByteArrayArray4 = new byte[local69][];
		Static79.anIntArray227 = new int[local69];
		Static58.anIntArray177 = new int[local69];
		Static77.anIntArray226 = new int[local69];
		Static15.aByteArrayArray1 = new byte[local69][];
		local69 = 0;
		for (local127 = 0; local127 < 4; local127++) {
			for (local135 = 0; local135 < 13; local135++) {
				for (local144 = 0; local144 < 13; local144++) {
					@Pc(431) int local431 = Static119.anIntArrayArrayArray9[local127][local135][local144];
					if (local431 != -1) {
						@Pc(440) int local440 = local431 >> 14 & 0x3FF;
						@Pc(446) int local446 = local431 >> 3 & 0x7FF;
						@Pc(456) int local456 = (local440 / 8 << 8) + local446 / 8;
						for (@Pc(458) int local458 = 0; local458 < local69; local458++) {
							if (Static58.anIntArray177[local458] == local456) {
								local456 = -1;
								break;
							}
						}
						if (local456 != -1) {
							@Pc(483) int local483 = local456 >> 8 & 0xFF;
							@Pc(487) int local487 = local456 & 0xFF;
							Static58.anIntArray177[local69] = local456;
							Static77.anIntArray226[local69] = Static95.aClass56_Sub1_22.method1690(Static35.method647(new Class65[] { Static121.aClass65_1132, Static120.method1871(local483), Static10.aClass65_1280, Static120.method1871(local487) }));
							Static79.anIntArray227[local69] = Static95.aClass56_Sub1_22.method1690(Static35.method647(new Class65[] { Static81.aClass65_765, Static120.method1871(local483), Static10.aClass65_1280, Static120.method1871(local487) }));
							local69++;
						}
					}
				}
			}
		}
		Static34.method638(local21, local27, local307, local59, local31);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public static void method1929() {
		try {
			if (Static105.aClass69_1 == null) {
				Static105.aClass69_1 = new Class69(Static28.aClass20_2, Static35.method647(new Class65[] { Static28.aClass65_326, Static110.aClass65_1041, Static36.aClass65_384 }).method1498());
			} else {
				@Pc(39) byte[] local39 = Static105.aClass69_1.method1594();
				if (local39 != null) {
					@Pc(46) Class2_Sub4 local46 = new Class2_Sub4(local39);
					Static37.anInt808 = local46.method896();
					Static44.aClass79Array1 = new Class79[Static37.anInt808];
					for (@Pc(55) int local55 = 0; local55 < Static37.anInt808; local55++) {
						@Pc(65) Class79 local65 = Static44.aClass79Array1[local55] = new Class79();
						@Pc(69) int local69 = local46.method896();
						local65.aBoolean104 = (local69 & 0x8000) != 0;
						local65.anInt2604 = local69 & 0x7FFF;
						local65.aClass65_1133 = local46.method931();
						local65.anInt2609 = local46.method905();
						local65.anInt2608 = local55;
						local65.anInt2606 = Static18.method278(local65.aClass65_1133);
					}
					Static86.method1387(Static56.anIntArray176, Static44.aClass79Array1.length - 1, Static105.anIntArray310, Static44.aClass79Array1, 0);
					Static63.aBoolean54 = true;
					Static105.aClass69_1 = null;
				}
			}
		} catch (@Pc(122) Exception local122) {
			local122.printStackTrace();
			Static105.aClass69_1 = null;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Z")
	public static boolean method1930() {
		if (Static129.aClass7_6 == null) {
			return false;
		}
		@Pc(388) int local388;
		try {
			@Pc(13) int local13 = Static129.aClass7_6.method155();
			if (local13 == 0) {
				return false;
			}
			if (Static15.anInt365 == -1) {
				local13--;
				Static129.aClass7_6.method154(0, 1, Static66.aClass2_Sub4_Sub1_2.aByteArray20);
				Static66.aClass2_Sub4_Sub1_2.anInt1298 = 0;
				Static15.anInt365 = Static66.aClass2_Sub4_Sub1_2.method951();
				Static90.anInt1997 = Static73.anIntArray198[Static15.anInt365];
			}
			if (Static90.anInt1997 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static129.aClass7_6.method154(0, 1, Static66.aClass2_Sub4_Sub1_2.aByteArray20);
				local13--;
				Static90.anInt1997 = Static66.aClass2_Sub4_Sub1_2.aByteArray20[0] & 0xFF;
			}
			if (Static90.anInt1997 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static129.aClass7_6.method154(0, 2, Static66.aClass2_Sub4_Sub1_2.aByteArray20);
				local13 -= 2;
				Static66.aClass2_Sub4_Sub1_2.anInt1298 = 0;
				Static90.anInt1997 = Static66.aClass2_Sub4_Sub1_2.method896();
			}
			if (local13 < Static90.anInt1997) {
				return false;
			}
			Static66.aClass2_Sub4_Sub1_2.anInt1298 = 0;
			Static129.aClass7_6.method154(0, Static90.anInt1997, Static66.aClass2_Sub4_Sub1_2.aByteArray20);
			Static44.anInt1075 = Static133.anInt2905;
			Static76.anInt1698 = 0;
			Static133.anInt2905 = Static116.anInt2564;
			Static116.anInt2564 = Static15.anInt365;
			if (Static15.anInt365 == 76) {
				Static54.method952();
				Static15.anInt365 = -1;
				return false;
			}
			@Pc(154) long local154;
			@Pc(159) long local159;
			@Pc(175) int local175;
			@Pc(206) int local206;
			@Pc(146) long local146;
			@Pc(171) long local171;
			if (Static15.anInt365 == 232) {
				local146 = Static66.aClass2_Sub4_Sub1_2.method907();
				Static66.aClass2_Sub4_Sub1_2.method922();
				local154 = Static66.aClass2_Sub4_Sub1_2.method907();
				local159 = Static66.aClass2_Sub4_Sub1_2.method896();
				@Pc(164) long local164 = (long) Static66.aClass2_Sub4_Sub1_2.method940();
				local171 = (local159 << 32) + local164;
				local175 = Static66.aClass2_Sub4_Sub1_2.method933();
				@Pc(177) boolean local177 = false;
				for (@Pc(179) int local179 = 0; local179 < 100; local179++) {
					if (local171 == Static75.aLongArray6[local179]) {
						local177 = true;
						break;
					}
				}
				if (local175 <= 1) {
					for (local206 = 0; local206 < Static49.anInt1201; local206++) {
						if (local146 == Static30.aLongArray1[local206]) {
							local177 = true;
							break;
						}
					}
				}
				if (!local177 && Static98.anInt2238 == 0) {
					Static75.aLongArray6[Static127.anInt2721] = local171;
					Static127.anInt2721 = (Static127.anInt2721 + 1) % 100;
					@Pc(247) Class65 local247 = Static55.method2091(Static117.method1859(Static66.aClass2_Sub4_Sub1_2).method1487());
					if (local175 == 2 || local175 == 3) {
						Static82.method1936(9, Static57.method1080(local154).method1506(), local247, Static35.method647(new Class65[] { Static14.aClass65_128, Static57.method1080(local146).method1506() }));
					} else if (local175 == 1) {
						Static82.method1936(9, Static57.method1080(local154).method1506(), local247, Static35.method647(new Class65[] { Static66.aClass65_675, Static57.method1080(local146).method1506() }));
					} else {
						Static82.method1936(9, Static57.method1080(local154).method1506(), local247, Static57.method1080(local146).method1506());
					}
				}
				Static15.anInt365 = -1;
				return true;
			}
			@Pc(335) int local335;
			if (Static15.anInt365 == 192) {
				for (local335 = 0; local335 < Static86.anInt1845; local335++) {
					@Pc(341) Class2_Sub1_Sub13 local341 = Static115.method1840(local335);
					if (local341 != null && local341.anInt2273 == 0) {
						Static23.anIntArray235[local335] = 0;
						Static129.anIntArray363[local335] = 0;
					}
				}
				Static72.method1243();
				Static15.anInt365 = -1;
				Static95.anInt2154 += 32;
				return true;
			}
			@Pc(392) int local392;
			@Pc(399) Class2_Sub7 local399;
			if (Static15.anInt365 == 195) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method930();
				local388 = Static66.aClass2_Sub4_Sub1_2.method923();
				local392 = Static66.aClass2_Sub4_Sub1_2.method919();
				local399 = (Class2_Sub7) Static112.aClass40_21.method851((long) local335);
				if (local399 != null) {
					Static13.method1866(local392 != local399.anInt1527, local399);
				}
				Static3.method71(local392, local335, local388);
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 227) {
				anInt2710 = Static66.aClass2_Sub4_Sub1_2.method933();
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 149 || Static15.anInt365 == 129 || Static15.anInt365 == 68 || Static15.anInt365 == 10 || Static15.anInt365 == 107 || Static15.anInt365 == 66 || Static15.anInt365 == 75 || Static15.anInt365 == 22 || Static15.anInt365 == 67 || Static15.anInt365 == 140 || Static15.anInt365 == 24) {
				Static122.method1885();
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 101) {
				for (local335 = 0; local335 < Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1.length; local335++) {
					if (Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local335] != null) {
						Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local335].anInt1972 = -1;
					}
				}
				for (local388 = 0; local388 < Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1.length; local388++) {
					if (Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local388] != null) {
						Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local388].anInt1972 = -1;
					}
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 228) {
				Static91.method1513(Static90.anInt1997, Static66.aClass2_Sub4_Sub1_2, Static28.aClass20_2);
				Static15.anInt365 = -1;
				return true;
			}
			@Pc(572) int local572;
			@Pc(567) Class2_Sub22 local567;
			@Pc(578) int local578;
			if (Static15.anInt365 == 173) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method905();
				local388 = Static66.aClass2_Sub4_Sub1_2.method898();
				local392 = Static66.aClass2_Sub4_Sub1_2.method903();
				local567 = Static35.method645(local392);
				local572 = local335 + local567.anInt2795;
				local578 = local567.anInt2780 + local388;
				if (local578 != local567.anInt2766 || local567.anInt2770 != local572) {
					local567.anInt2766 = local578;
					local567.anInt2770 = local572;
					Static116.method1853(local567);
				}
				Static15.anInt365 = -1;
				return true;
			}
			@Pc(616) Class2_Sub22 local616;
			if (Static15.anInt365 == 15) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method934();
				local388 = Static66.aClass2_Sub4_Sub1_2.method930();
				local616 = Static35.method645(local388);
				if (local616.anInt2815 != local335 || local335 == -1) {
					local616.anInt2771 = 0;
					local616.anInt2830 = 0;
					local616.anInt2815 = local335;
					Static116.method1853(local616);
				}
				Static15.anInt365 = -1;
				return true;
			}
			@Pc(665) int local665;
			if (Static15.anInt365 == 170) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method903();
				local388 = Static66.aClass2_Sub4_Sub1_2.method927();
				local392 = local388 >> 10 & 0x1F;
				local665 = local388 >> 5 & 0x1F;
				local578 = local388 & 0x1F;
				local572 = (local665 << 11) + (local392 << 19) + (local578 << 3);
				@Pc(686) Class2_Sub22 local686 = Static35.method645(local335);
				if (local572 != local686.anInt2793) {
					local686.anInt2793 = local572;
					Static116.method1853(local686);
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 145) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method923();
				local388 = Static66.aClass2_Sub4_Sub1_2.method911();
				local392 = Static66.aClass2_Sub4_Sub1_2.method899();
				Static59.anInt1479 = local392 >> 1;
				Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.method1468((local392 & 0x1) == 1, local335, local388);
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 25) {
				Static35.method646(Static66.aClass2_Sub4_Sub1_2);
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 16) {
				method1928(true);
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 162) {
				if (Static17.anInt384 != -1) {
					Static30.method607(0, Static17.anInt384);
				}
				Static15.anInt365 = -1;
				return true;
			}
			@Pc(915) int local915;
			@Pc(919) int local919;
			if (Static15.anInt365 == 157) {
				local335 = Static90.anInt1997 + Static66.aClass2_Sub4_Sub1_2.anInt1298;
				local388 = Static66.aClass2_Sub4_Sub1_2.method896();
				local392 = Static66.aClass2_Sub4_Sub1_2.method896();
				if (Static17.anInt384 != local388) {
					Static17.anInt384 = local388;
					method1927(Static17.anInt384);
					Static12.method244(Static17.anInt384);
					for (local665 = 0; local665 < 100; local665++) {
						Static100.aBooleanArray16[local665] = true;
					}
				}
				while (local392-- > 0) {
					local665 = Static66.aClass2_Sub4_Sub1_2.method903();
					local578 = Static66.aClass2_Sub4_Sub1_2.method896();
					local572 = Static66.aClass2_Sub4_Sub1_2.method933();
					@Pc(841) Class2_Sub7 local841 = (Class2_Sub7) Static112.aClass40_21.method851((long) local665);
					if (local841 != null && local841.anInt1527 != local578) {
						Static13.method1866(true, local841);
						local841 = null;
					}
					if (local841 == null) {
						local841 = Static3.method71(local578, local665, local572);
					}
					local841.aBoolean53 = true;
				}
				for (local399 = (Class2_Sub7) Static112.aClass40_21.method854(); local399 != null; local399 = (Class2_Sub7) Static112.aClass40_21.method852()) {
					if (local399.aBoolean53) {
						local399.aBoolean53 = false;
					} else {
						Static13.method1866(true, local399);
					}
				}
				Static82.aClass40_22 = new Class40(512);
				while (Static66.aClass2_Sub4_Sub1_2.anInt1298 < local335) {
					local578 = Static66.aClass2_Sub4_Sub1_2.method903();
					local572 = Static66.aClass2_Sub4_Sub1_2.method896();
					local915 = Static66.aClass2_Sub4_Sub1_2.method896();
					local919 = Static66.aClass2_Sub4_Sub1_2.method903();
					for (local175 = local572; local175 <= local915; local175++) {
						local171 = ((long) local578 << 32) + (long) local175;
						Static82.aClass40_22.method849(new Class2_Sub24(local919), local171);
					}
				}
				Static15.anInt365 = -1;
				return true;
			}
			@Pc(962) Class2_Sub22 local962;
			if (Static15.anInt365 == 237) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method915();
				local962 = Static35.method645(local335);
				for (local392 = 0; local392 < local962.anIntArray374.length; local392++) {
					local962.anIntArray374[local392] = -1;
					local962.anIntArray374[local392] = 0;
				}
				Static116.method1853(local962);
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 188) {
				Static38.aBoolean36 = false;
				for (local335 = 0; local335 < 5; local335++) {
					Static16.aBooleanArray15[local335] = false;
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 84) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method918();
				local388 = Static66.aClass2_Sub4_Sub1_2.method919();
				local616 = Static35.method645(local335);
				if (local616 != null && local616.anInt2813 == 0) {
					if (local388 > local616.anInt2785 - local616.anInt2765) {
						local388 = local616.anInt2785 - local616.anInt2765;
					}
					if (local388 < 0) {
						local388 = 0;
					}
					if (local616.anInt2781 != local388) {
						local616.anInt2781 = local388;
						Static116.method1853(local616);
					}
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 21) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method896();
				local388 = Static66.aClass2_Sub4_Sub1_2.method933();
				local392 = Static66.aClass2_Sub4_Sub1_2.method896();
				Static49.method847(local392, local388, local335);
				Static15.anInt365 = -1;
				return true;
			}
			@Pc(1117) boolean local1117;
			if (Static15.anInt365 == 193) {
				local146 = Static66.aClass2_Sub4_Sub1_2.method907();
				local392 = Static66.aClass2_Sub4_Sub1_2.method896();
				@Pc(1115) byte local1115 = Static66.aClass2_Sub4_Sub1_2.method922();
				local1117 = false;
				if ((Long.MIN_VALUE & local146) != 0L) {
					local1117 = true;
				}
				if (local1117) {
					if (Static57.anInt1440 == 0) {
						Static15.anInt365 = -1;
						return true;
					}
					local146 &= Long.MAX_VALUE;
					for (local572 = 0; Static57.anInt1440 > local572 && (local146 != Static73.aClass2_Sub16Array1[local572].aLong100 || local392 != Static73.aClass2_Sub16Array1[local572].anInt2423); local572++) {
					}
					if (Static57.anInt1440 > local572) {
						while (local572 < Static57.anInt1440 - 1) {
							Static73.aClass2_Sub16Array1[local572] = Static73.aClass2_Sub16Array1[local572 + 1];
							local572++;
						}
						Static73.aClass2_Sub16Array1[Static57.anInt1440] = null;
						Static57.anInt1440--;
					}
				} else {
					@Pc(1207) Class2_Sub16 local1207 = new Class2_Sub16();
					local1207.aLong100 = local146;
					local1207.aClass65_1018 = Static57.method1080(local1207.aLong100);
					local1207.anInt2423 = local392;
					local1207.aByte4 = local1115;
					for (local915 = Static57.anInt1440 - 1; local915 >= 0; local915--) {
						local919 = Static73.aClass2_Sub16Array1[local915].aClass65_1018.method1480(local1207.aClass65_1018);
						if (local919 == 0) {
							Static73.aClass2_Sub16Array1[local915].anInt2423 = local392;
							Static73.aClass2_Sub16Array1[local915].aByte4 = local1115;
							Static15.anInt365 = -1;
							Static134.anInt2946 = Static8.anInt228;
							if (Static110.aLong82 == local146) {
								Static3.aByte1 = local1115;
							}
							return true;
						}
						if (local919 < 0) {
							break;
						}
					}
					if (Static57.anInt1440 >= Static73.aClass2_Sub16Array1.length) {
						Static15.anInt365 = -1;
						return true;
					}
					for (local919 = Static57.anInt1440 - 1; local919 > local915; local919--) {
						Static73.aClass2_Sub16Array1[local919 + 1] = Static73.aClass2_Sub16Array1[local919];
					}
					if (Static57.anInt1440 == 0) {
						Static73.aClass2_Sub16Array1 = new Class2_Sub16[100];
					}
					Static73.aClass2_Sub16Array1[local915 + 1] = local1207;
					if (local146 == Static110.aLong82) {
						Static3.aByte1 = local1115;
					}
					Static57.anInt1440++;
				}
				Static134.anInt2946 = Static8.anInt228;
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 205) {
				Static38.aBoolean36 = true;
				Static42.anInt1051 = Static66.aClass2_Sub4_Sub1_2.method933();
				Static94.anInt2121 = Static66.aClass2_Sub4_Sub1_2.method933();
				Static78.anInt1728 = Static66.aClass2_Sub4_Sub1_2.method896();
				Static42.anInt1049 = Static66.aClass2_Sub4_Sub1_2.method933();
				Static2.anInt90 = Static66.aClass2_Sub4_Sub1_2.method933();
				if (Static2.anInt90 >= 100) {
					local335 = Static42.anInt1051 * 128 + 64;
					local388 = Static94.anInt2121 * 128 + 64;
					local392 = Static106.method1718(local388, local335, Static59.anInt1479) - Static78.anInt1728;
					local578 = local392 - Static84.anInt1818;
					local665 = local335 - Static69.anInt1610;
					local572 = local388 - Static130.anInt2838;
					local915 = (int) Math.sqrt((double) (local572 * local572 + local665 * local665));
					Static97.anInt2216 = (int) (Math.atan2((double) local578, (double) local915) * 325.949D) & 0x7FF;
					Static45.anInt1096 = (int) (-325.949D * Math.atan2((double) local665, (double) local572)) & 0x7FF;
					if (Static97.anInt2216 < 128) {
						Static97.anInt2216 = 128;
					}
					if (Static97.anInt2216 > 383) {
						Static97.anInt2216 = 383;
					}
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 14) {
				Static26.anInt631 = Static66.aClass2_Sub4_Sub1_2.method933();
				if (Static26.anInt631 == 1) {
					Static105.anInt2363 = Static66.aClass2_Sub4_Sub1_2.method896();
				}
				if (Static26.anInt631 >= 2 && Static26.anInt631 <= 6) {
					if (Static26.anInt631 == 2) {
						Static88.anInt1888 = 64;
						Static75.anInt2328 = 64;
					}
					if (Static26.anInt631 == 3) {
						Static75.anInt2328 = 64;
						Static88.anInt1888 = 0;
					}
					if (Static26.anInt631 == 4) {
						Static75.anInt2328 = 64;
						Static88.anInt1888 = 128;
					}
					if (Static26.anInt631 == 5) {
						Static75.anInt2328 = 0;
						Static88.anInt1888 = 64;
					}
					if (Static26.anInt631 == 6) {
						Static75.anInt2328 = 128;
						Static88.anInt1888 = 64;
					}
					Static26.anInt631 = 2;
					Static76.anInt1703 = Static66.aClass2_Sub4_Sub1_2.method896();
					Static26.anInt630 = Static66.aClass2_Sub4_Sub1_2.method896();
					Static6.anInt186 = Static66.aClass2_Sub4_Sub1_2.method933();
				}
				if (Static26.anInt631 == 10) {
					Static16.anInt2224 = Static66.aClass2_Sub4_Sub1_2.method896();
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 181) {
				Static38.aBoolean36 = true;
				Static94.anInt2138 = Static66.aClass2_Sub4_Sub1_2.method933();
				Static30.anInt748 = Static66.aClass2_Sub4_Sub1_2.method933();
				Static3.anInt106 = Static66.aClass2_Sub4_Sub1_2.method896();
				Static1.anInt10 = Static66.aClass2_Sub4_Sub1_2.method933();
				Static68.anInt2860 = Static66.aClass2_Sub4_Sub1_2.method933();
				if (Static68.anInt2860 >= 100) {
					Static69.anInt1610 = Static94.anInt2138 * 128 + 64;
					Static130.anInt2838 = Static30.anInt748 * 128 + 64;
					Static84.anInt1818 = Static106.method1718(Static130.anInt2838, Static69.anInt1610, Static59.anInt1479) - Static3.anInt106;
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 208) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method903();
				@Pc(1621) boolean local1621 = Static66.aClass2_Sub4_Sub1_2.method923() == 1;
				local616 = Static35.method645(local335);
				if (local616.aBoolean128 != local1621) {
					local616.aBoolean128 = local1621;
					Static116.method1853(local616);
				}
				Static15.anInt365 = -1;
				return true;
			}
			@Pc(1774) int local1774;
			@Pc(1767) int local1767;
			if (Static15.anInt365 == 63) {
				Static134.anInt2946 = Static8.anInt228;
				local146 = Static66.aClass2_Sub4_Sub1_2.method907();
				if (local146 == 0L) {
					Static73.aClass2_Sub16Array1 = null;
					Static57.anInt1440 = 0;
					Static15.anInt365 = -1;
					Static111.aClass65_1056 = null;
					Static125.aClass65_1168 = null;
					return true;
				}
				local154 = Static66.aClass2_Sub4_Sub1_2.method907();
				Static111.aClass65_1056 = Static57.method1080(local154);
				Static125.aClass65_1168 = Static57.method1080(local146);
				Static128.aByte6 = Static66.aClass2_Sub4_Sub1_2.method922();
				local578 = Static66.aClass2_Sub4_Sub1_2.method933();
				if (local578 == 255) {
					Static15.anInt365 = -1;
					return true;
				}
				Static57.anInt1440 = local578;
				@Pc(1702) Class2_Sub16[] local1702 = new Class2_Sub16[100];
				for (local915 = 0; local915 < Static57.anInt1440; local915++) {
					local1702[local915] = new Class2_Sub16();
					local1702[local915].aLong100 = Static66.aClass2_Sub4_Sub1_2.method907();
					local1702[local915].aClass65_1018 = Static57.method1080(local1702[local915].aLong100);
					local1702[local915].anInt2423 = Static66.aClass2_Sub4_Sub1_2.method896();
					local1702[local915].aByte4 = Static66.aClass2_Sub4_Sub1_2.method922();
					if (Static110.aLong82 == local1702[local915].aLong100) {
						Static3.aByte1 = local1702[local915].aByte4;
					}
				}
				local1767 = Static57.anInt1440;
				while (local1767 > 0) {
					@Pc(1771) boolean local1771 = true;
					local1767--;
					for (local1774 = 0; local1774 < local1767; local1774++) {
						if (local1702[local1774].aClass65_1018.method1480(local1702[local1774 + 1].aClass65_1018) > 0) {
							local1771 = false;
							@Pc(1798) Class2_Sub16 local1798 = local1702[local1774];
							local1702[local1774] = local1702[local1774 + 1];
							local1702[local1774 + 1] = local1798;
						}
					}
					if (local1771) {
						break;
					}
				}
				Static73.aClass2_Sub16Array1 = local1702;
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 26) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method915();
				local962 = Static35.method645(local335);
				local962.anInt2790 = 3;
				local962.anInt2831 = Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.aClass9_2.method250();
				Static116.method1853(local962);
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 233) {
				Static72.anInt1648 = 0;
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 175) {
				local146 = Static66.aClass2_Sub4_Sub1_2.method907();
				local392 = Static66.aClass2_Sub4_Sub1_2.method896();
				local665 = Static66.aClass2_Sub4_Sub1_2.method933();
				@Pc(1891) Class65 local1891 = Static57.method1080(local146).method1506();
				for (local572 = 0; local572 < Static91.anInt2030; local572++) {
					if (Static93.aLongArray5[local572] == local146) {
						if (local392 != Static61.anIntArray178[local572]) {
							Static61.anIntArray178[local572] = local392;
							if (local392 > 0) {
								Static59.method1098(5, Static110.aClass65_1038, Static35.method647(new Class65[] { local1891, Static45.aClass65_495 }));
							}
							if (local392 == 0) {
								Static59.method1098(5, Static110.aClass65_1038, Static35.method647(new Class65[] { local1891, Static106.aClass65_1001 }));
							}
						}
						local1891 = null;
						Static11.anIntArray163[local572] = local665;
						break;
					}
				}
				if (local1891 != null && Static91.anInt2030 < 200) {
					Static93.aLongArray5[Static91.anInt2030] = local146;
					Static88.aClass65Array45[Static91.anInt2030] = local1891;
					Static61.anIntArray178[Static91.anInt2030] = local392;
					Static11.anIntArray163[Static91.anInt2030] = local665;
					Static91.anInt2030++;
				}
				local919 = Static91.anInt2030;
				Static59.anInt1470 = Static8.anInt228;
				while (local919 > 0) {
					@Pc(1997) boolean local1997 = true;
					local919--;
					for (local175 = 0; local175 < local919; local175++) {
						if (Static61.anIntArray178[local175] != Static17.anInt386 && Static17.anInt386 == Static61.anIntArray178[local175 + 1] || Static61.anIntArray178[local175] == 0 && Static61.anIntArray178[local175 + 1] != 0) {
							local1767 = Static61.anIntArray178[local175];
							Static61.anIntArray178[local175] = Static61.anIntArray178[local175 + 1];
							local1997 = false;
							Static61.anIntArray178[local175 + 1] = local1767;
							@Pc(2058) Class65 local2058 = Static88.aClass65Array45[local175];
							Static88.aClass65Array45[local175] = Static88.aClass65Array45[local175 + 1];
							Static88.aClass65Array45[local175 + 1] = local2058;
							@Pc(2076) long local2076 = Static93.aLongArray5[local175];
							Static93.aLongArray5[local175] = Static93.aLongArray5[local175 + 1];
							Static93.aLongArray5[local175 + 1] = local2076;
							local206 = Static11.anIntArray163[local175];
							Static11.anIntArray163[local175] = Static11.anIntArray163[local175 + 1];
							Static11.anIntArray163[local175 + 1] = local206;
						}
					}
					if (local1997) {
						break;
					}
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 8) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method903();
				local388 = Static66.aClass2_Sub4_Sub1_2.method896();
				if (local335 >= 0) {
					local616 = Static35.method645(local335);
				} else {
					local616 = null;
				}
				if (local616 != null) {
					for (local665 = 0; local665 < local616.anIntArray374.length; local665++) {
						local616.anIntArray374[local665] = 0;
						local616.anIntArray370[local665] = 0;
					}
				}
				if (local335 < -70000) {
					local388 += 32768;
				}
				Static35.method648(local388);
				local665 = Static66.aClass2_Sub4_Sub1_2.method896();
				for (local578 = 0; local578 < local665; local578++) {
					local572 = Static66.aClass2_Sub4_Sub1_2.method919();
					local915 = Static66.aClass2_Sub4_Sub1_2.method911();
					if (local915 == 255) {
						local915 = Static66.aClass2_Sub4_Sub1_2.method915();
					}
					if (local616 != null && local578 < local616.anIntArray374.length) {
						local616.anIntArray374[local578] = local572;
						local616.anIntArray370[local578] = local915;
					}
					Static90.method1511(local578, local388, local915, local572 - 1);
				}
				if (local616 != null) {
					Static116.method1853(local616);
				}
				Static72.method1243();
				Static46.anIntArray133[Static82.anInt2718++ & 0x1F] = local388 & 0x7FFF;
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 178) {
				@Pc(2276) byte local2276 = Static66.aClass2_Sub4_Sub1_2.method949();
				local388 = Static66.aClass2_Sub4_Sub1_2.method902();
				Static23.anIntArray235[local388] = local2276;
				if (Static129.anIntArray363[local388] != local2276) {
					Static129.anIntArray363[local388] = local2276;
					Static11.method916(local388);
				}
				Static128.anIntArray361[Static95.anInt2154++ & 0x1F] = local388;
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 95) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method930();
				Static107.aClass15_9 = Static28.aClass20_2.method367(local335);
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 229) {
				Static93.anInt2077 = Static66.aClass2_Sub4_Sub1_2.method919() * 30;
				Static54.anInt1346 = Static8.anInt228;
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 222) {
				Static72.method1243();
				Static100.anInt2280 = Static66.aClass2_Sub4_Sub1_2.method905();
				Static54.anInt1346 = Static8.anInt228;
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 116) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method919();
				local388 = Static66.aClass2_Sub4_Sub1_2.method927();
				local392 = Static66.aClass2_Sub4_Sub1_2.method930();
				local665 = Static66.aClass2_Sub4_Sub1_2.method919();
				@Pc(2383) Class2_Sub22 local2383 = Static35.method645(local392);
				if (local2383.anInt2829 != local665 || local335 != local2383.anInt2812 || local388 != local2383.anInt2826) {
					local2383.anInt2812 = local335;
					local2383.anInt2829 = local665;
					local2383.anInt2826 = local388;
					Static116.method1853(local2383);
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 179) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method927();
				if (local335 == 65535) {
					local335 = -1;
				}
				Static43.method742(local335);
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 20) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method944();
				local388 = Static66.aClass2_Sub4_Sub1_2.method919();
				if (local388 == 65535) {
					local388 = -1;
				}
				Static94.method1559(local388, local335);
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 45) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method896();
				Static17.anInt384 = local335;
				method1927(local335);
				Static12.method244(Static17.anInt384);
				for (local388 = 0; local388 < 100; local388++) {
					Static100.aBooleanArray16[local388] = true;
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 213) {
				Static42.anInt1050 = Static66.aClass2_Sub4_Sub1_2.method933();
				Static6.anInt187 = Static66.aClass2_Sub4_Sub1_2.method933();
				Static58.anInt1460 = Static66.aClass2_Sub4_Sub1_2.method933();
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 165) {
				Static15.anInt371 = Static66.aClass2_Sub4_Sub1_2.method933();
				Static11.anInt1317 = Static66.aClass2_Sub4_Sub1_2.method911();
				for (local335 = Static11.anInt1317; local335 < Static11.anInt1317 + 8; local335++) {
					for (local388 = Static15.anInt371; local388 < Static15.anInt371 + 8; local388++) {
						if (Static76.aClass13ArrayArrayArray1[Static59.anInt1479][local335][local388] != null) {
							Static76.aClass13ArrayArrayArray1[Static59.anInt1479][local335][local388] = null;
							Static54.method961(local335, local388);
						}
					}
				}
				for (@Pc(2584) Class2_Sub18 local2584 = (Class2_Sub18) Static23.aClass13_12.method270(); local2584 != null; local2584 = (Class2_Sub18) Static23.aClass13_12.method273()) {
					if (Static11.anInt1317 <= local2584.anInt2499 && Static11.anInt1317 + 8 > local2584.anInt2499 && Static15.anInt371 <= local2584.anInt2501 && local2584.anInt2501 < Static15.anInt371 + 8 && Static59.anInt1479 == local2584.anInt2496) {
						local2584.anInt2487 = 0;
					}
				}
				Static15.anInt365 = -1;
				return true;
			}
			@Pc(2637) Class65 local2637;
			if (Static15.anInt365 == 105) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method915();
				local2637 = Static66.aClass2_Sub4_Sub1_2.method931();
				local616 = Static35.method645(local335);
				if (!local2637.method1512(local616.aClass65_1225)) {
					local616.aClass65_1225 = local2637;
					Static116.method1853(local616);
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 234) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method927();
				Static39.method671(local335);
				Static46.anIntArray133[Static82.anInt2718++ & 0x1F] = local335 & 0x7FFF;
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 18) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method903();
				local388 = Static66.aClass2_Sub4_Sub1_2.method896();
				if (local335 < 0) {
					local616 = null;
				} else {
					local616 = Static35.method645(local335);
				}
				if (local335 < -70000) {
					local388 += 32768;
				}
				while (Static90.anInt1997 > Static66.aClass2_Sub4_Sub1_2.anInt1298) {
					local665 = Static66.aClass2_Sub4_Sub1_2.method938();
					local572 = 0;
					local578 = Static66.aClass2_Sub4_Sub1_2.method896();
					if (local578 != 0) {
						local572 = Static66.aClass2_Sub4_Sub1_2.method933();
						if (local572 == 255) {
							local572 = Static66.aClass2_Sub4_Sub1_2.method903();
						}
					}
					if (local616 != null && local665 >= 0 && local665 < local616.anIntArray374.length) {
						local616.anIntArray374[local665] = local578;
						local616.anIntArray370[local665] = local572;
					}
					Static90.method1511(local665, local388, local572, local578 - 1);
				}
				if (local616 != null) {
					Static116.method1853(local616);
				}
				Static72.method1243();
				Static46.anIntArray133[Static82.anInt2718++ & 0x1F] = local388 & 0x7FFF;
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 219) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method919();
				local388 = Static66.aClass2_Sub4_Sub1_2.method918();
				Static23.anIntArray235[local335] = local388;
				if (Static129.anIntArray363[local335] != local388) {
					Static129.anIntArray363[local335] = local388;
					Static11.method916(local335);
				}
				Static128.anIntArray361[Static95.anInt2154++ & 0x1F] = local335;
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 134) {
				Static15.anInt371 = Static66.aClass2_Sub4_Sub1_2.method899();
				Static11.anInt1317 = Static66.aClass2_Sub4_Sub1_2.method911();
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 74) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method919();
				if (local335 == 65535) {
					local335 = -1;
				}
				local388 = Static66.aClass2_Sub4_Sub1_2.method918();
				local392 = Static66.aClass2_Sub4_Sub1_2.method918();
				local567 = Static35.method645(local388);
				@Pc(2903) Class2_Sub1_Sub11 local2903;
				if (local567.aBoolean124) {
					local567.anInt2768 = local335;
					local567.anInt2811 = local392;
					local2903 = Static4.method872(local335);
					local567.anInt2812 = local2903.anInt2080;
					local567.anInt2821 = local2903.anInt2061;
					local567.anInt2826 = local2903.anInt2076;
					local567.anInt2806 = local2903.anInt2068;
					local567.anInt2809 = local2903.anInt2060;
					if (local567.anInt2787 > 0) {
						local567.anInt2826 = local567.anInt2826 * 32 / local567.anInt2787;
					}
					local567.anInt2829 = local2903.anInt2069;
					Static116.method1853(local567);
				} else if (local335 == -1) {
					Static15.anInt365 = -1;
					local567.anInt2790 = 0;
					return true;
				} else {
					local2903 = Static4.method872(local335);
					local567.anInt2831 = local335;
					local567.anInt2812 = local2903.anInt2080;
					local567.anInt2829 = local2903.anInt2069;
					local567.anInt2826 = local2903.anInt2076 * 100 / local392;
					local567.anInt2790 = 4;
					Static116.method1853(local567);
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 241) {
				Static72.method1243();
				Static84.anInt1817 = Static66.aClass2_Sub4_Sub1_2.method933();
				Static15.anInt365 = -1;
				Static54.anInt1346 = Static8.anInt228;
				return true;
			}
			if (Static15.anInt365 == 198) {
				method1928(false);
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 32) {
				Static79.anInt1739 = Static66.aClass2_Sub4_Sub1_2.method933();
				Static15.anInt365 = -1;
				Static59.anInt1470 = Static8.anInt228;
				return true;
			}
			if (Static15.anInt365 == 104) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method903();
				local388 = Static66.aClass2_Sub4_Sub1_2.method896();
				local616 = Static35.method645(local335);
				if (local616.anInt2790 != 2 || local616.anInt2831 != local388) {
					local616.anInt2790 = 2;
					local616.anInt2831 = local388;
					Static116.method1853(local616);
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 196) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method902();
				if (local335 == 65535) {
					local335 = -1;
				}
				local388 = Static66.aClass2_Sub4_Sub1_2.method915();
				local392 = Static66.aClass2_Sub4_Sub1_2.method915();
				local665 = Static66.aClass2_Sub4_Sub1_2.method902();
				if (local665 == 65535) {
					local665 = -1;
				}
				for (local578 = local335; local578 <= local665; local578++) {
					@Pc(3107) long local3107 = (long) local578 + ((long) local392 << 32);
					@Pc(3112) Class2 local3112 = Static82.aClass40_22.method851(local3107);
					if (local3112 != null) {
						local3112.method2053();
					}
					Static82.aClass40_22.method849(new Class2_Sub24(local388), local3107);
				}
				Static15.anInt365 = -1;
				return true;
			}
			@Pc(3150) Class65 local3150;
			if (Static15.anInt365 == 82) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method899();
				local388 = Static66.aClass2_Sub4_Sub1_2.method911();
				local3150 = Static66.aClass2_Sub4_Sub1_2.method931();
				if (local335 >= 1 && local335 <= 8) {
					if (local3150.method1488(Static124.aClass65_1153)) {
						local3150 = null;
					}
					Static41.aClass65Array21[local335 - 1] = local3150;
					Static54.aBooleanArray10[local335 - 1] = local388 == 0;
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 252) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method903();
				@Pc(3200) Class2_Sub7 local3200 = (Class2_Sub7) Static112.aClass40_21.method851((long) local335);
				if (local3200 != null) {
					Static13.method1866(true, local3200);
				}
				if (Static101.aClass2_Sub22_12 != null) {
					Static116.method1853(Static101.aClass2_Sub22_12);
					Static101.aClass2_Sub22_12 = null;
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 1) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method902();
				local388 = Static66.aClass2_Sub4_Sub1_2.method927();
				local392 = Static66.aClass2_Sub4_Sub1_2.method918();
				local567 = Static35.method645(local392);
				Static15.anInt365 = -1;
				local567.anInt2803 = local388 + (local335 << 16);
				return true;
			}
			if (Static15.anInt365 == 71) {
				Static49.anInt1201 = Static90.anInt1997 / 8;
				for (local335 = 0; local335 < Static49.anInt1201; local335++) {
					Static30.aLongArray1[local335] = Static66.aClass2_Sub4_Sub1_2.method907();
					Static120.aClass65Array69[local335] = Static57.method1080(Static30.aLongArray1[local335]);
				}
				Static15.anInt365 = -1;
				Static59.anInt1470 = Static8.anInt228;
				return true;
			}
			@Pc(3297) Class65 local3297;
			if (Static15.anInt365 == 118) {
				local3297 = Static66.aClass2_Sub4_Sub1_2.method931();
				@Pc(3304) Object[] local3304 = new Object[local3297.method1502() + 1];
				for (local392 = local3297.method1502() - 1; local392 >= 0; local392--) {
					if (local3297.method1510(local392) == 115) {
						local3304[local392 + 1] = Static66.aClass2_Sub4_Sub1_2.method931();
					} else {
						local3304[local392 + 1] = Integer.valueOf(Static66.aClass2_Sub4_Sub1_2.method903());
					}
				}
				local3304[0] = Integer.valueOf(Static66.aClass2_Sub4_Sub1_2.method903());
				@Pc(3358) Class2_Sub9 local3358 = new Class2_Sub9();
				local3358.anObjectArray2 = local3304;
				Static103.method1703(local3358);
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 136) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method930();
				local388 = Static66.aClass2_Sub4_Sub1_2.method927();
				local616 = Static35.method645(local335);
				if (local616.anInt2790 != 1 || local616.anInt2831 != local388) {
					local616.anInt2831 = local388;
					local616.anInt2790 = 1;
					Static116.method1853(local616);
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 246) {
				local335 = Static66.aClass2_Sub4_Sub1_2.method933();
				local388 = Static66.aClass2_Sub4_Sub1_2.method933();
				local392 = Static66.aClass2_Sub4_Sub1_2.method933();
				local665 = Static66.aClass2_Sub4_Sub1_2.method933();
				Static16.aBooleanArray15[local335] = true;
				Static71.anIntArray197[local335] = local388;
				Static97.anIntArray287[local335] = local392;
				Static73.anIntArray200[local335] = local665;
				Static28.anIntArray75[local335] = 0;
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 206) {
				Static72.method1243();
				local335 = Static66.aClass2_Sub4_Sub1_2.method930();
				local388 = Static66.aClass2_Sub4_Sub1_2.method899();
				local392 = Static66.aClass2_Sub4_Sub1_2.method911();
				Static76.anIntArray222[local388] = local335;
				Static60.anIntArray39[local388] = local392;
				Static12.anIntArray33[local388] = 1;
				for (local665 = 0; local665 < 98; local665++) {
					if (local335 >= Class70.anIntArray289[local665]) {
						Static12.anIntArray33[local388] = local665 + 2;
					}
				}
				Static52.anIntArray159[Static108.anInt2422++ & 0x1F] = local388;
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 164) {
				Static81.method1328();
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 168) {
				for (local335 = 0; local335 < Static129.anIntArray363.length; local335++) {
					if (Static23.anIntArray235[local335] != Static129.anIntArray363[local335]) {
						Static129.anIntArray363[local335] = Static23.anIntArray235[local335];
						Static11.method916(local335);
						Static128.anIntArray361[Static95.anInt2154++ & 0x1F] = local335;
					}
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 211) {
				local3297 = Static66.aClass2_Sub4_Sub1_2.method931();
				if (local3297.method1507(Static8.aClass65_98)) {
					local2637 = local3297.method1476(local3297.method1500(Static36.aClass65_382), 0);
					local154 = local2637.method1493();
					local1117 = false;
					for (local572 = 0; local572 < Static49.anInt1201; local572++) {
						if (Static30.aLongArray1[local572] == local154) {
							local1117 = true;
							break;
						}
					}
					if (!local1117 && Static98.anInt2238 == 0) {
						Static59.method1098(4, local2637, Static42.aClass65_467);
					}
				} else if (local3297.method1507(Static111.aClass65_1060)) {
					local2637 = local3297.method1476(local3297.method1500(Static36.aClass65_382), 0);
					local154 = local2637.method1493();
					local1117 = false;
					for (local572 = 0; local572 < Static49.anInt1201; local572++) {
						if (Static30.aLongArray1[local572] == local154) {
							local1117 = true;
							break;
						}
					}
					if (!local1117 && Static98.anInt2238 == 0) {
						Static59.method1098(8, local2637, Static16.aClass65_929);
					}
				} else if (local3297.method1507(Static13.aClass65_1120)) {
					local2637 = local3297.method1476(local3297.method1500(Static36.aClass65_382), 0);
					local154 = local2637.method1493();
					local1117 = false;
					for (local572 = 0; local572 < Static49.anInt1201; local572++) {
						if (Static30.aLongArray1[local572] == local154) {
							local1117 = true;
							break;
						}
					}
					if (!local1117 && Static98.anInt2238 == 0) {
						@Pc(3881) Class65 local3881 = local3297.method1476(local3297.method1502() - 9, local3297.method1500(Static36.aClass65_382) + 1);
						Static59.method1098(8, local2637, local3881);
					}
				} else if (local3297.method1507(Static133.aClass65_1266)) {
					local1117 = false;
					local2637 = local3297.method1476(local3297.method1500(Static36.aClass65_382), 0);
					local154 = local2637.method1493();
					for (local572 = 0; local572 < Static49.anInt1201; local572++) {
						if (Static30.aLongArray1[local572] == local154) {
							local1117 = true;
							break;
						}
					}
					if (!local1117 && Static98.anInt2238 == 0) {
						Static59.method1098(10, local2637, Static110.aClass65_1038);
					}
				} else if (local3297.method1507(Static93.aClass65_879)) {
					local2637 = local3297.method1476(local3297.method1500(Static93.aClass65_879), 0);
					Static59.method1098(11, Static110.aClass65_1038, local2637);
				} else if (local3297.method1507(Static6.aClass65_79)) {
					local2637 = local3297.method1476(local3297.method1500(Static6.aClass65_79), 0);
					if (Static98.anInt2238 == 0) {
						Static59.method1098(12, Static110.aClass65_1038, local2637);
					}
				} else if (local3297.method1507(Static20.aClass65_251)) {
					local2637 = local3297.method1476(local3297.method1500(Static20.aClass65_251), 0);
					if (Static98.anInt2238 == 0) {
						Static59.method1098(13, Static110.aClass65_1038, local2637);
					}
				} else {
					Static59.method1098(0, Static110.aClass65_1038, local3297);
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 29) {
				Static15.anInt371 = Static66.aClass2_Sub4_Sub1_2.method923();
				Static11.anInt1317 = Static66.aClass2_Sub4_Sub1_2.method923();
				while (Static90.anInt1997 > Static66.aClass2_Sub4_Sub1_2.anInt1298) {
					Static15.anInt365 = Static66.aClass2_Sub4_Sub1_2.method933();
					Static122.method1885();
				}
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 130) {
				local146 = Static66.aClass2_Sub4_Sub1_2.method907();
				local3150 = Static55.method2091(Static117.method1859(Static66.aClass2_Sub4_Sub1_2).method1487());
				Static59.method1098(6, Static57.method1080(local146).method1506(), local3150);
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 56) {
				Static62.method1120();
				Static15.anInt365 = -1;
				return true;
			}
			if (Static15.anInt365 == 42) {
				local146 = Static66.aClass2_Sub4_Sub1_2.method907();
				local154 = Static66.aClass2_Sub4_Sub1_2.method896();
				local159 = Static66.aClass2_Sub4_Sub1_2.method940();
				@Pc(3982) long local3982 = (local154 << 32) + local159;
				local915 = Static66.aClass2_Sub4_Sub1_2.method933();
				@Pc(3988) boolean local3988 = false;
				for (local1774 = 0; local1774 < 100; local1774++) {
					if (Static75.aLongArray6[local1774] == local3982) {
						local3988 = true;
						break;
					}
				}
				if (local915 <= 1) {
					for (@Pc(4011) int local4011 = 0; local4011 < Static49.anInt1201; local4011++) {
						if (Static30.aLongArray1[local4011] == local146) {
							local3988 = true;
							break;
						}
					}
				}
				if (!local3988 && Static98.anInt2238 == 0) {
					Static75.aLongArray6[Static127.anInt2721] = local3982;
					Static127.anInt2721 = (Static127.anInt2721 + 1) % 100;
					@Pc(4056) Class65 local4056 = Static55.method2091(Static117.method1859(Static66.aClass2_Sub4_Sub1_2).method1487());
					if (local915 == 2 || local915 == 3) {
						Static59.method1098(7, Static35.method647(new Class65[] { Static14.aClass65_128, Static57.method1080(local146).method1506() }), local4056);
					} else if (local915 == 1) {
						Static59.method1098(7, Static35.method647(new Class65[] { Static66.aClass65_675, Static57.method1080(local146).method1506() }), local4056);
					} else {
						Static59.method1098(3, Static57.method1080(local146).method1506(), local4056);
					}
				}
				Static15.anInt365 = -1;
				return true;
			}
			Static93.method1535("T1 - " + Static15.anInt365 + "," + Static133.anInt2905 + "," + Static44.anInt1075 + " - " + Static90.anInt1997, null);
			Static54.method952();
		} catch (@Pc(4148) IOException local4148) {
			Static13.method1865();
		} catch (@Pc(4152) Exception local4152) {
			@Pc(4193) String local4193 = "T2 - " + Static15.anInt365 + "," + Static133.anInt2905 + "," + Static44.anInt1075 + " - " + Static90.anInt1997 + "," + (Static34.anInt791 + Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0]) + "," + (Static66.anInt1577 + Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0]) + " - ";
			for (local388 = 0; Static90.anInt1997 > local388 && local388 < 50; local388++) {
				local4193 = local4193 + Static66.aClass2_Sub4_Sub1_2.aByteArray20[local388] + ",";
			}
			Static93.method1535(local4193, local4152);
			Static54.method952();
		}
		return true;
	}
}
