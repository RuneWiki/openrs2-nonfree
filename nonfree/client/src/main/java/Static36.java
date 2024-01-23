import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "[I")
	public static int[] anIntArray54;

	@OriginalMember(owner = "client!client", name = "P", descriptor = "Lclient!g;")
	public static Class58 aClass58_1 = new Class58(64);

	@OriginalMember(owner = "client!client", name = "X", descriptor = "[I")
	public static int[] anIntArray53 = new int[256];

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	public static int anInt729 = -1;

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	public static void method638() {
		Static187.aClass169_106.method4018();
		Static33.aClass169_21.method4018();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
	public static void method639() {
		Static272.aClass169_144.method4014();
		Static296.aClass169_155.method4014();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method640() {
		for (@Pc(1) int local1 = 0; local1 < 104; local1++) {
			@Pc(8) int[] local8 = Static204.anIntArrayArray29[local1];
			for (@Pc(10) int local10 = 0; local10 < 104; local10++) {
				local8[local10] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!qf;IIIIIII)V")
	public static void method641(@OriginalArg(0) Class146[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class146 local9 = arg0[local1];
			if (local9 != null && local9.anInt4416 == arg1 && (!local9.aBoolean299 || local9.anInt4370 == 0 || local9.aBoolean313 || method643(local9).anInt4031 != 0 || local9 == Static87.aClass146_6 || local9.anInt4350 == 1338) && (!local9.aBoolean299 || !method654(local9))) {
				@Pc(50) int local50 = local9.anInt4340 + arg6;
				@Pc(55) int local55 = local9.anInt4385 + arg7;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(65) int local65;
				@Pc(67) int local67;
				if (local9.anInt4370 == 2) {
					local61 = arg2;
					local63 = arg3;
					local65 = arg4;
					local67 = arg5;
				} else {
					@Pc(73) int local73 = local50 + local9.anInt4345;
					@Pc(78) int local78 = local55 + local9.anInt4371;
					if (local9.anInt4370 == 9) {
						local73++;
						local78++;
					}
					local61 = local50 > arg2 ? local50 : arg2;
					local63 = local55 > arg3 ? local55 : arg3;
					local65 = local73 < arg4 ? local73 : arg4;
					local67 = local78 < arg5 ? local78 : arg5;
				}
				if (local9 == Static9.aClass146_11) {
					Static19.aBoolean25 = true;
					Static146.anInt2879 = local50;
					Static313.anInt5906 = local55;
				}
				if (!local9.aBoolean299 || local61 < local65 && local63 < local67) {
					if (local9.anInt4370 == 0) {
						if (!local9.aBoolean299 && method654(local9) && Static56.aClass146_4 != local9) {
							continue;
						}
						if (local9.aBoolean303 && Static152.anInt3132 >= local61 && Static300.anInt5678 >= local63 && Static152.anInt3132 < local65 && Static300.anInt5678 < local67) {
							for (@Pc(164) Class1_Sub29 local164 = (Class1_Sub29) Static250.aClass24_19.method460(); local164 != null; local164 = (Class1_Sub29) Static250.aClass24_19.method464()) {
								if (local164.aBoolean358) {
									local164.method4616();
									local164.aClass146_16.aBoolean311 = false;
								}
							}
							if (Static82.anInt1499 == 0) {
								Static9.aClass146_11 = null;
								Static87.aClass146_6 = null;
							}
							Static119.anInt5879 = 0;
							Static189.aBoolean263 = false;
						}
					}
					if (local9.aBoolean299) {
						@Pc(209) boolean local209;
						if (Static152.anInt3132 >= local61 && Static300.anInt5678 >= local63 && Static152.anInt3132 < local65 && Static300.anInt5678 < local67) {
							local209 = true;
						} else {
							local209 = false;
						}
						@Pc(214) boolean local214 = false;
						if (Static191.anInt3909 == 1 && local209) {
							local214 = true;
						}
						@Pc(223) boolean local223 = false;
						if (Static86.anInt1565 == 1 && Static84.anInt1530 >= local61 && Static46.anInt894 >= local63 && Static84.anInt1530 < local65 && Static46.anInt894 < local67) {
							local223 = true;
						}
						@Pc(245) int local245;
						@Pc(341) int local341;
						if (local9.aByteArray46 != null) {
							for (local245 = 0; local245 < local9.aByteArray46.length; local245++) {
								if (Static88.aBooleanArray16[local9.aByteArray46[local245]]) {
									if (local9.anIntArray355 == null || Static37.anInt757 >= local9.anIntArray355[local245]) {
										@Pc(281) byte local281 = local9.aByteArray47[local245];
										if (local281 == 0 || ((local281 & 0x8) == 0 || !Static88.aBooleanArray16[86] && !Static88.aBooleanArray16[82] && !Static88.aBooleanArray16[81]) && ((local281 & 0x2) == 0 || Static88.aBooleanArray16[86]) && ((local281 & 0x1) == 0 || Static88.aBooleanArray16[82]) && ((local281 & 0x4) == 0 || Static88.aBooleanArray16[81])) {
											Static230.method3626("", local9.anInt4355, local245 + 1, -1);
											local341 = local9.anIntArray368[local245];
											if (local9.anIntArray355 == null) {
												local9.anIntArray355 = new int[local9.aByteArray46.length];
											}
											if (local341 == 0) {
												local9.anIntArray355[local245] = Integer.MAX_VALUE;
											} else {
												local9.anIntArray355[local245] = Static37.anInt757 + local341;
											}
										}
									}
								} else if (local9.anIntArray355 != null) {
									local9.anIntArray355[local245] = 0;
								}
							}
						}
						if (local223) {
							Static67.method1134(local9, Static46.anInt894 - local55, Static84.anInt1530 - local50);
						}
						if (Static9.aClass146_11 != null && Static9.aClass146_11 != local9 && local209 && method643(local9).method3238()) {
							Static173.aClass146_12 = local9;
						}
						if (local9 == Static87.aClass146_6) {
							Static26.aBoolean32 = true;
							Static217.anInt4265 = local50;
							Static217.anInt4274 = local55;
						}
						if (local9.aBoolean313 || local9.anInt4350 != 0) {
							@Pc(418) Class1_Sub29 local418;
							if (local209 && Static26.anInt498 != 0 && local9.anObjectArray3 != null) {
								local418 = new Class1_Sub29();
								local418.aBoolean358 = true;
								local418.aClass146_16 = local9;
								local418.anInt5104 = Static26.anInt498;
								local418.anObjectArray32 = local9.anObjectArray3;
								Static250.aClass24_19.method473(local418);
							}
							if (Static9.aClass146_11 != null || Static70.aClass146_5 != null || Static108.aBoolean161 || local9.anInt4350 != 1400 && Static119.anInt5879 > 0) {
								local223 = false;
								local214 = false;
								local209 = false;
							}
							@Pc(522) int local522;
							if (local9.anInt4350 != 0) {
								if (local9.anInt4350 == 1337) {
									Static235.aClass146_15 = local9;
									continue;
								}
								if (local9.anInt4350 == 1338) {
									if (local223) {
										Static144.anInt2836 = Static84.anInt1530 - local50;
										Static269.anInt415 = Static46.anInt894 - local55;
									}
									continue;
								}
								if (local9.anInt4350 == 1400) {
									Static106.aClass146_9 = local9;
									if (local209) {
										Static189.aBoolean263 = true;
									}
									if (local223) {
										local245 = (int) ((double) (Static84.anInt1530 - local50 - local9.anInt4345 / 2) * 2.0D / (double) Static58.aFloat31);
										local522 = (int) ((double) (Static46.anInt894 - local55 - local9.anInt4371 / 2) * 2.0D / (double) Static58.aFloat31);
										local341 = Static72.anInt1374 + local245;
										@Pc(530) int local530 = Static75.anInt1427 + local522;
										@Pc(534) int local534 = local341 + Static58.anInt2560;
										@Pc(542) int local542 = Static58.anInt2563 + Static58.anInt2559 - local530 - 1;
										@Pc(545) Class1_Sub1_Sub8 local545 = Static6.method97();
										if (local545 == null) {
											continue;
										}
										@Pc(550) int[] local550 = new int[3];
										local545.method944(local534, local550, local542);
										if (local550 != null) {
											if (Static88.aBooleanArray16[82] && Static95.anInt5251 > 0) {
												Static267.method3978(local550[2], local550[0], local550[1]);
												Static29.method526();
												continue;
											}
											Static137.aClass1_Sub14_Sub1_6.method2661(6);
											Static137.aClass1_Sub14_Sub1_6.method2597(local550[0] << 28 | local550[1] << 14 | local550[2]);
										}
										Static119.anInt5879 = 1;
										Static121.aBoolean183 = false;
										Static168.anInt5865 = Static152.anInt3132;
										Static312.anInt5847 = Static300.anInt5678;
										continue;
									}
									if (local214 && Static119.anInt5879 > 0) {
										if (Static119.anInt5879 == 1 && (Static168.anInt5865 != Static152.anInt3132 || Static312.anInt5847 != Static300.anInt5678)) {
											Static316.anInt5946 = Static72.anInt1374;
											Static305.anInt5782 = Static75.anInt1427;
											Static119.anInt5879 = 2;
										}
										if (Static119.anInt5879 == 2) {
											Static121.aBoolean183 = true;
											Static296.method4398(Static316.anInt5946 + (int) ((double) (Static168.anInt5865 - Static152.anInt3132) * 2.0D / (double) Static58.aFloat30));
											Static53.method902(Static305.anInt5782 + (int) ((double) (Static312.anInt5847 - Static300.anInt5678) * 2.0D / (double) Static58.aFloat30));
										}
										continue;
									}
									if (Static119.anInt5879 > 0 && !Static121.aBoolean183) {
										if ((Static287.anInt5451 == 1 || Static277.method4117(Static316.anInt5941 - 1)) && Static316.anInt5941 > 2) {
											Static35.method598();
										} else if (Static316.anInt5941 > 0) {
											Static300.method4499();
										}
									}
									Static119.anInt5879 = 0;
									continue;
								}
								if (local9.anInt4350 == 1401) {
									if (local214) {
										Static157.method2683(Static152.anInt3132 - local50, local9.anInt4345, Static300.anInt5678 - local55, local9.anInt4371);
									}
									continue;
								}
								if (local9.anInt4350 == 1402) {
									if (!Static291.aBoolean404) {
										Static237.method2927(local9);
									}
									continue;
								}
							}
							if (!local9.aBoolean298 && local223) {
								local9.aBoolean298 = true;
								if (local9.anObjectArray22 != null) {
									local418 = new Class1_Sub29();
									local418.aBoolean358 = true;
									local418.aClass146_16 = local9;
									local418.anInt5100 = Static84.anInt1530 - local50;
									local418.anInt5104 = Static46.anInt894 - local55;
									local418.anObjectArray32 = local9.anObjectArray22;
									Static250.aClass24_19.method473(local418);
								}
							}
							if (local9.aBoolean298 && local214 && local9.anObjectArray5 != null) {
								local418 = new Class1_Sub29();
								local418.aBoolean358 = true;
								local418.aClass146_16 = local9;
								local418.anInt5100 = Static152.anInt3132 - local50;
								local418.anInt5104 = Static300.anInt5678 - local55;
								local418.anObjectArray32 = local9.anObjectArray5;
								Static250.aClass24_19.method473(local418);
							}
							if (local9.aBoolean298 && !local214) {
								local9.aBoolean298 = false;
								if (local9.anObjectArray31 != null) {
									local418 = new Class1_Sub29();
									local418.aBoolean358 = true;
									local418.aClass146_16 = local9;
									local418.anInt5100 = Static152.anInt3132 - local50;
									local418.anInt5104 = Static300.anInt5678 - local55;
									local418.anObjectArray32 = local9.anObjectArray31;
									Static263.aClass24_25.method473(local418);
								}
							}
							if (local214 && local9.anObjectArray19 != null) {
								local418 = new Class1_Sub29();
								local418.aBoolean358 = true;
								local418.aClass146_16 = local9;
								local418.anInt5100 = Static152.anInt3132 - local50;
								local418.anInt5104 = Static300.anInt5678 - local55;
								local418.anObjectArray32 = local9.anObjectArray19;
								Static250.aClass24_19.method473(local418);
							}
							if (!local9.aBoolean311 && local209) {
								local9.aBoolean311 = true;
								if (local9.anObjectArray2 != null) {
									local418 = new Class1_Sub29();
									local418.aBoolean358 = true;
									local418.aClass146_16 = local9;
									local418.anInt5100 = Static152.anInt3132 - local50;
									local418.anInt5104 = Static300.anInt5678 - local55;
									local418.anObjectArray32 = local9.anObjectArray2;
									Static250.aClass24_19.method473(local418);
								}
							}
							if (local9.aBoolean311 && local209 && local9.anObjectArray25 != null) {
								local418 = new Class1_Sub29();
								local418.aBoolean358 = true;
								local418.aClass146_16 = local9;
								local418.anInt5100 = Static152.anInt3132 - local50;
								local418.anInt5104 = Static300.anInt5678 - local55;
								local418.anObjectArray32 = local9.anObjectArray25;
								Static250.aClass24_19.method473(local418);
							}
							if (local9.aBoolean311 && !local209) {
								local9.aBoolean311 = false;
								if (local9.anObjectArray17 != null) {
									local418 = new Class1_Sub29();
									local418.aBoolean358 = true;
									local418.aClass146_16 = local9;
									local418.anInt5100 = Static152.anInt3132 - local50;
									local418.anInt5104 = Static300.anInt5678 - local55;
									local418.anObjectArray32 = local9.anObjectArray17;
									Static263.aClass24_25.method473(local418);
								}
							}
							if (local9.anObjectArray11 != null) {
								local418 = new Class1_Sub29();
								local418.aClass146_16 = local9;
								local418.anObjectArray32 = local9.anObjectArray11;
								Static85.aClass24_13.method473(local418);
							}
							@Pc(1062) Class1_Sub29 local1062;
							if (local9.anObjectArray12 != null && Static91.anInt1746 > local9.anInt4360) {
								if (local9.anIntArray367 == null || Static91.anInt1746 - local9.anInt4360 > 32) {
									local418 = new Class1_Sub29();
									local418.aClass146_16 = local9;
									local418.anObjectArray32 = local9.anObjectArray12;
									Static250.aClass24_19.method473(local418);
								} else {
									label598: for (local245 = local9.anInt4360; local245 < Static91.anInt1746; local245++) {
										local522 = Static157.anIntArray269[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray367.length; local341++) {
											if (local9.anIntArray367[local341] == local522) {
												local1062 = new Class1_Sub29();
												local1062.aClass146_16 = local9;
												local1062.anObjectArray32 = local9.anObjectArray12;
												Static250.aClass24_19.method473(local1062);
												break label598;
											}
										}
									}
								}
								local9.anInt4360 = Static91.anInt1746;
							}
							if (local9.anObjectArray23 != null && Static272.anInt5177 > local9.anInt4420) {
								if (local9.anIntArray365 == null || Static272.anInt5177 - local9.anInt4420 > 32) {
									local418 = new Class1_Sub29();
									local418.aClass146_16 = local9;
									local418.anObjectArray32 = local9.anObjectArray23;
									Static250.aClass24_19.method473(local418);
								} else {
									label574: for (local245 = local9.anInt4420; local245 < Static272.anInt5177; local245++) {
										local522 = Static311.anIntArray532[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray365.length; local341++) {
											if (local9.anIntArray365[local341] == local522) {
												local1062 = new Class1_Sub29();
												local1062.aClass146_16 = local9;
												local1062.anObjectArray32 = local9.anObjectArray23;
												Static250.aClass24_19.method473(local1062);
												break label574;
											}
										}
									}
								}
								local9.anInt4420 = Static272.anInt5177;
							}
							if (local9.anObjectArray15 != null && Static250.anInt3291 > local9.anInt4417) {
								if (local9.anIntArray356 == null || Static250.anInt3291 - local9.anInt4417 > 32) {
									local418 = new Class1_Sub29();
									local418.aClass146_16 = local9;
									local418.anObjectArray32 = local9.anObjectArray15;
									Static250.aClass24_19.method473(local418);
								} else {
									label550: for (local245 = local9.anInt4417; local245 < Static250.anInt3291; local245++) {
										local522 = Static148.anIntArray241[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray356.length; local341++) {
											if (local9.anIntArray356[local341] == local522) {
												local1062 = new Class1_Sub29();
												local1062.aClass146_16 = local9;
												local1062.anObjectArray32 = local9.anObjectArray15;
												Static250.aClass24_19.method473(local1062);
												break label550;
											}
										}
									}
								}
								local9.anInt4417 = Static250.anInt3291;
							}
							if (local9.anObjectArray7 != null && Static92.anInt1760 > local9.anInt4426) {
								if (local9.anIntArray369 == null || Static92.anInt1760 - local9.anInt4426 > 32) {
									local418 = new Class1_Sub29();
									local418.aClass146_16 = local9;
									local418.anObjectArray32 = local9.anObjectArray7;
									Static250.aClass24_19.method473(local418);
								} else {
									label526: for (local245 = local9.anInt4426; local245 < Static92.anInt1760; local245++) {
										local522 = Static51.anIntArray84[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray369.length; local341++) {
											if (local9.anIntArray369[local341] == local522) {
												local1062 = new Class1_Sub29();
												local1062.aClass146_16 = local9;
												local1062.anObjectArray32 = local9.anObjectArray7;
												Static250.aClass24_19.method473(local1062);
												break label526;
											}
										}
									}
								}
								local9.anInt4426 = Static92.anInt1760;
							}
							if (local9.anObjectArray9 != null && Static247.anInt4899 > local9.anInt4387) {
								if (local9.anIntArray366 == null || Static247.anInt4899 - local9.anInt4387 > 32) {
									local418 = new Class1_Sub29();
									local418.aClass146_16 = local9;
									local418.anObjectArray32 = local9.anObjectArray9;
									Static250.aClass24_19.method473(local418);
								} else {
									label502: for (local245 = local9.anInt4387; local245 < Static247.anInt4899; local245++) {
										local522 = Static212.anIntArray336[local245 & 0x1F];
										for (local341 = 0; local341 < local9.anIntArray366.length; local341++) {
											if (local9.anIntArray366[local341] == local522) {
												local1062 = new Class1_Sub29();
												local1062.aClass146_16 = local9;
												local1062.anObjectArray32 = local9.anObjectArray9;
												Static250.aClass24_19.method473(local1062);
												break label502;
											}
										}
									}
								}
								local9.anInt4387 = Static247.anInt4899;
							}
							if (Static315.anInt5920 > local9.anInt4373 && local9.anObjectArray27 != null) {
								local418 = new Class1_Sub29();
								local418.aClass146_16 = local9;
								local418.anObjectArray32 = local9.anObjectArray27;
								Static250.aClass24_19.method473(local418);
							}
							if (Static214.anInt4214 > local9.anInt4373 && local9.anObjectArray21 != null) {
								local418 = new Class1_Sub29();
								local418.aClass146_16 = local9;
								local418.anObjectArray32 = local9.anObjectArray21;
								Static250.aClass24_19.method473(local418);
							}
							if (Static73.anInt1409 > local9.anInt4373 && local9.anObjectArray13 != null) {
								local418 = new Class1_Sub29();
								local418.aClass146_16 = local9;
								local418.anObjectArray32 = local9.anObjectArray13;
								Static250.aClass24_19.method473(local418);
							}
							if (Static111.anInt2216 > local9.anInt4373 && local9.anObjectArray28 != null) {
								local418 = new Class1_Sub29();
								local418.aClass146_16 = local9;
								local418.anObjectArray32 = local9.anObjectArray28;
								Static250.aClass24_19.method473(local418);
							}
							if (Static220.anInt5820 > local9.anInt4373 && local9.anObjectArray4 != null) {
								local418 = new Class1_Sub29();
								local418.aClass146_16 = local9;
								local418.anObjectArray32 = local9.anObjectArray4;
								Static250.aClass24_19.method473(local418);
							}
							local9.anInt4373 = Static314.anInt5908;
							if (local9.anObjectArray24 != null) {
								for (local245 = 0; local245 < Static265.anInt5102; local245++) {
									@Pc(1526) Class1_Sub29 local1526 = new Class1_Sub29();
									local1526.aClass146_16 = local9;
									local1526.anInt5099 = Static301.anIntArray521[local245];
									local1526.anInt5103 = Static20.anIntArray30[local245];
									local1526.anObjectArray32 = local9.anObjectArray24;
									Static250.aClass24_19.method473(local1526);
								}
							}
							if (Static33.aBoolean45 && local9.anObjectArray16 != null) {
								local418 = new Class1_Sub29();
								local418.aClass146_16 = local9;
								local418.anObjectArray32 = local9.anObjectArray16;
								Static250.aClass24_19.method473(local418);
							}
						}
					}
					if (!local9.aBoolean299 && Static9.aClass146_11 == null && Static70.aClass146_5 == null && !Static108.aBoolean161) {
						if ((local9.anInt4428 >= 0 || local9.anInt4414 != 0) && Static152.anInt3132 >= local61 && Static300.anInt5678 >= local63 && Static152.anInt3132 < local65 && Static300.anInt5678 < local67) {
							if (local9.anInt4428 >= 0) {
								Static56.aClass146_4 = arg0[local9.anInt4428];
							} else {
								Static56.aClass146_4 = local9;
							}
						}
						if (local9.anInt4370 == 8 && Static152.anInt3132 >= local61 && Static300.anInt5678 >= local63 && Static152.anInt3132 < local65 && Static300.anInt5678 < local67) {
							Static292.aClass146_18 = local9;
						}
						if (local9.anInt4383 > local9.anInt4371) {
							Static103.method1606(Static152.anInt3132, local9.anInt4371, local50 + local9.anInt4345, Static300.anInt5678, local9.anInt4383, local9, local55);
						}
					}
					if (local9.anInt4370 == 0) {
						method641(arg0, local9.anInt4355, local61, local63, local65, local67, local50 - local9.anInt4341, local55 - local9.anInt4418);
						if (local9.aClass146Array2 != null) {
							method641(local9.aClass146Array2, local9.anInt4355, local61, local63, local65, local67, local50 - local9.anInt4341, local55 - local9.anInt4418);
						}
						@Pc(1691) Class1_Sub32 local1691 = (Class1_Sub32) Static69.aClass156_6.method3821((long) local9.anInt4355);
						if (local1691 != null) {
							Static15.method212(local63, local50, local65, local55, local67, local1691.anInt5722, local61);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!qf;)Lclient!ol;")
	public static Class1_Sub22 method643(@OriginalArg(0) Class146 arg0) {
		@Pc(13) Class1_Sub22 local13 = (Class1_Sub22) Static298.aClass156_29.method3821(((long) arg0.anInt4355 << 32) + (long) arg0.anInt4407);
		return local13 == null ? arg0.aClass1_Sub22_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!qf;)Lclient!qf;")
	public static Class146 method644(@OriginalArg(0) Class146 arg0) {
		@Pc(4) int local4 = method643(arg0).method3240();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static259.method3908(arg0.anInt4416);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method648() {
		for (@Pc(1) int local1 = -1; local1 < Static222.anInt4329 + Static105.anInt2015; local1++) {
			@Pc(10) Class22_Sub3 local10;
			if (local1 < 0) {
				local10 = Static229.aClass22_Sub3_Sub2_2;
			} else if (local1 < Static222.anInt4329) {
				local10 = Static195.aClass22_Sub3_Sub2Array1[Static46.anIntArray79[local1]];
			} else {
				local10 = Static265.aClass22_Sub3_Sub1Array1[Static7.anIntArray12[local1 - Static222.anInt4329]];
			}
			if (local10.anInt4622 >= 0) {
				@Pc(37) int local37 = local10.method3660();
				if ((local37 & 0x1) == 0) {
					if ((local10.anInt4601 & 0x7F) != 0 || (local10.anInt4623 & 0x7F) != 0) {
						continue;
					}
				} else if ((local10.anInt4601 & 0x7F) != 64 || (local10.anInt4623 & 0x7F) != 64) {
					continue;
				}
				@Pc(124) int local124;
				@Pc(73) int local73;
				@Pc(78) int local78;
				if (local37 == 1) {
					local73 = local10.anInt4601 >> 7;
					local78 = local10.anInt4623 >> 7;
					if (local73 >= 0 && local73 < 104 && local78 >= 0 && local78 < 104 && local10.anInt4622 >= Static204.anIntArrayArray29[local73][local78]) {
						if (local10.anInt4622 > Static204.anIntArrayArray29[local73][local78]) {
							Static204.anIntArrayArray29[local73][local78] = local10.anInt4622;
							Static101.anIntArrayArray10[local73][local78] = 1;
						} else {
							local124 = Static101.anIntArrayArray10[local73][local78]++;
						}
					}
				} else {
					local73 = local10.anInt4601 - local37 * 64 >> 7;
					local78 = local10.anInt4623 - local37 * 64 >> 7;
					@Pc(152) int local152 = local73 + local10.method3660();
					@Pc(158) int local158 = local78 + local10.method3660();
					if (local73 < 0) {
						local73 = 0;
					}
					if (local152 > 104) {
						local152 = 104;
					}
					if (local78 < 0) {
						local78 = 0;
					}
					if (local158 > 104) {
						local158 = 104;
					}
					for (@Pc(178) int local178 = local73; local178 < local152; local178++) {
						for (@Pc(183) int local183 = local78; local183 < local158; local183++) {
							if (local10.anInt4622 > Static204.anIntArrayArray29[local178][local183]) {
								Static204.anIntArrayArray29[local178][local183] = local10.anInt4622;
								Static101.anIntArrayArray10[local178][local183] = 1;
							} else if (local10.anInt4622 == Static204.anIntArrayArray29[local178][local183]) {
								local124 = Static101.anIntArrayArray10[local178][local183]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
	public static void method649() {
		Static212.aClass169_115.method4018();
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method650() {
		if (Static58.aClass1_Sub1_Sub8_2 == null) {
			return;
		}
		if (Static191.anInt3924 < 10) {
			if (!Static58.aClass138_41.method3367(Static58.aClass1_Sub1_Sub8_2.aString30)) {
				Static191.anInt3924 = Static300.aClass138_85.method3370(Static58.aClass1_Sub1_Sub8_2.aString30) / 10;
				return;
			}
			Static117.method1862();
			Static191.anInt3924 = 10;
		}
		if (Static191.anInt3924 == 10) {
			Static58.anInt2559 = Static58.aClass1_Sub1_Sub8_2.anInt1050 >> 6 << 6;
			Static58.anInt2563 = (Static58.aClass1_Sub1_Sub8_2.anInt1061 >> 6 << 6) + 64 - Static58.anInt2559;
			@Pc(60) int[] local60 = new int[3];
			Static58.anInt2560 = Static58.aClass1_Sub1_Sub8_2.anInt1053 >> 6 << 6;
			Static58.anInt2561 = (Static58.aClass1_Sub1_Sub8_2.anInt1044 >> 6 << 6) + 64 - Static58.anInt2560;
			@Pc(81) int local81 = -1;
			@Pc(83) int local83 = -1;
			if (Static58.aClass1_Sub1_Sub8_2.method940(Static290.anInt5497 + (Static229.aClass22_Sub3_Sub2_2.anInt4601 >> 7), local60, Static118.anInt2409 + (Static229.aClass22_Sub3_Sub2_2.anInt4623 >> 7), Static295.anInt5586)) {
				local83 = Static58.anInt2559 + Static58.anInt2563 - local60[2] - 1;
				local81 = local60[1] - Static58.anInt2560;
			}
			if (!Static220.aBoolean425 && local81 >= 0 && local81 < Static58.anInt2561 && local83 >= 0 && Static58.anInt2563 > local83) {
				local81 += (int) (Math.random() * 10.0D) - 5;
				local83 += (int) (Math.random() * 10.0D) - 5;
				Static72.anInt1374 = local81;
				Static75.anInt1427 = local83;
			} else if (Static49.anInt952 == -1 || Static175.anInt3628 == -1) {
				Static58.aClass1_Sub1_Sub8_2.method942(Static58.aClass1_Sub1_Sub8_2.anInt1043 >> 14 & 0x3FFF, local60, Static58.aClass1_Sub1_Sub8_2.anInt1043 & 0x3FFF);
				Static75.anInt1427 = Static58.anInt2559 + Static58.anInt2563 - local60[2] - 1;
				Static72.anInt1374 = local60[1] - Static58.anInt2560;
			} else {
				Static58.aClass1_Sub1_Sub8_2.method942(Static49.anInt952, local60, Static175.anInt3628);
				Static175.anInt3628 = -1;
				Static49.anInt952 = -1;
				Static220.aBoolean425 = false;
				if (local60 != null) {
					Static72.anInt1374 = local60[1] - Static58.anInt2560;
					Static75.anInt1427 = Static58.anInt2559 + Static58.anInt2563 - local60[2] - 1;
				}
			}
			if (Static58.aClass1_Sub1_Sub8_2.anInt1059 == 37) {
				Static58.aFloat31 = 3.0F;
				Static58.aFloat30 = 3.0F;
			} else if (Static58.aClass1_Sub1_Sub8_2.anInt1059 == 50) {
				Static58.aFloat31 = 4.0F;
				Static58.aFloat30 = 4.0F;
			} else if (Static58.aClass1_Sub1_Sub8_2.anInt1059 == 75) {
				Static58.aFloat31 = 6.0F;
				Static58.aFloat30 = 6.0F;
			} else if (Static58.aClass1_Sub1_Sub8_2.anInt1059 == 100) {
				Static58.aFloat31 = 8.0F;
				Static58.aFloat30 = 8.0F;
			} else if (Static58.aClass1_Sub1_Sub8_2.anInt1059 == 200) {
				Static58.aFloat31 = 16.0F;
				Static58.aFloat30 = 16.0F;
			} else {
				Static58.aFloat31 = 8.0F;
				Static58.aFloat30 = 8.0F;
			}
			Static97.method1402();
			@Pc(307) int local307 = Static58.anInt2563 >> 6;
			@Pc(311) int local311 = Static58.anInt2561 >> 6;
			Static58.aByteArrayArrayArray15 = new byte[local311][local307][];
			Static58.aByteArrayArrayArray14 = new byte[local311][local307][];
			Static58.anIntArrayArrayArray7 = new int[local311][local307][];
			Static58.anIntArrayArrayArray8 = new int[local311][local307][];
			Static58.aByteArrayArrayArray13 = new byte[local311][local307][];
			Static58.aByteArrayArrayArray16 = new byte[local311][local307][];
			Static58.aByteArrayArrayArray12 = new byte[local311][local307][];
			Static58.anIntArray204 = new int[Static78.anInt1465 + 1];
			Static234.aClass24_23 = new Class24();
			Static260.aClass48_1 = new Class48();
			@Pc(358) int local358 = Static288.anInt5487 >> 2 << 10;
			@Pc(362) int local362 = Static185.anInt3729 >> 1;
			Static58.method2037(local358, local362);
			Static198.method3211(1024, 256);
			Static233.method3683(256, 256);
			Static52.method963(256);
			Static191.anInt3924 = 20;
		} else if (Static191.anInt3924 == 20) {
			Static206.method3278(new Class1_Sub14(Static58.aClass138_41.method3335("underlay", Static58.aClass1_Sub1_Sub8_2.aString30)));
			Static191.anInt3924 = 30;
			Static289.method4287(true);
			Static91.method1363();
		} else if (Static191.anInt3924 == 30) {
			Static58.method2047(new Class1_Sub14(Static58.aClass138_41.method3335("overlay", Static58.aClass1_Sub1_Sub8_2.aString30)));
			Static191.anInt3924 = 40;
			Static91.method1363();
		} else if (Static191.anInt3924 == 40) {
			Static58.method2032(new Class1_Sub14(Static58.aClass138_41.method3335("overlay2", Static58.aClass1_Sub1_Sub8_2.aString30)));
			Static191.anInt3924 = 50;
			Static91.method1363();
		} else if (Static191.anInt3924 == 50) {
			Static58.method2043(new Class1_Sub14(Static58.aClass138_41.method3335("loc", Static58.aClass1_Sub1_Sub8_2.aString30)), Static235.aBoolean341);
			Static191.anInt3924 = 60;
			Static289.method4287(true);
			Static91.method1363();
		} else if (Static191.anInt3924 == 60) {
			if (Static58.aClass138_41.method3342(Static58.aClass1_Sub1_Sub8_2.aString30 + "_labels")) {
				if (!Static58.aClass138_41.method3367(Static58.aClass1_Sub1_Sub8_2.aString30 + "_labels")) {
					return;
				}
				Static58.aClass172_3 = Static105.method1695(Static58.aClass1_Sub1_Sub8_2.aString30 + "_labels", Static235.aBoolean341, Static58.aClass138_41);
			} else {
				Static58.aClass172_3 = new Class172(0);
			}
			Static58.method2046();
			Static191.anInt3924 = 70;
			Static91.method1363();
		} else if (Static191.anInt3924 == 70) {
			Static152.aClass133_6 = new Class133(11, true, Static304.aCanvas1);
			Static191.anInt3924 = 73;
			Static289.method4287(true);
			Static91.method1363();
		} else if (Static191.anInt3924 == 73) {
			Static61.aClass133_2 = new Class133(12, true, Static304.aCanvas1);
			Static191.anInt3924 = 76;
			Static289.method4287(true);
			Static91.method1363();
		} else if (Static191.anInt3924 == 76) {
			Static263.aClass133_7 = new Class133(14, true, Static304.aCanvas1);
			Static191.anInt3924 = 79;
			Static289.method4287(true);
			Static91.method1363();
		} else if (Static191.anInt3924 == 79) {
			Static136.aClass133_4 = new Class133(17, true, Static304.aCanvas1);
			Static191.anInt3924 = 82;
			Static289.method4287(true);
			Static91.method1363();
		} else if (Static191.anInt3924 == 82) {
			Static263.aClass133_8 = new Class133(19, true, Static304.aCanvas1);
			Static191.anInt3924 = 85;
			Static289.method4287(true);
			Static91.method1363();
		} else if (Static191.anInt3924 == 85) {
			Static7.aClass133_1 = new Class133(22, true, Static304.aCanvas1);
			Static191.anInt3924 = 88;
			Static289.method4287(true);
			Static91.method1363();
		} else if (Static191.anInt3924 == 88) {
			Static145.aClass133_5 = new Class133(26, true, Static304.aCanvas1);
			Static191.anInt3924 = 91;
			Static289.method4287(true);
			Static91.method1363();
		} else {
			Static117.aClass133_3 = new Class133(30, true, Static304.aCanvas1);
			Static191.anInt3924 = 100;
			Static289.method4287(true);
			Static91.method1363();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	public static void method652() {
		Static168.aClass169_164.method4018();
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method653() {
		for (@Pc(1) int local1 = -1; local1 < Static222.anInt4329 + Static105.anInt2015; local1++) {
			@Pc(10) Class22_Sub3 local10;
			@Pc(12) long local12;
			@Pc(20) int local20;
			if (local1 < 0) {
				local10 = Static229.aClass22_Sub3_Sub2_2;
				local12 = 8791798054912L;
			} else if (local1 < Static222.anInt4329) {
				local20 = Static46.anIntArray79[local1];
				local10 = Static195.aClass22_Sub3_Sub2Array1[local20];
				local12 = (long) local20 << 32;
			} else {
				local20 = Static7.anIntArray12[local1 - Static222.anInt4329];
				@Pc(40) Class22_Sub3_Sub1 local40 = Static265.aClass22_Sub3_Sub1Array1[local20];
				local10 = local40;
				local12 = (long) local20 << 32 | 0x20000000L;
				if (!local40.aClass112_1.aBoolean247) {
					local12 |= Long.MIN_VALUE;
				}
			}
			if (local10.anInt4622 < 0) {
				local10.aBoolean327 = false;
			} else {
				local10.anInt4620 = -1;
				local20 = local10.method3660();
				if ((local20 & 0x1) == 0) {
					if ((local10.anInt4601 & 0x7F) != 0 || (local10.anInt4623 & 0x7F) != 0) {
						local10.aBoolean327 = false;
						continue;
					}
				} else if ((local10.anInt4601 & 0x7F) != 64 || (local10.anInt4623 & 0x7F) != 64) {
					local10.aBoolean327 = false;
					continue;
				}
				@Pc(157) int local157;
				@Pc(118) int local118;
				@Pc(113) int local113;
				if (local20 == 1) {
					local113 = local10.anInt4601 >> 7;
					local118 = local10.anInt4623 >> 7;
					if (local113 < 0 || local113 >= 104 || local118 < 0 || local118 >= 104) {
						local10.aBoolean327 = true;
						continue;
					}
					if (local10.anInt4622 != Static204.anIntArrayArray29[local113][local118]) {
						local10.aBoolean327 = true;
						continue;
					}
					if (Static101.anIntArrayArray10[local113][local118] > 1) {
						local157 = Static101.anIntArrayArray10[local113][local118]--;
						local10.aBoolean327 = true;
						continue;
					}
				} else {
					local113 = local10.anInt4601 - local20 * 64 >> 7;
					local118 = local10.anInt4623 - local20 * 64 >> 7;
					@Pc(187) int local187 = local113 + local20;
					@Pc(191) int local191 = local118 + local20;
					if (local113 < 0) {
						local113 = 0;
					}
					if (local187 > 104) {
						local187 = 104;
					}
					if (local118 < 0) {
						local118 = 0;
					}
					if (local191 > 104) {
						local191 = 104;
					}
					if (!Static285.method4240(local10.anInt4622, local191, local118, local187, local113)) {
						for (@Pc(220) int local220 = local113; local220 < local187; local220++) {
							for (@Pc(225) int local225 = local118; local225 < local191; local225++) {
								if (local10.anInt4622 == Static204.anIntArrayArray29[local220][local225]) {
									local157 = Static101.anIntArrayArray10[local220][local225]--;
								}
							}
						}
						local10.aBoolean327 = true;
						continue;
					}
				}
				if (local10 instanceof Class22_Sub3_Sub2 && local10.anObject7 != null && Static37.anInt757 >= local10.anInt4578 && Static37.anInt757 < local10.anInt4599) {
					((Class22_Sub3_Sub2) local10).aBoolean334 = false;
					local10.aBoolean327 = false;
					local10.anInt4579 = Static104.method1648(Static295.anInt5586, local10.anInt4601, local10.anInt4623);
					Static44.method778(Static295.anInt5586, local10.anInt4601, local10.anInt4623, local10.anInt4579, local10, local10.anInt4649, local12, local10.anInt4587, local10.anInt4570, local10.anInt4572, local10.anInt4639);
				} else {
					local10.aBoolean327 = false;
					local10.anInt4579 = Static104.method1648(Static295.anInt5586, local10.anInt4601, local10.anInt4623);
					Static230.method3623(Static295.anInt5586, local10.anInt4601, local10.anInt4623, local10.anInt4579, (local20 - 1) * 64 + 60, local10, local10.anInt4649, local12, local10.aBoolean332);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!qf;)Z")
	public static boolean method654(@OriginalArg(0) Class146 arg0) {
		if (Static250.aBoolean231) {
			if (method643(arg0).anInt4031 != 0) {
				return false;
			}
			if (arg0.anInt4370 == 0) {
				return false;
			}
		}
		return arg0.aBoolean312;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method655() {
		Static223.aClass169_123.method4014();
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method656() {
		@Pc(11) boolean local11 = Static101.aBoolean145 && Static222.anInt4329 > 200 || Static222.anInt4329 > 50;
		@Pc(13) int local13;
		@Pc(47) int local47;
		for (local13 = 0; local13 < Static222.anInt4329; local13++) {
			@Pc(22) Class22_Sub3_Sub2 local22 = Static195.aClass22_Sub3_Sub2Array1[Static46.anIntArray79[local13]];
			local22.aBoolean329 = false;
			if (local22.method3655()) {
				local22.aBoolean334 = local22.anInt4566 == local22.method3659().anInt2171 ? local11 : false;
				local47 = 0;
				if (!local22.aBoolean327) {
					local47++;
				}
				if (local22.anInt4594 > Static37.anInt757) {
					local47 += 2;
				}
				local47 += 5 - local22.method3660() << 2;
				if (Static91.anInt1742 == 0) {
					local47 += 32;
				} else {
					local47 += 128;
				}
				local47 += 256;
				local22.anInt4622 = local47 + 1;
			} else {
				local22.anInt4622 = -1;
			}
		}
		for (local13 = 0; local13 < Static105.anInt2015; local13++) {
			@Pc(90) Class22_Sub3_Sub1 local90 = Static265.aClass22_Sub3_Sub1Array1[Static7.anIntArray12[local13]];
			local90.aBoolean329 = false;
			if (local90.method3655() && local90.aClass112_1.method2827()) {
				local47 = 0;
				if (!local90.aBoolean327) {
					local47++;
				}
				if (local90.anInt4594 > Static37.anInt757) {
					local47 += 2;
				}
				local47 += 5 - local90.method3660() << 2;
				if (Static91.anInt1742 == 0) {
					if (local90.aClass112_1.aBoolean244) {
						local47 += 64;
					} else {
						local47 += 128;
					}
				} else if (Static91.anInt1742 == 1) {
					if (local90.aClass112_1.aBoolean244) {
						local47 += 32;
					} else {
						local47 += 64;
					}
				}
				if (local90.aClass112_1.aBoolean248) {
					local47 += 512;
				} else {
					local47 += 256;
				}
				local90.anInt4622 = local47 + 1;
			} else {
				local90.anInt4622 = -1;
			}
		}
		for (local13 = 0; local13 < Static257.aClass68Array1.length; local13++) {
			@Pc(171) Class68 local171 = Static257.aClass68Array1[local13];
			if (local171 != null) {
				if (local171.anInt1791 == 1) {
					@Pc(183) Class22_Sub3_Sub1 local183 = Static265.aClass22_Sub3_Sub1Array1[local171.anInt1785];
					if (local183 != null && local183.anInt4622 != -1) {
						local183.anInt4622 += 1024;
					}
				} else if (local171.anInt1791 == 10) {
					@Pc(205) Class22_Sub3_Sub2 local205 = Static195.aClass22_Sub3_Sub2Array1[local171.anInt1785];
					if (local205 != null && local205.anInt4622 != -1) {
						local205.anInt4622 += 1024;
					}
				}
			}
		}
		Static229.aClass22_Sub3_Sub2_2.anInt4622 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method657() {
		Static274.anInt5242 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static105.anInt2015; local3++) {
			@Pc(12) Class22_Sub3_Sub1 local12 = Static265.aClass22_Sub3_Sub1Array1[Static7.anIntArray12[local3]];
			if (local12.aBoolean327 && local12.method3641() != -1) {
				@Pc(33) int local33 = local12.anInt4601 - (local12.method3660() - 1) * 64;
				@Pc(44) int local44 = local12.anInt4623 - (local12.method3660() - 1) * 64;
				@Pc(53) Class60 local53 = Static19.method394(Static295.anInt5586, local33 >> 7, local44 >> 7);
				if (local53 != null) {
					@Pc(59) long local59 = local53.aLong64;
					@Pc(66) int local66 = (int) (local59 >>> 32) & Integer.MAX_VALUE;
					@Pc(78) Class22_Sub3 local78;
					if ((local59 >>> 29 & 0x3L) == 0L) {
						local78 = Static195.aClass22_Sub3_Sub2Array1[local66];
					} else {
						local78 = Static265.aClass22_Sub3_Sub1Array1[local66];
						local66 += 2048;
					}
					if (local78.anInt4620 == -1) {
						Static225.anIntArray371[Static274.anInt5242] = local66;
						Static249.anIntArray446[Static274.anInt5242++] = local66;
						local78.anInt4620 = 0;
					}
					Static225.anIntArray371[Static274.anInt5242] = local66;
					Static249.anIntArray446[Static274.anInt5242++] = Static7.anIntArray12[local3] + 2048;
				}
			}
		}
		Static212.method3364(Static225.anIntArray371, Static274.anInt5242 - 1, 0, Static249.anIntArray446);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method659() {
		for (@Pc(1) int local1 = -1; local1 < Static222.anInt4329 + Static105.anInt2015; local1++) {
			@Pc(10) Class22_Sub3 local10;
			@Pc(12) long local12;
			@Pc(20) int local20;
			if (local1 < 0) {
				local10 = Static229.aClass22_Sub3_Sub2_2;
				local12 = 8791798054912L;
			} else if (local1 < Static222.anInt4329) {
				local20 = Static46.anIntArray79[local1];
				local10 = Static195.aClass22_Sub3_Sub2Array1[local20];
				local12 = (long) local20 << 32;
			} else {
				local20 = Static7.anIntArray12[local1 - Static222.anInt4329];
				@Pc(40) Class22_Sub3_Sub1 local40 = Static265.aClass22_Sub3_Sub1Array1[local20];
				local10 = local40;
				local12 = (long) local20 << 32 | 0x20000000L;
				if (!local40.aClass112_1.aBoolean247) {
					local12 |= Long.MIN_VALUE;
				}
			}
			if (local10.anInt4622 >= 0) {
				local20 = local10.method3660();
				if ((local20 & 0x1) == 0) {
					if ((local10.anInt4601 & 0x7F) == 0 && (local10.anInt4623 & 0x7F) == 0) {
						continue;
					}
				} else if ((local10.anInt4601 & 0x7F) == 64 && (local10.anInt4623 & 0x7F) == 64) {
					continue;
				}
				if (local10 instanceof Class22_Sub3_Sub2 && local10.anObject7 != null && Static37.anInt757 >= local10.anInt4578 && Static37.anInt757 < local10.anInt4599) {
					((Class22_Sub3_Sub2) local10).aBoolean334 = false;
					local10.anInt4579 = Static104.method1648(Static295.anInt5586, local10.anInt4601, local10.anInt4623);
					Static44.method778(Static295.anInt5586, local10.anInt4601, local10.anInt4623, local10.anInt4579, local10, local10.anInt4649, local12, local10.anInt4587, local10.anInt4570, local10.anInt4572, local10.anInt4639);
				} else {
					local10.anInt4579 = Static104.method1648(Static295.anInt5586, local10.anInt4601, local10.anInt4623);
					Static230.method3623(Static295.anInt5586, local10.anInt4601, local10.anInt4623, local10.anInt4579, (local20 - 1) * 64 + 60, local10, local10.anInt4649, local12, local10.aBoolean332);
				}
			}
		}
	}
}
