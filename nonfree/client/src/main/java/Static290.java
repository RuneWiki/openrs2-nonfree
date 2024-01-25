import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "Lclient!cr;")
	private static Class41 aClass41_9;

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "Lclient!am;")
	private static Class11 aClass11_1;

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray26;

	@OriginalMember(owner = "client!ov", name = "t", descriptor = "[I")
	private static int[] anIntArray352;

	@OriginalMember(owner = "client!ov", name = "v", descriptor = "Lclient!cr;")
	private static Class41 aClass41_10;

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "[I")
	private static final int[] anIntArray351 = new int[5];

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
	private static int anInt5235 = 0;

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray27 = new String[1000];

	@OriginalMember(owner = "client!ov", name = "q", descriptor = "[Lclient!tc;")
	private static final Class226[] aClass226Array1 = new Class226[50];

	@OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
	private static int anInt5241 = 0;

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "I")
	private static int anInt5243 = 0;

	@OriginalMember(owner = "client!ov", name = "w", descriptor = "[[I")
	private static final int[][] anIntArrayArray41 = new int[5][5000];

	@OriginalMember(owner = "client!ov", name = "x", descriptor = "[I")
	private static final int[] anIntArray353 = new int[1000];

	@OriginalMember(owner = "client!ov", name = "z", descriptor = "[I")
	private static final int[] anIntArray354 = new int[3];

	@OriginalMember(owner = "client!ov", name = "A", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_49 = new Class129(4);

	@OriginalMember(owner = "client!ov", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray28 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ov", name = "C", descriptor = "I")
	private static int anInt5245 = 0;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
	private static void method4220(@OriginalArg(0) int arg0) {
		@Pc(3) Class41 local3 = Static160.method2564(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class41[] local13 = Static117.aClass41ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class41[] local19 = Static450.aClass41ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static117.aClass41ArrayArray1[local9] = new Class41[local22];
			Static459.method3352(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static459.method3352(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V")
	private static void method4221(@OriginalArg(0) int arg0) {
		@Pc(3) Class41 local3 = Static160.method2564(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class41[] local13 = Static117.aClass41ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class41[] local19 = Static450.aClass41ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static117.aClass41ArrayArray1[local9] = new Class41[local22];
			Static459.method3352(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static459.method3352(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!dk;I)V")
	private static void method4222(@OriginalArg(0) Class2_Sub14 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray32;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub2_Sub16 local12 = Static17.method245(local8);
		if (local12 == null) {
			return;
		}
		anIntArray352 = new int[local12.anInt6336];
		@Pc(21) int local21 = 0;
		aStringArray26 = new String[local12.anInt6339];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt1856;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt1852;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass41_5 == null ? -1 : arg0.aClass41_5.anInt1613;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt1851;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass41_5 == null ? -1 : arg0.aClass41_5.anInt1683;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass41_4 == null ? -1 : arg0.aClass41_4.anInt1613;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass41_4 == null ? -1 : arg0.aClass41_4.anInt1683;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt1854;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt1853;
				}
				anIntArray352[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString15;
				}
				aStringArray26[local27++] = local135;
			}
		}
		anInt5245 = arg0.anInt1857;
		method4230(local12, arg1);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IZ)V")
	public static void method4223() {
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method4225(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray28[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!sl;II)V")
	public static void method4226(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub2_Sub16 local5 = Static124.method1792(arg2, arg0, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray352 = new int[local5.anInt6336];
		aStringArray26 = new String[local5.anInt6339];
		if (local5.aClass222_9 == Static322.aClass222_7 || local5.aClass222_9 == Static198.aClass222_5 || local5.aClass222_9 == Static446.aClass222_11) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static22.aClass41_1 != null) {
				local30 = Static22.aClass41_1.anInt1618;
				local32 = Static22.aClass41_1.anInt1675;
			}
			anIntArray352[0] = Static304.aClass40_1.method1164() - local30;
			anIntArray352[1] = Static304.aClass40_1.method1159() - local32;
		}
		method4230(local5, 200000);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!dk;)V")
	public static void method4227(@OriginalArg(0) Class2_Sub14 arg0) {
		method4222(arg0, 200000);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4228(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static255.anInt4802 == 0 && (Static217.aBoolean41 && !Static296.aBoolean462 || Static407.aBoolean597)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static86.aClass256_37.method5720(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static86.aClass256_37.method5720(0).length());
		} else if (local11.startsWith(Static227.aClass256_82.method5720(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static227.aClass256_82.method5720(0).length());
		} else if (local11.startsWith(Static17.aClass256_8.method5720(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static17.aClass256_8.method5720(0).length());
		} else if (local11.startsWith(Static306.aClass256_111.method5720(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static306.aClass256_111.method5720(0).length());
		} else if (local11.startsWith(Static346.aClass256_122.method5720(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static346.aClass256_122.method5720(0).length());
		} else if (local11.startsWith(Static98.aClass256_42.method5720(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static98.aClass256_42.method5720(0).length());
		} else if (local11.startsWith(Static212.aClass256_73.method5720(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static212.aClass256_73.method5720(0).length());
		} else if (local11.startsWith(Static123.aClass256_47.method5720(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static123.aClass256_47.method5720(0).length());
		} else if (local11.startsWith(Static402.aClass256_144.method5720(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static402.aClass256_144.method5720(0).length());
		} else if (local11.startsWith(Static7.aClass256_4.method5720(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static7.aClass256_4.method5720(0).length());
		} else if (local11.startsWith(Static239.aClass256_87.method5720(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static239.aClass256_87.method5720(0).length());
		} else if (local11.startsWith(Static226.aClass256_80.method5720(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static226.aClass256_80.method5720(0).length());
		} else if (Static272.anInt7537 != 0) {
			if (local11.startsWith(Static86.aClass256_37.method5720(Static272.anInt7537))) {
				local13 = 0;
				arg0 = arg0.substring(Static86.aClass256_37.method5720(Static272.anInt7537).length());
			} else if (local11.startsWith(Static227.aClass256_82.method5720(Static272.anInt7537))) {
				local13 = 1;
				arg0 = arg0.substring(Static227.aClass256_82.method5720(Static272.anInt7537).length());
			} else if (local11.startsWith(Static17.aClass256_8.method5720(Static272.anInt7537))) {
				local13 = 2;
				arg0 = arg0.substring(Static17.aClass256_8.method5720(Static272.anInt7537).length());
			} else if (local11.startsWith(Static306.aClass256_111.method5720(Static272.anInt7537))) {
				local13 = 3;
				arg0 = arg0.substring(Static306.aClass256_111.method5720(Static272.anInt7537).length());
			} else if (local11.startsWith(Static346.aClass256_122.method5720(Static272.anInt7537))) {
				local13 = 4;
				arg0 = arg0.substring(Static346.aClass256_122.method5720(Static272.anInt7537).length());
			} else if (local11.startsWith(Static98.aClass256_42.method5720(Static272.anInt7537))) {
				local13 = 5;
				arg0 = arg0.substring(Static98.aClass256_42.method5720(Static272.anInt7537).length());
			} else if (local11.startsWith(Static212.aClass256_73.method5720(Static272.anInt7537))) {
				local13 = 6;
				arg0 = arg0.substring(Static212.aClass256_73.method5720(Static272.anInt7537).length());
			} else if (local11.startsWith(Static123.aClass256_47.method5720(Static272.anInt7537))) {
				local13 = 7;
				arg0 = arg0.substring(Static123.aClass256_47.method5720(Static272.anInt7537).length());
			} else if (local11.startsWith(Static402.aClass256_144.method5720(Static272.anInt7537))) {
				local13 = 8;
				arg0 = arg0.substring(Static402.aClass256_144.method5720(Static272.anInt7537).length());
			} else if (local11.startsWith(Static7.aClass256_4.method5720(Static272.anInt7537))) {
				local13 = 9;
				arg0 = arg0.substring(Static7.aClass256_4.method5720(Static272.anInt7537).length());
			} else if (local11.startsWith(Static239.aClass256_87.method5720(Static272.anInt7537))) {
				local13 = 10;
				arg0 = arg0.substring(Static239.aClass256_87.method5720(Static272.anInt7537).length());
			} else if (local11.startsWith(Static226.aClass256_80.method5720(Static272.anInt7537))) {
				local13 = 11;
				arg0 = arg0.substring(Static226.aClass256_80.method5720(Static272.anInt7537).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static99.aClass256_31.method5720(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static99.aClass256_31.method5720(0).length());
		} else if (local11.startsWith(Static217.aClass256_12.method5720(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static217.aClass256_12.method5720(0).length());
		} else if (local11.startsWith(Static256.aClass256_91.method5720(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static256.aClass256_91.method5720(0).length());
		} else if (local11.startsWith(Static38.aClass256_20.method5720(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static38.aClass256_20.method5720(0).length());
		} else if (local11.startsWith(Static367.aClass256_131.method5720(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static367.aClass256_131.method5720(0).length());
		} else if (Static272.anInt7537 != 0) {
			if (local11.startsWith(Static99.aClass256_31.method5720(Static272.anInt7537))) {
				local451 = 1;
				arg0 = arg0.substring(Static99.aClass256_31.method5720(Static272.anInt7537).length());
			} else if (local11.startsWith(Static217.aClass256_12.method5720(Static272.anInt7537))) {
				local451 = 2;
				arg0 = arg0.substring(Static217.aClass256_12.method5720(Static272.anInt7537).length());
			} else if (local11.startsWith(Static256.aClass256_91.method5720(Static272.anInt7537))) {
				local451 = 3;
				arg0 = arg0.substring(Static256.aClass256_91.method5720(Static272.anInt7537).length());
			} else if (local11.startsWith(Static38.aClass256_20.method5720(Static272.anInt7537))) {
				local451 = 4;
				arg0 = arg0.substring(Static38.aClass256_20.method5720(Static272.anInt7537).length());
			} else if (local11.startsWith(Static367.aClass256_131.method5720(Static272.anInt7537))) {
				local451 = 5;
				arg0 = arg0.substring(Static367.aClass256_131.method5720(Static272.anInt7537).length());
			}
		}
		Static448.method6059(Static446.aClass44_98);
		Static98.aClass2_Sub20_Sub1_1.method3699(0);
		@Pc(646) int local646 = Static98.aClass2_Sub20_Sub1_1.anInt4608;
		if (arg1 == 5021) {
			Static98.aClass2_Sub20_Sub1_1.method3699(1);
		} else if (arg1 == 5022) {
			Static98.aClass2_Sub20_Sub1_1.method3699(2);
		} else {
			Static98.aClass2_Sub20_Sub1_1.method3699(0);
		}
		Static98.aClass2_Sub20_Sub1_1.method3699(local13);
		Static98.aClass2_Sub20_Sub1_1.method3699(local451);
		Static9.method191(arg0, Static98.aClass2_Sub20_Sub1_1);
		Static98.aClass2_Sub20_Sub1_1.method3709(Static98.aClass2_Sub20_Sub1_1.anInt4608 - local646);
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "()V")
	public static void method4229() {
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!sj;I)V")
	private static void method4230(@OriginalArg(0) Class2_Sub2_Sub16 arg0, @OriginalArg(1) int arg1) {
		anInt5241 = 0;
		anInt5243 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray424;
		@Pc(11) int[] local11 = arg0.anIntArray423;
		@Pc(13) byte local13 = -1;
		anInt5235 = 0;
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
						method4232(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method4233(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray353[anInt5241++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray353[anInt5241++] = Static215.aClass225_1.anIntArray439[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static215.aClass225_1.method5147(anIntArray353[--anInt5241], local54);
					} else if (local31 == 3) {
						aStringArray27[anInt5243++] = arg0.aStringArray34[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt5241 -= 2;
						if (anIntArray353[anInt5241] != anIntArray353[anInt5241 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt5241 -= 2;
						if (anIntArray353[anInt5241] == anIntArray353[anInt5241 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt5241 -= 2;
						if (anIntArray353[anInt5241] < anIntArray353[anInt5241 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt5241 -= 2;
						if (anIntArray353[anInt5241] > anIntArray353[anInt5241 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt5235 == 0) {
							return;
						}
						@Pc(216) Class226 local216 = aClass226Array1[--anInt5235];
						arg0 = local216.aClass2_Sub2_Sub16_1;
						local8 = arg0.anIntArray424;
						local11 = arg0.anIntArray423;
						local5 = local216.anInt6689;
						anIntArray352 = local216.anIntArray441;
						aStringArray26 = local216.aStringArray37;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray353[anInt5241++] = Static215.aClass225_1.method5146(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static215.aClass225_1.method5154(local54, anIntArray353[--anInt5241]);
					} else if (local31 == 31) {
						anInt5241 -= 2;
						if (anIntArray353[anInt5241] <= anIntArray353[anInt5241 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt5241 -= 2;
						if (anIntArray353[anInt5241] >= anIntArray353[anInt5241 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray353[anInt5241++] = anIntArray352[local11[local5]];
					} else if (local31 == 34) {
						anIntArray352[local11[local5]] = anIntArray353[--anInt5241];
					} else if (local31 == 35) {
						aStringArray27[anInt5243++] = aStringArray26[local11[local5]];
					} else if (local31 == 36) {
						aStringArray26[local11[local5]] = aStringArray27[--anInt5243];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt5243 -= local54;
						@Pc(400) String local400 = Static77.method5565(local54, aStringArray27, anInt5243);
						aStringArray27[anInt5243++] = local400;
					} else if (local31 == 38) {
						anInt5241--;
					} else if (local31 == 39) {
						anInt5243--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class2_Sub2_Sub16 local436 = Static17.method245(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt6336];
							@Pc(450) String[] local450 = new String[local436.anInt6339];
							for (local452 = 0; local452 < local436.anInt6343; local452++) {
								local446[local452] = anIntArray353[anInt5241 + local452 - local436.anInt6343];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt6342; local471++) {
								local450[local471] = aStringArray27[anInt5243 + local471 - local436.anInt6342];
							}
							anInt5241 -= local436.anInt6343;
							anInt5243 -= local436.anInt6342;
							@Pc(502) Class226 local502 = new Class226();
							local502.aClass2_Sub2_Sub16_1 = arg0;
							local502.anInt6689 = local5;
							local502.anIntArray441 = anIntArray352;
							local502.aStringArray37 = aStringArray26;
							if (anInt5235 >= aClass226Array1.length) {
								throw new RuntimeException();
							}
							aClass226Array1[anInt5235++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray424;
							local11 = local436.anIntArray423;
							local5 = -1;
							anIntArray352 = local446;
							aStringArray26 = local450;
						} else if (local31 == 42) {
							anIntArray353[anInt5241++] = Static299.anIntArray357[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static299.anIntArray357[local54] = anIntArray353[--anInt5241];
							Static445.method6018(local54);
							Static442.aBoolean663 |= Static381.aBooleanArray48[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray353[--anInt5241];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray351[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray41[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray353[--anInt5241];
							if (local603 < 0 || local603 >= anIntArray351[local54]) {
								throw new RuntimeException();
							}
							anIntArray353[anInt5241++] = anIntArrayArray41[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt5241 -= 2;
							local603 = anIntArray353[anInt5241];
							if (local603 < 0 || local603 >= anIntArray351[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray41[local54][local603] = anIntArray353[anInt5241 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static227.aStringArray21[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray27[anInt5243++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static227.aStringArray21[local54] = aStringArray27[--anInt5243];
							Static340.method4784(local54);
						} else if (local31 == 51) {
							@Pc(774) Class240 local774 = arg0.aClass240Array1[local11[local5]];
							@Pc(787) Class2_Sub16 local787 = (Class2_Sub16) local774.method5439((long) anIntArray353[--anInt5241]);
							if (local787 != null) {
								local5 += local787.anInt2428;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString52 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong227).append(" ");
				for (local603 = anInt5235 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass226Array1[local603].aClass2_Sub2_Sub16_1.aLong227).append(" ");
				}
				local855.append("op: ").append(local13);
				Static80.method1410(local837, local855.toString());
			} else {
				Static165.method4929("Clientscript error in: " + arg0.aString52);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString52).append("\n");
				for (local603 = anInt5235 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass226Array1[local603].aClass2_Sub2_Sub16_1.aString52).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static80.method1410(local837, local855.toString());
				Static190.method3004(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "(I)V")
	public static void method4231(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static29.method411(arg0)) {
			return;
		}
		@Pc(12) Class41[] local12 = Static450.aClass41ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class41 local19 = local12[local14];
			if (local19.anObjectArray8 != null) {
				@Pc(26) Class2_Sub14 local26 = new Class2_Sub14();
				local26.aClass41_5 = local19;
				local26.anObjectArray32 = local19.anObjectArray8;
				method4222(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(IZ)V")
	private static void method4232(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class41 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class41 local35;
		@Pc(13) int local13;
		@Pc(210) Class41 local210;
		@Pc(158) Class41 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt5241 -= 3;
				local13 = anIntArray353[anInt5241];
				local19 = anIntArray353[anInt5241 + 1];
				local25 = anIntArray353[anInt5241 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static160.method2564(local13);
				if (local35.aClass41Array1 == null) {
					local35.aClass41Array1 = new Class41[local25 + 1];
				}
				if (local35.aClass41Array1.length <= local25) {
					@Pc(54) Class41[] local54 = new Class41[local25 + 1];
					for (local56 = 0; local56 < local35.aClass41Array1.length; local56++) {
						local54[local56] = local35.aClass41Array1[local56];
					}
					local35.aClass41Array1 = local54;
				}
				if (local25 > 0 && local35.aClass41Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class41 local99 = new Class41();
				local99.anInt1642 = local19;
				local99.anInt1663 = local99.anInt1613 = local35.anInt1613;
				local99.anInt1683 = local25;
				local35.aClass41Array1[local25] = local99;
				if (arg1) {
					aClass41_9 = local99;
				} else {
					aClass41_10 = local99;
				}
				Static168.method2616(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass41_9 : aClass41_10;
				if (local137.anInt1683 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static160.method2564(local137.anInt1613);
				local158.aClass41Array1[local137.anInt1683] = null;
				Static168.method2616(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static160.method2564(anIntArray353[--anInt5241]);
				local137.aClass41Array1 = null;
				Static168.method2616(local137);
				return;
			}
			if (arg0 == 200) {
				anInt5241 -= 2;
				local13 = anIntArray353[anInt5241];
				local19 = anIntArray353[anInt5241 + 1];
				local210 = Static85.method2627(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray353[anInt5241++] = 1;
					if (arg1) {
						aClass41_9 = local210;
						return;
					}
					aClass41_10 = local210;
					return;
				}
				anIntArray353[anInt5241++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray353[--anInt5241];
				local158 = Static160.method2564(local13);
				if (local158 != null) {
					anIntArray353[anInt5241++] = 1;
					if (arg1) {
						aClass41_9 = local158;
						return;
					}
					aClass41_10 = local158;
					return;
				}
				anIntArray353[anInt5241++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray353[--anInt5241];
				method4221(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray353[--anInt5241];
				method4220(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt5241 -= 2;
					local13 = anIntArray353[anInt5241];
					local19 = anIntArray353[anInt5241 + 1];
					for (local25 = 0; local25 < Static339.anIntArray387.length; local25++) {
						if (Static339.anIntArray387[local25] == local13) {
							Static231.aClass4_Sub2_Sub2_Sub1_2.aClass7_1.method153(local19, Static10.aClass61_1, local25);
							return;
						}
					}
					for (local353 = 0; local353 < Static377.anIntArray442.length; local353++) {
						if (Static377.anIntArray442[local353] == local13) {
							Static231.aClass4_Sub2_Sub2_Sub1_2.aClass7_1.method153(local19, Static10.aClass61_1, local353);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt5241 -= 2;
					local13 = anIntArray353[anInt5241];
					local19 = anIntArray353[anInt5241 + 1];
					Static231.aClass4_Sub2_Sub2_Sub1_2.aClass7_1.method154(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray353[--anInt5241] != 0;
					Static231.aClass4_Sub2_Sub2_Sub1_2.aClass7_1.method157(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static160.method2564(anIntArray353[--anInt5241]);
					} else {
						local137 = arg1 ? aClass41_9 : aClass41_10;
					}
					if (arg0 == 1100) {
						anInt5241 -= 2;
						local137.anInt1665 = anIntArray353[anInt5241];
						if (local137.anInt1665 > local137.anInt1636 - local137.anInt1622) {
							local137.anInt1665 = local137.anInt1636 - local137.anInt1622;
						}
						if (local137.anInt1665 < 0) {
							local137.anInt1665 = 0;
						}
						local137.anInt1620 = anIntArray353[anInt5241 + 1];
						if (local137.anInt1620 > local137.anInt1635 - local137.anInt1599) {
							local137.anInt1620 = local137.anInt1635 - local137.anInt1599;
						}
						if (local137.anInt1620 < 0) {
							local137.anInt1620 = 0;
						}
						Static168.method2616(local137);
						if (local137.anInt1683 == -1) {
							Static195.method3042(local137.anInt1613);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt1617 = anIntArray353[--anInt5241];
						Static168.method2616(local137);
						if (local137.anInt1683 == -1) {
							Static60.method1207(local137.anInt1613);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean134 = anIntArray353[--anInt5241] == 1;
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt1598 = anIntArray353[--anInt5241];
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt1682 = anIntArray353[--anInt5241];
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray353[--anInt5241];
						if (local137.anInt1612 != local19) {
							local137.anInt1612 = local19;
							Static168.method2616(local137);
						}
						if (local137.anInt1683 == -1) {
							Static154.method2332(local137.anInt1613);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt1670 = anIntArray353[--anInt5241];
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean128 = anIntArray353[--anInt5241] == 1;
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt1662 = 1;
						local137.anInt1659 = anIntArray353[--anInt5241];
						Static168.method2616(local137);
						if (local137.anInt1683 == -1) {
							Static293.method4559(local137.anInt1613);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt5241 -= 6;
						local137.anInt1600 = anIntArray353[anInt5241];
						local137.anInt1668 = anIntArray353[anInt5241 + 1];
						local137.anInt1684 = anIntArray353[anInt5241 + 2];
						local137.anInt1681 = anIntArray353[anInt5241 + 3];
						local137.anInt1627 = anIntArray353[anInt5241 + 4];
						local137.anInt1615 = anIntArray353[anInt5241 + 5];
						Static168.method2616(local137);
						if (local137.anInt1683 == -1) {
							Static360.method5030(local137.anInt1613);
							Static260.method3929(local137.anInt1613);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray353[--anInt5241];
						if (local137.anInt1605 != local19) {
							local137.anInt1605 = local19;
							local137.anInt1680 = 0;
							local137.anInt1645 = 1;
							local137.anInt1640 = 0;
							Static168.method2616(local137);
						}
						if (local137.anInt1683 == -1) {
							Static56.method1109(local137.anInt1613);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean136 = anIntArray353[--anInt5241] == 1;
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray27[--anInt5243];
						if (!local1101.equals(local137.aString11)) {
							local137.aString11 = local1101;
							Static168.method2616(local137);
						}
						if (local137.anInt1683 == -1) {
							Static366.method5101(local137.anInt1613);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt1672 = anIntArray353[--anInt5241];
						Static168.method2616(local137);
						if (local137.anInt1683 == -1) {
							Static175.method2761(local137.anInt1613);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt5241 -= 3;
						local137.anInt1631 = anIntArray353[anInt5241];
						local137.anInt1604 = anIntArray353[anInt5241 + 1];
						local137.anInt1601 = anIntArray353[anInt5241 + 2];
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean140 = anIntArray353[--anInt5241] == 1;
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt1606 = anIntArray353[--anInt5241];
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt1648 = anIntArray353[--anInt5241];
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean131 = anIntArray353[--anInt5241] == 1;
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean141 = anIntArray353[--anInt5241] == 1;
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt5241 -= 2;
						local137.anInt1636 = anIntArray353[anInt5241];
						local137.anInt1635 = anIntArray353[anInt5241 + 1];
						Static168.method2616(local137);
						if (local137.anInt1642 == 0) {
							Static115.method5068(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt5241 -= 2;
						local137.anInt1657 = (short) anIntArray353[anInt5241];
						local137.anInt1611 = (short) anIntArray353[anInt5241 + 1];
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean133 = anIntArray353[--anInt5241] == 1;
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt1615 = anIntArray353[--anInt5241];
						Static168.method2616(local137);
						if (local137.anInt1683 == -1) {
							Static360.method5030(local137.anInt1613);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray353[--anInt5241];
						local137.aBoolean135 = local19 == 1;
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt5241 -= 2;
						local137.anInt1667 = anIntArray353[anInt5241];
						local137.anInt1609 = anIntArray353[anInt5241 + 1];
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt1673 = anIntArray353[--anInt5241];
						Static168.method2616(local137);
						return;
					}
					@Pc(1454) Class47 local1454;
					if (arg0 == 1127) {
						anInt5241 -= 2;
						local19 = anIntArray353[anInt5241];
						local25 = anIntArray353[anInt5241 + 1];
						local1454 = Static150.aClass43_1.method1210(local19);
						if (local25 != local1454.anInt1781) {
							local137.method1186(local19, local25);
							return;
						}
						local137.method1190(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray353[--anInt5241];
						local1488 = aStringArray27[--anInt5243];
						local1454 = Static150.aClass43_1.method1210(local19);
						if (!local1454.aString14.equals(local1488)) {
							local137.method1188(local19, local1488);
							return;
						}
						local137.method1190(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static160.method2564(anIntArray353[--anInt5241]);
						} else {
							local137 = arg1 ? aClass41_9 : aClass41_10;
						}
						if (arg0 == 1300) {
							local19 = anIntArray353[--anInt5241] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method1182(aStringArray27[--anInt5243], local19);
								return;
							}
							anInt5243--;
							return;
						}
						if (arg0 == 1301) {
							anInt5241 -= 2;
							local19 = anIntArray353[anInt5241];
							local25 = anIntArray353[anInt5241 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass41_3 = null;
								return;
							}
							local137.aClass41_3 = Static85.method2627(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray353[--anInt5241];
							if (local19 != Static34.anInt674 && local19 != Static51.anInt1384 && local19 != Static237.anInt4619) {
								return;
							}
							local137.anInt1666 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt1679 = anIntArray353[--anInt5241];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt1630 = anIntArray353[--anInt5241];
							return;
						}
						if (arg0 == 1305) {
							local137.aString13 = aStringArray27[--anInt5243];
							return;
						}
						if (arg0 == 1306) {
							local137.aString12 = aStringArray27[--anInt5243];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray6 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt1634 = anIntArray353[--anInt5241];
							local137.anInt1660 = anIntArray353[--anInt5241];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray353[--anInt5241];
							local25 = anIntArray353[--anInt5241];
							if (local25 >= 1 && local25 <= 10) {
								local137.method1191(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString9 = aStringArray27[--anInt5243];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt1661 = anIntArray353[--anInt5241];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt5241 -= 3;
								local19 = anIntArray353[anInt5241] - 1;
								local25 = anIntArray353[anInt5241 + 1];
								local353 = anIntArray353[anInt5241 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt5241 -= 2;
								local19 = 10;
								local25 = anIntArray353[anInt5241];
								local353 = anIntArray353[anInt5241 + 1];
							}
							if (local137.aByteArray40 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray40 = new byte[11];
								local137.aByteArray39 = new byte[11];
								local137.anIntArray75 = new int[11];
							}
							local137.aByteArray40[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean130 = false;
								for (local2290 = 0; local2290 < local137.aByteArray40.length; local2290++) {
									if (local137.aByteArray40[local2290] != 0) {
										local137.aBoolean130 = true;
										break;
									}
								}
							} else {
								local137.aBoolean130 = true;
							}
							local137.aByteArray39[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt1647 = anIntArray353[--anInt5241];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static160.method2564(anIntArray353[--anInt5241]);
						} else {
							local137 = arg1 ? aClass41_9 : aClass41_10;
						}
						local1101 = aStringArray27[--anInt5243];
						@Pc(2369) int[] local2369 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray353[--anInt5241];
							if (local353 > 0) {
								local2369 = new int[local353];
								while (local353-- > 0) {
									local2369[local353] = anIntArray353[--anInt5241];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
						for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2421[local2290] = aStringArray27[--anInt5243];
							} else {
								local2421[local2290] = Integer.valueOf(anIntArray353[--anInt5241]);
							}
						}
						local56 = anIntArray353[--anInt5241];
						if (local56 == -1) {
							local2421 = null;
						} else {
							local2421[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray27 = local2421;
						} else if (arg0 == 1401) {
							local137.anObjectArray18 = local2421;
						} else if (arg0 == 1402) {
							local137.anObjectArray20 = local2421;
						} else if (arg0 == 1403) {
							local137.anObjectArray29 = local2421;
						} else if (arg0 == 1404) {
							local137.anObjectArray9 = local2421;
						} else if (arg0 == 1405) {
							local137.anObjectArray14 = local2421;
						} else if (arg0 == 1406) {
							local137.anObjectArray23 = local2421;
						} else if (arg0 == 1407) {
							local137.anObjectArray2 = local2421;
							local137.anIntArray72 = local2369;
						} else if (arg0 == 1408) {
							local137.anObjectArray16 = local2421;
						} else if (arg0 == 1409) {
							local137.anObjectArray25 = local2421;
						} else if (arg0 == 1410) {
							local137.anObjectArray30 = local2421;
						} else if (arg0 == 1411) {
							local137.anObjectArray12 = local2421;
						} else if (arg0 == 1412) {
							local137.anObjectArray4 = local2421;
						} else if (arg0 == 1414) {
							local137.anObjectArray1 = local2421;
							local137.anIntArray80 = local2369;
						} else if (arg0 == 1415) {
							local137.anObjectArray28 = local2421;
							local137.anIntArray70 = local2369;
						} else if (arg0 == 1416) {
							local137.anObjectArray13 = local2421;
						} else if (arg0 == 1417) {
							local137.anObjectArray5 = local2421;
						} else if (arg0 == 1418) {
							local137.anObjectArray31 = local2421;
						} else if (arg0 == 1419) {
							local137.anObjectArray7 = local2421;
						} else if (arg0 == 1420) {
							local137.anObjectArray19 = local2421;
						} else if (arg0 == 1421) {
							local137.anObjectArray22 = local2421;
						} else if (arg0 == 1422) {
							local137.anObjectArray15 = local2421;
						} else if (arg0 == 1423) {
							local137.anObjectArray21 = local2421;
						} else if (arg0 == 1424) {
							local137.anObjectArray24 = local2421;
						} else if (arg0 == 1425) {
							local137.anObjectArray6 = local2421;
						} else if (arg0 == 1426) {
							local137.anObjectArray3 = local2421;
						} else if (arg0 == 1427) {
							local137.anObjectArray17 = local2421;
						} else if (arg0 == 1428) {
							local137.anObjectArray26 = local2421;
							local137.anIntArray71 = local2369;
						} else if (arg0 == 1429) {
							local137.anObjectArray11 = local2421;
							local137.anIntArray79 = local2369;
						} else if (arg0 == 1430) {
							local137.anObjectArray10 = local2421;
						}
						local137.aBoolean129 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass41_9 : aClass41_10;
						if (arg0 == 1500) {
							anIntArray353[anInt5241++] = local137.anInt1618;
							return;
						}
						if (arg0 == 1501) {
							anIntArray353[anInt5241++] = local137.anInt1675;
							return;
						}
						if (arg0 == 1502) {
							anIntArray353[anInt5241++] = local137.anInt1622;
							return;
						}
						if (arg0 == 1503) {
							anIntArray353[anInt5241++] = local137.anInt1599;
							return;
						}
						if (arg0 == 1504) {
							anIntArray353[anInt5241++] = local137.aBoolean139 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray353[anInt5241++] = local137.anInt1663;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static6.method150(local137);
							anIntArray353[anInt5241++] = local158 == null ? -1 : local158.anInt1613;
							return;
						}
					} else {
						@Pc(3017) Class47 local3017;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass41_9 : aClass41_10;
							if (arg0 == 1600) {
								anIntArray353[anInt5241++] = local137.anInt1665;
								return;
							}
							if (arg0 == 1601) {
								anIntArray353[anInt5241++] = local137.anInt1620;
								return;
							}
							if (arg0 == 1602) {
								aStringArray27[anInt5243++] = local137.aString11;
								return;
							}
							if (arg0 == 1603) {
								anIntArray353[anInt5241++] = local137.anInt1636;
								return;
							}
							if (arg0 == 1604) {
								anIntArray353[anInt5241++] = local137.anInt1635;
								return;
							}
							if (arg0 == 1605) {
								anIntArray353[anInt5241++] = local137.anInt1615;
								return;
							}
							if (arg0 == 1606) {
								anIntArray353[anInt5241++] = local137.anInt1684;
								return;
							}
							if (arg0 == 1607) {
								anIntArray353[anInt5241++] = local137.anInt1627;
								return;
							}
							if (arg0 == 1608) {
								anIntArray353[anInt5241++] = local137.anInt1681;
								return;
							}
							if (arg0 == 1609) {
								anIntArray353[anInt5241++] = local137.anInt1598;
								return;
							}
							if (arg0 == 1610) {
								anIntArray353[anInt5241++] = local137.anInt1600;
								return;
							}
							if (arg0 == 1611) {
								anIntArray353[anInt5241++] = local137.anInt1668;
								return;
							}
							if (arg0 == 1612) {
								anIntArray353[anInt5241++] = local137.anInt1612;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray353[--anInt5241];
								local3017 = Static150.aClass43_1.method1210(local19);
								if (local3017.method1271()) {
									aStringArray27[anInt5243++] = local137.method1187(local3017.aString14, local19);
								} else {
									anIntArray353[anInt5241++] = local137.method1185(local3017.anInt1781, local19);
								}
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass41_9 : aClass41_10;
							if (arg0 == 1700) {
								anIntArray353[anInt5241++] = local137.anInt1671;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt1671 != -1) {
									anIntArray353[anInt5241++] = local137.anInt1678;
									return;
								}
								anIntArray353[anInt5241++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray353[anInt5241++] = local137.anInt1683;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass41_9 : aClass41_10;
							if (arg0 == 1800) {
								anIntArray353[anInt5241++] = Static56.method1112(local137).method1590();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray353[--anInt5241];
								local19--;
								if (local137.aStringArray6 != null && local19 < local137.aStringArray6.length && local137.aStringArray6[local19] != null) {
									aStringArray27[anInt5243++] = local137.aStringArray6[local19];
									return;
								}
								aStringArray27[anInt5243++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString13 == null) {
									aStringArray27[anInt5243++] = "";
									return;
								}
								aStringArray27[anInt5243++] = local137.aString13;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static160.method2564(anIntArray353[--anInt5241]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass41_9 : aClass41_10;
							}
							if (anInt5245 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray17 == null) {
									return;
								}
								@Pc(3254) Class2_Sub14 local3254 = new Class2_Sub14();
								local3254.aClass41_5 = local137;
								local3254.anObjectArray32 = local137.anObjectArray17;
								local3254.anInt1857 = anInt5245 + 1;
								Static200.aClass265_55.method5999(local3254);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static160.method2564(anIntArray353[--anInt5241]);
							if (arg0 == 2500) {
								anIntArray353[anInt5241++] = local137.anInt1618;
								return;
							}
							if (arg0 == 2501) {
								anIntArray353[anInt5241++] = local137.anInt1675;
								return;
							}
							if (arg0 == 2502) {
								anIntArray353[anInt5241++] = local137.anInt1622;
								return;
							}
							if (arg0 == 2503) {
								anIntArray353[anInt5241++] = local137.anInt1599;
								return;
							}
							if (arg0 == 2504) {
								anIntArray353[anInt5241++] = local137.aBoolean139 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray353[anInt5241++] = local137.anInt1663;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static6.method150(local137);
								anIntArray353[anInt5241++] = local158 == null ? -1 : local158.anInt1613;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static160.method2564(anIntArray353[--anInt5241]);
							if (arg0 == 2600) {
								anIntArray353[anInt5241++] = local137.anInt1665;
								return;
							}
							if (arg0 == 2601) {
								anIntArray353[anInt5241++] = local137.anInt1620;
								return;
							}
							if (arg0 == 2602) {
								aStringArray27[anInt5243++] = local137.aString11;
								return;
							}
							if (arg0 == 2603) {
								anIntArray353[anInt5241++] = local137.anInt1636;
								return;
							}
							if (arg0 == 2604) {
								anIntArray353[anInt5241++] = local137.anInt1635;
								return;
							}
							if (arg0 == 2605) {
								anIntArray353[anInt5241++] = local137.anInt1615;
								return;
							}
							if (arg0 == 2606) {
								anIntArray353[anInt5241++] = local137.anInt1684;
								return;
							}
							if (arg0 == 2607) {
								anIntArray353[anInt5241++] = local137.anInt1627;
								return;
							}
							if (arg0 == 2608) {
								anIntArray353[anInt5241++] = local137.anInt1681;
								return;
							}
							if (arg0 == 2609) {
								anIntArray353[anInt5241++] = local137.anInt1598;
								return;
							}
							if (arg0 == 2610) {
								anIntArray353[anInt5241++] = local137.anInt1600;
								return;
							}
							if (arg0 == 2611) {
								anIntArray353[anInt5241++] = local137.anInt1668;
								return;
							}
							if (arg0 == 2612) {
								anIntArray353[anInt5241++] = local137.anInt1612;
								return;
							}
						} else {
							@Pc(3751) Class2_Sub25 local3751;
							@Pc(3649) Class2_Sub25 local3649;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static160.method2564(anIntArray353[--anInt5241]);
									anIntArray353[anInt5241++] = local137.anInt1671;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static160.method2564(anIntArray353[--anInt5241]);
									if (local137.anInt1671 != -1) {
										anIntArray353[anInt5241++] = local137.anInt1678;
										return;
									}
									anIntArray353[anInt5241++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray353[--anInt5241];
									local3649 = (Class2_Sub25) Static398.aClass240_27.method5439((long) local13);
									if (local3649 != null) {
										anIntArray353[anInt5241++] = 1;
										return;
									}
									anIntArray353[anInt5241++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static160.method2564(anIntArray353[--anInt5241]);
									if (local137.aClass41Array1 == null) {
										anIntArray353[anInt5241++] = 0;
										return;
									}
									local19 = local137.aClass41Array1.length;
									for (local25 = 0; local25 < local137.aClass41Array1.length; local25++) {
										if (local137.aClass41Array1[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray353[anInt5241++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt5241 -= 2;
									local13 = anIntArray353[anInt5241];
									local19 = anIntArray353[anInt5241 + 1];
									local3751 = (Class2_Sub25) Static398.aClass240_27.method5439((long) local13);
									if (local3751 != null && local3751.anInt4163 == local19) {
										anIntArray353[anInt5241++] = 1;
										return;
									}
									anIntArray353[anInt5241++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static160.method2564(anIntArray353[--anInt5241]);
								if (arg0 == 2800) {
									anIntArray353[anInt5241++] = Static56.method1112(local137).method1590();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray353[--anInt5241];
									local19--;
									if (local137.aStringArray6 != null && local19 < local137.aStringArray6.length && local137.aStringArray6[local19] != null) {
										aStringArray27[anInt5243++] = local137.aStringArray6[local19];
										return;
									}
									aStringArray27[anInt5243++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString13 == null) {
										aStringArray27[anInt5243++] = "";
										return;
									}
									aStringArray27[anInt5243++] = local137.aString13;
									return;
								}
							} else {
								@Pc(3888) String local3888;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3888 = aStringArray27[--anInt5243];
										Static165.method4929(local3888);
										return;
									}
									if (arg0 == 3101) {
										anInt5241 -= 2;
										Static88.method1487(Static231.aClass4_Sub2_Sub2_Sub1_2, anIntArray353[anInt5241], anIntArray353[anInt5241 + 1]);
										return;
									}
									if (arg0 == 3103) {
										Static76.method1354();
										return;
									}
									if (arg0 == 3104) {
										local3888 = aStringArray27[--anInt5243];
										local19 = 0;
										if (Static413.method5615(local3888)) {
											local19 = Static175.method2762(local3888);
										}
										Static448.method6059(Static259.aClass44_62);
										Static98.aClass2_Sub20_Sub1_1.method3713(local19);
										return;
									}
									if (arg0 == 3105) {
										local3888 = aStringArray27[--anInt5243];
										Static448.method6059(Static416.aClass44_89);
										Static98.aClass2_Sub20_Sub1_1.method3699(local3888.length() + 1);
										Static98.aClass2_Sub20_Sub1_1.method3715(local3888);
										return;
									}
									if (arg0 == 3106) {
										local3888 = aStringArray27[--anInt5243];
										Static448.method6059(Static449.aClass44_36);
										Static98.aClass2_Sub20_Sub1_1.method3699(local3888.length() + 1);
										Static98.aClass2_Sub20_Sub1_1.method3715(local3888);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray353[--anInt5241];
										local1101 = aStringArray27[--anInt5243];
										Static221.method3415(local1101, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt5241 -= 3;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										local25 = anIntArray353[anInt5241 + 2];
										local35 = Static160.method2564(local25);
										Static38.method721(local19, local13, local35);
										return;
									}
									if (arg0 == 3109) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										local210 = arg1 ? aClass41_9 : aClass41_10;
										Static38.method721(local19, local13, local210);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray353[--anInt5241];
										Static448.method6059(Static173.aClass44_47);
										Static98.aClass2_Sub20_Sub1_1.method3745(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										local3751 = (Class2_Sub25) Static398.aClass240_27.method5439((long) local13);
										if (local3751 != null) {
											Static419.method5701(local3751, true, local3751.anInt4163 != local19);
										}
										Static71.method1294(true, 3, local19, local13);
										return;
									}
									if (arg0 == 3112) {
										anInt5241--;
										local13 = anIntArray353[anInt5241];
										local3649 = (Class2_Sub25) Static398.aClass240_27.method5439((long) local13);
										if (local3649 != null && local3649.anInt4162 == 3) {
											Static419.method5701(local3649, true, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static122.method1779(aStringArray27[--anInt5243]);
										return;
									}
									if (arg0 == 3114) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										local1488 = aStringArray27[--anInt5243];
										Static187.method5442("", local13, "", local1488, local19);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt5241 -= 3;
										Static404.method5495(255, anIntArray353[anInt5241 + 1], anIntArray353[anInt5241 + 2], anIntArray353[anInt5241]);
										return;
									}
									if (arg0 == 3201) {
										Static242.method3662(50, 255, anIntArray353[--anInt5241]);
										return;
									}
									if (arg0 == 3202) {
										anInt5241 -= 2;
										Static340.method4788(anIntArray353[anInt5241 + 1], 255, anIntArray353[anInt5241]);
										return;
									}
									if (arg0 == 3203) {
										anInt5241 -= 4;
										Static404.method5495(anIntArray353[anInt5241 + 3], anIntArray353[anInt5241 + 1], anIntArray353[anInt5241 + 2], anIntArray353[anInt5241]);
										return;
									}
									if (arg0 == 3204) {
										anInt5241 -= 3;
										Static242.method3662(anIntArray353[anInt5241 + 2], anIntArray353[anInt5241 + 1], anIntArray353[anInt5241]);
										return;
									}
									if (arg0 == 3205) {
										anInt5241 -= 3;
										Static340.method4788(anIntArray353[anInt5241 + 1], anIntArray353[anInt5241 + 2], anIntArray353[anInt5241]);
										return;
									}
									if (arg0 == 3206) {
										anInt5241 -= 4;
										Static148.method2187(anIntArray353[anInt5241 + 3], anIntArray353[anInt5241 + 2], anIntArray353[anInt5241], anIntArray353[anInt5241 + 1]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray353[anInt5241++] = Static164.anInt3206;
										return;
									}
									if (arg0 == 3301) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = Static29.method412(local19, local13, false);
										return;
									}
									if (arg0 == 3302) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = Static377.method5264(false, local13, local19);
										return;
									}
									if (arg0 == 3303) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = Static396.method5435(local13, local19, false);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static93.aClass130_1.method3041(local13).anInt6383;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static287.anIntArray348[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static253.anIntArray324[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static172.anIntArray221[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4605) byte local4605 = Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92;
										local19 = (Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117 >> 7) + Static173.anInt3340;
										local25 = (Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111 >> 7) + Static379.anInt6721;
										anIntArray353[anInt5241++] = (local4605 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray353[anInt5241++] = Static67.aBoolean153 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = Static29.method412(local19, local13, true);
										return;
									}
									if (arg0 == 3314) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = Static377.method5264(true, local13, local19);
										return;
									}
									if (arg0 == 3315) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = Static396.method5435(local13, local19, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static255.anInt4802 >= 2) {
											anIntArray353[anInt5241++] = Static255.anInt4802;
											return;
										}
										anIntArray353[anInt5241++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray353[anInt5241++] = Static182.anInt7663;
										return;
									}
									if (arg0 == 3318) {
										anIntArray353[anInt5241++] = Static62.anInt1710;
										return;
									}
									if (arg0 == 3321) {
										anIntArray353[anInt5241++] = Static405.anInt7041;
										return;
									}
									if (arg0 == 3322) {
										anIntArray353[anInt5241++] = Static371.anInt6656;
										return;
									}
									if (arg0 == 3323) {
										if (Static381.anInt6752 >= 5 && Static381.anInt6752 <= 9) {
											anIntArray353[anInt5241++] = 1;
											return;
										}
										anIntArray353[anInt5241++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static381.anInt6752 >= 5 && Static381.anInt6752 <= 9) {
											anIntArray353[anInt5241++] = Static381.anInt6752;
											return;
										}
										anIntArray353[anInt5241++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray353[anInt5241++] = Static168.aBoolean279 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray353[anInt5241++] = Static231.aClass4_Sub2_Sub2_Sub1_2.anInt5730;
										return;
									}
									if (arg0 == 3327) {
										anIntArray353[anInt5241++] = Static231.aClass4_Sub2_Sub2_Sub1_2.aClass7_1.aBoolean24 ? 1 : 0;
										return;
									}
									if (arg0 == 3328) {
										anIntArray353[anInt5241++] = Static217.aBoolean41 && !Static296.aBoolean462 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray353[anInt5241++] = Static407.aBoolean597 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static382.method5310(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = Static142.method2023(local19, false, local13);
										return;
									}
									if (arg0 == 3332) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = Static142.method2023(local19, true, local13);
										return;
									}
									if (arg0 == 3333) {
										anIntArray353[anInt5241++] = Static110.anInt2286;
										return;
									}
									if (arg0 == 3335) {
										anIntArray353[anInt5241++] = Static272.anInt7537;
										return;
									}
									if (arg0 == 3336) {
										anInt5241 -= 4;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										local25 = anIntArray353[anInt5241 + 2];
										local353 = anIntArray353[anInt5241 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray353[anInt5241++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray353[anInt5241++] = Static160.anInt3171;
										return;
									}
									if (arg0 == 3338) {
										anIntArray353[anInt5241++] = Static49.method987();
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5230) Class204 local5230;
									if (arg0 == 3400) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										local5230 = Static293.aClass24_6.method442(local13);
										aStringArray27[anInt5243++] = local5230.method4683(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt5241 -= 4;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										local25 = anIntArray353[anInt5241 + 2];
										local353 = anIntArray353[anInt5241 + 3];
										@Pc(5276) Class204 local5276 = Static293.aClass24_6.method442(local25);
										if (local5276.aChar3 == local13 && local5276.aChar4 == local19) {
											if (local19 == 115) {
												aStringArray27[anInt5243++] = local5276.method4683(local353);
												return;
											}
											anIntArray353[anInt5241++] = local5276.method4680(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt5241 -= 3;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										local25 = anIntArray353[anInt5241 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5352) Class204 local5352 = Static293.aClass24_6.method442(local19);
										if (local5352.aChar4 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray353[anInt5241++] = local5352.method4686(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray353[--anInt5241];
										local1101 = aStringArray27[--anInt5243];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5230 = Static293.aClass24_6.method442(local13);
										if (local5230.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray353[anInt5241++] = local5230.method4682(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray353[--anInt5241];
										@Pc(5450) Class204 local5450 = Static293.aClass24_6.method442(local13);
										anIntArray353[anInt5241++] = local5450.aClass240_24.method5431();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static29.anInt626 == 0) {
											anIntArray353[anInt5241++] = -2;
											return;
										}
										if (Static29.anInt626 == 1) {
											anIntArray353[anInt5241++] = -1;
											return;
										}
										anIntArray353[anInt5241++] = Static304.anInt5397;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray353[--anInt5241];
										if (Static29.anInt626 == 2 && local13 < Static304.anInt5397) {
											aStringArray27[anInt5243++] = Static371.aStringArray36[local13];
											if (Static351.aStringArray32[local13] != null) {
												aStringArray27[anInt5243++] = Static351.aStringArray32[local13];
												return;
											}
											aStringArray27[anInt5243++] = "";
											return;
										}
										aStringArray27[anInt5243++] = "";
										aStringArray27[anInt5243++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray353[--anInt5241];
										if (Static29.anInt626 == 2 && local13 < Static304.anInt5397) {
											anIntArray353[anInt5241++] = Static350.anIntArray415[local13];
											return;
										}
										anIntArray353[anInt5241++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray353[--anInt5241];
										if (Static29.anInt626 == 2 && local13 < Static304.anInt5397) {
											anIntArray353[anInt5241++] = Static49.anIntArray62[local13];
											return;
										}
										anIntArray353[anInt5241++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3888 = aStringArray27[--anInt5243];
										local19 = anIntArray353[--anInt5241];
										Static296.method4314(local19, local3888);
										return;
									}
									if (arg0 == 3605) {
										local3888 = aStringArray27[--anInt5243];
										Static432.method5830(local3888);
										return;
									}
									if (arg0 == 3606) {
										local3888 = aStringArray27[--anInt5243];
										Static395.method5426(local3888);
										return;
									}
									if (arg0 == 3607) {
										local3888 = aStringArray27[--anInt5243];
										Static39.method723(local3888, false);
										return;
									}
									if (arg0 == 3608) {
										local3888 = aStringArray27[--anInt5243];
										Static271.method4041(local3888);
										return;
									}
									if (arg0 == 3609) {
										local3888 = aStringArray27[--anInt5243];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray353[anInt5241++] = Static159.method2516(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray353[--anInt5241];
										if (Static29.anInt626 == 2 && local13 < Static304.anInt5397) {
											aStringArray27[anInt5243++] = Static190.aStringArray16[local13];
											return;
										}
										aStringArray27[anInt5243++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static89.aString17 != null) {
											aStringArray27[anInt5243++] = Static356.method4993(Static89.aString17);
											return;
										}
										aStringArray27[anInt5243++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static89.aString17 != null) {
											anIntArray353[anInt5241++] = Static82.anInt1991;
											return;
										}
										anIntArray353[anInt5241++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray353[--anInt5241];
										if (Static89.aString17 != null && local13 < Static82.anInt1991) {
											aStringArray27[anInt5243++] = Static125.aClass255Array1[local13].aString64;
											return;
										}
										aStringArray27[anInt5243++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray353[--anInt5241];
										if (Static89.aString17 != null && local13 < Static82.anInt1991) {
											anIntArray353[anInt5241++] = Static125.aClass255Array1[local13].anInt7373;
											return;
										}
										anIntArray353[anInt5241++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray353[--anInt5241];
										if (Static89.aString17 != null && local13 < Static82.anInt1991) {
											anIntArray353[anInt5241++] = Static125.aClass255Array1[local13].aByte100;
											return;
										}
										anIntArray353[anInt5241++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray353[anInt5241++] = Static182.aByte104;
										return;
									}
									if (arg0 == 3617) {
										local3888 = aStringArray27[--anInt5243];
										Static369.method5167(local3888);
										return;
									}
									if (arg0 == 3618) {
										anIntArray353[anInt5241++] = Static122.aByte19;
										return;
									}
									if (arg0 == 3619) {
										local3888 = aStringArray27[--anInt5243];
										Static238.method3615(local3888);
										return;
									}
									if (arg0 == 3620) {
										Static42.method814();
										return;
									}
									if (arg0 == 3621) {
										if (Static29.anInt626 == 0) {
											anIntArray353[anInt5241++] = -1;
											return;
										}
										anIntArray353[anInt5241++] = Static220.anInt4206;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray353[--anInt5241];
										if (Static29.anInt626 != 0 && local13 < Static220.anInt4206) {
											aStringArray27[anInt5243++] = Static74.aStringArray8[local13];
											if (Static203.aStringArray17[local13] != null) {
												aStringArray27[anInt5243++] = Static203.aStringArray17[local13];
												return;
											}
											aStringArray27[anInt5243++] = "";
											return;
										}
										aStringArray27[anInt5243++] = "";
										aStringArray27[anInt5243++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3888 = aStringArray27[--anInt5243];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray353[anInt5241++] = Static170.method2636(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray353[--anInt5241];
										if (Static125.aClass255Array1 != null && local13 < Static82.anInt1991 && Static125.aClass255Array1[local13].aString63.equalsIgnoreCase(Static231.aClass4_Sub2_Sub2_Sub1_2.aString48)) {
											anIntArray353[anInt5241++] = 1;
											return;
										}
										anIntArray353[anInt5241++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static209.aString34 != null) {
											aStringArray27[anInt5243++] = Static209.aString34;
											return;
										}
										aStringArray27[anInt5243++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray353[--anInt5241];
										if (Static89.aString17 != null && local13 < Static82.anInt1991) {
											aStringArray27[anInt5243++] = Static125.aClass255Array1[local13].aString66;
											return;
										}
										aStringArray27[anInt5243++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray353[--anInt5241];
										if (Static29.anInt626 == 2 && local13 >= 0 && local13 < Static304.anInt5397) {
											anIntArray353[anInt5241++] = Static297.aBooleanArray40[local13] ? 1 : 0;
											return;
										}
										anIntArray353[anInt5241++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3888 = aStringArray27[--anInt5243];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray353[anInt5241++] = Static258.method3477(local3888);
										return;
									}
									if (arg0 == 3629) {
										anIntArray353[anInt5241++] = Static438.anInt7647;
										return;
									}
									if (arg0 == 3630) {
										local3888 = aStringArray27[--anInt5243];
										Static39.method723(local3888, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static100.aBooleanArray53[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray353[--anInt5241];
										if (Static89.aString17 != null && local13 < Static82.anInt1991) {
											aStringArray27[anInt5243++] = Static125.aClass255Array1[local13].aString63;
											return;
										}
										aStringArray27[anInt5243++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray353[--anInt5241];
										if (Static29.anInt626 != 0 && local13 < Static220.anInt4206) {
											aStringArray27[anInt5243++] = Static432.aStringArray43[local13];
											return;
										}
										aStringArray27[anInt5243++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static118.aClass251Array1[local13].method5636();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static118.aClass251Array1[local13].anInt7242;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static118.aClass251Array1[local13].anInt7245;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static118.aClass251Array1[local13].anInt7251;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static118.aClass251Array1[local13].anInt7243;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static118.aClass251Array1[local13].anInt7241;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray353[--anInt5241];
										local19 = Static118.aClass251Array1[local13].method5640();
										anIntArray353[anInt5241++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray353[--anInt5241];
										local19 = Static118.aClass251Array1[local13].method5640();
										anIntArray353[anInt5241++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray353[--anInt5241];
										local19 = Static118.aClass251Array1[local13].method5640();
										anIntArray353[anInt5241++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray353[--anInt5241];
										local19 = Static118.aClass251Array1[local13].method5640();
										anIntArray353[anInt5241++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt5241 -= 5;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										local25 = anIntArray353[anInt5241 + 2];
										local353 = anIntArray353[anInt5241 + 3];
										local2290 = anIntArray353[anInt5241 + 4];
										anIntArray353[anInt5241++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(6960) long local6960;
									@Pc(6953) long local6953;
									if (arg0 == 4007) {
										anInt5241 -= 2;
										local6953 = anIntArray353[anInt5241];
										local6960 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = (int) (local6953 + local6953 * local6960 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										if (local13 == 0) {
											anIntArray353[anInt5241++] = 0;
											return;
										}
										anIntArray353[anInt5241++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										if (local13 == 0) {
											anIntArray353[anInt5241++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray353[anInt5241++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray353[anInt5241++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt5241 -= 3;
										local6953 = anIntArray353[anInt5241];
										local6960 = anIntArray353[anInt5241 + 1];
										@Pc(7341) long local7341 = (long) anIntArray353[anInt5241 + 2];
										anIntArray353[anInt5241++] = (int) (local6953 * local7341 / local6960);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3888 = aStringArray27[--anInt5243];
										local19 = anIntArray353[--anInt5241];
										aStringArray27[anInt5243++] = local3888 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt5243 -= 2;
										local3888 = aStringArray27[anInt5243];
										local1101 = aStringArray27[anInt5243 + 1];
										aStringArray27[anInt5243++] = local3888 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3888 = aStringArray27[--anInt5243];
										local19 = anIntArray353[--anInt5241];
										aStringArray27[anInt5243++] = local3888 + Static444.method6000(local19);
										return;
									}
									if (arg0 == 4103) {
										local3888 = aStringArray27[--anInt5243];
										aStringArray27[anInt5243++] = local3888.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray27[anInt5243++] = method4225(anIntArray353[--anInt5241]);
										return;
									}
									if (arg0 == 4105) {
										anInt5243 -= 2;
										local3888 = aStringArray27[anInt5243];
										local1101 = aStringArray27[anInt5243 + 1];
										if (Static231.aClass4_Sub2_Sub2_Sub1_2.aClass7_1 != null && Static231.aClass4_Sub2_Sub2_Sub1_2.aClass7_1.aBoolean24) {
											aStringArray27[anInt5243++] = local1101;
											return;
										}
										aStringArray27[anInt5243++] = local3888;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray353[--anInt5241];
										aStringArray27[anInt5243++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt5243 -= 2;
										anIntArray353[anInt5241++] = Static346.method4859(Static272.anInt7537, aStringArray27[anInt5243], aStringArray27[anInt5243 + 1]);
										return;
									}
									@Pc(7624) Class210 local7624;
									if (arg0 == 4108) {
										local3888 = aStringArray27[--anInt5243];
										anInt5241 -= 2;
										local19 = anIntArray353[anInt5241];
										local25 = anIntArray353[anInt5241 + 1];
										local7624 = Static316.method4524(local25, Static48.aClass188_23);
										anIntArray353[anInt5241++] = local7624.method4746(local19, local3888, Static119.aClass76Array11);
										return;
									}
									if (arg0 == 4109) {
										local3888 = aStringArray27[--anInt5243];
										anInt5241 -= 2;
										local19 = anIntArray353[anInt5241];
										local25 = anIntArray353[anInt5241 + 1];
										local7624 = Static316.method4524(local25, Static48.aClass188_23);
										anIntArray353[anInt5241++] = local7624.method4754(local19, Static119.aClass76Array11, local3888);
										return;
									}
									if (arg0 == 4110) {
										anInt5243 -= 2;
										local3888 = aStringArray27[anInt5243];
										local1101 = aStringArray27[anInt5243 + 1];
										if (anIntArray353[--anInt5241] == 1) {
											aStringArray27[anInt5243++] = local3888;
											return;
										}
										aStringArray27[anInt5243++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3888 = aStringArray27[--anInt5243];
										aStringArray27[anInt5243++] = Static273.method4070(local3888);
										return;
									}
									if (arg0 == 4112) {
										local3888 = aStringArray27[--anInt5243];
										local19 = anIntArray353[--anInt5241];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray27[anInt5243++] = local3888 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static135.method1967((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static40.method737((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static419.method5698((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static318.method4553((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3888 = aStringArray27[--anInt5243];
										if (local3888 != null) {
											anIntArray353[anInt5241++] = local3888.length();
											return;
										}
										anIntArray353[anInt5241++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3888 = aStringArray27[--anInt5243];
										anInt5241 -= 2;
										local19 = anIntArray353[anInt5241];
										local25 = anIntArray353[anInt5241 + 1];
										aStringArray27[anInt5243++] = local3888.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3888 = aStringArray27[--anInt5243];
										@Pc(7987) StringBuffer local7987 = new StringBuffer(local3888.length());
										@Pc(7989) boolean local7989 = false;
										for (local353 = 0; local353 < local3888.length(); local353++) {
											@Pc(7996) char local7996 = local3888.charAt(local353);
											if (local7996 == '<') {
												local7989 = true;
											} else if (local7996 == '>') {
												local7989 = false;
											} else if (!local7989) {
												local7987.append(local7996);
											}
										}
										aStringArray27[anInt5243++] = local7987.toString();
										return;
									}
									if (arg0 == 4120) {
										local3888 = aStringArray27[--anInt5243];
										anInt5241 -= 2;
										local19 = anIntArray353[anInt5241];
										local25 = anIntArray353[anInt5241 + 1];
										anIntArray353[anInt5241++] = local3888.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt5243 -= 2;
										local3888 = aStringArray27[anInt5243];
										local1101 = aStringArray27[anInt5243 + 1];
										local25 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = local3888.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray353[--anInt5241] != 0;
										local19 = anIntArray353[--anInt5241];
										aStringArray27[anInt5243++] = Static201.method3139(0, Static272.anInt7537, (long) local19, local412);
										return;
									}
									if (arg0 == 4125) {
										local3888 = aStringArray27[--anInt5243];
										local19 = anIntArray353[--anInt5241];
										@Pc(8210) Class210 local8210 = Static316.method4524(local19, Static48.aClass188_23);
										anIntArray353[anInt5241++] = local8210.method4759(local3888, Static119.aClass76Array11);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray353[--anInt5241];
										aStringArray27[anInt5243++] = Static350.aClass149_2.method3483(local13).aString5;
										return;
									}
									@Pc(8272) Class30 local8272;
									if (arg0 == 4201) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										local8272 = Static350.aClass149_2.method3483(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray2[local19 - 1] != null) {
											aStringArray27[anInt5243++] = local8272.aStringArray2[local19 - 1];
											return;
										}
										aStringArray27[anInt5243++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										local8272 = Static350.aClass149_2.method3483(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray3[local19 - 1] != null) {
											aStringArray27[anInt5243++] = local8272.aStringArray3[local19 - 1];
											return;
										}
										aStringArray27[anInt5243++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static350.aClass149_2.method3483(local13).anInt1064;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static350.aClass149_2.method3483(local13).anInt1053 == 1 ? 1 : 0;
										return;
									}
									@Pc(8435) Class30 local8435;
									if (arg0 == 4205) {
										local13 = anIntArray353[--anInt5241];
										local8435 = Static350.aClass149_2.method3483(local13);
										if (local8435.anInt1001 == -1 && local8435.anInt1050 >= 0) {
											anIntArray353[anInt5241++] = local8435.anInt1050;
											return;
										}
										anIntArray353[anInt5241++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray353[--anInt5241];
										local8435 = Static350.aClass149_2.method3483(local13);
										if (local8435.anInt1001 >= 0 && local8435.anInt1050 >= 0) {
											anIntArray353[anInt5241++] = local8435.anInt1050;
											return;
										}
										anIntArray353[anInt5241++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray353[--anInt5241];
										anIntArray353[anInt5241++] = Static350.aClass149_2.method3483(local13).aBoolean91 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										local3017 = Static150.aClass43_1.method1210(local19);
										if (local3017.method1271()) {
											aStringArray27[anInt5243++] = Static350.aClass149_2.method3483(local13).method729(local3017.aString14, local19);
											return;
										}
										anIntArray353[anInt5241++] = Static350.aClass149_2.method3483(local13).method736(local19, local3017.anInt1781);
										return;
									}
									if (arg0 == 4209) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1] - 1;
										local8272 = Static350.aClass149_2.method3483(local13);
										if (local8272.anInt1055 == local19) {
											anIntArray353[anInt5241++] = local8272.anInt1009;
											return;
										}
										if (local8272.anInt1062 == local19) {
											anIntArray353[anInt5241++] = local8272.anInt1054;
											return;
										}
										anIntArray353[anInt5241++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3888 = aStringArray27[--anInt5243];
										local19 = anIntArray353[--anInt5241];
										Static75.method1339(local3888, local19 == 1);
										anIntArray353[anInt5241++] = Static26.anInt564;
										return;
									}
									if (arg0 == 4211) {
										if (Static435.aShortArray105 != null && Static24.anInt521 < Static26.anInt564) {
											anIntArray353[anInt5241++] = Static435.aShortArray105[Static24.anInt521++] & 0xFFFF;
											return;
										}
										anIntArray353[anInt5241++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static24.anInt521 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										local3017 = Static150.aClass43_1.method1210(local19);
										if (local3017.method1271()) {
											aStringArray27[anInt5243++] = Static417.aClass234_2.method5362(local13).method4798(local19, local3017.aString14);
											return;
										}
										anIntArray353[anInt5241++] = Static417.aClass234_2.method5362(local13).method4804(local3017.anInt1781, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										local3017 = Static150.aClass43_1.method1210(local19);
										if (local3017.method1271()) {
											aStringArray27[anInt5243++] = Static406.aClass150_3.method3508(local13).method5577(local19, local3017.aString14);
											return;
										}
										anIntArray353[anInt5241++] = Static406.aClass150_3.method3508(local13).method5590(local19, local3017.anInt1781);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt5241 -= 2;
										local13 = anIntArray353[anInt5241];
										local19 = anIntArray353[anInt5241 + 1];
										local3017 = Static150.aClass43_1.method1210(local19);
										if (local3017.method1271()) {
											aStringArray27[anInt5243++] = Static56.aClass252_1.method5641(local13).method938(local3017.aString14, local19);
											return;
										}
										anIntArray353[anInt5241++] = Static56.aClass252_1.method5641(local13).method939(local19, local3017.anInt1781);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray353[--anInt5241];
									@Pc(8936) Class12 local8936 = Static4.aClass136_1.method3178(local13);
									if (local8936.anIntArray19 != null && local8936.anIntArray19.length > 0) {
										local25 = 0;
										local353 = local8936.anIntArray18[0];
										for (local2290 = 1; local2290 < local8936.anIntArray19.length; local2290++) {
											if (local8936.anIntArray18[local2290] > local353) {
												local25 = local2290;
												local353 = local8936.anIntArray18[local2290];
											}
										}
										anIntArray353[anInt5241++] = local8936.anIntArray19[local25];
										return;
									}
									anIntArray353[anInt5241++] = local8936.anInt358;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static160.method2564(anIntArray353[--anInt5241]);
					} else {
						local137 = arg1 ? aClass41_9 : aClass41_10;
					}
					Static168.method2616(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt5241 -= 2;
						local19 = anIntArray353[anInt5241];
						local25 = anIntArray353[anInt5241 + 1];
						if (local137.anInt1683 == -1) {
							Static415.method5635(local137.anInt1613);
							Static360.method5030(local137.anInt1613);
							Static260.method3929(local137.anInt1613);
						}
						if (local19 == -1) {
							local137.anInt1662 = 1;
							local137.anInt1659 = -1;
							local137.anInt1671 = -1;
							return;
						}
						local137.anInt1671 = local19;
						local137.anInt1678 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.lb = true;
						} else {
							local137.lb = false;
						}
						@Pc(1630) Class30 local1630 = Static350.aClass149_2.method3483(local19);
						local137.anInt1684 = local1630.anInt1052;
						local137.anInt1681 = local1630.anInt1024;
						local137.anInt1627 = local1630.anInt1044;
						local137.anInt1600 = local1630.anInt1060;
						local137.anInt1668 = local1630.anInt1014;
						local137.anInt1615 = local1630.anInt1032;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt1651 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt1651 = 1;
						} else {
							local137.anInt1651 = 2;
						}
						if (local137.anInt1649 > 0) {
							local137.anInt1615 = local137.anInt1615 * 32 / local137.anInt1649;
							return;
						}
						if (local137.anInt1674 > 0) {
							local137.anInt1615 = local137.anInt1615 * 32 / local137.anInt1674;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt1662 = 2;
						local137.anInt1659 = anIntArray353[--anInt5241];
						if (local137.anInt1683 == -1) {
							Static293.method4559(local137.anInt1613);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt1662 = 3;
						local137.anInt1659 = -1;
						if (local137.anInt1683 == -1) {
							Static293.method4559(local137.anInt1613);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt1662 = 6;
						local137.anInt1659 = anIntArray353[--anInt5241];
						if (local137.anInt1683 == -1) {
							Static293.method4559(local137.anInt1613);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt1662 = 5;
						local137.anInt1659 = anIntArray353[--anInt5241];
						if (local137.anInt1683 == -1) {
							Static293.method4559(local137.anInt1613);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt5241 -= 4;
						local137.anInt1664 = anIntArray353[anInt5241];
						local137.anInt1629 = anIntArray353[anInt5241 + 1];
						local137.anInt1621 = anIntArray353[anInt5241 + 2];
						local137.anInt1619 = anIntArray353[anInt5241 + 3];
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt5241 -= 2;
						local137.anInt1628 = anIntArray353[anInt5241];
						local137.anInt1650 = anIntArray353[anInt5241 + 1];
						Static168.method2616(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt5241 -= 4;
						local137.anInt1659 = anIntArray353[anInt5241];
						local137.anInt1608 = anIntArray353[anInt5241 + 1];
						if (anIntArray353[anInt5241 + 2] == 1) {
							local137.anInt1662 = 9;
						} else {
							local137.anInt1662 = 8;
						}
						if (anIntArray353[anInt5241 + 3] == 1) {
							local137.lb = true;
						} else {
							local137.lb = false;
						}
						if (local137.anInt1683 == -1) {
							Static293.method4559(local137.anInt1613);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt1662 = 5;
						local137.anInt1659 = Static393.anInt6881;
						local137.anInt1608 = 0;
						if (local137.anInt1683 == -1) {
							Static293.method4559(local137.anInt1613);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static160.method2564(anIntArray353[--anInt5241]);
				} else {
					local137 = arg1 ? aClass41_9 : aClass41_10;
				}
				if (arg0 == 1000) {
					anInt5241 -= 4;
					local137.anInt1633 = anIntArray353[anInt5241];
					local137.anInt1638 = anIntArray353[anInt5241 + 1];
					local19 = anIntArray353[anInt5241 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray353[anInt5241 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte11 = (byte) local19;
					local137.aByte10 = (byte) local25;
					Static168.method2616(local137);
					Static186.method2958(local137);
					if (local137.anInt1683 == -1) {
						Static426.method5764(local137.anInt1613);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt5241 -= 4;
					local137.anInt1674 = anIntArray353[anInt5241];
					local137.anInt1614 = anIntArray353[anInt5241 + 1];
					local137.anInt1649 = 0;
					local137.anInt1686 = 0;
					local19 = anIntArray353[anInt5241 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray353[anInt5241 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte9 = (byte) local19;
					local137.aByte12 = (byte) local25;
					Static168.method2616(local137);
					Static186.method2958(local137);
					if (local137.anInt1642 == 0) {
						Static115.method5068(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray353[--anInt5241] == 1;
					if (local137.aBoolean139 != local620) {
						local137.aBoolean139 = local620;
						Static168.method2616(local137);
					}
					if (local137.anInt1683 == -1) {
						Static8.method184(local137.anInt1613);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt5241 -= 2;
					local137.anInt1623 = anIntArray353[anInt5241];
					local137.anInt1637 = anIntArray353[anInt5241 + 1];
					Static168.method2616(local137);
					Static186.method2958(local137);
					if (local137.anInt1642 == 0) {
						Static115.method5068(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean138 = anIntArray353[--anInt5241] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(IZ)V")
	private static void method4233(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray353[anInt5241++] = Static385.anInt6819;
				return;
			}
			if (arg0 == 5001) {
				anInt5241 -= 3;
				Static385.anInt6819 = anIntArray353[anInt5241];
				Static119.aClass90_9 = Static304.method4377(anIntArray353[anInt5241 + 1]);
				if (Static119.aClass90_9 == null) {
					Static119.aClass90_9 = Static129.aClass90_31;
				}
				Static444.anInt7747 = anIntArray353[anInt5241 + 2];
				Static448.method6059(Static253.aClass44_61);
				Static98.aClass2_Sub20_Sub1_1.method3699(Static385.anInt6819);
				Static98.aClass2_Sub20_Sub1_1.method3699(Static119.aClass90_9.anInt2417);
				Static98.aClass2_Sub20_Sub1_1.method3699(Static444.anInt7747);
				return;
			}
			if (arg0 == 5002) {
				anInt5243 -= 2;
				local75 = aStringArray27[anInt5243];
				local81 = aStringArray27[anInt5243 + 1];
				anInt5241 -= 2;
				local89 = anIntArray353[anInt5241];
				local95 = anIntArray353[anInt5241 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static448.method6059(Static437.aClass44_96);
				Static98.aClass2_Sub20_Sub1_1.method3699(Static209.method3225(local75) + Static209.method3225(local81) + 2);
				Static98.aClass2_Sub20_Sub1_1.method3715(local75);
				Static98.aClass2_Sub20_Sub1_1.method3699(local89 - 1);
				Static98.aClass2_Sub20_Sub1_1.method3699(local95);
				Static98.aClass2_Sub20_Sub1_1.method3715(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray353[--anInt5241];
				local81 = null;
				if (local157 < 100) {
					local81 = Static223.aStringArray18[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray27[anInt5243++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray353[--anInt5241];
				local192 = -1;
				if (local157 < 100 && Static223.aStringArray18[local157] != null) {
					local192 = Static29.anIntArray33[local157];
				}
				anIntArray353[anInt5241++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static119.aClass90_9 == null) {
					anIntArray353[anInt5241++] = -1;
					return;
				}
				anIntArray353[anInt5241++] = Static119.aClass90_9.anInt2417;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray27[--anInt5243];
				method4228(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt5243 -= 2;
				local75 = aStringArray27[anInt5243];
				local81 = aStringArray27[anInt5243 + 1];
				if (Static255.anInt4802 != 0 || (!Static217.aBoolean41 || Static296.aBoolean462) && !Static407.aBoolean597) {
					Static448.method6059(Static304.aClass44_70);
					Static98.aClass2_Sub20_Sub1_1.method3699(0);
					local89 = Static98.aClass2_Sub20_Sub1_1.anInt4608;
					Static98.aClass2_Sub20_Sub1_1.method3715(local75);
					Static9.method191(local81, Static98.aClass2_Sub20_Sub1_1);
					Static98.aClass2_Sub20_Sub1_1.method3709(Static98.aClass2_Sub20_Sub1_1.anInt4608 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray353[--anInt5241];
				local81 = null;
				if (local157 < 100) {
					local81 = Static109.aStringArray11[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray27[anInt5243++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray353[--anInt5241];
				local81 = null;
				if (local157 < 100) {
					local81 = Static374.aStringArray38[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray27[anInt5243++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray353[--anInt5241];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static219.anIntArray268[local157];
				}
				anIntArray353[anInt5241++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static231.aClass4_Sub2_Sub2_Sub1_2 == null || Static231.aClass4_Sub2_Sub2_Sub1_2.aString47 == null) {
					local75 = Static230.aString39;
				} else {
					local75 = Static231.aClass4_Sub2_Sub2_Sub1_2.method4600();
				}
				aStringArray27[anInt5243++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray353[anInt5241++] = Static444.anInt7747;
				return;
			}
			if (arg0 == 5017) {
				anIntArray353[anInt5241++] = Static87.anInt2010;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray353[--anInt5241];
				local192 = 0;
				if (local157 < 100 && Static223.aStringArray18[local157] != null) {
					local192 = Static29.anIntArray33[local157];
				}
				anIntArray353[anInt5241++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray353[--anInt5241];
				local81 = null;
				if (local157 < 100) {
					local81 = Static183.aStringArray14[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray27[anInt5243++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static231.aClass4_Sub2_Sub2_Sub1_2 == null || Static231.aClass4_Sub2_Sub2_Sub1_2.aString47 == null) {
					local75 = Static230.aString39;
				} else {
					local75 = Static231.aClass4_Sub2_Sub2_Sub1_2.method4607();
				}
				aStringArray27[anInt5243++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray353[--anInt5241];
				aStringArray27[anInt5243++] = Static264.aClass28_1.method718(local157).aString53;
				return;
			}
			@Pc(589) Class2_Sub2_Sub17 local589;
			if (arg0 == 5051) {
				local157 = anIntArray353[--anInt5241];
				local589 = Static264.aClass28_1.method718(local157);
				if (local589.anIntArray427 == null) {
					anIntArray353[anInt5241++] = 0;
					return;
				}
				anIntArray353[anInt5241++] = local589.anIntArray427.length;
				return;
			}
			if (arg0 == 5052) {
				anInt5241 -= 2;
				local157 = anIntArray353[anInt5241];
				local192 = anIntArray353[anInt5241 + 1];
				@Pc(634) Class2_Sub2_Sub17 local634 = Static264.aClass28_1.method718(local157);
				local95 = local634.anIntArray427[local192];
				anIntArray353[anInt5241++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray353[--anInt5241];
				local589 = Static264.aClass28_1.method718(local157);
				if (local589.anIntArray426 == null) {
					anIntArray353[anInt5241++] = 0;
					return;
				}
				anIntArray353[anInt5241++] = local589.anIntArray426.length;
				return;
			}
			if (arg0 == 5054) {
				anInt5241 -= 2;
				local157 = anIntArray353[anInt5241];
				local192 = anIntArray353[anInt5241 + 1];
				anIntArray353[anInt5241++] = Static264.aClass28_1.method718(local157).anIntArray426[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray353[--anInt5241];
				aStringArray27[anInt5243++] = Static446.aClass228_2.method5261(local157).method4847();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray353[--anInt5241];
				@Pc(760) Class2_Sub2_Sub14 local760 = Static446.aClass228_2.method5261(local157);
				if (local760.anIntArray405 == null) {
					anIntArray353[anInt5241++] = 0;
					return;
				}
				anIntArray353[anInt5241++] = local760.anIntArray405.length;
				return;
			}
			if (arg0 == 5057) {
				anInt5241 -= 2;
				local157 = anIntArray353[anInt5241];
				local192 = anIntArray353[anInt5241 + 1];
				anIntArray353[anInt5241++] = Static446.aClass228_2.method5261(local157).anIntArray405[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass11_1 = new Class11();
				aClass11_1.anInt319 = anIntArray353[--anInt5241];
				aClass11_1.aClass2_Sub2_Sub14_1 = Static446.aClass228_2.method5261(aClass11_1.anInt319);
				aClass11_1.anIntArray16 = new int[aClass11_1.aClass2_Sub2_Sub14_1.method4843()];
				return;
			}
			if (arg0 == 5059) {
				Static448.method6059(Static40.aClass44_13);
				Static98.aClass2_Sub20_Sub1_1.method3699(0);
				local157 = Static98.aClass2_Sub20_Sub1_1.anInt4608;
				Static98.aClass2_Sub20_Sub1_1.method3699(0);
				Static98.aClass2_Sub20_Sub1_1.method3745(aClass11_1.anInt319);
				aClass11_1.aClass2_Sub2_Sub14_1.method4839(aClass11_1.anIntArray16, Static98.aClass2_Sub20_Sub1_1);
				Static98.aClass2_Sub20_Sub1_1.method3709(Static98.aClass2_Sub20_Sub1_1.anInt4608 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray27[--anInt5243];
				Static448.method6059(Static376.aClass44_83);
				Static98.aClass2_Sub20_Sub1_1.method3699(0);
				local192 = Static98.aClass2_Sub20_Sub1_1.anInt4608;
				Static98.aClass2_Sub20_Sub1_1.method3715(local75);
				Static98.aClass2_Sub20_Sub1_1.method3745(aClass11_1.anInt319);
				aClass11_1.aClass2_Sub2_Sub14_1.method4839(aClass11_1.anIntArray16, Static98.aClass2_Sub20_Sub1_1);
				Static98.aClass2_Sub20_Sub1_1.method3709(Static98.aClass2_Sub20_Sub1_1.anInt4608 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static448.method6059(Static40.aClass44_13);
				Static98.aClass2_Sub20_Sub1_1.method3699(0);
				local157 = Static98.aClass2_Sub20_Sub1_1.anInt4608;
				Static98.aClass2_Sub20_Sub1_1.method3699(1);
				Static98.aClass2_Sub20_Sub1_1.method3745(aClass11_1.anInt319);
				aClass11_1.aClass2_Sub2_Sub14_1.method4839(aClass11_1.anIntArray16, Static98.aClass2_Sub20_Sub1_1);
				Static98.aClass2_Sub20_Sub1_1.method3709(Static98.aClass2_Sub20_Sub1_1.anInt4608 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt5241 -= 2;
				local157 = anIntArray353[anInt5241];
				local192 = anIntArray353[anInt5241 + 1];
				anIntArray353[anInt5241++] = Static264.aClass28_1.method718(local157).aCharArray8[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt5241 -= 2;
				local157 = anIntArray353[anInt5241];
				local192 = anIntArray353[anInt5241 + 1];
				anIntArray353[anInt5241++] = Static264.aClass28_1.method718(local157).aCharArray7[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt5241 -= 2;
				local157 = anIntArray353[anInt5241];
				local192 = anIntArray353[anInt5241 + 1];
				if (local192 == -1) {
					anIntArray353[anInt5241++] = -1;
					return;
				}
				anIntArray353[anInt5241++] = Static264.aClass28_1.method718(local157).method5043((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt5241 -= 2;
				local157 = anIntArray353[anInt5241];
				local192 = anIntArray353[anInt5241 + 1];
				if (local192 == -1) {
					anIntArray353[anInt5241++] = -1;
					return;
				}
				anIntArray353[anInt5241++] = Static264.aClass28_1.method718(local157).method5047((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray353[--anInt5241];
				anIntArray353[anInt5241++] = Static446.aClass228_2.method5261(local157).method4843();
				return;
			}
			if (arg0 == 5067) {
				anInt5241 -= 2;
				local157 = anIntArray353[anInt5241];
				local192 = anIntArray353[anInt5241 + 1];
				local89 = Static446.aClass228_2.method5261(local157).method4846(local192).anInt5936;
				anIntArray353[anInt5241++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt5241 -= 2;
				local157 = anIntArray353[anInt5241];
				local192 = anIntArray353[anInt5241 + 1];
				aClass11_1.anIntArray16[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt5241 -= 2;
				local157 = anIntArray353[anInt5241];
				local192 = anIntArray353[anInt5241 + 1];
				aClass11_1.anIntArray16[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt5241 -= 3;
				local157 = anIntArray353[anInt5241];
				local192 = anIntArray353[anInt5241 + 1];
				local89 = anIntArray353[anInt5241 + 2];
				@Pc(1265) Class2_Sub2_Sub14 local1265 = Static446.aClass228_2.method5261(local157);
				if (local1265.method4846(local192).anInt5936 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray353[anInt5241++] = local1265.method4842(local192, local89);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray27[--anInt5243];
				local1313 = anIntArray353[--anInt5241] == 1;
				Static63.method1252(local75, local1313);
				anIntArray353[anInt5241++] = Static26.anInt564;
				return;
			}
			if (arg0 == 5072) {
				if (Static435.aShortArray105 != null && Static24.anInt521 < Static26.anInt564) {
					anIntArray353[anInt5241++] = Static435.aShortArray105[Static24.anInt521++] & 0xFFFF;
					return;
				}
				anIntArray353[anInt5241++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static24.anInt521 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static448.method6059(Static40.aClass44_13);
				Static98.aClass2_Sub20_Sub1_1.method3699(0);
				local157 = Static98.aClass2_Sub20_Sub1_1.anInt4608;
				Static98.aClass2_Sub20_Sub1_1.method3699(2);
				Static98.aClass2_Sub20_Sub1_1.method3745(aClass11_1.anInt319);
				aClass11_1.aClass2_Sub2_Sub14_1.method4839(aClass11_1.anIntArray16, Static98.aClass2_Sub20_Sub1_1);
				Static98.aClass2_Sub20_Sub1_1.method3709(Static98.aClass2_Sub20_Sub1_1.anInt4608 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static428.aClass52_1.method1347(86)) {
					anIntArray353[anInt5241++] = 1;
					return;
				}
				anIntArray353[anInt5241++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static428.aClass52_1.method1347(82)) {
					anIntArray353[anInt5241++] = 1;
					return;
				}
				anIntArray353[anInt5241++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static428.aClass52_1.method1347(81)) {
					anIntArray353[anInt5241++] = 1;
					return;
				}
				anIntArray353[anInt5241++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static77.method5566(anIntArray353[--anInt5241]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray353[anInt5241++] = Static264.method3969();
					return;
				}
				if (arg0 == 5205) {
					Static277.method4103(false, -1, -1, anIntArray353[--anInt5241]);
					return;
				}
				@Pc(1554) Class2_Sub2_Sub11 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray353[--anInt5241];
					local1554 = Static169.method2542(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray353[anInt5241++] = -1;
						return;
					}
					anIntArray353[anInt5241++] = local1554.anInt4047;
					return;
				}
				@Pc(1587) Class2_Sub2_Sub11 local1587;
				if (arg0 == 5207) {
					local1587 = Static169.method2543(anIntArray353[--anInt5241]);
					if (local1587 != null && local1587.aString36 != null) {
						aStringArray27[anInt5243++] = local1587.aString36;
						return;
					}
					aStringArray27[anInt5243++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray353[anInt5241++] = Static44.anInt1163;
					anIntArray353[anInt5241++] = Static228.anInt1861;
					return;
				}
				if (arg0 == 5209) {
					anIntArray353[anInt5241++] = Static67.anInt1777 + Static169.anInt3161;
					anIntArray353[anInt5241++] = Static393.anInt6878 + Static169.anInt3159;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray353[--anInt5241];
					local1554 = Static169.method2543(local157);
					if (local1554 == null) {
						anIntArray353[anInt5241++] = 0;
						anIntArray353[anInt5241++] = 0;
						return;
					}
					anIntArray353[anInt5241++] = local1554.anInt4044 >> 14 & 0x3FFF;
					anIntArray353[anInt5241++] = local1554.anInt4044 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray353[--anInt5241];
					local1554 = Static169.method2543(local157);
					if (local1554 == null) {
						anIntArray353[anInt5241++] = 0;
						anIntArray353[anInt5241++] = 0;
						return;
					}
					anIntArray353[anInt5241++] = local1554.anInt4048 - local1554.anInt4045;
					anIntArray353[anInt5241++] = local1554.anInt4041 - local1554.anInt4042;
					return;
				}
				@Pc(1777) Class2_Sub38 local1777;
				if (arg0 == 5212) {
					local1777 = Static44.method835();
					if (local1777 == null) {
						anIntArray353[anInt5241++] = -1;
						anIntArray353[anInt5241++] = -1;
						return;
					}
					anIntArray353[anInt5241++] = local1777.anInt6772;
					local192 = local1777.anInt6764 << 28 | local1777.anInt6767 + Static169.anInt3161 << 14 | local1777.anInt6760 + Static169.anInt3159;
					anIntArray353[anInt5241++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static322.method4608();
					if (local1777 == null) {
						anIntArray353[anInt5241++] = -1;
						anIntArray353[anInt5241++] = -1;
						return;
					}
					anIntArray353[anInt5241++] = local1777.anInt6772;
					local192 = local1777.anInt6764 << 28 | local1777.anInt6767 + Static169.anInt3161 << 14 | local1777.anInt6760 + Static169.anInt3159;
					anIntArray353[anInt5241++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray353[--anInt5241];
					local1554 = Static351.method4911();
					if (local1554 != null) {
						local1925 = local1554.method3239(local157 & 0x3FFF, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3, anIntArray354);
						if (local1925) {
							Static271.method4043(anIntArray354[1], anIntArray354[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt5241 -= 2;
					local157 = anIntArray353[anInt5241];
					local192 = anIntArray353[anInt5241 + 1];
					@Pc(1963) Class145 local1963 = Static169.method2551(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class2_Sub2_Sub11 local1970 = (Class2_Sub2_Sub11) local1963.method3390(); local1970 != null; local1970 = (Class2_Sub2_Sub11) local1963.method3384()) {
						if (local1970.anInt4047 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray353[anInt5241++] = 1;
						return;
					}
					anIntArray353[anInt5241++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray353[--anInt5241];
					local1554 = Static169.method2543(local157);
					if (local1554 == null) {
						anIntArray353[anInt5241++] = -1;
						return;
					}
					anIntArray353[anInt5241++] = local1554.anInt4039;
					return;
				}
				if (arg0 == 5220) {
					anIntArray353[anInt5241++] = Static430.anInt7475 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray353[--anInt5241];
					Static271.method4043(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static351.method4911();
					if (local1587 != null) {
						local1313 = local1587.method3240(Static67.anInt1777 + Static169.anInt3161, anIntArray354, Static393.anInt6878 + Static169.anInt3159);
						if (local1313) {
							anIntArray353[anInt5241++] = anIntArray354[1];
							anIntArray353[anInt5241++] = anIntArray354[2];
							return;
						}
						anIntArray353[anInt5241++] = -1;
						anIntArray353[anInt5241++] = -1;
						return;
					}
					anIntArray353[anInt5241++] = -1;
					anIntArray353[anInt5241++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt5241 -= 2;
					local157 = anIntArray353[anInt5241];
					local192 = anIntArray353[anInt5241 + 1];
					Static277.method4103(false, local192 & 0x3FFF, local192 >> 14 & 0x3FFF, local157);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray353[--anInt5241];
					local1554 = Static351.method4911();
					if (local1554 != null) {
						local1925 = local1554.method3239(local157 & 0x3FFF, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3, anIntArray354);
						if (local1925) {
							anIntArray353[anInt5241++] = anIntArray354[1];
							anIntArray353[anInt5241++] = anIntArray354[2];
							return;
						}
						anIntArray353[anInt5241++] = -1;
						anIntArray353[anInt5241++] = -1;
						return;
					}
					anIntArray353[anInt5241++] = -1;
					anIntArray353[anInt5241++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray353[--anInt5241];
					local1554 = Static351.method4911();
					if (local1554 != null) {
						local1925 = local1554.method3240(local157 >> 14 & 0x3FFF, anIntArray354, local157 & 0x3FFF);
						if (local1925) {
							anIntArray353[anInt5241++] = anIntArray354[1];
							anIntArray353[anInt5241++] = anIntArray354[2];
							return;
						}
						anIntArray353[anInt5241++] = -1;
						anIntArray353[anInt5241++] = -1;
						return;
					}
					anIntArray353[anInt5241++] = -1;
					anIntArray353[anInt5241++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static342.method4805(anIntArray353[--anInt5241]);
					return;
				}
				if (arg0 == 5227) {
					anInt5241 -= 2;
					local157 = anIntArray353[anInt5241];
					local192 = anIntArray353[anInt5241 + 1];
					Static277.method4103(true, local192 & 0x3FFF, local192 >> 14 & 0x3FFF, local157);
					return;
				}
				if (arg0 == 5228) {
					Static191.aBoolean310 = anIntArray353[--anInt5241] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray353[anInt5241++] = Static191.aBoolean310 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray353[--anInt5241];
					Static60.method1205(local157);
					return;
				}
				@Pc(2483) Class2 local2483;
				if (arg0 == 5231) {
					anInt5241 -= 2;
					local157 = anIntArray353[anInt5241];
					local1313 = anIntArray353[anInt5241 + 1] == 1;
					if (Static215.aClass240_20 != null) {
						local2483 = Static215.aClass240_20.method5439((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6072();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class2();
							Static215.aClass240_20.method5430((long) local157, local2483);
						}
					}
					return;
				}
				@Pc(2525) Class2 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray353[--anInt5241];
					if (Static215.aClass240_20 != null) {
						local2525 = Static215.aClass240_20.method5439((long) local157);
						anIntArray353[anInt5241++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray353[anInt5241++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt5241 -= 2;
					local157 = anIntArray353[anInt5241];
					local1313 = anIntArray353[anInt5241 + 1] == 1;
					if (Static109.aClass240_8 != null) {
						local2483 = Static109.aClass240_8.method5439((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6072();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class2();
							Static109.aClass240_8.method5430((long) local157, local2483);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray353[--anInt5241];
					if (Static109.aClass240_8 != null) {
						local2525 = Static109.aClass240_8.method5439((long) local157);
						anIntArray353[anInt5241++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray353[anInt5241++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray353[anInt5241++] = Static169.aClass2_Sub2_Sub11_3 == null ? -1 : Static169.aClass2_Sub2_Sub11_3.anInt4047;
					return;
				}
				if (arg0 == 5236) {
					anInt5241 -= 2;
					local157 = anIntArray353[anInt5241];
					local192 = anIntArray353[anInt5241 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static262.method3939(local157, local95, local89);
					if (local2691 < 0) {
						anIntArray353[anInt5241++] = -1;
						return;
					}
					anIntArray353[anInt5241++] = local2691;
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt5241 -= 2;
					local157 = anIntArray353[anInt5241];
					local192 = anIntArray353[anInt5241 + 1];
					Static168.method2626(false, local192, local157, 3);
					anIntArray353[anInt5241++] = Static140.aFrame12 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static140.aFrame12 != null) {
						Static168.method2626(false, -1, -1, Static399.aClass167_Sub1_1.anInt5557);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2769) Class82[] local2769 = Static118.method1731();
					anIntArray353[anInt5241++] = local2769.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray353[--anInt5241];
					@Pc(2793) Class82[] local2793 = Static118.method1731();
					anIntArray353[anInt5241++] = local2793[local157].anInt2298;
					anIntArray353[anInt5241++] = local2793[local157].anInt2301;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static399.aClass167_Sub1_1.anInt5569;
					local192 = Static399.aClass167_Sub1_1.anInt5561;
					local89 = -1;
					@Pc(2830) Class82[] local2830 = Static118.method1731();
					for (local2691 = 0; local2691 < local2830.length; local2691++) {
						@Pc(2837) Class82 local2837 = local2830[local2691];
						if (local2837.anInt2298 == local157 && local2837.anInt2301 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray353[anInt5241++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray353[anInt5241++] = Static405.method5498();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray353[--anInt5241];
					if (local157 >= 1 && local157 <= 2) {
						Static168.method2626(false, -1, -1, local157);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.anInt5557;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray353[--anInt5241];
					if (local157 >= 1 && local157 <= 2) {
						Static399.aClass167_Sub1_1.anInt5557 = local157;
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						return;
					}
					return;
				}
			} else {
				@Pc(3345) String local3345;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt5243 -= 2;
						local75 = aStringArray27[anInt5243];
						local81 = aStringArray27[anInt5243 + 1];
						local89 = anIntArray353[--anInt5241];
						Static448.method6059(Static147.aClass44_57);
						Static98.aClass2_Sub20_Sub1_1.method3699(Static209.method3225(local75) + Static209.method3225(local81) + 1);
						Static98.aClass2_Sub20_Sub1_1.method3715(local75);
						Static98.aClass2_Sub20_Sub1_1.method3715(local81);
						Static98.aClass2_Sub20_Sub1_1.method3699(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt5241 -= 2;
						Static401.aShortArray88[anIntArray353[anInt5241]] = (short) Static74.method1331(anIntArray353[anInt5241 + 1]);
						Static350.aClass149_2.method3486();
						Static350.aClass149_2.method3482();
						Static417.aClass234_2.method5354();
						Static8.method183();
						return;
					}
					if (arg0 == 5405) {
						anInt5241 -= 2;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static270.anIntArrayArrayArray12[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt5241 -= 7;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1] << 1;
						local89 = anIntArray353[anInt5241 + 2];
						local95 = anIntArray353[anInt5241 + 3];
						local2691 = anIntArray353[anInt5241 + 4];
						@Pc(3105) int local3105 = anIntArray353[anInt5241 + 5];
						@Pc(3111) int local3111 = anIntArray353[anInt5241 + 6];
						if (local157 >= 0 && local157 < 2 && Static270.anIntArrayArrayArray12[local157] != null && local192 >= 0 && local192 < Static270.anIntArrayArrayArray12[local157].length) {
							Static270.anIntArrayArrayArray12[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3111 };
							Static270.anIntArrayArrayArray12[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3105, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static270.anIntArrayArrayArray12[anIntArray353[--anInt5241]].length >> 1;
						anIntArray353[anInt5241++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static140.aFrame12 != null) {
							Static168.method2626(false, -1, -1, Static399.aClass167_Sub1_1.anInt5557);
						}
						if (Static373.aFrame2 != null) {
							Static211.method3261();
							System.exit(0);
							return;
						}
						local75 = Static220.aString37 == null ? Static79.method1393() : Static220.aString37;
						Static448.method6065(false, Static281.anInt5126 == 1, local75, Static303.aClass131_4);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static440.aClass128_8 != null) {
							if (Static440.aClass128_8.anObject4 == null) {
								local75 = Static45.method5674(Static440.aClass128_8.anInt3729);
							} else {
								local75 = (String) Static440.aClass128_8.anObject4;
							}
						}
						aStringArray27[anInt5243++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray353[anInt5241++] = Static197.anInt3816 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static140.aFrame12 != null) {
							Static168.method2626(false, -1, -1, Static399.aClass167_Sub1_1.anInt5557);
						}
						local75 = aStringArray27[--anInt5243];
						local1313 = anIntArray353[--anInt5241] == 1;
						local3345 = Static79.method1393() + local75;
						Static448.method6065(local1313, Static281.anInt5126 == 1, local3345, Static303.aClass131_4);
						return;
					}
					if (arg0 == 5422) {
						anInt5243 -= 2;
						local75 = aStringArray27[anInt5243];
						local81 = aStringArray27[anInt5243 + 1];
						local89 = anIntArray353[--anInt5241];
						if (local75.length() > 0) {
							if (Static81.aStringArray9 == null) {
								Static81.aStringArray9 = new String[Static312.anIntArray201[Static107.aClass209_1.anInt5938]];
							}
							Static81.aStringArray9[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static184.aStringArray15 == null) {
								Static184.aStringArray15 = new String[Static312.anIntArray201[Static107.aClass209_1.anInt5938]];
							}
							Static184.aStringArray15[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray27[--anInt5243]);
						return;
					}
					if (arg0 == 5424) {
						anInt5241 -= 11;
						Static393.anInt6883 = anIntArray353[anInt5241];
						Static449.anInt2640 = anIntArray353[anInt5241 + 1];
						Static303.anInt5387 = anIntArray353[anInt5241 + 2];
						Static297.anInt5338 = anIntArray353[anInt5241 + 3];
						Static33.anInt662 = anIntArray353[anInt5241 + 4];
						Static327.anInt5867 = anIntArray353[anInt5241 + 5];
						Static7.anInt236 = anIntArray353[anInt5241 + 6];
						Static330.anInt5886 = anIntArray353[anInt5241 + 7];
						Static355.anInt6272 = anIntArray353[anInt5241 + 8];
						Static354.anInt6243 = anIntArray353[anInt5241 + 9];
						Static123.anInt2431 = anIntArray353[anInt5241 + 10];
						Static351.aClass188_97.method4296(Static33.anInt662);
						Static351.aClass188_97.method4296(Static327.anInt5867);
						Static351.aClass188_97.method4296(Static7.anInt236);
						Static351.aClass188_97.method4296(Static330.anInt5886);
						Static351.aClass188_97.method4296(Static355.anInt6272);
						Static445.aClass76_22 = null;
						Static39.aClass76_4 = null;
						Static48.aClass76_5 = null;
						Static348.aClass76_16 = null;
						Static344.aClass76_15 = null;
						Static312.aClass76_8 = null;
						Static423.aClass76_21 = null;
						Static33.aClass76_1 = null;
						Static417.aBoolean624 = true;
						return;
					}
					if (arg0 == 5425) {
						Static374.method5250();
						Static417.aBoolean624 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt5241 -= 2;
						Static231.anInt4398 = anIntArray353[anInt5241];
						Static340.anInt5988 = anIntArray353[anInt5241 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt5241 -= 2;
						Static408.anInt7081 = anIntArray353[anInt5241 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt5241 -= 2;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						anIntArray353[anInt5241++] = Static344.method4848(local192, local157) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static176.method2774(aStringArray27[--anInt5243], false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static461.method3590(Static303.aClass131_4.anApplet1, "accountcreated");
							return;
						} catch (@Pc(3639) Throwable local3639) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt5241 -= 4;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						local89 = anIntArray353[anInt5241 + 2];
						local95 = anIntArray353[anInt5241 + 3];
						Static174.method2735((local157 & 0x3FFF) - Static379.anInt6721, false, local89, (local157 >> 14 & 0x3FFF) - Static173.anInt3340, local192, local95);
						return;
					}
					if (arg0 == 5501) {
						anInt5241 -= 4;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						local89 = anIntArray353[anInt5241 + 2];
						local95 = anIntArray353[anInt5241 + 3];
						Static159.method2510(local95, (local157 & 0x3FFF) - Static379.anInt6721, local192, local89, (local157 >> 14 & 0x3FFF) - Static173.anInt3340);
						return;
					}
					if (arg0 == 5502) {
						anInt5241 -= 6;
						local157 = anIntArray353[anInt5241];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static21.anInt433 = local157;
						local192 = anIntArray353[anInt5241 + 1];
						if (local192 + 1 >= Static270.anIntArrayArrayArray12[Static21.anInt433].length >> 1) {
							throw new RuntimeException();
						}
						Static321.anInt5749 = local192;
						Static195.anInt3811 = 0;
						Static164.anInt3208 = anIntArray353[anInt5241 + 2];
						Static266.anInt4929 = anIntArray353[anInt5241 + 3];
						local89 = anIntArray353[anInt5241 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static148.anInt2821 = local89;
						local95 = anIntArray353[anInt5241 + 5];
						if (local95 + 1 >= Static270.anIntArrayArrayArray12[Static148.anInt2821].length >> 1) {
							throw new RuntimeException();
						}
						Static121.anInt2406 = local95;
						Static65.anInt7824 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static225.method3478();
						return;
					}
					if (arg0 == 5504) {
						anInt5241 -= 2;
						Static105.method1625(anIntArray353[anInt5241], anIntArray353[anInt5241 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray353[anInt5241++] = (int) Static328.aFloat179 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray353[anInt5241++] = (int) Static203.aFloat130 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static236.method3586();
						return;
					}
					if (arg0 == 5508) {
						Static397.method5452();
						return;
					}
					if (arg0 == 5509) {
						Static447.method3801();
						return;
					}
					if (arg0 == 5510) {
						Static402.method5473();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray353[--anInt5241];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static173.anInt3340;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static81.anInt1950) {
							local192 = Static81.anInt1950;
						}
						local89 -= Static379.anInt6721;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static171.anInt3288) {
							local89 = Static171.anInt3288;
						}
						Static422.anInt7372 = (local192 << 7) + 64;
						Static352.anInt7237 = (local89 << 7) + 64;
						Static65.anInt7824 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static209.method3224();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt5243 -= 2;
						local75 = aStringArray27[anInt5243];
						local81 = aStringArray27[anInt5243 + 1];
						local89 = anIntArray353[--anInt5241];
						if (Static297.anInt5339 != 10) {
							return;
						}
						if (Static350.anInt6149 == 0 && Static398.anInt5978 == 0 && Static375.anInt6694 == 0 && Static408.anInt7082 == 0) {
							Static128.method1856(local81, local75, local89);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static187.method5443();
						return;
					}
					if (arg0 == 5602) {
						if (Static398.anInt5978 == 0) {
							Static33.anInt668 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt5241 -= 4;
						if (Static297.anInt5339 != 10) {
							return;
						}
						if (Static350.anInt6149 == 0 && Static398.anInt5978 == 0 && Static375.anInt6694 == 0 && Static408.anInt7082 == 0) {
							Static180.method2823(anIntArray353[anInt5241], anIntArray353[anInt5241 + 2], anIntArray353[anInt5241 + 1], anIntArray353[anInt5241 + 3]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt5243--;
						if (Static297.anInt5339 != 10) {
							return;
						}
						if (Static350.anInt6149 == 0 && Static398.anInt5978 == 0 && Static375.anInt6694 == 0 && Static408.anInt7082 == 0) {
							Static368.method5150(Static41.method777(aStringArray27[anInt5243]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt5243 -= 3;
						anInt5241 -= 7;
						if (Static297.anInt5339 != 10) {
							return;
						}
						if (Static350.anInt6149 == 0 && Static398.anInt5978 == 0 && Static375.anInt6694 == 0 && Static408.anInt7082 == 0) {
							Static183.method2905(anIntArray353[anInt5241 + 3], aStringArray27[anInt5243 + 1], anIntArray353[anInt5241 + 1], anIntArray353[anInt5241 + 2], anIntArray353[anInt5241 + 5] == 1, anIntArray353[anInt5241 + 6] == 1, anIntArray353[anInt5241], aStringArray27[anInt5243 + 2], Static41.method777(aStringArray27[anInt5243]), anIntArray353[anInt5241 + 4] == 1);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static375.anInt6694 == 0) {
							Static60.anInt1700 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray353[anInt5241++] = Static33.anInt668;
						return;
					}
					if (arg0 == 5608) {
						anIntArray353[anInt5241++] = Static95.anInt2154;
						return;
					}
					if (arg0 == 5609) {
						anIntArray353[anInt5241++] = Static60.anInt1700;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray27[anInt5243++] = Static74.aStringArray7.length > local157 ? Static356.method4993(Static74.aStringArray7[local157]) : "";
						}
						Static74.aStringArray7 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray353[anInt5241++] = Static282.anInt5151;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray353[--anInt5241];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static399.aClass167_Sub1_1.anInt5554 = local157;
						Static382.method5313();
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6002) {
						Static399.aClass167_Sub1_1.method4523(anIntArray353[--anInt5241] == 1);
						Static382.method5313();
						Static276.method4099();
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6003) {
						Static399.aClass167_Sub1_1.aBoolean495 = anIntArray353[--anInt5241] == 1;
						Static276.method4099();
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6005) {
						Static399.aClass167_Sub1_1.aBoolean491 = anIntArray353[--anInt5241] == 1;
						Static382.method5313();
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6006) {
						Static399.aClass167_Sub1_1.aBoolean485 = anIntArray353[--anInt5241] == 1;
						Static387.aClass26_9.method2255(!Static399.aClass167_Sub1_1.aBoolean485);
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6007) {
						Static399.aClass167_Sub1_1.anInt5550 = anIntArray353[--anInt5241];
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6008) {
						Static399.aClass167_Sub1_1.aBoolean489 = anIntArray353[--anInt5241] == 1;
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6009) {
						Static399.aClass167_Sub1_1.aBoolean483 = anIntArray353[--anInt5241] == 1;
						Static382.method5313();
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6010) {
						Static399.aClass167_Sub1_1.aBoolean493 = anIntArray353[--anInt5241] == 1;
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray353[--anInt5241];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static399.aClass167_Sub1_1.method4515(local157, Static281.anInt5126);
						Static382.method5313();
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6012) {
						Static399.aClass167_Sub1_1.method4516(anIntArray353[--anInt5241] == 1, Static281.anInt5126);
						Static196.method4361();
						Static272.method5841();
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6014) {
						Static399.aClass167_Sub1_1.aBoolean497 = anIntArray353[--anInt5241] == 1;
						Static382.method5313();
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6015) {
						Static399.aClass167_Sub1_1.aBoolean494 = anIntArray353[--anInt5241] == 1;
						Static382.method5313();
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray353[--anInt5241];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static399.aClass167_Sub1_1.anInt5559 = local157;
						Static102.method1621(Static281.anInt5126);
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						return;
					}
					if (arg0 == 6017) {
						Static399.aClass167_Sub1_1.aBoolean492 = anIntArray353[--anInt5241] == 1;
						Static41.method775();
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray353[--anInt5241];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static399.aClass167_Sub1_1.anInt5565 = local157;
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray353[--anInt5241];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static399.aClass167_Sub1_1.anInt5568) {
							if (Static399.aClass167_Sub1_1.anInt5568 == 0 && Static378.anInt6716 != -1) {
								Static408.method5525(Static378.anInt6716, Static329.aClass188_90, local157);
								Static256.aBoolean398 = false;
							} else if (local157 == 0) {
								Static251.method3862();
								Static256.aBoolean398 = false;
							} else {
								Static117.method1723(local157);
							}
							Static399.aClass167_Sub1_1.anInt5568 = local157;
						}
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray353[--anInt5241];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static399.aClass167_Sub1_1.anInt5567 = local157;
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6021) {
						Static399.aClass167_Sub1_1.aBoolean498 = anIntArray353[--anInt5241] == 1;
						Static276.method4099();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray353[--anInt5241];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static43.anInt1146 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static48.method940(local157);
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						anIntArray353[anInt5241++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray353[--anInt5241];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static399.aClass167_Sub1_1.anInt5560 = local157;
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray353[--anInt5241];
						if (local157 < 0 || local157 > Static336.method4748(Static43.anInt1146)) {
							local157 = 0;
						}
						Static399.aClass167_Sub1_1.anInt5566 = local157;
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray353[--anInt5241];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static407.method5517(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static399.aClass167_Sub1_1.aBoolean490 = anIntArray353[--anInt5241] != 0;
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						return;
					}
					if (arg0 == 6029) {
						Static399.aClass167_Sub1_1.anInt5550 = anIntArray353[--anInt5241];
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						return;
					}
					if (arg0 == 6030) {
						Static399.aClass167_Sub1_1.aBoolean482 = anIntArray353[--anInt5241] != 0;
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static382.method5313();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray353[--anInt5241];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static102.method1621(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray353[--anInt5241];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static399.aClass167_Sub1_1.anInt5553 = local157;
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray353[--anInt5241];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static399.aClass167_Sub1_1.anInt5563 = local157;
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						return;
					}
					if (arg0 == 6034) {
						Static399.aClass167_Sub1_1.aBoolean487 = anIntArray353[--anInt5241] == 1;
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						Static196.method4361();
						Static45.aBoolean626 = false;
						return;
					}
					if (arg0 == 6035) {
						Static399.aClass167_Sub1_1.aBoolean499 = anIntArray353[--anInt5241] == 1;
						Static382.method5313();
						Static276.method4099();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.anInt5554;
						return;
					}
					if (arg0 == 6102) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.method4521(Static281.anInt5126) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.aBoolean495 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.aBoolean491 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.aBoolean485 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.anInt5550;
						return;
					}
					if (arg0 == 6108) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.aBoolean489 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.aBoolean483 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.aBoolean493 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.method4517(Static281.anInt5126);
						return;
					}
					if (arg0 == 6112) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.method4514(Static281.anInt5126) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.aBoolean497 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.aBoolean494 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.anInt5559;
						return;
					}
					if (arg0 == 6117) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.aBoolean492 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.anInt5565;
						return;
					}
					if (arg0 == 6119) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.anInt5568;
						return;
					}
					if (arg0 == 6120) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.anInt5567;
						return;
					}
					if (arg0 == 6121) {
						anIntArray353[anInt5241++] = Static387.aClass26_9.method2243() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray353[anInt5241++] = Static118.method1725();
						return;
					}
					if (arg0 == 6124) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.anInt5560;
						return;
					}
					if (arg0 == 6125) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.anInt5566;
						return;
					}
					if (arg0 == 6126) {
						anIntArray353[anInt5241++] = Static387.aClass26_9.method2276() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.aBoolean488 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.aBoolean490 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.anInt5550;
						return;
					}
					if (arg0 == 6130) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.aBoolean482 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray353[anInt5241++] = Static281.anInt5126;
						return;
					}
					if (arg0 == 6132) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.anInt5553;
						return;
					}
					if (arg0 == 6133) {
						anIntArray353[anInt5241++] = Static197.anInt3816 == 1 || Static197.anInt3816 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray353[anInt5241++] = Static336.method4748(Static43.anInt1146);
						return;
					}
					if (arg0 == 6135) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.anInt5563;
						return;
					}
					if (arg0 == 6136) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.aBoolean487 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt5241 -= 2;
						Static72.aShort39 = (short) anIntArray353[anInt5241];
						if (Static72.aShort39 <= 0) {
							Static72.aShort39 = 256;
						}
						Static10.aShort4 = (short) anIntArray353[anInt5241 + 1];
						if (Static10.aShort4 <= 0) {
							Static10.aShort4 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt5241 -= 2;
						Static266.aShort59 = (short) anIntArray353[anInt5241];
						if (Static266.aShort59 <= 0) {
							Static266.aShort59 = 256;
						}
						Static297.aShort68 = (short) anIntArray353[anInt5241 + 1];
						if (Static297.aShort68 <= 0) {
							Static297.aShort68 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt5241 -= 4;
						Static447.aShort54 = (short) anIntArray353[anInt5241];
						if (Static447.aShort54 <= 0) {
							Static447.aShort54 = 1;
						}
						Static37.aShort7 = (short) anIntArray353[anInt5241 + 1];
						if (Static37.aShort7 <= 0) {
							Static37.aShort7 = 32767;
						} else if (Static37.aShort7 < Static447.aShort54) {
							Static37.aShort7 = Static447.aShort54;
						}
						Static157.aShort35 = (short) anIntArray353[anInt5241 + 2];
						if (Static157.aShort35 <= 0) {
							Static157.aShort35 = 1;
						}
						Static23.aShort5 = (short) anIntArray353[anInt5241 + 3];
						if (Static23.aShort5 <= 0) {
							Static23.aShort5 = 32767;
							return;
						}
						if (Static23.aShort5 < Static157.aShort35) {
							Static23.aShort5 = Static157.aShort35;
						}
						return;
					}
					if (arg0 == 6203) {
						Static229.method3519(false, Static402.aClass41_14.anInt1599, 0, 0, Static402.aClass41_14.anInt1622);
						anIntArray353[anInt5241++] = Static102.anInt2188;
						anIntArray353[anInt5241++] = Static191.anInt3765;
						return;
					}
					if (arg0 == 6204) {
						anIntArray353[anInt5241++] = Static266.aShort59;
						anIntArray353[anInt5241++] = Static297.aShort68;
						return;
					}
					if (arg0 == 6205) {
						anIntArray353[anInt5241++] = Static72.aShort39;
						anIntArray353[anInt5241++] = Static10.aShort4;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray353[anInt5241++] = (int) (Static208.method3182() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray353[anInt5241++] = (int) (Static208.method3182() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt5241 -= 3;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						local89 = anIntArray353[anInt5241 + 2];
						aCalendar1.clear();
						aCalendar1.set(11, 12);
						aCalendar1.set(local89, local192, local157);
						anIntArray353[anInt5241++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6303) {
						aCalendar1.clear();
						aCalendar1.setTime(new Date(Static208.method3182()));
						anIntArray353[anInt5241++] = aCalendar1.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray353[--anInt5241];
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
						anIntArray353[anInt5241++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray353[anInt5241++] = Static395.method5427() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray353[anInt5241++] = Static139.method2013() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static297.anInt5339 == 10 && Static350.anInt6149 == 0 && Static398.anInt5978 == 0 && Static375.anInt6694 == 0) {
							anIntArray353[anInt5241++] = Static110.method1687() == -1 ? 0 : 1;
							return;
						}
						anIntArray353[anInt5241++] = 1;
						return;
					}
					@Pc(6160) Class88 local6160;
					@Pc(6127) Class23_Sub1 local6127;
					if (arg0 == 6501) {
						local6127 = Static125.method1815();
						if (local6127 != null) {
							anIntArray353[anInt5241++] = local6127.anInt3274;
							anIntArray353[anInt5241++] = local6127.anInt3268;
							aStringArray27[anInt5243++] = local6127.aString22;
							local6160 = local6127.method2638();
							anIntArray353[anInt5241++] = local6160.anInt2405;
							aStringArray27[anInt5243++] = local6160.aString20;
							anIntArray353[anInt5241++] = local6127.anInt3267;
							anIntArray353[anInt5241++] = local6127.anInt3277;
							return;
						}
						anIntArray353[anInt5241++] = -1;
						anIntArray353[anInt5241++] = 0;
						aStringArray27[anInt5243++] = "";
						anIntArray353[anInt5241++] = 0;
						aStringArray27[anInt5243++] = "";
						anIntArray353[anInt5241++] = 0;
						anIntArray353[anInt5241++] = 0;
						return;
					}
					if (arg0 == 6502) {
						local6127 = Static98.method1607();
						if (local6127 != null) {
							anIntArray353[anInt5241++] = local6127.anInt3274;
							anIntArray353[anInt5241++] = local6127.anInt3268;
							aStringArray27[anInt5243++] = local6127.aString22;
							local6160 = local6127.method2638();
							anIntArray353[anInt5241++] = local6160.anInt2405;
							aStringArray27[anInt5243++] = local6160.aString20;
							anIntArray353[anInt5241++] = local6127.anInt3267;
							anIntArray353[anInt5241++] = local6127.anInt3277;
							return;
						}
						anIntArray353[anInt5241++] = -1;
						anIntArray353[anInt5241++] = 0;
						aStringArray27[anInt5243++] = "";
						anIntArray353[anInt5241++] = 0;
						aStringArray27[anInt5243++] = "";
						anIntArray353[anInt5241++] = 0;
						anIntArray353[anInt5241++] = 0;
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray353[--anInt5241];
						if (Static297.anInt5339 == 10 && Static350.anInt6149 == 0 && Static398.anInt5978 == 0 && Static375.anInt6694 == 0) {
							anIntArray353[anInt5241++] = Static5.method138(local157) ? 1 : 0;
							return;
						}
						anIntArray353[anInt5241++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static399.aClass167_Sub1_1.anInt5562 = anIntArray353[--anInt5241];
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						return;
					}
					if (arg0 == 6505) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.anInt5562;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray353[--anInt5241];
						@Pc(6476) Class23_Sub1 local6476 = Static450.method6078(local157);
						if (local6476 != null) {
							anIntArray353[anInt5241++] = local6476.anInt3268;
							aStringArray27[anInt5243++] = local6476.aString22;
							@Pc(6500) Class88 local6500 = local6476.method2638();
							anIntArray353[anInt5241++] = local6500.anInt2405;
							aStringArray27[anInt5243++] = local6500.aString20;
							anIntArray353[anInt5241++] = local6476.anInt3267;
							anIntArray353[anInt5241++] = local6476.anInt3277;
							return;
						}
						anIntArray353[anInt5241++] = -1;
						aStringArray27[anInt5243++] = "";
						anIntArray353[anInt5241++] = 0;
						aStringArray27[anInt5243++] = "";
						anIntArray353[anInt5241++] = 0;
						anIntArray353[anInt5241++] = 0;
						return;
					}
					if (arg0 == 6507) {
						anInt5241 -= 4;
						local157 = anIntArray353[anInt5241];
						local1313 = anIntArray353[anInt5241 + 1] == 1;
						local89 = anIntArray353[anInt5241 + 2];
						local1965 = anIntArray353[anInt5241 + 3] == 1;
						Static298.method5811(local157, local1313, local1965, local89);
						return;
					}
					if (arg0 == 6508) {
						Static426.method5767();
						return;
					}
					if (arg0 == 6509) {
						if (Static297.anInt5339 != 10) {
							return;
						}
						Static345.aBoolean338 = anIntArray353[--anInt5241] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static399.aClass167_Sub1_1.aBoolean480 = anIntArray353[--anInt5241] == 1;
						Static399.aClass167_Sub1_1.method4525(Static303.aClass131_4);
						return;
					}
					if (arg0 == 6601) {
						anIntArray353[anInt5241++] = Static399.aClass167_Sub1_1.aBoolean480 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static395.aClass223_5 == Static110.aClass223_3) {
					if (arg0 == 6700) {
						local157 = Static398.aClass240_27.method5431();
						if (Static108.anInt2264 != -1) {
							local157++;
						}
						anIntArray353[anInt5241++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray353[--anInt5241];
						if (Static108.anInt2264 != -1) {
							if (local157 == 0) {
								anIntArray353[anInt5241++] = Static108.anInt2264;
								return;
							}
							local157--;
						}
						@Pc(6758) Class2_Sub25 local6758 = (Class2_Sub25) Static398.aClass240_27.method5438();
						while (local157-- > 0) {
							local6758 = (Class2_Sub25) Static398.aClass240_27.method5436();
						}
						anIntArray353[anInt5241++] = local6758.anInt4163;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray353[--anInt5241];
						if (Static450.aClass41ArrayArray2[local157] == null) {
							aStringArray27[anInt5243++] = "";
							return;
						}
						local81 = Static450.aClass41ArrayArray2[local157][0].aString10;
						if (local81 == null) {
							aStringArray27[anInt5243++] = "";
							return;
						}
						aStringArray27[anInt5243++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray353[--anInt5241];
						if (Static450.aClass41ArrayArray2[local157] == null) {
							anIntArray353[anInt5241++] = 0;
							return;
						}
						anIntArray353[anInt5241++] = Static450.aClass41ArrayArray2[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt5241 -= 2;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						if (Static450.aClass41ArrayArray2[local157] == null) {
							aStringArray27[anInt5243++] = "";
							return;
						}
						local3345 = Static450.aClass41ArrayArray2[local157][local192].aString10;
						if (local3345 == null) {
							aStringArray27[anInt5243++] = "";
							return;
						}
						aStringArray27[anInt5243++] = local3345;
						return;
					}
					if (arg0 == 6705) {
						anInt5241 -= 2;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						if (Static450.aClass41ArrayArray2[local157] == null) {
							anIntArray353[anInt5241++] = 0;
							return;
						}
						anIntArray353[anInt5241++] = Static450.aClass41ArrayArray2[local157][local192].anInt1676;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt5241 -= 3;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						local89 = anIntArray353[anInt5241 + 2];
						Static92.method1556(1, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6708) {
						anInt5241 -= 3;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						local89 = anIntArray353[anInt5241 + 2];
						Static92.method1556(2, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6709) {
						anInt5241 -= 3;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						local89 = anIntArray353[anInt5241 + 2];
						Static92.method1556(3, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6710) {
						anInt5241 -= 3;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						local89 = anIntArray353[anInt5241 + 2];
						Static92.method1556(4, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6711) {
						anInt5241 -= 3;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						local89 = anIntArray353[anInt5241 + 2];
						Static92.method1556(5, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6712) {
						anInt5241 -= 3;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						local89 = anIntArray353[anInt5241 + 2];
						Static92.method1556(6, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6713) {
						anInt5241 -= 3;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						local89 = anIntArray353[anInt5241 + 2];
						Static92.method1556(7, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6714) {
						anInt5241 -= 3;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						local89 = anIntArray353[anInt5241 + 2];
						Static92.method1556(8, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6715) {
						anInt5241 -= 3;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						local89 = anIntArray353[anInt5241 + 2];
						Static92.method1556(9, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6716) {
						anInt5241 -= 3;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						local89 = anIntArray353[anInt5241 + 2];
						Static92.method1556(10, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6717) {
						anInt5241 -= 3;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						local89 = anIntArray353[anInt5241 + 2];
						@Pc(7346) Class41 local7346 = Static85.method2627(local157 << 16 | local192, local89);
						Static342.method4802();
						@Pc(7351) Class2_Sub15 local7351 = Static56.method1112(local7346);
						Static330.method4704(local7346, local7351.method1590(), local7351.anInt2149);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7379) Class83 local7379;
					if (arg0 == 6800) {
						local157 = anIntArray353[--anInt5241];
						local7379 = Static304.aClass173_4.method4022(local157);
						if (local7379.aString18 == null) {
							aStringArray27[anInt5243++] = "";
							return;
						}
						aStringArray27[anInt5243++] = local7379.aString18;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray353[--anInt5241];
						local7379 = Static304.aClass173_4.method4022(local157);
						anIntArray353[anInt5241++] = local7379.anInt2339;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray353[--anInt5241];
						local7379 = Static304.aClass173_4.method4022(local157);
						anIntArray353[anInt5241++] = local7379.anInt2312;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray353[--anInt5241];
						local7379 = Static304.aClass173_4.method4022(local157);
						anIntArray353[anInt5241++] = local7379.anInt2313;
						return;
					}
					if (arg0 == 6804) {
						anInt5241 -= 2;
						local157 = anIntArray353[anInt5241];
						local192 = anIntArray353[anInt5241 + 1];
						@Pc(7501) Class47 local7501 = Static150.aClass43_1.method1210(local192);
						if (local7501.method1271()) {
							aStringArray27[anInt5243++] = Static304.aClass173_4.method4022(local157).method1703(local192, local7501.aString14);
							return;
						}
						anIntArray353[anInt5241++] = Static304.aClass173_4.method4022(local157).method1706(local192, local7501.anInt1781);
						return;
					}
				}
			}
		}
		throw new IllegalStateException();
	}
}
