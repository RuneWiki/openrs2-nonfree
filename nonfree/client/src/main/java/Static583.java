import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "[I")
	private static int[] anIntArray582;

	@OriginalMember(owner = "client!wea", name = "e", descriptor = "Lclient!pca;")
	private static Class251 aClass251_15;

	@OriginalMember(owner = "client!wea", name = "i", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray50;

	@OriginalMember(owner = "client!wea", name = "j", descriptor = "Lclient!pca;")
	private static Class251 aClass251_16;

	@OriginalMember(owner = "client!wea", name = "o", descriptor = "Lclient!mp;")
	private static Class211 aClass211_1;

	@OriginalMember(owner = "client!wea", name = "f", descriptor = "[Lclient!pe;")
	private static final Class253[] aClass253Array1 = new Class253[50];

	@OriginalMember(owner = "client!wea", name = "k", descriptor = "[[I")
	private static final int[][] anIntArrayArray104 = new int[5][5000];

	@OriginalMember(owner = "client!wea", name = "l", descriptor = "[I")
	private static final int[] anIntArray583 = new int[5];

	@OriginalMember(owner = "client!wea", name = "m", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!wea", name = "p", descriptor = "I")
	private static int anInt10073 = 0;

	@OriginalMember(owner = "client!wea", name = "q", descriptor = "I")
	private static int anInt10074 = 0;

	@OriginalMember(owner = "client!wea", name = "t", descriptor = "[I")
	private static final int[] anIntArray584 = new int[1000];

	@OriginalMember(owner = "client!wea", name = "u", descriptor = "I")
	private static int anInt10077 = 0;

	@OriginalMember(owner = "client!wea", name = "v", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray51 = new String[1000];

	@OriginalMember(owner = "client!wea", name = "z", descriptor = "[I")
	private static final int[] anIntArray585 = new int[3];

	@OriginalMember(owner = "client!wea", name = "A", descriptor = "Lclient!vg;")
	public static final Class342 aClass342_199 = new Class342(4);

	@OriginalMember(owner = "client!wea", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray52 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!wea", name = "C", descriptor = "I")
	private static int anInt10081 = 0;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IZ)V")
	private static void method7918(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class3_Sub10 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray584[anInt10074++] = Static392.anInt6961;
				return;
			}
			if (arg0 == 5001) {
				anInt10074 -= 3;
				Static392.anInt6961 = anIntArray584[anInt10074];
				Static178.aClass134_2 = Static428.method5926(anIntArray584[anInt10074 + 1]);
				if (Static178.aClass134_2 == null) {
					Static178.aClass134_2 = Static549.aClass134_4;
				}
				Static96.anInt2367 = anIntArray584[anInt10074 + 2];
				local52 = Static129.method2403(Static452.aClass353_2, Static584.aClass287_148);
				local52.aClass3_Sub26_Sub1_1.method6809(Static392.anInt6961);
				local52.aClass3_Sub26_Sub1_1.method6809(Static178.aClass134_2.anInt4451);
				local52.aClass3_Sub26_Sub1_1.method6809(Static96.anInt2367);
				Static193.method3398(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt10073 -= 2;
				local83 = aStringArray51[anInt10073];
				local89 = aStringArray51[anInt10073 + 1];
				anInt10074 -= 2;
				local97 = anIntArray584[anInt10074];
				local103 = anIntArray584[anInt10074 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class3_Sub10 local125 = Static129.method2403(Static452.aClass353_2, Static319.aClass287_95);
				local125.aClass3_Sub26_Sub1_1.method6809(Static158.method2898(local83) + Static158.method2898(local89) + 2);
				local125.aClass3_Sub26_Sub1_1.method6772(local83);
				local125.aClass3_Sub26_Sub1_1.method6809(local97 - 1);
				local125.aClass3_Sub26_Sub1_1.method6809(local103);
				local125.aClass3_Sub26_Sub1_1.method6772(local89);
				Static193.method3398(local125);
				return;
			}
			@Pc(179) Class259 local179;
			if (arg0 == 5003) {
				local175 = anIntArray584[--anInt10074];
				local179 = Static195.method3405(local175);
				local181 = "";
				if (local179 != null && local179.aString200 != null) {
					local181 = local179.aString200;
				}
				aStringArray51[anInt10073++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray584[--anInt10074];
				local179 = Static195.method3405(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt7459;
				}
				anIntArray584[anInt10074++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static178.aClass134_2 == null) {
					anIntArray584[anInt10074++] = -1;
					return;
				}
				anIntArray584[anInt10074++] = Static178.aClass134_2.anInt4451;
				return;
			}
			@Pc(269) Class3_Sub10 local269;
			if (arg0 == 5006) {
				local175 = anIntArray584[--anInt10074];
				local269 = Static129.method2403(Static452.aClass353_2, Static248.aClass287_79);
				local269.aClass3_Sub26_Sub1_1.method6809(local175);
				Static193.method3398(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray51[--anInt10073];
				method7924(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt10073 -= 2;
				local83 = aStringArray51[anInt10073];
				local89 = aStringArray51[anInt10073 + 1];
				if (Static212.anInt5852 != 0 || (!Static402.aBoolean498 || Static226.aBoolean296) && !Static416.aBoolean520) {
					@Pc(328) Class3_Sub10 local328 = Static129.method2403(Static452.aClass353_2, Static155.aClass287_54);
					local328.aClass3_Sub26_Sub1_1.method6809(0);
					local103 = local328.aClass3_Sub26_Sub1_1.anInt8703;
					local328.aClass3_Sub26_Sub1_1.method6772(local83);
					Static548.method7506(local328.aClass3_Sub26_Sub1_1, local89);
					local328.aClass3_Sub26_Sub1_1.method6768(local328.aClass3_Sub26_Sub1_1.anInt8703 - local103);
					Static193.method3398(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray584[--anInt10074];
				local179 = Static195.method3405(local175);
				local181 = "";
				if (local179 != null && local179.aString197 != null) {
					local181 = local179.aString197;
				}
				aStringArray51[anInt10073++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray584[--anInt10074];
				local179 = Static195.method3405(local175);
				local181 = "";
				if (local179 != null && local179.aString199 != null) {
					local181 = local179.aString199;
				}
				aStringArray51[anInt10073++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray584[--anInt10074];
				local179 = Static195.method3405(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt7456;
				}
				anIntArray584[anInt10074++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 == null || Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aString182 == null) {
					local83 = Static422.aString202;
				} else {
					local83 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.method5676();
				}
				aStringArray51[anInt10073++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray584[anInt10074++] = Static96.anInt2367;
				return;
			}
			if (arg0 == 5017) {
				anIntArray584[anInt10074++] = Static53.method1327();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray584[--anInt10074];
				local179 = Static195.method3405(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt7460;
				}
				anIntArray584[anInt10074++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray584[--anInt10074];
				local179 = Static195.method3405(local175);
				local181 = "";
				if (local179 != null && local179.aString196 != null) {
					local181 = local179.aString196;
				}
				aStringArray51[anInt10073++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 == null || Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aString182 == null) {
					local83 = Static422.aString202;
				} else {
					local83 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.method5670();
				}
				aStringArray51[anInt10073++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray584[--anInt10074];
				local179 = Static195.method3405(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt7457;
				}
				anIntArray584[anInt10074++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray584[--anInt10074];
				local179 = Static195.method3405(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt7458;
				}
				anIntArray584[anInt10074++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray584[--anInt10074];
				local179 = Static195.method3405(local175);
				local181 = "";
				if (local179 != null && local179.aString198 != null) {
					local181 = local179.aString198;
				}
				aStringArray51[anInt10073++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray584[--anInt10074];
				aStringArray51[anInt10073++] = Static239.aClass169_1.method4099(local175).aString102;
				return;
			}
			@Pc(736) Class3_Sub7_Sub9 local736;
			if (arg0 == 5051) {
				local175 = anIntArray584[--anInt10074];
				local736 = Static239.aClass169_1.method4099(local175);
				if (local736.anIntArray171 == null) {
					anIntArray584[anInt10074++] = 0;
					return;
				}
				anIntArray584[anInt10074++] = local736.anIntArray171.length;
				return;
			}
			if (arg0 == 5052) {
				anInt10074 -= 2;
				local175 = anIntArray584[anInt10074];
				local776 = anIntArray584[anInt10074 + 1];
				@Pc(781) Class3_Sub7_Sub9 local781 = Static239.aClass169_1.method4099(local175);
				local103 = local781.anIntArray171[local776];
				anIntArray584[anInt10074++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray584[--anInt10074];
				local736 = Static239.aClass169_1.method4099(local175);
				if (local736.anIntArray170 == null) {
					anIntArray584[anInt10074++] = 0;
					return;
				}
				anIntArray584[anInt10074++] = local736.anIntArray170.length;
				return;
			}
			if (arg0 == 5054) {
				anInt10074 -= 2;
				local175 = anIntArray584[anInt10074];
				local776 = anIntArray584[anInt10074 + 1];
				anIntArray584[anInt10074++] = Static239.aClass169_1.method4099(local175).anIntArray170[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray584[--anInt10074];
				aStringArray51[anInt10073++] = Static212.aClass294_3.method6455(local175).method3050();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray584[--anInt10074];
				@Pc(907) Class3_Sub7_Sub8 local907 = Static212.aClass294_3.method6455(local175);
				if (local907.anIntArray153 == null) {
					anIntArray584[anInt10074++] = 0;
					return;
				}
				anIntArray584[anInt10074++] = local907.anIntArray153.length;
				return;
			}
			if (arg0 == 5057) {
				anInt10074 -= 2;
				local175 = anIntArray584[anInt10074];
				local776 = anIntArray584[anInt10074 + 1];
				anIntArray584[anInt10074++] = Static212.aClass294_3.method6455(local175).anIntArray153[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass211_1 = new Class211();
				aClass211_1.anInt6132 = anIntArray584[--anInt10074];
				aClass211_1.aClass3_Sub7_Sub8_1 = Static212.aClass294_3.method6455(aClass211_1.anInt6132);
				aClass211_1.anIntArray343 = new int[aClass211_1.aClass3_Sub7_Sub8_1.method3049()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static129.method2403(Static452.aClass353_2, Static181.aClass287_60);
				local52.aClass3_Sub26_Sub1_1.method6809(0);
				local776 = local52.aClass3_Sub26_Sub1_1.anInt8703;
				local52.aClass3_Sub26_Sub1_1.method6809(0);
				local52.aClass3_Sub26_Sub1_1.method6769(aClass211_1.anInt6132);
				aClass211_1.aClass3_Sub7_Sub8_1.method3055(local52.aClass3_Sub26_Sub1_1, aClass211_1.anIntArray343);
				local52.aClass3_Sub26_Sub1_1.method6768(local52.aClass3_Sub26_Sub1_1.anInt8703 - local776);
				Static193.method3398(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray51[--anInt10073];
				local269 = Static129.method2403(Static452.aClass353_2, Static537.aClass287_143);
				local269.aClass3_Sub26_Sub1_1.method6809(0);
				local97 = local269.aClass3_Sub26_Sub1_1.anInt8703;
				local269.aClass3_Sub26_Sub1_1.method6772(local83);
				local269.aClass3_Sub26_Sub1_1.method6769(aClass211_1.anInt6132);
				aClass211_1.aClass3_Sub7_Sub8_1.method3055(local269.aClass3_Sub26_Sub1_1, aClass211_1.anIntArray343);
				local269.aClass3_Sub26_Sub1_1.method6768(local269.aClass3_Sub26_Sub1_1.anInt8703 - local97);
				Static193.method3398(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static129.method2403(Static452.aClass353_2, Static181.aClass287_60);
				local52.aClass3_Sub26_Sub1_1.method6809(0);
				local776 = local52.aClass3_Sub26_Sub1_1.anInt8703;
				local52.aClass3_Sub26_Sub1_1.method6809(1);
				local52.aClass3_Sub26_Sub1_1.method6769(aClass211_1.anInt6132);
				aClass211_1.aClass3_Sub7_Sub8_1.method3055(local52.aClass3_Sub26_Sub1_1, aClass211_1.anIntArray343);
				local52.aClass3_Sub26_Sub1_1.method6768(local52.aClass3_Sub26_Sub1_1.anInt8703 - local776);
				Static193.method3398(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt10074 -= 2;
				local175 = anIntArray584[anInt10074];
				local776 = anIntArray584[anInt10074 + 1];
				anIntArray584[anInt10074++] = Static239.aClass169_1.method4099(local175).aCharArray4[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt10074 -= 2;
				local175 = anIntArray584[anInt10074];
				local776 = anIntArray584[anInt10074 + 1];
				anIntArray584[anInt10074++] = Static239.aClass169_1.method4099(local175).aCharArray5[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt10074 -= 2;
				local175 = anIntArray584[anInt10074];
				local776 = anIntArray584[anInt10074 + 1];
				if (local776 == -1) {
					anIntArray584[anInt10074++] = -1;
					return;
				}
				anIntArray584[anInt10074++] = Static239.aClass169_1.method4099(local175).method3285((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt10074 -= 2;
				local175 = anIntArray584[anInt10074];
				local776 = anIntArray584[anInt10074 + 1];
				if (local776 == -1) {
					anIntArray584[anInt10074++] = -1;
					return;
				}
				anIntArray584[anInt10074++] = Static239.aClass169_1.method4099(local175).method3286((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray584[--anInt10074];
				anIntArray584[anInt10074++] = Static212.aClass294_3.method6455(local175).method3049();
				return;
			}
			if (arg0 == 5067) {
				anInt10074 -= 2;
				local175 = anIntArray584[anInt10074];
				local776 = anIntArray584[anInt10074 + 1];
				local97 = Static212.aClass294_3.method6455(local175).method3047(local776).anInt9450;
				anIntArray584[anInt10074++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt10074 -= 2;
				local175 = anIntArray584[anInt10074];
				local776 = anIntArray584[anInt10074 + 1];
				aClass211_1.anIntArray343[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt10074 -= 2;
				local175 = anIntArray584[anInt10074];
				local776 = anIntArray584[anInt10074 + 1];
				aClass211_1.anIntArray343[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt10074 -= 3;
				local175 = anIntArray584[anInt10074];
				local776 = anIntArray584[anInt10074 + 1];
				local97 = anIntArray584[anInt10074 + 2];
				@Pc(1448) Class3_Sub7_Sub8 local1448 = Static212.aClass294_3.method6455(local175);
				if (local1448.method3047(local776).anInt9450 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray584[anInt10074++] = local1448.method3056(local776, local97);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray51[--anInt10073];
				local1496 = anIntArray584[--anInt10074] == 1;
				Static493.method6637(local1496, local83);
				anIntArray584[anInt10074++] = Static121.anInt2822;
				return;
			}
			if (arg0 == 5072) {
				if (Static214.aShortArray72 != null && Static495.anInt8603 < Static121.anInt2822) {
					anIntArray584[anInt10074++] = Static214.aShortArray72[Static495.anInt8603++] & 0xFFFF;
					return;
				}
				anIntArray584[anInt10074++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static495.anInt8603 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static446.aClass237_1.method5292(86)) {
					anIntArray584[anInt10074++] = 1;
					return;
				}
				anIntArray584[anInt10074++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static446.aClass237_1.method5292(82)) {
					anIntArray584[anInt10074++] = 1;
					return;
				}
				anIntArray584[anInt10074++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static446.aClass237_1.method5292(81)) {
					anIntArray584[anInt10074++] = 1;
					return;
				}
				anIntArray584[anInt10074++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static256.method3984(anIntArray584[--anInt10074]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray584[anInt10074++] = Static146.method2779();
					return;
				}
				if (arg0 == 5205) {
					Static92.method1986(false, anIntArray584[--anInt10074], -1, -1);
					return;
				}
				@Pc(1696) Class3_Sub7_Sub1 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray584[--anInt10074];
					local1696 = Static157.method2239(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray584[anInt10074++] = -1;
						return;
					}
					anIntArray584[anInt10074++] = local1696.anInt351;
					return;
				}
				@Pc(1729) Class3_Sub7_Sub1 local1729;
				if (arg0 == 5207) {
					local1729 = Static157.method2250(anIntArray584[--anInt10074]);
					if (local1729 != null && local1729.aString20 != null) {
						aStringArray51[anInt10073++] = local1729.aString20;
						return;
					}
					aStringArray51[anInt10073++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray584[anInt10074++] = Static454.anInt7940;
					anIntArray584[anInt10074++] = Static228.anInt4656;
					return;
				}
				if (arg0 == 5209) {
					anIntArray584[anInt10074++] = Static79.anInt2117 + Static157.anInt2670;
					anIntArray584[anInt10074++] = Static461.anInt8061 + Static157.anInt2671;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray584[--anInt10074];
					local1696 = Static157.method2250(local175);
					if (local1696 == null) {
						anIntArray584[anInt10074++] = 0;
						anIntArray584[anInt10074++] = 0;
						return;
					}
					anIntArray584[anInt10074++] = local1696.anInt359 >> 14 & 0x3FFF;
					anIntArray584[anInt10074++] = local1696.anInt359 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray584[--anInt10074];
					local1696 = Static157.method2250(local175);
					if (local1696 == null) {
						anIntArray584[anInt10074++] = 0;
						anIntArray584[anInt10074++] = 0;
						return;
					}
					anIntArray584[anInt10074++] = local1696.anInt360 - local1696.anInt361;
					anIntArray584[anInt10074++] = local1696.anInt362 - local1696.anInt366;
					return;
				}
				@Pc(1919) Class3_Sub33 local1919;
				if (arg0 == 5212) {
					local1919 = Static588.method8017();
					if (local1919 == null) {
						anIntArray584[anInt10074++] = -1;
						anIntArray584[anInt10074++] = -1;
						return;
					}
					anIntArray584[anInt10074++] = local1919.anInt5496;
					local776 = local1919.anInt5492 << 28 | local1919.anInt5494 + Static157.anInt2670 << 14 | local1919.anInt5495 + Static157.anInt2671;
					anIntArray584[anInt10074++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static56.method1375();
					if (local1919 == null) {
						anIntArray584[anInt10074++] = -1;
						anIntArray584[anInt10074++] = -1;
						return;
					}
					anIntArray584[anInt10074++] = local1919.anInt5496;
					local776 = local1919.anInt5492 << 28 | local1919.anInt5494 + Static157.anInt2670 << 14 | local1919.anInt5495 + Static157.anInt2671;
					anIntArray584[anInt10074++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray584[--anInt10074];
					local1696 = Static109.method2205();
					if (local1696 != null) {
						local2067 = local1696.method330(local175 >> 14 & 0x3FFF, anIntArray585, local175 & 0x3FFF, local175 >> 28 & 0x3);
						if (local2067) {
							Static405.method5722(anIntArray585[1], anIntArray585[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt10074 -= 2;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					@Pc(2105) Class49 local2105 = Static157.method2241(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class3_Sub7_Sub1 local2112 = (Class3_Sub7_Sub1) local2105.method1448(); local2112 != null; local2112 = (Class3_Sub7_Sub1) local2105.method1451()) {
						if (local2112.anInt351 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray584[anInt10074++] = 1;
						return;
					}
					anIntArray584[anInt10074++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray584[--anInt10074];
					local1696 = Static157.method2250(local175);
					if (local1696 == null) {
						anIntArray584[anInt10074++] = -1;
						return;
					}
					anIntArray584[anInt10074++] = local1696.anInt356;
					return;
				}
				if (arg0 == 5220) {
					anIntArray584[anInt10074++] = Static111.anInt2675 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray584[--anInt10074];
					Static405.method5722(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static109.method2205();
					if (local1729 != null) {
						local1496 = local1729.method328(Static79.anInt2117 + Static157.anInt2670, anIntArray585, Static461.anInt8061 + Static157.anInt2671);
						if (local1496) {
							anIntArray584[anInt10074++] = anIntArray585[1];
							anIntArray584[anInt10074++] = anIntArray585[2];
							return;
						}
						anIntArray584[anInt10074++] = -1;
						anIntArray584[anInt10074++] = -1;
						return;
					}
					anIntArray584[anInt10074++] = -1;
					anIntArray584[anInt10074++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt10074 -= 2;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					Static92.method1986(false, local175, local776 >> 14 & 0x3FFF, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray584[--anInt10074];
					local1696 = Static109.method2205();
					if (local1696 != null) {
						local2067 = local1696.method330(local175 >> 14 & 0x3FFF, anIntArray585, local175 & 0x3FFF, local175 >> 28 & 0x3);
						if (local2067) {
							anIntArray584[anInt10074++] = anIntArray585[1];
							anIntArray584[anInt10074++] = anIntArray585[2];
							return;
						}
						anIntArray584[anInt10074++] = -1;
						anIntArray584[anInt10074++] = -1;
						return;
					}
					anIntArray584[anInt10074++] = -1;
					anIntArray584[anInt10074++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray584[--anInt10074];
					local1696 = Static109.method2205();
					if (local1696 != null) {
						local2067 = local1696.method328(local175 >> 14 & 0x3FFF, anIntArray585, local175 & 0x3FFF);
						if (local2067) {
							anIntArray584[anInt10074++] = anIntArray585[1];
							anIntArray584[anInt10074++] = anIntArray585[2];
							return;
						}
						anIntArray584[anInt10074++] = -1;
						anIntArray584[anInt10074++] = -1;
						return;
					}
					anIntArray584[anInt10074++] = -1;
					anIntArray584[anInt10074++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static73.method5998(anIntArray584[--anInt10074]);
					return;
				}
				if (arg0 == 5227) {
					anInt10074 -= 2;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					Static92.method1986(true, local175, local776 >> 14 & 0x3FFF, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static225.aBoolean295 = anIntArray584[--anInt10074] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray584[anInt10074++] = Static225.aBoolean295 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray584[--anInt10074];
					Static571.method7719(local175);
					return;
				}
				@Pc(2625) Class3 local2625;
				if (arg0 == 5231) {
					anInt10074 -= 2;
					local175 = anIntArray584[anInt10074];
					local1496 = anIntArray584[anInt10074 + 1] == 1;
					if (Static404.aClass297_30 != null) {
						local2625 = Static404.aClass297_30.method6531((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8128();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class3();
							Static404.aClass297_30.method6537((long) local175, local2625);
						}
					}
					return;
				}
				@Pc(2667) Class3 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray584[--anInt10074];
					if (Static404.aClass297_30 != null) {
						local2667 = Static404.aClass297_30.method6531((long) local175);
						anIntArray584[anInt10074++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray584[anInt10074++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt10074 -= 2;
					local175 = anIntArray584[anInt10074];
					local1496 = anIntArray584[anInt10074 + 1] == 1;
					if (Static151.aClass297_12 != null) {
						local2625 = Static151.aClass297_12.method6531((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8128();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class3();
							Static151.aClass297_12.method6537((long) local175, local2625);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray584[--anInt10074];
					if (Static151.aClass297_12 != null) {
						local2667 = Static151.aClass297_12.method6531((long) local175);
						anIntArray584[anInt10074++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray584[anInt10074++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray584[anInt10074++] = Static157.aClass3_Sub7_Sub1_3 == null ? -1 : Static157.aClass3_Sub7_Sub1_3.anInt351;
					return;
				}
				if (arg0 == 5236) {
					anInt10074 -= 2;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static23.method224(local103, local97, local175);
					if (local2833 < 0) {
						anIntArray584[anInt10074++] = -1;
						return;
					}
					anIntArray584[anInt10074++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static346.method5018();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt10074 -= 2;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					Static276.method4180(false, local175, 3, local776);
					anIntArray584[anInt10074++] = Static178.aFrame3 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static178.aFrame3 != null) {
						Static276.method4180(false, -1, Static348.aClass3_Sub51_Sub1_5.anInt9953, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2917) Class136[] local2917 = Static532.method7296();
					anIntArray584[anInt10074++] = local2917.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray584[--anInt10074];
					@Pc(2941) Class136[] local2941 = Static532.method7296();
					anIntArray584[anInt10074++] = local2941[local175].anInt4494;
					anIntArray584[anInt10074++] = local2941[local175].anInt4491;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static348.aClass3_Sub51_Sub1_5.anInt9970;
					local776 = Static348.aClass3_Sub51_Sub1_5.anInt9947;
					local97 = -1;
					@Pc(2978) Class136[] local2978 = Static532.method7296();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class136 local2985 = local2978[local2833];
						if (local2985.anInt4494 == local175 && local2985.anInt4491 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray584[anInt10074++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray584[anInt10074++] = Static534.method7318();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray584[--anInt10074];
					if (local175 >= 1 && local175 <= 2) {
						Static276.method4180(false, -1, local175, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9953;
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray584[--anInt10074];
					if (local175 >= 1 && local175 <= 2) {
						Static348.aClass3_Sub51_Sub1_5.anInt9953 = local175;
						Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt10073 -= 2;
					local83 = aStringArray51[anInt10073];
					local89 = aStringArray51[anInt10073 + 1];
					local97 = anIntArray584[--anInt10074];
					@Pc(3124) Class3_Sub10 local3124 = Static129.method2403(Static452.aClass353_2, Static590.aClass287_149);
					local3124.aClass3_Sub26_Sub1_1.method6809(Static158.method2898(local83) + Static158.method2898(local89) + 1);
					local3124.aClass3_Sub26_Sub1_1.method6772(local83);
					local3124.aClass3_Sub26_Sub1_1.method6772(local89);
					local3124.aClass3_Sub26_Sub1_1.method6809(local97);
					Static193.method3398(local3124);
					return;
				}
				if (arg0 == 5401) {
					anInt10074 -= 2;
					Static309.aShortArray77[anIntArray584[anInt10074]] = (short) Static411.method5772(anIntArray584[anInt10074 + 1]);
					Static272.aClass121_2.method3318();
					Static272.aClass121_2.method3323();
					Static181.aClass60_1.method1801();
					Static246.method3899();
					return;
				}
				if (arg0 == 5405) {
					anInt10074 -= 2;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static276.anIntArrayArrayArray10[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt10074 -= 7;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1] << 1;
					local97 = anIntArray584[anInt10074 + 2];
					local103 = anIntArray584[anInt10074 + 3];
					local2833 = anIntArray584[anInt10074 + 4];
					@Pc(3262) int local3262 = anIntArray584[anInt10074 + 5];
					@Pc(3268) int local3268 = anIntArray584[anInt10074 + 6];
					if (local175 >= 0 && local175 < 2 && Static276.anIntArrayArrayArray10[local175] != null && local776 >= 0 && local776 < Static276.anIntArrayArrayArray10[local175].length) {
						Static276.anIntArrayArrayArray10[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3268 };
						Static276.anIntArrayArrayArray10[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3262 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static276.anIntArrayArrayArray10[anIntArray584[--anInt10074]].length >> 1;
					anIntArray584[anInt10074++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static178.aFrame3 != null) {
						Static276.method4180(false, -1, Static348.aClass3_Sub51_Sub1_5.anInt9953, -1);
					}
					if (Static302.aFrame2 != null) {
						Static176.method3157();
						System.exit(0);
						return;
					}
					local83 = Static371.aString169 == null ? Static350.method5026() : Static371.aString169;
					Static466.method6370(Static467.aClass168_12, Static37.anInt1122 == 1, local83, false);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static400.aClass309_8 != null) {
						if (Static400.aClass309_8.anObject15 == null) {
							local83 = Static17.method6928(Static400.aClass309_8.anInt8653);
						} else {
							local83 = (String) Static400.aClass309_8.anObject15;
						}
					}
					aStringArray51[anInt10073++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray584[anInt10074++] = Static467.aClass168_12.aBoolean334 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static178.aFrame3 != null) {
						Static276.method4180(false, -1, Static348.aClass3_Sub51_Sub1_5.anInt9953, -1);
					}
					local83 = aStringArray51[--anInt10073];
					local1496 = anIntArray584[--anInt10074] == 1;
					local181 = Static350.method5026() + local83;
					Static466.method6370(Static467.aClass168_12, Static37.anInt1122 == 1, local181, local1496);
					return;
				}
				if (arg0 == 5422) {
					anInt10073 -= 2;
					local83 = aStringArray51[anInt10073];
					local89 = aStringArray51[anInt10073 + 1];
					local97 = anIntArray584[--anInt10074];
					if (local83.length() > 0) {
						if (Static378.aStringArray31 == null) {
							Static378.aStringArray31 = new String[Static477.anIntArray489[Static31.aClass89_1.anInt2860]];
						}
						Static378.aStringArray31[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static497.aStringArray42 == null) {
							Static497.aStringArray42 = new String[Static477.anIntArray489[Static31.aClass89_1.anInt2860]];
						}
						Static497.aStringArray42[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray51[--anInt10073]);
					return;
				}
				if (arg0 == 5424) {
					anInt10074 -= 11;
					Static551.anInt9636 = anIntArray584[anInt10074];
					Static404.anInt7297 = anIntArray584[anInt10074 + 1];
					Static435.anInt7685 = anIntArray584[anInt10074 + 2];
					Static78.anInt4061 = anIntArray584[anInt10074 + 3];
					Static448.anInt10224 = anIntArray584[anInt10074 + 4];
					Static27.anInt302 = anIntArray584[anInt10074 + 5];
					Static322.anInt5884 = anIntArray584[anInt10074 + 6];
					Static72.anInt1991 = anIntArray584[anInt10074 + 7];
					Static551.anInt9633 = anIntArray584[anInt10074 + 8];
					Static155.anInt3521 = anIntArray584[anInt10074 + 9];
					Static487.anInt8411 = anIntArray584[anInt10074 + 10];
					Static194.aClass284_60.method6347(Static448.anInt10224);
					Static194.aClass284_60.method6347(Static27.anInt302);
					Static194.aClass284_60.method6347(Static322.anInt5884);
					Static194.aClass284_60.method6347(Static72.anInt1991);
					Static194.aClass284_60.method6347(Static551.anInt9633);
					Static51.aClass73_33 = null;
					Static115.aClass73_5 = null;
					Static355.aClass73_34 = null;
					Static127.aClass73_8 = null;
					Static227.aClass73_16 = null;
					Static172.aClass73_14 = null;
					Static118.aClass73_7 = null;
					Static492.aClass73_38 = null;
					Static582.aBoolean697 = true;
					return;
				}
				if (arg0 == 5425) {
					Static308.method4619();
					Static582.aBoolean697 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt10074 -= 2;
					Static211.anInt8483 = anIntArray584[anInt10074];
					Static473.anInt8220 = anIntArray584[anInt10074 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt10074 -= 2;
					Static496.anInt8607 = anIntArray584[anInt10074 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt10074 -= 2;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					anIntArray584[anInt10074++] = Static288.method4327(local776, local175) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static513.method6930(false, aStringArray51[--anInt10073], false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static600.method2906("accountcreated", Static304.anApplet1);
						return;
					} catch (@Pc(3800) Throwable local3800) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static600.method2906("accountcreatestarted", Static304.anApplet1);
						return;
					} catch (@Pc(3811) Throwable local3811) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static454.aClipboard1 != null) {
						@Pc(3823) Transferable local3823 = Static454.aClipboard1.getContents(null);
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
					aStringArray51[anInt10073++] = local83;
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt10074 -= 4;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					local97 = anIntArray584[anInt10074 + 2];
					local103 = anIntArray584[anInt10074 + 3];
					Static43.method1111((local175 >> 14 & 0x3FFF) - Static321.anInt5874, false, (local175 & 0x3FFF) - Static137.anInt3293, local776 << 2, local97, local103);
					return;
				}
				if (arg0 == 5501) {
					anInt10074 -= 4;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					local97 = anIntArray584[anInt10074 + 2];
					local103 = anIntArray584[anInt10074 + 3];
					Static8.method71((local175 & 0x3FFF) - Static137.anInt3293, (local175 >> 14 & 0x3FFF) - Static321.anInt5874, local776 << 2, local103, local97);
					return;
				}
				if (arg0 == 5502) {
					anInt10074 -= 6;
					local175 = anIntArray584[anInt10074];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static138.anInt3344 = local175;
					local776 = anIntArray584[anInt10074 + 1];
					if (local776 + 1 >= Static276.anIntArrayArrayArray10[Static138.anInt3344].length >> 1) {
						throw new RuntimeException();
					}
					Static230.anInt4673 = local776;
					Static358.anInt6359 = 0;
					Static57.anInt1531 = anIntArray584[anInt10074 + 2];
					Static560.anInt9756 = anIntArray584[anInt10074 + 3];
					local97 = anIntArray584[anInt10074 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static127.anInt2897 = local97;
					local103 = anIntArray584[anInt10074 + 5];
					if (local103 + 1 >= Static276.anIntArrayArrayArray10[Static127.anInt2897].length >> 1) {
						throw new RuntimeException();
					}
					Static511.anInt8808 = local103;
					Static188.anInt4080 = 3;
					Static481.anInt8356 = -1;
					Static357.anInt6345 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static446.method6190();
					return;
				}
				if (arg0 == 5504) {
					anInt10074 -= 2;
					Static289.method4333(anIntArray584[anInt10074 + 1], anIntArray584[anInt10074]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray584[anInt10074++] = (int) Static123.aFloat75 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray584[anInt10074++] = (int) Static209.aFloat229 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static340.method4967();
					return;
				}
				if (arg0 == 5508) {
					Static326.method4810();
					return;
				}
				if (arg0 == 5509) {
					Static61.method1509();
					return;
				}
				if (arg0 == 5510) {
					Static400.method5610();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray584[--anInt10074];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static321.anInt5874;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static345.anInt6228) {
						local776 = Static345.anInt6228;
					}
					local97 -= Static137.anInt3293;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static535.anInt9341) {
						local97 = Static535.anInt9341;
					}
					Static357.anInt6340 = (local776 << 9) + 256;
					Static372.anInt6492 = (local97 << 9) + 256;
					Static188.anInt4080 = 4;
					Static481.anInt8356 = -1;
					Static357.anInt6345 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static503.method6753();
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray584[--anInt10074];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static321.anInt5874;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static345.anInt6228) {
							local776 = Static345.anInt6228;
						}
						local97 -= Static137.anInt3293;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static535.anInt9341) {
							local97 = Static535.anInt9341;
						}
						Static357.anInt6345 = (local776 << 9) + 256;
						Static481.anInt8356 = (local97 << 9) + 256;
						return;
					}
					Static357.anInt6345 = -1;
					Static481.anInt8356 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt10073 -= 2;
					local83 = aStringArray51[anInt10073];
					local89 = aStringArray51[anInt10073 + 1];
					local97 = anIntArray584[--anInt10074];
					if (Static409.anInt1461 != 3) {
						return;
					}
					if (Static340.anInt6133 == 0 && Static318.anInt5854 == 0) {
						Static422.aString202 = local83;
						Static525.aString237 = local89;
						Static314.anInt5779 = local97;
						Static27.method293(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static264.method4044();
					return;
				}
				if (arg0 == 5602) {
					if (Static340.anInt6133 == 0) {
						Static579.anInt10037 = -2;
						Static181.anInt3977 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt10074 -= 4;
					if (Static409.anInt1461 != 3) {
						return;
					}
					if (Static340.anInt6133 == 0 && Static318.anInt5854 == 0) {
						Static371.method5235(anIntArray584[anInt10074], anIntArray584[anInt10074 + 3], anIntArray584[anInt10074 + 2], anIntArray584[anInt10074 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt10073--;
					if (Static409.anInt1461 != 3) {
						return;
					}
					if (Static340.anInt6133 == 0 && Static318.anInt5854 == 0) {
						Static220.method3680(Static68.method1648(aStringArray51[anInt10073]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt10073 -= 2;
					if (Static409.anInt1461 != 3) {
						return;
					}
					if (Static340.anInt6133 == 0 && Static318.anInt5854 == 0) {
						Static189.method3321(false, Static68.method1648(aStringArray51[anInt10073]), aStringArray51[anInt10073 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static318.anInt5854 == 0) {
						Static36.anInt1076 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray584[anInt10074++] = Static181.anInt3977;
					return;
				}
				if (arg0 == 5608) {
					anIntArray584[anInt10074++] = Static536.anInt9351;
					return;
				}
				if (arg0 == 5609) {
					anIntArray584[anInt10074++] = Static36.anInt1076;
					return;
				}
				if (arg0 == 5610) {
					for (local175 = 0; local175 < 5; local175++) {
						aStringArray51[anInt10073++] = Static328.aStringArray27 == null || Static328.aStringArray27.length <= local175 ? "" : Static461.method6345(Static328.aStringArray27[local175]);
					}
					Static328.aStringArray27 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray584[anInt10074++] = Static348.anInt3837;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray584[--anInt10074];
					if (Static409.anInt1461 != 7) {
						return;
					}
					if (Static340.anInt6133 == 0 && Static318.anInt5854 == 0) {
						if (Static451.aClass223_6 != null) {
							Static451.aClass223_6.method5105();
							Static451.aClass223_6 = null;
						}
						Static314.anInt5779 = local175;
						Static27.method293(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray584[anInt10074++] = Static181.anInt3977;
					return;
				}
				if (arg0 == 5615) {
					anInt10073 -= 2;
					local83 = aStringArray51[anInt10073];
					local89 = aStringArray51[anInt10073 + 1];
					if (Static409.anInt1461 != 3) {
						return;
					}
					if (Static340.anInt6133 == 0 && Static318.anInt5854 == 0) {
						if (Static451.aClass223_6 != null) {
							Static451.aClass223_6.method5105();
							Static451.aClass223_6 = null;
						}
						Static422.aString202 = local83;
						Static525.aString237 = local89;
						Static27.method293(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static218.method6807(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray584[anInt10074++] = Static579.anInt10037;
					return;
				}
				if (arg0 == 5618) {
					local175 = anIntArray584[--anInt10074];
					Static360.method8011(false, local175);
					return;
				}
				if (arg0 == 5619) {
					local175 = anIntArray584[--anInt10074];
					Static360.method8011(true, local175);
					return;
				}
				if (arg0 == 5620) {
					Static78.method3300();
					if (Static223.aString111 != "" && Static223.aString111 != "") {
						anIntArray584[anInt10074++] = 1;
						return;
					}
					anIntArray584[anInt10074++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt10073 -= 2;
					if (Static409.anInt1461 != 3) {
						return;
					}
					if (Static340.anInt6133 == 0 && Static318.anInt5854 == 0) {
						Static189.method3321(true, Static68.method1648(aStringArray51[anInt10073]), aStringArray51[anInt10073 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4719) Class309 local4719 = Static467.aClass168_12.method4080("3", false);
					while (local4719.anInt8650 == 0) {
						Static373.method5240(1L);
					}
					if (local4719.anInt8650 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4739) Class272 local4739 = (Class272) local4719.anObject15;
					if (local4739.method6174().exists()) {
						@Pc(4749) Class3_Sub26 local4749 = new Class3_Sub26(50);
						try {
							local4739.method6170(local4749.aByteArray213, 0, 50);
						} catch (@Pc(4758) IOException local4758) {
						}
					}
					try {
						local4739.method6172();
						return;
					} catch (@Pc(4764) Exception local4764) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static148.aString76 != null) {
						anIntArray584[anInt10074++] = 1;
						return;
					}
					anIntArray584[anInt10074++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray584[anInt10074++] = (int) (Static182.aLong91 >> 32);
					anIntArray584[anInt10074++] = (int) (Static182.aLong91 & 0xFFFFL);
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray584[--anInt10074];
					if (local175 < 1) {
						local175 = 1;
					}
					if (local175 > 4) {
						local175 = 4;
					}
					Static348.aClass3_Sub51_Sub1_5.anInt9950 = local175;
					Static393.method5569();
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6002) {
					Static348.aClass3_Sub51_Sub1_5.method7849(anIntArray584[--anInt10074] == 1);
					Static393.method5569();
					Static418.method5824();
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6003) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean671 = anIntArray584[--anInt10074] == 1;
					Static418.method5824();
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6005) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean682 = anIntArray584[--anInt10074] == 1;
					Static393.method5569();
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6006) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean679 = anIntArray584[--anInt10074] == 1;
					Static319.aClass31_11.method8045(!Static348.aClass3_Sub51_Sub1_5.aBoolean679);
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6007) {
					Static348.aClass3_Sub51_Sub1_5.anInt9943 = anIntArray584[--anInt10074];
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6008) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean673 = anIntArray584[--anInt10074] == 1;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6009) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean680 = anIntArray584[--anInt10074] == 1;
					Static393.method5569();
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6010) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean684 = anIntArray584[--anInt10074] == 1;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6011) {
					local175 = anIntArray584[--anInt10074];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static348.aClass3_Sub51_Sub1_5.method7828(Static37.anInt1122, local175);
					Static393.method5569();
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6012) {
					Static348.aClass3_Sub51_Sub1_5.method7821(Static37.anInt1122, anIntArray584[--anInt10074] == 1);
					Static564.method7698();
					Static38.method1056();
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6014) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean674 = anIntArray584[--anInt10074] == 1;
					Static393.method5569();
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6015) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean670 = anIntArray584[--anInt10074] == 1;
					Static393.method5569();
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6016) {
					local175 = anIntArray584[--anInt10074];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static348.aClass3_Sub51_Sub1_5.anInt9941 = local175;
					Static47.method1180(Static37.anInt1122);
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					return;
				}
				if (arg0 == 6017) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean676 = anIntArray584[--anInt10074] == 1;
					Static499.method4578();
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6018) {
					local175 = anIntArray584[--anInt10074];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static348.aClass3_Sub51_Sub1_5.anInt9949 = local175;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray584[--anInt10074];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static348.aClass3_Sub51_Sub1_5.anInt9952) {
						if (Static348.aClass3_Sub51_Sub1_5.anInt9952 == 0 && Static526.anInt9227 != -1) {
							Static293.method4412(Static320.aClass284_98, local175, Static526.anInt9227);
							Static115.method2284();
							Static168.aBoolean262 = false;
						} else if (local175 == 0) {
							Static235.method3766();
							Static168.aBoolean262 = false;
						} else {
							Static16.method165(local175);
						}
						Static348.aClass3_Sub51_Sub1_5.anInt9952 = local175;
					}
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6020) {
					local175 = anIntArray584[--anInt10074];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static348.aClass3_Sub51_Sub1_5.anInt9942 = local175;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6021) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean688 = anIntArray584[--anInt10074] == 1;
					Static418.method5824();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray584[--anInt10074];
					local1496 = false;
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 2) {
						local175 = 2;
					}
					if (Static372.anInt6489 < 96) {
						local175 = 0;
						local1496 = true;
					}
					Static476.method6516(local175);
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					anIntArray584[anInt10074++] = local1496 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local175 = anIntArray584[--anInt10074];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static348.aClass3_Sub51_Sub1_5.anInt9961 = local175;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					return;
				}
				if (arg0 == 6025) {
					local175 = anIntArray584[--anInt10074];
					if (local175 < 0 || local175 > Static275.method4163(Static372.anInt6489)) {
						local175 = 0;
					}
					Static348.aClass3_Sub51_Sub1_5.anInt9946 = local175;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray584[--anInt10074];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static566.method7707(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean672 = anIntArray584[--anInt10074] != 0;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					return;
				}
				if (arg0 == 6029) {
					Static348.aClass3_Sub51_Sub1_5.anInt9943 = anIntArray584[--anInt10074];
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					return;
				}
				if (arg0 == 6030) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean685 = anIntArray584[--anInt10074] != 0;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static393.method5569();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray584[--anInt10074];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static47.method1180(local175);
					return;
				}
				if (arg0 == 6032) {
					local175 = anIntArray584[--anInt10074];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static348.aClass3_Sub51_Sub1_5.anInt9955 = local175;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6033) {
					local175 = anIntArray584[--anInt10074];
					if (local175 < 0 || local175 > 4) {
						local175 = 2;
					}
					Static348.aClass3_Sub51_Sub1_5.anInt9944 = local175;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					return;
				}
				if (arg0 == 6034) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean678 = anIntArray584[--anInt10074] == 1;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static564.method7698();
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6035) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean691 = anIntArray584[--anInt10074] == 1;
					Static393.method5569();
					Static418.method5824();
					return;
				}
				if (arg0 == 6036) {
					local175 = anIntArray584[--anInt10074];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static348.aClass3_Sub51_Sub1_5.method7845(local175);
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					return;
				}
				if (arg0 == 6037) {
					local175 = anIntArray584[--anInt10074];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static348.aClass3_Sub51_Sub1_5.anInt9958 = local175;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray584[--anInt10074];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static348.aClass3_Sub51_Sub1_5.anInt9951 && Static526.anInt9227 == Static444.anInt7877) {
						if (Static348.aClass3_Sub51_Sub1_5.anInt9951 == 0) {
							Static293.method4412(Static320.aClass284_98, local175, Static526.anInt9227);
							Static115.method2284();
							Static168.aBoolean262 = false;
						} else if (local175 == 0) {
							Static235.method3766();
							Static168.aBoolean262 = false;
						} else {
							Static16.method165(local175);
						}
					}
					Static348.aClass3_Sub51_Sub1_5.anInt9951 = local175;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray584[--anInt10074];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static348.aClass3_Sub51_Sub1_5.anInt9964) {
						Static348.aClass3_Sub51_Sub1_5.anInt9964 = local175;
						Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
						Static67.aBoolean133 = false;
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9950;
					return;
				}
				if (arg0 == 6102) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.method7848(Static37.anInt1122) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.aBoolean671 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.aBoolean682 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.aBoolean679 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9943;
					return;
				}
				if (arg0 == 6108) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.aBoolean673 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.aBoolean680 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.aBoolean684 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.method7830(Static37.anInt1122);
					return;
				}
				if (arg0 == 6112) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.method7824(Static37.anInt1122) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.aBoolean674 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.aBoolean670 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9941;
					return;
				}
				if (arg0 == 6117) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.aBoolean676 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9949;
					return;
				}
				if (arg0 == 6119) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9952;
					return;
				}
				if (arg0 == 6120) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9942;
					return;
				}
				if (arg0 == 6121) {
					anIntArray584[anInt10074++] = Static319.aClass31_11.method8066() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray584[anInt10074++] = Static79.method1840();
					return;
				}
				if (arg0 == 6124) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9961;
					return;
				}
				if (arg0 == 6125) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9946;
					return;
				}
				if (arg0 == 6126) {
					anIntArray584[anInt10074++] = Static319.aClass31_11.method8047() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.aBoolean686 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.aBoolean672 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9943;
					return;
				}
				if (arg0 == 6130) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.aBoolean685 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray584[anInt10074++] = Static37.anInt1122;
					return;
				}
				if (arg0 == 6132) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9955;
					return;
				}
				if (arg0 == 6133) {
					anIntArray584[anInt10074++] = Static467.aClass168_12.aBoolean334 && !Static467.aClass168_12.aBoolean335 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray584[anInt10074++] = Static275.method4163(Static372.anInt6489);
					return;
				}
				if (arg0 == 6135) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9944;
					return;
				}
				if (arg0 == 6136) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.aBoolean678 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6356) boolean local6356 = true;
					try {
						local6356 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6366) Throwable local6366) {
					}
					anIntArray584[anInt10074++] = local6356 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray584[anInt10074++] = Static188.method3311(Static37.anInt1122, 200);
					return;
				}
				if (arg0 == 6139) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.method7834(Static37.anInt1122);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6414) byte local6414 = 0;
					if (Static461.method6346(Static37.anInt1122) && Static372.anInt6489 < 96) {
						local6414 = 1;
					}
					anIntArray584[anInt10074++] = local6414;
					return;
				}
				if (arg0 == 6141) {
					if (Static372.anInt6489 < 96) {
						anIntArray584[anInt10074++] = 0;
						return;
					}
					anIntArray584[anInt10074++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9958;
					return;
				}
				if (arg0 == 6143) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9951;
					return;
				}
				if (arg0 == 6144) {
					anIntArray584[anInt10074++] = Static551.aBoolean634 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9964;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt10074 -= 2;
					Static47.aShort17 = (short) anIntArray584[anInt10074];
					if (Static47.aShort17 <= 0) {
						Static47.aShort17 = 256;
					}
					Static270.aShort60 = (short) anIntArray584[anInt10074 + 1];
					if (Static270.aShort60 <= 0) {
						Static270.aShort60 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt10074 -= 2;
					Static235.aShort55 = (short) anIntArray584[anInt10074];
					if (Static235.aShort55 <= 0) {
						Static235.aShort55 = 256;
					}
					Static129.aShort36 = (short) anIntArray584[anInt10074 + 1];
					if (Static129.aShort36 <= 0) {
						Static129.aShort36 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt10074 -= 4;
					Static277.aShort67 = (short) anIntArray584[anInt10074];
					if (Static277.aShort67 <= 0) {
						Static277.aShort67 = 1;
					}
					Static483.aShort105 = (short) anIntArray584[anInt10074 + 1];
					if (Static483.aShort105 <= 0) {
						Static483.aShort105 = 32767;
					} else if (Static483.aShort105 < Static277.aShort67) {
						Static483.aShort105 = Static277.aShort67;
					}
					Static68.aShort20 = (short) anIntArray584[anInt10074 + 2];
					if (Static68.aShort20 <= 0) {
						Static68.aShort20 = 1;
					}
					Static168.aShort46 = (short) anIntArray584[anInt10074 + 3];
					if (Static168.aShort46 <= 0) {
						Static168.aShort46 = 32767;
						return;
					}
					if (Static168.aShort46 < Static68.aShort20) {
						Static168.aShort46 = Static68.aShort20;
					}
					return;
				}
				if (arg0 == 6203) {
					Static591.method8124(0, false, Static160.aClass251_4.anInt7285, 0, Static160.aClass251_4.anInt7215);
					anIntArray584[anInt10074++] = Static302.anInt1927;
					anIntArray584[anInt10074++] = Static409.anInt1458;
					return;
				}
				if (arg0 == 6204) {
					anIntArray584[anInt10074++] = Static235.aShort55;
					anIntArray584[anInt10074++] = Static129.aShort36;
					return;
				}
				if (arg0 == 6205) {
					anIntArray584[anInt10074++] = Static47.aShort17;
					anIntArray584[anInt10074++] = Static270.aShort60;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray584[anInt10074++] = (int) (Static96.method2000() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray584[anInt10074++] = (int) (Static96.method2000() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt10074 -= 3;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					local97 = anIntArray584[anInt10074 + 2];
					aCalendar2.clear();
					aCalendar2.set(11, 12);
					aCalendar2.set(local97, local776, local175);
					local103 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray584[anInt10074++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar2.clear();
					aCalendar2.setTime(new Date(Static96.method2000()));
					anIntArray584[anInt10074++] = aCalendar2.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray584[--anInt10074];
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
					anIntArray584[anInt10074++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray584[anInt10074++] = Static215.method3594() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray584[anInt10074++] = Static567.method4397() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static409.anInt1461 == 7 && Static340.anInt6133 == 0 && Static318.anInt5854 == 0) {
						if (Static25.aBoolean17) {
							anIntArray584[anInt10074++] = 0;
							return;
						}
						if (Static358.aLong171 > Static96.method2000() - 1000L) {
							anIntArray584[anInt10074++] = 1;
							return;
						}
						Static25.aBoolean17 = true;
						local52 = Static129.method2403(Static452.aClass353_2, Static146.aClass287_53);
						local52.aClass3_Sub26_Sub1_1.method6826(Static410.anInt7373);
						Static193.method3398(local52);
						anIntArray584[anInt10074++] = 0;
						return;
					}
					anIntArray584[anInt10074++] = 1;
					return;
				}
				@Pc(7037) Class22 local7037;
				@Pc(7004) Class48_Sub1 local7004;
				if (arg0 == 6501) {
					local7004 = Static227.method3720();
					if (local7004 != null) {
						anIntArray584[anInt10074++] = local7004.anInt1533;
						anIntArray584[anInt10074++] = local7004.anInt1523;
						aStringArray51[anInt10073++] = local7004.aString31;
						local7037 = local7004.method1393();
						anIntArray584[anInt10074++] = local7037.anInt216;
						aStringArray51[anInt10073++] = local7037.aString11;
						anIntArray584[anInt10074++] = local7004.anInt1526;
						anIntArray584[anInt10074++] = local7004.anInt1536;
						aStringArray51[anInt10073++] = local7004.aString30;
						return;
					}
					anIntArray584[anInt10074++] = -1;
					anIntArray584[anInt10074++] = 0;
					aStringArray51[anInt10073++] = "";
					anIntArray584[anInt10074++] = 0;
					aStringArray51[anInt10073++] = "";
					anIntArray584[anInt10074++] = 0;
					anIntArray584[anInt10074++] = 0;
					aStringArray51[anInt10073++] = "";
					return;
				}
				if (arg0 == 6502) {
					local7004 = Static302.method1699();
					if (local7004 != null) {
						anIntArray584[anInt10074++] = local7004.anInt1533;
						anIntArray584[anInt10074++] = local7004.anInt1523;
						aStringArray51[anInt10073++] = local7004.aString31;
						local7037 = local7004.method1393();
						anIntArray584[anInt10074++] = local7037.anInt216;
						aStringArray51[anInt10073++] = local7037.aString11;
						anIntArray584[anInt10074++] = local7004.anInt1526;
						anIntArray584[anInt10074++] = local7004.anInt1536;
						aStringArray51[anInt10073++] = local7004.aString30;
						return;
					}
					anIntArray584[anInt10074++] = -1;
					anIntArray584[anInt10074++] = 0;
					aStringArray51[anInt10073++] = "";
					anIntArray584[anInt10074++] = 0;
					aStringArray51[anInt10073++] = "";
					anIntArray584[anInt10074++] = 0;
					anIntArray584[anInt10074++] = 0;
					aStringArray51[anInt10073++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray584[--anInt10074];
					local89 = aStringArray51[--anInt10073];
					if (Static409.anInt1461 == 7 && Static340.anInt6133 == 0 && Static318.anInt5854 == 0) {
						anIntArray584[anInt10074++] = Static110.method2208(local175, local89) ? 1 : 0;
						return;
					}
					anIntArray584[anInt10074++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static348.aClass3_Sub51_Sub1_5.anInt9968 = anIntArray584[--anInt10074];
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					return;
				}
				if (arg0 == 6505) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9968;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray584[--anInt10074];
					@Pc(7394) Class48_Sub1 local7394 = Static197.method3443(local175);
					if (local7394 != null) {
						anIntArray584[anInt10074++] = local7394.anInt1523;
						aStringArray51[anInt10073++] = local7394.aString31;
						@Pc(7418) Class22 local7418 = local7394.method1393();
						anIntArray584[anInt10074++] = local7418.anInt216;
						aStringArray51[anInt10073++] = local7418.aString11;
						anIntArray584[anInt10074++] = local7394.anInt1526;
						anIntArray584[anInt10074++] = local7394.anInt1536;
						aStringArray51[anInt10073++] = local7394.aString30;
						return;
					}
					anIntArray584[anInt10074++] = -1;
					aStringArray51[anInt10073++] = "";
					anIntArray584[anInt10074++] = 0;
					aStringArray51[anInt10073++] = "";
					anIntArray584[anInt10074++] = 0;
					anIntArray584[anInt10074++] = 0;
					aStringArray51[anInt10073++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt10074 -= 4;
					local175 = anIntArray584[anInt10074];
					local1496 = anIntArray584[anInt10074 + 1] == 1;
					local97 = anIntArray584[anInt10074 + 2];
					local2107 = anIntArray584[anInt10074 + 3] == 1;
					Static280.method4228(local1496, local97, local175, local2107);
					return;
				}
				if (arg0 == 6508) {
					Static458.method6306();
					return;
				}
				if (arg0 == 6509) {
					if (Static409.anInt1461 != 7) {
						return;
					}
					Static273.aBoolean345 = anIntArray584[--anInt10074] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray584[anInt10074++] = Static503.anInt8662;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static348.aClass3_Sub51_Sub1_5.aBoolean681 = anIntArray584[--anInt10074] == 1;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					return;
				}
				if (arg0 == 6601) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.aBoolean681 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static527.aClass153_147 == Static579.aClass153_145) {
				if (arg0 == 6700) {
					local175 = Static204.aClass297_16.method6528();
					if (Static79.anInt2118 != -1) {
						local175++;
					}
					anIntArray584[anInt10074++] = local175;
					return;
				}
				if (arg0 == 6701) {
					local175 = anIntArray584[--anInt10074];
					if (Static79.anInt2118 != -1) {
						if (local175 == 0) {
							anIntArray584[anInt10074++] = Static79.anInt2118;
							return;
						}
						local175--;
					}
					@Pc(7705) Class3_Sub49 local7705 = (Class3_Sub49) Static204.aClass297_16.method6529();
					while (local175-- > 0) {
						local7705 = (Class3_Sub49) Static204.aClass297_16.method6532();
					}
					anIntArray584[anInt10074++] = local7705.anInt9244;
					return;
				}
				if (arg0 == 6702) {
					local175 = anIntArray584[--anInt10074];
					if (Static449.aClass251ArrayArray1[local175] == null) {
						aStringArray51[anInt10073++] = "";
						return;
					}
					local89 = Static449.aClass251ArrayArray1[local175][0].aString186;
					if (local89 == null) {
						aStringArray51[anInt10073++] = "";
						return;
					}
					aStringArray51[anInt10073++] = local89.substring(0, local89.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local175 = anIntArray584[--anInt10074];
					if (Static449.aClass251ArrayArray1[local175] == null) {
						anIntArray584[anInt10074++] = 0;
						return;
					}
					anIntArray584[anInt10074++] = Static449.aClass251ArrayArray1[local175].length;
					return;
				}
				if (arg0 == 6704) {
					anInt10074 -= 2;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					if (Static449.aClass251ArrayArray1[local175] == null) {
						aStringArray51[anInt10073++] = "";
						return;
					}
					local181 = Static449.aClass251ArrayArray1[local175][local776].aString186;
					if (local181 == null) {
						aStringArray51[anInt10073++] = "";
						return;
					}
					aStringArray51[anInt10073++] = local181;
					return;
				}
				if (arg0 == 6705) {
					anInt10074 -= 2;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					if (Static449.aClass251ArrayArray1[local175] == null) {
						anIntArray584[anInt10074++] = 0;
						return;
					}
					anIntArray584[anInt10074++] = Static449.aClass251ArrayArray1[local175][local776].anInt7287;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt10074 -= 3;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					local97 = anIntArray584[anInt10074 + 2];
					Static53.method1328(local97, local175 << 16 | local776, "", 1);
					return;
				}
				if (arg0 == 6708) {
					anInt10074 -= 3;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					local97 = anIntArray584[anInt10074 + 2];
					Static53.method1328(local97, local175 << 16 | local776, "", 2);
					return;
				}
				if (arg0 == 6709) {
					anInt10074 -= 3;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					local97 = anIntArray584[anInt10074 + 2];
					Static53.method1328(local97, local175 << 16 | local776, "", 3);
					return;
				}
				if (arg0 == 6710) {
					anInt10074 -= 3;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					local97 = anIntArray584[anInt10074 + 2];
					Static53.method1328(local97, local175 << 16 | local776, "", 4);
					return;
				}
				if (arg0 == 6711) {
					anInt10074 -= 3;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					local97 = anIntArray584[anInt10074 + 2];
					Static53.method1328(local97, local175 << 16 | local776, "", 5);
					return;
				}
				if (arg0 == 6712) {
					anInt10074 -= 3;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					local97 = anIntArray584[anInt10074 + 2];
					Static53.method1328(local97, local175 << 16 | local776, "", 6);
					return;
				}
				if (arg0 == 6713) {
					anInt10074 -= 3;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					local97 = anIntArray584[anInt10074 + 2];
					Static53.method1328(local97, local175 << 16 | local776, "", 7);
					return;
				}
				if (arg0 == 6714) {
					anInt10074 -= 3;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					local97 = anIntArray584[anInt10074 + 2];
					Static53.method1328(local97, local175 << 16 | local776, "", 8);
					return;
				}
				if (arg0 == 6715) {
					anInt10074 -= 3;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					local97 = anIntArray584[anInt10074 + 2];
					Static53.method1328(local97, local175 << 16 | local776, "", 9);
					return;
				}
				if (arg0 == 6716) {
					anInt10074 -= 3;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					local97 = anIntArray584[anInt10074 + 2];
					Static53.method1328(local97, local175 << 16 | local776, "", 10);
					return;
				}
				if (arg0 == 6717) {
					anInt10074 -= 3;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					local97 = anIntArray584[anInt10074 + 2];
					@Pc(8293) Class251 local8293 = Static137.method2669(local175 << 16 | local776, local97);
					Static213.method3571();
					@Pc(8298) Class3_Sub24 local8298 = Static70.method1716(local8293);
					Static196.method3431(local8293, local8298.method3242(), local8298.anInt3989);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8326) Class338 local8326;
				if (arg0 == 6800) {
					local175 = anIntArray584[--anInt10074];
					local8326 = Static550.aClass189_3.method4642(local175);
					if (local8326.aString255 == null) {
						aStringArray51[anInt10073++] = "";
						return;
					}
					aStringArray51[anInt10073++] = local8326.aString255;
					return;
				}
				if (arg0 == 6801) {
					local175 = anIntArray584[--anInt10074];
					local8326 = Static550.aClass189_3.method4642(local175);
					anIntArray584[anInt10074++] = local8326.anInt9741;
					return;
				}
				if (arg0 == 6802) {
					local175 = anIntArray584[--anInt10074];
					local8326 = Static550.aClass189_3.method4642(local175);
					anIntArray584[anInt10074++] = local8326.anInt9742;
					return;
				}
				if (arg0 == 6803) {
					local175 = anIntArray584[--anInt10074];
					local8326 = Static550.aClass189_3.method4642(local175);
					anIntArray584[anInt10074++] = local8326.anInt9749;
					return;
				}
				if (arg0 == 6804) {
					anInt10074 -= 2;
					local175 = anIntArray584[anInt10074];
					local776 = anIntArray584[anInt10074 + 1];
					@Pc(8448) Class41 local8448 = Static106.aClass27_1.method483(local776);
					if (local8448.method1208()) {
						aStringArray51[anInt10073++] = Static550.aClass189_3.method4642(local175).method7660(local776, local8448.aString27);
						return;
					}
					anIntArray584[anInt10074++] = Static550.aClass189_3.method4642(local175).method7657(local776, local8448.anInt1311);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray584[anInt10074++] = Static402.aBoolean498 && !Static226.aBoolean296 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray584[anInt10074++] = Static566.anInt9803;
					return;
				}
				if (arg0 == 6902) {
					anIntArray584[anInt10074++] = Static341.anInt6146;
					return;
				}
				if (arg0 == 6903) {
					anIntArray584[anInt10074++] = Static167.anInt6675;
					return;
				}
				if (arg0 == 6904) {
					anIntArray584[anInt10074++] = Static546.anInt9536;
					return;
				}
				if (arg0 == 6905) {
					local83 = "";
					if (Static400.aClass309_8 != null) {
						if (Static400.aClass309_8.anObject15 == null) {
							local83 = Static17.method6928(Static400.aClass309_8.anInt8653);
						} else {
							local83 = (String) Static400.aClass309_8.anObject15;
						}
					}
					aStringArray51[anInt10073++] = local83;
					return;
				}
				if (arg0 == 6906) {
					anIntArray584[anInt10074++] = Static229.anInt4660;
					return;
				}
				if (arg0 == 6907) {
					anIntArray584[anInt10074++] = Static577.anInt9986;
					return;
				}
				if (arg0 == 6908) {
					anIntArray584[anInt10074++] = Static96.anInt2369;
					return;
				}
				if (arg0 == 6909) {
					anIntArray584[anInt10074++] = Static567.aBoolean375 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray584[anInt10074++] = Static456.anInt7972;
					return;
				}
				if (arg0 == 6911) {
					anIntArray584[anInt10074++] = Static128.anInt2909;
					return;
				}
				if (arg0 == 6912) {
					anIntArray584[anInt10074++] = Static280.anInt5294;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local175 = Static348.aClass3_Sub51_Sub1_5.method7833();
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9988 = Static37.anInt1122;
					anIntArray584[anInt10074++] = local175;
					Static393.method5569();
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 7001) {
					Static348.aClass3_Sub51_Sub1_5.method7835();
					Static393.method5569();
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 7002) {
					Static348.aClass3_Sub51_Sub1_5.method7836();
					Static393.method5569();
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 7003) {
					Static348.aClass3_Sub51_Sub1_5.method7847();
					Static393.method5569();
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 7004) {
					Static348.aClass3_Sub51_Sub1_5.method7844(true);
					Static393.method5569();
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 7005) {
					Static348.aClass3_Sub51_Sub1_5.anInt9956 = 0;
					Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
					Static67.aBoolean133 = false;
					return;
				}
				if (arg0 == 7006) {
					if (Static348.aClass3_Sub51_Sub1_5.anInt9988 == 2) {
						Static348.aClass3_Sub51_Sub1_5.aBoolean693 = true;
						return;
					}
					if (Static348.aClass3_Sub51_Sub1_5.anInt9988 == 1) {
						Static348.aClass3_Sub51_Sub1_5.aBoolean692 = true;
						return;
					}
					if (Static348.aClass3_Sub51_Sub1_5.anInt9988 == 3) {
						Static348.aClass3_Sub51_Sub1_5.aBoolean690 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray584[anInt10074++] = Static348.aClass3_Sub51_Sub1_5.anInt9956;
					return;
				}
				if (arg0 == 7008) {
					if (Static37.anInt1122 == 0 && Static372.anInt6489 < 96) {
						anIntArray584[anInt10074++] = 1;
						return;
					}
					anIntArray584[anInt10074++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!nm;)V")
	public static void method7919(@OriginalArg(0) Class3_Sub36 arg0) {
		method7925(arg0, 200000);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)Ljava/lang/String;")
	private static String method7920(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray52[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(IZ)V")
	public static void method7921() {
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)V")
	private static void method7922(@OriginalArg(0) int arg0) {
		@Pc(3) Class251 local3 = Static105.method2180(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class251[] local13 = Static516.aClass251ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class251[] local19 = Static449.aClass251ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static516.aClass251ArrayArray2[local9] = new Class251[local22];
			Static604.method6223(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static604.method6223(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!uda;I)V")
	private static void method7923(@OriginalArg(0) Class3_Sub7_Sub18 arg0, @OriginalArg(1) int arg1) {
		anInt10074 = 0;
		anInt10073 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray538;
		@Pc(11) int[] local11 = arg0.anIntArray539;
		@Pc(13) byte local13 = -1;
		anInt10077 = 0;
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
						method7930(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method7918(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray584[anInt10074++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray584[anInt10074++] = Static206.aClass143_3.anIntArray213[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static206.aClass143_3.method3694(anIntArray584[--anInt10074], local54);
					} else if (local31 == 3) {
						aStringArray51[anInt10073++] = arg0.aStringArray45[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt10074 -= 2;
						if (anIntArray584[anInt10074] != anIntArray584[anInt10074 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt10074 -= 2;
						if (anIntArray584[anInt10074] == anIntArray584[anInt10074 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt10074 -= 2;
						if (anIntArray584[anInt10074] < anIntArray584[anInt10074 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt10074 -= 2;
						if (anIntArray584[anInt10074] > anIntArray584[anInt10074 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt10077 == 0) {
							return;
						}
						@Pc(216) Class253 local216 = aClass253Array1[--anInt10077];
						arg0 = local216.aClass3_Sub7_Sub18_1;
						local8 = arg0.anIntArray538;
						local11 = arg0.anIntArray539;
						local5 = local216.anInt7317;
						anIntArray582 = local216.anIntArray415;
						aStringArray50 = local216.aStringArray33;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray584[anInt10074++] = Static206.aClass143_3.method3687(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static206.aClass143_3.method3691(local54, anIntArray584[--anInt10074]);
					} else if (local31 == 31) {
						anInt10074 -= 2;
						if (anIntArray584[anInt10074] <= anIntArray584[anInt10074 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt10074 -= 2;
						if (anIntArray584[anInt10074] >= anIntArray584[anInt10074 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray584[anInt10074++] = anIntArray582[local11[local5]];
					} else if (local31 == 34) {
						anIntArray582[local11[local5]] = anIntArray584[--anInt10074];
					} else if (local31 == 35) {
						aStringArray51[anInt10073++] = aStringArray50[local11[local5]];
					} else if (local31 == 36) {
						aStringArray50[local11[local5]] = aStringArray51[--anInt10073];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt10073 -= local54;
						@Pc(400) String local400 = Static121.method2337(anInt10073, local54, aStringArray51);
						aStringArray51[anInt10073++] = local400;
					} else if (local31 == 38) {
						anInt10074--;
					} else if (local31 == 39) {
						anInt10073--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class3_Sub7_Sub18 local436 = Static369.method5226(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt9346];
							@Pc(450) String[] local450 = new String[local436.anInt9344];
							for (local452 = 0; local452 < local436.anInt9342; local452++) {
								local446[local452] = anIntArray584[anInt10074 + local452 - local436.anInt9342];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt9343; local471++) {
								local450[local471] = aStringArray51[anInt10073 + local471 - local436.anInt9343];
							}
							anInt10074 -= local436.anInt9342;
							anInt10073 -= local436.anInt9343;
							@Pc(502) Class253 local502 = new Class253();
							local502.aClass3_Sub7_Sub18_1 = arg0;
							local502.anInt7317 = local5;
							local502.anIntArray415 = anIntArray582;
							local502.aStringArray33 = aStringArray50;
							if (anInt10077 >= aClass253Array1.length) {
								throw new RuntimeException();
							}
							aClass253Array1[anInt10077++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray538;
							local11 = local436.anIntArray539;
							local5 = -1;
							anIntArray582 = local446;
							aStringArray50 = local450;
						} else if (local31 == 42) {
							anIntArray584[anInt10074++] = Static161.anIntArray147[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static161.anIntArray147[local54] = anIntArray584[--anInt10074];
							Static66.method1641(local54);
							Static50.aBoolean109 |= Static592.aBooleanArray21[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray584[--anInt10074];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray583[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray104[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray584[--anInt10074];
							if (local603 < 0 || local603 >= anIntArray583[local54]) {
								throw new RuntimeException();
							}
							anIntArray584[anInt10074++] = anIntArrayArray104[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt10074 -= 2;
							local603 = anIntArray584[anInt10074];
							if (local603 < 0 || local603 >= anIntArray583[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray104[local54][local603] = anIntArray584[anInt10074 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static257.aStringArray22[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray51[anInt10073++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static257.aStringArray22[local54] = aStringArray51[--anInt10073];
							Static108.method4749(local54);
						} else if (local31 == 51) {
							@Pc(774) Class297 local774 = arg0.aClass297Array1[local11[local5]];
							@Pc(787) Class3_Sub2 local787 = (Class3_Sub2) local774.method6531((long) anIntArray584[--anInt10074]);
							if (local787 != null) {
								local5 += local787.anInt39;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString241 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong262).append(" ");
				for (local603 = anInt10077 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass253Array1[local603].aClass3_Sub7_Sub18_1.aLong262).append(" ");
				}
				local856.append("op: ").append(local13);
				Static332.method1390(local837, local856.toString());
			} else {
				Static260.method4014("Clientscript error in: " + arg0.aString241);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString241).append("\n");
				for (local603 = anInt10077 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass253Array1[local603].aClass3_Sub7_Sub18_1.aString241).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static332.method1390(local837, local856.toString());
				Static196.method3426(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method7924(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static212.anInt5852 == 0 && (Static402.aBoolean498 && !Static226.aBoolean296 || Static416.aBoolean520)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static573.aClass350_51.method7730(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static573.aClass350_51.method7730(0).length());
		} else if (local11.startsWith(Static573.aClass350_52.method7730(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static573.aClass350_52.method7730(0).length());
		} else if (local11.startsWith(Static573.aClass350_53.method7730(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static573.aClass350_53.method7730(0).length());
		} else if (local11.startsWith(Static573.aClass350_54.method7730(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static573.aClass350_54.method7730(0).length());
		} else if (local11.startsWith(Static573.aClass350_55.method7730(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static573.aClass350_55.method7730(0).length());
		} else if (local11.startsWith(Static573.aClass350_56.method7730(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static573.aClass350_56.method7730(0).length());
		} else if (local11.startsWith(Static573.aClass350_57.method7730(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static573.aClass350_57.method7730(0).length());
		} else if (local11.startsWith(Static573.aClass350_58.method7730(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static573.aClass350_58.method7730(0).length());
		} else if (local11.startsWith(Static573.aClass350_59.method7730(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static573.aClass350_59.method7730(0).length());
		} else if (local11.startsWith(Class350.lb.method7730(0))) {
			local13 = 9;
			arg0 = arg0.substring(Class350.lb.method7730(0).length());
		} else if (local11.startsWith(Static573.aClass350_60.method7730(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static573.aClass350_60.method7730(0).length());
		} else if (local11.startsWith(Static573.aClass350_61.method7730(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static573.aClass350_61.method7730(0).length());
		} else if (Static201.anInt4321 != 0) {
			if (local11.startsWith(Static573.aClass350_51.method7730(Static201.anInt4321))) {
				local13 = 0;
				arg0 = arg0.substring(Static573.aClass350_51.method7730(Static201.anInt4321).length());
			} else if (local11.startsWith(Static573.aClass350_52.method7730(Static201.anInt4321))) {
				local13 = 1;
				arg0 = arg0.substring(Static573.aClass350_52.method7730(Static201.anInt4321).length());
			} else if (local11.startsWith(Static573.aClass350_53.method7730(Static201.anInt4321))) {
				local13 = 2;
				arg0 = arg0.substring(Static573.aClass350_53.method7730(Static201.anInt4321).length());
			} else if (local11.startsWith(Static573.aClass350_54.method7730(Static201.anInt4321))) {
				local13 = 3;
				arg0 = arg0.substring(Static573.aClass350_54.method7730(Static201.anInt4321).length());
			} else if (local11.startsWith(Static573.aClass350_55.method7730(Static201.anInt4321))) {
				local13 = 4;
				arg0 = arg0.substring(Static573.aClass350_55.method7730(Static201.anInt4321).length());
			} else if (local11.startsWith(Static573.aClass350_56.method7730(Static201.anInt4321))) {
				local13 = 5;
				arg0 = arg0.substring(Static573.aClass350_56.method7730(Static201.anInt4321).length());
			} else if (local11.startsWith(Static573.aClass350_57.method7730(Static201.anInt4321))) {
				local13 = 6;
				arg0 = arg0.substring(Static573.aClass350_57.method7730(Static201.anInt4321).length());
			} else if (local11.startsWith(Static573.aClass350_58.method7730(Static201.anInt4321))) {
				local13 = 7;
				arg0 = arg0.substring(Static573.aClass350_58.method7730(Static201.anInt4321).length());
			} else if (local11.startsWith(Static573.aClass350_59.method7730(Static201.anInt4321))) {
				local13 = 8;
				arg0 = arg0.substring(Static573.aClass350_59.method7730(Static201.anInt4321).length());
			} else if (local11.startsWith(Class350.lb.method7730(Static201.anInt4321))) {
				local13 = 9;
				arg0 = arg0.substring(Class350.lb.method7730(Static201.anInt4321).length());
			} else if (local11.startsWith(Static573.aClass350_60.method7730(Static201.anInt4321))) {
				local13 = 10;
				arg0 = arg0.substring(Static573.aClass350_60.method7730(Static201.anInt4321).length());
			} else if (local11.startsWith(Static573.aClass350_61.method7730(Static201.anInt4321))) {
				local13 = 11;
				arg0 = arg0.substring(Static573.aClass350_61.method7730(Static201.anInt4321).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static573.aClass350_62.method7730(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static573.aClass350_62.method7730(0).length());
		} else if (local11.startsWith(Static573.aClass350_63.method7730(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static573.aClass350_63.method7730(0).length());
		} else if (local11.startsWith(Static573.aClass350_64.method7730(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static573.aClass350_64.method7730(0).length());
		} else if (local11.startsWith(Static573.aClass350_65.method7730(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static573.aClass350_65.method7730(0).length());
		} else if (local11.startsWith(Static573.aClass350_66.method7730(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static573.aClass350_66.method7730(0).length());
		} else if (Static201.anInt4321 != 0) {
			if (local11.startsWith(Static573.aClass350_62.method7730(Static201.anInt4321))) {
				local451 = 1;
				arg0 = arg0.substring(Static573.aClass350_62.method7730(Static201.anInt4321).length());
			} else if (local11.startsWith(Static573.aClass350_63.method7730(Static201.anInt4321))) {
				local451 = 2;
				arg0 = arg0.substring(Static573.aClass350_63.method7730(Static201.anInt4321).length());
			} else if (local11.startsWith(Static573.aClass350_64.method7730(Static201.anInt4321))) {
				local451 = 3;
				arg0 = arg0.substring(Static573.aClass350_64.method7730(Static201.anInt4321).length());
			} else if (local11.startsWith(Static573.aClass350_65.method7730(Static201.anInt4321))) {
				local451 = 4;
				arg0 = arg0.substring(Static573.aClass350_65.method7730(Static201.anInt4321).length());
			} else if (local11.startsWith(Static573.aClass350_66.method7730(Static201.anInt4321))) {
				local451 = 5;
				arg0 = arg0.substring(Static573.aClass350_66.method7730(Static201.anInt4321).length());
			}
		}
		@Pc(641) Class3_Sub10 local641 = Static129.method2403(Static452.aClass353_2, Static45.aClass287_19);
		local641.aClass3_Sub26_Sub1_1.method6809(0);
		@Pc(650) int local650 = local641.aClass3_Sub26_Sub1_1.anInt8703;
		local641.aClass3_Sub26_Sub1_1.method6809(local13);
		local641.aClass3_Sub26_Sub1_1.method6809(local451);
		Static548.method7506(local641.aClass3_Sub26_Sub1_1, arg0);
		local641.aClass3_Sub26_Sub1_1.method6768(local641.aClass3_Sub26_Sub1_1.anInt8703 - local650);
		Static193.method3398(local641);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!nm;I)V")
	private static void method7925(@OriginalArg(0) Class3_Sub36 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub7_Sub18 local12 = Static369.method5226(local8);
		if (local12 == null) {
			return;
		}
		anIntArray582 = new int[local12.anInt9346];
		@Pc(21) int local21 = 0;
		aStringArray50 = new String[local12.anInt9344];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt6425;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt6429;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass251_8 == null ? -1 : arg0.aClass251_8.anInt7279;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt6432;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass251_8 == null ? -1 : arg0.aClass251_8.anInt7268;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass251_7 == null ? -1 : arg0.aClass251_7.anInt7279;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass251_7 == null ? -1 : arg0.aClass251_7.anInt7268;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt6431;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt6427;
				}
				anIntArray582[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString164;
				}
				aStringArray50[local27++] = local135;
			}
		}
		anInt10081 = arg0.anInt6433;
		method7923(local12, arg1);
	}

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)V")
	public static void method7926(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static160.method2927(arg0)) {
			return;
		}
		@Pc(12) Class251[] local12 = Static449.aClass251ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class251 local19 = local12[local14];
			if (local19.anObjectArray10 != null) {
				@Pc(26) Class3_Sub36 local26 = new Class3_Sub36();
				local26.aClass251_8 = local19;
				local26.anObjectArray1 = local19.anObjectArray10;
				method7925(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "()V")
	public static void method7928() {
	}

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "(I)V")
	private static void method7929(@OriginalArg(0) int arg0) {
		@Pc(3) Class251 local3 = Static105.method2180(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class251[] local13 = Static516.aClass251ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class251[] local19 = Static449.aClass251ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static516.aClass251ArrayArray2[local9] = new Class251[local22];
			Static604.method6223(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static604.method6223(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "(IZ)V")
	private static void method7930(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class251 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class251 local35;
		@Pc(13) int local13;
		@Pc(210) Class251 local210;
		@Pc(158) Class251 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt10074 -= 3;
				local13 = anIntArray584[anInt10074];
				local19 = anIntArray584[anInt10074 + 1];
				local25 = anIntArray584[anInt10074 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static105.method2180(local13);
				if (local35.aClass251Array3 == null) {
					local35.aClass251Array3 = new Class251[local25 + 1];
				}
				if (local35.aClass251Array3.length <= local25) {
					@Pc(54) Class251[] local54 = new Class251[local25 + 1];
					for (local56 = 0; local56 < local35.aClass251Array3.length; local56++) {
						local54[local56] = local35.aClass251Array3[local56];
					}
					local35.aClass251Array3 = local54;
				}
				if (local25 > 0 && local35.aClass251Array3[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class251 local99 = new Class251();
				local99.anInt7231 = local19;
				local99.anInt7280 = local99.anInt7279 = local35.anInt7279;
				local99.anInt7268 = local25;
				local35.aClass251Array3[local25] = local99;
				if (arg1) {
					aClass251_16 = local99;
				} else {
					aClass251_15 = local99;
				}
				Static588.method8016(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass251_16 : aClass251_15;
				if (local137.anInt7268 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static105.method2180(local137.anInt7279);
				local158.aClass251Array3[local137.anInt7268] = null;
				Static588.method8016(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static105.method2180(anIntArray584[--anInt10074]);
				local137.aClass251Array3 = null;
				Static588.method8016(local137);
				return;
			}
			if (arg0 == 200) {
				anInt10074 -= 2;
				local13 = anIntArray584[anInt10074];
				local19 = anIntArray584[anInt10074 + 1];
				local210 = Static137.method2669(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray584[anInt10074++] = 1;
					if (arg1) {
						aClass251_16 = local210;
						return;
					}
					aClass251_15 = local210;
					return;
				}
				anIntArray584[anInt10074++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray584[--anInt10074];
				local158 = Static105.method2180(local13);
				if (local158 != null) {
					anIntArray584[anInt10074++] = 1;
					if (arg1) {
						aClass251_16 = local158;
						return;
					}
					aClass251_15 = local158;
					return;
				}
				anIntArray584[anInt10074++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray584[--anInt10074];
				method7929(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray584[--anInt10074];
				method7922(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt10074 -= 2;
					local13 = anIntArray584[anInt10074];
					local19 = anIntArray584[anInt10074 + 1];
					for (local25 = 0; local25 < Static135.anIntArray116.length; local25++) {
						if (Static135.anIntArray116[local25] == local13) {
							Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aClass131_1.method3497(local25, local19, Static324.aClass356_1);
							return;
						}
					}
					for (local353 = 0; local353 < Static185.anIntArray172.length; local353++) {
						if (Static185.anIntArray172[local353] == local13) {
							Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aClass131_1.method3497(local353, local19, Static324.aClass356_1);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt10074 -= 2;
					local13 = anIntArray584[anInt10074];
					local19 = anIntArray584[anInt10074 + 1];
					Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aClass131_1.method3493(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray584[--anInt10074] != 0;
					Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aClass131_1.method3496(local412);
					return;
				}
				if (arg0 == 411) {
					anInt10074 -= 2;
					local13 = anIntArray584[anInt10074];
					local19 = anIntArray584[anInt10074 + 1];
					Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aClass131_1.method3491(Static272.aClass121_2, local19, local13);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1507) String local1507;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static105.method2180(anIntArray584[--anInt10074]);
					} else {
						local137 = arg1 ? aClass251_16 : aClass251_15;
					}
					if (arg0 == 1100) {
						anInt10074 -= 2;
						local137.anInt7274 = anIntArray584[anInt10074];
						if (local137.anInt7274 > local137.anInt7234 - local137.anInt7285) {
							local137.anInt7274 = local137.anInt7234 - local137.anInt7285;
						}
						if (local137.anInt7274 < 0) {
							local137.anInt7274 = 0;
						}
						local137.anInt7275 = anIntArray584[anInt10074 + 1];
						if (local137.anInt7275 > local137.anInt7202 - local137.anInt7215) {
							local137.anInt7275 = local137.anInt7202 - local137.anInt7215;
						}
						if (local137.anInt7275 < 0) {
							local137.anInt7275 = 0;
						}
						Static588.method8016(local137);
						if (local137.anInt7268 == -1) {
							Static74.method1791(local137.anInt7279);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt7278 = anIntArray584[--anInt10074];
						Static588.method8016(local137);
						if (local137.anInt7268 == -1) {
							Static40.method1078(local137.anInt7279);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean510 = anIntArray584[--anInt10074] == 1;
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt7240 = anIntArray584[--anInt10074];
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt7201 = anIntArray584[--anInt10074];
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray584[--anInt10074];
						if (local137.anInt7213 != local19) {
							local137.anInt7213 = local19;
							Static588.method8016(local137);
						}
						if (local137.anInt7268 == -1) {
							Static137.method2657(local137.anInt7279);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt7255 = anIntArray584[--anInt10074];
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean515 = anIntArray584[--anInt10074] == 1;
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt7288 = 1;
						local137.anInt7229 = anIntArray584[--anInt10074];
						Static588.method8016(local137);
						if (local137.anInt7268 == -1) {
							Static566.method7706(local137.anInt7279);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt10074 -= 6;
						local137.anInt7237 = anIntArray584[anInt10074];
						local137.anInt7260 = anIntArray584[anInt10074 + 1];
						local137.anInt7252 = anIntArray584[anInt10074 + 2];
						local137.anInt7269 = anIntArray584[anInt10074 + 3];
						local137.anInt7262 = anIntArray584[anInt10074 + 4];
						local137.anInt7210 = anIntArray584[anInt10074 + 5];
						Static588.method8016(local137);
						if (local137.anInt7268 == -1) {
							Static414.method5812(local137.anInt7279);
							Static422.method5874(local137.anInt7279);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray584[--anInt10074];
						if (local137.anInt7266 != local19) {
							local137.anInt7266 = local19;
							local137.anInt7271 = 0;
							local137.anInt7270 = 1;
							local137.anInt7222 = 0;
							@Pc(1094) Class270 local1094 = local137.anInt7266 == -1 ? null : Static245.aClass155_1.method3820(local137.anInt7266);
							if (local1094 != null) {
								Static372.method5237(local137.anInt7271, local1094);
							}
							Static588.method8016(local137);
						}
						if (local137.anInt7268 == -1) {
							Static465.method6367(local137.anInt7279);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean506 = anIntArray584[--anInt10074] == 1;
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray51[--anInt10073];
						if (!local1145.equals(local137.aString189)) {
							local137.aString189 = local1145;
							Static588.method8016(local137);
						}
						if (local137.anInt7268 == -1) {
							Static326.method4809(local137.anInt7279);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt7226 = anIntArray584[--anInt10074];
						Static588.method8016(local137);
						if (local137.anInt7268 == -1) {
							Static522.method7233(local137.anInt7279);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt10074 -= 3;
						local137.anInt7257 = anIntArray584[anInt10074];
						local137.anInt7225 = anIntArray584[anInt10074 + 1];
						local137.anInt7239 = anIntArray584[anInt10074 + 2];
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean512 = anIntArray584[--anInt10074] == 1;
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt7273 = anIntArray584[--anInt10074];
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt7227 = anIntArray584[--anInt10074];
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean508 = anIntArray584[--anInt10074] == 1;
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean511 = anIntArray584[--anInt10074] == 1;
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt10074 -= 2;
						local137.anInt7234 = anIntArray584[anInt10074];
						local137.anInt7202 = anIntArray584[anInt10074 + 1];
						Static588.method8016(local137);
						if (local137.anInt7231 == 0) {
							Static479.method6546(local137, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean509 = anIntArray584[--anInt10074] == 1;
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt7210 = anIntArray584[--anInt10074];
						Static588.method8016(local137);
						if (local137.anInt7268 == -1) {
							Static414.method5812(local137.anInt7279);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray584[--anInt10074];
						local137.aBoolean503 = local19 == 1;
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt10074 -= 2;
						local137.anInt7203 = anIntArray584[anInt10074];
						local137.anInt7216 = anIntArray584[anInt10074 + 1];
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt7228 = anIntArray584[--anInt10074];
						Static588.method8016(local137);
						return;
					}
					@Pc(1473) Class41 local1473;
					if (arg0 == 1127) {
						anInt10074 -= 2;
						local19 = anIntArray584[anInt10074];
						local25 = anIntArray584[anInt10074 + 1];
						local1473 = Static106.aClass27_1.method483(local19);
						if (local25 != local1473.anInt1311) {
							local137.method5696(local25, local19);
							return;
						}
						local137.method5703(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray584[--anInt10074];
						local1507 = aStringArray51[--anInt10073];
						local1473 = Static106.aClass27_1.method483(local19);
						if (!local1473.aString27.equals(local1507)) {
							local137.method5691(local1507, local19);
							return;
						}
						local137.method5703(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2309) int local2309;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static105.method2180(anIntArray584[--anInt10074]);
						} else {
							local137 = arg1 ? aClass251_16 : aClass251_15;
						}
						if (arg0 == 1300) {
							local19 = anIntArray584[--anInt10074] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method5707(local19, aStringArray51[--anInt10073]);
								return;
							} else {
								anInt10073--;
								return;
							}
						}
						if (arg0 == 1301) {
							anInt10074 -= 2;
							local19 = anIntArray584[anInt10074];
							local25 = anIntArray584[anInt10074 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass251_11 = null;
								return;
							}
							local137.aClass251_11 = Static137.method2669(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray584[--anInt10074];
							if (local19 != Static543.anInt9487 && local19 != Static104.anInt2591 && local19 != Static107.anInt2623) {
								return;
							}
							local137.anInt7205 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt7211 = anIntArray584[--anInt10074];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt7259 = anIntArray584[--anInt10074];
							return;
						}
						if (arg0 == 1305) {
							local137.aString187 = aStringArray51[--anInt10073];
							return;
						}
						if (arg0 == 1306) {
							local137.aString185 = aStringArray51[--anInt10073];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray32 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt7246 = anIntArray584[--anInt10074];
							local137.anInt7247 = anIntArray584[--anInt10074];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray584[--anInt10074];
							local25 = anIntArray584[--anInt10074];
							if (local25 >= 1 && local25 <= 10) {
								local137.method5700(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString188 = aStringArray51[--anInt10073];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt7267 = anIntArray584[--anInt10074];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt10074 -= 3;
								local19 = anIntArray584[anInt10074] - 1;
								local25 = anIntArray584[anInt10074 + 1];
								local353 = anIntArray584[anInt10074 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt10074 -= 2;
								local19 = 10;
								local25 = anIntArray584[anInt10074];
								local353 = anIntArray584[anInt10074 + 1];
							}
							if (local137.aByteArray175 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray175 = new byte[11];
								local137.aByteArray176 = new byte[11];
								local137.anIntArray411 = new int[11];
							}
							local137.aByteArray175[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean505 = false;
								for (local2309 = 0; local2309 < local137.aByteArray175.length; local2309++) {
									if (local137.aByteArray175[local2309] != 0) {
										local137.aBoolean505 = true;
										break;
									}
								}
							} else {
								local137.aBoolean505 = true;
							}
							local137.aByteArray176[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt7242 = anIntArray584[--anInt10074];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static105.method2180(anIntArray584[--anInt10074]);
						} else {
							local137 = arg1 ? aClass251_16 : aClass251_15;
						}
						if (arg0 == 1499) {
							local137.method5694();
							return;
						}
						local1145 = aStringArray51[--anInt10073];
						@Pc(2395) int[] local2395 = null;
						if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
							local353 = anIntArray584[--anInt10074];
							if (local353 > 0) {
								local2395 = new int[local353];
								while (local353-- > 0) {
									local2395[local353] = anIntArray584[--anInt10074];
								}
							}
							local1145 = local1145.substring(0, local1145.length() - 1);
						}
						@Pc(2447) Object[] local2447 = new Object[local1145.length() + 1];
						for (local2309 = local2447.length - 1; local2309 >= 1; local2309--) {
							if (local1145.charAt(local2309 - 1) == 's') {
								local2447[local2309] = aStringArray51[--anInt10073];
							} else {
								local2447[local2309] = Integer.valueOf(anIntArray584[--anInt10074]);
							}
						}
						local56 = anIntArray584[--anInt10074];
						if (local56 == -1) {
							local2447 = null;
						} else {
							local2447[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray28 = local2447;
						} else if (arg0 == 1401) {
							local137.anObjectArray22 = local2447;
						} else if (arg0 == 1402) {
							local137.anObjectArray18 = local2447;
						} else if (arg0 == 1403) {
							local137.anObjectArray6 = local2447;
						} else if (arg0 == 1404) {
							local137.anObjectArray32 = local2447;
						} else if (arg0 == 1405) {
							local137.anObjectArray5 = local2447;
						} else if (arg0 == 1406) {
							local137.anObjectArray3 = local2447;
						} else if (arg0 == 1407) {
							local137.anObjectArray16 = local2447;
							local137.anIntArray413 = local2395;
						} else if (arg0 == 1408) {
							local137.anObjectArray2 = local2447;
						} else if (arg0 == 1409) {
							local137.anObjectArray30 = local2447;
						} else if (arg0 == 1410) {
							local137.anObjectArray31 = local2447;
						} else if (arg0 == 1411) {
							local137.anObjectArray14 = local2447;
						} else if (arg0 == 1412) {
							local137.anObjectArray21 = local2447;
						} else if (arg0 == 1414) {
							local137.anObjectArray20 = local2447;
							local137.anIntArray405 = local2395;
						} else if (arg0 == 1415) {
							local137.anObjectArray15 = local2447;
							local137.anIntArray407 = local2395;
						} else if (arg0 == 1416) {
							local137.anObjectArray7 = local2447;
						} else if (arg0 == 1417) {
							local137.anObjectArray9 = local2447;
						} else if (arg0 == 1418) {
							local137.anObjectArray23 = local2447;
						} else if (arg0 == 1419) {
							local137.anObjectArray4 = local2447;
						} else if (arg0 == 1420) {
							local137.anObjectArray11 = local2447;
						} else if (arg0 == 1421) {
							local137.anObjectArray19 = local2447;
						} else if (arg0 == 1422) {
							local137.anObjectArray27 = local2447;
						} else if (arg0 == 1423) {
							local137.anObjectArray12 = local2447;
						} else if (arg0 == 1424) {
							local137.anObjectArray26 = local2447;
						} else if (arg0 == 1425) {
							local137.anObjectArray25 = local2447;
						} else if (arg0 == 1426) {
							local137.anObjectArray8 = local2447;
						} else if (arg0 == 1427) {
							local137.anObjectArray17 = local2447;
						} else if (arg0 == 1428) {
							local137.anObjectArray29 = local2447;
							local137.anIntArray406 = local2395;
						} else if (arg0 == 1429) {
							local137.anObjectArray13 = local2447;
							local137.anIntArray408 = local2395;
						} else if (arg0 == 1430) {
							local137.anObjectArray24 = local2447;
						}
						local137.aBoolean514 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass251_16 : aClass251_15;
						if (arg0 == 1500) {
							anIntArray584[anInt10074++] = local137.anInt7224;
							return;
						}
						if (arg0 == 1501) {
							anIntArray584[anInt10074++] = local137.anInt7281;
							return;
						}
						if (arg0 == 1502) {
							anIntArray584[anInt10074++] = local137.anInt7285;
							return;
						}
						if (arg0 == 1503) {
							anIntArray584[anInt10074++] = local137.anInt7215;
							return;
						}
						if (arg0 == 1504) {
							anIntArray584[anInt10074++] = local137.aBoolean507 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray584[anInt10074++] = local137.anInt7280;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static136.method2656(local137);
							anIntArray584[anInt10074++] = local158 == null ? -1 : local158.anInt7279;
							return;
						}
					} else {
						@Pc(3043) Class41 local3043;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass251_16 : aClass251_15;
							if (arg0 == 1600) {
								anIntArray584[anInt10074++] = local137.anInt7274;
								return;
							}
							if (arg0 == 1601) {
								anIntArray584[anInt10074++] = local137.anInt7275;
								return;
							}
							if (arg0 == 1602) {
								aStringArray51[anInt10073++] = local137.aString189;
								return;
							}
							if (arg0 == 1603) {
								anIntArray584[anInt10074++] = local137.anInt7234;
								return;
							}
							if (arg0 == 1604) {
								anIntArray584[anInt10074++] = local137.anInt7202;
								return;
							}
							if (arg0 == 1605) {
								anIntArray584[anInt10074++] = local137.anInt7210;
								return;
							}
							if (arg0 == 1606) {
								anIntArray584[anInt10074++] = local137.anInt7252;
								return;
							}
							if (arg0 == 1607) {
								anIntArray584[anInt10074++] = local137.anInt7262;
								return;
							}
							if (arg0 == 1608) {
								anIntArray584[anInt10074++] = local137.anInt7269;
								return;
							}
							if (arg0 == 1609) {
								anIntArray584[anInt10074++] = local137.anInt7240;
								return;
							}
							if (arg0 == 1610) {
								anIntArray584[anInt10074++] = local137.anInt7237;
								return;
							}
							if (arg0 == 1611) {
								anIntArray584[anInt10074++] = local137.anInt7260;
								return;
							}
							if (arg0 == 1612) {
								anIntArray584[anInt10074++] = local137.anInt7213;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray584[--anInt10074];
								local3043 = Static106.aClass27_1.method483(local19);
								if (local3043.method1208()) {
									aStringArray51[anInt10073++] = local137.method5706(local19, local3043.aString27);
									return;
								}
								anIntArray584[anInt10074++] = local137.method5709(local19, local3043.anInt1311);
								return;
							}
							if (arg0 == 1614) {
								anIntArray584[anInt10074++] = local137.anInt7255;
								return;
							}
							if (arg0 == 2614) {
								anIntArray584[anInt10074++] = local137.anInt7288 == 1 ? local137.anInt7229 : -1;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass251_16 : aClass251_15;
							if (arg0 == 1700) {
								anIntArray584[anInt10074++] = local137.anInt7254;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt7254 != -1) {
									anIntArray584[anInt10074++] = local137.anInt7248;
									return;
								}
								anIntArray584[anInt10074++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray584[anInt10074++] = local137.anInt7268;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass251_16 : aClass251_15;
							if (arg0 == 1800) {
								anIntArray584[anInt10074++] = Static70.method1716(local137).method3242();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray584[--anInt10074];
								local19--;
								if (local137.aStringArray32 != null && local19 < local137.aStringArray32.length && local137.aStringArray32[local19] != null) {
									aStringArray51[anInt10073++] = local137.aStringArray32[local19];
									return;
								}
								aStringArray51[anInt10073++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString187 == null) {
									aStringArray51[anInt10073++] = "";
									return;
								}
								aStringArray51[anInt10073++] = local137.aString187;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static105.method2180(anIntArray584[--anInt10074]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass251_16 : aClass251_15;
							}
							if (anInt10081 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray17 == null) {
									return;
								}
								@Pc(3312) Class3_Sub36 local3312 = new Class3_Sub36();
								local3312.aClass251_8 = local137;
								local3312.anObjectArray1 = local137.anObjectArray17;
								local3312.anInt6433 = anInt10081 + 1;
								Static206.aClass244_38.method5570(local3312);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static105.method2180(anIntArray584[--anInt10074]);
							if (arg0 == 2500) {
								anIntArray584[anInt10074++] = local137.anInt7224;
								return;
							}
							if (arg0 == 2501) {
								anIntArray584[anInt10074++] = local137.anInt7281;
								return;
							}
							if (arg0 == 2502) {
								anIntArray584[anInt10074++] = local137.anInt7285;
								return;
							}
							if (arg0 == 2503) {
								anIntArray584[anInt10074++] = local137.anInt7215;
								return;
							}
							if (arg0 == 2504) {
								anIntArray584[anInt10074++] = local137.aBoolean507 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray584[anInt10074++] = local137.anInt7280;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static136.method2656(local137);
								anIntArray584[anInt10074++] = local158 == null ? -1 : local158.anInt7279;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static105.method2180(anIntArray584[--anInt10074]);
							if (arg0 == 2600) {
								anIntArray584[anInt10074++] = local137.anInt7274;
								return;
							}
							if (arg0 == 2601) {
								anIntArray584[anInt10074++] = local137.anInt7275;
								return;
							}
							if (arg0 == 2602) {
								aStringArray51[anInt10073++] = local137.aString189;
								return;
							}
							if (arg0 == 2603) {
								anIntArray584[anInt10074++] = local137.anInt7234;
								return;
							}
							if (arg0 == 2604) {
								anIntArray584[anInt10074++] = local137.anInt7202;
								return;
							}
							if (arg0 == 2605) {
								anIntArray584[anInt10074++] = local137.anInt7210;
								return;
							}
							if (arg0 == 2606) {
								anIntArray584[anInt10074++] = local137.anInt7252;
								return;
							}
							if (arg0 == 2607) {
								anIntArray584[anInt10074++] = local137.anInt7262;
								return;
							}
							if (arg0 == 2608) {
								anIntArray584[anInt10074++] = local137.anInt7269;
								return;
							}
							if (arg0 == 2609) {
								anIntArray584[anInt10074++] = local137.anInt7240;
								return;
							}
							if (arg0 == 2610) {
								anIntArray584[anInt10074++] = local137.anInt7237;
								return;
							}
							if (arg0 == 2611) {
								anIntArray584[anInt10074++] = local137.anInt7260;
								return;
							}
							if (arg0 == 2612) {
								anIntArray584[anInt10074++] = local137.anInt7213;
								return;
							}
							if (arg0 == 2613) {
								anIntArray584[anInt10074++] = local137.anInt7255;
								return;
							}
							if (arg0 == 2614) {
								anIntArray584[anInt10074++] = local137.anInt7288 == 1 ? local137.anInt7229 : -1;
								return;
							}
						} else {
							@Pc(3841) Class3_Sub49 local3841;
							@Pc(3739) Class3_Sub49 local3739;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static105.method2180(anIntArray584[--anInt10074]);
									anIntArray584[anInt10074++] = local137.anInt7254;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static105.method2180(anIntArray584[--anInt10074]);
									if (local137.anInt7254 != -1) {
										anIntArray584[anInt10074++] = local137.anInt7248;
										return;
									}
									anIntArray584[anInt10074++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray584[--anInt10074];
									local3739 = (Class3_Sub49) Static204.aClass297_16.method6531((long) local13);
									if (local3739 != null) {
										anIntArray584[anInt10074++] = 1;
										return;
									}
									anIntArray584[anInt10074++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static105.method2180(anIntArray584[--anInt10074]);
									if (local137.aClass251Array3 == null) {
										anIntArray584[anInt10074++] = 0;
										return;
									}
									local19 = local137.aClass251Array3.length;
									for (local25 = 0; local25 < local137.aClass251Array3.length; local25++) {
										if (local137.aClass251Array3[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray584[anInt10074++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt10074 -= 2;
									local13 = anIntArray584[anInt10074];
									local19 = anIntArray584[anInt10074 + 1];
									local3841 = (Class3_Sub49) Static204.aClass297_16.method6531((long) local13);
									if (local3841 != null && local3841.anInt9244 == local19) {
										anIntArray584[anInt10074++] = 1;
										return;
									}
									anIntArray584[anInt10074++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static105.method2180(anIntArray584[--anInt10074]);
								if (arg0 == 2800) {
									anIntArray584[anInt10074++] = Static70.method1716(local137).method3242();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray584[--anInt10074];
									local19--;
									if (local137.aStringArray32 != null && local19 < local137.aStringArray32.length && local137.aStringArray32[local19] != null) {
										aStringArray51[anInt10073++] = local137.aStringArray32[local19];
										return;
									}
									aStringArray51[anInt10073++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString187 == null) {
										aStringArray51[anInt10073++] = "";
										return;
									}
									aStringArray51[anInt10073++] = local137.aString187;
									return;
								}
							} else {
								@Pc(3978) String local3978;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3978 = aStringArray51[--anInt10073];
										Static147.method2798(local3978);
										return;
									}
									if (arg0 == 3101) {
										anInt10074 -= 2;
										Static170.method6963(anIntArray584[anInt10074 + 1], Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1, anIntArray584[anInt10074]);
										return;
									}
									if (arg0 == 3103) {
										Static493.method6636();
										return;
									}
									if (arg0 == 3104) {
										local3978 = aStringArray51[--anInt10073];
										local19 = 0;
										if (Static517.method6956(local3978)) {
											local19 = Static406.method5727(local3978);
										}
										@Pc(4038) Class3_Sub10 local4038 = Static129.method2403(Static452.aClass353_2, Static455.aClass287_129);
										local4038.aClass3_Sub26_Sub1_1.method6826(local19);
										Static193.method3398(local4038);
										return;
									}
									@Pc(4067) Class3_Sub10 local4067;
									if (arg0 == 3105) {
										local3978 = aStringArray51[--anInt10073];
										local4067 = Static129.method2403(Static452.aClass353_2, Static563.aClass287_110);
										local4067.aClass3_Sub26_Sub1_1.method6809(local3978.length() + 1);
										local4067.aClass3_Sub26_Sub1_1.method6772(local3978);
										Static193.method3398(local4067);
										return;
									}
									if (arg0 == 3106) {
										local3978 = aStringArray51[--anInt10073];
										local4067 = Static129.method2403(Static452.aClass353_2, Static536.aClass287_142);
										local4067.aClass3_Sub26_Sub1_1.method6809(local3978.length() + 1);
										local4067.aClass3_Sub26_Sub1_1.method6772(local3978);
										Static193.method3398(local4067);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray584[--anInt10074];
										local1145 = aStringArray51[--anInt10073];
										Static171.method3054(local1145, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt10074 -= 3;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										local25 = anIntArray584[anInt10074 + 2];
										local35 = Static105.method2180(local25);
										Static474.method6453(local13, local35, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										local210 = arg1 ? aClass251_16 : aClass251_15;
										Static474.method6453(local13, local210, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray584[--anInt10074];
										local4067 = Static129.method2403(Static452.aClass353_2, Static128.aClass287_46);
										local4067.aClass3_Sub26_Sub1_1.method6769(local13);
										Static193.method3398(local4067);
										return;
									}
									if (arg0 == 3111) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										local3841 = (Class3_Sub49) Static204.aClass297_16.method6531((long) local13);
										if (local3841 != null) {
											Static46.method1171(local3841.anInt9244 != local19, true, local3841);
										}
										Static506.method6842(local19, 3, true, local13);
										return;
									}
									if (arg0 == 3112) {
										anInt10074--;
										local13 = anIntArray584[anInt10074];
										local3739 = (Class3_Sub49) Static204.aClass297_16.method6531((long) local13);
										if (local3739 != null && local3739.anInt9245 == 3) {
											Static46.method1171(true, true, local3739);
										}
										return;
									}
									if (arg0 == 3113) {
										Static88.method1958(aStringArray51[--anInt10073]);
										return;
									}
									if (arg0 == 3114) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										local1507 = aStringArray51[--anInt10073];
										Static295.method4425("", "", local1507, local19, local13, "");
										return;
									}
									if (arg0 == 3115) {
										anInt10074 -= 11;
										@Pc(4368) Class154[] local4368 = Static447.method6195();
										@Pc(4371) Class201[] local4371 = Static342.method4995();
										Static59.method1441(anIntArray584[anInt10074 + 4], anIntArray584[anInt10074 + 8], anIntArray584[anInt10074 + 10], anIntArray584[anInt10074 + 5], anIntArray584[anInt10074 + 3], anIntArray584[anInt10074 + 9], anIntArray584[anInt10074 + 6], local4371[anIntArray584[anInt10074 + 1]], local4368[anIntArray584[anInt10074]], anIntArray584[anInt10074 + 7], anIntArray584[anInt10074 + 2]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt10074 -= 3;
										Static15.method151(anIntArray584[anInt10074], 256, anIntArray584[anInt10074 + 2], anIntArray584[anInt10074 + 1], 255);
										return;
									}
									if (arg0 == 3201) {
										Static389.method6669(50, 255, anIntArray584[--anInt10074]);
										return;
									}
									if (arg0 == 3202) {
										anInt10074 -= 2;
										Static592.method5618(anIntArray584[anInt10074], 255, anIntArray584[anInt10074 + 1]);
										return;
									}
									if (arg0 == 3203) {
										anInt10074 -= 4;
										Static15.method151(anIntArray584[anInt10074], 256, anIntArray584[anInt10074 + 2], anIntArray584[anInt10074 + 1], anIntArray584[anInt10074 + 3]);
										return;
									}
									if (arg0 == 3204) {
										anInt10074 -= 3;
										Static389.method6669(anIntArray584[anInt10074 + 2], anIntArray584[anInt10074 + 1], anIntArray584[anInt10074]);
										return;
									}
									if (arg0 == 3205) {
										anInt10074 -= 3;
										Static592.method5618(anIntArray584[anInt10074], anIntArray584[anInt10074 + 2], anIntArray584[anInt10074 + 1]);
										return;
									}
									if (arg0 == 3206) {
										anInt10074 -= 4;
										Static205.method3538(anIntArray584[anInt10074 + 3], 256, anIntArray584[anInt10074 + 2], anIntArray584[anInt10074], anIntArray584[anInt10074 + 1], false);
										return;
									}
									if (arg0 == 3207) {
										anInt10074 -= 4;
										Static205.method3538(anIntArray584[anInt10074 + 3], 256, anIntArray584[anInt10074 + 2], anIntArray584[anInt10074], anIntArray584[anInt10074 + 1], true);
										return;
									}
									if (arg0 == 3208) {
										anInt10074 -= 5;
										Static15.method151(anIntArray584[anInt10074], anIntArray584[anInt10074 + 4], anIntArray584[anInt10074 + 2], anIntArray584[anInt10074 + 1], anIntArray584[anInt10074 + 3]);
										return;
									}
									if (arg0 == 3209) {
										anInt10074 -= 5;
										Static205.method3538(anIntArray584[anInt10074 + 3], anIntArray584[anInt10074 + 4], anIntArray584[anInt10074 + 2], anIntArray584[anInt10074], anIntArray584[anInt10074 + 1], false);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray584[anInt10074++] = Static397.anInt6998;
										return;
									}
									if (arg0 == 3301) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = Static548.method7505(local13, false, local19);
										return;
									}
									if (arg0 == 3302) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = Static471.method6427(local13, local19, false);
										return;
									}
									if (arg0 == 3303) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = Static396.method5589(false, local19, local13);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static540.aClass327_1.method7298(local13).anInt5349;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static564.anIntArray564[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static95.anIntArray80[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static361.anIntArray354[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4896) byte local4896 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117;
										local19 = (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476 >> 9) + Static321.anInt5874;
										local25 = (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482 >> 9) + Static137.anInt3293;
										anIntArray584[anInt10074++] = (local4896 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray584[anInt10074++] = Static150.aBoolean247 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = Static548.method7505(local13, true, local19);
										return;
									}
									if (arg0 == 3314) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = Static471.method6427(local13, local19, true);
										return;
									}
									if (arg0 == 3315) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = Static396.method5589(true, local19, local13);
										return;
									}
									if (arg0 == 3316) {
										if (Static212.anInt5852 >= 2) {
											anIntArray584[anInt10074++] = Static212.anInt5852;
											return;
										}
										anIntArray584[anInt10074++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray584[anInt10074++] = Static507.anInt8783;
										return;
									}
									if (arg0 == 3318) {
										anIntArray584[anInt10074++] = Static104.aClass212_1.anInt6145;
										return;
									}
									if (arg0 == 3321) {
										anIntArray584[anInt10074++] = Static259.anInt1155;
										return;
									}
									if (arg0 == 3322) {
										anIntArray584[anInt10074++] = Static278.anInt5258;
										return;
									}
									if (arg0 == 3323) {
										if (Static462.anInt8080 >= 5 && Static462.anInt8080 <= 9) {
											anIntArray584[anInt10074++] = 1;
											return;
										}
										anIntArray584[anInt10074++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static462.anInt8080 >= 5 && Static462.anInt8080 <= 9) {
											anIntArray584[anInt10074++] = Static462.anInt8080;
											return;
										}
										anIntArray584[anInt10074++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray584[anInt10074++] = Static577.aBoolean689 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray584[anInt10074++] = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt7167;
										return;
									}
									if (arg0 == 3327) {
										anIntArray584[anInt10074++] = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aClass131_1.aBoolean285 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray584[anInt10074++] = Static416.aBoolean520 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static117.method2294(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = Static213.method3570(local19, false, local13);
										return;
									}
									if (arg0 == 3332) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = Static213.method3570(local19, true, local13);
										return;
									}
									if (arg0 == 3333) {
										anIntArray584[anInt10074++] = Static314.anInt5779;
										return;
									}
									if (arg0 == 3335) {
										anIntArray584[anInt10074++] = Static201.anInt4321;
										return;
									}
									if (arg0 == 3336) {
										anInt10074 -= 4;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										local25 = anIntArray584[anInt10074 + 2];
										local353 = anIntArray584[anInt10074 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray584[anInt10074++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray584[anInt10074++] = Static501.anInt8649;
										return;
									}
									if (arg0 == 3338) {
										anIntArray584[anInt10074++] = Static489.method7303();
										return;
									}
									if (arg0 == 3339) {
										anIntArray584[anInt10074++] = Static174.aBoolean594 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray584[anInt10074++] = Static269.aBoolean336 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray584[anInt10074++] = Static574.aBoolean649 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray584[anInt10074++] = Static234.aClass54_4.method7306();
										return;
									}
									if (arg0 == 3343) {
										anIntArray584[anInt10074++] = Static234.aClass54_4.method7315();
										return;
									}
									if (arg0 == 3344) {
										aStringArray51[anInt10073++] = Static395.method5582();
										return;
									}
									if (arg0 == 3345) {
										aStringArray51[anInt10073++] = Static406.method5728();
										return;
									}
									if (arg0 == 3346) {
										anIntArray584[anInt10074++] = Static286.method4306();
										return;
									}
									if (arg0 == 3347) {
										anIntArray584[anInt10074++] = Static286.anInt5362;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5631) Class70 local5631;
									if (arg0 == 3400) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										local5631 = Static227.aClass344_1.method7704(local13);
										aStringArray51[anInt10073++] = local5631.method2041(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt10074 -= 4;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										local25 = anIntArray584[anInt10074 + 2];
										local353 = anIntArray584[anInt10074 + 3];
										@Pc(5677) Class70 local5677 = Static227.aClass344_1.method7704(local25);
										if (local5677.aChar2 == local13 && local5677.aChar3 == local19) {
											if (local19 == 115) {
												aStringArray51[anInt10073++] = local5677.method2041(local353);
												return;
											}
											anIntArray584[anInt10074++] = local5677.method2040(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt10074 -= 3;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										local25 = anIntArray584[anInt10074 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5753) Class70 local5753 = Static227.aClass344_1.method7704(local19);
										if (local5753.aChar3 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray584[anInt10074++] = local5753.method2042(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray584[--anInt10074];
										local1145 = aStringArray51[--anInt10073];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5631 = Static227.aClass344_1.method7704(local13);
										if (local5631.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray584[anInt10074++] = local5631.method2039(local1145) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray584[--anInt10074];
										@Pc(5851) Class70 local5851 = Static227.aClass344_1.method7704(local13);
										anIntArray584[anInt10074++] = local5851.aClass297_4.method6528();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static181.anInt3976 == 0) {
											anIntArray584[anInt10074++] = -2;
											return;
										}
										if (Static181.anInt3976 == 1) {
											anIntArray584[anInt10074++] = -1;
											return;
										}
										anIntArray584[anInt10074++] = Static372.anInt6493;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray584[--anInt10074];
										if (Static181.anInt3976 == 2 && local13 < Static372.anInt6493) {
											aStringArray51[anInt10073++] = Static437.aStringArray36[local13];
											if (Static530.aStringArray44[local13] != null) {
												aStringArray51[anInt10073++] = Static530.aStringArray44[local13];
												return;
											}
											aStringArray51[anInt10073++] = "";
											return;
										}
										aStringArray51[anInt10073++] = "";
										aStringArray51[anInt10073++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray584[--anInt10074];
										if (Static181.anInt3976 == 2 && local13 < Static372.anInt6493) {
											anIntArray584[anInt10074++] = Static383.anIntArray374[local13];
											return;
										}
										anIntArray584[anInt10074++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray584[--anInt10074];
										if (Static181.anInt3976 == 2 && local13 < Static372.anInt6493) {
											anIntArray584[anInt10074++] = Static578.anIntArray577[local13];
											return;
										}
										anIntArray584[anInt10074++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3978 = aStringArray51[--anInt10073];
										local19 = anIntArray584[--anInt10074];
										Static362.method5152(local19, local3978);
										return;
									}
									if (arg0 == 3605) {
										local3978 = aStringArray51[--anInt10073];
										Static234.method8179(local3978);
										return;
									}
									if (arg0 == 3606) {
										local3978 = aStringArray51[--anInt10073];
										Static569.method7715(local3978);
										return;
									}
									if (arg0 == 3607) {
										local3978 = aStringArray51[--anInt10073];
										Static137.method2663(false, local3978);
										return;
									}
									if (arg0 == 3608) {
										local3978 = aStringArray51[--anInt10073];
										Static174.method6964(local3978);
										return;
									}
									if (arg0 == 3609) {
										local3978 = aStringArray51[--anInt10073];
										if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
											local3978 = local3978.substring(7);
										}
										anIntArray584[anInt10074++] = Static299.method4549(local3978) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray584[--anInt10074];
										if (Static181.anInt3976 == 2 && local13 < Static372.anInt6493) {
											aStringArray51[anInt10073++] = Static154.aStringArray11[local13];
											return;
										}
										aStringArray51[anInt10073++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static253.aString120 != null) {
											aStringArray51[anInt10073++] = Static461.method6345(Static253.aString120);
											return;
										}
										aStringArray51[anInt10073++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static253.aString120 != null) {
											anIntArray584[anInt10074++] = Static260.anInt5022;
											return;
										}
										anIntArray584[anInt10074++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray584[--anInt10074];
										if (Static253.aString120 != null && local13 < Static260.anInt5022) {
											aStringArray51[anInt10073++] = Static131.aClass74Array1[local13].aString60;
											return;
										}
										aStringArray51[anInt10073++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray584[--anInt10074];
										if (Static253.aString120 != null && local13 < Static260.anInt5022) {
											anIntArray584[anInt10074++] = Static131.aClass74Array1[local13].anInt2589;
											return;
										}
										anIntArray584[anInt10074++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray584[--anInt10074];
										if (Static253.aString120 != null && local13 < Static260.anInt5022) {
											anIntArray584[anInt10074++] = Static131.aClass74Array1[local13].aByte26;
											return;
										}
										anIntArray584[anInt10074++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray584[anInt10074++] = Static238.aByte45;
										return;
									}
									if (arg0 == 3617) {
										local3978 = aStringArray51[--anInt10073];
										Static253.method3967(local3978);
										return;
									}
									if (arg0 == 3618) {
										anIntArray584[anInt10074++] = Static94.aByte24;
										return;
									}
									if (arg0 == 3619) {
										local3978 = aStringArray51[--anInt10073];
										Static467.method6392(local3978);
										return;
									}
									if (arg0 == 3620) {
										Static205.method3537();
										return;
									}
									if (arg0 == 3621) {
										if (Static181.anInt3976 == 0) {
											anIntArray584[anInt10074++] = -1;
											return;
										}
										anIntArray584[anInt10074++] = Static336.anInt6067;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray584[--anInt10074];
										if (Static181.anInt3976 != 0 && local13 < Static336.anInt6067) {
											aStringArray51[anInt10073++] = Static101.aStringArray10[local13];
											if (Static554.aStringArray46[local13] != null) {
												aStringArray51[anInt10073++] = Static554.aStringArray46[local13];
												return;
											}
											aStringArray51[anInt10073++] = "";
											return;
										}
										aStringArray51[anInt10073++] = "";
										aStringArray51[anInt10073++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3978 = aStringArray51[--anInt10073];
										if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
											local3978 = local3978.substring(7);
										}
										anIntArray584[anInt10074++] = Static121.method2333(local3978) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray584[--anInt10074];
										if (Static131.aClass74Array1 != null && local13 < Static260.anInt5022 && Static131.aClass74Array1[local13].aString58.equalsIgnoreCase(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aString183)) {
											anIntArray584[anInt10074++] = 1;
											return;
										}
										anIntArray584[anInt10074++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static493.aString228 != null) {
											aStringArray51[anInt10073++] = Static493.aString228;
											return;
										}
										aStringArray51[anInt10073++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray584[--anInt10074];
										if (Static253.aString120 != null && local13 < Static260.anInt5022) {
											aStringArray51[anInt10073++] = Static131.aClass74Array1[local13].aString61;
											return;
										}
										aStringArray51[anInt10073++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray584[--anInt10074];
										if (Static181.anInt3976 == 2 && local13 >= 0 && local13 < Static372.anInt6493) {
											anIntArray584[anInt10074++] = Static506.aBooleanArray27[local13] ? 1 : 0;
											return;
										}
										anIntArray584[anInt10074++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3978 = aStringArray51[--anInt10073];
										if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
											local3978 = local3978.substring(7);
										}
										anIntArray584[anInt10074++] = Static117.method2296(local3978);
										return;
									}
									if (arg0 == 3629) {
										anIntArray584[anInt10074++] = Static234.anInt10334;
										return;
									}
									if (arg0 == 3630) {
										local3978 = aStringArray51[--anInt10073];
										Static137.method2663(true, local3978);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static82.aBooleanArray33[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray584[--anInt10074];
										if (Static253.aString120 != null && local13 < Static260.anInt5022) {
											aStringArray51[anInt10073++] = Static131.aClass74Array1[local13].aString58;
											return;
										}
										aStringArray51[anInt10073++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray584[--anInt10074];
										if (Static181.anInt3976 != 0 && local13 < Static336.anInt6067) {
											aStringArray51[anInt10073++] = Static205.aStringArray17[local13];
											return;
										}
										aStringArray51[anInt10073++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static107.aClass275Array1[local13].method6189();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static107.aClass275Array1[local13].anInt7885;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static107.aClass275Array1[local13].anInt7890;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static107.aClass275Array1[local13].anInt7884;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static107.aClass275Array1[local13].anInt7888;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static107.aClass275Array1[local13].anInt7889;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray584[--anInt10074];
										local19 = Static107.aClass275Array1[local13].method6188();
										anIntArray584[anInt10074++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray584[--anInt10074];
										local19 = Static107.aClass275Array1[local13].method6188();
										anIntArray584[anInt10074++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray584[--anInt10074];
										local19 = Static107.aClass275Array1[local13].method6188();
										anIntArray584[anInt10074++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray584[--anInt10074];
										local19 = Static107.aClass275Array1[local13].method6188();
										anIntArray584[anInt10074++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt10074 -= 5;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										local25 = anIntArray584[anInt10074 + 2];
										local353 = anIntArray584[anInt10074 + 3];
										local2309 = anIntArray584[anInt10074 + 4];
										anIntArray584[anInt10074++] = local13 + (local19 - local13) * (local2309 - local25) / (local353 - local25);
										return;
									}
									@Pc(7361) long local7361;
									@Pc(7354) long local7354;
									if (arg0 == 4007) {
										anInt10074 -= 2;
										local7354 = anIntArray584[anInt10074];
										local7361 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = (int) (local7354 + local7354 * local7361 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										if (local13 == 0) {
											anIntArray584[anInt10074++] = 0;
											return;
										}
										anIntArray584[anInt10074++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										if (local13 == 0) {
											anIntArray584[anInt10074++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray584[anInt10074++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray584[anInt10074++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt10074 -= 3;
										local7354 = anIntArray584[anInt10074];
										local7361 = anIntArray584[anInt10074 + 1];
										@Pc(7742) long local7742 = (long) anIntArray584[anInt10074 + 2];
										anIntArray584[anInt10074++] = (int) (local7354 * local7742 / local7361);
										return;
									}
									if (arg0 == 4019) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										if (local13 > 700 || local19 > 700) {
											anIntArray584[anInt10074++] = 256;
										}
										@Pc(7801) double local7801 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
										anIntArray584[anInt10074++] = (int) (Math.pow(2.0D, local7801) + 0.5D);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3978 = aStringArray51[--anInt10073];
										local19 = anIntArray584[--anInt10074];
										aStringArray51[anInt10073++] = local3978 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt10073 -= 2;
										local3978 = aStringArray51[anInt10073];
										local1145 = aStringArray51[anInt10073 + 1];
										aStringArray51[anInt10073++] = local3978 + local1145;
										return;
									}
									if (arg0 == 4102) {
										local3978 = aStringArray51[--anInt10073];
										local19 = anIntArray584[--anInt10074];
										aStringArray51[anInt10073++] = local3978 + Static66.method1638(local19);
										return;
									}
									if (arg0 == 4103) {
										local3978 = aStringArray51[--anInt10073];
										aStringArray51[anInt10073++] = local3978.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray51[anInt10073++] = method7920(anIntArray584[--anInt10074]);
										return;
									}
									if (arg0 == 4105) {
										anInt10073 -= 2;
										local3978 = aStringArray51[anInt10073];
										local1145 = aStringArray51[anInt10073 + 1];
										if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aClass131_1 != null && Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aClass131_1.aBoolean285) {
											aStringArray51[anInt10073++] = local1145;
											return;
										}
										aStringArray51[anInt10073++] = local3978;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray584[--anInt10074];
										aStringArray51[anInt10073++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt10073 -= 2;
										anIntArray584[anInt10074++] = Static102.method2107(aStringArray51[anInt10073], Static201.anInt4321, aStringArray51[anInt10073 + 1]);
										return;
									}
									@Pc(8084) Class328 local8084;
									if (arg0 == 4108) {
										local3978 = aStringArray51[--anInt10073];
										anInt10074 -= 2;
										local19 = anIntArray584[anInt10074];
										local25 = anIntArray584[anInt10074 + 1];
										local8084 = Static33.method484(Static336.aClass284_99, local25);
										anIntArray584[anInt10074++] = local8084.method7373(local19, local3978, Static459.aClass73Array12);
										return;
									}
									if (arg0 == 4109) {
										local3978 = aStringArray51[--anInt10073];
										anInt10074 -= 2;
										local19 = anIntArray584[anInt10074];
										local25 = anIntArray584[anInt10074 + 1];
										local8084 = Static33.method484(Static336.aClass284_99, local25);
										anIntArray584[anInt10074++] = local8084.method7368(Static459.aClass73Array12, local3978, local19);
										return;
									}
									if (arg0 == 4110) {
										anInt10073 -= 2;
										local3978 = aStringArray51[anInt10073];
										local1145 = aStringArray51[anInt10073 + 1];
										if (anIntArray584[--anInt10074] == 1) {
											aStringArray51[anInt10073++] = local3978;
											return;
										}
										aStringArray51[anInt10073++] = local1145;
										return;
									}
									if (arg0 == 4111) {
										local3978 = aStringArray51[--anInt10073];
										aStringArray51[anInt10073++] = Static554.method7609(local3978);
										return;
									}
									if (arg0 == 4112) {
										local3978 = aStringArray51[--anInt10073];
										local19 = anIntArray584[--anInt10074];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray51[anInt10073++] = local3978 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static320.method4726((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static228.method3730((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static225.method3707((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static126.method2373((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3978 = aStringArray51[--anInt10073];
										if (local3978 != null) {
											anIntArray584[anInt10074++] = local3978.length();
											return;
										}
										anIntArray584[anInt10074++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3978 = aStringArray51[--anInt10073];
										anInt10074 -= 2;
										local19 = anIntArray584[anInt10074];
										local25 = anIntArray584[anInt10074 + 1];
										aStringArray51[anInt10073++] = local3978.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3978 = aStringArray51[--anInt10073];
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
										aStringArray51[anInt10073++] = local8447.toString();
										return;
									}
									if (arg0 == 4120) {
										local3978 = aStringArray51[--anInt10073];
										anInt10074 -= 2;
										local19 = anIntArray584[anInt10074];
										local25 = anIntArray584[anInt10074 + 1];
										anIntArray584[anInt10074++] = local3978.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt10073 -= 2;
										local3978 = aStringArray51[anInt10073];
										local1145 = aStringArray51[anInt10073 + 1];
										local25 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = local3978.indexOf(local1145, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray584[--anInt10074] != 0;
										local19 = anIntArray584[--anInt10074];
										aStringArray51[anInt10073++] = Static338.method4929((long) local19, local412, Static201.anInt4321, 0);
										return;
									}
									if (arg0 == 4125) {
										local3978 = aStringArray51[--anInt10073];
										local19 = anIntArray584[--anInt10074];
										@Pc(8670) Class328 local8670 = Static33.method484(Static336.aClass284_99, local19);
										anIntArray584[anInt10074++] = local8670.method7376(Static459.aClass73Array12, local3978);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray584[--anInt10074];
										aStringArray51[anInt10073++] = Static272.aClass121_2.method3327(local13).aString106;
										return;
									}
									@Pc(8732) Class133 local8732;
									if (arg0 == 4201) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										local8732 = Static272.aClass121_2.method3327(local13);
										if (local19 >= 1 && local19 <= 5 && local8732.aStringArray18[local19 - 1] != null) {
											aStringArray51[anInt10073++] = local8732.aStringArray18[local19 - 1];
											return;
										}
										aStringArray51[anInt10073++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										local8732 = Static272.aClass121_2.method3327(local13);
										if (local19 >= 1 && local19 <= 5 && local8732.aStringArray19[local19 - 1] != null) {
											aStringArray51[anInt10073++] = local8732.aStringArray19[local19 - 1];
											return;
										}
										aStringArray51[anInt10073++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static272.aClass121_2.method3327(local13).anInt4397;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static272.aClass121_2.method3327(local13).anInt4411 == 1 ? 1 : 0;
										return;
									}
									@Pc(8895) Class133 local8895;
									if (arg0 == 4205) {
										local13 = anIntArray584[--anInt10074];
										local8895 = Static272.aClass121_2.method3327(local13);
										if (local8895.anInt4388 == -1 && local8895.anInt4427 >= 0) {
											anIntArray584[anInt10074++] = local8895.anInt4427;
											return;
										}
										anIntArray584[anInt10074++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray584[--anInt10074];
										local8895 = Static272.aClass121_2.method3327(local13);
										if (local8895.anInt4388 >= 0 && local8895.anInt4427 >= 0) {
											anIntArray584[anInt10074++] = local8895.anInt4427;
											return;
										}
										anIntArray584[anInt10074++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static272.aClass121_2.method3327(local13).aBoolean290 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										local3043 = Static106.aClass27_1.method483(local19);
										if (local3043.method1208()) {
											aStringArray51[anInt10073++] = Static272.aClass121_2.method3327(local13).method3550(local19, local3043.aString27);
											return;
										}
										anIntArray584[anInt10074++] = Static272.aClass121_2.method3327(local13).method3549(local3043.anInt1311, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1] - 1;
										local8732 = Static272.aClass121_2.method3327(local13);
										if (local8732.anInt4421 == local19) {
											anIntArray584[anInt10074++] = local8732.anInt4389;
											return;
										}
										if (local8732.anInt4422 == local19) {
											anIntArray584[anInt10074++] = local8732.anInt4424;
											return;
										}
										anIntArray584[anInt10074++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3978 = aStringArray51[--anInt10073];
										local19 = anIntArray584[--anInt10074];
										Static407.method5746(local19 == 1, local3978);
										anIntArray584[anInt10074++] = Static121.anInt2822;
										return;
									}
									if (arg0 == 4211) {
										if (Static214.aShortArray72 != null && Static495.anInt8603 < Static121.anInt2822) {
											anIntArray584[anInt10074++] = Static214.aShortArray72[Static495.anInt8603++] & 0xFFFF;
											return;
										}
										anIntArray584[anInt10074++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static495.anInt8603 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray584[--anInt10074];
										anIntArray584[anInt10074++] = Static272.aClass121_2.method3327(local13).anInt4409;
										return;
									}
									if (arg0 == 4214) {
										local3978 = aStringArray51[--anInt10073];
										anInt10074 -= 3;
										local19 = anIntArray584[anInt10074];
										local25 = anIntArray584[anInt10074 + 1];
										local353 = anIntArray584[anInt10074 + 2];
										Static283.method4265(local3978, local353, local19 == 1, local25);
										anIntArray584[anInt10074++] = Static121.anInt2822;
										return;
									}
									if (arg0 == 4215) {
										anInt10073 -= 2;
										anInt10074 -= 2;
										local3978 = aStringArray51[anInt10073];
										local19 = anIntArray584[anInt10074];
										local25 = anIntArray584[anInt10074 + 1];
										@Pc(9294) String local9294 = aStringArray51[anInt10073 + 1];
										Static151.method2839(local9294, local25, local3978, local19 == 1);
										anIntArray584[anInt10074++] = Static121.anInt2822;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										local3043 = Static106.aClass27_1.method483(local19);
										if (local3043.method1208()) {
											aStringArray51[anInt10073++] = Static181.aClass60_1.method1797(local13).method5004(local19, local3043.aString27);
											return;
										}
										anIntArray584[anInt10074++] = Static181.aClass60_1.method1797(local13).method5005(local19, local3043.anInt1311);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										local3043 = Static106.aClass27_1.method483(local19);
										if (local3043.method1208()) {
											aStringArray51[anInt10073++] = Static536.aClass146_4.method3721(local13).method4700(local3043.aString27, local19);
											return;
										}
										anIntArray584[anInt10074++] = Static536.aClass146_4.method3721(local13).method4694(local19, local3043.anInt1311);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt10074 -= 2;
										local13 = anIntArray584[anInt10074];
										local19 = anIntArray584[anInt10074 + 1];
										local3043 = Static106.aClass27_1.method483(local19);
										if (local3043.method1208()) {
											aStringArray51[anInt10073++] = Static326.aClass7_1.method62(local13).method4066(local3043.aString27, local19);
											return;
										}
										anIntArray584[anInt10074++] = Static326.aClass7_1.method62(local13).method4071(local3043.anInt1311, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray584[--anInt10074];
									@Pc(9522) Class122 local9522 = Static98.aClass313_1.method6864(local13);
									if (local9522.anIntArray185 != null && local9522.anIntArray185.length > 0) {
										local25 = 0;
										local353 = local9522.anIntArray182[0];
										for (local2309 = 1; local2309 < local9522.anIntArray185.length; local2309++) {
											if (local9522.anIntArray182[local2309] > local353) {
												local25 = local2309;
												local353 = local9522.anIntArray182[local2309];
											}
										}
										anIntArray584[anInt10074++] = local9522.anIntArray185[local25];
										return;
									}
									anIntArray584[anInt10074++] = local9522.anInt4224;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static105.method2180(anIntArray584[--anInt10074]);
					} else {
						local137 = arg1 ? aClass251_16 : aClass251_15;
					}
					Static588.method8016(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt10074 -= 2;
						local19 = anIntArray584[anInt10074];
						local25 = anIntArray584[anInt10074 + 1];
						if (local137.anInt7268 == -1) {
							Static369.method5229(local137.anInt7279);
							Static414.method5812(local137.anInt7279);
							Static422.method5874(local137.anInt7279);
						}
						if (local19 == -1) {
							local137.anInt7288 = 1;
							local137.anInt7229 = -1;
							local137.anInt7254 = -1;
							return;
						}
						local137.anInt7254 = local19;
						local137.anInt7248 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean513 = true;
						} else {
							local137.aBoolean513 = false;
						}
						@Pc(1649) Class133 local1649 = Static272.aClass121_2.method3327(local19);
						local137.anInt7252 = local1649.anInt4387;
						local137.anInt7269 = local1649.anInt4395;
						local137.anInt7262 = local1649.anInt4401;
						local137.anInt7237 = local1649.anInt4435;
						local137.anInt7260 = local1649.anInt4426;
						local137.anInt7210 = local1649.anInt4445;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt7253 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt7253 = 1;
						} else {
							local137.anInt7253 = 2;
						}
						if (local137.anInt7220 > 0) {
							local137.anInt7210 = local137.anInt7210 * 32 / local137.anInt7220;
							return;
						}
						if (local137.anInt7204 > 0) {
							local137.anInt7210 = local137.anInt7210 * 32 / local137.anInt7204;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt7288 = 2;
						local137.anInt7229 = anIntArray584[--anInt10074];
						if (local137.anInt7268 == -1) {
							Static566.method7706(local137.anInt7279);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt7288 = 3;
						local137.anInt7229 = -1;
						if (local137.anInt7268 == -1) {
							Static566.method7706(local137.anInt7279);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt7288 = 6;
						local137.anInt7229 = anIntArray584[--anInt10074];
						if (local137.anInt7268 == -1) {
							Static566.method7706(local137.anInt7279);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt7288 = 5;
						local137.anInt7229 = anIntArray584[--anInt10074];
						if (local137.anInt7268 == -1) {
							Static566.method7706(local137.anInt7279);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt10074 -= 4;
						local137.anInt7277 = anIntArray584[anInt10074];
						local137.anInt7245 = anIntArray584[anInt10074 + 1];
						local137.anInt7256 = anIntArray584[anInt10074 + 2];
						local137.anInt7235 = anIntArray584[anInt10074 + 3];
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt10074 -= 2;
						local137.anInt7232 = anIntArray584[anInt10074];
						local137.anInt7244 = anIntArray584[anInt10074 + 1];
						Static588.method8016(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt10074 -= 4;
						local137.anInt7229 = anIntArray584[anInt10074];
						local137.anInt7219 = anIntArray584[anInt10074 + 1];
						if (anIntArray584[anInt10074 + 2] == 1) {
							local137.anInt7288 = 9;
						} else {
							local137.anInt7288 = 8;
						}
						if (anIntArray584[anInt10074 + 3] == 1) {
							local137.aBoolean513 = true;
						} else {
							local137.aBoolean513 = false;
						}
						if (local137.anInt7268 == -1) {
							Static566.method7706(local137.anInt7279);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt7288 = 5;
						local137.anInt7229 = Static147.anInt3433;
						local137.anInt7219 = 0;
						if (local137.anInt7268 == -1) {
							Static566.method7706(local137.anInt7279);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static105.method2180(anIntArray584[--anInt10074]);
				} else {
					local137 = arg1 ? aClass251_16 : aClass251_15;
				}
				if (arg0 == 1000) {
					anInt10074 -= 4;
					local137.anInt7217 = anIntArray584[anInt10074];
					local137.anInt7289 = anIntArray584[anInt10074 + 1];
					local19 = anIntArray584[anInt10074 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray584[anInt10074 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte111 = (byte) local19;
					local137.aByte112 = (byte) local25;
					Static588.method8016(local137);
					Static519.method7215(local137);
					if (local137.anInt7268 == -1) {
						Static556.method7413(local137.anInt7279);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt10074 -= 4;
					local137.anInt7204 = anIntArray584[anInt10074];
					local137.anInt7241 = anIntArray584[anInt10074 + 1];
					local137.anInt7220 = 0;
					local137.anInt7261 = 0;
					local19 = anIntArray584[anInt10074 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray584[anInt10074 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte110 = (byte) local19;
					local137.aByte113 = (byte) local25;
					Static588.method8016(local137);
					Static519.method7215(local137);
					if (local137.anInt7231 == 0) {
						Static479.method6546(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray584[--anInt10074] == 1;
					if (local137.aBoolean507 != local645) {
						local137.aBoolean507 = local645;
						Static588.method8016(local137);
					}
					if (local137.anInt7268 == -1) {
						Static231.method3762(local137.anInt7279);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt10074 -= 2;
					local137.anInt7230 = anIntArray584[anInt10074];
					local137.anInt7218 = anIntArray584[anInt10074 + 1];
					Static588.method8016(local137);
					Static519.method7215(local137);
					if (local137.anInt7231 == 0) {
						Static479.method6546(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean504 = anIntArray584[--anInt10074] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!jo;II)V")
	public static void method7931(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub7_Sub18 local5 = Static475.method6514(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray582 = new int[local5.anInt9346];
		aStringArray50 = new String[local5.anInt9344];
		if (local5.aClass161_9 == Static173.aClass161_2 || local5.aClass161_9 == Static1.aClass161_1 || local5.aClass161_9 == Static410.aClass161_8) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static389.aClass251_13 != null) {
				local30 = Static389.aClass251_13.anInt7224;
				local32 = Static389.aClass251_13.anInt7281;
			}
			anIntArray582[0] = Static234.aClass54_4.method7306() - local30;
			anIntArray582[1] = Static234.aClass54_4.method7315() - local32;
		}
		method7923(local5, 200000);
	}
}
