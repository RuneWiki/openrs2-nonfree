import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!rb", name = "ib", descriptor = "[I")
	public static int[] anIntArray591;

	@OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
	public static int anInt3444 = 0;

	@OriginalMember(owner = "client!rb", name = "Z", descriptor = "[I")
	public static int[] anIntArray590 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!rb", name = "cb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1131 = Static170.method3101("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!rb", name = "lb", descriptor = "Lclient!pa;")
	public static Class63 aClass63_24 = new Class63(20);

	@OriginalMember(owner = "client!rb", name = "nb", descriptor = "[[I")
	public static int[][] anIntArrayArray25 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!rb", name = "pb", descriptor = "Z")
	public static boolean aBoolean167 = false;

	@OriginalMember(owner = "client!rb", name = "rb", descriptor = "Lclient!ea;")
	public static Class23 aClass23_13 = new Class23();

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(III)Z")
	public static boolean method2644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		@Pc(27) Class3_Sub2_Sub18 local27 = Static86.method1991(arg1);
		return local27.method3177(arg0);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLclient!ah;Lclient!ah;)V")
	public static void method2645(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		Static51.aClass7_24 = arg1;
		Static166.aClass7_65 = arg0;
		Static126.anInt3247 = Static166.aClass7_65.method1022(3);
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(Z)V")
	public static void method2646() {
		for (@Pc(13) int local13 = 0; local13 < Static81.anInt2370; local13++) {
			@Pc(18) int local18 = Static171.anIntArray684[local13];
			@Pc(22) Class3_Sub2_Sub1_Sub2_Sub1 local22 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local18];
			@Pc(26) int local26 = Static18.aClass3_Sub8_Sub1_1.method1545();
			if ((local26 & 0x2) != 0) {
				local26 += Static18.aClass3_Sub8_Sub1_1.method1545() << 8;
			}
			Static165.method3036(local22, local18, local26);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[Lclient!dg;)V")
	public static void method2647(@OriginalArg(1) Class21[] arg0) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static157.aByteArrayArrayArray41[local7][local11][local15] & 0x1) == 1) {
						@Pc(32) int local32 = local7;
						if ((Static157.aByteArrayArrayArray41[1][local11][local15] & 0x2) == 2) {
							local32 = local7 - 1;
						}
						if (local32 >= 0) {
							arg0[local32].method803(local15, local11);
						}
					}
				}
			}
		}
		Static104.anInt2691 += (int) (Math.random() * 5.0D) - 2;
		Static82.anInt2402 += (int) (Math.random() * 5.0D) - 2;
		if (Static104.anInt2691 < -8) {
			Static104.anInt2691 = -8;
		}
		if (Static104.anInt2691 > 8) {
			Static104.anInt2691 = 8;
		}
		@Pc(99) int[][] local99 = new int[104][104];
		if (Static82.anInt2402 < -16) {
			Static82.anInt2402 = -16;
		}
		local11 = Static104.anInt2691 >> 2 << 10;
		@Pc(114) int[][] local114 = new int[104][104];
		if (Static82.anInt2402 > 16) {
			Static82.anInt2402 = 16;
		}
		local15 = Static82.anInt2402 >> 1;
		@Pc(140) int local140;
		@Pc(146) int local146;
		@Pc(148) int local148;
		@Pc(152) int local152;
		@Pc(244) int local244;
		@Pc(198) int local198;
		@Pc(177) int local177;
		@Pc(211) int local211;
		@Pc(217) int local217;
		@Pc(221) int local221;
		@Pc(227) int local227;
		@Pc(292) int local292;
		@Pc(514) int local514;
		@Pc(553) int local553;
		@Pc(799) int local799;
		@Pc(814) int local814;
		@Pc(840) int local840;
		for (@Pc(130) int local130 = 0; local130 < 4; local130++) {
			@Pc(136) byte[][] local136 = Static172.aByteArrayArrayArray45[local130];
			local140 = (int) Math.sqrt(5100.0D);
			local146 = local140 * 768 >> 8;
			for (local148 = 1; local148 < 103; local148++) {
				for (local152 = 1; local152 < 103; local152++) {
					local177 = Static90.anIntArrayArrayArray31[local130][local152][local148 + 1] - Static90.anIntArrayArrayArray31[local130][local152][local148 - 1];
					local198 = Static90.anIntArrayArrayArray31[local130][local152 + 1][local148] - Static90.anIntArrayArrayArray31[local130][local152 - 1][local148];
					local211 = (int) Math.sqrt((double) (local177 * local177 + local198 * local198 + 65536));
					local217 = (local198 << 8) / local211;
					local221 = 65536 / local211;
					local227 = (local177 << 8) / local211;
					local244 = (local217 * -50 + local221 * -10 + local227 * -50) / local146 + 96;
					local292 = (local136[local152][local148] >> 1) + (local136[local152][local148 + 1] >> 3) + (local136[local152][local148 + -1] >> 2) + (local136[local152 + 1][local148] >> 3) + (local136[local152 - 1][local148] >> 2);
					local99[local152][local148] = local244 - local292;
				}
			}
			for (local152 = 0; local152 < 104; local152++) {
				Static1.anIntArray4[local152] = 0;
				Static113.anIntArray508[local152] = 0;
				Static28.anIntArray176[local152] = 0;
				Static115.anIntArray514[local152] = 0;
				Static57.anIntArray281[local152] = 0;
			}
			for (local244 = -5; local244 < 104; local244++) {
				for (local198 = 0; local198 < 104; local198++) {
					local177 = local244 + 5;
					@Pc(415) int local415;
					if (local177 < 104) {
						local211 = Static57.aByteArrayArrayArray11[local130][local177][local198] & 0xFF;
						if (local211 > 0) {
							@Pc(379) Class3_Sub2_Sub16 local379 = Static65.method1571(local211 - 1);
							Static1.anIntArray4[local198] += local379.anInt3531;
							Static113.anIntArray508[local198] += local379.anInt3537;
							Static28.anIntArray176[local198] += local379.anInt3542;
							Static115.anIntArray514[local198] += local379.anInt3534;
							local415 = Static57.anIntArray281[local198]++;
						}
					}
					local211 = local244 - 5;
					if (local211 >= 0) {
						local217 = Static57.aByteArrayArrayArray11[local130][local211][local198] & 0xFF;
						if (local217 > 0) {
							@Pc(448) Class3_Sub2_Sub16 local448 = Static65.method1571(local217 - 1);
							Static1.anIntArray4[local198] -= local448.anInt3531;
							Static113.anIntArray508[local198] -= local448.anInt3537;
							Static28.anIntArray176[local198] -= local448.anInt3542;
							Static115.anIntArray514[local198] -= local448.anInt3534;
							local415 = Static57.anIntArray281[local198]--;
						}
					}
				}
				if (local244 >= 0) {
					local177 = 0;
					local211 = 0;
					local227 = 0;
					local221 = 0;
					local217 = 0;
					for (local292 = -5; local292 < 104; local292++) {
						local514 = local292 + 5;
						if (local514 < 104) {
							local177 += Static1.anIntArray4[local514];
							local221 += Static115.anIntArray514[local514];
							local211 += Static113.anIntArray508[local514];
							local217 += Static28.anIntArray176[local514];
							local227 += Static57.anIntArray281[local514];
						}
						local553 = local292 - 5;
						if (local553 >= 0) {
							local211 -= Static113.anIntArray508[local553];
							local221 -= Static115.anIntArray514[local553];
							local217 -= Static28.anIntArray176[local553];
							local177 -= Static1.anIntArray4[local553];
							local227 -= Static57.anIntArray281[local553];
						}
						if (local292 >= 0 && local227 > 0) {
							local114[local244][local292] = Static44.method3006(local211 / local227, local177 * 256 / local221, local217 / local227);
						}
					}
				}
			}
			for (local198 = 1; local198 < 103; local198++) {
				for (local177 = 1; local177 < 103; local177++) {
					if (!Static179.aBoolean202 || (Static157.aByteArrayArrayArray41[0][local198][local177] & 0x2) != 0 || (Static157.aByteArrayArrayArray41[local130][local198][local177] & 0x10) == 0 && Static21.method593(local177, local130, local198) == Static93.anInt2605) {
						if (Static170.anInt4097 > local130) {
							Static170.anInt4097 = local130;
						}
						local211 = Static57.aByteArrayArrayArray11[local130][local198][local177] & 0xFF;
						local217 = Static48.aByteArrayArrayArray10[local130][local198][local177] & 0xFF;
						if (local211 > 0 || local217 > 0) {
							local292 = Static90.anIntArrayArrayArray31[local130][local198 + 1][local177 + 1];
							local221 = Static90.anIntArrayArrayArray31[local130][local198][local177];
							local227 = Static90.anIntArrayArrayArray31[local130][local198 + 1][local177];
							local514 = Static90.anIntArrayArrayArray31[local130][local198][local177 + 1];
							if (local130 > 0) {
								@Pc(736) boolean local736 = true;
								if (local211 == 0 && Static107.aByteArrayArrayArray23[local130][local198][local177] != 0) {
									local736 = false;
								}
								if (local217 > 0 && !Static144.method1395(local217 - 1).aBoolean96) {
									local736 = false;
								}
								if (local736 && local227 == local221 && local292 == local221 && local221 == local514) {
									Static128.anIntArrayArrayArray36[local130][local198][local177] |= 0x924;
								}
							}
							if (local211 <= 0) {
								local553 = -1;
								local799 = 0;
							} else {
								local553 = local114[local198][local177];
								local814 = (local553 & 0x7F) + local15;
								if (local814 < 0) {
									local814 = 0;
								} else if (local814 > 127) {
									local814 = 127;
								}
								local840 = local814 + (local553 & 0x380) + (local11 + local553 & 0xFC00);
								local799 = Static13.anIntArray128[Static139.method2803(local840, 96)];
							}
							local814 = local99[local198][local177];
							local840 = local99[local198 + 1][local177];
							@Pc(871) int local871 = local99[local198 + 1][local177 + 1];
							@Pc(879) int local879 = local99[local198][local177 + 1];
							if (local217 == 0) {
								Static8.method1019(local130, local198, local177, 0, 0, -1, local221, local227, local292, local514, Static139.method2803(local553, local814), Static139.method2803(local553, local840), Static139.method2803(local553, local871), Static139.method2803(local553, local879), 0, 0, 0, 0, local799, 0);
							} else {
								@Pc(891) int local891 = Static107.aByteArrayArrayArray23[local130][local198][local177] + 1;
								@Pc(899) byte local899 = Static91.aByteArrayArrayArray44[local130][local198][local177];
								@Pc(905) Class3_Sub2_Sub9 local905 = Static144.method1395(local217 - 1);
								@Pc(908) int local908 = local905.anInt1673;
								if (local908 >= 0 && !Static13.anInterface2_1.method1824(local908)) {
									local908 = -1;
								}
								@Pc(927) int local927;
								@Pc(925) int local925;
								@Pc(938) int local938;
								@Pc(962) int local962;
								if (local908 >= 0) {
									local925 = Static13.anIntArray128[Static91.method3127(96, Static13.anInterface2_1.method1825(local908))];
									local927 = -1;
								} else if (local905.anInt1668 == -1) {
									local925 = 0;
									local927 = -2;
								} else {
									local927 = local905.anInt1668;
									local938 = (local927 & 0x7F) + local15;
									if (local938 < 0) {
										local938 = 0;
									} else if (local938 > 127) {
										local938 = 127;
									}
									local962 = local938 + (local927 + local11 & 0xFC00) + (local927 & 0x380);
									local925 = Static13.anIntArray128[Static91.method3127(96, local962)];
								}
								if (local905.anInt1675 >= 0) {
									local938 = local905.anInt1675;
									local962 = (local938 & 0x7F) + local15;
									if (local962 < 0) {
										local962 = 0;
									} else if (local962 > 127) {
										local962 = 127;
									}
									@Pc(1025) int local1025 = (local11 + local938 & 0xFC00) + (local938 & 0x380) + local962;
									local925 = Static13.anIntArray128[Static91.method3127(96, local1025)];
								}
								Static8.method1019(local130, local198, local177, local891, local899, local908, local221, local227, local292, local514, Static139.method2803(local553, local814), Static139.method2803(local553, local840), Static139.method2803(local553, local871), Static139.method2803(local553, local879), Static91.method3127(local814, local927), Static91.method3127(local840, local927), Static91.method3127(local871, local927), Static91.method3127(local879, local927), local799, local925);
							}
						}
					}
				}
			}
			for (local177 = 1; local177 < 103; local177++) {
				for (local211 = 1; local211 < 103; local211++) {
					Static164.method3024(local130, local211, local177, Static21.method593(local177, local130, local211));
				}
			}
			Static57.aByteArrayArrayArray11[local130] = null;
			Static48.aByteArrayArrayArray10[local130] = null;
			Static107.aByteArrayArrayArray23[local130] = null;
			Static91.aByteArrayArrayArray44[local130] = null;
			Static172.aByteArrayArrayArray45[local130] = null;
		}
		Static103.method2120();
		for (@Pc(1179) int local1179 = 0; local1179 < 104; local1179++) {
			for (local140 = 0; local140 < 104; local140++) {
				if ((Static157.aByteArrayArrayArray41[1][local1179][local140] & 0x2) == 2) {
					Static12.method476(local1179, local140);
				}
			}
		}
		local146 = 2;
		local148 = 4;
		local140 = 1;
		for (local152 = 0; local152 < 4; local152++) {
			if (local152 > 0) {
				local140 <<= 0x3;
				local146 <<= 0x3;
				local148 <<= 0x3;
			}
			for (local244 = 0; local244 <= local152; local244++) {
				for (local198 = 0; local198 <= 104; local198++) {
					for (local177 = 0; local177 <= 104; local177++) {
						if ((Static128.anIntArrayArrayArray36[local244][local177][local198] & local140) != 0) {
							for (local217 = local198; local217 < 104 && (Static128.anIntArrayArrayArray36[local244][local177][local217 + 1] & local140) != 0; local217++) {
							}
							for (local211 = local198; local211 > 0 && (Static128.anIntArrayArrayArray36[local244][local177][local211 - 1] & local140) != 0; local211--) {
							}
							local227 = local244;
							label350: for (local221 = local244; local221 > 0; local221--) {
								for (local292 = local211; local292 <= local217; local292++) {
									if ((local140 & Static128.anIntArrayArrayArray36[local221 - 1][local177][local292]) == 0) {
										break label350;
									}
								}
							}
							label339: while (local152 > local227) {
								for (local292 = local211; local292 <= local217; local292++) {
									if ((local140 & Static128.anIntArrayArrayArray36[local227 + 1][local177][local292]) == 0) {
										break label339;
									}
								}
								local227++;
							}
							local292 = (local217 + 1 - local211) * (local227 + 1 - local221);
							if (local292 >= 8) {
								local799 = Static90.anIntArrayArrayArray31[local221][local177][local211];
								local553 = Static90.anIntArrayArrayArray31[local227][local177][local211] - 240;
								Static108.method2205(local152, 1, local177 * 128, local177 * 128, local211 * 128, local217 * 128 + 128, local553, local799);
								for (local814 = local221; local814 <= local227; local814++) {
									for (local840 = local211; local840 <= local217; local840++) {
										Static128.anIntArrayArrayArray36[local814][local177][local840] &= ~local140;
									}
								}
							}
						}
						if ((Static128.anIntArrayArrayArray36[local244][local177][local198] & local146) != 0) {
							local211 = local177;
							local217 = local177;
							local221 = local244;
							while (local211 > 0 && (Static128.anIntArrayArrayArray36[local244][local211 - 1][local198] & local146) != 0) {
								local211--;
							}
							while (local217 < 104 && (Static128.anIntArrayArrayArray36[local244][local217 + 1][local198] & local146) != 0) {
								local217++;
							}
							local227 = local244;
							label405: while (local221 > 0) {
								for (local292 = local211; local292 <= local217; local292++) {
									if ((local146 & Static128.anIntArrayArrayArray36[local221 - 1][local292][local198]) == 0) {
										break label405;
									}
								}
								local221--;
							}
							label394: while (local152 > local227) {
								for (local292 = local211; local292 <= local217; local292++) {
									if ((local146 & Static128.anIntArrayArrayArray36[local227 + 1][local292][local198]) == 0) {
										break label394;
									}
								}
								local227++;
							}
							local292 = (local217 + 1 - local211) * ((local227 + 1) - local221);
							if (local292 >= 8) {
								local799 = Static90.anIntArrayArrayArray31[local221][local211][local198];
								local553 = Static90.anIntArrayArrayArray31[local227][local211][local198] - 240;
								Static108.method2205(local152, 2, local211 * 128, local217 * 128 + 128, local198 * 128, local198 * 128, local553, local799);
								for (local814 = local221; local814 <= local227; local814++) {
									for (local840 = local211; local840 <= local217; local840++) {
										Static128.anIntArrayArrayArray36[local814][local840][local198] &= ~local146;
									}
								}
							}
						}
						if ((Static128.anIntArrayArrayArray36[local244][local177][local198] & local148) != 0) {
							local217 = local177;
							local211 = local177;
							for (local227 = local198; local227 < 104 && (local148 & Static128.anIntArrayArrayArray36[local244][local177][local227 + 1]) != 0; local227++) {
							}
							for (local221 = local198; local221 > 0 && (Static128.anIntArrayArrayArray36[local244][local177][local221 - 1] & local148) != 0; local221--) {
							}
							label459: while (local211 > 0) {
								for (local292 = local221; local292 <= local227; local292++) {
									if ((local148 & Static128.anIntArrayArrayArray36[local244][local211 - 1][local292]) == 0) {
										break label459;
									}
								}
								local211--;
							}
							label448: while (local217 < 104) {
								for (local292 = local221; local292 <= local227; local292++) {
									if ((Static128.anIntArrayArrayArray36[local244][local217 + 1][local292] & local148) == 0) {
										break label448;
									}
								}
								local217++;
							}
							if ((local217 + 1 - local211) * (-local221 + 1 + local227) >= 4) {
								local292 = Static90.anIntArrayArrayArray31[local244][local211][local221];
								Static108.method2205(local152, 4, local211 * 128, local217 * 128 + 128, local221 * 128, local227 * 128 + 128, local292, local292);
								for (local514 = local211; local514 <= local217; local514++) {
									for (local553 = local221; local553 <= local227; local553++) {
										Static128.anIntArrayArrayArray36[local244][local514][local553] &= ~local148;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)V")
	public static void method2648() {
		anIntArray591 = null;
		aClass28_1131 = null;
		aClass23_13 = null;
		anIntArray590 = null;
		aClass63_24 = null;
		anIntArrayArray25 = null;
	}
}
