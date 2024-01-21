import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray33;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "Lclient!eh;")
	public static Class28 aClass28_83;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "Lclient!od;")
	public static Class2_Sub2_Sub5 aClass2_Sub2_Sub5_2;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_544 = Static181.method2795("Sep");

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_545 = Static181.method2795("Jan");

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_546 = Static181.method2795("Oct");

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_547 = Static181.method2795("Nov");

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_548 = Static181.method2795("Dec");

	@OriginalMember(owner = "client!ic", name = "y", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_555 = Static181.method2795("New User");

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "Lclient!qe;")
	public static Class83 aClass83_549 = aClass83_555;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_551 = Static181.method2795("Feb");

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_552 = Static181.method2795("Mar");

	@OriginalMember(owner = "client!ic", name = "z", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_556 = Static181.method2795("Apr");

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_550 = Static181.method2795("May");

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_557 = Static181.method2795("Jun");

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_553 = Static181.method2795("Jul");

	@OriginalMember(owner = "client!ic", name = "x", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_554 = Static181.method2795("Aug");

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "[Lclient!qe;")
	public static final Class83[] aClass83Array32 = new Class83[] { aClass83_545, aClass83_551, aClass83_552, aClass83_556, aClass83_550, aClass83_557, aClass83_553, aClass83_554, aClass83_544, aClass83_546, aClass83_547, aClass83_548 };

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([Lclient!dg;I)V")
	public static void method1429(@OriginalArg(0) Class22[] arg0) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static9.aByteArrayArrayArray7[local7][local11][local15] & 0x1) == 1) {
						@Pc(30) int local30 = local7;
						if ((Static9.aByteArrayArrayArray7[1][local11][local15] & 0x2) == 2) {
							local30 = local7 - 1;
						}
						if (local30 >= 0) {
							arg0[local30].method728(local11, local15);
						}
					}
				}
			}
		}
		Static3.anInt66 += (int) (Math.random() * 5.0D) - 2;
		Static19.anInt545 += (int) (Math.random() * 5.0D) - 2;
		if (Static3.anInt66 < -16) {
			Static3.anInt66 = -16;
		}
		if (Static3.anInt66 > 16) {
			Static3.anInt66 = 16;
		}
		if (Static19.anInt545 < -8) {
			Static19.anInt545 = -8;
		}
		if (Static19.anInt545 > 8) {
			Static19.anInt545 = 8;
		}
		@Pc(120) int[][] local120 = new int[104][104];
		local11 = Static19.anInt545 >> 2 << 10;
		@Pc(130) int[][] local130 = new int[104][104];
		local15 = Static3.anInt66 >> 1;
		@Pc(150) int local150;
		@Pc(156) int local156;
		@Pc(158) int local158;
		@Pc(162) int local162;
		@Pc(253) int local253;
		@Pc(187) int local187;
		@Pc(208) int local208;
		@Pc(221) int local221;
		@Pc(231) int local231;
		@Pc(225) int local225;
		@Pc(237) int local237;
		@Pc(301) int local301;
		@Pc(511) int local511;
		@Pc(515) int local515;
		@Pc(842) int local842;
		for (@Pc(136) int local136 = 0; local136 < 4; local136++) {
			@Pc(146) byte[][] local146 = Static110.aByteArrayArrayArray46[local136];
			local150 = (int) Math.sqrt(5100.0D);
			local156 = local150 * 768 >> 8;
			for (local158 = 1; local158 < 103; local158++) {
				for (local162 = 1; local162 < 103; local162++) {
					local187 = Static170.anIntArrayArrayArray10[local136][local162 + 1][local158] - Static170.anIntArrayArrayArray10[local136][local162 - 1][local158];
					local208 = Static170.anIntArrayArrayArray10[local136][local162][local158 + 1] - Static170.anIntArrayArrayArray10[local136][local162][local158 - 1];
					local221 = (int) Math.sqrt((double) (local208 * local208 + local187 * local187 + 65536));
					local225 = -65536 / local221;
					local231 = (local187 << 8) / local221;
					local237 = (local208 << 8) / local221;
					local253 = (local237 * -50 + local231 * -50 + local225 * -10) / local156 + 74;
					local301 = (local146[local162][local158] >> 1) + (local146[local162][local158 + 1] >> 3) + (local146[local162][local158 + -1] >> 2) + (local146[local162 - -1][local158] >> 3) + (local146[local162 - 1][local158] >> 2);
					local120[local162][local158] = local253 - local301;
				}
			}
			for (local162 = 0; local162 < 104; local162++) {
				Static124.anIntArray249[local162] = 0;
				Static25.anIntArray391[local162] = 0;
				Static171.anIntArray327[local162] = 0;
				Static153.anIntArray315[local162] = 0;
				Static103.anIntArray236[local162] = 0;
			}
			for (local253 = -5; local253 < 104; local253++) {
				for (local187 = 0; local187 < 104; local187++) {
					local208 = local253 + 5;
					@Pc(419) int local419;
					if (local208 < 104) {
						local221 = Static57.aByteArrayArrayArray23[local136][local208][local187] & 0xFF;
						if (local221 > 0) {
							@Pc(383) Class2_Sub2_Sub11 local383 = Static66.method1260(local221 - 1);
							Static124.anIntArray249[local187] += local383.anInt1379;
							Static25.anIntArray391[local187] += local383.anInt1388;
							Static171.anIntArray327[local187] += local383.anInt1387;
							Static153.anIntArray315[local187] += local383.anInt1380;
							local419 = Static103.anIntArray236[local187]++;
						}
					}
					local221 = local253 - 5;
					if (local221 >= 0) {
						local231 = Static57.aByteArrayArrayArray23[local136][local221][local187] & 0xFF;
						if (local231 > 0) {
							@Pc(446) Class2_Sub2_Sub11 local446 = Static66.method1260(local231 - 1);
							Static124.anIntArray249[local187] -= local446.anInt1379;
							Static25.anIntArray391[local187] -= local446.anInt1388;
							Static171.anIntArray327[local187] -= local446.anInt1387;
							Static153.anIntArray315[local187] -= local446.anInt1380;
							local419 = Static103.anIntArray236[local187]--;
						}
					}
				}
				if (local253 >= 0) {
					local208 = 0;
					local225 = 0;
					local231 = 0;
					local221 = 0;
					local237 = 0;
					for (local301 = -5; local301 < 104; local301++) {
						local511 = local301 + 5;
						local515 = local301 - 5;
						if (local511 < 104) {
							local221 += Static25.anIntArray391[local511];
							local225 += Static153.anIntArray315[local511];
							local208 += Static124.anIntArray249[local511];
							local231 += Static171.anIntArray327[local511];
							local237 += Static103.anIntArray236[local511];
						}
						if (local515 >= 0) {
							local221 -= Static25.anIntArray391[local515];
							local237 -= Static103.anIntArray236[local515];
							local231 -= Static171.anIntArray327[local515];
							local225 -= Static153.anIntArray315[local515];
							local208 -= Static124.anIntArray249[local515];
						}
						if (local301 >= 0 && local237 > 0) {
							local130[local253][local301] = Static58.method1123(local231 / local237, local208 * 256 / local225, local221 / local237);
						}
					}
				}
			}
			for (local187 = 1; local187 < 103; local187++) {
				for (local208 = 1; local208 < 103; local208++) {
					if (!Static158.aBoolean148 || (Static9.aByteArrayArrayArray7[0][local187][local208] & 0x2) != 0 || (Static9.aByteArrayArrayArray7[local136][local187][local208] & 0x10) == 0 && Static98.method1684(local187, local136, local208) == Static159.anInt3223) {
						if (local136 < Static40.anInt1032) {
							Static40.anInt1032 = local136;
						}
						local231 = Static14.aByteArrayArrayArray40[local136][local187][local208] & 0xFF;
						local221 = Static57.aByteArrayArrayArray23[local136][local187][local208] & 0xFF;
						if (local221 > 0 || local231 > 0) {
							local237 = Static170.anIntArrayArrayArray10[local136][local187 + 1][local208];
							local301 = Static170.anIntArrayArrayArray10[local136][local187 + 1][local208 + 1];
							local511 = Static170.anIntArrayArrayArray10[local136][local187][local208 + 1];
							local225 = Static170.anIntArrayArrayArray10[local136][local187][local208];
							if (local136 > 0) {
								@Pc(734) boolean local734 = true;
								if (local221 == 0 && Static10.aByteArrayArrayArray8[local136][local187][local208] != 0) {
									local734 = false;
								}
								if (local231 > 0 && !Static176.method2703(local231 - 1).aBoolean97) {
									local734 = false;
								}
								if (local734 && local225 == local237 && local301 == local225 && local511 == local225) {
									Static61.anIntArrayArrayArray4[local136][local187][local208] |= 0x924;
								}
							}
							@Pc(809) int local809;
							@Pc(835) int local835;
							if (local221 > 0) {
								local515 = local130[local187][local208];
								local809 = local15 + (local515 & 0x7F);
								if (local809 < 0) {
									local809 = 0;
								} else if (local809 > 127) {
									local809 = 127;
								}
								local835 = local809 + (local515 & 0x380) + (local515 + local11 & 0xFC00);
								local842 = Static24.anIntArray40[Static3.method63(local835, 96)];
							} else {
								local842 = 0;
								local515 = -1;
							}
							local809 = local120[local187][local208];
							local835 = local120[local187 + 1][local208];
							@Pc(872) int local872 = local120[local187 + 1][local208 + 1];
							@Pc(880) int local880 = local120[local187][local208 + 1];
							if (local231 == 0) {
								Static158.method2453(local136, local187, local208, 0, 0, -1, local225, local237, local301, local511, Static3.method63(local515, local809), Static3.method63(local515, local835), Static3.method63(local515, local872), Static3.method63(local515, local880), 0, 0, 0, 0, local842, 0);
							} else {
								@Pc(892) int local892 = Static10.aByteArrayArrayArray8[local136][local187][local208] + 1;
								@Pc(900) byte local900 = Static67.aByteArrayArrayArray28[local136][local187][local208];
								@Pc(906) Class2_Sub2_Sub14 local906 = Static176.method2703(local231 - 1);
								@Pc(909) int local909 = local906.anInt1850;
								if (local909 >= 0 && !Static24.anInterface3_1.method1290(local909)) {
									local909 = -1;
								}
								@Pc(928) int local928;
								@Pc(938) int local938;
								@Pc(954) int local954;
								@Pc(982) int local982;
								if (local909 >= 0) {
									local928 = -1;
									local938 = Static24.anIntArray40[Static127.method2160(Static24.anInterface3_1.method1292(local909), 96)];
								} else if (local906.anInt1851 == -1) {
									local928 = -2;
									local938 = 0;
								} else {
									local928 = local906.anInt1851;
									local954 = (local928 & 0x7F) + local15;
									if (local954 < 0) {
										local954 = 0;
									} else if (local954 > 127) {
										local954 = 127;
									}
									local982 = (local928 + local11 & 0xFC00) + (local928 & 0x380) + local954;
									local938 = Static24.anIntArray40[Static127.method2160(local982, 96)];
								}
								if (local906.anInt1855 >= 0) {
									local954 = local906.anInt1855;
									local982 = local15 + (local954 & 0x7F);
									if (local982 < 0) {
										local982 = 0;
									} else if (local982 > 127) {
										local982 = 127;
									}
									@Pc(1032) int local1032 = local982 + (local954 & 0x380) + (local11 + local954 & 0xFC00);
									local938 = Static24.anIntArray40[Static127.method2160(local1032, 96)];
								}
								Static158.method2453(local136, local187, local208, local892, local900, local909, local225, local237, local301, local511, Static3.method63(local515, local809), Static3.method63(local515, local835), Static3.method63(local515, local872), Static3.method63(local515, local880), Static127.method2160(local928, local809), Static127.method2160(local928, local835), Static127.method2160(local928, local872), Static127.method2160(local928, local880), local842, local938);
							}
						}
					}
				}
			}
			for (local208 = 1; local208 < 103; local208++) {
				for (local221 = 1; local221 < 103; local221++) {
					Static149.method2329(local136, local221, local208, Static98.method1684(local221, local136, local208));
				}
			}
			Static57.aByteArrayArrayArray23[local136] = null;
			Static14.aByteArrayArrayArray40[local136] = null;
			Static10.aByteArrayArrayArray8[local136] = null;
			Static67.aByteArrayArrayArray28[local136] = null;
			Static110.aByteArrayArrayArray46[local136] = null;
		}
		Static107.method2362();
		@Pc(1199) int local1199;
		for (@Pc(1195) int local1195 = 0; local1195 < 104; local1195++) {
			for (local1199 = 0; local1199 < 104; local1199++) {
				if ((Static9.aByteArrayArrayArray7[1][local1195][local1199] & 0x2) == 2) {
					Static144.method2304(local1195, local1199);
				}
			}
		}
		local1199 = 1;
		@Pc(1229) int local1229 = 2;
		local150 = 4;
		for (local156 = 0; local156 < 4; local156++) {
			if (local156 > 0) {
				local1229 <<= 0x3;
				local150 <<= 0x3;
				local1199 <<= 0x3;
			}
			for (local158 = 0; local158 <= local156; local158++) {
				for (local162 = 0; local162 <= 104; local162++) {
					for (local253 = 0; local253 <= 104; local253++) {
						if ((local1199 & Static61.anIntArrayArrayArray4[local158][local253][local162]) != 0) {
							for (local187 = local162; local187 > 0 && (Static61.anIntArrayArrayArray4[local158][local253][local187 - 1] & local1199) != 0; local187--) {
							}
							local208 = local162;
							local231 = local158;
							local221 = local158;
							while (local208 < 104 && (Static61.anIntArrayArrayArray4[local158][local253][local208 + 1] & local1199) != 0) {
								local208++;
							}
							label350: while (local221 > 0) {
								for (local225 = local187; local225 <= local208; local225++) {
									if ((Static61.anIntArrayArrayArray4[local221 - 1][local253][local225] & local1199) == 0) {
										break label350;
									}
								}
								local221--;
							}
							label339: while (local231 < local156) {
								for (local225 = local187; local225 <= local208; local225++) {
									if ((local1199 & Static61.anIntArrayArrayArray4[local231 + 1][local253][local225]) == 0) {
										break label339;
									}
								}
								local231++;
							}
							local225 = (local231 + 1 - local221) * (local208 + 1 - local187);
							if (local225 >= 8) {
								local301 = Static170.anIntArrayArrayArray10[local231][local253][local187] - 240;
								local511 = Static170.anIntArrayArrayArray10[local221][local253][local187];
								Static93.method1603(local156, 1, local253 * 128, local253 * 128, local187 * 128, local208 * 128 + 128, local301, local511);
								for (local515 = local221; local515 <= local231; local515++) {
									for (local842 = local187; local842 <= local208; local842++) {
										Static61.anIntArrayArrayArray4[local515][local253][local842] &= ~local1199;
									}
								}
							}
						}
						if ((Static61.anIntArrayArrayArray4[local158][local253][local162] & local1229) != 0) {
							for (local187 = local253; local187 > 0 && (local1229 & Static61.anIntArrayArrayArray4[local158][local187 - 1][local162]) != 0; local187--) {
							}
							for (local208 = local253; local208 < 104 && (Static61.anIntArrayArrayArray4[local158][local208 + 1][local162] & local1229) != 0; local208++) {
							}
							local231 = local158;
							label404: for (local221 = local158; local221 > 0; local221--) {
								for (local225 = local187; local225 <= local208; local225++) {
									if ((Static61.anIntArrayArrayArray4[local221 - 1][local225][local162] & local1229) == 0) {
										break label404;
									}
								}
							}
							label393: while (local156 > local231) {
								for (local225 = local187; local225 <= local208; local225++) {
									if ((local1229 & Static61.anIntArrayArrayArray4[local231 + 1][local225][local162]) == 0) {
										break label393;
									}
								}
								local231++;
							}
							local225 = (local208 + 1 - local187) * (local231 + 1 - local221);
							if (local225 >= 8) {
								local301 = Static170.anIntArrayArrayArray10[local231][local187][local162] - 240;
								local511 = Static170.anIntArrayArrayArray10[local221][local187][local162];
								Static93.method1603(local156, 2, local187 * 128, local208 * 128 + 128, local162 * 128, local162 * 128, local301, local511);
								for (local515 = local221; local515 <= local231; local515++) {
									for (local842 = local187; local842 <= local208; local842++) {
										Static61.anIntArrayArrayArray4[local515][local842][local162] &= ~local1229;
									}
								}
							}
						}
						if ((Static61.anIntArrayArrayArray4[local158][local253][local162] & local150) != 0) {
							local187 = local253;
							local208 = local253;
							for (local221 = local162; local221 > 0 && (local150 & Static61.anIntArrayArrayArray4[local158][local253][local221 - 1]) != 0; local221--) {
							}
							for (local231 = local162; local231 < 104 && (Static61.anIntArrayArrayArray4[local158][local253][local231 + 1] & local150) != 0; local231++) {
							}
							label459: while (local187 > 0) {
								for (local225 = local221; local225 <= local231; local225++) {
									if ((local150 & Static61.anIntArrayArrayArray4[local158][local187 - 1][local225]) == 0) {
										break label459;
									}
								}
								local187--;
							}
							label448: while (local208 < 104) {
								for (local225 = local221; local225 <= local231; local225++) {
									if ((local150 & Static61.anIntArrayArrayArray4[local158][local208 + 1][local225]) == 0) {
										break label448;
									}
								}
								local208++;
							}
							if ((local231 + 1 - local221) * (local208 + 1 - local187) >= 4) {
								local225 = Static170.anIntArrayArrayArray10[local158][local187][local221];
								Static93.method1603(local156, 4, local187 * 128, local208 * 128 + 128, local221 * 128, local231 * 128 + 128, local225, local225);
								for (local237 = local187; local237 <= local208; local237++) {
									for (local301 = local221; local301 <= local231; local301++) {
										Static61.anIntArrayArrayArray4[local158][local237][local301] &= ~local150;
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
