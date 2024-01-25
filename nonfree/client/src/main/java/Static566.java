import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "Lclient!ps;")
	private static Class273 aClass273_12;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "[I")
	private static int[] anIntArray600;

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "Lclient!ps;")
	private static Class273 aClass273_13;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "Lclient!lea;")
	private static Class205 aClass205_1;

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray41;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
	private static int anInt9253 = 0;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray40 = new String[1000];

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
	private static int anInt9261 = 0;

	@OriginalMember(owner = "client!vm", name = "q", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "[I")
	private static final int[] anIntArray601 = new int[5];

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
	private static int anInt9262 = 0;

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "[I")
	private static final int[] anIntArray602 = new int[1000];

	@OriginalMember(owner = "client!vm", name = "u", descriptor = "[[I")
	private static final int[][] anIntArrayArray63 = new int[5][5000];

	@OriginalMember(owner = "client!vm", name = "w", descriptor = "[Lclient!hp;")
	private static final Class147[] aClass147Array1 = new Class147[50];

	@OriginalMember(owner = "client!vm", name = "z", descriptor = "Lclient!au;")
	public static final Class21 aClass21_91 = new Class21(4);

	@OriginalMember(owner = "client!vm", name = "A", descriptor = "[I")
	private static final int[] anIntArray603 = new int[3];

	@OriginalMember(owner = "client!vm", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray42 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!vm", name = "C", descriptor = "I")
	private static int anInt9266 = 0;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZ)V")
	private static void method7390(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class2_Sub34 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray602[anInt9261++] = Static190.anInt2789;
				return;
			}
			if (arg0 == 5001) {
				anInt9261 -= 3;
				Static190.anInt2789 = anIntArray602[anInt9261];
				Static134.aClass68_1 = Static428.method5681(anIntArray602[anInt9261 + 1]);
				if (Static134.aClass68_1 == null) {
					Static134.aClass68_1 = Static149.aClass68_2;
				}
				Static389.anInt6418 = anIntArray602[anInt9261 + 2];
				local52 = Static555.method7264(Static514.aClass154_117, Static551.aClass64_2);
				local52.aClass2_Sub7_Sub2_2.method4459(Static190.anInt2789);
				local52.aClass2_Sub7_Sub2_2.method4459(Static134.aClass68_1.anInt1398);
				local52.aClass2_Sub7_Sub2_2.method4459(Static389.anInt6418);
				Static100.method1508(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt9253 -= 2;
				local83 = aStringArray40[anInt9253];
				local89 = aStringArray40[anInt9253 + 1];
				anInt9261 -= 2;
				local97 = anIntArray602[anInt9261];
				local103 = anIntArray602[anInt9261 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class2_Sub34 local125 = Static555.method7264(Static429.aClass154_94, Static551.aClass64_2);
				local125.aClass2_Sub7_Sub2_2.method4459(Static474.method6143(local83) + Static474.method6143(local89) + 2);
				local125.aClass2_Sub7_Sub2_2.method4481(local83);
				local125.aClass2_Sub7_Sub2_2.method4459(local97 - 1);
				local125.aClass2_Sub7_Sub2_2.method4459(local103);
				local125.aClass2_Sub7_Sub2_2.method4481(local89);
				Static100.method1508(local125);
				return;
			}
			@Pc(179) Class243 local179;
			if (arg0 == 5003) {
				local175 = anIntArray602[--anInt9261];
				local179 = Static159.method2136(local175);
				local181 = "";
				if (local179 != null && local179.aString85 != null) {
					local181 = local179.aString85;
				}
				aStringArray40[anInt9253++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray602[--anInt9261];
				local179 = Static159.method2136(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt6133;
				}
				anIntArray602[anInt9261++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static134.aClass68_1 == null) {
					anIntArray602[anInt9261++] = -1;
					return;
				}
				anIntArray602[anInt9261++] = Static134.aClass68_1.anInt1398;
				return;
			}
			@Pc(269) Class2_Sub34 local269;
			if (arg0 == 5006) {
				local175 = anIntArray602[--anInt9261];
				local269 = Static555.method7264(Static532.aClass154_122, Static551.aClass64_2);
				local269.aClass2_Sub7_Sub2_2.method4459(local175);
				Static100.method1508(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray40[--anInt9253];
				method7397(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt9253 -= 2;
				local83 = aStringArray40[anInt9253];
				local89 = aStringArray40[anInt9253 + 1];
				if (Static11.anInt294 != 0 || (!Static183.aBoolean193 || Static438.aBoolean578) && !Static395.aBoolean806) {
					@Pc(328) Class2_Sub34 local328 = Static555.method7264(Static40.aClass154_6, Static551.aClass64_2);
					local328.aClass2_Sub7_Sub2_2.method4459(0);
					local103 = local328.aClass2_Sub7_Sub2_2.anInt5186;
					local328.aClass2_Sub7_Sub2_2.method4481(local83);
					Static138.method1906(local89, local328.aClass2_Sub7_Sub2_2);
					local328.aClass2_Sub7_Sub2_2.method4491(local328.aClass2_Sub7_Sub2_2.anInt5186 - local103);
					Static100.method1508(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray602[--anInt9261];
				local179 = Static159.method2136(local175);
				local181 = "";
				if (local179 != null && local179.aString83 != null) {
					local181 = local179.aString83;
				}
				aStringArray40[anInt9253++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray602[--anInt9261];
				local179 = Static159.method2136(local175);
				local181 = "";
				if (local179 != null && local179.aString86 != null) {
					local181 = local179.aString86;
				}
				aStringArray40[anInt9253++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray602[--anInt9261];
				local179 = Static159.method2136(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt6132;
				}
				anIntArray602[anInt9261++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 == null || Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aString76 == null) {
					local83 = Static64.aString14;
				} else {
					local83 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.method4906();
				}
				aStringArray40[anInt9253++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray602[anInt9261++] = Static389.anInt6418;
				return;
			}
			if (arg0 == 5017) {
				anIntArray602[anInt9261++] = Static81.method7198();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray602[--anInt9261];
				local179 = Static159.method2136(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt6130;
				}
				anIntArray602[anInt9261++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray602[--anInt9261];
				local179 = Static159.method2136(local175);
				local181 = "";
				if (local179 != null && local179.aString87 != null) {
					local181 = local179.aString87;
				}
				aStringArray40[anInt9253++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 == null || Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aString76 == null) {
					local83 = Static64.aString14;
				} else {
					local83 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.method4902();
				}
				aStringArray40[anInt9253++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray602[--anInt9261];
				local179 = Static159.method2136(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt6129;
				}
				anIntArray602[anInt9261++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray602[--anInt9261];
				local179 = Static159.method2136(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt6131;
				}
				anIntArray602[anInt9261++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray602[--anInt9261];
				local179 = Static159.method2136(local175);
				local181 = "";
				if (local179 != null && local179.aString84 != null) {
					local181 = local179.aString84;
				}
				aStringArray40[anInt9253++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray602[--anInt9261];
				aStringArray40[anInt9253++] = Static25.aClass23_1.method361(local175).aString1;
				return;
			}
			@Pc(736) Class2_Sub2_Sub1 local736;
			if (arg0 == 5051) {
				local175 = anIntArray602[--anInt9261];
				local736 = Static25.aClass23_1.method361(local175);
				if (local736.anIntArray5 == null) {
					anIntArray602[anInt9261++] = 0;
					return;
				}
				anIntArray602[anInt9261++] = local736.anIntArray5.length;
				return;
			}
			if (arg0 == 5052) {
				anInt9261 -= 2;
				local175 = anIntArray602[anInt9261];
				local776 = anIntArray602[anInt9261 + 1];
				@Pc(781) Class2_Sub2_Sub1 local781 = Static25.aClass23_1.method361(local175);
				local103 = local781.anIntArray5[local776];
				anIntArray602[anInt9261++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray602[--anInt9261];
				local736 = Static25.aClass23_1.method361(local175);
				if (local736.anIntArray4 == null) {
					anIntArray602[anInt9261++] = 0;
					return;
				}
				anIntArray602[anInt9261++] = local736.anIntArray4.length;
				return;
			}
			if (arg0 == 5054) {
				anInt9261 -= 2;
				local175 = anIntArray602[anInt9261];
				local776 = anIntArray602[anInt9261 + 1];
				anIntArray602[anInt9261++] = Static25.aClass23_1.method361(local175).anIntArray4[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray602[--anInt9261];
				aStringArray40[anInt9253++] = Static330.aClass227_2.method4797(local175).method4792();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray602[--anInt9261];
				@Pc(907) Class2_Sub2_Sub13 local907 = Static330.aClass227_2.method4797(local175);
				if (local907.anIntArray375 == null) {
					anIntArray602[anInt9261++] = 0;
					return;
				}
				anIntArray602[anInt9261++] = local907.anIntArray375.length;
				return;
			}
			if (arg0 == 5057) {
				anInt9261 -= 2;
				local175 = anIntArray602[anInt9261];
				local776 = anIntArray602[anInt9261 + 1];
				anIntArray602[anInt9261++] = Static330.aClass227_2.method4797(local175).anIntArray375[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass205_1 = new Class205();
				aClass205_1.anInt5024 = anIntArray602[--anInt9261];
				aClass205_1.aClass2_Sub2_Sub13_1 = Static330.aClass227_2.method4797(aClass205_1.anInt5024);
				aClass205_1.anIntArray348 = new int[aClass205_1.aClass2_Sub2_Sub13_1.method4788()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static555.method7264(Static314.aClass154_106, Static551.aClass64_2);
				local52.aClass2_Sub7_Sub2_2.method4459(0);
				local776 = local52.aClass2_Sub7_Sub2_2.anInt5186;
				local52.aClass2_Sub7_Sub2_2.method4459(0);
				local52.aClass2_Sub7_Sub2_2.method4511(aClass205_1.anInt5024);
				aClass205_1.aClass2_Sub2_Sub13_1.method4793(local52.aClass2_Sub7_Sub2_2, aClass205_1.anIntArray348);
				local52.aClass2_Sub7_Sub2_2.method4491(local52.aClass2_Sub7_Sub2_2.anInt5186 - local776);
				Static100.method1508(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray40[--anInt9253];
				local269 = Static555.method7264(Static432.aClass154_96, Static551.aClass64_2);
				local269.aClass2_Sub7_Sub2_2.method4459(0);
				local97 = local269.aClass2_Sub7_Sub2_2.anInt5186;
				local269.aClass2_Sub7_Sub2_2.method4481(local83);
				local269.aClass2_Sub7_Sub2_2.method4511(aClass205_1.anInt5024);
				aClass205_1.aClass2_Sub2_Sub13_1.method4793(local269.aClass2_Sub7_Sub2_2, aClass205_1.anIntArray348);
				local269.aClass2_Sub7_Sub2_2.method4491(local269.aClass2_Sub7_Sub2_2.anInt5186 - local97);
				Static100.method1508(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static555.method7264(Static314.aClass154_106, Static551.aClass64_2);
				local52.aClass2_Sub7_Sub2_2.method4459(0);
				local776 = local52.aClass2_Sub7_Sub2_2.anInt5186;
				local52.aClass2_Sub7_Sub2_2.method4459(1);
				local52.aClass2_Sub7_Sub2_2.method4511(aClass205_1.anInt5024);
				aClass205_1.aClass2_Sub2_Sub13_1.method4793(local52.aClass2_Sub7_Sub2_2, aClass205_1.anIntArray348);
				local52.aClass2_Sub7_Sub2_2.method4491(local52.aClass2_Sub7_Sub2_2.anInt5186 - local776);
				Static100.method1508(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt9261 -= 2;
				local175 = anIntArray602[anInt9261];
				local776 = anIntArray602[anInt9261 + 1];
				anIntArray602[anInt9261++] = Static25.aClass23_1.method361(local175).aCharArray1[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt9261 -= 2;
				local175 = anIntArray602[anInt9261];
				local776 = anIntArray602[anInt9261 + 1];
				anIntArray602[anInt9261++] = Static25.aClass23_1.method361(local175).aCharArray2[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt9261 -= 2;
				local175 = anIntArray602[anInt9261];
				local776 = anIntArray602[anInt9261 + 1];
				if (local776 == -1) {
					anIntArray602[anInt9261++] = -1;
					return;
				}
				anIntArray602[anInt9261++] = Static25.aClass23_1.method361(local175).method57((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt9261 -= 2;
				local175 = anIntArray602[anInt9261];
				local776 = anIntArray602[anInt9261 + 1];
				if (local776 == -1) {
					anIntArray602[anInt9261++] = -1;
					return;
				}
				anIntArray602[anInt9261++] = Static25.aClass23_1.method361(local175).method56((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray602[--anInt9261];
				anIntArray602[anInt9261++] = Static330.aClass227_2.method4797(local175).method4788();
				return;
			}
			if (arg0 == 5067) {
				anInt9261 -= 2;
				local175 = anIntArray602[anInt9261];
				local776 = anIntArray602[anInt9261 + 1];
				local97 = Static330.aClass227_2.method4797(local175).method4786(local776).anInt1356;
				anIntArray602[anInt9261++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt9261 -= 2;
				local175 = anIntArray602[anInt9261];
				local776 = anIntArray602[anInt9261 + 1];
				aClass205_1.anIntArray348[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt9261 -= 2;
				local175 = anIntArray602[anInt9261];
				local776 = anIntArray602[anInt9261 + 1];
				aClass205_1.anIntArray348[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt9261 -= 3;
				local175 = anIntArray602[anInt9261];
				local776 = anIntArray602[anInt9261 + 1];
				local97 = anIntArray602[anInt9261 + 2];
				@Pc(1448) Class2_Sub2_Sub13 local1448 = Static330.aClass227_2.method4797(local175);
				if (local1448.method4786(local776).anInt1356 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray602[anInt9261++] = local1448.method4794(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray40[--anInt9253];
				local1496 = anIntArray602[--anInt9261] == 1;
				Static229.method2777(local83, local1496);
				anIntArray602[anInt9261++] = Static380.anInt8020;
				return;
			}
			if (arg0 == 5072) {
				if (Static496.aShortArray121 != null && Static507.anInt8114 < Static380.anInt8020) {
					anIntArray602[anInt9261++] = Static496.aShortArray121[Static507.anInt8114++] & 0xFFFF;
					return;
				}
				anIntArray602[anInt9261++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static507.anInt8114 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static106.aClass150_3.method2632(86)) {
					anIntArray602[anInt9261++] = 1;
					return;
				}
				anIntArray602[anInt9261++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static106.aClass150_3.method2632(82)) {
					anIntArray602[anInt9261++] = 1;
					return;
				}
				anIntArray602[anInt9261++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static106.aClass150_3.method2632(81)) {
					anIntArray602[anInt9261++] = 1;
					return;
				}
				anIntArray602[anInt9261++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static249.method3548(anIntArray602[--anInt9261]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray602[anInt9261++] = Static15.method250();
					return;
				}
				if (arg0 == 5205) {
					Static160.method2138(-1, anIntArray602[--anInt9261], false, -1);
					return;
				}
				@Pc(1696) Class2_Sub2_Sub9 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray602[--anInt9261];
					local1696 = Static476.method6105(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray602[anInt9261++] = -1;
						return;
					}
					anIntArray602[anInt9261++] = local1696.anInt3270;
					return;
				}
				@Pc(1729) Class2_Sub2_Sub9 local1729;
				if (arg0 == 5207) {
					local1729 = Static476.method6104(anIntArray602[--anInt9261]);
					if (local1729 != null && local1729.aString46 != null) {
						aStringArray40[anInt9253++] = local1729.aString46;
						return;
					}
					aStringArray40[anInt9253++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray602[anInt9261++] = Static50.anInt903;
					anIntArray602[anInt9261++] = Static367.anInt6180;
					return;
				}
				if (arg0 == 5209) {
					anIntArray602[anInt9261++] = Static26.anInt449 + Static476.anInt7583;
					anIntArray602[anInt9261++] = Static366.anInt6166 + Static476.anInt7584;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray602[--anInt9261];
					local1696 = Static476.method6104(local175);
					if (local1696 == null) {
						anIntArray602[anInt9261++] = 0;
						anIntArray602[anInt9261++] = 0;
						return;
					}
					anIntArray602[anInt9261++] = local1696.anInt3271 >> 14 & 0x3FFF;
					anIntArray602[anInt9261++] = local1696.anInt3271 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray602[--anInt9261];
					local1696 = Static476.method6104(local175);
					if (local1696 == null) {
						anIntArray602[anInt9261++] = 0;
						anIntArray602[anInt9261++] = 0;
						return;
					}
					anIntArray602[anInt9261++] = local1696.anInt3267 - local1696.anInt3266;
					anIntArray602[anInt9261++] = local1696.anInt3269 - local1696.anInt3273;
					return;
				}
				@Pc(1919) Class2_Sub20 local1919;
				if (arg0 == 5212) {
					local1919 = Static26.method357();
					if (local1919 == null) {
						anIntArray602[anInt9261++] = -1;
						anIntArray602[anInt9261++] = -1;
						return;
					}
					anIntArray602[anInt9261++] = local1919.anInt2970;
					local776 = local1919.anInt2972 << 28 | local1919.anInt2971 + Static476.anInt7583 << 14 | local1919.anInt2973 + Static476.anInt7584;
					anIntArray602[anInt9261++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static130.method1765();
					if (local1919 == null) {
						anIntArray602[anInt9261++] = -1;
						anIntArray602[anInt9261++] = -1;
						return;
					}
					anIntArray602[anInt9261++] = local1919.anInt2970;
					local776 = local1919.anInt2972 << 28 | local1919.anInt2971 + Static476.anInt7583 << 14 | local1919.anInt2973 + Static476.anInt7584;
					anIntArray602[anInt9261++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray602[--anInt9261];
					local1696 = Static255.method3642();
					if (local1696 != null) {
						local2067 = local1696.method2734(local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF, local175 & 0x3FFF, anIntArray603);
						if (local2067) {
							Static446.method5835(anIntArray603[1], anIntArray603[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt9261 -= 2;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					@Pc(2105) Class253 local2105 = Static476.method6116(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class2_Sub2_Sub9 local2112 = (Class2_Sub2_Sub9) local2105.method5321(); local2112 != null; local2112 = (Class2_Sub2_Sub9) local2105.method5323()) {
						if (local2112.anInt3270 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray602[anInt9261++] = 1;
						return;
					}
					anIntArray602[anInt9261++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray602[--anInt9261];
					local1696 = Static476.method6104(local175);
					if (local1696 == null) {
						anIntArray602[anInt9261++] = -1;
						return;
					}
					anIntArray602[anInt9261++] = local1696.anInt3275;
					return;
				}
				if (arg0 == 5220) {
					anIntArray602[anInt9261++] = Static559.anInt9135 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray602[--anInt9261];
					Static446.method5835(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static255.method3642();
					if (local1729 != null) {
						local1496 = local1729.method2731(anIntArray603, Static366.anInt6166 + Static476.anInt7584, Static26.anInt449 + Static476.anInt7583);
						if (local1496) {
							anIntArray602[anInt9261++] = anIntArray603[1];
							anIntArray602[anInt9261++] = anIntArray603[2];
							return;
						}
						anIntArray602[anInt9261++] = -1;
						anIntArray602[anInt9261++] = -1;
						return;
					}
					anIntArray602[anInt9261++] = -1;
					anIntArray602[anInt9261++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt9261 -= 2;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					Static160.method2138(local776 & 0x3FFF, local175, false, local776 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray602[--anInt9261];
					local1696 = Static255.method3642();
					if (local1696 != null) {
						local2067 = local1696.method2734(local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF, local175 & 0x3FFF, anIntArray603);
						if (local2067) {
							anIntArray602[anInt9261++] = anIntArray603[1];
							anIntArray602[anInt9261++] = anIntArray603[2];
							return;
						}
						anIntArray602[anInt9261++] = -1;
						anIntArray602[anInt9261++] = -1;
						return;
					}
					anIntArray602[anInt9261++] = -1;
					anIntArray602[anInt9261++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray602[--anInt9261];
					local1696 = Static255.method3642();
					if (local1696 != null) {
						local2067 = local1696.method2731(anIntArray603, local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
						if (local2067) {
							anIntArray602[anInt9261++] = anIntArray603[1];
							anIntArray602[anInt9261++] = anIntArray603[2];
							return;
						}
						anIntArray602[anInt9261++] = -1;
						anIntArray602[anInt9261++] = -1;
						return;
					}
					anIntArray602[anInt9261++] = -1;
					anIntArray602[anInt9261++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static197.method2478(anIntArray602[--anInt9261]);
					return;
				}
				if (arg0 == 5227) {
					anInt9261 -= 2;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					Static160.method2138(local776 & 0x3FFF, local175, true, local776 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static138.aBoolean159 = anIntArray602[--anInt9261] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray602[anInt9261++] = Static138.aBoolean159 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray602[--anInt9261];
					Static24.method349(local175);
					return;
				}
				@Pc(2625) Class2 local2625;
				if (arg0 == 5231) {
					anInt9261 -= 2;
					local175 = anIntArray602[anInt9261];
					local1496 = anIntArray602[anInt9261 + 1] == 1;
					if (Static269.aClass90_12 != null) {
						local2625 = Static269.aClass90_12.method1685((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method7657();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class2();
							Static269.aClass90_12.method1684(local2625, (long) local175);
						}
					}
					return;
				}
				@Pc(2667) Class2 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray602[--anInt9261];
					if (Static269.aClass90_12 != null) {
						local2667 = Static269.aClass90_12.method1685((long) local175);
						anIntArray602[anInt9261++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray602[anInt9261++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt9261 -= 2;
					local175 = anIntArray602[anInt9261];
					local1496 = anIntArray602[anInt9261 + 1] == 1;
					if (Static495.aClass90_34 != null) {
						local2625 = Static495.aClass90_34.method1685((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method7657();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class2();
							Static495.aClass90_34.method1684(local2625, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray602[--anInt9261];
					if (Static495.aClass90_34 != null) {
						local2667 = Static495.aClass90_34.method1685((long) local175);
						anIntArray602[anInt9261++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray602[anInt9261++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray602[anInt9261++] = Static476.aClass2_Sub2_Sub9_3 == null ? -1 : Static476.aClass2_Sub2_Sub9_3.anInt3270;
					return;
				}
				if (arg0 == 5236) {
					anInt9261 -= 2;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static561.method7330(local103, local97, local175);
					if (local2833 < 0) {
						anIntArray602[anInt9261++] = -1;
						return;
					}
					anIntArray602[anInt9261++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static311.method4448();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt9261 -= 2;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					Static51.method873(local776, false, local175, 3);
					anIntArray602[anInt9261++] = Static43.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static43.aFrame1 != null) {
						Static51.method873(-1, false, -1, Static257.aClass2_Sub35_Sub1_1.anInt7491);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2917) Class311[] local2917 = Static511.method7279();
					anIntArray602[anInt9261++] = local2917.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray602[--anInt9261];
					@Pc(2941) Class311[] local2941 = Static511.method7279();
					anIntArray602[anInt9261++] = local2941[local175].anInt7735;
					anIntArray602[anInt9261++] = local2941[local175].anInt7736;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static257.aClass2_Sub35_Sub1_1.anInt7511;
					local776 = Static257.aClass2_Sub35_Sub1_1.anInt7502;
					local97 = -1;
					@Pc(2978) Class311[] local2978 = Static511.method7279();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class311 local2985 = local2978[local2833];
						if (local2985.anInt7735 == local175 && local2985.anInt7736 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray602[anInt9261++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray602[anInt9261++] = Static480.method6206();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray602[--anInt9261];
					if (local175 >= 1 && local175 <= 2) {
						Static51.method873(-1, false, -1, local175);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7491;
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray602[--anInt9261];
					if (local175 >= 1 && local175 <= 2) {
						Static257.aClass2_Sub35_Sub1_1.anInt7491 = local175;
						Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt9253 -= 2;
					local83 = aStringArray40[anInt9253];
					local89 = aStringArray40[anInt9253 + 1];
					local97 = anIntArray602[--anInt9261];
					@Pc(3124) Class2_Sub34 local3124 = Static555.method7264(Static498.aClass154_109, Static551.aClass64_2);
					local3124.aClass2_Sub7_Sub2_2.method4459(Static474.method6143(local83) + Static474.method6143(local89) + 1);
					local3124.aClass2_Sub7_Sub2_2.method4481(local83);
					local3124.aClass2_Sub7_Sub2_2.method4481(local89);
					local3124.aClass2_Sub7_Sub2_2.method4459(local97);
					Static100.method1508(local3124);
					return;
				}
				if (arg0 == 5401) {
					anInt9261 -= 2;
					Static307.aShortArray95[anIntArray602[anInt9261]] = (short) Static465.method5998(anIntArray602[anInt9261 + 1]);
					Static466.aClass130_2.method2312();
					Static466.aClass130_2.method2313();
					Static76.aClass361_1.method7583();
					Static549.method7175();
					return;
				}
				if (arg0 == 5405) {
					anInt9261 -= 2;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static594.anIntArrayArrayArray20[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt9261 -= 7;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1] << 1;
					local97 = anIntArray602[anInt9261 + 2];
					local103 = anIntArray602[anInt9261 + 3];
					local2833 = anIntArray602[anInt9261 + 4];
					@Pc(3262) int local3262 = anIntArray602[anInt9261 + 5];
					@Pc(3268) int local3268 = anIntArray602[anInt9261 + 6];
					if (local175 >= 0 && local175 < 2 && Static594.anIntArrayArrayArray20[local175] != null && local776 >= 0 && local776 < Static594.anIntArrayArrayArray20[local175].length) {
						Static594.anIntArrayArrayArray20[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3268 };
						Static594.anIntArrayArrayArray20[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3262 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static594.anIntArrayArrayArray20[anIntArray602[--anInt9261]].length >> 1;
					anIntArray602[anInt9261++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static43.aFrame1 != null) {
						Static51.method873(-1, false, -1, Static257.aClass2_Sub35_Sub1_1.anInt7491);
					}
					if (Static223.aFrame2 != null) {
						Static25.method354();
						System.exit(0);
						return;
					}
					local83 = Static244.aString49 == null ? Static589.method7517() : Static244.aString49;
					Static531.method6989(Static169.aClass99_2, false, local83, Static226.anInt3318 == 1);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static129.aClass5_3 != null) {
						if (Static129.aClass5_3.anObject1 == null) {
							local83 = Static390.method5386(Static129.aClass5_3.anInt150);
						} else {
							local83 = (String) Static129.aClass5_3.anObject1;
						}
					}
					aStringArray40[anInt9253++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray602[anInt9261++] = Static169.aClass99_2.aBoolean151 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static43.aFrame1 != null) {
						Static51.method873(-1, false, -1, Static257.aClass2_Sub35_Sub1_1.anInt7491);
					}
					local83 = aStringArray40[--anInt9253];
					local1496 = anIntArray602[--anInt9261] == 1;
					local181 = Static589.method7517() + local83;
					Static531.method6989(Static169.aClass99_2, local1496, local181, Static226.anInt3318 == 1);
					return;
				}
				if (arg0 == 5422) {
					anInt9253 -= 2;
					local83 = aStringArray40[anInt9253];
					local89 = aStringArray40[anInt9253 + 1];
					local97 = anIntArray602[--anInt9261];
					if (local83.length() > 0) {
						if (Static577.aStringArray43 == null) {
							Static577.aStringArray43 = new String[Static58.anIntArray105[Static18.aClass308_7.anInt7714]];
						}
						Static577.aStringArray43[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static498.aStringArray38 == null) {
							Static498.aStringArray38 = new String[Static58.anIntArray105[Static18.aClass308_7.anInt7714]];
						}
						Static498.aStringArray38[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray40[--anInt9253]);
					return;
				}
				if (arg0 == 5424) {
					anInt9261 -= 11;
					Static13.anInt6563 = anIntArray602[anInt9261];
					Static454.anInt7270 = anIntArray602[anInt9261 + 1];
					Static2.anInt13 = anIntArray602[anInt9261 + 2];
					Static592.anInt9610 = anIntArray602[anInt9261 + 3];
					Static85.anInt1441 = anIntArray602[anInt9261 + 4];
					Static557.anInt9126 = anIntArray602[anInt9261 + 5];
					Static89.anInt1595 = anIntArray602[anInt9261 + 6];
					Static503.anInt8011 = anIntArray602[anInt9261 + 7];
					Static487.anInt7737 = anIntArray602[anInt9261 + 8];
					Static554.anInt9070 = anIntArray602[anInt9261 + 9];
					Static77.anInt1384 = anIntArray602[anInt9261 + 10];
					Static241.aClass229_54.method4954(Static85.anInt1441);
					Static241.aClass229_54.method4954(Static557.anInt9126);
					Static241.aClass229_54.method4954(Static89.anInt1595);
					Static241.aClass229_54.method4954(Static503.anInt8011);
					Static241.aClass229_54.method4954(Static487.anInt7737);
					Static86.aClass38_8 = null;
					Static412.aClass38_30 = null;
					Static349.aClass38_31 = null;
					Static25.aClass38_5 = null;
					Static369.aClass38_43 = null;
					Static316.aClass38_27 = null;
					Static348.aClass38_29 = null;
					Static5.aClass38_1 = null;
					Static321.aBoolean428 = true;
					return;
				}
				if (arg0 == 5425) {
					Static238.method3428();
					Static321.aBoolean428 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt9261 -= 2;
					Static36.anInt668 = anIntArray602[anInt9261];
					Static183.anInt2722 = anIntArray602[anInt9261 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt9261 -= 2;
					Static379.anInt6320 = anIntArray602[anInt9261 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt9261 -= 2;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					anIntArray602[anInt9261++] = Static290.method4090(local175, local776) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static66.method1101(false, false, aStringArray40[--anInt9253]);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static597.method3394("accountcreated", Static195.anApplet4);
						return;
					} catch (@Pc(3800) Throwable local3800) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static597.method3394("accountcreatestarted", Static195.anApplet4);
						return;
					} catch (@Pc(3811) Throwable local3811) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static588.aClipboard1 != null) {
						@Pc(3823) Transferable local3823 = Static588.aClipboard1.getContents(null);
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
					aStringArray40[anInt9253++] = local83;
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt9261 -= 4;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					local97 = anIntArray602[anInt9261 + 2];
					local103 = anIntArray602[anInt9261 + 3];
					Static368.method6713(local103, local776 << 2, (local175 >> 14 & 0x3FFF) - Static485.anInt7725, false, local97, (local175 & 0x3FFF) - Static310.anInt5129);
					return;
				}
				if (arg0 == 5501) {
					anInt9261 -= 4;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					local97 = anIntArray602[anInt9261 + 2];
					local103 = anIntArray602[anInt9261 + 3];
					Static297.method4279(local776 << 2, local97, (local175 >> 14 & 0x3FFF) - Static485.anInt7725, (local175 & 0x3FFF) - Static310.anInt5129, local103);
					return;
				}
				if (arg0 == 5502) {
					anInt9261 -= 6;
					local175 = anIntArray602[anInt9261];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static2.anInt12 = local175;
					local776 = anIntArray602[anInt9261 + 1];
					if (local776 + 1 >= Static594.anIntArrayArrayArray20[Static2.anInt12].length >> 1) {
						throw new RuntimeException();
					}
					Static217.anInt3144 = local776;
					Static532.anInt8752 = 0;
					Static371.anInt6215 = anIntArray602[anInt9261 + 2];
					Static568.anInt9276 = anIntArray602[anInt9261 + 3];
					local97 = anIntArray602[anInt9261 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static264.anInt4328 = local97;
					local103 = anIntArray602[anInt9261 + 5];
					if (local103 + 1 >= Static594.anIntArrayArrayArray20[Static264.anInt4328].length >> 1) {
						throw new RuntimeException();
					}
					Static337.anInt5571 = local103;
					Static489.anInt7763 = 3;
					Static203.anInt2978 = -1;
					Static148.anInt2359 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static513.method6626();
					return;
				}
				if (arg0 == 5504) {
					anInt9261 -= 2;
					Static280.method4042(anIntArray602[anInt9261 + 1], anIntArray602[anInt9261]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray602[anInt9261++] = (int) Static541.aFloat128 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray602[anInt9261++] = (int) Static313.aFloat157 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static266.method3708();
					return;
				}
				if (arg0 == 5508) {
					Static317.method4597();
					return;
				}
				if (arg0 == 5509) {
					Static515.method6652();
					return;
				}
				if (arg0 == 5510) {
					Static388.method5352();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray602[--anInt9261];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static485.anInt7725;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static281.anInt4822) {
						local776 = Static281.anInt4822;
					}
					local97 -= Static310.anInt5129;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static29.anInt491) {
						local97 = Static29.anInt491;
					}
					Static504.anInt8012 = (local776 << 9) + 256;
					Static520.anInt8309 = (local97 << 9) + 256;
					Static489.anInt7763 = 4;
					Static203.anInt2978 = -1;
					Static148.anInt2359 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static442.method5788();
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray602[--anInt9261];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static485.anInt7725;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static281.anInt4822) {
							local776 = Static281.anInt4822;
						}
						local97 -= Static310.anInt5129;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static29.anInt491) {
							local97 = Static29.anInt491;
						}
						Static148.anInt2359 = (local776 << 9) + 256;
						Static203.anInt2978 = (local97 << 9) + 256;
						return;
					}
					Static148.anInt2359 = -1;
					Static203.anInt2978 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt9253 -= 2;
					local83 = aStringArray40[anInt9253];
					local89 = aStringArray40[anInt9253 + 1];
					local97 = anIntArray602[--anInt9261];
					if (Static540.anInt8912 != 3) {
						return;
					}
					if (Static135.anInt8199 == 0 && Static130.anInt2132 == 0) {
						Static64.aString14 = local83;
						Static6.aString4 = local89;
						Static124.anInt9459 = local97;
						Static115.method1686(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static64.method1093();
					return;
				}
				if (arg0 == 5602) {
					if (Static135.anInt8199 == 0) {
						Static464.anInt7425 = -2;
						Static263.anInt4318 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt9261 -= 4;
					if (Static540.anInt8912 != 3) {
						return;
					}
					if (Static135.anInt8199 == 0 && Static130.anInt2132 == 0) {
						Static533.method7005(anIntArray602[anInt9261 + 2], anIntArray602[anInt9261 + 1], anIntArray602[anInt9261 + 3], anIntArray602[anInt9261]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt9253--;
					if (Static540.anInt8912 != 3) {
						return;
					}
					if (Static135.anInt8199 == 0 && Static130.anInt2132 == 0) {
						Static565.method7388(Static367.method5177(aStringArray40[anInt9253]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt9253 -= 2;
					if (Static540.anInt8912 != 3) {
						return;
					}
					if (Static135.anInt8199 == 0 && Static130.anInt2132 == 0) {
						Static234.method3335(Static367.method5177(aStringArray40[anInt9253]), false, aStringArray40[anInt9253 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static130.anInt2132 == 0) {
						Static372.anInt6216 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray602[anInt9261++] = Static263.anInt4318;
					return;
				}
				if (arg0 == 5608) {
					anIntArray602[anInt9261++] = Static111.anInt1961;
					return;
				}
				if (arg0 == 5609) {
					anIntArray602[anInt9261++] = Static372.anInt6216;
					return;
				}
				if (arg0 == 5610) {
					for (local175 = 0; local175 < 5; local175++) {
						aStringArray40[anInt9253++] = Static164.aStringArray15 == null || Static164.aStringArray15.length <= local175 ? "" : Static53.method7504(Static164.aStringArray15[local175]);
					}
					Static164.aStringArray15 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray602[anInt9261++] = Static487.anInt7731;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray602[--anInt9261];
					if (Static540.anInt8912 != 7) {
						return;
					}
					if (Static135.anInt8199 == 0 && Static130.anInt2132 == 0) {
						if (Static529.aClass124_2 != null) {
							Static529.aClass124_2.method2256();
							Static529.aClass124_2 = null;
						}
						Static124.anInt9459 = local175;
						Static115.method1686(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray602[anInt9261++] = Static263.anInt4318;
					return;
				}
				if (arg0 == 5615) {
					anInt9253 -= 2;
					local83 = aStringArray40[anInt9253];
					local89 = aStringArray40[anInt9253 + 1];
					if (Static540.anInt8912 != 3) {
						return;
					}
					if (Static135.anInt8199 == 0 && Static130.anInt2132 == 0) {
						if (Static529.aClass124_2 != null) {
							Static529.aClass124_2.method2256();
							Static529.aClass124_2 = null;
						}
						Static64.aString14 = local83;
						Static6.aString4 = local89;
						Static115.method1686(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static449.method5858(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray602[anInt9261++] = Static464.anInt7425;
					return;
				}
				if (arg0 == 5618) {
					local175 = anIntArray602[--anInt9261];
					Static204.method2537(local175, false);
					return;
				}
				if (arg0 == 5619) {
					local175 = anIntArray602[--anInt9261];
					Static204.method2537(local175, true);
					return;
				}
				if (arg0 == 5620) {
					Static144.method1986();
					if (Static564.aString140 != "" && Static564.aString140 != "") {
						anIntArray602[anInt9261++] = 1;
						return;
					}
					anIntArray602[anInt9261++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt9253 -= 2;
					if (Static540.anInt8912 != 3) {
						return;
					}
					if (Static135.anInt8199 == 0 && Static130.anInt2132 == 0) {
						Static234.method3335(Static367.method5177(aStringArray40[anInt9253]), true, aStringArray40[anInt9253 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4719) Class5 local4719 = Static169.aClass99_2.method1789(false, "3");
					while (local4719.anInt151 == 0) {
						Static263.method3671(1L);
					}
					if (local4719.anInt151 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4739) Class317 local4739 = (Class317) local4719.anObject1;
					if (local4739.method6332().exists()) {
						@Pc(4749) Class2_Sub7 local4749 = new Class2_Sub7(50);
						try {
							local4739.method6335(0, 50, local4749.aByteArray52);
						} catch (@Pc(4758) IOException local4758) {
						}
					}
					try {
						local4739.method6333();
						return;
					} catch (@Pc(4764) Exception local4764) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static353.aString80 != null) {
						anIntArray602[anInt9261++] = 1;
						return;
					}
					anIntArray602[anInt9261++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray602[anInt9261++] = (int) (Static309.aLong139 >> 32);
					anIntArray602[anInt9261++] = (int) (Static309.aLong139 & 0xFFFFL);
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray602[--anInt9261];
					if (local175 < 1) {
						local175 = 1;
					}
					if (local175 > 4) {
						local175 = 4;
					}
					Static257.aClass2_Sub35_Sub1_1.anInt7508 = local175;
					Static378.method5265();
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6002) {
					Static257.aClass2_Sub35_Sub1_1.method6050(anIntArray602[--anInt9261] == 1);
					Static378.method5265();
					Static498.method6450();
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6003) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean631 = anIntArray602[--anInt9261] == 1;
					Static498.method6450();
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6005) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean630 = anIntArray602[--anInt9261] == 1;
					Static378.method5265();
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6006) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean632 = anIntArray602[--anInt9261] == 1;
					Static417.aClass162_17.method6813(!Static257.aClass2_Sub35_Sub1_1.aBoolean632);
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6007) {
					Static257.aClass2_Sub35_Sub1_1.anInt7510 = anIntArray602[--anInt9261];
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6008) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean625 = anIntArray602[--anInt9261] == 1;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6009) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean637 = anIntArray602[--anInt9261] == 1;
					Static378.method5265();
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6010) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean640 = anIntArray602[--anInt9261] == 1;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6011) {
					local175 = anIntArray602[--anInt9261];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static257.aClass2_Sub35_Sub1_1.method6033(Static226.anInt3318, local175);
					Static378.method5265();
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6012) {
					Static257.aClass2_Sub35_Sub1_1.method6034(anIntArray602[--anInt9261] == 1, Static226.anInt3318);
					Static514.method6643();
					Static113.method1669();
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6014) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean634 = anIntArray602[--anInt9261] == 1;
					Static378.method5265();
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6015) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean633 = anIntArray602[--anInt9261] == 1;
					Static378.method5265();
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6016) {
					local175 = anIntArray602[--anInt9261];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static257.aClass2_Sub35_Sub1_1.anInt7498 = local175;
					Static368.method6714(Static226.anInt3318);
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					return;
				}
				if (arg0 == 6017) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean639 = anIntArray602[--anInt9261] == 1;
					Static158.method6600();
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6018) {
					local175 = anIntArray602[--anInt9261];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static257.aClass2_Sub35_Sub1_1.anInt7505 = local175;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray602[--anInt9261];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static257.aClass2_Sub35_Sub1_1.anInt7490) {
						if (Static257.aClass2_Sub35_Sub1_1.anInt7490 == 0 && Static491.anInt7770 != -1) {
							Static228.method2769(Static491.anInt7770, Static106.aClass229_32, local175);
							Static569.method7428();
							Static271.aBoolean352 = false;
						} else if (local175 == 0) {
							Static266.method3710();
							Static271.aBoolean352 = false;
						} else {
							Static397.method5456(local175);
						}
						Static257.aClass2_Sub35_Sub1_1.anInt7490 = local175;
					}
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6020) {
					local175 = anIntArray602[--anInt9261];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static257.aClass2_Sub35_Sub1_1.anInt7512 = local175;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6021) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean642 = anIntArray602[--anInt9261] == 1;
					Static498.method6450();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray602[--anInt9261];
					local1496 = false;
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 2) {
						local175 = 2;
					}
					if (Static326.anInt7462 < 96) {
						local175 = 0;
						local1496 = true;
					}
					Static310.method4442(local175);
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					anIntArray602[anInt9261++] = local1496 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local175 = anIntArray602[--anInt9261];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static257.aClass2_Sub35_Sub1_1.anInt7494 = local175;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					return;
				}
				if (arg0 == 6025) {
					local175 = anIntArray602[--anInt9261];
					if (local175 < 0 || local175 > Static253.method3610(Static326.anInt7462)) {
						local175 = 0;
					}
					Static257.aClass2_Sub35_Sub1_1.anInt7496 = local175;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray602[--anInt9261];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static183.method2351(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean641 = anIntArray602[--anInt9261] != 0;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					return;
				}
				if (arg0 == 6029) {
					Static257.aClass2_Sub35_Sub1_1.anInt7510 = anIntArray602[--anInt9261];
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					return;
				}
				if (arg0 == 6030) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean629 = anIntArray602[--anInt9261] != 0;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static378.method5265();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray602[--anInt9261];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static368.method6714(local175);
					return;
				}
				if (arg0 == 6032) {
					local175 = anIntArray602[--anInt9261];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static257.aClass2_Sub35_Sub1_1.anInt7497 = local175;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6033) {
					local175 = anIntArray602[--anInt9261];
					if (local175 < 0 || local175 > 4) {
						local175 = 2;
					}
					Static257.aClass2_Sub35_Sub1_1.anInt7492 = local175;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					return;
				}
				if (arg0 == 6034) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean624 = anIntArray602[--anInt9261] == 1;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static514.method6643();
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6035) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean643 = anIntArray602[--anInt9261] == 1;
					Static378.method5265();
					Static498.method6450();
					return;
				}
				if (arg0 == 6036) {
					local175 = anIntArray602[--anInt9261];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static257.aClass2_Sub35_Sub1_1.method6043(local175);
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					return;
				}
				if (arg0 == 6037) {
					local175 = anIntArray602[--anInt9261];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static257.aClass2_Sub35_Sub1_1.anInt7495 = local175;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray602[--anInt9261];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static257.aClass2_Sub35_Sub1_1.anInt7499 && Static491.anInt7770 == Static134.anInt2161) {
						if (Static257.aClass2_Sub35_Sub1_1.anInt7499 == 0) {
							Static228.method2769(Static491.anInt7770, Static106.aClass229_32, local175);
							Static569.method7428();
							Static271.aBoolean352 = false;
						} else if (local175 == 0) {
							Static266.method3710();
							Static271.aBoolean352 = false;
						} else {
							Static397.method5456(local175);
						}
					}
					Static257.aClass2_Sub35_Sub1_1.anInt7499 = local175;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray602[--anInt9261];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static257.aClass2_Sub35_Sub1_1.anInt7509) {
						Static257.aClass2_Sub35_Sub1_1.anInt7509 = local175;
						Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
						Static237.aBoolean297 = false;
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7508;
					return;
				}
				if (arg0 == 6102) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.method6045(Static226.anInt3318) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.aBoolean631 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.aBoolean630 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.aBoolean632 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7510;
					return;
				}
				if (arg0 == 6108) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.aBoolean625 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.aBoolean637 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.aBoolean640 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.method6037(Static226.anInt3318);
					return;
				}
				if (arg0 == 6112) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.method6036(Static226.anInt3318) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.aBoolean634 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.aBoolean633 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7498;
					return;
				}
				if (arg0 == 6117) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.aBoolean639 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7505;
					return;
				}
				if (arg0 == 6119) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7490;
					return;
				}
				if (arg0 == 6120) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7512;
					return;
				}
				if (arg0 == 6121) {
					anIntArray602[anInt9261++] = Static417.aClass162_17.method6824() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray602[anInt9261++] = Static426.method5674();
					return;
				}
				if (arg0 == 6124) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7494;
					return;
				}
				if (arg0 == 6125) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7496;
					return;
				}
				if (arg0 == 6126) {
					anIntArray602[anInt9261++] = Static417.aClass162_17.method6856() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.aBoolean628 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.aBoolean641 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7510;
					return;
				}
				if (arg0 == 6130) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.aBoolean629 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray602[anInt9261++] = Static226.anInt3318;
					return;
				}
				if (arg0 == 6132) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7497;
					return;
				}
				if (arg0 == 6133) {
					anIntArray602[anInt9261++] = Static169.aClass99_2.aBoolean151 && !Static169.aClass99_2.aBoolean149 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray602[anInt9261++] = Static253.method3610(Static326.anInt7462);
					return;
				}
				if (arg0 == 6135) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7492;
					return;
				}
				if (arg0 == 6136) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.aBoolean624 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6356) boolean local6356 = true;
					try {
						local6356 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6366) Throwable local6366) {
					}
					anIntArray602[anInt9261++] = local6356 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray602[anInt9261++] = Static223.method2719(200, Static226.anInt3318);
					return;
				}
				if (arg0 == 6139) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.method6051(Static226.anInt3318);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6414) byte local6414 = 0;
					if (Static189.method2395(Static226.anInt3318) && Static326.anInt7462 < 96) {
						local6414 = 1;
					}
					anIntArray602[anInt9261++] = local6414;
					return;
				}
				if (arg0 == 6141) {
					if (Static326.anInt7462 < 96) {
						anIntArray602[anInt9261++] = 0;
						return;
					}
					anIntArray602[anInt9261++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7495;
					return;
				}
				if (arg0 == 6143) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7499;
					return;
				}
				if (arg0 == 6144) {
					anIntArray602[anInt9261++] = Static336.aBoolean440 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7509;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt9261 -= 2;
					Static588.aShort123 = (short) anIntArray602[anInt9261];
					if (Static588.aShort123 <= 0) {
						Static588.aShort123 = 256;
					}
					Static547.aShort118 = (short) anIntArray602[anInt9261 + 1];
					if (Static547.aShort118 <= 0) {
						Static547.aShort118 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt9261 -= 2;
					Static331.aShort71 = (short) anIntArray602[anInt9261];
					if (Static331.aShort71 <= 0) {
						Static331.aShort71 = 256;
					}
					Static186.aShort34 = (short) anIntArray602[anInt9261 + 1];
					if (Static186.aShort34 <= 0) {
						Static186.aShort34 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt9261 -= 4;
					Static127.aShort27 = (short) anIntArray602[anInt9261];
					if (Static127.aShort27 <= 0) {
						Static127.aShort27 = 1;
					}
					Static37.aShort1 = (short) anIntArray602[anInt9261 + 1];
					if (Static37.aShort1 <= 0) {
						Static37.aShort1 = 32767;
					} else if (Static37.aShort1 < Static127.aShort27) {
						Static37.aShort1 = Static127.aShort27;
					}
					Static402.aShort86 = (short) anIntArray602[anInt9261 + 2];
					if (Static402.aShort86 <= 0) {
						Static402.aShort86 = 1;
					}
					Static398.aShort85 = (short) anIntArray602[anInt9261 + 3];
					if (Static398.aShort85 <= 0) {
						Static398.aShort85 = 32767;
						return;
					}
					if (Static398.aShort85 < Static402.aShort86) {
						Static398.aShort85 = Static402.aShort86;
					}
					return;
				}
				if (arg0 == 6203) {
					Static68.method1109(0, false, Static61.aClass273_1.anInt6814, Static61.aClass273_1.anInt6883, 0);
					anIntArray602[anInt9261++] = Static516.anInt8249;
					anIntArray602[anInt9261++] = Static345.anInt5963;
					return;
				}
				if (arg0 == 6204) {
					anIntArray602[anInt9261++] = Static331.aShort71;
					anIntArray602[anInt9261++] = Static186.aShort34;
					return;
				}
				if (arg0 == 6205) {
					anIntArray602[anInt9261++] = Static588.aShort123;
					anIntArray602[anInt9261++] = Static547.aShort118;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray602[anInt9261++] = (int) (Static362.method5133() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray602[anInt9261++] = (int) (Static362.method5133() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt9261 -= 3;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					local97 = anIntArray602[anInt9261 + 2];
					aCalendar2.clear();
					aCalendar2.set(11, 12);
					aCalendar2.set(local97, local776, local175);
					local103 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray602[anInt9261++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar2.clear();
					aCalendar2.setTime(new Date(Static362.method5133()));
					anIntArray602[anInt9261++] = aCalendar2.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray602[--anInt9261];
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
					anIntArray602[anInt9261++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray602[anInt9261++] = Static47.method844() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray602[anInt9261++] = Static51.method870() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static540.anInt8912 == 7 && Static135.anInt8199 == 0 && Static130.anInt2132 == 0) {
						if (Static477.aBoolean651) {
							anIntArray602[anInt9261++] = 0;
							return;
						}
						if (Static421.aLong190 > Static362.method5133() - 1000L) {
							anIntArray602[anInt9261++] = 1;
							return;
						}
						Static477.aBoolean651 = true;
						local52 = Static555.method7264(Static434.aClass154_97, Static551.aClass64_2);
						local52.aClass2_Sub7_Sub2_2.method4495(Static104.anInt1828);
						Static100.method1508(local52);
						anIntArray602[anInt9261++] = 0;
						return;
					}
					anIntArray602[anInt9261++] = 1;
					return;
				}
				@Pc(7037) Class299 local7037;
				@Pc(7004) Class86_Sub1 local7004;
				if (arg0 == 6501) {
					local7004 = Static512.method6622();
					if (local7004 != null) {
						anIntArray602[anInt9261++] = local7004.anInt1989;
						anIntArray602[anInt9261++] = local7004.anInt1984;
						aStringArray40[anInt9253++] = local7004.aString23;
						local7037 = local7004.method1663();
						anIntArray602[anInt9261++] = local7037.anInt7441;
						aStringArray40[anInt9253++] = local7037.aString114;
						anIntArray602[anInt9261++] = local7004.anInt1978;
						anIntArray602[anInt9261++] = local7004.anInt1988;
						aStringArray40[anInt9253++] = local7004.aString24;
						return;
					}
					anIntArray602[anInt9261++] = -1;
					anIntArray602[anInt9261++] = 0;
					aStringArray40[anInt9253++] = "";
					anIntArray602[anInt9261++] = 0;
					aStringArray40[anInt9253++] = "";
					anIntArray602[anInt9261++] = 0;
					anIntArray602[anInt9261++] = 0;
					aStringArray40[anInt9253++] = "";
					return;
				}
				if (arg0 == 6502) {
					local7004 = Static71.method4252();
					if (local7004 != null) {
						anIntArray602[anInt9261++] = local7004.anInt1989;
						anIntArray602[anInt9261++] = local7004.anInt1984;
						aStringArray40[anInt9253++] = local7004.aString23;
						local7037 = local7004.method1663();
						anIntArray602[anInt9261++] = local7037.anInt7441;
						aStringArray40[anInt9253++] = local7037.aString114;
						anIntArray602[anInt9261++] = local7004.anInt1978;
						anIntArray602[anInt9261++] = local7004.anInt1988;
						aStringArray40[anInt9253++] = local7004.aString24;
						return;
					}
					anIntArray602[anInt9261++] = -1;
					anIntArray602[anInt9261++] = 0;
					aStringArray40[anInt9253++] = "";
					anIntArray602[anInt9261++] = 0;
					aStringArray40[anInt9253++] = "";
					anIntArray602[anInt9261++] = 0;
					anIntArray602[anInt9261++] = 0;
					aStringArray40[anInt9253++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray602[--anInt9261];
					local89 = aStringArray40[--anInt9253];
					if (Static540.anInt8912 == 7 && Static135.anInt8199 == 0 && Static130.anInt2132 == 0) {
						anIntArray602[anInt9261++] = Static80.method1230(local89, local175) ? 1 : 0;
						return;
					}
					anIntArray602[anInt9261++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static257.aClass2_Sub35_Sub1_1.anInt7506 = anIntArray602[--anInt9261];
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					return;
				}
				if (arg0 == 6505) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7506;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray602[--anInt9261];
					@Pc(7394) Class86_Sub1 local7394 = Static51.method871(local175);
					if (local7394 != null) {
						anIntArray602[anInt9261++] = local7394.anInt1984;
						aStringArray40[anInt9253++] = local7394.aString23;
						@Pc(7418) Class299 local7418 = local7394.method1663();
						anIntArray602[anInt9261++] = local7418.anInt7441;
						aStringArray40[anInt9253++] = local7418.aString114;
						anIntArray602[anInt9261++] = local7394.anInt1978;
						anIntArray602[anInt9261++] = local7394.anInt1988;
						aStringArray40[anInt9253++] = local7394.aString24;
						return;
					}
					anIntArray602[anInt9261++] = -1;
					aStringArray40[anInt9253++] = "";
					anIntArray602[anInt9261++] = 0;
					aStringArray40[anInt9253++] = "";
					anIntArray602[anInt9261++] = 0;
					anIntArray602[anInt9261++] = 0;
					aStringArray40[anInt9253++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt9261 -= 4;
					local175 = anIntArray602[anInt9261];
					local1496 = anIntArray602[anInt9261 + 1] == 1;
					local97 = anIntArray602[anInt9261 + 2];
					local2107 = anIntArray602[anInt9261 + 3] == 1;
					Static30.method398(local97, local1496, local2107, local175);
					return;
				}
				if (arg0 == 6508) {
					Static348.method5031();
					return;
				}
				if (arg0 == 6509) {
					if (Static540.anInt8912 != 7) {
						return;
					}
					Static415.aBoolean102 = anIntArray602[--anInt9261] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray602[anInt9261++] = Static139.anInt2264;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static257.aClass2_Sub35_Sub1_1.aBoolean638 = anIntArray602[--anInt9261] == 1;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					return;
				}
				if (arg0 == 6601) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.aBoolean638 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static587.aClass285_4 == Static571.aClass285_3) {
				if (arg0 == 6700) {
					local175 = Static346.aClass90_17.method1679();
					if (Static122.anInt2094 != -1) {
						local175++;
					}
					anIntArray602[anInt9261++] = local175;
					return;
				}
				if (arg0 == 6701) {
					local175 = anIntArray602[--anInt9261];
					if (Static122.anInt2094 != -1) {
						if (local175 == 0) {
							anIntArray602[anInt9261++] = Static122.anInt2094;
							return;
						}
						local175--;
					}
					@Pc(7705) Class2_Sub33 local7705 = (Class2_Sub33) Static346.aClass90_17.method1676();
					while (local175-- > 0) {
						local7705 = (Class2_Sub33) Static346.aClass90_17.method1680();
					}
					anIntArray602[anInt9261++] = local7705.anInt5981;
					return;
				}
				if (arg0 == 6702) {
					local175 = anIntArray602[--anInt9261];
					if (Static509.aClass273ArrayArray2[local175] == null) {
						aStringArray40[anInt9253++] = "";
						return;
					}
					local89 = Static509.aClass273ArrayArray2[local175][0].aString102;
					if (local89 == null) {
						aStringArray40[anInt9253++] = "";
						return;
					}
					aStringArray40[anInt9253++] = local89.substring(0, local89.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local175 = anIntArray602[--anInt9261];
					if (Static509.aClass273ArrayArray2[local175] == null) {
						anIntArray602[anInt9261++] = 0;
						return;
					}
					anIntArray602[anInt9261++] = Static509.aClass273ArrayArray2[local175].length;
					return;
				}
				if (arg0 == 6704) {
					anInt9261 -= 2;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					if (Static509.aClass273ArrayArray2[local175] == null) {
						aStringArray40[anInt9253++] = "";
						return;
					}
					local181 = Static509.aClass273ArrayArray2[local175][local776].aString102;
					if (local181 == null) {
						aStringArray40[anInt9253++] = "";
						return;
					}
					aStringArray40[anInt9253++] = local181;
					return;
				}
				if (arg0 == 6705) {
					anInt9261 -= 2;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					if (Static509.aClass273ArrayArray2[local175] == null) {
						anIntArray602[anInt9261++] = 0;
						return;
					}
					anIntArray602[anInt9261++] = Static509.aClass273ArrayArray2[local175][local776].anInt6834;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt9261 -= 3;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					local97 = anIntArray602[anInt9261 + 2];
					Static513.method6625(local175 << 16 | local776, "", 1, local97);
					return;
				}
				if (arg0 == 6708) {
					anInt9261 -= 3;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					local97 = anIntArray602[anInt9261 + 2];
					Static513.method6625(local175 << 16 | local776, "", 2, local97);
					return;
				}
				if (arg0 == 6709) {
					anInt9261 -= 3;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					local97 = anIntArray602[anInt9261 + 2];
					Static513.method6625(local175 << 16 | local776, "", 3, local97);
					return;
				}
				if (arg0 == 6710) {
					anInt9261 -= 3;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					local97 = anIntArray602[anInt9261 + 2];
					Static513.method6625(local175 << 16 | local776, "", 4, local97);
					return;
				}
				if (arg0 == 6711) {
					anInt9261 -= 3;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					local97 = anIntArray602[anInt9261 + 2];
					Static513.method6625(local175 << 16 | local776, "", 5, local97);
					return;
				}
				if (arg0 == 6712) {
					anInt9261 -= 3;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					local97 = anIntArray602[anInt9261 + 2];
					Static513.method6625(local175 << 16 | local776, "", 6, local97);
					return;
				}
				if (arg0 == 6713) {
					anInt9261 -= 3;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					local97 = anIntArray602[anInt9261 + 2];
					Static513.method6625(local175 << 16 | local776, "", 7, local97);
					return;
				}
				if (arg0 == 6714) {
					anInt9261 -= 3;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					local97 = anIntArray602[anInt9261 + 2];
					Static513.method6625(local175 << 16 | local776, "", 8, local97);
					return;
				}
				if (arg0 == 6715) {
					anInt9261 -= 3;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					local97 = anIntArray602[anInt9261 + 2];
					Static513.method6625(local175 << 16 | local776, "", 9, local97);
					return;
				}
				if (arg0 == 6716) {
					anInt9261 -= 3;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					local97 = anIntArray602[anInt9261 + 2];
					Static513.method6625(local175 << 16 | local776, "", 10, local97);
					return;
				}
				if (arg0 == 6717) {
					anInt9261 -= 3;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					local97 = anIntArray602[anInt9261 + 2];
					@Pc(8293) Class273 local8293 = Static494.method6329(local175 << 16 | local776, local97);
					Static5.method84();
					@Pc(8298) Class2_Sub23 local8298 = Static70.method1164(local8293);
					Static125.method1728(local8298.method2767(), local8293, local8298.anInt3327);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8326) Class142 local8326;
				if (arg0 == 6800) {
					local175 = anIntArray602[--anInt9261];
					local8326 = Static8.aClass360_1.method7576(local175);
					if (local8326.aString42 == null) {
						aStringArray40[anInt9253++] = "";
						return;
					}
					aStringArray40[anInt9253++] = local8326.aString42;
					return;
				}
				if (arg0 == 6801) {
					local175 = anIntArray602[--anInt9261];
					local8326 = Static8.aClass360_1.method7576(local175);
					anIntArray602[anInt9261++] = local8326.anInt2961;
					return;
				}
				if (arg0 == 6802) {
					local175 = anIntArray602[--anInt9261];
					local8326 = Static8.aClass360_1.method7576(local175);
					anIntArray602[anInt9261++] = local8326.anInt2955;
					return;
				}
				if (arg0 == 6803) {
					local175 = anIntArray602[--anInt9261];
					local8326 = Static8.aClass360_1.method7576(local175);
					anIntArray602[anInt9261++] = local8326.anInt2962;
					return;
				}
				if (arg0 == 6804) {
					anInt9261 -= 2;
					local175 = anIntArray602[anInt9261];
					local776 = anIntArray602[anInt9261 + 1];
					@Pc(8448) Class57 local8448 = Static537.aClass191_2.method3971(local776);
					if (local8448.method1108()) {
						aStringArray40[anInt9253++] = Static8.aClass360_1.method7576(local175).method2520(local776, local8448.aString16);
						return;
					}
					anIntArray602[anInt9261++] = Static8.aClass360_1.method7576(local175).method2522(local8448.anInt1160, local776);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray602[anInt9261++] = Static183.aBoolean193 && !Static438.aBoolean578 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray602[anInt9261++] = Static180.anInt2676;
					return;
				}
				if (arg0 == 6902) {
					anIntArray602[anInt9261++] = Static441.anInt7087;
					return;
				}
				if (arg0 == 6903) {
					anIntArray602[anInt9261++] = Static423.anInt9311;
					return;
				}
				if (arg0 == 6904) {
					anIntArray602[anInt9261++] = Static509.anInt8136;
					return;
				}
				if (arg0 == 6905) {
					local83 = "";
					if (Static129.aClass5_3 != null) {
						if (Static129.aClass5_3.anObject1 == null) {
							local83 = Static390.method5386(Static129.aClass5_3.anInt150);
						} else {
							local83 = (String) Static129.aClass5_3.anObject1;
						}
					}
					aStringArray40[anInt9253++] = local83;
					return;
				}
				if (arg0 == 6906) {
					anIntArray602[anInt9261++] = Static222.anInt3253;
					return;
				}
				if (arg0 == 6907) {
					anIntArray602[anInt9261++] = Static400.anInt6599;
					return;
				}
				if (arg0 == 6908) {
					anIntArray602[anInt9261++] = Static434.anInt6966;
					return;
				}
				if (arg0 == 6909) {
					anIntArray602[anInt9261++] = Static218.aBoolean230 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray602[anInt9261++] = Static282.anInt4827;
					return;
				}
				if (arg0 == 6911) {
					anIntArray602[anInt9261++] = Static577.anInt9360;
					return;
				}
				if (arg0 == 6912) {
					anIntArray602[anInt9261++] = Static17.anInt4852;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local175 = Static257.aClass2_Sub35_Sub1_1.method6048();
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7527 = Static226.anInt3318;
					anIntArray602[anInt9261++] = local175;
					Static378.method5265();
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 7001) {
					Static257.aClass2_Sub35_Sub1_1.method6055();
					Static378.method5265();
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 7002) {
					Static257.aClass2_Sub35_Sub1_1.method6040();
					Static378.method5265();
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 7003) {
					Static257.aClass2_Sub35_Sub1_1.method6039();
					Static378.method5265();
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 7004) {
					Static257.aClass2_Sub35_Sub1_1.method6047(true);
					Static378.method5265();
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 7005) {
					Static257.aClass2_Sub35_Sub1_1.anInt7487 = 0;
					Static257.aClass2_Sub35_Sub1_1.method6056(Static169.aClass99_2);
					Static237.aBoolean297 = false;
					return;
				}
				if (arg0 == 7006) {
					if (Static257.aClass2_Sub35_Sub1_1.anInt7527 == 2) {
						Static257.aClass2_Sub35_Sub1_1.aBoolean644 = true;
						return;
					}
					if (Static257.aClass2_Sub35_Sub1_1.anInt7527 == 1) {
						Static257.aClass2_Sub35_Sub1_1.aBoolean647 = true;
						return;
					}
					if (Static257.aClass2_Sub35_Sub1_1.anInt7527 == 3) {
						Static257.aClass2_Sub35_Sub1_1.aBoolean645 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray602[anInt9261++] = Static257.aClass2_Sub35_Sub1_1.anInt7487;
					return;
				}
				if (arg0 == 7008) {
					if (Static226.anInt3318 == 0 && Static326.anInt7462 < 96) {
						anIntArray602[anInt9261++] = 1;
						return;
					}
					anIntArray602[anInt9261++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!mea;II)V")
	public static void method7391(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub2_Sub11 local5 = Static270.method3739(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray600 = new int[local5.anInt4989];
		aStringArray41 = new String[local5.anInt4988];
		if (local5.aClass222_8 == Static447.aClass222_13 || local5.aClass222_8 == Static253.aClass222_6 || local5.aClass222_8 == Static170.aClass222_3) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static176.aClass273_5 != null) {
				local30 = Static176.aClass273_5.anInt6817;
				local32 = Static176.aClass273_5.anInt6855;
			}
			anIntArray600[0] = Static205.aClass131_1.method6544() - local30;
			anIntArray600[1] = Static205.aClass131_1.method6542() - local32;
		}
		method7396(local5, 200000);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "()V")
	public static void method7392() {
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(IZ)V")
	public static void method7393() {
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	private static void method7394(@OriginalArg(0) int arg0) {
		@Pc(3) Class273 local3 = Static594.method7731(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class273[] local13 = Static183.aClass273ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class273[] local19 = Static509.aClass273ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static183.aClass273ArrayArray1[local9] = new Class273[local22];
			Static598.method4266(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static598.method4266(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(IZ)V")
	private static void method7395(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class273 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class273 local35;
		@Pc(13) int local13;
		@Pc(210) Class273 local210;
		@Pc(158) Class273 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt9261 -= 3;
				local13 = anIntArray602[anInt9261];
				local19 = anIntArray602[anInt9261 + 1];
				local25 = anIntArray602[anInt9261 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static594.method7731(local13);
				if (local35.aClass273Array2 == null) {
					local35.aClass273Array2 = new Class273[local25 + 1];
				}
				if (local35.aClass273Array2.length <= local25) {
					@Pc(54) Class273[] local54 = new Class273[local25 + 1];
					for (local56 = 0; local56 < local35.aClass273Array2.length; local56++) {
						local54[local56] = local35.aClass273Array2[local56];
					}
					local35.aClass273Array2 = local54;
				}
				if (local25 > 0 && local35.aClass273Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class273 local99 = new Class273();
				local99.anInt6868 = local19;
				local99.anInt6820 = local99.anInt6810 = local35.anInt6810;
				local99.anInt6800 = local25;
				local35.aClass273Array2[local25] = local99;
				if (arg1) {
					aClass273_13 = local99;
				} else {
					aClass273_12 = local99;
				}
				Static155.method2111(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass273_13 : aClass273_12;
				if (local137.anInt6800 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static594.method7731(local137.anInt6810);
				local158.aClass273Array2[local137.anInt6800] = null;
				Static155.method2111(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static594.method7731(anIntArray602[--anInt9261]);
				local137.aClass273Array2 = null;
				Static155.method2111(local137);
				return;
			}
			if (arg0 == 200) {
				anInt9261 -= 2;
				local13 = anIntArray602[anInt9261];
				local19 = anIntArray602[anInt9261 + 1];
				local210 = Static494.method6329(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray602[anInt9261++] = 1;
					if (arg1) {
						aClass273_13 = local210;
						return;
					}
					aClass273_12 = local210;
					return;
				}
				anIntArray602[anInt9261++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray602[--anInt9261];
				local158 = Static594.method7731(local13);
				if (local158 != null) {
					anIntArray602[anInt9261++] = 1;
					if (arg1) {
						aClass273_13 = local158;
						return;
					}
					aClass273_12 = local158;
					return;
				}
				anIntArray602[anInt9261++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray602[--anInt9261];
				method7402(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray602[--anInt9261];
				method7394(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt9261 -= 2;
					local13 = anIntArray602[anInt9261];
					local19 = anIntArray602[anInt9261 + 1];
					for (local25 = 0; local25 < Static94.anIntArray148.length; local25++) {
						if (Static94.anIntArray148[local25] == local13) {
							Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aClass300_1.method6020(local25, local19, Static25.aClass286_1);
							return;
						}
					}
					for (local353 = 0; local353 < Static371.anIntArray407.length; local353++) {
						if (Static371.anIntArray407[local353] == local13) {
							Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aClass300_1.method6020(local353, local19, Static25.aClass286_1);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt9261 -= 2;
					local13 = anIntArray602[anInt9261];
					local19 = anIntArray602[anInt9261 + 1];
					Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aClass300_1.method6024(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray602[--anInt9261] != 0;
					Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aClass300_1.method6022(local412);
					return;
				}
				if (arg0 == 411) {
					anInt9261 -= 2;
					local13 = anIntArray602[anInt9261];
					local19 = anIntArray602[anInt9261 + 1];
					Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aClass300_1.method6023(local13, Static466.aClass130_2, local19);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1507) String local1507;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static594.method7731(anIntArray602[--anInt9261]);
					} else {
						local137 = arg1 ? aClass273_13 : aClass273_12;
					}
					if (arg0 == 1100) {
						anInt9261 -= 2;
						local137.anInt6812 = anIntArray602[anInt9261];
						if (local137.anInt6812 > local137.anInt6857 - local137.anInt6883) {
							local137.anInt6812 = local137.anInt6857 - local137.anInt6883;
						}
						if (local137.anInt6812 < 0) {
							local137.anInt6812 = 0;
						}
						local137.anInt6880 = anIntArray602[anInt9261 + 1];
						if (local137.anInt6880 > local137.anInt6835 - local137.anInt6814) {
							local137.anInt6880 = local137.anInt6835 - local137.anInt6814;
						}
						if (local137.anInt6880 < 0) {
							local137.anInt6880 = 0;
						}
						Static155.method2111(local137);
						if (local137.anInt6800 == -1) {
							Static63.method1087(local137.anInt6810);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt6854 = anIntArray602[--anInt9261];
						Static155.method2111(local137);
						if (local137.anInt6800 == -1) {
							Static456.method5935(local137.anInt6810);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean560 = anIntArray602[--anInt9261] == 1;
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt6873 = anIntArray602[--anInt9261];
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt6794 = anIntArray602[--anInt9261];
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray602[--anInt9261];
						if (local137.anInt6842 != local19) {
							local137.anInt6842 = local19;
							Static155.method2111(local137);
						}
						if (local137.anInt6800 == -1) {
							Static12.method219(local137.anInt6810);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt6796 = anIntArray602[--anInt9261];
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean546 = anIntArray602[--anInt9261] == 1;
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt6850 = 1;
						local137.anInt6828 = anIntArray602[--anInt9261];
						Static155.method2111(local137);
						if (local137.anInt6800 == -1) {
							Static202.method2529(local137.anInt6810);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt9261 -= 6;
						local137.anInt6798 = anIntArray602[anInt9261];
						local137.anInt6838 = anIntArray602[anInt9261 + 1];
						local137.anInt6863 = anIntArray602[anInt9261 + 2];
						local137.anInt6801 = anIntArray602[anInt9261 + 3];
						local137.anInt6846 = anIntArray602[anInt9261 + 4];
						local137.anInt6847 = anIntArray602[anInt9261 + 5];
						Static155.method2111(local137);
						if (local137.anInt6800 == -1) {
							Static247.method3521(local137.anInt6810);
							Static366.method5161(local137.anInt6810);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray602[--anInt9261];
						if (local137.anInt6799 != local19) {
							local137.anInt6799 = local19;
							local137.anInt6802 = 0;
							local137.anInt6833 = 1;
							local137.anInt6811 = 0;
							@Pc(1094) Class148 local1094 = local137.anInt6799 == -1 ? null : Static117.aClass18_1.method296(local137.anInt6799);
							if (local1094 != null) {
								Static28.method382(local1094, local137.anInt6802);
							}
							Static155.method2111(local137);
						}
						if (local137.anInt6800 == -1) {
							Static135.method6632(local137.anInt6810);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean556 = anIntArray602[--anInt9261] == 1;
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray40[--anInt9253];
						if (!local1145.equals(local137.aString104)) {
							local137.aString104 = local1145;
							Static155.method2111(local137);
						}
						if (local137.anInt6800 == -1) {
							Static363.method5136(local137.anInt6810);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt6860 = anIntArray602[--anInt9261];
						Static155.method2111(local137);
						if (local137.anInt6800 == -1) {
							Static184.method2359(local137.anInt6810);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt9261 -= 3;
						local137.anInt6841 = anIntArray602[anInt9261];
						local137.anInt6865 = anIntArray602[anInt9261 + 1];
						local137.anInt6806 = anIntArray602[anInt9261 + 2];
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean558 = anIntArray602[--anInt9261] == 1;
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt6824 = anIntArray602[--anInt9261];
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt6867 = anIntArray602[--anInt9261];
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean550 = anIntArray602[--anInt9261] == 1;
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean552 = anIntArray602[--anInt9261] == 1;
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt9261 -= 2;
						local137.anInt6857 = anIntArray602[anInt9261];
						local137.anInt6835 = anIntArray602[anInt9261 + 1];
						Static155.method2111(local137);
						if (local137.anInt6868 == 0) {
							Static576.method7471(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean559 = anIntArray602[--anInt9261] == 1;
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt6847 = anIntArray602[--anInt9261];
						Static155.method2111(local137);
						if (local137.anInt6800 == -1) {
							Static247.method3521(local137.anInt6810);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray602[--anInt9261];
						local137.aBoolean551 = local19 == 1;
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt9261 -= 2;
						local137.anInt6840 = anIntArray602[anInt9261];
						local137.anInt6791 = anIntArray602[anInt9261 + 1];
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt6815 = anIntArray602[--anInt9261];
						Static155.method2111(local137);
						return;
					}
					@Pc(1473) Class57 local1473;
					if (arg0 == 1127) {
						anInt9261 -= 2;
						local19 = anIntArray602[anInt9261];
						local25 = anIntArray602[anInt9261 + 1];
						local1473 = Static537.aClass191_2.method3971(local19);
						if (local25 != local1473.anInt1160) {
							local137.method5646(local19, local25);
							return;
						}
						local137.method5641(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray602[--anInt9261];
						local1507 = aStringArray40[--anInt9253];
						local1473 = Static537.aClass191_2.method3971(local19);
						if (!local1473.aString16.equals(local1507)) {
							local137.method5647(local1507, local19);
							return;
						}
						local137.method5641(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2309) int local2309;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static594.method7731(anIntArray602[--anInt9261]);
						} else {
							local137 = arg1 ? aClass273_13 : aClass273_12;
						}
						if (arg0 == 1300) {
							local19 = anIntArray602[--anInt9261] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method5645(aStringArray40[--anInt9253], local19);
								return;
							} else {
								anInt9253--;
								return;
							}
						}
						if (arg0 == 1301) {
							anInt9261 -= 2;
							local19 = anIntArray602[anInt9261];
							local25 = anIntArray602[anInt9261 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass273_11 = null;
								return;
							}
							local137.aClass273_11 = Static494.method6329(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray602[--anInt9261];
							if (local19 != Static26.anInt450 && local19 != Static133.anInt2153 && local19 != Static524.anInt8327) {
								return;
							}
							local137.anInt6877 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt6876 = anIntArray602[--anInt9261];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt6829 = anIntArray602[--anInt9261];
							return;
						}
						if (arg0 == 1305) {
							local137.aString103 = aStringArray40[--anInt9253];
							return;
						}
						if (arg0 == 1306) {
							local137.aString101 = aStringArray40[--anInt9253];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray34 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt6864 = anIntArray602[--anInt9261];
							local137.anInt6797 = anIntArray602[--anInt9261];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray602[--anInt9261];
							local25 = anIntArray602[--anInt9261];
							if (local25 >= 1 && local25 <= 10) {
								local137.method5648(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString100 = aStringArray40[--anInt9253];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt6818 = anIntArray602[--anInt9261];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt9261 -= 3;
								local19 = anIntArray602[anInt9261] - 1;
								local25 = anIntArray602[anInt9261 + 1];
								local353 = anIntArray602[anInt9261 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt9261 -= 2;
								local19 = 10;
								local25 = anIntArray602[anInt9261];
								local353 = anIntArray602[anInt9261 + 1];
							}
							if (local137.aByteArray65 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray65 = new byte[11];
								local137.lb = new byte[11];
								local137.anIntArray442 = new int[11];
							}
							local137.aByteArray65[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean544 = false;
								for (local2309 = 0; local2309 < local137.aByteArray65.length; local2309++) {
									if (local137.aByteArray65[local2309] != 0) {
										local137.aBoolean544 = true;
										break;
									}
								}
							} else {
								local137.aBoolean544 = true;
							}
							local137.lb[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt6881 = anIntArray602[--anInt9261];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static594.method7731(anIntArray602[--anInt9261]);
						} else {
							local137 = arg1 ? aClass273_13 : aClass273_12;
						}
						if (arg0 == 1499) {
							local137.method5630();
							return;
						}
						local1145 = aStringArray40[--anInt9253];
						@Pc(2395) int[] local2395 = null;
						if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
							local353 = anIntArray602[--anInt9261];
							if (local353 > 0) {
								local2395 = new int[local353];
								while (local353-- > 0) {
									local2395[local353] = anIntArray602[--anInt9261];
								}
							}
							local1145 = local1145.substring(0, local1145.length() - 1);
						}
						@Pc(2447) Object[] local2447 = new Object[local1145.length() + 1];
						for (local2309 = local2447.length - 1; local2309 >= 1; local2309--) {
							if (local1145.charAt(local2309 - 1) == 's') {
								local2447[local2309] = aStringArray40[--anInt9253];
							} else {
								local2447[local2309] = Integer.valueOf(anIntArray602[--anInt9261]);
							}
						}
						local56 = anIntArray602[--anInt9261];
						if (local56 == -1) {
							local2447 = null;
						} else {
							local2447[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray8 = local2447;
						} else if (arg0 == 1401) {
							local137.anObjectArray18 = local2447;
						} else if (arg0 == 1402) {
							local137.anObjectArray20 = local2447;
						} else if (arg0 == 1403) {
							local137.anObjectArray21 = local2447;
						} else if (arg0 == 1404) {
							local137.anObjectArray7 = local2447;
						} else if (arg0 == 1405) {
							local137.anObjectArray24 = local2447;
						} else if (arg0 == 1406) {
							local137.anObjectArray4 = local2447;
						} else if (arg0 == 1407) {
							local137.anObjectArray25 = local2447;
							local137.anIntArray443 = local2395;
						} else if (arg0 == 1408) {
							local137.anObjectArray19 = local2447;
						} else if (arg0 == 1409) {
							local137.anObjectArray10 = local2447;
						} else if (arg0 == 1410) {
							local137.anObjectArray6 = local2447;
						} else if (arg0 == 1411) {
							local137.anObjectArray13 = local2447;
						} else if (arg0 == 1412) {
							local137.anObjectArray29 = local2447;
						} else if (arg0 == 1414) {
							local137.anObjectArray33 = local2447;
							local137.anIntArray444 = local2395;
						} else if (arg0 == 1415) {
							local137.anObjectArray22 = local2447;
							local137.anIntArray441 = local2395;
						} else if (arg0 == 1416) {
							local137.anObjectArray17 = local2447;
						} else if (arg0 == 1417) {
							local137.anObjectArray23 = local2447;
						} else if (arg0 == 1418) {
							local137.anObjectArray5 = local2447;
						} else if (arg0 == 1419) {
							local137.anObjectArray27 = local2447;
						} else if (arg0 == 1420) {
							local137.anObjectArray31 = local2447;
						} else if (arg0 == 1421) {
							local137.anObjectArray26 = local2447;
						} else if (arg0 == 1422) {
							local137.anObjectArray32 = local2447;
						} else if (arg0 == 1423) {
							local137.anObjectArray3 = local2447;
						} else if (arg0 == 1424) {
							local137.anObjectArray11 = local2447;
						} else if (arg0 == 1425) {
							local137.anObjectArray16 = local2447;
						} else if (arg0 == 1426) {
							local137.anObjectArray15 = local2447;
						} else if (arg0 == 1427) {
							local137.anObjectArray14 = local2447;
						} else if (arg0 == 1428) {
							local137.anObjectArray9 = local2447;
							local137.anIntArray446 = local2395;
						} else if (arg0 == 1429) {
							local137.anObjectArray12 = local2447;
							local137.anIntArray448 = local2395;
						} else if (arg0 == 1430) {
							local137.anObjectArray30 = local2447;
						}
						local137.aBoolean545 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass273_13 : aClass273_12;
						if (arg0 == 1500) {
							anIntArray602[anInt9261++] = local137.anInt6817;
							return;
						}
						if (arg0 == 1501) {
							anIntArray602[anInt9261++] = local137.anInt6855;
							return;
						}
						if (arg0 == 1502) {
							anIntArray602[anInt9261++] = local137.anInt6883;
							return;
						}
						if (arg0 == 1503) {
							anIntArray602[anInt9261++] = local137.anInt6814;
							return;
						}
						if (arg0 == 1504) {
							anIntArray602[anInt9261++] = local137.aBoolean553 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray602[anInt9261++] = local137.anInt6820;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static561.method7333(local137);
							anIntArray602[anInt9261++] = local158 == null ? -1 : local158.anInt6810;
							return;
						}
					} else {
						@Pc(3043) Class57 local3043;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass273_13 : aClass273_12;
							if (arg0 == 1600) {
								anIntArray602[anInt9261++] = local137.anInt6812;
								return;
							}
							if (arg0 == 1601) {
								anIntArray602[anInt9261++] = local137.anInt6880;
								return;
							}
							if (arg0 == 1602) {
								aStringArray40[anInt9253++] = local137.aString104;
								return;
							}
							if (arg0 == 1603) {
								anIntArray602[anInt9261++] = local137.anInt6857;
								return;
							}
							if (arg0 == 1604) {
								anIntArray602[anInt9261++] = local137.anInt6835;
								return;
							}
							if (arg0 == 1605) {
								anIntArray602[anInt9261++] = local137.anInt6847;
								return;
							}
							if (arg0 == 1606) {
								anIntArray602[anInt9261++] = local137.anInt6863;
								return;
							}
							if (arg0 == 1607) {
								anIntArray602[anInt9261++] = local137.anInt6846;
								return;
							}
							if (arg0 == 1608) {
								anIntArray602[anInt9261++] = local137.anInt6801;
								return;
							}
							if (arg0 == 1609) {
								anIntArray602[anInt9261++] = local137.anInt6873;
								return;
							}
							if (arg0 == 1610) {
								anIntArray602[anInt9261++] = local137.anInt6798;
								return;
							}
							if (arg0 == 1611) {
								anIntArray602[anInt9261++] = local137.anInt6838;
								return;
							}
							if (arg0 == 1612) {
								anIntArray602[anInt9261++] = local137.anInt6842;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray602[--anInt9261];
								local3043 = Static537.aClass191_2.method3971(local19);
								if (local3043.method1108()) {
									aStringArray40[anInt9253++] = local137.method5633(local19, local3043.aString16);
									return;
								}
								anIntArray602[anInt9261++] = local137.method5642(local19, local3043.anInt1160);
								return;
							}
							if (arg0 == 1614) {
								anIntArray602[anInt9261++] = local137.anInt6796;
								return;
							}
							if (arg0 == 2614) {
								anIntArray602[anInt9261++] = local137.anInt6850 == 1 ? local137.anInt6828 : -1;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass273_13 : aClass273_12;
							if (arg0 == 1700) {
								anIntArray602[anInt9261++] = local137.anInt6805;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt6805 != -1) {
									anIntArray602[anInt9261++] = local137.anInt6830;
									return;
								}
								anIntArray602[anInt9261++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray602[anInt9261++] = local137.anInt6800;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass273_13 : aClass273_12;
							if (arg0 == 1800) {
								anIntArray602[anInt9261++] = Static70.method1164(local137).method2767();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray602[--anInt9261];
								local19--;
								if (local137.aStringArray34 != null && local19 < local137.aStringArray34.length && local137.aStringArray34[local19] != null) {
									aStringArray40[anInt9253++] = local137.aStringArray34[local19];
									return;
								}
								aStringArray40[anInt9253++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString103 == null) {
									aStringArray40[anInt9253++] = "";
									return;
								}
								aStringArray40[anInt9253++] = local137.aString103;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static594.method7731(anIntArray602[--anInt9261]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass273_13 : aClass273_12;
							}
							if (anInt9266 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray14 == null) {
									return;
								}
								@Pc(3312) Class2_Sub10 local3312 = new Class2_Sub10();
								local3312.aClass273_4 = local137;
								local3312.anObjectArray1 = local137.anObjectArray14;
								local3312.anInt1603 = anInt9266 + 1;
								Static213.aClass70_15.method1269(local3312);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static594.method7731(anIntArray602[--anInt9261]);
							if (arg0 == 2500) {
								anIntArray602[anInt9261++] = local137.anInt6817;
								return;
							}
							if (arg0 == 2501) {
								anIntArray602[anInt9261++] = local137.anInt6855;
								return;
							}
							if (arg0 == 2502) {
								anIntArray602[anInt9261++] = local137.anInt6883;
								return;
							}
							if (arg0 == 2503) {
								anIntArray602[anInt9261++] = local137.anInt6814;
								return;
							}
							if (arg0 == 2504) {
								anIntArray602[anInt9261++] = local137.aBoolean553 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray602[anInt9261++] = local137.anInt6820;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static561.method7333(local137);
								anIntArray602[anInt9261++] = local158 == null ? -1 : local158.anInt6810;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static594.method7731(anIntArray602[--anInt9261]);
							if (arg0 == 2600) {
								anIntArray602[anInt9261++] = local137.anInt6812;
								return;
							}
							if (arg0 == 2601) {
								anIntArray602[anInt9261++] = local137.anInt6880;
								return;
							}
							if (arg0 == 2602) {
								aStringArray40[anInt9253++] = local137.aString104;
								return;
							}
							if (arg0 == 2603) {
								anIntArray602[anInt9261++] = local137.anInt6857;
								return;
							}
							if (arg0 == 2604) {
								anIntArray602[anInt9261++] = local137.anInt6835;
								return;
							}
							if (arg0 == 2605) {
								anIntArray602[anInt9261++] = local137.anInt6847;
								return;
							}
							if (arg0 == 2606) {
								anIntArray602[anInt9261++] = local137.anInt6863;
								return;
							}
							if (arg0 == 2607) {
								anIntArray602[anInt9261++] = local137.anInt6846;
								return;
							}
							if (arg0 == 2608) {
								anIntArray602[anInt9261++] = local137.anInt6801;
								return;
							}
							if (arg0 == 2609) {
								anIntArray602[anInt9261++] = local137.anInt6873;
								return;
							}
							if (arg0 == 2610) {
								anIntArray602[anInt9261++] = local137.anInt6798;
								return;
							}
							if (arg0 == 2611) {
								anIntArray602[anInt9261++] = local137.anInt6838;
								return;
							}
							if (arg0 == 2612) {
								anIntArray602[anInt9261++] = local137.anInt6842;
								return;
							}
							if (arg0 == 2613) {
								anIntArray602[anInt9261++] = local137.anInt6796;
								return;
							}
							if (arg0 == 2614) {
								anIntArray602[anInt9261++] = local137.anInt6850 == 1 ? local137.anInt6828 : -1;
								return;
							}
						} else {
							@Pc(3841) Class2_Sub33 local3841;
							@Pc(3739) Class2_Sub33 local3739;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static594.method7731(anIntArray602[--anInt9261]);
									anIntArray602[anInt9261++] = local137.anInt6805;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static594.method7731(anIntArray602[--anInt9261]);
									if (local137.anInt6805 != -1) {
										anIntArray602[anInt9261++] = local137.anInt6830;
										return;
									}
									anIntArray602[anInt9261++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray602[--anInt9261];
									local3739 = (Class2_Sub33) Static346.aClass90_17.method1685((long) local13);
									if (local3739 != null) {
										anIntArray602[anInt9261++] = 1;
										return;
									}
									anIntArray602[anInt9261++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static594.method7731(anIntArray602[--anInt9261]);
									if (local137.aClass273Array2 == null) {
										anIntArray602[anInt9261++] = 0;
										return;
									}
									local19 = local137.aClass273Array2.length;
									for (local25 = 0; local25 < local137.aClass273Array2.length; local25++) {
										if (local137.aClass273Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray602[anInt9261++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt9261 -= 2;
									local13 = anIntArray602[anInt9261];
									local19 = anIntArray602[anInt9261 + 1];
									local3841 = (Class2_Sub33) Static346.aClass90_17.method1685((long) local13);
									if (local3841 != null && local3841.anInt5981 == local19) {
										anIntArray602[anInt9261++] = 1;
										return;
									}
									anIntArray602[anInt9261++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static594.method7731(anIntArray602[--anInt9261]);
								if (arg0 == 2800) {
									anIntArray602[anInt9261++] = Static70.method1164(local137).method2767();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray602[--anInt9261];
									local19--;
									if (local137.aStringArray34 != null && local19 < local137.aStringArray34.length && local137.aStringArray34[local19] != null) {
										aStringArray40[anInt9253++] = local137.aStringArray34[local19];
										return;
									}
									aStringArray40[anInt9253++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString103 == null) {
										aStringArray40[anInt9253++] = "";
										return;
									}
									aStringArray40[anInt9253++] = local137.aString103;
									return;
								}
							} else {
								@Pc(3978) String local3978;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3978 = aStringArray40[--anInt9253];
										Static78.method1225(local3978);
										return;
									}
									if (arg0 == 3101) {
										anInt9261 -= 2;
										Static590.method7669(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30, anIntArray602[anInt9261], anIntArray602[anInt9261 + 1]);
										return;
									}
									if (arg0 == 3103) {
										Static394.method5431();
										return;
									}
									if (arg0 == 3104) {
										local3978 = aStringArray40[--anInt9253];
										local19 = 0;
										if (Static531.method6990(local3978)) {
											local19 = Static559.method7310(local3978);
										}
										@Pc(4038) Class2_Sub34 local4038 = Static555.method7264(Static58.aClass154_9, Static551.aClass64_2);
										local4038.aClass2_Sub7_Sub2_2.method4495(local19);
										Static100.method1508(local4038);
										return;
									}
									@Pc(4067) Class2_Sub34 local4067;
									if (arg0 == 3105) {
										local3978 = aStringArray40[--anInt9253];
										local4067 = Static555.method7264(Static66.aClass154_10, Static551.aClass64_2);
										local4067.aClass2_Sub7_Sub2_2.method4459(local3978.length() + 1);
										local4067.aClass2_Sub7_Sub2_2.method4481(local3978);
										Static100.method1508(local4067);
										return;
									}
									if (arg0 == 3106) {
										local3978 = aStringArray40[--anInt9253];
										local4067 = Static555.method7264(Static75.aClass154_15, Static551.aClass64_2);
										local4067.aClass2_Sub7_Sub2_2.method4459(local3978.length() + 1);
										local4067.aClass2_Sub7_Sub2_2.method4481(local3978);
										Static100.method1508(local4067);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray602[--anInt9261];
										local1145 = aStringArray40[--anInt9253];
										Static313.method4531(local1145, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt9261 -= 3;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										local25 = anIntArray602[anInt9261 + 2];
										local35 = Static594.method7731(local25);
										Static404.method5507(local35, local13, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										local210 = arg1 ? aClass273_13 : aClass273_12;
										Static404.method5507(local210, local13, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray602[--anInt9261];
										local4067 = Static555.method7264(Static191.aClass154_38, Static551.aClass64_2);
										local4067.aClass2_Sub7_Sub2_2.method4511(local13);
										Static100.method1508(local4067);
										return;
									}
									if (arg0 == 3111) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										local3841 = (Class2_Sub33) Static346.aClass90_17.method1685((long) local13);
										if (local3841 != null) {
											Static393.method5411(true, local3841, local3841.anInt5981 != local19);
										}
										Static171.method2239(local13, true, 3, local19);
										return;
									}
									if (arg0 == 3112) {
										anInt9261--;
										local13 = anIntArray602[anInt9261];
										local3739 = (Class2_Sub33) Static346.aClass90_17.method1685((long) local13);
										if (local3739 != null && local3739.anInt5985 == 3) {
											Static393.method5411(true, local3739, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static554.method7255(aStringArray40[--anInt9253]);
										return;
									}
									if (arg0 == 3114) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										local1507 = aStringArray40[--anInt9253];
										Static316.method4596("", local13, local1507, "", "", local19);
										return;
									}
									if (arg0 == 3115) {
										anInt9261 -= 11;
										@Pc(4368) Class322[] local4368 = Static30.method394();
										@Pc(4371) Class347[] local4371 = Static226.method2754();
										Static589.method7516(anIntArray602[anInt9261 + 6], anIntArray602[anInt9261 + 9], local4371[anIntArray602[anInt9261 + 1]], anIntArray602[anInt9261 + 8], anIntArray602[anInt9261 + 3], anIntArray602[anInt9261 + 10], local4368[anIntArray602[anInt9261]], anIntArray602[anInt9261 + 2], anIntArray602[anInt9261 + 4], anIntArray602[anInt9261 + 7], anIntArray602[anInt9261 + 5]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt9261 -= 3;
										Static86.method1275(255, anIntArray602[anInt9261], 256, anIntArray602[anInt9261 + 2], anIntArray602[anInt9261 + 1]);
										return;
									}
									if (arg0 == 3201) {
										Static63.method1089(255, 50, anIntArray602[--anInt9261]);
										return;
									}
									if (arg0 == 3202) {
										anInt9261 -= 2;
										Static248.method3531(anIntArray602[anInt9261 + 1], 255, anIntArray602[anInt9261]);
										return;
									}
									if (arg0 == 3203) {
										anInt9261 -= 4;
										Static86.method1275(anIntArray602[anInt9261 + 3], anIntArray602[anInt9261], 256, anIntArray602[anInt9261 + 2], anIntArray602[anInt9261 + 1]);
										return;
									}
									if (arg0 == 3204) {
										anInt9261 -= 3;
										Static63.method1089(anIntArray602[anInt9261 + 1], anIntArray602[anInt9261 + 2], anIntArray602[anInt9261]);
										return;
									}
									if (arg0 == 3205) {
										anInt9261 -= 3;
										Static248.method3531(anIntArray602[anInt9261 + 1], anIntArray602[anInt9261 + 2], anIntArray602[anInt9261]);
										return;
									}
									if (arg0 == 3206) {
										anInt9261 -= 4;
										Static351.method5040(false, anIntArray602[anInt9261 + 1], anIntArray602[anInt9261 + 2], 256, anIntArray602[anInt9261], anIntArray602[anInt9261 + 3]);
										return;
									}
									if (arg0 == 3207) {
										anInt9261 -= 4;
										Static351.method5040(true, anIntArray602[anInt9261 + 1], anIntArray602[anInt9261 + 2], 256, anIntArray602[anInt9261], anIntArray602[anInt9261 + 3]);
										return;
									}
									if (arg0 == 3208) {
										anInt9261 -= 5;
										Static86.method1275(anIntArray602[anInt9261 + 3], anIntArray602[anInt9261], anIntArray602[anInt9261 + 4], anIntArray602[anInt9261 + 2], anIntArray602[anInt9261 + 1]);
										return;
									}
									if (arg0 == 3209) {
										anInt9261 -= 5;
										Static351.method5040(false, anIntArray602[anInt9261 + 1], anIntArray602[anInt9261 + 2], anIntArray602[anInt9261 + 4], anIntArray602[anInt9261], anIntArray602[anInt9261 + 3]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray602[anInt9261++] = Static532.anInt8757;
										return;
									}
									if (arg0 == 3301) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = Static384.method5328(local13, false, local19);
										return;
									}
									if (arg0 == 3302) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = Static473.method6137(local13, false, local19);
										return;
									}
									if (arg0 == 3303) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = Static236.method3367(local19, local13, false);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static569.aClass113_1.method2089(local13).anInt7604;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static452.anIntArray487[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static18.anIntArray300[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static102.anIntArray157[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4896) byte local4896 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128;
										local19 = (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374 >> 9) + Static485.anInt7725;
										local25 = (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375 >> 9) + Static310.anInt5129;
										anIntArray602[anInt9261++] = (local4896 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray602[anInt9261++] = Static524.aBoolean704 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = Static384.method5328(local13, true, local19);
										return;
									}
									if (arg0 == 3314) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = Static473.method6137(local13, true, local19);
										return;
									}
									if (arg0 == 3315) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = Static236.method3367(local19, local13, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static11.anInt294 >= 2) {
											anIntArray602[anInt9261++] = Static11.anInt294;
											return;
										}
										anIntArray602[anInt9261++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray602[anInt9261++] = Static593.anInt9634;
										return;
									}
									if (arg0 == 3318) {
										anIntArray602[anInt9261++] = Static489.aClass292_5.anInt7261;
										return;
									}
									if (arg0 == 3321) {
										anIntArray602[anInt9261++] = Static259.anInt4287;
										return;
									}
									if (arg0 == 3322) {
										anIntArray602[anInt9261++] = Static416.anInt2616;
										return;
									}
									if (arg0 == 3323) {
										if (Static165.anInt2540 >= 5 && Static165.anInt2540 <= 9) {
											anIntArray602[anInt9261++] = 1;
											return;
										}
										anIntArray602[anInt9261++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static165.anInt2540 >= 5 && Static165.anInt2540 <= 9) {
											anIntArray602[anInt9261++] = Static165.anInt2540;
											return;
										}
										anIntArray602[anInt9261++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray602[anInt9261++] = Static327.aBoolean433 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray602[anInt9261++] = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt5822;
										return;
									}
									if (arg0 == 3327) {
										anIntArray602[anInt9261++] = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aClass300_1.aBoolean622 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray602[anInt9261++] = Static395.aBoolean806 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static438.method5747(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = Static207.method2571(local19, local13, false);
										return;
									}
									if (arg0 == 3332) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = Static207.method2571(local19, local13, true);
										return;
									}
									if (arg0 == 3333) {
										anIntArray602[anInt9261++] = Static124.anInt9459;
										return;
									}
									if (arg0 == 3335) {
										anIntArray602[anInt9261++] = Static261.anInt4297;
										return;
									}
									if (arg0 == 3336) {
										anInt9261 -= 4;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										local25 = anIntArray602[anInt9261 + 2];
										local353 = anIntArray602[anInt9261 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray602[anInt9261++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray602[anInt9261++] = Static516.anInt8248;
										return;
									}
									if (arg0 == 3338) {
										anIntArray602[anInt9261++] = Static410.method5541();
										return;
									}
									if (arg0 == 3339) {
										anIntArray602[anInt9261++] = Static574.aBoolean775 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray602[anInt9261++] = Static287.aBoolean374 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray602[anInt9261++] = Static269.aBoolean329 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray602[anInt9261++] = Static205.aClass131_1.method6544();
										return;
									}
									if (arg0 == 3343) {
										anIntArray602[anInt9261++] = Static205.aClass131_1.method6542();
										return;
									}
									if (arg0 == 3344) {
										aStringArray40[anInt9253++] = Static294.method7720();
										return;
									}
									if (arg0 == 3345) {
										aStringArray40[anInt9253++] = Static118.method1722();
										return;
									}
									if (arg0 == 3346) {
										anIntArray602[anInt9261++] = Static220.method2685();
										return;
									}
									if (arg0 == 3347) {
										anIntArray602[anInt9261++] = Static37.anInt678;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5631) Class108 local5631;
									if (arg0 == 3400) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										local5631 = Static407.aClass215_1.method4452(local13);
										aStringArray40[anInt9253++] = local5631.method1997(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt9261 -= 4;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										local25 = anIntArray602[anInt9261 + 2];
										local353 = anIntArray602[anInt9261 + 3];
										@Pc(5677) Class108 local5677 = Static407.aClass215_1.method4452(local25);
										if (local5677.aChar2 == local13 && local5677.aChar3 == local19) {
											if (local19 == 115) {
												aStringArray40[anInt9253++] = local5677.method1997(local353);
												return;
											}
											anIntArray602[anInt9261++] = local5677.method2002(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt9261 -= 3;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										local25 = anIntArray602[anInt9261 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5753) Class108 local5753 = Static407.aClass215_1.method4452(local19);
										if (local5753.aChar3 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray602[anInt9261++] = local5753.method1992(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray602[--anInt9261];
										local1145 = aStringArray40[--anInt9253];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5631 = Static407.aClass215_1.method4452(local13);
										if (local5631.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray602[anInt9261++] = local5631.method1996(local1145) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray602[--anInt9261];
										@Pc(5851) Class108 local5851 = Static407.aClass215_1.method4452(local13);
										anIntArray602[anInt9261++] = local5851.aClass90_6.method1679();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static196.anInt2849 == 0) {
											anIntArray602[anInt9261++] = -2;
											return;
										}
										if (Static196.anInt2849 == 1) {
											anIntArray602[anInt9261++] = -1;
											return;
										}
										anIntArray602[anInt9261++] = Static107.anInt1861;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray602[--anInt9261];
										if (Static196.anInt2849 == 2 && local13 < Static107.anInt1861) {
											aStringArray40[anInt9253++] = Static394.aStringArray33[local13];
											if (Static197.aStringArray18[local13] != null) {
												aStringArray40[anInt9253++] = Static197.aStringArray18[local13];
												return;
											}
											aStringArray40[anInt9253++] = "";
											return;
										}
										aStringArray40[anInt9253++] = "";
										aStringArray40[anInt9253++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray602[--anInt9261];
										if (Static196.anInt2849 == 2 && local13 < Static107.anInt1861) {
											anIntArray602[anInt9261++] = Static166.anIntArray213[local13];
											return;
										}
										anIntArray602[anInt9261++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray602[--anInt9261];
										if (Static196.anInt2849 == 2 && local13 < Static107.anInt1861) {
											anIntArray602[anInt9261++] = Static173.anIntArray219[local13];
											return;
										}
										anIntArray602[anInt9261++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3978 = aStringArray40[--anInt9253];
										local19 = anIntArray602[--anInt9261];
										Static295.method4257(local3978, local19);
										return;
									}
									if (arg0 == 3605) {
										local3978 = aStringArray40[--anInt9253];
										Static543.method7107(local3978);
										return;
									}
									if (arg0 == 3606) {
										local3978 = aStringArray40[--anInt9253];
										Static503.method6528(local3978);
										return;
									}
									if (arg0 == 3607) {
										local3978 = aStringArray40[--anInt9253];
										Static144.method1988(local3978, false);
										return;
									}
									if (arg0 == 3608) {
										local3978 = aStringArray40[--anInt9253];
										Static348.method5028(local3978);
										return;
									}
									if (arg0 == 3609) {
										local3978 = aStringArray40[--anInt9253];
										if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
											local3978 = local3978.substring(7);
										}
										anIntArray602[anInt9261++] = Static502.method6526(local3978) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray602[--anInt9261];
										if (Static196.anInt2849 == 2 && local13 < Static107.anInt1861) {
											aStringArray40[anInt9253++] = Static74.aStringArray8[local13];
											return;
										}
										aStringArray40[anInt9253++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static124.aString144 != null) {
											aStringArray40[anInt9253++] = Static53.method7504(Static124.aString144);
											return;
										}
										aStringArray40[anInt9253++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static124.aString144 != null) {
											anIntArray602[anInt9261++] = Static399.anInt6590;
											return;
										}
										anIntArray602[anInt9261++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray602[--anInt9261];
										if (Static124.aString144 != null && local13 < Static399.anInt6590) {
											aStringArray40[anInt9253++] = Static502.aClass53Array1[local13].aString15;
											return;
										}
										aStringArray40[anInt9253++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray602[--anInt9261];
										if (Static124.aString144 != null && local13 < Static399.anInt6590) {
											anIntArray602[anInt9261++] = Static502.aClass53Array1[local13].anInt1144;
											return;
										}
										anIntArray602[anInt9261++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray602[--anInt9261];
										if (Static124.aString144 != null && local13 < Static399.anInt6590) {
											anIntArray602[anInt9261++] = Static502.aClass53Array1[local13].aByte13;
											return;
										}
										anIntArray602[anInt9261++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray602[anInt9261++] = Static448.aByte15;
										return;
									}
									if (arg0 == 3617) {
										local3978 = aStringArray40[--anInt9253];
										Static340.method4949(local3978);
										return;
									}
									if (arg0 == 3618) {
										anIntArray602[anInt9261++] = Static2.aByte1;
										return;
									}
									if (arg0 == 3619) {
										local3978 = aStringArray40[--anInt9253];
										Static65.method1095(local3978);
										return;
									}
									if (arg0 == 3620) {
										Static440.method5781();
										return;
									}
									if (arg0 == 3621) {
										if (Static196.anInt2849 == 0) {
											anIntArray602[anInt9261++] = -1;
											return;
										}
										anIntArray602[anInt9261++] = Static225.anInt3293;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray602[--anInt9261];
										if (Static196.anInt2849 != 0 && local13 < Static225.anInt3293) {
											aStringArray40[anInt9253++] = Static582.aStringArray44[local13];
											if (Static117.aStringArray13[local13] != null) {
												aStringArray40[anInt9253++] = Static117.aStringArray13[local13];
												return;
											}
											aStringArray40[anInt9253++] = "";
											return;
										}
										aStringArray40[anInt9253++] = "";
										aStringArray40[anInt9253++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3978 = aStringArray40[--anInt9253];
										if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
											local3978 = local3978.substring(7);
										}
										anIntArray602[anInt9261++] = Static520.method6723(local3978) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray602[--anInt9261];
										if (Static502.aClass53Array1 != null && local13 < Static399.anInt6590 && Static502.aClass53Array1[local13].aString13.equalsIgnoreCase(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aString75)) {
											anIntArray602[anInt9261++] = 1;
											return;
										}
										anIntArray602[anInt9261++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static394.aString92 != null) {
											aStringArray40[anInt9253++] = Static394.aString92;
											return;
										}
										aStringArray40[anInt9253++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray602[--anInt9261];
										if (Static124.aString144 != null && local13 < Static399.anInt6590) {
											aStringArray40[anInt9253++] = Static502.aClass53Array1[local13].aString12;
											return;
										}
										aStringArray40[anInt9253++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray602[--anInt9261];
										if (Static196.anInt2849 == 2 && local13 >= 0 && local13 < Static107.anInt1861) {
											anIntArray602[anInt9261++] = Static282.aBooleanArray19[local13] ? 1 : 0;
											return;
										}
										anIntArray602[anInt9261++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3978 = aStringArray40[--anInt9253];
										if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
											local3978 = local3978.substring(7);
										}
										anIntArray602[anInt9261++] = Static143.method5993(local3978);
										return;
									}
									if (arg0 == 3629) {
										anIntArray602[anInt9261++] = Static354.anInt6045;
										return;
									}
									if (arg0 == 3630) {
										local3978 = aStringArray40[--anInt9253];
										Static144.method1988(local3978, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static429.aBooleanArray24[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray602[--anInt9261];
										if (Static124.aString144 != null && local13 < Static399.anInt6590) {
											aStringArray40[anInt9253++] = Static502.aClass53Array1[local13].aString13;
											return;
										}
										aStringArray40[anInt9253++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray602[--anInt9261];
										if (Static196.anInt2849 != 0 && local13 < Static225.anInt3293) {
											aStringArray40[anInt9253++] = Static78.aStringArray9[local13];
											return;
										}
										aStringArray40[anInt9253++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static280.aClass92Array1[local13].method1725();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static280.aClass92Array1[local13].anInt2087;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static280.aClass92Array1[local13].anInt2084;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static280.aClass92Array1[local13].anInt2092;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static280.aClass92Array1[local13].anInt2090;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static280.aClass92Array1[local13].anInt2089;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray602[--anInt9261];
										local19 = Static280.aClass92Array1[local13].method1724();
										anIntArray602[anInt9261++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray602[--anInt9261];
										local19 = Static280.aClass92Array1[local13].method1724();
										anIntArray602[anInt9261++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray602[--anInt9261];
										local19 = Static280.aClass92Array1[local13].method1724();
										anIntArray602[anInt9261++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray602[--anInt9261];
										local19 = Static280.aClass92Array1[local13].method1724();
										anIntArray602[anInt9261++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt9261 -= 5;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										local25 = anIntArray602[anInt9261 + 2];
										local353 = anIntArray602[anInt9261 + 3];
										local2309 = anIntArray602[anInt9261 + 4];
										anIntArray602[anInt9261++] = local13 + (local19 - local13) * (local2309 - local25) / (local353 - local25);
										return;
									}
									@Pc(7361) long local7361;
									@Pc(7354) long local7354;
									if (arg0 == 4007) {
										anInt9261 -= 2;
										local7354 = anIntArray602[anInt9261];
										local7361 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = (int) (local7354 + local7354 * local7361 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										if (local13 == 0) {
											anIntArray602[anInt9261++] = 0;
											return;
										}
										anIntArray602[anInt9261++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										if (local13 == 0) {
											anIntArray602[anInt9261++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray602[anInt9261++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray602[anInt9261++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt9261 -= 3;
										local7354 = anIntArray602[anInt9261];
										local7361 = anIntArray602[anInt9261 + 1];
										@Pc(7742) long local7742 = (long) anIntArray602[anInt9261 + 2];
										anIntArray602[anInt9261++] = (int) (local7354 * local7742 / local7361);
										return;
									}
									if (arg0 == 4019) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										if (local13 > 700 || local19 > 700) {
											anIntArray602[anInt9261++] = 256;
										}
										@Pc(7801) double local7801 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
										anIntArray602[anInt9261++] = (int) (Math.pow(2.0D, local7801) + 0.5D);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3978 = aStringArray40[--anInt9253];
										local19 = anIntArray602[--anInt9261];
										aStringArray40[anInt9253++] = local3978 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt9253 -= 2;
										local3978 = aStringArray40[anInt9253];
										local1145 = aStringArray40[anInt9253 + 1];
										aStringArray40[anInt9253++] = local3978 + local1145;
										return;
									}
									if (arg0 == 4102) {
										local3978 = aStringArray40[--anInt9253];
										local19 = anIntArray602[--anInt9261];
										aStringArray40[anInt9253++] = local3978 + Static150.method2085(local19);
										return;
									}
									if (arg0 == 4103) {
										local3978 = aStringArray40[--anInt9253];
										aStringArray40[anInt9253++] = local3978.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray40[anInt9253++] = method7403(anIntArray602[--anInt9261]);
										return;
									}
									if (arg0 == 4105) {
										anInt9253 -= 2;
										local3978 = aStringArray40[anInt9253];
										local1145 = aStringArray40[anInt9253 + 1];
										if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aClass300_1 != null && Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aClass300_1.aBoolean622) {
											aStringArray40[anInt9253++] = local1145;
											return;
										}
										aStringArray40[anInt9253++] = local3978;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray602[--anInt9261];
										aStringArray40[anInt9253++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt9253 -= 2;
										anIntArray602[anInt9261++] = Static96.method1457(aStringArray40[anInt9253 + 1], aStringArray40[anInt9253], Static261.anInt4297);
										return;
									}
									@Pc(8084) Class112 local8084;
									if (arg0 == 4108) {
										local3978 = aStringArray40[--anInt9253];
										anInt9261 -= 2;
										local19 = anIntArray602[anInt9261];
										local25 = anIntArray602[anInt9261 + 1];
										local8084 = Static226.method2755(local25, Static191.aClass229_45);
										anIntArray602[anInt9261++] = local8084.method2084(local19, Static331.aClass38Array18, local3978);
										return;
									}
									if (arg0 == 4109) {
										local3978 = aStringArray40[--anInt9253];
										anInt9261 -= 2;
										local19 = anIntArray602[anInt9261];
										local25 = anIntArray602[anInt9261 + 1];
										local8084 = Static226.method2755(local25, Static191.aClass229_45);
										anIntArray602[anInt9261++] = local8084.method2083(Static331.aClass38Array18, local19, local3978);
										return;
									}
									if (arg0 == 4110) {
										anInt9253 -= 2;
										local3978 = aStringArray40[anInt9253];
										local1145 = aStringArray40[anInt9253 + 1];
										if (anIntArray602[--anInt9261] == 1) {
											aStringArray40[anInt9253++] = local3978;
											return;
										}
										aStringArray40[anInt9253++] = local1145;
										return;
									}
									if (arg0 == 4111) {
										local3978 = aStringArray40[--anInt9253];
										aStringArray40[anInt9253++] = Static315.method4559(local3978);
										return;
									}
									if (arg0 == 4112) {
										local3978 = aStringArray40[--anInt9253];
										local19 = anIntArray602[--anInt9261];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray40[anInt9253++] = local3978 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static244.method3473((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static581.method7526((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static349.method5583((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static488.method6259((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3978 = aStringArray40[--anInt9253];
										if (local3978 != null) {
											anIntArray602[anInt9261++] = local3978.length();
											return;
										}
										anIntArray602[anInt9261++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3978 = aStringArray40[--anInt9253];
										anInt9261 -= 2;
										local19 = anIntArray602[anInt9261];
										local25 = anIntArray602[anInt9261 + 1];
										aStringArray40[anInt9253++] = local3978.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3978 = aStringArray40[--anInt9253];
										@Pc(8447) StringBuffer local8447 = new StringBuffer(local3978.length());
										@Pc(8449) boolean local8449 = false;
										for (local353 = 0; local353 < local3978.length(); local353++) {
											@Pc(8456) char local8456 = local3978.charAt(local353);
											if (local8456 == '<') {
												local8449 = true;
											} else if (local8456 == '>') {
												local8449 = false;
											} else if (!local8449) {
												local8447.append(local8456);
											}
										}
										aStringArray40[anInt9253++] = local8447.toString();
										return;
									}
									if (arg0 == 4120) {
										local3978 = aStringArray40[--anInt9253];
										anInt9261 -= 2;
										local19 = anIntArray602[anInt9261];
										local25 = anIntArray602[anInt9261 + 1];
										anIntArray602[anInt9261++] = local3978.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt9253 -= 2;
										local3978 = aStringArray40[anInt9253];
										local1145 = aStringArray40[anInt9253 + 1];
										local25 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = local3978.indexOf(local1145, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray602[--anInt9261] != 0;
										local19 = anIntArray602[--anInt9261];
										aStringArray40[anInt9253++] = Static170.method2219((long) local19, 0, Static261.anInt4297, local412);
										return;
									}
									if (arg0 == 4125) {
										local3978 = aStringArray40[--anInt9253];
										local19 = anIntArray602[--anInt9261];
										@Pc(8670) Class112 local8670 = Static226.method2755(local19, Static191.aClass229_45);
										anIntArray602[anInt9261++] = local8670.method2079(Static331.aClass38Array18, local3978);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray602[--anInt9261];
										aStringArray40[anInt9253++] = Static466.aClass130_2.method2311(local13).aString48;
										return;
									}
									@Pc(8732) Class164 local8732;
									if (arg0 == 4201) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										local8732 = Static466.aClass130_2.method2311(local13);
										if (local19 >= 1 && local19 <= 5 && local8732.aStringArray22[local19 - 1] != null) {
											aStringArray40[anInt9253++] = local8732.aStringArray22[local19 - 1];
											return;
										}
										aStringArray40[anInt9253++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										local8732 = Static466.aClass130_2.method2311(local13);
										if (local19 >= 1 && local19 <= 5 && local8732.aStringArray23[local19 - 1] != null) {
											aStringArray40[anInt9253++] = local8732.aStringArray23[local19 - 1];
											return;
										}
										aStringArray40[anInt9253++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static466.aClass130_2.method2311(local13).anInt3834;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static466.aClass130_2.method2311(local13).anInt3860 == 1 ? 1 : 0;
										return;
									}
									@Pc(8895) Class164 local8895;
									if (arg0 == 4205) {
										local13 = anIntArray602[--anInt9261];
										local8895 = Static466.aClass130_2.method2311(local13);
										if (local8895.anInt3874 == -1 && local8895.anInt3852 >= 0) {
											anIntArray602[anInt9261++] = local8895.anInt3852;
											return;
										}
										anIntArray602[anInt9261++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray602[--anInt9261];
										local8895 = Static466.aClass130_2.method2311(local13);
										if (local8895.anInt3874 >= 0 && local8895.anInt3852 >= 0) {
											anIntArray602[anInt9261++] = local8895.anInt3852;
											return;
										}
										anIntArray602[anInt9261++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static466.aClass130_2.method2311(local13).aBoolean292 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										local3043 = Static537.aClass191_2.method3971(local19);
										if (local3043.method1108()) {
											aStringArray40[anInt9253++] = Static466.aClass130_2.method2311(local13).method3329(local19, local3043.aString16);
											return;
										}
										anIntArray602[anInt9261++] = Static466.aClass130_2.method2311(local13).method3320(local3043.anInt1160, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1] - 1;
										local8732 = Static466.aClass130_2.method2311(local13);
										if (local8732.anInt3877 == local19) {
											anIntArray602[anInt9261++] = local8732.anInt3864;
											return;
										}
										if (local8732.anInt3884 == local19) {
											anIntArray602[anInt9261++] = local8732.anInt3835;
											return;
										}
										anIntArray602[anInt9261++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3978 = aStringArray40[--anInt9253];
										local19 = anIntArray602[--anInt9261];
										Static6.method122(local3978, local19 == 1);
										anIntArray602[anInt9261++] = Static380.anInt8020;
										return;
									}
									if (arg0 == 4211) {
										if (Static496.aShortArray121 != null && Static507.anInt8114 < Static380.anInt8020) {
											anIntArray602[anInt9261++] = Static496.aShortArray121[Static507.anInt8114++] & 0xFFFF;
											return;
										}
										anIntArray602[anInt9261++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static507.anInt8114 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray602[--anInt9261];
										anIntArray602[anInt9261++] = Static466.aClass130_2.method2311(local13).anInt3878;
										return;
									}
									if (arg0 == 4214) {
										local3978 = aStringArray40[--anInt9253];
										anInt9261 -= 3;
										local19 = anIntArray602[anInt9261];
										local25 = anIntArray602[anInt9261 + 1];
										local353 = anIntArray602[anInt9261 + 2];
										Static472.method6123(local19 == 1, local25, local353, local3978);
										anIntArray602[anInt9261++] = Static380.anInt8020;
										return;
									}
									if (arg0 == 4215) {
										anInt9253 -= 2;
										anInt9261 -= 2;
										local3978 = aStringArray40[anInt9253];
										local19 = anIntArray602[anInt9261];
										local25 = anIntArray602[anInt9261 + 1];
										@Pc(9294) String local9294 = aStringArray40[anInt9253 + 1];
										Static505.method6535(local19 == 1, local9294, local25, local3978);
										anIntArray602[anInt9261++] = Static380.anInt8020;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										local3043 = Static537.aClass191_2.method3971(local19);
										if (local3043.method1108()) {
											aStringArray40[anInt9253++] = Static76.aClass361_1.method7581(local13).method5946(local3043.aString16, local19);
											return;
										}
										anIntArray602[anInt9261++] = Static76.aClass361_1.method7581(local13).method5944(local19, local3043.anInt1160);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										local3043 = Static537.aClass191_2.method3971(local19);
										if (local3043.method1108()) {
											aStringArray40[anInt9253++] = Static362.aClass290_2.method5799(local13).method4545(local19, local3043.aString16);
											return;
										}
										anIntArray602[anInt9261++] = Static362.aClass290_2.method5799(local13).method4555(local19, local3043.anInt1160);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt9261 -= 2;
										local13 = anIntArray602[anInt9261];
										local19 = anIntArray602[anInt9261 + 1];
										local3043 = Static537.aClass191_2.method3971(local19);
										if (local3043.method1108()) {
											aStringArray40[anInt9253++] = Static337.aClass26_1.method393(local13).method5500(local19, local3043.aString16);
											return;
										}
										anIntArray602[anInt9261++] = Static337.aClass26_1.method393(local13).method5502(local3043.anInt1160, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray602[--anInt9261];
									@Pc(9522) Class61 local9522 = Static380.aClass221_3.method4666(local13);
									if (local9522.anIntArray127 != null && local9522.anIntArray127.length > 0) {
										local25 = 0;
										local353 = local9522.anIntArray124[0];
										for (local2309 = 1; local2309 < local9522.anIntArray127.length; local2309++) {
											if (local9522.anIntArray124[local2309] > local353) {
												local25 = local2309;
												local353 = local9522.anIntArray124[local2309];
											}
										}
										anIntArray602[anInt9261++] = local9522.anIntArray127[local25];
										return;
									}
									anIntArray602[anInt9261++] = local9522.anInt1314;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static594.method7731(anIntArray602[--anInt9261]);
					} else {
						local137 = arg1 ? aClass273_13 : aClass273_12;
					}
					Static155.method2111(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt9261 -= 2;
						local19 = anIntArray602[anInt9261];
						local25 = anIntArray602[anInt9261 + 1];
						if (local137.anInt6800 == -1) {
							Static130.method1764(local137.anInt6810);
							Static247.method3521(local137.anInt6810);
							Static366.method5161(local137.anInt6810);
						}
						if (local19 == -1) {
							local137.anInt6850 = 1;
							local137.anInt6828 = -1;
							local137.anInt6805 = -1;
							return;
						}
						local137.anInt6805 = local19;
						local137.anInt6830 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean547 = true;
						} else {
							local137.aBoolean547 = false;
						}
						@Pc(1649) Class164 local1649 = Static466.aClass130_2.method2311(local19);
						local137.anInt6863 = local1649.anInt3881;
						local137.anInt6801 = local1649.anInt3868;
						local137.anInt6846 = local1649.anInt3828;
						local137.anInt6798 = local1649.anInt3876;
						local137.anInt6838 = local1649.anInt3887;
						local137.anInt6847 = local1649.anInt3827;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt6813 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt6813 = 1;
						} else {
							local137.anInt6813 = 2;
						}
						if (local137.anInt6849 > 0) {
							local137.anInt6847 = local137.anInt6847 * 32 / local137.anInt6849;
							return;
						}
						if (local137.anInt6871 > 0) {
							local137.anInt6847 = local137.anInt6847 * 32 / local137.anInt6871;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt6850 = 2;
						local137.anInt6828 = anIntArray602[--anInt9261];
						if (local137.anInt6800 == -1) {
							Static202.method2529(local137.anInt6810);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt6850 = 3;
						local137.anInt6828 = -1;
						if (local137.anInt6800 == -1) {
							Static202.method2529(local137.anInt6810);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt6850 = 6;
						local137.anInt6828 = anIntArray602[--anInt9261];
						if (local137.anInt6800 == -1) {
							Static202.method2529(local137.anInt6810);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt6850 = 5;
						local137.anInt6828 = anIntArray602[--anInt9261];
						if (local137.anInt6800 == -1) {
							Static202.method2529(local137.anInt6810);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt9261 -= 4;
						local137.anInt6790 = anIntArray602[anInt9261];
						local137.anInt6851 = anIntArray602[anInt9261 + 1];
						local137.anInt6826 = anIntArray602[anInt9261 + 2];
						local137.anInt6853 = anIntArray602[anInt9261 + 3];
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt9261 -= 2;
						local137.anInt6807 = anIntArray602[anInt9261];
						local137.anInt6845 = anIntArray602[anInt9261 + 1];
						Static155.method2111(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt9261 -= 4;
						local137.anInt6828 = anIntArray602[anInt9261];
						local137.anInt6874 = anIntArray602[anInt9261 + 1];
						if (anIntArray602[anInt9261 + 2] == 1) {
							local137.anInt6850 = 9;
						} else {
							local137.anInt6850 = 8;
						}
						if (anIntArray602[anInt9261 + 3] == 1) {
							local137.aBoolean547 = true;
						} else {
							local137.aBoolean547 = false;
						}
						if (local137.anInt6800 == -1) {
							Static202.method2529(local137.anInt6810);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt6850 = 5;
						local137.anInt6828 = Static18.anInt4109;
						local137.anInt6874 = 0;
						if (local137.anInt6800 == -1) {
							Static202.method2529(local137.anInt6810);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static594.method7731(anIntArray602[--anInt9261]);
				} else {
					local137 = arg1 ? aClass273_13 : aClass273_12;
				}
				if (arg0 == 1000) {
					anInt9261 -= 4;
					local137.anInt6819 = anIntArray602[anInt9261];
					local137.anInt6836 = anIntArray602[anInt9261 + 1];
					local19 = anIntArray602[anInt9261 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray602[anInt9261 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte88 = (byte) local19;
					local137.aByte90 = (byte) local25;
					Static155.method2111(local137);
					Static278.method3513(local137);
					if (local137.anInt6800 == -1) {
						Static538.method7058(local137.anInt6810);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt9261 -= 4;
					local137.anInt6871 = anIntArray602[anInt9261];
					local137.anInt6861 = anIntArray602[anInt9261 + 1];
					local137.anInt6849 = 0;
					local137.anInt6866 = 0;
					local19 = anIntArray602[anInt9261 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray602[anInt9261 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte87 = (byte) local19;
					local137.aByte89 = (byte) local25;
					Static155.method2111(local137);
					Static278.method3513(local137);
					if (local137.anInt6868 == 0) {
						Static576.method7471(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray602[--anInt9261] == 1;
					if (local137.aBoolean553 != local645) {
						local137.aBoolean553 = local645;
						Static155.method2111(local137);
					}
					if (local137.anInt6800 == -1) {
						Static473.method6139(local137.anInt6810);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt9261 -= 2;
					local137.anInt6804 = anIntArray602[anInt9261];
					local137.anInt6809 = anIntArray602[anInt9261 + 1];
					Static155.method2111(local137);
					Static278.method3513(local137);
					if (local137.anInt6868 == 0) {
						Static576.method7471(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean548 = anIntArray602[--anInt9261] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!lc;I)V")
	private static void method7396(@OriginalArg(0) Class2_Sub2_Sub11 arg0, @OriginalArg(1) int arg1) {
		anInt9261 = 0;
		anInt9253 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray340;
		@Pc(11) int[] local11 = arg0.anIntArray339;
		@Pc(13) byte local13 = -1;
		anInt9262 = 0;
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
						method7395(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method7390(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray602[anInt9261++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray602[anInt9261++] = Static426.aClass160_1.anIntArray276[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static426.aClass160_1.method2790(local54, anIntArray602[--anInt9261]);
					} else if (local31 == 3) {
						aStringArray40[anInt9253++] = arg0.aStringArray26[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt9261 -= 2;
						if (anIntArray602[anInt9261] != anIntArray602[anInt9261 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt9261 -= 2;
						if (anIntArray602[anInt9261] == anIntArray602[anInt9261 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt9261 -= 2;
						if (anIntArray602[anInt9261] < anIntArray602[anInt9261 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt9261 -= 2;
						if (anIntArray602[anInt9261] > anIntArray602[anInt9261 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt9262 == 0) {
							return;
						}
						@Pc(216) Class147 local216 = aClass147Array1[--anInt9262];
						arg0 = local216.aClass2_Sub2_Sub11_1;
						local8 = arg0.anIntArray340;
						local11 = arg0.anIntArray339;
						local5 = local216.anInt3039;
						anIntArray600 = local216.anIntArray250;
						aStringArray41 = local216.aStringArray20;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray602[anInt9261++] = Static426.aClass160_1.method2781(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static426.aClass160_1.method2789(local54, anIntArray602[--anInt9261]);
					} else if (local31 == 31) {
						anInt9261 -= 2;
						if (anIntArray602[anInt9261] <= anIntArray602[anInt9261 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt9261 -= 2;
						if (anIntArray602[anInt9261] >= anIntArray602[anInt9261 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray602[anInt9261++] = anIntArray600[local11[local5]];
					} else if (local31 == 34) {
						anIntArray600[local11[local5]] = anIntArray602[--anInt9261];
					} else if (local31 == 35) {
						aStringArray40[anInt9253++] = aStringArray41[local11[local5]];
					} else if (local31 == 36) {
						aStringArray41[local11[local5]] = aStringArray40[--anInt9253];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt9253 -= local54;
						@Pc(400) String local400 = Static169.method2207(aStringArray40, anInt9253, local54);
						aStringArray40[anInt9253++] = local400;
					} else if (local31 == 38) {
						anInt9261--;
					} else if (local31 == 39) {
						anInt9253--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class2_Sub2_Sub11 local436 = Static567.method5988(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt4989];
							@Pc(450) String[] local450 = new String[local436.anInt4988];
							for (local452 = 0; local452 < local436.anInt4986; local452++) {
								local446[local452] = anIntArray602[anInt9261 + local452 - local436.anInt4986];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt4985; local471++) {
								local450[local471] = aStringArray40[anInt9253 + local471 - local436.anInt4985];
							}
							anInt9261 -= local436.anInt4986;
							anInt9253 -= local436.anInt4985;
							@Pc(502) Class147 local502 = new Class147();
							local502.aClass2_Sub2_Sub11_1 = arg0;
							local502.anInt3039 = local5;
							local502.anIntArray250 = anIntArray600;
							local502.aStringArray20 = aStringArray41;
							if (anInt9262 >= aClass147Array1.length) {
								throw new RuntimeException();
							}
							aClass147Array1[anInt9262++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray340;
							local11 = local436.anIntArray339;
							local5 = -1;
							anIntArray600 = local446;
							aStringArray41 = local450;
						} else if (local31 == 42) {
							anIntArray602[anInt9261++] = Static297.anIntArray342[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static297.anIntArray342[local54] = anIntArray602[--anInt9261];
							Static441.method5782(local54);
							Static435.aBoolean574 |= Static143.aBooleanArray26[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray602[--anInt9261];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray601[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray63[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray602[--anInt9261];
							if (local603 < 0 || local603 >= anIntArray601[local54]) {
								throw new RuntimeException();
							}
							anIntArray602[anInt9261++] = anIntArrayArray63[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt9261 -= 2;
							local603 = anIntArray602[anInt9261];
							if (local603 < 0 || local603 >= anIntArray601[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray63[local54][local603] = anIntArray602[anInt9261 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static240.aStringArray45[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray40[anInt9253++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static240.aStringArray45[local54] = aStringArray40[--anInt9253];
							Static66.method1103(local54);
						} else if (local31 == 51) {
							@Pc(774) Class90 local774 = arg0.aClass90Array1[local11[local5]];
							@Pc(787) Class2_Sub44 local787 = (Class2_Sub44) local774.method1685((long) anIntArray602[--anInt9261]);
							if (local787 != null) {
								local5 += local787.anInt7748;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString61 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong268).append(" ");
				for (local603 = anInt9262 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass147Array1[local603].aClass2_Sub2_Sub11_1.aLong268).append(" ");
				}
				local856.append("op: ").append(local13);
				Static357.method5094(local837, local856.toString());
			} else {
				Static581.method7527("Clientscript error in: " + arg0.aString61);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString61).append("\n");
				for (local603 = anInt9262 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass147Array1[local603].aClass2_Sub2_Sub11_1.aString61).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static357.method5094(local837, local856.toString());
				Static144.method1990(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method7397(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static11.anInt294 == 0 && (Static183.aBoolean193 && !Static438.aBoolean578 || Static395.aBoolean806)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static229.aClass159_49.method2776(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static229.aClass159_49.method2776(0).length());
		} else if (local11.startsWith(Static229.aClass159_50.method2776(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static229.aClass159_50.method2776(0).length());
		} else if (local11.startsWith(Static229.aClass159_51.method2776(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static229.aClass159_51.method2776(0).length());
		} else if (local11.startsWith(Static229.aClass159_52.method2776(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static229.aClass159_52.method2776(0).length());
		} else if (local11.startsWith(Static229.aClass159_53.method2776(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static229.aClass159_53.method2776(0).length());
		} else if (local11.startsWith(Static229.aClass159_54.method2776(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static229.aClass159_54.method2776(0).length());
		} else if (local11.startsWith(Static229.aClass159_55.method2776(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static229.aClass159_55.method2776(0).length());
		} else if (local11.startsWith(Static229.aClass159_56.method2776(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static229.aClass159_56.method2776(0).length());
		} else if (local11.startsWith(Static229.aClass159_57.method2776(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static229.aClass159_57.method2776(0).length());
		} else if (local11.startsWith(Static229.aClass159_58.method2776(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static229.aClass159_58.method2776(0).length());
		} else if (local11.startsWith(Class159.lb.method2776(0))) {
			local13 = 10;
			arg0 = arg0.substring(Class159.lb.method2776(0).length());
		} else if (local11.startsWith(Static229.aClass159_59.method2776(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static229.aClass159_59.method2776(0).length());
		} else if (Static261.anInt4297 != 0) {
			if (local11.startsWith(Static229.aClass159_49.method2776(Static261.anInt4297))) {
				local13 = 0;
				arg0 = arg0.substring(Static229.aClass159_49.method2776(Static261.anInt4297).length());
			} else if (local11.startsWith(Static229.aClass159_50.method2776(Static261.anInt4297))) {
				local13 = 1;
				arg0 = arg0.substring(Static229.aClass159_50.method2776(Static261.anInt4297).length());
			} else if (local11.startsWith(Static229.aClass159_51.method2776(Static261.anInt4297))) {
				local13 = 2;
				arg0 = arg0.substring(Static229.aClass159_51.method2776(Static261.anInt4297).length());
			} else if (local11.startsWith(Static229.aClass159_52.method2776(Static261.anInt4297))) {
				local13 = 3;
				arg0 = arg0.substring(Static229.aClass159_52.method2776(Static261.anInt4297).length());
			} else if (local11.startsWith(Static229.aClass159_53.method2776(Static261.anInt4297))) {
				local13 = 4;
				arg0 = arg0.substring(Static229.aClass159_53.method2776(Static261.anInt4297).length());
			} else if (local11.startsWith(Static229.aClass159_54.method2776(Static261.anInt4297))) {
				local13 = 5;
				arg0 = arg0.substring(Static229.aClass159_54.method2776(Static261.anInt4297).length());
			} else if (local11.startsWith(Static229.aClass159_55.method2776(Static261.anInt4297))) {
				local13 = 6;
				arg0 = arg0.substring(Static229.aClass159_55.method2776(Static261.anInt4297).length());
			} else if (local11.startsWith(Static229.aClass159_56.method2776(Static261.anInt4297))) {
				local13 = 7;
				arg0 = arg0.substring(Static229.aClass159_56.method2776(Static261.anInt4297).length());
			} else if (local11.startsWith(Static229.aClass159_57.method2776(Static261.anInt4297))) {
				local13 = 8;
				arg0 = arg0.substring(Static229.aClass159_57.method2776(Static261.anInt4297).length());
			} else if (local11.startsWith(Static229.aClass159_58.method2776(Static261.anInt4297))) {
				local13 = 9;
				arg0 = arg0.substring(Static229.aClass159_58.method2776(Static261.anInt4297).length());
			} else if (local11.startsWith(Class159.lb.method2776(Static261.anInt4297))) {
				local13 = 10;
				arg0 = arg0.substring(Class159.lb.method2776(Static261.anInt4297).length());
			} else if (local11.startsWith(Static229.aClass159_59.method2776(Static261.anInt4297))) {
				local13 = 11;
				arg0 = arg0.substring(Static229.aClass159_59.method2776(Static261.anInt4297).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static229.aClass159_60.method2776(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static229.aClass159_60.method2776(0).length());
		} else if (local11.startsWith(Static229.aClass159_61.method2776(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static229.aClass159_61.method2776(0).length());
		} else if (local11.startsWith(Static229.aClass159_62.method2776(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static229.aClass159_62.method2776(0).length());
		} else if (local11.startsWith(Static229.aClass159_63.method2776(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static229.aClass159_63.method2776(0).length());
		} else if (local11.startsWith(Static229.aClass159_64.method2776(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static229.aClass159_64.method2776(0).length());
		} else if (Static261.anInt4297 != 0) {
			if (local11.startsWith(Static229.aClass159_60.method2776(Static261.anInt4297))) {
				local451 = 1;
				arg0 = arg0.substring(Static229.aClass159_60.method2776(Static261.anInt4297).length());
			} else if (local11.startsWith(Static229.aClass159_61.method2776(Static261.anInt4297))) {
				local451 = 2;
				arg0 = arg0.substring(Static229.aClass159_61.method2776(Static261.anInt4297).length());
			} else if (local11.startsWith(Static229.aClass159_62.method2776(Static261.anInt4297))) {
				local451 = 3;
				arg0 = arg0.substring(Static229.aClass159_62.method2776(Static261.anInt4297).length());
			} else if (local11.startsWith(Static229.aClass159_63.method2776(Static261.anInt4297))) {
				local451 = 4;
				arg0 = arg0.substring(Static229.aClass159_63.method2776(Static261.anInt4297).length());
			} else if (local11.startsWith(Static229.aClass159_64.method2776(Static261.anInt4297))) {
				local451 = 5;
				arg0 = arg0.substring(Static229.aClass159_64.method2776(Static261.anInt4297).length());
			}
		}
		@Pc(641) Class2_Sub34 local641 = Static555.method7264(Static297.aClass154_63, Static551.aClass64_2);
		local641.aClass2_Sub7_Sub2_2.method4459(0);
		@Pc(650) int local650 = local641.aClass2_Sub7_Sub2_2.anInt5186;
		local641.aClass2_Sub7_Sub2_2.method4459(local13);
		local641.aClass2_Sub7_Sub2_2.method4459(local451);
		Static138.method1906(arg0, local641.aClass2_Sub7_Sub2_2);
		local641.aClass2_Sub7_Sub2_2.method4491(local641.aClass2_Sub7_Sub2_2.anInt5186 - local650);
		Static100.method1508(local641);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!dea;)V")
	public static void method7398(@OriginalArg(0) Class2_Sub10 arg0) {
		method7400(arg0, 200000);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!dea;I)V")
	private static void method7400(@OriginalArg(0) Class2_Sub10 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub2_Sub11 local12 = Static567.method5988(local8);
		if (local12 == null) {
			return;
		}
		anIntArray600 = new int[local12.anInt4989];
		@Pc(21) int local21 = 0;
		aStringArray41 = new String[local12.anInt4988];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt1609;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt1606;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass273_4 == null ? -1 : arg0.aClass273_4.anInt6810;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt1602;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass273_4 == null ? -1 : arg0.aClass273_4.anInt6800;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass273_3 == null ? -1 : arg0.aClass273_3.anInt6810;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass273_3 == null ? -1 : arg0.aClass273_3.anInt6800;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt1605;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt1604;
				}
				anIntArray600[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString22;
				}
				aStringArray41[local27++] = local135;
			}
		}
		anInt9266 = arg0.anInt1603;
		method7396(local12, arg1);
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
	public static void method7401(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static453.method5906(arg0)) {
			return;
		}
		@Pc(12) Class273[] local12 = Static509.aClass273ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class273 local19 = local12[local14];
			if (local19.anObjectArray28 != null) {
				@Pc(26) Class2_Sub10 local26 = new Class2_Sub10();
				local26.aClass273_4 = local19;
				local26.anObjectArray1 = local19.anObjectArray28;
				method7400(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
	private static void method7402(@OriginalArg(0) int arg0) {
		@Pc(3) Class273 local3 = Static594.method7731(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class273[] local13 = Static183.aClass273ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class273[] local19 = Static509.aClass273ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static183.aClass273ArrayArray1[local9] = new Class273[local22];
			Static598.method4266(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static598.method4266(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method7403(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray42[local20] + "-" + local24;
	}
}
