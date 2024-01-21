import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!b", name = "m", descriptor = "I")
	public static int anInt207;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_3;

	@OriginalMember(owner = "client!b", name = "q", descriptor = "I")
	public static int anInt209;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "I")
	public static int anInt211;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Lclient!v;")
	public static Class62 aClass62_85 = Static45.method753("zur\u001c1ck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!b", name = "i", descriptor = "Lclient!v;")
	private static Class62 aClass62_87 = Static45.method753("Loaded gamescreen");

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Lclient!v;")
	public static Class62 aClass62_86 = aClass62_87;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "Lclient!jb;")
	public static Class34 aClass34_1 = new Class34(200);

	@OriginalMember(owner = "client!b", name = "h", descriptor = "[I")
	public static int[] anIntArray20 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!b", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray1 = new byte[1000][];

	@OriginalMember(owner = "client!b", name = "n", descriptor = "Lclient!v;")
	public static Class62 aClass62_88 = Static45.method753("(U4");

	@OriginalMember(owner = "client!b", name = "o", descriptor = "I")
	public static int anInt208 = 0;

	@OriginalMember(owner = "client!b", name = "r", descriptor = "I")
	public static int anInt210 = 0;

	@OriginalMember(owner = "client!b", name = "s", descriptor = "[I")
	public static int[] anIntArray21 = new int[2048];

	@OriginalMember(owner = "client!b", name = "u", descriptor = "Lclient!v;")
	public static Class62 aClass62_89 = Static45.method753("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I[BII)I")
	public static int method167(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg0; local9 < arg2; local9++) {
			local7 = local7 >>> 8 ^ Class39.anIntArray166[(arg1[local9] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!jc;Ljava/awt/Component;B)Lclient!sd;")
	public static Class3_Sub4_Sub2 method168(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Component arg1) {
		Static15.method378(arg1, arg0);
		@Pc(13) Class3_Sub4_Sub2 local13 = new Class3_Sub4_Sub2();
		Static17.method1865(local13);
		return local13;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public static void method169() {
		if (Static102.anInt2653 == 0 && Static77.anInt2067 == 0) {
			Static91.method1543(Static71.aClass62_849, Static61.anInt1672, 28, 0, Static41.aClass62_513, anInt208);
		}
		@Pc(26) int local26 = -1;
		for (@Pc(33) int local33 = 0; local33 < Static57.anInt1610; local33++) {
			@Pc(39) int local39 = Static57.anIntArray149[local33];
			@Pc(43) int local43 = local39 & 0x7F;
			@Pc(49) int local49 = local39 >> 7 & 0x7F;
			@Pc(55) int local55 = local39 >> 29 & 0x3;
			@Pc(61) int local61 = local39 >> 14 & 0x7FFF;
			if (local39 != local26) {
				local26 = local39;
				@Pc(185) int local185;
				if (local55 == 2 && Static76.aClass1_1.method22(Static27.anInt818, local43, local49, local39) >= 0) {
					@Pc(82) Class3_Sub1_Sub9 local82 = Static10.method1322(local61);
					if (local82.anIntArray72 != null) {
						local82 = local82.method653();
					}
					if (local82 == null) {
						continue;
					}
					if (Static102.anInt2653 == 1) {
						Static91.method1543(Static83.aClass62_209, local49, 15, local39, Static49.method782(new Class62[] { Static51.aClass62_1035, Static59.aClass62_707, local82.aClass62_457 }), local43);
					} else if (Static77.anInt2067 != 1) {
						@Pc(175) Class62[] local175 = local82.aClass62Array8;
						if (Static76.aBoolean119) {
							local175 = Static76.method1250(local175);
						}
						if (local175 != null) {
							for (local185 = 4; local185 >= 0; local185--) {
								if (local175[local185] != null) {
									@Pc(197) short local197 = 0;
									if (local185 == 0) {
										local197 = 35;
									}
									if (local185 == 1) {
										local197 = 47;
									}
									if (local185 == 2) {
										local197 = 25;
									}
									if (local185 == 3) {
										local197 = 41;
									}
									if (local185 == 4) {
										local197 = 1004;
									}
									Static91.method1543(local175[local185], local49, local197, local39, Static49.method782(new Class62[] { Static100.aClass62_1119, local82.aClass62_457 }), local43);
								}
							}
						}
						Static91.method1543(Static99.aClass62_1214, local49, 1003, local82.anInt1083 << 14, Static49.method782(new Class62[] { Static100.aClass62_1119, local82.aClass62_457 }), local43);
					} else if ((Static25.anInt771 & 0x4) == 4) {
						Static91.method1543(Static16.aClass62_266, local49, 1, local39, Static49.method782(new Class62[] { Static59.aClass62_704, Static59.aClass62_707, local82.aClass62_457 }), local43);
					}
				}
				@Pc(310) int local310;
				@Pc(318) Class3_Sub1_Sub3_Sub1_Sub2 local318;
				@Pc(373) Class3_Sub1_Sub3_Sub1_Sub1 local373;
				if (local55 == 1) {
					@Pc(287) Class3_Sub1_Sub3_Sub1_Sub2 local287 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local61];
					if (local287.aClass3_Sub1_Sub4_1.anInt648 == 1 && (local287.anInt1882 & 0x7F) == 64 && (local287.anInt1887 & 0x7F) == 64) {
						for (local310 = 0; local310 < Static39.anInt1159; local310++) {
							local318 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[Static16.anIntArray52[local310]];
							if (local318 != null && local318 != local287 && local318.aClass3_Sub1_Sub4_1.anInt648 == 1 && local318.anInt1882 == local287.anInt1882 && local287.anInt1887 == local318.anInt1887) {
								Static44.method720(Static16.anIntArray52[local310], local43, local318.aClass3_Sub1_Sub4_1, local49);
							}
						}
						for (local185 = 0; local185 < Static91.anInt2431; local185++) {
							local373 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[anIntArray21[local185]];
							if (local373 != null && local373.anInt1882 == local287.anInt1882 && local287.anInt1887 == local373.anInt1887) {
								Static102.method1687(local49, local43, anIntArray21[local185], local373);
							}
						}
					}
					Static44.method720(local61, local43, local287.aClass3_Sub1_Sub4_1, local49);
				}
				if (local55 == 0) {
					@Pc(421) Class3_Sub1_Sub3_Sub1_Sub1 local421 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local61];
					if ((local421.anInt1882 & 0x7F) == 64 && (local421.anInt1887 & 0x7F) == 64) {
						for (local310 = 0; local310 < Static39.anInt1159; local310++) {
							local318 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[Static16.anIntArray52[local310]];
							if (local318 != null && local318.aClass3_Sub1_Sub4_1.anInt648 == 1 && local318.anInt1882 == local421.anInt1882 && local421.anInt1887 == local318.anInt1887) {
								Static44.method720(Static16.anIntArray52[local310], local43, local318.aClass3_Sub1_Sub4_1, local49);
							}
						}
						for (local185 = 0; local185 < Static91.anInt2431; local185++) {
							local373 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[anIntArray21[local185]];
							if (local373 != null && local373 != local421 && local421.anInt1882 == local373.anInt1882 && local421.anInt1887 == local373.anInt1887) {
								Static102.method1687(local49, local43, anIntArray21[local185], local373);
							}
						}
					}
					Static102.method1687(local49, local43, local61, local421);
				}
				if (local55 == 3) {
					@Pc(543) Class24 local543 = Static40.aClass24ArrayArrayArray1[Static27.anInt818][local43][local49];
					if (local543 != null) {
						for (@Pc(550) Class3_Sub1_Sub3_Sub5 local550 = (Class3_Sub1_Sub3_Sub5) local543.method530(); local550 != null; local550 = (Class3_Sub1_Sub3_Sub5) local543.method528()) {
							@Pc(557) Class3_Sub1_Sub2 local557 = Static4.method160(local550.anInt2268);
							if (Static102.anInt2653 == 1) {
								Static91.method1543(Static83.aClass62_209, local49, 46, local550.anInt2268, Static49.method782(new Class62[] { Static51.aClass62_1035, Static38.aClass62_490, local557.aClass62_116 }), local43);
							} else if (Static77.anInt2067 != 1) {
								@Pc(597) Class62[] local597 = local557.aClass62Array4;
								if (Static76.aBoolean119) {
									local597 = Static76.method1250(local597);
								}
								for (@Pc(605) int local605 = 4; local605 >= 0; local605--) {
									if (local597 != null && local597[local605] != null) {
										@Pc(619) byte local619 = 0;
										if (local605 == 0) {
											local619 = 55;
										}
										if (local605 == 1) {
											local619 = 40;
										}
										if (local605 == 2) {
											local619 = 14;
										}
										if (local605 == 3) {
											local619 = 30;
										}
										if (local605 == 4) {
											local619 = 45;
										}
										Static91.method1543(local597[local605], local49, local619, local550.anInt2268, Static49.method782(new Class62[] { Static22.aClass62_311, local557.aClass62_116 }), local43);
									} else if (local605 == 2) {
										Static91.method1543(Static16.aClass62_265, local49, 14, local550.anInt2268, Static49.method782(new Class62[] { Static22.aClass62_311, local557.aClass62_116 }), local43);
									}
								}
								Static91.method1543(Static99.aClass62_1214, local49, 1002, local550.anInt2268, Static49.method782(new Class62[] { Static22.aClass62_311, local557.aClass62_116 }), local43);
							} else if ((Static25.anInt771 & 0x1) == 1) {
								Static91.method1543(Static16.aClass62_266, local49, 9, local550.anInt2268, Static49.method782(new Class62[] { Static59.aClass62_704, Static38.aClass62_490, local557.aClass62_116 }), local43);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIIBI)V")
	public static void method170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (!Static36.method666(arg4) || (arg2 > arg6 || arg9 > arg8 || arg7 <= arg6 || arg0 <= arg8)) {
			return;
		}
		@Pc(40) Class3_Sub1_Sub6[] local40 = Static65.aClass3_Sub1_Sub6ArrayArray1[arg4];
		for (@Pc(42) int local42 = 0; local42 < local40.length; local42++) {
			@Pc(48) Class3_Sub1_Sub6 local48 = local40[local42];
			if (local48 != null && arg5 == local48.anInt884) {
				@Pc(65) int local65 = arg2 + local48.anInt928;
				@Pc(74) int local74 = local48.anInt919 + arg9 - arg1;
				if ((local48.anInt929 >= 0 || local48.anInt903 != 0) && local65 <= arg6 && arg8 >= local74 && arg6 < local48.anInt890 + local65 && local74 + local48.anInt934 > arg8) {
					if (local48.anInt929 >= 0) {
						Static81.anInt2179 = local48.anInt929;
					} else {
						Static81.anInt2179 = local42;
					}
				}
				if (local48.anInt924 == 8 && arg6 >= local65 && local74 <= arg8 && arg6 < local48.anInt890 + local65 && local74 + local48.anInt934 > arg8) {
					Static93.anInt2485 = local42;
				}
				if (local48.anInt924 != 0) {
					if (local48.anInt921 == 1 && local65 <= arg6 && arg8 >= local74 && arg6 < local48.anInt890 + local65 && arg8 < local74 + local48.anInt934) {
						@Pc(255) boolean local255 = false;
						if (local48.anInt917 != 0) {
							local255 = Static44.method722(local48);
						}
						if (!local255) {
							Static91.method1543(local48.aClass62_381, local42 + (arg4 << 16), 31, 0, Static41.aClass62_513, 0);
						}
					}
					if (local48.anInt921 == 2 && Static77.anInt2067 == 0 && arg6 >= local65 && arg8 >= local74 && arg6 < local48.anInt890 + local65 && arg8 < local74 + local48.anInt934) {
						Static91.method1543(local48.aClass62_392, (arg4 << 16) + local42, 43, 0, Static49.method782(new Class62[] { Static64.aClass62_769, local48.aClass62_390 }), 0);
					}
					if (local48.anInt921 == 3 && local65 <= arg6 && arg8 >= local74 && arg6 < local65 + local48.anInt890 && local74 + local48.anInt934 > arg8) {
						@Pc(383) byte local383;
						if (arg3 == 3) {
							local383 = 26;
						} else {
							local383 = 53;
						}
						Static91.method1543(Static17.aClass62_1296, local42 + (arg4 << 16), local383, 0, Static41.aClass62_513, 0);
					}
					if (local48.anInt921 == 4 && arg6 >= local65 && local74 <= arg8 && local48.anInt890 + local65 > arg6 && arg8 < local74 + local48.anInt934) {
						Static91.method1543(local48.aClass62_381, (arg4 << 16) + local42, 33, 0, Static41.aClass62_513, 0);
					}
					if (local48.anInt921 == 5 && arg6 >= local65 && local74 <= arg8 && local48.anInt890 + local65 > arg6 && local74 + local48.anInt934 > arg8) {
						Static91.method1543(local48.aClass62_381, (arg4 << 16) + local42, 18, 0, Static41.aClass62_513, 0);
					}
					if (local48.anInt921 == 6 && !Static19.aBoolean169 && arg6 >= local65 && local74 <= arg8 && arg6 < local48.anInt890 + local65 && local74 + local48.anInt934 > arg8) {
						Static91.method1543(local48.aClass62_381, local42 + (arg4 << 16), 11, 0, Static41.aClass62_513, 0);
					}
					if (local48.anInt924 == 2) {
						@Pc(547) int local547 = 0;
						for (@Pc(549) int local549 = 0; local549 < local48.anInt934; local549++) {
							for (@Pc(553) int local553 = 0; local553 < local48.anInt890; local553++) {
								@Pc(564) int local564 = local549 * (local48.anInt933 + 32) + local74;
								@Pc(574) int local574 = local65 + (local48.anInt915 + 32) * local553;
								if (local547 < 20) {
									local574 += local48.anIntArray63[local547];
									local564 += local48.anIntArray69[local547];
								}
								if (arg6 >= local574 && arg8 >= local564 && arg6 < local574 + 32 && arg8 < local564 + 32) {
									Static58.anInt1618 = (arg4 << 16) + local42;
									Static93.anInt2488 = local547;
									if (local48.anIntArray64[local547] > 0) {
										@Pc(638) Class3_Sub1_Sub2 local638 = Static4.method160(local48.anIntArray64[local547] - 1);
										if (Static102.anInt2653 == 1 && local48.aBoolean46) {
											if (local42 + (arg4 << 16) != Static9.anInt1876 || Static39.anInt1160 != local547) {
												Static91.method1543(Static83.aClass62_209, (arg4 << 16) + local42, 29, local638.anInt288, Static49.method782(new Class62[] { Static51.aClass62_1035, Static38.aClass62_490, local638.aClass62_116 }), local547);
											}
										} else if (Static77.anInt2067 != 1 || !local48.aBoolean46) {
											@Pc(708) Class62[] local708 = local638.aClass62Array3;
											if (Static76.aBoolean119) {
												local708 = Static76.method1250(local708);
											}
											@Pc(723) int local723;
											@Pc(776) byte local776;
											if (local48.aBoolean46) {
												for (local723 = 4; local723 >= 3; local723--) {
													if (local708 != null && local708[local723] != null) {
														if (local723 == 3) {
															local776 = 49;
														} else {
															local776 = 4;
														}
														Static91.method1543(local708[local723], local42 + (arg4 << 16), local776, local638.anInt288, Static49.method782(new Class62[] { Static22.aClass62_311, local638.aClass62_116 }), local547);
													} else if (local723 == 4) {
														Static91.method1543(Static33.aClass62_460, local42 + (arg4 << 16), 4, local638.anInt288, Static49.method782(new Class62[] { Static22.aClass62_311, local638.aClass62_116 }), local547);
													}
												}
											}
											if (local48.aBoolean45) {
												Static91.method1543(Static83.aClass62_209, (arg4 << 16) + local42, 17, local638.anInt288, Static49.method782(new Class62[] { Static22.aClass62_311, local638.aClass62_116 }), local547);
											}
											if (local48.aBoolean46 && local708 != null) {
												for (local723 = 2; local723 >= 0; local723--) {
													if (local708[local723] != null) {
														local776 = 0;
														if (local723 == 0) {
															local776 = 38;
														}
														if (local723 == 1) {
															local776 = 51;
														}
														if (local723 == 2) {
															local776 = 27;
														}
														Static91.method1543(local708[local723], (arg4 << 16) + local42, local776, local638.anInt288, Static49.method782(new Class62[] { Static22.aClass62_311, local638.aClass62_116 }), local547);
													}
												}
											}
											local708 = local48.aClass62Array7;
											if (Static76.aBoolean119) {
												local708 = Static76.method1250(local708);
											}
											if (local708 != null) {
												for (local723 = 4; local723 >= 0; local723--) {
													if (local708[local723] != null) {
														local776 = 0;
														if (local723 == 0) {
															local776 = 24;
														}
														if (local723 == 1) {
															local776 = 50;
														}
														if (local723 == 2) {
															local776 = 56;
														}
														if (local723 == 3) {
															local776 = 2;
														}
														if (local723 == 4) {
															local776 = 54;
														}
														Static91.method1543(local708[local723], local42 + (arg4 << 16), local776, local638.anInt288, Static49.method782(new Class62[] { Static22.aClass62_311, local638.aClass62_116 }), local547);
													}
												}
											}
											Static91.method1543(Static99.aClass62_1214, local42 + (arg4 << 16), 1006, local638.anInt288, Static49.method782(new Class62[] { Static22.aClass62_311, local638.aClass62_116 }), local547);
										} else if ((Static25.anInt771 & 0x10) == 16) {
											Static91.method1543(Static16.aClass62_266, local42 + (arg4 << 16), 7, local638.anInt288, Static49.method782(new Class62[] { Static59.aClass62_704, Static38.aClass62_490, local638.aClass62_116 }), local547);
										}
									}
								}
								local547++;
							}
						}
					}
				} else if (!local48.aBoolean47 || Static106.method1846(local42, arg3) || Static15.aBoolean25) {
					method170(local74 + local48.anInt934, local48.anInt882, local65, arg3, arg4, local42, arg6, local65 + local48.anInt890, arg8, local74);
					if (local48.anInt934 < local48.anInt927) {
						Static76.method1246(local48, arg6, local48.anInt890 + local65, arg3, arg8, local74, local48.anInt927, local48.anInt934);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) Class3_Sub2 local3 = null;
		for (@Pc(16) Class3_Sub2 local16 = (Class3_Sub2) Static108.aClass24_82.method534(); local16 != null; local16 = (Class3_Sub2) Static108.aClass24_82.method525()) {
			if (local16.anInt188 == arg4 && local16.anInt174 == arg5 && local16.anInt189 == arg0 && arg7 == local16.anInt190) {
				local3 = local16;
				break;
			}
		}
		if (local3 == null) {
			local3 = new Class3_Sub2();
			local3.anInt190 = arg7;
			local3.anInt174 = arg5;
			local3.anInt188 = arg4;
			local3.anInt189 = arg0;
			Static7.method175(local3);
			Static108.aClass24_82.method535(local3);
		}
		local3.anInt183 = arg8;
		local3.anInt179 = arg1;
		local3.anInt191 = arg3;
		local3.anInt176 = arg6;
		local3.anInt180 = arg2;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
	public static void method172() {
		aClass62_87 = null;
		anIntArray20 = null;
		anIntArray21 = null;
		aByteArrayArray1 = null;
		aClass62_89 = null;
		aClass62_86 = null;
		aClass62_85 = null;
		aClass3_Sub1_Sub1_Sub1_3 = null;
		aClass62_88 = null;
		aClass34_1 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
	public static void method173() {
		@Pc(26) int local26;
		for (@Pc(18) int local18 = -1; local18 < Static91.anInt2431; local18++) {
			if (local18 == -1) {
				local26 = 2047;
			} else {
				local26 = anIntArray21[local18];
			}
			@Pc(36) Class3_Sub1_Sub3_Sub1_Sub1 local36 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local26];
			if (local36 != null && local36.anInt1835 > 0) {
				local36.anInt1835--;
				if (local36.anInt1835 == 0) {
					local36.aClass62_810 = null;
				}
			}
		}
		for (local26 = 0; local26 < Static39.anInt1159; local26++) {
			@Pc(73) int local73 = Static16.anIntArray52[local26];
			@Pc(77) Class3_Sub1_Sub3_Sub1_Sub2 local77 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local73];
			if (local77 != null && local77.anInt1835 > 0) {
				local77.anInt1835--;
				if (local77.anInt1835 == 0) {
					local77.aClass62_810 = null;
				}
			}
		}
	}
}
