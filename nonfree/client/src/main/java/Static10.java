import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "Lclient!ua;")
	public static Class2_Sub1_Sub22 aClass2_Sub1_Sub22_1;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Lclient!ji;")
	public static Class2_Sub1_Sub12 aClass2_Sub1_Sub12_1;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_70 = Static151.method2243("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!b", name = "h", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_71 = Static151.method2243(" <col=ffff00>");

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BII)V")
	public static void method175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (Static118.anInt2608 != arg0) {
			Static141.anIntArray130 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static141.anIntArray130[local9] = (local9 << 12) / arg0;
			}
			Static82.anInt1734 = arg0 - 1;
			Static118.anInt2608 = arg0;
			Static204.anInt4232 = arg0 == 64 ? 2048 : 4096;
		}
		if (arg1 == Static38.anInt3056) {
			return;
		}
		if (Static118.anInt2608 == arg1) {
			Static2.anIntArray5 = Static141.anIntArray130;
		} else {
			Static2.anIntArray5 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static2.anIntArray5[local9] = (local9 << 12) / arg1;
			}
		}
		Static38.anInt3056 = arg1;
		Static167.anInt3559 = arg1 - 1;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIII)V")
	public static void method176(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14;
		@Pc(49) int local49;
		if (Static97.anInt2284 == 0 && !Static8.aBoolean12) {
			local14 = Static131.anInt1516;
			@Pc(16) int local16 = Static34.anInt822;
			@Pc(18) int local18 = Static14.anInt340;
			@Pc(33) int local33 = (local16 - local18) * (arg4 - arg1) / arg2 + local18;
			@Pc(35) int local35 = Static143.anInt3031;
			local49 = (arg5 - arg3) * (local35 - local14) / arg0 + local14;
			Static99.method1601(Static69.aClass62_484, Static102.aClass62_799, 0L, (short) 49, local49, local33);
		}
		@Pc(61) long local61 = -1L;
		for (local14 = 0; local14 < Static125.anInt2768; local14++) {
			@Pc(74) long local74 = Static211.aLongArray12[local14];
			local49 = (int) local74 & 0x7F;
			@Pc(86) int local86 = (int) local74 >> 7 & 0x7F;
			@Pc(93) int local93 = (int) local74 >> 29 & 0x3;
			@Pc(100) int local100 = Integer.MAX_VALUE & (int) (local74 >>> 32);
			if (local74 != local61) {
				local61 = local74;
				@Pc(152) int local152;
				if (local93 == 2 && Static153.method2279(Static126.anInt2806, local49, local86, local74)) {
					@Pc(123) Class2_Sub1_Sub11 local123 = Static60.method844(local100);
					if (local123.anIntArray133 != null) {
						local123 = local123.method1062();
					}
					if (local123 == null) {
						continue;
					}
					if (Static97.anInt2284 == 1) {
						Static99.method1601(Static169.method2460(new Class62[] { Static155.aClass62_1179, Static111.aClass62_837, local123.aClass62_536 }), Static169.aClass62_1261, local74, (short) 2, local86, local49);
					} else if (!Static8.aBoolean12) {
						@Pc(140) Class62[] local140 = local123.aClass62Array43;
						if (Static180.aBoolean166) {
							local140 = Static16.method310(local140);
						}
						if (local140 != null) {
							for (local152 = 4; local152 >= 0; local152--) {
								if (local140[local152] != null) {
									@Pc(164) short local164 = 0;
									if (local152 == 0) {
										local164 = 44;
									}
									if (local152 == 1) {
										local164 = 32;
									}
									if (local152 == 2) {
										local164 = 15;
									}
									if (local152 == 3) {
										local164 = 47;
									}
									if (local152 == 4) {
										local164 = 1004;
									}
									Static99.method1601(Static169.method2460(new Class62[] { Static192.aClass62_1383, local123.aClass62_536 }), local140[local152], local74, local164, local86, local49);
								}
							}
						}
						Static99.method1601(Static169.method2460(new Class62[] { Static192.aClass62_1383, local123.aClass62_536 }), Static76.aClass62_542, (long) local123.anInt1548, (short) 1006, local86, local49);
					} else if ((Static34.anInt818 & 0x4) == 4) {
						Static99.method1601(Static169.method2460(new Class62[] { Static145.aClass62_1077, Static111.aClass62_837, local123.aClass62_536 }), Static125.aClass62_970, local74, (short) 33, local86, local49);
					}
				}
				@Pc(345) int local345;
				@Pc(353) Class7_Sub2_Sub1 local353;
				@Pc(406) Class7_Sub2_Sub2 local406;
				if (local93 == 1) {
					@Pc(320) Class7_Sub2_Sub1 local320 = Static9.aClass7_Sub2_Sub1Array1[local100];
					if (local320.aClass2_Sub1_Sub20_1.anInt3558 == 1 && (local320.anInt3046 & 0x7F) == 64 && (local320.anInt3085 & 0x7F) == 64) {
						for (local345 = 0; local345 < Static118.anInt2607; local345++) {
							local353 = Static9.aClass7_Sub2_Sub1Array1[Static199.anIntArray373[local345]];
							if (local353 != null && local320 != local353 && local353.aClass2_Sub1_Sub20_1.anInt3558 == 1 && local353.anInt3046 == local320.anInt3046 && local320.anInt3085 == local353.anInt3085) {
								Static28.method487(local86, local49, Static199.anIntArray373[local345], local353.aClass2_Sub1_Sub20_1);
							}
						}
						for (local152 = 0; local152 < Static145.anInt3126; local152++) {
							local406 = Static62.aClass7_Sub2_Sub2Array1[Static28.anIntArray60[local152]];
							if (local406 != null && local406.anInt3046 == local320.anInt3046 && local406.anInt3085 == local320.anInt3085) {
								Static101.method1616(local86, local406, local49, Static28.anIntArray60[local152]);
							}
						}
					}
					Static28.method487(local86, local49, local100, local320.aClass2_Sub1_Sub20_1);
				}
				if (local93 == 0) {
					@Pc(451) Class7_Sub2_Sub2 local451 = Static62.aClass7_Sub2_Sub2Array1[local100];
					if ((local451.anInt3046 & 0x7F) == 64 && (local451.anInt3085 & 0x7F) == 64) {
						for (local345 = 0; local345 < Static118.anInt2607; local345++) {
							local353 = Static9.aClass7_Sub2_Sub1Array1[Static199.anIntArray373[local345]];
							if (local353 != null && local353.aClass2_Sub1_Sub20_1.anInt3558 == 1 && local353.anInt3046 == local451.anInt3046 && local451.anInt3085 == local353.anInt3085) {
								Static28.method487(local86, local49, Static199.anIntArray373[local345], local353.aClass2_Sub1_Sub20_1);
							}
						}
						for (local152 = 0; local152 < Static145.anInt3126; local152++) {
							local406 = Static62.aClass7_Sub2_Sub2Array1[Static28.anIntArray60[local152]];
							if (local406 != null && local406 != local451 && local406.anInt3046 == local451.anInt3046 && local451.anInt3085 == local406.anInt3085) {
								Static101.method1616(local86, local406, local49, Static28.anIntArray60[local152]);
							}
						}
					}
					Static101.method1616(local86, local451, local49, local100);
				}
				if (local93 == 3) {
					@Pc(575) Class13 local575 = Static13.aClass13ArrayArrayArray1[Static126.anInt2806][local49][local86];
					if (local575 != null) {
						for (@Pc(582) Class2_Sub1_Sub6 local582 = (Class2_Sub1_Sub6) local575.method308(); local582 != null; local582 = (Class2_Sub1_Sub6) local575.method313()) {
							local152 = local582.aClass7_Sub6_1.anInt3706;
							@Pc(592) Class2_Sub1_Sub26 local592 = Static52.method774(local152);
							if (Static97.anInt2284 == 1) {
								Static99.method1601(Static169.method2460(new Class62[] { Static155.aClass62_1179, Static63.aClass62_445, local592.aClass62_1540 }), Static169.aClass62_1261, (long) local152, (short) 38, local86, local49);
							} else if (!Static8.aBoolean12) {
								@Pc(675) Class62[] local675 = local592.aClass62Array136;
								if (Static180.aBoolean166) {
									local675 = Static16.method310(local675);
								}
								for (@Pc(685) int local685 = 4; local685 >= 0; local685--) {
									if (local675 != null && local675[local685] != null) {
										@Pc(699) byte local699 = 0;
										if (local685 == 0) {
											local699 = 8;
										}
										if (local685 == 1) {
											local699 = 43;
										}
										if (local685 == 2) {
											local699 = 51;
										}
										if (local685 == 3) {
											local699 = 50;
										}
										if (local685 == 4) {
											local699 = 29;
										}
										Static99.method1601(Static169.method2460(new Class62[] { Static209.aClass62_1504, local592.aClass62_1540 }), local675[local685], (long) local152, local699, local86, local49);
									} else if (local685 == 2) {
										Static99.method1601(Static169.method2460(new Class62[] { Static209.aClass62_1504, local592.aClass62_1540 }), Static62.aClass62_434, (long) local152, (short) 51, local86, local49);
									}
								}
								Static99.method1601(Static169.method2460(new Class62[] { Static209.aClass62_1504, local592.aClass62_1540 }), Static76.aClass62_542, (long) local152, (short) 1005, local86, local49);
							} else if ((Static34.anInt818 & 0x1) == 1) {
								Static99.method1601(Static169.method2460(new Class62[] { Static145.aClass62_1077, Static63.aClass62_445, local592.aClass62_1540 }), Static125.aClass62_970, (long) local152, (short) 37, local86, local49);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IJZI)Lclient!mb;")
	public static Class62 method177(@OriginalArg(1) long arg0) {
		@Pc(26) int local26 = 1;
		@Pc(31) long local31 = arg0 / (long) 10;
		while (local31 != 0L) {
			local31 /= 10;
			local26++;
		}
		@Pc(52) int local52 = local26;
		if (arg0 < 0L) {
			local52 = local26 + 1;
		}
		@Pc(64) byte[] local64 = new byte[local52];
		if (arg0 < 0L) {
			local64[0] = 45;
		}
		for (@Pc(84) int local84 = 0; local84 < local26; local84++) {
			@Pc(92) int local92 = (int) (arg0 % (long) 10);
			arg0 /= 10;
			if (local92 < 0) {
				local92 = -local92;
			}
			if (local92 > 9) {
				local92 += 39;
			}
			local64[local52 - local84 - 1] = (byte) (local92 + 48);
		}
		@Pc(128) Class62 local128 = new Class62();
		local128.anInt2653 = local52;
		local128.aByteArray28 = local64;
		return local128;
	}
}
