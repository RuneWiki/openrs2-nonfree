import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "[J")
	public static final long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	public static int anInt5229 = -1;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZB)Ljava/lang/String;")
	public static String method4273(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static378.method6003(arg0);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V")
	public static void method4274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class8_Sub5_Sub8 local8 = Static509.method7344(5, arg1);
		local8.method3509();
		local8.anInt4321 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIII[II[[[BBI[IZZ[III[I[I)V")
	public static void method4277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) boolean arg11, @OriginalArg(13) int[] arg12, @OriginalArg(15) int arg13, @OriginalArg(16) int[] arg14, @OriginalArg(17) int[] arg15) {
		if (Static105.anInt2774 == -1) {
			return;
		}
		@Pc(18) int[] local18 = Static580.aClass16_10.Y();
		@Pc(22) int local22 = local18[0];
		@Pc(26) int local26 = local18[1];
		@Pc(30) int local30 = local18[2];
		@Pc(34) int local34 = local18[3];
		@Pc(36) int local36 = local30;
		@Pc(38) int local38 = local34;
		if (Static105.anInt2774 == 1) {
			local36 = (int) ((double) local30 * (double) Static553.anInt9617 / (double) Static494.anInt8752);
			local38 = (int) ((double) local34 * (double) Static553.anInt9617 / (double) Static494.anInt8752);
		}
		if (!Static147.aBoolean271) {
			if (Static105.anInt2774 == 1) {
				Static212.method4047();
			}
			@Pc(75) int local75 = arg0 - Static496.anInt8768;
			@Pc(79) int local79 = arg6 - Static529.anInt9137;
			@Pc(84) int local84 = arg1 - Static18.anInt874;
			@Pc(106) int local106 = (int) ((double) local36 * (Static180.aDouble9 * (double) local84 + Static618.aDouble29 * (double) local75 + (double) local79 * Static583.aDouble27) / (double) arg2);
			@Pc(128) int local128 = (int) ((double) local38 * (Static399.aDouble14 * (double) local84 + (double) local75 * Static328.aDouble25 + Static17.aDouble1 * (double) local79) / (double) arg2);
			@Pc(143) double local143 = Static67.aDouble2 * (double) local84 + (double) local79 * Static592.aDouble28 + (double) local75 * Static256.aDouble8;
			@Pc(150) int local150 = local106 + Static389.anInt7547 - Static349.anInt6742;
			@Pc(158) int local158 = Static1.anInt10287 + local128 - Static221.anInt5061;
			@Pc(162) int local162 = local150 + Static371.anInt7077;
			@Pc(166) int local166 = local158 + Static553.anInt9617;
			if (local150 >= 0 && local158 >= 0 && local162 <= Static100.anInt2662 && local166 <= Static494.anInt8752 || Static105.anInt2774 == 2) {
				if (Static105.anInt2774 == 2) {
					Static321.aDouble12 = -local143;
				}
				Static384.anInt7465 = local150;
				Static58.anInt1883 = local158;
			} else if (local162 > 0 && local166 > 0 && local150 < Static100.anInt2662 && Static494.anInt8752 > local158) {
				@Pc(221) int local221 = local150 - Static389.anInt7547;
				@Pc(226) int local226 = local158 - Static1.anInt10287;
				@Pc(228) int local228 = 0;
				@Pc(230) int local230 = 0;
				@Pc(232) int local232 = 0;
				@Pc(234) int local234 = 0;
				@Pc(236) double local236 = 0.0D;
				if (Static105.anInt2774 == 0) {
					local228 = local221;
					local236 = local143 + Static321.aDouble12;
					local230 = local226;
				} else if (Static105.anInt2774 == 1) {
					local232 = local221 / Static266.anInt5676;
					local234 = local226 / Static332.anInt6574;
					local228 = local232 * Static266.anInt5676;
					local230 = Static332.anInt6574 * local234;
					local236 = (double) (local228 * local221 + local230 * local226) * (Static321.aDouble12 + local143) / (double) (local226 * local226 + local221 * local221);
				}
				local236 = -local236;
				@Pc(296) int local296 = 0;
				@Pc(298) int local298 = 0;
				@Pc(300) int local300 = 0;
				@Pc(302) int local302 = 0;
				@Pc(304) int local304 = 0;
				@Pc(315) int local315;
				@Pc(312) int local312;
				@Pc(308) int local308;
				@Pc(325) int local325;
				if (local228 < 0) {
					local308 = 0;
					local312 = Static100.anInt2662 + local228;
					local315 = -local228;
					if (Static105.anInt2774 == 1) {
						local300 = 0;
						local304 = -local232;
					}
					local325 = local315;
				} else {
					local312 = Static100.anInt2662 - local228;
					local315 = 0;
					if (Static105.anInt2774 == 1) {
						local304 = local232;
						local300 = Static362.anInt6930 - local232;
					}
					local325 = local228;
					local308 = local312;
				}
				@Pc(349) int local349 = 0;
				@Pc(356) int local356;
				@Pc(361) int local361;
				@Pc(363) int local363;
				@Pc(367) int local367;
				@Pc(365) int local365;
				if (local230 >= 0) {
					local356 = 0;
					local361 = Static494.anInt8752 - local230;
					local363 = local361;
					local365 = 0;
					local367 = local230;
					if (Static105.anInt2774 == 1) {
						local298 = local234;
						local302 = 0;
						local296 = Static121.anInt3161 - local234;
						local349 = local296;
					}
				} else {
					local361 = Static494.anInt8752 + local230;
					local356 = -local230;
					local363 = 0;
					local367 = local356;
					if (Static105.anInt2774 == 1) {
						local296 = 0;
						local298 = -local234;
						local349 = Static121.anInt3161 + local234;
						local302 = local298;
					}
					local365 = local356;
				}
				@Pc(418) Class123 local418 = Static644.aClass194_6.aClass123_8;
				@Pc(432) int local432;
				for (@Pc(423) Class15_Sub7 local423 = (Class15_Sub7) local418.method3537(); local423 != null; local423 = (Class15_Sub7) local418.method3541()) {
					@Pc(428) Class15_Sub6[] local428 = local423.aClass15_Sub6Array1;
					@Pc(430) boolean local430 = true;
					for (local432 = 0; local432 < local428.length; local432++) {
						@Pc(438) Class15_Sub6 local438 = local428[local432];
						@Pc(441) int local441 = local438.anInt5263;
						@Pc(444) int local444 = local438.anInt5265;
						@Pc(447) int local447 = local438.anInt5262;
						@Pc(450) int local450 = local438.anInt5266;
						@Pc(453) int local453 = local438.anInt5264;
						@Pc(459) int local459;
						local438.anInt5262 = local459 = local447 - local228;
						@Pc(467) int local467;
						local438.anInt5266 = local467 = local450 - local230;
						@Pc(475) int local475;
						local438.anInt5263 = local475 = local441 - local228;
						@Pc(483) int local483;
						local438.anInt5265 = local483 = local444 - local230;
						if (local430) {
							@Pc(496) int local496 = (local475 >= local459 ? local459 : local475) - local453;
							if (Static100.anInt2662 >= local496) {
								@Pc(513) int local513 = (local467 > local483 ? local483 : local467) - local453;
								if (local513 <= Static494.anInt8752) {
									@Pc(525) int local525 = (local459 <= local475 ? local475 : local459) + local453;
									if (local525 >= 0) {
										@Pc(537) int local537 = (local483 >= local467 ? local483 : local467) + local453;
										if (local537 >= 0) {
											local430 = false;
										}
									}
								}
							}
						}
					}
					if (local430) {
						local423.method8314();
						Static513.method7386(local423);
					}
				}
				if (Static105.anInt2774 == 0) {
					Static580.aClass16_10.method6078(Static271.anInterface11_1);
				}
				Static580.aClass16_10.F(-local228, -local230);
				Static580.aClass16_10.b(local315, local356, local312, local361, local236);
				Static111.method2525(local236 + Static321.aDouble12);
				Static532.aDouble16 = Static321.aDouble12 + local236;
				if (Static105.anInt2774 == 1) {
					Static624.anInt10423 = local38;
					Static598.anInt2010 = local22 - Static349.anInt6742 - local228;
					Static263.anInt5639 = local36;
					Static18.anInt873 = local26 - local230 - Static221.anInt5061;
					Static580.aClass16_10.DA(Static598.anInt2010, Static18.anInt873, Static263.anInt5639, Static624.anInt10423);
				} else {
					Static18.anInt873 = local26 + Static1.anInt10287 - local230 - Static221.anInt5061;
					Static598.anInt2010 = Static389.anInt7547 + local22 - Static349.anInt6742 - local228;
					Static263.anInt5639 = local36;
					Static624.anInt10423 = local38;
					Static580.aClass16_10.DA(Static598.anInt2010, Static18.anInt873, Static263.anInt5639, Static624.anInt10423);
				}
				Static271.method4664(Static644.aClass194_6);
				if (local367 > 0) {
					Static580.aClass16_10.KA(0, local363, Static100.anInt2662, local367 + local363);
					Static580.aClass16_10.ya();
					Static580.aClass16_10.GA(Static185.anInt4348);
					Static382.method6145(arg9, arg0, arg6, arg1, arg7, arg14, arg5, arg12, arg10, arg15, arg4, arg8, arg3, arg13, arg11, arg2, 1, false);
				}
				if (local325 > 0) {
					Static580.aClass16_10.KA(local308, local365, local308 + local325, local361 + local365);
					Static580.aClass16_10.ya();
					Static580.aClass16_10.GA(Static185.anInt4348);
					Static382.method6145(arg9, arg0, arg6, arg1, arg7, arg14, arg5, arg12, arg10, arg15, arg4, arg8, arg3, arg13, arg11, arg2, 1, false);
				}
				Static580.aClass16_10.la();
				Static127.method2818();
				if (Static105.anInt2774 == 0) {
					Static580.aClass16_10.method6128();
				}
				Static321.aDouble12 += local236;
				Static349.anInt6742 += local228;
				Static221.anInt5061 += local230;
				Static384.anInt7465 = local106 + Static389.anInt7547 - Static349.anInt6742;
				Static58.anInt1883 = local128 + Static1.anInt10287 - Static221.anInt5061;
				if (Static105.anInt2774 == 1) {
					Static384.anInt7468 += local232;
					Static104.anInt2768 += local234;
					for (@Pc(782) int local782 = 0; local782 < Static121.anInt3161; local782++) {
						@Pc(793) int local793 = Static196.method3669(Static121.anInt3161, Static104.anInt2768 + local782) * Static362.anInt6930;
						for (local432 = 0; local432 < Static362.anInt6930; local432++) {
							@Pc(806) int local806 = local793 + Static196.method3669(Static362.anInt6930, Static384.anInt7468 + local432);
							@Pc(847) boolean local847 = local782 >= local296 && local296 + local298 > local782 || local782 >= local302 && local782 < local302 + local349 && local300 <= local432 && local300 + local304 > local432;
							Static596.anInterface11Array1[local806].method8359(local432 * Static266.anInt5676, local782 * Static332.anInt6574, Static266.anInt5676, Static332.anInt6574, local847);
						}
					}
				}
			} else {
				Static147.aBoolean271 = true;
			}
		}
		if (Static147.aBoolean271) {
			Static58.anInt1883 = Static1.anInt10287;
			Static221.anInt5061 = 0;
			Static496.anInt8768 = arg0;
			Static384.anInt7465 = Static389.anInt7547;
			Static321.aDouble12 = 0.0D;
			Static529.anInt9137 = arg6;
			Static18.anInt874 = arg1;
			Static349.anInt6742 = 0;
			if (Static105.anInt2774 == 0) {
				Static580.aClass16_10.method6078(Static271.anInterface11_1);
			}
			Static580.aClass16_10.la();
			Static580.aClass16_10.ya();
			Static580.aClass16_10.GA(Static185.anInt4348);
			Static114.aClass54_2.method5127(Static496.anInt8768, Static529.anInt9137, Static18.anInt874, Static64.anInt2000, Static354.anInt6830, Static153.anInt3786);
			Static580.aClass16_10.method6066(Static114.aClass54_2);
			if (Static105.anInt2774 == 1) {
				Static624.anInt10423 = local38;
				Static263.anInt5639 = local36;
				Static598.anInt2010 = local22;
				Static18.anInt873 = local26;
				Static580.aClass16_10.DA(Static598.anInt2010, Static18.anInt873, Static263.anInt5639, Static624.anInt10423);
			} else {
				Static18.anInt873 = local26 + Static1.anInt10287;
				Static263.anInt5639 = local36;
				Static598.anInt2010 = Static389.anInt7547 + local22;
				Static624.anInt10423 = local38;
				Static580.aClass16_10.DA(Static598.anInt2010, Static18.anInt873, Static263.anInt5639, Static624.anInt10423);
			}
			Static532.aDouble16 = 0.0D;
			Static644.aClass194_6.method5081();
			Static271.method4664(Static644.aClass194_6);
			Static382.method6145(arg9, arg0, arg6, arg1, arg7, arg14, arg5, arg12, arg10, arg15, arg4, arg8, arg3, arg13, arg11, arg2, 1, false);
			Static127.method2818();
			Static147.aBoolean271 = false;
			if (Static105.anInt2774 == 0) {
				Static580.aClass16_10.method6128();
			}
			if (Static105.anInt2774 == 1) {
				Static199.method3715();
			}
		}
		if (Static105.anInt2774 == 0) {
			Static271.anInterface11_1.method8360(Static384.anInt7465, Static58.anInt1883, Static371.anInt7077, Static553.anInt9617, 0, 0);
		}
		Static480.anInt8593++;
		Static111.method2525(Static321.aDouble12);
		Static88.aDouble3 = Static321.aDouble12;
		if (Static105.anInt2774 == 0 || Static105.anInt2774 == 2) {
			if (Static105.anInt2774 == 2) {
				Static580.aClass16_10.GA(Static185.anInt4348);
				Static580.aClass16_10.ya();
			}
			Static53.anInt1807 = Static389.anInt7547 + local22 - Static349.anInt6742 - Static384.anInt7465;
			Static307.anInt6235 = local38;
			Static260.anInt5585 = local26 + Static1.anInt10287 - Static58.anInt1883 - Static221.anInt5061;
			Static545.anInt9345 = local36;
			Static580.aClass16_10.DA(Static53.anInt1807, Static260.anInt5585, Static545.anInt9345, Static307.anInt6235);
		} else if (Static105.anInt2774 == 1) {
			Static545.anInt9345 = local36;
			Static53.anInt1807 = local22 - Static349.anInt6742;
			Static260.anInt5585 = local26 - Static221.anInt5061;
			Static307.anInt6235 = local38;
			Static580.aClass16_10.DA(Static53.anInt1807, Static260.anInt5585, Static545.anInt9345, Static307.anInt6235);
			Static580.aClass16_10.KA(Static384.anInt7465, Static58.anInt1883, Static371.anInt7077 + Static384.anInt7465, Static553.anInt9617 + Static58.anInt1883);
		}
		Static382.method6145(arg9, arg0, arg6, arg1, arg7, arg14, arg5, arg12, arg10, arg15, arg4, arg8, arg3, arg13, arg11, arg2, Static105.anInt2774 == 2 ? 0 : 2, Static105.anInt2774 == 1);
		Static580.aClass16_10.la();
		Static580.aClass16_10.DA(local22, local26, local30, local34);
	}
}
