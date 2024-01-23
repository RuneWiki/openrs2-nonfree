import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Z")
	public static boolean aBoolean500;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Lclient!ui;")
	public static Class175 aClass175_42 = new Class175(50);

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "Lclient!l;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)J")
	public static long method4410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass18_1 == null ? 0L : local7.aClass18_1.aLong21;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	public static void method4412(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub5_Sub21 local8 = Static278.method4266(6, arg0);
		local8.method4064();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IJ)V")
	public static void method4414(@OriginalArg(1) long arg0) {
		if (Static228.anInt4270 == 1 || Static228.anInt4270 == 5) {
			Static53.method986(arg0);
		} else if (Static228.anInt4270 == 2) {
			Static299.method4474();
		} else {
			Static31.method535();
		}
		if (!Static91.aBoolean183) {
			if (Static17.anInt371 != 0) {
				Static35.anInt659 = Static187.anInt3575;
				Static146.anInt3019 = Static136.anInt2668;
			} else if (Static235.anInt4408 == 0) {
				Static35.anInt659 = Static89.anInt1899;
				Static146.anInt3019 = Static14.anInt309;
			} else {
				Static146.anInt3019 = Static45.anInt1043;
				Static35.anInt659 = Static186.anInt3549;
			}
			Static4.anIntArray16[0] = Static293.anInt5296;
			Static94.aShortArray46[0] = 1011;
			Static241.anInt4470 = 1;
			Static146.aStringArray19[0] = Static226.aString146;
			Static246.aStringArray28[0] = "";
		}
		Static52.method956((long) Static167.anInt637);
		if (Static315.anInt5636 != -1) {
			Static203.method2971(Static315.anInt5636);
		}
		@Pc(81) int local81;
		for (local81 = 0; local81 < Static37.anInt686; local81++) {
			if (Static166.aBooleanArray11[local81]) {
				Static88.aBooleanArray5[local81] = true;
			}
			Static276.aBooleanArray22[local81] = Static166.aBooleanArray11[local81];
			Static166.aBooleanArray11[local81] = false;
		}
		Static101.anInt2153 = Static167.anInt637;
		Static179.anInt3467 = -1;
		if (Static71.aBoolean165) {
			Static172.aBoolean293 = true;
		}
		Static134.aClass157_11 = null;
		Static129.anInt2559 = -1;
		Static87.aClass157_9 = null;
		if (Static315.anInt5636 != -1) {
			Static37.anInt686 = 0;
			Static79.method1635();
		}
		if (Static71.aBoolean165) {
			Static93.method1776();
		} else {
			Static77.method1604();
		}
		Static252.method3951();
		if (Static91.aBoolean183) {
			if (Static284.aBoolean486) {
				Static160.method2740();
			} else {
				Static306.method4568();
			}
		} else if (Static87.aClass157_9 != null) {
			Static223.method3597(Static148.anInt3033, Static16.anInt335, Static87.aClass157_9);
		} else if (Static179.anInt3467 != -1) {
			Static223.method3597(Static179.anInt3467, Static129.anInt2559, null);
		}
		local81 = Static91.aBoolean183 ? -1 : Static193.method3322();
		if (local81 == -1) {
			local81 = Static256.anInt4782;
		}
		Static279.method4269(local81);
		if (Static239.anInt4464 == 1) {
			Static239.anInt4464 = 2;
		}
		if (Static173.anInt3381 == 1) {
			Static173.anInt3381 = 2;
		}
		if (Static18.anInt394 == 3) {
			for (@Pc(213) int local213 = 0; local213 < Static37.anInt686; local213++) {
				if (Static276.aBooleanArray22[local213]) {
					if (Static71.aBoolean165) {
						Static93.method1762(Static23.anIntArray54[local213], Static282.anIntArray563[local213], Static35.anIntArray69[local213], Static313.anIntArray613[local213], 16711935, 128);
					} else {
						Static77.method1584(Static23.anIntArray54[local213], Static282.anIntArray563[local213], Static35.anIntArray69[local213], Static313.anIntArray613[local213], 16711935, 128);
					}
				} else if (Static88.aBooleanArray5[local213]) {
					if (Static71.aBoolean165) {
						Static93.method1762(Static23.anIntArray54[local213], Static282.anIntArray563[local213], Static35.anIntArray69[local213], Static313.anIntArray613[local213], 16711680, 128);
					} else {
						Static77.method1584(Static23.anIntArray54[local213], Static282.anIntArray563[local213], Static35.anIntArray69[local213], Static313.anIntArray613[local213], 16711680, 128);
					}
				}
			}
		}
		Static58.method1028(Static138.aClass11_Sub4_Sub1_3.anInt3856, Static132.anInt2608, Static138.aClass11_Sub4_Sub1_3.anInt3865, Static38.anInt722);
		Static38.anInt722 = 0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([Lclient!gd;IIIIIZ[B)[I")
	public static int[] method4415(@OriginalArg(0) Class60[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(9) byte local9;
		if (arg5) {
			local9 = 1;
		} else {
			local9 = 4;
		}
		@Pc(25) int local25;
		@Pc(32) int local32;
		if (!arg5) {
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				for (local25 = 0; local25 < 64; local25++) {
					for (local32 = 0; local32 < 64; local32++) {
						if (local25 + arg3 > 0 && arg3 + local25 < 103 && local32 + arg1 > 0 && local32 + arg1 < 103) {
							arg0[local18].anIntArrayArray12[local25 + arg3][local32 + arg1] &= 0xFFDFFFFF;
						}
					}
				}
			}
		}
		@Pc(100) Class1_Sub13 local100 = new Class1_Sub13(arg6);
		local25 = arg4 + arg3;
		local32 = arg1 + arg2;
		@Pc(122) int local122;
		for (@Pc(110) int local110 = 0; local110 < local9; local110++) {
			for (@Pc(115) int local115 = 0; local115 < 64; local115++) {
				for (local122 = 0; local122 < 64; local122++) {
					Static68.method1294(arg1 + local122, local25 + local115, local100, 0, false, 0, 0, arg5, local110, local122 + local32, local115 + arg3);
				}
			}
		}
		@Pc(159) boolean local159 = false;
		@Pc(161) boolean local161 = false;
		@Pc(217) int local217;
		@Pc(229) int local229;
		@Pc(235) int local235;
		@Pc(252) int local252;
		@Pc(231) int local231;
		while (local100.anInt2018 < local100.aByteArray63.length) {
			local122 = local100.method1853();
			if (local122 == 128) {
				Static261.anIntArray546[0] = local100.method1879();
				local159 = true;
				Static261.anIntArray546[1] = local100.method1843();
				Static261.anIntArray546[2] = local100.method1843();
				Static261.anIntArray546[3] = local100.method1843();
				Static261.anIntArray546[4] = local100.method1879();
			} else {
				if (local122 != 129) {
					local100.anInt2018--;
					break;
				}
				for (local217 = 0; local217 < 4; local217++) {
					@Pc(224) byte local224 = local100.method1829();
					if (local224 == 0) {
						local229 = arg3;
						local231 = arg1;
						local235 = arg3 + 64;
						if (arg3 < 0) {
							local229 = 0;
						} else if (arg3 >= 104) {
							local229 = 104;
						}
						local252 = arg1 + 64;
						if (arg1 < 0) {
							local231 = 0;
						} else if (arg1 >= 104) {
							local231 = 104;
						}
						if (local235 < 0) {
							local235 = 0;
						} else if (local235 >= 104) {
							local235 = 104;
						}
						if (local252 < 0) {
							local252 = 0;
						} else if (local252 >= 104) {
							local252 = 104;
						}
						while (local235 > local229) {
							while (local231 < local252) {
								Static199.aByteArrayArrayArray8[local217][local229][local231] = 0;
								local231++;
							}
							local229++;
						}
					} else if (local224 == 1) {
						for (local229 = 0; local229 < 64; local229 += 4) {
							for (local235 = 0; local235 < 64; local235 += 4) {
								@Pc(456) byte local456 = local100.method1829();
								for (local252 = local229 + arg3; local252 < arg3 + local229 + 4; local252++) {
									for (@Pc(472) int local472 = arg1 + local235; local472 < arg1 + local235 + 4; local472++) {
										if (local252 >= 0 && local252 < 104 && local472 >= 0 && local472 < 104) {
											Static199.aByteArrayArrayArray8[local217][local252][local472] = local456;
										}
									}
								}
							}
						}
					} else if (local224 == 2 && local217 > 0) {
						local229 = arg3;
						local235 = arg3 + 64;
						local252 = arg1 + 64;
						if (local235 < 0) {
							local235 = 0;
						} else if (local235 >= 104) {
							local235 = 104;
						}
						local231 = arg1;
						if (arg3 < 0) {
							local229 = 0;
						} else if (arg3 >= 104) {
							local229 = 104;
						}
						if (local252 < 0) {
							local252 = 0;
						} else if (local252 >= 104) {
							local252 = 104;
						}
						if (arg1 < 0) {
							local231 = 0;
						} else if (arg1 >= 104) {
							local231 = 104;
						}
						while (local235 > local229) {
							while (local252 > local231) {
								Static199.aByteArrayArrayArray8[local217][local229][local231] = Static199.aByteArrayArrayArray8[local217 - 1][local229][local231];
								local231++;
							}
							local229++;
						}
					}
				}
				local161 = true;
			}
		}
		@Pc(597) int local597;
		if (Static71.aBoolean165 && !arg5) {
			@Pc(545) Class43 local545 = null;
			while (true) {
				while (local100.anInt2018 < local100.aByteArray63.length) {
					local217 = local100.method1853();
					if (local217 == 0) {
						local545 = new Class43(local100);
					} else if (local217 == 1) {
						local597 = local100.method1853();
						if (local597 > 0) {
							for (local229 = 0; local229 < local597; local229++) {
								@Pc(613) Class118 local613 = new Class118(local100);
								if (local613.anInt3563 == 31) {
									@Pc(625) Class70 local625 = Static19.method321(local100.method1879());
									local613.method3151(local625.anInt1983, local625.anInt1981, local625.anInt1984, local625.anInt1986);
								}
								local613.anInt3569 += arg1 << 7;
								local613.anInt3551 += arg3 << 7;
								local252 = local613.anInt3569 >> 7;
								local231 = local613.anInt3551 >> 7;
								if (local231 >= 0 && local252 >= 0 && local231 < 104 && local252 < 104) {
									local613.aBoolean316 = (Static17.aByteArrayArrayArray1[1][local231][local252] & 0x2) != 0;
									local613.anInt3565 = Static280.anIntArrayArrayArray13[local613.anInt3552][local231][local252] - local613.anInt3565;
									Static151.method2642(local613);
								}
							}
						}
					} else if (local217 == 2) {
						if (local545 == null) {
							local545 = new Class43();
						}
						local545.method1133(local100);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local545 == null) {
					local545 = new Class43();
				}
				for (local217 = 0; local217 < 8; local217++) {
					for (local597 = 0; local597 < 8; local597++) {
						local229 = (arg3 >> 3) + local217;
						local235 = local597 + (arg1 >> 3);
						if (local229 >= 0 && local229 < 13 && local235 >= 0 && local235 < 13) {
							Static54.aClass43ArrayArray1[local229][local235] = local545;
						}
					}
				}
				break;
			}
		}
		if (!local161) {
			for (local122 = 0; local122 < 4; local122++) {
				for (local217 = 0; local217 < 16; local217++) {
					for (local597 = 0; local597 < 16; local597++) {
						local229 = (arg3 >> 2) + local217;
						local235 = (arg1 >> 2) + local597;
						if (local229 >= 0 && local229 < 26 && local235 >= 0 && local235 < 26) {
							Static199.aByteArrayArrayArray8[local122][local229][local235] = 0;
						}
					}
				}
			}
		}
		return local159 ? Static261.anIntArray546 : null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!nm;Lclient!nm;)V")
	public static void method4419(@OriginalArg(1) Class119 arg0, @OriginalArg(2) Class119 arg1) {
		Static170.aClass1_Sub5_Sub9_4 = Static134.method2332(arg1, arg0, Static219.anInt4103);
		if (Static71.aBoolean165) {
			Static286.aClass1_Sub5_Sub9_Sub2_2 = Static214.method1170(arg0, Static219.anInt4103, arg1);
		} else {
			Static286.aClass1_Sub5_Sub9_Sub2_2 = (Class1_Sub5_Sub9_Sub2) Static170.aClass1_Sub5_Sub9_4;
		}
		Static238.aClass1_Sub5_Sub9_5 = Static134.method2332(arg1, arg0, Static100.anInt5569);
		Static19.aClass1_Sub5_Sub9_1 = Static134.method2332(arg1, arg0, Static305.anInt5487);
	}
}
