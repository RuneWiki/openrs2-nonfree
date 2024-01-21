import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!ie;")
	public static Class35 aClass35_27;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
	public static int anInt2540 = 0;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!id;")
	public static Class34 aClass34_1269 = Static9.method266("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!id;")
	public static Class34 aClass34_1270 = Static9.method266("mapedge");

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
	public static volatile int anInt2543 = -1;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
	public static int anInt2546 = 1;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "Lclient!id;")
	public static Class34 aClass34_1271 = Static9.method266("Lade)3)3)3");

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[B[Lclient!pb;BIIIIII)V")
	public static void method1688(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class58[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (local7 + arg3 > 0 && local7 + arg3 < 103 && local11 + arg6 > 0 && arg6 + local11 < 103) {
					arg2[arg8].anIntArrayArray26[local7 + arg3][local11 + arg6] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(82) Class1_Sub19 local82 = new Class1_Sub19(arg1);
		for (@Pc(90) int local90 = 0; local90 < 4; local90++) {
			for (@Pc(94) int local94 = 0; local94 < 64; local94++) {
				for (@Pc(98) int local98 = 0; local98 < 64; local98++) {
					if (arg5 == local90 && arg7 <= local94 && arg7 + 8 > local94 && local98 >= arg0 && arg0 + 8 > local98) {
						Static115.method1848(arg4, 0, arg6 + Static87.method1486(arg4, local94 & 0x7, local98 & 0x7), 0, Static41.method701(local94 & 0x7, arg4, local98 & 0x7) + arg3, local82, arg8);
					} else {
						Static115.method1848(0, 0, -1, 0, -1, local82, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLclient!l;[Lclient!pb;)V")
	public static void method1689(@OriginalArg(1) Class44 arg0, @OriginalArg(2) Class58[] arg1) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(28) int local28;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static105.aByteArrayArrayArray9[local3][local7][local11] & 0x1) == 1) {
						local28 = local3;
						if ((Static105.aByteArrayArrayArray9[1][local7][local11] & 0x2) == 2) {
							local28 = local3 - 1;
						}
						if (local28 >= 0) {
							arg1[local28].method1599(local7, local11);
						}
					}
				}
			}
		}
		Static45.anInt2764 += (int) (Math.random() * 5.0D) - 2;
		if (Static45.anInt2764 < -8) {
			Static45.anInt2764 = -8;
		}
		Static130.anInt1500 += (int) (Math.random() * 5.0D) - 2;
		if (Static45.anInt2764 > 8) {
			Static45.anInt2764 = 8;
		}
		if (Static130.anInt1500 < -16) {
			Static130.anInt1500 = -16;
		}
		if (Static130.anInt1500 > 16) {
			Static130.anInt1500 = 16;
		}
		@Pc(131) int local131;
		@Pc(133) int local133;
		@Pc(137) int local137;
		@Pc(160) int local160;
		@Pc(181) int local181;
		@Pc(195) int local195;
		@Pc(205) int local205;
		@Pc(199) int local199;
		@Pc(211) int local211;
		@Pc(229) int local229;
		@Pc(278) int local278;
		@Pc(508) int local508;
		@Pc(550) int local550;
		@Pc(648) int local648;
		@Pc(658) int local658;
		@Pc(673) int local673;
		for (local7 = 0; local7 < 4; local7++) {
			@Pc(121) byte[][] local121 = Static69.aByteArrayArrayArray7[local7];
			local28 = (int) Math.sqrt(5100.0D);
			local131 = local28 * 768 >> 8;
			for (local133 = 1; local133 < 103; local133++) {
				for (local137 = 1; local137 < 103; local137++) {
					local160 = Static98.anIntArrayArrayArray4[local7][local137 + 1][local133] - Static98.anIntArrayArrayArray4[local7][local137 - 1][local133];
					local181 = Static98.anIntArrayArrayArray4[local7][local137][local133 + 1] - Static98.anIntArrayArrayArray4[local7][local137][local133 - 1];
					local195 = (int) Math.sqrt((double) (local160 * local160 + local181 * local181 + 65536));
					local199 = 65536 / local195;
					local205 = (local160 << 8) / local195;
					local211 = (local181 << 8) / local195;
					local229 = (local205 * -50 + local199 * -10 + local211 * -50) / local131 + 96;
					local278 = (local121[local137][local133 + 1] >> 3) + ((local121[local137 - 1][local133] >> 2) - (-(local121[local137 + 1][local133] >> 3) - ((local121[local137][local133 - 1] >> 2) + (local121[local137][local133] >> 1))));
					Static84.anIntArrayArray23[local137][local133] = local229 - local278;
				}
			}
			for (local137 = 0; local137 < 104; local137++) {
				Static16.anIntArray63[local137] = 0;
				Static113.anIntArray342[local137] = 0;
				Static93.anIntArray307[local137] = 0;
				Static76.anIntArray232[local137] = 0;
				Static100.anIntArray315[local137] = 0;
			}
			for (local160 = -5; local160 < 109; local160++) {
				for (local181 = 0; local181 < 104; local181++) {
					local195 = local160 + 5;
					@Pc(399) int local399;
					if (local195 >= 0 && local195 < 104) {
						local205 = Static127.aByteArrayArrayArray8[local7][local195][local181] & 0xFF;
						if (local205 > 0) {
							@Pc(363) Class1_Sub1_Sub13 local363 = Static16.method381(local205 - 1);
							Static16.anIntArray63[local181] += local363.anInt2717;
							Static113.anIntArray342[local181] += local363.anInt2715;
							Static93.anIntArray307[local181] += local363.anInt2716;
							Static76.anIntArray232[local181] += local363.anInt2705;
							local399 = Static100.anIntArray315[local181]++;
						}
					}
					local205 = local160 - 5;
					if (local205 >= 0 && local205 < 104) {
						local199 = Static127.aByteArrayArrayArray8[local7][local205][local181] & 0xFF;
						if (local199 > 0) {
							@Pc(437) Class1_Sub1_Sub13 local437 = Static16.method381(local199 - 1);
							Static16.anIntArray63[local181] -= local437.anInt2717;
							Static113.anIntArray342[local181] -= local437.anInt2715;
							Static93.anIntArray307[local181] -= local437.anInt2716;
							Static76.anIntArray232[local181] -= local437.anInt2705;
							local399 = Static100.anIntArray315[local181]--;
						}
					}
				}
				if (local160 >= 1 && local160 < 103) {
					local195 = 0;
					local205 = 0;
					local199 = 0;
					local229 = 0;
					local211 = 0;
					for (local278 = -5; local278 < 109; local278++) {
						local508 = local278 + 5;
						if (local508 >= 0 && local508 < 104) {
							local199 += Static93.anIntArray307[local508];
							local205 += Static113.anIntArray342[local508];
							local195 += Static16.anIntArray63[local508];
							local211 += Static76.anIntArray232[local508];
							local229 += Static100.anIntArray315[local508];
						}
						local550 = local278 - 5;
						if (local550 >= 0 && local550 < 104) {
							local195 -= Static16.anIntArray63[local550];
							local229 -= Static100.anIntArray315[local550];
							local205 -= Static113.anIntArray342[local550];
							local199 -= Static93.anIntArray307[local550];
							local211 -= Static76.anIntArray232[local550];
						}
						if (local278 >= 1 && local278 < 103 && (!Static21.aBoolean39 || (Static105.aByteArrayArrayArray9[0][local160][local278] & 0x2) != 0 || (Static105.aByteArrayArrayArray9[local7][local160][local278] & 0x10) == 0 && Static29.method551(local160, local7, local278) == Static128.anInt3003)) {
							if (Static5.anInt358 > local7) {
								Static5.anInt358 = local7;
							}
							local648 = Static127.aByteArrayArrayArray8[local7][local160][local278] & 0xFF;
							local658 = Static21.aByteArrayArrayArray6[local7][local160][local278] & 0xFF;
							if (local648 > 0 || local658 > 0) {
								local673 = Static98.anIntArrayArrayArray4[local7][local160][local278];
								@Pc(685) int local685 = Static98.anIntArrayArrayArray4[local7][local160 + 1][local278 + 1];
								@Pc(695) int local695 = Static98.anIntArrayArrayArray4[local7][local160 + 1][local278];
								@Pc(701) int local701 = Static84.anIntArrayArray23[local160][local278];
								@Pc(711) int local711 = Static98.anIntArrayArrayArray4[local7][local160][local278 + 1];
								@Pc(721) int local721 = Static84.anIntArrayArray23[local160 + 1][local278 + 1];
								@Pc(729) int local729 = Static84.anIntArrayArray23[local160 + 1][local278];
								@Pc(731) int local731 = -1;
								@Pc(733) int local733 = -1;
								@Pc(741) int local741 = Static84.anIntArrayArray23[local160][local278 + 1];
								@Pc(752) int local752;
								@Pc(756) int local756;
								if (local648 > 0) {
									local752 = local195 * 256 / local211;
									local756 = local205 / local229;
									@Pc(760) int local760 = local199 / local229;
									local731 = Static8.method261(local760, local756, local752);
									local760 += Static130.anInt1500;
									if (local760 < 0) {
										local760 = 0;
									} else if (local760 > 255) {
										local760 = 255;
									}
									local752 = Static45.anInt2764 + local752 & 0xFF;
									local733 = Static8.method261(local760, local756, local752);
								}
								if (local7 > 0) {
									@Pc(802) boolean local802 = true;
									if (local648 == 0 && Static6.aByteArrayArrayArray1[local7][local160][local278] != 0) {
										local802 = false;
									}
									if (local658 > 0 && !Static32.method897(local658 - 1).aBoolean151) {
										local802 = false;
									}
									if (local802 && local673 == local695 && local673 == local685 && local673 == local711) {
										Static50.anIntArrayArrayArray1[local7][local160][local278] |= 0x924;
									}
								}
								local752 = 0;
								if (local733 != -1) {
									local752 = Static108.anIntArray337[Static19.method397(local733, 96)];
								}
								if (local658 == 0) {
									arg0.method1157(local7, local160, local278, 0, 0, -1, local673, local695, local685, local711, Static19.method397(local731, local701), Static19.method397(local731, local729), Static19.method397(local731, local721), Static19.method397(local731, local741), 0, 0, 0, 0, local752, 0);
								} else {
									@Pc(879) byte local879 = Static16.aByteArrayArrayArray5[local7][local160][local278];
									local756 = Static6.aByteArrayArrayArray1[local7][local160][local278] + 1;
									@Pc(895) Class1_Sub1_Sub12 local895 = Static32.method897(local658 - 1);
									@Pc(898) int local898 = local895.anInt2682;
									@Pc(915) int local915;
									@Pc(913) int local913;
									@Pc(933) int local933;
									@Pc(939) int local939;
									if (local898 >= 0) {
										local913 = Static108.anInterface2_1.method1869(local898);
										local915 = -1;
									} else if (local895.anInt2671 == 16711935) {
										local898 = -1;
										local913 = -2;
										local915 = -2;
									} else {
										local915 = Static8.method261(local895.anInt2673, local895.anInt2681, local895.anInt2675);
										local933 = local895.anInt2675 + Static45.anInt2764 & 0xFF;
										local939 = local895.anInt2673 + Static130.anInt1500;
										if (local939 < 0) {
											local939 = 0;
										} else if (local939 > 255) {
											local939 = 255;
										}
										local913 = Static8.method261(local939, local895.anInt2681, local933);
									}
									local933 = 0;
									if (local913 != -2) {
										local933 = Static108.anIntArray337[Static34.method621(local913, 96)];
									}
									if (local895.anInt2680 != -1) {
										local939 = Static45.anInt2764 + local895.anInt2679 & 0xFF;
										@Pc(998) int local998 = Static130.anInt1500 + local895.anInt2678;
										if (local998 < 0) {
											local998 = 0;
										} else if (local998 > 255) {
											local998 = 255;
										}
										local913 = Static8.method261(local998, local895.anInt2684, local939);
										local933 = Static108.anIntArray337[Static34.method621(local913, 96)];
									}
									arg0.method1157(local7, local160, local278, local756, local879, local898, local673, local695, local685, local711, Static19.method397(local731, local701), Static19.method397(local731, local729), Static19.method397(local731, local721), Static19.method397(local731, local741), Static34.method621(local915, local701), Static34.method621(local915, local729), Static34.method621(local915, local721), Static34.method621(local915, local741), local752, local933);
								}
							}
						}
					}
				}
			}
			for (local181 = 1; local181 < 103; local181++) {
				for (local195 = 1; local195 < 103; local195++) {
					arg0.method1169(local7, local195, local181, Static29.method551(local195, local7, local181));
				}
			}
			Static127.aByteArrayArrayArray8[local7] = null;
			Static21.aByteArrayArrayArray6[local7] = null;
			Static6.aByteArrayArrayArray1[local7] = null;
			Static16.aByteArrayArrayArray5[local7] = null;
			Static69.aByteArrayArrayArray7[local7] = null;
		}
		arg0.method1134();
		for (local11 = 0; local11 < 104; local11++) {
			for (local28 = 0; local28 < 104; local28++) {
				if ((Static105.aByteArrayArrayArray9[1][local11][local28] & 0x2) == 2) {
					arg0.method1181(local11, local28);
				}
			}
		}
		local28 = 1;
		local131 = 2;
		local133 = 4;
		for (local137 = 0; local137 < 4; local137++) {
			if (local137 > 0) {
				local133 <<= 0x3;
				local131 <<= 0x3;
				local28 <<= 0x3;
			}
			for (local160 = 0; local160 <= local137; local160++) {
				for (local181 = 0; local181 <= 104; local181++) {
					for (local195 = 0; local195 <= 104; local195++) {
						if ((local28 & Static50.anIntArrayArrayArray1[local160][local195][local181]) != 0) {
							for (local205 = local181; local205 > 0 && (Static50.anIntArrayArrayArray1[local160][local195][local205 - 1] & local28) != 0; local205--) {
							}
							for (local199 = local181; local199 < 104 && (local28 & Static50.anIntArrayArrayArray1[local160][local195][local199 + 1]) != 0; local199++) {
							}
							local229 = local160;
							label347: for (local211 = local160; local211 > 0; local211--) {
								for (local278 = local205; local278 <= local199; local278++) {
									if ((local28 & Static50.anIntArrayArrayArray1[local211 - 1][local195][local278]) == 0) {
										break label347;
									}
								}
							}
							label336: while (local137 > local229) {
								for (local278 = local205; local278 <= local199; local278++) {
									if ((Static50.anIntArrayArrayArray1[local229 + 1][local195][local278] & local28) == 0) {
										break label336;
									}
								}
								local229++;
							}
							local278 = (local199 + 1 - local205) * (local229 + 1 - local211);
							if (local278 >= 8) {
								local550 = Static98.anIntArrayArrayArray4[local229][local195][local205] - 240;
								local648 = Static98.anIntArrayArrayArray4[local211][local195][local205];
								Static68.method1140(local137, 1, local195 * 128, local195 * 128, local205 * 128, local199 * 128 + 128, local550, local648);
								for (local658 = local211; local658 <= local229; local658++) {
									for (local673 = local205; local673 <= local199; local673++) {
										Static50.anIntArrayArrayArray1[local658][local195][local673] &= ~local28;
									}
								}
							}
						}
						if ((Static50.anIntArrayArrayArray1[local160][local195][local181] & local131) != 0) {
							for (local205 = local195; local205 > 0 && (local131 & Static50.anIntArrayArrayArray1[local160][local205 - 1][local181]) != 0; local205--) {
							}
							for (local199 = local195; local199 < 104 && (local131 & Static50.anIntArrayArrayArray1[local160][local199 + 1][local181]) != 0; local199++) {
							}
							local211 = local160;
							local229 = local160;
							label402: while (local211 > 0) {
								for (local278 = local205; local278 <= local199; local278++) {
									if ((local131 & Static50.anIntArrayArrayArray1[local211 - 1][local278][local181]) == 0) {
										break label402;
									}
								}
								local211--;
							}
							label391: while (local137 > local229) {
								for (local278 = local205; local278 <= local199; local278++) {
									if ((local131 & Static50.anIntArrayArrayArray1[local229 + 1][local278][local181]) == 0) {
										break label391;
									}
								}
								local229++;
							}
							local278 = (local199 + 1 - local205) * (local229 + 1 - local211);
							if (local278 >= 8) {
								local648 = Static98.anIntArrayArrayArray4[local211][local205][local181];
								local550 = Static98.anIntArrayArrayArray4[local229][local205][local181] - 240;
								Static68.method1140(local137, 2, local205 * 128, local199 * 128 + 128, local181 * 128, local181 * 128, local550, local648);
								for (local658 = local211; local658 <= local229; local658++) {
									for (local673 = local205; local673 <= local199; local673++) {
										Static50.anIntArrayArrayArray1[local658][local673][local181] &= ~local131;
									}
								}
							}
						}
						if ((Static50.anIntArrayArrayArray1[local160][local195][local181] & local133) != 0) {
							local205 = local195;
							local199 = local195;
							local211 = local181;
							for (local229 = local181; local229 < 104 && (Static50.anIntArrayArrayArray1[local160][local195][local229 + 1] & local133) != 0; local229++) {
							}
							while (local211 > 0 && (Static50.anIntArrayArrayArray1[local160][local195][local211 - 1] & local133) != 0) {
								local211--;
							}
							label457: while (local205 > 0) {
								for (local278 = local211; local278 <= local229; local278++) {
									if ((local133 & Static50.anIntArrayArrayArray1[local160][local205 - 1][local278]) == 0) {
										break label457;
									}
								}
								local205--;
							}
							label446: while (local199 < 104) {
								for (local278 = local211; local278 <= local229; local278++) {
									if ((Static50.anIntArrayArrayArray1[local160][local199 + 1][local278] & local133) == 0) {
										break label446;
									}
								}
								local199++;
							}
							if ((local229 + 1 - local211) * (-local205 + 1 + local199) >= 4) {
								local278 = Static98.anIntArrayArrayArray4[local160][local205][local211];
								Static68.method1140(local137, 4, local205 * 128, local199 * 128 + 128, local211 * 128, local229 * 128 + 128, local278, local278);
								for (local508 = local205; local508 <= local199; local508++) {
									for (local550 = local211; local550 <= local229; local550++) {
										Static50.anIntArrayArrayArray1[local160][local508][local550] &= ~local133;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ie;BLclient!id;Lclient!id;)[Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2[] method1690(@OriginalArg(0) Class35 arg0, @OriginalArg(2) Class34 arg1, @OriginalArg(3) Class34 arg2) {
		@Pc(13) int local13 = arg0.method1582(arg1);
		@Pc(19) int local19 = arg0.method1564(arg2, local13);
		return Static40.method688(local13, arg0, local19);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V")
	public static void method1691(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class1_Sub12 local18 = (Class1_Sub12) Static88.aClass48_10.method1337(); local18 != null; local18 = (Class1_Sub12) Static88.aClass48_10.method1335()) {
			if ((local18.aLong162 >> 48 & 0xFFFFL) == (long) arg0) {
				local18.method2039();
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method1692() {
		@Pc(7) Class76 local7 = Static114.aClass76_1;
		synchronized (Static114.aClass76_1) {
			Static1.anInt266 = Static77.anInt2077;
			@Pc(15) int local15;
			if (Static47.anInt1348 < 0) {
				for (local15 = 0; local15 < 112; local15++) {
					Static56.aBooleanArray15[local15] = false;
				}
				Static47.anInt1348 = Static21.anInt766;
			} else {
				while (Static47.anInt1348 != Static21.anInt766) {
					local15 = Static129.anIntArray376[Static21.anInt766];
					Static21.anInt766 = Static21.anInt766 + 1 & 0x7F;
					if (local15 < 0) {
						Static56.aBooleanArray15[~local15] = false;
					} else {
						Static56.aBooleanArray15[local15] = true;
					}
				}
			}
			Static77.anInt2077 = Static123.anInt2914;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public static void method1693() {
		aClass35_27 = null;
		aClass34_1269 = null;
		aClass34_1270 = null;
		aClass34_1271 = null;
	}
}
