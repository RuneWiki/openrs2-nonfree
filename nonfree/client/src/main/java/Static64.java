import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Lclient!tf;")
	private static Class240 aClass240_2;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Lclient!tf;")
	private static Class240 aClass240_3;

	@OriginalMember(owner = "client!df", name = "r", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray6;

	@OriginalMember(owner = "client!df", name = "u", descriptor = "Lclient!om;")
	private static Class187 aClass187_1;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "[I")
	private static int[] anIntArray119;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "[I")
	private static final int[] anIntArray117 = new int[5];

	@OriginalMember(owner = "client!df", name = "d", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray5 = new String[1000];

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!df", name = "l", descriptor = "I")
	private static int anInt1604 = 0;

	@OriginalMember(owner = "client!df", name = "o", descriptor = "I")
	private static int anInt1607 = 0;

	@OriginalMember(owner = "client!df", name = "s", descriptor = "[Lclient!im;")
	private static final Class109[] aClass109Array1 = new Class109[50];

	@OriginalMember(owner = "client!df", name = "v", descriptor = "[[I")
	private static final int[][] anIntArrayArray8 = new int[5][5000];

	@OriginalMember(owner = "client!df", name = "w", descriptor = "[I")
	private static final int[] anIntArray118 = new int[1000];

	@OriginalMember(owner = "client!df", name = "x", descriptor = "I")
	private static int anInt1611 = 0;

	@OriginalMember(owner = "client!df", name = "z", descriptor = "[I")
	private static final int[] anIntArray120 = new int[3];

	@OriginalMember(owner = "client!df", name = "A", descriptor = "Lclient!ge;")
	public static final Class83 aClass83_11 = new Class83(4);

	@OriginalMember(owner = "client!df", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray7 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!df", name = "C", descriptor = "I")
	private static int anInt1612 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)V")
	public static void method1461() {
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!dk;)V")
	public static void method1462(@OriginalArg(0) Class4_Sub10 arg0) {
		method1463(arg0, 200000);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!dk;I)V")
	private static void method1463(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray4;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class4_Sub1_Sub11 local12 = Static230.method3926(local8);
		if (local12 == null) {
			return;
		}
		anIntArray119 = new int[local12.anInt3234];
		@Pc(21) int local21 = 0;
		aStringArray6 = new String[local12.anInt3239];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt1688;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt1686;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass240_5 == null ? -1 : arg0.aClass240_5.anInt6909;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt1685;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass240_5 == null ? -1 : arg0.aClass240_5.anInt6885;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass240_6 == null ? -1 : arg0.aClass240_6.anInt6909;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass240_6 == null ? -1 : arg0.aClass240_6.anInt6885;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt1687;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt1689;
				}
				anIntArray119[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString11;
				}
				aStringArray6[local27++] = local135;
			}
		}
		anInt1612 = arg0.anInt1690;
		method1474(local12, arg1);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
	public static void method1464() {
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	private static void method1465(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = Static92.method1820(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class240[] local13 = Static110.aClass240ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class240[] local19 = Static122.aClass240ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static110.aClass240ArrayArray1[local9] = new Class240[local22];
			Static474.method3329(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static474.method3329(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!kj;II)V")
	public static void method1466(@OriginalArg(0) Class131 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class4_Sub1_Sub11 local5 = Static127.method2402(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray119 = new int[local5.anInt3234];
		aStringArray6 = new String[local5.anInt3239];
		if (local5.aClass131_4 == Static43.aClass131_2 || local5.aClass131_4 == Static230.aClass131_5 || local5.aClass131_4 == Static35.aClass131_1) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static89.aClass240_7 != null) {
				local30 = Static89.aClass240_7.anInt6862;
				local32 = Static89.aClass240_7.anInt6879;
			}
			anIntArray119[0] = Static329.aClass95_1.method5170() - local30;
			anIntArray119[1] = Static329.aClass95_1.method5175() - local32;
		}
		method1474(local5, 200000);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(IZ)V")
	private static void method1467(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(694) int local694;
		@Pc(89) int local89;
		@Pc(95) int local95;
		@Pc(1378) boolean local1378;
		@Pc(163) String local163;
		@Pc(81) String local81;
		@Pc(75) String local75;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray118[anInt1611++] = Static263.anInt5013;
				return;
			}
			if (arg0 == 5001) {
				anInt1611 -= 3;
				Static263.anInt5013 = anIntArray118[anInt1611];
				Static435.aClass56_4 = Static140.method2578(anIntArray118[anInt1611 + 1]);
				if (Static435.aClass56_4 == null) {
					Static435.aClass56_4 = Static288.aClass56_3;
				}
				Static98.anInt2102 = anIntArray118[anInt1611 + 2];
				Static448.method6134(Static298.aClass212_73);
				Static457.aClass4_Sub20_Sub1_5.method4590(Static263.anInt5013);
				Static457.aClass4_Sub20_Sub1_5.method4590(Static435.aClass56_4.anInt1919);
				Static457.aClass4_Sub20_Sub1_5.method4590(Static98.anInt2102);
				return;
			}
			if (arg0 == 5002) {
				anInt1607 -= 2;
				local75 = aStringArray5[anInt1607];
				local81 = aStringArray5[anInt1607 + 1];
				anInt1611 -= 2;
				local89 = anIntArray118[anInt1611];
				local95 = anIntArray118[anInt1611 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static448.method6134(Static140.aClass212_40);
				Static457.aClass4_Sub20_Sub1_5.method4590(Static316.method4760(local75) + Static316.method4760(local81) + 2);
				Static457.aClass4_Sub20_Sub1_5.method4599(local75);
				Static457.aClass4_Sub20_Sub1_5.method4590(local89 - 1);
				Static457.aClass4_Sub20_Sub1_5.method4590(local95);
				Static457.aClass4_Sub20_Sub1_5.method4599(local81);
				return;
			}
			@Pc(161) Class188 local161;
			if (arg0 == 5003) {
				local157 = anIntArray118[--anInt1611];
				local161 = Static315.method4356(local157);
				local163 = "";
				if (local161 != null && local161.aString45 != null) {
					local163 = local161.aString45;
				}
				aStringArray5[anInt1607++] = local163;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray118[--anInt1611];
				local161 = Static315.method4356(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt5380;
				}
				anIntArray118[anInt1611++] = local89;
				return;
			}
			if (arg0 == 5005) {
				if (Static435.aClass56_4 == null) {
					anIntArray118[anInt1611++] = -1;
					return;
				}
				anIntArray118[anInt1611++] = Static435.aClass56_4.anInt1919;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray5[--anInt1607];
				method1473(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt1607 -= 2;
				local75 = aStringArray5[anInt1607];
				local81 = aStringArray5[anInt1607 + 1];
				if (Static70.anInt1720 != 0 || (!Static238.aBoolean310 || Static53.aBoolean301) && !Static317.aBoolean427) {
					Static448.method6134(Static270.aClass212_80);
					Static457.aClass4_Sub20_Sub1_5.method4590(0);
					local89 = Static457.aClass4_Sub20_Sub1_5.anInt5526;
					Static457.aClass4_Sub20_Sub1_5.method4599(local75);
					Static196.method6081(local81, Static457.aClass4_Sub20_Sub1_5);
					Static457.aClass4_Sub20_Sub1_5.method4567(Static457.aClass4_Sub20_Sub1_5.anInt5526 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray118[--anInt1611];
				local161 = Static315.method4356(local157);
				local163 = "";
				if (local161 != null && local161.aString47 != null) {
					local163 = local161.aString47;
				}
				aStringArray5[anInt1607++] = local163;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray118[--anInt1611];
				local161 = Static315.method4356(local157);
				local163 = "";
				if (local161 != null && local161.aString46 != null) {
					local163 = local161.aString46;
				}
				aStringArray5[anInt1607++] = local163;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray118[--anInt1611];
				local161 = Static315.method4356(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt5379;
				}
				anIntArray118[anInt1611++] = local89;
				return;
			}
			if (arg0 == 5015) {
				if (Static52.aClass11_Sub5_Sub2_Sub1_2 == null || Static52.aClass11_Sub5_Sub2_Sub1_2.aString32 == null) {
					local75 = Static337.aString51;
				} else {
					local75 = Static52.aClass11_Sub5_Sub2_Sub1_2.method3625();
				}
				aStringArray5[anInt1607++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray118[anInt1611++] = Static98.anInt2102;
				return;
			}
			if (arg0 == 5017) {
				anIntArray118[anInt1611++] = Static228.method3889();
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray118[--anInt1611];
				local161 = Static315.method4356(local157);
				local89 = 0;
				if (local161 != null) {
					local89 = local161.anInt5377;
				}
				anIntArray118[anInt1611++] = local89;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray118[--anInt1611];
				local161 = Static315.method4356(local157);
				local163 = "";
				if (local161 != null && local161.aString48 != null) {
					local163 = local161.aString48;
				}
				aStringArray5[anInt1607++] = local163;
				return;
			}
			if (arg0 == 5020) {
				if (Static52.aClass11_Sub5_Sub2_Sub1_2 == null || Static52.aClass11_Sub5_Sub2_Sub1_2.aString32 == null) {
					local75 = Static337.aString51;
				} else {
					local75 = Static52.aClass11_Sub5_Sub2_Sub1_2.method3624();
				}
				aStringArray5[anInt1607++] = local75;
				return;
			}
			if (arg0 == 5023) {
				local157 = anIntArray118[--anInt1611];
				local161 = Static315.method4356(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt5378;
				}
				anIntArray118[anInt1611++] = local89;
				return;
			}
			if (arg0 == 5024) {
				local157 = anIntArray118[--anInt1611];
				local161 = Static315.method4356(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt5376;
				}
				anIntArray118[anInt1611++] = local89;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray118[--anInt1611];
				aStringArray5[anInt1607++] = Static306.aClass19_1.method355(local157).aString49;
				return;
			}
			@Pc(654) Class4_Sub1_Sub14 local654;
			if (arg0 == 5051) {
				local157 = anIntArray118[--anInt1611];
				local654 = Static306.aClass19_1.method355(local157);
				if (local654.anIntArray449 == null) {
					anIntArray118[anInt1611++] = 0;
					return;
				}
				anIntArray118[anInt1611++] = local654.anIntArray449.length;
				return;
			}
			if (arg0 == 5052) {
				anInt1611 -= 2;
				local157 = anIntArray118[anInt1611];
				local694 = anIntArray118[anInt1611 + 1];
				@Pc(699) Class4_Sub1_Sub14 local699 = Static306.aClass19_1.method355(local157);
				local95 = local699.anIntArray449[local694];
				anIntArray118[anInt1611++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray118[--anInt1611];
				local654 = Static306.aClass19_1.method355(local157);
				if (local654.anIntArray448 == null) {
					anIntArray118[anInt1611++] = 0;
					return;
				}
				anIntArray118[anInt1611++] = local654.anIntArray448.length;
				return;
			}
			if (arg0 == 5054) {
				anInt1611 -= 2;
				local157 = anIntArray118[anInt1611];
				local694 = anIntArray118[anInt1611 + 1];
				anIntArray118[anInt1611++] = Static306.aClass19_1.method355(local157).anIntArray448[local694];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray118[--anInt1611];
				aStringArray5[anInt1607++] = Static135.aClass75_2.method2200(local157).method475();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray118[--anInt1611];
				@Pc(825) Class4_Sub1_Sub4 local825 = Static135.aClass75_2.method2200(local157);
				if (local825.anIntArray39 == null) {
					anIntArray118[anInt1611++] = 0;
					return;
				}
				anIntArray118[anInt1611++] = local825.anIntArray39.length;
				return;
			}
			if (arg0 == 5057) {
				anInt1611 -= 2;
				local157 = anIntArray118[anInt1611];
				local694 = anIntArray118[anInt1611 + 1];
				anIntArray118[anInt1611++] = Static135.aClass75_2.method2200(local157).anIntArray39[local694];
				return;
			}
			if (arg0 == 5058) {
				aClass187_1 = new Class187();
				aClass187_1.anInt5359 = anIntArray118[--anInt1611];
				aClass187_1.aClass4_Sub1_Sub4_1 = Static135.aClass75_2.method2200(aClass187_1.anInt5359);
				aClass187_1.anIntArray438 = new int[aClass187_1.aClass4_Sub1_Sub4_1.method474()];
				return;
			}
			if (arg0 == 5059) {
				Static448.method6134(Static31.aClass212_8);
				Static457.aClass4_Sub20_Sub1_5.method4590(0);
				local157 = Static457.aClass4_Sub20_Sub1_5.anInt5526;
				Static457.aClass4_Sub20_Sub1_5.method4590(0);
				Static457.aClass4_Sub20_Sub1_5.method4558(aClass187_1.anInt5359);
				aClass187_1.aClass4_Sub1_Sub4_1.method469(Static457.aClass4_Sub20_Sub1_5, aClass187_1.anIntArray438);
				Static457.aClass4_Sub20_Sub1_5.method4567(Static457.aClass4_Sub20_Sub1_5.anInt5526 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray5[--anInt1607];
				Static448.method6134(Static306.aClass212_76);
				Static457.aClass4_Sub20_Sub1_5.method4590(0);
				local694 = Static457.aClass4_Sub20_Sub1_5.anInt5526;
				Static457.aClass4_Sub20_Sub1_5.method4599(local75);
				Static457.aClass4_Sub20_Sub1_5.method4558(aClass187_1.anInt5359);
				aClass187_1.aClass4_Sub1_Sub4_1.method469(Static457.aClass4_Sub20_Sub1_5, aClass187_1.anIntArray438);
				Static457.aClass4_Sub20_Sub1_5.method4567(Static457.aClass4_Sub20_Sub1_5.anInt5526 - local694);
				return;
			}
			if (arg0 == 5061) {
				Static448.method6134(Static31.aClass212_8);
				Static457.aClass4_Sub20_Sub1_5.method4590(0);
				local157 = Static457.aClass4_Sub20_Sub1_5.anInt5526;
				Static457.aClass4_Sub20_Sub1_5.method4590(1);
				Static457.aClass4_Sub20_Sub1_5.method4558(aClass187_1.anInt5359);
				aClass187_1.aClass4_Sub1_Sub4_1.method469(Static457.aClass4_Sub20_Sub1_5, aClass187_1.anIntArray438);
				Static457.aClass4_Sub20_Sub1_5.method4567(Static457.aClass4_Sub20_Sub1_5.anInt5526 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt1611 -= 2;
				local157 = anIntArray118[anInt1611];
				local694 = anIntArray118[anInt1611 + 1];
				anIntArray118[anInt1611++] = Static306.aClass19_1.method355(local157).aCharArray5[local694];
				return;
			}
			if (arg0 == 5063) {
				anInt1611 -= 2;
				local157 = anIntArray118[anInt1611];
				local694 = anIntArray118[anInt1611 + 1];
				anIntArray118[anInt1611++] = Static306.aClass19_1.method355(local157).aCharArray4[local694];
				return;
			}
			if (arg0 == 5064) {
				anInt1611 -= 2;
				local157 = anIntArray118[anInt1611];
				local694 = anIntArray118[anInt1611 + 1];
				if (local694 == -1) {
					anIntArray118[anInt1611++] = -1;
					return;
				}
				anIntArray118[anInt1611++] = Static306.aClass19_1.method355(local157).method4541((char) local694);
				return;
			}
			if (arg0 == 5065) {
				anInt1611 -= 2;
				local157 = anIntArray118[anInt1611];
				local694 = anIntArray118[anInt1611 + 1];
				if (local694 == -1) {
					anIntArray118[anInt1611++] = -1;
					return;
				}
				anIntArray118[anInt1611++] = Static306.aClass19_1.method355(local157).method4548((char) local694);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray118[--anInt1611];
				anIntArray118[anInt1611++] = Static135.aClass75_2.method2200(local157).method474();
				return;
			}
			if (arg0 == 5067) {
				anInt1611 -= 2;
				local157 = anIntArray118[anInt1611];
				local694 = anIntArray118[anInt1611 + 1];
				local89 = Static135.aClass75_2.method2200(local157).method476(local694).anInt7574;
				anIntArray118[anInt1611++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt1611 -= 2;
				local157 = anIntArray118[anInt1611];
				local694 = anIntArray118[anInt1611 + 1];
				aClass187_1.anIntArray438[local157] = local694;
				return;
			}
			if (arg0 == 5069) {
				anInt1611 -= 2;
				local157 = anIntArray118[anInt1611];
				local694 = anIntArray118[anInt1611 + 1];
				aClass187_1.anIntArray438[local157] = local694;
				return;
			}
			if (arg0 == 5070) {
				anInt1611 -= 3;
				local157 = anIntArray118[anInt1611];
				local694 = anIntArray118[anInt1611 + 1];
				local89 = anIntArray118[anInt1611 + 2];
				@Pc(1330) Class4_Sub1_Sub4 local1330 = Static135.aClass75_2.method2200(local157);
				if (local1330.method476(local694).anInt7574 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray118[anInt1611++] = local1330.method470(local89, local694);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray5[--anInt1607];
				local1378 = anIntArray118[--anInt1611] == 1;
				Static98.method1861(local1378, local75);
				anIntArray118[anInt1611++] = Static412.anInt7173;
				return;
			}
			if (arg0 == 5072) {
				if (Static148.aShortArray90 != null && Static253.anInt4882 < Static412.anInt7173) {
					anIntArray118[anInt1611++] = Static148.aShortArray90[Static253.anInt4882++] & 0xFFFF;
					return;
				}
				anIntArray118[anInt1611++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static253.anInt4882 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static448.method6134(Static31.aClass212_8);
				Static457.aClass4_Sub20_Sub1_5.method4590(0);
				local157 = Static457.aClass4_Sub20_Sub1_5.anInt5526;
				Static457.aClass4_Sub20_Sub1_5.method4590(2);
				Static457.aClass4_Sub20_Sub1_5.method4558(aClass187_1.anInt5359);
				aClass187_1.aClass4_Sub1_Sub4_1.method469(Static457.aClass4_Sub20_Sub1_5, aClass187_1.anIntArray438);
				Static457.aClass4_Sub20_Sub1_5.method4567(Static457.aClass4_Sub20_Sub1_5.anInt5526 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static115.aClass173_1.method4895(86)) {
					anIntArray118[anInt1611++] = 1;
					return;
				}
				anIntArray118[anInt1611++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static115.aClass173_1.method4895(82)) {
					anIntArray118[anInt1611++] = 1;
					return;
				}
				anIntArray118[anInt1611++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static115.aClass173_1.method4895(81)) {
					anIntArray118[anInt1611++] = 1;
					return;
				}
				anIntArray118[anInt1611++] = 0;
				return;
			}
		} else {
			@Pc(2756) int local2756;
			@Pc(2030) boolean local2030;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static394.method5559(anIntArray118[--anInt1611]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray118[anInt1611++] = Static141.method6324();
					return;
				}
				if (arg0 == 5205) {
					Static118.method2250(anIntArray118[--anInt1611], -1, false, -1);
					return;
				}
				@Pc(1619) Class4_Sub1_Sub18 local1619;
				if (arg0 == 5206) {
					local157 = anIntArray118[--anInt1611];
					local1619 = Static425.method3278(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1619 == null) {
						anIntArray118[anInt1611++] = -1;
						return;
					}
					anIntArray118[anInt1611++] = local1619.anInt6952;
					return;
				}
				@Pc(1652) Class4_Sub1_Sub18 local1652;
				if (arg0 == 5207) {
					local1652 = Static425.method3275(anIntArray118[--anInt1611]);
					if (local1652 != null && local1652.aString65 != null) {
						aStringArray5[anInt1607++] = local1652.aString65;
						return;
					}
					aStringArray5[anInt1607++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray118[anInt1611++] = Static399.anInt7065;
					anIntArray118[anInt1611++] = Static421.anInt7288;
					return;
				}
				if (arg0 == 5209) {
					anIntArray118[anInt1611++] = Static97.anInt2096 + Static425.anInt3657;
					anIntArray118[anInt1611++] = Static241.anInt4715 + Static425.anInt3658;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray118[--anInt1611];
					local1619 = Static425.method3275(local157);
					if (local1619 == null) {
						anIntArray118[anInt1611++] = 0;
						anIntArray118[anInt1611++] = 0;
						return;
					}
					anIntArray118[anInt1611++] = local1619.anInt6946 >> 14 & 0x3FFF;
					anIntArray118[anInt1611++] = local1619.anInt6946 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray118[--anInt1611];
					local1619 = Static425.method3275(local157);
					if (local1619 == null) {
						anIntArray118[anInt1611++] = 0;
						anIntArray118[anInt1611++] = 0;
						return;
					}
					anIntArray118[anInt1611++] = local1619.anInt6942 - local1619.anInt6954;
					anIntArray118[anInt1611++] = local1619.anInt6949 - local1619.anInt6945;
					return;
				}
				@Pc(1842) Class4_Sub4 local1842;
				if (arg0 == 5212) {
					local1842 = Static258.method3305();
					if (local1842 == null) {
						anIntArray118[anInt1611++] = -1;
						anIntArray118[anInt1611++] = -1;
						return;
					}
					anIntArray118[anInt1611++] = local1842.anInt366;
					local694 = local1842.anInt363 << 28 | local1842.anInt359 + Static425.anInt3657 << 14 | local1842.anInt364 + Static425.anInt3658;
					anIntArray118[anInt1611++] = local694;
					return;
				}
				if (arg0 == 5213) {
					local1842 = Static62.method1454();
					if (local1842 == null) {
						anIntArray118[anInt1611++] = -1;
						anIntArray118[anInt1611++] = -1;
						return;
					}
					anIntArray118[anInt1611++] = local1842.anInt366;
					local694 = local1842.anInt363 << 28 | local1842.anInt359 + Static425.anInt3657 << 14 | local1842.anInt364 + Static425.anInt3658;
					anIntArray118[anInt1611++] = local694;
					return;
				}
				@Pc(1990) boolean local1990;
				if (arg0 == 5214) {
					local157 = anIntArray118[--anInt1611];
					local1619 = Static290.method4476();
					if (local1619 != null) {
						local1990 = local1619.method5560(local157 >> 28 & 0x3, local157 & 0x3FFF, anIntArray120, local157 >> 14 & 0x3FFF);
						if (local1990) {
							Static37.method722(anIntArray120[1], anIntArray120[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt1611 -= 2;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					@Pc(2028) Class252 local2028 = Static425.method3280(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local2030 = false;
					for (@Pc(2035) Class4_Sub1_Sub18 local2035 = (Class4_Sub1_Sub18) local2028.method5697(); local2035 != null; local2035 = (Class4_Sub1_Sub18) local2028.method5700()) {
						if (local2035.anInt6952 == local694) {
							local2030 = true;
							break;
						}
					}
					if (local2030) {
						anIntArray118[anInt1611++] = 1;
						return;
					}
					anIntArray118[anInt1611++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray118[--anInt1611];
					local1619 = Static425.method3275(local157);
					if (local1619 == null) {
						anIntArray118[anInt1611++] = -1;
						return;
					}
					anIntArray118[anInt1611++] = local1619.anInt6944;
					return;
				}
				if (arg0 == 5220) {
					anIntArray118[anInt1611++] = Static165.anInt3267 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray118[--anInt1611];
					Static37.method722(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1652 = Static290.method4476();
					if (local1652 != null) {
						local1378 = local1652.method5563(anIntArray120, Static97.anInt2096 + Static425.anInt3657, Static241.anInt4715 + Static425.anInt3658);
						if (local1378) {
							anIntArray118[anInt1611++] = anIntArray120[1];
							anIntArray118[anInt1611++] = anIntArray120[2];
							return;
						}
						anIntArray118[anInt1611++] = -1;
						anIntArray118[anInt1611++] = -1;
						return;
					}
					anIntArray118[anInt1611++] = -1;
					anIntArray118[anInt1611++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt1611 -= 2;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					Static118.method2250(local157, local694 >> 14 & 0x3FFF, false, local694 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray118[--anInt1611];
					local1619 = Static290.method4476();
					if (local1619 != null) {
						local1990 = local1619.method5560(local157 >> 28 & 0x3, local157 & 0x3FFF, anIntArray120, local157 >> 14 & 0x3FFF);
						if (local1990) {
							anIntArray118[anInt1611++] = anIntArray120[1];
							anIntArray118[anInt1611++] = anIntArray120[2];
							return;
						}
						anIntArray118[anInt1611++] = -1;
						anIntArray118[anInt1611++] = -1;
						return;
					}
					anIntArray118[anInt1611++] = -1;
					anIntArray118[anInt1611++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray118[--anInt1611];
					local1619 = Static290.method4476();
					if (local1619 != null) {
						local1990 = local1619.method5563(anIntArray120, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1990) {
							anIntArray118[anInt1611++] = anIntArray120[1];
							anIntArray118[anInt1611++] = anIntArray120[2];
							return;
						}
						anIntArray118[anInt1611++] = -1;
						anIntArray118[anInt1611++] = -1;
						return;
					}
					anIntArray118[anInt1611++] = -1;
					anIntArray118[anInt1611++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static353.method5120(anIntArray118[--anInt1611]);
					return;
				}
				if (arg0 == 5227) {
					anInt1611 -= 2;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					Static118.method2250(local157, local694 >> 14 & 0x3FFF, true, local694 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static116.aBoolean168 = anIntArray118[--anInt1611] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray118[anInt1611++] = Static116.aBoolean168 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray118[--anInt1611];
					Static307.method5980(local157);
					return;
				}
				@Pc(2548) Class4 local2548;
				if (arg0 == 5231) {
					anInt1611 -= 2;
					local157 = anIntArray118[anInt1611];
					local1378 = anIntArray118[anInt1611 + 1] == 1;
					if (Static138.aClass96_16 != null) {
						local2548 = Static138.aClass96_16.method2797((long) local157);
						if (local2548 != null && !local1378) {
							local2548.method6330();
							return;
						}
						if (local2548 == null && local1378) {
							local2548 = new Class4();
							Static138.aClass96_16.method2805((long) local157, local2548);
						}
					}
					return;
				}
				@Pc(2590) Class4 local2590;
				if (arg0 == 5232) {
					local157 = anIntArray118[--anInt1611];
					if (Static138.aClass96_16 != null) {
						local2590 = Static138.aClass96_16.method2797((long) local157);
						anIntArray118[anInt1611++] = local2590 == null ? 0 : 1;
						return;
					}
					anIntArray118[anInt1611++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt1611 -= 2;
					local157 = anIntArray118[anInt1611];
					local1378 = anIntArray118[anInt1611 + 1] == 1;
					if (Static153.aClass96_20 != null) {
						local2548 = Static153.aClass96_20.method2797((long) local157);
						if (local2548 != null && !local1378) {
							local2548.method6330();
							return;
						}
						if (local2548 == null && local1378) {
							local2548 = new Class4();
							Static153.aClass96_20.method2805((long) local157, local2548);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray118[--anInt1611];
					if (Static153.aClass96_20 != null) {
						local2590 = Static153.aClass96_20.method2797((long) local157);
						anIntArray118[anInt1611++] = local2590 == null ? 0 : 1;
						return;
					}
					anIntArray118[anInt1611++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray118[anInt1611++] = Static425.aClass4_Sub1_Sub18_3 == null ? -1 : Static425.aClass4_Sub1_Sub18_3.anInt6952;
					return;
				}
				if (arg0 == 5236) {
					anInt1611 -= 2;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					local89 = local694 >> 14 & 0x3FFF;
					local95 = local694 & 0x3FFF;
					local2756 = Static91.method1814(local157, local89, local95);
					if (local2756 < 0) {
						anIntArray118[anInt1611++] = -1;
						return;
					}
					anIntArray118[anInt1611++] = local2756;
					return;
				}
				if (arg0 == 5237) {
					Static52.method1153();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt1611 -= 2;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					Static77.method1652(local157, local694, 3, false);
					anIntArray118[anInt1611++] = Static124.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static124.aFrame2 != null) {
						Static77.method1652(-1, -1, Static157.aClass185_Sub1_1.anInt5573, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2840) Class261[] local2840 = Static354.method5122();
					anIntArray118[anInt1611++] = local2840.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray118[--anInt1611];
					@Pc(2864) Class261[] local2864 = Static354.method5122();
					anIntArray118[anInt1611++] = local2864[local157].anInt7470;
					anIntArray118[anInt1611++] = local2864[local157].anInt7469;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static157.aClass185_Sub1_1.anInt5574;
					local694 = Static157.aClass185_Sub1_1.anInt5575;
					local89 = -1;
					@Pc(2901) Class261[] local2901 = Static354.method5122();
					for (local2756 = 0; local2756 < local2901.length; local2756++) {
						@Pc(2908) Class261 local2908 = local2901[local2756];
						if (local2908.anInt7470 == local157 && local2908.anInt7469 == local694) {
							local89 = local2756;
							break;
						}
					}
					anIntArray118[anInt1611++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray118[anInt1611++] = Static331.method4891();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray118[--anInt1611];
					if (local157 >= 1 && local157 <= 2) {
						Static77.method1652(-1, -1, local157, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.anInt5573;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray118[--anInt1611];
					if (local157 >= 1 && local157 <= 2) {
						Static157.aClass185_Sub1_1.anInt5573 = local157;
						Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt1607 -= 2;
					local75 = aStringArray5[anInt1607];
					local81 = aStringArray5[anInt1607 + 1];
					local89 = anIntArray118[--anInt1611];
					Static448.method6134(Static136.aClass212_36);
					Static457.aClass4_Sub20_Sub1_5.method4590(Static316.method4760(local75) + Static316.method4760(local81) + 1);
					Static457.aClass4_Sub20_Sub1_5.method4599(local75);
					Static457.aClass4_Sub20_Sub1_5.method4599(local81);
					Static457.aClass4_Sub20_Sub1_5.method4590(local89);
					return;
				}
				if (arg0 == 5401) {
					anInt1611 -= 2;
					Static268.aShortArray86[anIntArray118[anInt1611]] = (short) Static9.method160(anIntArray118[anInt1611 + 1]);
					Static139.aClass193_1.method4654();
					Static139.aClass193_1.method4649();
					Static220.aClass247_1.method5661();
					Static208.method3674();
					return;
				}
				if (arg0 == 5405) {
					anInt1611 -= 2;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					if (local157 >= 0 && local157 < 2) {
						Static353.anIntArrayArrayArray10[local157] = new int[local694 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt1611 -= 7;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1] << 1;
					local89 = anIntArray118[anInt1611 + 2];
					local95 = anIntArray118[anInt1611 + 3];
					local2756 = anIntArray118[anInt1611 + 4];
					@Pc(3176) int local3176 = anIntArray118[anInt1611 + 5];
					@Pc(3182) int local3182 = anIntArray118[anInt1611 + 6];
					if (local157 >= 0 && local157 < 2 && Static353.anIntArrayArrayArray10[local157] != null && local694 >= 0 && local694 < Static353.anIntArrayArrayArray10[local157].length) {
						Static353.anIntArrayArrayArray10[local157][local694] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3182 };
						Static353.anIntArrayArrayArray10[local157][local694 + 1] = new int[] { (local2756 >> 14 & 0x3FFF) << 7, local3176, (local2756 & 0x3FFF) << 7 };
					}
					return;
				}
				if (arg0 == 5407) {
					local157 = Static353.anIntArrayArrayArray10[anIntArray118[--anInt1611]].length >> 1;
					anIntArray118[anInt1611++] = local157;
					return;
				}
				if (arg0 == 5411) {
					if (Static124.aFrame2 != null) {
						Static77.method1652(-1, -1, Static157.aClass185_Sub1_1.anInt5573, false);
					}
					if (Static97.aFrame1 != null) {
						Static386.method6045();
						System.exit(0);
						return;
					}
					local75 = Static57.aString10 == null ? Static179.method3296() : Static57.aString10;
					Static45.method930(local75, false, Static390.aClass255_5, Static192.anInt3828 == 1);
					return;
				}
				if (arg0 == 5419) {
					local75 = "";
					if (Static177.aClass87_4 != null) {
						if (Static177.aClass87_4.anObject3 == null) {
							local75 = Static8.method76(Static177.aClass87_4.anInt2677);
						} else {
							local75 = (String) Static177.aClass87_4.anObject3;
						}
					}
					aStringArray5[anInt1607++] = local75;
					return;
				}
				if (arg0 == 5420) {
					anIntArray118[anInt1611++] = Static419.anInt7272 == 3 ? 1 : 0;
					return;
				}
				if (arg0 == 5421) {
					if (Static124.aFrame2 != null) {
						Static77.method1652(-1, -1, Static157.aClass185_Sub1_1.anInt5573, false);
					}
					local75 = aStringArray5[--anInt1607];
					local1378 = anIntArray118[--anInt1611] == 1;
					local163 = Static179.method3296() + local75;
					Static45.method930(local163, local1378, Static390.aClass255_5, Static192.anInt3828 == 1);
					return;
				}
				if (arg0 == 5422) {
					anInt1607 -= 2;
					local75 = aStringArray5[anInt1607];
					local81 = aStringArray5[anInt1607 + 1];
					local89 = anIntArray118[--anInt1611];
					if (local75.length() > 0) {
						if (Static228.aStringArray21 == null) {
							Static228.aStringArray21 = new String[Static456.anIntArray621[Static332.aClass235_6.anInt6654]];
						}
						Static228.aStringArray21[local89] = local75;
					}
					if (local81.length() > 0) {
						if (Static255.aStringArray24 == null) {
							Static255.aStringArray24 = new String[Static456.anIntArray621[Static332.aClass235_6.anInt6654]];
						}
						Static255.aStringArray24[local89] = local81;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray5[--anInt1607]);
					return;
				}
				if (arg0 == 5424) {
					anInt1611 -= 11;
					Static162.anInt1714 = anIntArray118[anInt1611];
					Static68.anInt1676 = anIntArray118[anInt1611 + 1];
					Static334.anInt5864 = anIntArray118[anInt1611 + 2];
					Static229.anInt4567 = anIntArray118[anInt1611 + 3];
					Static236.anInt4669 = anIntArray118[anInt1611 + 4];
					Static256.anInt4943 = anIntArray118[anInt1611 + 5];
					Static207.anInt4223 = anIntArray118[anInt1611 + 6];
					Static364.anInt6346 = anIntArray118[anInt1611 + 7];
					Static382.anInt3953 = anIntArray118[anInt1611 + 8];
					Static133.anInt2730 = anIntArray118[anInt1611 + 9];
					Static224.anInt4457 = anIntArray118[anInt1611 + 10];
					Static143.aClass38_30.method1037(Static236.anInt4669);
					Static143.aClass38_30.method1037(Static256.anInt4943);
					Static143.aClass38_30.method1037(Static207.anInt4223);
					Static143.aClass38_30.method1037(Static364.anInt6346);
					Static143.aClass38_30.method1037(Static382.anInt3953);
					Static388.aClass2_25 = null;
					Static114.aClass2_12 = null;
					Static140.aClass2_14 = null;
					Static65.aClass2_8 = null;
					Static455.aClass2_28 = null;
					Static242.aClass2_24 = null;
					Static450.aClass2_18 = null;
					Static163.aClass2_29 = null;
					Static314.aBoolean588 = true;
					return;
				}
				if (arg0 == 5425) {
					Static338.method4977();
					Static314.aBoolean588 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt1611 -= 2;
					Static5.anInt66 = anIntArray118[anInt1611];
					Static51.anInt1208 = anIntArray118[anInt1611 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt1611 -= 2;
					Static268.anInt5105 = anIntArray118[anInt1611 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt1611 -= 2;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					anIntArray118[anInt1611++] = Static160.method2903(local157, local694) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static222.method3822(aStringArray5[--anInt1607], false, false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static476.method5363(Static390.aClass255_5.anApplet1, "accountcreated");
						return;
					} catch (@Pc(3711) Throwable local3711) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static476.method5363(Static390.aClass255_5.anApplet1, "accountcreatestarted");
						return;
					} catch (@Pc(3723) Throwable local3723) {
						return;
					}
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt1611 -= 4;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					local89 = anIntArray118[anInt1611 + 2];
					local95 = anIntArray118[anInt1611 + 3];
					Static23.method363(local89, (local157 >> 14 & 0x3FFF) - Static426.anInt7325, local95, false, local694, (local157 & 0x3FFF) - Static72.anInt1776);
					return;
				}
				if (arg0 == 5501) {
					anInt1611 -= 4;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					local89 = anIntArray118[anInt1611 + 2];
					local95 = anIntArray118[anInt1611 + 3];
					Static24.method364(local694, (local157 & 0x3FFF) - Static72.anInt1776, (local157 >> 14 & 0x3FFF) - Static426.anInt7325, local95, local89);
					return;
				}
				if (arg0 == 5502) {
					anInt1611 -= 6;
					local157 = anIntArray118[anInt1611];
					if (local157 >= 2) {
						throw new RuntimeException();
					}
					Static148.anInt6290 = local157;
					local694 = anIntArray118[anInt1611 + 1];
					if (local694 + 1 >= Static353.anIntArrayArrayArray10[Static148.anInt6290].length >> 1) {
						throw new RuntimeException();
					}
					Static198.anInt3926 = local694;
					Static370.anInt6428 = 0;
					Static451.anInt7735 = anIntArray118[anInt1611 + 2];
					Static354.anInt6241 = anIntArray118[anInt1611 + 3];
					local89 = anIntArray118[anInt1611 + 4];
					if (local89 >= 2) {
						throw new RuntimeException();
					}
					Static418.anInt3024 = local89;
					local95 = anIntArray118[anInt1611 + 5];
					if (local95 + 1 >= Static353.anIntArrayArrayArray10[Static418.anInt3024].length >> 1) {
						throw new RuntimeException();
					}
					Static111.anInt2419 = local95;
					Static275.anInt5173 = 3;
					return;
				}
				if (arg0 == 5503) {
					Static435.method5992();
					return;
				}
				if (arg0 == 5504) {
					anInt1611 -= 2;
					Static171.method3019(anIntArray118[anInt1611], anIntArray118[anInt1611 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray118[anInt1611++] = (int) Static43.aFloat26 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray118[anInt1611++] = (int) Static322.aFloat82 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static327.method4867();
					return;
				}
				if (arg0 == 5508) {
					Static188.method3407();
					return;
				}
				if (arg0 == 5509) {
					Static379.method5370();
					return;
				}
				if (arg0 == 5510) {
					Static331.method4890();
					return;
				}
				if (arg0 == 5511) {
					local157 = anIntArray118[--anInt1611];
					local694 = local157 >> 14 & 0x3FFF;
					local89 = local157 & 0x3FFF;
					local694 -= Static426.anInt7325;
					if (local694 < 0) {
						local694 = 0;
					} else if (local694 >= Static193.anInt3853) {
						local694 = Static193.anInt3853;
					}
					local89 -= Static72.anInt1776;
					if (local89 < 0) {
						local89 = 0;
					} else if (local89 >= Static301.anInt5585) {
						local89 = Static301.anInt5585;
					}
					Static3.anInt1340 = (local694 << 7) + 64;
					Static373.anInt6559 = (local89 << 7) + 64;
					Static275.anInt5173 = 4;
					return;
				}
				if (arg0 == 5512) {
					Static199.method178();
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt1607 -= 2;
					local75 = aStringArray5[anInt1607];
					local81 = aStringArray5[anInt1607 + 1];
					local89 = anIntArray118[--anInt1611];
					if (Static70.anInt1726 != 2) {
						return;
					}
					if (Static427.anInt7334 == 0 && Static328.anInt5873 == 0) {
						Static337.aString51 = local75;
						Static410.aString67 = local81;
						Static67.anInt1640 = local89;
						Static382.method3540(5);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static228.method3891();
					return;
				}
				if (arg0 == 5602) {
					if (Static427.anInt7334 == 0) {
						Static465.anInt7963 = -2;
						Static22.anInt424 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt1611 -= 4;
					if (Static70.anInt1726 != 2) {
						return;
					}
					if (Static427.anInt7334 == 0 && Static328.anInt5873 == 0) {
						Static457.method6212(anIntArray118[anInt1611 + 3], anIntArray118[anInt1611], anIntArray118[anInt1611 + 1], anIntArray118[anInt1611 + 2]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt1607--;
					if (Static70.anInt1726 != 2) {
						return;
					}
					if (Static427.anInt7334 == 0 && Static328.anInt5873 == 0) {
						Static77.method1649(Static234.method3954(aStringArray5[anInt1607]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt1607 -= 2;
					if (Static70.anInt1726 != 2) {
						return;
					}
					if (Static427.anInt7334 == 0 && Static328.anInt5873 == 0) {
						Static249.method4102(aStringArray5[anInt1607 + 1], false, Static234.method3954(aStringArray5[anInt1607]));
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static328.anInt5873 == 0) {
						Static266.anInt5058 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray118[anInt1611++] = Static22.anInt424;
					return;
				}
				if (arg0 == 5608) {
					anIntArray118[anInt1611++] = Static388.anInt4888;
					return;
				}
				if (arg0 == 5609) {
					anIntArray118[anInt1611++] = Static266.anInt5058;
					return;
				}
				if (arg0 == 5610) {
					for (local157 = 0; local157 < 5; local157++) {
						aStringArray5[anInt1607++] = Static208.aStringArray18.length > local157 ? Static451.method6167(Static208.aStringArray18[local157]) : "";
					}
					Static208.aStringArray18 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray118[anInt1611++] = Static353.anInt6235;
					return;
				}
				if (arg0 == 5612) {
					local157 = anIntArray118[--anInt1611];
					if (Static70.anInt1726 != 6) {
						return;
					}
					if (Static427.anInt7334 == 0 && Static328.anInt5873 == 0) {
						if (Static172.aClass13_1 != null) {
							Static172.aClass13_1.method172();
							Static172.aClass13_1 = null;
						}
						Static67.anInt1640 = local157;
						Static382.method3540(8);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray118[anInt1611++] = Static22.anInt424;
					return;
				}
				if (arg0 == 5615) {
					anInt1607 -= 2;
					local75 = aStringArray5[anInt1607];
					local81 = aStringArray5[anInt1607 + 1];
					if (Static70.anInt1726 != 2) {
						return;
					}
					if (Static427.anInt7334 == 0 && Static328.anInt5873 == 0) {
						if (Static172.aClass13_1 != null) {
							Static172.aClass13_1.method172();
							Static172.aClass13_1 = null;
						}
						Static337.aString51 = local75;
						Static410.aString67 = local81;
						Static382.method3540(4);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static91.method1815(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray118[anInt1611++] = Static465.anInt7963;
					return;
				}
				if (arg0 == 5618) {
					local157 = anIntArray118[--anInt1611];
					Static316.method4763(local157, false);
					return;
				}
				if (arg0 == 5619) {
					local157 = anIntArray118[--anInt1611];
					Static316.method4763(local157, true);
					return;
				}
				if (arg0 == 5620) {
					Static177.method3242();
					if (Static235.aString41 != "" && Static235.aString41 != "") {
						anIntArray118[anInt1611++] = 1;
						return;
					}
					anIntArray118[anInt1611++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt1607 -= 2;
					if (Static70.anInt1726 != 2) {
						return;
					}
					if (Static427.anInt7334 == 0 && Static328.anInt5873 == 0) {
						Static249.method4102(aStringArray5[anInt1607 + 1], true, Static234.method3954(aStringArray5[anInt1607]));
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4513) Class87 local4513 = Static390.aClass255_5.method5847("3", false);
					while (local4513.anInt2679 == 0) {
						Static77.method1653(1L);
					}
					if (local4513.anInt2679 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4533) Class137 local4533 = (Class137) local4513.anObject3;
					if (local4533.method3707().exists()) {
						@Pc(4543) Class4_Sub20 local4543 = new Class4_Sub20(50);
						try {
							local4533.method3706(local4543.aByteArray77, 50, 0);
						} catch (@Pc(4552) IOException local4552) {
						}
					}
					try {
						local4533.method3708();
						return;
					} catch (@Pc(4558) Exception local4558) {
						return;
					}
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local157 = anIntArray118[--anInt1611];
					if (local157 < 1) {
						local157 = 1;
					}
					if (local157 > 4) {
						local157 = 4;
					}
					Static157.aClass185_Sub1_1.anInt5565 = local157;
					Static461.method4588();
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6002) {
					Static157.aClass185_Sub1_1.method4634(anIntArray118[--anInt1611] == 1);
					Static461.method4588();
					Static396.method5596();
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6003) {
					Static157.aClass185_Sub1_1.aBoolean410 = anIntArray118[--anInt1611] == 1;
					Static396.method5596();
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6005) {
					Static157.aClass185_Sub1_1.aBoolean400 = anIntArray118[--anInt1611] == 1;
					Static461.method4588();
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6006) {
					Static157.aClass185_Sub1_1.aBoolean406 = anIntArray118[--anInt1611] == 1;
					Static30.aClass30_3.method2068(!Static157.aClass185_Sub1_1.aBoolean406);
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6007) {
					Static157.aClass185_Sub1_1.anInt5571 = anIntArray118[--anInt1611];
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6008) {
					Static157.aClass185_Sub1_1.aBoolean402 = anIntArray118[--anInt1611] == 1;
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6009) {
					Static157.aClass185_Sub1_1.aBoolean404 = anIntArray118[--anInt1611] == 1;
					Static461.method4588();
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6010) {
					Static157.aClass185_Sub1_1.aBoolean395 = anIntArray118[--anInt1611] == 1;
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6011) {
					local157 = anIntArray118[--anInt1611];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static157.aClass185_Sub1_1.method4629(local157, Static192.anInt3828);
					Static461.method4588();
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6012) {
					Static157.aClass185_Sub1_1.method4631(Static192.anInt3828, anIntArray118[--anInt1611] == 1);
					Static136.method2531();
					Static94.method1834();
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6014) {
					Static157.aClass185_Sub1_1.aBoolean397 = anIntArray118[--anInt1611] == 1;
					Static461.method4588();
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6015) {
					Static157.aClass185_Sub1_1.aBoolean398 = anIntArray118[--anInt1611] == 1;
					Static461.method4588();
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6016) {
					local157 = anIntArray118[--anInt1611];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static157.aClass185_Sub1_1.anInt5572 = local157;
					Static391.method5496(Static192.anInt3828);
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					return;
				}
				if (arg0 == 6017) {
					Static157.aClass185_Sub1_1.aBoolean408 = anIntArray118[--anInt1611] == 1;
					Static416.method5810();
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6018) {
					local157 = anIntArray118[--anInt1611];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static157.aClass185_Sub1_1.anInt5554 = local157;
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6019) {
					local157 = anIntArray118[--anInt1611];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 255) {
						local157 = 255;
					}
					if (local157 != Static157.aClass185_Sub1_1.anInt5567) {
						if (Static157.aClass185_Sub1_1.anInt5567 == 0 && Static305.anInt5655 != -1) {
							Static1.method2(local157, Static305.anInt5655, Static296.aClass38_80);
							Static351.aBoolean462 = false;
						} else if (local157 == 0) {
							Static449.method6144();
							Static351.aBoolean462 = false;
						} else {
							Static303.method4677(local157);
						}
						Static157.aClass185_Sub1_1.anInt5567 = local157;
					}
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6020) {
					local157 = anIntArray118[--anInt1611];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static157.aClass185_Sub1_1.anInt5555 = local157;
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6021) {
					Static157.aClass185_Sub1_1.aBoolean411 = anIntArray118[--anInt1611] == 1;
					Static396.method5596();
					return;
				}
				if (arg0 == 6023) {
					local157 = anIntArray118[--anInt1611];
					local1378 = false;
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 2) {
						local157 = 2;
					}
					if (Static263.anInt5007 < 96) {
						local157 = 0;
						local1378 = true;
					}
					Static49.method1089(local157);
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					anIntArray118[anInt1611++] = local1378 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local157 = anIntArray118[--anInt1611];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static157.aClass185_Sub1_1.anInt5563 = local157;
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					return;
				}
				if (arg0 == 6025) {
					local157 = anIntArray118[--anInt1611];
					if (local157 < 0 || local157 > Static109.method2170(Static263.anInt5007)) {
						local157 = 0;
					}
					Static157.aClass185_Sub1_1.anInt5564 = local157;
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6027) {
					local157 = anIntArray118[--anInt1611];
					if (local157 < 0 || local157 > 1) {
						local157 = 0;
					}
					Static80.method1689(local157 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static157.aClass185_Sub1_1.aBoolean403 = anIntArray118[--anInt1611] != 0;
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					return;
				}
				if (arg0 == 6029) {
					Static157.aClass185_Sub1_1.anInt5571 = anIntArray118[--anInt1611];
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					return;
				}
				if (arg0 == 6030) {
					Static157.aClass185_Sub1_1.aBoolean407 = anIntArray118[--anInt1611] != 0;
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static461.method4588();
					return;
				}
				if (arg0 == 6031) {
					local157 = anIntArray118[--anInt1611];
					if (local157 < 0 || local157 > 3) {
						local157 = 2;
					}
					Static391.method5496(local157);
					return;
				}
				if (arg0 == 6032) {
					local157 = anIntArray118[--anInt1611];
					if (local157 < 0 || local157 > 3) {
						local157 = 2;
					}
					Static157.aClass185_Sub1_1.anInt5557 = local157;
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6033) {
					local157 = anIntArray118[--anInt1611];
					if (local157 < 0 || local157 > 4) {
						local157 = 2;
					}
					Static157.aClass185_Sub1_1.anInt5562 = local157;
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					return;
				}
				if (arg0 == 6034) {
					Static157.aClass185_Sub1_1.aBoolean405 = anIntArray118[--anInt1611] == 1;
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static136.method2531();
					Static316.aBoolean426 = false;
					return;
				}
				if (arg0 == 6035) {
					Static157.aClass185_Sub1_1.aBoolean412 = anIntArray118[--anInt1611] == 1;
					Static461.method4588();
					Static396.method5596();
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.anInt5565;
					return;
				}
				if (arg0 == 6102) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.method4636(Static192.anInt3828) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.aBoolean410 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.aBoolean400 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.aBoolean406 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.anInt5571;
					return;
				}
				if (arg0 == 6108) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.aBoolean402 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.aBoolean404 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.aBoolean395 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.method4630(Static192.anInt3828);
					return;
				}
				if (arg0 == 6112) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.method4632(Static192.anInt3828) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.aBoolean397 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.aBoolean398 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.anInt5572;
					return;
				}
				if (arg0 == 6117) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.aBoolean408 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.anInt5554;
					return;
				}
				if (arg0 == 6119) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.anInt5567;
					return;
				}
				if (arg0 == 6120) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.anInt5555;
					return;
				}
				if (arg0 == 6121) {
					anIntArray118[anInt1611++] = Static30.aClass30_3.method2076() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray118[anInt1611++] = Static72.method1584();
					return;
				}
				if (arg0 == 6124) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.anInt5563;
					return;
				}
				if (arg0 == 6125) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.anInt5564;
					return;
				}
				if (arg0 == 6126) {
					anIntArray118[anInt1611++] = Static30.aClass30_3.method2033() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.aBoolean401 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.aBoolean403 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.anInt5571;
					return;
				}
				if (arg0 == 6130) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.aBoolean407 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray118[anInt1611++] = Static192.anInt3828;
					return;
				}
				if (arg0 == 6132) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.anInt5557;
					return;
				}
				if (arg0 == 6133) {
					anIntArray118[anInt1611++] = Static419.anInt7272 == 1 || Static419.anInt7272 == 4 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray118[anInt1611++] = Static109.method2170(Static263.anInt5007);
					return;
				}
				if (arg0 == 6135) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.anInt5562;
					return;
				}
				if (arg0 == 6136) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.aBoolean405 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(5948) boolean local5948 = true;
					try {
						local5948 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(5958) Throwable local5958) {
					}
					anIntArray118[anInt1611++] = local5948 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt1611 -= 2;
					Static448.aShort105 = (short) anIntArray118[anInt1611];
					if (Static448.aShort105 <= 0) {
						Static448.aShort105 = 256;
					}
					Static125.aShort23 = (short) anIntArray118[anInt1611 + 1];
					if (Static125.aShort23 <= 0) {
						Static125.aShort23 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt1611 -= 2;
					Static305.aShort66 = (short) anIntArray118[anInt1611];
					if (Static305.aShort66 <= 0) {
						Static305.aShort66 = 256;
					}
					Static35.aShort4 = (short) anIntArray118[anInt1611 + 1];
					if (Static35.aShort4 <= 0) {
						Static35.aShort4 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt1611 -= 4;
					Static381.aShort78 = (short) anIntArray118[anInt1611];
					if (Static381.aShort78 <= 0) {
						Static381.aShort78 = 1;
					}
					Static146.aShort24 = (short) anIntArray118[anInt1611 + 1];
					if (Static146.aShort24 <= 0) {
						Static146.aShort24 = 32767;
					} else if (Static146.aShort24 < Static381.aShort78) {
						Static146.aShort24 = Static381.aShort78;
					}
					Static316.aShort67 = (short) anIntArray118[anInt1611 + 2];
					if (Static316.aShort67 <= 0) {
						Static316.aShort67 = 1;
					}
					Static336.aShort68 = (short) anIntArray118[anInt1611 + 3];
					if (Static336.aShort68 <= 0) {
						Static336.aShort68 = 32767;
						return;
					}
					if (Static336.aShort68 < Static316.aShort67) {
						Static336.aShort68 = Static316.aShort67;
					}
					return;
				}
				if (arg0 == 6203) {
					Static29.method6228(Static197.aClass240_11.anInt6904, 0, 0, false, Static197.aClass240_11.anInt6894);
					anIntArray118[anInt1611++] = Static10.anInt197;
					anIntArray118[anInt1611++] = Static147.anInt3075;
					return;
				}
				if (arg0 == 6204) {
					anIntArray118[anInt1611++] = Static305.aShort66;
					anIntArray118[anInt1611++] = Static35.aShort4;
					return;
				}
				if (arg0 == 6205) {
					anIntArray118[anInt1611++] = Static448.aShort105;
					anIntArray118[anInt1611++] = Static125.aShort23;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray118[anInt1611++] = (int) (Static167.method2929() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray118[anInt1611++] = (int) (Static167.method2929() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt1611 -= 3;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					local89 = anIntArray118[anInt1611 + 2];
					aCalendar1.clear();
					aCalendar1.set(11, 12);
					aCalendar1.set(local89, local694, local157);
					local95 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
					if (local89 < 1970) {
						local95--;
					}
					anIntArray118[anInt1611++] = local95;
					return;
				}
				if (arg0 == 6303) {
					aCalendar1.clear();
					aCalendar1.setTime(new Date(Static167.method2929()));
					anIntArray118[anInt1611++] = aCalendar1.get(1);
					return;
				}
				if (arg0 == 6304) {
					local157 = anIntArray118[--anInt1611];
					local1378 = true;
					if (local157 < 0) {
						local1378 = (local157 + 1) % 4 == 0;
					} else if (local157 < 1582) {
						local1378 = local157 % 4 == 0;
					} else if (local157 % 4 != 0) {
						local1378 = false;
					} else if (local157 % 100 != 0) {
						local1378 = true;
					} else if (local157 % 400 != 0) {
						local1378 = false;
					}
					anIntArray118[anInt1611++] = local1378 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray118[anInt1611++] = Static421.method5855() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray118[anInt1611++] = Static266.method4281() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static70.anInt1726 == 6 && Static427.anInt7334 == 0 && Static328.anInt5873 == 0) {
						if (Static162.aBoolean123) {
							anIntArray118[anInt1611++] = 0;
							return;
						}
						if (Static170.aLong116 > Static167.method2929() - 1000L) {
							anIntArray118[anInt1611++] = 1;
							return;
						}
						Static162.aBoolean123 = true;
						Static448.method6134(Static465.aClass212_102);
						Static457.aClass4_Sub20_Sub1_5.method4561(Static436.anInt7466);
						anIntArray118[anInt1611++] = 0;
						return;
					}
					anIntArray118[anInt1611++] = 1;
					return;
				}
				@Pc(6491) Class215 local6491;
				@Pc(6458) Class82_Sub1 local6458;
				if (arg0 == 6501) {
					local6458 = Static74.method1626();
					if (local6458 != null) {
						anIntArray118[anInt1611++] = local6458.anInt7704;
						anIntArray118[anInt1611++] = local6458.anInt7699;
						aStringArray5[anInt1607++] = local6458.aString80;
						local6491 = local6458.method6146();
						anIntArray118[anInt1611++] = local6491.anInt6106;
						aStringArray5[anInt1607++] = local6491.aString52;
						anIntArray118[anInt1611++] = local6458.anInt7693;
						anIntArray118[anInt1611++] = local6458.anInt7703;
						aStringArray5[anInt1607++] = local6458.aString79;
						return;
					}
					anIntArray118[anInt1611++] = -1;
					anIntArray118[anInt1611++] = 0;
					aStringArray5[anInt1607++] = "";
					anIntArray118[anInt1611++] = 0;
					aStringArray5[anInt1607++] = "";
					anIntArray118[anInt1611++] = 0;
					anIntArray118[anInt1611++] = 0;
					aStringArray5[anInt1607++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6458 = Static8.method77();
					if (local6458 != null) {
						anIntArray118[anInt1611++] = local6458.anInt7704;
						anIntArray118[anInt1611++] = local6458.anInt7699;
						aStringArray5[anInt1607++] = local6458.aString80;
						local6491 = local6458.method6146();
						anIntArray118[anInt1611++] = local6491.anInt6106;
						aStringArray5[anInt1607++] = local6491.aString52;
						anIntArray118[anInt1611++] = local6458.anInt7693;
						anIntArray118[anInt1611++] = local6458.anInt7703;
						aStringArray5[anInt1607++] = local6458.aString79;
						return;
					}
					anIntArray118[anInt1611++] = -1;
					anIntArray118[anInt1611++] = 0;
					aStringArray5[anInt1607++] = "";
					anIntArray118[anInt1611++] = 0;
					aStringArray5[anInt1607++] = "";
					anIntArray118[anInt1611++] = 0;
					anIntArray118[anInt1611++] = 0;
					aStringArray5[anInt1607++] = "";
					return;
				}
				if (arg0 == 6503) {
					local157 = anIntArray118[--anInt1611];
					local81 = aStringArray5[--anInt1607];
					if (Static70.anInt1726 == 6 && Static427.anInt7334 == 0 && Static328.anInt5873 == 0) {
						anIntArray118[anInt1611++] = Static37.method743(local81, local157) ? 1 : 0;
						return;
					}
					anIntArray118[anInt1611++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static157.aClass185_Sub1_1.anInt5561 = anIntArray118[--anInt1611];
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					return;
				}
				if (arg0 == 6505) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.anInt5561;
					return;
				}
				if (arg0 == 6506) {
					local157 = anIntArray118[--anInt1611];
					@Pc(6848) Class82_Sub1 local6848 = Static7.method72(local157);
					if (local6848 != null) {
						anIntArray118[anInt1611++] = local6848.anInt7699;
						aStringArray5[anInt1607++] = local6848.aString80;
						@Pc(6872) Class215 local6872 = local6848.method6146();
						anIntArray118[anInt1611++] = local6872.anInt6106;
						aStringArray5[anInt1607++] = local6872.aString52;
						anIntArray118[anInt1611++] = local6848.anInt7693;
						anIntArray118[anInt1611++] = local6848.anInt7703;
						aStringArray5[anInt1607++] = local6848.aString79;
						return;
					}
					anIntArray118[anInt1611++] = -1;
					aStringArray5[anInt1607++] = "";
					anIntArray118[anInt1611++] = 0;
					aStringArray5[anInt1607++] = "";
					anIntArray118[anInt1611++] = 0;
					anIntArray118[anInt1611++] = 0;
					aStringArray5[anInt1607++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt1611 -= 4;
					local157 = anIntArray118[anInt1611];
					local1378 = anIntArray118[anInt1611 + 1] == 1;
					local89 = anIntArray118[anInt1611 + 2];
					local2030 = anIntArray118[anInt1611 + 3] == 1;
					Static118.method2249(local89, local157, local2030, local1378);
					return;
				}
				if (arg0 == 6508) {
					Static34.method496();
					return;
				}
				if (arg0 == 6509) {
					if (Static70.anInt1726 != 6) {
						return;
					}
					Static232.aBoolean300 = anIntArray118[--anInt1611] == 1;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static157.aClass185_Sub1_1.aBoolean393 = anIntArray118[--anInt1611] == 1;
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					return;
				}
				if (arg0 == 6601) {
					anIntArray118[anInt1611++] = Static157.aClass185_Sub1_1.aBoolean393 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static123.aClass73_4 == Static173.aClass73_5) {
				if (arg0 == 6700) {
					local157 = Static157.aClass96_22.method2807();
					if (Static248.anInt4793 != -1) {
						local157++;
					}
					anIntArray118[anInt1611++] = local157;
					return;
				}
				if (arg0 == 6701) {
					local157 = anIntArray118[--anInt1611];
					if (Static248.anInt4793 != -1) {
						if (local157 == 0) {
							anIntArray118[anInt1611++] = Static248.anInt4793;
							return;
						}
						local157--;
					}
					@Pc(7147) Class4_Sub39 local7147 = (Class4_Sub39) Static157.aClass96_22.method2798();
					while (local157-- > 0) {
						local7147 = (Class4_Sub39) Static157.aClass96_22.method2796();
					}
					anIntArray118[anInt1611++] = local7147.anInt6721;
					return;
				}
				if (arg0 == 6702) {
					local157 = anIntArray118[--anInt1611];
					if (Static122.aClass240ArrayArray2[local157] == null) {
						aStringArray5[anInt1607++] = "";
						return;
					}
					local81 = Static122.aClass240ArrayArray2[local157][0].aString62;
					if (local81 == null) {
						aStringArray5[anInt1607++] = "";
						return;
					}
					aStringArray5[anInt1607++] = local81.substring(0, local81.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local157 = anIntArray118[--anInt1611];
					if (Static122.aClass240ArrayArray2[local157] == null) {
						anIntArray118[anInt1611++] = 0;
						return;
					}
					anIntArray118[anInt1611++] = Static122.aClass240ArrayArray2[local157].length;
					return;
				}
				if (arg0 == 6704) {
					anInt1611 -= 2;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					if (Static122.aClass240ArrayArray2[local157] == null) {
						aStringArray5[anInt1607++] = "";
						return;
					}
					local163 = Static122.aClass240ArrayArray2[local157][local694].aString62;
					if (local163 == null) {
						aStringArray5[anInt1607++] = "";
						return;
					}
					aStringArray5[anInt1607++] = local163;
					return;
				}
				if (arg0 == 6705) {
					anInt1611 -= 2;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					if (Static122.aClass240ArrayArray2[local157] == null) {
						anIntArray118[anInt1611++] = 0;
						return;
					}
					anIntArray118[anInt1611++] = Static122.aClass240ArrayArray2[local157][local694].anInt6844;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt1611 -= 3;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					local89 = anIntArray118[anInt1611 + 2];
					Static168.method2939(1, local89, local157 << 16 | local694, "");
					return;
				}
				if (arg0 == 6708) {
					anInt1611 -= 3;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					local89 = anIntArray118[anInt1611 + 2];
					Static168.method2939(2, local89, local157 << 16 | local694, "");
					return;
				}
				if (arg0 == 6709) {
					anInt1611 -= 3;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					local89 = anIntArray118[anInt1611 + 2];
					Static168.method2939(3, local89, local157 << 16 | local694, "");
					return;
				}
				if (arg0 == 6710) {
					anInt1611 -= 3;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					local89 = anIntArray118[anInt1611 + 2];
					Static168.method2939(4, local89, local157 << 16 | local694, "");
					return;
				}
				if (arg0 == 6711) {
					anInt1611 -= 3;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					local89 = anIntArray118[anInt1611 + 2];
					Static168.method2939(5, local89, local157 << 16 | local694, "");
					return;
				}
				if (arg0 == 6712) {
					anInt1611 -= 3;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					local89 = anIntArray118[anInt1611 + 2];
					Static168.method2939(6, local89, local157 << 16 | local694, "");
					return;
				}
				if (arg0 == 6713) {
					anInt1611 -= 3;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					local89 = anIntArray118[anInt1611 + 2];
					Static168.method2939(7, local89, local157 << 16 | local694, "");
					return;
				}
				if (arg0 == 6714) {
					anInt1611 -= 3;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					local89 = anIntArray118[anInt1611 + 2];
					Static168.method2939(8, local89, local157 << 16 | local694, "");
					return;
				}
				if (arg0 == 6715) {
					anInt1611 -= 3;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					local89 = anIntArray118[anInt1611 + 2];
					Static168.method2939(9, local89, local157 << 16 | local694, "");
					return;
				}
				if (arg0 == 6716) {
					anInt1611 -= 3;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					local89 = anIntArray118[anInt1611 + 2];
					Static168.method2939(10, local89, local157 << 16 | local694, "");
					return;
				}
				if (arg0 == 6717) {
					anInt1611 -= 3;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					local89 = anIntArray118[anInt1611 + 2];
					@Pc(7735) Class240 local7735 = Static231.method3929(local157 << 16 | local694, local89);
					Static294.method4500();
					@Pc(7740) Class4_Sub45 local7740 = Static50.method1146(local7735);
					Static288.method4458(local7740.method5906(), local7735, local7740.anInt7348);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(7768) Class217 local7768;
				if (arg0 == 6800) {
					local157 = anIntArray118[--anInt1611];
					local7768 = Static62.aClass116_1.method3300(local157);
					if (local7768.aString53 == null) {
						aStringArray5[anInt1607++] = "";
						return;
					}
					aStringArray5[anInt1607++] = local7768.aString53;
					return;
				}
				if (arg0 == 6801) {
					local157 = anIntArray118[--anInt1611];
					local7768 = Static62.aClass116_1.method3300(local157);
					anIntArray118[anInt1611++] = local7768.anInt6181;
					return;
				}
				if (arg0 == 6802) {
					local157 = anIntArray118[--anInt1611];
					local7768 = Static62.aClass116_1.method3300(local157);
					anIntArray118[anInt1611++] = local7768.anInt6195;
					return;
				}
				if (arg0 == 6803) {
					local157 = anIntArray118[--anInt1611];
					local7768 = Static62.aClass116_1.method3300(local157);
					anIntArray118[anInt1611++] = local7768.anInt6182;
					return;
				}
				if (arg0 == 6804) {
					anInt1611 -= 2;
					local157 = anIntArray118[anInt1611];
					local694 = anIntArray118[anInt1611 + 1];
					@Pc(7890) Class176 local7890 = Static203.aClass202_1.method4864(local694);
					if (local7890.method4372()) {
						aStringArray5[anInt1607++] = Static62.aClass116_1.method3300(local157).method5084(local694, local7890.aString44);
						return;
					}
					anIntArray118[anInt1611++] = Static62.aClass116_1.method3300(local157).method5089(local7890.anInt5158, local694);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray118[anInt1611++] = Static238.aBoolean310 && !Static53.aBoolean301 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray118[anInt1611++] = Static350.anInt6203;
					return;
				}
				if (arg0 == 6902) {
					anIntArray118[anInt1611++] = Static351.anInt6220;
					return;
				}
				if (arg0 == 6903) {
					anIntArray118[anInt1611++] = Static467.anInt8016;
					return;
				}
				if (arg0 == 6904) {
					anIntArray118[anInt1611++] = Static417.anInt7267;
					return;
				}
				if (arg0 == 6905) {
					local75 = "";
					if (Static177.aClass87_4 != null) {
						if (Static177.aClass87_4.anObject3 == null) {
							local75 = Static8.method76(Static177.aClass87_4.anInt2677);
						} else {
							local75 = (String) Static177.aClass87_4.anObject3;
						}
					}
					aStringArray5[anInt1607++] = local75;
					return;
				}
				if (arg0 == 6906) {
					anIntArray118[anInt1611++] = Static177.anInt3636;
					return;
				}
				if (arg0 == 6907) {
					anIntArray118[anInt1611++] = Static267.anInt5067;
					return;
				}
				if (arg0 == 6908) {
					anIntArray118[anInt1611++] = Static120.anInt2513;
					return;
				}
				if (arg0 == 6909) {
					anIntArray118[anInt1611++] = Static150.aBoolean208 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray118[anInt1611++] = Static59.anInt1457;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method1468(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray7[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(IZ)V")
	private static void method1469(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class240 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class240 local35;
		@Pc(158) Class240 local158;
		@Pc(210) Class240 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt1611 -= 3;
				local13 = anIntArray118[anInt1611];
				local19 = anIntArray118[anInt1611 + 1];
				local25 = anIntArray118[anInt1611 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static92.method1820(local13);
				if (local35.aClass240Array2 == null) {
					local35.aClass240Array2 = new Class240[local25 + 1];
				}
				if (local35.aClass240Array2.length <= local25) {
					@Pc(54) Class240[] local54 = new Class240[local25 + 1];
					for (local56 = 0; local56 < local35.aClass240Array2.length; local56++) {
						local54[local56] = local35.aClass240Array2[local56];
					}
					local35.aClass240Array2 = local54;
				}
				if (local25 > 0 && local35.aClass240Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class240 local99 = new Class240();
				local99.anInt6873 = local19;
				local99.anInt6917 = local99.anInt6909 = local35.anInt6909;
				local99.anInt6885 = local25;
				local35.aClass240Array2[local25] = local99;
				if (arg1) {
					aClass240_2 = local99;
				} else {
					aClass240_3 = local99;
				}
				Static273.method4374(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass240_2 : aClass240_3;
				if (local137.anInt6885 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static92.method1820(local137.anInt6909);
				local158.aClass240Array2[local137.anInt6885] = null;
				Static273.method4374(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static92.method1820(anIntArray118[--anInt1611]);
				local137.aClass240Array2 = null;
				Static273.method4374(local137);
				return;
			}
			if (arg0 == 200) {
				anInt1611 -= 2;
				local13 = anIntArray118[anInt1611];
				local19 = anIntArray118[anInt1611 + 1];
				local210 = Static231.method3929(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray118[anInt1611++] = 1;
					if (arg1) {
						aClass240_2 = local210;
						return;
					}
					aClass240_3 = local210;
					return;
				}
				anIntArray118[anInt1611++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray118[--anInt1611];
				local158 = Static92.method1820(local13);
				if (local158 != null) {
					anIntArray118[anInt1611++] = 1;
					if (arg1) {
						aClass240_2 = local158;
						return;
					}
					aClass240_3 = local158;
					return;
				}
				anIntArray118[anInt1611++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray118[--anInt1611];
				method1471(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray118[--anInt1611];
				method1465(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt1611 -= 2;
					local13 = anIntArray118[anInt1611];
					local19 = anIntArray118[anInt1611 + 1];
					for (local25 = 0; local25 < Static56.anIntArray85.length; local25++) {
						if (Static56.anIntArray85[local25] == local13) {
							Static52.aClass11_Sub5_Sub2_Sub1_2.aClass90_1.method2566(Static383.aClass126_2, local25, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static53.anIntArray369.length; local353++) {
						if (Static53.anIntArray369[local353] == local13) {
							Static52.aClass11_Sub5_Sub2_Sub1_2.aClass90_1.method2566(Static383.aClass126_2, local353, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt1611 -= 2;
					local13 = anIntArray118[anInt1611];
					local19 = anIntArray118[anInt1611 + 1];
					Static52.aClass11_Sub5_Sub2_Sub1_2.aClass90_1.method2568(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray118[--anInt1611] != 0;
					Static52.aClass11_Sub5_Sub2_Sub1_2.aClass90_1.method2570(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static92.method1820(anIntArray118[--anInt1611]);
					} else {
						local137 = arg1 ? aClass240_2 : aClass240_3;
					}
					if (arg0 == 1100) {
						anInt1611 -= 2;
						local137.anInt6897 = anIntArray118[anInt1611];
						if (local137.anInt6897 > local137.anInt6839 - local137.anInt6904) {
							local137.anInt6897 = local137.anInt6839 - local137.anInt6904;
						}
						if (local137.anInt6897 < 0) {
							local137.anInt6897 = 0;
						}
						local137.anInt6845 = anIntArray118[anInt1611 + 1];
						if (local137.anInt6845 > local137.anInt6926 - local137.anInt6894) {
							local137.anInt6845 = local137.anInt6926 - local137.anInt6894;
						}
						if (local137.anInt6845 < 0) {
							local137.anInt6845 = 0;
						}
						Static273.method4374(local137);
						if (local137.anInt6885 == -1) {
							Static82.method1759(local137.anInt6909);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt6883 = anIntArray118[--anInt1611];
						Static273.method4374(local137);
						if (local137.anInt6885 == -1) {
							Static232.method3934(local137.anInt6909);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean500 = anIntArray118[--anInt1611] == 1;
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt6838 = anIntArray118[--anInt1611];
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt6901 = anIntArray118[--anInt1611];
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray118[--anInt1611];
						if (local137.anInt6886 != local19) {
							local137.anInt6886 = local19;
							Static273.method4374(local137);
						}
						if (local137.anInt6885 == -1) {
							Static342.method4987(local137.anInt6909);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt6928 = anIntArray118[--anInt1611];
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean503 = anIntArray118[--anInt1611] == 1;
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt6880 = 1;
						local137.anInt6902 = anIntArray118[--anInt1611];
						Static273.method4374(local137);
						if (local137.anInt6885 == -1) {
							Static381.method5399(local137.anInt6909);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt1611 -= 6;
						local137.anInt6849 = anIntArray118[anInt1611];
						local137.anInt6912 = anIntArray118[anInt1611 + 1];
						local137.anInt6875 = anIntArray118[anInt1611 + 2];
						local137.anInt6887 = anIntArray118[anInt1611 + 3];
						local137.anInt6903 = anIntArray118[anInt1611 + 4];
						local137.anInt6851 = anIntArray118[anInt1611 + 5];
						Static273.method4374(local137);
						if (local137.anInt6885 == -1) {
							Static169.method4393(local137.anInt6909);
							Static140.method2579(local137.anInt6909);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray118[--anInt1611];
						if (local137.anInt6858 != local19) {
							local137.anInt6858 = local19;
							local137.anInt6867 = 0;
							local137.anInt6847 = 1;
							local137.anInt6890 = 0;
							Static273.method4374(local137);
						}
						if (local137.anInt6885 == -1) {
							Static378.method5366(local137.anInt6909);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean499 = anIntArray118[--anInt1611] == 1;
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray5[--anInt1607];
						if (!local1101.equals(local137.aString61)) {
							local137.aString61 = local1101;
							Static273.method4374(local137);
						}
						if (local137.anInt6885 == -1) {
							Static61.method1430(local137.anInt6909);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt6918 = anIntArray118[--anInt1611];
						Static273.method4374(local137);
						if (local137.anInt6885 == -1) {
							Static329.method4881(local137.anInt6909);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt1611 -= 3;
						local137.anInt6877 = anIntArray118[anInt1611];
						local137.anInt6915 = anIntArray118[anInt1611 + 1];
						local137.anInt6850 = anIntArray118[anInt1611 + 2];
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean501 = anIntArray118[--anInt1611] == 1;
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt6856 = anIntArray118[--anInt1611];
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt6853 = anIntArray118[--anInt1611];
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean497 = anIntArray118[--anInt1611] == 1;
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean508 = anIntArray118[--anInt1611] == 1;
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt1611 -= 2;
						local137.anInt6839 = anIntArray118[anInt1611];
						local137.anInt6926 = anIntArray118[anInt1611 + 1];
						Static273.method4374(local137);
						if (local137.anInt6873 == 0) {
							Static354.method5123(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt1611 -= 2;
						local137.anInt6861 = (short) anIntArray118[anInt1611];
						local137.anInt6855 = (short) anIntArray118[anInt1611 + 1];
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean511 = anIntArray118[--anInt1611] == 1;
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt6851 = anIntArray118[--anInt1611];
						Static273.method4374(local137);
						if (local137.anInt6885 == -1) {
							Static169.method4393(local137.anInt6909);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray118[--anInt1611];
						local137.aBoolean496 = local19 == 1;
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt1611 -= 2;
						local137.anInt6870 = anIntArray118[anInt1611];
						local137.anInt6900 = anIntArray118[anInt1611 + 1];
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt6878 = anIntArray118[--anInt1611];
						Static273.method4374(local137);
						return;
					}
					@Pc(1454) Class176 local1454;
					if (arg0 == 1127) {
						anInt1611 -= 2;
						local19 = anIntArray118[anInt1611];
						local25 = anIntArray118[anInt1611 + 1];
						local1454 = Static203.aClass202_1.method4864(local19);
						if (local25 != local1454.anInt5158) {
							local137.method5540(local19, local25);
							return;
						}
						local137.method5537(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray118[--anInt1611];
						local1488 = aStringArray5[--anInt1607];
						local1454 = Static203.aClass202_1.method4864(local19);
						if (!local1454.aString44.equals(local1488)) {
							local137.method5538(local1488, local19);
							return;
						}
						local137.method5537(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static92.method1820(anIntArray118[--anInt1611]);
							} else {
								local137 = arg1 ? aClass240_2 : aClass240_3;
							}
							local1101 = aStringArray5[--anInt1607];
							@Pc(2369) int[] local2369 = null;
							if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
								local353 = anIntArray118[--anInt1611];
								if (local353 > 0) {
									local2369 = new int[local353];
									while (local353-- > 0) {
										local2369[local353] = anIntArray118[--anInt1611];
									}
								}
								local1101 = local1101.substring(0, local1101.length() - 1);
							}
							@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
							for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
								if (local1101.charAt(local2290 - 1) == 's') {
									local2421[local2290] = aStringArray5[--anInt1607];
								} else {
									local2421[local2290] = Integer.valueOf(anIntArray118[--anInt1611]);
								}
							}
							local56 = anIntArray118[--anInt1611];
							if (local56 == -1) {
								local2421 = null;
							} else {
								local2421[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray7 = local2421;
							} else if (arg0 == 1401) {
								local137.anObjectArray18 = local2421;
							} else if (arg0 == 1402) {
								local137.anObjectArray25 = local2421;
							} else if (arg0 == 1403) {
								local137.anObjectArray5 = local2421;
							} else if (arg0 == 1404) {
								local137.anObjectArray19 = local2421;
							} else if (arg0 == 1405) {
								local137.anObjectArray12 = local2421;
							} else if (arg0 == 1406) {
								local137.anObjectArray6 = local2421;
							} else if (arg0 == 1407) {
								local137.anObjectArray27 = local2421;
								local137.anIntArray550 = local2369;
							} else if (arg0 == 1408) {
								local137.anObjectArray8 = local2421;
							} else if (arg0 == 1409) {
								local137.anObjectArray31 = local2421;
							} else if (arg0 == 1410) {
								local137.anObjectArray17 = local2421;
							} else if (arg0 == 1411) {
								local137.anObjectArray28 = local2421;
							} else if (arg0 == 1412) {
								local137.anObjectArray35 = local2421;
							} else if (arg0 == 1414) {
								local137.anObjectArray14 = local2421;
								local137.anIntArray551 = local2369;
							} else if (arg0 == 1415) {
								local137.anObjectArray33 = local2421;
								local137.anIntArray554 = local2369;
							} else if (arg0 == 1416) {
								local137.anObjectArray21 = local2421;
							} else if (arg0 == 1417) {
								local137.anObjectArray30 = local2421;
							} else if (arg0 == 1418) {
								local137.anObjectArray23 = local2421;
							} else if (arg0 == 1419) {
								local137.anObjectArray34 = local2421;
							} else if (arg0 == 1420) {
								local137.anObjectArray11 = local2421;
							} else if (arg0 == 1421) {
								local137.anObjectArray9 = local2421;
							} else if (arg0 == 1422) {
								local137.anObjectArray10 = local2421;
							} else if (arg0 == 1423) {
								local137.anObjectArray15 = local2421;
							} else if (arg0 == 1424) {
								local137.anObjectArray13 = local2421;
							} else if (arg0 == 1425) {
								local137.anObjectArray20 = local2421;
							} else if (arg0 == 1426) {
								local137.anObjectArray22 = local2421;
							} else if (arg0 == 1427) {
								local137.anObjectArray16 = local2421;
							} else if (arg0 == 1428) {
								local137.anObjectArray32 = local2421;
								local137.anIntArray549 = local2369;
							} else if (arg0 == 1429) {
								local137.anObjectArray24 = local2421;
								local137.anIntArray557 = local2369;
							} else if (arg0 == 1430) {
								local137.anObjectArray29 = local2421;
							}
							local137.aBoolean506 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass240_2 : aClass240_3;
							if (arg0 == 1500) {
								anIntArray118[anInt1611++] = local137.anInt6862;
								return;
							}
							if (arg0 == 1501) {
								anIntArray118[anInt1611++] = local137.anInt6879;
								return;
							}
							if (arg0 == 1502) {
								anIntArray118[anInt1611++] = local137.anInt6904;
								return;
							}
							if (arg0 == 1503) {
								anIntArray118[anInt1611++] = local137.anInt6894;
								return;
							}
							if (arg0 == 1504) {
								anIntArray118[anInt1611++] = local137.aBoolean502 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray118[anInt1611++] = local137.anInt6917;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static71.method1564(local137);
								anIntArray118[anInt1611++] = local158 == null ? -1 : local158.anInt6909;
								return;
							}
						} else {
							@Pc(3017) Class176 local3017;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass240_2 : aClass240_3;
								if (arg0 == 1600) {
									anIntArray118[anInt1611++] = local137.anInt6897;
									return;
								}
								if (arg0 == 1601) {
									anIntArray118[anInt1611++] = local137.anInt6845;
									return;
								}
								if (arg0 == 1602) {
									aStringArray5[anInt1607++] = local137.aString61;
									return;
								}
								if (arg0 == 1603) {
									anIntArray118[anInt1611++] = local137.anInt6839;
									return;
								}
								if (arg0 == 1604) {
									anIntArray118[anInt1611++] = local137.anInt6926;
									return;
								}
								if (arg0 == 1605) {
									anIntArray118[anInt1611++] = local137.anInt6851;
									return;
								}
								if (arg0 == 1606) {
									anIntArray118[anInt1611++] = local137.anInt6875;
									return;
								}
								if (arg0 == 1607) {
									anIntArray118[anInt1611++] = local137.anInt6903;
									return;
								}
								if (arg0 == 1608) {
									anIntArray118[anInt1611++] = local137.anInt6887;
									return;
								}
								if (arg0 == 1609) {
									anIntArray118[anInt1611++] = local137.anInt6838;
									return;
								}
								if (arg0 == 1610) {
									anIntArray118[anInt1611++] = local137.anInt6849;
									return;
								}
								if (arg0 == 1611) {
									anIntArray118[anInt1611++] = local137.anInt6912;
									return;
								}
								if (arg0 == 1612) {
									anIntArray118[anInt1611++] = local137.anInt6886;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray118[--anInt1611];
									local3017 = Static203.aClass202_1.method4864(local19);
									if (local3017.method4372()) {
										aStringArray5[anInt1607++] = local137.method5526(local19, local3017.aString44);
										return;
									}
									anIntArray118[anInt1611++] = local137.method5529(local3017.anInt5158, local19);
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass240_2 : aClass240_3;
								if (arg0 == 1700) {
									anIntArray118[anInt1611++] = local137.anInt6876;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt6876 != -1) {
										anIntArray118[anInt1611++] = local137.anInt6881;
										return;
									}
									anIntArray118[anInt1611++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray118[anInt1611++] = local137.anInt6885;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass240_2 : aClass240_3;
								if (arg0 == 1800) {
									anIntArray118[anInt1611++] = Static50.method1146(local137).method5906();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray118[--anInt1611];
									local19--;
									if (local137.aStringArray34 != null && local19 < local137.aStringArray34.length && local137.aStringArray34[local19] != null) {
										aStringArray5[anInt1607++] = local137.aStringArray34[local19];
										return;
									}
									aStringArray5[anInt1607++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString59 == null) {
										aStringArray5[anInt1607++] = "";
										return;
									}
									aStringArray5[anInt1607++] = local137.aString59;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static92.method1820(anIntArray118[--anInt1611]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass240_2 : aClass240_3;
								}
								if (anInt1612 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray16 == null) {
										return;
									}
									@Pc(3254) Class4_Sub10 local3254 = new Class4_Sub10();
									local3254.aClass240_5 = local137;
									local3254.anObjectArray4 = local137.anObjectArray16;
									local3254.anInt1690 = anInt1612 + 1;
									Static459.aClass91_53.method2587(local3254);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static92.method1820(anIntArray118[--anInt1611]);
								if (arg0 == 2500) {
									anIntArray118[anInt1611++] = local137.anInt6862;
									return;
								}
								if (arg0 == 2501) {
									anIntArray118[anInt1611++] = local137.anInt6879;
									return;
								}
								if (arg0 == 2502) {
									anIntArray118[anInt1611++] = local137.anInt6904;
									return;
								}
								if (arg0 == 2503) {
									anIntArray118[anInt1611++] = local137.anInt6894;
									return;
								}
								if (arg0 == 2504) {
									anIntArray118[anInt1611++] = local137.aBoolean502 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray118[anInt1611++] = local137.anInt6917;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static71.method1564(local137);
									anIntArray118[anInt1611++] = local158 == null ? -1 : local158.anInt6909;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static92.method1820(anIntArray118[--anInt1611]);
								if (arg0 == 2600) {
									anIntArray118[anInt1611++] = local137.anInt6897;
									return;
								}
								if (arg0 == 2601) {
									anIntArray118[anInt1611++] = local137.anInt6845;
									return;
								}
								if (arg0 == 2602) {
									aStringArray5[anInt1607++] = local137.aString61;
									return;
								}
								if (arg0 == 2603) {
									anIntArray118[anInt1611++] = local137.anInt6839;
									return;
								}
								if (arg0 == 2604) {
									anIntArray118[anInt1611++] = local137.anInt6926;
									return;
								}
								if (arg0 == 2605) {
									anIntArray118[anInt1611++] = local137.anInt6851;
									return;
								}
								if (arg0 == 2606) {
									anIntArray118[anInt1611++] = local137.anInt6875;
									return;
								}
								if (arg0 == 2607) {
									anIntArray118[anInt1611++] = local137.anInt6903;
									return;
								}
								if (arg0 == 2608) {
									anIntArray118[anInt1611++] = local137.anInt6887;
									return;
								}
								if (arg0 == 2609) {
									anIntArray118[anInt1611++] = local137.anInt6838;
									return;
								}
								if (arg0 == 2610) {
									anIntArray118[anInt1611++] = local137.anInt6849;
									return;
								}
								if (arg0 == 2611) {
									anIntArray118[anInt1611++] = local137.anInt6912;
									return;
								}
								if (arg0 == 2612) {
									anIntArray118[anInt1611++] = local137.anInt6886;
									return;
								}
							} else {
								@Pc(3751) Class4_Sub39 local3751;
								@Pc(3649) Class4_Sub39 local3649;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static92.method1820(anIntArray118[--anInt1611]);
										anIntArray118[anInt1611++] = local137.anInt6876;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static92.method1820(anIntArray118[--anInt1611]);
										if (local137.anInt6876 != -1) {
											anIntArray118[anInt1611++] = local137.anInt6881;
											return;
										}
										anIntArray118[anInt1611++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray118[--anInt1611];
										local3649 = (Class4_Sub39) Static157.aClass96_22.method2797((long) local13);
										if (local3649 != null) {
											anIntArray118[anInt1611++] = 1;
											return;
										}
										anIntArray118[anInt1611++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static92.method1820(anIntArray118[--anInt1611]);
										if (local137.aClass240Array2 == null) {
											anIntArray118[anInt1611++] = 0;
											return;
										}
										local19 = local137.aClass240Array2.length;
										for (local25 = 0; local25 < local137.aClass240Array2.length; local25++) {
											if (local137.aClass240Array2[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray118[anInt1611++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt1611 -= 2;
										local13 = anIntArray118[anInt1611];
										local19 = anIntArray118[anInt1611 + 1];
										local3751 = (Class4_Sub39) Static157.aClass96_22.method2797((long) local13);
										if (local3751 != null && local3751.anInt6721 == local19) {
											anIntArray118[anInt1611++] = 1;
											return;
										}
										anIntArray118[anInt1611++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static92.method1820(anIntArray118[--anInt1611]);
									if (arg0 == 2800) {
										anIntArray118[anInt1611++] = Static50.method1146(local137).method5906();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray118[--anInt1611];
										local19--;
										if (local137.aStringArray34 != null && local19 < local137.aStringArray34.length && local137.aStringArray34[local19] != null) {
											aStringArray5[anInt1607++] = local137.aStringArray34[local19];
											return;
										}
										aStringArray5[anInt1607++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString59 == null) {
											aStringArray5[anInt1607++] = "";
											return;
										}
										aStringArray5[anInt1607++] = local137.aString59;
										return;
									}
								} else {
									@Pc(3888) String local3888;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local3888 = aStringArray5[--anInt1607];
											Static200.method3529(local3888);
											return;
										}
										if (arg0 == 3101) {
											anInt1611 -= 2;
											Static2.method14(anIntArray118[anInt1611], Static52.aClass11_Sub5_Sub2_Sub1_2, anIntArray118[anInt1611 + 1]);
											return;
										}
										if (arg0 == 3103) {
											Static2.method17();
											return;
										}
										if (arg0 == 3104) {
											local3888 = aStringArray5[--anInt1607];
											local19 = 0;
											if (Static9.method159(local3888)) {
												local19 = Static269.method4335(local3888);
											}
											Static448.method6134(Static78.aClass212_19);
											Static457.aClass4_Sub20_Sub1_5.method4561(local19);
											return;
										}
										if (arg0 == 3105) {
											local3888 = aStringArray5[--anInt1607];
											Static448.method6134(Static202.aClass212_54);
											Static457.aClass4_Sub20_Sub1_5.method4590(local3888.length() + 1);
											Static457.aClass4_Sub20_Sub1_5.method4599(local3888);
											return;
										}
										if (arg0 == 3106) {
											local3888 = aStringArray5[--anInt1607];
											Static448.method6134(Static326.aClass212_78);
											Static457.aClass4_Sub20_Sub1_5.method4590(local3888.length() + 1);
											Static457.aClass4_Sub20_Sub1_5.method4599(local3888);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray118[--anInt1611];
											local1101 = aStringArray5[--anInt1607];
											Static100.method1891(local1101, local13);
											return;
										}
										if (arg0 == 3108) {
											anInt1611 -= 3;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											local25 = anIntArray118[anInt1611 + 2];
											local35 = Static92.method1820(local25);
											Static5.method62(local19, local13, local35);
											return;
										}
										if (arg0 == 3109) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											local210 = arg1 ? aClass240_2 : aClass240_3;
											Static5.method62(local19, local13, local210);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray118[--anInt1611];
											Static448.method6134(Static239.aClass212_65);
											Static457.aClass4_Sub20_Sub1_5.method4558(local13);
											return;
										}
										if (arg0 == 3111) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											local3751 = (Class4_Sub39) Static157.aClass96_22.method2797((long) local13);
											if (local3751 != null) {
												Static298.method4546(local3751, local3751.anInt6721 != local19, true);
											}
											Static20.method5766(true, local19, 3, local13);
											return;
										}
										if (arg0 == 3112) {
											anInt1611--;
											local13 = anIntArray118[anInt1611];
											local3649 = (Class4_Sub39) Static157.aClass96_22.method2797((long) local13);
											if (local3649 != null && local3649.anInt6722 == 3) {
												Static298.method4546(local3649, true, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static154.method2863(aStringArray5[--anInt1607]);
											return;
										}
										if (arg0 == 3114) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											local1488 = aStringArray5[--anInt1607];
											Static238.method4006("", local13, local1488, "", local19);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt1611 -= 3;
											Static420.method5852(anIntArray118[anInt1611 + 1], anIntArray118[anInt1611], 255, anIntArray118[anInt1611 + 2]);
											return;
										}
										if (arg0 == 3201) {
											Static356.method5132(anIntArray118[--anInt1611], 255, 50);
											return;
										}
										if (arg0 == 3202) {
											anInt1611 -= 2;
											Static6.method64(255, anIntArray118[anInt1611 + 1], anIntArray118[anInt1611]);
											return;
										}
										if (arg0 == 3203) {
											anInt1611 -= 4;
											Static420.method5852(anIntArray118[anInt1611 + 1], anIntArray118[anInt1611], anIntArray118[anInt1611 + 3], anIntArray118[anInt1611 + 2]);
											return;
										}
										if (arg0 == 3204) {
											anInt1611 -= 3;
											Static356.method5132(anIntArray118[anInt1611], anIntArray118[anInt1611 + 1], anIntArray118[anInt1611 + 2]);
											return;
										}
										if (arg0 == 3205) {
											anInt1611 -= 3;
											Static6.method64(anIntArray118[anInt1611 + 2], anIntArray118[anInt1611 + 1], anIntArray118[anInt1611]);
											return;
										}
										if (arg0 == 3206) {
											anInt1611 -= 4;
											Static236.method3985(anIntArray118[anInt1611 + 2], anIntArray118[anInt1611], anIntArray118[anInt1611 + 1], anIntArray118[anInt1611 + 3]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray118[anInt1611++] = Static277.anInt2834;
											return;
										}
										if (arg0 == 3301) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = Static396.method5600(local13, local19, false);
											return;
										}
										if (arg0 == 3302) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = Static240.method4013(local19, local13, false);
											return;
										}
										if (arg0 == 3303) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = Static380.method5392(false, local13, local19);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static434.aClass166_1.method4183(local13).anInt6268;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static19.anIntArray23[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static103.anIntArray193[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static155.anIntArray262[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4605) byte local4605 = Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100;
											local19 = (Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514 >> 7) + Static426.anInt7325;
											local25 = (Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515 >> 7) + Static72.anInt1776;
											anIntArray118[anInt1611++] = (local4605 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray118[anInt1611++] = Static289.aBoolean384 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = Static396.method5600(local13, local19, true);
											return;
										}
										if (arg0 == 3314) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = Static240.method4013(local19, local13, true);
											return;
										}
										if (arg0 == 3315) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = Static380.method5392(true, local13, local19);
											return;
										}
										if (arg0 == 3316) {
											if (Static70.anInt1720 >= 2) {
												anIntArray118[anInt1611++] = Static70.anInt1720;
												return;
											}
											anIntArray118[anInt1611++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray118[anInt1611++] = Static293.anInt5391;
											return;
										}
										if (arg0 == 3318) {
											anIntArray118[anInt1611++] = Static302.aClass9_6.anInt84;
											return;
										}
										if (arg0 == 3321) {
											anIntArray118[anInt1611++] = Static76.anInt1857;
											return;
										}
										if (arg0 == 3322) {
											anIntArray118[anInt1611++] = Static443.anInt7558;
											return;
										}
										if (arg0 == 3323) {
											if (Static56.anInt1346 >= 5 && Static56.anInt1346 <= 9) {
												anIntArray118[anInt1611++] = 1;
												return;
											}
											anIntArray118[anInt1611++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static56.anInt1346 >= 5 && Static56.anInt1346 <= 9) {
												anIntArray118[anInt1611++] = Static56.anInt1346;
												return;
											}
											anIntArray118[anInt1611++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray118[anInt1611++] = Static445.aBoolean558 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray118[anInt1611++] = Static52.aClass11_Sub5_Sub2_Sub1_2.anInt4174;
											return;
										}
										if (arg0 == 3327) {
											anIntArray118[anInt1611++] = Static52.aClass11_Sub5_Sub2_Sub1_2.aClass90_1.aBoolean187 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray118[anInt1611++] = Static317.aBoolean427 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static44.method926(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = Static374.method5326(local19, local13, false);
											return;
										}
										if (arg0 == 3332) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = Static374.method5326(local19, local13, true);
											return;
										}
										if (arg0 == 3333) {
											anIntArray118[anInt1611++] = Static67.anInt1640;
											return;
										}
										if (arg0 == 3335) {
											anIntArray118[anInt1611++] = Static168.anInt3290;
											return;
										}
										if (arg0 == 3336) {
											anInt1611 -= 4;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											local25 = anIntArray118[anInt1611 + 2];
											local353 = anIntArray118[anInt1611 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray118[anInt1611++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray118[anInt1611++] = Static399.anInt7070;
											return;
										}
										if (arg0 == 3338) {
											anIntArray118[anInt1611++] = Static389.method5452();
											return;
										}
										if (arg0 == 3339) {
											anIntArray118[anInt1611++] = Static135.aBoolean185 ? 1 : 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray118[anInt1611++] = Static155.aBoolean211 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray118[anInt1611++] = Static332.aBoolean441 ? 1 : 0;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5261) Class43 local5261;
										if (arg0 == 3400) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											local5261 = Static166.aClass246_3.method5653(local13);
											aStringArray5[anInt1607++] = local5261.method1209(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt1611 -= 4;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											local25 = anIntArray118[anInt1611 + 2];
											local353 = anIntArray118[anInt1611 + 3];
											@Pc(5307) Class43 local5307 = Static166.aClass246_3.method5653(local25);
											if (local5307.aChar2 == local13 && local5307.aChar1 == local19) {
												if (local19 == 115) {
													aStringArray5[anInt1607++] = local5307.method1209(local353);
													return;
												}
												anIntArray118[anInt1611++] = local5307.method1212(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt1611 -= 3;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											local25 = anIntArray118[anInt1611 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5383) Class43 local5383 = Static166.aClass246_3.method5653(local19);
											if (local5383.aChar1 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray118[anInt1611++] = local5383.method1204(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray118[--anInt1611];
											local1101 = aStringArray5[--anInt1607];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5261 = Static166.aClass246_3.method5653(local13);
											if (local5261.aChar1 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray118[anInt1611++] = local5261.method1205(local1101) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray118[--anInt1611];
											@Pc(5481) Class43 local5481 = Static166.aClass246_3.method5653(local13);
											anIntArray118[anInt1611++] = local5481.aClass96_6.method2807();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static6.anInt75 == 0) {
												anIntArray118[anInt1611++] = -2;
												return;
											}
											if (Static6.anInt75 == 1) {
												anIntArray118[anInt1611++] = -1;
												return;
											}
											anIntArray118[anInt1611++] = Static65.anInt1626;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray118[--anInt1611];
											if (Static6.anInt75 == 2 && local13 < Static65.anInt1626) {
												aStringArray5[anInt1607++] = Static75.aStringArray9[local13];
												if (Static108.aStringArray10[local13] != null) {
													aStringArray5[anInt1607++] = Static108.aStringArray10[local13];
													return;
												}
												aStringArray5[anInt1607++] = "";
												return;
											}
											aStringArray5[anInt1607++] = "";
											aStringArray5[anInt1607++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray118[--anInt1611];
											if (Static6.anInt75 == 2 && local13 < Static65.anInt1626) {
												anIntArray118[anInt1611++] = Static269.anIntArray390[local13];
												return;
											}
											anIntArray118[anInt1611++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray118[--anInt1611];
											if (Static6.anInt75 == 2 && local13 < Static65.anInt1626) {
												anIntArray118[anInt1611++] = Static158.anIntArray216[local13];
												return;
											}
											anIntArray118[anInt1611++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local3888 = aStringArray5[--anInt1607];
											local19 = anIntArray118[--anInt1611];
											Static277.method2548(local3888, local19);
											return;
										}
										if (arg0 == 3605) {
											local3888 = aStringArray5[--anInt1607];
											Static348.method5081(local3888);
											return;
										}
										if (arg0 == 3606) {
											local3888 = aStringArray5[--anInt1607];
											Static39.method806(local3888);
											return;
										}
										if (arg0 == 3607) {
											local3888 = aStringArray5[--anInt1607];
											Static434.method5972(false, local3888);
											return;
										}
										if (arg0 == 3608) {
											local3888 = aStringArray5[--anInt1607];
											Static460.method6241(local3888);
											return;
										}
										if (arg0 == 3609) {
											local3888 = aStringArray5[--anInt1607];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray118[anInt1611++] = Static151.method2801(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray118[--anInt1611];
											if (Static6.anInt75 == 2 && local13 < Static65.anInt1626) {
												aStringArray5[anInt1607++] = Static5.aStringArray1[local13];
												return;
											}
											aStringArray5[anInt1607++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static43.aString5 != null) {
												aStringArray5[anInt1607++] = Static451.method6167(Static43.aString5);
												return;
											}
											aStringArray5[anInt1607++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static43.aString5 != null) {
												anIntArray118[anInt1611++] = Static422.anInt7300;
												return;
											}
											anIntArray118[anInt1611++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray118[--anInt1611];
											if (Static43.aString5 != null && local13 < Static422.anInt7300) {
												aStringArray5[anInt1607++] = Static87.aClass152Array1[local13].aString36;
												return;
											}
											aStringArray5[anInt1607++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray118[--anInt1611];
											if (Static43.aString5 != null && local13 < Static422.anInt7300) {
												anIntArray118[anInt1611++] = Static87.aClass152Array1[local13].anInt4611;
												return;
											}
											anIntArray118[anInt1611++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray118[--anInt1611];
											if (Static43.aString5 != null && local13 < Static422.anInt7300) {
												anIntArray118[anInt1611++] = Static87.aClass152Array1[local13].aByte47;
												return;
											}
											anIntArray118[anInt1611++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray118[anInt1611++] = Static265.aByte67;
											return;
										}
										if (arg0 == 3617) {
											local3888 = aStringArray5[--anInt1607];
											Static71.method1563(local3888);
											return;
										}
										if (arg0 == 3618) {
											anIntArray118[anInt1611++] = Static186.aByte25;
											return;
										}
										if (arg0 == 3619) {
											local3888 = aStringArray5[--anInt1607];
											Static139.method2561(local3888);
											return;
										}
										if (arg0 == 3620) {
											Static198.method3513();
											return;
										}
										if (arg0 == 3621) {
											if (Static6.anInt75 == 0) {
												anIntArray118[anInt1611++] = -1;
												return;
											}
											anIntArray118[anInt1611++] = Static401.anInt7085;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray118[--anInt1611];
											if (Static6.anInt75 != 0 && local13 < Static401.anInt7085) {
												aStringArray5[anInt1607++] = Static225.aStringArray20[local13];
												if (Static244.aStringArray22[local13] != null) {
													aStringArray5[anInt1607++] = Static244.aStringArray22[local13];
													return;
												}
												aStringArray5[anInt1607++] = "";
												return;
											}
											aStringArray5[anInt1607++] = "";
											aStringArray5[anInt1607++] = "";
											return;
										}
										if (arg0 == 3623) {
											local3888 = aStringArray5[--anInt1607];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray118[anInt1611++] = Static75.method1641(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray118[--anInt1611];
											if (Static87.aClass152Array1 != null && local13 < Static422.anInt7300 && Static87.aClass152Array1[local13].aString37.equalsIgnoreCase(Static52.aClass11_Sub5_Sub2_Sub1_2.aString31)) {
												anIntArray118[anInt1611++] = 1;
												return;
											}
											anIntArray118[anInt1611++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static386.aString78 != null) {
												aStringArray5[anInt1607++] = Static386.aString78;
												return;
											}
											aStringArray5[anInt1607++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray118[--anInt1611];
											if (Static43.aString5 != null && local13 < Static422.anInt7300) {
												aStringArray5[anInt1607++] = Static87.aClass152Array1[local13].aString39;
												return;
											}
											aStringArray5[anInt1607++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray118[--anInt1611];
											if (Static6.anInt75 == 2 && local13 >= 0 && local13 < Static65.anInt1626) {
												anIntArray118[anInt1611++] = Static121.aBooleanArray154[local13] ? 1 : 0;
												return;
											}
											anIntArray118[anInt1611++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local3888 = aStringArray5[--anInt1607];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray118[anInt1611++] = Static293.method4489(local3888);
											return;
										}
										if (arg0 == 3629) {
											anIntArray118[anInt1611++] = Static464.anInt7954;
											return;
										}
										if (arg0 == 3630) {
											local3888 = aStringArray5[--anInt1607];
											Static434.method5972(true, local3888);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static295.aBooleanArray106[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray118[--anInt1611];
											if (Static43.aString5 != null && local13 < Static422.anInt7300) {
												aStringArray5[anInt1607++] = Static87.aClass152Array1[local13].aString37;
												return;
											}
											aStringArray5[anInt1607++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray118[--anInt1611];
											if (Static6.anInt75 != 0 && local13 < Static401.anInt7085) {
												aStringArray5[anInt1607++] = Static146.aStringArray15[local13];
												return;
											}
											aStringArray5[anInt1607++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static329.aClass155Array1[local13].method4017();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static329.aClass155Array1[local13].anInt4713;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static329.aClass155Array1[local13].anInt4708;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static329.aClass155Array1[local13].anInt4707;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static329.aClass155Array1[local13].anInt4711;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static329.aClass155Array1[local13].anInt4710;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray118[--anInt1611];
											local19 = Static329.aClass155Array1[local13].method4016();
											anIntArray118[anInt1611++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray118[--anInt1611];
											local19 = Static329.aClass155Array1[local13].method4016();
											anIntArray118[anInt1611++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray118[--anInt1611];
											local19 = Static329.aClass155Array1[local13].method4016();
											anIntArray118[anInt1611++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray118[--anInt1611];
											local19 = Static329.aClass155Array1[local13].method4016();
											anIntArray118[anInt1611++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt1611 -= 5;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											local25 = anIntArray118[anInt1611 + 2];
											local353 = anIntArray118[anInt1611 + 3];
											local2290 = anIntArray118[anInt1611 + 4];
											anIntArray118[anInt1611++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
											return;
										}
										@Pc(6991) long local6991;
										@Pc(6984) long local6984;
										if (arg0 == 4007) {
											anInt1611 -= 2;
											local6984 = anIntArray118[anInt1611];
											local6991 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = (int) (local6984 + local6984 * local6991 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											if (local13 == 0) {
												anIntArray118[anInt1611++] = 0;
												return;
											}
											anIntArray118[anInt1611++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											if (local13 == 0) {
												anIntArray118[anInt1611++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray118[anInt1611++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray118[anInt1611++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt1611 -= 3;
											local6984 = anIntArray118[anInt1611];
											local6991 = anIntArray118[anInt1611 + 1];
											@Pc(7372) long local7372 = (long) anIntArray118[anInt1611 + 2];
											anIntArray118[anInt1611++] = (int) (local6984 * local7372 / local6991);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local3888 = aStringArray5[--anInt1607];
											local19 = anIntArray118[--anInt1611];
											aStringArray5[anInt1607++] = local3888 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt1607 -= 2;
											local3888 = aStringArray5[anInt1607];
											local1101 = aStringArray5[anInt1607 + 1];
											aStringArray5[anInt1607++] = local3888 + local1101;
											return;
										}
										if (arg0 == 4102) {
											local3888 = aStringArray5[--anInt1607];
											local19 = anIntArray118[--anInt1611];
											aStringArray5[anInt1607++] = local3888 + Static206.method3645(local19);
											return;
										}
										if (arg0 == 4103) {
											local3888 = aStringArray5[--anInt1607];
											aStringArray5[anInt1607++] = local3888.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray5[anInt1607++] = method1468(anIntArray118[--anInt1611]);
											return;
										}
										if (arg0 == 4105) {
											anInt1607 -= 2;
											local3888 = aStringArray5[anInt1607];
											local1101 = aStringArray5[anInt1607 + 1];
											if (Static52.aClass11_Sub5_Sub2_Sub1_2.aClass90_1 != null && Static52.aClass11_Sub5_Sub2_Sub1_2.aClass90_1.aBoolean187) {
												aStringArray5[anInt1607++] = local1101;
												return;
											}
											aStringArray5[anInt1607++] = local3888;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray118[--anInt1611];
											aStringArray5[anInt1607++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt1607 -= 2;
											anIntArray118[anInt1611++] = Static184.method3363(aStringArray5[anInt1607], aStringArray5[anInt1607 + 1], Static168.anInt3290);
											return;
										}
										@Pc(7655) Class84 local7655;
										if (arg0 == 4108) {
											local3888 = aStringArray5[--anInt1607];
											anInt1611 -= 2;
											local19 = anIntArray118[anInt1611];
											local25 = anIntArray118[anInt1611 + 1];
											local7655 = Static413.method5731(Static300.aClass38_60, local25);
											anIntArray118[anInt1611++] = local7655.method2380(Static307.aClass2Array45, local19, local3888);
											return;
										}
										if (arg0 == 4109) {
											local3888 = aStringArray5[--anInt1607];
											anInt1611 -= 2;
											local19 = anIntArray118[anInt1611];
											local25 = anIntArray118[anInt1611 + 1];
											local7655 = Static413.method5731(Static300.aClass38_60, local25);
											anIntArray118[anInt1611++] = local7655.method2375(Static307.aClass2Array45, local19, local3888);
											return;
										}
										if (arg0 == 4110) {
											anInt1607 -= 2;
											local3888 = aStringArray5[anInt1607];
											local1101 = aStringArray5[anInt1607 + 1];
											if (anIntArray118[--anInt1611] == 1) {
												aStringArray5[anInt1607++] = local3888;
												return;
											}
											aStringArray5[anInt1607++] = local1101;
											return;
										}
										if (arg0 == 4111) {
											local3888 = aStringArray5[--anInt1607];
											aStringArray5[anInt1607++] = Static105.method2007(local3888);
											return;
										}
										if (arg0 == 4112) {
											local3888 = aStringArray5[--anInt1607];
											local19 = anIntArray118[--anInt1611];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray5[anInt1607++] = local3888 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static275.method4380((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static241.method4019((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static101.method1900((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static251.method4118((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local3888 = aStringArray5[--anInt1607];
											if (local3888 != null) {
												anIntArray118[anInt1611++] = local3888.length();
												return;
											}
											anIntArray118[anInt1611++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local3888 = aStringArray5[--anInt1607];
											anInt1611 -= 2;
											local19 = anIntArray118[anInt1611];
											local25 = anIntArray118[anInt1611 + 1];
											aStringArray5[anInt1607++] = local3888.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local3888 = aStringArray5[--anInt1607];
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
											aStringArray5[anInt1607++] = local8018.toString();
											return;
										}
										if (arg0 == 4120) {
											local3888 = aStringArray5[--anInt1607];
											anInt1611 -= 2;
											local19 = anIntArray118[anInt1611];
											local25 = anIntArray118[anInt1611 + 1];
											anIntArray118[anInt1611++] = local3888.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt1607 -= 2;
											local3888 = aStringArray5[anInt1607];
											local1101 = aStringArray5[anInt1607 + 1];
											local25 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = local3888.indexOf(local1101, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray118[--anInt1611] != 0;
											local19 = anIntArray118[--anInt1611];
											aStringArray5[anInt1607++] = Static214.method3761(0, (long) local19, local412, Static168.anInt3290);
											return;
										}
										if (arg0 == 4125) {
											local3888 = aStringArray5[--anInt1607];
											local19 = anIntArray118[--anInt1611];
											@Pc(8241) Class84 local8241 = Static413.method5731(Static300.aClass38_60, local19);
											anIntArray118[anInt1611++] = local8241.method2383(Static307.aClass2Array45, local3888);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray118[--anInt1611];
											aStringArray5[anInt1607++] = Static139.aClass193_1.method4650(local13).aString82;
											return;
										}
										@Pc(8303) Class274 local8303;
										if (arg0 == 4201) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											local8303 = Static139.aClass193_1.method4650(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray37[local19 - 1] != null) {
												aStringArray5[anInt1607++] = local8303.aStringArray37[local19 - 1];
												return;
											}
											aStringArray5[anInt1607++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											local8303 = Static139.aClass193_1.method4650(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray36[local19 - 1] != null) {
												aStringArray5[anInt1607++] = local8303.aStringArray36[local19 - 1];
												return;
											}
											aStringArray5[anInt1607++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static139.aClass193_1.method4650(local13).anInt7863;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static139.aClass193_1.method4650(local13).anInt7881 == 1 ? 1 : 0;
											return;
										}
										@Pc(8466) Class274 local8466;
										if (arg0 == 4205) {
											local13 = anIntArray118[--anInt1611];
											local8466 = Static139.aClass193_1.method4650(local13);
											if (local8466.anInt7893 == -1 && local8466.anInt7873 >= 0) {
												anIntArray118[anInt1611++] = local8466.anInt7873;
												return;
											}
											anIntArray118[anInt1611++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray118[--anInt1611];
											local8466 = Static139.aClass193_1.method4650(local13);
											if (local8466.anInt7893 >= 0 && local8466.anInt7873 >= 0) {
												anIntArray118[anInt1611++] = local8466.anInt7873;
												return;
											}
											anIntArray118[anInt1611++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray118[--anInt1611];
											anIntArray118[anInt1611++] = Static139.aClass193_1.method4650(local13).aBoolean578 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											local3017 = Static203.aClass202_1.method4864(local19);
											if (local3017.method4372()) {
												aStringArray5[anInt1607++] = Static139.aClass193_1.method4650(local13).method6256(local19, local3017.aString44);
												return;
											}
											anIntArray118[anInt1611++] = Static139.aClass193_1.method4650(local13).method6251(local19, local3017.anInt5158);
											return;
										}
										if (arg0 == 4209) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1] - 1;
											local8303 = Static139.aClass193_1.method4650(local13);
											if (local8303.anInt7878 == local19) {
												anIntArray118[anInt1611++] = local8303.anInt7904;
												return;
											}
											if (local8303.anInt7909 == local19) {
												anIntArray118[anInt1611++] = local8303.anInt7923;
												return;
											}
											anIntArray118[anInt1611++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local3888 = aStringArray5[--anInt1607];
											local19 = anIntArray118[--anInt1611];
											Static113.method2201(local3888, local19 == 1);
											anIntArray118[anInt1611++] = Static412.anInt7173;
											return;
										}
										if (arg0 == 4211) {
											if (Static148.aShortArray90 != null && Static253.anInt4882 < Static412.anInt7173) {
												anIntArray118[anInt1611++] = Static148.aShortArray90[Static253.anInt4882++] & 0xFFFF;
												return;
											}
											anIntArray118[anInt1611++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static253.anInt4882 = 0;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											local3017 = Static203.aClass202_1.method4864(local19);
											if (local3017.method4372()) {
												aStringArray5[anInt1607++] = Static220.aClass247_1.method5660(local13).method5590(local19, local3017.aString44);
												return;
											}
											anIntArray118[anInt1611++] = Static220.aClass247_1.method5660(local13).method5595(local19, local3017.anInt5158);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											local3017 = Static203.aClass202_1.method4864(local19);
											if (local3017.method4372()) {
												aStringArray5[anInt1607++] = Static146.aClass228_1.method5203(local13).method3749(local19, local3017.aString44);
												return;
											}
											anIntArray118[anInt1611++] = Static146.aClass228_1.method5203(local13).method3756(local19, local3017.anInt5158);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt1611 -= 2;
											local13 = anIntArray118[anInt1611];
											local19 = anIntArray118[anInt1611 + 1];
											local3017 = Static203.aClass202_1.method4864(local19);
											if (local3017.method4372()) {
												aStringArray5[anInt1607++] = Static159.aClass218_1.method5099(local13).method2645(local19, local3017.aString44);
												return;
											}
											anIntArray118[anInt1611++] = Static159.aClass218_1.method5099(local13).method2646(local19, local3017.anInt5158);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray118[--anInt1611];
										@Pc(8967) Class231 local8967 = Static123.aClass223_1.method5135(local13);
										if (local8967.anIntArray517 != null && local8967.anIntArray517.length > 0) {
											local25 = 0;
											local353 = local8967.anIntArray516[0];
											for (local2290 = 1; local2290 < local8967.anIntArray517.length; local2290++) {
												if (local8967.anIntArray516[local2290] > local353) {
													local25 = local2290;
													local353 = local8967.anIntArray516[local2290];
												}
											}
											anIntArray118[anInt1611++] = local8967.anIntArray517[local25];
											return;
										}
										anIntArray118[anInt1611++] = local8967.anInt6402;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static92.method1820(anIntArray118[--anInt1611]);
						} else {
							local137 = arg1 ? aClass240_2 : aClass240_3;
						}
						if (arg0 == 1300) {
							local19 = anIntArray118[--anInt1611] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method5544(local19, aStringArray5[--anInt1607]);
								return;
							}
							anInt1607--;
							return;
						}
						if (arg0 == 1301) {
							anInt1611 -= 2;
							local19 = anIntArray118[anInt1611];
							local25 = anIntArray118[anInt1611 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass240_14 = null;
								return;
							}
							local137.aClass240_14 = Static231.method3929(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray118[--anInt1611];
							if (local19 != Static69.anInt1697 && local19 != Static77.anInt1865 && local19 != Static467.anInt8017) {
								return;
							}
							local137.anInt6868 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt6899 = anIntArray118[--anInt1611];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt6865 = anIntArray118[--anInt1611];
							return;
						}
						if (arg0 == 1305) {
							local137.aString59 = aStringArray5[--anInt1607];
							return;
						}
						if (arg0 == 1306) {
							local137.aString60 = aStringArray5[--anInt1607];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray34 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt6895 = anIntArray118[--anInt1611];
							local137.anInt6914 = anIntArray118[--anInt1611];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray118[--anInt1611];
							local25 = anIntArray118[--anInt1611];
							if (local25 >= 1 && local25 <= 10) {
								local137.method5539(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString63 = aStringArray5[--anInt1607];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt6859 = anIntArray118[--anInt1611];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt1611 -= 3;
								local19 = anIntArray118[anInt1611] - 1;
								local25 = anIntArray118[anInt1611 + 1];
								local353 = anIntArray118[anInt1611 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt1611 -= 2;
								local19 = 10;
								local25 = anIntArray118[anInt1611];
								local353 = anIntArray118[anInt1611 + 1];
							}
							if (local137.aByteArray89 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray89 = new byte[11];
								local137.aByteArray88 = new byte[11];
								local137.anIntArray552 = new int[11];
							}
							local137.aByteArray89[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean504 = false;
								for (local2290 = 0; local2290 < local137.aByteArray89.length; local2290++) {
									if (local137.aByteArray89[local2290] != 0) {
										local137.aBoolean504 = true;
										break;
									}
								}
							} else {
								local137.aBoolean504 = true;
							}
							local137.aByteArray88[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt6872 = anIntArray118[--anInt1611];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static92.method1820(anIntArray118[--anInt1611]);
					} else {
						local137 = arg1 ? aClass240_2 : aClass240_3;
					}
					Static273.method4374(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt1611 -= 2;
						local19 = anIntArray118[anInt1611];
						local25 = anIntArray118[anInt1611 + 1];
						if (local137.anInt6885 == -1) {
							Static305.method4693(local137.anInt6909);
							Static169.method4393(local137.anInt6909);
							Static140.method2579(local137.anInt6909);
						}
						if (local19 == -1) {
							local137.anInt6880 = 1;
							local137.anInt6902 = -1;
							local137.anInt6876 = -1;
							return;
						}
						local137.anInt6876 = local19;
						local137.anInt6881 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean505 = true;
						} else {
							local137.aBoolean505 = false;
						}
						@Pc(1630) Class274 local1630 = Static139.aClass193_1.method4650(local19);
						local137.anInt6875 = local1630.anInt7865;
						local137.anInt6887 = local1630.anInt7913;
						local137.anInt6903 = local1630.anInt7872;
						local137.anInt6849 = local1630.anInt7903;
						local137.anInt6912 = local1630.anInt7897;
						local137.anInt6851 = local1630.anInt7874;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt6916 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt6916 = 1;
						} else {
							local137.anInt6916 = 2;
						}
						if (local137.anInt6841 > 0) {
							local137.anInt6851 = local137.anInt6851 * 32 / local137.anInt6841;
							return;
						}
						if (local137.anInt6892 > 0) {
							local137.anInt6851 = local137.anInt6851 * 32 / local137.anInt6892;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt6880 = 2;
						local137.anInt6902 = anIntArray118[--anInt1611];
						if (local137.anInt6885 == -1) {
							Static381.method5399(local137.anInt6909);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt6880 = 3;
						local137.anInt6902 = -1;
						if (local137.anInt6885 == -1) {
							Static381.method5399(local137.anInt6909);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt6880 = 6;
						local137.anInt6902 = anIntArray118[--anInt1611];
						if (local137.anInt6885 == -1) {
							Static381.method5399(local137.anInt6909);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt6880 = 5;
						local137.anInt6902 = anIntArray118[--anInt1611];
						if (local137.anInt6885 == -1) {
							Static381.method5399(local137.anInt6909);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt1611 -= 4;
						local137.anInt6925 = anIntArray118[anInt1611];
						local137.anInt6863 = anIntArray118[anInt1611 + 1];
						local137.lb = anIntArray118[anInt1611 + 2];
						local137.anInt6864 = anIntArray118[anInt1611 + 3];
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt1611 -= 2;
						local137.anInt6905 = anIntArray118[anInt1611];
						local137.anInt6854 = anIntArray118[anInt1611 + 1];
						Static273.method4374(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt1611 -= 4;
						local137.anInt6902 = anIntArray118[anInt1611];
						local137.anInt6869 = anIntArray118[anInt1611 + 1];
						if (anIntArray118[anInt1611 + 2] == 1) {
							local137.anInt6880 = 9;
						} else {
							local137.anInt6880 = 8;
						}
						if (anIntArray118[anInt1611 + 3] == 1) {
							local137.aBoolean505 = true;
						} else {
							local137.aBoolean505 = false;
						}
						if (local137.anInt6885 == -1) {
							Static381.method5399(local137.anInt6909);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt6880 = 5;
						local137.anInt6902 = Static147.anInt3062;
						local137.anInt6869 = 0;
						if (local137.anInt6885 == -1) {
							Static381.method5399(local137.anInt6909);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static92.method1820(anIntArray118[--anInt1611]);
				} else {
					local137 = arg1 ? aClass240_2 : aClass240_3;
				}
				if (arg0 == 1000) {
					anInt1611 -= 4;
					local137.anInt6920 = anIntArray118[anInt1611];
					local137.anInt6913 = anIntArray118[anInt1611 + 1];
					local19 = anIntArray118[anInt1611 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray118[anInt1611 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte83 = (byte) local19;
					local137.aByte84 = (byte) local25;
					Static273.method4374(local137);
					Static188.method3409(local137);
					if (local137.anInt6885 == -1) {
						Static244.method4060(local137.anInt6909);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt1611 -= 4;
					local137.anInt6892 = anIntArray118[anInt1611];
					local137.anInt6860 = anIntArray118[anInt1611 + 1];
					local137.anInt6841 = 0;
					local137.anInt6896 = 0;
					local19 = anIntArray118[anInt1611 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray118[anInt1611 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte85 = (byte) local19;
					local137.aByte86 = (byte) local25;
					Static273.method4374(local137);
					Static188.method3409(local137);
					if (local137.anInt6873 == 0) {
						Static354.method5123(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray118[--anInt1611] == 1;
					if (local137.aBoolean502 != local620) {
						local137.aBoolean502 = local620;
						Static273.method4374(local137);
					}
					if (local137.anInt6885 == -1) {
						Static461.method4616(local137.anInt6909);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt1611 -= 2;
					local137.anInt6927 = anIntArray118[anInt1611];
					local137.anInt6888 = anIntArray118[anInt1611 + 1];
					Static273.method4374(local137);
					Static188.method3409(local137);
					if (local137.anInt6873 == 0) {
						Static354.method5123(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean510 = anIntArray118[--anInt1611] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	private static void method1471(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = Static92.method1820(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class240[] local13 = Static110.aClass240ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class240[] local19 = Static122.aClass240ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static110.aClass240ArrayArray1[local9] = new Class240[local22];
			Static474.method3329(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static474.method3329(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
	public static void method1472(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static104.method1974(arg0)) {
			return;
		}
		@Pc(12) Class240[] local12 = Static122.aClass240ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class240 local19 = local12[local14];
			if (local19.anObjectArray26 != null) {
				@Pc(26) Class4_Sub10 local26 = new Class4_Sub10();
				local26.aClass240_5 = local19;
				local26.anObjectArray4 = local19.anObjectArray26;
				method1463(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method1473(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static70.anInt1720 == 0 && (Static238.aBoolean310 && !Static53.aBoolean301 || Static317.aBoolean427)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static326.aClass21_98.method362(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static326.aClass21_98.method362(0).length());
		} else if (local11.startsWith(Static162.aClass21_21.method362(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static162.aClass21_21.method362(0).length());
		} else if (local11.startsWith(Static405.aClass21_110.method362(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static405.aClass21_110.method362(0).length());
		} else if (local11.startsWith(Static103.aClass21_28.method362(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static103.aClass21_28.method362(0).length());
		} else if (local11.startsWith(Static261.aClass21_71.method362(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static261.aClass21_71.method362(0).length());
		} else if (local11.startsWith(Static355.aClass21_102.method362(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static355.aClass21_102.method362(0).length());
		} else if (local11.startsWith(Static19.aClass21_1.method362(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static19.aClass21_1.method362(0).length());
		} else if (local11.startsWith(Static238.aClass21_66.method362(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static238.aClass21_66.method362(0).length());
		} else if (local11.startsWith(Static336.aClass21_100.method362(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static336.aClass21_100.method362(0).length());
		} else if (local11.startsWith(Static367.aClass21_114.method362(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static367.aClass21_114.method362(0).length());
		} else if (local11.startsWith(Static21.aClass21_2.method362(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static21.aClass21_2.method362(0).length());
		} else if (local11.startsWith(Static200.aClass21_50.method362(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static200.aClass21_50.method362(0).length());
		} else if (Static168.anInt3290 != 0) {
			if (local11.startsWith(Static326.aClass21_98.method362(Static168.anInt3290))) {
				local13 = 0;
				arg0 = arg0.substring(Static326.aClass21_98.method362(Static168.anInt3290).length());
			} else if (local11.startsWith(Static162.aClass21_21.method362(Static168.anInt3290))) {
				local13 = 1;
				arg0 = arg0.substring(Static162.aClass21_21.method362(Static168.anInt3290).length());
			} else if (local11.startsWith(Static405.aClass21_110.method362(Static168.anInt3290))) {
				local13 = 2;
				arg0 = arg0.substring(Static405.aClass21_110.method362(Static168.anInt3290).length());
			} else if (local11.startsWith(Static103.aClass21_28.method362(Static168.anInt3290))) {
				local13 = 3;
				arg0 = arg0.substring(Static103.aClass21_28.method362(Static168.anInt3290).length());
			} else if (local11.startsWith(Static261.aClass21_71.method362(Static168.anInt3290))) {
				local13 = 4;
				arg0 = arg0.substring(Static261.aClass21_71.method362(Static168.anInt3290).length());
			} else if (local11.startsWith(Static355.aClass21_102.method362(Static168.anInt3290))) {
				local13 = 5;
				arg0 = arg0.substring(Static355.aClass21_102.method362(Static168.anInt3290).length());
			} else if (local11.startsWith(Static19.aClass21_1.method362(Static168.anInt3290))) {
				local13 = 6;
				arg0 = arg0.substring(Static19.aClass21_1.method362(Static168.anInt3290).length());
			} else if (local11.startsWith(Static238.aClass21_66.method362(Static168.anInt3290))) {
				local13 = 7;
				arg0 = arg0.substring(Static238.aClass21_66.method362(Static168.anInt3290).length());
			} else if (local11.startsWith(Static336.aClass21_100.method362(Static168.anInt3290))) {
				local13 = 8;
				arg0 = arg0.substring(Static336.aClass21_100.method362(Static168.anInt3290).length());
			} else if (local11.startsWith(Static367.aClass21_114.method362(Static168.anInt3290))) {
				local13 = 9;
				arg0 = arg0.substring(Static367.aClass21_114.method362(Static168.anInt3290).length());
			} else if (local11.startsWith(Static21.aClass21_2.method362(Static168.anInt3290))) {
				local13 = 10;
				arg0 = arg0.substring(Static21.aClass21_2.method362(Static168.anInt3290).length());
			} else if (local11.startsWith(Static200.aClass21_50.method362(Static168.anInt3290))) {
				local13 = 11;
				arg0 = arg0.substring(Static200.aClass21_50.method362(Static168.anInt3290).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static453.aClass21_121.method362(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static453.aClass21_121.method362(0).length());
		} else if (local11.startsWith(Static284.aClass21_82.method362(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static284.aClass21_82.method362(0).length());
		} else if (local11.startsWith(Static386.aClass21_116.method362(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static386.aClass21_116.method362(0).length());
		} else if (local11.startsWith(Static63.aClass21_18.method362(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static63.aClass21_18.method362(0).length());
		} else if (local11.startsWith(Static229.aClass21_61.method362(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static229.aClass21_61.method362(0).length());
		} else if (Static168.anInt3290 != 0) {
			if (local11.startsWith(Static453.aClass21_121.method362(Static168.anInt3290))) {
				local451 = 1;
				arg0 = arg0.substring(Static453.aClass21_121.method362(Static168.anInt3290).length());
			} else if (local11.startsWith(Static284.aClass21_82.method362(Static168.anInt3290))) {
				local451 = 2;
				arg0 = arg0.substring(Static284.aClass21_82.method362(Static168.anInt3290).length());
			} else if (local11.startsWith(Static386.aClass21_116.method362(Static168.anInt3290))) {
				local451 = 3;
				arg0 = arg0.substring(Static386.aClass21_116.method362(Static168.anInt3290).length());
			} else if (local11.startsWith(Static63.aClass21_18.method362(Static168.anInt3290))) {
				local451 = 4;
				arg0 = arg0.substring(Static63.aClass21_18.method362(Static168.anInt3290).length());
			} else if (local11.startsWith(Static229.aClass21_61.method362(Static168.anInt3290))) {
				local451 = 5;
				arg0 = arg0.substring(Static229.aClass21_61.method362(Static168.anInt3290).length());
			}
		}
		Static448.method6134(Static177.aClass212_51);
		Static457.aClass4_Sub20_Sub1_5.method4590(0);
		@Pc(646) int local646 = Static457.aClass4_Sub20_Sub1_5.anInt5526;
		if (arg1 == 5021) {
			Static457.aClass4_Sub20_Sub1_5.method4590(1);
		} else if (arg1 == 5022) {
			Static457.aClass4_Sub20_Sub1_5.method4590(2);
		} else {
			Static457.aClass4_Sub20_Sub1_5.method4590(0);
		}
		Static457.aClass4_Sub20_Sub1_5.method4590(local13);
		Static457.aClass4_Sub20_Sub1_5.method4590(local451);
		Static196.method6081(arg0, Static457.aClass4_Sub20_Sub1_5);
		Static457.aClass4_Sub20_Sub1_5.method4567(Static457.aClass4_Sub20_Sub1_5.anInt5526 - local646);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!hu;I)V")
	private static void method1474(@OriginalArg(0) Class4_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		anInt1611 = 0;
		anInt1607 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray265;
		@Pc(11) int[] local11 = arg0.anIntArray264;
		@Pc(13) byte local13 = -1;
		anInt1604 = 0;
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
						method1469(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method1467(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray118[anInt1611++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray118[anInt1611++] = Static67.aClass224_1.anIntArray506[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static67.aClass224_1.method5159(local54, anIntArray118[--anInt1611]);
					} else if (local31 == 3) {
						aStringArray5[anInt1607++] = arg0.aStringArray16[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt1611 -= 2;
						if (anIntArray118[anInt1611] != anIntArray118[anInt1611 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt1611 -= 2;
						if (anIntArray118[anInt1611] == anIntArray118[anInt1611 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt1611 -= 2;
						if (anIntArray118[anInt1611] < anIntArray118[anInt1611 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt1611 -= 2;
						if (anIntArray118[anInt1611] > anIntArray118[anInt1611 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt1604 == 0) {
							return;
						}
						@Pc(216) Class109 local216 = aClass109Array1[--anInt1604];
						arg0 = local216.aClass4_Sub1_Sub11_1;
						local8 = arg0.anIntArray265;
						local11 = arg0.anIntArray264;
						local5 = local216.anInt3373;
						anIntArray119 = local216.anIntArray275;
						aStringArray6 = local216.aStringArray17;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray118[anInt1611++] = Static67.aClass224_1.method5154(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static67.aClass224_1.method5160(local54, anIntArray118[--anInt1611]);
					} else if (local31 == 31) {
						anInt1611 -= 2;
						if (anIntArray118[anInt1611] <= anIntArray118[anInt1611 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt1611 -= 2;
						if (anIntArray118[anInt1611] >= anIntArray118[anInt1611 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray118[anInt1611++] = anIntArray119[local11[local5]];
					} else if (local31 == 34) {
						anIntArray119[local11[local5]] = anIntArray118[--anInt1611];
					} else if (local31 == 35) {
						aStringArray5[anInt1607++] = aStringArray6[local11[local5]];
					} else if (local31 == 36) {
						aStringArray6[local11[local5]] = aStringArray5[--anInt1607];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt1607 -= local54;
						@Pc(400) String local400 = Static70.method1550(aStringArray5, local54, anInt1607);
						aStringArray5[anInt1607++] = local400;
					} else if (local31 == 38) {
						anInt1611--;
					} else if (local31 == 39) {
						anInt1607--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class4_Sub1_Sub11 local436 = Static230.method3926(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt3234];
							@Pc(450) String[] local450 = new String[local436.anInt3239];
							for (local452 = 0; local452 < local436.anInt3236; local452++) {
								local446[local452] = anIntArray118[anInt1611 + local452 - local436.anInt3236];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt3238; local471++) {
								local450[local471] = aStringArray5[anInt1607 + local471 - local436.anInt3238];
							}
							anInt1611 -= local436.anInt3236;
							anInt1607 -= local436.anInt3238;
							@Pc(502) Class109 local502 = new Class109();
							local502.aClass4_Sub1_Sub11_1 = arg0;
							local502.anInt3373 = local5;
							local502.anIntArray275 = anIntArray119;
							local502.aStringArray17 = aStringArray6;
							if (anInt1604 >= aClass109Array1.length) {
								throw new RuntimeException();
							}
							aClass109Array1[anInt1604++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray265;
							local11 = local436.anIntArray264;
							local5 = -1;
							anIntArray119 = local446;
							aStringArray6 = local450;
						} else if (local31 == 42) {
							anIntArray118[anInt1611++] = Static355.anIntArray503[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static355.anIntArray503[local54] = anIntArray118[--anInt1611];
							Static393.method5543(local54);
							Static67.aBoolean117 |= Static241.aBooleanArray89[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray118[--anInt1611];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray117[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray8[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray118[--anInt1611];
							if (local603 < 0 || local603 >= anIntArray117[local54]) {
								throw new RuntimeException();
							}
							anIntArray118[anInt1611++] = anIntArrayArray8[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt1611 -= 2;
							local603 = anIntArray118[anInt1611];
							if (local603 < 0 || local603 >= anIntArray117[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray8[local54][local603] = anIntArray118[anInt1611 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static256.aStringArray25[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray5[anInt1607++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static256.aStringArray25[local54] = aStringArray5[--anInt1607];
							Static215.method3945(local54);
						} else if (local31 == 51) {
							@Pc(774) Class96 local774 = arg0.aClass96Array1[local11[local5]];
							@Pc(787) Class4_Sub16 local787 = (Class4_Sub16) local774.method2797((long) anIntArray118[--anInt1611]);
							if (local787 != null) {
								local5 += local787.anInt2197;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString23 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong228).append(" ");
				for (local603 = anInt1604 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass109Array1[local603].aClass4_Sub1_Sub11_1.aLong228).append(" ");
				}
				local855.append("op: ").append(local13);
				Static417.method5814(local837, local855.toString());
			} else {
				Static200.method3529("Clientscript error in: " + arg0.aString23);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString23).append("\n");
				for (local603 = anInt1604 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass109Array1[local603].aClass4_Sub1_Sub11_1.aString23).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static417.method5814(local837, local855.toString());
				Static328.method4873(local855.toString());
			}
		}
	}
}
