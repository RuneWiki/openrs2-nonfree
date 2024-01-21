import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "Lclient!be;")
	public static Class8 aClass8_1;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "Lclient!mc;")
	private static Class42 aClass42_382 = method501("Loaded interfaces");

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Lclient!mc;")
	public static Class42 aClass42_376 = aClass42_382;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!mc;")
	private static Class42 aClass42_379 = method501("Loaded fonts");

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!mc;")
	public static Class42 aClass42_377 = aClass42_379;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Lclient!mc;")
	public static Class42 aClass42_378 = method501("Ausw-=hlen");

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "Lclient!mc;")
	public static Class42 aClass42_380 = method501("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "Lclient!mc;")
	public static Class42 aClass42_381 = method501("Angreifen");

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!mc;")
	public static Class42 method501(@OriginalArg(1) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(11) int local11 = 0;
		@Pc(15) Class42 local15 = new Class42();
		local15.aByteArray17 = new byte[local9];
		while (local9 > local11) {
			@Pc(27) int local27 = local6[local11++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local11 >= local9) {
					break;
				}
				@Pc(49) int local49 = local6[local11++] & 0xFF;
				local15.aByteArray17[local15.anInt1468++] = (byte) (local49 + (local27 + -40) * 43 - 48);
			} else if (local27 != 0) {
				local15.aByteArray17[local15.anInt1468++] = (byte) local27;
			}
		}
		local15.method1056();
		return local15.method1029();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method502() {
		aClass42_377 = null;
		aClass42_378 = null;
		aClass42_379 = null;
		aClass42_381 = null;
		aClass42_380 = null;
		aClass8_1 = null;
		aClass42_382 = null;
		aClass42_376 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)I")
	public static int method503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([BI)V")
	public static void method504(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub8 local4 = new Class1_Sub8(arg0);
		local4.anInt1692 = arg0.length - 2;
		Static3.anInt118 = local4.method1199();
		Static36.anIntArray124 = new int[Static3.anInt118];
		Static29.anIntArray98 = new int[Static3.anInt118];
		Static83.anIntArray340 = new int[Static3.anInt118];
		Static98.aByteArrayArray10 = new byte[Static3.anInt118][];
		Static39.anIntArray37 = new int[Static3.anInt118];
		local4.anInt1692 = arg0.length - Static3.anInt118 * 8 - 7;
		Static108.anInt2749 = local4.method1199();
		Static45.anInt1859 = local4.method1199();
		@Pc(65) int local65 = (local4.method1186() & 0xFF) + 1;
		for (@Pc(67) int local67 = 0; local67 < Static3.anInt118; local67++) {
			Static39.anIntArray37[local67] = local4.method1199();
		}
		for (@Pc(84) int local84 = 0; local84 < Static3.anInt118; local84++) {
			Static36.anIntArray124[local84] = local4.method1199();
		}
		for (@Pc(101) int local101 = 0; local101 < Static3.anInt118; local101++) {
			Static83.anIntArray340[local101] = local4.method1199();
		}
		for (@Pc(114) int local114 = 0; local114 < Static3.anInt118; local114++) {
			Static29.anIntArray98[local114] = local4.method1199();
		}
		local4.anInt1692 = arg0.length + 3 - Static3.anInt118 * 8 - local65 * 3 - 7;
		Static69.anIntArray243 = new int[local65];
		for (@Pc(152) int local152 = 1; local152 < local65; local152++) {
			Static69.anIntArray243[local152] = local4.method1202();
			if (Static69.anIntArray243[local152] == 0) {
				Static69.anIntArray243[local152] = 1;
			}
		}
		local4.anInt1692 = 0;
		for (@Pc(179) int local179 = 0; local179 < Static3.anInt118; local179++) {
			@Pc(184) int local184 = Static83.anIntArray340[local179];
			@Pc(188) int local188 = Static29.anIntArray98[local179];
			@Pc(192) int local192 = local188 * local184;
			@Pc(195) byte[] local195 = new byte[local192];
			Static98.aByteArrayArray10[local179] = local195;
			@Pc(203) int local203 = local4.method1186();
			@Pc(213) int local213;
			if (local203 == 0) {
				for (local213 = 0; local213 < local192; local213++) {
					local195[local213] = local4.method1209();
				}
			} else if (local203 == 1) {
				for (local213 = 0; local213 < local184; local213++) {
					for (@Pc(216) int local216 = 0; local216 < local188; local216++) {
						local195[local213 + local184 * local216] = local4.method1209();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!qc;)Z")
	public static boolean method505(@OriginalArg(1) Class1_Sub1_Sub12 arg0) {
		if (arg0.anIntArray333 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray333.length; local17++) {
			@Pc(26) int local26 = Static67.method1150(arg0, local17);
			@Pc(31) int local31 = arg0.anIntArray329[local17];
			if (arg0.anIntArray333[local17] == 2) {
				if (local26 >= local31) {
					return false;
				}
			} else if (arg0.anIntArray333[local17] == 3) {
				if (local26 <= local31) {
					return false;
				}
			} else if (arg0.anIntArray333[local17] == 4) {
				if (local31 == local26) {
					return false;
				}
			} else if (local26 != local31) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ka;Lclient!vb;IZ)V")
	public static void method506(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class1_Sub4 local9 = new Class1_Sub4();
		local9.anInt810 = arg0.method1186();
		local9.anInt812 = arg0.method1188();
		local9.anIntArray95 = new int[local9.anInt810];
		local9.aByteArrayArrayArray3 = new byte[local9.anInt810][][];
		local9.aClass59Array1 = new Class59[local9.anInt810];
		local9.anIntArray93 = new int[local9.anInt810];
		local9.aClass59Array2 = new Class59[local9.anInt810];
		local9.anIntArray96 = new int[local9.anInt810];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt810; local51++) {
			try {
				@Pc(57) int local57 = arg0.method1186();
				@Pc(76) String local76;
				@Pc(87) String local87;
				@Pc(78) int local78;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local76 = new String(arg0.method1201().method1042());
					local78 = 0;
					local87 = new String(arg0.method1201().method1042());
					if (local57 == 1) {
						local78 = arg0.method1188();
					}
					local9.anIntArray93[local51] = local57;
					local9.anIntArray95[local51] = local78;
					local9.aClass59Array1[local51] = arg1.method1814(Static109.method1854(local76), local87);
				} else if (local57 == 3 || local57 == 4) {
					local76 = new String(arg0.method1201().method1042());
					local87 = new String(arg0.method1201().method1042());
					local78 = arg0.method1186();
					@Pc(154) String[] local154 = new String[local78];
					for (@Pc(156) int local156 = 0; local156 < local78; local156++) {
						local154[local156] = new String(arg0.method1201().method1042());
					}
					@Pc(180) byte[][] local180 = new byte[local78][];
					@Pc(193) int local193;
					if (local57 == 3) {
						for (@Pc(187) int local187 = 0; local187 < local78; local187++) {
							local193 = arg0.method1188();
							local180[local187] = new byte[local193];
							arg0.method1217(local180[local187], local193);
						}
					}
					@Pc(217) Class[] local217 = new Class[local78];
					local9.anIntArray93[local51] = local57;
					for (local193 = 0; local193 < local78; local193++) {
						local217[local193] = Static109.method1854(local154[local193]);
					}
					local9.aClass59Array2[local51] = arg1.method1811(local217, Static109.method1854(local76), local87);
					local9.aByteArrayArrayArray3[local51] = local180;
				}
			} catch (@Pc(257) ClassNotFoundException local257) {
				local9.anIntArray96[local51] = -1;
			} catch (@Pc(264) SecurityException local264) {
				local9.anIntArray96[local51] = -2;
			} catch (@Pc(271) NullPointerException local271) {
				local9.anIntArray96[local51] = -3;
			} catch (@Pc(278) Exception local278) {
				local9.anIntArray96[local51] = -4;
			} catch (@Pc(285) Throwable local285) {
				local9.anIntArray96[local51] = -5;
			}
		}
		Static48.aClass22_9.method512(local9);
	}
}
