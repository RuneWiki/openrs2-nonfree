import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!ch", name = "G", descriptor = "Lclient!kb;")
	public static Class83 aClass83_20;

	@OriginalMember(owner = "client!ch", name = "Y", descriptor = "[Lclient!ug;")
	public static Class1_Sub2_Sub14[] aClass1_Sub2_Sub14Array5;

	@OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
	public static int anInt856;

	@OriginalMember(owner = "client!ch", name = "B", descriptor = "[J")
	public static long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!ch", name = "T", descriptor = "[C")
	public static char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ch", name = "db", descriptor = "[I")
	public static int[] anIntArray96 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!ch", name = "lb", descriptor = "I")
	public static int anInt864 = 0;

	@OriginalMember(owner = "client!ch", name = "rb", descriptor = "I")
	public static int anInt867 = 0;

	@OriginalMember(owner = "client!ch", name = "ub", descriptor = "I")
	public static int anInt870 = -1;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILclient!qm;)V")
	public static void method675(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub27 arg1) {
		@Pc(8) Object[] local8 = arg1.anObjectArray32;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(20) Class1_Sub2_Sub11 local20 = Static101.method2281(local14);
		if (local20 == null) {
			return;
		}
		Static269.anInt5828 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = -1;
		@Pc(35) int[] local35 = local20.anIntArray247;
		@Pc(38) int[] local38 = local20.anIntArray246;
		@Pc(40) byte local40 = -1;
		@Pc(54) int local54;
		try {
			@Pc(42) int local42 = 0;
			Static86.anIntArray211 = new int[local20.anInt2552];
			@Pc(48) int local48 = 0;
			Static291.aStringArray36 = new String[local20.anInt2553];
			@Pc(78) String local78;
			@Pc(99) int local99;
			for (local54 = 1; local54 < local8.length; local54++) {
				if (local8[local54] instanceof Integer) {
					local99 = (Integer) local8[local54];
					if (local99 == -2147483647) {
						local99 = arg1.anInt4899;
					}
					if (local99 == -2147483646) {
						local99 = arg1.anInt4905;
					}
					if (local99 == -2147483645) {
						local99 = arg1.aClass116_13 == null ? -1 : arg1.aClass116_13.anInt4290;
					}
					if (local99 == -2147483644) {
						local99 = arg1.anInt4897;
					}
					if (local99 == -2147483643) {
						local99 = arg1.aClass116_13 == null ? -1 : arg1.aClass116_13.anInt4297;
					}
					if (local99 == -2147483642) {
						local99 = arg1.aClass116_12 == null ? -1 : arg1.aClass116_12.anInt4290;
					}
					if (local99 == -2147483641) {
						local99 = arg1.aClass116_12 == null ? -1 : arg1.aClass116_12.anInt4297;
					}
					if (local99 == -2147483640) {
						local99 = arg1.anInt4903;
					}
					if (local99 == -2147483639) {
						local99 = arg1.anInt4900;
					}
					Static86.anIntArray211[local42++] = local99;
				} else if (local8[local54] instanceof String) {
					local78 = (String) local8[local54];
					if (local78.equals("event_opbase")) {
						local78 = arg1.aString151;
					}
					Static291.aStringArray36[local48++] = local78;
				}
			}
			local54 = 0;
			label4462: while (true) {
				local54++;
				if (arg0 < local54) {
					throw new RuntimeException("slow");
				}
				local32++;
				@Pc(223) int local223 = local35[local32];
				@Pc(814) int local814;
				@Pc(820) int local820;
				@Pc(653) int local653;
				@Pc(607) String local607;
				@Pc(647) int[] local647;
				if (local223 < 100) {
					if (local223 == 0) {
						Static222.anIntArray512[local28++] = local38[local32];
						continue;
					}
					if (local223 == 1) {
						local99 = local38[local32];
						Static222.anIntArray512[local28++] = Static170.anIntArray601[local99];
						continue;
					}
					if (local223 == 2) {
						local99 = local38[local32];
						local28--;
						Static241.method4156(local99, Static222.anIntArray512[local28]);
						continue;
					}
					if (local223 == 3) {
						Static252.aStringArray32[local30++] = local20.aStringArray11[local32];
						continue;
					}
					if (local223 == 6) {
						local32 += local38[local32];
						continue;
					}
					if (local223 == 7) {
						local28 -= 2;
						if (Static222.anIntArray512[local28 + 1] != Static222.anIntArray512[local28]) {
							local32 += local38[local32];
						}
						continue;
					}
					if (local223 == 8) {
						local28 -= 2;
						if (Static222.anIntArray512[local28] == Static222.anIntArray512[local28 + 1]) {
							local32 += local38[local32];
						}
						continue;
					}
					if (local223 == 9) {
						local28 -= 2;
						if (Static222.anIntArray512[local28] < Static222.anIntArray512[local28 + 1]) {
							local32 += local38[local32];
						}
						continue;
					}
					if (local223 == 10) {
						local28 -= 2;
						if (Static222.anIntArray512[local28 + 1] < Static222.anIntArray512[local28]) {
							local32 += local38[local32];
						}
						continue;
					}
					if (local223 == 21) {
						if (Static269.anInt5828 == 0) {
							return;
						}
						@Pc(418) Class160 local418 = Static54.aClass160Array1[--Static269.anInt5828];
						local32 = local418.anInt5839;
						local20 = local418.aClass1_Sub2_Sub11_1;
						Static291.aStringArray36 = local418.aStringArray34;
						Static86.anIntArray211 = local418.anIntArray582;
						local38 = local20.anIntArray246;
						local35 = local20.anIntArray247;
						continue;
					}
					if (local223 == 25) {
						local99 = local38[local32];
						Static222.anIntArray512[local28++] = Static40.method1449(local99);
						continue;
					}
					if (local223 == 27) {
						local99 = local38[local32];
						local28--;
						Static114.method1867(Static222.anIntArray512[local28], local99);
						continue;
					}
					if (local223 == 31) {
						local28 -= 2;
						if (Static222.anIntArray512[local28 + 1] >= Static222.anIntArray512[local28]) {
							local32 += local38[local32];
						}
						continue;
					}
					if (local223 == 32) {
						local28 -= 2;
						if (Static222.anIntArray512[local28 + 1] <= Static222.anIntArray512[local28]) {
							local32 += local38[local32];
						}
						continue;
					}
					if (local223 == 33) {
						Static222.anIntArray512[local28++] = Static86.anIntArray211[local38[local32]];
						continue;
					}
					@Pc(552) int local552;
					if (local223 == 34) {
						local552 = local38[local32];
						local28--;
						Static86.anIntArray211[local552] = Static222.anIntArray512[local28];
						continue;
					}
					if (local223 == 35) {
						Static252.aStringArray32[local30++] = Static291.aStringArray36[local38[local32]];
						continue;
					}
					if (local223 == 36) {
						local552 = local38[local32];
						local30--;
						Static291.aStringArray36[local552] = Static252.aStringArray32[local30];
						continue;
					}
					if (local223 == 37) {
						local99 = local38[local32];
						local30 -= local99;
						local607 = Static11.method2235(local30, Static252.aStringArray32, local99);
						Static252.aStringArray32[local30++] = local607;
						continue;
					}
					if (local223 == 38) {
						local28--;
						continue;
					}
					if (local223 == 39) {
						local30--;
						continue;
					}
					if (local223 == 40) {
						local99 = local38[local32];
						@Pc(643) Class1_Sub2_Sub11 local643 = Static101.method2281(local99);
						local647 = new int[local643.anInt2552];
						@Pc(651) String[] local651 = new String[local643.anInt2553];
						for (local653 = 0; local653 < local643.anInt2555; local653++) {
							local647[local653] = Static222.anIntArray512[local653 + local28 - local643.anInt2555];
						}
						for (local653 = 0; local653 < local643.anInt2554; local653++) {
							local651[local653] = Static252.aStringArray32[local653 + local30 - local643.anInt2554];
						}
						local28 -= local643.anInt2555;
						local30 -= local643.anInt2554;
						@Pc(715) Class160 local715 = new Class160();
						local715.aStringArray34 = Static291.aStringArray36;
						local715.anInt5839 = local32;
						local715.anIntArray582 = Static86.anIntArray211;
						local715.aClass1_Sub2_Sub11_1 = local20;
						if (Static54.aClass160Array1.length <= Static269.anInt5828) {
							throw new RuntimeException();
						}
						local20 = local643;
						local32 = -1;
						Static54.aClass160Array1[Static269.anInt5828++] = local715;
						Static291.aStringArray36 = local651;
						local38 = local643.anIntArray246;
						Static86.anIntArray211 = local647;
						local35 = local643.anIntArray247;
						continue;
					}
					if (local223 == 42) {
						Static222.anIntArray512[local28++] = Static152.anIntArray325[local38[local32]];
						continue;
					}
					if (local223 == 43) {
						local99 = local38[local32];
						local28--;
						Static152.anIntArray325[local99] = Static222.anIntArray512[local28];
						Static15.method318(local99);
						continue;
					}
					if (local223 == 44) {
						local99 = local38[local32] >> 16;
						local28--;
						local814 = Static222.anIntArray512[local28];
						local820 = local38[local32] & 0xFFFF;
						if (local814 >= 0 && local814 <= 5000) {
							Static15.anIntArray24[local99] = local814;
							@Pc(840) byte local840 = -1;
							if (local820 == 105) {
								local840 = 0;
							}
							local653 = 0;
							while (true) {
								if (local814 <= local653) {
									continue label4462;
								}
								Static157.anIntArrayArray23[local99][local653] = local840;
								local653++;
							}
						}
						throw new RuntimeException();
					}
					if (local223 == 45) {
						local99 = local38[local32];
						local28--;
						local820 = Static222.anIntArray512[local28];
						if (local820 >= 0 && local820 < Static15.anIntArray24[local99]) {
							Static222.anIntArray512[local28++] = Static157.anIntArrayArray23[local99][local820];
							continue;
						}
						throw new RuntimeException();
					}
					if (local223 == 46) {
						local28 -= 2;
						local99 = local38[local32];
						local820 = Static222.anIntArray512[local28];
						if (local820 >= 0 && Static15.anIntArray24[local99] > local820) {
							Static157.anIntArrayArray23[local99][local820] = Static222.anIntArray512[local28 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local223 == 47) {
						local78 = Static4.aStringArray1[local38[local32]];
						if (local78 == null) {
							local78 = "null";
						}
						Static252.aStringArray32[local30++] = local78;
						continue;
					}
					if (local223 == 48) {
						local99 = local38[local32];
						local30--;
						Static4.aStringArray1[local99] = Static252.aStringArray32[local30];
						Static232.method4052(local99);
						continue;
					}
					if (local223 == 51) {
						@Pc(995) Class117 local995 = local20.aClass117Array1[local38[local32]];
						local28--;
						@Pc(1005) Class1_Sub10 local1005 = (Class1_Sub10) local995.method3438((long) Static222.anIntArray512[local28]);
						if (local1005 != null) {
							local32 += local1005.anInt1508;
						}
						continue;
					}
				}
				@Pc(1024) boolean local1024;
				if (local38[local32] == 1) {
					local1024 = true;
				} else {
					local1024 = false;
				}
				@Pc(1053) int local1053;
				@Pc(4494) int local4494;
				@Pc(1180) Class116 local1180;
				@Pc(13263) Class116 local13263;
				@Pc(13291) Class116 local13291;
				if (local223 >= 300) {
					@Pc(1144) boolean local1144;
					if (local223 < 500) {
						if (local223 == 403) {
							local28 -= 2;
							local820 = Static222.anIntArray512[local28];
							local814 = Static222.anIntArray512[local28 + 1];
							for (local1053 = 0; local1053 < Static80.anIntArray200.length; local1053++) {
								if (local820 == Static80.anIntArray200[local1053]) {
									Static239.aClass25_Sub1_Sub1_2.aClass147_2.method4161(local1053, local814);
									continue label4462;
								}
							}
							local1053 = 0;
							while (true) {
								if (Static205.anIntArray466.length <= local1053) {
									continue label4462;
								}
								if (local820 == Static205.anIntArray466[local1053]) {
									Static239.aClass25_Sub1_Sub1_2.aClass147_2.method4161(local1053, local814);
									continue label4462;
								}
								local1053++;
							}
						}
						if (local223 == 404) {
							local28 -= 2;
							local814 = Static222.anIntArray512[local28 + 1];
							local820 = Static222.anIntArray512[local28];
							Static239.aClass25_Sub1_Sub1_2.aClass147_2.method4162(local820, local814);
							continue;
						}
						if (local223 == 410) {
							local28--;
							local1144 = Static222.anIntArray512[local28] != 0;
							Static239.aClass25_Sub1_Sub1_2.aClass147_2.method4168(local1144);
							continue;
						}
					} else {
						@Pc(1375) boolean local1375;
						if (local223 >= 1000 && local223 < 1100 || local223 >= 2000 && local223 < 2100) {
							if (local223 >= 2000) {
								local223 -= 1000;
								local28--;
								local1180 = Static115.method1897(Static222.anIntArray512[local28]);
							} else {
								local1180 = local1024 ? Static299.aClass116_19 : Static260.aClass116_17;
							}
							if (local223 == 1000) {
								local28 -= 4;
								local1180.anInt4329 = Static222.anIntArray512[local28];
								local1180.anInt4325 = Static222.anIntArray512[local28 + 1];
								local1053 = Static222.anIntArray512[local28 + 3];
								if (local1053 < 0) {
									local1053 = 0;
								} else if (local1053 > 5) {
									local1053 = 5;
								}
								local814 = Static222.anIntArray512[local28 + 2];
								local1180.aByte14 = (byte) local1053;
								if (local814 < 0) {
									local814 = 0;
								} else if (local814 > 5) {
									local814 = 5;
								}
								local1180.aByte12 = (byte) local814;
								Static189.method3378(local1180);
								Static58.method1139(local1180);
								if (local1180.anInt4297 == -1) {
									Static180.method3277(local1180.anInt4290);
								}
								continue;
							}
							if (local223 == 1001) {
								local28 -= 4;
								local1180.anInt4292 = Static222.anIntArray512[local28];
								local1180.anInt4347 = Static222.anIntArray512[local28 + 1];
								local1180.anInt4335 = 0;
								local1180.anInt4353 = 0;
								local1053 = Static222.anIntArray512[local28 + 3];
								local814 = Static222.anIntArray512[local28 + 2];
								if (local814 < 0) {
									local814 = 0;
								} else if (local814 > 4) {
									local814 = 4;
								}
								if (local1053 < 0) {
									local1053 = 0;
								} else if (local1053 > 4) {
									local1053 = 4;
								}
								local1180.aByte13 = (byte) local1053;
								local1180.aByte15 = (byte) local814;
								Static189.method3378(local1180);
								Static58.method1139(local1180);
								if (local1180.anInt4376 == 0) {
									Static23.method400(false, local1180);
								}
								continue;
							}
							if (local223 == 1003) {
								local28--;
								local1375 = Static222.anIntArray512[local28] == 1;
								if (local1180.aBoolean228 != local1375) {
									local1180.aBoolean228 = local1375;
									Static189.method3378(local1180);
								}
								if (local1180.anInt4297 == -1) {
									Static129.method2196(local1180.anInt4290);
								}
								continue;
							}
							if (local223 == 1004) {
								local28 -= 2;
								local1180.anInt4346 = Static222.anIntArray512[local28];
								local1180.anInt4379 = Static222.anIntArray512[local28 + 1];
								Static189.method3378(local1180);
								Static58.method1139(local1180);
								if (local1180.anInt4376 == 0) {
									Static23.method400(false, local1180);
								}
								continue;
							}
							if (local223 == 1005) {
								local28--;
								local1180.aBoolean220 = Static222.anIntArray512[local28] == 1;
								continue;
							}
						} else {
							@Pc(2107) String local2107;
							if (local223 >= 1100 && local223 < 1200 || local223 >= 2100 && local223 < 2200) {
								if (local223 >= 2000) {
									local223 -= 1000;
									local28--;
									local1180 = Static115.method1897(Static222.anIntArray512[local28]);
								} else {
									local1180 = local1024 ? Static299.aClass116_19 : Static260.aClass116_17;
								}
								if (local223 == 1100) {
									local28 -= 2;
									local1180.anInt4303 = Static222.anIntArray512[local28];
									if (local1180.anInt4321 - local1180.anInt4299 < local1180.anInt4303) {
										local1180.anInt4303 = local1180.anInt4321 - local1180.anInt4299;
									}
									if (local1180.anInt4303 < 0) {
										local1180.anInt4303 = 0;
									}
									local1180.anInt4307 = Static222.anIntArray512[local28 + 1];
									if (local1180.anInt4320 - local1180.anInt4363 < local1180.anInt4307) {
										local1180.anInt4307 = local1180.anInt4320 - local1180.anInt4363;
									}
									if (local1180.anInt4307 < 0) {
										local1180.anInt4307 = 0;
									}
									Static189.method3378(local1180);
									if (local1180.anInt4297 == -1) {
										Static159.method2995(local1180.anInt4290);
									}
									continue;
								}
								if (local223 == 1101) {
									local28--;
									local1180.anInt4294 = Static222.anIntArray512[local28];
									Static189.method3378(local1180);
									if (local1180.anInt4297 == -1) {
										Static31.method659(local1180.anInt4290);
									}
									continue;
								}
								if (local223 == 1102) {
									local28--;
									local1180.aBoolean215 = Static222.anIntArray512[local28] == 1;
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1103) {
									local28--;
									local1180.anInt4323 = Static222.anIntArray512[local28];
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1104) {
									local28--;
									local1180.anInt4315 = Static222.anIntArray512[local28];
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1105) {
									local28--;
									local1180.anInt4308 = Static222.anIntArray512[local28];
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1106) {
									local28--;
									local1180.anInt4318 = Static222.anIntArray512[local28];
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1107) {
									local28--;
									local1180.aBoolean223 = Static222.anIntArray512[local28] == 1;
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1108) {
									local1180.anInt4382 = 1;
									local28--;
									local1180.anInt4385 = Static222.anIntArray512[local28];
									Static189.method3378(local1180);
									if (local1180.anInt4297 == -1) {
										Static258.method4391(local1180.anInt4290);
									}
									continue;
								}
								if (local223 == 1109) {
									local28 -= 6;
									local1180.anInt4350 = Static222.anIntArray512[local28];
									local1180.anInt4331 = Static222.anIntArray512[local28 + 1];
									local1180.anInt4362 = Static222.anIntArray512[local28 + 2];
									local1180.anInt4361 = Static222.anIntArray512[local28 + 3];
									local1180.anInt4330 = Static222.anIntArray512[local28 + 4];
									local1180.anInt4291 = Static222.anIntArray512[local28 + 5];
									Static189.method3378(local1180);
									if (local1180.anInt4297 == -1) {
										Static206.method3664(local1180.anInt4290);
										Static15.method322(local1180.anInt4290);
									}
									continue;
								}
								if (local223 == 1110) {
									local28--;
									local814 = Static222.anIntArray512[local28];
									if (local1180.anInt4367 != local814) {
										local1180.anInt4369 = 0;
										local1180.anInt4380 = 1;
										local1180.anInt4374 = 0;
										local1180.anInt4367 = local814;
										Static189.method3378(local1180);
									}
									if (local1180.anInt4297 == -1) {
										Static160.method3001(local1180.anInt4290);
									}
									continue;
								}
								if (local223 == 1111) {
									local28--;
									local1180.aBoolean216 = Static222.anIntArray512[local28] == 1;
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1112) {
									local30--;
									local2107 = Static252.aStringArray32[local30];
									if (!local2107.equals(local1180.aString127)) {
										local1180.aString127 = local2107;
										Static189.method3378(local1180);
									}
									if (local1180.anInt4297 == -1) {
										Static239.method4132(local1180.anInt4290);
									}
									continue;
								}
								if (local223 == 1113) {
									local28--;
									local1180.anInt4342 = Static222.anIntArray512[local28];
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1114) {
									local28 -= 3;
									local1180.anInt4378 = Static222.anIntArray512[local28];
									local1180.anInt4358 = Static222.anIntArray512[local28 + 1];
									local1180.anInt4324 = Static222.anIntArray512[local28 + 2];
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1115) {
									local28--;
									local1180.aBoolean218 = Static222.anIntArray512[local28] == 1;
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1116) {
									local28--;
									local1180.anInt4375 = Static222.anIntArray512[local28];
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1117) {
									local28--;
									local1180.anInt4341 = Static222.anIntArray512[local28];
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1118) {
									local28--;
									local1180.aBoolean225 = Static222.anIntArray512[local28] == 1;
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1119) {
									local28--;
									local1180.aBoolean221 = Static222.anIntArray512[local28] == 1;
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1120) {
									local28 -= 2;
									local1180.anInt4321 = Static222.anIntArray512[local28];
									local1180.anInt4320 = Static222.anIntArray512[local28 + 1];
									Static189.method3378(local1180);
									if (local1180.anInt4376 == 0) {
										Static23.method400(false, local1180);
									}
									continue;
								}
								if (local223 == 1121) {
									local28 -= 2;
									local1180.aShort25 = (short) Static222.anIntArray512[local28];
									local1180.aShort26 = (short) Static222.anIntArray512[local28 + 1];
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1122) {
									local28--;
									local1180.aBoolean222 = Static222.anIntArray512[local28] == 1;
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1123) {
									local28--;
									local1180.anInt4291 = Static222.anIntArray512[local28];
									Static189.method3378(local1180);
									if (local1180.anInt4297 == -1) {
										Static206.method3664(local1180.anInt4290);
									}
									continue;
								}
								if (local223 == 1124) {
									local28--;
									local814 = Static222.anIntArray512[local28];
									local1180.aBoolean217 = local814 == 1;
									Static189.method3378(local1180);
									continue;
								}
							} else if (local223 >= 1200 && local223 < 1300 || !(local223 < 2200 || local223 >= 2300)) {
								if (local223 >= 2000) {
									local223 -= 1000;
									local28--;
									local1180 = Static115.method1897(Static222.anIntArray512[local28]);
								} else {
									local1180 = local1024 ? Static299.aClass116_19 : Static260.aClass116_17;
								}
								Static189.method3378(local1180);
								if (local223 == 1200 || local223 == 1205 || local223 == 1208 || local223 == 1209) {
									local28 -= 2;
									local814 = Static222.anIntArray512[local28];
									local1053 = Static222.anIntArray512[local28 + 1];
									if (local1180.anInt4297 == -1) {
										Static208.method3679(local1180.anInt4290);
										Static206.method3664(local1180.anInt4290);
										Static15.method322(local1180.anInt4290);
									}
									if (local814 == -1) {
										local1180.anInt4356 = -1;
										local1180.anInt4385 = -1;
										local1180.anInt4382 = 1;
										continue;
									}
									local1180.anInt4356 = local814;
									if (local223 == 1208 || local223 == 1209) {
										local1180.aBoolean214 = true;
									} else {
										local1180.aBoolean214 = false;
									}
									local1180.anInt4338 = local1053;
									@Pc(1608) Class138 local1608 = Static238.method4099(local814);
									local1180.anInt4361 = local1608.anInt5041;
									local1180.anInt4331 = local1608.anInt5049;
									if (local223 == 1205) {
										local1180.aBoolean226 = false;
									} else {
										local1180.aBoolean226 = true;
									}
									local1180.anInt4362 = local1608.anInt5043;
									local1180.anInt4330 = local1608.anInt5029;
									local1180.anInt4291 = local1608.anInt5056;
									local1180.anInt4350 = local1608.anInt5030;
									if (local1180.anInt4353 > 0) {
										local1180.anInt4291 = local1180.anInt4291 * 32 / local1180.anInt4353;
									} else if (local1180.anInt4292 > 0) {
										local1180.anInt4291 = local1180.anInt4291 * 32 / local1180.anInt4292;
									}
									continue;
								}
								if (local223 == 1201) {
									local1180.anInt4382 = 2;
									local28--;
									local1180.anInt4385 = Static222.anIntArray512[local28];
									if (local1180.anInt4297 == -1) {
										Static258.method4391(local1180.anInt4290);
									}
									continue;
								}
								if (local223 == 1202) {
									local1180.anInt4382 = 3;
									local1180.anInt4385 = Static239.aClass25_Sub1_Sub1_2.aClass147_2.method4164();
									if (local1180.anInt4297 == -1) {
										Static258.method4391(local1180.anInt4290);
									}
									continue;
								}
								if (local223 == 1203) {
									local1180.anInt4382 = 6;
									local28--;
									local1180.anInt4385 = Static222.anIntArray512[local28];
									if (local1180.anInt4297 == -1) {
										Static258.method4391(local1180.anInt4290);
									}
									continue;
								}
								if (local223 == 1204) {
									local1180.anInt4382 = 5;
									local28--;
									local1180.anInt4385 = Static222.anIntArray512[local28];
									if (local1180.anInt4297 == -1) {
										Static258.method4391(local1180.anInt4290);
									}
									continue;
								}
								if (local223 == 1206) {
									local28 -= 4;
									local1180.anInt4295 = Static222.anIntArray512[local28];
									local1180.anInt4305 = Static222.anIntArray512[local28 + 1];
									local1180.anInt4352 = Static222.anIntArray512[local28 + 2];
									local1180.anInt4336 = Static222.anIntArray512[local28 + 3];
									Static189.method3378(local1180);
									continue;
								}
								if (local223 == 1207) {
									local28 -= 2;
									local1180.anInt4300 = Static222.anIntArray512[local28];
									local1180.anInt4319 = Static222.anIntArray512[local28 + 1];
									Static189.method3378(local1180);
									continue;
								}
							} else if ((local223 < 1300 || local223 >= 1400) && (local223 < 2300 || local223 >= 2400)) {
								@Pc(2170) int local2170;
								@Pc(2109) int[] local2109;
								if (local223 >= 1400 && local223 < 1500 || local223 >= 2400 && local223 < 2500) {
									if (local223 >= 2000) {
										local28--;
										local1180 = Static115.method1897(Static222.anIntArray512[local28]);
										local223 -= 1000;
									} else {
										local1180 = local1024 ? Static299.aClass116_19 : Static260.aClass116_17;
									}
									local30--;
									local2107 = Static252.aStringArray32[local30];
									local2109 = null;
									if (local2107.length() > 0 && local2107.charAt(local2107.length() - 1) == 'Y') {
										local28--;
										local653 = Static222.anIntArray512[local28];
										if (local653 > 0) {
											local2109 = new int[local653];
											while (local653-- > 0) {
												local28--;
												local2109[local653] = Static222.anIntArray512[local28];
											}
										}
										local2107 = local2107.substring(0, local2107.length() - 1);
									}
									@Pc(2165) Object[] local2165 = new Object[local2107.length() + 1];
									for (local2170 = local2165.length - 1; local2170 >= 1; local2170--) {
										if (local2107.charAt(local2170 - 1) == 's') {
											local30--;
											local2165[local2170] = Static252.aStringArray32[local30];
										} else {
											local28--;
											local2165[local2170] = Integer.valueOf(Static222.anIntArray512[local28]);
										}
									}
									local28--;
									local2170 = Static222.anIntArray512[local28];
									if (local2170 == -1) {
										local2165 = null;
									} else {
										local2165[0] = Integer.valueOf(local2170);
									}
									if (local223 == 1400) {
										local1180.anObjectArray20 = local2165;
									} else if (local223 == 1401) {
										local1180.anObjectArray17 = local2165;
									} else if (local223 == 1402) {
										local1180.anObjectArray22 = local2165;
									} else if (local223 == 1403) {
										local1180.anObjectArray4 = local2165;
									} else if (local223 == 1404) {
										local1180.anObjectArray29 = local2165;
									} else if (local223 == 1405) {
										local1180.anObjectArray25 = local2165;
									} else if (local223 == 1406) {
										local1180.anObjectArray11 = local2165;
									} else if (local223 == 1407) {
										local1180.anObjectArray3 = local2165;
										local1180.anIntArray389 = local2109;
									} else if (local223 == 1408) {
										local1180.anObjectArray14 = local2165;
									} else if (local223 == 1409) {
										local1180.anObjectArray2 = local2165;
									} else if (local223 == 1410) {
										local1180.anObjectArray8 = local2165;
									} else if (local223 == 1411) {
										local1180.anObjectArray10 = local2165;
									} else if (local223 == 1412) {
										local1180.anObjectArray21 = local2165;
									} else if (local223 == 1414) {
										local1180.anIntArray402 = local2109;
										local1180.anObjectArray7 = local2165;
									} else if (local223 == 1415) {
										local1180.anObjectArray24 = local2165;
										local1180.anIntArray396 = local2109;
									} else if (local223 == 1416) {
										local1180.anObjectArray23 = local2165;
									} else if (local223 == 1417) {
										local1180.anObjectArray12 = local2165;
									} else if (local223 == 1418) {
										local1180.anObjectArray9 = local2165;
									} else if (local223 == 1419) {
										local1180.anObjectArray30 = local2165;
									} else if (local223 == 1420) {
										local1180.anObjectArray5 = local2165;
									} else if (local223 == 1421) {
										local1180.anObjectArray27 = local2165;
									} else if (local223 == 1422) {
										local1180.anObjectArray15 = local2165;
									} else if (local223 == 1423) {
										local1180.anObjectArray31 = local2165;
									} else if (local223 == 1424) {
										local1180.anObjectArray16 = local2165;
									} else if (local223 == 1425) {
										local1180.anObjectArray18 = local2165;
									} else if (local223 == 1426) {
										local1180.anObjectArray13 = local2165;
									} else if (local223 == 1427) {
										local1180.anObjectArray19 = local2165;
									} else if (local223 == 1428) {
										local1180.anIntArray395 = local2109;
										local1180.anObjectArray26 = local2165;
									} else if (local223 == 1429) {
										local1180.anIntArray391 = local2109;
										local1180.anObjectArray6 = local2165;
									}
									local1180.aBoolean227 = true;
									continue;
								}
								if (local223 < 1600) {
									local1180 = local1024 ? Static299.aClass116_19 : Static260.aClass116_17;
									if (local223 == 1500) {
										Static222.anIntArray512[local28++] = local1180.anInt4366;
										continue;
									}
									if (local223 == 1501) {
										Static222.anIntArray512[local28++] = local1180.anInt4371;
										continue;
									}
									if (local223 == 1502) {
										Static222.anIntArray512[local28++] = local1180.anInt4299;
										continue;
									}
									if (local223 == 1503) {
										Static222.anIntArray512[local28++] = local1180.anInt4363;
										continue;
									}
									if (local223 == 1504) {
										Static222.anIntArray512[local28++] = local1180.aBoolean228 ? 1 : 0;
										continue;
									}
									if (local223 == 1505) {
										Static222.anIntArray512[local28++] = local1180.anInt4344;
										continue;
									}
								} else if (local223 < 1700) {
									local1180 = local1024 ? Static299.aClass116_19 : Static260.aClass116_17;
									if (local223 == 1600) {
										Static222.anIntArray512[local28++] = local1180.anInt4303;
										continue;
									}
									if (local223 == 1601) {
										Static222.anIntArray512[local28++] = local1180.anInt4307;
										continue;
									}
									if (local223 == 1602) {
										Static252.aStringArray32[local30++] = local1180.aString127;
										continue;
									}
									if (local223 == 1603) {
										Static222.anIntArray512[local28++] = local1180.anInt4321;
										continue;
									}
									if (local223 == 1604) {
										Static222.anIntArray512[local28++] = local1180.anInt4320;
										continue;
									}
									if (local223 == 1605) {
										Static222.anIntArray512[local28++] = local1180.anInt4291;
										continue;
									}
									if (local223 == 1606) {
										Static222.anIntArray512[local28++] = local1180.anInt4362;
										continue;
									}
									if (local223 == 1607) {
										Static222.anIntArray512[local28++] = local1180.anInt4330;
										continue;
									}
									if (local223 == 1608) {
										Static222.anIntArray512[local28++] = local1180.anInt4361;
										continue;
									}
									if (local223 == 1609) {
										Static222.anIntArray512[local28++] = local1180.anInt4323;
										continue;
									}
									if (local223 == 1610) {
										Static222.anIntArray512[local28++] = local1180.anInt4350;
										continue;
									}
									if (local223 == 1611) {
										Static222.anIntArray512[local28++] = local1180.anInt4331;
										continue;
									}
									if (local223 == 1612) {
										Static222.anIntArray512[local28++] = local1180.anInt4308;
										continue;
									}
								} else if (local223 < 1800) {
									local1180 = local1024 ? Static299.aClass116_19 : Static260.aClass116_17;
									if (local223 == 1700) {
										Static222.anIntArray512[local28++] = local1180.anInt4356;
										continue;
									}
									if (local223 == 1701) {
										if (local1180.anInt4356 == -1) {
											Static222.anIntArray512[local28++] = 0;
										} else {
											Static222.anIntArray512[local28++] = local1180.anInt4338;
										}
										continue;
									}
									if (local223 == 1702) {
										Static222.anIntArray512[local28++] = local1180.anInt4297;
										continue;
									}
								} else if (local223 < 1900) {
									local1180 = local1024 ? Static299.aClass116_19 : Static260.aClass116_17;
									if (local223 == 1800) {
										Static222.anIntArray512[local28++] = Static37.method866(local1180).method1106();
										continue;
									}
									if (local223 == 1801) {
										local28--;
										local814 = Static222.anIntArray512[local28];
										local814--;
										if (local1180.aStringArray21 != null && local814 < local1180.aStringArray21.length && local1180.aStringArray21[local814] != null) {
											Static252.aStringArray32[local30++] = local1180.aStringArray21[local814];
											continue;
										}
										Static252.aStringArray32[local30++] = "";
										continue;
									}
									if (local223 == 1802) {
										if (local1180.aString131 == null) {
											Static252.aStringArray32[local30++] = "";
										} else {
											Static252.aStringArray32[local30++] = local1180.aString131;
										}
										continue;
									}
								} else if (local223 < 2600) {
									local28--;
									local1180 = Static115.method1897(Static222.anIntArray512[local28]);
									if (local223 == 2500) {
										Static222.anIntArray512[local28++] = local1180.anInt4366;
										continue;
									}
									if (local223 == 2501) {
										Static222.anIntArray512[local28++] = local1180.anInt4371;
										continue;
									}
									if (local223 == 2502) {
										Static222.anIntArray512[local28++] = local1180.anInt4299;
										continue;
									}
									if (local223 == 2503) {
										Static222.anIntArray512[local28++] = local1180.anInt4363;
										continue;
									}
									if (local223 == 2504) {
										Static222.anIntArray512[local28++] = local1180.aBoolean228 ? 1 : 0;
										continue;
									}
									if (local223 == 2505) {
										Static222.anIntArray512[local28++] = local1180.anInt4344;
										continue;
									}
								} else if (local223 < 2700) {
									local28--;
									local1180 = Static115.method1897(Static222.anIntArray512[local28]);
									if (local223 == 2600) {
										Static222.anIntArray512[local28++] = local1180.anInt4303;
										continue;
									}
									if (local223 == 2601) {
										Static222.anIntArray512[local28++] = local1180.anInt4307;
										continue;
									}
									if (local223 == 2602) {
										Static252.aStringArray32[local30++] = local1180.aString127;
										continue;
									}
									if (local223 == 2603) {
										Static222.anIntArray512[local28++] = local1180.anInt4321;
										continue;
									}
									if (local223 == 2604) {
										Static222.anIntArray512[local28++] = local1180.anInt4320;
										continue;
									}
									if (local223 == 2605) {
										Static222.anIntArray512[local28++] = local1180.anInt4291;
										continue;
									}
									if (local223 == 2606) {
										Static222.anIntArray512[local28++] = local1180.anInt4362;
										continue;
									}
									if (local223 == 2607) {
										Static222.anIntArray512[local28++] = local1180.anInt4330;
										continue;
									}
									if (local223 == 2608) {
										Static222.anIntArray512[local28++] = local1180.anInt4361;
										continue;
									}
									if (local223 == 2609) {
										Static222.anIntArray512[local28++] = local1180.anInt4323;
										continue;
									}
									if (local223 == 2610) {
										Static222.anIntArray512[local28++] = local1180.anInt4350;
										continue;
									}
									if (local223 == 2611) {
										Static222.anIntArray512[local28++] = local1180.anInt4331;
										continue;
									}
									if (local223 == 2612) {
										Static222.anIntArray512[local28++] = local1180.anInt4308;
										continue;
									}
								} else if (local223 < 2800) {
									if (local223 == 2700) {
										local28--;
										local1180 = Static115.method1897(Static222.anIntArray512[local28]);
										Static222.anIntArray512[local28++] = local1180.anInt4356;
										continue;
									}
									if (local223 == 2701) {
										local28--;
										local1180 = Static115.method1897(Static222.anIntArray512[local28]);
										if (local1180.anInt4356 == -1) {
											Static222.anIntArray512[local28++] = 0;
										} else {
											Static222.anIntArray512[local28++] = local1180.anInt4338;
										}
										continue;
									}
									if (local223 == 2702) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										@Pc(13384) Class1_Sub12 local13384 = (Class1_Sub12) Static147.aClass117_12.method3438((long) local820);
										if (local13384 == null) {
											Static222.anIntArray512[local28++] = 0;
										} else {
											Static222.anIntArray512[local28++] = 1;
										}
										continue;
									}
									if (local223 == 2703) {
										local28--;
										local1180 = Static115.method1897(Static222.anIntArray512[local28]);
										if (local1180.aClass116Array1 == null) {
											Static222.anIntArray512[local28++] = 0;
											continue;
										}
										local814 = local1180.aClass116Array1.length;
										for (local1053 = 0; local1053 < local1180.aClass116Array1.length; local1053++) {
											if (local1180.aClass116Array1[local1053] == null) {
												local814 = local1053;
												break;
											}
										}
										Static222.anIntArray512[local28++] = local814;
										continue;
									}
									if (local223 == 2704 || local223 == 2705) {
										local28 -= 2;
										local820 = Static222.anIntArray512[local28];
										local814 = Static222.anIntArray512[local28 + 1];
										@Pc(13481) Class1_Sub12 local13481 = (Class1_Sub12) Static147.aClass117_12.method3438((long) local820);
										if (local13481 != null && local13481.anInt2230 == local814) {
											Static222.anIntArray512[local28++] = 1;
											continue;
										}
										Static222.anIntArray512[local28++] = 0;
										continue;
									}
								} else if (local223 < 2900) {
									local28--;
									local1180 = Static115.method1897(Static222.anIntArray512[local28]);
									if (local223 == 2800) {
										Static222.anIntArray512[local28++] = Static37.method866(local1180).method1106();
										continue;
									}
									if (local223 == 2801) {
										local28--;
										local814 = Static222.anIntArray512[local28];
										local814--;
										if (local1180.aStringArray21 != null && local1180.aStringArray21.length > local814 && local1180.aStringArray21[local814] != null) {
											Static252.aStringArray32[local30++] = local1180.aStringArray21[local814];
											continue;
										}
										Static252.aStringArray32[local30++] = "";
										continue;
									}
									if (local223 == 2802) {
										if (local1180.aString131 == null) {
											Static252.aStringArray32[local30++] = "";
										} else {
											Static252.aStringArray32[local30++] = local1180.aString131;
										}
										continue;
									}
								} else if (local223 < 3200) {
									if (local223 == 3100) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										Static89.method1540(0, "", local607);
										continue;
									}
									if (local223 == 3101) {
										local28 -= 2;
										Static182.method3512(Static222.anIntArray512[local28 + 1], Static239.aClass25_Sub1_Sub1_2, Static222.anIntArray512[local28]);
										continue;
									}
									if (local223 == 3103) {
										Static32.method665();
										continue;
									}
									if (local223 == 3104) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										local814 = 0;
										if (Static259.method4401(local607)) {
											local814 = Static267.method2723(local607);
										}
										Static81.aClass1_Sub16_Sub1_1.method2676(154);
										Static81.aClass1_Sub16_Sub1_1.method2606(local814);
										continue;
									}
									if (local223 == 3105) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										Static81.aClass1_Sub16_Sub1_1.method2676(165);
										Static81.aClass1_Sub16_Sub1_1.method2631(Static94.method4774(local607));
										continue;
									}
									if (local223 == 3106) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										Static81.aClass1_Sub16_Sub1_1.method2676(196);
										Static81.aClass1_Sub16_Sub1_1.method2621(local607.length() + 1);
										Static81.aClass1_Sub16_Sub1_1.method2630(local607);
										continue;
									}
									if (local223 == 3107) {
										local30--;
										local2107 = Static252.aStringArray32[local30];
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static299.method4858(local820, local2107);
										continue;
									}
									if (local223 == 3108) {
										local28 -= 3;
										local820 = Static222.anIntArray512[local28];
										local1053 = Static222.anIntArray512[local28 + 2];
										local814 = Static222.anIntArray512[local28 + 1];
										local13263 = Static115.method1897(local1053);
										Static255.method4318(local820, local13263, local814);
										continue;
									}
									if (local223 == 3109) {
										local28 -= 2;
										local814 = Static222.anIntArray512[local28 + 1];
										local820 = Static222.anIntArray512[local28];
										local13291 = local1024 ? Static299.aClass116_19 : Static260.aClass116_17;
										Static255.method4318(local820, local13291, local814);
										continue;
									}
									if (local223 == 3110) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static81.aClass1_Sub16_Sub1_1.method2676(230);
										Static81.aClass1_Sub16_Sub1_1.method2624(local820);
										continue;
									}
								} else if (local223 < 3300) {
									if (local223 == 3200) {
										local28 -= 3;
										Static159.method2999(Static222.anIntArray512[local28], Static222.anIntArray512[local28 + 1], 255, Static222.anIntArray512[local28 + 2]);
										continue;
									}
									if (local223 == 3201) {
										local28--;
										Static101.method2283(255, Static222.anIntArray512[local28]);
										continue;
									}
									if (local223 == 3202) {
										local28 -= 2;
										Static250.method1412(255, Static222.anIntArray512[local28], Static222.anIntArray512[local28 + 1]);
										continue;
									}
								} else if (local223 < 3400) {
									if (local223 == 3300) {
										Static222.anIntArray512[local28++] = Static32.anInt809;
										continue;
									}
									if (local223 == 3301) {
										local28 -= 2;
										local814 = Static222.anIntArray512[local28 + 1];
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static64.method1245(local814, local820);
										continue;
									}
									if (local223 == 3302) {
										local28 -= 2;
										local814 = Static222.anIntArray512[local28 + 1];
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static133.method2293(local820, local814);
										continue;
									}
									if (local223 == 3303) {
										local28 -= 2;
										local814 = Static222.anIntArray512[local28 + 1];
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static165.method3075(local820, local814);
										continue;
									}
									if (local223 == 3304) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static91.method1595(local820).anInt777;
										continue;
									}
									if (local223 == 3305) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static291.anIntArray607[local820];
										continue;
									}
									if (local223 == 3306) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static240.anIntArray544[local820];
										continue;
									}
									if (local223 == 3307) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static25.anIntArray53[local820];
										continue;
									}
									if (local223 == 3308) {
										local820 = Static145.anInt3477;
										local814 = (Static239.aClass25_Sub1_Sub1_2.anInt1635 >> 7) + Static82.anInt1972;
										local1053 = (Static239.aClass25_Sub1_Sub1_2.anInt1604 >> 7) + Static266.anInt5790;
										Static222.anIntArray512[local28++] = (local814 << 14) + ((local820 << 28) + local1053);
										continue;
									}
									if (local223 == 3309) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = local820 >> 14 & 0x3FFF;
										continue;
									}
									if (local223 == 3310) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = local820 >> 28;
										continue;
									}
									if (local223 == 3311) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = local820 & 0x3FFF;
										continue;
									}
									if (local223 == 3312) {
										Static222.anIntArray512[local28++] = Static251.aBoolean291 ? 1 : 0;
										continue;
									}
									if (local223 == 3313) {
										local28 -= 2;
										local820 = Static222.anIntArray512[local28] + 32768;
										local814 = Static222.anIntArray512[local28 + 1];
										Static222.anIntArray512[local28++] = Static64.method1245(local814, local820);
										continue;
									}
									if (local223 == 3314) {
										local28 -= 2;
										local814 = Static222.anIntArray512[local28 + 1];
										local820 = Static222.anIntArray512[local28] + 32768;
										Static222.anIntArray512[local28++] = Static133.method2293(local820, local814);
										continue;
									}
									if (local223 == 3315) {
										local28 -= 2;
										local814 = Static222.anIntArray512[local28 + 1];
										local820 = Static222.anIntArray512[local28] + 32768;
										Static222.anIntArray512[local28++] = Static165.method3075(local820, local814);
										continue;
									}
									if (local223 == 3316) {
										if (Static76.anInt5428 >= 2) {
											Static222.anIntArray512[local28++] = Static76.anInt5428;
										} else {
											Static222.anIntArray512[local28++] = 0;
										}
										continue;
									}
									if (local223 == 3317) {
										Static222.anIntArray512[local28++] = Static59.anInt1532;
										continue;
									}
									if (local223 == 3318) {
										Static222.anIntArray512[local28++] = Static113.anInt2454;
										continue;
									}
									if (local223 == 3321) {
										Static222.anIntArray512[local28++] = Static254.anInt5401;
										continue;
									}
									if (local223 == 3322) {
										Static222.anIntArray512[local28++] = Static202.anInt4505;
										continue;
									}
									if (local223 == 3323) {
										if (Static206.anInt4570 >= 5 && Static206.anInt4570 <= 9) {
											Static222.anIntArray512[local28++] = 1;
											continue;
										}
										Static222.anIntArray512[local28++] = 0;
										continue;
									}
									if (local223 == 3324) {
										if (Static206.anInt4570 >= 5 && Static206.anInt4570 <= 9) {
											Static222.anIntArray512[local28++] = Static206.anInt4570;
											continue;
										}
										Static222.anIntArray512[local28++] = 0;
										continue;
									}
									if (local223 == 3325) {
										Static222.anIntArray512[local28++] = Static97.aBoolean323 ? 1 : 0;
										continue;
									}
									if (local223 == 3326) {
										Static222.anIntArray512[local28++] = Static239.aClass25_Sub1_Sub1_2.anInt715;
										continue;
									}
									if (local223 == 3327) {
										Static222.anIntArray512[local28++] = Static239.aClass25_Sub1_Sub1_2.aClass147_2.aBoolean287 ? 1 : 0;
										continue;
									}
									if (local223 == 3328) {
										Static222.anIntArray512[local28++] = Static19.aBoolean25 && !Static291.aBoolean326 ? 1 : 0;
										continue;
									}
									if (local223 == 3329) {
										Static222.anIntArray512[local28++] = Static144.aBoolean171 ? 1 : 0;
										continue;
									}
									if (local223 == 3330) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static241.method4159(local820);
										continue;
									}
									if (local223 == 3331) {
										local28 -= 2;
										local820 = Static222.anIntArray512[local28];
										local814 = Static222.anIntArray512[local28 + 1];
										Static222.anIntArray512[local28++] = Static104.method834(local814, false, local820);
										continue;
									}
									if (local223 == 3332) {
										local28 -= 2;
										local820 = Static222.anIntArray512[local28];
										local814 = Static222.anIntArray512[local28 + 1];
										Static222.anIntArray512[local28++] = Static104.method834(local814, true, local820);
										continue;
									}
									if (local223 == 3333) {
										Static222.anIntArray512[local28++] = Static126.anInt2810;
										continue;
									}
									if (local223 == 3335) {
										Static222.anIntArray512[local28++] = Static244.anInt5333;
										continue;
									}
									if (local223 == 3336) {
										local28 -= 4;
										local820 = Static222.anIntArray512[local28];
										local814 = Static222.anIntArray512[local28 + 1];
										local653 = Static222.anIntArray512[local28 + 3];
										local1053 = Static222.anIntArray512[local28 + 2];
										local820 += local814 << 14;
										local820 += local1053 << 28;
										local820 += local653;
										Static222.anIntArray512[local28++] = local820;
										continue;
									}
									if (local223 == 3337) {
										Static222.anIntArray512[local28++] = Static178.anInt4015;
										continue;
									}
								} else if (local223 < 3500) {
									@Pc(12132) Class1_Sub2_Sub18 local12132;
									if (local223 == 3400) {
										local28 -= 2;
										local814 = Static222.anIntArray512[local28 + 1];
										local820 = Static222.anIntArray512[local28];
										local12132 = Static11.method2227(local820);
										if (local12132.aChar3 != 's') {
										}
										Static252.aStringArray32[local30++] = local12132.method4150(local814);
										continue;
									}
									if (local223 == 3408) {
										local28 -= 4;
										local814 = Static222.anIntArray512[local28 + 1];
										local820 = Static222.anIntArray512[local28];
										local1053 = Static222.anIntArray512[local28 + 2];
										local653 = Static222.anIntArray512[local28 + 3];
										@Pc(12180) Class1_Sub2_Sub18 local12180 = Static11.method2227(local1053);
										if (local820 == local12180.aChar2 && local12180.aChar3 == local814) {
											if (local814 == 115) {
												Static252.aStringArray32[local30++] = local12180.method4150(local653);
											} else {
												Static222.anIntArray512[local28++] = local12180.method4154(local653);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local223 == 3409) {
										local28 -= 3;
										local1053 = Static222.anIntArray512[local28 + 2];
										local814 = Static222.anIntArray512[local28 + 1];
										local820 = Static222.anIntArray512[local28];
										if (local814 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(12259) Class1_Sub2_Sub18 local12259 = Static11.method2227(local814);
										if (local820 != local12259.aChar3) {
											throw new RuntimeException("C3409-1");
										}
										Static222.anIntArray512[local28++] = local12259.method4146(local1053) ? 1 : 0;
										continue;
									}
									if (local223 == 3410) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										local30--;
										local2107 = Static252.aStringArray32[local30];
										if (local820 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local12132 = Static11.method2227(local820);
										if (local12132.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										Static222.anIntArray512[local28++] = local12132.method4151(local2107) ? 1 : 0;
										continue;
									}
									if (local223 == 3411) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										@Pc(12351) Class1_Sub2_Sub18 local12351 = Static11.method2227(local820);
										Static222.anIntArray512[local28++] = local12351.aClass117_19.method3439();
										continue;
									}
								} else if (local223 < 3700) {
									if (local223 == 3600) {
										if (Static218.anInt4881 == 0) {
											Static222.anIntArray512[local28++] = -2;
										} else if (Static218.anInt4881 == 1) {
											Static222.anIntArray512[local28++] = -1;
										} else {
											Static222.anIntArray512[local28++] = Static180.anInt4068;
										}
										continue;
									}
									if (local223 == 3601) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										if (Static218.anInt4881 == 2 && local820 < Static180.anInt4068) {
											Static252.aStringArray32[local30++] = Static78.aStringArray6[local820];
											continue;
										}
										Static252.aStringArray32[local30++] = "";
										continue;
									}
									if (local223 == 3602) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										if (Static218.anInt4881 == 2 && Static180.anInt4068 > local820) {
											Static222.anIntArray512[local28++] = Static233.anIntArray532[local820];
											continue;
										}
										Static222.anIntArray512[local28++] = 0;
										continue;
									}
									if (local223 == 3603) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										if (Static218.anInt4881 == 2 && Static180.anInt4068 > local820) {
											Static222.anIntArray512[local28++] = Static78.anIntArray197[local820];
											continue;
										}
										Static222.anIntArray512[local28++] = 0;
										continue;
									}
									if (local223 == 3604) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										local28--;
										local814 = Static222.anIntArray512[local28];
										Static62.method1212(local607, local814);
										continue;
									}
									if (local223 == 3605) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										Static52.method1064(Static94.method4774(local607));
										continue;
									}
									if (local223 == 3606) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										Static125.method2132(Static94.method4774(local607));
										continue;
									}
									if (local223 == 3607) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										Static230.method4025(Static94.method4774(local607), false);
										continue;
									}
									if (local223 == 3608) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										Static6.method1714(Static94.method4774(local607));
										continue;
									}
									if (local223 == 3609) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										if (local607.startsWith("<img=0>") || local607.startsWith("<img=1>")) {
											local607 = local607.substring(7);
										}
										Static222.anIntArray512[local28++] = Static141.method2525(local607) ? 1 : 0;
										continue;
									}
									if (local223 == 3610) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										if (Static218.anInt4881 == 2 && Static180.anInt4068 > local820) {
											Static252.aStringArray32[local30++] = Static84.aStringArray8[local820];
											continue;
										}
										Static252.aStringArray32[local30++] = "";
										continue;
									}
									if (local223 == 3611) {
										if (Static43.aString43 == null) {
											Static252.aStringArray32[local30++] = "";
										} else {
											Static252.aStringArray32[local30++] = Static25.method417(Static43.aString43);
										}
										continue;
									}
									if (local223 == 3612) {
										if (Static43.aString43 == null) {
											Static222.anIntArray512[local28++] = 0;
										} else {
											Static222.anIntArray512[local28++] = Static246.anInt5378;
										}
										continue;
									}
									if (local223 == 3613) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										if (Static43.aString43 != null && local820 < Static246.anInt5378) {
											Static252.aStringArray32[local30++] = Static25.method417(Static79.aClass1_Sub29Array1[local820].aString157);
											continue;
										}
										Static252.aStringArray32[local30++] = "";
										continue;
									}
									if (local223 == 3614) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										if (Static43.aString43 != null && Static246.anInt5378 > local820) {
											Static222.anIntArray512[local28++] = Static79.aClass1_Sub29Array1[local820].anInt4975;
											continue;
										}
										Static222.anIntArray512[local28++] = 0;
										continue;
									}
									if (local223 == 3615) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										if (Static43.aString43 != null && local820 < Static246.anInt5378) {
											Static222.anIntArray512[local28++] = Static79.aClass1_Sub29Array1[local820].aByte21;
											continue;
										}
										Static222.anIntArray512[local28++] = 0;
										continue;
									}
									if (local223 == 3616) {
										Static222.anIntArray512[local28++] = Static88.aByte10;
										continue;
									}
									if (local223 == 3617) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										Static73.method1364(local607);
										continue;
									}
									if (local223 == 3618) {
										Static222.anIntArray512[local28++] = Static48.aByte6;
										continue;
									}
									if (local223 == 3619) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										Static132.method2275(Static94.method4774(local607));
										continue;
									}
									if (local223 == 3620) {
										Static279.method4632();
										continue;
									}
									if (local223 == 3621) {
										if (Static218.anInt4881 == 0) {
											Static222.anIntArray512[local28++] = -1;
										} else {
											Static222.anIntArray512[local28++] = Static253.anInt5514;
										}
										continue;
									}
									if (local223 == 3622) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										if (Static218.anInt4881 != 0 && local820 < Static253.anInt5514) {
											Static252.aStringArray32[local30++] = Static173.method3185(Static3.aLongArray1[local820]);
											continue;
										}
										Static252.aStringArray32[local30++] = "";
										continue;
									}
									if (local223 == 3623) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										if (local607.startsWith("<img=0>") || local607.startsWith("<img=1>")) {
											local607 = local607.substring(7);
										}
										Static222.anIntArray512[local28++] = Static279.method4633(local607) ? 1 : 0;
										continue;
									}
									if (local223 == 3624) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										if (Static79.aClass1_Sub29Array1 != null && Static246.anInt5378 > local820 && Static79.aClass1_Sub29Array1[local820].aString157.equalsIgnoreCase(Static239.aClass25_Sub1_Sub1_2.aString26)) {
											Static222.anIntArray512[local28++] = 1;
											continue;
										}
										Static222.anIntArray512[local28++] = 0;
										continue;
									}
									if (local223 == 3625) {
										if (Static6.aString74 == null) {
											Static252.aStringArray32[local30++] = "";
										} else {
											Static252.aStringArray32[local30++] = Static25.method417(Static6.aString74);
										}
										continue;
									}
									if (local223 == 3626) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										if (Static43.aString43 != null && local820 < Static246.anInt5378) {
											Static252.aStringArray32[local30++] = Static79.aClass1_Sub29Array1[local820].aString156;
											continue;
										}
										Static252.aStringArray32[local30++] = "";
										continue;
									}
									if (local223 == 3627) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										if (Static218.anInt4881 == 2 && local820 >= 0 && local820 < Static180.anInt4068) {
											Static222.anIntArray512[local28++] = Static225.aBooleanArray21[local820] ? 1 : 0;
											continue;
										}
										Static222.anIntArray512[local28++] = 0;
										continue;
									}
									if (local223 == 3628) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										if (local607.startsWith("<img=0>") || local607.startsWith("<img=1>")) {
											local607 = local607.substring(7);
										}
										Static222.anIntArray512[local28++] = Static11.method2231(local607);
										continue;
									}
									if (local223 == 3629) {
										Static222.anIntArray512[local28++] = Static88.anInt2055;
										continue;
									}
									if (local223 == 3630) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										Static230.method4025(Static94.method4774(local607), true);
										continue;
									}
									if (local223 == 3631) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static56.aBooleanArray4[local820] ? 1 : 0;
										continue;
									}
								} else if (local223 < 4000) {
									if (local223 == 3903) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static136.aClass15Array1[local820].method314();
										continue;
									}
									if (local223 == 3904) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static136.aClass15Array1[local820].anInt383;
										continue;
									}
									if (local223 == 3905) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static136.aClass15Array1[local820].anInt389;
										continue;
									}
									if (local223 == 3906) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static136.aClass15Array1[local820].anInt382;
										continue;
									}
									if (local223 == 3907) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static136.aClass15Array1[local820].anInt381;
										continue;
									}
									if (local223 == 3908) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static136.aClass15Array1[local820].anInt376;
										continue;
									}
									if (local223 == 3910) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										local814 = Static136.aClass15Array1[local820].method311();
										Static222.anIntArray512[local28++] = local814 == 0 ? 1 : 0;
										continue;
									}
									if (local223 == 3911) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										local814 = Static136.aClass15Array1[local820].method311();
										Static222.anIntArray512[local28++] = local814 == 2 ? 1 : 0;
										continue;
									}
									if (local223 == 3912) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										local814 = Static136.aClass15Array1[local820].method311();
										Static222.anIntArray512[local28++] = local814 == 5 ? 1 : 0;
										continue;
									}
									if (local223 == 3913) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										local814 = Static136.aClass15Array1[local820].method311();
										Static222.anIntArray512[local28++] = local814 == 1 ? 1 : 0;
										continue;
									}
								} else if (local223 < 4100) {
									if (local223 == 4000) {
										local28 -= 2;
										local820 = Static222.anIntArray512[local28];
										local814 = Static222.anIntArray512[local28 + 1];
										Static222.anIntArray512[local28++] = local820 + local814;
										continue;
									}
									if (local223 == 4001) {
										local28 -= 2;
										local820 = Static222.anIntArray512[local28];
										local814 = Static222.anIntArray512[local28 + 1];
										Static222.anIntArray512[local28++] = local820 - local814;
										continue;
									}
									if (local223 == 4002) {
										local28 -= 2;
										local820 = Static222.anIntArray512[local28];
										local814 = Static222.anIntArray512[local28 + 1];
										Static222.anIntArray512[local28++] = local814 * local820;
										continue;
									}
									if (local223 == 4003) {
										local28 -= 2;
										local820 = Static222.anIntArray512[local28];
										local814 = Static222.anIntArray512[local28 + 1];
										Static222.anIntArray512[local28++] = local820 / local814;
										continue;
									}
									if (local223 == 4004) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = (int) ((double) local820 * Math.random());
										continue;
									}
									if (local223 == 4005) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = (int) (Math.random() * (double) (local820 + 1));
										continue;
									}
									if (local223 == 4006) {
										local28 -= 5;
										local814 = Static222.anIntArray512[local28 + 1];
										local653 = Static222.anIntArray512[local28 + 3];
										local820 = Static222.anIntArray512[local28];
										local2170 = Static222.anIntArray512[local28 + 4];
										local1053 = Static222.anIntArray512[local28 + 2];
										Static222.anIntArray512[local28++] = (local814 - local820) * (local2170 - local1053) / (local653 - local1053) + local820;
										continue;
									}
									@Pc(3990) long local3990;
									@Pc(3983) long local3983;
									if (local223 == 4007) {
										local28 -= 2;
										local3983 = Static222.anIntArray512[local28];
										local3990 = Static222.anIntArray512[local28 + 1];
										Static222.anIntArray512[local28++] = (int) (local3990 * local3983 / 100L + local3983);
										continue;
									}
									if (local223 == 4008) {
										local28 -= 2;
										local820 = Static222.anIntArray512[local28];
										local814 = Static222.anIntArray512[local28 + 1];
										Static222.anIntArray512[local28++] = local820 | 0x1 << local814;
										continue;
									}
									if (local223 == 4009) {
										local28 -= 2;
										local814 = Static222.anIntArray512[local28 + 1];
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = -(0x1 << local814) - 1 & local820;
										continue;
									}
									if (local223 == 4010) {
										local28 -= 2;
										local820 = Static222.anIntArray512[local28];
										local814 = Static222.anIntArray512[local28 + 1];
										Static222.anIntArray512[local28++] = (local820 & 0x1 << local814) == 0 ? 0 : 1;
										continue;
									}
									if (local223 == 4011) {
										local28 -= 2;
										local814 = Static222.anIntArray512[local28 + 1];
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = local820 % local814;
										continue;
									}
									if (local223 == 4012) {
										local28 -= 2;
										local820 = Static222.anIntArray512[local28];
										local814 = Static222.anIntArray512[local28 + 1];
										if (local820 == 0) {
											Static222.anIntArray512[local28++] = 0;
										} else {
											Static222.anIntArray512[local28++] = (int) Math.pow((double) local820, (double) local814);
										}
										continue;
									}
									if (local223 == 4013) {
										local28 -= 2;
										local820 = Static222.anIntArray512[local28];
										local814 = Static222.anIntArray512[local28 + 1];
										if (local820 == 0) {
											Static222.anIntArray512[local28++] = 0;
										} else if (local814 == 0) {
											Static222.anIntArray512[local28++] = Integer.MAX_VALUE;
										} else {
											Static222.anIntArray512[local28++] = (int) Math.pow((double) local820, 1.0D / (double) local814);
										}
										continue;
									}
									if (local223 == 4014) {
										local28 -= 2;
										local820 = Static222.anIntArray512[local28];
										local814 = Static222.anIntArray512[local28 + 1];
										Static222.anIntArray512[local28++] = local820 & local814;
										continue;
									}
									if (local223 == 4015) {
										local28 -= 2;
										local820 = Static222.anIntArray512[local28];
										local814 = Static222.anIntArray512[local28 + 1];
										Static222.anIntArray512[local28++] = local820 | local814;
										continue;
									}
									if (local223 == 4016) {
										local28 -= 2;
										local814 = Static222.anIntArray512[local28 + 1];
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = local814 > local820 ? local820 : local814;
										continue;
									}
									if (local223 == 4017) {
										local28 -= 2;
										local820 = Static222.anIntArray512[local28];
										local814 = Static222.anIntArray512[local28 + 1];
										Static222.anIntArray512[local28++] = local814 < local820 ? local820 : local814;
										continue;
									}
									if (local223 == 4018) {
										local28 -= 3;
										local3983 = Static222.anIntArray512[local28];
										@Pc(4328) long local4328 = (long) Static222.anIntArray512[local28 + 2];
										local3990 = Static222.anIntArray512[local28 + 1];
										Static222.anIntArray512[local28++] = (int) (local3983 * local4328 / local3990);
										continue;
									}
								} else if (local223 < 4200) {
									if (local223 == 4100) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										local28--;
										local814 = Static222.anIntArray512[local28];
										Static252.aStringArray32[local30++] = local607 + local814;
										continue;
									}
									if (local223 == 4101) {
										local30 -= 2;
										local2107 = Static252.aStringArray32[local30 + 1];
										local607 = Static252.aStringArray32[local30];
										Static252.aStringArray32[local30++] = local607 + local2107;
										continue;
									}
									if (local223 == 4102) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										local28--;
										local814 = Static222.anIntArray512[local28];
										Static252.aStringArray32[local30++] = local607 + Static119.method1959(local814);
										continue;
									}
									if (local223 == 4103) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										Static252.aStringArray32[local30++] = local607.toLowerCase();
										continue;
									}
									if (local223 == 4104) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										@Pc(4476) long local4476 = (long) local820 * 86400000L + 1014768000000L;
										Static188.aCalendar2.setTime(new Date(local4476));
										local653 = Static188.aCalendar2.get(5);
										local2170 = Static188.aCalendar2.get(2);
										local4494 = Static188.aCalendar2.get(1);
										Static252.aStringArray32[local30++] = local653 + "-" + Static209.aStringArray23[local2170] + "-" + local4494;
										continue;
									}
									if (local223 == 4105) {
										local30 -= 2;
										local607 = Static252.aStringArray32[local30];
										local2107 = Static252.aStringArray32[local30 + 1];
										if (Static239.aClass25_Sub1_Sub1_2.aClass147_2 != null && Static239.aClass25_Sub1_Sub1_2.aClass147_2.aBoolean287) {
											Static252.aStringArray32[local30++] = local2107;
											continue;
										}
										Static252.aStringArray32[local30++] = local607;
										continue;
									}
									if (local223 == 4106) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static252.aStringArray32[local30++] = Integer.toString(local820);
										continue;
									}
									if (local223 == 4107) {
										local30 -= 2;
										Static222.anIntArray512[local28++] = Static229.method4005(Static82.method1469(Static252.aStringArray32[local30], Static244.anInt5333, Static252.aStringArray32[local30 + 1]));
										continue;
									}
									if (local223 == 4108) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										local28 -= 2;
										local1053 = Static222.anIntArray512[local28 + 1];
										local814 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static68.method1302(local1053).method3968(local607, local814);
										continue;
									}
									if (local223 == 4109) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										local28 -= 2;
										local814 = Static222.anIntArray512[local28];
										local1053 = Static222.anIntArray512[local28 + 1];
										Static222.anIntArray512[local28++] = Static68.method1302(local1053).method3967(local607, local814);
										continue;
									}
									if (local223 == 4110) {
										local30 -= 2;
										local607 = Static252.aStringArray32[local30];
										local2107 = Static252.aStringArray32[local30 + 1];
										local28--;
										if (Static222.anIntArray512[local28] == 1) {
											Static252.aStringArray32[local30++] = local607;
										} else {
											Static252.aStringArray32[local30++] = local2107;
										}
										continue;
									}
									if (local223 == 4111) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										Static252.aStringArray32[local30++] = Static168.method3970(local607);
										continue;
									}
									if (local223 == 4112) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										local28--;
										local814 = Static222.anIntArray512[local28];
										if (local814 == -1) {
											throw new RuntimeException("null char");
										}
										Static252.aStringArray32[local30++] = local607 + (char) local814;
										continue;
									}
									if (local223 == 4113) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static119.method1960((char) local820) ? 1 : 0;
										continue;
									}
									if (local223 == 4114) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static254.method4240((char) local820) ? 1 : 0;
										continue;
									}
									if (local223 == 4115) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static138.method2381((char) local820) ? 1 : 0;
										continue;
									}
									if (local223 == 4116) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Static36.method804((char) local820) ? 1 : 0;
										continue;
									}
									if (local223 == 4117) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										if (local607 == null) {
											Static222.anIntArray512[local28++] = 0;
										} else {
											Static222.anIntArray512[local28++] = local607.length();
										}
										continue;
									}
									if (local223 == 4118) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										local28 -= 2;
										local1053 = Static222.anIntArray512[local28 + 1];
										local814 = Static222.anIntArray512[local28];
										Static252.aStringArray32[local30++] = local607.substring(local814, local1053);
										continue;
									}
									if (local223 == 4119) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										@Pc(4923) StringBuffer local4923 = new StringBuffer(local607.length());
										@Pc(4925) boolean local4925 = false;
										for (local653 = 0; local607.length() > local653; local653++) {
											@Pc(4935) char local4935 = local607.charAt(local653);
											if (local4935 == '<') {
												local4925 = true;
											} else if (local4935 == '>') {
												local4925 = false;
											} else if (!local4925) {
												local4923.append(local4935);
											}
										}
										Static252.aStringArray32[local30++] = local4923.toString();
										continue;
									}
									if (local223 == 4120) {
										local30--;
										local607 = Static252.aStringArray32[local30];
										local28 -= 2;
										local1053 = Static222.anIntArray512[local28 + 1];
										local814 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = local607.indexOf(local814, local1053);
										continue;
									}
									if (local223 == 4121) {
										local30 -= 2;
										local607 = Static252.aStringArray32[local30];
										local28--;
										local1053 = Static222.anIntArray512[local28];
										local2107 = Static252.aStringArray32[local30 + 1];
										Static222.anIntArray512[local28++] = local607.indexOf(local2107, local1053);
										continue;
									}
									if (local223 == 4122) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Character.toLowerCase((char) local820);
										continue;
									}
									if (local223 == 4123) {
										local28--;
										local820 = Static222.anIntArray512[local28];
										Static222.anIntArray512[local28++] = Character.toUpperCase((char) local820);
										continue;
									}
									if (local223 == 4124) {
										local28--;
										local1144 = Static222.anIntArray512[local28] != 0;
										local28--;
										local814 = Static222.anIntArray512[local28];
										Static252.aStringArray32[local30++] = Static173.method3186(0, (long) local814, Static244.anInt5333, local1144);
										continue;
									}
								} else {
									@Pc(5393) Class1_Sub2_Sub19 local5393;
									if (local223 < 4300) {
										if (local223 == 4200) {
											local28--;
											local820 = Static222.anIntArray512[local28];
											Static252.aStringArray32[local30++] = Static238.method4099(local820).aString159;
											continue;
										}
										@Pc(5138) Class138 local5138;
										if (local223 == 4201) {
											local28 -= 2;
											local814 = Static222.anIntArray512[local28 + 1];
											local820 = Static222.anIntArray512[local28];
											local5138 = Static238.method4099(local820);
											if (local814 >= 1 && local814 <= 5 && local5138.aStringArray27[local814 - 1] != null) {
												Static252.aStringArray32[local30++] = local5138.aStringArray27[local814 - 1];
												continue;
											}
											Static252.aStringArray32[local30++] = "";
											continue;
										}
										if (local223 == 4202) {
											local28 -= 2;
											local820 = Static222.anIntArray512[local28];
											local814 = Static222.anIntArray512[local28 + 1];
											local5138 = Static238.method4099(local820);
											if (local814 >= 1 && local814 <= 5 && local5138.aStringArray26[local814 - 1] != null) {
												Static252.aStringArray32[local30++] = local5138.aStringArray26[local814 - 1];
												continue;
											}
											Static252.aStringArray32[local30++] = "";
											continue;
										}
										if (local223 == 4203) {
											local28--;
											local820 = Static222.anIntArray512[local28];
											Static222.anIntArray512[local28++] = Static238.method4099(local820).anInt5061;
											continue;
										}
										if (local223 == 4204) {
											local28--;
											local820 = Static222.anIntArray512[local28];
											Static222.anIntArray512[local28++] = Static238.method4099(local820).anInt5053 == 1 ? 1 : 0;
											continue;
										}
										@Pc(5287) Class138 local5287;
										if (local223 == 4205) {
											local28--;
											local820 = Static222.anIntArray512[local28];
											local5287 = Static238.method4099(local820);
											if (local5287.anInt5028 == -1 && local5287.anInt5059 >= 0) {
												Static222.anIntArray512[local28++] = local5287.anInt5059;
												continue;
											}
											Static222.anIntArray512[local28++] = local820;
											continue;
										}
										if (local223 == 4206) {
											local28--;
											local820 = Static222.anIntArray512[local28];
											local5287 = Static238.method4099(local820);
											if (local5287.anInt5028 >= 0 && local5287.anInt5059 >= 0) {
												Static222.anIntArray512[local28++] = local5287.anInt5059;
												continue;
											}
											Static222.anIntArray512[local28++] = local820;
											continue;
										}
										if (local223 == 4207) {
											local28--;
											local820 = Static222.anIntArray512[local28];
											Static222.anIntArray512[local28++] = Static238.method4099(local820).aBoolean275 ? 1 : 0;
											continue;
										}
										if (local223 == 4208) {
											local28 -= 2;
											local814 = Static222.anIntArray512[local28 + 1];
											local820 = Static222.anIntArray512[local28];
											local5393 = Static114.method1863(local814);
											if (local5393.method4331()) {
												Static252.aStringArray32[local30++] = Static238.method4099(local820).method4006(local814, local5393.aString180);
											} else {
												Static222.anIntArray512[local28++] = Static238.method4099(local820).method4004(local814, local5393.anInt5556);
											}
											continue;
										}
										if (local223 == 4210) {
											local30--;
											local607 = Static252.aStringArray32[local30];
											local28--;
											local814 = Static222.anIntArray512[local28];
											Static114.method1862(local814 == 1, local607);
											Static222.anIntArray512[local28++] = Static20.anInt5566;
											continue;
										}
										if (local223 == 4211) {
											if (Static39.aShortArray27 != null && Static20.anInt5566 > Static87.anInt2030) {
												Static222.anIntArray512[local28++] = Static39.aShortArray27[Static87.anInt2030++] & 0xFFFF;
												continue;
											}
											Static222.anIntArray512[local28++] = -1;
											continue;
										}
										if (local223 == 4212) {
											Static87.anInt2030 = 0;
											continue;
										}
									} else if (local223 < 4400) {
										if (local223 == 4300) {
											local28 -= 2;
											local820 = Static222.anIntArray512[local28];
											local814 = Static222.anIntArray512[local28 + 1];
											local5393 = Static114.method1863(local814);
											if (local5393.method4331()) {
												Static252.aStringArray32[local30++] = Static38.method880(local820).method4069(local5393.aString180, local814);
											} else {
												Static222.anIntArray512[local28++] = Static38.method880(local820).method4073(local5393.anInt5556, local814);
											}
											continue;
										}
									} else if (local223 >= 4500) {
										if (local223 >= 4600) {
											if (local223 < 5100) {
												if (local223 == 5000) {
													Static222.anIntArray512[local28++] = Static133.anInt3019;
													continue;
												}
												if (local223 == 5001) {
													local28 -= 3;
													Static133.anInt3019 = Static222.anIntArray512[local28];
													Static68.anInt1755 = Static222.anIntArray512[local28 + 1];
													Static18.anInt460 = Static222.anIntArray512[local28 + 2];
													Static81.aClass1_Sub16_Sub1_1.method2676(199);
													Static81.aClass1_Sub16_Sub1_1.method2621(Static133.anInt3019);
													Static81.aClass1_Sub16_Sub1_1.method2621(Static68.anInt1755);
													Static81.aClass1_Sub16_Sub1_1.method2621(Static18.anInt460);
													continue;
												}
												if (local223 == 5002) {
													local28 -= 2;
													local814 = Static222.anIntArray512[local28];
													local30--;
													local607 = Static252.aStringArray32[local30];
													local1053 = Static222.anIntArray512[local28 + 1];
													Static81.aClass1_Sub16_Sub1_1.method2676(247);
													Static81.aClass1_Sub16_Sub1_1.method2631(Static94.method4774(local607));
													Static81.aClass1_Sub16_Sub1_1.method2621(local814 - 1);
													Static81.aClass1_Sub16_Sub1_1.method2621(local1053);
													continue;
												}
												if (local223 == 5003) {
													local2107 = null;
													local28--;
													local820 = Static222.anIntArray512[local28];
													if (local820 < 100) {
														local2107 = Static246.aStringArray30[local820];
													}
													if (local2107 == null) {
														local2107 = "";
													}
													Static252.aStringArray32[local30++] = local2107;
													continue;
												}
												if (local223 == 5004) {
													local28--;
													local820 = Static222.anIntArray512[local28];
													local814 = -1;
													if (local820 < 100 && Static246.aStringArray30[local820] != null) {
														local814 = Static62.anIntArray167[local820];
													}
													Static222.anIntArray512[local28++] = local814;
													continue;
												}
												if (local223 == 5005) {
													Static222.anIntArray512[local28++] = Static68.anInt1755;
													continue;
												}
												if (local223 == 5008) {
													local30--;
													local607 = Static252.aStringArray32[local30];
													if (local607.startsWith("::")) {
														Static229.method4012(local607);
														continue;
													}
													if (Static76.anInt5428 == 0 && (Static19.aBoolean25 && !Static291.aBoolean326 || Static144.aBoolean171)) {
														continue;
													}
													local2107 = local607.toLowerCase();
													@Pc(10332) byte local10332 = 0;
													if (local2107.startsWith(Static144.aString98)) {
														local607 = local607.substring(Static144.aString98.length());
														local10332 = 0;
													} else if (local2107.startsWith(Static287.aString197)) {
														local10332 = 1;
														local607 = local607.substring(Static287.aString197.length());
													} else if (local2107.startsWith(Static48.aString45)) {
														local607 = local607.substring(Static48.aString45.length());
														local10332 = 2;
													} else if (local2107.startsWith(Static193.aString134)) {
														local607 = local607.substring(Static193.aString134.length());
														local10332 = 3;
													} else if (local2107.startsWith(Static192.aString126)) {
														local607 = local607.substring(Static192.aString126.length());
														local10332 = 4;
													} else if (local2107.startsWith(Static14.aString11)) {
														local607 = local607.substring(Static14.aString11.length());
														local10332 = 5;
													} else if (local2107.startsWith(Static194.aString135)) {
														local10332 = 6;
														local607 = local607.substring(Static194.aString135.length());
													} else if (local2107.startsWith(Static130.aString81)) {
														local607 = local607.substring(Static130.aString81.length());
														local10332 = 7;
													} else if (local2107.startsWith(Static42.aString42)) {
														local10332 = 8;
														local607 = local607.substring(Static42.aString42.length());
													} else if (local2107.startsWith(Static143.aString95)) {
														local607 = local607.substring(Static143.aString95.length());
														local10332 = 9;
													} else if (local2107.startsWith(Static206.aString147)) {
														local10332 = 10;
														local607 = local607.substring(Static206.aString147.length());
													} else if (local2107.startsWith(Static295.aString89)) {
														local10332 = 11;
														local607 = local607.substring(Static295.aString89.length());
													} else if (Static244.anInt5333 != 0) {
														if (local2107.startsWith(Static143.aString96)) {
															local10332 = 0;
															local607 = local607.substring(Static143.aString96.length());
														} else if (local2107.startsWith(Static190.aString125)) {
															local607 = local607.substring(Static190.aString125.length());
															local10332 = 1;
														} else if (local2107.startsWith(Static257.aString182)) {
															local10332 = 2;
															local607 = local607.substring(Static257.aString182.length());
														} else if (local2107.startsWith(Static39.aString40)) {
															local607 = local607.substring(Static39.aString40.length());
															local10332 = 3;
														} else if (local2107.startsWith(Static255.aString178)) {
															local10332 = 4;
															local607 = local607.substring(Static255.aString178.length());
														} else if (local2107.startsWith(Static31.aString29)) {
															local10332 = 5;
															local607 = local607.substring(Static31.aString29.length());
														} else if (local2107.startsWith(Static156.aString105)) {
															local10332 = 6;
															local607 = local607.substring(Static156.aString105.length());
														} else if (local2107.startsWith(Static295.aString90)) {
															local10332 = 7;
															local607 = local607.substring(Static295.aString90.length());
														} else if (local2107.startsWith(Static285.aString195)) {
															local10332 = 8;
															local607 = local607.substring(Static285.aString195.length());
														} else if (local2107.startsWith(Static194.aString137)) {
															local607 = local607.substring(Static194.aString137.length());
															local10332 = 9;
														} else if (local2107.startsWith(Static171.aString112)) {
															local607 = local607.substring(Static171.aString112.length());
															local10332 = 10;
														} else if (local2107.startsWith(Static4.aString2)) {
															local607 = local607.substring(Static4.aString2.length());
															local10332 = 11;
														}
													}
													@Pc(10651) byte local10651 = 0;
													local2107 = local607.toLowerCase();
													if (local2107.startsWith(Static144.aString97)) {
														local10651 = 1;
														local607 = local607.substring(Static144.aString97.length());
													} else if (local2107.startsWith(Static157.aString106)) {
														local607 = local607.substring(Static157.aString106.length());
														local10651 = 2;
													} else if (local2107.startsWith(Static204.aString143)) {
														local10651 = 3;
														local607 = local607.substring(Static204.aString143.length());
													} else if (local2107.startsWith(Static166.aString110)) {
														local10651 = 4;
														local607 = local607.substring(Static166.aString110.length());
													} else if (local2107.startsWith(Static100.aString185)) {
														local607 = local607.substring(Static100.aString185.length());
														local10651 = 5;
													} else if (Static244.anInt5333 != 0) {
														if (local2107.startsWith(Static36.aString38)) {
															local607 = local607.substring(Static36.aString38.length());
															local10651 = 1;
														} else if (local2107.startsWith(Static160.aString109)) {
															local607 = local607.substring(Static160.aString109.length());
															local10651 = 2;
														} else if (local2107.startsWith(Static147.aString101)) {
															local10651 = 3;
															local607 = local607.substring(Static147.aString101.length());
														} else if (local2107.startsWith(Static256.aString179)) {
															local607 = local607.substring(Static256.aString179.length());
															local10651 = 4;
														} else if (local2107.startsWith(Static181.aString120)) {
															local10651 = 5;
															local607 = local607.substring(Static181.aString120.length());
														}
													}
													Static81.aClass1_Sub16_Sub1_1.method2676(48);
													Static81.aClass1_Sub16_Sub1_1.method2621(0);
													local2170 = Static81.aClass1_Sub16_Sub1_1.anInt3328;
													Static81.aClass1_Sub16_Sub1_1.method2621(local10332);
													Static81.aClass1_Sub16_Sub1_1.method2621(local10651);
													Static232.method4050(Static81.aClass1_Sub16_Sub1_1, local607);
													Static81.aClass1_Sub16_Sub1_1.method2627(Static81.aClass1_Sub16_Sub1_1.anInt3328 - local2170);
													continue;
												}
												if (local223 == 5009) {
													local30 -= 2;
													local2107 = Static252.aStringArray32[local30 + 1];
													local607 = Static252.aStringArray32[local30];
													if (Static76.anInt5428 != 0 || (!Static19.aBoolean25 || Static291.aBoolean326) && !Static144.aBoolean171) {
														Static81.aClass1_Sub16_Sub1_1.method2676(37);
														Static81.aClass1_Sub16_Sub1_1.method2621(0);
														local1053 = Static81.aClass1_Sub16_Sub1_1.anInt3328;
														Static81.aClass1_Sub16_Sub1_1.method2631(Static94.method4774(local607));
														Static232.method4050(Static81.aClass1_Sub16_Sub1_1, local2107);
														Static81.aClass1_Sub16_Sub1_1.method2627(Static81.aClass1_Sub16_Sub1_1.anInt3328 - local1053);
													}
													continue;
												}
												if (local223 == 5010) {
													local28--;
													local820 = Static222.anIntArray512[local28];
													local2107 = null;
													if (local820 < 100) {
														local2107 = Static98.aStringArray9[local820];
													}
													if (local2107 == null) {
														local2107 = "";
													}
													Static252.aStringArray32[local30++] = local2107;
													continue;
												}
												if (local223 == 5011) {
													local2107 = null;
													local28--;
													local820 = Static222.anIntArray512[local28];
													if (local820 < 100) {
														local2107 = Static133.aStringArray15[local820];
													}
													if (local2107 == null) {
														local2107 = "";
													}
													Static252.aStringArray32[local30++] = local2107;
													continue;
												}
												if (local223 == 5012) {
													local814 = -1;
													local28--;
													local820 = Static222.anIntArray512[local28];
													if (local820 < 100) {
														local814 = Static44.anIntArray119[local820];
													}
													Static222.anIntArray512[local28++] = local814;
													continue;
												}
												if (local223 == 5015) {
													if (Static239.aClass25_Sub1_Sub1_2 == null || Static239.aClass25_Sub1_Sub1_2.aString26 == null) {
														local607 = Static37.aString39;
													} else {
														local607 = Static239.aClass25_Sub1_Sub1_2.method498();
													}
													Static252.aStringArray32[local30++] = local607;
													continue;
												}
												if (local223 == 5016) {
													Static222.anIntArray512[local28++] = Static18.anInt460;
													continue;
												}
												if (local223 == 5017) {
													Static222.anIntArray512[local28++] = Static140.anInt3223;
													continue;
												}
												if (local223 == 5050) {
													local28--;
													local820 = Static222.anIntArray512[local28];
													Static252.aStringArray32[local30++] = Static290.method4731(local820).aString56;
													continue;
												}
												@Pc(11055) Class1_Sub2_Sub8 local11055;
												if (local223 == 5051) {
													local28--;
													local820 = Static222.anIntArray512[local28];
													local11055 = Static290.method4731(local820);
													if (local11055.anIntArray208 == null) {
														Static222.anIntArray512[local28++] = 0;
													} else {
														Static222.anIntArray512[local28++] = local11055.anIntArray208.length;
													}
													continue;
												}
												if (local223 == 5052) {
													local28 -= 2;
													local820 = Static222.anIntArray512[local28];
													local814 = Static222.anIntArray512[local28 + 1];
													@Pc(11093) Class1_Sub2_Sub8 local11093 = Static290.method4731(local820);
													local653 = local11093.anIntArray208[local814];
													Static222.anIntArray512[local28++] = local653;
													continue;
												}
												if (local223 == 5053) {
													local28--;
													local820 = Static222.anIntArray512[local28];
													local11055 = Static290.method4731(local820);
													if (local11055.anIntArray207 == null) {
														Static222.anIntArray512[local28++] = 0;
													} else {
														Static222.anIntArray512[local28++] = local11055.anIntArray207.length;
													}
													continue;
												}
												if (local223 == 5054) {
													local28 -= 2;
													local814 = Static222.anIntArray512[local28 + 1];
													local820 = Static222.anIntArray512[local28];
													Static222.anIntArray512[local28++] = Static290.method4731(local820).anIntArray207[local814];
													continue;
												}
												if (local223 == 5055) {
													local28--;
													local820 = Static222.anIntArray512[local28];
													Static252.aStringArray32[local30++] = Static81.method1454(local820).method4522();
													continue;
												}
												if (local223 == 5056) {
													local28--;
													local820 = Static222.anIntArray512[local28];
													@Pc(11202) Class1_Sub2_Sub20 local11202 = Static81.method1454(local820);
													if (local11202.anIntArray580 == null) {
														Static222.anIntArray512[local28++] = 0;
													} else {
														Static222.anIntArray512[local28++] = local11202.anIntArray580.length;
													}
													continue;
												}
												if (local223 == 5057) {
													local28 -= 2;
													local820 = Static222.anIntArray512[local28];
													local814 = Static222.anIntArray512[local28 + 1];
													Static222.anIntArray512[local28++] = Static81.method1454(local820).anIntArray580[local814];
													continue;
												}
												if (local223 == 5058) {
													Static161.aClass18_1 = new Class18();
													local28--;
													Static161.aClass18_1.anInt457 = Static222.anIntArray512[local28];
													Static161.aClass18_1.aClass1_Sub2_Sub20_1 = Static81.method1454(Static161.aClass18_1.anInt457);
													Static161.aClass18_1.anIntArray30 = new int[Static161.aClass18_1.aClass1_Sub2_Sub20_1.method4532()];
													continue;
												}
												if (local223 == 5059) {
													Static81.aClass1_Sub16_Sub1_1.method2676(228);
													Static81.aClass1_Sub16_Sub1_1.method2621(0);
													local820 = Static81.aClass1_Sub16_Sub1_1.anInt3328;
													Static81.aClass1_Sub16_Sub1_1.method2621(0);
													Static81.aClass1_Sub16_Sub1_1.method2624(Static161.aClass18_1.anInt457);
													Static161.aClass18_1.aClass1_Sub2_Sub20_1.method4525(Static161.aClass18_1.anIntArray30, Static81.aClass1_Sub16_Sub1_1);
													Static81.aClass1_Sub16_Sub1_1.method2627(Static81.aClass1_Sub16_Sub1_1.anInt3328 - local820);
													continue;
												}
												if (local223 == 5060) {
													local30--;
													local607 = Static252.aStringArray32[local30];
													Static81.aClass1_Sub16_Sub1_1.method2676(113);
													Static81.aClass1_Sub16_Sub1_1.method2621(0);
													local814 = Static81.aClass1_Sub16_Sub1_1.anInt3328;
													Static81.aClass1_Sub16_Sub1_1.method2631(Static94.method4774(local607));
													Static81.aClass1_Sub16_Sub1_1.method2624(Static161.aClass18_1.anInt457);
													Static161.aClass18_1.aClass1_Sub2_Sub20_1.method4525(Static161.aClass18_1.anIntArray30, Static81.aClass1_Sub16_Sub1_1);
													Static81.aClass1_Sub16_Sub1_1.method2627(Static81.aClass1_Sub16_Sub1_1.anInt3328 - local814);
													continue;
												}
												if (local223 == 5061) {
													Static81.aClass1_Sub16_Sub1_1.method2676(228);
													Static81.aClass1_Sub16_Sub1_1.method2621(0);
													local820 = Static81.aClass1_Sub16_Sub1_1.anInt3328;
													Static81.aClass1_Sub16_Sub1_1.method2621(1);
													Static81.aClass1_Sub16_Sub1_1.method2624(Static161.aClass18_1.anInt457);
													Static161.aClass18_1.aClass1_Sub2_Sub20_1.method4525(Static161.aClass18_1.anIntArray30, Static81.aClass1_Sub16_Sub1_1);
													Static81.aClass1_Sub16_Sub1_1.method2627(Static81.aClass1_Sub16_Sub1_1.anInt3328 - local820);
													continue;
												}
												if (local223 == 5062) {
													local28 -= 2;
													local820 = Static222.anIntArray512[local28];
													local814 = Static222.anIntArray512[local28 + 1];
													Static222.anIntArray512[local28++] = Static290.method4731(local820).aCharArray3[local814];
													continue;
												}
												if (local223 == 5063) {
													local28 -= 2;
													local814 = Static222.anIntArray512[local28 + 1];
													local820 = Static222.anIntArray512[local28];
													Static222.anIntArray512[local28++] = Static290.method4731(local820).aCharArray2[local814];
													continue;
												}
												if (local223 == 5064) {
													local28 -= 2;
													local820 = Static222.anIntArray512[local28];
													local814 = Static222.anIntArray512[local28 + 1];
													if (local814 == -1) {
														Static222.anIntArray512[local28++] = -1;
													} else {
														Static222.anIntArray512[local28++] = Static290.method4731(local820).method1473((char) local814);
													}
													continue;
												}
												if (local223 == 5065) {
													local28 -= 2;
													local814 = Static222.anIntArray512[local28 + 1];
													local820 = Static222.anIntArray512[local28];
													if (local814 == -1) {
														Static222.anIntArray512[local28++] = -1;
													} else {
														Static222.anIntArray512[local28++] = Static290.method4731(local820).method1470((char) local814);
													}
													continue;
												}
												if (local223 == 5066) {
													local28--;
													local820 = Static222.anIntArray512[local28];
													Static222.anIntArray512[local28++] = Static81.method1454(local820).method4532();
													continue;
												}
												if (local223 == 5067) {
													local28 -= 2;
													local820 = Static222.anIntArray512[local28];
													local814 = Static222.anIntArray512[local28 + 1];
													local1053 = Static81.method1454(local820).method4527(local814);
													Static222.anIntArray512[local28++] = local1053;
													continue;
												}
												if (local223 == 5068) {
													local28 -= 2;
													local820 = Static222.anIntArray512[local28];
													local814 = Static222.anIntArray512[local28 + 1];
													Static161.aClass18_1.anIntArray30[local820] = local814;
													continue;
												}
												if (local223 == 5069) {
													local28 -= 2;
													local820 = Static222.anIntArray512[local28];
													local814 = Static222.anIntArray512[local28 + 1];
													Static161.aClass18_1.anIntArray30[local820] = local814;
													continue;
												}
												if (local223 == 5070) {
													local28 -= 3;
													local814 = Static222.anIntArray512[local28 + 1];
													local820 = Static222.anIntArray512[local28];
													local1053 = Static222.anIntArray512[local28 + 2];
													@Pc(11684) Class1_Sub2_Sub20 local11684 = Static81.method1454(local820);
													if (local11684.method4527(local814) != 0) {
														throw new RuntimeException("bad command");
													}
													Static222.anIntArray512[local28++] = local11684.method4529(local1053, local814);
													continue;
												}
												if (local223 == 5071) {
													local30--;
													local607 = Static252.aStringArray32[local30];
													local28--;
													local1375 = Static222.anIntArray512[local28] == 1;
													Static42.method927(local1375, local607);
													Static222.anIntArray512[local28++] = Static20.anInt5566;
													continue;
												}
												if (local223 == 5072) {
													if (Static39.aShortArray27 != null && Static20.anInt5566 > Static87.anInt2030) {
														Static222.anIntArray512[local28++] = Static39.aShortArray27[Static87.anInt2030++] & 0xFFFF;
														continue;
													}
													Static222.anIntArray512[local28++] = -1;
													continue;
												}
												if (local223 == 5073) {
													Static87.anInt2030 = 0;
													continue;
												}
											} else if (local223 < 5200) {
												if (local223 == 5100) {
													if (Static35.aBooleanArray2[86]) {
														Static222.anIntArray512[local28++] = 1;
													} else {
														Static222.anIntArray512[local28++] = 0;
													}
													continue;
												}
												if (local223 == 5101) {
													if (Static35.aBooleanArray2[82]) {
														Static222.anIntArray512[local28++] = 1;
													} else {
														Static222.anIntArray512[local28++] = 0;
													}
													continue;
												}
												if (local223 == 5102) {
													if (Static35.aBooleanArray2[81]) {
														Static222.anIntArray512[local28++] = 1;
													} else {
														Static222.anIntArray512[local28++] = 0;
													}
													continue;
												}
											} else {
												@Pc(7780) boolean local7780;
												if (local223 < 5300) {
													if (local223 == 5200) {
														local28--;
														Static244.method4193(Static222.anIntArray512[local28]);
														continue;
													}
													if (local223 == 5201) {
														Static222.anIntArray512[local28++] = Static37.method862();
														continue;
													}
													if (local223 == 5202) {
														local28--;
														Static36.method799(Static222.anIntArray512[local28]);
														continue;
													}
													if (local223 == 5203) {
														local30--;
														Static274.method2242(Static252.aStringArray32[local30]);
														continue;
													}
													if (local223 == 5204) {
														Static252.aStringArray32[local30 - 1] = Static161.method3005(Static252.aStringArray32[local30 - 1]);
														continue;
													}
													if (local223 == 5205) {
														local28--;
														Static202.method3586(-1, Static222.anIntArray512[local28], -1);
														continue;
													}
													@Pc(9336) Class1_Sub2_Sub9 local9336;
													if (local223 == 5206) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														local9336 = Static65.method332(local820 >> 14 & 0x3FFF, local820 & 0x3FFF);
														if (local9336 == null) {
															Static222.anIntArray512[local28++] = -1;
														} else {
															Static222.anIntArray512[local28++] = local9336.anInt2163;
														}
														continue;
													}
													@Pc(9364) Class1_Sub2_Sub9 local9364;
													if (local223 == 5207) {
														local28--;
														local9364 = Static228.method3999(Static222.anIntArray512[local28]);
														if (local9364 != null && local9364.aString71 != null) {
															Static252.aStringArray32[local30++] = local9364.aString71;
															continue;
														}
														Static252.aStringArray32[local30++] = "";
														continue;
													}
													if (local223 == 5208) {
														Static222.anIntArray512[local28++] = Static205.anInt4561;
														Static222.anIntArray512[local28++] = anInt856;
														continue;
													}
													if (local223 == 5209) {
														Static222.anIntArray512[local28++] = Static87.anInt2033 + Static234.anInt5158;
														Static222.anIntArray512[local28++] = Static173.anInt3932 + Static48.anInt1347 - Static88.anInt2053 - 1;
														continue;
													}
													if (local223 == 5210) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														local9336 = Static228.method3999(local820);
														if (local9336 == null) {
															Static222.anIntArray512[local28++] = 0;
															Static222.anIntArray512[local28++] = 0;
														} else {
															Static222.anIntArray512[local28++] = local9336.anInt2175 >> 14 & 0x3FFF;
															Static222.anIntArray512[local28++] = local9336.anInt2175 & 0x3FFF;
														}
														continue;
													}
													if (local223 == 5211) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														local9336 = Static228.method3999(local820);
														if (local9336 == null) {
															Static222.anIntArray512[local28++] = 0;
															Static222.anIntArray512[local28++] = 0;
														} else {
															Static222.anIntArray512[local28++] = local9336.anInt2169 - local9336.anInt2171;
															Static222.anIntArray512[local28++] = local9336.anInt2173 - local9336.anInt2176;
														}
														continue;
													}
													if (local223 == 5212) {
														local820 = Static231.method4267();
														local1053 = 0;
														if (local820 == -1) {
															local2107 = "";
														} else {
															local2107 = Static159.aClass78_2.aStringArray14[local820];
															local1053 = Static159.aClass78_2.method2182(local820);
														}
														local2107 = Static260.method4429("<br>", " ", local2107);
														Static252.aStringArray32[local30++] = local2107;
														Static222.anIntArray512[local28++] = local1053;
														continue;
													}
													if (local223 == 5213) {
														local820 = Static189.method3381();
														local1053 = 0;
														if (local820 == -1) {
															local2107 = "";
														} else {
															local2107 = Static159.aClass78_2.aStringArray14[local820];
															local1053 = Static159.aClass78_2.method2182(local820);
														}
														local2107 = Static260.method4429("<br>", " ", local2107);
														Static252.aStringArray32[local30++] = local2107;
														Static222.anIntArray512[local28++] = local1053;
														continue;
													}
													if (local223 == 5214) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														local9336 = Static64.method1247();
														if (local9336 != null) {
															local2109 = local9336.method1638(local820 >> 28 & 0x3, local820 & 0x3FFF, local820 >> 14 & 0x3FFF);
															if (local2109 != null) {
																Static169.method3142(local2109[2], local2109[1]);
															}
														}
														continue;
													}
													if (local223 == 5215) {
														local28 -= 2;
														local820 = Static222.anIntArray512[local28];
														local814 = Static222.anIntArray512[local28 + 1];
														local7780 = false;
														@Pc(9696) Class104 local9696 = Static241.method4157(local820 >> 14 & 0x3FFF, local820 & 0x3FFF);
														for (@Pc(9703) Class1_Sub2_Sub9 local9703 = (Class1_Sub2_Sub9) local9696.method3152(); local9703 != null; local9703 = (Class1_Sub2_Sub9) local9696.method3151()) {
															if (local9703.anInt2163 == local814) {
																local7780 = true;
																break;
															}
														}
														if (local7780) {
															Static222.anIntArray512[local28++] = 1;
														} else {
															Static222.anIntArray512[local28++] = 0;
														}
														continue;
													}
													if (local223 == 5216) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														Static12.method241(local820);
														continue;
													}
													if (local223 == 5217) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														if (Static295.method2506(local820)) {
															Static222.anIntArray512[local28++] = 1;
														} else {
															Static222.anIntArray512[local28++] = 0;
														}
														continue;
													}
													if (local223 == 5218) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														local9336 = Static228.method3999(local820);
														if (local9336 == null) {
															Static222.anIntArray512[local28++] = -1;
														} else {
															Static222.anIntArray512[local28++] = local9336.anInt2177;
														}
														continue;
													}
													if (local223 == 5219) {
														local30--;
														Static105.method4739(Static252.aStringArray32[local30]);
														continue;
													}
													if (local223 == 5220) {
														Static222.anIntArray512[local28++] = Static191.anInt4244 == 100 ? 1 : 0;
														continue;
													}
													if (local223 == 5221) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														Static169.method3142(local820 & 0x3FFF, local820 >> 14 & 0x3FFF);
														continue;
													}
													if (local223 == 5222) {
														local9364 = Static64.method1247();
														if (local9364 == null) {
															Static222.anIntArray512[local28++] = -1;
															Static222.anIntArray512[local28++] = -1;
														} else {
															local647 = local9364.method1635(Static234.anInt5158 + Static87.anInt2033, Static48.anInt1347 + -1 + Static173.anInt3932 + -Static88.anInt2053);
															if (local647 == null) {
																Static222.anIntArray512[local28++] = -1;
																Static222.anIntArray512[local28++] = -1;
															} else {
																Static222.anIntArray512[local28++] = local647[1];
																Static222.anIntArray512[local28++] = local647[2];
															}
														}
														continue;
													}
													if (local223 == 5223) {
														local28 -= 2;
														local820 = Static222.anIntArray512[local28];
														local814 = Static222.anIntArray512[local28 + 1];
														Static202.method3586(local814 & 0x3FFF, local820, local814 >> 14 & 0x3FFF);
														continue;
													}
													if (local223 == 5224) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														local9336 = Static64.method1247();
														if (local9336 == null) {
															Static222.anIntArray512[local28++] = -1;
															Static222.anIntArray512[local28++] = -1;
														} else {
															local2109 = local9336.method1638(local820 >> 28 & 0x3, local820 & 0x3FFF, local820 >> 14 & 0x3FFF);
															if (local2109 == null) {
																Static222.anIntArray512[local28++] = -1;
																Static222.anIntArray512[local28++] = -1;
															} else {
																Static222.anIntArray512[local28++] = local2109[1];
																Static222.anIntArray512[local28++] = local2109[2];
															}
														}
														continue;
													}
													if (local223 == 5225) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														local9336 = Static64.method1247();
														if (local9336 == null) {
															Static222.anIntArray512[local28++] = -1;
															Static222.anIntArray512[local28++] = -1;
														} else {
															local2109 = local9336.method1635(local820 >> 14 & 0x3FFF, local820 & 0x3FFF);
															if (local2109 == null) {
																Static222.anIntArray512[local28++] = -1;
																Static222.anIntArray512[local28++] = -1;
															} else {
																Static222.anIntArray512[local28++] = local2109[1];
																Static222.anIntArray512[local28++] = local2109[2];
															}
														}
														continue;
													}
												} else if (local223 < 5400) {
													if (local223 == 5300) {
														local28 -= 2;
														local820 = Static222.anIntArray512[local28];
														local814 = Static222.anIntArray512[local28 + 1];
														Static134.method2296(false, local820, 3, local814);
														Static222.anIntArray512[local28++] = Static158.aFrame2 == null ? 0 : 1;
														continue;
													}
													if (local223 == 5301) {
														if (Static158.aFrame2 != null) {
															Static134.method2296(false, -1, Static272.anInt5852, -1);
														}
														continue;
													}
													if (local223 == 5302) {
														@Pc(9063) Class33[] local9063 = Static6.method1717();
														Static222.anIntArray512[local28++] = local9063.length;
														continue;
													}
													if (local223 == 5303) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														@Pc(9083) Class33[] local9083 = Static6.method1717();
														Static222.anIntArray512[local28++] = local9083[local820].anInt1166;
														Static222.anIntArray512[local28++] = local9083[local820].anInt1158;
														continue;
													}
													if (local223 == 5305) {
														local820 = Static180.anInt4075;
														local1053 = -1;
														local814 = Static275.anInt5914;
														@Pc(9115) Class33[] local9115 = Static6.method1717();
														for (local2170 = 0; local2170 < local9115.length; local2170++) {
															@Pc(9125) Class33 local9125 = local9115[local2170];
															if (local820 == local9125.anInt1166 && local9125.anInt1158 == local814) {
																local1053 = local2170;
																break;
															}
														}
														Static222.anIntArray512[local28++] = local1053;
														continue;
													}
													if (local223 == 5306) {
														Static222.anIntArray512[local28++] = Static277.method4610();
														continue;
													}
													if (local223 == 5307) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														if (local820 < 0 || local820 > 2) {
															local820 = 0;
														}
														Static134.method2296(false, -1, local820, -1);
														continue;
													}
													if (local223 == 5308) {
														Static222.anIntArray512[local28++] = Static272.anInt5852;
														continue;
													}
													if (local223 == 5309) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														if (local820 < 0 || local820 > 2) {
															local820 = 0;
														}
														Static272.anInt5852 = local820;
														Static251.method4273(Static43.aClass66_1);
														continue;
													}
												} else if (local223 < 5500) {
													if (local223 == 5400) {
														local30 -= 2;
														local607 = Static252.aStringArray32[local30];
														local28--;
														local1053 = Static222.anIntArray512[local28];
														local2107 = Static252.aStringArray32[local30 + 1];
														Static81.aClass1_Sub16_Sub1_1.method2676(250);
														Static81.aClass1_Sub16_Sub1_1.method2621(Static224.method3926(local607) + Static224.method3926(local2107) + 1);
														Static81.aClass1_Sub16_Sub1_1.method2630(local607);
														Static81.aClass1_Sub16_Sub1_1.method2630(local2107);
														Static81.aClass1_Sub16_Sub1_1.method2621(local1053);
														continue;
													}
													if (local223 == 5401) {
														local28 -= 2;
														Static272.aShortArray89[Static222.anIntArray512[local28]] = (short) Static73.method1360(Static222.anIntArray512[local28 + 1]);
														Static86.method1512();
														Static107.method1749();
														Static98.method1656();
														Static227.method3942();
														Static102.method1689();
														continue;
													}
													if (local223 == 5405) {
														local28 -= 2;
														local820 = Static222.anIntArray512[local28];
														local814 = Static222.anIntArray512[local28 + 1];
														if (local820 >= 0 && local820 < 2) {
															Static101.anIntArrayArrayArray14[local820] = new int[local814 << 1][4];
														}
														continue;
													}
													if (local223 == 5406) {
														local28 -= 7;
														local820 = Static222.anIntArray512[local28];
														local1053 = Static222.anIntArray512[local28 + 2];
														local814 = Static222.anIntArray512[local28 + 1] << 1;
														local653 = Static222.anIntArray512[local28 + 3];
														local4494 = Static222.anIntArray512[local28 + 5];
														@Pc(5815) int local5815 = Static222.anIntArray512[local28 + 6];
														local2170 = Static222.anIntArray512[local28 + 4];
														if (local820 >= 0 && local820 < 2 && Static101.anIntArrayArrayArray14[local820] != null && local814 >= 0 && local814 < Static101.anIntArrayArrayArray14[local820].length) {
															Static101.anIntArrayArrayArray14[local820][local814] = new int[] { (local1053 >> 14 & 0x3FFF) * 128, local653, (local1053 & 0x3FFF) * 128, local5815 };
															Static101.anIntArrayArrayArray14[local820][local814 + 1] = new int[] { (local2170 >> 14 & 0x3FFF) * 128, local4494, (local2170 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local223 == 5407) {
														local28--;
														local820 = Static101.anIntArrayArrayArray14[Static222.anIntArray512[local28]].length >> 1;
														Static222.anIntArray512[local28++] = local820;
														continue;
													}
													if (local223 == 5411) {
														if (Static158.aFrame2 != null) {
															Static134.method2296(false, -1, Static272.anInt5852, -1);
														}
														if (Static48.aFrame1 == null) {
															Static277.method4609(Static78.method1413(), false);
														} else {
															System.exit(0);
														}
														continue;
													}
													if (local223 == 5419) {
														local607 = "";
														if (Static272.aClass43_8 != null) {
															if (Static272.aClass43_8.anObject3 == null) {
																local607 = Static147.method2779(Static272.aClass43_8.anInt1458);
															} else {
																local607 = (String) Static272.aClass43_8.anObject3;
															}
														}
														Static252.aStringArray32[local30++] = local607;
														continue;
													}
													if (local223 == 5420) {
														Static222.anIntArray512[local28++] = Static93.anInt2149 == 3 ? 1 : 0;
														continue;
													}
													if (local223 == 5421) {
														if (Static158.aFrame2 != null) {
															Static134.method2296(false, -1, Static272.anInt5852, -1);
														}
														local28--;
														local1375 = Static222.anIntArray512[local28] == 1;
														local30--;
														local607 = Static252.aStringArray32[local30];
														@Pc(6058) String local6058 = Static78.method1413() + local607;
														if (Static48.aFrame1 == null && (!local1375 || Static93.anInt2149 == 3 || !Static93.aString65.startsWith("win") || Static245.aBoolean289)) {
															Static277.method4609(local6058, local1375);
															continue;
														}
														Static241.aString166 = local6058;
														Static107.aBoolean124 = local1375;
														Static178.aClass43_6 = Static43.aClass66_1.method1605(local6058);
														continue;
													}
													if (local223 == 5422) {
														local30 -= 2;
														local2107 = Static252.aStringArray32[local30 + 1];
														local607 = Static252.aStringArray32[local30];
														local28--;
														local1053 = Static222.anIntArray512[local28];
														if (local607.length() > 0) {
															if (Static113.aStringArray10 == null) {
																Static113.aStringArray10 = new String[Static208.anIntArray470[Static230.anInt5101]];
															}
															Static113.aStringArray10[local1053] = local607;
														}
														if (local2107.length() > 0) {
															if (Static247.aStringArray31 == null) {
																Static247.aStringArray31 = new String[Static208.anIntArray470[Static230.anInt5101]];
															}
															Static247.aStringArray31[local1053] = local2107;
														}
														continue;
													}
													if (local223 == 5423) {
														local30--;
														System.out.println(Static252.aStringArray32[local30]);
														continue;
													}
													if (local223 == 5424) {
														local28 -= 11;
														Static37.anInt1133 = Static222.anIntArray512[local28];
														Static241.anInt5293 = Static222.anIntArray512[local28 + 1];
														Static133.anInt3014 = Static222.anIntArray512[local28 + 2];
														Static24.anInt489 = Static222.anIntArray512[local28 + 3];
														Static253.anInt5524 = Static222.anIntArray512[local28 + 4];
														Static26.anInt738 = Static222.anIntArray512[local28 + 5];
														Static245.anInt5368 = Static222.anIntArray512[local28 + 6];
														Static9.anInt273 = Static222.anIntArray512[local28 + 7];
														Static79.anInt1894 = Static222.anIntArray512[local28 + 8];
														Static208.anInt4630 = Static222.anIntArray512[local28 + 9];
														Static267.anInt3431 = Static222.anIntArray512[local28 + 10];
														aClass83_20.method2302(Static253.anInt5524);
														aClass83_20.method2302(Static26.anInt738);
														aClass83_20.method2302(Static245.anInt5368);
														aClass83_20.method2302(Static9.anInt273);
														aClass83_20.method2302(Static79.anInt1894);
														Static236.aBoolean285 = true;
														continue;
													}
													if (local223 == 5425) {
														Static244.method4192();
														Static236.aBoolean285 = false;
														continue;
													}
													if (local223 == 5426) {
														local28--;
														Static266.anInt5786 = Static222.anIntArray512[local28];
														continue;
													}
													if (local223 == 5427) {
														local28 -= 2;
														Static180.anInt4069 = Static222.anIntArray512[local28];
														Static204.anInt4559 = Static222.anIntArray512[local28 + 1];
														continue;
													}
													if (local223 == 5428) {
														local28 -= 2;
														local820 = Static222.anIntArray512[local28];
														local814 = Static222.anIntArray512[local28 + 1];
														Static222.anIntArray512[local28++] = Static281.method4666(local814, local820) ? 1 : 0;
														continue;
													}
												} else if (local223 < 5600) {
													if (local223 == 5500) {
														local28 -= 4;
														local820 = Static222.anIntArray512[local28];
														local814 = Static222.anIntArray512[local28 + 1];
														local1053 = Static222.anIntArray512[local28 + 2];
														local653 = Static222.anIntArray512[local28 + 3];
														Static285.method4693(local653, false, (local820 >> 14 & 0x3FFF) - Static82.anInt1972, local1053, (local820 & 0x3FFF) - Static266.anInt5790, local814);
														continue;
													}
													if (local223 == 5501) {
														local28 -= 4;
														local1053 = Static222.anIntArray512[local28 + 2];
														local814 = Static222.anIntArray512[local28 + 1];
														local653 = Static222.anIntArray512[local28 + 3];
														local820 = Static222.anIntArray512[local28];
														Static228.method4000(local814, (local820 >> 14 & 0x3FFF) - Static82.anInt1972, (local820 & 0x3FFF) - Static266.anInt5790, local1053, local653);
														continue;
													}
													if (local223 == 5502) {
														local28 -= 6;
														local820 = Static222.anIntArray512[local28];
														if (local820 >= 2) {
															throw new RuntimeException();
														}
														Static193.anInt4302 = local820;
														local814 = Static222.anIntArray512[local28 + 1];
														if (Static101.anIntArrayArrayArray14[Static193.anInt4302].length >> 1 <= local814 + 1) {
															throw new RuntimeException();
														}
														Static152.anInt3527 = 0;
														Static175.anInt3975 = local814;
														Static45.anInt1322 = Static222.anIntArray512[local28 + 2];
														Static110.anInt2372 = Static222.anIntArray512[local28 + 3];
														local1053 = Static222.anIntArray512[local28 + 4];
														if (local1053 >= 2) {
															throw new RuntimeException();
														}
														Static217.anInt4819 = local1053;
														local653 = Static222.anIntArray512[local28 + 5];
														if (Static101.anIntArrayArrayArray14[Static217.anInt4819].length >> 1 <= local653 + 1) {
															throw new RuntimeException();
														}
														Static189.anInt4212 = local653;
														Static280.anInt5999 = 3;
														continue;
													}
													if (local223 == 5503) {
														Static112.method1807();
														continue;
													}
													if (local223 == 5504) {
														local28 -= 2;
														Static247.method4248(Static222.anIntArray512[local28 + 1], Static222.anIntArray512[local28]);
														continue;
													}
													if (local223 == 5505) {
														Static222.anIntArray512[local28++] = (int) Static25.aFloat19;
														continue;
													}
													if (local223 == 5506) {
														Static222.anIntArray512[local28++] = (int) Static125.aFloat97;
														continue;
													}
													if (local223 == 5507) {
														Static225.method3930();
														continue;
													}
													if (local223 == 5508) {
														Static239.method4130();
														continue;
													}
													if (local223 == 5509) {
														Static68.method1300();
														continue;
													}
													if (local223 == 5510) {
														Static16.method361();
														continue;
													}
													if (local223 == 5512) {
														Static299.method4855();
														continue;
													}
												} else if (local223 < 5700) {
													if (local223 == 5600) {
														local30 -= 2;
														local2107 = Static252.aStringArray32[local30 + 1];
														local607 = Static252.aStringArray32[local30];
														local28--;
														local1053 = Static222.anIntArray512[local28];
														if (Static279.anInt5968 == 10 && Static63.anInt1592 == 0 && Static209.anInt4636 == 0 && Static25.anInt507 == 0 && Static70.anInt1763 == 0) {
															Static52.method1061(local2107, local607, local1053);
														}
														continue;
													}
													if (local223 == 5601) {
														Static219.method3894();
														continue;
													}
													if (local223 == 5602) {
														if (Static209.anInt4636 == 0) {
															Static275.anInt5910 = -2;
														}
														continue;
													}
													if (local223 == 5603) {
														local28 -= 4;
														if (Static279.anInt5968 == 10 && Static63.anInt1592 == 0 && Static209.anInt4636 == 0 && Static25.anInt507 == 0 && Static70.anInt1763 == 0) {
															Static39.method884(Static222.anIntArray512[local28], Static222.anIntArray512[local28 + 3], Static222.anIntArray512[local28 + 2], Static222.anIntArray512[local28 + 1]);
														}
														continue;
													}
													if (local223 == 5604) {
														local30--;
														if (Static279.anInt5968 == 10 && Static63.anInt1592 == 0 && Static209.anInt4636 == 0 && Static25.anInt507 == 0 && Static70.anInt1763 == 0) {
															Static91.method1594(Static94.method4774(Static252.aStringArray32[local30]));
														}
														continue;
													}
													if (local223 == 5605) {
														local28 -= 7;
														local30 -= 3;
														if (Static279.anInt5968 == 10 && Static63.anInt1592 == 0 && Static209.anInt4636 == 0 && Static25.anInt507 == 0 && Static70.anInt1763 == 0) {
															Static9.method214(Static94.method4774(Static252.aStringArray32[local30]), Static222.anIntArray512[local28 + 6] == 1, Static252.aStringArray32[local30 + 2], Static222.anIntArray512[local28 + 2], Static222.anIntArray512[local28 + 1], Static222.anIntArray512[local28 + 4] == 1, Static252.aStringArray32[local30 + 1], Static222.anIntArray512[local28 + 3], Static222.anIntArray512[local28], Static222.anIntArray512[local28 + 5] == 1);
														}
														continue;
													}
													if (local223 == 5606) {
														if (Static25.anInt507 == 0) {
															Static174.anInt3970 = -2;
														}
														continue;
													}
													if (local223 == 5607) {
														Static222.anIntArray512[local28++] = Static275.anInt5910;
														continue;
													}
													if (local223 == 5608) {
														Static222.anIntArray512[local28++] = Static158.anInt3656;
														continue;
													}
													if (local223 == 5609) {
														Static222.anIntArray512[local28++] = Static174.anInt3970;
														continue;
													}
													if (local223 == 5610) {
														for (local820 = 0; local820 < 5; local820++) {
															Static252.aStringArray32[local30++] = local820 >= Static122.aStringArray12.length ? "" : Static25.method417(Static122.aStringArray12[local820]);
														}
														Static122.aStringArray12 = null;
														continue;
													}
													if (local223 == 5611) {
														Static222.anIntArray512[local28++] = Static213.anInt4718;
														continue;
													}
												} else if (local223 < 6100) {
													if (local223 == 6001) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														if (local820 < 1) {
															local820 = 1;
														}
														if (local820 > 4) {
															local820 = 4;
														}
														Static20.anInt5576 = local820;
														if (!Static296.aBoolean335 || !Static10.aBoolean12) {
															if (Static20.anInt5576 == 1) {
																Static151.method2846(0.9F);
															}
															if (Static20.anInt5576 == 2) {
																Static151.method2846(0.8F);
															}
															if (Static20.anInt5576 == 3) {
																Static151.method2846(0.7F);
															}
															if (Static20.anInt5576 == 4) {
																Static151.method2846(0.6F);
															}
														}
														if (Static296.aBoolean335) {
															Static94.method4775();
															if (!Static10.aBoolean12) {
																Static48.method1024();
															}
														}
														Static107.method1749();
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6002) {
														local28--;
														Static15.method319(Static222.anIntArray512[local28] == 1);
														Static148.method2782();
														Static48.method1024();
														Static86.method1510();
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6003) {
														local28--;
														Static53.aBoolean84 = Static222.anIntArray512[local28] == 1;
														Static86.method1510();
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6005) {
														local28--;
														Static135.aBoolean157 = Static222.anIntArray512[local28] == 1;
														Static48.method1024();
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6006) {
														local28--;
														Static45.aBoolean75 = Static222.anIntArray512[local28] == 1;
														((Class2_Sub1) Static151.anInterface2_1).method4427(!Static45.aBoolean75);
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6007) {
														local28--;
														Static64.aBoolean92 = Static222.anIntArray512[local28] == 1;
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6008) {
														local28--;
														Static135.aBoolean154 = Static222.anIntArray512[local28] == 1;
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6009) {
														local28--;
														Static50.aBoolean80 = Static222.anIntArray512[local28] == 1;
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6010) {
														local28--;
														Static263.aBoolean302 = Static222.anIntArray512[local28] == 1;
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6011) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														if (local820 < 0 || local820 > 2) {
															local820 = 0;
														}
														Static265.anInt5769 = local820;
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6012) {
														if (Static296.aBoolean335) {
															Static141.method2524(0, 0);
														}
														local28--;
														Static10.aBoolean12 = Static222.anIntArray512[local28] == 1;
														if (Static296.aBoolean335 && Static10.aBoolean12) {
															Static151.method2846(0.7F);
														} else {
															if (Static20.anInt5576 == 1) {
																Static151.method2846(0.9F);
															}
															if (Static20.anInt5576 == 2) {
																Static151.method2846(0.8F);
															}
															if (Static20.anInt5576 == 3) {
																Static151.method2846(0.7F);
															}
															if (Static20.anInt5576 == 4) {
																Static151.method2846(0.6F);
															}
														}
														Static48.method1024();
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6014) {
														local28--;
														Static119.aBoolean141 = Static222.anIntArray512[local28] == 1;
														if (Static296.aBoolean335) {
															Static48.method1024();
														}
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6015) {
														local28--;
														Static70.aBoolean96 = Static222.anIntArray512[local28] == 1;
														if (Static296.aBoolean335) {
															Static94.method4775();
														}
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6016) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														if (Static296.aBoolean335) {
															Static252.aBoolean293 = true;
														}
														if (local820 < 0 || local820 > 2) {
															local820 = 0;
														}
														Static171.anInt3870 = local820;
														continue;
													}
													if (local223 == 6017) {
														local28--;
														Static153.aBoolean183 = Static222.anIntArray512[local28] == 1;
														Static28.method534();
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6018) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														if (local820 < 0) {
															local820 = 0;
														}
														if (local820 > 127) {
															local820 = 127;
														}
														Static11.anInt2931 = local820;
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6019) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														if (local820 < 0) {
															local820 = 0;
														}
														if (local820 > 255) {
															local820 = 255;
														}
														if (Static239.anInt5264 != local820) {
															if (Static239.anInt5264 == 0 && Static282.anInt6020 != -1) {
																Static66.method2992(Static210.aClass83_139, local820, Static282.anInt6020);
																Static191.aBoolean212 = false;
															} else if (local820 == 0) {
																Static28.method535();
																Static191.aBoolean212 = false;
															} else {
																Static99.method1659(local820);
															}
															Static239.anInt5264 = local820;
														}
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6020) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														if (local820 < 0) {
															local820 = 0;
														}
														if (local820 > 127) {
															local820 = 127;
														}
														Static210.anInt4682 = local820;
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														continue;
													}
													if (local223 == 6021) {
														local28--;
														Static172.aBoolean201 = Static222.anIntArray512[local28] == 1;
														Static86.method1510();
														continue;
													}
													if (local223 == 6023) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														if (local820 < 0) {
															local820 = 0;
														}
														local1375 = false;
														if (local820 > 2) {
															local820 = 2;
														}
														if (Static98.anInt2197 < 96) {
															local1375 = true;
															local820 = 0;
														}
														Static155.method2876(local820);
														Static251.method4273(Static43.aClass66_1);
														Static134.aBoolean153 = false;
														Static222.anIntArray512[local28++] = local1375 ? 0 : 1;
														continue;
													}
													if (local223 == 6024) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														if (local820 < 0 || local820 > 2) {
															local820 = 0;
														}
														Static8.anInt4429 = local820;
														Static251.method4273(Static43.aClass66_1);
														continue;
													}
													if (local223 == 6027) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														if (!Static296.aBoolean335) {
															continue;
														}
														if (local820 < 0 || local820 > 1) {
															local820 = 0;
														}
														Static115.method1896(local820 == 1);
														continue;
													}
													if (local223 == 6028) {
														local28--;
														Static111.aBoolean136 = Static222.anIntArray512[local28] != 0;
														Static251.method4273(Static43.aClass66_1);
														continue;
													}
												} else if (local223 < 6200) {
													if (local223 == 6101) {
														Static222.anIntArray512[local28++] = Static20.anInt5576;
														continue;
													}
													if (local223 == 6102) {
														Static222.anIntArray512[local28++] = Static40.method1450() ? 1 : 0;
														continue;
													}
													if (local223 == 6103) {
														Static222.anIntArray512[local28++] = Static53.aBoolean84 ? 1 : 0;
														continue;
													}
													if (local223 == 6105) {
														Static222.anIntArray512[local28++] = Static135.aBoolean157 ? 1 : 0;
														continue;
													}
													if (local223 == 6106) {
														Static222.anIntArray512[local28++] = Static45.aBoolean75 ? 1 : 0;
														continue;
													}
													if (local223 == 6107) {
														Static222.anIntArray512[local28++] = Static64.aBoolean92 ? 1 : 0;
														continue;
													}
													if (local223 == 6108) {
														Static222.anIntArray512[local28++] = Static135.aBoolean154 ? 1 : 0;
														continue;
													}
													if (local223 == 6109) {
														Static222.anIntArray512[local28++] = Static50.aBoolean80 ? 1 : 0;
														continue;
													}
													if (local223 == 6110) {
														Static222.anIntArray512[local28++] = Static263.aBoolean302 ? 1 : 0;
														continue;
													}
													if (local223 == 6111) {
														Static222.anIntArray512[local28++] = Static265.anInt5769;
														continue;
													}
													if (local223 == 6112) {
														Static222.anIntArray512[local28++] = Static10.aBoolean12 ? 1 : 0;
														continue;
													}
													if (local223 == 6114) {
														Static222.anIntArray512[local28++] = Static119.aBoolean141 ? 1 : 0;
														continue;
													}
													if (local223 == 6115) {
														Static222.anIntArray512[local28++] = Static70.aBoolean96 ? 1 : 0;
														continue;
													}
													if (local223 == 6116) {
														Static222.anIntArray512[local28++] = Static171.anInt3870;
														continue;
													}
													if (local223 == 6117) {
														Static222.anIntArray512[local28++] = Static153.aBoolean183 ? 1 : 0;
														continue;
													}
													if (local223 == 6118) {
														Static222.anIntArray512[local28++] = Static11.anInt2931;
														continue;
													}
													if (local223 == 6119) {
														Static222.anIntArray512[local28++] = Static239.anInt5264;
														continue;
													}
													if (local223 == 6120) {
														Static222.anIntArray512[local28++] = Static210.anInt4682;
														continue;
													}
													if (local223 == 6121) {
														if (Static296.aBoolean335) {
															Static222.anIntArray512[local28++] = Static296.aBoolean338 ? 1 : 0;
														} else {
															Static222.anIntArray512[local28++] = 0;
														}
														continue;
													}
													if (local223 == 6123) {
														Static222.anIntArray512[local28++] = Static155.method2875();
														continue;
													}
													if (local223 == 6124) {
														Static222.anIntArray512[local28++] = Static8.anInt4429;
														continue;
													}
													if (local223 == 6126) {
														if (Static296.aBoolean335) {
															Static222.anIntArray512[local28++] = Static214.method3745() ? 1 : 0;
														} else {
															Static222.anIntArray512[local28++] = 0;
														}
														continue;
													}
													if (local223 == 6127) {
														Static222.anIntArray512[local28++] = Static28.aBoolean42 ? 1 : 0;
														continue;
													}
													if (local223 == 6128) {
														Static222.anIntArray512[local28++] = Static111.aBoolean136 ? 1 : 0;
														continue;
													}
												} else if (local223 < 6300) {
													if (local223 == 6200) {
														local28 -= 2;
														Static260.aShort39 = (short) Static222.anIntArray512[local28];
														if (Static260.aShort39 <= 0) {
															Static260.aShort39 = 256;
														}
														Static174.aShort22 = (short) Static222.anIntArray512[local28 + 1];
														if (Static174.aShort22 <= 0) {
															Static174.aShort22 = 205;
														}
														continue;
													}
													if (local223 == 6201) {
														local28 -= 2;
														Static138.aShort12 = (short) Static222.anIntArray512[local28];
														if (Static138.aShort12 <= 0) {
															Static138.aShort12 = 256;
														}
														Static82.aShort11 = (short) Static222.anIntArray512[local28 + 1];
														if (Static82.aShort11 <= 0) {
															Static82.aShort11 = 320;
														}
														continue;
													}
													if (local223 == 6202) {
														local28 -= 4;
														Static188.aShort24 = (short) Static222.anIntArray512[local28];
														if (Static188.aShort24 <= 0) {
															Static188.aShort24 = 1;
														}
														Static54.aShort9 = (short) Static222.anIntArray512[local28 + 1];
														if (Static54.aShort9 <= 0) {
															Static54.aShort9 = 32767;
														} else if (Static54.aShort9 < Static188.aShort24) {
															Static54.aShort9 = Static188.aShort24;
														}
														Static94.aShort50 = (short) Static222.anIntArray512[local28 + 2];
														if (Static94.aShort50 <= 0) {
															Static94.aShort50 = 1;
														}
														Static280.aShort42 = (short) Static222.anIntArray512[local28 + 3];
														if (Static280.aShort42 <= 0) {
															Static280.aShort42 = 32767;
														} else if (Static280.aShort42 < Static94.aShort50) {
															Static280.aShort42 = Static94.aShort50;
														}
														continue;
													}
													if (local223 == 6203) {
														Static269.method4526(0, 0, false, Static59.aClass116_2.anInt4299, Static59.aClass116_2.anInt4363);
														Static222.anIntArray512[local28++] = Static249.anInt5441;
														Static222.anIntArray512[local28++] = Static267.anInt3426;
														continue;
													}
													if (local223 == 6204) {
														Static222.anIntArray512[local28++] = Static138.aShort12;
														Static222.anIntArray512[local28++] = Static82.aShort11;
														continue;
													}
													if (local223 == 6205) {
														Static222.anIntArray512[local28++] = Static260.aShort39;
														Static222.anIntArray512[local28++] = Static174.aShort22;
														continue;
													}
												} else if (local223 < 6400) {
													if (local223 == 6300) {
														Static222.anIntArray512[local28++] = (int) (Static294.method4792() / 60000L);
														continue;
													}
													if (local223 == 6301) {
														Static222.anIntArray512[local28++] = (int) (Static294.method4792() / 86400000L) - 11745;
														continue;
													}
													if (local223 == 6302) {
														local28 -= 3;
														local820 = Static222.anIntArray512[local28];
														local1053 = Static222.anIntArray512[local28 + 2];
														local814 = Static222.anIntArray512[local28 + 1];
														Static188.aCalendar2.clear();
														Static188.aCalendar2.set(11, 12);
														Static188.aCalendar2.set(local1053, local814, local820);
														Static222.anIntArray512[local28++] = (int) (Static188.aCalendar2.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local223 == 6303) {
														Static188.aCalendar2.clear();
														Static188.aCalendar2.setTime(new Date(Static294.method4792()));
														Static222.anIntArray512[local28++] = Static188.aCalendar2.get(1);
														continue;
													}
													if (local223 == 6304) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														local1375 = true;
														if (local820 < 0) {
															local1375 = (local820 + 1) % 4 == 0;
														} else if (local820 < 1582) {
															local1375 = local820 % 4 == 0;
														} else if (local820 % 4 != 0) {
															local1375 = false;
														} else if (local820 % 100 != 0) {
															local1375 = true;
														} else if (local820 % 400 != 0) {
															local1375 = false;
														}
														Static222.anIntArray512[local28++] = local1375 ? 1 : 0;
														continue;
													}
												} else if (local223 < 6500) {
													if (local223 == 6405) {
														Static222.anIntArray512[local28++] = Static158.method2965() ? 1 : 0;
														continue;
													}
													if (local223 == 6406) {
														Static222.anIntArray512[local28++] = Static95.method1636() ? 1 : 0;
														continue;
													}
												} else if (local223 < 6600) {
													if (local223 == 6500) {
														if (Static279.anInt5968 == 10 && Static63.anInt1592 == 0 && Static209.anInt4636 == 0 && Static25.anInt507 == 0) {
															Static222.anIntArray512[local28++] = Static273.method4571() == -1 ? 0 : 1;
															continue;
														}
														Static222.anIntArray512[local28++] = 1;
														continue;
													}
													@Pc(7452) Class64 local7452;
													@Pc(7426) Class140_Sub1 local7426;
													if (local223 == 6501) {
														local7426 = Static222.method3917();
														if (local7426 == null) {
															Static222.anIntArray512[local28++] = -1;
															Static222.anIntArray512[local28++] = 0;
															Static252.aStringArray32[local30++] = "";
															Static222.anIntArray512[local28++] = 0;
															Static252.aStringArray32[local30++] = "";
															Static222.anIntArray512[local28++] = 0;
														} else {
															Static222.anIntArray512[local28++] = local7426.anInt5462;
															Static222.anIntArray512[local28++] = local7426.anInt5451;
															Static252.aStringArray32[local30++] = local7426.aString176;
															local7452 = local7426.method4277();
															Static222.anIntArray512[local28++] = local7452.anInt2056;
															Static252.aStringArray32[local30++] = local7452.aString61;
															Static222.anIntArray512[local28++] = local7426.anInt5454;
														}
														continue;
													}
													if (local223 == 6502) {
														local7426 = Static160.method3003();
														if (local7426 == null) {
															Static222.anIntArray512[local28++] = -1;
															Static222.anIntArray512[local28++] = 0;
															Static252.aStringArray32[local30++] = "";
															Static222.anIntArray512[local28++] = 0;
															Static252.aStringArray32[local30++] = "";
															Static222.anIntArray512[local28++] = 0;
														} else {
															Static222.anIntArray512[local28++] = local7426.anInt5462;
															Static222.anIntArray512[local28++] = local7426.anInt5451;
															Static252.aStringArray32[local30++] = local7426.aString176;
															local7452 = local7426.method4277();
															Static222.anIntArray512[local28++] = local7452.anInt2056;
															Static252.aStringArray32[local30++] = local7452.aString61;
															Static222.anIntArray512[local28++] = local7426.anInt5454;
														}
														continue;
													}
													if (local223 == 6503) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														if (Static279.anInt5968 == 10 && Static63.anInt1592 == 0 && Static209.anInt4636 == 0 && Static25.anInt507 == 0) {
															Static222.anIntArray512[local28++] = Static64.method1249(local820) ? 1 : 0;
															continue;
														}
														Static222.anIntArray512[local28++] = 0;
														continue;
													}
													if (local223 == 6504) {
														local28--;
														Static265.anInt5770 = Static222.anIntArray512[local28];
														Static251.method4273(Static43.aClass66_1);
														continue;
													}
													if (local223 == 6505) {
														Static222.anIntArray512[local28++] = Static265.anInt5770;
														continue;
													}
													if (local223 == 6506) {
														local28--;
														local820 = Static222.anIntArray512[local28];
														@Pc(7672) Class140_Sub1 local7672 = Static65.method323(local820);
														if (local7672 == null) {
															Static222.anIntArray512[local28++] = -1;
															Static252.aStringArray32[local30++] = "";
															Static222.anIntArray512[local28++] = 0;
															Static252.aStringArray32[local30++] = "";
															Static222.anIntArray512[local28++] = 0;
														} else {
															Static222.anIntArray512[local28++] = local7672.anInt5451;
															Static252.aStringArray32[local30++] = local7672.aString176;
															@Pc(7718) Class64 local7718 = local7672.method4277();
															Static222.anIntArray512[local28++] = local7718.anInt2056;
															Static252.aStringArray32[local30++] = local7718.aString61;
															Static222.anIntArray512[local28++] = local7672.anInt5454;
														}
														continue;
													}
													if (local223 == 6507) {
														local28 -= 4;
														local1375 = Static222.anIntArray512[local28 + 1] == 1;
														local820 = Static222.anIntArray512[local28];
														local1053 = Static222.anIntArray512[local28 + 2];
														local7780 = Static222.anIntArray512[local28 + 3] == 1;
														Static190.method3393(local820, local1375, local1053, local7780);
														continue;
													}
												} else if (local223 < 6700) {
													if (local223 == 6600) {
														local28--;
														Static205.aBoolean243 = Static222.anIntArray512[local28] == 1;
														Static251.method4273(Static43.aClass66_1);
														continue;
													}
													if (local223 == 6601) {
														Static222.anIntArray512[local28++] = Static205.aBoolean243 ? 1 : 0;
														continue;
													}
												}
											}
										} else if (local223 == 4500) {
											local28 -= 2;
											local820 = Static222.anIntArray512[local28];
											local814 = Static222.anIntArray512[local28 + 1];
											local5393 = Static114.method1863(local814);
											if (local5393.method4331()) {
												Static252.aStringArray32[local30++] = Static222.method3919(local820).method3090(local5393.aString180, local814);
											} else {
												Static222.anIntArray512[local28++] = Static222.method3919(local820).method3091(local5393.anInt5556, local814);
											}
											continue;
										}
									} else if (local223 == 4400) {
										local28 -= 2;
										local814 = Static222.anIntArray512[local28 + 1];
										local820 = Static222.anIntArray512[local28];
										local5393 = Static114.method1863(local814);
										if (local5393.method4331()) {
											Static252.aStringArray32[local30++] = Static268.method4511(local820).method680(local814, local5393.aString180);
										} else {
											Static222.anIntArray512[local28++] = Static268.method4511(local820).method686(local5393.anInt5556, local814);
										}
										continue;
									}
								}
							} else {
								if (local223 < 2000) {
									local1180 = local1024 ? Static299.aClass116_19 : Static260.aClass116_17;
								} else {
									local223 -= 1000;
									local28--;
									local1180 = Static115.method1897(Static222.anIntArray512[local28]);
								}
								if (local223 == 1300) {
									local28--;
									local814 = Static222.anIntArray512[local28] - 1;
									if (local814 >= 0 && local814 <= 9) {
										local30--;
										local1180.method3433(Static252.aStringArray32[local30], local814);
										continue;
									}
									local30--;
									continue;
								}
								if (local223 == 1301) {
									local28 -= 2;
									local814 = Static222.anIntArray512[local28];
									local1053 = Static222.anIntArray512[local28 + 1];
									local1180.aClass116_10 = Static127.method2179(local1053, local814);
									continue;
								}
								if (local223 == 1302) {
									local28--;
									local1180.aBoolean229 = Static222.anIntArray512[local28] == 1;
									continue;
								}
								if (local223 == 1303) {
									local28--;
									local1180.anInt4339 = Static222.anIntArray512[local28];
									continue;
								}
								if (local223 == 1304) {
									local28--;
									local1180.anInt4312 = Static222.anIntArray512[local28];
									continue;
								}
								if (local223 == 1305) {
									local30--;
									local1180.aString131 = Static252.aStringArray32[local30];
									continue;
								}
								if (local223 == 1306) {
									local30--;
									local1180.aString130 = Static252.aStringArray32[local30];
									continue;
								}
								if (local223 == 1307) {
									local1180.aStringArray21 = null;
									continue;
								}
								if (local223 == 1308) {
									local28--;
									local1180.anInt4310 = Static222.anIntArray512[local28];
									local28--;
									local1180.anInt4337 = Static222.anIntArray512[local28];
									continue;
								}
								if (local223 == 1309) {
									local28--;
									local814 = Static222.anIntArray512[local28];
									local28--;
									local1053 = Static222.anIntArray512[local28];
									if (local1053 >= 1 && local1053 <= 10) {
										local1180.method3432(local814, local1053 - 1);
									}
									continue;
								}
								if (local223 == 1310) {
									local30--;
									local1180.aString128 = Static252.aStringArray32[local30];
									continue;
								}
							}
						}
					}
				} else if (local223 == 100) {
					local28 -= 3;
					local814 = Static222.anIntArray512[local28 + 1];
					local820 = Static222.anIntArray512[local28];
					local1053 = Static222.anIntArray512[local28 + 2];
					if (local814 != 0) {
						local13263 = Static115.method1897(local820);
						if (local13263.aClass116Array1 == null) {
							local13263.aClass116Array1 = new Class116[local1053 + 1];
						}
						if (local1053 >= local13263.aClass116Array1.length) {
							@Pc(14708) Class116[] local14708 = new Class116[local1053 + 1];
							for (local4494 = 0; local4494 < local13263.aClass116Array1.length; local4494++) {
								local14708[local4494] = local13263.aClass116Array1[local4494];
							}
							local13263.aClass116Array1 = local14708;
						}
						if (local1053 > 0 && local13263.aClass116Array1[local1053 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1053 - 1));
						}
						@Pc(14758) Class116 local14758 = new Class116();
						local14758.anInt4297 = local1053;
						local14758.aBoolean224 = true;
						local14758.anInt4344 = local14758.anInt4290 = local13263.anInt4290;
						local14758.anInt4376 = local814;
						local13263.aClass116Array1[local1053] = local14758;
						if (local1024) {
							Static299.aClass116_19 = local14758;
						} else {
							Static260.aClass116_17 = local14758;
						}
						Static189.method3378(local13263);
						continue;
					}
					throw new RuntimeException();
				} else {
					@Pc(14825) Class116 local14825;
					if (local223 == 101) {
						local1180 = local1024 ? Static299.aClass116_19 : Static260.aClass116_17;
						if (local1180.anInt4297 == -1) {
							if (local1024) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local14825 = Static115.method1897(local1180.anInt4290);
						local14825.aClass116Array1[local1180.anInt4297] = null;
						Static189.method3378(local14825);
						continue;
					}
					if (local223 == 102) {
						local28--;
						local1180 = Static115.method1897(Static222.anIntArray512[local28]);
						local1180.aClass116Array1 = null;
						Static189.method3378(local1180);
						continue;
					}
					if (local223 == 200) {
						local28 -= 2;
						local820 = Static222.anIntArray512[local28];
						local814 = Static222.anIntArray512[local28 + 1];
						local13291 = Static127.method2179(local814, local820);
						if (local13291 != null && local814 != -1) {
							Static222.anIntArray512[local28++] = 1;
							if (local1024) {
								Static299.aClass116_19 = local13291;
							} else {
								Static260.aClass116_17 = local13291;
							}
							continue;
						}
						Static222.anIntArray512[local28++] = 0;
						continue;
					}
					if (local223 == 201) {
						local28--;
						local820 = Static222.anIntArray512[local28];
						local14825 = Static115.method1897(local820);
						if (local14825 == null) {
							Static222.anIntArray512[local28++] = 0;
						} else {
							Static222.anIntArray512[local28++] = 1;
							if (local1024) {
								Static299.aClass116_19 = local14825;
							} else {
								Static260.aClass116_17 = local14825;
							}
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14949) Exception local14949) {
			if (local20.aString79 == null) {
				if (Static105.anInt6119 != 0) {
					Static89.method1540(0, "", "Clientscript error - check log for details");
				}
				Static217.method3829("CS2 - scr:" + local20.aLong201 + " op:" + local40, local14949);
			} else {
				@Pc(14957) StringBuffer local14957 = new StringBuffer(30);
				local14957.append("%0a - in: ").append(local20.aString79);
				for (local54 = Static269.anInt5828 - 1; local54 >= 0; local54--) {
					local14957.append("%0a - via: ").append(Static54.aClass160Array1[local54].aClass1_Sub2_Sub11_1.aString79);
				}
				if (local40 == 40) {
					local54 = local38[local32];
					local14957.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local54));
				}
				if (Static105.anInt6119 != 0) {
					Static89.method1540(0, "", "Clientscript error in: " + local20.aString79);
				}
				Static217.method3829("CS2 - scr:" + local20.aLong201 + " op:" + local40 + local14957.toString(), local14949);
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I")
	public static int method681() {
		return 15;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILclient!ok;II)V")
	public static void method684(@OriginalArg(0) int arg0, @OriginalArg(2) Class116 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static96.method1648();
		if (Static296.aBoolean335) {
			Static288.method4714(arg2, arg0, arg1.anInt4299 + arg2, arg0 + arg1.anInt4363);
		} else {
			Static203.method3590(arg2, arg0, arg1.anInt4299 + arg2, arg1.anInt4363 + arg0);
		}
		if (Static71.anInt1777 != 2 && Static71.anInt1777 != 5 && Static253.aClass1_Sub2_Sub14_9 != null) {
			@Pc(58) int local58 = Static59.anInt1529 + (int) Static125.aFloat97 & 0x7FF;
			@Pc(67) int local67 = Static239.aClass25_Sub1_Sub1_2.anInt1635 / 32 + 48;
			@Pc(77) int local77 = 464 - Static239.aClass25_Sub1_Sub1_2.anInt1604 / 32;
			if (Static296.aBoolean335) {
				((Class1_Sub2_Sub14_Sub2) Static253.aClass1_Sub2_Sub14_9).method2739(arg2, arg0, arg1.anInt4299, arg1.anInt4363, local67, local77, local58, Static16.anInt453 + 256, (Class1_Sub2_Sub14_Sub2) arg1.method3422(false));
			} else {
				((Class1_Sub2_Sub14_Sub1) Static253.aClass1_Sub2_Sub14_9).method2474(arg2, arg0, arg1.anInt4299, arg1.anInt4363, local67, local77, local58, Static16.anInt453 + 256, arg1.anIntArray399, arg1.anIntArray388);
			}
			@Pc(160) int local160;
			@Pc(180) int local180;
			@Pc(184) int local184;
			@Pc(196) int local196;
			@Pc(214) int local214;
			@Pc(227) int local227;
			@Pc(254) int local254;
			@Pc(288) int local288;
			if (Static25.aClass78_1 != null) {
				for (@Pc(126) int local126 = 0; local126 < Static25.aClass78_1.anInt2855; local126++) {
					if (Static25.aClass78_1.method2180(local126)) {
						local160 = ((Static25.aClass78_1.anIntArray264[local126] >> 14 & 0x3FFF) - Static82.anInt1972) * 4 + 2 - Static239.aClass25_Sub1_Sub1_2.anInt1635 / 32;
						local180 = ((Static25.aClass78_1.anIntArray264[local126] & 0x3FFF) - Static266.anInt5790) * 4 + 2 - Static239.aClass25_Sub1_Sub1_2.anInt1604 / 32;
						local184 = Class91.anIntArray319[local58];
						@Pc(192) int local192 = local184 * 256 / (Static16.anInt453 + 256);
						local196 = Class91.anIntArray320[local58];
						@Pc(204) int local204 = local196 * 256 / (Static16.anInt453 + 256);
						local214 = local192 * local180 + local204 * local160 >> 16;
						@Pc(216) Class1_Sub2_Sub16 local216 = Static14.aClass1_Sub2_Sub16_1;
						local227 = local180 * local204 - local192 * local160 >> 16;
						if (Static25.aClass78_1.method2182(local126) == 1) {
							local216 = Static58.aClass1_Sub2_Sub16_2;
						}
						if (Static25.aClass78_1.method2182(local126) == 2) {
							local216 = Static156.aClass1_Sub2_Sub16_3;
						}
						local254 = local216.method3967(Static25.aClass78_1.aStringArray14[local126], 100);
						local214 -= local254 / 2;
						if (local214 >= -arg1.anInt4299 && arg1.anInt4299 >= local214 && local227 >= -arg1.anInt4363 && arg1.anInt4363 >= local227) {
							local288 = 16777215;
							if (Static25.aClass78_1.anIntArray265[local126] != -1) {
								local288 = Static25.aClass78_1.anIntArray265[local126];
							}
							if (Static296.aBoolean335) {
								Static288.method4721((Class1_Sub2_Sub14_Sub2) arg1.method3422(false));
							} else {
								Static203.method3610(arg1.anIntArray399, arg1.anIntArray388);
							}
							local216.method3971(Static25.aClass78_1.aStringArray14[local126], arg1.anInt4299 / 2 + local214 + arg2, -local227 + arg0 + arg1.anInt4363 / 2, local254, 50, local288, 0, 1, 0, 0);
							if (Static296.aBoolean335) {
								Static288.method4724();
							} else {
								Static203.method3612();
							}
						}
					}
				}
			}
			for (local160 = 0; local160 < Static232.anInt5145; local160++) {
				local180 = Static190.anIntArray381[local160] * 4 + 2 - Static239.aClass25_Sub1_Sub1_2.anInt1635 / 32;
				local184 = Static40.anIntArray203[local160] * 4 + 2 - Static239.aClass25_Sub1_Sub1_2.anInt1604 / 32;
				@Pc(403) Class30 local403 = Static268.method4511(Static165.anIntArray342[local160]);
				if (local403.anIntArray93 != null) {
					local403 = local403.method688();
					if (local403 == null || local403.anInt832 == -1) {
						continue;
					}
				}
				Static167.method3092(local180, arg0, arg2, local184, arg1, Static208.aClass1_Sub2_Sub14Array14[local403.anInt832]);
			}
			for (local160 = 0; local160 < 104; local160++) {
				for (local180 = 0; local180 < 104; local180++) {
					@Pc(452) Class131 local452 = Static240.aClass131ArrayArrayArray1[Static145.anInt3477][local160][local180];
					if (local452 != null) {
						local214 = local180 * 4 + 2 - Static239.aClass25_Sub1_Sub1_2.anInt1604 / 32;
						local196 = local160 * 4 + 2 - Static239.aClass25_Sub1_Sub1_2.anInt1635 / 32;
						Static167.method3092(local196, arg0, arg2, local214, arg1, Static99.aClass1_Sub2_Sub14Array11[0]);
					}
				}
			}
			for (local160 = 0; local160 < Static147.anInt3493; local160++) {
				@Pc(509) Class25_Sub1_Sub2 local509 = Static27.aClass25_Sub1_Sub2Array1[Static65.anIntArray25[local160]];
				if (local509 != null && local509.method1244()) {
					@Pc(518) Class143 local518 = local509.aClass143_1;
					if (local518 != null && local518.anIntArray535 != null) {
						local518 = local518.method4065();
					}
					if (local518 != null && local518.aBoolean279 && local518.aBoolean282) {
						local196 = local509.anInt1635 / 32 - Static239.aClass25_Sub1_Sub1_2.anInt1635 / 32;
						local214 = local509.anInt1604 / 32 - Static239.aClass25_Sub1_Sub1_2.anInt1604 / 32;
						if (local518.anInt5189 == -1) {
							Static167.method3092(local196, arg0, arg2, local214, arg1, Static99.aClass1_Sub2_Sub14Array11[1]);
						} else {
							Static167.method3092(local196, arg0, arg2, local214, arg1, Static208.aClass1_Sub2_Sub14Array14[local518.anInt5189]);
						}
					}
				}
			}
			for (local160 = 0; local160 < Static266.anInt5789; local160++) {
				@Pc(607) Class25_Sub1_Sub1 local607 = Static271.aClass25_Sub1_Sub1Array1[Static39.anIntArray108[local160]];
				if (local607 != null && local607.method1244()) {
					local184 = local607.anInt1635 / 32 - Static239.aClass25_Sub1_Sub1_2.anInt1635 / 32;
					local196 = local607.anInt1604 / 32 - Static239.aClass25_Sub1_Sub1_2.anInt1604 / 32;
					@Pc(637) boolean local637 = false;
					@Pc(642) long local642 = Static94.method4774(local607.aString26);
					for (local254 = 0; local254 < Static180.anInt4068; local254++) {
						if (local642 == Static286.aLongArray11[local254] && Static233.anIntArray532[local254] != 0) {
							local637 = true;
							break;
						}
					}
					@Pc(671) boolean local671 = false;
					for (local288 = 0; local288 < Static246.anInt5378; local288++) {
						if (Static79.aClass1_Sub29Array1[local288].aLong201 == local642) {
							local671 = true;
							break;
						}
					}
					@Pc(692) boolean local692 = false;
					if (Static239.aClass25_Sub1_Sub1_2.anInt713 != 0 && local607.anInt713 != 0 && local607.anInt713 == Static239.aClass25_Sub1_Sub1_2.anInt713) {
						local692 = true;
					}
					if (local637) {
						Static167.method3092(local184, arg0, arg2, local196, arg1, Static99.aClass1_Sub2_Sub14Array11[3]);
					} else if (local671) {
						Static167.method3092(local184, arg0, arg2, local196, arg1, Static99.aClass1_Sub2_Sub14Array11[5]);
					} else if (local692) {
						Static167.method3092(local184, arg0, arg2, local196, arg1, Static99.aClass1_Sub2_Sub14Array11[4]);
					} else {
						Static167.method3092(local184, arg0, arg2, local196, arg1, Static99.aClass1_Sub2_Sub14Array11[2]);
					}
				}
			}
			local180 = 0;
			@Pc(768) Class81[] local768 = Static129.aClass81Array1;
			while (local768.length > local180) {
				@Pc(776) Class81 local776 = local768[local180];
				if (local776 != null && local776.anInt3022 != 0 && Static32.anInt809 % 20 < 10) {
					if (local776.anInt3022 == 1 && local776.anInt3010 >= 0 && local776.anInt3010 < Static27.aClass25_Sub1_Sub2Array1.length) {
						@Pc(812) Class25_Sub1_Sub2 local812 = Static27.aClass25_Sub1_Sub2Array1[local776.anInt3010];
						if (local812 != null) {
							local214 = local812.anInt1635 / 32 - Static239.aClass25_Sub1_Sub1_2.anInt1635 / 32;
							local227 = local812.anInt1604 / 32 - Static239.aClass25_Sub1_Sub1_2.anInt1604 / 32;
							Static23.method395(local227, 360000, arg1, arg2, local214, arg0, local776.anInt3011);
						}
					}
					if (local776.anInt3022 == 2) {
						local227 = local776.anInt3009 * 4;
						local227 *= local227;
						local196 = (local776.anInt3020 - Static82.anInt1972) * 4 + 2 - Static239.aClass25_Sub1_Sub1_2.anInt1635 / 32;
						local214 = (local776.anInt3012 - Static266.anInt5790) * 4 + 2 - Static239.aClass25_Sub1_Sub1_2.anInt1604 / 32;
						Static23.method395(local214, local227, arg1, arg2, local196, arg0, local776.anInt3011);
					}
					if (local776.anInt3022 == 10 && local776.anInt3010 >= 0 && Static271.aClass25_Sub1_Sub1Array1.length > local776.anInt3010) {
						@Pc(921) Class25_Sub1_Sub1 local921 = Static271.aClass25_Sub1_Sub1Array1[local776.anInt3010];
						if (local921 != null) {
							local214 = local921.anInt1635 / 32 - Static239.aClass25_Sub1_Sub1_2.anInt1635 / 32;
							local227 = local921.anInt1604 / 32 - Static239.aClass25_Sub1_Sub1_2.anInt1604 / 32;
							Static23.method395(local227, 360000, arg1, arg2, local214, arg0, local776.anInt3011);
						}
					}
				}
				local180++;
			}
			if (Static4.anInt139 != 0) {
				local160 = Static4.anInt139 * 4 + Static239.aClass25_Sub1_Sub1_2.method1243() * 2 + 2 - Static239.aClass25_Sub1_Sub1_2.anInt1635 / 32 - 2;
				local180 = Static52.anInt1401 * 4 + Static239.aClass25_Sub1_Sub1_2.method1243() * 2 + 2 - Static239.aClass25_Sub1_Sub1_2.anInt1604 / 32 - 2;
				Static167.method3092(local160, arg0, arg2, local180, arg1, Static238.aClass1_Sub2_Sub14_8);
			}
			if (Static296.aBoolean335) {
				Static288.method4713(arg1.anInt4299 / 2 + arg2 - 1, arg1.anInt4363 / 2 + arg0 + -1, 3, 3, 16777215);
			} else {
				Static203.method3592(arg1.anInt4299 / 2 + arg2 - 1, arg0 + -1 + arg1.anInt4363 / 2, 3, 3, 16777215);
			}
		} else if (Static296.aBoolean335) {
			@Pc(1073) Class1_Sub2_Sub14 local1073 = arg1.method3422(false);
			if (local1073 != null) {
				local1073.method2727(arg2, arg0);
			}
		} else {
			Static203.method3600(arg2, arg0, arg1.anIntArray399, arg1.anIntArray388);
		}
		Static138.aBooleanArray13[arg3] = true;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)Lclient!ul;")
	public static Class162 method687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub14 local7 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class162 local14 = local7.aClass162_1;
			local7.aClass162_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(III)V")
	public static void method689() {
		for (@Pc(1) int local1 = 0; local1 < Static156.anInt3577; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static212.anInt4717; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static293.anInt6189; local11++) {
					@Pc(22) Class1_Sub14 local22 = Static132.aClass1_Sub14ArrayArrayArray2[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Class133 local27 = local22.aClass133_1;
						if (local27 != null && local27.aClass25_4.method4766()) {
							Static274.method2239(local27.aClass25_4, local1, local6, local11, 1, 1);
							if (local27.aClass25_5 != null && local27.aClass25_5.method4766()) {
								Static274.method2239(local27.aClass25_5, local1, local6, local11, 1, 1);
								local27.aClass25_4.method4770(local27.aClass25_5, 0, 0, 0, false);
								local27.aClass25_5 = local27.aClass25_5.method4771();
							}
							local27.aClass25_4 = local27.aClass25_4.method4771();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.anInt2332; local83++) {
							@Pc(92) Class152 local92 = local22.aClass152Array1[local83];
							if (local92 != null && local92.aClass25_6.method4766()) {
								Static274.method2239(local92.aClass25_6, local1, local6, local11, local92.anInt5510 + 1 - local92.anInt5509, local92.anInt5512 - local92.anInt5519 + 1);
								local92.aClass25_6 = local92.aClass25_6.method4771();
							}
						}
						@Pc(131) Class162 local131 = local22.aClass162_1;
						if (local131 != null && local131.aClass25_7.method4766()) {
							Static196.method3517(local131.aClass25_7, local1, local6, local11);
							local131.aClass25_7 = local131.aClass25_7.method4771();
						}
					}
				}
			}
		}
	}
}
