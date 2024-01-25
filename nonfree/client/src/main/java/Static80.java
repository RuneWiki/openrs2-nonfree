import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dea", name = "i", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray9;

	@OriginalMember(owner = "client!dea", name = "k", descriptor = "[I")
	private static int[] anIntArray144;

	@OriginalMember(owner = "client!dea", name = "l", descriptor = "Lclient!vg;")
	private static Class341 aClass341_6;

	@OriginalMember(owner = "client!dea", name = "p", descriptor = "Lclient!fc;")
	private static Class99 aClass99_1;

	@OriginalMember(owner = "client!dea", name = "t", descriptor = "Lclient!vg;")
	private static Class341 aClass341_7;

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "I")
	private static int anInt1759 = 0;

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "[Lclient!iv;")
	private static final Class165[] aClass165Array1 = new Class165[50];

	@OriginalMember(owner = "client!dea", name = "h", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!dea", name = "j", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray10 = new String[1000];

	@OriginalMember(owner = "client!dea", name = "q", descriptor = "I")
	private static int anInt1766 = 0;

	@OriginalMember(owner = "client!dea", name = "r", descriptor = "[I")
	private static final int[] anIntArray145 = new int[5];

	@OriginalMember(owner = "client!dea", name = "s", descriptor = "[[I")
	private static final int[][] anIntArrayArray40 = new int[5][5000];

	@OriginalMember(owner = "client!dea", name = "v", descriptor = "[I")
	private static final int[] anIntArray146 = new int[1000];

	@OriginalMember(owner = "client!dea", name = "y", descriptor = "I")
	private static int anInt1770 = 0;

	@OriginalMember(owner = "client!dea", name = "z", descriptor = "Lclient!mf;")
	public static final Class222 aClass222_8 = new Class222(4);

	@OriginalMember(owner = "client!dea", name = "A", descriptor = "[I")
	private static final int[] anIntArray147 = new int[3];

	@OriginalMember(owner = "client!dea", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray11 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!dea", name = "C", descriptor = "I")
	private static int anInt1771 = 0;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V")
	private static void method1446(@OriginalArg(0) int arg0) {
		@Pc(3) Class341 local3 = Static350.method4758(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class341[] local13 = Static294.aClass341ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class341[] local19 = Static578.aClass341ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static294.aClass341ArrayArray1[local9] = new Class341[local22];
			Static598.method1175(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static598.method1175(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)V")
	private static void method1447(@OriginalArg(0) int arg0) {
		@Pc(3) Class341 local3 = Static350.method4758(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class341[] local13 = Static294.aClass341ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class341[] local19 = Static578.aClass341ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static294.aClass341ArrayArray1[local9] = new Class341[local22];
			Static598.method1175(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static598.method1175(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!ds;I)V")
	private static void method1448(@OriginalArg(0) Class1_Sub15 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub6_Sub10 local12 = Static120.method1903(local8);
		if (local12 == null) {
			return;
		}
		anIntArray144 = new int[local12.anInt5635];
		@Pc(21) int local21 = 0;
		aStringArray9 = new String[local12.anInt5637];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt2003;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt2002;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass341_10 == null ? -1 : arg0.aClass341_10.anInt9306;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2004;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass341_10 == null ? -1 : arg0.aClass341_10.anInt9270;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass341_9 == null ? -1 : arg0.aClass341_9.anInt9306;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass341_9 == null ? -1 : arg0.aClass341_9.anInt9270;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt2001;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt1997;
				}
				anIntArray144[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString17;
				}
				aStringArray9[local27++] = local135;
			}
		}
		anInt1771 = arg0.anInt1999;
		method1457(local12, arg1);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IZ)V")
	private static void method1449(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class1_Sub11 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray146[anInt1770++] = Static351.anInt5833;
				return;
			}
			if (arg0 == 5001) {
				anInt1770 -= 3;
				Static351.anInt5833 = anIntArray146[anInt1770];
				Static417.aClass23_7 = Static321.method4409(anIntArray146[anInt1770 + 1]);
				if (Static417.aClass23_7 == null) {
					Static417.aClass23_7 = Static554.aClass23_8;
				}
				Static10.anInt136 = anIntArray146[anInt1770 + 2];
				local52 = Static276.method3885(Static373.aClass70_66, Static481.aClass276_2);
				local52.aClass1_Sub35_Sub2_1.method5777(Static351.anInt5833);
				local52.aClass1_Sub35_Sub2_1.method5777(Static417.aClass23_7.anInt388);
				local52.aClass1_Sub35_Sub2_1.method5777(Static10.anInt136);
				Static48.method743(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt1766 -= 2;
				local83 = aStringArray10[anInt1766];
				local89 = aStringArray10[anInt1766 + 1];
				anInt1770 -= 2;
				local97 = anIntArray146[anInt1770];
				local103 = anIntArray146[anInt1770 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class1_Sub11 local125 = Static276.method3885(Static290.aClass70_53, Static481.aClass276_2);
				local125.aClass1_Sub35_Sub2_1.method5777(Static358.method4886(local83) + Static358.method4886(local89) + 2);
				local125.aClass1_Sub35_Sub2_1.method5761(local83);
				local125.aClass1_Sub35_Sub2_1.method5777(local97 - 1);
				local125.aClass1_Sub35_Sub2_1.method5777(local103);
				local125.aClass1_Sub35_Sub2_1.method5761(local89);
				Static48.method743(local125);
				return;
			}
			@Pc(179) Class307 local179;
			if (arg0 == 5003) {
				local175 = anIntArray146[--anInt1770];
				local179 = Static390.method5396(local175);
				local181 = "";
				if (local179 != null && local179.aString81 != null) {
					local181 = local179.aString81;
				}
				aStringArray10[anInt1766++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray146[--anInt1770];
				local179 = Static390.method5396(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8087;
				}
				anIntArray146[anInt1770++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static417.aClass23_7 == null) {
					anIntArray146[anInt1770++] = -1;
					return;
				}
				anIntArray146[anInt1770++] = Static417.aClass23_7.anInt388;
				return;
			}
			@Pc(269) Class1_Sub11 local269;
			if (arg0 == 5006) {
				local175 = anIntArray146[--anInt1770];
				local269 = Static276.method3885(Static348.aClass70_61, Static481.aClass276_2);
				local269.aClass1_Sub35_Sub2_1.method5777(local175);
				Static48.method743(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray10[--anInt1766];
				method1456(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt1766 -= 2;
				local83 = aStringArray10[anInt1766];
				local89 = aStringArray10[anInt1766 + 1];
				if (Static267.anInt4711 != 0 || (!Static274.aBoolean30 || Static357.aBoolean467) && !Static422.aBoolean573) {
					@Pc(328) Class1_Sub11 local328 = Static276.method3885(Static486.aClass70_85, Static481.aClass276_2);
					local328.aClass1_Sub35_Sub2_1.method5777(0);
					local103 = local328.aClass1_Sub35_Sub2_1.anInt7214;
					local328.aClass1_Sub35_Sub2_1.method5761(local83);
					Static205.method7547(local328.aClass1_Sub35_Sub2_1, local89);
					local328.aClass1_Sub35_Sub2_1.method5791(local328.aClass1_Sub35_Sub2_1.anInt7214 - local103);
					Static48.method743(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray146[--anInt1770];
				local179 = Static390.method5396(local175);
				local181 = "";
				if (local179 != null && local179.aString78 != null) {
					local181 = local179.aString78;
				}
				aStringArray10[anInt1766++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray146[--anInt1770];
				local179 = Static390.method5396(local175);
				local181 = "";
				if (local179 != null && local179.aString82 != null) {
					local181 = local179.aString82;
				}
				aStringArray10[anInt1766++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray146[--anInt1770];
				local179 = Static390.method5396(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8085;
				}
				anIntArray146[anInt1770++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == null || Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aString15 == null) {
					local83 = Static157.aString27;
				} else {
					local83 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.method1438();
				}
				aStringArray10[anInt1766++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray146[anInt1770++] = Static10.anInt136;
				return;
			}
			if (arg0 == 5017) {
				anIntArray146[anInt1770++] = Static115.method1811();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray146[--anInt1770];
				local179 = Static390.method5396(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt8086;
				}
				anIntArray146[anInt1770++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray146[--anInt1770];
				local179 = Static390.method5396(local175);
				local181 = "";
				if (local179 != null && local179.aString79 != null) {
					local181 = local179.aString79;
				}
				aStringArray10[anInt1766++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == null || Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aString15 == null) {
					local83 = Static157.aString27;
				} else {
					local83 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.method1441();
				}
				aStringArray10[anInt1766++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray146[--anInt1770];
				local179 = Static390.method5396(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8084;
				}
				anIntArray146[anInt1770++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray146[--anInt1770];
				local179 = Static390.method5396(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8088;
				}
				anIntArray146[anInt1770++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray146[--anInt1770];
				local179 = Static390.method5396(local175);
				local181 = "";
				if (local179 != null && local179.aString80 != null) {
					local181 = local179.aString80;
				}
				aStringArray10[anInt1766++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray146[--anInt1770];
				aStringArray10[anInt1766++] = Static378.aClass19_1.method272(local175).aString51;
				return;
			}
			@Pc(736) Class1_Sub6_Sub9 local736;
			if (arg0 == 5051) {
				local175 = anIntArray146[--anInt1770];
				local736 = Static378.aClass19_1.method272(local175);
				if (local736.anIntArray430 == null) {
					anIntArray146[anInt1770++] = 0;
					return;
				}
				anIntArray146[anInt1770++] = local736.anIntArray430.length;
				return;
			}
			if (arg0 == 5052) {
				anInt1770 -= 2;
				local175 = anIntArray146[anInt1770];
				local776 = anIntArray146[anInt1770 + 1];
				@Pc(781) Class1_Sub6_Sub9 local781 = Static378.aClass19_1.method272(local175);
				local103 = local781.anIntArray430[local776];
				anIntArray146[anInt1770++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray146[--anInt1770];
				local736 = Static378.aClass19_1.method272(local175);
				if (local736.anIntArray431 == null) {
					anIntArray146[anInt1770++] = 0;
					return;
				}
				anIntArray146[anInt1770++] = local736.anIntArray431.length;
				return;
			}
			if (arg0 == 5054) {
				anInt1770 -= 2;
				local175 = anIntArray146[anInt1770];
				local776 = anIntArray146[anInt1770 + 1];
				anIntArray146[anInt1770++] = Static378.aClass19_1.method272(local175).anIntArray431[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray146[--anInt1770];
				aStringArray10[anInt1766++] = Static183.aClass366_1.method7873(local175).method6223();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray146[--anInt1770];
				@Pc(907) Class1_Sub6_Sub13 local907 = Static183.aClass366_1.method7873(local175);
				if (local907.anIntArray602 == null) {
					anIntArray146[anInt1770++] = 0;
					return;
				}
				anIntArray146[anInt1770++] = local907.anIntArray602.length;
				return;
			}
			if (arg0 == 5057) {
				anInt1770 -= 2;
				local175 = anIntArray146[anInt1770];
				local776 = anIntArray146[anInt1770 + 1];
				anIntArray146[anInt1770++] = Static183.aClass366_1.method7873(local175).anIntArray602[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass99_1 = new Class99();
				aClass99_1.anInt2536 = anIntArray146[--anInt1770];
				aClass99_1.aClass1_Sub6_Sub13_1 = Static183.aClass366_1.method7873(aClass99_1.anInt2536);
				aClass99_1.anIntArray219 = new int[aClass99_1.aClass1_Sub6_Sub13_1.method6230()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static276.method3885(Static220.aClass70_41, Static481.aClass276_2);
				local52.aClass1_Sub35_Sub2_1.method5777(0);
				local776 = local52.aClass1_Sub35_Sub2_1.anInt7214;
				local52.aClass1_Sub35_Sub2_1.method5777(0);
				local52.aClass1_Sub35_Sub2_1.method5776(aClass99_1.anInt2536);
				aClass99_1.aClass1_Sub6_Sub13_1.method6229(aClass99_1.anIntArray219, local52.aClass1_Sub35_Sub2_1);
				local52.aClass1_Sub35_Sub2_1.method5791(local52.aClass1_Sub35_Sub2_1.anInt7214 - local776);
				Static48.method743(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray10[--anInt1766];
				local269 = Static276.method3885(Static498.aClass70_90, Static481.aClass276_2);
				local269.aClass1_Sub35_Sub2_1.method5777(0);
				local97 = local269.aClass1_Sub35_Sub2_1.anInt7214;
				local269.aClass1_Sub35_Sub2_1.method5761(local83);
				local269.aClass1_Sub35_Sub2_1.method5776(aClass99_1.anInt2536);
				aClass99_1.aClass1_Sub6_Sub13_1.method6229(aClass99_1.anIntArray219, local269.aClass1_Sub35_Sub2_1);
				local269.aClass1_Sub35_Sub2_1.method5791(local269.aClass1_Sub35_Sub2_1.anInt7214 - local97);
				Static48.method743(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static276.method3885(Static220.aClass70_41, Static481.aClass276_2);
				local52.aClass1_Sub35_Sub2_1.method5777(0);
				local776 = local52.aClass1_Sub35_Sub2_1.anInt7214;
				local52.aClass1_Sub35_Sub2_1.method5777(1);
				local52.aClass1_Sub35_Sub2_1.method5776(aClass99_1.anInt2536);
				aClass99_1.aClass1_Sub6_Sub13_1.method6229(aClass99_1.anIntArray219, local52.aClass1_Sub35_Sub2_1);
				local52.aClass1_Sub35_Sub2_1.method5791(local52.aClass1_Sub35_Sub2_1.anInt7214 - local776);
				Static48.method743(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt1770 -= 2;
				local175 = anIntArray146[anInt1770];
				local776 = anIntArray146[anInt1770 + 1];
				anIntArray146[anInt1770++] = Static378.aClass19_1.method272(local175).aCharArray3[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt1770 -= 2;
				local175 = anIntArray146[anInt1770];
				local776 = anIntArray146[anInt1770 + 1];
				anIntArray146[anInt1770++] = Static378.aClass19_1.method272(local175).aCharArray2[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt1770 -= 2;
				local175 = anIntArray146[anInt1770];
				local776 = anIntArray146[anInt1770 + 1];
				if (local776 == -1) {
					anIntArray146[anInt1770++] = -1;
					return;
				}
				anIntArray146[anInt1770++] = Static378.aClass19_1.method272(local175).method4470((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt1770 -= 2;
				local175 = anIntArray146[anInt1770];
				local776 = anIntArray146[anInt1770 + 1];
				if (local776 == -1) {
					anIntArray146[anInt1770++] = -1;
					return;
				}
				anIntArray146[anInt1770++] = Static378.aClass19_1.method272(local175).method4472((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray146[--anInt1770];
				anIntArray146[anInt1770++] = Static183.aClass366_1.method7873(local175).method6230();
				return;
			}
			if (arg0 == 5067) {
				anInt1770 -= 2;
				local175 = anIntArray146[anInt1770];
				local776 = anIntArray146[anInt1770 + 1];
				local97 = Static183.aClass366_1.method7873(local175).method6233(local776).anInt2586;
				anIntArray146[anInt1770++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt1770 -= 2;
				local175 = anIntArray146[anInt1770];
				local776 = anIntArray146[anInt1770 + 1];
				aClass99_1.anIntArray219[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt1770 -= 2;
				local175 = anIntArray146[anInt1770];
				local776 = anIntArray146[anInt1770 + 1];
				aClass99_1.anIntArray219[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt1770 -= 3;
				local175 = anIntArray146[anInt1770];
				local776 = anIntArray146[anInt1770 + 1];
				local97 = anIntArray146[anInt1770 + 2];
				@Pc(1448) Class1_Sub6_Sub13 local1448 = Static183.aClass366_1.method7873(local175);
				if (local1448.method6233(local776).anInt2586 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray146[anInt1770++] = local1448.method6227(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray10[--anInt1766];
				local1496 = anIntArray146[--anInt1770] == 1;
				Static382.method5242(local1496, local83);
				anIntArray146[anInt1770++] = Static86.anInt1814;
				return;
			}
			if (arg0 == 5072) {
				if (Static101.aShortArray46 != null && Static33.anInt2652 < Static86.anInt1814) {
					anIntArray146[anInt1770++] = Static101.aShortArray46[Static33.anInt2652++] & 0xFFFF;
					return;
				}
				anIntArray146[anInt1770++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static33.anInt2652 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static137.aClass295_1.method7719(86)) {
					anIntArray146[anInt1770++] = 1;
					return;
				}
				anIntArray146[anInt1770++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static137.aClass295_1.method7719(82)) {
					anIntArray146[anInt1770++] = 1;
					return;
				}
				anIntArray146[anInt1770++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static137.aClass295_1.method7719(81)) {
					anIntArray146[anInt1770++] = 1;
					return;
				}
				anIntArray146[anInt1770++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static196.method2987(anIntArray146[--anInt1770]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray146[anInt1770++] = Static498.method6985();
					return;
				}
				if (arg0 == 5205) {
					Static222.method3418(-1, false, anIntArray146[--anInt1770], -1);
					return;
				}
				@Pc(1696) Class1_Sub6_Sub11 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray146[--anInt1770];
					local1696 = Static226.method5082(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray146[anInt1770++] = -1;
						return;
					}
					anIntArray146[anInt1770++] = local1696.anInt6669;
					return;
				}
				@Pc(1729) Class1_Sub6_Sub11 local1729;
				if (arg0 == 5207) {
					local1729 = Static226.method5077(anIntArray146[--anInt1770]);
					if (local1729 != null && local1729.aString67 != null) {
						aStringArray10[anInt1766++] = local1729.aString67;
						return;
					}
					aStringArray10[anInt1766++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray146[anInt1770++] = Static408.anInt7103;
					anIntArray146[anInt1770++] = Static9.anInt128;
					return;
				}
				if (arg0 == 5209) {
					anIntArray146[anInt1770++] = Static71.anInt1407 + Static226.anInt6317;
					anIntArray146[anInt1770++] = Static197.anInt6246 + Static226.anInt6318;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray146[--anInt1770];
					local1696 = Static226.method5077(local175);
					if (local1696 == null) {
						anIntArray146[anInt1770++] = 0;
						anIntArray146[anInt1770++] = 0;
						return;
					}
					anIntArray146[anInt1770++] = local1696.anInt6656 >> 14 & 0x3FFF;
					anIntArray146[anInt1770++] = local1696.anInt6656 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray146[--anInt1770];
					local1696 = Static226.method5077(local175);
					if (local1696 == null) {
						anIntArray146[anInt1770++] = 0;
						anIntArray146[anInt1770++] = 0;
						return;
					}
					anIntArray146[anInt1770++] = local1696.anInt6654 - local1696.anInt6664;
					anIntArray146[anInt1770++] = local1696.anInt6660 - local1696.anInt6659;
					return;
				}
				@Pc(1919) Class1_Sub32 local1919;
				if (arg0 == 5212) {
					local1919 = Static228.method3474();
					if (local1919 == null) {
						anIntArray146[anInt1770++] = -1;
						anIntArray146[anInt1770++] = -1;
						return;
					}
					anIntArray146[anInt1770++] = local1919.anInt5300;
					local776 = local1919.anInt5296 << 28 | local1919.anInt5301 + Static226.anInt6317 << 14 | local1919.anInt5298 + Static226.anInt6318;
					anIntArray146[anInt1770++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static106.method1740();
					if (local1919 == null) {
						anIntArray146[anInt1770++] = -1;
						anIntArray146[anInt1770++] = -1;
						return;
					}
					anIntArray146[anInt1770++] = local1919.anInt5300;
					local776 = local1919.anInt5296 << 28 | local1919.anInt5301 + Static226.anInt6317 << 14 | local1919.anInt5298 + Static226.anInt6318;
					anIntArray146[anInt1770++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray146[--anInt1770];
					local1696 = Static420.method5833();
					if (local1696 != null) {
						local2067 = local1696.method5339(local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF, local175 & 0x3FFF, anIntArray147);
						if (local2067) {
							Static242.method3627(anIntArray147[2], anIntArray147[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt1770 -= 2;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					@Pc(2105) Class125 local2105 = Static226.method5074(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class1_Sub6_Sub11 local2112 = (Class1_Sub6_Sub11) local2105.method2423(); local2112 != null; local2112 = (Class1_Sub6_Sub11) local2105.method2428()) {
						if (local2112.anInt6669 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray146[anInt1770++] = 1;
						return;
					}
					anIntArray146[anInt1770++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray146[--anInt1770];
					local1696 = Static226.method5077(local175);
					if (local1696 == null) {
						anIntArray146[anInt1770++] = -1;
						return;
					}
					anIntArray146[anInt1770++] = local1696.anInt6657;
					return;
				}
				if (arg0 == 5220) {
					anIntArray146[anInt1770++] = Static271.anInt4778 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray146[--anInt1770];
					Static242.method3627(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static420.method5833();
					if (local1729 != null) {
						local1496 = local1729.method5336(Static197.anInt6246 + Static226.anInt6318, Static71.anInt1407 + Static226.anInt6317, anIntArray147);
						if (local1496) {
							anIntArray146[anInt1770++] = anIntArray147[1];
							anIntArray146[anInt1770++] = anIntArray147[2];
							return;
						}
						anIntArray146[anInt1770++] = -1;
						anIntArray146[anInt1770++] = -1;
						return;
					}
					anIntArray146[anInt1770++] = -1;
					anIntArray146[anInt1770++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt1770 -= 2;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					Static222.method3418(local776 >> 14 & 0x3FFF, false, local175, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray146[--anInt1770];
					local1696 = Static420.method5833();
					if (local1696 != null) {
						local2067 = local1696.method5339(local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF, local175 & 0x3FFF, anIntArray147);
						if (local2067) {
							anIntArray146[anInt1770++] = anIntArray147[1];
							anIntArray146[anInt1770++] = anIntArray147[2];
							return;
						}
						anIntArray146[anInt1770++] = -1;
						anIntArray146[anInt1770++] = -1;
						return;
					}
					anIntArray146[anInt1770++] = -1;
					anIntArray146[anInt1770++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray146[--anInt1770];
					local1696 = Static420.method5833();
					if (local1696 != null) {
						local2067 = local1696.method5336(local175 & 0x3FFF, local175 >> 14 & 0x3FFF, anIntArray147);
						if (local2067) {
							anIntArray146[anInt1770++] = anIntArray147[1];
							anIntArray146[anInt1770++] = anIntArray147[2];
							return;
						}
						anIntArray146[anInt1770++] = -1;
						anIntArray146[anInt1770++] = -1;
						return;
					}
					anIntArray146[anInt1770++] = -1;
					anIntArray146[anInt1770++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static194.method2956(anIntArray146[--anInt1770]);
					return;
				}
				if (arg0 == 5227) {
					anInt1770 -= 2;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					Static222.method3418(local776 >> 14 & 0x3FFF, true, local175, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static333.aBoolean449 = anIntArray146[--anInt1770] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray146[anInt1770++] = Static333.aBoolean449 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray146[--anInt1770];
					Static72.method1232(local175);
					return;
				}
				@Pc(2625) Class1 local2625;
				if (arg0 == 5231) {
					anInt1770 -= 2;
					local175 = anIntArray146[anInt1770];
					local1496 = anIntArray146[anInt1770 + 1] == 1;
					if (Static25.aClass187_5 != null) {
						local2625 = Static25.aClass187_5.method3797((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method7859();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class1();
							Static25.aClass187_5.method3795(local2625, (long) local175);
						}
					}
					return;
				}
				@Pc(2667) Class1 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray146[--anInt1770];
					if (Static25.aClass187_5 != null) {
						local2667 = Static25.aClass187_5.method3797((long) local175);
						anIntArray146[anInt1770++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray146[anInt1770++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt1770 -= 2;
					local175 = anIntArray146[anInt1770];
					local1496 = anIntArray146[anInt1770 + 1] == 1;
					if (Static321.aClass187_22 != null) {
						local2625 = Static321.aClass187_22.method3797((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method7859();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class1();
							Static321.aClass187_22.method3795(local2625, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray146[--anInt1770];
					if (Static321.aClass187_22 != null) {
						local2667 = Static321.aClass187_22.method3797((long) local175);
						anIntArray146[anInt1770++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray146[anInt1770++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray146[anInt1770++] = Static226.aClass1_Sub6_Sub11_2 == null ? -1 : Static226.aClass1_Sub6_Sub11_2.anInt6669;
					return;
				}
				if (arg0 == 5236) {
					anInt1770 -= 2;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static30.method383(local103, local175, local97);
					if (local2833 < 0) {
						anIntArray146[anInt1770++] = -1;
						return;
					}
					anIntArray146[anInt1770++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static193.method2952();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt1770 -= 2;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					Static198.method2994(3, local175, false, local776);
					anIntArray146[anInt1770++] = Static264.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static264.aFrame2 != null) {
						Static198.method2994(Static348.aClass1_Sub30_Sub1_1.anInt4878, -1, false, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2917) Class359[] local2917 = Static102.method1688();
					anIntArray146[anInt1770++] = local2917.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray146[--anInt1770];
					@Pc(2941) Class359[] local2941 = Static102.method1688();
					anIntArray146[anInt1770++] = local2941[local175].anInt9567;
					anIntArray146[anInt1770++] = local2941[local175].anInt9566;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static348.aClass1_Sub30_Sub1_1.anInt4873;
					local776 = Static348.aClass1_Sub30_Sub1_1.anInt4860;
					local97 = -1;
					@Pc(2978) Class359[] local2978 = Static102.method1688();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class359 local2985 = local2978[local2833];
						if (local2985.anInt9567 == local175 && local2985.anInt9566 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray146[anInt1770++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray146[anInt1770++] = Static195.method2980();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray146[--anInt1770];
					if (local175 >= 1 && local175 <= 2) {
						Static198.method2994(local175, -1, false, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4878;
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray146[--anInt1770];
					if (local175 >= 1 && local175 <= 2) {
						Static348.aClass1_Sub30_Sub1_1.anInt4878 = local175;
						Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt1766 -= 2;
					local83 = aStringArray10[anInt1766];
					local89 = aStringArray10[anInt1766 + 1];
					local97 = anIntArray146[--anInt1770];
					@Pc(3124) Class1_Sub11 local3124 = Static276.method3885(Static409.aClass70_71, Static481.aClass276_2);
					local3124.aClass1_Sub35_Sub2_1.method5777(Static358.method4886(local83) + Static358.method4886(local89) + 1);
					local3124.aClass1_Sub35_Sub2_1.method5761(local83);
					local3124.aClass1_Sub35_Sub2_1.method5761(local89);
					local3124.aClass1_Sub35_Sub2_1.method5777(local97);
					Static48.method743(local3124);
					return;
				}
				if (arg0 == 5401) {
					anInt1770 -= 2;
					Static433.aShortArray128[anIntArray146[anInt1770]] = (short) Static473.method6471(anIntArray146[anInt1770 + 1]);
					Static175.aClass114_4.method2215();
					Static175.aClass114_4.method2218();
					Static322.aClass326_2.method7243();
					Static164.method7470();
					return;
				}
				if (arg0 == 5405) {
					anInt1770 -= 2;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static405.anIntArrayArrayArray14[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt1770 -= 7;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1] << 1;
					local97 = anIntArray146[anInt1770 + 2];
					local103 = anIntArray146[anInt1770 + 3];
					local2833 = anIntArray146[anInt1770 + 4];
					@Pc(3262) int local3262 = anIntArray146[anInt1770 + 5];
					@Pc(3268) int local3268 = anIntArray146[anInt1770 + 6];
					if (local175 >= 0 && local175 < 2 && Static405.anIntArrayArrayArray14[local175] != null && local776 >= 0 && local776 < Static405.anIntArrayArrayArray14[local175].length) {
						Static405.anIntArrayArrayArray14[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3268 };
						Static405.anIntArrayArrayArray14[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3262 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static405.anIntArrayArrayArray14[anIntArray146[--anInt1770]].length >> 1;
					anIntArray146[anInt1770++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static264.aFrame2 != null) {
						Static198.method2994(Static348.aClass1_Sub30_Sub1_1.anInt4878, -1, false, -1);
					}
					if (Static142.aFrame1 != null) {
						Static356.method4864();
						System.exit(0);
						return;
					}
					local83 = Static367.aString60 == null ? Static419.method5827() : Static367.aString60;
					Static383.method5284(Static362.aClass109_5, local83, Static113.anInt2222 == 1, false);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static1.aClass260_1 != null) {
						if (Static1.aClass260_1.anObject16 == null) {
							local83 = Static427.method5932(Static1.aClass260_1.anInt7040);
						} else {
							local83 = (String) Static1.aClass260_1.anObject16;
						}
					}
					aStringArray10[anInt1766++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray146[anInt1770++] = Static362.aClass109_5.aBoolean206 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static264.aFrame2 != null) {
						Static198.method2994(Static348.aClass1_Sub30_Sub1_1.anInt4878, -1, false, -1);
					}
					local83 = aStringArray10[--anInt1766];
					local1496 = anIntArray146[--anInt1770] == 1;
					local181 = Static419.method5827() + local83;
					Static383.method5284(Static362.aClass109_5, local181, Static113.anInt2222 == 1, local1496);
					return;
				}
				if (arg0 == 5422) {
					anInt1766 -= 2;
					local83 = aStringArray10[anInt1766];
					local89 = aStringArray10[anInt1766 + 1];
					local97 = anIntArray146[--anInt1770];
					if (local83.length() > 0) {
						if (Static404.aStringArray30 == null) {
							Static404.aStringArray30 = new String[Static28.anIntArray44[Static246.aClass195_2.anInt4912]];
						}
						Static404.aStringArray30[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static161.aStringArray17 == null) {
							Static161.aStringArray17 = new String[Static28.anIntArray44[Static246.aClass195_2.anInt4912]];
						}
						Static161.aStringArray17[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray10[--anInt1766]);
					return;
				}
				if (arg0 == 5424) {
					anInt1770 -= 11;
					Static297.anInt5115 = anIntArray146[anInt1770];
					Static403.anInt7064 = anIntArray146[anInt1770 + 1];
					Static75.anInt9090 = anIntArray146[anInt1770 + 2];
					Static281.anInt4929 = anIntArray146[anInt1770 + 3];
					Static150.anInt2741 = anIntArray146[anInt1770 + 4];
					Static167.anInt2974 = anIntArray146[anInt1770 + 5];
					Static25.anInt346 = anIntArray146[anInt1770 + 6];
					Static142.anInt2694 = anIntArray146[anInt1770 + 7];
					Static248.anInt4546 = anIntArray146[anInt1770 + 8];
					Static50.anInt929 = anIntArray146[anInt1770 + 9];
					Static99.anInt5668 = anIntArray146[anInt1770 + 10];
					Static463.aClass270_98.method5694(Static150.anInt2741);
					Static463.aClass270_98.method5694(Static167.anInt2974);
					Static463.aClass270_98.method5694(Static25.anInt346);
					Static463.aClass270_98.method5694(Static142.anInt2694);
					Static463.aClass270_98.method5694(Static248.anInt4546);
					Static220.aClass22_21 = null;
					Static260.aClass22_25 = null;
					Static199.aClass22_19 = null;
					Static259.aClass22_24 = null;
					Static274.aClass22_2 = null;
					Static143.aClass22_14 = null;
					Static264.aClass22_26 = null;
					Static242.aClass22_23 = null;
					Static244.aBoolean336 = true;
					return;
				}
				if (arg0 == 5425) {
					Static342.method4693();
					Static244.aBoolean336 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt1770 -= 2;
					Static196.anInt3665 = anIntArray146[anInt1770];
					Static374.anInt6269 = anIntArray146[anInt1770 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt1770 -= 2;
					Static398.anInt7011 = anIntArray146[anInt1770 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt1770 -= 2;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					anIntArray146[anInt1770++] = Static197.method5024(local776, local175) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static512.method7118(false, aStringArray10[--anInt1766], false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static602.method2417(Static590.anApplet2, "accountcreated");
						return;
					} catch (@Pc(3800) Throwable local3800) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static602.method2417(Static590.anApplet2, "accountcreatestarted");
						return;
					} catch (@Pc(3811) Throwable local3811) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static314.aClipboard1 != null) {
						@Pc(3823) Transferable local3823 = Static314.aClipboard1.getContents(null);
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
					aStringArray10[anInt1766++] = local83;
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt1770 -= 4;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					local97 = anIntArray146[anInt1770 + 2];
					local103 = anIntArray146[anInt1770 + 3];
					Static132.method2047((local175 & 0x3FFF) - Static116.anInt2289, local97, local776 << 2, local103, false, (local175 >> 14 & 0x3FFF) - Static541.anInt9058);
					return;
				}
				if (arg0 == 5501) {
					anInt1770 -= 4;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					local97 = anIntArray146[anInt1770 + 2];
					local103 = anIntArray146[anInt1770 + 3];
					Static485.method6557(local103, local97, local776 << 2, (local175 >> 14 & 0x3FFF) - Static541.anInt9058, (local175 & 0x3FFF) - Static116.anInt2289);
					return;
				}
				if (arg0 == 5502) {
					anInt1770 -= 6;
					local175 = anIntArray146[anInt1770];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static110.anInt2171 = local175;
					local776 = anIntArray146[anInt1770 + 1];
					if (local776 + 1 >= Static405.anIntArrayArrayArray14[Static110.anInt2171].length >> 1) {
						throw new RuntimeException();
					}
					Static275.anInt4801 = local776;
					Static87.anInt5335 = 0;
					Static592.anInt9639 = anIntArray146[anInt1770 + 2];
					Static98.anInt6241 = anIntArray146[anInt1770 + 3];
					local97 = anIntArray146[anInt1770 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static196.anInt3664 = local97;
					local103 = anIntArray146[anInt1770 + 5];
					if (local103 + 1 >= Static405.anIntArrayArrayArray14[Static196.anInt3664].length >> 1) {
						throw new RuntimeException();
					}
					Static579.anInt9072 = local103;
					Static340.anInt5707 = 3;
					Static243.anInt4483 = -1;
					Static442.anInt7679 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static426.method5891();
					return;
				}
				if (arg0 == 5504) {
					anInt1770 -= 2;
					Static437.method6086(anIntArray146[anInt1770], anIntArray146[anInt1770 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray146[anInt1770++] = (int) Static287.aFloat117 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray146[anInt1770++] = (int) Static167.aFloat59 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static341.method2571();
					return;
				}
				if (arg0 == 5508) {
					Static127.method2011();
					return;
				}
				if (arg0 == 5509) {
					Static467.method6428();
					return;
				}
				if (arg0 == 5510) {
					Static131.method2045();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray146[--anInt1770];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static541.anInt9058;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static71.anInt1410) {
						local776 = Static71.anInt1410;
					}
					local97 -= Static116.anInt2289;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static471.anInt8012) {
						local97 = Static471.anInt8012;
					}
					Static177.anInt3135 = (local776 << 9) + 256;
					Static308.anInt5286 = (local97 << 9) + 256;
					Static340.anInt5707 = 4;
					Static243.anInt4483 = -1;
					Static442.anInt7679 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static456.method6297();
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray146[--anInt1770];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static541.anInt9058;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static71.anInt1410) {
							local776 = Static71.anInt1410;
						}
						local97 -= Static116.anInt2289;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static471.anInt8012) {
							local97 = Static471.anInt8012;
						}
						Static442.anInt7679 = (local776 << 9) + 256;
						Static243.anInt4483 = (local97 << 9) + 256;
						return;
					}
					Static442.anInt7679 = -1;
					Static243.anInt4483 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt1766 -= 2;
					local83 = aStringArray10[anInt1766];
					local89 = aStringArray10[anInt1766 + 1];
					local97 = anIntArray146[--anInt1770];
					if (Static216.anInt4135 != 3) {
						return;
					}
					if (Static181.anInt3169 == 0 && Static61.anInt1176 == 0) {
						Static157.aString27 = local83;
						Static399.aString69 = local89;
						Static184.anInt3253 = local97;
						Static426.method5887(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static113.method1788();
					return;
				}
				if (arg0 == 5602) {
					if (Static181.anInt3169 == 0) {
						Static266.anInt4706 = -2;
						Static166.anInt2967 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt1770 -= 4;
					if (Static216.anInt4135 != 3) {
						return;
					}
					if (Static181.anInt3169 == 0 && Static61.anInt1176 == 0) {
						Static180.method4642(anIntArray146[anInt1770 + 3], anIntArray146[anInt1770 + 1], anIntArray146[anInt1770 + 2], anIntArray146[anInt1770]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt1766--;
					if (Static216.anInt4135 != 3) {
						return;
					}
					if (Static181.anInt3169 == 0 && Static61.anInt1176 == 0) {
						Static257.method3756(Static566.method7647(aStringArray10[anInt1766]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt1766 -= 2;
					if (Static216.anInt4135 != 3) {
						return;
					}
					if (Static181.anInt3169 == 0 && Static61.anInt1176 == 0) {
						Static59.method1046(aStringArray10[anInt1766 + 1], false, Static566.method7647(aStringArray10[anInt1766]));
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static61.anInt1176 == 0) {
						Static218.anInt4197 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray146[anInt1770++] = Static166.anInt2967;
					return;
				}
				if (arg0 == 5608) {
					anIntArray146[anInt1770++] = Static437.anInt7656;
					return;
				}
				if (arg0 == 5609) {
					anIntArray146[anInt1770++] = Static218.anInt4197;
					return;
				}
				if (arg0 == 5610) {
					for (local175 = 0; local175 < 5; local175++) {
						aStringArray10[anInt1766++] = Static463.aStringArray33 == null || Static463.aStringArray33.length <= local175 ? "" : Static190.method2926(Static463.aStringArray33[local175]);
					}
					Static463.aStringArray33 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray146[anInt1770++] = Static541.anInt9060;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray146[--anInt1770];
					if (Static216.anInt4135 != 7) {
						return;
					}
					if (Static181.anInt3169 == 0 && Static61.anInt1176 == 0) {
						if (Static568.aClass149_2 != null) {
							Static568.aClass149_2.method3281();
							Static568.aClass149_2 = null;
						}
						Static184.anInt3253 = local175;
						Static426.method5887(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray146[anInt1770++] = Static166.anInt2967;
					return;
				}
				if (arg0 == 5615) {
					anInt1766 -= 2;
					local83 = aStringArray10[anInt1766];
					local89 = aStringArray10[anInt1766 + 1];
					if (Static216.anInt4135 != 3) {
						return;
					}
					if (Static181.anInt3169 == 0 && Static61.anInt1176 == 0) {
						if (Static568.aClass149_2 != null) {
							Static568.aClass149_2.method3281();
							Static568.aClass149_2 = null;
						}
						Static157.aString27 = local83;
						Static399.aString69 = local89;
						Static426.method5887(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static424.method5868(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray146[anInt1770++] = Static266.anInt4706;
					return;
				}
				if (arg0 == 5618) {
					local175 = anIntArray146[--anInt1770];
					Static230.method3482(local175, false);
					return;
				}
				if (arg0 == 5619) {
					local175 = anIntArray146[--anInt1770];
					Static230.method3482(local175, true);
					return;
				}
				if (arg0 == 5620) {
					Static220.method3412();
					if (Static245.aString41 != "" && Static245.aString41 != "") {
						anIntArray146[anInt1770++] = 1;
						return;
					}
					anIntArray146[anInt1770++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt1766 -= 2;
					if (Static216.anInt4135 != 3) {
						return;
					}
					if (Static181.anInt3169 == 0 && Static61.anInt1176 == 0) {
						Static59.method1046(aStringArray10[anInt1766 + 1], true, Static566.method7647(aStringArray10[anInt1766]));
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4719) Class260 local4719 = Static362.aClass109_5.method2169(false, "3");
					while (local4719.anInt7041 == 0) {
						Static391.method5400(1L);
					}
					if (local4719.anInt7041 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4739) Class91 local4739 = (Class91) local4719.anObject16;
					if (local4739.method1837().exists()) {
						@Pc(4749) Class1_Sub35 local4749 = new Class1_Sub35(50);
						try {
							local4739.method1834(50, 0, local4749.aByteArray85);
						} catch (@Pc(4758) IOException local4758) {
						}
					}
					try {
						local4739.method1833();
						return;
					} catch (@Pc(4764) Exception local4764) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static194.aString33 != null) {
						anIntArray146[anInt1770++] = 1;
						return;
					}
					anIntArray146[anInt1770++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray146[anInt1770++] = (int) (Static480.aLong248 >> 32);
					anIntArray146[anInt1770++] = (int) (Static480.aLong248 & 0xFFFFL);
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray146[--anInt1770];
					if (local175 < 1) {
						local175 = 1;
					}
					if (local175 > 4) {
						local175 = 4;
					}
					Static348.aClass1_Sub30_Sub1_1.anInt4882 = local175;
					Static334.method4655();
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6002) {
					Static348.aClass1_Sub30_Sub1_1.method3922(anIntArray146[--anInt1770] == 1);
					Static334.method4655();
					Static468.method6431();
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6003) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean382 = anIntArray146[--anInt1770] == 1;
					Static468.method6431();
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6005) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean392 = anIntArray146[--anInt1770] == 1;
					Static334.method4655();
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6006) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean387 = anIntArray146[--anInt1770] == 1;
					Static16.aClass134_1.method6942(!Static348.aClass1_Sub30_Sub1_1.aBoolean387);
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6007) {
					Static348.aClass1_Sub30_Sub1_1.anInt4874 = anIntArray146[--anInt1770];
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6008) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean396 = anIntArray146[--anInt1770] == 1;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6009) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean384 = anIntArray146[--anInt1770] == 1;
					Static334.method4655();
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6010) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean395 = anIntArray146[--anInt1770] == 1;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6011) {
					local175 = anIntArray146[--anInt1770];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static348.aClass1_Sub30_Sub1_1.method3909(Static113.anInt2222, local175);
					Static334.method4655();
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6012) {
					Static348.aClass1_Sub30_Sub1_1.method3906(Static113.anInt2222, anIntArray146[--anInt1770] == 1);
					Static34.method7180();
					Static475.method6481();
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6014) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean391 = anIntArray146[--anInt1770] == 1;
					Static334.method4655();
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6015) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean380 = anIntArray146[--anInt1770] == 1;
					Static334.method4655();
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6016) {
					local175 = anIntArray146[--anInt1770];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static348.aClass1_Sub30_Sub1_1.anInt4869 = local175;
					Static523.method7235(Static113.anInt2222);
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					return;
				}
				if (arg0 == 6017) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean394 = anIntArray146[--anInt1770] == 1;
					Static145.method2158();
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6018) {
					local175 = anIntArray146[--anInt1770];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static348.aClass1_Sub30_Sub1_1.anInt4863 = local175;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray146[--anInt1770];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static348.aClass1_Sub30_Sub1_1.anInt4865) {
						if (Static348.aClass1_Sub30_Sub1_1.anInt4865 == 0 && Static300.anInt5153 != -1) {
							Static381.method5109(local175, Static358.aClass270_69, Static300.anInt5153);
							Static340.aBoolean451 = false;
						} else if (local175 == 0) {
							Static587.method7823();
							Static340.aBoolean451 = false;
						} else {
							Static207.method3284(local175);
						}
						Static348.aClass1_Sub30_Sub1_1.anInt4865 = local175;
					}
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6020) {
					local175 = anIntArray146[--anInt1770];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static348.aClass1_Sub30_Sub1_1.anInt4858 = local175;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6021) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean399 = anIntArray146[--anInt1770] == 1;
					Static468.method6431();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray146[--anInt1770];
					local1496 = false;
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 2) {
						local175 = 2;
					}
					if (Static117.anInt2297 < 96) {
						local175 = 0;
						local1496 = true;
					}
					Static467.method6429(local175);
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					anIntArray146[anInt1770++] = local1496 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local175 = anIntArray146[--anInt1770];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static348.aClass1_Sub30_Sub1_1.anInt4870 = local175;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					return;
				}
				if (arg0 == 6025) {
					local175 = anIntArray146[--anInt1770];
					if (local175 < 0 || local175 > Static497.method4932(Static117.anInt2297)) {
						local175 = 0;
					}
					Static348.aClass1_Sub30_Sub1_1.anInt4864 = local175;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray146[--anInt1770];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static157.method2278(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean389 = anIntArray146[--anInt1770] != 0;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					return;
				}
				if (arg0 == 6029) {
					Static348.aClass1_Sub30_Sub1_1.anInt4874 = anIntArray146[--anInt1770];
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					return;
				}
				if (arg0 == 6030) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean381 = anIntArray146[--anInt1770] != 0;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static334.method4655();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray146[--anInt1770];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static523.method7235(local175);
					return;
				}
				if (arg0 == 6032) {
					local175 = anIntArray146[--anInt1770];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static348.aClass1_Sub30_Sub1_1.anInt4881 = local175;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6033) {
					local175 = anIntArray146[--anInt1770];
					if (local175 < 0 || local175 > 4) {
						local175 = 2;
					}
					Static348.aClass1_Sub30_Sub1_1.anInt4856 = local175;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					return;
				}
				if (arg0 == 6034) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean397 = anIntArray146[--anInt1770] == 1;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static34.method7180();
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6035) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean398 = anIntArray146[--anInt1770] == 1;
					Static334.method4655();
					Static468.method6431();
					return;
				}
				if (arg0 == 6036) {
					local175 = anIntArray146[--anInt1770];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static348.aClass1_Sub30_Sub1_1.method3918(local175);
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					return;
				}
				if (arg0 == 6037) {
					local175 = anIntArray146[--anInt1770];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static348.aClass1_Sub30_Sub1_1.anInt4861 = local175;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray146[--anInt1770];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static348.aClass1_Sub30_Sub1_1.anInt4868 && Static300.anInt5153 == Static529.anInt8893) {
						if (Static348.aClass1_Sub30_Sub1_1.anInt4868 == 0) {
							Static381.method5109(local175, Static358.aClass270_69, Static300.anInt5153);
							Static340.aBoolean451 = false;
						} else if (local175 == 0) {
							Static587.method7823();
							Static340.aBoolean451 = false;
						} else {
							Static207.method3284(local175);
						}
					}
					Static348.aClass1_Sub30_Sub1_1.anInt4868 = local175;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray146[--anInt1770];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static348.aClass1_Sub30_Sub1_1.anInt4867) {
						Static348.aClass1_Sub30_Sub1_1.anInt4867 = local175;
						Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
						Static266.aBoolean354 = false;
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4882;
					return;
				}
				if (arg0 == 6102) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.method3912(Static113.anInt2222) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.aBoolean382 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.aBoolean392 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.aBoolean387 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4874;
					return;
				}
				if (arg0 == 6108) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.aBoolean396 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.aBoolean384 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.aBoolean395 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.method3908(Static113.anInt2222);
					return;
				}
				if (arg0 == 6112) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.method3907(Static113.anInt2222) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.aBoolean391 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.aBoolean380 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4869;
					return;
				}
				if (arg0 == 6117) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.aBoolean394 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4863;
					return;
				}
				if (arg0 == 6119) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4865;
					return;
				}
				if (arg0 == 6120) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4858;
					return;
				}
				if (arg0 == 6121) {
					anIntArray146[anInt1770++] = Static16.aClass134_1.method6897() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray146[anInt1770++] = Static331.method4531();
					return;
				}
				if (arg0 == 6124) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4870;
					return;
				}
				if (arg0 == 6125) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4864;
					return;
				}
				if (arg0 == 6126) {
					anIntArray146[anInt1770++] = Static16.aClass134_1.method6908() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.aBoolean390 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.aBoolean389 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4874;
					return;
				}
				if (arg0 == 6130) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.aBoolean381 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray146[anInt1770++] = Static113.anInt2222;
					return;
				}
				if (arg0 == 6132) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4881;
					return;
				}
				if (arg0 == 6133) {
					anIntArray146[anInt1770++] = Static362.aClass109_5.aBoolean206 && !Static362.aClass109_5.aBoolean205 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray146[anInt1770++] = Static497.method4932(Static117.anInt2297);
					return;
				}
				if (arg0 == 6135) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4856;
					return;
				}
				if (arg0 == 6136) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.aBoolean397 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6352) boolean local6352 = true;
					try {
						local6352 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6362) Throwable local6362) {
					}
					anIntArray146[anInt1770++] = local6352 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray146[anInt1770++] = Static286.method6607(200, Static113.anInt2222);
					return;
				}
				if (arg0 == 6139) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.method3919(Static113.anInt2222);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6410) byte local6410 = 0;
					if (Static156.method2273(Static113.anInt2222) && Static117.anInt2297 < 96) {
						local6410 = 1;
					}
					anIntArray146[anInt1770++] = local6410;
					return;
				}
				if (arg0 == 6141) {
					if (Static117.anInt2297 < 96) {
						anIntArray146[anInt1770++] = 0;
						return;
					}
					anIntArray146[anInt1770++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4861;
					return;
				}
				if (arg0 == 6143) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4868;
					return;
				}
				if (arg0 == 6144) {
					anIntArray146[anInt1770++] = Static424.aBoolean575 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4867;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt1770 -= 2;
					Static125.aShort36 = (short) anIntArray146[anInt1770];
					if (Static125.aShort36 <= 0) {
						Static125.aShort36 = 256;
					}
					Static286.aShort118 = (short) anIntArray146[anInt1770 + 1];
					if (Static286.aShort118 <= 0) {
						Static286.aShort118 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt1770 -= 2;
					Static330.aShort75 = (short) anIntArray146[anInt1770];
					if (Static330.aShort75 <= 0) {
						Static330.aShort75 = 256;
					}
					Static576.aShort134 = (short) anIntArray146[anInt1770 + 1];
					if (Static576.aShort134 <= 0) {
						Static576.aShort134 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt1770 -= 4;
					Static421.aShort94 = (short) anIntArray146[anInt1770];
					if (Static421.aShort94 <= 0) {
						Static421.aShort94 = 1;
					}
					Static59.aShort14 = (short) anIntArray146[anInt1770 + 1];
					if (Static59.aShort14 <= 0) {
						Static59.aShort14 = 32767;
					} else if (Static59.aShort14 < Static421.aShort94) {
						Static59.aShort14 = Static421.aShort94;
					}
					Static75.aShort125 = (short) anIntArray146[anInt1770 + 2];
					if (Static75.aShort125 <= 0) {
						Static75.aShort125 = 1;
					}
					Static199.aShort49 = (short) anIntArray146[anInt1770 + 3];
					if (Static199.aShort49 <= 0) {
						Static199.aShort49 = 32767;
						return;
					}
					if (Static199.aShort49 < Static75.aShort125) {
						Static199.aShort49 = Static75.aShort125;
					}
					return;
				}
				if (arg0 == 6203) {
					Static308.method4291(false, 0, Static376.aClass341_17.anInt9248, Static376.aClass341_17.anInt9300, 0);
					anIntArray146[anInt1770++] = Static126.anInt2508;
					anIntArray146[anInt1770++] = Static31.anInt508;
					return;
				}
				if (arg0 == 6204) {
					anIntArray146[anInt1770++] = Static330.aShort75;
					anIntArray146[anInt1770++] = Static576.aShort134;
					return;
				}
				if (arg0 == 6205) {
					anIntArray146[anInt1770++] = Static125.aShort36;
					anIntArray146[anInt1770++] = Static286.aShort118;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray146[anInt1770++] = (int) (Static413.method5668() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray146[anInt1770++] = (int) (Static413.method5668() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt1770 -= 3;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					local97 = anIntArray146[anInt1770 + 2];
					aCalendar1.clear();
					aCalendar1.set(11, 12);
					aCalendar1.set(local97, local776, local175);
					local103 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray146[anInt1770++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar1.clear();
					aCalendar1.setTime(new Date(Static413.method5668()));
					anIntArray146[anInt1770++] = aCalendar1.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray146[--anInt1770];
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
					anIntArray146[anInt1770++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray146[anInt1770++] = Static98.method5020() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray146[anInt1770++] = Static7.method92() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static216.anInt4135 == 7 && Static181.anInt3169 == 0 && Static61.anInt1176 == 0) {
						if (Static315.aBoolean433) {
							anIntArray146[anInt1770++] = 0;
							return;
						}
						if (Static448.aLong238 > Static413.method5668() - 1000L) {
							anIntArray146[anInt1770++] = 1;
							return;
						}
						Static315.aBoolean433 = true;
						local52 = Static276.method3885(Static378.aClass70_68, Static481.aClass276_2);
						local52.aClass1_Sub35_Sub2_1.method5792(Static308.anInt5290);
						Static48.method743(local52);
						anIntArray146[anInt1770++] = 0;
						return;
					}
					anIntArray146[anInt1770++] = 1;
					return;
				}
				@Pc(7033) Class333 local7033;
				@Pc(7000) Class317_Sub1 local7000;
				if (arg0 == 6501) {
					local7000 = Static70.method1226();
					if (local7000 != null) {
						anIntArray146[anInt1770++] = local7000.anInt9112;
						anIntArray146[anInt1770++] = local7000.anInt9102;
						aStringArray10[anInt1766++] = local7000.aString91;
						local7033 = local7000.method7460();
						anIntArray146[anInt1770++] = local7033.anInt8947;
						aStringArray10[anInt1766++] = local7033.aString88;
						anIntArray146[anInt1770++] = local7000.anInt9107;
						anIntArray146[anInt1770++] = local7000.anInt9114;
						aStringArray10[anInt1766++] = local7000.aString90;
						return;
					}
					anIntArray146[anInt1770++] = -1;
					anIntArray146[anInt1770++] = 0;
					aStringArray10[anInt1766++] = "";
					anIntArray146[anInt1770++] = 0;
					aStringArray10[anInt1766++] = "";
					anIntArray146[anInt1770++] = 0;
					anIntArray146[anInt1770++] = 0;
					aStringArray10[anInt1766++] = "";
					return;
				}
				if (arg0 == 6502) {
					local7000 = Static373.method5033();
					if (local7000 != null) {
						anIntArray146[anInt1770++] = local7000.anInt9112;
						anIntArray146[anInt1770++] = local7000.anInt9102;
						aStringArray10[anInt1766++] = local7000.aString91;
						local7033 = local7000.method7460();
						anIntArray146[anInt1770++] = local7033.anInt8947;
						aStringArray10[anInt1766++] = local7033.aString88;
						anIntArray146[anInt1770++] = local7000.anInt9107;
						anIntArray146[anInt1770++] = local7000.anInt9114;
						aStringArray10[anInt1766++] = local7000.aString90;
						return;
					}
					anIntArray146[anInt1770++] = -1;
					anIntArray146[anInt1770++] = 0;
					aStringArray10[anInt1766++] = "";
					anIntArray146[anInt1770++] = 0;
					aStringArray10[anInt1766++] = "";
					anIntArray146[anInt1770++] = 0;
					anIntArray146[anInt1770++] = 0;
					aStringArray10[anInt1766++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray146[--anInt1770];
					local89 = aStringArray10[--anInt1766];
					if (Static216.anInt4135 == 7 && Static181.anInt3169 == 0 && Static61.anInt1176 == 0) {
						anIntArray146[anInt1770++] = Static249.method3697(local175, local89) ? 1 : 0;
						return;
					}
					anIntArray146[anInt1770++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static348.aClass1_Sub30_Sub1_1.anInt4862 = anIntArray146[--anInt1770];
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					return;
				}
				if (arg0 == 6505) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4862;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray146[--anInt1770];
					@Pc(7390) Class317_Sub1 local7390 = Static166.method2391(local175);
					if (local7390 != null) {
						anIntArray146[anInt1770++] = local7390.anInt9102;
						aStringArray10[anInt1766++] = local7390.aString91;
						@Pc(7414) Class333 local7414 = local7390.method7460();
						anIntArray146[anInt1770++] = local7414.anInt8947;
						aStringArray10[anInt1766++] = local7414.aString88;
						anIntArray146[anInt1770++] = local7390.anInt9107;
						anIntArray146[anInt1770++] = local7390.anInt9114;
						aStringArray10[anInt1766++] = local7390.aString90;
						return;
					}
					anIntArray146[anInt1770++] = -1;
					aStringArray10[anInt1766++] = "";
					anIntArray146[anInt1770++] = 0;
					aStringArray10[anInt1766++] = "";
					anIntArray146[anInt1770++] = 0;
					anIntArray146[anInt1770++] = 0;
					aStringArray10[anInt1766++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt1770 -= 4;
					local175 = anIntArray146[anInt1770];
					local1496 = anIntArray146[anInt1770 + 1] == 1;
					local97 = anIntArray146[anInt1770 + 2];
					local2107 = anIntArray146[anInt1770 + 3] == 1;
					Static260.method3771(local175, local97, local1496, local2107);
					return;
				}
				if (arg0 == 6508) {
					Static488.method2263();
					return;
				}
				if (arg0 == 6509) {
					if (Static216.anInt4135 != 7) {
						return;
					}
					Static324.aBoolean441 = anIntArray146[--anInt1770] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray146[anInt1770++] = Static200.anInt3986;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static348.aClass1_Sub30_Sub1_1.aBoolean383 = anIntArray146[--anInt1770] == 1;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					return;
				}
				if (arg0 == 6601) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.aBoolean383 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static460.aClass283_5 == Static245.aClass283_3) {
				if (arg0 == 6700) {
					local175 = Static78.aClass187_8.method3796();
					if (Static422.anInt7311 != -1) {
						local175++;
					}
					anIntArray146[anInt1770++] = local175;
					return;
				}
				if (arg0 == 6701) {
					local175 = anIntArray146[--anInt1770];
					if (Static422.anInt7311 != -1) {
						if (local175 == 0) {
							anIntArray146[anInt1770++] = Static422.anInt7311;
							return;
						}
						local175--;
					}
					@Pc(7701) Class1_Sub44 local7701 = (Class1_Sub44) Static78.aClass187_8.method3799();
					while (local175-- > 0) {
						local7701 = (Class1_Sub44) Static78.aClass187_8.method3805();
					}
					anIntArray146[anInt1770++] = local7701.anInt7685;
					return;
				}
				if (arg0 == 6702) {
					local175 = anIntArray146[--anInt1770];
					if (Static578.aClass341ArrayArray2[local175] == null) {
						aStringArray10[anInt1766++] = "";
						return;
					}
					local89 = Static578.aClass341ArrayArray2[local175][0].aString93;
					if (local89 == null) {
						aStringArray10[anInt1766++] = "";
						return;
					}
					aStringArray10[anInt1766++] = local89.substring(0, local89.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local175 = anIntArray146[--anInt1770];
					if (Static578.aClass341ArrayArray2[local175] == null) {
						anIntArray146[anInt1770++] = 0;
						return;
					}
					anIntArray146[anInt1770++] = Static578.aClass341ArrayArray2[local175].length;
					return;
				}
				if (arg0 == 6704) {
					anInt1770 -= 2;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					if (Static578.aClass341ArrayArray2[local175] == null) {
						aStringArray10[anInt1766++] = "";
						return;
					}
					local181 = Static578.aClass341ArrayArray2[local175][local776].aString93;
					if (local181 == null) {
						aStringArray10[anInt1766++] = "";
						return;
					}
					aStringArray10[anInt1766++] = local181;
					return;
				}
				if (arg0 == 6705) {
					anInt1770 -= 2;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					if (Static578.aClass341ArrayArray2[local175] == null) {
						anIntArray146[anInt1770++] = 0;
						return;
					}
					anIntArray146[anInt1770++] = Static578.aClass341ArrayArray2[local175][local776].anInt9292;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt1770 -= 3;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					local97 = anIntArray146[anInt1770 + 2];
					Static361.method4892(1, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6708) {
					anInt1770 -= 3;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					local97 = anIntArray146[anInt1770 + 2];
					Static361.method4892(2, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6709) {
					anInt1770 -= 3;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					local97 = anIntArray146[anInt1770 + 2];
					Static361.method4892(3, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6710) {
					anInt1770 -= 3;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					local97 = anIntArray146[anInt1770 + 2];
					Static361.method4892(4, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6711) {
					anInt1770 -= 3;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					local97 = anIntArray146[anInt1770 + 2];
					Static361.method4892(5, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6712) {
					anInt1770 -= 3;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					local97 = anIntArray146[anInt1770 + 2];
					Static361.method4892(6, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6713) {
					anInt1770 -= 3;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					local97 = anIntArray146[anInt1770 + 2];
					Static361.method4892(7, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6714) {
					anInt1770 -= 3;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					local97 = anIntArray146[anInt1770 + 2];
					Static361.method4892(8, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6715) {
					anInt1770 -= 3;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					local97 = anIntArray146[anInt1770 + 2];
					Static361.method4892(9, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6716) {
					anInt1770 -= 3;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					local97 = anIntArray146[anInt1770 + 2];
					Static361.method4892(10, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6717) {
					anInt1770 -= 3;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					local97 = anIntArray146[anInt1770 + 2];
					@Pc(8289) Class341 local8289 = Static49.method751(local175 << 16 | local776, local97);
					Static50.method827();
					@Pc(8294) Class1_Sub49 local8294 = Static63.method1137(local8289);
					Static425.method5883(local8294.anInt9538, local8294.method7774(), local8289);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8322) Class310 local8322;
				if (arg0 == 6800) {
					local175 = anIntArray146[--anInt1770];
					local8322 = Static383.aClass273_3.method5840(local175);
					if (local8322.aString84 == null) {
						aStringArray10[anInt1766++] = "";
						return;
					}
					aStringArray10[anInt1766++] = local8322.aString84;
					return;
				}
				if (arg0 == 6801) {
					local175 = anIntArray146[--anInt1770];
					local8322 = Static383.aClass273_3.method5840(local175);
					anIntArray146[anInt1770++] = local8322.anInt8124;
					return;
				}
				if (arg0 == 6802) {
					local175 = anIntArray146[--anInt1770];
					local8322 = Static383.aClass273_3.method5840(local175);
					anIntArray146[anInt1770++] = local8322.anInt8135;
					return;
				}
				if (arg0 == 6803) {
					local175 = anIntArray146[--anInt1770];
					local8322 = Static383.aClass273_3.method5840(local175);
					anIntArray146[anInt1770++] = local8322.anInt8130;
					return;
				}
				if (arg0 == 6804) {
					anInt1770 -= 2;
					local175 = anIntArray146[anInt1770];
					local776 = anIntArray146[anInt1770 + 1];
					@Pc(8444) Class120 local8444 = Static459.aClass38_2.method713(local776);
					if (local8444.method2384()) {
						aStringArray10[anInt1766++] = Static383.aClass273_3.method5840(local175).method6542(local8444.aString28, local776);
						return;
					}
					anIntArray146[anInt1770++] = Static383.aClass273_3.method5840(local175).method6537(local8444.anInt2965, local776);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray146[anInt1770++] = Static274.aBoolean30 && !Static357.aBoolean467 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray146[anInt1770++] = Static432.anInt7571;
					return;
				}
				if (arg0 == 6902) {
					anIntArray146[anInt1770++] = Static306.anInt4491;
					return;
				}
				if (arg0 == 6903) {
					anIntArray146[anInt1770++] = Static89.anInt1862;
					return;
				}
				if (arg0 == 6904) {
					anIntArray146[anInt1770++] = Static165.anInt2960;
					return;
				}
				if (arg0 == 6905) {
					local83 = "";
					if (Static1.aClass260_1 != null) {
						if (Static1.aClass260_1.anObject16 == null) {
							local83 = Static427.method5932(Static1.aClass260_1.anInt7040);
						} else {
							local83 = (String) Static1.aClass260_1.anObject16;
						}
					}
					aStringArray10[anInt1766++] = local83;
					return;
				}
				if (arg0 == 6906) {
					anIntArray146[anInt1770++] = Static486.anInt8191;
					return;
				}
				if (arg0 == 6907) {
					anIntArray146[anInt1770++] = Static431.anInt7564;
					return;
				}
				if (arg0 == 6908) {
					anIntArray146[anInt1770++] = Static533.anInt8939;
					return;
				}
				if (arg0 == 6909) {
					anIntArray146[anInt1770++] = Static516.aBoolean679 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray146[anInt1770++] = Static398.anInt7013;
					return;
				}
				if (arg0 == 6911) {
					anIntArray146[anInt1770++] = Static123.anInt2446;
					return;
				}
				if (arg0 == 6912) {
					anIntArray146[anInt1770++] = Static370.anInt6167;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local175 = Static348.aClass1_Sub30_Sub1_1.method3927();
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4889 = Static113.anInt2222;
					anIntArray146[anInt1770++] = local175;
					Static334.method4655();
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 7001) {
					Static348.aClass1_Sub30_Sub1_1.method3914();
					Static334.method4655();
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 7002) {
					Static348.aClass1_Sub30_Sub1_1.method3915();
					Static334.method4655();
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 7003) {
					Static348.aClass1_Sub30_Sub1_1.method3913();
					Static334.method4655();
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 7004) {
					Static348.aClass1_Sub30_Sub1_1.method3921(true);
					Static334.method4655();
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 7005) {
					Static348.aClass1_Sub30_Sub1_1.anInt4871 = 0;
					Static348.aClass1_Sub30_Sub1_1.method3923(Static362.aClass109_5);
					Static266.aBoolean354 = false;
					return;
				}
				if (arg0 == 7006) {
					if (Static348.aClass1_Sub30_Sub1_1.anInt4889 == 2) {
						Static348.aClass1_Sub30_Sub1_1.aBoolean400 = true;
						return;
					}
					if (Static348.aClass1_Sub30_Sub1_1.anInt4889 == 1) {
						Static348.aClass1_Sub30_Sub1_1.aBoolean401 = true;
						return;
					}
					if (Static348.aClass1_Sub30_Sub1_1.anInt4889 == 3) {
						Static348.aClass1_Sub30_Sub1_1.aBoolean402 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray146[anInt1770++] = Static348.aClass1_Sub30_Sub1_1.anInt4871;
					return;
				}
				if (arg0 == 7008) {
					if (Static113.anInt2222 == 0 && Static117.anInt2297 < 96) {
						anIntArray146[anInt1770++] = 1;
						return;
					}
					anIntArray146[anInt1770++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(IZ)V")
	public static void method1450() {
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!ds;)V")
	public static void method1451(@OriginalArg(0) Class1_Sub15 arg0) {
		method1448(arg0, 200000);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "()V")
	public static void method1452() {
	}

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "(IZ)V")
	private static void method1453(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class341 local137;
		@Pc(158) Class341 local158;
		@Pc(35) Class341 local35;
		@Pc(56) int local56;
		@Pc(13) int local13;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(210) Class341 local210;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt1770 -= 3;
				local13 = anIntArray146[anInt1770];
				local19 = anIntArray146[anInt1770 + 1];
				local25 = anIntArray146[anInt1770 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static350.method4758(local13);
				if (local35.aClass341Array2 == null) {
					local35.aClass341Array2 = new Class341[local25 + 1];
				}
				if (local35.aClass341Array2.length <= local25) {
					@Pc(54) Class341[] local54 = new Class341[local25 + 1];
					for (local56 = 0; local56 < local35.aClass341Array2.length; local56++) {
						local54[local56] = local35.aClass341Array2[local56];
					}
					local35.aClass341Array2 = local54;
				}
				if (local25 > 0 && local35.aClass341Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class341 local99 = new Class341();
				local99.anInt9309 = local19;
				local99.anInt9252 = local99.anInt9306 = local35.anInt9306;
				local99.anInt9270 = local25;
				local35.aClass341Array2[local25] = local99;
				if (arg1) {
					aClass341_6 = local99;
				} else {
					aClass341_7 = local99;
				}
				Static442.method6111(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass341_6 : aClass341_7;
				if (local137.anInt9270 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static350.method4758(local137.anInt9306);
				local158.aClass341Array2[local137.anInt9270] = null;
				Static442.method6111(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static350.method4758(anIntArray146[--anInt1770]);
				local137.aClass341Array2 = null;
				Static442.method6111(local137);
				return;
			}
			if (arg0 == 200) {
				anInt1770 -= 2;
				local13 = anIntArray146[anInt1770];
				local19 = anIntArray146[anInt1770 + 1];
				local210 = Static49.method751(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray146[anInt1770++] = 1;
					if (arg1) {
						aClass341_6 = local210;
						return;
					}
					aClass341_7 = local210;
					return;
				}
				anIntArray146[anInt1770++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray146[--anInt1770];
				local158 = Static350.method4758(local13);
				if (local158 != null) {
					anIntArray146[anInt1770++] = 1;
					if (arg1) {
						aClass341_6 = local158;
						return;
					}
					aClass341_7 = local158;
					return;
				}
				anIntArray146[anInt1770++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray146[--anInt1770];
				method1446(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray146[--anInt1770];
				method1447(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt1770 -= 2;
					local13 = anIntArray146[anInt1770];
					local19 = anIntArray146[anInt1770 + 1];
					for (local25 = 0; local25 < Static371.anIntArray500.length; local25++) {
						if (Static371.anIntArray500[local25] == local13) {
							Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aClass190_1.method3836(local19, local25, Static22.aClass71_1);
							return;
						}
					}
					for (local353 = 0; local353 < Static122.anIntArray206.length; local353++) {
						if (Static122.anIntArray206[local353] == local13) {
							Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aClass190_1.method3836(local19, local353, Static22.aClass71_1);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt1770 -= 2;
					local13 = anIntArray146[anInt1770];
					local19 = anIntArray146[anInt1770 + 1];
					Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aClass190_1.method3830(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray146[--anInt1770] != 0;
					Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aClass190_1.method3838(local412);
					return;
				}
				if (arg0 == 411) {
					anInt1770 -= 2;
					local13 = anIntArray146[anInt1770];
					local19 = anIntArray146[anInt1770 + 1];
					Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aClass190_1.method3840(local13, local19, Static175.aClass114_4);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static350.method4758(anIntArray146[--anInt1770]);
				} else {
					local137 = arg1 ? aClass341_6 : aClass341_7;
				}
				if (arg0 == 1000) {
					anInt1770 -= 4;
					local137.anInt9245 = anIntArray146[anInt1770];
					local137.anInt9279 = anIntArray146[anInt1770 + 1];
					local19 = anIntArray146[anInt1770 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray146[anInt1770 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte119 = (byte) local19;
					local137.aByte117 = (byte) local25;
					Static442.method6111(local137);
					Static16.method155(local137);
					if (local137.anInt9270 == -1) {
						Static307.method4287(local137.anInt9306);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt1770 -= 4;
					local137.anInt9305 = anIntArray146[anInt1770];
					local137.anInt9302 = anIntArray146[anInt1770 + 1];
					local137.anInt9285 = 0;
					local137.anInt9242 = 0;
					local19 = anIntArray146[anInt1770 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray146[anInt1770 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte118 = (byte) local19;
					local137.aByte120 = (byte) local25;
					Static442.method6111(local137);
					Static16.method155(local137);
					if (local137.anInt9309 == 0) {
						Static417.method6106(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray146[--anInt1770] == 1;
					if (local137.aBoolean717 != local645) {
						local137.aBoolean717 = local645;
						Static442.method6111(local137);
					}
					if (local137.anInt9270 == -1) {
						Static185.method2595(local137.anInt9306);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt1770 -= 2;
					local137.anInt9250 = anIntArray146[anInt1770];
					local137.anInt9319 = anIntArray146[anInt1770 + 1];
					Static442.method6111(local137);
					Static16.method155(local137);
					if (local137.anInt9309 == 0) {
						Static417.method6106(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean713 = anIntArray146[--anInt1770] == 1;
					return;
				}
			} else {
				@Pc(1507) String local1507;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static350.method4758(anIntArray146[--anInt1770]);
					} else {
						local137 = arg1 ? aClass341_6 : aClass341_7;
					}
					if (arg0 == 1100) {
						anInt1770 -= 2;
						local137.anInt9267 = anIntArray146[anInt1770];
						if (local137.anInt9267 > local137.anInt9326 - local137.anInt9300) {
							local137.anInt9267 = local137.anInt9326 - local137.anInt9300;
						}
						if (local137.anInt9267 < 0) {
							local137.anInt9267 = 0;
						}
						local137.anInt9256 = anIntArray146[anInt1770 + 1];
						if (local137.anInt9256 > local137.anInt9274 - local137.anInt9248) {
							local137.anInt9256 = local137.anInt9274 - local137.anInt9248;
						}
						if (local137.anInt9256 < 0) {
							local137.anInt9256 = 0;
						}
						Static442.method6111(local137);
						if (local137.anInt9270 == -1) {
							Static236.method3579(local137.anInt9306);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt9303 = anIntArray146[--anInt1770];
						Static442.method6111(local137);
						if (local137.anInt9270 == -1) {
							Static31.method418(local137.anInt9306);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean720 = anIntArray146[--anInt1770] == 1;
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt9257 = anIntArray146[--anInt1770];
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt9283 = anIntArray146[--anInt1770];
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray146[--anInt1770];
						if (local137.anInt9266 != local19) {
							local137.anInt9266 = local19;
							Static442.method6111(local137);
						}
						if (local137.anInt9270 == -1) {
							Static204.method3264(local137.anInt9306);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt9320 = anIntArray146[--anInt1770];
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean710 = anIntArray146[--anInt1770] == 1;
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt9280 = 1;
						local137.anInt9322 = anIntArray146[--anInt1770];
						Static442.method6111(local137);
						if (local137.anInt9270 == -1) {
							Static233.method6436(local137.anInt9306);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt1770 -= 6;
						local137.anInt9291 = anIntArray146[anInt1770];
						local137.anInt9239 = anIntArray146[anInt1770 + 1];
						local137.anInt9269 = anIntArray146[anInt1770 + 2];
						local137.anInt9323 = anIntArray146[anInt1770 + 3];
						local137.anInt9238 = anIntArray146[anInt1770 + 4];
						local137.anInt9276 = anIntArray146[anInt1770 + 5];
						Static442.method6111(local137);
						if (local137.anInt9270 == -1) {
							Static290.method4090(local137.anInt9306);
							Static334.method4657(local137.anInt9306);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray146[--anInt1770];
						if (local137.anInt9259 != local19) {
							local137.anInt9259 = local19;
							local137.anInt9253 = 0;
							local137.anInt9288 = 1;
							local137.anInt9246 = 0;
							@Pc(1094) Class290 local1094 = local137.anInt9259 == -1 ? null : Static192.aClass211_1.method4277(local137.anInt9259);
							if (local1094 != null) {
								Static236.method3580(local1094, local137.anInt9253);
							}
							Static442.method6111(local137);
						}
						if (local137.anInt9270 == -1) {
							Static116.method1836(local137.anInt9306);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean714 = anIntArray146[--anInt1770] == 1;
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray10[--anInt1766];
						if (!local1145.equals(local137.aString95)) {
							local137.aString95 = local1145;
							Static442.method6111(local137);
						}
						if (local137.anInt9270 == -1) {
							Static128.method2015(local137.anInt9306);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt9255 = anIntArray146[--anInt1770];
						Static442.method6111(local137);
						if (local137.anInt9270 == -1) {
							Static336.method4664(local137.anInt9306);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt1770 -= 3;
						local137.anInt9240 = anIntArray146[anInt1770];
						local137.anInt9282 = anIntArray146[anInt1770 + 1];
						local137.anInt9294 = anIntArray146[anInt1770 + 2];
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean723 = anIntArray146[--anInt1770] == 1;
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt9260 = anIntArray146[--anInt1770];
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt9318 = anIntArray146[--anInt1770];
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean709 = anIntArray146[--anInt1770] == 1;
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean725 = anIntArray146[--anInt1770] == 1;
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt1770 -= 2;
						local137.anInt9326 = anIntArray146[anInt1770];
						local137.anInt9274 = anIntArray146[anInt1770 + 1];
						Static442.method6111(local137);
						if (local137.anInt9309 == 0) {
							Static417.method6106(local137, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean722 = anIntArray146[--anInt1770] == 1;
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt9276 = anIntArray146[--anInt1770];
						Static442.method6111(local137);
						if (local137.anInt9270 == -1) {
							Static290.method4090(local137.anInt9306);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray146[--anInt1770];
						local137.aBoolean716 = local19 == 1;
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt1770 -= 2;
						local137.anInt9296 = anIntArray146[anInt1770];
						local137.anInt9315 = anIntArray146[anInt1770 + 1];
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt9298 = anIntArray146[--anInt1770];
						Static442.method6111(local137);
						return;
					}
					@Pc(1473) Class120 local1473;
					if (arg0 == 1127) {
						anInt1770 -= 2;
						local19 = anIntArray146[anInt1770];
						local25 = anIntArray146[anInt1770 + 1];
						local1473 = Static459.aClass38_2.method713(local19);
						if (local25 != local1473.anInt2965) {
							local137.method7561(local25, local19);
							return;
						}
						local137.method7578(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray146[--anInt1770];
						local1507 = aStringArray10[--anInt1766];
						local1473 = Static459.aClass38_2.method713(local19);
						if (!local1473.aString28.equals(local1507)) {
							local137.method7577(local1507, local19);
							return;
						}
						local137.method7578(local19);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static350.method4758(anIntArray146[--anInt1770]);
					} else {
						local137 = arg1 ? aClass341_6 : aClass341_7;
					}
					Static442.method6111(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt1770 -= 2;
						local19 = anIntArray146[anInt1770];
						local25 = anIntArray146[anInt1770 + 1];
						if (local137.anInt9270 == -1) {
							Static394.method5451(local137.anInt9306);
							Static290.method4090(local137.anInt9306);
							Static334.method4657(local137.anInt9306);
						}
						if (local19 == -1) {
							local137.anInt9280 = 1;
							local137.anInt9322 = -1;
							local137.anInt9328 = -1;
							return;
						}
						local137.anInt9328 = local19;
						local137.anInt9324 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean715 = true;
						} else {
							local137.aBoolean715 = false;
						}
						@Pc(1649) Class245 local1649 = Static175.aClass114_4.method2217(local19);
						local137.anInt9269 = local1649.anInt6173;
						local137.anInt9323 = local1649.anInt6221;
						local137.anInt9238 = local1649.anInt6216;
						local137.anInt9291 = local1649.anInt6220;
						local137.anInt9239 = local1649.anInt6214;
						local137.anInt9276 = local1649.anInt6205;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt9277 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt9277 = 1;
						} else {
							local137.anInt9277 = 2;
						}
						if (local137.anInt9285 > 0) {
							local137.anInt9276 = local137.anInt9276 * 32 / local137.anInt9285;
							return;
						}
						if (local137.anInt9305 > 0) {
							local137.anInt9276 = local137.anInt9276 * 32 / local137.anInt9305;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt9280 = 2;
						local137.anInt9322 = anIntArray146[--anInt1770];
						if (local137.anInt9270 == -1) {
							Static233.method6436(local137.anInt9306);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt9280 = 3;
						local137.anInt9322 = -1;
						if (local137.anInt9270 == -1) {
							Static233.method6436(local137.anInt9306);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt9280 = 6;
						local137.anInt9322 = anIntArray146[--anInt1770];
						if (local137.anInt9270 == -1) {
							Static233.method6436(local137.anInt9306);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt9280 = 5;
						local137.anInt9322 = anIntArray146[--anInt1770];
						if (local137.anInt9270 == -1) {
							Static233.method6436(local137.anInt9306);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt1770 -= 4;
						local137.anInt9308 = anIntArray146[anInt1770];
						local137.anInt9301 = anIntArray146[anInt1770 + 1];
						local137.anInt9249 = anIntArray146[anInt1770 + 2];
						local137.anInt9313 = anIntArray146[anInt1770 + 3];
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt1770 -= 2;
						local137.anInt9264 = anIntArray146[anInt1770];
						local137.anInt9321 = anIntArray146[anInt1770 + 1];
						Static442.method6111(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt1770 -= 4;
						local137.anInt9322 = anIntArray146[anInt1770];
						local137.anInt9261 = anIntArray146[anInt1770 + 1];
						if (anIntArray146[anInt1770 + 2] == 1) {
							local137.anInt9280 = 9;
						} else {
							local137.anInt9280 = 8;
						}
						if (anIntArray146[anInt1770 + 3] == 1) {
							local137.aBoolean715 = true;
						} else {
							local137.aBoolean715 = false;
						}
						if (local137.anInt9270 == -1) {
							Static233.method6436(local137.anInt9306);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt9280 = 5;
						local137.anInt9322 = Static296.anInt5113;
						local137.anInt9261 = 0;
						if (local137.anInt9270 == -1) {
							Static233.method6436(local137.anInt9306);
						}
						return;
					}
				} else {
					@Pc(2309) int local2309;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static350.method4758(anIntArray146[--anInt1770]);
						} else {
							local137 = arg1 ? aClass341_6 : aClass341_7;
						}
						if (arg0 == 1300) {
							local19 = anIntArray146[--anInt1770] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method7568(aStringArray10[--anInt1766], local19);
								return;
							}
							anInt1766--;
							return;
						}
						if (arg0 == 1301) {
							anInt1770 -= 2;
							local19 = anIntArray146[anInt1770];
							local25 = anIntArray146[anInt1770 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass341_22 = null;
								return;
							}
							local137.aClass341_22 = Static49.method751(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray146[--anInt1770];
							if (local19 != Static49.anInt848 && local19 != Static265.anInt4696 && local19 != Static455.anInt7832) {
								return;
							}
							local137.anInt9307 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt9265 = anIntArray146[--anInt1770];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt9287 = anIntArray146[--anInt1770];
							return;
						}
						if (arg0 == 1305) {
							local137.aString94 = aStringArray10[--anInt1766];
							return;
						}
						if (arg0 == 1306) {
							local137.aString97 = aStringArray10[--anInt1766];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray38 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt9278 = anIntArray146[--anInt1770];
							local137.anInt9262 = anIntArray146[--anInt1770];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray146[--anInt1770];
							local25 = anIntArray146[--anInt1770];
							if (local25 >= 1 && local25 <= 10) {
								local137.method7572(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString96 = aStringArray10[--anInt1766];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt9314 = anIntArray146[--anInt1770];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt1770 -= 3;
								local19 = anIntArray146[anInt1770] - 1;
								local25 = anIntArray146[anInt1770 + 1];
								local353 = anIntArray146[anInt1770 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt1770 -= 2;
								local19 = 10;
								local25 = anIntArray146[anInt1770];
								local353 = anIntArray146[anInt1770 + 1];
							}
							if (local137.aByteArray99 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray99 = new byte[11];
								local137.aByteArray98 = new byte[11];
								local137.anIntArray696 = new int[11];
							}
							local137.aByteArray99[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean721 = false;
								for (local2309 = 0; local2309 < local137.aByteArray99.length; local2309++) {
									if (local137.aByteArray99[local2309] != 0) {
										local137.aBoolean721 = true;
										break;
									}
								}
							} else {
								local137.aBoolean721 = true;
							}
							local137.aByteArray98[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt9312 = anIntArray146[--anInt1770];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static350.method4758(anIntArray146[--anInt1770]);
						} else {
							local137 = arg1 ? aClass341_6 : aClass341_7;
						}
						if (arg0 == 1499) {
							local137.method7573();
							return;
						}
						local1145 = aStringArray10[--anInt1766];
						@Pc(2395) int[] local2395 = null;
						if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
							local353 = anIntArray146[--anInt1770];
							if (local353 > 0) {
								local2395 = new int[local353];
								while (local353-- > 0) {
									local2395[local353] = anIntArray146[--anInt1770];
								}
							}
							local1145 = local1145.substring(0, local1145.length() - 1);
						}
						@Pc(2447) Object[] local2447 = new Object[local1145.length() + 1];
						for (local2309 = local2447.length - 1; local2309 >= 1; local2309--) {
							if (local1145.charAt(local2309 - 1) == 's') {
								local2447[local2309] = aStringArray10[--anInt1766];
							} else {
								local2447[local2309] = Integer.valueOf(anIntArray146[--anInt1770]);
							}
						}
						local56 = anIntArray146[--anInt1770];
						if (local56 == -1) {
							local2447 = null;
						} else {
							local2447[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray13 = local2447;
						} else if (arg0 == 1401) {
							local137.anObjectArray18 = local2447;
						} else if (arg0 == 1402) {
							local137.anObjectArray12 = local2447;
						} else if (arg0 == 1403) {
							local137.anObjectArray25 = local2447;
						} else if (arg0 == 1404) {
							local137.anObjectArray33 = local2447;
						} else if (arg0 == 1405) {
							local137.anObjectArray10 = local2447;
						} else if (arg0 == 1406) {
							local137.anObjectArray9 = local2447;
						} else if (arg0 == 1407) {
							local137.anObjectArray7 = local2447;
							local137.anIntArray702 = local2395;
						} else if (arg0 == 1408) {
							local137.anObjectArray5 = local2447;
						} else if (arg0 == 1409) {
							local137.anObjectArray17 = local2447;
						} else if (arg0 == 1410) {
							local137.anObjectArray16 = local2447;
						} else if (arg0 == 1411) {
							local137.anObjectArray15 = local2447;
						} else if (arg0 == 1412) {
							local137.anObjectArray30 = local2447;
						} else if (arg0 == 1414) {
							local137.anObjectArray8 = local2447;
							local137.anIntArray703 = local2395;
						} else if (arg0 == 1415) {
							local137.anObjectArray24 = local2447;
							local137.anIntArray698 = local2395;
						} else if (arg0 == 1416) {
							local137.anObjectArray11 = local2447;
						} else if (arg0 == 1417) {
							local137.anObjectArray23 = local2447;
						} else if (arg0 == 1418) {
							local137.anObjectArray14 = local2447;
						} else if (arg0 == 1419) {
							local137.anObjectArray20 = local2447;
						} else if (arg0 == 1420) {
							local137.anObjectArray6 = local2447;
						} else if (arg0 == 1421) {
							local137.anObjectArray21 = local2447;
						} else if (arg0 == 1422) {
							local137.anObjectArray3 = local2447;
						} else if (arg0 == 1423) {
							local137.anObjectArray27 = local2447;
						} else if (arg0 == 1424) {
							local137.anObjectArray29 = local2447;
						} else if (arg0 == 1425) {
							local137.anObjectArray28 = local2447;
						} else if (arg0 == 1426) {
							local137.anObjectArray4 = local2447;
						} else if (arg0 == 1427) {
							local137.anObjectArray32 = local2447;
						} else if (arg0 == 1428) {
							local137.anObjectArray22 = local2447;
							local137.anIntArray695 = local2395;
						} else if (arg0 == 1429) {
							local137.anObjectArray26 = local2447;
							local137.anIntArray701 = local2395;
						} else if (arg0 == 1430) {
							local137.anObjectArray19 = local2447;
						}
						local137.aBoolean719 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass341_6 : aClass341_7;
						if (arg0 == 1500) {
							anIntArray146[anInt1770++] = local137.anInt9293;
							return;
						}
						if (arg0 == 1501) {
							anIntArray146[anInt1770++] = local137.lb;
							return;
						}
						if (arg0 == 1502) {
							anIntArray146[anInt1770++] = local137.anInt9300;
							return;
						}
						if (arg0 == 1503) {
							anIntArray146[anInt1770++] = local137.anInt9248;
							return;
						}
						if (arg0 == 1504) {
							anIntArray146[anInt1770++] = local137.aBoolean717 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray146[anInt1770++] = local137.anInt9252;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static157.method2282(local137);
							anIntArray146[anInt1770++] = local158 == null ? -1 : local158.anInt9306;
							return;
						}
					} else {
						@Pc(3043) Class120 local3043;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass341_6 : aClass341_7;
							if (arg0 == 1600) {
								anIntArray146[anInt1770++] = local137.anInt9267;
								return;
							}
							if (arg0 == 1601) {
								anIntArray146[anInt1770++] = local137.anInt9256;
								return;
							}
							if (arg0 == 1602) {
								aStringArray10[anInt1766++] = local137.aString95;
								return;
							}
							if (arg0 == 1603) {
								anIntArray146[anInt1770++] = local137.anInt9326;
								return;
							}
							if (arg0 == 1604) {
								anIntArray146[anInt1770++] = local137.anInt9274;
								return;
							}
							if (arg0 == 1605) {
								anIntArray146[anInt1770++] = local137.anInt9276;
								return;
							}
							if (arg0 == 1606) {
								anIntArray146[anInt1770++] = local137.anInt9269;
								return;
							}
							if (arg0 == 1607) {
								anIntArray146[anInt1770++] = local137.anInt9238;
								return;
							}
							if (arg0 == 1608) {
								anIntArray146[anInt1770++] = local137.anInt9323;
								return;
							}
							if (arg0 == 1609) {
								anIntArray146[anInt1770++] = local137.anInt9257;
								return;
							}
							if (arg0 == 1610) {
								anIntArray146[anInt1770++] = local137.anInt9291;
								return;
							}
							if (arg0 == 1611) {
								anIntArray146[anInt1770++] = local137.anInt9239;
								return;
							}
							if (arg0 == 1612) {
								anIntArray146[anInt1770++] = local137.anInt9266;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray146[--anInt1770];
								local3043 = Static459.aClass38_2.method713(local19);
								if (local3043.method2384()) {
									aStringArray10[anInt1766++] = local137.method7576(local19, local3043.aString28);
									return;
								}
								anIntArray146[anInt1770++] = local137.method7569(local19, local3043.anInt2965);
								return;
							}
							if (arg0 == 1614) {
								anIntArray146[anInt1770++] = local137.anInt9320;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass341_6 : aClass341_7;
							if (arg0 == 1700) {
								anIntArray146[anInt1770++] = local137.anInt9328;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt9328 != -1) {
									anIntArray146[anInt1770++] = local137.anInt9324;
									return;
								}
								anIntArray146[anInt1770++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray146[anInt1770++] = local137.anInt9270;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass341_6 : aClass341_7;
							if (arg0 == 1800) {
								anIntArray146[anInt1770++] = Static63.method1137(local137).method7774();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray146[--anInt1770];
								local19--;
								if (local137.aStringArray38 != null && local19 < local137.aStringArray38.length && local137.aStringArray38[local19] != null) {
									aStringArray10[anInt1766++] = local137.aStringArray38[local19];
									return;
								}
								aStringArray10[anInt1766++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString94 == null) {
									aStringArray10[anInt1766++] = "";
									return;
								}
								aStringArray10[anInt1766++] = local137.aString94;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static350.method4758(anIntArray146[--anInt1770]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass341_6 : aClass341_7;
							}
							if (anInt1771 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray32 == null) {
									return;
								}
								@Pc(3293) Class1_Sub15 local3293 = new Class1_Sub15();
								local3293.aClass341_10 = local137;
								local3293.anObjectArray1 = local137.anObjectArray32;
								local3293.anInt1999 = anInt1771 + 1;
								Static567.aClass353_64.method7679(local3293);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static350.method4758(anIntArray146[--anInt1770]);
							if (arg0 == 2500) {
								anIntArray146[anInt1770++] = local137.anInt9293;
								return;
							}
							if (arg0 == 2501) {
								anIntArray146[anInt1770++] = local137.lb;
								return;
							}
							if (arg0 == 2502) {
								anIntArray146[anInt1770++] = local137.anInt9300;
								return;
							}
							if (arg0 == 2503) {
								anIntArray146[anInt1770++] = local137.anInt9248;
								return;
							}
							if (arg0 == 2504) {
								anIntArray146[anInt1770++] = local137.aBoolean717 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray146[anInt1770++] = local137.anInt9252;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static157.method2282(local137);
								anIntArray146[anInt1770++] = local158 == null ? -1 : local158.anInt9306;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static350.method4758(anIntArray146[--anInt1770]);
							if (arg0 == 2600) {
								anIntArray146[anInt1770++] = local137.anInt9267;
								return;
							}
							if (arg0 == 2601) {
								anIntArray146[anInt1770++] = local137.anInt9256;
								return;
							}
							if (arg0 == 2602) {
								aStringArray10[anInt1766++] = local137.aString95;
								return;
							}
							if (arg0 == 2603) {
								anIntArray146[anInt1770++] = local137.anInt9326;
								return;
							}
							if (arg0 == 2604) {
								anIntArray146[anInt1770++] = local137.anInt9274;
								return;
							}
							if (arg0 == 2605) {
								anIntArray146[anInt1770++] = local137.anInt9276;
								return;
							}
							if (arg0 == 2606) {
								anIntArray146[anInt1770++] = local137.anInt9269;
								return;
							}
							if (arg0 == 2607) {
								anIntArray146[anInt1770++] = local137.anInt9238;
								return;
							}
							if (arg0 == 2608) {
								anIntArray146[anInt1770++] = local137.anInt9323;
								return;
							}
							if (arg0 == 2609) {
								anIntArray146[anInt1770++] = local137.anInt9257;
								return;
							}
							if (arg0 == 2610) {
								anIntArray146[anInt1770++] = local137.anInt9291;
								return;
							}
							if (arg0 == 2611) {
								anIntArray146[anInt1770++] = local137.anInt9239;
								return;
							}
							if (arg0 == 2612) {
								anIntArray146[anInt1770++] = local137.anInt9266;
								return;
							}
							if (arg0 == 2613) {
								anIntArray146[anInt1770++] = local137.anInt9320;
								return;
							}
						} else {
							@Pc(3803) Class1_Sub44 local3803;
							@Pc(3701) Class1_Sub44 local3701;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static350.method4758(anIntArray146[--anInt1770]);
									anIntArray146[anInt1770++] = local137.anInt9328;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static350.method4758(anIntArray146[--anInt1770]);
									if (local137.anInt9328 != -1) {
										anIntArray146[anInt1770++] = local137.anInt9324;
										return;
									}
									anIntArray146[anInt1770++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray146[--anInt1770];
									local3701 = (Class1_Sub44) Static78.aClass187_8.method3797((long) local13);
									if (local3701 != null) {
										anIntArray146[anInt1770++] = 1;
										return;
									}
									anIntArray146[anInt1770++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static350.method4758(anIntArray146[--anInt1770]);
									if (local137.aClass341Array2 == null) {
										anIntArray146[anInt1770++] = 0;
										return;
									}
									local19 = local137.aClass341Array2.length;
									for (local25 = 0; local25 < local137.aClass341Array2.length; local25++) {
										if (local137.aClass341Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray146[anInt1770++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt1770 -= 2;
									local13 = anIntArray146[anInt1770];
									local19 = anIntArray146[anInt1770 + 1];
									local3803 = (Class1_Sub44) Static78.aClass187_8.method3797((long) local13);
									if (local3803 != null && local3803.anInt7685 == local19) {
										anIntArray146[anInt1770++] = 1;
										return;
									}
									anIntArray146[anInt1770++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static350.method4758(anIntArray146[--anInt1770]);
								if (arg0 == 2800) {
									anIntArray146[anInt1770++] = Static63.method1137(local137).method7774();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray146[--anInt1770];
									local19--;
									if (local137.aStringArray38 != null && local19 < local137.aStringArray38.length && local137.aStringArray38[local19] != null) {
										aStringArray10[anInt1766++] = local137.aStringArray38[local19];
										return;
									}
									aStringArray10[anInt1766++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString94 == null) {
										aStringArray10[anInt1766++] = "";
										return;
									}
									aStringArray10[anInt1766++] = local137.aString94;
									return;
								}
							} else {
								@Pc(3940) String local3940;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3940 = aStringArray10[--anInt1766];
										Static520.method7228(local3940);
										return;
									}
									if (arg0 == 3101) {
										anInt1770 -= 2;
										Static443.method6121(anIntArray146[anInt1770 + 1], anIntArray146[anInt1770], Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1);
										return;
									}
									if (arg0 == 3103) {
										Static461.method6378();
										return;
									}
									if (arg0 == 3104) {
										local3940 = aStringArray10[--anInt1766];
										local19 = 0;
										if (Static368.method4957(local3940)) {
											local19 = Static21.method7701(local3940);
										}
										@Pc(4000) Class1_Sub11 local4000 = Static276.method3885(Static10.aClass70_3, Static481.aClass276_2);
										local4000.aClass1_Sub35_Sub2_1.method5792(local19);
										Static48.method743(local4000);
										return;
									}
									@Pc(4029) Class1_Sub11 local4029;
									if (arg0 == 3105) {
										local3940 = aStringArray10[--anInt1766];
										local4029 = Static276.method3885(Static310.aClass70_56, Static481.aClass276_2);
										local4029.aClass1_Sub35_Sub2_1.method5777(local3940.length() + 1);
										local4029.aClass1_Sub35_Sub2_1.method5761(local3940);
										Static48.method743(local4029);
										return;
									}
									if (arg0 == 3106) {
										local3940 = aStringArray10[--anInt1766];
										local4029 = Static276.method3885(Static16.aClass70_5, Static481.aClass276_2);
										local4029.aClass1_Sub35_Sub2_1.method5777(local3940.length() + 1);
										local4029.aClass1_Sub35_Sub2_1.method5761(local3940);
										Static48.method743(local4029);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray146[--anInt1770];
										local1145 = aStringArray10[--anInt1766];
										Static242.method3631(local1145, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt1770 -= 3;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										local25 = anIntArray146[anInt1770 + 2];
										local35 = Static350.method4758(local25);
										Static473.method6470(local19, local35, local13);
										return;
									}
									if (arg0 == 3109) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										local210 = arg1 ? aClass341_6 : aClass341_7;
										Static473.method6470(local19, local210, local13);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray146[--anInt1770];
										local4029 = Static276.method3885(Static521.aClass70_95, Static481.aClass276_2);
										local4029.aClass1_Sub35_Sub2_1.method5776(local13);
										Static48.method743(local4029);
										return;
									}
									if (arg0 == 3111) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										local3803 = (Class1_Sub44) Static78.aClass187_8.method3797((long) local13);
										if (local3803 != null) {
											Static157.method2283(true, local3803.anInt7685 != local19, local3803);
										}
										Static397.method7857(3, local13, true, local19);
										return;
									}
									if (arg0 == 3112) {
										anInt1770--;
										local13 = anIntArray146[anInt1770];
										local3701 = (Class1_Sub44) Static78.aClass187_8.method3797((long) local13);
										if (local3701 != null && local3701.anInt7686 == 3) {
											Static157.method2283(true, true, local3701);
										}
										return;
									}
									if (arg0 == 3113) {
										Static302.method4255(aStringArray10[--anInt1766]);
										return;
									}
									if (arg0 == 3114) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										local1507 = aStringArray10[--anInt1766];
										Static83.method1476(local13, local19, "", "", "", local1507);
										return;
									}
									if (arg0 == 3115) {
										anInt1770 -= 11;
										@Pc(4330) Class335[] local4330 = Static119.method1872();
										@Pc(4333) Class122[] local4333 = Static20.method239();
										Static390.method5394(anIntArray146[anInt1770 + 4], anIntArray146[anInt1770 + 7], anIntArray146[anInt1770 + 10], local4330[anIntArray146[anInt1770]], anIntArray146[anInt1770 + 8], local4333[anIntArray146[anInt1770 + 1]], anIntArray146[anInt1770 + 5], anIntArray146[anInt1770 + 9], anIntArray146[anInt1770 + 2], anIntArray146[anInt1770 + 6], anIntArray146[anInt1770 + 3]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt1770 -= 3;
										Static159.method2289(anIntArray146[anInt1770], anIntArray146[anInt1770 + 1], anIntArray146[anInt1770 + 2], 255);
										return;
									}
									if (arg0 == 3201) {
										Static315.method4375(255, 50, anIntArray146[--anInt1770]);
										return;
									}
									if (arg0 == 3202) {
										anInt1770 -= 2;
										Static382.method5238(anIntArray146[anInt1770], anIntArray146[anInt1770 + 1], 255);
										return;
									}
									if (arg0 == 3203) {
										anInt1770 -= 4;
										Static159.method2289(anIntArray146[anInt1770], anIntArray146[anInt1770 + 1], anIntArray146[anInt1770 + 2], anIntArray146[anInt1770 + 3]);
										return;
									}
									if (arg0 == 3204) {
										anInt1770 -= 3;
										Static315.method4375(anIntArray146[anInt1770 + 1], anIntArray146[anInt1770 + 2], anIntArray146[anInt1770]);
										return;
									}
									if (arg0 == 3205) {
										anInt1770 -= 3;
										Static382.method5238(anIntArray146[anInt1770], anIntArray146[anInt1770 + 1], anIntArray146[anInt1770 + 2]);
										return;
									}
									if (arg0 == 3206) {
										anInt1770 -= 4;
										Static255.method3727(anIntArray146[anInt1770 + 2], false, anIntArray146[anInt1770 + 3], anIntArray146[anInt1770 + 1], anIntArray146[anInt1770]);
										return;
									}
									if (arg0 == 3207) {
										anInt1770 -= 4;
										Static255.method3727(anIntArray146[anInt1770 + 2], true, anIntArray146[anInt1770 + 3], anIntArray146[anInt1770 + 1], anIntArray146[anInt1770]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray146[anInt1770++] = Static301.anInt5197;
										return;
									}
									if (arg0 == 3301) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = Static123.method1926(false, local13, local19);
										return;
									}
									if (arg0 == 3302) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = Static532.method7300(local13, local19, false);
										return;
									}
									if (arg0 == 3303) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = Static340.method4682(local13, local19, false);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static512.aClass357_1.method7738(local13).anInt8678;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static52.anIntArray102[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static524.anIntArray187[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static427.anIntArray572[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4787) byte local4787 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123;
										local19 = (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365 >> 9) + Static541.anInt9058;
										local25 = (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370 >> 9) + Static116.anInt2289;
										anIntArray146[anInt1770++] = (local4787 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray146[anInt1770++] = Static154.aBoolean211 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = Static123.method1926(true, local13, local19);
										return;
									}
									if (arg0 == 3314) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = Static532.method7300(local13, local19, true);
										return;
									}
									if (arg0 == 3315) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = Static340.method4682(local13, local19, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static267.anInt4711 >= 2) {
											anIntArray146[anInt1770++] = Static267.anInt4711;
											return;
										}
										anIntArray146[anInt1770++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray146[anInt1770++] = Static388.anInt6676;
										return;
									}
									if (arg0 == 3318) {
										anIntArray146[anInt1770++] = Static382.aClass227_2.anInt5547;
										return;
									}
									if (arg0 == 3321) {
										anIntArray146[anInt1770++] = Static265.anInt4692;
										return;
									}
									if (arg0 == 3322) {
										anIntArray146[anInt1770++] = Static259.anInt4650;
										return;
									}
									if (arg0 == 3323) {
										if (Static522.anInt8837 >= 5 && Static522.anInt8837 <= 9) {
											anIntArray146[anInt1770++] = 1;
											return;
										}
										anIntArray146[anInt1770++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static522.anInt8837 >= 5 && Static522.anInt8837 <= 9) {
											anIntArray146[anInt1770++] = Static522.anInt8837;
											return;
										}
										anIntArray146[anInt1770++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray146[anInt1770++] = Static82.aBoolean143 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray146[anInt1770++] = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt1736;
										return;
									}
									if (arg0 == 3327) {
										anIntArray146[anInt1770++] = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aClass190_1.aBoolean356 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray146[anInt1770++] = Static422.aBoolean573 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static108.method1742(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = Static565.method7762(local19, local13, false);
										return;
									}
									if (arg0 == 3332) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = Static565.method7762(local19, local13, true);
										return;
									}
									if (arg0 == 3333) {
										anIntArray146[anInt1770++] = Static184.anInt3253;
										return;
									}
									if (arg0 == 3335) {
										anIntArray146[anInt1770++] = Static307.anInt5279;
										return;
									}
									if (arg0 == 3336) {
										anInt1770 -= 4;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										local25 = anIntArray146[anInt1770 + 2];
										local353 = anIntArray146[anInt1770 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray146[anInt1770++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray146[anInt1770++] = Static47.anInt802;
										return;
									}
									if (arg0 == 3338) {
										anIntArray146[anInt1770++] = Static136.method2085();
										return;
									}
									if (arg0 == 3339) {
										anIntArray146[anInt1770++] = Static448.aBoolean596 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray146[anInt1770++] = Static161.aBoolean224 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray146[anInt1770++] = Static22.aBoolean26 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray146[anInt1770++] = Static166.aClass25_1.method4783();
										return;
									}
									if (arg0 == 3343) {
										anIntArray146[anInt1770++] = Static166.aClass25_1.method4788();
										return;
									}
									if (arg0 == 3344) {
										aStringArray10[anInt1766++] = Static466.method6425();
										return;
									}
									if (arg0 == 3345) {
										aStringArray10[anInt1766++] = Static162.method2375();
										return;
									}
									if (arg0 == 3346) {
										anIntArray146[anInt1770++] = Static461.method6376();
										return;
									}
									if (arg0 == 3347) {
										anIntArray146[anInt1770++] = Static344.anInt5738;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5522) Class289 local5522;
									if (arg0 == 3400) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										local5522 = Static243.aClass118_1.method2290(local13);
										aStringArray10[anInt1766++] = local5522.method6237(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt1770 -= 4;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										local25 = anIntArray146[anInt1770 + 2];
										local353 = anIntArray146[anInt1770 + 3];
										@Pc(5568) Class289 local5568 = Static243.aClass118_1.method2290(local25);
										if (local5568.aChar4 == local13 && local5568.aChar5 == local19) {
											if (local19 == 115) {
												aStringArray10[anInt1766++] = local5568.method6237(local353);
												return;
											}
											anIntArray146[anInt1770++] = local5568.method6235(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt1770 -= 3;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										local25 = anIntArray146[anInt1770 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5644) Class289 local5644 = Static243.aClass118_1.method2290(local19);
										if (local5644.aChar5 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray146[anInt1770++] = local5644.method6238(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray146[--anInt1770];
										local1145 = aStringArray10[--anInt1766];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5522 = Static243.aClass118_1.method2290(local13);
										if (local5522.aChar5 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray146[anInt1770++] = local5522.method6241(local1145) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray146[--anInt1770];
										@Pc(5742) Class289 local5742 = Static243.aClass118_1.method2290(local13);
										anIntArray146[anInt1770++] = local5742.aClass187_31.method3796();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static162.anInt2936 == 0) {
											anIntArray146[anInt1770++] = -2;
											return;
										}
										if (Static162.anInt2936 == 1) {
											anIntArray146[anInt1770++] = -1;
											return;
										}
										anIntArray146[anInt1770++] = Static281.anInt4916;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray146[--anInt1770];
										if (Static162.anInt2936 == 2 && local13 < Static281.anInt4916) {
											aStringArray10[anInt1766++] = Static308.aStringArray24[local13];
											if (Static98.aStringArray29[local13] != null) {
												aStringArray10[anInt1766++] = Static98.aStringArray29[local13];
												return;
											}
											aStringArray10[anInt1766++] = "";
											return;
										}
										aStringArray10[anInt1766++] = "";
										aStringArray10[anInt1766++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray146[--anInt1770];
										if (Static162.anInt2936 == 2 && local13 < Static281.anInt4916) {
											anIntArray146[anInt1770++] = Static448.anIntArray598[local13];
											return;
										}
										anIntArray146[anInt1770++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray146[--anInt1770];
										if (Static162.anInt2936 == 2 && local13 < Static281.anInt4916) {
											anIntArray146[anInt1770++] = Static590.anIntArray735[local13];
											return;
										}
										anIntArray146[anInt1770++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3940 = aStringArray10[--anInt1766];
										local19 = anIntArray146[--anInt1770];
										Static294.method4126(local3940, local19);
										return;
									}
									if (arg0 == 3605) {
										local3940 = aStringArray10[--anInt1766];
										Static373.method5032(local3940);
										return;
									}
									if (arg0 == 3606) {
										local3940 = aStringArray10[--anInt1766];
										Static372.method5002(local3940);
										return;
									}
									if (arg0 == 3607) {
										local3940 = aStringArray10[--anInt1766];
										Static395.method5456(local3940, false);
										return;
									}
									if (arg0 == 3608) {
										local3940 = aStringArray10[--anInt1766];
										Static222.method3422(local3940);
										return;
									}
									if (arg0 == 3609) {
										local3940 = aStringArray10[--anInt1766];
										if (local3940.startsWith("<img=0>") || local3940.startsWith("<img=1>")) {
											local3940 = local3940.substring(7);
										}
										anIntArray146[anInt1770++] = Static232.method3509(local3940) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray146[--anInt1770];
										if (Static162.anInt2936 == 2 && local13 < Static281.anInt4916) {
											aStringArray10[anInt1766++] = Static250.aStringArray22[local13];
											return;
										}
										aStringArray10[anInt1766++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static550.aString92 != null) {
											aStringArray10[anInt1766++] = Static190.method2926(Static550.aString92);
											return;
										}
										aStringArray10[anInt1766++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static550.aString92 != null) {
											anIntArray146[anInt1770++] = Static482.anInt8105;
											return;
										}
										anIntArray146[anInt1770++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray146[--anInt1770];
										if (Static550.aString92 != null && local13 < Static482.anInt8105) {
											aStringArray10[anInt1766++] = Static301.aClass218Array1[local13].aString49;
											return;
										}
										aStringArray10[anInt1766++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray146[--anInt1770];
										if (Static550.aString92 != null && local13 < Static482.anInt8105) {
											anIntArray146[anInt1770++] = Static301.aClass218Array1[local13].anInt5411;
											return;
										}
										anIntArray146[anInt1770++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray146[--anInt1770];
										if (Static550.aString92 != null && local13 < Static482.anInt8105) {
											anIntArray146[anInt1770++] = Static301.aClass218Array1[local13].aByte87;
											return;
										}
										anIntArray146[anInt1770++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray146[anInt1770++] = Static6.aByte8;
										return;
									}
									if (arg0 == 3617) {
										local3940 = aStringArray10[--anInt1766];
										Static488.method2261(local3940);
										return;
									}
									if (arg0 == 3618) {
										anIntArray146[anInt1770++] = Static266.aByte70;
										return;
									}
									if (arg0 == 3619) {
										local3940 = aStringArray10[--anInt1766];
										Static505.method7052(local3940);
										return;
									}
									if (arg0 == 3620) {
										Static299.method4180();
										return;
									}
									if (arg0 == 3621) {
										if (Static162.anInt2936 == 0) {
											anIntArray146[anInt1770++] = -1;
											return;
										}
										anIntArray146[anInt1770++] = Static233.anInt7999;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray146[--anInt1770];
										if (Static162.anInt2936 != 0 && local13 < Static233.anInt7999) {
											aStringArray10[anInt1766++] = Static29.aStringArray4[local13];
											if (Static534.aStringArray37[local13] != null) {
												aStringArray10[anInt1766++] = Static534.aStringArray37[local13];
												return;
											}
											aStringArray10[anInt1766++] = "";
											return;
										}
										aStringArray10[anInt1766++] = "";
										aStringArray10[anInt1766++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3940 = aStringArray10[--anInt1766];
										if (local3940.startsWith("<img=0>") || local3940.startsWith("<img=1>")) {
											local3940 = local3940.substring(7);
										}
										anIntArray146[anInt1770++] = Static350.method4761(local3940) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray146[--anInt1770];
										if (Static301.aClass218Array1 != null && local13 < Static482.anInt8105 && Static301.aClass218Array1[local13].aString47.equalsIgnoreCase(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aString16)) {
											anIntArray146[anInt1770++] = 1;
											return;
										}
										anIntArray146[anInt1770++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static424.aString73 != null) {
											aStringArray10[anInt1766++] = Static424.aString73;
											return;
										}
										aStringArray10[anInt1766++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray146[--anInt1770];
										if (Static550.aString92 != null && local13 < Static482.anInt8105) {
											aStringArray10[anInt1766++] = Static301.aClass218Array1[local13].aString48;
											return;
										}
										aStringArray10[anInt1766++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray146[--anInt1770];
										if (Static162.anInt2936 == 2 && local13 >= 0 && local13 < Static281.anInt4916) {
											anIntArray146[anInt1770++] = Static305.aBooleanArray9[local13] ? 1 : 0;
											return;
										}
										anIntArray146[anInt1770++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3940 = aStringArray10[--anInt1766];
										if (local3940.startsWith("<img=0>") || local3940.startsWith("<img=1>")) {
											local3940 = local3940.substring(7);
										}
										anIntArray146[anInt1770++] = Static575.method7737(local3940);
										return;
									}
									if (arg0 == 3629) {
										anIntArray146[anInt1770++] = Static590.anInt9609;
										return;
									}
									if (arg0 == 3630) {
										local3940 = aStringArray10[--anInt1766];
										Static395.method5456(local3940, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static469.aBooleanArray18[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray146[--anInt1770];
										if (Static550.aString92 != null && local13 < Static482.anInt8105) {
											aStringArray10[anInt1766++] = Static301.aClass218Array1[local13].aString47;
											return;
										}
										aStringArray10[anInt1766++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray146[--anInt1770];
										if (Static162.anInt2936 != 0 && local13 < Static233.anInt7999) {
											aStringArray10[anInt1766++] = Static563.aStringArray39[local13];
											return;
										}
										aStringArray10[anInt1766++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static22.aClass61Array1[local13].method1229();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static22.aClass61Array1[local13].anInt1408;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static22.aClass61Array1[local13].anInt1414;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static22.aClass61Array1[local13].anInt1415;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static22.aClass61Array1[local13].anInt1411;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static22.aClass61Array1[local13].anInt1413;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray146[--anInt1770];
										local19 = Static22.aClass61Array1[local13].method1228();
										anIntArray146[anInt1770++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray146[--anInt1770];
										local19 = Static22.aClass61Array1[local13].method1228();
										anIntArray146[anInt1770++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray146[--anInt1770];
										local19 = Static22.aClass61Array1[local13].method1228();
										anIntArray146[anInt1770++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray146[--anInt1770];
										local19 = Static22.aClass61Array1[local13].method1228();
										anIntArray146[anInt1770++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt1770 -= 5;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										local25 = anIntArray146[anInt1770 + 2];
										local353 = anIntArray146[anInt1770 + 3];
										local2309 = anIntArray146[anInt1770 + 4];
										anIntArray146[anInt1770++] = local13 + (local19 - local13) * (local2309 - local25) / (local353 - local25);
										return;
									}
									@Pc(7252) long local7252;
									@Pc(7245) long local7245;
									if (arg0 == 4007) {
										anInt1770 -= 2;
										local7245 = anIntArray146[anInt1770];
										local7252 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = (int) (local7245 + local7245 * local7252 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										if (local13 == 0) {
											anIntArray146[anInt1770++] = 0;
											return;
										}
										anIntArray146[anInt1770++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										if (local13 == 0) {
											anIntArray146[anInt1770++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray146[anInt1770++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray146[anInt1770++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt1770 -= 3;
										local7245 = anIntArray146[anInt1770];
										local7252 = anIntArray146[anInt1770 + 1];
										@Pc(7633) long local7633 = (long) anIntArray146[anInt1770 + 2];
										anIntArray146[anInt1770++] = (int) (local7245 * local7633 / local7252);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3940 = aStringArray10[--anInt1766];
										local19 = anIntArray146[--anInt1770];
										aStringArray10[anInt1766++] = local3940 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt1766 -= 2;
										local3940 = aStringArray10[anInt1766];
										local1145 = aStringArray10[anInt1766 + 1];
										aStringArray10[anInt1766++] = local3940 + local1145;
										return;
									}
									if (arg0 == 4102) {
										local3940 = aStringArray10[--anInt1766];
										local19 = anIntArray146[--anInt1770];
										aStringArray10[anInt1766++] = local3940 + Static391.method5398(local19);
										return;
									}
									if (arg0 == 4103) {
										local3940 = aStringArray10[--anInt1766];
										aStringArray10[anInt1766++] = local3940.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray10[anInt1766++] = method1455(anIntArray146[--anInt1770]);
										return;
									}
									if (arg0 == 4105) {
										anInt1766 -= 2;
										local3940 = aStringArray10[anInt1766];
										local1145 = aStringArray10[anInt1766 + 1];
										if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aClass190_1 != null && Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aClass190_1.aBoolean356) {
											aStringArray10[anInt1766++] = local1145;
											return;
										}
										aStringArray10[anInt1766++] = local3940;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray146[--anInt1770];
										aStringArray10[anInt1766++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt1766 -= 2;
										anIntArray146[anInt1770++] = Static53.method977(aStringArray10[anInt1766], Static307.anInt5279, aStringArray10[anInt1766 + 1]);
										return;
									}
									@Pc(7916) Class334 local7916;
									if (arg0 == 4108) {
										local3940 = aStringArray10[--anInt1766];
										anInt1770 -= 2;
										local19 = anIntArray146[anInt1770];
										local25 = anIntArray146[anInt1770 + 1];
										local7916 = Static358.method4885(Static412.aClass270_85, local25);
										anIntArray146[anInt1770++] = local7916.method7361(local19, Static369.aClass22Array18, local3940);
										return;
									}
									if (arg0 == 4109) {
										local3940 = aStringArray10[--anInt1766];
										anInt1770 -= 2;
										local19 = anIntArray146[anInt1770];
										local25 = anIntArray146[anInt1770 + 1];
										local7916 = Static358.method4885(Static412.aClass270_85, local25);
										anIntArray146[anInt1770++] = local7916.method7352(local3940, Static369.aClass22Array18, local19);
										return;
									}
									if (arg0 == 4110) {
										anInt1766 -= 2;
										local3940 = aStringArray10[anInt1766];
										local1145 = aStringArray10[anInt1766 + 1];
										if (anIntArray146[--anInt1770] == 1) {
											aStringArray10[anInt1766++] = local3940;
											return;
										}
										aStringArray10[anInt1766++] = local1145;
										return;
									}
									if (arg0 == 4111) {
										local3940 = aStringArray10[--anInt1766];
										aStringArray10[anInt1766++] = Static93.method1618(local3940);
										return;
									}
									if (arg0 == 4112) {
										local3940 = aStringArray10[--anInt1766];
										local19 = anIntArray146[--anInt1770];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray10[anInt1766++] = local3940 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static101.method1681((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static535.method7314((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static349.method4739((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static365.method4938((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3940 = aStringArray10[--anInt1766];
										if (local3940 != null) {
											anIntArray146[anInt1770++] = local3940.length();
											return;
										}
										anIntArray146[anInt1770++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3940 = aStringArray10[--anInt1766];
										anInt1770 -= 2;
										local19 = anIntArray146[anInt1770];
										local25 = anIntArray146[anInt1770 + 1];
										aStringArray10[anInt1766++] = local3940.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3940 = aStringArray10[--anInt1766];
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
										aStringArray10[anInt1766++] = local8279.toString();
										return;
									}
									if (arg0 == 4120) {
										local3940 = aStringArray10[--anInt1766];
										anInt1770 -= 2;
										local19 = anIntArray146[anInt1770];
										local25 = anIntArray146[anInt1770 + 1];
										anIntArray146[anInt1770++] = local3940.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt1766 -= 2;
										local3940 = aStringArray10[anInt1766];
										local1145 = aStringArray10[anInt1766 + 1];
										local25 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = local3940.indexOf(local1145, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray146[--anInt1770] != 0;
										local19 = anIntArray146[--anInt1770];
										aStringArray10[anInt1766++] = Static529.method7270((long) local19, local412, Static307.anInt5279, 0);
										return;
									}
									if (arg0 == 4125) {
										local3940 = aStringArray10[--anInt1766];
										local19 = anIntArray146[--anInt1770];
										@Pc(8502) Class334 local8502 = Static358.method4885(Static412.aClass270_85, local19);
										anIntArray146[anInt1770++] = local8502.method7358(Static369.aClass22Array18, local3940);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray146[--anInt1770];
										aStringArray10[anInt1766++] = Static175.aClass114_4.method2217(local13).aString62;
										return;
									}
									@Pc(8564) Class245 local8564;
									if (arg0 == 4201) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										local8564 = Static175.aClass114_4.method2217(local13);
										if (local19 >= 1 && local19 <= 5 && local8564.aStringArray27[local19 - 1] != null) {
											aStringArray10[anInt1766++] = local8564.aStringArray27[local19 - 1];
											return;
										}
										aStringArray10[anInt1766++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										local8564 = Static175.aClass114_4.method2217(local13);
										if (local19 >= 1 && local19 <= 5 && local8564.aStringArray28[local19 - 1] != null) {
											aStringArray10[anInt1766++] = local8564.aStringArray28[local19 - 1];
											return;
										}
										aStringArray10[anInt1766++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static175.aClass114_4.method2217(local13).anInt6183;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static175.aClass114_4.method2217(local13).anInt6233 == 1 ? 1 : 0;
										return;
									}
									@Pc(8727) Class245 local8727;
									if (arg0 == 4205) {
										local13 = anIntArray146[--anInt1770];
										local8727 = Static175.aClass114_4.method2217(local13);
										if (local8727.anInt6232 == -1 && local8727.anInt6184 >= 0) {
											anIntArray146[anInt1770++] = local8727.anInt6184;
											return;
										}
										anIntArray146[anInt1770++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray146[--anInt1770];
										local8727 = Static175.aClass114_4.method2217(local13);
										if (local8727.anInt6232 >= 0 && local8727.anInt6184 >= 0) {
											anIntArray146[anInt1770++] = local8727.anInt6184;
											return;
										}
										anIntArray146[anInt1770++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static175.aClass114_4.method2217(local13).aBoolean490 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										local3043 = Static459.aClass38_2.method713(local19);
										if (local3043.method2384()) {
											aStringArray10[anInt1766++] = Static175.aClass114_4.method2217(local13).method4996(local3043.aString28, local19);
											return;
										}
										anIntArray146[anInt1770++] = Static175.aClass114_4.method2217(local13).method5000(local19, local3043.anInt2965);
										return;
									}
									if (arg0 == 4209) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1] - 1;
										local8564 = Static175.aClass114_4.method2217(local13);
										if (local8564.anInt6202 == local19) {
											anIntArray146[anInt1770++] = local8564.anInt6180;
											return;
										}
										if (local8564.anInt6208 == local19) {
											anIntArray146[anInt1770++] = local8564.anInt6234;
											return;
										}
										anIntArray146[anInt1770++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3940 = aStringArray10[--anInt1766];
										local19 = anIntArray146[--anInt1770];
										Static385.method5298(local3940, local19 == 1);
										anIntArray146[anInt1770++] = Static86.anInt1814;
										return;
									}
									if (arg0 == 4211) {
										if (Static101.aShortArray46 != null && Static33.anInt2652 < Static86.anInt1814) {
											anIntArray146[anInt1770++] = Static101.aShortArray46[Static33.anInt2652++] & 0xFFFF;
											return;
										}
										anIntArray146[anInt1770++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static33.anInt2652 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray146[--anInt1770];
										anIntArray146[anInt1770++] = Static175.aClass114_4.method2217(local13).anInt6222;
										return;
									}
									if (arg0 == 4214) {
										local3940 = aStringArray10[--anInt1766];
										anInt1770 -= 3;
										local19 = anIntArray146[anInt1770];
										local25 = anIntArray146[anInt1770 + 1];
										local353 = anIntArray146[anInt1770 + 2];
										Static307.method4285(local25, local3940, local353, local19 == 1);
										anIntArray146[anInt1770++] = Static86.anInt1814;
										return;
									}
									if (arg0 == 4215) {
										anInt1766 -= 2;
										anInt1770 -= 2;
										local3940 = aStringArray10[anInt1766];
										local19 = anIntArray146[anInt1770];
										local25 = anIntArray146[anInt1770 + 1];
										@Pc(9126) String local9126 = aStringArray10[anInt1766 + 1];
										Static532.method7303(local25, local3940, local19 == 1, local9126);
										anIntArray146[anInt1770++] = Static86.anInt1814;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										local3043 = Static459.aClass38_2.method713(local19);
										if (local3043.method2384()) {
											aStringArray10[anInt1766++] = Static322.aClass326_2.method7234(local13).method279(local3043.aString28, local19);
											return;
										}
										anIntArray146[anInt1770++] = Static322.aClass326_2.method7234(local13).method276(local3043.anInt2965, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										local3043 = Static459.aClass38_2.method713(local19);
										if (local3043.method2384()) {
											aStringArray10[anInt1766++] = Static518.aClass96_4.method1925(local13).method1912(local3043.aString28, local19);
											return;
										}
										anIntArray146[anInt1770++] = Static518.aClass96_4.method1925(local13).method1914(local3043.anInt2965, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt1770 -= 2;
										local13 = anIntArray146[anInt1770];
										local19 = anIntArray146[anInt1770 + 1];
										local3043 = Static459.aClass38_2.method713(local19);
										if (local3043.method2384()) {
											aStringArray10[anInt1766++] = Static430.aClass265_1.method5652(local13).method7125(local3043.aString28, local19);
											return;
										}
										anIntArray146[anInt1770++] = Static430.aClass265_1.method5652(local13).method7122(local19, local3043.anInt2965);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray146[--anInt1770];
									@Pc(9354) Class140 local9354 = Static384.aClass305_1.method6490(local13);
									if (local9354.anIntArray314 != null && local9354.anIntArray314.length > 0) {
										local25 = 0;
										local353 = local9354.anIntArray313[0];
										for (local2309 = 1; local2309 < local9354.anIntArray314.length; local2309++) {
											if (local9354.anIntArray313[local2309] > local353) {
												local25 = local2309;
												local353 = local9354.anIntArray313[local2309];
											}
										}
										anIntArray146[anInt1770++] = local9354.anIntArray314[local25];
										return;
									}
									anIntArray146[anInt1770++] = local9354.anInt3613;
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

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method1455(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray11[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method1456(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static267.anInt4711 == 0 && (Static274.aBoolean30 && !Static357.aBoolean467 || Static422.aBoolean573)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static568.aClass351_51.method7651(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static568.aClass351_51.method7651(0).length());
		} else if (local11.startsWith(Static568.aClass351_52.method7651(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static568.aClass351_52.method7651(0).length());
		} else if (local11.startsWith(Static568.aClass351_53.method7651(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static568.aClass351_53.method7651(0).length());
		} else if (local11.startsWith(Static568.aClass351_54.method7651(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static568.aClass351_54.method7651(0).length());
		} else if (local11.startsWith(Static568.aClass351_55.method7651(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static568.aClass351_55.method7651(0).length());
		} else if (local11.startsWith(Static568.aClass351_56.method7651(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static568.aClass351_56.method7651(0).length());
		} else if (local11.startsWith(Static568.aClass351_57.method7651(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static568.aClass351_57.method7651(0).length());
		} else if (local11.startsWith(Static568.aClass351_58.method7651(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static568.aClass351_58.method7651(0).length());
		} else if (local11.startsWith(Static568.aClass351_59.method7651(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static568.aClass351_59.method7651(0).length());
		} else if (local11.startsWith(Static568.aClass351_60.method7651(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static568.aClass351_60.method7651(0).length());
		} else if (local11.startsWith(Static568.aClass351_61.method7651(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static568.aClass351_61.method7651(0).length());
		} else if (local11.startsWith(Static568.aClass351_62.method7651(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static568.aClass351_62.method7651(0).length());
		} else if (Static307.anInt5279 != 0) {
			if (local11.startsWith(Static568.aClass351_51.method7651(Static307.anInt5279))) {
				local13 = 0;
				arg0 = arg0.substring(Static568.aClass351_51.method7651(Static307.anInt5279).length());
			} else if (local11.startsWith(Static568.aClass351_52.method7651(Static307.anInt5279))) {
				local13 = 1;
				arg0 = arg0.substring(Static568.aClass351_52.method7651(Static307.anInt5279).length());
			} else if (local11.startsWith(Static568.aClass351_53.method7651(Static307.anInt5279))) {
				local13 = 2;
				arg0 = arg0.substring(Static568.aClass351_53.method7651(Static307.anInt5279).length());
			} else if (local11.startsWith(Static568.aClass351_54.method7651(Static307.anInt5279))) {
				local13 = 3;
				arg0 = arg0.substring(Static568.aClass351_54.method7651(Static307.anInt5279).length());
			} else if (local11.startsWith(Static568.aClass351_55.method7651(Static307.anInt5279))) {
				local13 = 4;
				arg0 = arg0.substring(Static568.aClass351_55.method7651(Static307.anInt5279).length());
			} else if (local11.startsWith(Static568.aClass351_56.method7651(Static307.anInt5279))) {
				local13 = 5;
				arg0 = arg0.substring(Static568.aClass351_56.method7651(Static307.anInt5279).length());
			} else if (local11.startsWith(Static568.aClass351_57.method7651(Static307.anInt5279))) {
				local13 = 6;
				arg0 = arg0.substring(Static568.aClass351_57.method7651(Static307.anInt5279).length());
			} else if (local11.startsWith(Static568.aClass351_58.method7651(Static307.anInt5279))) {
				local13 = 7;
				arg0 = arg0.substring(Static568.aClass351_58.method7651(Static307.anInt5279).length());
			} else if (local11.startsWith(Static568.aClass351_59.method7651(Static307.anInt5279))) {
				local13 = 8;
				arg0 = arg0.substring(Static568.aClass351_59.method7651(Static307.anInt5279).length());
			} else if (local11.startsWith(Static568.aClass351_60.method7651(Static307.anInt5279))) {
				local13 = 9;
				arg0 = arg0.substring(Static568.aClass351_60.method7651(Static307.anInt5279).length());
			} else if (local11.startsWith(Static568.aClass351_61.method7651(Static307.anInt5279))) {
				local13 = 10;
				arg0 = arg0.substring(Static568.aClass351_61.method7651(Static307.anInt5279).length());
			} else if (local11.startsWith(Static568.aClass351_62.method7651(Static307.anInt5279))) {
				local13 = 11;
				arg0 = arg0.substring(Static568.aClass351_62.method7651(Static307.anInt5279).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Class351.lb.method7651(0))) {
			local451 = 1;
			arg0 = arg0.substring(Class351.lb.method7651(0).length());
		} else if (local11.startsWith(Static568.aClass351_63.method7651(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static568.aClass351_63.method7651(0).length());
		} else if (local11.startsWith(Static568.aClass351_64.method7651(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static568.aClass351_64.method7651(0).length());
		} else if (local11.startsWith(Static568.aClass351_65.method7651(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static568.aClass351_65.method7651(0).length());
		} else if (local11.startsWith(Static568.aClass351_66.method7651(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static568.aClass351_66.method7651(0).length());
		} else if (Static307.anInt5279 != 0) {
			if (local11.startsWith(Class351.lb.method7651(Static307.anInt5279))) {
				local451 = 1;
				arg0 = arg0.substring(Class351.lb.method7651(Static307.anInt5279).length());
			} else if (local11.startsWith(Static568.aClass351_63.method7651(Static307.anInt5279))) {
				local451 = 2;
				arg0 = arg0.substring(Static568.aClass351_63.method7651(Static307.anInt5279).length());
			} else if (local11.startsWith(Static568.aClass351_64.method7651(Static307.anInt5279))) {
				local451 = 3;
				arg0 = arg0.substring(Static568.aClass351_64.method7651(Static307.anInt5279).length());
			} else if (local11.startsWith(Static568.aClass351_65.method7651(Static307.anInt5279))) {
				local451 = 4;
				arg0 = arg0.substring(Static568.aClass351_65.method7651(Static307.anInt5279).length());
			} else if (local11.startsWith(Static568.aClass351_66.method7651(Static307.anInt5279))) {
				local451 = 5;
				arg0 = arg0.substring(Static568.aClass351_66.method7651(Static307.anInt5279).length());
			}
		}
		@Pc(641) Class1_Sub11 local641 = Static276.method3885(Static204.aClass70_33, Static481.aClass276_2);
		local641.aClass1_Sub35_Sub2_1.method5777(0);
		@Pc(650) int local650 = local641.aClass1_Sub35_Sub2_1.anInt7214;
		local641.aClass1_Sub35_Sub2_1.method5777(local13);
		local641.aClass1_Sub35_Sub2_1.method5777(local451);
		Static205.method7547(local641.aClass1_Sub35_Sub2_1, arg0);
		local641.aClass1_Sub35_Sub2_1.method5791(local641.aClass1_Sub35_Sub2_1.anInt7214 - local650);
		Static48.method743(local641);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!mp;I)V")
	private static void method1457(@OriginalArg(0) Class1_Sub6_Sub10 arg0, @OriginalArg(1) int arg1) {
		anInt1770 = 0;
		anInt1766 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray448;
		@Pc(11) int[] local11 = arg0.anIntArray447;
		@Pc(13) byte local13 = -1;
		anInt1759 = 0;
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
						method1453(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method1449(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray146[anInt1770++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray146[anInt1770++] = Static430.aClass321_1.anIntArray654[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static430.aClass321_1.method7085(local54, anIntArray146[--anInt1770]);
					} else if (local31 == 3) {
						aStringArray10[anInt1766++] = arg0.aStringArray26[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt1770 -= 2;
						if (anIntArray146[anInt1770] != anIntArray146[anInt1770 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt1770 -= 2;
						if (anIntArray146[anInt1770] == anIntArray146[anInt1770 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt1770 -= 2;
						if (anIntArray146[anInt1770] < anIntArray146[anInt1770 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt1770 -= 2;
						if (anIntArray146[anInt1770] > anIntArray146[anInt1770 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt1759 == 0) {
							return;
						}
						@Pc(216) Class165 local216 = aClass165Array1[--anInt1759];
						arg0 = local216.aClass1_Sub6_Sub10_1;
						local8 = arg0.anIntArray448;
						local11 = arg0.anIntArray447;
						local5 = local216.anInt4303;
						anIntArray144 = local216.anIntArray338;
						aStringArray9 = local216.aStringArray20;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray146[anInt1770++] = Static430.aClass321_1.method7083(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static430.aClass321_1.method7088(anIntArray146[--anInt1770], local54);
					} else if (local31 == 31) {
						anInt1770 -= 2;
						if (anIntArray146[anInt1770] <= anIntArray146[anInt1770 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt1770 -= 2;
						if (anIntArray146[anInt1770] >= anIntArray146[anInt1770 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray146[anInt1770++] = anIntArray144[local11[local5]];
					} else if (local31 == 34) {
						anIntArray144[local11[local5]] = anIntArray146[--anInt1770];
					} else if (local31 == 35) {
						aStringArray10[anInt1766++] = aStringArray9[local11[local5]];
					} else if (local31 == 36) {
						aStringArray9[local11[local5]] = aStringArray10[--anInt1766];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt1766 -= local54;
						@Pc(400) String local400 = Static361.method4896(aStringArray10, local54, anInt1766);
						aStringArray10[anInt1766++] = local400;
					} else if (local31 == 38) {
						anInt1770--;
					} else if (local31 == 39) {
						anInt1766--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class1_Sub6_Sub10 local436 = Static120.method1903(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt5635];
							@Pc(450) String[] local450 = new String[local436.anInt5637];
							for (local452 = 0; local452 < local436.anInt5634; local452++) {
								local446[local452] = anIntArray146[anInt1770 + local452 - local436.anInt5634];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt5636; local471++) {
								local450[local471] = aStringArray10[anInt1766 + local471 - local436.anInt5636];
							}
							anInt1770 -= local436.anInt5634;
							anInt1766 -= local436.anInt5636;
							@Pc(502) Class165 local502 = new Class165();
							local502.aClass1_Sub6_Sub10_1 = arg0;
							local502.anInt4303 = local5;
							local502.anIntArray338 = anIntArray144;
							local502.aStringArray20 = aStringArray9;
							if (anInt1759 >= aClass165Array1.length) {
								throw new RuntimeException();
							}
							aClass165Array1[anInt1759++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray448;
							local11 = local436.anIntArray447;
							local5 = -1;
							anIntArray144 = local446;
							aStringArray9 = local450;
						} else if (local31 == 42) {
							anIntArray146[anInt1770++] = Static257.anIntArray365[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static257.anIntArray365[local54] = anIntArray146[--anInt1770];
							Static114.method1790(local54);
							Static151.aBoolean207 |= Static574.aBooleanArray27[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray146[--anInt1770];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray145[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray40[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray146[--anInt1770];
							if (local603 < 0 || local603 >= anIntArray145[local54]) {
								throw new RuntimeException();
							}
							anIntArray146[anInt1770++] = anIntArrayArray40[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt1770 -= 2;
							local603 = anIntArray146[anInt1770];
							if (local603 < 0 || local603 >= anIntArray145[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray40[local54][local603] = anIntArray146[anInt1770 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static317.aStringArray25[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray10[anInt1766++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static317.aStringArray25[local54] = aStringArray10[--anInt1766];
							Static390.method5395(local54);
						} else if (local31 == 51) {
							@Pc(774) Class187 local774 = arg0.aClass187Array1[local11[local5]];
							@Pc(787) Class1_Sub13 local787 = (Class1_Sub13) local774.method3797((long) anIntArray146[--anInt1770]);
							if (local787 != null) {
								local5 += local787.anInt1812;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString54 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong301).append(" ");
				for (local603 = anInt1759 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass165Array1[local603].aClass1_Sub6_Sub10_1.aLong301).append(" ");
				}
				local856.append("op: ").append(local13);
				Static345.method4708(local837, local856.toString());
			} else {
				Static571.method7692("Clientscript error in: " + arg0.aString54);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString54).append("\n");
				for (local603 = anInt1759 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass165Array1[local603].aClass1_Sub6_Sub10_1.aString54).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static345.method4708(local837, local856.toString());
				Static165.method2388(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!uc;II)V")
	public static void method1458(@OriginalArg(0) Class324 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub6_Sub10 local5 = Static471.method6444(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray144 = new int[local5.anInt5635];
		aStringArray9 = new String[local5.anInt5637];
		if (local5.aClass324_31 == Static432.aClass324_42 || local5.aClass324_31 == Static580.aClass324_53 || local5.aClass324_31 == Static21.aClass324_52) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static323.aClass341_14 != null) {
				local30 = Static323.aClass341_14.anInt9293;
				local32 = Static323.aClass341_14.lb;
			}
			anIntArray144[0] = Static166.aClass25_1.method4783() - local30;
			anIntArray144[1] = Static166.aClass25_1.method4788() - local32;
		}
		method1457(local5, 200000);
	}

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "(I)V")
	public static void method1459(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static504.method4690(arg0)) {
			return;
		}
		@Pc(12) Class341[] local12 = Static578.aClass341ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class341 local19 = local12[local14];
			if (local19.anObjectArray31 != null) {
				@Pc(26) Class1_Sub15 local26 = new Class1_Sub15();
				local26.aClass341_10 = local19;
				local26.anObjectArray1 = local19.anObjectArray31;
				method1448(local26, 2000000);
			}
		}
	}
}
