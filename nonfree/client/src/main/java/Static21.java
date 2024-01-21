import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "Lclient!c;")
	public static Class10 aClass10_22;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!ai;")
	public static Class6 aClass6_146 = Static38.method685("leuchten1:");

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
	public static int anInt520 = -1;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "[I")
	public static int[] anIntArray28 = new int[100];

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
	public static int anInt523 = 0;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Lclient!ai;")
	public static Class6 aClass6_147 = Static38.method685("(U0a )2 in: ");

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!ka;[Lclient!l;)V")
	public static void method377(@OriginalArg(1) Class44 arg0, @OriginalArg(2) Class48[] arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static164.aByteArrayArrayArray7[local7][local11][local15] & 0x1) == 1) {
						@Pc(30) int local30 = local7;
						if ((Static164.aByteArrayArrayArray7[1][local11][local15] & 0x2) == 2) {
							local30 = local7 - 1;
						}
						if (local30 >= 0) {
							arg1[local30].method1478(local11, local15);
						}
					}
				}
			}
		}
		Static10.anInt248 += (int) (Math.random() * 5.0D) - 2;
		Static5.anInt87 += (int) (Math.random() * 5.0D) - 2;
		if (Static10.anInt248 < -16) {
			Static10.anInt248 = -16;
		}
		if (Static10.anInt248 > 16) {
			Static10.anInt248 = 16;
		}
		@Pc(100) int[][] local100 = new int[104][104];
		local15 = Static10.anInt248 >> 1;
		@Pc(108) int[][] local108 = new int[104][104];
		if (Static5.anInt87 < -8) {
			Static5.anInt87 = -8;
		}
		if (Static5.anInt87 > 8) {
			Static5.anInt87 = 8;
		}
		local11 = Static5.anInt87 >> 2 << 10;
		@Pc(136) int local136;
		@Pc(142) int local142;
		@Pc(144) int local144;
		@Pc(148) int local148;
		@Pc(240) int local240;
		@Pc(173) int local173;
		@Pc(194) int local194;
		@Pc(207) int local207;
		@Pc(217) int local217;
		@Pc(211) int local211;
		@Pc(223) int local223;
		@Pc(289) int local289;
		@Pc(512) int local512;
		@Pc(508) int local508;
		@Pc(838) int local838;
		@Pc(805) int local805;
		@Pc(831) int local831;
		for (@Pc(126) int local126 = 0; local126 < 4; local126++) {
			@Pc(132) byte[][] local132 = Static40.aByteArrayArrayArray2[local126];
			local136 = (int) Math.sqrt(5100.0D);
			local142 = local136 * 768 >> 8;
			for (local144 = 1; local144 < 103; local144++) {
				for (local148 = 1; local148 < 103; local148++) {
					local173 = Static165.anIntArrayArrayArray10[local126][local148 + 1][local144] - Static165.anIntArrayArrayArray10[local126][local148 - 1][local144];
					local194 = Static165.anIntArrayArrayArray10[local126][local148][local144 + 1] - Static165.anIntArrayArrayArray10[local126][local148][local144 - 1];
					local207 = (int) Math.sqrt((double) (local173 * local173 + local194 * local194 + 65536));
					local211 = 65536 / local207;
					local217 = (local173 << 8) / local207;
					local223 = (local194 << 8) / local207;
					local240 = (local223 * -50 + local217 * -50 + local211 * -10) / local142 + 96;
					local289 = (local132[local148][local144 + 1] >> 3) + (local132[local148 - 1][local144] >> 2) + (local132[local148 + 1][local144] >> 3) + (local132[local148][local144 + -1] >> 2) + (local132[local148][local144] >> 1);
					local100[local148][local144] = local240 - local289;
				}
			}
			for (local148 = 0; local148 < 104; local148++) {
				Static122.anIntArray245[local148] = 0;
				Static181.anIntArray173[local148] = 0;
				Static177.anIntArray401[local148] = 0;
				Static143.anIntArray298[local148] = 0;
				Static126.anIntArray256[local148] = 0;
			}
			for (local240 = -5; local240 < 104; local240++) {
				for (local173 = 0; local173 < 104; local173++) {
					local194 = local240 + 5;
					@Pc(410) int local410;
					if (local194 < 104) {
						local207 = Static138.aByteArrayArrayArray6[local126][local194][local173] & 0xFF;
						if (local207 > 0) {
							@Pc(374) Class2_Sub3_Sub1 local374 = Static134.method2095(local207 - 1);
							Static122.anIntArray245[local173] += local374.anInt133;
							Static181.anIntArray173[local173] += local374.anInt138;
							Static177.anIntArray401[local173] += local374.anInt132;
							Static143.anIntArray298[local173] += local374.anInt135;
							local410 = Static126.anIntArray256[local173]++;
						}
					}
					local207 = local240 - 5;
					if (local207 >= 0) {
						local217 = Static138.aByteArrayArrayArray6[local126][local207][local173] & 0xFF;
						if (local217 > 0) {
							@Pc(442) Class2_Sub3_Sub1 local442 = Static134.method2095(local217 - 1);
							Static122.anIntArray245[local173] -= local442.anInt133;
							Static181.anIntArray173[local173] -= local442.anInt138;
							Static177.anIntArray401[local173] -= local442.anInt132;
							Static143.anIntArray298[local173] -= local442.anInt135;
							local410 = Static126.anIntArray256[local173]--;
						}
					}
				}
				if (local240 >= 0) {
					local194 = 0;
					local217 = 0;
					local223 = 0;
					local207 = 0;
					local211 = 0;
					for (local289 = -5; local289 < 104; local289++) {
						local508 = local289 - 5;
						local512 = local289 + 5;
						if (local512 < 104) {
							local211 += Static143.anIntArray298[local512];
							local217 += Static177.anIntArray401[local512];
							local223 += Static126.anIntArray256[local512];
							local207 += Static181.anIntArray173[local512];
							local194 += Static122.anIntArray245[local512];
						}
						if (local508 >= 0) {
							local217 -= Static177.anIntArray401[local508];
							local223 -= Static126.anIntArray256[local508];
							local211 -= Static143.anIntArray298[local508];
							local194 -= Static122.anIntArray245[local508];
							local207 -= Static181.anIntArray173[local508];
						}
						if (local289 >= 0 && local223 > 0) {
							local108[local240][local289] = Static6.method928(local217 / local223, local207 / local223, local194 * 256 / local211);
						}
					}
				}
			}
			for (local173 = 1; local173 < 103; local173++) {
				for (local194 = 1; local194 < 103; local194++) {
					if (!Static113.aBoolean112 || (Static164.aByteArrayArrayArray7[0][local173][local194] & 0x2) != 0 || (Static164.aByteArrayArrayArray7[local126][local173][local194] & 0x10) == 0 && Static89.method1489(local194, local173, local126) == Static92.anInt2291) {
						if (Static148.anInt3458 > local126) {
							Static148.anInt3458 = local126;
						}
						local207 = Static138.aByteArrayArrayArray6[local126][local173][local194] & 0xFF;
						local217 = Static92.aByteArrayArrayArray5[local126][local173][local194] & 0xFF;
						if (local207 > 0 || local217 > 0) {
							local211 = Static165.anIntArrayArrayArray10[local126][local173][local194];
							local223 = Static165.anIntArrayArrayArray10[local126][local173 + 1][local194];
							local289 = Static165.anIntArrayArrayArray10[local126][local173 + 1][local194 + 1];
							local512 = Static165.anIntArrayArrayArray10[local126][local173][local194 + 1];
							if (local126 > 0) {
								@Pc(738) boolean local738 = true;
								if (local207 == 0 && Static16.aByteArrayArrayArray1[local126][local173][local194] != 0) {
									local738 = false;
								}
								if (local217 > 0 && !Static171.method2714(local217 - 1).aBoolean126) {
									local738 = false;
								}
								if (local738 && local223 == local211 && local211 == local289 && local211 == local512) {
									Static181.anIntArrayArrayArray6[local126][local173][local194] |= 0x924;
								}
							}
							if (local207 > 0) {
								local508 = local108[local173][local194];
								local805 = local15 + (local508 & 0x7F);
								if (local805 < 0) {
									local805 = 0;
								} else if (local805 > 127) {
									local805 = 127;
								}
								local831 = (local508 & 0x380) + (local508 + local11 & 0xFC00) + local805;
								local838 = Static100.anIntArray209[Static59.method980(96, local831)];
							} else {
								local508 = -1;
								local838 = 0;
							}
							local831 = local100[local173 + 1][local194];
							@Pc(860) int local860 = local100[local173][local194 + 1];
							@Pc(870) int local870 = local100[local173 + 1][local194 + 1];
							local805 = local100[local173][local194];
							if (local217 == 0) {
								arg0.method1286(local126, local173, local194, 0, 0, -1, local211, local223, local289, local512, Static59.method980(local805, local508), Static59.method980(local831, local508), Static59.method980(local870, local508), Static59.method980(local860, local508), 0, 0, 0, 0, local838, 0);
							} else {
								@Pc(927) int local927 = Static16.aByteArrayArrayArray1[local126][local173][local194] + 1;
								@Pc(935) byte local935 = Static72.aByteArrayArrayArray4[local126][local173][local194];
								@Pc(941) Class2_Sub3_Sub13 local941 = Static171.method2714(local217 - 1);
								@Pc(944) int local944 = local941.anInt3043;
								if (local944 >= 0 && !Static100.anInterface1_2.method1715(local944)) {
									local944 = -1;
								}
								@Pc(960) int local960;
								@Pc(970) int local970;
								@Pc(992) int local992;
								@Pc(1018) int local1018;
								if (local944 >= 0) {
									local960 = -1;
									local970 = Static100.anIntArray209[Static22.method392(Static100.anInterface1_2.method1716(local944), 96)];
								} else if (local941.anInt3042 == -1) {
									local960 = -2;
									local970 = 0;
								} else {
									local960 = local941.anInt3042;
									local992 = (local960 & 0x7F) + local15;
									if (local992 < 0) {
										local992 = 0;
									} else if (local992 > 127) {
										local992 = 127;
									}
									local1018 = local992 + (local960 + local11 & 0xFC00) + (local960 & 0x380);
									local970 = Static100.anIntArray209[Static22.method392(local1018, 96)];
								}
								if (local941.anInt3040 >= 0) {
									local992 = local941.anInt3040;
									local1018 = local15 + (local992 & 0x7F);
									if (local1018 < 0) {
										local1018 = 0;
									} else if (local1018 > 127) {
										local1018 = 127;
									}
									@Pc(1069) int local1069 = (local992 & 0x380) + (local992 + local11 & 0xFC00) + local1018;
									local970 = Static100.anIntArray209[Static22.method392(local1069, 96)];
								}
								arg0.method1286(local126, local173, local194, local927, local935, local944, local211, local223, local289, local512, Static59.method980(local805, local508), Static59.method980(local831, local508), Static59.method980(local870, local508), Static59.method980(local860, local508), Static22.method392(local960, local805), Static22.method392(local960, local831), Static22.method392(local960, local870), Static22.method392(local960, local860), local838, local970);
							}
						}
					}
				}
			}
			for (local194 = 1; local194 < 103; local194++) {
				for (local207 = 1; local207 < 103; local207++) {
					arg0.method1292(local126, local207, local194, Static89.method1489(local194, local207, local126));
				}
			}
			Static138.aByteArrayArrayArray6[local126] = null;
			Static92.aByteArrayArrayArray5[local126] = null;
			Static16.aByteArrayArrayArray1[local126] = null;
			Static72.aByteArrayArrayArray4[local126] = null;
			Static40.aByteArrayArrayArray2[local126] = null;
		}
		arg0.method1271();
		for (@Pc(1197) int local1197 = 0; local1197 < 104; local1197++) {
			for (local136 = 0; local136 < 104; local136++) {
				if ((Static164.aByteArrayArrayArray7[1][local1197][local136] & 0x2) == 2) {
					arg0.method1259(local1197, local136);
				}
			}
		}
		local136 = 1;
		local142 = 2;
		local144 = 4;
		for (local148 = 0; local148 < 4; local148++) {
			if (local148 > 0) {
				local136 <<= 0x3;
				local144 <<= 0x3;
				local142 <<= 0x3;
			}
			for (local240 = 0; local240 <= local148; local240++) {
				for (local173 = 0; local173 <= 104; local173++) {
					for (local194 = 0; local194 <= 104; local194++) {
						if ((Static181.anIntArrayArrayArray6[local240][local194][local173] & local136) != 0) {
							local207 = local173;
							local217 = local173;
							local211 = local240;
							local223 = local240;
							while (local217 < 104 && (Static181.anIntArrayArrayArray6[local240][local194][local217 + 1] & local136) != 0) {
								local217++;
							}
							while (local207 > 0 && (local136 & Static181.anIntArrayArrayArray6[local240][local194][local207 - 1]) != 0) {
								local207--;
							}
							label350: while (local211 > 0) {
								for (local289 = local207; local289 <= local217; local289++) {
									if ((Static181.anIntArrayArrayArray6[local211 - 1][local194][local289] & local136) == 0) {
										break label350;
									}
								}
								local211--;
							}
							label339: while (local148 > local223) {
								for (local289 = local207; local289 <= local217; local289++) {
									if ((Static181.anIntArrayArrayArray6[local223 + 1][local194][local289] & local136) == 0) {
										break label339;
									}
								}
								local223++;
							}
							local289 = (local217 + 1 - local207) * (local223 + 1 - local211);
							if (local289 >= 8) {
								local838 = Static165.anIntArrayArrayArray10[local211][local194][local207];
								local508 = Static165.anIntArrayArrayArray10[local223][local194][local207] - 240;
								Static80.method1287(local148, 1, local194 * 128, local194 * 128, local207 * 128, local217 * 128 + 128, local508, local838);
								for (local805 = local211; local805 <= local223; local805++) {
									for (local831 = local207; local831 <= local217; local831++) {
										Static181.anIntArrayArrayArray6[local805][local194][local831] &= ~local136;
									}
								}
							}
						}
						if ((local142 & Static181.anIntArrayArrayArray6[local240][local194][local173]) != 0) {
							local207 = local194;
							for (local217 = local194; local217 < 104 && (local142 & Static181.anIntArrayArrayArray6[local240][local217 + 1][local173]) != 0; local217++) {
							}
							while (local207 > 0 && (local142 & Static181.anIntArrayArrayArray6[local240][local207 - 1][local173]) != 0) {
								local207--;
							}
							local211 = local240;
							local223 = local240;
							label403: while (local211 > 0) {
								for (local289 = local207; local289 <= local217; local289++) {
									if ((local142 & Static181.anIntArrayArrayArray6[local211 - 1][local289][local173]) == 0) {
										break label403;
									}
								}
								local211--;
							}
							label392: while (local148 > local223) {
								for (local289 = local207; local289 <= local217; local289++) {
									if ((local142 & Static181.anIntArrayArrayArray6[local223 + 1][local289][local173]) == 0) {
										break label392;
									}
								}
								local223++;
							}
							local289 = (local223 + 1 - local211) * (local217 + 1 - local207);
							if (local289 >= 8) {
								local838 = Static165.anIntArrayArrayArray10[local211][local207][local173];
								local508 = Static165.anIntArrayArrayArray10[local223][local207][local173] - 240;
								Static80.method1287(local148, 2, local207 * 128, local217 * 128 + 128, local173 * 128, local173 * 128, local508, local838);
								for (local805 = local211; local805 <= local223; local805++) {
									for (local831 = local207; local831 <= local217; local831++) {
										Static181.anIntArrayArrayArray6[local805][local831][local173] &= ~local142;
									}
								}
							}
						}
						if ((Static181.anIntArrayArrayArray6[local240][local194][local173] & local144) != 0) {
							local217 = local194;
							local207 = local194;
							for (local211 = local173; local211 > 0 && (local144 & Static181.anIntArrayArrayArray6[local240][local194][local211 - 1]) != 0; local211--) {
							}
							for (local223 = local173; local223 < 104 && (Static181.anIntArrayArrayArray6[local240][local194][local223 + 1] & local144) != 0; local223++) {
							}
							label457: while (local207 > 0) {
								for (local289 = local211; local289 <= local223; local289++) {
									if ((Static181.anIntArrayArrayArray6[local240][local207 - 1][local289] & local144) == 0) {
										break label457;
									}
								}
								local207--;
							}
							label446: while (local217 < 104) {
								for (local289 = local211; local289 <= local223; local289++) {
									if ((local144 & Static181.anIntArrayArrayArray6[local240][local217 + 1][local289]) == 0) {
										break label446;
									}
								}
								local217++;
							}
							if ((local223 + 1 - local211) * (local217 + 1 - local207) >= 4) {
								local289 = Static165.anIntArrayArrayArray10[local240][local207][local211];
								Static80.method1287(local148, 4, local207 * 128, local217 * 128 + 128, local211 * 128, local223 * 128 + 128, local289, local289);
								for (local512 = local207; local512 <= local217; local512++) {
									for (local508 = local211; local508 <= local223; local508++) {
										Static181.anIntArrayArrayArray6[local240][local512][local508] &= ~local144;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method378() {
		aClass6_147 = null;
		aClass6_146 = null;
		aClass10_22 = null;
		anIntArray28 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)Lclient!oa;")
	public static Class2_Sub3_Sub12 method379(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub3_Sub12 local14 = (Class2_Sub3_Sub12) Static37.aClass17_6.method505((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(24) byte[] local24 = Static124.aClass10_Sub1_11.method1605(0, arg0);
		if (local24 == null) {
			return null;
		}
		local14 = new Class2_Sub3_Sub12();
		@Pc(39) int local39 = 0;
		@Pc(44) Class2_Sub13 local44 = new Class2_Sub13(local24);
		local44.anInt2154 = local44.aByteArray14.length - 12;
		@Pc(57) int local57 = local44.method1396();
		local14.anInt2770 = local44.method1397();
		local14.anInt2774 = local44.method1397();
		local14.anInt2772 = local44.method1397();
		local14.anInt2776 = local44.method1397();
		local44.anInt2154 = 0;
		local14.aClass6_792 = local44.method1445();
		local14.aClass6Array15 = new Class6[local57];
		local14.anIntArray234 = new int[local57];
		local14.anIntArray237 = new int[local57];
		while (local44.aByteArray14.length - 12 > local44.anInt2154) {
			@Pc(103) int local103 = local44.method1397();
			if (local103 == 3) {
				local14.aClass6Array15[local39] = local44.method1399();
			} else if (local103 >= 100 || local103 == 21 || local103 == 38 || local103 == 39) {
				local14.anIntArray234[local39] = local44.method1402();
			} else {
				local14.anIntArray234[local39] = local44.method1396();
			}
			local14.anIntArray237[local39++] = local103;
		}
		Static37.aClass17_6.method508((long) arg0, local14);
		return local14;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!me;B)Lclient!ai;")
	public static Class6 method380(@OriginalArg(1) Class2_Sub13 arg0) {
		try {
			@Pc(12) Class6 local12 = new Class6();
			local12.anInt165 = arg0.method1439();
			if (local12.anInt165 > 32767) {
				local12.anInt165 = 32767;
			}
			local12.aByteArray2 = new byte[local12.anInt165];
			arg0.anInt2154 += Static89.aClass58_1.method1739(local12.aByteArray2, arg0.aByteArray14, local12.anInt165, 0, arg0.anInt2154);
			return local12;
		} catch (@Pc(53) Exception local53) {
			return Static103.aClass6_715;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLclient!n;Z)V")
	public static void method381(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(2) int local2 = arg0.anInt2551;
		@Pc(6) int local6 = (int) arg0.aLong241;
		arg0.method2808();
		if (arg1) {
			Static70.method1105(local2);
		}
		Static32.method596(local2);
		@Pc(29) Class87 local29 = Static57.method940(local6);
		if (local29 != null) {
			Static151.method2327(local29);
		}
		Static46.anInt1322 = 0;
		Static160.aBoolean24 = false;
		Static133.method2089(Static144.anInt3388, Static171.anInt4010, Static105.anInt2554, Static96.anInt2389);
		if (anInt520 != -1) {
			Static63.method1013(1, anInt520);
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)[Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1[] method382() {
		@Pc(8) Class2_Sub3_Sub2_Sub1[] local8 = new Class2_Sub3_Sub2_Sub1[Static31.anInt774];
		for (@Pc(10) int local10 = 0; local10 < Static31.anInt774; local10++) {
			@Pc(16) Class2_Sub3_Sub2_Sub1 local16 = new Class2_Sub3_Sub2_Sub1();
			local16.anInt386 = Static130.anInt3018;
			local16.anInt383 = Static163.anInt3833;
			local16.anInt385 = Static76.anIntArray121[local10];
			local16.anInt382 = Static14.anIntArray16[local10];
			local16.anInt384 = Static88.anIntArray153[local10];
			local16.anInt387 = Static131.anIntArray278[local10];
			@Pc(46) byte[] local46 = Static167.aByteArrayArray10[local10];
			@Pc(52) int local52 = local16.anInt387 * local16.anInt384;
			local16.anIntArray14 = new int[local52];
			for (@Pc(58) int local58 = 0; local58 < local52; local58++) {
				local16.anIntArray14[local58] = Static127.anIntArray258[local46[local58] & 0xFF];
			}
			local8[local10] = local16;
		}
		Static49.method886();
		return local8;
	}
}
