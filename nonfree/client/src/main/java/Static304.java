import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray20;

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "Lclient!qk;")
	private static Class279 aClass279_9;

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "Lclient!cw;")
	private static Class61 aClass61_1;

	@OriginalMember(owner = "client!kt", name = "l", descriptor = "[I")
	private static int[] anIntArray294;

	@OriginalMember(owner = "client!kt", name = "p", descriptor = "Lclient!qk;")
	private static Class279 aClass279_10;

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
	private static int anInt5395 = 0;

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
	private static int anInt5396 = 0;

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "[I")
	private static final int[] anIntArray292 = new int[1000];

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "[I")
	private static final int[] anIntArray293 = new int[5];

	@OriginalMember(owner = "client!kt", name = "k", descriptor = "I")
	private static int anInt5399 = 0;

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "[[I")
	private static final int[][] anIntArrayArray37 = new int[5][5000];

	@OriginalMember(owner = "client!kt", name = "r", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray21 = new String[1000];

	@OriginalMember(owner = "client!kt", name = "s", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!kt", name = "t", descriptor = "[Lclient!mha;")
	private static final Class218[] aClass218Array1 = new Class218[50];

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "[I")
	private static final int[] anIntArray295 = new int[3];

	@OriginalMember(owner = "client!kt", name = "A", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_33 = new Class102(4);

	@OriginalMember(owner = "client!kt", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray22 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
	private static int anInt5408 = 0;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)V")
	public static void method4832() {
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)Ljava/lang/String;")
	private static String method4833(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray22[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(IZ)V")
	private static void method4834(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class3_Sub14 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray292[anInt5395++] = Static368.anInt6963;
				return;
			}
			if (arg0 == 5001) {
				anInt5395 -= 3;
				Static368.anInt6963 = anIntArray292[anInt5395];
				Static569.aClass215_4 = Static184.method3195(anIntArray292[anInt5395 + 1]);
				if (Static569.aClass215_4 == null) {
					Static569.aClass215_4 = Static171.aClass215_1;
				}
				Static442.anInt7936 = anIntArray292[anInt5395 + 2];
				local52 = Static139.method2308(Static251.aClass130_74, Static24.aClass233_1);
				local52.aClass3_Sub3_Sub2_2.method4220(Static368.anInt6963);
				local52.aClass3_Sub3_Sub2_2.method4220(Static569.aClass215_4.anInt6727);
				local52.aClass3_Sub3_Sub2_2.method4220(Static442.anInt7936);
				Static562.method8096(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt5396 -= 2;
				local83 = aStringArray21[anInt5396];
				local89 = aStringArray21[anInt5396 + 1];
				anInt5395 -= 2;
				local97 = anIntArray292[anInt5395];
				local103 = anIntArray292[anInt5395 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class3_Sub14 local125 = Static139.method2308(Static76.aClass130_36, Static24.aClass233_1);
				local125.aClass3_Sub3_Sub2_2.method4220(Static161.method2888(local83) + Static161.method2888(local89) + 2);
				local125.aClass3_Sub3_Sub2_2.method4241(local83);
				local125.aClass3_Sub3_Sub2_2.method4220(local97 - 1);
				local125.aClass3_Sub3_Sub2_2.method4220(local103);
				local125.aClass3_Sub3_Sub2_2.method4241(local89);
				Static562.method8096(local125);
				return;
			}
			@Pc(179) Class312 local179;
			if (arg0 == 5003) {
				local175 = anIntArray292[--anInt5395];
				local179 = Static112.method2306(local175);
				local181 = "";
				if (local179 != null && local179.aString101 != null) {
					local181 = local179.aString101;
				}
				aStringArray21[anInt5396++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray292[--anInt5395];
				local179 = Static112.method2306(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8994;
				}
				anIntArray292[anInt5395++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static569.aClass215_4 == null) {
					anIntArray292[anInt5395++] = -1;
					return;
				}
				anIntArray292[anInt5395++] = Static569.aClass215_4.anInt6727;
				return;
			}
			@Pc(269) Class3_Sub14 local269;
			if (arg0 == 5006) {
				local175 = anIntArray292[--anInt5395];
				local269 = Static139.method2308(Static577.aClass130_128, Static24.aClass233_1);
				local269.aClass3_Sub3_Sub2_2.method4220(local175);
				Static562.method8096(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray21[--anInt5396];
				method4837(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt5396 -= 2;
				local83 = aStringArray21[anInt5396];
				local89 = aStringArray21[anInt5396 + 1];
				if (Static302.anInt5364 != 0 || (!Static134.aBoolean181 || Static12.aBoolean56) && !Static512.aBoolean628) {
					@Pc(328) Class3_Sub14 local328 = Static139.method2308(Static572.aClass130_127, Static24.aClass233_1);
					local328.aClass3_Sub3_Sub2_2.method4220(0);
					local103 = local328.aClass3_Sub3_Sub2_2.anInt4736;
					local328.aClass3_Sub3_Sub2_2.method4241(local83);
					Static285.method4569(local328.aClass3_Sub3_Sub2_2, local89);
					local328.aClass3_Sub3_Sub2_2.method4218(local328.aClass3_Sub3_Sub2_2.anInt4736 - local103);
					Static562.method8096(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray292[--anInt5395];
				local179 = Static112.method2306(local175);
				local181 = "";
				if (local179 != null && local179.aString105 != null) {
					local181 = local179.aString105;
				}
				aStringArray21[anInt5396++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray292[--anInt5395];
				local179 = Static112.method2306(local175);
				local181 = "";
				if (local179 != null && local179.aString102 != null) {
					local181 = local179.aString102;
				}
				aStringArray21[anInt5396++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray292[--anInt5395];
				local179 = Static112.method2306(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8992;
				}
				anIntArray292[anInt5395++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 == null || Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aString64 == null) {
					local83 = "";
				} else {
					local83 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.method5089();
				}
				aStringArray21[anInt5396++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray292[anInt5395++] = Static442.anInt7936;
				return;
			}
			if (arg0 == 5017) {
				anIntArray292[anInt5395++] = Static309.method5094();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray292[--anInt5395];
				local179 = Static112.method2306(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt8996;
				}
				anIntArray292[anInt5395++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray292[--anInt5395];
				local179 = Static112.method2306(local175);
				local181 = "";
				if (local179 != null && local179.aString103 != null) {
					local181 = local179.aString103;
				}
				aStringArray21[anInt5396++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 == null || Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aString64 == null) {
					local83 = "";
				} else {
					local83 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.method5086();
				}
				aStringArray21[anInt5396++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray292[--anInt5395];
				local179 = Static112.method2306(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9000;
				}
				anIntArray292[anInt5395++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray292[--anInt5395];
				local179 = Static112.method2306(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8998;
				}
				anIntArray292[anInt5395++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray292[--anInt5395];
				local179 = Static112.method2306(local175);
				local181 = "";
				if (local179 != null && local179.aString104 != null) {
					local181 = local179.aString104;
				}
				aStringArray21[anInt5396++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray292[--anInt5395];
				aStringArray21[anInt5396++] = Static379.aClass226_1.method5962(local175).aString100;
				return;
			}
			@Pc(736) Class3_Sub4_Sub20 local736;
			if (arg0 == 5051) {
				local175 = anIntArray292[--anInt5395];
				local736 = Static379.aClass226_1.method5962(local175);
				if (local736.anIntArray543 == null) {
					anIntArray292[anInt5395++] = 0;
					return;
				}
				anIntArray292[anInt5395++] = local736.anIntArray543.length;
				return;
			}
			if (arg0 == 5052) {
				anInt5395 -= 2;
				local175 = anIntArray292[anInt5395];
				local776 = anIntArray292[anInt5395 + 1];
				@Pc(781) Class3_Sub4_Sub20 local781 = Static379.aClass226_1.method5962(local175);
				local103 = local781.anIntArray543[local776];
				anIntArray292[anInt5395++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray292[--anInt5395];
				local736 = Static379.aClass226_1.method5962(local175);
				if (local736.anIntArray544 == null) {
					anIntArray292[anInt5395++] = 0;
					return;
				}
				anIntArray292[anInt5395++] = local736.anIntArray544.length;
				return;
			}
			if (arg0 == 5054) {
				anInt5395 -= 2;
				local175 = anIntArray292[anInt5395];
				local776 = anIntArray292[anInt5395 + 1];
				anIntArray292[anInt5395++] = Static379.aClass226_1.method5962(local175).anIntArray544[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray292[--anInt5395];
				aStringArray21[anInt5396++] = Static430.aClass113_2.method2868(local175).method4827();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray292[--anInt5395];
				@Pc(907) Class3_Sub4_Sub16 local907 = Static430.aClass113_2.method2868(local175);
				if (local907.anIntArray291 == null) {
					anIntArray292[anInt5395++] = 0;
					return;
				}
				anIntArray292[anInt5395++] = local907.anIntArray291.length;
				return;
			}
			if (arg0 == 5057) {
				anInt5395 -= 2;
				local175 = anIntArray292[anInt5395];
				local776 = anIntArray292[anInt5395 + 1];
				anIntArray292[anInt5395++] = Static430.aClass113_2.method2868(local175).anIntArray291[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass61_1 = new Class61();
				aClass61_1.anInt2092 = anIntArray292[--anInt5395];
				aClass61_1.aClass3_Sub4_Sub16_1 = Static430.aClass113_2.method2868(aClass61_1.anInt2092);
				aClass61_1.anIntArray74 = new int[aClass61_1.aClass3_Sub4_Sub16_1.method4821()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static139.method2308(Static27.aClass130_10, Static24.aClass233_1);
				local52.aClass3_Sub3_Sub2_2.method4220(0);
				local776 = local52.aClass3_Sub3_Sub2_2.anInt4736;
				local52.aClass3_Sub3_Sub2_2.method4220(0);
				local52.aClass3_Sub3_Sub2_2.method4201(aClass61_1.anInt2092);
				aClass61_1.aClass3_Sub4_Sub16_1.method4824(aClass61_1.anIntArray74, local52.aClass3_Sub3_Sub2_2);
				local52.aClass3_Sub3_Sub2_2.method4218(local52.aClass3_Sub3_Sub2_2.anInt4736 - local776);
				Static562.method8096(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray21[--anInt5396];
				local269 = Static139.method2308(Static335.aClass130_91, Static24.aClass233_1);
				local269.aClass3_Sub3_Sub2_2.method4220(0);
				local97 = local269.aClass3_Sub3_Sub2_2.anInt4736;
				local269.aClass3_Sub3_Sub2_2.method4241(local83);
				local269.aClass3_Sub3_Sub2_2.method4201(aClass61_1.anInt2092);
				aClass61_1.aClass3_Sub4_Sub16_1.method4824(aClass61_1.anIntArray74, local269.aClass3_Sub3_Sub2_2);
				local269.aClass3_Sub3_Sub2_2.method4218(local269.aClass3_Sub3_Sub2_2.anInt4736 - local97);
				Static562.method8096(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static139.method2308(Static27.aClass130_10, Static24.aClass233_1);
				local52.aClass3_Sub3_Sub2_2.method4220(0);
				local776 = local52.aClass3_Sub3_Sub2_2.anInt4736;
				local52.aClass3_Sub3_Sub2_2.method4220(1);
				local52.aClass3_Sub3_Sub2_2.method4201(aClass61_1.anInt2092);
				aClass61_1.aClass3_Sub4_Sub16_1.method4824(aClass61_1.anIntArray74, local52.aClass3_Sub3_Sub2_2);
				local52.aClass3_Sub3_Sub2_2.method4218(local52.aClass3_Sub3_Sub2_2.anInt4736 - local776);
				Static562.method8096(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt5395 -= 2;
				local175 = anIntArray292[anInt5395];
				local776 = anIntArray292[anInt5395 + 1];
				anIntArray292[anInt5395++] = Static379.aClass226_1.method5962(local175).aCharArray5[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt5395 -= 2;
				local175 = anIntArray292[anInt5395];
				local776 = anIntArray292[anInt5395 + 1];
				anIntArray292[anInt5395++] = Static379.aClass226_1.method5962(local175).aCharArray6[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt5395 -= 2;
				local175 = anIntArray292[anInt5395];
				local776 = anIntArray292[anInt5395 + 1];
				if (local776 == -1) {
					anIntArray292[anInt5395++] = -1;
					return;
				}
				anIntArray292[anInt5395++] = Static379.aClass226_1.method5962(local175).method7619((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt5395 -= 2;
				local175 = anIntArray292[anInt5395];
				local776 = anIntArray292[anInt5395 + 1];
				if (local776 == -1) {
					anIntArray292[anInt5395++] = -1;
					return;
				}
				anIntArray292[anInt5395++] = Static379.aClass226_1.method5962(local175).method7618((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray292[--anInt5395];
				anIntArray292[anInt5395++] = Static430.aClass113_2.method2868(local175).method4821();
				return;
			}
			if (arg0 == 5067) {
				anInt5395 -= 2;
				local175 = anIntArray292[anInt5395];
				local776 = anIntArray292[anInt5395 + 1];
				local97 = Static430.aClass113_2.method2868(local175).method4825(local776).anInt2256;
				anIntArray292[anInt5395++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt5395 -= 2;
				local175 = anIntArray292[anInt5395];
				local776 = anIntArray292[anInt5395 + 1];
				aClass61_1.anIntArray74[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt5395 -= 2;
				local175 = anIntArray292[anInt5395];
				local776 = anIntArray292[anInt5395 + 1];
				aClass61_1.anIntArray74[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt5395 -= 3;
				local175 = anIntArray292[anInt5395];
				local776 = anIntArray292[anInt5395 + 1];
				local97 = anIntArray292[anInt5395 + 2];
				@Pc(1448) Class3_Sub4_Sub16 local1448 = Static430.aClass113_2.method2868(local175);
				if (local1448.method4825(local776).anInt2256 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray292[anInt5395++] = local1448.method4822(local776, local97);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray21[--anInt5396];
				local1496 = anIntArray292[--anInt5395] == 1;
				Static164.method2915(local83, local1496);
				anIntArray292[anInt5395++] = Static285.anInt5065;
				return;
			}
			if (arg0 == 5072) {
				if (Static629.aShortArray146 != null && Static470.anInt8251 < Static285.anInt5065) {
					anIntArray292[anInt5395++] = Static629.aShortArray146[Static470.anInt8251++] & 0xFFFF;
					return;
				}
				anIntArray292[anInt5395++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static470.anInt8251 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static339.aClass163_1.method4104(86)) {
					anIntArray292[anInt5395++] = 1;
					return;
				}
				anIntArray292[anInt5395++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static339.aClass163_1.method4104(82)) {
					anIntArray292[anInt5395++] = 1;
					return;
				}
				anIntArray292[anInt5395++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static339.aClass163_1.method4104(81)) {
					anIntArray292[anInt5395++] = 1;
					return;
				}
				anIntArray292[anInt5395++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static442.method6899(anIntArray292[--anInt5395]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray292[anInt5395++] = Static630.method8653();
					return;
				}
				if (arg0 == 5205) {
					Static388.method6231(-1, anIntArray292[--anInt5395], -1, false);
					return;
				}
				@Pc(1696) Class3_Sub4_Sub11 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray292[--anInt5395];
					local1696 = Static110.method2789(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray292[anInt5395++] = -1;
						return;
					}
					anIntArray292[anInt5395++] = local1696.anInt3858;
					return;
				}
				@Pc(1729) Class3_Sub4_Sub11 local1729;
				if (arg0 == 5207) {
					local1729 = Static110.method2794(anIntArray292[--anInt5395]);
					if (local1729 != null && local1729.aString39 != null) {
						aStringArray21[anInt5396++] = local1729.aString39;
						return;
					}
					aStringArray21[anInt5396++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray292[anInt5395++] = Static44.anInt1312;
					anIntArray292[anInt5395++] = Static149.anInt2952;
					return;
				}
				if (arg0 == 5209) {
					anIntArray292[anInt5395++] = Static365.anInt6941 + Static110.anInt3014;
					anIntArray292[anInt5395++] = Static561.anInt9391 + Static110.anInt3012;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray292[--anInt5395];
					local1696 = Static110.method2794(local175);
					if (local1696 == null) {
						anIntArray292[anInt5395++] = 0;
						anIntArray292[anInt5395++] = 0;
						return;
					}
					anIntArray292[anInt5395++] = local1696.anInt3862 >> 14 & 0x3FFF;
					anIntArray292[anInt5395++] = local1696.anInt3862 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray292[--anInt5395];
					local1696 = Static110.method2794(local175);
					if (local1696 == null) {
						anIntArray292[anInt5395++] = 0;
						anIntArray292[anInt5395++] = 0;
						return;
					}
					anIntArray292[anInt5395++] = local1696.anInt3867 - local1696.anInt3863;
					anIntArray292[anInt5395++] = local1696.anInt3860 - local1696.anInt3861;
					return;
				}
				@Pc(1919) Class3_Sub49 local1919;
				if (arg0 == 5212) {
					local1919 = Static73.method1752();
					if (local1919 == null) {
						anIntArray292[anInt5395++] = -1;
						anIntArray292[anInt5395++] = -1;
						return;
					}
					anIntArray292[anInt5395++] = local1919.anInt9434;
					local776 = local1919.anInt9435 << 28 | local1919.anInt9439 + Static110.anInt3014 << 14 | local1919.anInt9437 + Static110.anInt3012;
					anIntArray292[anInt5395++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static453.method3850();
					if (local1919 == null) {
						anIntArray292[anInt5395++] = -1;
						anIntArray292[anInt5395++] = -1;
						return;
					}
					anIntArray292[anInt5395++] = local1919.anInt9434;
					local776 = local1919.anInt9435 << 28 | local1919.anInt9439 + Static110.anInt3014 << 14 | local1919.anInt9437 + Static110.anInt3012;
					anIntArray292[anInt5395++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray292[--anInt5395];
					local1696 = Static212.method3590();
					if (local1696 != null) {
						local2067 = local1696.method3414(anIntArray295, local175 & 0x3FFF, local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF);
						if (local2067) {
							Static310.method5128(anIntArray295[1], anIntArray295[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt5395 -= 2;
					local175 = anIntArray292[anInt5395];
					local776 = anIntArray292[anInt5395 + 1];
					@Pc(2105) Class15 local2105 = Static110.method2791(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class3_Sub4_Sub11 local2112 = (Class3_Sub4_Sub11) local2105.method897(); local2112 != null; local2112 = (Class3_Sub4_Sub11) local2105.method898()) {
						if (local2112.anInt3858 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray292[anInt5395++] = 1;
						return;
					}
					anIntArray292[anInt5395++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray292[--anInt5395];
					local1696 = Static110.method2794(local175);
					if (local1696 == null) {
						anIntArray292[anInt5395++] = -1;
						return;
					}
					anIntArray292[anInt5395++] = local1696.anInt3855;
					return;
				}
				if (arg0 == 5220) {
					anIntArray292[anInt5395++] = Static368.anInt6962 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray292[--anInt5395];
					Static310.method5128(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static212.method3590();
					if (local1729 != null) {
						local1496 = local1729.method3418(Static365.anInt6941 + Static110.anInt3014, anIntArray295, Static561.anInt9391 + Static110.anInt3012);
						if (local1496) {
							anIntArray292[anInt5395++] = anIntArray295[1];
							anIntArray292[anInt5395++] = anIntArray295[2];
							return;
						}
						anIntArray292[anInt5395++] = -1;
						anIntArray292[anInt5395++] = -1;
						return;
					}
					anIntArray292[anInt5395++] = -1;
					anIntArray292[anInt5395++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt5395 -= 2;
					local175 = anIntArray292[anInt5395];
					local776 = anIntArray292[anInt5395 + 1];
					Static388.method6231(local776 >> 14 & 0x3FFF, local175, local776 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray292[--anInt5395];
					local1696 = Static212.method3590();
					if (local1696 != null) {
						local2067 = local1696.method3414(anIntArray295, local175 & 0x3FFF, local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF);
						if (local2067) {
							anIntArray292[anInt5395++] = anIntArray295[1];
							anIntArray292[anInt5395++] = anIntArray295[2];
							return;
						}
						anIntArray292[anInt5395++] = -1;
						anIntArray292[anInt5395++] = -1;
						return;
					}
					anIntArray292[anInt5395++] = -1;
					anIntArray292[anInt5395++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray292[--anInt5395];
					local1696 = Static212.method3590();
					if (local1696 != null) {
						local2067 = local1696.method3418(local175 >> 14 & 0x3FFF, anIntArray295, local175 & 0x3FFF);
						if (local2067) {
							anIntArray292[anInt5395++] = anIntArray295[1];
							anIntArray292[anInt5395++] = anIntArray295[2];
							return;
						}
						anIntArray292[anInt5395++] = -1;
						anIntArray292[anInt5395++] = -1;
						return;
					}
					anIntArray292[anInt5395++] = -1;
					anIntArray292[anInt5395++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static441.method6861(anIntArray292[--anInt5395]);
					return;
				}
				if (arg0 == 5227) {
					anInt5395 -= 2;
					local175 = anIntArray292[anInt5395];
					local776 = anIntArray292[anInt5395 + 1];
					Static388.method6231(local776 >> 14 & 0x3FFF, local175, local776 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static195.aBoolean252 = anIntArray292[--anInt5395] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray292[anInt5395++] = Static195.aBoolean252 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray292[--anInt5395];
					Static177.method3086(local175);
					return;
				}
				@Pc(2625) Class3 local2625;
				if (arg0 == 5231) {
					anInt5395 -= 2;
					local175 = anIntArray292[anInt5395];
					local1496 = anIntArray292[anInt5395 + 1] == 1;
					if (Static524.aClass280_38 != null) {
						local2625 = Static524.aClass280_38.method7107((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8769();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class3();
							Static524.aClass280_38.method7109(local2625, (long) local175);
						}
					}
					return;
				}
				@Pc(2667) Class3 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray292[--anInt5395];
					if (Static524.aClass280_38 != null) {
						local2667 = Static524.aClass280_38.method7107((long) local175);
						anIntArray292[anInt5395++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray292[anInt5395++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt5395 -= 2;
					local175 = anIntArray292[anInt5395];
					local1496 = anIntArray292[anInt5395 + 1] == 1;
					if (Static291.aClass280_25 != null) {
						local2625 = Static291.aClass280_25.method7107((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8769();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class3();
							Static291.aClass280_25.method7109(local2625, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray292[--anInt5395];
					if (Static291.aClass280_25 != null) {
						local2667 = Static291.aClass280_25.method7107((long) local175);
						anIntArray292[anInt5395++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray292[anInt5395++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray292[anInt5395++] = Static110.aClass3_Sub4_Sub11_3 == null ? -1 : Static110.aClass3_Sub4_Sub11_3.anInt3858;
					return;
				}
				if (arg0 == 5236) {
					anInt5395 -= 2;
					local175 = anIntArray292[anInt5395];
					local776 = anIntArray292[anInt5395 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static184.method3196(local175, local97, local103);
					if (local2833 < 0) {
						anIntArray292[anInt5395++] = -1;
						return;
					}
					anIntArray292[anInt5395++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static109.method2230();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt5395 -= 2;
					local175 = anIntArray292[anInt5395];
					local776 = anIntArray292[anInt5395 + 1];
					Static398.method6435(local175, false, local776, 3);
					anIntArray292[anInt5395++] = Static4.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static4.aFrame1 != null) {
						Static398.method6435(-1, false, -1, Static262.aClass3_Sub27_12.aClass21_Sub2_2.method1086());
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2919) Class347[] local2919 = Static241.method3942();
					anIntArray292[anInt5395++] = local2919.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray292[--anInt5395];
					@Pc(2943) Class347[] local2943 = Static241.method3942();
					anIntArray292[anInt5395++] = local2943[local175].anInt9596;
					anIntArray292[anInt5395++] = local2943[local175].anInt9597;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static227.anInt4277;
					local776 = Static75.anInt1790;
					local97 = -1;
					@Pc(2978) Class347[] local2978 = Static241.method3942();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class347 local2985 = local2978[local2833];
						if (local2985.anInt9596 == local175 && local2985.anInt9597 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray292[anInt5395++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray292[anInt5395++] = Static634.method8682();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray292[--anInt5395];
					if (local175 >= 1 && local175 <= 2) {
						Static398.method6435(-1, false, -1, local175);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub2_2.method1086();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray292[--anInt5395];
					if (local175 >= 1 && local175 <= 2) {
						Static262.aClass3_Sub27_12.method3234(local175, Static262.aClass3_Sub27_12.aClass21_Sub2_2);
						Static262.aClass3_Sub27_12.method3234(local175, Static262.aClass3_Sub27_12.aClass21_Sub2_1);
						Static108.method2177();
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt5396 -= 2;
					local83 = aStringArray21[anInt5396];
					local89 = aStringArray21[anInt5396 + 1];
					local97 = anIntArray292[--anInt5395];
					@Pc(3133) Class3_Sub14 local3133 = Static139.method2308(Static20.aClass130_9, Static24.aClass233_1);
					local3133.aClass3_Sub3_Sub2_2.method4220(Static161.method2888(local83) + Static161.method2888(local89) + 1);
					local3133.aClass3_Sub3_Sub2_2.method4241(local83);
					local3133.aClass3_Sub3_Sub2_2.method4241(local89);
					local3133.aClass3_Sub3_Sub2_2.method4220(local97);
					Static562.method8096(local3133);
					return;
				}
				if (arg0 == 5401) {
					anInt5395 -= 2;
					Static278.aShortArray71[anIntArray292[anInt5395]] = (short) Static278.method4513(anIntArray292[anInt5395 + 1]);
					Static320.aClass53_2.method1777();
					Static320.aClass53_2.method1775();
					Static547.aClass177_2.method4477();
					Static40.method1343();
					return;
				}
				if (arg0 == 5405) {
					anInt5395 -= 2;
					local175 = anIntArray292[anInt5395];
					local776 = anIntArray292[anInt5395 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static161.anIntArrayArrayArray9[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt5395 -= 7;
					local175 = anIntArray292[anInt5395];
					local776 = anIntArray292[anInt5395 + 1] << 1;
					local97 = anIntArray292[anInt5395 + 2];
					local103 = anIntArray292[anInt5395 + 3];
					local2833 = anIntArray292[anInt5395 + 4];
					@Pc(3271) int local3271 = anIntArray292[anInt5395 + 5];
					@Pc(3277) int local3277 = anIntArray292[anInt5395 + 6];
					if (local175 >= 0 && local175 < 2 && Static161.anIntArrayArrayArray9[local175] != null && local776 >= 0 && local776 < Static161.anIntArrayArrayArray9[local175].length) {
						Static161.anIntArrayArrayArray9[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3277 };
						Static161.anIntArrayArrayArray9[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3271 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static161.anIntArrayArrayArray9[anIntArray292[--anInt5395]].length >> 1;
					anIntArray292[anInt5395++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static4.aFrame1 != null) {
						Static398.method6435(-1, false, -1, Static262.aClass3_Sub27_12.aClass21_Sub2_2.method1086());
					}
					if (Static209.aFrame3 != null) {
						Static52.method1478();
						System.exit(0);
						return;
					}
					local83 = Static603.aString108 == null ? Static75.method1773() : Static603.aString108;
					Static442.method6898(false, Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() == 1, local83, Static205.aClass138_2);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static465.aClass304_5 != null) {
						if (Static465.aClass304_5.anObject16 == null) {
							local83 = Static339.method5723(Static465.aClass304_5.anInt8837);
						} else {
							local83 = (String) Static465.aClass304_5.anObject16;
						}
					}
					aStringArray21[anInt5396++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray292[anInt5395++] = Static205.aClass138_2.aBoolean276 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static4.aFrame1 != null) {
						Static398.method6435(-1, false, -1, Static262.aClass3_Sub27_12.aClass21_Sub2_2.method1086());
					}
					local83 = aStringArray21[--anInt5396];
					local1496 = anIntArray292[--anInt5395] == 1;
					local181 = Static75.method1773() + local83;
					Static442.method6898(local1496, Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() == 1, local181, Static205.aClass138_2);
					return;
				}
				if (arg0 == 5422) {
					anInt5396 -= 2;
					local83 = aStringArray21[anInt5396];
					local89 = aStringArray21[anInt5396 + 1];
					local97 = anIntArray292[--anInt5395];
					if (local83.length() > 0) {
						if (Static380.aStringArray25 == null) {
							Static380.aStringArray25 = new String[Static254.anIntArray243[Static212.aClass222_2.anInt6790]];
						}
						Static380.aStringArray25[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static163.aStringArray15 == null) {
							Static163.aStringArray15 = new String[Static254.anIntArray243[Static212.aClass222_2.anInt6790]];
						}
						Static163.aStringArray15[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray21[--anInt5396]);
					return;
				}
				if (arg0 == 5424) {
					anInt5395 -= 11;
					Static134.anInt2742 = anIntArray292[anInt5395];
					Static460.anInt8088 = anIntArray292[anInt5395 + 1];
					Static303.anInt5383 = anIntArray292[anInt5395 + 2];
					Static184.anInt3547 = anIntArray292[anInt5395 + 3];
					Static275.anInt4975 = anIntArray292[anInt5395 + 4];
					Static586.anInt9600 = anIntArray292[anInt5395 + 5];
					Static239.anInt4467 = anIntArray292[anInt5395 + 6];
					Static503.anInt8687 = anIntArray292[anInt5395 + 7];
					Static495.anInt8541 = anIntArray292[anInt5395 + 8];
					Static325.anInt6089 = anIntArray292[anInt5395 + 9];
					Static627.anInt10085 = anIntArray292[anInt5395 + 10];
					Static474.aClass196_98.method5111(Static275.anInt4975);
					Static474.aClass196_98.method5111(Static586.anInt9600);
					Static474.aClass196_98.method5111(Static239.anInt4467);
					Static474.aClass196_98.method5111(Static503.anInt8687);
					Static474.aClass196_98.method5111(Static495.anInt8541);
					Static215.aClass24_14 = null;
					Static177.aClass24_4 = null;
					Static619.aClass24_36 = null;
					Static341.aClass24_31 = null;
					Static398.aClass24_24 = null;
					Static207.aClass24_13 = null;
					Static438.aClass24_26 = null;
					Static120.aClass24_3 = null;
					Static519.aBoolean557 = true;
					return;
				}
				if (arg0 == 5425) {
					Static90.method2064();
					Static519.aBoolean557 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt5395 -= 2;
					Static291.anInt5161 = anIntArray292[anInt5395];
					Static523.anInt8986 = anIntArray292[anInt5395 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt5395 -= 2;
					Static98.anInt2238 = anIntArray292[anInt5395 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt5395 -= 2;
					local175 = anIntArray292[anInt5395];
					local776 = anIntArray292[anInt5395 + 1];
					anIntArray292[anInt5395++] = Static341.method7761(local776, local175) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static601.method8395(false, aStringArray21[--anInt5396], false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static646.method3052(Static504.anApplet2, "accountcreated");
						return;
					} catch (@Pc(3819) Throwable local3819) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static646.method3052(Static504.anApplet2, "accountcreatestarted");
						return;
					} catch (@Pc(3830) Throwable local3830) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static510.aClipboard1 != null) {
						@Pc(3842) Transferable local3842 = Static510.aClipboard1.getContents(null);
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
					aStringArray21[anInt5396++] = local83;
					return;
				}
				if (arg0 == 5433) {
					Static260.anInt8919 = anIntArray292[--anInt5395];
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt5395 -= 4;
					local175 = anIntArray292[anInt5395];
					local776 = anIntArray292[anInt5395 + 1];
					local97 = anIntArray292[anInt5395 + 2];
					local103 = anIntArray292[anInt5395 + 3];
					Static74.method1759((local175 & 0x3FFF) - Static171.anInt3340, local103, local776 << 2, local97, (local175 >> 14 & 0x3FFF) - Static299.anInt5307, false);
					return;
				}
				if (arg0 == 5501) {
					anInt5395 -= 4;
					local175 = anIntArray292[anInt5395];
					local776 = anIntArray292[anInt5395 + 1];
					local97 = anIntArray292[anInt5395 + 2];
					local103 = anIntArray292[anInt5395 + 3];
					Static27.method1052((local175 & 0x3FFF) - Static171.anInt3340, local97, local776 << 2, (local175 >> 14 & 0x3FFF) - Static299.anInt5307, local103);
					return;
				}
				if (arg0 == 5502) {
					anInt5395 -= 6;
					local175 = anIntArray292[anInt5395];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static435.anInt7846 = local175;
					local776 = anIntArray292[anInt5395 + 1];
					if (local776 + 1 >= Static161.anIntArrayArrayArray9[Static435.anInt7846].length >> 1) {
						throw new RuntimeException();
					}
					Static601.anInt9791 = local776;
					Static190.anInt3603 = 0;
					Static221.anInt4214 = anIntArray292[anInt5395 + 2];
					Static598.anInt9784 = anIntArray292[anInt5395 + 3];
					local97 = anIntArray292[anInt5395 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static147.anInt2910 = local97;
					local103 = anIntArray292[anInt5395 + 5];
					if (local103 + 1 >= Static161.anIntArrayArrayArray9[Static147.anInt2910].length >> 1) {
						throw new RuntimeException();
					}
					Static526.anInt8991 = local103;
					Static305.anInt5422 = 3;
					Static331.anInt6175 = -1;
					Static530.anInt9071 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static329.method5384();
					return;
				}
				if (arg0 == 5504) {
					anInt5395 -= 2;
					Static308.method5077(anIntArray292[anInt5395], anIntArray292[anInt5395 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray292[anInt5395++] = (int) Static620.aFloat209 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray292[anInt5395++] = (int) Static401.aFloat165 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static80.method1869();
					return;
				}
				if (arg0 == 5508) {
					Static404.method6471();
					return;
				}
				if (arg0 == 5509) {
					Static129.method2512();
					return;
				}
				if (arg0 == 5510) {
					Static617.method8533();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray292[--anInt5395];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static299.anInt5307;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static634.anInt10129) {
						local776 = Static634.anInt10129;
					}
					local97 -= Static171.anInt3340;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static638.anInt10172) {
						local97 = Static638.anInt10172;
					}
					Static602.anInt9811 = (local776 << 9) + 256;
					Static349.anInt6751 = (local97 << 9) + 256;
					Static305.anInt5422 = 4;
					Static331.anInt6175 = -1;
					Static530.anInt9071 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static366.method5967();
					return;
				}
				if (arg0 == 5514) {
					Static401.anInt7424 = anIntArray292[--anInt5395];
					return;
				}
				if (arg0 == 5516) {
					anIntArray292[anInt5395++] = Static401.anInt7424;
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray292[--anInt5395];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static299.anInt5307;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static634.anInt10129) {
							local776 = Static634.anInt10129;
						}
						local97 -= Static171.anInt3340;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static638.anInt10172) {
							local97 = Static638.anInt10172;
						}
						Static530.anInt9071 = (local776 << 9) + 256;
						Static331.anInt6175 = (local97 << 9) + 256;
						return;
					}
					Static530.anInt9071 = -1;
					Static331.anInt6175 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt5396 -= 2;
					local83 = aStringArray21[anInt5396];
					local89 = aStringArray21[anInt5396 + 1];
					local97 = anIntArray292[--anInt5395];
					if (local83.length() > 320) {
						return;
					}
					if (Static485.anInt8420 != 3) {
						return;
					}
					if (Static251.anInt4607 == 0 && Static40.anInt1258 == 0) {
						Static336.aString67 = local83;
						Static446.aString85 = local89;
						Static90.anInt2169 = local97;
						Static256.method4279(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static16.method3832();
					return;
				}
				if (arg0 == 5602) {
					if (Static251.anInt4607 == 0) {
						Static470.anInt8244 = -2;
						Static77.anInt1909 = -2;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt5396--;
					if (Static485.anInt8420 != 3) {
						return;
					}
					if (Static251.anInt4607 == 0 && Static40.anInt1258 == 0) {
						Static603.method8433(aStringArray21[anInt5396]);
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt5396 -= 2;
					anInt5395 -= 2;
					if (Static485.anInt8420 != 3) {
						return;
					}
					if (Static251.anInt4607 == 0 && Static40.anInt1258 == 0) {
						Static319.method5228(aStringArray21[anInt5396], anIntArray292[anInt5395], aStringArray21[anInt5396 + 1], anIntArray292[anInt5395 + 1] == 1);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static40.anInt1258 == 0) {
						Static78.anInt1910 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray292[anInt5395++] = Static77.anInt1909;
					return;
				}
				if (arg0 == 5608) {
					anIntArray292[anInt5395++] = Static416.anInt7573;
					return;
				}
				if (arg0 == 5609) {
					anIntArray292[anInt5395++] = Static78.anInt1910;
					return;
				}
				if (arg0 == 5611) {
					anIntArray292[anInt5395++] = Static36.anInt1187;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray292[--anInt5395];
					if (Static485.anInt8420 != 7) {
						return;
					}
					if (Static251.anInt4607 == 0 && Static40.anInt1258 == 0) {
						if (Static413.aClass230_1 != null) {
							Static413.aClass230_1.method6028();
							Static413.aClass230_1 = null;
						}
						Static90.anInt2169 = local175;
						Static256.method4279(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray292[anInt5395++] = Static77.anInt1909;
					return;
				}
				if (arg0 == 5615) {
					anInt5396 -= 2;
					local83 = aStringArray21[anInt5396];
					local89 = aStringArray21[anInt5396 + 1];
					if (local83.length() > 320) {
						return;
					}
					if (Static485.anInt8420 != 3) {
						return;
					}
					if (Static251.anInt4607 == 0 && Static40.anInt1258 == 0) {
						if (Static413.aClass230_1 != null) {
							Static413.aClass230_1.method6028();
							Static413.aClass230_1 = null;
						}
						Static336.aString67 = local83;
						Static446.aString85 = local89;
						Static256.method4279(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static439.method6845(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray292[anInt5395++] = Static470.anInt8244;
					return;
				}
				if (arg0 == 5618) {
					anInt5395--;
					return;
				}
				if (arg0 == 5619) {
					anInt5395--;
					return;
				}
				if (arg0 == 5620) {
					anIntArray292[anInt5395++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt5396 -= 2;
					anInt5395 -= 2;
					return;
				}
				if (arg0 == 5622) {
					return;
				}
				if (arg0 == 5623) {
					if (Static76.aString8 != null) {
						anIntArray292[anInt5395++] = 1;
						return;
					}
					anIntArray292[anInt5395++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray292[anInt5395++] = (int) (Static151.aLong77 >> 32);
					anIntArray292[anInt5395++] = (int) (Static151.aLong77 & 0xFFFFL);
					return;
				}
				if (arg0 == 5625) {
					anIntArray292[anInt5395++] = Static141.aBoolean184 ? 1 : 0;
					return;
				}
				if (arg0 == 5626) {
					Static141.aBoolean184 = true;
					Static456.method6999();
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray292[--anInt5395];
					Static262.aClass3_Sub27_12.method3234(local175, Static262.aClass3_Sub27_12.aClass21_Sub23_1);
					Static73.method1756();
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				@Pc(4786) boolean local4786;
				if (arg0 == 6002) {
					local4786 = anIntArray292[--anInt5395] == 1;
					Static262.aClass3_Sub27_12.method3234(local4786 ? 1 : 0, Static262.aClass3_Sub27_12.aClass21_Sub8_1);
					Static262.aClass3_Sub27_12.method3234(local4786 ? 1 : 0, Static262.aClass3_Sub27_12.aClass21_Sub8_2);
					Static73.method1756();
					Static429.method6678();
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6003) {
					local4786 = anIntArray292[--anInt5395] == 1;
					Static262.aClass3_Sub27_12.method3234(local4786 ? 2 : 1, Static262.aClass3_Sub27_12.aClass21_Sub27_2);
					Static262.aClass3_Sub27_12.method3234(local4786 ? 2 : 1, Static262.aClass3_Sub27_12.aClass21_Sub27_1);
					Static429.method6678();
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6005) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395] == 1 ? 1 : 0, Static262.aClass3_Sub27_12.aClass21_Sub22_1);
					Static73.method1756();
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6007) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395], Static262.aClass3_Sub27_12.aClass21_Sub21_1);
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6008) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395] == 1 ? 1 : 0, Static262.aClass3_Sub27_12.aClass21_Sub7_1);
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6010) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395] == 1 ? 1 : 0, Static262.aClass3_Sub27_12.aClass21_Sub19_1);
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6011) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395], Static262.aClass3_Sub27_12.aClass21_Sub5_1);
					Static73.method1756();
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6012) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395] == 1 ? 1 : 0, Static262.aClass3_Sub27_12.aClass21_Sub12_1);
					Static128.method2511();
					Static175.method3056();
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6014) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395] == 1 ? 2 : 0, Static262.aClass3_Sub27_12.aClass21_Sub15_1);
					Static73.method1756();
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6015) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395] == 1 ? 1 : 0, Static262.aClass3_Sub27_12.aClass21_Sub20_1);
					Static73.method1756();
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6016) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395], Static262.aClass3_Sub27_12.aClass21_Sub26_2);
					Static441.method6865(false, Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025());
					Static108.method2177();
					return;
				}
				if (arg0 == 6017) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395] == 1 ? 1 : 0, Static262.aClass3_Sub27_12.aClass21_Sub18_1);
					Static155.method2829();
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6018) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395], Static262.aClass3_Sub27_12.aClass21_Sub14_4);
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray292[--anInt5395];
					local776 = Static262.aClass3_Sub27_12.aClass21_Sub14_2.method5405();
					if (local175 != local776) {
						if (Static2.method22(Static485.anInt8420)) {
							if (local776 == 0 && Static472.anInt8274 != -1) {
								Static189.method3227(Static472.anInt8274, Static336.aClass196_65, local175);
								Static464.method7046();
								Static120.aBoolean173 = false;
							} else if (local175 == 0) {
								Static486.method7235();
								Static120.aBoolean173 = false;
							} else {
								Static17.method868(local175);
							}
						}
						Static262.aClass3_Sub27_12.method3234(local175, Static262.aClass3_Sub27_12.aClass21_Sub14_2);
						Static108.method2177();
						Static168.aBoolean272 = false;
					}
					return;
				}
				if (arg0 == 6020) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395], Static262.aClass3_Sub27_12.aClass21_Sub14_5);
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6021) {
					local175 = Static262.aClass3_Sub27_12.aClass21_Sub27_2.method8338();
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395] == 1 ? 0 : local175, Static262.aClass3_Sub27_12.aClass21_Sub27_1);
					Static429.method6678();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray292[--anInt5395];
					Static262.aClass3_Sub27_12.method3234(local175, Static262.aClass3_Sub27_12.aClass21_Sub25_1);
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6024) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395], Static262.aClass3_Sub27_12.aClass21_Sub26_1);
					Static108.method2177();
					return;
				}
				if (arg0 == 6025) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395], Static262.aClass3_Sub27_12.aClass21_Sub4_1);
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray292[--anInt5395];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static163.method2899(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395] == 0 ? 0 : 1, Static262.aClass3_Sub27_12.aClass21_Sub10_1);
					Static108.method2177();
					return;
				}
				if (arg0 == 6029) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395], Static262.aClass3_Sub27_12.aClass21_Sub21_1);
					Static108.method2177();
					return;
				}
				if (arg0 == 6030) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395] == 0 ? 0 : 1, Static262.aClass3_Sub27_12.aClass21_Sub3_1);
					Static108.method2177();
					Static73.method1756();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray292[--anInt5395];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static441.method6865(false, local175);
					return;
				}
				if (arg0 == 6032) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395], Static262.aClass3_Sub27_12.aClass21_Sub1_2);
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6033) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395], Static262.aClass3_Sub27_12.aClass21_Sub24_1);
					Static108.method2177();
					return;
				}
				if (arg0 == 6034) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395] == 1 ? 1 : 0, Static262.aClass3_Sub27_12.aClass21_Sub9_1);
					Static108.method2177();
					Static128.method2511();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6035) {
					local175 = Static262.aClass3_Sub27_12.aClass21_Sub8_1.method2406();
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395] == 1 ? 1 : local175, Static262.aClass3_Sub27_12.aClass21_Sub8_2);
					Static73.method1756();
					Static429.method6678();
					return;
				}
				if (arg0 == 6036) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395], Static262.aClass3_Sub27_12.aClass21_Sub17_1);
					Static108.method2177();
					Static314.aBoolean418 = true;
					return;
				}
				if (arg0 == 6037) {
					Static262.aClass3_Sub27_12.method3234(anIntArray292[--anInt5395], Static262.aClass3_Sub27_12.aClass21_Sub14_1);
					Static108.method2177();
					Static168.aBoolean272 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray292[--anInt5395];
					local776 = Static262.aClass3_Sub27_12.aClass21_Sub14_3.method5405();
					if (local175 != local776 && Static472.anInt8274 == Static249.anInt4578) {
						if (!Static2.method22(Static485.anInt8420)) {
							if (local776 == 0) {
								Static189.method3227(Static472.anInt8274, Static336.aClass196_65, local175);
								Static464.method7046();
								Static120.aBoolean173 = false;
							} else if (local175 == 0) {
								Static486.method7235();
								Static120.aBoolean173 = false;
							} else {
								Static17.method868(local175);
							}
						}
						Static262.aClass3_Sub27_12.method3234(local175, Static262.aClass3_Sub27_12.aClass21_Sub14_3);
						Static108.method2177();
						Static168.aBoolean272 = false;
					}
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray292[--anInt5395];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static262.aClass3_Sub27_12.aClass21_Sub16_1.method5997()) {
						Static262.aClass3_Sub27_12.method3234(local175, Static262.aClass3_Sub27_12.aClass21_Sub16_1);
						Static108.method2177();
						Static168.aBoolean272 = false;
					}
					return;
				}
				if (arg0 == 6040) {
					local175 = anIntArray292[--anInt5395];
					if (local175 != Static262.aClass3_Sub27_12.aClass21_Sub28_1.method8504()) {
						Static262.aClass3_Sub27_12.method3234(local175, Static262.aClass3_Sub27_12.aClass21_Sub28_1);
						Static108.method2177();
						Static168.aBoolean272 = false;
						Static58.method1595();
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub23_1.method7600();
					return;
				}
				if (arg0 == 6102) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub8_1.method2406() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub27_2.method8338() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub22_1.method6900() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub21_1.method6846();
					return;
				}
				if (arg0 == 6108) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub7_1.method2118() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub19_1.method6583() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub5_1.method1474();
					return;
				}
				if (arg0 == 6112) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub12_1.method4533() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub15_1.method5810() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub20_1.method6682() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub26_2.method8162();
					return;
				}
				if (arg0 == 6117) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub18_1.method6208() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub14_4.method5405();
					return;
				}
				if (arg0 == 6119) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub14_2.method5405();
					return;
				}
				if (arg0 == 6120) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub14_5.method5405();
					return;
				}
				if (arg0 == 6123) {
					anIntArray292[anInt5395++] = Static386.method6225();
					return;
				}
				if (arg0 == 6124) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub26_1.method8162();
					return;
				}
				if (arg0 == 6125) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub4_1.method1459();
					return;
				}
				if (arg0 == 6127) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub29_1.method8645() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub10_1.method3734() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub21_1.method6846();
					return;
				}
				if (arg0 == 6130) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub3_1.method1270() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025();
					return;
				}
				if (arg0 == 6132) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub1_2.method1025();
					return;
				}
				if (arg0 == 6133) {
					anIntArray292[anInt5395++] = Static205.aClass138_2.aBoolean276 && !Static205.aClass138_2.aBoolean278 ? 1 : 0;
					return;
				}
				if (arg0 == 6135) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub24_1.method7795();
					return;
				}
				if (arg0 == 6136) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub9_1.method3111() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray292[anInt5395++] = Static602.method8408(200, Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025());
					return;
				}
				if (arg0 == 6139) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub17_1.method6184();
					return;
				}
				if (arg0 == 6142) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub14_1.method5405();
					return;
				}
				if (arg0 == 6143) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub14_3.method5405();
					return;
				}
				if (arg0 == 6144) {
					anIntArray292[anInt5395++] = Static12.aBoolean55 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub16_1.method5997();
					return;
				}
				if (arg0 == 6146) {
					anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub28_1.method8504();
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt5395 -= 2;
					Static598.aShort130 = (short) anIntArray292[anInt5395];
					if (Static598.aShort130 <= 0) {
						Static598.aShort130 = 256;
					}
					Static301.aShort78 = (short) anIntArray292[anInt5395 + 1];
					if (Static301.aShort78 <= 0) {
						Static301.aShort78 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt5395 -= 2;
					Static213.aShort58 = (short) anIntArray292[anInt5395];
					if (Static213.aShort58 <= 0) {
						Static213.aShort58 = 256;
					}
					Static524.aShort114 = (short) anIntArray292[anInt5395 + 1];
					if (Static524.aShort114 <= 0) {
						Static524.aShort114 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt5395 -= 4;
					Static20.aShort1 = (short) anIntArray292[anInt5395];
					if (Static20.aShort1 <= 0) {
						Static20.aShort1 = 1;
					}
					Static626.aShort131 = (short) anIntArray292[anInt5395 + 1];
					if (Static626.aShort131 <= 0) {
						Static626.aShort131 = 32767;
					} else if (Static626.aShort131 < Static20.aShort1) {
						Static626.aShort131 = Static20.aShort1;
					}
					Static492.aShort113 = (short) anIntArray292[anInt5395 + 2];
					if (Static492.aShort113 <= 0) {
						Static492.aShort113 = 1;
					}
					Static92.aShort27 = (short) anIntArray292[anInt5395 + 3];
					if (Static92.aShort27 <= 0) {
						Static92.aShort27 = 32767;
						return;
					}
					if (Static92.aShort27 < Static492.aShort113) {
						Static92.aShort27 = Static492.aShort113;
					}
					return;
				}
				if (arg0 == 6203) {
					Static11.method8403(0, Static270.aClass279_8.anInt8153, 0, Static270.aClass279_8.anInt8141, false);
					anIntArray292[anInt5395++] = Static596.anInt9758;
					anIntArray292[anInt5395++] = Static506.anInt8740;
					return;
				}
				if (arg0 == 6204) {
					anIntArray292[anInt5395++] = Static213.aShort58;
					anIntArray292[anInt5395++] = Static524.aShort114;
					return;
				}
				if (arg0 == 6205) {
					anIntArray292[anInt5395++] = Static598.aShort130;
					anIntArray292[anInt5395++] = Static301.aShort78;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray292[anInt5395++] = (int) (Static374.method6036() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray292[anInt5395++] = (int) (Static374.method6036() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt5395 -= 3;
					local175 = anIntArray292[anInt5395];
					local776 = anIntArray292[anInt5395 + 1];
					local97 = anIntArray292[anInt5395 + 2];
					aCalendar2.clear();
					aCalendar2.set(11, 12);
					aCalendar2.set(local97, local776, local175);
					local103 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray292[anInt5395++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar2.clear();
					aCalendar2.setTime(new Date(Static374.method6036()));
					anIntArray292[anInt5395++] = aCalendar2.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray292[--anInt5395];
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
					anIntArray292[anInt5395++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray292[anInt5395++] = Static125.method2477() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray292[anInt5395++] = Static571.method8137() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static485.anInt8420 == 7 && Static251.anInt4607 == 0 && Static40.anInt1258 == 0) {
						if (Static239.aBoolean300) {
							anIntArray292[anInt5395++] = 0;
							return;
						}
						if (Static206.aLong110 > Static374.method6036() - 1000L) {
							anIntArray292[anInt5395++] = 1;
							return;
						}
						Static239.aBoolean300 = true;
						local52 = Static139.method2308(Static507.aClass130_121, Static24.aClass233_1);
						local52.aClass3_Sub3_Sub2_2.method4265(Static580.anInt9555);
						Static562.method8096(local52);
						anIntArray292[anInt5395++] = 0;
						return;
					}
					anIntArray292[anInt5395++] = 1;
					return;
				}
				@Pc(6803) Class221 local6803;
				@Pc(6770) Class96_Sub1 local6770;
				if (arg0 == 6501) {
					local6770 = Static282.method4551();
					if (local6770 != null) {
						anIntArray292[anInt5395++] = local6770.anInt3303;
						anIntArray292[anInt5395++] = local6770.anInt3293;
						aStringArray21[anInt5396++] = local6770.aString30;
						local6803 = local6770.method2973();
						anIntArray292[anInt5395++] = local6803.anInt6786;
						aStringArray21[anInt5396++] = local6803.aString71;
						anIntArray292[anInt5395++] = local6770.anInt3292;
						anIntArray292[anInt5395++] = local6770.anInt3304;
						aStringArray21[anInt5396++] = local6770.aString29;
						return;
					}
					anIntArray292[anInt5395++] = -1;
					anIntArray292[anInt5395++] = 0;
					aStringArray21[anInt5396++] = "";
					anIntArray292[anInt5395++] = 0;
					aStringArray21[anInt5396++] = "";
					anIntArray292[anInt5395++] = 0;
					anIntArray292[anInt5395++] = 0;
					aStringArray21[anInt5396++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6770 = Static208.method7375();
					if (local6770 != null) {
						anIntArray292[anInt5395++] = local6770.anInt3303;
						anIntArray292[anInt5395++] = local6770.anInt3293;
						aStringArray21[anInt5396++] = local6770.aString30;
						local6803 = local6770.method2973();
						anIntArray292[anInt5395++] = local6803.anInt6786;
						aStringArray21[anInt5396++] = local6803.aString71;
						anIntArray292[anInt5395++] = local6770.anInt3292;
						anIntArray292[anInt5395++] = local6770.anInt3304;
						aStringArray21[anInt5396++] = local6770.aString29;
						return;
					}
					anIntArray292[anInt5395++] = -1;
					anIntArray292[anInt5395++] = 0;
					aStringArray21[anInt5396++] = "";
					anIntArray292[anInt5395++] = 0;
					aStringArray21[anInt5396++] = "";
					anIntArray292[anInt5395++] = 0;
					anIntArray292[anInt5395++] = 0;
					aStringArray21[anInt5396++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray292[--anInt5395];
					local89 = aStringArray21[--anInt5396];
					if (Static485.anInt8420 == 7 && Static251.anInt4607 == 0 && Static40.anInt1258 == 0) {
						anIntArray292[anInt5395++] = Static404.method6472(local175, local89) ? 1 : 0;
						return;
					}
					anIntArray292[anInt5395++] = 0;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray292[--anInt5395];
					@Pc(7130) Class96_Sub1 local7130 = Static626.method8630(local175);
					if (local7130 != null) {
						anIntArray292[anInt5395++] = local7130.anInt3293;
						aStringArray21[anInt5396++] = local7130.aString30;
						@Pc(7154) Class221 local7154 = local7130.method2973();
						anIntArray292[anInt5395++] = local7154.anInt6786;
						aStringArray21[anInt5396++] = local7154.aString71;
						anIntArray292[anInt5395++] = local7130.anInt3292;
						anIntArray292[anInt5395++] = local7130.anInt3304;
						aStringArray21[anInt5396++] = local7130.aString29;
						return;
					}
					anIntArray292[anInt5395++] = -1;
					aStringArray21[anInt5396++] = "";
					anIntArray292[anInt5395++] = 0;
					aStringArray21[anInt5396++] = "";
					anIntArray292[anInt5395++] = 0;
					anIntArray292[anInt5395++] = 0;
					aStringArray21[anInt5396++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt5395 -= 4;
					local175 = anIntArray292[anInt5395];
					local1496 = anIntArray292[anInt5395 + 1] == 1;
					local97 = anIntArray292[anInt5395 + 2];
					local2107 = anIntArray292[anInt5395 + 3] == 1;
					Static627.method8644(local97, local1496, local2107, local175);
					return;
				}
				if (arg0 == 6508) {
					Static128.method2510();
					return;
				}
				if (arg0 == 6509) {
					if (Static485.anInt8420 != 7) {
						return;
					}
					Static359.aBoolean496 = anIntArray292[--anInt5395] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray292[anInt5395++] = Static331.anInt6182;
					return;
				}
			} else if (arg0 >= 6700) {
				if (arg0 < 6800 && Static545.aClass228_14 == Static463.aClass228_11) {
					if (arg0 == 6700) {
						local175 = Static356.aClass280_29.method7106();
						if (Static307.anInt5465 != -1) {
							local175++;
						}
						anIntArray292[anInt5395++] = local175;
						return;
					}
					if (arg0 == 6701) {
						local175 = anIntArray292[--anInt5395];
						if (Static307.anInt5465 != -1) {
							if (local175 == 0) {
								anIntArray292[anInt5395++] = Static307.anInt5465;
								return;
							}
							local175--;
						}
						@Pc(7402) Class3_Sub29 local7402 = (Class3_Sub29) Static356.aClass280_29.method7110();
						while (local175-- > 0) {
							local7402 = (Class3_Sub29) Static356.aClass280_29.method7108();
						}
						anIntArray292[anInt5395++] = local7402.anInt4601;
						return;
					}
					if (arg0 == 6702) {
						local175 = anIntArray292[--anInt5395];
						if (Static92.aClass279ArrayArray1[local175] == null) {
							aStringArray21[anInt5396++] = "";
							return;
						}
						local89 = Static92.aClass279ArrayArray1[local175][0].aString93;
						if (local89 == null) {
							aStringArray21[anInt5396++] = "";
							return;
						}
						aStringArray21[anInt5396++] = local89.substring(0, local89.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local175 = anIntArray292[--anInt5395];
						if (Static92.aClass279ArrayArray1[local175] == null) {
							anIntArray292[anInt5395++] = 0;
							return;
						}
						anIntArray292[anInt5395++] = Static92.aClass279ArrayArray1[local175].length;
						return;
					}
					if (arg0 == 6704) {
						anInt5395 -= 2;
						local175 = anIntArray292[anInt5395];
						local776 = anIntArray292[anInt5395 + 1];
						if (Static92.aClass279ArrayArray1[local175] == null) {
							aStringArray21[anInt5396++] = "";
							return;
						}
						local181 = Static92.aClass279ArrayArray1[local175][local776].aString93;
						if (local181 == null) {
							aStringArray21[anInt5396++] = "";
							return;
						}
						aStringArray21[anInt5396++] = local181;
						return;
					}
					if (arg0 == 6705) {
						anInt5395 -= 2;
						local175 = anIntArray292[anInt5395];
						local776 = anIntArray292[anInt5395 + 1];
						if (Static92.aClass279ArrayArray1[local175] == null) {
							anIntArray292[anInt5395++] = 0;
							return;
						}
						anIntArray292[anInt5395++] = Static92.aClass279ArrayArray1[local175][local776].anInt8183;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt5395 -= 3;
						local175 = anIntArray292[anInt5395];
						local776 = anIntArray292[anInt5395 + 1];
						local97 = anIntArray292[anInt5395 + 2];
						Static641.method8741("", 1, local97, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6708) {
						anInt5395 -= 3;
						local175 = anIntArray292[anInt5395];
						local776 = anIntArray292[anInt5395 + 1];
						local97 = anIntArray292[anInt5395 + 2];
						Static641.method8741("", 2, local97, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6709) {
						anInt5395 -= 3;
						local175 = anIntArray292[anInt5395];
						local776 = anIntArray292[anInt5395 + 1];
						local97 = anIntArray292[anInt5395 + 2];
						Static641.method8741("", 3, local97, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6710) {
						anInt5395 -= 3;
						local175 = anIntArray292[anInt5395];
						local776 = anIntArray292[anInt5395 + 1];
						local97 = anIntArray292[anInt5395 + 2];
						Static641.method8741("", 4, local97, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6711) {
						anInt5395 -= 3;
						local175 = anIntArray292[anInt5395];
						local776 = anIntArray292[anInt5395 + 1];
						local97 = anIntArray292[anInt5395 + 2];
						Static641.method8741("", 5, local97, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6712) {
						anInt5395 -= 3;
						local175 = anIntArray292[anInt5395];
						local776 = anIntArray292[anInt5395 + 1];
						local97 = anIntArray292[anInt5395 + 2];
						Static641.method8741("", 6, local97, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6713) {
						anInt5395 -= 3;
						local175 = anIntArray292[anInt5395];
						local776 = anIntArray292[anInt5395 + 1];
						local97 = anIntArray292[anInt5395 + 2];
						Static641.method8741("", 7, local97, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6714) {
						anInt5395 -= 3;
						local175 = anIntArray292[anInt5395];
						local776 = anIntArray292[anInt5395 + 1];
						local97 = anIntArray292[anInt5395 + 2];
						Static641.method8741("", 8, local97, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6715) {
						anInt5395 -= 3;
						local175 = anIntArray292[anInt5395];
						local776 = anIntArray292[anInt5395 + 1];
						local97 = anIntArray292[anInt5395 + 2];
						Static641.method8741("", 9, local97, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6716) {
						anInt5395 -= 3;
						local175 = anIntArray292[anInt5395];
						local776 = anIntArray292[anInt5395 + 1];
						local97 = anIntArray292[anInt5395 + 2];
						Static641.method8741("", 10, local97, local175 << 16 | local776);
						return;
					}
					if (arg0 == 6717) {
						anInt5395 -= 3;
						local175 = anIntArray292[anInt5395];
						local776 = anIntArray292[anInt5395 + 1];
						local97 = anIntArray292[anInt5395 + 2];
						@Pc(7990) Class279 local7990 = Static406.method6473(local175 << 16 | local776, local97);
						Static282.method4549();
						@Pc(7995) Class3_Sub15 local7995 = Static76.method1833(local7990);
						Static93.method2084(local7995.anInt2463, local7990, local7995.method2322());
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(8023) Class36 local8023;
					if (arg0 == 6800) {
						local175 = anIntArray292[--anInt5395];
						local8023 = Static68.aClass335_2.method8125(local175);
						if (local8023.aString5 == null) {
							aStringArray21[anInt5396++] = "";
							return;
						}
						aStringArray21[anInt5396++] = local8023.aString5;
						return;
					}
					if (arg0 == 6801) {
						local175 = anIntArray292[--anInt5395];
						local8023 = Static68.aClass335_2.method8125(local175);
						anIntArray292[anInt5395++] = local8023.anInt1339;
						return;
					}
					if (arg0 == 6802) {
						local175 = anIntArray292[--anInt5395];
						local8023 = Static68.aClass335_2.method8125(local175);
						anIntArray292[anInt5395++] = local8023.anInt1357;
						return;
					}
					if (arg0 == 6803) {
						local175 = anIntArray292[--anInt5395];
						local8023 = Static68.aClass335_2.method8125(local175);
						anIntArray292[anInt5395++] = local8023.anInt1351;
						return;
					}
					if (arg0 == 6804) {
						anInt5395 -= 2;
						local175 = anIntArray292[anInt5395];
						local776 = anIntArray292[anInt5395 + 1];
						@Pc(8145) Class300 local8145 = Static449.aClass55_2.method1843(local776);
						if (local8145.method7433()) {
							aStringArray21[anInt5396++] = Static68.aClass335_2.method8125(local175).method1409(local8145.aString98, local776);
							return;
						}
						anIntArray292[anInt5395++] = Static68.aClass335_2.method8125(local175).method1411(local8145.anInt8686, local776);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray292[anInt5395++] = Static134.aBoolean181 && !Static12.aBoolean56 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray292[anInt5395++] = Static563.anInt9403;
						return;
					}
					if (arg0 == 6902) {
						anIntArray292[anInt5395++] = Static329.anInt6159;
						return;
					}
					if (arg0 == 6903) {
						anIntArray292[anInt5395++] = Static491.anInt8521;
						return;
					}
					if (arg0 == 6904) {
						anIntArray292[anInt5395++] = Static469.anInt8232;
						return;
					}
					if (arg0 == 6905) {
						local83 = "";
						if (Static465.aClass304_5 != null) {
							if (Static465.aClass304_5.anObject16 == null) {
								local83 = Static339.method5723(Static465.aClass304_5.anInt8837);
							} else {
								local83 = (String) Static465.aClass304_5.anObject16;
							}
						}
						aStringArray21[anInt5396++] = local83;
						return;
					}
					if (arg0 == 6906) {
						anIntArray292[anInt5395++] = Static637.anInt10168;
						return;
					}
					if (arg0 == 6907) {
						anIntArray292[anInt5395++] = Static597.anInt9778;
						return;
					}
					if (arg0 == 6908) {
						anIntArray292[anInt5395++] = Static223.anInt4250;
						return;
					}
					if (arg0 == 6909) {
						anIntArray292[anInt5395++] = Static557.aBoolean670 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray292[anInt5395++] = Static382.anInt7176;
						return;
					}
					if (arg0 == 6911) {
						anIntArray292[anInt5395++] = Static585.anInt9590;
						return;
					}
					if (arg0 == 6912) {
						anIntArray292[anInt5395++] = Static363.anInt1643;
						return;
					}
				} else if (arg0 < 7100) {
					if (arg0 == 7000) {
						local175 = Static480.method7176();
						anIntArray292[anInt5395++] = Static184.anInt3536 = Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025();
						anIntArray292[anInt5395++] = local175;
						Static73.method1756();
						Static108.method2177();
						Static168.aBoolean272 = false;
						return;
					}
					if (arg0 == 7001) {
						Static103.method2140();
						Static73.method1756();
						Static108.method2177();
						Static168.aBoolean272 = false;
						return;
					}
					if (arg0 == 7002) {
						Static481.method7182();
						Static73.method1756();
						Static108.method2177();
						Static168.aBoolean272 = false;
						return;
					}
					if (arg0 == 7003) {
						Static634.method8680();
						Static73.method1756();
						Static108.method2177();
						Static168.aBoolean272 = false;
						return;
					}
					if (arg0 == 7004) {
						Static154.method2818();
						Static73.method1756();
						Static108.method2177();
						Static168.aBoolean272 = false;
						return;
					}
					if (arg0 == 7005) {
						Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub6_1);
						Static108.method2177();
						Static168.aBoolean272 = false;
						return;
					}
					if (arg0 == 7006) {
						if (Static184.anInt3536 == 2) {
							Static121.aBoolean174 = true;
							return;
						}
						if (Static184.anInt3536 == 1) {
							Static537.aBoolean655 = true;
							return;
						}
						if (Static184.anInt3536 == 3) {
							Static14.aBoolean58 = true;
						}
						return;
					}
					if (arg0 == 7007) {
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub6_1.method1594();
						return;
					}
				} else if (arg0 < 7200) {
					if (arg0 == 7100) {
						anInt5395 -= 2;
						local175 = anIntArray292[anInt5395];
						local776 = anIntArray292[anInt5395 + 1];
						if (local175 != -1) {
							if (local776 > 255) {
								local776 = 255;
							} else if (local776 < 0) {
								local776 = 0;
							}
							Static226.method1814(local175, local776, false);
						}
						return;
					}
					if (arg0 == 7101) {
						local175 = anIntArray292[--anInt5395];
						if (local175 != -1) {
							Static176.method3079(local175);
						}
						return;
					}
					if (arg0 == 7102) {
						local175 = anIntArray292[--anInt5395];
						if (local175 != -1) {
							Static461.method7014(local175);
						}
						return;
					}
					if (arg0 == 7103) {
						anIntArray292[anInt5395++] = Static352.method5817("jagtheora") ? 1 : 0;
						return;
					}
				} else if (arg0 < 7300) {
					if (arg0 == 7201) {
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub22_1.method6901() ? 1 : 0;
						return;
					}
					if (arg0 == 7202) {
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub19_1.method6580() ? 1 : 0;
						return;
					}
					if (arg0 == 7203) {
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub5_1.method1472() ? 1 : 0;
						return;
					}
					if (arg0 == 7204) {
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub15_1.method5807() ? 1 : 0;
						return;
					}
					if (arg0 == 7205) {
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub26_1.method8161() && Static323.aClass5_9.method7532() ? 1 : 0;
						return;
					}
					if (arg0 == 7206) {
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub25_1.method8041() ? 1 : 0;
						return;
					}
					if (arg0 == 7207) {
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub4_1.method1461() ? 1 : 0;
						return;
					}
					if (arg0 == 7208) {
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub29_1.method8643() && Static323.aClass5_9.method7543() ? 1 : 0;
						return;
					}
					if (arg0 == 7209) {
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub3_1.method1273() ? 1 : 0;
						return;
					}
					if (arg0 == 7210) {
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub9_1.method3113() ? 1 : 0;
						return;
					}
					if (arg0 == 7211) {
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub17_1.method6185() ? 1 : 0;
						return;
					}
					if (arg0 == 7212) {
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub20_1.method6681() ? 1 : 0;
						return;
					}
					if (arg0 == 7213) {
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub28_1.method8503() ? 1 : 0;
						return;
					}
				} else if (arg0 < 7400) {
					if (arg0 == 7301) {
						local175 = anIntArray292[--anInt5395];
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub22_1.method8635(local175);
						return;
					}
					if (arg0 == 7302) {
						local175 = anIntArray292[--anInt5395];
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub19_1.method8635(local175);
						return;
					}
					if (arg0 == 7303) {
						local175 = anIntArray292[--anInt5395];
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub5_1.method8635(local175);
						return;
					}
					if (arg0 == 7304) {
						local175 = anIntArray292[--anInt5395];
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub15_1.method8635(local175);
						return;
					}
					if (arg0 == 7305) {
						local175 = anIntArray292[--anInt5395];
						if (!Static323.aClass5_9.method7532()) {
							anIntArray292[anInt5395++] = 3;
							return;
						}
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub26_1.method8635(local175);
						return;
					}
					if (arg0 == 7306) {
						local175 = anIntArray292[--anInt5395];
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub25_1.method8635(local175);
						return;
					}
					if (arg0 == 7307) {
						local175 = anIntArray292[--anInt5395];
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub4_1.method8635(local175);
						return;
					}
					if (arg0 == 7308) {
						local175 = anIntArray292[--anInt5395];
						if (!Static323.aClass5_9.method7543()) {
							anIntArray292[anInt5395++] = 3;
							return;
						}
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub29_1.method8635(local175);
						return;
					}
					if (arg0 == 7309) {
						local175 = anIntArray292[--anInt5395];
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub3_1.method8635(local175);
						return;
					}
					if (arg0 == 7310) {
						local175 = anIntArray292[--anInt5395];
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub9_1.method8635(local175);
						return;
					}
					if (arg0 == 7311) {
						local175 = anIntArray292[--anInt5395];
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub17_1.method8635(local175);
						return;
					}
					if (arg0 == 7312) {
						local175 = anIntArray292[--anInt5395];
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub20_1.method8635(local175);
						return;
					}
					if (arg0 == 7313) {
						local175 = anIntArray292[--anInt5395];
						anIntArray292[anInt5395++] = Static262.aClass3_Sub27_12.aClass21_Sub28_1.method8635(local175);
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(C)I")
	private static int method4835(@OriginalArg(0) char arg0) {
		return Static367.method5983(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!fda;I)V")
	private static void method4836(@OriginalArg(0) Class3_Sub21 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub4_Sub14 local12 = Static415.method7924(local8);
		if (local12 == null) {
			return;
		}
		anIntArray294 = new int[local12.anInt4899];
		@Pc(21) int local21 = 0;
		aStringArray20 = new String[local12.anInt4901];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt2953;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt2947;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass279_5 == null ? -1 : arg0.aClass279_5.anInt8185;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2946;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass279_5 == null ? -1 : arg0.aClass279_5.anInt8147;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass279_4 == null ? -1 : arg0.aClass279_4.anInt8185;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass279_4 == null ? -1 : arg0.aClass279_4.anInt8147;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt2948;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt2950;
				}
				anIntArray294[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString24;
				}
				aStringArray20[local27++] = local135;
			}
		}
		anInt5408 = arg0.anInt2951;
		method4844(local12, arg1);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4837(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static302.anInt5364 == 0 && (Static134.aBoolean181 && !Static12.aBoolean56 || Static512.aBoolean628)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static59.aClass43_47.method1598(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static59.aClass43_47.method1598(0).length());
		} else if (local11.startsWith(Static59.aClass43_48.method1598(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static59.aClass43_48.method1598(0).length());
		} else if (local11.startsWith(Static59.aClass43_49.method1598(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static59.aClass43_49.method1598(0).length());
		} else if (local11.startsWith(Static59.aClass43_50.method1598(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static59.aClass43_50.method1598(0).length());
		} else if (local11.startsWith(Static59.aClass43_51.method1598(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static59.aClass43_51.method1598(0).length());
		} else if (local11.startsWith(Static59.aClass43_52.method1598(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static59.aClass43_52.method1598(0).length());
		} else if (local11.startsWith(Static59.aClass43_53.method1598(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static59.aClass43_53.method1598(0).length());
		} else if (local11.startsWith(Static59.aClass43_54.method1598(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static59.aClass43_54.method1598(0).length());
		} else if (local11.startsWith(Static59.aClass43_55.method1598(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static59.aClass43_55.method1598(0).length());
		} else if (local11.startsWith(Static59.aClass43_56.method1598(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static59.aClass43_56.method1598(0).length());
		} else if (local11.startsWith(Static59.aClass43_57.method1598(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static59.aClass43_57.method1598(0).length());
		} else if (local11.startsWith(Static59.aClass43_58.method1598(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static59.aClass43_58.method1598(0).length());
		} else if (Static325.anInt6083 != 0) {
			if (local11.startsWith(Static59.aClass43_47.method1598(Static325.anInt6083))) {
				local13 = 0;
				arg0 = arg0.substring(Static59.aClass43_47.method1598(Static325.anInt6083).length());
			} else if (local11.startsWith(Static59.aClass43_48.method1598(Static325.anInt6083))) {
				local13 = 1;
				arg0 = arg0.substring(Static59.aClass43_48.method1598(Static325.anInt6083).length());
			} else if (local11.startsWith(Static59.aClass43_49.method1598(Static325.anInt6083))) {
				local13 = 2;
				arg0 = arg0.substring(Static59.aClass43_49.method1598(Static325.anInt6083).length());
			} else if (local11.startsWith(Static59.aClass43_50.method1598(Static325.anInt6083))) {
				local13 = 3;
				arg0 = arg0.substring(Static59.aClass43_50.method1598(Static325.anInt6083).length());
			} else if (local11.startsWith(Static59.aClass43_51.method1598(Static325.anInt6083))) {
				local13 = 4;
				arg0 = arg0.substring(Static59.aClass43_51.method1598(Static325.anInt6083).length());
			} else if (local11.startsWith(Static59.aClass43_52.method1598(Static325.anInt6083))) {
				local13 = 5;
				arg0 = arg0.substring(Static59.aClass43_52.method1598(Static325.anInt6083).length());
			} else if (local11.startsWith(Static59.aClass43_53.method1598(Static325.anInt6083))) {
				local13 = 6;
				arg0 = arg0.substring(Static59.aClass43_53.method1598(Static325.anInt6083).length());
			} else if (local11.startsWith(Static59.aClass43_54.method1598(Static325.anInt6083))) {
				local13 = 7;
				arg0 = arg0.substring(Static59.aClass43_54.method1598(Static325.anInt6083).length());
			} else if (local11.startsWith(Static59.aClass43_55.method1598(Static325.anInt6083))) {
				local13 = 8;
				arg0 = arg0.substring(Static59.aClass43_55.method1598(Static325.anInt6083).length());
			} else if (local11.startsWith(Static59.aClass43_56.method1598(Static325.anInt6083))) {
				local13 = 9;
				arg0 = arg0.substring(Static59.aClass43_56.method1598(Static325.anInt6083).length());
			} else if (local11.startsWith(Static59.aClass43_57.method1598(Static325.anInt6083))) {
				local13 = 10;
				arg0 = arg0.substring(Static59.aClass43_57.method1598(Static325.anInt6083).length());
			} else if (local11.startsWith(Static59.aClass43_58.method1598(Static325.anInt6083))) {
				local13 = 11;
				arg0 = arg0.substring(Static59.aClass43_58.method1598(Static325.anInt6083).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Class43.lb.method1598(0))) {
			local451 = 1;
			arg0 = arg0.substring(Class43.lb.method1598(0).length());
		} else if (local11.startsWith(Static59.aClass43_59.method1598(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static59.aClass43_59.method1598(0).length());
		} else if (local11.startsWith(Static59.aClass43_60.method1598(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static59.aClass43_60.method1598(0).length());
		} else if (local11.startsWith(Static59.aClass43_61.method1598(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static59.aClass43_61.method1598(0).length());
		} else if (local11.startsWith(Static59.aClass43_62.method1598(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static59.aClass43_62.method1598(0).length());
		} else if (Static325.anInt6083 != 0) {
			if (local11.startsWith(Class43.lb.method1598(Static325.anInt6083))) {
				local451 = 1;
				arg0 = arg0.substring(Class43.lb.method1598(Static325.anInt6083).length());
			} else if (local11.startsWith(Static59.aClass43_59.method1598(Static325.anInt6083))) {
				local451 = 2;
				arg0 = arg0.substring(Static59.aClass43_59.method1598(Static325.anInt6083).length());
			} else if (local11.startsWith(Static59.aClass43_60.method1598(Static325.anInt6083))) {
				local451 = 3;
				arg0 = arg0.substring(Static59.aClass43_60.method1598(Static325.anInt6083).length());
			} else if (local11.startsWith(Static59.aClass43_61.method1598(Static325.anInt6083))) {
				local451 = 4;
				arg0 = arg0.substring(Static59.aClass43_61.method1598(Static325.anInt6083).length());
			} else if (local11.startsWith(Static59.aClass43_62.method1598(Static325.anInt6083))) {
				local451 = 5;
				arg0 = arg0.substring(Static59.aClass43_62.method1598(Static325.anInt6083).length());
			}
		}
		@Pc(641) Class3_Sub14 local641 = Static139.method2308(Static66.aClass130_28, Static24.aClass233_1);
		local641.aClass3_Sub3_Sub2_2.method4220(0);
		@Pc(650) int local650 = local641.aClass3_Sub3_Sub2_2.anInt4736;
		local641.aClass3_Sub3_Sub2_2.method4220(local13);
		local641.aClass3_Sub3_Sub2_2.method4220(local451);
		Static285.method4569(local641.aClass3_Sub3_Sub2_2, arg0);
		local641.aClass3_Sub3_Sub2_2.method4218(local641.aClass3_Sub3_Sub2_2.anInt4736 - local650);
		Static562.method8096(local641);
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V")
	public static void method4838(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static219.method3673(arg0)) {
			return;
		}
		@Pc(12) Class279[] local12 = Static92.aClass279ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class279 local19 = local12[local14];
			if (local19.anObjectArray31 != null) {
				@Pc(26) Class3_Sub21 local26 = new Class3_Sub21();
				local26.aClass279_5 = local19;
				local26.anObjectArray1 = local19.anObjectArray31;
				method4836(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(IZ)V")
	private static void method4839(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class279 local137;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(158) Class279 local158;
		@Pc(35) Class279 local35;
		@Pc(210) Class279 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt5395 -= 3;
				local13 = anIntArray292[anInt5395];
				local19 = anIntArray292[anInt5395 + 1];
				local25 = anIntArray292[anInt5395 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static433.method6771(local13);
				if (local35.aClass279Array2 == null) {
					local35.aClass279Array2 = new Class279[local25 + 1];
				}
				if (local35.aClass279Array2.length <= local25) {
					@Pc(54) Class279[] local54 = new Class279[local25 + 1];
					for (local56 = 0; local56 < local35.aClass279Array2.length; local56++) {
						local54[local56] = local35.aClass279Array2[local56];
					}
					local35.aClass279Array2 = local54;
				}
				if (local25 > 0 && local35.aClass279Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class279 local99 = new Class279();
				local99.anInt8204 = local19;
				local99.anInt8203 = local99.anInt8185 = local35.anInt8185;
				local99.anInt8147 = local25;
				local35.aClass279Array2[local25] = local99;
				if (arg1) {
					aClass279_10 = local99;
				} else {
					aClass279_9 = local99;
				}
				Static482.method7193(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass279_10 : aClass279_9;
				if (local137.anInt8147 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static433.method6771(local137.anInt8185);
				local158.aClass279Array2[local137.anInt8147] = null;
				Static482.method7193(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static433.method6771(anIntArray292[--anInt5395]);
				local137.aClass279Array2 = null;
				Static482.method7193(local137);
				return;
			}
			if (arg0 == 200) {
				anInt5395 -= 2;
				local13 = anIntArray292[anInt5395];
				local19 = anIntArray292[anInt5395 + 1];
				local210 = Static406.method6473(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray292[anInt5395++] = 1;
					if (arg1) {
						aClass279_10 = local210;
						return;
					}
					aClass279_9 = local210;
					return;
				}
				anIntArray292[anInt5395++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray292[--anInt5395];
				local158 = Static433.method6771(local13);
				if (local158 != null) {
					anIntArray292[anInt5395++] = 1;
					if (arg1) {
						aClass279_10 = local158;
						return;
					}
					aClass279_9 = local158;
					return;
				}
				anIntArray292[anInt5395++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray292[--anInt5395];
				method4846(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray292[--anInt5395];
				method4841(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt5395 -= 2;
					local13 = anIntArray292[anInt5395];
					local19 = anIntArray292[anInt5395 + 1];
					for (local25 = 0; local25 < Static421.anIntArray465.length; local25++) {
						if (Static421.anIntArray465[local25] == local13) {
							Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass178_1.method4485(local25, local19, Static53.aClass286_6);
							return;
						}
					}
					for (local353 = 0; local353 < Static471.anIntArray523.length; local353++) {
						if (Static471.anIntArray523[local353] == local13) {
							Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass178_1.method4485(local353, local19, Static53.aClass286_6);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt5395 -= 2;
					local13 = anIntArray292[anInt5395];
					local19 = anIntArray292[anInt5395 + 1];
					Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass178_1.method4495(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray292[--anInt5395] != 0;
					Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass178_1.method4497(local412);
					return;
				}
				if (arg0 == 411) {
					anInt5395 -= 2;
					local13 = anIntArray292[anInt5395];
					local19 = anIntArray292[anInt5395 + 1];
					Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass178_1.method4488(local13, Static320.aClass53_2, local19);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static433.method6771(anIntArray292[--anInt5395]);
				} else {
					local137 = arg1 ? aClass279_10 : aClass279_9;
				}
				if (arg0 == 1000) {
					anInt5395 -= 4;
					local137.anInt8157 = anIntArray292[anInt5395];
					local137.anInt8151 = anIntArray292[anInt5395 + 1];
					local19 = anIntArray292[anInt5395 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray292[anInt5395 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte109 = (byte) local19;
					local137.aByte110 = (byte) local25;
					Static482.method7193(local137);
					Static150.method2733(local137);
					if (local137.anInt8147 == -1) {
						Static391.method6329(local137.anInt8185);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt5395 -= 4;
					local137.anInt8191 = anIntArray292[anInt5395];
					local137.anInt8194 = anIntArray292[anInt5395 + 1];
					local137.anInt8149 = 0;
					local137.anInt8166 = 0;
					local19 = anIntArray292[anInt5395 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray292[anInt5395 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte107 = (byte) local19;
					local137.aByte108 = (byte) local25;
					Static482.method7193(local137);
					Static150.method2733(local137);
					if (local137.anInt8204 == 0) {
						Static5.method3192(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray292[--anInt5395] == 1;
					if (local137.aBoolean580 != local645) {
						local137.aBoolean580 = local645;
						Static482.method7193(local137);
					}
					if (local137.anInt8147 == -1) {
						Static555.method8005(local137.anInt8185);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt5395 -= 2;
					local137.anInt8133 = anIntArray292[anInt5395];
					local137.anInt8173 = anIntArray292[anInt5395 + 1];
					Static482.method7193(local137);
					Static150.method2733(local137);
					if (local137.anInt8204 == 0) {
						Static5.method3192(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean564 = anIntArray292[--anInt5395] == 1;
					return;
				}
			} else {
				@Pc(1507) String local1507;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static433.method6771(anIntArray292[--anInt5395]);
					} else {
						local137 = arg1 ? aClass279_10 : aClass279_9;
					}
					if (arg0 == 1100) {
						anInt5395 -= 2;
						local137.anInt8136 = anIntArray292[anInt5395];
						if (local137.anInt8136 > local137.anInt8219 - local137.anInt8153) {
							local137.anInt8136 = local137.anInt8219 - local137.anInt8153;
						}
						if (local137.anInt8136 < 0) {
							local137.anInt8136 = 0;
						}
						local137.anInt8130 = anIntArray292[anInt5395 + 1];
						if (local137.anInt8130 > local137.anInt8131 - local137.anInt8141) {
							local137.anInt8130 = local137.anInt8131 - local137.anInt8141;
						}
						if (local137.anInt8130 < 0) {
							local137.anInt8130 = 0;
						}
						Static482.method7193(local137);
						if (local137.anInt8147 == -1) {
							Static454.method6977(local137.anInt8185);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt8150 = anIntArray292[--anInt5395];
						Static482.method7193(local137);
						if (local137.anInt8147 == -1) {
							Static393.method6344(local137.anInt8185);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean565 = anIntArray292[--anInt5395] == 1;
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt8168 = anIntArray292[--anInt5395];
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt8205 = anIntArray292[--anInt5395];
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray292[--anInt5395];
						if (local137.anInt8207 != local19) {
							local137.anInt8207 = local19;
							Static482.method7193(local137);
						}
						if (local137.anInt8147 == -1) {
							Static400.method6445(local137.anInt8185);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt8174 = anIntArray292[--anInt5395];
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean574 = anIntArray292[--anInt5395] == 1;
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt8152 = 1;
						local137.anInt8214 = anIntArray292[--anInt5395];
						Static482.method7193(local137);
						if (local137.anInt8147 == -1) {
							Static621.method8619(local137.anInt8185);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt5395 -= 6;
						local137.anInt8140 = anIntArray292[anInt5395];
						local137.anInt8176 = anIntArray292[anInt5395 + 1];
						local137.anInt8218 = anIntArray292[anInt5395 + 2];
						local137.anInt8188 = anIntArray292[anInt5395 + 3];
						local137.anInt8162 = anIntArray292[anInt5395 + 4];
						local137.anInt8201 = anIntArray292[anInt5395 + 5];
						Static482.method7193(local137);
						if (local137.anInt8147 == -1) {
							Static58.method1593(local137.anInt8185);
							Static311.method6189(local137.anInt8185);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray292[--anInt5395];
						if (local137.anInt8175 != local19) {
							local137.anInt8175 = local19;
							local137.anInt8135 = 0;
							local137.anInt8179 = 1;
							local137.anInt8145 = 0;
							@Pc(1094) Class361 local1094 = local137.anInt8175 == -1 ? null : Static115.aClass227_1.method5968(local137.anInt8175);
							if (local1094 != null) {
								Static146.method2678(local1094, local137.anInt8135);
							}
							Static482.method7193(local137);
						}
						if (local137.anInt8147 == -1) {
							Static593.method8326(local137.anInt8185);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean571 = anIntArray292[--anInt5395] == 1;
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray21[--anInt5396];
						if (!local1145.equals(local137.aString92)) {
							local137.aString92 = local1145;
							Static482.method7193(local137);
						}
						if (local137.anInt8147 == -1) {
							Static577.method8184(local137.anInt8185);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt8144 = anIntArray292[--anInt5395];
						Static482.method7193(local137);
						if (local137.anInt8147 == -1) {
							Static555.method8006(local137.anInt8185);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt5395 -= 3;
						local137.anInt8163 = anIntArray292[anInt5395];
						local137.anInt8220 = anIntArray292[anInt5395 + 1];
						local137.anInt8197 = anIntArray292[anInt5395 + 2];
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean572 = anIntArray292[--anInt5395] == 1;
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt8156 = anIntArray292[--anInt5395];
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt8169 = anIntArray292[--anInt5395];
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean576 = anIntArray292[--anInt5395] == 1;
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean566 = anIntArray292[--anInt5395] == 1;
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt5395 -= 2;
						local137.anInt8219 = anIntArray292[anInt5395];
						local137.anInt8131 = anIntArray292[anInt5395 + 1];
						Static482.method7193(local137);
						if (local137.anInt8204 == 0) {
							Static5.method3192(local137, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean568 = anIntArray292[--anInt5395] == 1;
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt8201 = anIntArray292[--anInt5395];
						Static482.method7193(local137);
						if (local137.anInt8147 == -1) {
							Static58.method1593(local137.anInt8185);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray292[--anInt5395];
						local137.aBoolean578 = local19 == 1;
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt5395 -= 2;
						local137.anInt8189 = anIntArray292[anInt5395];
						local137.anInt8221 = anIntArray292[anInt5395 + 1];
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt8180 = anIntArray292[--anInt5395];
						Static482.method7193(local137);
						return;
					}
					@Pc(1473) Class300 local1473;
					if (arg0 == 1127) {
						anInt5395 -= 2;
						local19 = anIntArray292[anInt5395];
						local25 = anIntArray292[anInt5395 + 1];
						local1473 = Static449.aClass55_2.method1843(local19);
						if (local25 != local1473.anInt8686) {
							local137.method7074(local25, local19);
							return;
						}
						local137.method7067(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray292[--anInt5395];
						local1507 = aStringArray21[--anInt5396];
						local1473 = Static449.aClass55_2.method1843(local19);
						if (!local1473.aString98.equals(local1507)) {
							local137.method7062(local1507, local19);
							return;
						}
						local137.method7067(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray292[--anInt5395];
						if ((local137.anInt8204 == 5 || arg0 != 1129) && (local137.anInt8204 == 4 || arg0 != 1130)) {
							if (local137.anInt8213 != local19) {
								local137.anInt8213 = local19;
								Static482.method7193(local137);
							}
							if (local137.anInt8147 == -1) {
								Static290.method4630(local137.anInt8185);
							}
							return;
						}
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static433.method6771(anIntArray292[--anInt5395]);
					} else {
						local137 = arg1 ? aClass279_10 : aClass279_9;
					}
					Static482.method7193(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt5395 -= 2;
						local19 = anIntArray292[anInt5395];
						local25 = anIntArray292[anInt5395 + 1];
						if (local137.anInt8147 == -1) {
							Static500.method7393(local137.anInt8185);
							Static58.method1593(local137.anInt8185);
							Static311.method6189(local137.anInt8185);
						}
						if (local19 == -1) {
							local137.anInt8152 = 1;
							local137.anInt8214 = -1;
							local137.anInt8217 = -1;
							return;
						}
						local137.anInt8217 = local19;
						local137.anInt8155 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean567 = true;
						} else {
							local137.aBoolean567 = false;
						}
						@Pc(1697) Class38 local1697 = Static320.aClass53_2.method1770(local19);
						local137.anInt8218 = local1697.anInt1433;
						local137.anInt8188 = local1697.anInt1484;
						local137.anInt8162 = local1697.anInt1436;
						local137.anInt8140 = local1697.anInt1478;
						local137.anInt8176 = local1697.anInt1441;
						local137.anInt8201 = local1697.anInt1469;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt8196 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt8196 = 1;
						} else {
							local137.anInt8196 = 2;
						}
						if (local137.anInt8149 > 0) {
							local137.anInt8201 = local137.anInt8201 * 32 / local137.anInt8149;
							return;
						} else {
							if (local137.anInt8191 > 0) {
								local137.anInt8201 = local137.anInt8201 * 32 / local137.anInt8191;
							}
							return;
						}
					}
					if (arg0 == 1201) {
						local137.anInt8152 = 2;
						local137.anInt8214 = anIntArray292[--anInt5395];
						if (local137.anInt8147 == -1) {
							Static621.method8619(local137.anInt8185);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt8152 = 3;
						local137.anInt8214 = -1;
						if (local137.anInt8147 == -1) {
							Static621.method8619(local137.anInt8185);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt8152 = 6;
						local137.anInt8214 = anIntArray292[--anInt5395];
						if (local137.anInt8147 == -1) {
							Static621.method8619(local137.anInt8185);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt8152 = 5;
						local137.anInt8214 = anIntArray292[--anInt5395];
						if (local137.anInt8147 == -1) {
							Static621.method8619(local137.anInt8185);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt5395 -= 4;
						local137.anInt8172 = anIntArray292[anInt5395];
						local137.anInt8178 = anIntArray292[anInt5395 + 1];
						local137.anInt8192 = anIntArray292[anInt5395 + 2];
						local137.anInt8158 = anIntArray292[anInt5395 + 3];
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt5395 -= 2;
						local137.anInt8154 = anIntArray292[anInt5395];
						local137.anInt8146 = anIntArray292[anInt5395 + 1];
						Static482.method7193(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt5395 -= 4;
						local137.anInt8214 = anIntArray292[anInt5395];
						local137.anInt8142 = anIntArray292[anInt5395 + 1];
						if (anIntArray292[anInt5395 + 2] == 1) {
							local137.anInt8152 = 9;
						} else {
							local137.anInt8152 = 8;
						}
						if (anIntArray292[anInt5395 + 3] == 1) {
							local137.aBoolean567 = true;
						} else {
							local137.aBoolean567 = false;
						}
						if (local137.anInt8147 == -1) {
							Static621.method8619(local137.anInt8185);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt8152 = 5;
						local137.anInt8214 = Static97.anInt2234;
						local137.anInt8142 = 0;
						if (local137.anInt8147 == -1) {
							Static621.method8619(local137.anInt8185);
						}
						return;
					}
				} else {
					@Pc(2357) int local2357;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static433.method6771(anIntArray292[--anInt5395]);
							} else {
								local137 = arg1 ? aClass279_10 : aClass279_9;
							}
							if (arg0 == 1499) {
								local137.method7065();
								return;
							}
							local1145 = aStringArray21[--anInt5396];
							@Pc(2443) int[] local2443 = null;
							if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
								local353 = anIntArray292[--anInt5395];
								if (local353 > 0) {
									local2443 = new int[local353];
									while (local353-- > 0) {
										local2443[local353] = anIntArray292[--anInt5395];
									}
								}
								local1145 = local1145.substring(0, local1145.length() - 1);
							}
							@Pc(2495) Object[] local2495 = new Object[local1145.length() + 1];
							for (local2357 = local2495.length - 1; local2357 >= 1; local2357--) {
								if (local1145.charAt(local2357 - 1) == 's') {
									local2495[local2357] = aStringArray21[--anInt5396];
								} else {
									local2495[local2357] = Integer.valueOf(anIntArray292[--anInt5395]);
								}
							}
							local56 = anIntArray292[--anInt5395];
							if (local56 == -1) {
								local2495 = null;
							} else {
								local2495[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray13 = local2495;
							} else if (arg0 == 1401) {
								local137.anObjectArray26 = local2495;
							} else if (arg0 == 1402) {
								local137.anObjectArray24 = local2495;
							} else if (arg0 == 1403) {
								local137.anObjectArray14 = local2495;
							} else if (arg0 == 1404) {
								local137.anObjectArray8 = local2495;
							} else if (arg0 == 1405) {
								local137.anObjectArray15 = local2495;
							} else if (arg0 == 1406) {
								local137.anObjectArray25 = local2495;
							} else if (arg0 == 1407) {
								local137.anObjectArray16 = local2495;
								local137.anIntArray515 = local2443;
							} else if (arg0 == 1408) {
								local137.anObjectArray19 = local2495;
							} else if (arg0 == 1409) {
								local137.anObjectArray27 = local2495;
							} else if (arg0 == 1410) {
								local137.anObjectArray9 = local2495;
							} else if (arg0 == 1411) {
								local137.anObjectArray18 = local2495;
							} else if (arg0 == 1412) {
								local137.anObjectArray22 = local2495;
							} else if (arg0 == 1414) {
								local137.anObjectArray32 = local2495;
								local137.anIntArray518 = local2443;
							} else if (arg0 == 1415) {
								local137.anObjectArray30 = local2495;
								local137.anIntArray513 = local2443;
							} else if (arg0 == 1416) {
								local137.anObjectArray23 = local2495;
							} else if (arg0 == 1417) {
								local137.anObjectArray4 = local2495;
							} else if (arg0 == 1418) {
								local137.anObjectArray10 = local2495;
							} else if (arg0 == 1419) {
								local137.anObjectArray6 = local2495;
							} else if (arg0 == 1420) {
								local137.anObjectArray17 = local2495;
							} else if (arg0 == 1421) {
								local137.anObjectArray29 = local2495;
							} else if (arg0 == 1422) {
								local137.anObjectArray20 = local2495;
							} else if (arg0 == 1423) {
								local137.anObjectArray5 = local2495;
							} else if (arg0 == 1424) {
								local137.anObjectArray3 = local2495;
							} else if (arg0 == 1425) {
								local137.lb = local2495;
							} else if (arg0 == 1426) {
								local137.anObjectArray28 = local2495;
							} else if (arg0 == 1427) {
								local137.anObjectArray21 = local2495;
							} else if (arg0 == 1428) {
								local137.anObjectArray11 = local2495;
								local137.anIntArray520 = local2443;
							} else if (arg0 == 1429) {
								local137.anObjectArray12 = local2495;
								local137.anIntArray516 = local2443;
							} else if (arg0 == 1430) {
								local137.anObjectArray7 = local2495;
							}
							local137.aBoolean563 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass279_10 : aClass279_9;
							if (arg0 == 1500) {
								anIntArray292[anInt5395++] = local137.anInt8200;
								return;
							}
							if (arg0 == 1501) {
								anIntArray292[anInt5395++] = local137.anInt8139;
								return;
							}
							if (arg0 == 1502) {
								anIntArray292[anInt5395++] = local137.anInt8153;
								return;
							}
							if (arg0 == 1503) {
								anIntArray292[anInt5395++] = local137.anInt8141;
								return;
							}
							if (arg0 == 1504) {
								anIntArray292[anInt5395++] = local137.aBoolean580 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray292[anInt5395++] = local137.anInt8203;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static329.method5388(local137);
								anIntArray292[anInt5395++] = local158 == null ? -1 : local158.anInt8185;
								return;
							}
						} else {
							@Pc(3091) Class300 local3091;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass279_10 : aClass279_9;
								if (arg0 == 1600) {
									anIntArray292[anInt5395++] = local137.anInt8136;
									return;
								}
								if (arg0 == 1601) {
									anIntArray292[anInt5395++] = local137.anInt8130;
									return;
								}
								if (arg0 == 1602) {
									aStringArray21[anInt5396++] = local137.aString92;
									return;
								}
								if (arg0 == 1603) {
									anIntArray292[anInt5395++] = local137.anInt8219;
									return;
								}
								if (arg0 == 1604) {
									anIntArray292[anInt5395++] = local137.anInt8131;
									return;
								}
								if (arg0 == 1605) {
									anIntArray292[anInt5395++] = local137.anInt8201;
									return;
								}
								if (arg0 == 1606) {
									anIntArray292[anInt5395++] = local137.anInt8218;
									return;
								}
								if (arg0 == 1607) {
									anIntArray292[anInt5395++] = local137.anInt8162;
									return;
								}
								if (arg0 == 1608) {
									anIntArray292[anInt5395++] = local137.anInt8188;
									return;
								}
								if (arg0 == 1609) {
									anIntArray292[anInt5395++] = local137.anInt8168;
									return;
								}
								if (arg0 == 1610) {
									anIntArray292[anInt5395++] = local137.anInt8140;
									return;
								}
								if (arg0 == 1611) {
									anIntArray292[anInt5395++] = local137.anInt8176;
									return;
								}
								if (arg0 == 1612) {
									anIntArray292[anInt5395++] = local137.anInt8207;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray292[--anInt5395];
									local3091 = Static449.aClass55_2.method1843(local19);
									if (local3091.method7433()) {
										aStringArray21[anInt5396++] = local137.method7075(local19, local3091.aString98);
										return;
									}
									anIntArray292[anInt5395++] = local137.method7076(local19, local3091.anInt8686);
									return;
								}
								if (arg0 == 1614) {
									anIntArray292[anInt5395++] = local137.anInt8174;
									return;
								}
								if (arg0 == 2614) {
									anIntArray292[anInt5395++] = local137.anInt8152 == 1 ? local137.anInt8214 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass279_10 : aClass279_9;
								if (arg0 == 1700) {
									anIntArray292[anInt5395++] = local137.anInt8217;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt8217 != -1) {
										anIntArray292[anInt5395++] = local137.anInt8155;
										return;
									}
									anIntArray292[anInt5395++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray292[anInt5395++] = local137.anInt8147;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass279_10 : aClass279_9;
								if (arg0 == 1800) {
									anIntArray292[anInt5395++] = Static76.method1833(local137).method2322();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray292[--anInt5395];
									local19--;
									if (local137.aStringArray30 != null && local19 < local137.aStringArray30.length && local137.aStringArray30[local19] != null) {
										aStringArray21[anInt5396++] = local137.aStringArray30[local19];
										return;
									}
									aStringArray21[anInt5396++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString91 == null) {
										aStringArray21[anInt5396++] = "";
										return;
									}
									aStringArray21[anInt5396++] = local137.aString91;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static433.method6771(anIntArray292[--anInt5395]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass279_10 : aClass279_9;
								}
								if (anInt5408 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray21 == null) {
										return;
									}
									@Pc(3360) Class3_Sub21 local3360 = new Class3_Sub21();
									local3360.aClass279_5 = local137;
									local3360.anObjectArray1 = local137.anObjectArray21;
									local3360.anInt2951 = anInt5408 + 1;
									Static443.aClass223_45.method5868(local3360);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static433.method6771(anIntArray292[--anInt5395]);
								if (arg0 == 2500) {
									anIntArray292[anInt5395++] = local137.anInt8200;
									return;
								}
								if (arg0 == 2501) {
									anIntArray292[anInt5395++] = local137.anInt8139;
									return;
								}
								if (arg0 == 2502) {
									anIntArray292[anInt5395++] = local137.anInt8153;
									return;
								}
								if (arg0 == 2503) {
									anIntArray292[anInt5395++] = local137.anInt8141;
									return;
								}
								if (arg0 == 2504) {
									anIntArray292[anInt5395++] = local137.aBoolean580 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray292[anInt5395++] = local137.anInt8203;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static329.method5388(local137);
									anIntArray292[anInt5395++] = local158 == null ? -1 : local158.anInt8185;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static433.method6771(anIntArray292[--anInt5395]);
								if (arg0 == 2600) {
									anIntArray292[anInt5395++] = local137.anInt8136;
									return;
								}
								if (arg0 == 2601) {
									anIntArray292[anInt5395++] = local137.anInt8130;
									return;
								}
								if (arg0 == 2602) {
									aStringArray21[anInt5396++] = local137.aString92;
									return;
								}
								if (arg0 == 2603) {
									anIntArray292[anInt5395++] = local137.anInt8219;
									return;
								}
								if (arg0 == 2604) {
									anIntArray292[anInt5395++] = local137.anInt8131;
									return;
								}
								if (arg0 == 2605) {
									anIntArray292[anInt5395++] = local137.anInt8201;
									return;
								}
								if (arg0 == 2606) {
									anIntArray292[anInt5395++] = local137.anInt8218;
									return;
								}
								if (arg0 == 2607) {
									anIntArray292[anInt5395++] = local137.anInt8162;
									return;
								}
								if (arg0 == 2608) {
									anIntArray292[anInt5395++] = local137.anInt8188;
									return;
								}
								if (arg0 == 2609) {
									anIntArray292[anInt5395++] = local137.anInt8168;
									return;
								}
								if (arg0 == 2610) {
									anIntArray292[anInt5395++] = local137.anInt8140;
									return;
								}
								if (arg0 == 2611) {
									anIntArray292[anInt5395++] = local137.anInt8176;
									return;
								}
								if (arg0 == 2612) {
									anIntArray292[anInt5395++] = local137.anInt8207;
									return;
								}
								if (arg0 == 2613) {
									anIntArray292[anInt5395++] = local137.anInt8174;
									return;
								}
								if (arg0 == 2614) {
									anIntArray292[anInt5395++] = local137.anInt8152 == 1 ? local137.anInt8214 : -1;
									return;
								}
							} else {
								@Pc(3889) Class3_Sub29 local3889;
								@Pc(3787) Class3_Sub29 local3787;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static433.method6771(anIntArray292[--anInt5395]);
										anIntArray292[anInt5395++] = local137.anInt8217;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static433.method6771(anIntArray292[--anInt5395]);
										if (local137.anInt8217 != -1) {
											anIntArray292[anInt5395++] = local137.anInt8155;
											return;
										}
										anIntArray292[anInt5395++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray292[--anInt5395];
										local3787 = (Class3_Sub29) Static356.aClass280_29.method7107((long) local13);
										if (local3787 != null) {
											anIntArray292[anInt5395++] = 1;
											return;
										}
										anIntArray292[anInt5395++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static433.method6771(anIntArray292[--anInt5395]);
										if (local137.aClass279Array2 == null) {
											anIntArray292[anInt5395++] = 0;
											return;
										}
										local19 = local137.aClass279Array2.length;
										for (local25 = 0; local25 < local137.aClass279Array2.length; local25++) {
											if (local137.aClass279Array2[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray292[anInt5395++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt5395 -= 2;
										local13 = anIntArray292[anInt5395];
										local19 = anIntArray292[anInt5395 + 1];
										local3889 = (Class3_Sub29) Static356.aClass280_29.method7107((long) local13);
										if (local3889 != null && local3889.anInt4601 == local19) {
											anIntArray292[anInt5395++] = 1;
											return;
										}
										anIntArray292[anInt5395++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static433.method6771(anIntArray292[--anInt5395]);
									if (arg0 == 2800) {
										anIntArray292[anInt5395++] = Static76.method1833(local137).method2322();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray292[--anInt5395];
										local19--;
										if (local137.aStringArray30 != null && local19 < local137.aStringArray30.length && local137.aStringArray30[local19] != null) {
											aStringArray21[anInt5396++] = local137.aStringArray30[local19];
											return;
										}
										aStringArray21[anInt5396++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString91 == null) {
											aStringArray21[anInt5396++] = "";
											return;
										}
										aStringArray21[anInt5396++] = local137.aString91;
										return;
									}
								} else {
									@Pc(4026) String local4026;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4026 = aStringArray21[--anInt5396];
											Static620.method8610(local4026);
											return;
										}
										if (arg0 == 3101) {
											anInt5395 -= 2;
											Static209.method3565(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2, anIntArray292[anInt5395 + 1], anIntArray292[anInt5395]);
											return;
										}
										if (arg0 == 3103) {
											Static422.method6619();
											return;
										}
										if (arg0 == 3104) {
											local4026 = aStringArray21[--anInt5396];
											local19 = 0;
											if (Static93.method2083(local4026)) {
												local19 = Static134.method2553(local4026);
											}
											@Pc(4086) Class3_Sub14 local4086 = Static139.method2308(Static54.aClass130_23, Static24.aClass233_1);
											local4086.aClass3_Sub3_Sub2_2.method4265(local19);
											Static562.method8096(local4086);
											return;
										}
										@Pc(4115) Class3_Sub14 local4115;
										if (arg0 == 3105) {
											local4026 = aStringArray21[--anInt5396];
											local4115 = Static139.method2308(Static498.aClass130_114, Static24.aClass233_1);
											local4115.aClass3_Sub3_Sub2_2.method4220(local4026.length() + 1);
											local4115.aClass3_Sub3_Sub2_2.method4241(local4026);
											Static562.method8096(local4115);
											return;
										}
										if (arg0 == 3106) {
											local4026 = aStringArray21[--anInt5396];
											local4115 = Static139.method2308(Static194.aClass130_57, Static24.aClass233_1);
											local4115.aClass3_Sub3_Sub2_2.method4220(local4026.length() + 1);
											local4115.aClass3_Sub3_Sub2_2.method4241(local4026);
											Static562.method8096(local4115);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray292[--anInt5395];
											local1145 = aStringArray21[--anInt5396];
											Static354.method5835(local13, local1145);
											return;
										}
										if (arg0 == 3108) {
											anInt5395 -= 3;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											local25 = anIntArray292[anInt5395 + 2];
											local35 = Static433.method6771(local25);
											Static603.method8428(local35, local19, local13);
											return;
										}
										if (arg0 == 3109) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											local210 = arg1 ? aClass279_10 : aClass279_9;
											Static603.method8428(local210, local19, local13);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray292[--anInt5395];
											local4115 = Static139.method2308(Static640.aClass130_137, Static24.aClass233_1);
											local4115.aClass3_Sub3_Sub2_2.method4201(local13);
											Static562.method8096(local4115);
											return;
										}
										if (arg0 == 3111) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											local3889 = (Class3_Sub29) Static356.aClass280_29.method7107((long) local13);
											if (local3889 != null) {
												Static54.method1546(local3889.anInt4601 != local19, true, local3889);
											}
											Static502.method7412(local13, local19, true, 3);
											return;
										}
										if (arg0 == 3112) {
											anInt5395--;
											local13 = anIntArray292[anInt5395];
											local3787 = (Class3_Sub29) Static356.aClass280_29.method7107((long) local13);
											if (local3787 != null && local3787.anInt4603 == 3) {
												Static54.method1546(true, true, local3787);
											}
											return;
										}
										if (arg0 == 3113) {
											Static395.method6378(aStringArray21[--anInt5396]);
											return;
										}
										if (arg0 == 3114) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											local1507 = aStringArray21[--anInt5396];
											Static582.method8231(local1507, "", local13, local19, "", "");
											return;
										}
										if (arg0 == 3115) {
											anInt5395 -= 11;
											@Pc(4416) Class83[] local4416 = Static352.method5820();
											@Pc(4419) Class50[] local4419 = Static496.method2282();
											Static252.method4089(anIntArray292[anInt5395 + 8], anIntArray292[anInt5395 + 6], anIntArray292[anInt5395 + 5], local4416[anIntArray292[anInt5395]], anIntArray292[anInt5395 + 3], anIntArray292[anInt5395 + 9], anIntArray292[anInt5395 + 10], anIntArray292[anInt5395 + 2], anIntArray292[anInt5395 + 7], anIntArray292[anInt5395 + 4], local4419[anIntArray292[anInt5395 + 1]]);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt5395 -= 3;
											Static137.method2968(anIntArray292[anInt5395], anIntArray292[anInt5395 + 2], 256, 255, anIntArray292[anInt5395 + 1]);
											return;
										}
										if (arg0 == 3201) {
											Static43.method1369(255, 50, anIntArray292[--anInt5395]);
											return;
										}
										if (arg0 == 3202) {
											anInt5395 -= 2;
											Static200.method3478(anIntArray292[anInt5395], 255, anIntArray292[anInt5395 + 1]);
											return;
										}
										if (arg0 == 3203) {
											anInt5395 -= 4;
											Static137.method2968(anIntArray292[anInt5395], anIntArray292[anInt5395 + 2], 256, anIntArray292[anInt5395 + 3], anIntArray292[anInt5395 + 1]);
											return;
										}
										if (arg0 == 3204) {
											anInt5395 -= 3;
											Static43.method1369(anIntArray292[anInt5395 + 1], anIntArray292[anInt5395 + 2], anIntArray292[anInt5395]);
											return;
										}
										if (arg0 == 3205) {
											anInt5395 -= 3;
											Static200.method3478(anIntArray292[anInt5395], anIntArray292[anInt5395 + 2], anIntArray292[anInt5395 + 1]);
											return;
										}
										if (arg0 == 3206) {
											anInt5395 -= 4;
											Static533.method7799(anIntArray292[anInt5395 + 1], anIntArray292[anInt5395], anIntArray292[anInt5395 + 2], false, 256, anIntArray292[anInt5395 + 3]);
											return;
										}
										if (arg0 == 3207) {
											anInt5395 -= 4;
											Static533.method7799(anIntArray292[anInt5395 + 1], anIntArray292[anInt5395], anIntArray292[anInt5395 + 2], true, 256, anIntArray292[anInt5395 + 3]);
											return;
										}
										if (arg0 == 3208) {
											anInt5395 -= 5;
											Static137.method2968(anIntArray292[anInt5395], anIntArray292[anInt5395 + 2], anIntArray292[anInt5395 + 4], anIntArray292[anInt5395 + 3], anIntArray292[anInt5395 + 1]);
											return;
										}
										if (arg0 == 3209) {
											anInt5395 -= 5;
											Static533.method7799(anIntArray292[anInt5395 + 1], anIntArray292[anInt5395], anIntArray292[anInt5395 + 2], false, anIntArray292[anInt5395 + 4], anIntArray292[anInt5395 + 3]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray292[anInt5395++] = Static101.anInt2262;
											return;
										}
										if (arg0 == 3301) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = Static528.method7757(local13, false, local19);
											return;
										}
										if (arg0 == 3302) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = Static39.method1335(false, local19, local13);
											return;
										}
										if (arg0 == 3303) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = Static380.method6115(local19, false, local13);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static465.aClass125_1.method3116(local13).anInt7662;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static505.anIntArray538[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static93.anIntArray82[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static532.anIntArray576[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4944) byte local4944 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123;
											local19 = (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916 >> 9) + Static299.anInt5307;
											local25 = (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911 >> 9) + Static171.anInt3340;
											anIntArray292[anInt5395++] = (local4944 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray292[anInt5395++] = Static475.aBoolean582 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = Static528.method7757(local13, true, local19);
											return;
										}
										if (arg0 == 3314) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = Static39.method1335(true, local19, local13);
											return;
										}
										if (arg0 == 3315) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = Static380.method6115(local19, true, local13);
											return;
										}
										if (arg0 == 3316) {
											if (Static302.anInt5364 >= 2) {
												anIntArray292[anInt5395++] = Static302.anInt5364;
												return;
											}
											anIntArray292[anInt5395++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray292[anInt5395++] = Static458.anInt8066;
											return;
										}
										if (arg0 == 3318) {
											anIntArray292[anInt5395++] = Static4.aClass363_1.anInt9891;
											return;
										}
										if (arg0 == 3321) {
											anIntArray292[anInt5395++] = Static199.anInt3922;
											return;
										}
										if (arg0 == 3322) {
											anIntArray292[anInt5395++] = Static474.anInt8296;
											return;
										}
										if (arg0 == 3323) {
											if (Static2.anInt5 >= 5 && Static2.anInt5 <= 9) {
												anIntArray292[anInt5395++] = 1;
												return;
											}
											anIntArray292[anInt5395++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static2.anInt5 >= 5 && Static2.anInt5 <= 9) {
												anIntArray292[anInt5395++] = Static2.anInt5;
												return;
											}
											anIntArray292[anInt5395++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray292[anInt5395++] = Static136.aBoolean182 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray292[anInt5395++] = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5812;
											return;
										}
										if (arg0 == 3327) {
											anIntArray292[anInt5395++] = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass178_1.aBoolean328 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray292[anInt5395++] = Static512.aBoolean628 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static280.method4531(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = Static508.method7599(local13, false, local19);
											return;
										}
										if (arg0 == 3332) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = Static508.method7599(local13, true, local19);
											return;
										}
										if (arg0 == 3333) {
											anIntArray292[anInt5395++] = Static90.anInt2169;
											return;
										}
										if (arg0 == 3335) {
											anIntArray292[anInt5395++] = Static325.anInt6083;
											return;
										}
										if (arg0 == 3336) {
											anInt5395 -= 4;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											local25 = anIntArray292[anInt5395 + 2];
											local353 = anIntArray292[anInt5395 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray292[anInt5395++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray292[anInt5395++] = Static58.anInt1583;
											return;
										}
										if (arg0 == 3338) {
											anIntArray292[anInt5395++] = Static49.method1447();
											return;
										}
										if (arg0 == 3339) {
											anIntArray292[anInt5395++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray292[anInt5395++] = Static638.aBoolean726 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray292[anInt5395++] = Static93.aBoolean147 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray292[anInt5395++] = Static483.aClass191_1.method6989();
											return;
										}
										if (arg0 == 3343) {
											anIntArray292[anInt5395++] = Static483.aClass191_1.method6982();
											return;
										}
										if (arg0 == 3344) {
											aStringArray21[anInt5396++] = Static67.method1697();
											return;
										}
										if (arg0 == 3345) {
											aStringArray21[anInt5396++] = Static45.method1401();
											return;
										}
										if (arg0 == 3346) {
											anIntArray292[anInt5395++] = Static252.method4088();
											return;
										}
										if (arg0 == 3347) {
											anIntArray292[anInt5395++] = Static620.anInt10048;
											return;
										}
										if (arg0 == 3349) {
											anIntArray292[anInt5395++] = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass63_7.method1994() >> 3;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5692) Class290 local5692;
										if (arg0 == 3400) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											local5692 = Static571.aClass31_1.method1344(local13);
											aStringArray21[anInt5396++] = local5692.method7229(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt5395 -= 4;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											local25 = anIntArray292[anInt5395 + 2];
											local353 = anIntArray292[anInt5395 + 3];
											@Pc(5738) Class290 local5738 = Static571.aClass31_1.method1344(local25);
											if (local5738.aChar2 == local13 && local5738.aChar1 == local19) {
												if (local19 == 115) {
													aStringArray21[anInt5396++] = local5738.method7229(local353);
													return;
												}
												anIntArray292[anInt5395++] = local5738.method7228(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt5395 -= 3;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											local25 = anIntArray292[anInt5395 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5814) Class290 local5814 = Static571.aClass31_1.method1344(local19);
											if (local5814.aChar1 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray292[anInt5395++] = local5814.method7233(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray292[--anInt5395];
											local1145 = aStringArray21[--anInt5396];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5692 = Static571.aClass31_1.method1344(local13);
											if (local5692.aChar1 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray292[anInt5395++] = local5692.method7225(local1145) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray292[--anInt5395];
											@Pc(5912) Class290 local5912 = Static571.aClass31_1.method1344(local13);
											anIntArray292[anInt5395++] = local5912.aClass280_36.method7106();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static311.anInt7186 == 0) {
												anIntArray292[anInt5395++] = -2;
												return;
											}
											if (Static311.anInt7186 == 1) {
												anIntArray292[anInt5395++] = -1;
												return;
											}
											anIntArray292[anInt5395++] = Static68.anInt1696;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray292[--anInt5395];
											if (Static311.anInt7186 == 2 && local13 < Static68.anInt1696) {
												aStringArray21[anInt5396++] = Static422.aStringArray29[local13];
												if (Static159.aStringArray13[local13] != null) {
													aStringArray21[anInt5396++] = Static159.aStringArray13[local13];
													return;
												}
												aStringArray21[anInt5396++] = "";
												return;
											}
											aStringArray21[anInt5396++] = "";
											aStringArray21[anInt5396++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray292[--anInt5395];
											if (Static311.anInt7186 == 2 && local13 < Static68.anInt1696) {
												anIntArray292[anInt5395++] = Static117.anIntArray105[local13];
												return;
											}
											anIntArray292[anInt5395++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray292[--anInt5395];
											if (Static311.anInt7186 == 2 && local13 < Static68.anInt1696) {
												anIntArray292[anInt5395++] = Static153.anIntArray145[local13];
												return;
											}
											anIntArray292[anInt5395++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4026 = aStringArray21[--anInt5396];
											local19 = anIntArray292[--anInt5395];
											Static165.method2918(local4026, local19);
											return;
										}
										if (arg0 == 3605) {
											local4026 = aStringArray21[--anInt5396];
											Static263.method4327(local4026);
											return;
										}
										if (arg0 == 3606) {
											local4026 = aStringArray21[--anInt5396];
											Static378.method6099(local4026);
											return;
										}
										if (arg0 == 3607) {
											local4026 = aStringArray21[--anInt5396];
											Static231.method3851(local4026, false);
											return;
										}
										if (arg0 == 3608) {
											local4026 = aStringArray21[--anInt5396];
											Static399.method6439(local4026);
											return;
										}
										if (arg0 == 3609) {
											local4026 = aStringArray21[--anInt5396];
											if (local4026.startsWith("<img=0>") || local4026.startsWith("<img=1>")) {
												local4026 = local4026.substring(7);
											}
											anIntArray292[anInt5395++] = Static252.method4092(local4026) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray292[--anInt5395];
											if (Static311.anInt7186 == 2 && local13 < Static68.anInt1696) {
												aStringArray21[anInt5396++] = Static159.aStringArray14[local13];
												return;
											}
											aStringArray21[anInt5396++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static212.aString50 != null) {
												aStringArray21[anInt5396++] = Static251.method4086(Static212.aString50);
												return;
											}
											aStringArray21[anInt5396++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static212.aString50 != null) {
												anIntArray292[anInt5395++] = Static70.anInt6477;
												return;
											}
											anIntArray292[anInt5395++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray292[--anInt5395];
											if (Static212.aString50 != null && local13 < Static70.anInt6477) {
												aStringArray21[anInt5396++] = Static469.aClass69Array1[local13].aString14;
												return;
											}
											aStringArray21[anInt5396++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray292[--anInt5395];
											if (Static212.aString50 != null && local13 < Static70.anInt6477) {
												anIntArray292[anInt5395++] = Static469.aClass69Array1[local13].anInt2207;
												return;
											}
											anIntArray292[anInt5395++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray292[--anInt5395];
											if (Static212.aString50 != null && local13 < Static70.anInt6477) {
												anIntArray292[anInt5395++] = Static469.aClass69Array1[local13].aByte22;
												return;
											}
											anIntArray292[anInt5395++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray292[anInt5395++] = Static434.aByte106;
											return;
										}
										if (arg0 == 3617) {
											local4026 = aStringArray21[--anInt5396];
											Static507.method7829(local4026);
											return;
										}
										if (arg0 == 3618) {
											anIntArray292[anInt5395++] = Static22.aByte7;
											return;
										}
										if (arg0 == 3619) {
											local4026 = aStringArray21[--anInt5396];
											Static482.method7195(local4026);
											return;
										}
										if (arg0 == 3620) {
											Static146.method2666();
											return;
										}
										if (arg0 == 3621) {
											if (Static311.anInt7186 == 0) {
												anIntArray292[anInt5395++] = -1;
												return;
											}
											anIntArray292[anInt5395++] = Static222.anInt4237;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray292[--anInt5395];
											if (Static311.anInt7186 != 0 && local13 < Static222.anInt4237) {
												aStringArray21[anInt5396++] = Static553.aStringArray35[local13];
												if (Static383.aStringArray26[local13] != null) {
													aStringArray21[anInt5396++] = Static383.aStringArray26[local13];
													return;
												}
												aStringArray21[anInt5396++] = "";
												return;
											}
											aStringArray21[anInt5396++] = "";
											aStringArray21[anInt5396++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4026 = aStringArray21[--anInt5396];
											if (local4026.startsWith("<img=0>") || local4026.startsWith("<img=1>")) {
												local4026 = local4026.substring(7);
											}
											anIntArray292[anInt5395++] = Static201.method3498(local4026) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray292[--anInt5395];
											if (Static469.aClass69Array1 != null && local13 < Static70.anInt6477 && Static469.aClass69Array1[local13].aString12.equalsIgnoreCase(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aString63)) {
												anIntArray292[anInt5395++] = 1;
												return;
											}
											anIntArray292[anInt5395++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static68.aString7 != null) {
												aStringArray21[anInt5396++] = Static68.aString7;
												return;
											}
											aStringArray21[anInt5396++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray292[--anInt5395];
											if (Static212.aString50 != null && local13 < Static70.anInt6477) {
												aStringArray21[anInt5396++] = Static469.aClass69Array1[local13].aString15;
												return;
											}
											aStringArray21[anInt5396++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray292[--anInt5395];
											if (Static311.anInt7186 == 2 && local13 >= 0 && local13 < Static68.anInt1696) {
												anIntArray292[anInt5395++] = Static301.aBooleanArray15[local13] ? 1 : 0;
												return;
											}
											anIntArray292[anInt5395++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4026 = aStringArray21[--anInt5396];
											if (local4026.startsWith("<img=0>") || local4026.startsWith("<img=1>")) {
												local4026 = local4026.substring(7);
											}
											anIntArray292[anInt5395++] = Static73.method1754(local4026);
											return;
										}
										if (arg0 == 3629) {
											anIntArray292[anInt5395++] = Static572.anInt9441;
											return;
										}
										if (arg0 == 3630) {
											local4026 = aStringArray21[--anInt5396];
											Static231.method3851(local4026, true);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static258.aBooleanArray14[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray292[--anInt5395];
											if (Static212.aString50 != null && local13 < Static70.anInt6477) {
												aStringArray21[anInt5396++] = Static469.aClass69Array1[local13].aString12;
												return;
											}
											aStringArray21[anInt5396++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray292[--anInt5395];
											if (Static311.anInt7186 != 0 && local13 < Static222.anInt4237) {
												aStringArray21[anInt5396++] = Static236.aStringArray17[local13];
												return;
											}
											aStringArray21[anInt5396++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static220.aClass212Array1[local13].method5473();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static220.aClass212Array1[local13].anInt6303;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static220.aClass212Array1[local13].anInt6306;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static220.aClass212Array1[local13].anInt6305;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static220.aClass212Array1[local13].anInt6311;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static220.aClass212Array1[local13].anInt6304;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray292[--anInt5395];
											local19 = Static220.aClass212Array1[local13].method5472();
											anIntArray292[anInt5395++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray292[--anInt5395];
											local19 = Static220.aClass212Array1[local13].method5472();
											anIntArray292[anInt5395++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray292[--anInt5395];
											local19 = Static220.aClass212Array1[local13].method5472();
											anIntArray292[anInt5395++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray292[--anInt5395];
											local19 = Static220.aClass212Array1[local13].method5472();
											anIntArray292[anInt5395++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt5395 -= 5;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											local25 = anIntArray292[anInt5395 + 2];
											local353 = anIntArray292[anInt5395 + 3];
											local2357 = anIntArray292[anInt5395 + 4];
											anIntArray292[anInt5395++] = local13 + (local19 - local13) * (local2357 - local25) / (local353 - local25);
											return;
										}
										@Pc(7422) long local7422;
										@Pc(7415) long local7415;
										if (arg0 == 4007) {
											anInt5395 -= 2;
											local7415 = anIntArray292[anInt5395];
											local7422 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = (int) (local7415 + local7415 * local7422 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											if (local13 == 0) {
												anIntArray292[anInt5395++] = 0;
												return;
											}
											anIntArray292[anInt5395++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											if (local13 == 0) {
												anIntArray292[anInt5395++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray292[anInt5395++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray292[anInt5395++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt5395 -= 3;
											local7415 = anIntArray292[anInt5395];
											local7422 = anIntArray292[anInt5395 + 1];
											@Pc(7803) long local7803 = (long) anIntArray292[anInt5395 + 2];
											anIntArray292[anInt5395++] = (int) (local7415 * local7803 / local7422);
											return;
										}
										if (arg0 == 4019) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											if (local13 > 700 || local19 > 700) {
												anIntArray292[anInt5395++] = 256;
											}
											@Pc(7862) double local7862 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
											anIntArray292[anInt5395++] = (int) (Math.pow(2.0D, local7862) + 0.5D);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local4026 = aStringArray21[--anInt5396];
											local19 = anIntArray292[--anInt5395];
											aStringArray21[anInt5396++] = local4026 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt5396 -= 2;
											local4026 = aStringArray21[anInt5396];
											local1145 = aStringArray21[anInt5396 + 1];
											aStringArray21[anInt5396++] = local4026 + local1145;
											return;
										}
										if (arg0 == 4102) {
											local4026 = aStringArray21[--anInt5396];
											local19 = anIntArray292[--anInt5395];
											aStringArray21[anInt5396++] = local4026 + Static60.method1630(local19);
											return;
										}
										if (arg0 == 4103) {
											local4026 = aStringArray21[--anInt5396];
											aStringArray21[anInt5396++] = local4026.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray21[anInt5396++] = method4833(anIntArray292[--anInt5395]);
											return;
										}
										if (arg0 == 4105) {
											anInt5396 -= 2;
											local4026 = aStringArray21[anInt5396];
											local1145 = aStringArray21[anInt5396 + 1];
											if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass178_1 != null && Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass178_1.aBoolean328) {
												aStringArray21[anInt5396++] = local1145;
												return;
											}
											aStringArray21[anInt5396++] = local4026;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray292[--anInt5395];
											aStringArray21[anInt5396++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt5396 -= 2;
											anIntArray292[anInt5395++] = Static24.method993(aStringArray21[anInt5396 + 1], Static325.anInt6083, aStringArray21[anInt5396]);
											return;
										}
										@Pc(8145) Class282 local8145;
										if (arg0 == 4108) {
											local4026 = aStringArray21[--anInt5396];
											anInt5395 -= 2;
											local19 = anIntArray292[anInt5395];
											local25 = anIntArray292[anInt5395 + 1];
											local8145 = Static218.method3657(Static429.aClass196_84, local25);
											anIntArray292[anInt5395++] = local8145.method7131(local19, local4026, Static135.aClass24Array7);
											return;
										}
										if (arg0 == 4109) {
											local4026 = aStringArray21[--anInt5396];
											anInt5395 -= 2;
											local19 = anIntArray292[anInt5395];
											local25 = anIntArray292[anInt5395 + 1];
											local8145 = Static218.method3657(Static429.aClass196_84, local25);
											anIntArray292[anInt5395++] = local8145.method7139(local19, local4026, Static135.aClass24Array7);
											return;
										}
										if (arg0 == 4110) {
											anInt5396 -= 2;
											local4026 = aStringArray21[anInt5396];
											local1145 = aStringArray21[anInt5396 + 1];
											if (anIntArray292[--anInt5395] == 1) {
												aStringArray21[anInt5396++] = local4026;
												return;
											}
											aStringArray21[anInt5396++] = local1145;
											return;
										}
										if (arg0 == 4111) {
											local4026 = aStringArray21[--anInt5396];
											aStringArray21[anInt5396++] = Static305.method4859(local4026);
											return;
										}
										if (arg0 == 4112) {
											local4026 = aStringArray21[--anInt5396];
											local19 = anIntArray292[--anInt5395];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray21[anInt5396++] = local4026 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = method4835((char) local13);
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static578.method8187((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static279.method4520((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static323.method5279((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local4026 = aStringArray21[--anInt5396];
											if (local4026 != null) {
												anIntArray292[anInt5395++] = local4026.length();
												return;
											}
											anIntArray292[anInt5395++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local4026 = aStringArray21[--anInt5396];
											anInt5395 -= 2;
											local19 = anIntArray292[anInt5395];
											local25 = anIntArray292[anInt5395 + 1];
											aStringArray21[anInt5396++] = local4026.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local4026 = aStringArray21[--anInt5396];
											@Pc(8503) StringBuffer local8503 = new StringBuffer(local4026.length());
											@Pc(8505) boolean local8505 = false;
											for (local353 = 0; local353 < local4026.length(); local353++) {
												@Pc(8512) char local8512 = local4026.charAt(local353);
												if (local8512 == '<') {
													local8505 = true;
												} else if (local8512 == '>') {
													local8505 = false;
												} else if (!local8505) {
													local8503.append(local8512);
												}
											}
											aStringArray21[anInt5396++] = local8503.toString();
											return;
										}
										if (arg0 == 4120) {
											local4026 = aStringArray21[--anInt5396];
											anInt5395 -= 2;
											local19 = anIntArray292[anInt5395];
											local25 = anIntArray292[anInt5395 + 1];
											anIntArray292[anInt5395++] = local4026.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt5396 -= 2;
											local4026 = aStringArray21[anInt5396];
											local1145 = aStringArray21[anInt5396 + 1];
											local25 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = local4026.indexOf(local1145, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray292[--anInt5395] != 0;
											local19 = anIntArray292[--anInt5395];
											aStringArray21[anInt5396++] = Static423.method6621(0, Static325.anInt6083, (long) local19, local412);
											return;
										}
										if (arg0 == 4125) {
											local4026 = aStringArray21[--anInt5396];
											local19 = anIntArray292[--anInt5395];
											@Pc(8726) Class282 local8726 = Static218.method3657(Static429.aClass196_84, local19);
											anIntArray292[anInt5395++] = local8726.method7138(Static135.aClass24Array7, local4026);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray292[--anInt5395];
											aStringArray21[anInt5396++] = Static320.aClass53_2.method1770(local13).aString6;
											return;
										}
										@Pc(8788) Class38 local8788;
										if (arg0 == 4201) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											local8788 = Static320.aClass53_2.method1770(local13);
											if (local19 >= 1 && local19 <= 5 && local8788.aStringArray2[local19 - 1] != null) {
												aStringArray21[anInt5396++] = local8788.aStringArray2[local19 - 1];
												return;
											}
											aStringArray21[anInt5396++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											local8788 = Static320.aClass53_2.method1770(local13);
											if (local19 >= 1 && local19 <= 5 && local8788.aStringArray3[local19 - 1] != null) {
												aStringArray21[anInt5396++] = local8788.aStringArray3[local19 - 1];
												return;
											}
											aStringArray21[anInt5396++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static320.aClass53_2.method1770(local13).anInt1463;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static320.aClass53_2.method1770(local13).anInt1434 == 1 ? 1 : 0;
											return;
										}
										@Pc(8951) Class38 local8951;
										if (arg0 == 4205) {
											local13 = anIntArray292[--anInt5395];
											local8951 = Static320.aClass53_2.method1770(local13);
											if (local8951.anInt1487 == -1 && local8951.anInt1452 >= 0) {
												anIntArray292[anInt5395++] = local8951.anInt1452;
												return;
											}
											anIntArray292[anInt5395++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray292[--anInt5395];
											local8951 = Static320.aClass53_2.method1770(local13);
											if (local8951.anInt1487 >= 0 && local8951.anInt1452 >= 0) {
												anIntArray292[anInt5395++] = local8951.anInt1452;
												return;
											}
											anIntArray292[anInt5395++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static320.aClass53_2.method1770(local13).aBoolean96 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											local3091 = Static449.aClass55_2.method1843(local19);
											if (local3091.method7433()) {
												aStringArray21[anInt5396++] = Static320.aClass53_2.method1770(local13).method1491(local3091.aString98, local19);
												return;
											}
											anIntArray292[anInt5395++] = Static320.aClass53_2.method1770(local13).method1485(local3091.anInt8686, local19);
											return;
										}
										if (arg0 == 4209) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1] - 1;
											local8788 = Static320.aClass53_2.method1770(local13);
											if (local8788.anInt1459 == local19) {
												anIntArray292[anInt5395++] = local8788.anInt1490;
												return;
											}
											if (local8788.anInt1493 == local19) {
												anIntArray292[anInt5395++] = local8788.anInt1460;
												return;
											}
											anIntArray292[anInt5395++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local4026 = aStringArray21[--anInt5396];
											local19 = anIntArray292[--anInt5395];
											Static283.method5416(local4026, local19 == 1);
											anIntArray292[anInt5395++] = Static285.anInt5065;
											return;
										}
										if (arg0 == 4211) {
											if (Static629.aShortArray146 != null && Static470.anInt8251 < Static285.anInt5065) {
												anIntArray292[anInt5395++] = Static629.aShortArray146[Static470.anInt8251++] & 0xFFFF;
												return;
											}
											anIntArray292[anInt5395++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static470.anInt8251 = 0;
											return;
										}
										if (arg0 == 4213) {
											local13 = anIntArray292[--anInt5395];
											anIntArray292[anInt5395++] = Static320.aClass53_2.method1770(local13).anInt1438;
											return;
										}
										if (arg0 == 4214) {
											local4026 = aStringArray21[--anInt5396];
											anInt5395 -= 3;
											local19 = anIntArray292[anInt5395];
											local25 = anIntArray292[anInt5395 + 1];
											local353 = anIntArray292[anInt5395 + 2];
											Static171.method3002(local4026, local19 == 1, local25, local353);
											anIntArray292[anInt5395++] = Static285.anInt5065;
											return;
										}
										if (arg0 == 4215) {
											anInt5396 -= 2;
											anInt5395 -= 2;
											local4026 = aStringArray21[anInt5396];
											local19 = anIntArray292[anInt5395];
											local25 = anIntArray292[anInt5395 + 1];
											@Pc(9350) String local9350 = aStringArray21[anInt5396 + 1];
											Static477.method7148(local19 == 1, local4026, local25, local9350);
											anIntArray292[anInt5395++] = Static285.anInt5065;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											local3091 = Static449.aClass55_2.method1843(local19);
											if (local3091.method7433()) {
												aStringArray21[anInt5396++] = Static547.aClass177_2.method4471(local13).method2819(local3091.aString98, local19);
												return;
											}
											anIntArray292[anInt5395++] = Static547.aClass177_2.method4471(local13).method2810(local3091.anInt8686, local19);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											local3091 = Static449.aClass55_2.method1843(local19);
											if (local3091.method7433()) {
												aStringArray21[anInt5396++] = Static105.aClass302_1.method7466(local13).method7401(local19, local3091.aString98);
												return;
											}
											anIntArray292[anInt5395++] = Static105.aClass302_1.method7466(local13).method7414(local3091.anInt8686, local19);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt5395 -= 2;
											local13 = anIntArray292[anInt5395];
											local19 = anIntArray292[anInt5395 + 1];
											local3091 = Static449.aClass55_2.method1843(local19);
											if (local3091.method7433()) {
												aStringArray21[anInt5396++] = Static451.aClass247_1.method6443(local13).method4553(local3091.aString98, local19);
												return;
											}
											anIntArray292[anInt5395++] = Static451.aClass247_1.method6443(local13).method4550(local3091.anInt8686, local19);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray292[--anInt5395];
										@Pc(9578) Class143 local9578 = Static78.aClass261_1.method6770(local13);
										if (local9578.anIntArray217 != null && local9578.anIntArray217.length > 0) {
											local25 = 0;
											local353 = local9578.anIntArray216[0];
											for (local2357 = 1; local2357 < local9578.anIntArray217.length; local2357++) {
												if (local9578.anIntArray216[local2357] > local353) {
													local25 = local2357;
													local353 = local9578.anIntArray216[local2357];
												}
											}
											anIntArray292[anInt5395++] = local9578.anIntArray217[local25];
											return;
										}
										anIntArray292[anInt5395++] = local9578.anInt4178;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static433.method6771(anIntArray292[--anInt5395]);
						} else {
							local137 = arg1 ? aClass279_10 : aClass279_9;
						}
						if (arg0 == 1300) {
							local19 = anIntArray292[--anInt5395] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method7070(local19, aStringArray21[--anInt5396]);
								return;
							}
							anInt5396--;
							return;
						}
						if (arg0 == 1301) {
							anInt5395 -= 2;
							local19 = anIntArray292[anInt5395];
							local25 = anIntArray292[anInt5395 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass279_16 = null;
								return;
							}
							local137.aClass279_16 = Static406.method6473(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray292[--anInt5395];
							if (local19 != Static444.anInt8952 && local19 != Static82.anInt2075 && local19 != Static320.anInt6023) {
								return;
							}
							local137.anInt8187 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt8195 = anIntArray292[--anInt5395];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt8182 = anIntArray292[--anInt5395];
							return;
						}
						if (arg0 == 1305) {
							local137.aString91 = aStringArray21[--anInt5396];
							return;
						}
						if (arg0 == 1306) {
							local137.aString94 = aStringArray21[--anInt5396];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray30 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt8165 = anIntArray292[--anInt5395];
							local137.anInt8138 = anIntArray292[--anInt5395];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray292[--anInt5395];
							local25 = anIntArray292[--anInt5395];
							if (local25 >= 1 && local25 <= 10) {
								local137.method7061(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString90 = aStringArray21[--anInt5396];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt8190 = anIntArray292[--anInt5395];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt5395 -= 3;
								local19 = anIntArray292[anInt5395] - 1;
								local25 = anIntArray292[anInt5395 + 1];
								local353 = anIntArray292[anInt5395 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt5395 -= 2;
								local19 = 10;
								local25 = anIntArray292[anInt5395];
								local353 = anIntArray292[anInt5395 + 1];
							}
							if (local137.aByteArray92 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray92 = new byte[11];
								local137.aByteArray91 = new byte[11];
								local137.anIntArray511 = new int[11];
							}
							local137.aByteArray92[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean575 = false;
								for (local2357 = 0; local2357 < local137.aByteArray92.length; local2357++) {
									if (local137.aByteArray92[local2357] != 0) {
										local137.aBoolean575 = true;
										break;
									}
								}
							} else {
								local137.aBoolean575 = true;
							}
							local137.aByteArray91[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt8184 = anIntArray292[--anInt5395];
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)V")
	private static void method4841(@OriginalArg(0) int arg0) {
		@Pc(3) Class279 local3 = Static433.method6771(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class279[] local13 = Static158.aClass279ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class279[] local19 = Static92.aClass279ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static158.aClass279ArrayArray2[local9] = new Class279[local22];
			Static653.method6855(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static653.method6855(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!sm;II)V")
	public static void method4842(@OriginalArg(0) Class311 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub4_Sub14 local5 = Static602.method8406(arg0, arg2, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray294 = new int[local5.anInt4899];
		aStringArray20 = new String[local5.anInt4901];
		if (local5.aClass311_6 == Static555.aClass311_13 || local5.aClass311_6 == Static638.aClass311_15 || local5.aClass311_6 == Static401.aClass311_9) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static87.aClass279_3 != null) {
				local30 = Static87.aClass279_3.anInt8200;
				local32 = Static87.aClass279_3.anInt8139;
			}
			anIntArray294[0] = Static483.aClass191_1.method6989() - local30;
			anIntArray294[1] = Static483.aClass191_1.method6982() - local32;
		}
		method4844(local5, 200000);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!fda;)V")
	public static void method4843(@OriginalArg(0) Class3_Sub21 arg0) {
		method4836(arg0, 200000);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!jj;I)V")
	private static void method4844(@OriginalArg(0) Class3_Sub4_Sub14 arg0, @OriginalArg(1) int arg1) {
		anInt5395 = 0;
		anInt5396 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray260;
		@Pc(11) int[] local11 = arg0.anIntArray259;
		@Pc(13) byte local13 = -1;
		anInt5399 = 0;
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
						method4839(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method4834(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray292[anInt5395++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray292[anInt5395++] = Static373.aClass150_1.anIntArray227[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static373.aClass150_1.method3822(anIntArray292[--anInt5395], local54);
					} else if (local31 == 3) {
						aStringArray21[anInt5396++] = arg0.aStringArray18[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt5395 -= 2;
						if (anIntArray292[anInt5395] != anIntArray292[anInt5395 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt5395 -= 2;
						if (anIntArray292[anInt5395] == anIntArray292[anInt5395 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt5395 -= 2;
						if (anIntArray292[anInt5395] < anIntArray292[anInt5395 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt5395 -= 2;
						if (anIntArray292[anInt5395] > anIntArray292[anInt5395 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt5399 == 0) {
							return;
						}
						@Pc(216) Class218 local216 = aClass218Array1[--anInt5399];
						arg0 = local216.aClass3_Sub4_Sub14_1;
						local8 = arg0.anIntArray260;
						local11 = arg0.anIntArray259;
						local5 = local216.anInt6737;
						anIntArray294 = local216.anIntArray399;
						aStringArray20 = local216.aStringArray24;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray292[anInt5395++] = Static373.aClass150_1.method3821(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static373.aClass150_1.method3824(anIntArray292[--anInt5395], local54);
					} else if (local31 == 31) {
						anInt5395 -= 2;
						if (anIntArray292[anInt5395] <= anIntArray292[anInt5395 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt5395 -= 2;
						if (anIntArray292[anInt5395] >= anIntArray292[anInt5395 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray292[anInt5395++] = anIntArray294[local11[local5]];
					} else if (local31 == 34) {
						anIntArray294[local11[local5]] = anIntArray292[--anInt5395];
					} else if (local31 == 35) {
						aStringArray21[anInt5396++] = aStringArray20[local11[local5]];
					} else if (local31 == 36) {
						aStringArray20[local11[local5]] = aStringArray21[--anInt5396];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt5396 -= local54;
						@Pc(400) String local400 = Static14.method836(aStringArray21, anInt5396, local54);
						aStringArray21[anInt5396++] = local400;
					} else if (local31 == 38) {
						anInt5395--;
					} else if (local31 == 39) {
						anInt5396--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class3_Sub4_Sub14 local436 = Static415.method7924(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt4899];
							@Pc(450) String[] local450 = new String[local436.anInt4901];
							for (local452 = 0; local452 < local436.anInt4900; local452++) {
								local446[local452] = anIntArray292[anInt5395 + local452 - local436.anInt4900];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt4898; local471++) {
								local450[local471] = aStringArray21[anInt5396 + local471 - local436.anInt4898];
							}
							anInt5395 -= local436.anInt4900;
							anInt5396 -= local436.anInt4898;
							@Pc(502) Class218 local502 = new Class218();
							local502.aClass3_Sub4_Sub14_1 = arg0;
							local502.anInt6737 = local5;
							local502.anIntArray399 = anIntArray294;
							local502.aStringArray24 = aStringArray20;
							if (anInt5399 >= aClass218Array1.length) {
								throw new RuntimeException();
							}
							aClass218Array1[anInt5399++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray260;
							local11 = local436.anIntArray259;
							local5 = -1;
							anIntArray294 = local446;
							aStringArray20 = local450;
						} else if (local31 == 42) {
							anIntArray292[anInt5395++] = Static396.anIntArray394[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static396.anIntArray394[local54] = anIntArray292[--anInt5395];
							Static386.method6224(local54);
							Static440.aBoolean552 |= Static515.aBooleanArray24[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray292[--anInt5395];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray293[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray37[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray292[--anInt5395];
							if (local603 < 0 || local603 >= anIntArray293[local54]) {
								throw new RuntimeException();
							}
							anIntArray292[anInt5395++] = anIntArrayArray37[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt5395 -= 2;
							local603 = anIntArray292[anInt5395];
							if (local603 < 0 || local603 >= anIntArray293[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray37[local54][local603] = anIntArray292[anInt5395 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static165.aStringArray16[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray21[anInt5396++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static165.aStringArray16[local54] = aStringArray21[--anInt5396];
							Static363.method1643(local54);
						} else if (local31 == 51) {
							@Pc(774) Class280 local774 = arg0.aClass280Array1[local11[local5]];
							@Pc(787) Class3_Sub19 local787 = (Class3_Sub19) local774.method7107((long) anIntArray292[--anInt5395]);
							if (local787 != null) {
								local5 += local787.anInt2696;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString57 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong276).append(" ");
				for (local603 = anInt5399 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass218Array1[local603].aClass3_Sub4_Sub14_1.aLong276).append(" ");
				}
				local856.append("op: ").append(local13);
				Static335.method5467(local856.toString(), local837);
			} else {
				Static612.method8491("Clientscript error in: " + arg0.aString57);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString57).append("\n");
				for (local603 = anInt5399 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass218Array1[local603].aClass3_Sub4_Sub14_1.aString57).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static335.method5467(local856.toString(), local837);
				Static410.method6501(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "()V")
	public static void method4845() {
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "(I)V")
	private static void method4846(@OriginalArg(0) int arg0) {
		@Pc(3) Class279 local3 = Static433.method6771(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class279[] local13 = Static158.aClass279ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class279[] local19 = Static92.aClass279ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static158.aClass279ArrayArray2[local9] = new Class279[local22];
			Static653.method6855(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static653.method6855(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}
}
