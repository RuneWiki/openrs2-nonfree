import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!wf", name = "K", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!wf", name = "X", descriptor = "I")
	public static int anInt4298 = 0;

	@OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
	public static int anInt4299 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)V")
	public static void method3098() {
		Static137.anInt3502 = -1;
		Static141.anInt3602 = 1;
		Static95.anInt2455 = 2;
		Static5.aClass30_67 = null;
		Static7.anInt331 = 0;
		Static84.aBoolean219 = false;
		Static1.anInt221 = -1;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
	public static void method3103(@OriginalArg(0) int arg0) {
		if (Static141.anInt3602 == 0) {
			Static35.aClass1_Sub11_Sub2_1.method1775(arg0);
		} else {
			Static7.anInt331 = arg0;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BILclient!qh;IIILclient!te;II)V")
	public static void method3105(@OriginalArg(1) int arg0, @OriginalArg(2) Class69 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class80 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static8.aBoolean17 && (Static12.aByteArrayArrayArray11[0][arg0][arg3] & 0x2) == 0) {
			if ((Static12.aByteArrayArrayArray11[arg6][arg0][arg3] & 0x10) != 0) {
				return;
			}
			if (Static29.method531(arg3, arg6, arg0) != Static100.anInt2570) {
				return;
			}
		}
		if (arg6 < Static7.anInt327) {
			Static7.anInt327 = arg6;
		}
		@Pc(51) Class1_Sub1_Sub3 local51 = Static84.method3155(arg7);
		@Pc(64) int local64;
		@Pc(67) int local67;
		if (arg2 == 1 || arg2 == 3) {
			local64 = local51.anInt657;
			local67 = local51.anInt656;
		} else {
			local64 = local51.anInt656;
			local67 = local51.anInt657;
		}
		@Pc(82) int local82;
		@Pc(86) int local86;
		if (local64 + arg0 > 104) {
			local82 = arg0;
			local86 = arg0 + 1;
		} else {
			local82 = arg0 + (local64 >> 1);
			local86 = (local64 + 1 >> 1) + arg0;
		}
		@Pc(106) int[][] local106 = Static141.anIntArrayArrayArray3[arg6];
		@Pc(125) int local125;
		@Pc(119) int local119;
		if (local67 + arg3 <= 104) {
			local119 = arg3 + (local67 + 1 >> 1);
			local125 = (local67 >> 1) + arg3;
		} else {
			local119 = arg3 + 1;
			local125 = arg3;
		}
		@Pc(150) int local150 = (arg0 << 7) + (local64 << 6);
		@Pc(158) int local158 = (arg3 << 7) + (local67 << 6);
		@Pc(171) int local171 = (arg3 << 7) + arg0 + (arg7 << 14) + 1073741824;
		@Pc(177) int local177 = (arg2 << 6) + arg4;
		@Pc(204) int local204 = local106[local82][local119] + local106[local82][local125] + local106[local86][local125] + local106[local86][local119] >> 2;
		if (local51.anInt655 == 0) {
			local171 += Integer.MIN_VALUE;
		}
		if (local51.anInt654 == 1) {
			local177 += 256;
		}
		if (local51.method373()) {
			Static12.method240(arg6, local51, arg2, arg0, arg3);
		}
		@Pc(269) Class1_Sub1_Sub1 local269;
		if (arg4 != 22) {
			@Pc(370) int local370;
			if (arg4 == 10 || arg4 == 11) {
				if (local51.anInt651 == -1 && local51.anIntArray88 == null) {
					local269 = local51.method381(local158, 10, local150, local204, arg2, local106);
				} else {
					local269 = new Class1_Sub1_Sub1_Sub5(arg7, 10, arg2, arg6, arg0, arg3, local51.anInt651, true, null);
				}
				if (local269 != null && arg5.method2683(arg6, arg0, arg3, local204, local64, local67, local269, arg4 == 11 ? 256 : 0, local171, local177) && local51.aBoolean32) {
					local370 = 15;
					if (local269 instanceof Class1_Sub1_Sub1_Sub2) {
						local370 = ((Class1_Sub1_Sub1_Sub2) local269).method1080() / 4;
						if (local370 > 30) {
							local370 = 30;
						}
					}
					for (@Pc(388) int local388 = 0; local388 <= local64; local388++) {
						for (@Pc(392) int local392 = 0; local392 <= local67; local392++) {
							if (local370 > Static60.aByteArrayArrayArray109[arg6][arg0 + local388][arg3 + local392]) {
								Static60.aByteArrayArrayArray109[arg6][local388 + arg0][local392 + arg3] = (byte) local370;
							}
						}
					}
				}
				if (local51.anInt644 != 0 && arg1 != null) {
					arg1.method2403(arg3, local51.aBoolean27, arg0, local64, local67);
				}
			} else if (arg4 >= 12) {
				if (local51.anInt651 == -1 && local51.anIntArray88 == null) {
					local269 = local51.method381(local158, arg4, local150, local204, arg2, local106);
				} else {
					local269 = new Class1_Sub1_Sub1_Sub5(arg7, arg4, arg2, arg6, arg0, arg3, local51.anInt651, true, null);
				}
				arg5.method2683(arg6, arg0, arg3, local204, 1, 1, local269, 0, local171, local177);
				if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg6 > 0) {
					Static144.anIntArrayArrayArray4[arg6][arg0][arg3] |= 0x924;
				}
				if (local51.anInt644 != 0 && arg1 != null) {
					arg1.method2403(arg3, local51.aBoolean27, arg0, local64, local67);
				}
			} else if (arg4 == 0) {
				if (local51.anInt651 == -1 && local51.anIntArray88 == null) {
					local269 = local51.method381(local158, 0, local150, local204, arg2, local106);
				} else {
					local269 = new Class1_Sub1_Sub1_Sub5(arg7, 0, arg2, arg6, arg0, arg3, local51.anInt651, true, null);
				}
				arg5.method2689(arg6, arg0, arg3, local204, local269, null, Static162.anIntArray547[arg2], 0, local171, local177);
				if (arg2 == 0) {
					if (local51.aBoolean32) {
						Static60.aByteArrayArrayArray109[arg6][arg0][arg3] = 50;
						Static60.aByteArrayArrayArray109[arg6][arg0][arg3 + 1] = 50;
					}
					if (local51.aBoolean28) {
						Static144.anIntArrayArrayArray4[arg6][arg0][arg3] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (local51.aBoolean32) {
						Static60.aByteArrayArrayArray109[arg6][arg0][arg3 + 1] = 50;
						Static60.aByteArrayArrayArray109[arg6][arg0 + 1][arg3 + 1] = 50;
					}
					if (local51.aBoolean28) {
						Static144.anIntArrayArrayArray4[arg6][arg0][arg3 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (local51.aBoolean32) {
						Static60.aByteArrayArrayArray109[arg6][arg0 + 1][arg3] = 50;
						Static60.aByteArrayArrayArray109[arg6][arg0 + 1][arg3 + 1] = 50;
					}
					if (local51.aBoolean28) {
						Static144.anIntArrayArrayArray4[arg6][arg0 + 1][arg3] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (local51.aBoolean32) {
						Static60.aByteArrayArrayArray109[arg6][arg0][arg3] = 50;
						Static60.aByteArrayArrayArray109[arg6][arg0 + 1][arg3] = 50;
					}
					if (local51.aBoolean28) {
						Static144.anIntArrayArrayArray4[arg6][arg0][arg3] |= 0x492;
					}
				}
				if (local51.anInt644 != 0 && arg1 != null) {
					arg1.method2395(arg2, arg0, arg3, local51.aBoolean27, arg4);
				}
				if (local51.anInt662 != 16) {
					arg5.method2706(arg6, arg0, arg3, local51.anInt662);
				}
			} else if (arg4 == 1) {
				if (local51.anInt651 == -1 && local51.anIntArray88 == null) {
					local269 = local51.method381(local158, 1, local150, local204, arg2, local106);
				} else {
					local269 = new Class1_Sub1_Sub1_Sub5(arg7, 1, arg2, arg6, arg0, arg3, local51.anInt651, true, null);
				}
				arg5.method2689(arg6, arg0, arg3, local204, local269, null, Static55.anIntArray175[arg2], 0, local171, local177);
				if (local51.aBoolean32) {
					if (arg2 == 0) {
						Static60.aByteArrayArrayArray109[arg6][arg0][arg3 + 1] = 50;
					} else if (arg2 == 1) {
						Static60.aByteArrayArrayArray109[arg6][arg0 + 1][arg3 + 1] = 50;
					} else if (arg2 == 2) {
						Static60.aByteArrayArrayArray109[arg6][arg0 + 1][arg3] = 50;
					} else if (arg2 == 3) {
						Static60.aByteArrayArrayArray109[arg6][arg0][arg3] = 50;
					}
				}
				if (local51.anInt644 != 0 && arg1 != null) {
					arg1.method2395(arg2, arg0, arg3, local51.aBoolean27, arg4);
				}
			} else {
				@Pc(975) int local975;
				@Pc(1013) Class1_Sub1_Sub1 local1013;
				if (arg4 == 2) {
					local975 = arg2 + 1 & 0x3;
					@Pc(999) Class1_Sub1_Sub1 local999;
					if (local51.anInt651 == -1 && local51.anIntArray88 == null) {
						local999 = local51.method381(local158, 2, local150, local204, arg2 + 4, local106);
						local1013 = local51.method381(local158, 2, local150, local204, local975, local106);
					} else {
						local999 = new Class1_Sub1_Sub1_Sub5(arg7, 2, arg2 + 4, arg6, arg0, arg3, local51.anInt651, true, null);
						local1013 = new Class1_Sub1_Sub1_Sub5(arg7, 2, local975, arg6, arg0, arg3, local51.anInt651, true, null);
					}
					arg5.method2689(arg6, arg0, arg3, local204, local999, local1013, Static162.anIntArray547[arg2], Static162.anIntArray547[local975], local171, local177);
					if (local51.aBoolean28) {
						if (arg2 == 0) {
							Static144.anIntArrayArrayArray4[arg6][arg0][arg3] |= 0x249;
							Static144.anIntArrayArrayArray4[arg6][arg0][arg3 + 1] |= 0x492;
						} else if (arg2 == 1) {
							Static144.anIntArrayArrayArray4[arg6][arg0][arg3 + 1] |= 0x492;
							Static144.anIntArrayArrayArray4[arg6][arg0 + 1][arg3] |= 0x249;
						} else if (arg2 == 2) {
							Static144.anIntArrayArrayArray4[arg6][arg0 + 1][arg3] |= 0x249;
							Static144.anIntArrayArrayArray4[arg6][arg0][arg3] |= 0x492;
						} else if (arg2 == 3) {
							Static144.anIntArrayArrayArray4[arg6][arg0][arg3] |= 0x492;
							Static144.anIntArrayArrayArray4[arg6][arg0][arg3] |= 0x249;
						}
					}
					if (local51.anInt644 != 0 && arg1 != null) {
						arg1.method2395(arg2, arg0, arg3, local51.aBoolean27, arg4);
					}
					if (local51.anInt662 != 16) {
						arg5.method2706(arg6, arg0, arg3, local51.anInt662);
					}
				} else if (arg4 == 3) {
					if (local51.anInt651 == -1 && local51.anIntArray88 == null) {
						local269 = local51.method381(local158, 3, local150, local204, arg2, local106);
					} else {
						local269 = new Class1_Sub1_Sub1_Sub5(arg7, 3, arg2, arg6, arg0, arg3, local51.anInt651, true, null);
					}
					arg5.method2689(arg6, arg0, arg3, local204, local269, null, Static55.anIntArray175[arg2], 0, local171, local177);
					if (local51.aBoolean32) {
						if (arg2 == 0) {
							Static60.aByteArrayArrayArray109[arg6][arg0][arg3 + 1] = 50;
						} else if (arg2 == 1) {
							Static60.aByteArrayArrayArray109[arg6][arg0 + 1][arg3 + 1] = 50;
						} else if (arg2 == 2) {
							Static60.aByteArrayArrayArray109[arg6][arg0 + 1][arg3] = 50;
						} else if (arg2 == 3) {
							Static60.aByteArrayArrayArray109[arg6][arg0][arg3] = 50;
						}
					}
					if (local51.anInt644 != 0 && arg1 != null) {
						arg1.method2395(arg2, arg0, arg3, local51.aBoolean27, arg4);
					}
				} else if (arg4 == 9) {
					if (local51.anInt651 == -1 && local51.anIntArray88 == null) {
						local269 = local51.method381(local158, arg4, local150, local204, arg2, local106);
					} else {
						local269 = new Class1_Sub1_Sub1_Sub5(arg7, arg4, arg2, arg6, arg0, arg3, local51.anInt651, true, null);
					}
					arg5.method2683(arg6, arg0, arg3, local204, 1, 1, local269, 0, local171, local177);
					if (local51.anInt644 != 0 && arg1 != null) {
						arg1.method2403(arg3, local51.aBoolean27, arg0, local64, local67);
					}
					if (local51.anInt662 != 16) {
						arg5.method2706(arg6, arg0, arg3, local51.anInt662);
					}
				} else if (arg4 == 4) {
					if (local51.anInt651 == -1 && local51.anIntArray88 == null) {
						local269 = local51.method381(local158, 4, local150, local204, arg2, local106);
					} else {
						local269 = new Class1_Sub1_Sub1_Sub5(arg7, 4, arg2, arg6, arg0, arg3, local51.anInt651, true, null);
					}
					arg5.method2666(arg6, arg0, arg3, local204, local269, null, Static162.anIntArray547[arg2], 0, 0, 0, local171, local177);
				} else if (arg4 == 5) {
					local975 = 16;
					local370 = arg5.method2664(arg6, arg0, arg3);
					if (local370 != 0) {
						local975 = Static84.method3155(local370 >> 14 & 0x7FFF).anInt662;
					}
					if (local51.anInt651 == -1 && local51.anIntArray88 == null) {
						local1013 = local51.method381(local158, 4, local150, local204, arg2, local106);
					} else {
						local1013 = new Class1_Sub1_Sub1_Sub5(arg7, 4, arg2, arg6, arg0, arg3, local51.anInt651, true, null);
					}
					arg5.method2666(arg6, arg0, arg3, local204, local1013, null, Static162.anIntArray547[arg2], 0, Static20.anIntArray90[arg2] * local975, local975 * Static153.anIntArray507[arg2], local171, local177);
				} else if (arg4 == 6) {
					local370 = arg5.method2664(arg6, arg0, arg3);
					local975 = 8;
					if (local370 != 0) {
						local975 = Static84.method3155(local370 >> 14 & 0x7FFF).anInt662 / 2;
					}
					if (local51.anInt651 == -1 && local51.anIntArray88 == null) {
						local1013 = local51.method381(local158, 4, local150, local204, arg2 + 4, local106);
					} else {
						local1013 = new Class1_Sub1_Sub1_Sub5(arg7, 4, arg2 + 4, arg6, arg0, arg3, local51.anInt651, true, null);
					}
					arg5.method2666(arg6, arg0, arg3, local204, local1013, null, 256, arg2, local975 * Static51.anIntArray164[arg2], local975 * Static99.anIntArray313[arg2], local171, local177);
				} else if (arg4 == 7) {
					local370 = arg2 + 2 & 0x3;
					if (local51.anInt651 == -1 && local51.anIntArray88 == null) {
						local269 = local51.method381(local158, 4, local150, local204, local370 + 4, local106);
					} else {
						local269 = new Class1_Sub1_Sub1_Sub5(arg7, 4, local370 + 4, arg6, arg0, arg3, local51.anInt651, true, null);
					}
					arg5.method2666(arg6, arg0, arg3, local204, local269, null, 256, local370, 0, 0, local171, local177);
				} else if (arg4 == 8) {
					local975 = 8;
					local370 = arg5.method2664(arg6, arg0, arg3);
					if (local370 != 0) {
						local975 = Static84.method3155(local370 >> 14 & 0x7FFF).anInt662 / 2;
					}
					@Pc(1766) int local1766 = arg2 + 2 & 0x3;
					@Pc(1797) Class1_Sub1_Sub1 local1797;
					if (local51.anInt651 == -1 && local51.anIntArray88 == null) {
						local1013 = local51.method381(local158, 4, local150, local204, arg2 + 4, local106);
						local1797 = local51.method381(local158, 4, local150, local204, local1766 + 4, local106);
					} else {
						local1013 = new Class1_Sub1_Sub1_Sub5(arg7, 4, arg2 + 4, arg6, arg0, arg3, local51.anInt651, true, null);
						local1797 = new Class1_Sub1_Sub1_Sub5(arg7, 4, local1766 + 4, arg6, arg0, arg3, local51.anInt651, true, null);
					}
					arg5.method2666(arg6, arg0, arg3, local204, local1013, local1797, 256, arg2, local975 * Static51.anIntArray164[arg2], Static99.anIntArray313[arg2] * local975, local171, local177);
				}
			}
		} else if (!Static8.aBoolean17 || local51.anInt655 != 0 || local51.anInt644 == 1 || local51.aBoolean31) {
			if (local51.anInt651 == -1 && local51.anIntArray88 == null) {
				local269 = local51.method381(local158, 22, local150, local204, arg2, local106);
			} else {
				local269 = new Class1_Sub1_Sub1_Sub5(arg7, 22, arg2, arg6, arg0, arg3, local51.anInt651, true, null);
			}
			arg5.method2691(arg6, arg0, arg3, local204, local269, local171, local177);
			if (local51.anInt644 == 1 && arg1 != null) {
				arg1.method2405(arg0, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	public static void method3108() {
		if (Static157.anInt3834 > 0) {
			Static157.anInt3834--;
		}
		if (Static179.anInt4266 > 1) {
			Static179.anInt4266--;
		}
		if (Static37.aBoolean47) {
			Static37.aBoolean47 = false;
			Static49.method913();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static158.method2656(); local27++) {
		}
		if (Static156.anInt3821 != 30) {
			return;
		}
		Static57.method1097(Static25.aClass1_Sub8_Sub1_1);
		@Pc(51) Object local51 = Static20.aClass73_1.anObject4;
		@Pc(86) int local86;
		@Pc(71) int local71;
		@Pc(88) int local88;
		@Pc(104) int local104;
		@Pc(109) int local109;
		synchronized (Static20.aClass73_1.anObject4) {
			if (!Static52.aBoolean99) {
				Static20.aClass73_1.anInt3608 = 0;
			} else if (Static163.anInt4012 != 0 || Static20.aClass73_1.anInt3608 >= 40) {
				local71 = 0;
				Static25.aClass1_Sub8_Sub1_1.method919(236);
				Static25.aClass1_Sub8_Sub1_1.method862(0);
				local86 = Static25.aClass1_Sub8_Sub1_1.anInt1357;
				for (local88 = 0; local88 < Static20.aClass73_1.anInt3608 && Static25.aClass1_Sub8_Sub1_1.anInt1357 - local86 < 240; local88++) {
					local71++;
					local104 = Static20.aClass73_1.anIntArray479[local88];
					local109 = Static20.aClass73_1.anIntArray478[local88];
					if (local104 < 0) {
						local104 = 0;
					} else if (local104 > 502) {
						local104 = 502;
					}
					if (local109 < 0) {
						local109 = 0;
					} else if (local109 > 764) {
						local109 = 764;
					}
					@Pc(142) int local142 = local109 + local104 * 765;
					if (Static20.aClass73_1.anIntArray479[local88] == -1 && Static20.aClass73_1.anIntArray478[local88] == -1) {
						local104 = -1;
						local142 = 524287;
						local109 = -1;
					}
					if (Static170.anInt819 != local109 || Static85.anInt2268 != local104) {
						@Pc(186) int local186 = local109 - Static170.anInt819;
						Static170.anInt819 = local109;
						@Pc(192) int local192 = local104 - Static85.anInt2268;
						Static85.anInt2268 = local104;
						if (Static73.anInt2016 < 8 && local186 >= -32 && local186 <= 31 && local192 >= -32 && local192 <= 31) {
							local192 += 32;
							local186 += 32;
							Static25.aClass1_Sub8_Sub1_1.method869((local186 << 6) + (Static73.anInt2016 << 12) + local192);
							Static73.anInt2016 = 0;
						} else if (Static73.anInt2016 < 8) {
							Static25.aClass1_Sub8_Sub1_1.method872((Static73.anInt2016 << 19) + local142 + 8388608);
							Static73.anInt2016 = 0;
						} else {
							Static25.aClass1_Sub8_Sub1_1.method904(local142 + (Static73.anInt2016 << 19) - 1073741824);
							Static73.anInt2016 = 0;
						}
					} else if (Static73.anInt2016 < 2047) {
						Static73.anInt2016++;
					}
				}
				Static25.aClass1_Sub8_Sub1_1.method877(Static25.aClass1_Sub8_Sub1_1.anInt1357 - local86);
				if (Static20.aClass73_1.anInt3608 <= local71) {
					Static20.aClass73_1.anInt3608 = 0;
				} else {
					Static20.aClass73_1.anInt3608 -= local71;
					for (local104 = 0; local104 < Static20.aClass73_1.anInt3608; local104++) {
						Static20.aClass73_1.anIntArray478[local104] = Static20.aClass73_1.anIntArray478[local104 + local71];
						Static20.aClass73_1.anIntArray479[local104] = Static20.aClass73_1.anIntArray479[local71 + local104];
					}
				}
			}
		}
		if (Static163.anInt4012 != 0) {
			local86 = Static165.anInt4054;
			@Pc(350) long local350 = (Static94.aLong75 - Static167.aLong132) / 50L;
			local71 = Static38.anInt1049;
			Static167.aLong132 = Static94.aLong75;
			if (local86 < 0) {
				local86 = 0;
			} else if (local86 > 502) {
				local86 = 502;
			}
			if (local71 < 0) {
				local71 = 0;
			} else if (local71 > 764) {
				local71 = 764;
			}
			local88 = local71 + local86 * 765;
			if (local350 > 4095L) {
				local350 = 4095L;
			}
			@Pc(394) byte local394 = 0;
			if (Static163.anInt4012 == 2) {
				local394 = 1;
			}
			local109 = (int) local350;
			Static25.aClass1_Sub8_Sub1_1.method919(220);
			Static25.aClass1_Sub8_Sub1_1.method896((local109 << 20) + ((local394 << 19) + local88));
		}
		if (Static44.anInt1219 > 0) {
			Static44.anInt1219--;
		}
		if (Static92.aBooleanArray11[96] || Static92.aBooleanArray11[97] || Static92.aBooleanArray11[98] || Static92.aBooleanArray11[99]) {
			Static110.aBoolean137 = true;
		}
		if (Static110.aBoolean137 && Static44.anInt1219 <= 0) {
			Static44.anInt1219 = 20;
			Static110.aBoolean137 = false;
			Static25.aClass1_Sub8_Sub1_1.method919(148);
			Static25.aClass1_Sub8_Sub1_1.method895(Static80.anInt2162);
			Static25.aClass1_Sub8_Sub1_1.method879(Static127.anInt3355);
		}
		if (Static108.aBoolean94 && !Static23.aBoolean33) {
			Static23.aBoolean33 = true;
			Static25.aClass1_Sub8_Sub1_1.method919(26);
			Static25.aClass1_Sub8_Sub1_1.method862(1);
		}
		if (!Static108.aBoolean94 && Static23.aBoolean33) {
			Static23.aBoolean33 = false;
			Static25.aClass1_Sub8_Sub1_1.method919(26);
			Static25.aClass1_Sub8_Sub1_1.method862(0);
		}
		Static85.method1495();
		if (Static156.anInt3821 != 30) {
			return;
		}
		Static171.method2920();
		Static80.method1422();
		Static17.anInt531++;
		if (Static17.anInt531 > 750) {
			Static49.method913();
			return;
		}
		Static138.method2423();
		Static157.method2651();
		Static92.method1616();
		if (Static133.anInt3411 != 0) {
			Static10.anInt388 += 20;
			if (Static10.anInt388 >= 400) {
				Static133.anInt3411 = 0;
			}
		}
		Static58.anInt1635++;
		if (Static67.aClass60_2 != null) {
			Static82.anInt2196++;
			if (Static82.anInt2196 >= 15) {
				Static39.method659(Static67.aClass60_2);
				Static67.aClass60_2 = null;
			}
		}
		@Pc(655) Class60 local655;
		if (Static109.aClass60_10 != null) {
			Static39.method659(Static109.aClass60_10);
			Static80.anInt2161++;
			if (Static163.anInt4014 > Static171.anInt4154 + 5 || Static171.anInt4154 - 5 > Static163.anInt4014 || Static149.anInt3741 + 5 < Static96.anInt2484 || Static96.anInt2484 < Static149.anInt3741 - 5) {
				Static15.aBoolean21 = true;
			}
			if (Static18.anInt568 == 0) {
				if (Static15.aBoolean21 && Static80.anInt2161 >= 5) {
					if (Static109.aClass60_10 == Static149.aClass60_14 && Static144.anInt3641 != Static13.anInt453) {
						@Pc(653) byte local653 = 0;
						local655 = Static109.aClass60_10;
						if (Static109.anInt2807 == 1 && local655.anInt3007 == 206) {
							local653 = 1;
						}
						if (local655.anIntArray397[Static13.anInt453] <= 0) {
							local653 = 0;
						}
						if (Static37.method594(Static170.method475(local655))) {
							local86 = Static144.anInt3641;
							local71 = Static13.anInt453;
							local655.anIntArray397[local71] = local655.anIntArray397[local86];
							local655.anIntArray398[local71] = local655.anIntArray398[local86];
							local655.anIntArray397[local86] = -1;
							local655.anIntArray398[local86] = 0;
						} else if (local653 == 1) {
							local86 = Static144.anInt3641;
							local71 = Static13.anInt453;
							while (local86 != local71) {
								if (local71 < local86) {
									local655.method2057(local86, local86 - 1);
									local86--;
								} else if (local86 < local71) {
									local655.method2057(local86, local86 + 1);
									local86++;
								}
							}
						} else {
							local655.method2057(Static144.anInt3641, Static13.anInt453);
						}
						Static25.aClass1_Sub8_Sub1_1.method919(104);
						Static25.aClass1_Sub8_Sub1_1.method879(Static144.anInt3641);
						Static25.aClass1_Sub8_Sub1_1.method869(Static13.anInt453);
						Static25.aClass1_Sub8_Sub1_1.method894(Static109.aClass60_10.anInt3019);
						Static25.aClass1_Sub8_Sub1_1.method903(local653);
					}
				} else if ((Static90.anInt2406 == 1 || Static88.method1548(Static38.anInt1037 - 1)) && Static38.anInt1037 > 2) {
					Static91.method1598();
				} else if (Static38.anInt1037 > 0) {
					Static103.method1767(Static38.anInt1037 - 1);
				}
				Static109.aClass60_10 = null;
				Static163.anInt4012 = 0;
				Static82.anInt2196 = 10;
			}
		}
		Static91.aClass60_4 = null;
		Static50.aBoolean60 = false;
		Static99.anInt2524 = 0;
		Static77.aBoolean106 = false;
		local655 = Static107.aClass60_8;
		Static107.aClass60_8 = null;
		@Pc(841) Class60 local841 = Static74.aClass60_3;
		Static74.aClass60_3 = null;
		while (Static59.method1105() && Static99.anInt2524 < 128) {
			Static4.anIntArray44[Static99.anInt2524] = Static102.anInt2582;
			Static149.anIntArray491[Static99.anInt2524] = Static105.anInt2704;
			Static99.anInt2524++;
		}
		if (Static165.anInt4050 != -1) {
			Static156.method2641(765, 0, 503, Static165.anInt4050, 0, 0, 0);
		}
		Static176.anInt4191++;
		while (true) {
			@Pc(888) Class1_Sub13 local888;
			@Pc(901) Class60 local901;
			@Pc(893) Class60 local893;
			do {
				local888 = (Class1_Sub13) Static65.aClass56_12.method1857();
				if (local888 == null) {
					while (true) {
						do {
							local888 = (Class1_Sub13) Static100.aClass56_9.method1857();
							if (local888 == null) {
								while (true) {
									do {
										local888 = (Class1_Sub13) Static153.aClass56_14.method1857();
										if (local888 == null) {
											if (Static133.aClass60_12 != null) {
												Static5.method3148();
											}
											if (Static159.anInt3869 != -1) {
												local86 = Static159.anInt3869;
												local71 = Static159.anInt3872;
												@Pc(1047) boolean local1047 = Static95.method1631(0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local71, local86, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, true, 0, 0, 0);
												Static159.anInt3869 = -1;
												if (local1047) {
													Static90.anInt2404 = Static165.anInt4054;
													Static133.anInt3411 = 1;
													Static10.anInt388 = 0;
													Static47.anInt1255 = Static38.anInt1049;
												}
											}
											Static4.method162();
											if (local655 != Static107.aClass60_8) {
												if (local655 != null) {
													Static39.method659(local655);
												}
												if (Static107.aClass60_8 != null) {
													Static39.method659(Static107.aClass60_8);
												}
											}
											if (Static74.aClass60_3 != local841 && Static88.anInt2338 == Static33.anInt951) {
												if (local841 != null) {
													Static39.method659(local841);
												}
												if (Static74.aClass60_3 != null) {
													Static39.method659(Static74.aClass60_3);
												}
											}
											if (Static74.aClass60_3 == null) {
												if (Static88.anInt2338 > 0) {
													Static88.anInt2338--;
												}
											} else if (Static88.anInt2338 < Static33.anInt951) {
												Static88.anInt2338++;
												if (Static88.anInt2338 == Static33.anInt951) {
													Static39.method659(Static74.aClass60_3);
												}
											}
											Static140.method2465();
											if (Static106.aBoolean133) {
												Static97.method1671();
											}
											for (local86 = 0; local86 < 5; local86++) {
												@Pc(1135) int local1135 = Static139.anIntArray471[local86]++;
											}
											local71 = Static55.method1001();
											local88 = Static123.method2190();
											if (local71 > 4500 && local88 > 4500) {
												Static157.anInt3834 = 250;
												Static36.method587(4000);
												Static25.aClass1_Sub8_Sub1_1.method919(90);
											}
											Static61.anInt1647++;
											Static19.anInt606++;
											Static22.anInt697++;
											if (Static22.anInt697 > 500) {
												Static22.anInt697 = 0;
												local104 = (int) (Math.random() * 8.0D);
												if ((local104 & 0x2) == 2) {
													Static43.anInt1182 += Static160.anInt3954;
												}
												if ((local104 & 0x4) == 4) {
													Static134.anInt3412 += Static50.anInt1428;
												}
												if ((local104 & 0x1) == 1) {
													Static21.anInt683 += Static164.anInt4020;
												}
											}
											if (Static43.anInt1182 < -55) {
												Static160.anInt3954 = 2;
											}
											if (Static61.anInt1647 > 500) {
												Static61.anInt1647 = 0;
												local104 = (int) (Math.random() * 8.0D);
												if ((local104 & 0x1) == 1) {
													Static179.anInt4264 += Static122.anInt3943;
												}
												if ((local104 & 0x2) == 2) {
													Static49.anInt1423 += Static86.anInt2303;
												}
											}
											if (Static49.anInt1423 < -20) {
												Static86.anInt2303 = 1;
											}
											if (Static179.anInt4264 < -60) {
												Static122.anInt3943 = 2;
											}
											if (Static21.anInt683 < -50) {
												Static164.anInt4020 = 2;
											}
											if (Static134.anInt3412 < -40) {
												Static50.anInt1428 = 1;
											}
											if (Static21.anInt683 > 50) {
												Static164.anInt4020 = -2;
											}
											if (Static134.anInt3412 > 40) {
												Static50.anInt1428 = -1;
											}
											if (Static49.anInt1423 > 10) {
												Static86.anInt2303 = -1;
											}
											if (Static179.anInt4264 > 60) {
												Static122.anInt3943 = -2;
											}
											if (Static43.anInt1182 > 55) {
												Static160.anInt3954 = -2;
											}
											if (Static19.anInt606 > 50) {
												Static25.aClass1_Sub8_Sub1_1.method919(221);
											}
											try {
												if (Static43.aClass44_4 != null && Static25.aClass1_Sub8_Sub1_1.anInt1357 > 0) {
													Static43.aClass44_4.method1419(Static25.aClass1_Sub8_Sub1_1.aByteArray12, Static25.aClass1_Sub8_Sub1_1.anInt1357);
													Static25.aClass1_Sub8_Sub1_1.anInt1357 = 0;
													Static19.anInt606 = 0;
													return;
												}
												return;
											} catch (@Pc(1350) IOException local1350) {
												Static49.method913();
												return;
											}
										}
										local893 = local888.aClass60_6;
										if (local893.anInt3016 < 0) {
											break;
										}
										local901 = Static111.method1964(local893.anInt2971);
									} while (local901 == null || local901.aClass60Array1 == null || local893.anInt3016 >= local901.aClass60Array1.length || local893 != local901.aClass60Array1[local893.anInt3016]);
									Static178.method3065(local888);
								}
							}
							local893 = local888.aClass60_6;
							if (local893.anInt3016 < 0) {
								break;
							}
							local901 = Static111.method1964(local893.anInt2971);
						} while (local901 == null || local901.aClass60Array1 == null || local901.aClass60Array1.length <= local893.anInt3016 || local901.aClass60Array1[local893.anInt3016] != local893);
						Static178.method3065(local888);
					}
				}
				local893 = local888.aClass60_6;
				if (local893.anInt3016 < 0) {
					break;
				}
				local901 = Static111.method1964(local893.anInt2971);
			} while (local901 == null || local901.aClass60Array1 == null || local901.aClass60Array1.length <= local893.anInt3016 || local901.aClass60Array1[local893.anInt3016] != local893);
			Static178.method3065(local888);
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
	public static void method3109() {
		aBigInteger2 = null;
	}
}
