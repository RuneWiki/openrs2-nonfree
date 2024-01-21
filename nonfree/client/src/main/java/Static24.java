import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
	public static int anInt573;

	@OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
	public static int anInt579 = 0;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(B)I")
	public static int method432() {
		@Pc(17) int local17 = 3;
		if (Static58.anInt1153 < 310) {
			@Pc(26) int local26 = Static42.anInt4286 >> 7;
			@Pc(30) int local30 = Static29.anInt721 >> 7;
			if ((Static133.aByteArrayArrayArray11[Static126.anInt2806][local26][local30] & 0x4) != 0) {
				local17 = Static126.anInt2806;
			}
			@Pc(47) int local47 = Static186.aClass7_Sub2_Sub2_1.anInt3085 >> 7;
			@Pc(59) int local59;
			if (local30 >= local47) {
				local59 = local30 - local47;
			} else {
				local59 = local47 - local30;
			}
			@Pc(71) int local71 = Static186.aClass7_Sub2_Sub2_1.anInt3046 >> 7;
			@Pc(83) int local83;
			if (local71 <= local26) {
				local83 = local26 - local71;
			} else {
				local83 = local71 - local26;
			}
			@Pc(105) int local105;
			@Pc(99) int local99;
			if (local59 < local83) {
				local99 = 32768;
				local105 = local59 * 65536 / local83;
				while (local26 != local71) {
					local99 += local105;
					if (local26 < local71) {
						local26++;
					} else if (local71 < local26) {
						local26--;
					}
					if ((Static133.aByteArrayArrayArray11[Static126.anInt2806][local26][local30] & 0x4) != 0) {
						local17 = Static126.anInt2806;
					}
					if (local99 >= 65536) {
						local99 -= 65536;
						if (local30 < local47) {
							local30++;
						} else if (local30 > local47) {
							local30--;
						}
						if ((Static133.aByteArrayArrayArray11[Static126.anInt2806][local26][local30] & 0x4) != 0) {
							local17 = Static126.anInt2806;
						}
					}
				}
			} else {
				local105 = local83 * 65536 / local59;
				local99 = 32768;
				while (local47 != local30) {
					local99 += local105;
					if (local30 < local47) {
						local30++;
					} else if (local30 > local47) {
						local30--;
					}
					if ((Static133.aByteArrayArrayArray11[Static126.anInt2806][local26][local30] & 0x4) != 0) {
						local17 = Static126.anInt2806;
					}
					if (local99 >= 65536) {
						local99 -= 65536;
						if (local71 > local26) {
							local26++;
						} else if (local71 < local26) {
							local26--;
						}
						if ((Static133.aByteArrayArrayArray11[Static126.anInt2806][local26][local30] & 0x4) != 0) {
							local17 = Static126.anInt2806;
						}
					}
				}
			}
		}
		if ((Static133.aByteArrayArrayArray11[Static126.anInt2806][Static186.aClass7_Sub2_Sub2_1.anInt3046 >> 7][Static186.aClass7_Sub2_Sub2_1.anInt3085 >> 7] & 0x4) != 0) {
			local17 = Static126.anInt2806;
		}
		return local17;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIII)V")
	public static void method434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static198.anInt4147 * 128) {
			arg0 = Static198.anInt4147 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static12.anInt319 * 128) {
			arg2 = Static12.anInt319 * 128 - 1;
		}
		Static28.anInt638++;
		Static181.anInt3781 = Class26.anIntArray77[arg3];
		Static36.anInt864 = Class26.anIntArray76[arg3];
		Static91.anInt2043 = Class26.anIntArray77[arg4];
		Static28.anInt641 = Class26.anIntArray76[arg4];
		Static189.anInt3928 = arg0;
		Static52.anInt1112 = arg1;
		Static172.anInt679 = arg2;
		Static140.anInt3022 = arg0 / 128;
		Static2.anInt78 = arg2 / 128;
		Static152.anInt3231 = arg5;
		Static172.anInt694 = Static140.anInt3022 - Static182.anInt3830;
		if (Static172.anInt694 < 0) {
			Static172.anInt694 = 0;
		}
		Static216.anInt4536 = Static2.anInt78 - Static182.anInt3830;
		if (Static216.anInt4536 < 0) {
			Static216.anInt4536 = 0;
		}
		Static48.anInt1051 = Static140.anInt3022 + Static182.anInt3830;
		if (Static48.anInt1051 > Static198.anInt4147) {
			Static48.anInt1051 = Static198.anInt4147;
		}
		Static102.anInt2328 = Static2.anInt78 + Static182.anInt3830;
		if (Static102.anInt2328 > Static12.anInt319) {
			Static102.anInt2328 = Static12.anInt319;
		}
		@Pc(108) int local108;
		@Pc(119) int local119;
		@Pc(129) int local129;
		@Pc(135) int local135;
		@Pc(141) int local141;
		@Pc(163) int local163;
		@Pc(175) int local175;
		for (@Pc(105) int local105 = 0; local105 < Static182.anInt3830 + Static182.anInt3830 + 2; local105++) {
			for (local108 = 0; local108 < Static182.anInt3830 + Static182.anInt3830 + 2; local108++) {
				local119 = (local105 - Static182.anInt3830 << 7) - (arg0 & 0x7F);
				local129 = (local108 - Static182.anInt3830 << 7) - (arg2 & 0x7F);
				local135 = Static140.anInt3022 + local105 - Static182.anInt3830;
				local141 = Static2.anInt78 + local108 - Static182.anInt3830;
				if (local135 >= 0 && local141 >= 0 && local135 < Static198.anInt4147 && local141 < Static12.anInt319) {
					local163 = Static72.anIntArrayArrayArray3[0][local135][local141] + 128 - arg1;
					local175 = Static72.anIntArrayArrayArray3[3][local135][local141] - arg1 - 1000;
					Static89.aBooleanArrayArray2[local105][local108] = Static81.method3134(local119, local175, local163, local129);
				} else {
					Static89.aBooleanArrayArray2[local105][local108] = false;
				}
			}
		}
		for (local108 = 0; local108 < Static182.anInt3830 + Static182.anInt3830 + 1; local108++) {
			for (local119 = 0; local119 < Static182.anInt3830 + Static182.anInt3830 + 1; local119++) {
				Static7.aBooleanArrayArray4[local108][local119] = Static89.aBooleanArrayArray2[local108][local119] || Static89.aBooleanArrayArray2[local108 + 1][local119] || Static89.aBooleanArrayArray2[local108][local119 + 1] || Static89.aBooleanArrayArray2[local108 + 1][local119 + 1];
			}
		}
		Static166.method2430();
		Static146.anInt3138 = 0;
		for (local119 = Static23.anInt558; local119 < Static204.anInt4231; local119++) {
			@Pc(281) Class2_Sub18[][] local281 = Static92.aClass2_Sub18ArrayArrayArray1[local119];
			for (local135 = Static172.anInt694; local135 < Static48.anInt1051; local135++) {
				for (local141 = Static216.anInt4536; local141 < Static102.anInt2328; local141++) {
					@Pc(293) Class2_Sub18 local293 = local281[local135][local141];
					if (local293 != null) {
						if (local293.anInt3301 <= arg5 && Static7.aBooleanArrayArray4[local135 + Static182.anInt3830 - Static140.anInt3022][local141 + Static182.anInt3830 - Static2.anInt78]) {
							local293.aBoolean142 = true;
							local293.aBoolean143 = true;
							if (local293.anInt3292 > 0) {
								local293.aBoolean141 = true;
							} else {
								local293.aBoolean141 = false;
							}
							Static146.anInt3138++;
						} else {
							local293.aBoolean142 = false;
							local293.aBoolean143 = false;
							local293.anInt3302 = 0;
						}
					}
				}
			}
		}
		@Pc(383) int local383;
		@Pc(388) int local388;
		@Pc(392) int local392;
		for (local129 = Static23.anInt558; local129 < Static204.anInt4231; local129++) {
			@Pc(362) Class2_Sub18[][] local362 = Static92.aClass2_Sub18ArrayArrayArray1[local129];
			for (local141 = -Static182.anInt3830; local141 <= 0; local141++) {
				local163 = Static140.anInt3022 + local141;
				local175 = Static140.anInt3022 - local141;
				if (local163 >= Static172.anInt694 || local175 < Static48.anInt1051) {
					for (local383 = -Static182.anInt3830; local383 <= 0; local383++) {
						local388 = Static2.anInt78 + local383;
						local392 = Static2.anInt78 - local383;
						@Pc(404) Class2_Sub18 local404;
						if (local163 >= Static172.anInt694) {
							if (local388 >= Static216.anInt4536) {
								local404 = local362[local163][local388];
								if (local404 != null && local404.aBoolean142) {
									Static67.method932(local404, true);
								}
							}
							if (local392 < Static102.anInt2328) {
								local404 = local362[local163][local392];
								if (local404 != null && local404.aBoolean142) {
									Static67.method932(local404, true);
								}
							}
						}
						if (local175 < Static48.anInt1051) {
							if (local388 >= Static216.anInt4536) {
								local404 = local362[local175][local388];
								if (local404 != null && local404.aBoolean142) {
									Static67.method932(local404, true);
								}
							}
							if (local392 < Static102.anInt2328) {
								local404 = local362[local175][local392];
								if (local404 != null && local404.aBoolean142) {
									Static67.method932(local404, true);
								}
							}
						}
						if (Static146.anInt3138 == 0) {
							Static139.aBoolean128 = false;
							return;
						}
					}
				}
			}
		}
		for (local135 = Static23.anInt558; local135 < Static204.anInt4231; local135++) {
			@Pc(488) Class2_Sub18[][] local488 = Static92.aClass2_Sub18ArrayArrayArray1[local135];
			for (local163 = -Static182.anInt3830; local163 <= 0; local163++) {
				local175 = Static140.anInt3022 + local163;
				local383 = Static140.anInt3022 - local163;
				if (local175 >= Static172.anInt694 || local383 < Static48.anInt1051) {
					for (local388 = -Static182.anInt3830; local388 <= 0; local388++) {
						local392 = Static2.anInt78 + local388;
						@Pc(518) int local518 = Static2.anInt78 - local388;
						@Pc(530) Class2_Sub18 local530;
						if (local175 >= Static172.anInt694) {
							if (local392 >= Static216.anInt4536) {
								local530 = local488[local175][local392];
								if (local530 != null && local530.aBoolean142) {
									Static67.method932(local530, false);
								}
							}
							if (local518 < Static102.anInt2328) {
								local530 = local488[local175][local518];
								if (local530 != null && local530.aBoolean142) {
									Static67.method932(local530, false);
								}
							}
						}
						if (local383 < Static48.anInt1051) {
							if (local392 >= Static216.anInt4536) {
								local530 = local488[local383][local392];
								if (local530 != null && local530.aBoolean142) {
									Static67.method932(local530, false);
								}
							}
							if (local518 < Static102.anInt2328) {
								local530 = local488[local383][local518];
								if (local530 != null && local530.aBoolean142) {
									Static67.method932(local530, false);
								}
							}
						}
						if (Static146.anInt3138 == 0) {
							Static139.aBoolean128 = false;
							return;
						}
					}
				}
			}
		}
		Static139.aBoolean128 = false;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(ILclient!kd;)Lclient!g;")
	public static Class24_Sub3 method435(@OriginalArg(1) Class2_Sub11 arg0) {
		return new Class24_Sub3(arg0.method1568(), arg0.method1568(), arg0.method1568(), arg0.method1568(), arg0.method1536(), arg0.method1534());
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!mb;Lclient!mb;Lclient!pb;B)[Lclient!rd;")
	public static Class42_Sub1[] method437(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class71 arg2) {
		@Pc(8) int local8 = arg2.method2114(arg0);
		@Pc(19) int local19 = arg2.method2142(arg1, local8);
		return Static89.method1269(local8, arg2, local19);
	}
}
