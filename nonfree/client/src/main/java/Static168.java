import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!fea", name = "s", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!fea", name = "r", descriptor = "I")
	public static int anInt2904;

	@OriginalMember(owner = "client!fea", name = "p", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_53 = new Class225(73, -2);

	@OriginalMember(owner = "client!fea", name = "m", descriptor = "Z")
	public static boolean aBoolean286 = false;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILclient!lf;)Z")
	public static boolean method2526(@OriginalArg(1) Class221 arg0) throws IOException {
		@Pc(8) Class5 local8 = arg0.aClass5_2;
		@Pc(11) Class2_Sub20_Sub2 local11 = arg0.aClass2_Sub20_Sub2_2;
		if (local8 == null) {
			return false;
		}
		@Pc(104) int local104;
		if (arg0.aClass225_108 == null) {
			if (arg0.aBoolean489) {
				if (!local8.method106(1)) {
					return false;
				}
				local8.method109(0, arg0.aClass2_Sub20_Sub2_2.aByteArray111, 1);
				arg0.anInt5770 = 0;
				arg0.aBoolean489 = false;
				arg0.anInt5775++;
			}
			local11.anInt9723 = 0;
			if (local11.method8600()) {
				if (!local8.method106(1)) {
					return false;
				}
				local8.method109(1, arg0.aClass2_Sub20_Sub2_2.aByteArray111, 1);
				arg0.anInt5775++;
				arg0.anInt5770 = 0;
			}
			arg0.aBoolean489 = true;
			@Pc(100) Class225[] local100 = Static62.method943();
			local104 = local11.method8604();
			if (local104 < 0 || local100.length <= local104) {
				throw new IOException("invo:" + local104 + " ip:" + local11.anInt9723);
			}
			arg0.aClass225_108 = local100[local104];
			arg0.anInt5773 = arg0.aClass225_108.anInt5879;
		}
		if (arg0.anInt5773 == -1) {
			if (!local8.method106(1)) {
				return false;
			}
			local8.method109(0, local11.aByteArray111, 1);
			arg0.anInt5775++;
			arg0.anInt5770 = 0;
			arg0.anInt5773 = local11.aByteArray111[0] & 0xFF;
		}
		if (arg0.anInt5773 == -2) {
			if (!local8.method106(2)) {
				return false;
			}
			local8.method109(0, local11.aByteArray111, 2);
			local11.anInt9723 = 0;
			arg0.anInt5773 = local11.method8575();
			arg0.anInt5770 = 0;
			arg0.anInt5775 += 2;
		}
		if (arg0.anInt5773 > 0) {
			if (!local8.method106(arg0.anInt5773)) {
				return false;
			}
			local11.anInt9723 = 0;
			local8.method109(0, local11.aByteArray111, arg0.anInt5773);
			arg0.anInt5770 = 0;
			arg0.anInt5775 += arg0.anInt5773;
		}
		arg0.aClass225_110 = arg0.aClass225_109;
		arg0.aClass225_109 = arg0.aClass225_111;
		arg0.aClass225_111 = arg0.aClass225_108;
		@Pc(297) int local297;
		if (Static674.aClass225_202 == arg0.aClass225_108) {
			local297 = local11.method8555(-9372);
			local104 = local11.method8554(31493);
			Static471.method6759();
			Static278.method3935(local104, local297);
			arg0.aClass225_108 = null;
			return true;
		} else if (Static648.aClass225_194 == arg0.aClass225_108) {
			Static152.anInt2510 = local11.method8538() << 3;
			Static592.anInt9253 = local11.method8594() << 3;
			Static548.anInt8645 = local11.method8588();
			arg0.aClass225_108 = null;
			return true;
		} else if (Static285.aClass225_83 == arg0.aClass225_108) {
			Static264.method3744(Static237.aBoolean968);
			arg0.aClass225_108 = null;
			return false;
		} else if (arg0.aClass225_108 == Static154.aClass225_46) {
			Static34.method7593(Static346.aClass281_13);
			arg0.aClass225_108 = null;
			return true;
		} else if (Static15.aClass225_12 == arg0.aClass225_108) {
			local297 = local11.method8593();
			local104 = local11.method8588();
			if (local104 == 255) {
				local104 = -1;
				local297 = -1;
			}
			Static554.method7733(local297, local104);
			arg0.aClass225_108 = null;
			return true;
		} else if (Static541.aClass225_160 == arg0.aClass225_108) {
			Static11.method205(local11, arg0.anInt5773);
			arg0.aClass225_108 = null;
			return true;
		} else if (Static608.aClass225_182 == arg0.aClass225_108) {
			Static264.method3744(false);
			arg0.aClass225_108 = null;
			return false;
		} else if (arg0.aClass225_108 == Static526.aClass225_157) {
			Static396.aClass107_1.method2268();
			Static49.anInt646 += 32;
			arg0.aClass225_108 = null;
			return true;
		} else if (arg0.aClass225_108 == Static583.aClass225_42) {
			local297 = local11.method8540();
			local104 = local11.method8530();
			Static471.method6759();
			Static469.method6733(local104, local297);
			arg0.aClass225_108 = null;
			return true;
		} else {
			@Pc(472) String local472;
			if (arg0.aClass225_108 == Static220.aClass225_63) {
				local472 = local11.method8553();
				local104 = local11.method8554(31493);
				Static471.method6759();
				Static163.method2434(local104, local472);
				arg0.aClass225_108 = null;
				return true;
			} else if (Static612.aClass225_184 == arg0.aClass225_108) {
				local297 = local11.method8568();
				local104 = local11.method8578();
				Static471.method6759();
				Static686.method9237(local104, local297);
				arg0.aClass225_108 = null;
				return true;
			} else {
				@Pc(532) int local532;
				if (arg0.aClass225_108 == Static180.aClass225_117) {
					local297 = local11.method8555(-9372);
					local104 = local11.method8529((byte) 40);
					local532 = local11.method8559();
					if (local532 == 65535) {
						local532 = -1;
					}
					Static471.method6759();
					Static200.method2825(local532, local104, local297);
					@Pc(550) Class203 local550 = Static543.aClass37_2.method605(local532);
					Static560.method7797(local550.anInt4858, local550.anInt4880, local550.anInt4894, local297);
					Static273.method3822(local550.anInt4841, local550.anInt4846, local550.anInt4857, local297);
					arg0.aClass225_108 = null;
					return true;
				} else if (Static621.aClass225_186 == arg0.aClass225_108) {
					Static34.method7593(Static111.aClass281_5);
					arg0.aClass225_108 = null;
					return true;
				} else if (Static377.aClass225_119 == arg0.aClass225_108) {
					Static234.anObjectArray1 = new Object[Static80.aClass90_1.anInt2113];
					arg0.aClass225_108 = null;
					return true;
				} else if (arg0.aClass225_108 == Static570.aClass225_169) {
					Static194.anInt3157 = local11.method8581(-17416);
					for (local297 = 0; local297 < Static194.anInt3157; local297++) {
						Static12.aStringArray2[local297] = local11.method8553();
						Static451.aStringArray31[local297] = local11.method8553();
						if (Static451.aStringArray31[local297].equals("")) {
							Static451.aStringArray31[local297] = Static12.aStringArray2[local297];
						}
						Static514.aStringArray37[local297] = local11.method8553();
						Static490.aStringArray35[local297] = local11.method8553();
						if (Static490.aStringArray35[local297].equals("")) {
							Static490.aStringArray35[local297] = Static514.aStringArray37[local297];
						}
						Static616.aBooleanArray37[local297] = false;
					}
					arg0.aClass225_108 = null;
					Static459.anInt7473 = Static602.anInt10526;
					return true;
				} else if (Static294.aClass225_120 == arg0.aClass225_108) {
					Static612.aString104 = arg0.anInt5773 > 2 ? local11.method8553() : Static289.aClass191_26.method4067(Static414.anInt9485);
					Static240.anInt10698 = arg0.anInt5773 > 0 ? local11.method8575() : -1;
					arg0.aClass225_108 = null;
					if (Static240.anInt10698 == 65535) {
						Static240.anInt10698 = -1;
					}
					return true;
				} else {
					@Pc(756) boolean local756;
					if (Static434.aClass225_126 == arg0.aClass225_108) {
						local297 = local11.method8575();
						local104 = local11.method8593();
						local756 = (local104 & 0x1) == 1;
						Static467.method6721(local297, local756);
						Static183.anIntArray227[Static167.anInt2888++ & 0x1F] = local297;
						arg0.aClass225_108 = null;
						return true;
					}
					@Pc(825) long local825;
					@Pc(791) boolean local791;
					@Pc(795) String local795;
					@Pc(797) String local797;
					@Pc(808) long local808;
					@Pc(815) long local815;
					@Pc(819) int local819;
					@Pc(827) boolean local827;
					@Pc(829) int local829;
					@Pc(914) String local914;
					if (Static388.aClass225_122 == arg0.aClass225_108) {
						local791 = local11.method8581(-17416) == 1;
						local795 = local11.method8553();
						local797 = local795;
						if (local791) {
							local797 = local11.method8553();
						}
						local808 = (long) local11.method8575();
						local815 = (long) local11.method8583();
						local819 = local11.method8581(-17416);
						local825 = local815 + (local808 << 32);
						local827 = false;
						local829 = 0;
						while (true) {
							if (local829 >= 100) {
								if (local819 <= 1) {
									if (Static70.aBoolean137 && !Static337.aBoolean443 || Static329.aBoolean429) {
										local827 = true;
									} else if (Static255.method3623(local797)) {
										local827 = true;
									}
								}
								break;
							}
							if (Static686.aLongArray22[local829] == local825) {
								local827 = true;
								break;
							}
							local829++;
						}
						if (!local827 && Static78.anInt1358 == 0) {
							Static686.aLongArray22[Static580.anInt9161] = local825;
							Static580.anInt9161 = (Static580.anInt9161 + 1) % 100;
							local914 = Static618.method8398(Static612.method8339(local11));
							if (local819 == 2) {
								Static660.method9034(-1, (String) null, local914, local795, 7, "<img=1>" + local795, "<img=1>" + local797, 0);
							} else if (local819 == 1) {
								Static660.method9034(-1, (String) null, local914, local795, 7, "<img=0>" + local795, "<img=0>" + local797, 0);
							} else {
								Static660.method9034(-1, (String) null, local914, local795, 3, local795, local797, 0);
							}
						}
						arg0.aClass225_108 = null;
						return true;
					} else if (Static489.aClass225_144 == arg0.aClass225_108) {
						local297 = local11.method8575();
						local795 = local11.method8553();
						local756 = local11.method8581(-17416) == 1;
						Static274.aClass176_1 = Static548.aClass176_3;
						Static287.aBoolean390 = local756;
						Static296.method4170(local297, local795);
						Static261.method9374(-82, 15);
						arg0.aClass225_108 = null;
						return false;
					} else if (Static17.aClass225_13 == arg0.aClass225_108) {
						local791 = local11.method8593() == 1;
						Static471.method6759();
						Static354.aBoolean482 = local791;
						arg0.aClass225_108 = null;
						return true;
					} else if (Static345.aClass225_104 == arg0.aClass225_108) {
						Static34.method7593(Static213.aClass281_9);
						arg0.aClass225_108 = null;
						return true;
					} else if (arg0.aClass225_108 == Static482.aClass225_139) {
						Static34.method7593(Static61.aClass281_4);
						arg0.aClass225_108 = null;
						return true;
					} else if (Static376.aClass225_118 == arg0.aClass225_108) {
						Static34.method7593(Static476.aClass281_14);
						arg0.aClass225_108 = null;
						return true;
					} else {
						@Pc(1176) int local1176;
						@Pc(1313) int local1313;
						@Pc(1194) int local1194;
						@Pc(1304) int local1304;
						@Pc(1331) Class143 local1331;
						@Pc(1164) long local1164;
						if (Static592.aClass225_176 == arg0.aClass225_108) {
							Static44.anInt591 = Static602.anInt10526;
							if (arg0.anInt5773 == 0) {
								Static56.aClass143Array1 = null;
								Static664.anInt10333 = 0;
								Static409.aString69 = null;
								Static305.aString23 = null;
								arg0.aClass225_108 = null;
								return true;
							}
							Static305.aString23 = local11.method8553();
							local791 = local11.method8581(-17416) == 1;
							if (local791) {
								local11.method8553();
							}
							local1164 = local11.method8590();
							Static409.aString69 = Static580.method8080(local1164);
							Static699.aByte146 = local11.method8536();
							local1176 = local11.method8581(-17416);
							if (local1176 == 255) {
								arg0.aClass225_108 = null;
								return true;
							}
							Static664.anInt10333 = local1176;
							@Pc(1192) Class143[] local1192 = new Class143[100];
							for (local1194 = 0; local1194 < Static664.anInt10333; local1194++) {
								local1192[local1194] = new Class143();
								local1192[local1194].aString40 = local11.method8553();
								local791 = local11.method8581(-17416) == 1;
								if (local791) {
									local1192[local1194].aString41 = local11.method8553();
								} else {
									local1192[local1194].aString41 = local1192[local1194].aString40;
								}
								local1192[local1194].aString39 = Static15.method237(local1192[local1194].aString41);
								local1192[local1194].anInt3446 = local11.method8575();
								local1192[local1194].aByte69 = local11.method8536();
								local1192[local1194].aString42 = local11.method8553();
								if (local1192[local1194].aString41.equals(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aString4)) {
									Static549.aByte119 = local1192[local1194].aByte69;
								}
							}
							local1304 = Static664.anInt10333;
							while (local1304 > 0) {
								@Pc(1310) boolean local1310 = true;
								local1304--;
								for (local1313 = 0; local1313 < local1304; local1313++) {
									if (local1192[local1313].aString39.compareTo(local1192[local1313 + 1].aString39) > 0) {
										local1331 = local1192[local1313];
										local1192[local1313] = local1192[local1313 + 1];
										local1192[local1313 + 1] = local1331;
										local1310 = false;
									}
								}
								if (local1310) {
									break;
								}
							}
							arg0.aClass225_108 = null;
							Static56.aClass143Array1 = local1192;
							return true;
						} else if (Static213.aClass225_61 == arg0.aClass225_108) {
							Static34.method7593(Static635.aClass281_16);
							arg0.aClass225_108 = null;
							return true;
						} else if (Static231.aClass225_69 == arg0.aClass225_108) {
							local297 = local11.method8554(31493);
							local104 = local11.method8575();
							Static471.method6759();
							Static151.method7128(local297, local104);
							arg0.aClass225_108 = null;
							return true;
						} else {
							@Pc(1450) int local1450;
							@Pc(1456) long local1456;
							@Pc(1446) long local1446;
							@Pc(1458) boolean local1458;
							@Pc(1441) long local1441;
							@Pc(1563) int local1563;
							if (Static572.aClass225_172 == arg0.aClass225_108) {
								local791 = local11.method8581(-17416) == 1;
								local795 = local11.method8553();
								local1441 = (long) local11.method8575();
								local1446 = (long) local11.method8583();
								local1450 = local11.method8581(-17416);
								local1456 = (local1441 << 32) + local1446;
								local1458 = false;
								@Pc(1467) Class2_Sub43 local1467 = local791 ? Static176.aClass2_Sub43_1 : Static205.aClass2_Sub43_2;
								if (local1467 == null) {
									local1458 = true;
								} else {
									label2241: {
										for (local829 = 0; local829 < 100; local829++) {
											if (local1456 == Static686.aLongArray22[local829]) {
												local1458 = true;
												break label2241;
											}
										}
										if (local1450 <= 1) {
											if (Static70.aBoolean137 && !Static337.aBoolean443 || Static329.aBoolean429) {
												local1458 = true;
											} else if (Static255.method3623(local795)) {
												local1458 = true;
											}
										}
									}
								}
								if (!local1458 && Static78.anInt1358 == 0) {
									Static686.aLongArray22[Static580.anInt9161] = local1456;
									Static580.anInt9161 = (Static580.anInt9161 + 1) % 100;
									local914 = Static618.method8398(Static612.method8339(local11));
									local1563 = local791 ? 41 : 44;
									if (local1450 == 2 || local1450 == 3) {
										Static660.method9034(-1, local1467.aString77, local914, local795, local1563, "<img=1>" + local795, "<img=1>" + local795, 0);
									} else if (local1450 == 1) {
										Static660.method9034(-1, local1467.aString77, local914, local795, local1563, "<img=0>" + local795, "<img=0>" + local795, 0);
									} else {
										Static660.method9034(-1, local1467.aString77, local914, local795, local1563, local795, local795, 0);
									}
								}
								arg0.aClass225_108 = null;
								return true;
							} else if (arg0.aClass225_108 == Static527.aClass225_158) {
								local297 = local11.method8578();
								local104 = local11.method8530();
								local532 = local11.method8575();
								Static471.method6759();
								Static467.method6722(local104 + (local532 << 16), local297);
								arg0.aClass225_108 = null;
								return true;
							} else if (Static339.aClass225_103 == arg0.aClass225_108) {
								local297 = local11.method8575();
								local1164 = local11.method8590();
								if (Static234.anObjectArray1 == null) {
									Static234.anObjectArray1 = new Object[Static80.aClass90_1.anInt2113];
								}
								Static234.anObjectArray1[local297] = Long.valueOf(local1164);
								Static271.anIntArray309[Static462.anInt7504++ & 0x1F] = local297;
								arg0.aClass225_108 = null;
								return true;
							} else if (arg0.aClass225_108 == Static500.aClass225_149) {
								local297 = local11.method8581(-17416);
								if (local11.method8581(-17416) == 0) {
									Static667.aClass374Array1[local297] = new Class374();
								} else {
									local11.anInt9723--;
									Static667.aClass374Array1[local297] = new Class374(local11);
								}
								arg0.aClass225_108 = null;
								Static500.anInt7992 = Static602.anInt10526;
								return true;
							} else {
								@Pc(1817) int local1817;
								@Pc(1850) Class2_Sub31 local1850;
								@Pc(1837) Class2_Sub31 local1837;
								if (Static85.aClass225_29 == arg0.aClass225_108) {
									local297 = local11.method8554(31493);
									if (local297 == 65535) {
										local297 = -1;
									}
									local104 = local11.method8554(31493);
									if (local104 == 65535) {
										local104 = -1;
									}
									local532 = local11.method8578();
									local1176 = local11.method8529((byte) 82);
									Static471.method6759();
									for (local1817 = local297; local1817 <= local104; local1817++) {
										local815 = ((long) local1176 << 32) + (long) local1817;
										local1837 = (Class2_Sub31) Static345.aClass218_24.method5095(local815, 0);
										if (local1837 != null) {
											local1850 = new Class2_Sub31(local532, local1837.anInt3442);
											local1837.method9872();
										} else if (local1817 == -1) {
											local1850 = new Class2_Sub31(local532, Static417.method6111(local1176).aClass2_Sub31_2.anInt3442);
										} else {
											local1850 = new Class2_Sub31(local532, -1);
										}
										Static345.aClass218_24.method5099(local1850, local815);
									}
									arg0.aClass225_108 = null;
									return true;
								}
								@Pc(1940) boolean local1940;
								@Pc(2000) String local2000;
								@Pc(1950) boolean local1950;
								if (Static660.aClass225_199 == arg0.aClass225_108) {
									local297 = local11.method8575();
									@Pc(1911) Class4_Sub2_Sub1_Sub2_Sub1 local1911;
									if (Class4_Sub2_Sub1_Sub2.lb == local297) {
										local1911 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2;
									} else {
										local1911 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local297];
									}
									if (local1911 == null) {
										arg0.aClass225_108 = null;
										return true;
									}
									local532 = local11.method8575();
									local1176 = local11.method8581(-17416);
									local1940 = (local532 & 0x8000) != 0;
									if (local1911.aString4 != null && local1911.aClass116_1 != null) {
										local1950 = false;
										if (local1176 <= 1) {
											if (!local1940 && (Static70.aBoolean137 && !Static337.aBoolean443 || Static329.aBoolean429)) {
												local1950 = true;
											} else if (Static255.method3623(local1911.aString4)) {
												local1950 = true;
											}
										}
										if (!local1950 && Static78.anInt1358 == 0) {
											local819 = -1;
											if (local1940) {
												local532 &= 0x7FFF;
												@Pc(2010) Class255 local2010 = Static347.method4805(local11);
												local819 = local2010.anInt6827;
												local2000 = local2010.aClass2_Sub6_Sub8_1.method4320(local11);
											} else {
												local2000 = Static618.method8398(Static612.method8339(local11));
											}
											local1911.method731(local532 & 0xFF, local2000.trim(), local532 >> 8);
											if (local1176 == 1 || local1176 == 2) {
												local1304 = local1940 ? 17 : 1;
											} else {
												local1304 = local1940 ? 17 : 2;
											}
											if (local1176 == 2) {
												Static660.method9034(local819, (String) null, local2000, local1911.aString3, local1304, "<img=1>" + local1911.method738(), "<img=1>" + local1911.method729(), 0);
											} else if (local1176 == 1) {
												Static660.method9034(local819, (String) null, local2000, local1911.aString3, local1304, "<img=0>" + local1911.method738(), "<img=0>" + local1911.method729(), 0);
											} else {
												Static660.method9034(local819, (String) null, local2000, local1911.aString3, local1304, local1911.method738(), local1911.method729(), 0);
											}
										}
									}
									arg0.aClass225_108 = null;
									return true;
								}
								@Pc(2611) boolean local2611;
								@Pc(2292) int local2292;
								@Pc(2294) int local2294;
								@Pc(2252) int local2252;
								@Pc(2411) boolean local2411;
								if (Static162.aClass225_49 == arg0.aClass225_108) {
									local297 = local11.method8540();
									local104 = local11.method8575();
									local532 = local11.method8559();
									local1176 = local11.method8554(31493);
									if (local1176 == 65535) {
										local1176 = -1;
									}
									local1817 = local11.method8588();
									local1194 = local11.method8593();
									local1450 = local1194 & 0x7;
									local819 = local1194 >> 3 & 0xF;
									if (local819 == 15) {
										local819 = -1;
									}
									@Pc(2230) boolean local2230 = (local1194 >> 7 & 0x1) == 1;
									if (local297 >> 30 == 0) {
										@Pc(2497) Class307 local2497;
										@Pc(2433) Class347 local2433;
										@Pc(2559) int local2559;
										@Pc(2455) Class307 local2455;
										if (local297 >> 29 != 0) {
											local1313 = local297 & 0xFFFF;
											@Pc(2392) Class2_Sub49 local2392 = (Class2_Sub49) Static467.aClass218_37.method5095((long) local1313, 0);
											if (local2392 != null) {
												@Pc(2397) Class4_Sub2_Sub1_Sub2_Sub2 local2397 = local2392.aClass4_Sub2_Sub1_Sub2_Sub2_3;
												@Pc(2402) Class315 local2402 = local2397.aClass315Array3[local1817];
												if (local1176 == 65535) {
													local1176 = -1;
												}
												local2411 = true;
												local2294 = local2402.anInt8456;
												if (local1176 != -1 && local2294 != -1) {
													if (local2294 == local1176) {
														local2433 = Static119.aClass209_1.method4570(local1176);
														if (local2433.aBoolean800 && local2433.anInt9356 != -1) {
															local2497 = Static89.aClass274_1.method6626(local2433.anInt9356);
															@Pc(2500) int local2500 = local2497.anInt8120;
															if (local2500 == 0 || local2500 == 2) {
																local2411 = false;
															} else if (local2500 == 1) {
																local2411 = true;
															}
														}
													} else {
														local2433 = Static119.aClass209_1.method4570(local1176);
														@Pc(2438) Class347 local2438 = Static119.aClass209_1.method4570(local2294);
														if (local2433.anInt9356 != -1 && local2438.anInt9356 != -1) {
															local2455 = Static89.aClass274_1.method6626(local2433.anInt9356);
															@Pc(2461) Class307 local2461 = Static89.aClass274_1.method6626(local2438.anInt9356);
															if (local2455.anInt8124 < local2461.anInt8124) {
																local2411 = false;
															}
														}
													}
												}
												if (local2411) {
													local2402.anInt8456 = local1176;
													local2402.anInt8455 = local104;
													local2402.anInt8459 = local819;
													if (local1176 == -1) {
														local2402.aClass53_10.method4089(-1);
													} else {
														local2433 = Static119.aClass209_1.method4570(local1176);
														local2559 = local2433.aBoolean800 ? 0 : 2;
														if (local2230) {
															local2559 = 1;
														}
														local2402.aClass53_10.method4085(local2559, false, local2433.anInt9356, local532);
													}
												}
											}
										} else if (local297 >> 28 != 0) {
											local1313 = local297 & 0xFFFF;
											@Pc(2591) Class4_Sub2_Sub1_Sub2_Sub1 local2591;
											if (Class4_Sub2_Sub1_Sub2.lb == local1313) {
												local2591 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2;
											} else {
												local2591 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local1313];
											}
											if (local2591 != null) {
												@Pc(2602) Class315 local2602 = local2591.aClass315Array3[local1817];
												if (local1176 == 65535) {
													local1176 = -1;
												}
												local2611 = true;
												local2292 = local2602.anInt8456;
												@Pc(2637) Class347 local2637;
												if (local1176 != -1 && local2292 != -1) {
													if (local2292 == local1176) {
														local2637 = Static119.aClass209_1.method4570(local1176);
														if (local2637.aBoolean800 && local2637.anInt9356 != -1) {
															@Pc(2652) Class307 local2652 = Static89.aClass274_1.method6626(local2637.anInt9356);
															local2559 = local2652.anInt8120;
															if (local2559 == 0 || local2559 == 2) {
																local2611 = false;
															} else if (local2559 == 1) {
																local2611 = true;
															}
														}
													} else {
														local2637 = Static119.aClass209_1.method4570(local1176);
														local2433 = Static119.aClass209_1.method4570(local2292);
														if (local2637.anInt9356 != -1 && local2433.anInt9356 != -1) {
															local2497 = Static89.aClass274_1.method6626(local2637.anInt9356);
															local2455 = Static89.aClass274_1.method6626(local2433.anInt9356);
															if (local2497.anInt8124 < local2455.anInt8124) {
																local2611 = false;
															}
														}
													}
												}
												if (local2611) {
													local2602.anInt8456 = local1176;
													local2602.anInt8454 = local1450;
													local2602.anInt8455 = local104;
													local2602.anInt8459 = local819;
													if (local1176 == -1) {
														local2602.aClass53_10.method4089(-1);
													} else {
														local2637 = Static119.aClass209_1.method4570(local1176);
														@Pc(2750) int local2750 = local2637.aBoolean800 ? 0 : 2;
														if (local2230) {
															local2750 = 1;
														}
														local2602.aClass53_10.method4085(local2750, false, local2637.anInt9356, local532);
													}
												}
											}
										}
									} else {
										local1313 = local297 >> 28 & 0x3;
										local2252 = (local297 >> 14 & 0x3FFF) - Static243.anInt3820;
										local829 = (local297 & 0x3FFF) - Static224.anInt11062;
										if (local2252 >= 0 && local829 >= 0 && Static426.anInt6942 > local2252 && Static280.anInt6752 > local829) {
											if (local1176 == -1) {
												@Pc(2359) Class2_Sub6_Sub2 local2359 = (Class2_Sub6_Sub2) Static211.aClass218_18.method5095((long) (local2252 << 16 | local829), 0);
												if (local2359 != null) {
													local2359.aClass4_Sub2_Sub1_Sub1_1.method185();
													local2359.method9872();
												}
											} else {
												local1563 = local2252 * 512 + 256;
												local2292 = local829 * 512 + 256;
												local2294 = local1313;
												if (local1313 < 3 && Static83.method1237(local2252, local829)) {
													local2294 = local1313 + 1;
												}
												@Pc(2333) Class4_Sub2_Sub1_Sub1 local2333 = new Class4_Sub2_Sub1_Sub1(local1176, local532, local1313, local2294, local1563, Static324.method4554(local1313, local1563, local2292) - local104, local2292, local2252, local2252, local829, local829, local1450, local2230);
												Static211.aClass218_18.method5099(new Class2_Sub6_Sub2(local2333), (long) (local2252 << 16 | local829));
											}
										}
									}
									arg0.aClass225_108 = null;
									return true;
								} else if (arg0.aClass225_108 == Static336.aClass225_100) {
									Static471.method6759();
									Static500.method7131();
									arg0.aClass225_108 = null;
									return true;
								} else {
									@Pc(3176) String local3176;
									if (arg0.aClass225_108 == Static624.aClass225_188) {
										while (local11.anInt9723 < arg0.anInt5773) {
											local791 = local11.method8581(-17416) == 1;
											local795 = local11.method8553();
											local797 = local11.method8553();
											local1176 = local11.method8575();
											local1817 = local11.method8581(-17416);
											local1950 = local11.method8581(-17416) == 1;
											local2000 = "";
											@Pc(2849) boolean local2849 = false;
											if (local1176 > 0) {
												local2000 = local11.method8553();
												local2849 = local11.method8581(-17416) == 1;
											}
											for (local1304 = 0; local1304 < Static143.anInt2455; local1304++) {
												if (local791) {
													if (local797.equals(Static80.aStringArray8[local1304])) {
														Static80.aStringArray8[local1304] = local795;
														local795 = null;
														Static180.aStringArray23[local1304] = local797;
														break;
													}
												} else if (local795.equals(Static80.aStringArray8[local1304])) {
													if (Static59.anIntArray91[local1304] != local1176) {
														local1458 = true;
														for (@Pc(2899) Class4_Sub1_Sub2 local2899 = (Class4_Sub1_Sub2) Static434.aClass320_5.method7605(); local2899 != null; local2899 = (Class4_Sub1_Sub2) Static434.aClass320_5.method7608()) {
															if (local2899.aString63.equals(local795)) {
																if (local1176 != 0 && local2899.aShort69 == 0) {
																	local1458 = false;
																	local2899.method9416();
																} else if (local1176 == 0 && local2899.aShort69 != 0) {
																	local1458 = false;
																	local2899.method9416();
																}
															}
														}
														if (local1458) {
															Static434.aClass320_5.method7600(new Class4_Sub1_Sub2(local795, local1176));
														}
														Static59.anIntArray91[local1304] = local1176;
													}
													Static180.aStringArray23[local1304] = local797;
													Static422.aStringArray27[local1304] = local2000;
													Static132.anIntArray162[local1304] = local1817;
													Static147.aBooleanArray13[local1304] = local2849;
													local795 = null;
													Static388.aBooleanArray28[local1304] = local1950;
													break;
												}
											}
											if (local795 != null && Static143.anInt2455 < 200) {
												Static80.aStringArray8[Static143.anInt2455] = local795;
												Static180.aStringArray23[Static143.anInt2455] = local797;
												Static59.anIntArray91[Static143.anInt2455] = local1176;
												Static422.aStringArray27[Static143.anInt2455] = local2000;
												Static132.anIntArray162[Static143.anInt2455] = local1817;
												Static147.aBooleanArray13[Static143.anInt2455] = local2849;
												Static388.aBooleanArray28[Static143.anInt2455] = local1950;
												Static143.anInt2455++;
											}
										}
										Static508.anInt8050 = 2;
										Static459.anInt7473 = Static602.anInt10526;
										local104 = Static143.anInt2455;
										while (local104 > 0) {
											local791 = true;
											local104--;
											for (local532 = 0; local532 < local104; local532++) {
												@Pc(3091) boolean local3091 = false;
												if (Static548.aClass176_3.anInt4157 != Static59.anIntArray91[local532] && Static59.anIntArray91[local532 + 1] == Static548.aClass176_3.anInt4157) {
													local3091 = true;
												}
												if (!local3091 && Static59.anIntArray91[local532] == 0 && Static59.anIntArray91[local532 + 1] != 0) {
													local3091 = true;
												}
												if (!local3091 && !Static388.aBooleanArray28[local532] && Static388.aBooleanArray28[local532 + 1]) {
													local3091 = true;
												}
												if (local3091) {
													local1817 = Static59.anIntArray91[local532];
													Static59.anIntArray91[local532] = Static59.anIntArray91[local532 + 1];
													Static59.anIntArray91[local532 + 1] = local1817;
													local3176 = Static422.aStringArray27[local532];
													Static422.aStringArray27[local532] = Static422.aStringArray27[local532 + 1];
													Static422.aStringArray27[local532 + 1] = local3176;
													local2000 = Static80.aStringArray8[local532];
													Static80.aStringArray8[local532] = Static80.aStringArray8[local532 + 1];
													Static80.aStringArray8[local532 + 1] = local2000;
													@Pc(3212) String local3212 = Static180.aStringArray23[local532];
													Static180.aStringArray23[local532] = Static180.aStringArray23[local532 + 1];
													Static180.aStringArray23[local532 + 1] = local3212;
													local1304 = Static132.anIntArray162[local532];
													Static132.anIntArray162[local532] = Static132.anIntArray162[local532 + 1];
													Static132.anIntArray162[local532 + 1] = local1304;
													local1458 = Static147.aBooleanArray13[local532];
													Static147.aBooleanArray13[local532] = Static147.aBooleanArray13[local532 + 1];
													Static147.aBooleanArray13[local532 + 1] = local1458;
													local827 = Static388.aBooleanArray28[local532];
													Static388.aBooleanArray28[local532] = Static388.aBooleanArray28[local532 + 1];
													local791 = false;
													Static388.aBooleanArray28[local532 + 1] = local827;
												}
											}
											if (local791) {
												break;
											}
										}
										arg0.aClass225_108 = null;
										return true;
									} else if (Static218.aClass225_62 == arg0.aClass225_108) {
										local297 = local11.method8555(-9372);
										Static471.method6759();
										Static171.method2547(5, 0, Class4_Sub2_Sub1_Sub2.lb, local297);
										arg0.aClass225_108 = null;
										return true;
									} else if (Static372.aClass225_115 == arg0.aClass225_108) {
										local297 = local11.method8593();
										local104 = local11.method8581(-17416);
										local532 = local11.method8588();
										local1176 = local11.method8575();
										local1817 = local11.method8581(-17416);
										Static471.method6759();
										Static144.aBooleanArray12[local297] = true;
										Static651.anIntArray720[local297] = local104;
										Static431.anIntArray506[local297] = local1817;
										Static291.anIntArray327[local297] = local532;
										Static629.anIntArray702[local297] = local1176;
										arg0.aClass225_108 = null;
										return true;
									} else if (arg0.aClass225_108 == Static442.aClass225_130) {
										local297 = local11.method8575();
										if (local297 == 65535) {
											local297 = -1;
										}
										local104 = local11.method8581(-17416);
										local532 = local11.method8575();
										local1176 = local11.method8581(-17416);
										Static43.method587(local297, local1176, true, local104, 256, local532);
										arg0.aClass225_108 = null;
										return true;
									} else if (Static631.aClass225_159 == arg0.aClass225_108) {
										local297 = local11.method8559();
										Static471.method6759();
										Static581.method8086(local297);
										arg0.aClass225_108 = null;
										return true;
									} else if (arg0.aClass225_108 == Static594.aClass225_177) {
										local297 = local11.method8581(-17416);
										local104 = local297 >> 2;
										local532 = local297 & 0x3;
										local1176 = Static259.anIntArray302[local104];
										local1817 = local11.method8559();
										if (local1817 == 65535) {
											local1817 = -1;
										}
										local1194 = local11.method8529((byte) 118);
										local1450 = local1194 >> 28 & 0x3;
										local819 = local1194 >> 14 & 0x3FFF;
										local819 -= Static243.anInt3820;
										local1304 = local1194 & 0x3FFF;
										local1304 -= Static224.anInt11062;
										Static162.method2426(local1304, local1817, local532, local104, local819, local1450, local1176);
										arg0.aClass225_108 = null;
										return true;
									} else if (arg0.aClass225_108 == Static338.aClass225_102) {
										Static465.aByte107 = local11.method8594();
										if (Static465.aByte107 == 0 || Static465.aByte107 == 1) {
											Static284.aBoolean385 = true;
										}
										arg0.aClass225_108 = null;
										return true;
									} else {
										@Pc(3564) byte local3564;
										if (arg0.aClass225_108 == Static458.aClass225_135) {
											local3564 = local11.method8594();
											local104 = local11.method8557();
											Static471.method6759();
											Static446.method6518(local104, local3564);
											arg0.aClass225_108 = null;
											return true;
										} else if (arg0.aClass225_108 == Static272.aClass225_79) {
											Static34.method7593(Static717.aClass281_18);
											arg0.aClass225_108 = null;
											return true;
										} else if (arg0.aClass225_108 == Static648.aClass225_195) {
											local791 = local11.method8581(-17416) == 1;
											local795 = local11.method8553();
											local797 = local795;
											if (local791) {
												local797 = local11.method8553();
											}
											local808 = local11.method8590();
											local815 = (long) local11.method8575();
											local1456 = (long) local11.method8583();
											local1313 = local11.method8581(-17416);
											local2252 = local11.method8575();
											@Pc(3653) long local3653 = local1456 + (local815 << 32);
											local2411 = false;
											local2294 = 0;
											while (true) {
												if (local2294 >= 100) {
													if (local1313 <= 1 && Static255.method3623(local797)) {
														local2411 = true;
													}
													break;
												}
												if (Static686.aLongArray22[local2294] == local3653) {
													local2411 = true;
													break;
												}
												local2294++;
											}
											if (!local2411 && Static78.anInt1358 == 0) {
												Static686.aLongArray22[Static580.anInt9161] = local3653;
												Static580.anInt9161 = (Static580.anInt9161 + 1) % 100;
												@Pc(3727) String local3727 = Static645.aClass180_2.method3843(local2252).method4320(local11);
												if (local1313 == 2) {
													Static660.method9034(local2252, Static341.method4741(local808), local3727, local795, 20, "<img=1>" + local795, "<img=1>" + local797, 0);
												} else if (local1313 == 1) {
													Static660.method9034(local2252, Static341.method4741(local808), local3727, local795, 20, "<img=0>" + local795, "<img=0>" + local797, 0);
												} else {
													Static660.method9034(local2252, Static341.method4741(local808), local3727, local795, 20, local795, local797, 0);
												}
											}
											arg0.aClass225_108 = null;
											return true;
										} else if (Static618.aClass225_187 == arg0.aClass225_108) {
											local297 = local11.method8554(31493);
											local104 = local11.method8581(-17416);
											Static471.method6759();
											if (local104 == 2) {
												Static257.method3647();
											}
											Static542.anInt8552 = local297;
											Static68.method1030(local297);
											Static445.method6516(false);
											Static484.method6921(Static542.anInt8552);
											for (local532 = 0; local532 < 100; local532++) {
												Static537.aBooleanArray25[local532] = true;
											}
											arg0.aClass225_108 = null;
											return true;
										} else if (arg0.aClass225_108 == Static588.aClass225_174) {
											local297 = local11.method8581(-17416);
											local104 = local297 >> 5;
											local532 = local297 & 0x1F;
											if (local532 == 0) {
												Static690.aClass350Array1[local104] = null;
												arg0.aClass225_108 = null;
												return true;
											}
											@Pc(3920) Class350 local3920 = new Class350();
											local3920.anInt9441 = local532;
											local3920.anInt9437 = local11.method8581(-17416);
											if (local3920.anInt9437 >= 0 && Static22.aClass43Array3.length > local3920.anInt9437) {
												if (local3920.anInt9441 == 1 || local3920.anInt9441 == 10) {
													local3920.anInt9439 = local11.method8575();
													local3920.anInt9438 = local11.method8575();
													local11.anInt9723 += 4;
												} else if (local3920.anInt9441 >= 2 && local3920.anInt9441 <= 6) {
													if (local3920.anInt9441 == 2) {
														local3920.anInt9443 = 256;
														local3920.anInt9434 = 256;
													}
													if (local3920.anInt9441 == 3) {
														local3920.anInt9434 = 256;
														local3920.anInt9443 = 0;
													}
													if (local3920.anInt9441 == 4) {
														local3920.anInt9434 = 256;
														local3920.anInt9443 = 512;
													}
													if (local3920.anInt9441 == 5) {
														local3920.anInt9443 = 256;
														local3920.anInt9434 = 0;
													}
													if (local3920.anInt9441 == 6) {
														local3920.anInt9443 = 256;
														local3920.anInt9434 = 512;
													}
													local3920.anInt9441 = 2;
													local3920.anInt9436 = local11.method8581(-17416);
													local3920.anInt9443 += local11.method8575() - Static243.anInt3820 << 9;
													local3920.anInt9434 += local11.method8575() - Static224.anInt11062 << 9;
													local3920.anInt9444 = local11.method8581(-17416) << 2;
													local3920.anInt9442 = local11.method8575();
												}
												local3920.anInt9435 = local11.method8575();
												if (local3920.anInt9435 == 65535) {
													local3920.anInt9435 = -1;
												}
												Static690.aClass350Array1[local104] = local3920;
											}
											arg0.aClass225_108 = null;
											return true;
										} else if (arg0.aClass225_108 == Static243.aClass225_72) {
											Static709.aBoolean930 = local11.method8588() == 1;
											arg0.aClass225_108 = null;
											return true;
										} else if (arg0.aClass225_108 == Static642.aClass225_191) {
											Static210.anInt3379 = Static602.anInt10526;
											local791 = local11.method8581(-17416) == 1;
											if (arg0.anInt5773 != 1) {
												if (local791) {
													Static176.aClass2_Sub43_1 = new Class2_Sub43(local11);
												} else {
													Static205.aClass2_Sub43_2 = new Class2_Sub43(local11);
												}
												arg0.aClass225_108 = null;
												return true;
											}
											arg0.aClass225_108 = null;
											if (local791) {
												Static176.aClass2_Sub43_1 = null;
											} else {
												Static205.aClass2_Sub43_2 = null;
											}
											return true;
										} else if (arg0.aClass225_108 == Static235.aClass225_71) {
											local297 = local11.method8554(31493);
											local104 = local11.method8529((byte) 63);
											Static471.method6759();
											Static483.method6907(local297, local104);
											arg0.aClass225_108 = null;
											return true;
										} else if (aClass225_53 == arg0.aClass225_108) {
											Static548.anInt8645 = local11.method8588();
											Static592.anInt9253 = local11.method8566() << 3;
											Static152.anInt2510 = local11.method8566() << 3;
											while (arg0.anInt5773 > local11.anInt9723) {
												@Pc(4270) Class281 local4270 = Static685.method9231()[local11.method8581(-17416)];
												Static34.method7593(local4270);
											}
											arg0.aClass225_108 = null;
											return true;
										} else if (Static14.aClass225_11 == arg0.aClass225_108) {
											Static592.anInt9253 = local11.method8536() << 3;
											Static152.anInt2510 = local11.method8566() << 3;
											Static548.anInt8645 = local11.method8557();
											for (@Pc(4312) Class2_Sub53 local4312 = (Class2_Sub53) Static596.aClass218_41.method5092(); local4312 != null; local4312 = (Class2_Sub53) Static596.aClass218_41.method5096()) {
												local104 = (int) (local4312.aLong352 >> 28 & 0x3L);
												local532 = (int) (local4312.aLong352 & 0x3FFFL);
												local1176 = local532 - Static243.anInt3820;
												local1817 = (int) (local4312.aLong352 >> 14 & 0x3FFFL);
												local1194 = local1817 - Static224.anInt11062;
												if (Static548.anInt8645 == local104 && Static592.anInt9253 <= local1176 && Static592.anInt9253 + 8 > local1176 && Static152.anInt2510 <= local1194 && local1194 < Static152.anInt2510 + 8) {
													local4312.method9872();
													if (local1176 >= 0 && local1194 >= 0 && Static426.anInt6942 > local1176 && local1194 < Static280.anInt6752) {
														Static246.method3454(Static548.anInt8645, local1194, local1176);
													}
												}
											}
											@Pc(4424) Class2_Sub46 local4424;
											for (local4424 = (Class2_Sub46) Static237.aClass60_235.method1226(7); local4424 != null; local4424 = (Class2_Sub46) Static237.aClass60_235.method1228()) {
												if (Static592.anInt9253 <= local4424.anInt7501 && local4424.anInt7501 < Static592.anInt9253 + 8 && local4424.anInt7498 >= Static152.anInt2510 && local4424.anInt7498 < Static152.anInt2510 + 8 && local4424.anInt7506 == Static548.anInt8645) {
													local4424.aBoolean652 = true;
												}
											}
											for (local4424 = (Class2_Sub46) Static556.aClass60_180.method1226(7); local4424 != null; local4424 = (Class2_Sub46) Static556.aClass60_180.method1228()) {
												if (local4424.anInt7501 >= Static592.anInt9253 && Static592.anInt9253 + 8 > local4424.anInt7501 && local4424.anInt7498 >= Static152.anInt2510 && Static152.anInt2510 + 8 > local4424.anInt7498 && local4424.anInt7506 == Static548.anInt8645) {
													local4424.aBoolean652 = true;
												}
											}
											arg0.aClass225_108 = null;
											return true;
										} else if (Static128.aClass225_38 == arg0.aClass225_108) {
											local297 = local11.method8575();
											local104 = local11.method8575();
											local532 = local11.method8575();
											Static471.method6759();
											if (Static581.aClass273ArrayArray2[local297] != null) {
												for (local1176 = local104; local1176 < local532; local1176++) {
													local1817 = local11.method8583();
													if (Static581.aClass273ArrayArray2[local297].length > local1176 && Static581.aClass273ArrayArray2[local297][local1176] != null) {
														Static581.aClass273ArrayArray2[local297][local1176].anInt7343 = local1817;
													}
												}
											}
											arg0.aClass225_108 = null;
											return true;
										} else if (Static495.aClass225_145 == arg0.aClass225_108) {
											Static187.method2680(local11.method8553());
											arg0.aClass225_108 = null;
											return true;
										} else if (arg0.aClass225_108 == Static617.aClass225_185) {
											arg0.aClass225_108 = null;
											return false;
										} else if (Static132.aClass225_39 == arg0.aClass225_108) {
											local472 = local11.method8553();
											local104 = local11.method8575();
											local797 = Static645.aClass180_2.method3843(local104).method4320(local11);
											Static660.method9034(local104, (String) null, local797, local472, 19, local472, local472, 0);
											arg0.aClass225_108 = null;
											return true;
										} else if (arg0.aClass225_108 == Static7.aClass225_5) {
											local297 = local11.method8581(-17416);
											local104 = local11.method8559();
											local532 = local11.method8575();
											local1176 = local11.method8540();
											Static471.method6759();
											Static130.method1893(local532, local104, local1176, local297);
											arg0.aClass225_108 = null;
											return true;
										} else {
											@Pc(4752) Class2_Sub26 local4752;
											if (Static605.aClass225_181 == arg0.aClass225_108) {
												local297 = local11.method8593();
												local104 = local11.method8578();
												local532 = local11.method8575();
												Static471.method6759();
												local4752 = (Class2_Sub26) Static463.aClass218_36.method5095((long) local104, 0);
												if (local4752 != null) {
													Static331.method4599(local4752, false, local532 != local4752.anInt3020);
												}
												Static453.method6603(local532, local104, false, local297);
												arg0.aClass225_108 = null;
												return true;
											} else if (arg0.aClass225_108 == Static371.aClass225_114) {
												local297 = local11.method8555(-9372);
												Static471.method6759();
												@Pc(4798) Class2_Sub26 local4798 = (Class2_Sub26) Static463.aClass218_36.method5095((long) local297, 0);
												if (local4798 != null) {
													Static331.method4599(local4798, false, true);
												}
												if (Static13.aClass273_1 != null) {
													Static371.method5299(Static13.aClass273_1);
													Static13.aClass273_1 = null;
												}
												arg0.aClass225_108 = null;
												return true;
											} else if (Static288.aClass225_86 == arg0.aClass225_108) {
												local297 = local11.method8559();
												if (local297 == 65535) {
													local297 = -1;
												}
												local104 = local11.method8555(-9372);
												Static471.method6759();
												Static161.method2378(local104, local297);
												arg0.aClass225_108 = null;
												return true;
											} else if (arg0.aClass225_108 == Static464.aClass225_136) {
												local297 = local11.method8575();
												local104 = local11.method8588();
												Static471.method6759();
												Static536.method7523(true, local297, local104);
												arg0.aClass225_108 = null;
												return true;
											} else if (Static285.aClass225_84 == arg0.aClass225_108) {
												local297 = local11.method8575();
												Static265.anInt4122 = -1;
												Static640.anInt9835 = local297;
												Static166.anInt2884 = 1;
												Static560.aClass254_138.method6072(Static640.anInt9835);
												local104 = local11.method8575();
												Static515.anIntArrayArray53 = new int[local104][4];
												for (local532 = 0; local532 < local104; local532++) {
													for (local1176 = 0; local1176 < 4; local1176++) {
														Static515.anIntArrayArray53[local532][local1176] = local11.method8555(-9372);
													}
												}
												local1176 = local11.method8581(-17416);
												Static215.aClass2_Sub20_4 = new Class2_Sub20(local1176);
												Static215.aClass2_Sub20_4.method8565(local11.aByteArray111, local11.anInt9723, local1176);
												arg0.aClass225_108 = null;
												local11.anInt9723 += local1176;
												return false;
											} else if (arg0.aClass225_108 == Static680.aClass225_204) {
												local297 = local11.method8578();
												local104 = local11.method8554(31493);
												Static471.method6759();
												Static128.method1883(local104, local297);
												arg0.aClass225_108 = null;
												return true;
											} else if (arg0.aClass225_108 == Static638.aClass225_190) {
												Static34.method7593(Static151.aClass281_15);
												arg0.aClass225_108 = null;
												return true;
											} else if (Static7.aClass225_6 == arg0.aClass225_108) {
												local297 = local11.method8593();
												local104 = local11.method8578();
												local532 = local11.method8593();
												Static1.anIntArray668[local532] = local104;
												Static639.anIntArray706[local532] = local297;
												Static237.anIntArray766[local532] = 1;
												local1176 = Static322.anIntArray352[local532] - 1;
												for (local1817 = 0; local1817 < local1176; local1817++) {
													if (Class2_Sub11_Sub14.anIntArray416[local1817] <= local104) {
														Static237.anIntArray766[local532] = local1817 + 2;
													}
												}
												Static571.anIntArray656[Static365.anInt5846++ & 0x1F] = local532;
												arg0.aClass225_108 = null;
												return true;
											} else if (arg0.aClass225_108 == Static596.aClass225_178) {
												Static262.method3710(local11, Static135.aClass389_2, arg0.anInt5773);
												arg0.aClass225_108 = null;
												return true;
											} else if (Static233.aClass225_70 == arg0.aClass225_108) {
												local297 = local11.method8575();
												local104 = local11.method8581(-17416);
												local756 = (local104 & 0x1) == 1;
												while (local11.anInt9723 < arg0.anInt5773) {
													local1176 = local11.method8592(255);
													local1817 = local11.method8575();
													local1194 = 0;
													if (local1817 != 0) {
														local1194 = local11.method8581(-17416);
														if (local1194 == 255) {
															local1194 = local11.method8555(-9372);
														}
													}
													Static91.method1396(local756, local297, local1176, local1194, local1817 - 1);
												}
												Static183.anIntArray227[Static167.anInt2888++ & 0x1F] = local297;
												arg0.aClass225_108 = null;
												return true;
											} else if (Static441.aClass225_129 == arg0.aClass225_108) {
												local297 = local11.method8540();
												local104 = local11.method8559();
												Static471.method6759();
												if (local104 == 65535) {
													local104 = -1;
												}
												Static171.method2547(2, -1, local104, local297);
												arg0.aClass225_108 = null;
												return true;
											} else if (arg0.aClass225_108 == Static324.aClass225_98) {
												Static631.method7521();
												arg0.aClass225_108 = null;
												return true;
											} else if (arg0.aClass225_108 == Static225.aClass225_66) {
												local472 = local11.method8553();
												@Pc(5252) Object[] local5252 = new Object[local472.length() + 1];
												for (local532 = local472.length() - 1; local532 >= 0; local532--) {
													if (local472.charAt(local532) == 's') {
														local5252[local532 + 1] = local11.method8553();
													} else {
														local5252[local532 + 1] = Integer.valueOf(local11.method8555(-9372));
													}
												}
												local5252[0] = Integer.valueOf(local11.method8555(-9372));
												Static471.method6759();
												@Pc(5317) Class2_Sub36 local5317 = new Class2_Sub36();
												local5317.anObjectArray2 = local5252;
												Static484.method6919(local5317);
												arg0.aClass225_108 = null;
												return true;
											} else {
												@Pc(5341) byte local5341;
												if (arg0.aClass225_108 == Static34.aClass225_163) {
													local297 = local11.method8575();
													local5341 = local11.method8536();
													if (Static234.anObjectArray1 == null) {
														Static234.anObjectArray1 = new Object[Static80.aClass90_1.anInt2113];
													}
													Static234.anObjectArray1[local297] = Integer.valueOf(local5341);
													Static271.anIntArray309[Static462.anInt7504++ & 0x1F] = local297;
													arg0.aClass225_108 = null;
													return true;
												} else if (Static456.aClass225_134 == arg0.aClass225_108) {
													Static133.anInt2219 = Static602.anInt10526;
													local791 = local11.method8581(-17416) == 1;
													if (arg0.anInt5773 != 1) {
														if (local791) {
															Static276.aClass394_7 = new Class394(local11);
														} else {
															Static91.aClass394_3 = new Class394(local11);
														}
														arg0.aClass225_108 = null;
														return true;
													}
													if (local791) {
														Static276.aClass394_7 = null;
													} else {
														Static91.aClass394_3 = null;
													}
													arg0.aClass225_108 = null;
													return true;
												} else if (arg0.aClass225_108 == Static230.aClass225_67) {
													local297 = local11.method8555(-9372);
													local104 = local11.method8578();
													Static471.method6759();
													@Pc(5461) Class2_Sub26 local5461 = (Class2_Sub26) Static463.aClass218_36.method5095((long) local104, 0);
													local4752 = (Class2_Sub26) Static463.aClass218_36.method5095((long) local297, 0);
													if (local4752 != null) {
														Static331.method4599(local4752, false, local5461 == null || local5461.anInt3020 != local4752.anInt3020);
													}
													if (local5461 != null) {
														local5461.method9872();
														Static463.aClass218_36.method5099(local5461, (long) local297);
													}
													@Pc(5506) Class273 local5506 = Static417.method6111(local104);
													if (local5506 != null) {
														Static371.method5299(local5506);
													}
													local5506 = Static417.method6111(local297);
													if (local5506 != null) {
														Static371.method5299(local5506);
														Static243.method3436(local5506, true);
													}
													if (Static542.anInt8552 != -1) {
														Static627.method8472(Static542.anInt8552, 1);
													}
													arg0.aClass225_108 = null;
													return true;
												} else if (arg0.aClass225_108 == Static471.aClass225_138) {
													Static366.method5265();
													arg0.aClass225_108 = null;
													return true;
												} else if (arg0.aClass225_108 == Static160.aClass225_47) {
													local472 = local11.method8553();
													local756 = local11.method8581(-17416) == 1;
													if (local756) {
														local795 = local11.method8553();
													} else {
														local795 = local472;
													}
													local1176 = local11.method8575();
													@Pc(5596) byte local5596 = local11.method8536();
													local1950 = false;
													if (local5596 == -128) {
														local1950 = true;
													}
													if (local1950) {
														if (Static664.anInt10333 == 0) {
															arg0.aClass225_108 = null;
															return true;
														}
														for (local1450 = 0; Static664.anInt10333 > local1450 && (!Static56.aClass143Array1[local1450].aString41.equals(local795) || local1176 != Static56.aClass143Array1[local1450].anInt3446); local1450++) {
														}
														if (local1450 < Static664.anInt10333) {
															while (Static664.anInt10333 - 1 > local1450) {
																Static56.aClass143Array1[local1450] = Static56.aClass143Array1[local1450 + 1];
																local1450++;
															}
															Static664.anInt10333--;
															Static56.aClass143Array1[Static664.anInt10333] = null;
														}
													} else {
														local2000 = local11.method8553();
														local1331 = new Class143();
														local1331.aString40 = local472;
														local1331.aString41 = local795;
														local1331.aString39 = Static15.method237(local1331.aString41);
														local1331.aString42 = local2000;
														local1331.aByte69 = local5596;
														local1331.anInt3446 = local1176;
														for (local1304 = Static664.anInt10333 - 1; local1304 >= 0; local1304--) {
															local1313 = Static56.aClass143Array1[local1304].aString39.compareTo(local1331.aString39);
															if (local1313 == 0) {
																Static56.aClass143Array1[local1304].anInt3446 = local1176;
																Static56.aClass143Array1[local1304].aByte69 = local5596;
																Static56.aClass143Array1[local1304].aString42 = local2000;
																if (local795.equals(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aString4)) {
																	Static549.aByte119 = local5596;
																}
																Static44.anInt591 = Static602.anInt10526;
																arg0.aClass225_108 = null;
																return true;
															}
															if (local1313 < 0) {
																break;
															}
														}
														if (Static664.anInt10333 >= Static56.aClass143Array1.length) {
															arg0.aClass225_108 = null;
															return true;
														}
														for (local1313 = Static664.anInt10333 - 1; local1313 > local1304; local1313--) {
															Static56.aClass143Array1[local1313 + 1] = Static56.aClass143Array1[local1313];
														}
														if (Static664.anInt10333 == 0) {
															Static56.aClass143Array1 = new Class143[100];
														}
														Static56.aClass143Array1[local1304 + 1] = local1331;
														Static664.anInt10333++;
														if (local795.equals(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aString4)) {
															Static549.aByte119 = local5596;
														}
													}
													Static44.anInt591 = Static602.anInt10526;
													arg0.aClass225_108 = null;
													return true;
												} else if (Static302.aClass225_90 == arg0.aClass225_108) {
													Static34.method7593(Static127.aClass281_8);
													arg0.aClass225_108 = null;
													return true;
												} else if (Static206.aClass225_60 == arg0.aClass225_108) {
													local297 = local11.method8578();
													local104 = local11.method8554(31493);
													Static396.aClass107_1.method2265(local104, local297);
													arg0.aClass225_108 = null;
													return true;
												} else if (Static89.aClass225_31 == arg0.aClass225_108) {
													local297 = local11.method8588();
													local104 = local11.method8581(-17416);
													local532 = local11.method8530() << 2;
													local1176 = local11.method8557();
													local1817 = local11.method8557();
													Static471.method6759();
													Static416.method6073(local1176, local1817, local104, true, local297, local532);
													arg0.aClass225_108 = null;
													return true;
												} else if (Static313.aClass225_94 == arg0.aClass225_108) {
													Static471.method6759();
													Static128.method1880();
													arg0.aClass225_108 = null;
													return true;
												} else if (Static196.aClass225_59 == arg0.aClass225_108) {
													arg0.aClass225_108 = null;
													Static234.anObjectArray1 = null;
													return true;
												} else if (Static627.aClass225_189 == arg0.aClass225_108) {
													Static508.anInt8050 = 1;
													arg0.aClass225_108 = null;
													Static459.anInt7473 = Static602.anInt10526;
													return true;
												} else if (arg0.aClass225_108 == Static8.aClass225_7) {
													local11.anInt9723 += 28;
													if (local11.method8563()) {
														Static66.method997(local11.anInt9723 - 28, local11);
													}
													arg0.aClass225_108 = null;
													return true;
												} else if (arg0.aClass225_108 == Static313.aClass225_95) {
													local297 = local11.method8559();
													if (local297 == 65535) {
														local297 = -1;
													}
													local104 = local11.method8554(31493);
													local532 = local11.method8578();
													local1176 = local11.method8559();
													Static471.method6759();
													if (local1176 == 65535) {
														local1176 = -1;
													}
													for (local1817 = local297; local1817 <= local1176; local1817++) {
														local815 = ((long) local532 << 32) + ((long) local1817);
														local1837 = (Class2_Sub31) Static345.aClass218_24.method5095(local815, 0);
														if (local1837 != null) {
															local1850 = new Class2_Sub31(local1837.anInt3441, local104);
															local1837.method9872();
														} else if (local1817 == -1) {
															local1850 = new Class2_Sub31(Static417.method6111(local532).aClass2_Sub31_2.anInt3441, local104);
														} else {
															local1850 = new Class2_Sub31(0, local104);
														}
														Static345.aClass218_24.method5099(local1850, local815);
													}
													arg0.aClass225_108 = null;
													return true;
												} else if (Static176.aClass225_57 == arg0.aClass225_108) {
													local297 = local11.method8575();
													local795 = local11.method8553();
													if (Static234.anObjectArray1 == null) {
														Static234.anObjectArray1 = new Object[Static80.aClass90_1.anInt2113];
													}
													Static234.anObjectArray1[local297] = local795;
													Static271.anIntArray309[Static462.anInt7504++ & 0x1F] = local297;
													arg0.aClass225_108 = null;
													return true;
												} else if (arg0.aClass225_108 == Static336.aClass225_99) {
													Static34.method7593(Static233.aClass281_10);
													arg0.aClass225_108 = null;
													return true;
												} else if (Static650.aClass225_196 == arg0.aClass225_108) {
													Static238.anInt3745 = local11.method8581(-17416);
													arg0.aClass225_108 = null;
													return true;
												} else if (Static255.aClass225_73 == arg0.aClass225_108) {
													local297 = local11.method8575();
													local104 = local11.method8555(-9372);
													if (Static234.anObjectArray1 == null) {
														Static234.anObjectArray1 = new Object[Static80.aClass90_1.anInt2113];
													}
													Static234.anObjectArray1[local297] = Integer.valueOf(local104);
													Static271.anIntArray309[Static462.anInt7504++ & 0x1F] = local297;
													arg0.aClass225_108 = null;
													return true;
												} else if (Static85.aClass225_30 == arg0.aClass225_108) {
													if (Static459.method6651(-870, Static357.anInt5722)) {
														Static283.anInt8842 = (int) ((float) local11.method8575() * 2.5F);
													} else {
														Static283.anInt8842 = local11.method8575() * 30;
													}
													arg0.aClass225_108 = null;
													Static539.anInt8520 = Static602.anInt10526;
													return true;
												} else if (arg0.aClass225_108 == Static268.aClass225_78) {
													local297 = local11.method8540();
													if (local297 != Static65.anInt1136) {
														Static65.anInt1136 = local297;
														Static484.method6918(Static83.aClass286_3, -1, -1);
													}
													arg0.aClass225_108 = null;
													return true;
												} else if (Static399.aClass225_124 == arg0.aClass225_108) {
													local297 = local11.method8578();
													local104 = local11.method8598();
													local532 = local11.method8558();
													Static471.method6759();
													Static622.method8427(local297, local532, local104);
													arg0.aClass225_108 = null;
													return true;
												} else if (arg0.aClass225_108 == Static25.aClass225_14) {
													Static34.method7593(Static383.aClass281_2);
													arg0.aClass225_108 = null;
													return true;
												} else if (Static337.aClass225_101 == arg0.aClass225_108) {
													local297 = local11.method8575();
													if (local297 == 65535) {
														local297 = -1;
													}
													local104 = local11.method8581(-17416);
													local532 = local11.method8575();
													local1176 = local11.method8581(-17416);
													local1817 = local11.method8575();
													Static43.method587(local297, local1176, false, local104, local1817, local532);
													arg0.aClass225_108 = null;
													return true;
												} else if (arg0.aClass225_108 == Static511.aClass225_155) {
													Static175.anInt10801 = local11.method8598();
													arg0.aClass225_108 = null;
													Static539.anInt8520 = Static602.anInt10526;
													return true;
												} else if (arg0.aClass225_108 == Static53.aClass225_25) {
													local297 = local11.method8593();
													Static471.method6759();
													Static450.anInt7298 = local297;
													arg0.aClass225_108 = null;
													return true;
												} else if (Static296.aClass225_89 == arg0.aClass225_108) {
													local297 = local11.method8559();
													Static471.method6759();
													Static695.method9351(local297);
													arg0.aClass225_108 = null;
													return true;
												} else {
													@Pc(6468) boolean local6468;
													if (Static352.aClass225_105 == arg0.aClass225_108) {
														local297 = local11.method8578();
														local6468 = local11.method8593() == 1;
														if (local6468 != Static68.aBoolean134 || local297 != Static171.anInt2930) {
															Static68.aBoolean134 = local6468;
															Static171.anInt2930 = local297;
															Static484.method6918(Static529.aClass286_11, -1, -1);
														}
														arg0.aClass225_108 = null;
														return true;
													} else if (Static556.aClass225_166 == arg0.aClass225_108) {
														local472 = local11.method8553();
														local104 = local11.method8575();
														if (local104 == 65535) {
															local104 = -1;
														}
														local532 = local11.method8588();
														local1176 = local11.method8581(-17416);
														if (local532 >= 1 && local532 <= 8) {
															if (local472.equalsIgnoreCase("null")) {
																local472 = null;
															}
															Static530.aStringArray38[local532 - 1] = local472;
															Static512.anIntArray586[local532 - 1] = local104;
															Static327.aBooleanArray38[local532 - 1] = local1176 == 0;
														}
														arg0.aClass225_108 = null;
														return true;
													} else if (arg0.aClass225_108 == Static714.aClass225_208) {
														local297 = local11.method8575();
														@Pc(6573) int[] local6573 = new int[4];
														for (local532 = 0; local532 < 4; local532++) {
															local6573[local532] = local11.method8554(31493);
														}
														local1176 = local11.method8593();
														@Pc(6600) Class2_Sub49 local6600 = (Class2_Sub49) Static467.aClass218_37.method5095((long) local297, 0);
														if (local6600 != null) {
															Static274.method3838(true, local6573, local1176, local6600.aClass4_Sub2_Sub1_Sub2_Sub2_3, 29498);
														}
														arg0.aClass225_108 = null;
														return true;
													} else if (Static140.aClass225_43 == arg0.aClass225_108) {
														local297 = local11.method8555(-9372);
														local104 = local11.method8554(31493);
														local532 = local11.method8559();
														local1176 = local11.method8593();
														Static471.method6759();
														Static393.method5839(local104, local1176, local532, local297);
														arg0.aClass225_108 = null;
														return true;
													} else if (arg0.aClass225_108 == Static5.aClass225_1) {
														local297 = local11.method8578();
														Static471.method6759();
														Static171.method2547(3, -1, -1, local297);
														arg0.aClass225_108 = null;
														return true;
													} else if (Static498.aClass225_148 == arg0.aClass225_108) {
														local297 = local11.method8575();
														local104 = local11.method8554(31493);
														local532 = local11.method8555(-9372);
														local1176 = local11.method8559();
														Static471.method6759();
														Static560.method7797(local297, local1176, local104, local532);
														arg0.aClass225_108 = null;
														return true;
													} else if (arg0.aClass225_108 == Static595.aClass225_143) {
														local791 = local11.method8581(-17416) == 1;
														@Pc(6734) byte[] local6734 = new byte[arg0.anInt5773 - 1];
														local11.method8573(arg0.anInt5773 - 1, 0, local6734);
														Static242.method7778(local6734, local791);
														arg0.aClass225_108 = null;
														return true;
													} else if (Static545.aClass225_164 == arg0.aClass225_108) {
														local297 = local11.method8530();
														local104 = local11.method8555(-9372);
														local532 = local11.method8555(-9372);
														Static471.method6759();
														Static171.method2547(5, local104, local297, local532);
														arg0.aClass225_108 = null;
														return true;
													} else if (arg0.aClass225_108 == Static34.aClass225_162) {
														Static456.method6634();
														arg0.aClass225_108 = null;
														return false;
													} else {
														@Pc(6816) String local6816;
														@Pc(6818) String local6818;
														if (Static133.aClass225_40 == arg0.aClass225_108) {
															local297 = local11.method8592(255);
															local104 = local11.method8555(-9372);
															local532 = local11.method8581(-17416);
															local6816 = "";
															local6818 = local6816;
															if ((local532 & 0x1) != 0) {
																local6816 = local11.method8553();
																if ((local532 & 0x2) == 0) {
																	local6818 = local6816;
																} else {
																	local6818 = local11.method8553();
																}
															}
															local3176 = local11.method8553();
															if (local297 == 99) {
																Static180.method5442(local3176);
															} else if (local297 == 98) {
																Static380.method5501(local3176);
															} else if (local6818.equals("") || !Static255.method3623(local6818)) {
																Static296.method4163(local104, local6816, local3176, local297, local6816, local6818);
															} else {
																arg0.aClass225_108 = null;
																return true;
															}
															arg0.aClass225_108 = null;
															return true;
														} else if (Static230.aClass225_68 == arg0.aClass225_108) {
															local297 = local11.method8555(-9372);
															local104 = local11.method8555(-9372);
															@Pc(6917) Class2_Sub33 local6917 = Static592.method8154(Static165.aClass349_49, arg0.aClass48_1);
															local6917.aClass2_Sub20_Sub2_1.method8577(local297);
															local6917.aClass2_Sub20_Sub2_1.method8577(local104);
															arg0.method5173(local6917);
															arg0.aClass225_108 = null;
															return true;
														} else if (Static652.aClass225_197 == arg0.aClass225_108) {
															local297 = local11.method8575();
															if (local297 == 65535) {
																local297 = -1;
															}
															local104 = local11.method8555(-9372);
															Static471.method6759();
															Static171.method2547(1, -1, local297, local104);
															arg0.aClass225_108 = null;
															return true;
														} else if (arg0.aClass225_108 == Static465.aClass225_137) {
															local472 = local11.method8553();
															local795 = Static618.method8398(Static612.method8339(local11));
															Static296.method4163(0, local472, local795, 6, local472, local472);
															arg0.aClass225_108 = null;
															return true;
														} else if (arg0.aClass225_108 == Static224.aClass225_211) {
															local297 = local11.method8530();
															local795 = local11.method8553();
															Static471.method6759();
															Static163.method2434(local297, local795);
															arg0.aClass225_108 = null;
															return true;
														} else if (Static705.aClass225_206 == arg0.aClass225_108) {
															local472 = local11.method8553();
															local104 = local11.method8555(-9372);
															Static471.method6759();
															Static607.method8322(local104, local472);
															arg0.aClass225_108 = null;
															return true;
														} else if (Static77.aClass225_28 == arg0.aClass225_108) {
															local791 = local11.method8581(-17416) == 1;
															local795 = local11.method8553();
															local797 = local795;
															if (local791) {
																local797 = local11.method8553();
															}
															local1176 = local11.method8581(-17416);
															local1817 = local11.method8575();
															local1950 = false;
															if (local1176 <= 1 && Static255.method3623(local797)) {
																local1950 = true;
															}
															if (!local1950 && Static78.anInt1358 == 0) {
																local2000 = Static645.aClass180_2.method3843(local1817).method4320(local11);
																if (local1176 == 2) {
																	Static660.method9034(local1817, (String) null, local2000, local795, 25, "<img=1>" + local795, "<img=1>" + local797, 0);
																} else if (local1176 == 1) {
																	Static660.method9034(local1817, (String) null, local2000, local795, 25, "<img=0>" + local795, "<img=0>" + local797, 0);
																} else {
																	Static660.method9034(local1817, (String) null, local2000, local795, 25, local795, local797, 0);
																}
															}
															arg0.aClass225_108 = null;
															return true;
														} else if (arg0.aClass225_108 == Static510.aClass225_153) {
															local297 = local11.method8557();
															local104 = local11.method8557();
															local532 = local11.method8557();
															local1176 = local11.method8530() << 2;
															local1817 = local11.method8588();
															Static471.method6759();
															Static137.method1988(local1817, local532, local1176, local297, local104);
															arg0.aClass225_108 = null;
															return true;
														} else if (Static455.aClass225_132 == arg0.aClass225_108) {
															local297 = local11.method8529((byte) 86);
															local6468 = local11.method8557() == 1;
															Static471.method6759();
															Static660.method9037(local297, local6468);
															arg0.aClass225_108 = null;
															return true;
														} else if (Static114.aClass225_35 == arg0.aClass225_108) {
															Static190.anInt3107 = local11.method8581(-17416);
															Static539.anInt8520 = Static602.anInt10526;
															arg0.aClass225_108 = null;
															return true;
														} else if (Static141.aClass225_171 == arg0.aClass225_108) {
															Static126.anInt2110 = local11.method8595();
															Static70.aBoolean137 = local11.method8581(-17416) == 1;
															arg0.aClass225_108 = null;
															return true;
														} else {
															@Pc(7458) String local7458;
															if (Static611.aClass225_183 == arg0.aClass225_108) {
																local791 = local11.method8581(-17416) == 1;
																local795 = local11.method8553();
																local797 = local795;
																if (local791) {
																	local797 = local11.method8553();
																}
																local808 = (long) local11.method8575();
																local815 = (long) local11.method8583();
																local819 = local11.method8581(-17416);
																local1304 = local11.method8575();
																@Pc(7382) long local7382 = local815 + (local808 << 32);
																@Pc(7384) boolean local7384 = false;
																local1563 = 0;
																while (true) {
																	if (local1563 >= 100) {
																		if (local819 <= 1 && Static255.method3623(local797)) {
																			local7384 = true;
																		}
																		break;
																	}
																	if (Static686.aLongArray22[local1563] == local7382) {
																		local7384 = true;
																		break;
																	}
																	local1563++;
																}
																if (!local7384 && Static78.anInt1358 == 0) {
																	Static686.aLongArray22[Static580.anInt9161] = local7382;
																	Static580.anInt9161 = (Static580.anInt9161 + 1) % 100;
																	local7458 = Static645.aClass180_2.method3843(local1304).method4320(local11);
																	if (local819 == 2) {
																		Static660.method9034(local1304, (String) null, local7458, local795, 18, "<img=1>" + local795, "<img=1>" + local797, 0);
																	} else if (local819 == 1) {
																		Static660.method9034(local1304, (String) null, local7458, local795, 18, "<img=0>" + local795, "<img=0>" + local797, 0);
																	} else {
																		Static660.method9034(local1304, (String) null, local7458, local795, 18, local795, local797, 0);
																	}
																}
																arg0.aClass225_108 = null;
																return true;
															}
															@Pc(7570) byte[] local7570;
															if (arg0.aClass225_108 == Static722.aClass225_209) {
																if (Static249.aFrame1 != null) {
																	Static309.method4316(false, -1, -1, Static650.aClass2_Sub30_29.aClass11_Sub30_1.method9623());
																}
																local7570 = new byte[arg0.anInt5773];
																local11.method8602(arg0.anInt5773, local7570);
																local795 = Static155.method2227(0, arg0.anInt5773, local7570);
																local797 = "opensn";
																if (!Static396.aBoolean553 || Static514.method7280(1, local797, Static135.aClass389_2, local795).anInt3843 == 2) {
																	Static496.method7086(local795, Static135.aClass389_2, local797, true, Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() == 1);
																}
																arg0.aClass225_108 = null;
																return true;
															} else if (Static48.aClass225_19 == arg0.aClass225_108) {
																local791 = local11.method8581(-17416) == 1;
																local795 = local11.method8553();
																local1441 = (long) local11.method8575();
																local1446 = (long) local11.method8583();
																local1450 = local11.method8581(-17416);
																local819 = local11.method8575();
																local825 = local1446 + (local1441 << 32);
																local827 = false;
																@Pc(7685) Class2_Sub43 local7685 = local791 ? Static176.aClass2_Sub43_1 : Static205.aClass2_Sub43_2;
																if (local7685 == null) {
																	local827 = true;
																} else {
																	label2304: {
																		for (local1563 = 0; local1563 < 100; local1563++) {
																			if (local825 == Static686.aLongArray22[local1563]) {
																				local827 = true;
																				break label2304;
																			}
																		}
																		if (local1450 <= 1 && Static255.method3623(local795)) {
																			local827 = true;
																		}
																	}
																}
																if (!local827 && Static78.anInt1358 == 0) {
																	Static686.aLongArray22[Static580.anInt9161] = local825;
																	Static580.anInt9161 = (Static580.anInt9161 + 1) % 100;
																	local7458 = Static645.aClass180_2.method3843(local819).method4320(local11);
																	local2292 = local791 ? 42 : 45;
																	if (local1450 == 2 || local1450 == 3) {
																		Static660.method9034(local819, local7685.aString77, local7458, local795, local2292, "<img=1>" + local795, "<img=1>" + local795, 0);
																	} else if (local1450 == 1) {
																		Static660.method9034(local819, local7685.aString77, local7458, local795, local2292, "<img=0>" + local795, "<img=0>" + local795, 0);
																	} else {
																		Static660.method9034(local819, local7685.aString77, local7458, local795, local2292, local795, local795, 0);
																	}
																}
																arg0.aClass225_108 = null;
																return true;
															} else if (arg0.aClass225_108 == Static358.aClass225_107) {
																local297 = local11.method8554(31493);
																local5341 = local11.method8536();
																Static471.method6759();
																Static446.method6530(local5341, local297);
																arg0.aClass225_108 = null;
																return true;
															} else if (Static275.aClass225_82 == arg0.aClass225_108) {
																local297 = local11.method8575();
																local104 = local11.method8581(-17416);
																local756 = (local104 & 0x1) == 1;
																Static217.method3018(local756, local297);
																local1176 = local11.method8575();
																for (local1817 = 0; local1817 < local1176; local1817++) {
																	local1194 = local11.method8557();
																	if (local1194 == 255) {
																		local1194 = local11.method8540();
																	}
																	local1450 = local11.method8575();
																	Static91.method1396(local756, local297, local1817, local1194, local1450 - 1);
																}
																Static183.anIntArray227[Static167.anInt2888++ & 0x1F] = local297;
																arg0.aClass225_108 = null;
																return true;
															} else if (Static398.aClass225_123 == arg0.aClass225_108) {
																local3564 = local11.method8594();
																local104 = local11.method8559();
																Static396.aClass107_1.method2265(local104, local3564);
																arg0.aClass225_108 = null;
																return true;
															} else if (Static685.aClass225_203 == arg0.aClass225_108) {
																local297 = local11.method8593();
																local104 = local11.method8559();
																Static396.aClass107_1.method2269(local104, local297);
																arg0.aClass225_108 = null;
																return true;
															} else if (Static307.aClass225_93 == arg0.aClass225_108) {
																local791 = local11.method8581(-17416) == 1;
																local795 = local11.method8553();
																local797 = local795;
																if (local791) {
																	local797 = local11.method8553();
																}
																local808 = local11.method8590();
																local815 = (long) local11.method8575();
																local1456 = (long) local11.method8583();
																local1313 = local11.method8581(-17416);
																@Pc(8077) long local8077 = (local815 << 32) + local1456;
																local2611 = false;
																local2292 = 0;
																while (true) {
																	if (local2292 >= 100) {
																		if (local1313 <= 1) {
																			if (Static70.aBoolean137 && !Static337.aBoolean443 || Static329.aBoolean429) {
																				local2611 = true;
																			} else if (Static255.method3623(local797)) {
																				local2611 = true;
																			}
																		}
																		break;
																	}
																	if (local8077 == Static686.aLongArray22[local2292]) {
																		local2611 = true;
																		break;
																	}
																	local2292++;
																}
																if (!local2611 && Static78.anInt1358 == 0) {
																	Static686.aLongArray22[Static580.anInt9161] = local8077;
																	Static580.anInt9161 = (Static580.anInt9161 + 1) % 100;
																	@Pc(8163) String local8163 = Static618.method8398(Static612.method8339(local11));
																	if (local1313 == 2 || local1313 == 3) {
																		Static660.method9034(-1, Static341.method4741(local808), local8163, local795, 9, "<img=1>" + local795, "<img=1>" + local797, 0);
																	} else if (local1313 == 1) {
																		Static660.method9034(-1, Static341.method4741(local808), local8163, local795, 9, "<img=0>" + local795, "<img=0>" + local797, 0);
																	} else {
																		Static660.method9034(-1, Static341.method4741(local808), local8163, local795, 9, local795, local797, 0);
																	}
																}
																arg0.aClass225_108 = null;
																return true;
															} else if (Static225.aClass225_65 == arg0.aClass225_108) {
																Static34.method7593(Static241.aClass281_11);
																arg0.aClass225_108 = null;
																return true;
															} else if (arg0.aClass225_108 == Static584.aClass225_173) {
																Static536.aClass139_3 = Static714.method9500(local11.method8581(-17416));
																arg0.aClass225_108 = null;
																return true;
															} else if (arg0.aClass225_108 == Static273.aClass225_80) {
																Static133.anInt2219 = Static602.anInt10526;
																local791 = local11.method8581(-17416) == 1;
																@Pc(8319) Class373 local8319 = new Class373(local11);
																@Pc(8323) Class394 local8323;
																if (local791) {
																	local8323 = Static276.aClass394_7;
																} else {
																	local8323 = Static91.aClass394_3;
																}
																local8319.method8959(local8323);
																arg0.aClass225_108 = null;
																return true;
															} else if (arg0.aClass225_108 == Static268.aClass225_77) {
																if (Static249.aFrame1 != null) {
																	Static309.method4316(false, -1, -1, Static650.aClass2_Sub30_29.aClass11_Sub30_1.method9623());
																}
																local7570 = new byte[arg0.anInt5773];
																local11.method8602(arg0.anInt5773, local7570);
																local795 = Static155.method2227(0, arg0.anInt5773, local7570);
																Static118.method1729(local795, Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() == 1, true, Static135.aClass389_2);
																arg0.aClass225_108 = null;
																return true;
															} else if (arg0.aClass225_108 == Static167.aClass225_52) {
																Static103.anInt10706 = local11.method8593();
																Static690.anInt10624 = local11.method8581(-17416);
																arg0.aClass225_108 = null;
																return true;
															} else if (Static671.aClass225_201 == arg0.aClass225_108) {
																local297 = local11.method8575();
																if (local297 == 65535) {
																	local297 = -1;
																}
																local104 = local11.method8581(-17416);
																local532 = local11.method8575();
																local1176 = local11.method8581(-17416);
																local1817 = local11.method8575();
																Static485.method6932(local1817, local104, local1176, local532, local297);
																arg0.aClass225_108 = null;
																return true;
															} else if (arg0.aClass225_108 == Static704.aClass225_205) {
																Static276.method7839((byte) 110);
																arg0.aClass225_108 = null;
																return false;
															} else if (Static712.aClass225_207 == arg0.aClass225_108) {
																local297 = local11.method8578();
																Static471.method6759();
																if (local297 == -1) {
																	Static253.anInt3964 = -1;
																	Static45.anInt602 = -1;
																} else {
																	local104 = local297 >> 14 & 0x3FFF;
																	local104 -= Static243.anInt3820;
																	local532 = local297 & 0x3FFF;
																	local532 -= Static224.anInt11062;
																	if (local104 < 0) {
																		local104 = 0;
																	} else if (local104 >= Static426.anInt6942) {
																		local104 = Static426.anInt6942;
																	}
																	if (local532 < 0) {
																		local532 = 0;
																	} else if (Static280.anInt6752 <= local532) {
																		local532 = Static280.anInt6752;
																	}
																	Static45.anInt602 = (local104 << 9) + 256;
																	Static253.anInt3964 = (local532 << 9) + 256;
																}
																arg0.aClass225_108 = null;
																return true;
															} else if (arg0.aClass225_108 == Static191.aClass225_58) {
																local297 = local11.method8593();
																local104 = local11.method8529((byte) 76);
																Static471.method6759();
																Static331.method4596(local104, local297);
																arg0.aClass225_108 = null;
																return true;
															} else if (arg0.aClass225_108 == Static511.aClass225_154) {
																if (Static542.anInt8552 != -1) {
																	Static627.method8472(Static542.anInt8552, 0);
																}
																arg0.aClass225_108 = null;
																return true;
															} else if (Static565.aClass225_168 == arg0.aClass225_108) {
																local297 = local11.method8581(-17416);
																local6468 = (local297 & 0x1) == 1;
																local797 = local11.method8553();
																local6816 = local11.method8553();
																if (local6816.equals("")) {
																	local6816 = local797;
																}
																local6818 = local11.method8553();
																local3176 = local11.method8553();
																if (local3176.equals("")) {
																	local3176 = local6818;
																}
																if (local6468) {
																	for (local1450 = 0; local1450 < Static194.anInt3157; local1450++) {
																		if (Static451.aStringArray31[local1450].equals(local3176)) {
																			Static12.aStringArray2[local1450] = local797;
																			Static451.aStringArray31[local1450] = local6816;
																			Static514.aStringArray37[local1450] = local6818;
																			Static490.aStringArray35[local1450] = local3176;
																			break;
																		}
																	}
																} else {
																	Static12.aStringArray2[Static194.anInt3157] = local797;
																	Static451.aStringArray31[Static194.anInt3157] = local6816;
																	Static514.aStringArray37[Static194.anInt3157] = local6818;
																	Static490.aStringArray35[Static194.anInt3157] = local3176;
																	Static616.aBooleanArray37[Static194.anInt3157] = (local297 & 0x2) == 2;
																	Static194.anInt3157++;
																}
																arg0.aClass225_108 = null;
																Static459.anInt7473 = Static602.anInt10526;
																return true;
															} else if (arg0.aClass225_108 == Static307.aClass225_92) {
																Static34.method7593(Static54.aClass281_3);
																arg0.aClass225_108 = null;
																return true;
															} else if (arg0.aClass225_108 == Static123.aClass225_37) {
																for (local297 = 0; local297 < Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1.length; local297++) {
																	if (Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local297] != null) {
																		Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local297].anIntArray179 = null;
																		Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local297].aClass53_7.method4089(-1);
																	}
																}
																for (local104 = 0; local104 < Static676.anInt10488; local104++) {
																	Static459.aClass2_Sub49Array1[local104].aClass4_Sub2_Sub1_Sub2_Sub2_3.anIntArray179 = null;
																	Static459.aClass2_Sub49Array1[local104].aClass4_Sub2_Sub1_Sub2_Sub2_3.aClass53_7.method4089(-1);
																}
																arg0.aClass225_108 = null;
																return true;
															} else if (Static550.aClass225_165 == arg0.aClass225_108) {
																local791 = local11.method8581(-17416) == 1;
																local795 = local11.method8553();
																local797 = local795;
																if (local791) {
																	local797 = local11.method8553();
																}
																local1176 = local11.method8581(-17416);
																local1940 = false;
																if (local1176 <= 1) {
																	if (Static70.aBoolean137 && !Static337.aBoolean443 || Static329.aBoolean429) {
																		local1940 = true;
																	} else if (local1176 <= 1 && Static255.method3623(local797)) {
																		local1940 = true;
																	}
																}
																if (!local1940 && Static78.anInt1358 == 0) {
																	local3176 = Static618.method8398(Static612.method8339(local11));
																	if (local1176 == 2) {
																		Static660.method9034(-1, (String) null, local3176, local795, 24, "<img=1>" + local795, "<img=1>" + local797, 0);
																	} else if (local1176 == 1) {
																		Static660.method9034(-1, (String) null, local3176, local795, 24, "<img=0>" + local795, "<img=0>" + local797, 0);
																	} else {
																		Static660.method9034(-1, (String) null, local3176, local795, 24, local795, local797, 0);
																	}
																}
																arg0.aClass225_108 = null;
																return true;
															} else if (arg0.aClass225_108 == Static306.aClass225_91) {
																Static210.anInt3379 = Static602.anInt10526;
																local791 = local11.method8581(-17416) == 1;
																@Pc(9023) Class310 local9023 = new Class310(local11);
																@Pc(9027) Class2_Sub43 local9027;
																if (local791) {
																	local9027 = Static176.aClass2_Sub43_1;
																} else {
																	local9027 = Static205.aClass2_Sub43_2;
																}
																local9023.method7351(local9027);
																arg0.aClass225_108 = null;
																return true;
															} else if (Static60.aClass225_26 == arg0.aClass225_108) {
																local297 = local11.method8575();
																local104 = local11.method8540();
																Static471.method6759();
																Static446.method6530(local104, local297);
																arg0.aClass225_108 = null;
																return true;
															} else if (arg0.aClass225_108 == Static724.aClass225_210) {
																Static34.method7593(Static676.aClass281_17);
																arg0.aClass225_108 = null;
																return true;
															} else if (Static121.aClass225_36 == arg0.aClass225_108) {
																local297 = local11.method8540();
																local104 = local11.method8530();
																Static396.aClass107_1.method2269(local104, local297);
																arg0.aClass225_108 = null;
																return true;
															} else if (arg0.aClass225_108 == Static646.aClass225_192) {
																local297 = local11.method8530();
																local104 = local11.method8555(-9372);
																local532 = local11.method8575();
																local1176 = local11.method8554(31493);
																Static471.method6759();
																Static171.method2547(7, local532, local297 | local1176 << 16, local104);
																arg0.aClass225_108 = null;
																return true;
															} else if (arg0.aClass225_108 == Static455.aClass225_133) {
																Static34.method7593(Static335.aClass281_12);
																arg0.aClass225_108 = null;
																return true;
															} else if (Static320.aClass225_175 == arg0.aClass225_108) {
																local297 = local11.method8559();
																if (local297 == 65535) {
																	local297 = -1;
																}
																local104 = local11.method8581(-17416);
																local532 = local11.method8581(-17416);
																Static4.method60(local104, local532, local297);
																arg0.aClass225_108 = null;
																return true;
															} else if (Static296.aClass225_88 == arg0.aClass225_108) {
																local297 = local11.method8557();
																local104 = local11.method8583();
																local532 = local11.method8559();
																if (local532 == 65535) {
																	local532 = -1;
																}
																Static91.method1408(local104, local532, local297);
																arg0.aClass225_108 = null;
																return true;
															} else if (arg0.aClass225_108 == Static173.aClass225_56) {
																local297 = local11.method8555(-9372);
																Static525.aClass163_5 = Static135.aClass389_2.method9273(local297);
																arg0.aClass225_108 = null;
																return true;
															} else {
																Static329.method4572("T1 - " + (arg0.aClass225_108 == null ? -1 : arg0.aClass225_108.method5268()) + "," + (arg0.aClass225_109 == null ? -1 : arg0.aClass225_109.method5268()) + "," + (arg0.aClass225_110 == null ? -1 : arg0.aClass225_110.method5268()) + " - " + arg0.anInt5773, (Throwable) null);
																Static264.method3744(false);
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
	}
}
