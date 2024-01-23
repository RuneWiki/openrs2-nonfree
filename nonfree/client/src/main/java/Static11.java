import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!b", name = "d", descriptor = "Lclient!qh;")
	public static Class1_Sub23 aClass1_Sub23_105;

	@OriginalMember(owner = "client!b", name = "s", descriptor = "I")
	public static int anInt4742;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "[I")
	public static int[] anIntArray654 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!b", name = "j", descriptor = "Lclient!eh;")
	public static Class27 aClass27_125 = new Class27(30);

	@OriginalMember(owner = "client!b", name = "n", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1648 = Static200.method3116("glow3:");

	@OriginalMember(owner = "client!b", name = "o", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1649 = Static200.method3116(":assist:");

	@OriginalMember(owner = "client!b", name = "p", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1650 = Static200.method3116("Hidden)2");

	@OriginalMember(owner = "client!b", name = "q", descriptor = "[I")
	public static int[] anIntArray655 = new int[128];

	@OriginalMember(owner = "client!b", name = "r", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1651 = aClass60_1648;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1652 = aClass60_1648;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)[Lclient!ch;")
	public static Class1_Sub1_Sub6[] method3526() {
		@Pc(13) Class1_Sub1_Sub6[] local13 = new Class1_Sub1_Sub6[Static180.anInt3836];
		for (@Pc(15) int local15 = 0; local15 < Static180.anInt3836; local15++) {
			@Pc(25) int local25 = Static181.anIntArray504[local15] * Static10.anIntArray46[local15];
			@Pc(29) byte[] local29 = Static96.aByteArrayArray4[local15];
			@Pc(32) int[] local32 = new int[local25];
			for (@Pc(34) int local34 = 0; local34 < local25; local34++) {
				local32[local34] = Static110.anIntArray317[local29[local34] & 0xFF];
			}
			local13[local15] = new Class1_Sub1_Sub6_Sub1(Static97.anInt2261, Static176.anInt777, Static91.anIntArray251[local15], Static97.anIntArray263[local15], Static181.anIntArray504[local15], Static10.anIntArray46[local15], local32);
		}
		Static43.method711();
		return local13;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZBZZ)Lclient!vb;")
	public static Class7_Sub1 method3528(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class90 local10 = null;
		if (Static114.aClass66_2 != null) {
			local10 = new Class90(arg0, Static114.aClass66_2, Static15.aClass66Array1[arg0], 1000000);
		}
		return new Class7_Sub1(local10, Static6.aClass90_1, arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IBIIIIII[Lclient!ah;)V")
	public static void method3529(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class6[] arg7) {
		for (@Pc(13) int local13 = 0; local13 < arg7.length; local13++) {
			@Pc(19) Class6 local19 = arg7[local13];
			if (local19 != null && (!local19.aBoolean13 || local19.anInt233 == 0 || local19.aBoolean17 || Static166.method2717(local19) != 0 || local19 == Static84.aClass6_8 || local19.anInt245 == 1338) && local19.anInt204 == arg3 && (!local19.aBoolean13 || !Static132.method2209(local19))) {
				@Pc(61) int local61 = local19.anInt262 + arg4;
				@Pc(67) int local67 = local19.anInt235 + arg6;
				@Pc(75) int local75;
				@Pc(77) int local77;
				@Pc(73) int local73;
				@Pc(79) int local79;
				if (local19.anInt233 == 2) {
					local73 = arg2;
					local75 = arg1;
					local77 = arg5;
					local79 = arg0;
				} else {
					local77 = local67 > arg5 ? local67 : arg5;
					local75 = arg1 >= local61 ? arg1 : local61;
					@Pc(105) int local105 = local67 + local19.anInt221;
					@Pc(111) int local111 = local61 + local19.anInt251;
					if (local19.anInt233 == 9) {
						local111++;
						local105++;
					}
					local79 = local105 >= arg0 ? arg0 : local105;
					local73 = arg2 <= local111 ? arg2 : local111;
				}
				if (Static60.aClass6_9 == local19) {
					Static118.aBoolean146 = true;
					Static147.anInt3282 = local67;
					Static214.anInt4575 = local61;
				}
				if (!local19.aBoolean13 || local73 > local75 && local77 < local79) {
					if (local19.anInt233 == 0) {
						if (!local19.aBoolean13 && Static132.method2209(local19) && Static173.aClass6_15 != local19) {
							continue;
						}
						if (local19.aBoolean18 && local75 <= Static122.anInt2732 && Static176.anInt768 >= local77 && local73 > Static122.anInt2732 && local79 > Static176.anInt768) {
							for (@Pc(205) Class1_Sub8 local205 = (Class1_Sub8) Static208.aClass19_18.method609(); local205 != null; local205 = (Class1_Sub8) Static208.aClass19_18.method615()) {
								if (local205.aBoolean68) {
									local205.method3530();
								}
							}
							for (@Pc(227) Class1_Sub8 local227 = (Class1_Sub8) Static173.aClass19_15.method609(); local227 != null; local227 = (Class1_Sub8) Static173.aClass19_15.method615()) {
								if (local227.aBoolean68) {
									local227.method3530();
								}
							}
							Static100.aBoolean129 = false;
							if (Static56.anInt1481 == 0) {
								Static84.aClass6_8 = null;
								Static60.aClass6_9 = null;
							}
						}
					}
					if (local19.aBoolean13) {
						@Pc(282) boolean local282;
						if (Static122.anInt2732 >= local75 && local77 <= Static176.anInt768 && local73 > Static122.anInt2732 && Static176.anInt768 < local79) {
							local282 = true;
						} else {
							local282 = false;
						}
						@Pc(288) boolean local288 = false;
						@Pc(290) boolean local290 = false;
						if (Static192.anInt4115 == 1 && Static166.anInt3603 >= local75 && Static39.anInt882 >= local77 && local73 > Static166.anInt3603 && Static39.anInt882 < local79) {
							local290 = true;
						}
						if (Static27.anInt641 == 1 && local282) {
							local288 = true;
						}
						@Pc(344) int local344;
						@Pc(348) int local348;
						@Pc(357) int local357;
						if (Static107.anInt2466 > 0 && local19.aByteArray4 != null) {
							for (local344 = 0; local344 < local19.aByteArray4.length; local344++) {
								for (local348 = 0; local348 < Static107.anInt2466; local348++) {
									local357 = local19.aByteArray4[local344] & 0xFF;
									if (local357 == Static59.anIntArray172[local348]) {
										Static138.method2371(local19.anInt229, -1, Static149.aClass60_1155, local344 + 1);
									}
								}
							}
						}
						if (local290) {
							Static175.method2827(local19, Static39.anInt882 - local67, -local61 + Static166.anInt3603);
						}
						if (Static60.aClass6_9 != null && Static60.aClass6_9 != local19 && local282 && Static181.method2863(Static166.method2717(local19))) {
							Static47.aClass6_4 = local19;
						}
						if (local19 == Static84.aClass6_8) {
							Static83.anInt1957 = local67;
							Static128.aBoolean157 = true;
							Static190.anInt4082 = local61;
						}
						if (local19.aBoolean17 || local19.anInt245 != 0) {
							@Pc(445) Class1_Sub8 local445;
							if (local282 && Static172.anInt3717 != 0 && local19.anObjectArray13 != null) {
								local445 = new Class1_Sub8();
								local445.aClass6_5 = local19;
								local445.anObjectArray29 = local19.anObjectArray13;
								local445.anInt1072 = Static172.anInt3717;
								local445.aBoolean68 = true;
								Static208.aClass19_18.method620(local445);
							}
							if (Static60.aClass6_9 != null || Static17.aClass6_2 != null || Static162.aBoolean261 || local19.anInt245 != 1400 && Static100.aBoolean129) {
								local290 = false;
								local282 = false;
								local288 = false;
							}
							if (local19.anInt245 == 1337) {
								Static57.method1068(local19);
								continue;
							}
							if (local19.anInt245 == 1338) {
								if (local290) {
									Static131.method2197(Static166.anInt3603 - local61, -local67 + Static39.anInt882, local19);
								}
								continue;
							}
							if (local19.anInt245 == 1400) {
								Static147.aClass6_13 = local19;
								if (local290) {
									if (Static49.aBooleanArray5[82] && Static152.anInt3414 > 0) {
										local344 = Static138.anInt3087 + (int) ((double) (Static166.anInt3603 - local61 - local19.anInt251 / 2) * 2.0D / Static82.aDouble2) + Static73.anInt1791;
										local348 = Static30.anInt724 + Static153.anInt3417 - (int) ((double) (Static39.anInt882 - local67 - local19.anInt221 / 2) * 2.0D / Static82.aDouble2) - Static1.anInt42;
										@Pc(619) Class60 local619 = Static34.method611(new Class60[] { Static161.aClass60_1226, Static40.method681(local344 >> 6), Static203.aClass60_1480, Static40.method681(local348 >> 6), Static203.aClass60_1480, Static40.method681(local344 & 0x3F), Static203.aClass60_1480, Static40.method681(local348 & 0x3F) });
										local619.method1842();
										Static79.method1401(local619);
										Static82.method1454();
										continue;
									}
									Static29.anInt707 = Static122.anInt2732;
									Static100.aBoolean129 = true;
									Static194.anInt4140 = Static138.anInt3087;
									Static184.anInt3955 = Static176.anInt768;
									Static214.anInt4570 = Static1.anInt42;
									continue;
								}
								if (local288 && Static100.aBoolean129) {
									Static133.method2214((int) ((double) (Static29.anInt707 - Static122.anInt2732) * 2.0D / Static8.aDouble1) + Static194.anInt4140);
									Static8.method159((int) ((double) (Static184.anInt3955 - Static176.anInt768) * 2.0D / Static8.aDouble1) + Static214.anInt4570);
									continue;
								}
								Static100.aBoolean129 = false;
								continue;
							}
							if (local19.anInt245 == 1401) {
								if (local288) {
									Static188.method2940(local19.anInt221, Static122.anInt2732 - local61, Static176.anInt768 - local67, local19.anInt251);
								}
								continue;
							}
							if (!local19.aBoolean16 && local290) {
								local19.aBoolean16 = true;
								if (local19.anObjectArray25 != null) {
									local445 = new Class1_Sub8();
									local445.anObjectArray29 = local19.anObjectArray25;
									local445.anInt1072 = Static39.anInt882 - local67;
									local445.aBoolean68 = true;
									local445.anInt1069 = Static166.anInt3603 - local61;
									local445.aClass6_5 = local19;
									Static208.aClass19_18.method620(local445);
								}
							}
							if (local19.aBoolean16 && local288 && local19.anObjectArray14 != null) {
								local445 = new Class1_Sub8();
								local445.anObjectArray29 = local19.anObjectArray14;
								local445.aClass6_5 = local19;
								local445.anInt1069 = Static122.anInt2732 - local61;
								local445.anInt1072 = Static176.anInt768 - local67;
								local445.aBoolean68 = true;
								Static208.aClass19_18.method620(local445);
							}
							if (local19.aBoolean16 && !local288) {
								local19.aBoolean16 = false;
								if (local19.anObjectArray23 != null) {
									local445 = new Class1_Sub8();
									local445.aBoolean68 = true;
									local445.anInt1072 = Static176.anInt768 - local67;
									local445.aClass6_5 = local19;
									local445.anObjectArray29 = local19.anObjectArray23;
									local445.anInt1069 = Static122.anInt2732 - local61;
									Static173.aClass19_15.method620(local445);
								}
							}
							if (local288 && local19.anObjectArray3 != null) {
								local445 = new Class1_Sub8();
								local445.anObjectArray29 = local19.anObjectArray3;
								local445.anInt1069 = Static122.anInt2732 - local61;
								local445.aBoolean68 = true;
								local445.anInt1072 = Static176.anInt768 - local67;
								local445.aClass6_5 = local19;
								Static208.aClass19_18.method620(local445);
							}
							if (!local19.aBoolean9 && local282) {
								local19.aBoolean9 = true;
								if (local19.anObjectArray1 != null) {
									local445 = new Class1_Sub8();
									local445.aBoolean68 = true;
									local445.anObjectArray29 = local19.anObjectArray1;
									local445.anInt1069 = Static122.anInt2732 - local61;
									local445.aClass6_5 = local19;
									local445.anInt1072 = Static176.anInt768 - local67;
									Static208.aClass19_18.method620(local445);
								}
							}
							if (local19.aBoolean9 && local282 && local19.anObjectArray22 != null) {
								local445 = new Class1_Sub8();
								local445.aClass6_5 = local19;
								local445.anInt1069 = Static122.anInt2732 - local61;
								local445.aBoolean68 = true;
								local445.anInt1072 = Static176.anInt768 - local67;
								local445.anObjectArray29 = local19.anObjectArray22;
								Static208.aClass19_18.method620(local445);
							}
							if (local19.aBoolean9 && !local282) {
								local19.aBoolean9 = false;
								if (local19.anObjectArray18 != null) {
									local445 = new Class1_Sub8();
									local445.aBoolean68 = true;
									local445.anObjectArray29 = local19.anObjectArray18;
									local445.anInt1069 = Static122.anInt2732 - local61;
									local445.aClass6_5 = local19;
									local445.anInt1072 = Static176.anInt768 - local67;
									Static173.aClass19_15.method620(local445);
								}
							}
							if (local19.anObjectArray20 != null) {
								local445 = new Class1_Sub8();
								local445.aClass6_5 = local19;
								local445.anObjectArray29 = local19.anObjectArray20;
								Static37.aClass19_4.method620(local445);
							}
							@Pc(1054) Class1_Sub8 local1054;
							if (local19.anObjectArray11 != null && Static164.anInt3597 > local19.anInt219) {
								if (local19.anIntArray27 == null || Static164.anInt3597 - local19.anInt219 > 32) {
									local445 = new Class1_Sub8();
									local445.anObjectArray29 = local19.anObjectArray11;
									local445.aClass6_5 = local19;
									Static208.aClass19_18.method620(local445);
								} else {
									label436: for (local344 = local19.anInt219; local344 < Static164.anInt3597; local344++) {
										local348 = Static50.anIntArray221[local344 & 0x1F];
										for (local357 = 0; local357 < local19.anIntArray27.length; local357++) {
											if (local19.anIntArray27[local357] == local348) {
												local1054 = new Class1_Sub8();
												local1054.aClass6_5 = local19;
												local1054.anObjectArray29 = local19.anObjectArray11;
												Static208.aClass19_18.method620(local1054);
												break label436;
											}
										}
									}
								}
								local19.anInt219 = Static164.anInt3597;
							}
							if (local19.anObjectArray4 != null && Static18.anInt465 > local19.anInt202) {
								if (local19.anIntArray32 == null || Static18.anInt465 - local19.anInt202 > 32) {
									local445 = new Class1_Sub8();
									local445.anObjectArray29 = local19.anObjectArray4;
									local445.aClass6_5 = local19;
									Static208.aClass19_18.method620(local445);
								} else {
									label412: for (local344 = local19.anInt202; local344 < Static18.anInt465; local344++) {
										local348 = Static152.anIntArray442[local344 & 0x1F];
										for (local357 = 0; local357 < local19.anIntArray32.length; local357++) {
											if (local19.anIntArray32[local357] == local348) {
												local1054 = new Class1_Sub8();
												local1054.anObjectArray29 = local19.anObjectArray4;
												local1054.aClass6_5 = local19;
												Static208.aClass19_18.method620(local1054);
												break label412;
											}
										}
									}
								}
								local19.anInt202 = Static18.anInt465;
							}
							if (local19.anObjectArray19 != null && Static38.anInt874 > local19.anInt208) {
								if (local19.anIntArray30 == null || Static38.anInt874 - local19.anInt208 > 32) {
									local445 = new Class1_Sub8();
									local445.aClass6_5 = local19;
									local445.anObjectArray29 = local19.anObjectArray19;
									Static208.aClass19_18.method620(local445);
								} else {
									label388: for (local344 = local19.anInt208; local344 < Static38.anInt874; local344++) {
										local348 = Static172.anIntArray487[local344 & 0x1F];
										for (local357 = 0; local357 < local19.anIntArray30.length; local357++) {
											if (local348 == local19.anIntArray30[local357]) {
												local1054 = new Class1_Sub8();
												local1054.aClass6_5 = local19;
												local1054.anObjectArray29 = local19.anObjectArray19;
												Static208.aClass19_18.method620(local1054);
												break label388;
											}
										}
									}
								}
								local19.anInt208 = Static38.anInt874;
							}
							if (local19.anInt214 < Static204.anInt4328 && local19.anObjectArray10 != null) {
								local445 = new Class1_Sub8();
								local445.aClass6_5 = local19;
								local445.anObjectArray29 = local19.anObjectArray10;
								Static208.aClass19_18.method620(local445);
							}
							if (Static181.anInt3848 > local19.anInt214 && local19.anObjectArray12 != null) {
								local445 = new Class1_Sub8();
								local445.anObjectArray29 = local19.anObjectArray12;
								local445.aClass6_5 = local19;
								Static208.aClass19_18.method620(local445);
							}
							if (local19.anInt214 < Static106.anInt2406 && local19.anObjectArray16 != null) {
								local445 = new Class1_Sub8();
								local445.aClass6_5 = local19;
								local445.anObjectArray29 = local19.anObjectArray16;
								Static208.aClass19_18.method620(local445);
							}
							if (local19.anInt214 < Static115.anInt2627 && local19.anObjectArray24 != null) {
								local445 = new Class1_Sub8();
								local445.anObjectArray29 = local19.anObjectArray24;
								local445.aClass6_5 = local19;
								Static208.aClass19_18.method620(local445);
							}
							if (Static46.anInt1054 > local19.anInt214 && local19.anObjectArray26 != null) {
								local445 = new Class1_Sub8();
								local445.aClass6_5 = local19;
								local445.anObjectArray29 = local19.anObjectArray26;
								Static208.aClass19_18.method620(local445);
							}
							local19.anInt214 = Static171.anInt3707;
							if (local19.anObjectArray5 != null) {
								for (local344 = 0; local344 < Static107.anInt2466; local344++) {
									@Pc(1413) Class1_Sub8 local1413 = new Class1_Sub8();
									local1413.aClass6_5 = local19;
									local1413.anInt1071 = Static59.anIntArray172[local344];
									local1413.anInt1068 = Static213.anIntArray609[local344];
									local1413.anObjectArray29 = local19.anObjectArray5;
									Static208.aClass19_18.method620(local1413);
								}
							}
						}
					}
					if (!local19.aBoolean13 && Static60.aClass6_9 == null && Static17.aClass6_2 == null && !Static162.aBoolean261) {
						if ((local19.anInt240 >= 0 || local19.anInt249 != 0) && Static122.anInt2732 >= local75 && local77 <= Static176.anInt768 && local73 > Static122.anInt2732 && Static176.anInt768 < local79) {
							if (local19.anInt240 < 0) {
								Static173.aClass6_15 = local19;
							} else {
								Static173.aClass6_15 = arg7[local19.anInt240];
							}
						}
						if (local19.anInt233 == 8 && local75 <= Static122.anInt2732 && Static176.anInt768 >= local77 && Static122.anInt2732 < local73 && local79 > Static176.anInt768) {
							Static26.aClass6_3 = local19;
						}
						if (local19.anInt266 > local19.anInt221) {
							Static112.method1924(Static176.anInt768, local19.anInt266, local19, local67, Static122.anInt2732, local19.anInt251 + local61, local19.anInt221);
						}
					}
					if (local19.anInt233 == 0) {
						method3529(local79, local75, local73, local19.anInt229, local61 - local19.anInt250, local77, local67 - local19.anInt247, arg7);
						if (local19.aClass6Array1 != null) {
							method3529(local79, local75, local73, local19.anInt229, local61 - local19.anInt250, local77, local67 - local19.anInt247, local19.aClass6Array1);
						}
						@Pc(1599) Class1_Sub11 local1599 = (Class1_Sub11) Static10.aClass33_1.method1071((long) local19.anInt229);
						if (local1599 != null) {
							Static79.method1402(local75, local67, local77, local73, local1599.anInt1626, local61, local79);
						}
					}
				}
			}
		}
	}
}
