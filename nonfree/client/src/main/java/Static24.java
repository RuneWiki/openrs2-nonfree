import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
	public static int anInt658;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "Lclient!ta;")
	public static Class36_Sub1 aClass36_Sub1_6;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Lclient!ec;")
	public static Class2_Sub1_Sub6 aClass2_Sub1_Sub6_1 = new Class2_Sub1_Sub6();

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "Lclient!ke;")
	private static Class39 aClass39_321 = Static2.method66("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "Lclient!ke;")
	public static Class39 aClass39_318 = aClass39_321;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "[I")
	public static int[] anIntArray73 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
	public static int anInt657 = 0;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "Lclient!ke;")
	public static Class39 aClass39_319 = Static2.method66("Handel akzeptieren");

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "Lclient!ke;")
	private static Class39 aClass39_320 = Static2.method66("Username: ");

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	public static int anInt664 = 0;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "Lclient!ke;")
	public static Class39 aClass39_322 = aClass39_320;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
	public static void method487() {
		aClass39_321 = null;
		aClass39_322 = null;
		aClass36_Sub1_6 = null;
		aClass39_320 = null;
		anIntArray73 = null;
		aClass2_Sub1_Sub6_1 = null;
		aClass39_318 = null;
		aClass39_319 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IJ)Lclient!ke;")
	public static Class39 method488(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) long local29 = arg0; local29 != 0L; local29 /= 37L) {
				local27++;
			}
			@Pc(44) byte[] local44 = new byte[local27];
			while (arg0 != 0L) {
				@Pc(47) long local47 = arg0;
				arg0 /= 37L;
				local27--;
				local44[local27] = Static48.aByteArray11[(int) (local47 - arg0 * 37L)];
			}
			@Pc(79) Class39 local79 = new Class39();
			local79.aByteArray13 = local44;
			local79.anInt1601 = local44.length;
			return local79;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public static void method489() {
		Static10.anInt250 = 0;
		@Pc(156) int local156;
		for (@Pc(17) int local17 = -1; local17 < Static61.anInt1740 + Static95.anInt2510; local17++) {
			@Pc(34) Class2_Sub1_Sub2_Sub3 local34;
			if (local17 == -1) {
				local34 = Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1;
			} else if (local17 >= Static61.anInt1740) {
				local34 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[Static50.anIntArray193[local17 - Static61.anInt1740]];
			} else {
				local34 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[Static7.anIntArray21[local17]];
			}
			if (local34 != null && local34.method2067()) {
				@Pc(61) Class2_Sub1_Sub8 local61;
				if (local34 instanceof Class2_Sub1_Sub2_Sub3_Sub2) {
					local61 = ((Class2_Sub1_Sub2_Sub3_Sub2) local34).aClass2_Sub1_Sub8_1;
					if (local61.anIntArray190 != null) {
						local61 = local61.method941();
					}
					if (local61 == null) {
						continue;
					}
				}
				if (local17 >= Static61.anInt1740) {
					local61 = ((Class2_Sub1_Sub2_Sub3_Sub2) local34).aClass2_Sub1_Sub8_1;
					if (local61.anInt1372 >= 0 && local61.anInt1372 < Static40.aClass2_Sub1_Sub4_Sub2Array5.length) {
						Static109.method2081(local34, local34.anInt2911 + 15);
						if (Static73.anInt2080 > -1) {
							Static40.aClass2_Sub1_Sub4_Sub2Array5[local61.anInt1372].method1040(Static73.anInt2080 - 12, Static9.anInt196 + -30);
						}
					}
					if (Static7.anInt151 == 1 && Static47.anInt1324 == Static50.anIntArray193[local17 - Static61.anInt1740] && Static64.anInt1889 % 20 < 10) {
						Static109.method2081(local34, local34.anInt2911 + 15);
						if (Static73.anInt2080 > -1) {
							Static76.aClass2_Sub1_Sub4_Sub2Array7[0].method1040(Static73.anInt2080 - 12, Static9.anInt196 + -28);
						}
					}
				} else {
					@Pc(154) Class2_Sub1_Sub2_Sub3_Sub1 local154 = (Class2_Sub1_Sub2_Sub3_Sub1) local34;
					local156 = 30;
					if (local154.anInt2629 != -1 || local154.anInt2616 != -1) {
						Static109.method2081(local34, local34.anInt2911 + 15);
						if (Static73.anInt2080 > -1) {
							if (local154.anInt2629 != -1) {
								Static29.aClass2_Sub1_Sub4_Sub2Array4[local154.anInt2629].method1040(Static73.anInt2080 - 12, Static9.anInt196 + -30);
								local156 += 25;
							}
							if (local154.anInt2616 != -1) {
								Static40.aClass2_Sub1_Sub4_Sub2Array5[local154.anInt2616].method1040(Static73.anInt2080 - 12, Static9.anInt196 + -local156);
								local156 += 25;
							}
						}
					}
					if (local17 >= 0 && Static7.anInt151 == 10 && Static7.anIntArray21[local17] == Static82.anInt2220) {
						Static109.method2081(local34, local34.anInt2911 + 15);
						if (Static73.anInt2080 > -1) {
							Static76.aClass2_Sub1_Sub4_Sub2Array7[1].method1040(Static73.anInt2080 - 12, -local156 + Static9.anInt196);
						}
					}
				}
				if (local34.aClass39_1312 != null && (Static61.anInt1740 <= local17 || Static6.anInt2870 == 0 || Static6.anInt2870 == 3 || Static6.anInt2870 == 1 && Static35.method2069(((Class2_Sub1_Sub2_Sub3_Sub1) local34).aClass39_1182))) {
					Static109.method2081(local34, local34.anInt2911);
					if (Static73.anInt2080 > -1 && Static78.anInt2152 > Static10.anInt250) {
						Static78.anIntArray282[Static10.anInt250] = Static25.aClass2_Sub1_Sub4_Sub1_1.method241(local34.aClass39_1312) / 2;
						Static78.anIntArray279[Static10.anInt250] = Static25.aClass2_Sub1_Sub4_Sub1_1.anInt306;
						Static78.anIntArray284[Static10.anInt250] = Static73.anInt2080;
						Static78.anIntArray280[Static10.anInt250] = Static9.anInt196;
						Static78.anIntArray283[Static10.anInt250] = local34.anInt2914;
						Static78.anIntArray285[Static10.anInt250] = local34.anInt2913;
						Static78.anIntArray281[Static10.anInt250] = local34.anInt2921;
						Static78.aClass39Array13[Static10.anInt250] = local34.aClass39_1312;
						Static10.anInt250++;
					}
				}
				if (local34.anInt2940 > Static64.anInt1889) {
					Static109.method2081(local34, local34.anInt2911 + 15);
					if (Static73.anInt2080 > -1) {
						local156 = local34.anInt2890 * 30 / local34.anInt2936;
						if (local156 > 30) {
							local156 = 30;
						}
						Static91.method2013(Static73.anInt2080 - 15, Static9.anInt196 + -3, local156, 5, 65280);
						Static91.method2013(local156 + Static73.anInt2080 - 15, Static9.anInt196 + -3, 30 - local156, 5, 16711680);
					}
				}
				for (local156 = 0; local156 < 4; local156++) {
					if (local34.anIntArray365[local156] > Static64.anInt1889) {
						Static109.method2081(local34, local34.anInt2911 / 2);
						if (Static73.anInt2080 > -1) {
							if (local156 == 1) {
								Static9.anInt196 -= 20;
							}
							if (local156 == 2) {
								Static9.anInt196 -= 10;
								Static73.anInt2080 -= 15;
							}
							if (local156 == 3) {
								Static9.anInt196 -= 10;
								Static73.anInt2080 += 15;
							}
							Static87.aClass2_Sub1_Sub4_Sub2Array9[local34.anIntArray364[local156]].method1040(Static73.anInt2080 - 12, Static9.anInt196 + -12);
							Static97.aClass2_Sub1_Sub4_Sub1_3.method244(Static31.method1267(local34.anIntArray366[local156]), Static73.anInt2080, Static9.anInt196 + 4, 0);
							Static97.aClass2_Sub1_Sub4_Sub1_3.method244(Static31.method1267(local34.anIntArray366[local156]), Static73.anInt2080 - 1, Static9.anInt196 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(490) int local490 = 0; local490 < Static10.anInt250; local490++) {
			local156 = Static78.anIntArray284[local490];
			@Pc(500) int local500 = Static78.anIntArray280[local490];
			@Pc(502) boolean local502 = true;
			@Pc(506) int local506 = Static78.anIntArray279[local490];
			@Pc(510) int local510 = Static78.anIntArray282[local490];
			while (local502) {
				local502 = false;
				for (@Pc(516) int local516 = 0; local516 < local490; local516++) {
					if (Static78.anIntArray280[local516] - Static78.anIntArray279[local516] < local500 + 2 && local500 - local506 < Static78.anIntArray280[local516] + 2 && Static78.anIntArray284[local516] + Static78.anIntArray282[local516] > local156 - local510 && Static78.anIntArray284[local516] - Static78.anIntArray282[local516] < local510 + local156 && local500 > Static78.anIntArray280[local516] - Static78.anIntArray279[local516]) {
						local502 = true;
						local500 = Static78.anIntArray280[local516] - Static78.anIntArray279[local516];
					}
				}
			}
			Static73.anInt2080 = Static78.anIntArray284[local490];
			Static9.anInt196 = Static78.anIntArray280[local490] = local500;
			@Pc(615) Class39 local615 = Static78.aClass39Array13[local490];
			if (Static69.anInt2011 == 0) {
				@Pc(619) int local619 = 16776960;
				if (Static78.anIntArray283[local490] < 6) {
					local619 = Static83.anIntArray296[Static78.anIntArray283[local490]];
				}
				if (Static78.anIntArray283[local490] == 6) {
					local619 = Static94.anInt2479 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static78.anIntArray283[local490] == 7) {
					local619 = Static94.anInt2479 % 20 >= 10 ? 65535 : 255;
				}
				if (Static78.anIntArray283[local490] == 8) {
					local619 = Static94.anInt2479 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(688) int local688;
				if (Static78.anIntArray283[local490] == 9) {
					local688 = 150 - Static78.anIntArray281[local490];
					if (local688 < 50) {
						local619 = local688 * 1280 + 16711680;
					} else if (local688 < 100) {
						local619 = 16776960 + 16384000 - local688 * 327680;
					} else if (local688 < 150) {
						local619 = (local688 - 100) * 5 + 65280;
					}
				}
				if (Static78.anIntArray283[local490] == 10) {
					local688 = 150 - Static78.anIntArray281[local490];
					if (local688 < 50) {
						local619 = local688 * 5 + 16711680;
					} else if (local688 < 100) {
						local619 = 16384000 + 16711935 - local688 * 327680;
					} else if (local688 < 150) {
						local619 = local688 * 327680 - (local688 - 100) * 5 - 32767745;
					}
				}
				if (Static78.anIntArray283[local490] == 11) {
					local688 = 150 - Static78.anIntArray281[local490];
					if (local688 < 50) {
						local619 = 16777215 - local688 * 327685;
					} else if (local688 < 100) {
						local619 = (local688 - 50) * 327685 + 65280;
					} else if (local688 < 150) {
						local619 = 16777215 - (local688 - 100) * 327680;
					}
				}
				if (Static78.anIntArray285[local490] == 0) {
					Static25.aClass2_Sub1_Sub4_Sub1_1.method244(local615, Static73.anInt2080, Static9.anInt196 + 1, 0);
					Static25.aClass2_Sub1_Sub4_Sub1_1.method244(local615, Static73.anInt2080, Static9.anInt196, local619);
				}
				if (Static78.anIntArray285[local490] == 1) {
					Static25.aClass2_Sub1_Sub4_Sub1_1.method232(local615, Static73.anInt2080, Static9.anInt196 + 1, 0, Static94.anInt2479);
					Static25.aClass2_Sub1_Sub4_Sub1_1.method232(local615, Static73.anInt2080, Static9.anInt196, local619, Static94.anInt2479);
				}
				if (Static78.anIntArray285[local490] == 2) {
					Static25.aClass2_Sub1_Sub4_Sub1_1.method242(local615, Static73.anInt2080, Static9.anInt196 + 1, 0, Static94.anInt2479);
					Static25.aClass2_Sub1_Sub4_Sub1_1.method242(local615, Static73.anInt2080, Static9.anInt196, local619, Static94.anInt2479);
				}
				if (Static78.anIntArray285[local490] == 3) {
					Static25.aClass2_Sub1_Sub4_Sub1_1.method243(local615, Static73.anInt2080, Static9.anInt196 + 1, 0, Static94.anInt2479, 150 - Static78.anIntArray281[local490]);
					Static25.aClass2_Sub1_Sub4_Sub1_1.method243(local615, Static73.anInt2080, Static9.anInt196, local619, Static94.anInt2479, 150 - Static78.anIntArray281[local490]);
				}
				@Pc(948) int local948;
				if (Static78.anIntArray285[local490] == 4) {
					local688 = Static25.aClass2_Sub1_Sub4_Sub1_1.method241(local615);
					local948 = (150 - Static78.anIntArray281[local490]) * (local688 + 100) / 150;
					Static91.method2014(Static73.anInt2080 - 50, 0, Static73.anInt2080 + 50, 334);
					Static25.aClass2_Sub1_Sub4_Sub1_1.method234(local615, Static73.anInt2080 + 50 - local948, Static9.anInt196 + 1, 0);
					Static25.aClass2_Sub1_Sub4_Sub1_1.method234(local615, Static73.anInt2080 + 50 - local948, Static9.anInt196, local619);
					Static91.method2009();
				}
				if (Static78.anIntArray285[local490] == 5) {
					local688 = 150 - Static78.anIntArray281[local490];
					Static91.method2014(0, Static9.anInt196 - Static25.aClass2_Sub1_Sub4_Sub1_1.anInt306 - 1, 512, Static9.anInt196 + 5);
					local948 = 0;
					if (local688 < 25) {
						local948 = local688 - 25;
					} else if (local688 > 125) {
						local948 = local688 - 125;
					}
					Static25.aClass2_Sub1_Sub4_Sub1_1.method244(local615, Static73.anInt2080, Static9.anInt196 + local948 + 1, 0);
					Static25.aClass2_Sub1_Sub4_Sub1_1.method244(local615, Static73.anInt2080, local948 + Static9.anInt196, local619);
					Static91.method2009();
				}
			} else {
				Static25.aClass2_Sub1_Sub4_Sub1_1.method244(local615, Static73.anInt2080, Static9.anInt196 + 1, 0);
				Static25.aClass2_Sub1_Sub4_Sub1_1.method244(local615, Static73.anInt2080, Static9.anInt196, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!kb;BI)V")
	public static void method490(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub4_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg2 * arg2 + arg0 * arg0;
		if (local11 <= 4225 || local11 >= 90000) {
			Static72.method1483(arg0, arg1, arg2);
			return;
		}
		@Pc(31) int local31 = Static101.anInt2748 + Static94.anInt2489 & 0x7FF;
		@Pc(35) int local35 = Static32.anIntArray122[local31];
		@Pc(39) int local39 = Static32.anIntArray129[local31];
		@Pc(47) int local47 = local35 * 256 / (Static63.anInt1865 + 256);
		@Pc(55) int local55 = local39 * 256 / (Static63.anInt1865 + 256);
		@Pc(66) int local66 = arg2 * local55 - arg0 * local47 >> 16;
		@Pc(76) int local76 = arg0 * local55 + local47 * arg2 >> 16;
		@Pc(82) double local82 = Math.atan2((double) local76, (double) local66);
		@Pc(88) int local88 = (int) (Math.sin(local82) * 63.0D);
		@Pc(94) int local94 = (int) (Math.cos(local82) * 57.0D);
		Static35.aClass2_Sub1_Sub4_Sub2_8.method1049(local88 + 94 - 6, 63 - local94, local82);
	}
}
