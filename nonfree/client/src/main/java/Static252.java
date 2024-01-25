import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
	public static int anInt5118;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
	public static int anInt5119;

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
	public static int anInt5122 = 0;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIZIII)V")
	public static void method4419(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static81.anInt1953;
		Static239.anInt4899 = 0;
		@Pc(11) int[] local11 = Static227.anIntArray309;
		@Pc(173) int local173;
		@Pc(198) int local198;
		@Pc(243) int local243;
		@Pc(320) int local320;
		@Pc(408) int local408;
		@Pc(863) int local863;
		@Pc(518) int local518;
		for (@Pc(17) int local17 = 0; local17 < Static208.anInt4409 + local7; local17++) {
			@Pc(21) Class222 local21 = null;
			@Pc(36) Class11_Sub1_Sub1 local36;
			if (local17 >= local7) {
				local36 = ((Class6_Sub33) Static506.aClass305_36.method7447((long) Static70.anIntArray111[local17 - local7])).aClass11_Sub1_Sub1_Sub1_2;
				local21 = ((Class11_Sub1_Sub1_Sub1) local36).aClass222_1;
				if (local21.anIntArray464 != null) {
					local21 = local21.method5329(Static435.aClass234_1);
					if (local21 == null) {
						continue;
					}
				}
			} else {
				local36 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local11[local17]];
			}
			if (local36.anInt7416 >= 0 && (local36.anInt7363 == Static555.anInt9478 || Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77 == local36.aByte77)) {
				Static64.method1363(local36.method6214(), arg1 >> 1, arg2 >> 1, local36);
				if (Static350.anIntArray431[0] >= 0) {
					if (local36.aString94 != null && (local17 >= local7 || Static140.anInt2983 == 0 || Static140.anInt2983 == 3 || Static140.anInt2983 == 1 && Static504.method7515(((Class11_Sub1_Sub1_Sub2) local36).aString95)) && Static239.anInt4899 < Static88.anInt2180) {
						Static88.anIntArray154[Static239.anInt4899] = Static1.aClass82_1.method2292(local36.aString94) / 2;
						Static88.anIntArray162[Static239.anInt4899] = Static350.anIntArray431[0];
						Static88.anIntArray157[Static239.anInt4899] = Static350.anIntArray431[1];
						Static88.anIntArray160[Static239.anInt4899] = local36.anInt7426;
						Static88.anIntArray161[Static239.anInt4899] = local36.anInt7369;
						Static88.anIntArray156[Static239.anInt4899] = local36.anInt7419;
						Static88.aStringArray10[Static239.anInt4899] = local36.aString94;
						Static239.anInt4899++;
					}
					local173 = arg3 + Static350.anIntArray431[1];
					@Pc(228) Class66[] local228;
					@Pc(235) Class1[] local235;
					@Pc(291) Class66 local291;
					if (local36.aBoolean543 || local36.anInt7375 <= Static508.anInt8998) {
						local173 -= Math.max(Static1.aClass82_1.anInt2530, Static283.aClass66Array7[0].b());
					} else {
						@Pc(184) byte local184 = 1;
						if (local7 > local17) {
							@Pc(193) Class11_Sub1_Sub1_Sub2 local193 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local11[local17]];
							local198 = local36.method6209().anInt5193;
							if (local193.aBoolean548) {
								local184 = 2;
							}
						} else {
							local198 = local21.anInt6237;
							if (local198 == -1) {
								local198 = local36.method6209().anInt5193;
							}
						}
						@Pc(218) Class66[] local218 = Static283.aClass66Array7;
						if (local198 != -1) {
							local228 = (Class66[]) Static268.aClass245_63.method6082((long) local198);
							if (local228 == null) {
								local235 = Static583.method50(Static132.aClass168_118, local198);
								if (local235 != null) {
									local228 = new Class66[local235.length];
									for (local243 = 0; local243 < local235.length; local243++) {
										local228[local243] = Static323.aClass9_8.method5412(local235[local243]);
									}
									Static268.aClass245_63.method6075(local228, (long) local198);
								}
							}
							if (local228 != null && local228.length >= 2) {
								local218 = local228;
							}
						}
						if (local218.length <= local184) {
							local184 = 1;
						}
						@Pc(287) Class66 local287 = local218[0];
						local291 = local218[local184];
						local173 -= Math.max(Static1.aClass82_1.anInt2530, local287.b());
						local243 = arg0 + Static350.anIntArray431[0] - (local287.QA() >> 1);
						local320 = local287.QA() * local36.anInt7388 / 255;
						if (local36.anInt7388 > 0 && local320 < 2) {
							local320 = 2;
						}
						local287.method8066(local243, local173);
						Static323.aClass9_8.Q(local243, local173, local243 + local320, local287.b() + local173);
						local291.method8066(local243, local173);
						Static323.aClass9_8.ca(arg0, arg3, arg2 + arg0, arg1 + arg3);
					}
					local173 -= 2;
					if (!local36.aBoolean543) {
						@Pc(391) Class66 local391;
						if (local36.anInt7410 > Static508.anInt8998) {
							local391 = Static114.aClass66Array3[local36.aBoolean544 ? 2 : 0];
							@Pc(400) Class66 local400 = Static114.aClass66Array3[local36.aBoolean544 ? 3 : 1];
							if (local36 instanceof Class11_Sub1_Sub1_Sub1) {
								local408 = local21.anInt6259;
								if (local408 == -1) {
									local408 = local36.method6209().anInt5192;
								}
							} else {
								local408 = local36.method6209().anInt5192;
							}
							if (local408 != -1) {
								local228 = (Class66[]) Static272.aClass245_42.method6082((long) local408);
								if (local228 == null) {
									local235 = Static583.method50(Static132.aClass168_118, local408);
									if (local235 != null) {
										local228 = new Class66[local235.length];
										for (local243 = 0; local243 < local235.length; local243++) {
											local228[local243] = Static323.aClass9_8.method5412(local235[local243]);
										}
										Static272.aClass245_42.method6075(local228, (long) local408);
									}
								}
								if (local228 != null && local228.length == 4) {
									local391 = local228[local36.aBoolean544 ? 2 : 0];
									local400 = local228[local36.aBoolean544 ? 3 : 1];
								}
							}
							@Pc(507) int local507 = local36.anInt7410 - Static508.anInt8998;
							if (local36.anInt7395 >= local507) {
								local518 = local391.QA();
							} else {
								local507 -= local36.anInt7395;
								local243 = local36.anInt7370 == 0 ? 0 : local36.anInt7370 * ((local36.anInt7403 - local507) / local36.anInt7370);
								local518 = local391.QA() * local243 / local36.anInt7403;
							}
							local243 = local391.b();
							local173 -= local243;
							local320 = arg0 + Static350.anIntArray431[0] - (local391.QA() >> 1);
							local391.method8066(local320, local173);
							Static323.aClass9_8.Q(local320, local173, local518 + local320, local173 + local243);
							local400.method8066(local320, local173);
							local173 -= 2;
							Static323.aClass9_8.ca(arg0, arg3, arg0 + arg2, arg3 + arg1);
						}
						if (local17 < local7) {
							@Pc(609) Class11_Sub1_Sub1_Sub2 local609 = (Class11_Sub1_Sub1_Sub2) local36;
							if (local609.anInt7448 != -1) {
								local173 -= 25;
								Static226.aClass66Array5[local609.anInt7448].method8066(Static350.anIntArray431[0] + arg0 - 12, local173);
								local173 -= 2;
							}
							if (local609.anInt7452 != -1) {
								local173 -= 25;
								Static212.aClass66Array4[local609.anInt7452].method8066(arg0 + Static350.anIntArray431[0] - 12, local173);
								local173 -= 2;
							}
						} else if (local21.anInt6236 >= 0 && local21.anInt6236 < Static212.aClass66Array4.length) {
							local391 = Static212.aClass66Array4[local21.anInt6236];
							local173 -= 25;
							local391.method8066(Static350.anIntArray431[0] + arg0 - (local391.QA() >> 1), local173);
							local173 -= 2;
						}
					}
					@Pc(693) Class332[] local693;
					@Pc(701) Class332 local701;
					if (!(local36 instanceof Class11_Sub1_Sub1_Sub2)) {
						local198 = 0;
						local693 = Static83.aClass332Array2;
						for (local408 = 0; local408 < local693.length; local408++) {
							local701 = local693[local408];
							if (local701 != null && local701.anInt9341 == 1 && local701.anInt9334 == Static70.anIntArray111[local17 - local7]) {
								local291 = Static447.aClass66Array10[local701.anInt9335];
								if (local291.b() > local198) {
									local198 = local291.b();
								}
								if (Static508.anInt8998 % 20 < 10) {
									local291.method8066(Static350.anIntArray431[0] + arg0 - 12, local173 + -local291.b());
								}
							}
						}
						if (local198 > 0) {
						}
					} else if (local17 >= 0) {
						local198 = 0;
						local693 = Static83.aClass332Array2;
						for (local408 = 0; local408 < local693.length; local408++) {
							local701 = local693[local408];
							if (local701 != null && local701.anInt9341 == 10 && local11[local17] == local701.anInt9334) {
								local291 = Static447.aClass66Array10[local701.anInt9335];
								if (local198 < local291.b()) {
									local198 = local291.b();
								}
								local291.method8066(arg0 + Static350.anIntArray431[0] - 12, local173 - local291.b());
							}
						}
						if (local198 > 0) {
						}
					}
					for (local198 = 0; local198 < 4; local198++) {
						if (local36.anIntArray521[local198] > Static508.anInt8998) {
							local863 = local36.method6214() / 2;
							Static64.method1363(local863, arg1 >> 1, arg2 >> 1, local36);
							if (Static350.anIntArray431[0] > -1) {
								local408 = Static287.aClass66Array8[local36.anIntArray522[local198]].QA();
								if (local198 == 1) {
									Static350.anIntArray431[1] -= 20;
								}
								if (local198 == 2) {
									Static350.anIntArray431[1] -= 10;
									Static350.anIntArray431[0] -= local408 - 9;
								}
								if (local198 == 3) {
									Static350.anIntArray431[0] += local408 - 9;
									Static350.anIntArray431[1] -= 10;
								}
								Static287.aClass66Array8[local36.anIntArray522[local198]].method8066(Static350.anIntArray431[0] + arg0 - (local408 >> 1), Static350.anIntArray431[1] + arg3 + -12);
								Static467.aClass73_3.method7892(Static350.anIntArray431[0] + arg0 - 1, Static350.anIntArray431[1] + (arg3 - -3), Integer.toString(local36.anIntArray524[local198]), -1, 0);
							}
						}
					}
				}
			}
		}
		@Pc(1004) int local1004;
		for (@Pc(998) int local998 = 0; local998 < Static406.anInt9841; local998++) {
			local1004 = Static148.anIntArray839[local998];
			@Pc(1019) Class11_Sub1_Sub1 local1019;
			if (local1004 >= 2048) {
				local1019 = ((Class6_Sub33) Static506.aClass305_36.method7447((long) (local1004 - 2048))).aClass11_Sub1_Sub1_Sub1_2;
			} else {
				local1019 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local1004];
			}
			local198 = Static527.anIntArray800[local998];
			@Pc(1036) Class11_Sub1_Sub1 local1036;
			if (local198 < 2048) {
				local1036 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local198];
			} else {
				local1036 = ((Class6_Sub33) Static506.aClass305_36.method7447((long) (local198 - 2048))).aClass11_Sub1_Sub1_Sub1_2;
			}
			Static438.method6673(local1019, local1036, arg2, arg3, arg1, --local1019.anInt7424, arg0);
		}
		local1004 = Static1.aClass82_1.anInt2524 + Static1.aClass82_1.anInt2530 + 2;
		for (local173 = 0; local173 < Static239.anInt4899; local173++) {
			local198 = Static88.anIntArray162[local173];
			local863 = Static88.anIntArray157[local173];
			local408 = Static88.anIntArray154[local173];
			@Pc(1099) boolean local1099 = true;
			while (local1099) {
				local1099 = false;
				for (local518 = 0; local518 < local173; local518++) {
					if (Static88.anIntArray157[local518] - local1004 < local863 + 2 && local863 - local1004 < Static88.anIntArray157[local518] + 2 && local198 - local408 < Static88.anIntArray162[local518] + Static88.anIntArray154[local518] && local198 + local408 > -Static88.anIntArray154[local518] + Static88.anIntArray162[local518] && Static88.anIntArray157[local518] - local1004 < local863) {
						local1099 = true;
						local863 = Static88.anIntArray157[local518] - local1004;
					}
				}
			}
			Static88.anIntArray157[local173] = local863;
			@Pc(1192) String local1192 = Static88.aStringArray10[local173];
			if (Static570.anInt9640 == 0) {
				local243 = 16776960;
				if (Static88.anIntArray160[local173] < 6) {
					local243 = Static352.anIntArray478[Static88.anIntArray160[local173]];
				}
				if (Static88.anIntArray160[local173] == 6) {
					local243 = Static555.anInt9478 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static88.anIntArray160[local173] == 7) {
					local243 = Static555.anInt9478 % 20 < 10 ? 255 : 65535;
				}
				if (Static88.anIntArray160[local173] == 8) {
					local243 = Static555.anInt9478 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static88.anIntArray160[local173] == 9) {
					local320 = 150 - Static88.anIntArray156[local173];
					if (local320 < 50) {
						local243 = local320 * 1280 + 16711680;
					} else if (local320 < 100) {
						local243 = 16776960 - (local320 - 50) * 327680;
					} else if (local320 < 150) {
						local243 = (local320 - 100) * 5 + 65280;
					}
				}
				if (Static88.anIntArray160[local173] == 10) {
					local320 = 150 - Static88.anIntArray156[local173];
					if (local320 < 50) {
						local243 = local320 * 5 + 16711680;
					} else if (local320 < 100) {
						local243 = 16384000 + 16711935 - local320 * 327680;
					} else if (local320 < 150) {
						local243 = local320 * 327680 + 255 + 500 - local320 * 5 - 32768000;
					}
				}
				if (Static88.anIntArray160[local173] == 11) {
					local320 = 150 - Static88.anIntArray156[local173];
					if (local320 < 50) {
						local243 = 16777215 - local320 * 327685;
					} else if (local320 < 100) {
						local243 = (local320 - 50) * 327685 + 65280;
					} else if (local320 < 150) {
						local243 = 16777215 - (local320 - 100) * 327680;
					}
				}
				local320 = local243 | 0xFF000000;
				if (Static88.anIntArray161[local173] == 0) {
					Static489.aClass73_5.method7892(local198 + arg0, arg3 + local863, local1192, local320, -16777216);
				}
				if (Static88.anIntArray161[local173] == 1) {
					Static489.aClass73_5.method7879(local1192, arg3 + local863, arg0 - -local198, local320, Static555.anInt9478);
				}
				if (Static88.anIntArray161[local173] == 2) {
					Static489.aClass73_5.method7896(local198 + arg0, local320, arg3 + local863, local1192, Static555.anInt9478);
				}
				if (Static88.anIntArray161[local173] == 3) {
					Static489.aClass73_5.method7898(arg3 + local863, Static555.anInt9478, local1192, local320, 150 - Static88.anIntArray156[local173], arg0 + local198);
				}
				@Pc(1528) int local1528;
				if (Static88.anIntArray161[local173] == 4) {
					local1528 = (150 - Static88.anIntArray156[local173]) * (Static1.aClass82_1.method2292(local1192) + 100) / 150;
					Static323.aClass9_8.Q(arg0 + local198 - 50, arg3, arg0 + local198 + 50, arg3 + arg1);
					Static489.aClass73_5.method7888(local1192, local320, -16777216, arg0 + local198 + 50 - local1528, arg3 - -local863);
					Static323.aClass9_8.ca(arg0, arg3, arg0 + arg2, arg1 + arg3);
				}
				if (Static88.anIntArray161[local173] == 5) {
					local1528 = 150 - Static88.anIntArray156[local173];
					@Pc(1589) int local1589 = 0;
					if (local1528 < 25) {
						local1589 = local1528 - 25;
					} else if (local1528 > 125) {
						local1589 = local1528 - 125;
					}
					@Pc(1611) int local1611 = Static1.aClass82_1.anInt2530 + Static1.aClass82_1.anInt2524;
					Static323.aClass9_8.Q(arg0, arg3 + local863 - local1611 - 1, arg0 - -arg2, local863 + arg3 + 5);
					Static489.aClass73_5.method7892(local198 + arg0, arg3 - -local863 + local1589, local1192, local320, -16777216);
					Static323.aClass9_8.ca(arg0, arg3, arg0 + arg2, arg3 + arg1);
				}
			} else {
				Static489.aClass73_5.method7892(arg0 + local198, local863 + arg3, local1192, -256, -16777216);
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZILjava/lang/String;J)V")
	public static void method4420(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) long arg2) {
		if (arg0) {
			Static178.method3533();
			if (Static91.aString22.equals("")) {
				Static350.anInt5890 = 39;
				return;
			}
		}
		@Pc(19) Class6_Sub26 local19 = new Class6_Sub26(576);
		local19.method4950(10, -81849);
		local19.method4962((int) (Math.random() * 65535.0D));
		local19.method4943(arg2);
		local19.method4962(arg0 ? Static157.anInt7585 : Static294.anInt5607);
		local19.method4998(arg1);
		local19.method4943(arg0 ? Static236.aLong100 : Static347.aLong149);
		if (arg0) {
			local19.method4943(Static118.method2353(Static91.aString22));
			try {
				local19.method4943(Long.parseLong(Static500.aString106));
			} catch (@Pc(99) Exception local99) {
				Static350.anInt5890 = 39;
				return;
			}
		} else {
			local19.method4979((int) (Math.random() * 9.9999999E7D));
			local19.method4979((int) (Math.random() * 9.9999999E7D));
			local19.method4979((int) (Math.random() * 9.9999999E7D));
			local19.method4979((int) (Math.random() * 9.9999999E7D));
		}
		local19.method4979((int) (Math.random() * 9.9999999E7D));
		local19.method4956(Static241.aBigInteger3, Static83.aBigInteger2);
		Static547.aClass6_Sub26_Sub2_2.anInt5769 = 0;
		Static547.aClass6_Sub26_Sub2_2.method4950(arg0 ? Static562.aClass219_12.anInt6222 : Static562.aClass219_9.anInt6222, -81849);
		Static547.aClass6_Sub26_Sub2_2.method4962(local19.anInt5769 + 28);
		Static547.aClass6_Sub26_Sub2_2.method4962(612);
		Static547.aClass6_Sub26_Sub2_2.method4950(Static286.anInt5468, -81849);
		Static547.aClass6_Sub26_Sub2_2.method4950(Static38.aClass162_1.anInt4926, -81849);
		Static457.method7118(Static547.aClass6_Sub26_Sub2_2);
		Static547.aClass6_Sub26_Sub2_2.method4939(local19.anInt5769, local19.aByteArray65);
		Static159.anInt3401 = 1;
		Static70.anInt1692 = 0;
		Static350.anInt5890 = -3;
		Static443.anInt8142 = 0;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
	public static void method4422() {
		if (Static6.anInt302 == -1) {
			return;
		}
		@Pc(17) int local17 = Static401.aClass4_1.method1216();
		@Pc(21) int local21 = Static401.aClass4_1.method1215();
		@Pc(26) Class6_Sub39 local26 = (Class6_Sub39) Static512.aClass211_67.method5183();
		if (local26 != null) {
			local17 = local26.method8012();
			local21 = local26.method8018();
		}
		Static316.method5103(Static228.anInt4744, 0, local17, Static6.anInt302, local21, Static180.anInt4051, 0, 0, 0);
		if (Static141.aClass93_9 != null) {
			Static316.method5102(local17, local21);
		}
	}
}
