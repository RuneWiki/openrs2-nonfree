import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "F")
	public static float aFloat266;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "J")
	public static long aLong253;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "Z")
	public static boolean aBoolean807;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
	public static void method8000() {
		Static174.aClass33_7.xa(((float) Static552.aClass3_Sub48_30.aClass23_Sub3_1.method1150() * 0.1F + 0.7F) * Static42.aFloat16);
		Static174.aClass33_7.ZA(Static565.anInt9605, aFloat266, Static216.aFloat151, (float) (Static37.anInt703 << 2), (float) (Static353.anInt6904 << 2), (float) (Static630.anInt10395 << 2));
		Static174.aClass33_7.method6219(Static459.aClass4_11);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "([[[BIZZI[I[IIIBI[II[IIII[I)V")
	public static void method8002(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte arg8, @OriginalArg(11) int[] arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int[] arg11, @OriginalArg(14) int arg12, @OriginalArg(15) int arg13, @OriginalArg(16) int arg14, @OriginalArg(17) int[] arg15) {
		if (Static178.anInt4220 == -1) {
			return;
		}
		@Pc(12) int[] local12 = Static67.aClass33_5.Y();
		@Pc(16) int local16 = local12[0];
		@Pc(20) int local20 = local12[1];
		@Pc(24) int local24 = local12[2];
		@Pc(28) int local28 = local12[3];
		@Pc(30) int local30 = local24;
		@Pc(32) int local32 = local28;
		if (Static178.anInt4220 == 1) {
			local30 = (int) ((double) Static33.anInt611 * (double) local24 / (double) Static211.anInt4905);
			local32 = (int) ((double) local28 * (double) Static33.anInt611 / (double) Static211.anInt4905);
		}
		if (!Static160.aBoolean330) {
			if (Static178.anInt4220 == 1) {
				Static52.method1179();
			}
			@Pc(71) int local71 = arg6 - Static26.anInt452;
			@Pc(76) int local76 = arg13 - Static520.anInt9062;
			@Pc(81) int local81 = arg7 - Static241.anInt5456;
			@Pc(103) int local103 = (int) ((double) local30 * (Static585.aDouble64 * (double) local81 + Static434.aDouble48 * (double) local76 + Static201.aDouble29 * (double) local71) / (double) arg14);
			@Pc(125) int local125 = (int) ((Static489.aDouble55 * (double) local81 + Static92.aDouble9 * (double) local71 + Static594.aDouble62 * (double) local76) * (double) local32 / (double) arg14);
			@Pc(140) double local140 = (double) local71 * Static363.aDouble40 + (double) local76 * Static482.aDouble54 + (double) local81 * Static248.aDouble33;
			@Pc(147) int local147 = Static293.anInt5936 + local103 - Static548.anInt9368;
			@Pc(153) int local153 = local125 + Static156.anInt3814 - Static632.anInt10408;
			@Pc(158) int local158 = local147 + Static448.anInt8136;
			@Pc(162) int local162 = Static33.anInt611 + local153;
			if (local147 >= 0 && local153 >= 0 && Static273.anInt5828 >= local158 && Static211.anInt4905 >= local162 || Static178.anInt4220 == 2) {
				if (Static178.anInt4220 == 2) {
					Static452.aDouble50 = -local140;
				}
				Static640.anInt10507 = local147;
				Static613.anInt10162 = local153;
			} else if (local158 > 0 && local162 > 0 && Static273.anInt5828 > local147 && local153 < Static211.anInt4905) {
				@Pc(218) int local218 = local147 - Static293.anInt5936;
				@Pc(223) int local223 = local153 - Static156.anInt3814;
				@Pc(225) int local225 = 0;
				@Pc(227) int local227 = 0;
				@Pc(229) int local229 = 0;
				@Pc(231) int local231 = 0;
				@Pc(233) double local233 = 0.0D;
				if (Static178.anInt4220 == 0) {
					local233 = Static452.aDouble50 + local140;
					local225 = local218;
					local227 = local223;
				} else if (Static178.anInt4220 == 1) {
					local229 = local218 / Static246.anInt5504;
					local231 = local223 / Static584.anInt9762;
					local227 = Static584.anInt9762 * local231;
					local225 = Static246.anInt5504 * local229;
					local233 = (Static452.aDouble50 + local140) * (double) (local225 * local218 - -(local223 * local227)) / (double) (local218 * local218 + local223 * local223);
				}
				local233 = -local233;
				@Pc(295) int local295 = 0;
				@Pc(297) int local297 = 0;
				@Pc(299) int local299 = 0;
				@Pc(301) int local301 = 0;
				@Pc(303) int local303 = 0;
				@Pc(305) int local305 = 0;
				@Pc(313) int local313;
				@Pc(317) int local317;
				@Pc(319) int local319;
				@Pc(329) int local329;
				if (local225 < 0) {
					local313 = -local225;
					local317 = Static273.anInt5828 + local225;
					local319 = 0;
					if (Static178.anInt4220 == 1) {
						local303 = -local229;
						local299 = 0;
					}
					local329 = local313;
				} else {
					local317 = Static273.anInt5828 - local225;
					local313 = 0;
					local319 = local317;
					if (Static178.anInt4220 == 1) {
						local299 = Static87.anInt2288 - local229;
						local303 = local229;
					}
					local329 = local225;
				}
				@Pc(357) int local357;
				@Pc(361) int local361;
				@Pc(363) int local363;
				@Pc(365) int local365;
				@Pc(385) int local385;
				if (local227 < 0) {
					local357 = -local227;
					local361 = Static211.anInt4905 + local227;
					local363 = 0;
					local365 = local357;
					if (Static178.anInt4220 == 1) {
						local297 = -local231;
						local295 = 0;
						local305 = local231 + Static158.anInt3847;
						local301 = local297;
					}
					local385 = local357;
				} else {
					local361 = Static211.anInt4905 - local227;
					local357 = 0;
					local385 = 0;
					if (Static178.anInt4220 == 1) {
						local295 = Static158.anInt3847 - local231;
						local301 = 0;
						local297 = local231;
						local305 = local295;
					}
					local365 = local227;
					local363 = local361;
				}
				@Pc(420) Class375 local420 = Static250.aClass70_1.aClass375_3;
				@Pc(434) int local434;
				for (@Pc(425) Class2_Sub6 local425 = (Class2_Sub6) local420.method8638(); local425 != null; local425 = (Class2_Sub6) local420.method8635()) {
					@Pc(430) Class2_Sub5[] local430 = local425.aClass2_Sub5Array1;
					@Pc(432) boolean local432 = true;
					for (local434 = 0; local434 < local430.length; local434++) {
						@Pc(440) Class2_Sub5 local440 = local430[local434];
						@Pc(443) int local443 = local440.anInt3617;
						@Pc(446) int local446 = local440.anInt3613;
						@Pc(449) int local449 = local440.anInt3615;
						@Pc(452) int local452 = local440.anInt3614;
						@Pc(458) int local458;
						local440.anInt3617 = local458 = local443 - local225;
						@Pc(462) int local462 = local440.anInt3616;
						@Pc(469) int local469;
						local440.anInt3615 = local469 = local449 - local225;
						@Pc(476) int local476;
						local440.anInt3613 = local476 = local446 - local227;
						@Pc(484) int local484;
						local440.anInt3614 = local484 = local452 - local227;
						if (local432) {
							@Pc(500) int local500 = (local469 > local458 ? local458 : local469) - local462;
							if (local500 <= Static273.anInt5828) {
								@Pc(517) int local517 = (local476 >= local484 ? local484 : local476) - local462;
								if (Static211.anInt4905 >= local517) {
									@Pc(533) int local533 = (local458 >= local469 ? local458 : local469) + local462;
									if (local533 >= 0) {
										@Pc(552) int local552 = (local476 >= local484 ? local476 : local484) + local462;
										if (local552 >= 0) {
											local432 = false;
										}
									}
								}
							}
						}
					}
					if (local432) {
						local425.method8558();
						Static295.method5066(local425);
					}
				}
				if (Static178.anInt4220 == 0) {
					Static67.aClass33_5.method6194(Static470.anInterface16_4);
				}
				Static67.aClass33_5.F(-local225, -local227);
				Static67.aClass33_5.b(local313, local357, local317, local361, local233);
				Static257.method4824(Static452.aDouble50 + local233);
				Static99.aDouble12 = Static452.aDouble50 + local233;
				if (Static178.anInt4220 == 1) {
					Static175.anInt4148 = local20 - local227 - Static632.anInt10408;
					Static231.anInt5229 = local32;
					Static392.anInt7445 = local30;
					Static165.anInt3961 = local16 - local225 - Static548.anInt9368;
					Static67.aClass33_5.DA(Static165.anInt3961, Static175.anInt4148, Static392.anInt7445, Static231.anInt5229);
				} else {
					Static392.anInt7445 = local30;
					Static231.anInt5229 = local32;
					Static175.anInt4148 = Static156.anInt3814 + local20 - Static632.anInt10408 - local227;
					Static165.anInt3961 = Static293.anInt5936 + local16 - local225 - Static548.anInt9368;
					Static67.aClass33_5.DA(Static165.anInt3961, Static175.anInt4148, Static392.anInt7445, Static231.anInt5229);
				}
				Static290.method5004(Static250.aClass70_1);
				if (local365 > 0) {
					Static67.aClass33_5.KA(0, local363, Static273.anInt5828, local363 + local365);
					Static67.aClass33_5.ya();
					Static67.aClass33_5.GA(Static400.anInt7630);
					Static184.method3727(arg10, arg6, arg13, arg7, arg0, arg9, arg5, arg11, arg15, arg4, arg3, arg8, arg1, arg12, arg2, arg14, 1, false);
				}
				if (local329 > 0) {
					Static67.aClass33_5.KA(local319, local385, local319 + local329, local385 + local361);
					Static67.aClass33_5.ya();
					Static67.aClass33_5.GA(Static400.anInt7630);
					Static184.method3727(arg10, arg6, arg13, arg7, arg0, arg9, arg5, arg11, arg15, arg4, arg3, arg8, arg1, arg12, arg2, arg14, 1, false);
				}
				Static67.aClass33_5.la();
				Static468.method6980();
				if (Static178.anInt4220 == 0) {
					Static67.aClass33_5.method6178();
				}
				Static632.anInt10408 += local227;
				Static452.aDouble50 += local233;
				Static548.anInt9368 += local225;
				Static613.anInt10162 = Static156.anInt3814 + local125 - Static632.anInt10408;
				Static640.anInt10507 = Static293.anInt5936 + local103 - Static548.anInt9368;
				if (Static178.anInt4220 == 1) {
					Static164.anInt8855 += local231;
					Static43.anInt770 += local229;
					for (@Pc(791) int local791 = 0; local791 < Static158.anInt3847; local791++) {
						@Pc(802) int local802 = Static133.method3090(Static158.anInt3847, local791 + Static164.anInt8855) * Static87.anInt2288;
						for (local434 = 0; local434 < Static87.anInt2288; local434++) {
							@Pc(815) int local815 = local802 + Static133.method3090(Static87.anInt2288, Static43.anInt770 + local434);
							@Pc(864) boolean local864 = local791 >= local295 && local791 < local297 + local295 || local791 >= local301 && local301 + local305 > local791 && local434 >= local299 && local299 + local303 > local434;
							Static235.anInterface16Array1[local815].method8389(local434 * Static246.anInt5504, local791 * Static584.anInt9762, Static246.anInt5504, Static584.anInt9762, local864);
						}
					}
				}
			} else {
				Static160.aBoolean330 = true;
			}
		}
		if (Static160.aBoolean330) {
			Static632.anInt10408 = 0;
			Static613.anInt10162 = Static156.anInt3814;
			Static640.anInt10507 = Static293.anInt5936;
			Static26.anInt452 = arg6;
			Static241.anInt5456 = arg7;
			Static520.anInt9062 = arg13;
			Static452.aDouble50 = 0.0D;
			Static548.anInt9368 = 0;
			if (Static178.anInt4220 == 0) {
				Static67.aClass33_5.method6194(Static470.anInterface16_4);
			}
			Static67.aClass33_5.la();
			Static67.aClass33_5.ya();
			Static67.aClass33_5.GA(Static400.anInt7630);
			Static449.aClass47_8.method7860(Static26.anInt452, Static520.anInt9062, Static241.anInt5456, Static134.anInt3477, Static556.anInt9465, Static5.anInt62);
			Static67.aClass33_5.method6233(Static449.aClass47_8);
			if (Static178.anInt4220 == 1) {
				Static175.anInt4148 = local20;
				Static165.anInt3961 = local16;
				Static392.anInt7445 = local30;
				Static231.anInt5229 = local32;
				Static67.aClass33_5.DA(Static165.anInt3961, Static175.anInt4148, Static392.anInt7445, Static231.anInt5229);
			} else {
				Static231.anInt5229 = local32;
				Static165.anInt3961 = local16 + Static293.anInt5936;
				Static175.anInt4148 = local20 + Static156.anInt3814;
				Static392.anInt7445 = local30;
				Static67.aClass33_5.DA(Static165.anInt3961, Static175.anInt4148, Static392.anInt7445, Static231.anInt5229);
			}
			Static99.aDouble12 = 0.0D;
			Static250.aClass70_1.method2571();
			Static290.method5004(Static250.aClass70_1);
			Static184.method3727(arg10, arg6, arg13, arg7, arg0, arg9, arg5, arg11, arg15, arg4, arg3, arg8, arg1, arg12, arg2, arg14, 1, false);
			Static468.method6980();
			Static160.aBoolean330 = false;
			if (Static178.anInt4220 == 0) {
				Static67.aClass33_5.method6178();
			}
			if (Static178.anInt4220 == 1) {
				Static585.method8330();
			}
		}
		if (Static178.anInt4220 == 0) {
			Static470.anInterface16_4.method8388(Static640.anInt10507, Static613.anInt10162, Static448.anInt8136, Static33.anInt611, 0, 0);
		}
		Static451.anInt8203++;
		Static257.method4824(Static452.aDouble50);
		Static69.aDouble8 = Static452.aDouble50;
		if (Static178.anInt4220 == 0 || Static178.anInt4220 == 2) {
			if (Static178.anInt4220 == 2) {
				Static67.aClass33_5.GA(Static400.anInt7630);
				Static67.aClass33_5.ya();
			}
			Static414.anInt7736 = local16 + Static293.anInt5936 - Static640.anInt10507 - Static548.anInt9368;
			Static260.anInt5721 = Static156.anInt3814 + local20 - Static632.anInt10408 - Static613.anInt10162;
			Static502.anInt8865 = local32;
			Static379.anInt7212 = local30;
			Static67.aClass33_5.DA(Static414.anInt7736, Static260.anInt5721, Static379.anInt7212, Static502.anInt8865);
		} else if (Static178.anInt4220 == 1) {
			Static414.anInt7736 = local16 - Static548.anInt9368;
			Static502.anInt8865 = local32;
			Static379.anInt7212 = local30;
			Static260.anInt5721 = local20 - Static632.anInt10408;
			Static67.aClass33_5.DA(Static414.anInt7736, Static260.anInt5721, Static379.anInt7212, Static502.anInt8865);
			Static67.aClass33_5.KA(Static640.anInt10507, Static613.anInt10162, Static640.anInt10507 + Static448.anInt8136, Static33.anInt611 + Static613.anInt10162);
		}
		Static184.method3727(arg10, arg6, arg13, arg7, arg0, arg9, arg5, arg11, arg15, arg4, arg3, arg8, arg1, arg12, arg2, arg14, Static178.anInt4220 == 2 ? 0 : 2, Static178.anInt4220 == 1);
		Static67.aClass33_5.la();
		Static67.aClass33_5.DA(local16, local20, local24, local28);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZJ)V")
	public static void method8004(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static89.anInt2312;
		@Pc(15) int local15;
		@Pc(23) int local23;
		if (local7 != Static242.anInt5467) {
			local15 = local7 - Static242.anInt5467;
			local23 = (int) ((long) local15 * arg0 / 320L);
			if (local15 > 0) {
				if (local23 == 0) {
					local23 = 1;
				} else if (local15 < local23) {
					local23 = local15;
				}
			} else if (local23 == 0) {
				local23 = -1;
			} else if (local15 > local23) {
				local23 = local15;
			}
			Static242.anInt5467 += local23;
		}
		@Pc(65) int local65 = Static149.anInt3681;
		Static103.aFloat96 += (float) arg0 * Static550.aFloat251 / 40.0F * 8.0F;
		if (local65 != Static77.anInt3996) {
			local15 = local65 - Static77.anInt3996;
			local23 = (int) ((long) local15 * arg0 / 320L);
			if (local15 > 0) {
				if (local23 == 0) {
					local23 = 1;
				} else if (local15 < local23) {
					local23 = local15;
				}
			} else if (local23 == 0) {
				local23 = -1;
			} else if (local23 < local15) {
				local23 = local15;
			}
			Static77.anInt3996 += local23;
		}
		Static502.aFloat230 += (float) arg0 * Static611.aFloat276 / 40.0F * 8.0F;
		Static522.method7469();
	}
}
