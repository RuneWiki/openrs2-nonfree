import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!th", name = "h", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_106 = new Class93("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	public static int anInt6082 = 127;

	@OriginalMember(owner = "client!th", name = "s", descriptor = "Lclient!gn;")
	public static final Class2_Sub19 aClass2_Sub19_1 = new Class2_Sub19(0, 0);

	@OriginalMember(owner = "client!th", name = "u", descriptor = "I")
	public static int anInt6089 = -1;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "[Lclient!bj;")
	public static Class20_Sub1[] aClass20_Sub1Array3 = new Class20_Sub1[0];

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZIZZ)V")
	public static void method5312(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		Static79.method1816(0, arg3, aClass20_Sub1Array3.length - 1, arg1, arg2, arg0);
		Static235.aClass2_Sub32_1 = null;
		Static271.anInt5505 = 0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)I")
	public static int method5319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 & 0x3;
		if (local15 == 0) {
			return arg0;
		} else if (local15 == 1) {
			return arg2;
		} else if (local15 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!fj;B)V")
	public static void method5320(@OriginalArg(0) Class62_Sub1_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt5343 == Static212.anInt4090 || arg0.anInt5322 == -1 || arg0.anInt5345 != 0) {
			local5 = true;
		} else {
			@Pc(33) Class107 local33 = Static212.method3773(arg0.anInt5322);
			if (local33.aBoolean293 || local33.anIntArray279[arg0.anInt5305] < arg0.anInt5341 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(61) int local61 = arg0.anInt5343 - arg0.anInt5296;
			@Pc(67) int local67 = Static212.anInt4090 - arg0.anInt5296;
			@Pc(79) int local79 = arg0.anInt5351 * 128 + arg0.method4777() * 64;
			@Pc(91) int local91 = arg0.anInt5338 * 128 + arg0.method4777() * 64;
			@Pc(102) int local102 = arg0.anInt5320 * 128 + arg0.method4777() * 64;
			@Pc(113) int local113 = arg0.anInt5339 * 128 + arg0.method4777() * 64;
			arg0.anInt5289 = (local102 * local67 + local79 * (local61 - local67)) / local61;
			arg0.anInt5280 = (local113 * local67 + (local61 - local67) * local91) / local61;
		}
		arg0.anInt5366 = 0;
		if (arg0.anInt5298 == 0) {
			arg0.method4783(8192);
		}
		if (arg0.anInt5298 == 1) {
			arg0.method4783(12288);
		}
		if (arg0.anInt5298 == 2) {
			arg0.method4783(0);
		}
		if (arg0.anInt5298 == 3) {
			arg0.method4783(4096);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIB[Lclient!on;IIIIII)V")
	public static void method5321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class146[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static147.aClass4_2.method4252(arg7, arg5, arg4, arg8);
		for (@Pc(13) int local13 = 0; local13 < arg2.length; local13++) {
			@Pc(19) Class146 local19 = arg2[local13];
			if (local19 != null && (arg0 == local19.anInt4458 || arg0 == -1412584499 && Static285.aClass146_14 == local19)) {
				@Pc(38) int local38;
				if (arg3 == -1) {
					Class20_Sub1.aRectangleArray1[Static53.anInt1131].setBounds(local19.anInt4442 + arg1, arg6 + local19.anInt4460, local19.anInt4468, local19.anInt4414);
					local38 = Static53.anInt1131++;
				} else {
					local38 = arg3;
				}
				local19.anInt4443 = Static212.anInt4090;
				local19.anInt4428 = local38;
				if (!Static43.method1054(local19)) {
					if (local19.anInt4440 > 0) {
						Static212.method3774(local19);
					}
					@Pc(82) int local82 = local19.anInt4442 + arg1;
					@Pc(87) int local87 = local19.anInt4460 + arg6;
					@Pc(90) int local90 = local19.anInt4491;
					if (Static300.aBoolean520 && (Static43.method1056(local19).anInt478 != 0 || local19.anInt4419 == 0) && local90 > 127) {
						local90 = 127;
					}
					@Pc(131) int local131;
					@Pc(137) int local137;
					if (Static285.aClass146_14 == local19) {
						if (arg0 != -1412584499 && !local19.lb) {
							Static218.anInt4223 = arg1;
							Static339.anInt6733 = arg6;
							Static71.aClass146Array1 = arg2;
							continue;
						}
						if (Static173.aBoolean315 && Static305.aBoolean549) {
							local131 = Static284.aClass61_1.method2658();
							local137 = Static284.aClass61_1.method2659();
							local137 -= Static39.anInt780;
							local131 -= Static52.anInt1118;
							if (local131 < Static139.anInt2886) {
								local131 = Static139.anInt2886;
							}
							if (Static50.anInt1115 > local137) {
								local137 = Static50.anInt1115;
							}
							if (local19.anInt4468 + local131 > Static163.aClass146_5.anInt4468 + Static139.anInt2886) {
								local131 = Static139.anInt2886 + Static163.aClass146_5.anInt4468 - local19.anInt4468;
							}
							local82 = local131;
							if (Static50.anInt1115 + Static163.aClass146_5.anInt4414 < local19.anInt4414 + local137) {
								local137 = Static50.anInt1115 + Static163.aClass146_5.anInt4414 - local19.anInt4414;
							}
							local87 = local137;
						}
						if (!local19.lb) {
							local90 = 128;
						}
					}
					@Pc(264) int local264;
					@Pc(253) int local253;
					@Pc(216) int local216;
					@Pc(222) int local222;
					if (local19.anInt4419 == 2) {
						local264 = arg4;
						local137 = arg5;
						local253 = arg8;
						local131 = arg7;
					} else {
						local216 = local19.anInt4468 + local82;
						local222 = local87 + local19.anInt4414;
						if (local19.anInt4419 == 9) {
							local222++;
							local216++;
						}
						local137 = arg5 < local87 ? local87 : arg5;
						local131 = local82 > arg7 ? local82 : arg7;
						local253 = arg8 <= local222 ? arg8 : local222;
						local264 = arg4 > local216 ? local216 : arg4;
					}
					if (local264 > local131 && local253 > local137) {
						@Pc(515) int local515;
						@Pc(539) int local539;
						@Pc(541) int local541;
						@Pc(486) int local486;
						@Pc(488) int local488;
						if (local19.anInt4440 != 0) {
							if (local19.anInt4440 == 1337 || local19.anInt4440 == 1403) {
								Static70.method1582(local19.anInt4440 == 1403, local19.anInt4414, local19.anInt4468, local87, local82);
								Static200.aBooleanArray29[local38] = true;
								Static147.aClass4_2.method4252(arg7, arg5, arg4, arg8);
								continue;
							}
							if (local19.anInt4440 == 1338) {
								if (local19.method4042(Static147.aClass4_2) != null) {
									Static166.method3083();
									Static227.method3974(local82, local87, Static147.aClass4_2, local19);
									Static135.aBooleanArray12[local38] = true;
									Static147.aClass4_2.method4252(arg7, arg5, arg4, arg8);
								}
								continue;
							}
							if (local19.anInt4440 == 1339) {
								if (local19.method4042(Static147.aClass4_2) != null) {
									Static264.method4796(local87, local19, local82);
									Static135.aBooleanArray12[local38] = true;
									Static147.aClass4_2.method4252(arg7, arg5, arg4, arg8);
								}
								continue;
							}
							if (local19.anInt4440 == 1400) {
								Static328.method5758(local87, local82, local19.anInt4414, Static274.anInterface7_5, Static147.aClass4_2, local19.anInt4468);
								Static200.aBooleanArray29[local38] = true;
								Static147.aClass4_2.method4252(arg7, arg5, arg4, arg8);
								continue;
							}
							if (local19.anInt4440 == 1401) {
								Static164.method3046(local19.anInt4468, Static147.aClass4_2, local82, local19.anInt4414, local87);
								Static200.aBooleanArray29[local38] = true;
								Static147.aClass4_2.method4252(arg7, arg5, arg4, arg8);
								continue;
							}
							if (local19.anInt4440 == 1405) {
								if (!Static147.aBoolean25 && !Static166.aBoolean299) {
									continue;
								}
								local216 = local19.anInt4468 + local82;
								local222 = local87 + 15;
								if (Static147.aBoolean25) {
									Static193.aClass37_2.method5259("Fps:" + Static265.anInt6827, -256, local222, local216);
									local222 += 15;
									@Pc(476) Runtime local476 = Runtime.getRuntime();
									local486 = (int) ((local476.totalMemory() - local476.freeMemory()) / 1024L);
									local488 = -256;
									if (local486 > 65536) {
										local488 = -65536;
									}
									Static193.aClass37_2.method5259("Mem:" + local486 + "k", local488, local222, local216);
									local222 += 15;
									local515 = Static147.aClass4_2.method4253() / 1024;
									Static193.aClass37_2.method5259("Offheap:" + local515 + "k", local515 > 65536 ? -65536 : -256, local222, local216);
									local222 += 15;
									local539 = 0;
									local541 = 0;
									@Pc(543) int local543 = 0;
									for (@Pc(545) int local545 = 0; local545 < 29; local545++) {
										local539 += Static213.aClass121_Sub1Array1[local545].method4876();
										local541 += Static213.aClass121_Sub1Array1[local545].method4866();
										local543 += Static213.aClass121_Sub1Array1[local545].method4863();
									}
									@Pc(583) int local583 = local543 * 100 / local539;
									@Pc(589) int local589 = local541 * 10000 / local539;
									@Pc(609) String local609 = "Cache:" + Static202.method3643(0, 2, true, (long) local589) + "% (" + local583 + "%)";
									Static299.aClass37_5.method5259(local609, -256, local222, local216);
									local222 += 12;
								}
								if (Static136.anInt2825 > 0) {
									Static299.aClass37_5.method5259("Particles: " + Static182.anInt3604 + " / " + Static136.anInt2825, -256, local222, local216);
								}
								local222 += 12;
								if (Static166.aBoolean299) {
									Static299.aClass37_5.method5259("Polys: " + Static147.aClass4_2.method4265() + " Models: " + Static147.aClass4_2.method4239(), -256, local222, local216);
									local222 += 12;
									Static299.aClass37_5.method5259("Ls: " + Static187.anInt3715 + " La: " + Static203.anInt3384 + " NPC: " + Static273.anInt5577 + " Pl: " + Static93.anInt2121, -256, local222, local216);
									local222 += 12;
									Static357.method6006();
								}
								Static200.aBooleanArray29[local38] = true;
								continue;
							}
						}
						if (local19.anInt4419 == 0) {
							if (local19.anInt4440 == 1407 && Static147.aClass4_2.method4240()) {
								Static147.aClass4_2.method4222(local82, local87, local19.anInt4468, local19.anInt4414);
							}
							method5321(local19.anInt4450, local82 - local19.anInt4487, arg2, local38, local264, local137, local87 - local19.anInt4483, local131, local253);
							if (local19.aClass146Array2 != null) {
								method5321(local19.anInt4450, local82 - local19.anInt4487, local19.aClass146Array2, local38, local264, local137, local87 - local19.anInt4483, local131, local253);
							}
							@Pc(771) Class2_Sub8 local771 = (Class2_Sub8) Static273.aClass199_25.method5751((long) local19.anInt4450);
							if (local771 != null) {
								Static339.method5843(local38, local253, local264, local87, local771.anInt694, local137, local82, local131);
							}
							if (local19.anInt4440 == 1407 && Static147.aClass4_2.method4240()) {
								Static147.aClass4_2.method4264();
								Static218.aBoolean373 = true;
							}
							Static147.aClass4_2.method4252(arg7, arg5, arg4, arg8);
						}
						if (Static19.aBooleanArray3[local38] || Static280.anInt5692 > 1) {
							if (local19.anInt4419 == 3) {
								if (local90 == 0) {
									if (local19.aBoolean396) {
										Static147.aClass4_2.method4246(local82, local87, local19.anInt4468, local19.anInt4414, local19.anInt4431, 0);
									} else {
										Static147.aClass4_2.method4287(local82, local87, local19.anInt4468, local19.anInt4414, local19.anInt4431, 0);
									}
								} else if (local19.aBoolean396) {
									Static147.aClass4_2.method4246(local82, local87, local19.anInt4468, local19.anInt4414, local19.anInt4431 & 0xFFFFFF | 255 - (local90 & 0xFF) << 24, 1);
								} else {
									Static147.aClass4_2.method4287(local82, local87, local19.anInt4468, local19.anInt4414, 255 - (local90 & 0xFF) << 24 | local19.anInt4431 & 0xFFFFFF, 1);
								}
							} else if (local19.anInt4419 == 4) {
								@Pc(902) Class37 local902 = local19.method4039(Static147.aClass4_2);
								if (local902 != null) {
									local222 = local19.anInt4431;
									@Pc(917) String local917 = local19.aString42;
									if (local19.anInt4478 != -1) {
										@Pc(927) Class208 local927 = Static282.method5080(local19.anInt4478);
										local917 = local927.aString63;
										if (local917 == null) {
											local917 = "null";
										}
										if ((local927.anInt6792 == 1 || local19.anInt4489 != 1) && local19.anInt4489 != -1) {
											local917 = "<col=ff9040>" + local917 + "</col> x" + Static293.method5193(local19.anInt4489);
										}
									}
									if (local19 == Static27.aClass146_16) {
										local917 = Static12.aClass93_7.method2819(Static21.anInt455);
										local222 = local19.anInt4431;
									}
									if (Static44.aBoolean94) {
										Static147.aClass4_2.method4210(local82, local87, local82 + local19.anInt4468, local19.anInt4414 + local87);
									}
									local902.method5251(local82, null, local19.anInt4414, 0, local87, local19.aBoolean410 ? -16777216 : -1, null, Static326.aClass31Array17, local19.anInt4465, 0, local222 | 0xFF000000, local19.anInt4468, local917, local19.anInt4485, local19.anInt4490);
									if (Static44.aBoolean94) {
										Static147.aClass4_2.method4252(arg7, arg5, arg4, arg8);
									}
								} else if (Static206.aBoolean353) {
									Static152.method2932(local19);
								}
							} else {
								@Pc(1086) int local1086;
								if (local19.anInt4419 == 5) {
									if (local19.anInt4444 < 0) {
										@Pc(1071) Class31 local1071;
										if (local19.anInt4478 == -1) {
											local1071 = local19.method4044(Static147.aClass4_2);
										} else {
											@Pc(1054) Class160 local1054 = local19.aBoolean403 ? Static41.aClass62_Sub1_Sub2_Sub2_2.aClass160_2 : null;
											local1071 = Static86.method1934(local19.anInt4480 | 0xFF000000, local19.anInt4489, local19.anInt4466, local19.anInt4478, local19.anInt4479, local1054, Static147.aClass4_2);
										}
										if (local1071 != null) {
											local222 = local1071.method4376();
											local1086 = local1071.method4378();
											if (local19.aBoolean399) {
												Static147.aClass4_2.method4210(local82, local87, local19.anInt4468 + local82, local19.anInt4414 + local87);
												if (local19.anInt4454 != 0) {
													local486 = (local19.anInt4468 + local222 - 1) / local222;
													local488 = (local1086 + local19.anInt4414 - 1) / local1086;
													for (local515 = 0; local515 < local486; local515++) {
														for (local539 = 0; local539 < local488; local539++) {
															local1071.method4384((float) (local82 + local222 * local515) + (float) local222 / 2.0F, (float) (local87 + local1086 * local539) + (float) local1086 / 2.0F, 4096, local19.anInt4454);
														}
													}
												} else if (local90 == 0) {
													local1071.method4382(local82, local87, local19.anInt4468, local19.anInt4414, 0, 0);
												} else {
													local1071.method4382(local82, local87, local19.anInt4468, local19.anInt4414, 1, 255 - (local90 & 0xFF) << 24 | 0xFFFFFF);
												}
												Static147.aClass4_2.method4252(arg7, arg5, arg4, arg8);
											} else if (local90 != 0) {
												local486 = 255 - (local90 & 0xFF) << 24 | 0xFFFFFF;
												if (local19.anInt4454 != 0) {
													local1071.method4383((float) local82 + (float) local19.anInt4468 / 2.0F, (float) local19.anInt4414 / 2.0F + (float) local87, local19.anInt4468 * 4096 / local222, local19.anInt4454, local486);
												} else if (local222 == local19.anInt4468 && local1086 == local19.anInt4414) {
													local1071.method4379(local82, local87, 1, local486);
												} else {
													local1071.method4391(local82, local87, local19.anInt4468, local19.anInt4414, 1, local486, 1);
												}
											} else if (local19.anInt4454 != 0) {
												local1071.method4384((float) local82 + (float) local19.anInt4468 / 2.0F, (float) local87 + (float) local19.anInt4414 / 2.0F, local19.anInt4468 * 4096 / local222, local19.anInt4454);
											} else if (local19.anInt4468 == local222 && local1086 == local19.anInt4414) {
												local1071.method4377(local82, local87);
											} else {
												local1071.method4390(local82, local87, local19.anInt4468, local19.anInt4414);
											}
										} else if (Static206.aBoolean353) {
											Static152.method2932(local19);
										}
									} else {
										local19.method4048().method695(local19.anInt4474 << 3, local19.anInt4420 << 3, local82, local19.anInt4414, local19.anInt4468, 0, 0, Static147.aClass4_2, local87);
									}
								} else if (local19.anInt4419 == 6) {
									Static355.method5984();
									@Pc(1408) Class7 local1408 = null;
									local222 = 0;
									@Pc(1438) Class107 local1438;
									@Pc(1446) Class160 local1446;
									if (local19.anInt4478 != -1) {
										@Pc(1419) Class208 local1419 = Static282.method5080(local19.anInt4478);
										if (local1419 != null) {
											local1419 = local1419.method5863(local19.anInt4489);
											local1438 = local19.anInt4429 == -1 ? null : Static212.method3773(local19.anInt4429);
											local1446 = local19.aBoolean403 ? Static41.aClass62_Sub1_Sub2_Sub2_2.aClass160_2 : null;
											local1408 = local1419.method5867(local1446, local19.anInt4427, 1, local19.anInt4433, 1024, local1438, local19.anInt4441, Static147.aClass4_2);
											if (local1408 == null) {
												Static152.method2932(local19);
											} else {
												local222 = -local1408.method1430() / 2;
											}
										}
									} else if (local19.anInt4426 == 5) {
										if (local19.anInt4415 == -1) {
											local1408 = Static43.aClass160_1.method4568(null, Static147.aClass4_2, 0, null, null, -1, -1, 0, 1024, -1, -1);
										} else {
											local1086 = local19.anInt4415;
											@Pc(1626) Class62_Sub1_Sub2_Sub2 local1626;
											if (Static40.anInt797 == local1086) {
												local1626 = Static41.aClass62_Sub1_Sub2_Sub2_2;
											} else {
												local1626 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local1086];
											}
											@Pc(1643) Class107 local1643 = local19.anInt4429 == -1 ? null : Static212.method3773(local19.anInt4429);
											if (local1626 != null && (local1086 == 2047 || Static60.method1379(local1626.aString48) == local19.anInt4439)) {
												local1408 = local1626.aClass160_2.method4568(null, Static147.aClass4_2, local19.anInt4433, null, local1643, local19.anInt4427, 0, 0, 1024, -1, local19.anInt4441);
											}
										}
									} else if (local19.anInt4426 == 8 || local19.anInt4426 == 9) {
										@Pc(1548) Class2_Sub26 local1548 = Static42.method991(false, local19.anInt4415);
										local1438 = local19.anInt4429 == -1 ? null : Static212.method3773(local19.anInt4429);
										if (local1548 != null) {
											local1446 = local19.aBoolean403 ? Static41.aClass62_Sub1_Sub2_Sub2_2.aClass160_2 : null;
											local1408 = local1548.method2981(local1446, local19.anInt4441, local19.anInt4427, local1438, local19.anInt4426 == 9, local19.anInt4439, Static147.aClass4_2, local19.anInt4433);
										}
									} else if (local19.anInt4429 == -1) {
										local1408 = local19.method4041(0, -1, null, -1, 1024, Static147.aClass4_2, Static41.aClass62_Sub1_Sub2_Sub2_2.aClass160_2);
										if (local1408 == null && Static206.aBoolean353) {
											Static152.method2932(local19);
										}
									} else {
										@Pc(1499) Class107 local1499 = Static212.method3773(local19.anInt4429);
										local1408 = local19.method4041(local19.anInt4433, local19.anInt4427, local1499, local19.anInt4441, 1024, Static147.aClass4_2, Static41.aClass62_Sub1_Sub2_Sub2_2.aClass160_2);
										if (local1408 == null && Static206.aBoolean353) {
											Static152.method2932(local19);
										}
									}
									if (local1408 != null) {
										if (local19.anInt4418 <= 0) {
											local1086 = 512;
										} else {
											local1086 = (local19.anInt4468 << 9) / local19.anInt4418;
										}
										if (local19.anInt4472 > 0) {
											local486 = (local19.anInt4414 << 9) / local19.anInt4472;
										} else {
											local486 = 512;
										}
										local488 = local19.anInt4468 / 2 + local82 + (local1086 * local19.anInt4471 >> 9);
										local515 = (local19.anInt4473 * local486 >> 9) + local19.anInt4414 / 2 + local87;
										Static88.aClass133_4.method4337();
										Static147.aClass4_2.method4233(Static88.aClass133_4);
										local539 = local19.anInt4437 * Class24.anIntArray35[local19.anInt4424 << 3] >> 15;
										local541 = local19.anInt4437 * Class24.anIntArray36[local19.anInt4424 << 3] >> 15;
										Static147.aClass4_2.method4266(local488, local515, local1086, local486);
										Static147.aClass4_2.method4306((float) local19.aShort60, local19.aBoolean411 ? (float) local19.aShort59 : (float) local19.aShort59 * 1.5F);
										if (Static218.aBoolean373) {
											Static147.aClass4_2.method4299();
											Static147.aClass4_2.method4225();
											Static147.aClass4_2.method4252(arg7, arg5, arg4, arg8);
											Static218.aBoolean373 = false;
										}
										if (local19.aBoolean409) {
											Static147.aClass4_2.method4268(false);
										}
										Static75.aClass133_3.method4328(-local19.anInt4413 << 3);
										Static75.aClass133_3.method4327(local19.anInt4461 << 3);
										Static75.aClass133_3.method4333(local19.anInt4463, local222 + local539 + local19.anInt4452, local19.anInt4452 + local541);
										Static75.aClass133_3.method4338(local19.anInt4424 << 3);
										if (Static44.aBoolean94) {
											Static147.aClass4_2.method4210(local82, local87, local19.anInt4468 + local82, local19.anInt4414 + local87);
										}
										if (local19.aBoolean411) {
											local1408.method1437(Static75.aClass133_3, null, local19.anInt4437);
										} else {
											local1408.method1441(Static75.aClass133_3, null, 1);
										}
										if (Static44.aBoolean94) {
											Static147.aClass4_2.method4252(arg7, arg5, arg4, arg8);
										}
										if (local19.aBoolean409) {
											Static147.aClass4_2.method4268(true);
										}
									}
								} else if (local19.anInt4419 == 9) {
									if (local19.aBoolean401) {
										local222 = local87 + local19.anInt4414;
										local486 = local87;
										local1086 = local82 + local19.anInt4468;
									} else {
										local1086 = local82 + local19.anInt4468;
										local486 = local87 + local19.anInt4414;
										local222 = local87;
									}
									if (local19.anInt4448 == 1) {
										Static147.aClass4_2.method4259(local82, local222, local1086, local486, local19.anInt4431, 0);
									} else {
										Static147.aClass4_2.method4274(local82, local222, local1086, local486, local19.anInt4431, local19.anInt4448);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
	public static void method5322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub11_Sub19 local13 = Static306.method5411(12, arg1);
		local13.method5537();
		local13.anInt6362 = arg0;
	}
}
