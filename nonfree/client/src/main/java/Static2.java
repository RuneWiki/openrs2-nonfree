import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_1 = new Class208(81, 0);

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "Lclient!vp;")
	public static final Class2_Sub45 aClass2_Sub45_1 = new Class2_Sub45(0, -1);

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "[Lclient!ph;")
	public static final Class197[] aClass197Array1 = new Class197[6];

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
	public static void method28(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static5.aFloat87 = 3.0F;
		} else if (arg0 == 50) {
			Static5.aFloat87 = 4.0F;
		} else if (arg0 == 75) {
			Static5.aFloat87 = 6.0F;
		} else if (arg0 == 100) {
			Static5.aFloat87 = 8.0F;
		} else if (arg0 == 200) {
			Static5.aFloat87 = 16.0F;
		}
		Static227.anInt3810 = -1;
		Static227.anInt3810 = -1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)Z")
	public static boolean method31(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)Z")
	public static boolean method32() throws IOException {
		if (Static339.aClass66_2 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static117.aClass25_55 == null) {
			if (Static220.aBoolean247) {
				if (!Static339.aClass66_2.method1390(1)) {
					return false;
				}
				Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, 1);
				Static220.aBoolean247 = false;
				Static434.anInt7319 = 0;
				Static124.anInt2078++;
			}
			Static202.aClass2_Sub17_Sub1_1.anInt7523 = 0;
			if (Static202.aClass2_Sub17_Sub1_1.method5586()) {
				if (!Static339.aClass66_2.method1390(1)) {
					return false;
				}
				Static339.aClass66_2.method1394(1, Static202.aClass2_Sub17_Sub1_1.aByteArray94, 1);
				Static434.anInt7319 = 0;
				Static124.anInt2078++;
			}
			Static220.aBoolean247 = true;
			@Pc(69) Class25[] local69 = Static451.method5756();
			local73 = Static202.aClass2_Sub17_Sub1_1.method5578();
			if (local73 < 0 || local69.length <= local73) {
				throw new IOException("invo:" + local73 + " ip:" + Static202.aClass2_Sub17_Sub1_1.anInt7523);
			}
			Static117.aClass25_55 = local69[local73];
			Static302.anInt5465 = Static117.aClass25_55.anInt500;
		}
		if (Static302.anInt5465 == -1) {
			if (!Static339.aClass66_2.method1390(1)) {
				return false;
			}
			Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, 1);
			Static434.anInt7319 = 0;
			Static302.anInt5465 = Static202.aClass2_Sub17_Sub1_1.aByteArray94[0] & 0xFF;
			Static124.anInt2078++;
		}
		if (Static302.anInt5465 == -2) {
			if (!Static339.aClass66_2.method1390(2)) {
				return false;
			}
			Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, 2);
			Static202.aClass2_Sub17_Sub1_1.anInt7523 = 0;
			Static302.anInt5465 = Static202.aClass2_Sub17_Sub1_1.method6148();
			Static124.anInt2078 += 2;
			Static434.anInt7319 = 0;
		}
		if (Static302.anInt5465 > 0) {
			if (!Static339.aClass66_2.method1390(Static302.anInt5465)) {
				return false;
			}
			Static202.aClass2_Sub17_Sub1_1.anInt7523 = 0;
			Static339.aClass66_2.method1394(0, Static202.aClass2_Sub17_Sub1_1.aByteArray94, Static302.anInt5465);
			Static124.anInt2078 += Static302.anInt5465;
			Static434.anInt7319 = 0;
		}
		Static359.aClass25_154 = Static463.aClass25_185;
		Static463.aClass25_185 = Static119.aClass25_57;
		Static119.aClass25_57 = Static117.aClass25_55;
		@Pc(223) int local223;
		@Pc(215) int local215;
		if (Static117.aClass25_55 == Static325.aClass25_135) {
			local215 = Static202.aClass2_Sub17_Sub1_1.method6124();
			local73 = Static202.aClass2_Sub17_Sub1_1.method6171();
			local223 = Static202.aClass2_Sub17_Sub1_1.method6148();
			if (local223 == 65535) {
				local223 = -1;
			}
			if (Static153.method2305(local215)) {
				Static113.method1866(local223, 2, -1, local73);
			}
			Static117.aClass25_55 = null;
			return true;
		} else if (Static117.aClass25_55 == Static347.aClass25_149) {
			Static233.method3184(Static269.aClass163_7);
			Static117.aClass25_55 = null;
			return true;
		} else if (Static117.aClass25_55 == Static93.aClass25_39) {
			local215 = Static202.aClass2_Sub17_Sub1_1.method6114();
			local73 = Static202.aClass2_Sub17_Sub1_1.method6110();
			Static63.aClass120_2.method2537(local73, local215);
			Static117.aClass25_55 = null;
			return true;
		} else {
			@Pc(300) int local300;
			if (Static222.aClass25_85 == Static117.aClass25_55) {
				local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
				if (local215 == 65535) {
					local215 = -1;
				}
				local73 = Static202.aClass2_Sub17_Sub1_1.method6138();
				local223 = Static202.aClass2_Sub17_Sub1_1.method6148();
				local300 = Static202.aClass2_Sub17_Sub1_1.method6138();
				Static448.method6077(local300, local73, local215, local223);
				Static117.aClass25_55 = null;
				return true;
			} else if (Static117.aClass25_55 == Static254.aClass25_107) {
				local215 = Static202.aClass2_Sub17_Sub1_1.method6119();
				local73 = Static202.aClass2_Sub17_Sub1_1.method6114();
				local223 = Static202.aClass2_Sub17_Sub1_1.method6148();
				if (Static153.method2305(local223)) {
					Static160.method2381(local215, local73);
				}
				Static117.aClass25_55 = null;
				return true;
			} else {
				@Pc(344) String local344;
				if (Static207.aClass25_83 == Static117.aClass25_55) {
					local344 = Static202.aClass2_Sub17_Sub1_1.method6141();
					local73 = Static202.aClass2_Sub17_Sub1_1.method6148();
					local223 = Static202.aClass2_Sub17_Sub1_1.method6110();
					if (Static153.method2305(local223)) {
						Static445.method6034(local73, local344);
					}
					Static117.aClass25_55 = null;
					return true;
				} else if (Static117.aClass25_55 == Static400.aClass25_171) {
					Static360.method5072(Static418.aBoolean480);
					Static117.aClass25_55 = null;
					return false;
				} else if (Static117.aClass25_55 == Static107.aClass25_50) {
					Static202.aClass2_Sub17_Sub1_1.anInt7523 += 28;
					if (Static202.aClass2_Sub17_Sub1_1.method6159()) {
						Static226.method3100(Static202.aClass2_Sub17_Sub1_1.anInt7523 - 28, Static202.aClass2_Sub17_Sub1_1);
					}
					Static117.aClass25_55 = null;
					return true;
				} else if (Static117.aClass25_55 == Static106.aClass25_49) {
					local215 = Static202.aClass2_Sub17_Sub1_1.method6153();
					local73 = Static202.aClass2_Sub17_Sub1_1.method6171();
					local223 = Static202.aClass2_Sub17_Sub1_1.method6148();
					if (Static153.method2305(local215)) {
						Static100.method1447(local73, local223);
					}
					Static117.aClass25_55 = null;
					return true;
				} else {
					@Pc(450) int local450;
					@Pc(454) int local454;
					if (Static14.aClass25_6 == Static117.aClass25_55) {
						local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
						local73 = Static202.aClass2_Sub17_Sub1_1.method6138();
						local223 = Static202.aClass2_Sub17_Sub1_1.method6138();
						local300 = Static202.aClass2_Sub17_Sub1_1.method6148() << 0;
						local450 = Static202.aClass2_Sub17_Sub1_1.method6138();
						local454 = Static202.aClass2_Sub17_Sub1_1.method6138();
						if (Static153.method2305(local215)) {
							Static158.method2342(local223, local454, local300, local73, local450);
						}
						Static117.aClass25_55 = null;
						return true;
					} else if (Static244.aClass25_99 == Static117.aClass25_55) {
						Static233.method3184(Static284.aClass163_12);
						Static117.aClass25_55 = null;
						return true;
					} else if (Static117.aClass25_55 == Static27.aClass25_10) {
						Static233.method3184(Static71.aClass163_4);
						Static117.aClass25_55 = null;
						return true;
					} else if (Static228.aClass25_148 == Static117.aClass25_55) {
						local215 = Static202.aClass2_Sub17_Sub1_1.method6138();
						local73 = Static202.aClass2_Sub17_Sub1_1.method6148();
						local223 = Static202.aClass2_Sub17_Sub1_1.method6110();
						@Pc(511) Class2_Sub34 local511 = (Class2_Sub34) Static400.aClass220_41.method5099((long) local73);
						if (local511 != null) {
							Static406.method5646(local215, local223, local511.aClass11_Sub5_Sub2_Sub2_2);
						}
						Static117.aClass25_55 = null;
						return true;
					} else if (Static117.aClass25_55 == Static444.aClass25_181) {
						Static233.method3184(Static372.aClass163_18);
						Static117.aClass25_55 = null;
						return true;
					} else if (Static117.aClass25_55 == Static428.aClass25_177) {
						Static233.method3184(Static325.aClass163_14);
						Static117.aClass25_55 = null;
						return true;
					} else if (Static77.aClass25_29 == Static117.aClass25_55) {
						local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
						local73 = Static202.aClass2_Sub17_Sub1_1.method6148();
						local223 = Static202.aClass2_Sub17_Sub1_1.method6148();
						local300 = Static202.aClass2_Sub17_Sub1_1.method6148();
						if (Static153.method2305(local215) && Static188.aClass93ArrayArray4[local73] != null) {
							for (local450 = local223; local450 < local300; local450++) {
								local454 = Static202.aClass2_Sub17_Sub1_1.method6145();
								if (Static188.aClass93ArrayArray4[local73].length > local450 && Static188.aClass93ArrayArray4[local73][local450] != null) {
									Static188.aClass93ArrayArray4[local73][local450].anInt2500 = local454;
								}
							}
						}
						Static117.aClass25_55 = null;
						return true;
					} else if (Static117.aClass25_55 == Static253.aClass25_106) {
						for (local215 = 0; local215 < Static435.aClass11_Sub5_Sub2_Sub1Array1.length; local215++) {
							if (Static435.aClass11_Sub5_Sub2_Sub1Array1[local215] != null) {
								Static435.aClass11_Sub5_Sub2_Sub1Array1[local215].anInt7665 = -1;
							}
						}
						for (local73 = 0; local73 < Static30.anInt548; local73++) {
							Static226.aClass2_Sub34Array1[local73].aClass11_Sub5_Sub2_Sub2_2.anInt7665 = -1;
						}
						Static117.aClass25_55 = null;
						return true;
					} else if (Static239.aClass25_94 == Static117.aClass25_55) {
						local215 = Static202.aClass2_Sub17_Sub1_1.method6168();
						local73 = Static202.aClass2_Sub17_Sub1_1.method6115();
						if (local215 == 255) {
							local215 = -1;
							local73 = -1;
						}
						Static150.method5918(local73, local215);
						Static117.aClass25_55 = null;
						return true;
					} else {
						@Pc(696) String local696;
						@Pc(698) String local698;
						@Pc(714) boolean local714;
						@Pc(738) String local738;
						@Pc(692) boolean local692;
						if (Static117.aClass25_55 == Static26.aClass25_9) {
							local692 = Static202.aClass2_Sub17_Sub1_1.method6138() == 1;
							local696 = Static202.aClass2_Sub17_Sub1_1.method6141();
							local698 = local696;
							if (local692) {
								local698 = Static202.aClass2_Sub17_Sub1_1.method6141();
							}
							local300 = Static202.aClass2_Sub17_Sub1_1.method6138();
							local450 = Static202.aClass2_Sub17_Sub1_1.method6148();
							local714 = false;
							if (local300 <= 1 && Static27.method463(local698)) {
								local714 = true;
							}
							if (!local714 && Static428.anInt7267 == 0) {
								local738 = Static230.aClass179_2.method3930(local450).method50(Static202.aClass2_Sub17_Sub1_1);
								if (local300 == 2) {
									Static264.method3702(local450, local738, null, "<img=1>" + local698, "<img=1>" + local696, 25, 0);
								} else if (local300 == 1) {
									Static264.method3702(local450, local738, null, "<img=0>" + local698, "<img=0>" + local696, 25, 0);
								} else {
									Static264.method3702(local450, local738, null, local698, local696, 25, 0);
								}
							}
							Static117.aClass25_55 = null;
							return true;
						} else if (Static117.aClass25_55 == Static190.aClass25_79) {
							local692 = Static202.aClass2_Sub17_Sub1_1.method6138() == 1;
							@Pc(824) byte[] local824 = new byte[Static302.anInt5465 - 1];
							Static202.aClass2_Sub17_Sub1_1.method6164(Static302.anInt5465 - 1, local824);
							Static218.method3051(local692, local824);
							Static117.aClass25_55 = null;
							return true;
						} else {
							@Pc(908) String local908;
							if (Static83.aClass25_33 == Static117.aClass25_55) {
								local692 = Static202.aClass2_Sub17_Sub1_1.method6138() == 1;
								local696 = Static202.aClass2_Sub17_Sub1_1.method6141();
								local698 = local696;
								if (local692) {
									local698 = Static202.aClass2_Sub17_Sub1_1.method6141();
								}
								local300 = Static202.aClass2_Sub17_Sub1_1.method6138();
								@Pc(872) boolean local872 = false;
								if (local300 <= 1) {
									if (Static3.aBoolean3 && !Static203.aBoolean230 || Static46.aBoolean36) {
										local872 = true;
									} else if (local300 <= 1 && Static27.method463(local698)) {
										local872 = true;
									}
								}
								if (!local872 && Static428.anInt7267 == 0) {
									local908 = Static461.method6254(Static358.method5939(Static202.aClass2_Sub17_Sub1_1));
									if (local300 == 2) {
										Static264.method3702(-1, local908, null, "<img=1>" + local698, "<img=1>" + local696, 24, 0);
									} else if (local300 == 1) {
										Static264.method3702(-1, local908, null, "<img=0>" + local698, "<img=0>" + local696, 24, 0);
									} else {
										Static264.method3702(-1, local908, null, local698, local696, 24, 0);
									}
								}
								Static117.aClass25_55 = null;
								return true;
							}
							@Pc(997) String local997;
							@Pc(995) String local995;
							if (Static117.aClass25_55 == Static162.aClass25_70) {
								local215 = Static202.aClass2_Sub17_Sub1_1.method6174();
								local73 = Static202.aClass2_Sub17_Sub1_1.method6129();
								local223 = Static202.aClass2_Sub17_Sub1_1.method6138();
								local995 = "";
								local997 = local995;
								if ((local223 & 0x1) != 0) {
									local995 = Static202.aClass2_Sub17_Sub1_1.method6141();
									if ((local223 & 0x2) == 0) {
										local997 = local995;
									} else {
										local997 = Static202.aClass2_Sub17_Sub1_1.method6141();
									}
								}
								local908 = Static202.aClass2_Sub17_Sub1_1.method6141();
								if (local215 == 99) {
									Static338.method3179(local908);
								} else if (local997.equals("") || !Static27.method463(local997)) {
									Static94.method4447(local995, local997, local908, local215, local73);
								} else {
									Static117.aClass25_55 = null;
									return true;
								}
								Static117.aClass25_55 = null;
								return true;
							}
							@Pc(1113) int local1113;
							@Pc(1091) boolean local1091;
							@Pc(1134) boolean local1134;
							if (Static127.aClass25_60 == Static117.aClass25_55) {
								while (Static302.anInt5465 > Static202.aClass2_Sub17_Sub1_1.anInt7523) {
									local692 = Static202.aClass2_Sub17_Sub1_1.method6138() == 1;
									local696 = Static202.aClass2_Sub17_Sub1_1.method6141();
									local698 = Static202.aClass2_Sub17_Sub1_1.method6141();
									local300 = Static202.aClass2_Sub17_Sub1_1.method6148();
									local450 = Static202.aClass2_Sub17_Sub1_1.method6138();
									local908 = "";
									local1091 = false;
									if (local300 > 0) {
										local908 = Static202.aClass2_Sub17_Sub1_1.method6141();
										local1091 = Static202.aClass2_Sub17_Sub1_1.method6138() == 1;
									}
									for (local1113 = 0; local1113 < Static259.anInt4591; local1113++) {
										if (local692) {
											if (local698.equals(Static449.aStringArray67[local1113])) {
												Static449.aStringArray67[local1113] = local696;
												local696 = null;
												Static197.aStringArray41[local1113] = local698;
												break;
											}
										} else if (local696.equals(Static449.aStringArray67[local1113])) {
											if (Static110.anIntArray137[local1113] != local300) {
												local1134 = true;
												for (@Pc(1139) Class28_Sub2_Sub2 local1139 = (Class28_Sub2_Sub2) Static19.aClass97_1.method2145(); local1139 != null; local1139 = (Class28_Sub2_Sub2) Static19.aClass97_1.method2148()) {
													if (local1139.aString44.equals(local696)) {
														if (local300 != 0 && local1139.aShort71 == 0) {
															local1139.method5916();
															local1134 = false;
														} else if (local300 == 0 && local1139.aShort71 != 0) {
															local1139.method5916();
															local1134 = false;
														}
													}
												}
												if (local1134) {
													Static19.aClass97_1.method2154(new Class28_Sub2_Sub2(local696, local300));
												}
												Static110.anIntArray137[local1113] = local300;
											}
											Static197.aStringArray41[local1113] = local698;
											Static142.aStringArray30[local1113] = local908;
											Static142.anIntArray222[local1113] = local450;
											local696 = null;
											Static217.aBooleanArray18[local1113] = local1091;
											break;
										}
									}
									if (local696 != null && Static259.anInt4591 < 200) {
										Static449.aStringArray67[Static259.anInt4591] = local696;
										Static197.aStringArray41[Static259.anInt4591] = local698;
										Static110.anIntArray137[Static259.anInt4591] = local300;
										Static142.aStringArray30[Static259.anInt4591] = local908;
										Static142.anIntArray222[Static259.anInt4591] = local450;
										Static217.aBooleanArray18[Static259.anInt4591] = local1091;
										Static259.anInt4591++;
									}
								}
								Static115.anInt1936 = Static144.anInt2663;
								Static130.anInt2196 = 2;
								local73 = Static259.anInt4591;
								while (local73 > 0) {
									local73--;
									local692 = true;
									for (local223 = 0; local223 < local73; local223++) {
										if (Static110.anIntArray137[local223] != Static163.aClass263_3.anInt7387 && Static110.anIntArray137[local223 + 1] == Static163.aClass263_3.anInt7387 || Static110.anIntArray137[local223] == 0 && Static110.anIntArray137[local223 + 1] != 0) {
											local300 = Static110.anIntArray137[local223];
											Static110.anIntArray137[local223] = Static110.anIntArray137[local223 + 1];
											Static110.anIntArray137[local223 + 1] = local300;
											local997 = Static142.aStringArray30[local223];
											Static142.aStringArray30[local223] = Static142.aStringArray30[local223 + 1];
											Static142.aStringArray30[local223 + 1] = local997;
											local908 = Static449.aStringArray67[local223];
											Static449.aStringArray67[local223] = Static449.aStringArray67[local223 + 1];
											Static449.aStringArray67[local223 + 1] = local908;
											local738 = Static197.aStringArray41[local223];
											Static197.aStringArray41[local223] = Static197.aStringArray41[local223 + 1];
											Static197.aStringArray41[local223 + 1] = local738;
											local1113 = Static142.anIntArray222[local223];
											Static142.anIntArray222[local223] = Static142.anIntArray222[local223 + 1];
											Static142.anIntArray222[local223 + 1] = local1113;
											local1134 = Static217.aBooleanArray18[local223];
											Static217.aBooleanArray18[local223] = Static217.aBooleanArray18[local223 + 1];
											Static217.aBooleanArray18[local223 + 1] = local1134;
											local692 = false;
										}
									}
									if (local692) {
										break;
									}
								}
								Static117.aClass25_55 = null;
								return true;
							} else if (Static117.aClass25_55 == Static105.aClass25_48) {
								Static117.aClass25_55 = null;
								return false;
							} else if (Static117.aClass25_55 == Static266.aClass25_110) {
								local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
								local73 = Static202.aClass2_Sub17_Sub1_1.method6138();
								local223 = Static202.aClass2_Sub17_Sub1_1.method6138();
								local300 = Static202.aClass2_Sub17_Sub1_1.method6148() << 0;
								local450 = Static202.aClass2_Sub17_Sub1_1.method6138();
								local454 = Static202.aClass2_Sub17_Sub1_1.method6138();
								if (Static153.method2305(local215)) {
									Static295.method4187(local223, local73, local300, local454, local450, true);
								}
								Static117.aClass25_55 = null;
								return true;
							} else if (Static117.aClass25_55 == Static97.aClass25_41) {
								local215 = Static202.aClass2_Sub17_Sub1_1.method6129();
								local73 = Static202.aClass2_Sub17_Sub1_1.method6148();
								local223 = Static202.aClass2_Sub17_Sub1_1.method6148();
								local300 = Static202.aClass2_Sub17_Sub1_1.method6110();
								local450 = Static202.aClass2_Sub17_Sub1_1.method6148();
								if (Static153.method2305(local223)) {
									Static113.method1866(local300 | local450 << 16, 7, local73, local215);
								}
								Static117.aClass25_55 = null;
								return true;
							} else if (Static117.aClass25_55 == Static151.aClass25_67) {
								local215 = Static202.aClass2_Sub17_Sub1_1.method6110();
								local73 = Static202.aClass2_Sub17_Sub1_1.method6124();
								local223 = Static202.aClass2_Sub17_Sub1_1.method6110();
								if (Static153.method2305(local73)) {
									Static196.method2784(local215, local223);
								}
								Static117.aClass25_55 = null;
								return true;
							} else if (Static117.aClass25_55 == Static138.aClass25_62) {
								local215 = Static202.aClass2_Sub17_Sub1_1.method6171();
								local73 = Static202.aClass2_Sub17_Sub1_1.method6153();
								local698 = Static202.aClass2_Sub17_Sub1_1.method6141();
								if (Static153.method2305(local73)) {
									Static84.method6294(local215, local698);
								}
								Static117.aClass25_55 = null;
								return true;
							} else if (Static117.aClass25_55 == Static63.aClass25_168) {
								local215 = Static202.aClass2_Sub17_Sub1_1.method6119();
								local73 = Static202.aClass2_Sub17_Sub1_1.method6138();
								local223 = Static202.aClass2_Sub17_Sub1_1.method6114();
								Static194.anIntArray279[local215] = local223;
								Static13.anIntArray34[local215] = local73;
								Static322.anIntArray484[local215] = 1;
								local300 = Static253.anIntArray390[local215] - 1;
								for (local450 = 0; local450 < local300; local450++) {
									if (Class253.anIntArray583[local450] <= local223) {
										Static322.anIntArray484[local215] = local450 + 2;
									}
								}
								Static141.anIntArray575[Static160.anInt2888++ & 0x1F] = local215;
								Static117.aClass25_55 = null;
								return true;
							} else {
								@Pc(1693) boolean local1693;
								@Pc(1876) int local1876;
								@Pc(1730) Class29 local1730;
								@Pc(1765) int local1765;
								@Pc(1755) int local1755;
								if (Static381.aClass25_161 == Static117.aClass25_55) {
									local344 = Static202.aClass2_Sub17_Sub1_1.method6141();
									local1693 = Static202.aClass2_Sub17_Sub1_1.method6138() == 1;
									if (local1693) {
										local696 = Static202.aClass2_Sub17_Sub1_1.method6141();
									} else {
										local696 = local344;
									}
									local300 = Static202.aClass2_Sub17_Sub1_1.method6148();
									@Pc(1711) byte local1711 = Static202.aClass2_Sub17_Sub1_1.method6120();
									local714 = false;
									if (local1711 == -128) {
										local714 = true;
									}
									if (local714) {
										if (Static6.anInt110 == 0) {
											Static117.aClass25_55 = null;
											return true;
										}
										for (local1876 = 0; local1876 < Static6.anInt110 && (!Static57.aClass29Array1[local1876].aString4.equals(local696) || Static57.aClass29Array1[local1876].anInt607 != local300); local1876++) {
										}
										if (Static6.anInt110 > local1876) {
											while (Static6.anInt110 - 1 > local1876) {
												Static57.aClass29Array1[local1876] = Static57.aClass29Array1[local1876 + 1];
												local1876++;
											}
											Static6.anInt110--;
											Static57.aClass29Array1[Static6.anInt110] = null;
										}
									} else {
										local738 = Static202.aClass2_Sub17_Sub1_1.method6141();
										local1730 = new Class29();
										local1730.aString4 = local696;
										local1730.aString6 = local344;
										local1730.aString5 = Static155.method2318(local1730.aString4);
										local1730.aByte1 = local1711;
										local1730.anInt607 = local300;
										local1730.aString7 = local738;
										for (local1755 = Static6.anInt110 - 1; local1755 >= 0; local1755--) {
											local1765 = Static57.aClass29Array1[local1755].aString5.compareTo(local1730.aString5);
											if (local1765 == 0) {
												Static57.aClass29Array1[local1755].anInt607 = local300;
												Static57.aClass29Array1[local1755].aByte1 = local1711;
												Static57.aClass29Array1[local1755].aString7 = local738;
												if (local696.equals(Static127.aClass11_Sub5_Sub2_Sub1_2.aString20)) {
													Static369.aByte81 = local1711;
												}
												Static72.anInt1223 = Static144.anInt2663;
												Static117.aClass25_55 = null;
												return true;
											}
											if (local1765 < 0) {
												break;
											}
										}
										if (Static6.anInt110 >= Static57.aClass29Array1.length) {
											Static117.aClass25_55 = null;
											return true;
										}
										for (local1765 = Static6.anInt110 - 1; local1765 > local1755; local1765--) {
											Static57.aClass29Array1[local1765 + 1] = Static57.aClass29Array1[local1765];
										}
										if (Static6.anInt110 == 0) {
											Static57.aClass29Array1 = new Class29[100];
										}
										Static57.aClass29Array1[local1755 + 1] = local1730;
										Static6.anInt110++;
										if (local696.equals(Static127.aClass11_Sub5_Sub2_Sub1_2.aString20)) {
											Static369.aByte81 = local1711;
										}
									}
									Static72.anInt1223 = Static144.anInt2663;
									Static117.aClass25_55 = null;
									return true;
								} else if (Static260.aClass25_108 == Static117.aClass25_55) {
									local215 = Static202.aClass2_Sub17_Sub1_1.method6110();
									local73 = Static202.aClass2_Sub17_Sub1_1.method6125();
									local223 = Static202.aClass2_Sub17_Sub1_1.method6153();
									if (Static153.method2305(local215)) {
										Static401.method5617(local73, local223);
									}
									Static117.aClass25_55 = null;
									return true;
								} else if (Static117.aClass25_55 == Static175.aClass25_75) {
									local215 = Static202.aClass2_Sub17_Sub1_1.method6129();
									Static81.aClass136_1 = Static138.aClass194_2.method4401(local215);
									Static117.aClass25_55 = null;
									return true;
								} else if (Static117.aClass25_55 == Static108.aClass25_51) {
									Static104.anInt1682 = Static202.aClass2_Sub17_Sub1_1.method6138();
									Static29.anInt504 = Static144.anInt2663;
									Static117.aClass25_55 = null;
									return true;
								} else if (Static151.aClass25_68 == Static117.aClass25_55) {
									if (Static203.method2864(Static433.anInt7309)) {
										Static292.anInt5209 = (int) ((float) Static202.aClass2_Sub17_Sub1_1.method6148() * 2.5F);
									} else {
										Static292.anInt5209 = Static202.aClass2_Sub17_Sub1_1.method6148() * 30;
									}
									Static117.aClass25_55 = null;
									Static29.anInt504 = Static144.anInt2663;
									return true;
								} else if (Static117.aClass25_55 == Static45.aClass25_16) {
									local215 = Static202.aClass2_Sub17_Sub1_1.method6153();
									local73 = Static202.aClass2_Sub17_Sub1_1.method6129();
									local223 = Static202.aClass2_Sub17_Sub1_1.method6148();
									local300 = Static202.aClass2_Sub17_Sub1_1.method6110();
									if (Static153.method2305(local300)) {
										Static295.method4188((local223 << 16) + local215, local73);
									}
									Static117.aClass25_55 = null;
									return true;
								} else if (Static117.aClass25_55 == Static290.aClass25_123) {
									Static344.anInt6100 = Static202.aClass2_Sub17_Sub1_1.method6168();
									Static183.anInt3210 = Static202.aClass2_Sub17_Sub1_1.method6173() << 3;
									Static340.anInt6081 = Static202.aClass2_Sub17_Sub1_1.method6123() << 3;
									Static117.aClass25_55 = null;
									return true;
								} else if (Static117.aClass25_55 == Static270.aClass25_112) {
									Static233.method3184(Static143.aClass163_9);
									Static117.aClass25_55 = null;
									return true;
								} else if (Static97.aClass25_42 == Static117.aClass25_55) {
									Static250.method3459();
									Static117.aClass25_55 = null;
									return true;
								} else if (Static117.aClass25_55 == Static48.aClass25_18) {
									local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
									local73 = Static202.aClass2_Sub17_Sub1_1.method6138();
									local1693 = (local73 & 0x1) == 1;
									Static227.method3107(local215, local1693);
									local300 = Static202.aClass2_Sub17_Sub1_1.method6148();
									for (local450 = 0; local450 < local300; local450++) {
										local454 = Static202.aClass2_Sub17_Sub1_1.method6119();
										if (local454 == 255) {
											local454 = Static202.aClass2_Sub17_Sub1_1.method6125();
										}
										local1876 = Static202.aClass2_Sub17_Sub1_1.method6153();
										Static289.method4098(local215, local1693, local450, local454, local1876 - 1);
									}
									Static213.anIntArray337[Static80.anInt6196++ & 0x1F] = local215;
									Static117.aClass25_55 = null;
									return true;
								} else {
									@Pc(2226) int local2226;
									@Pc(2213) long local2213;
									@Pc(2208) long local2208;
									@Pc(2218) long local2218;
									if (Static117.aClass25_55 == Static70.aClass25_28) {
										local692 = Static202.aClass2_Sub17_Sub1_1.method6138() == 1;
										local696 = Static202.aClass2_Sub17_Sub1_1.method6141();
										local698 = local696;
										if (local692) {
											local698 = Static202.aClass2_Sub17_Sub1_1.method6141();
										}
										local2208 = Static202.aClass2_Sub17_Sub1_1.method6128();
										local2213 = Static202.aClass2_Sub17_Sub1_1.method6148();
										local2218 = Static202.aClass2_Sub17_Sub1_1.method6145();
										local1765 = Static202.aClass2_Sub17_Sub1_1.method6138();
										local2226 = Static202.aClass2_Sub17_Sub1_1.method6148();
										@Pc(2232) long local2232 = (local2213 << 32) + local2218;
										@Pc(2234) boolean local2234 = false;
										@Pc(2236) int local2236 = 0;
										while (true) {
											if (local2236 >= 100) {
												if (local1765 <= 1 && Static27.method463(local698)) {
													local2234 = true;
												}
												break;
											}
											if (Static262.aLongArray2[local2236] == local2232) {
												local2234 = true;
												break;
											}
											local2236++;
										}
										if (!local2234 && Static428.anInt7267 == 0) {
											Static262.aLongArray2[Static240.anInt4050] = local2232;
											Static240.anInt4050 = (Static240.anInt4050 + 1) % 100;
											@Pc(2283) String local2283 = Static230.aClass179_2.method3930(local2226).method50(Static202.aClass2_Sub17_Sub1_1);
											if (local1765 == 2) {
												Static264.method3702(local2226, local2283, Static352.method4954(local2208), "<img=1>" + local698, "<img=1>" + local696, 20, 0);
											} else if (local1765 == 1) {
												Static264.method3702(local2226, local2283, Static352.method4954(local2208), "<img=0>" + local698, "<img=0>" + local696, 20, 0);
											} else {
												Static264.method3702(local2226, local2283, Static352.method4954(local2208), local698, local696, 20, 0);
											}
										}
										Static117.aClass25_55 = null;
										return true;
									}
									@Pc(2391) Class2_Sub9 local2391;
									if (Static365.aClass25_104 == Static117.aClass25_55) {
										local215 = Static202.aClass2_Sub17_Sub1_1.method6129();
										local73 = Static202.aClass2_Sub17_Sub1_1.method6110();
										local223 = Static202.aClass2_Sub17_Sub1_1.method6114();
										if (Static153.method2305(local73)) {
											@Pc(2384) Class2_Sub9 local2384 = (Class2_Sub9) Static394.aClass220_45.method5099((long) local215);
											local2391 = (Class2_Sub9) Static394.aClass220_45.method5099((long) local223);
											if (local2391 != null) {
												Static343.method2399(local2384 == null || local2384.anInt1143 != local2391.anInt1143, local2391, false);
											}
											if (local2384 != null) {
												local2384.method6260();
												Static394.aClass220_45.method5104(local2384, (long) local223);
											}
											@Pc(2422) Class93 local2422 = Static160.method2380(local215);
											if (local2422 != null) {
												Static383.method5263(local2422);
											}
											local2422 = Static160.method2380(local223);
											if (local2422 != null) {
												Static383.method5263(local2422);
												Static189.method2742(true, local2422);
											}
											if (Static103.anInt5365 != -1) {
												Static233.method3189(Static103.anInt5365, 1);
											}
										}
										Static117.aClass25_55 = null;
										return true;
									}
									@Pc(2503) int local2503;
									if (Static404.aClass25_66 == Static117.aClass25_55) {
										local692 = Static202.aClass2_Sub17_Sub1_1.method6138() == 1;
										local696 = Static202.aClass2_Sub17_Sub1_1.method6141();
										local698 = local696;
										if (local692) {
											local698 = Static202.aClass2_Sub17_Sub1_1.method6141();
										}
										local2208 = Static202.aClass2_Sub17_Sub1_1.method6128();
										local2213 = Static202.aClass2_Sub17_Sub1_1.method6148();
										local2218 = Static202.aClass2_Sub17_Sub1_1.method6145();
										local1765 = Static202.aClass2_Sub17_Sub1_1.method6138();
										@Pc(2499) long local2499 = (local2213 << 32) + local2218;
										@Pc(2501) boolean local2501 = false;
										local2503 = 0;
										while (true) {
											if (local2503 >= 100) {
												if (local1765 <= 1) {
													if (Static3.aBoolean3 && !Static203.aBoolean230 || Static46.aBoolean36) {
														local2501 = true;
													} else if (Static27.method463(local698)) {
														local2501 = true;
													}
												}
												break;
											}
											if (local2499 == Static262.aLongArray2[local2503]) {
												local2501 = true;
												break;
											}
											local2503++;
										}
										if (!local2501 && Static428.anInt7267 == 0) {
											Static262.aLongArray2[Static240.anInt4050] = local2499;
											Static240.anInt4050 = (Static240.anInt4050 + 1) % 100;
											@Pc(2566) String local2566 = Static461.method6254(Static358.method5939(Static202.aClass2_Sub17_Sub1_1));
											if (local1765 == 2 || local1765 == 3) {
												Static264.method3702(-1, local2566, Static352.method4954(local2208), "<img=1>" + local698, "<img=1>" + local696, 9, 0);
											} else if (local1765 == 1) {
												Static264.method3702(-1, local2566, Static352.method4954(local2208), "<img=0>" + local698, "<img=0>" + local696, 9, 0);
											} else {
												Static264.method3702(-1, local2566, Static352.method4954(local2208), local698, local696, 9, 0);
											}
										}
										Static117.aClass25_55 = null;
										return true;
									} else if (Static227.aClass25_87 == Static117.aClass25_55) {
										Static424.aClass259_3 = Static96.method1426(Static202.aClass2_Sub17_Sub1_1.method6138());
										Static117.aClass25_55 = null;
										return true;
									} else if (Static291.aClass25_124 == Static117.aClass25_55) {
										Static233.method3184(Static362.aClass163_17);
										Static117.aClass25_55 = null;
										return true;
									} else if (Static344.aClass25_145 == Static117.aClass25_55) {
										local215 = Static202.aClass2_Sub17_Sub1_1.method6138();
										local73 = Static202.aClass2_Sub17_Sub1_1.method6124();
										if (local73 == 65535) {
											local73 = -1;
										}
										local223 = Static202.aClass2_Sub17_Sub1_1.method6168();
										Static361.method5095(local73, local223, local215);
										Static117.aClass25_55 = null;
										return true;
									} else if (Static34.aClass25_12 == Static117.aClass25_55) {
										local215 = Static202.aClass2_Sub17_Sub1_1.method6113();
										local73 = Static202.aClass2_Sub17_Sub1_1.method6110();
										if (local73 == 65535) {
											local73 = -1;
										}
										local223 = Static202.aClass2_Sub17_Sub1_1.method6168();
										Static328.method4680(local215, local73, local223);
										Static117.aClass25_55 = null;
										return true;
									} else if (Static117.aClass25_55 == Static376.aClass25_160) {
										Static436.anInt7343 = Static202.aClass2_Sub17_Sub1_1.method6168();
										Static381.anInt6606 = Static202.aClass2_Sub17_Sub1_1.method6119();
										Static117.aClass25_55 = null;
										return true;
									} else if (Static117.aClass25_55 == Static85.aClass25_36) {
										if (Static103.anInt5365 != -1) {
											Static233.method3189(Static103.anInt5365, 0);
										}
										Static117.aClass25_55 = null;
										return true;
									} else if (Static117.aClass25_55 == Static335.aClass25_142) {
										local344 = Static202.aClass2_Sub17_Sub1_1.method6141();
										local73 = Static202.aClass2_Sub17_Sub1_1.method6124();
										local223 = Static202.aClass2_Sub17_Sub1_1.method6148();
										if (Static153.method2305(local73)) {
											Static445.method6034(local223, local344);
										}
										Static117.aClass25_55 = null;
										return true;
									} else {
										@Pc(2830) int local2830;
										if (Static441.aClass25_179 == Static117.aClass25_55) {
											local692 = Static202.aClass2_Sub17_Sub1_1.method6138() == 1;
											local696 = Static202.aClass2_Sub17_Sub1_1.method6141();
											local698 = local696;
											if (local692) {
												local698 = Static202.aClass2_Sub17_Sub1_1.method6141();
											}
											local2208 = Static202.aClass2_Sub17_Sub1_1.method6148();
											local2213 = Static202.aClass2_Sub17_Sub1_1.method6145();
											local1113 = Static202.aClass2_Sub17_Sub1_1.method6138();
											local1755 = Static202.aClass2_Sub17_Sub1_1.method6148();
											@Pc(2826) long local2826 = (local2208 << 32) + local2213;
											@Pc(2828) boolean local2828 = false;
											local2830 = 0;
											while (true) {
												if (local2830 >= 100) {
													if (local1113 <= 1 && Static27.method463(local698)) {
														local2828 = true;
													}
													break;
												}
												if (local2826 == Static262.aLongArray2[local2830]) {
													local2828 = true;
													break;
												}
												local2830++;
											}
											if (!local2828 && Static428.anInt7267 == 0) {
												Static262.aLongArray2[Static240.anInt4050] = local2826;
												Static240.anInt4050 = (Static240.anInt4050 + 1) % 100;
												@Pc(2882) String local2882 = Static230.aClass179_2.method3930(local1755).method50(Static202.aClass2_Sub17_Sub1_1);
												if (local1113 == 2) {
													Static264.method3702(local1755, local2882, null, "<img=1>" + local698, "<img=1>" + local696, 18, 0);
												} else if (local1113 == 1) {
													Static264.method3702(local1755, local2882, null, "<img=0>" + local698, "<img=0>" + local696, 18, 0);
												} else {
													Static264.method3702(local1755, local2882, null, local698, local696, 18, 0);
												}
											}
											Static117.aClass25_55 = null;
											return true;
										} else if (Static461.aClass25_183 == Static117.aClass25_55) {
											local215 = Static202.aClass2_Sub17_Sub1_1.method6110();
											local73 = Static202.aClass2_Sub17_Sub1_1.method6129();
											local223 = Static202.aClass2_Sub17_Sub1_1.method6110();
											if (Static153.method2305(local223)) {
												Static294.method4185(local73, local215);
											}
											Static117.aClass25_55 = null;
											return true;
										} else if (Static117.aClass25_55 == Static364.aClass25_156) {
											local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
											local73 = Static202.aClass2_Sub17_Sub1_1.method6138();
											local223 = Static202.aClass2_Sub17_Sub1_1.method6138();
											local300 = Static202.aClass2_Sub17_Sub1_1.method6138();
											local450 = Static202.aClass2_Sub17_Sub1_1.method6138();
											local454 = Static202.aClass2_Sub17_Sub1_1.method6148();
											if (Static153.method2305(local215)) {
												Static333.aBooleanArray21[local73] = true;
												Static50.anIntArray64[local73] = local223;
												Static386.anIntArray584[local73] = local300;
												Static304.anIntArray466[local73] = local450;
												Static257.anIntArray393[local73] = local454;
											}
											Static117.aClass25_55 = null;
											return true;
										} else if (Static308.aClass25_132 == Static117.aClass25_55) {
											local215 = Static202.aClass2_Sub17_Sub1_1.method6138();
											local73 = local215 >> 5;
											local223 = local215 & 0x1F;
											if (local223 == 0) {
												Static223.aClass166Array1[local73] = null;
												Static117.aClass25_55 = null;
												return true;
											}
											@Pc(3063) Class166 local3063 = new Class166();
											local3063.anInt4251 = local223;
											local3063.anInt4242 = Static202.aClass2_Sub17_Sub1_1.method6138();
											if (local3063.anInt4242 >= 0 && Static157.aClass41Array1.length > local3063.anInt4242) {
												if (local3063.anInt4251 == 1 || local3063.anInt4251 == 10) {
													local3063.anInt4246 = Static202.aClass2_Sub17_Sub1_1.method6148();
													Static202.aClass2_Sub17_Sub1_1.anInt7523 += 6;
												} else if (local3063.anInt4251 >= 2 && local3063.anInt4251 <= 6) {
													if (local3063.anInt4251 == 2) {
														local3063.anInt4239 = 64;
														local3063.anInt4243 = 64;
													}
													if (local3063.anInt4251 == 3) {
														local3063.anInt4243 = 0;
														local3063.anInt4239 = 64;
													}
													if (local3063.anInt4251 == 4) {
														local3063.anInt4243 = 128;
														local3063.anInt4239 = 64;
													}
													if (local3063.anInt4251 == 5) {
														local3063.anInt4239 = 0;
														local3063.anInt4243 = 64;
													}
													if (local3063.anInt4251 == 6) {
														local3063.anInt4239 = 128;
														local3063.anInt4243 = 64;
													}
													local3063.anInt4251 = 2;
													local3063.anInt4245 = Static202.aClass2_Sub17_Sub1_1.method6138();
													local3063.anInt4243 += Static202.aClass2_Sub17_Sub1_1.method6148() - Static386.anInt7205 << 7;
													local3063.anInt4239 += Static202.aClass2_Sub17_Sub1_1.method6148() - Static153.anInt2798 << 7;
													local3063.anInt4238 = Static202.aClass2_Sub17_Sub1_1.method6138() << 0;
													local3063.anInt4248 = Static202.aClass2_Sub17_Sub1_1.method6148();
												}
												local3063.anInt4240 = Static202.aClass2_Sub17_Sub1_1.method6148();
												if (local3063.anInt4240 == 65535) {
													local3063.anInt4240 = -1;
												}
												Static223.aClass166Array1[local73] = local3063;
											}
											Static117.aClass25_55 = null;
											return true;
										} else if (Static117.aClass25_55 == Static349.aClass25_150) {
											Static58.method965();
											Static117.aClass25_55 = null;
											return false;
										} else if (Static374.aClass25_158 == Static117.aClass25_55) {
											Static233.method3184(Static45.aClass163_1);
											Static117.aClass25_55 = null;
											return true;
										} else if (Static117.aClass25_55 == Static79.aClass25_30) {
											local215 = Static202.aClass2_Sub17_Sub1_1.method6114();
											local73 = Static202.aClass2_Sub17_Sub1_1.method6110();
											if (local73 == 65535) {
												local73 = -1;
											}
											local223 = Static202.aClass2_Sub17_Sub1_1.method6171();
											local300 = Static202.aClass2_Sub17_Sub1_1.method6153();
											if (Static153.method2305(local300)) {
												Static373.method5203(local73, local223, local215);
												@Pc(3291) Class218 local3291 = Static413.aClass271_2.method6193(local73);
												Static352.method4952(local215, local3291.anInt6303, local3291.anInt6288, local3291.anInt6318);
												Static388.method5385(local3291.anInt6278, local215, local3291.anInt6262, local3291.anInt6275);
											}
											Static117.aClass25_55 = null;
											return true;
										} else if (Static117.aClass25_55 == Static128.aClass25_61) {
											Static146.method2223(false);
											Static117.aClass25_55 = null;
											return true;
										} else if (Static301.aClass25_98 == Static117.aClass25_55) {
											Static72.anInt1223 = Static144.anInt2663;
											if (Static302.anInt5465 == 0) {
												Static117.aClass25_55 = null;
												Static57.aClass29Array1 = null;
												Static321.aString58 = null;
												Static6.anInt110 = 0;
												Static242.aString35 = null;
												return true;
											}
											Static321.aString58 = Static202.aClass2_Sub17_Sub1_1.method6141();
											local692 = Static202.aClass2_Sub17_Sub1_1.method6138() == 1;
											if (local692) {
												Static202.aClass2_Sub17_Sub1_1.method6141();
											}
											@Pc(3365) long local3365 = Static202.aClass2_Sub17_Sub1_1.method6128();
											Static242.aString35 = Static289.method4097(local3365);
											Static251.aByte63 = Static202.aClass2_Sub17_Sub1_1.method6120();
											local300 = Static202.aClass2_Sub17_Sub1_1.method6138();
											if (local300 == 255) {
												Static117.aClass25_55 = null;
												return true;
											}
											Static6.anInt110 = local300;
											@Pc(3389) Class29[] local3389 = new Class29[100];
											for (local454 = 0; local454 < Static6.anInt110; local454++) {
												local3389[local454] = new Class29();
												local3389[local454].aString6 = Static202.aClass2_Sub17_Sub1_1.method6141();
												local692 = Static202.aClass2_Sub17_Sub1_1.method6138() == 1;
												if (local692) {
													local3389[local454].aString4 = Static202.aClass2_Sub17_Sub1_1.method6141();
												} else {
													local3389[local454].aString4 = local3389[local454].aString6;
												}
												local3389[local454].aString5 = Static155.method2318(local3389[local454].aString4);
												local3389[local454].anInt607 = Static202.aClass2_Sub17_Sub1_1.method6148();
												local3389[local454].aByte1 = Static202.aClass2_Sub17_Sub1_1.method6120();
												local3389[local454].aString7 = Static202.aClass2_Sub17_Sub1_1.method6141();
												if (local3389[local454].aString4.equals(Static127.aClass11_Sub5_Sub2_Sub1_2.aString20)) {
													Static369.aByte81 = local3389[local454].aByte1;
												}
											}
											local1755 = Static6.anInt110;
											while (local1755 > 0) {
												local1091 = true;
												local1755--;
												for (local1765 = 0; local1765 < local1755; local1765++) {
													if (local3389[local1765].aString5.compareTo(local3389[local1765 + 1].aString5) > 0) {
														local1730 = local3389[local1765];
														local3389[local1765] = local3389[local1765 + 1];
														local3389[local1765 + 1] = local1730;
														local1091 = false;
													}
												}
												if (local1091) {
													break;
												}
											}
											Static117.aClass25_55 = null;
											Static57.aClass29Array1 = local3389;
											return true;
										} else if (Static280.aClass25_118 == Static117.aClass25_55) {
											local215 = Static202.aClass2_Sub17_Sub1_1.method6124();
											local73 = Static202.aClass2_Sub17_Sub1_1.method6115();
											local1693 = (local73 & 0x1) == 1;
											Static73.method1126(local215, local1693);
											Static213.anIntArray337[Static80.anInt6196++ & 0x1F] = local215;
											Static117.aClass25_55 = null;
											return true;
										} else if (Static330.aClass25_139 == Static117.aClass25_55) {
											local215 = Static202.aClass2_Sub17_Sub1_1.method6110();
											local73 = Static202.aClass2_Sub17_Sub1_1.method6129();
											local223 = Static202.aClass2_Sub17_Sub1_1.method6146();
											if (Static153.method2305(local215)) {
												Static324.method4603(local223, local73);
											}
											Static117.aClass25_55 = null;
											return true;
										} else if (Static177.aClass25_76 == Static117.aClass25_55) {
											local215 = Static202.aClass2_Sub17_Sub1_1.method6138();
											@Pc(3632) boolean local3632 = (local215 & 0x1) == 1;
											local698 = Static202.aClass2_Sub17_Sub1_1.method6141();
											local995 = Static202.aClass2_Sub17_Sub1_1.method6141();
											if (local995.equals("")) {
												local995 = local698;
											}
											local997 = Static202.aClass2_Sub17_Sub1_1.method6141();
											local908 = Static202.aClass2_Sub17_Sub1_1.method6141();
											if (local908.equals("")) {
												local908 = local997;
											}
											if (local3632) {
												for (local1876 = 0; local1876 < Static127.anInt2142; local1876++) {
													if (Static296.aStringArray49[local1876].equals(local908)) {
														Static268.aStringArray47[local1876] = local698;
														Static296.aStringArray49[local1876] = local995;
														Static80.aStringArray58[local1876] = local997;
														Static148.aStringArray32[local1876] = local908;
														break;
													}
												}
											} else {
												Static268.aStringArray47[Static127.anInt2142] = local698;
												Static296.aStringArray49[Static127.anInt2142] = local995;
												Static80.aStringArray58[Static127.anInt2142] = local997;
												Static148.aStringArray32[Static127.anInt2142] = local908;
												Static398.aBooleanArray22[Static127.anInt2142] = (local215 & 0x2) == 2;
												Static127.anInt2142++;
											}
											Static117.aClass25_55 = null;
											Static115.anInt1936 = Static144.anInt2663;
											return true;
										} else if (Static179.aClass25_77 == Static117.aClass25_55) {
											Static87.method1367(Static302.anInt5465, Static202.aClass2_Sub17_Sub1_1);
											Static117.aClass25_55 = null;
											return true;
										} else if (Static224.aClass25_86 == Static117.aClass25_55) {
											Static146.method2223(true);
											Static117.aClass25_55 = null;
											return true;
										} else if (Static117.aClass25_55 == Static149.aClass25_180) {
											Static340.anInt6081 = Static202.aClass2_Sub17_Sub1_1.method6173() << 3;
											Static183.anInt3210 = Static202.aClass2_Sub17_Sub1_1.method6173() << 3;
											Static344.anInt6100 = Static202.aClass2_Sub17_Sub1_1.method6119();
											for (@Pc(3780) Class2_Sub43 local3780 = (Class2_Sub43) Static293.aClass220_27.method5096(); local3780 != null; local3780 = (Class2_Sub43) Static293.aClass220_27.method5098()) {
												local73 = (int) (local3780.aLong401 >> 28 & 0x3L);
												local223 = (int) (local3780.aLong401 & 0x3FFFL);
												local300 = local223 - Static386.anInt7205;
												local450 = (int) (local3780.aLong401 >> 14 & 0x3FFFL);
												local454 = local450 - Static153.anInt2798;
												if (local73 == Static344.anInt6100 && local300 >= Static183.anInt3210 && local300 < Static183.anInt3210 + 8 && local454 >= Static340.anInt6081 && local454 < Static340.anInt6081 + 8) {
													local3780.method6260();
													if (local300 >= 0 && local454 >= 0 && local300 < Static234.anInt3949 && Static371.anInt6492 > local454) {
														Static133.method4452(local454, Static344.anInt6100, local300);
													}
												}
											}
											for (@Pc(3878) Class2_Sub42 local3878 = (Class2_Sub42) Static465.aClass181_49.method3972(); local3878 != null; local3878 = (Class2_Sub42) Static465.aClass181_49.method3975()) {
												if (local3878.anInt7064 >= Static183.anInt3210 && local3878.anInt7064 < Static183.anInt3210 + 8 && local3878.anInt7066 >= Static340.anInt6081 && Static340.anInt6081 + 8 > local3878.anInt7066 && Static344.anInt6100 == local3878.anInt7065) {
													local3878.anInt7067 = 0;
												}
											}
											Static117.aClass25_55 = null;
											return true;
										} else {
											@Pc(3945) byte local3945;
											if (Static365.aClass25_105 == Static117.aClass25_55) {
												local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
												local3945 = Static202.aClass2_Sub17_Sub1_1.method6123();
												Static63.aClass120_2.method2537(local215, local3945);
												Static117.aClass25_55 = null;
												return true;
											} else if (Static416.aClass25_122 == Static117.aClass25_55) {
												local215 = Static202.aClass2_Sub17_Sub1_1.method6129();
												local73 = Static202.aClass2_Sub17_Sub1_1.method6110();
												if (local73 == 65535) {
													local73 = -1;
												}
												local223 = Static202.aClass2_Sub17_Sub1_1.method6148();
												if (Static153.method2305(local223)) {
													Static34.method564(local215, local73);
												}
												Static117.aClass25_55 = null;
												return true;
											} else if (Static38.aClass25_14 == Static117.aClass25_55) {
												Static233.method3184(Static259.aClass163_11);
												Static117.aClass25_55 = null;
												return true;
											} else if (Static117.aClass25_55 == Static67.aClass25_27) {
												Static361.anInt6411 = Static202.aClass2_Sub17_Sub1_1.method6149();
												Static29.anInt504 = Static144.anInt2663;
												Static117.aClass25_55 = null;
												return true;
											} else if (Static3.aClass25_1 == Static117.aClass25_55) {
												Static115.anInt1936 = Static144.anInt2663;
												Static130.anInt2196 = 1;
												Static117.aClass25_55 = null;
												return true;
											} else {
												@Pc(4070) int local4070;
												if (Static192.aClass25_80 == Static117.aClass25_55) {
													local692 = Static202.aClass2_Sub17_Sub1_1.method6138() == 1;
													local696 = Static202.aClass2_Sub17_Sub1_1.method6141();
													local698 = local696;
													if (local692) {
														local698 = Static202.aClass2_Sub17_Sub1_1.method6141();
													}
													local2208 = Static202.aClass2_Sub17_Sub1_1.method6148();
													local2213 = Static202.aClass2_Sub17_Sub1_1.method6145();
													local1113 = Static202.aClass2_Sub17_Sub1_1.method6138();
													@Pc(4066) long local4066 = local2213 + (local2208 << 32);
													@Pc(4068) boolean local4068 = false;
													local4070 = 0;
													while (true) {
														if (local4070 >= 100) {
															if (local1113 <= 1) {
																if (Static3.aBoolean3 && !Static203.aBoolean230 || Static46.aBoolean36) {
																	local4068 = true;
																} else if (Static27.method463(local698)) {
																	local4068 = true;
																}
															}
															break;
														}
														if (Static262.aLongArray2[local4070] == local4066) {
															local4068 = true;
															break;
														}
														local4070++;
													}
													if (!local4068 && Static428.anInt7267 == 0) {
														Static262.aLongArray2[Static240.anInt4050] = local4066;
														Static240.anInt4050 = (Static240.anInt4050 + 1) % 100;
														@Pc(4127) String local4127 = Static461.method6254(Static358.method5939(Static202.aClass2_Sub17_Sub1_1));
														if (local1113 == 2) {
															Static264.method3702(-1, local4127, null, "<img=1>" + local698, "<img=1>" + local696, 7, 0);
														} else if (local1113 == 1) {
															Static264.method3702(-1, local4127, null, "<img=0>" + local698, "<img=0>" + local696, 7, 0);
														} else {
															Static264.method3702(-1, local4127, null, local698, local696, 3, 0);
														}
													}
													Static117.aClass25_55 = null;
													return true;
												} else if (Static370.aClass25_157 == Static117.aClass25_55) {
													local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
													local73 = Static202.aClass2_Sub17_Sub1_1.method6153();
													local223 = Static202.aClass2_Sub17_Sub1_1.method6125();
													local300 = Static202.aClass2_Sub17_Sub1_1.method6168();
													if (Static153.method2305(local215)) {
														local2391 = (Class2_Sub9) Static394.aClass220_45.method5099((long) local223);
														if (local2391 != null) {
															Static343.method2399(local73 != local2391.anInt1143, local2391, false);
														}
														Static220.method3068(false, local73, local300, local223);
													}
													Static117.aClass25_55 = null;
													return true;
												} else if (Static117.aClass25_55 == Static383.aClass25_162) {
													local215 = Static202.aClass2_Sub17_Sub1_1.method6138();
													if (Static202.aClass2_Sub17_Sub1_1.method6138() == 0) {
														aClass197Array1[local215] = new Class197();
													} else {
														Static202.aClass2_Sub17_Sub1_1.anInt7523--;
														aClass197Array1[local215] = new Class197(Static202.aClass2_Sub17_Sub1_1);
													}
													Static117.aClass25_55 = null;
													Static89.anInt1080 = Static144.anInt2663;
													return true;
												} else if (Static329.aClass25_138 == Static117.aClass25_55) {
													Static63.aClass120_2.method2534();
													Static46.anInt759 += 32;
													Static117.aClass25_55 = null;
													return true;
												} else if (Static117.aClass25_55 == Static269.aClass25_58) {
													local344 = Static202.aClass2_Sub17_Sub1_1.method6141();
													local696 = Static461.method6254(Static358.method5939(Static202.aClass2_Sub17_Sub1_1));
													Static94.method4447(local344, local344, local696, 6, 0);
													Static117.aClass25_55 = null;
													return true;
												} else if (Static117.aClass25_55 == Static414.aClass25_175) {
													Static233.method3184(Static92.aClass163_6);
													Static117.aClass25_55 = null;
													return true;
												} else if (Static236.aClass25_92 == Static117.aClass25_55) {
													local215 = Static202.aClass2_Sub17_Sub1_1.method6110();
													if (local215 == 65535) {
														local215 = -1;
													}
													local73 = Static202.aClass2_Sub17_Sub1_1.method6114();
													local223 = local73 >> 28 & 0x3;
													local300 = local73 >> 14 & 0x3FFF;
													local450 = local73 & 0x3FFF;
													local454 = Static202.aClass2_Sub17_Sub1_1.method6119();
													local1876 = local454 >> 2;
													local1113 = local454 & 0x3;
													local1755 = Static191.anIntArray275[local1876];
													local300 -= Static386.anInt7205;
													local450 -= Static153.anInt2798;
													Static79.method1179(local223, local300, local1876, local1113, local450, local215, local1755);
													Static117.aClass25_55 = null;
													return true;
												} else if (Static389.aClass25_165 == Static117.aClass25_55) {
													local215 = Static202.aClass2_Sub17_Sub1_1.method6115();
													local73 = Static202.aClass2_Sub17_Sub1_1.method6124();
													local223 = Static202.aClass2_Sub17_Sub1_1.method6124();
													local300 = Static202.aClass2_Sub17_Sub1_1.method6171();
													local450 = Static202.aClass2_Sub17_Sub1_1.method6153();
													local714 = (local215 & 0x80) != 0;
													if (local300 >> 30 == 0) {
														@Pc(4671) Class109 local4671;
														@Pc(4651) Class139 local4651;
														@Pc(4665) Class109 local4665;
														if (local300 >> 29 != 0) {
															local1876 = local300 & 0xFFFF;
															@Pc(4881) Class2_Sub34 local4881 = (Class2_Sub34) Static400.aClass220_41.method5099((long) local1876);
															if (local4881 != null) {
																if (local450 == 65535) {
																	local450 = -1;
																}
																@Pc(4893) Class11_Sub5_Sub2_Sub2 local4893 = local4881.aClass11_Sub5_Sub2_Sub2_2;
																@Pc(4895) boolean local4895 = true;
																local2226 = local714 ? local4893.anInt7633 : local4893.anInt7667;
																if (local450 != -1 && local2226 != -1) {
																	if (local450 == local2226) {
																		local4651 = Static399.aClass100_2.method2197(local450);
																		if (local4651.aBoolean228 && local4651.anInt3448 != -1) {
																			local4665 = Static37.aClass80_1.method1879(local4651.anInt3448);
																			local2503 = local4665.anInt2788;
																			if (local2503 == 0 || local2503 == 2) {
																				local4895 = false;
																			} else if (local2503 == 1) {
																				local4895 = true;
																			}
																		}
																	} else {
																		local4651 = Static399.aClass100_2.method2197(local450);
																		@Pc(4927) Class139 local4927 = Static399.aClass100_2.method2197(local2226);
																		if (local4651.anInt3448 != -1 && local4927.anInt3448 != -1) {
																			local4671 = Static37.aClass80_1.method1879(local4651.anInt3448);
																			@Pc(4947) Class109 local4947 = Static37.aClass80_1.method1879(local4927.anInt3448);
																			if (local4947.anInt2777 > local4671.anInt2777) {
																				local4895 = false;
																			}
																		}
																	}
																}
																if (local4895) {
																	if (local714) {
																		local4893.anInt7655 = 0;
																		local4893.anInt7635 = local215 & 0x7;
																		local4893.anInt7666 = 1;
																		local4893.anInt7633 = local450;
																		local4893.anInt7679 = 0;
																		local4893.anInt7658 = local223 + Static277.anInt5022;
																		local4893.anInt7684 = local73;
																		if (Static277.anInt5022 < local4893.anInt7658) {
																			local4893.anInt7679 = -1;
																		}
																		if (local4893.anInt7633 != -1 && Static277.anInt5022 == local4893.anInt7658) {
																			local4070 = Static399.aClass100_2.method2197(local4893.anInt7633).anInt3448;
																			if (local4070 != -1) {
																				local4665 = Static37.aClass80_1.method1879(local4070);
																				if (local4665 != null && local4665.anIntArray240 != null) {
																					Static245.method3411(false, 0, local4665, local4893.anInt7626, local4893.anInt7622, local4893.aByte101);
																				}
																			}
																		}
																	} else {
																		local4893.anInt7703 = 1;
																		local4893.anInt7694 = 0;
																		local4893.anInt7676 = local73;
																		local4893.anInt7667 = local450;
																		local4893.anInt7645 = Static277.anInt5022 + local223;
																		local4893.anInt7628 = local215 & 0x7;
																		local4893.anInt7683 = 0;
																		if (local4893.anInt7645 > Static277.anInt5022) {
																			local4893.anInt7694 = -1;
																		}
																		if (local4893.anInt7667 != -1 && local4893.anInt7645 == Static277.anInt5022) {
																			local4070 = Static399.aClass100_2.method2197(local4893.anInt7667).anInt3448;
																			if (local4070 != -1) {
																				local4665 = Static37.aClass80_1.method1879(local4070);
																				if (local4665 != null && local4665.anIntArray240 != null) {
																					Static245.method3411(false, 0, local4665, local4893.anInt7626, local4893.anInt7622, local4893.aByte101);
																				}
																			}
																		}
																	}
																}
															}
														} else if (local300 >> 28 != 0) {
															local1876 = local300 & 0xFFFF;
															@Pc(4565) Class11_Sub5_Sub2_Sub1 local4565;
															if (local1876 == Static94.anInt5592) {
																local4565 = Static127.aClass11_Sub5_Sub2_Sub1_2;
															} else {
																local4565 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local1876];
															}
															if (local4565 != null) {
																if (local450 == 65535) {
																	local450 = -1;
																}
																local1134 = true;
																local1765 = local714 ? local4565.anInt7633 : local4565.anInt7667;
																@Pc(4615) Class109 local4615;
																if (local450 != -1 && local1765 != -1) {
																	@Pc(4602) Class139 local4602;
																	if (local1765 == local450) {
																		local4602 = Static399.aClass100_2.method2197(local450);
																		if (local4602.aBoolean228 && local4602.anInt3448 != -1) {
																			local4615 = Static37.aClass80_1.method1879(local4602.anInt3448);
																			local2830 = local4615.anInt2788;
																			if (local2830 == 0 || local2830 == 2) {
																				local1134 = false;
																			} else if (local2830 == 1) {
																				local1134 = true;
																			}
																		}
																	} else {
																		local4602 = Static399.aClass100_2.method2197(local450);
																		local4651 = Static399.aClass100_2.method2197(local1765);
																		if (local4602.anInt3448 != -1 && local4651.anInt3448 != -1) {
																			local4665 = Static37.aClass80_1.method1879(local4602.anInt3448);
																			local4671 = Static37.aClass80_1.method1879(local4651.anInt3448);
																			if (local4671.anInt2777 > local4665.anInt2777) {
																				local1134 = false;
																			}
																		}
																	}
																}
																if (local1134) {
																	if (local714) {
																		local4565.anInt7658 = local223 + Static277.anInt5022;
																		local4565.anInt7666 = 1;
																		local4565.anInt7684 = local73;
																		local4565.anInt7679 = 0;
																		local4565.anInt7655 = 0;
																		local4565.anInt7633 = local450;
																		local4565.anInt7635 = local215 & 0x7;
																		if (local4565.anInt7633 == 65535) {
																			local4565.anInt7633 = -1;
																		}
																		if (local4565.anInt7658 > Static277.anInt5022) {
																			local4565.anInt7679 = -1;
																		}
																		if (local4565.anInt7633 != -1 && local4565.anInt7658 == Static277.anInt5022) {
																			local2226 = Static399.aClass100_2.method2197(local4565.anInt7633).anInt3448;
																			if (local2226 != -1) {
																				local4615 = Static37.aClass80_1.method1879(local2226);
																				if (local4615 != null && local4615.anIntArray240 != null) {
																					Static245.method3411(Static127.aClass11_Sub5_Sub2_Sub1_2 == local4565, 0, local4615, local4565.anInt7626, local4565.anInt7622, local4565.aByte101);
																				}
																			}
																		}
																	} else {
																		local4565.anInt7694 = 0;
																		local4565.anInt7683 = 0;
																		local4565.anInt7676 = local73;
																		local4565.anInt7703 = 1;
																		local4565.anInt7628 = local215 & 0x7;
																		local4565.anInt7667 = local450;
																		local4565.anInt7645 = Static277.anInt5022 + local223;
																		if (local4565.anInt7667 == 65535) {
																			local4565.anInt7667 = -1;
																		}
																		if (local4565.anInt7645 > Static277.anInt5022) {
																			local4565.anInt7694 = -1;
																		}
																		if (local4565.anInt7667 != -1 && Static277.anInt5022 == local4565.anInt7645) {
																			local2226 = Static399.aClass100_2.method2197(local4565.anInt7667).anInt3448;
																			if (local2226 != -1) {
																				local4615 = Static37.aClass80_1.method1879(local2226);
																				if (local4615 != null && local4615.anIntArray240 != null) {
																					Static245.method3411(Static127.aClass11_Sub5_Sub2_Sub1_2 == local4565, 0, local4615, local4565.anInt7626, local4565.anInt7622, local4565.aByte101);
																				}
																			}
																		}
																	}
																}
															}
														}
													} else {
														local1876 = local300 >> 28 & 0x3;
														local1113 = (local300 >> 14 & 0x3FFF) - Static386.anInt7205;
														local1755 = (local300 & 0x3FFF) - Static153.anInt2798;
														if (local1113 >= 0 && local1755 >= 0 && local1113 < Static234.anInt3949 && Static371.anInt6492 > local1755) {
															local1765 = local1113 * 128 + 64;
															local2226 = local1755 * 128 + 64;
															local4070 = local1876;
															if (local1876 < 3 && Static369.method5157(local1755, local1113)) {
																local4070 = local1876 + 1;
															}
															@Pc(4533) Class11_Sub5_Sub1 local4533 = new Class11_Sub5_Sub1(local450, 0, Static277.anInt5022, local1876, local4070, local1765, Static365.method3535(local1876, local1765, local2226) - local73, local2226, local1113, local1113, local1755, local1755, local215);
															Static364.aClass181_38.method3973(new Class2_Sub1_Sub18(local4533));
														}
													}
													Static117.aClass25_55 = null;
													return true;
												} else if (Static117.aClass25_55 == Static83.aClass25_32) {
													Static233.method3184(Static84.aClass163_20);
													Static117.aClass25_55 = null;
													return true;
												} else if (Static368.aClass25_184 == Static117.aClass25_55) {
													local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
													local73 = Static202.aClass2_Sub17_Sub1_1.method6110();
													local223 = Static202.aClass2_Sub17_Sub1_1.method6138();
													if (Static153.method2305(local73)) {
														if (local223 == 2) {
															Static238.method3233();
														}
														Static103.anInt5365 = local215;
														Static135.method1387(local215);
														Static92.method1399(false);
														Static76.method1144(Static103.anInt5365);
														for (local300 = 0; local300 < 100; local300++) {
															Static186.aBooleanArray12[local300] = true;
														}
													}
													Static117.aClass25_55 = null;
													return true;
												} else if (Static117.aClass25_55 == Static181.aClass25_73) {
													Static292.anInt5208 = Static202.aClass2_Sub17_Sub1_1.method6109();
													Static3.aBoolean3 = Static202.aClass2_Sub17_Sub1_1.method6138() == 1;
													Static117.aClass25_55 = null;
													return true;
												} else if (Static117.aClass25_55 == Static117.aClass25_54) {
													local215 = Static202.aClass2_Sub17_Sub1_1.method6114();
													local73 = Static202.aClass2_Sub17_Sub1_1.method6110();
													if (Static153.method2305(local73)) {
														Static113.method1866(-1, 3, -1, local215);
													}
													Static117.aClass25_55 = null;
													return true;
												} else if (Static117.aClass25_55 == Static200.aClass25_81) {
													local215 = Static202.aClass2_Sub17_Sub1_1.method6124();
													local3945 = Static202.aClass2_Sub17_Sub1_1.method6120();
													local223 = Static202.aClass2_Sub17_Sub1_1.method6153();
													if (Static153.method2305(local215)) {
														Static100.method1447(local3945, local223);
													}
													Static117.aClass25_55 = null;
													return true;
												} else if (Static117.aClass25_55 == Static292.aClass25_126) {
													Static233.method3184(Static337.aClass163_15);
													Static117.aClass25_55 = null;
													return true;
												} else if (Static410.aClass25_173 == Static117.aClass25_55) {
													local215 = Static202.aClass2_Sub17_Sub1_1.method6114();
													local73 = Static202.aClass2_Sub17_Sub1_1.method6124();
													local223 = Static202.aClass2_Sub17_Sub1_1.method6148();
													if (Static153.method2305(local223)) {
														Static358.method5941(local215, local73);
													}
													Static117.aClass25_55 = null;
													return true;
												} else if (Static90.aClass25_38 == Static117.aClass25_55) {
													Static233.method3184(Static340.aClass163_16);
													Static117.aClass25_55 = null;
													return true;
												} else if (Static357.aClass25_152 == Static117.aClass25_55) {
													local215 = Static202.aClass2_Sub17_Sub1_1.method6124();
													local73 = Static202.aClass2_Sub17_Sub1_1.method6125();
													if (Static153.method2305(local215)) {
														Static113.method1866(Static94.anInt5592, 5, 0, local73);
													}
													Static117.aClass25_55 = null;
													return true;
												} else if (Static141.aClass25_174 == Static117.aClass25_55) {
													if (Static50.aFrame1 != null) {
														Static291.method4115(false, -1, -1, Static434.aClass165_Sub1_1.anInt4206);
													}
													@Pc(5392) byte[] local5392 = new byte[Static302.anInt5465];
													Static202.aClass2_Sub17_Sub1_1.method5582(Static302.anInt5465, local5392);
													local696 = Static186.method2710(local5392, 0, Static302.anInt5465);
													Static87.method1366(Static138.aClass194_2, Static404.anInt2752 == 1, local696, true);
													Static117.aClass25_55 = null;
													return true;
												} else if (Static322.aClass25_133 == Static117.aClass25_55) {
													local215 = Static202.aClass2_Sub17_Sub1_1.method6129();
													local73 = Static202.aClass2_Sub17_Sub1_1.method6110();
													Static63.aClass120_2.method2531(local215, local73);
													Static117.aClass25_55 = null;
													return true;
												} else if (Static93.aClass25_40 == Static117.aClass25_55) {
													local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
													if (Static153.method2305(local215)) {
														Static68.method1064();
													}
													Static117.aClass25_55 = null;
													return true;
												} else if (Static117.aClass25_55 == Static331.aClass25_141) {
													local215 = Static202.aClass2_Sub17_Sub1_1.method6138();
													local696 = Static202.aClass2_Sub17_Sub1_1.method6141();
													local223 = Static202.aClass2_Sub17_Sub1_1.method6168();
													local300 = Static202.aClass2_Sub17_Sub1_1.method6148();
													if (local300 == 65535) {
														local300 = -1;
													}
													if (local215 >= 1 && local215 <= 8) {
														if (local696.equalsIgnoreCase("null")) {
															local696 = null;
														}
														Static206.aStringArray42[local215 - 1] = local696;
														Static67.anIntArray86[local215 - 1] = local300;
														Static192.aBooleanArray13[local215 - 1] = local223 == 0;
													}
													Static117.aClass25_55 = null;
													return true;
												} else if (Static117.aClass25_55 == Static169.aClass25_74) {
													local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
													if (Static153.method2305(local215)) {
														Static410.method5652();
													}
													Static117.aClass25_55 = null;
													return true;
												} else {
													@Pc(5596) long local5596;
													@Pc(5611) Class2_Sub45 local5611;
													@Pc(5602) Class2_Sub45 local5602;
													if (Static117.aClass25_55 == Static159.aClass25_69) {
														local215 = Static202.aClass2_Sub17_Sub1_1.method6114();
														local73 = Static202.aClass2_Sub17_Sub1_1.method6124();
														if (local73 == 65535) {
															local73 = -1;
														}
														local223 = Static202.aClass2_Sub17_Sub1_1.method6129();
														local300 = Static202.aClass2_Sub17_Sub1_1.method6153();
														local450 = Static202.aClass2_Sub17_Sub1_1.method6110();
														if (local450 == 65535) {
															local450 = -1;
														}
														if (Static153.method2305(local300)) {
															for (local454 = local450; local454 <= local73; local454++) {
																local5596 = ((long) local223 << 32) + ((long) local454);
																local5602 = (Class2_Sub45) Static439.aClass220_43.method5099(local5596);
																if (local5602 != null) {
																	local5611 = new Class2_Sub45(local215, local5602.anInt7334);
																	local5602.method6260();
																} else if (local454 == -1) {
																	local5611 = new Class2_Sub45(local215, Static160.method2380(local223).aClass2_Sub45_2.anInt7334);
																} else {
																	local5611 = new Class2_Sub45(local215, -1);
																}
																Static439.aClass220_43.method5104(local5611, local5596);
															}
														}
														Static117.aClass25_55 = null;
														return true;
													} else if (Static117.aClass25_55 == Static56.aClass25_22) {
														local344 = Static202.aClass2_Sub17_Sub1_1.method6141();
														local73 = Static202.aClass2_Sub17_Sub1_1.method6148();
														local698 = Static230.aClass179_2.method3930(local73).method50(Static202.aClass2_Sub17_Sub1_1);
														Static264.method3702(local73, local698, null, local344, local344, 19, 0);
														Static117.aClass25_55 = null;
														return true;
													} else if (Static65.aClass25_26 == Static117.aClass25_55) {
														Static233.method3184(Static317.aClass163_13);
														Static117.aClass25_55 = null;
														return true;
													} else if (Static327.aClass25_137 == Static117.aClass25_55) {
														local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
														local696 = Static202.aClass2_Sub17_Sub1_1.method6141();
														@Pc(5709) Object[] local5709 = new Object[local696.length() + 1];
														for (local300 = local696.length() - 1; local300 >= 0; local300--) {
															if (local696.charAt(local300) == 's') {
																local5709[local300 + 1] = Static202.aClass2_Sub17_Sub1_1.method6141();
															} else {
																local5709[local300 + 1] = Integer.valueOf(Static202.aClass2_Sub17_Sub1_1.method6129());
															}
														}
														local5709[0] = Integer.valueOf(Static202.aClass2_Sub17_Sub1_1.method6129());
														if (Static153.method2305(local215)) {
															@Pc(5762) Class2_Sub18 local5762 = new Class2_Sub18();
															local5762.anObjectArray33 = local5709;
															Static76.method1143(local5762);
														}
														Static117.aClass25_55 = null;
														return true;
													} else if (Static117.aClass25_55 == Static345.aClass25_146) {
														Static127.method2017(Static138.aClass194_2, Static302.anInt5465, Static202.aClass2_Sub17_Sub1_1);
														Static117.aClass25_55 = null;
														return true;
													} else if (Static240.aClass25_95 == Static117.aClass25_55) {
														local215 = Static202.aClass2_Sub17_Sub1_1.method6153();
														local73 = Static202.aClass2_Sub17_Sub1_1.method6110();
														local223 = Static202.aClass2_Sub17_Sub1_1.method6125();
														local300 = Static202.aClass2_Sub17_Sub1_1.method6171();
														if (Static153.method2305(local73)) {
															Static113.method1866(local215, 5, local223, local300);
														}
														Static117.aClass25_55 = null;
														return true;
													} else if (Static117.aClass25_55 == Static291.aClass25_125) {
														Static360.method5072(false);
														Static117.aClass25_55 = null;
														return false;
													} else if (Static117.aClass25_55 == Static274.aClass25_114) {
														local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
														local73 = Static202.aClass2_Sub17_Sub1_1.method6138();
														Static63.aClass120_2.method2531(local73, local215);
														Static117.aClass25_55 = null;
														return true;
													} else if (Static117.aClass25_55 == Static389.aClass25_164) {
														local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
														if (local215 == 65535) {
															local215 = -1;
														}
														local73 = Static202.aClass2_Sub17_Sub1_1.method6148();
														local223 = Static202.aClass2_Sub17_Sub1_1.method6153();
														local300 = Static202.aClass2_Sub17_Sub1_1.method6148();
														if (local300 == 65535) {
															local300 = -1;
														}
														local450 = Static202.aClass2_Sub17_Sub1_1.method6125();
														if (Static153.method2305(local73)) {
															for (local454 = local300; local454 <= local215; local454++) {
																local5596 = (long) local454 + ((long) local450 << 32);
																local5602 = (Class2_Sub45) Static439.aClass220_43.method5099(local5596);
																if (local5602 != null) {
																	local5611 = new Class2_Sub45(local5602.anInt7337, local223);
																	local5602.method6260();
																} else if (local454 == -1) {
																	local5611 = new Class2_Sub45(Static160.method2380(local450).aClass2_Sub45_2.anInt7337, local223);
																} else {
																	local5611 = new Class2_Sub45(0, local223);
																}
																Static439.aClass220_43.method5104(local5611, local5596);
															}
														}
														Static117.aClass25_55 = null;
														return true;
													} else if (Static44.aClass25_15 == Static117.aClass25_55) {
														Static433.anInt7312 = Static202.aClass2_Sub17_Sub1_1.method6138();
														Static117.aClass25_55 = null;
														return true;
													} else if (Static392.aClass25_167 == Static117.aClass25_55) {
														local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
														local73 = Static202.aClass2_Sub17_Sub1_1.method6129();
														if (Static153.method2305(local215)) {
															@Pc(5991) Class2_Sub9 local5991 = (Class2_Sub9) Static394.aClass220_45.method5099((long) local73);
															if (local5991 != null) {
																Static343.method2399(true, local5991, false);
															}
															if (Static361.aClass93_17 != null) {
																Static383.method5263(Static361.aClass93_17);
																Static361.aClass93_17 = null;
															}
														}
														Static117.aClass25_55 = null;
														return true;
													} else if (Static261.aClass25_109 == Static117.aClass25_55) {
														local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
														local73 = Static202.aClass2_Sub17_Sub1_1.method6138();
														local1693 = (local73 & 0x1) == 1;
														while (Static302.anInt5465 > Static202.aClass2_Sub17_Sub1_1.anInt7523) {
															local300 = Static202.aClass2_Sub17_Sub1_1.method6174();
															local450 = Static202.aClass2_Sub17_Sub1_1.method6148();
															local454 = 0;
															if (local450 != 0) {
																local454 = Static202.aClass2_Sub17_Sub1_1.method6138();
																if (local454 == 255) {
																	local454 = Static202.aClass2_Sub17_Sub1_1.method6129();
																}
															}
															Static289.method4098(local215, local1693, local300, local454, local450 - 1);
														}
														Static213.anIntArray337[Static80.anInt6196++ & 0x1F] = local215;
														Static117.aClass25_55 = null;
														return true;
													} else if (Static392.aClass25_166 == Static117.aClass25_55) {
														local215 = Static202.aClass2_Sub17_Sub1_1.method6110();
														local73 = Static202.aClass2_Sub17_Sub1_1.method6124();
														local223 = Static202.aClass2_Sub17_Sub1_1.method6148();
														local300 = Static202.aClass2_Sub17_Sub1_1.method6129();
														local450 = Static202.aClass2_Sub17_Sub1_1.method6153();
														if (Static153.method2305(local450)) {
															Static352.method4952(local300, local73, local223, local215);
														}
														Static117.aClass25_55 = null;
														return true;
													} else if (Static353.aClass25_151 == Static117.aClass25_55) {
														Static127.anInt2142 = Static202.aClass2_Sub17_Sub1_1.method6138();
														for (local215 = 0; local215 < Static127.anInt2142; local215++) {
															Static268.aStringArray47[local215] = Static202.aClass2_Sub17_Sub1_1.method6141();
															Static296.aStringArray49[local215] = Static202.aClass2_Sub17_Sub1_1.method6141();
															if (Static296.aStringArray49[local215].equals("")) {
																Static296.aStringArray49[local215] = Static268.aStringArray47[local215];
															}
															Static80.aStringArray58[local215] = Static202.aClass2_Sub17_Sub1_1.method6141();
															Static148.aStringArray32[local215] = Static202.aClass2_Sub17_Sub1_1.method6141();
															if (Static148.aStringArray32[local215].equals("")) {
																Static148.aStringArray32[local215] = Static80.aStringArray58[local215];
															}
															Static398.aBooleanArray22[local215] = false;
														}
														Static117.aClass25_55 = null;
														Static115.anInt1936 = Static144.anInt2663;
														return true;
													} else if (Static117.aClass25_55 == Static274.aClass25_115) {
														Static152.method2296();
														Static117.aClass25_55 = null;
														return false;
													} else if (Static117.aClass25_55 == Static405.aClass25_172) {
														Static183.anInt3210 = Static202.aClass2_Sub17_Sub1_1.method6120() << 3;
														Static340.anInt6081 = Static202.aClass2_Sub17_Sub1_1.method6173() << 3;
														Static344.anInt6100 = Static202.aClass2_Sub17_Sub1_1.method6168();
														while (Static302.anInt5465 > Static202.aClass2_Sub17_Sub1_1.anInt7523) {
															@Pc(6233) Class163 local6233 = Static350.method4926()[Static202.aClass2_Sub17_Sub1_1.method6138()];
															Static233.method3184(local6233);
														}
														Static117.aClass25_55 = null;
														return true;
													} else if (Static117.aClass25_55 == Static208.aClass25_147) {
														Static20.aString3 = Static302.anInt5465 <= 2 ? Static88.aClass231_76.method5261(Static80.anInt6195) : Static202.aClass2_Sub17_Sub1_1.method6141();
														Static448.anInt7474 = Static302.anInt5465 <= 0 ? -1 : Static202.aClass2_Sub17_Sub1_1.method6148();
														Static117.aClass25_55 = null;
														if (Static448.anInt7474 == 65535) {
															Static448.anInt7474 = -1;
														}
														return true;
													} else if (Static119.aClass25_56 == Static117.aClass25_55) {
														Static398.method5580(Static202.aClass2_Sub17_Sub1_1.method6141());
														Static117.aClass25_55 = null;
														return true;
													} else if (Static379.aClass25_89 == Static117.aClass25_55) {
														local215 = Static202.aClass2_Sub17_Sub1_1.method6153();
														local73 = Static202.aClass2_Sub17_Sub1_1.method6119();
														if (Static153.method2305(local215)) {
															Static264.anInt4626 = local73;
														}
														Static117.aClass25_55 = null;
														return true;
													} else if (Static117.aClass25_55 == Static276.aClass25_116) {
														local215 = Static202.aClass2_Sub17_Sub1_1.method6124();
														local73 = Static202.aClass2_Sub17_Sub1_1.method6125();
														local223 = Static202.aClass2_Sub17_Sub1_1.method6124();
														if (local223 == 65535) {
															local223 = -1;
														}
														if (Static153.method2305(local215)) {
															Static113.method1866(local223, 1, -1, local73);
														}
														Static117.aClass25_55 = null;
														return true;
													} else if (Static117.aClass25_55 == Static217.aClass25_84) {
														Static233.method3184(Static143.aClass163_8);
														Static117.aClass25_55 = null;
														return true;
													} else if (Static271.aClass25_113 == Static117.aClass25_55) {
														local215 = Static202.aClass2_Sub17_Sub1_1.method6146();
														local73 = Static202.aClass2_Sub17_Sub1_1.method6129();
														local223 = Static202.aClass2_Sub17_Sub1_1.method6146();
														local300 = Static202.aClass2_Sub17_Sub1_1.method6124();
														if (Static153.method2305(local300)) {
															Static111.method1810(local215, local223, local73);
														}
														Static117.aClass25_55 = null;
														return true;
													} else if (Static268.aClass25_111 == Static117.aClass25_55) {
														local215 = Static202.aClass2_Sub17_Sub1_1.method6148();
														if (local215 == 65535) {
															local215 = -1;
														}
														local73 = Static202.aClass2_Sub17_Sub1_1.method6138();
														local223 = Static202.aClass2_Sub17_Sub1_1.method6148();
														local300 = Static202.aClass2_Sub17_Sub1_1.method6138();
														Static401.method5618(local223, local300, local73, local215);
														Static117.aClass25_55 = null;
														return true;
													} else {
														Static22.method402(null, "T1 - " + (Static117.aClass25_55 == null ? -1 : Static117.aClass25_55.method473()) + "," + (Static463.aClass25_185 == null ? -1 : Static463.aClass25_185.method473()) + "," + (Static359.aClass25_154 == null ? -1 : Static359.aClass25_154.method473()) + " - " + Static302.anInt5465);
														Static360.method5072(false);
														return true;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
