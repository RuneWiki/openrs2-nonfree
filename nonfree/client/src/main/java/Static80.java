import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
	public static int anInt1453;

	@OriginalMember(owner = "client!db", name = "M", descriptor = "[J")
	public static final long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!db", name = "O", descriptor = "Lclient!im;")
	public static final Class140 aClass140_27 = new Class140(114, 12);

	@OriginalMember(owner = "client!db", name = "hb", descriptor = "Lclient!im;")
	public static final Class140 aClass140_28 = new Class140(36, -2);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIILclient!qa;)V")
	public static void method1376(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static474.anInt7956 == 0 || Static359.anInt6311 == 0) {
			return;
		}
		arg2.b(Static196.anInt3864, Static506.anInt8568, Static474.anInt7956, Static359.anInt6311);
		arg2.N(Static537.anInt9065, Static414.anInt7301, Static474.anInt7956, Static359.anInt6311);
		@Pc(32) Class118 local32 = arg2.method7275();
		local32.B(Static155.anInt2824, Static227.anInt4495, Static204.anInt4021, Static470.anInt7899, Static193.anInt7222, Static522.anInt8772);
		arg2.method7250(local32);
		@Pc(52) int local52;
		@Pc(61) int local61;
		@Pc(70) int local70;
		@Pc(73) int local73;
		@Pc(82) int local82;
		@Pc(91) int local91;
		@Pc(106) int[] local106;
		@Pc(138) int local138;
		@Pc(147) int local147;
		if (Static16.aClass205Array1 != null) {
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local52 = arg2.c();
			local61 = (arg1 - Static196.anInt3864) * local52 / Static474.anInt7956;
			local70 = local52 * (arg0 - Static506.anInt8568) / Static359.anInt6311;
			local73 = arg2.CA();
			local82 = (arg1 - Static196.anInt3864) * local73 / Static474.anInt7956;
			local91 = local73 * (arg0 - Static506.anInt8568) / Static359.anInt6311;
			local106 = new int[] { local61, local70, local52 };
			local32.va(local106);
			@Pc(124) int[] local124 = new int[] { local82, local91, local73 };
			local32.va(local124);
			@Pc(129) float local129 = 0.0F;
			local138 = local124[0] - local106[0];
			local147 = local124[1] - local106[1];
			@Pc(155) int local155 = local124[2] - local106[2];
			while (local129 < 1.0F) {
				@Pc(168) int local168 = (int) ((float) local106[0] + local129 * (float) local138);
				@Pc(172) int local172 = local168 >> 9;
				@Pc(183) int local183 = (int) (local129 * (float) local155 + (float) local106[2]);
				@Pc(187) int local187 = local183 >> 9;
				if (local172 > 0 && local187 > 0 && local172 < Static459.anInt7799 && local187 < Static482.anInt7990) {
					@Pc(207) int local207 = Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98;
					if (local207 < 3 && (Static530.aByteArrayArrayArray17[1][local172][local187] & 0x2) != 0) {
						local207++;
					}
					if ((float) Static16.aClass205Array1[local207].aa(local168, local183) < (float) local106[1] + local129 * (float) local147) {
						local47 = local168 + (Static63.aClass49_Sub2_Sub2_Sub1_1.method3788() - 1 << 8) >> 9;
						local49 = local183 + (Static63.aClass49_Sub2_Sub2_Sub1_1.method3788() - 1 << 8) >> 9;
						break;
					}
				}
				local129 = (float) ((double) local129 + 0.01D);
			}
			if (local47 != -1 && local49 != -1) {
				if (Static431.aBoolean542 && (Static276.anInt9030 & 0x40) != 0) {
					@Pc(333) Class156 local333 = Static518.method7135(Static379.anInt8819, Static48.anInt942);
					if (local333 == null) {
						Static387.method5882();
					} else {
						Static13.method390(0L, local49, " ->", local47, 30, Static238.aString58, -1, true, false, Static222.anInt4414);
					}
				} else {
					if (Static542.aClass101_4 == Static304.aClass101_1) {
						Static13.method390(0L, local49, "", local47, 47, Static477.aClass306_120.method7165(Static179.anInt3168), -1, true, false, -1);
					}
					Static13.method390(0L, local49, "", local47, 50, Static485.aString75, -1, true, false, Static460.anInt7804);
				}
			}
		}
		@Pc(360) Class299 local360 = Static153.aClass299_3;
		for (@Pc(365) Class72_Sub7 local365 = (Class72_Sub7) local360.method7030(); local365 != null; local365 = (Class72_Sub7) local360.method7031()) {
			if ((Static332.aBoolean434 || Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 == local365.anInt6969) && local365.method5848(arg1, arg2, arg0)) {
				@Pc(502) int local502;
				@Pc(514) int local514;
				if (local365.aClass49_1 instanceof Class49_Sub2_Sub2_Sub1) {
					@Pc(389) Class49_Sub2_Sub2_Sub1 local389 = (Class49_Sub2_Sub2_Sub1) local365.aClass49_1;
					local61 = local389.method3788();
					if ((local61 & 0x1) == 0 && (local389.anInt7137 & 0x1FF) == 0 && (local389.anInt7141 & 0x1FF) == 0 || (local61 & 0x1) == 1 && (local389.anInt7137 & 0x1FF) == 256 && (local389.anInt7141 & 0x1FF) == 256) {
						local70 = local389.anInt7137 - (local389.method3788() - 1 << 8);
						local73 = local389.anInt7141 - (local389.method3788() - 1 << 8);
						for (local82 = 0; local82 < Static157.anInt4503; local82++) {
							@Pc(473) Class1_Sub17 local473 = (Class1_Sub17) Static380.aClass17_29.method738((long) Static427.anIntArray711[local82]);
							if (local473 != null) {
								@Pc(478) Class49_Sub2_Sub2_Sub2 local478 = local473.aClass49_Sub2_Sub2_Sub2_2;
								if (local478.anInt4264 != Static436.anInt6850 && local478.aBoolean304) {
									local502 = local478.anInt7137 - (local478.aClass196_1.anInt5718 - 1 << 8);
									local514 = local478.anInt7141 - (local478.aClass196_1.anInt5718 - 1 << 8);
									if (local70 <= local502 && local478.aClass196_1.anInt5718 <= local389.method3788() - (local502 - local70 >> 9) && local514 >= local73 && local478.aClass196_1.anInt5718 <= local389.method3788() - (local514 - local73 >> 9)) {
										Static21.method526(Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 != local365.anInt6969, local478);
										local478.anInt4264 = Static436.anInt6850;
									}
								}
							}
						}
						local91 = Static190.anInt3385;
						local106 = Static502.anIntArray771;
						for (local502 = 0; local502 < local91; local502++) {
							@Pc(596) Class49_Sub2_Sub2_Sub1 local596 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local106[local502]];
							if (local596 != null && local596.anInt4264 != Static436.anInt6850 && local596 != local389 && local596.aBoolean304) {
								local138 = local596.anInt7137 - (local596.method3788() - 1 << 8);
								local147 = local596.anInt7141 - (local596.method3788() - 1 << 8);
								if (local70 <= local138 && local596.method3788() <= local389.method3788() - (local138 - local70 >> 9) && local73 <= local147 && local596.method3788() <= local389.method3788() - (local147 - local73 >> 9)) {
									Static132.method2206(Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 != local365.anInt6969, local596);
									local596.anInt4264 = Static436.anInt6850;
								}
							}
						}
					}
					if (local389.anInt4264 == Static436.anInt6850) {
						continue;
					}
					Static132.method2206(Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 != local365.anInt6969, local389);
					local389.anInt4264 = Static436.anInt6850;
				}
				@Pc(838) int local838;
				if (local365.aClass49_1 instanceof Class49_Sub2_Sub2_Sub2) {
					@Pc(726) Class49_Sub2_Sub2_Sub2 local726 = (Class49_Sub2_Sub2_Sub2) local365.aClass49_1;
					if (local726.aClass196_1 != null) {
						if ((local726.aClass196_1.anInt5718 & 0x1) == 0 && (local726.anInt7137 & 0x1FF) == 0 && (local726.anInt7141 & 0x1FF) == 0 || (local726.aClass196_1.anInt5718 & 0x1) == 1 && (local726.anInt7137 & 0x1FF) == 256 && (local726.anInt7141 & 0x1FF) == 256) {
							local61 = local726.anInt7137 - (local726.aClass196_1.anInt5718 - 1 << 8);
							local70 = local726.anInt7141 - (local726.aClass196_1.anInt5718 - 1 << 8);
							for (local73 = 0; local73 < Static157.anInt4503; local73++) {
								@Pc(810) Class1_Sub17 local810 = (Class1_Sub17) Static380.aClass17_29.method738((long) Static427.anIntArray711[local73]);
								if (local810 != null) {
									@Pc(815) Class49_Sub2_Sub2_Sub2 local815 = local810.aClass49_Sub2_Sub2_Sub2_2;
									if (Static436.anInt6850 != local815.anInt4264 && local815 != local726 && local815.aBoolean304) {
										local838 = local815.anInt7137 - (local815.aClass196_1.anInt5718 - 1 << 8);
										local502 = local815.anInt7141 - (local815.aClass196_1.anInt5718 - 1 << 8);
										if (local61 <= local838 && local726.aClass196_1.anInt5718 - (local838 - local61 >> 9) >= local815.aClass196_1.anInt5718 && local70 <= local502 && local815.aClass196_1.anInt5718 <= local726.aClass196_1.anInt5718 - (local502 - local70 >> 9)) {
											Static21.method526(Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 != local365.anInt6969, local815);
											local815.anInt4264 = Static436.anInt6850;
										}
									}
								}
							}
							local82 = Static190.anInt3385;
							@Pc(919) int[] local919 = Static502.anIntArray771;
							for (local838 = 0; local838 < local82; local838++) {
								@Pc(929) Class49_Sub2_Sub2_Sub1 local929 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local919[local838]];
								if (local929 != null && local929.anInt4264 != Static436.anInt6850 && local929.aBoolean304) {
									local514 = local929.anInt7137 - (local929.method3788() - 1 << 8);
									local138 = local929.anInt7141 - (local929.method3788() - 1 << 8);
									if (local61 <= local514 && local929.method3788() <= local726.aClass196_1.anInt5718 - (local514 - local61 >> 9) && local138 >= local70 && local929.method3788() <= local726.aClass196_1.anInt5718 - (local138 - local70 >> 9)) {
										Static132.method2206(Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 != local365.anInt6969, local929);
										local929.anInt4264 = Static436.anInt6850;
									}
								}
							}
						}
						if (Static436.anInt6850 == local726.anInt4264) {
							continue;
						}
						Static21.method526(Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 != local365.anInt6969, local726);
						local726.anInt4264 = Static436.anInt6850;
					}
				}
				if (local365.aClass49_1 instanceof Class49_Sub4_Sub1) {
					local52 = Static470.anInt7897 + local365.anInt6970;
					local61 = Static534.anInt9007 + local365.anInt6968;
					@Pc(1079) Class1_Sub26 local1079 = (Class1_Sub26) Static255.aClass17_20.method738((long) (local61 << 14 | local365.anInt6969 << 28 | local52));
					if (local1079 != null) {
						for (@Pc(1087) Class1_Sub38 local1087 = (Class1_Sub38) local1079.aClass37_48.method974(); local1087 != null; local1087 = (Class1_Sub38) local1079.aClass37_48.method966()) {
							@Pc(1095) Class133 local1095 = Static342.aClass250_2.method5980(local1087.anInt7117);
							if (Static431.aBoolean542 && local365.anInt6969 == Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98) {
								@Pc(1112) Class71 local1112 = Static146.anInt2743 == -1 ? null : Static452.aClass317_2.method7539(Static146.anInt2743);
								if ((Static276.anInt9030 & 0x1) != 0 && (local1112 == null || local1095.method3457(local1112.anInt1963, Static146.anInt2743) != local1112.anInt1963)) {
									Static13.method390((long) local1087.anInt7117, local365.anInt6968, Static170.aString32 + " -> <col=ff9040>" + local1095.aString38, local365.anInt6970, 10, Static238.aString58, -1, true, false, Static222.anInt4414);
								}
							}
							if (Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 == local365.anInt6969) {
								@Pc(1178) String[] local1178 = local1095.aStringArray21;
								for (local838 = 4; local838 >= 0; local838--) {
									if (local1178 != null && local1178[local838] != null) {
										@Pc(1190) byte local1190 = 0;
										local514 = Class145_Sub2.lb;
										if (local838 == 0) {
											local1190 = 57;
										}
										if (local838 == 1) {
											local1190 = 58;
										}
										if (local838 == 2) {
											local1190 = 11;
										}
										if (local838 == 3) {
											local1190 = 17;
										}
										if (local838 == 4) {
											local1190 = 49;
										}
										if (local1095.anInt3949 == local838) {
											local514 = local1095.anInt3933;
										}
										if (local1095.anInt3913 == local838) {
											local514 = local1095.anInt3896;
										}
										Static13.method390((long) local1087.anInt7117, local365.anInt6968, "<col=ff9040>" + local1095.aString38, local365.anInt6970, local1190, local1178[local838], -1, true, false, local514);
									}
								}
							}
							Static13.method390((long) local1087.anInt7117, local365.anInt6968, "<col=ff9040>" + local1095.aString38, local365.anInt6970, 1004, Static395.aClass306_98.method7165(Static179.anInt3168), -1, true, local365.anInt6969 != Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98, Static221.anInt4390);
						}
					}
				}
				if (local365.aClass49_1 instanceof Interface18) {
					@Pc(1323) Interface18 local1323 = (Interface18) local365.aClass49_1;
					@Pc(1332) Class36 local1332 = Static308.aClass96_4.method2274(local1323.method7467());
					if (local1332.anIntArray127 != null) {
						local1332 = local1332.method954(Static251.aClass119_1);
					}
					if (local1332 != null) {
						if (Static431.aBoolean542 && local365.anInt6969 == Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98) {
							@Pc(1362) Class71 local1362 = Static146.anInt2743 == -1 ? null : Static452.aClass317_2.method7539(Static146.anInt2743);
							if ((Static276.anInt9030 & 0x4) != 0 && (local1362 == null || local1332.method948(Static146.anInt2743, local1362.anInt1963) != local1362.anInt1963)) {
								Static13.method390(Static511.method7064(local365.anInt6968, local1323, local365.anInt6970), local365.anInt6968, Static170.aString32 + " -> <col=00ffff>" + local1332.aString6, local365.anInt6970, 22, Static238.aString58, -1, true, false, Static222.anInt4414);
							}
						}
						if (Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 == local365.anInt6969) {
							@Pc(1423) String[] local1423 = local1332.aStringArray4;
							if (local1423 != null) {
								for (local73 = 4; local73 >= 0; local73--) {
									if (local1423[local73] != null) {
										@Pc(1435) short local1435 = 0;
										if (local73 == 0) {
											local1435 = 12;
										}
										local91 = Class145_Sub2.lb;
										if (local73 == 1) {
											local1435 = 23;
										}
										if (local73 == 2) {
											local1435 = 46;
										}
										if (local73 == 3) {
											local1435 = 15;
										}
										if (local73 == 4) {
											local1435 = 1011;
										}
										if (local1332.anInt981 == local73) {
											local91 = local1332.anInt980;
										}
										if (local73 == local1332.anInt977) {
											local91 = local1332.anInt971;
										}
										Static13.method390(Static511.method7064(local365.anInt6968, local1323, local365.anInt6970), local365.anInt6968, "<col=00ffff>" + local1332.aString6, local365.anInt6970, local1435, local1423[local73], -1, true, false, local91);
									}
								}
							}
						}
						Static13.method390((long) local1332.anInt952, local365.anInt6968, "<col=00ffff>" + local1332.aString6, local365.anInt6970, 1012, Static395.aClass306_98.method7165(Static179.anInt3168), -1, true, Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 != local365.anInt6969, Static221.anInt4390);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Lclient!qc;")
	public static Class39 method1380() {
		try {
			return new Class39_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class39) Class.forName("Class39_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(14) Throwable local14) {
				return new Class39_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)I")
	public static int method1381(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Lclient!taa;")
	public static Class185_Sub1 method1382() {
		Static45.anInt918 = 0;
		return Static277.method4517();
	}
}
