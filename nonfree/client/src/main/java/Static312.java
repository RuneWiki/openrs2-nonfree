import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "Lclient!sba;")
	private static Class270 aClass270_1;

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "Lclient!mc;")
	private static Class198 aClass198_10;

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "Lclient!mc;")
	private static Class198 aClass198_11;

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray35;

	@OriginalMember(owner = "client!mr", name = "v", descriptor = "[I")
	private static int[] anIntArray422;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "[I")
	private static final int[] anIntArray420 = new int[5];

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "[I")
	private static final int[] anIntArray421 = new int[1000];

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "[Lclient!hm;")
	private static final Class134[] aClass134Array1 = new Class134[50];

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "[[I")
	private static final int[][] anIntArrayArray54 = new int[5][5000];

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "I")
	private static int anInt6008 = 0;

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
	private static int anInt6009 = 0;

	@OriginalMember(owner = "client!mr", name = "t", descriptor = "I")
	private static int anInt6013 = 0;

	@OriginalMember(owner = "client!mr", name = "w", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray36 = new String[1000];

	@OriginalMember(owner = "client!mr", name = "y", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!mr", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray37 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!mr", name = "A", descriptor = "Lclient!h;")
	public static final Class125 aClass125_44 = new Class125(4);

	@OriginalMember(owner = "client!mr", name = "B", descriptor = "[I")
	private static final int[] anIntArray423 = new int[3];

	@OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
	private static int anInt6016 = 0;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	public static void method5016(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static291.method4732(arg0)) {
			return;
		}
		@Pc(12) Class198[] local12 = Static71.aClass198ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class198 local19 = local12[local14];
			if (local19.anObjectArray13 != null) {
				@Pc(26) Class12_Sub6 local26 = new Class12_Sub6();
				local26.aClass198_2 = local19;
				local26.anObjectArray2 = local19.anObjectArray13;
				method5019(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method5017(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static59.anInt1442 == 0 && (Static451.aBoolean358 && !Static163.aBoolean313 || Static541.aBoolean683)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static400.aClass88_214.method2391(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static400.aClass88_214.method2391(0).length());
		} else if (local11.startsWith(Static370.aClass88_199.method2391(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static370.aClass88_199.method2391(0).length());
		} else if (local11.startsWith(Static210.aClass88_127.method2391(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static210.aClass88_127.method2391(0).length());
		} else if (local11.startsWith(Static206.aClass88_282.method2391(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static206.aClass88_282.method2391(0).length());
		} else if (local11.startsWith(Static68.aClass88_40.method2391(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static68.aClass88_40.method2391(0).length());
		} else if (local11.startsWith(Static398.aClass88_213.method2391(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static398.aClass88_213.method2391(0).length());
		} else if (local11.startsWith(Static496.aClass88_194.method2391(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static496.aClass88_194.method2391(0).length());
		} else if (local11.startsWith(Static21.aClass88_237.method2391(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static21.aClass88_237.method2391(0).length());
		} else if (local11.startsWith(Static287.aClass88_159.method2391(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static287.aClass88_159.method2391(0).length());
		} else if (local11.startsWith(Static141.aClass88_84.method2391(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static141.aClass88_84.method2391(0).length());
		} else if (local11.startsWith(Static440.aClass88_238.method2391(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static440.aClass88_238.method2391(0).length());
		} else if (local11.startsWith(Static139.aClass88_82.method2391(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static139.aClass88_82.method2391(0).length());
		} else if (Static345.anInt6495 != 0) {
			if (local11.startsWith(Static400.aClass88_214.method2391(Static345.anInt6495))) {
				local13 = 0;
				arg0 = arg0.substring(Static400.aClass88_214.method2391(Static345.anInt6495).length());
			} else if (local11.startsWith(Static370.aClass88_199.method2391(Static345.anInt6495))) {
				local13 = 1;
				arg0 = arg0.substring(Static370.aClass88_199.method2391(Static345.anInt6495).length());
			} else if (local11.startsWith(Static210.aClass88_127.method2391(Static345.anInt6495))) {
				local13 = 2;
				arg0 = arg0.substring(Static210.aClass88_127.method2391(Static345.anInt6495).length());
			} else if (local11.startsWith(Static206.aClass88_282.method2391(Static345.anInt6495))) {
				local13 = 3;
				arg0 = arg0.substring(Static206.aClass88_282.method2391(Static345.anInt6495).length());
			} else if (local11.startsWith(Static68.aClass88_40.method2391(Static345.anInt6495))) {
				local13 = 4;
				arg0 = arg0.substring(Static68.aClass88_40.method2391(Static345.anInt6495).length());
			} else if (local11.startsWith(Static398.aClass88_213.method2391(Static345.anInt6495))) {
				local13 = 5;
				arg0 = arg0.substring(Static398.aClass88_213.method2391(Static345.anInt6495).length());
			} else if (local11.startsWith(Static496.aClass88_194.method2391(Static345.anInt6495))) {
				local13 = 6;
				arg0 = arg0.substring(Static496.aClass88_194.method2391(Static345.anInt6495).length());
			} else if (local11.startsWith(Static21.aClass88_237.method2391(Static345.anInt6495))) {
				local13 = 7;
				arg0 = arg0.substring(Static21.aClass88_237.method2391(Static345.anInt6495).length());
			} else if (local11.startsWith(Static287.aClass88_159.method2391(Static345.anInt6495))) {
				local13 = 8;
				arg0 = arg0.substring(Static287.aClass88_159.method2391(Static345.anInt6495).length());
			} else if (local11.startsWith(Static141.aClass88_84.method2391(Static345.anInt6495))) {
				local13 = 9;
				arg0 = arg0.substring(Static141.aClass88_84.method2391(Static345.anInt6495).length());
			} else if (local11.startsWith(Static440.aClass88_238.method2391(Static345.anInt6495))) {
				local13 = 10;
				arg0 = arg0.substring(Static440.aClass88_238.method2391(Static345.anInt6495).length());
			} else if (local11.startsWith(Static139.aClass88_82.method2391(Static345.anInt6495))) {
				local13 = 11;
				arg0 = arg0.substring(Static139.aClass88_82.method2391(Static345.anInt6495).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static111.aClass88_62.method2391(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static111.aClass88_62.method2391(0).length());
		} else if (local11.startsWith(Static26.aClass88_13.method2391(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static26.aClass88_13.method2391(0).length());
		} else if (local11.startsWith(Static160.aClass88_95.method2391(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static160.aClass88_95.method2391(0).length());
		} else if (local11.startsWith(Static383.aClass88_207.method2391(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static383.aClass88_207.method2391(0).length());
		} else if (local11.startsWith(Static117.aClass88_70.method2391(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static117.aClass88_70.method2391(0).length());
		} else if (Static345.anInt6495 != 0) {
			if (local11.startsWith(Static111.aClass88_62.method2391(Static345.anInt6495))) {
				local451 = 1;
				arg0 = arg0.substring(Static111.aClass88_62.method2391(Static345.anInt6495).length());
			} else if (local11.startsWith(Static26.aClass88_13.method2391(Static345.anInt6495))) {
				local451 = 2;
				arg0 = arg0.substring(Static26.aClass88_13.method2391(Static345.anInt6495).length());
			} else if (local11.startsWith(Static160.aClass88_95.method2391(Static345.anInt6495))) {
				local451 = 3;
				arg0 = arg0.substring(Static160.aClass88_95.method2391(Static345.anInt6495).length());
			} else if (local11.startsWith(Static383.aClass88_207.method2391(Static345.anInt6495))) {
				local451 = 4;
				arg0 = arg0.substring(Static383.aClass88_207.method2391(Static345.anInt6495).length());
			} else if (local11.startsWith(Static117.aClass88_70.method2391(Static345.anInt6495))) {
				local451 = 5;
				arg0 = arg0.substring(Static117.aClass88_70.method2391(Static345.anInt6495).length());
			}
		}
		Static332.method5312(Static425.aClass77_72);
		Static383.aClass12_Sub8_Sub2_1.method5214(0);
		@Pc(646) int local646 = Static383.aClass12_Sub8_Sub2_1.anInt6217;
		if (arg1 == 5021) {
			Static383.aClass12_Sub8_Sub2_1.method5214(1);
		} else {
			Static383.aClass12_Sub8_Sub2_1.method5214(0);
		}
		Static383.aClass12_Sub8_Sub2_1.method5214(local13);
		Static383.aClass12_Sub8_Sub2_1.method5214(local451);
		Static306.method4983(arg0, Static383.aClass12_Sub8_Sub2_1);
		Static383.aClass12_Sub8_Sub2_1.method5172(Static383.aClass12_Sub8_Sub2_1.anInt6217 - local646);
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method5018(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray37[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!cl;I)V")
	private static void method5019(@OriginalArg(0) Class12_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray2;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class12_Sub4_Sub6 local12 = Static493.method7338(local8);
		if (local12 == null) {
			return;
		}
		anIntArray422 = new int[local12.anInt3072];
		@Pc(21) int local21 = 0;
		aStringArray35 = new String[local12.anInt3069];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt1509;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt1513;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass198_2 == null ? -1 : arg0.aClass198_2.anInt5739;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt1514;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass198_2 == null ? -1 : arg0.aClass198_2.anInt5705;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass198_1 == null ? -1 : arg0.aClass198_1.anInt5739;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass198_1 == null ? -1 : arg0.aClass198_1.anInt5705;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt1512;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt1508;
				}
				anIntArray422[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString11;
				}
				aStringArray35[local27++] = local135;
			}
		}
		anInt6016 = arg0.anInt1507;
		method5022(local12, arg1);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZ)V")
	private static void method5020(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(691) int local691;
		@Pc(89) int local89;
		@Pc(95) int local95;
		@Pc(1375) boolean local1375;
		@Pc(163) String local163;
		@Pc(81) String local81;
		@Pc(75) String local75;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray421[anInt6008++] = Static177.anInt3997;
				return;
			}
			if (arg0 == 5001) {
				anInt6008 -= 3;
				Static177.anInt3997 = anIntArray421[anInt6008];
				Static492.aClass33_7 = Static242.method4181(anIntArray421[anInt6008 + 1]);
				if (Static492.aClass33_7 == null) {
					Static492.aClass33_7 = Static42.aClass33_1;
				}
				Static17.anInt307 = anIntArray421[anInt6008 + 2];
				Static332.method5312(Static38.aClass77_6);
				Static383.aClass12_Sub8_Sub2_1.method5214(Static177.anInt3997);
				Static383.aClass12_Sub8_Sub2_1.method5214(Static492.aClass33_7.anInt788);
				Static383.aClass12_Sub8_Sub2_1.method5214(Static17.anInt307);
				return;
			}
			if (arg0 == 5002) {
				anInt6013 -= 2;
				local75 = aStringArray36[anInt6013];
				local81 = aStringArray36[anInt6013 + 1];
				anInt6008 -= 2;
				local89 = anIntArray421[anInt6008];
				local95 = anIntArray421[anInt6008 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static332.method5312(Static66.aClass77_15);
				Static383.aClass12_Sub8_Sub2_1.method5214(Static201.method3811(local75) + Static201.method3811(local81) + 2);
				Static383.aClass12_Sub8_Sub2_1.method5180(local75);
				Static383.aClass12_Sub8_Sub2_1.method5214(local89 - 1);
				Static383.aClass12_Sub8_Sub2_1.method5214(local95);
				Static383.aClass12_Sub8_Sub2_1.method5180(local81);
				return;
			}
			@Pc(161) Class227 local161;
			if (arg0 == 5003) {
				local157 = anIntArray421[--anInt6008];
				local161 = Static225.method4072(local157);
				local163 = "";
				if (local161 != null && local161.aString78 != null) {
					local163 = local161.aString78;
				}
				aStringArray36[anInt6013++] = local163;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray421[--anInt6008];
				local161 = Static225.method4072(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt6541;
				}
				anIntArray421[anInt6008++] = local89;
				return;
			}
			if (arg0 == 5005) {
				if (Static492.aClass33_7 == null) {
					anIntArray421[anInt6008++] = -1;
					return;
				}
				anIntArray421[anInt6008++] = Static492.aClass33_7.anInt788;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021) {
				local75 = aStringArray36[--anInt6013];
				method5017(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt6013 -= 2;
				local75 = aStringArray36[anInt6013];
				local81 = aStringArray36[anInt6013 + 1];
				if (Static59.anInt1442 != 0 || (!Static451.aBoolean358 || Static163.aBoolean313) && !Static541.aBoolean683) {
					Static332.method5312(Static523.aClass77_91);
					Static383.aClass12_Sub8_Sub2_1.method5214(0);
					local89 = Static383.aClass12_Sub8_Sub2_1.anInt6217;
					Static383.aClass12_Sub8_Sub2_1.method5180(local75);
					Static306.method4983(local81, Static383.aClass12_Sub8_Sub2_1);
					Static383.aClass12_Sub8_Sub2_1.method5172(Static383.aClass12_Sub8_Sub2_1.anInt6217 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray421[--anInt6008];
				local161 = Static225.method4072(local157);
				local163 = "";
				if (local161 != null && local161.aString77 != null) {
					local163 = local161.aString77;
				}
				aStringArray36[anInt6013++] = local163;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray421[--anInt6008];
				local161 = Static225.method4072(local157);
				local163 = "";
				if (local161 != null && local161.aString76 != null) {
					local163 = local161.aString76;
				}
				aStringArray36[anInt6013++] = local163;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray421[--anInt6008];
				local161 = Static225.method4072(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt6544;
				}
				anIntArray421[anInt6008++] = local89;
				return;
			}
			if (arg0 == 5015) {
				if (Static440.aClass30_Sub1_Sub1_Sub1_2 == null || Static440.aClass30_Sub1_Sub1_Sub1_2.aString7 == null) {
					local75 = Static172.aString92;
				} else {
					local75 = Static440.aClass30_Sub1_Sub1_Sub1_2.method778();
				}
				aStringArray36[anInt6013++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray421[anInt6008++] = Static17.anInt307;
				return;
			}
			if (arg0 == 5017) {
				anIntArray421[anInt6008++] = Static10.method292();
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray421[--anInt6008];
				local161 = Static225.method4072(local157);
				local89 = 0;
				if (local161 != null) {
					local89 = local161.anInt6547;
				}
				anIntArray421[anInt6008++] = local89;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray421[--anInt6008];
				local161 = Static225.method4072(local157);
				local163 = "";
				if (local161 != null && local161.aString75 != null) {
					local163 = local161.aString75;
				}
				aStringArray36[anInt6013++] = local163;
				return;
			}
			if (arg0 == 5020) {
				if (Static440.aClass30_Sub1_Sub1_Sub1_2 == null || Static440.aClass30_Sub1_Sub1_Sub1_2.aString7 == null) {
					local75 = Static172.aString92;
				} else {
					local75 = Static440.aClass30_Sub1_Sub1_Sub1_2.method780();
				}
				aStringArray36[anInt6013++] = local75;
				return;
			}
			if (arg0 == 5023) {
				local157 = anIntArray421[--anInt6008];
				local161 = Static225.method4072(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt6545;
				}
				anIntArray421[anInt6008++] = local89;
				return;
			}
			if (arg0 == 5024) {
				local157 = anIntArray421[--anInt6008];
				local161 = Static225.method4072(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt6543;
				}
				anIntArray421[anInt6008++] = local89;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray421[--anInt6008];
				aStringArray36[anInt6013++] = Static380.aClass49_2.method1435(local157).aString107;
				return;
			}
			@Pc(651) Class12_Sub4_Sub18 local651;
			if (arg0 == 5051) {
				local157 = anIntArray421[--anInt6008];
				local651 = Static380.aClass49_2.method1435(local157);
				if (local651.anIntArray696 == null) {
					anIntArray421[anInt6008++] = 0;
					return;
				}
				anIntArray421[anInt6008++] = local651.anIntArray696.length;
				return;
			}
			if (arg0 == 5052) {
				anInt6008 -= 2;
				local157 = anIntArray421[anInt6008];
				local691 = anIntArray421[anInt6008 + 1];
				@Pc(696) Class12_Sub4_Sub18 local696 = Static380.aClass49_2.method1435(local157);
				local95 = local696.anIntArray696[local691];
				anIntArray421[anInt6008++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray421[--anInt6008];
				local651 = Static380.aClass49_2.method1435(local157);
				if (local651.anIntArray695 == null) {
					anIntArray421[anInt6008++] = 0;
					return;
				}
				anIntArray421[anInt6008++] = local651.anIntArray695.length;
				return;
			}
			if (arg0 == 5054) {
				anInt6008 -= 2;
				local157 = anIntArray421[anInt6008];
				local691 = anIntArray421[anInt6008 + 1];
				anIntArray421[anInt6008++] = Static380.aClass49_2.method1435(local157).anIntArray695[local691];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray421[--anInt6008];
				aStringArray36[anInt6013++] = Static186.aClass122_1.method3365(local157).method6778();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray421[--anInt6008];
				@Pc(822) Class12_Sub4_Sub17 local822 = Static186.aClass122_1.method3365(local157);
				if (local822.anIntArray611 == null) {
					anIntArray421[anInt6008++] = 0;
					return;
				}
				anIntArray421[anInt6008++] = local822.anIntArray611.length;
				return;
			}
			if (arg0 == 5057) {
				anInt6008 -= 2;
				local157 = anIntArray421[anInt6008];
				local691 = anIntArray421[anInt6008 + 1];
				anIntArray421[anInt6008++] = Static186.aClass122_1.method3365(local157).anIntArray611[local691];
				return;
			}
			if (arg0 == 5058) {
				aClass270_1 = new Class270();
				aClass270_1.anInt8103 = anIntArray421[--anInt6008];
				aClass270_1.aClass12_Sub4_Sub17_1 = Static186.aClass122_1.method3365(aClass270_1.anInt8103);
				aClass270_1.anIntArray608 = new int[aClass270_1.aClass12_Sub4_Sub17_1.method6779()];
				return;
			}
			if (arg0 == 5059) {
				Static332.method5312(Static122.aClass77_26);
				Static383.aClass12_Sub8_Sub2_1.method5214(0);
				local157 = Static383.aClass12_Sub8_Sub2_1.anInt6217;
				Static383.aClass12_Sub8_Sub2_1.method5214(0);
				Static383.aClass12_Sub8_Sub2_1.method5190(aClass270_1.anInt8103);
				aClass270_1.aClass12_Sub4_Sub17_1.method6774(Static383.aClass12_Sub8_Sub2_1, aClass270_1.anIntArray608);
				Static383.aClass12_Sub8_Sub2_1.method5172(Static383.aClass12_Sub8_Sub2_1.anInt6217 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray36[--anInt6013];
				Static332.method5312(Static13.aClass77_3);
				Static383.aClass12_Sub8_Sub2_1.method5214(0);
				local691 = Static383.aClass12_Sub8_Sub2_1.anInt6217;
				Static383.aClass12_Sub8_Sub2_1.method5180(local75);
				Static383.aClass12_Sub8_Sub2_1.method5190(aClass270_1.anInt8103);
				aClass270_1.aClass12_Sub4_Sub17_1.method6774(Static383.aClass12_Sub8_Sub2_1, aClass270_1.anIntArray608);
				Static383.aClass12_Sub8_Sub2_1.method5172(Static383.aClass12_Sub8_Sub2_1.anInt6217 - local691);
				return;
			}
			if (arg0 == 5061) {
				Static332.method5312(Static122.aClass77_26);
				Static383.aClass12_Sub8_Sub2_1.method5214(0);
				local157 = Static383.aClass12_Sub8_Sub2_1.anInt6217;
				Static383.aClass12_Sub8_Sub2_1.method5214(1);
				Static383.aClass12_Sub8_Sub2_1.method5190(aClass270_1.anInt8103);
				aClass270_1.aClass12_Sub4_Sub17_1.method6774(Static383.aClass12_Sub8_Sub2_1, aClass270_1.anIntArray608);
				Static383.aClass12_Sub8_Sub2_1.method5172(Static383.aClass12_Sub8_Sub2_1.anInt6217 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt6008 -= 2;
				local157 = anIntArray421[anInt6008];
				local691 = anIntArray421[anInt6008 + 1];
				anIntArray421[anInt6008++] = Static380.aClass49_2.method1435(local157).aCharArray8[local691];
				return;
			}
			if (arg0 == 5063) {
				anInt6008 -= 2;
				local157 = anIntArray421[anInt6008];
				local691 = anIntArray421[anInt6008 + 1];
				anIntArray421[anInt6008++] = Static380.aClass49_2.method1435(local157).aCharArray7[local691];
				return;
			}
			if (arg0 == 5064) {
				anInt6008 -= 2;
				local157 = anIntArray421[anInt6008];
				local691 = anIntArray421[anInt6008 + 1];
				if (local691 == -1) {
					anIntArray421[anInt6008++] = -1;
					return;
				}
				anIntArray421[anInt6008++] = Static380.aClass49_2.method1435(local157).method7965((char) local691);
				return;
			}
			if (arg0 == 5065) {
				anInt6008 -= 2;
				local157 = anIntArray421[anInt6008];
				local691 = anIntArray421[anInt6008 + 1];
				if (local691 == -1) {
					anIntArray421[anInt6008++] = -1;
					return;
				}
				anIntArray421[anInt6008++] = Static380.aClass49_2.method1435(local157).method7962((char) local691);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray421[--anInt6008];
				anIntArray421[anInt6008++] = Static186.aClass122_1.method3365(local157).method6779();
				return;
			}
			if (arg0 == 5067) {
				anInt6008 -= 2;
				local157 = anIntArray421[anInt6008];
				local691 = anIntArray421[anInt6008 + 1];
				local89 = Static186.aClass122_1.method3365(local157).method6773(local691).anInt6500;
				anIntArray421[anInt6008++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt6008 -= 2;
				local157 = anIntArray421[anInt6008];
				local691 = anIntArray421[anInt6008 + 1];
				aClass270_1.anIntArray608[local157] = local691;
				return;
			}
			if (arg0 == 5069) {
				anInt6008 -= 2;
				local157 = anIntArray421[anInt6008];
				local691 = anIntArray421[anInt6008 + 1];
				aClass270_1.anIntArray608[local157] = local691;
				return;
			}
			if (arg0 == 5070) {
				anInt6008 -= 3;
				local157 = anIntArray421[anInt6008];
				local691 = anIntArray421[anInt6008 + 1];
				local89 = anIntArray421[anInt6008 + 2];
				@Pc(1327) Class12_Sub4_Sub17 local1327 = Static186.aClass122_1.method3365(local157);
				if (local1327.method6773(local691).anInt6500 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray421[anInt6008++] = local1327.method6776(local89, local691);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray36[--anInt6013];
				local1375 = anIntArray421[--anInt6008] == 1;
				Static96.method2050(local1375, local75);
				anIntArray421[anInt6008++] = Static292.anInt5650;
				return;
			}
			if (arg0 == 5072) {
				if (Static428.aShortArray105 != null && Static358.anInt6699 < Static292.anInt5650) {
					anIntArray421[anInt6008++] = Static428.aShortArray105[Static358.anInt6699++] & 0xFFFF;
					return;
				}
				anIntArray421[anInt6008++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static358.anInt6699 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static23.aClass5_3.method211(86)) {
					anIntArray421[anInt6008++] = 1;
					return;
				}
				anIntArray421[anInt6008++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static23.aClass5_3.method211(82)) {
					anIntArray421[anInt6008++] = 1;
					return;
				}
				anIntArray421[anInt6008++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static23.aClass5_3.method211(81)) {
					anIntArray421[anInt6008++] = 1;
					return;
				}
				anIntArray421[anInt6008++] = 0;
				return;
			}
		} else {
			@Pc(2712) int local2712;
			@Pc(1986) boolean local1986;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static270.method6580(anIntArray421[--anInt6008]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray421[anInt6008++] = Static161.method4001();
					return;
				}
				if (arg0 == 5205) {
					Static336.method5379(-1, -1, anIntArray421[--anInt6008], false);
					return;
				}
				@Pc(1575) Class12_Sub4_Sub7 local1575;
				if (arg0 == 5206) {
					local157 = anIntArray421[--anInt6008];
					local1575 = Static2.method4937(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1575 == null) {
						anIntArray421[anInt6008++] = -1;
						return;
					}
					anIntArray421[anInt6008++] = local1575.anInt3088;
					return;
				}
				@Pc(1608) Class12_Sub4_Sub7 local1608;
				if (arg0 == 5207) {
					local1608 = Static2.method4933(anIntArray421[--anInt6008]);
					if (local1608 != null && local1608.aString28 != null) {
						aStringArray36[anInt6013++] = local1608.aString28;
						return;
					}
					aStringArray36[anInt6013++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray421[anInt6008++] = Static397.anInt7483;
					anIntArray421[anInt6008++] = Static524.anInt6022;
					return;
				}
				if (arg0 == 5209) {
					anIntArray421[anInt6008++] = Static153.anInt3358 + Static2.anInt5916;
					anIntArray421[anInt6008++] = Static404.anInt7598 + Static2.anInt5914;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray421[--anInt6008];
					local1575 = Static2.method4933(local157);
					if (local1575 == null) {
						anIntArray421[anInt6008++] = 0;
						anIntArray421[anInt6008++] = 0;
						return;
					}
					anIntArray421[anInt6008++] = local1575.anInt3098 >> 14 & 0x3FFF;
					anIntArray421[anInt6008++] = local1575.anInt3098 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray421[--anInt6008];
					local1575 = Static2.method4933(local157);
					if (local1575 == null) {
						anIntArray421[anInt6008++] = 0;
						anIntArray421[anInt6008++] = 0;
						return;
					}
					anIntArray421[anInt6008++] = local1575.anInt3089 - local1575.anInt3091;
					anIntArray421[anInt6008++] = local1575.anInt3092 - local1575.anInt3097;
					return;
				}
				@Pc(1798) Class12_Sub12 local1798;
				if (arg0 == 5212) {
					local1798 = Static492.method6698();
					if (local1798 == null) {
						anIntArray421[anInt6008++] = -1;
						anIntArray421[anInt6008++] = -1;
						return;
					}
					anIntArray421[anInt6008++] = local1798.anInt2333;
					local691 = local1798.anInt2331 << 28 | local1798.anInt2332 + Static2.anInt5916 << 14 | local1798.anInt2334 + Static2.anInt5914;
					anIntArray421[anInt6008++] = local691;
					return;
				}
				if (arg0 == 5213) {
					local1798 = Static336.method5383();
					if (local1798 == null) {
						anIntArray421[anInt6008++] = -1;
						anIntArray421[anInt6008++] = -1;
						return;
					}
					anIntArray421[anInt6008++] = local1798.anInt2333;
					local691 = local1798.anInt2331 << 28 | local1798.anInt2332 + Static2.anInt5916 << 14 | local1798.anInt2334 + Static2.anInt5914;
					anIntArray421[anInt6008++] = local691;
					return;
				}
				@Pc(1946) boolean local1946;
				if (arg0 == 5214) {
					local157 = anIntArray421[--anInt6008];
					local1575 = Static200.method3793();
					if (local1575 != null) {
						local1946 = local1575.method2807(local157 >> 28 & 0x3, local157 >> 14 & 0x3FFF, anIntArray423, local157 & 0x3FFF);
						if (local1946) {
							Static247.method4241(anIntArray423[1], anIntArray423[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt6008 -= 2;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					@Pc(1984) Class280 local1984 = Static2.method4949(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1986 = false;
					for (@Pc(1991) Class12_Sub4_Sub7 local1991 = (Class12_Sub4_Sub7) local1984.method6892(); local1991 != null; local1991 = (Class12_Sub4_Sub7) local1984.method6895()) {
						if (local1991.anInt3088 == local691) {
							local1986 = true;
							break;
						}
					}
					if (local1986) {
						anIntArray421[anInt6008++] = 1;
						return;
					}
					anIntArray421[anInt6008++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray421[--anInt6008];
					local1575 = Static2.method4933(local157);
					if (local1575 == null) {
						anIntArray421[anInt6008++] = -1;
						return;
					}
					anIntArray421[anInt6008++] = local1575.anInt3086;
					return;
				}
				if (arg0 == 5220) {
					anIntArray421[anInt6008++] = Static22.anInt9607 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray421[--anInt6008];
					Static247.method4241(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1608 = Static200.method3793();
					if (local1608 != null) {
						local1375 = local1608.method2808(Static153.anInt3358 + Static2.anInt5916, Static404.anInt7598 + Static2.anInt5914, anIntArray423);
						if (local1375) {
							anIntArray421[anInt6008++] = anIntArray423[1];
							anIntArray421[anInt6008++] = anIntArray423[2];
							return;
						}
						anIntArray421[anInt6008++] = -1;
						anIntArray421[anInt6008++] = -1;
						return;
					}
					anIntArray421[anInt6008++] = -1;
					anIntArray421[anInt6008++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt6008 -= 2;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					Static336.method5379(local691 >> 14 & 0x3FFF, local691 & 0x3FFF, local157, false);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray421[--anInt6008];
					local1575 = Static200.method3793();
					if (local1575 != null) {
						local1946 = local1575.method2807(local157 >> 28 & 0x3, local157 >> 14 & 0x3FFF, anIntArray423, local157 & 0x3FFF);
						if (local1946) {
							anIntArray421[anInt6008++] = anIntArray423[1];
							anIntArray421[anInt6008++] = anIntArray423[2];
							return;
						}
						anIntArray421[anInt6008++] = -1;
						anIntArray421[anInt6008++] = -1;
						return;
					}
					anIntArray421[anInt6008++] = -1;
					anIntArray421[anInt6008++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray421[--anInt6008];
					local1575 = Static200.method3793();
					if (local1575 != null) {
						local1946 = local1575.method2808(local157 >> 14 & 0x3FFF, local157 & 0x3FFF, anIntArray423);
						if (local1946) {
							anIntArray421[anInt6008++] = anIntArray423[1];
							anIntArray421[anInt6008++] = anIntArray423[2];
							return;
						}
						anIntArray421[anInt6008++] = -1;
						anIntArray421[anInt6008++] = -1;
						return;
					}
					anIntArray421[anInt6008++] = -1;
					anIntArray421[anInt6008++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static441.method7842(anIntArray421[--anInt6008]);
					return;
				}
				if (arg0 == 5227) {
					anInt6008 -= 2;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					Static336.method5379(local691 >> 14 & 0x3FFF, local691 & 0x3FFF, local157, true);
					return;
				}
				if (arg0 == 5228) {
					Static245.aBoolean654 = anIntArray421[--anInt6008] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray421[anInt6008++] = Static245.aBoolean654 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray421[--anInt6008];
					Static13.method352(local157);
					return;
				}
				@Pc(2504) Class12 local2504;
				if (arg0 == 5231) {
					anInt6008 -= 2;
					local157 = anIntArray421[anInt6008];
					local1375 = anIntArray421[anInt6008 + 1] == 1;
					if (Static322.aClass68_81 != null) {
						local2504 = Static322.aClass68_81.method1917((long) local157);
						if (local2504 != null && !local1375) {
							local2504.method7967();
							return;
						}
						if (local2504 == null && local1375) {
							local2504 = new Class12();
							Static322.aClass68_81.method1916(local2504, (long) local157);
						}
					}
					return;
				}
				@Pc(2546) Class12 local2546;
				if (arg0 == 5232) {
					local157 = anIntArray421[--anInt6008];
					if (Static322.aClass68_81 != null) {
						local2546 = Static322.aClass68_81.method1917((long) local157);
						anIntArray421[anInt6008++] = local2546 == null ? 0 : 1;
						return;
					}
					anIntArray421[anInt6008++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt6008 -= 2;
					local157 = anIntArray421[anInt6008];
					local1375 = anIntArray421[anInt6008 + 1] == 1;
					if (Static367.aClass68_53 != null) {
						local2504 = Static367.aClass68_53.method1917((long) local157);
						if (local2504 != null && !local1375) {
							local2504.method7967();
							return;
						}
						if (local2504 == null && local1375) {
							local2504 = new Class12();
							Static367.aClass68_53.method1916(local2504, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray421[--anInt6008];
					if (Static367.aClass68_53 != null) {
						local2546 = Static367.aClass68_53.method1917((long) local157);
						anIntArray421[anInt6008++] = local2546 == null ? 0 : 1;
						return;
					}
					anIntArray421[anInt6008++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray421[anInt6008++] = Static2.aClass12_Sub4_Sub7_2 == null ? -1 : Static2.aClass12_Sub4_Sub7_2.anInt3088;
					return;
				}
				if (arg0 == 5236) {
					anInt6008 -= 2;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					local89 = local691 >> 14 & 0x3FFF;
					local95 = local691 & 0x3FFF;
					local2712 = Static66.method1489(local157, local95, local89);
					if (local2712 < 0) {
						anIntArray421[anInt6008++] = -1;
						return;
					}
					anIntArray421[anInt6008++] = local2712;
					return;
				}
				if (arg0 == 5237) {
					Static460.method6599();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt6008 -= 2;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					Static428.method6573(3, false, local691, local157);
					anIntArray421[anInt6008++] = Static241.aFrame25 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static241.aFrame25 != null) {
						Static428.method6573(Static208.aClass12_Sub10_Sub1_1.anInt2225, false, -1, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2796) Class10[] local2796 = Static107.method2240();
					anIntArray421[anInt6008++] = local2796.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray421[--anInt6008];
					@Pc(2820) Class10[] local2820 = Static107.method2240();
					anIntArray421[anInt6008++] = local2820[local157].anInt154;
					anIntArray421[anInt6008++] = local2820[local157].anInt155;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static208.aClass12_Sub10_Sub1_1.anInt2236;
					local691 = Static208.aClass12_Sub10_Sub1_1.anInt2223;
					local89 = -1;
					@Pc(2857) Class10[] local2857 = Static107.method2240();
					for (local2712 = 0; local2712 < local2857.length; local2712++) {
						@Pc(2864) Class10 local2864 = local2857[local2712];
						if (local2864.anInt154 == local157 && local2864.anInt155 == local691) {
							local89 = local2712;
							break;
						}
					}
					anIntArray421[anInt6008++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray421[anInt6008++] = Static256.method4386();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray421[--anInt6008];
					if (local157 >= 1 && local157 <= 2) {
						Static428.method6573(local157, false, -1, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.anInt2225;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray421[--anInt6008];
					if (local157 >= 1 && local157 <= 2) {
						Static208.aClass12_Sub10_Sub1_1.anInt2225 = local157;
						Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt6013 -= 2;
					local75 = aStringArray36[anInt6013];
					local81 = aStringArray36[anInt6013 + 1];
					local89 = anIntArray421[--anInt6008];
					Static332.method5312(Static447.aClass77_75);
					Static383.aClass12_Sub8_Sub2_1.method5214(Static201.method3811(local75) + Static201.method3811(local81) + 1);
					Static383.aClass12_Sub8_Sub2_1.method5180(local75);
					Static383.aClass12_Sub8_Sub2_1.method5180(local81);
					Static383.aClass12_Sub8_Sub2_1.method5214(local89);
					return;
				}
				if (arg0 == 5401) {
					anInt6008 -= 2;
					Static215.aShortArray75[anIntArray421[anInt6008]] = (short) Static277.method4630(anIntArray421[anInt6008 + 1]);
					Static150.aClass254_2.method6348();
					Static150.aClass254_2.method6349();
					Static161.aClass110_3.method3021();
					Static445.method6725();
					return;
				}
				if (arg0 == 5405) {
					anInt6008 -= 2;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					if (local157 >= 0 && local157 < 2) {
						Static431.anIntArrayArrayArray14[local157] = new int[local691 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt6008 -= 7;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1] << 1;
					local89 = anIntArray421[anInt6008 + 2];
					local95 = anIntArray421[anInt6008 + 3];
					local2712 = anIntArray421[anInt6008 + 4];
					@Pc(3132) int local3132 = anIntArray421[anInt6008 + 5];
					@Pc(3138) int local3138 = anIntArray421[anInt6008 + 6];
					if (local157 >= 0 && local157 < 2 && Static431.anIntArrayArrayArray14[local157] != null && local691 >= 0 && local691 < Static431.anIntArrayArrayArray14[local157].length) {
						Static431.anIntArrayArrayArray14[local157][local691] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3138 };
						Static431.anIntArrayArrayArray14[local157][local691 + 1] = new int[] { (local2712 >> 14 & 0x3FFF) << 7, local3132, (local2712 & 0x3FFF) << 7 };
					}
					return;
				}
				if (arg0 == 5407) {
					local157 = Static431.anIntArrayArrayArray14[anIntArray421[--anInt6008]].length >> 1;
					anIntArray421[anInt6008++] = local157;
					return;
				}
				if (arg0 == 5411) {
					if (Static241.aFrame25 != null) {
						Static428.method6573(Static208.aClass12_Sub10_Sub1_1.anInt2225, false, -1, -1);
					}
					if (Static308.aFrame17 != null) {
						Static180.method3559();
						System.exit(0);
						return;
					}
					local75 = Static258.aString54 == null ? Static421.method6532() : Static258.aString54;
					Static465.method6966(Static148.anInt6867 == 1, Static375.aClass71_3, false, local75);
					return;
				}
				if (arg0 == 5419) {
					local75 = "";
					if (Static458.aClass55_8 != null) {
						if (Static458.aClass55_8.anObject5 == null) {
							local75 = Static175.method3489(Static458.aClass55_8.anInt1482);
						} else {
							local75 = (String) Static458.aClass55_8.anObject5;
						}
					}
					aStringArray36[anInt6013++] = local75;
					return;
				}
				if (arg0 == 5420) {
					anIntArray421[anInt6008++] = Static92.anInt2161 == 3 ? 1 : 0;
					return;
				}
				if (arg0 == 5421) {
					if (Static241.aFrame25 != null) {
						Static428.method6573(Static208.aClass12_Sub10_Sub1_1.anInt2225, false, -1, -1);
					}
					local75 = aStringArray36[--anInt6013];
					local1375 = anIntArray421[--anInt6008] == 1;
					local163 = Static421.method6532() + local75;
					Static465.method6966(Static148.anInt6867 == 1, Static375.aClass71_3, local1375, local163);
					return;
				}
				if (arg0 == 5422) {
					anInt6013 -= 2;
					local75 = aStringArray36[anInt6013];
					local81 = aStringArray36[anInt6013 + 1];
					local89 = anIntArray421[--anInt6008];
					if (local75.length() > 0) {
						if (Static394.aStringArray47 == null) {
							Static394.aStringArray47 = new String[Static437.anIntArray605[Static293.aClass138_7.anInt4315]];
						}
						Static394.aStringArray47[local89] = local75;
					}
					if (local81.length() > 0) {
						if (Static372.aStringArray44 == null) {
							Static372.aStringArray44 = new String[Static437.anIntArray605[Static293.aClass138_7.anInt4315]];
						}
						Static372.aStringArray44[local89] = local81;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray36[--anInt6013]);
					return;
				}
				if (arg0 == 5424) {
					anInt6008 -= 11;
					Static186.anInt4263 = anIntArray421[anInt6008];
					Static429.anInt7958 = anIntArray421[anInt6008 + 1];
					Static472.anInt8659 = anIntArray421[anInt6008 + 2];
					Static452.anInt8204 = anIntArray421[anInt6008 + 3];
					Static198.anInt4448 = anIntArray421[anInt6008 + 4];
					Static466.anInt8512 = anIntArray421[anInt6008 + 5];
					Static39.anInt791 = anIntArray421[anInt6008 + 6];
					Static79.anInt1877 = anIntArray421[anInt6008 + 7];
					Static69.anInt9147 = anIntArray421[anInt6008 + 8];
					Static307.anInt5969 = anIntArray421[anInt6008 + 9];
					Static332.anInt6356 = anIntArray421[anInt6008 + 10];
					Static440.aClass16_103.method389(Static198.anInt4448);
					Static440.aClass16_103.method389(Static466.anInt8512);
					Static440.aClass16_103.method389(Static39.anInt791);
					Static440.aClass16_103.method389(Static79.anInt1877);
					Static440.aClass16_103.method389(Static69.anInt9147);
					Static294.aClass84_15 = null;
					Static482.aClass84_23 = null;
					Static406.aClass84_20 = null;
					Static466.aClass84_22 = null;
					Static419.aClass84_21 = null;
					Static294.aClass84_14 = null;
					Static401.aClass84_19 = null;
					Static387.aClass84_18 = null;
					Static386.aBoolean562 = true;
					return;
				}
				if (arg0 == 5425) {
					Static502.method7463();
					Static386.aBoolean562 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt6008 -= 2;
					Static125.anInt2925 = anIntArray421[anInt6008];
					Static252.anInt5200 = anIntArray421[anInt6008 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt6008 -= 2;
					Static258.anInt5238 = anIntArray421[anInt6008 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt6008 -= 2;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					anIntArray421[anInt6008++] = Static444.method6723(local691, local157) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static351.method5495(false, aStringArray36[--anInt6013], false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static549.method683(Static375.aClass71_3.anApplet1, "accountcreated");
						return;
					} catch (@Pc(3667) Throwable local3667) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static549.method683(Static375.aClass71_3.anApplet1, "accountcreatestarted");
						return;
					} catch (@Pc(3679) Throwable local3679) {
						return;
					}
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt6008 -= 4;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					local89 = anIntArray421[anInt6008 + 2];
					local95 = anIntArray421[anInt6008 + 3];
					Static390.method6179(local95, local89, (local157 & 0x3FFF) - Static203.anInt4534, local691, false, (local157 >> 14 & 0x3FFF) - Static61.anInt1459);
					return;
				}
				if (arg0 == 5501) {
					anInt6008 -= 4;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					local89 = anIntArray421[anInt6008 + 2];
					local95 = anIntArray421[anInt6008 + 3];
					Static96.method2063(local89, (local157 & 0x3FFF) - Static203.anInt4534, local95, (local157 >> 14 & 0x3FFF) - Static61.anInt1459, local691);
					return;
				}
				if (arg0 == 5502) {
					anInt6008 -= 6;
					local157 = anIntArray421[anInt6008];
					if (local157 >= 2) {
						throw new RuntimeException();
					}
					Static376.anInt9581 = local157;
					local691 = anIntArray421[anInt6008 + 1];
					if (local691 + 1 >= Static431.anIntArrayArrayArray14[Static376.anInt9581].length >> 1) {
						throw new RuntimeException();
					}
					Static507.anInt9126 = local691;
					Static402.anInt7565 = 0;
					Static406.anInt7657 = anIntArray421[anInt6008 + 2];
					Static79.anInt1880 = anIntArray421[anInt6008 + 3];
					local89 = anIntArray421[anInt6008 + 4];
					if (local89 >= 2) {
						throw new RuntimeException();
					}
					Static166.anInt3847 = local89;
					local95 = anIntArray421[anInt6008 + 5];
					if (local95 + 1 >= Static431.anIntArrayArrayArray14[Static166.anInt3847].length >> 1) {
						throw new RuntimeException();
					}
					Static248.anInt5100 = local95;
					Static242.anInt4993 = 3;
					return;
				}
				if (arg0 == 5503) {
					Static255.method4376();
					return;
				}
				if (arg0 == 5504) {
					anInt6008 -= 2;
					Static154.method3047(anIntArray421[anInt6008], anIntArray421[anInt6008 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray421[anInt6008++] = (int) Static49.aFloat10 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray421[anInt6008++] = (int) Static500.aFloat186 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static8.method259();
					return;
				}
				if (arg0 == 5508) {
					Static363.method5672();
					return;
				}
				if (arg0 == 5509) {
					Static357.method5573();
					return;
				}
				if (arg0 == 5510) {
					Static206.method7969();
					return;
				}
				if (arg0 == 5511) {
					local157 = anIntArray421[--anInt6008];
					local691 = local157 >> 14 & 0x3FFF;
					local89 = local157 & 0x3FFF;
					local691 -= Static61.anInt1459;
					if (local691 < 0) {
						local691 = 0;
					} else if (local691 >= Static37.anInt7512) {
						local691 = Static37.anInt7512;
					}
					local89 -= Static203.anInt4534;
					if (local89 < 0) {
						local89 = 0;
					} else if (local89 >= Static329.anInt6247) {
						local89 = Static329.anInt6247;
					}
					Static247.anInt5092 = (local691 << 7) + 64;
					Static357.anInt6674 = (local89 << 7) + 64;
					Static242.anInt4993 = 4;
					return;
				}
				if (arg0 == 5512) {
					Static479.method7191();
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt6013 -= 2;
					local75 = aStringArray36[anInt6013];
					local81 = aStringArray36[anInt6013 + 1];
					local89 = anIntArray421[--anInt6008];
					if (Static96.anInt2243 != 2) {
						return;
					}
					if (Static145.anInt3193 == 0 && Static175.anInt3980 == 0) {
						Static172.aString92 = local75;
						Static262.aString56 = local81;
						Static122.anInt2825 = local89;
						Static9.method278(5);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static407.method6377();
					return;
				}
				if (arg0 == 5602) {
					if (Static145.anInt3193 == 0) {
						Static393.anInt7424 = -2;
						Static440.anInt8079 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt6008 -= 4;
					if (Static96.anInt2243 != 2) {
						return;
					}
					if (Static145.anInt3193 == 0 && Static175.anInt3980 == 0) {
						Static98.method2076(anIntArray421[anInt6008 + 3], anIntArray421[anInt6008], anIntArray421[anInt6008 + 2], anIntArray421[anInt6008 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt6013--;
					if (Static96.anInt2243 != 2) {
						return;
					}
					if (Static145.anInt3193 == 0 && Static175.anInt3980 == 0) {
						Static294.method4769(Static178.method3535(aStringArray36[anInt6013]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt6013 -= 2;
					if (Static96.anInt2243 != 2) {
						return;
					}
					if (Static145.anInt3193 == 0 && Static175.anInt3980 == 0) {
						Static71.method1601(Static178.method3535(aStringArray36[anInt6013]), false, aStringArray36[anInt6013 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static175.anInt3980 == 0) {
						Static194.anInt4316 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray421[anInt6008++] = Static440.anInt8079;
					return;
				}
				if (arg0 == 5608) {
					anIntArray421[anInt6008++] = Static435.anInt8019;
					return;
				}
				if (arg0 == 5609) {
					anIntArray421[anInt6008++] = Static194.anInt4316;
					return;
				}
				if (arg0 == 5610) {
					for (local157 = 0; local157 < 5; local157++) {
						aStringArray36[anInt6013++] = Static495.aStringArray59.length > local157 ? Static3.method193(Static495.aStringArray59[local157]) : "";
					}
					Static495.aStringArray59 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray421[anInt6008++] = Static253.anInt5215;
					return;
				}
				if (arg0 == 5612) {
					local157 = anIntArray421[--anInt6008];
					if (Static96.anInt2243 != 6) {
						return;
					}
					if (Static145.anInt3193 == 0 && Static175.anInt3980 == 0) {
						if (Static491.aClass277_2 != null) {
							Static491.aClass277_2.method7170();
							Static491.aClass277_2 = null;
						}
						Static122.anInt2825 = local157;
						Static9.method278(8);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray421[anInt6008++] = Static440.anInt8079;
					return;
				}
				if (arg0 == 5615) {
					anInt6013 -= 2;
					local75 = aStringArray36[anInt6013];
					local81 = aStringArray36[anInt6013 + 1];
					if (Static96.anInt2243 != 2) {
						return;
					}
					if (Static145.anInt3193 == 0 && Static175.anInt3980 == 0) {
						if (Static491.aClass277_2 != null) {
							Static491.aClass277_2.method7170();
							Static491.aClass277_2 = null;
						}
						Static172.aString92 = local75;
						Static262.aString56 = local81;
						Static9.method278(4);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static10.method291(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray421[anInt6008++] = Static393.anInt7424;
					return;
				}
				if (arg0 == 5618) {
					local157 = anIntArray421[--anInt6008];
					Static259.method4399(false, local157);
					return;
				}
				if (arg0 == 5619) {
					local157 = anIntArray421[--anInt6008];
					Static259.method4399(true, local157);
					return;
				}
				if (arg0 == 5620) {
					Static440.method6678();
					if (Static63.aString91 != "" && Static63.aString91 != "") {
						anIntArray421[anInt6008++] = 1;
						return;
					}
					anIntArray421[anInt6008++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt6013 -= 2;
					if (Static96.anInt2243 != 2) {
						return;
					}
					if (Static145.anInt3193 == 0 && Static175.anInt3980 == 0) {
						Static71.method1601(Static178.method3535(aStringArray36[anInt6013]), true, aStringArray36[anInt6013 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4469) Class55 local4469 = Static375.aClass71_3.method1980("3", false);
					while (local4469.anInt1481 == 0) {
						Static17.method388(1L);
					}
					if (local4469.anInt1481 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4489) Class308 local4489 = (Class308) local4469.anObject5;
					if (local4489.method7738().exists()) {
						@Pc(4499) Class12_Sub8 local4499 = new Class12_Sub8(50);
						try {
							local4489.method7736(50, local4499.aByteArray82, 0);
						} catch (@Pc(4508) IOException local4508) {
						}
					}
					try {
						local4489.method7739();
						return;
					} catch (@Pc(4514) Exception local4514) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static258.aString53 != null) {
						anIntArray421[anInt6008++] = 1;
						return;
					}
					anIntArray421[anInt6008++] = 0;
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local157 = anIntArray421[--anInt6008];
					if (local157 < 1) {
						local157 = 1;
					}
					if (local157 > 4) {
						local157 = 4;
					}
					Static208.aClass12_Sub10_Sub1_1.anInt2219 = local157;
					Static345.method5434();
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6002) {
					Static208.aClass12_Sub10_Sub1_1.method2045(anIntArray421[--anInt6008] == 1);
					Static345.method5434();
					Static82.method1828();
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6003) {
					Static208.aClass12_Sub10_Sub1_1.aBoolean173 = anIntArray421[--anInt6008] == 1;
					Static82.method1828();
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6005) {
					Static208.aClass12_Sub10_Sub1_1.aBoolean183 = anIntArray421[--anInt6008] == 1;
					Static345.method5434();
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6006) {
					Static208.aClass12_Sub10_Sub1_1.aBoolean187 = anIntArray421[--anInt6008] == 1;
					Static243.aClass42_4.method5863(!Static208.aClass12_Sub10_Sub1_1.aBoolean187);
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6007) {
					Static208.aClass12_Sub10_Sub1_1.anInt2218 = anIntArray421[--anInt6008];
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6008) {
					Static208.aClass12_Sub10_Sub1_1.aBoolean179 = anIntArray421[--anInt6008] == 1;
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6009) {
					Static208.aClass12_Sub10_Sub1_1.aBoolean188 = anIntArray421[--anInt6008] == 1;
					Static345.method5434();
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6010) {
					Static208.aClass12_Sub10_Sub1_1.aBoolean182 = anIntArray421[--anInt6008] == 1;
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6011) {
					local157 = anIntArray421[--anInt6008];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static208.aClass12_Sub10_Sub1_1.method2042(Static148.anInt6867, local157);
					Static345.method5434();
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6012) {
					Static208.aClass12_Sub10_Sub1_1.method2044(anIntArray421[--anInt6008] == 1, Static148.anInt6867);
					Static261.method4418();
					Static299.method4822();
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6014) {
					Static208.aClass12_Sub10_Sub1_1.aBoolean178 = anIntArray421[--anInt6008] == 1;
					Static345.method5434();
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6015) {
					Static208.aClass12_Sub10_Sub1_1.aBoolean174 = anIntArray421[--anInt6008] == 1;
					Static345.method5434();
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6016) {
					local157 = anIntArray421[--anInt6008];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static208.aClass12_Sub10_Sub1_1.anInt2226 = local157;
					Static201.method3814(Static148.anInt6867);
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					return;
				}
				if (arg0 == 6017) {
					Static208.aClass12_Sub10_Sub1_1.aBoolean181 = anIntArray421[--anInt6008] == 1;
					Static395.method6209();
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6018) {
					local157 = anIntArray421[--anInt6008];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static208.aClass12_Sub10_Sub1_1.anInt2232 = local157;
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6019) {
					local157 = anIntArray421[--anInt6008];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 255) {
						local157 = 255;
					}
					if (local157 != Static208.aClass12_Sub10_Sub1_1.anInt2227) {
						if (Static208.aClass12_Sub10_Sub1_1.anInt2227 == 0 && Static471.anInt8643 != -1) {
							Static535.method7885(Static471.anInt8643, local157, Static250.aClass16_67);
							Static542.aBoolean685 = false;
						} else if (local157 == 0) {
							Static208.method3861();
							Static542.aBoolean685 = false;
						} else {
							Static456.method6872(local157);
						}
						Static208.aClass12_Sub10_Sub1_1.anInt2227 = local157;
					}
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6020) {
					local157 = anIntArray421[--anInt6008];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static208.aClass12_Sub10_Sub1_1.anInt2222 = local157;
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6021) {
					Static208.aClass12_Sub10_Sub1_1.lb = anIntArray421[--anInt6008] == 1;
					Static82.method1828();
					return;
				}
				if (arg0 == 6023) {
					local157 = anIntArray421[--anInt6008];
					local1375 = false;
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 2) {
						local157 = 2;
					}
					if (Static458.anInt8335 < 96) {
						local157 = 0;
						local1375 = true;
					}
					Static378.method6005(local157);
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					anIntArray421[anInt6008++] = local1375 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local157 = anIntArray421[--anInt6008];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static208.aClass12_Sub10_Sub1_1.anInt2229 = local157;
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					return;
				}
				if (arg0 == 6025) {
					local157 = anIntArray421[--anInt6008];
					if (local157 < 0 || local157 > Static305.method4965(Static458.anInt8335)) {
						local157 = 0;
					}
					Static208.aClass12_Sub10_Sub1_1.anInt2235 = local157;
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6027) {
					local157 = anIntArray421[--anInt6008];
					if (local157 < 0 || local157 > 1) {
						local157 = 0;
					}
					Static218.method4005(local157 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static208.aClass12_Sub10_Sub1_1.aBoolean172 = anIntArray421[--anInt6008] != 0;
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					return;
				}
				if (arg0 == 6029) {
					Static208.aClass12_Sub10_Sub1_1.anInt2218 = anIntArray421[--anInt6008];
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					return;
				}
				if (arg0 == 6030) {
					Static208.aClass12_Sub10_Sub1_1.aBoolean186 = anIntArray421[--anInt6008] != 0;
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static345.method5434();
					return;
				}
				if (arg0 == 6031) {
					local157 = anIntArray421[--anInt6008];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static201.method3814(local157);
					return;
				}
				if (arg0 == 6032) {
					local157 = anIntArray421[--anInt6008];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static208.aClass12_Sub10_Sub1_1.anInt2230 = local157;
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6033) {
					local157 = anIntArray421[--anInt6008];
					if (local157 < 0 || local157 > 4) {
						local157 = 2;
					}
					Static208.aClass12_Sub10_Sub1_1.anInt2233 = local157;
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					return;
				}
				if (arg0 == 6034) {
					Static208.aClass12_Sub10_Sub1_1.aBoolean180 = anIntArray421[--anInt6008] == 1;
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					Static261.method4418();
					Static14.aBoolean9 = false;
					return;
				}
				if (arg0 == 6035) {
					Static208.aClass12_Sub10_Sub1_1.aBoolean191 = anIntArray421[--anInt6008] == 1;
					Static345.method5434();
					Static82.method1828();
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.anInt2219;
					return;
				}
				if (arg0 == 6102) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.method2059(Static148.anInt6867) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.aBoolean173 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.aBoolean183 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.aBoolean187 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.anInt2218;
					return;
				}
				if (arg0 == 6108) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.aBoolean179 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.aBoolean188 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.aBoolean182 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.method2043(Static148.anInt6867);
					return;
				}
				if (arg0 == 6112) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.method2038(Static148.anInt6867) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.aBoolean178 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.aBoolean174 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.anInt2226;
					return;
				}
				if (arg0 == 6117) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.aBoolean181 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.anInt2232;
					return;
				}
				if (arg0 == 6119) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.anInt2227;
					return;
				}
				if (arg0 == 6120) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.anInt2222;
					return;
				}
				if (arg0 == 6121) {
					anIntArray421[anInt6008++] = Static243.aClass42_4.method5833() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray421[anInt6008++] = Static395.method6206();
					return;
				}
				if (arg0 == 6124) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.anInt2229;
					return;
				}
				if (arg0 == 6125) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.anInt2235;
					return;
				}
				if (arg0 == 6126) {
					anIntArray421[anInt6008++] = Static243.aClass42_4.method5830() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.aBoolean177 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.aBoolean172 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.anInt2218;
					return;
				}
				if (arg0 == 6130) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.aBoolean186 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray421[anInt6008++] = Static148.anInt6867;
					return;
				}
				if (arg0 == 6132) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.anInt2230;
					return;
				}
				if (arg0 == 6133) {
					anIntArray421[anInt6008++] = Static92.anInt2161 == 1 || Static92.anInt2161 == 4 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray421[anInt6008++] = Static305.method4965(Static458.anInt8335);
					return;
				}
				if (arg0 == 6135) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.anInt2233;
					return;
				}
				if (arg0 == 6136) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.aBoolean180 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(5927) boolean local5927 = true;
					try {
						local5927 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(5937) Throwable local5937) {
					}
					anIntArray421[anInt6008++] = local5927 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt6008 -= 2;
					Static467.aShort101 = (short) anIntArray421[anInt6008];
					if (Static467.aShort101 <= 0) {
						Static467.aShort101 = 256;
					}
					Static371.aShort88 = (short) anIntArray421[anInt6008 + 1];
					if (Static371.aShort88 <= 0) {
						Static371.aShort88 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt6008 -= 2;
					Static261.aShort69 = (short) anIntArray421[anInt6008];
					if (Static261.aShort69 <= 0) {
						Static261.aShort69 = 256;
					}
					Static337.aShort87 = (short) anIntArray421[anInt6008 + 1];
					if (Static337.aShort87 <= 0) {
						Static337.aShort87 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt6008 -= 4;
					Static497.aShort111 = (short) anIntArray421[anInt6008];
					if (Static497.aShort111 <= 0) {
						Static497.aShort111 = 1;
					}
					Static337.aShort86 = (short) anIntArray421[anInt6008 + 1];
					if (Static337.aShort86 <= 0) {
						Static337.aShort86 = 32767;
					} else if (Static337.aShort86 < Static497.aShort111) {
						Static337.aShort86 = Static497.aShort111;
					}
					Static56.aShort33 = (short) anIntArray421[anInt6008 + 2];
					if (Static56.aShort33 <= 0) {
						Static56.aShort33 = 1;
					}
					Static169.aShort56 = (short) anIntArray421[anInt6008 + 3];
					if (Static169.aShort56 <= 0) {
						Static169.aShort56 = 32767;
						return;
					}
					if (Static169.aShort56 < Static56.aShort33) {
						Static169.aShort56 = Static56.aShort33;
					}
					return;
				}
				if (arg0 == 6203) {
					Static490.method7296(0, Static522.aClass198_16.anInt5762, Static522.aClass198_16.anInt5715, 0, false);
					anIntArray421[anInt6008++] = Static354.anInt6608;
					anIntArray421[anInt6008++] = Static106.anInt2440;
					return;
				}
				if (arg0 == 6204) {
					anIntArray421[anInt6008++] = Static261.aShort69;
					anIntArray421[anInt6008++] = Static337.aShort87;
					return;
				}
				if (arg0 == 6205) {
					anIntArray421[anInt6008++] = Static467.aShort101;
					anIntArray421[anInt6008++] = Static371.aShort88;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray421[anInt6008++] = (int) (Static76.method1679() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray421[anInt6008++] = (int) (Static76.method1679() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt6008 -= 3;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					local89 = anIntArray421[anInt6008 + 2];
					aCalendar2.clear();
					aCalendar2.set(11, 12);
					aCalendar2.set(local89, local691, local157);
					local95 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
					if (local89 < 1970) {
						local95--;
					}
					anIntArray421[anInt6008++] = local95;
					return;
				}
				if (arg0 == 6303) {
					aCalendar2.clear();
					aCalendar2.setTime(new Date(Static76.method1679()));
					anIntArray421[anInt6008++] = aCalendar2.get(1);
					return;
				}
				if (arg0 == 6304) {
					local157 = anIntArray421[--anInt6008];
					local1375 = true;
					if (local157 < 0) {
						local1375 = (local157 + 1) % 4 == 0;
					} else if (local157 < 1582) {
						local1375 = local157 % 4 == 0;
					} else if (local157 % 4 != 0) {
						local1375 = false;
					} else if (local157 % 100 != 0) {
						local1375 = true;
					} else if (local157 % 400 != 0) {
						local1375 = false;
					}
					anIntArray421[anInt6008++] = local1375 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray421[anInt6008++] = Static387.method6121() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray421[anInt6008++] = Static455.method7165() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static96.anInt2243 == 6 && Static145.anInt3193 == 0 && Static175.anInt3980 == 0) {
						if (Static314.aBoolean457) {
							anIntArray421[anInt6008++] = 0;
							return;
						}
						if (Static146.aLong92 > Static76.method1679() - 1000L) {
							anIntArray421[anInt6008++] = 1;
							return;
						}
						Static314.aBoolean457 = true;
						Static332.method5312(Static90.aClass77_20);
						Static383.aClass12_Sub8_Sub2_1.method5223(Static204.anInt4549);
						anIntArray421[anInt6008++] = 0;
						return;
					}
					anIntArray421[anInt6008++] = 1;
					return;
				}
				@Pc(6470) Class194 local6470;
				@Pc(6437) Class23_Sub1 local6437;
				if (arg0 == 6501) {
					local6437 = Static196.method3705();
					if (local6437 != null) {
						anIntArray421[anInt6008++] = local6437.anInt5198;
						anIntArray421[anInt6008++] = local6437.anInt5192;
						aStringArray36[anInt6013++] = local6437.aString51;
						local6470 = local6437.method4355();
						anIntArray421[anInt6008++] = local6470.anInt5565;
						aStringArray36[anInt6013++] = local6470.aString60;
						anIntArray421[anInt6008++] = local6437.anInt5189;
						anIntArray421[anInt6008++] = local6437.anInt5199;
						aStringArray36[anInt6013++] = local6437.aString52;
						return;
					}
					anIntArray421[anInt6008++] = -1;
					anIntArray421[anInt6008++] = 0;
					aStringArray36[anInt6013++] = "";
					anIntArray421[anInt6008++] = 0;
					aStringArray36[anInt6013++] = "";
					anIntArray421[anInt6008++] = 0;
					anIntArray421[anInt6008++] = 0;
					aStringArray36[anInt6013++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6437 = Static409.method6397();
					if (local6437 != null) {
						anIntArray421[anInt6008++] = local6437.anInt5198;
						anIntArray421[anInt6008++] = local6437.anInt5192;
						aStringArray36[anInt6013++] = local6437.aString51;
						local6470 = local6437.method4355();
						anIntArray421[anInt6008++] = local6470.anInt5565;
						aStringArray36[anInt6013++] = local6470.aString60;
						anIntArray421[anInt6008++] = local6437.anInt5189;
						anIntArray421[anInt6008++] = local6437.anInt5199;
						aStringArray36[anInt6013++] = local6437.aString52;
						return;
					}
					anIntArray421[anInt6008++] = -1;
					anIntArray421[anInt6008++] = 0;
					aStringArray36[anInt6013++] = "";
					anIntArray421[anInt6008++] = 0;
					aStringArray36[anInt6013++] = "";
					anIntArray421[anInt6008++] = 0;
					anIntArray421[anInt6008++] = 0;
					aStringArray36[anInt6013++] = "";
					return;
				}
				if (arg0 == 6503) {
					local157 = anIntArray421[--anInt6008];
					local81 = aStringArray36[--anInt6013];
					if (Static96.anInt2243 == 6 && Static145.anInt3193 == 0 && Static175.anInt3980 == 0) {
						anIntArray421[anInt6008++] = Static389.method6144(local157, local81) ? 1 : 0;
						return;
					}
					anIntArray421[anInt6008++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static208.aClass12_Sub10_Sub1_1.anInt2238 = anIntArray421[--anInt6008];
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					return;
				}
				if (arg0 == 6505) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.anInt2238;
					return;
				}
				if (arg0 == 6506) {
					local157 = anIntArray421[--anInt6008];
					@Pc(6827) Class23_Sub1 local6827 = Static212.method4973(local157);
					if (local6827 != null) {
						anIntArray421[anInt6008++] = local6827.anInt5192;
						aStringArray36[anInt6013++] = local6827.aString51;
						@Pc(6851) Class194 local6851 = local6827.method4355();
						anIntArray421[anInt6008++] = local6851.anInt5565;
						aStringArray36[anInt6013++] = local6851.aString60;
						anIntArray421[anInt6008++] = local6827.anInt5189;
						anIntArray421[anInt6008++] = local6827.anInt5199;
						aStringArray36[anInt6013++] = local6827.aString52;
						return;
					}
					anIntArray421[anInt6008++] = -1;
					aStringArray36[anInt6013++] = "";
					anIntArray421[anInt6008++] = 0;
					aStringArray36[anInt6013++] = "";
					anIntArray421[anInt6008++] = 0;
					anIntArray421[anInt6008++] = 0;
					aStringArray36[anInt6013++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt6008 -= 4;
					local157 = anIntArray421[anInt6008];
					local1375 = anIntArray421[anInt6008 + 1] == 1;
					local89 = anIntArray421[anInt6008 + 2];
					local1986 = anIntArray421[anInt6008 + 3] == 1;
					Static486.method7265(local1986, local157, local1375, local89);
					return;
				}
				if (arg0 == 6508) {
					Static343.method2524();
					return;
				}
				if (arg0 == 6509) {
					if (Static96.anInt2243 != 6) {
						return;
					}
					Static211.aBoolean370 = anIntArray421[--anInt6008] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray421[anInt6008++] = Static66.anInt1516;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static208.aClass12_Sub10_Sub1_1.aBoolean184 = anIntArray421[--anInt6008] == 1;
					Static208.aClass12_Sub10_Sub1_1.method2056(Static375.aClass71_3);
					return;
				}
				if (arg0 == 6601) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.aBoolean184 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static345.aClass269_4 == Static81.aClass269_1) {
				if (arg0 == 6700) {
					local157 = Static456.aClass68_67.method1925();
					if (Static406.anInt7660 != -1) {
						local157++;
					}
					anIntArray421[anInt6008++] = local157;
					return;
				}
				if (arg0 == 6701) {
					local157 = anIntArray421[--anInt6008];
					if (Static406.anInt7660 != -1) {
						if (local157 == 0) {
							anIntArray421[anInt6008++] = Static406.anInt7660;
							return;
						}
						local157--;
					}
					@Pc(7138) Class12_Sub34 local7138 = (Class12_Sub34) Static456.aClass68_67.method1923();
					while (local157-- > 0) {
						local7138 = (Class12_Sub34) Static456.aClass68_67.method1920();
					}
					anIntArray421[anInt6008++] = local7138.anInt5831;
					return;
				}
				if (arg0 == 6702) {
					local157 = anIntArray421[--anInt6008];
					if (Static71.aClass198ArrayArray1[local157] == null) {
						aStringArray36[anInt6013++] = "";
						return;
					}
					local81 = Static71.aClass198ArrayArray1[local157][0].aString68;
					if (local81 == null) {
						aStringArray36[anInt6013++] = "";
						return;
					}
					aStringArray36[anInt6013++] = local81.substring(0, local81.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local157 = anIntArray421[--anInt6008];
					if (Static71.aClass198ArrayArray1[local157] == null) {
						anIntArray421[anInt6008++] = 0;
						return;
					}
					anIntArray421[anInt6008++] = Static71.aClass198ArrayArray1[local157].length;
					return;
				}
				if (arg0 == 6704) {
					anInt6008 -= 2;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					if (Static71.aClass198ArrayArray1[local157] == null) {
						aStringArray36[anInt6013++] = "";
						return;
					}
					local163 = Static71.aClass198ArrayArray1[local157][local691].aString68;
					if (local163 == null) {
						aStringArray36[anInt6013++] = "";
						return;
					}
					aStringArray36[anInt6013++] = local163;
					return;
				}
				if (arg0 == 6705) {
					anInt6008 -= 2;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					if (Static71.aClass198ArrayArray1[local157] == null) {
						anIntArray421[anInt6008++] = 0;
						return;
					}
					anIntArray421[anInt6008++] = Static71.aClass198ArrayArray1[local157][local691].anInt5751;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt6008 -= 3;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					local89 = anIntArray421[anInt6008 + 2];
					Static532.method7874(local89, "", local157 << 16 | local691, 1);
					return;
				}
				if (arg0 == 6708) {
					anInt6008 -= 3;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					local89 = anIntArray421[anInt6008 + 2];
					Static532.method7874(local89, "", local157 << 16 | local691, 2);
					return;
				}
				if (arg0 == 6709) {
					anInt6008 -= 3;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					local89 = anIntArray421[anInt6008 + 2];
					Static532.method7874(local89, "", local157 << 16 | local691, 3);
					return;
				}
				if (arg0 == 6710) {
					anInt6008 -= 3;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					local89 = anIntArray421[anInt6008 + 2];
					Static532.method7874(local89, "", local157 << 16 | local691, 4);
					return;
				}
				if (arg0 == 6711) {
					anInt6008 -= 3;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					local89 = anIntArray421[anInt6008 + 2];
					Static532.method7874(local89, "", local157 << 16 | local691, 5);
					return;
				}
				if (arg0 == 6712) {
					anInt6008 -= 3;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					local89 = anIntArray421[anInt6008 + 2];
					Static532.method7874(local89, "", local157 << 16 | local691, 6);
					return;
				}
				if (arg0 == 6713) {
					anInt6008 -= 3;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					local89 = anIntArray421[anInt6008 + 2];
					Static532.method7874(local89, "", local157 << 16 | local691, 7);
					return;
				}
				if (arg0 == 6714) {
					anInt6008 -= 3;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					local89 = anIntArray421[anInt6008 + 2];
					Static532.method7874(local89, "", local157 << 16 | local691, 8);
					return;
				}
				if (arg0 == 6715) {
					anInt6008 -= 3;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					local89 = anIntArray421[anInt6008 + 2];
					Static532.method7874(local89, "", local157 << 16 | local691, 9);
					return;
				}
				if (arg0 == 6716) {
					anInt6008 -= 3;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					local89 = anIntArray421[anInt6008 + 2];
					Static532.method7874(local89, "", local157 << 16 | local691, 10);
					return;
				}
				if (arg0 == 6717) {
					anInt6008 -= 3;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					local89 = anIntArray421[anInt6008 + 2];
					@Pc(7726) Class198 local7726 = Static428.method6579(local157 << 16 | local691, local89);
					Static227.method4101();
					@Pc(7731) Class12_Sub42 local7731 = Static67.method1529(local7726);
					Static274.method4603(local7726, local7731.anInt6906, local7731.method5780());
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(7759) Class152 local7759;
				if (arg0 == 6800) {
					local157 = anIntArray421[--anInt6008];
					local7759 = Static293.aClass93_8.method2480(local157);
					if (local7759.aString44 == null) {
						aStringArray36[anInt6013++] = "";
						return;
					}
					aStringArray36[anInt6013++] = local7759.aString44;
					return;
				}
				if (arg0 == 6801) {
					local157 = anIntArray421[--anInt6008];
					local7759 = Static293.aClass93_8.method2480(local157);
					anIntArray421[anInt6008++] = local7759.anInt4736;
					return;
				}
				if (arg0 == 6802) {
					local157 = anIntArray421[--anInt6008];
					local7759 = Static293.aClass93_8.method2480(local157);
					anIntArray421[anInt6008++] = local7759.anInt4756;
					return;
				}
				if (arg0 == 6803) {
					local157 = anIntArray421[--anInt6008];
					local7759 = Static293.aClass93_8.method2480(local157);
					anIntArray421[anInt6008++] = local7759.anInt4724;
					return;
				}
				if (arg0 == 6804) {
					anInt6008 -= 2;
					local157 = anIntArray421[anInt6008];
					local691 = anIntArray421[anInt6008 + 1];
					@Pc(7881) Class213 local7881 = Static453.aClass258_2.method6426(local691);
					if (local7881.method5078()) {
						aStringArray36[anInt6013++] = Static293.aClass93_8.method2480(local157).method4021(local7881.aString71, local691);
						return;
					}
					anIntArray421[anInt6008++] = Static293.aClass93_8.method2480(local157).method4022(local691, local7881.anInt6063);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray421[anInt6008++] = Static451.aBoolean358 && !Static163.aBoolean313 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray421[anInt6008++] = Static465.anInt8477;
					return;
				}
				if (arg0 == 6902) {
					anIntArray421[anInt6008++] = Static361.anInt6737;
					return;
				}
				if (arg0 == 6903) {
					anIntArray421[anInt6008++] = Static275.anInt5454;
					return;
				}
				if (arg0 == 6904) {
					anIntArray421[anInt6008++] = Static485.anInt8828;
					return;
				}
				if (arg0 == 6905) {
					local75 = "";
					if (Static458.aClass55_8 != null) {
						if (Static458.aClass55_8.anObject5 == null) {
							local75 = Static175.method3489(Static458.aClass55_8.anInt1482);
						} else {
							local75 = (String) Static458.aClass55_8.anObject5;
						}
					}
					aStringArray36[anInt6013++] = local75;
					return;
				}
				if (arg0 == 6906) {
					anIntArray421[anInt6008++] = Static17.anInt306;
					return;
				}
				if (arg0 == 6907) {
					anIntArray421[anInt6008++] = Static72.anInt1747;
					return;
				}
				if (arg0 == 6908) {
					anIntArray421[anInt6008++] = Static13.anInt227;
					return;
				}
				if (arg0 == 6909) {
					anIntArray421[anInt6008++] = Static315.aBoolean468 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray421[anInt6008++] = Static290.anInt5634;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local157 = Static208.aClass12_Sub10_Sub1_1.method2058();
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.anInt2260 = Static148.anInt6867;
					anIntArray421[anInt6008++] = local157;
					Static345.method5434();
					return;
				}
				if (arg0 == 7001) {
					Static208.aClass12_Sub10_Sub1_1.method2051();
					Static345.method5434();
					return;
				}
				if (arg0 == 7002) {
					Static208.aClass12_Sub10_Sub1_1.method2053();
					Static345.method5434();
					return;
				}
				if (arg0 == 7003) {
					Static208.aClass12_Sub10_Sub1_1.method2054();
					Static345.method5434();
					return;
				}
				if (arg0 == 7004) {
					Static208.aClass12_Sub10_Sub1_1.method2060();
					Static345.method5434();
					return;
				}
				if (arg0 == 7005) {
					Static208.aClass12_Sub10_Sub1_1.anInt2224 = 0;
					return;
				}
				if (arg0 == 7006) {
					if (Static208.aClass12_Sub10_Sub1_1.anInt2260 == 2) {
						Static208.aClass12_Sub10_Sub1_1.aBoolean192 = true;
						return;
					}
					if (Static208.aClass12_Sub10_Sub1_1.anInt2260 == 1) {
						Static208.aClass12_Sub10_Sub1_1.aBoolean190 = true;
						return;
					}
					if (Static208.aClass12_Sub10_Sub1_1.anInt2260 == 3) {
						Static208.aClass12_Sub10_Sub1_1.aBoolean193 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray421[anInt6008++] = Static208.aClass12_Sub10_Sub1_1.anInt2224;
					return;
				}
				if (arg0 == 7008) {
					if (Static148.anInt6867 == 0 && Static458.anInt8335 < 96) {
						anIntArray421[anInt6008++] = 2;
						return;
					}
					anIntArray421[anInt6008++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!fca;II)V")
	public static void method5021(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class12_Sub4_Sub6 local5 = Static130.method2728(arg1, arg0, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray422 = new int[local5.anInt3072];
		aStringArray35 = new String[local5.anInt3069];
		if (local5.aClass98_2 == Static193.aClass98_3 || local5.aClass98_2 == Static270.aClass98_11 || local5.aClass98_2 == Static387.aClass98_9) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static86.aClass198_3 != null) {
				local30 = Static86.aClass198_3.anInt5713;
				local32 = Static86.aClass198_3.anInt5741;
			}
			anIntArray422[0] = Static527.aClass6_1.method3754() - local30;
			anIntArray422[1] = Static527.aClass6_1.method3757() - local32;
		}
		method5022(local5, 200000);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!fh;I)V")
	private static void method5022(@OriginalArg(0) Class12_Sub4_Sub6 arg0, @OriginalArg(1) int arg1) {
		anInt6008 = 0;
		anInt6013 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray230;
		@Pc(11) int[] local11 = arg0.anIntArray229;
		@Pc(13) byte local13 = -1;
		anInt6009 = 0;
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
						method5028(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method5020(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray421[anInt6008++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray421[anInt6008++] = Static393.aClass31_1.anIntArray117[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static393.aClass31_1.method793(local54, anIntArray421[--anInt6008]);
					} else if (local31 == 3) {
						aStringArray36[anInt6013++] = arg0.aStringArray17[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt6008 -= 2;
						if (anIntArray421[anInt6008] != anIntArray421[anInt6008 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt6008 -= 2;
						if (anIntArray421[anInt6008] == anIntArray421[anInt6008 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt6008 -= 2;
						if (anIntArray421[anInt6008] < anIntArray421[anInt6008 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt6008 -= 2;
						if (anIntArray421[anInt6008] > anIntArray421[anInt6008 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt6009 == 0) {
							return;
						}
						@Pc(216) Class134 local216 = aClass134Array1[--anInt6009];
						arg0 = local216.aClass12_Sub4_Sub6_1;
						local8 = arg0.anIntArray230;
						local11 = arg0.anIntArray229;
						local5 = local216.anInt4267;
						anIntArray422 = local216.anIntArray319;
						aStringArray35 = local216.aStringArray23;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray421[anInt6008++] = Static393.aClass31_1.method788(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static393.aClass31_1.method791(anIntArray421[--anInt6008], local54);
					} else if (local31 == 31) {
						anInt6008 -= 2;
						if (anIntArray421[anInt6008] <= anIntArray421[anInt6008 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt6008 -= 2;
						if (anIntArray421[anInt6008] >= anIntArray421[anInt6008 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray421[anInt6008++] = anIntArray422[local11[local5]];
					} else if (local31 == 34) {
						anIntArray422[local11[local5]] = anIntArray421[--anInt6008];
					} else if (local31 == 35) {
						aStringArray36[anInt6013++] = aStringArray35[local11[local5]];
					} else if (local31 == 36) {
						aStringArray35[local11[local5]] = aStringArray36[--anInt6013];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt6013 -= local54;
						@Pc(400) String local400 = Static289.method4719(aStringArray36, local54, anInt6013);
						aStringArray36[anInt6013++] = local400;
					} else if (local31 == 38) {
						anInt6008--;
					} else if (local31 == 39) {
						anInt6013--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class12_Sub4_Sub6 local436 = Static493.method7338(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt3072];
							@Pc(450) String[] local450 = new String[local436.anInt3069];
							for (local452 = 0; local452 < local436.anInt3068; local452++) {
								local446[local452] = anIntArray421[anInt6008 + local452 - local436.anInt3068];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt3067; local471++) {
								local450[local471] = aStringArray36[anInt6013 + local471 - local436.anInt3067];
							}
							anInt6008 -= local436.anInt3068;
							anInt6013 -= local436.anInt3067;
							@Pc(502) Class134 local502 = new Class134();
							local502.aClass12_Sub4_Sub6_1 = arg0;
							local502.anInt4267 = local5;
							local502.anIntArray319 = anIntArray422;
							local502.aStringArray23 = aStringArray35;
							if (anInt6009 >= aClass134Array1.length) {
								throw new RuntimeException();
							}
							aClass134Array1[anInt6009++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray230;
							local11 = local436.anIntArray229;
							local5 = -1;
							anIntArray422 = local446;
							aStringArray35 = local450;
						} else if (local31 == 42) {
							anIntArray421[anInt6008++] = Static479.anIntArray646[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static479.anIntArray646[local54] = anIntArray421[--anInt6008];
							Static504.method7478(local54);
							Static345.aBoolean479 |= Static425.aBooleanArray44[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray421[--anInt6008];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray420[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray54[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray421[--anInt6008];
							if (local603 < 0 || local603 >= anIntArray420[local54]) {
								throw new RuntimeException();
							}
							anIntArray421[anInt6008++] = anIntArrayArray54[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt6008 -= 2;
							local603 = anIntArray421[anInt6008];
							if (local603 < 0 || local603 >= anIntArray420[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray54[local54][local603] = anIntArray421[anInt6008 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static534.aStringArray60[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray36[anInt6013++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static534.aStringArray60[local54] = aStringArray36[--anInt6013];
							Static454.method6861(local54);
						} else if (local31 == 51) {
							@Pc(774) Class68 local774 = arg0.aClass68Array1[local11[local5]];
							@Pc(787) Class12_Sub18 local787 = (Class12_Sub18) local774.method1917((long) anIntArray421[--anInt6008]);
							if (local787 != null) {
								local5 += local787.anInt3978;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString27 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong248).append(" ");
				for (local603 = anInt6009 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass134Array1[local603].aClass12_Sub4_Sub6_1.aLong248).append(" ");
				}
				local855.append("op: ").append(local13);
				Static508.method7541(local837, local855.toString());
			} else {
				Static206.method7966("Clientscript error in: " + arg0.aString27);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString27).append("\n");
				for (local603 = anInt6009 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass134Array1[local603].aClass12_Sub4_Sub6_1.aString27).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static508.method7541(local837, local855.toString());
				Static479.method7197(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)V")
	private static void method5023(@OriginalArg(0) int arg0) {
		@Pc(3) Class198 local3 = Static104.method2137(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class198[] local13 = Static473.aClass198ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class198[] local19 = Static71.aClass198ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static473.aClass198ArrayArray2[local9] = new Class198[local22];
			Static554.method3497(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static554.method3497(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(IZ)V")
	public static void method5024() {
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "()V")
	public static void method5026() {
	}

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)V")
	private static void method5027(@OriginalArg(0) int arg0) {
		@Pc(3) Class198 local3 = Static104.method2137(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class198[] local13 = Static473.aClass198ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class198[] local19 = Static71.aClass198ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static473.aClass198ArrayArray2[local9] = new Class198[local22];
			Static554.method3497(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static554.method3497(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(IZ)V")
	private static void method5028(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class198 local137;
		@Pc(19) int local19;
		@Pc(56) int local56;
		@Pc(25) int local25;
		@Pc(158) Class198 local158;
		@Pc(35) Class198 local35;
		@Pc(210) Class198 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt6008 -= 3;
				local13 = anIntArray421[anInt6008];
				local19 = anIntArray421[anInt6008 + 1];
				local25 = anIntArray421[anInt6008 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static104.method2137(local13);
				if (local35.aClass198Array1 == null) {
					local35.aClass198Array1 = new Class198[local25 + 1];
				}
				if (local35.aClass198Array1.length <= local25) {
					@Pc(54) Class198[] local54 = new Class198[local25 + 1];
					for (local56 = 0; local56 < local35.aClass198Array1.length; local56++) {
						local54[local56] = local35.aClass198Array1[local56];
					}
					local35.aClass198Array1 = local54;
				}
				if (local25 > 0 && local35.aClass198Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class198 local99 = new Class198();
				local99.anInt5776 = local19;
				local99.anInt5787 = local99.anInt5739 = local35.anInt5739;
				local99.anInt5705 = local25;
				local35.aClass198Array1[local25] = local99;
				if (arg1) {
					aClass198_10 = local99;
				} else {
					aClass198_11 = local99;
				}
				Static331.method5282(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass198_10 : aClass198_11;
				if (local137.anInt5705 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static104.method2137(local137.anInt5739);
				local158.aClass198Array1[local137.anInt5705] = null;
				Static331.method5282(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static104.method2137(anIntArray421[--anInt6008]);
				local137.aClass198Array1 = null;
				Static331.method5282(local137);
				return;
			}
			if (arg0 == 200) {
				anInt6008 -= 2;
				local13 = anIntArray421[anInt6008];
				local19 = anIntArray421[anInt6008 + 1];
				local210 = Static428.method6579(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray421[anInt6008++] = 1;
					if (arg1) {
						aClass198_10 = local210;
						return;
					}
					aClass198_11 = local210;
					return;
				}
				anIntArray421[anInt6008++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray421[--anInt6008];
				local158 = Static104.method2137(local13);
				if (local158 != null) {
					anIntArray421[anInt6008++] = 1;
					if (arg1) {
						aClass198_10 = local158;
						return;
					}
					aClass198_11 = local158;
					return;
				}
				anIntArray421[anInt6008++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray421[--anInt6008];
				method5027(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray421[--anInt6008];
				method5023(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt6008 -= 2;
					local13 = anIntArray421[anInt6008];
					local19 = anIntArray421[anInt6008 + 1];
					for (local25 = 0; local25 < Static20.anIntArray27.length; local25++) {
						if (Static20.anIntArray27[local25] == local13) {
							Static440.aClass30_Sub1_Sub1_Sub1_2.aClass58_1.method1585(local25, Static274.aClass78_1, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static243.anIntArray353.length; local353++) {
						if (Static243.anIntArray353[local353] == local13) {
							Static440.aClass30_Sub1_Sub1_Sub1_2.aClass58_1.method1585(local353, Static274.aClass78_1, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt6008 -= 2;
					local13 = anIntArray421[anInt6008];
					local19 = anIntArray421[anInt6008 + 1];
					Static440.aClass30_Sub1_Sub1_Sub1_2.aClass58_1.method1590(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray421[--anInt6008] != 0;
					Static440.aClass30_Sub1_Sub1_Sub1_2.aClass58_1.method1588(local412);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static104.method2137(anIntArray421[--anInt6008]);
				} else {
					local137 = arg1 ? aClass198_10 : aClass198_11;
				}
				if (arg0 == 1000) {
					anInt6008 -= 4;
					local137.anInt5731 = anIntArray421[anInt6008];
					local137.anInt5757 = anIntArray421[anInt6008 + 1];
					local19 = anIntArray421[anInt6008 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray421[anInt6008 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte70 = (byte) local19;
					local137.aByte72 = (byte) local25;
					Static331.method5282(local137);
					Static140.method2822(local137);
					if (local137.anInt5705 == -1) {
						Static387.method6122(local137.anInt5739);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt6008 -= 4;
					local137.anInt5755 = anIntArray421[anInt6008];
					local137.anInt5736 = anIntArray421[anInt6008 + 1];
					local137.anInt5721 = 0;
					local137.anInt5719 = 0;
					local19 = anIntArray421[anInt6008 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray421[anInt6008 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte71 = (byte) local19;
					local137.aByte73 = (byte) local25;
					Static331.method5282(local137);
					Static140.method2822(local137);
					if (local137.anInt5776 == 0) {
						Static190.method3668(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray421[--anInt6008] == 1;
					if (local137.aBoolean440 != local620) {
						local137.aBoolean440 = local620;
						Static331.method5282(local137);
					}
					if (local137.anInt5705 == -1) {
						Static386.method6841(local137.anInt5739);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt6008 -= 2;
					local137.anInt5770 = anIntArray421[anInt6008];
					local137.anInt5786 = anIntArray421[anInt6008 + 1];
					Static331.method5282(local137);
					Static140.method2822(local137);
					if (local137.anInt5776 == 0) {
						Static190.method3668(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean441 = anIntArray421[--anInt6008] == 1;
					return;
				}
			} else {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static104.method2137(anIntArray421[--anInt6008]);
					} else {
						local137 = arg1 ? aClass198_10 : aClass198_11;
					}
					if (arg0 == 1100) {
						anInt6008 -= 2;
						local137.anInt5732 = anIntArray421[anInt6008];
						if (local137.anInt5732 > local137.anInt5758 - local137.anInt5762) {
							local137.anInt5732 = local137.anInt5758 - local137.anInt5762;
						}
						if (local137.anInt5732 < 0) {
							local137.anInt5732 = 0;
						}
						local137.anInt5791 = anIntArray421[anInt6008 + 1];
						if (local137.anInt5791 > local137.anInt5733 - local137.anInt5715) {
							local137.anInt5791 = local137.anInt5733 - local137.anInt5715;
						}
						if (local137.anInt5791 < 0) {
							local137.anInt5791 = 0;
						}
						Static331.method5282(local137);
						if (local137.anInt5705 == -1) {
							Static309.method4996(local137.anInt5739);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt5709 = anIntArray421[--anInt6008];
						Static331.method5282(local137);
						if (local137.anInt5705 == -1) {
							Static17.method414(local137.anInt5739);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean432 = anIntArray421[--anInt6008] == 1;
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt5796 = anIntArray421[--anInt6008];
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt5723 = anIntArray421[--anInt6008];
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray421[--anInt6008];
						if (local137.anInt5790 != local19) {
							local137.anInt5790 = local19;
							Static331.method5282(local137);
						}
						if (local137.anInt5705 == -1) {
							Static222.method4062(local137.anInt5739);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt5795 = anIntArray421[--anInt6008];
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean431 = anIntArray421[--anInt6008] == 1;
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt5722 = 1;
						local137.anInt5744 = anIntArray421[--anInt6008];
						Static331.method5282(local137);
						if (local137.anInt5705 == -1) {
							Static20.method467(local137.anInt5739);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt6008 -= 6;
						local137.anInt5756 = anIntArray421[anInt6008];
						local137.anInt5725 = anIntArray421[anInt6008 + 1];
						local137.anInt5745 = anIntArray421[anInt6008 + 2];
						local137.anInt5730 = anIntArray421[anInt6008 + 3];
						local137.anInt5772 = anIntArray421[anInt6008 + 4];
						local137.anInt5782 = anIntArray421[anInt6008 + 5];
						Static331.method5282(local137);
						if (local137.anInt5705 == -1) {
							Static135.method2777(local137.anInt5739);
							Static520.method7734(local137.anInt5739);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray421[--anInt6008];
						if (local137.anInt5708 != local19) {
							local137.anInt5708 = local19;
							local137.anInt5735 = 0;
							local137.anInt5783 = 1;
							local137.anInt5753 = 0;
							Static331.method5282(local137);
						}
						if (local137.anInt5705 == -1) {
							Static338.method2648(local137.anInt5739);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean445 = anIntArray421[--anInt6008] == 1;
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray36[--anInt6013];
						if (!local1101.equals(local137.aString67)) {
							local137.aString67 = local1101;
							Static331.method5282(local137);
						}
						if (local137.anInt5705 == -1) {
							Static507.method7526(local137.anInt5739);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt5794 = anIntArray421[--anInt6008];
						Static331.method5282(local137);
						if (local137.anInt5705 == -1) {
							Static391.method5852(local137.anInt5739);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt6008 -= 3;
						local137.anInt5771 = anIntArray421[anInt6008];
						local137.anInt5773 = anIntArray421[anInt6008 + 1];
						local137.anInt5749 = anIntArray421[anInt6008 + 2];
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean444 = anIntArray421[--anInt6008] == 1;
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt5724 = anIntArray421[--anInt6008];
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt5738 = anIntArray421[--anInt6008];
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean439 = anIntArray421[--anInt6008] == 1;
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean442 = anIntArray421[--anInt6008] == 1;
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt6008 -= 2;
						local137.anInt5758 = anIntArray421[anInt6008];
						local137.anInt5733 = anIntArray421[anInt6008 + 1];
						Static331.method5282(local137);
						if (local137.anInt5776 == 0) {
							Static190.method3668(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt6008 -= 2;
						local137.anInt5789 = (short) anIntArray421[anInt6008];
						local137.anInt5707 = (short) anIntArray421[anInt6008 + 1];
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean435 = anIntArray421[--anInt6008] == 1;
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt5782 = anIntArray421[--anInt6008];
						Static331.method5282(local137);
						if (local137.anInt5705 == -1) {
							Static135.method2777(local137.anInt5739);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray421[--anInt6008];
						local137.aBoolean434 = local19 == 1;
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt6008 -= 2;
						local137.anInt5784 = anIntArray421[anInt6008];
						local137.anInt5792 = anIntArray421[anInt6008 + 1];
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt5728 = anIntArray421[--anInt6008];
						Static331.method5282(local137);
						return;
					}
					@Pc(1454) Class213 local1454;
					if (arg0 == 1127) {
						anInt6008 -= 2;
						local19 = anIntArray421[anInt6008];
						local25 = anIntArray421[anInt6008 + 1];
						local1454 = Static453.aClass258_2.method6426(local19);
						if (local25 != local1454.anInt6063) {
							local137.method4812(local19, local25);
							return;
						}
						local137.method4804(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray421[--anInt6008];
						local1488 = aStringArray36[--anInt6013];
						local1454 = Static453.aClass258_2.method6426(local19);
						if (!local1454.aString71.equals(local1488)) {
							local137.method4810(local1488, local19);
							return;
						}
						local137.method4804(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static104.method2137(anIntArray421[--anInt6008]);
						} else {
							local137 = arg1 ? aClass198_10 : aClass198_11;
						}
						if (arg0 == 1300) {
							local19 = anIntArray421[--anInt6008] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method4808(aStringArray36[--anInt6013], local19);
								return;
							}
							anInt6013--;
							return;
						}
						if (arg0 == 1301) {
							anInt6008 -= 2;
							local19 = anIntArray421[anInt6008];
							local25 = anIntArray421[anInt6008 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass198_8 = null;
								return;
							}
							local137.aClass198_8 = Static428.method6579(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray421[--anInt6008];
							if (local19 != Static56.anInt1412 && local19 != Static542.anInt9611 && local19 != Static243.anInt5002) {
								return;
							}
							local137.anInt5764 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt5775 = anIntArray421[--anInt6008];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt5759 = anIntArray421[--anInt6008];
							return;
						}
						if (arg0 == 1305) {
							local137.aString65 = aStringArray36[--anInt6013];
							return;
						}
						if (arg0 == 1306) {
							local137.aString66 = aStringArray36[--anInt6013];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray32 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt5711 = anIntArray421[--anInt6008];
							local137.anInt5729 = anIntArray421[--anInt6008];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray421[--anInt6008];
							local25 = anIntArray421[--anInt6008];
							if (local25 >= 1 && local25 <= 10) {
								local137.method4807(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString64 = aStringArray36[--anInt6013];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt5706 = anIntArray421[--anInt6008];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt6008 -= 3;
								local19 = anIntArray421[anInt6008] - 1;
								local25 = anIntArray421[anInt6008 + 1];
								local353 = anIntArray421[anInt6008 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt6008 -= 2;
								local19 = 10;
								local25 = anIntArray421[anInt6008];
								local353 = anIntArray421[anInt6008 + 1];
							}
							if (local137.aByteArray71 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray71 = new byte[11];
								local137.aByteArray70 = new byte[11];
								local137.lb = new int[11];
							}
							local137.aByteArray71[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean443 = false;
								for (local2290 = 0; local2290 < local137.aByteArray71.length; local2290++) {
									if (local137.aByteArray71[local2290] != 0) {
										local137.aBoolean443 = true;
										break;
									}
								}
							} else {
								local137.aBoolean443 = true;
							}
							local137.aByteArray70[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt5737 = anIntArray421[--anInt6008];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static104.method2137(anIntArray421[--anInt6008]);
						} else {
							local137 = arg1 ? aClass198_10 : aClass198_11;
						}
						local1101 = aStringArray36[--anInt6013];
						@Pc(2369) int[] local2369 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray421[--anInt6008];
							if (local353 > 0) {
								local2369 = new int[local353];
								while (local353-- > 0) {
									local2369[local353] = anIntArray421[--anInt6008];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
						for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2421[local2290] = aStringArray36[--anInt6013];
							} else {
								local2421[local2290] = Integer.valueOf(anIntArray421[--anInt6008]);
							}
						}
						local56 = anIntArray421[--anInt6008];
						if (local56 == -1) {
							local2421 = null;
						} else {
							local2421[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray15 = local2421;
						} else if (arg0 == 1401) {
							local137.anObjectArray24 = local2421;
						} else if (arg0 == 1402) {
							local137.anObjectArray11 = local2421;
						} else if (arg0 == 1403) {
							local137.anObjectArray5 = local2421;
						} else if (arg0 == 1404) {
							local137.anObjectArray21 = local2421;
						} else if (arg0 == 1405) {
							local137.anObjectArray9 = local2421;
						} else if (arg0 == 1406) {
							local137.anObjectArray34 = local2421;
						} else if (arg0 == 1407) {
							local137.anObjectArray25 = local2421;
							local137.anIntArray407 = local2369;
						} else if (arg0 == 1408) {
							local137.anObjectArray6 = local2421;
						} else if (arg0 == 1409) {
							local137.anObjectArray17 = local2421;
						} else if (arg0 == 1410) {
							local137.anObjectArray14 = local2421;
						} else if (arg0 == 1411) {
							local137.anObjectArray28 = local2421;
						} else if (arg0 == 1412) {
							local137.anObjectArray10 = local2421;
						} else if (arg0 == 1414) {
							local137.anObjectArray20 = local2421;
							local137.anIntArray406 = local2369;
						} else if (arg0 == 1415) {
							local137.anObjectArray32 = local2421;
							local137.anIntArray402 = local2369;
						} else if (arg0 == 1416) {
							local137.anObjectArray22 = local2421;
						} else if (arg0 == 1417) {
							local137.anObjectArray33 = local2421;
						} else if (arg0 == 1418) {
							local137.anObjectArray30 = local2421;
						} else if (arg0 == 1419) {
							local137.anObjectArray12 = local2421;
						} else if (arg0 == 1420) {
							local137.anObjectArray27 = local2421;
						} else if (arg0 == 1421) {
							local137.anObjectArray26 = local2421;
						} else if (arg0 == 1422) {
							local137.anObjectArray8 = local2421;
						} else if (arg0 == 1423) {
							local137.anObjectArray18 = local2421;
						} else if (arg0 == 1424) {
							local137.anObjectArray35 = local2421;
						} else if (arg0 == 1425) {
							local137.anObjectArray23 = local2421;
						} else if (arg0 == 1426) {
							local137.anObjectArray16 = local2421;
						} else if (arg0 == 1427) {
							local137.anObjectArray19 = local2421;
						} else if (arg0 == 1428) {
							local137.anObjectArray7 = local2421;
							local137.anIntArray403 = local2369;
						} else if (arg0 == 1429) {
							local137.anObjectArray31 = local2421;
							local137.anIntArray404 = local2369;
						} else if (arg0 == 1430) {
							local137.anObjectArray29 = local2421;
						}
						local137.aBoolean446 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass198_10 : aClass198_11;
						if (arg0 == 1500) {
							anIntArray421[anInt6008++] = local137.anInt5713;
							return;
						}
						if (arg0 == 1501) {
							anIntArray421[anInt6008++] = local137.anInt5741;
							return;
						}
						if (arg0 == 1502) {
							anIntArray421[anInt6008++] = local137.anInt5762;
							return;
						}
						if (arg0 == 1503) {
							anIntArray421[anInt6008++] = local137.anInt5715;
							return;
						}
						if (arg0 == 1504) {
							anIntArray421[anInt6008++] = local137.aBoolean440 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray421[anInt6008++] = local137.anInt5787;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static116.method2393(local137);
							anIntArray421[anInt6008++] = local158 == null ? -1 : local158.anInt5739;
							return;
						}
					} else {
						@Pc(3017) Class213 local3017;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass198_10 : aClass198_11;
							if (arg0 == 1600) {
								anIntArray421[anInt6008++] = local137.anInt5732;
								return;
							}
							if (arg0 == 1601) {
								anIntArray421[anInt6008++] = local137.anInt5791;
								return;
							}
							if (arg0 == 1602) {
								aStringArray36[anInt6013++] = local137.aString67;
								return;
							}
							if (arg0 == 1603) {
								anIntArray421[anInt6008++] = local137.anInt5758;
								return;
							}
							if (arg0 == 1604) {
								anIntArray421[anInt6008++] = local137.anInt5733;
								return;
							}
							if (arg0 == 1605) {
								anIntArray421[anInt6008++] = local137.anInt5782;
								return;
							}
							if (arg0 == 1606) {
								anIntArray421[anInt6008++] = local137.anInt5745;
								return;
							}
							if (arg0 == 1607) {
								anIntArray421[anInt6008++] = local137.anInt5772;
								return;
							}
							if (arg0 == 1608) {
								anIntArray421[anInt6008++] = local137.anInt5730;
								return;
							}
							if (arg0 == 1609) {
								anIntArray421[anInt6008++] = local137.anInt5796;
								return;
							}
							if (arg0 == 1610) {
								anIntArray421[anInt6008++] = local137.anInt5756;
								return;
							}
							if (arg0 == 1611) {
								anIntArray421[anInt6008++] = local137.anInt5725;
								return;
							}
							if (arg0 == 1612) {
								anIntArray421[anInt6008++] = local137.anInt5790;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray421[--anInt6008];
								local3017 = Static453.aClass258_2.method6426(local19);
								if (local3017.method5078()) {
									aStringArray36[anInt6013++] = local137.method4803(local19, local3017.aString71);
									return;
								}
								anIntArray421[anInt6008++] = local137.method4818(local19, local3017.anInt6063);
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass198_10 : aClass198_11;
							if (arg0 == 1700) {
								anIntArray421[anInt6008++] = local137.anInt5726;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt5726 != -1) {
									anIntArray421[anInt6008++] = local137.anInt5768;
									return;
								}
								anIntArray421[anInt6008++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray421[anInt6008++] = local137.anInt5705;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass198_10 : aClass198_11;
							if (arg0 == 1800) {
								anIntArray421[anInt6008++] = Static67.method1529(local137).method5780();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray421[--anInt6008];
								local19--;
								if (local137.aStringArray32 != null && local19 < local137.aStringArray32.length && local137.aStringArray32[local19] != null) {
									aStringArray36[anInt6013++] = local137.aStringArray32[local19];
									return;
								}
								aStringArray36[anInt6013++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString65 == null) {
									aStringArray36[anInt6013++] = "";
									return;
								}
								aStringArray36[anInt6013++] = local137.aString65;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static104.method2137(anIntArray421[--anInt6008]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass198_10 : aClass198_11;
							}
							if (anInt6016 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray19 == null) {
									return;
								}
								@Pc(3254) Class12_Sub6 local3254 = new Class12_Sub6();
								local3254.aClass198_2 = local137;
								local3254.anObjectArray2 = local137.anObjectArray19;
								local3254.anInt1507 = anInt6016 + 1;
								Static341.aClass73_54.method2012(local3254);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static104.method2137(anIntArray421[--anInt6008]);
							if (arg0 == 2500) {
								anIntArray421[anInt6008++] = local137.anInt5713;
								return;
							}
							if (arg0 == 2501) {
								anIntArray421[anInt6008++] = local137.anInt5741;
								return;
							}
							if (arg0 == 2502) {
								anIntArray421[anInt6008++] = local137.anInt5762;
								return;
							}
							if (arg0 == 2503) {
								anIntArray421[anInt6008++] = local137.anInt5715;
								return;
							}
							if (arg0 == 2504) {
								anIntArray421[anInt6008++] = local137.aBoolean440 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray421[anInt6008++] = local137.anInt5787;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static116.method2393(local137);
								anIntArray421[anInt6008++] = local158 == null ? -1 : local158.anInt5739;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static104.method2137(anIntArray421[--anInt6008]);
							if (arg0 == 2600) {
								anIntArray421[anInt6008++] = local137.anInt5732;
								return;
							}
							if (arg0 == 2601) {
								anIntArray421[anInt6008++] = local137.anInt5791;
								return;
							}
							if (arg0 == 2602) {
								aStringArray36[anInt6013++] = local137.aString67;
								return;
							}
							if (arg0 == 2603) {
								anIntArray421[anInt6008++] = local137.anInt5758;
								return;
							}
							if (arg0 == 2604) {
								anIntArray421[anInt6008++] = local137.anInt5733;
								return;
							}
							if (arg0 == 2605) {
								anIntArray421[anInt6008++] = local137.anInt5782;
								return;
							}
							if (arg0 == 2606) {
								anIntArray421[anInt6008++] = local137.anInt5745;
								return;
							}
							if (arg0 == 2607) {
								anIntArray421[anInt6008++] = local137.anInt5772;
								return;
							}
							if (arg0 == 2608) {
								anIntArray421[anInt6008++] = local137.anInt5730;
								return;
							}
							if (arg0 == 2609) {
								anIntArray421[anInt6008++] = local137.anInt5796;
								return;
							}
							if (arg0 == 2610) {
								anIntArray421[anInt6008++] = local137.anInt5756;
								return;
							}
							if (arg0 == 2611) {
								anIntArray421[anInt6008++] = local137.anInt5725;
								return;
							}
							if (arg0 == 2612) {
								anIntArray421[anInt6008++] = local137.anInt5790;
								return;
							}
						} else {
							@Pc(3751) Class12_Sub34 local3751;
							@Pc(3649) Class12_Sub34 local3649;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static104.method2137(anIntArray421[--anInt6008]);
									anIntArray421[anInt6008++] = local137.anInt5726;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static104.method2137(anIntArray421[--anInt6008]);
									if (local137.anInt5726 != -1) {
										anIntArray421[anInt6008++] = local137.anInt5768;
										return;
									}
									anIntArray421[anInt6008++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray421[--anInt6008];
									local3649 = (Class12_Sub34) Static456.aClass68_67.method1917((long) local13);
									if (local3649 != null) {
										anIntArray421[anInt6008++] = 1;
										return;
									}
									anIntArray421[anInt6008++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static104.method2137(anIntArray421[--anInt6008]);
									if (local137.aClass198Array1 == null) {
										anIntArray421[anInt6008++] = 0;
										return;
									}
									local19 = local137.aClass198Array1.length;
									for (local25 = 0; local25 < local137.aClass198Array1.length; local25++) {
										if (local137.aClass198Array1[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray421[anInt6008++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt6008 -= 2;
									local13 = anIntArray421[anInt6008];
									local19 = anIntArray421[anInt6008 + 1];
									local3751 = (Class12_Sub34) Static456.aClass68_67.method1917((long) local13);
									if (local3751 != null && local3751.anInt5831 == local19) {
										anIntArray421[anInt6008++] = 1;
										return;
									} else {
										anIntArray421[anInt6008++] = 0;
										return;
									}
								}
							} else if (arg0 < 2900) {
								local137 = Static104.method2137(anIntArray421[--anInt6008]);
								if (arg0 == 2800) {
									anIntArray421[anInt6008++] = Static67.method1529(local137).method5780();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray421[--anInt6008];
									local19--;
									if (local137.aStringArray32 != null && local19 < local137.aStringArray32.length && local137.aStringArray32[local19] != null) {
										aStringArray36[anInt6013++] = local137.aStringArray32[local19];
										return;
									}
									aStringArray36[anInt6013++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString65 == null) {
										aStringArray36[anInt6013++] = "";
										return;
									}
									aStringArray36[anInt6013++] = local137.aString65;
									return;
								}
							} else {
								@Pc(3888) String local3888;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3888 = aStringArray36[--anInt6013];
										Static206.method7966(local3888);
										return;
									}
									if (arg0 == 3101) {
										anInt6008 -= 2;
										Static138.method2812(Static440.aClass30_Sub1_Sub1_Sub1_2, anIntArray421[anInt6008 + 1], anIntArray421[anInt6008]);
										return;
									}
									if (arg0 == 3103) {
										Static200.method3791();
										return;
									}
									if (arg0 == 3104) {
										local3888 = aStringArray36[--anInt6013];
										local19 = 0;
										if (Static261.method4417(local3888)) {
											local19 = Static467.method7015(local3888);
										}
										Static332.method5312(Static387.aClass77_66);
										Static383.aClass12_Sub8_Sub2_1.method5223(local19);
										return;
									}
									if (arg0 == 3105) {
										local3888 = aStringArray36[--anInt6013];
										Static332.method5312(Static454.aClass77_78);
										Static383.aClass12_Sub8_Sub2_1.method5214(local3888.length() + 1);
										Static383.aClass12_Sub8_Sub2_1.method5180(local3888);
										return;
									}
									if (arg0 == 3106) {
										local3888 = aStringArray36[--anInt6013];
										Static332.method5312(Static257.aClass77_47);
										Static383.aClass12_Sub8_Sub2_1.method5214(local3888.length() + 1);
										Static383.aClass12_Sub8_Sub2_1.method5180(local3888);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray421[--anInt6008];
										local1101 = aStringArray36[--anInt6013];
										Static62.method1458(local1101, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt6008 -= 3;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										local25 = anIntArray421[anInt6008 + 2];
										local35 = Static104.method2137(local25);
										Static466.method6991(local19, local13, local35);
										return;
									}
									if (arg0 == 3109) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										local210 = arg1 ? aClass198_10 : aClass198_11;
										Static466.method6991(local19, local13, local210);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray421[--anInt6008];
										Static332.method5312(Static254.aClass77_46);
										Static383.aClass12_Sub8_Sub2_1.method5190(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										local3751 = (Class12_Sub34) Static456.aClass68_67.method1917((long) local13);
										if (local3751 != null) {
											Static102.method2109(local3751.anInt5831 != local19, local3751, true);
										}
										Static198.method3764(local19, local13, 3, true);
										return;
									}
									if (arg0 == 3112) {
										anInt6008--;
										local13 = anIntArray421[anInt6008];
										local3649 = (Class12_Sub34) Static456.aClass68_67.method1917((long) local13);
										if (local3649 != null && local3649.anInt5829 == 3) {
											Static102.method2109(true, local3649, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static105.method2171(aStringArray36[--anInt6013]);
										return;
									}
									if (arg0 == 3114) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										local1488 = aStringArray36[--anInt6013];
										Static406.method6373("", local13, local19, "", local1488);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt6008 -= 3;
										Static401.method6305(anIntArray421[anInt6008 + 1], anIntArray421[anInt6008 + 2], anIntArray421[anInt6008], 255);
										return;
									}
									if (arg0 == 3201) {
										Static387.method6125(50, 255, anIntArray421[--anInt6008]);
										return;
									}
									if (arg0 == 3202) {
										anInt6008 -= 2;
										Static387.method6120(anIntArray421[anInt6008], 255, anIntArray421[anInt6008 + 1]);
										return;
									}
									if (arg0 == 3203) {
										anInt6008 -= 4;
										Static401.method6305(anIntArray421[anInt6008 + 1], anIntArray421[anInt6008 + 2], anIntArray421[anInt6008], anIntArray421[anInt6008 + 3]);
										return;
									}
									if (arg0 == 3204) {
										anInt6008 -= 3;
										Static387.method6125(anIntArray421[anInt6008 + 2], anIntArray421[anInt6008 + 1], anIntArray421[anInt6008]);
										return;
									}
									if (arg0 == 3205) {
										anInt6008 -= 3;
										Static387.method6120(anIntArray421[anInt6008], anIntArray421[anInt6008 + 2], anIntArray421[anInt6008 + 1]);
										return;
									}
									if (arg0 == 3206) {
										anInt6008 -= 4;
										Static283.method7814(anIntArray421[anInt6008 + 2], anIntArray421[anInt6008], anIntArray421[anInt6008 + 3], anIntArray421[anInt6008 + 1]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray421[anInt6008++] = Static409.anInt7683;
										return;
									}
									if (arg0 == 3301) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = Static539.method7933(false, local19, local13);
										return;
									}
									if (arg0 == 3302) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = Static358.method5605(false, local19, local13);
										return;
									}
									if (arg0 == 3303) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = Static419.method6483(false, local13, local19);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static541.aClass223_1.method5415(local13).anInt3221;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static259.anIntArray372[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static29.anIntArray32[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static483.anIntArray654[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4605) byte local4605 = Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99;
										local19 = (Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418 >> 7) + Static61.anInt1459;
										local25 = (Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416 >> 7) + Static203.anInt4534;
										anIntArray421[anInt6008++] = (local4605 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray421[anInt6008++] = Static105.aBoolean204 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = Static539.method7933(true, local19, local13);
										return;
									}
									if (arg0 == 3314) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = Static358.method5605(true, local19, local13);
										return;
									}
									if (arg0 == 3315) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = Static419.method6483(true, local13, local19);
										return;
									}
									if (arg0 == 3316) {
										if (Static59.anInt1442 >= 2) {
											anIntArray421[anInt6008++] = Static59.anInt1442;
											return;
										}
										anIntArray421[anInt6008++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray421[anInt6008++] = Static47.anInt889;
										return;
									}
									if (arg0 == 3318) {
										anIntArray421[anInt6008++] = Static222.aClass247_1.anInt7426;
										return;
									}
									if (arg0 == 3321) {
										anIntArray421[anInt6008++] = Static545.anInt9648;
										return;
									}
									if (arg0 == 3322) {
										anIntArray421[anInt6008++] = Static69.anInt9146;
										return;
									}
									if (arg0 == 3323) {
										if (Static24.anInt390 >= 5 && Static24.anInt390 <= 9) {
											anIntArray421[anInt6008++] = 1;
											return;
										}
										anIntArray421[anInt6008++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static24.anInt390 >= 5 && Static24.anInt390 <= 9) {
											anIntArray421[anInt6008++] = Static24.anInt390;
											return;
										}
										anIntArray421[anInt6008++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray421[anInt6008++] = Static366.aBoolean638 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray421[anInt6008++] = Static440.aClass30_Sub1_Sub1_Sub1_2.anInt730;
										return;
									}
									if (arg0 == 3327) {
										anIntArray421[anInt6008++] = Static440.aClass30_Sub1_Sub1_Sub1_2.aClass58_1.aBoolean130 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray421[anInt6008++] = Static541.aBoolean683 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static252.method4356(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = Static224.method6972(false, local13, local19);
										return;
									}
									if (arg0 == 3332) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = Static224.method6972(true, local13, local19);
										return;
									}
									if (arg0 == 3333) {
										anIntArray421[anInt6008++] = Static122.anInt2825;
										return;
									}
									if (arg0 == 3335) {
										anIntArray421[anInt6008++] = Static345.anInt6495;
										return;
									}
									if (arg0 == 3336) {
										anInt6008 -= 4;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										local25 = anIntArray421[anInt6008 + 2];
										local353 = anIntArray421[anInt6008 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray421[anInt6008++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray421[anInt6008++] = Static423.anInt79;
										return;
									}
									if (arg0 == 3338) {
										anIntArray421[anInt6008++] = Static187.method3648();
										return;
									}
									if (arg0 == 3339) {
										anIntArray421[anInt6008++] = Static140.aBoolean252 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray421[anInt6008++] = Static38.aBoolean44 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray421[anInt6008++] = Static252.aBoolean401 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray421[anInt6008++] = Static527.aClass6_1.method3754();
										return;
									}
									if (arg0 == 3343) {
										anIntArray421[anInt6008++] = Static527.aClass6_1.method3757();
										return;
									}
									if (arg0 == 3344) {
										aStringArray36[anInt6013++] = Static488.method7286();
										return;
									}
									if (arg0 == 3345) {
										aStringArray36[anInt6013++] = Static334.method5355();
										return;
									}
									if (arg0 == 3346) {
										anIntArray421[anInt6008++] = Static498.method7392();
										return;
									}
									if (arg0 == 3347) {
										anIntArray421[anInt6008++] = Static78.anInt1824;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5340) Class305 local5340;
									if (arg0 == 3400) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										local5340 = Static461.aClass95_1.method2637(local13);
										aStringArray36[anInt6013++] = local5340.method7724(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt6008 -= 4;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										local25 = anIntArray421[anInt6008 + 2];
										local353 = anIntArray421[anInt6008 + 3];
										@Pc(5386) Class305 local5386 = Static461.aClass95_1.method2637(local25);
										if (local5386.aChar3 == local13 && local5386.aChar4 == local19) {
											if (local19 == 115) {
												aStringArray36[anInt6013++] = local5386.method7724(local353);
												return;
											}
											anIntArray421[anInt6008++] = local5386.method7719(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt6008 -= 3;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										local25 = anIntArray421[anInt6008 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5462) Class305 local5462 = Static461.aClass95_1.method2637(local19);
										if (local5462.aChar4 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray421[anInt6008++] = local5462.method7723(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray421[--anInt6008];
										local1101 = aStringArray36[--anInt6013];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5340 = Static461.aClass95_1.method2637(local13);
										if (local5340.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray421[anInt6008++] = local5340.method7726(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray421[--anInt6008];
										@Pc(5560) Class305 local5560 = Static461.aClass95_1.method2637(local13);
										anIntArray421[anInt6008++] = local5560.aClass68_80.method1925();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static155.anInt3380 == 0) {
											anIntArray421[anInt6008++] = -2;
											return;
										}
										if (Static155.anInt3380 == 1) {
											anIntArray421[anInt6008++] = -1;
											return;
										}
										anIntArray421[anInt6008++] = Static167.anInt3850;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray421[--anInt6008];
										if (Static155.anInt3380 == 2 && local13 < Static167.anInt3850) {
											aStringArray36[anInt6013++] = Static205.aStringArray24[local13];
											if (Static251.aStringArray28[local13] != null) {
												aStringArray36[anInt6013++] = Static251.aStringArray28[local13];
												return;
											}
											aStringArray36[anInt6013++] = "";
											return;
										}
										aStringArray36[anInt6013++] = "";
										aStringArray36[anInt6013++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray421[--anInt6008];
										if (Static155.anInt3380 == 2 && local13 < Static167.anInt3850) {
											anIntArray421[anInt6008++] = Static462.anIntArray626[local13];
											return;
										}
										anIntArray421[anInt6008++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray421[--anInt6008];
										if (Static155.anInt3380 == 2 && local13 < Static167.anInt3850) {
											anIntArray421[anInt6008++] = Static8.anIntArray15[local13];
											return;
										}
										anIntArray421[anInt6008++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3888 = aStringArray36[--anInt6013];
										local19 = anIntArray421[--anInt6008];
										Static273.method4596(local3888, local19);
										return;
									}
									if (arg0 == 3605) {
										local3888 = aStringArray36[--anInt6013];
										Static443.method6718(local3888);
										return;
									}
									if (arg0 == 3606) {
										local3888 = aStringArray36[--anInt6013];
										Static143.method2856(local3888);
										return;
									}
									if (arg0 == 3607) {
										local3888 = aStringArray36[--anInt6013];
										Static527.method7828(local3888, false);
										return;
									}
									if (arg0 == 3608) {
										local3888 = aStringArray36[--anInt6013];
										Static436.method6646(local3888);
										return;
									}
									if (arg0 == 3609) {
										local3888 = aStringArray36[--anInt6013];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray421[anInt6008++] = Static68.method1558(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray421[--anInt6008];
										if (Static155.anInt3380 == 2 && local13 < Static167.anInt3850) {
											aStringArray36[anInt6013++] = Static385.aStringArray58[local13];
											return;
										}
										aStringArray36[anInt6013++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static482.aString99 != null) {
											aStringArray36[anInt6013++] = Static3.method193(Static482.aString99);
											return;
										}
										aStringArray36[anInt6013++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static482.aString99 != null) {
											anIntArray421[anInt6008++] = Static124.anInt2889;
											return;
										}
										anIntArray421[anInt6008++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray421[--anInt6008];
										if (Static482.aString99 != null && local13 < Static124.anInt2889) {
											aStringArray36[anInt6013++] = Static224.aClass169Array5[local13].aString49;
											return;
										}
										aStringArray36[anInt6013++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray421[--anInt6008];
										if (Static482.aString99 != null && local13 < Static124.anInt2889) {
											anIntArray421[anInt6008++] = Static224.aClass169Array5[local13].anInt5101;
											return;
										}
										anIntArray421[anInt6008++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray421[--anInt6008];
										if (Static482.aString99 != null && local13 < Static124.anInt2889) {
											anIntArray421[anInt6008++] = Static224.aClass169Array5[local13].aByte64;
											return;
										}
										anIntArray421[anInt6008++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray421[anInt6008++] = Static355.aByte80;
										return;
									}
									if (arg0 == 3617) {
										local3888 = aStringArray36[--anInt6013];
										Static142.method2851(local3888);
										return;
									}
									if (arg0 == 3618) {
										anIntArray421[anInt6008++] = Static328.aByte76;
										return;
									}
									if (arg0 == 3619) {
										local3888 = aStringArray36[--anInt6013];
										Static128.method2691(local3888);
										return;
									}
									if (arg0 == 3620) {
										Static212.method4976();
										return;
									}
									if (arg0 == 3621) {
										if (Static155.anInt3380 == 0) {
											anIntArray421[anInt6008++] = -1;
											return;
										}
										anIntArray421[anInt6008++] = Static358.anInt6694;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray421[--anInt6008];
										if (Static155.anInt3380 != 0 && local13 < Static358.anInt6694) {
											aStringArray36[anInt6013++] = Static440.aStringArray54[local13];
											if (Static540.aStringArray61[local13] != null) {
												aStringArray36[anInt6013++] = Static540.aStringArray61[local13];
												return;
											}
											aStringArray36[anInt6013++] = "";
											return;
										}
										aStringArray36[anInt6013++] = "";
										aStringArray36[anInt6013++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3888 = aStringArray36[--anInt6013];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray421[anInt6008++] = Static303.method4926(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray421[--anInt6008];
										if (Static224.aClass169Array5 != null && local13 < Static124.anInt2889 && Static224.aClass169Array5[local13].aString47.equalsIgnoreCase(Static440.aClass30_Sub1_Sub1_Sub1_2.aString6)) {
											anIntArray421[anInt6008++] = 1;
											return;
										}
										anIntArray421[anInt6008++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static249.aString50 != null) {
											aStringArray36[anInt6013++] = Static249.aString50;
											return;
										}
										aStringArray36[anInt6013++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray421[--anInt6008];
										if (Static482.aString99 != null && local13 < Static124.anInt2889) {
											aStringArray36[anInt6013++] = Static224.aClass169Array5[local13].aString48;
											return;
										}
										aStringArray36[anInt6013++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray421[--anInt6008];
										if (Static155.anInt3380 == 2 && local13 >= 0 && local13 < Static167.anInt3850) {
											anIntArray421[anInt6008++] = Static525.aBooleanArray47[local13] ? 1 : 0;
											return;
										}
										anIntArray421[anInt6008++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3888 = aStringArray36[--anInt6013];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray421[anInt6008++] = Static469.method7056(local3888);
										return;
									}
									if (arg0 == 3629) {
										anIntArray421[anInt6008++] = Static164.anInt3826;
										return;
									}
									if (arg0 == 3630) {
										local3888 = aStringArray36[--anInt6013];
										Static527.method7828(local3888, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static391.aBooleanArray39[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray421[--anInt6008];
										if (Static482.aString99 != null && local13 < Static124.anInt2889) {
											aStringArray36[anInt6013++] = Static224.aClass169Array5[local13].aString47;
											return;
										}
										aStringArray36[anInt6013++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray421[--anInt6008];
										if (Static155.anInt3380 != 0 && local13 < Static358.anInt6694) {
											aStringArray36[anInt6013++] = Static54.aStringArray5[local13];
											return;
										}
										aStringArray36[anInt6013++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static179.aClass219Array1[local13].method5317();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static179.aClass219Array1[local13].anInt6362;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static179.aClass219Array1[local13].anInt6365;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static179.aClass219Array1[local13].anInt6363;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static179.aClass219Array1[local13].anInt6366;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static179.aClass219Array1[local13].anInt6361;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray421[--anInt6008];
										local19 = Static179.aClass219Array1[local13].method5316();
										anIntArray421[anInt6008++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray421[--anInt6008];
										local19 = Static179.aClass219Array1[local13].method5316();
										anIntArray421[anInt6008++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray421[--anInt6008];
										local19 = Static179.aClass219Array1[local13].method5316();
										anIntArray421[anInt6008++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray421[--anInt6008];
										local19 = Static179.aClass219Array1[local13].method5316();
										anIntArray421[anInt6008++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt6008 -= 5;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										local25 = anIntArray421[anInt6008 + 2];
										local353 = anIntArray421[anInt6008 + 3];
										local2290 = anIntArray421[anInt6008 + 4];
										anIntArray421[anInt6008++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(7070) long local7070;
									@Pc(7063) long local7063;
									if (arg0 == 4007) {
										anInt6008 -= 2;
										local7063 = anIntArray421[anInt6008];
										local7070 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = (int) (local7063 + local7063 * local7070 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										if (local13 == 0) {
											anIntArray421[anInt6008++] = 0;
											return;
										}
										anIntArray421[anInt6008++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										if (local13 == 0) {
											anIntArray421[anInt6008++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray421[anInt6008++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray421[anInt6008++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt6008 -= 3;
										local7063 = anIntArray421[anInt6008];
										local7070 = anIntArray421[anInt6008 + 1];
										@Pc(7451) long local7451 = (long) anIntArray421[anInt6008 + 2];
										anIntArray421[anInt6008++] = (int) (local7063 * local7451 / local7070);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3888 = aStringArray36[--anInt6013];
										local19 = anIntArray421[--anInt6008];
										aStringArray36[anInt6013++] = local3888 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt6013 -= 2;
										local3888 = aStringArray36[anInt6013];
										local1101 = aStringArray36[anInt6013 + 1];
										aStringArray36[anInt6013++] = local3888 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3888 = aStringArray36[--anInt6013];
										local19 = anIntArray421[--anInt6008];
										aStringArray36[anInt6013++] = local3888 + Static274.method4601(local19);
										return;
									}
									if (arg0 == 4103) {
										local3888 = aStringArray36[--anInt6013];
										aStringArray36[anInt6013++] = local3888.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray36[anInt6013++] = method5018(anIntArray421[--anInt6008]);
										return;
									}
									if (arg0 == 4105) {
										anInt6013 -= 2;
										local3888 = aStringArray36[anInt6013];
										local1101 = aStringArray36[anInt6013 + 1];
										if (Static440.aClass30_Sub1_Sub1_Sub1_2.aClass58_1 != null && Static440.aClass30_Sub1_Sub1_Sub1_2.aClass58_1.aBoolean130) {
											aStringArray36[anInt6013++] = local1101;
											return;
										}
										aStringArray36[anInt6013++] = local3888;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray421[--anInt6008];
										aStringArray36[anInt6013++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt6013 -= 2;
										anIntArray421[anInt6008++] = Static72.method1643(Static345.anInt6495, aStringArray36[anInt6013 + 1], aStringArray36[anInt6013]);
										return;
									}
									@Pc(7734) Class244 local7734;
									if (arg0 == 4108) {
										local3888 = aStringArray36[--anInt6013];
										anInt6008 -= 2;
										local19 = anIntArray421[anInt6008];
										local25 = anIntArray421[anInt6008 + 1];
										local7734 = Static173.method3438(local25, Static466.aClass16_109);
										anIntArray421[anInt6008++] = local7734.method6150(local3888, local19, Static275.aClass84Array9);
										return;
									}
									if (arg0 == 4109) {
										local3888 = aStringArray36[--anInt6013];
										anInt6008 -= 2;
										local19 = anIntArray421[anInt6008];
										local25 = anIntArray421[anInt6008 + 1];
										local7734 = Static173.method3438(local25, Static466.aClass16_109);
										anIntArray421[anInt6008++] = local7734.method6159(Static275.aClass84Array9, local3888, local19);
										return;
									}
									if (arg0 == 4110) {
										anInt6013 -= 2;
										local3888 = aStringArray36[anInt6013];
										local1101 = aStringArray36[anInt6013 + 1];
										if (anIntArray421[--anInt6008] == 1) {
											aStringArray36[anInt6013++] = local3888;
											return;
										}
										aStringArray36[anInt6013++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3888 = aStringArray36[--anInt6013];
										aStringArray36[anInt6013++] = Static440.method6680(local3888);
										return;
									}
									if (arg0 == 4112) {
										local3888 = aStringArray36[--anInt6013];
										local19 = anIntArray421[--anInt6008];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray36[anInt6013++] = local3888 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static223.method3750((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static153.method3044((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static219.method4023((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static237.method4164((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3888 = aStringArray36[--anInt6013];
										if (local3888 != null) {
											anIntArray421[anInt6008++] = local3888.length();
											return;
										}
										anIntArray421[anInt6008++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3888 = aStringArray36[--anInt6013];
										anInt6008 -= 2;
										local19 = anIntArray421[anInt6008];
										local25 = anIntArray421[anInt6008 + 1];
										aStringArray36[anInt6013++] = local3888.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3888 = aStringArray36[--anInt6013];
										@Pc(8097) StringBuffer local8097 = new StringBuffer(local3888.length());
										@Pc(8099) boolean local8099 = false;
										for (local353 = 0; local353 < local3888.length(); local353++) {
											@Pc(8106) char local8106 = local3888.charAt(local353);
											if (local8106 == '<') {
												local8099 = true;
											} else if (local8106 == '>') {
												local8099 = false;
											} else if (!local8099) {
												local8097.append(local8106);
											}
										}
										aStringArray36[anInt6013++] = local8097.toString();
										return;
									}
									if (arg0 == 4120) {
										local3888 = aStringArray36[--anInt6013];
										anInt6008 -= 2;
										local19 = anIntArray421[anInt6008];
										local25 = anIntArray421[anInt6008 + 1];
										anIntArray421[anInt6008++] = local3888.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt6013 -= 2;
										local3888 = aStringArray36[anInt6013];
										local1101 = aStringArray36[anInt6013 + 1];
										local25 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = local3888.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray421[--anInt6008] != 0;
										local19 = anIntArray421[--anInt6008];
										aStringArray36[anInt6013++] = Static205.method3831(Static345.anInt6495, local412, (long) local19, 0);
										return;
									}
									if (arg0 == 4125) {
										local3888 = aStringArray36[--anInt6013];
										local19 = anIntArray421[--anInt6008];
										@Pc(8320) Class244 local8320 = Static173.method3438(local19, Static466.aClass16_109);
										anIntArray421[anInt6008++] = local8320.method6148(Static275.aClass84Array9, local3888);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray421[--anInt6008];
										aStringArray36[anInt6013++] = Static150.aClass254_2.method6340(local13).aString12;
										return;
									}
									@Pc(8382) Class56 local8382;
									if (arg0 == 4201) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										local8382 = Static150.aClass254_2.method6340(local13);
										if (local19 >= 1 && local19 <= 5 && local8382.aStringArray6[local19 - 1] != null) {
											aStringArray36[anInt6013++] = local8382.aStringArray6[local19 - 1];
											return;
										}
										aStringArray36[anInt6013++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										local8382 = Static150.aClass254_2.method6340(local13);
										if (local19 >= 1 && local19 <= 5 && local8382.aStringArray7[local19 - 1] != null) {
											aStringArray36[anInt6013++] = local8382.aStringArray7[local19 - 1];
											return;
										}
										aStringArray36[anInt6013++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static150.aClass254_2.method6340(local13).anInt1669;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static150.aClass254_2.method6340(local13).anInt1661 == 1 ? 1 : 0;
										return;
									}
									@Pc(8545) Class56 local8545;
									if (arg0 == 4205) {
										local13 = anIntArray421[--anInt6008];
										local8545 = Static150.aClass254_2.method6340(local13);
										if (local8545.anInt1632 == -1 && local8545.anInt1644 >= 0) {
											anIntArray421[anInt6008++] = local8545.anInt1644;
											return;
										}
										anIntArray421[anInt6008++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray421[--anInt6008];
										local8545 = Static150.aClass254_2.method6340(local13);
										if (local8545.anInt1632 >= 0 && local8545.anInt1644 >= 0) {
											anIntArray421[anInt6008++] = local8545.anInt1644;
											return;
										}
										anIntArray421[anInt6008++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray421[--anInt6008];
										anIntArray421[anInt6008++] = Static150.aClass254_2.method6340(local13).aBoolean128 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										local3017 = Static453.aClass258_2.method6426(local19);
										if (local3017.method5078()) {
											aStringArray36[anInt6013++] = Static150.aClass254_2.method6340(local13).method1551(local3017.aString71, local19);
											return;
										}
										anIntArray421[anInt6008++] = Static150.aClass254_2.method6340(local13).method1569(local19, local3017.anInt6063);
										return;
									}
									if (arg0 == 4209) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1] - 1;
										local8382 = Static150.aClass254_2.method6340(local13);
										if (local8382.anInt1627 == local19) {
											anIntArray421[anInt6008++] = local8382.anInt1647;
											return;
										}
										if (local8382.anInt1662 == local19) {
											anIntArray421[anInt6008++] = local8382.anInt1614;
											return;
										}
										anIntArray421[anInt6008++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3888 = aStringArray36[--anInt6013];
										local19 = anIntArray421[--anInt6008];
										Static500.method7437(local19 == 1, local3888);
										anIntArray421[anInt6008++] = Static292.anInt5650;
										return;
									}
									if (arg0 == 4211) {
										if (Static428.aShortArray105 != null && Static358.anInt6699 < Static292.anInt5650) {
											anIntArray421[anInt6008++] = Static428.aShortArray105[Static358.anInt6699++] & 0xFFFF;
											return;
										}
										anIntArray421[anInt6008++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static358.anInt6699 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										local3017 = Static453.aClass258_2.method6426(local19);
										if (local3017.method5078()) {
											aStringArray36[anInt6013++] = Static161.aClass110_3.method3018(local13).method3568(local19, local3017.aString71);
											return;
										}
										anIntArray421[anInt6008++] = Static161.aClass110_3.method3018(local13).method3567(local3017.anInt6063, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										local3017 = Static453.aClass258_2.method6426(local19);
										if (local3017.method5078()) {
											aStringArray36[anInt6013++] = Static49.aClass155_2.method4063(local13).method6885(local3017.aString71, local19);
											return;
										}
										anIntArray421[anInt6008++] = Static49.aClass155_2.method4063(local13).method6883(local19, local3017.anInt6063);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt6008 -= 2;
										local13 = anIntArray421[anInt6008];
										local19 = anIntArray421[anInt6008 + 1];
										local3017 = Static453.aClass258_2.method6426(local19);
										if (local3017.method5078()) {
											aStringArray36[anInt6013++] = Static285.aClass172_1.method4373(local13).method1870(local3017.aString71, local19);
											return;
										}
										anIntArray421[anInt6008++] = Static285.aClass172_1.method4373(local13).method1871(local3017.anInt6063, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray421[--anInt6008];
									@Pc(9046) Class166 local9046 = Static218.aClass160_1.method4121(local13);
									if (local9046.anIntArray351 != null && local9046.anIntArray351.length > 0) {
										local25 = 0;
										local353 = local9046.anIntArray350[0];
										for (local2290 = 1; local2290 < local9046.anIntArray351.length; local2290++) {
											if (local9046.anIntArray350[local2290] > local353) {
												local25 = local2290;
												local353 = local9046.anIntArray350[local2290];
											}
										}
										anIntArray421[anInt6008++] = local9046.anIntArray351[local25];
										return;
									}
									anIntArray421[anInt6008++] = local9046.anInt4961;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static104.method2137(anIntArray421[--anInt6008]);
					} else {
						local137 = arg1 ? aClass198_10 : aClass198_11;
					}
					Static331.method5282(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt6008 -= 2;
						local19 = anIntArray421[anInt6008];
						local25 = anIntArray421[anInt6008 + 1];
						if (local137.anInt5705 == -1) {
							Static21.method6673(local137.anInt5739);
							Static135.method2777(local137.anInt5739);
							Static520.method7734(local137.anInt5739);
						}
						if (local19 == -1) {
							local137.anInt5722 = 1;
							local137.anInt5744 = -1;
							local137.anInt5726 = -1;
							return;
						}
						local137.anInt5726 = local19;
						local137.anInt5768 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean437 = true;
						} else {
							local137.aBoolean437 = false;
						}
						@Pc(1630) Class56 local1630 = Static150.aClass254_2.method6340(local19);
						local137.anInt5745 = local1630.anInt1664;
						local137.anInt5730 = local1630.anInt1617;
						local137.anInt5772 = local1630.anInt1670;
						local137.anInt5756 = local1630.anInt1671;
						local137.anInt5725 = local1630.anInt1656;
						local137.anInt5782 = local1630.anInt1643;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt5766 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt5766 = 1;
						} else {
							local137.anInt5766 = 2;
						}
						if (local137.anInt5721 > 0) {
							local137.anInt5782 = local137.anInt5782 * 32 / local137.anInt5721;
							return;
						}
						if (local137.anInt5755 > 0) {
							local137.anInt5782 = local137.anInt5782 * 32 / local137.anInt5755;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt5722 = 2;
						local137.anInt5744 = anIntArray421[--anInt6008];
						if (local137.anInt5705 == -1) {
							Static20.method467(local137.anInt5739);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt5722 = 3;
						local137.anInt5744 = -1;
						if (local137.anInt5705 == -1) {
							Static20.method467(local137.anInt5739);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt5722 = 6;
						local137.anInt5744 = anIntArray421[--anInt6008];
						if (local137.anInt5705 == -1) {
							Static20.method467(local137.anInt5739);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt5722 = 5;
						local137.anInt5744 = anIntArray421[--anInt6008];
						if (local137.anInt5705 == -1) {
							Static20.method467(local137.anInt5739);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt6008 -= 4;
						local137.anInt5746 = anIntArray421[anInt6008];
						local137.anInt5742 = anIntArray421[anInt6008 + 1];
						local137.anInt5754 = anIntArray421[anInt6008 + 2];
						local137.anInt5763 = anIntArray421[anInt6008 + 3];
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt6008 -= 2;
						local137.anInt5748 = anIntArray421[anInt6008];
						local137.anInt5760 = anIntArray421[anInt6008 + 1];
						Static331.method5282(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt6008 -= 4;
						local137.anInt5744 = anIntArray421[anInt6008];
						local137.anInt5765 = anIntArray421[anInt6008 + 1];
						if (anIntArray421[anInt6008 + 2] == 1) {
							local137.anInt5722 = 9;
						} else {
							local137.anInt5722 = 8;
						}
						if (anIntArray421[anInt6008 + 3] == 1) {
							local137.aBoolean437 = true;
						} else {
							local137.aBoolean437 = false;
						}
						if (local137.anInt5705 == -1) {
							Static20.method467(local137.anInt5739);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt5722 = 5;
						local137.anInt5744 = Static396.anInt7452;
						local137.anInt5765 = 0;
						if (local137.anInt5705 == -1) {
							Static20.method467(local137.anInt5739);
						}
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!cl;)V")
	public static void method5029(@OriginalArg(0) Class12_Sub6 arg0) {
		method5019(arg0, 200000);
	}
}
