import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "J")
	public static long aLong38;

	@OriginalMember(owner = "client!client", name = "G", descriptor = "Lclient!oh;")
	public static final Class252 aClass252_5 = new Class252(8, 1);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1093() {
		for (@Pc(1) int local1 = 0; local1 < Static458.anInt9736; local1++) {
			@Pc(6) int[] local6 = Static448.anIntArrayArray44[local1];
			for (@Pc(8) int local8 = 0; local8 < Static378.anInt6747; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1095() {
		@Pc(1) int local1 = Static75.anInt1461;
		@Pc(3) int[] local3 = Static167.anIntArray145;
		@Pc(20) boolean local20 = Static86.aClass1_Sub30_Sub1_1.anInt6193 == 1 && local1 > 200 || Static86.aClass1_Sub30_Sub1_1.anInt6193 == 0 && local1 > 50;
		@Pc(82) int local82;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class11_Sub1_Sub1_Sub3_Sub1 local29 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local3[local22]];
			if (!local29.method2949()) {
				local29.anInt7597 = -1;
			} else if (local29.aBoolean262) {
				local29.anInt7597 = -1;
			} else {
				local29.method6054();
				if (local29.aShort90 >= 0 && local29.aShort88 >= 0 && local29.aShort91 < Static458.anInt9736 && local29.aShort89 < Static378.anInt6747) {
					local29.aBoolean263 = local29.aBoolean575 ? local20 : false;
					if (local29 == Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2) {
						local29.anInt7597 = Integer.MAX_VALUE;
					} else {
						local82 = 0;
						if (!local29.aBoolean577) {
							local82++;
						}
						if (local29.anInt7537 > Static518.anInt9331) {
							local82 += 2;
						}
						local82 += 5 - local29.method6058() << 2;
						if (local29.aBoolean259) {
							local82 += 512;
						} else {
							if (Static293.anInt5290 == 0) {
								local82 += 32;
							} else {
								local82 += 128;
							}
							local82 += 256;
						}
						local29.anInt7597 = local82 + 1;
					}
				} else {
					local29.anInt7597 = -1;
				}
			}
		}
		for (@Pc(123) int local123 = 0; local123 < Static306.anInt4911; local123++) {
			@Pc(134) Class11_Sub1_Sub1_Sub3_Sub2 local134 = ((Class1_Sub33) Static372.aClass91_30.method2271((long) Static11.anIntArray12[local123])).aClass11_Sub1_Sub1_Sub3_Sub2_2;
			if (local134.method6087() && local134.aClass354_1.method7678(Static390.aClass353_29)) {
				local134.method6054();
				if (local134.aShort90 >= 0 && local134.aShort88 >= 0 && local134.aShort91 < Static458.anInt9736 && local134.aShort89 < Static378.anInt6747) {
					@Pc(171) int local171 = 0;
					if (!local134.aBoolean577) {
						local171++;
					}
					if (local134.anInt7537 > Static518.anInt9331) {
						local171 += 2;
					}
					local171 += 5 - local134.method6058() << 2;
					if (Static293.anInt5290 == 0) {
						if (local134.aClass354_1.aBoolean700) {
							local171 += 64;
						} else {
							local171 += 128;
						}
					} else if (Static293.anInt5290 == 1) {
						if (local134.aClass354_1.aBoolean700) {
							local171 += 32;
						} else {
							local171 += 64;
						}
					}
					if (local134.aClass354_1.aBoolean706) {
						local171 += 1024;
					} else if (!local134.aClass354_1.aBoolean705) {
						local171 += 256;
					}
					local134.anInt7597 = local171 + 1;
				} else {
					local134.anInt7597 = -1;
				}
			} else {
				local134.anInt7597 = -1;
			}
		}
		for (local82 = 0; local82 < Static243.aClass358Array1.length; local82++) {
			@Pc(237) Class358 local237 = Static243.aClass358Array1[local82];
			if (local237 != null) {
				if (local237.anInt9530 == 1) {
					@Pc(251) Class1_Sub33 local251 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local237.anInt9537);
					if (local251 != null) {
						@Pc(256) Class11_Sub1_Sub1_Sub3_Sub2 local256 = local251.aClass11_Sub1_Sub1_Sub3_Sub2_2;
						if (local256.anInt7597 >= 0) {
							local256.anInt7597 += 2048;
						}
					}
				} else if (local237.anInt9530 == 10) {
					@Pc(275) Class11_Sub1_Sub1_Sub3_Sub1 local275 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local237.anInt9537];
					if (local275 != null && local275 != Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 && local275.anInt7597 >= 0) {
						local275.anInt7597 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	public static void method1096(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static75.anInt1461;
		@Pc(3) int[] local3 = Static167.anIntArray145;
		@Pc(11) int local11 = Static332.aBoolean467 ? local1 : local1 + Static306.anInt4911;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class11_Sub1_Sub1_Sub3 local23;
			if (local13 < local1) {
				local23 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class1_Sub33) Static372.aClass91_30.method2271((long) Static11.anIntArray12[local13 - local1])).aClass11_Sub1_Sub1_Sub3_Sub2_2;
			}
			if (local23.aByte113 == arg0) {
				local23.anInt7523 = 0;
				if (local23.anInt7597 < 0) {
					local23.aBoolean577 = false;
				} else {
					@Pc(54) int local54 = local23.method6058();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt8902 & 0x1FF) != 0 || (local23.anInt8906 & 0x1FF) != 0) {
							local23.aBoolean577 = false;
							continue;
						}
					} else if ((local23.anInt8902 & 0x1FF) != 256 || (local23.anInt8906 & 0x1FF) != 256) {
						local23.aBoolean577 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt8902 >> 9;
						local101 = local23.anInt8906 >> 9;
						if (local23.anInt7597 != Static448.anIntArrayArray44[local96][local101]) {
							local23.aBoolean577 = true;
							continue;
						}
						if (Static313.anIntArrayArray26[local96][local101] > 1) {
							local126 = Static313.anIntArrayArray26[local96][local101]--;
							local23.aBoolean577 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt8902 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt8906 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt8902 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt8906 + local96 >> 9;
						if (!Static156.method2584(local155, local169, local101, local23.anInt7597, local162)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt7597 == Static448.anIntArrayArray44[local180][local183]) {
										local126 = Static313.anIntArrayArray26[local180][local183]--;
									}
								}
							}
							local23.aBoolean577 = true;
							continue;
						}
					}
					local23.aBoolean577 = false;
					local23.anInt8908 = Static538.method6114(local23.aByte113, local23.anInt8906, local23.anInt8902);
					Static89.method1396(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!in;)Lclient!in;")
	public static Class160 method1097(@OriginalArg(0) Class160 arg0) {
		@Pc(4) int local4 = method1098(arg0).method567();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static512.method7155(arg0.anInt4224);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!in;)Lclient!bb;")
	public static Class1_Sub10 method1098(@OriginalArg(0) Class160 arg0) {
		@Pc(13) Class1_Sub10 local13 = (Class1_Sub10) Static441.aClass91_34.method2271(((long) arg0.anInt4199 << 32) + (long) arg0.anInt4146);
		return local13 == null ? arg0.aClass1_Sub10_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1100() {
		@Pc(1) int local1 = Static75.anInt1461;
		@Pc(3) int[] local3 = Static167.anIntArray145;
		@Pc(11) int local11 = Static332.aBoolean467 ? local1 : local1 + Static306.anInt4911;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class11_Sub1_Sub1_Sub3 local23;
			if (local13 < local1) {
				local23 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class1_Sub33) Static372.aClass91_30.method2271((long) Static11.anIntArray12[local13 - local1])).aClass11_Sub1_Sub1_Sub3_Sub2_2;
			}
			if (local23.anInt7597 >= 0) {
				@Pc(43) int local43 = local23.method6058();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt8902 & 0x1FF) == 0 && (local23.anInt8906 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt8902 & 0x1FF) == 256 && (local23.anInt8906 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt8908 = Static538.method6114(local23.aByte113, local23.anInt8906, local23.anInt8902);
				Static89.method1396(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Z")
	public static boolean method1102(@OriginalArg(0) int arg0) {
		if (Static502.aBooleanArray32[arg0]) {
			return true;
		} else if (Static123.aClass308_49.method6566(arg0)) {
			@Pc(25) int local25 = Static123.aClass308_49.method6568(arg0);
			if (local25 == 0) {
				Static502.aBooleanArray32[arg0] = true;
				return true;
			}
			if (Static115.aClass160ArrayArray1[arg0] == null) {
				Static115.aClass160ArrayArray1[arg0] = new Class160[local25];
			}
			for (@Pc(52) int local52 = 0; local52 < local25; local52++) {
				if (Static115.aClass160ArrayArray1[arg0][local52] == null) {
					@Pc(66) byte[] local66 = Static123.aClass308_49.method6569(arg0, local52);
					if (local66 != null) {
						@Pc(78) Class160 local78 = Static115.aClass160ArrayArray1[arg0][local52] = new Class160();
						local78.anInt4199 = local52 + (arg0 << 16);
						if (local66[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local78.method3360(new Class1_Sub3(local66));
					}
				}
			}
			Static502.aBooleanArray32[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!in;IIIIIIIII)V")
	public static void method1104(@OriginalArg(0) Class160[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class160 local6 = arg0[local1];
			if (local6 != null && local6.anInt4224 == arg1) {
				@Pc(17) int local17 = local6.anInt4169 + arg6;
				@Pc(22) int local22 = local6.anInt4171 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt4166 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt4182;
					@Pc(45) int local45 = local22 + local6.anInt4156;
					if (local6.anInt4166 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt4166 == 0 || local6.aBoolean297 || method1098(local6).anInt658 != 0 || local6 == Static6.aClass160_45 || local6.anInt4186 == Static102.anInt1773 || local6.anInt4186 == Static382.anInt9703) {
					if (!method1106(local6)) {
						if (local6 == Static488.aClass160_36 && Static172.method2765(Static488.aClass160_36) != null) {
							Static263.aBoolean363 = true;
							Static78.anInt1530 = local17;
							Static251.anInt4599 = local22;
						}
						if (local6.aBoolean301 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean305 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(156) Class1_Sub22 local156 = (Class1_Sub22) Static438.aClass111_48.method2547(); local156 != null; local156 = (Class1_Sub22) Static438.aClass111_48.method2554()) {
									if (local156.aBoolean216) {
										local156.method7908();
										local156.aClass160_10.aBoolean296 = false;
									}
								}
								if (Static539.anInt9040 == 0) {
									Static488.aClass160_36 = null;
									Static6.aClass160_45 = null;
								}
								Static32.anInt689 = 0;
								Static81.aBoolean99 = false;
								Static409.aBoolean555 = false;
								if (!Static406.aBoolean553) {
									Static217.method3239();
								}
							}
							@Pc(212) boolean local212;
							if (Static216.aClass238_1.method5661() >= local28 && Static216.aClass238_1.method5653() >= local30 && Static216.aClass238_1.method5661() < local32 && Static216.aClass238_1.method5653() < local34) {
								local212 = true;
							} else {
								local212 = false;
							}
							if (!Static563.aBoolean697 && local212) {
								if (local6.anInt4170 >= 0) {
									Static422.anInt7430 = local6.anInt4170;
								} else if (local6.aBoolean305) {
									Static422.anInt7430 = -1;
								}
							}
							if (!Static406.aBoolean553 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static263.method3800(local6, arg8 - local17, arg9 - local22);
							}
							@Pc(256) boolean local256 = false;
							if (Static216.aClass238_1.method5652() && local212) {
								local256 = true;
							}
							@Pc(266) boolean local266 = false;
							@Pc(271) Class1_Sub12 local271 = (Class1_Sub12) Static121.aClass111_9.method2547();
							if (local271 != null && local271.method6688() == 0 && local271.method6682() >= local28 && local271.method6689() >= local30 && local271.method6682() < local32 && local271.method6689() < local34) {
								local266 = true;
							}
							@Pc(307) int local307;
							@Pc(441) int local441;
							if (local6.aByteArray33 != null && !Static130.method2281()) {
								for (local307 = 0; local307 < local6.aByteArray33.length; local307++) {
									if (Static326.aClass97_3.method2365(local6.aByteArray33[local307])) {
										if (local6.anIntArray211 == null || Static518.anInt9331 >= local6.anIntArray211[local307]) {
											@Pc(339) byte local339 = local6.aByteArray32[local307];
											if (local339 == 0 || ((local339 & 0x8) == 0 || !Static326.aClass97_3.method2365(86) && !Static326.aClass97_3.method2365(82) && !Static326.aClass97_3.method2365(81)) && ((local339 & 0x2) == 0 || Static326.aClass97_3.method2365(86)) && ((local339 & 0x1) == 0 || Static326.aClass97_3.method2365(82)) && ((local339 & 0x4) == 0 || Static326.aClass97_3.method2365(81))) {
												if (local307 < 10) {
													Static30.method577(local307 + 1, local6.anInt4199, -1, "");
												} else if (local307 == 10) {
													Static193.method3074();
													@Pc(410) Class1_Sub10 local410 = method1098(local6);
													Static330.method4880(local410.anInt649, local6, local410.method574());
													Static318.aString69 = Static573.method7727(local6);
													if (Static318.aString69 == null) {
														Static318.aString69 = "Null";
													}
													Static146.aString26 = local6.aString45 + "<col=ffffff>";
												}
												local441 = local6.anIntArray207[local307];
												if (local6.anIntArray211 == null) {
													local6.anIntArray211 = new int[local6.aByteArray33.length];
												}
												if (local441 == 0) {
													local6.anIntArray211[local307] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray211[local307] = Static518.anInt9331 + local441;
												}
											}
										}
									} else if (local6.anIntArray211 != null) {
										local6.anIntArray211[local307] = 0;
									}
								}
							}
							if (local266) {
								Static316.method4700(local6, local271.method6682() - local17, local271.method6689() - local22);
							}
							if (Static488.aClass160_36 != null && Static488.aClass160_36 != local6 && local212 && method1098(local6).method570()) {
								Static348.aClass160_23 = local6;
							}
							if (local6 == Static6.aClass160_45) {
								Static241.aBoolean321 = true;
								Static114.anInt1942 = local17;
								Static540.anInt9051 = local22;
							}
							if (local6.aBoolean297 || local6.anInt4186 != 0) {
								@Pc(526) Class1_Sub22 local526;
								if (local212 && Static415.anInt7330 != 0 && local6.anObjectArray6 != null) {
									local526 = new Class1_Sub22();
									local526.aBoolean216 = true;
									local526.aClass160_10 = local6;
									local526.anInt2858 = Static415.anInt7330;
									local526.anObjectArray1 = local6.anObjectArray6;
									Static438.aClass111_48.method2552(local526);
								}
								if (Static488.aClass160_36 != null || Static406.aBoolean553 || local6.anInt4186 != Static376.anInt1806 && Static32.anInt689 > 0) {
									local266 = false;
									local256 = false;
									local212 = false;
								}
								@Pc(681) int local681;
								if (local6.anInt4186 != 0) {
									if (local6.anInt4186 == Static471.anInt8086 || local6.anInt4186 == Static30.anInt661) {
										Static428.aClass160_30 = local6;
										if (Static242.aClass289_1 != null) {
											Static242.aClass289_1.method6206(Static31.aClass78_18, local6.anInt4156);
										}
										if (local6.anInt4186 == Static471.anInt8086) {
											if (!Static406.aBoolean553 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static388.method5587(arg8, arg9, Static31.aClass78_18);
												for (@Pc(609) Class11_Sub6 local609 = (Class11_Sub6) Static312.aClass196_4.method4024(); local609 != null; local609 = (Class11_Sub6) Static312.aClass196_4.method4028()) {
													if (arg8 >= local609.anInt4094 && arg8 < local609.anInt4098 && arg9 >= local609.anInt4097 && arg9 < local609.anInt4096) {
														Static217.method3239();
														Static507.method7107(local609.aClass11_Sub1_Sub1_Sub3_1);
													}
												}
											}
											Static273.method1045(local6, local22, local17);
											continue;
										}
									}
									@Pc(720) int local720;
									if (local6.anInt4186 == Static102.anInt1773) {
										if (local6.method3361(Static31.aClass78_18) == null || Static71.anInt1363 != 0 && Static71.anInt1363 != 3 || Static406.aBoolean553 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local307 = arg8 - local17;
										local681 = arg9 - local22;
										local441 = local6.anIntArray203[local681];
										if (local307 < local441 || local307 > local441 + local6.anIntArray204[local681]) {
											continue;
										}
										local307 -= local6.anInt4182 / 2;
										local681 -= local6.anInt4156 / 2;
										if (Static358.anInt9363 == 4) {
											local720 = (int) Static331.aFloat172 & 0x3FFF;
										} else {
											local720 = (int) Static331.aFloat172 + Static272.anInt5007 & 0x3FFF;
										}
										@Pc(732) int local732 = Class85_Sub8.anIntArray426[local720];
										@Pc(736) int local736 = Class85_Sub8.anIntArray427[local720];
										if (Static358.anInt9363 != 4) {
											local732 = local732 * (Static267.anInt4887 + 256) >> 8;
											local736 = local736 * (Static267.anInt4887 + 256) >> 8;
										}
										@Pc(765) int local765 = local681 * local732 + local307 * local736 >> 14;
										@Pc(775) int local775 = local681 * local736 - local307 * local732 >> 14;
										@Pc(786) int local786;
										@Pc(794) int local794;
										if (Static358.anInt9363 == 4) {
											local786 = (Static576.anInt4080 >> 9) + (local765 >> 2);
											local794 = (Static273.anInt1191 >> 9) - (local775 >> 2);
										} else {
											@Pc(803) int local803 = (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.method6058() - 1) * 256;
											local786 = (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902 - local803 >> 9) + (local765 >> 2);
											local794 = (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906 - local803 >> 9) - (local775 >> 2);
										}
										if (Static563.aBoolean697 && (Static420.anInt7401 & 0x40) != 0) {
											@Pc(836) Class160 local836 = Static420.method5959(Static594.anInt9808, Static299.anInt5617);
											if (local836 == null) {
												Static193.method3074();
											} else {
												Static385.method5573(9, local794, Static318.aString69, Static385.anInt6906, false, true, " ->", 1L, local786, local6.anInt4205);
											}
											continue;
										}
										if (Static101.aClass42_1 == Static110.aClass42_2) {
											Static385.method5573(4, local794, Static375.aClass253_31.method5453(Static161.anInt3095), -1, false, true, "", 1L, local786, -1);
										}
										Static385.method5573(23, local794, Static383.aString80, Static358.anInt9364, false, true, "", 1L, local786, -1);
										continue;
									}
									if (local6.anInt4186 == Static376.anInt1806) {
										Static345.aClass160_44 = local6;
										if (local212) {
											Static81.aBoolean99 = true;
										}
										if (local266) {
											local307 = (int) ((double) (local271.method6682() - local17 - local6.anInt4182 / 2) * 2.0D / (double) Static287.aFloat105);
											local681 = (int) -((double) (local271.method6689() - local22 - local6.anInt4156 / 2) * 2.0D / (double) Static287.aFloat105);
											local441 = Static500.anInt8734 + local307 + Static287.anInt3859;
											local720 = Static249.anInt4547 + local681 + Static287.anInt3862;
											@Pc(950) Class1_Sub8_Sub11 local950 = Static178.method2824();
											if (local950 == null) {
												continue;
											}
											@Pc(955) int[] local955 = new int[3];
											local950.method5977(local955, local441, local720);
											if (local955 != null) {
												if (Static326.aClass97_3.method2365(82) && Static203.anInt3822 > 0) {
													Static499.method7030(local955[0], local955[1], local955[2]);
													continue;
												}
												Static409.aBoolean555 = true;
												Static506.anInt8779 = local955[0];
												Static311.anInt5697 = local955[1];
												Static210.anInt3910 = local955[2];
											}
											Static32.anInt689 = 1;
											Static573.aBoolean708 = false;
											Static419.anInt7395 = Static216.aClass238_1.method5661();
											Static41.anInt8212 = Static216.aClass238_1.method5653();
											continue;
										}
										if (local256 && Static32.anInt689 > 0) {
											if (Static32.anInt689 == 1 && (Static419.anInt7395 != Static216.aClass238_1.method5661() || Static41.anInt8212 != Static216.aClass238_1.method5653())) {
												Static219.anInt4019 = Static500.anInt8734;
												Static75.anInt1453 = Static249.anInt4547;
												Static32.anInt689 = 2;
											}
											if (Static32.anInt689 == 2) {
												Static573.aBoolean708 = true;
												Static291.method4349(Static219.anInt4019 + (int) ((double) (Static419.anInt7395 - Static216.aClass238_1.method5661()) * 2.0D / (double) Static287.aFloat106));
												Static334.method4915(Static75.anInt1453 - (int) ((double) (Static41.anInt8212 - Static216.aClass238_1.method5653()) * 2.0D / (double) Static287.aFloat106));
											}
											continue;
										}
										if (Static32.anInt689 > 0 && !Static573.aBoolean708) {
											if ((Static579.anInt9553 == 1 || Static205.method3166()) && Static22.anInt572 > 2) {
												Static7.method209(Static419.anInt7395, Static41.anInt8212);
											} else if (Static406.method5824()) {
												Static7.method209(Static419.anInt7395, Static41.anInt8212);
											}
										}
										Static32.anInt689 = 0;
										continue;
									}
									if (local6.anInt4186 == Static16.anInt468) {
										if (local256) {
											Static456.method6415(local6.anInt4156, local6.anInt4182, Static216.aClass238_1.method5653() - local22, Static216.aClass238_1.method5661() - local17);
										}
										continue;
									}
									if (local6.anInt4186 == Static382.anInt9703) {
										Static443.method6237(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean300 && local266) {
									local6.aBoolean300 = true;
									if (local6.anObjectArray8 != null) {
										local526 = new Class1_Sub22();
										local526.aBoolean216 = true;
										local526.aClass160_10 = local6;
										local526.anInt2862 = local271.method6682() - local17;
										local526.anInt2858 = local271.method6689() - local22;
										local526.anObjectArray1 = local6.anObjectArray8;
										Static438.aClass111_48.method2552(local526);
									}
								}
								if (local6.aBoolean300 && local256 && local6.anObjectArray18 != null) {
									local526 = new Class1_Sub22();
									local526.aBoolean216 = true;
									local526.aClass160_10 = local6;
									local526.anInt2862 = Static216.aClass238_1.method5661() - local17;
									local526.anInt2858 = Static216.aClass238_1.method5653() - local22;
									local526.anObjectArray1 = local6.anObjectArray18;
									Static438.aClass111_48.method2552(local526);
								}
								if (local6.aBoolean300 && !local256) {
									local6.aBoolean300 = false;
									if (local6.anObjectArray31 != null) {
										local526 = new Class1_Sub22();
										local526.aBoolean216 = true;
										local526.aClass160_10 = local6;
										local526.anInt2862 = Static216.aClass238_1.method5661() - local17;
										local526.anInt2858 = Static216.aClass238_1.method5653() - local22;
										local526.anObjectArray1 = local6.anObjectArray31;
										Static25.aClass111_2.method2552(local526);
									}
								}
								if (local256 && local6.anObjectArray27 != null) {
									local526 = new Class1_Sub22();
									local526.aBoolean216 = true;
									local526.aClass160_10 = local6;
									local526.anInt2862 = Static216.aClass238_1.method5661() - local17;
									local526.anInt2858 = Static216.aClass238_1.method5653() - local22;
									local526.anObjectArray1 = local6.anObjectArray27;
									Static438.aClass111_48.method2552(local526);
								}
								if (!local6.aBoolean296 && local212) {
									local6.aBoolean296 = true;
									if (local6.anObjectArray21 != null) {
										local526 = new Class1_Sub22();
										local526.aBoolean216 = true;
										local526.aClass160_10 = local6;
										local526.anInt2862 = Static216.aClass238_1.method5661() - local17;
										local526.anInt2858 = Static216.aClass238_1.method5653() - local22;
										local526.anObjectArray1 = local6.anObjectArray21;
										Static438.aClass111_48.method2552(local526);
									}
								}
								if (local6.aBoolean296 && local212 && local6.anObjectArray29 != null) {
									local526 = new Class1_Sub22();
									local526.aBoolean216 = true;
									local526.aClass160_10 = local6;
									local526.anInt2862 = Static216.aClass238_1.method5661() - local17;
									local526.anInt2858 = Static216.aClass238_1.method5653() - local22;
									local526.anObjectArray1 = local6.anObjectArray29;
									Static438.aClass111_48.method2552(local526);
								}
								if (local6.aBoolean296 && !local212) {
									local6.aBoolean296 = false;
									if (local6.anObjectArray24 != null) {
										local526 = new Class1_Sub22();
										local526.aBoolean216 = true;
										local526.aClass160_10 = local6;
										local526.anInt2862 = Static216.aClass238_1.method5661() - local17;
										local526.anInt2858 = Static216.aClass238_1.method5653() - local22;
										local526.anObjectArray1 = local6.anObjectArray24;
										Static25.aClass111_2.method2552(local526);
									}
								}
								if (local6.anObjectArray22 != null) {
									local526 = new Class1_Sub22();
									local526.aClass160_10 = local6;
									local526.anObjectArray1 = local6.anObjectArray22;
									Static464.aClass111_64.method2552(local526);
								}
								@Pc(1494) Class1_Sub22 local1494;
								if (local6.anObjectArray28 != null && Static316.anInt5789 > local6.anInt4147) {
									if (local6.anIntArray202 == null || Static316.anInt5789 - local6.anInt4147 > 32) {
										local526 = new Class1_Sub22();
										local526.aClass160_10 = local6;
										local526.anObjectArray1 = local6.anObjectArray28;
										Static438.aClass111_48.method2552(local526);
									} else {
										label683: for (local307 = local6.anInt4147; local307 < Static316.anInt5789; local307++) {
											local681 = Static180.anIntArray598[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray202.length; local441++) {
												if (local6.anIntArray202[local441] == local681) {
													local1494 = new Class1_Sub22();
													local1494.aClass160_10 = local6;
													local1494.anObjectArray1 = local6.anObjectArray28;
													Static438.aClass111_48.method2552(local1494);
													break label683;
												}
											}
										}
									}
									local6.anInt4147 = Static316.anInt5789;
								}
								if (local6.anObjectArray16 != null && Static465.anInt8053 > local6.anInt4187) {
									if (local6.anIntArray205 == null || Static465.anInt8053 - local6.anInt4187 > 32) {
										local526 = new Class1_Sub22();
										local526.aClass160_10 = local6;
										local526.anObjectArray1 = local6.anObjectArray16;
										Static438.aClass111_48.method2552(local526);
									} else {
										label659: for (local307 = local6.anInt4187; local307 < Static465.anInt8053; local307++) {
											local681 = Static160.anIntArray140[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray205.length; local441++) {
												if (local6.anIntArray205[local441] == local681) {
													local1494 = new Class1_Sub22();
													local1494.aClass160_10 = local6;
													local1494.anObjectArray1 = local6.anObjectArray16;
													Static438.aClass111_48.method2552(local1494);
													break label659;
												}
											}
										}
									}
									local6.anInt4187 = Static465.anInt8053;
								}
								if (local6.anObjectArray20 != null && Static317.anInt9284 > local6.anInt4223) {
									if (local6.anIntArray208 == null || Static317.anInt9284 - local6.anInt4223 > 32) {
										local526 = new Class1_Sub22();
										local526.aClass160_10 = local6;
										local526.anObjectArray1 = local6.anObjectArray20;
										Static438.aClass111_48.method2552(local526);
									} else {
										label635: for (local307 = local6.anInt4223; local307 < Static317.anInt9284; local307++) {
											local681 = Static537.anIntArray566[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray208.length; local441++) {
												if (local6.anIntArray208[local441] == local681) {
													local1494 = new Class1_Sub22();
													local1494.aClass160_10 = local6;
													local1494.anObjectArray1 = local6.anObjectArray20;
													Static438.aClass111_48.method2552(local1494);
													break label635;
												}
											}
										}
									}
									local6.anInt4223 = Static317.anInt9284;
								}
								if (local6.anObjectArray5 != null && Static188.anInt3737 > local6.anInt4215) {
									if (local6.anIntArray206 == null || Static188.anInt3737 - local6.anInt4215 > 32) {
										local526 = new Class1_Sub22();
										local526.aClass160_10 = local6;
										local526.anObjectArray1 = local6.anObjectArray5;
										Static438.aClass111_48.method2552(local526);
									} else {
										label611: for (local307 = local6.anInt4215; local307 < Static188.anInt3737; local307++) {
											local681 = Static125.anIntArray98[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray206.length; local441++) {
												if (local6.anIntArray206[local441] == local681) {
													local1494 = new Class1_Sub22();
													local1494.aClass160_10 = local6;
													local1494.anObjectArray1 = local6.anObjectArray5;
													Static438.aClass111_48.method2552(local1494);
													break label611;
												}
											}
										}
									}
									local6.anInt4215 = Static188.anInt3737;
								}
								if (local6.anObjectArray12 != null && Static501.anInt8747 > local6.anInt4161) {
									if (local6.anIntArray209 == null || Static501.anInt8747 - local6.anInt4161 > 32) {
										local526 = new Class1_Sub22();
										local526.aClass160_10 = local6;
										local526.anObjectArray1 = local6.anObjectArray12;
										Static438.aClass111_48.method2552(local526);
									} else {
										label587: for (local307 = local6.anInt4161; local307 < Static501.anInt8747; local307++) {
											local681 = Static154.anIntArray130[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray209.length; local441++) {
												if (local6.anIntArray209[local441] == local681) {
													local1494 = new Class1_Sub22();
													local1494.aClass160_10 = local6;
													local1494.anObjectArray1 = local6.anObjectArray12;
													Static438.aClass111_48.method2552(local1494);
													break label587;
												}
											}
										}
									}
									local6.anInt4161 = Static501.anInt8747;
								}
								if (Static203.anInt3823 > local6.anInt4152 && local6.anObjectArray3 != null) {
									local526 = new Class1_Sub22();
									local526.aClass160_10 = local6;
									local526.anObjectArray1 = local6.anObjectArray3;
									Static438.aClass111_48.method2552(local526);
								}
								if (Static544.anInt9118 > local6.anInt4152 && local6.anObjectArray30 != null) {
									local526 = new Class1_Sub22();
									local526.aClass160_10 = local6;
									local526.anObjectArray1 = local6.anObjectArray30;
									Static438.aClass111_48.method2552(local526);
								}
								if (Static364.anInt8302 > local6.anInt4152 && local6.anObjectArray25 != null) {
									local526 = new Class1_Sub22();
									local526.aClass160_10 = local6;
									local526.anObjectArray1 = local6.anObjectArray25;
									Static438.aClass111_48.method2552(local526);
								}
								if (Static242.anInt4480 > local6.anInt4152 && local6.anObjectArray15 != null) {
									local526 = new Class1_Sub22();
									local526.aClass160_10 = local6;
									local526.anObjectArray1 = local6.anObjectArray15;
									Static438.aClass111_48.method2552(local526);
								}
								if (Static303.anInt5647 > local6.anInt4152 && local6.anObjectArray17 != null) {
									local526 = new Class1_Sub22();
									local526.aClass160_10 = local6;
									local526.anObjectArray1 = local6.anObjectArray17;
									Static438.aClass111_48.method2552(local526);
								}
								local6.anInt4152 = Static259.anInt4739;
								if (local6.anObjectArray2 != null) {
									for (local307 = 0; local307 < Static149.anInt2839; local307++) {
										@Pc(1962) Class1_Sub22 local1962 = new Class1_Sub22();
										local1962.aClass160_10 = local6;
										local1962.anInt2857 = Static294.anInterface14Array2[local307].method6440();
										local1962.anInt2860 = Static294.anInterface14Array2[local307].method6441();
										local1962.anObjectArray1 = local6.anObjectArray2;
										Static438.aClass111_48.method2552(local1962);
									}
								}
								if (Static41.aBoolean615 && local6.anObjectArray19 != null) {
									local526 = new Class1_Sub22();
									local526.aClass160_10 = local6;
									local526.anObjectArray1 = local6.anObjectArray19;
									Static438.aClass111_48.method2552(local526);
								}
							}
							if (local6.anInt4166 == 5 && local6.anInt4180 != -1) {
								local6.method3365(Static544.aClass237_1, Static40.aClass164_1).method6206(Static31.aClass78_18, local6.anInt4156);
							}
							Static350.method5207(local6);
							if (local6.anInt4166 == 0) {
								method1104(arg0, local6.anInt4199, local28, local30, local32, local34, local17 - local6.anInt4211, local22 - local6.anInt4218, arg8, arg9);
								if (local6.aClass160Array1 != null) {
									method1104(local6.aClass160Array1, local6.anInt4199, local28, local30, local32, local34, local17 - local6.anInt4211, local22 - local6.anInt4218, arg8, arg9);
								}
								@Pc(2084) Class1_Sub38 local2084 = (Class1_Sub38) Static148.aClass91_6.method2271((long) local6.anInt4199);
								if (local2084 != null) {
									if (Static101.aClass42_1 == Static354.aClass42_4 && local2084.anInt7675 == 0 && !Static406.aBoolean553 && local212 && !Static506.aBoolean659) {
										Static217.method3239();
									}
									Static535.method5756(local22, local2084.anInt7676, local28, local30, local17, local32, arg9, arg8, local34);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static350.method5207(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!in;)Z")
	public static boolean method1106(@OriginalArg(0) Class160 arg0) {
		if (Static506.aBoolean659) {
			if (method1098(arg0).anInt658 != 0) {
				return false;
			}
			if (arg0.anInt4166 == 0) {
				return false;
			}
		}
		return arg0.aBoolean295;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1108() {
		Static1.anInt38 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static306.anInt4911; local3++) {
			@Pc(14) Class11_Sub1_Sub1_Sub3_Sub2 local14 = ((Class1_Sub33) Static372.aClass91_30.method2271((long) Static11.anIntArray12[local3])).aClass11_Sub1_Sub1_Sub3_Sub2_2;
			if (local14.aBoolean577 && local14.method6076() != -1) {
				@Pc(32) int local32 = (local14.method6058() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt8902 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt8906 - local32 >> 9;
				@Pc(53) Class11_Sub1_Sub1_Sub3 local53 = Static479.method6647(local14.aByte113, local39, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt7524;
					if (local53 instanceof Class11_Sub1_Sub1_Sub3_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt7523 == 0 && local53.method6076() != -1) {
						Static594.anIntArray619[Static1.anInt38] = local58;
						Static403.anIntArray430[Static1.anInt38] = local58;
						Static1.anInt38++;
						local53.anInt7523++;
					}
					Static594.anIntArray619[Static1.anInt38] = local58;
					Static403.anIntArray430[Static1.anInt38] = local14.anInt7524 + 2048;
					Static1.anInt38++;
					local53.anInt7523++;
				}
			}
		}
		Static186.method3007(0, Static594.anIntArray619, Static403.anIntArray430, Static1.anInt38 - 1);
	}

	@OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
	public static void method1109(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static75.anInt1461;
		@Pc(3) int[] local3 = Static167.anIntArray145;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static306.anInt4911; local5++) {
			@Pc(15) Class11_Sub1_Sub1_Sub3 local15;
			if (local5 < local1) {
				local15 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class1_Sub33) Static372.aClass91_30.method2271((long) Static11.anIntArray12[local5 - local1])).aClass11_Sub1_Sub1_Sub3_Sub2_2;
			}
			if (local15.aByte113 == arg0 && local15.anInt7597 >= 0) {
				@Pc(39) int local39 = local15.method6058();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt8902 & 0x1FF) != 0 || (local15.anInt8906 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt8902 & 0x1FF) != 256 || (local15.anInt8906 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt8902 >> 9;
					local80 = local15.anInt8906 >> 9;
					if (local15.anInt7597 > Static448.anIntArrayArray44[local75][local80]) {
						Static448.anIntArrayArray44[local75][local80] = local15.anInt7597;
						Static313.anIntArrayArray26[local75][local80] = 1;
					} else if (local15.anInt7597 == Static448.anIntArrayArray44[local75][local80]) {
						local116 = Static313.anIntArrayArray26[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt8902 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt8906 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt8902 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt8906 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt7597 > Static448.anIntArrayArray44[local158][local161]) {
								Static448.anIntArrayArray44[local158][local161] = local15.anInt7597;
								Static313.anIntArrayArray26[local158][local161] = 1;
							} else if (local15.anInt7597 == Static448.anIntArrayArray44[local158][local161]) {
								local116 = Static313.anIntArrayArray26[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}
}
