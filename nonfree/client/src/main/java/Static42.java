import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!sg;")
	public static Class97 aClass97_6;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!nq;")
	public static Class144 aClass144_17;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!ms;")
	public static Class137 aClass137_3 = null;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!no;")
	public static final Class142 aClass142_4 = new Class142(64);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method632() {
		@Pc(7) int local7 = Static232.aBoolean312 ? Static331.anInt6366 : Static331.anInt6366 + Static141.anInt2601;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class67_Sub3_Sub3 local14;
			if (local9 < 0) {
				local14 = Static156.aClass67_Sub3_Sub3_Sub2_2;
			} else if (local9 < Static331.anInt6366) {
				local14 = Static105.aClass67_Sub3_Sub3_Sub2Array1[Static87.anIntArray104[local9]];
			} else {
				local14 = Static356.aClass67_Sub3_Sub3_Sub1Array1[Static4.anIntArray4[local9 - Static331.anInt6366]];
			}
			if (local14.anInt4997 >= 0) {
				@Pc(40) int local40 = local14.method4368();
				if ((local40 & 0x1) == 0) {
					if ((local14.anInt6308 & 0x7F) == 0 && (local14.anInt6310 & 0x7F) == 0) {
						continue;
					}
				} else if ((local14.anInt6308 & 0x7F) == 64 && (local14.anInt6310 & 0x7F) == 64) {
					continue;
				}
				if (local14 instanceof Class67_Sub3_Sub3_Sub2 && local14.anInterface7_3 != null && Static293.anInt5807 >= local14.anInt5066 && Static293.anInt5807 < local14.anInt5067) {
					((Class67_Sub3_Sub3_Sub2) local14).aBoolean334 = false;
				}
				local14.anInt6313 = Static168.method2721(local14.anInt6308, Static322.anInt6250, local14.anInt6310);
				Static349.method5649(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ms;)Lclient!se;")
	public static Class11_Sub36 method634(@OriginalArg(0) Class137 arg0) {
		@Pc(13) Class11_Sub36 local13 = (Class11_Sub36) Static25.aClass58_38.method1009(((long) arg0.anInt4044 << 32) + (long) arg0.anInt4095);
		return local13 == null ? arg0.aClass11_Sub36_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!ko;)[Lclient!dp;")
	public static Class53[] method635(@OriginalArg(1) Class118 arg0) {
		if (!arg0.method2699()) {
			return new Class53[0];
		}
		@Pc(21) Class2 local21 = arg0.method2700();
		while (local21.anInt6 == 0) {
			Static244.method4311(10L);
		}
		if (local21.anInt6 == 2) {
			return new Class53[0];
		}
		@Pc(42) int[] local42 = (int[]) local21.anObject1;
		@Pc(48) Class53[] local48 = new Class53[local42.length >> 2];
		for (@Pc(50) int local50 = 0; local50 < local48.length; local50++) {
			@Pc(56) Class53 local56 = new Class53();
			local48[local50] = local56;
			local56.anInt1148 = local42[local50 << 2];
			local56.anInt1146 = local42[(local50 << 2) + 1];
			local56.anInt1152 = local42[(local50 << 2) + 2];
			local56.anInt1149 = local42[(local50 << 2) + 3];
		}
		return local48;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method636() {
		@Pc(7) int local7 = Static232.aBoolean312 ? Static331.anInt6366 : Static331.anInt6366 + Static141.anInt2601;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class67_Sub3_Sub3 local14;
			if (local9 < 0) {
				local14 = Static156.aClass67_Sub3_Sub3_Sub2_2;
			} else if (local9 < Static331.anInt6366) {
				local14 = Static105.aClass67_Sub3_Sub3_Sub2Array1[Static87.anIntArray104[local9]];
			} else {
				local14 = Static356.aClass67_Sub3_Sub3_Sub1Array1[Static4.anIntArray4[local9 - Static331.anInt6366]];
			}
			local14.anInt4996 = 0;
			if (local14.anInt4997 < 0) {
				local14.aBoolean330 = false;
			} else {
				@Pc(47) int local47 = local14.method4368();
				if ((local47 & 0x1) == 0) {
					if ((local14.anInt6308 & 0x7F) != 0 || (local14.anInt6310 & 0x7F) != 0) {
						local14.aBoolean330 = false;
						continue;
					}
				} else if ((local14.anInt6308 & 0x7F) != 64 || (local14.anInt6310 & 0x7F) != 64) {
					local14.aBoolean330 = false;
					continue;
				}
				@Pc(119) int local119;
				@Pc(89) int local89;
				@Pc(94) int local94;
				if (local47 == 1) {
					local89 = local14.anInt6308 >> 7;
					local94 = local14.anInt6310 >> 7;
					if (local14.anInt4997 != Static182.anIntArrayArray44[local89][local94]) {
						local14.aBoolean330 = true;
						continue;
					}
					if (Static62.anIntArrayArray4[local89][local94] > 1) {
						local119 = Static62.anIntArrayArray4[local89][local94]--;
						local14.aBoolean330 = true;
						continue;
					}
				} else {
					local89 = (local47 - 1) * 64 + 60;
					local94 = local14.anInt6308 - local89 >> 7;
					@Pc(148) int local148 = local14.anInt6310 - local89 >> 7;
					@Pc(155) int local155 = local14.anInt6308 + local89 >> 7;
					@Pc(162) int local162 = local14.anInt6310 + local89 >> 7;
					if (!Static180.method4113(local14.anInt4997, local94, local155, local148, local162)) {
						for (@Pc(173) int local173 = local94; local173 <= local155; local173++) {
							for (@Pc(176) int local176 = local148; local176 <= local162; local176++) {
								if (local14.anInt4997 == Static182.anIntArrayArray44[local173][local176]) {
									local119 = Static62.anIntArrayArray4[local173][local176]--;
								}
							}
						}
						local14.aBoolean330 = true;
						continue;
					}
				}
				if (local14 instanceof Class67_Sub3_Sub3_Sub2 && local14.anInterface7_3 != null && Static293.anInt5807 >= local14.anInt5066 && Static293.anInt5807 < local14.anInt5067) {
					((Class67_Sub3_Sub3_Sub2) local14).aBoolean334 = false;
				}
				local14.aBoolean330 = false;
				local14.anInt6313 = Static168.method2721(local14.anInt6308, Static322.anInt6250, local14.anInt6310);
				Static349.method5649(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	public static void method637(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static1.aByteArrayArrayArray1 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	public static void method638() {
		Static326.method4949();
		Static324.method5604();
		Static83.method1226();
		Static154.method2471();
		Static152.method4674();
		Static270.method4632();
		Static5.method23();
		Static54.method821();
		Static87.method1249();
		Static48.method703();
		Static133.method2065();
		Static207.method3721();
		Static207.method3720();
		Static70.method1056();
		Static54.method825();
		Static237.method4191();
		Static252.method5136();
		Static185.method3205();
		Static57.method867();
		Static251.method4412();
		Static9.method118();
		Static55.method829();
		if (Static156.anInt2987 != 0) {
			for (@Pc(61) int local61 = 0; local61 < Static168.aByteArrayArray23.length; local61++) {
				Static168.aByteArrayArray23[local61] = null;
			}
			Static237.anInt4756 = 0;
		}
		Static199.method3600();
		Static329.method5421();
		Static241.method4265();
		Static213.method3837();
		Static155.method2498();
		Static93.aClass26_12.method333();
		Static107.aClass129_4.method4943();
		Static260.aClass142_11.method3873();
		Static83.method1222();
		Static115.aClass144_37.method3918();
		Static53.aClass144_20.method3918();
		Static68.aClass144_25.method3918();
		Static55.aClass144_21.method3918();
		Static177.aClass144_45.method3918();
		Static316.aClass144_100.method3918();
		Static135.aClass144_38.method3918();
		Static296.aClass144_94.method3918();
		Static182.aClass144_49.method3918();
		Static232.aClass144_77.method3918();
		Static20.aClass144_6.method3918();
		Static32.aClass144_9.method3918();
		Static52.aClass144_79.method3918();
		Static318.aClass144_101.method3918();
		Static33.aClass144_11.method3918();
		Static177.aClass144_47.method3918();
		Static182.aClass144_50.method3918();
		Static237.aClass144_81.method3918();
		Static221.aClass144_70.method3918();
		Static221.aClass144_72.method3918();
		Static238.aClass144_82.method3918();
		Static236.aClass144_80.method3918();
		Static248.aClass144_86.method3918();
		Static225.aClass144_74.method3918();
		Static185.aClass144_51.method3918();
		Static176.aClass144_44.method3918();
		Static140.aClass144_39.method3918();
		Static331.aClass144_106.method3918();
		Static227.aClass144_75.method3918();
		Static108.aClass26_17.method333();
		Static156.aClass26_26.method333();
		Static100.aClass26_15.method333();
		Static131.aClass26_20.method333();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method639() {
		for (@Pc(1) int local1 = -1; local1 < Static331.anInt6366 + Static141.anInt2601; local1++) {
			@Pc(6) Class67_Sub3_Sub3 local6;
			if (local1 < 0) {
				local6 = Static156.aClass67_Sub3_Sub3_Sub2_2;
			} else if (local1 < Static331.anInt6366) {
				local6 = Static105.aClass67_Sub3_Sub3_Sub2Array1[Static87.anIntArray104[local1]];
			} else {
				local6 = Static356.aClass67_Sub3_Sub3_Sub1Array1[Static4.anIntArray4[local1 - Static331.anInt6366]];
			}
			if (local6.anInt4997 >= 0) {
				@Pc(32) int local32 = local6.method4368();
				if ((local32 & 0x1) == 0) {
					if ((local6.anInt6308 & 0x7F) != 0 || (local6.anInt6310 & 0x7F) != 0) {
						continue;
					}
				} else if ((local6.anInt6308 & 0x7F) != 64 || (local6.anInt6310 & 0x7F) != 64) {
					continue;
				}
				@Pc(109) int local109;
				@Pc(68) int local68;
				@Pc(73) int local73;
				if (local32 == 1) {
					local68 = local6.anInt6308 >> 7;
					local73 = local6.anInt6310 >> 7;
					if (local6.anInt4997 > Static182.anIntArrayArray44[local68][local73]) {
						Static182.anIntArrayArray44[local68][local73] = local6.anInt4997;
						Static62.anIntArrayArray4[local68][local73] = 1;
					} else if (local6.anInt4997 == Static182.anIntArrayArray44[local68][local73]) {
						local109 = Static62.anIntArrayArray4[local68][local73]++;
					}
				} else {
					local68 = (local32 - 1) * 64 + 60;
					local73 = local6.anInt6308 - local68 >> 7;
					@Pc(135) int local135 = local6.anInt6310 - local68 >> 7;
					@Pc(142) int local142 = local6.anInt6308 + local68 >> 7;
					@Pc(149) int local149 = local6.anInt6310 + local68 >> 7;
					for (@Pc(151) int local151 = local73; local151 <= local142; local151++) {
						for (@Pc(154) int local154 = local135; local154 <= local149; local154++) {
							if (local6.anInt4997 > Static182.anIntArrayArray44[local151][local154]) {
								Static182.anIntArrayArray44[local151][local154] = local6.anInt4997;
								Static62.anIntArrayArray4[local151][local154] = 1;
							} else if (local6.anInt4997 == Static182.anIntArrayArray44[local151][local154]) {
								local109 = Static62.anIntArrayArray4[local151][local154]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ms;)Z")
	public static boolean method640(@OriginalArg(0) Class137 arg0) {
		if (Static332.aBoolean414) {
			if (method634(arg0).anInt5612 != 0) {
				return false;
			}
			if (arg0.anInt4067 == 0) {
				return false;
			}
		}
		return arg0.aBoolean268;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!ms;IIIIIIIII)V")
	public static void method641(@OriginalArg(0) Class137[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class137 local6 = arg0[local1];
			if (local6 != null && local6.anInt4124 == arg1) {
				@Pc(17) int local17 = local6.anInt4071 + arg6;
				@Pc(22) int local22 = local6.anInt4098 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt4067 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt4060;
					@Pc(45) int local45 = local22 + local6.anInt4110;
					if (local6.anInt4067 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt4067 == 0 || local6.aBoolean262 || method634(local6).anInt5612 != 0 || local6 == aClass137_3 || local6.anInt4093 == 1338) {
					if (!method640(local6)) {
						if (local6 == Static45.aClass137_4) {
							Static259.aBoolean342 = true;
							Static10.anInt228 = local17;
							Static59.anInt1119 = local22;
						}
						if (local6.aBoolean266 || local28 < local32 && local30 < local34) {
							if (local6.anInt4067 == 0 && local6.aBoolean273 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(151) Class11_Sub13 local151 = (Class11_Sub13) Static284.aClass16_43.method193(); local151 != null; local151 = (Class11_Sub13) Static284.aClass16_43.method188()) {
									if (local151.aBoolean93) {
										local151.method5701();
										local151.aClass137_5.aBoolean265 = false;
									}
								}
								if (Static226.anInt4573 == 0) {
									Static45.aClass137_4 = null;
									aClass137_3 = null;
								}
								Static235.anInt4730 = 0;
								Static48.aBoolean58 = false;
								Static100.aBoolean106 = false;
								if (!Static38.aBoolean40) {
									Static265.method4599();
								}
							}
							@Pc(207) boolean local207;
							if (Static214.aClass29_1.method384() >= local28 && Static214.aClass29_1.method381() >= local30 && Static214.aClass29_1.method384() < local32 && Static214.aClass29_1.method381() < local34) {
								local207 = true;
							} else {
								local207 = false;
							}
							if (!Static38.aBoolean40 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static141.method2178(arg8 - local17, local6, arg9 - local22);
							}
							@Pc(235) boolean local235 = false;
							if (Static214.aClass29_1.method379() && local207) {
								local235 = true;
							}
							@Pc(245) boolean local245 = false;
							if (Static182.aClass11_Sub39_1 != null && Static182.aClass11_Sub39_1.method5600() == 0 && Static182.aClass11_Sub39_1.method5601() >= local28 && Static182.aClass11_Sub39_1.method5598() >= local30 && Static182.aClass11_Sub39_1.method5601() < local32 && Static182.aClass11_Sub39_1.method5598() < local34) {
								local245 = true;
							}
							@Pc(278) int local278;
							@Pc(374) int local374;
							if (local6.aByteArray61 != null) {
								for (local278 = 0; local278 < local6.aByteArray61.length; local278++) {
									if (Static278.aClass143_20.method4857(local6.aByteArray61[local278])) {
										if (local6.anIntArray322 == null || Static293.anInt5807 >= local6.anIntArray322[local278]) {
											@Pc(310) byte local310 = local6.aByteArray60[local278];
											if (local310 == 0 || ((local310 & 0x8) == 0 || !Static278.aClass143_20.method4857(86) && !Static278.aClass143_20.method4857(82) && !Static278.aClass143_20.method4857(81)) && ((local310 & 0x2) == 0 || Static278.aClass143_20.method4857(86)) && ((local310 & 0x1) == 0 || Static278.aClass143_20.method4857(82)) && ((local310 & 0x4) == 0 || Static278.aClass143_20.method4857(81))) {
												Static260.method4524(local6.anInt4044, local278 + 1, "", -1);
												local374 = local6.anIntArray320[local278];
												if (local6.anIntArray322 == null) {
													local6.anIntArray322 = new int[local6.aByteArray61.length];
												}
												if (local374 == 0) {
													local6.anIntArray322[local278] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray322[local278] = Static293.anInt5807 + local374;
												}
											}
										}
									} else if (local6.anIntArray322 != null) {
										local6.anIntArray322[local278] = 0;
									}
								}
							}
							if (local245) {
								Static124.method1907(Static182.aClass11_Sub39_1.method5601() - local17, local6, Static182.aClass11_Sub39_1.method5598() - local22);
							}
							if (Static45.aClass137_4 != null && Static45.aClass137_4 != local6 && local207 && method634(local6).method4726()) {
								Static275.aClass137_16 = local6;
							}
							if (local6 == aClass137_3) {
								Static137.aBoolean171 = true;
								Static74.anInt1410 = local17;
								Static67.anInt1250 = local22;
							}
							if (local6.aBoolean262 || local6.anInt4093 != 0) {
								@Pc(459) Class11_Sub13 local459;
								if (local207 && Static180.anInt4653 != 0 && local6.anObjectArray20 != null) {
									local459 = new Class11_Sub13();
									local459.aBoolean93 = true;
									local459.aClass137_5 = local6;
									local459.anInt1537 = Static180.anInt4653;
									local459.anObjectArray3 = local6.anObjectArray20;
									Static284.aClass16_43.method190(local459);
								}
								if (Static45.aClass137_4 != null || Static38.aBoolean40 || local6.anInt4093 != 1400 && Static235.anInt4730 > 0) {
									local245 = false;
									local235 = false;
									local207 = false;
								}
								@Pc(614) int local614;
								if (local6.anInt4093 != 0) {
									if (local6.anInt4093 == 1337 || local6.anInt4093 == 1403) {
										Static188.aClass137_11 = local6;
										if (Static162.aClass39_1 != null) {
											Static162.aClass39_1.method585(Static107.aClass129_4, local6.anInt4110);
										}
										if (local6.anInt4093 == 1337) {
											if (!Static38.aBoolean40 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static356.method5718(arg8, arg9, Static107.aClass129_4);
												for (@Pc(542) Class10_Sub6 local542 = (Class10_Sub6) Static169.aClass210_14.method5608(); local542 != null; local542 = (Class10_Sub6) Static169.aClass210_14.method5615()) {
													if (arg8 >= local542.anInt6293 && arg8 < local542.anInt6295 && arg9 >= local542.anInt6292 && arg9 < local542.anInt6294) {
														Static265.method4599();
														Static293.method4877(local542.aClass67_Sub3_Sub3_1);
													}
												}
											}
											Static19.method1624(local17, local6, local22);
											continue;
										}
									}
									@Pc(653) int local653;
									if (local6.anInt4093 == 1338) {
										if (local6.method3609(Static107.aClass129_4) == null || Static9.anInt153 != 0 && Static9.anInt153 != 3 || Static38.aBoolean40 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local278 = arg8 - local17;
										local614 = arg9 - local22;
										local374 = local6.anIntArray317[local614];
										if (local278 < local374 || local278 > local374 + local6.anIntArray315[local614]) {
											continue;
										}
										local278 -= local6.anInt4060 / 2;
										local614 -= local6.anInt4110 / 2;
										if (Static81.anInt1498 == 4) {
											local653 = (int) Static246.aFloat51 & 0x3FFF;
										} else {
											local653 = (int) Static246.aFloat51 + Static303.anInt4931 & 0x3FFF;
										}
										@Pc(665) int local665 = Class140.anIntArray330[local653];
										@Pc(669) int local669 = Class140.anIntArray329[local653];
										if (Static81.anInt1498 != 4) {
											local665 = local665 * (Static231.anInt5050 + 256) >> 8;
											local669 = local669 * (Static231.anInt5050 + 256) >> 8;
										}
										@Pc(698) int local698 = local614 * local665 + local278 * local669 >> 15;
										@Pc(708) int local708 = local614 * local669 - local278 * local665 >> 15;
										@Pc(719) int local719;
										@Pc(727) int local727;
										if (Static81.anInt1498 == 4) {
											local719 = (Static283.anInt5592 >> 7) + (local698 >> 2);
											local727 = (Static352.anInt6703 >> 7) - (local708 >> 2);
										} else {
											@Pc(736) int local736 = (Static156.aClass67_Sub3_Sub3_Sub2_2.method4368() - 1) * 64;
											local719 = (Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308 - local736 >> 7) + (local698 >> 2);
											local727 = (Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310 - local736 >> 7) - (local708 >> 2);
										}
										if (Static103.aBoolean118 && (Static335.anInt6393 & 0x40) != 0) {
											@Pc(769) Class137 local769 = Static188.method3467(Static219.anInt4454, Static122.anInt2282);
											if (local769 == null) {
												Static129.method1989();
											} else {
												Static87.method1252(local727, local719, 50, " ->", Static320.anInt6202, 1L, Static110.aString39);
											}
											continue;
										}
										if (Static68.anInt1264 == 1) {
											Static87.method1252(local727, local719, 3, "", -1, 1L, Static58.aClass117_21.method2684(Static230.anInt4634));
										}
										Static87.method1252(local727, local719, 23, "", -1, 1L, Static282.aString55);
										continue;
									}
									if (local6.anInt4093 == 1400) {
										Static238.aClass137_14 = local6;
										if (local207) {
											Static48.aBoolean58 = true;
										}
										if (local245) {
											local278 = (int) ((double) (Static182.aClass11_Sub39_1.method5601() - local17 - local6.anInt4060 / 2) * 2.0D / (double) Static271.aFloat47);
											local614 = (int) -((double) (Static182.aClass11_Sub39_1.method5598() - local22 - local6.anInt4110 / 2) * 2.0D / (double) Static271.aFloat47);
											local374 = Static247.anInt4959 + local278 + Static271.anInt4332;
											local653 = Static140.anInt2591 + local614 + Static271.anInt4339;
											@Pc(873) Class11_Sub4_Sub7 local873 = Static82.method1215();
											if (local873 == null) {
												continue;
											}
											@Pc(878) int[] local878 = new int[3];
											local873.method1590(local878, local374, local653);
											if (local878 != null) {
												if (Static278.aClass143_20.method4857(82) && Static248.anInt4969 > 0) {
													Static117.method1781(local878[1], local878[0], local878[2]);
													continue;
												}
												Static100.aBoolean106 = true;
												Static82.anInt1506 = local878[0];
												Static52.anInt4721 = local878[1];
												Static21.anInt1288 = local878[2];
											}
											Static235.anInt4730 = 1;
											Static250.aBoolean333 = false;
											Static325.anInt1278 = Static214.aClass29_1.method384();
											Static91.anInt1787 = Static214.aClass29_1.method381();
											continue;
										}
										if (local235 && Static235.anInt4730 > 0) {
											if (Static235.anInt4730 == 1 && (Static325.anInt1278 != Static214.aClass29_1.method384() || Static91.anInt1787 != Static214.aClass29_1.method381())) {
												Static185.anInt3740 = Static247.anInt4959;
												Static86.anInt1542 = Static140.anInt2591;
												Static235.anInt4730 = 2;
											}
											if (Static235.anInt4730 == 2) {
												Static250.aBoolean333 = true;
												Static137.method2136(Static185.anInt3740 + (int) ((double) (Static325.anInt1278 - Static214.aClass29_1.method384()) * 2.0D / (double) Static271.aFloat48));
												Static260.method4523(Static86.anInt1542 - (int) ((double) (Static91.anInt1787 - Static214.aClass29_1.method381()) * 2.0D / (double) Static271.aFloat48));
											}
											continue;
										}
										if (Static235.anInt4730 > 0 && !Static250.aBoolean333) {
											if ((Static294.anInt5813 == 1 || Static117.method1782()) && Static13.anInt245 > 2) {
												Static274.method4647(Static91.anInt1787, 2, Static325.anInt1278);
											} else if (Static151.method2284()) {
												Static274.method4647(Static91.anInt1787, 0, Static325.anInt1278);
											}
										}
										Static235.anInt4730 = 0;
										continue;
									}
									if (local6.anInt4093 == 1401) {
										if (local235) {
											Static327.method5383(local6.anInt4060, Static214.aClass29_1.method384() - local17, Static214.aClass29_1.method381() - local22, local6.anInt4110);
										}
										continue;
									}
									if (local6.anInt4093 == 1406) {
										Static88.method1285(local22, local17, local6);
										continue;
									}
								}
								if (!local6.aBoolean269 && local245) {
									local6.aBoolean269 = true;
									if (local6.anObjectArray24 != null) {
										local459 = new Class11_Sub13();
										local459.aBoolean93 = true;
										local459.aClass137_5 = local6;
										local459.anInt1535 = Static182.aClass11_Sub39_1.method5601() - local17;
										local459.anInt1537 = Static182.aClass11_Sub39_1.method5598() - local22;
										local459.anObjectArray3 = local6.anObjectArray24;
										Static284.aClass16_43.method190(local459);
									}
								}
								if (local6.aBoolean269 && local235 && local6.anObjectArray33 != null) {
									local459 = new Class11_Sub13();
									local459.aBoolean93 = true;
									local459.aClass137_5 = local6;
									local459.anInt1535 = Static214.aClass29_1.method384() - local17;
									local459.anInt1537 = Static214.aClass29_1.method381() - local22;
									local459.anObjectArray3 = local6.anObjectArray33;
									Static284.aClass16_43.method190(local459);
								}
								if (local6.aBoolean269 && !local235) {
									local6.aBoolean269 = false;
									if (local6.anObjectArray9 != null) {
										local459 = new Class11_Sub13();
										local459.aBoolean93 = true;
										local459.aClass137_5 = local6;
										local459.anInt1535 = Static214.aClass29_1.method384() - local17;
										local459.anInt1537 = Static214.aClass29_1.method381() - local22;
										local459.anObjectArray3 = local6.anObjectArray9;
										Static151.aClass16_25.method190(local459);
									}
								}
								if (local235 && local6.anObjectArray14 != null) {
									local459 = new Class11_Sub13();
									local459.aBoolean93 = true;
									local459.aClass137_5 = local6;
									local459.anInt1535 = Static214.aClass29_1.method384() - local17;
									local459.anInt1537 = Static214.aClass29_1.method381() - local22;
									local459.anObjectArray3 = local6.anObjectArray14;
									Static284.aClass16_43.method190(local459);
								}
								if (!local6.aBoolean265 && local207) {
									local6.aBoolean265 = true;
									if (local6.anObjectArray5 != null) {
										local459 = new Class11_Sub13();
										local459.aBoolean93 = true;
										local459.aClass137_5 = local6;
										local459.anInt1535 = Static214.aClass29_1.method384() - local17;
										local459.anInt1537 = Static214.aClass29_1.method381() - local22;
										local459.anObjectArray3 = local6.anObjectArray5;
										Static284.aClass16_43.method190(local459);
									}
								}
								if (local6.aBoolean265 && local207 && local6.anObjectArray17 != null) {
									local459 = new Class11_Sub13();
									local459.aBoolean93 = true;
									local459.aClass137_5 = local6;
									local459.anInt1535 = Static214.aClass29_1.method384() - local17;
									local459.anInt1537 = Static214.aClass29_1.method381() - local22;
									local459.anObjectArray3 = local6.anObjectArray17;
									Static284.aClass16_43.method190(local459);
								}
								if (local6.aBoolean265 && !local207) {
									local6.aBoolean265 = false;
									if (local6.anObjectArray32 != null) {
										local459 = new Class11_Sub13();
										local459.aBoolean93 = true;
										local459.aClass137_5 = local6;
										local459.anInt1535 = Static214.aClass29_1.method384() - local17;
										local459.anInt1537 = Static214.aClass29_1.method381() - local22;
										local459.anObjectArray3 = local6.anObjectArray32;
										Static151.aClass16_25.method190(local459);
									}
								}
								if (local6.anObjectArray6 != null) {
									local459 = new Class11_Sub13();
									local459.aClass137_5 = local6;
									local459.anObjectArray3 = local6.anObjectArray6;
									Static356.aClass16_54.method190(local459);
								}
								@Pc(1419) Class11_Sub13 local1419;
								if (local6.anObjectArray22 != null && Static73.anInt1390 > local6.anInt4103) {
									if (local6.anIntArray321 == null || Static73.anInt1390 - local6.anInt4103 > 32) {
										local459 = new Class11_Sub13();
										local459.aClass137_5 = local6;
										local459.anObjectArray3 = local6.anObjectArray22;
										Static284.aClass16_43.method190(local459);
									} else {
										label657: for (local278 = local6.anInt4103; local278 < Static73.anInt1390; local278++) {
											local614 = Static122.anIntArray160[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray321.length; local374++) {
												if (local6.anIntArray321[local374] == local614) {
													local1419 = new Class11_Sub13();
													local1419.aClass137_5 = local6;
													local1419.anObjectArray3 = local6.anObjectArray22;
													Static284.aClass16_43.method190(local1419);
													break label657;
												}
											}
										}
									}
									local6.anInt4103 = Static73.anInt1390;
								}
								if (local6.anObjectArray7 != null && Static71.anInt1344 > local6.anInt4042) {
									if (local6.anIntArray318 == null || Static71.anInt1344 - local6.anInt4042 > 32) {
										local459 = new Class11_Sub13();
										local459.aClass137_5 = local6;
										local459.anObjectArray3 = local6.anObjectArray7;
										Static284.aClass16_43.method190(local459);
									} else {
										label633: for (local278 = local6.anInt4042; local278 < Static71.anInt1344; local278++) {
											local614 = Static239.anIntArray379[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray318.length; local374++) {
												if (local6.anIntArray318[local374] == local614) {
													local1419 = new Class11_Sub13();
													local1419.aClass137_5 = local6;
													local1419.anObjectArray3 = local6.anObjectArray7;
													Static284.aClass16_43.method190(local1419);
													break label633;
												}
											}
										}
									}
									local6.anInt4042 = Static71.anInt1344;
								}
								if (local6.anObjectArray28 != null && Static291.anInt5765 > local6.anInt4053) {
									if (local6.anIntArray313 == null || Static291.anInt5765 - local6.anInt4053 > 32) {
										local459 = new Class11_Sub13();
										local459.aClass137_5 = local6;
										local459.anObjectArray3 = local6.anObjectArray28;
										Static284.aClass16_43.method190(local459);
									} else {
										label609: for (local278 = local6.anInt4053; local278 < Static291.anInt5765; local278++) {
											local614 = Static210.anIntArray331[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray313.length; local374++) {
												if (local6.anIntArray313[local374] == local614) {
													local1419 = new Class11_Sub13();
													local1419.aClass137_5 = local6;
													local1419.anObjectArray3 = local6.anObjectArray28;
													Static284.aClass16_43.method190(local1419);
													break label609;
												}
											}
										}
									}
									local6.anInt4053 = Static291.anInt5765;
								}
								if (local6.anObjectArray18 != null && Static197.anInt4032 > local6.anInt4085) {
									if (local6.anIntArray319 == null || Static197.anInt4032 - local6.anInt4085 > 32) {
										local459 = new Class11_Sub13();
										local459.aClass137_5 = local6;
										local459.anObjectArray3 = local6.anObjectArray18;
										Static284.aClass16_43.method190(local459);
									} else {
										label585: for (local278 = local6.anInt4085; local278 < Static197.anInt4032; local278++) {
											local614 = Static222.anIntArray343[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray319.length; local374++) {
												if (local6.anIntArray319[local374] == local614) {
													local1419 = new Class11_Sub13();
													local1419.aClass137_5 = local6;
													local1419.anObjectArray3 = local6.anObjectArray18;
													Static284.aClass16_43.method190(local1419);
													break label585;
												}
											}
										}
									}
									local6.anInt4085 = Static197.anInt4032;
								}
								if (local6.anObjectArray15 != null && Static208.anInt6377 > local6.anInt4088) {
									if (local6.anIntArray316 == null || Static208.anInt6377 - local6.anInt4088 > 32) {
										local459 = new Class11_Sub13();
										local459.aClass137_5 = local6;
										local459.anObjectArray3 = local6.anObjectArray15;
										Static284.aClass16_43.method190(local459);
									} else {
										label561: for (local278 = local6.anInt4088; local278 < Static208.anInt6377; local278++) {
											local614 = Static38.anIntArray52[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray316.length; local374++) {
												if (local6.anIntArray316[local374] == local614) {
													local1419 = new Class11_Sub13();
													local1419.aClass137_5 = local6;
													local1419.anObjectArray3 = local6.anObjectArray15;
													Static284.aClass16_43.method190(local1419);
													break label561;
												}
											}
										}
									}
									local6.anInt4088 = Static208.anInt6377;
								}
								if (Static322.anInt6251 > local6.anInt4061 && local6.anObjectArray19 != null) {
									local459 = new Class11_Sub13();
									local459.aClass137_5 = local6;
									local459.anObjectArray3 = local6.anObjectArray19;
									Static284.aClass16_43.method190(local459);
								}
								if (Static30.anInt546 > local6.anInt4061 && local6.anObjectArray12 != null) {
									local459 = new Class11_Sub13();
									local459.aClass137_5 = local6;
									local459.anObjectArray3 = local6.anObjectArray12;
									Static284.aClass16_43.method190(local459);
								}
								if (Static229.anInt4584 > local6.anInt4061 && local6.anObjectArray8 != null) {
									local459 = new Class11_Sub13();
									local459.aClass137_5 = local6;
									local459.anObjectArray3 = local6.anObjectArray8;
									Static284.aClass16_43.method190(local459);
								}
								if (Static92.anInt1650 > local6.anInt4061 && local6.anObjectArray23 != null) {
									local459 = new Class11_Sub13();
									local459.aClass137_5 = local6;
									local459.anObjectArray3 = local6.anObjectArray23;
									Static284.aClass16_43.method190(local459);
								}
								if (Static46.anInt908 > local6.anInt4061 && local6.anObjectArray4 != null) {
									local459 = new Class11_Sub13();
									local459.aClass137_5 = local6;
									local459.anObjectArray3 = local6.anObjectArray4;
									Static284.aClass16_43.method190(local459);
								}
								local6.anInt4061 = Static301.anInt5969;
								if (local6.anObjectArray11 != null) {
									for (local278 = 0; local278 < Static191.anInt6244; local278++) {
										@Pc(1887) Class11_Sub13 local1887 = new Class11_Sub13();
										local1887.aClass137_5 = local6;
										local1887.anInt1540 = Static10.aClass75Array1[local278].method1492();
										local1887.anInt1538 = Static10.aClass75Array1[local278].method1491();
										local1887.anObjectArray3 = local6.anObjectArray11;
										Static284.aClass16_43.method190(local1887);
									}
								}
								if (Static180.aBoolean311 && local6.anObjectArray26 != null) {
									local459 = new Class11_Sub13();
									local459.aClass137_5 = local6;
									local459.anObjectArray3 = local6.anObjectArray26;
									Static284.aClass16_43.method190(local459);
								}
							}
							if (local6.anInt4067 == 5 && local6.anInt4090 != -1) {
								local6.method3615().method585(Static107.aClass129_4, local6.anInt4110);
							}
							Static303.method4307(local6);
							if (local6.anInt4067 == 0) {
								method641(arg0, local6.anInt4044, local28, local30, local32, local34, local17 - local6.anInt4107, local22 - local6.anInt4062, arg8, arg9);
								if (local6.aClass137Array2 != null) {
									method641(local6.aClass137Array2, local6.anInt4044, local28, local30, local32, local34, local17 - local6.anInt4107, local22 - local6.anInt4062, arg8, arg9);
								}
								@Pc(2007) Class11_Sub41 local2007 = (Class11_Sub41) Static197.aClass58_18.method1009((long) local6.anInt4044);
								if (local2007 != null) {
									if (local2007.anInt6363 == 0 && !Static38.aBoolean40 && local207 && !Static332.aBoolean414) {
										Static265.method4599();
									}
									Static306.method5149(local34, local30, local2007.anInt6364, arg9, local28, local22, arg8, local17, local32);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static303.method4307(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ms;)Lclient!ms;")
	public static Class137 method642(@OriginalArg(0) Class137 arg0) {
		@Pc(4) int local4 = method634(arg0).method4723();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static166.method2688(arg0.anInt4124);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method645() {
		for (@Pc(1) int local1 = 0; local1 < Static24.anInt454; local1++) {
			@Pc(6) int[] local6 = Static182.anIntArrayArray44[local1];
			for (@Pc(8) int local8 = 0; local8 < Static240.anInt4832; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method646() {
		@Pc(14) boolean local14 = Static54.anInt1026 == 1 && Static331.anInt6366 > 200 || Static54.anInt1026 == 0 && Static331.anInt6366 > 50;
		@Pc(62) int local62;
		for (@Pc(16) int local16 = 0; local16 < Static331.anInt6366; local16++) {
			@Pc(23) Class67_Sub3_Sub3_Sub2 local23 = Static105.aClass67_Sub3_Sub3_Sub2Array1[Static87.anIntArray104[local16]];
			if (local23.method4383()) {
				local23.method5406();
				if (local23.aShort91 >= 0 && local23.aShort90 >= 0 && local23.aShort93 < Static24.anInt454 && local23.aShort92 < Static240.anInt4832) {
					local23.aBoolean334 = local23.aBoolean328 ? local14 : false;
					local62 = 0;
					if (!local23.aBoolean330) {
						local62++;
					}
					if (local23.anInt5042 > Static293.anInt5807) {
						local62 += 2;
					}
					local62 += 5 - local23.method4368() << 2;
					if (Static128.anInt2379 == 0) {
						local62 += 32;
					} else {
						local62 += 128;
					}
					local62 += 256;
					local23.anInt4997 = local62 + 1;
				} else {
					local23.anInt4997 = -1;
				}
			} else {
				local23.anInt4997 = -1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static141.anInt2601; local98++) {
			@Pc(105) Class67_Sub3_Sub3_Sub1 local105 = Static356.aClass67_Sub3_Sub3_Sub1Array1[Static4.anIntArray4[local98]];
			if (local105.method2674() && local105.aClass82_1.method1564()) {
				local105.method5406();
				if (local105.aShort91 >= 0 && local105.aShort90 >= 0 && local105.aShort93 < Static24.anInt454 && local105.aShort92 < Static240.anInt4832) {
					@Pc(141) int local141 = 0;
					if (!local105.aBoolean330) {
						local141++;
					}
					if (local105.anInt5042 > Static293.anInt5807) {
						local141 += 2;
					}
					local141 += 5 - local105.method4368() << 2;
					if (Static128.anInt2379 == 0) {
						if (local105.aClass82_1.aBoolean119) {
							local141 += 64;
						} else {
							local141 += 128;
						}
					} else if (Static128.anInt2379 == 1) {
						if (local105.aClass82_1.aBoolean119) {
							local141 += 32;
						} else {
							local141 += 64;
						}
					}
					if (local105.aClass82_1.aBoolean115) {
						local141 += 512;
					} else if (!local105.aClass82_1.aBoolean116) {
						local141 += 256;
					}
					local105.anInt4997 = local141 + 1;
				} else {
					local105.anInt4997 = -1;
				}
			} else {
				local105.anInt4997 = -1;
			}
		}
		for (local62 = 0; local62 < Static23.aClass119Array1.length; local62++) {
			@Pc(207) Class119 local207 = Static23.aClass119Array1[local62];
			if (local207 != null) {
				if (local207.anInt3328 == 1) {
					@Pc(218) Class67_Sub3_Sub3_Sub1 local218 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local207.anInt3336];
					if (local218 != null && local218.anInt4997 >= 0) {
						local218.anInt4997 += 1024;
					}
				} else if (local207.anInt3328 == 10) {
					@Pc(239) Class67_Sub3_Sub3_Sub2 local239 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local207.anInt3336];
					if (local239 != null && local239.anInt4997 >= 0) {
						local239.anInt4997 += 1024;
					}
				}
			}
		}
		Static156.aClass67_Sub3_Sub3_Sub2_2.anInt4997 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method648() {
		Static338.anInt6503 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static141.anInt2601; local3++) {
			@Pc(10) Class67_Sub3_Sub3_Sub1 local10 = Static356.aClass67_Sub3_Sub3_Sub1Array1[Static4.anIntArray4[local3]];
			if (local10.aBoolean330 && local10.method4375() != -1) {
				@Pc(28) int local28 = (local10.method4368() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6308 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6310 - local28 >> 7;
				@Pc(48) Class67_Sub3_Sub3 local48 = Static180.method4116(Static322.anInt6250, local35, local42);
				if (local48 != null) {
					@Pc(53) int local53 = local48.anInt5038;
					if (local48 instanceof Class67_Sub3_Sub3_Sub1) {
						local53 += 2048;
					}
					if (local48.anInt4996 == 0 && local48.method4375() != -1) {
						Static338.anIntArray537[Static338.anInt6503] = local53;
						Static195.anIntArray341[Static338.anInt6503] = local53;
						Static338.anInt6503++;
						local48.anInt4996++;
					}
					Static338.anIntArray537[Static338.anInt6503] = local53;
					Static195.anIntArray341[Static338.anInt6503] = local10.anInt5038 + 2048;
					Static338.anInt6503++;
					local48.anInt4996++;
				}
			}
		}
		Static150.method2276(Static338.anInt6503 - 1, Static195.anIntArray341, Static338.anIntArray537, 0);
	}
}
