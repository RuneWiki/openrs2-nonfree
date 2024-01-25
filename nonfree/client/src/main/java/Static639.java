import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "Lclient!dm;")
	private static Class78 aClass78_13;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "Lclient!gm;")
	private static Class133 aClass133_1;

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "[I")
	private static int[] anIntArray736;

	@OriginalMember(owner = "client!ws", name = "q", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray45;

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "Lclient!dm;")
	private static Class78 aClass78_14;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
	private static int anInt10218 = 0;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "[Lclient!kia;")
	private static final Class191[] aClass191Array1 = new Class191[50];

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "[I")
	private static final int[] anIntArray735 = new int[1000];

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
	private static int anInt10220 = 0;

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
	private static int anInt10223 = 0;

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "[[I")
	private static final int[][] anIntArrayArray105 = new int[5][5000];

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "[I")
	private static final int[] anIntArray737 = new int[5];

	@OriginalMember(owner = "client!ws", name = "t", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray46 = new String[1000];

	@OriginalMember(owner = "client!ws", name = "y", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_63 = new Class233(4);

	@OriginalMember(owner = "client!ws", name = "A", descriptor = "[I")
	private static final int[] anIntArray738 = new int[3];

	@OriginalMember(owner = "client!ws", name = "C", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray47 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
	private static int anInt10232 = 0;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!raa;)V")
	public static void method8539(@OriginalArg(0) Class2_Sub42 arg0) {
		method8549(arg0, 200000);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	private static void method8540(@OriginalArg(0) int arg0) {
		@Pc(3) Class78 local3 = Static180.method3291(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class78[] local13 = Static629.aClass78ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class78[] local19 = Static399.aClass78ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static629.aClass78ArrayArray2[local9] = new Class78[local22];
			Static649.method4860(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static649.method4860(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(C)I")
	private static int method8542(@OriginalArg(0) char arg0) {
		return Static641.method8572(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IZ)V")
	private static void method8543(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class2_Sub50 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray735[anInt10218++] = Static339.anInt6232;
				return;
			}
			if (arg0 == 5001) {
				anInt10218 -= 3;
				Static339.anInt6232 = anIntArray735[anInt10218];
				Static363.aClass159_4 = Static86.method1552(anIntArray735[anInt10218 + 1]);
				if (Static363.aClass159_4 == null) {
					Static363.aClass159_4 = Static151.aClass159_3;
				}
				Static21.anInt688 = anIntArray735[anInt10218 + 2];
				local52 = Static595.method8194(Static610.aClass310_2, Static642.aClass269_98);
				local52.aClass2_Sub34_Sub2_2.method6894(Static339.anInt6232);
				local52.aClass2_Sub34_Sub2_2.method6894(Static363.aClass159_4.anInt4703);
				local52.aClass2_Sub34_Sub2_2.method6894(Static21.anInt688);
				Static311.method4754(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt10220 -= 2;
				local83 = aStringArray46[anInt10220];
				local89 = aStringArray46[anInt10220 + 1];
				anInt10218 -= 2;
				local97 = anIntArray735[anInt10218];
				local103 = anIntArray735[anInt10218 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class2_Sub50 local125 = Static595.method8194(Static610.aClass310_2, Static531.aClass269_86);
				local125.aClass2_Sub34_Sub2_2.method6894(Static163.method3038(local83) + Static163.method3038(local89) + 2);
				local125.aClass2_Sub34_Sub2_2.method6918(local83);
				local125.aClass2_Sub34_Sub2_2.method6894(local97 - 1);
				local125.aClass2_Sub34_Sub2_2.method6894(local103);
				local125.aClass2_Sub34_Sub2_2.method6918(local89);
				Static311.method4754(local125);
				return;
			}
			@Pc(179) Class368 local179;
			if (arg0 == 5003) {
				local175 = anIntArray735[--anInt10218];
				local179 = Static592.method8162(local175);
				local181 = "";
				if (local179 != null && local179.aString103 != null) {
					local181 = local179.aString103;
				}
				aStringArray46[anInt10220++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray735[--anInt10218];
				local179 = Static592.method8162(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt10122;
				}
				anIntArray735[anInt10218++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static363.aClass159_4 == null) {
					anIntArray735[anInt10218++] = -1;
					return;
				}
				anIntArray735[anInt10218++] = Static363.aClass159_4.anInt4703;
				return;
			}
			@Pc(269) Class2_Sub50 local269;
			if (arg0 == 5006) {
				local175 = anIntArray735[--anInt10218];
				local269 = Static595.method8194(Static610.aClass310_2, Static34.aClass269_5);
				local269.aClass2_Sub34_Sub2_2.method6894(local175);
				Static311.method4754(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray46[--anInt10220];
				method8544(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt10220 -= 2;
				local83 = aStringArray46[anInt10220];
				local89 = aStringArray46[anInt10220 + 1];
				if (Static278.anInt5322 != 0 || (!Static95.aBoolean160 || Static392.aBoolean523) && !Static408.aBoolean565) {
					@Pc(328) Class2_Sub50 local328 = Static595.method8194(Static610.aClass310_2, Static211.aClass269_71);
					local328.aClass2_Sub34_Sub2_2.method6894(0);
					local103 = local328.aClass2_Sub34_Sub2_2.anInt8188;
					local328.aClass2_Sub34_Sub2_2.method6918(local83);
					Static283.method4471(local89, local328.aClass2_Sub34_Sub2_2);
					local328.aClass2_Sub34_Sub2_2.method6861(local328.aClass2_Sub34_Sub2_2.anInt8188 - local103);
					Static311.method4754(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray735[--anInt10218];
				local179 = Static592.method8162(local175);
				local181 = "";
				if (local179 != null && local179.aString106 != null) {
					local181 = local179.aString106;
				}
				aStringArray46[anInt10220++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray735[--anInt10218];
				local179 = Static592.method8162(local175);
				local181 = "";
				if (local179 != null && local179.aString104 != null) {
					local181 = local179.aString104;
				}
				aStringArray46[anInt10220++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray735[--anInt10218];
				local179 = Static592.method8162(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt10128;
				}
				anIntArray735[anInt10218++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 == null || Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aString3 == null) {
					local83 = "";
				} else {
					local83 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.method421();
				}
				aStringArray46[anInt10220++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray735[anInt10218++] = Static21.anInt688;
				return;
			}
			if (arg0 == 5017) {
				anIntArray735[anInt10218++] = Static91.method1612();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray735[--anInt10218];
				local179 = Static592.method8162(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt10125;
				}
				anIntArray735[anInt10218++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray735[--anInt10218];
				local179 = Static592.method8162(local175);
				local181 = "";
				if (local179 != null && local179.aString105 != null) {
					local181 = local179.aString105;
				}
				aStringArray46[anInt10220++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 == null || Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aString3 == null) {
					local83 = "";
				} else {
					local83 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.method425();
				}
				aStringArray46[anInt10220++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray735[--anInt10218];
				local179 = Static592.method8162(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt10123;
				}
				anIntArray735[anInt10218++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray735[--anInt10218];
				local179 = Static592.method8162(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt10126;
				}
				anIntArray735[anInt10218++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray735[--anInt10218];
				local179 = Static592.method8162(local175);
				local181 = "";
				if (local179 != null && local179.aString107 != null) {
					local181 = local179.aString107;
				}
				aStringArray46[anInt10220++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray735[--anInt10218];
				aStringArray46[anInt10220++] = Static239.aClass180_6.method4394(local175).aString53;
				return;
			}
			@Pc(736) Class2_Sub5_Sub11 local736;
			if (arg0 == 5051) {
				local175 = anIntArray735[--anInt10218];
				local736 = Static239.aClass180_6.method4394(local175);
				if (local736.anIntArray361 == null) {
					anIntArray735[anInt10218++] = 0;
					return;
				}
				anIntArray735[anInt10218++] = local736.anIntArray361.length;
				return;
			}
			if (arg0 == 5052) {
				anInt10218 -= 2;
				local175 = anIntArray735[anInt10218];
				local776 = anIntArray735[anInt10218 + 1];
				@Pc(781) Class2_Sub5_Sub11 local781 = Static239.aClass180_6.method4394(local175);
				local103 = local781.anIntArray361[local776];
				anIntArray735[anInt10218++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray735[--anInt10218];
				local736 = Static239.aClass180_6.method4394(local175);
				if (local736.anIntArray360 == null) {
					anIntArray735[anInt10218++] = 0;
					return;
				}
				anIntArray735[anInt10218++] = local736.anIntArray360.length;
				return;
			}
			if (arg0 == 5054) {
				anInt10218 -= 2;
				local175 = anIntArray735[anInt10218];
				local776 = anIntArray735[anInt10218 + 1];
				anIntArray735[anInt10218++] = Static239.aClass180_6.method4394(local175).anIntArray360[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray735[--anInt10218];
				aStringArray46[anInt10220++] = Static249.aClass111_1.method2928(local175).method6305();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray735[--anInt10218];
				@Pc(907) Class2_Sub5_Sub17 local907 = Static249.aClass111_1.method2928(local175);
				if (local907.anIntArray508 == null) {
					anIntArray735[anInt10218++] = 0;
					return;
				}
				anIntArray735[anInt10218++] = local907.anIntArray508.length;
				return;
			}
			if (arg0 == 5057) {
				anInt10218 -= 2;
				local175 = anIntArray735[anInt10218];
				local776 = anIntArray735[anInt10218 + 1];
				anIntArray735[anInt10218++] = Static249.aClass111_1.method2928(local175).anIntArray508[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass133_1 = new Class133();
				aClass133_1.anInt4054 = anIntArray735[--anInt10218];
				aClass133_1.aClass2_Sub5_Sub17_1 = Static249.aClass111_1.method2928(aClass133_1.anInt4054);
				aClass133_1.anIntArray279 = new int[aClass133_1.aClass2_Sub5_Sub17_1.method6308()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static595.method8194(Static610.aClass310_2, Static560.aClass269_90);
				local52.aClass2_Sub34_Sub2_2.method6894(0);
				local776 = local52.aClass2_Sub34_Sub2_2.anInt8188;
				local52.aClass2_Sub34_Sub2_2.method6894(0);
				local52.aClass2_Sub34_Sub2_2.method6854(aClass133_1.anInt4054);
				aClass133_1.aClass2_Sub5_Sub17_1.method6303(aClass133_1.anIntArray279, local52.aClass2_Sub34_Sub2_2);
				local52.aClass2_Sub34_Sub2_2.method6861(local52.aClass2_Sub34_Sub2_2.anInt8188 - local776);
				Static311.method4754(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray46[--anInt10220];
				local269 = Static595.method8194(Static610.aClass310_2, Static146.aClass269_35);
				local269.aClass2_Sub34_Sub2_2.method6894(0);
				local97 = local269.aClass2_Sub34_Sub2_2.anInt8188;
				local269.aClass2_Sub34_Sub2_2.method6918(local83);
				local269.aClass2_Sub34_Sub2_2.method6854(aClass133_1.anInt4054);
				aClass133_1.aClass2_Sub5_Sub17_1.method6303(aClass133_1.anIntArray279, local269.aClass2_Sub34_Sub2_2);
				local269.aClass2_Sub34_Sub2_2.method6861(local269.aClass2_Sub34_Sub2_2.anInt8188 - local97);
				Static311.method4754(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static595.method8194(Static610.aClass310_2, Static560.aClass269_90);
				local52.aClass2_Sub34_Sub2_2.method6894(0);
				local776 = local52.aClass2_Sub34_Sub2_2.anInt8188;
				local52.aClass2_Sub34_Sub2_2.method6894(1);
				local52.aClass2_Sub34_Sub2_2.method6854(aClass133_1.anInt4054);
				aClass133_1.aClass2_Sub5_Sub17_1.method6303(aClass133_1.anIntArray279, local52.aClass2_Sub34_Sub2_2);
				local52.aClass2_Sub34_Sub2_2.method6861(local52.aClass2_Sub34_Sub2_2.anInt8188 - local776);
				Static311.method4754(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt10218 -= 2;
				local175 = anIntArray735[anInt10218];
				local776 = anIntArray735[anInt10218 + 1];
				anIntArray735[anInt10218++] = Static239.aClass180_6.method4394(local175).aCharArray7[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt10218 -= 2;
				local175 = anIntArray735[anInt10218];
				local776 = anIntArray735[anInt10218 + 1];
				anIntArray735[anInt10218++] = Static239.aClass180_6.method4394(local175).aCharArray6[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt10218 -= 2;
				local175 = anIntArray735[anInt10218];
				local776 = anIntArray735[anInt10218 + 1];
				if (local776 == -1) {
					anIntArray735[anInt10218++] = -1;
					return;
				}
				anIntArray735[anInt10218++] = Static239.aClass180_6.method4394(local175).method4417((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt10218 -= 2;
				local175 = anIntArray735[anInt10218];
				local776 = anIntArray735[anInt10218 + 1];
				if (local776 == -1) {
					anIntArray735[anInt10218++] = -1;
					return;
				}
				anIntArray735[anInt10218++] = Static239.aClass180_6.method4394(local175).method4415((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray735[--anInt10218];
				anIntArray735[anInt10218++] = Static249.aClass111_1.method2928(local175).method6308();
				return;
			}
			if (arg0 == 5067) {
				anInt10218 -= 2;
				local175 = anIntArray735[anInt10218];
				local776 = anIntArray735[anInt10218 + 1];
				local97 = Static249.aClass111_1.method2928(local175).method6310(local776).anInt7930;
				anIntArray735[anInt10218++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt10218 -= 2;
				local175 = anIntArray735[anInt10218];
				local776 = anIntArray735[anInt10218 + 1];
				aClass133_1.anIntArray279[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt10218 -= 2;
				local175 = anIntArray735[anInt10218];
				local776 = anIntArray735[anInt10218 + 1];
				aClass133_1.anIntArray279[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt10218 -= 3;
				local175 = anIntArray735[anInt10218];
				local776 = anIntArray735[anInt10218 + 1];
				local97 = anIntArray735[anInt10218 + 2];
				@Pc(1448) Class2_Sub5_Sub17 local1448 = Static249.aClass111_1.method2928(local175);
				if (local1448.method6310(local776).anInt7930 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray735[anInt10218++] = local1448.method6311(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray46[--anInt10220];
				local1496 = anIntArray735[--anInt10218] == 1;
				Static475.method7383(local83, local1496);
				anIntArray735[anInt10218++] = Static214.anInt4435;
				return;
			}
			if (arg0 == 5072) {
				if (Static275.aShortArray60 != null && Static291.anInt5470 < Static214.anInt4435) {
					anIntArray735[anInt10218++] = Static275.aShortArray60[Static291.anInt5470++] & 0xFFFF;
					return;
				}
				anIntArray735[anInt10218++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static291.anInt5470 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static63.aClass32_1.method789(86)) {
					anIntArray735[anInt10218++] = 1;
					return;
				}
				anIntArray735[anInt10218++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static63.aClass32_1.method789(82)) {
					anIntArray735[anInt10218++] = 1;
					return;
				}
				anIntArray735[anInt10218++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static63.aClass32_1.method789(81)) {
					anIntArray735[anInt10218++] = 1;
					return;
				}
				anIntArray735[anInt10218++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static424.method6416(anIntArray735[--anInt10218]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray735[anInt10218++] = Static512.method7217();
					return;
				}
				if (arg0 == 5205) {
					Static38.method828(-1, anIntArray735[--anInt10218], -1, false);
					return;
				}
				@Pc(1696) Class2_Sub5_Sub19 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray735[--anInt10218];
					local1696 = Static292.method7052(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray735[anInt10218++] = -1;
						return;
					}
					anIntArray735[anInt10218++] = local1696.anInt8662;
					return;
				}
				@Pc(1729) Class2_Sub5_Sub19 local1729;
				if (arg0 == 5207) {
					local1729 = Static292.method7034(anIntArray735[--anInt10218]);
					if (local1729 != null && local1729.aString78 != null) {
						aStringArray46[anInt10220++] = local1729.aString78;
						return;
					}
					aStringArray46[anInt10220++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray735[anInt10218++] = Static296.anInt5545;
					anIntArray735[anInt10218++] = Static336.anInt6225;
					return;
				}
				if (arg0 == 5209) {
					anIntArray735[anInt10218++] = Static416.anInt7592 + Static292.anInt8373;
					anIntArray735[anInt10218++] = Static304.anInt5622 + Static292.anInt8380;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray735[--anInt10218];
					local1696 = Static292.method7034(local175);
					if (local1696 == null) {
						anIntArray735[anInt10218++] = 0;
						anIntArray735[anInt10218++] = 0;
						return;
					}
					anIntArray735[anInt10218++] = local1696.anInt8660 >> 14 & 0x3FFF;
					anIntArray735[anInt10218++] = local1696.anInt8660 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray735[--anInt10218];
					local1696 = Static292.method7034(local175);
					if (local1696 == null) {
						anIntArray735[anInt10218++] = 0;
						anIntArray735[anInt10218++] = 0;
						return;
					}
					anIntArray735[anInt10218++] = local1696.anInt8668 - local1696.anInt8671;
					anIntArray735[anInt10218++] = local1696.anInt8666 - local1696.anInt8669;
					return;
				}
				@Pc(1919) Class2_Sub36 local1919;
				if (arg0 == 5212) {
					local1919 = Static641.method8576();
					if (local1919 == null) {
						anIntArray735[anInt10218++] = -1;
						anIntArray735[anInt10218++] = -1;
						return;
					}
					anIntArray735[anInt10218++] = local1919.anInt6596;
					local776 = local1919.anInt6593 << 28 | local1919.anInt6587 + Static292.anInt8373 << 14 | local1919.anInt6590 + Static292.anInt8380;
					anIntArray735[anInt10218++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static245.method4035();
					if (local1919 == null) {
						anIntArray735[anInt10218++] = -1;
						anIntArray735[anInt10218++] = -1;
						return;
					}
					anIntArray735[anInt10218++] = local1919.anInt6596;
					local776 = local1919.anInt6593 << 28 | local1919.anInt6587 + Static292.anInt8373 << 14 | local1919.anInt6590 + Static292.anInt8380;
					anIntArray735[anInt10218++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray735[--anInt10218];
					local1696 = Static278.method4445();
					if (local1696 != null) {
						local2067 = local1696.method7276(local175 >> 14 & 0x3FFF, local175 >> 28 & 0x3, anIntArray738, local175 & 0x3FFF);
						if (local2067) {
							Static477.method6832(anIntArray738[1], anIntArray738[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt10218 -= 2;
					local175 = anIntArray735[anInt10218];
					local776 = anIntArray735[anInt10218 + 1];
					@Pc(2105) Class175 local2105 = Static292.method7030(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class2_Sub5_Sub19 local2112 = (Class2_Sub5_Sub19) local2105.method4280(); local2112 != null; local2112 = (Class2_Sub5_Sub19) local2105.method4288()) {
						if (local2112.anInt8662 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray735[anInt10218++] = 1;
						return;
					}
					anIntArray735[anInt10218++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray735[--anInt10218];
					local1696 = Static292.method7034(local175);
					if (local1696 == null) {
						anIntArray735[anInt10218++] = -1;
						return;
					}
					anIntArray735[anInt10218++] = local1696.anInt8665;
					return;
				}
				if (arg0 == 5220) {
					anIntArray735[anInt10218++] = Static334.anInt6170 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray735[--anInt10218];
					Static477.method6832(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static278.method4445();
					if (local1729 != null) {
						local1496 = local1729.method7275(Static304.anInt5622 + Static292.anInt8380, anIntArray738, Static416.anInt7592 + Static292.anInt8373);
						if (local1496) {
							anIntArray735[anInt10218++] = anIntArray738[1];
							anIntArray735[anInt10218++] = anIntArray738[2];
							return;
						}
						anIntArray735[anInt10218++] = -1;
						anIntArray735[anInt10218++] = -1;
						return;
					}
					anIntArray735[anInt10218++] = -1;
					anIntArray735[anInt10218++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt10218 -= 2;
					local175 = anIntArray735[anInt10218];
					local776 = anIntArray735[anInt10218 + 1];
					Static38.method828(local776 >> 14 & 0x3FFF, local175, local776 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray735[--anInt10218];
					local1696 = Static278.method4445();
					if (local1696 != null) {
						local2067 = local1696.method7276(local175 >> 14 & 0x3FFF, local175 >> 28 & 0x3, anIntArray738, local175 & 0x3FFF);
						if (local2067) {
							anIntArray735[anInt10218++] = anIntArray738[1];
							anIntArray735[anInt10218++] = anIntArray738[2];
							return;
						}
						anIntArray735[anInt10218++] = -1;
						anIntArray735[anInt10218++] = -1;
						return;
					}
					anIntArray735[anInt10218++] = -1;
					anIntArray735[anInt10218++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray735[--anInt10218];
					local1696 = Static278.method4445();
					if (local1696 != null) {
						local2067 = local1696.method7275(local175 & 0x3FFF, anIntArray738, local175 >> 14 & 0x3FFF);
						if (local2067) {
							anIntArray735[anInt10218++] = anIntArray738[1];
							anIntArray735[anInt10218++] = anIntArray738[2];
							return;
						}
						anIntArray735[anInt10218++] = -1;
						anIntArray735[anInt10218++] = -1;
						return;
					}
					anIntArray735[anInt10218++] = -1;
					anIntArray735[anInt10218++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static322.method4855(anIntArray735[--anInt10218]);
					return;
				}
				if (arg0 == 5227) {
					anInt10218 -= 2;
					local175 = anIntArray735[anInt10218];
					local776 = anIntArray735[anInt10218 + 1];
					Static38.method828(local776 >> 14 & 0x3FFF, local175, local776 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static185.aBoolean340 = anIntArray735[--anInt10218] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray735[anInt10218++] = Static185.aBoolean340 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray735[--anInt10218];
					Static509.method7200(local175);
					return;
				}
				@Pc(2625) Class2 local2625;
				if (arg0 == 5231) {
					anInt10218 -= 2;
					local175 = anIntArray735[anInt10218];
					local1496 = anIntArray735[anInt10218 + 1] == 1;
					if (Static133.aClass222_9 != null) {
						local2625 = Static133.aClass222_9.method5468((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8599();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class2();
							Static133.aClass222_9.method5476(local2625, (long) local175);
						}
					}
					return;
				}
				@Pc(2667) Class2 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray735[--anInt10218];
					if (Static133.aClass222_9 != null) {
						local2667 = Static133.aClass222_9.method5468((long) local175);
						anIntArray735[anInt10218++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray735[anInt10218++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt10218 -= 2;
					local175 = anIntArray735[anInt10218];
					local1496 = anIntArray735[anInt10218 + 1] == 1;
					if (Static34.aClass222_2 != null) {
						local2625 = Static34.aClass222_2.method5468((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8599();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class2();
							Static34.aClass222_2.method5476(local2625, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray735[--anInt10218];
					if (Static34.aClass222_2 != null) {
						local2667 = Static34.aClass222_2.method5468((long) local175);
						anIntArray735[anInt10218++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray735[anInt10218++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray735[anInt10218++] = Static292.aClass2_Sub5_Sub19_3 == null ? -1 : Static292.aClass2_Sub5_Sub19_3.anInt8662;
					return;
				}
				if (arg0 == 5236) {
					anInt10218 -= 2;
					local175 = anIntArray735[anInt10218];
					local776 = anIntArray735[anInt10218 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static39.method8157(local103, local97, local175);
					if (local2833 < 0) {
						anIntArray735[anInt10218++] = -1;
						return;
					}
					anIntArray735[anInt10218++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static199.method3504();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt10218 -= 2;
					local175 = anIntArray735[anInt10218];
					local776 = anIntArray735[anInt10218 + 1];
					Static227.method3850(3, false, local776, local175);
					anIntArray735[anInt10218++] = Static275.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static275.aFrame2 != null) {
						Static227.method3850(Static404.aClass2_Sub13_2.aClass33_Sub7_2.method3189(), false, -1, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2919) Class38[] local2919 = Static374.method5639();
					anIntArray735[anInt10218++] = local2919.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray735[--anInt10218];
					@Pc(2943) Class38[] local2943 = Static374.method5639();
					anIntArray735[anInt10218++] = local2943[local175].anInt978;
					anIntArray735[anInt10218++] = local2943[local175].anInt972;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static457.anInt7976;
					local776 = Static44.anInt970;
					local97 = -1;
					@Pc(2978) Class38[] local2978 = Static374.method5639();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class38 local2985 = local2978[local2833];
						if (local2985.anInt978 == local175 && local2985.anInt972 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray735[anInt10218++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray735[anInt10218++] = Static501.method7132();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray735[--anInt10218];
					if (local175 >= 1 && local175 <= 2) {
						Static227.method3850(local175, false, -1, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub7_2.method3189();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray735[--anInt10218];
					if (local175 >= 1 && local175 <= 2) {
						Static404.aClass2_Sub13_2.method1383(local175, Static404.aClass2_Sub13_2.aClass33_Sub7_2);
						Static404.aClass2_Sub13_2.method1383(local175, Static404.aClass2_Sub13_2.aClass33_Sub7_1);
						Static209.method3628();
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt10220 -= 2;
					local83 = aStringArray46[anInt10220];
					local89 = aStringArray46[anInt10220 + 1];
					local97 = anIntArray735[--anInt10218];
					@Pc(3133) Class2_Sub50 local3133 = Static595.method8194(Static610.aClass310_2, Static503.aClass269_82);
					local3133.aClass2_Sub34_Sub2_2.method6894(Static163.method3038(local83) + Static163.method3038(local89) + 1);
					local3133.aClass2_Sub34_Sub2_2.method6918(local83);
					local3133.aClass2_Sub34_Sub2_2.method6918(local89);
					local3133.aClass2_Sub34_Sub2_2.method6894(local97);
					Static311.method4754(local3133);
					return;
				}
				if (arg0 == 5401) {
					anInt10218 -= 2;
					Static239.aShortArray108[anIntArray735[anInt10218]] = (short) Static380.method5723(anIntArray735[anInt10218 + 1]);
					Static570.aClass267_2.method6599();
					Static570.aClass267_2.method6593();
					Static341.aClass76_1.method1670();
					Static539.method7534();
					return;
				}
				if (arg0 == 5405) {
					anInt10218 -= 2;
					local175 = anIntArray735[anInt10218];
					local776 = anIntArray735[anInt10218 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static630.anIntArrayArrayArray20[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt10218 -= 7;
					local175 = anIntArray735[anInt10218];
					local776 = anIntArray735[anInt10218 + 1] << 1;
					local97 = anIntArray735[anInt10218 + 2];
					local103 = anIntArray735[anInt10218 + 3];
					local2833 = anIntArray735[anInt10218 + 4];
					@Pc(3271) int local3271 = anIntArray735[anInt10218 + 5];
					@Pc(3277) int local3277 = anIntArray735[anInt10218 + 6];
					if (local175 >= 0 && local175 < 2 && Static630.anIntArrayArrayArray20[local175] != null && local776 >= 0 && local776 < Static630.anIntArrayArrayArray20[local175].length) {
						Static630.anIntArrayArrayArray20[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3277 };
						Static630.anIntArrayArrayArray20[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3271 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static630.anIntArrayArrayArray20[anIntArray735[--anInt10218]].length >> 1;
					anIntArray735[anInt10218++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static275.aFrame2 != null) {
						Static227.method3850(Static404.aClass2_Sub13_2.aClass33_Sub7_2.method3189(), false, -1, -1);
					}
					if (Static503.aFrame3 != null) {
						Static76.method1454();
						System.exit(0);
						return;
					}
					local83 = Static115.aString28 == null ? Static515.method7240() : Static115.aString28;
					Static382.method5748(local83, Static375.aClass359_4, Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() == 1, false);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static258.aClass26_38 != null) {
						if (Static258.aClass26_38.anObject3 == null) {
							local83 = Static530.method7412(Static258.aClass26_38.anInt760);
						} else {
							local83 = (String) Static258.aClass26_38.anObject3;
						}
					}
					aStringArray46[anInt10220++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray735[anInt10218++] = Static375.aClass359_4.aBoolean729 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static275.aFrame2 != null) {
						Static227.method3850(Static404.aClass2_Sub13_2.aClass33_Sub7_2.method3189(), false, -1, -1);
					}
					local83 = aStringArray46[--anInt10220];
					local1496 = anIntArray735[--anInt10218] == 1;
					local181 = Static515.method7240() + local83;
					Static382.method5748(local181, Static375.aClass359_4, Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() == 1, local1496);
					return;
				}
				if (arg0 == 5422) {
					anInt10220 -= 2;
					local83 = aStringArray46[anInt10220];
					local89 = aStringArray46[anInt10220 + 1];
					local97 = anIntArray735[--anInt10218];
					if (local83.length() > 0) {
						if (Static1.aStringArray20 == null) {
							Static1.aStringArray20 = new String[Static471.anIntArray551[Static499.aClass63_15.anInt1690]];
						}
						Static1.aStringArray20[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static271.aStringArray14 == null) {
							Static271.aStringArray14 = new String[Static471.anIntArray551[Static499.aClass63_15.anInt1690]];
						}
						Static271.aStringArray14[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray46[--anInt10220]);
					return;
				}
				if (arg0 == 5424) {
					anInt10218 -= 11;
					Static597.anInt9841 = anIntArray735[anInt10218];
					Static299.anInt5575 = anIntArray735[anInt10218 + 1];
					Static238.anInt4736 = anIntArray735[anInt10218 + 2];
					Static609.anInt9954 = anIntArray735[anInt10218 + 3];
					Static582.anInt9557 = anIntArray735[anInt10218 + 4];
					Static263.anInt5130 = anIntArray735[anInt10218 + 5];
					Static570.anInt9389 = anIntArray735[anInt10218 + 6];
					Static182.anInt4015 = anIntArray735[anInt10218 + 7];
					Static479.anInt9938 = anIntArray735[anInt10218 + 8];
					Static82.anInt1752 = anIntArray735[anInt10218 + 9];
					Static261.anInt5100 = anIntArray735[anInt10218 + 10];
					Static594.aClass97_144.method2564(Static582.anInt9557);
					Static594.aClass97_144.method2564(Static263.anInt5130);
					Static594.aClass97_144.method2564(Static570.anInt9389);
					Static594.aClass97_144.method2564(Static182.anInt4015);
					Static594.aClass97_144.method2564(Static479.anInt9938);
					Static403.aClass20_30 = null;
					Static318.aClass20_27 = null;
					Static202.aClass20_8 = null;
					Static71.aClass20_2 = null;
					Static345.aClass20_28 = null;
					Static267.aClass20_32 = null;
					Static280.aClass20_13 = null;
					Static405.aClass20_31 = null;
					Static507.aBoolean636 = true;
					return;
				}
				if (arg0 == 5425) {
					Static153.method2912();
					Static507.aBoolean636 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt10218 -= 2;
					Static595.anInt9812 = anIntArray735[anInt10218];
					Static492.anInt8385 = anIntArray735[anInt10218 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt10218 -= 2;
					Static258.anInt10109 = anIntArray735[anInt10218 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt10218 -= 2;
					local175 = anIntArray735[anInt10218];
					local776 = anIntArray735[anInt10218 + 1];
					anIntArray735[anInt10218++] = Static635.method8503(local175, local776) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static76.method1457(false, false, aStringArray46[--anInt10220]);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static648.method3663("accountcreated", Static234.anApplet2);
						return;
					} catch (@Pc(3819) Throwable local3819) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static648.method3663("accountcreatestarted", Static234.anApplet2);
						return;
					} catch (@Pc(3830) Throwable local3830) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static199.aClipboard1 != null) {
						@Pc(3842) Transferable local3842 = Static199.aClipboard1.getContents(null);
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
					aStringArray46[anInt10220++] = local83;
					return;
				}
				if (arg0 == 5433) {
					Static333.anInt6166 = anIntArray735[--anInt10218];
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt10218 -= 4;
					local175 = anIntArray735[anInt10218];
					local776 = anIntArray735[anInt10218 + 1];
					local97 = anIntArray735[anInt10218 + 2];
					local103 = anIntArray735[anInt10218 + 3];
					Static265.method4296(local776 << 2, local97, (local175 >> 14 & 0x3FFF) - Static451.anInt7933, local103, false, (local175 & 0x3FFF) - Static470.anInt8063);
					return;
				}
				if (arg0 == 5501) {
					anInt10218 -= 4;
					local175 = anIntArray735[anInt10218];
					local776 = anIntArray735[anInt10218 + 1];
					local97 = anIntArray735[anInt10218 + 2];
					local103 = anIntArray735[anInt10218 + 3];
					Static625.method8454(local776 << 2, (local175 & 0x3FFF) - Static470.anInt8063, (local175 >> 14 & 0x3FFF) - Static451.anInt7933, local97, local103);
					return;
				}
				if (arg0 == 5502) {
					anInt10218 -= 6;
					local175 = anIntArray735[anInt10218];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static160.anInt3633 = local175;
					local776 = anIntArray735[anInt10218 + 1];
					if (local776 + 1 >= Static630.anIntArrayArrayArray20[Static160.anInt3633].length >> 1) {
						throw new RuntimeException();
					}
					Static495.anInt8417 = local776;
					Static217.anInt4525 = 0;
					Static515.anInt8630 = anIntArray735[anInt10218 + 2];
					Static414.anInt7572 = anIntArray735[anInt10218 + 3];
					local97 = anIntArray735[anInt10218 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static144.anInt3307 = local97;
					local103 = anIntArray735[anInt10218 + 5];
					if (local103 + 1 >= Static630.anIntArrayArrayArray20[Static144.anInt3307].length >> 1) {
						throw new RuntimeException();
					}
					Static456.anInt7967 = local103;
					Static2.anInt31 = 3;
					Static644.anInt10296 = -1;
					Static23.anInt718 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static386.method5818();
					return;
				}
				if (arg0 == 5504) {
					anInt10218 -= 2;
					Static496.method7082(anIntArray735[anInt10218], anIntArray735[anInt10218 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray735[anInt10218++] = (int) Static189.aFloat109 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray735[anInt10218++] = (int) Static378.aFloat160 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static617.method8392();
					return;
				}
				if (arg0 == 5508) {
					Static37.method816();
					return;
				}
				if (arg0 == 5509) {
					Static353.method5461();
					return;
				}
				if (arg0 == 5510) {
					Static489.method6997();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray735[--anInt10218];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static451.anInt7933;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static3.anInt46) {
						local776 = Static3.anInt46;
					}
					local97 -= Static470.anInt8063;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static270.anInt5194) {
						local97 = Static270.anInt5194;
					}
					Static215.anInt4487 = (local776 << 9) + 256;
					Static61.anInt1274 = (local97 << 9) + 256;
					Static2.anInt31 = 4;
					Static644.anInt10296 = -1;
					Static23.anInt718 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static306.method4190();
					return;
				}
				if (arg0 == 5514) {
					Static388.anInt6989 = anIntArray735[--anInt10218];
					return;
				}
				if (arg0 == 5516) {
					anIntArray735[anInt10218++] = Static388.anInt6989;
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray735[--anInt10218];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static451.anInt7933;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static3.anInt46) {
							local776 = Static3.anInt46;
						}
						local97 -= Static470.anInt8063;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static270.anInt5194) {
							local97 = Static270.anInt5194;
						}
						Static23.anInt718 = (local776 << 9) + 256;
						Static644.anInt10296 = (local97 << 9) + 256;
						return;
					}
					Static23.anInt718 = -1;
					Static644.anInt10296 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt10220 -= 2;
					local83 = aStringArray46[anInt10220];
					local89 = aStringArray46[anInt10220 + 1];
					local97 = anIntArray735[--anInt10218];
					if (local83.length() > 320) {
						return;
					}
					if (Static538.anInt8985 != 3) {
						return;
					}
					if (Static585.anInt9601 == 0 && Static538.anInt8988 == 0) {
						Static187.aString46 = local83;
						Static213.aString15 = local89;
						Static288.anInt5415 = local97;
						Static51.method997(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static68.method1285();
					return;
				}
				if (arg0 == 5602) {
					if (Static585.anInt9601 == 0) {
						Static552.anInt9113 = -2;
						Static451.anInt7928 = -2;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt10220--;
					if (Static538.anInt8985 != 3) {
						return;
					}
					if (Static585.anInt9601 == 0 && Static538.anInt8988 == 0) {
						Static611.method8354(aStringArray46[anInt10220]);
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt10220 -= 2;
					anInt10218 -= 2;
					if (Static538.anInt8985 != 3) {
						return;
					}
					if (Static585.anInt9601 == 0 && Static538.anInt8988 == 0) {
						Static290.method4544(aStringArray46[anInt10220], anIntArray735[anInt10218], anIntArray735[anInt10218 + 1] == 1, aStringArray46[anInt10220 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static538.anInt8988 == 0) {
						Static232.anInt7424 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray735[anInt10218++] = Static451.anInt7928;
					return;
				}
				if (arg0 == 5608) {
					anIntArray735[anInt10218++] = Static287.anInt5405;
					return;
				}
				if (arg0 == 5609) {
					anIntArray735[anInt10218++] = Static232.anInt7424;
					return;
				}
				if (arg0 == 5611) {
					anIntArray735[anInt10218++] = Static237.anInt4723;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray735[--anInt10218];
					if (Static538.anInt8985 != 7) {
						return;
					}
					if (Static585.anInt9601 == 0 && Static538.anInt8988 == 0) {
						if (Static439.aClass210_1 != null) {
							Static439.aClass210_1.method8030();
							Static439.aClass210_1 = null;
						}
						Static288.anInt5415 = local175;
						Static51.method997(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray735[anInt10218++] = Static451.anInt7928;
					return;
				}
				if (arg0 == 5615) {
					anInt10220 -= 2;
					local83 = aStringArray46[anInt10220];
					local89 = aStringArray46[anInt10220 + 1];
					if (local83.length() > 320) {
						return;
					}
					if (Static538.anInt8985 != 3) {
						return;
					}
					if (Static585.anInt9601 == 0 && Static538.anInt8988 == 0) {
						if (Static439.aClass210_1 != null) {
							Static439.aClass210_1.method8030();
							Static439.aClass210_1 = null;
						}
						Static187.aString46 = local83;
						Static213.aString15 = local89;
						Static51.method997(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static75.method1450(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray735[anInt10218++] = Static552.anInt9113;
					return;
				}
				if (arg0 == 5618) {
					anInt10218--;
					return;
				}
				if (arg0 == 5619) {
					anInt10218--;
					return;
				}
				if (arg0 == 5620) {
					anIntArray735[anInt10218++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt10220 -= 2;
					anInt10218 -= 2;
					return;
				}
				if (arg0 == 5622) {
					return;
				}
				if (arg0 == 5623) {
					if (Static473.aString74 != null) {
						anIntArray735[anInt10218++] = 1;
						return;
					}
					anIntArray735[anInt10218++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray735[anInt10218++] = (int) (Static541.aLong249 >> 32);
					anIntArray735[anInt10218++] = (int) (Static541.aLong249 & 0xFFFFL);
					return;
				}
				if (arg0 == 5625) {
					anIntArray735[anInt10218++] = Static447.aBoolean596 ? 1 : 0;
					return;
				}
				if (arg0 == 5626) {
					Static447.aBoolean596 = true;
					Static472.method6793();
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray735[--anInt10218];
					Static404.aClass2_Sub13_2.method1383(local175, Static404.aClass2_Sub13_2.aClass33_Sub11_1);
					Static251.method4098();
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				@Pc(4786) boolean local4786;
				if (arg0 == 6002) {
					local4786 = anIntArray735[--anInt10218] == 1;
					Static404.aClass2_Sub13_2.method1383(local4786 ? 1 : 0, Static404.aClass2_Sub13_2.aClass33_Sub26_2);
					Static404.aClass2_Sub13_2.method1383(local4786 ? 1 : 0, Static404.aClass2_Sub13_2.aClass33_Sub26_1);
					Static251.method4098();
					Static331.method4926();
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6003) {
					local4786 = anIntArray735[--anInt10218] == 1;
					Static404.aClass2_Sub13_2.method1383(local4786 ? 2 : 1, Static404.aClass2_Sub13_2.aClass33_Sub10_2);
					Static404.aClass2_Sub13_2.method1383(local4786 ? 2 : 1, Static404.aClass2_Sub13_2.aClass33_Sub10_1);
					Static331.method4926();
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6005) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218] == 1 ? 1 : 0, Static404.aClass2_Sub13_2.aClass33_Sub17_1);
					Static251.method4098();
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6007) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218], Static404.aClass2_Sub13_2.aClass33_Sub14_1);
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6008) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218] == 1 ? 1 : 0, Static404.aClass2_Sub13_2.aClass33_Sub19_1);
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6010) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218] == 1 ? 1 : 0, Static404.aClass2_Sub13_2.aClass33_Sub15_1);
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6011) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218], Static404.aClass2_Sub13_2.aClass33_Sub2_1);
					Static251.method4098();
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6012) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218] == 1 ? 1 : 0, Static404.aClass2_Sub13_2.aClass33_Sub28_1);
					Static53.method1014();
					Static57.method1058();
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6014) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218] == 1 ? 2 : 0, Static404.aClass2_Sub13_2.aClass33_Sub20_1);
					Static251.method4098();
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6015) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218] == 1 ? 1 : 0, Static404.aClass2_Sub13_2.aClass33_Sub13_1);
					Static251.method4098();
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6016) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218], Static404.aClass2_Sub13_2.aClass33_Sub9_2);
					Static352.method5455(false, Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329());
					Static209.method3628();
					return;
				}
				if (arg0 == 6017) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218] == 1 ? 1 : 0, Static404.aClass2_Sub13_2.aClass33_Sub23_1);
					Static2.method46();
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6018) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218], Static404.aClass2_Sub13_2.aClass33_Sub1_5);
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray735[--anInt10218];
					local776 = Static404.aClass2_Sub13_2.aClass33_Sub1_2.method810();
					if (local175 != local776) {
						if (Static86.method1553(Static538.anInt8985)) {
							if (local776 == 0 && Static125.anInt2929 != -1) {
								Static556.method7705(Static125.anInt2929, Static536.aClass97_133, local175);
								Static15.method320();
								Static243.aBoolean394 = false;
							} else if (local175 == 0) {
								Static417.method6378();
								Static243.aBoolean394 = false;
							} else {
								Static635.method8502(local175);
							}
						}
						Static404.aClass2_Sub13_2.method1383(local175, Static404.aClass2_Sub13_2.aClass33_Sub1_2);
						Static209.method3628();
						Static141.aBoolean267 = false;
					}
					return;
				}
				if (arg0 == 6020) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218], Static404.aClass2_Sub13_2.aClass33_Sub1_4);
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6021) {
					local175 = Static404.aClass2_Sub13_2.aClass33_Sub10_2.method4036();
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218] == 1 ? 0 : local175, Static404.aClass2_Sub13_2.aClass33_Sub10_1);
					Static331.method4926();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray735[--anInt10218];
					Static404.aClass2_Sub13_2.method1383(local175, Static404.aClass2_Sub13_2.aClass33_Sub3_1);
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6024) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218], Static404.aClass2_Sub13_2.aClass33_Sub9_1);
					Static209.method3628();
					return;
				}
				if (arg0 == 6025) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218], Static404.aClass2_Sub13_2.aClass33_Sub16_1);
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray735[--anInt10218];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static262.method4258(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218] == 0 ? 0 : 1, Static404.aClass2_Sub13_2.aClass33_Sub6_1);
					Static209.method3628();
					return;
				}
				if (arg0 == 6029) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218], Static404.aClass2_Sub13_2.aClass33_Sub14_1);
					Static209.method3628();
					return;
				}
				if (arg0 == 6030) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218] == 0 ? 0 : 1, Static404.aClass2_Sub13_2.aClass33_Sub18_1);
					Static209.method3628();
					Static251.method4098();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray735[--anInt10218];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static352.method5455(false, local175);
					return;
				}
				if (arg0 == 6032) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218], Static404.aClass2_Sub13_2.aClass33_Sub24_2);
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6033) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218], Static404.aClass2_Sub13_2.lb);
					Static209.method3628();
					return;
				}
				if (arg0 == 6034) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218] == 1 ? 1 : 0, Static404.aClass2_Sub13_2.aClass33_Sub4_1);
					Static209.method3628();
					Static53.method1014();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6035) {
					local175 = Static404.aClass2_Sub13_2.aClass33_Sub26_2.method8294();
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218] == 1 ? 1 : local175, Static404.aClass2_Sub13_2.aClass33_Sub26_1);
					Static251.method4098();
					Static331.method4926();
					return;
				}
				if (arg0 == 6036) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218], Static404.aClass2_Sub13_2.aClass33_Sub12_1);
					Static209.method3628();
					Static179.aBoolean336 = true;
					return;
				}
				if (arg0 == 6037) {
					Static404.aClass2_Sub13_2.method1383(anIntArray735[--anInt10218], Static404.aClass2_Sub13_2.aClass33_Sub1_1);
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray735[--anInt10218];
					local776 = Static404.aClass2_Sub13_2.aClass33_Sub1_3.method810();
					if (local175 != local776 && Static125.anInt2929 == Static80.anInt1719) {
						if (!Static86.method1553(Static538.anInt8985)) {
							if (local776 == 0) {
								Static556.method7705(Static125.anInt2929, Static536.aClass97_133, local175);
								Static15.method320();
								Static243.aBoolean394 = false;
							} else if (local175 == 0) {
								Static417.method6378();
								Static243.aBoolean394 = false;
							} else {
								Static635.method8502(local175);
							}
						}
						Static404.aClass2_Sub13_2.method1383(local175, Static404.aClass2_Sub13_2.aClass33_Sub1_3);
						Static209.method3628();
						Static141.aBoolean267 = false;
					}
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray735[--anInt10218];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static404.aClass2_Sub13_2.aClass33_Sub27_1.method8344()) {
						Static404.aClass2_Sub13_2.method1383(local175, Static404.aClass2_Sub13_2.aClass33_Sub27_1);
						Static209.method3628();
						Static141.aBoolean267 = false;
					}
					return;
				}
				if (arg0 == 6040) {
					local175 = anIntArray735[--anInt10218];
					if (local175 != Static404.aClass2_Sub13_2.aClass33_Sub21_1.method6750()) {
						Static404.aClass2_Sub13_2.method1383(local175, Static404.aClass2_Sub13_2.aClass33_Sub21_1);
						Static209.method3628();
						Static141.aBoolean267 = false;
						Static527.method7339();
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub11_1.method4321();
					return;
				}
				if (arg0 == 6102) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub26_2.method8294() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub10_2.method4036() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub17_1.method6029() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub14_1.method4721();
					return;
				}
				if (arg0 == 6108) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub19_1.method6505() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub15_1.method4903() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub2_1.method1495();
					return;
				}
				if (arg0 == 6112) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub28_1.method8390() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub20_1.method6515() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub13_1.method4689() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub9_2.method3852();
					return;
				}
				if (arg0 == 6117) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub23_1.method7252() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub1_5.method810();
					return;
				}
				if (arg0 == 6119) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub1_2.method810();
					return;
				}
				if (arg0 == 6120) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub1_4.method810();
					return;
				}
				if (arg0 == 6123) {
					anIntArray735[anInt10218++] = Static123.method2504();
					return;
				}
				if (arg0 == 6124) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub9_1.method3852();
					return;
				}
				if (arg0 == 6125) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub16_1.method5227();
					return;
				}
				if (arg0 == 6127) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub25_1.method7592() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub6_1.method2925() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub14_1.method4721();
					return;
				}
				if (arg0 == 6130) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub18_1.method6344() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329();
					return;
				}
				if (arg0 == 6132) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub24_2.method7329();
					return;
				}
				if (arg0 == 6133) {
					anIntArray735[anInt10218++] = Static375.aClass359_4.aBoolean729 && !Static375.aClass359_4.aBoolean728 ? 1 : 0;
					return;
				}
				if (arg0 == 6135) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.lb.method7198();
					return;
				}
				if (arg0 == 6136) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub4_1.method1808() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray735[anInt10218++] = Static573.method7871(Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329(), 200);
					return;
				}
				if (arg0 == 6139) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub12_1.method4517();
					return;
				}
				if (arg0 == 6142) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub1_1.method810();
					return;
				}
				if (arg0 == 6143) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub1_3.method810();
					return;
				}
				if (arg0 == 6144) {
					anIntArray735[anInt10218++] = Static599.aBoolean721 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub27_1.method8344();
					return;
				}
				if (arg0 == 6146) {
					anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub21_1.method6750();
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt10218 -= 2;
					Static353.aShort91 = (short) anIntArray735[anInt10218];
					if (Static353.aShort91 <= 0) {
						Static353.aShort91 = 256;
					}
					Static19.aShort78 = (short) anIntArray735[anInt10218 + 1];
					if (Static19.aShort78 <= 0) {
						Static19.aShort78 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt10218 -= 2;
					Static384.aShort100 = (short) anIntArray735[anInt10218];
					if (Static384.aShort100 <= 0) {
						Static384.aShort100 = 256;
					}
					Static324.aShort85 = (short) anIntArray735[anInt10218 + 1];
					if (Static324.aShort85 <= 0) {
						Static324.aShort85 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt10218 -= 4;
					Static283.aShort82 = (short) anIntArray735[anInt10218];
					if (Static283.aShort82 <= 0) {
						Static283.aShort82 = 1;
					}
					Static343.aShort86 = (short) anIntArray735[anInt10218 + 1];
					if (Static343.aShort86 <= 0) {
						Static343.aShort86 = 32767;
					} else if (Static343.aShort86 < Static283.aShort82) {
						Static343.aShort86 = Static283.aShort82;
					}
					Static50.aShort30 = (short) anIntArray735[anInt10218 + 2];
					if (Static50.aShort30 <= 0) {
						Static50.aShort30 = 1;
					}
					Static436.aShort101 = (short) anIntArray735[anInt10218 + 3];
					if (Static436.aShort101 <= 0) {
						Static436.aShort101 = 32767;
						return;
					}
					if (Static436.aShort101 < Static50.aShort30) {
						Static436.aShort101 = Static50.aShort30;
					}
					return;
				}
				if (arg0 == 6203) {
					Static37.method820(false, Static555.aClass78_10.anInt1991, 0, Static555.aClass78_10.anInt1964, 0);
					anIntArray735[anInt10218++] = Static224.anInt4612;
					anIntArray735[anInt10218++] = Static108.anInt2143;
					return;
				}
				if (arg0 == 6204) {
					anIntArray735[anInt10218++] = Static384.aShort100;
					anIntArray735[anInt10218++] = Static324.aShort85;
					return;
				}
				if (arg0 == 6205) {
					anIntArray735[anInt10218++] = Static353.aShort91;
					anIntArray735[anInt10218++] = Static19.aShort78;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray735[anInt10218++] = (int) (Static438.method6517() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray735[anInt10218++] = (int) (Static438.method6517() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt10218 -= 3;
					local175 = anIntArray735[anInt10218];
					local776 = anIntArray735[anInt10218 + 1];
					local97 = anIntArray735[anInt10218 + 2];
					aCalendar2.clear();
					aCalendar2.set(11, 12);
					aCalendar2.set(local97, local776, local175);
					local103 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray735[anInt10218++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar2.clear();
					aCalendar2.setTime(new Date(Static438.method6517()));
					anIntArray735[anInt10218++] = aCalendar2.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray735[--anInt10218];
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
					anIntArray735[anInt10218++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray735[anInt10218++] = Static211.method6037() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray735[anInt10218++] = Static107.method1805() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static538.anInt8985 == 7 && Static585.anInt9601 == 0 && Static538.anInt8988 == 0) {
						if (Static343.aBoolean474) {
							anIntArray735[anInt10218++] = 0;
							return;
						}
						if (Static602.aLong266 > Static438.method6517() - 1000L) {
							anIntArray735[anInt10218++] = 1;
							return;
						}
						Static343.aBoolean474 = true;
						local52 = Static595.method8194(Static610.aClass310_2, Static634.aClass269_97);
						local52.aClass2_Sub34_Sub2_2.method6864(Static378.anInt6773);
						Static311.method4754(local52);
						anIntArray735[anInt10218++] = 0;
						return;
					}
					anIntArray735[anInt10218++] = 1;
					return;
				}
				@Pc(6803) Class209 local6803;
				@Pc(6770) Class202_Sub1 local6770;
				if (arg0 == 6501) {
					local6770 = Static179.method3290();
					if (local6770 != null) {
						anIntArray735[anInt10218++] = local6770.anInt5725;
						anIntArray735[anInt10218++] = local6770.anInt5716;
						aStringArray46[anInt10220++] = local6770.aString56;
						local6803 = local6770.method4778();
						anIntArray735[anInt10218++] = local6803.anInt6169;
						aStringArray46[anInt10220++] = local6803.aString58;
						anIntArray735[anInt10218++] = local6770.anInt5722;
						anIntArray735[anInt10218++] = local6770.anInt5727;
						aStringArray46[anInt10220++] = local6770.aString55;
						return;
					}
					anIntArray735[anInt10218++] = -1;
					anIntArray735[anInt10218++] = 0;
					aStringArray46[anInt10220++] = "";
					anIntArray735[anInt10218++] = 0;
					aStringArray46[anInt10220++] = "";
					anIntArray735[anInt10218++] = 0;
					anIntArray735[anInt10218++] = 0;
					aStringArray46[anInt10220++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6770 = Static360.method5511();
					if (local6770 != null) {
						anIntArray735[anInt10218++] = local6770.anInt5725;
						anIntArray735[anInt10218++] = local6770.anInt5716;
						aStringArray46[anInt10220++] = local6770.aString56;
						local6803 = local6770.method4778();
						anIntArray735[anInt10218++] = local6803.anInt6169;
						aStringArray46[anInt10220++] = local6803.aString58;
						anIntArray735[anInt10218++] = local6770.anInt5722;
						anIntArray735[anInt10218++] = local6770.anInt5727;
						aStringArray46[anInt10220++] = local6770.aString55;
						return;
					}
					anIntArray735[anInt10218++] = -1;
					anIntArray735[anInt10218++] = 0;
					aStringArray46[anInt10220++] = "";
					anIntArray735[anInt10218++] = 0;
					aStringArray46[anInt10220++] = "";
					anIntArray735[anInt10218++] = 0;
					anIntArray735[anInt10218++] = 0;
					aStringArray46[anInt10220++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray735[--anInt10218];
					local89 = aStringArray46[--anInt10220];
					if (Static538.anInt8985 == 7 && Static585.anInt9601 == 0 && Static538.anInt8988 == 0) {
						anIntArray735[anInt10218++] = Static222.method7436(local89, local175) ? 1 : 0;
						return;
					}
					anIntArray735[anInt10218++] = 0;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray735[--anInt10218];
					@Pc(7130) Class202_Sub1 local7130 = Static619.method8431(local175);
					if (local7130 != null) {
						anIntArray735[anInt10218++] = local7130.anInt5716;
						aStringArray46[anInt10220++] = local7130.aString56;
						@Pc(7154) Class209 local7154 = local7130.method4778();
						anIntArray735[anInt10218++] = local7154.anInt6169;
						aStringArray46[anInt10220++] = local7154.aString58;
						anIntArray735[anInt10218++] = local7130.anInt5722;
						anIntArray735[anInt10218++] = local7130.anInt5727;
						aStringArray46[anInt10220++] = local7130.aString55;
						return;
					}
					anIntArray735[anInt10218++] = -1;
					aStringArray46[anInt10220++] = "";
					anIntArray735[anInt10218++] = 0;
					aStringArray46[anInt10220++] = "";
					anIntArray735[anInt10218++] = 0;
					anIntArray735[anInt10218++] = 0;
					aStringArray46[anInt10220++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt10218 -= 4;
					local175 = anIntArray735[anInt10218];
					local1496 = anIntArray735[anInt10218 + 1] == 1;
					local97 = anIntArray735[anInt10218 + 2];
					local2107 = anIntArray735[anInt10218 + 3] == 1;
					Static119.method2472(local2107, local1496, local97, local175);
					return;
				}
				if (arg0 == 6508) {
					Static387.method5831();
					return;
				}
				if (arg0 == 6509) {
					if (Static538.anInt8985 != 7) {
						return;
					}
					Static429.aBoolean581 = anIntArray735[--anInt10218] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray735[anInt10218++] = Static331.anInt5912;
					return;
				}
			} else if (arg0 >= 6700) {
				if (arg0 < 6800 && Static338.aClass21_2 == Static467.aClass21_3) {
					if (arg0 == 6700) {
						local175 = Static206.aClass222_14.method5473();
						if (Static387.anInt6978 != -1) {
							local175++;
						}
						anIntArray735[anInt10218++] = local175;
						return;
					}
					if (arg0 == 6701) {
						local175 = anIntArray735[--anInt10218];
						if (Static387.anInt6978 != -1) {
							if (local175 == 0) {
								anIntArray735[anInt10218++] = Static387.anInt6978;
								return;
							}
							local175--;
						}
						@Pc(7402) Class2_Sub37 local7402 = (Class2_Sub37) Static206.aClass222_14.method5474();
						while (local175-- > 0) {
							local7402 = (Class2_Sub37) Static206.aClass222_14.method5472();
						}
						anIntArray735[anInt10218++] = local7402.anInt6848;
						return;
					}
					if (arg0 == 6702) {
						local175 = anIntArray735[--anInt10218];
						if (Static399.aClass78ArrayArray1[local175] == null) {
							aStringArray46[anInt10220++] = "";
							return;
						}
						local89 = Static399.aClass78ArrayArray1[local175][0].aString22;
						if (local89 == null) {
							aStringArray46[anInt10220++] = "";
							return;
						}
						aStringArray46[anInt10220++] = local89.substring(0, local89.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local175 = anIntArray735[--anInt10218];
						if (Static399.aClass78ArrayArray1[local175] == null) {
							anIntArray735[anInt10218++] = 0;
							return;
						}
						anIntArray735[anInt10218++] = Static399.aClass78ArrayArray1[local175].length;
						return;
					}
					if (arg0 == 6704) {
						anInt10218 -= 2;
						local175 = anIntArray735[anInt10218];
						local776 = anIntArray735[anInt10218 + 1];
						if (Static399.aClass78ArrayArray1[local175] == null) {
							aStringArray46[anInt10220++] = "";
							return;
						}
						local181 = Static399.aClass78ArrayArray1[local175][local776].aString22;
						if (local181 == null) {
							aStringArray46[anInt10220++] = "";
							return;
						}
						aStringArray46[anInt10220++] = local181;
						return;
					}
					if (arg0 == 6705) {
						anInt10218 -= 2;
						local175 = anIntArray735[anInt10218];
						local776 = anIntArray735[anInt10218 + 1];
						if (Static399.aClass78ArrayArray1[local175] == null) {
							anIntArray735[anInt10218++] = 0;
							return;
						}
						anIntArray735[anInt10218++] = Static399.aClass78ArrayArray1[local175][local776].anInt1942;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt10218 -= 3;
						local175 = anIntArray735[anInt10218];
						local776 = anIntArray735[anInt10218 + 1];
						local97 = anIntArray735[anInt10218 + 2];
						Static20.method475(local97, 1, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6708) {
						anInt10218 -= 3;
						local175 = anIntArray735[anInt10218];
						local776 = anIntArray735[anInt10218 + 1];
						local97 = anIntArray735[anInt10218 + 2];
						Static20.method475(local97, 2, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6709) {
						anInt10218 -= 3;
						local175 = anIntArray735[anInt10218];
						local776 = anIntArray735[anInt10218 + 1];
						local97 = anIntArray735[anInt10218 + 2];
						Static20.method475(local97, 3, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6710) {
						anInt10218 -= 3;
						local175 = anIntArray735[anInt10218];
						local776 = anIntArray735[anInt10218 + 1];
						local97 = anIntArray735[anInt10218 + 2];
						Static20.method475(local97, 4, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6711) {
						anInt10218 -= 3;
						local175 = anIntArray735[anInt10218];
						local776 = anIntArray735[anInt10218 + 1];
						local97 = anIntArray735[anInt10218 + 2];
						Static20.method475(local97, 5, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6712) {
						anInt10218 -= 3;
						local175 = anIntArray735[anInt10218];
						local776 = anIntArray735[anInt10218 + 1];
						local97 = anIntArray735[anInt10218 + 2];
						Static20.method475(local97, 6, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6713) {
						anInt10218 -= 3;
						local175 = anIntArray735[anInt10218];
						local776 = anIntArray735[anInt10218 + 1];
						local97 = anIntArray735[anInt10218 + 2];
						Static20.method475(local97, 7, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6714) {
						anInt10218 -= 3;
						local175 = anIntArray735[anInt10218];
						local776 = anIntArray735[anInt10218 + 1];
						local97 = anIntArray735[anInt10218 + 2];
						Static20.method475(local97, 8, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6715) {
						anInt10218 -= 3;
						local175 = anIntArray735[anInt10218];
						local776 = anIntArray735[anInt10218 + 1];
						local97 = anIntArray735[anInt10218 + 2];
						Static20.method475(local97, 9, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6716) {
						anInt10218 -= 3;
						local175 = anIntArray735[anInt10218];
						local776 = anIntArray735[anInt10218 + 1];
						local97 = anIntArray735[anInt10218 + 2];
						Static20.method475(local97, 10, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6717) {
						anInt10218 -= 3;
						local175 = anIntArray735[anInt10218];
						local776 = anIntArray735[anInt10218 + 1];
						local97 = anIntArray735[anInt10218 + 2];
						@Pc(7990) Class78 local7990 = Static496.method7080(local175 << 16 | local776, local97);
						Static171.method3178();
						@Pc(7995) Class2_Sub40 local7995 = Static69.method1332(local7990);
						Static545.method7612(local7995.method6409(), local7995.anInt7657, local7990);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(8023) Class105 local8023;
					if (arg0 == 6800) {
						local175 = anIntArray735[--anInt10218];
						local8023 = Static259.aClass248_2.method6347(local175);
						if (local8023.aString34 == null) {
							aStringArray46[anInt10220++] = "";
							return;
						}
						aStringArray46[anInt10220++] = local8023.aString34;
						return;
					}
					if (arg0 == 6801) {
						local175 = anIntArray735[--anInt10218];
						local8023 = Static259.aClass248_2.method6347(local175);
						anIntArray735[anInt10218++] = local8023.anInt3335;
						return;
					}
					if (arg0 == 6802) {
						local175 = anIntArray735[--anInt10218];
						local8023 = Static259.aClass248_2.method6347(local175);
						anIntArray735[anInt10218++] = local8023.anInt3352;
						return;
					}
					if (arg0 == 6803) {
						local175 = anIntArray735[--anInt10218];
						local8023 = Static259.aClass248_2.method6347(local175);
						anIntArray735[anInt10218++] = local8023.anInt3320;
						return;
					}
					if (arg0 == 6804) {
						anInt10218 -= 2;
						local175 = anIntArray735[anInt10218];
						local776 = anIntArray735[anInt10218 + 1];
						@Pc(8145) Class79 local8145 = Static584.aClass206_2.method4916(local776);
						if (local8145.method1707()) {
							aStringArray46[anInt10220++] = Static259.aClass248_2.method6347(local175).method2789(local776, local8145.aString26);
							return;
						}
						anIntArray735[anInt10218++] = Static259.aClass248_2.method6347(local175).method2790(local8145.anInt2016, local776);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray735[anInt10218++] = Static95.aBoolean160 && !Static392.aBoolean523 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray735[anInt10218++] = Static39.anInt9755;
						return;
					}
					if (arg0 == 6902) {
						anIntArray735[anInt10218++] = Static538.anInt8989;
						return;
					}
					if (arg0 == 6903) {
						anIntArray735[anInt10218++] = Static431.anInt7715;
						return;
					}
					if (arg0 == 6904) {
						anIntArray735[anInt10218++] = Static532.anInt8900;
						return;
					}
					if (arg0 == 6905) {
						local83 = "";
						if (Static258.aClass26_38 != null) {
							if (Static258.aClass26_38.anObject3 == null) {
								local83 = Static530.method7412(Static258.aClass26_38.anInt760);
							} else {
								local83 = (String) Static258.aClass26_38.anObject3;
							}
						}
						aStringArray46[anInt10220++] = local83;
						return;
					}
					if (arg0 == 6906) {
						anIntArray735[anInt10218++] = Static506.anInt8524;
						return;
					}
					if (arg0 == 6907) {
						anIntArray735[anInt10218++] = Static630.anInt10137;
						return;
					}
					if (arg0 == 6908) {
						anIntArray735[anInt10218++] = Static451.anInt7931;
						return;
					}
					if (arg0 == 6909) {
						anIntArray735[anInt10218++] = Static204.aBoolean360 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray735[anInt10218++] = Static85.anInt1779;
						return;
					}
					if (arg0 == 6911) {
						anIntArray735[anInt10218++] = Static134.anInt3048;
						return;
					}
					if (arg0 == 6912) {
						anIntArray735[anInt10218++] = Static553.anInt9139;
						return;
					}
				} else if (arg0 < 7100) {
					if (arg0 == 7000) {
						local175 = Static606.method8284();
						anIntArray735[anInt10218++] = Static609.anInt9953 = Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329();
						anIntArray735[anInt10218++] = local175;
						Static251.method4098();
						Static209.method3628();
						Static141.aBoolean267 = false;
						return;
					}
					if (arg0 == 7001) {
						Static455.method6666();
						Static251.method4098();
						Static209.method3628();
						Static141.aBoolean267 = false;
						return;
					}
					if (arg0 == 7002) {
						Static596.method8207();
						Static251.method4098();
						Static209.method3628();
						Static141.aBoolean267 = false;
						return;
					}
					if (arg0 == 7003) {
						Static534.method7470();
						Static251.method4098();
						Static209.method3628();
						Static141.aBoolean267 = false;
						return;
					}
					if (arg0 == 7004) {
						Static623.method8043();
						Static251.method4098();
						Static209.method3628();
						Static141.aBoolean267 = false;
						return;
					}
					if (arg0 == 7005) {
						Static404.aClass2_Sub13_2.method1383(0, Static404.aClass2_Sub13_2.aClass33_Sub5_1);
						Static209.method3628();
						Static141.aBoolean267 = false;
						return;
					}
					if (arg0 == 7006) {
						if (Static609.anInt9953 == 2) {
							Static638.aBoolean590 = true;
							return;
						}
						if (Static609.anInt9953 == 1) {
							Static288.aBoolean414 = true;
							return;
						}
						if (Static609.anInt9953 == 3) {
							Static225.aBoolean388 = true;
						}
						return;
					}
					if (arg0 == 7007) {
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub5_1.method2613();
						return;
					}
				} else if (arg0 < 7200) {
					if (arg0 == 7100) {
						anInt10218 -= 2;
						local175 = anIntArray735[anInt10218];
						local776 = anIntArray735[anInt10218 + 1];
						if (local175 != -1) {
							if (local776 > 255) {
								local776 = 255;
							} else if (local776 < 0) {
								local776 = 0;
							}
							Static536.method7488(false, local776, local175);
						}
						return;
					}
					if (arg0 == 7101) {
						local175 = anIntArray735[--anInt10218];
						if (local175 != -1) {
							Static621.method8440(local175);
						}
						return;
					}
					if (arg0 == 7102) {
						local175 = anIntArray735[--anInt10218];
						if (local175 != -1) {
							Static179.method3289(local175);
						}
						return;
					}
					if (arg0 == 7103) {
						anIntArray735[anInt10218++] = Static451.method6637("jagtheora") ? 1 : 0;
						return;
					}
				} else if (arg0 < 7300) {
					if (arg0 == 7201) {
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub17_1.method6032() ? 1 : 0;
						return;
					}
					if (arg0 == 7202) {
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub15_1.method4902() ? 1 : 0;
						return;
					}
					if (arg0 == 7203) {
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub2_1.method1499() ? 1 : 0;
						return;
					}
					if (arg0 == 7204) {
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub20_1.method6513() ? 1 : 0;
						return;
					}
					if (arg0 == 7205) {
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub9_1.method3851() && Static600.aClass87_15.method7943() ? 1 : 0;
						return;
					}
					if (arg0 == 7206) {
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub3_1.method1507() ? 1 : 0;
						return;
					}
					if (arg0 == 7207) {
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub16_1.method5234() ? 1 : 0;
						return;
					}
					if (arg0 == 7208) {
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub25_1.method7596() && Static600.aClass87_15.method7967() ? 1 : 0;
						return;
					}
					if (arg0 == 7209) {
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub18_1.method6342() ? 1 : 0;
						return;
					}
					if (arg0 == 7210) {
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub4_1.method1809() ? 1 : 0;
						return;
					}
					if (arg0 == 7211) {
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub12_1.method4518() ? 1 : 0;
						return;
					}
					if (arg0 == 7212) {
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub13_1.method4692() ? 1 : 0;
						return;
					}
					if (arg0 == 7213) {
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub21_1.method6748() ? 1 : 0;
						return;
					}
				} else if (arg0 < 7400) {
					if (arg0 == 7301) {
						local175 = anIntArray735[--anInt10218];
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub17_1.method8443(local175);
						return;
					}
					if (arg0 == 7302) {
						local175 = anIntArray735[--anInt10218];
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub15_1.method8443(local175);
						return;
					}
					if (arg0 == 7303) {
						local175 = anIntArray735[--anInt10218];
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub2_1.method8443(local175);
						return;
					}
					if (arg0 == 7304) {
						local175 = anIntArray735[--anInt10218];
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub20_1.method8443(local175);
						return;
					}
					if (arg0 == 7305) {
						local175 = anIntArray735[--anInt10218];
						if (!Static600.aClass87_15.method7943()) {
							anIntArray735[anInt10218++] = 3;
							return;
						}
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub9_1.method8443(local175);
						return;
					}
					if (arg0 == 7306) {
						local175 = anIntArray735[--anInt10218];
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub3_1.method8443(local175);
						return;
					}
					if (arg0 == 7307) {
						local175 = anIntArray735[--anInt10218];
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub16_1.method8443(local175);
						return;
					}
					if (arg0 == 7308) {
						local175 = anIntArray735[--anInt10218];
						if (!Static600.aClass87_15.method7967()) {
							anIntArray735[anInt10218++] = 3;
							return;
						}
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub25_1.method8443(local175);
						return;
					}
					if (arg0 == 7309) {
						local175 = anIntArray735[--anInt10218];
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub18_1.method8443(local175);
						return;
					}
					if (arg0 == 7310) {
						local175 = anIntArray735[--anInt10218];
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub4_1.method8443(local175);
						return;
					}
					if (arg0 == 7311) {
						local175 = anIntArray735[--anInt10218];
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub12_1.method8443(local175);
						return;
					}
					if (arg0 == 7312) {
						local175 = anIntArray735[--anInt10218];
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub13_1.method8443(local175);
						return;
					}
					if (arg0 == 7313) {
						local175 = anIntArray735[--anInt10218];
						anIntArray735[anInt10218++] = Static404.aClass2_Sub13_2.aClass33_Sub21_1.method8443(local175);
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method8544(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static278.anInt5322 == 0 && (Static95.aBoolean160 && !Static392.aBoolean523 || Static408.aBoolean565)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static628.aClass369_47.method8475(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static628.aClass369_47.method8475(0).length());
		} else if (local11.startsWith(Static628.aClass369_48.method8475(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static628.aClass369_48.method8475(0).length());
		} else if (local11.startsWith(Static628.aClass369_49.method8475(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static628.aClass369_49.method8475(0).length());
		} else if (local11.startsWith(Static628.aClass369_50.method8475(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static628.aClass369_50.method8475(0).length());
		} else if (local11.startsWith(Static628.aClass369_51.method8475(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static628.aClass369_51.method8475(0).length());
		} else if (local11.startsWith(Static628.aClass369_52.method8475(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static628.aClass369_52.method8475(0).length());
		} else if (local11.startsWith(Static628.aClass369_53.method8475(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static628.aClass369_53.method8475(0).length());
		} else if (local11.startsWith(Static628.aClass369_54.method8475(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static628.aClass369_54.method8475(0).length());
		} else if (local11.startsWith(Static628.aClass369_55.method8475(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static628.aClass369_55.method8475(0).length());
		} else if (local11.startsWith(Static628.aClass369_56.method8475(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static628.aClass369_56.method8475(0).length());
		} else if (local11.startsWith(Static628.aClass369_57.method8475(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static628.aClass369_57.method8475(0).length());
		} else if (local11.startsWith(Static628.aClass369_58.method8475(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static628.aClass369_58.method8475(0).length());
		} else if (Static377.anInt6756 != 0) {
			if (local11.startsWith(Static628.aClass369_47.method8475(Static377.anInt6756))) {
				local13 = 0;
				arg0 = arg0.substring(Static628.aClass369_47.method8475(Static377.anInt6756).length());
			} else if (local11.startsWith(Static628.aClass369_48.method8475(Static377.anInt6756))) {
				local13 = 1;
				arg0 = arg0.substring(Static628.aClass369_48.method8475(Static377.anInt6756).length());
			} else if (local11.startsWith(Static628.aClass369_49.method8475(Static377.anInt6756))) {
				local13 = 2;
				arg0 = arg0.substring(Static628.aClass369_49.method8475(Static377.anInt6756).length());
			} else if (local11.startsWith(Static628.aClass369_50.method8475(Static377.anInt6756))) {
				local13 = 3;
				arg0 = arg0.substring(Static628.aClass369_50.method8475(Static377.anInt6756).length());
			} else if (local11.startsWith(Static628.aClass369_51.method8475(Static377.anInt6756))) {
				local13 = 4;
				arg0 = arg0.substring(Static628.aClass369_51.method8475(Static377.anInt6756).length());
			} else if (local11.startsWith(Static628.aClass369_52.method8475(Static377.anInt6756))) {
				local13 = 5;
				arg0 = arg0.substring(Static628.aClass369_52.method8475(Static377.anInt6756).length());
			} else if (local11.startsWith(Static628.aClass369_53.method8475(Static377.anInt6756))) {
				local13 = 6;
				arg0 = arg0.substring(Static628.aClass369_53.method8475(Static377.anInt6756).length());
			} else if (local11.startsWith(Static628.aClass369_54.method8475(Static377.anInt6756))) {
				local13 = 7;
				arg0 = arg0.substring(Static628.aClass369_54.method8475(Static377.anInt6756).length());
			} else if (local11.startsWith(Static628.aClass369_55.method8475(Static377.anInt6756))) {
				local13 = 8;
				arg0 = arg0.substring(Static628.aClass369_55.method8475(Static377.anInt6756).length());
			} else if (local11.startsWith(Static628.aClass369_56.method8475(Static377.anInt6756))) {
				local13 = 9;
				arg0 = arg0.substring(Static628.aClass369_56.method8475(Static377.anInt6756).length());
			} else if (local11.startsWith(Static628.aClass369_57.method8475(Static377.anInt6756))) {
				local13 = 10;
				arg0 = arg0.substring(Static628.aClass369_57.method8475(Static377.anInt6756).length());
			} else if (local11.startsWith(Static628.aClass369_58.method8475(Static377.anInt6756))) {
				local13 = 11;
				arg0 = arg0.substring(Static628.aClass369_58.method8475(Static377.anInt6756).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Class369.lb.method8475(0))) {
			local451 = 1;
			arg0 = arg0.substring(Class369.lb.method8475(0).length());
		} else if (local11.startsWith(Static628.aClass369_59.method8475(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static628.aClass369_59.method8475(0).length());
		} else if (local11.startsWith(Static628.aClass369_60.method8475(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static628.aClass369_60.method8475(0).length());
		} else if (local11.startsWith(Static628.aClass369_61.method8475(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static628.aClass369_61.method8475(0).length());
		} else if (local11.startsWith(Static628.aClass369_62.method8475(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static628.aClass369_62.method8475(0).length());
		} else if (Static377.anInt6756 != 0) {
			if (local11.startsWith(Class369.lb.method8475(Static377.anInt6756))) {
				local451 = 1;
				arg0 = arg0.substring(Class369.lb.method8475(Static377.anInt6756).length());
			} else if (local11.startsWith(Static628.aClass369_59.method8475(Static377.anInt6756))) {
				local451 = 2;
				arg0 = arg0.substring(Static628.aClass369_59.method8475(Static377.anInt6756).length());
			} else if (local11.startsWith(Static628.aClass369_60.method8475(Static377.anInt6756))) {
				local451 = 3;
				arg0 = arg0.substring(Static628.aClass369_60.method8475(Static377.anInt6756).length());
			} else if (local11.startsWith(Static628.aClass369_61.method8475(Static377.anInt6756))) {
				local451 = 4;
				arg0 = arg0.substring(Static628.aClass369_61.method8475(Static377.anInt6756).length());
			} else if (local11.startsWith(Static628.aClass369_62.method8475(Static377.anInt6756))) {
				local451 = 5;
				arg0 = arg0.substring(Static628.aClass369_62.method8475(Static377.anInt6756).length());
			}
		}
		@Pc(641) Class2_Sub50 local641 = Static595.method8194(Static610.aClass310_2, Static34.aClass269_6);
		local641.aClass2_Sub34_Sub2_2.method6894(0);
		@Pc(650) int local650 = local641.aClass2_Sub34_Sub2_2.anInt8188;
		local641.aClass2_Sub34_Sub2_2.method6894(local13);
		local641.aClass2_Sub34_Sub2_2.method6894(local451);
		Static283.method4471(arg0, local641.aClass2_Sub34_Sub2_2);
		local641.aClass2_Sub34_Sub2_2.method6861(local641.aClass2_Sub34_Sub2_2.anInt8188 - local650);
		Static311.method4754(local641);
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method8545(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray47[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "()V")
	public static void method8546() {
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)V")
	public static void method8547(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static164.method3053(arg0)) {
			return;
		}
		@Pc(12) Class78[] local12 = Static399.aClass78ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class78 local19 = local12[local14];
			if (local19.anObjectArray7 != null) {
				@Pc(26) Class2_Sub42 local26 = new Class2_Sub42();
				local26.aClass78_9 = local19;
				local26.anObjectArray33 = local19.anObjectArray7;
				method8549(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!kg;II)V")
	public static void method8548(@OriginalArg(0) Class188 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub5_Sub21 local5 = Static496.method7081(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray736 = new int[local5.anInt10116];
		aStringArray45 = new String[local5.anInt10121];
		if (local5.aClass188_10 == Static229.aClass188_3 || local5.aClass188_10 == Static525.aClass188_7 || local5.aClass188_10 == Static347.aClass188_5) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static71.aClass78_1 != null) {
				local30 = Static71.aClass78_1.anInt1928;
				local32 = Static71.aClass78_1.anInt2005;
			}
			anIntArray736[0] = Static6.aClass40_1.method4504() - local30;
			anIntArray736[1] = Static6.aClass40_1.method4499() - local32;
		}
		method8551(local5, 200000);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!raa;I)V")
	private static void method8549(@OriginalArg(0) Class2_Sub42 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray33;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub5_Sub21 local12 = Static123.method2503(local8);
		if (local12 == null) {
			return;
		}
		anIntArray736 = new int[local12.anInt10116];
		@Pc(21) int local21 = 0;
		aStringArray45 = new String[local12.anInt10121];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt8127;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt8131;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass78_9 == null ? -1 : arg0.aClass78_9.anInt1968;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt8126;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass78_9 == null ? -1 : arg0.aClass78_9.anInt1978;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass78_8 == null ? -1 : arg0.aClass78_8.anInt1968;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass78_8 == null ? -1 : arg0.aClass78_8.anInt1978;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt8133;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt8128;
				}
				anIntArray736[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString75;
				}
				aStringArray45[local27++] = local135;
			}
		}
		anInt10232 = arg0.anInt8125;
		method8551(local12, arg1);
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(IZ)V")
	public static void method8550() {
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!wga;I)V")
	private static void method8551(@OriginalArg(0) Class2_Sub5_Sub21 arg0, @OriginalArg(1) int arg1) {
		anInt10218 = 0;
		anInt10220 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray724;
		@Pc(11) int[] local11 = arg0.anIntArray725;
		@Pc(13) byte local13 = -1;
		anInt10223 = 0;
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
						method8553(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method8543(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray735[anInt10218++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray735[anInt10218++] = Static438.aClass198_1.anIntArray386[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static438.aClass198_1.method4748(anIntArray735[--anInt10218], local54);
					} else if (local31 == 3) {
						aStringArray46[anInt10220++] = arg0.aStringArray43[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt10218 -= 2;
						if (anIntArray735[anInt10218] != anIntArray735[anInt10218 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt10218 -= 2;
						if (anIntArray735[anInt10218] == anIntArray735[anInt10218 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt10218 -= 2;
						if (anIntArray735[anInt10218] < anIntArray735[anInt10218 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt10218 -= 2;
						if (anIntArray735[anInt10218] > anIntArray735[anInt10218 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt10223 == 0) {
							return;
						}
						@Pc(216) Class191 local216 = aClass191Array1[--anInt10223];
						arg0 = local216.aClass2_Sub5_Sub21_1;
						local8 = arg0.anIntArray724;
						local11 = arg0.anIntArray725;
						local5 = local216.anInt5548;
						anIntArray736 = local216.anIntArray373;
						aStringArray45 = local216.aStringArray15;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray735[anInt10218++] = Static438.aClass198_1.method4743(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static438.aClass198_1.method4751(anIntArray735[--anInt10218], local54);
					} else if (local31 == 31) {
						anInt10218 -= 2;
						if (anIntArray735[anInt10218] <= anIntArray735[anInt10218 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt10218 -= 2;
						if (anIntArray735[anInt10218] >= anIntArray735[anInt10218 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray735[anInt10218++] = anIntArray736[local11[local5]];
					} else if (local31 == 34) {
						anIntArray736[local11[local5]] = anIntArray735[--anInt10218];
					} else if (local31 == 35) {
						aStringArray46[anInt10220++] = aStringArray45[local11[local5]];
					} else if (local31 == 36) {
						aStringArray45[local11[local5]] = aStringArray46[--anInt10220];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt10220 -= local54;
						@Pc(400) String local400 = Static536.method7485(aStringArray46, anInt10220, local54);
						aStringArray46[anInt10220++] = local400;
					} else if (local31 == 38) {
						anInt10218--;
					} else if (local31 == 39) {
						anInt10220--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class2_Sub5_Sub21 local436 = Static123.method2503(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt10116];
							@Pc(450) String[] local450 = new String[local436.anInt10121];
							for (local452 = 0; local452 < local436.anInt10117; local452++) {
								local446[local452] = anIntArray735[anInt10218 + local452 - local436.anInt10117];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt10119; local471++) {
								local450[local471] = aStringArray46[anInt10220 + local471 - local436.anInt10119];
							}
							anInt10218 -= local436.anInt10117;
							anInt10220 -= local436.anInt10119;
							@Pc(502) Class191 local502 = new Class191();
							local502.aClass2_Sub5_Sub21_1 = arg0;
							local502.anInt5548 = local5;
							local502.anIntArray373 = anIntArray736;
							local502.aStringArray15 = aStringArray45;
							if (anInt10223 >= aClass191Array1.length) {
								throw new RuntimeException();
							}
							aClass191Array1[anInt10223++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray724;
							local11 = local436.anIntArray725;
							local5 = -1;
							anIntArray736 = local446;
							aStringArray45 = local450;
						} else if (local31 == 42) {
							anIntArray735[anInt10218++] = Static608.anIntArray246[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static608.anIntArray246[local54] = anIntArray735[--anInt10218];
							Static357.method5470(local54);
							Static179.aBoolean335 |= Static276.aBooleanArray33[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray735[--anInt10218];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray737[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray105[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray735[--anInt10218];
							if (local603 < 0 || local603 >= anIntArray737[local54]) {
								throw new RuntimeException();
							}
							anIntArray735[anInt10218++] = anIntArrayArray105[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt10218 -= 2;
							local603 = anIntArray735[anInt10218];
							if (local603 < 0 || local603 >= anIntArray737[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray105[local54][local603] = anIntArray735[anInt10218 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static229.aStringArray11[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray46[anInt10220++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static229.aStringArray11[local54] = aStringArray46[--anInt10220];
							Static177.method3265(local54);
						} else if (local31 == 51) {
							@Pc(774) Class222 local774 = arg0.aClass222Array1[local11[local5]];
							@Pc(787) Class2_Sub15 local787 = (Class2_Sub15) local774.method5468((long) anIntArray735[--anInt10218]);
							if (local787 != null) {
								local5 += local787.anInt1789;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString102 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong287).append(" ");
				for (local603 = anInt10223 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass191Array1[local603].aClass2_Sub5_Sub21_1.aLong287).append(" ");
				}
				local856.append("op: ").append(local13);
				Static420.method6396(local856.toString(), local837);
			} else {
				Static74.method1384("Clientscript error in: " + arg0.aString102);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString102).append("\n");
				for (local603 = anInt10223 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass191Array1[local603].aClass2_Sub5_Sub21_1.aString102).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static420.method6396(local856.toString(), local837);
				Static576.method8008(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "(I)V")
	private static void method8552(@OriginalArg(0) int arg0) {
		@Pc(3) Class78 local3 = Static180.method3291(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class78[] local13 = Static629.aClass78ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class78[] local19 = Static399.aClass78ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static629.aClass78ArrayArray2[local9] = new Class78[local22];
			Static649.method4860(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static649.method4860(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(IZ)V")
	private static void method8553(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class78 local137;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(158) Class78 local158;
		@Pc(35) Class78 local35;
		@Pc(210) Class78 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt10218 -= 3;
				local13 = anIntArray735[anInt10218];
				local19 = anIntArray735[anInt10218 + 1];
				local25 = anIntArray735[anInt10218 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static180.method3291(local13);
				if (local35.aClass78Array9 == null) {
					local35.aClass78Array9 = new Class78[local25 + 1];
				}
				if (local35.aClass78Array9.length <= local25) {
					@Pc(54) Class78[] local54 = new Class78[local25 + 1];
					for (local56 = 0; local56 < local35.aClass78Array9.length; local56++) {
						local54[local56] = local35.aClass78Array9[local56];
					}
					local35.aClass78Array9 = local54;
				}
				if (local25 > 0 && local35.aClass78Array9[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class78 local99 = new Class78();
				local99.anInt1955 = local19;
				local99.anInt1967 = local99.anInt1968 = local35.anInt1968;
				local99.anInt1978 = local25;
				local35.aClass78Array9[local25] = local99;
				if (arg1) {
					aClass78_14 = local99;
				} else {
					aClass78_13 = local99;
				}
				Static397.method6022(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass78_14 : aClass78_13;
				if (local137.anInt1978 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static180.method3291(local137.anInt1968);
				local158.aClass78Array9[local137.anInt1978] = null;
				Static397.method6022(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static180.method3291(anIntArray735[--anInt10218]);
				local137.aClass78Array9 = null;
				Static397.method6022(local137);
				return;
			}
			if (arg0 == 200) {
				anInt10218 -= 2;
				local13 = anIntArray735[anInt10218];
				local19 = anIntArray735[anInt10218 + 1];
				local210 = Static496.method7080(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray735[anInt10218++] = 1;
					if (arg1) {
						aClass78_14 = local210;
						return;
					}
					aClass78_13 = local210;
					return;
				}
				anIntArray735[anInt10218++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray735[--anInt10218];
				local158 = Static180.method3291(local13);
				if (local158 != null) {
					anIntArray735[anInt10218++] = 1;
					if (arg1) {
						aClass78_14 = local158;
						return;
					}
					aClass78_13 = local158;
					return;
				}
				anIntArray735[anInt10218++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray735[--anInt10218];
				method8540(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray735[--anInt10218];
				method8552(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt10218 -= 2;
					local13 = anIntArray735[anInt10218];
					local19 = anIntArray735[anInt10218 + 1];
					for (local25 = 0; local25 < Static636.anIntArray732.length; local25++) {
						if (Static636.anIntArray732[local25] == local13) {
							Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass163_1.method4024(local25, Static489.aClass344_1, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static536.anIntArray624.length; local353++) {
						if (Static536.anIntArray624[local353] == local13) {
							Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass163_1.method4024(local353, Static489.aClass344_1, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt10218 -= 2;
					local13 = anIntArray735[anInt10218];
					local19 = anIntArray735[anInt10218 + 1];
					Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass163_1.method4023(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray735[--anInt10218] != 0;
					Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass163_1.method4018(local412);
					return;
				}
				if (arg0 == 411) {
					anInt10218 -= 2;
					local13 = anIntArray735[anInt10218];
					local19 = anIntArray735[anInt10218 + 1];
					Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass163_1.method4022(local13, local19, Static570.aClass267_2);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static180.method3291(anIntArray735[--anInt10218]);
				} else {
					local137 = arg1 ? aClass78_14 : aClass78_13;
				}
				if (arg0 == 1000) {
					anInt10218 -= 4;
					local137.anInt1924 = anIntArray735[anInt10218];
					local137.anInt2004 = anIntArray735[anInt10218 + 1];
					local19 = anIntArray735[anInt10218 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray735[anInt10218 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte47 = (byte) local19;
					local137.aByte46 = (byte) local25;
					Static397.method6022(local137);
					Static237.method3926(local137);
					if (local137.anInt1978 == -1) {
						Static578.method8020(local137.anInt1968);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt10218 -= 4;
					local137.anInt1929 = anIntArray735[anInt10218];
					local137.anInt1956 = anIntArray735[anInt10218 + 1];
					local137.anInt1982 = 0;
					local137.anInt2015 = 0;
					local19 = anIntArray735[anInt10218 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray735[anInt10218 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte49 = (byte) local19;
					local137.aByte48 = (byte) local25;
					Static397.method6022(local137);
					Static237.method3926(local137);
					if (local137.anInt1955 == 0) {
						Static630.method8478(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray735[--anInt10218] == 1;
					if (local137.aBoolean167 != local645) {
						local137.aBoolean167 = local645;
						Static397.method6022(local137);
					}
					if (local137.anInt1978 == -1) {
						Static394.method6003(local137.anInt1968);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt10218 -= 2;
					local137.anInt1985 = anIntArray735[anInt10218];
					local137.anInt1923 = anIntArray735[anInt10218 + 1];
					Static397.method6022(local137);
					Static237.method3926(local137);
					if (local137.anInt1955 == 0) {
						Static630.method8478(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean174 = anIntArray735[--anInt10218] == 1;
					return;
				}
			} else {
				@Pc(1507) String local1507;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static180.method3291(anIntArray735[--anInt10218]);
					} else {
						local137 = arg1 ? aClass78_14 : aClass78_13;
					}
					if (arg0 == 1100) {
						anInt10218 -= 2;
						local137.anInt1966 = anIntArray735[anInt10218];
						if (local137.anInt1966 > local137.anInt1971 - local137.anInt1964) {
							local137.anInt1966 = local137.anInt1971 - local137.anInt1964;
						}
						if (local137.anInt1966 < 0) {
							local137.anInt1966 = 0;
						}
						local137.anInt2009 = anIntArray735[anInt10218 + 1];
						if (local137.anInt2009 > local137.anInt1961 - local137.anInt1991) {
							local137.anInt2009 = local137.anInt1961 - local137.anInt1991;
						}
						if (local137.anInt2009 < 0) {
							local137.anInt2009 = 0;
						}
						Static397.method6022(local137);
						if (local137.anInt1978 == -1) {
							Static384.method5790(local137.anInt1968);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt2013 = anIntArray735[--anInt10218];
						Static397.method6022(local137);
						if (local137.anInt1978 == -1) {
							Static521.method7294(local137.anInt1968);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean170 = anIntArray735[--anInt10218] == 1;
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt1935 = anIntArray735[--anInt10218];
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt1927 = anIntArray735[--anInt10218];
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray735[--anInt10218];
						if (local137.anInt1986 != local19) {
							local137.anInt1986 = local19;
							Static397.method6022(local137);
						}
						if (local137.anInt1978 == -1) {
							Static204.method3577(local137.anInt1968);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt1994 = anIntArray735[--anInt10218];
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean163 = anIntArray735[--anInt10218] == 1;
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt2002 = 1;
						local137.anInt1962 = anIntArray735[--anInt10218];
						Static397.method6022(local137);
						if (local137.anInt1978 == -1) {
							Static533.method7453(local137.anInt1968);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt10218 -= 6;
						local137.anInt1960 = anIntArray735[anInt10218];
						local137.anInt1954 = anIntArray735[anInt10218 + 1];
						local137.anInt2014 = anIntArray735[anInt10218 + 2];
						local137.anInt1937 = anIntArray735[anInt10218 + 3];
						local137.anInt1995 = anIntArray735[anInt10218 + 4];
						local137.anInt1947 = anIntArray735[anInt10218 + 5];
						Static397.method6022(local137);
						if (local137.anInt1978 == -1) {
							Static286.method6707(local137.anInt1968);
							Static62.method1195(local137.anInt1968);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray735[--anInt10218];
						if (local137.anInt2003 != local19) {
							local137.anInt2003 = local19;
							local137.anInt1925 = 0;
							local137.anInt1973 = 1;
							local137.anInt1946 = 0;
							@Pc(1094) Class149 local1094 = local137.anInt2003 == -1 ? null : Static185.aClass303_1.method7201(local137.anInt2003);
							if (local1094 != null) {
								Static455.method6662(local1094, local137.anInt1925);
							}
							Static397.method6022(local137);
						}
						if (local137.anInt1978 == -1) {
							Static640.method8566(local137.anInt1968);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean179 = anIntArray735[--anInt10218] == 1;
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray46[--anInt10220];
						if (!local1145.equals(local137.aString25)) {
							local137.aString25 = local1145;
							Static397.method6022(local137);
						}
						if (local137.anInt1978 == -1) {
							Static59.method1092(local137.anInt1968);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt1975 = anIntArray735[--anInt10218];
						Static397.method6022(local137);
						if (local137.anInt1978 == -1) {
							Static540.method7585(local137.anInt1968);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt10218 -= 3;
						local137.anInt1990 = anIntArray735[anInt10218];
						local137.anInt1981 = anIntArray735[anInt10218 + 1];
						local137.anInt1988 = anIntArray735[anInt10218 + 2];
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean164 = anIntArray735[--anInt10218] == 1;
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt1953 = anIntArray735[--anInt10218];
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt1970 = anIntArray735[--anInt10218];
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean169 = anIntArray735[--anInt10218] == 1;
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean168 = anIntArray735[--anInt10218] == 1;
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt10218 -= 2;
						local137.anInt1971 = anIntArray735[anInt10218];
						local137.anInt1961 = anIntArray735[anInt10218 + 1];
						Static397.method6022(local137);
						if (local137.anInt1955 == 0) {
							Static630.method8478(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean173 = anIntArray735[--anInt10218] == 1;
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt1947 = anIntArray735[--anInt10218];
						Static397.method6022(local137);
						if (local137.anInt1978 == -1) {
							Static286.method6707(local137.anInt1968);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray735[--anInt10218];
						local137.aBoolean175 = local19 == 1;
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt10218 -= 2;
						local137.anInt1938 = anIntArray735[anInt10218];
						local137.anInt1977 = anIntArray735[anInt10218 + 1];
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt1997 = anIntArray735[--anInt10218];
						Static397.method6022(local137);
						return;
					}
					@Pc(1473) Class79 local1473;
					if (arg0 == 1127) {
						anInt10218 -= 2;
						local19 = anIntArray735[anInt10218];
						local25 = anIntArray735[anInt10218 + 1];
						local1473 = Static584.aClass206_2.method4916(local19);
						if (local25 != local1473.anInt2016) {
							local137.method1686(local19, local25);
							return;
						}
						local137.method1687(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray735[--anInt10218];
						local1507 = aStringArray46[--anInt10220];
						local1473 = Static584.aClass206_2.method4916(local19);
						if (!local1473.aString26.equals(local1507)) {
							local137.method1691(local1507, local19);
							return;
						}
						local137.method1687(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray735[--anInt10218];
						if (local137.anInt1955 != 5 && arg0 == 1129 || local137.anInt1955 != 4 && arg0 == 1130) {
							return;
						}
						if (local137.anInt1976 != local19) {
							local137.anInt1976 = local19;
							Static397.method6022(local137);
						}
						if (local137.anInt1978 == -1) {
							Static84.method1544(local137.anInt1968);
						}
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static180.method3291(anIntArray735[--anInt10218]);
					} else {
						local137 = arg1 ? aClass78_14 : aClass78_13;
					}
					Static397.method6022(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt10218 -= 2;
						local19 = anIntArray735[anInt10218];
						local25 = anIntArray735[anInt10218 + 1];
						if (local137.anInt1978 == -1) {
							Static351.method5452(local137.anInt1968);
							Static286.method6707(local137.anInt1968);
							Static62.method1195(local137.anInt1968);
						}
						if (local19 == -1) {
							local137.anInt2002 = 1;
							local137.anInt1962 = -1;
							local137.anInt2006 = -1;
							return;
						}
						local137.anInt2006 = local19;
						local137.anInt1944 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean166 = true;
						} else {
							local137.aBoolean166 = false;
						}
						@Pc(1697) Class245 local1697 = Static570.aClass267_2.method6597(local19);
						local137.anInt2014 = local1697.anInt7450;
						local137.anInt1937 = local1697.anInt7448;
						local137.anInt1995 = local1697.anInt7453;
						local137.anInt1960 = local1697.anInt7508;
						local137.anInt1954 = local1697.anInt7498;
						local137.anInt1947 = local1697.anInt7477;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt1943 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt1943 = 1;
						} else {
							local137.anInt1943 = 2;
						}
						if (local137.anInt1982 > 0) {
							local137.anInt1947 = local137.anInt1947 * 32 / local137.anInt1982;
							return;
						} else {
							if (local137.anInt1929 > 0) {
								local137.anInt1947 = local137.anInt1947 * 32 / local137.anInt1929;
							}
							return;
						}
					}
					if (arg0 == 1201) {
						local137.anInt2002 = 2;
						local137.anInt1962 = anIntArray735[--anInt10218];
						if (local137.anInt1978 == -1) {
							Static533.method7453(local137.anInt1968);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt2002 = 3;
						local137.anInt1962 = -1;
						if (local137.anInt1978 == -1) {
							Static533.method7453(local137.anInt1968);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt2002 = 6;
						local137.anInt1962 = anIntArray735[--anInt10218];
						if (local137.anInt1978 == -1) {
							Static533.method7453(local137.anInt1968);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt2002 = 5;
						local137.anInt1962 = anIntArray735[--anInt10218];
						if (local137.anInt1978 == -1) {
							Static533.method7453(local137.anInt1968);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt10218 -= 4;
						local137.anInt1945 = anIntArray735[anInt10218];
						local137.anInt1950 = anIntArray735[anInt10218 + 1];
						local137.anInt2001 = anIntArray735[anInt10218 + 2];
						local137.anInt1932 = anIntArray735[anInt10218 + 3];
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt10218 -= 2;
						local137.anInt1958 = anIntArray735[anInt10218];
						local137.anInt1952 = anIntArray735[anInt10218 + 1];
						Static397.method6022(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt10218 -= 4;
						local137.anInt1962 = anIntArray735[anInt10218];
						local137.anInt1983 = anIntArray735[anInt10218 + 1];
						if (anIntArray735[anInt10218 + 2] == 1) {
							local137.anInt2002 = 9;
						} else {
							local137.anInt2002 = 8;
						}
						if (anIntArray735[anInt10218 + 3] == 1) {
							local137.aBoolean166 = true;
						} else {
							local137.aBoolean166 = false;
						}
						if (local137.anInt1978 == -1) {
							Static533.method7453(local137.anInt1968);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt2002 = 5;
						local137.anInt1962 = Static182.anInt4021;
						local137.anInt1983 = 0;
						if (local137.anInt1978 == -1) {
							Static533.method7453(local137.anInt1968);
						}
						return;
					}
				} else {
					@Pc(2357) int local2357;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static180.method3291(anIntArray735[--anInt10218]);
							} else {
								local137 = arg1 ? aClass78_14 : aClass78_13;
							}
							if (arg0 == 1499) {
								local137.method1701();
								return;
							}
							local1145 = aStringArray46[--anInt10220];
							@Pc(2443) int[] local2443 = null;
							if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
								local353 = anIntArray735[--anInt10218];
								if (local353 > 0) {
									local2443 = new int[local353];
									while (local353-- > 0) {
										local2443[local353] = anIntArray735[--anInt10218];
									}
								}
								local1145 = local1145.substring(0, local1145.length() - 1);
							}
							@Pc(2495) Object[] local2495 = new Object[local1145.length() + 1];
							for (local2357 = local2495.length - 1; local2357 >= 1; local2357--) {
								if (local1145.charAt(local2357 - 1) == 's') {
									local2495[local2357] = aStringArray46[--anInt10220];
								} else {
									local2495[local2357] = Integer.valueOf(anIntArray735[--anInt10218]);
								}
							}
							local56 = anIntArray735[--anInt10218];
							if (local56 == -1) {
								local2495 = null;
							} else {
								local2495[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray24 = local2495;
							} else if (arg0 == 1401) {
								local137.anObjectArray6 = local2495;
							} else if (arg0 == 1402) {
								local137.anObjectArray21 = local2495;
							} else if (arg0 == 1403) {
								local137.anObjectArray3 = local2495;
							} else if (arg0 == 1404) {
								local137.anObjectArray25 = local2495;
							} else if (arg0 == 1405) {
								local137.anObjectArray22 = local2495;
							} else if (arg0 == 1406) {
								local137.anObjectArray31 = local2495;
							} else if (arg0 == 1407) {
								local137.anObjectArray11 = local2495;
								local137.anIntArray177 = local2443;
							} else if (arg0 == 1408) {
								local137.anObjectArray12 = local2495;
							} else if (arg0 == 1409) {
								local137.anObjectArray15 = local2495;
							} else if (arg0 == 1410) {
								local137.anObjectArray27 = local2495;
							} else if (arg0 == 1411) {
								local137.anObjectArray2 = local2495;
							} else if (arg0 == 1412) {
								local137.anObjectArray26 = local2495;
							} else if (arg0 == 1414) {
								local137.anObjectArray10 = local2495;
								local137.anIntArray174 = local2443;
							} else if (arg0 == 1415) {
								local137.anObjectArray1 = local2495;
								local137.anIntArray175 = local2443;
							} else if (arg0 == 1416) {
								local137.anObjectArray17 = local2495;
							} else if (arg0 == 1417) {
								local137.anObjectArray29 = local2495;
							} else if (arg0 == 1418) {
								local137.anObjectArray9 = local2495;
							} else if (arg0 == 1419) {
								local137.anObjectArray30 = local2495;
							} else if (arg0 == 1420) {
								local137.anObjectArray5 = local2495;
							} else if (arg0 == 1421) {
								local137.anObjectArray4 = local2495;
							} else if (arg0 == 1422) {
								local137.anObjectArray20 = local2495;
							} else if (arg0 == 1423) {
								local137.anObjectArray14 = local2495;
							} else if (arg0 == 1424) {
								local137.anObjectArray8 = local2495;
							} else if (arg0 == 1425) {
								local137.anObjectArray13 = local2495;
							} else if (arg0 == 1426) {
								local137.anObjectArray23 = local2495;
							} else if (arg0 == 1427) {
								local137.anObjectArray16 = local2495;
							} else if (arg0 == 1428) {
								local137.anObjectArray18 = local2495;
								local137.anIntArray182 = local2443;
							} else if (arg0 == 1429) {
								local137.anObjectArray28 = local2495;
								local137.anIntArray179 = local2443;
							} else if (arg0 == 1430) {
								local137.anObjectArray19 = local2495;
							}
							local137.aBoolean165 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass78_14 : aClass78_13;
							if (arg0 == 1500) {
								anIntArray735[anInt10218++] = local137.anInt1928;
								return;
							}
							if (arg0 == 1501) {
								anIntArray735[anInt10218++] = local137.anInt2005;
								return;
							}
							if (arg0 == 1502) {
								anIntArray735[anInt10218++] = local137.anInt1964;
								return;
							}
							if (arg0 == 1503) {
								anIntArray735[anInt10218++] = local137.anInt1991;
								return;
							}
							if (arg0 == 1504) {
								anIntArray735[anInt10218++] = local137.aBoolean167 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray735[anInt10218++] = local137.anInt1967;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static505.method7154(local137);
								anIntArray735[anInt10218++] = local158 == null ? -1 : local158.anInt1968;
								return;
							}
						} else {
							@Pc(3091) Class79 local3091;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass78_14 : aClass78_13;
								if (arg0 == 1600) {
									anIntArray735[anInt10218++] = local137.anInt1966;
									return;
								}
								if (arg0 == 1601) {
									anIntArray735[anInt10218++] = local137.anInt2009;
									return;
								}
								if (arg0 == 1602) {
									aStringArray46[anInt10220++] = local137.aString25;
									return;
								}
								if (arg0 == 1603) {
									anIntArray735[anInt10218++] = local137.anInt1971;
									return;
								}
								if (arg0 == 1604) {
									anIntArray735[anInt10218++] = local137.anInt1961;
									return;
								}
								if (arg0 == 1605) {
									anIntArray735[anInt10218++] = local137.anInt1947;
									return;
								}
								if (arg0 == 1606) {
									anIntArray735[anInt10218++] = local137.anInt2014;
									return;
								}
								if (arg0 == 1607) {
									anIntArray735[anInt10218++] = local137.anInt1995;
									return;
								}
								if (arg0 == 1608) {
									anIntArray735[anInt10218++] = local137.anInt1937;
									return;
								}
								if (arg0 == 1609) {
									anIntArray735[anInt10218++] = local137.anInt1935;
									return;
								}
								if (arg0 == 1610) {
									anIntArray735[anInt10218++] = local137.anInt1960;
									return;
								}
								if (arg0 == 1611) {
									anIntArray735[anInt10218++] = local137.anInt1954;
									return;
								}
								if (arg0 == 1612) {
									anIntArray735[anInt10218++] = local137.anInt1986;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray735[--anInt10218];
									local3091 = Static584.aClass206_2.method4916(local19);
									if (local3091.method1707()) {
										aStringArray46[anInt10220++] = local137.method1705(local3091.aString26, local19);
										return;
									}
									anIntArray735[anInt10218++] = local137.method1689(local3091.anInt2016, local19);
									return;
								}
								if (arg0 == 1614) {
									anIntArray735[anInt10218++] = local137.anInt1994;
									return;
								}
								if (arg0 == 2614) {
									anIntArray735[anInt10218++] = local137.anInt2002 == 1 ? local137.anInt1962 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass78_14 : aClass78_13;
								if (arg0 == 1700) {
									anIntArray735[anInt10218++] = local137.anInt2006;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt2006 != -1) {
										anIntArray735[anInt10218++] = local137.anInt1944;
										return;
									}
									anIntArray735[anInt10218++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray735[anInt10218++] = local137.anInt1978;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass78_14 : aClass78_13;
								if (arg0 == 1800) {
									anIntArray735[anInt10218++] = Static69.method1332(local137).method6409();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray735[--anInt10218];
									local19--;
									if (local137.aStringArray5 != null && local19 < local137.aStringArray5.length && local137.aStringArray5[local19] != null) {
										aStringArray46[anInt10220++] = local137.aStringArray5[local19];
										return;
									}
									aStringArray46[anInt10220++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString23 == null) {
										aStringArray46[anInt10220++] = "";
										return;
									}
									aStringArray46[anInt10220++] = local137.aString23;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static180.method3291(anIntArray735[--anInt10218]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass78_14 : aClass78_13;
								}
								if (anInt10232 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray16 == null) {
										return;
									}
									@Pc(3360) Class2_Sub42 local3360 = new Class2_Sub42();
									local3360.aClass78_9 = local137;
									local3360.anObjectArray33 = local137.anObjectArray16;
									local3360.anInt8125 = anInt10232 + 1;
									Static564.aClass238_54.method5837(local3360);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static180.method3291(anIntArray735[--anInt10218]);
								if (arg0 == 2500) {
									anIntArray735[anInt10218++] = local137.anInt1928;
									return;
								}
								if (arg0 == 2501) {
									anIntArray735[anInt10218++] = local137.anInt2005;
									return;
								}
								if (arg0 == 2502) {
									anIntArray735[anInt10218++] = local137.anInt1964;
									return;
								}
								if (arg0 == 2503) {
									anIntArray735[anInt10218++] = local137.anInt1991;
									return;
								}
								if (arg0 == 2504) {
									anIntArray735[anInt10218++] = local137.aBoolean167 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray735[anInt10218++] = local137.anInt1967;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static505.method7154(local137);
									anIntArray735[anInt10218++] = local158 == null ? -1 : local158.anInt1968;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static180.method3291(anIntArray735[--anInt10218]);
								if (arg0 == 2600) {
									anIntArray735[anInt10218++] = local137.anInt1966;
									return;
								}
								if (arg0 == 2601) {
									anIntArray735[anInt10218++] = local137.anInt2009;
									return;
								}
								if (arg0 == 2602) {
									aStringArray46[anInt10220++] = local137.aString25;
									return;
								}
								if (arg0 == 2603) {
									anIntArray735[anInt10218++] = local137.anInt1971;
									return;
								}
								if (arg0 == 2604) {
									anIntArray735[anInt10218++] = local137.anInt1961;
									return;
								}
								if (arg0 == 2605) {
									anIntArray735[anInt10218++] = local137.anInt1947;
									return;
								}
								if (arg0 == 2606) {
									anIntArray735[anInt10218++] = local137.anInt2014;
									return;
								}
								if (arg0 == 2607) {
									anIntArray735[anInt10218++] = local137.anInt1995;
									return;
								}
								if (arg0 == 2608) {
									anIntArray735[anInt10218++] = local137.anInt1937;
									return;
								}
								if (arg0 == 2609) {
									anIntArray735[anInt10218++] = local137.anInt1935;
									return;
								}
								if (arg0 == 2610) {
									anIntArray735[anInt10218++] = local137.anInt1960;
									return;
								}
								if (arg0 == 2611) {
									anIntArray735[anInt10218++] = local137.anInt1954;
									return;
								}
								if (arg0 == 2612) {
									anIntArray735[anInt10218++] = local137.anInt1986;
									return;
								}
								if (arg0 == 2613) {
									anIntArray735[anInt10218++] = local137.anInt1994;
									return;
								}
								if (arg0 == 2614) {
									anIntArray735[anInt10218++] = local137.anInt2002 == 1 ? local137.anInt1962 : -1;
									return;
								}
							} else {
								@Pc(3889) Class2_Sub37 local3889;
								@Pc(3787) Class2_Sub37 local3787;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static180.method3291(anIntArray735[--anInt10218]);
										anIntArray735[anInt10218++] = local137.anInt2006;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static180.method3291(anIntArray735[--anInt10218]);
										if (local137.anInt2006 != -1) {
											anIntArray735[anInt10218++] = local137.anInt1944;
											return;
										}
										anIntArray735[anInt10218++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray735[--anInt10218];
										local3787 = (Class2_Sub37) Static206.aClass222_14.method5468((long) local13);
										if (local3787 != null) {
											anIntArray735[anInt10218++] = 1;
											return;
										}
										anIntArray735[anInt10218++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static180.method3291(anIntArray735[--anInt10218]);
										if (local137.aClass78Array9 == null) {
											anIntArray735[anInt10218++] = 0;
											return;
										}
										local19 = local137.aClass78Array9.length;
										for (local25 = 0; local25 < local137.aClass78Array9.length; local25++) {
											if (local137.aClass78Array9[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray735[anInt10218++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt10218 -= 2;
										local13 = anIntArray735[anInt10218];
										local19 = anIntArray735[anInt10218 + 1];
										local3889 = (Class2_Sub37) Static206.aClass222_14.method5468((long) local13);
										if (local3889 != null && local3889.anInt6848 == local19) {
											anIntArray735[anInt10218++] = 1;
											return;
										}
										anIntArray735[anInt10218++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static180.method3291(anIntArray735[--anInt10218]);
									if (arg0 == 2800) {
										anIntArray735[anInt10218++] = Static69.method1332(local137).method6409();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray735[--anInt10218];
										local19--;
										if (local137.aStringArray5 != null && local19 < local137.aStringArray5.length && local137.aStringArray5[local19] != null) {
											aStringArray46[anInt10220++] = local137.aStringArray5[local19];
											return;
										}
										aStringArray46[anInt10220++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString23 == null) {
											aStringArray46[anInt10220++] = "";
											return;
										}
										aStringArray46[anInt10220++] = local137.aString23;
										return;
									}
								} else {
									@Pc(4026) String local4026;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4026 = aStringArray46[--anInt10220];
											Static409.method6287(local4026);
											return;
										}
										if (arg0 == 3101) {
											anInt10218 -= 2;
											Static423.method8401(anIntArray735[anInt10218 + 1], anIntArray735[anInt10218], Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2);
											return;
										}
										if (arg0 == 3103) {
											Static196.method3476();
											return;
										}
										if (arg0 == 3104) {
											local4026 = aStringArray46[--anInt10220];
											local19 = 0;
											if (Static515.method7239(local4026)) {
												local19 = Static56.method1026(local4026);
											}
											@Pc(4086) Class2_Sub50 local4086 = Static595.method8194(Static610.aClass310_2, Static184.aClass269_39);
											local4086.aClass2_Sub34_Sub2_2.method6864(local19);
											Static311.method4754(local4086);
											return;
										}
										@Pc(4115) Class2_Sub50 local4115;
										if (arg0 == 3105) {
											local4026 = aStringArray46[--anInt10220];
											local4115 = Static595.method8194(Static610.aClass310_2, Static364.aClass269_63);
											local4115.aClass2_Sub34_Sub2_2.method6894(local4026.length() + 1);
											local4115.aClass2_Sub34_Sub2_2.method6918(local4026);
											Static311.method4754(local4115);
											return;
										}
										if (arg0 == 3106) {
											local4026 = aStringArray46[--anInt10220];
											local4115 = Static595.method8194(Static610.aClass310_2, Static278.aClass269_55);
											local4115.aClass2_Sub34_Sub2_2.method6894(local4026.length() + 1);
											local4115.aClass2_Sub34_Sub2_2.method6918(local4026);
											Static311.method4754(local4115);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray735[--anInt10218];
											local1145 = aStringArray46[--anInt10220];
											Static195.method7901(local1145, local13);
											return;
										}
										if (arg0 == 3108) {
											anInt10218 -= 3;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											local25 = anIntArray735[anInt10218 + 2];
											local35 = Static180.method3291(local25);
											Static98.method1685(local35, local13, local19);
											return;
										}
										if (arg0 == 3109) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											local210 = arg1 ? aClass78_14 : aClass78_13;
											Static98.method1685(local210, local13, local19);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray735[--anInt10218];
											local4115 = Static595.method8194(Static610.aClass310_2, Static467.aClass269_78);
											local4115.aClass2_Sub34_Sub2_2.method6854(local13);
											Static311.method4754(local4115);
											return;
										}
										if (arg0 == 3111) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											local3889 = (Class2_Sub37) Static206.aClass222_14.method5468((long) local13);
											if (local3889 != null) {
												Static450.method4870(local3889, local3889.anInt6848 != local19, true);
											}
											Static97.method1672(3, local19, local13, true);
											return;
										}
										if (arg0 == 3112) {
											anInt10218--;
											local13 = anIntArray735[anInt10218];
											local3787 = (Class2_Sub37) Static206.aClass222_14.method5468((long) local13);
											if (local3787 != null && local3787.anInt6849 == 3) {
												Static450.method4870(local3787, true, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static391.method5865(aStringArray46[--anInt10220]);
											return;
										}
										if (arg0 == 3114) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											local1507 = aStringArray46[--anInt10220];
											Static369.method5571("", "", local1507, local19, local13, "");
											return;
										}
										if (arg0 == 3115) {
											anInt10218 -= 11;
											@Pc(4416) Class174[] local4416 = Static534.method7469();
											@Pc(4419) Class176[] local4419 = Static85.method1548();
											Static168.method3104(local4419[anIntArray735[anInt10218 + 1]], local4416[anIntArray735[anInt10218]], anIntArray735[anInt10218 + 10], anIntArray735[anInt10218 + 3], anIntArray735[anInt10218 + 4], anIntArray735[anInt10218 + 2], anIntArray735[anInt10218 + 5], anIntArray735[anInt10218 + 8], anIntArray735[anInt10218 + 9], anIntArray735[anInt10218 + 6], anIntArray735[anInt10218 + 7]);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt10218 -= 3;
											Static447.method6629(256, anIntArray735[anInt10218 + 1], 255, anIntArray735[anInt10218], anIntArray735[anInt10218 + 2]);
											return;
										}
										if (arg0 == 3201) {
											Static530.method7410(255, anIntArray735[--anInt10218], 50);
											return;
										}
										if (arg0 == 3202) {
											anInt10218 -= 2;
											Static523.method7317(anIntArray735[anInt10218], 255, anIntArray735[anInt10218 + 1]);
											return;
										}
										if (arg0 == 3203) {
											anInt10218 -= 4;
											Static447.method6629(256, anIntArray735[anInt10218 + 1], anIntArray735[anInt10218 + 3], anIntArray735[anInt10218], anIntArray735[anInt10218 + 2]);
											return;
										}
										if (arg0 == 3204) {
											anInt10218 -= 3;
											Static530.method7410(anIntArray735[anInt10218 + 1], anIntArray735[anInt10218], anIntArray735[anInt10218 + 2]);
											return;
										}
										if (arg0 == 3205) {
											anInt10218 -= 3;
											Static523.method7317(anIntArray735[anInt10218], anIntArray735[anInt10218 + 2], anIntArray735[anInt10218 + 1]);
											return;
										}
										if (arg0 == 3206) {
											anInt10218 -= 4;
											Static411.method6320(256, anIntArray735[anInt10218], anIntArray735[anInt10218 + 3], anIntArray735[anInt10218 + 1], false, anIntArray735[anInt10218 + 2]);
											return;
										}
										if (arg0 == 3207) {
											anInt10218 -= 4;
											Static411.method6320(256, anIntArray735[anInt10218], anIntArray735[anInt10218 + 3], anIntArray735[anInt10218 + 1], true, anIntArray735[anInt10218 + 2]);
											return;
										}
										if (arg0 == 3208) {
											anInt10218 -= 5;
											Static447.method6629(anIntArray735[anInt10218 + 4], anIntArray735[anInt10218 + 1], anIntArray735[anInt10218 + 3], anIntArray735[anInt10218], anIntArray735[anInt10218 + 2]);
											return;
										}
										if (arg0 == 3209) {
											anInt10218 -= 5;
											Static411.method6320(anIntArray735[anInt10218 + 4], anIntArray735[anInt10218], anIntArray735[anInt10218 + 3], anIntArray735[anInt10218 + 1], false, anIntArray735[anInt10218 + 2]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray735[anInt10218++] = Static325.anInt5888;
											return;
										}
										if (arg0 == 3301) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = Static28.method3671(local19, local13, false);
											return;
										}
										if (arg0 == 3302) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = Static84.method1543(false, local19, local13);
											return;
										}
										if (arg0 == 3303) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = Static286.method6696(false, local13, local19);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static496.aClass53_1.method1237(local13).anInt7144;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static459.anIntArray583[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static206.anIntArray296[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static516.anIntArray594[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4944) byte local4944 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124;
											local19 = (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925 >> 9) + Static451.anInt7933;
											local25 = (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929 >> 9) + Static470.anInt8063;
											anIntArray735[anInt10218++] = (local4944 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray735[anInt10218++] = Static259.aBoolean404 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = Static28.method3671(local19, local13, true);
											return;
										}
										if (arg0 == 3314) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = Static84.method1543(true, local19, local13);
											return;
										}
										if (arg0 == 3315) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = Static286.method6696(true, local13, local19);
											return;
										}
										if (arg0 == 3316) {
											if (Static278.anInt5322 >= 2) {
												anIntArray735[anInt10218++] = Static278.anInt5322;
												return;
											}
											anIntArray735[anInt10218++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray735[anInt10218++] = Static226.anInt4630;
											return;
										}
										if (arg0 == 3318) {
											anIntArray735[anInt10218++] = Static460.aClass322_3.anInt9045;
											return;
										}
										if (arg0 == 3321) {
											anIntArray735[anInt10218++] = Static194.anInt4180;
											return;
										}
										if (arg0 == 3322) {
											anIntArray735[anInt10218++] = Static394.anInt7090;
											return;
										}
										if (arg0 == 3323) {
											if (Static126.anInt2937 >= 5 && Static126.anInt2937 <= 9) {
												anIntArray735[anInt10218++] = 1;
												return;
											}
											anIntArray735[anInt10218++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static126.anInt2937 >= 5 && Static126.anInt2937 <= 9) {
												anIntArray735[anInt10218++] = Static126.anInt2937;
												return;
											}
											anIntArray735[anInt10218++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray735[anInt10218++] = Static632.aBoolean751 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray735[anInt10218++] = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt543;
											return;
										}
										if (arg0 == 3327) {
											anIntArray735[anInt10218++] = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass163_1.aBoolean393 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray735[anInt10218++] = Static408.aBoolean565 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static541.method7594(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = Static386.method5816(local19, false, local13);
											return;
										}
										if (arg0 == 3332) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = Static386.method5816(local19, true, local13);
											return;
										}
										if (arg0 == 3333) {
											anIntArray735[anInt10218++] = Static288.anInt5415;
											return;
										}
										if (arg0 == 3335) {
											anIntArray735[anInt10218++] = Static377.anInt6756;
											return;
										}
										if (arg0 == 3336) {
											anInt10218 -= 4;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											local25 = anIntArray735[anInt10218 + 2];
											local353 = anIntArray735[anInt10218 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray735[anInt10218++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray735[anInt10218++] = Static619.anInt10076;
											return;
										}
										if (arg0 == 3338) {
											anIntArray735[anInt10218++] = Static134.method2601();
											return;
										}
										if (arg0 == 3339) {
											anIntArray735[anInt10218++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray735[anInt10218++] = Static540.aBoolean661 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray735[anInt10218++] = Static427.aBoolean578 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray735[anInt10218++] = Static6.aClass40_1.method4504();
											return;
										}
										if (arg0 == 3343) {
											anIntArray735[anInt10218++] = Static6.aClass40_1.method4499();
											return;
										}
										if (arg0 == 3344) {
											aStringArray46[anInt10220++] = Static52.method8519();
											return;
										}
										if (arg0 == 3345) {
											aStringArray46[anInt10220++] = Static282.method4461();
											return;
										}
										if (arg0 == 3346) {
											anIntArray735[anInt10218++] = Static28.method3672();
											return;
										}
										if (arg0 == 3347) {
											anIntArray735[anInt10218++] = Static178.anInt3979;
											return;
										}
										if (arg0 == 3349) {
											anIntArray735[anInt10218++] = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass82_7.method1815() >> 3;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5692) Class340 local5692;
										if (arg0 == 3400) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											local5692 = Static197.aClass118_1.method3057(local13);
											aStringArray46[anInt10220++] = local5692.method7879(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt10218 -= 4;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											local25 = anIntArray735[anInt10218 + 2];
											local353 = anIntArray735[anInt10218 + 3];
											@Pc(5738) Class340 local5738 = Static197.aClass118_1.method3057(local25);
											if (local5738.aChar4 == local13 && local5738.aChar5 == local19) {
												if (local19 == 115) {
													aStringArray46[anInt10220++] = local5738.method7879(local353);
													return;
												}
												anIntArray735[anInt10218++] = local5738.method7878(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt10218 -= 3;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											local25 = anIntArray735[anInt10218 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5814) Class340 local5814 = Static197.aClass118_1.method3057(local19);
											if (local5814.aChar5 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray735[anInt10218++] = local5814.method7886(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray735[--anInt10218];
											local1145 = aStringArray46[--anInt10220];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5692 = Static197.aClass118_1.method3057(local13);
											if (local5692.aChar5 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray735[anInt10218++] = local5692.method7880(local1145) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray735[--anInt10218];
											@Pc(5912) Class340 local5912 = Static197.aClass118_1.method3057(local13);
											anIntArray735[anInt10218++] = local5912.aClass222_38.method5473();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static384.anInt6890 == 0) {
												anIntArray735[anInt10218++] = -2;
												return;
											}
											if (Static384.anInt6890 == 1) {
												anIntArray735[anInt10218++] = -1;
												return;
											}
											anIntArray735[anInt10218++] = Static446.anInt7901;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray735[--anInt10218];
											if (Static384.anInt6890 == 2 && local13 < Static446.anInt7901) {
												aStringArray46[anInt10220++] = Static391.aStringArray25[local13];
												if (Static488.aStringArray35[local13] != null) {
													aStringArray46[anInt10220++] = Static488.aStringArray35[local13];
													return;
												}
												aStringArray46[anInt10220++] = "";
												return;
											}
											aStringArray46[anInt10220++] = "";
											aStringArray46[anInt10220++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray735[--anInt10218];
											if (Static384.anInt6890 == 2 && local13 < Static446.anInt7901) {
												anIntArray735[anInt10218++] = Static59.anIntArray128[local13];
												return;
											}
											anIntArray735[anInt10218++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray735[--anInt10218];
											if (Static384.anInt6890 == 2 && local13 < Static446.anInt7901) {
												anIntArray735[anInt10218++] = Static22.anIntArray731[local13];
												return;
											}
											anIntArray735[anInt10218++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4026 = aStringArray46[--anInt10220];
											local19 = anIntArray735[--anInt10218];
											Static419.method6391(local4026, local19);
											return;
										}
										if (arg0 == 3605) {
											local4026 = aStringArray46[--anInt10220];
											Static390.method5854(local4026);
											return;
										}
										if (arg0 == 3606) {
											local4026 = aStringArray46[--anInt10220];
											Static188.method3425(local4026);
											return;
										}
										if (arg0 == 3607) {
											local4026 = aStringArray46[--anInt10220];
											Static399.method6038(local4026, false);
											return;
										}
										if (arg0 == 3608) {
											local4026 = aStringArray46[--anInt10220];
											Static501.method7136(local4026);
											return;
										}
										if (arg0 == 3609) {
											local4026 = aStringArray46[--anInt10220];
											if (local4026.startsWith("<img=0>") || local4026.startsWith("<img=1>")) {
												local4026 = local4026.substring(7);
											}
											anIntArray735[anInt10218++] = Static473.method6796(local4026) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray735[--anInt10218];
											if (Static384.anInt6890 == 2 && local13 < Static446.anInt7901) {
												aStringArray46[anInt10220++] = Static365.aStringArray23[local13];
												return;
											}
											aStringArray46[anInt10220++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static69.aString17 != null) {
												aStringArray46[anInt10220++] = Static231.method3863(Static69.aString17);
												return;
											}
											aStringArray46[anInt10220++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static69.aString17 != null) {
												anIntArray735[anInt10218++] = Static531.anInt8877;
												return;
											}
											anIntArray735[anInt10218++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray735[--anInt10218];
											if (Static69.aString17 != null && local13 < Static531.anInt8877) {
												aStringArray46[anInt10220++] = Static561.aClass345Array1[local13].aString87;
												return;
											}
											aStringArray46[anInt10220++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray735[--anInt10218];
											if (Static69.aString17 != null && local13 < Static531.anInt8877) {
												anIntArray735[anInt10218++] = Static561.aClass345Array1[local13].anInt9540;
												return;
											}
											anIntArray735[anInt10218++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray735[--anInt10218];
											if (Static69.aString17 != null && local13 < Static531.anInt8877) {
												anIntArray735[anInt10218++] = Static561.aClass345Array1[local13].aByte117;
												return;
											}
											anIntArray735[anInt10218++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray735[anInt10218++] = Static380.aByte95;
											return;
										}
										if (arg0 == 3617) {
											local4026 = aStringArray46[--anInt10220];
											Static513.method7221(local4026);
											return;
										}
										if (arg0 == 3618) {
											anIntArray735[anInt10218++] = Static612.aByte126;
											return;
										}
										if (arg0 == 3619) {
											local4026 = aStringArray46[--anInt10220];
											Static341.method5238(local4026);
											return;
										}
										if (arg0 == 3620) {
											Static76.method1458();
											return;
										}
										if (arg0 == 3621) {
											if (Static384.anInt6890 == 0) {
												anIntArray735[anInt10218++] = -1;
												return;
											}
											anIntArray735[anInt10218++] = Static449.anInt7920;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray735[--anInt10218];
											if (Static384.anInt6890 != 0 && local13 < Static449.anInt7920) {
												aStringArray46[anInt10220++] = Static7.aStringArray3[local13];
												if (Static525.aStringArray38[local13] != null) {
													aStringArray46[anInt10220++] = Static525.aStringArray38[local13];
													return;
												}
												aStringArray46[anInt10220++] = "";
												return;
											}
											aStringArray46[anInt10220++] = "";
											aStringArray46[anInt10220++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4026 = aStringArray46[--anInt10220];
											if (local4026.startsWith("<img=0>") || local4026.startsWith("<img=1>")) {
												local4026 = local4026.substring(7);
											}
											anIntArray735[anInt10218++] = Static169.method8417(local4026) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray735[--anInt10218];
											if (Static561.aClass345Array1 != null && local13 < Static531.anInt8877 && Static561.aClass345Array1[local13].aString85.equalsIgnoreCase(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aString4)) {
												anIntArray735[anInt10218++] = 1;
												return;
											}
											anIntArray735[anInt10218++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static466.aString48 != null) {
												aStringArray46[anInt10220++] = Static466.aString48;
												return;
											}
											aStringArray46[anInt10220++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray735[--anInt10218];
											if (Static69.aString17 != null && local13 < Static531.anInt8877) {
												aStringArray46[anInt10220++] = Static561.aClass345Array1[local13].aString88;
												return;
											}
											aStringArray46[anInt10220++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray735[--anInt10218];
											if (Static384.anInt6890 == 2 && local13 >= 0 && local13 < Static446.anInt7901) {
												anIntArray735[anInt10218++] = Static446.aBooleanArray41[local13] ? 1 : 0;
												return;
											}
											anIntArray735[anInt10218++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4026 = aStringArray46[--anInt10220];
											if (local4026.startsWith("<img=0>") || local4026.startsWith("<img=1>")) {
												local4026 = local4026.substring(7);
											}
											anIntArray735[anInt10218++] = Static606.method8285(local4026);
											return;
										}
										if (arg0 == 3629) {
											anIntArray735[anInt10218++] = Static340.anInt6247;
											return;
										}
										if (arg0 == 3630) {
											local4026 = aStringArray46[--anInt10220];
											Static399.method6038(local4026, true);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static575.aBooleanArray48[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray735[--anInt10218];
											if (Static69.aString17 != null && local13 < Static531.anInt8877) {
												aStringArray46[anInt10220++] = Static561.aClass345Array1[local13].aString85;
												return;
											}
											aStringArray46[anInt10220++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray735[--anInt10218];
											if (Static384.anInt6890 != 0 && local13 < Static449.anInt7920) {
												aStringArray46[anInt10220++] = Static17.aStringArray4[local13];
												return;
											}
											aStringArray46[anInt10220++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static470.aClass37Array1[local13].method843();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static470.aClass37Array1[local13].anInt950;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static470.aClass37Array1[local13].anInt947;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static470.aClass37Array1[local13].anInt945;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static470.aClass37Array1[local13].anInt944;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static470.aClass37Array1[local13].anInt946;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray735[--anInt10218];
											local19 = Static470.aClass37Array1[local13].method842();
											anIntArray735[anInt10218++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray735[--anInt10218];
											local19 = Static470.aClass37Array1[local13].method842();
											anIntArray735[anInt10218++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray735[--anInt10218];
											local19 = Static470.aClass37Array1[local13].method842();
											anIntArray735[anInt10218++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray735[--anInt10218];
											local19 = Static470.aClass37Array1[local13].method842();
											anIntArray735[anInt10218++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt10218 -= 5;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											local25 = anIntArray735[anInt10218 + 2];
											local353 = anIntArray735[anInt10218 + 3];
											local2357 = anIntArray735[anInt10218 + 4];
											anIntArray735[anInt10218++] = local13 + (local19 - local13) * (local2357 - local25) / (local353 - local25);
											return;
										}
										@Pc(7422) long local7422;
										@Pc(7415) long local7415;
										if (arg0 == 4007) {
											anInt10218 -= 2;
											local7415 = anIntArray735[anInt10218];
											local7422 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = (int) (local7415 + local7415 * local7422 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											if (local13 == 0) {
												anIntArray735[anInt10218++] = 0;
												return;
											}
											anIntArray735[anInt10218++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											if (local13 == 0) {
												anIntArray735[anInt10218++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray735[anInt10218++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray735[anInt10218++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt10218 -= 3;
											local7415 = anIntArray735[anInt10218];
											local7422 = anIntArray735[anInt10218 + 1];
											@Pc(7803) long local7803 = (long) anIntArray735[anInt10218 + 2];
											anIntArray735[anInt10218++] = (int) (local7415 * local7803 / local7422);
											return;
										}
										if (arg0 == 4019) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											if (local13 > 700 || local19 > 700) {
												anIntArray735[anInt10218++] = 256;
											}
											@Pc(7862) double local7862 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
											anIntArray735[anInt10218++] = (int) (Math.pow(2.0D, local7862) + 0.5D);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local4026 = aStringArray46[--anInt10220];
											local19 = anIntArray735[--anInt10218];
											aStringArray46[anInt10220++] = local4026 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt10220 -= 2;
											local4026 = aStringArray46[anInt10220];
											local1145 = aStringArray46[anInt10220 + 1];
											aStringArray46[anInt10220++] = local4026 + local1145;
											return;
										}
										if (arg0 == 4102) {
											local4026 = aStringArray46[--anInt10220];
											local19 = anIntArray735[--anInt10218];
											aStringArray46[anInt10220++] = local4026 + Static167.method3079(local19);
											return;
										}
										if (arg0 == 4103) {
											local4026 = aStringArray46[--anInt10220];
											aStringArray46[anInt10220++] = local4026.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray46[anInt10220++] = method8545(anIntArray735[--anInt10218]);
											return;
										}
										if (arg0 == 4105) {
											anInt10220 -= 2;
											local4026 = aStringArray46[anInt10220];
											local1145 = aStringArray46[anInt10220 + 1];
											if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass163_1 != null && Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass163_1.aBoolean393) {
												aStringArray46[anInt10220++] = local1145;
												return;
											}
											aStringArray46[anInt10220++] = local4026;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray735[--anInt10218];
											aStringArray46[anInt10220++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt10220 -= 2;
											anIntArray735[anInt10218++] = Static401.method6154(aStringArray46[anInt10220 + 1], Static377.anInt6756, aStringArray46[anInt10220]);
											return;
										}
										@Pc(8145) Class114 local8145;
										if (arg0 == 4108) {
											local4026 = aStringArray46[--anInt10220];
											anInt10218 -= 2;
											local19 = anIntArray735[anInt10218];
											local25 = anIntArray735[anInt10218 + 1];
											local8145 = Static15.method322(Static428.aClass97_107, local25);
											anIntArray735[anInt10218++] = local8145.method3016(local19, local4026, Static539.aClass20Array13);
											return;
										}
										if (arg0 == 4109) {
											local4026 = aStringArray46[--anInt10220];
											anInt10218 -= 2;
											local19 = anIntArray735[anInt10218];
											local25 = anIntArray735[anInt10218 + 1];
											local8145 = Static15.method322(Static428.aClass97_107, local25);
											anIntArray735[anInt10218++] = local8145.method3012(local19, Static539.aClass20Array13, local4026);
											return;
										}
										if (arg0 == 4110) {
											anInt10220 -= 2;
											local4026 = aStringArray46[anInt10220];
											local1145 = aStringArray46[anInt10220 + 1];
											if (anIntArray735[--anInt10218] == 1) {
												aStringArray46[anInt10220++] = local4026;
												return;
											}
											aStringArray46[anInt10220++] = local1145;
											return;
										}
										if (arg0 == 4111) {
											local4026 = aStringArray46[--anInt10220];
											aStringArray46[anInt10220++] = Static386.method5817(local4026);
											return;
										}
										if (arg0 == 4112) {
											local4026 = aStringArray46[--anInt10220];
											local19 = anIntArray735[--anInt10218];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray46[anInt10220++] = local4026 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = method8542((char) local13);
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static371.method5587((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static636.method8514((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static262.method4259((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local4026 = aStringArray46[--anInt10220];
											if (local4026 != null) {
												anIntArray735[anInt10218++] = local4026.length();
												return;
											}
											anIntArray735[anInt10218++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local4026 = aStringArray46[--anInt10220];
											anInt10218 -= 2;
											local19 = anIntArray735[anInt10218];
											local25 = anIntArray735[anInt10218 + 1];
											aStringArray46[anInt10220++] = local4026.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local4026 = aStringArray46[--anInt10220];
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
											aStringArray46[anInt10220++] = local8503.toString();
											return;
										}
										if (arg0 == 4120) {
											local4026 = aStringArray46[--anInt10220];
											anInt10218 -= 2;
											local19 = anIntArray735[anInt10218];
											local25 = anIntArray735[anInt10218 + 1];
											anIntArray735[anInt10218++] = local4026.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt10220 -= 2;
											local4026 = aStringArray46[anInt10220];
											local1145 = aStringArray46[anInt10220 + 1];
											local25 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = local4026.indexOf(local1145, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray735[--anInt10218] != 0;
											local19 = anIntArray735[--anInt10218];
											aStringArray46[anInt10220++] = Static593.method8170(local412, 0, Static377.anInt6756, (long) local19);
											return;
										}
										if (arg0 == 4125) {
											local4026 = aStringArray46[--anInt10220];
											local19 = anIntArray735[--anInt10218];
											@Pc(8726) Class114 local8726 = Static15.method322(Static428.aClass97_107, local19);
											anIntArray735[anInt10218++] = local8726.method3008(Static539.aClass20Array13, local4026);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray735[--anInt10218];
											aStringArray46[anInt10220++] = Static570.aClass267_2.method6597(local13).aString72;
											return;
										}
										@Pc(8788) Class245 local8788;
										if (arg0 == 4201) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											local8788 = Static570.aClass267_2.method6597(local13);
											if (local19 >= 1 && local19 <= 5 && local8788.aStringArray26[local19 - 1] != null) {
												aStringArray46[anInt10220++] = local8788.aStringArray26[local19 - 1];
												return;
											}
											aStringArray46[anInt10220++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											local8788 = Static570.aClass267_2.method6597(local13);
											if (local19 >= 1 && local19 <= 5 && local8788.aStringArray27[local19 - 1] != null) {
												aStringArray46[anInt10220++] = local8788.aStringArray27[local19 - 1];
												return;
											}
											aStringArray46[anInt10220++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static570.aClass267_2.method6597(local13).anInt7481;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static570.aClass267_2.method6597(local13).anInt7464 == 1 ? 1 : 0;
											return;
										}
										@Pc(8951) Class245 local8951;
										if (arg0 == 4205) {
											local13 = anIntArray735[--anInt10218];
											local8951 = Static570.aClass267_2.method6597(local13);
											if (local8951.anInt7460 == -1 && local8951.anInt7461 >= 0) {
												anIntArray735[anInt10218++] = local8951.anInt7461;
												return;
											}
											anIntArray735[anInt10218++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray735[--anInt10218];
											local8951 = Static570.aClass267_2.method6597(local13);
											if (local8951.anInt7460 >= 0 && local8951.anInt7461 >= 0) {
												anIntArray735[anInt10218++] = local8951.anInt7461;
												return;
											}
											anIntArray735[anInt10218++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static570.aClass267_2.method6597(local13).aBoolean566 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											local3091 = Static584.aClass206_2.method4916(local19);
											if (local3091.method1707()) {
												aStringArray46[anInt10220++] = Static570.aClass267_2.method6597(local13).method6271(local3091.aString26, local19);
												return;
											}
											anIntArray735[anInt10218++] = Static570.aClass267_2.method6597(local13).method6277(local19, local3091.anInt2016);
											return;
										}
										if (arg0 == 4209) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1] - 1;
											local8788 = Static570.aClass267_2.method6597(local13);
											if (local8788.anInt7486 == local19) {
												anIntArray735[anInt10218++] = local8788.anInt7480;
												return;
											}
											if (local8788.anInt7451 == local19) {
												anIntArray735[anInt10218++] = local8788.anInt7452;
												return;
											}
											anIntArray735[anInt10218++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local4026 = aStringArray46[--anInt10220];
											local19 = anIntArray735[--anInt10218];
											Static532.method7446(local4026, local19 == 1);
											anIntArray735[anInt10218++] = Static214.anInt4435;
											return;
										}
										if (arg0 == 4211) {
											if (Static275.aShortArray60 != null && Static291.anInt5470 < Static214.anInt4435) {
												anIntArray735[anInt10218++] = Static275.aShortArray60[Static291.anInt5470++] & 0xFFFF;
												return;
											}
											anIntArray735[anInt10218++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static291.anInt5470 = 0;
											return;
										}
										if (arg0 == 4213) {
											local13 = anIntArray735[--anInt10218];
											anIntArray735[anInt10218++] = Static570.aClass267_2.method6597(local13).anInt7457;
											return;
										}
										if (arg0 == 4214) {
											local4026 = aStringArray46[--anInt10220];
											anInt10218 -= 3;
											local19 = anIntArray735[anInt10218];
											local25 = anIntArray735[anInt10218 + 1];
											local353 = anIntArray735[anInt10218 + 2];
											Static111.method4502(local25, local19 == 1, local4026, local353);
											anIntArray735[anInt10218++] = Static214.anInt4435;
											return;
										}
										if (arg0 == 4215) {
											anInt10220 -= 2;
											anInt10218 -= 2;
											local4026 = aStringArray46[anInt10220];
											local19 = anIntArray735[anInt10218];
											local25 = anIntArray735[anInt10218 + 1];
											@Pc(9350) String local9350 = aStringArray46[anInt10220 + 1];
											Static278.method4449(local9350, local4026, local19 == 1, local25);
											anIntArray735[anInt10218++] = Static214.anInt4435;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											local3091 = Static584.aClass206_2.method4916(local19);
											if (local3091.method1707()) {
												aStringArray46[anInt10220++] = Static341.aClass76_1.method1676(local13).method5780(local19, local3091.aString26);
												return;
											}
											anIntArray735[anInt10218++] = Static341.aClass76_1.method1676(local13).method5788(local3091.anInt2016, local19);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											local3091 = Static584.aClass206_2.method4916(local19);
											if (local3091.method1707()) {
												aStringArray46[anInt10220++] = Static619.aClass281_4.method6734(local13).method8092(local19, local3091.aString26);
												return;
											}
											anIntArray735[anInt10218++] = Static619.aClass281_4.method6734(local13).method8077(local3091.anInt2016, local19);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt10218 -= 2;
											local13 = anIntArray735[anInt10218];
											local19 = anIntArray735[anInt10218 + 1];
											local3091 = Static584.aClass206_2.method4916(local19);
											if (local3091.method1707()) {
												aStringArray46[anInt10220++] = Static232.aClass92_3.method2509(local13).method4628(local3091.aString26, local19);
												return;
											}
											anIntArray735[anInt10218++] = Static232.aClass92_3.method2509(local13).method4629(local3091.anInt2016, local19);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray735[--anInt10218];
										@Pc(9578) Class165 local9578 = Static182.aClass140_1.method3446(local13);
										if (local9578.anIntArray335 != null && local9578.anIntArray335.length > 0) {
											local25 = 0;
											local353 = local9578.anIntArray334[0];
											for (local2357 = 1; local2357 < local9578.anIntArray335.length; local2357++) {
												if (local9578.anIntArray334[local2357] > local353) {
													local25 = local2357;
													local353 = local9578.anIntArray334[local2357];
												}
											}
											anIntArray735[anInt10218++] = local9578.anIntArray335[local25];
											return;
										}
										anIntArray735[anInt10218++] = local9578.anInt4890;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static180.method3291(anIntArray735[--anInt10218]);
						} else {
							local137 = arg1 ? aClass78_14 : aClass78_13;
						}
						if (arg0 == 1300) {
							local19 = anIntArray735[--anInt10218] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method1698(local19, aStringArray46[--anInt10220]);
								return;
							}
							anInt10220--;
							return;
						}
						if (arg0 == 1301) {
							anInt10218 -= 2;
							local19 = anIntArray735[anInt10218];
							local25 = anIntArray735[anInt10218 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass78_3 = null;
								return;
							}
							local137.aClass78_3 = Static496.method7080(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray735[--anInt10218];
							if (local19 != Static397.anInt7109 && local19 != Static246.anInt9827 && local19 != Static446.anInt7905) {
								return;
							}
							local137.anInt2007 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt2000 = anIntArray735[--anInt10218];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt1974 = anIntArray735[--anInt10218];
							return;
						}
						if (arg0 == 1305) {
							local137.aString23 = aStringArray46[--anInt10220];
							return;
						}
						if (arg0 == 1306) {
							local137.aString21 = aStringArray46[--anInt10220];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray5 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt1972 = anIntArray735[--anInt10218];
							local137.anInt1957 = anIntArray735[--anInt10218];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray735[--anInt10218];
							local25 = anIntArray735[--anInt10218];
							if (local25 >= 1 && local25 <= 10) {
								local137.method1706(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString24 = aStringArray46[--anInt10220];
							return;
						}
						if (arg0 == 1311) {
							local137.lb = anIntArray735[--anInt10218];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt10218 -= 3;
								local19 = anIntArray735[anInt10218] - 1;
								local25 = anIntArray735[anInt10218 + 1];
								local353 = anIntArray735[anInt10218 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt10218 -= 2;
								local19 = 10;
								local25 = anIntArray735[anInt10218];
								local353 = anIntArray735[anInt10218 + 1];
							}
							if (local137.aByteArray26 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray26 = new byte[11];
								local137.aByteArray25 = new byte[11];
								local137.anIntArray176 = new int[11];
							}
							local137.aByteArray26[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean172 = false;
								for (local2357 = 0; local2357 < local137.aByteArray26.length; local2357++) {
									if (local137.aByteArray26[local2357] != 0) {
										local137.aBoolean172 = true;
										break;
									}
								}
							} else {
								local137.aBoolean172 = true;
							}
							local137.aByteArray25[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt1998 = anIntArray735[--anInt10218];
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}
}
