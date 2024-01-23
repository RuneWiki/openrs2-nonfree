import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
	public static int anInt4283;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "Lclient!lb;")
	public static Class97 aClass97_18 = new Class97(512);

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "Z")
	public static boolean aBoolean284 = false;

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
	public static int anInt4284 = -1;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
	public static void method3439() {
		if (Static114.anInt2474 > 1) {
			Static105.anInt2257 = Static177.anInt3485;
			Static114.anInt2474--;
		}
		if (Static117.anInt2592 > 0) {
			Static117.anInt2592--;
		}
		if (Static126.aBoolean178) {
			Static126.aBoolean178 = false;
			Static278.method4129();
			return;
		}
		@Pc(36) int local36;
		for (local36 = 0; local36 < 100 && Static286.method4294(); local36++) {
		}
		if (Static267.anInt3573 != 30) {
			return;
		}
		Static88.method1422(Static142.aClass4_Sub17_Sub1_3);
		@Pc(61) Object local61 = Static177.aClass169_1.anObject7;
		@Pc(91) int local91;
		@Pc(96) int local96;
		@Pc(120) int local120;
		@Pc(139) int local139;
		@Pc(198) int local198;
		@Pc(205) int local205;
		synchronized (Static177.aClass169_1.anObject7) {
			if (!Static185.aBoolean241) {
				Static177.aClass169_1.anInt4990 = 0;
			} else if (Static44.anInt885 != 0 || Static177.aClass169_1.anInt4990 >= 40) {
				Static142.aClass4_Sub17_Sub1_3.method1905(48);
				Static142.aClass4_Sub17_Sub1_3.method1861(0);
				local91 = 0;
				@Pc(94) int local94 = Static142.aClass4_Sub17_Sub1_3.anInt2400;
				for (local96 = 0; Static177.aClass169_1.anInt4990 > local96 && Static142.aClass4_Sub17_Sub1_3.anInt2400 - local94 < 240; local96++) {
					local120 = Static177.aClass169_1.anIntArray445[local96];
					if (local120 < 0) {
						local120 = 0;
					} else if (local120 > 65534) {
						local120 = 65534;
					}
					local139 = Static177.aClass169_1.anIntArray446[local96];
					if (local139 < 0) {
						local139 = 0;
					} else if (local139 > 65534) {
						local139 = 65534;
					}
					local91++;
					@Pc(154) boolean local154 = false;
					if (Static177.aClass169_1.anIntArray445[local96] == -1 && Static177.aClass169_1.anIntArray446[local96] == -1) {
						local139 = -1;
						local154 = true;
						local120 = -1;
					}
					if (local139 != Static225.anInt4474 || local120 != Static177.anInt3488) {
						local198 = local139 - Static225.anInt4474;
						Static225.anInt4474 = local139;
						local205 = local120 - Static177.anInt3488;
						Static177.anInt3488 = local120;
						if (Static259.anInt4929 < 8 && local198 >= -32 && local198 <= 31 && local205 >= -32 && local205 <= 31) {
							local198 += 32;
							local205 += 32;
							Static142.aClass4_Sub17_Sub1_3.method1875(local205 + (local198 << 6) + (Static259.anInt4929 << 12));
							Static259.anInt4929 = 0;
						} else if (Static259.anInt4929 < 32 && local198 >= -128 && local198 <= 127 && local205 >= -128 && local205 <= 127) {
							Static142.aClass4_Sub17_Sub1_3.method1861(Static259.anInt4929 + 128);
							local205 += 128;
							local198 += 128;
							Static142.aClass4_Sub17_Sub1_3.method1875((local198 << 8) + local205);
							Static259.anInt4929 = 0;
						} else if (Static259.anInt4929 >= 32) {
							Static142.aClass4_Sub17_Sub1_3.method1875(Static259.anInt4929 + 57344);
							if (local154) {
								Static142.aClass4_Sub17_Sub1_3.method1854(Integer.MIN_VALUE);
							} else {
								Static142.aClass4_Sub17_Sub1_3.method1854(local139 | local120 << 16);
							}
							Static259.anInt4929 = 0;
						} else {
							Static142.aClass4_Sub17_Sub1_3.method1861(Static259.anInt4929 + 192);
							if (local154) {
								Static142.aClass4_Sub17_Sub1_3.method1854(Integer.MIN_VALUE);
							} else {
								Static142.aClass4_Sub17_Sub1_3.method1854(local139 | local120 << 16);
							}
							Static259.anInt4929 = 0;
						}
					} else if (Static259.anInt4929 < 2047) {
						Static259.anInt4929++;
					}
				}
				Static142.aClass4_Sub17_Sub1_3.method1867(Static142.aClass4_Sub17_Sub1_3.anInt2400 - local94);
				if (local91 >= Static177.aClass169_1.anInt4990) {
					Static177.aClass169_1.anInt4990 = 0;
				} else {
					Static177.aClass169_1.anInt4990 -= local91;
					for (local96 = 0; local96 < Static177.aClass169_1.anInt4990; local96++) {
						Static177.aClass169_1.anIntArray446[local96] = Static177.aClass169_1.anIntArray446[local91 + local96];
						Static177.aClass169_1.anIntArray445[local96] = Static177.aClass169_1.anIntArray445[local91 + local96];
					}
				}
			}
		}
		if (Static44.anInt885 != 0) {
			@Pc(428) long local428 = (Static175.aLong125 - Static182.aLong132) / 50L;
			Static182.aLong132 = Static175.aLong125;
			if (local428 > 32767L) {
				local428 = 32767L;
			}
			local96 = Static35.anInt708;
			local91 = Static147.anInt2993;
			if (local91 < 0) {
				local91 = 0;
			} else if (local91 > 65535) {
				local91 = 65535;
			}
			local139 = (int) local428;
			@Pc(462) byte local462 = 0;
			if (Static44.anInt885 == 2) {
				local462 = 1;
			}
			if (local96 < 0) {
				local96 = 0;
			} else if (local96 > 65535) {
				local96 = 65535;
			}
			Static142.aClass4_Sub17_Sub1_3.method1905(87);
			Static142.aClass4_Sub17_Sub1_3.method1893(local96 | local91 << 16);
			Static142.aClass4_Sub17_Sub1_3.method1855(local139 | local462 << 15);
		}
		if (Static190.anInt3783 > 0) {
			Static190.anInt3783--;
		}
		if (Static114.aBoolean167 && Static190.anInt3783 <= 0) {
			Static114.aBoolean167 = false;
			Static190.anInt3783 = 20;
			Static142.aClass4_Sub17_Sub1_3.method1905(122);
			Static142.aClass4_Sub17_Sub1_3.method1876((int) Static96.aFloat16);
			Static142.aClass4_Sub17_Sub1_3.method1855((int) Static270.aFloat49);
		}
		if (Static159.aBoolean202 && !Static73.aBoolean104) {
			Static73.aBoolean104 = true;
			Static142.aClass4_Sub17_Sub1_3.method1905(0);
			Static142.aClass4_Sub17_Sub1_3.method1861(1);
		}
		if (!Static159.aBoolean202 && Static73.aBoolean104) {
			Static73.aBoolean104 = false;
			Static142.aClass4_Sub17_Sub1_3.method1905(0);
			Static142.aClass4_Sub17_Sub1_3.method1861(0);
		}
		if (!Static189.aBoolean320) {
			Static142.aClass4_Sub17_Sub1_3.method1905(36);
			Static142.aClass4_Sub17_Sub1_3.method1852(Static2.method10());
			Static189.aBoolean320 = true;
		}
		if (Static298.aBoolean356) {
			Static298.aBoolean356 = false;
		} else {
			Static86.aFloat13 /= 2.0F;
		}
		if (Static146.aBoolean196) {
			Static146.aBoolean196 = false;
		} else {
			Static171.aFloat28 /= 2.0F;
		}
		Static182.method2849();
		if (Static267.anInt3573 != 30) {
			return;
		}
		Static2.method13();
		Static156.method2478();
		Static30.method458();
		Static269.anInt5030++;
		if (Static269.anInt5030 > 750) {
			Static278.method4129();
			return;
		}
		Static224.method3583();
		Static276.method4105();
		Static238.method3675();
		if (Static138.aClass22_13 != null) {
			Static83.method3376();
		}
		for (local36 = Static52.method861(true); local36 != -1; local36 = Static52.method861(false)) {
			Static102.method1653(local36);
			Static102.anIntArray224[Static47.anInt944++ & 0x1F] = local36;
		}
		@Pc(1108) int local1108;
		for (@Pc(687) Class4_Sub2_Sub21 local687 = Static230.method3625(); local687 != null; local687 = Static230.method3625()) {
			local91 = local687.method4359();
			local96 = local687.method4362();
			if (local91 == 1) {
				Static150.anIntArray279[local96] = local687.anInt5492;
				Static11.anIntArray24[Static154.anInt3124++ & 0x1F] = local96;
			} else if (local91 == 2) {
				Static299.aStringArray38[local96] = local687.aString192;
				Static67.anIntArray139[Static295.anInt5479++ & 0x1F] = local96;
			} else {
				@Pc(750) Class22 local750;
				if (local91 == 3) {
					local750 = Static21.method3453(local96);
					if (!local687.aString192.equals(local750.aString10)) {
						local750.aString10 = local687.aString192;
						Static81.method3274(local750);
					}
				} else if (local91 == 4) {
					local750 = Static21.method3453(local96);
					local139 = local687.anInt5492;
					local1108 = local687.anInt5495;
					local198 = local687.anInt5502;
					if (local750.anInt628 != local139 || local1108 != local750.anInt572 || local198 != local750.anInt571) {
						local750.anInt572 = local1108;
						local750.anInt571 = local198;
						local750.anInt628 = local139;
						Static81.method3274(local750);
					}
				} else if (local91 == 5) {
					local750 = Static21.method3453(local96);
					if (local687.anInt5492 != local750.anInt622 || local687.anInt5492 == -1) {
						local750.anInt576 = 1;
						local750.anInt632 = 0;
						local750.anInt578 = 0;
						local750.anInt622 = local687.anInt5492;
						Static81.method3274(local750);
					}
				} else if (local91 == 6) {
					local120 = local687.anInt5492;
					local139 = local120 >> 10 & 0x1F;
					local1108 = local120 >> 5 & 0x1F;
					local198 = local120 & 0x1F;
					local205 = (local198 << 3) + (local1108 << 11) + (local139 << 19);
					@Pc(1128) Class22 local1128 = Static21.method3453(local96);
					if (local1128.anInt585 != local205) {
						local1128.anInt585 = local205;
						Static81.method3274(local1128);
					}
				} else if (local91 == 7) {
					local750 = Static21.method3453(local96);
					@Pc(796) boolean local796 = local687.anInt5492 == 1;
					if (local796 != local750.aBoolean35) {
						local750.aBoolean35 = local796;
						Static81.method3274(local750);
					}
				} else if (local91 == 8) {
					local750 = Static21.method3453(local96);
					if (local687.anInt5492 != local750.anInt621 || local750.anInt617 != local687.anInt5495 || local687.anInt5502 != local750.anInt623) {
						local750.anInt623 = local687.anInt5502;
						if (local750.anInt553 != -1) {
							if (local750.anInt570 > 0) {
								local750.anInt623 = local750.anInt623 * 32 / local750.anInt570;
							} else if (local750.anInt600 > 0) {
								local750.anInt623 = local750.anInt623 * 32 / local750.anInt600;
							}
						}
						local750.anInt621 = local687.anInt5492;
						local750.anInt617 = local687.anInt5495;
						Static81.method3274(local750);
					}
				} else if (local91 == 9) {
					local750 = Static21.method3453(local96);
					if (local750.anInt553 != local687.anInt5492 || local687.anInt5495 != local750.anInt567) {
						local750.anInt567 = local687.anInt5495;
						local750.anInt553 = local687.anInt5492;
						Static81.method3274(local750);
					}
				} else if (local91 == 10) {
					local750 = Static21.method3453(local96);
					if (local750.anInt613 != local687.anInt5492 || local687.anInt5495 != local750.anInt584 || local687.anInt5502 != local750.anInt566) {
						local750.anInt566 = local687.anInt5502;
						local750.anInt584 = local687.anInt5495;
						local750.anInt613 = local687.anInt5492;
						Static81.method3274(local750);
					}
				} else if (local91 == 11) {
					local750 = Static21.method3453(local96);
					local750.anInt593 = local750.anInt608 = local687.anInt5495;
					local750.aByte2 = 0;
					local750.aByte4 = 0;
					local750.anInt569 = local750.anInt538 = local687.anInt5492;
					Static81.method3274(local750);
				} else if (local91 == 12) {
					local750 = Static21.method3453(local96);
					local139 = local687.anInt5492;
					if (local750 != null && local750.anInt542 == 0) {
						if (local750.anInt583 - local750.anInt602 < local139) {
							local139 = local750.anInt583 - local750.anInt602;
						}
						if (local139 < 0) {
							local139 = 0;
						}
						if (local139 != local750.anInt547) {
							local750.anInt547 = local139;
							Static81.method3274(local750);
						}
					}
				} else if (local91 == 13) {
					local750 = Static21.method3453(local96);
					local750.anInt575 = local687.anInt5492;
				}
			}
		}
		if (Static127.anInt2701 != 0) {
			Static126.anInt2697 += 20;
			if (Static126.anInt2697 >= 400) {
				Static127.anInt2701 = 0;
			}
		}
		Static16.anInt307++;
		if (Static287.aClass22_11 != null) {
			Static136.anInt2804++;
			if (Static136.anInt2804 >= 15) {
				Static81.method3274(Static287.aClass22_11);
				Static287.aClass22_11 = null;
			}
		}
		@Pc(1359) Class22 local1359;
		if (Static24.aClass22_2 != null) {
			Static81.method3274(Static24.aClass22_2);
			Static34.anInt678++;
			if (Static72.anInt1326 > Static36.anInt715 + 5 || Static72.anInt1326 < Static36.anInt715 - 5 || Static117.anInt2589 > Static31.anInt635 + 5 || Static31.anInt635 - 5 > Static117.anInt2589) {
				Static141.aBoolean190 = true;
			}
			if (Static71.anInt1316 == 0) {
				if (Static141.aBoolean190 && Static34.anInt678 >= 5) {
					if (Static276.aClass22_20 == Static24.aClass22_2 && Static65.anInt1223 != Static280.anInt5321) {
						@Pc(1357) byte local1357 = 0;
						local1359 = Static24.aClass22_2;
						if (Static165.anInt3293 == 1 && local1359.anInt612 == 206) {
							local1357 = 1;
						}
						if (local1359.anIntArray63[Static280.anInt5321] <= 0) {
							local1357 = 0;
						}
						if (Static40.method681(local1359).method2832()) {
							local120 = Static65.anInt1223;
							local139 = Static280.anInt5321;
							local1359.anIntArray63[local139] = local1359.anIntArray63[local120];
							local1359.anIntArray56[local139] = local1359.anIntArray56[local120];
							local1359.anIntArray63[local120] = -1;
							local1359.anIntArray56[local120] = 0;
						} else if (local1357 == 1) {
							local120 = Static65.anInt1223;
							local139 = Static280.anInt5321;
							while (local120 != local139) {
								if (local120 > local139) {
									local1359.method469(local120 - 1, local120);
									local120--;
								} else if (local139 > local120) {
									local1359.method469(local120 + 1, local120);
									local120++;
								}
							}
						} else {
							local1359.method469(Static280.anInt5321, Static65.anInt1223);
						}
						Static142.aClass4_Sub17_Sub1_3.method1905(11);
						Static142.aClass4_Sub17_Sub1_3.method1897(Static65.anInt1223);
						Static142.aClass4_Sub17_Sub1_3.method1893(Static24.aClass22_2.anInt596);
						Static142.aClass4_Sub17_Sub1_3.method1861(local1357);
						Static142.aClass4_Sub17_Sub1_3.method1875(Static280.anInt5321);
					}
				} else if ((Static76.anInt1445 == 1 || Static87.method1401(Static60.anInt1152 - 1)) && Static60.anInt1152 > 2) {
					Static145.method2346();
				} else if (Static60.anInt1152 > 0) {
					Static120.method2045();
				}
				Static44.anInt885 = 0;
				Static24.aClass22_2 = null;
				Static136.anInt2804 = 10;
			}
		}
		Static136.aBoolean187 = false;
		Static298.anInt5539 = 0;
		local1359 = Static126.aClass22_12;
		Static68.aClass22_7 = null;
		Static247.aBoolean304 = false;
		@Pc(1504) Class22 local1504 = Static41.aClass22_5;
		Static41.aClass22_5 = null;
		Static126.aClass22_12 = null;
		while (Static185.method2900() && Static298.anInt5539 < 128) {
			Static80.anIntArray167[Static298.anInt5539] = Static28.anInt525;
			Static137.anIntArray252[Static298.anInt5539] = Static69.aChar1;
			Static298.anInt5539++;
		}
		Static138.aClass22_13 = null;
		if (Static25.anInt448 != -1) {
			Static241.method3693(0, 0, Static25.anInt448, Static111.anInt2450, 0, 0, Static216.anInt4287);
		}
		Static177.anInt3485++;
		while (true) {
			@Pc(1573) Class22 local1573;
			@Pc(1561) Class22 local1561;
			@Pc(1554) Class4_Sub22 local1554;
			do {
				local1554 = (Class4_Sub22) Static198.aClass10_25.method182();
				if (local1554 == null) {
					while (true) {
						do {
							local1554 = (Class4_Sub22) Static257.aClass10_54.method182();
							if (local1554 == null) {
								while (true) {
									do {
										local1554 = (Class4_Sub22) Static243.aClass10_52.method182();
										if (local1554 == null) {
											if (Static138.aClass22_13 == null) {
												Static277.anInt5174 = 0;
											}
											if (Static45.aClass22_6 != null) {
												Static210.method3349();
											}
											if (Static176.anInt829 > 0 && Static96.aBooleanArray15[82] && Static96.aBooleanArray15[81] && Static44.anInt887 != 0) {
												local120 = Static210.anInt4103 - Static44.anInt887;
												if (local120 < 0) {
													local120 = 0;
												} else if (local120 > 3) {
													local120 = 3;
												}
												Static213.method3420(Static239.aClass12_Sub3_Sub2_2.anIntArray379[0] + Static239.anInt4613, Static239.aClass12_Sub3_Sub2_2.anIntArray376[0] + Static170.anInt3385, local120);
											}
											if (Static176.anInt829 > 0 && Static96.aBooleanArray15[82] && Static96.aBooleanArray15[81]) {
												if (Static173.anInt3434 != -1) {
													Static213.method3420(Static239.anInt4613 + Static247.anInt4704, Static173.anInt3434 + Static170.anInt3385, Static210.anInt4103);
												}
												Static34.anInt671 = 0;
												Static261.anInt4958 = 0;
											} else if (Static261.anInt4958 == 2) {
												if (Static173.anInt3434 != -1) {
													Static142.aClass4_Sub17_Sub1_3.method1905(251);
													Static142.aClass4_Sub17_Sub1_3.method1875(Static173.anInt3434 + Static170.anInt3385);
													Static142.aClass4_Sub17_Sub1_3.method1897(Static161.anInt3204);
													Static142.aClass4_Sub17_Sub1_3.method1876(Static247.anInt4704 + Static239.anInt4613);
													Static142.aClass4_Sub17_Sub1_3.method1893(Static52.anInt1044);
													Static237.anInt4589 = Static35.anInt708;
													Static145.anInt2968 = Static147.anInt2993;
													Static127.anInt2701 = 1;
													Static126.anInt2697 = 0;
												}
												Static261.anInt4958 = 0;
											} else if (Static34.anInt671 == 2) {
												if (Static173.anInt3434 != -1) {
													Static142.aClass4_Sub17_Sub1_3.method1905(232);
													Static142.aClass4_Sub17_Sub1_3.method1897(Static247.anInt4704 + Static239.anInt4613);
													Static142.aClass4_Sub17_Sub1_3.method1876(Static170.anInt3385 + Static173.anInt3434);
													Static145.anInt2968 = Static147.anInt2993;
													Static126.anInt2697 = 0;
													Static127.anInt2701 = 1;
													Static237.anInt4589 = Static35.anInt708;
												}
												Static34.anInt671 = 0;
											} else if (Static173.anInt3434 != -1 && Static261.anInt4958 == 0 && Static34.anInt671 == 0) {
												Static94.method1516((Static173.anInt3434 << 1) - (Static239.aClass12_Sub3_Sub2_2.method3375() - 1) >> 1, 0, (Static247.anInt4704 << 1) + 1 - Static239.aClass12_Sub3_Sub2_2.method3375() >> 1);
												Static127.anInt2701 = 1;
												Static145.anInt2968 = Static147.anInt2993;
												Static237.anInt4589 = Static35.anInt708;
												Static126.anInt2697 = 0;
											}
											Static173.anInt3434 = -1;
											Static176.method652();
											if (local1359 != Static126.aClass22_12) {
												if (local1359 != null) {
													Static81.method3274(local1359);
												}
												if (Static126.aClass22_12 != null) {
													Static81.method3274(Static126.aClass22_12);
												}
											}
											if (local1504 != Static41.aClass22_5 && Static278.anInt5194 == Static201.anInt3923) {
												if (local1504 != null) {
													Static81.method3274(local1504);
												}
												if (Static41.aClass22_5 != null) {
													Static81.method3274(Static41.aClass22_5);
												}
											}
											if (Static41.aClass22_5 == null) {
												if (Static278.anInt5194 > 0) {
													Static278.anInt5194--;
												}
											} else if (Static278.anInt5194 < Static201.anInt3923) {
												Static278.anInt5194++;
												if (Static278.anInt5194 == Static201.anInt3923) {
													Static81.method3274(Static41.aClass22_5);
												}
											}
											for (local120 = 0; local120 < 5; local120++) {
												@Pc(2007) int local2007 = Static89.anIntArray196[local120]++;
											}
											local120 = Static169.method2664();
											local139 = Static22.method369();
											if (local120 > 15000 && local139 > 15000) {
												Static117.anInt2592 = 250;
												Static297.method4363(14500);
												Static142.aClass4_Sub17_Sub1_3.method1905(229);
											}
											if (Static119.aClass123_3 != null && Static119.aClass123_3.anInt3791 == 1) {
												if (Static119.aClass123_3.anObject4 != null) {
													Static275.method4103(Static86.aString52, Static55.aBoolean81);
												}
												Static119.aClass123_3 = null;
												Static86.aString52 = null;
												Static55.aBoolean81 = false;
											}
											Static72.anInt1320++;
											Static89.anInt1838++;
											Static137.anInt2809++;
											if (Static72.anInt1320 > 500) {
												Static72.anInt1320 = 0;
												local1108 = (int) (Math.random() * 8.0D);
												if ((local1108 & 0x4) == 4) {
													Static73.anInt1335 += Static28.anInt528;
												}
												if ((local1108 & 0x2) == 2) {
													Static32.anInt637 += Static84.anInt1700;
												}
												if ((local1108 & 0x1) == 1) {
													Static190.anInt3790 += Static265.anInt4985;
												}
											}
											if (Static190.anInt3790 < -50) {
												Static265.anInt4985 = 2;
											}
											if (Static137.anInt2809 > 500) {
												local1108 = (int) (Math.random() * 8.0D);
												if ((local1108 & 0x1) == 1) {
													Static113.anInt2470 += Static7.anInt177;
												}
												if ((local1108 & 0x2) == 2) {
													Static44.anInt879 += Static141.anInt2892;
												}
												Static137.anInt2809 = 0;
											}
											if (Static44.anInt879 < -20) {
												Static141.anInt2892 = 1;
											}
											if (Static44.anInt879 > 10) {
												Static141.anInt2892 = -1;
											}
											if (Static73.anInt1335 < -40) {
												Static28.anInt528 = 1;
											}
											if (Static113.anInt2470 < -60) {
												Static7.anInt177 = 2;
											}
											if (Static32.anInt637 < -55) {
												Static84.anInt1700 = 2;
											}
											if (Static73.anInt1335 > 40) {
												Static28.anInt528 = -1;
											}
											if (Static32.anInt637 > 55) {
												Static84.anInt1700 = -2;
											}
											if (Static190.anInt3790 > 50) {
												Static265.anInt4985 = -2;
											}
											if (Static113.anInt2470 > 60) {
												Static7.anInt177 = -2;
											}
											if (Static89.anInt1838 > 50) {
												Static142.aClass4_Sub17_Sub1_3.method1905(6);
											}
											if (Static187.aBoolean243) {
												Static283.method4252();
												Static187.aBoolean243 = false;
											}
											try {
												if (Static259.aClass158_3 != null && Static142.aClass4_Sub17_Sub1_3.anInt2400 > 0) {
													Static259.aClass158_3.method3780(Static142.aClass4_Sub17_Sub1_3.aByteArray30, Static142.aClass4_Sub17_Sub1_3.anInt2400);
													Static89.anInt1838 = 0;
													Static142.aClass4_Sub17_Sub1_3.anInt2400 = 0;
												}
											} catch (@Pc(2268) IOException local2268) {
												Static278.method4129();
											}
											return;
										}
										local1561 = local1554.aClass22_15;
										if (local1561.anInt561 < 0) {
											break;
										}
										local1573 = Static21.method3453(local1561.anInt587);
									} while (local1573 == null || local1573.aClass22Array1 == null || local1561.anInt561 >= local1573.aClass22Array1.length || local1561 != local1573.aClass22Array1[local1561.anInt561]);
									Static125.method2089(local1554);
								}
							}
							local1561 = local1554.aClass22_15;
							if (local1561.anInt561 < 0) {
								break;
							}
							local1573 = Static21.method3453(local1561.anInt587);
						} while (local1573 == null || local1573.aClass22Array1 == null || local1573.aClass22Array1.length <= local1561.anInt561 || local1561 != local1573.aClass22Array1[local1561.anInt561]);
						Static125.method2089(local1554);
					}
				}
				local1561 = local1554.aClass22_15;
				if (local1561.anInt561 < 0) {
					break;
				}
				local1573 = Static21.method3453(local1561.anInt587);
			} while (local1573 == null || local1573.aClass22Array1 == null || local1573.aClass22Array1.length <= local1561.anInt561 || local1561 != local1573.aClass22Array1[local1561.anInt561]);
			Static125.method2089(local1554);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3440(@OriginalArg(1) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static80.aStringArray10.length; local12++) {
			if (Static80.aStringArray10[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
	public static void method3441() {
		aClass97_18 = null;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
	public static void method3442() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 104; local9++) {
			for (@Pc(18) int local18 = 0; local18 < 104; local18++) {
				if (Static55.method879(true, Static127.aClass4_Sub11ArrayArrayArray1, local9, local7, local18)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
