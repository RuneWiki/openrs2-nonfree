import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_39 = new Class56(46, 4);

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!jk;")
	public static final Class137 aClass137_9 = new Class137(200);

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_40 = new Class56(28, 6);

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_41 = new Class56(78, 3);

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method750(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static438.anInt2796;
		@Pc(3) int[] local3 = Static78.anIntArray114;
		@Pc(11) int local11 = Static132.aBoolean159 ? local1 : local1 + Static148.anInt2692;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class8_Sub3_Sub1 local23;
			if (local13 < local1) {
				local23 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = Static367.aClass8_Sub3_Sub1_Sub2Array1[Static106.anIntArray150[local13 - local1]];
			}
			if (local23.aByte99 == arg0) {
				local23.anInt7410 = 0;
				if (local23.anInt7352 < 0) {
					local23.aBoolean522 = false;
				} else {
					@Pc(50) int local50 = local23.method5894();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt7339 & 0x7F) != 0 || (local23.anInt7343 & 0x7F) != 0) {
							local23.aBoolean522 = false;
							continue;
						}
					} else if ((local23.anInt7339 & 0x7F) != 64 || (local23.anInt7343 & 0x7F) != 64) {
						local23.aBoolean522 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt7339 >> 7;
						local97 = local23.anInt7343 >> 7;
						if (local23.anInt7352 != Static138.anIntArrayArray30[local92][local97]) {
							local23.aBoolean522 = true;
							continue;
						}
						if (Static401.anIntArrayArray57[local92][local97] > 1) {
							local122 = Static401.anIntArrayArray57[local92][local97]--;
							local23.aBoolean522 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt7339 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt7343 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt7339 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt7343 + local92 >> 7;
						if (!Static255.method3371(local97, local151, local158, local23.anInt7352, local165)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt7352 == Static138.anIntArrayArray30[local176][local179]) {
										local122 = Static401.anIntArrayArray57[local176][local179]--;
									}
								}
							}
							local23.aBoolean522 = true;
							continue;
						}
					}
					if (local23 instanceof Class8_Sub3_Sub1_Sub1 && local23.aClass4_Sub3_3 != null && Static265.anInt4371 >= local23.aClass4_Sub3_3.anInt157 && Static265.anInt4371 < local23.aClass4_Sub3_3.anInt156) {
						((Class8_Sub3_Sub1_Sub1) local23).aBoolean401 = false;
					}
					local23.aBoolean522 = false;
					local23.anInt7341 = Static94.method4425(local23.anInt7343, local23.aByte99, local23.anInt7339);
					Static160.method3989(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method751() {
		@Pc(1) int local1 = Static438.anInt2796;
		@Pc(3) int[] local3 = Static78.anIntArray114;
		@Pc(11) int local11 = Static132.aBoolean159 ? local1 : local1 + Static148.anInt2692;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class8_Sub3_Sub1 local23;
			if (local13 < local1) {
				local23 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = Static367.aClass8_Sub3_Sub1_Sub2Array1[Static106.anIntArray150[local13 - local1]];
			}
			if (local23.anInt7352 >= 0) {
				@Pc(39) int local39 = local23.method5894();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt7339 & 0x7F) == 0 && (local23.anInt7343 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt7339 & 0x7F) == 64 && (local23.anInt7343 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class8_Sub3_Sub1_Sub1 && local23.aClass4_Sub3_3 != null && Static265.anInt4371 >= local23.aClass4_Sub3_3.anInt157 && Static265.anInt4371 < local23.aClass4_Sub3_3.anInt156) {
					((Class8_Sub3_Sub1_Sub1) local23).aBoolean401 = false;
				}
				local23.anInt7341 = Static94.method4425(local23.anInt7343, local23.aByte99, local23.anInt7339);
				Static160.method3989(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hd;)Lclient!jr;")
	public static Class4_Sub20 method752(@OriginalArg(0) Class110 arg0) {
		@Pc(13) Class4_Sub20 local13 = (Class4_Sub20) Static159.aClass67_18.method1429(((long) arg0.anInt2675 << 32) + (long) arg0.anInt2585);
		return local13 == null ? arg0.aClass4_Sub20_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method753() {
		Static66.aClass137_10.method2739();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!hd;)Lclient!hd;")
	public static Class110 method754(@OriginalArg(0) Class110 arg0) {
		@Pc(4) int local4 = method752(arg0).method2789();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static235.method3185(arg0.anInt2649);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLclient!tf;)V")
	public static void method757(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9_Sub2 arg1) {
		@Pc(19) boolean local19 = arg1.method5071(1) == 1;
		if (local19) {
			Static86.anIntArray127[Static176.anInt3194++] = arg0;
		}
		@Pc(38) int local38 = arg1.method5071(2);
		@Pc(42) Class8_Sub3_Sub1_Sub1 local42 = Static267.aClass8_Sub3_Sub1_Sub1Array1[arg0];
		if (local38 != 0) {
			@Pc(152) int local152;
			@Pc(157) int local157;
			@Pc(162) int local162;
			if (local38 == 1) {
				local152 = arg1.method5071(3);
				local157 = local42.anIntArray560[0];
				local162 = local42.anIntArray559[0];
				if (local152 == 0) {
					local157--;
					local162--;
				} else if (local152 == 1) {
					local162--;
				} else if (local152 == 2) {
					local157++;
					local162--;
				} else if (local152 == 3) {
					local157--;
				} else if (local152 == 4) {
					local157++;
				} else if (local152 == 5) {
					local157--;
					local162++;
				} else if (local152 == 6) {
					local162++;
				} else if (local152 == 7) {
					local162++;
					local157++;
				}
				if (local19) {
					local42.anInt5674 = local162;
					local42.anInt5653 = local157;
					local42.aBoolean402 = true;
				} else {
					local42.method4563(local162, Static37.aByteArray6[arg0], local157);
				}
			} else if (local38 == 2) {
				local152 = arg1.method5071(4);
				local157 = local42.anIntArray560[0];
				local162 = local42.anIntArray559[0];
				if (local152 == 0) {
					local162 -= 2;
					local157 -= 2;
				} else if (local152 == 1) {
					local162 -= 2;
					local157--;
				} else if (local152 == 2) {
					local162 -= 2;
				} else if (local152 == 3) {
					local157++;
					local162 -= 2;
				} else if (local152 == 4) {
					local162 -= 2;
					local157 += 2;
				} else if (local152 == 5) {
					local162--;
					local157 -= 2;
				} else if (local152 == 6) {
					local157 += 2;
					local162--;
				} else if (local152 == 7) {
					local157 -= 2;
				} else if (local152 == 8) {
					local157 += 2;
				} else if (local152 == 9) {
					local157 -= 2;
					local162++;
				} else if (local152 == 10) {
					local162++;
					local157 += 2;
				} else if (local152 == 11) {
					local162 += 2;
					local157 -= 2;
				} else if (local152 == 12) {
					local162 += 2;
					local157--;
				} else if (local152 == 13) {
					local162 += 2;
				} else if (local152 == 14) {
					local157++;
					local162 += 2;
				} else if (local152 == 15) {
					local162 += 2;
					local157 += 2;
				}
				if (local19) {
					local42.aBoolean402 = true;
					local42.anInt5674 = local162;
					local42.anInt5653 = local157;
				} else {
					local42.method4563(local162, Static37.aByteArray6[arg0], local157);
				}
			} else {
				local152 = arg1.method5071(1);
				@Pc(434) int local434;
				@Pc(444) int local444;
				@Pc(457) int local457;
				@Pc(465) int local465;
				if (local152 == 0) {
					local157 = arg1.method5071(12);
					local162 = local157 >> 10;
					local434 = local157 >> 5 & 0x1F;
					if (local434 > 15) {
						local434 -= 32;
					}
					local444 = local157 & 0x1F;
					if (local444 > 15) {
						local444 -= 32;
					}
					local457 = local42.anIntArray560[0] + local434;
					local465 = local42.anIntArray559[0] + local444;
					if (local19) {
						local42.aBoolean402 = true;
						local42.anInt5674 = local465;
						local42.anInt5653 = local457;
					} else {
						local42.method4563(local465, Static37.aByteArray6[arg0], local457);
					}
					local42.aByte99 = (byte) (local162 + local42.aByte99 & 0x3);
					if (arg0 == Static12.anInt187) {
						Static68.anInt1387 = local42.aByte99;
					}
				} else {
					local157 = arg1.method5071(30);
					local162 = local157 >> 28;
					local434 = local157 >> 14 & 0x3FFF;
					local444 = local157 & 0x3FFF;
					local457 = (Static365.anInt6047 + local42.anIntArray560[0] + local434 & 0x3FFF) - Static365.anInt6047;
					local465 = (Static366.anInt6052 + local42.anIntArray559[0] + local444 & 0x3FFF) - Static366.anInt6052;
					if (local19) {
						local42.anInt5653 = local457;
						local42.anInt5674 = local465;
						local42.aBoolean402 = true;
					} else {
						local42.method4563(local465, Static37.aByteArray6[arg0], local457);
					}
					local42.aByte99 = (byte) (local162 + local42.aByte99 & 0x3);
					if (arg0 == Static12.anInt187) {
						Static68.anInt1387 = local42.aByte99;
					}
				}
			}
		} else if (local19) {
			local42.aBoolean402 = false;
		} else if (arg0 == Static12.anInt187) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(66) Class272 local66 = Static302.aClass272Array1[arg0] = new Class272();
			local66.anInt7663 = (Static366.anInt6052 + local42.anIntArray559[0] >> 6) + (local42.anIntArray560[0] + Static365.anInt6047 >> 6 << 14) + (local42.aByte99 << 28);
			if (local42.anInt5671 == -1) {
				local66.anInt7659 = local42.aClass120_7.method2297();
			} else {
				local66.anInt7659 = local42.anInt5671;
			}
			local66.anInt7662 = local42.anInt7394;
			local66.aBoolean538 = local42.aBoolean399;
			if (local42.anInt5667 > 0) {
				Static222.method3017(local42);
			}
			Static267.aClass8_Sub3_Sub1_Sub1Array1[arg0] = null;
			if (arg1.method5071(1) != 0) {
				Static371.method4764(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method758() {
		@Pc(1) int local1 = Static438.anInt2796;
		@Pc(3) int[] local3 = Static78.anIntArray114;
		@Pc(20) boolean local20 = Static413.aClass49_Sub1_1.anInt3208 == 1 && local1 > 200 || Static413.aClass49_Sub1_1.anInt3208 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class8_Sub3_Sub1_Sub1 local29 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local3[local22]];
			if (local29.method4562()) {
				local29.method5884();
				if (local29.aShort100 >= 0 && local29.aShort99 >= 0 && local29.aShort101 < Static337.anInt5497 && local29.aShort98 < Static282.anInt4644) {
					local29.aBoolean401 = local29.aBoolean519 ? local20 : false;
					if (local29 == Static401.aClass8_Sub3_Sub1_Sub1_2) {
						local29.anInt7352 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean522) {
							local75++;
						}
						if (local29.anInt7415 > Static265.anInt4371) {
							local75 += 2;
						}
						local75 += 5 - local29.method5894() << 2;
						if (local29.aBoolean399) {
							local75 += 512;
						} else {
							if (Static220.anInt3780 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt7352 = local75 + 1;
					}
				} else {
					local29.anInt7352 = -1;
				}
			} else {
				local29.anInt7352 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static148.anInt2692; local116++) {
			@Pc(123) Class8_Sub3_Sub1_Sub2 local123 = Static367.aClass8_Sub3_Sub1_Sub2Array1[Static106.anIntArray150[local116]];
			if (local123.method5910() && local123.aClass78_1.method1550(Static52.aClass81_1)) {
				local123.method5884();
				if (local123.aShort100 >= 0 && local123.aShort99 >= 0 && local123.aShort101 < Static337.anInt5497 && local123.aShort98 < Static282.anInt4644) {
					@Pc(160) int local160 = 0;
					if (!local123.aBoolean522) {
						local160++;
					}
					if (local123.anInt7415 > Static265.anInt4371) {
						local160 += 2;
					}
					local160 += 5 - local123.method5894() << 2;
					if (Static220.anInt3780 == 0) {
						if (local123.aClass78_1.aBoolean132) {
							local160 += 64;
						} else {
							local160 += 128;
						}
					} else if (Static220.anInt3780 == 1) {
						if (local123.aClass78_1.aBoolean132) {
							local160 += 32;
						} else {
							local160 += 64;
						}
					}
					if (local123.aClass78_1.aBoolean136) {
						local160 += 1024;
					} else if (!local123.aClass78_1.aBoolean135) {
						local160 += 256;
					}
					local123.anInt7352 = local160 + 1;
				} else {
					local123.anInt7352 = -1;
				}
			} else {
				local123.anInt7352 = -1;
			}
		}
		for (local75 = 0; local75 < Static62.aClass133Array1.length; local75++) {
			@Pc(226) Class133 local226 = Static62.aClass133Array1[local75];
			if (local226 != null) {
				if (local226.anInt3345 == 1) {
					@Pc(237) Class8_Sub3_Sub1_Sub2 local237 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local226.anInt3347];
					if (local237 != null && local237.anInt7352 >= 0) {
						local237.anInt7352 += 2048;
					}
				} else if (local226.anInt3345 == 10) {
					@Pc(258) Class8_Sub3_Sub1_Sub1 local258 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local226.anInt3347];
					if (local258 != null && local258 != Static401.aClass8_Sub3_Sub1_Sub1_2 && local258.anInt7352 >= 0) {
						local258.anInt7352 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method759() {
		Static147.anInt2679 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static148.anInt2692; local3++) {
			@Pc(10) Class8_Sub3_Sub1_Sub2 local10 = Static367.aClass8_Sub3_Sub1_Sub2Array1[Static106.anIntArray150[local3]];
			if (local10.aBoolean522 && local10.method5897() != -1) {
				@Pc(28) int local28 = (local10.method5894() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt7339 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt7343 - local28 >> 7;
				@Pc(49) Class8_Sub3_Sub1 local49 = Static58.method820(local10.aByte99, local42, local35);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt7391;
					if (local49 instanceof Class8_Sub3_Sub1_Sub2) {
						local54 += 2048;
					}
					if (local49.anInt7410 == 0 && local49.method5897() != -1) {
						Static238.anIntArray334[Static147.anInt2679] = local54;
						Static326.anIntArray428[Static147.anInt2679] = local54;
						Static147.anInt2679++;
						local49.anInt7410++;
					}
					Static238.anIntArray334[Static147.anInt2679] = local54;
					Static326.anIntArray428[Static147.anInt2679] = local10.anInt7391 + 2048;
					Static147.anInt2679++;
					local49.anInt7410++;
				}
			}
		}
		Static408.method5552(Static326.anIntArray428, Static238.anIntArray334, 0, Static147.anInt2679 - 1);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!hd;)Z")
	public static boolean method760(@OriginalArg(0) Class110 arg0) {
		if (Static37.aBoolean35) {
			if (method752(arg0).anInt3514 != 0) {
				return false;
			}
			if (arg0.anInt2627 == 0) {
				return false;
			}
		}
		return arg0.aBoolean179;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method761() {
		for (@Pc(1) int local1 = 0; local1 < Static337.anInt5497; local1++) {
			@Pc(6) int[] local6 = Static138.anIntArrayArray30[local1];
			for (@Pc(8) int local8 = 0; local8 < Static282.anInt4644; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method766(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static438.anInt2796;
		@Pc(3) int[] local3 = Static78.anIntArray114;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static148.anInt2692; local5++) {
			@Pc(15) Class8_Sub3_Sub1 local15;
			if (local5 < local1) {
				local15 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local3[local5]];
			} else {
				local15 = Static367.aClass8_Sub3_Sub1_Sub2Array1[Static106.anIntArray150[local5 - local1]];
			}
			if (local15.aByte99 == arg0 && local15.anInt7352 >= 0) {
				@Pc(35) int local35 = local15.method5894();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt7339 & 0x7F) != 0 || (local15.anInt7343 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt7339 & 0x7F) != 64 || (local15.anInt7343 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt7339 >> 7;
					local76 = local15.anInt7343 >> 7;
					if (local15.anInt7352 > Static138.anIntArrayArray30[local71][local76]) {
						Static138.anIntArrayArray30[local71][local76] = local15.anInt7352;
						Static401.anIntArrayArray57[local71][local76] = 1;
					} else if (local15.anInt7352 == Static138.anIntArrayArray30[local71][local76]) {
						local112 = Static401.anIntArrayArray57[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt7339 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt7343 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt7339 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt7343 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt7352 > Static138.anIntArrayArray30[local154][local157]) {
								Static138.anIntArrayArray30[local154][local157] = local15.anInt7352;
								Static401.anIntArrayArray57[local154][local157] = 1;
							} else if (local15.anInt7352 == Static138.anIntArrayArray30[local154][local157]) {
								local112 = Static401.anIntArrayArray57[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!hd;IIIIIIIII)V")
	public static void method769(@OriginalArg(0) Class110[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class110 local6 = arg0[local1];
			if (local6 != null && local6.anInt2649 == arg1) {
				@Pc(17) int local17 = local6.anInt2622 + arg6;
				@Pc(22) int local22 = local6.anInt2643 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt2627 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt2617;
					@Pc(45) int local45 = local22 + local6.anInt2590;
					if (local6.anInt2627 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt2627 == 0 || local6.aBoolean176 || method752(local6).anInt3514 != 0 || local6 == Static216.aClass110_9 || local6.anInt2638 == Static270.anInt4513) {
					if (!method760(local6)) {
						if (local6 == Static11.aClass110_1) {
							Static30.aBoolean32 = true;
							Static19.anInt304 = local17;
							Static448.anInt7475 = local22;
						}
						if (local6.aBoolean177 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean181 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class4_Sub34 local148 = (Class4_Sub34) Static302.aClass244_29.method5263(); local148 != null; local148 = (Class4_Sub34) Static302.aClass244_29.method5271()) {
									if (local148.aBoolean359) {
										local148.method6059();
										local148.aClass110_14.aBoolean184 = false;
									}
								}
								if (Static285.anInt4687 == 0) {
									Static11.aClass110_1 = null;
									Static216.aClass110_9 = null;
								}
								Static368.anInt6060 = 0;
								Static238.aBoolean297 = false;
								Static426.aBoolean337 = false;
								if (!Static339.aBoolean390) {
									Static89.method1407();
								}
							}
							@Pc(204) boolean local204;
							if (Static455.aClass48_1.method1138() >= local28 && Static455.aClass48_1.method1142() >= local30 && Static455.aClass48_1.method1138() < local32 && Static455.aClass48_1.method1142() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static70.aBoolean94 && local204) {
								if (local6.anInt2612 >= 0) {
									Static340.anInt5535 = local6.anInt2612;
								} else if (local6.aBoolean181) {
									Static340.anInt5535 = -1;
								}
							}
							if (!Static339.aBoolean390 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static113.method1671(local6, arg9 - local22, arg8 - local17);
							}
							@Pc(248) boolean local248 = false;
							if (Static455.aClass48_1.method1141() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class4_Sub1 local263 = (Class4_Sub1) Static398.aClass244_36.method5263();
							if (local263 != null && local263.method67() == 0 && local263.method65() >= local28 && local263.method64() >= local30 && local263.method65() < local32 && local263.method64() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray21 != null) {
								for (local296 = 0; local296 < local6.aByteArray21.length; local296++) {
									if (Static180.aClass107_1.method2003(local6.aByteArray21[local296])) {
										if (local6.anIntArray215 == null || Static265.anInt4371 >= local6.anIntArray215[local296]) {
											@Pc(328) byte local328 = local6.aByteArray22[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static180.aClass107_1.method2003(86) && !Static180.aClass107_1.method2003(82) && !Static180.aClass107_1.method2003(81)) && ((local328 & 0x2) == 0 || Static180.aClass107_1.method2003(86)) && ((local328 & 0x1) == 0 || Static180.aClass107_1.method2003(82)) && ((local328 & 0x4) == 0 || Static180.aClass107_1.method2003(81))) {
												if (local296 < 10) {
													Static364.method4849(local6.anInt2675, "", -1, local296 + 1);
												} else if (local296 == 10) {
													Static4.method74();
													@Pc(399) Class4_Sub20 local399 = method752(local6);
													Static247.method3255(local6, local399.anInt3510, local399.method2796());
													Static304.aString54 = Static106.method1587(local6);
													if (Static304.aString54 == null) {
														Static304.aString54 = "Null";
													}
													Static368.aString66 = local6.aString18 + "<col=ffffff>";
												}
												local430 = local6.anIntArray213[local296];
												if (local6.anIntArray215 == null) {
													local6.anIntArray215 = new int[local6.aByteArray21.length];
												}
												if (local430 == 0) {
													local6.anIntArray215[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray215[local296] = Static265.anInt4371 + local430;
												}
											}
										}
									} else if (local6.anIntArray215 != null) {
										local6.anIntArray215[local296] = 0;
									}
								}
							}
							if (local258) {
								Static293.method3830(local6, local263.method64() - local22, local263.method65() - local17);
							}
							if (Static11.aClass110_1 != null && Static11.aClass110_1 != local6 && local204 && method752(local6).method2792()) {
								Static63.aClass110_16 = local6;
							}
							if (local6 == Static216.aClass110_9) {
								Static240.aBoolean299 = true;
								Static105.anInt1944 = local17;
								Static389.anInt6348 = local22;
							}
							if (local6.aBoolean176 || local6.anInt2638 != 0) {
								@Pc(515) Class4_Sub34 local515;
								if (local204 && Static157.anInt2901 != 0 && local6.anObjectArray32 != null) {
									local515 = new Class4_Sub34();
									local515.aBoolean359 = true;
									local515.aClass110_14 = local6;
									local515.anInt4910 = Static157.anInt2901;
									local515.anObjectArray34 = local6.anObjectArray32;
									Static302.aClass244_29.method5273(local515);
								}
								if (Static11.aClass110_1 != null || Static339.aBoolean390 || local6.anInt2638 != Static76.anInt1526 && Static368.anInt6060 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt2638 != 0) {
									if (local6.anInt2638 == Static215.anInt5488 || local6.anInt2638 == Static436.anInt7237) {
										Static73.aClass110_3 = local6;
										if (Static113.aClass209_1 != null) {
											Static113.aClass209_1.method4306(Static39.aClass135_1, local6.anInt2590);
										}
										if (local6.anInt2638 == Static215.anInt5488) {
											if (!Static339.aBoolean390 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static47.method617(arg8, arg9, Static39.aClass135_1);
												for (@Pc(598) Class20_Sub7 local598 = (Class20_Sub7) Static26.aClass248_2.method5583(); local598 != null; local598 = (Class20_Sub7) Static26.aClass248_2.method5577()) {
													if (arg8 >= local598.anInt4943 && arg8 < local598.anInt4946 && arg9 >= local598.anInt4942 && arg9 < local598.anInt4945) {
														Static89.method1407();
														Static331.method4354(local598.aClass8_Sub3_Sub1_1);
													}
												}
											}
											Static252.method3319(local22, local6, local17);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt2638 == Static270.anInt4513) {
										if (local6.method2064(Static39.aClass135_1) == null || Static387.anInt6335 != 0 && Static387.anInt6335 != 3 || Static339.aBoolean390 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray217[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray214[local670]) {
											continue;
										}
										local296 -= local6.anInt2617 / 2;
										local670 -= local6.anInt2590 / 2;
										if (Static97.anInt1791 == 4) {
											local709 = (int) Static109.aFloat75 & 0x3FFF;
										} else {
											local709 = (int) Static109.aFloat75 + Static35.anInt575 & 0x3FFF;
										}
										@Pc(721) int local721 = Class100.anIntArray206[local709];
										@Pc(725) int local725 = Class100.anIntArray208[local709];
										if (Static97.anInt1791 != 4) {
											local721 = local721 * (Static380.anInt6188 + 256) >> 8;
											local725 = local725 * (Static380.anInt6188 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static97.anInt1791 == 4) {
											local775 = (Static190.anInt3490 >> 7) + (local754 >> 2);
											local783 = (Static212.anInt3693 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static401.aClass8_Sub3_Sub1_Sub1_2.method5894() - 1) * 64;
											local775 = (Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339 - local792 >> 7) + (local754 >> 2);
											local783 = (Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343 - local792 >> 7) - (local764 >> 2);
										}
										if (Static70.aBoolean94 && (Static115.anInt2115 & 0x40) != 0) {
											@Pc(825) Class110 local825 = Static220.method2992(Static259.anInt4347, Static270.anInt4512);
											if (local825 == null) {
												Static4.method74();
											} else {
												Static391.method5158(1L, local6.anInt2588, local783, local775, Static111.anInt2085, " ->", 60, false, Static304.aString54, true);
											}
											continue;
										}
										if (Static231.aClass6_7 == Static15.aClass6_1) {
											Static391.method5158(1L, -1, local783, local775, -1, "", 17, false, Static313.aClass15_91.method180(Static429.anInt6999), true);
										}
										Static391.method5158(1L, -1, local783, local775, Static77.anInt1542, "", 15, false, Static71.aString73, true);
										continue;
									}
									if (local6.anInt2638 == Static76.anInt1526) {
										Static123.aClass110_6 = local6;
										if (local204) {
											Static238.aBoolean297 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method65() - local17 - local6.anInt2617 / 2) * 2.0D / (double) Static292.aFloat74);
											local670 = (int) -((double) (local263.method64() - local22 - local6.anInt2590 / 2) * 2.0D / (double) Static292.aFloat74);
											local430 = Static54.anInt860 + local296 + Static292.anInt6142;
											local709 = Static458.anInt6588 + local670 + Static292.anInt6148;
											@Pc(939) Class4_Sub2_Sub11 local939 = Static279.method3691();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method3008(local430, local944, local709);
											if (local944 != null) {
												if (Static180.aClass107_1.method2003(82) && Static270.anInt4509 > 0) {
													Static113.method1678(local944[0], local944[2], local944[1]);
													continue;
												}
												Static426.aBoolean337 = true;
												Static41.anInt668 = local944[0];
												Static115.anInt2116 = local944[1];
												Static66.anInt1312 = local944[2];
											}
											Static368.anInt6060 = 1;
											Static79.aBoolean103 = false;
											Static337.anInt5501 = Static455.aClass48_1.method1138();
											Static204.anInt3612 = Static455.aClass48_1.method1142();
											continue;
										}
										if (local248 && Static368.anInt6060 > 0) {
											if (Static368.anInt6060 == 1 && (Static337.anInt5501 != Static455.aClass48_1.method1138() || Static204.anInt3612 != Static455.aClass48_1.method1142())) {
												Static286.anInt4715 = Static54.anInt860;
												Static11.anInt177 = Static458.anInt6588;
												Static368.anInt6060 = 2;
											}
											if (Static368.anInt6060 == 2) {
												Static79.aBoolean103 = true;
												Static130.method1852(Static286.anInt4715 + (int) ((double) (Static337.anInt5501 - Static455.aClass48_1.method1138()) * 2.0D / (double) Static292.aFloat73));
												Static29.method175(Static11.anInt177 - (int) ((double) (Static204.anInt3612 - Static455.aClass48_1.method1142()) * 2.0D / (double) Static292.aFloat73));
											}
											continue;
										}
										if (Static368.anInt6060 > 0 && !Static79.aBoolean103) {
											if ((Static443.anInt7447 == 1 || Static285.method3722()) && Static351.anInt5841 > 2) {
												Static256.method3380(Static204.anInt3612, Static337.anInt5501);
											} else if (Static114.method1680()) {
												Static256.method3380(Static204.anInt3612, Static337.anInt5501);
											}
										}
										Static368.anInt6060 = 0;
										continue;
									}
									if (local6.anInt2638 == Static272.anInt4522) {
										if (local248) {
											Static387.method5121(Static455.aClass48_1.method1142() - local22, local6.anInt2590, local6.anInt2617, Static455.aClass48_1.method1138() - local17);
										}
										continue;
									}
									if (local6.anInt2638 == Static99.anInt1825) {
										Static199.method2853(local17, local22, local6);
										continue;
									}
								}
								if (!local6.aBoolean171 && local258) {
									local6.aBoolean171 = true;
									if (local6.anObjectArray26 != null) {
										local515 = new Class4_Sub34();
										local515.aBoolean359 = true;
										local515.aClass110_14 = local6;
										local515.anInt4909 = local263.method65() - local17;
										local515.anInt4910 = local263.method64() - local22;
										local515.anObjectArray34 = local6.anObjectArray26;
										Static302.aClass244_29.method5273(local515);
									}
								}
								if (local6.aBoolean171 && local248 && local6.anObjectArray5 != null) {
									local515 = new Class4_Sub34();
									local515.aBoolean359 = true;
									local515.aClass110_14 = local6;
									local515.anInt4909 = Static455.aClass48_1.method1138() - local17;
									local515.anInt4910 = Static455.aClass48_1.method1142() - local22;
									local515.anObjectArray34 = local6.anObjectArray5;
									Static302.aClass244_29.method5273(local515);
								}
								if (local6.aBoolean171 && !local248) {
									local6.aBoolean171 = false;
									if (local6.anObjectArray17 != null) {
										local515 = new Class4_Sub34();
										local515.aBoolean359 = true;
										local515.aClass110_14 = local6;
										local515.anInt4909 = Static455.aClass48_1.method1138() - local17;
										local515.anInt4910 = Static455.aClass48_1.method1142() - local22;
										local515.anObjectArray34 = local6.anObjectArray17;
										Static6.aClass244_1.method5273(local515);
									}
								}
								if (local248 && local6.anObjectArray13 != null) {
									local515 = new Class4_Sub34();
									local515.aBoolean359 = true;
									local515.aClass110_14 = local6;
									local515.anInt4909 = Static455.aClass48_1.method1138() - local17;
									local515.anInt4910 = Static455.aClass48_1.method1142() - local22;
									local515.anObjectArray34 = local6.anObjectArray13;
									Static302.aClass244_29.method5273(local515);
								}
								if (!local6.aBoolean184 && local204) {
									local6.aBoolean184 = true;
									if (local6.anObjectArray30 != null) {
										local515 = new Class4_Sub34();
										local515.aBoolean359 = true;
										local515.aClass110_14 = local6;
										local515.anInt4909 = Static455.aClass48_1.method1138() - local17;
										local515.anInt4910 = Static455.aClass48_1.method1142() - local22;
										local515.anObjectArray34 = local6.anObjectArray30;
										Static302.aClass244_29.method5273(local515);
									}
								}
								if (local6.aBoolean184 && local204 && local6.anObjectArray25 != null) {
									local515 = new Class4_Sub34();
									local515.aBoolean359 = true;
									local515.aClass110_14 = local6;
									local515.anInt4909 = Static455.aClass48_1.method1138() - local17;
									local515.anInt4910 = Static455.aClass48_1.method1142() - local22;
									local515.anObjectArray34 = local6.anObjectArray25;
									Static302.aClass244_29.method5273(local515);
								}
								if (local6.aBoolean184 && !local204) {
									local6.aBoolean184 = false;
									if (local6.anObjectArray18 != null) {
										local515 = new Class4_Sub34();
										local515.aBoolean359 = true;
										local515.aClass110_14 = local6;
										local515.anInt4909 = Static455.aClass48_1.method1138() - local17;
										local515.anInt4910 = Static455.aClass48_1.method1142() - local22;
										local515.anObjectArray34 = local6.anObjectArray18;
										Static6.aClass244_1.method5273(local515);
									}
								}
								if (local6.anObjectArray24 != null) {
									local515 = new Class4_Sub34();
									local515.aClass110_14 = local6;
									local515.anObjectArray34 = local6.anObjectArray24;
									Static301.aClass244_28.method5273(local515);
								}
								@Pc(1483) Class4_Sub34 local1483;
								if (local6.anObjectArray9 != null && Static306.anInt5008 > local6.anInt2672) {
									if (local6.anIntArray219 == null || Static306.anInt5008 - local6.anInt2672 > 32) {
										local515 = new Class4_Sub34();
										local515.aClass110_14 = local6;
										local515.anObjectArray34 = local6.anObjectArray9;
										Static302.aClass244_29.method5273(local515);
									} else {
										label678: for (local296 = local6.anInt2672; local296 < Static306.anInt5008; local296++) {
											local670 = Static77.anIntArray113[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray219.length; local430++) {
												if (local6.anIntArray219[local430] == local670) {
													local1483 = new Class4_Sub34();
													local1483.aClass110_14 = local6;
													local1483.anObjectArray34 = local6.anObjectArray9;
													Static302.aClass244_29.method5273(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt2672 = Static306.anInt5008;
								}
								if (local6.anObjectArray33 != null && Static216.anInt3697 > local6.anInt2629) {
									if (local6.anIntArray222 == null || Static216.anInt3697 - local6.anInt2629 > 32) {
										local515 = new Class4_Sub34();
										local515.aClass110_14 = local6;
										local515.anObjectArray34 = local6.anObjectArray33;
										Static302.aClass244_29.method5273(local515);
									} else {
										label654: for (local296 = local6.anInt2629; local296 < Static216.anInt3697; local296++) {
											local670 = Static18.anIntArray17[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray222.length; local430++) {
												if (local6.anIntArray222[local430] == local670) {
													local1483 = new Class4_Sub34();
													local1483.aClass110_14 = local6;
													local1483.anObjectArray34 = local6.anObjectArray33;
													Static302.aClass244_29.method5273(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt2629 = Static216.anInt3697;
								}
								if (local6.anObjectArray28 != null && Static307.anInt5014 > local6.anInt2591) {
									if (local6.anIntArray221 == null || Static307.anInt5014 - local6.anInt2591 > 32) {
										local515 = new Class4_Sub34();
										local515.aClass110_14 = local6;
										local515.anObjectArray34 = local6.anObjectArray28;
										Static302.aClass244_29.method5273(local515);
									} else {
										label630: for (local296 = local6.anInt2591; local296 < Static307.anInt5014; local296++) {
											local670 = Static31.anIntArray42[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray221.length; local430++) {
												if (local6.anIntArray221[local430] == local670) {
													local1483 = new Class4_Sub34();
													local1483.aClass110_14 = local6;
													local1483.anObjectArray34 = local6.anObjectArray28;
													Static302.aClass244_29.method5273(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt2591 = Static307.anInt5014;
								}
								if (local6.anObjectArray14 != null && Static431.anInt7347 > local6.anInt2639) {
									if (local6.anIntArray223 == null || Static431.anInt7347 - local6.anInt2639 > 32) {
										local515 = new Class4_Sub34();
										local515.aClass110_14 = local6;
										local515.anObjectArray34 = local6.anObjectArray14;
										Static302.aClass244_29.method5273(local515);
									} else {
										label606: for (local296 = local6.anInt2639; local296 < Static431.anInt7347; local296++) {
											local670 = Static163.anIntArray243[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray223.length; local430++) {
												if (local6.anIntArray223[local430] == local670) {
													local1483 = new Class4_Sub34();
													local1483.aClass110_14 = local6;
													local1483.anObjectArray34 = local6.anObjectArray14;
													Static302.aClass244_29.method5273(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt2639 = Static431.anInt7347;
								}
								if (local6.anObjectArray12 != null && Static406.anInt6844 > local6.anInt2586) {
									if (local6.anIntArray216 == null || Static406.anInt6844 - local6.anInt2586 > 32) {
										local515 = new Class4_Sub34();
										local515.aClass110_14 = local6;
										local515.anObjectArray34 = local6.anObjectArray12;
										Static302.aClass244_29.method5273(local515);
									} else {
										label582: for (local296 = local6.anInt2586; local296 < Static406.anInt6844; local296++) {
											local670 = Static74.anIntArray112[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray216.length; local430++) {
												if (local6.anIntArray216[local430] == local670) {
													local1483 = new Class4_Sub34();
													local1483.aClass110_14 = local6;
													local1483.anObjectArray34 = local6.anObjectArray12;
													Static302.aClass244_29.method5273(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt2586 = Static406.anInt6844;
								}
								if (Static193.anInt1359 > local6.anInt2668 && local6.anObjectArray16 != null) {
									local515 = new Class4_Sub34();
									local515.aClass110_14 = local6;
									local515.anObjectArray34 = local6.anObjectArray16;
									Static302.aClass244_29.method5273(local515);
								}
								if (Static357.anInt5911 > local6.anInt2668 && local6.anObjectArray15 != null) {
									local515 = new Class4_Sub34();
									local515.aClass110_14 = local6;
									local515.anObjectArray34 = local6.anObjectArray15;
									Static302.aClass244_29.method5273(local515);
								}
								if (Static450.anInt7529 > local6.anInt2668 && local6.anObjectArray19 != null) {
									local515 = new Class4_Sub34();
									local515.aClass110_14 = local6;
									local515.anObjectArray34 = local6.anObjectArray19;
									Static302.aClass244_29.method5273(local515);
								}
								if (Static330.anInt5370 > local6.anInt2668 && local6.anObjectArray29 != null) {
									local515 = new Class4_Sub34();
									local515.aClass110_14 = local6;
									local515.anObjectArray34 = local6.anObjectArray29;
									Static302.aClass244_29.method5273(local515);
								}
								if (Static161.anInt2989 > local6.anInt2668 && local6.anObjectArray22 != null) {
									local515 = new Class4_Sub34();
									local515.aClass110_14 = local6;
									local515.anObjectArray34 = local6.anObjectArray22;
									Static302.aClass244_29.method5273(local515);
								}
								local6.anInt2668 = Static79.anInt1568;
								if (local6.anObjectArray11 != null) {
									for (local296 = 0; local296 < Static306.anInt5006; local296++) {
										@Pc(1951) Class4_Sub34 local1951 = new Class4_Sub34();
										local1951.aClass110_14 = local6;
										local1951.anInt4911 = Static167.aClass36Array1[local296].method576();
										local1951.anInt4906 = Static167.aClass36Array1[local296].method577();
										local1951.anObjectArray34 = local6.anObjectArray11;
										Static302.aClass244_29.method5273(local1951);
									}
								}
								if (Static72.aBoolean96 && local6.anObjectArray27 != null) {
									local515 = new Class4_Sub34();
									local515.aClass110_14 = local6;
									local515.anObjectArray34 = local6.anObjectArray27;
									Static302.aClass244_29.method5273(local515);
								}
							}
							if (local6.anInt2627 == 5 && local6.anInt2677 != -1) {
								local6.method2054(Static344.aClass263_1, Static28.aClass129_3).method4306(Static39.aClass135_1, local6.anInt2590);
							}
							Static68.method1152(local6);
							if (local6.anInt2627 == 0) {
								method769(arg0, local6.anInt2675, local28, local30, local32, local34, local17 - local6.anInt2630, local22 - local6.anInt2642, arg8, arg9);
								if (local6.aClass110Array1 != null) {
									method769(local6.aClass110Array1, local6.anInt2675, local28, local30, local32, local34, local17 - local6.anInt2630, local22 - local6.anInt2642, arg8, arg9);
								}
								@Pc(2073) Class4_Sub8 local2073 = (Class4_Sub8) Static449.aClass67_37.method1429((long) local6.anInt2675);
								if (local2073 != null) {
									if (Static231.aClass6_7 == Static43.aClass6_6 && local2073.anInt859 == 0 && !Static339.aBoolean390 && local204 && !Static37.aBoolean35) {
										Static89.method1407();
									}
									Static172.method2391(arg8, local2073.anInt861, local30, local22, local17, local28, local34, local32, arg9);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static68.method1152(local6);
				}
			}
		}
	}
}
