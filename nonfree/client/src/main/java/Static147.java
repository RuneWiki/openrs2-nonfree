import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!hi", name = "C", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_56 = new Class83("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!hi", name = "D", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_57 = new Class83("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!hi", name = "G", descriptor = "Z")
	public static boolean aBoolean263 = true;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method2458(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static49.anInt2346; local11++) {
			if (arg0.equalsIgnoreCase(Static194.aStringArray14[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static1.aClass16_Sub1_Sub5_Sub1_1.aString44);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IC)C")
	public static char method2459(@OriginalArg(1) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII[Lclient!uu;IIIII)V")
	public static void method2460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class247[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static122.aClass19_16.OA(arg5, arg0, arg1, arg7);
		for (@Pc(17) int local17 = 0; local17 < arg4.length; local17++) {
			@Pc(23) Class247 local23 = arg4[local17];
			if (local23 != null && (arg6 == local23.anInt6850 || arg6 == -1412584499 && local23 == Static281.aClass247_12)) {
				@Pc(46) int local46;
				if (arg3 == -1) {
					Class4_Sub6_Sub23.aRectangleArray1[Static229.anInt4407].setBounds(arg8 + local23.anInt6836, local23.anInt6859 + arg2, local23.anInt6833, local23.anInt6805);
					local46 = Static229.anInt4407++;
				} else {
					local46 = arg3;
				}
				local23.anInt6798 = Static24.anInt5323;
				local23.anInt6852 = local46;
				if (!Static53.method895(local23)) {
					if (local23.anInt6842 != 0) {
						Static96.method1681(local23);
					}
					@Pc(90) int local90 = local23.anInt6836 + arg8;
					@Pc(95) int local95 = arg2 + local23.anInt6859;
					@Pc(98) int local98 = local23.anInt6851;
					if (Static415.aBoolean626 && (Static53.method900(local23).anInt5105 != 0 || local23.anInt6840 == 0) && local98 > 127) {
						local98 = 127;
					}
					@Pc(148) int local148;
					@Pc(154) int local154;
					if (local23 == Static281.aClass247_12) {
						if (arg6 != -1412584499 && (Static381.anInt6419 == local23.anInt6777 || local23.anInt6777 == Static272.anInt5106)) {
							Static166.aClass247Array1 = arg4;
							Static258.anInt4823 = arg2;
							Static151.anInt3054 = arg8;
							continue;
						}
						if (Static15.aBoolean22 && Static390.aBoolean584) {
							local148 = Static420.aClass80_1.method2234();
							local154 = Static420.aClass80_1.method2230();
							local148 -= Static187.anInt3559;
							local154 -= Static452.anInt7359;
							if (local148 < Static455.anInt5535) {
								local148 = Static455.anInt5535;
							}
							if (local23.anInt6833 + local148 > Static455.anInt5535 + Static57.aClass247_1.anInt6833) {
								local148 = Static57.aClass247_1.anInt6833 + Static455.anInt5535 - local23.anInt6833;
							}
							if (Static373.anInt6383 > local154) {
								local154 = Static373.anInt6383;
							}
							local90 = local148;
							if (Static57.aClass247_1.anInt6805 + Static373.anInt6383 < local154 - -local23.anInt6805) {
								local154 = Static57.aClass247_1.anInt6805 + Static373.anInt6383 - local23.anInt6805;
							}
							local95 = local154;
						}
						if (Static272.anInt5106 == local23.anInt6777) {
							local98 = 128;
						}
					}
					@Pc(234) int local234;
					@Pc(232) int local232;
					@Pc(244) int local244;
					@Pc(249) int local249;
					if (local23.anInt6840 == 2) {
						local154 = arg0;
						local232 = arg7;
						local234 = arg1;
						local148 = arg5;
					} else {
						local244 = local90 + local23.anInt6833;
						local249 = local23.anInt6805 + local95;
						if (local23.anInt6840 == 9) {
							local249++;
							local244++;
						}
						local148 = local90 <= arg5 ? arg5 : local90;
						local154 = local95 <= arg0 ? arg0 : local95;
						local234 = arg1 > local244 ? local244 : arg1;
						local232 = arg7 <= local249 ? arg7 : local249;
					}
					if (local234 > local148 && local154 < local232) {
						@Pc(555) int local555;
						@Pc(581) int local581;
						@Pc(583) int local583;
						@Pc(505) int local505;
						@Pc(507) int local507;
						if (local23.anInt6842 != 0) {
							if (Static21.anInt295 == local23.anInt6842 || Static38.anInt671 == local23.anInt6842) {
								Static407.method5247(local90, local23.anInt6833, Static38.anInt671 == local23.anInt6842, local95, local23.anInt6805);
								Static416.aBooleanArray21[local46] = true;
								Static122.aClass19_16.OA(arg5, arg0, arg1, arg7);
								continue;
							}
							if (Static155.anInt3645 == local23.anInt6842) {
								if (local23.method5312(Static122.aClass19_16) != null) {
									Static159.method2701();
									Static450.method5661(local23, local90, local95, Static122.aClass19_16);
									Static263.aBooleanArray15[local46] = true;
									Static122.aClass19_16.OA(arg5, arg0, arg1, arg7);
								}
								continue;
							}
							if (local23.anInt6842 == Static283.anInt5185) {
								if (local23.method5312(Static122.aClass19_16) != null) {
									Static331.method4515(local90, local95, local23);
									Static263.aBooleanArray15[local46] = true;
									Static122.aClass19_16.OA(arg5, arg0, arg1, arg7);
								}
								continue;
							}
							if (Static329.anInt5689 == local23.anInt6842) {
								Static315.method4208(local90, local23.anInt6833, Static80.anInterface7_3, Static122.aClass19_16, local23.anInt6805, local95);
								Static416.aBooleanArray21[local46] = true;
								Static122.aClass19_16.OA(arg5, arg0, arg1, arg7);
								continue;
							}
							if (Static186.anInt3548 == local23.anInt6842) {
								Static66.method4399(local23.anInt6833, Static122.aClass19_16, local90, local95, local23.anInt6805);
								Static416.aBooleanArray21[local46] = true;
								Static122.aClass19_16.OA(arg5, arg0, arg1, arg7);
								continue;
							}
							if (Static281.anInt5183 == local23.anInt6842) {
								if (!Static325.aBoolean507 && !Static437.aBoolean477) {
									continue;
								}
								local244 = local90 + local23.anInt6833;
								local249 = local95 + 15;
								if (Static325.aBoolean507) {
									Static207.aClass46_9.method5059("Fps:" + Static213.anInt3956, local249, -256, local244);
									local249 += 15;
									@Pc(495) Runtime local495 = Runtime.getRuntime();
									local505 = (int) ((local495.totalMemory() - local495.freeMemory()) / 1024L);
									local507 = -256;
									if (local505 > 65536) {
										local507 = -65536;
									}
									Static207.aClass46_9.method5059("Mem:" + local505 + "k", local249, local507, local244);
									local249 += 15;
									Static207.aClass46_9.method5059("In:" + Static55.anInt1020 + "B/s Out:" + Static449.anInt7316 + "B/s", local249, -256, local244);
									local249 += 15;
									local555 = Static122.aClass19_16.IA() / 1024;
									Static207.aClass46_9.method5059("Offheap:" + local555 + "k", local249, local555 <= 65536 ? -256 : -65536, local244);
									local249 += 15;
									local581 = 0;
									local583 = 0;
									@Pc(585) int local585 = 0;
									for (@Pc(587) int local587 = 0; local587 < 30; local587++) {
										local581 += Static119.aClass143_Sub1Array1[local587].method3517();
										local583 += Static119.aClass143_Sub1Array1[local587].method3527();
										local585 += Static119.aClass143_Sub1Array1[local587].method3521();
									}
									@Pc(625) int local625 = local585 * 100 / local581;
									@Pc(631) int local631 = local583 * 10000 / local581;
									@Pc(651) String local651 = "Cache:" + Static343.method748(true, (long) local631, 2, 0) + "% (" + local625 + "%)";
									Static43.aClass46_12.method5059(local651, local249, -256, local244);
									local249 += 12;
								}
								if (Static435.anInt7099 > 0) {
									Static43.aClass46_12.method5059("Particles: " + Static275.anInt5137 + " / " + Static435.anInt7099, local249, -256, local244);
								}
								local249 += 12;
								if (Static437.aBoolean477) {
									Static43.aClass46_12.method5059("Polys: " + Static122.aClass19_16.ZA() + " Models: " + Static122.aClass19_16.w(), local249, -256, local244);
									local249 += 12;
									Static43.aClass46_12.method5059("Ls: " + Static236.anInt4491 + " La: " + Static308.anInt5410 + " NPC: " + Static412.anInt6770 + " Pl: " + Static28.anInt464, local249, -256, local244);
									local249 += 12;
									Static47.method768();
								}
								Static416.aBooleanArray21[local46] = true;
								continue;
							}
						}
						if (local23.anInt6840 == 0) {
							if (local23.anInt6842 == Static342.anInt5893 && Static122.aClass19_16.method4301()) {
								Static122.aClass19_16.method4294(local90, local95, local23.anInt6833, local23.anInt6805);
							}
							method2460(local154, local234, local95 - local23.anInt6849, local46, arg4, local148, local23.anInt6809, local232, local90 - local23.anInt6825);
							if (local23.aClass247Array2 != null) {
								method2460(local154, local234, local95 - local23.anInt6849, local46, local23.aClass247Array2, local148, local23.anInt6809, local232, local90 - local23.anInt6825);
							}
							@Pc(815) Class4_Sub43 local815 = (Class4_Sub43) Static325.aClass102_29.method2700((long) local23.anInt6809);
							if (local815 != null) {
								Static11.method123(local148, local46, local154, local234, local815.anInt6979, local232, local90, local95);
							}
							if (Static342.anInt5893 == local23.anInt6842 && Static122.aClass19_16.method4301()) {
								Static122.aClass19_16.method4278();
								Static401.aBoolean600 = true;
							}
							Static122.aClass19_16.OA(arg5, arg0, arg1, arg7);
						}
						if (Static65.aBooleanArray9[local46] || Static293.anInt5286 > 1) {
							if (local23.anInt6840 == 3) {
								if (local98 == 0) {
									if (local23.aBoolean618) {
										Static122.aClass19_16.O(local90, local95, local23.anInt6833, local23.anInt6805, local23.anInt6772, 0);
									} else {
										Static122.aClass19_16.method4312(local90, local95, local23.anInt6833, local23.anInt6805, local23.anInt6772, 0);
									}
								} else if (local23.aBoolean618) {
									Static122.aClass19_16.O(local90, local95, local23.anInt6833, local23.anInt6805, local23.anInt6772 & 0xFFFFFF | 255 - (local98 & 0xFF) << 24, 1);
								} else {
									Static122.aClass19_16.method4312(local90, local95, local23.anInt6833, local23.anInt6805, 255 - (local98 & 0xFF) << 24 | local23.anInt6772 & 0xFFFFFF, 1);
								}
							} else if (local23.anInt6840 == 4) {
								@Pc(960) Class46 local960 = local23.method5310(Static122.aClass19_16);
								if (local960 != null) {
									local249 = local23.anInt6772;
									@Pc(975) String local975 = local23.aString67;
									if (local23.anInt6779 != -1) {
										@Pc(986) Class211 local986 = Static444.aClass206_3.method4703(local23.anInt6779);
										local975 = local986.aString61;
										if (local975 == null) {
											local975 = "null";
										}
										if ((local986.anInt6164 == 1 || local23.anInt6832 != 1) && local23.anInt6832 != -1) {
											local975 = "<col=ff9040>" + local975 + "</col> x" + Static421.method5388(local23.anInt6832);
										}
									}
									if (Static304.aClass247_16 == local23) {
										local975 = Static154.aClass83_26.method2267(Static178.anInt3423);
										local249 = local23.anInt6772;
									}
									if (Static449.aBoolean688) {
										Static122.aClass19_16.fa(local90, local95, local90 + local23.anInt6833, local23.anInt6805 + local95);
									}
									local960.method5048(local90, local23.anInt6805, 255 - (local98 & 0xFF) << 24 | local249, Static429.aClass57Array18, null, local23.aBoolean615 ? 255 - (local98 & 0xFF) << 24 : -1, local23.anInt6853, 0, 0, local23.anInt6803, local975, local95, local23.anInt6817, null, local23.anInt6838, local23.anInt6833);
									if (Static449.aBoolean688) {
										Static122.aClass19_16.OA(arg5, arg0, arg1, arg7);
									}
								} else if (Static10.aBoolean15) {
									Static63.method1142(local23);
								}
							} else {
								@Pc(1158) int local1158;
								if (local23.anInt6840 == 5) {
									if (local23.anInt6780 < 0) {
										@Pc(1143) Class57 local1143;
										if (local23.anInt6779 == -1) {
											local1143 = local23.method5300(Static122.aClass19_16);
										} else {
											@Pc(1125) Class37 local1125 = local23.aBoolean613 ? Static1.aClass16_Sub1_Sub5_Sub1_1.aClass37_1 : null;
											local1143 = Static444.aClass206_3.method4700(Static122.aClass19_16, local23.anInt6779, local1125, local23.anInt6828, local23.anInt6832, local23.anInt6831, local23.anInt6778 | 0xFF000000);
										}
										if (local1143 != null) {
											local249 = local1143.j();
											local1158 = local1143.T();
											local505 = (local23.anInt6772 == 0 ? 16777215 : local23.anInt6772 & 0xFFFFFF) | 255 - (local98 & 0xFF) << 24;
											if (local23.aBoolean621) {
												Static122.aClass19_16.fa(local90, local95, local23.anInt6833 + local90, local95 + local23.anInt6805);
												if (local23.anInt6818 != 0) {
													local507 = (local249 + local23.anInt6833 - 1) / local249;
													local555 = (local1158 + local23.anInt6805 - 1) / local1158;
													for (local581 = 0; local581 < local507; local581++) {
														for (local583 = 0; local583 < local555; local583++) {
															if (local23.anInt6772 == 0) {
																local1143.method5541((float) local249 / 2.0F + (float) (local249 * local581 + local90), (float) local1158 / 2.0F + (float) (local95 - -(local583 * local1158)), 4096, local23.anInt6818);
															} else {
																local1143.method5536((float) (local90 + local581 * local249) + (float) local249 / 2.0F, (float) local1158 / 2.0F + (float) (local1158 * local583 + local95), 4096, local23.anInt6818, local505);
															}
														}
													}
												} else if (local23.anInt6772 == 0 && local98 == 0) {
													local1143.method5539(local90, local95, local23.anInt6833, local23.anInt6805);
												} else {
													local1143.JA(local90, local95, local23.anInt6833, local23.anInt6805, 0, local505, 1);
												}
												Static122.aClass19_16.OA(arg5, arg0, arg1, arg7);
											} else if (local23.anInt6772 == 0 && local98 == 0) {
												if (local23.anInt6818 != 0) {
													local1143.method5541((float) local23.anInt6833 / 2.0F + (float) local90, (float) local23.anInt6805 / 2.0F + (float) local95, local23.anInt6833 * 4096 / local249, local23.anInt6818);
												} else if (local249 == local23.anInt6833 && local23.anInt6805 == local1158) {
													local1143.method5534(local90, local95);
												} else {
													local1143.method5537(local90, local95, local23.anInt6833, local23.anInt6805);
												}
											} else if (local23.anInt6818 != 0) {
												local1143.method5536((float) local90 + (float) local23.anInt6833 / 2.0F, (float) local23.anInt6805 / 2.0F + (float) local95, local23.anInt6833 * 4096 / local249, local23.anInt6818, local505);
											} else if (local23.anInt6833 == local249 && local1158 == local23.anInt6805) {
												local1143.r(local90, local95, 0, local505, 1);
											} else {
												local1143.s(local90, local95, local23.anInt6833, local23.anInt6805, 0, local505, 1);
											}
										} else if (Static10.aBoolean15) {
											Static63.method1142(local23);
										}
									} else {
										local23.method5311(Static238.aClass226_1, Static296.aClass217_1).method5255(0, local90, local95, local23.anInt6860 << 3, local23.anInt6812 << 3, Static122.aClass19_16, local23.anInt6833, 0, local23.anInt6805);
									}
								} else if (local23.anInt6840 == 6) {
									Static305.method4123();
									@Pc(1532) Class110 local1532 = null;
									local249 = 0;
									@Pc(1637) Class138 local1637;
									@Pc(1647) Class37 local1647;
									if (local23.anInt6779 != -1) {
										@Pc(1745) Class211 local1745 = Static444.aClass206_3.method4703(local23.anInt6779);
										if (local1745 != null) {
											local1745 = local1745.method4788(local23.anInt6832);
											local1637 = local23.anInt6788 == -1 ? null : Static182.aClass55_1.method1397(local23.anInt6788);
											local1647 = local23.aBoolean613 ? Static1.aClass16_Sub1_Sub5_Sub1_1.aClass37_1 : null;
											local1532 = local1745.method4773(local23.anInt6829, 1, local1637, 2048, local23.anInt6783, local1647, local23.anInt6815, Static122.aClass19_16);
											if (local1532 == null) {
												Static63.method1142(local23);
											} else {
												local249 = -local1532.MA() >> 1;
											}
										}
									} else if (local23.anInt6796 == 5) {
										local1158 = local23.anInt6781;
										if (local1158 >= 0 && local1158 < 2048) {
											@Pc(1685) Class16_Sub1_Sub5_Sub1 local1685 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local1158];
											@Pc(1698) Class138 local1698 = local23.anInt6788 == -1 ? null : Static182.aClass55_1.method1397(local23.anInt6788);
											if (local1685 != null && (local1158 == Static207.anInt5452 || Static130.method2302(local1685.aString44) == local23.anInt6848)) {
												local1532 = local1685.aClass37_1.method833(Static222.aClass249_1, Static420.aClass109_2, null, 2048, null, Static329.aClass240_1, local23.anInt6783, local23.anInt6815, local1698, Static182.aClass55_1, -1, 0, Static122.aClass19_16, Static444.aClass206_3, 0, Static257.aClass114_1, local23.anInt6829);
											}
										}
									} else if (local23.anInt6796 == 8 || local23.anInt6796 == 9) {
										@Pc(1625) Class4_Sub25 local1625 = Static175.method2834(false, local23.anInt6781);
										local1637 = local23.anInt6788 == -1 ? null : Static182.aClass55_1.method1397(local23.anInt6788);
										if (local1625 != null) {
											local1647 = local23.aBoolean613 ? Static1.aClass16_Sub1_Sub5_Sub1_1.aClass37_1 : null;
											local1532 = local1625.method2929(local23.anInt6796 == 9, local23.anInt6783, local1637, local23.anInt6829, local23.anInt6848, local1647, local23.anInt6815, Static122.aClass19_16);
										}
									} else if (local23.anInt6788 == -1) {
										local1532 = local23.method5307(Static444.aClass206_3, Static122.aClass19_16, Static329.aClass240_1, Static1.aClass16_Sub1_Sub5_Sub1_1.aClass37_1, Static182.aClass55_1, 2048, null, -1, Static420.aClass109_2, -1, Static257.aClass114_1, 0, Static222.aClass249_1);
										if (local1532 == null && Static10.aBoolean15) {
											Static63.method1142(local23);
										}
									} else {
										@Pc(1588) Class138 local1588 = Static182.aClass55_1.method1397(local23.anInt6788);
										local1532 = local23.method5307(Static444.aClass206_3, Static122.aClass19_16, Static329.aClass240_1, Static1.aClass16_Sub1_Sub5_Sub1_1.aClass37_1, Static182.aClass55_1, 2048, local1588, local23.anInt6815, Static420.aClass109_2, local23.anInt6783, Static257.aClass114_1, local23.anInt6829, Static222.aClass249_1);
										if (local1532 == null && Static10.aBoolean15) {
											Static63.method1142(local23);
										}
									}
									if (local1532 != null) {
										if (local23.anInt6822 <= 0) {
											local1158 = 512;
										} else {
											local1158 = (local23.anInt6833 << 9) / local23.anInt6822;
										}
										if (local23.anInt6792 > 0) {
											local505 = (local23.anInt6805 << 9) / local23.anInt6792;
										} else {
											local505 = 512;
										}
										local507 = local23.anInt6833 / 2 + local90 + (local23.anInt6846 * local1158 >> 9);
										local555 = local23.anInt6805 / 2 + local95 + (local505 * local23.anInt6793 >> 9);
										Static111.aClass31_1.xa();
										Static122.aClass19_16.ea(Static111.aClass31_1);
										Static122.aClass19_16.H(local507, local555, local1158, local505);
										Static122.aClass19_16.g((float) (local23.anInt6782 << 0), local23.aBoolean620 ? (float) (local23.anInt6862 << 0) : (float) (local23.anInt6862 << 0) * 1.5F);
										if (arg6 == -1412584499 || Static401.aBoolean600) {
											Static122.aClass19_16.e();
											Static122.aClass19_16.method4266();
											Static122.aClass19_16.OA(arg5, arg0, arg1, arg7);
											Static401.aBoolean600 = false;
										}
										if (local23.aBoolean619) {
											Static122.aClass19_16.method4309(false);
										}
										local581 = (local23.anInt6857 << 0) * Class50_Sub1.anIntArray225[local23.anInt6844 << 3] >> 15;
										local583 = (local23.anInt6857 << 0) * Class50_Sub1.anIntArray224[local23.anInt6844 << 3] >> 15;
										Static247.aClass31_2.O(-local23.anInt6843 << 3);
										Static247.aClass31_2.ja(local23.anInt6858 << 3);
										Static247.aClass31_2.o(local23.anInt6814 << 0, local249 + local581 + (local23.anInt6826 << 0), local583 - -(local23.anInt6826 << 0));
										Static247.aClass31_2.ka(local23.anInt6844 << 3);
										if (Static449.aBoolean688) {
											Static122.aClass19_16.fa(local90, local95, local23.anInt6833 + local90, local23.anInt6805 + local95);
										}
										if (local23.aBoolean620) {
											local1532.method4880(Static247.aClass31_2, null, local23.anInt6857 << 0);
										} else {
											local1532.method4889(Static247.aClass31_2, null, 1);
										}
										if (Static449.aBoolean688) {
											Static122.aClass19_16.OA(arg5, arg0, arg1, arg7);
										}
										if (local23.aBoolean619) {
											Static122.aClass19_16.method4309(true);
										}
										Static122.aClass19_16.g(0.0F, 0.0F);
									}
								} else if (local23.anInt6840 == 9) {
									if (local23.aBoolean610) {
										local1158 = local23.anInt6833 + local90;
										local505 = local95;
										local249 = local23.anInt6805 + local95;
									} else {
										local505 = local23.anInt6805 + local95;
										local1158 = local90 + local23.anInt6833;
										local249 = local95;
									}
									if (local23.anInt6794 == 1) {
										Static122.aClass19_16.method4302(local90, local249, local1158, local505, local23.anInt6772, 0);
									} else {
										Static122.aClass19_16.method4253(local90, local249, local1158, local505, local23.anInt6772, local23.anInt6794);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(Z)V")
	public static void method2462() {
		Static109.anInt6886 = 0;
		Static86.aClass269Array1 = new Class269[50];
	}
}
