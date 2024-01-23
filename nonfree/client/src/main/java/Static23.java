import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "Lclient!gg;")
	public static Class4_Sub2_Sub9 aClass4_Sub2_Sub9_1;

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray4;

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
	public static void method375() {
		aClass4_Sub2_Sub9_1 = null;
		aStringArray4 = null;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static247.anInt4706 * 128) {
			arg0 = Static247.anInt4706 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static24.anInt439 * 128) {
			arg2 = Static24.anInt439 * 128 - 1;
		}
		Static275.anInt5147 = Class131.anIntArray355[arg3];
		Static54.anInt1076 = Class131.anIntArray353[arg3];
		Static68.anInt1263 = Class131.anIntArray355[arg4];
		Static84.anInt1703 = Class131.anIntArray353[arg4];
		Static175.anInt3456 = arg0;
		Static27.anInt1303 = arg1;
		Static165.anInt3299 = arg2;
		Static273.anInt1119 = arg0 / 128;
		Static89.anInt1839 = arg2 / 128;
		Static106.anInt2266 = Static273.anInt1119 - Static225.anInt4462;
		if (Static106.anInt2266 < 0) {
			Static106.anInt2266 = 0;
		}
		Static219.anInt4347 = Static89.anInt1839 - Static225.anInt4462;
		if (Static219.anInt4347 < 0) {
			Static219.anInt4347 = 0;
		}
		Static137.anInt2811 = Static273.anInt1119 + Static225.anInt4462;
		if (Static137.anInt2811 > Static247.anInt4706) {
			Static137.anInt2811 = Static247.anInt4706;
		}
		Static77.anInt1474 = Static89.anInt1839 + Static225.anInt4462;
		if (Static77.anInt1474 > Static24.anInt439) {
			Static77.anInt1474 = Static24.anInt439;
		}
		@Pc(99) short local99;
		if (Static178.aBoolean216) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < Static225.anInt4462 + Static225.anInt4462 + 2; local104++) {
			for (local113 = 0; local113 < Static225.anInt4462 + Static225.anInt4462 + 2; local113++) {
				@Pc(130) int local130 = (local104 - Static225.anInt4462 << 7) - (Static175.anInt3456 & 0x7F);
				@Pc(140) int local140 = (local113 - Static225.anInt4462 << 7) - (Static165.anInt3299 & 0x7F);
				@Pc(146) int local146 = Static273.anInt1119 + local104 - Static225.anInt4462;
				@Pc(152) int local152 = Static89.anInt1839 + local113 - Static225.anInt4462;
				if (local146 >= 0 && local152 >= 0 && local146 < Static247.anInt4706 && local152 < Static24.anInt439) {
					@Pc(176) int local176;
					if (Static15.anIntArrayArrayArray2 == null) {
						local176 = Static231.anIntArrayArrayArray12[0][local146][local152] + 128 - Static27.anInt1303;
					} else {
						local176 = Static15.anIntArrayArrayArray2[0][local146][local152] + 128 - Static27.anInt1303;
					}
					@Pc(201) int local201 = Static231.anIntArrayArrayArray12[3][local146][local152] - Static27.anInt1303 - 1000;
					Static40.aBooleanArrayArray2[local104][local113] = Static190.method3010(local130, local201, local176, local140, local99);
				} else {
					Static40.aBooleanArrayArray2[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static225.anInt4462 + Static225.anInt4462 + 1; local104++) {
			for (local113 = 0; local113 < Static225.anInt4462 + Static225.anInt4462 + 1; local113++) {
				Static191.aBooleanArrayArray8[local104][local113] = Static40.aBooleanArrayArray2[local104][local113] || Static40.aBooleanArrayArray2[local104 + 1][local113] || Static40.aBooleanArrayArray2[local104][local113 + 1] || Static40.aBooleanArrayArray2[local104 + 1][local113 + 1];
			}
		}
		Static67.anIntArray138 = arg6;
		Static225.anIntArray399 = arg7;
		Static217.anIntArray388 = arg8;
		Static227.anIntArray349 = arg9;
		Static234.anIntArray424 = arg10;
		Static185.method2901();
		if (Static271.aClass4_Sub11ArrayArrayArray3 != null) {
			Static205.method3261(true);
			Static214.method3423(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (Static178.aBoolean216) {
				Static72.aBoolean96 = false;
				Static32.method479(0, 0);
				Static291.method4319(null);
				Static12.method206();
			}
			Static205.method3261(false);
		}
		Static214.method3423(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method377(@OriginalArg(1) String arg0) {
		@Pc(26) String local26 = Static141.method2286(Static34.method491(arg0));
		if (local26 == null) {
			local26 = "";
		}
		return local26;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[B[Lclient!hm;IIIIIIZI)[I")
	public static int[] method378(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class63[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = (arg4 & 0x7) * 8;
		@Pc(17) int local17 = (arg6 & 0x7) * 8;
		@Pc(21) byte local21;
		if (arg8) {
			local21 = 1;
		} else {
			local21 = 4;
		}
		@Pc(37) int local37;
		@Pc(55) int local55;
		if (!arg8) {
			for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
				for (local37 = 0; local37 < 8; local37++) {
					local55 = arg9 + Static86.method1379(local37 & 0x7, arg7, local30 & 0x7);
					@Pc(67) int local67 = Static136.method2179(arg7, local30 & 0x7, local37 & 0x7) + arg3;
					if (local55 > 0 && local55 < 103 && local67 > 0 && local67 < 103) {
						arg2[arg5].anIntArrayArray21[local55][local67] &= 0xFFDFFFFF;
					}
				}
			}
		}
		local37 = (arg4 & 0x1FFFFFF8) << 3;
		@Pc(121) Class4_Sub17 local121 = new Class4_Sub17(arg1);
		local55 = (arg6 & 0x1FFFFFF8) << 3;
		@Pc(129) byte local129 = 0;
		@Pc(131) byte local131 = 0;
		if (arg7 == 1) {
			local131 = 1;
		} else if (arg7 == 2) {
			local129 = 1;
			local131 = 1;
		} else if (arg7 == 3) {
			local129 = 1;
		}
		@Pc(168) int local168;
		@Pc(220) int local220;
		@Pc(232) int local232;
		@Pc(266) int local266;
		@Pc(273) int local273;
		@Pc(292) int local292;
		@Pc(298) int local298;
		for (@Pc(156) int local156 = 0; local156 < local21; local156++) {
			for (@Pc(161) int local161 = 0; local161 < 64; local161++) {
				for (local168 = 0; local168 < 64; local168++) {
					if (local156 != arg0 || local7 > local161 || local161 > local7 + 8 || local168 < local17 || local17 + 8 < local168) {
						Static214.method3421(0, 0, -1, arg8, local121, 0, false, -1, 0, 0, 0);
					} else if (local161 == local7 + 8 || local168 == local17 + 8) {
						if (arg7 == 0) {
							local232 = local168 + arg3 - local17;
							local220 = local161 + arg9 - local7;
						} else if (arg7 == 1) {
							local232 = local7 + arg3 + 8 - local161;
							local220 = arg9 + local168 - local17;
						} else if (arg7 == 2) {
							local220 = arg9 + local7 + 8 - local161;
							local232 = local17 + arg3 + 8 - local168;
						} else {
							local220 = local17 + arg9 + 8 - local168;
							local232 = local161 + arg3 - local7;
						}
						Static214.method3421(arg5, 0, local232, arg8, local121, 0, true, local220, 0, local55 + local168, local37 + local161);
					} else {
						local220 = Static86.method1379(local168 & 0x7, arg7, local161 & 0x7) + arg9;
						local232 = Static136.method2179(arg7, local161 & 0x7, local168 & 0x7) + arg3;
						Static214.method3421(arg5, local129, local232, arg8, local121, arg7, false, local220, local131, local55 + local168, local161 + local37);
						if (local161 == 63 || local168 == 63) {
							local266 = local161 == 63 ? 64 : local161;
							local273 = local168 == 63 ? 64 : local168;
							if (arg7 == 0) {
								local298 = arg3 + local273 - local17;
								local292 = local266 + arg9 - local7;
							} else if (arg7 == 1) {
								local298 = local7 + arg3 + 8 - local266;
								local292 = local273 + arg9 - local17;
							} else if (arg7 == 2) {
								local298 = local17 + arg3 + 8 - local273;
								local292 = arg9 + local7 + 8 - local266;
							} else {
								local292 = arg9 + local17 + 8 - local273;
								local298 = arg3 + local266 - local7;
							}
							if (local292 >= 0 && local292 < 104 && local298 >= 0 && local298 < 104) {
								Static250.anIntArrayArrayArray13[arg5][local292][local298] = Static250.anIntArrayArrayArray13[arg5][local220 + local129][local131 + local232];
							}
						}
					}
				}
			}
		}
		@Pc(517) boolean local517 = false;
		@Pc(704) int local704;
		@Pc(750) int local750;
		while (local121.anInt2400 < local121.aByteArray30.length) {
			local168 = local121.method1874();
			if (local168 == 128) {
				local517 = true;
				Static179.anIntArray299[0] = local121.method1837();
				Static179.anIntArray299[1] = local121.method1869();
				Static179.anIntArray299[2] = local121.method1869();
				Static179.anIntArray299[3] = local121.method1869();
				Static179.anIntArray299[4] = local121.method1837();
			} else {
				if (local168 != 129) {
					local121.anInt2400--;
					break;
				}
				for (local220 = 0; local220 < 4; local220++) {
					@Pc(560) byte local560 = local121.method1892();
					if (local560 == 0) {
						if (arg0 >= local220) {
							local266 = arg9;
							if (arg9 < 0) {
								local266 = 0;
							} else if (arg9 >= 104) {
								local266 = 104;
							}
							local273 = arg9 + 7;
							local292 = arg3;
							if (local273 < 0) {
								local273 = 0;
							} else if (local273 >= 104) {
								local273 = 104;
							}
							local298 = arg3 + 7;
							if (arg3 < 0) {
								local292 = 0;
							} else if (arg3 >= 104) {
								local292 = 104;
							}
							if (local298 < 0) {
								local298 = 0;
							} else if (local298 >= 104) {
								local298 = 104;
							}
							while (local266 < local273) {
								while (local298 > local292) {
									Static35.aByteArrayArrayArray1[arg5][local266][local292] = 0;
									local292++;
								}
								local266++;
							}
						}
					} else if (local560 == 1) {
						for (local266 = 0; local266 < 64; local266 += 4) {
							for (local273 = 0; local273 < 64; local273 += 4) {
								@Pc(692) byte local692 = local121.method1892();
								if (arg0 >= local220) {
									for (local298 = local266; local298 < local266 + 4; local298++) {
										for (local704 = local273; local704 < local273 + 4; local704++) {
											if (local298 >= local7 && local7 + 8 > local298 && local704 >= local17 && local17 + 8 > local17) {
												local750 = arg9 + Static86.method1379(local704 & 0x7, arg7, local298 & 0x7);
												@Pc(762) int local762 = Static136.method2179(arg7, local298 & 0x7, local704 & 0x7) + arg3;
												if (local750 >= 0 && local750 < 104 && local762 >= 0 && local762 < 104) {
													Static35.aByteArrayArrayArray1[arg5][local750][local762] = local692;
												}
											}
										}
									}
								}
							}
						}
					} else if (local560 != 2) {
					}
				}
			}
		}
		if (Static178.aBoolean216 && !arg8) {
			@Pc(841) Class64 local841 = null;
			while (true) {
				while (local121.aByteArray30.length > local121.anInt2400) {
					local220 = local121.method1874();
					if (local220 == 0) {
						local841 = new Class64(local121);
					} else if (local220 == 1) {
						local232 = local121.method1874();
						if (local232 > 0) {
							for (local266 = 0; local266 < local232; local266++) {
								@Pc(891) Class155 local891 = new Class155(local121);
								if (local891.anInt4692 == 31) {
									@Pc(901) Class24 local901 = Static40.method673(local121.method1837());
									local891.method3754(local901.anInt657, local901.anInt652, local901.anInt660, local901.anInt659);
								}
								local298 = local891.anInt4691 >> 7;
								local292 = local891.anInt4688 >> 7;
								if (arg0 == local891.anInt4698 && local7 <= local292 && local292 < local7 + 8 && local298 >= local17 && local298 < local17 + 8) {
									local704 = Static132.method2162(arg7, local891.anInt4691 & 0x3FF, local891.anInt4688 & 0x3FF) + (arg9 << 7);
									local750 = (arg3 << 7) + Static72.method1080(local891.anInt4688 & 0x3FF, local891.anInt4691 & 0x3FF, arg7);
									local891.anInt4691 = local750;
									local298 = local891.anInt4691 >> 7;
									local891.anInt4688 = local704;
									local292 = local891.anInt4688 >> 7;
									if (local292 >= 0 && local298 >= 0 && local292 < 104 && local298 < 104) {
										local891.aBoolean306 = (Static46.aByteArrayArrayArray2[1][local292][local298] & 0x2) != 0;
										local891.anInt4687 = Static250.anIntArrayArrayArray13[local891.anInt4698][local292][local298] - local891.anInt4687;
										Static12.method203(local891);
									}
								}
							}
						}
					} else if (local220 == 2) {
						if (local841 == null) {
							local841 = new Class64();
						}
						local841.method1734(local121);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local841 == null) {
					local841 = new Class64();
				}
				Static61.aClass64ArrayArray1[arg9 >> 3][arg3 >> 3] = local841;
				break;
			}
		}
		local168 = arg9 + 7;
		local220 = arg3 + 7;
		for (local232 = arg9; local232 < local168; local232++) {
			for (local266 = arg3; local266 < local220; local266++) {
				Static35.aByteArrayArrayArray1[arg5][local232][local266] = 0;
			}
		}
		return local517 ? Static179.anIntArray299 : null;
	}
}
