import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "[I")
	private static int[] anIntArray175;

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "Lclient!fi;")
	private static Class76 aClass76_7;

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray19;

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "Lclient!rk;")
	private static Class209 aClass209_1;

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "Lclient!fi;")
	private static Class76 aClass76_8;

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "[I")
	private static final int[] anIntArray176 = new int[5];

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
	private static int anInt3072 = 0;

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "[I")
	private static final int[] anIntArray177 = new int[1000];

	@OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
	private static int anInt3077 = 0;

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray20 = new String[1000];

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "[[I")
	private static final int[][] anIntArrayArray20 = new int[5][5000];

	@OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
	private static int anInt3079 = 0;

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "[Lclient!ac;")
	private static final Class4[] aClass4Array1 = new Class4[50];

	@OriginalMember(owner = "client!iq", name = "z", descriptor = "[I")
	private static final int[] anIntArray178 = new int[3];

	@OriginalMember(owner = "client!iq", name = "A", descriptor = "Lclient!d;")
	public static final Class44 aClass44_30 = new Class44(4);

	@OriginalMember(owner = "client!iq", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray21 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!iq", name = "C", descriptor = "I")
	private static int anInt3080 = 0;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method2468(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static189.anInt3178 == 0 && (Static408.aBoolean459 && !Static337.aBoolean377 || Static146.aBoolean172)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static1.aClass198_77.method4012(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static1.aClass198_77.method4012(0).length());
		} else if (local11.startsWith(Static232.aClass198_65.method4012(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static232.aClass198_65.method4012(0).length());
		} else if (local11.startsWith(Static17.aClass198_5.method4012(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static17.aClass198_5.method4012(0).length());
		} else if (local11.startsWith(Static53.aClass198_16.method4012(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static53.aClass198_16.method4012(0).length());
		} else if (local11.startsWith(Static427.aClass198_119.method4012(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static427.aClass198_119.method4012(0).length());
		} else if (local11.startsWith(Static273.aClass198_73.method4012(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static273.aClass198_73.method4012(0).length());
		} else if (local11.startsWith(Static93.aClass198_26.method4012(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static93.aClass198_26.method4012(0).length());
		} else if (local11.startsWith(Static302.aClass198_84.method4012(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static302.aClass198_84.method4012(0).length());
		} else if (local11.startsWith(Static429.aClass198_120.method4012(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static429.aClass198_120.method4012(0).length());
		} else if (local11.startsWith(Static70.aClass198_20.method4012(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static70.aClass198_20.method4012(0).length());
		} else if (local11.startsWith(Static215.aClass198_57.method4012(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static215.aClass198_57.method4012(0).length());
		} else if (local11.startsWith(Static314.aClass198_90.method4012(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static314.aClass198_90.method4012(0).length());
		} else if (Static38.anInt4834 != 0) {
			if (local11.startsWith(Static1.aClass198_77.method4012(Static38.anInt4834))) {
				local13 = 0;
				arg0 = arg0.substring(Static1.aClass198_77.method4012(Static38.anInt4834).length());
			} else if (local11.startsWith(Static232.aClass198_65.method4012(Static38.anInt4834))) {
				local13 = 1;
				arg0 = arg0.substring(Static232.aClass198_65.method4012(Static38.anInt4834).length());
			} else if (local11.startsWith(Static17.aClass198_5.method4012(Static38.anInt4834))) {
				local13 = 2;
				arg0 = arg0.substring(Static17.aClass198_5.method4012(Static38.anInt4834).length());
			} else if (local11.startsWith(Static53.aClass198_16.method4012(Static38.anInt4834))) {
				local13 = 3;
				arg0 = arg0.substring(Static53.aClass198_16.method4012(Static38.anInt4834).length());
			} else if (local11.startsWith(Static427.aClass198_119.method4012(Static38.anInt4834))) {
				local13 = 4;
				arg0 = arg0.substring(Static427.aClass198_119.method4012(Static38.anInt4834).length());
			} else if (local11.startsWith(Static273.aClass198_73.method4012(Static38.anInt4834))) {
				local13 = 5;
				arg0 = arg0.substring(Static273.aClass198_73.method4012(Static38.anInt4834).length());
			} else if (local11.startsWith(Static93.aClass198_26.method4012(Static38.anInt4834))) {
				local13 = 6;
				arg0 = arg0.substring(Static93.aClass198_26.method4012(Static38.anInt4834).length());
			} else if (local11.startsWith(Static302.aClass198_84.method4012(Static38.anInt4834))) {
				local13 = 7;
				arg0 = arg0.substring(Static302.aClass198_84.method4012(Static38.anInt4834).length());
			} else if (local11.startsWith(Static429.aClass198_120.method4012(Static38.anInt4834))) {
				local13 = 8;
				arg0 = arg0.substring(Static429.aClass198_120.method4012(Static38.anInt4834).length());
			} else if (local11.startsWith(Static70.aClass198_20.method4012(Static38.anInt4834))) {
				local13 = 9;
				arg0 = arg0.substring(Static70.aClass198_20.method4012(Static38.anInt4834).length());
			} else if (local11.startsWith(Static215.aClass198_57.method4012(Static38.anInt4834))) {
				local13 = 10;
				arg0 = arg0.substring(Static215.aClass198_57.method4012(Static38.anInt4834).length());
			} else if (local11.startsWith(Static314.aClass198_90.method4012(Static38.anInt4834))) {
				local13 = 11;
				arg0 = arg0.substring(Static314.aClass198_90.method4012(Static38.anInt4834).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static278.aClass198_74.method4012(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static278.aClass198_74.method4012(0).length());
		} else if (local11.startsWith(Static390.aClass198_109.method4012(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static390.aClass198_109.method4012(0).length());
		} else if (local11.startsWith(Static267.aClass198_81.method4012(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static267.aClass198_81.method4012(0).length());
		} else if (local11.startsWith(Static404.aClass198_112.method4012(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static404.aClass198_112.method4012(0).length());
		} else if (local11.startsWith(Static113.aClass198_28.method4012(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static113.aClass198_28.method4012(0).length());
		} else if (Static38.anInt4834 != 0) {
			if (local11.startsWith(Static278.aClass198_74.method4012(Static38.anInt4834))) {
				local451 = 1;
				arg0 = arg0.substring(Static278.aClass198_74.method4012(Static38.anInt4834).length());
			} else if (local11.startsWith(Static390.aClass198_109.method4012(Static38.anInt4834))) {
				local451 = 2;
				arg0 = arg0.substring(Static390.aClass198_109.method4012(Static38.anInt4834).length());
			} else if (local11.startsWith(Static267.aClass198_81.method4012(Static38.anInt4834))) {
				local451 = 3;
				arg0 = arg0.substring(Static267.aClass198_81.method4012(Static38.anInt4834).length());
			} else if (local11.startsWith(Static404.aClass198_112.method4012(Static38.anInt4834))) {
				local451 = 4;
				arg0 = arg0.substring(Static404.aClass198_112.method4012(Static38.anInt4834).length());
			} else if (local11.startsWith(Static113.aClass198_28.method4012(Static38.anInt4834))) {
				local451 = 5;
				arg0 = arg0.substring(Static113.aClass198_28.method4012(Static38.anInt4834).length());
			}
		}
		Static288.method3576(Static322.aClass194_88);
		Static281.aClass5_Sub15_Sub2_13.method5583(0);
		@Pc(646) int local646 = Static281.aClass5_Sub15_Sub2_13.anInt7013;
		if (arg1 == 5021) {
			Static281.aClass5_Sub15_Sub2_13.method5583(1);
		} else if (arg1 == 5022) {
			Static281.aClass5_Sub15_Sub2_13.method5583(2);
		} else {
			Static281.aClass5_Sub15_Sub2_13.method5583(0);
		}
		Static281.aClass5_Sub15_Sub2_13.method5583(local13);
		Static281.aClass5_Sub15_Sub2_13.method5583(local451);
		Static401.method1728(Static281.aClass5_Sub15_Sub2_13, arg0);
		Static281.aClass5_Sub15_Sub2_13.method5556(Static281.aClass5_Sub15_Sub2_13.anInt7013 - local646);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!eg;II)V")
	public static void method2469(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class5_Sub2_Sub17 local5 = Static237.method5372(arg2, arg0, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray175 = new int[local5.anInt6495];
		aStringArray19 = new String[local5.anInt6490];
		if (local5.aClass60_9 == Static213.aClass60_5 || local5.aClass60_9 == Static226.aClass60_6 || local5.aClass60_9 == Static99.aClass60_4) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static22.aClass76_2 != null) {
				local30 = Static22.aClass76_2.anInt2126;
				local32 = Static22.aClass76_2.anInt2079;
			}
			anIntArray175[0] = Static290.aClass66_1.method5965() - local30;
			anIntArray175[1] = Static290.aClass66_1.method5974() - local32;
		}
		method2479(local5, 200000);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!qr;)V")
	public static void method2470(@OriginalArg(0) Class5_Sub33 arg0) {
		method2481(arg0, 200000);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
	private static void method2471(@OriginalArg(0) int arg0) {
		@Pc(3) Class76 local3 = Static213.method2817(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class76[] local13 = Static184.aClass76ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class76[] local19 = Static34.aClass76ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static184.aClass76ArrayArray2[local9] = new Class76[local22];
			Static468.method3860(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static468.method3860(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method2472(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray21[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "()V")
	public static void method2473() {
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V")
	public static void method2474(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static305.method3794(arg0)) {
			return;
		}
		@Pc(12) Class76[] local12 = Static34.aClass76ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class76 local19 = local12[local14];
			if (local19.anObjectArray1 != null) {
				@Pc(26) Class5_Sub33 local26 = new Class5_Sub33();
				local26.aClass76_12 = local19;
				local26.anObjectArray35 = local19.anObjectArray1;
				method2481(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)V")
	private static void method2476(@OriginalArg(0) int arg0) {
		@Pc(3) Class76 local3 = Static213.method2817(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class76[] local13 = Static184.aClass76ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class76[] local19 = Static34.aClass76ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static184.aClass76ArrayArray2[local9] = new Class76[local22];
			Static468.method3860(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static468.method3860(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IZ)V")
	private static void method2477(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray177[anInt3072++] = Static17.anInt358;
				return;
			}
			if (arg0 == 5001) {
				anInt3072 -= 3;
				Static17.anInt358 = anIntArray177[anInt3072];
				Static163.aClass212_1 = Static196.method2624(anIntArray177[anInt3072 + 1]);
				if (Static163.aClass212_1 == null) {
					Static163.aClass212_1 = Static435.aClass212_4;
				}
				Static379.anInt4394 = anIntArray177[anInt3072 + 2];
				Static288.method3576(Static298.aClass194_82);
				Static281.aClass5_Sub15_Sub2_13.method5583(Static17.anInt358);
				Static281.aClass5_Sub15_Sub2_13.method5583(Static163.aClass212_1.anInt5877);
				Static281.aClass5_Sub15_Sub2_13.method5583(Static379.anInt4394);
				return;
			}
			if (arg0 == 5002) {
				anInt3077 -= 2;
				local75 = aStringArray20[anInt3077];
				local81 = aStringArray20[anInt3077 + 1];
				anInt3072 -= 2;
				local89 = anIntArray177[anInt3072];
				local95 = anIntArray177[anInt3072 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static288.method3576(Static163.aClass194_43);
				Static281.aClass5_Sub15_Sub2_13.method5583(Static21.method357(local75) + Static21.method357(local81) + 2);
				Static281.aClass5_Sub15_Sub2_13.method5545(local75);
				Static281.aClass5_Sub15_Sub2_13.method5583(local89 - 1);
				Static281.aClass5_Sub15_Sub2_13.method5583(local95);
				Static281.aClass5_Sub15_Sub2_13.method5545(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray177[--anInt3072];
				local81 = null;
				if (local157 < 100) {
					local81 = Static366.aStringArray42[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray20[anInt3077++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray177[--anInt3072];
				local192 = -1;
				if (local157 < 100 && Static366.aStringArray42[local157] != null) {
					local192 = Static243.anIntArray251[local157];
				}
				anIntArray177[anInt3072++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static163.aClass212_1 == null) {
					anIntArray177[anInt3072++] = -1;
					return;
				}
				anIntArray177[anInt3072++] = Static163.aClass212_1.anInt5877;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray20[--anInt3077];
				method2468(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3077 -= 2;
				local75 = aStringArray20[anInt3077];
				local81 = aStringArray20[anInt3077 + 1];
				if (Static189.anInt3178 != 0 || (!Static408.aBoolean459 || Static337.aBoolean377) && !Static146.aBoolean172) {
					Static288.method3576(Static115.aClass194_27);
					Static281.aClass5_Sub15_Sub2_13.method5583(0);
					local89 = Static281.aClass5_Sub15_Sub2_13.anInt7013;
					Static281.aClass5_Sub15_Sub2_13.method5545(local75);
					Static401.method1728(Static281.aClass5_Sub15_Sub2_13, local81);
					Static281.aClass5_Sub15_Sub2_13.method5556(Static281.aClass5_Sub15_Sub2_13.anInt7013 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray177[--anInt3072];
				local81 = null;
				if (local157 < 100) {
					local81 = Static338.aStringArray37[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray20[anInt3077++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray177[--anInt3072];
				local81 = null;
				if (local157 < 100) {
					local81 = Static265.aStringArray32[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray20[anInt3077++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray177[--anInt3072];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static127.anIntArray124[local157];
				}
				anIntArray177[anInt3072++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static220.aClass2_Sub1_Sub3_Sub2_1 == null || Static220.aClass2_Sub1_Sub3_Sub2_1.aString66 == null) {
					local75 = Static342.aString60;
				} else {
					local75 = Static220.aClass2_Sub1_Sub3_Sub2_1.method4927();
				}
				aStringArray20[anInt3077++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray177[anInt3072++] = Static379.anInt4394;
				return;
			}
			if (arg0 == 5017) {
				anIntArray177[anInt3072++] = Static310.anInt4816;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray177[--anInt3072];
				local192 = 0;
				if (local157 < 100 && Static366.aStringArray42[local157] != null) {
					local192 = Static178.anIntArray404[local157];
				}
				anIntArray177[anInt3072++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray177[--anInt3072];
				local81 = null;
				if (local157 < 100) {
					local81 = Static229.aStringArray28[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray20[anInt3077++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static220.aClass2_Sub1_Sub3_Sub2_1 == null || Static220.aClass2_Sub1_Sub3_Sub2_1.aString66 == null) {
					local75 = Static342.aString60;
				} else {
					local75 = Static220.aClass2_Sub1_Sub3_Sub2_1.method4922();
				}
				aStringArray20[anInt3077++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray177[--anInt3072];
				aStringArray20[anInt3077++] = Static414.aClass223_1.method4932(local157).aString31;
				return;
			}
			@Pc(589) Class5_Sub2_Sub8 local589;
			if (arg0 == 5051) {
				local157 = anIntArray177[--anInt3072];
				local589 = Static414.aClass223_1.method4932(local157);
				if (local589.anIntArray153 == null) {
					anIntArray177[anInt3072++] = 0;
					return;
				}
				anIntArray177[anInt3072++] = local589.anIntArray153.length;
				return;
			}
			if (arg0 == 5052) {
				anInt3072 -= 2;
				local157 = anIntArray177[anInt3072];
				local192 = anIntArray177[anInt3072 + 1];
				@Pc(634) Class5_Sub2_Sub8 local634 = Static414.aClass223_1.method4932(local157);
				local95 = local634.anIntArray153[local192];
				anIntArray177[anInt3072++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray177[--anInt3072];
				local589 = Static414.aClass223_1.method4932(local157);
				if (local589.anIntArray152 == null) {
					anIntArray177[anInt3072++] = 0;
					return;
				}
				anIntArray177[anInt3072++] = local589.anIntArray152.length;
				return;
			}
			if (arg0 == 5054) {
				anInt3072 -= 2;
				local157 = anIntArray177[anInt3072];
				local192 = anIntArray177[anInt3072 + 1];
				anIntArray177[anInt3072++] = Static414.aClass223_1.method4932(local157).anIntArray152[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray177[--anInt3072];
				aStringArray20[anInt3077++] = Static407.aClass20_2.method458(local157).method4702();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray177[--anInt3072];
				@Pc(760) Class5_Sub2_Sub15 local760 = Static407.aClass20_2.method458(local157);
				if (local760.anIntArray421 == null) {
					anIntArray177[anInt3072++] = 0;
					return;
				}
				anIntArray177[anInt3072++] = local760.anIntArray421.length;
				return;
			}
			if (arg0 == 5057) {
				anInt3072 -= 2;
				local157 = anIntArray177[anInt3072];
				local192 = anIntArray177[anInt3072 + 1];
				anIntArray177[anInt3072++] = Static407.aClass20_2.method458(local157).anIntArray421[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass209_1 = new Class209();
				aClass209_1.anInt5847 = anIntArray177[--anInt3072];
				aClass209_1.aClass5_Sub2_Sub15_1 = Static407.aClass20_2.method458(aClass209_1.anInt5847);
				aClass209_1.anIntArray406 = new int[aClass209_1.aClass5_Sub2_Sub15_1.method4704()];
				return;
			}
			if (arg0 == 5059) {
				Static288.method3576(Static421.aClass194_115);
				Static281.aClass5_Sub15_Sub2_13.method5583(0);
				local157 = Static281.aClass5_Sub15_Sub2_13.anInt7013;
				Static281.aClass5_Sub15_Sub2_13.method5583(0);
				Static281.aClass5_Sub15_Sub2_13.method5566(aClass209_1.anInt5847);
				aClass209_1.aClass5_Sub2_Sub15_1.method4697(Static281.aClass5_Sub15_Sub2_13, aClass209_1.anIntArray406);
				Static281.aClass5_Sub15_Sub2_13.method5556(Static281.aClass5_Sub15_Sub2_13.anInt7013 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray20[--anInt3077];
				Static288.method3576(Static380.aClass194_104);
				Static281.aClass5_Sub15_Sub2_13.method5583(0);
				local192 = Static281.aClass5_Sub15_Sub2_13.anInt7013;
				Static281.aClass5_Sub15_Sub2_13.method5545(local75);
				Static281.aClass5_Sub15_Sub2_13.method5566(aClass209_1.anInt5847);
				aClass209_1.aClass5_Sub2_Sub15_1.method4697(Static281.aClass5_Sub15_Sub2_13, aClass209_1.anIntArray406);
				Static281.aClass5_Sub15_Sub2_13.method5556(Static281.aClass5_Sub15_Sub2_13.anInt7013 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static288.method3576(Static421.aClass194_115);
				Static281.aClass5_Sub15_Sub2_13.method5583(0);
				local157 = Static281.aClass5_Sub15_Sub2_13.anInt7013;
				Static281.aClass5_Sub15_Sub2_13.method5583(1);
				Static281.aClass5_Sub15_Sub2_13.method5566(aClass209_1.anInt5847);
				aClass209_1.aClass5_Sub2_Sub15_1.method4697(Static281.aClass5_Sub15_Sub2_13, aClass209_1.anIntArray406);
				Static281.aClass5_Sub15_Sub2_13.method5556(Static281.aClass5_Sub15_Sub2_13.anInt7013 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt3072 -= 2;
				local157 = anIntArray177[anInt3072];
				local192 = anIntArray177[anInt3072 + 1];
				anIntArray177[anInt3072++] = Static414.aClass223_1.method4932(local157).aCharArray3[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt3072 -= 2;
				local157 = anIntArray177[anInt3072];
				local192 = anIntArray177[anInt3072 + 1];
				anIntArray177[anInt3072++] = Static414.aClass223_1.method4932(local157).aCharArray4[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt3072 -= 2;
				local157 = anIntArray177[anInt3072];
				local192 = anIntArray177[anInt3072 + 1];
				if (local192 == -1) {
					anIntArray177[anInt3072++] = -1;
					return;
				}
				anIntArray177[anInt3072++] = Static414.aClass223_1.method4932(local157).method2320((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt3072 -= 2;
				local157 = anIntArray177[anInt3072];
				local192 = anIntArray177[anInt3072 + 1];
				if (local192 == -1) {
					anIntArray177[anInt3072++] = -1;
					return;
				}
				anIntArray177[anInt3072++] = Static414.aClass223_1.method4932(local157).method2318((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray177[--anInt3072];
				anIntArray177[anInt3072++] = Static407.aClass20_2.method458(local157).method4704();
				return;
			}
			if (arg0 == 5067) {
				anInt3072 -= 2;
				local157 = anIntArray177[anInt3072];
				local192 = anIntArray177[anInt3072 + 1];
				local89 = Static407.aClass20_2.method458(local157).method4701(local192).anInt5969;
				anIntArray177[anInt3072++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt3072 -= 2;
				local157 = anIntArray177[anInt3072];
				local192 = anIntArray177[anInt3072 + 1];
				aClass209_1.anIntArray406[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt3072 -= 2;
				local157 = anIntArray177[anInt3072];
				local192 = anIntArray177[anInt3072 + 1];
				aClass209_1.anIntArray406[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt3072 -= 3;
				local157 = anIntArray177[anInt3072];
				local192 = anIntArray177[anInt3072 + 1];
				local89 = anIntArray177[anInt3072 + 2];
				@Pc(1265) Class5_Sub2_Sub15 local1265 = Static407.aClass20_2.method458(local157);
				if (local1265.method4701(local192).anInt5969 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray177[anInt3072++] = local1265.method4700(local192, local89);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray20[--anInt3077];
				local1313 = anIntArray177[--anInt3072] == 1;
				Static357.method4635(local75, local1313);
				anIntArray177[anInt3072++] = Static52.anInt930;
				return;
			}
			if (arg0 == 5072) {
				if (Static244.aShortArray63 != null && Static15.anInt343 < Static52.anInt930) {
					anIntArray177[anInt3072++] = Static244.aShortArray63[Static15.anInt343++] & 0xFFFF;
					return;
				}
				anIntArray177[anInt3072++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static15.anInt343 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static288.method3576(Static421.aClass194_115);
				Static281.aClass5_Sub15_Sub2_13.method5583(0);
				local157 = Static281.aClass5_Sub15_Sub2_13.anInt7013;
				Static281.aClass5_Sub15_Sub2_13.method5583(2);
				Static281.aClass5_Sub15_Sub2_13.method5566(aClass209_1.anInt5847);
				aClass209_1.aClass5_Sub2_Sub15_1.method4697(Static281.aClass5_Sub15_Sub2_13, aClass209_1.anIntArray406);
				Static281.aClass5_Sub15_Sub2_13.method5556(Static281.aClass5_Sub15_Sub2_13.anInt7013 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static188.aClass80_1.method1723(86)) {
					anIntArray177[anInt3072++] = 1;
					return;
				}
				anIntArray177[anInt3072++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static188.aClass80_1.method1723(82)) {
					anIntArray177[anInt3072++] = 1;
					return;
				}
				anIntArray177[anInt3072++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static188.aClass80_1.method1723(81)) {
					anIntArray177[anInt3072++] = 1;
					return;
				}
				anIntArray177[anInt3072++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static154.method5153(anIntArray177[--anInt3072]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray177[anInt3072++] = Static246.method3170();
					return;
				}
				if (arg0 == 5205) {
					Static209.method2790(false, anIntArray177[--anInt3072], -1, -1);
					return;
				}
				@Pc(1554) Class5_Sub2_Sub18 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray177[--anInt3072];
					local1554 = Static98.method2664(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray177[anInt3072++] = -1;
						return;
					}
					anIntArray177[anInt3072++] = local1554.anInt7491;
					return;
				}
				@Pc(1587) Class5_Sub2_Sub18 local1587;
				if (arg0 == 5207) {
					local1587 = Static98.method2677(anIntArray177[--anInt3072]);
					if (local1587 != null && local1587.aString76 != null) {
						aStringArray20[anInt3077++] = local1587.aString76;
						return;
					}
					aStringArray20[anInt3077++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray177[anInt3072++] = Static387.anInt6381;
					anIntArray177[anInt3072++] = Static37.anInt728;
					return;
				}
				if (arg0 == 5209) {
					anIntArray177[anInt3072++] = Static282.anInt4369 + Static98.anInt3332;
					anIntArray177[anInt3072++] = Static110.anInt1841 + Static98.anInt3328;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray177[--anInt3072];
					local1554 = Static98.method2677(local157);
					if (local1554 == null) {
						anIntArray177[anInt3072++] = 0;
						anIntArray177[anInt3072++] = 0;
						return;
					}
					anIntArray177[anInt3072++] = local1554.anInt7482 >> 14 & 0x3FFF;
					anIntArray177[anInt3072++] = local1554.anInt7482 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray177[--anInt3072];
					local1554 = Static98.method2677(local157);
					if (local1554 == null) {
						anIntArray177[anInt3072++] = 0;
						anIntArray177[anInt3072++] = 0;
						return;
					}
					anIntArray177[anInt3072++] = local1554.anInt7484 - local1554.anInt7489;
					anIntArray177[anInt3072++] = local1554.anInt7483 - local1554.anInt7485;
					return;
				}
				@Pc(1777) Class5_Sub8 local1777;
				if (arg0 == 5212) {
					local1777 = Static286.method3546();
					if (local1777 == null) {
						anIntArray177[anInt3072++] = -1;
						anIntArray177[anInt3072++] = -1;
						return;
					}
					anIntArray177[anInt3072++] = local1777.anInt953;
					local192 = local1777.anInt946 << 28 | local1777.anInt948 + Static98.anInt3332 << 14 | local1777.anInt943 + Static98.anInt3328;
					anIntArray177[anInt3072++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static127.method1774();
					if (local1777 == null) {
						anIntArray177[anInt3072++] = -1;
						anIntArray177[anInt3072++] = -1;
						return;
					}
					anIntArray177[anInt3072++] = local1777.anInt953;
					local192 = local1777.anInt946 << 28 | local1777.anInt948 + Static98.anInt3332 << 14 | local1777.anInt943 + Static98.anInt3328;
					anIntArray177[anInt3072++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray177[--anInt3072];
					local1554 = Static226.method2983();
					if (local1554 != null) {
						local1925 = local1554.method6013(local157 >> 28 & 0x3, local157 & 0x3FFF, anIntArray178, local157 >> 14 & 0x3FFF);
						if (local1925) {
							Static357.method4633(anIntArray178[2], anIntArray178[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt3072 -= 2;
					local157 = anIntArray177[anInt3072];
					local192 = anIntArray177[anInt3072 + 1];
					@Pc(1963) Class123 local1963 = Static98.method2680(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class5_Sub2_Sub18 local1970 = (Class5_Sub2_Sub18) local1963.method2616(); local1970 != null; local1970 = (Class5_Sub2_Sub18) local1963.method2618()) {
						if (local1970.anInt7491 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray177[anInt3072++] = 1;
						return;
					}
					anIntArray177[anInt3072++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray177[--anInt3072];
					local1554 = Static98.method2677(local157);
					if (local1554 == null) {
						anIntArray177[anInt3072++] = -1;
						return;
					}
					anIntArray177[anInt3072++] = local1554.anInt7490;
					return;
				}
				if (arg0 == 5220) {
					anIntArray177[anInt3072++] = Static35.anInt4183 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray177[--anInt3072];
					Static357.method4633(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static226.method2983();
					if (local1587 != null) {
						local1313 = local1587.method6014(Static282.anInt4369 + Static98.anInt3332, anIntArray178, Static110.anInt1841 + Static98.anInt3328);
						if (local1313) {
							anIntArray177[anInt3072++] = anIntArray178[1];
							anIntArray177[anInt3072++] = anIntArray178[2];
							return;
						}
						anIntArray177[anInt3072++] = -1;
						anIntArray177[anInt3072++] = -1;
						return;
					}
					anIntArray177[anInt3072++] = -1;
					anIntArray177[anInt3072++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt3072 -= 2;
					local157 = anIntArray177[anInt3072];
					local192 = anIntArray177[anInt3072 + 1];
					Static209.method2790(false, local157, local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray177[--anInt3072];
					local1554 = Static226.method2983();
					if (local1554 != null) {
						local1925 = local1554.method6013(local157 >> 28 & 0x3, local157 & 0x3FFF, anIntArray178, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray177[anInt3072++] = anIntArray178[1];
							anIntArray177[anInt3072++] = anIntArray178[2];
							return;
						}
						anIntArray177[anInt3072++] = -1;
						anIntArray177[anInt3072++] = -1;
						return;
					}
					anIntArray177[anInt3072++] = -1;
					anIntArray177[anInt3072++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray177[--anInt3072];
					local1554 = Static226.method2983();
					if (local1554 != null) {
						local1925 = local1554.method6014(local157 >> 14 & 0x3FFF, anIntArray178, local157 & 0x3FFF);
						if (local1925) {
							anIntArray177[anInt3072++] = anIntArray178[1];
							anIntArray177[anInt3072++] = anIntArray178[2];
							return;
						}
						anIntArray177[anInt3072++] = -1;
						anIntArray177[anInt3072++] = -1;
						return;
					}
					anIntArray177[anInt3072++] = -1;
					anIntArray177[anInt3072++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static24.method421(anIntArray177[--anInt3072]);
					return;
				}
				if (arg0 == 5227) {
					anInt3072 -= 2;
					local157 = anIntArray177[anInt3072];
					local192 = anIntArray177[anInt3072 + 1];
					Static209.method2790(true, local157, local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static368.aBoolean401 = anIntArray177[--anInt3072] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray177[anInt3072++] = Static368.aBoolean401 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray177[--anInt3072];
					Static379.method3488(local157);
					return;
				}
				@Pc(2483) Class5 local2483;
				if (arg0 == 5231) {
					anInt3072 -= 2;
					local157 = anIntArray177[anInt3072];
					local1313 = anIntArray177[anInt3072 + 1] == 1;
					if (Static49.aClass252_4 != null) {
						local2483 = Static49.aClass252_4.method5659((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6003();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class5();
							Static49.aClass252_4.method5658(local2483, (long) local157);
						}
					}
					return;
				}
				@Pc(2525) Class5 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray177[--anInt3072];
					if (Static49.aClass252_4 != null) {
						local2525 = Static49.aClass252_4.method5659((long) local157);
						anIntArray177[anInt3072++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray177[anInt3072++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt3072 -= 2;
					local157 = anIntArray177[anInt3072];
					local1313 = anIntArray177[anInt3072 + 1] == 1;
					if (Static96.aClass252_11 != null) {
						local2483 = Static96.aClass252_11.method5659((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6003();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class5();
							Static96.aClass252_11.method5658(local2483, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray177[--anInt3072];
					if (Static96.aClass252_11 != null) {
						local2525 = Static96.aClass252_11.method5659((long) local157);
						anIntArray177[anInt3072++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray177[anInt3072++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray177[anInt3072++] = Static98.aClass5_Sub2_Sub18_4 == null ? -1 : Static98.aClass5_Sub2_Sub18_4.anInt7491;
					return;
				}
				if (arg0 == 5236) {
					anInt3072 -= 2;
					local157 = anIntArray177[anInt3072];
					local192 = anIntArray177[anInt3072 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static365.method4720(local157, local95, local89);
					if (local2691 < 0) {
						anIntArray177[anInt3072++] = -1;
						return;
					}
					anIntArray177[anInt3072++] = local2691;
					return;
				}
				if (arg0 == 5237) {
					Static11.method163();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt3072 -= 2;
					local157 = anIntArray177[anInt3072];
					local192 = anIntArray177[anInt3072 + 1];
					Static449.method5909(3, false, local157, local192);
					anIntArray177[anInt3072++] = Static317.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static317.aFrame2 != null) {
						Static449.method5909(Static216.aClass1_Sub1_1.anInt4516, false, -1, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2775) Class146[] local2775 = Static20.method335();
					anIntArray177[anInt3072++] = local2775.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray177[--anInt3072];
					@Pc(2799) Class146[] local2799 = Static20.method335();
					anIntArray177[anInt3072++] = local2799[local157].anInt3802;
					anIntArray177[anInt3072++] = local2799[local157].anInt3803;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static216.aClass1_Sub1_1.anInt4506;
					local192 = Static216.aClass1_Sub1_1.anInt4508;
					local89 = -1;
					@Pc(2836) Class146[] local2836 = Static20.method335();
					for (local2691 = 0; local2691 < local2836.length; local2691++) {
						@Pc(2843) Class146 local2843 = local2836[local2691];
						if (local2843.anInt3802 == local157 && local2843.anInt3803 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray177[anInt3072++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray177[anInt3072++] = Static213.method2819();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray177[--anInt3072];
					if (local157 >= 1 && local157 <= 2) {
						Static449.method5909(local157, false, -1, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.anInt4516;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray177[--anInt3072];
					if (local157 >= 1 && local157 <= 2) {
						Static216.aClass1_Sub1_1.anInt4516 = local157;
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						return;
					}
					return;
				}
			} else {
				@Pc(3351) String local3351;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt3077 -= 2;
						local75 = aStringArray20[anInt3077];
						local81 = aStringArray20[anInt3077 + 1];
						local89 = anIntArray177[--anInt3072];
						Static288.method3576(Static108.aClass194_25);
						Static281.aClass5_Sub15_Sub2_13.method5583(Static21.method357(local75) + Static21.method357(local81) + 1);
						Static281.aClass5_Sub15_Sub2_13.method5545(local75);
						Static281.aClass5_Sub15_Sub2_13.method5545(local81);
						Static281.aClass5_Sub15_Sub2_13.method5583(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt3072 -= 2;
						Static109.aShortArray15[anIntArray177[anInt3072]] = (short) Static313.method4880(anIntArray177[anInt3072 + 1]);
						Static306.aClass67_3.method1456();
						Static306.aClass67_3.method1448();
						Static196.aClass180_1.method3718();
						Static251.method3223();
						return;
					}
					if (arg0 == 5405) {
						anInt3072 -= 2;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static222.anIntArrayArrayArray10[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt3072 -= 7;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1] << 1;
						local89 = anIntArray177[anInt3072 + 2];
						local95 = anIntArray177[anInt3072 + 3];
						local2691 = anIntArray177[anInt3072 + 4];
						@Pc(3111) int local3111 = anIntArray177[anInt3072 + 5];
						@Pc(3117) int local3117 = anIntArray177[anInt3072 + 6];
						if (local157 >= 0 && local157 < 2 && Static222.anIntArrayArrayArray10[local157] != null && local192 >= 0 && local192 < Static222.anIntArrayArrayArray10[local157].length) {
							Static222.anIntArrayArrayArray10[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3117 };
							Static222.anIntArrayArrayArray10[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3111, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static222.anIntArrayArrayArray10[anIntArray177[--anInt3072]].length >> 1;
						anIntArray177[anInt3072++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static317.aFrame2 != null) {
							Static449.method5909(Static216.aClass1_Sub1_1.anInt4516, false, -1, -1);
						}
						if (Static34.aFrame1 != null) {
							Static299.method3711();
							System.exit(0);
							return;
						}
						local75 = Static139.aString22 == null ? Static21.method354() : Static139.aString22;
						Static50.method798(local75, Static7.aClass93_1, false, Static146.anInt2644 == 1);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static22.aClass268_1 != null) {
							if (Static22.aClass268_1.anObject10 == null) {
								local75 = Static286.method3550(Static22.aClass268_1.anInt7419);
							} else {
								local75 = (String) Static22.aClass268_1.anObject10;
							}
						}
						aStringArray20[anInt3077++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray177[anInt3072++] = Static144.anInt2596 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static317.aFrame2 != null) {
							Static449.method5909(Static216.aClass1_Sub1_1.anInt4516, false, -1, -1);
						}
						local75 = aStringArray20[--anInt3077];
						local1313 = anIntArray177[--anInt3072] == 1;
						local3351 = Static21.method354() + local75;
						Static50.method798(local3351, Static7.aClass93_1, local1313, Static146.anInt2644 == 1);
						return;
					}
					if (arg0 == 5422) {
						anInt3077 -= 2;
						local75 = aStringArray20[anInt3077];
						local81 = aStringArray20[anInt3077 + 1];
						local89 = anIntArray177[--anInt3072];
						if (local75.length() > 0) {
							if (Static341.aStringArray39 == null) {
								Static341.aStringArray39 = new String[Static6.anIntArray6[Static217.aClass197_2.anInt5079]];
							}
							Static341.aStringArray39[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static190.aStringArray22 == null) {
								Static190.aStringArray22 = new String[Static6.anIntArray6[Static217.aClass197_2.anInt5079]];
							}
							Static190.aStringArray22[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray20[--anInt3077]);
						return;
					}
					if (arg0 == 5424) {
						anInt3072 -= 11;
						Static426.anInt7124 = anIntArray177[anInt3072];
						Static219.anInt3645 = anIntArray177[anInt3072 + 1];
						Static157.anInt2734 = anIntArray177[anInt3072 + 2];
						Static445.anInt2588 = anIntArray177[anInt3072 + 3];
						Static250.anInt4071 = anIntArray177[anInt3072 + 4];
						Static249.anInt4039 = anIntArray177[anInt3072 + 5];
						Static76.anInt1391 = anIntArray177[anInt3072 + 6];
						Static429.anInt7148 = anIntArray177[anInt3072 + 7];
						Static423.anInt7083 = anIntArray177[anInt3072 + 8];
						Static371.anInt6076 = anIntArray177[anInt3072 + 9];
						Static424.anInt7115 = anIntArray177[anInt3072 + 10];
						Static344.aClass243_196.method5463(Static250.anInt4071);
						Static344.aClass243_196.method5463(Static249.anInt4039);
						Static344.aClass243_196.method5463(Static76.anInt1391);
						Static344.aClass243_196.method5463(Static429.anInt7148);
						Static344.aClass243_196.method5463(Static423.anInt7083);
						Static394.aClass49_23 = null;
						Static55.aClass49_4 = null;
						Static210.aClass49_16 = null;
						Static32.aClass49_2 = null;
						Static335.aClass49_20 = null;
						Static208.aClass49_15 = null;
						Static170.aClass49_14 = null;
						Static35.aClass49_17 = null;
						Static286.aBoolean295 = true;
						return;
					}
					if (arg0 == 5425) {
						Static109.method1497();
						Static286.aBoolean295 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt3072 -= 2;
						Static449.anInt7378 = anIntArray177[anInt3072];
						Static307.anInt4786 = anIntArray177[anInt3072 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt3072 -= 2;
						Static407.anInt6817 = anIntArray177[anInt3072 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt3072 -= 2;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						anIntArray177[anInt3072++] = Static288.method3577(local157, local192) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static106.method5682(false, aStringArray20[--anInt3077], false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static471.method4680("accountcreated", Static7.aClass93_1.anApplet1);
							return;
						} catch (@Pc(3646) Throwable local3646) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt3072 -= 4;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						local89 = anIntArray177[anInt3072 + 2];
						local95 = anIntArray177[anInt3072 + 3];
						Static115.method1593(local192, false, (local157 >> 14 & 0x3FFF) - Static31.anInt618, (local157 & 0x3FFF) - Static226.anInt3768, local89, local95);
						return;
					}
					if (arg0 == 5501) {
						anInt3072 -= 4;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						local89 = anIntArray177[anInt3072 + 2];
						local95 = anIntArray177[anInt3072 + 3];
						Static158.method2222(local192, (local157 & 0x3FFF) - Static226.anInt3768, local95, (local157 >> 14 & 0x3FFF) - Static31.anInt618, local89);
						return;
					}
					if (arg0 == 5502) {
						anInt3072 -= 6;
						local157 = anIntArray177[anInt3072];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static412.anInt6868 = local157;
						local192 = anIntArray177[anInt3072 + 1];
						if (local192 + 1 >= Static222.anIntArrayArrayArray10[Static412.anInt6868].length >> 1) {
							throw new RuntimeException();
						}
						Static398.anInt6493 = local192;
						Static401.anInt2162 = 0;
						Static152.anInt2701 = anIntArray177[anInt3072 + 2];
						Static156.anInt2708 = anIntArray177[anInt3072 + 3];
						local89 = anIntArray177[anInt3072 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static294.anInt4616 = local89;
						local95 = anIntArray177[anInt3072 + 5];
						if (local95 + 1 >= Static222.anIntArrayArrayArray10[Static294.anInt4616].length >> 1) {
							throw new RuntimeException();
						}
						Static15.anInt344 = local95;
						Static449.anInt7379 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static185.method2530();
						return;
					}
					if (arg0 == 5504) {
						anInt3072 -= 2;
						Static11.method170(anIntArray177[anInt3072 + 1], anIntArray177[anInt3072]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray177[anInt3072++] = (int) Static10.aFloat7 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray177[anInt3072++] = (int) Static99.aFloat33 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static271.method3660();
						return;
					}
					if (arg0 == 5508) {
						Static323.method3977();
						return;
					}
					if (arg0 == 5509) {
						Static335.method4340();
						return;
					}
					if (arg0 == 5510) {
						Static230.method5746();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray177[--anInt3072];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static31.anInt618;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static433.anInt7210) {
							local192 = Static433.anInt7210;
						}
						local89 -= Static226.anInt3768;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static418.anInt6969) {
							local89 = Static418.anInt6969;
						}
						Static423.anInt7090 = (local192 << 7) + 64;
						Static21.anInt449 = (local89 << 7) + 64;
						Static449.anInt7379 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static313.method4876();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt3077 -= 2;
						local75 = aStringArray20[anInt3077];
						local81 = aStringArray20[anInt3077 + 1];
						local89 = anIntArray177[--anInt3072];
						if (Static376.anInt6324 != 2) {
							return;
						}
						if (Static51.anInt913 == 0 && Static188.anInt3155 == 0) {
							Static342.aString60 = local75;
							Static390.aString67 = local81;
							Static93.anInt1623 = local89;
							Static407.method5394(5);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static279.method3467();
						return;
					}
					if (arg0 == 5602) {
						if (Static51.anInt913 == 0) {
							Static233.anInt3854 = -2;
							Static80.anInt1417 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt3072 -= 4;
						if (Static376.anInt6324 != 2) {
							return;
						}
						if (Static51.anInt913 == 0 && Static188.anInt3155 == 0) {
							Static85.method1258(anIntArray177[anInt3072 + 1], anIntArray177[anInt3072], anIntArray177[anInt3072 + 2], anIntArray177[anInt3072 + 3]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt3077--;
						if (Static376.anInt6324 != 2) {
							return;
						}
						if (Static51.anInt913 == 0 && Static188.anInt3155 == 0) {
							Static135.method1951(Static83.method1230(aStringArray20[anInt3077]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt3077 -= 2;
						if (Static376.anInt6324 != 2) {
							return;
						}
						if (Static51.anInt913 == 0 && Static188.anInt3155 == 0) {
							Static367.method4755(aStringArray20[anInt3077 + 1], Static83.method1230(aStringArray20[anInt3077]), false);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static188.anInt3155 == 0) {
							Static456.anInt7451 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray177[anInt3072++] = Static80.anInt1417;
						return;
					}
					if (arg0 == 5608) {
						anIntArray177[anInt3072++] = Static156.anInt2709;
						return;
					}
					if (arg0 == 5609) {
						anIntArray177[anInt3072++] = Static456.anInt7451;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray20[anInt3077++] = Static160.aStringArray17.length > local157 ? Static432.method5703(Static160.aStringArray17[local157]) : "";
						}
						Static160.aStringArray17 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray177[anInt3072++] = Static255.anInt4157;
						return;
					}
					if (arg0 == 5612) {
						local157 = anIntArray177[--anInt3072];
						if (Static376.anInt6324 != 6) {
							return;
						}
						if (Static51.anInt913 == 0 && Static188.anInt3155 == 0) {
							if (Static14.aClass99_2 != null) {
								Static14.aClass99_2.method4963();
								Static14.aClass99_2 = null;
							}
							Static93.anInt1623 = local157;
							Static407.method5394(8);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray177[anInt3072++] = Static80.anInt1417;
						return;
					}
					if (arg0 == 5615) {
						anInt3077 -= 2;
						local75 = aStringArray20[anInt3077];
						local81 = aStringArray20[anInt3077 + 1];
						if (Static376.anInt6324 != 2) {
							return;
						}
						if (Static51.anInt913 == 0 && Static188.anInt3155 == 0) {
							if (Static14.aClass99_2 != null) {
								Static14.aClass99_2.method4963();
								Static14.aClass99_2 = null;
							}
							Static342.aString60 = local75;
							Static390.aString67 = local81;
							Static407.method5394(4);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static165.method2317(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray177[anInt3072++] = Static233.anInt3854;
						return;
					}
					if (arg0 == 5618) {
						local157 = anIntArray177[--anInt3072];
						Static277.method3452(false, local157);
						return;
					}
					if (arg0 == 5619) {
						local157 = anIntArray177[--anInt3072];
						Static277.method3452(true, local157);
						return;
					}
					if (arg0 == 5620) {
						Static59.method949();
						if (Static294.aString53 != "" && Static294.aString53 != "") {
							anIntArray177[anInt3072++] = 1;
							return;
						}
						anIntArray177[anInt3072++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt3077 -= 2;
						if (Static376.anInt6324 != 2) {
							return;
						}
						if (Static51.anInt913 == 0 && Static188.anInt3155 == 0) {
							Static367.method4755(aStringArray20[anInt3077 + 1], Static83.method1230(aStringArray20[anInt3077]), true);
							return;
						}
						return;
					}
					if (arg0 == 5622) {
						@Pc(4436) Class268 local4436 = Static7.aClass93_1.method2100("3", false);
						while (local4436.anInt7420 == 0) {
							Static140.method2004(1L);
						}
						if (local4436.anInt7420 == 2) {
							throw new RuntimeException("Error opening file");
						}
						@Pc(4456) Class139 local4456 = (Class139) local4436.anObject10;
						if (local4456.method2901().exists()) {
							@Pc(4466) Class5_Sub15 local4466 = new Class5_Sub15(50);
							try {
								local4456.method2902(local4466.aByteArray93, 0, 50);
							} catch (@Pc(4475) IOException local4475) {
							}
						}
						try {
							local4456.method2897();
							return;
						} catch (@Pc(4481) Exception local4481) {
							return;
						}
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray177[--anInt3072];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static216.aClass1_Sub1_1.anInt4515 = local157;
						Static338.method4373();
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6002) {
						Static216.aClass1_Sub1_1.method3590(anIntArray177[--anInt3072] == 1);
						Static338.method4373();
						Static353.method4566();
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6003) {
						Static216.aClass1_Sub1_1.aBoolean310 = anIntArray177[--anInt3072] == 1;
						Static353.method4566();
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6005) {
						Static216.aClass1_Sub1_1.aBoolean300 = anIntArray177[--anInt3072] == 1;
						Static338.method4373();
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6006) {
						Static216.aClass1_Sub1_1.aBoolean314 = anIntArray177[--anInt3072] == 1;
						Static407.aClass200_9.method5819(!Static216.aClass1_Sub1_1.aBoolean314);
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6007) {
						Static216.aClass1_Sub1_1.anInt4501 = anIntArray177[--anInt3072];
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6008) {
						Static216.aClass1_Sub1_1.aBoolean308 = anIntArray177[--anInt3072] == 1;
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6009) {
						Static216.aClass1_Sub1_1.aBoolean311 = anIntArray177[--anInt3072] == 1;
						Static338.method4373();
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6010) {
						Static216.aClass1_Sub1_1.aBoolean303 = anIntArray177[--anInt3072] == 1;
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray177[--anInt3072];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static216.aClass1_Sub1_1.method3581(Static146.anInt2644, local157);
						Static338.method4373();
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6012) {
						Static216.aClass1_Sub1_1.method3583(anIntArray177[--anInt3072] == 1, Static146.anInt2644);
						Static287.method3551();
						Static454.method5952();
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6014) {
						Static216.aClass1_Sub1_1.aBoolean306 = anIntArray177[--anInt3072] == 1;
						Static338.method4373();
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6015) {
						Static216.aClass1_Sub1_1.aBoolean313 = anIntArray177[--anInt3072] == 1;
						Static338.method4373();
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray177[--anInt3072];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static216.aClass1_Sub1_1.anInt4518 = local157;
						Static243.method3143(Static146.anInt2644);
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						return;
					}
					if (arg0 == 6017) {
						Static216.aClass1_Sub1_1.aBoolean305 = anIntArray177[--anInt3072] == 1;
						Static12.method197();
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray177[--anInt3072];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static216.aClass1_Sub1_1.anInt4512 = local157;
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray177[--anInt3072];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static216.aClass1_Sub1_1.anInt4509) {
							if (Static216.aClass1_Sub1_1.anInt4509 == 0 && Static172.anInt3753 != -1) {
								Static124.method1752(Static172.anInt3753, local157, Static451.aClass243_252);
								Static180.aBoolean201 = false;
							} else if (local157 == 0) {
								Static434.method5734();
								Static180.aBoolean201 = false;
							} else {
								Static29.method462(local157);
							}
							Static216.aClass1_Sub1_1.anInt4509 = local157;
						}
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray177[--anInt3072];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static216.aClass1_Sub1_1.anInt4521 = local157;
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6021) {
						Static216.aClass1_Sub1_1.aBoolean315 = anIntArray177[--anInt3072] == 1;
						Static353.method4566();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray177[--anInt3072];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static102.anInt1724 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static353.method4571(local157);
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						anIntArray177[anInt3072++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray177[--anInt3072];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static216.aClass1_Sub1_1.anInt4503 = local157;
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray177[--anInt3072];
						if (local157 < 0 || local157 > Static163.method2301(Static102.anInt1724)) {
							local157 = 0;
						}
						Static216.aClass1_Sub1_1.anInt4510 = local157;
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray177[--anInt3072];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static13.method253(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static216.aClass1_Sub1_1.aBoolean301 = anIntArray177[--anInt3072] != 0;
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						return;
					}
					if (arg0 == 6029) {
						Static216.aClass1_Sub1_1.anInt4501 = anIntArray177[--anInt3072];
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						return;
					}
					if (arg0 == 6030) {
						Static216.aClass1_Sub1_1.aBoolean302 = anIntArray177[--anInt3072] != 0;
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static338.method4373();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray177[--anInt3072];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static243.method3143(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray177[--anInt3072];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static216.aClass1_Sub1_1.anInt4514 = local157;
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray177[--anInt3072];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static216.aClass1_Sub1_1.anInt4502 = local157;
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						return;
					}
					if (arg0 == 6034) {
						Static216.aClass1_Sub1_1.aBoolean312 = anIntArray177[--anInt3072] == 1;
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						Static287.method3551();
						Static81.aBoolean103 = false;
						return;
					}
					if (arg0 == 6035) {
						Static216.aClass1_Sub1_1.aBoolean316 = anIntArray177[--anInt3072] == 1;
						Static338.method4373();
						Static353.method4566();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.anInt4515;
						return;
					}
					if (arg0 == 6102) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.method3585(Static146.anInt2644) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.aBoolean310 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.aBoolean300 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.aBoolean314 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.anInt4501;
						return;
					}
					if (arg0 == 6108) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.aBoolean308 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.aBoolean311 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.aBoolean303 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.method3580(Static146.anInt2644);
						return;
					}
					if (arg0 == 6112) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.method3579(Static146.anInt2644) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.aBoolean306 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.aBoolean313 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.anInt4518;
						return;
					}
					if (arg0 == 6117) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.aBoolean305 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.anInt4512;
						return;
					}
					if (arg0 == 6119) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.anInt4509;
						return;
					}
					if (arg0 == 6120) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.anInt4521;
						return;
					}
					if (arg0 == 6121) {
						anIntArray177[anInt3072++] = Static407.aClass200_9.method5835() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray177[anInt3072++] = Static163.method2299();
						return;
					}
					if (arg0 == 6124) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.anInt4503;
						return;
					}
					if (arg0 == 6125) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.anInt4510;
						return;
					}
					if (arg0 == 6126) {
						anIntArray177[anInt3072++] = Static407.aClass200_9.method5862() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.aBoolean304 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.aBoolean301 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.anInt4501;
						return;
					}
					if (arg0 == 6130) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.aBoolean302 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray177[anInt3072++] = Static146.anInt2644;
						return;
					}
					if (arg0 == 6132) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.anInt4514;
						return;
					}
					if (arg0 == 6133) {
						anIntArray177[anInt3072++] = Static144.anInt2596 == 1 || Static144.anInt2596 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray177[anInt3072++] = Static163.method2301(Static102.anInt1724);
						return;
					}
					if (arg0 == 6135) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.anInt4502;
						return;
					}
					if (arg0 == 6136) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.aBoolean312 ? 1 : 0;
						return;
					}
					if (arg0 == 6137) {
						@Pc(5871) boolean local5871 = true;
						try {
							local5871 = jagmisc.getTotalPhysicalMemory() > 268435456L;
						} catch (@Pc(5881) Throwable local5881) {
						}
						anIntArray177[anInt3072++] = local5871 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt3072 -= 2;
						Static48.aShort13 = (short) anIntArray177[anInt3072];
						if (Static48.aShort13 <= 0) {
							Static48.aShort13 = 256;
						}
						Static347.aShort81 = (short) anIntArray177[anInt3072 + 1];
						if (Static347.aShort81 <= 0) {
							Static347.aShort81 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt3072 -= 2;
						Static73.aShort15 = (short) anIntArray177[anInt3072];
						if (Static73.aShort15 <= 0) {
							Static73.aShort15 = 256;
						}
						Static460.aShort108 = (short) anIntArray177[anInt3072 + 1];
						if (Static460.aShort108 <= 0) {
							Static460.aShort108 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt3072 -= 4;
						Static168.aShort55 = (short) anIntArray177[anInt3072];
						if (Static168.aShort55 <= 0) {
							Static168.aShort55 = 1;
						}
						Static372.aShort91 = (short) anIntArray177[anInt3072 + 1];
						if (Static372.aShort91 <= 0) {
							Static372.aShort91 = 32767;
						} else if (Static372.aShort91 < Static168.aShort55) {
							Static372.aShort91 = Static168.aShort55;
						}
						Static224.aShort41 = (short) anIntArray177[anInt3072 + 2];
						if (Static224.aShort41 <= 0) {
							Static224.aShort41 = 1;
						}
						Static426.aShort98 = (short) anIntArray177[anInt3072 + 3];
						if (Static426.aShort98 <= 0) {
							Static426.aShort98 = 32767;
							return;
						}
						if (Static426.aShort98 < Static224.aShort41) {
							Static426.aShort98 = Static224.aShort41;
						}
						return;
					}
					if (arg0 == 6203) {
						Static208.method2784(0, Static54.aClass76_3.anInt2127, 0, Static54.aClass76_3.anInt2106, false);
						anIntArray177[anInt3072++] = Static356.anInt5822;
						anIntArray177[anInt3072++] = Static143.anInt2594;
						return;
					}
					if (arg0 == 6204) {
						anIntArray177[anInt3072++] = Static73.aShort15;
						anIntArray177[anInt3072++] = Static460.aShort108;
						return;
					}
					if (arg0 == 6205) {
						anIntArray177[anInt3072++] = Static48.aShort13;
						anIntArray177[anInt3072++] = Static347.aShort81;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray177[anInt3072++] = (int) (Static446.method5903() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray177[anInt3072++] = (int) (Static446.method5903() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt3072 -= 3;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						local89 = anIntArray177[anInt3072 + 2];
						aCalendar2.clear();
						aCalendar2.set(11, 12);
						aCalendar2.set(local89, local192, local157);
						local95 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
						if (local89 < 1970) {
							local95--;
						}
						anIntArray177[anInt3072++] = local95;
						return;
					}
					if (arg0 == 6303) {
						aCalendar2.clear();
						aCalendar2.setTime(new Date(Static446.method5903()));
						anIntArray177[anInt3072++] = aCalendar2.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray177[--anInt3072];
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
						anIntArray177[anInt3072++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray177[anInt3072++] = Static175.method1914() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray177[anInt3072++] = Static7.method100() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static376.anInt6324 == 6 && Static51.anInt913 == 0 && Static188.anInt3155 == 0) {
							if (Static374.aBoolean415) {
								anIntArray177[anInt3072++] = 0;
								return;
							}
							if (Static123.aLong65 > Static446.method5903() - 1000L) {
								anIntArray177[anInt3072++] = 1;
								return;
							}
							Static374.aBoolean415 = true;
							Static288.method3576(Static211.aClass194_56);
							Static281.aClass5_Sub15_Sub2_13.method5550(Static166.anInt2869);
							anIntArray177[anInt3072++] = 0;
							return;
						}
						anIntArray177[anInt3072++] = 1;
						return;
					}
					@Pc(6414) Class147 local6414;
					@Pc(6381) Class50_Sub1 local6381;
					if (arg0 == 6501) {
						local6381 = Static123.method1750();
						if (local6381 != null) {
							anIntArray177[anInt3072++] = local6381.anInt1389;
							anIntArray177[anInt3072++] = local6381.anInt1376;
							aStringArray20[anInt3077++] = local6381.aString7;
							local6414 = local6381.method1134();
							anIntArray177[anInt3072++] = local6414.anInt3855;
							aStringArray20[anInt3077++] = local6414.aString43;
							anIntArray177[anInt3072++] = local6381.anInt1383;
							anIntArray177[anInt3072++] = local6381.anInt1386;
							aStringArray20[anInt3077++] = local6381.aString6;
							return;
						}
						anIntArray177[anInt3072++] = -1;
						anIntArray177[anInt3072++] = 0;
						aStringArray20[anInt3077++] = "";
						anIntArray177[anInt3072++] = 0;
						aStringArray20[anInt3077++] = "";
						anIntArray177[anInt3072++] = 0;
						anIntArray177[anInt3072++] = 0;
						aStringArray20[anInt3077++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6381 = Static239.method4850();
						if (local6381 != null) {
							anIntArray177[anInt3072++] = local6381.anInt1389;
							anIntArray177[anInt3072++] = local6381.anInt1376;
							aStringArray20[anInt3077++] = local6381.aString7;
							local6414 = local6381.method1134();
							anIntArray177[anInt3072++] = local6414.anInt3855;
							aStringArray20[anInt3077++] = local6414.aString43;
							anIntArray177[anInt3072++] = local6381.anInt1383;
							anIntArray177[anInt3072++] = local6381.anInt1386;
							aStringArray20[anInt3077++] = local6381.aString6;
							return;
						}
						anIntArray177[anInt3072++] = -1;
						anIntArray177[anInt3072++] = 0;
						aStringArray20[anInt3077++] = "";
						anIntArray177[anInt3072++] = 0;
						aStringArray20[anInt3077++] = "";
						anIntArray177[anInt3072++] = 0;
						anIntArray177[anInt3072++] = 0;
						aStringArray20[anInt3077++] = "";
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray177[--anInt3072];
						local81 = aStringArray20[--anInt3077];
						if (Static376.anInt6324 == 6 && Static51.anInt913 == 0 && Static188.anInt3155 == 0) {
							anIntArray177[anInt3072++] = Static74.method1085(local81, local157) ? 1 : 0;
							return;
						}
						anIntArray177[anInt3072++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static216.aClass1_Sub1_1.anInt4517 = anIntArray177[--anInt3072];
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						return;
					}
					if (arg0 == 6505) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.anInt4517;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray177[--anInt3072];
						@Pc(6771) Class50_Sub1 local6771 = Static343.method4462(local157);
						if (local6771 != null) {
							anIntArray177[anInt3072++] = local6771.anInt1376;
							aStringArray20[anInt3077++] = local6771.aString7;
							@Pc(6795) Class147 local6795 = local6771.method1134();
							anIntArray177[anInt3072++] = local6795.anInt3855;
							aStringArray20[anInt3077++] = local6795.aString43;
							anIntArray177[anInt3072++] = local6771.anInt1383;
							anIntArray177[anInt3072++] = local6771.anInt1386;
							aStringArray20[anInt3077++] = local6771.aString6;
							return;
						}
						anIntArray177[anInt3072++] = -1;
						aStringArray20[anInt3077++] = "";
						anIntArray177[anInt3072++] = 0;
						aStringArray20[anInt3077++] = "";
						anIntArray177[anInt3072++] = 0;
						anIntArray177[anInt3072++] = 0;
						aStringArray20[anInt3077++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt3072 -= 4;
						local157 = anIntArray177[anInt3072];
						local1313 = anIntArray177[anInt3072 + 1] == 1;
						local89 = anIntArray177[anInt3072 + 2];
						local1965 = anIntArray177[anInt3072 + 3] == 1;
						Static426.method5643(local89, local1313, local157, local1965);
						return;
					}
					if (arg0 == 6508) {
						Static374.method4920();
						return;
					}
					if (arg0 == 6509) {
						if (Static376.anInt6324 != 6) {
							return;
						}
						Static402.aBoolean455 = anIntArray177[--anInt3072] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static216.aClass1_Sub1_1.aBoolean297 = anIntArray177[--anInt3072] == 1;
						Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
						return;
					}
					if (arg0 == 6601) {
						anIntArray177[anInt3072++] = Static216.aClass1_Sub1_1.aBoolean297 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static414.aClass172_4 == Static257.aClass172_2) {
					if (arg0 == 6700) {
						local157 = Static151.aClass252_42.method5665();
						if (Static199.anInt3319 != -1) {
							local157++;
						}
						anIntArray177[anInt3072++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray177[--anInt3072];
						if (Static199.anInt3319 != -1) {
							if (local157 == 0) {
								anIntArray177[anInt3072++] = Static199.anInt3319;
								return;
							}
							local157--;
						}
						@Pc(7070) Class5_Sub44 local7070 = (Class5_Sub44) Static151.aClass252_42.method5660();
						while (local157-- > 0) {
							local7070 = (Class5_Sub44) Static151.aClass252_42.method5666();
						}
						anIntArray177[anInt3072++] = local7070.anInt6981;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray177[--anInt3072];
						if (Static34.aClass76ArrayArray1[local157] == null) {
							aStringArray20[anInt3077++] = "";
							return;
						}
						local81 = Static34.aClass76ArrayArray1[local157][0].aString16;
						if (local81 == null) {
							aStringArray20[anInt3077++] = "";
							return;
						}
						aStringArray20[anInt3077++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray177[--anInt3072];
						if (Static34.aClass76ArrayArray1[local157] == null) {
							anIntArray177[anInt3072++] = 0;
							return;
						}
						anIntArray177[anInt3072++] = Static34.aClass76ArrayArray1[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt3072 -= 2;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						if (Static34.aClass76ArrayArray1[local157] == null) {
							aStringArray20[anInt3077++] = "";
							return;
						}
						local3351 = Static34.aClass76ArrayArray1[local157][local192].aString16;
						if (local3351 == null) {
							aStringArray20[anInt3077++] = "";
							return;
						}
						aStringArray20[anInt3077++] = local3351;
						return;
					}
					if (arg0 == 6705) {
						anInt3072 -= 2;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						if (Static34.aClass76ArrayArray1[local157] == null) {
							anIntArray177[anInt3072++] = 0;
							return;
						}
						anIntArray177[anInt3072++] = Static34.aClass76ArrayArray1[local157][local192].anInt2099;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt3072 -= 3;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						local89 = anIntArray177[anInt3072 + 2];
						Static356.method4613("", local89, local157 << 16 | local192, 1);
						return;
					}
					if (arg0 == 6708) {
						anInt3072 -= 3;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						local89 = anIntArray177[anInt3072 + 2];
						Static356.method4613("", local89, local157 << 16 | local192, 2);
						return;
					}
					if (arg0 == 6709) {
						anInt3072 -= 3;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						local89 = anIntArray177[anInt3072 + 2];
						Static356.method4613("", local89, local157 << 16 | local192, 3);
						return;
					}
					if (arg0 == 6710) {
						anInt3072 -= 3;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						local89 = anIntArray177[anInt3072 + 2];
						Static356.method4613("", local89, local157 << 16 | local192, 4);
						return;
					}
					if (arg0 == 6711) {
						anInt3072 -= 3;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						local89 = anIntArray177[anInt3072 + 2];
						Static356.method4613("", local89, local157 << 16 | local192, 5);
						return;
					}
					if (arg0 == 6712) {
						anInt3072 -= 3;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						local89 = anIntArray177[anInt3072 + 2];
						Static356.method4613("", local89, local157 << 16 | local192, 6);
						return;
					}
					if (arg0 == 6713) {
						anInt3072 -= 3;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						local89 = anIntArray177[anInt3072 + 2];
						Static356.method4613("", local89, local157 << 16 | local192, 7);
						return;
					}
					if (arg0 == 6714) {
						anInt3072 -= 3;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						local89 = anIntArray177[anInt3072 + 2];
						Static356.method4613("", local89, local157 << 16 | local192, 8);
						return;
					}
					if (arg0 == 6715) {
						anInt3072 -= 3;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						local89 = anIntArray177[anInt3072 + 2];
						Static356.method4613("", local89, local157 << 16 | local192, 9);
						return;
					}
					if (arg0 == 6716) {
						anInt3072 -= 3;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						local89 = anIntArray177[anInt3072 + 2];
						Static356.method4613("", local89, local157 << 16 | local192, 10);
						return;
					}
					if (arg0 == 6717) {
						anInt3072 -= 3;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						local89 = anIntArray177[anInt3072 + 2];
						@Pc(7658) Class76 local7658 = Static371.method4859(local157 << 16 | local192, local89);
						Static289.method3586();
						@Pc(7663) Class5_Sub40 local7663 = Static55.method885(local7658);
						Static205.method2745(local7663.method5384(), local7658, local7663.anInt6801);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7691) Class6 local7691;
					if (arg0 == 6800) {
						local157 = anIntArray177[--anInt3072];
						local7691 = Static404.aClass28_4.method670(local157);
						if (local7691.aString1 == null) {
							aStringArray20[anInt3077++] = "";
							return;
						}
						aStringArray20[anInt3077++] = local7691.aString1;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray177[--anInt3072];
						local7691 = Static404.aClass28_4.method670(local157);
						anIntArray177[anInt3072++] = local7691.anInt102;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray177[--anInt3072];
						local7691 = Static404.aClass28_4.method670(local157);
						anIntArray177[anInt3072++] = local7691.anInt119;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray177[--anInt3072];
						local7691 = Static404.aClass28_4.method670(local157);
						anIntArray177[anInt3072++] = local7691.anInt129;
						return;
					}
					if (arg0 == 6804) {
						anInt3072 -= 2;
						local157 = anIntArray177[anInt3072];
						local192 = anIntArray177[anInt3072 + 1];
						@Pc(7813) Class166 local7813 = Static1.aClass33_3.method788(local192);
						if (local7813.method3406()) {
							aStringArray20[anInt3077++] = Static404.aClass28_4.method670(local157).method88(local192, local7813.aString51);
							return;
						}
						anIntArray177[anInt3072++] = Static404.aClass28_4.method670(local157).method85(local7813.anInt4273, local192);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray177[anInt3072++] = Static408.aBoolean459 && !Static337.aBoolean377 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray177[anInt3072++] = Static440.anInt7324;
						return;
					}
					if (arg0 == 6902) {
						anIntArray177[anInt3072++] = Static364.anInt5916;
						return;
					}
					if (arg0 == 6903) {
						anIntArray177[anInt3072++] = Static414.anInt6897;
						return;
					}
					if (arg0 == 6904) {
						anIntArray177[anInt3072++] = Static412.anInt6864;
						return;
					}
					if (arg0 == 6905) {
						local75 = "";
						if (Static22.aClass268_1 != null) {
							if (Static22.aClass268_1.anObject10 == null) {
								local75 = Static286.method3550(Static22.aClass268_1.anInt7419);
							} else {
								local75 = (String) Static22.aClass268_1.anObject10;
							}
						}
						aStringArray20[anInt3077++] = local75;
						return;
					}
					if (arg0 == 6906) {
						anIntArray177[anInt3072++] = Static405.anInt7261;
						return;
					}
					if (arg0 == 6907) {
						anIntArray177[anInt3072++] = Static458.anInt7497;
						return;
					}
					if (arg0 == 6908) {
						anIntArray177[anInt3072++] = Static240.anInt6958;
						return;
					}
					if (arg0 == 6909) {
						anIntArray177[anInt3072++] = Static213.aBoolean231 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray177[anInt3072++] = Static115.anInt1963;
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(IZ)V")
	private static void method2478(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class76 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class76 local35;
		@Pc(158) Class76 local158;
		@Pc(210) Class76 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt3072 -= 3;
				local13 = anIntArray177[anInt3072];
				local19 = anIntArray177[anInt3072 + 1];
				local25 = anIntArray177[anInt3072 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static213.method2817(local13);
				if (local35.aClass76Array2 == null) {
					local35.aClass76Array2 = new Class76[local25 + 1];
				}
				if (local35.aClass76Array2.length <= local25) {
					@Pc(54) Class76[] local54 = new Class76[local25 + 1];
					for (local56 = 0; local56 < local35.aClass76Array2.length; local56++) {
						local54[local56] = local35.aClass76Array2[local56];
					}
					local35.aClass76Array2 = local54;
				}
				if (local25 > 0 && local35.aClass76Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class76 local99 = new Class76();
				local99.anInt2060 = local19;
				local99.anInt2112 = local99.anInt2100 = local35.anInt2100;
				local99.anInt2115 = local25;
				local35.aClass76Array2[local25] = local99;
				if (arg1) {
					aClass76_7 = local99;
				} else {
					aClass76_8 = local99;
				}
				Static53.method833(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass76_7 : aClass76_8;
				if (local137.anInt2115 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static213.method2817(local137.anInt2100);
				local158.aClass76Array2[local137.anInt2115] = null;
				Static53.method833(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static213.method2817(anIntArray177[--anInt3072]);
				local137.aClass76Array2 = null;
				Static53.method833(local137);
				return;
			}
			if (arg0 == 200) {
				anInt3072 -= 2;
				local13 = anIntArray177[anInt3072];
				local19 = anIntArray177[anInt3072 + 1];
				local210 = Static371.method4859(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray177[anInt3072++] = 1;
					if (arg1) {
						aClass76_7 = local210;
						return;
					}
					aClass76_8 = local210;
					return;
				}
				anIntArray177[anInt3072++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray177[--anInt3072];
				local158 = Static213.method2817(local13);
				if (local158 != null) {
					anIntArray177[anInt3072++] = 1;
					if (arg1) {
						aClass76_7 = local158;
						return;
					}
					aClass76_8 = local158;
					return;
				}
				anIntArray177[anInt3072++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray177[--anInt3072];
				method2471(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray177[--anInt3072];
				method2476(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt3072 -= 2;
					local13 = anIntArray177[anInt3072];
					local19 = anIntArray177[anInt3072 + 1];
					for (local25 = 0; local25 < Static56.anIntArray46.length; local25++) {
						if (Static56.anIntArray46[local25] == local13) {
							Static220.aClass2_Sub1_Sub3_Sub2_1.aClass270_1.method5999(local25, local19, Static391.aClass120_2);
							return;
						}
					}
					for (local353 = 0; local353 < Static128.anIntArray125.length; local353++) {
						if (Static128.anIntArray125[local353] == local13) {
							Static220.aClass2_Sub1_Sub3_Sub2_1.aClass270_1.method5999(local353, local19, Static391.aClass120_2);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt3072 -= 2;
					local13 = anIntArray177[anInt3072];
					local19 = anIntArray177[anInt3072 + 1];
					Static220.aClass2_Sub1_Sub3_Sub2_1.aClass270_1.method5994(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray177[--anInt3072] != 0;
					Static220.aClass2_Sub1_Sub3_Sub2_1.aClass270_1.method5992(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static213.method2817(anIntArray177[--anInt3072]);
					} else {
						local137 = arg1 ? aClass76_7 : aClass76_8;
					}
					if (arg0 == 1100) {
						anInt3072 -= 2;
						local137.anInt2052 = anIntArray177[anInt3072];
						if (local137.anInt2052 > local137.anInt2109 - local137.anInt2127) {
							local137.anInt2052 = local137.anInt2109 - local137.anInt2127;
						}
						if (local137.anInt2052 < 0) {
							local137.anInt2052 = 0;
						}
						local137.anInt2061 = anIntArray177[anInt3072 + 1];
						if (local137.anInt2061 > local137.anInt2114 - local137.anInt2106) {
							local137.anInt2061 = local137.anInt2114 - local137.anInt2106;
						}
						if (local137.anInt2061 < 0) {
							local137.anInt2061 = 0;
						}
						Static53.method833(local137);
						if (local137.anInt2115 == -1) {
							Static262.method3351(local137.anInt2100);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt2054 = anIntArray177[--anInt3072];
						Static53.method833(local137);
						if (local137.anInt2115 == -1) {
							Static93.method1315(local137.anInt2100);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean150 = anIntArray177[--anInt3072] == 1;
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt2089 = anIntArray177[--anInt3072];
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt2088 = anIntArray177[--anInt3072];
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray177[--anInt3072];
						if (local137.anInt2130 != local19) {
							local137.anInt2130 = local19;
							Static53.method833(local137);
						}
						if (local137.anInt2115 == -1) {
							Static33.method565(local137.anInt2100);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt2048 = anIntArray177[--anInt3072];
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean146 = anIntArray177[--anInt3072] == 1;
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt2134 = 1;
						local137.anInt2053 = anIntArray177[--anInt3072];
						Static53.method833(local137);
						if (local137.anInt2115 == -1) {
							Static91.method1312(local137.anInt2100);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt3072 -= 6;
						local137.anInt2092 = anIntArray177[anInt3072];
						local137.anInt2078 = anIntArray177[anInt3072 + 1];
						local137.anInt2093 = anIntArray177[anInt3072 + 2];
						local137.anInt2117 = anIntArray177[anInt3072 + 3];
						local137.anInt2069 = anIntArray177[anInt3072 + 4];
						local137.anInt2137 = anIntArray177[anInt3072 + 5];
						Static53.method833(local137);
						if (local137.anInt2115 == -1) {
							Static255.method3309(local137.anInt2100);
							Static75.method1125(local137.anInt2100);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray177[--anInt3072];
						if (local137.anInt2084 != local19) {
							local137.anInt2084 = local19;
							local137.anInt2050 = 0;
							local137.anInt2051 = 1;
							local137.anInt2064 = 0;
							Static53.method833(local137);
						}
						if (local137.anInt2115 == -1) {
							Static198.method2646(local137.anInt2100);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean140 = anIntArray177[--anInt3072] == 1;
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray20[--anInt3077];
						if (!local1101.equals(local137.aString19)) {
							local137.aString19 = local1101;
							Static53.method833(local137);
						}
						if (local137.anInt2115 == -1) {
							Static209.method2792(local137.anInt2100);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt2131 = anIntArray177[--anInt3072];
						Static53.method833(local137);
						if (local137.anInt2115 == -1) {
							Static161.method2279(local137.anInt2100);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt3072 -= 3;
						local137.anInt2119 = anIntArray177[anInt3072];
						local137.anInt2120 = anIntArray177[anInt3072 + 1];
						local137.anInt2083 = anIntArray177[anInt3072 + 2];
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean147 = anIntArray177[--anInt3072] == 1;
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.lb = anIntArray177[--anInt3072];
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt2056 = anIntArray177[--anInt3072];
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean148 = anIntArray177[--anInt3072] == 1;
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean144 = anIntArray177[--anInt3072] == 1;
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt3072 -= 2;
						local137.anInt2109 = anIntArray177[anInt3072];
						local137.anInt2114 = anIntArray177[anInt3072 + 1];
						Static53.method833(local137);
						if (local137.anInt2060 == 0) {
							Static125.method1758(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt3072 -= 2;
						local137.anInt2065 = (short) anIntArray177[anInt3072];
						local137.anInt2135 = (short) anIntArray177[anInt3072 + 1];
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean138 = anIntArray177[--anInt3072] == 1;
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt2137 = anIntArray177[--anInt3072];
						Static53.method833(local137);
						if (local137.anInt2115 == -1) {
							Static255.method3309(local137.anInt2100);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray177[--anInt3072];
						local137.aBoolean153 = local19 == 1;
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt3072 -= 2;
						local137.anInt2094 = anIntArray177[anInt3072];
						local137.anInt2128 = anIntArray177[anInt3072 + 1];
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt2080 = anIntArray177[--anInt3072];
						Static53.method833(local137);
						return;
					}
					@Pc(1454) Class166 local1454;
					if (arg0 == 1127) {
						anInt3072 -= 2;
						local19 = anIntArray177[anInt3072];
						local25 = anIntArray177[anInt3072 + 1];
						local1454 = Static1.aClass33_3.method788(local19);
						if (local25 != local1454.anInt4273) {
							local137.method1687(local19, local25);
							return;
						}
						local137.method1684(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray177[--anInt3072];
						local1488 = aStringArray20[--anInt3077];
						local1454 = Static1.aClass33_3.method788(local19);
						if (!local1454.aString51.equals(local1488)) {
							local137.method1683(local1488, local19);
							return;
						}
						local137.method1684(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static213.method2817(anIntArray177[--anInt3072]);
							} else {
								local137 = arg1 ? aClass76_7 : aClass76_8;
							}
							local1101 = aStringArray20[--anInt3077];
							@Pc(2369) int[] local2369 = null;
							if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
								local353 = anIntArray177[--anInt3072];
								if (local353 > 0) {
									local2369 = new int[local353];
									while (local353-- > 0) {
										local2369[local353] = anIntArray177[--anInt3072];
									}
								}
								local1101 = local1101.substring(0, local1101.length() - 1);
							}
							@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
							for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
								if (local1101.charAt(local2290 - 1) == 's') {
									local2421[local2290] = aStringArray20[--anInt3077];
								} else {
									local2421[local2290] = Integer.valueOf(anIntArray177[--anInt3072]);
								}
							}
							local56 = anIntArray177[--anInt3072];
							if (local56 == -1) {
								local2421 = null;
							} else {
								local2421[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray27 = local2421;
							} else if (arg0 == 1401) {
								local137.anObjectArray11 = local2421;
							} else if (arg0 == 1402) {
								local137.anObjectArray25 = local2421;
							} else if (arg0 == 1403) {
								local137.anObjectArray24 = local2421;
							} else if (arg0 == 1404) {
								local137.anObjectArray10 = local2421;
							} else if (arg0 == 1405) {
								local137.anObjectArray6 = local2421;
							} else if (arg0 == 1406) {
								local137.anObjectArray16 = local2421;
							} else if (arg0 == 1407) {
								local137.anObjectArray8 = local2421;
								local137.anIntArray109 = local2369;
							} else if (arg0 == 1408) {
								local137.anObjectArray12 = local2421;
							} else if (arg0 == 1409) {
								local137.anObjectArray13 = local2421;
							} else if (arg0 == 1410) {
								local137.anObjectArray20 = local2421;
							} else if (arg0 == 1411) {
								local137.anObjectArray28 = local2421;
							} else if (arg0 == 1412) {
								local137.anObjectArray14 = local2421;
							} else if (arg0 == 1414) {
								local137.anObjectArray9 = local2421;
								local137.anIntArray115 = local2369;
							} else if (arg0 == 1415) {
								local137.anObjectArray7 = local2421;
								local137.anIntArray106 = local2369;
							} else if (arg0 == 1416) {
								local137.anObjectArray5 = local2421;
							} else if (arg0 == 1417) {
								local137.anObjectArray15 = local2421;
							} else if (arg0 == 1418) {
								local137.anObjectArray2 = local2421;
							} else if (arg0 == 1419) {
								local137.anObjectArray21 = local2421;
							} else if (arg0 == 1420) {
								local137.anObjectArray31 = local2421;
							} else if (arg0 == 1421) {
								local137.anObjectArray19 = local2421;
							} else if (arg0 == 1422) {
								local137.anObjectArray22 = local2421;
							} else if (arg0 == 1423) {
								local137.anObjectArray30 = local2421;
							} else if (arg0 == 1424) {
								local137.anObjectArray17 = local2421;
							} else if (arg0 == 1425) {
								local137.anObjectArray26 = local2421;
							} else if (arg0 == 1426) {
								local137.anObjectArray18 = local2421;
							} else if (arg0 == 1427) {
								local137.anObjectArray23 = local2421;
							} else if (arg0 == 1428) {
								local137.anObjectArray29 = local2421;
								local137.anIntArray114 = local2369;
							} else if (arg0 == 1429) {
								local137.anObjectArray4 = local2421;
								local137.anIntArray111 = local2369;
							} else if (arg0 == 1430) {
								local137.anObjectArray3 = local2421;
							}
							local137.aBoolean145 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass76_7 : aClass76_8;
							if (arg0 == 1500) {
								anIntArray177[anInt3072++] = local137.anInt2126;
								return;
							}
							if (arg0 == 1501) {
								anIntArray177[anInt3072++] = local137.anInt2079;
								return;
							}
							if (arg0 == 1502) {
								anIntArray177[anInt3072++] = local137.anInt2127;
								return;
							}
							if (arg0 == 1503) {
								anIntArray177[anInt3072++] = local137.anInt2106;
								return;
							}
							if (arg0 == 1504) {
								anIntArray177[anInt3072++] = local137.aBoolean143 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray177[anInt3072++] = local137.anInt2112;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static30.method477(local137);
								anIntArray177[anInt3072++] = local158 == null ? -1 : local158.anInt2100;
								return;
							}
						} else {
							@Pc(3017) Class166 local3017;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass76_7 : aClass76_8;
								if (arg0 == 1600) {
									anIntArray177[anInt3072++] = local137.anInt2052;
									return;
								}
								if (arg0 == 1601) {
									anIntArray177[anInt3072++] = local137.anInt2061;
									return;
								}
								if (arg0 == 1602) {
									aStringArray20[anInt3077++] = local137.aString19;
									return;
								}
								if (arg0 == 1603) {
									anIntArray177[anInt3072++] = local137.anInt2109;
									return;
								}
								if (arg0 == 1604) {
									anIntArray177[anInt3072++] = local137.anInt2114;
									return;
								}
								if (arg0 == 1605) {
									anIntArray177[anInt3072++] = local137.anInt2137;
									return;
								}
								if (arg0 == 1606) {
									anIntArray177[anInt3072++] = local137.anInt2093;
									return;
								}
								if (arg0 == 1607) {
									anIntArray177[anInt3072++] = local137.anInt2069;
									return;
								}
								if (arg0 == 1608) {
									anIntArray177[anInt3072++] = local137.anInt2117;
									return;
								}
								if (arg0 == 1609) {
									anIntArray177[anInt3072++] = local137.anInt2089;
									return;
								}
								if (arg0 == 1610) {
									anIntArray177[anInt3072++] = local137.anInt2092;
									return;
								}
								if (arg0 == 1611) {
									anIntArray177[anInt3072++] = local137.anInt2078;
									return;
								}
								if (arg0 == 1612) {
									anIntArray177[anInt3072++] = local137.anInt2130;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray177[--anInt3072];
									local3017 = Static1.aClass33_3.method788(local19);
									if (local3017.method3406()) {
										aStringArray20[anInt3077++] = local137.method1677(local3017.aString51, local19);
										return;
									}
									anIntArray177[anInt3072++] = local137.method1690(local3017.anInt4273, local19);
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass76_7 : aClass76_8;
								if (arg0 == 1700) {
									anIntArray177[anInt3072++] = local137.anInt2057;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt2057 != -1) {
										anIntArray177[anInt3072++] = local137.anInt2125;
										return;
									}
									anIntArray177[anInt3072++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray177[anInt3072++] = local137.anInt2115;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass76_7 : aClass76_8;
								if (arg0 == 1800) {
									anIntArray177[anInt3072++] = Static55.method885(local137).method5384();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray177[--anInt3072];
									local19--;
									if (local137.aStringArray14 != null && local19 < local137.aStringArray14.length && local137.aStringArray14[local19] != null) {
										aStringArray20[anInt3077++] = local137.aStringArray14[local19];
										return;
									}
									aStringArray20[anInt3077++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString17 == null) {
										aStringArray20[anInt3077++] = "";
										return;
									}
									aStringArray20[anInt3077++] = local137.aString17;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static213.method2817(anIntArray177[--anInt3072]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass76_7 : aClass76_8;
								}
								if (anInt3080 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray23 == null) {
										return;
									}
									@Pc(3254) Class5_Sub33 local3254 = new Class5_Sub33();
									local3254.aClass76_12 = local137;
									local3254.anObjectArray35 = local137.anObjectArray23;
									local3254.anInt5628 = anInt3080 + 1;
									Static250.aClass177_26.method3615(local3254);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static213.method2817(anIntArray177[--anInt3072]);
								if (arg0 == 2500) {
									anIntArray177[anInt3072++] = local137.anInt2126;
									return;
								}
								if (arg0 == 2501) {
									anIntArray177[anInt3072++] = local137.anInt2079;
									return;
								}
								if (arg0 == 2502) {
									anIntArray177[anInt3072++] = local137.anInt2127;
									return;
								}
								if (arg0 == 2503) {
									anIntArray177[anInt3072++] = local137.anInt2106;
									return;
								}
								if (arg0 == 2504) {
									anIntArray177[anInt3072++] = local137.aBoolean143 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray177[anInt3072++] = local137.anInt2112;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static30.method477(local137);
									anIntArray177[anInt3072++] = local158 == null ? -1 : local158.anInt2100;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static213.method2817(anIntArray177[--anInt3072]);
								if (arg0 == 2600) {
									anIntArray177[anInt3072++] = local137.anInt2052;
									return;
								}
								if (arg0 == 2601) {
									anIntArray177[anInt3072++] = local137.anInt2061;
									return;
								}
								if (arg0 == 2602) {
									aStringArray20[anInt3077++] = local137.aString19;
									return;
								}
								if (arg0 == 2603) {
									anIntArray177[anInt3072++] = local137.anInt2109;
									return;
								}
								if (arg0 == 2604) {
									anIntArray177[anInt3072++] = local137.anInt2114;
									return;
								}
								if (arg0 == 2605) {
									anIntArray177[anInt3072++] = local137.anInt2137;
									return;
								}
								if (arg0 == 2606) {
									anIntArray177[anInt3072++] = local137.anInt2093;
									return;
								}
								if (arg0 == 2607) {
									anIntArray177[anInt3072++] = local137.anInt2069;
									return;
								}
								if (arg0 == 2608) {
									anIntArray177[anInt3072++] = local137.anInt2117;
									return;
								}
								if (arg0 == 2609) {
									anIntArray177[anInt3072++] = local137.anInt2089;
									return;
								}
								if (arg0 == 2610) {
									anIntArray177[anInt3072++] = local137.anInt2092;
									return;
								}
								if (arg0 == 2611) {
									anIntArray177[anInt3072++] = local137.anInt2078;
									return;
								}
								if (arg0 == 2612) {
									anIntArray177[anInt3072++] = local137.anInt2130;
									return;
								}
							} else {
								@Pc(3751) Class5_Sub44 local3751;
								@Pc(3649) Class5_Sub44 local3649;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static213.method2817(anIntArray177[--anInt3072]);
										anIntArray177[anInt3072++] = local137.anInt2057;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static213.method2817(anIntArray177[--anInt3072]);
										if (local137.anInt2057 != -1) {
											anIntArray177[anInt3072++] = local137.anInt2125;
											return;
										}
										anIntArray177[anInt3072++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray177[--anInt3072];
										local3649 = (Class5_Sub44) Static151.aClass252_42.method5659((long) local13);
										if (local3649 != null) {
											anIntArray177[anInt3072++] = 1;
											return;
										}
										anIntArray177[anInt3072++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static213.method2817(anIntArray177[--anInt3072]);
										if (local137.aClass76Array2 == null) {
											anIntArray177[anInt3072++] = 0;
											return;
										}
										local19 = local137.aClass76Array2.length;
										for (local25 = 0; local25 < local137.aClass76Array2.length; local25++) {
											if (local137.aClass76Array2[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray177[anInt3072++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt3072 -= 2;
										local13 = anIntArray177[anInt3072];
										local19 = anIntArray177[anInt3072 + 1];
										local3751 = (Class5_Sub44) Static151.aClass252_42.method5659((long) local13);
										if (local3751 != null && local3751.anInt6981 == local19) {
											anIntArray177[anInt3072++] = 1;
											return;
										}
										anIntArray177[anInt3072++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static213.method2817(anIntArray177[--anInt3072]);
									if (arg0 == 2800) {
										anIntArray177[anInt3072++] = Static55.method885(local137).method5384();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray177[--anInt3072];
										local19--;
										if (local137.aStringArray14 != null && local19 < local137.aStringArray14.length && local137.aStringArray14[local19] != null) {
											aStringArray20[anInt3077++] = local137.aStringArray14[local19];
											return;
										}
										aStringArray20[anInt3077++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString17 == null) {
											aStringArray20[anInt3077++] = "";
											return;
										}
										aStringArray20[anInt3077++] = local137.aString17;
										return;
									}
								} else {
									@Pc(3888) String local3888;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local3888 = aStringArray20[--anInt3077];
											Static411.method5422(local3888);
											return;
										}
										if (arg0 == 3101) {
											anInt3072 -= 2;
											Static95.method1332(anIntArray177[anInt3072], anIntArray177[anInt3072 + 1], Static220.aClass2_Sub1_Sub3_Sub2_1);
											return;
										}
										if (arg0 == 3103) {
											Static445.method2066();
											return;
										}
										if (arg0 == 3104) {
											local3888 = aStringArray20[--anInt3077];
											local19 = 0;
											if (Static172.method2975(local3888)) {
												local19 = Static311.method3824(local3888);
											}
											Static288.method3576(Static424.aClass194_116);
											Static281.aClass5_Sub15_Sub2_13.method5550(local19);
											return;
										}
										if (arg0 == 3105) {
											local3888 = aStringArray20[--anInt3077];
											Static288.method3576(Static143.aClass194_37);
											Static281.aClass5_Sub15_Sub2_13.method5583(local3888.length() + 1);
											Static281.aClass5_Sub15_Sub2_13.method5545(local3888);
											return;
										}
										if (arg0 == 3106) {
											local3888 = aStringArray20[--anInt3077];
											Static288.method3576(Static170.aClass194_50);
											Static281.aClass5_Sub15_Sub2_13.method5583(local3888.length() + 1);
											Static281.aClass5_Sub15_Sub2_13.method5545(local3888);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray177[--anInt3072];
											local1101 = aStringArray20[--anInt3077];
											Static388.method5188(local13, local1101);
											return;
										}
										if (arg0 == 3108) {
											anInt3072 -= 3;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											local25 = anIntArray177[anInt3072 + 2];
											local35 = Static213.method2817(local25);
											Static264.method3357(local13, local19, local35);
											return;
										}
										if (arg0 == 3109) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											local210 = arg1 ? aClass76_7 : aClass76_8;
											Static264.method3357(local13, local19, local210);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray177[--anInt3072];
											Static288.method3576(Static445.aClass194_35);
											Static281.aClass5_Sub15_Sub2_13.method5566(local13);
											return;
										}
										if (arg0 == 3111) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											local3751 = (Class5_Sub44) Static151.aClass252_42.method5659((long) local13);
											if (local3751 != null) {
												Static456.method5988(local3751.anInt6981 != local19, true, local3751);
											}
											Static241.method3140(true, local19, 3, local13);
											return;
										}
										if (arg0 == 3112) {
											anInt3072--;
											local13 = anIntArray177[anInt3072];
											local3649 = (Class5_Sub44) Static151.aClass252_42.method5659((long) local13);
											if (local3649 != null && local3649.anInt6979 == 3) {
												Static456.method5988(true, true, local3649);
											}
											return;
										}
										if (arg0 == 3113) {
											Static293.method3666(aStringArray20[--anInt3077]);
											return;
										}
										if (arg0 == 3114) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											local1488 = aStringArray20[--anInt3077];
											Static44.method702("", local1488, local13, local19, "");
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt3072 -= 3;
											Static64.method1000(anIntArray177[anInt3072 + 1], anIntArray177[anInt3072 + 2], anIntArray177[anInt3072], 255);
											return;
										}
										if (arg0 == 3201) {
											Static312.method3838(50, anIntArray177[--anInt3072], 255);
											return;
										}
										if (arg0 == 3202) {
											anInt3072 -= 2;
											Static104.method1444(anIntArray177[anInt3072], 255, anIntArray177[anInt3072 + 1]);
											return;
										}
										if (arg0 == 3203) {
											anInt3072 -= 4;
											Static64.method1000(anIntArray177[anInt3072 + 1], anIntArray177[anInt3072 + 2], anIntArray177[anInt3072], anIntArray177[anInt3072 + 3]);
											return;
										}
										if (arg0 == 3204) {
											anInt3072 -= 3;
											Static312.method3838(anIntArray177[anInt3072 + 2], anIntArray177[anInt3072], anIntArray177[anInt3072 + 1]);
											return;
										}
										if (arg0 == 3205) {
											anInt3072 -= 3;
											Static104.method1444(anIntArray177[anInt3072], anIntArray177[anInt3072 + 2], anIntArray177[anInt3072 + 1]);
											return;
										}
										if (arg0 == 3206) {
											anInt3072 -= 4;
											Static297.method3692(anIntArray177[anInt3072], anIntArray177[anInt3072 + 3], anIntArray177[anInt3072 + 2], anIntArray177[anInt3072 + 1]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray177[anInt3072++] = Static85.anInt1536;
											return;
										}
										if (arg0 == 3301) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = Static93.method1314(local19, false, local13);
											return;
										}
										if (arg0 == 3302) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = Static80.method1165(local19, local13, false);
											return;
										}
										if (arg0 == 3303) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = Static464.method5867(local13, false, local19);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static430.aClass232_1.method5107(local13).anInt5494;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static257.anIntArray327[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static229.anIntArray245[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static371.anIntArray429[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4605) byte local4605 = Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105;
											local19 = (Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500 >> 7) + Static31.anInt618;
											local25 = (Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502 >> 7) + Static226.anInt3768;
											anIntArray177[anInt3072++] = (local4605 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray177[anInt3072++] = Static150.aBoolean175 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = Static93.method1314(local19, true, local13);
											return;
										}
										if (arg0 == 3314) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = Static80.method1165(local19, local13, true);
											return;
										}
										if (arg0 == 3315) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = Static464.method5867(local13, true, local19);
											return;
										}
										if (arg0 == 3316) {
											if (Static189.anInt3178 >= 2) {
												anIntArray177[anInt3072++] = Static189.anInt3178;
												return;
											}
											anIntArray177[anInt3072++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray177[anInt3072++] = Static227.anInt3788;
											return;
										}
										if (arg0 == 3318) {
											anIntArray177[anInt3072++] = Static239.aClass165_7.anInt4240;
											return;
										}
										if (arg0 == 3321) {
											anIntArray177[anInt3072++] = Static154.anInt6467;
											return;
										}
										if (arg0 == 3322) {
											anIntArray177[anInt3072++] = Static371.anInt6078;
											return;
										}
										if (arg0 == 3323) {
											if (Static213.anInt3560 >= 5 && Static213.anInt3560 <= 9) {
												anIntArray177[anInt3072++] = 1;
												return;
											}
											anIntArray177[anInt3072++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static213.anInt3560 >= 5 && Static213.anInt3560 <= 9) {
												anIntArray177[anInt3072++] = Static213.anInt3560;
												return;
											}
											anIntArray177[anInt3072++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray177[anInt3072++] = Static282.aBoolean288 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray177[anInt3072++] = Static220.aClass2_Sub1_Sub3_Sub2_1.anInt6228;
											return;
										}
										if (arg0 == 3327) {
											anIntArray177[anInt3072++] = Static220.aClass2_Sub1_Sub3_Sub2_1.aClass270_1.aBoolean503 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray177[anInt3072++] = Static146.aBoolean172 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static31.method518(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = Static344.method4470(local19, local13, false);
											return;
										}
										if (arg0 == 3332) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = Static344.method4470(local19, local13, true);
											return;
										}
										if (arg0 == 3333) {
											anIntArray177[anInt3072++] = Static93.anInt1623;
											return;
										}
										if (arg0 == 3335) {
											anIntArray177[anInt3072++] = Static38.anInt4834;
											return;
										}
										if (arg0 == 3336) {
											anInt3072 -= 4;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											local25 = anIntArray177[anInt3072 + 2];
											local353 = anIntArray177[anInt3072 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray177[anInt3072++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray177[anInt3072++] = Static250.anInt4070;
											return;
										}
										if (arg0 == 3338) {
											anIntArray177[anInt3072++] = Static161.method2281();
											return;
										}
										if (arg0 == 3339) {
											anIntArray177[anInt3072++] = Static118.aBoolean152 ? 1 : 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray177[anInt3072++] = Static68.aBoolean96 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray177[anInt3072++] = Static78.aBoolean329 ? 1 : 0;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5261) Class218 local5261;
										if (arg0 == 3400) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											local5261 = Static418.aClass189_1.method3856(local13);
											aStringArray20[anInt3077++] = local5261.method4721(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt3072 -= 4;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											local25 = anIntArray177[anInt3072 + 2];
											local353 = anIntArray177[anInt3072 + 3];
											@Pc(5307) Class218 local5307 = Static418.aClass189_1.method3856(local25);
											if (local5307.aChar5 == local13 && local5307.aChar4 == local19) {
												if (local19 == 115) {
													aStringArray20[anInt3077++] = local5307.method4721(local353);
													return;
												}
												anIntArray177[anInt3072++] = local5307.method4717(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt3072 -= 3;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											local25 = anIntArray177[anInt3072 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5383) Class218 local5383 = Static418.aClass189_1.method3856(local19);
											if (local5383.aChar4 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray177[anInt3072++] = local5383.method4719(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray177[--anInt3072];
											local1101 = aStringArray20[--anInt3077];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5261 = Static418.aClass189_1.method3856(local13);
											if (local5261.aChar4 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray177[anInt3072++] = local5261.method4716(local1101) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray177[--anInt3072];
											@Pc(5481) Class218 local5481 = Static418.aClass189_1.method3856(local13);
											anIntArray177[anInt3072++] = local5481.aClass252_34.method5665();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static244.anInt3937 == 0) {
												anIntArray177[anInt3072++] = -2;
												return;
											}
											if (Static244.anInt3937 == 1) {
												anIntArray177[anInt3072++] = -1;
												return;
											}
											anIntArray177[anInt3072++] = Static244.anInt3939;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray177[--anInt3072];
											if (Static244.anInt3937 == 2 && local13 < Static244.anInt3939) {
												aStringArray20[anInt3077++] = Static225.aStringArray27[local13];
												if (Static88.aStringArray48[local13] != null) {
													aStringArray20[anInt3077++] = Static88.aStringArray48[local13];
													return;
												}
												aStringArray20[anInt3077++] = "";
												return;
											}
											aStringArray20[anInt3077++] = "";
											aStringArray20[anInt3077++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray177[--anInt3072];
											if (Static244.anInt3937 == 2 && local13 < Static244.anInt3939) {
												anIntArray177[anInt3072++] = Static226.anIntArray238[local13];
												return;
											}
											anIntArray177[anInt3072++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray177[--anInt3072];
											if (Static244.anInt3937 == 2 && local13 < Static244.anInt3939) {
												anIntArray177[anInt3072++] = Static211.anIntArray217[local13];
												return;
											}
											anIntArray177[anInt3072++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local3888 = aStringArray20[--anInt3077];
											local19 = anIntArray177[--anInt3072];
											Static136.method6008(local19, local3888);
											return;
										}
										if (arg0 == 3605) {
											local3888 = aStringArray20[--anInt3077];
											Static158.method2224(local3888);
											return;
										}
										if (arg0 == 3606) {
											local3888 = aStringArray20[--anInt3077];
											Static375.method4931(local3888);
											return;
										}
										if (arg0 == 3607) {
											local3888 = aStringArray20[--anInt3077];
											Static243.method3148(false, local3888);
											return;
										}
										if (arg0 == 3608) {
											local3888 = aStringArray20[--anInt3077];
											Static120.method1712(local3888);
											return;
										}
										if (arg0 == 3609) {
											local3888 = aStringArray20[--anInt3077];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray177[anInt3072++] = Static96.method1355(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray177[--anInt3072];
											if (Static244.anInt3937 == 2 && local13 < Static244.anInt3939) {
												aStringArray20[anInt3077++] = Static10.aStringArray3[local13];
												return;
											}
											aStringArray20[anInt3077++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static58.aString4 != null) {
												aStringArray20[anInt3077++] = Static432.method5703(Static58.aString4);
												return;
											}
											aStringArray20[anInt3077++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static58.aString4 != null) {
												anIntArray177[anInt3072++] = Static406.anInt6806;
												return;
											}
											anIntArray177[anInt3072++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray177[--anInt3072];
											if (Static58.aString4 != null && local13 < Static406.anInt6806) {
												aStringArray20[anInt3077++] = Static349.aClass124Array1[local13].aString36;
												return;
											}
											aStringArray20[anInt3077++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray177[--anInt3072];
											if (Static58.aString4 != null && local13 < Static406.anInt6806) {
												anIntArray177[anInt3072++] = Static349.aClass124Array1[local13].anInt3260;
												return;
											}
											anIntArray177[anInt3072++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray177[--anInt3072];
											if (Static58.aString4 != null && local13 < Static406.anInt6806) {
												anIntArray177[anInt3072++] = Static349.aClass124Array1[local13].aByte32;
												return;
											}
											anIntArray177[anInt3072++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray177[anInt3072++] = Static297.aByte58;
											return;
										}
										if (arg0 == 3617) {
											local3888 = aStringArray20[--anInt3077];
											Static12.method201(local3888);
											return;
										}
										if (arg0 == 3618) {
											anIntArray177[anInt3072++] = Static242.aByte47;
											return;
										}
										if (arg0 == 3619) {
											local3888 = aStringArray20[--anInt3077];
											Static129.method1801(local3888);
											return;
										}
										if (arg0 == 3620) {
											Static418.method5513();
											return;
										}
										if (arg0 == 3621) {
											if (Static244.anInt3937 == 0) {
												anIntArray177[anInt3072++] = -1;
												return;
											}
											anIntArray177[anInt3072++] = Static150.anInt2695;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray177[--anInt3072];
											if (Static244.anInt3937 != 0 && local13 < Static150.anInt2695) {
												aStringArray20[anInt3077++] = Static338.aStringArray36[local13];
												if (Static65.aStringArray34[local13] != null) {
													aStringArray20[anInt3077++] = Static65.aStringArray34[local13];
													return;
												}
												aStringArray20[anInt3077++] = "";
												return;
											}
											aStringArray20[anInt3077++] = "";
											aStringArray20[anInt3077++] = "";
											return;
										}
										if (arg0 == 3623) {
											local3888 = aStringArray20[--anInt3077];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray177[anInt3072++] = Static333.method4129(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray177[--anInt3072];
											if (Static349.aClass124Array1 != null && local13 < Static406.anInt6806 && Static349.aClass124Array1[local13].aString37.equalsIgnoreCase(Static220.aClass2_Sub1_Sub3_Sub2_1.aString65)) {
												anIntArray177[anInt3072++] = 1;
												return;
											}
											anIntArray177[anInt3072++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static290.aString52 != null) {
												aStringArray20[anInt3077++] = Static290.aString52;
												return;
											}
											aStringArray20[anInt3077++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray177[--anInt3072];
											if (Static58.aString4 != null && local13 < Static406.anInt6806) {
												aStringArray20[anInt3077++] = Static349.aClass124Array1[local13].aString35;
												return;
											}
											aStringArray20[anInt3077++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray177[--anInt3072];
											if (Static244.anInt3937 == 2 && local13 >= 0 && local13 < Static244.anInt3939) {
												anIntArray177[anInt3072++] = Static165.aBooleanArray10[local13] ? 1 : 0;
												return;
											}
											anIntArray177[anInt3072++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local3888 = aStringArray20[--anInt3077];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray177[anInt3072++] = Static18.method304(local3888);
											return;
										}
										if (arg0 == 3629) {
											anIntArray177[anInt3072++] = Static194.anInt3229;
											return;
										}
										if (arg0 == 3630) {
											local3888 = aStringArray20[--anInt3077];
											Static243.method3148(true, local3888);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static53.aBooleanArray4[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray177[--anInt3072];
											if (Static58.aString4 != null && local13 < Static406.anInt6806) {
												aStringArray20[anInt3077++] = Static349.aClass124Array1[local13].aString37;
												return;
											}
											aStringArray20[anInt3077++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray177[--anInt3072];
											if (Static244.anInt3937 != 0 && local13 < Static150.anInt2695) {
												aStringArray20[anInt3077++] = Static263.aStringArray31[local13];
												return;
											}
											aStringArray20[anInt3077++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static111.aClass181Array1[local13].method3745();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static111.aClass181Array1[local13].anInt4704;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static111.aClass181Array1[local13].anInt4714;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static111.aClass181Array1[local13].anInt4710;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static111.aClass181Array1[local13].anInt4713;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static111.aClass181Array1[local13].anInt4715;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray177[--anInt3072];
											local19 = Static111.aClass181Array1[local13].method3748();
											anIntArray177[anInt3072++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray177[--anInt3072];
											local19 = Static111.aClass181Array1[local13].method3748();
											anIntArray177[anInt3072++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray177[--anInt3072];
											local19 = Static111.aClass181Array1[local13].method3748();
											anIntArray177[anInt3072++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray177[--anInt3072];
											local19 = Static111.aClass181Array1[local13].method3748();
											anIntArray177[anInt3072++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt3072 -= 5;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											local25 = anIntArray177[anInt3072 + 2];
											local353 = anIntArray177[anInt3072 + 3];
											local2290 = anIntArray177[anInt3072 + 4];
											anIntArray177[anInt3072++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
											return;
										}
										@Pc(6991) long local6991;
										@Pc(6984) long local6984;
										if (arg0 == 4007) {
											anInt3072 -= 2;
											local6984 = anIntArray177[anInt3072];
											local6991 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = (int) (local6984 + local6984 * local6991 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											if (local13 == 0) {
												anIntArray177[anInt3072++] = 0;
												return;
											}
											anIntArray177[anInt3072++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											if (local13 == 0) {
												anIntArray177[anInt3072++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray177[anInt3072++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray177[anInt3072++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt3072 -= 3;
											local6984 = anIntArray177[anInt3072];
											local6991 = anIntArray177[anInt3072 + 1];
											@Pc(7372) long local7372 = (long) anIntArray177[anInt3072 + 2];
											anIntArray177[anInt3072++] = (int) (local6984 * local7372 / local6991);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local3888 = aStringArray20[--anInt3077];
											local19 = anIntArray177[--anInt3072];
											aStringArray20[anInt3077++] = local3888 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt3077 -= 2;
											local3888 = aStringArray20[anInt3077];
											local1101 = aStringArray20[anInt3077 + 1];
											aStringArray20[anInt3077++] = local3888 + local1101;
											return;
										}
										if (arg0 == 4102) {
											local3888 = aStringArray20[--anInt3077];
											local19 = anIntArray177[--anInt3072];
											aStringArray20[anInt3077++] = local3888 + Static305.method3795(local19);
											return;
										}
										if (arg0 == 4103) {
											local3888 = aStringArray20[--anInt3077];
											aStringArray20[anInt3077++] = local3888.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray20[anInt3077++] = method2472(anIntArray177[--anInt3072]);
											return;
										}
										if (arg0 == 4105) {
											anInt3077 -= 2;
											local3888 = aStringArray20[anInt3077];
											local1101 = aStringArray20[anInt3077 + 1];
											if (Static220.aClass2_Sub1_Sub3_Sub2_1.aClass270_1 != null && Static220.aClass2_Sub1_Sub3_Sub2_1.aClass270_1.aBoolean503) {
												aStringArray20[anInt3077++] = local1101;
												return;
											}
											aStringArray20[anInt3077++] = local3888;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray177[--anInt3072];
											aStringArray20[anInt3077++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt3077 -= 2;
											anIntArray177[anInt3072++] = Static328.method6026(aStringArray20[anInt3077 + 1], aStringArray20[anInt3077], Static38.anInt4834);
											return;
										}
										@Pc(7655) Class14 local7655;
										if (arg0 == 4108) {
											local3888 = aStringArray20[--anInt3077];
											anInt3072 -= 2;
											local19 = anIntArray177[anInt3072];
											local25 = anIntArray177[anInt3072 + 1];
											local7655 = Static215.method2844(local25, Static281.aClass243_250);
											anIntArray177[anInt3072++] = local7655.method284(local19, local3888, Static107.aClass49Array5);
											return;
										}
										if (arg0 == 4109) {
											local3888 = aStringArray20[--anInt3077];
											anInt3072 -= 2;
											local19 = anIntArray177[anInt3072];
											local25 = anIntArray177[anInt3072 + 1];
											local7655 = Static215.method2844(local25, Static281.aClass243_250);
											anIntArray177[anInt3072++] = local7655.method285(local19, local3888, Static107.aClass49Array5);
											return;
										}
										if (arg0 == 4110) {
											anInt3077 -= 2;
											local3888 = aStringArray20[anInt3077];
											local1101 = aStringArray20[anInt3077 + 1];
											if (anIntArray177[--anInt3072] == 1) {
												aStringArray20[anInt3077++] = local3888;
												return;
											}
											aStringArray20[anInt3077++] = local1101;
											return;
										}
										if (arg0 == 4111) {
											local3888 = aStringArray20[--anInt3077];
											aStringArray20[anInt3077++] = Static5.method81(local3888);
											return;
										}
										if (arg0 == 4112) {
											local3888 = aStringArray20[--anInt3077];
											local19 = anIntArray177[--anInt3072];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray20[anInt3077++] = local3888 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static379.method3487((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static392.method5127((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static454.method5955((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static169.method2348((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local3888 = aStringArray20[--anInt3077];
											if (local3888 != null) {
												anIntArray177[anInt3072++] = local3888.length();
												return;
											}
											anIntArray177[anInt3072++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local3888 = aStringArray20[--anInt3077];
											anInt3072 -= 2;
											local19 = anIntArray177[anInt3072];
											local25 = anIntArray177[anInt3072 + 1];
											aStringArray20[anInt3077++] = local3888.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local3888 = aStringArray20[--anInt3077];
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
											aStringArray20[anInt3077++] = local8018.toString();
											return;
										}
										if (arg0 == 4120) {
											local3888 = aStringArray20[--anInt3077];
											anInt3072 -= 2;
											local19 = anIntArray177[anInt3072];
											local25 = anIntArray177[anInt3072 + 1];
											anIntArray177[anInt3072++] = local3888.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt3077 -= 2;
											local3888 = aStringArray20[anInt3077];
											local1101 = aStringArray20[anInt3077 + 1];
											local25 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = local3888.indexOf(local1101, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray177[--anInt3072] != 0;
											local19 = anIntArray177[--anInt3072];
											aStringArray20[anInt3077++] = Static222.method2921(0, local412, (long) local19, Static38.anInt4834);
											return;
										}
										if (arg0 == 4125) {
											local3888 = aStringArray20[--anInt3077];
											local19 = anIntArray177[--anInt3072];
											@Pc(8241) Class14 local8241 = Static215.method2844(local19, Static281.aClass243_250);
											anIntArray177[anInt3072++] = local8241.method282(Static107.aClass49Array5, local3888);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray177[--anInt3072];
											aStringArray20[anInt3077++] = Static306.aClass67_3.method1452(local13).aString5;
											return;
										}
										@Pc(8303) Class40 local8303;
										if (arg0 == 4201) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											local8303 = Static306.aClass67_3.method1452(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray5[local19 - 1] != null) {
												aStringArray20[anInt3077++] = local8303.aStringArray5[local19 - 1];
												return;
											}
											aStringArray20[anInt3077++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											local8303 = Static306.aClass67_3.method1452(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray6[local19 - 1] != null) {
												aStringArray20[anInt3077++] = local8303.aStringArray6[local19 - 1];
												return;
											}
											aStringArray20[anInt3077++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static306.aClass67_3.method1452(local13).anInt1176;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static306.aClass67_3.method1452(local13).anInt1182 == 1 ? 1 : 0;
											return;
										}
										@Pc(8466) Class40 local8466;
										if (arg0 == 4205) {
											local13 = anIntArray177[--anInt3072];
											local8466 = Static306.aClass67_3.method1452(local13);
											if (local8466.anInt1190 == -1 && local8466.anInt1140 >= 0) {
												anIntArray177[anInt3072++] = local8466.anInt1140;
												return;
											}
											anIntArray177[anInt3072++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray177[--anInt3072];
											local8466 = Static306.aClass67_3.method1452(local13);
											if (local8466.anInt1190 >= 0 && local8466.anInt1140 >= 0) {
												anIntArray177[anInt3072++] = local8466.anInt1140;
												return;
											}
											anIntArray177[anInt3072++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray177[--anInt3072];
											anIntArray177[anInt3072++] = Static306.aClass67_3.method1452(local13).aBoolean94 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											local3017 = Static1.aClass33_3.method788(local19);
											if (local3017.method3406()) {
												aStringArray20[anInt3077++] = Static306.aClass67_3.method1452(local13).method980(local3017.aString51, local19);
												return;
											}
											anIntArray177[anInt3072++] = Static306.aClass67_3.method1452(local13).method969(local19, local3017.anInt4273);
											return;
										}
										if (arg0 == 4209) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1] - 1;
											local8303 = Static306.aClass67_3.method1452(local13);
											if (local8303.anInt1163 == local19) {
												anIntArray177[anInt3072++] = local8303.anInt1132;
												return;
											}
											if (local8303.anInt1184 == local19) {
												anIntArray177[anInt3072++] = local8303.anInt1171;
												return;
											}
											anIntArray177[anInt3072++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local3888 = aStringArray20[--anInt3077];
											local19 = anIntArray177[--anInt3072];
											Static72.method1072(local3888, local19 == 1);
											anIntArray177[anInt3072++] = Static52.anInt930;
											return;
										}
										if (arg0 == 4211) {
											if (Static244.aShortArray63 != null && Static15.anInt343 < Static52.anInt930) {
												anIntArray177[anInt3072++] = Static244.aShortArray63[Static15.anInt343++] & 0xFFFF;
												return;
											}
											anIntArray177[anInt3072++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static15.anInt343 = 0;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											local3017 = Static1.aClass33_3.method788(local19);
											if (local3017.method3406()) {
												aStringArray20[anInt3077++] = Static196.aClass180_1.method3713(local13).method2778(local3017.aString51, local19);
												return;
											}
											anIntArray177[anInt3072++] = Static196.aClass180_1.method3713(local13).method2786(local3017.anInt4273, local19);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											local3017 = Static1.aClass33_3.method788(local19);
											if (local3017.method3406()) {
												aStringArray20[anInt3077++] = Static398.aClass256_4.method5782(local13).method2395(local19, local3017.aString51);
												return;
											}
											anIntArray177[anInt3072++] = Static398.aClass256_4.method5782(local13).method2405(local3017.anInt4273, local19);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt3072 -= 2;
											local13 = anIntArray177[anInt3072];
											local19 = anIntArray177[anInt3072 + 1];
											local3017 = Static1.aClass33_3.method788(local19);
											if (local3017.method3406()) {
												aStringArray20[anInt3077++] = Static294.aClass58_1.method1318(local13).method3446(local3017.aString51, local19);
												return;
											}
											anIntArray177[anInt3072++] = Static294.aClass58_1.method1318(local13).method3450(local3017.anInt4273, local19);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray177[--anInt3072];
										@Pc(8967) Class133 local8967 = Static27.aClass149_1.method3043(local13);
										if (local8967.anIntArray214 != null && local8967.anIntArray214.length > 0) {
											local25 = 0;
											local353 = local8967.anIntArray215[0];
											for (local2290 = 1; local2290 < local8967.anIntArray214.length; local2290++) {
												if (local8967.anIntArray215[local2290] > local353) {
													local25 = local2290;
													local353 = local8967.anIntArray215[local2290];
												}
											}
											anIntArray177[anInt3072++] = local8967.anIntArray214[local25];
											return;
										}
										anIntArray177[anInt3072++] = local8967.anInt3525;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static213.method2817(anIntArray177[--anInt3072]);
						} else {
							local137 = arg1 ? aClass76_7 : aClass76_8;
						}
						if (arg0 == 1300) {
							local19 = anIntArray177[--anInt3072] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method1685(local19, aStringArray20[--anInt3077]);
								return;
							}
							anInt3077--;
							return;
						}
						if (arg0 == 1301) {
							anInt3072 -= 2;
							local19 = anIntArray177[anInt3072];
							local25 = anIntArray177[anInt3072 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass76_5 = null;
								return;
							}
							local137.aClass76_5 = Static371.method4859(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray177[--anInt3072];
							if (local19 != Static39.anInt737 && local19 != Static72.anInt1283 && local19 != Static462.anInt7531) {
								return;
							}
							local137.anInt2081 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt2059 = anIntArray177[--anInt3072];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt2074 = anIntArray177[--anInt3072];
							return;
						}
						if (arg0 == 1305) {
							local137.aString17 = aStringArray20[--anInt3077];
							return;
						}
						if (arg0 == 1306) {
							local137.aString18 = aStringArray20[--anInt3077];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray14 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt2066 = anIntArray177[--anInt3072];
							local137.anInt2055 = anIntArray177[--anInt3072];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray177[--anInt3072];
							local25 = anIntArray177[--anInt3072];
							if (local25 >= 1 && local25 <= 10) {
								local137.method1675(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString20 = aStringArray20[--anInt3077];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt2121 = anIntArray177[--anInt3072];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt3072 -= 3;
								local19 = anIntArray177[anInt3072] - 1;
								local25 = anIntArray177[anInt3072 + 1];
								local353 = anIntArray177[anInt3072 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt3072 -= 2;
								local19 = 10;
								local25 = anIntArray177[anInt3072];
								local353 = anIntArray177[anInt3072 + 1];
							}
							if (local137.aByteArray28 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray28 = new byte[11];
								local137.aByteArray29 = new byte[11];
								local137.anIntArray105 = new int[11];
							}
							local137.aByteArray28[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean141 = false;
								for (local2290 = 0; local2290 < local137.aByteArray28.length; local2290++) {
									if (local137.aByteArray28[local2290] != 0) {
										local137.aBoolean141 = true;
										break;
									}
								}
							} else {
								local137.aBoolean141 = true;
							}
							local137.aByteArray29[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt2090 = anIntArray177[--anInt3072];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static213.method2817(anIntArray177[--anInt3072]);
					} else {
						local137 = arg1 ? aClass76_7 : aClass76_8;
					}
					Static53.method833(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt3072 -= 2;
						local19 = anIntArray177[anInt3072];
						local25 = anIntArray177[anInt3072 + 1];
						if (local137.anInt2115 == -1) {
							Static301.method3746(local137.anInt2100);
							Static255.method3309(local137.anInt2100);
							Static75.method1125(local137.anInt2100);
						}
						if (local19 == -1) {
							local137.anInt2134 = 1;
							local137.anInt2053 = -1;
							local137.anInt2057 = -1;
							return;
						}
						local137.anInt2057 = local19;
						local137.anInt2125 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean154 = true;
						} else {
							local137.aBoolean154 = false;
						}
						@Pc(1630) Class40 local1630 = Static306.aClass67_3.method1452(local19);
						local137.anInt2093 = local1630.anInt1169;
						local137.anInt2117 = local1630.anInt1186;
						local137.anInt2069 = local1630.anInt1127;
						local137.anInt2092 = local1630.anInt1188;
						local137.anInt2078 = local1630.anInt1150;
						local137.anInt2137 = local1630.anInt1170;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt2086 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt2086 = 1;
						} else {
							local137.anInt2086 = 2;
						}
						if (local137.anInt2095 > 0) {
							local137.anInt2137 = local137.anInt2137 * 32 / local137.anInt2095;
							return;
						}
						if (local137.anInt2075 > 0) {
							local137.anInt2137 = local137.anInt2137 * 32 / local137.anInt2075;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt2134 = 2;
						local137.anInt2053 = anIntArray177[--anInt3072];
						if (local137.anInt2115 == -1) {
							Static91.method1312(local137.anInt2100);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt2134 = 3;
						local137.anInt2053 = -1;
						if (local137.anInt2115 == -1) {
							Static91.method1312(local137.anInt2100);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt2134 = 6;
						local137.anInt2053 = anIntArray177[--anInt3072];
						if (local137.anInt2115 == -1) {
							Static91.method1312(local137.anInt2100);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt2134 = 5;
						local137.anInt2053 = anIntArray177[--anInt3072];
						if (local137.anInt2115 == -1) {
							Static91.method1312(local137.anInt2100);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt3072 -= 4;
						local137.anInt2103 = anIntArray177[anInt3072];
						local137.anInt2073 = anIntArray177[anInt3072 + 1];
						local137.anInt2097 = anIntArray177[anInt3072 + 2];
						local137.anInt2139 = anIntArray177[anInt3072 + 3];
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt3072 -= 2;
						local137.anInt2101 = anIntArray177[anInt3072];
						local137.anInt2087 = anIntArray177[anInt3072 + 1];
						Static53.method833(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt3072 -= 4;
						local137.anInt2053 = anIntArray177[anInt3072];
						local137.anInt2129 = anIntArray177[anInt3072 + 1];
						if (anIntArray177[anInt3072 + 2] == 1) {
							local137.anInt2134 = 9;
						} else {
							local137.anInt2134 = 8;
						}
						if (anIntArray177[anInt3072 + 3] == 1) {
							local137.aBoolean154 = true;
						} else {
							local137.aBoolean154 = false;
						}
						if (local137.anInt2115 == -1) {
							Static91.method1312(local137.anInt2100);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt2134 = 5;
						local137.anInt2053 = Static43.anInt5302;
						local137.anInt2129 = 0;
						if (local137.anInt2115 == -1) {
							Static91.method1312(local137.anInt2100);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static213.method2817(anIntArray177[--anInt3072]);
				} else {
					local137 = arg1 ? aClass76_7 : aClass76_8;
				}
				if (arg0 == 1000) {
					anInt3072 -= 4;
					local137.anInt2071 = anIntArray177[anInt3072];
					local137.anInt2102 = anIntArray177[anInt3072 + 1];
					local19 = anIntArray177[anInt3072 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray177[anInt3072 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte18 = (byte) local19;
					local137.aByte20 = (byte) local25;
					Static53.method833(local137);
					Static225.method2960(local137);
					if (local137.anInt2115 == -1) {
						Static60.method954(local137.anInt2100);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt3072 -= 4;
					local137.anInt2075 = anIntArray177[anInt3072];
					local137.anInt2077 = anIntArray177[anInt3072 + 1];
					local137.anInt2095 = 0;
					local137.anInt2091 = 0;
					local19 = anIntArray177[anInt3072 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray177[anInt3072 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte17 = (byte) local19;
					local137.aByte19 = (byte) local25;
					Static53.method833(local137);
					Static225.method2960(local137);
					if (local137.anInt2060 == 0) {
						Static125.method1758(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray177[--anInt3072] == 1;
					if (local137.aBoolean143 != local620) {
						local137.aBoolean143 = local620;
						Static53.method833(local137);
					}
					if (local137.anInt2115 == -1) {
						Static127.method1775(local137.anInt2100);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt3072 -= 2;
					local137.anInt2104 = anIntArray177[anInt3072];
					local137.anInt2098 = anIntArray177[anInt3072 + 1];
					Static53.method833(local137);
					Static225.method2960(local137);
					if (local137.anInt2060 == 0) {
						Static125.method1758(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean139 = anIntArray177[--anInt3072] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!tr;I)V")
	private static void method2479(@OriginalArg(0) Class5_Sub2_Sub17 arg0, @OriginalArg(1) int arg1) {
		anInt3072 = 0;
		anInt3077 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray461;
		@Pc(11) int[] local11 = arg0.anIntArray460;
		@Pc(13) byte local13 = -1;
		anInt3079 = 0;
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
						method2478(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method2477(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray177[anInt3072++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray177[anInt3072++] = Static408.aClass39_1.anIntArray48[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static408.aClass39_1.method962(anIntArray177[--anInt3072], local54);
					} else if (local31 == 3) {
						aStringArray20[anInt3077++] = arg0.aStringArray43[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt3072 -= 2;
						if (anIntArray177[anInt3072] != anIntArray177[anInt3072 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt3072 -= 2;
						if (anIntArray177[anInt3072] == anIntArray177[anInt3072 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt3072 -= 2;
						if (anIntArray177[anInt3072] < anIntArray177[anInt3072 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt3072 -= 2;
						if (anIntArray177[anInt3072] > anIntArray177[anInt3072 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt3079 == 0) {
							return;
						}
						@Pc(216) Class4 local216 = aClass4Array1[--anInt3079];
						arg0 = local216.aClass5_Sub2_Sub17_1;
						local8 = arg0.anIntArray461;
						local11 = arg0.anIntArray460;
						local5 = local216.anInt49;
						anIntArray175 = local216.anIntArray3;
						aStringArray19 = local216.aStringArray1;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray177[anInt3072++] = Static408.aClass39_1.method959(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static408.aClass39_1.method960(anIntArray177[--anInt3072], local54);
					} else if (local31 == 31) {
						anInt3072 -= 2;
						if (anIntArray177[anInt3072] <= anIntArray177[anInt3072 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt3072 -= 2;
						if (anIntArray177[anInt3072] >= anIntArray177[anInt3072 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray177[anInt3072++] = anIntArray175[local11[local5]];
					} else if (local31 == 34) {
						anIntArray175[local11[local5]] = anIntArray177[--anInt3072];
					} else if (local31 == 35) {
						aStringArray20[anInt3077++] = aStringArray19[local11[local5]];
					} else if (local31 == 36) {
						aStringArray19[local11[local5]] = aStringArray20[--anInt3077];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt3077 -= local54;
						@Pc(400) String local400 = Static158.method2221(local54, anInt3077, aStringArray20);
						aStringArray20[anInt3077++] = local400;
					} else if (local31 == 38) {
						anInt3072--;
					} else if (local31 == 39) {
						anInt3077--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class5_Sub2_Sub17 local436 = Static6.method96(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt6495];
							@Pc(450) String[] local450 = new String[local436.anInt6490];
							for (local452 = 0; local452 < local436.anInt6494; local452++) {
								local446[local452] = anIntArray177[anInt3072 + local452 - local436.anInt6494];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt6492; local471++) {
								local450[local471] = aStringArray20[anInt3077 + local471 - local436.anInt6492];
							}
							anInt3072 -= local436.anInt6494;
							anInt3077 -= local436.anInt6492;
							@Pc(502) Class4 local502 = new Class4();
							local502.aClass5_Sub2_Sub17_1 = arg0;
							local502.anInt49 = local5;
							local502.anIntArray3 = anIntArray175;
							local502.aStringArray1 = aStringArray19;
							if (anInt3079 >= aClass4Array1.length) {
								throw new RuntimeException();
							}
							aClass4Array1[anInt3079++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray461;
							local11 = local436.anIntArray460;
							local5 = -1;
							anIntArray175 = local446;
							aStringArray19 = local450;
						} else if (local31 == 42) {
							anIntArray177[anInt3072++] = Static174.anIntArray171[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static174.anIntArray171[local54] = anIntArray177[--anInt3072];
							Static451.method5942(local54);
							Static264.aBoolean278 |= Static14.aBooleanArray2[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray177[--anInt3072];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray176[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray20[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray177[--anInt3072];
							if (local603 < 0 || local603 >= anIntArray176[local54]) {
								throw new RuntimeException();
							}
							anIntArray177[anInt3072++] = anIntArrayArray20[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt3072 -= 2;
							local603 = anIntArray177[anInt3072];
							if (local603 < 0 || local603 >= anIntArray176[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray20[local54][local603] = anIntArray177[anInt3072 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static124.aStringArray15[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray20[anInt3077++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static124.aStringArray15[local54] = aStringArray20[--anInt3077];
							Static438.method5778(local54);
						} else if (local31 == 51) {
							@Pc(774) Class252 local774 = arg0.aClass252Array1[local11[local5]];
							@Pc(787) Class5_Sub34 local787 = (Class5_Sub34) local774.method5659((long) anIntArray177[--anInt3072]);
							if (local787 != null) {
								local5 += local787.anInt5642;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString68 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong234).append(" ");
				for (local603 = anInt3079 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass4Array1[local603].aClass5_Sub2_Sub17_1.aLong234).append(" ");
				}
				local855.append("op: ").append(local13);
				Static206.method2769(local855.toString(), local837);
			} else {
				Static411.method5422("Clientscript error in: " + arg0.aString68);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString68).append("\n");
				for (local603 = anInt3079 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass4Array1[local603].aClass5_Sub2_Sub17_1.aString68).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static206.method2769(local855.toString(), local837);
				Static143.method2070(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(IZ)V")
	public static void method2480() {
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!qr;I)V")
	private static void method2481(@OriginalArg(0) Class5_Sub33 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray35;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class5_Sub2_Sub17 local12 = Static6.method96(local8);
		if (local12 == null) {
			return;
		}
		anIntArray175 = new int[local12.anInt6495];
		@Pc(21) int local21 = 0;
		aStringArray19 = new String[local12.anInt6490];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt5627;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt5630;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass76_12 == null ? -1 : arg0.aClass76_12.anInt2100;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt5632;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass76_12 == null ? -1 : arg0.aClass76_12.anInt2115;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass76_11 == null ? -1 : arg0.aClass76_11.anInt2100;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass76_11 == null ? -1 : arg0.aClass76_11.anInt2115;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt5635;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt5634;
				}
				anIntArray175[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString61;
				}
				aStringArray19[local27++] = local135;
			}
		}
		anInt3080 = arg0.anInt5628;
		method2479(local12, arg1);
	}
}
