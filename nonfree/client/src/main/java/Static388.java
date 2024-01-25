import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "[I")
	private static int[] anIntArray372;

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "Lclient!n;")
	private static Class225 aClass225_37;

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "Lclient!dga;")
	private static Class63 aClass63_1;

	@OriginalMember(owner = "client!ot", name = "q", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray46;

	@OriginalMember(owner = "client!ot", name = "s", descriptor = "Lclient!n;")
	private static Class225 aClass225_38;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar3 = Calendar.getInstance();

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
	private static int anInt7406 = 0;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "[I")
	private static final int[] anIntArray373 = new int[5];

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
	private static int anInt7408 = 0;

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
	private static int anInt7410 = 0;

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "[[I")
	private static final int[][] anIntArrayArray41 = new int[5][5000];

	@OriginalMember(owner = "client!ot", name = "o", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray45 = new String[1000];

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "[I")
	private static final int[] anIntArray374 = new int[1000];

	@OriginalMember(owner = "client!ot", name = "t", descriptor = "[Lclient!aw;")
	private static final Class24[] aClass24Array1 = new Class24[50];

	@OriginalMember(owner = "client!ot", name = "z", descriptor = "[I")
	private static final int[] anIntArray375 = new int[3];

	@OriginalMember(owner = "client!ot", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray47 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ot", name = "B", descriptor = "Lclient!mq;")
	public static final Class223 aClass223_52 = new Class223(4);

	@OriginalMember(owner = "client!ot", name = "C", descriptor = "I")
	private static int anInt7419 = 0;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZ)V")
	private static void method6109(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class4_Sub14 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray374[anInt7408++] = Static99.anInt2281;
				return;
			}
			if (arg0 == 5001) {
				anInt7408 -= 3;
				Static99.anInt2281 = anIntArray374[anInt7408];
				Static294.aClass247_3 = Static441.method5002(anIntArray374[anInt7408 + 1]);
				if (Static294.aClass247_3 == null) {
					Static294.aClass247_3 = Static26.aClass247_1;
				}
				Static534.anInt9504 = anIntArray374[anInt7408 + 2];
				local52 = Static196.method3380(Static17.aClass159_1, Static308.aClass173_88);
				local52.aClass4_Sub11_Sub1_3.method4957(Static99.anInt2281);
				local52.aClass4_Sub11_Sub1_3.method4957(Static294.aClass247_3.anInt7261);
				local52.aClass4_Sub11_Sub1_3.method4957(Static534.anInt9504);
				Static353.method5712(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt7410 -= 2;
				local83 = aStringArray45[anInt7410];
				local89 = aStringArray45[anInt7410 + 1];
				anInt7408 -= 2;
				local97 = anIntArray374[anInt7408];
				local103 = anIntArray374[anInt7408 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class4_Sub14 local125 = Static196.method3380(Static17.aClass159_1, Static490.aClass173_111);
				local125.aClass4_Sub11_Sub1_3.method4957(Static163.method2969(local83) + Static163.method2969(local89) + 2);
				local125.aClass4_Sub11_Sub1_3.method4945(local83);
				local125.aClass4_Sub11_Sub1_3.method4957(local97 - 1);
				local125.aClass4_Sub11_Sub1_3.method4957(local103);
				local125.aClass4_Sub11_Sub1_3.method4945(local89);
				Static353.method5712(local125);
				return;
			}
			@Pc(179) Class153 local179;
			if (arg0 == 5003) {
				local175 = anIntArray374[--anInt7408];
				local179 = Static375.method6001(local175);
				local181 = "";
				if (local179 != null && local179.aString37 != null) {
					local181 = local179.aString37;
				}
				aStringArray45[anInt7410++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray374[--anInt7408];
				local179 = Static375.method6001(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt3948;
				}
				anIntArray374[anInt7408++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static294.aClass247_3 == null) {
					anIntArray374[anInt7408++] = -1;
					return;
				}
				anIntArray374[anInt7408++] = Static294.aClass247_3.anInt7261;
				return;
			}
			@Pc(269) Class4_Sub14 local269;
			if (arg0 == 5006) {
				local175 = anIntArray374[--anInt7408];
				local269 = Static196.method3380(Static17.aClass159_1, Static567.aClass173_118);
				local269.aClass4_Sub11_Sub1_3.method4957(local175);
				Static353.method5712(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray45[--anInt7410];
				method6112(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt7410 -= 2;
				local83 = aStringArray45[anInt7410];
				local89 = aStringArray45[anInt7410 + 1];
				if (Static204.anInt8827 != 0 || (!Static263.aBoolean365 || Static593.aBoolean725) && !Static417.aBoolean537) {
					@Pc(328) Class4_Sub14 local328 = Static196.method3380(Static17.aClass159_1, Static415.aClass173_101);
					local328.aClass4_Sub11_Sub1_3.method4957(0);
					local103 = local328.aClass4_Sub11_Sub1_3.anInt5831;
					local328.aClass4_Sub11_Sub1_3.method4945(local83);
					Static336.method5505(local328.aClass4_Sub11_Sub1_3, local89);
					local328.aClass4_Sub11_Sub1_3.method4941(local328.aClass4_Sub11_Sub1_3.anInt5831 - local103);
					Static353.method5712(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray374[--anInt7408];
				local179 = Static375.method6001(local175);
				local181 = "";
				if (local179 != null && local179.aString41 != null) {
					local181 = local179.aString41;
				}
				aStringArray45[anInt7410++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray374[--anInt7408];
				local179 = Static375.method6001(local175);
				local181 = "";
				if (local179 != null && local179.aString38 != null) {
					local181 = local179.aString38;
				}
				aStringArray45[anInt7410++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray374[--anInt7408];
				local179 = Static375.method6001(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt3951;
				}
				anIntArray374[anInt7408++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 == null || Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aString77 == null) {
					local83 = Static278.aString57;
				} else {
					local83 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.method6949();
				}
				aStringArray45[anInt7410++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray374[anInt7408++] = Static534.anInt9504;
				return;
			}
			if (arg0 == 5017) {
				anIntArray374[anInt7408++] = Static202.method3424();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray374[--anInt7408];
				local179 = Static375.method6001(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt3947;
				}
				anIntArray374[anInt7408++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray374[--anInt7408];
				local179 = Static375.method6001(local175);
				local181 = "";
				if (local179 != null && local179.aString39 != null) {
					local181 = local179.aString39;
				}
				aStringArray45[anInt7410++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 == null || Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aString77 == null) {
					local83 = Static278.aString57;
				} else {
					local83 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.method6939();
				}
				aStringArray45[anInt7410++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray374[--anInt7408];
				local179 = Static375.method6001(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt3946;
				}
				anIntArray374[anInt7408++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray374[--anInt7408];
				local179 = Static375.method6001(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt3943;
				}
				anIntArray374[anInt7408++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray374[--anInt7408];
				local179 = Static375.method6001(local175);
				local181 = "";
				if (local179 != null && local179.aString40 != null) {
					local181 = local179.aString40;
				}
				aStringArray45[anInt7410++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray374[--anInt7408];
				aStringArray45[anInt7410++] = Static301.aClass303_1.method7206(local175).aString69;
				return;
			}
			@Pc(736) Class4_Sub5_Sub12 local736;
			if (arg0 == 5051) {
				local175 = anIntArray374[--anInt7408];
				local736 = Static301.aClass303_1.method7206(local175);
				if (local736.anIntArray340 == null) {
					anIntArray374[anInt7408++] = 0;
					return;
				}
				anIntArray374[anInt7408++] = local736.anIntArray340.length;
				return;
			}
			if (arg0 == 5052) {
				anInt7408 -= 2;
				local175 = anIntArray374[anInt7408];
				local776 = anIntArray374[anInt7408 + 1];
				@Pc(781) Class4_Sub5_Sub12 local781 = Static301.aClass303_1.method7206(local175);
				local103 = local781.anIntArray340[local776];
				anIntArray374[anInt7408++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray374[--anInt7408];
				local736 = Static301.aClass303_1.method7206(local175);
				if (local736.anIntArray339 == null) {
					anIntArray374[anInt7408++] = 0;
					return;
				}
				anIntArray374[anInt7408++] = local736.anIntArray339.length;
				return;
			}
			if (arg0 == 5054) {
				anInt7408 -= 2;
				local175 = anIntArray374[anInt7408];
				local776 = anIntArray374[anInt7408 + 1];
				anIntArray374[anInt7408++] = Static301.aClass303_1.method7206(local175).anIntArray339[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray374[--anInt7408];
				aStringArray45[anInt7410++] = Static190.aClass295_1.method7021(local175).method3774();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray374[--anInt7408];
				@Pc(907) Class4_Sub5_Sub9 local907 = Static190.aClass295_1.method7021(local175);
				if (local907.anIntArray210 == null) {
					anIntArray374[anInt7408++] = 0;
					return;
				}
				anIntArray374[anInt7408++] = local907.anIntArray210.length;
				return;
			}
			if (arg0 == 5057) {
				anInt7408 -= 2;
				local175 = anIntArray374[anInt7408];
				local776 = anIntArray374[anInt7408 + 1];
				anIntArray374[anInt7408++] = Static190.aClass295_1.method7021(local175).anIntArray210[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass63_1 = new Class63();
				aClass63_1.anInt2196 = anIntArray374[--anInt7408];
				aClass63_1.aClass4_Sub5_Sub9_1 = Static190.aClass295_1.method7021(aClass63_1.anInt2196);
				aClass63_1.anIntArray89 = new int[aClass63_1.aClass4_Sub5_Sub9_1.method3766()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static196.method3380(Static17.aClass159_1, Static74.aClass173_23);
				local52.aClass4_Sub11_Sub1_3.method4957(0);
				local776 = local52.aClass4_Sub11_Sub1_3.anInt5831;
				local52.aClass4_Sub11_Sub1_3.method4957(0);
				local52.aClass4_Sub11_Sub1_3.method4937(aClass63_1.anInt2196);
				aClass63_1.aClass4_Sub5_Sub9_1.method3767(aClass63_1.anIntArray89, local52.aClass4_Sub11_Sub1_3);
				local52.aClass4_Sub11_Sub1_3.method4941(local52.aClass4_Sub11_Sub1_3.anInt5831 - local776);
				Static353.method5712(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray45[--anInt7410];
				local269 = Static196.method3380(Static17.aClass159_1, Static190.aClass173_55);
				local269.aClass4_Sub11_Sub1_3.method4957(0);
				local97 = local269.aClass4_Sub11_Sub1_3.anInt5831;
				local269.aClass4_Sub11_Sub1_3.method4945(local83);
				local269.aClass4_Sub11_Sub1_3.method4937(aClass63_1.anInt2196);
				aClass63_1.aClass4_Sub5_Sub9_1.method3767(aClass63_1.anIntArray89, local269.aClass4_Sub11_Sub1_3);
				local269.aClass4_Sub11_Sub1_3.method4941(local269.aClass4_Sub11_Sub1_3.anInt5831 - local97);
				Static353.method5712(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static196.method3380(Static17.aClass159_1, Static74.aClass173_23);
				local52.aClass4_Sub11_Sub1_3.method4957(0);
				local776 = local52.aClass4_Sub11_Sub1_3.anInt5831;
				local52.aClass4_Sub11_Sub1_3.method4957(1);
				local52.aClass4_Sub11_Sub1_3.method4937(aClass63_1.anInt2196);
				aClass63_1.aClass4_Sub5_Sub9_1.method3767(aClass63_1.anIntArray89, local52.aClass4_Sub11_Sub1_3);
				local52.aClass4_Sub11_Sub1_3.method4941(local52.aClass4_Sub11_Sub1_3.anInt5831 - local776);
				Static353.method5712(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt7408 -= 2;
				local175 = anIntArray374[anInt7408];
				local776 = anIntArray374[anInt7408 + 1];
				anIntArray374[anInt7408++] = Static301.aClass303_1.method7206(local175).aCharArray6[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt7408 -= 2;
				local175 = anIntArray374[anInt7408];
				local776 = anIntArray374[anInt7408 + 1];
				anIntArray374[anInt7408++] = Static301.aClass303_1.method7206(local175).aCharArray5[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt7408 -= 2;
				local175 = anIntArray374[anInt7408];
				local776 = anIntArray374[anInt7408 + 1];
				if (local776 == -1) {
					anIntArray374[anInt7408++] = -1;
					return;
				}
				anIntArray374[anInt7408++] = Static301.aClass303_1.method7206(local175).method5569((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt7408 -= 2;
				local175 = anIntArray374[anInt7408];
				local776 = anIntArray374[anInt7408 + 1];
				if (local776 == -1) {
					anIntArray374[anInt7408++] = -1;
					return;
				}
				anIntArray374[anInt7408++] = Static301.aClass303_1.method7206(local175).method5571((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray374[--anInt7408];
				anIntArray374[anInt7408++] = Static190.aClass295_1.method7021(local175).method3766();
				return;
			}
			if (arg0 == 5067) {
				anInt7408 -= 2;
				local175 = anIntArray374[anInt7408];
				local776 = anIntArray374[anInt7408 + 1];
				local97 = Static190.aClass295_1.method7021(local175).method3768(local776).anInt3326;
				anIntArray374[anInt7408++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt7408 -= 2;
				local175 = anIntArray374[anInt7408];
				local776 = anIntArray374[anInt7408 + 1];
				aClass63_1.anIntArray89[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt7408 -= 2;
				local175 = anIntArray374[anInt7408];
				local776 = anIntArray374[anInt7408 + 1];
				aClass63_1.anIntArray89[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt7408 -= 3;
				local175 = anIntArray374[anInt7408];
				local776 = anIntArray374[anInt7408 + 1];
				local97 = anIntArray374[anInt7408 + 2];
				@Pc(1448) Class4_Sub5_Sub9 local1448 = Static190.aClass295_1.method7021(local175);
				if (local1448.method3768(local776).anInt3326 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray374[anInt7408++] = local1448.method3769(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray45[--anInt7410];
				local1496 = anIntArray374[--anInt7408] == 1;
				Static573.method8197(local1496, local83);
				anIntArray374[anInt7408++] = Static291.anInt5926;
				return;
			}
			if (arg0 == 5072) {
				if (Static256.aShortArray58 != null && Static15.anInt243 < Static291.anInt5926) {
					anIntArray374[anInt7408++] = Static256.aShortArray58[Static15.anInt243++] & 0xFFFF;
					return;
				}
				anIntArray374[anInt7408++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static15.anInt243 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static584.aClass154_1.method3569(86)) {
					anIntArray374[anInt7408++] = 1;
					return;
				}
				anIntArray374[anInt7408++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static584.aClass154_1.method3569(82)) {
					anIntArray374[anInt7408++] = 1;
					return;
				}
				anIntArray374[anInt7408++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static584.aClass154_1.method3569(81)) {
					anIntArray374[anInt7408++] = 1;
					return;
				}
				anIntArray374[anInt7408++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static166.method3035(anIntArray374[--anInt7408]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray374[anInt7408++] = Static350.method5649();
					return;
				}
				if (arg0 == 5205) {
					Static356.method5759(-1, anIntArray374[--anInt7408], false, -1);
					return;
				}
				@Pc(1696) Class4_Sub5_Sub8 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray374[--anInt7408];
					local1696 = Static455.method3072(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray374[anInt7408++] = -1;
						return;
					}
					anIntArray374[anInt7408++] = local1696.anInt3856;
					return;
				}
				@Pc(1729) Class4_Sub5_Sub8 local1729;
				if (arg0 == 5207) {
					local1729 = Static455.method3074(anIntArray374[--anInt7408]);
					if (local1729 != null && local1729.aString34 != null) {
						aStringArray45[anInt7410++] = local1729.aString34;
						return;
					}
					aStringArray45[anInt7410++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray374[anInt7408++] = Static3.anInt140;
					anIntArray374[anInt7408++] = Static85.anInt1574;
					return;
				}
				if (arg0 == 5209) {
					anIntArray374[anInt7408++] = Static529.anInt9422 + Static455.anInt3448;
					anIntArray374[anInt7408++] = Static480.anInt10076 + Static455.anInt3450;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray374[--anInt7408];
					local1696 = Static455.method3074(local175);
					if (local1696 == null) {
						anIntArray374[anInt7408++] = 0;
						anIntArray374[anInt7408++] = 0;
						return;
					}
					anIntArray374[anInt7408++] = local1696.anInt3849 >> 14 & 0x3FFF;
					anIntArray374[anInt7408++] = local1696.anInt3849 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray374[--anInt7408];
					local1696 = Static455.method3074(local175);
					if (local1696 == null) {
						anIntArray374[anInt7408++] = 0;
						anIntArray374[anInt7408++] = 0;
						return;
					}
					anIntArray374[anInt7408++] = local1696.anInt3846 - local1696.anInt3847;
					anIntArray374[anInt7408++] = local1696.anInt3852 - local1696.anInt3854;
					return;
				}
				@Pc(1919) Class4_Sub17 local1919;
				if (arg0 == 5212) {
					local1919 = Static294.method3567();
					if (local1919 == null) {
						anIntArray374[anInt7408++] = -1;
						anIntArray374[anInt7408++] = -1;
						return;
					}
					anIntArray374[anInt7408++] = local1919.anInt2866;
					local776 = local1919.anInt2864 << 28 | local1919.anInt2870 + Static455.anInt3448 << 14 | local1919.anInt2869 + Static455.anInt3450;
					anIntArray374[anInt7408++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static121.method2545();
					if (local1919 == null) {
						anIntArray374[anInt7408++] = -1;
						anIntArray374[anInt7408++] = -1;
						return;
					}
					anIntArray374[anInt7408++] = local1919.anInt2866;
					local776 = local1919.anInt2864 << 28 | local1919.anInt2870 + Static455.anInt3448 << 14 | local1919.anInt2869 + Static455.anInt3450;
					anIntArray374[anInt7408++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray374[--anInt7408];
					local1696 = Static383.method6075();
					if (local1696 != null) {
						local2067 = local1696.method3437(local175 >> 14 & 0x3FFF, local175 >> 28 & 0x3, local175 & 0x3FFF, anIntArray375);
						if (local2067) {
							Static365.method5877(anIntArray375[1], anIntArray375[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt7408 -= 2;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					@Pc(2105) Class18 local2105 = Static455.method3066(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class4_Sub5_Sub8 local2112 = (Class4_Sub5_Sub8) local2105.method221(); local2112 != null; local2112 = (Class4_Sub5_Sub8) local2105.method218()) {
						if (local2112.anInt3856 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray374[anInt7408++] = 1;
						return;
					}
					anIntArray374[anInt7408++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray374[--anInt7408];
					local1696 = Static455.method3074(local175);
					if (local1696 == null) {
						anIntArray374[anInt7408++] = -1;
						return;
					}
					anIntArray374[anInt7408++] = local1696.anInt3858;
					return;
				}
				if (arg0 == 5220) {
					anIntArray374[anInt7408++] = Static312.anInt6205 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray374[--anInt7408];
					Static365.method5877(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static383.method6075();
					if (local1729 != null) {
						local1496 = local1729.method3441(Static529.anInt9422 + Static455.anInt3448, anIntArray375, Static480.anInt10076 + Static455.anInt3450);
						if (local1496) {
							anIntArray374[anInt7408++] = anIntArray375[1];
							anIntArray374[anInt7408++] = anIntArray375[2];
							return;
						}
						anIntArray374[anInt7408++] = -1;
						anIntArray374[anInt7408++] = -1;
						return;
					}
					anIntArray374[anInt7408++] = -1;
					anIntArray374[anInt7408++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt7408 -= 2;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					Static356.method5759(local776 & 0x3FFF, local175, false, local776 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray374[--anInt7408];
					local1696 = Static383.method6075();
					if (local1696 != null) {
						local2067 = local1696.method3437(local175 >> 14 & 0x3FFF, local175 >> 28 & 0x3, local175 & 0x3FFF, anIntArray375);
						if (local2067) {
							anIntArray374[anInt7408++] = anIntArray375[1];
							anIntArray374[anInt7408++] = anIntArray375[2];
							return;
						}
						anIntArray374[anInt7408++] = -1;
						anIntArray374[anInt7408++] = -1;
						return;
					}
					anIntArray374[anInt7408++] = -1;
					anIntArray374[anInt7408++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray374[--anInt7408];
					local1696 = Static383.method6075();
					if (local1696 != null) {
						local2067 = local1696.method3441(local175 >> 14 & 0x3FFF, anIntArray375, local175 & 0x3FFF);
						if (local2067) {
							anIntArray374[anInt7408++] = anIntArray375[1];
							anIntArray374[anInt7408++] = anIntArray375[2];
							return;
						}
						anIntArray374[anInt7408++] = -1;
						anIntArray374[anInt7408++] = -1;
						return;
					}
					anIntArray374[anInt7408++] = -1;
					anIntArray374[anInt7408++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static389.method6195(anIntArray374[--anInt7408]);
					return;
				}
				if (arg0 == 5227) {
					anInt7408 -= 2;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					Static356.method5759(local776 & 0x3FFF, local175, true, local776 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static267.aBoolean377 = anIntArray374[--anInt7408] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray374[anInt7408++] = Static267.aBoolean377 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray374[--anInt7408];
					Static21.method259(local175);
					return;
				}
				@Pc(2625) Class4 local2625;
				if (arg0 == 5231) {
					anInt7408 -= 2;
					local175 = anIntArray374[anInt7408];
					local1496 = anIntArray374[anInt7408 + 1] == 1;
					if (Static277.aClass350_21 != null) {
						local2625 = Static277.aClass350_21.method8207((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8379();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class4();
							Static277.aClass350_21.method8199((long) local175, local2625);
						}
					}
					return;
				}
				@Pc(2667) Class4 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray374[--anInt7408];
					if (Static277.aClass350_21 != null) {
						local2667 = Static277.aClass350_21.method8207((long) local175);
						anIntArray374[anInt7408++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray374[anInt7408++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt7408 -= 2;
					local175 = anIntArray374[anInt7408];
					local1496 = anIntArray374[anInt7408 + 1] == 1;
					if (Static464.aClass350_36 != null) {
						local2625 = Static464.aClass350_36.method8207((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8379();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class4();
							Static464.aClass350_36.method8199((long) local175, local2625);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray374[--anInt7408];
					if (Static464.aClass350_36 != null) {
						local2667 = Static464.aClass350_36.method8207((long) local175);
						anIntArray374[anInt7408++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray374[anInt7408++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray374[anInt7408++] = Static455.aClass4_Sub5_Sub8_2 == null ? -1 : Static455.aClass4_Sub5_Sub8_2.anInt3856;
					return;
				}
				if (arg0 == 5236) {
					anInt7408 -= 2;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static540.method4951(local97, local175, local103);
					if (local2833 < 0) {
						anIntArray374[anInt7408++] = -1;
						return;
					}
					anIntArray374[anInt7408++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static343.method5579();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt7408 -= 2;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					Static98.method2170(local175, 3, false, local776);
					anIntArray374[anInt7408++] = Static13.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static13.aFrame1 != null) {
						Static98.method2170(-1, Static214.aClass4_Sub19_Sub1_1.anInt3060, false, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2917) Class257[] local2917 = Static554.method8022();
					anIntArray374[anInt7408++] = local2917.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray374[--anInt7408];
					@Pc(2941) Class257[] local2941 = Static554.method8022();
					anIntArray374[anInt7408++] = local2941[local175].anInt7525;
					anIntArray374[anInt7408++] = local2941[local175].anInt7527;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static214.aClass4_Sub19_Sub1_1.anInt3050;
					local776 = Static214.aClass4_Sub19_Sub1_1.anInt3054;
					local97 = -1;
					@Pc(2978) Class257[] local2978 = Static554.method8022();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class257 local2985 = local2978[local2833];
						if (local2985.anInt7525 == local175 && local2985.anInt7527 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray374[anInt7408++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray374[anInt7408++] = Static4.method130();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray374[--anInt7408];
					if (local175 >= 1 && local175 <= 2) {
						Static98.method2170(-1, local175, false, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3060;
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray374[--anInt7408];
					if (local175 >= 1 && local175 <= 2) {
						Static214.aClass4_Sub19_Sub1_1.anInt3060 = local175;
						Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt7410 -= 2;
					local83 = aStringArray45[anInt7410];
					local89 = aStringArray45[anInt7410 + 1];
					local97 = anIntArray374[--anInt7408];
					@Pc(3124) Class4_Sub14 local3124 = Static196.method3380(Static17.aClass159_1, Static246.aClass173_74);
					local3124.aClass4_Sub11_Sub1_3.method4957(Static163.method2969(local83) + Static163.method2969(local89) + 1);
					local3124.aClass4_Sub11_Sub1_3.method4945(local83);
					local3124.aClass4_Sub11_Sub1_3.method4945(local89);
					local3124.aClass4_Sub11_Sub1_3.method4957(local97);
					Static353.method5712(local3124);
					return;
				}
				if (arg0 == 5401) {
					anInt7408 -= 2;
					Static567.aShortArray132[anIntArray374[anInt7408]] = (short) Static122.method2549(anIntArray374[anInt7408 + 1]);
					Static521.aClass273_2.method6724();
					Static521.aClass273_2.method6715();
					Static237.aClass31_1.method480();
					Static523.method7617();
					return;
				}
				if (arg0 == 5405) {
					anInt7408 -= 2;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static500.anIntArrayArrayArray20[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt7408 -= 7;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1] << 1;
					local97 = anIntArray374[anInt7408 + 2];
					local103 = anIntArray374[anInt7408 + 3];
					local2833 = anIntArray374[anInt7408 + 4];
					@Pc(3262) int local3262 = anIntArray374[anInt7408 + 5];
					@Pc(3268) int local3268 = anIntArray374[anInt7408 + 6];
					if (local175 >= 0 && local175 < 2 && Static500.anIntArrayArrayArray20[local175] != null && local776 >= 0 && local776 < Static500.anIntArrayArrayArray20[local175].length) {
						Static500.anIntArrayArrayArray20[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3268 };
						Static500.anIntArrayArrayArray20[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3262 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static500.anIntArrayArrayArray20[anIntArray374[--anInt7408]].length >> 1;
					anIntArray374[anInt7408++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static13.aFrame1 != null) {
						Static98.method2170(-1, Static214.aClass4_Sub19_Sub1_1.anInt3060, false, -1);
					}
					if (Static475.aFrame3 != null) {
						Static355.method5748();
						System.exit(0);
						return;
					}
					local83 = Static241.aString48 == null ? Static486.method7233() : Static241.aString48;
					Static516.method7519(false, local83, Static495.anInt9000 == 1, Static406.aClass354_5);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static66.aClass234_1 != null) {
						if (Static66.aClass234_1.anObject16 == null) {
							local83 = Static531.method7705(Static66.aClass234_1.anInt6719);
						} else {
							local83 = (String) Static66.aClass234_1.anObject16;
						}
					}
					aStringArray45[anInt7410++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray374[anInt7408++] = Static406.aClass354_5.aBoolean711 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static13.aFrame1 != null) {
						Static98.method2170(-1, Static214.aClass4_Sub19_Sub1_1.anInt3060, false, -1);
					}
					local83 = aStringArray45[--anInt7410];
					local1496 = anIntArray374[--anInt7408] == 1;
					local181 = Static486.method7233() + local83;
					Static516.method7519(local1496, local181, Static495.anInt9000 == 1, Static406.aClass354_5);
					return;
				}
				if (arg0 == 5422) {
					anInt7410 -= 2;
					local83 = aStringArray45[anInt7410];
					local89 = aStringArray45[anInt7410 + 1];
					local97 = anIntArray374[--anInt7408];
					if (local83.length() > 0) {
						if (Static410.aStringArray53 == null) {
							Static410.aStringArray53 = new String[Static291.anIntArray292[Static438.aClass92_4.anInt2751]];
						}
						Static410.aStringArray53[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static32.aStringArray8 == null) {
							Static32.aStringArray8 = new String[Static291.anIntArray292[Static438.aClass92_4.anInt2751]];
						}
						Static32.aStringArray8[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray45[--anInt7410]);
					return;
				}
				if (arg0 == 5424) {
					anInt7408 -= 11;
					Static248.anInt4557 = anIntArray374[anInt7408];
					Static173.anInt3514 = anIntArray374[anInt7408 + 1];
					Static442.anInt8224 = anIntArray374[anInt7408 + 2];
					Static148.anInt10017 = anIntArray374[anInt7408 + 3];
					Static438.anInt8192 = anIntArray374[anInt7408 + 4];
					Static238.anInt4326 = anIntArray374[anInt7408 + 5];
					Static111.anInt2627 = anIntArray374[anInt7408 + 6];
					Static15.anInt245 = anIntArray374[anInt7408 + 7];
					Static547.anInt9707 = anIntArray374[anInt7408 + 8];
					Static158.anInt3278 = anIntArray374[anInt7408 + 9];
					Static379.anInt7312 = anIntArray374[anInt7408 + 10];
					Static281.aClass176_74.method3996(Static438.anInt8192);
					Static281.aClass176_74.method3996(Static238.anInt4326);
					Static281.aClass176_74.method3996(Static111.anInt2627);
					Static281.aClass176_74.method3996(Static15.anInt245);
					Static281.aClass176_74.method3996(Static547.anInt9707);
					Static517.aClass78_33 = null;
					Static442.aClass78_30 = null;
					Static368.aClass78_21 = null;
					Static119.aClass78_5 = null;
					Static320.aClass78_13 = null;
					Static296.aClass78_10 = null;
					Static502.aClass78_31 = null;
					Static234.aClass78_7 = null;
					Static567.aBoolean701 = true;
					return;
				}
				if (arg0 == 5425) {
					Static256.method4099();
					Static567.aBoolean701 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt7408 -= 2;
					Static535.anInt9525 = anIntArray374[anInt7408];
					Static114.anInt9773 = anIntArray374[anInt7408 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt7408 -= 2;
					Static357.anInt6970 = anIntArray374[anInt7408 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt7408 -= 2;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					anIntArray374[anInt7408++] = Static76.method1237(local776, local175) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static12.method182(false, false, aStringArray45[--anInt7410]);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static604.method8248(Static110.anApplet1, "accountcreated");
						return;
					} catch (@Pc(3800) Throwable local3800) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static604.method8248(Static110.anApplet1, "accountcreatestarted");
						return;
					} catch (@Pc(3811) Throwable local3811) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static580.aClipboard2 != null) {
						@Pc(3823) Transferable local3823 = Static580.aClipboard2.getContents(null);
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
					aStringArray45[anInt7410++] = local83;
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt7408 -= 4;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					local97 = anIntArray374[anInt7408 + 2];
					local103 = anIntArray374[anInt7408 + 3];
					Static387.method6106((local175 & 0x3FFF) - Static254.anInt4667, local776 << 2, false, local103, (local175 >> 14 & 0x3FFF) - Static552.anInt9805, local97);
					return;
				}
				if (arg0 == 5501) {
					anInt7408 -= 4;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					local97 = anIntArray374[anInt7408 + 2];
					local103 = anIntArray374[anInt7408 + 3];
					Static561.method5050((local175 >> 14 & 0x3FFF) - Static552.anInt9805, local103, local97, local776 << 2, (local175 & 0x3FFF) - Static254.anInt4667);
					return;
				}
				if (arg0 == 5502) {
					anInt7408 -= 6;
					local175 = anIntArray374[anInt7408];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static549.anInt9733 = local175;
					local776 = anIntArray374[anInt7408 + 1];
					if (local776 + 1 >= Static500.anIntArrayArrayArray20[Static549.anInt9733].length >> 1) {
						throw new RuntimeException();
					}
					Static318.anInt6248 = local776;
					Static312.anInt6206 = 0;
					Static415.anInt7825 = anIntArray374[anInt7408 + 2];
					Static141.anInt2996 = anIntArray374[anInt7408 + 3];
					local97 = anIntArray374[anInt7408 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static51.anInt759 = local97;
					local103 = anIntArray374[anInt7408 + 5];
					if (local103 + 1 >= Static500.anIntArrayArrayArray20[Static51.anInt759].length >> 1) {
						throw new RuntimeException();
					}
					Static247.anInt4519 = local103;
					Static166.anInt3419 = 3;
					Static214.anInt3969 = -1;
					Static326.anInt6302 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static428.method6708();
					return;
				}
				if (arg0 == 5504) {
					anInt7408 -= 2;
					Static463.method5955(anIntArray374[anInt7408], anIntArray374[anInt7408 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray374[anInt7408++] = (int) Static213.aFloat141 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray374[anInt7408++] = (int) Static201.aFloat128 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static513.method7506();
					return;
				}
				if (arg0 == 5508) {
					Static434.method6779();
					return;
				}
				if (arg0 == 5509) {
					Static563.method8077();
					return;
				}
				if (arg0 == 5510) {
					Static234.method3763();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray374[--anInt7408];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static552.anInt9805;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static428.anInt8046) {
						local776 = Static428.anInt8046;
					}
					local97 -= Static254.anInt4667;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static119.anInt2717) {
						local97 = Static119.anInt2717;
					}
					Static413.anInt8208 = (local776 << 9) + 256;
					Static339.anInt6576 = (local97 << 9) + 256;
					Static166.anInt3419 = 4;
					Static214.anInt3969 = -1;
					Static326.anInt6302 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static383.method6076();
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray374[--anInt7408];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static552.anInt9805;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static428.anInt8046) {
							local776 = Static428.anInt8046;
						}
						local97 -= Static254.anInt4667;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static119.anInt2717) {
							local97 = Static119.anInt2717;
						}
						Static326.anInt6302 = (local776 << 9) + 256;
						Static214.anInt3969 = (local97 << 9) + 256;
						return;
					}
					Static326.anInt6302 = -1;
					Static214.anInt3969 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt7410 -= 2;
					local83 = aStringArray45[anInt7410];
					local89 = aStringArray45[anInt7410 + 1];
					local97 = anIntArray374[--anInt7408];
					if (Static203.anInt3855 != 3) {
						return;
					}
					if (Static587.anInt10158 == 0 && Static354.anInt6887 == 0) {
						Static278.aString57 = local83;
						Static174.aString32 = local89;
						Static135.anInt2897 = local97;
						Static285.method5604(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static518.method7588();
					return;
				}
				if (arg0 == 5602) {
					if (Static587.anInt10158 == 0) {
						Static443.anInt8248 = -2;
						Static95.anInt2223 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt7408 -= 4;
					if (Static203.anInt3855 != 3) {
						return;
					}
					if (Static587.anInt10158 == 0 && Static354.anInt6887 == 0) {
						Static285.method5605(anIntArray374[anInt7408 + 1], anIntArray374[anInt7408], anIntArray374[anInt7408 + 2], anIntArray374[anInt7408 + 3]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt7410--;
					if (Static203.anInt3855 != 3) {
						return;
					}
					if (Static587.anInt10158 == 0 && Static354.anInt6887 == 0) {
						Static524.method8125(Static518.method7584(aStringArray45[anInt7410]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt7410 -= 2;
					if (Static203.anInt3855 != 3) {
						return;
					}
					if (Static587.anInt10158 == 0 && Static354.anInt6887 == 0) {
						Static295.method8181(false, aStringArray45[anInt7410 + 1], Static518.method7584(aStringArray45[anInt7410]));
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static354.anInt6887 == 0) {
						Static164.anInt3328 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray374[anInt7408++] = Static95.anInt2223;
					return;
				}
				if (arg0 == 5608) {
					anIntArray374[anInt7408++] = Static15.anInt244;
					return;
				}
				if (arg0 == 5609) {
					anIntArray374[anInt7408++] = Static164.anInt3328;
					return;
				}
				if (arg0 == 5610) {
					for (local175 = 0; local175 < 5; local175++) {
						aStringArray45[anInt7410++] = Static406.aStringArray52 == null || Static406.aStringArray52.length <= local175 ? "" : Static360.method5813(Static406.aStringArray52[local175]);
					}
					Static406.aStringArray52 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray374[anInt7408++] = Static496.anInt9027;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray374[--anInt7408];
					if (Static203.anInt3855 != 7) {
						return;
					}
					if (Static587.anInt10158 == 0 && Static354.anInt6887 == 0) {
						if (Static299.aClass241_3 != null) {
							Static299.aClass241_3.method7087();
							Static299.aClass241_3 = null;
						}
						Static135.anInt2897 = local175;
						Static285.method5604(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray374[anInt7408++] = Static95.anInt2223;
					return;
				}
				if (arg0 == 5615) {
					anInt7410 -= 2;
					local83 = aStringArray45[anInt7410];
					local89 = aStringArray45[anInt7410 + 1];
					if (Static203.anInt3855 != 3) {
						return;
					}
					if (Static587.anInt10158 == 0 && Static354.anInt6887 == 0) {
						if (Static299.aClass241_3 != null) {
							Static299.aClass241_3.method7087();
							Static299.aClass241_3 = null;
						}
						Static278.aString57 = local83;
						Static174.aString32 = local89;
						Static285.method5604(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static135.method2684(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray374[anInt7408++] = Static443.anInt8248;
					return;
				}
				if (arg0 == 5618) {
					local175 = anIntArray374[--anInt7408];
					Static147.method2809(false, local175);
					return;
				}
				if (arg0 == 5619) {
					local175 = anIntArray374[--anInt7408];
					Static147.method2809(true, local175);
					return;
				}
				if (arg0 == 5620) {
					Static517.method7563();
					if (Static143.aString26 != "" && Static143.aString26 != "") {
						anIntArray374[anInt7408++] = 1;
						return;
					}
					anIntArray374[anInt7408++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt7410 -= 2;
					if (Static203.anInt3855 != 3) {
						return;
					}
					if (Static587.anInt10158 == 0 && Static354.anInt6887 == 0) {
						Static295.method8181(true, aStringArray45[anInt7410 + 1], Static518.method7584(aStringArray45[anInt7410]));
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4719) Class234 local4719 = Static406.aClass354_5.method8215("3", false);
					while (local4719.anInt6717 == 0) {
						Static63.method1019(1L);
					}
					if (local4719.anInt6717 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4739) Class337 local4739 = (Class337) local4719.anObject16;
					if (local4739.method7968().exists()) {
						@Pc(4749) Class4_Sub11 local4749 = new Class4_Sub11(50);
						try {
							local4739.method7965(0, local4749.aByteArray68, 50);
						} catch (@Pc(4758) IOException local4758) {
						}
					}
					try {
						local4739.method7966();
						return;
					} catch (@Pc(4764) Exception local4764) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static590.aString106 != null) {
						anIntArray374[anInt7408++] = 1;
						return;
					}
					anIntArray374[anInt7408++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray374[anInt7408++] = (int) (Static79.aLong41 >> 32);
					anIntArray374[anInt7408++] = (int) (Static79.aLong41 & 0xFFFFL);
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray374[--anInt7408];
					if (local175 < 1) {
						local175 = 1;
					}
					if (local175 > 4) {
						local175 = 4;
					}
					Static214.aClass4_Sub19_Sub1_1.anInt3073 = local175;
					Static71.method1198();
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6002) {
					Static214.aClass4_Sub19_Sub1_1.method2780(anIntArray374[--anInt7408] == 1);
					Static71.method1198();
					Static305.method5220();
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6003) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean268 = anIntArray374[--anInt7408] == 1;
					Static305.method5220();
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6005) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean264 = anIntArray374[--anInt7408] == 1;
					Static71.method1198();
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6006) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean260 = anIntArray374[--anInt7408] == 1;
					Static440.aClass44_12.method5036(!Static214.aClass4_Sub19_Sub1_1.aBoolean260);
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6007) {
					Static214.aClass4_Sub19_Sub1_1.anInt3052 = anIntArray374[--anInt7408];
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6008) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean253 = anIntArray374[--anInt7408] == 1;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6009) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean252 = anIntArray374[--anInt7408] == 1;
					Static71.method1198();
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6010) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean251 = anIntArray374[--anInt7408] == 1;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6011) {
					local175 = anIntArray374[--anInt7408];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static214.aClass4_Sub19_Sub1_1.method2772(local175, Static495.anInt9000);
					Static71.method1198();
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6012) {
					Static214.aClass4_Sub19_Sub1_1.method2777(anIntArray374[--anInt7408] == 1, Static495.anInt9000);
					Static379.method6045();
					Static214.method3551();
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6014) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean261 = anIntArray374[--anInt7408] == 1;
					Static71.method1198();
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6015) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean266 = anIntArray374[--anInt7408] == 1;
					Static71.method1198();
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6016) {
					local175 = anIntArray374[--anInt7408];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static214.aClass4_Sub19_Sub1_1.anInt3061 = local175;
					Static547.method7956(Static495.anInt9000);
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					return;
				}
				if (arg0 == 6017) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean254 = anIntArray374[--anInt7408] == 1;
					Static490.method7273();
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6018) {
					local175 = anIntArray374[--anInt7408];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static214.aClass4_Sub19_Sub1_1.anInt3064 = local175;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray374[--anInt7408];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static214.aClass4_Sub19_Sub1_1.anInt3066) {
						if (Static214.aClass4_Sub19_Sub1_1.anInt3066 == 0 && Static18.anInt281 != -1) {
							Static410.method6484(local175, Static55.aClass176_104, Static18.anInt281);
							Static115.method2466();
							Static393.aBoolean519 = false;
						} else if (local175 == 0) {
							Static254.method4094();
							Static393.aBoolean519 = false;
						} else {
							Static54.method690(local175);
						}
						Static214.aClass4_Sub19_Sub1_1.anInt3066 = local175;
					}
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6020) {
					local175 = anIntArray374[--anInt7408];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static214.aClass4_Sub19_Sub1_1.anInt3051 = local175;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6021) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean272 = anIntArray374[--anInt7408] == 1;
					Static305.method5220();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray374[--anInt7408];
					local1496 = false;
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 2) {
						local175 = 2;
					}
					if (Static577.anInt10067 < 96) {
						local175 = 0;
						local1496 = true;
					}
					Static595.method8398(local175);
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					anIntArray374[anInt7408++] = local1496 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local175 = anIntArray374[--anInt7408];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static214.aClass4_Sub19_Sub1_1.anInt3059 = local175;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					return;
				}
				if (arg0 == 6025) {
					local175 = anIntArray374[--anInt7408];
					if (local175 < 0 || local175 > Static554.method8019(Static577.anInt10067)) {
						local175 = 0;
					}
					Static214.aClass4_Sub19_Sub1_1.anInt3074 = local175;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray374[--anInt7408];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static303.method5191(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean259 = anIntArray374[--anInt7408] != 0;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					return;
				}
				if (arg0 == 6029) {
					Static214.aClass4_Sub19_Sub1_1.anInt3052 = anIntArray374[--anInt7408];
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					return;
				}
				if (arg0 == 6030) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean262 = anIntArray374[--anInt7408] != 0;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static71.method1198();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray374[--anInt7408];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static547.method7956(local175);
					return;
				}
				if (arg0 == 6032) {
					local175 = anIntArray374[--anInt7408];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static214.aClass4_Sub19_Sub1_1.anInt3063 = local175;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6033) {
					local175 = anIntArray374[--anInt7408];
					if (local175 < 0 || local175 > 4) {
						local175 = 2;
					}
					Static214.aClass4_Sub19_Sub1_1.anInt3069 = local175;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					return;
				}
				if (arg0 == 6034) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean256 = anIntArray374[--anInt7408] == 1;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static379.method6045();
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6035) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean274 = anIntArray374[--anInt7408] == 1;
					Static71.method1198();
					Static305.method5220();
					return;
				}
				if (arg0 == 6036) {
					local175 = anIntArray374[--anInt7408];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static214.aClass4_Sub19_Sub1_1.method2798(local175);
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					return;
				}
				if (arg0 == 6037) {
					local175 = anIntArray374[--anInt7408];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static214.aClass4_Sub19_Sub1_1.anInt3077 = local175;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray374[--anInt7408];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static214.aClass4_Sub19_Sub1_1.anInt3068 && Static18.anInt281 == Static532.anInt9483) {
						if (Static214.aClass4_Sub19_Sub1_1.anInt3068 == 0) {
							Static410.method6484(local175, Static55.aClass176_104, Static18.anInt281);
							Static115.method2466();
							Static393.aBoolean519 = false;
						} else if (local175 == 0) {
							Static254.method4094();
							Static393.aBoolean519 = false;
						} else {
							Static54.method690(local175);
						}
					}
					Static214.aClass4_Sub19_Sub1_1.anInt3068 = local175;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray374[--anInt7408];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static214.aClass4_Sub19_Sub1_1.anInt3075) {
						Static214.aClass4_Sub19_Sub1_1.anInt3075 = local175;
						Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
						Static265.aBoolean367 = false;
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3073;
					return;
				}
				if (arg0 == 6102) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.method2792(Static495.anInt9000) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.aBoolean268 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.aBoolean264 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.aBoolean260 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3052;
					return;
				}
				if (arg0 == 6108) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.aBoolean253 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.aBoolean252 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.aBoolean251 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.method2774(Static495.anInt9000);
					return;
				}
				if (arg0 == 6112) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.method2771(Static495.anInt9000) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.aBoolean261 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.aBoolean266 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3061;
					return;
				}
				if (arg0 == 6117) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.aBoolean254 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3064;
					return;
				}
				if (arg0 == 6119) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3066;
					return;
				}
				if (arg0 == 6120) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3051;
					return;
				}
				if (arg0 == 6121) {
					anIntArray374[anInt7408++] = Static440.aClass44_12.method5034() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray374[anInt7408++] = Static165.method3013();
					return;
				}
				if (arg0 == 6124) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3059;
					return;
				}
				if (arg0 == 6125) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3074;
					return;
				}
				if (arg0 == 6126) {
					anIntArray374[anInt7408++] = Static440.aClass44_12.method4977() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.aBoolean257 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.aBoolean259 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3052;
					return;
				}
				if (arg0 == 6130) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.aBoolean262 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray374[anInt7408++] = Static495.anInt9000;
					return;
				}
				if (arg0 == 6132) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3063;
					return;
				}
				if (arg0 == 6133) {
					anIntArray374[anInt7408++] = Static406.aClass354_5.aBoolean711 && !Static406.aClass354_5.aBoolean710 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray374[anInt7408++] = Static554.method8019(Static577.anInt10067);
					return;
				}
				if (arg0 == 6135) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3069;
					return;
				}
				if (arg0 == 6136) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.aBoolean256 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6356) boolean local6356 = true;
					try {
						local6356 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6366) Throwable local6366) {
					}
					anIntArray374[anInt7408++] = local6356 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray374[anInt7408++] = Static279.method4827(200, Static495.anInt9000);
					return;
				}
				if (arg0 == 6139) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.method2796(Static495.anInt9000);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6414) byte local6414 = 0;
					if (Static244.method3929(Static495.anInt9000) && Static577.anInt10067 < 96) {
						local6414 = 1;
					}
					anIntArray374[anInt7408++] = local6414;
					return;
				}
				if (arg0 == 6141) {
					if (Static577.anInt10067 < 96) {
						anIntArray374[anInt7408++] = 0;
						return;
					}
					anIntArray374[anInt7408++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3077;
					return;
				}
				if (arg0 == 6143) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3068;
					return;
				}
				if (arg0 == 6144) {
					anIntArray374[anInt7408++] = Static493.aBoolean629 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3075;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt7408 -= 2;
					Static308.aShort77 = (short) anIntArray374[anInt7408];
					if (Static308.aShort77 <= 0) {
						Static308.aShort77 = 256;
					}
					Static299.aShort76 = (short) anIntArray374[anInt7408 + 1];
					if (Static299.aShort76 <= 0) {
						Static299.aShort76 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt7408 -= 2;
					Static332.aShort78 = (short) anIntArray374[anInt7408];
					if (Static332.aShort78 <= 0) {
						Static332.aShort78 = 256;
					}
					Static115.aShort43 = (short) anIntArray374[anInt7408 + 1];
					if (Static115.aShort43 <= 0) {
						Static115.aShort43 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt7408 -= 4;
					Static130.aShort44 = (short) anIntArray374[anInt7408];
					if (Static130.aShort44 <= 0) {
						Static130.aShort44 = 1;
					}
					Static313.aShort59 = (short) anIntArray374[anInt7408 + 1];
					if (Static313.aShort59 <= 0) {
						Static313.aShort59 = 32767;
					} else if (Static313.aShort59 < Static130.aShort44) {
						Static313.aShort59 = Static130.aShort44;
					}
					Static231.aShort47 = (short) anIntArray374[anInt7408 + 2];
					if (Static231.aShort47 <= 0) {
						Static231.aShort47 = 1;
					}
					Static267.aShort64 = (short) anIntArray374[anInt7408 + 3];
					if (Static267.aShort64 <= 0) {
						Static267.aShort64 = 32767;
						return;
					}
					if (Static267.aShort64 < Static231.aShort47) {
						Static267.aShort64 = Static231.aShort47;
					}
					return;
				}
				if (arg0 == 6203) {
					Static506.method2844(Static320.aClass225_29.anInt6529, 0, false, Static320.aClass225_29.anInt6521, 0);
					anIntArray374[anInt7408++] = Static231.anInt4191;
					anIntArray374[anInt7408++] = Static136.anInt2911;
					return;
				}
				if (arg0 == 6204) {
					anIntArray374[anInt7408++] = Static332.aShort78;
					anIntArray374[anInt7408++] = Static115.aShort43;
					return;
				}
				if (arg0 == 6205) {
					anIntArray374[anInt7408++] = Static308.aShort77;
					anIntArray374[anInt7408++] = Static299.aShort76;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray374[anInt7408++] = (int) (Static574.method8210() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray374[anInt7408++] = (int) (Static574.method8210() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt7408 -= 3;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					local97 = anIntArray374[anInt7408 + 2];
					aCalendar3.clear();
					aCalendar3.set(11, 12);
					aCalendar3.set(local97, local776, local175);
					local103 = (int) (aCalendar3.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray374[anInt7408++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar3.clear();
					aCalendar3.setTime(new Date(Static574.method8210()));
					anIntArray374[anInt7408++] = aCalendar3.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray374[--anInt7408];
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
					anIntArray374[anInt7408++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray374[anInt7408++] = Static211.method3518() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray374[anInt7408++] = Static413.method6810() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static203.anInt3855 == 7 && Static587.anInt10158 == 0 && Static354.anInt6887 == 0) {
						if (Static21.aBoolean19) {
							anIntArray374[anInt7408++] = 0;
							return;
						}
						if (Static394.aLong192 > Static574.method8210() - 1000L) {
							anIntArray374[anInt7408++] = 1;
							return;
						}
						Static21.aBoolean19 = true;
						local52 = Static196.method3380(Static17.aClass159_1, Static68.aClass173_21);
						local52.aClass4_Sub11_Sub1_3.method4909(Static48.anInt688);
						Static353.method5712(local52);
						anIntArray374[anInt7408++] = 0;
						return;
					}
					anIntArray374[anInt7408++] = 1;
					return;
				}
				@Pc(7037) Class218 local7037;
				@Pc(7004) Class158_Sub1 local7004;
				if (arg0 == 6501) {
					local7004 = Static322.method5337();
					if (local7004 != null) {
						anIntArray374[anInt7408++] = local7004.anInt4062;
						anIntArray374[anInt7408++] = local7004.anInt4053;
						aStringArray45[anInt7410++] = local7004.aString44;
						local7037 = local7004.method3620();
						anIntArray374[anInt7408++] = local7037.anInt6284;
						aStringArray45[anInt7410++] = local7037.aString61;
						anIntArray374[anInt7408++] = local7004.anInt4058;
						anIntArray374[anInt7408++] = local7004.anInt4061;
						aStringArray45[anInt7410++] = local7004.aString45;
						return;
					}
					anIntArray374[anInt7408++] = -1;
					anIntArray374[anInt7408++] = 0;
					aStringArray45[anInt7410++] = "";
					anIntArray374[anInt7408++] = 0;
					aStringArray45[anInt7410++] = "";
					anIntArray374[anInt7408++] = 0;
					anIntArray374[anInt7408++] = 0;
					aStringArray45[anInt7410++] = "";
					return;
				}
				if (arg0 == 6502) {
					local7004 = Static519.method7600();
					if (local7004 != null) {
						anIntArray374[anInt7408++] = local7004.anInt4062;
						anIntArray374[anInt7408++] = local7004.anInt4053;
						aStringArray45[anInt7410++] = local7004.aString44;
						local7037 = local7004.method3620();
						anIntArray374[anInt7408++] = local7037.anInt6284;
						aStringArray45[anInt7410++] = local7037.aString61;
						anIntArray374[anInt7408++] = local7004.anInt4058;
						anIntArray374[anInt7408++] = local7004.anInt4061;
						aStringArray45[anInt7410++] = local7004.aString45;
						return;
					}
					anIntArray374[anInt7408++] = -1;
					anIntArray374[anInt7408++] = 0;
					aStringArray45[anInt7410++] = "";
					anIntArray374[anInt7408++] = 0;
					aStringArray45[anInt7410++] = "";
					anIntArray374[anInt7408++] = 0;
					anIntArray374[anInt7408++] = 0;
					aStringArray45[anInt7410++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray374[--anInt7408];
					local89 = aStringArray45[--anInt7410];
					if (Static203.anInt3855 == 7 && Static587.anInt10158 == 0 && Static354.anInt6887 == 0) {
						anIntArray374[anInt7408++] = Static480.method8253(local175, local89) ? 1 : 0;
						return;
					}
					anIntArray374[anInt7408++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static214.aClass4_Sub19_Sub1_1.anInt3071 = anIntArray374[--anInt7408];
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					return;
				}
				if (arg0 == 6505) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3071;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray374[--anInt7408];
					@Pc(7394) Class158_Sub1 local7394 = Static1.method62(local175);
					if (local7394 != null) {
						anIntArray374[anInt7408++] = local7394.anInt4053;
						aStringArray45[anInt7410++] = local7394.aString44;
						@Pc(7418) Class218 local7418 = local7394.method3620();
						anIntArray374[anInt7408++] = local7418.anInt6284;
						aStringArray45[anInt7410++] = local7418.aString61;
						anIntArray374[anInt7408++] = local7394.anInt4058;
						anIntArray374[anInt7408++] = local7394.anInt4061;
						aStringArray45[anInt7410++] = local7394.aString45;
						return;
					}
					anIntArray374[anInt7408++] = -1;
					aStringArray45[anInt7410++] = "";
					anIntArray374[anInt7408++] = 0;
					aStringArray45[anInt7410++] = "";
					anIntArray374[anInt7408++] = 0;
					anIntArray374[anInt7408++] = 0;
					aStringArray45[anInt7410++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt7408 -= 4;
					local175 = anIntArray374[anInt7408];
					local1496 = anIntArray374[anInt7408 + 1] == 1;
					local97 = anIntArray374[anInt7408 + 2];
					local2107 = anIntArray374[anInt7408 + 3] == 1;
					Static16.method212(local2107, local175, local1496, local97);
					return;
				}
				if (arg0 == 6508) {
					Static209.method3500();
					return;
				}
				if (arg0 == 6509) {
					if (Static203.anInt3855 != 7) {
						return;
					}
					Static552.aBoolean689 = anIntArray374[--anInt7408] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray374[anInt7408++] = Static80.anInt9684;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static214.aClass4_Sub19_Sub1_1.aBoolean255 = anIntArray374[--anInt7408] == 1;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					return;
				}
				if (arg0 == 6601) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.aBoolean255 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static83.aClass299_1 == Static458.aClass299_5) {
				if (arg0 == 6700) {
					local175 = Static189.aClass350_14.method8202();
					if (Static332.anInt6370 != -1) {
						local175++;
					}
					anIntArray374[anInt7408++] = local175;
					return;
				}
				if (arg0 == 6701) {
					local175 = anIntArray374[--anInt7408];
					if (Static332.anInt6370 != -1) {
						if (local175 == 0) {
							anIntArray374[anInt7408++] = Static332.anInt6370;
							return;
						}
						local175--;
					}
					@Pc(7705) Class4_Sub37 local7705 = (Class4_Sub37) Static189.aClass350_14.method8198();
					while (local175-- > 0) {
						local7705 = (Class4_Sub37) Static189.aClass350_14.method8205();
					}
					anIntArray374[anInt7408++] = local7705.anInt8141;
					return;
				}
				if (arg0 == 6702) {
					local175 = anIntArray374[--anInt7408];
					if (Static343.aClass225ArrayArray1[local175] == null) {
						aStringArray45[anInt7410++] = "";
						return;
					}
					local89 = Static343.aClass225ArrayArray1[local175][0].aString64;
					if (local89 == null) {
						aStringArray45[anInt7410++] = "";
						return;
					}
					aStringArray45[anInt7410++] = local89.substring(0, local89.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local175 = anIntArray374[--anInt7408];
					if (Static343.aClass225ArrayArray1[local175] == null) {
						anIntArray374[anInt7408++] = 0;
						return;
					}
					anIntArray374[anInt7408++] = Static343.aClass225ArrayArray1[local175].length;
					return;
				}
				if (arg0 == 6704) {
					anInt7408 -= 2;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					if (Static343.aClass225ArrayArray1[local175] == null) {
						aStringArray45[anInt7410++] = "";
						return;
					}
					local181 = Static343.aClass225ArrayArray1[local175][local776].aString64;
					if (local181 == null) {
						aStringArray45[anInt7410++] = "";
						return;
					}
					aStringArray45[anInt7410++] = local181;
					return;
				}
				if (arg0 == 6705) {
					anInt7408 -= 2;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					if (Static343.aClass225ArrayArray1[local175] == null) {
						anIntArray374[anInt7408++] = 0;
						return;
					}
					anIntArray374[anInt7408++] = Static343.aClass225ArrayArray1[local175][local776].anInt6549;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt7408 -= 3;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					local97 = anIntArray374[anInt7408 + 2];
					Static34.method453(local97, 1, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6708) {
					anInt7408 -= 3;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					local97 = anIntArray374[anInt7408 + 2];
					Static34.method453(local97, 2, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6709) {
					anInt7408 -= 3;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					local97 = anIntArray374[anInt7408 + 2];
					Static34.method453(local97, 3, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6710) {
					anInt7408 -= 3;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					local97 = anIntArray374[anInt7408 + 2];
					Static34.method453(local97, 4, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6711) {
					anInt7408 -= 3;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					local97 = anIntArray374[anInt7408 + 2];
					Static34.method453(local97, 5, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6712) {
					anInt7408 -= 3;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					local97 = anIntArray374[anInt7408 + 2];
					Static34.method453(local97, 6, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6713) {
					anInt7408 -= 3;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					local97 = anIntArray374[anInt7408 + 2];
					Static34.method453(local97, 7, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6714) {
					anInt7408 -= 3;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					local97 = anIntArray374[anInt7408 + 2];
					Static34.method453(local97, 8, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6715) {
					anInt7408 -= 3;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					local97 = anIntArray374[anInt7408 + 2];
					Static34.method453(local97, 9, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6716) {
					anInt7408 -= 3;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					local97 = anIntArray374[anInt7408 + 2];
					Static34.method453(local97, 10, "", local175 << 16 | local776);
					return;
				}
				if (arg0 == 6717) {
					anInt7408 -= 3;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					local97 = anIntArray374[anInt7408 + 2];
					@Pc(8293) Class225 local8293 = Static24.method318(local175 << 16 | local776, local97);
					Static419.method6558();
					@Pc(8298) Class4_Sub2 local8298 = Static69.method1180(local8293);
					Static572.method8105(local8298.method131(), local8293, local8298.anInt151);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8326) Class338 local8326;
				if (arg0 == 6800) {
					local175 = anIntArray374[--anInt7408];
					local8326 = Static182.aClass142_3.method3366(local175);
					if (local8326.aString92 == null) {
						aStringArray45[anInt7410++] = "";
						return;
					}
					aStringArray45[anInt7410++] = local8326.aString92;
					return;
				}
				if (arg0 == 6801) {
					local175 = anIntArray374[--anInt7408];
					local8326 = Static182.aClass142_3.method3366(local175);
					anIntArray374[anInt7408++] = local8326.anInt9756;
					return;
				}
				if (arg0 == 6802) {
					local175 = anIntArray374[--anInt7408];
					local8326 = Static182.aClass142_3.method3366(local175);
					anIntArray374[anInt7408++] = local8326.anInt9762;
					return;
				}
				if (arg0 == 6803) {
					local175 = anIntArray374[--anInt7408];
					local8326 = Static182.aClass142_3.method3366(local175);
					anIntArray374[anInt7408++] = local8326.anInt9770;
					return;
				}
				if (arg0 == 6804) {
					anInt7408 -= 2;
					local175 = anIntArray374[anInt7408];
					local776 = anIntArray374[anInt7408 + 1];
					@Pc(8448) Class106 local8448 = Static484.aClass313_2.method7381(local776);
					if (local8448.method2801()) {
						aStringArray45[anInt7410++] = Static182.aClass142_3.method3366(local175).method7976(local776, local8448.aString27);
						return;
					}
					anIntArray374[anInt7408++] = Static182.aClass142_3.method3366(local175).method7971(local776, local8448.anInt3103);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray374[anInt7408++] = Static263.aBoolean365 && !Static593.aBoolean725 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray374[anInt7408++] = Static280.anInt5745;
					return;
				}
				if (arg0 == 6902) {
					anIntArray374[anInt7408++] = Static22.anInt329;
					return;
				}
				if (arg0 == 6903) {
					anIntArray374[anInt7408++] = Static132.anInt2842;
					return;
				}
				if (arg0 == 6904) {
					anIntArray374[anInt7408++] = Static360.anInt6985;
					return;
				}
				if (arg0 == 6905) {
					local83 = "";
					if (Static66.aClass234_1 != null) {
						if (Static66.aClass234_1.anObject16 == null) {
							local83 = Static531.method7705(Static66.aClass234_1.anInt6719);
						} else {
							local83 = (String) Static66.aClass234_1.anObject16;
						}
					}
					aStringArray45[anInt7410++] = local83;
					return;
				}
				if (arg0 == 6906) {
					anIntArray374[anInt7408++] = Static149.anInt3135;
					return;
				}
				if (arg0 == 6907) {
					anIntArray374[anInt7408++] = Static498.anInt9035;
					return;
				}
				if (arg0 == 6908) {
					anIntArray374[anInt7408++] = Static383.anInt7369;
					return;
				}
				if (arg0 == 6909) {
					anIntArray374[anInt7408++] = Static551.aBoolean688 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray374[anInt7408++] = Static300.anInt6063;
					return;
				}
				if (arg0 == 6911) {
					anIntArray374[anInt7408++] = Static462.anInt8633;
					return;
				}
				if (arg0 == 6912) {
					anIntArray374[anInt7408++] = Static72.anInt7879;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local175 = Static214.aClass4_Sub19_Sub1_1.method2793();
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3100 = Static495.anInt9000;
					anIntArray374[anInt7408++] = local175;
					Static71.method1198();
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 7001) {
					Static214.aClass4_Sub19_Sub1_1.method2788();
					Static71.method1198();
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 7002) {
					Static214.aClass4_Sub19_Sub1_1.method2799();
					Static71.method1198();
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 7003) {
					Static214.aClass4_Sub19_Sub1_1.method2789();
					Static71.method1198();
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 7004) {
					Static214.aClass4_Sub19_Sub1_1.method2786(true);
					Static71.method1198();
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 7005) {
					Static214.aClass4_Sub19_Sub1_1.anInt3062 = 0;
					Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
					Static265.aBoolean367 = false;
					return;
				}
				if (arg0 == 7006) {
					if (Static214.aClass4_Sub19_Sub1_1.anInt3100 == 2) {
						Static214.aClass4_Sub19_Sub1_1.aBoolean270 = true;
						return;
					}
					if (Static214.aClass4_Sub19_Sub1_1.anInt3100 == 1) {
						Static214.aClass4_Sub19_Sub1_1.aBoolean269 = true;
						return;
					}
					if (Static214.aClass4_Sub19_Sub1_1.anInt3100 == 3) {
						Static214.aClass4_Sub19_Sub1_1.aBoolean273 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray374[anInt7408++] = Static214.aClass4_Sub19_Sub1_1.anInt3062;
					return;
				}
				if (arg0 == 7008) {
					if (Static495.anInt9000 == 0 && Static577.anInt10067 < 96) {
						anIntArray374[anInt7408++] = 1;
						return;
					}
					anIntArray374[anInt7408++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)Ljava/lang/String;")
	private static String method6110(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar3.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar3.get(5);
		@Pc(20) int local20 = aCalendar3.get(2);
		@Pc(24) int local24 = aCalendar3.get(1);
		return local16 + "-" + aStringArray47[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!hu;II)V")
	public static void method6111(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class4_Sub5_Sub7 local5 = Static569.method8147(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray372 = new int[local5.anInt3821];
		aStringArray46 = new String[local5.anInt3818];
		if (local5.aClass147_7 == Static192.aClass147_6 || local5.aClass147_7 == Static24.aClass147_1 || local5.aClass147_7 == Static90.aClass147_3) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static136.aClass225_14 != null) {
				local30 = Static136.aClass225_14.anInt6552;
				local32 = Static136.aClass225_14.anInt6494;
			}
			anIntArray372[0] = Static172.aClass135_1.method6370() - local30;
			anIntArray372[1] = Static172.aClass135_1.method6378() - local32;
		}
		method6116(local5, 200000);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method6112(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static204.anInt8827 == 0 && (Static263.aBoolean365 && !Static593.aBoolean725 || Static417.aBoolean537)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static590.aClass364_51.method8334(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static590.aClass364_51.method8334(0).length());
		} else if (local11.startsWith(Static590.aClass364_52.method8334(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static590.aClass364_52.method8334(0).length());
		} else if (local11.startsWith(Static590.aClass364_53.method8334(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static590.aClass364_53.method8334(0).length());
		} else if (local11.startsWith(Static590.aClass364_54.method8334(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static590.aClass364_54.method8334(0).length());
		} else if (local11.startsWith(Static590.aClass364_55.method8334(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static590.aClass364_55.method8334(0).length());
		} else if (local11.startsWith(Static590.aClass364_56.method8334(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static590.aClass364_56.method8334(0).length());
		} else if (local11.startsWith(Static590.aClass364_57.method8334(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static590.aClass364_57.method8334(0).length());
		} else if (local11.startsWith(Static590.aClass364_58.method8334(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static590.aClass364_58.method8334(0).length());
		} else if (local11.startsWith(Static590.aClass364_59.method8334(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static590.aClass364_59.method8334(0).length());
		} else if (local11.startsWith(Static590.aClass364_60.method8334(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static590.aClass364_60.method8334(0).length());
		} else if (local11.startsWith(Static590.aClass364_61.method8334(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static590.aClass364_61.method8334(0).length());
		} else if (local11.startsWith(Static590.aClass364_62.method8334(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static590.aClass364_62.method8334(0).length());
		} else if (Static154.anInt3181 != 0) {
			if (local11.startsWith(Static590.aClass364_51.method8334(Static154.anInt3181))) {
				local13 = 0;
				arg0 = arg0.substring(Static590.aClass364_51.method8334(Static154.anInt3181).length());
			} else if (local11.startsWith(Static590.aClass364_52.method8334(Static154.anInt3181))) {
				local13 = 1;
				arg0 = arg0.substring(Static590.aClass364_52.method8334(Static154.anInt3181).length());
			} else if (local11.startsWith(Static590.aClass364_53.method8334(Static154.anInt3181))) {
				local13 = 2;
				arg0 = arg0.substring(Static590.aClass364_53.method8334(Static154.anInt3181).length());
			} else if (local11.startsWith(Static590.aClass364_54.method8334(Static154.anInt3181))) {
				local13 = 3;
				arg0 = arg0.substring(Static590.aClass364_54.method8334(Static154.anInt3181).length());
			} else if (local11.startsWith(Static590.aClass364_55.method8334(Static154.anInt3181))) {
				local13 = 4;
				arg0 = arg0.substring(Static590.aClass364_55.method8334(Static154.anInt3181).length());
			} else if (local11.startsWith(Static590.aClass364_56.method8334(Static154.anInt3181))) {
				local13 = 5;
				arg0 = arg0.substring(Static590.aClass364_56.method8334(Static154.anInt3181).length());
			} else if (local11.startsWith(Static590.aClass364_57.method8334(Static154.anInt3181))) {
				local13 = 6;
				arg0 = arg0.substring(Static590.aClass364_57.method8334(Static154.anInt3181).length());
			} else if (local11.startsWith(Static590.aClass364_58.method8334(Static154.anInt3181))) {
				local13 = 7;
				arg0 = arg0.substring(Static590.aClass364_58.method8334(Static154.anInt3181).length());
			} else if (local11.startsWith(Static590.aClass364_59.method8334(Static154.anInt3181))) {
				local13 = 8;
				arg0 = arg0.substring(Static590.aClass364_59.method8334(Static154.anInt3181).length());
			} else if (local11.startsWith(Static590.aClass364_60.method8334(Static154.anInt3181))) {
				local13 = 9;
				arg0 = arg0.substring(Static590.aClass364_60.method8334(Static154.anInt3181).length());
			} else if (local11.startsWith(Static590.aClass364_61.method8334(Static154.anInt3181))) {
				local13 = 10;
				arg0 = arg0.substring(Static590.aClass364_61.method8334(Static154.anInt3181).length());
			} else if (local11.startsWith(Static590.aClass364_62.method8334(Static154.anInt3181))) {
				local13 = 11;
				arg0 = arg0.substring(Static590.aClass364_62.method8334(Static154.anInt3181).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Class364.lb.method8334(0))) {
			local451 = 1;
			arg0 = arg0.substring(Class364.lb.method8334(0).length());
		} else if (local11.startsWith(Static590.aClass364_63.method8334(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static590.aClass364_63.method8334(0).length());
		} else if (local11.startsWith(Static590.aClass364_64.method8334(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static590.aClass364_64.method8334(0).length());
		} else if (local11.startsWith(Static590.aClass364_65.method8334(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static590.aClass364_65.method8334(0).length());
		} else if (local11.startsWith(Static590.aClass364_66.method8334(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static590.aClass364_66.method8334(0).length());
		} else if (Static154.anInt3181 != 0) {
			if (local11.startsWith(Class364.lb.method8334(Static154.anInt3181))) {
				local451 = 1;
				arg0 = arg0.substring(Class364.lb.method8334(Static154.anInt3181).length());
			} else if (local11.startsWith(Static590.aClass364_63.method8334(Static154.anInt3181))) {
				local451 = 2;
				arg0 = arg0.substring(Static590.aClass364_63.method8334(Static154.anInt3181).length());
			} else if (local11.startsWith(Static590.aClass364_64.method8334(Static154.anInt3181))) {
				local451 = 3;
				arg0 = arg0.substring(Static590.aClass364_64.method8334(Static154.anInt3181).length());
			} else if (local11.startsWith(Static590.aClass364_65.method8334(Static154.anInt3181))) {
				local451 = 4;
				arg0 = arg0.substring(Static590.aClass364_65.method8334(Static154.anInt3181).length());
			} else if (local11.startsWith(Static590.aClass364_66.method8334(Static154.anInt3181))) {
				local451 = 5;
				arg0 = arg0.substring(Static590.aClass364_66.method8334(Static154.anInt3181).length());
			}
		}
		@Pc(641) Class4_Sub14 local641 = Static196.method3380(Static17.aClass159_1, Static530.aClass173_115);
		local641.aClass4_Sub11_Sub1_3.method4957(0);
		@Pc(650) int local650 = local641.aClass4_Sub11_Sub1_3.anInt5831;
		local641.aClass4_Sub11_Sub1_3.method4957(local13);
		local641.aClass4_Sub11_Sub1_3.method4957(local451);
		Static336.method5505(local641.aClass4_Sub11_Sub1_3, arg0);
		local641.aClass4_Sub11_Sub1_3.method4941(local641.aClass4_Sub11_Sub1_3.anInt5831 - local650);
		Static353.method5712(local641);
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(IZ)V")
	private static void method6113(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class225 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class225 local35;
		@Pc(13) int local13;
		@Pc(210) Class225 local210;
		@Pc(158) Class225 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt7408 -= 3;
				local13 = anIntArray374[anInt7408];
				local19 = anIntArray374[anInt7408 + 1];
				local25 = anIntArray374[anInt7408 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static490.method7272(local13);
				if (local35.aClass225Array1 == null) {
					local35.aClass225Array1 = new Class225[local25 + 1];
				}
				if (local35.aClass225Array1.length <= local25) {
					@Pc(54) Class225[] local54 = new Class225[local25 + 1];
					for (local56 = 0; local56 < local35.aClass225Array1.length; local56++) {
						local54[local56] = local35.aClass225Array1[local56];
					}
					local35.aClass225Array1 = local54;
				}
				if (local25 > 0 && local35.aClass225Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class225 local99 = new Class225();
				local99.anInt6508 = local19;
				local99.anInt6559 = local99.anInt6555 = local35.anInt6555;
				local99.anInt6565 = local25;
				local35.aClass225Array1[local25] = local99;
				if (arg1) {
					aClass225_38 = local99;
				} else {
					aClass225_37 = local99;
				}
				Static92.method2100(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass225_38 : aClass225_37;
				if (local137.anInt6565 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static490.method7272(local137.anInt6555);
				local158.aClass225Array1[local137.anInt6565] = null;
				Static92.method2100(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static490.method7272(anIntArray374[--anInt7408]);
				local137.aClass225Array1 = null;
				Static92.method2100(local137);
				return;
			}
			if (arg0 == 200) {
				anInt7408 -= 2;
				local13 = anIntArray374[anInt7408];
				local19 = anIntArray374[anInt7408 + 1];
				local210 = Static24.method318(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray374[anInt7408++] = 1;
					if (arg1) {
						aClass225_38 = local210;
						return;
					}
					aClass225_37 = local210;
					return;
				}
				anIntArray374[anInt7408++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray374[--anInt7408];
				local158 = Static490.method7272(local13);
				if (local158 != null) {
					anIntArray374[anInt7408++] = 1;
					if (arg1) {
						aClass225_38 = local158;
						return;
					}
					aClass225_37 = local158;
					return;
				}
				anIntArray374[anInt7408++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray374[--anInt7408];
				method6114(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray374[--anInt7408];
				method6117(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt7408 -= 2;
					local13 = anIntArray374[anInt7408];
					local19 = anIntArray374[anInt7408 + 1];
					for (local25 = 0; local25 < Static36.anIntArray523.length; local25++) {
						if (Static36.anIntArray523[local25] == local13) {
							Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aClass166_1.method3740(local25, Static522.aClass290_6, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static218.anIntArray193.length; local353++) {
						if (Static218.anIntArray193[local353] == local13) {
							Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aClass166_1.method3740(local353, Static522.aClass290_6, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt7408 -= 2;
					local13 = anIntArray374[anInt7408];
					local19 = anIntArray374[anInt7408 + 1];
					Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aClass166_1.method3736(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray374[--anInt7408] != 0;
					Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aClass166_1.method3734(local412);
					return;
				}
				if (arg0 == 411) {
					anInt7408 -= 2;
					local13 = anIntArray374[anInt7408];
					local19 = anIntArray374[anInt7408 + 1];
					Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aClass166_1.method3739(Static521.aClass273_2, local19, local13);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1507) String local1507;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static490.method7272(anIntArray374[--anInt7408]);
					} else {
						local137 = arg1 ? aClass225_38 : aClass225_37;
					}
					if (arg0 == 1100) {
						anInt7408 -= 2;
						local137.anInt6485 = anIntArray374[anInt7408];
						if (local137.anInt6485 > local137.anInt6506 - local137.anInt6529) {
							local137.anInt6485 = local137.anInt6506 - local137.anInt6529;
						}
						if (local137.anInt6485 < 0) {
							local137.anInt6485 = 0;
						}
						local137.anInt6563 = anIntArray374[anInt7408 + 1];
						if (local137.anInt6563 > local137.anInt6489 - local137.anInt6521) {
							local137.anInt6563 = local137.anInt6489 - local137.anInt6521;
						}
						if (local137.anInt6563 < 0) {
							local137.anInt6563 = 0;
						}
						Static92.method2100(local137);
						if (local137.anInt6565 == -1) {
							Static61.method1010(local137.anInt6555);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt6560 = anIntArray374[--anInt7408];
						Static92.method2100(local137);
						if (local137.anInt6565 == -1) {
							Static543.method7875(local137.anInt6555);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean486 = anIntArray374[--anInt7408] == 1;
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt6539 = anIntArray374[--anInt7408];
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt6495 = anIntArray374[--anInt7408];
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray374[--anInt7408];
						if (local137.anInt6520 != local19) {
							local137.anInt6520 = local19;
							Static92.method2100(local137);
						}
						if (local137.anInt6565 == -1) {
							Static368.method5922(local137.anInt6555);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.lb = anIntArray374[--anInt7408];
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean475 = anIntArray374[--anInt7408] == 1;
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt6538 = 1;
						local137.anInt6488 = anIntArray374[--anInt7408];
						Static92.method2100(local137);
						if (local137.anInt6565 == -1) {
							Static156.method2907(local137.anInt6555);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt7408 -= 6;
						local137.anInt6509 = anIntArray374[anInt7408];
						local137.anInt6518 = anIntArray374[anInt7408 + 1];
						local137.anInt6525 = anIntArray374[anInt7408 + 2];
						local137.anInt6548 = anIntArray374[anInt7408 + 3];
						local137.anInt6561 = anIntArray374[anInt7408 + 4];
						local137.anInt6543 = anIntArray374[anInt7408 + 5];
						Static92.method2100(local137);
						if (local137.anInt6565 == -1) {
							Static520.method7613(local137.anInt6555);
							Static213.method4338(local137.anInt6555);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray374[--anInt7408];
						if (local137.anInt6510 != local19) {
							local137.anInt6510 = local19;
							local137.anInt6541 = 0;
							local137.anInt6530 = 1;
							local137.anInt6512 = 0;
							@Pc(1094) Class365 local1094 = local137.anInt6510 == -1 ? null : Static61.aClass48_1.method1016(local137.anInt6510);
							if (local1094 != null) {
								Static594.method8374(local137.anInt6541, local1094);
							}
							Static92.method2100(local137);
						}
						if (local137.anInt6565 == -1) {
							Static212.method3532(local137.anInt6555);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean473 = anIntArray374[--anInt7408] == 1;
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray45[--anInt7410];
						if (!local1145.equals(local137.aString67)) {
							local137.aString67 = local1145;
							Static92.method2100(local137);
						}
						if (local137.anInt6565 == -1) {
							Static381.method6457(local137.anInt6555);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt6492 = anIntArray374[--anInt7408];
						Static92.method2100(local137);
						if (local137.anInt6565 == -1) {
							Static525.method7622(local137.anInt6555);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt7408 -= 3;
						local137.anInt6505 = anIntArray374[anInt7408];
						local137.anInt6533 = anIntArray374[anInt7408 + 1];
						local137.anInt6511 = anIntArray374[anInt7408 + 2];
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean472 = anIntArray374[--anInt7408] == 1;
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt6566 = anIntArray374[--anInt7408];
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt6479 = anIntArray374[--anInt7408];
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean479 = anIntArray374[--anInt7408] == 1;
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean478 = anIntArray374[--anInt7408] == 1;
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt7408 -= 2;
						local137.anInt6506 = anIntArray374[anInt7408];
						local137.anInt6489 = anIntArray374[anInt7408 + 1];
						Static92.method2100(local137);
						if (local137.anInt6508 == 0) {
							Static38.method489(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean476 = anIntArray374[--anInt7408] == 1;
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt6543 = anIntArray374[--anInt7408];
						Static92.method2100(local137);
						if (local137.anInt6565 == -1) {
							Static520.method7613(local137.anInt6555);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray374[--anInt7408];
						local137.aBoolean481 = local19 == 1;
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt7408 -= 2;
						local137.anInt6502 = anIntArray374[anInt7408];
						local137.anInt6551 = anIntArray374[anInt7408 + 1];
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt6557 = anIntArray374[--anInt7408];
						Static92.method2100(local137);
						return;
					}
					@Pc(1473) Class106 local1473;
					if (arg0 == 1127) {
						anInt7408 -= 2;
						local19 = anIntArray374[anInt7408];
						local25 = anIntArray374[anInt7408 + 1];
						local1473 = Static484.aClass313_2.method7381(local19);
						if (local25 != local1473.anInt3103) {
							local137.method5518(local25, local19);
							return;
						}
						local137.method5509(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray374[--anInt7408];
						local1507 = aStringArray45[--anInt7410];
						local1473 = Static484.aClass313_2.method7381(local19);
						if (!local1473.aString27.equals(local1507)) {
							local137.method5515(local19, local1507);
							return;
						}
						local137.method5509(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2309) int local2309;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static490.method7272(anIntArray374[--anInt7408]);
						} else {
							local137 = arg1 ? aClass225_38 : aClass225_37;
						}
						if (arg0 == 1300) {
							local19 = anIntArray374[--anInt7408] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method5514(local19, aStringArray45[--anInt7410]);
								return;
							} else {
								anInt7410--;
								return;
							}
						}
						if (arg0 == 1301) {
							anInt7408 -= 2;
							local19 = anIntArray374[anInt7408];
							local25 = anIntArray374[anInt7408 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass225_31 = null;
								return;
							}
							local137.aClass225_31 = Static24.method318(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray374[--anInt7408];
							if (local19 != Static364.anInt7051 && local19 != Static351.anInt9077 && local19 != Static529.anInt9426) {
								return;
							}
							local137.anInt6567 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt6546 = anIntArray374[--anInt7408];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt6522 = anIntArray374[--anInt7408];
							return;
						}
						if (arg0 == 1305) {
							local137.aString65 = aStringArray45[--anInt7410];
							return;
						}
						if (arg0 == 1306) {
							local137.aString68 = aStringArray45[--anInt7410];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray40 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt6553 = anIntArray374[--anInt7408];
							local137.anInt6507 = anIntArray374[--anInt7408];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray374[--anInt7408];
							local25 = anIntArray374[--anInt7408];
							if (local25 >= 1 && local25 <= 10) {
								local137.method5516(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString63 = aStringArray45[--anInt7410];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt6550 = anIntArray374[--anInt7408];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt7408 -= 3;
								local19 = anIntArray374[anInt7408] - 1;
								local25 = anIntArray374[anInt7408 + 1];
								local353 = anIntArray374[anInt7408 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt7408 -= 2;
								local19 = 10;
								local25 = anIntArray374[anInt7408];
								local353 = anIntArray374[anInt7408 + 1];
							}
							if (local137.aByteArray73 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray73 = new byte[11];
								local137.aByteArray74 = new byte[11];
								local137.anIntArray327 = new int[11];
							}
							local137.aByteArray73[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean470 = false;
								for (local2309 = 0; local2309 < local137.aByteArray73.length; local2309++) {
									if (local137.aByteArray73[local2309] != 0) {
										local137.aBoolean470 = true;
										break;
									}
								}
							} else {
								local137.aBoolean470 = true;
							}
							local137.aByteArray74[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt6535 = anIntArray374[--anInt7408];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static490.method7272(anIntArray374[--anInt7408]);
						} else {
							local137 = arg1 ? aClass225_38 : aClass225_37;
						}
						if (arg0 == 1499) {
							local137.method5511();
							return;
						}
						local1145 = aStringArray45[--anInt7410];
						@Pc(2395) int[] local2395 = null;
						if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
							local353 = anIntArray374[--anInt7408];
							if (local353 > 0) {
								local2395 = new int[local353];
								while (local353-- > 0) {
									local2395[local353] = anIntArray374[--anInt7408];
								}
							}
							local1145 = local1145.substring(0, local1145.length() - 1);
						}
						@Pc(2447) Object[] local2447 = new Object[local1145.length() + 1];
						for (local2309 = local2447.length - 1; local2309 >= 1; local2309--) {
							if (local1145.charAt(local2309 - 1) == 's') {
								local2447[local2309] = aStringArray45[--anInt7410];
							} else {
								local2447[local2309] = Integer.valueOf(anIntArray374[--anInt7408]);
							}
						}
						local56 = anIntArray374[--anInt7408];
						if (local56 == -1) {
							local2447 = null;
						} else {
							local2447[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray23 = local2447;
						} else if (arg0 == 1401) {
							local137.anObjectArray26 = local2447;
						} else if (arg0 == 1402) {
							local137.anObjectArray8 = local2447;
						} else if (arg0 == 1403) {
							local137.anObjectArray30 = local2447;
						} else if (arg0 == 1404) {
							local137.anObjectArray28 = local2447;
						} else if (arg0 == 1405) {
							local137.anObjectArray29 = local2447;
						} else if (arg0 == 1406) {
							local137.anObjectArray16 = local2447;
						} else if (arg0 == 1407) {
							local137.anObjectArray5 = local2447;
							local137.anIntArray324 = local2395;
						} else if (arg0 == 1408) {
							local137.anObjectArray9 = local2447;
						} else if (arg0 == 1409) {
							local137.anObjectArray7 = local2447;
						} else if (arg0 == 1410) {
							local137.anObjectArray6 = local2447;
						} else if (arg0 == 1411) {
							local137.anObjectArray20 = local2447;
						} else if (arg0 == 1412) {
							local137.anObjectArray11 = local2447;
						} else if (arg0 == 1414) {
							local137.anObjectArray3 = local2447;
							local137.anIntArray326 = local2395;
						} else if (arg0 == 1415) {
							local137.anObjectArray13 = local2447;
							local137.anIntArray329 = local2395;
						} else if (arg0 == 1416) {
							local137.anObjectArray17 = local2447;
						} else if (arg0 == 1417) {
							local137.anObjectArray24 = local2447;
						} else if (arg0 == 1418) {
							local137.anObjectArray33 = local2447;
						} else if (arg0 == 1419) {
							local137.anObjectArray14 = local2447;
						} else if (arg0 == 1420) {
							local137.anObjectArray22 = local2447;
						} else if (arg0 == 1421) {
							local137.anObjectArray18 = local2447;
						} else if (arg0 == 1422) {
							local137.anObjectArray19 = local2447;
						} else if (arg0 == 1423) {
							local137.anObjectArray27 = local2447;
						} else if (arg0 == 1424) {
							local137.anObjectArray12 = local2447;
						} else if (arg0 == 1425) {
							local137.anObjectArray32 = local2447;
						} else if (arg0 == 1426) {
							local137.anObjectArray15 = local2447;
						} else if (arg0 == 1427) {
							local137.anObjectArray4 = local2447;
						} else if (arg0 == 1428) {
							local137.anObjectArray21 = local2447;
							local137.anIntArray332 = local2395;
						} else if (arg0 == 1429) {
							local137.anObjectArray31 = local2447;
							local137.anIntArray330 = local2395;
						} else if (arg0 == 1430) {
							local137.anObjectArray25 = local2447;
						}
						local137.aBoolean480 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass225_38 : aClass225_37;
						if (arg0 == 1500) {
							anIntArray374[anInt7408++] = local137.anInt6552;
							return;
						}
						if (arg0 == 1501) {
							anIntArray374[anInt7408++] = local137.anInt6494;
							return;
						}
						if (arg0 == 1502) {
							anIntArray374[anInt7408++] = local137.anInt6529;
							return;
						}
						if (arg0 == 1503) {
							anIntArray374[anInt7408++] = local137.anInt6521;
							return;
						}
						if (arg0 == 1504) {
							anIntArray374[anInt7408++] = local137.aBoolean484 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray374[anInt7408++] = local137.anInt6559;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static541.method7832(local137);
							anIntArray374[anInt7408++] = local158 == null ? -1 : local158.anInt6555;
							return;
						}
					} else {
						@Pc(3043) Class106 local3043;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass225_38 : aClass225_37;
							if (arg0 == 1600) {
								anIntArray374[anInt7408++] = local137.anInt6485;
								return;
							}
							if (arg0 == 1601) {
								anIntArray374[anInt7408++] = local137.anInt6563;
								return;
							}
							if (arg0 == 1602) {
								aStringArray45[anInt7410++] = local137.aString67;
								return;
							}
							if (arg0 == 1603) {
								anIntArray374[anInt7408++] = local137.anInt6506;
								return;
							}
							if (arg0 == 1604) {
								anIntArray374[anInt7408++] = local137.anInt6489;
								return;
							}
							if (arg0 == 1605) {
								anIntArray374[anInt7408++] = local137.anInt6543;
								return;
							}
							if (arg0 == 1606) {
								anIntArray374[anInt7408++] = local137.anInt6525;
								return;
							}
							if (arg0 == 1607) {
								anIntArray374[anInt7408++] = local137.anInt6561;
								return;
							}
							if (arg0 == 1608) {
								anIntArray374[anInt7408++] = local137.anInt6548;
								return;
							}
							if (arg0 == 1609) {
								anIntArray374[anInt7408++] = local137.anInt6539;
								return;
							}
							if (arg0 == 1610) {
								anIntArray374[anInt7408++] = local137.anInt6509;
								return;
							}
							if (arg0 == 1611) {
								anIntArray374[anInt7408++] = local137.anInt6518;
								return;
							}
							if (arg0 == 1612) {
								anIntArray374[anInt7408++] = local137.anInt6520;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray374[--anInt7408];
								local3043 = Static484.aClass313_2.method7381(local19);
								if (local3043.method2801()) {
									aStringArray45[anInt7410++] = local137.method5525(local3043.aString27, local19);
									return;
								}
								anIntArray374[anInt7408++] = local137.method5523(local19, local3043.anInt3103);
								return;
							}
							if (arg0 == 1614) {
								anIntArray374[anInt7408++] = local137.lb;
								return;
							}
							if (arg0 == 2614) {
								anIntArray374[anInt7408++] = local137.anInt6538 == 1 ? local137.anInt6488 : -1;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass225_38 : aClass225_37;
							if (arg0 == 1700) {
								anIntArray374[anInt7408++] = local137.anInt6527;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt6527 != -1) {
									anIntArray374[anInt7408++] = local137.anInt6500;
									return;
								}
								anIntArray374[anInt7408++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray374[anInt7408++] = local137.anInt6565;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass225_38 : aClass225_37;
							if (arg0 == 1800) {
								anIntArray374[anInt7408++] = Static69.method1180(local137).method131();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray374[--anInt7408];
								local19--;
								if (local137.aStringArray40 != null && local19 < local137.aStringArray40.length && local137.aStringArray40[local19] != null) {
									aStringArray45[anInt7410++] = local137.aStringArray40[local19];
									return;
								}
								aStringArray45[anInt7410++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString65 == null) {
									aStringArray45[anInt7410++] = "";
									return;
								}
								aStringArray45[anInt7410++] = local137.aString65;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static490.method7272(anIntArray374[--anInt7408]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass225_38 : aClass225_37;
							}
							if (anInt7419 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray4 == null) {
									return;
								}
								@Pc(3312) Class4_Sub25 local3312 = new Class4_Sub25();
								local3312.aClass225_21 = local137;
								local3312.anObjectArray1 = local137.anObjectArray4;
								local3312.anInt4394 = anInt7419 + 1;
								Static525.aClass244_59.method5960(local3312);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static490.method7272(anIntArray374[--anInt7408]);
							if (arg0 == 2500) {
								anIntArray374[anInt7408++] = local137.anInt6552;
								return;
							}
							if (arg0 == 2501) {
								anIntArray374[anInt7408++] = local137.anInt6494;
								return;
							}
							if (arg0 == 2502) {
								anIntArray374[anInt7408++] = local137.anInt6529;
								return;
							}
							if (arg0 == 2503) {
								anIntArray374[anInt7408++] = local137.anInt6521;
								return;
							}
							if (arg0 == 2504) {
								anIntArray374[anInt7408++] = local137.aBoolean484 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray374[anInt7408++] = local137.anInt6559;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static541.method7832(local137);
								anIntArray374[anInt7408++] = local158 == null ? -1 : local158.anInt6555;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static490.method7272(anIntArray374[--anInt7408]);
							if (arg0 == 2600) {
								anIntArray374[anInt7408++] = local137.anInt6485;
								return;
							}
							if (arg0 == 2601) {
								anIntArray374[anInt7408++] = local137.anInt6563;
								return;
							}
							if (arg0 == 2602) {
								aStringArray45[anInt7410++] = local137.aString67;
								return;
							}
							if (arg0 == 2603) {
								anIntArray374[anInt7408++] = local137.anInt6506;
								return;
							}
							if (arg0 == 2604) {
								anIntArray374[anInt7408++] = local137.anInt6489;
								return;
							}
							if (arg0 == 2605) {
								anIntArray374[anInt7408++] = local137.anInt6543;
								return;
							}
							if (arg0 == 2606) {
								anIntArray374[anInt7408++] = local137.anInt6525;
								return;
							}
							if (arg0 == 2607) {
								anIntArray374[anInt7408++] = local137.anInt6561;
								return;
							}
							if (arg0 == 2608) {
								anIntArray374[anInt7408++] = local137.anInt6548;
								return;
							}
							if (arg0 == 2609) {
								anIntArray374[anInt7408++] = local137.anInt6539;
								return;
							}
							if (arg0 == 2610) {
								anIntArray374[anInt7408++] = local137.anInt6509;
								return;
							}
							if (arg0 == 2611) {
								anIntArray374[anInt7408++] = local137.anInt6518;
								return;
							}
							if (arg0 == 2612) {
								anIntArray374[anInt7408++] = local137.anInt6520;
								return;
							}
							if (arg0 == 2613) {
								anIntArray374[anInt7408++] = local137.lb;
								return;
							}
							if (arg0 == 2614) {
								anIntArray374[anInt7408++] = local137.anInt6538 == 1 ? local137.anInt6488 : -1;
								return;
							}
						} else {
							@Pc(3841) Class4_Sub37 local3841;
							@Pc(3739) Class4_Sub37 local3739;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static490.method7272(anIntArray374[--anInt7408]);
									anIntArray374[anInt7408++] = local137.anInt6527;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static490.method7272(anIntArray374[--anInt7408]);
									if (local137.anInt6527 != -1) {
										anIntArray374[anInt7408++] = local137.anInt6500;
										return;
									}
									anIntArray374[anInt7408++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray374[--anInt7408];
									local3739 = (Class4_Sub37) Static189.aClass350_14.method8207((long) local13);
									if (local3739 != null) {
										anIntArray374[anInt7408++] = 1;
										return;
									}
									anIntArray374[anInt7408++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static490.method7272(anIntArray374[--anInt7408]);
									if (local137.aClass225Array1 == null) {
										anIntArray374[anInt7408++] = 0;
										return;
									}
									local19 = local137.aClass225Array1.length;
									for (local25 = 0; local25 < local137.aClass225Array1.length; local25++) {
										if (local137.aClass225Array1[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray374[anInt7408++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt7408 -= 2;
									local13 = anIntArray374[anInt7408];
									local19 = anIntArray374[anInt7408 + 1];
									local3841 = (Class4_Sub37) Static189.aClass350_14.method8207((long) local13);
									if (local3841 != null && local3841.anInt8141 == local19) {
										anIntArray374[anInt7408++] = 1;
										return;
									}
									anIntArray374[anInt7408++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static490.method7272(anIntArray374[--anInt7408]);
								if (arg0 == 2800) {
									anIntArray374[anInt7408++] = Static69.method1180(local137).method131();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray374[--anInt7408];
									local19--;
									if (local137.aStringArray40 != null && local19 < local137.aStringArray40.length && local137.aStringArray40[local19] != null) {
										aStringArray45[anInt7410++] = local137.aStringArray40[local19];
										return;
									}
									aStringArray45[anInt7410++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString65 == null) {
										aStringArray45[anInt7410++] = "";
										return;
									}
									aStringArray45[anInt7410++] = local137.aString65;
									return;
								}
							} else {
								@Pc(3978) String local3978;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3978 = aStringArray45[--anInt7410];
										Static347.method5595(local3978);
										return;
									}
									if (arg0 == 3101) {
										anInt7408 -= 2;
										Static99.method2178(anIntArray374[anInt7408], anIntArray374[anInt7408 + 1], Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1);
										return;
									}
									if (arg0 == 3103) {
										Static218.method3582();
										return;
									}
									if (arg0 == 3104) {
										local3978 = aStringArray45[--anInt7410];
										local19 = 0;
										if (Static220.method3590(local3978)) {
											local19 = Static82.method1379(local3978);
										}
										@Pc(4038) Class4_Sub14 local4038 = Static196.method3380(Static17.aClass159_1, Static196.aClass173_57);
										local4038.aClass4_Sub11_Sub1_3.method4909(local19);
										Static353.method5712(local4038);
										return;
									}
									@Pc(4067) Class4_Sub14 local4067;
									if (arg0 == 3105) {
										local3978 = aStringArray45[--anInt7410];
										local4067 = Static196.method3380(Static17.aClass159_1, Static30.aClass173_7);
										local4067.aClass4_Sub11_Sub1_3.method4957(local3978.length() + 1);
										local4067.aClass4_Sub11_Sub1_3.method4945(local3978);
										Static353.method5712(local4067);
										return;
									}
									if (arg0 == 3106) {
										local3978 = aStringArray45[--anInt7410];
										local4067 = Static196.method3380(Static17.aClass159_1, Static211.aClass173_65);
										local4067.aClass4_Sub11_Sub1_3.method4957(local3978.length() + 1);
										local4067.aClass4_Sub11_Sub1_3.method4945(local3978);
										Static353.method5712(local4067);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray374[--anInt7408];
										local1145 = aStringArray45[--anInt7410];
										Static454.method6877(local1145, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt7408 -= 3;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										local25 = anIntArray374[anInt7408 + 2];
										local35 = Static490.method7272(local25);
										Static9.method169(local19, local35, local13);
										return;
									}
									if (arg0 == 3109) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										local210 = arg1 ? aClass225_38 : aClass225_37;
										Static9.method169(local19, local210, local13);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray374[--anInt7408];
										local4067 = Static196.method3380(Static17.aClass159_1, Static552.aClass173_117);
										local4067.aClass4_Sub11_Sub1_3.method4937(local13);
										Static353.method5712(local4067);
										return;
									}
									if (arg0 == 3111) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										local3841 = (Class4_Sub37) Static189.aClass350_14.method8207((long) local13);
										if (local3841 != null) {
											Static161.method525(true, local3841.anInt8141 != local19, local3841);
										}
										Static428.method6706(true, 3, local13, local19);
										return;
									}
									if (arg0 == 3112) {
										anInt7408--;
										local13 = anIntArray374[anInt7408];
										local3739 = (Class4_Sub37) Static189.aClass350_14.method8207((long) local13);
										if (local3739 != null && local3739.anInt8142 == 3) {
											Static161.method525(true, true, local3739);
										}
										return;
									}
									if (arg0 == 3113) {
										Static244.method3920(aStringArray45[--anInt7410]);
										return;
									}
									if (arg0 == 3114) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										local1507 = aStringArray45[--anInt7410];
										Static574.method8209("", local1507, "", "", local13, local19);
										return;
									}
									if (arg0 == 3115) {
										anInt7408 -= 11;
										@Pc(4368) Class258[] local4368 = Static240.method7436();
										@Pc(4371) Class250[] local4371 = Static215.method3573();
										Static459.method6995(anIntArray374[anInt7408 + 2], anIntArray374[anInt7408 + 3], local4368[anIntArray374[anInt7408]], anIntArray374[anInt7408 + 7], anIntArray374[anInt7408 + 10], anIntArray374[anInt7408 + 8], anIntArray374[anInt7408 + 4], anIntArray374[anInt7408 + 6], anIntArray374[anInt7408 + 9], local4371[anIntArray374[anInt7408 + 1]], anIntArray374[anInt7408 + 5]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt7408 -= 3;
										Static212.method3531(anIntArray374[anInt7408], 255, 256, anIntArray374[anInt7408 + 2], anIntArray374[anInt7408 + 1]);
										return;
									}
									if (arg0 == 3201) {
										Static379.method6044(50, 255, anIntArray374[--anInt7408]);
										return;
									}
									if (arg0 == 3202) {
										anInt7408 -= 2;
										Static40.method493(anIntArray374[anInt7408 + 1], 255, anIntArray374[anInt7408]);
										return;
									}
									if (arg0 == 3203) {
										anInt7408 -= 4;
										Static212.method3531(anIntArray374[anInt7408], anIntArray374[anInt7408 + 3], 256, anIntArray374[anInt7408 + 2], anIntArray374[anInt7408 + 1]);
										return;
									}
									if (arg0 == 3204) {
										anInt7408 -= 3;
										Static379.method6044(anIntArray374[anInt7408 + 2], anIntArray374[anInt7408 + 1], anIntArray374[anInt7408]);
										return;
									}
									if (arg0 == 3205) {
										anInt7408 -= 3;
										Static40.method493(anIntArray374[anInt7408 + 1], anIntArray374[anInt7408 + 2], anIntArray374[anInt7408]);
										return;
									}
									if (arg0 == 3206) {
										anInt7408 -= 4;
										Static190.method3334(anIntArray374[anInt7408 + 3], anIntArray374[anInt7408 + 2], anIntArray374[anInt7408], false, 256, anIntArray374[anInt7408 + 1]);
										return;
									}
									if (arg0 == 3207) {
										anInt7408 -= 4;
										Static190.method3334(anIntArray374[anInt7408 + 3], anIntArray374[anInt7408 + 2], anIntArray374[anInt7408], true, 256, anIntArray374[anInt7408 + 1]);
										return;
									}
									if (arg0 == 3208) {
										anInt7408 -= 5;
										Static212.method3531(anIntArray374[anInt7408], anIntArray374[anInt7408 + 3], anIntArray374[anInt7408 + 4], anIntArray374[anInt7408 + 2], anIntArray374[anInt7408 + 1]);
										return;
									}
									if (arg0 == 3209) {
										anInt7408 -= 5;
										Static190.method3334(anIntArray374[anInt7408 + 3], anIntArray374[anInt7408 + 2], anIntArray374[anInt7408], false, anIntArray374[anInt7408 + 4], anIntArray374[anInt7408 + 1]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray374[anInt7408++] = Static106.anInt2418;
										return;
									}
									if (arg0 == 3301) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = Static555.method8029(local13, local19, false);
										return;
									}
									if (arg0 == 3302) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = Static178.method3226(local19, local13, false);
										return;
									}
									if (arg0 == 3303) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = Static188.method3305(local13, local19, false);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static327.aClass161_1.method3717(local13).anInt2215;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static28.anIntArray19[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static174.anIntArray177[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static137.anIntArray141[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4896) byte local4896 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126;
										local19 = (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934 >> 9) + Static552.anInt9805;
										local25 = (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935 >> 9) + Static254.anInt4667;
										anIntArray374[anInt7408++] = (local4896 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray374[anInt7408++] = Static475.aBoolean431 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = Static555.method8029(local13, local19, true);
										return;
									}
									if (arg0 == 3314) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = Static178.method3226(local19, local13, true);
										return;
									}
									if (arg0 == 3315) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = Static188.method3305(local13, local19, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static204.anInt8827 >= 2) {
											anIntArray374[anInt7408++] = Static204.anInt8827;
											return;
										}
										anIntArray374[anInt7408++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray374[anInt7408++] = Static454.anInt8310;
										return;
									}
									if (arg0 == 3318) {
										anIntArray374[anInt7408++] = Static60.aClass342_1.anInt9881;
										return;
									}
									if (arg0 == 3321) {
										anIntArray374[anInt7408++] = Static307.anInt6166;
										return;
									}
									if (arg0 == 3322) {
										anIntArray374[anInt7408++] = Static528.anInt9395;
										return;
									}
									if (arg0 == 3323) {
										if (Static206.anInt2853 >= 5 && Static206.anInt2853 <= 9) {
											anIntArray374[anInt7408++] = 1;
											return;
										}
										anIntArray374[anInt7408++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static206.anInt2853 >= 5 && Static206.anInt2853 <= 9) {
											anIntArray374[anInt7408++] = Static206.anInt2853;
											return;
										}
										anIntArray374[anInt7408++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray374[anInt7408++] = Static310.aBoolean452 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray374[anInt7408++] = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt8465;
										return;
									}
									if (arg0 == 3327) {
										anIntArray374[anInt7408++] = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aClass166_1.aBoolean313 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray374[anInt7408++] = Static417.aBoolean537 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static122.method2550(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = Static468.method2270(local13, false, local19);
										return;
									}
									if (arg0 == 3332) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = Static468.method2270(local13, true, local19);
										return;
									}
									if (arg0 == 3333) {
										anIntArray374[anInt7408++] = Static135.anInt2897;
										return;
									}
									if (arg0 == 3335) {
										anIntArray374[anInt7408++] = Static154.anInt3181;
										return;
									}
									if (arg0 == 3336) {
										anInt7408 -= 4;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										local25 = anIntArray374[anInt7408 + 2];
										local353 = anIntArray374[anInt7408 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray374[anInt7408++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray374[anInt7408++] = Static566.anInt9919;
										return;
									}
									if (arg0 == 3338) {
										anIntArray374[anInt7408++] = Static77.method1242();
										return;
									}
									if (arg0 == 3339) {
										anIntArray374[anInt7408++] = Static17.aBoolean17 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray374[anInt7408++] = Static450.aBoolean600 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray374[anInt7408++] = Static166.aBoolean283 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray374[anInt7408++] = Static172.aClass135_1.method6370();
										return;
									}
									if (arg0 == 3343) {
										anIntArray374[anInt7408++] = Static172.aClass135_1.method6378();
										return;
									}
									if (arg0 == 3344) {
										aStringArray45[anInt7410++] = Static429.method6720();
										return;
									}
									if (arg0 == 3345) {
										aStringArray45[anInt7410++] = Static510.method2773();
										return;
									}
									if (arg0 == 3346) {
										anIntArray374[anInt7408++] = Static433.method6766();
										return;
									}
									if (arg0 == 3347) {
										anIntArray374[anInt7408++] = Static335.anInt6451;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5631) Class40 local5631;
									if (arg0 == 3400) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										local5631 = Static231.aClass87_1.method2467(local13);
										aStringArray45[anInt7410++] = local5631.method673(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt7408 -= 4;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										local25 = anIntArray374[anInt7408 + 2];
										local353 = anIntArray374[anInt7408 + 3];
										@Pc(5677) Class40 local5677 = Static231.aClass87_1.method2467(local25);
										if (local5677.aChar2 == local13 && local5677.aChar3 == local19) {
											if (local19 == 115) {
												aStringArray45[anInt7410++] = local5677.method673(local353);
												return;
											}
											anIntArray374[anInt7408++] = local5677.method674(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt7408 -= 3;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										local25 = anIntArray374[anInt7408 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5753) Class40 local5753 = Static231.aClass87_1.method2467(local19);
										if (local5753.aChar3 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray374[anInt7408++] = local5753.method669(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray374[--anInt7408];
										local1145 = aStringArray45[--anInt7410];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5631 = Static231.aClass87_1.method2467(local13);
										if (local5631.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray374[anInt7408++] = local5631.method679(local1145) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray374[--anInt7408];
										@Pc(5851) Class40 local5851 = Static231.aClass87_1.method2467(local13);
										anIntArray374[anInt7408++] = local5851.aClass350_4.method8202();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static238.anInt4334 == 0) {
											anIntArray374[anInt7408++] = -2;
											return;
										}
										if (Static238.anInt4334 == 1) {
											anIntArray374[anInt7408++] = -1;
											return;
										}
										anIntArray374[anInt7408++] = Static493.anInt8959;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray374[--anInt7408];
										if (Static238.anInt4334 == 2 && local13 < Static493.anInt8959) {
											aStringArray45[anInt7410++] = Static220.aStringArray22[local13];
											if (Static274.aStringArray34[local13] != null) {
												aStringArray45[anInt7410++] = Static274.aStringArray34[local13];
												return;
											}
											aStringArray45[anInt7410++] = "";
											return;
										}
										aStringArray45[anInt7410++] = "";
										aStringArray45[anInt7410++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray374[--anInt7408];
										if (Static238.anInt4334 == 2 && local13 < Static493.anInt8959) {
											anIntArray374[anInt7408++] = Static471.anIntArray476[local13];
											return;
										}
										anIntArray374[anInt7408++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray374[--anInt7408];
										if (Static238.anInt4334 == 2 && local13 < Static493.anInt8959) {
											anIntArray374[anInt7408++] = Static344.anIntArray342[local13];
											return;
										}
										anIntArray374[anInt7408++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3978 = aStringArray45[--anInt7410];
										local19 = anIntArray374[--anInt7408];
										Static159.method2938(local19, local3978);
										return;
									}
									if (arg0 == 3605) {
										local3978 = aStringArray45[--anInt7410];
										Static56.method938(local3978);
										return;
									}
									if (arg0 == 3606) {
										local3978 = aStringArray45[--anInt7410];
										Static235.method3776(local3978);
										return;
									}
									if (arg0 == 3607) {
										local3978 = aStringArray45[--anInt7410];
										Static530.method7703(local3978, false);
										return;
									}
									if (arg0 == 3608) {
										local3978 = aStringArray45[--anInt7410];
										Static327.method5374(local3978);
										return;
									}
									if (arg0 == 3609) {
										local3978 = aStringArray45[--anInt7410];
										if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
											local3978 = local3978.substring(7);
										}
										anIntArray374[anInt7408++] = Static548.method7959(local3978) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray374[--anInt7408];
										if (Static238.anInt4334 == 2 && local13 < Static493.anInt8959) {
											aStringArray45[anInt7410++] = Static241.aStringArray25[local13];
											return;
										}
										aStringArray45[anInt7410++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static517.aString89 != null) {
											aStringArray45[anInt7410++] = Static360.method5813(Static517.aString89);
											return;
										}
										aStringArray45[anInt7410++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static517.aString89 != null) {
											anIntArray374[anInt7408++] = Static247.anInt4517;
											return;
										}
										anIntArray374[anInt7408++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray374[--anInt7408];
										if (Static517.aString89 != null && local13 < Static247.anInt4517) {
											aStringArray45[anInt7410++] = Static126.aClass181Array1[local13].aString51;
											return;
										}
										aStringArray45[anInt7410++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray374[--anInt7408];
										if (Static517.aString89 != null && local13 < Static247.anInt4517) {
											anIntArray374[anInt7408++] = Static126.aClass181Array1[local13].anInt4676;
											return;
										}
										anIntArray374[anInt7408++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray374[--anInt7408];
										if (Static517.aString89 != null && local13 < Static247.anInt4517) {
											anIntArray374[anInt7408++] = Static126.aClass181Array1[local13].aByte43;
											return;
										}
										anIntArray374[anInt7408++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray374[anInt7408++] = Static44.aByte11;
										return;
									}
									if (arg0 == 3617) {
										local3978 = aStringArray45[--anInt7410];
										Static423.method6611(local3978);
										return;
									}
									if (arg0 == 3618) {
										anIntArray374[anInt7408++] = Static351.aByte115;
										return;
									}
									if (arg0 == 3619) {
										local3978 = aStringArray45[--anInt7410];
										Static197.method3384(local3978);
										return;
									}
									if (arg0 == 3620) {
										Static151.method5139();
										return;
									}
									if (arg0 == 3621) {
										if (Static238.anInt4334 == 0) {
											anIntArray374[anInt7408++] = -1;
											return;
										}
										anIntArray374[anInt7408++] = Static267.anInt5132;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray374[--anInt7408];
										if (Static238.anInt4334 != 0 && local13 < Static267.anInt5132) {
											aStringArray45[anInt7410++] = Static523.aStringArray64[local13];
											if (Static282.aStringArray27[local13] != null) {
												aStringArray45[anInt7410++] = Static282.aStringArray27[local13];
												return;
											}
											aStringArray45[anInt7410++] = "";
											return;
										}
										aStringArray45[anInt7410++] = "";
										aStringArray45[anInt7410++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3978 = aStringArray45[--anInt7410];
										if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
											local3978 = local3978.substring(7);
										}
										anIntArray374[anInt7408++] = Static511.method7464(local3978) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray374[--anInt7408];
										if (Static126.aClass181Array1 != null && local13 < Static247.anInt4517 && Static126.aClass181Array1[local13].aString50.equalsIgnoreCase(Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aString78)) {
											anIntArray374[anInt7408++] = 1;
											return;
										}
										anIntArray374[anInt7408++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static395.aString73 != null) {
											aStringArray45[anInt7410++] = Static395.aString73;
											return;
										}
										aStringArray45[anInt7410++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray374[--anInt7408];
										if (Static517.aString89 != null && local13 < Static247.anInt4517) {
											aStringArray45[anInt7410++] = Static126.aClass181Array1[local13].aString52;
											return;
										}
										aStringArray45[anInt7410++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray374[--anInt7408];
										if (Static238.anInt4334 == 2 && local13 >= 0 && local13 < Static493.anInt8959) {
											anIntArray374[anInt7408++] = Static374.aBooleanArray23[local13] ? 1 : 0;
											return;
										}
										anIntArray374[anInt7408++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3978 = aStringArray45[--anInt7410];
										if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
											local3978 = local3978.substring(7);
										}
										anIntArray374[anInt7408++] = Static358.method5788(local3978);
										return;
									}
									if (arg0 == 3629) {
										anIntArray374[anInt7408++] = Static47.anInt649;
										return;
									}
									if (arg0 == 3630) {
										local3978 = aStringArray45[--anInt7410];
										Static530.method7703(local3978, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static324.aBooleanArray20[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray374[--anInt7408];
										if (Static517.aString89 != null && local13 < Static247.anInt4517) {
											aStringArray45[anInt7410++] = Static126.aClass181Array1[local13].aString50;
											return;
										}
										aStringArray45[anInt7410++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray374[--anInt7408];
										if (Static238.anInt4334 != 0 && local13 < Static267.anInt5132) {
											aStringArray45[anInt7410++] = Static535.aStringArray66[local13];
											return;
										}
										aStringArray45[anInt7410++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static84.aClass358Array1[local13].method8264();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static84.aClass358Array1[local13].anInt10102;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static84.aClass358Array1[local13].anInt10106;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static84.aClass358Array1[local13].anInt10101;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static84.aClass358Array1[local13].anInt10100;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static84.aClass358Array1[local13].anInt10098;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray374[--anInt7408];
										local19 = Static84.aClass358Array1[local13].method8263();
										anIntArray374[anInt7408++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray374[--anInt7408];
										local19 = Static84.aClass358Array1[local13].method8263();
										anIntArray374[anInt7408++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray374[--anInt7408];
										local19 = Static84.aClass358Array1[local13].method8263();
										anIntArray374[anInt7408++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray374[--anInt7408];
										local19 = Static84.aClass358Array1[local13].method8263();
										anIntArray374[anInt7408++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt7408 -= 5;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										local25 = anIntArray374[anInt7408 + 2];
										local353 = anIntArray374[anInt7408 + 3];
										local2309 = anIntArray374[anInt7408 + 4];
										anIntArray374[anInt7408++] = local13 + (local19 - local13) * (local2309 - local25) / (local353 - local25);
										return;
									}
									@Pc(7361) long local7361;
									@Pc(7354) long local7354;
									if (arg0 == 4007) {
										anInt7408 -= 2;
										local7354 = anIntArray374[anInt7408];
										local7361 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = (int) (local7354 + local7354 * local7361 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										if (local13 == 0) {
											anIntArray374[anInt7408++] = 0;
											return;
										}
										anIntArray374[anInt7408++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										if (local13 == 0) {
											anIntArray374[anInt7408++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray374[anInt7408++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray374[anInt7408++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt7408 -= 3;
										local7354 = anIntArray374[anInt7408];
										local7361 = anIntArray374[anInt7408 + 1];
										@Pc(7742) long local7742 = (long) anIntArray374[anInt7408 + 2];
										anIntArray374[anInt7408++] = (int) (local7354 * local7742 / local7361);
										return;
									}
									if (arg0 == 4019) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										if (local13 > 700 || local19 > 700) {
											anIntArray374[anInt7408++] = 256;
										}
										@Pc(7801) double local7801 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
										anIntArray374[anInt7408++] = (int) (Math.pow(2.0D, local7801) + 0.5D);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3978 = aStringArray45[--anInt7410];
										local19 = anIntArray374[--anInt7408];
										aStringArray45[anInt7410++] = local3978 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt7410 -= 2;
										local3978 = aStringArray45[anInt7410];
										local1145 = aStringArray45[anInt7410 + 1];
										aStringArray45[anInt7410++] = local3978 + local1145;
										return;
									}
									if (arg0 == 4102) {
										local3978 = aStringArray45[--anInt7410];
										local19 = anIntArray374[--anInt7408];
										aStringArray45[anInt7410++] = local3978 + Static484.method7228(local19);
										return;
									}
									if (arg0 == 4103) {
										local3978 = aStringArray45[--anInt7410];
										aStringArray45[anInt7410++] = local3978.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray45[anInt7410++] = method6110(anIntArray374[--anInt7408]);
										return;
									}
									if (arg0 == 4105) {
										anInt7410 -= 2;
										local3978 = aStringArray45[anInt7410];
										local1145 = aStringArray45[anInt7410 + 1];
										if (Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aClass166_1 != null && Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aClass166_1.aBoolean313) {
											aStringArray45[anInt7410++] = local1145;
											return;
										}
										aStringArray45[anInt7410++] = local3978;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray374[--anInt7408];
										aStringArray45[anInt7410++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt7410 -= 2;
										anIntArray374[anInt7408++] = Static272.method4723(aStringArray45[anInt7410], Static154.anInt3181, aStringArray45[anInt7410 + 1]);
										return;
									}
									@Pc(8084) Class114 local8084;
									if (arg0 == 4108) {
										local3978 = aStringArray45[--anInt7410];
										anInt7408 -= 2;
										local19 = anIntArray374[anInt7408];
										local25 = anIntArray374[anInt7408 + 1];
										local8084 = Static288.method8172(Static500.aClass176_119, local25);
										anIntArray374[anInt7408++] = local8084.method2951(local3978, local19, Static188.aClass78Array10);
										return;
									}
									if (arg0 == 4109) {
										local3978 = aStringArray45[--anInt7410];
										anInt7408 -= 2;
										local19 = anIntArray374[anInt7408];
										local25 = anIntArray374[anInt7408 + 1];
										local8084 = Static288.method8172(Static500.aClass176_119, local25);
										anIntArray374[anInt7408++] = local8084.method2948(local19, Static188.aClass78Array10, local3978);
										return;
									}
									if (arg0 == 4110) {
										anInt7410 -= 2;
										local3978 = aStringArray45[anInt7410];
										local1145 = aStringArray45[anInt7410 + 1];
										if (anIntArray374[--anInt7408] == 1) {
											aStringArray45[anInt7410++] = local3978;
											return;
										}
										aStringArray45[anInt7410++] = local1145;
										return;
									}
									if (arg0 == 4111) {
										local3978 = aStringArray45[--anInt7410];
										aStringArray45[anInt7410++] = Static472.method7093(local3978);
										return;
									}
									if (arg0 == 4112) {
										local3978 = aStringArray45[--anInt7410];
										local19 = anIntArray374[--anInt7408];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray45[anInt7410++] = local3978 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static108.method2380((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static129.method2632((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static285.method5611((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static481.method7204((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3978 = aStringArray45[--anInt7410];
										if (local3978 != null) {
											anIntArray374[anInt7408++] = local3978.length();
											return;
										}
										anIntArray374[anInt7408++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3978 = aStringArray45[--anInt7410];
										anInt7408 -= 2;
										local19 = anIntArray374[anInt7408];
										local25 = anIntArray374[anInt7408 + 1];
										aStringArray45[anInt7410++] = local3978.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3978 = aStringArray45[--anInt7410];
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
										aStringArray45[anInt7410++] = local8447.toString();
										return;
									}
									if (arg0 == 4120) {
										local3978 = aStringArray45[--anInt7410];
										anInt7408 -= 2;
										local19 = anIntArray374[anInt7408];
										local25 = anIntArray374[anInt7408 + 1];
										anIntArray374[anInt7408++] = local3978.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt7410 -= 2;
										local3978 = aStringArray45[anInt7410];
										local1145 = aStringArray45[anInt7410 + 1];
										local25 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = local3978.indexOf(local1145, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray374[--anInt7408] != 0;
										local19 = anIntArray374[--anInt7408];
										aStringArray45[anInt7410++] = Static461.method7018(local412, 0, (long) local19, Static154.anInt3181);
										return;
									}
									if (arg0 == 4125) {
										local3978 = aStringArray45[--anInt7410];
										local19 = anIntArray374[--anInt7408];
										@Pc(8670) Class114 local8670 = Static288.method8172(Static500.aClass176_119, local19);
										anIntArray374[anInt7408++] = local8670.method2949(local3978, Static188.aClass78Array10);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray374[--anInt7408];
										aStringArray45[anInt7410++] = Static521.aClass273_2.method6712(local13).aString71;
										return;
									}
									@Pc(8732) Class242 local8732;
									if (arg0 == 4201) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										local8732 = Static521.aClass273_2.method6712(local13);
										if (local19 >= 1 && local19 <= 5 && local8732.aStringArray43[local19 - 1] != null) {
											aStringArray45[anInt7410++] = local8732.aStringArray43[local19 - 1];
											return;
										}
										aStringArray45[anInt7410++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										local8732 = Static521.aClass273_2.method6712(local13);
										if (local19 >= 1 && local19 <= 5 && local8732.aStringArray42[local19 - 1] != null) {
											aStringArray45[anInt7410++] = local8732.aStringArray42[local19 - 1];
											return;
										}
										aStringArray45[anInt7410++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static521.aClass273_2.method6712(local13).anInt7108;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static521.aClass273_2.method6712(local13).anInt7140 == 1 ? 1 : 0;
										return;
									}
									@Pc(8895) Class242 local8895;
									if (arg0 == 4205) {
										local13 = anIntArray374[--anInt7408];
										local8895 = Static521.aClass273_2.method6712(local13);
										if (local8895.anInt7089 == -1 && local8895.anInt7117 >= 0) {
											anIntArray374[anInt7408++] = local8895.anInt7117;
											return;
										}
										anIntArray374[anInt7408++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray374[--anInt7408];
										local8895 = Static521.aClass273_2.method6712(local13);
										if (local8895.anInt7089 >= 0 && local8895.anInt7117 >= 0) {
											anIntArray374[anInt7408++] = local8895.anInt7117;
											return;
										}
										anIntArray374[anInt7408++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static521.aClass273_2.method6712(local13).aBoolean501 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										local3043 = Static484.aClass313_2.method7381(local19);
										if (local3043.method2801()) {
											aStringArray45[anInt7410++] = Static521.aClass273_2.method6712(local13).method5895(local19, local3043.aString27);
											return;
										}
										anIntArray374[anInt7408++] = Static521.aClass273_2.method6712(local13).method5896(local3043.anInt3103, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1] - 1;
										local8732 = Static521.aClass273_2.method6712(local13);
										if (local8732.anInt7096 == local19) {
											anIntArray374[anInt7408++] = local8732.anInt7084;
											return;
										}
										if (local8732.anInt7130 == local19) {
											anIntArray374[anInt7408++] = local8732.anInt7119;
											return;
										}
										anIntArray374[anInt7408++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3978 = aStringArray45[--anInt7410];
										local19 = anIntArray374[--anInt7408];
										Static413.method6809(local3978, local19 == 1);
										anIntArray374[anInt7408++] = Static291.anInt5926;
										return;
									}
									if (arg0 == 4211) {
										if (Static256.aShortArray58 != null && Static15.anInt243 < Static291.anInt5926) {
											anIntArray374[anInt7408++] = Static256.aShortArray58[Static15.anInt243++] & 0xFFFF;
											return;
										}
										anIntArray374[anInt7408++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static15.anInt243 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray374[--anInt7408];
										anIntArray374[anInt7408++] = Static521.aClass273_2.method6712(local13).anInt7109;
										return;
									}
									if (arg0 == 4214) {
										local3978 = aStringArray45[--anInt7410];
										anInt7408 -= 3;
										local19 = anIntArray374[anInt7408];
										local25 = anIntArray374[anInt7408 + 1];
										local353 = anIntArray374[anInt7408 + 2];
										Static517.method7562(local25, local353, local19 == 1, local3978);
										anIntArray374[anInt7408++] = Static291.anInt5926;
										return;
									}
									if (arg0 == 4215) {
										anInt7410 -= 2;
										anInt7408 -= 2;
										local3978 = aStringArray45[anInt7410];
										local19 = anIntArray374[anInt7408];
										local25 = anIntArray374[anInt7408 + 1];
										@Pc(9294) String local9294 = aStringArray45[anInt7410 + 1];
										Static263.method4441(local19 == 1, local25, local9294, local3978);
										anIntArray374[anInt7408++] = Static291.anInt5926;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										local3043 = Static484.aClass313_2.method7381(local19);
										if (local3043.method2801()) {
											aStringArray45[anInt7410++] = Static237.aClass31_1.method478(local13).method6839(local19, local3043.aString27);
											return;
										}
										anIntArray374[anInt7408++] = Static237.aClass31_1.method478(local13).method6830(local19, local3043.anInt3103);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										local3043 = Static484.aClass313_2.method7381(local19);
										if (local3043.method2801()) {
											aStringArray45[anInt7410++] = Static204.aClass139_8.method3309(local13).method2712(local3043.aString27, local19);
											return;
										}
										anIntArray374[anInt7408++] = Static204.aClass139_8.method3309(local13).method2704(local3043.anInt3103, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt7408 -= 2;
										local13 = anIntArray374[anInt7408];
										local19 = anIntArray374[anInt7408 + 1];
										local3043 = Static484.aClass313_2.method7381(local19);
										if (local3043.method2801()) {
											aStringArray45[anInt7410++] = Static278.aClass171_1.method3848(local13).method7658(local19, local3043.aString27);
											return;
										}
										anIntArray374[anInt7408++] = Static278.aClass171_1.method3848(local13).method7655(local3043.anInt3103, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray374[--anInt7408];
									@Pc(9522) Class316 local9522 = Static462.aClass178_1.method4035(local13);
									if (local9522.anIntArray496 != null && local9522.anIntArray496.length > 0) {
										local25 = 0;
										local353 = local9522.anIntArray495[0];
										for (local2309 = 1; local2309 < local9522.anIntArray496.length; local2309++) {
											if (local9522.anIntArray495[local2309] > local353) {
												local25 = local2309;
												local353 = local9522.anIntArray495[local2309];
											}
										}
										anIntArray374[anInt7408++] = local9522.anIntArray496[local25];
										return;
									}
									anIntArray374[anInt7408++] = local9522.anInt9122;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static490.method7272(anIntArray374[--anInt7408]);
					} else {
						local137 = arg1 ? aClass225_38 : aClass225_37;
					}
					Static92.method2100(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt7408 -= 2;
						local19 = anIntArray374[anInt7408];
						local25 = anIntArray374[anInt7408 + 1];
						if (local137.anInt6565 == -1) {
							Static333.method5936(local137.anInt6555);
							Static520.method7613(local137.anInt6555);
							Static213.method4338(local137.anInt6555);
						}
						if (local19 == -1) {
							local137.anInt6538 = 1;
							local137.anInt6488 = -1;
							local137.anInt6527 = -1;
							return;
						}
						local137.anInt6527 = local19;
						local137.anInt6500 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean474 = true;
						} else {
							local137.aBoolean474 = false;
						}
						@Pc(1649) Class242 local1649 = Static521.aClass273_2.method6712(local19);
						local137.anInt6525 = local1649.anInt7113;
						local137.anInt6548 = local1649.anInt7126;
						local137.anInt6561 = local1649.anInt7137;
						local137.anInt6509 = local1649.anInt7082;
						local137.anInt6518 = local1649.anInt7142;
						local137.anInt6543 = local1649.anInt7097;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt6498 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt6498 = 1;
						} else {
							local137.anInt6498 = 2;
						}
						if (local137.anInt6519 > 0) {
							local137.anInt6543 = local137.anInt6543 * 32 / local137.anInt6519;
							return;
						}
						if (local137.anInt6503 > 0) {
							local137.anInt6543 = local137.anInt6543 * 32 / local137.anInt6503;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt6538 = 2;
						local137.anInt6488 = anIntArray374[--anInt7408];
						if (local137.anInt6565 == -1) {
							Static156.method2907(local137.anInt6555);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt6538 = 3;
						local137.anInt6488 = -1;
						if (local137.anInt6565 == -1) {
							Static156.method2907(local137.anInt6555);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt6538 = 6;
						local137.anInt6488 = anIntArray374[--anInt7408];
						if (local137.anInt6565 == -1) {
							Static156.method2907(local137.anInt6555);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt6538 = 5;
						local137.anInt6488 = anIntArray374[--anInt7408];
						if (local137.anInt6565 == -1) {
							Static156.method2907(local137.anInt6555);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt7408 -= 4;
						local137.anInt6564 = anIntArray374[anInt7408];
						local137.anInt6480 = anIntArray374[anInt7408 + 1];
						local137.anInt6534 = anIntArray374[anInt7408 + 2];
						local137.anInt6493 = anIntArray374[anInt7408 + 3];
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt7408 -= 2;
						local137.anInt6562 = anIntArray374[anInt7408];
						local137.anInt6482 = anIntArray374[anInt7408 + 1];
						Static92.method2100(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt7408 -= 4;
						local137.anInt6488 = anIntArray374[anInt7408];
						local137.anInt6544 = anIntArray374[anInt7408 + 1];
						if (anIntArray374[anInt7408 + 2] == 1) {
							local137.anInt6538 = 9;
						} else {
							local137.anInt6538 = 8;
						}
						if (anIntArray374[anInt7408 + 3] == 1) {
							local137.aBoolean474 = true;
						} else {
							local137.aBoolean474 = false;
						}
						if (local137.anInt6565 == -1) {
							Static156.method2907(local137.anInt6555);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt6538 = 5;
						local137.anInt6488 = Static411.anInt7797;
						local137.anInt6544 = 0;
						if (local137.anInt6565 == -1) {
							Static156.method2907(local137.anInt6555);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static490.method7272(anIntArray374[--anInt7408]);
				} else {
					local137 = arg1 ? aClass225_38 : aClass225_37;
				}
				if (arg0 == 1000) {
					anInt7408 -= 4;
					local137.anInt6540 = anIntArray374[anInt7408];
					local137.anInt6528 = anIntArray374[anInt7408 + 1];
					local19 = anIntArray374[anInt7408 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray374[anInt7408 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte69 = (byte) local19;
					local137.aByte68 = (byte) local25;
					Static92.method2100(local137);
					Static92.method2104(local137);
					if (local137.anInt6565 == -1) {
						Static351.method7419(local137.anInt6555);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt7408 -= 4;
					local137.anInt6503 = anIntArray374[anInt7408];
					local137.anInt6523 = anIntArray374[anInt7408 + 1];
					local137.anInt6519 = 0;
					local137.anInt6483 = 0;
					local19 = anIntArray374[anInt7408 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray374[anInt7408 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte70 = (byte) local19;
					local137.aByte71 = (byte) local25;
					Static92.method2100(local137);
					Static92.method2104(local137);
					if (local137.anInt6508 == 0) {
						Static38.method489(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray374[--anInt7408] == 1;
					if (local137.aBoolean484 != local645) {
						local137.aBoolean484 = local645;
						Static92.method2100(local137);
					}
					if (local137.anInt6565 == -1) {
						Static134.method2662(local137.anInt6555);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt7408 -= 2;
					local137.anInt6486 = anIntArray374[anInt7408];
					local137.anInt6504 = anIntArray374[anInt7408 + 1];
					Static92.method2100(local137);
					Static92.method2104(local137);
					if (local137.anInt6508 == 0) {
						Static38.method489(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean485 = anIntArray374[--anInt7408] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
	private static void method6114(@OriginalArg(0) int arg0) {
		@Pc(3) Class225 local3 = Static490.method7272(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class225[] local13 = Static583.aClass225ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class225[] local19 = Static343.aClass225ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static583.aClass225ArrayArray2[local9] = new Class225[local22];
			Static597.method3725(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static597.method3725(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)V")
	public static void method6115(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static478.method7175(arg0)) {
			return;
		}
		@Pc(12) Class225[] local12 = Static343.aClass225ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class225 local19 = local12[local14];
			if (local19.anObjectArray10 != null) {
				@Pc(26) Class4_Sub25 local26 = new Class4_Sub25();
				local26.aClass225_21 = local19;
				local26.anObjectArray1 = local19.anObjectArray10;
				method6120(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!ht;I)V")
	private static void method6116(@OriginalArg(0) Class4_Sub5_Sub7 arg0, @OriginalArg(1) int arg1) {
		anInt7408 = 0;
		anInt7410 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray184;
		@Pc(11) int[] local11 = arg0.anIntArray185;
		@Pc(13) byte local13 = -1;
		anInt7406 = 0;
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
						method6113(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method6109(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray374[anInt7408++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray374[anInt7408++] = Static45.aClass148_1.anIntArray188[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static45.aClass148_1.method3454(anIntArray374[--anInt7408], local54);
					} else if (local31 == 3) {
						aStringArray45[anInt7410++] = arg0.aStringArray21[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt7408 -= 2;
						if (anIntArray374[anInt7408] != anIntArray374[anInt7408 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt7408 -= 2;
						if (anIntArray374[anInt7408] == anIntArray374[anInt7408 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt7408 -= 2;
						if (anIntArray374[anInt7408] < anIntArray374[anInt7408 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt7408 -= 2;
						if (anIntArray374[anInt7408] > anIntArray374[anInt7408 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt7406 == 0) {
							return;
						}
						@Pc(216) Class24 local216 = aClass24Array1[--anInt7406];
						arg0 = local216.aClass4_Sub5_Sub7_1;
						local8 = arg0.anIntArray184;
						local11 = arg0.anIntArray185;
						local5 = local216.anInt404;
						anIntArray372 = local216.anIntArray16;
						aStringArray46 = local216.aStringArray7;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray374[anInt7408++] = Static45.aClass148_1.method3448(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static45.aClass148_1.method3449(anIntArray374[--anInt7408], local54);
					} else if (local31 == 31) {
						anInt7408 -= 2;
						if (anIntArray374[anInt7408] <= anIntArray374[anInt7408 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt7408 -= 2;
						if (anIntArray374[anInt7408] >= anIntArray374[anInt7408 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray374[anInt7408++] = anIntArray372[local11[local5]];
					} else if (local31 == 34) {
						anIntArray372[local11[local5]] = anIntArray374[--anInt7408];
					} else if (local31 == 35) {
						aStringArray45[anInt7410++] = aStringArray46[local11[local5]];
					} else if (local31 == 36) {
						aStringArray46[local11[local5]] = aStringArray45[--anInt7410];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt7410 -= local54;
						@Pc(400) String local400 = Static291.method5068(anInt7410, local54, aStringArray45);
						aStringArray45[anInt7410++] = local400;
					} else if (local31 == 38) {
						anInt7408--;
					} else if (local31 == 39) {
						anInt7410--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class4_Sub5_Sub7 local436 = Static47.method609(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt3821];
							@Pc(450) String[] local450 = new String[local436.anInt3818];
							for (local452 = 0; local452 < local436.anInt3819; local452++) {
								local446[local452] = anIntArray374[anInt7408 + local452 - local436.anInt3819];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt3820; local471++) {
								local450[local471] = aStringArray45[anInt7410 + local471 - local436.anInt3820];
							}
							anInt7408 -= local436.anInt3819;
							anInt7410 -= local436.anInt3820;
							@Pc(502) Class24 local502 = new Class24();
							local502.aClass4_Sub5_Sub7_1 = arg0;
							local502.anInt404 = local5;
							local502.anIntArray16 = anIntArray372;
							local502.aStringArray7 = aStringArray46;
							if (anInt7406 >= aClass24Array1.length) {
								throw new RuntimeException();
							}
							aClass24Array1[anInt7406++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray184;
							local11 = local436.anIntArray185;
							local5 = -1;
							anIntArray372 = local446;
							aStringArray46 = local450;
						} else if (local31 == 42) {
							anIntArray374[anInt7408++] = Static419.anIntArray414[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static419.anIntArray414[local54] = anIntArray374[--anInt7408];
							Static438.method6797(local54);
							Static478.aBoolean619 |= Static225.aBooleanArray11[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray374[--anInt7408];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray373[local54] = local611;
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
							local603 = anIntArray374[--anInt7408];
							if (local603 < 0 || local603 >= anIntArray373[local54]) {
								throw new RuntimeException();
							}
							anIntArray374[anInt7408++] = anIntArrayArray41[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt7408 -= 2;
							local603 = anIntArray374[anInt7408];
							if (local603 < 0 || local603 >= anIntArray373[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray41[local54][local603] = anIntArray374[anInt7408 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static53.aStringArray10[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray45[anInt7410++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static53.aStringArray10[local54] = aStringArray45[--anInt7410];
							Static156.method2906(local54);
						} else if (local31 == 51) {
							@Pc(774) Class350 local774 = arg0.aClass350Array1[local11[local5]];
							@Pc(787) Class4_Sub38 local787 = (Class4_Sub38) local774.method8207((long) anIntArray374[--anInt7408]);
							if (local787 != null) {
								local5 += local787.anInt8496;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString33 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong268).append(" ");
				for (local603 = anInt7406 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass24Array1[local603].aClass4_Sub5_Sub7_1.aLong268).append(" ");
				}
				local856.append("op: ").append(local13);
				Static205.method3450(local856.toString(), local837);
			} else {
				Static465.method7052("Clientscript error in: " + arg0.aString33);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString33).append("\n");
				for (local603 = anInt7406 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass24Array1[local603].aClass4_Sub5_Sub7_1.aString33).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static205.method3450(local856.toString(), local837);
				Static82.method1376(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "(I)V")
	private static void method6117(@OriginalArg(0) int arg0) {
		@Pc(3) Class225 local3 = Static490.method7272(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class225[] local13 = Static583.aClass225ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class225[] local19 = Static343.aClass225ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static583.aClass225ArrayArray2[local9] = new Class225[local22];
			Static597.method3725(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static597.method3725(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "()V")
	public static void method6119() {
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!jh;I)V")
	private static void method6120(@OriginalArg(0) Class4_Sub25 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class4_Sub5_Sub7 local12 = Static47.method609(local8);
		if (local12 == null) {
			return;
		}
		anIntArray372 = new int[local12.anInt3821];
		@Pc(21) int local21 = 0;
		aStringArray46 = new String[local12.anInt3818];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt4397;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt4393;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass225_21 == null ? -1 : arg0.aClass225_21.anInt6555;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt4395;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass225_21 == null ? -1 : arg0.aClass225_21.anInt6565;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass225_20 == null ? -1 : arg0.aClass225_20.anInt6555;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass225_20 == null ? -1 : arg0.aClass225_20.anInt6565;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt4392;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt4391;
				}
				anIntArray372[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString49;
				}
				aStringArray46[local27++] = local135;
			}
		}
		anInt7419 = arg0.anInt4394;
		method6116(local12, arg1);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!jh;)V")
	public static void method6121(@OriginalArg(0) Class4_Sub25 arg0) {
		method6120(arg0, 200000);
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(IZ)V")
	public static void method6122() {
	}
}
