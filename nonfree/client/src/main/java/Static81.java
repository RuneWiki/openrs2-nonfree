import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Lclient!la;")
	public static Class208 aClass208_15;

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	public static int anInt1318;

	// $FF: synthetic field
	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Ljava/lang/Class;")
	public static Class aClass5;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Ljava/lang/String;")
	public static String aString20 = null;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	public static int anInt1321 = 1405;

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1244() {
		for (@Pc(1) int local1 = 0; local1 < Static544.anInt9261; local1++) {
			@Pc(6) int[] local6 = Static300.anIntArrayArray34[local1];
			for (@Pc(8) int local8 = 0; local8 < Static282.anInt4887; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1246() {
		Static249.anInt4280 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static247.anInt4256; local3++) {
			@Pc(14) Class8_Sub1_Sub3_Sub2_Sub2 local14 = ((Class5_Sub35) Static623.aClass291_43.method6993((long) Static671.anIntArray620[local3], 1)).aClass8_Sub1_Sub3_Sub2_Sub2_2;
			if (local14.aBoolean540 && local14.method5992() != -1) {
				@Pc(34) int local34 = (local14.method5993() - 1) * 256 + 252;
				@Pc(41) int local41 = local14.anInt10355 - local34 >> 9;
				@Pc(48) int local48 = local14.anInt10363 - local34 >> 9;
				@Pc(55) Class8_Sub1_Sub3_Sub2 local55 = Static588.method8439(local14.aByte145, local48, local41);
				if (local55 != null) {
					@Pc(60) int local60 = local55.anInt6994;
					if (local55 instanceof Class8_Sub1_Sub3_Sub2_Sub2) {
						local60 += 2048;
					}
					if (local55.anInt7011 == 0 && local55.method5992() != -1) {
						Static178.anIntArray166[Static249.anInt4280] = local60;
						Static94.anIntArray77[Static249.anInt4280] = local60;
						Static249.anInt4280++;
						local55.anInt7011++;
					}
					Static178.anIntArray166[Static249.anInt4280] = local60;
					Static94.anIntArray77[Static249.anInt4280] = local14.anInt6994 + 2048;
					Static249.anInt4280++;
					local55.anInt7011++;
				}
			}
		}
		Static77.method9185(Static178.anIntArray166, 0, Static249.anInt4280 - 1, Static94.anIntArray77);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1247() {
		@Pc(1) int local1 = Static116.anInt3318;
		@Pc(3) int[] local3 = Static88.anIntArray464;
		@Pc(12) int local12 = Static243.aBoolean324 ? local1 : local1 + Static247.anInt4256;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(24) Class8_Sub1_Sub3_Sub2 local24;
			if (local14 < local1) {
				local24 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local3[local14]];
			} else {
				local24 = ((Class5_Sub35) Static623.aClass291_43.method6993((long) Static671.anIntArray620[local14 - local1], 1)).aClass8_Sub1_Sub3_Sub2_Sub2_2;
			}
			if (local24.anInt7018 >= 0) {
				@Pc(44) int local44 = local24.method5993();
				if ((local44 & 0x1) == 0) {
					if ((local24.anInt10355 & 0x1FF) == 0 && (local24.anInt10363 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local24.anInt10355 & 0x1FF) == 256 && (local24.anInt10363 & 0x1FF) == 256) {
					continue;
				}
				local24.anInt10357 = Static380.method5559(local24.anInt10355, local24.aByte145, local24.anInt10363, 0);
				Static270.method4024(local24, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BZ)V")
	public static void method1250(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static564.aClass5_Sub23_8 == null) {
			Static564.aClass5_Sub23_8 = new Class5_Sub23(20000);
		}
		Static564.aClass5_Sub23_8.method8528(arg0.length, 0, arg0);
		if (!arg1) {
			return;
		}
		Static440.method6509(Static564.aClass5_Sub23_8.aByteArray102);
		Static92.aClass180_Sub1Array1 = new Class180_Sub1[Static285.anInt4975];
		@Pc(38) int local38 = 0;
		for (@Pc(40) int local40 = Static466.anInt7934; local40 <= Static463.anInt7897; local40++) {
			@Pc(48) Class180_Sub1 local48 = Static30.method492(local40);
			if (local48 != null) {
				Static92.aClass180_Sub1Array1[local38++] = local48;
			}
		}
		Static194.aBoolean260 = false;
		Static566.aLong276 = Static515.method7499(95);
		Static564.aClass5_Sub23_8 = null;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1251(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static116.anInt3318;
		@Pc(3) int[] local3 = Static88.anIntArray464;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static247.anInt4256; local5++) {
			@Pc(15) Class8_Sub1_Sub3_Sub2 local15;
			if (local5 < local1) {
				local15 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class5_Sub35) Static623.aClass291_43.method6993((long) Static671.anIntArray620[local5 - local1], 1)).aClass8_Sub1_Sub3_Sub2_Sub2_2;
			}
			if (local15.aByte145 == arg0 && local15.anInt7018 >= 0) {
				@Pc(41) int local41 = local15.method5993();
				if ((local41 & 0x1) == 0) {
					if ((local15.anInt10355 & 0x1FF) != 0 || (local15.anInt10363 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt10355 & 0x1FF) != 256 || (local15.anInt10363 & 0x1FF) != 256) {
					continue;
				}
				@Pc(85) int local85;
				@Pc(90) int local90;
				@Pc(127) int local127;
				if (local41 == 1) {
					local85 = local15.anInt10355 >> 9;
					local90 = local15.anInt10363 >> 9;
					if (local15.anInt7018 > Static300.anIntArrayArray34[local85][local90]) {
						Static300.anIntArrayArray34[local85][local90] = local15.anInt7018;
						Static555.anIntArrayArray50[local85][local90] = 1;
					} else if (local15.anInt7018 == Static300.anIntArrayArray34[local85][local90]) {
						local127 = Static555.anIntArrayArray50[local85][local90]++;
					}
				} else {
					local85 = (local41 - 1) * 256 + 60;
					local90 = local15.anInt10355 - local85 >> 9;
					@Pc(154) int local154 = local15.anInt10363 - local85 >> 9;
					@Pc(161) int local161 = local15.anInt10355 + local85 >> 9;
					@Pc(168) int local168 = local15.anInt10363 + local85 >> 9;
					for (@Pc(170) int local170 = local90; local170 <= local161; local170++) {
						for (@Pc(173) int local173 = local154; local173 <= local168; local173++) {
							if (local15.anInt7018 > Static300.anIntArrayArray34[local170][local173]) {
								Static300.anIntArrayArray34[local170][local173] = local15.anInt7018;
								Static555.anIntArrayArray50[local170][local173] = 1;
							} else if (local15.anInt7018 == Static300.anIntArrayArray34[local170][local173]) {
								local127 = Static555.anIntArrayArray50[local170][local173]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!cn;)Lclient!qv;")
	public static Class5_Sub45 method1252(@OriginalArg(0) Class73 arg0) {
		@Pc(13) Class5_Sub45 local13 = (Class5_Sub45) Static131.aClass291_11.method6993(((long) arg0.anInt1388 << 32) + (long) arg0.anInt1364, 1);
		return local13 == null ? arg0.aClass5_Sub45_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!cn;)Lclient!cn;")
	public static Class73 method1254(@OriginalArg(0) Class73 arg0) {
		@Pc(4) int local4 = method1252(arg0).method7130();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local4; local11++) {
			arg0 = Static259.method3831(arg0.anInt1410);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1255() {
		@Pc(1) int local1 = Static116.anInt3318;
		@Pc(3) int[] local3 = Static88.anIntArray464;
		@Pc(8) int local8 = Static637.aClass5_Sub20_31.aClass24_Sub13_1.method5073();
		@Pc(30) boolean local30 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(103) int local103;
		for (@Pc(32) int local32 = 0; local32 < local1; local32++) {
			@Pc(39) Class8_Sub1_Sub3_Sub2_Sub1 local39 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local3[local32]];
			if (!local39.method3600()) {
				local39.anInt7018 = -1;
			} else if (local39.aBoolean327) {
				local39.anInt7018 = -1;
			} else {
				local39.method8231();
				if (local39.aShort109 >= 0 && local39.aShort108 >= 0 && local39.aShort110 < Static544.anInt9261 && local39.aShort107 < Static282.anInt4887) {
					local39.aBoolean326 = local39.aBoolean543 ? local30 : false;
					if (local39 == Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1) {
						local39.anInt7018 = Integer.MAX_VALUE;
					} else {
						local103 = 0;
						if (!local39.aBoolean540) {
							local103++;
						}
						if (local39.anInt7000 > Static44.anInt740) {
							local103 += 2;
						}
						local103 += 5 - local39.method5993() << 2;
						if (local39.aBoolean328 || local39.aBoolean325) {
							local103 += 512;
						} else {
							if (Static80.anInt1219 == 0) {
								local103 += 32;
							} else {
								local103 += 128;
							}
							local103 += 256;
						}
						local39.anInt7018 = local103 + 1;
					}
				} else {
					local39.anInt7018 = -1;
				}
			}
		}
		for (@Pc(155) int local155 = 0; local155 < Static247.anInt4256; local155++) {
			@Pc(166) Class8_Sub1_Sub3_Sub2_Sub2 local166 = ((Class5_Sub35) Static623.aClass291_43.method6993((long) Static671.anIntArray620[local155], 1)).aClass8_Sub1_Sub3_Sub2_Sub2_2;
			if (local166.method6010((byte) -102) && local166.aClass227_1.method5326(Static413.aClass118_1)) {
				local166.method8231();
				if (local166.aShort109 >= 0 && local166.aShort108 >= 0 && local166.aShort110 < Static544.anInt9261 && local166.aShort107 < Static282.anInt4887) {
					@Pc(213) int local213 = 0;
					if (!local166.aBoolean540) {
						local213++;
					}
					if (local166.anInt7000 > Static44.anInt740) {
						local213 += 2;
					}
					local213 += 5 - local166.method5993() << 2;
					if (Static80.anInt1219 == 0) {
						if (local166.aClass227_1.aBoolean463) {
							local213 += 64;
						} else {
							local213 += 128;
						}
					} else if (Static80.anInt1219 == 1) {
						if (local166.aClass227_1.aBoolean463) {
							local213 += 32;
						} else {
							local213 += 64;
						}
					}
					if (local166.aClass227_1.aBoolean464) {
						local213 += 1024;
					} else if (!local166.aClass227_1.aBoolean469) {
						local213 += 256;
					}
					local166.anInt7018 = local213 + 1;
				} else {
					local166.anInt7018 = -1;
				}
			} else {
				local166.anInt7018 = -1;
			}
		}
		for (local103 = 0; local103 < Static598.aClass28Array1.length; local103++) {
			@Pc(292) Class28 local292 = Static598.aClass28Array1[local103];
			if (local292 != null) {
				if (local292.anInt500 == 1) {
					@Pc(308) Class5_Sub35 local308 = (Class5_Sub35) Static623.aClass291_43.method6993((long) local292.anInt502, 1);
					if (local308 != null) {
						@Pc(313) Class8_Sub1_Sub3_Sub2_Sub2 local313 = local308.aClass8_Sub1_Sub3_Sub2_Sub2_2;
						if (local313.anInt7018 >= 0) {
							local313.anInt7018 += 2048;
						}
					}
				} else if (local292.anInt500 == 10) {
					@Pc(333) Class8_Sub1_Sub3_Sub2_Sub1 local333 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local292.anInt502];
					if (local333 != null && local333 != Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 && local333.anInt7018 >= 0) {
						local333.anInt7018 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!cn;IIIIIIIIIII)V")
	public static void method1257(@OriginalArg(0) Class73[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label812: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class73 local6 = arg0[local1];
			if (local6 != null && local6.anInt1410 == arg1) {
				@Pc(19) int local19 = local6.anInt1378 + arg6;
				@Pc(24) int local24 = local6.anInt1375 + arg7;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(36) int local36;
				@Pc(42) int local42;
				@Pc(47) int local47;
				if (local6.anInt1391 == 2) {
					local30 = arg2;
					local32 = arg3;
					local34 = arg4;
					local36 = arg5;
				} else {
					local42 = local19 + local6.anInt1384;
					local47 = local24 + local6.anInt1394;
					if (local6.anInt1391 == 9) {
						local42++;
						local47++;
					}
					local30 = local19 > arg2 ? local19 : arg2;
					local32 = local24 > arg3 ? local24 : arg3;
					local34 = local42 < arg4 ? local42 : arg4;
					local36 = local47 < arg5 ? local47 : arg5;
				}
				if (local6.anInt1391 == 0 || local6.aBoolean127 || method1252(local6).anInt8267 != 0 || local6 == Static142.aClass73_6 || local6.anInt1367 == Static229.anInt3717 || local6.anInt1367 == Static284.anInt4917) {
					if (!method1261(local6)) {
						local42 = 0;
						local47 = 0;
						if (Static40.aBoolean61) {
							local42 = Static169.method2467();
							local47 = Static375.method5510();
						}
						if (local6 == Static370.aClass73_22 && Static639.method8925(Static370.aClass73_22) != null) {
							Static50.aBoolean68 = true;
							Static504.anInt8681 = local19;
							Static665.anInt10649 = local24;
						}
						if (local6.aBoolean124 || local30 < local34 && local32 < local36) {
							if (local6.aBoolean134 && arg10 >= local30 && arg11 >= local32 && arg10 < local34 && arg11 < local36) {
								for (@Pc(208) Class5_Sub3 local208 = (Class5_Sub3) Static118.aClass102_3.method1916(); local208 != null; local208 = (Class5_Sub3) Static118.aClass102_3.method1915()) {
									if (local208.aBoolean34) {
										local208.method9327(1);
										local208.aClass73_1.aBoolean138 = false;
									}
								}
								if (Static408.anInt7078 == 0) {
									Static370.aClass73_22 = null;
									Static142.aClass73_6 = null;
								}
								Static288.anInt5464 = 0;
								Static458.aBoolean593 = false;
								Static591.aBoolean753 = false;
								if (!Static526.aBoolean669) {
									Static397.method5811();
								}
							}
							@Pc(286) boolean local286;
							if (Static205.aClass107_1.method4079() + local42 >= local30 && Static205.aClass107_1.method4072() + local47 >= local32 && Static205.aClass107_1.method4079() + local42 < local34 && Static205.aClass107_1.method4072() + local47 < local36) {
								local286 = true;
							} else {
								local286 = false;
							}
							if (!Static199.aBoolean706 && local286) {
								if (local6.anInt1347 >= 0) {
									Static446.anInt7686 = local6.anInt1347;
								} else if (local6.aBoolean134) {
									Static446.anInt7686 = -1;
								}
							}
							if (!Static526.aBoolean669 && arg10 >= local30 && arg11 >= local32 && arg10 < local34 && arg11 < local36) {
								Static241.method8496(local6, arg10 - local19, arg11 - local24);
							}
							@Pc(347) boolean local347 = false;
							if (Static205.aClass107_1.method4075() && local286) {
								local347 = true;
							}
							@Pc(359) boolean local359 = false;
							@Pc(364) Class5_Sub6 local364 = (Class5_Sub6) Static536.aClass102_65.method1916();
							if (local364 != null && local364.method5806() == 0 && local364.method5803() + local42 >= local30 && local364.method5804() + local47 >= local32 && local364.method5803() + local42 < local34 && local364.method5804() + local47 < local36) {
								local359 = true;
							}
							@Pc(420) int local420;
							@Pc(586) int local586;
							if (local6.aByteArray7 != null && !Static110.method1580()) {
								for (local420 = 0; local420 < local6.aByteArray7.length; local420++) {
									if (Static258.aClass89_1.method1617(local6.aByteArray7[local420])) {
										if (local6.anIntArray63 == null || Static44.anInt740 >= local6.anIntArray63[local420]) {
											@Pc(457) byte local457 = local6.aByteArray6[local420];
											if (local457 == 0 || ((local457 & 0x8) == 0 || !Static258.aClass89_1.method1617(86) && !Static258.aClass89_1.method1617(82) && !Static258.aClass89_1.method1617(81)) && ((local457 & 0x2) == 0 || Static258.aClass89_1.method1617(86)) && ((local457 & 0x1) == 0 || Static258.aClass89_1.method1617(82)) && ((local457 & 0x4) == 0 || Static258.aClass89_1.method1617(81))) {
												if (local420 < 10) {
													Static564.method8144("", local6.anInt1388, -1, local420 + 1);
												} else if (local420 == 10) {
													Static179.method2592();
													@Pc(549) Class5_Sub45 local549 = method1252(local6);
													Static455.method6703(local549.anInt8276, local6, local549.method7132());
													Static211.aString54 = Static277.method4084(local6);
													if (Static211.aString54 == null) {
														Static211.aString54 = "Null";
													}
													Static352.aString75 = local6.aString22 + "<col=ffffff>";
												}
												local586 = local6.anIntArray67[local420];
												if (local6.anIntArray63 == null) {
													local6.anIntArray63 = new int[local6.aByteArray7.length];
												}
												if (local586 == 0) {
													local6.anIntArray63[local420] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray63[local420] = Static44.anInt740 + local586;
												}
											}
										}
									} else if (local6.anIntArray63 != null) {
										local6.anIntArray63[local420] = 0;
									}
								}
							}
							if (local359) {
								Static192.method3809(local47 + local364.method5804() - local24, local42 + local364.method5803() - local19, local6);
							}
							if (Static370.aClass73_22 != null && Static370.aClass73_22 != local6 && local286 && method1252(local6).method7128()) {
								Static168.aClass73_8 = local6;
							}
							if (local6 == Static142.aClass73_6) {
								Static433.aBoolean571 = true;
								Static550.anInt9295 = local19;
								Static126.anInt1985 = local24;
							}
							if (local6.aBoolean127 || local6.anInt1367 != 0) {
								@Pc(700) Class5_Sub3 local700;
								if (local286 && Static659.anInt10600 != 0 && local6.lb != null) {
									local700 = new Class5_Sub3();
									local700.aBoolean34 = true;
									local700.aClass73_1 = local6;
									local700.anInt323 = Static659.anInt10600;
									local700.anObjectArray1 = local6.lb;
									Static118.aClass102_3.method1921(local700);
								}
								if (Static370.aClass73_22 != null || Static526.aBoolean669 || local6.anInt1367 != Static279.anInt4836 && Static288.anInt5464 > 0) {
									local359 = false;
									local347 = false;
									local286 = false;
								}
								@Pc(899) int local899;
								if (local6.anInt1367 != 0) {
									if (local6.anInt1367 == Static410.anInt7141 || local6.anInt1367 == Static268.anInt4665) {
										Static417.aClass73_19 = local6;
										if (Static86.aClass311_1 != null) {
											Static86.aClass311_1.method7509(local6.anInt1394, Static457.aClass57_11);
										}
										if (local6.anInt1367 == Static410.anInt7141) {
											if (Static526.aBoolean669 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
												continue;
											}
											Static547.method7960(Static457.aClass57_11, arg9, arg8);
											@Pc(807) Class8_Sub3 local807 = (Class8_Sub3) Static571.aClass98_7.method1777();
											while (true) {
												if (local807 == null) {
													continue label812;
												}
												if (arg10 >= local807.anInt1792 && arg10 < local807.anInt1793 && arg11 >= local807.anInt1797 && arg11 < local807.anInt1798) {
													Static397.method5811();
													Static367.method8721(local807.aClass8_Sub1_Sub3_Sub2_1);
												}
												local807 = (Class8_Sub3) Static571.aClass98_7.method1782();
											}
										}
									}
									@Pc(941) int local941;
									if (local6.anInt1367 == Static229.anInt3717) {
										if (local6.method1287(Static457.aClass57_11) == null || Static170.anInt2914 != 0 && Static170.anInt2914 != 3 || Static526.aBoolean669 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
											continue;
										}
										local420 = arg10 - local19;
										local899 = arg11 - local24;
										local586 = local6.anIntArray61[local899];
										if (local420 < local586 || local420 > local586 + local6.anIntArray68[local899]) {
											continue;
										}
										local420 -= local6.anInt1384 / 2;
										local899 -= local6.anInt1394 / 2;
										if (Static79.anInt1216 == 4) {
											local941 = (int) Static429.aFloat132 & 0x3FFF;
										} else {
											local941 = (int) Static429.aFloat132 + Static609.anInt10107 & 0x3FFF;
										}
										@Pc(953) int local953 = Class5_Sub12.anIntArray544[local941];
										@Pc(957) int local957 = Class5_Sub12.anIntArray543[local941];
										if (Static79.anInt1216 != 4) {
											local953 = local953 * (Static438.anInt7509 + 256) >> 8;
											local957 = local957 * (Static438.anInt7509 + 256) >> 8;
										}
										@Pc(986) int local986 = local899 * local953 + local420 * local957 >> 14;
										@Pc(996) int local996 = local899 * local957 - local420 * local953 >> 14;
										@Pc(1007) int local1007;
										@Pc(1015) int local1015;
										if (Static79.anInt1216 == 4) {
											local1007 = (Static497.anInt10511 >> 9) + (local986 >> 2);
											local1015 = (Static291.anInt5066 >> 9) - (local996 >> 2);
										} else {
											@Pc(1024) int local1024 = (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.method5993() - 1) * 256;
											local1007 = (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355 - local1024 >> 9) + (local986 >> 2);
											local1015 = (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363 - local1024 >> 9) - (local996 >> 2);
										}
										if (Static199.aBoolean706 && (Static382.anInt9821 & 0x40) != 0) {
											@Pc(1059) Class73 local1059 = Static506.method9206(Static7.anInt85, Static400.anInt6886);
											if (local1059 == null) {
												Static179.method2592();
											} else {
												Static152.method2122(local1007, (long) (local6.anInt1364 << 0 | local6.anInt1388), false, 1L, Static211.aString54, local1015, true, " ->", Static586.anInt9800, 11, true, local6.anInt1419);
											}
											continue;
										}
										if (Static256.aClass333_3 == Static521.aClass333_6) {
											Static152.method2122(local1007, 0L, false, 1L, Static582.aClass335_28.method8349(Static323.anInt5795), local1015, true, "", -1, 6, true, -1);
										}
										Static152.method2122(local1007, 0L, false, 1L, Static416.aString133, local1015, true, "", Static195.anInt3175, 12, true, -1);
										continue;
									}
									if (local6.anInt1367 == Static279.anInt4836) {
										Static93.aClass73_21 = local6;
										if (local286) {
											Static458.aBoolean593 = true;
										}
										if (local359) {
											local420 = (int) ((double) (local42 + local364.method5803() - local19 - local6.anInt1384 / 2) * 2.0D / (double) Static629.aFloat203);
											local899 = (int) -((double) (local47 + local364.method5804() - local24 - local6.anInt1394 / 2) * 2.0D / (double) Static629.aFloat203);
											local586 = Static622.anInt10186 + local420 + Static629.anInt9765;
											local941 = Static448.anInt7716 + local899 + Static629.anInt9763;
											@Pc(1199) Class5_Sub5_Sub12 local1199 = Static397.method5809();
											if (local1199 == null) {
												continue;
											}
											@Pc(1204) int[] local1204 = new int[3];
											local1199.method3740(local586, local941, local1204);
											if (local1204 != null) {
												if (Static258.aClass89_1.method1617(82) && Static539.anInt9221 > 0) {
													Static374.method5468(local1204[0], local1204[2], local1204[1]);
													continue;
												}
												Static591.aBoolean753 = true;
												Static105.anInt1715 = local1204[0];
												Static360.anInt6281 = local1204[1];
												Static432.anInt7423 = local1204[2];
											}
											Static288.anInt5464 = 1;
											Static618.aBoolean759 = false;
											Static665.anInt10653 = Static205.aClass107_1.method4079();
											Static59.anInt893 = Static205.aClass107_1.method4072();
											continue;
										}
										if (local347 && Static288.anInt5464 > 0) {
											if (Static288.anInt5464 == 1 && (Static665.anInt10653 != Static205.aClass107_1.method4079() || Static59.anInt893 != Static205.aClass107_1.method4072())) {
												Static520.anInt8810 = Static622.anInt10186;
												Static215.anInt3509 = Static448.anInt7716;
												Static288.anInt5464 = 2;
											}
											if (Static288.anInt5464 == 2) {
												Static618.aBoolean759 = true;
												Static405.method5937(Static520.anInt8810 + (int) ((double) (Static665.anInt10653 - Static205.aClass107_1.method4079()) * 2.0D / (double) Static629.aFloat202));
												Static628.method8778(Static215.anInt3509 - (int) ((double) (Static59.anInt893 - Static205.aClass107_1.method4072()) * 2.0D / (double) Static629.aFloat202));
											}
											continue;
										}
										if (Static288.anInt5464 > 0 && !Static618.aBoolean759) {
											if ((Static654.anInt10547 == 1 || Static561.method8125()) && Static481.anInt8130 > 2) {
												Static196.method2829(Static665.anInt10653, Static59.anInt893);
											} else if (Static679.method9323()) {
												Static196.method2829(Static665.anInt10653, Static59.anInt893);
											}
										}
										Static288.anInt5464 = 0;
										continue;
									}
									if (local6.anInt1367 == Static100.anInt1605) {
										if (local347) {
											Static265.method3882(local6.anInt1394, local42 + Static205.aClass107_1.method4079() - local19, local47 + Static205.aClass107_1.method4072() - local24, local6.anInt1384);
										}
										continue;
									}
									if (local6.anInt1367 == Static284.anInt4917) {
										Static530.method7641(local24, local19, local6);
										continue;
									}
								}
								if (!local6.aBoolean129 && local359) {
									local6.aBoolean129 = true;
									if (local6.anObjectArray7 != null) {
										local700 = new Class5_Sub3();
										local700.aBoolean34 = true;
										local700.aClass73_1 = local6;
										local700.anInt321 = local42 + local364.method5803() - local19;
										local700.anInt323 = local47 + local364.method5804() - local24;
										local700.anObjectArray1 = local6.anObjectArray7;
										Static118.aClass102_3.method1921(local700);
									}
								}
								if (local6.aBoolean129 && local347 && local6.anObjectArray12 != null) {
									local700 = new Class5_Sub3();
									local700.aBoolean34 = true;
									local700.aClass73_1 = local6;
									local700.anInt321 = local42 + Static205.aClass107_1.method4079() - local19;
									local700.anInt323 = local47 + Static205.aClass107_1.method4072() - local24;
									local700.anObjectArray1 = local6.anObjectArray12;
									Static118.aClass102_3.method1921(local700);
								}
								if (local6.aBoolean129 && !local347) {
									local6.aBoolean129 = false;
									if (local6.anObjectArray3 != null) {
										local700 = new Class5_Sub3();
										local700.aBoolean34 = true;
										local700.aClass73_1 = local6;
										local700.anInt321 = local42 + Static205.aClass107_1.method4079() - local19;
										local700.anInt323 = local47 + Static205.aClass107_1.method4072() - local24;
										local700.anObjectArray1 = local6.anObjectArray3;
										Static457.aClass102_50.method1921(local700);
									}
								}
								if (local347 && local6.anObjectArray27 != null) {
									local700 = new Class5_Sub3();
									local700.aBoolean34 = true;
									local700.aClass73_1 = local6;
									local700.anInt321 = local42 + Static205.aClass107_1.method4079() - local19;
									local700.anInt323 = local47 + Static205.aClass107_1.method4072() - local24;
									local700.anObjectArray1 = local6.anObjectArray27;
									Static118.aClass102_3.method1921(local700);
								}
								if (!local6.aBoolean138 && local286) {
									local6.aBoolean138 = true;
									if (local6.anObjectArray25 != null) {
										local700 = new Class5_Sub3();
										local700.aBoolean34 = true;
										local700.aClass73_1 = local6;
										local700.anInt321 = local42 + Static205.aClass107_1.method4079() - local19;
										local700.anInt323 = local47 + Static205.aClass107_1.method4072() - local24;
										local700.anObjectArray1 = local6.anObjectArray25;
										Static118.aClass102_3.method1921(local700);
									}
								}
								if (local6.aBoolean138 && local286 && local6.anObjectArray9 != null) {
									local700 = new Class5_Sub3();
									local700.aBoolean34 = true;
									local700.aClass73_1 = local6;
									local700.anInt321 = local42 + Static205.aClass107_1.method4079() - local19;
									local700.anInt323 = local47 + Static205.aClass107_1.method4072() - local24;
									local700.anObjectArray1 = local6.anObjectArray9;
									Static118.aClass102_3.method1921(local700);
								}
								if (local6.aBoolean138 && !local286) {
									local6.aBoolean138 = false;
									if (local6.anObjectArray6 != null) {
										local700 = new Class5_Sub3();
										local700.aBoolean34 = true;
										local700.aClass73_1 = local6;
										local700.anInt321 = local42 + Static205.aClass107_1.method4079() - local19;
										local700.anInt323 = local47 + Static205.aClass107_1.method4072() - local24;
										local700.anObjectArray1 = local6.anObjectArray6;
										Static457.aClass102_50.method1921(local700);
									}
								}
								if (local6.anObjectArray23 != null) {
									local700 = new Class5_Sub3();
									local700.aClass73_1 = local6;
									local700.anObjectArray1 = local6.anObjectArray23;
									Static626.aClass102_74.method1921(local700);
								}
								@Pc(1838) Class5_Sub3 local1838;
								if (local6.anObjectArray32 != null && Static338.anInt6023 > local6.anInt1331) {
									if (local6.anIntArray69 == null || Static338.anInt6023 - local6.anInt1331 > 32) {
										local700 = new Class5_Sub3();
										local700.aClass73_1 = local6;
										local700.anObjectArray1 = local6.anObjectArray32;
										Static118.aClass102_3.method1921(local700);
									} else {
										label699: for (local420 = local6.anInt1331; local420 < Static338.anInt6023; local420++) {
											local899 = Static83.anIntArray64[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray69.length; local586++) {
												if (local6.anIntArray69[local586] == local899) {
													local1838 = new Class5_Sub3();
													local1838.aClass73_1 = local6;
													local1838.anObjectArray1 = local6.anObjectArray32;
													Static118.aClass102_3.method1921(local1838);
													break label699;
												}
											}
										}
									}
									local6.anInt1331 = Static338.anInt6023;
								}
								if (local6.anObjectArray8 != null && Static598.anInt10029 > local6.anInt1341) {
									if (local6.anIntArray72 == null || Static598.anInt10029 - local6.anInt1341 > 32) {
										local700 = new Class5_Sub3();
										local700.aClass73_1 = local6;
										local700.anObjectArray1 = local6.anObjectArray8;
										Static118.aClass102_3.method1921(local700);
									} else {
										label675: for (local420 = local6.anInt1341; local420 < Static598.anInt10029; local420++) {
											local899 = Static80.anIntArray59[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray72.length; local586++) {
												if (local6.anIntArray72[local586] == local899) {
													local1838 = new Class5_Sub3();
													local1838.aClass73_1 = local6;
													local1838.anObjectArray1 = local6.anObjectArray8;
													Static118.aClass102_3.method1921(local1838);
													break label675;
												}
											}
										}
									}
									local6.anInt1341 = Static598.anInt10029;
								}
								if (local6.anObjectArray14 != null && Static649.anInt5975 > local6.anInt1355) {
									if (local6.anIntArray71 == null || Static649.anInt5975 - local6.anInt1355 > 32) {
										local700 = new Class5_Sub3();
										local700.aClass73_1 = local6;
										local700.anObjectArray1 = local6.anObjectArray14;
										Static118.aClass102_3.method1921(local700);
									} else {
										label651: for (local420 = local6.anInt1355; local420 < Static649.anInt5975; local420++) {
											local899 = Static455.anIntArray468[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray71.length; local586++) {
												if (local6.anIntArray71[local586] == local899) {
													local1838 = new Class5_Sub3();
													local1838.aClass73_1 = local6;
													local1838.anObjectArray1 = local6.anObjectArray14;
													Static118.aClass102_3.method1921(local1838);
													break label651;
												}
											}
										}
									}
									local6.anInt1355 = Static649.anInt5975;
								}
								if (local6.anObjectArray4 != null && Static469.anInt7969 > local6.anInt1350) {
									if (local6.anIntArray65 == null || Static469.anInt7969 - local6.anInt1350 > 32) {
										local700 = new Class5_Sub3();
										local700.aClass73_1 = local6;
										local700.anObjectArray1 = local6.anObjectArray4;
										Static118.aClass102_3.method1921(local700);
									} else {
										label627: for (local420 = local6.anInt1350; local420 < Static469.anInt7969; local420++) {
											local899 = Static377.anIntArray373[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray65.length; local586++) {
												if (local6.anIntArray65[local586] == local899) {
													local1838 = new Class5_Sub3();
													local1838.aClass73_1 = local6;
													local1838.anObjectArray1 = local6.anObjectArray4;
													Static118.aClass102_3.method1921(local1838);
													break label627;
												}
											}
										}
									}
									local6.anInt1350 = Static469.anInt7969;
								}
								if (local6.anObjectArray21 != null && Static242.anInt4080 > local6.anInt1406) {
									if (local6.anIntArray62 == null || Static242.anInt4080 - local6.anInt1406 > 32) {
										local700 = new Class5_Sub3();
										local700.aClass73_1 = local6;
										local700.anObjectArray1 = local6.anObjectArray21;
										Static118.aClass102_3.method1921(local700);
									} else {
										label603: for (local420 = local6.anInt1406; local420 < Static242.anInt4080; local420++) {
											local899 = Static351.anIntArray338[local420 & 0x1F];
											for (local586 = 0; local586 < local6.anIntArray62.length; local586++) {
												if (local6.anIntArray62[local586] == local899) {
													local1838 = new Class5_Sub3();
													local1838.aClass73_1 = local6;
													local1838.anObjectArray1 = local6.anObjectArray21;
													Static118.aClass102_3.method1921(local1838);
													break label603;
												}
											}
										}
									}
									local6.anInt1406 = Static242.anInt4080;
								}
								if (Static473.anInt8017 > local6.anInt1418 && local6.anObjectArray10 != null) {
									local700 = new Class5_Sub3();
									local700.aClass73_1 = local6;
									local700.anObjectArray1 = local6.anObjectArray10;
									Static118.aClass102_3.method1921(local700);
								}
								if (Static148.anInt2385 > local6.anInt1418 && local6.anObjectArray28 != null) {
									local700 = new Class5_Sub3();
									local700.aClass73_1 = local6;
									local700.anObjectArray1 = local6.anObjectArray28;
									Static118.aClass102_3.method1921(local700);
								}
								if (Static459.anInt7835 > local6.anInt1418 && local6.anObjectArray17 != null) {
									local700 = new Class5_Sub3();
									local700.aClass73_1 = local6;
									local700.anObjectArray1 = local6.anObjectArray17;
									Static118.aClass102_3.method1921(local700);
								}
								if (Static642.anInt10431 > local6.anInt1418 && local6.anObjectArray15 != null) {
									local700 = new Class5_Sub3();
									local700.aClass73_1 = local6;
									local700.anObjectArray1 = local6.anObjectArray15;
									Static118.aClass102_3.method1921(local700);
								}
								if (Static438.anInt7510 > local6.anInt1418 && local6.anObjectArray22 != null) {
									local700 = new Class5_Sub3();
									local700.aClass73_1 = local6;
									local700.anObjectArray1 = local6.anObjectArray22;
									Static118.aClass102_3.method1921(local700);
								}
								if (Static463.anInt7898 > local6.anInt1418 && local6.anObjectArray20 != null) {
									local700 = new Class5_Sub3();
									local700.aClass73_1 = local6;
									local700.anObjectArray1 = local6.anObjectArray20;
									Static118.aClass102_3.method1921(local700);
								}
								if (Static45.anInt10277 > local6.anInt1418 && local6.anObjectArray29 != null) {
									local700 = new Class5_Sub3();
									local700.aClass73_1 = local6;
									local700.anObjectArray1 = local6.anObjectArray29;
									Static118.aClass102_3.method1921(local700);
								}
								local6.anInt1418 = Static261.anInt4525;
								if (local6.anObjectArray2 != null) {
									for (local420 = 0; local420 < Static643.anInt10457; local420++) {
										@Pc(2408) Class5_Sub3 local2408 = new Class5_Sub3();
										local2408.aClass73_1 = local6;
										local2408.anInt329 = Static538.anInterface12Array2[local420].method6718();
										local2408.anInt327 = Static538.anInterface12Array2[local420].method6714();
										local2408.anObjectArray1 = local6.anObjectArray2;
										Static118.aClass102_3.method1921(local2408);
									}
								}
								if (Static601.aBoolean756 && local6.anObjectArray13 != null) {
									local700 = new Class5_Sub3();
									local700.aClass73_1 = local6;
									local700.anObjectArray1 = local6.anObjectArray13;
									Static118.aClass102_3.method1921(local700);
								}
							}
							if (local6.anInt1391 == 5 && local6.anInt1413 != -1) {
								local6.method1272(Static112.aClass321_1, Static162.aClass181_1).method7509(local6.anInt1394, Static457.aClass57_11);
							}
							Static140.method1964(local6);
							if (local6.anInt1391 == 0) {
								method1257(arg0, local6.anInt1388, local30, local32, local34, local36, local19 - local6.anInt1376, local24 - local6.anInt1340, arg8, arg9, arg10, arg11);
								if (local6.aClass73Array1 != null) {
									method1257(local6.aClass73Array1, local6.anInt1388, local30, local32, local34, local36, local19 - local6.anInt1376, local24 - local6.anInt1340, arg8, arg9, arg10, arg11);
								}
								@Pc(2546) Class5_Sub49 local2546 = (Class5_Sub49) Static549.aClass291_37.method6993((long) local6.anInt1388, 1);
								if (local2546 != null) {
									if (Static256.aClass333_3 == Static569.aClass333_7 && local2546.anInt9318 == 0 && !Static526.aBoolean669 && local286 && !Static206.aBoolean269) {
										Static397.method5811();
									}
									Static583.method8400(local32, local36, local19, arg9, local34, arg8, arg11, local2546.anInt9322, local30, arg10, local24);
								}
							}
						}
					}
				} else if (local30 < local34 && local32 < local36) {
					Static140.method1964(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public static void method1260(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static558.method8061(local6.height, local6.width);
		if (Static659.anInt10597 == 1) {
			Static617.aClass57_14.method7699(arg0, Static227.anInt3689, Static370.anInt10370);
		} else {
			Static617.aClass57_14.method7699(arg0, Static539.anInt9220, Static116.anInt3315);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!cn;)Z")
	public static boolean method1261(@OriginalArg(0) Class73 arg0) {
		if (Static206.aBoolean269) {
			if (method1252(arg0).anInt8267 != 0) {
				return false;
			}
			if (arg0.anInt1391 == 0) {
				return false;
			}
		}
		return arg0.aBoolean130;
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method1262(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static116.anInt3318;
		@Pc(3) int[] local3 = Static88.anIntArray464;
		@Pc(12) int local12 = Static243.aBoolean324 ? local1 : local1 + Static247.anInt4256;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(24) Class8_Sub1_Sub3_Sub2 local24;
			if (local14 < local1) {
				local24 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local3[local14]];
			} else {
				local24 = ((Class5_Sub35) Static623.aClass291_43.method6993((long) Static671.anIntArray620[local14 - local1], 1)).aClass8_Sub1_Sub3_Sub2_Sub2_2;
			}
			if (local24.aByte145 == arg0) {
				local24.anInt7011 = 0;
				if (local24.anInt7018 < 0) {
					local24.aBoolean540 = false;
				} else {
					@Pc(58) int local58 = local24.method5993();
					if ((local58 & 0x1) == 0) {
						if ((local24.anInt10355 & 0x1FF) != 0 || (local24.anInt10363 & 0x1FF) != 0) {
							local24.aBoolean540 = false;
							continue;
						}
					} else if ((local24.anInt10355 & 0x1FF) != 256 || (local24.anInt10363 & 0x1FF) != 256) {
						local24.aBoolean540 = false;
						continue;
					}
					@Pc(108) int local108;
					@Pc(113) int local113;
					@Pc(139) int local139;
					if (local58 == 1) {
						local108 = local24.anInt10355 >> 9;
						local113 = local24.anInt10363 >> 9;
						if (local24.anInt7018 != Static300.anIntArrayArray34[local108][local113]) {
							local24.aBoolean540 = true;
							continue;
						}
						if (Static555.anIntArrayArray50[local108][local113] > 1) {
							local139 = Static555.anIntArrayArray50[local108][local113]--;
							local24.aBoolean540 = true;
							continue;
						}
					} else {
						local108 = (local58 - 1) * 256 + 252;
						local113 = local24.anInt10355 - local108 >> 9;
						@Pc(169) int local169 = local24.anInt10363 - local108 >> 9;
						@Pc(176) int local176 = local24.anInt10355 + local108 >> 9;
						@Pc(183) int local183 = local24.anInt10363 + local108 >> 9;
						if (!Static273.method4049(local24.anInt7018, local183, local176, local169, local113)) {
							for (@Pc(194) int local194 = local113; local194 <= local176; local194++) {
								for (@Pc(197) int local197 = local169; local197 <= local183; local197++) {
									if (local24.anInt7018 == Static300.anIntArrayArray34[local194][local197]) {
										local139 = Static555.anIntArrayArray50[local194][local197]--;
									}
								}
							}
							local24.aBoolean540 = true;
							continue;
						}
					}
					local24.aBoolean540 = false;
					local24.anInt10357 = Static380.method5559(local24.anInt10355, local24.aByte145, local24.anInt10363, 0);
					Static270.method4024(local24, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method1263(@OriginalArg(1) String arg0) {
		return Static311.method4728(arg0);
	}
}
