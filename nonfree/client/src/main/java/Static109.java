import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_42 = new Class319(13, 3);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public static void method1954() {
		if (Static132.anInt2642 < 102) {
			Static132.anInt2642 += 6;
		}
		@Pc(23) int local23;
		if (Static485.anInt8166 != -1 && Static238.aLong424 < Static255.method4035()) {
			for (local23 = Static485.anInt8166; local23 < Static29.aStringArray1.length; local23++) {
				if (Static29.aStringArray1[local23].startsWith("pause")) {
					@Pc(42) int local42 = 5;
					try {
						local42 = Integer.parseInt(Static29.aStringArray1[local23].substring(6));
					} catch (@Pc(51) Exception local51) {
					}
					Static374.method5444("Pausing for " + local42 + " seconds...");
					Static485.anInt8166 = local23 + 1;
					Static238.aLong424 = Static255.method4035() + (long) (local42 * 1000);
					return;
				}
				Static140.aString28 = Static29.aStringArray1[local23];
				Static548.method7474(false);
			}
			Static485.anInt8166 = -1;
		}
		if (Static184.anInt5415 != 0) {
			Static78.anInt1871 -= Static184.anInt5415 * 5;
			if (Static486.anInt8201 <= Static78.anInt1871) {
				Static78.anInt1871 = Static486.anInt8201 - 1;
			}
			Static184.anInt5415 = 0;
			if (Static78.anInt1871 < 0) {
				Static78.anInt1871 = 0;
			}
		}
		for (local23 = 0; local23 < Static207.anInt7989; local23++) {
			@Pc(121) Interface21 local121 = Static304.anInterface21Array2[local23];
			@Pc(125) int local125 = local121.method6535();
			@Pc(129) char local129 = local121.method6536();
			@Pc(133) int local133 = local121.method6532();
			if (local125 == 84) {
				Static548.method7474(false);
			}
			if (local125 == 80) {
				Static548.method7474(true);
			} else if (local125 == 66 && (local133 & 0x4) != 0) {
				if (Static226.aClipboard3 != null) {
					@Pc(477) String local477 = "";
					for (@Pc(482) int local482 = Static35.aStringArray3.length - 1; local482 >= 0; local482--) {
						if (Static35.aStringArray3[local482] != null && Static35.aStringArray3[local482].length() > 0) {
							local477 = local477 + Static35.aStringArray3[local482] + '\n';
						}
					}
					Static226.aClipboard3.setContents(new StringSelection(local477), null);
				}
			} else if (local125 == 67 && (local133 & 0x4) != 0) {
				if (Static226.aClipboard3 != null) {
					@Pc(170) Transferable local170 = Static226.aClipboard3.getContents(null);
					if (local170 != null) {
						try {
							@Pc(177) String local177 = (String) local170.getTransferData(DataFlavor.stringFlavor);
							if (local177 != null) {
								@Pc(184) String[] local184 = Static46.method1116('\n', local177);
								if (local184.length > 1) {
									for (@Pc(192) int local192 = 0; local192 < local184.length; local192++) {
										if (local184[local192].startsWith("pause")) {
											@Pc(202) int local202 = 5;
											try {
												local202 = Integer.parseInt(local184[local192].substring(6));
											} catch (@Pc(211) Exception local211) {
											}
											Static374.method5444("Pausing for " + local202 + " seconds...");
											Static485.anInt8166 = local192 + 1;
											Static29.aStringArray1 = local184;
											Static238.aLong424 = (long) (local202 * 1000) + Static255.method4035();
											return;
										}
										Static140.aString28 = local184[local192];
										Static548.method7474(false);
									}
								} else {
									Static140.aString28 = Static140.aString28 + local177;
								}
							}
						} catch (@Pc(262) Exception local262) {
						}
					}
				}
			} else if (local125 == 85 && Static279.anInt5136 > 0) {
				Static140.aString28 = Static140.aString28.substring(0, Static279.anInt5136 - 1) + Static140.aString28.substring(Static279.anInt5136);
				Static279.anInt5136--;
			} else if (local125 == 101 && Static279.anInt5136 < Static140.aString28.length()) {
				Static140.aString28 = Static140.aString28.substring(0, Static279.anInt5136) + Static140.aString28.substring(Static279.anInt5136 + 1);
			} else if (local125 == 96 && Static279.anInt5136 > 0) {
				Static279.anInt5136--;
			} else if (local125 == 97 && Static279.anInt5136 < Static140.aString28.length()) {
				Static279.anInt5136++;
			} else if (local125 == 102) {
				Static279.anInt5136 = 0;
			} else if (local125 == 103) {
				Static279.anInt5136 = Static140.aString28.length();
			} else if (local125 == 104 && Static248.anInt4642 < Static35.aStringArray3.length) {
				Static248.anInt4642++;
				Static237.method3846();
				Static279.anInt5136 = Static140.aString28.length();
			} else if (local125 == 105 && Static248.anInt4642 > 0) {
				Static248.anInt4642--;
				Static237.method3846();
				Static279.anInt5136 = Static140.aString28.length();
			} else if (Static215.method3560(local129) || local129 == ':' || local129 == ',' || local129 == ' ' || local129 == '_' || local129 == '-' || local129 == '+' || local129 == '[' || local129 == ']') {
				Static140.aString28 = Static140.aString28.substring(0, Static279.anInt5136) + Static304.anInterface21Array2[local23].method6536() + Static140.aString28.substring(Static279.anInt5136);
				Static279.anInt5136++;
			}
		}
		Static592.anInt9557 = 0;
		Static207.anInt7989 = 0;
		Static388.method5569();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[B)V")
	public static synchronized void method1956(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static315.anInt5664 < 1000) {
			Static194.aByteArrayArray12[Static315.anInt5664++] = arg0;
		} else if (arg0.length == 5000 && Static509.anInt8456 < 250) {
			Static521.aByteArrayArray26[Static509.anInt8456++] = arg0;
		} else if (arg0.length == 30000 && Static45.anInt1132 < 50) {
			Static252.aByteArrayArray29[Static45.anInt1132++] = arg0;
		} else if (Static445.aByteArrayArrayArray2 != null) {
			for (@Pc(72) int local72 = 0; local72 < Static484.anIntArray540.length; local72++) {
				if (Static484.anIntArray540[local72] == arg0.length && Static193.anIntArray220[local72] < Static445.aByteArrayArrayArray2[local72].length) {
					Static445.aByteArrayArrayArray2[local72][Static193.anIntArray220[local72]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1957(@OriginalArg(0) int arg0) {
		@Pc(23) byte[] local23;
		if (arg0 == 100 && Static315.anInt5664 > 0) {
			local23 = Static194.aByteArrayArray12[--Static315.anInt5664];
			Static194.aByteArrayArray12[Static315.anInt5664] = null;
			return local23;
		} else if (arg0 == 5000 && Static509.anInt8456 > 0) {
			local23 = Static521.aByteArrayArray26[--Static509.anInt8456];
			Static521.aByteArrayArray26[Static509.anInt8456] = null;
			return local23;
		} else if (arg0 == 30000 && Static45.anInt1132 > 0) {
			local23 = Static252.aByteArrayArray29[--Static45.anInt1132];
			Static252.aByteArrayArray29[Static45.anInt1132] = null;
			return local23;
		} else {
			if (Static445.aByteArrayArrayArray2 != null) {
				for (@Pc(78) int local78 = 0; local78 < Static484.anIntArray540.length; local78++) {
					if (arg0 == Static484.anIntArray540[local78] && Static193.anIntArray220[local78] > 0) {
						@Pc(108) byte[] local108 = Static445.aByteArrayArrayArray2[local78][--Static193.anIntArray220[local78]];
						Static445.aByteArrayArrayArray2[local78][Static193.anIntArray220[local78]] = null;
						return local108;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI[[[Lclient!se;IZI)Z")
	public static boolean method1958(@OriginalArg(1) int arg0, @OriginalArg(2) Class293[][][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg3 ? 1 : (byte) (Static473.anInt8020 & 0xFF);
		if (Static221.aByteArrayArrayArray5[Static240.anInt4595][arg4][arg2] == local14) {
			return false;
		} else if ((Static511.aByteArrayArrayArray19[Static240.anInt4595][arg4][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(46) byte local46 = 0;
			Static423.anIntArray493[0] = arg4;
			@Pc(52) int local52 = 0;
			@Pc(55) int local55 = local46 + 1;
			Static556.anIntArray468[0] = arg2;
			Static221.aByteArrayArrayArray5[Static240.anInt4595][arg4][arg2] = local14;
			while (local52 != local55) {
				@Pc(73) int local73 = Static423.anIntArray493[local52] & 0xFFFF;
				@Pc(81) int local81 = Static423.anIntArray493[local52] >> 16 & 0xFF;
				@Pc(89) int local89 = Static423.anIntArray493[local52] >> 24 & 0xFF;
				@Pc(95) int local95 = Static556.anIntArray468[local52] & 0xFFFF;
				@Pc(103) int local103 = Static556.anIntArray468[local52] >> 16 & 0xFF;
				local52 = local52 + 1 & 0xFFF;
				@Pc(111) boolean local111 = false;
				if ((Static511.aByteArrayArrayArray19[Static240.anInt4595][local73][local95] & 0x4) == 0) {
					local111 = true;
				}
				@Pc(125) boolean local125 = false;
				@Pc(167) int local167;
				@Pc(209) int local209;
				label231: for (@Pc(129) int local129 = Static240.anInt4595 + 1; local129 <= 3; local129++) {
					if ((Static511.aByteArrayArrayArray19[local129][local73][local95] & 0x8) == 0) {
						@Pc(304) Class20_Sub2_Sub4 local304;
						@Pc(314) int local314;
						@Pc(293) Class293 local293;
						@Pc(299) Class285 local299;
						if (local111 && arg1[local129][local73][local95] != null) {
							if (arg1[local129][local73][local95].aClass20_Sub2_Sub2_2 != null) {
								local167 = Static251.method4008(local81);
								if (local167 == arg1[local129][local73][local95].aClass20_Sub2_Sub2_2.aShort102 || arg1[local129][local73][local95].aClass20_Sub2_Sub2_1 != null && arg1[local129][local73][local95].aClass20_Sub2_Sub2_1.aShort102 == local167) {
									continue;
								}
								if (local89 != 0) {
									local209 = Static251.method4008(local89);
									if (local209 == arg1[local129][local73][local95].aClass20_Sub2_Sub2_2.aShort102 || arg1[local129][local73][local95].aClass20_Sub2_Sub2_1 != null && local209 == arg1[local129][local73][local95].aClass20_Sub2_Sub2_1.aShort102) {
										continue;
									}
								}
								if (local103 != 0) {
									local209 = Static251.method4008(local103);
									if (arg1[local129][local73][local95].aClass20_Sub2_Sub2_2.aShort102 == local209 || arg1[local129][local73][local95].aClass20_Sub2_Sub2_1 != null && arg1[local129][local73][local95].aClass20_Sub2_Sub2_1.aShort102 == local209) {
										continue;
									}
								}
							}
							local293 = arg1[local129][local73][local95];
							if (local293.aClass285_6 != null) {
								for (local299 = local293.aClass285_6; local299 != null; local299 = local299.aClass285_5) {
									local304 = local299.aClass20_Sub2_Sub4_1;
									if (local304 instanceof Interface7) {
										@Pc(310) Interface7 local310 = (Interface7) local304;
										local314 = local310.method7279();
										if (local314 == 21) {
											local314 = 19;
										}
										@Pc(325) int local325 = local310.method7278();
										@Pc(331) int local331 = local314 | local325 << 6;
										if (local81 == local331 || local89 != 0 && local89 == local331 || local103 != 0 && local103 == local331) {
											continue label231;
										}
									}
								}
							}
						}
						local293 = arg1[local129][local73][local95];
						if (local293 != null && local293.aClass285_6 != null) {
							for (local299 = local293.aClass285_6; local299 != null; local299 = local299.aClass285_5) {
								local304 = local299.aClass20_Sub2_Sub4_1;
								if (local304.aShort100 != local304.aShort98 || local304.aShort97 != local304.aShort99) {
									for (@Pc(393) int local393 = local304.aShort100; local393 <= local304.aShort98; local393++) {
										for (local314 = local304.aShort97; local314 <= local304.aShort99; local314++) {
											Static221.aByteArrayArrayArray5[local129][local393][local314] = local14;
										}
									}
								}
							}
						}
						Static221.aByteArrayArrayArray5[local129][local73][local95] = local14;
						local125 = true;
					}
				}
				if (local125) {
					local167 = Static20.aClass17Array1[Static240.anInt4595 + 1].method6642(local73, local95);
					if (Static179.anIntArray187[arg0] < local167) {
						Static179.anIntArray187[arg0] = local167;
					}
					local209 = local73 << 9;
					if (Static378.anIntArray446[arg0] > local209) {
						Static378.anIntArray446[arg0] = local209;
					} else if (local209 > Static506.anIntArray581[arg0]) {
						Static506.anIntArray581[arg0] = local209;
					}
					@Pc(508) int local508 = local95 << 9;
					if (local508 < Static123.anIntArray152[arg0]) {
						Static123.anIntArray152[arg0] = local508;
					} else if (Static399.anIntArray474[arg0] < local508) {
						Static399.anIntArray474[arg0] = local508;
					}
				}
				if (!local111) {
					if (local73 >= 1 && Static221.aByteArrayArrayArray5[Static240.anInt4595][local73 - 1][local95] != local14) {
						Static423.anIntArray493[local55] = local73 - 1 | 0xD3000000 | 0x120000;
						Static556.anIntArray468[local55] = local95 | 0x130000;
						Static221.aByteArrayArrayArray5[Static240.anInt4595][local73 - 1][local95] = local14;
						local55 = local55 + 1 & 0xFFF;
					}
					local95++;
					if (Static573.anInt9325 > local95) {
						if (local73 - 1 >= 0 && local14 != Static221.aByteArrayArrayArray5[Static240.anInt4595][local73 - 1][local95] && (Static511.aByteArrayArrayArray19[Static240.anInt4595][local73][local95] & 0x4) == 0 && (Static511.aByteArrayArrayArray19[Static240.anInt4595][local73 - 1][local95 - 1] & 0x4) == 0) {
							Static423.anIntArray493[local55] = local73 - 1 | 0x120000 | 0x52000000;
							Static556.anIntArray468[local55] = local95 | 0x130000;
							local55 = local55 + 1 & 0xFFF;
							Static221.aByteArrayArrayArray5[Static240.anInt4595][local73 - 1][local95] = local14;
						}
						if (Static221.aByteArrayArrayArray5[Static240.anInt4595][local73][local95] != local14) {
							Static423.anIntArray493[local55] = 0x13000000 | 0x520000 | local73;
							Static556.anIntArray468[local55] = local95 | 0x530000;
							Static221.aByteArrayArrayArray5[Static240.anInt4595][local73][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (Static500.anInt6888 > local73 + 1 && local14 != Static221.aByteArrayArrayArray5[Static240.anInt4595][local73 + 1][local95] && (Static511.aByteArrayArrayArray19[Static240.anInt4595][local73][local95] & 0x4) == 0 && (Static511.aByteArrayArrayArray19[Static240.anInt4595][local73 + 1][local95 - 1] & 0x4) == 0) {
							Static423.anIntArray493[local55] = local73 + 1 | 0x520000 | 0x92000000;
							Static556.anIntArray468[local55] = local95 | 0x530000;
							local55 = local55 + 1 & 0xFFF;
							Static221.aByteArrayArrayArray5[Static240.anInt4595][local73 + 1][local95] = local14;
						}
					}
					local95--;
					if (Static500.anInt6888 > local73 + 1 && Static221.aByteArrayArrayArray5[Static240.anInt4595][local73 + 1][local95] != local14) {
						Static423.anIntArray493[local55] = 0x53000000 | 0x920000 | local73 + 1;
						Static556.anIntArray468[local55] = local95 | 0x930000;
						local55 = local55 + 1 & 0xFFF;
						Static221.aByteArrayArrayArray5[Static240.anInt4595][local73 + 1][local95] = local14;
					}
					local95--;
					if (local95 >= 0) {
						if (local73 - 1 >= 0 && Static221.aByteArrayArrayArray5[Static240.anInt4595][local73 - 1][local95] != local14 && (Static511.aByteArrayArrayArray19[Static240.anInt4595][local73][local95] & 0x4) == 0 && (Static511.aByteArrayArrayArray19[Static240.anInt4595][local73 - 1][local95 + 1] & 0x4) == 0) {
							Static423.anIntArray493[local55] = 0x12000000 | 0xD20000 | local73 - 1;
							Static556.anIntArray468[local55] = local95 | 0xD30000;
							Static221.aByteArrayArrayArray5[Static240.anInt4595][local73 - 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (local14 != Static221.aByteArrayArrayArray5[Static240.anInt4595][local73][local95]) {
							Static423.anIntArray493[local55] = 0x93000000 | 0xD20000 | local73;
							Static556.anIntArray468[local55] = local95 | 0xD30000;
							local55 = local55 + 1 & 0xFFF;
							Static221.aByteArrayArrayArray5[Static240.anInt4595][local73][local95] = local14;
						}
						if (Static500.anInt6888 > local73 + 1 && local14 != Static221.aByteArrayArrayArray5[Static240.anInt4595][local73 + 1][local95] && (Static511.aByteArrayArrayArray19[Static240.anInt4595][local73][local95] & 0x4) == 0 && (Static511.aByteArrayArrayArray19[Static240.anInt4595][local73 + 1][local95 + 1] & 0x4) == 0) {
							Static423.anIntArray493[local55] = local73 + 1 | 0xD2000000 | 0x920000;
							Static556.anIntArray468[local55] = local95 | 0x930000;
							local55 = local55 + 1 & 0xFFF;
							Static221.aByteArrayArrayArray5[Static240.anInt4595][local73 + 1][local95] = local14;
						}
					}
				}
			}
			if (Static179.anIntArray187[arg0] != -1000000) {
				Static179.anIntArray187[arg0] += 40;
				Static378.anIntArray446[arg0] -= 512;
				Static506.anIntArray581[arg0] += 512;
				Static399.anIntArray474[arg0] += 512;
				Static123.anIntArray152[arg0] -= 512;
			}
			return true;
		}
	}
}
