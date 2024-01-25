import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
	public static int anInt3156 = 0;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_70 = new Class56(20, 2);

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "Z")
	public static boolean aBoolean254 = false;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "Lclient!bda;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "Z")
	public static boolean aBoolean255 = false;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2848(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(17) Class3_Sub42 local17 = Static591.method7910(Static9.aClass199_3, Static198.aClass303_42);
			local17.aClass3_Sub11_Sub1_1.method5213(Static325.method4707(arg0));
			local17.aClass3_Sub11_Sub1_1.method5227(arg0);
			Static511.method6885(local17);
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V")
	public static void method2850() {
		if (Static35.anInt636 > 1) {
			Static330.anInt5543 = Static109.anInt2171;
			Static35.anInt636--;
		}
		if (Static165.aBoolean259) {
			Static165.aBoolean259 = false;
			Static58.method1205();
			return;
		}
		if (!aBoolean254) {
			Static302.method4445();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static324.method4689(); local27++) {
		}
		if (Static32.anInt602 != 10) {
			return;
		}
		@Pc(49) Class3_Sub42 local49;
		@Pc(58) int local58;
		while (Static129.method2609()) {
			local49 = Static591.method7910(Static9.aClass199_3, Static432.aClass303_76);
			local49.aClass3_Sub11_Sub1_1.method5213(0);
			local58 = local49.aClass3_Sub11_Sub1_1.anInt6128;
			Static243.method3774(local49.aClass3_Sub11_Sub1_1);
			local49.aClass3_Sub11_Sub1_1.method5197(local49.aClass3_Sub11_Sub1_1.anInt6128 - local58);
			Static511.method6885(local49);
		}
		if (Static81.aClass3_Sub38_1 == null) {
			if (Static330.aLong152 <= Static158.method2936()) {
				Static81.aClass3_Sub38_1 = Static194.aClass290_1.method6414(Static221.aClass51_1.aString8);
			}
		} else if (Static81.aClass3_Sub38_1.anInt6787 != -1) {
			local49 = Static591.method7910(Static9.aClass199_3, Static265.aClass303_53);
			local49.aClass3_Sub11_Sub1_1.method5200(Static81.aClass3_Sub38_1.anInt6787);
			Static511.method6885(local49);
			Static81.aClass3_Sub38_1 = null;
			Static330.aLong152 = Static158.method2936() + 30000L;
		}
		@Pc(124) Class3_Sub1 local124 = (Class3_Sub1) Static68.aClass112_15.method3088();
		@Pc(137) int local137;
		@Pc(162) int local162;
		@Pc(179) int local179;
		@Pc(233) int local233;
		@Pc(239) int local239;
		@Pc(251) int local251;
		@Pc(135) Class3_Sub42 local135;
		if (local124 != null || Static158.method2936() - 2000L > Static156.aLong87) {
			local135 = null;
			local137 = 0;
			for (@Pc(142) Class3_Sub1 local142 = (Class3_Sub1) Static134.aClass112_21.method3088(); local142 != null && (local135 == null || local135.aClass3_Sub11_Sub1_1.anInt6128 - local137 < 240); local142 = (Class3_Sub1) Static134.aClass112_21.method3084()) {
				local142.method7825();
				local162 = local142.method5711();
				if (local162 < -1) {
					local162 = -1;
				} else if (local162 > 65534) {
					local162 = 65534;
				}
				local179 = local142.method5713();
				if (local179 < -1) {
					local179 = -1;
				} else if (local179 > 65534) {
					local179 = 65534;
				}
				if (local179 != Static588.anInt7286 || Static247.anInt4357 != local162) {
					if (local135 == null) {
						local135 = Static591.method7910(Static9.aClass199_3, Static52.aClass303_16);
						local135.aClass3_Sub11_Sub1_1.method5213(0);
						local137 = local135.aClass3_Sub11_Sub1_1.anInt6128;
					}
					local233 = local179 - Static588.anInt7286;
					Static588.anInt7286 = local179;
					local239 = local162 - Static247.anInt4357;
					Static247.anInt4357 = local162;
					local251 = (int) ((local142.method5709() - Static156.aLong87) / 20L);
					if (local251 < 8 && local233 >= -32 && local233 <= 31 && local239 >= -32 && local239 <= 31) {
						local239 += 32;
						local233 += 32;
						local135.aClass3_Sub11_Sub1_1.method5200(local239 + (local251 << 12) + (local233 << 6));
					} else if (local251 < 32 && local233 >= -128 && local233 <= 127 && local239 >= -128 && local239 <= 127) {
						local239 += 128;
						local233 += 128;
						local135.aClass3_Sub11_Sub1_1.method5213(local251 + 128);
						local135.aClass3_Sub11_Sub1_1.method5200(local239 + (local233 << 8));
					} else if (local251 >= 32) {
						local135.aClass3_Sub11_Sub1_1.method5200(local251 + 57344);
						if (local179 == 1 || local162 == -1) {
							local135.aClass3_Sub11_Sub1_1.method5215(Integer.MIN_VALUE);
						} else {
							local135.aClass3_Sub11_Sub1_1.method5215(local179 | local162 << 16);
						}
					} else {
						local135.aClass3_Sub11_Sub1_1.method5213(local251 + 192);
						if (local179 == 1 || local162 == -1) {
							local135.aClass3_Sub11_Sub1_1.method5215(Integer.MIN_VALUE);
						} else {
							local135.aClass3_Sub11_Sub1_1.method5215(local162 << 16 | local179);
						}
					}
					Static156.aLong87 = local142.method5709();
				}
			}
			if (local135 != null) {
				local135.aClass3_Sub11_Sub1_1.method5197(local135.aClass3_Sub11_Sub1_1.anInt6128 - local137);
				Static511.method6885(local135);
			}
		}
		@Pc(449) int local449;
		if (local124 != null) {
			@Pc(433) long local433 = (local124.method5709() - Static203.aLong146) / 50L;
			Static203.aLong146 = local124.method5709();
			if (local433 > 32767L) {
				local433 = 32767L;
			}
			local449 = local124.method5711();
			if (local449 < 0) {
				local449 = 0;
			} else if (local449 > 65535) {
				local449 = 65535;
			}
			local162 = local124.method5713();
			if (local162 < 0) {
				local162 = 0;
			} else if (local162 > 65535) {
				local162 = 65535;
			}
			@Pc(477) byte local477 = 0;
			if (local124.method5714() == 2) {
				local477 = 1;
			}
			local233 = (int) local433;
			@Pc(498) Class3_Sub42 local498 = Static591.method7910(Static9.aClass199_3, Static148.aClass303_38);
			local498.aClass3_Sub11_Sub1_1.method5215(local162 | local449 << 16);
			local498.aClass3_Sub11_Sub1_1.method5167(local477 << 15 | local233);
			Static511.method6885(local498);
		}
		if (Static222.anInt3930 > 0) {
			local135 = Static591.method7910(Static9.aClass199_3, Static264.aClass303_52);
			local135.aClass3_Sub11_Sub1_1.method5213(Static222.anInt3930 * 3);
			for (local137 = 0; local137 < Static222.anInt3930; local137++) {
				@Pc(548) Interface7 local548 = Static463.anInterface7Array2[local137];
				@Pc(556) long local556 = (local548.method3369() - Static580.aLong272) / 50L;
				Static580.aLong272 = local548.method3369();
				if (local556 > 65535L) {
					local556 = 65535L;
				}
				local135.aClass3_Sub11_Sub1_1.method5213(local548.method3368());
				local135.aClass3_Sub11_Sub1_1.method5200((int) local556);
			}
			Static511.method6885(local135);
		}
		if (Static133.anInt2910 > 0) {
			Static133.anInt2910--;
		}
		if (Static115.aBoolean505 && Static133.anInt2910 <= 0) {
			Static115.aBoolean505 = false;
			Static133.anInt2910 = 20;
			local135 = Static591.method7910(Static9.aClass199_3, Static54.aClass303_17);
			local135.aClass3_Sub11_Sub1_1.method5201((int) Static126.aFloat84 >> 3);
			local135.aClass3_Sub11_Sub1_1.method5201((int) Static43.aFloat20 >> 3);
			Static511.method6885(local135);
		}
		if (Static301.aBoolean389 != Static95.aBoolean162) {
			Static95.aBoolean162 = Static301.aBoolean389;
			local135 = Static591.method7910(Static9.aClass199_3, Static459.aClass303_81);
			local135.aClass3_Sub11_Sub1_1.method5213(Static301.aBoolean389 ? 1 : 0);
			Static511.method6885(local135);
		}
		if (!Static206.aBoolean283) {
			local135 = Static591.method7910(Static9.aClass199_3, Static495.aClass303_89);
			local135.aClass3_Sub11_Sub1_1.method5213(0);
			local137 = local135.aClass3_Sub11_Sub1_1.anInt6128;
			@Pc(691) Class3_Sub11 local691 = new Class3_Sub11(Static134.method2624());
			Static405.aClass3_Sub3_Sub1_1.method6302(local691);
			local135.aClass3_Sub11_Sub1_1.method5184(local691.aByteArray62, local691.anInt6128);
			local135.aClass3_Sub11_Sub1_1.method5197(local135.aClass3_Sub11_Sub1_1.anInt6128 - local137);
			Static511.method6885(local135);
			Static206.aBoolean283 = true;
		}
		if (Static309.aClass299ArrayArrayArray3 != null) {
			if (Static379.anInt6482 == 2) {
				Static492.method6663();
			} else if (Static379.anInt6482 == 3) {
				Static344.method5091();
			}
		}
		if (Static246.aBoolean325) {
			Static246.aBoolean325 = false;
		} else {
			Static63.aFloat30 /= 2.0F;
		}
		if (aBoolean255) {
			aBoolean255 = false;
		} else {
			Static311.aFloat117 /= 2.0F;
		}
		Static69.method1493();
		if (Static32.anInt602 != 10) {
			return;
		}
		Static79.method5529();
		Static279.method7835();
		Static552.method7305();
		Static566.anInt9223++;
		if (Static566.anInt9223 > 750) {
			Static58.method1205();
			return;
		}
		Static546.method7277();
		Static288.method4269();
		Static378.method5532();
		for (local58 = Static491.aClass318_1.method6742(true); local58 != -1; local58 = Static491.aClass318_1.method6742(false)) {
			Static124.method7261(local58);
			Static310.anIntArray294[Static321.anInt5440++ & 0x1F] = local58;
		}
		@Pc(884) Class361 local884;
		for (@Pc(817) Class3_Sub7_Sub18 local817 = Static430.method6072(); local817 != null; local817 = Static430.method6072()) {
			local449 = local817.method7330();
			local162 = local817.method7328();
			if (local449 == 1) {
				Static468.anIntArray497[local162] = local817.anInt8802;
				Static11.aBoolean7 |= Static351.aBooleanArray21[local162];
				Static339.anIntArray318[Static566.anInt9217++ & 0x1F] = local162;
			} else if (local449 == 2) {
				Static137.aStringArray11[local162] = local817.aString82;
				Static9.anIntArray239[Static592.anInt9687++ & 0x1F] = local162;
			} else if (local449 == 3) {
				local884 = Static265.method4040(local162);
				if (!local817.aString82.equals(local884.aString100)) {
					local884.aString100 = local817.aString82;
					Static186.method3170(local884);
				}
			} else if (local449 == 4) {
				local884 = Static265.method4040(local162);
				local233 = local817.anInt8802;
				local239 = local817.anInt8806;
				local251 = local817.anInt8798;
				if (local233 != local884.anInt9582 || local884.anInt9628 != local239 || local884.anInt9629 != local251) {
					local884.anInt9628 = local239;
					local884.anInt9582 = local233;
					local884.anInt9629 = local251;
					Static186.method3170(local884);
				}
			} else if (local449 == 5) {
				local884 = Static265.method4040(local162);
				if (local817.anInt8802 != local884.lb || local817.anInt8802 == -1) {
					local884.anInt9644 = 0;
					local884.anInt9664 = 1;
					local884.lb = local817.anInt8802;
					local884.anInt9596 = 0;
					@Pc(1372) Class185 local1372 = local884.lb == -1 ? null : Static545.aClass240_2.method5680(local884.lb);
					if (local1372 != null) {
						Static407.method5864(local1372, local884.anInt9644);
					}
					Static186.method3170(local884);
				}
			} else if (local449 == 6) {
				local179 = local817.anInt8802;
				local233 = local179 >> 10 & 0x1F;
				local239 = local179 >> 5 & 0x1F;
				local251 = local179 & 0x1F;
				@Pc(986) int local986 = (local233 << 19) - (-(local239 << 11) - (local251 << 3));
				@Pc(990) Class361 local990 = Static265.method4040(local162);
				if (local990.anInt9593 != local986) {
					local990.anInt9593 = local986;
					Static186.method3170(local990);
				}
			} else if (local449 == 7) {
				local884 = Static265.method4040(local162);
				@Pc(1017) boolean local1017 = local817.anInt8802 == 1;
				if (local1017 != local884.aBoolean761) {
					local884.aBoolean761 = local1017;
					Static186.method3170(local884);
				}
			} else if (local449 == 8) {
				local884 = Static265.method4040(local162);
				if (local884.anInt9667 != local817.anInt8802 || local884.anInt9639 != local817.anInt8806 || local884.anInt9615 != local817.anInt8798) {
					local884.anInt9615 = local817.anInt8798;
					local884.anInt9639 = local817.anInt8806;
					local884.anInt9667 = local817.anInt8802;
					if (local884.anInt9645 != -1) {
						if (local884.anInt9604 > 0) {
							local884.anInt9615 = local884.anInt9615 * 32 / local884.anInt9604;
						} else if (local884.anInt9662 > 0) {
							local884.anInt9615 = local884.anInt9615 * 32 / local884.anInt9662;
						}
					}
					Static186.method3170(local884);
				}
			} else if (local449 == 9) {
				local884 = Static265.method4040(local162);
				if (local884.anInt9645 != local817.anInt8802 || local884.anInt9607 != local817.anInt8806) {
					local884.anInt9645 = local817.anInt8802;
					local884.anInt9607 = local817.anInt8806;
					Static186.method3170(local884);
				}
			} else if (local449 == 10) {
				local884 = Static265.method4040(local162);
				if (local884.anInt9636 != local817.anInt8802 || local817.anInt8806 != local884.anInt9622 || local817.anInt8798 != local884.anInt9588) {
					local884.anInt9636 = local817.anInt8802;
					local884.anInt9622 = local817.anInt8806;
					local884.anInt9588 = local817.anInt8798;
					Static186.method3170(local884);
				}
			} else if (local449 == 11) {
				local884 = Static265.method4040(local162);
				local884.anInt9659 = local884.anInt9600 = local817.anInt8806;
				local884.anInt9606 = local884.anInt9587 = local817.anInt8802;
				local884.aByte129 = 0;
				local884.aByte127 = 0;
				Static186.method3170(local884);
			} else if (local449 == 12) {
				local884 = Static265.method4040(local162);
				local233 = local817.anInt8802;
				if (local884 != null && local884.anInt9665 == 0) {
					if (local233 > local884.anInt9651 - local884.anInt9650) {
						local233 = local884.anInt9651 - local884.anInt9650;
					}
					if (local233 < 0) {
						local233 = 0;
					}
					if (local884.anInt9655 != local233) {
						local884.anInt9655 = local233;
						Static186.method3170(local884);
					}
				}
			} else if (local449 == 14) {
				local884 = Static265.method4040(local162);
				local884.anInt9635 = local817.anInt8802;
			} else if (local449 == 15) {
				Static125.anInt2831 = local817.anInt8806;
				Static542.aBoolean666 = true;
				Static551.anInt8768 = local817.anInt8802;
			} else if (local449 == 16) {
				local884 = Static265.method4040(local162);
				local884.anInt9648 = local817.anInt8802;
			}
		}
		if (Static416.anInt7068 != 0) {
			Static235.anInt4157 += 20;
			if (Static235.anInt4157 >= 400) {
				Static416.anInt7068 = 0;
			}
		}
		Static541.anInt8161++;
		if (Static535.aClass361_16 != null) {
			Static79.anInt6453++;
			if (Static79.anInt6453 >= 15) {
				Static186.method3170(Static535.aClass361_16);
				Static535.aClass361_16 = null;
			}
		}
		Static82.aBoolean667 = false;
		Static382.aBoolean502 = false;
		Static493.aClass361_17 = null;
		Static475.aClass361_13 = null;
		Static274.method4158(-1, null, -1);
		Static86.method5359(-1, null, -1);
		if (!Static369.aBoolean463) {
			Static69.anInt1582 = -1;
		}
		Static214.method3439();
		Static109.anInt2171++;
		if (Static34.aBoolean57) {
			@Pc(1455) Class3_Sub42 local1455 = Static591.method7910(Static9.aClass199_3, Static27.aClass303_37);
			local1455.aClass3_Sub11_Sub1_1.method5215(Static337.anInt5632 | Static567.anInt9232 << 14 | Static326.anInt5527 << 28);
			Static511.method6885(local1455);
			Static34.aBoolean57 = false;
		}
		while (true) {
			@Pc(1478) Class3_Sub32 local1478;
			@Pc(1483) Class361 local1483;
			do {
				local1478 = (Class3_Sub32) Static457.aClass112_55.method3094();
				if (local1478 == null) {
					while (true) {
						do {
							local1478 = (Class3_Sub32) Static460.aClass112_49.method3094();
							if (local1478 == null) {
								while (true) {
									do {
										local1478 = (Class3_Sub32) Static12.aClass112_54.method3094();
										if (local1478 == null) {
											if (Static493.aClass361_17 == null) {
												Static442.anInt7419 = 0;
											}
											if (Static283.aClass361_8 != null) {
												Static511.method6887();
											}
											if (Static500.anInt8114 > 0 && Static140.aClass195_1.method4499(82) && Static140.aClass195_1.method4499(81) && Static255.anInt4511 != 0) {
												local449 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117 - Static255.anInt4511;
												if (local449 < 0) {
													local449 = 0;
												} else if (local449 > 3) {
													local449 = 3;
												}
												Static335.method4780(Static335.anInt5608 + Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray629[0], Static246.anInt4344 - -Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray628[0], local449);
											}
											Static39.method652();
											for (local162 = 0; local162 < 5; local162++) {
												@Pc(1686) int local1686 = Static504.anIntArray523[local162]++;
											}
											if (Static11.aBoolean7 && Static158.method2936() - 60000L > Static359.aLong179) {
												Static549.method7294();
											}
											for (@Pc(1715) Class41_Sub3_Sub2 local1715 = (Class41_Sub3_Sub2) Static549.aClass178_22.method4168(); local1715 != null; local1715 = (Class41_Sub3_Sub2) Static549.aClass178_22.method4165()) {
												if ((long) local1715.anInt6880 < Static158.method2936() / 1000L - 5L) {
													if (local1715.aShort113 > 0) {
														Static180.method3112(local1715.aString54 + Static544.aClass343_23.method7222(Static256.anInt4535), "", "", 0, 5, "");
													}
													if (local1715.aShort113 == 0) {
														Static180.method3112(local1715.aString54 + Static544.aClass343_24.method7222(Static256.anInt4535), "", "", 0, 5, "");
													}
													local1715.method7833();
												}
											}
											Static231.anInt4053++;
											if (Static231.anInt4053 > 500) {
												Static231.anInt4053 = 0;
												local233 = (int) (Math.random() * 8.0D);
												if ((local233 & 0x4) == 4) {
													Static36.anInt654 += Static135.anInt2933;
												}
												if ((local233 & 0x1) == 1) {
													Static51.anInt993 += Static481.anInt7910;
												}
												if ((local233 & 0x2) == 2) {
													Static159.anInt3275 += Static442.anInt7414;
												}
											}
											if (Static51.anInt993 < -50) {
												Static481.anInt7910 = 2;
											}
											if (Static159.anInt3275 < -55) {
												Static442.anInt7414 = 2;
											}
											if (Static51.anInt993 > 50) {
												Static481.anInt7910 = -2;
											}
											if (Static159.anInt3275 > 55) {
												Static442.anInt7414 = -2;
											}
											if (Static36.anInt654 < -40) {
												Static135.anInt2933 = 1;
											}
											if (Static36.anInt654 > 40) {
												Static135.anInt2933 = -1;
											}
											Static554.anInt8820++;
											if (Static554.anInt8820 > 500) {
												Static554.anInt8820 = 0;
												local233 = (int) (Math.random() * 8.0D);
												if ((local233 & 0x1) == 1) {
													Static244.anInt4328 += Static112.anInt2183;
												}
												if ((local233 & 0x2) == 2) {
													Static41.anInt765 += Static268.anInt4728;
												}
											}
											if (Static244.anInt4328 < -60) {
												Static112.anInt2183 = 2;
											}
											if (Static41.anInt765 < -20) {
												Static268.anInt4728 = 1;
											}
											if (Static244.anInt4328 > 60) {
												Static112.anInt2183 = -2;
											}
											if (Static41.anInt765 > 10) {
												Static268.anInt4728 = -1;
											}
											Static173.anInt3427++;
											if (Static173.anInt3427 > 50) {
												@Pc(1943) Class3_Sub42 local1943 = Static591.method7910(Static9.aClass199_3, Static574.aClass303_102);
												Static511.method6885(local1943);
											}
											if (Static410.aBoolean528) {
												Static453.method6309();
												Static410.aBoolean528 = false;
											}
											try {
												Static84.method1672();
												return;
											} catch (@Pc(1956) IOException local1956) {
												Static58.method1205();
												return;
											}
										}
										local1483 = local1478.aClass361_6;
										if (local1483.anInt9608 < 0) {
											break;
										}
										local884 = Static265.method4040(local1483.anInt9663);
									} while (local884 == null || local884.aClass361Array2 == null || local1483.anInt9608 >= local884.aClass361Array2.length || local884.aClass361Array2[local1483.anInt9608] != local1483);
									Static312.method4566(local1478);
								}
							}
							local1483 = local1478.aClass361_6;
							if (local1483.anInt9608 < 0) {
								break;
							}
							local884 = Static265.method4040(local1483.anInt9663);
						} while (local884 == null || local884.aClass361Array2 == null || local884.aClass361Array2.length <= local1483.anInt9608 || local884.aClass361Array2[local1483.anInt9608] != local1483);
						Static312.method4566(local1478);
					}
				}
				local1483 = local1478.aClass361_6;
				if (local1483.anInt9608 < 0) {
					break;
				}
				local884 = Static265.method4040(local1483.anInt9663);
			} while (local884 == null || local884.aClass361Array2 == null || local884.aClass361Array2.length <= local1483.anInt9608 || local1483 != local884.aClass361Array2[local1483.anInt9608]);
			Static312.method4566(local1478);
		}
	}
}
