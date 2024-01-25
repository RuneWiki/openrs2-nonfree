import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "Lclient!vfa;")
	private static Class357 aClass357_4;

	@OriginalMember(owner = "client!cw", name = "o", descriptor = "Lclient!vfa;")
	private static Class357 aClass357_5;

	@OriginalMember(owner = "client!cw", name = "r", descriptor = "Lclient!aaa;")
	private static Class2 aClass2_1;

	@OriginalMember(owner = "client!cw", name = "t", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray5;

	@OriginalMember(owner = "client!cw", name = "v", descriptor = "[I")
	private static int[] anIntArray108;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "[I")
	private static final int[] anIntArray106 = new int[1000];

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
	private static int anInt1378 = 0;

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_9 = new Class293(4);

	@OriginalMember(owner = "client!cw", name = "k", descriptor = "[[I")
	private static final int[][] anIntArrayArray8 = new int[5][5000];

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "[Lclient!jga;")
	private static final Class168[] aClass168Array1 = new Class168[50];

	@OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
	private static int anInt1382 = 0;

	@OriginalMember(owner = "client!cw", name = "p", descriptor = "[I")
	private static final int[] anIntArray107 = new int[3];

	@OriginalMember(owner = "client!cw", name = "w", descriptor = "[I")
	private static final int[] anIntArray109 = new int[5];

	@OriginalMember(owner = "client!cw", name = "x", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray6 = new String[1000];

	@OriginalMember(owner = "client!cw", name = "y", descriptor = "I")
	private static int anInt1387 = 0;

	@OriginalMember(owner = "client!cw", name = "A", descriptor = "I")
	private static int anInt1389 = 0;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IZ)V")
	public static void method1315() {
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!ca;I)V")
	private static void method1316(@OriginalArg(0) Class5_Sub9 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class5_Sub4_Sub19 local12 = Static635.method8767(local8);
		if (local12 == null) {
			return;
		}
		anIntArray108 = new int[local12.anInt9124];
		@Pc(21) int local21 = 0;
		aStringArray5 = new String[local12.anInt9126];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt916;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt911;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass357_2 == null ? -1 : arg0.aClass357_2.anInt9804;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt912;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass357_2 == null ? -1 : arg0.aClass357_2.anInt9846;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass357_3 == null ? -1 : arg0.aClass357_3.anInt9804;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass357_3 == null ? -1 : arg0.aClass357_3.anInt9846;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt918;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt919;
				}
				anIntArray108[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString16;
				}
				aStringArray5[local27++] = local135;
			}
		}
		anInt1389 = arg0.anInt910;
		method1322(local12, arg1);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!ca;)V")
	public static void method1317(@OriginalArg(0) Class5_Sub9 arg0) {
		method1316(arg0, 200000);
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(IZ)V")
	private static void method1318(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class5_Sub40 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray106[anInt1382++] = Static111.anInt1765;
				return;
			}
			if (arg0 == 5001) {
				anInt1382 -= 3;
				Static111.anInt1765 = anIntArray106[anInt1382];
				Static585.aClass219_3 = Static518.method7450(anIntArray106[anInt1382 + 1]);
				if (Static585.aClass219_3 == null) {
					Static585.aClass219_3 = Static585.aClass219_2;
				}
				Static75.anInt1264 = anIntArray106[anInt1382 + 2];
				local52 = Static25.method507(Static98.aClass208_2, Static626.aClass181_94);
				local52.aClass5_Sub12_Sub2_2.method8647(Static111.anInt1765);
				local52.aClass5_Sub12_Sub2_2.method8647(Static585.aClass219_3.anInt5809);
				local52.aClass5_Sub12_Sub2_2.method8647(Static75.anInt1264);
				Static612.method8496(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt1378 -= 2;
				local83 = aStringArray6[anInt1378];
				local89 = aStringArray6[anInt1378 + 1];
				anInt1382 -= 2;
				local97 = anIntArray106[anInt1382];
				local103 = anIntArray106[anInt1382 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class5_Sub40 local125 = Static25.method507(Static98.aClass208_2, Static563.aClass181_84);
				local125.aClass5_Sub12_Sub2_2.method8647(Static352.method5589(local83) + Static352.method5589(local89) + 2);
				local125.aClass5_Sub12_Sub2_2.method8619(local83);
				local125.aClass5_Sub12_Sub2_2.method8647(local97 - 1);
				local125.aClass5_Sub12_Sub2_2.method8647(local103);
				local125.aClass5_Sub12_Sub2_2.method8619(local89);
				Static612.method8496(local125);
				return;
			}
			@Pc(179) Class112 local179;
			if (arg0 == 5003) {
				local175 = anIntArray106[--anInt1382];
				local179 = Static379.method7521(local175);
				local181 = "";
				if (local179 != null && local179.aString47 != null) {
					local181 = local179.aString47;
				}
				aStringArray6[anInt1378++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray106[--anInt1382];
				local179 = Static379.method7521(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt2800;
				}
				anIntArray106[anInt1382++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static585.aClass219_3 == null) {
					anIntArray106[anInt1382++] = -1;
					return;
				}
				anIntArray106[anInt1382++] = Static585.aClass219_3.anInt5809;
				return;
			}
			@Pc(269) Class5_Sub40 local269;
			if (arg0 == 5006) {
				local175 = anIntArray106[--anInt1382];
				local269 = Static25.method507(Static98.aClass208_2, Static51.aClass181_12);
				local269.aClass5_Sub12_Sub2_2.method8647(local175);
				Static612.method8496(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray6[--anInt1378];
				method1320(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt1378 -= 2;
				local83 = aStringArray6[anInt1378];
				local89 = aStringArray6[anInt1378 + 1];
				if (Static408.anInt7025 != 0 || (!Static205.aBoolean296 || Static33.aBoolean54) && !Static324.aBoolean473) {
					@Pc(328) Class5_Sub40 local328 = Static25.method507(Static98.aClass208_2, Static45.aClass181_11);
					local328.aClass5_Sub12_Sub2_2.method8647(0);
					local103 = local328.aClass5_Sub12_Sub2_2.anInt10154;
					local328.aClass5_Sub12_Sub2_2.method8619(local83);
					Static283.method4245(local328.aClass5_Sub12_Sub2_2, local89);
					local328.aClass5_Sub12_Sub2_2.method8652(local328.aClass5_Sub12_Sub2_2.anInt10154 - local103);
					Static612.method8496(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray106[--anInt1382];
				local179 = Static379.method7521(local175);
				local181 = "";
				if (local179 != null && local179.aString46 != null) {
					local181 = local179.aString46;
				}
				aStringArray6[anInt1378++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray106[--anInt1382];
				local179 = Static379.method7521(local175);
				local181 = "";
				if (local179 != null && local179.aString49 != null) {
					local181 = local179.aString49;
				}
				aStringArray6[anInt1378++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray106[--anInt1382];
				local179 = Static379.method7521(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt2794;
				}
				anIntArray106[anInt1382++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 == null || Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aString43 == null) {
					local83 = "";
				} else {
					local83 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.method2375();
				}
				aStringArray6[anInt1378++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray106[anInt1382++] = Static75.anInt1264;
				return;
			}
			if (arg0 == 5017) {
				anIntArray106[anInt1382++] = Static409.method6257();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray106[--anInt1382];
				local179 = Static379.method7521(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt2797;
				}
				anIntArray106[anInt1382++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray106[--anInt1382];
				local179 = Static379.method7521(local175);
				local181 = "";
				if (local179 != null && local179.aString48 != null) {
					local181 = local179.aString48;
				}
				aStringArray6[anInt1378++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 == null || Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aString43 == null) {
					local83 = "";
				} else {
					local83 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.method2373();
				}
				aStringArray6[anInt1378++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray106[--anInt1382];
				local179 = Static379.method7521(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt2796;
				}
				anIntArray106[anInt1382++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray106[--anInt1382];
				local179 = Static379.method7521(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt2795;
				}
				anIntArray106[anInt1382++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray106[--anInt1382];
				local179 = Static379.method7521(local175);
				local181 = "";
				if (local179 != null && local179.aString45 != null) {
					local181 = local179.aString45;
				}
				aStringArray6[anInt1378++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray106[--anInt1382];
				aStringArray6[anInt1378++] = Static48.aClass12_1.method193(local175).aString38;
				return;
			}
			@Pc(736) Class5_Sub4_Sub7 local736;
			if (arg0 == 5051) {
				local175 = anIntArray106[--anInt1382];
				local736 = Static48.aClass12_1.method193(local175);
				if (local736.anIntArray190 == null) {
					anIntArray106[anInt1382++] = 0;
					return;
				}
				anIntArray106[anInt1382++] = local736.anIntArray190.length;
				return;
			}
			if (arg0 == 5052) {
				anInt1382 -= 2;
				local175 = anIntArray106[anInt1382];
				local776 = anIntArray106[anInt1382 + 1];
				@Pc(781) Class5_Sub4_Sub7 local781 = Static48.aClass12_1.method193(local175);
				local103 = local781.anIntArray190[local776];
				anIntArray106[anInt1382++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray106[--anInt1382];
				local736 = Static48.aClass12_1.method193(local175);
				if (local736.anIntArray189 == null) {
					anIntArray106[anInt1382++] = 0;
					return;
				}
				anIntArray106[anInt1382++] = local736.anIntArray189.length;
				return;
			}
			if (arg0 == 5054) {
				anInt1382 -= 2;
				local175 = anIntArray106[anInt1382];
				local776 = anIntArray106[anInt1382 + 1];
				anIntArray106[anInt1382++] = Static48.aClass12_1.method193(local175).anIntArray189[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray106[--anInt1382];
				aStringArray6[anInt1378++] = Static473.aClass171_1.method4004(local175).method8753();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray106[--anInt1382];
				@Pc(907) Class5_Sub4_Sub21 local907 = Static473.aClass171_1.method4004(local175);
				if (local907.anIntArray824 == null) {
					anIntArray106[anInt1382++] = 0;
					return;
				}
				anIntArray106[anInt1382++] = local907.anIntArray824.length;
				return;
			}
			if (arg0 == 5057) {
				anInt1382 -= 2;
				local175 = anIntArray106[anInt1382];
				local776 = anIntArray106[anInt1382 + 1];
				anIntArray106[anInt1382++] = Static473.aClass171_1.method4004(local175).anIntArray824[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass2_1 = new Class2();
				aClass2_1.anInt9 = anIntArray106[--anInt1382];
				aClass2_1.aClass5_Sub4_Sub21_1 = Static473.aClass171_1.method4004(aClass2_1.anInt9);
				aClass2_1.anIntArray2 = new int[aClass2_1.aClass5_Sub4_Sub21_1.method8752()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static25.method507(Static98.aClass208_2, Static19.aClass181_6);
				local52.aClass5_Sub12_Sub2_2.method8647(0);
				local776 = local52.aClass5_Sub12_Sub2_2.anInt10154;
				local52.aClass5_Sub12_Sub2_2.method8647(0);
				local52.aClass5_Sub12_Sub2_2.method8655(aClass2_1.anInt9);
				aClass2_1.aClass5_Sub4_Sub21_1.method8748(local52.aClass5_Sub12_Sub2_2, aClass2_1.anIntArray2);
				local52.aClass5_Sub12_Sub2_2.method8652(local52.aClass5_Sub12_Sub2_2.anInt10154 - local776);
				Static612.method8496(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray6[--anInt1378];
				local269 = Static25.method507(Static98.aClass208_2, Static214.aClass181_33);
				local269.aClass5_Sub12_Sub2_2.method8647(0);
				local97 = local269.aClass5_Sub12_Sub2_2.anInt10154;
				local269.aClass5_Sub12_Sub2_2.method8619(local83);
				local269.aClass5_Sub12_Sub2_2.method8655(aClass2_1.anInt9);
				aClass2_1.aClass5_Sub4_Sub21_1.method8748(local269.aClass5_Sub12_Sub2_2, aClass2_1.anIntArray2);
				local269.aClass5_Sub12_Sub2_2.method8652(local269.aClass5_Sub12_Sub2_2.anInt10154 - local97);
				Static612.method8496(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static25.method507(Static98.aClass208_2, Static19.aClass181_6);
				local52.aClass5_Sub12_Sub2_2.method8647(0);
				local776 = local52.aClass5_Sub12_Sub2_2.anInt10154;
				local52.aClass5_Sub12_Sub2_2.method8647(1);
				local52.aClass5_Sub12_Sub2_2.method8655(aClass2_1.anInt9);
				aClass2_1.aClass5_Sub4_Sub21_1.method8748(local52.aClass5_Sub12_Sub2_2, aClass2_1.anIntArray2);
				local52.aClass5_Sub12_Sub2_2.method8652(local52.aClass5_Sub12_Sub2_2.anInt10154 - local776);
				Static612.method8496(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt1382 -= 2;
				local175 = anIntArray106[anInt1382];
				local776 = anIntArray106[anInt1382 + 1];
				anIntArray106[anInt1382++] = Static48.aClass12_1.method193(local175).aCharArray2[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt1382 -= 2;
				local175 = anIntArray106[anInt1382];
				local776 = anIntArray106[anInt1382 + 1];
				anIntArray106[anInt1382++] = Static48.aClass12_1.method193(local175).aCharArray1[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt1382 -= 2;
				local175 = anIntArray106[anInt1382];
				local776 = anIntArray106[anInt1382 + 1];
				if (local776 == -1) {
					anIntArray106[anInt1382++] = -1;
					return;
				}
				anIntArray106[anInt1382++] = Static48.aClass12_1.method193(local175).method2149((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt1382 -= 2;
				local175 = anIntArray106[anInt1382];
				local776 = anIntArray106[anInt1382 + 1];
				if (local776 == -1) {
					anIntArray106[anInt1382++] = -1;
					return;
				}
				anIntArray106[anInt1382++] = Static48.aClass12_1.method193(local175).method2152((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray106[--anInt1382];
				anIntArray106[anInt1382++] = Static473.aClass171_1.method4004(local175).method8752();
				return;
			}
			if (arg0 == 5067) {
				anInt1382 -= 2;
				local175 = anIntArray106[anInt1382];
				local776 = anIntArray106[anInt1382 + 1];
				local97 = Static473.aClass171_1.method4004(local175).method8751(local776).anInt4700;
				anIntArray106[anInt1382++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt1382 -= 2;
				local175 = anIntArray106[anInt1382];
				local776 = anIntArray106[anInt1382 + 1];
				aClass2_1.anIntArray2[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt1382 -= 2;
				local175 = anIntArray106[anInt1382];
				local776 = anIntArray106[anInt1382 + 1];
				aClass2_1.anIntArray2[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt1382 -= 3;
				local175 = anIntArray106[anInt1382];
				local776 = anIntArray106[anInt1382 + 1];
				local97 = anIntArray106[anInt1382 + 2];
				@Pc(1448) Class5_Sub4_Sub21 local1448 = Static473.aClass171_1.method4004(local175);
				if (local1448.method8751(local776).anInt4700 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray106[anInt1382++] = local1448.method8749(local776, local97);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray6[--anInt1378];
				local1496 = anIntArray106[--anInt1382] == 1;
				Static70.method7878(local83, local1496);
				anIntArray106[anInt1382++] = Static282.anInt4637;
				return;
			}
			if (arg0 == 5072) {
				if (Static39.aShortArray15 != null && Static273.anInt4520 < Static282.anInt4637) {
					anIntArray106[anInt1382++] = Static39.aShortArray15[Static273.anInt4520++] & 0xFFFF;
					return;
				}
				anIntArray106[anInt1382++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static273.anInt4520 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static600.aClass38_1.method799(86)) {
					anIntArray106[anInt1382++] = 1;
					return;
				}
				anIntArray106[anInt1382++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static600.aClass38_1.method799(82)) {
					anIntArray106[anInt1382++] = 1;
					return;
				}
				anIntArray106[anInt1382++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static600.aClass38_1.method799(81)) {
					anIntArray106[anInt1382++] = 1;
					return;
				}
				anIntArray106[anInt1382++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static457.method6798(anIntArray106[--anInt1382]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray106[anInt1382++] = Static133.method3508();
					return;
				}
				if (arg0 == 5205) {
					Static121.method1819(-1, false, anIntArray106[--anInt1382], -1);
					return;
				}
				@Pc(1696) Class5_Sub4_Sub1 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray106[--anInt1382];
					local1696 = Static203.method145(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray106[anInt1382++] = -1;
						return;
					}
					anIntArray106[anInt1382++] = local1696.anInt521;
					return;
				}
				@Pc(1729) Class5_Sub4_Sub1 local1729;
				if (arg0 == 5207) {
					local1729 = Static203.method158(anIntArray106[--anInt1382]);
					if (local1729 != null && local1729.aString10 != null) {
						aStringArray6[anInt1378++] = local1729.aString10;
						return;
					}
					aStringArray6[anInt1378++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray106[anInt1382++] = Static69.anInt1101;
					anIntArray106[anInt1382++] = Static382.anInt10004;
					return;
				}
				if (arg0 == 5209) {
					anIntArray106[anInt1382++] = Static504.anInt8544 + Static203.anInt136;
					anIntArray106[anInt1382++] = Static449.anInt7564 + Static203.anInt137;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray106[--anInt1382];
					local1696 = Static203.method158(local175);
					if (local1696 == null) {
						anIntArray106[anInt1382++] = 0;
						anIntArray106[anInt1382++] = 0;
						return;
					}
					anIntArray106[anInt1382++] = local1696.anInt518 >> 14 & 0x3FFF;
					anIntArray106[anInt1382++] = local1696.anInt518 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray106[--anInt1382];
					local1696 = Static203.method158(local175);
					if (local1696 == null) {
						anIntArray106[anInt1382++] = 0;
						anIntArray106[anInt1382++] = 0;
						return;
					}
					anIntArray106[anInt1382++] = local1696.anInt516 - local1696.anInt523;
					anIntArray106[anInt1382++] = local1696.anInt526 - local1696.anInt515;
					return;
				}
				@Pc(1919) Class5_Sub39 local1919;
				if (arg0 == 5212) {
					local1919 = Static341.method5230();
					if (local1919 == null) {
						anIntArray106[anInt1382++] = -1;
						anIntArray106[anInt1382++] = -1;
						return;
					}
					anIntArray106[anInt1382++] = local1919.anInt7217;
					local776 = local1919.anInt7218 << 28 | local1919.anInt7224 + Static203.anInt136 << 14 | local1919.anInt7220 + Static203.anInt137;
					anIntArray106[anInt1382++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static598.method8367();
					if (local1919 == null) {
						anIntArray106[anInt1382++] = -1;
						anIntArray106[anInt1382++] = -1;
						return;
					}
					anIntArray106[anInt1382++] = local1919.anInt7217;
					local776 = local1919.anInt7218 << 28 | local1919.anInt7224 + Static203.anInt136 << 14 | local1919.anInt7220 + Static203.anInt137;
					anIntArray106[anInt1382++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray106[--anInt1382];
					local1696 = Static268.method4077();
					if (local1696 != null) {
						local2067 = local1696.method543(anIntArray107, local175 >> 14 & 0x3FFF, local175 & 0x3FFF, local175 >> 28 & 0x3);
						if (local2067) {
							Static106.method1541(anIntArray107[2], anIntArray107[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt1382 -= 2;
					local175 = anIntArray106[anInt1382];
					local776 = anIntArray106[anInt1382 + 1];
					@Pc(2105) Class80 local2105 = Static203.method150(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class5_Sub4_Sub1 local2112 = (Class5_Sub4_Sub1) local2105.method1538(); local2112 != null; local2112 = (Class5_Sub4_Sub1) local2105.method1536()) {
						if (local2112.anInt521 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray106[anInt1382++] = 1;
						return;
					}
					anIntArray106[anInt1382++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray106[--anInt1382];
					local1696 = Static203.method158(local175);
					if (local1696 == null) {
						anIntArray106[anInt1382++] = -1;
						return;
					}
					anIntArray106[anInt1382++] = local1696.anInt525;
					return;
				}
				if (arg0 == 5220) {
					anIntArray106[anInt1382++] = Static88.anInt1458 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray106[--anInt1382];
					Static106.method1541(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static268.method4077();
					if (local1729 != null) {
						local1496 = local1729.method545(Static504.anInt8544 + Static203.anInt136, Static449.anInt7564 + Static203.anInt137, anIntArray107);
						if (local1496) {
							anIntArray106[anInt1382++] = anIntArray107[1];
							anIntArray106[anInt1382++] = anIntArray107[2];
							return;
						}
						anIntArray106[anInt1382++] = -1;
						anIntArray106[anInt1382++] = -1;
						return;
					}
					anIntArray106[anInt1382++] = -1;
					anIntArray106[anInt1382++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt1382 -= 2;
					local175 = anIntArray106[anInt1382];
					local776 = anIntArray106[anInt1382 + 1];
					Static121.method1819(local776 & 0x3FFF, false, local175, local776 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray106[--anInt1382];
					local1696 = Static268.method4077();
					if (local1696 != null) {
						local2067 = local1696.method543(anIntArray107, local175 >> 14 & 0x3FFF, local175 & 0x3FFF, local175 >> 28 & 0x3);
						if (local2067) {
							anIntArray106[anInt1382++] = anIntArray107[1];
							anIntArray106[anInt1382++] = anIntArray107[2];
							return;
						}
						anIntArray106[anInt1382++] = -1;
						anIntArray106[anInt1382++] = -1;
						return;
					}
					anIntArray106[anInt1382++] = -1;
					anIntArray106[anInt1382++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray106[--anInt1382];
					local1696 = Static268.method4077();
					if (local1696 != null) {
						local2067 = local1696.method545(local175 >> 14 & 0x3FFF, local175 & 0x3FFF, anIntArray107);
						if (local2067) {
							anIntArray106[anInt1382++] = anIntArray107[1];
							anIntArray106[anInt1382++] = anIntArray107[2];
							return;
						}
						anIntArray106[anInt1382++] = -1;
						anIntArray106[anInt1382++] = -1;
						return;
					}
					anIntArray106[anInt1382++] = -1;
					anIntArray106[anInt1382++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static350.method5351(anIntArray106[--anInt1382]);
					return;
				}
				if (arg0 == 5227) {
					anInt1382 -= 2;
					local175 = anIntArray106[anInt1382];
					local776 = anIntArray106[anInt1382 + 1];
					Static121.method1819(local776 & 0x3FFF, true, local175, local776 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static243.aBoolean335 = anIntArray106[--anInt1382] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray106[anInt1382++] = Static243.aBoolean335 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray106[--anInt1382];
					Static461.method6862(local175);
					return;
				}
				@Pc(2625) Class5 local2625;
				if (arg0 == 5231) {
					anInt1382 -= 2;
					local175 = anIntArray106[anInt1382];
					local1496 = anIntArray106[anInt1382 + 1] == 1;
					if (Static151.aClass81_24 != null) {
						local2625 = Static151.aClass81_24.method1599((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8911();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class5();
							Static151.aClass81_24.method1607(local2625, (long) local175);
						}
					}
					return;
				}
				@Pc(2667) Class5 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray106[--anInt1382];
					if (Static151.aClass81_24 != null) {
						local2667 = Static151.aClass81_24.method1599((long) local175);
						anIntArray106[anInt1382++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray106[anInt1382++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt1382 -= 2;
					local175 = anIntArray106[anInt1382];
					local1496 = anIntArray106[anInt1382 + 1] == 1;
					if (Static271.aClass81_41 != null) {
						local2625 = Static271.aClass81_41.method1599((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8911();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class5();
							Static271.aClass81_41.method1607(local2625, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray106[--anInt1382];
					if (Static271.aClass81_41 != null) {
						local2667 = Static271.aClass81_41.method1599((long) local175);
						anIntArray106[anInt1382++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray106[anInt1382++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray106[anInt1382++] = Static203.aClass5_Sub4_Sub1_2 == null ? -1 : Static203.aClass5_Sub4_Sub1_2.anInt521;
					return;
				}
				if (arg0 == 5236) {
					anInt1382 -= 2;
					local175 = anIntArray106[anInt1382];
					local776 = anIntArray106[anInt1382 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static490.method7197(local103, local175, local97);
					if (local2833 < 0) {
						anIntArray106[anInt1382++] = -1;
						return;
					}
					anIntArray106[anInt1382++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static185.method2976();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt1382 -= 2;
					local175 = anIntArray106[anInt1382];
					local776 = anIntArray106[anInt1382 + 1];
					Static236.method3632(false, 3, local776, local175);
					anIntArray106[anInt1382++] = Static630.aFrame3 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static630.aFrame3 != null) {
						Static236.method3632(false, Static627.aClass5_Sub46_31.aClass11_Sub1_1.method191(), -1, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2919) Class380[] local2919 = Static280.method4196();
					anIntArray106[anInt1382++] = local2919.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray106[--anInt1382];
					@Pc(2943) Class380[] local2943 = Static280.method4196();
					anIntArray106[anInt1382++] = local2943[local175].anInt10349;
					anIntArray106[anInt1382++] = local2943[local175].anInt10348;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static650.anInt10508;
					local776 = Static53.anInt810;
					local97 = -1;
					@Pc(2978) Class380[] local2978 = Static280.method4196();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class380 local2985 = local2978[local2833];
						if (local2985.anInt10349 == local175 && local2985.anInt10348 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray106[anInt1382++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray106[anInt1382++] = Static259.method1979();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray106[--anInt1382];
					if (local175 >= 1 && local175 <= 2) {
						Static236.method3632(false, local175, -1, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub1_1.method191();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray106[--anInt1382];
					if (local175 >= 1 && local175 <= 2) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub1_1, local175);
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub1_2, local175);
						Static499.method7307();
						return;
					}
					return;
				}
			} else {
				@Pc(3271) int local3271;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt1378 -= 2;
						local83 = aStringArray6[anInt1378];
						local89 = aStringArray6[anInt1378 + 1];
						local97 = anIntArray106[--anInt1382];
						@Pc(3133) Class5_Sub40 local3133 = Static25.method507(Static98.aClass208_2, Static641.aClass181_97);
						local3133.aClass5_Sub12_Sub2_2.method8647(Static352.method5589(local83) + Static352.method5589(local89) + 1);
						local3133.aClass5_Sub12_Sub2_2.method8619(local83);
						local3133.aClass5_Sub12_Sub2_2.method8619(local89);
						local3133.aClass5_Sub12_Sub2_2.method8647(local97);
						Static612.method8496(local3133);
						return;
					}
					if (arg0 == 5401) {
						anInt1382 -= 2;
						Static283.aShortArray60[anIntArray106[anInt1382]] = (short) Static616.method8515(anIntArray106[anInt1382 + 1]);
						Static479.aClass348_1.method8198();
						Static479.aClass348_1.method8207();
						Static258.aClass138_1.method3201();
						Static101.method1476();
						return;
					}
					if (arg0 == 5405) {
						anInt1382 -= 2;
						local175 = anIntArray106[anInt1382];
						local776 = anIntArray106[anInt1382 + 1];
						if (local175 >= 0 && local175 < 2) {
							Static100.anIntArrayArrayArray3[local175] = new int[local776 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt1382 -= 7;
						local175 = anIntArray106[anInt1382];
						local776 = anIntArray106[anInt1382 + 1] << 1;
						local97 = anIntArray106[anInt1382 + 2];
						local103 = anIntArray106[anInt1382 + 3];
						local2833 = anIntArray106[anInt1382 + 4];
						local3271 = anIntArray106[anInt1382 + 5];
						@Pc(3277) int local3277 = anIntArray106[anInt1382 + 6];
						if (local175 >= 0 && local175 < 2 && Static100.anIntArrayArrayArray3[local175] != null && local776 >= 0 && local776 < Static100.anIntArrayArrayArray3[local175].length) {
							Static100.anIntArrayArrayArray3[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3277 };
							Static100.anIntArrayArrayArray3[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3271 << 2, (local2833 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local175 = Static100.anIntArrayArrayArray3[anIntArray106[--anInt1382]].length >> 1;
						anIntArray106[anInt1382++] = local175;
						return;
					}
					if (arg0 == 5411) {
						if (Static630.aFrame3 != null) {
							Static236.method3632(false, Static627.aClass5_Sub46_31.aClass11_Sub1_1.method191(), -1, -1);
						}
						if (Static510.aFrame2 != null) {
							Static159.method2410();
							System.exit(0);
							return;
						}
						local83 = Static599.aString137 == null ? Static85.method1343() : Static599.aString137;
						Static170.method2645(local83, Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() == 1, Static214.aClass192_1, false);
						return;
					}
					if (arg0 == 5419) {
						local83 = "";
						if (Static271.aClass330_3 != null) {
							if (Static271.aClass330_3.anObject19 == null) {
								local83 = Static362.method5662(Static271.aClass330_3.anInt9129);
							} else {
								local83 = (String) Static271.aClass330_3.anObject19;
							}
						}
						aStringArray6[anInt1378++] = local83;
						return;
					}
					if (arg0 == 5420) {
						anIntArray106[anInt1382++] = Static214.aClass192_1.aBoolean389 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static630.aFrame3 != null) {
							Static236.method3632(false, Static627.aClass5_Sub46_31.aClass11_Sub1_1.method191(), -1, -1);
						}
						local83 = aStringArray6[--anInt1378];
						local1496 = anIntArray106[--anInt1382] == 1;
						local181 = Static85.method1343() + local83;
						Static170.method2645(local181, Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() == 1, Static214.aClass192_1, local1496);
						return;
					}
					if (arg0 == 5422) {
						anInt1378 -= 2;
						local83 = aStringArray6[anInt1378];
						local89 = aStringArray6[anInt1378 + 1];
						local97 = anIntArray106[--anInt1382];
						if (local83.length() > 0) {
							if (Static172.aStringArray12 == null) {
								Static172.aStringArray12 = new String[Static311.anIntArray395[Static24.aClass235_1.anInt6378]];
							}
							Static172.aStringArray12[local97] = local83;
						}
						if (local89.length() > 0) {
							if (Static382.aStringArray45 == null) {
								Static382.aStringArray45 = new String[Static311.anIntArray395[Static24.aClass235_1.anInt6378]];
							}
							Static382.aStringArray45[local97] = local89;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray6[--anInt1378]);
						return;
					}
					if (arg0 == 5424) {
						anInt1382 -= 11;
						Static415.anInt7119 = anIntArray106[anInt1382];
						Static605.anInt9912 = anIntArray106[anInt1382 + 1];
						Static463.anInt7856 = anIntArray106[anInt1382 + 2];
						Static235.anInt3999 = anIntArray106[anInt1382 + 3];
						Static133.anInt3879 = anIntArray106[anInt1382 + 4];
						Static368.anInt6509 = anIntArray106[anInt1382 + 5];
						Static613.anInt10013 = anIntArray106[anInt1382 + 6];
						Static625.anInt10205 = anIntArray106[anInt1382 + 7];
						Static453.anInt7633 = anIntArray106[anInt1382 + 8];
						Static455.anInt7665 = anIntArray106[anInt1382 + 9];
						Static455.anInt7661 = anIntArray106[anInt1382 + 10];
						Static488.aClass384_112.method8883(Static133.anInt3879);
						Static488.aClass384_112.method8883(Static368.anInt6509);
						Static488.aClass384_112.method8883(Static613.anInt10013);
						Static488.aClass384_112.method8883(Static625.anInt10205);
						Static488.aClass384_112.method8883(Static453.anInt7633);
						Static192.aClass44_29 = null;
						Static146.aClass44_9 = null;
						Static646.aClass44_38 = null;
						Static181.aClass44_14 = null;
						Static327.aClass44_18 = null;
						Static42.aClass44_2 = null;
						Static87.aClass44_5 = null;
						Static540.aClass44_30 = null;
						Static405.aBoolean578 = true;
						return;
					}
					if (arg0 == 5425) {
						Static16.method435();
						Static405.aBoolean578 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt1382 -= 2;
						Static631.anInt10289 = anIntArray106[anInt1382];
						Static308.anInt4884 = anIntArray106[anInt1382 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt1382 -= 2;
						Static268.anInt4461 = anIntArray106[anInt1382 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt1382 -= 2;
						local175 = anIntArray106[anInt1382];
						local776 = anIntArray106[anInt1382 + 1];
						anIntArray106[anInt1382++] = Static379.method7523(local175, local776) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static444.method6596(false, false, aStringArray6[--anInt1378]);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static652.method1918("accountcreated", Static270.anApplet5);
							return;
						} catch (@Pc(3819) Throwable local3819) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static652.method1918("accountcreatestarted", Static270.anApplet5);
							return;
						} catch (@Pc(3830) Throwable local3830) {
							return;
						}
					}
					if (arg0 == 5432) {
						local83 = "";
						if (Static177.aClipboard1 != null) {
							@Pc(3842) Transferable local3842 = Static177.aClipboard1.getContents((Object) null);
							if (local3842 != null) {
								try {
									local83 = (String) local3842.getTransferData(DataFlavor.stringFlavor);
									if (local83 == null) {
										local83 = "";
									}
								} catch (@Pc(3855) Exception local3855) {
								}
							}
						}
						aStringArray6[anInt1378++] = local83;
						return;
					}
					if (arg0 == 5433) {
						Static347.anInt9481 = anIntArray106[--anInt1382];
						return;
					}
					if (arg0 == 5435) {
						anIntArray106[anInt1382++] = Static297.aBoolean391 ? 1 : 0;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt1382 -= 4;
						local175 = anIntArray106[anInt1382];
						local776 = anIntArray106[anInt1382 + 1];
						local97 = anIntArray106[anInt1382 + 2];
						local103 = anIntArray106[anInt1382 + 3];
						Static78.method1246(false, local97, (local175 & 0x3FFF) - Static622.anInt10087, local103, local776 << 2, (local175 >> 14 & 0x3FFF) - Static113.anInt1785);
						return;
					}
					if (arg0 == 5501) {
						anInt1382 -= 4;
						local175 = anIntArray106[anInt1382];
						local776 = anIntArray106[anInt1382 + 1];
						local97 = anIntArray106[anInt1382 + 2];
						local103 = anIntArray106[anInt1382 + 3];
						Static213.method3230(local97, local776 << 2, local103, (local175 & 0x3FFF) - Static622.anInt10087, (local175 >> 14 & 0x3FFF) - Static113.anInt1785);
						return;
					}
					if (arg0 == 5502) {
						anInt1382 -= 6;
						local175 = anIntArray106[anInt1382];
						if (local175 >= 2) {
							throw new RuntimeException();
						}
						Static467.anInt7868 = local175;
						local776 = anIntArray106[anInt1382 + 1];
						if (local776 + 1 >= Static100.anIntArrayArrayArray3[Static467.anInt7868].length >> 1) {
							throw new RuntimeException();
						}
						Static282.anInt4631 = local776;
						Static614.anInt10020 = 0;
						Static200.anInt3571 = anIntArray106[anInt1382 + 2];
						Static517.anInt8636 = anIntArray106[anInt1382 + 3];
						local97 = anIntArray106[anInt1382 + 4];
						if (local97 >= 2) {
							throw new RuntimeException();
						}
						Static229.anInt3965 = local97;
						local103 = anIntArray106[anInt1382 + 5];
						if (local103 + 1 >= Static100.anIntArrayArrayArray3[Static229.anInt3965].length >> 1) {
							throw new RuntimeException();
						}
						Static71.anInt1126 = local103;
						Static584.anInt9543 = 3;
						Static609.anInt9978 = -1;
						Static394.anInt6873 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static305.method4419();
						return;
					}
					if (arg0 == 5504) {
						anInt1382 -= 2;
						Static540.method7698(anIntArray106[anInt1382 + 1], anIntArray106[anInt1382]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray106[anInt1382++] = (int) Static371.aFloat65 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray106[anInt1382++] = (int) Static112.aFloat22 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static239.method3657();
						return;
					}
					if (arg0 == 5508) {
						Static390.method5992();
						return;
					}
					if (arg0 == 5509) {
						Static479.method6952();
						return;
					}
					if (arg0 == 5510) {
						Static614.method8510();
						return;
					}
					if (arg0 == 5511) {
						local175 = anIntArray106[--anInt1382];
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static113.anInt1785;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static111.anInt1752) {
							local776 = Static111.anInt1752;
						}
						local97 -= Static622.anInt10087;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static279.anInt4567) {
							local97 = Static279.anInt4567;
						}
						Static102.anInt1587 = (local776 << 9) + 256;
						Static377.anInt6619 = (local97 << 9) + 256;
						Static584.anInt9543 = 4;
						Static609.anInt9978 = -1;
						Static394.anInt6873 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static342.method5254();
						return;
					}
					if (arg0 == 5514) {
						Static461.anInt7805 = anIntArray106[--anInt1382];
						return;
					}
					if (arg0 == 5516) {
						anIntArray106[anInt1382++] = Static461.anInt7805;
						return;
					}
					if (arg0 == 5517) {
						local175 = anIntArray106[--anInt1382];
						if (local175 == -1) {
							local776 = local175 >> 14 & 0x3FFF;
							local97 = local175 & 0x3FFF;
							local776 -= Static113.anInt1785;
							if (local776 < 0) {
								local776 = 0;
							} else if (local776 >= Static111.anInt1752) {
								local776 = Static111.anInt1752;
							}
							local97 -= Static622.anInt10087;
							if (local97 < 0) {
								local97 = 0;
							} else if (local97 >= Static279.anInt4567) {
								local97 = Static279.anInt4567;
							}
							Static394.anInt6873 = (local776 << 9) + 256;
							Static609.anInt9978 = (local97 << 9) + 256;
							return;
						}
						Static394.anInt6873 = -1;
						Static609.anInt9978 = -1;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt1378 -= 2;
						local83 = aStringArray6[anInt1378];
						local89 = aStringArray6[anInt1378 + 1];
						local97 = anIntArray106[--anInt1382];
						if (local83.length() > 320) {
							return;
						}
						if (Static469.anInt7883 != 3) {
							return;
						}
						if (Static548.anInt9084 == 0 && Static301.anInt4797 == 0) {
							Static358.aString114 = local83;
							Static94.aString145 = local89;
							Static536.anInt8899 = local97;
							Static214.method3254(6);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static214.method3256();
						return;
					}
					if (arg0 == 5602) {
						if (Static548.anInt9084 == 0) {
							Static432.anInt7299 = -2;
							Static430.anInt7288 = -2;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt1378--;
						if (Static469.anInt7883 != 3) {
							return;
						}
						if (Static548.anInt9084 == 0 && Static301.anInt4797 == 0) {
							Static210.method3219(aStringArray6[anInt1378]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt1378 -= 2;
						anInt1382 -= 2;
						if (Static469.anInt7883 != 3) {
							return;
						}
						if (Static548.anInt9084 == 0 && Static301.anInt4797 == 0) {
							Static279.method4182(aStringArray6[anInt1378 + 1], aStringArray6[anInt1378], anIntArray106[anInt1382 + 1] == 1, anIntArray106[anInt1382]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static301.anInt4797 == 0) {
							Static45.anInt744 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray106[anInt1382++] = Static430.anInt7288;
						return;
					}
					if (arg0 == 5608) {
						anIntArray106[anInt1382++] = Static596.anInt9738;
						return;
					}
					if (arg0 == 5609) {
						anIntArray106[anInt1382++] = Static45.anInt744;
						return;
					}
					if (arg0 == 5611) {
						anIntArray106[anInt1382++] = Static133.anInt3877;
						return;
					}
					if (arg0 == 5612) {
						local175 = anIntArray106[--anInt1382];
						if (Static469.anInt7883 != 7) {
							return;
						}
						if (Static548.anInt9084 == 0 && Static301.anInt4797 == 0) {
							if (Static487.aClass30_2 != null) {
								Static487.aClass30_2.method671();
								Static487.aClass30_2 = null;
							}
							Static536.anInt8899 = local175;
							Static214.method3254(9);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray106[anInt1382++] = Static430.anInt7288;
						return;
					}
					if (arg0 == 5615) {
						anInt1378 -= 2;
						local83 = aStringArray6[anInt1378];
						local89 = aStringArray6[anInt1378 + 1];
						if (local83.length() > 320) {
							return;
						}
						if (Static469.anInt7883 != 3) {
							return;
						}
						if (Static548.anInt9084 == 0 && Static301.anInt4797 == 0) {
							if (Static487.aClass30_2 != null) {
								Static487.aClass30_2.method671();
								Static487.aClass30_2 = null;
							}
							Static358.aString114 = local83;
							Static94.aString145 = local89;
							Static214.method3254(5);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static268.method4076(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray106[anInt1382++] = Static432.anInt7299;
						return;
					}
					if (arg0 == 5618) {
						anInt1382--;
						return;
					}
					if (arg0 == 5619) {
						anInt1382--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray106[anInt1382++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt1378 -= 2;
						anInt1382 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static120.aString144 != null) {
							anIntArray106[anInt1382++] = 1;
							return;
						}
						anIntArray106[anInt1382++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray106[anInt1382++] = (int) (Static55.aLong30 >> 32);
						anIntArray106[anInt1382++] = (int) (Static55.aLong30 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray106[anInt1382++] = Static80.aBoolean105 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static80.aBoolean105 = true;
						Static102.method1480();
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local175 = anIntArray106[--anInt1382];
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub2_1, local175);
						Static532.method7607();
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					@Pc(4802) boolean local4802;
					if (arg0 == 6002) {
						local4802 = anIntArray106[--anInt1382] == 1;
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub10_2, local4802 ? 1 : 0);
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub10_1, local4802 ? 1 : 0);
						Static532.method7607();
						Static283.method4242();
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6003) {
						local4802 = anIntArray106[--anInt1382] == 1;
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub8_1, local4802 ? 2 : 1);
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub8_2, local4802 ? 2 : 1);
						Static283.method4242();
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6005) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub16_1, anIntArray106[--anInt1382] == 1 ? 1 : 0);
						Static532.method7607();
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6007) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub5_1, anIntArray106[--anInt1382]);
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6008) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub13_1, anIntArray106[--anInt1382] == 1 ? 1 : 0);
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6010) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub26_1, anIntArray106[--anInt1382] == 1 ? 1 : 0);
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6011) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub14_1, anIntArray106[--anInt1382]);
						Static532.method7607();
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6012) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub11_1, anIntArray106[--anInt1382] == 1 ? 1 : 0);
						Static246.method3759();
						Static571.method8044();
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6014) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub23_1, anIntArray106[--anInt1382] == 1 ? 2 : 0);
						Static532.method7607();
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6015) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub28_1, anIntArray106[--anInt1382] == 1 ? 1 : 0);
						Static532.method7607();
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6016) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub6_2, anIntArray106[--anInt1382]);
						Static590.method8288(false, Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289());
						Static499.method7307();
						return;
					}
					if (arg0 == 6017) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub22_1, anIntArray106[--anInt1382] == 1 ? 1 : 0);
						Static99.method1463();
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6018) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub17_2, anIntArray106[--anInt1382]);
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6019) {
						local175 = anIntArray106[--anInt1382];
						local776 = Static627.aClass5_Sub46_31.aClass11_Sub17_4.method5908();
						if (local175 != local776) {
							if (Static80.method1260(Static469.anInt7883)) {
								if (local776 == 0 && Static68.anInt1096 != -1) {
									Static228.method3581(Static68.anInt1096, local175, Static7.aClass384_3);
									Static51.method805();
									Static309.aBoolean451 = false;
								} else if (local175 == 0) {
									Static273.method4147();
									Static309.aBoolean451 = false;
								} else {
									Static404.method6197(local175);
								}
							}
							Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub17_4, local175);
							Static499.method7307();
							Static71.aBoolean80 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub17_1, anIntArray106[--anInt1382]);
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6021) {
						local175 = Static627.aClass5_Sub46_31.aClass11_Sub8_1.method2214();
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub8_2, anIntArray106[--anInt1382] == 1 ? 0 : local175);
						Static283.method4242();
						return;
					}
					if (arg0 == 6023) {
						local175 = anIntArray106[--anInt1382];
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub4_1, local175);
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6024) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub6_1, anIntArray106[--anInt1382]);
						Static499.method7307();
						return;
					}
					if (arg0 == 6025) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub20_1, anIntArray106[--anInt1382]);
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6027) {
						local175 = anIntArray106[--anInt1382];
						if (local175 < 0 || local175 > 1) {
							local175 = 0;
						}
						Static533.method384(local175 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub9_1, anIntArray106[--anInt1382] == 0 ? 0 : 1);
						Static499.method7307();
						return;
					}
					if (arg0 == 6029) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub5_1, anIntArray106[--anInt1382]);
						Static499.method7307();
						return;
					}
					if (arg0 == 6030) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub25_1, anIntArray106[--anInt1382] == 0 ? 0 : 1);
						Static499.method7307();
						Static532.method7607();
						return;
					}
					if (arg0 == 6031) {
						local175 = anIntArray106[--anInt1382];
						if (local175 < 0 || local175 > 5) {
							local175 = 2;
						}
						Static590.method8288(false, local175);
						return;
					}
					if (arg0 == 6032) {
						anInt1382 -= 2;
						local175 = anIntArray106[anInt1382];
						local1496 = anIntArray106[anInt1382 + 1] == 1;
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub15_1, local175);
						if (!local1496) {
							Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub24_1, 0);
						}
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6033) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub18_1, anIntArray106[--anInt1382]);
						Static499.method7307();
						return;
					}
					if (arg0 == 6034) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub29_1, anIntArray106[--anInt1382] == 1 ? 1 : 0);
						Static499.method7307();
						Static246.method3759();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6035) {
						local175 = Static627.aClass5_Sub46_31.aClass11_Sub10_2.method2643();
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub10_1, anIntArray106[--anInt1382] == 1 ? 1 : local175);
						Static532.method7607();
						Static283.method4242();
						return;
					}
					if (arg0 == 6036) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub19_1, anIntArray106[--anInt1382]);
						Static499.method7307();
						Static9.aBoolean5 = true;
						return;
					}
					if (arg0 == 6037) {
						Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub17_3, anIntArray106[--anInt1382]);
						Static499.method7307();
						Static71.aBoolean80 = false;
						return;
					}
					if (arg0 == 6038) {
						local175 = anIntArray106[--anInt1382];
						local776 = Static627.aClass5_Sub46_31.aClass11_Sub17_5.method5908();
						if (local175 != local776 && Static68.anInt1096 == Static478.anInt10052) {
							if (!Static80.method1260(Static469.anInt7883)) {
								if (local776 == 0) {
									Static228.method3581(Static68.anInt1096, local175, Static7.aClass384_3);
									Static51.method805();
									Static309.aBoolean451 = false;
								} else if (local175 == 0) {
									Static273.method4147();
									Static309.aBoolean451 = false;
								} else {
									Static404.method6197(local175);
								}
							}
							Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub17_5, local175);
							Static499.method7307();
							Static71.aBoolean80 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local175 = anIntArray106[--anInt1382];
						if (local175 > 255 || local175 < 0) {
							local175 = 0;
						}
						if (local175 != Static627.aClass5_Sub46_31.aClass11_Sub7_1.method1650()) {
							Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub7_1, local175);
							Static499.method7307();
							Static71.aBoolean80 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local175 = anIntArray106[--anInt1382];
						if (local175 != Static627.aClass5_Sub46_31.aClass11_Sub21_1.method6586()) {
							Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub21_1, local175);
							Static499.method7307();
							Static71.aBoolean80 = false;
							Static494.method7283();
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub2_1.method447();
						return;
					}
					if (arg0 == 6102) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub10_2.method2643() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub8_1.method2214() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub16_1.method4417() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub5_1.method781();
						return;
					}
					if (arg0 == 6108) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub13_1.method3955() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub26_1.method7773() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub14_1.method4195();
						return;
					}
					if (arg0 == 6112) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub11_1.method2927() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub23_1.method7462() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub28_1.method8173() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub6_2.method1369();
						return;
					}
					if (arg0 == 6117) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub22_1.method7429() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub17_2.method5908();
						return;
					}
					if (arg0 == 6119) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub17_4.method5908();
						return;
					}
					if (arg0 == 6120) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub17_1.method5908();
						return;
					}
					if (arg0 == 6123) {
						anIntArray106[anInt1382++] = Static489.method7177();
						return;
					}
					if (arg0 == 6124) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub6_1.method1369();
						return;
					}
					if (arg0 == 6125) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub20_1.method6520();
						return;
					}
					if (arg0 == 6127) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub27_1.method7849() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub9_1.method2421() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub5_1.method781();
						return;
					}
					if (arg0 == 6130) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub25_1.method7702() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289();
						return;
					}
					if (arg0 == 6132) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub15_1.method4289();
						return;
					}
					if (arg0 == 6133) {
						anIntArray106[anInt1382++] = Static214.aClass192_1.aBoolean389 && !Static214.aClass192_1.aBoolean390 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub18_1.method6179();
						return;
					}
					if (arg0 == 6136) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub29_1.method8541() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray106[anInt1382++] = Static569.method6634(Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289(), 200);
						return;
					}
					if (arg0 == 6139) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub19_1.method6459();
						return;
					}
					if (arg0 == 6142) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub17_3.method5908();
						return;
					}
					if (arg0 == 6143) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub17_5.method5908();
						return;
					}
					if (arg0 == 6144) {
						anIntArray106[anInt1382++] = Static475.aBoolean712 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub7_1.method1650();
						return;
					}
					if (arg0 == 6146) {
						anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub21_1.method6586();
						return;
					}
					if (arg0 == 6147) {
						anIntArray106[anInt1382++] = Static343.aClass5_Sub28_1.anInt5496 < 512 || Static475.aBoolean712 || Static590.aBoolean775 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray106[anInt1382++] = Static357.aBoolean531 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt1382 -= 2;
						Static533.aShort15 = (short) anIntArray106[anInt1382];
						if (Static533.aShort15 <= 0) {
							Static533.aShort15 = 256;
						}
						Static612.aShort127 = (short) anIntArray106[anInt1382 + 1];
						if (Static612.aShort127 <= 0) {
							Static612.aShort127 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt1382 -= 2;
						Static503.aShort55 = (short) anIntArray106[anInt1382];
						if (Static503.aShort55 <= 0) {
							Static503.aShort55 = 256;
						}
						Static88.aShort20 = (short) anIntArray106[anInt1382 + 1];
						if (Static88.aShort20 <= 0) {
							Static88.aShort20 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt1382 -= 4;
						Static599.aShort123 = (short) anIntArray106[anInt1382];
						if (Static599.aShort123 <= 0) {
							Static599.aShort123 = 1;
						}
						Static232.aShort59 = (short) anIntArray106[anInt1382 + 1];
						if (Static232.aShort59 <= 0) {
							Static232.aShort59 = 32767;
						} else if (Static232.aShort59 < Static599.aShort123) {
							Static232.aShort59 = Static599.aShort123;
						}
						Static109.aShort23 = (short) anIntArray106[anInt1382 + 2];
						if (Static109.aShort23 <= 0) {
							Static109.aShort23 = 1;
						}
						Static551.aShort104 = (short) anIntArray106[anInt1382 + 3];
						if (Static551.aShort104 <= 0) {
							Static551.aShort104 = 32767;
							return;
						}
						if (Static551.aShort104 < Static109.aShort23) {
							Static551.aShort104 = Static109.aShort23;
						}
						return;
					}
					if (arg0 == 6203) {
						Static177.method2688(Static583.aClass357_12.anInt9852, 0, Static583.aClass357_12.anInt9797, 0, false);
						anIntArray106[anInt1382++] = Static544.anInt9011;
						anIntArray106[anInt1382++] = Static266.anInt4408;
						return;
					}
					if (arg0 == 6204) {
						anIntArray106[anInt1382++] = Static503.aShort55;
						anIntArray106[anInt1382++] = Static88.aShort20;
						return;
					}
					if (arg0 == 6205) {
						anIntArray106[anInt1382++] = Static533.aShort15;
						anIntArray106[anInt1382++] = Static612.aShort127;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray106[anInt1382++] = (int) (Static205.method3179() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray106[anInt1382++] = (int) (Static205.method3179() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt1382 -= 3;
						local175 = anIntArray106[anInt1382];
						local776 = anIntArray106[anInt1382 + 1];
						local97 = anIntArray106[anInt1382 + 2];
						@Pc(6611) long local6611 = Static587.method8248(local97, local776, local175);
						local3271 = Static39.method713(local6611);
						if (local97 < 1970) {
							local3271--;
						}
						anIntArray106[anInt1382++] = local3271;
						return;
					}
					if (arg0 == 6303) {
						anIntArray106[anInt1382++] = Static428.method6443(Static205.method3179());
						return;
					}
					if (arg0 == 6304) {
						local175 = anIntArray106[--anInt1382];
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
						anIntArray106[anInt1382++] = local1496 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray106[anInt1382++] = Static79.method6909() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray106[anInt1382++] = Static225.method3517() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static469.anInt7883 == 7 && Static548.anInt9084 == 0 && Static301.anInt4797 == 0) {
							if (Static103.aBoolean127) {
								anIntArray106[anInt1382++] = 0;
								return;
							}
							if (Static333.aLong170 > Static205.method3179() - 1000L) {
								anIntArray106[anInt1382++] = 1;
								return;
							}
							Static103.aBoolean127 = true;
							local52 = Static25.method507(Static98.aClass208_2, Static633.aClass181_95);
							local52.aClass5_Sub12_Sub2_2.method8622(Static504.anInt8542);
							Static612.method8496(local52);
							anIntArray106[anInt1382++] = 0;
							return;
						}
						anIntArray106[anInt1382++] = 1;
						return;
					}
					@Pc(6863) Class71 local6863;
					@Pc(6830) Class166_Sub1 local6830;
					if (arg0 == 6501) {
						local6830 = Static386.method5962();
						if (local6830 != null) {
							anIntArray106[anInt1382++] = local6830.anInt8518;
							anIntArray106[anInt1382++] = local6830.anInt8510;
							aStringArray6[anInt1378++] = local6830.aString120;
							local6863 = local6830.method7337();
							anIntArray106[anInt1382++] = local6863.anInt1499;
							aStringArray6[anInt1378++] = local6863.aString20;
							anIntArray106[anInt1382++] = local6830.anInt8516;
							anIntArray106[anInt1382++] = local6830.anInt8521;
							aStringArray6[anInt1378++] = local6830.aString121;
							return;
						}
						anIntArray106[anInt1382++] = -1;
						anIntArray106[anInt1382++] = 0;
						aStringArray6[anInt1378++] = "";
						anIntArray106[anInt1382++] = 0;
						aStringArray6[anInt1378++] = "";
						anIntArray106[anInt1382++] = 0;
						anIntArray106[anInt1382++] = 0;
						aStringArray6[anInt1378++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6830 = Static54.method859();
						if (local6830 != null) {
							anIntArray106[anInt1382++] = local6830.anInt8518;
							anIntArray106[anInt1382++] = local6830.anInt8510;
							aStringArray6[anInt1378++] = local6830.aString120;
							local6863 = local6830.method7337();
							anIntArray106[anInt1382++] = local6863.anInt1499;
							aStringArray6[anInt1378++] = local6863.aString20;
							anIntArray106[anInt1382++] = local6830.anInt8516;
							anIntArray106[anInt1382++] = local6830.anInt8521;
							aStringArray6[anInt1378++] = local6830.aString121;
							return;
						}
						anIntArray106[anInt1382++] = -1;
						anIntArray106[anInt1382++] = 0;
						aStringArray6[anInt1378++] = "";
						anIntArray106[anInt1382++] = 0;
						aStringArray6[anInt1378++] = "";
						anIntArray106[anInt1382++] = 0;
						anIntArray106[anInt1382++] = 0;
						aStringArray6[anInt1378++] = "";
						return;
					}
					if (arg0 == 6503) {
						local175 = anIntArray106[--anInt1382];
						local89 = aStringArray6[--anInt1378];
						if (Static469.anInt7883 == 7 && Static548.anInt9084 == 0 && Static301.anInt4797 == 0) {
							anIntArray106[anInt1382++] = Static245.method3744(local89, local175) ? 1 : 0;
							return;
						}
						anIntArray106[anInt1382++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local175 = anIntArray106[--anInt1382];
						@Pc(7190) Class166_Sub1 local7190 = Static558.method7840(local175);
						if (local7190 != null) {
							anIntArray106[anInt1382++] = local7190.anInt8510;
							aStringArray6[anInt1378++] = local7190.aString120;
							@Pc(7214) Class71 local7214 = local7190.method7337();
							anIntArray106[anInt1382++] = local7214.anInt1499;
							aStringArray6[anInt1378++] = local7214.aString20;
							anIntArray106[anInt1382++] = local7190.anInt8516;
							anIntArray106[anInt1382++] = local7190.anInt8521;
							aStringArray6[anInt1378++] = local7190.aString121;
							return;
						}
						anIntArray106[anInt1382++] = -1;
						aStringArray6[anInt1378++] = "";
						anIntArray106[anInt1382++] = 0;
						aStringArray6[anInt1378++] = "";
						anIntArray106[anInt1382++] = 0;
						anIntArray106[anInt1382++] = 0;
						aStringArray6[anInt1378++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt1382 -= 4;
						local175 = anIntArray106[anInt1382];
						local1496 = anIntArray106[anInt1382 + 1] == 1;
						local97 = anIntArray106[anInt1382 + 2];
						local2107 = anIntArray106[anInt1382 + 3] == 1;
						Static189.method3008(local1496, local97, local2107, local175);
						return;
					}
					if (arg0 == 6508) {
						Static427.method6425();
						return;
					}
					if (arg0 == 6509) {
						if (Static469.anInt7883 != 7) {
							return;
						}
						Static536.aBoolean732 = anIntArray106[--anInt1382] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray106[anInt1382++] = Static41.anInt706;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static238.aClass97_1 == Static447.aClass97_5) {
						if (arg0 == 6700) {
							local175 = Static183.aClass81_27.method1611();
							if (Static302.anInt4813 != -1) {
								local175++;
							}
							anIntArray106[anInt1382++] = local175;
							return;
						}
						if (arg0 == 6701) {
							local175 = anIntArray106[--anInt1382];
							if (Static302.anInt4813 != -1) {
								if (local175 == 0) {
									anIntArray106[anInt1382++] = Static302.anInt4813;
									return;
								}
								local175--;
							}
							@Pc(7462) Class5_Sub15 local7462 = (Class5_Sub15) Static183.aClass81_27.method1608();
							while (local175-- > 0) {
								local7462 = (Class5_Sub15) Static183.aClass81_27.method1610();
							}
							anIntArray106[anInt1382++] = local7462.anInt2409;
							return;
						}
						if (arg0 == 6702) {
							local175 = anIntArray106[--anInt1382];
							if (Static441.aClass357ArrayArray1[local175] == null) {
								aStringArray6[anInt1378++] = "";
								return;
							}
							local89 = Static441.aClass357ArrayArray1[local175][0].aString139;
							if (local89 == null) {
								aStringArray6[anInt1378++] = "";
								return;
							}
							aStringArray6[anInt1378++] = local89.substring(0, local89.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local175 = anIntArray106[--anInt1382];
							if (Static441.aClass357ArrayArray1[local175] == null) {
								anIntArray106[anInt1382++] = 0;
								return;
							}
							anIntArray106[anInt1382++] = Static441.aClass357ArrayArray1[local175].length;
							return;
						}
						if (arg0 == 6704) {
							anInt1382 -= 2;
							local175 = anIntArray106[anInt1382];
							local776 = anIntArray106[anInt1382 + 1];
							if (Static441.aClass357ArrayArray1[local175] == null) {
								aStringArray6[anInt1378++] = "";
								return;
							}
							local181 = Static441.aClass357ArrayArray1[local175][local776].aString139;
							if (local181 == null) {
								aStringArray6[anInt1378++] = "";
								return;
							}
							aStringArray6[anInt1378++] = local181;
							return;
						}
						if (arg0 == 6705) {
							anInt1382 -= 2;
							local175 = anIntArray106[anInt1382];
							local776 = anIntArray106[anInt1382 + 1];
							if (Static441.aClass357ArrayArray1[local175] == null) {
								anIntArray106[anInt1382++] = 0;
								return;
							}
							anIntArray106[anInt1382++] = Static441.aClass357ArrayArray1[local175][local776].anInt9811;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt1382 -= 3;
							local175 = anIntArray106[anInt1382];
							local776 = anIntArray106[anInt1382 + 1];
							local97 = anIntArray106[anInt1382 + 2];
							Static9.method174("", local97, local175 << 16 | local776, 1);
							return;
						}
						if (arg0 == 6708) {
							anInt1382 -= 3;
							local175 = anIntArray106[anInt1382];
							local776 = anIntArray106[anInt1382 + 1];
							local97 = anIntArray106[anInt1382 + 2];
							Static9.method174("", local97, local175 << 16 | local776, 2);
							return;
						}
						if (arg0 == 6709) {
							anInt1382 -= 3;
							local175 = anIntArray106[anInt1382];
							local776 = anIntArray106[anInt1382 + 1];
							local97 = anIntArray106[anInt1382 + 2];
							Static9.method174("", local97, local175 << 16 | local776, 3);
							return;
						}
						if (arg0 == 6710) {
							anInt1382 -= 3;
							local175 = anIntArray106[anInt1382];
							local776 = anIntArray106[anInt1382 + 1];
							local97 = anIntArray106[anInt1382 + 2];
							Static9.method174("", local97, local175 << 16 | local776, 4);
							return;
						}
						if (arg0 == 6711) {
							anInt1382 -= 3;
							local175 = anIntArray106[anInt1382];
							local776 = anIntArray106[anInt1382 + 1];
							local97 = anIntArray106[anInt1382 + 2];
							Static9.method174("", local97, local175 << 16 | local776, 5);
							return;
						}
						if (arg0 == 6712) {
							anInt1382 -= 3;
							local175 = anIntArray106[anInt1382];
							local776 = anIntArray106[anInt1382 + 1];
							local97 = anIntArray106[anInt1382 + 2];
							Static9.method174("", local97, local175 << 16 | local776, 6);
							return;
						}
						if (arg0 == 6713) {
							anInt1382 -= 3;
							local175 = anIntArray106[anInt1382];
							local776 = anIntArray106[anInt1382 + 1];
							local97 = anIntArray106[anInt1382 + 2];
							Static9.method174("", local97, local175 << 16 | local776, 7);
							return;
						}
						if (arg0 == 6714) {
							anInt1382 -= 3;
							local175 = anIntArray106[anInt1382];
							local776 = anIntArray106[anInt1382 + 1];
							local97 = anIntArray106[anInt1382 + 2];
							Static9.method174("", local97, local175 << 16 | local776, 8);
							return;
						}
						if (arg0 == 6715) {
							anInt1382 -= 3;
							local175 = anIntArray106[anInt1382];
							local776 = anIntArray106[anInt1382 + 1];
							local97 = anIntArray106[anInt1382 + 2];
							Static9.method174("", local97, local175 << 16 | local776, 9);
							return;
						}
						if (arg0 == 6716) {
							anInt1382 -= 3;
							local175 = anIntArray106[anInt1382];
							local776 = anIntArray106[anInt1382 + 1];
							local97 = anIntArray106[anInt1382 + 2];
							Static9.method174("", local97, local175 << 16 | local776, 10);
							return;
						}
						if (arg0 == 6717) {
							anInt1382 -= 3;
							local175 = anIntArray106[anInt1382];
							local776 = anIntArray106[anInt1382 + 1];
							local97 = anIntArray106[anInt1382 + 2];
							@Pc(8050) Class357 local8050 = Static318.method4971(local175 << 16 | local776, local97);
							Static2.method24();
							@Pc(8055) Class5_Sub49 local8055 = Static74.method1225(local8050);
							Static184.method2955(local8055.anInt10258, local8050, local8055.method8730());
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8083) Class72 local8083;
						if (arg0 == 6800) {
							local175 = anIntArray106[--anInt1382];
							local8083 = Static40.aClass273_3.method6529(local175);
							if (local8083.aString22 == null) {
								aStringArray6[anInt1378++] = "";
								return;
							}
							aStringArray6[anInt1378++] = local8083.aString22;
							return;
						}
						if (arg0 == 6801) {
							local175 = anIntArray106[--anInt1382];
							local8083 = Static40.aClass273_3.method6529(local175);
							anIntArray106[anInt1382++] = local8083.anInt1509;
							return;
						}
						if (arg0 == 6802) {
							local175 = anIntArray106[--anInt1382];
							local8083 = Static40.aClass273_3.method6529(local175);
							anIntArray106[anInt1382++] = local8083.anInt1523;
							return;
						}
						if (arg0 == 6803) {
							local175 = anIntArray106[--anInt1382];
							local8083 = Static40.aClass273_3.method6529(local175);
							anIntArray106[anInt1382++] = local8083.anInt1513;
							return;
						}
						if (arg0 == 6804) {
							anInt1382 -= 2;
							local175 = anIntArray106[anInt1382];
							local776 = anIntArray106[anInt1382 + 1];
							@Pc(8205) Class230 local8205 = Static246.aClass258_1.method6202(local776);
							if (local8205.method5600()) {
								aStringArray6[anInt1378++] = Static40.aClass273_3.method6529(local175).method1440(local8205.aString95, local776);
								return;
							}
							anIntArray106[anInt1382++] = Static40.aClass273_3.method6529(local175).method1443(local776, local8205.anInt6315);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray106[anInt1382++] = Static205.aBoolean296 && !Static33.aBoolean54 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray106[anInt1382++] = (int) (Static200.aLong97 / 60000L);
							anIntArray106[anInt1382++] = Static172.aBoolean264 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray106[anInt1382++] = Static630.anInt10265;
							return;
						}
						if (arg0 == 6903) {
							anIntArray106[anInt1382++] = Static437.anInt7394;
							return;
						}
						if (arg0 == 6904) {
							anIntArray106[anInt1382++] = Static228.anInt3956;
							return;
						}
						if (arg0 == 6905) {
							local83 = "";
							if (Static271.aClass330_3 != null) {
								if (Static271.aClass330_3.anObject19 == null) {
									local83 = Static362.method5662(Static271.aClass330_3.anInt9129);
								} else {
									local83 = (String) Static271.aClass330_3.anObject19;
								}
							}
							aStringArray6[anInt1378++] = local83;
							return;
						}
						if (arg0 == 6906) {
							anIntArray106[anInt1382++] = Static280.anInt4575;
							return;
						}
						if (arg0 == 6907) {
							anIntArray106[anInt1382++] = Static544.anInt9018;
							return;
						}
						if (arg0 == 6908) {
							anIntArray106[anInt1382++] = Static111.anInt1759;
							return;
						}
						if (arg0 == 6909) {
							anIntArray106[anInt1382++] = Static390.aBoolean564 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray106[anInt1382++] = Static211.anInt3647;
							return;
						}
						if (arg0 == 6911) {
							anIntArray106[anInt1382++] = Static445.anInt7505;
							return;
						}
						if (arg0 == 6912) {
							anIntArray106[anInt1382++] = Static554.anInt9158;
							return;
						}
						if (arg0 == 6913) {
							anIntArray106[anInt1382++] = Static430.anInt7294;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local175 = Static420.method6384();
							anIntArray106[anInt1382++] = Static422.anInt7185 = Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289();
							anIntArray106[anInt1382++] = local175;
							Static532.method7607();
							Static499.method7307();
							Static71.aBoolean80 = false;
							return;
						}
						if (arg0 == 7001) {
							Static535.method7633();
							Static532.method7607();
							Static499.method7307();
							Static71.aBoolean80 = false;
							return;
						}
						if (arg0 == 7002) {
							Static327.method5102();
							Static532.method7607();
							Static499.method7307();
							Static71.aBoolean80 = false;
							return;
						}
						if (arg0 == 7003) {
							Static249.method3868();
							Static532.method7607();
							Static499.method7307();
							Static71.aBoolean80 = false;
							return;
						}
						if (arg0 == 7004) {
							Static421.method8914();
							Static532.method7607();
							Static499.method7307();
							Static71.aBoolean80 = false;
							return;
						}
						if (arg0 == 7005) {
							Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub24_1, 0);
							Static499.method7307();
							Static71.aBoolean80 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static422.anInt7185 == 2) {
								Static646.aBoolean838 = true;
								return;
							}
							if (Static422.anInt7185 == 1) {
								Static601.aBoolean806 = true;
								return;
							}
							if (Static422.anInt7185 == 3) {
								Static335.aBoolean485 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub24_1.method7561();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt1382 -= 2;
							local175 = anIntArray106[anInt1382];
							local776 = anIntArray106[anInt1382 + 1];
							if (local175 != -1) {
								if (local776 > 255) {
									local776 = 255;
								} else if (local776 < 0) {
									local776 = 0;
								}
								Static529.method7565(local776, local175, false);
							}
							return;
						}
						if (arg0 == 7101) {
							local175 = anIntArray106[--anInt1382];
							if (local175 != -1) {
								Static44.method753(local175);
							}
							return;
						}
						if (arg0 == 7102) {
							local175 = anIntArray106[--anInt1382];
							if (local175 != -1) {
								Static4.method41(local175);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray106[anInt1382++] = Static3.method38("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub16_1.method4420() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub26_1.method7771() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub14_1.method4197() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub23_1.method7463() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub6_1.method1366() && Static485.aClass126_17.method7062() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub4_1.method755() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub20_1.method6519() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub27_1.method7847() && Static485.aClass126_17.method6976() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub25_1.method7700() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub29_1.method8544() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub19_1.method6462() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub28_1.method8174() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub21_1.method6583() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub15_1.method4287() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local175 = anIntArray106[--anInt1382];
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub16_1.method8533(local175);
							return;
						}
						if (arg0 == 7302) {
							local175 = anIntArray106[--anInt1382];
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub26_1.method8533(local175);
							return;
						}
						if (arg0 == 7303) {
							local175 = anIntArray106[--anInt1382];
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub14_1.method8533(local175);
							return;
						}
						if (arg0 == 7304) {
							local175 = anIntArray106[--anInt1382];
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub23_1.method8533(local175);
							return;
						}
						if (arg0 == 7305) {
							local175 = anIntArray106[--anInt1382];
							if (!Static485.aClass126_17.method7062()) {
								anIntArray106[anInt1382++] = 3;
								return;
							}
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub6_1.method8533(local175);
							return;
						}
						if (arg0 == 7306) {
							local175 = anIntArray106[--anInt1382];
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub4_1.method8533(local175);
							return;
						}
						if (arg0 == 7307) {
							local175 = anIntArray106[--anInt1382];
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub20_1.method8533(local175);
							return;
						}
						if (arg0 == 7308) {
							local175 = anIntArray106[--anInt1382];
							if (!Static485.aClass126_17.method6976()) {
								anIntArray106[anInt1382++] = 3;
								return;
							}
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub27_1.method8533(local175);
							return;
						}
						if (arg0 == 7309) {
							local175 = anIntArray106[--anInt1382];
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub25_1.method8533(local175);
							return;
						}
						if (arg0 == 7310) {
							local175 = anIntArray106[--anInt1382];
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub29_1.method8533(local175);
							return;
						}
						if (arg0 == 7311) {
							local175 = anIntArray106[--anInt1382];
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub19_1.method8533(local175);
							return;
						}
						if (arg0 == 7312) {
							local175 = anIntArray106[--anInt1382];
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub28_1.method8533(local175);
							return;
						}
						if (arg0 == 7313) {
							local175 = anIntArray106[--anInt1382];
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub21_1.method8533(local175);
							return;
						}
						if (arg0 == 7314) {
							local175 = anIntArray106[--anInt1382];
							anIntArray106[anInt1382++] = Static627.aClass5_Sub46_31.aClass11_Sub15_1.method8533(local175);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
	public static void method1319(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static567.method8019(arg0)) {
			return;
		}
		@Pc(12) Class357[] local12 = Static441.aClass357ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class357 local19 = local12[local14];
			if (local19.anObjectArray19 != null) {
				@Pc(26) Class5_Sub9 local26 = new Class5_Sub9();
				local26.aClass357_2 = local19;
				local26.anObjectArray1 = local19.anObjectArray19;
				method1316(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method1320(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static408.anInt7025 == 0 && (Static205.aBoolean296 && !Static33.aBoolean54 || Static324.aBoolean473)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static76.aClass58_48.method1237(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static76.aClass58_48.method1237(0).length());
		} else if (local11.startsWith(Static76.aClass58_49.method1237(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static76.aClass58_49.method1237(0).length());
		} else if (local11.startsWith(Static76.aClass58_50.method1237(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static76.aClass58_50.method1237(0).length());
		} else if (local11.startsWith(Static76.aClass58_51.method1237(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static76.aClass58_51.method1237(0).length());
		} else if (local11.startsWith(Static76.aClass58_52.method1237(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static76.aClass58_52.method1237(0).length());
		} else if (local11.startsWith(Static76.aClass58_53.method1237(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static76.aClass58_53.method1237(0).length());
		} else if (local11.startsWith(Static76.aClass58_54.method1237(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static76.aClass58_54.method1237(0).length());
		} else if (local11.startsWith(Static76.aClass58_55.method1237(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static76.aClass58_55.method1237(0).length());
		} else if (local11.startsWith(Static76.aClass58_56.method1237(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static76.aClass58_56.method1237(0).length());
		} else if (local11.startsWith(Static76.aClass58_57.method1237(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static76.aClass58_57.method1237(0).length());
		} else if (local11.startsWith(Static76.aClass58_58.method1237(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static76.aClass58_58.method1237(0).length());
		} else if (local11.startsWith(Class58.lb.method1237(0))) {
			local13 = 11;
			arg0 = arg0.substring(Class58.lb.method1237(0).length());
		} else if (Static321.anInt5554 != 0) {
			if (local11.startsWith(Static76.aClass58_48.method1237(Static321.anInt5554))) {
				local13 = 0;
				arg0 = arg0.substring(Static76.aClass58_48.method1237(Static321.anInt5554).length());
			} else if (local11.startsWith(Static76.aClass58_49.method1237(Static321.anInt5554))) {
				local13 = 1;
				arg0 = arg0.substring(Static76.aClass58_49.method1237(Static321.anInt5554).length());
			} else if (local11.startsWith(Static76.aClass58_50.method1237(Static321.anInt5554))) {
				local13 = 2;
				arg0 = arg0.substring(Static76.aClass58_50.method1237(Static321.anInt5554).length());
			} else if (local11.startsWith(Static76.aClass58_51.method1237(Static321.anInt5554))) {
				local13 = 3;
				arg0 = arg0.substring(Static76.aClass58_51.method1237(Static321.anInt5554).length());
			} else if (local11.startsWith(Static76.aClass58_52.method1237(Static321.anInt5554))) {
				local13 = 4;
				arg0 = arg0.substring(Static76.aClass58_52.method1237(Static321.anInt5554).length());
			} else if (local11.startsWith(Static76.aClass58_53.method1237(Static321.anInt5554))) {
				local13 = 5;
				arg0 = arg0.substring(Static76.aClass58_53.method1237(Static321.anInt5554).length());
			} else if (local11.startsWith(Static76.aClass58_54.method1237(Static321.anInt5554))) {
				local13 = 6;
				arg0 = arg0.substring(Static76.aClass58_54.method1237(Static321.anInt5554).length());
			} else if (local11.startsWith(Static76.aClass58_55.method1237(Static321.anInt5554))) {
				local13 = 7;
				arg0 = arg0.substring(Static76.aClass58_55.method1237(Static321.anInt5554).length());
			} else if (local11.startsWith(Static76.aClass58_56.method1237(Static321.anInt5554))) {
				local13 = 8;
				arg0 = arg0.substring(Static76.aClass58_56.method1237(Static321.anInt5554).length());
			} else if (local11.startsWith(Static76.aClass58_57.method1237(Static321.anInt5554))) {
				local13 = 9;
				arg0 = arg0.substring(Static76.aClass58_57.method1237(Static321.anInt5554).length());
			} else if (local11.startsWith(Static76.aClass58_58.method1237(Static321.anInt5554))) {
				local13 = 10;
				arg0 = arg0.substring(Static76.aClass58_58.method1237(Static321.anInt5554).length());
			} else if (local11.startsWith(Class58.lb.method1237(Static321.anInt5554))) {
				local13 = 11;
				arg0 = arg0.substring(Class58.lb.method1237(Static321.anInt5554).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static76.aClass58_59.method1237(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static76.aClass58_59.method1237(0).length());
		} else if (local11.startsWith(Static76.aClass58_60.method1237(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static76.aClass58_60.method1237(0).length());
		} else if (local11.startsWith(Static76.aClass58_61.method1237(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static76.aClass58_61.method1237(0).length());
		} else if (local11.startsWith(Static76.aClass58_62.method1237(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static76.aClass58_62.method1237(0).length());
		} else if (local11.startsWith(Static76.aClass58_63.method1237(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static76.aClass58_63.method1237(0).length());
		} else if (Static321.anInt5554 != 0) {
			if (local11.startsWith(Static76.aClass58_59.method1237(Static321.anInt5554))) {
				local451 = 1;
				arg0 = arg0.substring(Static76.aClass58_59.method1237(Static321.anInt5554).length());
			} else if (local11.startsWith(Static76.aClass58_60.method1237(Static321.anInt5554))) {
				local451 = 2;
				arg0 = arg0.substring(Static76.aClass58_60.method1237(Static321.anInt5554).length());
			} else if (local11.startsWith(Static76.aClass58_61.method1237(Static321.anInt5554))) {
				local451 = 3;
				arg0 = arg0.substring(Static76.aClass58_61.method1237(Static321.anInt5554).length());
			} else if (local11.startsWith(Static76.aClass58_62.method1237(Static321.anInt5554))) {
				local451 = 4;
				arg0 = arg0.substring(Static76.aClass58_62.method1237(Static321.anInt5554).length());
			} else if (local11.startsWith(Static76.aClass58_63.method1237(Static321.anInt5554))) {
				local451 = 5;
				arg0 = arg0.substring(Static76.aClass58_63.method1237(Static321.anInt5554).length());
			}
		}
		@Pc(641) Class5_Sub40 local641 = Static25.method507(Static98.aClass208_2, Static83.aClass181_69);
		local641.aClass5_Sub12_Sub2_2.method8647(0);
		@Pc(650) int local650 = local641.aClass5_Sub12_Sub2_2.anInt10154;
		local641.aClass5_Sub12_Sub2_2.method8647(local13);
		local641.aClass5_Sub12_Sub2_2.method8647(local451);
		Static283.method4245(local641.aClass5_Sub12_Sub2_2, arg0);
		local641.aClass5_Sub12_Sub2_2.method8652(local641.aClass5_Sub12_Sub2_2.anInt10154 - local650);
		Static612.method8496(local641);
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V")
	private static void method1321(@OriginalArg(0) int arg0) {
		@Pc(3) Class357 local3 = Static472.method6903(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class357[] local13 = Static591.aClass357ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class357[] local19 = Static441.aClass357ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static591.aClass357ArrayArray2[local9] = new Class357[local22];
			Static655.method4106(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static655.method4106(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!tia;I)V")
	private static void method1322(@OriginalArg(0) Class5_Sub4_Sub19 arg0, @OriginalArg(1) int arg1) {
		anInt1382 = 0;
		anInt1378 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray703;
		@Pc(11) int[] local11 = arg0.anIntArray702;
		@Pc(13) byte local13 = -1;
		anInt1387 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label270: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(839) boolean local839;
					if (local11[local5] == 1) {
						local839 = true;
					} else {
						local839 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method1327(local31, local839);
					} else if (local31 >= 5000 && local31 < 10000) {
						method1318(local31, local839);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray106[anInt1382++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray106[anInt1382++] = Static564.aClass304_1.anIntArray666[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static564.aClass304_1.method7295(anIntArray106[--anInt1382], local54);
					} else if (local31 == 3) {
						aStringArray6[anInt1378++] = arg0.aStringArray37[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt1382 -= 2;
						if (anIntArray106[anInt1382] != anIntArray106[anInt1382 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt1382 -= 2;
						if (anIntArray106[anInt1382] == anIntArray106[anInt1382 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt1382 -= 2;
						if (anIntArray106[anInt1382] < anIntArray106[anInt1382 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt1382 -= 2;
						if (anIntArray106[anInt1382] > anIntArray106[anInt1382 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt1387 == 0) {
							return;
						}
						@Pc(216) Class168 local216 = aClass168Array1[--anInt1387];
						arg0 = local216.aClass5_Sub4_Sub19_1;
						local8 = arg0.anIntArray703;
						local11 = arg0.anIntArray702;
						local5 = local216.anInt4341;
						anIntArray108 = local216.anIntArray356;
						aStringArray5 = local216.aStringArray19;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray106[anInt1382++] = Static564.aClass304_1.method7288(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static564.aClass304_1.method7292(anIntArray106[--anInt1382], local54);
					} else if (local31 == 31) {
						anInt1382 -= 2;
						if (anIntArray106[anInt1382] <= anIntArray106[anInt1382 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt1382 -= 2;
						if (anIntArray106[anInt1382] >= anIntArray106[anInt1382 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray106[anInt1382++] = anIntArray108[local11[local5]];
					} else if (local31 == 34) {
						anIntArray108[local11[local5]] = anIntArray106[--anInt1382];
					} else if (local31 == 35) {
						aStringArray6[anInt1378++] = aStringArray5[local11[local5]];
					} else if (local31 == 36) {
						aStringArray5[local11[local5]] = aStringArray6[--anInt1378];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt1378 -= local54;
						@Pc(400) String local400 = Static571.method8046(aStringArray6, anInt1378, local54);
						aStringArray6[anInt1378++] = local400;
					} else if (local31 == 38) {
						anInt1382--;
					} else if (local31 == 39) {
						anInt1378--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class5_Sub4_Sub19 local436 = Static635.method8767(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt9124];
							@Pc(450) String[] local450 = new String[local436.anInt9126];
							for (local452 = 0; local452 < local436.anInt9127; local452++) {
								local446[local452] = anIntArray106[anInt1382 + local452 - local436.anInt9127];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt9123; local471++) {
								local450[local471] = aStringArray6[anInt1378 + local471 - local436.anInt9123];
							}
							anInt1382 -= local436.anInt9127;
							anInt1378 -= local436.anInt9123;
							@Pc(502) Class168 local502 = new Class168();
							local502.aClass5_Sub4_Sub19_1 = arg0;
							local502.anInt4341 = local5;
							local502.anIntArray356 = anIntArray108;
							local502.aStringArray19 = aStringArray5;
							if (anInt1387 >= aClass168Array1.length) {
								throw new RuntimeException();
							}
							aClass168Array1[anInt1387++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray703;
							local11 = local436.anIntArray702;
							local5 = -1;
							anIntArray108 = local446;
							aStringArray5 = local450;
						} else if (local31 == 42) {
							anIntArray106[anInt1382++] = Static605.anIntArray802[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static605.anIntArray802[local54] = anIntArray106[--anInt1382];
							Static139.method2091(local54);
							Static383.aBoolean558 |= Static361.aBooleanArray42[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray106[--anInt1382];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray109[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label270;
									}
									anIntArrayArray8[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray106[--anInt1382];
							if (local603 < 0 || local603 >= anIntArray109[local54]) {
								throw new RuntimeException();
							}
							anIntArray106[anInt1382++] = anIntArrayArray8[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt1382 -= 2;
							local603 = anIntArray106[anInt1382];
							if (local603 < 0 || local603 >= anIntArray109[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray8[local54][local603] = anIntArray106[anInt1382 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static18.aStringArray1[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray6[anInt1378++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static18.aStringArray1[local54] = aStringArray6[--anInt1378];
							Static525.method7533(local54);
						} else if (local31 == 51) {
							@Pc(774) Class81 local774 = arg0.aClass81Array1[local11[local5]];
							@Pc(787) Class5_Sub41 local787 = (Class5_Sub41) local774.method1599((long) anIntArray106[--anInt1382]);
							if (local787 != null) {
								local5 += local787.anInt7411;
							}
						} else if (local31 == 86) {
							if (anIntArray106[--anInt1382] == 1) {
								local5 += local11[local5];
							}
						} else if (local31 == 87 && anIntArray106[--anInt1382] == 0) {
							local5 += local11[local5];
						}
					}
				}
			}
		} catch (@Pc(874) Exception local874) {
			@Pc(893) StringBuffer local893;
			if (arg0.aString129 == null) {
				local893 = new StringBuffer(30);
				local893.append("CS2: ").append(arg0.aLong282).append(" ");
				for (local603 = anInt1387 - 1; local603 >= 0; local603--) {
					local893.append("v: ").append(aClass168Array1[local603].aClass5_Sub4_Sub19_1.aLong282).append(" ");
				}
				local893.append("op: ").append(local13);
				Static280.method4194(local893.toString(), local874);
			} else {
				Static88.method1388("Clientscript error in: " + arg0.aString129);
				local893 = new StringBuffer(30);
				local893.append("Clientscript error in: ").append(arg0.aString129).append("\n");
				for (local603 = anInt1387 - 1; local603 >= 0; local603--) {
					local893.append("via: ").append(aClass168Array1[local603].aClass5_Sub4_Sub19_1.aString129).append("\n");
				}
				local893.append("Op: ").append(local13).append("\n");
				@Pc(933) String local933 = local874.getMessage();
				if (local933 != null && local933.length() > 0) {
					local893.append("Message: ").append(local933).append("\n");
				}
				Static280.method4194(local893.toString(), local874);
				Static177.method2690(local893.toString());
			}
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(C)I")
	private static int method1323(@OriginalArg(0) char arg0) {
		return Static414.method6322(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "()V")
	public static void method1324() {
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!dia;II)V")
	public static void method1326(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class5_Sub4_Sub19 local5 = Static172.method2652(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray108 = new int[local5.anInt9124];
		aStringArray5 = new String[local5.anInt9126];
		if (local5.aClass74_27 == Static163.aClass74_17 || local5.aClass74_27 == Static91.aClass74_5 || local5.aClass74_27 == Static211.aClass74_20) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static157.aClass357_6 != null) {
				local30 = Static157.aClass357_6.anInt9813;
				local32 = Static157.aClass357_6.anInt9876;
			}
			anIntArray108[0] = Static81.aClass13_1.method6355() - local30;
			anIntArray108[1] = Static81.aClass13_1.method6347() - local32;
		}
		method1322(local5, 200000);
	}

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "(IZ)V")
	private static void method1327(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class357 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class357 local35;
		@Pc(210) Class357 local210;
		@Pc(13) int local13;
		@Pc(158) Class357 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt1382 -= 3;
				local13 = anIntArray106[anInt1382];
				local19 = anIntArray106[anInt1382 + 1];
				local25 = anIntArray106[anInt1382 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static472.method6903(local13);
				if (local35.aClass357Array2 == null) {
					local35.aClass357Array2 = new Class357[local25 + 1];
				}
				if (local35.aClass357Array2.length <= local25) {
					@Pc(54) Class357[] local54 = new Class357[local25 + 1];
					for (local56 = 0; local56 < local35.aClass357Array2.length; local56++) {
						local54[local56] = local35.aClass357Array2[local56];
					}
					local35.aClass357Array2 = local54;
				}
				if (local25 > 0 && local35.aClass357Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class357 local99 = new Class357();
				local99.anInt9828 = local19;
				local99.anInt9837 = local99.anInt9804 = local35.anInt9804;
				local99.anInt9846 = local25;
				local35.aClass357Array2[local25] = local99;
				if (arg1) {
					aClass357_5 = local99;
				} else {
					aClass357_4 = local99;
				}
				Static637.method8778(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass357_5 : aClass357_4;
				if (local137.anInt9846 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static472.method6903(local137.anInt9804);
				local158.aClass357Array2[local137.anInt9846] = null;
				Static637.method8778(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static472.method6903(anIntArray106[--anInt1382]);
				local137.aClass357Array2 = null;
				Static637.method8778(local137);
				return;
			}
			if (arg0 == 200) {
				anInt1382 -= 2;
				local13 = anIntArray106[anInt1382];
				local19 = anIntArray106[anInt1382 + 1];
				local210 = Static318.method4971(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray106[anInt1382++] = 1;
					if (arg1) {
						aClass357_5 = local210;
						return;
					}
					aClass357_4 = local210;
					return;
				}
				anIntArray106[anInt1382++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray106[--anInt1382];
				local158 = Static472.method6903(local13);
				if (local158 != null) {
					anIntArray106[anInt1382++] = 1;
					if (arg1) {
						aClass357_5 = local158;
						return;
					}
					aClass357_4 = local158;
					return;
				}
				anIntArray106[anInt1382++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray106[--anInt1382];
				method1321(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray106[--anInt1382];
				method1328(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt1382 -= 2;
					local13 = anIntArray106[anInt1382];
					local19 = anIntArray106[anInt1382 + 1];
					if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static630.anIntArray821.length; local25++) {
						if (Static630.anIntArray821[local25] == local13) {
							Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1.method8054(local19, Static575.aClass190_2, local25);
							return;
						}
					}
					for (local357 = 0; local357 < Static611.anIntArray805.length; local357++) {
						if (Static611.anIntArray805[local357] == local13) {
							Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1.method8054(local19, Static575.aClass190_2, local357);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt1382 -= 2;
					local13 = anIntArray106[anInt1382];
					local19 = anIntArray106[anInt1382 + 1];
					if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1 == null) {
						return;
					}
					Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1.method8051(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray106[--anInt1382] != 0;
					if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1 == null) {
						return;
					}
					Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1.method8053(local420);
					return;
				}
				if (arg0 == 411) {
					anInt1382 -= 2;
					local13 = anIntArray106[anInt1382];
					local19 = anIntArray106[anInt1382 + 1];
					if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1 == null) {
						return;
					}
					Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1.method8045(local19, local13, Static479.aClass348_1);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static472.method6903(anIntArray106[--anInt1382]);
					} else {
						local137 = arg1 ? aClass357_5 : aClass357_4;
					}
					if (arg0 == 1100) {
						anInt1382 -= 2;
						local137.anInt9814 = anIntArray106[anInt1382];
						if (local137.anInt9814 > local137.anInt9879 - local137.anInt9852) {
							local137.anInt9814 = local137.anInt9879 - local137.anInt9852;
						}
						if (local137.anInt9814 < 0) {
							local137.anInt9814 = 0;
						}
						local137.anInt9819 = anIntArray106[anInt1382 + 1];
						if (local137.anInt9819 > local137.anInt9861 - local137.anInt9797) {
							local137.anInt9819 = local137.anInt9861 - local137.anInt9797;
						}
						if (local137.anInt9819 < 0) {
							local137.anInt9819 = 0;
						}
						Static637.method8778(local137);
						if (local137.anInt9846 == -1) {
							Static379.method7524(local137.anInt9804);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt9841 = anIntArray106[--anInt1382];
						Static637.method8778(local137);
						if (local137.anInt9846 == -1) {
							Static251.method3894(local137.anInt9804);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean789 = anIntArray106[--anInt1382] == 1;
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt9860 = anIntArray106[--anInt1382];
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt9787 = anIntArray106[--anInt1382];
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray106[--anInt1382];
						if (local137.anInt9810 != local19) {
							local137.anInt9810 = local19;
							Static637.method8778(local137);
						}
						if (local137.anInt9846 == -1) {
							Static117.method1729(local137.anInt9804);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt9809 = anIntArray106[--anInt1382];
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean805 = anIntArray106[--anInt1382] == 1;
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt9796 = 1;
						local137.anInt9817 = anIntArray106[--anInt1382];
						Static637.method8778(local137);
						if (local137.anInt9846 == -1) {
							Static450.method6698(local137.anInt9804);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt1382 -= 6;
						local137.anInt9825 = anIntArray106[anInt1382];
						local137.anInt9865 = anIntArray106[anInt1382 + 1];
						local137.anInt9849 = anIntArray106[anInt1382 + 2];
						local137.anInt9788 = anIntArray106[anInt1382 + 3];
						local137.anInt9831 = anIntArray106[anInt1382 + 4];
						local137.anInt9873 = anIntArray106[anInt1382 + 5];
						Static637.method8778(local137);
						if (local137.anInt9846 == -1) {
							Static15.method423(local137.anInt9804);
							Static639.method8795(local137.anInt9804);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray106[--anInt1382];
						if (local137.anInt9806 != local19) {
							local137.anInt9806 = local19;
							local137.anInt9800 = 0;
							local137.anInt9827 = 1;
							local137.anInt9798 = 0;
							@Pc(1110) Class200 local1110 = local137.anInt9806 == -1 ? null : Static396.aClass359_2.method8415(local137.anInt9806);
							if (local1110 != null) {
								Static91.method1412(local1110, local137.anInt9800);
							}
							Static637.method8778(local137);
						}
						if (local137.anInt9846 == -1) {
							Static630.method8726(local137.anInt9804);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean791 = anIntArray106[--anInt1382] == 1;
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray6[--anInt1378];
						if (!local1161.equals(local137.aString140)) {
							local137.aString140 = local1161;
							Static637.method8778(local137);
						}
						if (local137.anInt9846 == -1) {
							Static196.method3112(local137.anInt9804);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt9821 = anIntArray106[--anInt1382];
						Static637.method8778(local137);
						if (local137.anInt9846 == -1) {
							Static547.method7744(local137.anInt9804);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt1382 -= 3;
						local137.anInt9853 = anIntArray106[anInt1382];
						local137.anInt9812 = anIntArray106[anInt1382 + 1];
						local137.anInt9867 = anIntArray106[anInt1382 + 2];
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean796 = anIntArray106[--anInt1382] == 1;
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt9836 = anIntArray106[--anInt1382];
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt9858 = anIntArray106[--anInt1382];
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean801 = anIntArray106[--anInt1382] == 1;
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean803 = anIntArray106[--anInt1382] == 1;
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt1382 -= 2;
						local137.anInt9879 = anIntArray106[anInt1382];
						local137.anInt9861 = anIntArray106[anInt1382 + 1];
						Static637.method8778(local137);
						if (local137.anInt9828 == 0) {
							Static101.method1475(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean792 = anIntArray106[--anInt1382] == 1;
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt9873 = anIntArray106[--anInt1382];
						Static637.method8778(local137);
						if (local137.anInt9846 == -1) {
							Static15.method423(local137.anInt9804);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray106[--anInt1382];
						local137.aBoolean790 = local19 == 1;
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt1382 -= 2;
						local137.anInt9820 = anIntArray106[anInt1382];
						local137.anInt9818 = anIntArray106[anInt1382 + 1];
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt9864 = anIntArray106[--anInt1382];
						Static637.method8778(local137);
						return;
					}
					@Pc(1489) Class230 local1489;
					if (arg0 == 1127) {
						anInt1382 -= 2;
						local19 = anIntArray106[anInt1382];
						local25 = anIntArray106[anInt1382 + 1];
						local1489 = Static246.aClass258_1.method6202(local19);
						if (local25 == local1489.anInt6315) {
							local137.method8398(local19);
							return;
						} else {
							local137.method8397(local19, local25);
							return;
						}
					}
					if (arg0 == 1128) {
						local19 = anIntArray106[--anInt1382];
						local1523 = aStringArray6[--anInt1378];
						local1489 = Static246.aClass258_1.method6202(local19);
						if (!local1489.aString95.equals(local1523)) {
							local137.method8403(local19, local1523);
							return;
						}
						local137.method8398(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray106[--anInt1382];
						if (local137.anInt9828 != 5 && arg0 == 1129 || local137.anInt9828 != 4 && arg0 == 1130) {
							return;
						}
						if (local137.anInt9855 != local19) {
							local137.anInt9855 = local19;
							Static637.method8778(local137);
						}
						if (local137.anInt9846 == -1) {
							Static315.method4961(local137.anInt9804);
						}
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2373) int local2373;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static472.method6903(anIntArray106[--anInt1382]);
							} else {
								local137 = arg1 ? aClass357_5 : aClass357_4;
							}
							if (arg0 == 1499) {
								local137.method8399();
								return;
							}
							local1161 = aStringArray6[--anInt1378];
							@Pc(2459) int[] local2459 = null;
							if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
								local357 = anIntArray106[--anInt1382];
								if (local357 > 0) {
									local2459 = new int[local357];
									while (local357-- > 0) {
										local2459[local357] = anIntArray106[--anInt1382];
									}
								}
								local1161 = local1161.substring(0, local1161.length() - 1);
							}
							@Pc(2511) Object[] local2511 = new Object[local1161.length() + 1];
							for (local2373 = local2511.length - 1; local2373 >= 1; local2373--) {
								if (local1161.charAt(local2373 - 1) == 's') {
									local2511[local2373] = aStringArray6[--anInt1378];
								} else {
									local2511[local2373] = Integer.valueOf(anIntArray106[--anInt1382]);
								}
							}
							local56 = anIntArray106[--anInt1382];
							if (local56 == -1) {
								local2511 = null;
							} else {
								local2511[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray9 = local2511;
							} else if (arg0 == 1401) {
								local137.anObjectArray6 = local2511;
							} else if (arg0 == 1402) {
								local137.anObjectArray14 = local2511;
							} else if (arg0 == 1403) {
								local137.anObjectArray25 = local2511;
							} else if (arg0 == 1404) {
								local137.anObjectArray5 = local2511;
							} else if (arg0 == 1405) {
								local137.anObjectArray22 = local2511;
							} else if (arg0 == 1406) {
								local137.anObjectArray17 = local2511;
							} else if (arg0 == 1407) {
								local137.anObjectArray28 = local2511;
								local137.anIntArray795 = local2459;
							} else if (arg0 == 1408) {
								local137.anObjectArray26 = local2511;
							} else if (arg0 == 1409) {
								local137.anObjectArray24 = local2511;
							} else if (arg0 == 1410) {
								local137.anObjectArray29 = local2511;
							} else if (arg0 == 1411) {
								local137.anObjectArray21 = local2511;
							} else if (arg0 == 1412) {
								local137.anObjectArray3 = local2511;
							} else if (arg0 == 1414) {
								local137.anObjectArray15 = local2511;
								local137.anIntArray798 = local2459;
							} else if (arg0 == 1415) {
								local137.anObjectArray12 = local2511;
								local137.anIntArray792 = local2459;
							} else if (arg0 == 1416) {
								local137.anObjectArray23 = local2511;
							} else if (arg0 == 1417) {
								local137.anObjectArray2 = local2511;
							} else if (arg0 == 1418) {
								local137.anObjectArray20 = local2511;
							} else if (arg0 == 1419) {
								local137.anObjectArray27 = local2511;
							} else if (arg0 == 1420) {
								local137.anObjectArray13 = local2511;
							} else if (arg0 == 1421) {
								local137.anObjectArray31 = local2511;
							} else if (arg0 == 1422) {
								local137.anObjectArray4 = local2511;
							} else if (arg0 == 1423) {
								local137.anObjectArray10 = local2511;
							} else if (arg0 == 1424) {
								local137.anObjectArray16 = local2511;
							} else if (arg0 == 1425) {
								local137.anObjectArray8 = local2511;
							} else if (arg0 == 1426) {
								local137.anObjectArray30 = local2511;
							} else if (arg0 == 1427) {
								local137.anObjectArray11 = local2511;
							} else if (arg0 == 1428) {
								local137.lb = local2511;
								local137.anIntArray796 = local2459;
							} else if (arg0 == 1429) {
								local137.anObjectArray7 = local2511;
								local137.anIntArray794 = local2459;
							} else if (arg0 == 1430) {
								local137.anObjectArray18 = local2511;
							}
							local137.aBoolean798 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass357_5 : aClass357_4;
							if (arg0 == 1500) {
								anIntArray106[anInt1382++] = local137.anInt9813;
								return;
							}
							if (arg0 == 1501) {
								anIntArray106[anInt1382++] = local137.anInt9876;
								return;
							}
							if (arg0 == 1502) {
								anIntArray106[anInt1382++] = local137.anInt9852;
								return;
							}
							if (arg0 == 1503) {
								anIntArray106[anInt1382++] = local137.anInt9797;
								return;
							}
							if (arg0 == 1504) {
								anIntArray106[anInt1382++] = local137.aBoolean797 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray106[anInt1382++] = local137.anInt9837;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static243.method3688(local137);
								anIntArray106[anInt1382++] = local158 == null ? -1 : local158.anInt9804;
								return;
							}
						} else {
							@Pc(3107) Class230 local3107;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass357_5 : aClass357_4;
								if (arg0 == 1600) {
									anIntArray106[anInt1382++] = local137.anInt9814;
									return;
								}
								if (arg0 == 1601) {
									anIntArray106[anInt1382++] = local137.anInt9819;
									return;
								}
								if (arg0 == 1602) {
									aStringArray6[anInt1378++] = local137.aString140;
									return;
								}
								if (arg0 == 1603) {
									anIntArray106[anInt1382++] = local137.anInt9879;
									return;
								}
								if (arg0 == 1604) {
									anIntArray106[anInt1382++] = local137.anInt9861;
									return;
								}
								if (arg0 == 1605) {
									anIntArray106[anInt1382++] = local137.anInt9873;
									return;
								}
								if (arg0 == 1606) {
									anIntArray106[anInt1382++] = local137.anInt9849;
									return;
								}
								if (arg0 == 1607) {
									anIntArray106[anInt1382++] = local137.anInt9831;
									return;
								}
								if (arg0 == 1608) {
									anIntArray106[anInt1382++] = local137.anInt9788;
									return;
								}
								if (arg0 == 1609) {
									anIntArray106[anInt1382++] = local137.anInt9860;
									return;
								}
								if (arg0 == 1610) {
									anIntArray106[anInt1382++] = local137.anInt9825;
									return;
								}
								if (arg0 == 1611) {
									anIntArray106[anInt1382++] = local137.anInt9865;
									return;
								}
								if (arg0 == 1612) {
									anIntArray106[anInt1382++] = local137.anInt9810;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray106[--anInt1382];
									local3107 = Static246.aClass258_1.method6202(local19);
									if (local3107.method5600()) {
										aStringArray6[anInt1378++] = local137.method8401(local3107.aString95, local19);
										return;
									}
									anIntArray106[anInt1382++] = local137.method8382(local19, local3107.anInt6315);
									return;
								}
								if (arg0 == 1614) {
									anIntArray106[anInt1382++] = local137.anInt9809;
									return;
								}
								if (arg0 == 2614) {
									anIntArray106[anInt1382++] = local137.anInt9796 == 1 ? local137.anInt9817 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass357_5 : aClass357_4;
								if (arg0 == 1700) {
									anIntArray106[anInt1382++] = local137.anInt9871;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt9871 != -1) {
										anIntArray106[anInt1382++] = local137.anInt9815;
										return;
									}
									anIntArray106[anInt1382++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray106[anInt1382++] = local137.anInt9846;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass357_5 : aClass357_4;
								if (arg0 == 1800) {
									anIntArray106[anInt1382++] = Static74.method1225(local137).method8730();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray106[--anInt1382];
									local19--;
									if (local137.aStringArray43 != null && local19 < local137.aStringArray43.length && local137.aStringArray43[local19] != null) {
										aStringArray6[anInt1378++] = local137.aStringArray43[local19];
										return;
									}
									aStringArray6[anInt1378++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString138 == null) {
										aStringArray6[anInt1378++] = "";
										return;
									}
									aStringArray6[anInt1378++] = local137.aString138;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static472.method6903(anIntArray106[--anInt1382]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass357_5 : aClass357_4;
								}
								if (anInt1389 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray11 == null) {
										return;
									}
									@Pc(3376) Class5_Sub9 local3376 = new Class5_Sub9();
									local3376.aClass357_2 = local137;
									local3376.anObjectArray1 = local137.anObjectArray11;
									local3376.anInt910 = anInt1389 + 1;
									Static297.aClass306_18.method7303(local3376);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static472.method6903(anIntArray106[--anInt1382]);
								if (arg0 == 2500) {
									anIntArray106[anInt1382++] = local137.anInt9813;
									return;
								}
								if (arg0 == 2501) {
									anIntArray106[anInt1382++] = local137.anInt9876;
									return;
								}
								if (arg0 == 2502) {
									anIntArray106[anInt1382++] = local137.anInt9852;
									return;
								}
								if (arg0 == 2503) {
									anIntArray106[anInt1382++] = local137.anInt9797;
									return;
								}
								if (arg0 == 2504) {
									anIntArray106[anInt1382++] = local137.aBoolean797 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray106[anInt1382++] = local137.anInt9837;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static243.method3688(local137);
									anIntArray106[anInt1382++] = local158 == null ? -1 : local158.anInt9804;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static472.method6903(anIntArray106[--anInt1382]);
								if (arg0 == 2600) {
									anIntArray106[anInt1382++] = local137.anInt9814;
									return;
								}
								if (arg0 == 2601) {
									anIntArray106[anInt1382++] = local137.anInt9819;
									return;
								}
								if (arg0 == 2602) {
									aStringArray6[anInt1378++] = local137.aString140;
									return;
								}
								if (arg0 == 2603) {
									anIntArray106[anInt1382++] = local137.anInt9879;
									return;
								}
								if (arg0 == 2604) {
									anIntArray106[anInt1382++] = local137.anInt9861;
									return;
								}
								if (arg0 == 2605) {
									anIntArray106[anInt1382++] = local137.anInt9873;
									return;
								}
								if (arg0 == 2606) {
									anIntArray106[anInt1382++] = local137.anInt9849;
									return;
								}
								if (arg0 == 2607) {
									anIntArray106[anInt1382++] = local137.anInt9831;
									return;
								}
								if (arg0 == 2608) {
									anIntArray106[anInt1382++] = local137.anInt9788;
									return;
								}
								if (arg0 == 2609) {
									anIntArray106[anInt1382++] = local137.anInt9860;
									return;
								}
								if (arg0 == 2610) {
									anIntArray106[anInt1382++] = local137.anInt9825;
									return;
								}
								if (arg0 == 2611) {
									anIntArray106[anInt1382++] = local137.anInt9865;
									return;
								}
								if (arg0 == 2612) {
									anIntArray106[anInt1382++] = local137.anInt9810;
									return;
								}
								if (arg0 == 2613) {
									anIntArray106[anInt1382++] = local137.anInt9809;
									return;
								}
								if (arg0 == 2614) {
									anIntArray106[anInt1382++] = local137.anInt9796 == 1 ? local137.anInt9817 : -1;
									return;
								}
							} else {
								@Pc(3905) Class5_Sub15 local3905;
								@Pc(3803) Class5_Sub15 local3803;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static472.method6903(anIntArray106[--anInt1382]);
										anIntArray106[anInt1382++] = local137.anInt9871;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static472.method6903(anIntArray106[--anInt1382]);
										if (local137.anInt9871 != -1) {
											anIntArray106[anInt1382++] = local137.anInt9815;
											return;
										}
										anIntArray106[anInt1382++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray106[--anInt1382];
										local3803 = (Class5_Sub15) Static183.aClass81_27.method1599((long) local13);
										if (local3803 != null) {
											anIntArray106[anInt1382++] = 1;
											return;
										}
										anIntArray106[anInt1382++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static472.method6903(anIntArray106[--anInt1382]);
										if (local137.aClass357Array2 == null) {
											anIntArray106[anInt1382++] = 0;
											return;
										}
										local19 = local137.aClass357Array2.length;
										for (local25 = 0; local25 < local137.aClass357Array2.length; local25++) {
											if (local137.aClass357Array2[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray106[anInt1382++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt1382 -= 2;
										local13 = anIntArray106[anInt1382];
										local19 = anIntArray106[anInt1382 + 1];
										local3905 = (Class5_Sub15) Static183.aClass81_27.method1599((long) local13);
										if (local3905 != null && local3905.anInt2409 == local19) {
											anIntArray106[anInt1382++] = 1;
											return;
										}
										anIntArray106[anInt1382++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static472.method6903(anIntArray106[--anInt1382]);
									if (arg0 == 2800) {
										anIntArray106[anInt1382++] = Static74.method1225(local137).method8730();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray106[--anInt1382];
										local19--;
										if (local137.aStringArray43 != null && local19 < local137.aStringArray43.length && local137.aStringArray43[local19] != null) {
											aStringArray6[anInt1378++] = local137.aStringArray43[local19];
											return;
										}
										aStringArray6[anInt1378++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString138 == null) {
											aStringArray6[anInt1378++] = "";
											return;
										}
										aStringArray6[anInt1378++] = local137.aString138;
										return;
									}
								} else {
									@Pc(4131) Class5_Sub40 local4131;
									@Pc(4042) String local4042;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4042 = aStringArray6[--anInt1378];
											Static207.method3199(local4042);
											return;
										}
										if (arg0 == 3101) {
											anInt1382 -= 2;
											Static305.method4418(anIntArray106[anInt1382], anIntArray106[anInt1382 + 1], Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1);
											return;
										}
										if (arg0 == 3103) {
											Static56.method870();
											return;
										}
										if (arg0 == 3104) {
											local4042 = aStringArray6[--anInt1378];
											local19 = 0;
											if (Static515.method7420(local4042)) {
												local19 = Static443.method6588(local4042);
											}
											@Pc(4102) Class5_Sub40 local4102 = Static25.method507(Static98.aClass208_2, Static111.aClass181_19);
											local4102.aClass5_Sub12_Sub2_2.method8622(local19);
											Static612.method8496(local4102);
											return;
										}
										if (arg0 == 3105) {
											local4042 = aStringArray6[--anInt1378];
											local4131 = Static25.method507(Static98.aClass208_2, Static567.aClass181_86);
											local4131.aClass5_Sub12_Sub2_2.method8647(local4042.length() + 1);
											local4131.aClass5_Sub12_Sub2_2.method8619(local4042);
											Static612.method8496(local4131);
											return;
										}
										if (arg0 == 3106) {
											local4042 = aStringArray6[--anInt1378];
											local4131 = Static25.method507(Static98.aClass208_2, Static138.aClass181_24);
											local4131.aClass5_Sub12_Sub2_2.method8647(local4042.length() + 1);
											local4131.aClass5_Sub12_Sub2_2.method8619(local4042);
											Static612.method8496(local4131);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray106[--anInt1382];
											local1161 = aStringArray6[--anInt1378];
											Static645.method8847(local13, local1161);
											return;
										}
										if (arg0 == 3108) {
											anInt1382 -= 3;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											local25 = anIntArray106[anInt1382 + 2];
											local35 = Static472.method6903(local25);
											Static225.method3518(local35, local13, local19);
											return;
										}
										if (arg0 == 3109) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											local210 = arg1 ? aClass357_5 : aClass357_4;
											Static225.method3518(local210, local13, local19);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray106[--anInt1382];
											local4131 = Static25.method507(Static98.aClass208_2, Static527.aClass181_93);
											local4131.aClass5_Sub12_Sub2_2.method8655(local13);
											Static612.method8496(local4131);
											return;
										}
										if (arg0 == 3111) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											local3905 = (Class5_Sub15) Static183.aClass81_27.method1599((long) local13);
											if (local3905 != null) {
												Static177.method2689(true, local3905.anInt2409 != local19, local3905);
											}
											Static94.method8742(3, local19, local13, true);
											return;
										}
										if (arg0 == 3112) {
											anInt1382--;
											local13 = anIntArray106[anInt1382];
											local3803 = (Class5_Sub15) Static183.aClass81_27.method1599((long) local13);
											if (local3803 != null && local3803.anInt2406 == 3) {
												Static177.method2689(true, true, local3803);
											}
											return;
										}
										if (arg0 == 3113) {
											Static104.method1523(aStringArray6[--anInt1378]);
											return;
										}
										if (arg0 == 3114) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											local1523 = aStringArray6[--anInt1378];
											Static365.method5696(local19, local1523, "", "", "", local13);
											return;
										}
										if (arg0 == 3115) {
											anInt1382 -= 11;
											@Pc(4432) Class204[] local4432 = Static194.method3068();
											@Pc(4435) Class288[] local4435 = Static609.method8474();
											Static360.method5627(anIntArray106[anInt1382 + 8], anIntArray106[anInt1382 + 2], anIntArray106[anInt1382 + 9], anIntArray106[anInt1382 + 5], local4432[anIntArray106[anInt1382]], local4435[anIntArray106[anInt1382 + 1]], anIntArray106[anInt1382 + 10], anIntArray106[anInt1382 + 4], anIntArray106[anInt1382 + 3], anIntArray106[anInt1382 + 6], anIntArray106[anInt1382 + 7]);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt1382 -= 3;
											Static301.method4383(256, anIntArray106[anInt1382], anIntArray106[anInt1382 + 2], 255, anIntArray106[anInt1382 + 1]);
											return;
										}
										if (arg0 == 3201) {
											Static465.method6345(anIntArray106[--anInt1382], 50, 255);
											return;
										}
										if (arg0 == 3202) {
											anInt1382 -= 2;
											Static338.method5186(anIntArray106[anInt1382], 255, anIntArray106[anInt1382 + 1]);
											return;
										}
										if (arg0 == 3203) {
											anInt1382 -= 4;
											Static301.method4383(256, anIntArray106[anInt1382], anIntArray106[anInt1382 + 2], anIntArray106[anInt1382 + 3], anIntArray106[anInt1382 + 1]);
											return;
										}
										if (arg0 == 3204) {
											anInt1382 -= 3;
											Static465.method6345(anIntArray106[anInt1382], anIntArray106[anInt1382 + 2], anIntArray106[anInt1382 + 1]);
											return;
										}
										if (arg0 == 3205) {
											anInt1382 -= 3;
											Static338.method5186(anIntArray106[anInt1382], anIntArray106[anInt1382 + 2], anIntArray106[anInt1382 + 1]);
											return;
										}
										if (arg0 == 3206) {
											anInt1382 -= 4;
											Static392.method6102(anIntArray106[anInt1382 + 3], anIntArray106[anInt1382 + 1], anIntArray106[anInt1382], 256, false, anIntArray106[anInt1382 + 2]);
											return;
										}
										if (arg0 == 3207) {
											anInt1382 -= 4;
											Static392.method6102(anIntArray106[anInt1382 + 3], anIntArray106[anInt1382 + 1], anIntArray106[anInt1382], 256, true, anIntArray106[anInt1382 + 2]);
											return;
										}
										if (arg0 == 3208) {
											anInt1382 -= 5;
											Static301.method4383(anIntArray106[anInt1382 + 4], anIntArray106[anInt1382], anIntArray106[anInt1382 + 2], anIntArray106[anInt1382 + 3], anIntArray106[anInt1382 + 1]);
											return;
										}
										if (arg0 == 3209) {
											anInt1382 -= 5;
											Static392.method6102(anIntArray106[anInt1382 + 3], anIntArray106[anInt1382 + 1], anIntArray106[anInt1382], anIntArray106[anInt1382 + 4], false, anIntArray106[anInt1382 + 2]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray106[anInt1382++] = Static235.anInt3998;
											return;
										}
										if (arg0 == 3301) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = Static452.method7476(local13, local19, false);
											return;
										}
										if (arg0 == 3302) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = Static329.method5128(false, local13, local19);
											return;
										}
										if (arg0 == 3303) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = Static410.method6263(false, local13, local19);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static221.aClass324_1.method7725(local13).anInt1093;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static242.anIntArray346[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static221.anIntArray312[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static20.anIntArray33[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4960) byte local4960 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125;
											local19 = (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9317 >> 9) + Static113.anInt1785;
											local25 = (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt9315 >> 9) + Static622.anInt10087;
											anIntArray106[anInt1382++] = (local4960 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray106[anInt1382++] = Static202.aBoolean294 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = Static452.method7476(local13, local19, true);
											return;
										}
										if (arg0 == 3314) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = Static329.method5128(true, local13, local19);
											return;
										}
										if (arg0 == 3315) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = Static410.method6263(true, local13, local19);
											return;
										}
										if (arg0 == 3316) {
											if (Static408.anInt7025 >= 2) {
												anIntArray106[anInt1382++] = Static408.anInt7025;
												return;
											}
											anIntArray106[anInt1382++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray106[anInt1382++] = Static443.anInt7473;
											return;
										}
										if (arg0 == 3318) {
											anIntArray106[anInt1382++] = Static282.aClass109_2.anInt2756;
											return;
										}
										if (arg0 == 3321) {
											anIntArray106[anInt1382++] = Static315.anInt5518;
											return;
										}
										if (arg0 == 3322) {
											anIntArray106[anInt1382++] = Static503.anInt3941;
											return;
										}
										if (arg0 == 3323) {
											if (Static17.anInt401 >= 5 && Static17.anInt401 <= 9) {
												anIntArray106[anInt1382++] = 1;
												return;
											}
											anIntArray106[anInt1382++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static17.anInt401 >= 5 && Static17.anInt401 <= 9) {
												anIntArray106[anInt1382++] = Static17.anInt401;
												return;
											}
											anIntArray106[anInt1382++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray106[anInt1382++] = Static386.aBoolean562 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray106[anInt1382++] = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anInt2723;
											return;
										}
										if (arg0 == 3327) {
											anIntArray106[anInt1382++] = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1 != null && Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1.aBoolean765 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray106[anInt1382++] = Static324.aBoolean473 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static130.method1929(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = Static509.method7366(false, local13, local19);
											return;
										}
										if (arg0 == 3332) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = Static509.method7366(true, local13, local19);
											return;
										}
										if (arg0 == 3333) {
											anIntArray106[anInt1382++] = Static536.anInt8899;
											return;
										}
										if (arg0 == 3335) {
											anIntArray106[anInt1382++] = Static321.anInt5554;
											return;
										}
										if (arg0 == 3336) {
											anInt1382 -= 4;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											local25 = anIntArray106[anInt1382 + 2];
											local357 = anIntArray106[anInt1382 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local357;
											anIntArray106[anInt1382++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray106[anInt1382++] = Static141.anInt2321;
											return;
										}
										if (arg0 == 3338) {
											anIntArray106[anInt1382++] = Static286.method7989();
											return;
										}
										if (arg0 == 3339) {
											anIntArray106[anInt1382++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray106[anInt1382++] = Static292.aBoolean386 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray106[anInt1382++] = Static589.aBoolean312 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray106[anInt1382++] = Static81.aClass13_1.method6355();
											return;
										}
										if (arg0 == 3343) {
											anIntArray106[anInt1382++] = Static81.aClass13_1.method6347();
											return;
										}
										if (arg0 == 3344) {
											aStringArray6[anInt1378++] = Static385.method5958();
											return;
										}
										if (arg0 == 3345) {
											aStringArray6[anInt1378++] = Static63.method1075();
											return;
										}
										if (arg0 == 3346) {
											anIntArray106[anInt1382++] = Static254.method3927();
											return;
										}
										if (arg0 == 3347) {
											anIntArray106[anInt1382++] = Static46.anInt747;
											return;
										}
										if (arg0 == 3349) {
											anIntArray106[anInt1382++] = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass130_7.method2930() >> 3;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5711) Class238 local5711;
										if (arg0 == 3400) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											local5711 = Static561.aClass275_1.method6617(local13);
											aStringArray6[anInt1378++] = local5711.method5742(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt1382 -= 4;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											local25 = anIntArray106[anInt1382 + 2];
											local357 = anIntArray106[anInt1382 + 3];
											@Pc(5757) Class238 local5757 = Static561.aClass275_1.method6617(local25);
											if (local5757.aChar5 == local13 && local5757.aChar4 == local19) {
												if (local19 == 115) {
													aStringArray6[anInt1378++] = local5757.method5742(local357);
													return;
												}
												anIntArray106[anInt1382++] = local5757.method5736(local357);
												return;
											}
											throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
										}
										if (arg0 == 3409) {
											anInt1382 -= 3;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											local25 = anIntArray106[anInt1382 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5843) Class238 local5843 = Static561.aClass275_1.method6617(local19);
											if (local5843.aChar4 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray106[anInt1382++] = local5843.method5743(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray106[--anInt1382];
											local1161 = aStringArray6[--anInt1378];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5711 = Static561.aClass275_1.method6617(local13);
											if (local5711.aChar4 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray106[anInt1382++] = local5711.method5737(local1161) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray106[--anInt1382];
											@Pc(5941) Class238 local5941 = Static561.aClass275_1.method6617(local13);
											anIntArray106[anInt1382++] = local5941.aClass81_49.method1611();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static445.anInt7509 == 0) {
												anIntArray106[anInt1382++] = -2;
												return;
											}
											if (Static445.anInt7509 == 1) {
												anIntArray106[anInt1382++] = -1;
												return;
											}
											anIntArray106[anInt1382++] = Static74.anInt1238;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray106[--anInt1382];
											if (Static445.anInt7509 == 2 && local13 < Static74.anInt1238) {
												aStringArray6[anInt1378++] = Static182.aStringArray13[local13];
												if (Static228.aStringArray17[local13] != null) {
													aStringArray6[anInt1378++] = Static228.aStringArray17[local13];
													return;
												}
												aStringArray6[anInt1378++] = "";
												return;
											}
											aStringArray6[anInt1378++] = "";
											aStringArray6[anInt1378++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray106[--anInt1382];
											if (Static445.anInt7509 == 2 && local13 < Static74.anInt1238) {
												anIntArray106[anInt1382++] = Static484.anIntArray647[local13];
												return;
											}
											anIntArray106[anInt1382++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray106[--anInt1382];
											if (Static445.anInt7509 == 2 && local13 < Static74.anInt1238) {
												anIntArray106[anInt1382++] = Static42.anIntArray57[local13];
												return;
											}
											anIntArray106[anInt1382++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4042 = aStringArray6[--anInt1378];
											local19 = anIntArray106[--anInt1382];
											Static174.method2669(local19, local4042);
											return;
										}
										if (arg0 == 3605) {
											local4042 = aStringArray6[--anInt1378];
											Static553.method7806(local4042);
											return;
										}
										if (arg0 == 3606) {
											local4042 = aStringArray6[--anInt1378];
											Static396.method6147(local4042);
											return;
										}
										if (arg0 == 3607) {
											local4042 = aStringArray6[--anInt1378];
											Static421.method8910(local4042, false);
											return;
										}
										if (arg0 == 3608) {
											local4042 = aStringArray6[--anInt1378];
											Static268.method4078(local4042);
											return;
										}
										if (arg0 == 3609) {
											local4042 = aStringArray6[--anInt1378];
											if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
												local4042 = local4042.substring(7);
											}
											anIntArray106[anInt1382++] = Static14.method404(local4042) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray106[--anInt1382];
											if (Static445.anInt7509 == 2 && local13 < Static74.anInt1238) {
												aStringArray6[anInt1378++] = Static237.aStringArray18[local13];
												return;
											}
											aStringArray6[anInt1378++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static45.aString15 != null) {
												aStringArray6[anInt1378++] = Static545.method7733(Static45.aString15);
												return;
											}
											aStringArray6[anInt1378++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static45.aString15 != null) {
												anIntArray106[anInt1382++] = Static122.anInt1983;
												return;
											}
											anIntArray106[anInt1382++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray106[--anInt1382];
											if (Static45.aString15 != null && local13 < Static122.anInt1983) {
												aStringArray6[anInt1378++] = Static60.aClass231Array3[local13].aString98;
												return;
											}
											aStringArray6[anInt1378++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray106[--anInt1382];
											if (Static45.aString15 != null && local13 < Static122.anInt1983) {
												anIntArray106[anInt1382++] = Static60.aClass231Array3[local13].anInt6354;
												return;
											}
											anIntArray106[anInt1382++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray106[--anInt1382];
											if (Static45.aString15 != null && local13 < Static122.anInt1983) {
												anIntArray106[anInt1382++] = Static60.aClass231Array3[local13].aByte89;
												return;
											}
											anIntArray106[anInt1382++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray106[anInt1382++] = Static56.aByte15;
											return;
										}
										if (arg0 == 3617) {
											local4042 = aStringArray6[--anInt1378];
											Static171.method2649(local4042);
											return;
										}
										if (arg0 == 3618) {
											anIntArray106[anInt1382++] = Static3.aByte1;
											return;
										}
										if (arg0 == 3619) {
											local4042 = aStringArray6[--anInt1378];
											Static118.method1734(local4042);
											return;
										}
										if (arg0 == 3620) {
											Static629.method8713();
											return;
										}
										if (arg0 == 3621) {
											if (Static445.anInt7509 == 0) {
												anIntArray106[anInt1382++] = -1;
												return;
											}
											anIntArray106[anInt1382++] = Static310.anInt5466;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray106[--anInt1382];
											if (Static445.anInt7509 != 0 && local13 < Static310.anInt5466) {
												aStringArray6[anInt1378++] = Static368.aStringArray26[local13];
												if (Static107.aStringArray9[local13] != null) {
													aStringArray6[anInt1378++] = Static107.aStringArray9[local13];
													return;
												}
												aStringArray6[anInt1378++] = "";
												return;
											}
											aStringArray6[anInt1378++] = "";
											aStringArray6[anInt1378++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4042 = aStringArray6[--anInt1378];
											if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
												local4042 = local4042.substring(7);
											}
											anIntArray106[anInt1382++] = Static41.method724(local4042) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray106[--anInt1382];
											if (Static60.aClass231Array3 != null && local13 < Static122.anInt1983 && Static60.aClass231Array3[local13].aString99.equalsIgnoreCase(Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aString42)) {
												anIntArray106[anInt1382++] = 1;
												return;
											}
											anIntArray106[anInt1382++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static550.aString105 != null) {
												aStringArray6[anInt1378++] = Static550.aString105;
												return;
											}
											aStringArray6[anInt1378++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray106[--anInt1382];
											if (Static45.aString15 != null && local13 < Static122.anInt1983) {
												aStringArray6[anInt1378++] = Static60.aClass231Array3[local13].aString96;
												return;
											}
											aStringArray6[anInt1378++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray106[--anInt1382];
											if (Static445.anInt7509 == 2 && local13 >= 0 && local13 < Static74.anInt1238) {
												anIntArray106[anInt1382++] = Static338.aBooleanArray36[local13] ? 1 : 0;
												return;
											}
											anIntArray106[anInt1382++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4042 = aStringArray6[--anInt1378];
											if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
												local4042 = local4042.substring(7);
											}
											anIntArray106[anInt1382++] = Static529.method7564(local4042);
											return;
										}
										if (arg0 == 3629) {
											anIntArray106[anInt1382++] = Static178.anInt3170;
											return;
										}
										if (arg0 == 3630) {
											local4042 = aStringArray6[--anInt1378];
											Static421.method8910(local4042, true);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static497.aBooleanArray50[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray106[--anInt1382];
											if (Static45.aString15 != null && local13 < Static122.anInt1983) {
												aStringArray6[anInt1378++] = Static60.aClass231Array3[local13].aString99;
												return;
											}
											aStringArray6[anInt1378++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray106[--anInt1382];
											if (Static445.anInt7509 != 0 && local13 < Static310.anInt5466) {
												aStringArray6[anInt1378++] = Static55.aStringArray3[local13];
												return;
											}
											aStringArray6[anInt1378++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static328.aClass205Array1[local13].method4966();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static328.aClass205Array1[local13].anInt5529;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static328.aClass205Array1[local13].anInt5524;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static328.aClass205Array1[local13].anInt5532;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static328.aClass205Array1[local13].anInt5531;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static328.aClass205Array1[local13].anInt5526;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray106[--anInt1382];
											local19 = Static328.aClass205Array1[local13].method4967();
											anIntArray106[anInt1382++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray106[--anInt1382];
											local19 = Static328.aClass205Array1[local13].method4967();
											anIntArray106[anInt1382++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray106[--anInt1382];
											local19 = Static328.aClass205Array1[local13].method4967();
											anIntArray106[anInt1382++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray106[--anInt1382];
											local19 = Static328.aClass205Array1[local13].method4967();
											anIntArray106[anInt1382++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt1382 -= 5;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											local25 = anIntArray106[anInt1382 + 2];
											local357 = anIntArray106[anInt1382 + 3];
											local2373 = anIntArray106[anInt1382 + 4];
											anIntArray106[anInt1382++] = local13 + (local19 - local13) * (local2373 - local25) / (local357 - local25);
											return;
										}
										@Pc(7451) long local7451;
										@Pc(7444) long local7444;
										if (arg0 == 4007) {
											anInt1382 -= 2;
											local7444 = (long) anIntArray106[anInt1382];
											local7451 = (long) anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = (int) (local7444 + local7444 * local7451 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											if (local13 == 0) {
												anIntArray106[anInt1382++] = 0;
												return;
											}
											anIntArray106[anInt1382++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											if (local13 == 0) {
												anIntArray106[anInt1382++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray106[anInt1382++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray106[anInt1382++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt1382 -= 3;
											local7444 = (long) anIntArray106[anInt1382];
											local7451 = (long) anIntArray106[anInt1382 + 1];
											@Pc(7832) long local7832 = (long) anIntArray106[anInt1382 + 2];
											anIntArray106[anInt1382++] = (int) (local7444 * local7832 / local7451);
											return;
										}
										if (arg0 == 4019) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											if (local13 > 700 || local19 > 700) {
												anIntArray106[anInt1382++] = 256;
											}
											@Pc(7891) double local7891 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
											anIntArray106[anInt1382++] = (int) (Math.pow(2.0D, local7891) + 0.5D);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local4042 = aStringArray6[--anInt1378];
											local19 = anIntArray106[--anInt1382];
											aStringArray6[anInt1378++] = local4042 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt1378 -= 2;
											local4042 = aStringArray6[anInt1378];
											local1161 = aStringArray6[anInt1378 + 1];
											aStringArray6[anInt1378++] = local4042 + local1161;
											return;
										}
										if (arg0 == 4102) {
											local4042 = aStringArray6[--anInt1378];
											local19 = anIntArray106[--anInt1382];
											aStringArray6[anInt1378++] = local4042 + Static12.method233(local19, true);
											return;
										}
										if (arg0 == 4103) {
											local4042 = aStringArray6[--anInt1378];
											aStringArray6[anInt1378++] = local4042.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray6[anInt1378++] = Static499.method7316(Static321.anInt5554, Static301.method4384(anIntArray106[--anInt1382]));
											return;
										}
										if (arg0 == 4105) {
											anInt1378 -= 2;
											local4042 = aStringArray6[anInt1378];
											local1161 = aStringArray6[anInt1378 + 1];
											if (Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1 != null && Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1.aBoolean765) {
												aStringArray6[anInt1378++] = local1161;
												return;
											}
											aStringArray6[anInt1378++] = local4042;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray106[--anInt1382];
											aStringArray6[anInt1378++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt1378 -= 2;
											anIntArray106[anInt1382++] = Static356.method5615(aStringArray6[anInt1378], Static321.anInt5554, aStringArray6[anInt1378 + 1]);
											return;
										}
										@Pc(8178) Class298 local8178;
										if (arg0 == 4108) {
											local4042 = aStringArray6[--anInt1378];
											anInt1382 -= 2;
											local19 = anIntArray106[anInt1382];
											local25 = anIntArray106[anInt1382 + 1];
											local8178 = Static64.method1079(local25, Static288.aClass384_72);
											anIntArray106[anInt1382++] = local8178.method6963(local4042, Static184.aClass44Array8, local19);
											return;
										}
										if (arg0 == 4109) {
											local4042 = aStringArray6[--anInt1378];
											anInt1382 -= 2;
											local19 = anIntArray106[anInt1382];
											local25 = anIntArray106[anInt1382 + 1];
											local8178 = Static64.method1079(local25, Static288.aClass384_72);
											anIntArray106[anInt1382++] = local8178.method6967(local4042, Static184.aClass44Array8, local19);
											return;
										}
										if (arg0 == 4110) {
											anInt1378 -= 2;
											local4042 = aStringArray6[anInt1378];
											local1161 = aStringArray6[anInt1378 + 1];
											if (anIntArray106[--anInt1382] == 1) {
												aStringArray6[anInt1378++] = local4042;
												return;
											}
											aStringArray6[anInt1378++] = local1161;
											return;
										}
										if (arg0 == 4111) {
											local4042 = aStringArray6[--anInt1378];
											aStringArray6[anInt1378++] = Static441.method6571(local4042);
											return;
										}
										if (arg0 == 4112) {
											local4042 = aStringArray6[--anInt1378];
											local19 = anIntArray106[--anInt1382];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray6[anInt1378++] = local4042 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = method1323((char) local13);
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static233.method6787((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static633.method8763((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static522.method6796((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local4042 = aStringArray6[--anInt1378];
											if (local4042 != null) {
												anIntArray106[anInt1382++] = local4042.length();
												return;
											}
											anIntArray106[anInt1382++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local4042 = aStringArray6[--anInt1378];
											anInt1382 -= 2;
											local19 = anIntArray106[anInt1382];
											local25 = anIntArray106[anInt1382 + 1];
											aStringArray6[anInt1378++] = local4042.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local4042 = aStringArray6[--anInt1378];
											@Pc(8536) StringBuffer local8536 = new StringBuffer(local4042.length());
											@Pc(8538) boolean local8538 = false;
											for (local357 = 0; local357 < local4042.length(); local357++) {
												@Pc(8545) char local8545 = local4042.charAt(local357);
												if (local8545 == '<') {
													local8538 = true;
												} else if (local8545 == '>') {
													local8538 = false;
												} else if (!local8538) {
													local8536.append(local8545);
												}
											}
											aStringArray6[anInt1378++] = local8536.toString();
											return;
										}
										if (arg0 == 4120) {
											local4042 = aStringArray6[--anInt1378];
											anInt1382 -= 2;
											local19 = anIntArray106[anInt1382];
											local25 = anIntArray106[anInt1382 + 1];
											anIntArray106[anInt1382++] = local4042.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt1378 -= 2;
											local4042 = aStringArray6[anInt1378];
											local1161 = aStringArray6[anInt1378 + 1];
											local25 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = local4042.indexOf(local1161, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local420 = anIntArray106[--anInt1382] != 0;
											local19 = anIntArray106[--anInt1382];
											aStringArray6[anInt1378++] = Static617.method8523(0, (long) local19, Static321.anInt5554, local420);
											return;
										}
										if (arg0 == 4125) {
											local4042 = aStringArray6[--anInt1378];
											local19 = anIntArray106[--anInt1382];
											@Pc(8759) Class298 local8759 = Static64.method1079(local19, Static288.aClass384_72);
											anIntArray106[anInt1382++] = local8759.method6968(local4042, Static184.aClass44Array8);
											return;
										}
										if (arg0 == 4126) {
											aStringArray6[anInt1378++] = Static423.method6388(Static321.anInt5554, (long) anIntArray106[--anInt1382] * 60000L);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray106[--anInt1382];
											aStringArray6[anInt1378++] = Static479.aClass348_1.method8197(local13).aString127;
											return;
										}
										@Pc(8845) Class329 local8845;
										if (arg0 == 4201) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											local8845 = Static479.aClass348_1.method8197(local13);
											if (local19 >= 1 && local19 <= 5 && local8845.aStringArray36[local19 - 1] != null) {
												aStringArray6[anInt1378++] = local8845.aStringArray36[local19 - 1];
												return;
											}
											aStringArray6[anInt1378++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											local8845 = Static479.aClass348_1.method8197(local13);
											if (local19 >= 1 && local19 <= 5 && local8845.aStringArray35[local19 - 1] != null) {
												aStringArray6[anInt1378++] = local8845.aStringArray35[local19 - 1];
												return;
											}
											aStringArray6[anInt1378++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static479.aClass348_1.method8197(local13).anInt9078;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static479.aClass348_1.method8197(local13).anInt9090 == 1 ? 1 : 0;
											return;
										}
										@Pc(9008) Class329 local9008;
										if (arg0 == 4205) {
											local13 = anIntArray106[--anInt1382];
											local9008 = Static479.aClass348_1.method8197(local13);
											if (local9008.anInt9073 == -1 && local9008.anInt9060 >= 0) {
												anIntArray106[anInt1382++] = local9008.anInt9060;
												return;
											}
											anIntArray106[anInt1382++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray106[--anInt1382];
											local9008 = Static479.aClass348_1.method8197(local13);
											if (local9008.anInt9073 >= 0 && local9008.anInt9060 >= 0) {
												anIntArray106[anInt1382++] = local9008.anInt9060;
												return;
											}
											anIntArray106[anInt1382++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static479.aClass348_1.method8197(local13).aBoolean738 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											local3107 = Static246.aClass258_1.method6202(local19);
											if (local3107.method5600()) {
												aStringArray6[anInt1378++] = Static479.aClass348_1.method8197(local13).method7760(local3107.aString95, local19);
												return;
											}
											anIntArray106[anInt1382++] = Static479.aClass348_1.method8197(local13).method7763(local3107.anInt6315, local19);
											return;
										}
										if (arg0 == 4209) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1] - 1;
											local8845 = Static479.aClass348_1.method8197(local13);
											if (local8845.anInt9034 == local19) {
												anIntArray106[anInt1382++] = local8845.anInt9058;
												return;
											}
											if (local8845.anInt9057 == local19) {
												anIntArray106[anInt1382++] = local8845.anInt9089;
												return;
											}
											anIntArray106[anInt1382++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local4042 = aStringArray6[--anInt1378];
											local19 = anIntArray106[--anInt1382];
											Static84.method1336(local19 == 1, local4042);
											anIntArray106[anInt1382++] = Static282.anInt4637;
											return;
										}
										if (arg0 == 4211) {
											if (Static39.aShortArray15 != null && Static273.anInt4520 < Static282.anInt4637) {
												anIntArray106[anInt1382++] = Static39.aShortArray15[Static273.anInt4520++] & 0xFFFF;
												return;
											}
											anIntArray106[anInt1382++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static273.anInt4520 = 0;
											return;
										}
										if (arg0 == 4213) {
											local13 = anIntArray106[--anInt1382];
											anIntArray106[anInt1382++] = Static479.aClass348_1.method8197(local13).anInt9096;
											return;
										}
										if (arg0 == 4214) {
											local4042 = aStringArray6[--anInt1378];
											anInt1382 -= 3;
											local19 = anIntArray106[anInt1382];
											local25 = anIntArray106[anInt1382 + 1];
											local357 = anIntArray106[anInt1382 + 2];
											Static586.method8215(local4042, local25, local357, local19 == 1);
											anIntArray106[anInt1382++] = Static282.anInt4637;
											return;
										}
										if (arg0 == 4215) {
											anInt1378 -= 2;
											anInt1382 -= 2;
											local4042 = aStringArray6[anInt1378];
											local19 = anIntArray106[anInt1382];
											local25 = anIntArray106[anInt1382 + 1];
											@Pc(9407) String local9407 = aStringArray6[anInt1378 + 1];
											Static234.method3618(local9407, local19 == 1, local25, local4042);
											anIntArray106[anInt1382++] = Static282.anInt4637;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											local3107 = Static246.aClass258_1.method6202(local19);
											if (local3107.method5600()) {
												aStringArray6[anInt1378++] = Static258.aClass138_1.method3202(local13).method6478(local19, local3107.aString95);
												return;
											}
											anIntArray106[anInt1382++] = Static258.aClass138_1.method3202(local13).method6483(local3107.anInt6315, local19);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											local3107 = Static246.aClass258_1.method6202(local19);
											if (local3107.method5600()) {
												aStringArray6[anInt1378++] = Static525.aClass371_4.method8554(local13).method6855(local3107.aString95, local19);
												return;
											}
											anIntArray106[anInt1382++] = Static525.aClass371_4.method8554(local13).method6850(local3107.anInt6315, local19);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt1382 -= 2;
											local13 = anIntArray106[anInt1382];
											local19 = anIntArray106[anInt1382 + 1];
											local3107 = Static246.aClass258_1.method6202(local19);
											if (local3107.method5600()) {
												aStringArray6[anInt1378++] = Static320.aClass133_1.method3127(local13).method2974(local19, local3107.aString95);
												return;
											}
											anIntArray106[anInt1382++] = Static320.aClass133_1.method3127(local13).method2978(local3107.anInt6315, local19);
											return;
										}
									} else if (arg0 < 4700) {
										if (arg0 == 4600) {
											local13 = anIntArray106[--anInt1382];
											@Pc(9635) Class295 local9635 = Static608.aClass151_1.method3578(local13);
											if (local9635.anIntArray641 != null && local9635.anIntArray641.length > 0) {
												local25 = 0;
												local357 = local9635.anIntArray642[0];
												for (local2373 = 1; local2373 < local9635.anIntArray641.length; local2373++) {
													if (local9635.anIntArray642[local2373] > local357) {
														local25 = local2373;
														local357 = local9635.anIntArray642[local2373];
													}
												}
												anIntArray106[anInt1382++] = local9635.anIntArray641[local25];
												return;
											}
											anIntArray106[anInt1382++] = local9635.anInt7990;
											return;
										}
									} else if (arg0 < 4800) {
										if (arg0 == 4700) {
											anIntArray106[anInt1382++] = Static539.aBoolean735 ? 1 : 0;
											return;
										}
										if (arg0 == 4701) {
											local4042 = aStringArray6[--anInt1378];
											if (Static469.anInt7883 == 7 && Static548.anInt9084 == 0) {
												if (local4042.length() > 20) {
													Static7.aByte4 = -4;
													return;
												}
												local4131 = Static25.method507(Static98.aClass208_2, Static571.aClass181_87);
												local4131.aClass5_Sub12_Sub2_2.method8619(local4042);
												Static612.method8496(local4131);
												return;
											}
											Static7.aByte4 = -5;
											return;
										}
										if (arg0 == 4702) {
											anIntArray106[anInt1382++] = Static7.aByte4;
											Static7.aByte4 = -1;
											return;
										}
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static472.method6903(anIntArray106[--anInt1382]);
						} else {
							local137 = arg1 ? aClass357_5 : aClass357_4;
						}
						if (arg0 == 1300) {
							local19 = anIntArray106[--anInt1382] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method8390(aStringArray6[--anInt1378], local19);
								return;
							}
							anInt1378--;
							return;
						}
						if (arg0 == 1301) {
							anInt1382 -= 2;
							local19 = anIntArray106[anInt1382];
							local25 = anIntArray106[anInt1382 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass357_13 = null;
								return;
							}
							local137.aClass357_13 = Static318.method4971(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray106[--anInt1382];
							if (local19 != Static129.anInt6339 && local19 != Static76.anInt1277 && local19 != Static199.anInt8059) {
								return;
							}
							local137.anInt9862 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt9805 = anIntArray106[--anInt1382];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt9789 = anIntArray106[--anInt1382];
							return;
						}
						if (arg0 == 1305) {
							local137.aString138 = aStringArray6[--anInt1378];
							return;
						}
						if (arg0 == 1306) {
							local137.aString141 = aStringArray6[--anInt1378];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray43 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt9823 = anIntArray106[--anInt1382];
							local137.anInt9822 = anIntArray106[--anInt1382];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray106[--anInt1382];
							local25 = anIntArray106[--anInt1382];
							if (local25 >= 1 && local25 <= 10) {
								local137.method8384(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString142 = aStringArray6[--anInt1378];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt9835 = anIntArray106[--anInt1382];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt1382 -= 3;
								local19 = anIntArray106[anInt1382] - 1;
								local25 = anIntArray106[anInt1382 + 1];
								local357 = anIntArray106[anInt1382 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt1382 -= 2;
								local19 = 10;
								local25 = anIntArray106[anInt1382];
								local357 = anIntArray106[anInt1382 + 1];
							}
							if (local137.aByteArray99 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray99 = new byte[11];
								local137.aByteArray100 = new byte[11];
								local137.anIntArray791 = new int[11];
							}
							local137.aByteArray99[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean799 = false;
								for (local2373 = 0; local2373 < local137.aByteArray99.length; local2373++) {
									if (local137.aByteArray99[local2373] != 0) {
										local137.aBoolean799 = true;
										break;
									}
								}
							} else {
								local137.aBoolean799 = true;
							}
							local137.aByteArray100[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt9834 = anIntArray106[--anInt1382];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static472.method6903(anIntArray106[--anInt1382]);
					} else {
						local137 = arg1 ? aClass357_5 : aClass357_4;
					}
					Static637.method8778(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt1382 -= 2;
						local19 = anIntArray106[anInt1382];
						local25 = anIntArray106[anInt1382 + 1];
						if (local137.anInt9846 == -1) {
							Static506.method2915(local137.anInt9804);
							Static15.method423(local137.anInt9804);
							Static639.method8795(local137.anInt9804);
						}
						if (local19 == -1) {
							local137.anInt9796 = 1;
							local137.anInt9817 = -1;
							local137.anInt9871 = -1;
							return;
						}
						local137.anInt9871 = local19;
						local137.anInt9815 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean800 = true;
						} else {
							local137.aBoolean800 = false;
						}
						@Pc(1713) Class329 local1713 = Static479.aClass348_1.method8197(local19);
						local137.anInt9849 = local1713.anInt9098;
						local137.anInt9788 = local1713.anInt9068;
						local137.anInt9831 = local1713.anInt9074;
						local137.anInt9825 = local1713.anInt9043;
						local137.anInt9865 = local1713.anInt9053;
						local137.anInt9873 = local1713.anInt9039;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt9816 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt9816 = 1;
						} else {
							local137.anInt9816 = 2;
						}
						if (local137.anInt9845 > 0) {
							local137.anInt9873 = local137.anInt9873 * 32 / local137.anInt9845;
							return;
						}
						if (local137.anInt9840 > 0) {
							local137.anInt9873 = local137.anInt9873 * 32 / local137.anInt9840;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt9796 = 2;
						local137.anInt9817 = anIntArray106[--anInt1382];
						if (local137.anInt9846 == -1) {
							Static450.method6698(local137.anInt9804);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt9796 = 3;
						local137.anInt9817 = -1;
						if (local137.anInt9846 == -1) {
							Static450.method6698(local137.anInt9804);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt9796 = 6;
						local137.anInt9817 = anIntArray106[--anInt1382];
						if (local137.anInt9846 == -1) {
							Static450.method6698(local137.anInt9804);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt9796 = 5;
						local137.anInt9817 = anIntArray106[--anInt1382];
						if (local137.anInt9846 == -1) {
							Static450.method6698(local137.anInt9804);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt1382 -= 4;
						local137.anInt9832 = anIntArray106[anInt1382];
						local137.anInt9824 = anIntArray106[anInt1382 + 1];
						local137.anInt9878 = anIntArray106[anInt1382 + 2];
						local137.anInt9881 = anIntArray106[anInt1382 + 3];
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt1382 -= 2;
						local137.anInt9795 = anIntArray106[anInt1382];
						local137.anInt9850 = anIntArray106[anInt1382 + 1];
						Static637.method8778(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt1382 -= 4;
						local137.anInt9817 = anIntArray106[anInt1382];
						local137.anInt9856 = anIntArray106[anInt1382 + 1];
						if (anIntArray106[anInt1382 + 2] == 1) {
							local137.anInt9796 = 9;
						} else {
							local137.anInt9796 = 8;
						}
						if (anIntArray106[anInt1382 + 3] == 1) {
							local137.aBoolean800 = true;
						} else {
							local137.aBoolean800 = false;
						}
						if (local137.anInt9846 == -1) {
							Static450.method6698(local137.anInt9804);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt9796 = 5;
						local137.anInt9817 = Static620.anInt10055;
						local137.anInt9856 = 0;
						if (local137.anInt9846 == -1) {
							Static450.method6698(local137.anInt9804);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static472.method6903(anIntArray106[--anInt1382]);
				} else {
					local137 = arg1 ? aClass357_5 : aClass357_4;
				}
				if (arg0 == 1000) {
					anInt1382 -= 4;
					local137.anInt9851 = anIntArray106[anInt1382];
					local137.anInt9801 = anIntArray106[anInt1382 + 1];
					local19 = anIntArray106[anInt1382 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray106[anInt1382 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte133 = (byte) local19;
					local137.aByte132 = (byte) local25;
					Static637.method8778(local137);
					Static141.method2115(local137);
					if (local137.anInt9846 == -1) {
						Static221.method3412(local137.anInt9804);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt1382 -= 4;
					local137.anInt9840 = anIntArray106[anInt1382];
					local137.anInt9794 = anIntArray106[anInt1382 + 1];
					local137.anInt9845 = 0;
					local137.anInt9848 = 0;
					local19 = anIntArray106[anInt1382 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray106[anInt1382 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte131 = (byte) local19;
					local137.aByte134 = (byte) local25;
					Static637.method8778(local137);
					Static141.method2115(local137);
					if (local137.anInt9828 == 0) {
						Static101.method1475(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray106[--anInt1382] == 1;
					if (local137.aBoolean797 != local661) {
						local137.aBoolean797 = local661;
						Static637.method8778(local137);
					}
					if (local137.anInt9846 == -1) {
						Static611.method8491(local137.anInt9804);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt1382 -= 2;
					local137.anInt9786 = anIntArray106[anInt1382];
					local137.anInt9792 = anIntArray106[anInt1382 + 1];
					Static637.method8778(local137);
					Static141.method2115(local137);
					if (local137.anInt9828 == 0) {
						Static101.method1475(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean793 = anIntArray106[--anInt1382] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)V")
	private static void method1328(@OriginalArg(0) int arg0) {
		@Pc(3) Class357 local3 = Static472.method6903(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class357[] local13 = Static591.aClass357ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class357[] local19 = Static441.aClass357ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static591.aClass357ArrayArray2[local9] = new Class357[local22];
			Static655.method4106(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static655.method4106(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}
}
