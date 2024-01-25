import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!uw", name = "n", descriptor = "Lclient!kp;")
	private static Class196 aClass196_12;

	@OriginalMember(owner = "client!uw", name = "r", descriptor = "[I")
	private static int[] anIntArray651;

	@OriginalMember(owner = "client!uw", name = "t", descriptor = "Lclient!oe;")
	private static Class240 aClass240_1;

	@OriginalMember(owner = "client!uw", name = "v", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray172;

	@OriginalMember(owner = "client!uw", name = "x", descriptor = "Lclient!kp;")
	private static Class196 aClass196_13;

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
	private static int anInt9006 = 0;

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "[Lclient!qf;")
	private static final Class268[] aClass268Array1 = new Class268[50];

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "[[I")
	private static final int[][] anIntArrayArray62 = new int[5][5000];

	@OriginalMember(owner = "client!uw", name = "h", descriptor = "I")
	private static int anInt9010 = 0;

	@OriginalMember(owner = "client!uw", name = "j", descriptor = "I")
	private static int anInt9012 = 0;

	@OriginalMember(owner = "client!uw", name = "m", descriptor = "[I")
	private static final int[] anIntArray650 = new int[5];

	@OriginalMember(owner = "client!uw", name = "p", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!uw", name = "q", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray171 = new String[1000];

	@OriginalMember(owner = "client!uw", name = "w", descriptor = "[I")
	private static final int[] anIntArray652 = new int[1000];

	@OriginalMember(owner = "client!uw", name = "z", descriptor = "Lclient!tb;")
	public static final Class313 aClass313_58 = new Class313(4);

	@OriginalMember(owner = "client!uw", name = "A", descriptor = "[I")
	private static final int[] anIntArray653 = new int[3];

	@OriginalMember(owner = "client!uw", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray173 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!uw", name = "C", descriptor = "I")
	private static int anInt9019 = 0;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method7487(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static210.anInt4045 == 0 && (Static216.aBoolean339 && !Static500.aBoolean652 || Static532.aBoolean675)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static290.aClass198_49.method4365(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static290.aClass198_49.method4365(0).length());
		} else if (local11.startsWith(Static290.aClass198_50.method4365(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static290.aClass198_50.method4365(0).length());
		} else if (local11.startsWith(Static290.aClass198_51.method4365(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static290.aClass198_51.method4365(0).length());
		} else if (local11.startsWith(Static290.aClass198_52.method4365(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static290.aClass198_52.method4365(0).length());
		} else if (local11.startsWith(Static290.aClass198_53.method4365(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static290.aClass198_53.method4365(0).length());
		} else if (local11.startsWith(Static290.aClass198_54.method4365(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static290.aClass198_54.method4365(0).length());
		} else if (local11.startsWith(Static290.aClass198_55.method4365(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static290.aClass198_55.method4365(0).length());
		} else if (local11.startsWith(Static290.aClass198_56.method4365(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static290.aClass198_56.method4365(0).length());
		} else if (local11.startsWith(Class198.lb.method4365(0))) {
			local13 = 8;
			arg0 = arg0.substring(Class198.lb.method4365(0).length());
		} else if (local11.startsWith(Static290.aClass198_57.method4365(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static290.aClass198_57.method4365(0).length());
		} else if (local11.startsWith(Static290.aClass198_58.method4365(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static290.aClass198_58.method4365(0).length());
		} else if (local11.startsWith(Static290.aClass198_59.method4365(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static290.aClass198_59.method4365(0).length());
		} else if (Static52.anInt1264 != 0) {
			if (local11.startsWith(Static290.aClass198_49.method4365(Static52.anInt1264))) {
				local13 = 0;
				arg0 = arg0.substring(Static290.aClass198_49.method4365(Static52.anInt1264).length());
			} else if (local11.startsWith(Static290.aClass198_50.method4365(Static52.anInt1264))) {
				local13 = 1;
				arg0 = arg0.substring(Static290.aClass198_50.method4365(Static52.anInt1264).length());
			} else if (local11.startsWith(Static290.aClass198_51.method4365(Static52.anInt1264))) {
				local13 = 2;
				arg0 = arg0.substring(Static290.aClass198_51.method4365(Static52.anInt1264).length());
			} else if (local11.startsWith(Static290.aClass198_52.method4365(Static52.anInt1264))) {
				local13 = 3;
				arg0 = arg0.substring(Static290.aClass198_52.method4365(Static52.anInt1264).length());
			} else if (local11.startsWith(Static290.aClass198_53.method4365(Static52.anInt1264))) {
				local13 = 4;
				arg0 = arg0.substring(Static290.aClass198_53.method4365(Static52.anInt1264).length());
			} else if (local11.startsWith(Static290.aClass198_54.method4365(Static52.anInt1264))) {
				local13 = 5;
				arg0 = arg0.substring(Static290.aClass198_54.method4365(Static52.anInt1264).length());
			} else if (local11.startsWith(Static290.aClass198_55.method4365(Static52.anInt1264))) {
				local13 = 6;
				arg0 = arg0.substring(Static290.aClass198_55.method4365(Static52.anInt1264).length());
			} else if (local11.startsWith(Static290.aClass198_56.method4365(Static52.anInt1264))) {
				local13 = 7;
				arg0 = arg0.substring(Static290.aClass198_56.method4365(Static52.anInt1264).length());
			} else if (local11.startsWith(Class198.lb.method4365(Static52.anInt1264))) {
				local13 = 8;
				arg0 = arg0.substring(Class198.lb.method4365(Static52.anInt1264).length());
			} else if (local11.startsWith(Static290.aClass198_57.method4365(Static52.anInt1264))) {
				local13 = 9;
				arg0 = arg0.substring(Static290.aClass198_57.method4365(Static52.anInt1264).length());
			} else if (local11.startsWith(Static290.aClass198_58.method4365(Static52.anInt1264))) {
				local13 = 10;
				arg0 = arg0.substring(Static290.aClass198_58.method4365(Static52.anInt1264).length());
			} else if (local11.startsWith(Static290.aClass198_59.method4365(Static52.anInt1264))) {
				local13 = 11;
				arg0 = arg0.substring(Static290.aClass198_59.method4365(Static52.anInt1264).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static290.aClass198_60.method4365(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static290.aClass198_60.method4365(0).length());
		} else if (local11.startsWith(Static290.aClass198_61.method4365(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static290.aClass198_61.method4365(0).length());
		} else if (local11.startsWith(Static290.aClass198_62.method4365(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static290.aClass198_62.method4365(0).length());
		} else if (local11.startsWith(Static290.aClass198_63.method4365(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static290.aClass198_63.method4365(0).length());
		} else if (local11.startsWith(Static290.aClass198_64.method4365(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static290.aClass198_64.method4365(0).length());
		} else if (Static52.anInt1264 != 0) {
			if (local11.startsWith(Static290.aClass198_60.method4365(Static52.anInt1264))) {
				local451 = 1;
				arg0 = arg0.substring(Static290.aClass198_60.method4365(Static52.anInt1264).length());
			} else if (local11.startsWith(Static290.aClass198_61.method4365(Static52.anInt1264))) {
				local451 = 2;
				arg0 = arg0.substring(Static290.aClass198_61.method4365(Static52.anInt1264).length());
			} else if (local11.startsWith(Static290.aClass198_62.method4365(Static52.anInt1264))) {
				local451 = 3;
				arg0 = arg0.substring(Static290.aClass198_62.method4365(Static52.anInt1264).length());
			} else if (local11.startsWith(Static290.aClass198_63.method4365(Static52.anInt1264))) {
				local451 = 4;
				arg0 = arg0.substring(Static290.aClass198_63.method4365(Static52.anInt1264).length());
			} else if (local11.startsWith(Static290.aClass198_64.method4365(Static52.anInt1264))) {
				local451 = 5;
				arg0 = arg0.substring(Static290.aClass198_64.method4365(Static52.anInt1264).length());
			}
		}
		@Pc(641) Class2_Sub42 local641 = Static249.method3910(Static202.aClass286_63, Static400.aClass145_2);
		local641.aClass2_Sub15_Sub2_2.method4333(0);
		@Pc(650) int local650 = local641.aClass2_Sub15_Sub2_2.anInt5241;
		local641.aClass2_Sub15_Sub2_2.method4333(local13);
		local641.aClass2_Sub15_Sub2_2.method4333(local451);
		Static276.method3095(arg0, local641.aClass2_Sub15_Sub2_2);
		local641.aClass2_Sub15_Sub2_2.method4311(local641.aClass2_Sub15_Sub2_2.anInt5241 - local650);
		Static531.method7296(local641);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V")
	public static void method7488(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static168.method2918(arg0)) {
			return;
		}
		@Pc(12) Class196[] local12 = Static2.aClass196ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class196 local19 = local12[local14];
			if (local19.anObjectArray20 != null) {
				@Pc(26) Class2_Sub31 local26 = new Class2_Sub31();
				local26.aClass196_4 = local19;
				local26.anObjectArray32 = local19.anObjectArray20;
				method7499(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)V")
	private static void method7489(@OriginalArg(0) int arg0) {
		@Pc(3) Class196 local3 = Static117.method1748(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class196[] local13 = Static348.aClass196ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class196[] local19 = Static2.aClass196ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static348.aClass196ArrayArray2[local9] = new Class196[local22];
			Static598.method1131(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static598.method1131(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!mea;)V")
	public static void method7490(@OriginalArg(0) Class2_Sub31 arg0) {
		method7499(arg0, 200000);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IZ)V")
	private static void method7491(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class2_Sub42 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray652[anInt9012++] = Static138.anInt2874;
				return;
			}
			if (arg0 == 5001) {
				anInt9012 -= 3;
				Static138.anInt2874 = anIntArray652[anInt9012];
				Static196.aClass315_5 = Static475.method6745(anIntArray652[anInt9012 + 1]);
				if (Static196.aClass315_5 == null) {
					Static196.aClass315_5 = Static389.aClass315_8;
				}
				Static3.anInt12 = anIntArray652[anInt9012 + 2];
				local52 = Static249.method3910(Static378.aClass286_118, Static400.aClass145_2);
				local52.aClass2_Sub15_Sub2_2.method4333(Static138.anInt2874);
				local52.aClass2_Sub15_Sub2_2.method4333(Static196.aClass315_5.anInt8431);
				local52.aClass2_Sub15_Sub2_2.method4333(Static3.anInt12);
				Static531.method7296(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt9010 -= 2;
				local83 = aStringArray171[anInt9010];
				local89 = aStringArray171[anInt9010 + 1];
				anInt9012 -= 2;
				local97 = anIntArray652[anInt9012];
				local103 = anIntArray652[anInt9012 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class2_Sub42 local125 = Static249.method3910(Static43.aClass286_138, Static400.aClass145_2);
				local125.aClass2_Sub15_Sub2_2.method4333(Static71.method1162(local83) + Static71.method1162(local89) + 2);
				local125.aClass2_Sub15_Sub2_2.method4313(local83);
				local125.aClass2_Sub15_Sub2_2.method4333(local97 - 1);
				local125.aClass2_Sub15_Sub2_2.method4333(local103);
				local125.aClass2_Sub15_Sub2_2.method4313(local89);
				Static531.method7296(local125);
				return;
			}
			@Pc(179) Class295 local179;
			if (arg0 == 5003) {
				local175 = anIntArray652[--anInt9012];
				local179 = Static23.method437(local175);
				local181 = "";
				if (local179 != null && local179.aString91 != null) {
					local181 = local179.aString91;
				}
				aStringArray171[anInt9010++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray652[--anInt9012];
				local179 = Static23.method437(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8178;
				}
				anIntArray652[anInt9012++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static196.aClass315_5 == null) {
					anIntArray652[anInt9012++] = -1;
					return;
				}
				anIntArray652[anInt9012++] = Static196.aClass315_5.anInt8431;
				return;
			}
			@Pc(269) Class2_Sub42 local269;
			if (arg0 == 5006) {
				local175 = anIntArray652[--anInt9012];
				local269 = Static249.method3910(Static221.aClass286_69, Static400.aClass145_2);
				local269.aClass2_Sub15_Sub2_2.method4333(local175);
				Static531.method7296(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray171[--anInt9010];
				method7487(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt9010 -= 2;
				local83 = aStringArray171[anInt9010];
				local89 = aStringArray171[anInt9010 + 1];
				if (Static210.anInt4045 != 0 || (!Static216.aBoolean339 || Static500.aBoolean652) && !Static532.aBoolean675) {
					@Pc(328) Class2_Sub42 local328 = Static249.method3910(Static317.aClass286_103, Static400.aClass145_2);
					local328.aClass2_Sub15_Sub2_2.method4333(0);
					local103 = local328.aClass2_Sub15_Sub2_2.anInt5241;
					local328.aClass2_Sub15_Sub2_2.method4313(local83);
					Static276.method3095(local89, local328.aClass2_Sub15_Sub2_2);
					local328.aClass2_Sub15_Sub2_2.method4311(local328.aClass2_Sub15_Sub2_2.anInt5241 - local103);
					Static531.method7296(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray652[--anInt9012];
				local179 = Static23.method437(local175);
				local181 = "";
				if (local179 != null && local179.aString92 != null) {
					local181 = local179.aString92;
				}
				aStringArray171[anInt9010++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray652[--anInt9012];
				local179 = Static23.method437(local175);
				local181 = "";
				if (local179 != null && local179.aString89 != null) {
					local181 = local179.aString89;
				}
				aStringArray171[anInt9010++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray652[--anInt9012];
				local179 = Static23.method437(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8176;
				}
				anIntArray652[anInt9012++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 == null || Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aString66 == null) {
					local83 = Static392.aString61;
				} else {
					local83 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.method6174();
				}
				aStringArray171[anInt9010++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray652[anInt9012++] = Static3.anInt12;
				return;
			}
			if (arg0 == 5017) {
				anIntArray652[anInt9012++] = Static124.method1802();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray652[--anInt9012];
				local179 = Static23.method437(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt8180;
				}
				anIntArray652[anInt9012++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray652[--anInt9012];
				local179 = Static23.method437(local175);
				local181 = "";
				if (local179 != null && local179.aString88 != null) {
					local181 = local179.aString88;
				}
				aStringArray171[anInt9010++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 == null || Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aString66 == null) {
					local83 = Static392.aString61;
				} else {
					local83 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.method6178();
				}
				aStringArray171[anInt9010++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray652[--anInt9012];
				local179 = Static23.method437(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8174;
				}
				anIntArray652[anInt9012++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray652[--anInt9012];
				local179 = Static23.method437(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8179;
				}
				anIntArray652[anInt9012++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray652[--anInt9012];
				local179 = Static23.method437(local175);
				local181 = "";
				if (local179 != null && local179.aString90 != null) {
					local181 = local179.aString90;
				}
				aStringArray171[anInt9010++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray652[--anInt9012];
				aStringArray171[anInt9010++] = Static336.aClass248_1.method5765(local175).aString70;
				return;
			}
			@Pc(736) Class2_Sub3_Sub14 local736;
			if (arg0 == 5051) {
				local175 = anIntArray652[--anInt9012];
				local736 = Static336.aClass248_1.method5765(local175);
				if (local736.anIntArray516 == null) {
					anIntArray652[anInt9012++] = 0;
					return;
				}
				anIntArray652[anInt9012++] = local736.anIntArray516.length;
				return;
			}
			if (arg0 == 5052) {
				anInt9012 -= 2;
				local175 = anIntArray652[anInt9012];
				local776 = anIntArray652[anInt9012 + 1];
				@Pc(781) Class2_Sub3_Sub14 local781 = Static336.aClass248_1.method5765(local175);
				local103 = local781.anIntArray516[local776];
				anIntArray652[anInt9012++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray652[--anInt9012];
				local736 = Static336.aClass248_1.method5765(local175);
				if (local736.anIntArray515 == null) {
					anIntArray652[anInt9012++] = 0;
					return;
				}
				anIntArray652[anInt9012++] = local736.anIntArray515.length;
				return;
			}
			if (arg0 == 5054) {
				anInt9012 -= 2;
				local175 = anIntArray652[anInt9012];
				local776 = anIntArray652[anInt9012 + 1];
				anIntArray652[anInt9012++] = Static336.aClass248_1.method5765(local175).anIntArray515[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray652[--anInt9012];
				aStringArray171[anInt9010++] = Static541.aClass304_2.method6809(local175).method7363();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray652[--anInt9012];
				@Pc(907) Class2_Sub3_Sub18 local907 = Static541.aClass304_2.method6809(local175);
				if (local907.anIntArray637 == null) {
					anIntArray652[anInt9012++] = 0;
					return;
				}
				anIntArray652[anInt9012++] = local907.anIntArray637.length;
				return;
			}
			if (arg0 == 5057) {
				anInt9012 -= 2;
				local175 = anIntArray652[anInt9012];
				local776 = anIntArray652[anInt9012 + 1];
				anIntArray652[anInt9012++] = Static541.aClass304_2.method6809(local175).anIntArray637[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass240_1 = new Class240();
				aClass240_1.anInt6704 = anIntArray652[--anInt9012];
				aClass240_1.aClass2_Sub3_Sub18_1 = Static541.aClass304_2.method6809(aClass240_1.anInt6704);
				aClass240_1.anIntArray458 = new int[aClass240_1.aClass2_Sub3_Sub18_1.method7368()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static249.method3910(Static477.aClass286_141, Static400.aClass145_2);
				local52.aClass2_Sub15_Sub2_2.method4333(0);
				local776 = local52.aClass2_Sub15_Sub2_2.anInt5241;
				local52.aClass2_Sub15_Sub2_2.method4333(0);
				local52.aClass2_Sub15_Sub2_2.method4350(aClass240_1.anInt6704);
				aClass240_1.aClass2_Sub3_Sub18_1.method7360(aClass240_1.anIntArray458, local52.aClass2_Sub15_Sub2_2);
				local52.aClass2_Sub15_Sub2_2.method4311(local52.aClass2_Sub15_Sub2_2.anInt5241 - local776);
				Static531.method7296(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray171[--anInt9010];
				local269 = Static249.method3910(Static485.aClass286_142, Static400.aClass145_2);
				local269.aClass2_Sub15_Sub2_2.method4333(0);
				local97 = local269.aClass2_Sub15_Sub2_2.anInt5241;
				local269.aClass2_Sub15_Sub2_2.method4313(local83);
				local269.aClass2_Sub15_Sub2_2.method4350(aClass240_1.anInt6704);
				aClass240_1.aClass2_Sub3_Sub18_1.method7360(aClass240_1.anIntArray458, local269.aClass2_Sub15_Sub2_2);
				local269.aClass2_Sub15_Sub2_2.method4311(local269.aClass2_Sub15_Sub2_2.anInt5241 - local97);
				Static531.method7296(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static249.method3910(Static477.aClass286_141, Static400.aClass145_2);
				local52.aClass2_Sub15_Sub2_2.method4333(0);
				local776 = local52.aClass2_Sub15_Sub2_2.anInt5241;
				local52.aClass2_Sub15_Sub2_2.method4333(1);
				local52.aClass2_Sub15_Sub2_2.method4350(aClass240_1.anInt6704);
				aClass240_1.aClass2_Sub3_Sub18_1.method7360(aClass240_1.anIntArray458, local52.aClass2_Sub15_Sub2_2);
				local52.aClass2_Sub15_Sub2_2.method4311(local52.aClass2_Sub15_Sub2_2.anInt5241 - local776);
				Static531.method7296(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt9012 -= 2;
				local175 = anIntArray652[anInt9012];
				local776 = anIntArray652[anInt9012 + 1];
				anIntArray652[anInt9012++] = Static336.aClass248_1.method5765(local175).aCharArray8[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt9012 -= 2;
				local175 = anIntArray652[anInt9012];
				local776 = anIntArray652[anInt9012 + 1];
				anIntArray652[anInt9012++] = Static336.aClass248_1.method5765(local175).aCharArray9[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt9012 -= 2;
				local175 = anIntArray652[anInt9012];
				local776 = anIntArray652[anInt9012 + 1];
				if (local776 == -1) {
					anIntArray652[anInt9012++] = -1;
					return;
				}
				anIntArray652[anInt9012++] = Static336.aClass248_1.method5765(local175).method6395((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt9012 -= 2;
				local175 = anIntArray652[anInt9012];
				local776 = anIntArray652[anInt9012 + 1];
				if (local776 == -1) {
					anIntArray652[anInt9012++] = -1;
					return;
				}
				anIntArray652[anInt9012++] = Static336.aClass248_1.method5765(local175).method6399((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray652[--anInt9012];
				anIntArray652[anInt9012++] = Static541.aClass304_2.method6809(local175).method7368();
				return;
			}
			if (arg0 == 5067) {
				anInt9012 -= 2;
				local175 = anIntArray652[anInt9012];
				local776 = anIntArray652[anInt9012 + 1];
				local97 = Static541.aClass304_2.method6809(local175).method7359(local776).anInt657;
				anIntArray652[anInt9012++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt9012 -= 2;
				local175 = anIntArray652[anInt9012];
				local776 = anIntArray652[anInt9012 + 1];
				aClass240_1.anIntArray458[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt9012 -= 2;
				local175 = anIntArray652[anInt9012];
				local776 = anIntArray652[anInt9012 + 1];
				aClass240_1.anIntArray458[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt9012 -= 3;
				local175 = anIntArray652[anInt9012];
				local776 = anIntArray652[anInt9012 + 1];
				local97 = anIntArray652[anInt9012 + 2];
				@Pc(1448) Class2_Sub3_Sub18 local1448 = Static541.aClass304_2.method6809(local175);
				if (local1448.method7359(local776).anInt657 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray652[anInt9012++] = local1448.method7362(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray171[--anInt9010];
				local1496 = anIntArray652[--anInt9012] == 1;
				Static252.method3935(local83, local1496);
				anIntArray652[anInt9012++] = Static537.anInt8790;
				return;
			}
			if (arg0 == 5072) {
				if (Static384.aShortArray113 != null && Static524.anInt8648 < Static537.anInt8790) {
					anIntArray652[anInt9012++] = Static384.aShortArray113[Static524.anInt8648++] & 0xFFFF;
					return;
				}
				anIntArray652[anInt9012++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static524.anInt8648 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static529.aClass177_10.method4001(86)) {
					anIntArray652[anInt9012++] = 1;
					return;
				}
				anIntArray652[anInt9012++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static529.aClass177_10.method4001(82)) {
					anIntArray652[anInt9012++] = 1;
					return;
				}
				anIntArray652[anInt9012++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static529.aClass177_10.method4001(81)) {
					anIntArray652[anInt9012++] = 1;
					return;
				}
				anIntArray652[anInt9012++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static396.method4005(anIntArray652[--anInt9012]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray652[anInt9012++] = Static56.method940();
					return;
				}
				if (arg0 == 5205) {
					Static196.method3246(anIntArray652[--anInt9012], -1, false, -1);
					return;
				}
				@Pc(1696) Class2_Sub3_Sub3 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray652[--anInt9012];
					local1696 = Static270.method1326(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray652[anInt9012++] = -1;
						return;
					}
					anIntArray652[anInt9012++] = local1696.anInt2215;
					return;
				}
				@Pc(1729) Class2_Sub3_Sub3 local1729;
				if (arg0 == 5207) {
					local1729 = Static270.method1306(anIntArray652[--anInt9012]);
					if (local1729 != null && local1729.aString17 != null) {
						aStringArray171[anInt9010++] = local1729.aString17;
						return;
					}
					aStringArray171[anInt9010++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray652[anInt9012++] = Static532.anInt8741;
					anIntArray652[anInt9012++] = Static87.anInt1840;
					return;
				}
				if (arg0 == 5209) {
					anIntArray652[anInt9012++] = Static549.anInt8926 + Static270.anInt1801;
					anIntArray652[anInt9012++] = Static75.anInt1651 + Static270.anInt1800;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray652[--anInt9012];
					local1696 = Static270.method1306(local175);
					if (local1696 == null) {
						anIntArray652[anInt9012++] = 0;
						anIntArray652[anInt9012++] = 0;
						return;
					}
					anIntArray652[anInt9012++] = local1696.anInt2216 >> 14 & 0x3FFF;
					anIntArray652[anInt9012++] = local1696.anInt2216 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray652[--anInt9012];
					local1696 = Static270.method1306(local175);
					if (local1696 == null) {
						anIntArray652[anInt9012++] = 0;
						anIntArray652[anInt9012++] = 0;
						return;
					}
					anIntArray652[anInt9012++] = local1696.anInt2225 - local1696.anInt2214;
					anIntArray652[anInt9012++] = local1696.anInt2222 - local1696.anInt2226;
					return;
				}
				@Pc(1919) Class2_Sub46 local1919;
				if (arg0 == 5212) {
					local1919 = Static512.method7102();
					if (local1919 == null) {
						anIntArray652[anInt9012++] = -1;
						anIntArray652[anInt9012++] = -1;
						return;
					}
					anIntArray652[anInt9012++] = local1919.anInt9117;
					local776 = local1919.anInt9120 << 28 | local1919.anInt9115 + Static270.anInt1801 << 14 | local1919.anInt9116 + Static270.anInt1800;
					anIntArray652[anInt9012++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static421.method6465();
					if (local1919 == null) {
						anIntArray652[anInt9012++] = -1;
						anIntArray652[anInt9012++] = -1;
						return;
					}
					anIntArray652[anInt9012++] = local1919.anInt9117;
					local776 = local1919.anInt9120 << 28 | local1919.anInt9115 + Static270.anInt1801 << 14 | local1919.anInt9116 + Static270.anInt1800;
					anIntArray652[anInt9012++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray652[--anInt9012];
					local1696 = Static352.method5250();
					if (local1696 != null) {
						local2067 = local1696.method1630(local175 >> 14 & 0x3FFF, local175 & 0x3FFF, anIntArray653, local175 >> 28 & 0x3);
						if (local2067) {
							Static125.method1803(anIntArray653[2], anIntArray653[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt9012 -= 2;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					@Pc(2105) Class171 local2105 = Static270.method1312(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class2_Sub3_Sub3 local2112 = (Class2_Sub3_Sub3) local2105.method3796(); local2112 != null; local2112 = (Class2_Sub3_Sub3) local2105.method3786()) {
						if (local2112.anInt2215 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray652[anInt9012++] = 1;
						return;
					}
					anIntArray652[anInt9012++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray652[--anInt9012];
					local1696 = Static270.method1306(local175);
					if (local1696 == null) {
						anIntArray652[anInt9012++] = -1;
						return;
					}
					anIntArray652[anInt9012++] = local1696.anInt2218;
					return;
				}
				if (arg0 == 5220) {
					anIntArray652[anInt9012++] = Static499.anInt8380 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray652[--anInt9012];
					Static125.method1803(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static352.method5250();
					if (local1729 != null) {
						local1496 = local1729.method1632(Static75.anInt1651 + Static270.anInt1800, Static549.anInt8926 + Static270.anInt1801, anIntArray653);
						if (local1496) {
							anIntArray652[anInt9012++] = anIntArray653[1];
							anIntArray652[anInt9012++] = anIntArray653[2];
							return;
						}
						anIntArray652[anInt9012++] = -1;
						anIntArray652[anInt9012++] = -1;
						return;
					}
					anIntArray652[anInt9012++] = -1;
					anIntArray652[anInt9012++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt9012 -= 2;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					Static196.method3246(local175, local776 & 0x3FFF, false, local776 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray652[--anInt9012];
					local1696 = Static352.method5250();
					if (local1696 != null) {
						local2067 = local1696.method1630(local175 >> 14 & 0x3FFF, local175 & 0x3FFF, anIntArray653, local175 >> 28 & 0x3);
						if (local2067) {
							anIntArray652[anInt9012++] = anIntArray653[1];
							anIntArray652[anInt9012++] = anIntArray653[2];
							return;
						}
						anIntArray652[anInt9012++] = -1;
						anIntArray652[anInt9012++] = -1;
						return;
					}
					anIntArray652[anInt9012++] = -1;
					anIntArray652[anInt9012++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray652[--anInt9012];
					local1696 = Static352.method5250();
					if (local1696 != null) {
						local2067 = local1696.method1632(local175 & 0x3FFF, local175 >> 14 & 0x3FFF, anIntArray653);
						if (local2067) {
							anIntArray652[anInt9012++] = anIntArray653[1];
							anIntArray652[anInt9012++] = anIntArray653[2];
							return;
						}
						anIntArray652[anInt9012++] = -1;
						anIntArray652[anInt9012++] = -1;
						return;
					}
					anIntArray652[anInt9012++] = -1;
					anIntArray652[anInt9012++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static33.method582(anIntArray652[--anInt9012]);
					return;
				}
				if (arg0 == 5227) {
					anInt9012 -= 2;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					Static196.method3246(local175, local776 & 0x3FFF, true, local776 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static156.aBoolean654 = anIntArray652[--anInt9012] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray652[anInt9012++] = Static156.aBoolean654 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray652[--anInt9012];
					Static398.method7278(local175);
					return;
				}
				@Pc(2625) Class2 local2625;
				if (arg0 == 5231) {
					anInt9012 -= 2;
					local175 = anIntArray652[anInt9012];
					local1496 = anIntArray652[anInt9012 + 1] == 1;
					if (Static262.aClass162_22 != null) {
						local2625 = Static262.aClass162_22.method3519((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method7966();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class2();
							Static262.aClass162_22.method3522(local2625, (long) local175);
						}
					}
					return;
				}
				@Pc(2667) Class2 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray652[--anInt9012];
					if (Static262.aClass162_22 != null) {
						local2667 = Static262.aClass162_22.method3519((long) local175);
						anIntArray652[anInt9012++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray652[anInt9012++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt9012 -= 2;
					local175 = anIntArray652[anInt9012];
					local1496 = anIntArray652[anInt9012 + 1] == 1;
					if (Static84.aClass162_12 != null) {
						local2625 = Static84.aClass162_12.method3519((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method7966();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class2();
							Static84.aClass162_12.method3522(local2625, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray652[--anInt9012];
					if (Static84.aClass162_12 != null) {
						local2667 = Static84.aClass162_12.method3519((long) local175);
						anIntArray652[anInt9012++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray652[anInt9012++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray652[anInt9012++] = Static270.aClass2_Sub3_Sub3_2 == null ? -1 : Static270.aClass2_Sub3_Sub3_2.anInt2215;
					return;
				}
				if (arg0 == 5236) {
					anInt9012 -= 2;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static298.method4513(local103, local175, local97);
					if (local2833 < 0) {
						anIntArray652[anInt9012++] = -1;
						return;
					}
					anIntArray652[anInt9012++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static533.method7646();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt9012 -= 2;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					Static273.method4136(false, local175, local776, 3);
					anIntArray652[anInt9012++] = Static125.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static125.aFrame1 != null) {
						Static273.method4136(false, -1, -1, Static72.aClass2_Sub12_Sub1_1.anInt1908);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2917) Class289[] local2917 = Static568.method7711();
					anIntArray652[anInt9012++] = local2917.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray652[--anInt9012];
					@Pc(2941) Class289[] local2941 = Static568.method7711();
					anIntArray652[anInt9012++] = local2941[local175].anInt7996;
					anIntArray652[anInt9012++] = local2941[local175].anInt7993;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static72.aClass2_Sub12_Sub1_1.anInt1924;
					local776 = Static72.aClass2_Sub12_Sub1_1.anInt1913;
					local97 = -1;
					@Pc(2978) Class289[] local2978 = Static568.method7711();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class289 local2985 = local2978[local2833];
						if (local2985.anInt7996 == local175 && local2985.anInt7993 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray652[anInt9012++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray652[anInt9012++] = Static212.method3434();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray652[--anInt9012];
					if (local175 >= 1 && local175 <= 2) {
						Static273.method4136(false, -1, -1, local175);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1908;
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray652[--anInt9012];
					if (local175 >= 1 && local175 <= 2) {
						Static72.aClass2_Sub12_Sub1_1.anInt1908 = local175;
						Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt9010 -= 2;
					local83 = aStringArray171[anInt9010];
					local89 = aStringArray171[anInt9010 + 1];
					local97 = anIntArray652[--anInt9012];
					@Pc(3124) Class2_Sub42 local3124 = Static249.method3910(Static280.aClass286_93, Static400.aClass145_2);
					local3124.aClass2_Sub15_Sub2_2.method4333(Static71.method1162(local83) + Static71.method1162(local89) + 1);
					local3124.aClass2_Sub15_Sub2_2.method4313(local83);
					local3124.aClass2_Sub15_Sub2_2.method4313(local89);
					local3124.aClass2_Sub15_Sub2_2.method4333(local97);
					Static531.method7296(local3124);
					return;
				}
				if (arg0 == 5401) {
					anInt9012 -= 2;
					Static305.aShortArray96[anIntArray652[anInt9012]] = (short) Static307.method4576(anIntArray652[anInt9012 + 1]);
					Static296.aClass218_1.method5062();
					Static296.aClass218_1.method5058();
					Static254.aClass202_2.method4490();
					Static139.method2348();
					return;
				}
				if (arg0 == 5405) {
					anInt9012 -= 2;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					if (local175 >= 0 && local175 < 2) {
						Class6_Sub1_Sub3_Sub1.lb[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt9012 -= 7;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1] << 1;
					local97 = anIntArray652[anInt9012 + 2];
					local103 = anIntArray652[anInt9012 + 3];
					local2833 = anIntArray652[anInt9012 + 4];
					@Pc(3262) int local3262 = anIntArray652[anInt9012 + 5];
					@Pc(3268) int local3268 = anIntArray652[anInt9012 + 6];
					if (local175 >= 0 && local175 < 2 && Class6_Sub1_Sub3_Sub1.lb[local175] != null && local776 >= 0 && local776 < Class6_Sub1_Sub3_Sub1.lb[local175].length) {
						Class6_Sub1_Sub3_Sub1.lb[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3268 };
						Class6_Sub1_Sub3_Sub1.lb[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3262 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Class6_Sub1_Sub3_Sub1.lb[anIntArray652[--anInt9012]].length >> 1;
					anIntArray652[anInt9012++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static125.aFrame1 != null) {
						Static273.method4136(false, -1, -1, Static72.aClass2_Sub12_Sub1_1.anInt1908);
					}
					if (Static593.aFrame2 != null) {
						Static53.method919();
						System.exit(0);
						return;
					}
					local83 = Static47.aString9 == null ? Static412.method376() : Static47.aString9;
					Static584.method7922(local83, Static356.aClass287_5, Static391.anInt6846 == 1, false);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static474.aClass347_8 != null) {
						if (Static474.aClass347_8.anObject49 == null) {
							local83 = Static480.method6789(Static474.aClass347_8.anInt9170);
						} else {
							local83 = (String) Static474.aClass347_8.anObject49;
						}
					}
					aStringArray171[anInt9010++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray652[anInt9012++] = Static356.aClass287_5.aBoolean630 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static125.aFrame1 != null) {
						Static273.method4136(false, -1, -1, Static72.aClass2_Sub12_Sub1_1.anInt1908);
					}
					local83 = aStringArray171[--anInt9010];
					local1496 = anIntArray652[--anInt9012] == 1;
					local181 = Static412.method376() + local83;
					Static584.method7922(local181, Static356.aClass287_5, Static391.anInt6846 == 1, local1496);
					return;
				}
				if (arg0 == 5422) {
					anInt9010 -= 2;
					local83 = aStringArray171[anInt9010];
					local89 = aStringArray171[anInt9010 + 1];
					local97 = anIntArray652[--anInt9012];
					if (local83.length() > 0) {
						if (Static288.aStringArray86 == null) {
							Static288.aStringArray86 = new String[Static594.anIntArray701[Static328.aClass284_2.anInt7923]];
						}
						Static288.aStringArray86[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static351.aStringArray111 == null) {
							Static351.aStringArray111 = new String[Static594.anIntArray701[Static328.aClass284_2.anInt7923]];
						}
						Static351.aStringArray111[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray171[--anInt9010]);
					return;
				}
				if (arg0 == 5424) {
					anInt9012 -= 11;
					Static95.anInt2018 = anIntArray652[anInt9012];
					Static466.anInt7988 = anIntArray652[anInt9012 + 1];
					Static296.anInt5335 = anIntArray652[anInt9012 + 2];
					Static504.anInt8432 = anIntArray652[anInt9012 + 3];
					Static224.anInt4205 = anIntArray652[anInt9012 + 4];
					Static306.anInt5438 = anIntArray652[anInt9012 + 5];
					Static419.anInt6525 = anIntArray652[anInt9012 + 6];
					Static251.anInt4681 = anIntArray652[anInt9012 + 7];
					Static539.anInt8817 = anIntArray652[anInt9012 + 8];
					Static558.anInt9167 = anIntArray652[anInt9012 + 9];
					Static57.anInt1306 = anIntArray652[anInt9012 + 10];
					Static490.aClass259_153.method5988(Static224.anInt4205);
					Static490.aClass259_153.method5988(Static306.anInt5438);
					Static490.aClass259_153.method5988(Static419.anInt6525);
					Static490.aClass259_153.method5988(Static251.anInt4681);
					Static490.aClass259_153.method5988(Static539.anInt8817);
					Static81.aClass39_5 = null;
					Static228.aClass39_10 = null;
					Static436.aClass39_30 = null;
					Static107.aClass39_6 = null;
					Static376.aClass39_28 = null;
					Static310.aClass39_11 = null;
					Static221.aClass39_9 = null;
					Static517.aClass39_36 = null;
					Static316.aBoolean475 = true;
					return;
				}
				if (arg0 == 5425) {
					Static231.method3611();
					Static316.aBoolean475 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt9012 -= 2;
					Static395.anInt6896 = anIntArray652[anInt9012];
					Static261.anInt8058 = anIntArray652[anInt9012 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt9012 -= 2;
					Static338.anInt6209 = anIntArray652[anInt9012 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt9012 -= 2;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					anIntArray652[anInt9012++] = Static568.method7713(local175, local776) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static40.method697(false, aStringArray171[--anInt9010], false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static602.method6577("accountcreated", Static562.anApplet2);
						return;
					} catch (@Pc(3800) Throwable local3800) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static602.method6577("accountcreatestarted", Static562.anApplet2);
						return;
					} catch (@Pc(3811) Throwable local3811) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static484.aClipboard1 != null) {
						@Pc(3823) Transferable local3823 = Static484.aClipboard1.getContents(null);
						if (local3823 != null) {
							try {
								local83 = (String) local3823.getTransferData(DataFlavor.stringFlavor);
								if (local83 == null) {
									local83 = "";
								}
							} catch (@Pc(3836) Exception local3836) {
							}
						}
					}
					aStringArray171[anInt9010++] = local83;
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt9012 -= 4;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					local97 = anIntArray652[anInt9012 + 2];
					local103 = anIntArray652[anInt9012 + 3];
					Static527.method7270((local175 >> 14 & 0x3FFF) - Static35.anInt906, local97, local103, false, (local175 & 0x3FFF) - Static130.anInt5246, local776 << 2);
					return;
				}
				if (arg0 == 5501) {
					anInt9012 -= 4;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					local97 = anIntArray652[anInt9012 + 2];
					local103 = anIntArray652[anInt9012 + 3];
					Static233.method3627(local97, (local175 >> 14 & 0x3FFF) - Static35.anInt906, (local175 & 0x3FFF) - Static130.anInt5246, local776 << 2, local103);
					return;
				}
				if (arg0 == 5502) {
					anInt9012 -= 6;
					local175 = anIntArray652[anInt9012];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static332.anInt6122 = local175;
					local776 = anIntArray652[anInt9012 + 1];
					if (local776 + 1 >= Class6_Sub1_Sub3_Sub1.lb[Static332.anInt6122].length >> 1) {
						throw new RuntimeException();
					}
					Static467.anInt7990 = local776;
					Static14.anInt463 = 0;
					Static177.anInt3713 = anIntArray652[anInt9012 + 2];
					Static472.anInt8075 = anIntArray652[anInt9012 + 3];
					local97 = anIntArray652[anInt9012 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static408.anInt7104 = local97;
					local103 = anIntArray652[anInt9012 + 5];
					if (local103 + 1 >= Class6_Sub1_Sub3_Sub1.lb[Static408.anInt7104].length >> 1) {
						throw new RuntimeException();
					}
					Static274.anInt4968 = local103;
					Static311.anInt5570 = 3;
					Static94.anInt2006 = -1;
					Static238.anInt4482 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static74.method1179();
					return;
				}
				if (arg0 == 5504) {
					anInt9012 -= 2;
					Static569.method7715(anIntArray652[anInt9012 + 1], anIntArray652[anInt9012]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray652[anInt9012++] = (int) Static412.aFloat13 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray652[anInt9012++] = (int) Static447.aFloat233 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static385.method5667();
					return;
				}
				if (arg0 == 5508) {
					Static52.method904();
					return;
				}
				if (arg0 == 5509) {
					Static406.method5920();
					return;
				}
				if (arg0 == 5510) {
					Static241.method3719();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray652[--anInt9012];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static35.anInt906;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static188.anInt3850) {
						local776 = Static188.anInt3850;
					}
					local97 -= Static130.anInt5246;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static49.anInt1174) {
						local97 = Static49.anInt1174;
					}
					Static156.anInt8481 = (local776 << 9) + 256;
					Static433.anInt7318 = (local97 << 9) + 256;
					Static311.anInt5570 = 4;
					Static94.anInt2006 = -1;
					Static238.anInt4482 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static315.method7016();
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray652[--anInt9012];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static35.anInt906;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static188.anInt3850) {
							local776 = Static188.anInt3850;
						}
						local97 -= Static130.anInt5246;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static49.anInt1174) {
							local97 = Static49.anInt1174;
						}
						Static238.anInt4482 = (local776 << 9) + 256;
						Static94.anInt2006 = (local97 << 9) + 256;
						return;
					}
					Static238.anInt4482 = -1;
					Static94.anInt2006 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt9010 -= 2;
					local83 = aStringArray171[anInt9010];
					local89 = aStringArray171[anInt9010 + 1];
					local97 = anIntArray652[--anInt9012];
					if (Static201.anInt3963 != 3) {
						return;
					}
					if (Static199.anInt3950 == 0 && Static109.anInt2235 == 0) {
						Static392.aString61 = local83;
						Static286.aString44 = local89;
						Static402.anInt7015 = local97;
						Static121.method1780(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static487.method6831();
					return;
				}
				if (arg0 == 5602) {
					if (Static199.anInt3950 == 0) {
						Static503.anInt8425 = -2;
						Static46.anInt1128 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt9012 -= 4;
					if (Static201.anInt3963 != 3) {
						return;
					}
					if (Static199.anInt3950 == 0 && Static109.anInt2235 == 0) {
						Static448.method6253(anIntArray652[anInt9012], anIntArray652[anInt9012 + 3], anIntArray652[anInt9012 + 2], anIntArray652[anInt9012 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt9010--;
					if (Static201.anInt3963 != 3) {
						return;
					}
					if (Static199.anInt3950 == 0 && Static109.anInt2235 == 0) {
						Static548.method7439(Static3.method14(aStringArray171[anInt9010]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt9010 -= 2;
					if (Static201.anInt3963 != 3) {
						return;
					}
					if (Static199.anInt3950 == 0 && Static109.anInt2235 == 0) {
						Static226.method4129(aStringArray171[anInt9010 + 1], Static3.method14(aStringArray171[anInt9010]), false);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static109.anInt2235 == 0) {
						Static257.anInt4784 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray652[anInt9012++] = Static46.anInt1128;
					return;
				}
				if (arg0 == 5608) {
					anIntArray652[anInt9012++] = Static354.anInt4540;
					return;
				}
				if (arg0 == 5609) {
					anIntArray652[anInt9012++] = Static257.anInt4784;
					return;
				}
				if (arg0 == 5610) {
					for (local175 = 0; local175 < 5; local175++) {
						aStringArray171[anInt9010++] = Static36.aStringArray14 == null || Static36.aStringArray14.length <= local175 ? "" : Static460.method7784(Static36.aStringArray14[local175]);
					}
					Static36.aStringArray14 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray652[anInt9012++] = Static229.anInt4299;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray652[--anInt9012];
					if (Static201.anInt3963 != 7) {
						return;
					}
					if (Static199.anInt3950 == 0 && Static109.anInt2235 == 0) {
						if (Static57.aClass116_1 != null) {
							Static57.aClass116_1.method2483();
							Static57.aClass116_1 = null;
						}
						Static402.anInt7015 = local175;
						Static121.method1780(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray652[anInt9012++] = Static46.anInt1128;
					return;
				}
				if (arg0 == 5615) {
					anInt9010 -= 2;
					local83 = aStringArray171[anInt9010];
					local89 = aStringArray171[anInt9010 + 1];
					if (Static201.anInt3963 != 3) {
						return;
					}
					if (Static199.anInt3950 == 0 && Static109.anInt2235 == 0) {
						if (Static57.aClass116_1 != null) {
							Static57.aClass116_1.method2483();
							Static57.aClass116_1 = null;
						}
						Static392.aString61 = local83;
						Static286.aString44 = local89;
						Static121.method1780(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static295.method7108(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray652[anInt9012++] = Static503.anInt8425;
					return;
				}
				if (arg0 == 5618) {
					local175 = anIntArray652[--anInt9012];
					Static138.method2344(false, local175);
					return;
				}
				if (arg0 == 5619) {
					local175 = anIntArray652[--anInt9012];
					Static138.method2344(true, local175);
					return;
				}
				if (arg0 == 5620) {
					Static426.method6110();
					if (Static371.aString57 != "" && Static371.aString57 != "") {
						anIntArray652[anInt9012++] = 1;
						return;
					}
					anIntArray652[anInt9012++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt9010 -= 2;
					if (Static201.anInt3963 != 3) {
						return;
					}
					if (Static199.anInt3950 == 0 && Static109.anInt2235 == 0) {
						Static226.method4129(aStringArray171[anInt9010 + 1], Static3.method14(aStringArray171[anInt9010]), true);
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4719) Class347 local4719 = Static356.aClass287_5.method6548("3", false);
					while (local4719.anInt9172 == 0) {
						Static459.method6498(1L);
					}
					if (local4719.anInt9172 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4739) Class63 local4739 = (Class63) local4719.anObject49;
					if (local4739.method1177().exists()) {
						@Pc(4749) Class2_Sub15 local4749 = new Class2_Sub15(50);
						try {
							local4739.method1176(0, 50, local4749.aByteArray62);
						} catch (@Pc(4758) IOException local4758) {
						}
					}
					try {
						local4739.method1174();
						return;
					} catch (@Pc(4764) Exception local4764) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static544.aString96 != null) {
						anIntArray652[anInt9012++] = 1;
						return;
					}
					anIntArray652[anInt9012++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray652[anInt9012++] = (int) (Static15.aLong12 >> 32);
					anIntArray652[anInt9012++] = (int) (Static15.aLong12 & 0xFFFFL);
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray652[--anInt9012];
					if (local175 < 1) {
						local175 = 1;
					}
					if (local175 > 4) {
						local175 = 4;
					}
					Static72.aClass2_Sub12_Sub1_1.anInt1929 = local175;
					Static265.method4069();
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6002) {
					Static72.aClass2_Sub12_Sub1_1.method1429(anIntArray652[--anInt9012] == 1);
					Static265.method4069();
					Static282.method4207();
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6003) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean165 = anIntArray652[--anInt9012] == 1;
					Static282.method4207();
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6005) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean167 = anIntArray652[--anInt9012] == 1;
					Static265.method4069();
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6006) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean162 = anIntArray652[--anInt9012] == 1;
					Static307.aClass100_6.method6242(!Static72.aClass2_Sub12_Sub1_1.aBoolean162);
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6007) {
					Static72.aClass2_Sub12_Sub1_1.anInt1905 = anIntArray652[--anInt9012];
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6008) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean157 = anIntArray652[--anInt9012] == 1;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6009) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean159 = anIntArray652[--anInt9012] == 1;
					Static265.method4069();
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6010) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean155 = anIntArray652[--anInt9012] == 1;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6011) {
					local175 = anIntArray652[--anInt9012];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static72.aClass2_Sub12_Sub1_1.method1407(local175, Static391.anInt6846);
					Static265.method4069();
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6012) {
					Static72.aClass2_Sub12_Sub1_1.method1412(anIntArray652[--anInt9012] == 1, Static391.anInt6846);
					Static29.method539();
					Static6.method168();
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6014) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean163 = anIntArray652[--anInt9012] == 1;
					Static265.method4069();
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6015) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean153 = anIntArray652[--anInt9012] == 1;
					Static265.method4069();
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6016) {
					local175 = anIntArray652[--anInt9012];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static72.aClass2_Sub12_Sub1_1.anInt1927 = local175;
					Static547.method5859(Static391.anInt6846);
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					return;
				}
				if (arg0 == 6017) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean154 = anIntArray652[--anInt9012] == 1;
					Static201.method3290();
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6018) {
					local175 = anIntArray652[--anInt9012];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static72.aClass2_Sub12_Sub1_1.anInt1916 = local175;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray652[--anInt9012];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static72.aClass2_Sub12_Sub1_1.anInt1918) {
						if (Static72.aClass2_Sub12_Sub1_1.anInt1918 == 0 && Static593.anInt9611 != -1) {
							Static24.method443(local175, Static343.aClass259_88, Static593.anInt9611);
							Static242.aBoolean363 = false;
						} else if (local175 == 0) {
							Static291.method4373();
							Static242.aBoolean363 = false;
						} else {
							Static360.method5405(local175);
						}
						Static72.aClass2_Sub12_Sub1_1.anInt1918 = local175;
					}
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6020) {
					local175 = anIntArray652[--anInt9012];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static72.aClass2_Sub12_Sub1_1.anInt1926 = local175;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6021) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean170 = anIntArray652[--anInt9012] == 1;
					Static282.method4207();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray652[--anInt9012];
					local1496 = false;
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 2) {
						local175 = 2;
					}
					if (Static440.anInt7756 < 96) {
						local175 = 0;
						local1496 = true;
					}
					Static402.method5873(local175);
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					anIntArray652[anInt9012++] = local1496 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local175 = anIntArray652[--anInt9012];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static72.aClass2_Sub12_Sub1_1.anInt1921 = local175;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					return;
				}
				if (arg0 == 6025) {
					local175 = anIntArray652[--anInt9012];
					if (local175 < 0 || local175 > Static158.method2595(Static440.anInt7756)) {
						local175 = 0;
					}
					Static72.aClass2_Sub12_Sub1_1.anInt1904 = local175;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray652[--anInt9012];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static224.method3515(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean161 = anIntArray652[--anInt9012] != 0;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					return;
				}
				if (arg0 == 6029) {
					Static72.aClass2_Sub12_Sub1_1.anInt1905 = anIntArray652[--anInt9012];
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					return;
				}
				if (arg0 == 6030) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean164 = anIntArray652[--anInt9012] != 0;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static265.method4069();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray652[--anInt9012];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static547.method5859(local175);
					return;
				}
				if (arg0 == 6032) {
					local175 = anIntArray652[--anInt9012];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static72.aClass2_Sub12_Sub1_1.anInt1917 = local175;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6033) {
					local175 = anIntArray652[--anInt9012];
					if (local175 < 0 || local175 > 4) {
						local175 = 2;
					}
					Static72.aClass2_Sub12_Sub1_1.anInt1909 = local175;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					return;
				}
				if (arg0 == 6034) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean150 = anIntArray652[--anInt9012] == 1;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static29.method539();
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6035) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean173 = anIntArray652[--anInt9012] == 1;
					Static265.method4069();
					Static282.method4207();
					return;
				}
				if (arg0 == 6036) {
					local175 = anIntArray652[--anInt9012];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static72.aClass2_Sub12_Sub1_1.method1427(local175);
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					return;
				}
				if (arg0 == 6037) {
					local175 = anIntArray652[--anInt9012];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static72.aClass2_Sub12_Sub1_1.anInt1920 = local175;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray652[--anInt9012];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static72.aClass2_Sub12_Sub1_1.anInt1923 && Static593.anInt9611 == Static62.anInt1437) {
						if (Static72.aClass2_Sub12_Sub1_1.anInt1923 == 0) {
							Static24.method443(local175, Static343.aClass259_88, Static593.anInt9611);
							Static242.aBoolean363 = false;
						} else if (local175 == 0) {
							Static291.method4373();
							Static242.aBoolean363 = false;
						} else {
							Static360.method5405(local175);
						}
					}
					Static72.aClass2_Sub12_Sub1_1.anInt1923 = local175;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray652[--anInt9012];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static72.aClass2_Sub12_Sub1_1.anInt1910) {
						Static72.aClass2_Sub12_Sub1_1.anInt1910 = local175;
						Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
						Static335.aBoolean491 = false;
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1929;
					return;
				}
				if (arg0 == 6102) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.method1418(Static391.anInt6846) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.aBoolean165 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.aBoolean167 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.aBoolean162 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1905;
					return;
				}
				if (arg0 == 6108) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.aBoolean157 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.aBoolean159 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.aBoolean155 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.method1411(Static391.anInt6846);
					return;
				}
				if (arg0 == 6112) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.method1408(Static391.anInt6846) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.aBoolean163 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.aBoolean153 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1927;
					return;
				}
				if (arg0 == 6117) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.aBoolean154 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1916;
					return;
				}
				if (arg0 == 6119) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1918;
					return;
				}
				if (arg0 == 6120) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1926;
					return;
				}
				if (arg0 == 6121) {
					anIntArray652[anInt9012++] = Static307.aClass100_6.method6186() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray652[anInt9012++] = Static439.method6367();
					return;
				}
				if (arg0 == 6124) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1921;
					return;
				}
				if (arg0 == 6125) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1904;
					return;
				}
				if (arg0 == 6126) {
					anIntArray652[anInt9012++] = Static307.aClass100_6.method6230() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.aBoolean168 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.aBoolean161 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1905;
					return;
				}
				if (arg0 == 6130) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.aBoolean164 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray652[anInt9012++] = Static391.anInt6846;
					return;
				}
				if (arg0 == 6132) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1917;
					return;
				}
				if (arg0 == 6133) {
					anIntArray652[anInt9012++] = Static356.aClass287_5.aBoolean630 && !Static356.aClass287_5.aBoolean628 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray652[anInt9012++] = Static158.method2595(Static440.anInt7756);
					return;
				}
				if (arg0 == 6135) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1909;
					return;
				}
				if (arg0 == 6136) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.aBoolean150 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6352) boolean local6352 = true;
					try {
						local6352 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6362) Throwable local6362) {
					}
					anIntArray652[anInt9012++] = local6352 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray652[anInt9012++] = Static551.method7486(Static391.anInt6846, 200);
					return;
				}
				if (arg0 == 6139) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.method1423(Static391.anInt6846);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6410) byte local6410 = 0;
					if (Static332.method5090(Static391.anInt6846) && Static440.anInt7756 < 96) {
						local6410 = 1;
					}
					anIntArray652[anInt9012++] = local6410;
					return;
				}
				if (arg0 == 6141) {
					if (Static440.anInt7756 < 96) {
						anIntArray652[anInt9012++] = 0;
						return;
					}
					anIntArray652[anInt9012++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1920;
					return;
				}
				if (arg0 == 6143) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1923;
					return;
				}
				if (arg0 == 6144) {
					anIntArray652[anInt9012++] = Static366.aBoolean508 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1910;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt9012 -= 2;
					Static219.aShort44 = (short) anIntArray652[anInt9012];
					if (Static219.aShort44 <= 0) {
						Static219.aShort44 = 256;
					}
					Static271.aShort56 = (short) anIntArray652[anInt9012 + 1];
					if (Static271.aShort56 <= 0) {
						Static271.aShort56 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt9012 -= 2;
					Static56.aShort20 = (short) anIntArray652[anInt9012];
					if (Static56.aShort20 <= 0) {
						Static56.aShort20 = 256;
					}
					Static168.aShort35 = (short) anIntArray652[anInt9012 + 1];
					if (Static168.aShort35 <= 0) {
						Static168.aShort35 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt9012 -= 4;
					Static39.aShort19 = (short) anIntArray652[anInt9012];
					if (Static39.aShort19 <= 0) {
						Static39.aShort19 = 1;
					}
					Static378.aShort77 = (short) anIntArray652[anInt9012 + 1];
					if (Static378.aShort77 <= 0) {
						Static378.aShort77 = 32767;
					} else if (Static378.aShort77 < Static39.aShort19) {
						Static378.aShort77 = Static39.aShort19;
					}
					Static379.aShort78 = (short) anIntArray652[anInt9012 + 2];
					if (Static379.aShort78 <= 0) {
						Static379.aShort78 = 1;
					}
					Static201.aShort37 = (short) anIntArray652[anInt9012 + 3];
					if (Static201.aShort37 <= 0) {
						Static201.aShort37 = 32767;
						return;
					}
					if (Static201.aShort37 < Static379.aShort78) {
						Static201.aShort37 = Static379.aShort78;
					}
					return;
				}
				if (arg0 == 6203) {
					Static319.method4947(Static512.aClass196_11.anInt5078, 0, 0, Static512.aClass196_11.anInt5130, false);
					anIntArray652[anInt9012++] = Static430.anInt7301;
					anIntArray652[anInt9012++] = Static568.anInt9290;
					return;
				}
				if (arg0 == 6204) {
					anIntArray652[anInt9012++] = Static56.aShort20;
					anIntArray652[anInt9012++] = Static168.aShort35;
					return;
				}
				if (arg0 == 6205) {
					anIntArray652[anInt9012++] = Static219.aShort44;
					anIntArray652[anInt9012++] = Static271.aShort56;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray652[anInt9012++] = (int) (Static548.method7437() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray652[anInt9012++] = (int) (Static548.method7437() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt9012 -= 3;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					local97 = anIntArray652[anInt9012 + 2];
					aCalendar2.clear();
					aCalendar2.set(11, 12);
					aCalendar2.set(local97, local776, local175);
					local103 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray652[anInt9012++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar2.clear();
					aCalendar2.setTime(new Date(Static548.method7437()));
					anIntArray652[anInt9012++] = aCalendar2.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray652[--anInt9012];
					local1496 = true;
					if (local175 < 0) {
						local1496 = (local175 + 1) % 4 == 0;
					} else if (local175 < 1582) {
						local1496 = local175 % 4 == 0;
					} else if (local175 % 4 != 0) {
						local1496 = false;
					} else if (local175 % 100 != 0) {
						local1496 = true;
					} else if (local175 % 400 != 0) {
						local1496 = false;
					}
					anIntArray652[anInt9012++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray652[anInt9012++] = Static242.method3755() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray652[anInt9012++] = Static111.method1660() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static201.anInt3963 == 7 && Static199.anInt3950 == 0 && Static109.anInt2235 == 0) {
						if (Static225.aBoolean344) {
							anIntArray652[anInt9012++] = 0;
							return;
						}
						if (Static535.aLong242 > Static548.method7437() - 1000L) {
							anIntArray652[anInt9012++] = 1;
							return;
						}
						Static225.aBoolean344 = true;
						local52 = Static249.method3910(Static97.aClass286_35, Static400.aClass145_2);
						local52.aClass2_Sub15_Sub2_2.method4288(Static46.anInt1129);
						Static531.method7296(local52);
						anIntArray652[anInt9012++] = 0;
						return;
					}
					anIntArray652[anInt9012++] = 1;
					return;
				}
				@Pc(7033) Class311 local7033;
				@Pc(7000) Class136_Sub1 local7000;
				if (arg0 == 6501) {
					local7000 = Static193.method3220();
					if (local7000 != null) {
						anIntArray652[anInt9012++] = local7000.anInt4389;
						anIntArray652[anInt9012++] = local7000.anInt4380;
						aStringArray171[anInt9010++] = local7000.aString34;
						local7033 = local7000.method3658();
						anIntArray652[anInt9012++] = local7033.anInt8370;
						aStringArray171[anInt9010++] = local7033.aString94;
						anIntArray652[anInt9012++] = local7000.anInt4377;
						anIntArray652[anInt9012++] = local7000.anInt4387;
						aStringArray171[anInt9010++] = local7000.aString33;
						return;
					}
					anIntArray652[anInt9012++] = -1;
					anIntArray652[anInt9012++] = 0;
					aStringArray171[anInt9010++] = "";
					anIntArray652[anInt9012++] = 0;
					aStringArray171[anInt9010++] = "";
					anIntArray652[anInt9012++] = 0;
					anIntArray652[anInt9012++] = 0;
					aStringArray171[anInt9010++] = "";
					return;
				}
				if (arg0 == 6502) {
					local7000 = Static461.method6505();
					if (local7000 != null) {
						anIntArray652[anInt9012++] = local7000.anInt4389;
						anIntArray652[anInt9012++] = local7000.anInt4380;
						aStringArray171[anInt9010++] = local7000.aString34;
						local7033 = local7000.method3658();
						anIntArray652[anInt9012++] = local7033.anInt8370;
						aStringArray171[anInt9010++] = local7033.aString94;
						anIntArray652[anInt9012++] = local7000.anInt4377;
						anIntArray652[anInt9012++] = local7000.anInt4387;
						aStringArray171[anInt9010++] = local7000.aString33;
						return;
					}
					anIntArray652[anInt9012++] = -1;
					anIntArray652[anInt9012++] = 0;
					aStringArray171[anInt9010++] = "";
					anIntArray652[anInt9012++] = 0;
					aStringArray171[anInt9010++] = "";
					anIntArray652[anInt9012++] = 0;
					anIntArray652[anInt9012++] = 0;
					aStringArray171[anInt9010++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray652[--anInt9012];
					local89 = aStringArray171[--anInt9010];
					if (Static201.anInt3963 == 7 && Static199.anInt3950 == 0 && Static109.anInt2235 == 0) {
						anIntArray652[anInt9012++] = Static114.method1694(local175, local89) ? 1 : 0;
						return;
					}
					anIntArray652[anInt9012++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static72.aClass2_Sub12_Sub1_1.anInt1903 = anIntArray652[--anInt9012];
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					return;
				}
				if (arg0 == 6505) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1903;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray652[--anInt9012];
					@Pc(7390) Class136_Sub1 local7390 = Static271.method4110(local175);
					if (local7390 != null) {
						anIntArray652[anInt9012++] = local7390.anInt4380;
						aStringArray171[anInt9010++] = local7390.aString34;
						@Pc(7414) Class311 local7414 = local7390.method3658();
						anIntArray652[anInt9012++] = local7414.anInt8370;
						aStringArray171[anInt9010++] = local7414.aString94;
						anIntArray652[anInt9012++] = local7390.anInt4377;
						anIntArray652[anInt9012++] = local7390.anInt4387;
						aStringArray171[anInt9010++] = local7390.aString33;
						return;
					}
					anIntArray652[anInt9012++] = -1;
					aStringArray171[anInt9010++] = "";
					anIntArray652[anInt9012++] = 0;
					aStringArray171[anInt9010++] = "";
					anIntArray652[anInt9012++] = 0;
					anIntArray652[anInt9012++] = 0;
					aStringArray171[anInt9010++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt9012 -= 4;
					local175 = anIntArray652[anInt9012];
					local1496 = anIntArray652[anInt9012 + 1] == 1;
					local97 = anIntArray652[anInt9012 + 2];
					local2107 = anIntArray652[anInt9012 + 3] == 1;
					Static338.method5155(local175, local1496, local97, local2107);
					return;
				}
				if (arg0 == 6508) {
					Static556.method7587();
					return;
				}
				if (arg0 == 6509) {
					if (Static201.anInt3963 != 7) {
						return;
					}
					Static333.aBoolean489 = anIntArray652[--anInt9012] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray652[anInt9012++] = Static55.anInt3626;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean151 = anIntArray652[--anInt9012] == 1;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					return;
				}
				if (arg0 == 6601) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.aBoolean151 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static183.aClass360_2 == Static578.aClass360_6) {
				if (arg0 == 6700) {
					local175 = Static217.aClass162_20.method3524();
					if (Static554.anInt9121 != -1) {
						local175++;
					}
					anIntArray652[anInt9012++] = local175;
					return;
				}
				if (arg0 == 6701) {
					local175 = anIntArray652[--anInt9012];
					if (Static554.anInt9121 != -1) {
						if (local175 == 0) {
							anIntArray652[anInt9012++] = Static554.anInt9121;
							return;
						}
						local175--;
					}
					@Pc(7701) Class2_Sub44 local7701 = (Class2_Sub44) Static217.aClass162_20.method3527();
					while (local175-- > 0) {
						local7701 = (Class2_Sub44) Static217.aClass162_20.method3523();
					}
					anIntArray652[anInt9012++] = local7701.anInt8608;
					return;
				}
				if (arg0 == 6702) {
					local175 = anIntArray652[--anInt9012];
					if (Static2.aClass196ArrayArray1[local175] == null) {
						aStringArray171[anInt9010++] = "";
						return;
					}
					local89 = Static2.aClass196ArrayArray1[local175][0].aString40;
					if (local89 == null) {
						aStringArray171[anInt9010++] = "";
						return;
					}
					aStringArray171[anInt9010++] = local89.substring(0, local89.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local175 = anIntArray652[--anInt9012];
					if (Static2.aClass196ArrayArray1[local175] == null) {
						anIntArray652[anInt9012++] = 0;
						return;
					}
					anIntArray652[anInt9012++] = Static2.aClass196ArrayArray1[local175].length;
					return;
				}
				if (arg0 == 6704) {
					anInt9012 -= 2;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					if (Static2.aClass196ArrayArray1[local175] == null) {
						aStringArray171[anInt9010++] = "";
						return;
					}
					local181 = Static2.aClass196ArrayArray1[local175][local776].aString40;
					if (local181 == null) {
						aStringArray171[anInt9010++] = "";
						return;
					}
					aStringArray171[anInt9010++] = local181;
					return;
				}
				if (arg0 == 6705) {
					anInt9012 -= 2;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					if (Static2.aClass196ArrayArray1[local175] == null) {
						anIntArray652[anInt9012++] = 0;
						return;
					}
					anIntArray652[anInt9012++] = Static2.aClass196ArrayArray1[local175][local776].anInt5137;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt9012 -= 3;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					local97 = anIntArray652[anInt9012 + 2];
					Static56.method939(local97, 1, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6708) {
					anInt9012 -= 3;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					local97 = anIntArray652[anInt9012 + 2];
					Static56.method939(local97, 2, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6709) {
					anInt9012 -= 3;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					local97 = anIntArray652[anInt9012 + 2];
					Static56.method939(local97, 3, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6710) {
					anInt9012 -= 3;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					local97 = anIntArray652[anInt9012 + 2];
					Static56.method939(local97, 4, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6711) {
					anInt9012 -= 3;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					local97 = anIntArray652[anInt9012 + 2];
					Static56.method939(local97, 5, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6712) {
					anInt9012 -= 3;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					local97 = anIntArray652[anInt9012 + 2];
					Static56.method939(local97, 6, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6713) {
					anInt9012 -= 3;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					local97 = anIntArray652[anInt9012 + 2];
					Static56.method939(local97, 7, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6714) {
					anInt9012 -= 3;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					local97 = anIntArray652[anInt9012 + 2];
					Static56.method939(local97, 8, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6715) {
					anInt9012 -= 3;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					local97 = anIntArray652[anInt9012 + 2];
					Static56.method939(local97, 9, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6716) {
					anInt9012 -= 3;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					local97 = anIntArray652[anInt9012 + 2];
					Static56.method939(local97, 10, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6717) {
					anInt9012 -= 3;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					local97 = anIntArray652[anInt9012 + 2];
					@Pc(8289) Class196 local8289 = Static217.method3485(local175 << 16 | local776, local97);
					Static566.method7699();
					@Pc(8294) Class2_Sub35 local8294 = Static67.method1102(local8289);
					Static119.method1773(local8289, local8294.method5420(), local8294.anInt6469);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8322) Class366 local8322;
				if (arg0 == 6800) {
					local175 = anIntArray652[--anInt9012];
					local8322 = Static205.aClass25_3.method435(local175);
					if (local8322.aString101 == null) {
						aStringArray171[anInt9010++] = "";
						return;
					}
					aStringArray171[anInt9010++] = local8322.aString101;
					return;
				}
				if (arg0 == 6801) {
					local175 = anIntArray652[--anInt9012];
					local8322 = Static205.aClass25_3.method435(local175);
					anIntArray652[anInt9012++] = local8322.anInt9648;
					return;
				}
				if (arg0 == 6802) {
					local175 = anIntArray652[--anInt9012];
					local8322 = Static205.aClass25_3.method435(local175);
					anIntArray652[anInt9012++] = local8322.anInt9623;
					return;
				}
				if (arg0 == 6803) {
					local175 = anIntArray652[--anInt9012];
					local8322 = Static205.aClass25_3.method435(local175);
					anIntArray652[anInt9012++] = local8322.anInt9642;
					return;
				}
				if (arg0 == 6804) {
					anInt9012 -= 2;
					local175 = anIntArray652[anInt9012];
					local776 = anIntArray652[anInt9012 + 1];
					@Pc(8444) Class352 local8444 = Static241.aClass82_1.method1498(local776);
					if (local8444.method7723()) {
						aStringArray171[anInt9010++] = Static205.aClass25_3.method435(local175).method7994(local8444.aString99, local776);
						return;
					}
					anIntArray652[anInt9012++] = Static205.aClass25_3.method435(local175).method8001(local776, local8444.anInt9310);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray652[anInt9012++] = Static216.aBoolean339 && !Static500.aBoolean652 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray652[anInt9012++] = Static457.anInt7912;
					return;
				}
				if (arg0 == 6902) {
					anIntArray652[anInt9012++] = Static62.anInt1432;
					return;
				}
				if (arg0 == 6903) {
					anIntArray652[anInt9012++] = Static521.anInt8610;
					return;
				}
				if (arg0 == 6904) {
					anIntArray652[anInt9012++] = Static479.anInt8197;
					return;
				}
				if (arg0 == 6905) {
					local83 = "";
					if (Static474.aClass347_8 != null) {
						if (Static474.aClass347_8.anObject49 == null) {
							local83 = Static480.method6789(Static474.aClass347_8.anInt9170);
						} else {
							local83 = (String) Static474.aClass347_8.anObject49;
						}
					}
					aStringArray171[anInt9010++] = local83;
					return;
				}
				if (arg0 == 6906) {
					anIntArray652[anInt9012++] = Static121.anInt2374;
					return;
				}
				if (arg0 == 6907) {
					anIntArray652[anInt9012++] = Static420.anInt7199;
					return;
				}
				if (arg0 == 6908) {
					anIntArray652[anInt9012++] = Static41.anInt1019;
					return;
				}
				if (arg0 == 6909) {
					anIntArray652[anInt9012++] = Static396.aBoolean385 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray652[anInt9012++] = Static290.anInt5293;
					return;
				}
				if (arg0 == 6911) {
					anIntArray652[anInt9012++] = Static456.anInt7889;
					return;
				}
				if (arg0 == 6912) {
					anIntArray652[anInt9012++] = Static193.anInt3880;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local175 = Static72.aClass2_Sub12_Sub1_1.method1424();
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1935 = Static391.anInt6846;
					anIntArray652[anInt9012++] = local175;
					Static265.method4069();
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 7001) {
					Static72.aClass2_Sub12_Sub1_1.method1428();
					Static265.method4069();
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 7002) {
					Static72.aClass2_Sub12_Sub1_1.method1417();
					Static265.method4069();
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 7003) {
					Static72.aClass2_Sub12_Sub1_1.method1426();
					Static265.method4069();
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 7004) {
					Static72.aClass2_Sub12_Sub1_1.method1432(true);
					Static265.method4069();
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 7005) {
					Static72.aClass2_Sub12_Sub1_1.anInt1925 = 0;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg0 == 7006) {
					if (Static72.aClass2_Sub12_Sub1_1.anInt1935 == 2) {
						Static72.aClass2_Sub12_Sub1_1.aBoolean172 = true;
						return;
					}
					if (Static72.aClass2_Sub12_Sub1_1.anInt1935 == 1) {
						Static72.aClass2_Sub12_Sub1_1.aBoolean171 = true;
						return;
					}
					if (Static72.aClass2_Sub12_Sub1_1.anInt1935 == 3) {
						Static72.aClass2_Sub12_Sub1_1.aBoolean169 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray652[anInt9012++] = Static72.aClass2_Sub12_Sub1_1.anInt1925;
					return;
				}
				if (arg0 == 7008) {
					if (Static391.anInt6846 == 0 && Static440.anInt7756 < 96) {
						anIntArray652[anInt9012++] = 1;
						return;
					}
					anIntArray652[anInt9012++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)V")
	private static void method7492(@OriginalArg(0) int arg0) {
		@Pc(3) Class196 local3 = Static117.method1748(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class196[] local13 = Static348.aClass196ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class196[] local19 = Static2.aClass196ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static348.aClass196ArrayArray2[local9] = new Class196[local22];
			Static598.method1131(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static598.method1131(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!it;I)V")
	private static void method7493(@OriginalArg(0) Class2_Sub3_Sub8 arg0, @OriginalArg(1) int arg1) {
		anInt9012 = 0;
		anInt9010 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray278;
		@Pc(11) int[] local11 = arg0.anIntArray277;
		@Pc(13) byte local13 = -1;
		anInt9006 = 0;
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
						method7495(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method7491(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray652[anInt9012++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray652[anInt9012++] = Static70.aClass78_1.anIntArray104[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static70.aClass78_1.method1461(anIntArray652[--anInt9012], local54);
					} else if (local31 == 3) {
						aStringArray171[anInt9010++] = arg0.aStringArray71[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt9012 -= 2;
						if (anIntArray652[anInt9012] != anIntArray652[anInt9012 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt9012 -= 2;
						if (anIntArray652[anInt9012] == anIntArray652[anInt9012 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt9012 -= 2;
						if (anIntArray652[anInt9012] < anIntArray652[anInt9012 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt9012 -= 2;
						if (anIntArray652[anInt9012] > anIntArray652[anInt9012 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt9006 == 0) {
							return;
						}
						@Pc(216) Class268 local216 = aClass268Array1[--anInt9006];
						arg0 = local216.aClass2_Sub3_Sub8_1;
						local8 = arg0.anIntArray278;
						local11 = arg0.anIntArray277;
						local5 = local216.anInt7303;
						anIntArray651 = local216.anIntArray499;
						aStringArray172 = local216.aStringArray140;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray652[anInt9012++] = Static70.aClass78_1.method1459(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static70.aClass78_1.method1464(local54, anIntArray652[--anInt9012]);
					} else if (local31 == 31) {
						anInt9012 -= 2;
						if (anIntArray652[anInt9012] <= anIntArray652[anInt9012 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt9012 -= 2;
						if (anIntArray652[anInt9012] >= anIntArray652[anInt9012 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray652[anInt9012++] = anIntArray651[local11[local5]];
					} else if (local31 == 34) {
						anIntArray651[local11[local5]] = anIntArray652[--anInt9012];
					} else if (local31 == 35) {
						aStringArray171[anInt9010++] = aStringArray172[local11[local5]];
					} else if (local31 == 36) {
						aStringArray172[local11[local5]] = aStringArray171[--anInt9010];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt9010 -= local54;
						@Pc(400) String local400 = Static461.method6507(aStringArray171, local54, anInt9010);
						aStringArray171[anInt9010++] = local400;
					} else if (local31 == 38) {
						anInt9012--;
					} else if (local31 == 39) {
						anInt9010--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class2_Sub3_Sub8 local436 = Static256.method3992(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt4340];
							@Pc(450) String[] local450 = new String[local436.anInt4341];
							for (local452 = 0; local452 < local436.anInt4339; local452++) {
								local446[local452] = anIntArray652[anInt9012 + local452 - local436.anInt4339];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt4335; local471++) {
								local450[local471] = aStringArray171[anInt9010 + local471 - local436.anInt4335];
							}
							anInt9012 -= local436.anInt4339;
							anInt9010 -= local436.anInt4335;
							@Pc(502) Class268 local502 = new Class268();
							local502.aClass2_Sub3_Sub8_1 = arg0;
							local502.anInt7303 = local5;
							local502.anIntArray499 = anIntArray651;
							local502.aStringArray140 = aStringArray172;
							if (anInt9006 >= aClass268Array1.length) {
								throw new RuntimeException();
							}
							aClass268Array1[anInt9006++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray278;
							local11 = local436.anIntArray277;
							local5 = -1;
							anIntArray651 = local446;
							aStringArray172 = local450;
						} else if (local31 == 42) {
							anIntArray652[anInt9012++] = Static470.anIntArray532[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static470.anIntArray532[local54] = anIntArray652[--anInt9012];
							Static217.method3483(local54);
							Static105.aBoolean199 |= Static254.aBooleanArray23[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray652[--anInt9012];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray650[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray62[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray652[--anInt9012];
							if (local603 < 0 || local603 >= anIntArray650[local54]) {
								throw new RuntimeException();
							}
							anIntArray652[anInt9012++] = anIntArrayArray62[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt9012 -= 2;
							local603 = anIntArray652[anInt9012];
							if (local603 < 0 || local603 >= anIntArray650[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray62[local54][local603] = anIntArray652[anInt9012 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static67.aStringArray25[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray171[anInt9010++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static67.aStringArray25[local54] = aStringArray171[--anInt9010];
							Static476.method6767(local54);
						} else if (local31 == 51) {
							@Pc(774) Class162 local774 = arg0.aClass162Array1[local11[local5]];
							@Pc(787) Class2_Sub22 local787 = (Class2_Sub22) local774.method3519((long) anIntArray652[--anInt9012]);
							if (local787 != null) {
								local5 += local787.anInt3866;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString32 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong268).append(" ");
				for (local603 = anInt9006 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass268Array1[local603].aClass2_Sub3_Sub8_1.aLong268).append(" ");
				}
				local856.append("op: ").append(local13);
				Static58.method946(local856.toString(), local837);
			} else {
				Static52.method905("Clientscript error in: " + arg0.aString32);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString32).append("\n");
				for (local603 = anInt9006 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass268Array1[local603].aClass2_Sub3_Sub8_1.aString32).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static58.method946(local856.toString(), local837);
				Static212.method3438(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method7494(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray173[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(IZ)V")
	private static void method7495(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class196 local137;
		@Pc(158) Class196 local158;
		@Pc(35) Class196 local35;
		@Pc(56) int local56;
		@Pc(13) int local13;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(210) Class196 local210;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt9012 -= 3;
				local13 = anIntArray652[anInt9012];
				local19 = anIntArray652[anInt9012 + 1];
				local25 = anIntArray652[anInt9012 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static117.method1748(local13);
				if (local35.aClass196Array2 == null) {
					local35.aClass196Array2 = new Class196[local25 + 1];
				}
				if (local35.aClass196Array2.length <= local25) {
					@Pc(54) Class196[] local54 = new Class196[local25 + 1];
					for (local56 = 0; local56 < local35.aClass196Array2.length; local56++) {
						local54[local56] = local35.aClass196Array2[local56];
					}
					local35.aClass196Array2 = local54;
				}
				if (local25 > 0 && local35.aClass196Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class196 local99 = new Class196();
				local99.anInt5098 = local19;
				local99.anInt5089 = local99.anInt5112 = local35.anInt5112;
				local99.anInt5154 = local25;
				local35.aClass196Array2[local25] = local99;
				if (arg1) {
					aClass196_12 = local99;
				} else {
					aClass196_13 = local99;
				}
				Static515.method7134(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass196_12 : aClass196_13;
				if (local137.anInt5154 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static117.method1748(local137.anInt5112);
				local158.aClass196Array2[local137.anInt5154] = null;
				Static515.method7134(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static117.method1748(anIntArray652[--anInt9012]);
				local137.aClass196Array2 = null;
				Static515.method7134(local137);
				return;
			}
			if (arg0 == 200) {
				anInt9012 -= 2;
				local13 = anIntArray652[anInt9012];
				local19 = anIntArray652[anInt9012 + 1];
				local210 = Static217.method3485(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray652[anInt9012++] = 1;
					if (arg1) {
						aClass196_12 = local210;
						return;
					}
					aClass196_13 = local210;
					return;
				}
				anIntArray652[anInt9012++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray652[--anInt9012];
				local158 = Static117.method1748(local13);
				if (local158 != null) {
					anIntArray652[anInt9012++] = 1;
					if (arg1) {
						aClass196_12 = local158;
						return;
					}
					aClass196_13 = local158;
					return;
				}
				anIntArray652[anInt9012++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray652[--anInt9012];
				method7492(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray652[--anInt9012];
				method7489(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt9012 -= 2;
					local13 = anIntArray652[anInt9012];
					local19 = anIntArray652[anInt9012 + 1];
					for (local25 = 0; local25 < Static90.anIntArray100.length; local25++) {
						if (Static90.anIntArray100[local25] == local13) {
							Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aClass194_1.method4224(local25, local19, Static8.aClass57_1);
							return;
						}
					}
					for (local353 = 0; local353 < Static504.anIntArray599.length; local353++) {
						if (Static504.anIntArray599[local353] == local13) {
							Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aClass194_1.method4224(local353, local19, Static8.aClass57_1);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt9012 -= 2;
					local13 = anIntArray652[anInt9012];
					local19 = anIntArray652[anInt9012 + 1];
					Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aClass194_1.method4216(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray652[--anInt9012] != 0;
					Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aClass194_1.method4223(local412);
					return;
				}
				if (arg0 == 411) {
					anInt9012 -= 2;
					local13 = anIntArray652[anInt9012];
					local19 = anIntArray652[anInt9012 + 1];
					Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aClass194_1.method4222(local19, local13, Static296.aClass218_1);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static117.method1748(anIntArray652[--anInt9012]);
				} else {
					local137 = arg1 ? aClass196_12 : aClass196_13;
				}
				if (arg0 == 1000) {
					anInt9012 -= 4;
					local137.anInt5142 = anIntArray652[anInt9012];
					local137.anInt5163 = anIntArray652[anInt9012 + 1];
					local19 = anIntArray652[anInt9012 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray652[anInt9012 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte75 = (byte) local19;
					local137.aByte74 = (byte) local25;
					Static515.method7134(local137);
					Static427.method6116(local137);
					if (local137.anInt5154 == -1) {
						Static546.method7436(local137.anInt5112);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt9012 -= 4;
					local137.anInt5148 = anIntArray652[anInt9012];
					local137.anInt5081 = anIntArray652[anInt9012 + 1];
					local137.anInt5084 = 0;
					local137.anInt5139 = 0;
					local19 = anIntArray652[anInt9012 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray652[anInt9012 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte72 = (byte) local19;
					local137.aByte73 = (byte) local25;
					Static515.method7134(local137);
					Static427.method6116(local137);
					if (local137.anInt5098 == 0) {
						Static274.method4155(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray652[--anInt9012] == 1;
					if (local137.aBoolean416 != local645) {
						local137.aBoolean416 = local645;
						Static515.method7134(local137);
					}
					if (local137.anInt5154 == -1) {
						Static398.method7272(local137.anInt5112);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt9012 -= 2;
					local137.anInt5131 = anIntArray652[anInt9012];
					local137.anInt5161 = anIntArray652[anInt9012 + 1];
					Static515.method7134(local137);
					Static427.method6116(local137);
					if (local137.anInt5098 == 0) {
						Static274.method4155(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean412 = anIntArray652[--anInt9012] == 1;
					return;
				}
			} else {
				@Pc(1507) String local1507;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static117.method1748(anIntArray652[--anInt9012]);
					} else {
						local137 = arg1 ? aClass196_12 : aClass196_13;
					}
					if (arg0 == 1100) {
						anInt9012 -= 2;
						local137.anInt5125 = anIntArray652[anInt9012];
						if (local137.anInt5125 > local137.anInt5146 - local137.anInt5130) {
							local137.anInt5125 = local137.anInt5146 - local137.anInt5130;
						}
						if (local137.anInt5125 < 0) {
							local137.anInt5125 = 0;
						}
						local137.anInt5115 = anIntArray652[anInt9012 + 1];
						if (local137.anInt5115 > local137.anInt5164 - local137.anInt5078) {
							local137.anInt5115 = local137.anInt5164 - local137.anInt5078;
						}
						if (local137.anInt5115 < 0) {
							local137.anInt5115 = 0;
						}
						Static515.method7134(local137);
						if (local137.anInt5154 == -1) {
							Static551.method7481(local137.anInt5112);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt5083 = anIntArray652[--anInt9012];
						Static515.method7134(local137);
						if (local137.anInt5154 == -1) {
							Static268.method7981(local137.anInt5112);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean401 = anIntArray652[--anInt9012] == 1;
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt5111 = anIntArray652[--anInt9012];
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt5105 = anIntArray652[--anInt9012];
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray652[--anInt9012];
						if (local137.anInt5124 != local19) {
							local137.anInt5124 = local19;
							Static515.method7134(local137);
						}
						if (local137.anInt5154 == -1) {
							Static250.method3919(local137.anInt5112);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt5109 = anIntArray652[--anInt9012];
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean417 = anIntArray652[--anInt9012] == 1;
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt5085 = 1;
						local137.anInt5132 = anIntArray652[--anInt9012];
						Static515.method7134(local137);
						if (local137.anInt5154 == -1) {
							Static110.method1658(local137.anInt5112);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt9012 -= 6;
						local137.anInt5153 = anIntArray652[anInt9012];
						local137.anInt5149 = anIntArray652[anInt9012 + 1];
						local137.anInt5144 = anIntArray652[anInt9012 + 2];
						local137.anInt5133 = anIntArray652[anInt9012 + 3];
						local137.anInt5167 = anIntArray652[anInt9012 + 4];
						local137.anInt5162 = anIntArray652[anInt9012 + 5];
						Static515.method7134(local137);
						if (local137.anInt5154 == -1) {
							Static45.method784(local137.anInt5112);
							Static384.method7167(local137.anInt5112);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray652[--anInt9012];
						if (local137.anInt5103 != local19) {
							local137.anInt5103 = local19;
							local137.anInt5087 = 0;
							local137.anInt5147 = 1;
							local137.anInt5101 = 0;
							@Pc(1094) Class84 local1094 = local137.anInt5103 == -1 ? null : Static116.aClass140_2.method3287(local137.anInt5103);
							if (local1094 != null) {
								Static58.method951(local1094, local137.anInt5087);
							}
							Static515.method7134(local137);
						}
						if (local137.anInt5154 == -1) {
							Static330.method5057(local137.anInt5112);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean402 = anIntArray652[--anInt9012] == 1;
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray171[--anInt9010];
						if (!local1145.equals(local137.aString42)) {
							local137.aString42 = local1145;
							Static515.method7134(local137);
						}
						if (local137.anInt5154 == -1) {
							Static407.method5921(local137.anInt5112);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt5119 = anIntArray652[--anInt9012];
						Static515.method7134(local137);
						if (local137.anInt5154 == -1) {
							Static26.method448(local137.anInt5112);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt9012 -= 3;
						local137.anInt5123 = anIntArray652[anInt9012];
						local137.anInt5107 = anIntArray652[anInt9012 + 1];
						local137.anInt5121 = anIntArray652[anInt9012 + 2];
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean413 = anIntArray652[--anInt9012] == 1;
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt5143 = anIntArray652[--anInt9012];
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt5157 = anIntArray652[--anInt9012];
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean404 = anIntArray652[--anInt9012] == 1;
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean409 = anIntArray652[--anInt9012] == 1;
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt9012 -= 2;
						local137.anInt5146 = anIntArray652[anInt9012];
						local137.anInt5164 = anIntArray652[anInt9012 + 1];
						Static515.method7134(local137);
						if (local137.anInt5098 == 0) {
							Static274.method4155(local137, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean406 = anIntArray652[--anInt9012] == 1;
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt5162 = anIntArray652[--anInt9012];
						Static515.method7134(local137);
						if (local137.anInt5154 == -1) {
							Static45.method784(local137.anInt5112);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray652[--anInt9012];
						local137.aBoolean411 = local19 == 1;
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt9012 -= 2;
						local137.anInt5117 = anIntArray652[anInt9012];
						local137.anInt5097 = anIntArray652[anInt9012 + 1];
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt5086 = anIntArray652[--anInt9012];
						Static515.method7134(local137);
						return;
					}
					@Pc(1473) Class352 local1473;
					if (arg0 == 1127) {
						anInt9012 -= 2;
						local19 = anIntArray652[anInt9012];
						local25 = anIntArray652[anInt9012 + 1];
						local1473 = Static241.aClass82_1.method1498(local19);
						if (local25 != local1473.anInt9310) {
							local137.method4236(local25, local19);
							return;
						}
						local137.method4246(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray652[--anInt9012];
						local1507 = aStringArray171[--anInt9010];
						local1473 = Static241.aClass82_1.method1498(local19);
						if (!local1473.aString99.equals(local1507)) {
							local137.method4234(local19, local1507);
							return;
						}
						local137.method4246(local19);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static117.method1748(anIntArray652[--anInt9012]);
					} else {
						local137 = arg1 ? aClass196_12 : aClass196_13;
					}
					Static515.method7134(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt9012 -= 2;
						local19 = anIntArray652[anInt9012];
						local25 = anIntArray652[anInt9012 + 1];
						if (local137.anInt5154 == -1) {
							Static157.method2574(local137.anInt5112);
							Static45.method784(local137.anInt5112);
							Static384.method7167(local137.anInt5112);
						}
						if (local19 == -1) {
							local137.anInt5085 = 1;
							local137.anInt5132 = -1;
							local137.anInt5152 = -1;
							return;
						}
						local137.anInt5152 = local19;
						local137.anInt5165 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean405 = true;
						} else {
							local137.aBoolean405 = false;
						}
						@Pc(1649) Class339 local1649 = Static296.aClass218_1.method5067(local19);
						local137.anInt5144 = local1649.anInt8957;
						local137.anInt5133 = local1649.anInt9001;
						local137.anInt5167 = local1649.anInt8989;
						local137.anInt5153 = local1649.anInt8975;
						local137.anInt5149 = local1649.anInt9000;
						local137.anInt5162 = local1649.anInt8990;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt5158 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt5158 = 1;
						} else {
							local137.anInt5158 = 2;
						}
						if (local137.anInt5084 > 0) {
							local137.anInt5162 = local137.anInt5162 * 32 / local137.anInt5084;
							return;
						}
						if (local137.anInt5148 > 0) {
							local137.anInt5162 = local137.anInt5162 * 32 / local137.anInt5148;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt5085 = 2;
						local137.anInt5132 = anIntArray652[--anInt9012];
						if (local137.anInt5154 == -1) {
							Static110.method1658(local137.anInt5112);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt5085 = 3;
						local137.anInt5132 = -1;
						if (local137.anInt5154 == -1) {
							Static110.method1658(local137.anInt5112);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt5085 = 6;
						local137.anInt5132 = anIntArray652[--anInt9012];
						if (local137.anInt5154 == -1) {
							Static110.method1658(local137.anInt5112);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt5085 = 5;
						local137.anInt5132 = anIntArray652[--anInt9012];
						if (local137.anInt5154 == -1) {
							Static110.method1658(local137.anInt5112);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt9012 -= 4;
						local137.anInt5150 = anIntArray652[anInt9012];
						local137.anInt5092 = anIntArray652[anInt9012 + 1];
						local137.anInt5096 = anIntArray652[anInt9012 + 2];
						local137.anInt5160 = anIntArray652[anInt9012 + 3];
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt9012 -= 2;
						local137.anInt5141 = anIntArray652[anInt9012];
						local137.anInt5135 = anIntArray652[anInt9012 + 1];
						Static515.method7134(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt9012 -= 4;
						local137.anInt5132 = anIntArray652[anInt9012];
						local137.anInt5102 = anIntArray652[anInt9012 + 1];
						if (anIntArray652[anInt9012 + 2] == 1) {
							local137.anInt5085 = 9;
						} else {
							local137.anInt5085 = 8;
						}
						if (anIntArray652[anInt9012 + 3] == 1) {
							local137.aBoolean405 = true;
						} else {
							local137.aBoolean405 = false;
						}
						if (local137.anInt5154 == -1) {
							Static110.method1658(local137.anInt5112);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt5085 = 5;
						local137.anInt5132 = Static222.anInt4184;
						local137.anInt5102 = 0;
						if (local137.anInt5154 == -1) {
							Static110.method1658(local137.anInt5112);
						}
						return;
					}
				} else {
					@Pc(2309) int local2309;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static117.method1748(anIntArray652[--anInt9012]);
						} else {
							local137 = arg1 ? aClass196_12 : aClass196_13;
						}
						if (arg0 == 1300) {
							local19 = anIntArray652[--anInt9012] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method4233(local19, aStringArray171[--anInt9010]);
								return;
							}
							anInt9010--;
							return;
						}
						if (arg0 == 1301) {
							anInt9012 -= 2;
							local19 = anIntArray652[anInt9012];
							local25 = anIntArray652[anInt9012 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass196_2 = null;
								return;
							}
							local137.aClass196_2 = Static217.method3485(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray652[--anInt9012];
							if (local19 != Static18.anInt506 && local19 != Static446.anInt7792 && local19 != Static363.anInt6453) {
								return;
							}
							local137.anInt5168 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt5091 = anIntArray652[--anInt9012];
							return;
						}
						if (arg0 == 1304) {
							local137.lb = anIntArray652[--anInt9012];
							return;
						}
						if (arg0 == 1305) {
							local137.aString41 = aStringArray171[--anInt9010];
							return;
						}
						if (arg0 == 1306) {
							local137.aString39 = aStringArray171[--anInt9010];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray84 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt5138 = anIntArray652[--anInt9012];
							local137.anInt5116 = anIntArray652[--anInt9012];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray652[--anInt9012];
							local25 = anIntArray652[--anInt9012];
							if (local25 >= 1 && local25 <= 10) {
								local137.method4238(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString43 = aStringArray171[--anInt9010];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt5077 = anIntArray652[--anInt9012];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt9012 -= 3;
								local19 = anIntArray652[anInt9012] - 1;
								local25 = anIntArray652[anInt9012 + 1];
								local353 = anIntArray652[anInt9012 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt9012 -= 2;
								local19 = 10;
								local25 = anIntArray652[anInt9012];
								local353 = anIntArray652[anInt9012 + 1];
							}
							if (local137.aByteArray60 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray60 = new byte[11];
								local137.aByteArray61 = new byte[11];
								local137.anIntArray357 = new int[11];
							}
							local137.aByteArray60[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean414 = false;
								for (local2309 = 0; local2309 < local137.aByteArray60.length; local2309++) {
									if (local137.aByteArray60[local2309] != 0) {
										local137.aBoolean414 = true;
										break;
									}
								}
							} else {
								local137.aBoolean414 = true;
							}
							local137.aByteArray61[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt5156 = anIntArray652[--anInt9012];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static117.method1748(anIntArray652[--anInt9012]);
						} else {
							local137 = arg1 ? aClass196_12 : aClass196_13;
						}
						if (arg0 == 1499) {
							local137.method4232();
							return;
						}
						local1145 = aStringArray171[--anInt9010];
						@Pc(2395) int[] local2395 = null;
						if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
							local353 = anIntArray652[--anInt9012];
							if (local353 > 0) {
								local2395 = new int[local353];
								while (local353-- > 0) {
									local2395[local353] = anIntArray652[--anInt9012];
								}
							}
							local1145 = local1145.substring(0, local1145.length() - 1);
						}
						@Pc(2447) Object[] local2447 = new Object[local1145.length() + 1];
						for (local2309 = local2447.length - 1; local2309 >= 1; local2309--) {
							if (local1145.charAt(local2309 - 1) == 's') {
								local2447[local2309] = aStringArray171[--anInt9010];
							} else {
								local2447[local2309] = Integer.valueOf(anIntArray652[--anInt9012]);
							}
						}
						local56 = anIntArray652[--anInt9012];
						if (local56 == -1) {
							local2447 = null;
						} else {
							local2447[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray18 = local2447;
						} else if (arg0 == 1401) {
							local137.anObjectArray19 = local2447;
						} else if (arg0 == 1402) {
							local137.anObjectArray11 = local2447;
						} else if (arg0 == 1403) {
							local137.anObjectArray1 = local2447;
						} else if (arg0 == 1404) {
							local137.anObjectArray16 = local2447;
						} else if (arg0 == 1405) {
							local137.anObjectArray7 = local2447;
						} else if (arg0 == 1406) {
							local137.anObjectArray3 = local2447;
						} else if (arg0 == 1407) {
							local137.anObjectArray27 = local2447;
							local137.anIntArray349 = local2395;
						} else if (arg0 == 1408) {
							local137.anObjectArray8 = local2447;
						} else if (arg0 == 1409) {
							local137.anObjectArray30 = local2447;
						} else if (arg0 == 1410) {
							local137.anObjectArray29 = local2447;
						} else if (arg0 == 1411) {
							local137.anObjectArray26 = local2447;
						} else if (arg0 == 1412) {
							local137.anObjectArray14 = local2447;
						} else if (arg0 == 1414) {
							local137.anObjectArray23 = local2447;
							local137.anIntArray350 = local2395;
						} else if (arg0 == 1415) {
							local137.anObjectArray21 = local2447;
							local137.anIntArray356 = local2395;
						} else if (arg0 == 1416) {
							local137.anObjectArray13 = local2447;
						} else if (arg0 == 1417) {
							local137.anObjectArray10 = local2447;
						} else if (arg0 == 1418) {
							local137.anObjectArray5 = local2447;
						} else if (arg0 == 1419) {
							local137.anObjectArray28 = local2447;
						} else if (arg0 == 1420) {
							local137.anObjectArray6 = local2447;
						} else if (arg0 == 1421) {
							local137.anObjectArray12 = local2447;
						} else if (arg0 == 1422) {
							local137.anObjectArray17 = local2447;
						} else if (arg0 == 1423) {
							local137.anObjectArray24 = local2447;
						} else if (arg0 == 1424) {
							local137.anObjectArray25 = local2447;
						} else if (arg0 == 1425) {
							local137.anObjectArray22 = local2447;
						} else if (arg0 == 1426) {
							local137.anObjectArray4 = local2447;
						} else if (arg0 == 1427) {
							local137.anObjectArray31 = local2447;
						} else if (arg0 == 1428) {
							local137.anObjectArray2 = local2447;
							local137.anIntArray354 = local2395;
						} else if (arg0 == 1429) {
							local137.anObjectArray9 = local2447;
							local137.anIntArray353 = local2395;
						} else if (arg0 == 1430) {
							local137.anObjectArray15 = local2447;
						}
						local137.aBoolean407 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass196_12 : aClass196_13;
						if (arg0 == 1500) {
							anIntArray652[anInt9012++] = local137.anInt5095;
							return;
						}
						if (arg0 == 1501) {
							anIntArray652[anInt9012++] = local137.anInt5093;
							return;
						}
						if (arg0 == 1502) {
							anIntArray652[anInt9012++] = local137.anInt5130;
							return;
						}
						if (arg0 == 1503) {
							anIntArray652[anInt9012++] = local137.anInt5078;
							return;
						}
						if (arg0 == 1504) {
							anIntArray652[anInt9012++] = local137.aBoolean416 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray652[anInt9012++] = local137.anInt5089;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static29.method541(local137);
							anIntArray652[anInt9012++] = local158 == null ? -1 : local158.anInt5112;
							return;
						}
					} else {
						@Pc(3043) Class352 local3043;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass196_12 : aClass196_13;
							if (arg0 == 1600) {
								anIntArray652[anInt9012++] = local137.anInt5125;
								return;
							}
							if (arg0 == 1601) {
								anIntArray652[anInt9012++] = local137.anInt5115;
								return;
							}
							if (arg0 == 1602) {
								aStringArray171[anInt9010++] = local137.aString42;
								return;
							}
							if (arg0 == 1603) {
								anIntArray652[anInt9012++] = local137.anInt5146;
								return;
							}
							if (arg0 == 1604) {
								anIntArray652[anInt9012++] = local137.anInt5164;
								return;
							}
							if (arg0 == 1605) {
								anIntArray652[anInt9012++] = local137.anInt5162;
								return;
							}
							if (arg0 == 1606) {
								anIntArray652[anInt9012++] = local137.anInt5144;
								return;
							}
							if (arg0 == 1607) {
								anIntArray652[anInt9012++] = local137.anInt5167;
								return;
							}
							if (arg0 == 1608) {
								anIntArray652[anInt9012++] = local137.anInt5133;
								return;
							}
							if (arg0 == 1609) {
								anIntArray652[anInt9012++] = local137.anInt5111;
								return;
							}
							if (arg0 == 1610) {
								anIntArray652[anInt9012++] = local137.anInt5153;
								return;
							}
							if (arg0 == 1611) {
								anIntArray652[anInt9012++] = local137.anInt5149;
								return;
							}
							if (arg0 == 1612) {
								anIntArray652[anInt9012++] = local137.anInt5124;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray652[--anInt9012];
								local3043 = Static241.aClass82_1.method1498(local19);
								if (local3043.method7723()) {
									aStringArray171[anInt9010++] = local137.method4243(local3043.aString99, local19);
									return;
								}
								anIntArray652[anInt9012++] = local137.method4249(local3043.anInt9310, local19);
								return;
							}
							if (arg0 == 1614) {
								anIntArray652[anInt9012++] = local137.anInt5109;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass196_12 : aClass196_13;
							if (arg0 == 1700) {
								anIntArray652[anInt9012++] = local137.anInt5152;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt5152 != -1) {
									anIntArray652[anInt9012++] = local137.anInt5165;
									return;
								}
								anIntArray652[anInt9012++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray652[anInt9012++] = local137.anInt5154;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass196_12 : aClass196_13;
							if (arg0 == 1800) {
								anIntArray652[anInt9012++] = Static67.method1102(local137).method5420();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray652[--anInt9012];
								local19--;
								if (local137.aStringArray84 != null && local19 < local137.aStringArray84.length && local137.aStringArray84[local19] != null) {
									aStringArray171[anInt9010++] = local137.aStringArray84[local19];
									return;
								}
								aStringArray171[anInt9010++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString41 == null) {
									aStringArray171[anInt9010++] = "";
									return;
								}
								aStringArray171[anInt9010++] = local137.aString41;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static117.method1748(anIntArray652[--anInt9012]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass196_12 : aClass196_13;
							}
							if (anInt9019 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray31 == null) {
									return;
								}
								@Pc(3293) Class2_Sub31 local3293 = new Class2_Sub31();
								local3293.aClass196_4 = local137;
								local3293.anObjectArray32 = local137.anObjectArray31;
								local3293.anInt6079 = anInt9019 + 1;
								Static516.aClass8_60.method212(local3293);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static117.method1748(anIntArray652[--anInt9012]);
							if (arg0 == 2500) {
								anIntArray652[anInt9012++] = local137.anInt5095;
								return;
							}
							if (arg0 == 2501) {
								anIntArray652[anInt9012++] = local137.anInt5093;
								return;
							}
							if (arg0 == 2502) {
								anIntArray652[anInt9012++] = local137.anInt5130;
								return;
							}
							if (arg0 == 2503) {
								anIntArray652[anInt9012++] = local137.anInt5078;
								return;
							}
							if (arg0 == 2504) {
								anIntArray652[anInt9012++] = local137.aBoolean416 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray652[anInt9012++] = local137.anInt5089;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static29.method541(local137);
								anIntArray652[anInt9012++] = local158 == null ? -1 : local158.anInt5112;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static117.method1748(anIntArray652[--anInt9012]);
							if (arg0 == 2600) {
								anIntArray652[anInt9012++] = local137.anInt5125;
								return;
							}
							if (arg0 == 2601) {
								anIntArray652[anInt9012++] = local137.anInt5115;
								return;
							}
							if (arg0 == 2602) {
								aStringArray171[anInt9010++] = local137.aString42;
								return;
							}
							if (arg0 == 2603) {
								anIntArray652[anInt9012++] = local137.anInt5146;
								return;
							}
							if (arg0 == 2604) {
								anIntArray652[anInt9012++] = local137.anInt5164;
								return;
							}
							if (arg0 == 2605) {
								anIntArray652[anInt9012++] = local137.anInt5162;
								return;
							}
							if (arg0 == 2606) {
								anIntArray652[anInt9012++] = local137.anInt5144;
								return;
							}
							if (arg0 == 2607) {
								anIntArray652[anInt9012++] = local137.anInt5167;
								return;
							}
							if (arg0 == 2608) {
								anIntArray652[anInt9012++] = local137.anInt5133;
								return;
							}
							if (arg0 == 2609) {
								anIntArray652[anInt9012++] = local137.anInt5111;
								return;
							}
							if (arg0 == 2610) {
								anIntArray652[anInt9012++] = local137.anInt5153;
								return;
							}
							if (arg0 == 2611) {
								anIntArray652[anInt9012++] = local137.anInt5149;
								return;
							}
							if (arg0 == 2612) {
								anIntArray652[anInt9012++] = local137.anInt5124;
								return;
							}
							if (arg0 == 2613) {
								anIntArray652[anInt9012++] = local137.anInt5109;
								return;
							}
						} else {
							@Pc(3803) Class2_Sub44 local3803;
							@Pc(3701) Class2_Sub44 local3701;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static117.method1748(anIntArray652[--anInt9012]);
									anIntArray652[anInt9012++] = local137.anInt5152;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static117.method1748(anIntArray652[--anInt9012]);
									if (local137.anInt5152 != -1) {
										anIntArray652[anInt9012++] = local137.anInt5165;
										return;
									}
									anIntArray652[anInt9012++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray652[--anInt9012];
									local3701 = (Class2_Sub44) Static217.aClass162_20.method3519((long) local13);
									if (local3701 != null) {
										anIntArray652[anInt9012++] = 1;
										return;
									}
									anIntArray652[anInt9012++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static117.method1748(anIntArray652[--anInt9012]);
									if (local137.aClass196Array2 == null) {
										anIntArray652[anInt9012++] = 0;
										return;
									}
									local19 = local137.aClass196Array2.length;
									for (local25 = 0; local25 < local137.aClass196Array2.length; local25++) {
										if (local137.aClass196Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray652[anInt9012++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt9012 -= 2;
									local13 = anIntArray652[anInt9012];
									local19 = anIntArray652[anInt9012 + 1];
									local3803 = (Class2_Sub44) Static217.aClass162_20.method3519((long) local13);
									if (local3803 != null && local3803.anInt8608 == local19) {
										anIntArray652[anInt9012++] = 1;
										return;
									}
									anIntArray652[anInt9012++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static117.method1748(anIntArray652[--anInt9012]);
								if (arg0 == 2800) {
									anIntArray652[anInt9012++] = Static67.method1102(local137).method5420();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray652[--anInt9012];
									local19--;
									if (local137.aStringArray84 != null && local19 < local137.aStringArray84.length && local137.aStringArray84[local19] != null) {
										aStringArray171[anInt9010++] = local137.aStringArray84[local19];
										return;
									}
									aStringArray171[anInt9010++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString41 == null) {
										aStringArray171[anInt9010++] = "";
										return;
									}
									aStringArray171[anInt9010++] = local137.aString41;
									return;
								}
							} else {
								@Pc(3940) String local3940;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3940 = aStringArray171[--anInt9010];
										Static339.method2369(local3940);
										return;
									}
									if (arg0 == 3101) {
										anInt9012 -= 2;
										Static50.method897(anIntArray652[anInt9012 + 1], Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2, anIntArray652[anInt9012]);
										return;
									}
									if (arg0 == 3103) {
										Static261.method6641();
										return;
									}
									if (arg0 == 3104) {
										local3940 = aStringArray171[--anInt9010];
										local19 = 0;
										if (Static271.method4107(local3940)) {
											local19 = Static158.method2594(local3940);
										}
										@Pc(4000) Class2_Sub42 local4000 = Static249.method3910(Static42.aClass286_13, Static400.aClass145_2);
										local4000.aClass2_Sub15_Sub2_2.method4288(local19);
										Static531.method7296(local4000);
										return;
									}
									@Pc(4029) Class2_Sub42 local4029;
									if (arg0 == 3105) {
										local3940 = aStringArray171[--anInt9010];
										local4029 = Static249.method3910(Static61.aClass286_19, Static400.aClass145_2);
										local4029.aClass2_Sub15_Sub2_2.method4333(local3940.length() + 1);
										local4029.aClass2_Sub15_Sub2_2.method4313(local3940);
										Static531.method7296(local4029);
										return;
									}
									if (arg0 == 3106) {
										local3940 = aStringArray171[--anInt9010];
										local4029 = Static249.method3910(Static429.aClass286_134, Static400.aClass145_2);
										local4029.aClass2_Sub15_Sub2_2.method4333(local3940.length() + 1);
										local4029.aClass2_Sub15_Sub2_2.method4313(local3940);
										Static531.method7296(local4029);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray652[--anInt9012];
										local1145 = aStringArray171[--anInt9010];
										Static166.method2909(local13, local1145);
										return;
									}
									if (arg0 == 3108) {
										anInt9012 -= 3;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										local25 = anIntArray652[anInt9012 + 2];
										local35 = Static117.method1748(local25);
										Static580.method7845(local13, local35, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										local210 = arg1 ? aClass196_12 : aClass196_13;
										Static580.method7845(local13, local210, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray652[--anInt9012];
										local4029 = Static249.method3910(Static503.aClass286_150, Static400.aClass145_2);
										local4029.aClass2_Sub15_Sub2_2.method4350(local13);
										Static531.method7296(local4029);
										return;
									}
									if (arg0 == 3111) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										local3803 = (Class2_Sub44) Static217.aClass162_20.method3519((long) local13);
										if (local3803 != null) {
											Static564.method7655(true, local3803.anInt8608 != local19, local3803);
										}
										Static259.method4033(true, 3, local13, local19);
										return;
									}
									if (arg0 == 3112) {
										anInt9012--;
										local13 = anIntArray652[anInt9012];
										local3701 = (Class2_Sub44) Static217.aClass162_20.method3519((long) local13);
										if (local3701 != null && local3701.anInt8607 == 3) {
											Static564.method7655(true, true, local3701);
										}
										return;
									}
									if (arg0 == 3113) {
										Static466.method6568(aStringArray171[--anInt9010]);
										return;
									}
									if (arg0 == 3114) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										local1507 = aStringArray171[--anInt9010];
										Static375.method5567("", local1507, local13, "", local19, "");
										return;
									}
									if (arg0 == 3115) {
										anInt9012 -= 11;
										@Pc(4330) Class62[] local4330 = Static92.method1451();
										@Pc(4333) Class279[] local4333 = Static90.method1419();
										Static260.method4037(anIntArray652[anInt9012 + 2], anIntArray652[anInt9012 + 4], local4333[anIntArray652[anInt9012 + 1]], local4330[anIntArray652[anInt9012]], anIntArray652[anInt9012 + 10], anIntArray652[anInt9012 + 7], anIntArray652[anInt9012 + 5], anIntArray652[anInt9012 + 8], anIntArray652[anInt9012 + 3], anIntArray652[anInt9012 + 9], anIntArray652[anInt9012 + 6]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt9012 -= 3;
										Static228.method3557(255, anIntArray652[anInt9012], anIntArray652[anInt9012 + 1], anIntArray652[anInt9012 + 2]);
										return;
									}
									if (arg0 == 3201) {
										Static18.method321(anIntArray652[--anInt9012], 255, 50);
										return;
									}
									if (arg0 == 3202) {
										anInt9012 -= 2;
										Static110.method1656(255, anIntArray652[anInt9012 + 1], anIntArray652[anInt9012]);
										return;
									}
									if (arg0 == 3203) {
										anInt9012 -= 4;
										Static228.method3557(anIntArray652[anInt9012 + 3], anIntArray652[anInt9012], anIntArray652[anInt9012 + 1], anIntArray652[anInt9012 + 2]);
										return;
									}
									if (arg0 == 3204) {
										anInt9012 -= 3;
										Static18.method321(anIntArray652[anInt9012], anIntArray652[anInt9012 + 1], anIntArray652[anInt9012 + 2]);
										return;
									}
									if (arg0 == 3205) {
										anInt9012 -= 3;
										Static110.method1656(anIntArray652[anInt9012 + 2], anIntArray652[anInt9012 + 1], anIntArray652[anInt9012]);
										return;
									}
									if (arg0 == 3206) {
										anInt9012 -= 4;
										Static385.method5669(anIntArray652[anInt9012], anIntArray652[anInt9012 + 1], anIntArray652[anInt9012 + 2], anIntArray652[anInt9012 + 3], false);
										return;
									}
									if (arg0 == 3207) {
										anInt9012 -= 4;
										Static385.method5669(anIntArray652[anInt9012], anIntArray652[anInt9012 + 1], anIntArray652[anInt9012 + 2], anIntArray652[anInt9012 + 3], true);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray652[anInt9012++] = Static412.anInt575;
										return;
									}
									if (arg0 == 3301) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = Static276.method3100(local19, false, local13);
										return;
									}
									if (arg0 == 3302) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = Static395.method5769(local13, local19, false);
										return;
									}
									if (arg0 == 3303) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = Static17.method314(false, local13, local19);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static557.aClass307_1.method6856(local13).anInt6492;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static234.anIntArray279[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static86.anIntArray96[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static331.anIntArray426[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4787) byte local4787 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112;
										local19 = (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761 >> 9) + Static35.anInt906;
										local25 = (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764 >> 9) + Static130.anInt5246;
										anIntArray652[anInt9012++] = (local4787 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray652[anInt9012++] = Static451.aBoolean23 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = Static276.method3100(local19, true, local13);
										return;
									}
									if (arg0 == 3314) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = Static395.method5769(local13, local19, true);
										return;
									}
									if (arg0 == 3315) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = Static17.method314(true, local13, local19);
										return;
									}
									if (arg0 == 3316) {
										if (Static210.anInt4045 >= 2) {
											anIntArray652[anInt9012++] = Static210.anInt4045;
											return;
										}
										anIntArray652[anInt9012++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray652[anInt9012++] = Static94.anInt1996;
										return;
									}
									if (arg0 == 3318) {
										anIntArray652[anInt9012++] = Static176.aClass170_3.anInt4548;
										return;
									}
									if (arg0 == 3321) {
										anIntArray652[anInt9012++] = Static254.anInt4709;
										return;
									}
									if (arg0 == 3322) {
										anIntArray652[anInt9012++] = Static186.anInt3835;
										return;
									}
									if (arg0 == 3323) {
										if (Static422.anInt7237 >= 5 && Static422.anInt7237 <= 9) {
											anIntArray652[anInt9012++] = 1;
											return;
										}
										anIntArray652[anInt9012++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static422.anInt7237 >= 5 && Static422.anInt7237 <= 9) {
											anIntArray652[anInt9012++] = Static422.anInt7237;
											return;
										}
										anIntArray652[anInt9012++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray652[anInt9012++] = Static161.aBoolean284 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray652[anInt9012++] = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7430;
										return;
									}
									if (arg0 == 3327) {
										anIntArray652[anInt9012++] = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aClass194_1.aBoolean400 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray652[anInt9012++] = Static532.aBoolean675 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static234.method3639(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = Static224.method3517(false, local19, local13);
										return;
									}
									if (arg0 == 3332) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = Static224.method3517(true, local19, local13);
										return;
									}
									if (arg0 == 3333) {
										anIntArray652[anInt9012++] = Static402.anInt7015;
										return;
									}
									if (arg0 == 3335) {
										anIntArray652[anInt9012++] = Static52.anInt1264;
										return;
									}
									if (arg0 == 3336) {
										anInt9012 -= 4;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										local25 = anIntArray652[anInt9012 + 2];
										local353 = anIntArray652[anInt9012 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray652[anInt9012++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray652[anInt9012++] = Static200.anInt3958;
										return;
									}
									if (arg0 == 3338) {
										anIntArray652[anInt9012++] = Static547.method5857();
										return;
									}
									if (arg0 == 3339) {
										anIntArray652[anInt9012++] = Static546.aBoolean686 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray652[anInt9012++] = Static523.aBoolean664 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray652[anInt9012++] = Static458.aBoolean624 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray652[anInt9012++] = Static326.aClass149_1.method5879();
										return;
									}
									if (arg0 == 3343) {
										anIntArray652[anInt9012++] = Static326.aClass149_1.method5875();
										return;
									}
									if (arg0 == 3344) {
										aStringArray171[anInt9010++] = Static80.method1272();
										return;
									}
									if (arg0 == 3345) {
										aStringArray171[anInt9010++] = Static545.method7414();
										return;
									}
									if (arg0 == 3346) {
										anIntArray652[anInt9012++] = Static582.method7906();
										return;
									}
									if (arg0 == 3347) {
										anIntArray652[anInt9012++] = Static252.anInt4688;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5522) Class309 local5522;
									if (arg0 == 3400) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										local5522 = Static522.aClass217_1.method5012(local13);
										aStringArray171[anInt9010++] = local5522.method6908(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt9012 -= 4;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										local25 = anIntArray652[anInt9012 + 2];
										local353 = anIntArray652[anInt9012 + 3];
										@Pc(5568) Class309 local5568 = Static522.aClass217_1.method5012(local25);
										if (local5568.aChar4 == local13 && local5568.aChar3 == local19) {
											if (local19 == 115) {
												aStringArray171[anInt9010++] = local5568.method6908(local353);
												return;
											}
											anIntArray652[anInt9012++] = local5568.method6906(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt9012 -= 3;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										local25 = anIntArray652[anInt9012 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5644) Class309 local5644 = Static522.aClass217_1.method5012(local19);
										if (local5644.aChar3 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray652[anInt9012++] = local5644.method6903(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray652[--anInt9012];
										local1145 = aStringArray171[--anInt9010];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5522 = Static522.aClass217_1.method5012(local13);
										if (local5522.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray652[anInt9012++] = local5522.method6893(local1145) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray652[--anInt9012];
										@Pc(5742) Class309 local5742 = Static522.aClass217_1.method5012(local13);
										anIntArray652[anInt9012++] = local5742.aClass162_36.method3524();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static138.anInt2888 == 0) {
											anIntArray652[anInt9012++] = -2;
											return;
										}
										if (Static138.anInt2888 == 1) {
											anIntArray652[anInt9012++] = -1;
											return;
										}
										anIntArray652[anInt9012++] = Static451.anInt487;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray652[--anInt9012];
										if (Static138.anInt2888 == 2 && local13 < Static451.anInt487) {
											aStringArray171[anInt9010++] = Static306.aStringArray92[local13];
											if (Static362.aStringArray106[local13] != null) {
												aStringArray171[anInt9010++] = Static362.aStringArray106[local13];
												return;
											}
											aStringArray171[anInt9010++] = "";
											return;
										}
										aStringArray171[anInt9010++] = "";
										aStringArray171[anInt9010++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray652[--anInt9012];
										if (Static138.anInt2888 == 2 && local13 < Static451.anInt487) {
											anIntArray652[anInt9012++] = Static103.anIntArray134[local13];
											return;
										}
										anIntArray652[anInt9012++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray652[--anInt9012];
										if (Static138.anInt2888 == 2 && local13 < Static451.anInt487) {
											anIntArray652[anInt9012++] = Static31.anIntArray49[local13];
											return;
										}
										anIntArray652[anInt9012++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3940 = aStringArray171[--anInt9010];
										local19 = anIntArray652[--anInt9012];
										Static393.method5763(local19, local3940);
										return;
									}
									if (arg0 == 3605) {
										local3940 = aStringArray171[--anInt9010];
										Static462.method6519(local3940);
										return;
									}
									if (arg0 == 3606) {
										local3940 = aStringArray171[--anInt9010];
										Static199.method3278(local3940);
										return;
									}
									if (arg0 == 3607) {
										local3940 = aStringArray171[--anInt9010];
										Static355.method5271(false, local3940);
										return;
									}
									if (arg0 == 3608) {
										local3940 = aStringArray171[--anInt9010];
										Static95.method1480(local3940);
										return;
									}
									if (arg0 == 3609) {
										local3940 = aStringArray171[--anInt9010];
										if (local3940.startsWith("<img=0>") || local3940.startsWith("<img=1>")) {
											local3940 = local3940.substring(7);
										}
										anIntArray652[anInt9012++] = Static579.method7832(local3940) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray652[--anInt9012];
										if (Static138.anInt2888 == 2 && local13 < Static451.anInt487) {
											aStringArray171[anInt9010++] = Static93.aStringArray31[local13];
											return;
										}
										aStringArray171[anInt9010++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static452.aString72 != null) {
											aStringArray171[anInt9010++] = Static460.method7784(Static452.aString72);
											return;
										}
										aStringArray171[anInt9010++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static452.aString72 != null) {
											anIntArray652[anInt9012++] = Static584.anInt9522;
											return;
										}
										anIntArray652[anInt9012++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray652[--anInt9012];
										if (Static452.aString72 != null && local13 < Static584.anInt9522) {
											aStringArray171[anInt9010++] = Static350.aClass150Array1[local13].aString26;
											return;
										}
										aStringArray171[anInt9010++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray652[--anInt9012];
										if (Static452.aString72 != null && local13 < Static584.anInt9522) {
											anIntArray652[anInt9012++] = Static350.aClass150Array1[local13].anInt4104;
											return;
										}
										anIntArray652[anInt9012++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray652[--anInt9012];
										if (Static452.aString72 != null && local13 < Static584.anInt9522) {
											anIntArray652[anInt9012++] = Static350.aClass150Array1[local13].aByte52;
											return;
										}
										anIntArray652[anInt9012++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray652[anInt9012++] = Static206.aByte49;
										return;
									}
									if (arg0 == 3617) {
										local3940 = aStringArray171[--anInt9010];
										Static481.method6795(local3940);
										return;
									}
									if (arg0 == 3618) {
										anIntArray652[anInt9012++] = Static60.aByte29;
										return;
									}
									if (arg0 == 3619) {
										local3940 = aStringArray171[--anInt9010];
										Static213.method3439(local3940);
										return;
									}
									if (arg0 == 3620) {
										Static551.method7478();
										return;
									}
									if (arg0 == 3621) {
										if (Static138.anInt2888 == 0) {
											anIntArray652[anInt9012++] = -1;
											return;
										}
										anIntArray652[anInt9012++] = Static81.anInt1768;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray652[--anInt9012];
										if (Static138.anInt2888 != 0 && local13 < Static81.anInt1768) {
											aStringArray171[anInt9010++] = Static360.aStringArray115[local13];
											if (Static323.aStringArray99[local13] != null) {
												aStringArray171[anInt9010++] = Static323.aStringArray99[local13];
												return;
											}
											aStringArray171[anInt9010++] = "";
											return;
										}
										aStringArray171[anInt9010++] = "";
										aStringArray171[anInt9010++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3940 = aStringArray171[--anInt9010];
										if (local3940.startsWith("<img=0>") || local3940.startsWith("<img=1>")) {
											local3940 = local3940.substring(7);
										}
										anIntArray652[anInt9012++] = Static431.method6124(local3940) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray652[--anInt9012];
										if (Static350.aClass150Array1 != null && local13 < Static584.anInt9522 && Static350.aClass150Array1[local13].aString29.equalsIgnoreCase(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aString67)) {
											anIntArray652[anInt9012++] = 1;
											return;
										}
										anIntArray652[anInt9012++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static374.aString60 != null) {
											aStringArray171[anInt9010++] = Static374.aString60;
											return;
										}
										aStringArray171[anInt9010++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray652[--anInt9012];
										if (Static452.aString72 != null && local13 < Static584.anInt9522) {
											aStringArray171[anInt9010++] = Static350.aClass150Array1[local13].aString28;
											return;
										}
										aStringArray171[anInt9010++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray652[--anInt9012];
										if (Static138.anInt2888 == 2 && local13 >= 0 && local13 < Static451.anInt487) {
											anIntArray652[anInt9012++] = Static88.aBooleanArray9[local13] ? 1 : 0;
											return;
										}
										anIntArray652[anInt9012++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3940 = aStringArray171[--anInt9010];
										if (local3940.startsWith("<img=0>") || local3940.startsWith("<img=1>")) {
											local3940 = local3940.substring(7);
										}
										anIntArray652[anInt9012++] = Static548.method7441(local3940);
										return;
									}
									if (arg0 == 3629) {
										anIntArray652[anInt9012++] = Static107.anInt2202;
										return;
									}
									if (arg0 == 3630) {
										local3940 = aStringArray171[--anInt9010];
										Static355.method5271(true, local3940);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static128.aBooleanArray12[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray652[--anInt9012];
										if (Static452.aString72 != null && local13 < Static584.anInt9522) {
											aStringArray171[anInt9010++] = Static350.aClass150Array1[local13].aString29;
											return;
										}
										aStringArray171[anInt9010++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray652[--anInt9012];
										if (Static138.anInt2888 != 0 && local13 < Static81.anInt1768) {
											aStringArray171[anInt9010++] = Static461.aStringArray144[local13];
											return;
										}
										aStringArray171[anInt9010++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static286.aClass239Array1[local13].method5604();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static286.aClass239Array1[local13].anInt6695;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static286.aClass239Array1[local13].anInt6699;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static286.aClass239Array1[local13].anInt6700;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static286.aClass239Array1[local13].anInt6701;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static286.aClass239Array1[local13].anInt6696;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray652[--anInt9012];
										local19 = Static286.aClass239Array1[local13].method5601();
										anIntArray652[anInt9012++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray652[--anInt9012];
										local19 = Static286.aClass239Array1[local13].method5601();
										anIntArray652[anInt9012++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray652[--anInt9012];
										local19 = Static286.aClass239Array1[local13].method5601();
										anIntArray652[anInt9012++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray652[--anInt9012];
										local19 = Static286.aClass239Array1[local13].method5601();
										anIntArray652[anInt9012++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt9012 -= 5;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										local25 = anIntArray652[anInt9012 + 2];
										local353 = anIntArray652[anInt9012 + 3];
										local2309 = anIntArray652[anInt9012 + 4];
										anIntArray652[anInt9012++] = local13 + (local19 - local13) * (local2309 - local25) / (local353 - local25);
										return;
									}
									@Pc(7252) long local7252;
									@Pc(7245) long local7245;
									if (arg0 == 4007) {
										anInt9012 -= 2;
										local7245 = anIntArray652[anInt9012];
										local7252 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = (int) (local7245 + local7245 * local7252 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										if (local13 == 0) {
											anIntArray652[anInt9012++] = 0;
											return;
										}
										anIntArray652[anInt9012++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										if (local13 == 0) {
											anIntArray652[anInt9012++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray652[anInt9012++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray652[anInt9012++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt9012 -= 3;
										local7245 = anIntArray652[anInt9012];
										local7252 = anIntArray652[anInt9012 + 1];
										@Pc(7633) long local7633 = (long) anIntArray652[anInt9012 + 2];
										anIntArray652[anInt9012++] = (int) (local7245 * local7633 / local7252);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3940 = aStringArray171[--anInt9010];
										local19 = anIntArray652[--anInt9012];
										aStringArray171[anInt9010++] = local3940 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt9010 -= 2;
										local3940 = aStringArray171[anInt9010];
										local1145 = aStringArray171[anInt9010 + 1];
										aStringArray171[anInt9010++] = local3940 + local1145;
										return;
									}
									if (arg0 == 4102) {
										local3940 = aStringArray171[--anInt9010];
										local19 = anIntArray652[--anInt9012];
										aStringArray171[anInt9010++] = local3940 + Static26.method450(local19);
										return;
									}
									if (arg0 == 4103) {
										local3940 = aStringArray171[--anInt9010];
										aStringArray171[anInt9010++] = local3940.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray171[anInt9010++] = method7494(anIntArray652[--anInt9012]);
										return;
									}
									if (arg0 == 4105) {
										anInt9010 -= 2;
										local3940 = aStringArray171[anInt9010];
										local1145 = aStringArray171[anInt9010 + 1];
										if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aClass194_1 != null && Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aClass194_1.aBoolean400) {
											aStringArray171[anInt9010++] = local1145;
											return;
										}
										aStringArray171[anInt9010++] = local3940;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray652[--anInt9012];
										aStringArray171[anInt9010++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt9010 -= 2;
										anIntArray652[anInt9012++] = Static406.method5919(Static52.anInt1264, aStringArray171[anInt9010 + 1], aStringArray171[anInt9010]);
										return;
									}
									@Pc(7916) Class294 local7916;
									if (arg0 == 4108) {
										local3940 = aStringArray171[--anInt9010];
										anInt9012 -= 2;
										local19 = anIntArray652[anInt9012];
										local25 = anIntArray652[anInt9012 + 1];
										local7916 = Static437.method6281(Static72.aClass259_33, local25);
										anIntArray652[anInt9012++] = local7916.method6726(local19, local3940, Static491.aClass39Array13);
										return;
									}
									if (arg0 == 4109) {
										local3940 = aStringArray171[--anInt9010];
										anInt9012 -= 2;
										local19 = anIntArray652[anInt9012];
										local25 = anIntArray652[anInt9012 + 1];
										local7916 = Static437.method6281(Static72.aClass259_33, local25);
										anIntArray652[anInt9012++] = local7916.method6722(local3940, Static491.aClass39Array13, local19);
										return;
									}
									if (arg0 == 4110) {
										anInt9010 -= 2;
										local3940 = aStringArray171[anInt9010];
										local1145 = aStringArray171[anInt9010 + 1];
										if (anIntArray652[--anInt9012] == 1) {
											aStringArray171[anInt9010++] = local3940;
											return;
										}
										aStringArray171[anInt9010++] = local1145;
										return;
									}
									if (arg0 == 4111) {
										local3940 = aStringArray171[--anInt9010];
										aStringArray171[anInt9010++] = Static87.method1359(local3940);
										return;
									}
									if (arg0 == 4112) {
										local3940 = aStringArray171[--anInt9010];
										local19 = anIntArray652[--anInt9012];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray171[anInt9010++] = local3940 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static250.method3921((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static367.method5475((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static230.method3608((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static422.method6080((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3940 = aStringArray171[--anInt9010];
										if (local3940 != null) {
											anIntArray652[anInt9012++] = local3940.length();
											return;
										}
										anIntArray652[anInt9012++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3940 = aStringArray171[--anInt9010];
										anInt9012 -= 2;
										local19 = anIntArray652[anInt9012];
										local25 = anIntArray652[anInt9012 + 1];
										aStringArray171[anInt9010++] = local3940.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3940 = aStringArray171[--anInt9010];
										@Pc(8279) StringBuffer local8279 = new StringBuffer(local3940.length());
										@Pc(8281) boolean local8281 = false;
										for (local353 = 0; local353 < local3940.length(); local353++) {
											@Pc(8288) char local8288 = local3940.charAt(local353);
											if (local8288 == '<') {
												local8281 = true;
											} else if (local8288 == '>') {
												local8281 = false;
											} else if (!local8281) {
												local8279.append(local8288);
											}
										}
										aStringArray171[anInt9010++] = local8279.toString();
										return;
									}
									if (arg0 == 4120) {
										local3940 = aStringArray171[--anInt9010];
										anInt9012 -= 2;
										local19 = anIntArray652[anInt9012];
										local25 = anIntArray652[anInt9012 + 1];
										anIntArray652[anInt9012++] = local3940.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt9010 -= 2;
										local3940 = aStringArray171[anInt9010];
										local1145 = aStringArray171[anInt9010 + 1];
										local25 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = local3940.indexOf(local1145, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray652[--anInt9012] != 0;
										local19 = anIntArray652[--anInt9012];
										aStringArray171[anInt9010++] = Static35.method634(Static52.anInt1264, (long) local19, local412, 0);
										return;
									}
									if (arg0 == 4125) {
										local3940 = aStringArray171[--anInt9010];
										local19 = anIntArray652[--anInt9012];
										@Pc(8502) Class294 local8502 = Static437.method6281(Static72.aClass259_33, local19);
										anIntArray652[anInt9012++] = local8502.method6720(Static491.aClass39Array13, local3940);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray652[--anInt9012];
										aStringArray171[anInt9010++] = Static296.aClass218_1.method5067(local13).aString97;
										return;
									}
									@Pc(8564) Class339 local8564;
									if (arg0 == 4201) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										local8564 = Static296.aClass218_1.method5067(local13);
										if (local19 >= 1 && local19 <= 5 && local8564.aStringArray169[local19 - 1] != null) {
											aStringArray171[anInt9010++] = local8564.aStringArray169[local19 - 1];
											return;
										}
										aStringArray171[anInt9010++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										local8564 = Static296.aClass218_1.method5067(local13);
										if (local19 >= 1 && local19 <= 5 && local8564.aStringArray170[local19 - 1] != null) {
											aStringArray171[anInt9010++] = local8564.aStringArray170[local19 - 1];
											return;
										}
										aStringArray171[anInt9010++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static296.aClass218_1.method5067(local13).anInt8997;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static296.aClass218_1.method5067(local13).anInt8988 == 1 ? 1 : 0;
										return;
									}
									@Pc(8727) Class339 local8727;
									if (arg0 == 4205) {
										local13 = anIntArray652[--anInt9012];
										local8727 = Static296.aClass218_1.method5067(local13);
										if (local8727.anInt8947 == -1 && local8727.anInt8998 >= 0) {
											anIntArray652[anInt9012++] = local8727.anInt8998;
											return;
										}
										anIntArray652[anInt9012++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray652[--anInt9012];
										local8727 = Static296.aClass218_1.method5067(local13);
										if (local8727.anInt8947 >= 0 && local8727.anInt8998 >= 0) {
											anIntArray652[anInt9012++] = local8727.anInt8998;
											return;
										}
										anIntArray652[anInt9012++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static296.aClass218_1.method5067(local13).aBoolean688 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										local3043 = Static241.aClass82_1.method1498(local19);
										if (local3043.method7723()) {
											aStringArray171[anInt9010++] = Static296.aClass218_1.method5067(local13).method7469(local3043.aString99, local19);
											return;
										}
										anIntArray652[anInt9012++] = Static296.aClass218_1.method5067(local13).method7471(local19, local3043.anInt9310);
										return;
									}
									if (arg0 == 4209) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1] - 1;
										local8564 = Static296.aClass218_1.method5067(local13);
										if (local8564.anInt8968 == local19) {
											anIntArray652[anInt9012++] = local8564.anInt8995;
											return;
										}
										if (local8564.anInt8982 == local19) {
											anIntArray652[anInt9012++] = local8564.anInt8980;
											return;
										}
										anIntArray652[anInt9012++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3940 = aStringArray171[--anInt9010];
										local19 = anIntArray652[--anInt9012];
										Static66.method7184(local19 == 1, local3940);
										anIntArray652[anInt9012++] = Static537.anInt8790;
										return;
									}
									if (arg0 == 4211) {
										if (Static384.aShortArray113 != null && Static524.anInt8648 < Static537.anInt8790) {
											anIntArray652[anInt9012++] = Static384.aShortArray113[Static524.anInt8648++] & 0xFFFF;
											return;
										}
										anIntArray652[anInt9012++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static524.anInt8648 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray652[--anInt9012];
										anIntArray652[anInt9012++] = Static296.aClass218_1.method5067(local13).anInt8994;
										return;
									}
									if (arg0 == 4214) {
										local3940 = aStringArray171[--anInt9010];
										anInt9012 -= 3;
										local19 = anIntArray652[anInt9012];
										local25 = anIntArray652[anInt9012 + 1];
										local353 = anIntArray652[anInt9012 + 2];
										Static145.method2414(local25, local19 == 1, local3940, local353);
										anIntArray652[anInt9012++] = Static537.anInt8790;
										return;
									}
									if (arg0 == 4215) {
										anInt9010 -= 2;
										anInt9012 -= 2;
										local3940 = aStringArray171[anInt9010];
										local19 = anIntArray652[anInt9012];
										local25 = anIntArray652[anInt9012 + 1];
										@Pc(9126) String local9126 = aStringArray171[anInt9010 + 1];
										Static58.method950(local19 == 1, local9126, local25, local3940);
										anIntArray652[anInt9012++] = Static537.anInt8790;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										local3043 = Static241.aClass82_1.method1498(local19);
										if (local3043.method7723()) {
											aStringArray171[anInt9010++] = Static254.aClass202_2.method4488(local13).method1571(local3043.aString99, local19);
											return;
										}
										anIntArray652[anInt9012++] = Static254.aClass202_2.method4488(local13).method1578(local3043.anInt9310, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										local3043 = Static241.aClass82_1.method1498(local19);
										if (local3043.method7723()) {
											aStringArray171[anInt9010++] = Static541.aClass97_4.method1794(local13).method555(local19, local3043.aString99);
											return;
										}
										anIntArray652[anInt9012++] = Static541.aClass97_4.method1794(local13).method548(local19, local3043.anInt9310);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt9012 -= 2;
										local13 = anIntArray652[anInt9012];
										local19 = anIntArray652[anInt9012 + 1];
										local3043 = Static241.aClass82_1.method1498(local19);
										if (local3043.method7723()) {
											aStringArray171[anInt9010++] = Static23.aClass24_1.method428(local13).method666(local19, local3043.aString99);
											return;
										}
										anIntArray652[anInt9012++] = Static23.aClass24_1.method428(local13).method663(local3043.anInt9310, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray652[--anInt9012];
									@Pc(9354) Class54 local9354 = Static207.aClass354_1.method7795(local13);
									if (local9354.anIntArray75 != null && local9354.anIntArray75.length > 0) {
										local25 = 0;
										local353 = local9354.anIntArray73[0];
										for (local2309 = 1; local2309 < local9354.anIntArray75.length; local2309++) {
											if (local9354.anIntArray73[local2309] > local353) {
												local25 = local2309;
												local353 = local9354.anIntArray73[local2309];
											}
										}
										anIntArray652[anInt9012++] = local9354.anIntArray75[local25];
										return;
									}
									anIntArray652[anInt9012++] = local9354.anInt1394;
									return;
								}
							}
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "()V")
	public static void method7496() {
	}

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "(IZ)V")
	public static void method7498() {
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!mea;I)V")
	private static void method7499(@OriginalArg(0) Class2_Sub31 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray32;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub3_Sub8 local12 = Static256.method3992(local8);
		if (local12 == null) {
			return;
		}
		anIntArray651 = new int[local12.anInt4340];
		@Pc(21) int local21 = 0;
		aStringArray172 = new String[local12.anInt4341];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt6077;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt6076;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass196_4 == null ? -1 : arg0.aClass196_4.anInt5112;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt6081;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass196_4 == null ? -1 : arg0.aClass196_4.anInt5154;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass196_5 == null ? -1 : arg0.aClass196_5.anInt5112;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass196_5 == null ? -1 : arg0.aClass196_5.anInt5154;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt6080;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt6075;
				}
				anIntArray651[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString52;
				}
				aStringArray172[local27++] = local135;
			}
		}
		anInt9019 = arg0.anInt6079;
		method7493(local12, arg1);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!qfa;II)V")
	public static void method7500(@OriginalArg(0) Class269 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub3_Sub8 local5 = Static531.method7293(arg0, arg2, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray651 = new int[local5.anInt4340];
		aStringArray172 = new String[local5.anInt4341];
		if (local5.aClass269_6 == Static199.aClass269_5 || local5.aClass269_6 == Static443.aClass269_8 || local5.aClass269_6 == Static187.aClass269_4) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static368.aClass196_6 != null) {
				local30 = Static368.aClass196_6.anInt5095;
				local32 = Static368.aClass196_6.anInt5093;
			}
			anIntArray651[0] = Static326.aClass149_1.method5879() - local30;
			anIntArray651[1] = Static326.aClass149_1.method5875() - local32;
		}
		method7493(local5, 200000);
	}
}
