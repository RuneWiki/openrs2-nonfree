import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "Lclient!gh;")
	private static Class89 aClass89_4;

	@OriginalMember(owner = "client!dq", name = "l", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray11;

	@OriginalMember(owner = "client!dq", name = "t", descriptor = "Lclient!dw;")
	private static Class62 aClass62_1;

	@OriginalMember(owner = "client!dq", name = "x", descriptor = "Lclient!gh;")
	private static Class89 aClass89_5;

	@OriginalMember(owner = "client!dq", name = "y", descriptor = "[I")
	private static int[] anIntArray127;

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "[[I")
	private static final int[][] anIntArrayArray9 = new int[5][5000];

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "[Lclient!eh;")
	private static final Class67[] aClass67Array1 = new Class67[50];

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray10 = new String[1000];

	@OriginalMember(owner = "client!dq", name = "o", descriptor = "I")
	private static int anInt1657 = 0;

	@OriginalMember(owner = "client!dq", name = "p", descriptor = "[I")
	private static final int[] anIntArray125 = new int[1000];

	@OriginalMember(owner = "client!dq", name = "r", descriptor = "I")
	private static int anInt1659 = 0;

	@OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
	private static int anInt1660 = 0;

	@OriginalMember(owner = "client!dq", name = "u", descriptor = "[I")
	private static final int[] anIntArray126 = new int[5];

	@OriginalMember(owner = "client!dq", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray12 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!dq", name = "A", descriptor = "[I")
	private static final int[] anIntArray128 = new int[3];

	@OriginalMember(owner = "client!dq", name = "B", descriptor = "Lclient!wm;")
	public static final Class267 aClass267_14 = new Class267(4);

	@OriginalMember(owner = "client!dq", name = "C", descriptor = "I")
	private static int anInt1663 = 0;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method1500(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static200.anInt3974 == 0 && (Static376.aBoolean422 && !Static111.aBoolean380 || Static269.aBoolean320)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static399.aClass182_230.method4155(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static399.aClass182_230.method4155(0).length());
		} else if (local11.startsWith(Static285.aClass182_178.method4155(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static285.aClass182_178.method4155(0).length());
		} else if (local11.startsWith(Static197.aClass182_134.method4155(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static197.aClass182_134.method4155(0).length());
		} else if (local11.startsWith(Static97.aClass182_54.method4155(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static97.aClass182_54.method4155(0).length());
		} else if (local11.startsWith(Static353.aClass182_217.method4155(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static353.aClass182_217.method4155(0).length());
		} else if (local11.startsWith(Static195.aClass182_130.method4155(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static195.aClass182_130.method4155(0).length());
		} else if (local11.startsWith(Static173.aClass182_121.method4155(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static173.aClass182_121.method4155(0).length());
		} else if (local11.startsWith(Static282.aClass182_175.method4155(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static282.aClass182_175.method4155(0).length());
		} else if (local11.startsWith(Static188.aClass182_128.method4155(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static188.aClass182_128.method4155(0).length());
		} else if (local11.startsWith(Static452.aClass182_164.method4155(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static452.aClass182_164.method4155(0).length());
		} else if (local11.startsWith(Static277.aClass182_162.method4155(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static277.aClass182_162.method4155(0).length());
		} else if (local11.startsWith(Static105.aClass182_80.method4155(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static105.aClass182_80.method4155(0).length());
		} else if (Static191.anInt3842 != 0) {
			if (local11.startsWith(Static399.aClass182_230.method4155(Static191.anInt3842))) {
				local13 = 0;
				arg0 = arg0.substring(Static399.aClass182_230.method4155(Static191.anInt3842).length());
			} else if (local11.startsWith(Static285.aClass182_178.method4155(Static191.anInt3842))) {
				local13 = 1;
				arg0 = arg0.substring(Static285.aClass182_178.method4155(Static191.anInt3842).length());
			} else if (local11.startsWith(Static197.aClass182_134.method4155(Static191.anInt3842))) {
				local13 = 2;
				arg0 = arg0.substring(Static197.aClass182_134.method4155(Static191.anInt3842).length());
			} else if (local11.startsWith(Static97.aClass182_54.method4155(Static191.anInt3842))) {
				local13 = 3;
				arg0 = arg0.substring(Static97.aClass182_54.method4155(Static191.anInt3842).length());
			} else if (local11.startsWith(Static353.aClass182_217.method4155(Static191.anInt3842))) {
				local13 = 4;
				arg0 = arg0.substring(Static353.aClass182_217.method4155(Static191.anInt3842).length());
			} else if (local11.startsWith(Static195.aClass182_130.method4155(Static191.anInt3842))) {
				local13 = 5;
				arg0 = arg0.substring(Static195.aClass182_130.method4155(Static191.anInt3842).length());
			} else if (local11.startsWith(Static173.aClass182_121.method4155(Static191.anInt3842))) {
				local13 = 6;
				arg0 = arg0.substring(Static173.aClass182_121.method4155(Static191.anInt3842).length());
			} else if (local11.startsWith(Static282.aClass182_175.method4155(Static191.anInt3842))) {
				local13 = 7;
				arg0 = arg0.substring(Static282.aClass182_175.method4155(Static191.anInt3842).length());
			} else if (local11.startsWith(Static188.aClass182_128.method4155(Static191.anInt3842))) {
				local13 = 8;
				arg0 = arg0.substring(Static188.aClass182_128.method4155(Static191.anInt3842).length());
			} else if (local11.startsWith(Static452.aClass182_164.method4155(Static191.anInt3842))) {
				local13 = 9;
				arg0 = arg0.substring(Static452.aClass182_164.method4155(Static191.anInt3842).length());
			} else if (local11.startsWith(Static277.aClass182_162.method4155(Static191.anInt3842))) {
				local13 = 10;
				arg0 = arg0.substring(Static277.aClass182_162.method4155(Static191.anInt3842).length());
			} else if (local11.startsWith(Static105.aClass182_80.method4155(Static191.anInt3842))) {
				local13 = 11;
				arg0 = arg0.substring(Static105.aClass182_80.method4155(Static191.anInt3842).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static297.aClass182_184.method4155(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static297.aClass182_184.method4155(0).length());
		} else if (local11.startsWith(Static440.aClass182_252.method4155(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static440.aClass182_252.method4155(0).length());
		} else if (local11.startsWith(Static74.aClass182_61.method4155(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static74.aClass182_61.method4155(0).length());
		} else if (local11.startsWith(Static5.aClass182_2.method4155(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static5.aClass182_2.method4155(0).length());
		} else if (local11.startsWith(Static126.aClass182_100.method4155(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static126.aClass182_100.method4155(0).length());
		} else if (Static191.anInt3842 != 0) {
			if (local11.startsWith(Static297.aClass182_184.method4155(Static191.anInt3842))) {
				local451 = 1;
				arg0 = arg0.substring(Static297.aClass182_184.method4155(Static191.anInt3842).length());
			} else if (local11.startsWith(Static440.aClass182_252.method4155(Static191.anInt3842))) {
				local451 = 2;
				arg0 = arg0.substring(Static440.aClass182_252.method4155(Static191.anInt3842).length());
			} else if (local11.startsWith(Static74.aClass182_61.method4155(Static191.anInt3842))) {
				local451 = 3;
				arg0 = arg0.substring(Static74.aClass182_61.method4155(Static191.anInt3842).length());
			} else if (local11.startsWith(Static5.aClass182_2.method4155(Static191.anInt3842))) {
				local451 = 4;
				arg0 = arg0.substring(Static5.aClass182_2.method4155(Static191.anInt3842).length());
			} else if (local11.startsWith(Static126.aClass182_100.method4155(Static191.anInt3842))) {
				local451 = 5;
				arg0 = arg0.substring(Static126.aClass182_100.method4155(Static191.anInt3842).length());
			}
		}
		Static310.method4308(Static35.aClass27_14);
		Static337.aClass10_Sub8_Sub2_2.method2458(0);
		@Pc(646) int local646 = Static337.aClass10_Sub8_Sub2_2.anInt2989;
		if (arg1 == 5021) {
			Static337.aClass10_Sub8_Sub2_2.method2458(1);
		} else if (arg1 == 5022) {
			Static337.aClass10_Sub8_Sub2_2.method2458(2);
		} else {
			Static337.aClass10_Sub8_Sub2_2.method2458(0);
		}
		Static337.aClass10_Sub8_Sub2_2.method2458(local13);
		Static337.aClass10_Sub8_Sub2_2.method2458(local451);
		Static402.method5294(Static337.aClass10_Sub8_Sub2_2, arg0);
		Static337.aClass10_Sub8_Sub2_2.method2472(Static337.aClass10_Sub8_Sub2_2.anInt2989 - local646);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!sj;)V")
	public static void method1501(@OriginalArg(0) Class10_Sub40 arg0) {
		method1504(arg0, 200000);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)Ljava/lang/String;")
	private static String method1502(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray12[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
	public static void method1503(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static419.method5518(arg0)) {
			return;
		}
		@Pc(12) Class89[] local12 = Static166.aClass89ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class89 local19 = local12[local14];
			if (local19.anObjectArray26 != null) {
				@Pc(26) Class10_Sub40 local26 = new Class10_Sub40();
				local26.aClass89_12 = local19;
				local26.anObjectArray36 = local19.anObjectArray26;
				method1504(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!sj;I)V")
	private static void method1504(@OriginalArg(0) Class10_Sub40 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray36;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class10_Sub1_Sub11 local12 = Static200.method3150(local8);
		if (local12 == null) {
			return;
		}
		anIntArray127 = new int[local12.anInt4479];
		@Pc(21) int local21 = 0;
		aStringArray11 = new String[local12.anInt4478];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt6391;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt6386;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass89_12 == null ? -1 : arg0.aClass89_12.anInt2677;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt6383;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass89_12 == null ? -1 : arg0.aClass89_12.anInt2720;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass89_11 == null ? -1 : arg0.aClass89_11.anInt2677;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass89_11 == null ? -1 : arg0.aClass89_11.anInt2720;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt6384;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt6387;
				}
				anIntArray127[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString60;
				}
				aStringArray11[local27++] = local135;
			}
		}
		anInt1663 = arg0.anInt6390;
		method1505(local12, arg1);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!md;I)V")
	private static void method1505(@OriginalArg(0) Class10_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		anInt1660 = 0;
		anInt1657 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray447;
		@Pc(11) int[] local11 = arg0.anIntArray448;
		@Pc(13) byte local13 = -1;
		anInt1659 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label260: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(802) boolean local802;
					if (local11[local5] == 1) {
						local802 = true;
					} else {
						local802 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method1509(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method1508(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray125[anInt1660++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray125[anInt1660++] = Static329.aClass201_9.anIntArray549[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static329.aClass201_9.method4484(anIntArray125[--anInt1660], local54);
					} else if (local31 == 3) {
						aStringArray10[anInt1657++] = arg0.aStringArray30[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt1660 -= 2;
						if (anIntArray125[anInt1660] != anIntArray125[anInt1660 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt1660 -= 2;
						if (anIntArray125[anInt1660] == anIntArray125[anInt1660 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt1660 -= 2;
						if (anIntArray125[anInt1660] < anIntArray125[anInt1660 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt1660 -= 2;
						if (anIntArray125[anInt1660] > anIntArray125[anInt1660 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt1659 == 0) {
							return;
						}
						@Pc(216) Class67 local216 = aClass67Array1[--anInt1659];
						arg0 = local216.aClass10_Sub1_Sub11_1;
						local8 = arg0.anIntArray447;
						local11 = arg0.anIntArray448;
						local5 = local216.anInt1910;
						anIntArray127 = local216.anIntArray156;
						aStringArray11 = local216.aStringArray16;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray125[anInt1660++] = Static329.aClass201_9.method4477(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static329.aClass201_9.method4485(anIntArray125[--anInt1660], local54);
					} else if (local31 == 31) {
						anInt1660 -= 2;
						if (anIntArray125[anInt1660] <= anIntArray125[anInt1660 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt1660 -= 2;
						if (anIntArray125[anInt1660] >= anIntArray125[anInt1660 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray125[anInt1660++] = anIntArray127[local11[local5]];
					} else if (local31 == 34) {
						anIntArray127[local11[local5]] = anIntArray125[--anInt1660];
					} else if (local31 == 35) {
						aStringArray10[anInt1657++] = aStringArray11[local11[local5]];
					} else if (local31 == 36) {
						aStringArray11[local11[local5]] = aStringArray10[--anInt1657];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt1657 -= local54;
						@Pc(400) String local400 = Static263.method5393(anInt1657, local54, aStringArray10);
						aStringArray10[anInt1657++] = local400;
					} else if (local31 == 38) {
						anInt1660--;
					} else if (local31 == 39) {
						anInt1657--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class10_Sub1_Sub11 local436 = Static200.method3150(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt4479];
							@Pc(450) String[] local450 = new String[local436.anInt4478];
							for (local452 = 0; local452 < local436.anInt4477; local452++) {
								local446[local452] = anIntArray125[anInt1660 + local452 - local436.anInt4477];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt4476; local471++) {
								local450[local471] = aStringArray10[anInt1657 + local471 - local436.anInt4476];
							}
							anInt1660 -= local436.anInt4477;
							anInt1657 -= local436.anInt4476;
							@Pc(502) Class67 local502 = new Class67();
							local502.aClass10_Sub1_Sub11_1 = arg0;
							local502.anInt1910 = local5;
							local502.anIntArray156 = anIntArray127;
							local502.aStringArray16 = aStringArray11;
							if (anInt1659 >= aClass67Array1.length) {
								throw new RuntimeException();
							}
							aClass67Array1[anInt1659++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray447;
							local11 = local436.anIntArray448;
							local5 = -1;
							anIntArray127 = local446;
							aStringArray11 = local450;
						} else if (local31 == 42) {
							anIntArray125[anInt1660++] = Static136.anIntArray282[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static136.anIntArray282[local54] = anIntArray125[--anInt1660];
							Static204.method3195(local54);
							Static5.aBoolean4 |= Static156.aBooleanArray7[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray125[--anInt1660];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray126[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray9[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray125[--anInt1660];
							if (local603 < 0 || local603 >= anIntArray126[local54]) {
								throw new RuntimeException();
							}
							anIntArray125[anInt1660++] = anIntArrayArray9[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt1660 -= 2;
							local603 = anIntArray125[anInt1660];
							if (local603 < 0 || local603 >= anIntArray126[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray9[local54][local603] = anIntArray125[anInt1660 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static195.aStringArray29[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray10[anInt1657++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static195.aStringArray29[local54] = aStringArray10[--anInt1657];
							Static199.method3238(local54);
						} else if (local31 == 51) {
							@Pc(774) Class167 local774 = arg0.aClass167Array1[local11[local5]];
							@Pc(787) Class10_Sub12 local787 = (Class10_Sub12) local774.method3709((long) anIntArray125[--anInt1660]);
							if (local787 != null) {
								local5 += local787.anInt1159;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString46 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong264).append(" ");
				for (local603 = anInt1659 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass67Array1[local603].aClass10_Sub1_Sub11_1.aLong264).append(" ");
				}
				local855.append("op: ").append(local13);
				Static432.method5720(local855.toString(), local837);
			} else {
				Static404.method5326("Clientscript error in: " + arg0.aString46);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString46).append("\n");
				for (local603 = anInt1659 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass67Array1[local603].aClass10_Sub1_Sub11_1.aString46).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static432.method5720(local855.toString(), local837);
				Static16.method251(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "()V")
	public static void method1507() {
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZ)V")
	private static void method1508(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray125[anInt1660++] = Static35.anInt576;
				return;
			}
			if (arg0 == 5001) {
				anInt1660 -= 3;
				Static35.anInt576 = anIntArray125[anInt1660];
				Static78.aClass153_2 = Static258.method3718(anIntArray125[anInt1660 + 1]);
				if (Static78.aClass153_2 == null) {
					Static78.aClass153_2 = Static68.aClass153_1;
				}
				Static369.anInt6375 = anIntArray125[anInt1660 + 2];
				Static310.method4308(Static25.aClass27_10);
				Static337.aClass10_Sub8_Sub2_2.method2458(Static35.anInt576);
				Static337.aClass10_Sub8_Sub2_2.method2458(Static78.aClass153_2.anInt4248);
				Static337.aClass10_Sub8_Sub2_2.method2458(Static369.anInt6375);
				return;
			}
			if (arg0 == 5002) {
				anInt1657 -= 2;
				local75 = aStringArray10[anInt1657];
				local81 = aStringArray10[anInt1657 + 1];
				anInt1660 -= 2;
				local89 = anIntArray125[anInt1660];
				local95 = anIntArray125[anInt1660 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static310.method4308(Static92.aClass27_38);
				Static337.aClass10_Sub8_Sub2_2.method2458(Static119.method2056(local75) + Static119.method2056(local81) + 2);
				Static337.aClass10_Sub8_Sub2_2.method2465(local75);
				Static337.aClass10_Sub8_Sub2_2.method2458(local89 - 1);
				Static337.aClass10_Sub8_Sub2_2.method2458(local95);
				Static337.aClass10_Sub8_Sub2_2.method2465(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray125[--anInt1660];
				local81 = null;
				if (local157 < 100) {
					local81 = Static170.aStringArray26[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray10[anInt1657++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray125[--anInt1660];
				local192 = -1;
				if (local157 < 100 && Static170.aStringArray26[local157] != null) {
					local192 = Static113.anIntArray203[local157];
				}
				anIntArray125[anInt1660++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static78.aClass153_2 == null) {
					anIntArray125[anInt1660++] = -1;
					return;
				}
				anIntArray125[anInt1660++] = Static78.aClass153_2.anInt4248;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray10[--anInt1657];
				method1500(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt1657 -= 2;
				local75 = aStringArray10[anInt1657];
				local81 = aStringArray10[anInt1657 + 1];
				if (Static200.anInt3974 != 0 || (!Static376.aBoolean422 || Static111.aBoolean380) && !Static269.aBoolean320) {
					Static310.method4308(Static218.aClass27_68);
					Static337.aClass10_Sub8_Sub2_2.method2458(0);
					local89 = Static337.aClass10_Sub8_Sub2_2.anInt2989;
					Static337.aClass10_Sub8_Sub2_2.method2465(local75);
					Static402.method5294(Static337.aClass10_Sub8_Sub2_2, local81);
					Static337.aClass10_Sub8_Sub2_2.method2472(Static337.aClass10_Sub8_Sub2_2.anInt2989 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray125[--anInt1660];
				local81 = null;
				if (local157 < 100) {
					local81 = Static19.aStringArray2[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray10[anInt1657++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray125[--anInt1660];
				local81 = null;
				if (local157 < 100) {
					local81 = Static383.aStringArray49[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray10[anInt1657++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray125[--anInt1660];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static24.anIntArray37[local157];
				}
				anIntArray125[anInt1660++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static263.aClass24_Sub3_Sub2_Sub2_4 == null || Static263.aClass24_Sub3_Sub2_Sub2_4.aString57 == null) {
					local75 = Static2.aString1;
				} else {
					local75 = Static263.aClass24_Sub3_Sub2_Sub2_4.method4933();
				}
				aStringArray10[anInt1657++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray125[anInt1660++] = Static369.anInt6375;
				return;
			}
			if (arg0 == 5017) {
				anIntArray125[anInt1660++] = Static442.anInt7400;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray125[--anInt1660];
				local192 = 0;
				if (local157 < 100 && Static170.aStringArray26[local157] != null) {
					local192 = Static449.anIntArray742[local157];
				}
				anIntArray125[anInt1660++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray125[--anInt1660];
				local81 = null;
				if (local157 < 100) {
					local81 = Static297.aStringArray33[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray10[anInt1657++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static263.aClass24_Sub3_Sub2_Sub2_4 == null || Static263.aClass24_Sub3_Sub2_Sub2_4.aString57 == null) {
					local75 = Static2.aString1;
				} else {
					local75 = Static263.aClass24_Sub3_Sub2_Sub2_4.method4927();
				}
				aStringArray10[anInt1657++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray125[--anInt1660];
				aStringArray10[anInt1657++] = Static349.aClass42_1.method1019(local157).aString30;
				return;
			}
			@Pc(589) Class10_Sub1_Sub9 local589;
			if (arg0 == 5051) {
				local157 = anIntArray125[--anInt1660];
				local589 = Static349.aClass42_1.method1019(local157);
				if (local589.anIntArray387 == null) {
					anIntArray125[anInt1660++] = 0;
					return;
				}
				anIntArray125[anInt1660++] = local589.anIntArray387.length;
				return;
			}
			if (arg0 == 5052) {
				anInt1660 -= 2;
				local157 = anIntArray125[anInt1660];
				local192 = anIntArray125[anInt1660 + 1];
				@Pc(634) Class10_Sub1_Sub9 local634 = Static349.aClass42_1.method1019(local157);
				local95 = local634.anIntArray387[local192];
				anIntArray125[anInt1660++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray125[--anInt1660];
				local589 = Static349.aClass42_1.method1019(local157);
				if (local589.anIntArray386 == null) {
					anIntArray125[anInt1660++] = 0;
					return;
				}
				anIntArray125[anInt1660++] = local589.anIntArray386.length;
				return;
			}
			if (arg0 == 5054) {
				anInt1660 -= 2;
				local157 = anIntArray125[anInt1660];
				local192 = anIntArray125[anInt1660 + 1];
				anIntArray125[anInt1660++] = Static349.aClass42_1.method1019(local157).anIntArray386[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray125[--anInt1660];
				aStringArray10[anInt1657++] = Static42.aClass248_1.method5371(local157).method3855();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray125[--anInt1660];
				@Pc(760) Class10_Sub1_Sub12 local760 = Static42.aClass248_1.method5371(local157);
				if (local760.anIntArray467 == null) {
					anIntArray125[anInt1660++] = 0;
					return;
				}
				anIntArray125[anInt1660++] = local760.anIntArray467.length;
				return;
			}
			if (arg0 == 5057) {
				anInt1660 -= 2;
				local157 = anIntArray125[anInt1660];
				local192 = anIntArray125[anInt1660 + 1];
				anIntArray125[anInt1660++] = Static42.aClass248_1.method5371(local157).anIntArray467[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass62_1 = new Class62();
				aClass62_1.anInt1812 = anIntArray125[--anInt1660];
				aClass62_1.aClass10_Sub1_Sub12_1 = Static42.aClass248_1.method5371(aClass62_1.anInt1812);
				aClass62_1.anIntArray140 = new int[aClass62_1.aClass10_Sub1_Sub12_1.method3863()];
				return;
			}
			if (arg0 == 5059) {
				Static310.method4308(Static85.aClass27_113);
				Static337.aClass10_Sub8_Sub2_2.method2458(0);
				local157 = Static337.aClass10_Sub8_Sub2_2.anInt2989;
				Static337.aClass10_Sub8_Sub2_2.method2458(0);
				Static337.aClass10_Sub8_Sub2_2.method2509(aClass62_1.anInt1812);
				aClass62_1.aClass10_Sub1_Sub12_1.method3854(Static337.aClass10_Sub8_Sub2_2, aClass62_1.anIntArray140);
				Static337.aClass10_Sub8_Sub2_2.method2472(Static337.aClass10_Sub8_Sub2_2.anInt2989 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray10[--anInt1657];
				Static310.method4308(Static216.aClass27_67);
				Static337.aClass10_Sub8_Sub2_2.method2458(0);
				local192 = Static337.aClass10_Sub8_Sub2_2.anInt2989;
				Static337.aClass10_Sub8_Sub2_2.method2465(local75);
				Static337.aClass10_Sub8_Sub2_2.method2509(aClass62_1.anInt1812);
				aClass62_1.aClass10_Sub1_Sub12_1.method3854(Static337.aClass10_Sub8_Sub2_2, aClass62_1.anIntArray140);
				Static337.aClass10_Sub8_Sub2_2.method2472(Static337.aClass10_Sub8_Sub2_2.anInt2989 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static310.method4308(Static85.aClass27_113);
				Static337.aClass10_Sub8_Sub2_2.method2458(0);
				local157 = Static337.aClass10_Sub8_Sub2_2.anInt2989;
				Static337.aClass10_Sub8_Sub2_2.method2458(1);
				Static337.aClass10_Sub8_Sub2_2.method2509(aClass62_1.anInt1812);
				aClass62_1.aClass10_Sub1_Sub12_1.method3854(Static337.aClass10_Sub8_Sub2_2, aClass62_1.anIntArray140);
				Static337.aClass10_Sub8_Sub2_2.method2472(Static337.aClass10_Sub8_Sub2_2.anInt2989 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt1660 -= 2;
				local157 = anIntArray125[anInt1660];
				local192 = anIntArray125[anInt1660 + 1];
				anIntArray125[anInt1660++] = Static349.aClass42_1.method1019(local157).aCharArray3[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt1660 -= 2;
				local157 = anIntArray125[anInt1660];
				local192 = anIntArray125[anInt1660 + 1];
				anIntArray125[anInt1660++] = Static349.aClass42_1.method1019(local157).aCharArray4[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt1660 -= 2;
				local157 = anIntArray125[anInt1660];
				local192 = anIntArray125[anInt1660 + 1];
				if (local192 == -1) {
					anIntArray125[anInt1660++] = -1;
					return;
				}
				anIntArray125[anInt1660++] = Static349.aClass42_1.method1019(local157).method3035((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt1660 -= 2;
				local157 = anIntArray125[anInt1660];
				local192 = anIntArray125[anInt1660 + 1];
				if (local192 == -1) {
					anIntArray125[anInt1660++] = -1;
					return;
				}
				anIntArray125[anInt1660++] = Static349.aClass42_1.method1019(local157).method3033((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray125[--anInt1660];
				anIntArray125[anInt1660++] = Static42.aClass248_1.method5371(local157).method3863();
				return;
			}
			if (arg0 == 5067) {
				anInt1660 -= 2;
				local157 = anIntArray125[anInt1660];
				local192 = anIntArray125[anInt1660 + 1];
				local89 = Static42.aClass248_1.method5371(local157).method3857(local192).anInt3831;
				anIntArray125[anInt1660++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt1660 -= 2;
				local157 = anIntArray125[anInt1660];
				local192 = anIntArray125[anInt1660 + 1];
				aClass62_1.anIntArray140[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt1660 -= 2;
				local157 = anIntArray125[anInt1660];
				local192 = anIntArray125[anInt1660 + 1];
				aClass62_1.anIntArray140[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt1660 -= 3;
				local157 = anIntArray125[anInt1660];
				local192 = anIntArray125[anInt1660 + 1];
				local89 = anIntArray125[anInt1660 + 2];
				@Pc(1265) Class10_Sub1_Sub12 local1265 = Static42.aClass248_1.method5371(local157);
				if (local1265.method3857(local192).anInt3831 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray125[anInt1660++] = local1265.method3852(local89, local192);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray10[--anInt1657];
				local1313 = anIntArray125[--anInt1660] == 1;
				Static300.method4152(local75, local1313);
				anIntArray125[anInt1660++] = Static9.anInt150;
				return;
			}
			if (arg0 == 5072) {
				if (Static260.aShortArray69 != null && Static452.anInt4834 < Static9.anInt150) {
					anIntArray125[anInt1660++] = Static260.aShortArray69[Static452.anInt4834++] & 0xFFFF;
					return;
				}
				anIntArray125[anInt1660++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static452.anInt4834 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static310.method4308(Static85.aClass27_113);
				Static337.aClass10_Sub8_Sub2_2.method2458(0);
				local157 = Static337.aClass10_Sub8_Sub2_2.anInt2989;
				Static337.aClass10_Sub8_Sub2_2.method2458(2);
				Static337.aClass10_Sub8_Sub2_2.method2509(aClass62_1.anInt1812);
				aClass62_1.aClass10_Sub1_Sub12_1.method3854(Static337.aClass10_Sub8_Sub2_2, aClass62_1.anIntArray140);
				Static337.aClass10_Sub8_Sub2_2.method2472(Static337.aClass10_Sub8_Sub2_2.anInt2989 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static197.aClass245_1.method5907(86)) {
					anIntArray125[anInt1660++] = 1;
					return;
				}
				anIntArray125[anInt1660++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static197.aClass245_1.method5907(82)) {
					anIntArray125[anInt1660++] = 1;
					return;
				}
				anIntArray125[anInt1660++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static197.aClass245_1.method5907(81)) {
					anIntArray125[anInt1660++] = 1;
					return;
				}
				anIntArray125[anInt1660++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static259.method4909(anIntArray125[--anInt1660]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray125[anInt1660++] = Static94.method1719();
					return;
				}
				if (arg0 == 5205) {
					Static156.method2635(false, anIntArray125[--anInt1660], -1, -1);
					return;
				}
				@Pc(1554) Class10_Sub1_Sub2 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray125[--anInt1660];
					local1554 = Static143.method2370(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray125[anInt1660++] = -1;
						return;
					}
					anIntArray125[anInt1660++] = local1554.anInt250;
					return;
				}
				@Pc(1587) Class10_Sub1_Sub2 local1587;
				if (arg0 == 5207) {
					local1587 = Static143.method2385(anIntArray125[--anInt1660]);
					if (local1587 != null && local1587.aString3 != null) {
						aStringArray10[anInt1657++] = local1587.aString3;
						return;
					}
					aStringArray10[anInt1657++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray125[anInt1660++] = Static316.anInt5456;
					anIntArray125[anInt1660++] = Static366.anInt6329;
					return;
				}
				if (arg0 == 5209) {
					anIntArray125[anInt1660++] = Static90.anInt1909 + Static143.anInt2867;
					anIntArray125[anInt1660++] = Static55.anInt999 + Static143.anInt2863;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray125[--anInt1660];
					local1554 = Static143.method2385(local157);
					if (local1554 == null) {
						anIntArray125[anInt1660++] = 0;
						anIntArray125[anInt1660++] = 0;
						return;
					}
					anIntArray125[anInt1660++] = local1554.anInt254 >> 14 & 0x3FFF;
					anIntArray125[anInt1660++] = local1554.anInt254 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray125[--anInt1660];
					local1554 = Static143.method2385(local157);
					if (local1554 == null) {
						anIntArray125[anInt1660++] = 0;
						anIntArray125[anInt1660++] = 0;
						return;
					}
					anIntArray125[anInt1660++] = local1554.anInt240 - local1554.anInt253;
					anIntArray125[anInt1660++] = local1554.anInt249 - local1554.anInt245;
					return;
				}
				@Pc(1777) Class10_Sub46 local1777;
				if (arg0 == 5212) {
					local1777 = Static255.method3699();
					if (local1777 == null) {
						anIntArray125[anInt1660++] = -1;
						anIntArray125[anInt1660++] = -1;
						return;
					}
					anIntArray125[anInt1660++] = local1777.anInt7522;
					local192 = local1777.anInt7521 << 28 | local1777.anInt7526 + Static143.anInt2867 << 14 | local1777.anInt7523 + Static143.anInt2863;
					anIntArray125[anInt1660++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static160.method2692();
					if (local1777 == null) {
						anIntArray125[anInt1660++] = -1;
						anIntArray125[anInt1660++] = -1;
						return;
					}
					anIntArray125[anInt1660++] = local1777.anInt7522;
					local192 = local1777.anInt7521 << 28 | local1777.anInt7526 + Static143.anInt2867 << 14 | local1777.anInt7523 + Static143.anInt2863;
					anIntArray125[anInt1660++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray125[--anInt1660];
					local1554 = Static363.method4867();
					if (local1554 != null) {
						local1925 = local1554.method201(local157 >> 28 & 0x3, anIntArray128, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1925) {
							Static384.method5155(anIntArray128[2], anIntArray128[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt1660 -= 2;
					local157 = anIntArray125[anInt1660];
					local192 = anIntArray125[anInt1660 + 1];
					@Pc(1963) Class136 local1963 = Static143.method2387(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class10_Sub1_Sub2 local1970 = (Class10_Sub1_Sub2) local1963.method3200(); local1970 != null; local1970 = (Class10_Sub1_Sub2) local1963.method3201()) {
						if (local1970.anInt250 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray125[anInt1660++] = 1;
						return;
					}
					anIntArray125[anInt1660++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray125[--anInt1660];
					local1554 = Static143.method2385(local157);
					if (local1554 == null) {
						anIntArray125[anInt1660++] = -1;
						return;
					}
					anIntArray125[anInt1660++] = local1554.anInt241;
					return;
				}
				if (arg0 == 5220) {
					anIntArray125[anInt1660++] = Static264.anInt4667 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray125[--anInt1660];
					Static384.method5155(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static363.method4867();
					if (local1587 != null) {
						local1313 = local1587.method197(Static55.anInt999 + Static143.anInt2863, Static90.anInt1909 + Static143.anInt2867, anIntArray128);
						if (local1313) {
							anIntArray125[anInt1660++] = anIntArray128[1];
							anIntArray125[anInt1660++] = anIntArray128[2];
							return;
						}
						anIntArray125[anInt1660++] = -1;
						anIntArray125[anInt1660++] = -1;
						return;
					}
					anIntArray125[anInt1660++] = -1;
					anIntArray125[anInt1660++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt1660 -= 2;
					local157 = anIntArray125[anInt1660];
					local192 = anIntArray125[anInt1660 + 1];
					Static156.method2635(false, local157, local192 & 0x3FFF, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray125[--anInt1660];
					local1554 = Static363.method4867();
					if (local1554 != null) {
						local1925 = local1554.method201(local157 >> 28 & 0x3, anIntArray128, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray125[anInt1660++] = anIntArray128[1];
							anIntArray125[anInt1660++] = anIntArray128[2];
							return;
						}
						anIntArray125[anInt1660++] = -1;
						anIntArray125[anInt1660++] = -1;
						return;
					}
					anIntArray125[anInt1660++] = -1;
					anIntArray125[anInt1660++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray125[--anInt1660];
					local1554 = Static363.method4867();
					if (local1554 != null) {
						local1925 = local1554.method197(local157 & 0x3FFF, local157 >> 14 & 0x3FFF, anIntArray128);
						if (local1925) {
							anIntArray125[anInt1660++] = anIntArray128[1];
							anIntArray125[anInt1660++] = anIntArray128[2];
							return;
						}
						anIntArray125[anInt1660++] = -1;
						anIntArray125[anInt1660++] = -1;
						return;
					}
					anIntArray125[anInt1660++] = -1;
					anIntArray125[anInt1660++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static242.method4560(anIntArray125[--anInt1660]);
					return;
				}
				if (arg0 == 5227) {
					anInt1660 -= 2;
					local157 = anIntArray125[anInt1660];
					local192 = anIntArray125[anInt1660 + 1];
					Static156.method2635(true, local157, local192 & 0x3FFF, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static353.aBoolean391 = anIntArray125[--anInt1660] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray125[anInt1660++] = Static353.aBoolean391 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray125[--anInt1660];
					Static331.method4480(local157);
					return;
				}
				@Pc(2483) Class10 local2483;
				if (arg0 == 5231) {
					anInt1660 -= 2;
					local157 = anIntArray125[anInt1660];
					local1313 = anIntArray125[anInt1660 + 1] == 1;
					if (Static108.aClass167_11 != null) {
						local2483 = Static108.aClass167_11.method3709((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6033();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class10();
							Static108.aClass167_11.method3705(local2483, (long) local157);
						}
					}
					return;
				}
				@Pc(2525) Class10 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray125[--anInt1660];
					if (Static108.aClass167_11 != null) {
						local2525 = Static108.aClass167_11.method3709((long) local157);
						anIntArray125[anInt1660++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray125[anInt1660++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt1660 -= 2;
					local157 = anIntArray125[anInt1660];
					local1313 = anIntArray125[anInt1660 + 1] == 1;
					if (Static210.aClass167_6 != null) {
						local2483 = Static210.aClass167_6.method3709((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6033();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class10();
							Static210.aClass167_6.method3705(local2483, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray125[--anInt1660];
					if (Static210.aClass167_6 != null) {
						local2525 = Static210.aClass167_6.method3709((long) local157);
						anIntArray125[anInt1660++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray125[anInt1660++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray125[anInt1660++] = Static143.aClass10_Sub1_Sub2_2 == null ? -1 : Static143.aClass10_Sub1_Sub2_2.anInt250;
					return;
				}
				if (arg0 == 5236) {
					anInt1660 -= 2;
					local157 = anIntArray125[anInt1660];
					local192 = anIntArray125[anInt1660 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static33.method5360(local95, local157, local89);
					if (local2691 < 0) {
						anIntArray125[anInt1660++] = -1;
						return;
					}
					anIntArray125[anInt1660++] = local2691;
					return;
				}
				if (arg0 == 5237) {
					Static100.method1780();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt1660 -= 2;
					local157 = anIntArray125[anInt1660];
					local192 = anIntArray125[anInt1660 + 1];
					Static215.method3290(local157, 3, local192, false);
					anIntArray125[anInt1660++] = Static95.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static95.aFrame1 != null) {
						Static215.method3290(-1, Static361.aClass85_Sub1_1.anInt2483, -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2775) Class256[] local2775 = Static89.method1650();
					anIntArray125[anInt1660++] = local2775.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray125[--anInt1660];
					@Pc(2799) Class256[] local2799 = Static89.method1650();
					anIntArray125[anInt1660++] = local2799[local157].anInt7177;
					anIntArray125[anInt1660++] = local2799[local157].anInt7176;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static361.aClass85_Sub1_1.anInt2500;
					local192 = Static361.aClass85_Sub1_1.anInt2480;
					local89 = -1;
					@Pc(2836) Class256[] local2836 = Static89.method1650();
					for (local2691 = 0; local2691 < local2836.length; local2691++) {
						@Pc(2843) Class256 local2843 = local2836[local2691];
						if (local2843.anInt7177 == local157 && local2843.anInt7176 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray125[anInt1660++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray125[anInt1660++] = Static211.method3254();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray125[--anInt1660];
					if (local157 >= 1 && local157 <= 2) {
						Static215.method3290(-1, local157, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.anInt2483;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray125[--anInt1660];
					if (local157 >= 1 && local157 <= 2) {
						Static361.aClass85_Sub1_1.anInt2483 = local157;
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						return;
					}
					return;
				}
			} else {
				@Pc(3351) String local3351;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt1657 -= 2;
						local75 = aStringArray10[anInt1657];
						local81 = aStringArray10[anInt1657 + 1];
						local89 = anIntArray125[--anInt1660];
						Static310.method4308(Static157.aClass27_60);
						Static337.aClass10_Sub8_Sub2_2.method2458(Static119.method2056(local75) + Static119.method2056(local81) + 1);
						Static337.aClass10_Sub8_Sub2_2.method2465(local75);
						Static337.aClass10_Sub8_Sub2_2.method2465(local81);
						Static337.aClass10_Sub8_Sub2_2.method2458(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt1660 -= 2;
						Static451.aShortArray116[anIntArray125[anInt1660]] = (short) Static192.method3058(anIntArray125[anInt1660 + 1]);
						Static313.aClass272_2.method6069();
						Static313.aClass272_2.method6062();
						Static448.aClass38_4.method868();
						Static448.method5473();
						return;
					}
					if (arg0 == 5405) {
						anInt1660 -= 2;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static174.anIntArrayArrayArray5[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt1660 -= 7;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1] << 1;
						local89 = anIntArray125[anInt1660 + 2];
						local95 = anIntArray125[anInt1660 + 3];
						local2691 = anIntArray125[anInt1660 + 4];
						@Pc(3111) int local3111 = anIntArray125[anInt1660 + 5];
						@Pc(3117) int local3117 = anIntArray125[anInt1660 + 6];
						if (local157 >= 0 && local157 < 2 && Static174.anIntArrayArrayArray5[local157] != null && local192 >= 0 && local192 < Static174.anIntArrayArrayArray5[local157].length) {
							Static174.anIntArrayArrayArray5[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3117 };
							Static174.anIntArrayArrayArray5[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3111, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static174.anIntArrayArrayArray5[anIntArray125[--anInt1660]].length >> 1;
						anIntArray125[anInt1660++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static95.aFrame1 != null) {
							Static215.method3290(-1, Static361.aClass85_Sub1_1.anInt2483, -1, false);
						}
						if (Static451.aFrame2 != null) {
							Static353.method4776();
							System.exit(0);
							return;
						}
						local75 = Static217.aString33 == null ? Static267.method3809() : Static217.aString33;
						Static373.method4984(Static423.anInt7114 == 1, false, Static171.aClass159_1, local75);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static297.aClass270_5 != null) {
							if (Static297.aClass270_5.anObject9 == null) {
								local75 = Static198.method3139(Static297.aClass270_5.anInt7546);
							} else {
								local75 = (String) Static297.aClass270_5.anObject9;
							}
						}
						aStringArray10[anInt1657++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray125[anInt1660++] = Static240.anInt4376 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static95.aFrame1 != null) {
							Static215.method3290(-1, Static361.aClass85_Sub1_1.anInt2483, -1, false);
						}
						local75 = aStringArray10[--anInt1657];
						local1313 = anIntArray125[--anInt1660] == 1;
						local3351 = Static267.method3809() + local75;
						Static373.method4984(Static423.anInt7114 == 1, local1313, Static171.aClass159_1, local3351);
						return;
					}
					if (arg0 == 5422) {
						anInt1657 -= 2;
						local75 = aStringArray10[anInt1657];
						local81 = aStringArray10[anInt1657 + 1];
						local89 = anIntArray125[--anInt1660];
						if (local75.length() > 0) {
							if (Static426.aStringArray55 == null) {
								Static426.aStringArray55 = new String[Static106.anIntArray189[Static102.aClass147_3.anInt4151]];
							}
							Static426.aStringArray55[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static276.aStringArray25 == null) {
								Static276.aStringArray25 = new String[Static106.anIntArray189[Static102.aClass147_3.anInt4151]];
							}
							Static276.aStringArray25[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray10[--anInt1657]);
						return;
					}
					if (arg0 == 5424) {
						anInt1660 -= 11;
						Static119.anInt2409 = anIntArray125[anInt1660];
						Static353.anInt6045 = anIntArray125[anInt1660 + 1];
						Static260.anInt4621 = anIntArray125[anInt1660 + 2];
						Static182.anInt3699 = anIntArray125[anInt1660 + 3];
						Static49.anInt894 = anIntArray125[anInt1660 + 4];
						Static78.anInt1648 = anIntArray125[anInt1660 + 5];
						Static421.anInt7073 = anIntArray125[anInt1660 + 6];
						Static349.anInt5976 = anIntArray125[anInt1660 + 7];
						Static137.anInt2870 = anIntArray125[anInt1660 + 8];
						Static383.anInt6559 = anIntArray125[anInt1660 + 9];
						Static226.anInt4216 = anIntArray125[anInt1660 + 10];
						Static21.aClass187_8.method4282(Static49.anInt894);
						Static21.aClass187_8.method4282(Static78.anInt1648);
						Static21.aClass187_8.method4282(Static421.anInt7073);
						Static21.aClass187_8.method4282(Static349.anInt5976);
						Static21.aClass187_8.method4282(Static137.anInt2870);
						Static311.aClass80_17 = null;
						Static306.aClass80_16 = null;
						Static261.aClass80_14 = null;
						Static26.aClass80_2 = null;
						Static243.aClass80_10 = null;
						Static164.aClass80_9 = null;
						Class222.lb = null;
						Static23.aClass80_24 = null;
						Static39.aBoolean44 = true;
						return;
					}
					if (arg0 == 5425) {
						Static234.method2026();
						Static39.aBoolean44 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt1660 -= 2;
						Static78.anInt1647 = anIntArray125[anInt1660];
						Static244.anInt4706 = anIntArray125[anInt1660 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt1660 -= 2;
						Static405.anInt6817 = anIntArray125[anInt1660 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt1660 -= 2;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						anIntArray125[anInt1660++] = Static157.method2656(local157, local192) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static74.method1394(aStringArray10[--anInt1657], false, false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static464.method2259(Static171.aClass159_1.anApplet1, "accountcreated");
							return;
						} catch (@Pc(3646) Throwable local3646) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt1660 -= 4;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						local89 = anIntArray125[anInt1660 + 2];
						local95 = anIntArray125[anInt1660 + 3];
						Static6.method51(local95, (local157 >> 14 & 0x3FFF) - Static168.anInt3353, local89, false, local192, (local157 & 0x3FFF) - Static72.anInt1488);
						return;
					}
					if (arg0 == 5501) {
						anInt1660 -= 4;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						local89 = anIntArray125[anInt1660 + 2];
						local95 = anIntArray125[anInt1660 + 3];
						Static443.method5909(local192, local89, (local157 & 0x3FFF) - Static72.anInt1488, local95, (local157 >> 14 & 0x3FFF) - Static168.anInt3353);
						return;
					}
					if (arg0 == 5502) {
						anInt1660 -= 6;
						local157 = anIntArray125[anInt1660];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static84.anInt1816 = local157;
						local192 = anIntArray125[anInt1660 + 1];
						if (local192 + 1 >= Static174.anIntArrayArrayArray5[Static84.anInt1816].length >> 1) {
							throw new RuntimeException();
						}
						Static358.anInt6084 = local192;
						Static365.anInt3059 = 0;
						Static222.anInt4188 = anIntArray125[anInt1660 + 2];
						Static456.anInt7583 = anIntArray125[anInt1660 + 3];
						local89 = anIntArray125[anInt1660 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static251.anInt6026 = local89;
						local95 = anIntArray125[anInt1660 + 5];
						if (local95 + 1 >= Static174.anIntArrayArrayArray5[Static251.anInt6026].length >> 1) {
							throw new RuntimeException();
						}
						Static350.anInt5984 = local95;
						Static157.anInt3176 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static96.method1754();
						return;
					}
					if (arg0 == 5504) {
						anInt1660 -= 2;
						Static439.method5805(anIntArray125[anInt1660 + 1], anIntArray125[anInt1660]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray125[anInt1660++] = (int) Static16.aFloat6 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray125[anInt1660++] = (int) Static149.aFloat53 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static195.method3106();
						return;
					}
					if (arg0 == 5508) {
						Static147.method2563();
						return;
					}
					if (arg0 == 5509) {
						Static331.method4483();
						return;
					}
					if (arg0 == 5510) {
						Static418.method5491();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray125[--anInt1660];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static168.anInt3353;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static2.anInt7) {
							local192 = Static2.anInt7;
						}
						local89 -= Static72.anInt1488;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static17.anInt315) {
							local89 = Static17.anInt315;
						}
						Static187.anInt3752 = (local192 << 7) + 64;
						Static131.anInt2737 = (local89 << 7) + 64;
						Static157.anInt3176 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static83.method1602();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt1657 -= 2;
						local75 = aStringArray10[anInt1657];
						local81 = aStringArray10[anInt1657 + 1];
						local89 = anIntArray125[--anInt1660];
						if (Static358.anInt6086 != 2) {
							return;
						}
						if (Static197.anInt3945 == 0 && Static268.anInt4867 == 0) {
							Static2.aString1 = local75;
							Static33.aString67 = local81;
							Static109.anInt2181 = local89;
							Static458.method6071(5);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static301.method4175();
						return;
					}
					if (arg0 == 5602) {
						if (Static197.anInt3945 == 0) {
							Static289.anInt5058 = -2;
							Static217.anInt4145 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt1660 -= 4;
						if (Static358.anInt6086 != 2) {
							return;
						}
						if (Static197.anInt3945 == 0 && Static268.anInt4867 == 0) {
							Static310.method4283(anIntArray125[anInt1660 + 2], anIntArray125[anInt1660], anIntArray125[anInt1660 + 1], anIntArray125[anInt1660 + 3]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt1657--;
						if (Static358.anInt6086 != 2) {
							return;
						}
						if (Static197.anInt3945 == 0 && Static268.anInt4867 == 0) {
							Static89.method1651(Static269.method3820(aStringArray10[anInt1657]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt1657 -= 2;
						if (Static358.anInt6086 != 2) {
							return;
						}
						if (Static197.anInt3945 == 0 && Static268.anInt4867 == 0) {
							Static244.method3801(Static269.method3820(aStringArray10[anInt1657]), false, aStringArray10[anInt1657 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static268.anInt4867 == 0) {
							Static113.anInt2280 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray125[anInt1660++] = Static217.anInt4145;
						return;
					}
					if (arg0 == 5608) {
						anIntArray125[anInt1660++] = Static424.anInt7138;
						return;
					}
					if (arg0 == 5609) {
						anIntArray125[anInt1660++] = Static113.anInt2280;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray10[anInt1657++] = Static190.aStringArray28.length > local157 ? Static65.method1085(Static190.aStringArray28[local157]) : "";
						}
						Static190.aStringArray28 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray125[anInt1660++] = Static111.anInt5894;
						return;
					}
					if (arg0 == 5612) {
						local157 = anIntArray125[--anInt1660];
						if (Static358.anInt6086 != 6) {
							return;
						}
						if (Static197.anInt3945 == 0 && Static268.anInt4867 == 0) {
							if (Static160.aClass253_3 != null) {
								Static160.aClass253_3.method5484();
								Static160.aClass253_3 = null;
							}
							Static109.anInt2181 = local157;
							Static458.method6071(8);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray125[anInt1660++] = Static217.anInt4145;
						return;
					}
					if (arg0 == 5615) {
						anInt1657 -= 2;
						local75 = aStringArray10[anInt1657];
						local81 = aStringArray10[anInt1657 + 1];
						if (Static358.anInt6086 != 2) {
							return;
						}
						if (Static197.anInt3945 == 0 && Static268.anInt4867 == 0) {
							if (Static160.aClass253_3 != null) {
								Static160.aClass253_3.method5484();
								Static160.aClass253_3 = null;
							}
							Static2.aString1 = local75;
							Static33.aString67 = local81;
							Static458.method6071(4);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static172.method2923(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray125[anInt1660++] = Static289.anInt5058;
						return;
					}
					if (arg0 == 5618) {
						local157 = anIntArray125[--anInt1660];
						Static239.method3396(local157, false);
						return;
					}
					if (arg0 == 5619) {
						local157 = anIntArray125[--anInt1660];
						Static239.method3396(local157, true);
						return;
					}
					if (arg0 == 5620) {
						Static386.method5170();
						if (Static384.aString62 != "" && Static384.aString62 != "") {
							anIntArray125[anInt1660++] = 1;
							return;
						}
						anIntArray125[anInt1660++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt1657 -= 2;
						if (Static358.anInt6086 != 2) {
							return;
						}
						if (Static197.anInt3945 == 0 && Static268.anInt4867 == 0) {
							Static244.method3801(Static269.method3820(aStringArray10[anInt1657]), true, aStringArray10[anInt1657 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5622) {
						@Pc(4436) Class270 local4436 = Static171.aClass159_1.method3514("3", false);
						while (local4436.anInt7548 == 0) {
							Static328.method5696(1L);
						}
						if (local4436.anInt7548 == 2) {
							throw new RuntimeException("Error opening file");
						}
						@Pc(4456) Class108 local4456 = (Class108) local4436.anObject9;
						if (local4456.method2647().exists()) {
							@Pc(4466) Class10_Sub8 local4466 = new Class10_Sub8(50);
							try {
								local4456.method2648(local4466.aByteArray44, 0, 50);
							} catch (@Pc(4475) IOException local4475) {
							}
						}
						try {
							local4456.method2643();
							return;
						} catch (@Pc(4481) Exception local4481) {
							return;
						}
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray125[--anInt1660];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static361.aClass85_Sub1_1.anInt2491 = local157;
						Static44.method658();
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6002) {
						Static361.aClass85_Sub1_1.method2110(anIntArray125[--anInt1660] == 1);
						Static44.method658();
						Static124.method2183();
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6003) {
						Static361.aClass85_Sub1_1.aBoolean174 = anIntArray125[--anInt1660] == 1;
						Static124.method2183();
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6005) {
						Static361.aClass85_Sub1_1.aBoolean165 = anIntArray125[--anInt1660] == 1;
						Static44.method658();
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6006) {
						Static361.aClass85_Sub1_1.aBoolean179 = anIntArray125[--anInt1660] == 1;
						Static412.aClass50_8.method5866(!Static361.aClass85_Sub1_1.aBoolean179);
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6007) {
						Static361.aClass85_Sub1_1.anInt2489 = anIntArray125[--anInt1660];
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6008) {
						Static361.aClass85_Sub1_1.aBoolean173 = anIntArray125[--anInt1660] == 1;
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6009) {
						Static361.aClass85_Sub1_1.aBoolean172 = anIntArray125[--anInt1660] == 1;
						Static44.method658();
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6010) {
						Static361.aClass85_Sub1_1.aBoolean171 = anIntArray125[--anInt1660] == 1;
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray125[--anInt1660];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static361.aClass85_Sub1_1.method2107(Static423.anInt7114, local157);
						Static44.method658();
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6012) {
						Static361.aClass85_Sub1_1.method2108(anIntArray125[--anInt1660] == 1, Static423.anInt7114);
						Static33.method5356();
						Static343.method4653();
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6014) {
						Static361.aClass85_Sub1_1.aBoolean170 = anIntArray125[--anInt1660] == 1;
						Static44.method658();
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6015) {
						Static361.aClass85_Sub1_1.aBoolean168 = anIntArray125[--anInt1660] == 1;
						Static44.method658();
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray125[--anInt1660];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static361.aClass85_Sub1_1.anInt2486 = local157;
						Static178.method2951(Static423.anInt7114);
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						return;
					}
					if (arg0 == 6017) {
						Static361.aClass85_Sub1_1.aBoolean180 = anIntArray125[--anInt1660] == 1;
						Static292.method4101();
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray125[--anInt1660];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static361.aClass85_Sub1_1.anInt2481 = local157;
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray125[--anInt1660];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static361.aClass85_Sub1_1.anInt2496) {
							if (Static361.aClass85_Sub1_1.anInt2496 == 0 && Static151.anInt3107 != -1) {
								Static163.method2712(Static151.anInt3107, local157, Static43.aClass187_11);
								Static290.aBoolean344 = false;
							} else if (local157 == 0) {
								Static193.method3059();
								Static290.aBoolean344 = false;
							} else {
								Static101.method6031(local157);
							}
							Static361.aClass85_Sub1_1.anInt2496 = local157;
						}
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray125[--anInt1660];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static361.aClass85_Sub1_1.anInt2487 = local157;
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6021) {
						Static361.aClass85_Sub1_1.aBoolean182 = anIntArray125[--anInt1660] == 1;
						Static124.method2183();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray125[--anInt1660];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static108.anInt2167 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static126.method2213(local157);
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						anIntArray125[anInt1660++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray125[--anInt1660];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static361.aClass85_Sub1_1.anInt2493 = local157;
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray125[--anInt1660];
						if (local157 < 0 || local157 > Static304.method4242(Static108.anInt2167)) {
							local157 = 0;
						}
						Static361.aClass85_Sub1_1.anInt2488 = local157;
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray125[--anInt1660];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static407.method5369(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static361.aClass85_Sub1_1.aBoolean176 = anIntArray125[--anInt1660] != 0;
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						return;
					}
					if (arg0 == 6029) {
						Static361.aClass85_Sub1_1.anInt2489 = anIntArray125[--anInt1660];
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						return;
					}
					if (arg0 == 6030) {
						Static361.aClass85_Sub1_1.aBoolean178 = anIntArray125[--anInt1660] != 0;
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static44.method658();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray125[--anInt1660];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static178.method2951(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray125[--anInt1660];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static361.aClass85_Sub1_1.anInt2484 = local157;
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray125[--anInt1660];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static361.aClass85_Sub1_1.anInt2494 = local157;
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						return;
					}
					if (arg0 == 6034) {
						Static361.aClass85_Sub1_1.aBoolean167 = anIntArray125[--anInt1660] == 1;
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						Static33.method5356();
						Static419.aBoolean463 = false;
						return;
					}
					if (arg0 == 6035) {
						Static361.aClass85_Sub1_1.aBoolean184 = anIntArray125[--anInt1660] == 1;
						Static44.method658();
						Static124.method2183();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.anInt2491;
						return;
					}
					if (arg0 == 6102) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.method2114(Static423.anInt7114) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.aBoolean174 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.aBoolean165 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.aBoolean179 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.anInt2489;
						return;
					}
					if (arg0 == 6108) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.aBoolean173 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.aBoolean172 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.aBoolean171 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.method2106(Static423.anInt7114);
						return;
					}
					if (arg0 == 6112) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.method2105(Static423.anInt7114) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.aBoolean170 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.aBoolean168 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.anInt2486;
						return;
					}
					if (arg0 == 6117) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.aBoolean180 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.anInt2481;
						return;
					}
					if (arg0 == 6119) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.anInt2496;
						return;
					}
					if (arg0 == 6120) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.anInt2487;
						return;
					}
					if (arg0 == 6121) {
						anIntArray125[anInt1660++] = Static412.aClass50_8.method5839() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray125[anInt1660++] = Static201.method3169();
						return;
					}
					if (arg0 == 6124) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.anInt2493;
						return;
					}
					if (arg0 == 6125) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.anInt2488;
						return;
					}
					if (arg0 == 6126) {
						anIntArray125[anInt1660++] = Static412.aClass50_8.method5850() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.aBoolean166 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.aBoolean176 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.anInt2489;
						return;
					}
					if (arg0 == 6130) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.aBoolean178 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray125[anInt1660++] = Static423.anInt7114;
						return;
					}
					if (arg0 == 6132) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.anInt2484;
						return;
					}
					if (arg0 == 6133) {
						anIntArray125[anInt1660++] = Static240.anInt4376 == 1 || Static240.anInt4376 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray125[anInt1660++] = Static304.method4242(Static108.anInt2167);
						return;
					}
					if (arg0 == 6135) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.anInt2494;
						return;
					}
					if (arg0 == 6136) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.aBoolean167 ? 1 : 0;
						return;
					}
					if (arg0 == 6137) {
						@Pc(5871) boolean local5871 = true;
						try {
							local5871 = jagmisc.getTotalPhysicalMemory() > 268435456L;
						} catch (@Pc(5881) Throwable local5881) {
						}
						anIntArray125[anInt1660++] = local5871 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt1660 -= 2;
						Static180.aShort59 = (short) anIntArray125[anInt1660];
						if (Static180.aShort59 <= 0) {
							Static180.aShort59 = 256;
						}
						Static345.aShort79 = (short) anIntArray125[anInt1660 + 1];
						if (Static345.aShort79 <= 0) {
							Static345.aShort79 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt1660 -= 2;
						Static199.aShort63 = (short) anIntArray125[anInt1660];
						if (Static199.aShort63 <= 0) {
							Static199.aShort63 = 256;
						}
						Static197.aShort60 = (short) anIntArray125[anInt1660 + 1];
						if (Static197.aShort60 <= 0) {
							Static197.aShort60 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt1660 -= 4;
						Static153.aShort42 = (short) anIntArray125[anInt1660];
						if (Static153.aShort42 <= 0) {
							Static153.aShort42 = 1;
						}
						Static321.aShort77 = (short) anIntArray125[anInt1660 + 1];
						if (Static321.aShort77 <= 0) {
							Static321.aShort77 = 32767;
						} else if (Static321.aShort77 < Static153.aShort42) {
							Static321.aShort77 = Static153.aShort42;
						}
						Static396.aShort93 = (short) anIntArray125[anInt1660 + 2];
						if (Static396.aShort93 <= 0) {
							Static396.aShort93 = 1;
						}
						Static132.aShort24 = (short) anIntArray125[anInt1660 + 3];
						if (Static132.aShort24 <= 0) {
							Static132.aShort24 = 32767;
							return;
						}
						if (Static132.aShort24 < Static396.aShort93) {
							Static132.aShort24 = Static396.aShort93;
						}
						return;
					}
					if (arg0 == 6203) {
						Static250.method3631(false, Static76.aClass89_3.anInt2703, 0, 0, Static76.aClass89_3.anInt2682);
						anIntArray125[anInt1660++] = Static18.anInt317;
						anIntArray125[anInt1660++] = Static269.anInt4734;
						return;
					}
					if (arg0 == 6204) {
						anIntArray125[anInt1660++] = Static199.aShort63;
						anIntArray125[anInt1660++] = Static197.aShort60;
						return;
					}
					if (arg0 == 6205) {
						anIntArray125[anInt1660++] = Static180.aShort59;
						anIntArray125[anInt1660++] = Static345.aShort79;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray125[anInt1660++] = (int) (Static220.method3314() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray125[anInt1660++] = (int) (Static220.method3314() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt1660 -= 3;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						local89 = anIntArray125[anInt1660 + 2];
						aCalendar1.clear();
						aCalendar1.set(11, 12);
						aCalendar1.set(local89, local192, local157);
						local95 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
						if (local89 < 1970) {
							local95--;
						}
						anIntArray125[anInt1660++] = local95;
						return;
					}
					if (arg0 == 6303) {
						aCalendar1.clear();
						aCalendar1.setTime(new Date(Static220.method3314()));
						anIntArray125[anInt1660++] = aCalendar1.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray125[--anInt1660];
						local1313 = true;
						if (local157 < 0) {
							local1313 = (local157 + 1) % 4 == 0;
						} else if (local157 < 1582) {
							local1313 = local157 % 4 == 0;
						} else if (local157 % 4 != 0) {
							local1313 = false;
						} else if (local157 % 100 != 0) {
							local1313 = true;
						} else if (local157 % 400 != 0) {
							local1313 = false;
						}
						anIntArray125[anInt1660++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray125[anInt1660++] = Static226.method3380() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray125[anInt1660++] = Static159.method2687() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static358.anInt6086 == 6 && Static197.anInt3945 == 0 && Static268.anInt4867 == 0) {
							if (Static361.aBoolean397) {
								anIntArray125[anInt1660++] = 0;
								return;
							}
							if (Static57.aLong39 > Static220.method3314() - 1000L) {
								anIntArray125[anInt1660++] = 1;
								return;
							}
							Static361.aBoolean397 = true;
							Static310.method4308(Static433.aClass27_106);
							Static337.aClass10_Sub8_Sub2_2.method2506(Static459.anInt7622);
							anIntArray125[anInt1660++] = 0;
							return;
						}
						anIntArray125[anInt1660++] = 1;
						return;
					}
					@Pc(6414) Class243 local6414;
					@Pc(6381) Class56_Sub1 local6381;
					if (arg0 == 6501) {
						local6381 = Static215.method3292();
						if (local6381 != null) {
							anIntArray125[anInt1660++] = local6381.anInt4663;
							anIntArray125[anInt1660++] = local6381.anInt4658;
							aStringArray10[anInt1657++] = local6381.aString50;
							local6414 = local6381.method3769();
							anIntArray125[anInt1660++] = local6414.anInt6744;
							aStringArray10[anInt1657++] = local6414.aString65;
							anIntArray125[anInt1660++] = local6381.anInt4652;
							anIntArray125[anInt1660++] = local6381.anInt4661;
							aStringArray10[anInt1657++] = local6381.aString49;
							return;
						}
						anIntArray125[anInt1660++] = -1;
						anIntArray125[anInt1660++] = 0;
						aStringArray10[anInt1657++] = "";
						anIntArray125[anInt1660++] = 0;
						aStringArray10[anInt1657++] = "";
						anIntArray125[anInt1660++] = 0;
						anIntArray125[anInt1660++] = 0;
						aStringArray10[anInt1657++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6381 = Static95.method1726();
						if (local6381 != null) {
							anIntArray125[anInt1660++] = local6381.anInt4663;
							anIntArray125[anInt1660++] = local6381.anInt4658;
							aStringArray10[anInt1657++] = local6381.aString50;
							local6414 = local6381.method3769();
							anIntArray125[anInt1660++] = local6414.anInt6744;
							aStringArray10[anInt1657++] = local6414.aString65;
							anIntArray125[anInt1660++] = local6381.anInt4652;
							anIntArray125[anInt1660++] = local6381.anInt4661;
							aStringArray10[anInt1657++] = local6381.aString49;
							return;
						}
						anIntArray125[anInt1660++] = -1;
						anIntArray125[anInt1660++] = 0;
						aStringArray10[anInt1657++] = "";
						anIntArray125[anInt1660++] = 0;
						aStringArray10[anInt1657++] = "";
						anIntArray125[anInt1660++] = 0;
						anIntArray125[anInt1660++] = 0;
						aStringArray10[anInt1657++] = "";
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray125[--anInt1660];
						local81 = aStringArray10[--anInt1657];
						if (Static358.anInt6086 == 6 && Static197.anInt3945 == 0 && Static268.anInt4867 == 0) {
							anIntArray125[anInt1660++] = Static456.method6048(local81, local157) ? 1 : 0;
							return;
						}
						anIntArray125[anInt1660++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static361.aClass85_Sub1_1.anInt2482 = anIntArray125[--anInt1660];
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						return;
					}
					if (arg0 == 6505) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.anInt2482;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray125[--anInt1660];
						@Pc(6771) Class56_Sub1 local6771 = Static29.method430(local157);
						if (local6771 != null) {
							anIntArray125[anInt1660++] = local6771.anInt4658;
							aStringArray10[anInt1657++] = local6771.aString50;
							@Pc(6795) Class243 local6795 = local6771.method3769();
							anIntArray125[anInt1660++] = local6795.anInt6744;
							aStringArray10[anInt1657++] = local6795.aString65;
							anIntArray125[anInt1660++] = local6771.anInt4652;
							anIntArray125[anInt1660++] = local6771.anInt4661;
							aStringArray10[anInt1657++] = local6771.aString49;
							return;
						}
						anIntArray125[anInt1660++] = -1;
						aStringArray10[anInt1657++] = "";
						anIntArray125[anInt1660++] = 0;
						aStringArray10[anInt1657++] = "";
						anIntArray125[anInt1660++] = 0;
						anIntArray125[anInt1660++] = 0;
						aStringArray10[anInt1657++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt1660 -= 4;
						local157 = anIntArray125[anInt1660];
						local1313 = anIntArray125[anInt1660 + 1] == 1;
						local89 = anIntArray125[anInt1660 + 2];
						local1965 = anIntArray125[anInt1660 + 3] == 1;
						Static245.method3583(local1965, local89, local157, local1313);
						return;
					}
					if (arg0 == 6508) {
						Static90.method1691();
						return;
					}
					if (arg0 == 6509) {
						if (Static358.anInt6086 != 6) {
							return;
						}
						Static219.aBoolean281 = anIntArray125[--anInt1660] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static361.aClass85_Sub1_1.aBoolean164 = anIntArray125[--anInt1660] == 1;
						Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
						return;
					}
					if (arg0 == 6601) {
						anIntArray125[anInt1660++] = Static361.aClass85_Sub1_1.aBoolean164 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static290.aClass178_11 == Static336.aClass178_15) {
					if (arg0 == 6700) {
						local157 = Static114.aClass167_12.method3698();
						if (Static189.anInt3826 != -1) {
							local157++;
						}
						anIntArray125[anInt1660++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray125[--anInt1660];
						if (Static189.anInt3826 != -1) {
							if (local157 == 0) {
								anIntArray125[anInt1660++] = Static189.anInt3826;
								return;
							}
							local157--;
						}
						@Pc(7070) Class10_Sub21 local7070 = (Class10_Sub21) Static114.aClass167_12.method3702();
						while (local157-- > 0) {
							local7070 = (Class10_Sub21) Static114.aClass167_12.method3708();
						}
						anIntArray125[anInt1660++] = local7070.anInt3646;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray125[--anInt1660];
						if (Static166.aClass89ArrayArray2[local157] == null) {
							aStringArray10[anInt1657++] = "";
							return;
						}
						local81 = Static166.aClass89ArrayArray2[local157][0].aString16;
						if (local81 == null) {
							aStringArray10[anInt1657++] = "";
							return;
						}
						aStringArray10[anInt1657++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray125[--anInt1660];
						if (Static166.aClass89ArrayArray2[local157] == null) {
							anIntArray125[anInt1660++] = 0;
							return;
						}
						anIntArray125[anInt1660++] = Static166.aClass89ArrayArray2[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt1660 -= 2;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						if (Static166.aClass89ArrayArray2[local157] == null) {
							aStringArray10[anInt1657++] = "";
							return;
						}
						local3351 = Static166.aClass89ArrayArray2[local157][local192].aString16;
						if (local3351 == null) {
							aStringArray10[anInt1657++] = "";
							return;
						}
						aStringArray10[anInt1657++] = local3351;
						return;
					}
					if (arg0 == 6705) {
						anInt1660 -= 2;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						if (Static166.aClass89ArrayArray2[local157] == null) {
							anIntArray125[anInt1660++] = 0;
							return;
						}
						anIntArray125[anInt1660++] = Static166.aClass89ArrayArray2[local157][local192].anInt2740;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt1660 -= 3;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						local89 = anIntArray125[anInt1660 + 2];
						Static344.method4661(1, local157 << 16 | local192, "", local89);
						return;
					}
					if (arg0 == 6708) {
						anInt1660 -= 3;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						local89 = anIntArray125[anInt1660 + 2];
						Static344.method4661(2, local157 << 16 | local192, "", local89);
						return;
					}
					if (arg0 == 6709) {
						anInt1660 -= 3;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						local89 = anIntArray125[anInt1660 + 2];
						Static344.method4661(3, local157 << 16 | local192, "", local89);
						return;
					}
					if (arg0 == 6710) {
						anInt1660 -= 3;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						local89 = anIntArray125[anInt1660 + 2];
						Static344.method4661(4, local157 << 16 | local192, "", local89);
						return;
					}
					if (arg0 == 6711) {
						anInt1660 -= 3;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						local89 = anIntArray125[anInt1660 + 2];
						Static344.method4661(5, local157 << 16 | local192, "", local89);
						return;
					}
					if (arg0 == 6712) {
						anInt1660 -= 3;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						local89 = anIntArray125[anInt1660 + 2];
						Static344.method4661(6, local157 << 16 | local192, "", local89);
						return;
					}
					if (arg0 == 6713) {
						anInt1660 -= 3;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						local89 = anIntArray125[anInt1660 + 2];
						Static344.method4661(7, local157 << 16 | local192, "", local89);
						return;
					}
					if (arg0 == 6714) {
						anInt1660 -= 3;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						local89 = anIntArray125[anInt1660 + 2];
						Static344.method4661(8, local157 << 16 | local192, "", local89);
						return;
					}
					if (arg0 == 6715) {
						anInt1660 -= 3;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						local89 = anIntArray125[anInt1660 + 2];
						Static344.method4661(9, local157 << 16 | local192, "", local89);
						return;
					}
					if (arg0 == 6716) {
						anInt1660 -= 3;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						local89 = anIntArray125[anInt1660 + 2];
						Static344.method4661(10, local157 << 16 | local192, "", local89);
						return;
					}
					if (arg0 == 6717) {
						anInt1660 -= 3;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						local89 = anIntArray125[anInt1660 + 2];
						@Pc(7658) Class89 local7658 = Static397.method5275(local89, local157 << 16 | local192);
						Static456.method6051();
						@Pc(7663) Class10_Sub38 local7663 = Static56.method1002(local7658);
						Static382.method5564(local7663.anInt5651, local7663.method4502(), local7658);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7691) Class208 local7691;
					if (arg0 == 6800) {
						local157 = anIntArray125[--anInt1660];
						local7691 = Static300.aClass88_3.method2268(local157);
						if (local7691.aString55 == null) {
							aStringArray10[anInt1657++] = "";
							return;
						}
						aStringArray10[anInt1657++] = local7691.aString55;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray125[--anInt1660];
						local7691 = Static300.aClass88_3.method2268(local157);
						anIntArray125[anInt1660++] = local7691.anInt6000;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray125[--anInt1660];
						local7691 = Static300.aClass88_3.method2268(local157);
						anIntArray125[anInt1660++] = local7691.anInt5993;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray125[--anInt1660];
						local7691 = Static300.aClass88_3.method2268(local157);
						anIntArray125[anInt1660++] = local7691.anInt6003;
						return;
					}
					if (arg0 == 6804) {
						anInt1660 -= 2;
						local157 = anIntArray125[anInt1660];
						local192 = anIntArray125[anInt1660 + 1];
						@Pc(7813) Class155 local7813 = Static376.aClass204_1.method4526(local192);
						if (local7813.method3452()) {
							aStringArray10[anInt1657++] = Static300.aClass88_3.method2268(local157).method4753(local7813.aString37, local192);
							return;
						}
						anIntArray125[anInt1660++] = Static300.aClass88_3.method2268(local157).method4758(local192, local7813.anInt4302);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray125[anInt1660++] = Static376.aBoolean422 && !Static111.aBoolean380 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray125[anInt1660++] = Static74.anInt1518;
						return;
					}
					if (arg0 == 6902) {
						anIntArray125[anInt1660++] = Static76.anInt1549;
						return;
					}
					if (arg0 == 6903) {
						anIntArray125[anInt1660++] = Static429.anInt7202;
						return;
					}
					if (arg0 == 6904) {
						anIntArray125[anInt1660++] = Static339.anInt5722;
						return;
					}
					if (arg0 == 6905) {
						local75 = "";
						if (Static297.aClass270_5 != null) {
							if (Static297.aClass270_5.anObject9 == null) {
								local75 = Static198.method3139(Static297.aClass270_5.anInt7546);
							} else {
								local75 = (String) Static297.aClass270_5.anObject9;
							}
						}
						aStringArray10[anInt1657++] = local75;
						return;
					}
					if (arg0 == 6906) {
						anIntArray125[anInt1660++] = Static93.anInt7577;
						return;
					}
					if (arg0 == 6907) {
						anIntArray125[anInt1660++] = Static363.anInt6158;
						return;
					}
					if (arg0 == 6908) {
						anIntArray125[anInt1660++] = Static423.anInt7106;
						return;
					}
					if (arg0 == 6909) {
						anIntArray125[anInt1660++] = Static14.aBoolean17 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray125[anInt1660++] = Static456.anInt7588;
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(IZ)V")
	private static void method1509(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class89 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class89 local35;
		@Pc(158) Class89 local158;
		@Pc(210) Class89 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt1660 -= 3;
				local13 = anIntArray125[anInt1660];
				local19 = anIntArray125[anInt1660 + 1];
				local25 = anIntArray125[anInt1660 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static40.method557(local13);
				if (local35.aClass89Array1 == null) {
					local35.aClass89Array1 = new Class89[local25 + 1];
				}
				if (local35.aClass89Array1.length <= local25) {
					@Pc(54) Class89[] local54 = new Class89[local25 + 1];
					for (local56 = 0; local56 < local35.aClass89Array1.length; local56++) {
						local54[local56] = local35.aClass89Array1[local56];
					}
					local35.aClass89Array1 = local54;
				}
				if (local25 > 0 && local35.aClass89Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class89 local99 = new Class89();
				local99.anInt2727 = local19;
				local99.anInt2694 = local99.anInt2677 = local35.anInt2677;
				local99.anInt2720 = local25;
				local35.aClass89Array1[local25] = local99;
				if (arg1) {
					aClass89_4 = local99;
				} else {
					aClass89_5 = local99;
				}
				Static135.method5400(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass89_4 : aClass89_5;
				if (local137.anInt2720 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static40.method557(local137.anInt2677);
				local158.aClass89Array1[local137.anInt2720] = null;
				Static135.method5400(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static40.method557(anIntArray125[--anInt1660]);
				local137.aClass89Array1 = null;
				Static135.method5400(local137);
				return;
			}
			if (arg0 == 200) {
				anInt1660 -= 2;
				local13 = anIntArray125[anInt1660];
				local19 = anIntArray125[anInt1660 + 1];
				local210 = Static397.method5275(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray125[anInt1660++] = 1;
					if (arg1) {
						aClass89_4 = local210;
						return;
					}
					aClass89_5 = local210;
					return;
				}
				anIntArray125[anInt1660++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray125[--anInt1660];
				local158 = Static40.method557(local13);
				if (local158 != null) {
					anIntArray125[anInt1660++] = 1;
					if (arg1) {
						aClass89_4 = local158;
						return;
					}
					aClass89_5 = local158;
					return;
				}
				anIntArray125[anInt1660++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray125[--anInt1660];
				method1513(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray125[--anInt1660];
				method1510(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt1660 -= 2;
					local13 = anIntArray125[anInt1660];
					local19 = anIntArray125[anInt1660 + 1];
					for (local25 = 0; local25 < Static19.anIntArray28.length; local25++) {
						if (Static19.anIntArray28[local25] == local13) {
							Static263.aClass24_Sub3_Sub2_Sub2_4.aClass75_1.method1893(Static8.aClass100_1, local19, local25);
							return;
						}
					}
					for (local353 = 0; local353 < Static410.anIntArray666.length; local353++) {
						if (Static410.anIntArray666[local353] == local13) {
							Static263.aClass24_Sub3_Sub2_Sub2_4.aClass75_1.method1893(Static8.aClass100_1, local19, local353);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt1660 -= 2;
					local13 = anIntArray125[anInt1660];
					local19 = anIntArray125[anInt1660 + 1];
					Static263.aClass24_Sub3_Sub2_Sub2_4.aClass75_1.method1891(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray125[--anInt1660] != 0;
					Static263.aClass24_Sub3_Sub2_Sub2_4.aClass75_1.method1890(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static40.method557(anIntArray125[--anInt1660]);
					} else {
						local137 = arg1 ? aClass89_4 : aClass89_5;
					}
					if (arg0 == 1100) {
						anInt1660 -= 2;
						local137.anInt2725 = anIntArray125[anInt1660];
						if (local137.anInt2725 > local137.anInt2689 - local137.anInt2703) {
							local137.anInt2725 = local137.anInt2689 - local137.anInt2703;
						}
						if (local137.anInt2725 < 0) {
							local137.anInt2725 = 0;
						}
						local137.anInt2699 = anIntArray125[anInt1660 + 1];
						if (local137.anInt2699 > local137.anInt2708 - local137.anInt2682) {
							local137.anInt2699 = local137.anInt2708 - local137.anInt2682;
						}
						if (local137.anInt2699 < 0) {
							local137.anInt2699 = 0;
						}
						Static135.method5400(local137);
						if (local137.anInt2720 == -1) {
							Static115.method2031(local137.anInt2677);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt2662 = anIntArray125[--anInt1660];
						Static135.method5400(local137);
						if (local137.anInt2720 == -1) {
							Static438.method5780(local137.anInt2677);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean206 = anIntArray125[--anInt1660] == 1;
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt2690 = anIntArray125[--anInt1660];
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt2729 = anIntArray125[--anInt1660];
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray125[--anInt1660];
						if (local137.anInt2734 != local19) {
							local137.anInt2734 = local19;
							Static135.method5400(local137);
						}
						if (local137.anInt2720 == -1) {
							Static96.method1753(local137.anInt2677);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt2701 = anIntArray125[--anInt1660];
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean205 = anIntArray125[--anInt1660] == 1;
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt2728 = 1;
						local137.anInt2733 = anIntArray125[--anInt1660];
						Static135.method5400(local137);
						if (local137.anInt2720 == -1) {
							Static25.method333(local137.anInt2677);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt1660 -= 6;
						local137.anInt2668 = anIntArray125[anInt1660];
						local137.anInt2680 = anIntArray125[anInt1660 + 1];
						local137.anInt2663 = anIntArray125[anInt1660 + 2];
						local137.anInt2685 = anIntArray125[anInt1660 + 3];
						local137.anInt2675 = anIntArray125[anInt1660 + 4];
						local137.anInt2688 = anIntArray125[anInt1660 + 5];
						Static135.method5400(local137);
						if (local137.anInt2720 == -1) {
							Static337.method4522(local137.anInt2677);
							Static1.method3(local137.anInt2677);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray125[--anInt1660];
						if (local137.anInt2697 != local19) {
							local137.anInt2697 = local19;
							local137.anInt2704 = 0;
							local137.anInt2665 = 1;
							local137.anInt2661 = 0;
							Static135.method5400(local137);
						}
						if (local137.anInt2720 == -1) {
							Static55.method941(local137.anInt2677);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean204 = anIntArray125[--anInt1660] == 1;
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray10[--anInt1657];
						if (!local1101.equals(local137.aString17)) {
							local137.aString17 = local1101;
							Static135.method5400(local137);
						}
						if (local137.anInt2720 == -1) {
							Static27.method365(local137.anInt2677);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt2671 = anIntArray125[--anInt1660];
						Static135.method5400(local137);
						if (local137.anInt2720 == -1) {
							Static60.method5648(local137.anInt2677);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt1660 -= 3;
						local137.anInt2686 = anIntArray125[anInt1660];
						local137.anInt2741 = anIntArray125[anInt1660 + 1];
						local137.anInt2750 = anIntArray125[anInt1660 + 2];
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean195 = anIntArray125[--anInt1660] == 1;
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt2714 = anIntArray125[--anInt1660];
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt2743 = anIntArray125[--anInt1660];
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean200 = anIntArray125[--anInt1660] == 1;
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean193 = anIntArray125[--anInt1660] == 1;
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt1660 -= 2;
						local137.anInt2689 = anIntArray125[anInt1660];
						local137.anInt2708 = anIntArray125[anInt1660 + 1];
						Static135.method5400(local137);
						if (local137.anInt2727 == 0) {
							Static344.method4658(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt1660 -= 2;
						local137.anInt2724 = (short) anIntArray125[anInt1660];
						local137.anInt2693 = (short) anIntArray125[anInt1660 + 1];
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean194 = anIntArray125[--anInt1660] == 1;
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt2688 = anIntArray125[--anInt1660];
						Static135.method5400(local137);
						if (local137.anInt2720 == -1) {
							Static337.method4522(local137.anInt2677);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray125[--anInt1660];
						local137.aBoolean202 = local19 == 1;
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt1660 -= 2;
						local137.anInt2676 = anIntArray125[anInt1660];
						local137.anInt2713 = anIntArray125[anInt1660 + 1];
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt2738 = anIntArray125[--anInt1660];
						Static135.method5400(local137);
						return;
					}
					@Pc(1454) Class155 local1454;
					if (arg0 == 1127) {
						anInt1660 -= 2;
						local19 = anIntArray125[anInt1660];
						local25 = anIntArray125[anInt1660 + 1];
						local1454 = Static376.aClass204_1.method4526(local19);
						if (local25 != local1454.anInt4302) {
							local137.method2288(local25, local19);
							return;
						}
						local137.method2286(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray125[--anInt1660];
						local1488 = aStringArray10[--anInt1657];
						local1454 = Static376.aClass204_1.method4526(local19);
						if (!local1454.aString37.equals(local1488)) {
							local137.method2285(local1488, local19);
							return;
						}
						local137.method2286(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static40.method557(anIntArray125[--anInt1660]);
							} else {
								local137 = arg1 ? aClass89_4 : aClass89_5;
							}
							local1101 = aStringArray10[--anInt1657];
							@Pc(2369) int[] local2369 = null;
							if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
								local353 = anIntArray125[--anInt1660];
								if (local353 > 0) {
									local2369 = new int[local353];
									while (local353-- > 0) {
										local2369[local353] = anIntArray125[--anInt1660];
									}
								}
								local1101 = local1101.substring(0, local1101.length() - 1);
							}
							@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
							for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
								if (local1101.charAt(local2290 - 1) == 's') {
									local2421[local2290] = aStringArray10[--anInt1657];
								} else {
									local2421[local2290] = Integer.valueOf(anIntArray125[--anInt1660]);
								}
							}
							local56 = anIntArray125[--anInt1660];
							if (local56 == -1) {
								local2421 = null;
							} else {
								local2421[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray33 = local2421;
							} else if (arg0 == 1401) {
								local137.anObjectArray4 = local2421;
							} else if (arg0 == 1402) {
								local137.anObjectArray7 = local2421;
							} else if (arg0 == 1403) {
								local137.anObjectArray24 = local2421;
							} else if (arg0 == 1404) {
								local137.anObjectArray28 = local2421;
							} else if (arg0 == 1405) {
								local137.anObjectArray22 = local2421;
							} else if (arg0 == 1406) {
								local137.anObjectArray18 = local2421;
							} else if (arg0 == 1407) {
								local137.anObjectArray31 = local2421;
								local137.anIntArray265 = local2369;
							} else if (arg0 == 1408) {
								local137.anObjectArray30 = local2421;
							} else if (arg0 == 1409) {
								local137.anObjectArray10 = local2421;
							} else if (arg0 == 1410) {
								local137.anObjectArray9 = local2421;
							} else if (arg0 == 1411) {
								local137.anObjectArray11 = local2421;
							} else if (arg0 == 1412) {
								local137.anObjectArray20 = local2421;
							} else if (arg0 == 1414) {
								local137.anObjectArray8 = local2421;
								local137.anIntArray266 = local2369;
							} else if (arg0 == 1415) {
								local137.anObjectArray14 = local2421;
								local137.anIntArray268 = local2369;
							} else if (arg0 == 1416) {
								local137.anObjectArray19 = local2421;
							} else if (arg0 == 1417) {
								local137.anObjectArray23 = local2421;
							} else if (arg0 == 1418) {
								local137.anObjectArray17 = local2421;
							} else if (arg0 == 1419) {
								local137.anObjectArray15 = local2421;
							} else if (arg0 == 1420) {
								local137.anObjectArray29 = local2421;
							} else if (arg0 == 1421) {
								local137.anObjectArray13 = local2421;
							} else if (arg0 == 1422) {
								local137.anObjectArray6 = local2421;
							} else if (arg0 == 1423) {
								local137.anObjectArray12 = local2421;
							} else if (arg0 == 1424) {
								local137.anObjectArray21 = local2421;
							} else if (arg0 == 1425) {
								local137.anObjectArray16 = local2421;
							} else if (arg0 == 1426) {
								local137.anObjectArray32 = local2421;
							} else if (arg0 == 1427) {
								local137.anObjectArray25 = local2421;
							} else if (arg0 == 1428) {
								local137.anObjectArray27 = local2421;
								local137.anIntArray267 = local2369;
							} else if (arg0 == 1429) {
								local137.anObjectArray5 = local2421;
								local137.anIntArray274 = local2369;
							} else if (arg0 == 1430) {
								local137.anObjectArray3 = local2421;
							}
							local137.aBoolean197 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass89_4 : aClass89_5;
							if (arg0 == 1500) {
								anIntArray125[anInt1660++] = local137.anInt2678;
								return;
							}
							if (arg0 == 1501) {
								anIntArray125[anInt1660++] = local137.anInt2721;
								return;
							}
							if (arg0 == 1502) {
								anIntArray125[anInt1660++] = local137.anInt2703;
								return;
							}
							if (arg0 == 1503) {
								anIntArray125[anInt1660++] = local137.anInt2682;
								return;
							}
							if (arg0 == 1504) {
								anIntArray125[anInt1660++] = local137.aBoolean198 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray125[anInt1660++] = local137.anInt2694;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static159.method2690(local137);
								anIntArray125[anInt1660++] = local158 == null ? -1 : local158.anInt2677;
								return;
							}
						} else {
							@Pc(3017) Class155 local3017;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass89_4 : aClass89_5;
								if (arg0 == 1600) {
									anIntArray125[anInt1660++] = local137.anInt2725;
									return;
								}
								if (arg0 == 1601) {
									anIntArray125[anInt1660++] = local137.anInt2699;
									return;
								}
								if (arg0 == 1602) {
									aStringArray10[anInt1657++] = local137.aString17;
									return;
								}
								if (arg0 == 1603) {
									anIntArray125[anInt1660++] = local137.anInt2689;
									return;
								}
								if (arg0 == 1604) {
									anIntArray125[anInt1660++] = local137.anInt2708;
									return;
								}
								if (arg0 == 1605) {
									anIntArray125[anInt1660++] = local137.anInt2688;
									return;
								}
								if (arg0 == 1606) {
									anIntArray125[anInt1660++] = local137.anInt2663;
									return;
								}
								if (arg0 == 1607) {
									anIntArray125[anInt1660++] = local137.anInt2675;
									return;
								}
								if (arg0 == 1608) {
									anIntArray125[anInt1660++] = local137.anInt2685;
									return;
								}
								if (arg0 == 1609) {
									anIntArray125[anInt1660++] = local137.anInt2690;
									return;
								}
								if (arg0 == 1610) {
									anIntArray125[anInt1660++] = local137.anInt2668;
									return;
								}
								if (arg0 == 1611) {
									anIntArray125[anInt1660++] = local137.anInt2680;
									return;
								}
								if (arg0 == 1612) {
									anIntArray125[anInt1660++] = local137.anInt2734;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray125[--anInt1660];
									local3017 = Static376.aClass204_1.method4526(local19);
									if (local3017.method3452()) {
										aStringArray10[anInt1657++] = local137.method2287(local19, local3017.aString37);
										return;
									}
									anIntArray125[anInt1660++] = local137.method2295(local3017.anInt4302, local19);
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass89_4 : aClass89_5;
								if (arg0 == 1700) {
									anIntArray125[anInt1660++] = local137.anInt2670;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt2670 != -1) {
										anIntArray125[anInt1660++] = local137.anInt2719;
										return;
									}
									anIntArray125[anInt1660++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray125[anInt1660++] = local137.anInt2720;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass89_4 : aClass89_5;
								if (arg0 == 1800) {
									anIntArray125[anInt1660++] = Static56.method1002(local137).method4502();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray125[--anInt1660];
									local19--;
									if (local137.aStringArray24 != null && local19 < local137.aStringArray24.length && local137.aStringArray24[local19] != null) {
										aStringArray10[anInt1657++] = local137.aStringArray24[local19];
										return;
									}
									aStringArray10[anInt1657++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString18 == null) {
										aStringArray10[anInt1657++] = "";
										return;
									}
									aStringArray10[anInt1657++] = local137.aString18;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static40.method557(anIntArray125[--anInt1660]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass89_4 : aClass89_5;
								}
								if (anInt1663 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray25 == null) {
										return;
									}
									@Pc(3254) Class10_Sub40 local3254 = new Class10_Sub40();
									local3254.aClass89_12 = local137;
									local3254.anObjectArray36 = local137.anObjectArray25;
									local3254.anInt6390 = anInt1663 + 1;
									Static72.aClass163_15.method3613(local3254);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static40.method557(anIntArray125[--anInt1660]);
								if (arg0 == 2500) {
									anIntArray125[anInt1660++] = local137.anInt2678;
									return;
								}
								if (arg0 == 2501) {
									anIntArray125[anInt1660++] = local137.anInt2721;
									return;
								}
								if (arg0 == 2502) {
									anIntArray125[anInt1660++] = local137.anInt2703;
									return;
								}
								if (arg0 == 2503) {
									anIntArray125[anInt1660++] = local137.anInt2682;
									return;
								}
								if (arg0 == 2504) {
									anIntArray125[anInt1660++] = local137.aBoolean198 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray125[anInt1660++] = local137.anInt2694;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static159.method2690(local137);
									anIntArray125[anInt1660++] = local158 == null ? -1 : local158.anInt2677;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static40.method557(anIntArray125[--anInt1660]);
								if (arg0 == 2600) {
									anIntArray125[anInt1660++] = local137.anInt2725;
									return;
								}
								if (arg0 == 2601) {
									anIntArray125[anInt1660++] = local137.anInt2699;
									return;
								}
								if (arg0 == 2602) {
									aStringArray10[anInt1657++] = local137.aString17;
									return;
								}
								if (arg0 == 2603) {
									anIntArray125[anInt1660++] = local137.anInt2689;
									return;
								}
								if (arg0 == 2604) {
									anIntArray125[anInt1660++] = local137.anInt2708;
									return;
								}
								if (arg0 == 2605) {
									anIntArray125[anInt1660++] = local137.anInt2688;
									return;
								}
								if (arg0 == 2606) {
									anIntArray125[anInt1660++] = local137.anInt2663;
									return;
								}
								if (arg0 == 2607) {
									anIntArray125[anInt1660++] = local137.anInt2675;
									return;
								}
								if (arg0 == 2608) {
									anIntArray125[anInt1660++] = local137.anInt2685;
									return;
								}
								if (arg0 == 2609) {
									anIntArray125[anInt1660++] = local137.anInt2690;
									return;
								}
								if (arg0 == 2610) {
									anIntArray125[anInt1660++] = local137.anInt2668;
									return;
								}
								if (arg0 == 2611) {
									anIntArray125[anInt1660++] = local137.anInt2680;
									return;
								}
								if (arg0 == 2612) {
									anIntArray125[anInt1660++] = local137.anInt2734;
									return;
								}
							} else {
								@Pc(3751) Class10_Sub21 local3751;
								@Pc(3649) Class10_Sub21 local3649;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static40.method557(anIntArray125[--anInt1660]);
										anIntArray125[anInt1660++] = local137.anInt2670;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static40.method557(anIntArray125[--anInt1660]);
										if (local137.anInt2670 != -1) {
											anIntArray125[anInt1660++] = local137.anInt2719;
											return;
										}
										anIntArray125[anInt1660++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray125[--anInt1660];
										local3649 = (Class10_Sub21) Static114.aClass167_12.method3709((long) local13);
										if (local3649 != null) {
											anIntArray125[anInt1660++] = 1;
											return;
										}
										anIntArray125[anInt1660++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static40.method557(anIntArray125[--anInt1660]);
										if (local137.aClass89Array1 == null) {
											anIntArray125[anInt1660++] = 0;
											return;
										}
										local19 = local137.aClass89Array1.length;
										for (local25 = 0; local25 < local137.aClass89Array1.length; local25++) {
											if (local137.aClass89Array1[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray125[anInt1660++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt1660 -= 2;
										local13 = anIntArray125[anInt1660];
										local19 = anIntArray125[anInt1660 + 1];
										local3751 = (Class10_Sub21) Static114.aClass167_12.method3709((long) local13);
										if (local3751 != null && local3751.anInt3646 == local19) {
											anIntArray125[anInt1660++] = 1;
											return;
										}
										anIntArray125[anInt1660++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static40.method557(anIntArray125[--anInt1660]);
									if (arg0 == 2800) {
										anIntArray125[anInt1660++] = Static56.method1002(local137).method4502();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray125[--anInt1660];
										local19--;
										if (local137.aStringArray24 != null && local19 < local137.aStringArray24.length && local137.aStringArray24[local19] != null) {
											aStringArray10[anInt1657++] = local137.aStringArray24[local19];
											return;
										}
										aStringArray10[anInt1657++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString18 == null) {
											aStringArray10[anInt1657++] = "";
											return;
										}
										aStringArray10[anInt1657++] = local137.aString18;
										return;
									}
								} else {
									@Pc(3888) String local3888;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local3888 = aStringArray10[--anInt1657];
											Static404.method5326(local3888);
											return;
										}
										if (arg0 == 3101) {
											anInt1660 -= 2;
											Static346.method4693(anIntArray125[anInt1660 + 1], anIntArray125[anInt1660], Static263.aClass24_Sub3_Sub2_Sub2_4);
											return;
										}
										if (arg0 == 3103) {
											Static340.method4571();
											return;
										}
										if (arg0 == 3104) {
											local3888 = aStringArray10[--anInt1657];
											local19 = 0;
											if (Static223.method3363(local3888)) {
												local19 = Static335.method4519(local3888);
											}
											Static310.method4308(Static43.aClass27_19);
											Static337.aClass10_Sub8_Sub2_2.method2506(local19);
											return;
										}
										if (arg0 == 3105) {
											local3888 = aStringArray10[--anInt1657];
											Static310.method4308(Static261.aClass27_74);
											Static337.aClass10_Sub8_Sub2_2.method2458(local3888.length() + 1);
											Static337.aClass10_Sub8_Sub2_2.method2465(local3888);
											return;
										}
										if (arg0 == 3106) {
											local3888 = aStringArray10[--anInt1657];
											Static310.method4308(Static53.aClass27_22);
											Static337.aClass10_Sub8_Sub2_2.method2458(local3888.length() + 1);
											Static337.aClass10_Sub8_Sub2_2.method2465(local3888);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray125[--anInt1660];
											local1101 = aStringArray10[--anInt1657];
											Static333.method4507(local13, local1101);
											return;
										}
										if (arg0 == 3108) {
											anInt1660 -= 3;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											local25 = anIntArray125[anInt1660 + 2];
											local35 = Static40.method557(local25);
											Static57.method1016(local19, local35, local13);
											return;
										}
										if (arg0 == 3109) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											local210 = arg1 ? aClass89_4 : aClass89_5;
											Static57.method1016(local19, local210, local13);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray125[--anInt1660];
											Static310.method4308(Static80.aClass27_33);
											Static337.aClass10_Sub8_Sub2_2.method2509(local13);
											return;
										}
										if (arg0 == 3111) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											local3751 = (Class10_Sub21) Static114.aClass167_12.method3709((long) local13);
											if (local3751 != null) {
												Static153.method2607(true, local3751, local3751.anInt3646 != local19);
											}
											Static28.method369(3, local13, local19, true);
											return;
										}
										if (arg0 == 3112) {
											anInt1660--;
											local13 = anIntArray125[anInt1660];
											local3649 = (Class10_Sub21) Static114.aClass167_12.method3709((long) local13);
											if (local3649 != null && local3649.anInt3643 == 3) {
												Static153.method2607(true, local3649, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static318.method4369(aStringArray10[--anInt1657]);
											return;
										}
										if (arg0 == 3114) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											local1488 = aStringArray10[--anInt1657];
											Static104.method1823("", local19, local1488, "", local13);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt1660 -= 3;
											Static349.method4740(anIntArray125[anInt1660 + 1], 255, anIntArray125[anInt1660], anIntArray125[anInt1660 + 2]);
											return;
										}
										if (arg0 == 3201) {
											Static365.method2560(50, 255, anIntArray125[--anInt1660]);
											return;
										}
										if (arg0 == 3202) {
											anInt1660 -= 2;
											Static411.method5408(anIntArray125[anInt1660 + 1], 255, anIntArray125[anInt1660]);
											return;
										}
										if (arg0 == 3203) {
											anInt1660 -= 4;
											Static349.method4740(anIntArray125[anInt1660 + 1], anIntArray125[anInt1660 + 3], anIntArray125[anInt1660], anIntArray125[anInt1660 + 2]);
											return;
										}
										if (arg0 == 3204) {
											anInt1660 -= 3;
											Static365.method2560(anIntArray125[anInt1660 + 2], anIntArray125[anInt1660 + 1], anIntArray125[anInt1660]);
											return;
										}
										if (arg0 == 3205) {
											anInt1660 -= 3;
											Static411.method5408(anIntArray125[anInt1660 + 1], anIntArray125[anInt1660 + 2], anIntArray125[anInt1660]);
											return;
										}
										if (arg0 == 3206) {
											anInt1660 -= 4;
											Static458.method6073(anIntArray125[anInt1660 + 3], anIntArray125[anInt1660], anIntArray125[anInt1660 + 1], anIntArray125[anInt1660 + 2]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray125[anInt1660++] = Static400.anInt6752;
											return;
										}
										if (arg0 == 3301) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = Static117.method2052(local13, false, local19);
											return;
										}
										if (arg0 == 3302) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = Static21.method288(false, local19, local13);
											return;
										}
										if (arg0 == 3303) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = Static379.method900(local13, false, local19);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static293.aClass226_1.method4989(local13).anInt3749;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static277.anIntArray474[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static29.anIntArray46[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static117.anIntArray215[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4605) byte local4605 = Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98;
											local19 = (Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092 >> 7) + Static168.anInt3353;
											local25 = (Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094 >> 7) + Static72.anInt1488;
											anIntArray125[anInt1660++] = (local4605 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray125[anInt1660++] = Static175.aBoolean118 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = Static117.method2052(local13, true, local19);
											return;
										}
										if (arg0 == 3314) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = Static21.method288(true, local19, local13);
											return;
										}
										if (arg0 == 3315) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = Static379.method900(local13, true, local19);
											return;
										}
										if (arg0 == 3316) {
											if (Static200.anInt3974 >= 2) {
												anIntArray125[anInt1660++] = Static200.anInt3974;
												return;
											}
											anIntArray125[anInt1660++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray125[anInt1660++] = Static326.anInt5600;
											return;
										}
										if (arg0 == 3318) {
											anIntArray125[anInt1660++] = Static87.aClass21_2.anInt407;
											return;
										}
										if (arg0 == 3321) {
											anIntArray125[anInt1660++] = Static70.anInt1479;
											return;
										}
										if (arg0 == 3322) {
											anIntArray125[anInt1660++] = Static286.anInt5019;
											return;
										}
										if (arg0 == 3323) {
											if (Static458.anInt7601 >= 5 && Static458.anInt7601 <= 9) {
												anIntArray125[anInt1660++] = 1;
												return;
											}
											anIntArray125[anInt1660++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static458.anInt7601 >= 5 && Static458.anInt7601 <= 9) {
												anIntArray125[anInt1660++] = Static458.anInt7601;
												return;
											}
											anIntArray125[anInt1660++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray125[anInt1660++] = Static314.aBoolean360 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray125[anInt1660++] = Static263.aClass24_Sub3_Sub2_Sub2_4.anInt6314;
											return;
										}
										if (arg0 == 3327) {
											anIntArray125[anInt1660++] = Static263.aClass24_Sub3_Sub2_Sub2_4.aClass75_1.aBoolean136 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray125[anInt1660++] = Static269.aBoolean320 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static277.method3882(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = Static293.method4111(local13, local19, false);
											return;
										}
										if (arg0 == 3332) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = Static293.method4111(local13, local19, true);
											return;
										}
										if (arg0 == 3333) {
											anIntArray125[anInt1660++] = Static109.anInt2181;
											return;
										}
										if (arg0 == 3335) {
											anIntArray125[anInt1660++] = Static191.anInt3842;
											return;
										}
										if (arg0 == 3336) {
											anInt1660 -= 4;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											local25 = anIntArray125[anInt1660 + 2];
											local353 = anIntArray125[anInt1660 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray125[anInt1660++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray125[anInt1660++] = Static298.anInt5158;
											return;
										}
										if (arg0 == 3338) {
											anIntArray125[anInt1660++] = Static401.method5905();
											return;
										}
										if (arg0 == 3339) {
											anIntArray125[anInt1660++] = Static159.aBoolean218 ? 1 : 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray125[anInt1660++] = Static451.aBoolean497 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray125[anInt1660++] = Static176.aBoolean235 ? 1 : 0;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5261) Class12 local5261;
										if (arg0 == 3400) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											local5261 = Static108.aClass263_1.method5783(local13);
											aStringArray10[anInt1657++] = local5261.method171(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt1660 -= 4;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											local25 = anIntArray125[anInt1660 + 2];
											local353 = anIntArray125[anInt1660 + 3];
											@Pc(5307) Class12 local5307 = Static108.aClass263_1.method5783(local25);
											if (local5307.aChar2 == local13 && local5307.aChar1 == local19) {
												if (local19 == 115) {
													aStringArray10[anInt1657++] = local5307.method171(local353);
													return;
												}
												anIntArray125[anInt1660++] = local5307.method168(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt1660 -= 3;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											local25 = anIntArray125[anInt1660 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5383) Class12 local5383 = Static108.aClass263_1.method5783(local19);
											if (local5383.aChar1 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray125[anInt1660++] = local5383.method173(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray125[--anInt1660];
											local1101 = aStringArray10[--anInt1657];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5261 = Static108.aClass263_1.method5783(local13);
											if (local5261.aChar1 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray125[anInt1660++] = local5261.method170(local1101) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray125[--anInt1660];
											@Pc(5481) Class12 local5481 = Static108.aClass263_1.method5783(local13);
											anIntArray125[anInt1660++] = local5481.aClass167_3.method3698();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static265.anInt4693 == 0) {
												anIntArray125[anInt1660++] = -2;
												return;
											}
											if (Static265.anInt4693 == 1) {
												anIntArray125[anInt1660++] = -1;
												return;
											}
											anIntArray125[anInt1660++] = Static60.anInt7169;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray125[--anInt1660];
											if (Static265.anInt4693 == 2 && local13 < Static60.anInt7169) {
												aStringArray10[anInt1657++] = Static325.aStringArray36[local13];
												if (Static347.aStringArray40[local13] != null) {
													aStringArray10[anInt1657++] = Static347.aStringArray40[local13];
													return;
												}
												aStringArray10[anInt1657++] = "";
												return;
											}
											aStringArray10[anInt1657++] = "";
											aStringArray10[anInt1657++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray125[--anInt1660];
											if (Static265.anInt4693 == 2 && local13 < Static60.anInt7169) {
												anIntArray125[anInt1660++] = Static9.anIntArray8[local13];
												return;
											}
											anIntArray125[anInt1660++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray125[--anInt1660];
											if (Static265.anInt4693 == 2 && local13 < Static60.anInt7169) {
												anIntArray125[anInt1660++] = Static137.anIntArray286[local13];
												return;
											}
											anIntArray125[anInt1660++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local3888 = aStringArray10[--anInt1657];
											local19 = anIntArray125[--anInt1660];
											Static221.method3315(local19, local3888);
											return;
										}
										if (arg0 == 3605) {
											local3888 = aStringArray10[--anInt1657];
											Static108.method1892(local3888);
											return;
										}
										if (arg0 == 3606) {
											local3888 = aStringArray10[--anInt1657];
											Static274.method3859(local3888);
											return;
										}
										if (arg0 == 3607) {
											local3888 = aStringArray10[--anInt1657];
											Static287.method4051(false, local3888);
											return;
										}
										if (arg0 == 3608) {
											local3888 = aStringArray10[--anInt1657];
											Static9.method112(local3888);
											return;
										}
										if (arg0 == 3609) {
											local3888 = aStringArray10[--anInt1657];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray125[anInt1660++] = Static120.method2091(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray125[--anInt1660];
											if (Static265.anInt4693 == 2 && local13 < Static60.anInt7169) {
												aStringArray10[anInt1657++] = Static447.aStringArray48[local13];
												return;
											}
											aStringArray10[anInt1657++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static222.aString35 != null) {
												aStringArray10[anInt1657++] = Static65.method1085(Static222.aString35);
												return;
											}
											aStringArray10[anInt1657++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static222.aString35 != null) {
												anIntArray125[anInt1660++] = Static207.anInt4058;
												return;
											}
											anIntArray125[anInt1660++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray125[--anInt1660];
											if (Static222.aString35 != null && local13 < Static207.anInt4058) {
												aStringArray10[anInt1657++] = Static247.aClass113Array1[local13].aString22;
												return;
											}
											aStringArray10[anInt1657++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray125[--anInt1660];
											if (Static222.aString35 != null && local13 < Static207.anInt4058) {
												anIntArray125[anInt1660++] = Static247.aClass113Array1[local13].anInt3223;
												return;
											}
											anIntArray125[anInt1660++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray125[--anInt1660];
											if (Static222.aString35 != null && local13 < Static207.anInt4058) {
												anIntArray125[anInt1660++] = Static247.aClass113Array1[local13].aByte29;
												return;
											}
											anIntArray125[anInt1660++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray125[anInt1660++] = Static155.aByte28;
											return;
										}
										if (arg0 == 3617) {
											local3888 = aStringArray10[--anInt1657];
											Static172.method2925(local3888);
											return;
										}
										if (arg0 == 3618) {
											anIntArray125[anInt1660++] = Static302.aByte63;
											return;
										}
										if (arg0 == 3619) {
											local3888 = aStringArray10[--anInt1657];
											Static93.method6042(local3888);
											return;
										}
										if (arg0 == 3620) {
											Static195.method3105();
											return;
										}
										if (arg0 == 3621) {
											if (Static265.anInt4693 == 0) {
												anIntArray125[anInt1660++] = -1;
												return;
											}
											anIntArray125[anInt1660++] = Static107.anInt2161;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray125[--anInt1660];
											if (Static265.anInt4693 != 0 && local13 < Static107.anInt2161) {
												aStringArray10[anInt1657++] = Static369.aStringArray44[local13];
												if (Static99.aStringArray17[local13] != null) {
													aStringArray10[anInt1657++] = Static99.aStringArray17[local13];
													return;
												}
												aStringArray10[anInt1657++] = "";
												return;
											}
											aStringArray10[anInt1657++] = "";
											aStringArray10[anInt1657++] = "";
											return;
										}
										if (arg0 == 3623) {
											local3888 = aStringArray10[--anInt1657];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray125[anInt1660++] = Static47.method837(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray125[--anInt1660];
											if (Static247.aClass113Array1 != null && local13 < Static207.anInt4058 && Static247.aClass113Array1[local13].aString23.equalsIgnoreCase(Static263.aClass24_Sub3_Sub2_Sub2_4.aString58)) {
												anIntArray125[anInt1660++] = 1;
												return;
											}
											anIntArray125[anInt1660++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static249.aString47 != null) {
												aStringArray10[anInt1657++] = Static249.aString47;
												return;
											}
											aStringArray10[anInt1657++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray125[--anInt1660];
											if (Static222.aString35 != null && local13 < Static207.anInt4058) {
												aStringArray10[anInt1657++] = Static247.aClass113Array1[local13].aString24;
												return;
											}
											aStringArray10[anInt1657++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray125[--anInt1660];
											if (Static265.anInt4693 == 2 && local13 >= 0 && local13 < Static60.anInt7169) {
												anIntArray125[anInt1660++] = Static417.aBooleanArray23[local13] ? 1 : 0;
												return;
											}
											anIntArray125[anInt1660++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local3888 = aStringArray10[--anInt1657];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray125[anInt1660++] = Static219.method3311(local3888);
											return;
										}
										if (arg0 == 3629) {
											anIntArray125[anInt1660++] = Static386.anInt6598;
											return;
										}
										if (arg0 == 3630) {
											local3888 = aStringArray10[--anInt1657];
											Static287.method4051(true, local3888);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static414.aBooleanArray21[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray125[--anInt1660];
											if (Static222.aString35 != null && local13 < Static207.anInt4058) {
												aStringArray10[anInt1657++] = Static247.aClass113Array1[local13].aString23;
												return;
											}
											aStringArray10[anInt1657++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray125[--anInt1660];
											if (Static265.anInt4693 != 0 && local13 < Static107.anInt2161) {
												aStringArray10[anInt1657++] = Static321.aStringArray35[local13];
												return;
											}
											aStringArray10[anInt1657++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static154.aClass233Array1[local13].method5172();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static154.aClass233Array1[local13].anInt6588;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static154.aClass233Array1[local13].anInt6596;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static154.aClass233Array1[local13].anInt6589;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static154.aClass233Array1[local13].anInt6593;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static154.aClass233Array1[local13].anInt6590;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray125[--anInt1660];
											local19 = Static154.aClass233Array1[local13].method5173();
											anIntArray125[anInt1660++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray125[--anInt1660];
											local19 = Static154.aClass233Array1[local13].method5173();
											anIntArray125[anInt1660++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray125[--anInt1660];
											local19 = Static154.aClass233Array1[local13].method5173();
											anIntArray125[anInt1660++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray125[--anInt1660];
											local19 = Static154.aClass233Array1[local13].method5173();
											anIntArray125[anInt1660++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt1660 -= 5;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											local25 = anIntArray125[anInt1660 + 2];
											local353 = anIntArray125[anInt1660 + 3];
											local2290 = anIntArray125[anInt1660 + 4];
											anIntArray125[anInt1660++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
											return;
										}
										@Pc(6991) long local6991;
										@Pc(6984) long local6984;
										if (arg0 == 4007) {
											anInt1660 -= 2;
											local6984 = anIntArray125[anInt1660];
											local6991 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = (int) (local6984 + local6984 * local6991 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											if (local13 == 0) {
												anIntArray125[anInt1660++] = 0;
												return;
											}
											anIntArray125[anInt1660++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											if (local13 == 0) {
												anIntArray125[anInt1660++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray125[anInt1660++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray125[anInt1660++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt1660 -= 3;
											local6984 = anIntArray125[anInt1660];
											local6991 = anIntArray125[anInt1660 + 1];
											@Pc(7372) long local7372 = (long) anIntArray125[anInt1660 + 2];
											anIntArray125[anInt1660++] = (int) (local6984 * local7372 / local6991);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local3888 = aStringArray10[--anInt1657];
											local19 = anIntArray125[--anInt1660];
											aStringArray10[anInt1657++] = local3888 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt1657 -= 2;
											local3888 = aStringArray10[anInt1657];
											local1101 = aStringArray10[anInt1657 + 1];
											aStringArray10[anInt1657++] = local3888 + local1101;
											return;
										}
										if (arg0 == 4102) {
											local3888 = aStringArray10[--anInt1657];
											local19 = anIntArray125[--anInt1660];
											aStringArray10[anInt1657++] = local3888 + Static28.method368(local19);
											return;
										}
										if (arg0 == 4103) {
											local3888 = aStringArray10[--anInt1657];
											aStringArray10[anInt1657++] = local3888.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray10[anInt1657++] = method1502(anIntArray125[--anInt1660]);
											return;
										}
										if (arg0 == 4105) {
											anInt1657 -= 2;
											local3888 = aStringArray10[anInt1657];
											local1101 = aStringArray10[anInt1657 + 1];
											if (Static263.aClass24_Sub3_Sub2_Sub2_4.aClass75_1 != null && Static263.aClass24_Sub3_Sub2_Sub2_4.aClass75_1.aBoolean136) {
												aStringArray10[anInt1657++] = local1101;
												return;
											}
											aStringArray10[anInt1657++] = local3888;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray125[--anInt1660];
											aStringArray10[anInt1657++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt1657 -= 2;
											anIntArray125[anInt1660++] = Static208.method3231(aStringArray10[anInt1657], Static191.anInt3842, aStringArray10[anInt1657 + 1]);
											return;
										}
										@Pc(7655) Class79 local7655;
										if (arg0 == 4108) {
											local3888 = aStringArray10[--anInt1657];
											anInt1660 -= 2;
											local19 = anIntArray125[anInt1660];
											local25 = anIntArray125[anInt1660 + 1];
											local7655 = Static378.method5102(local25, Static326.aClass187_99);
											anIntArray125[anInt1660++] = local7655.method1984(local3888, Static301.aClass80Array16, local19);
											return;
										}
										if (arg0 == 4109) {
											local3888 = aStringArray10[--anInt1657];
											anInt1660 -= 2;
											local19 = anIntArray125[anInt1660];
											local25 = anIntArray125[anInt1660 + 1];
											local7655 = Static378.method5102(local25, Static326.aClass187_99);
											anIntArray125[anInt1660++] = local7655.method1982(Static301.aClass80Array16, local19, local3888);
											return;
										}
										if (arg0 == 4110) {
											anInt1657 -= 2;
											local3888 = aStringArray10[anInt1657];
											local1101 = aStringArray10[anInt1657 + 1];
											if (anIntArray125[--anInt1660] == 1) {
												aStringArray10[anInt1657++] = local3888;
												return;
											}
											aStringArray10[anInt1657++] = local1101;
											return;
										}
										if (arg0 == 4111) {
											local3888 = aStringArray10[--anInt1657];
											aStringArray10[anInt1657++] = Static391.method5206(local3888);
											return;
										}
										if (arg0 == 4112) {
											local3888 = aStringArray10[--anInt1657];
											local19 = anIntArray125[--anInt1660];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray10[anInt1657++] = local3888 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static335.method4520((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static70.method1359((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static63.method1057((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static319.method4375((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local3888 = aStringArray10[--anInt1657];
											if (local3888 != null) {
												anIntArray125[anInt1660++] = local3888.length();
												return;
											}
											anIntArray125[anInt1660++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local3888 = aStringArray10[--anInt1657];
											anInt1660 -= 2;
											local19 = anIntArray125[anInt1660];
											local25 = anIntArray125[anInt1660 + 1];
											aStringArray10[anInt1657++] = local3888.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local3888 = aStringArray10[--anInt1657];
											@Pc(8018) StringBuffer local8018 = new StringBuffer(local3888.length());
											@Pc(8020) boolean local8020 = false;
											for (local353 = 0; local353 < local3888.length(); local353++) {
												@Pc(8027) char local8027 = local3888.charAt(local353);
												if (local8027 == '<') {
													local8020 = true;
												} else if (local8027 == '>') {
													local8020 = false;
												} else if (!local8020) {
													local8018.append(local8027);
												}
											}
											aStringArray10[anInt1657++] = local8018.toString();
											return;
										}
										if (arg0 == 4120) {
											local3888 = aStringArray10[--anInt1657];
											anInt1660 -= 2;
											local19 = anIntArray125[anInt1660];
											local25 = anIntArray125[anInt1660 + 1];
											anIntArray125[anInt1660++] = local3888.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt1657 -= 2;
											local3888 = aStringArray10[anInt1657];
											local1101 = aStringArray10[anInt1657 + 1];
											local25 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = local3888.indexOf(local1101, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray125[--anInt1660] != 0;
											local19 = anIntArray125[--anInt1660];
											aStringArray10[anInt1657++] = Static117.method2051((long) local19, local412, Static191.anInt3842, 0);
											return;
										}
										if (arg0 == 4125) {
											local3888 = aStringArray10[--anInt1657];
											local19 = anIntArray125[--anInt1660];
											@Pc(8241) Class79 local8241 = Static378.method5102(local19, Static326.aClass187_99);
											anIntArray125[anInt1660++] = local8241.method1980(Static301.aClass80Array16, local3888);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray125[--anInt1660];
											aStringArray10[anInt1657++] = Static313.aClass272_2.method6068(local13).aString11;
											return;
										}
										@Pc(8303) Class60 local8303;
										if (arg0 == 4201) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											local8303 = Static313.aClass272_2.method6068(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray14[local19 - 1] != null) {
												aStringArray10[anInt1657++] = local8303.aStringArray14[local19 - 1];
												return;
											}
											aStringArray10[anInt1657++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											local8303 = Static313.aClass272_2.method6068(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray15[local19 - 1] != null) {
												aStringArray10[anInt1657++] = local8303.aStringArray15[local19 - 1];
												return;
											}
											aStringArray10[anInt1657++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static313.aClass272_2.method6068(local13).anInt1713;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static313.aClass272_2.method6068(local13).anInt1718 == 1 ? 1 : 0;
											return;
										}
										@Pc(8466) Class60 local8466;
										if (arg0 == 4205) {
											local13 = anIntArray125[--anInt1660];
											local8466 = Static313.aClass272_2.method6068(local13);
											if (local8466.anInt1691 == -1 && local8466.anInt1716 >= 0) {
												anIntArray125[anInt1660++] = local8466.anInt1716;
												return;
											}
											anIntArray125[anInt1660++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray125[--anInt1660];
											local8466 = Static313.aClass272_2.method6068(local13);
											if (local8466.anInt1691 >= 0 && local8466.anInt1716 >= 0) {
												anIntArray125[anInt1660++] = local8466.anInt1716;
												return;
											}
											anIntArray125[anInt1660++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray125[--anInt1660];
											anIntArray125[anInt1660++] = Static313.aClass272_2.method6068(local13).aBoolean113 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											local3017 = Static376.aClass204_1.method4526(local19);
											if (local3017.method3452()) {
												aStringArray10[anInt1657++] = Static313.aClass272_2.method6068(local13).method1525(local19, local3017.aString37);
												return;
											}
											anIntArray125[anInt1660++] = Static313.aClass272_2.method6068(local13).method1538(local3017.anInt4302, local19);
											return;
										}
										if (arg0 == 4209) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1] - 1;
											local8303 = Static313.aClass272_2.method6068(local13);
											if (local8303.anInt1711 == local19) {
												anIntArray125[anInt1660++] = local8303.anInt1725;
												return;
											}
											if (local8303.anInt1708 == local19) {
												anIntArray125[anInt1660++] = local8303.anInt1743;
												return;
											}
											anIntArray125[anInt1660++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local3888 = aStringArray10[--anInt1657];
											local19 = anIntArray125[--anInt1660];
											Static383.method5148(local3888, local19 == 1);
											anIntArray125[anInt1660++] = Static9.anInt150;
											return;
										}
										if (arg0 == 4211) {
											if (Static260.aShortArray69 != null && Static452.anInt4834 < Static9.anInt150) {
												anIntArray125[anInt1660++] = Static260.aShortArray69[Static452.anInt4834++] & 0xFFFF;
												return;
											}
											anIntArray125[anInt1660++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static452.anInt4834 = 0;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											local3017 = Static376.aClass204_1.method4526(local19);
											if (local3017.method3452()) {
												aStringArray10[anInt1657++] = Static448.aClass38_4.method866(local13).method4940(local3017.aString37, local19);
												return;
											}
											anIntArray125[anInt1660++] = Static448.aClass38_4.method866(local13).method4941(local3017.anInt4302, local19);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											local3017 = Static376.aClass204_1.method4526(local19);
											if (local3017.method3452()) {
												aStringArray10[anInt1657++] = Static342.aClass237_4.method5212(local13).method3016(local19, local3017.aString37);
												return;
											}
											anIntArray125[anInt1660++] = Static342.aClass237_4.method5212(local13).method3012(local3017.anInt4302, local19);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt1660 -= 2;
											local13 = anIntArray125[anInt1660];
											local19 = anIntArray125[anInt1660 + 1];
											local3017 = Static376.aClass204_1.method4526(local19);
											if (local3017.method3452()) {
												aStringArray10[anInt1657++] = Static394.aClass48_1.method1079(local13).method4977(local3017.aString37, local19);
												return;
											}
											anIntArray125[anInt1660++] = Static394.aClass48_1.method1079(local13).method4974(local3017.anInt4302, local19);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray125[--anInt1660];
										@Pc(8967) Class6 local8967 = Static133.aClass223_1.method4952(local13);
										if (local8967.anIntArray2 != null && local8967.anIntArray2.length > 0) {
											local25 = 0;
											local353 = local8967.anIntArray4[0];
											for (local2290 = 1; local2290 < local8967.anIntArray2.length; local2290++) {
												if (local8967.anIntArray4[local2290] > local353) {
													local25 = local2290;
													local353 = local8967.anIntArray4[local2290];
												}
											}
											anIntArray125[anInt1660++] = local8967.anIntArray2[local25];
											return;
										}
										anIntArray125[anInt1660++] = local8967.anInt63;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static40.method557(anIntArray125[--anInt1660]);
						} else {
							local137 = arg1 ? aClass89_4 : aClass89_5;
						}
						if (arg0 == 1300) {
							local19 = anIntArray125[--anInt1660] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method2294(local19, aStringArray10[--anInt1657]);
								return;
							}
							anInt1657--;
							return;
						}
						if (arg0 == 1301) {
							anInt1660 -= 2;
							local19 = anIntArray125[anInt1660];
							local25 = anIntArray125[anInt1660 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass89_7 = null;
								return;
							}
							local137.aClass89_7 = Static397.method5275(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray125[--anInt1660];
							if (local19 != Static106.anInt2138 && local19 != Static268.anInt4862 && local19 != Static118.anInt2407) {
								return;
							}
							local137.anInt2705 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt2683 = anIntArray125[--anInt1660];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt2736 = anIntArray125[--anInt1660];
							return;
						}
						if (arg0 == 1305) {
							local137.aString18 = aStringArray10[--anInt1657];
							return;
						}
						if (arg0 == 1306) {
							local137.aString20 = aStringArray10[--anInt1657];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray24 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt2667 = anIntArray125[--anInt1660];
							local137.anInt2698 = anIntArray125[--anInt1660];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray125[--anInt1660];
							local25 = anIntArray125[--anInt1660];
							if (local25 >= 1 && local25 <= 10) {
								local137.method2282(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString19 = aStringArray10[--anInt1657];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt2746 = anIntArray125[--anInt1660];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt1660 -= 3;
								local19 = anIntArray125[anInt1660] - 1;
								local25 = anIntArray125[anInt1660 + 1];
								local353 = anIntArray125[anInt1660 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt1660 -= 2;
								local19 = 10;
								local25 = anIntArray125[anInt1660];
								local353 = anIntArray125[anInt1660 + 1];
							}
							if (local137.aByteArray29 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray29 = new byte[11];
								local137.aByteArray28 = new byte[11];
								local137.anIntArray271 = new int[11];
							}
							local137.aByteArray29[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean201 = false;
								for (local2290 = 0; local2290 < local137.aByteArray29.length; local2290++) {
									if (local137.aByteArray29[local2290] != 0) {
										local137.aBoolean201 = true;
										break;
									}
								}
							} else {
								local137.aBoolean201 = true;
							}
							local137.aByteArray28[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt2718 = anIntArray125[--anInt1660];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static40.method557(anIntArray125[--anInt1660]);
					} else {
						local137 = arg1 ? aClass89_4 : aClass89_5;
					}
					Static135.method5400(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt1660 -= 2;
						local19 = anIntArray125[anInt1660];
						local25 = anIntArray125[anInt1660 + 1];
						if (local137.anInt2720 == -1) {
							Static111.method4689(local137.anInt2677);
							Static337.method4522(local137.anInt2677);
							Static1.method3(local137.anInt2677);
						}
						if (local19 == -1) {
							local137.anInt2728 = 1;
							local137.anInt2733 = -1;
							local137.anInt2670 = -1;
							return;
						}
						local137.anInt2670 = local19;
						local137.anInt2719 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean199 = true;
						} else {
							local137.aBoolean199 = false;
						}
						@Pc(1630) Class60 local1630 = Static313.aClass272_2.method6068(local19);
						local137.anInt2663 = local1630.anInt1693;
						local137.anInt2685 = local1630.anInt1696;
						local137.anInt2675 = local1630.anInt1721;
						local137.anInt2668 = local1630.anInt1706;
						local137.anInt2680 = local1630.anInt1733;
						local137.anInt2688 = local1630.anInt1681;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt2739 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt2739 = 1;
						} else {
							local137.anInt2739 = 2;
						}
						if (local137.anInt2706 > 0) {
							local137.anInt2688 = local137.anInt2688 * 32 / local137.anInt2706;
							return;
						}
						if (local137.anInt2748 > 0) {
							local137.anInt2688 = local137.anInt2688 * 32 / local137.anInt2748;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt2728 = 2;
						local137.anInt2733 = anIntArray125[--anInt1660];
						if (local137.anInt2720 == -1) {
							Static25.method333(local137.anInt2677);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt2728 = 3;
						local137.anInt2733 = -1;
						if (local137.anInt2720 == -1) {
							Static25.method333(local137.anInt2677);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt2728 = 6;
						local137.anInt2733 = anIntArray125[--anInt1660];
						if (local137.anInt2720 == -1) {
							Static25.method333(local137.anInt2677);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt2728 = 5;
						local137.anInt2733 = anIntArray125[--anInt1660];
						if (local137.anInt2720 == -1) {
							Static25.method333(local137.anInt2677);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt1660 -= 4;
						local137.anInt2744 = anIntArray125[anInt1660];
						local137.anInt2742 = anIntArray125[anInt1660 + 1];
						local137.anInt2716 = anIntArray125[anInt1660 + 2];
						local137.anInt2710 = anIntArray125[anInt1660 + 3];
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt1660 -= 2;
						local137.anInt2731 = anIntArray125[anInt1660];
						local137.anInt2749 = anIntArray125[anInt1660 + 1];
						Static135.method5400(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt1660 -= 4;
						local137.anInt2733 = anIntArray125[anInt1660];
						local137.anInt2722 = anIntArray125[anInt1660 + 1];
						if (anIntArray125[anInt1660 + 2] == 1) {
							local137.anInt2728 = 9;
						} else {
							local137.anInt2728 = 8;
						}
						if (anIntArray125[anInt1660 + 3] == 1) {
							local137.aBoolean199 = true;
						} else {
							local137.aBoolean199 = false;
						}
						if (local137.anInt2720 == -1) {
							Static25.method333(local137.anInt2677);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt2728 = 5;
						local137.anInt2733 = Static245.anInt4435;
						local137.anInt2722 = 0;
						if (local137.anInt2720 == -1) {
							Static25.method333(local137.anInt2677);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static40.method557(anIntArray125[--anInt1660]);
				} else {
					local137 = arg1 ? aClass89_4 : aClass89_5;
				}
				if (arg0 == 1000) {
					anInt1660 -= 4;
					local137.anInt2707 = anIntArray125[anInt1660];
					local137.anInt2692 = anIntArray125[anInt1660 + 1];
					local19 = anIntArray125[anInt1660 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray125[anInt1660 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte21 = (byte) local19;
					local137.aByte19 = (byte) local25;
					Static135.method5400(local137);
					Static413.method5439(local137);
					if (local137.anInt2720 == -1) {
						Static238.method3478(local137.anInt2677);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt1660 -= 4;
					local137.anInt2748 = anIntArray125[anInt1660];
					local137.anInt2700 = anIntArray125[anInt1660 + 1];
					local137.anInt2706 = 0;
					local137.anInt2681 = 0;
					local19 = anIntArray125[anInt1660 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray125[anInt1660 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte22 = (byte) local19;
					local137.aByte20 = (byte) local25;
					Static135.method5400(local137);
					Static413.method5439(local137);
					if (local137.anInt2727 == 0) {
						Static344.method4658(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray125[--anInt1660] == 1;
					if (local137.aBoolean198 != local620) {
						local137.aBoolean198 = local620;
						Static135.method5400(local137);
					}
					if (local137.anInt2720 == -1) {
						Static436.method5771(local137.anInt2677);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt1660 -= 2;
					local137.anInt2751 = anIntArray125[anInt1660];
					local137.anInt2696 = anIntArray125[anInt1660 + 1];
					Static135.method5400(local137);
					Static413.method5439(local137);
					if (local137.anInt2727 == 0) {
						Static344.method4658(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean192 = anIntArray125[--anInt1660] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V")
	private static void method1510(@OriginalArg(0) int arg0) {
		@Pc(3) Class89 local3 = Static40.method557(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class89[] local13 = Static61.aClass89ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class89[] local19 = Static166.aClass89ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static61.aClass89ArrayArray1[local9] = new Class89[local22];
			Static468.method4355(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static468.method4355(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!cd;II)V")
	public static void method1511(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class10_Sub1_Sub11 local5 = Static167.method2776(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray127 = new int[local5.anInt4479];
		aStringArray11 = new String[local5.anInt4478];
		if (local5.aClass36_11 == Static169.aClass36_8 || local5.aClass36_11 == Static182.aClass36_10 || local5.aClass36_11 == Static448.aClass36_13) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static11.aClass89_1 != null) {
				local30 = Static11.aClass89_1.anInt2678;
				local32 = Static11.aClass89_1.anInt2721;
			}
			anIntArray127[0] = Static113.aClass13_1.method4116() - local30;
			anIntArray127[1] = Static113.aClass13_1.method4123() - local32;
		}
		method1505(local5, 200000);
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(IZ)V")
	public static void method1512() {
	}

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)V")
	private static void method1513(@OriginalArg(0) int arg0) {
		@Pc(3) Class89 local3 = Static40.method557(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class89[] local13 = Static61.aClass89ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class89[] local19 = Static166.aClass89ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static61.aClass89ArrayArray1[local9] = new Class89[local22];
			Static468.method4355(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static468.method4355(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}
}
