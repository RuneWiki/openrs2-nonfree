import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "Lclient!ria;")
	private static Class303 aClass303_7;

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "[I")
	private static int[] anIntArray207;

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray18;

	@OriginalMember(owner = "client!ffa", name = "m", descriptor = "Lclient!ria;")
	private static Class303 aClass303_8;

	@OriginalMember(owner = "client!ffa", name = "t", descriptor = "Lclient!th;")
	private static Class330 aClass330_1;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
	private static int anInt3183 = 0;

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray19 = new String[1000];

	@OriginalMember(owner = "client!ffa", name = "g", descriptor = "I")
	private static int anInt3185 = 0;

	@OriginalMember(owner = "client!ffa", name = "k", descriptor = "[I")
	private static final int[] anIntArray208 = new int[1000];

	@OriginalMember(owner = "client!ffa", name = "n", descriptor = "I")
	private static int anInt3190 = 0;

	@OriginalMember(owner = "client!ffa", name = "u", descriptor = "[I")
	private static final int[] anIntArray209 = new int[5];

	@OriginalMember(owner = "client!ffa", name = "w", descriptor = "[Lclient!pb;")
	private static final Class266[] aClass266Array1 = new Class266[50];

	@OriginalMember(owner = "client!ffa", name = "x", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!ffa", name = "y", descriptor = "[[I")
	private static final int[][] anIntArrayArray29 = new int[5][5000];

	@OriginalMember(owner = "client!ffa", name = "z", descriptor = "[I")
	private static final int[] anIntArray210 = new int[3];

	@OriginalMember(owner = "client!ffa", name = "A", descriptor = "Lclient!de;")
	public static final Class69 aClass69_17 = new Class69(4);

	@OriginalMember(owner = "client!ffa", name = "C", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray20 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ffa", name = "D", descriptor = "I")
	private static int anInt3197 = 0;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZ)V")
	private static void method2726(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class2_Sub31 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray208[anInt3185++] = Static487.anInt7837;
				return;
			}
			if (arg0 == 5001) {
				anInt3185 -= 3;
				Static487.anInt7837 = anIntArray208[anInt3185];
				Static580.aClass36_4 = Static488.method6981(anIntArray208[anInt3185 + 1]);
				if (Static580.aClass36_4 == null) {
					Static580.aClass36_4 = Static301.aClass36_3;
				}
				Static231.anInt4254 = anIntArray208[anInt3185 + 2];
				local52 = Static275.method4480(Static640.aClass314_2, Static511.aClass145_147);
				local52.aClass2_Sub17_Sub1_2.method2837(Static487.anInt7837);
				local52.aClass2_Sub17_Sub1_2.method2837(Static580.aClass36_4.anInt1123);
				local52.aClass2_Sub17_Sub1_2.method2837(Static231.anInt4254);
				Static526.method7309(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt3190 -= 2;
				local83 = aStringArray19[anInt3190];
				local89 = aStringArray19[anInt3190 + 1];
				anInt3185 -= 2;
				local97 = anIntArray208[anInt3185];
				local103 = anIntArray208[anInt3185 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class2_Sub31 local125 = Static275.method4480(Static640.aClass314_2, Static164.aClass145_54);
				local125.aClass2_Sub17_Sub1_2.method2837(Static443.method6359(local83) + Static443.method6359(local89) + 2);
				local125.aClass2_Sub17_Sub1_2.method2856(local83);
				local125.aClass2_Sub17_Sub1_2.method2837(local97 - 1);
				local125.aClass2_Sub17_Sub1_2.method2837(local103);
				local125.aClass2_Sub17_Sub1_2.method2856(local89);
				Static526.method7309(local125);
				return;
			}
			@Pc(179) Class337 local179;
			if (arg0 == 5003) {
				local175 = anIntArray208[--anInt3185];
				local179 = Static269.method4436(local175);
				local181 = "";
				if (local179 != null && local179.aString90 != null) {
					local181 = local179.aString90;
				}
				aStringArray19[anInt3190++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray208[--anInt3185];
				local179 = Static269.method4436(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9230;
				}
				anIntArray208[anInt3185++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static580.aClass36_4 == null) {
					anIntArray208[anInt3185++] = -1;
					return;
				}
				anIntArray208[anInt3185++] = Static580.aClass36_4.anInt1123;
				return;
			}
			@Pc(269) Class2_Sub31 local269;
			if (arg0 == 5006) {
				local175 = anIntArray208[--anInt3185];
				local269 = Static275.method4480(Static640.aClass314_2, Static380.aClass145_181);
				local269.aClass2_Sub17_Sub1_2.method2837(local175);
				Static526.method7309(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray19[--anInt3190];
				method2729(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3190 -= 2;
				local83 = aStringArray19[anInt3190];
				local89 = aStringArray19[anInt3190 + 1];
				if (Static463.anInt7496 != 0 || (!Static279.aBoolean378 || Static318.aBoolean410) && !Static539.aBoolean620) {
					@Pc(328) Class2_Sub31 local328 = Static275.method4480(Static640.aClass314_2, Static46.aClass145_96);
					local328.aClass2_Sub17_Sub1_2.method2837(0);
					local103 = local328.aClass2_Sub17_Sub1_2.anInt3378;
					local328.aClass2_Sub17_Sub1_2.method2856(local83);
					Static476.method6755(local328.aClass2_Sub17_Sub1_2, local89);
					local328.aClass2_Sub17_Sub1_2.method2840(local328.aClass2_Sub17_Sub1_2.anInt3378 - local103);
					Static526.method7309(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray208[--anInt3185];
				local179 = Static269.method4436(local175);
				local181 = "";
				if (local179 != null && local179.aString91 != null) {
					local181 = local179.aString91;
				}
				aStringArray19[anInt3190++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray208[--anInt3185];
				local179 = Static269.method4436(local175);
				local181 = "";
				if (local179 != null && local179.aString93 != null) {
					local181 = local179.aString93;
				}
				aStringArray19[anInt3190++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray208[--anInt3185];
				local179 = Static269.method4436(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9225;
				}
				anIntArray208[anInt3185++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 == null || Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aString83 == null) {
					local83 = "";
				} else {
					local83 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.method7015();
				}
				aStringArray19[anInt3190++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray208[anInt3185++] = Static231.anInt4254;
				return;
			}
			if (arg0 == 5017) {
				anIntArray208[anInt3185++] = Static71.method1633();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray208[--anInt3185];
				local179 = Static269.method4436(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt9232;
				}
				anIntArray208[anInt3185++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray208[--anInt3185];
				local179 = Static269.method4436(local175);
				local181 = "";
				if (local179 != null && local179.aString94 != null) {
					local181 = local179.aString94;
				}
				aStringArray19[anInt3190++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 == null || Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aString83 == null) {
					local83 = "";
				} else {
					local83 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.method7018();
				}
				aStringArray19[anInt3190++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray208[--anInt3185];
				local179 = Static269.method4436(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9226;
				}
				anIntArray208[anInt3185++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray208[--anInt3185];
				local179 = Static269.method4436(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9231;
				}
				anIntArray208[anInt3185++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray208[--anInt3185];
				local179 = Static269.method4436(local175);
				local181 = "";
				if (local179 != null && local179.aString92 != null) {
					local181 = local179.aString92;
				}
				aStringArray19[anInt3190++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray208[--anInt3185];
				aStringArray19[anInt3190++] = Static190.aClass106_1.method2607(local175).aString29;
				return;
			}
			@Pc(736) Class2_Sub7_Sub4 local736;
			if (arg0 == 5051) {
				local175 = anIntArray208[--anInt3185];
				local736 = Static190.aClass106_1.method2607(local175);
				if (local736.anIntArray200 == null) {
					anIntArray208[anInt3185++] = 0;
					return;
				}
				anIntArray208[anInt3185++] = local736.anIntArray200.length;
				return;
			}
			if (arg0 == 5052) {
				anInt3185 -= 2;
				local175 = anIntArray208[anInt3185];
				local776 = anIntArray208[anInt3185 + 1];
				@Pc(781) Class2_Sub7_Sub4 local781 = Static190.aClass106_1.method2607(local175);
				local103 = local781.anIntArray200[local776];
				anIntArray208[anInt3185++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray208[--anInt3185];
				local736 = Static190.aClass106_1.method2607(local175);
				if (local736.anIntArray201 == null) {
					anIntArray208[anInt3185++] = 0;
					return;
				}
				anIntArray208[anInt3185++] = local736.anIntArray201.length;
				return;
			}
			if (arg0 == 5054) {
				anInt3185 -= 2;
				local175 = anIntArray208[anInt3185];
				local776 = anIntArray208[anInt3185 + 1];
				anIntArray208[anInt3185++] = Static190.aClass106_1.method2607(local175).anIntArray201[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray208[--anInt3185];
				aStringArray19[anInt3190++] = Static327.aClass344_1.method7949(local175).method6601();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray208[--anInt3185];
				@Pc(907) Class2_Sub7_Sub16 local907 = Static327.aClass344_1.method7949(local175);
				if (local907.anIntArray520 == null) {
					anIntArray208[anInt3185++] = 0;
					return;
				}
				anIntArray208[anInt3185++] = local907.anIntArray520.length;
				return;
			}
			if (arg0 == 5057) {
				anInt3185 -= 2;
				local175 = anIntArray208[anInt3185];
				local776 = anIntArray208[anInt3185 + 1];
				anIntArray208[anInt3185++] = Static327.aClass344_1.method7949(local175).anIntArray520[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass330_1 = new Class330();
				aClass330_1.anInt8838 = anIntArray208[--anInt3185];
				aClass330_1.aClass2_Sub7_Sub16_1 = Static327.aClass344_1.method7949(aClass330_1.anInt8838);
				aClass330_1.anIntArray657 = new int[aClass330_1.aClass2_Sub7_Sub16_1.method6598()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static275.method4480(Static640.aClass314_2, Static431.aClass145_138);
				local52.aClass2_Sub17_Sub1_2.method2837(0);
				local776 = local52.aClass2_Sub17_Sub1_2.anInt3378;
				local52.aClass2_Sub17_Sub1_2.method2837(0);
				local52.aClass2_Sub17_Sub1_2.method2879(aClass330_1.anInt8838);
				aClass330_1.aClass2_Sub7_Sub16_1.method6600(aClass330_1.anIntArray657, local52.aClass2_Sub17_Sub1_2);
				local52.aClass2_Sub17_Sub1_2.method2840(local52.aClass2_Sub17_Sub1_2.anInt3378 - local776);
				Static526.method7309(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray19[--anInt3190];
				local269 = Static275.method4480(Static640.aClass314_2, Static599.aClass145_172);
				local269.aClass2_Sub17_Sub1_2.method2837(0);
				local97 = local269.aClass2_Sub17_Sub1_2.anInt3378;
				local269.aClass2_Sub17_Sub1_2.method2856(local83);
				local269.aClass2_Sub17_Sub1_2.method2879(aClass330_1.anInt8838);
				aClass330_1.aClass2_Sub7_Sub16_1.method6600(aClass330_1.anIntArray657, local269.aClass2_Sub17_Sub1_2);
				local269.aClass2_Sub17_Sub1_2.method2840(local269.aClass2_Sub17_Sub1_2.anInt3378 - local97);
				Static526.method7309(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static275.method4480(Static640.aClass314_2, Static431.aClass145_138);
				local52.aClass2_Sub17_Sub1_2.method2837(0);
				local776 = local52.aClass2_Sub17_Sub1_2.anInt3378;
				local52.aClass2_Sub17_Sub1_2.method2837(1);
				local52.aClass2_Sub17_Sub1_2.method2879(aClass330_1.anInt8838);
				aClass330_1.aClass2_Sub7_Sub16_1.method6600(aClass330_1.anIntArray657, local52.aClass2_Sub17_Sub1_2);
				local52.aClass2_Sub17_Sub1_2.method2840(local52.aClass2_Sub17_Sub1_2.anInt3378 - local776);
				Static526.method7309(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt3185 -= 2;
				local175 = anIntArray208[anInt3185];
				local776 = anIntArray208[anInt3185 + 1];
				anIntArray208[anInt3185++] = Static190.aClass106_1.method2607(local175).aCharArray4[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt3185 -= 2;
				local175 = anIntArray208[anInt3185];
				local776 = anIntArray208[anInt3185 + 1];
				anIntArray208[anInt3185++] = Static190.aClass106_1.method2607(local175).aCharArray5[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt3185 -= 2;
				local175 = anIntArray208[anInt3185];
				local776 = anIntArray208[anInt3185 + 1];
				if (local776 == -1) {
					anIntArray208[anInt3185++] = -1;
					return;
				}
				anIntArray208[anInt3185++] = Static190.aClass106_1.method2607(local175).method2629((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt3185 -= 2;
				local175 = anIntArray208[anInt3185];
				local776 = anIntArray208[anInt3185 + 1];
				if (local776 == -1) {
					anIntArray208[anInt3185++] = -1;
					return;
				}
				anIntArray208[anInt3185++] = Static190.aClass106_1.method2607(local175).method2630((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray208[--anInt3185];
				anIntArray208[anInt3185++] = Static327.aClass344_1.method7949(local175).method6598();
				return;
			}
			if (arg0 == 5067) {
				anInt3185 -= 2;
				local175 = anIntArray208[anInt3185];
				local776 = anIntArray208[anInt3185 + 1];
				local97 = Static327.aClass344_1.method7949(local175).method6606(local776).anInt3284;
				anIntArray208[anInt3185++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt3185 -= 2;
				local175 = anIntArray208[anInt3185];
				local776 = anIntArray208[anInt3185 + 1];
				aClass330_1.anIntArray657[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt3185 -= 2;
				local175 = anIntArray208[anInt3185];
				local776 = anIntArray208[anInt3185 + 1];
				aClass330_1.anIntArray657[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt3185 -= 3;
				local175 = anIntArray208[anInt3185];
				local776 = anIntArray208[anInt3185 + 1];
				local97 = anIntArray208[anInt3185 + 2];
				@Pc(1448) Class2_Sub7_Sub16 local1448 = Static327.aClass344_1.method7949(local175);
				if (local1448.method6606(local776).anInt3284 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray208[anInt3185++] = local1448.method6604(local776, local97);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray19[--anInt3190];
				local1496 = anIntArray208[--anInt3185] == 1;
				Static126.method2267(local1496, local83);
				anIntArray208[anInt3185++] = Static336.anInt5883;
				return;
			}
			if (arg0 == 5072) {
				if (Static155.aShortArray48 != null && Static588.anInt9782 < Static336.anInt5883) {
					anIntArray208[anInt3185++] = Static155.aShortArray48[Static588.anInt9782++] & 0xFFFF;
					return;
				}
				anIntArray208[anInt3185++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static588.anInt9782 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static185.aClass221_1.method8050(86)) {
					anIntArray208[anInt3185++] = 1;
					return;
				}
				anIntArray208[anInt3185++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static185.aClass221_1.method8050(82)) {
					anIntArray208[anInt3185++] = 1;
					return;
				}
				anIntArray208[anInt3185++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static185.aClass221_1.method8050(81)) {
					anIntArray208[anInt3185++] = 1;
					return;
				}
				anIntArray208[anInt3185++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static410.method6035(anIntArray208[--anInt3185]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray208[anInt3185++] = Static339.method5140();
					return;
				}
				if (arg0 == 5205) {
					Static285.method4530(anIntArray208[--anInt3185], -1, -1, false);
					return;
				}
				@Pc(1696) Class2_Sub7_Sub3 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray208[--anInt3185];
					local1696 = Static371.method7978(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray208[anInt3185++] = -1;
						return;
					}
					anIntArray208[anInt3185++] = local1696.anInt2691;
					return;
				}
				@Pc(1729) Class2_Sub7_Sub3 local1729;
				if (arg0 == 5207) {
					local1729 = Static371.method7991(anIntArray208[--anInt3185]);
					if (local1729 != null && local1729.aString25 != null) {
						aStringArray19[anInt3190++] = local1729.aString25;
						return;
					}
					aStringArray19[anInt3190++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray208[anInt3185++] = Static388.anInt6681;
					anIntArray208[anInt3185++] = Static318.anInt5613;
					return;
				}
				if (arg0 == 5209) {
					anIntArray208[anInt3185++] = Static331.anInt5801 + Static371.anInt9384;
					anIntArray208[anInt3185++] = Static611.anInt10071 + Static371.anInt9385;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray208[--anInt3185];
					local1696 = Static371.method7991(local175);
					if (local1696 == null) {
						anIntArray208[anInt3185++] = 0;
						anIntArray208[anInt3185++] = 0;
						return;
					}
					anIntArray208[anInt3185++] = local1696.anInt2683 >> 14 & 0x3FFF;
					anIntArray208[anInt3185++] = local1696.anInt2683 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray208[--anInt3185];
					local1696 = Static371.method7991(local175);
					if (local1696 == null) {
						anIntArray208[anInt3185++] = 0;
						anIntArray208[anInt3185++] = 0;
						return;
					}
					anIntArray208[anInt3185++] = local1696.anInt2692 - local1696.anInt2682;
					anIntArray208[anInt3185++] = local1696.anInt2693 - local1696.anInt2695;
					return;
				}
				@Pc(1919) Class2_Sub13 local1919;
				if (arg0 == 5212) {
					local1919 = Static132.method2450();
					if (local1919 == null) {
						anIntArray208[anInt3185++] = -1;
						anIntArray208[anInt3185++] = -1;
						return;
					}
					anIntArray208[anInt3185++] = local1919.anInt2179;
					local776 = local1919.anInt2177 << 28 | local1919.anInt2183 + Static371.anInt9384 << 14 | local1919.anInt2178 + Static371.anInt9385;
					anIntArray208[anInt3185++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static234.method3747();
					if (local1919 == null) {
						anIntArray208[anInt3185++] = -1;
						anIntArray208[anInt3185++] = -1;
						return;
					}
					anIntArray208[anInt3185++] = local1919.anInt2179;
					local776 = local1919.anInt2177 << 28 | local1919.anInt2183 + Static371.anInt9384 << 14 | local1919.anInt2178 + Static371.anInt9385;
					anIntArray208[anInt3185++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray208[--anInt3185];
					local1696 = Static435.method6279();
					if (local1696 != null) {
						local2067 = local1696.method2287(anIntArray210, local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
						if (local2067) {
							Static77.method1654(anIntArray210[2], anIntArray210[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt3185 -= 2;
					local175 = anIntArray208[anInt3185];
					local776 = anIntArray208[anInt3185 + 1];
					@Pc(2105) Class290 local2105 = Static371.method7994(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class2_Sub7_Sub3 local2112 = (Class2_Sub7_Sub3) local2105.method6680(); local2112 != null; local2112 = (Class2_Sub7_Sub3) local2105.method6673()) {
						if (local2112.anInt2691 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray208[anInt3185++] = 1;
						return;
					}
					anIntArray208[anInt3185++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray208[--anInt3185];
					local1696 = Static371.method7991(local175);
					if (local1696 == null) {
						anIntArray208[anInt3185++] = -1;
						return;
					}
					anIntArray208[anInt3185++] = local1696.anInt2694;
					return;
				}
				if (arg0 == 5220) {
					anIntArray208[anInt3185++] = Static60.anInt1449 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray208[--anInt3185];
					Static77.method1654(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static435.method6279();
					if (local1729 != null) {
						local1496 = local1729.method2284(anIntArray210, Static611.anInt10071 + Static371.anInt9385, Static331.anInt5801 + Static371.anInt9384);
						if (local1496) {
							anIntArray208[anInt3185++] = anIntArray210[1];
							anIntArray208[anInt3185++] = anIntArray210[2];
							return;
						}
						anIntArray208[anInt3185++] = -1;
						anIntArray208[anInt3185++] = -1;
						return;
					}
					anIntArray208[anInt3185++] = -1;
					anIntArray208[anInt3185++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt3185 -= 2;
					local175 = anIntArray208[anInt3185];
					local776 = anIntArray208[anInt3185 + 1];
					Static285.method4530(local175, local776 & 0x3FFF, local776 >> 14 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray208[--anInt3185];
					local1696 = Static435.method6279();
					if (local1696 != null) {
						local2067 = local1696.method2287(anIntArray210, local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
						if (local2067) {
							anIntArray208[anInt3185++] = anIntArray210[1];
							anIntArray208[anInt3185++] = anIntArray210[2];
							return;
						}
						anIntArray208[anInt3185++] = -1;
						anIntArray208[anInt3185++] = -1;
						return;
					}
					anIntArray208[anInt3185++] = -1;
					anIntArray208[anInt3185++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray208[--anInt3185];
					local1696 = Static435.method6279();
					if (local1696 != null) {
						local2067 = local1696.method2284(anIntArray210, local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
						if (local2067) {
							anIntArray208[anInt3185++] = anIntArray210[1];
							anIntArray208[anInt3185++] = anIntArray210[2];
							return;
						}
						anIntArray208[anInt3185++] = -1;
						anIntArray208[anInt3185++] = -1;
						return;
					}
					anIntArray208[anInt3185++] = -1;
					anIntArray208[anInt3185++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static34.method761(anIntArray208[--anInt3185]);
					return;
				}
				if (arg0 == 5227) {
					anInt3185 -= 2;
					local175 = anIntArray208[anInt3185];
					local776 = anIntArray208[anInt3185 + 1];
					Static285.method4530(local175, local776 & 0x3FFF, local776 >> 14 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static399.aBoolean485 = anIntArray208[--anInt3185] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray208[anInt3185++] = Static399.aBoolean485 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray208[--anInt3185];
					Static394.method5833(local175);
					return;
				}
				@Pc(2625) Class2 local2625;
				if (arg0 == 5231) {
					anInt3185 -= 2;
					local175 = anIntArray208[anInt3185];
					local1496 = anIntArray208[anInt3185 + 1] == 1;
					if (Static145.aClass323_12 != null) {
						local2625 = Static145.aClass323_12.method7484((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8920();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class2();
							Static145.aClass323_12.method7477(local2625, (long) local175);
						}
					}
					return;
				}
				@Pc(2667) Class2 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray208[--anInt3185];
					if (Static145.aClass323_12 != null) {
						local2667 = Static145.aClass323_12.method7484((long) local175);
						anIntArray208[anInt3185++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray208[anInt3185++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt3185 -= 2;
					local175 = anIntArray208[anInt3185];
					local1496 = anIntArray208[anInt3185 + 1] == 1;
					if (Static524.aClass323_33 != null) {
						local2625 = Static524.aClass323_33.method7484((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8920();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class2();
							Static524.aClass323_33.method7477(local2625, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray208[--anInt3185];
					if (Static524.aClass323_33 != null) {
						local2667 = Static524.aClass323_33.method7484((long) local175);
						anIntArray208[anInt3185++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray208[anInt3185++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray208[anInt3185++] = Static371.aClass2_Sub7_Sub3_3 == null ? -1 : Static371.aClass2_Sub7_Sub3_3.anInt2691;
					return;
				}
				if (arg0 == 5236) {
					anInt3185 -= 2;
					local175 = anIntArray208[anInt3185];
					local776 = anIntArray208[anInt3185 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static431.method6721(local103, local175, local97);
					if (local2833 < 0) {
						anIntArray208[anInt3185++] = -1;
						return;
					}
					anIntArray208[anInt3185++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static234.method3745();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt3185 -= 2;
					local175 = anIntArray208[anInt3185];
					local776 = anIntArray208[anInt3185 + 1];
					Static63.method1431(local175, false, 3, local776);
					anIntArray208[anInt3185++] = Static18.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static18.aFrame1 != null) {
						Static63.method1431(-1, false, Static305.aClass2_Sub49_15.aClass33_Sub25_2.method7520(), -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2919) Class279[] local2919 = Static142.method2569();
					anIntArray208[anInt3185++] = local2919.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray208[--anInt3185];
					@Pc(2943) Class279[] local2943 = Static142.method2569();
					anIntArray208[anInt3185++] = local2943[local175].anInt7364;
					anIntArray208[anInt3185++] = local2943[local175].anInt7368;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static222.anInt4146;
					local776 = Static604.anInt9993;
					local97 = -1;
					@Pc(2978) Class279[] local2978 = Static142.method2569();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class279 local2985 = local2978[local2833];
						if (local2985.anInt7364 == local175 && local2985.anInt7368 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray208[anInt3185++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray208[anInt3185++] = Static402.method6006();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray208[--anInt3185];
					if (local175 >= 1 && local175 <= 2) {
						Static63.method1431(-1, false, local175, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub25_2.method7520();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray208[--anInt3185];
					if (local175 >= 1 && local175 <= 2) {
						Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub25_2, local175);
						Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub25_1, local175);
						Static531.method7366();
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt3190 -= 2;
					local83 = aStringArray19[anInt3190];
					local89 = aStringArray19[anInt3190 + 1];
					local97 = anIntArray208[--anInt3185];
					@Pc(3133) Class2_Sub31 local3133 = Static275.method4480(Static640.aClass314_2, Static54.aClass145_21);
					local3133.aClass2_Sub17_Sub1_2.method2837(Static443.method6359(local83) + Static443.method6359(local89) + 1);
					local3133.aClass2_Sub17_Sub1_2.method2856(local83);
					local3133.aClass2_Sub17_Sub1_2.method2856(local89);
					local3133.aClass2_Sub17_Sub1_2.method2837(local97);
					Static526.method7309(local3133);
					return;
				}
				if (arg0 == 5401) {
					anInt3185 -= 2;
					Static183.aShortArray54[anIntArray208[anInt3185]] = (short) Static184.method3143(anIntArray208[anInt3185 + 1]);
					Static470.aClass250_1.method5964();
					Static470.aClass250_1.method5959();
					Static137.aClass366_1.method8556();
					Static569.method7932();
					return;
				}
				if (arg0 == 5405) {
					anInt3185 -= 2;
					local175 = anIntArray208[anInt3185];
					local776 = anIntArray208[anInt3185 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static297.anIntArrayArrayArray9[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt3185 -= 7;
					local175 = anIntArray208[anInt3185];
					local776 = anIntArray208[anInt3185 + 1] << 1;
					local97 = anIntArray208[anInt3185 + 2];
					local103 = anIntArray208[anInt3185 + 3];
					local2833 = anIntArray208[anInt3185 + 4];
					@Pc(3271) int local3271 = anIntArray208[anInt3185 + 5];
					@Pc(3277) int local3277 = anIntArray208[anInt3185 + 6];
					if (local175 >= 0 && local175 < 2 && Static297.anIntArrayArrayArray9[local175] != null && local776 >= 0 && local776 < Static297.anIntArrayArrayArray9[local175].length) {
						Static297.anIntArrayArrayArray9[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3277 };
						Static297.anIntArrayArrayArray9[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3271 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static297.anIntArrayArrayArray9[anIntArray208[--anInt3185]].length >> 1;
					anIntArray208[anInt3185++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static18.aFrame1 != null) {
						Static63.method1431(-1, false, Static305.aClass2_Sub49_15.aClass33_Sub25_2.method7520(), -1);
					}
					if (Static80.aFrame2 != null) {
						Static293.method4635();
						System.exit(0);
						return;
					}
					local83 = Static460.aString63 == null ? Static499.method6054() : Static460.aString63;
					Static165.method2816(false, local83, Static265.aClass286_3, Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() == 1);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static55.aClass319_1 != null) {
						if (Static55.aClass319_1.anObject19 == null) {
							local83 = Static497.method6926(Static55.aClass319_1.anInt8560);
						} else {
							local83 = (String) Static55.aClass319_1.anObject19;
						}
					}
					aStringArray19[anInt3190++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray208[anInt3185++] = Static265.aClass286_3.aBoolean536 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static18.aFrame1 != null) {
						Static63.method1431(-1, false, Static305.aClass2_Sub49_15.aClass33_Sub25_2.method7520(), -1);
					}
					local83 = aStringArray19[--anInt3190];
					local1496 = anIntArray208[--anInt3185] == 1;
					local181 = Static499.method6054() + local83;
					Static165.method2816(local1496, local181, Static265.aClass286_3, Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() == 1);
					return;
				}
				if (arg0 == 5422) {
					anInt3190 -= 2;
					local83 = aStringArray19[anInt3190];
					local89 = aStringArray19[anInt3190 + 1];
					local97 = anIntArray208[--anInt3185];
					if (local83.length() > 0) {
						if (Static328.aStringArray35 == null) {
							Static328.aStringArray35 = new String[Static167.anIntArray223[Static51.aClass17_2.anInt420]];
						}
						Static328.aStringArray35[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static210.aStringArray51 == null) {
							Static210.aStringArray51 = new String[Static167.anIntArray223[Static51.aClass17_2.anInt420]];
						}
						Static210.aStringArray51[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray19[--anInt3190]);
					return;
				}
				if (arg0 == 5424) {
					anInt3185 -= 11;
					Static436.anInt7170 = anIntArray208[anInt3185];
					Static19.anInt418 = anIntArray208[anInt3185 + 1];
					Static34.anInt697 = anIntArray208[anInt3185 + 2];
					Static18.anInt415 = anIntArray208[anInt3185 + 3];
					Static558.anInt9219 = anIntArray208[anInt3185 + 4];
					Static551.anInt8858 = anIntArray208[anInt3185 + 5];
					Static18.anInt416 = anIntArray208[anInt3185 + 6];
					Static179.anInt3583 = anIntArray208[anInt3185 + 7];
					Static395.anInt6811 = anIntArray208[anInt3185 + 8];
					Static316.anInt5593 = anIntArray208[anInt3185 + 9];
					Static609.anInt10058 = anIntArray208[anInt3185 + 10];
					Static497.aClass238_223.method5568(Static558.anInt9219);
					Static497.aClass238_223.method5568(Static551.anInt8858);
					Static497.aClass238_223.method5568(Static18.anInt416);
					Static497.aClass238_223.method5568(Static179.anInt3583);
					Static497.aClass238_223.method5568(Static395.anInt6811);
					Static576.aClass31_37 = null;
					Static503.aClass31_34 = null;
					Static100.aClass31_2 = null;
					Static121.aClass31_6 = null;
					Static132.aClass31_7 = null;
					Static432.aClass31_25 = null;
					Static255.aClass31_12 = null;
					Static203.aClass31_16 = null;
					Static266.aBoolean372 = true;
					return;
				}
				if (arg0 == 5425) {
					Static228.method3700();
					Static266.aBoolean372 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt3185 -= 2;
					Static492.anInt7871 = anIntArray208[anInt3185];
					Static565.anInt9269 = anIntArray208[anInt3185 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt3185 -= 2;
					Static36.anInt790 = anIntArray208[anInt3185 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt3185 -= 2;
					local175 = anIntArray208[anInt3185];
					local776 = anIntArray208[anInt3185 + 1];
					anIntArray208[anInt3185++] = Static451.method6421(local776, local175) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static443.method6362(aStringArray19[--anInt3190], false, false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static655.method4698("accountcreated", Static107.anApplet1);
						return;
					} catch (@Pc(3819) Throwable local3819) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static655.method4698("accountcreatestarted", Static107.anApplet1);
						return;
					} catch (@Pc(3830) Throwable local3830) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static79.aClipboard1 != null) {
						@Pc(3842) Transferable local3842 = Static79.aClipboard1.getContents((Object) null);
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
					aStringArray19[anInt3190++] = local83;
					return;
				}
				if (arg0 == 5433) {
					Static507.anInt10229 = anIntArray208[--anInt3185];
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt3185 -= 4;
					local175 = anIntArray208[anInt3185];
					local776 = anIntArray208[anInt3185 + 1];
					local97 = anIntArray208[anInt3185 + 2];
					local103 = anIntArray208[anInt3185 + 3];
					Static411.method6039(local776 << 2, (local175 >> 14 & 0x3FFF) - Static406.anInt6899, false, local97, local103, (local175 & 0x3FFF) - Static338.anInt5885);
					return;
				}
				if (arg0 == 5501) {
					anInt3185 -= 4;
					local175 = anIntArray208[anInt3185];
					local776 = anIntArray208[anInt3185 + 1];
					local97 = anIntArray208[anInt3185 + 2];
					local103 = anIntArray208[anInt3185 + 3];
					Static343.method5198(local776 << 2, (local175 & 0x3FFF) - Static338.anInt5885, (local175 >> 14 & 0x3FFF) - Static406.anInt6899, local97, local103);
					return;
				}
				if (arg0 == 5502) {
					anInt3185 -= 6;
					local175 = anIntArray208[anInt3185];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static494.anInt7890 = local175;
					local776 = anIntArray208[anInt3185 + 1];
					if (local776 + 1 >= Static297.anIntArrayArrayArray9[Static494.anInt7890].length >> 1) {
						throw new RuntimeException();
					}
					Static352.anInt6102 = local776;
					Static241.anInt4678 = 0;
					Static213.anInt4070 = anIntArray208[anInt3185 + 2];
					Static472.anInt7602 = anIntArray208[anInt3185 + 3];
					local97 = anIntArray208[anInt3185 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static236.anInt4333 = local97;
					local103 = anIntArray208[anInt3185 + 5];
					if (local103 + 1 >= Static297.anIntArrayArrayArray9[Static236.anInt4333].length >> 1) {
						throw new RuntimeException();
					}
					Static249.anInt4785 = local103;
					Static407.anInt6909 = 3;
					Static648.anInt10476 = -1;
					Static644.anInt10415 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static83.method1789();
					return;
				}
				if (arg0 == 5504) {
					anInt3185 -= 2;
					Static182.method3120(anIntArray208[anInt3185], anIntArray208[anInt3185 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray208[anInt3185++] = (int) Static464.aFloat130 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray208[anInt3185++] = (int) Static225.aFloat85 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static638.method8759();
					return;
				}
				if (arg0 == 5508) {
					Static318.method4887();
					return;
				}
				if (arg0 == 5509) {
					Static439.method6318();
					return;
				}
				if (arg0 == 5510) {
					Static14.method366();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray208[--anInt3185];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static406.anInt6899;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static456.anInt7428) {
						local776 = Static456.anInt7428;
					}
					local97 -= Static338.anInt5885;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static5.anInt112) {
						local97 = Static5.anInt112;
					}
					Static595.anInt9886 = (local776 << 9) + 256;
					Static33.anInt661 = (local97 << 9) + 256;
					Static407.anInt6909 = 4;
					Static648.anInt10476 = -1;
					Static644.anInt10415 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static213.method3544();
					return;
				}
				if (arg0 == 5514) {
					Static529.anInt8507 = anIntArray208[--anInt3185];
					return;
				}
				if (arg0 == 5516) {
					anIntArray208[anInt3185++] = Static529.anInt8507;
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray208[--anInt3185];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static406.anInt6899;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static456.anInt7428) {
							local776 = Static456.anInt7428;
						}
						local97 -= Static338.anInt5885;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static5.anInt112) {
							local97 = Static5.anInt112;
						}
						Static644.anInt10415 = (local776 << 9) + 256;
						Static648.anInt10476 = (local97 << 9) + 256;
						return;
					}
					Static644.anInt10415 = -1;
					Static648.anInt10476 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt3190 -= 2;
					local83 = aStringArray19[anInt3190];
					local89 = aStringArray19[anInt3190 + 1];
					local97 = anIntArray208[--anInt3185];
					if (local83.length() > 320) {
						return;
					}
					if (Static454.anInt7416 != 3) {
						return;
					}
					if (Static360.anInt6253 == 0 && Static335.anInt5866 == 0) {
						Static55.aString12 = local83;
						Static272.aString43 = local89;
						Static297.anInt5356 = local97;
						Static213.method3541(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static488.method6989();
					return;
				}
				if (arg0 == 5602) {
					if (Static360.anInt6253 == 0) {
						Static541.anInt8700 = -2;
						Static321.anInt5651 = -2;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt3190--;
					if (Static454.anInt7416 != 3) {
						return;
					}
					if (Static360.anInt6253 == 0 && Static335.anInt5866 == 0) {
						Static531.method7367(aStringArray19[anInt3190]);
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt3190 -= 2;
					anInt3185 -= 2;
					if (Static454.anInt7416 != 3) {
						return;
					}
					if (Static360.anInt6253 == 0 && Static335.anInt5866 == 0) {
						Static242.method4114(aStringArray19[anInt3190], anIntArray208[anInt3185 + 1] == 1, anIntArray208[anInt3185], aStringArray19[anInt3190 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static335.anInt5866 == 0) {
						Static284.anInt5164 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray208[anInt3185++] = Static321.anInt5651;
					return;
				}
				if (arg0 == 5608) {
					anIntArray208[anInt3185++] = Static279.anInt5112;
					return;
				}
				if (arg0 == 5609) {
					anIntArray208[anInt3185++] = Static284.anInt5164;
					return;
				}
				if (arg0 == 5611) {
					anIntArray208[anInt3185++] = Static110.anInt2384;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray208[--anInt3185];
					if (Static454.anInt7416 != 7) {
						return;
					}
					if (Static360.anInt6253 == 0 && Static335.anInt5866 == 0) {
						if (Static341.aClass22_4 != null) {
							Static341.aClass22_4.method7460();
							Static341.aClass22_4 = null;
						}
						Static297.anInt5356 = local175;
						Static213.method3541(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray208[anInt3185++] = Static321.anInt5651;
					return;
				}
				if (arg0 == 5615) {
					anInt3190 -= 2;
					local83 = aStringArray19[anInt3190];
					local89 = aStringArray19[anInt3190 + 1];
					if (local83.length() > 320) {
						return;
					}
					if (Static454.anInt7416 != 3) {
						return;
					}
					if (Static360.anInt6253 == 0 && Static335.anInt5866 == 0) {
						if (Static341.aClass22_4 != null) {
							Static341.aClass22_4.method7460();
							Static341.aClass22_4 = null;
						}
						Static55.aString12 = local83;
						Static272.aString43 = local89;
						Static213.method3541(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static448.method6402(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray208[anInt3185++] = Static541.anInt8700;
					return;
				}
				if (arg0 == 5618) {
					anInt3185--;
					return;
				}
				if (arg0 == 5619) {
					anInt3185--;
					return;
				}
				if (arg0 == 5620) {
					anIntArray208[anInt3185++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt3190 -= 2;
					anInt3185 -= 2;
					return;
				}
				if (arg0 == 5622) {
					return;
				}
				if (arg0 == 5623) {
					if (Static63.aString16 != null) {
						anIntArray208[anInt3185++] = 1;
						return;
					}
					anIntArray208[anInt3185++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray208[anInt3185++] = (int) (Static272.aLong122 >> 32);
					anIntArray208[anInt3185++] = (int) (Static272.aLong122 & 0xFFFFL);
					return;
				}
				if (arg0 == 5625) {
					anIntArray208[anInt3185++] = Static183.aBoolean279 ? 1 : 0;
					return;
				}
				if (arg0 == 5626) {
					Static183.aBoolean279 = true;
					Static307.method4787();
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray208[--anInt3185];
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub1_1, local175);
					Static592.method8366();
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				@Pc(4786) boolean local4786;
				if (arg0 == 6002) {
					local4786 = anIntArray208[--anInt3185] == 1;
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub27_2, local4786 ? 1 : 0);
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub27_1, local4786 ? 1 : 0);
					Static592.method8366();
					Static196.method3388();
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6003) {
					local4786 = anIntArray208[--anInt3185] == 1;
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub29_2, local4786 ? 2 : 1);
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub29_1, local4786 ? 2 : 1);
					Static196.method3388();
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6005) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub21_1, anIntArray208[--anInt3185] == 1 ? 1 : 0);
					Static592.method8366();
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6007) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub16_1, anIntArray208[--anInt3185]);
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6008) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub24_1, anIntArray208[--anInt3185] == 1 ? 1 : 0);
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6010) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub3_1, anIntArray208[--anInt3185] == 1 ? 1 : 0);
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6011) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub18_1, anIntArray208[--anInt3185]);
					Static592.method8366();
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6012) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub20_1, anIntArray208[--anInt3185] == 1 ? 1 : 0);
					Static350.method5257();
					Static350.method5258();
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6014) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub17_1, anIntArray208[--anInt3185] == 1 ? 2 : 0);
					Static592.method8366();
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6015) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub23_1, anIntArray208[--anInt3185] == 1 ? 1 : 0);
					Static592.method8366();
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6016) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub7_2, anIntArray208[--anInt3185]);
					Static99.method1936(false, Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687());
					Static531.method7366();
					return;
				}
				if (arg0 == 6017) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub8_1, anIntArray208[--anInt3185] == 1 ? 1 : 0);
					Static256.method4272();
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6018) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub9_5, anIntArray208[--anInt3185]);
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray208[--anInt3185];
					local776 = Static305.aClass2_Sub49_15.aClass33_Sub9_3.method3103();
					if (local175 != local776) {
						if (Static19.method522(Static454.anInt7416)) {
							if (local776 == 0 && Static57.anInt1427 != -1) {
								Static555.method7833(Static609.aClass238_284, local175, Static57.anInt1427);
								Static480.method6802();
								Static609.aBoolean725 = false;
							} else if (local175 == 0) {
								Static334.method5086();
								Static609.aBoolean725 = false;
							} else {
								Static6.method98(local175);
							}
						}
						Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub9_3, local175);
						Static531.method7366();
						Static406.aBoolean496 = false;
					}
					return;
				}
				if (arg0 == 6020) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub9_1, anIntArray208[--anInt3185]);
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6021) {
					local175 = Static305.aClass2_Sub49_15.aClass33_Sub29_2.method8714();
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub29_1, anIntArray208[--anInt3185] == 1 ? 0 : local175);
					Static196.method3388();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray208[--anInt3185];
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub13_1, local175);
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6024) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub7_1, anIntArray208[--anInt3185]);
					Static531.method7366();
					return;
				}
				if (arg0 == 6025) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub4_1, anIntArray208[--anInt3185]);
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray208[--anInt3185];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static431.method6717(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub11_1, anIntArray208[--anInt3185] == 0 ? 0 : 1);
					Static531.method7366();
					return;
				}
				if (arg0 == 6029) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub16_1, anIntArray208[--anInt3185]);
					Static531.method7366();
					return;
				}
				if (arg0 == 6030) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub6_1, anIntArray208[--anInt3185] == 0 ? 0 : 1);
					Static531.method7366();
					Static592.method8366();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray208[--anInt3185];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static99.method1936(false, local175);
					return;
				}
				if (arg0 == 6032) {
					anInt3185 -= 2;
					local175 = anIntArray208[anInt3185];
					local1496 = anIntArray208[anInt3185 + 1] == 1;
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub28_2, local175);
					if (!local1496) {
						Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub5_1, 0);
					}
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6033) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub19_1, anIntArray208[--anInt3185]);
					Static531.method7366();
					return;
				}
				if (arg0 == 6034) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub2_1, anIntArray208[--anInt3185] == 1 ? 1 : 0);
					Static531.method7366();
					Static350.method5257();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6035) {
					local175 = Static305.aClass2_Sub49_15.aClass33_Sub27_2.method8670();
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub27_1, anIntArray208[--anInt3185] == 1 ? 1 : local175);
					Static592.method8366();
					Static196.method3388();
					return;
				}
				if (arg0 == 6036) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub10_1, anIntArray208[--anInt3185]);
					Static531.method7366();
					Static35.aBoolean69 = true;
					return;
				}
				if (arg0 == 6037) {
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub9_4, anIntArray208[--anInt3185]);
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray208[--anInt3185];
					local776 = Static305.aClass2_Sub49_15.aClass33_Sub9_2.method3103();
					if (local175 != local776 && Static57.anInt1427 == Static115.anInt2472) {
						if (!Static19.method522(Static454.anInt7416)) {
							if (local776 == 0) {
								Static555.method7833(Static609.aClass238_284, local175, Static57.anInt1427);
								Static480.method6802();
								Static609.aBoolean725 = false;
							} else if (local175 == 0) {
								Static334.method5086();
								Static609.aBoolean725 = false;
							} else {
								Static6.method98(local175);
							}
						}
						Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub9_2, local175);
						Static531.method7366();
						Static406.aBoolean496 = false;
					}
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray208[--anInt3185];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static305.aClass2_Sub49_15.aClass33_Sub12_1.method4636()) {
						Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub12_1, local175);
						Static531.method7366();
						Static406.aBoolean496 = false;
					}
					return;
				}
				if (arg0 == 6040) {
					local175 = anIntArray208[--anInt3185];
					if (local175 != Static305.aClass2_Sub49_15.aClass33_Sub14_1.method4886()) {
						Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub14_1, local175);
						Static531.method7366();
						Static406.aBoolean496 = false;
						Static7.method101();
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub1_1.method887();
					return;
				}
				if (arg0 == 6102) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub27_2.method8670() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub29_2.method8714() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub21_1.method5680() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub16_1.method5162();
					return;
				}
				if (arg0 == 6108) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub24_1.method7475() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub3_1.method1655() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub18_1.method5267();
					return;
				}
				if (arg0 == 6112) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub20_1.method5562() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub17_1.method5248() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub23_1.method7242() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub7_2.method2924();
					return;
				}
				if (arg0 == 6117) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub8_1.method2937() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub9_5.method3103();
					return;
				}
				if (arg0 == 6119) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub9_3.method3103();
					return;
				}
				if (arg0 == 6120) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub9_1.method3103();
					return;
				}
				if (arg0 == 6123) {
					anIntArray208[anInt3185++] = Static143.method2581();
					return;
				}
				if (arg0 == 6124) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub7_1.method2924();
					return;
				}
				if (arg0 == 6125) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub4_1.method1937();
					return;
				}
				if (arg0 == 6127) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub26_1.method8367() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub11_1.method3726() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub16_1.method5162();
					return;
				}
				if (arg0 == 6130) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub6_1.method2479() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687();
					return;
				}
				if (arg0 == 6132) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub28_2.method8687();
					return;
				}
				if (arg0 == 6133) {
					anIntArray208[anInt3185++] = Static265.aClass286_3.aBoolean536 && !Static265.aClass286_3.aBoolean534 ? 1 : 0;
					return;
				}
				if (arg0 == 6135) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub19_1.method5445();
					return;
				}
				if (arg0 == 6136) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub2_1.method1432() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray208[anInt3185++] = Static125.method2245(Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687(), 200);
					return;
				}
				if (arg0 == 6139) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub10_1.method3565();
					return;
				}
				if (arg0 == 6142) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub9_4.method3103();
					return;
				}
				if (arg0 == 6143) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub9_2.method3103();
					return;
				}
				if (arg0 == 6144) {
					anIntArray208[anInt3185++] = Static521.aBoolean609 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub12_1.method4636();
					return;
				}
				if (arg0 == 6146) {
					anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub14_1.method4886();
					return;
				}
				if (arg0 == 6147) {
					anIntArray208[anInt3185++] = Static153.aClass2_Sub42_1.anInt9302 < 512 || Static521.aBoolean609 || Static223.aBoolean283 ? 1 : 0;
					return;
				}
				if (arg0 == 6148) {
					anIntArray208[anInt3185++] = Static588.aBoolean707 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt3185 -= 2;
					Static517.aShort109 = (short) anIntArray208[anInt3185];
					if (Static517.aShort109 <= 0) {
						Static517.aShort109 = 256;
					}
					Static262.aShort71 = (short) anIntArray208[anInt3185 + 1];
					if (Static262.aShort71 <= 0) {
						Static262.aShort71 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt3185 -= 2;
					Static519.aShort110 = (short) anIntArray208[anInt3185];
					if (Static519.aShort110 <= 0) {
						Static519.aShort110 = 256;
					}
					Static101.aShort42 = (short) anIntArray208[anInt3185 + 1];
					if (Static101.aShort42 <= 0) {
						Static101.aShort42 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt3185 -= 4;
					Static197.aShort64 = (short) anIntArray208[anInt3185];
					if (Static197.aShort64 <= 0) {
						Static197.aShort64 = 1;
					}
					Static151.aShort60 = (short) anIntArray208[anInt3185 + 1];
					if (Static151.aShort60 <= 0) {
						Static151.aShort60 = 32767;
					} else if (Static151.aShort60 < Static197.aShort64) {
						Static151.aShort60 = Static197.aShort64;
					}
					Static427.aShort93 = (short) anIntArray208[anInt3185 + 2];
					if (Static427.aShort93 <= 0) {
						Static427.aShort93 = 1;
					}
					Static132.aShort55 = (short) anIntArray208[anInt3185 + 3];
					if (Static132.aShort55 <= 0) {
						Static132.aShort55 = 32767;
						return;
					}
					if (Static132.aShort55 < Static427.aShort93) {
						Static132.aShort55 = Static427.aShort93;
					}
					return;
				}
				if (arg0 == 6203) {
					Static520.method7230(Static216.aClass303_11.anInt7914, Static216.aClass303_11.anInt7971, 0, 0, false);
					anIntArray208[anInt3185++] = Static198.anInt3919;
					anIntArray208[anInt3185++] = Static378.anInt8482;
					return;
				}
				if (arg0 == 6204) {
					anIntArray208[anInt3185++] = Static519.aShort110;
					anIntArray208[anInt3185++] = Static101.aShort42;
					return;
				}
				if (arg0 == 6205) {
					anIntArray208[anInt3185++] = Static517.aShort109;
					anIntArray208[anInt3185++] = Static262.aShort71;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray208[anInt3185++] = (int) (Static48.method1203() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray208[anInt3185++] = (int) (Static48.method1203() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt3185 -= 3;
					local175 = anIntArray208[anInt3185];
					local776 = anIntArray208[anInt3185 + 1];
					local97 = anIntArray208[anInt3185 + 2];
					aCalendar2.clear();
					aCalendar2.set(11, 12);
					aCalendar2.set(local97, local776, local175);
					local103 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray208[anInt3185++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar2.clear();
					aCalendar2.setTime(new Date(Static48.method1203()));
					anIntArray208[anInt3185++] = aCalendar2.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray208[--anInt3185];
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
					anIntArray208[anInt3185++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray208[anInt3185++] = Static255.method4269() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray208[anInt3185++] = Static375.method5563() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static454.anInt7416 == 7 && Static360.anInt6253 == 0 && Static335.anInt5866 == 0) {
						if (Static495.aBoolean720) {
							anIntArray208[anInt3185++] = 0;
							return;
						}
						if (Static180.aLong94 > Static48.method1203() - 1000L) {
							anIntArray208[anInt3185++] = 1;
							return;
						}
						Static495.aBoolean720 = true;
						local52 = Static275.method4480(Static640.aClass314_2, Static378.aClass145_151);
						local52.aClass2_Sub17_Sub1_2.method2827(Static437.anInt7179);
						Static526.method7309(local52);
						anIntArray208[anInt3185++] = 0;
						return;
					}
					anIntArray208[anInt3185++] = 1;
					return;
				}
				@Pc(6862) Class232 local6862;
				@Pc(6829) Class362_Sub1 local6829;
				if (arg0 == 6501) {
					local6829 = Static513.method7454();
					if (local6829 != null) {
						anIntArray208[anInt3185++] = local6829.anInt10286;
						anIntArray208[anInt3185++] = local6829.anInt10278;
						aStringArray19[anInt3190++] = local6829.aString111;
						local6862 = local6829.method8742();
						anIntArray208[anInt3185++] = local6862.anInt6324;
						aStringArray19[anInt3190++] = local6862.aString52;
						anIntArray208[anInt3185++] = local6829.anInt10277;
						anIntArray208[anInt3185++] = local6829.anInt10285;
						aStringArray19[anInt3190++] = local6829.aString112;
						return;
					}
					anIntArray208[anInt3185++] = -1;
					anIntArray208[anInt3185++] = 0;
					aStringArray19[anInt3190++] = "";
					anIntArray208[anInt3185++] = 0;
					aStringArray19[anInt3190++] = "";
					anIntArray208[anInt3185++] = 0;
					anIntArray208[anInt3185++] = 0;
					aStringArray19[anInt3190++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6829 = Static516.method7305();
					if (local6829 != null) {
						anIntArray208[anInt3185++] = local6829.anInt10286;
						anIntArray208[anInt3185++] = local6829.anInt10278;
						aStringArray19[anInt3190++] = local6829.aString111;
						local6862 = local6829.method8742();
						anIntArray208[anInt3185++] = local6862.anInt6324;
						aStringArray19[anInt3190++] = local6862.aString52;
						anIntArray208[anInt3185++] = local6829.anInt10277;
						anIntArray208[anInt3185++] = local6829.anInt10285;
						aStringArray19[anInt3190++] = local6829.aString112;
						return;
					}
					anIntArray208[anInt3185++] = -1;
					anIntArray208[anInt3185++] = 0;
					aStringArray19[anInt3190++] = "";
					anIntArray208[anInt3185++] = 0;
					aStringArray19[anInt3190++] = "";
					anIntArray208[anInt3185++] = 0;
					anIntArray208[anInt3185++] = 0;
					aStringArray19[anInt3190++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray208[--anInt3185];
					local89 = aStringArray19[--anInt3190];
					if (Static454.anInt7416 == 7 && Static360.anInt6253 == 0 && Static335.anInt5866 == 0) {
						anIntArray208[anInt3185++] = Static426.method6218(local89, local175) ? 1 : 0;
						return;
					}
					anIntArray208[anInt3185++] = 0;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray208[--anInt3185];
					@Pc(7189) Class362_Sub1 local7189 = Static640.method8786(local175);
					if (local7189 != null) {
						anIntArray208[anInt3185++] = local7189.anInt10278;
						aStringArray19[anInt3190++] = local7189.aString111;
						@Pc(7213) Class232 local7213 = local7189.method8742();
						anIntArray208[anInt3185++] = local7213.anInt6324;
						aStringArray19[anInt3190++] = local7213.aString52;
						anIntArray208[anInt3185++] = local7189.anInt10277;
						anIntArray208[anInt3185++] = local7189.anInt10285;
						aStringArray19[anInt3190++] = local7189.aString112;
						return;
					}
					anIntArray208[anInt3185++] = -1;
					aStringArray19[anInt3190++] = "";
					anIntArray208[anInt3185++] = 0;
					aStringArray19[anInt3190++] = "";
					anIntArray208[anInt3185++] = 0;
					anIntArray208[anInt3185++] = 0;
					aStringArray19[anInt3190++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt3185 -= 4;
					local175 = anIntArray208[anInt3185];
					local1496 = anIntArray208[anInt3185 + 1] == 1;
					local97 = anIntArray208[anInt3185 + 2];
					local2107 = anIntArray208[anInt3185 + 3] == 1;
					Static604.method8494(local1496, local97, local175, local2107);
					return;
				}
				if (arg0 == 6508) {
					Static18.method521();
					return;
				}
				if (arg0 == 6509) {
					if (Static454.anInt7416 != 7) {
						return;
					}
					Static298.aBoolean398 = anIntArray208[--anInt3185] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray208[anInt3185++] = Static333.anInt5840;
					return;
				}
			} else if (arg0 >= 6700) {
				if (arg0 < 6800 && Static116.aClass168_1 == Static612.aClass168_5) {
					if (arg0 == 6700) {
						local175 = Static22.aClass323_4.method7483();
						if (Static592.anInt9857 != -1) {
							local175++;
						}
						anIntArray208[anInt3185++] = local175;
						return;
					}
					if (arg0 == 6701) {
						local175 = anIntArray208[--anInt3185];
						if (Static592.anInt9857 != -1) {
							if (local175 == 0) {
								anIntArray208[anInt3185++] = Static592.anInt9857;
								return;
							}
							local175--;
						}
						@Pc(7461) Class2_Sub28 local7461 = (Class2_Sub28) Static22.aClass323_4.method7480();
						while (local175-- > 0) {
							local7461 = (Class2_Sub28) Static22.aClass323_4.method7482();
						}
						anIntArray208[anInt3185++] = local7461.anInt5454;
						return;
					}
					if (arg0 == 6702) {
						local175 = anIntArray208[--anInt3185];
						if (Static261.aClass303ArrayArray1[local175] == null) {
							aStringArray19[anInt3190++] = "";
							return;
						}
						local89 = Static261.aClass303ArrayArray1[local175][0].aString79;
						if (local89 == null) {
							aStringArray19[anInt3190++] = "";
							return;
						}
						aStringArray19[anInt3190++] = local89.substring(0, local89.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local175 = anIntArray208[--anInt3185];
						if (Static261.aClass303ArrayArray1[local175] == null) {
							anIntArray208[anInt3185++] = 0;
							return;
						}
						anIntArray208[anInt3185++] = Static261.aClass303ArrayArray1[local175].length;
						return;
					}
					if (arg0 == 6704) {
						anInt3185 -= 2;
						local175 = anIntArray208[anInt3185];
						local776 = anIntArray208[anInt3185 + 1];
						if (Static261.aClass303ArrayArray1[local175] == null) {
							aStringArray19[anInt3190++] = "";
							return;
						}
						local181 = Static261.aClass303ArrayArray1[local175][local776].aString79;
						if (local181 == null) {
							aStringArray19[anInt3190++] = "";
							return;
						}
						aStringArray19[anInt3190++] = local181;
						return;
					}
					if (arg0 == 6705) {
						anInt3185 -= 2;
						local175 = anIntArray208[anInt3185];
						local776 = anIntArray208[anInt3185 + 1];
						if (Static261.aClass303ArrayArray1[local175] == null) {
							anIntArray208[anInt3185++] = 0;
							return;
						}
						anIntArray208[anInt3185++] = Static261.aClass303ArrayArray1[local175][local776].anInt7987;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt3185 -= 3;
						local175 = anIntArray208[anInt3185];
						local776 = anIntArray208[anInt3185 + 1];
						local97 = anIntArray208[anInt3185 + 2];
						Static195.method3375(1, "", local175 << 16 | local776, local97);
						return;
					}
					if (arg0 == 6708) {
						anInt3185 -= 3;
						local175 = anIntArray208[anInt3185];
						local776 = anIntArray208[anInt3185 + 1];
						local97 = anIntArray208[anInt3185 + 2];
						Static195.method3375(2, "", local175 << 16 | local776, local97);
						return;
					}
					if (arg0 == 6709) {
						anInt3185 -= 3;
						local175 = anIntArray208[anInt3185];
						local776 = anIntArray208[anInt3185 + 1];
						local97 = anIntArray208[anInt3185 + 2];
						Static195.method3375(3, "", local175 << 16 | local776, local97);
						return;
					}
					if (arg0 == 6710) {
						anInt3185 -= 3;
						local175 = anIntArray208[anInt3185];
						local776 = anIntArray208[anInt3185 + 1];
						local97 = anIntArray208[anInt3185 + 2];
						Static195.method3375(4, "", local175 << 16 | local776, local97);
						return;
					}
					if (arg0 == 6711) {
						anInt3185 -= 3;
						local175 = anIntArray208[anInt3185];
						local776 = anIntArray208[anInt3185 + 1];
						local97 = anIntArray208[anInt3185 + 2];
						Static195.method3375(5, "", local175 << 16 | local776, local97);
						return;
					}
					if (arg0 == 6712) {
						anInt3185 -= 3;
						local175 = anIntArray208[anInt3185];
						local776 = anIntArray208[anInt3185 + 1];
						local97 = anIntArray208[anInt3185 + 2];
						Static195.method3375(6, "", local175 << 16 | local776, local97);
						return;
					}
					if (arg0 == 6713) {
						anInt3185 -= 3;
						local175 = anIntArray208[anInt3185];
						local776 = anIntArray208[anInt3185 + 1];
						local97 = anIntArray208[anInt3185 + 2];
						Static195.method3375(7, "", local175 << 16 | local776, local97);
						return;
					}
					if (arg0 == 6714) {
						anInt3185 -= 3;
						local175 = anIntArray208[anInt3185];
						local776 = anIntArray208[anInt3185 + 1];
						local97 = anIntArray208[anInt3185 + 2];
						Static195.method3375(8, "", local175 << 16 | local776, local97);
						return;
					}
					if (arg0 == 6715) {
						anInt3185 -= 3;
						local175 = anIntArray208[anInt3185];
						local776 = anIntArray208[anInt3185 + 1];
						local97 = anIntArray208[anInt3185 + 2];
						Static195.method3375(9, "", local175 << 16 | local776, local97);
						return;
					}
					if (arg0 == 6716) {
						anInt3185 -= 3;
						local175 = anIntArray208[anInt3185];
						local776 = anIntArray208[anInt3185 + 1];
						local97 = anIntArray208[anInt3185 + 2];
						Static195.method3375(10, "", local175 << 16 | local776, local97);
						return;
					}
					if (arg0 == 6717) {
						anInt3185 -= 3;
						local175 = anIntArray208[anInt3185];
						local776 = anIntArray208[anInt3185 + 1];
						local97 = anIntArray208[anInt3185 + 2];
						@Pc(8049) Class303 local8049 = Static71.method1631(local97, local175 << 16 | local776);
						Static210.method8326();
						@Pc(8054) Class2_Sub19 local8054 = Static79.method1734(local8049);
						Static265.method4370(local8054.anInt3092, local8054.method2650(), local8049);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(8082) Class353 local8082;
					if (arg0 == 6800) {
						local175 = anIntArray208[--anInt3185];
						local8082 = Static240.aClass336_5.method7855(local175);
						if (local8082.aString100 == null) {
							aStringArray19[anInt3190++] = "";
							return;
						}
						aStringArray19[anInt3190++] = local8082.aString100;
						return;
					}
					if (arg0 == 6801) {
						local175 = anIntArray208[--anInt3185];
						local8082 = Static240.aClass336_5.method7855(local175);
						anIntArray208[anInt3185++] = local8082.anInt9818;
						return;
					}
					if (arg0 == 6802) {
						local175 = anIntArray208[--anInt3185];
						local8082 = Static240.aClass336_5.method7855(local175);
						anIntArray208[anInt3185++] = local8082.anInt9795;
						return;
					}
					if (arg0 == 6803) {
						local175 = anIntArray208[--anInt3185];
						local8082 = Static240.aClass336_5.method7855(local175);
						anIntArray208[anInt3185++] = local8082.anInt9797;
						return;
					}
					if (arg0 == 6804) {
						anInt3185 -= 2;
						local175 = anIntArray208[anInt3185];
						local776 = anIntArray208[anInt3185 + 1];
						@Pc(8204) Class328 local8204 = Static106.aClass293_1.method6807(local776);
						if (local8204.method7527()) {
							aStringArray19[anInt3190++] = Static240.aClass336_5.method7855(local175).method8342(local776, local8204.aString87);
							return;
						}
						anIntArray208[anInt3185++] = Static240.aClass336_5.method7855(local175).method8344(local8204.anInt8782, local776);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray208[anInt3185++] = Static279.aBoolean378 && !Static318.aBoolean410 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray208[anInt3185++] = Static632.anInt8265;
						return;
					}
					if (arg0 == 6902) {
						anIntArray208[anInt3185++] = Static163.anInt3309;
						return;
					}
					if (arg0 == 6903) {
						anIntArray208[anInt3185++] = Static213.anInt4074;
						return;
					}
					if (arg0 == 6904) {
						anIntArray208[anInt3185++] = Static557.anInt9216;
						return;
					}
					if (arg0 == 6905) {
						local83 = "";
						if (Static55.aClass319_1 != null) {
							if (Static55.aClass319_1.anObject19 == null) {
								local83 = Static497.method6926(Static55.aClass319_1.anInt8560);
							} else {
								local83 = (String) Static55.aClass319_1.anObject19;
							}
						}
						aStringArray19[anInt3190++] = local83;
						return;
					}
					if (arg0 == 6906) {
						anIntArray208[anInt3185++] = Static583.anInt9502;
						return;
					}
					if (arg0 == 6907) {
						anIntArray208[anInt3185++] = Static429.anInt10489;
						return;
					}
					if (arg0 == 6908) {
						anIntArray208[anInt3185++] = Static602.anInt9965;
						return;
					}
					if (arg0 == 6909) {
						anIntArray208[anInt3185++] = Static187.aBoolean282 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray208[anInt3185++] = Static378.anInt8485;
						return;
					}
					if (arg0 == 6911) {
						anIntArray208[anInt3185++] = Static598.anInt4419;
						return;
					}
					if (arg0 == 6912) {
						anIntArray208[anInt3185++] = Static326.anInt5714;
						return;
					}
				} else if (arg0 < 7100) {
					if (arg0 == 7000) {
						local175 = Static435.method6281();
						anIntArray208[anInt3185++] = Static358.anInt6214 = Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687();
						anIntArray208[anInt3185++] = local175;
						Static592.method8366();
						Static531.method7366();
						Static406.aBoolean496 = false;
						return;
					}
					if (arg0 == 7001) {
						Static140.method2560();
						Static592.method8366();
						Static531.method7366();
						Static406.aBoolean496 = false;
						return;
					}
					if (arg0 == 7002) {
						Static46.method4896();
						Static592.method8366();
						Static531.method7366();
						Static406.aBoolean496 = false;
						return;
					}
					if (arg0 == 7003) {
						Static74.method7156();
						Static592.method8366();
						Static531.method7366();
						Static406.aBoolean496 = false;
						return;
					}
					if (arg0 == 7004) {
						Static519.method7228();
						Static592.method8366();
						Static531.method7366();
						Static406.aBoolean496 = false;
						return;
					}
					if (arg0 == 7005) {
						Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub5_1, 0);
						Static531.method7366();
						Static406.aBoolean496 = false;
						return;
					}
					if (arg0 == 7006) {
						if (Static358.anInt6214 == 2) {
							Static22.aBoolean48 = true;
							return;
						}
						if (Static358.anInt6214 == 1) {
							Static275.aBoolean377 = true;
							return;
						}
						if (Static358.anInt6214 == 3) {
							Static353.aBoolean442 = true;
						}
						return;
					}
					if (arg0 == 7007) {
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub5_1.method1983();
						return;
					}
				} else if (arg0 < 7200) {
					if (arg0 == 7100) {
						anInt3185 -= 2;
						local175 = anIntArray208[anInt3185];
						local776 = anIntArray208[anInt3185 + 1];
						if (local175 != -1) {
							if (local776 > 255) {
								local776 = 255;
							} else if (local776 < 0) {
								local776 = 0;
							}
							Static188.method3205(false, local776, local175);
						}
						return;
					}
					if (arg0 == 7101) {
						local175 = anIntArray208[--anInt3185];
						if (local175 != -1) {
							Static141.method2564(local175);
						}
						return;
					}
					if (arg0 == 7102) {
						local175 = anIntArray208[--anInt3185];
						if (local175 != -1) {
							Static414.method6057(local175);
						}
						return;
					}
					if (arg0 == 7103) {
						anIntArray208[anInt3185++] = Static642.method8834("jagtheora") ? 1 : 0;
						return;
					}
				} else if (arg0 < 7300) {
					if (arg0 == 7201) {
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub21_1.method5677() ? 1 : 0;
						return;
					}
					if (arg0 == 7202) {
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub3_1.method1656() ? 1 : 0;
						return;
					}
					if (arg0 == 7203) {
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub18_1.method5268() ? 1 : 0;
						return;
					}
					if (arg0 == 7204) {
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub17_1.method5249() ? 1 : 0;
						return;
					}
					if (arg0 == 7205) {
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub7_1.method2926() && Static141.aClass13_27.method8147() ? 1 : 0;
						return;
					}
					if (arg0 == 7206) {
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub13_1.method4665() ? 1 : 0;
						return;
					}
					if (arg0 == 7207) {
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub4_1.method1933() ? 1 : 0;
						return;
					}
					if (arg0 == 7208) {
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub26_1.method8364() && Static141.aClass13_27.method8128() ? 1 : 0;
						return;
					}
					if (arg0 == 7209) {
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub6_1.method2478() ? 1 : 0;
						return;
					}
					if (arg0 == 7210) {
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub2_1.method1433() ? 1 : 0;
						return;
					}
					if (arg0 == 7211) {
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub10_1.method3563() ? 1 : 0;
						return;
					}
					if (arg0 == 7212) {
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub23_1.method7240() ? 1 : 0;
						return;
					}
					if (arg0 == 7213) {
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub14_1.method4888() ? 1 : 0;
						return;
					}
					if (arg0 == 7214) {
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub28_2.method8684() ? 1 : 0;
						return;
					}
				} else if (arg0 < 7400) {
					if (arg0 == 7301) {
						local175 = anIntArray208[--anInt3185];
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub21_1.method8708(local175);
						return;
					}
					if (arg0 == 7302) {
						local175 = anIntArray208[--anInt3185];
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub3_1.method8708(local175);
						return;
					}
					if (arg0 == 7303) {
						local175 = anIntArray208[--anInt3185];
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub18_1.method8708(local175);
						return;
					}
					if (arg0 == 7304) {
						local175 = anIntArray208[--anInt3185];
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub17_1.method8708(local175);
						return;
					}
					if (arg0 == 7305) {
						local175 = anIntArray208[--anInt3185];
						if (!Static141.aClass13_27.method8147()) {
							anIntArray208[anInt3185++] = 3;
							return;
						}
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub7_1.method8708(local175);
						return;
					}
					if (arg0 == 7306) {
						local175 = anIntArray208[--anInt3185];
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub13_1.method8708(local175);
						return;
					}
					if (arg0 == 7307) {
						local175 = anIntArray208[--anInt3185];
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub4_1.method8708(local175);
						return;
					}
					if (arg0 == 7308) {
						local175 = anIntArray208[--anInt3185];
						if (!Static141.aClass13_27.method8128()) {
							anIntArray208[anInt3185++] = 3;
							return;
						}
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub26_1.method8708(local175);
						return;
					}
					if (arg0 == 7309) {
						local175 = anIntArray208[--anInt3185];
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub6_1.method8708(local175);
						return;
					}
					if (arg0 == 7310) {
						local175 = anIntArray208[--anInt3185];
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub2_1.method8708(local175);
						return;
					}
					if (arg0 == 7311) {
						local175 = anIntArray208[--anInt3185];
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub10_1.method8708(local175);
						return;
					}
					if (arg0 == 7312) {
						local175 = anIntArray208[--anInt3185];
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub23_1.method8708(local175);
						return;
					}
					if (arg0 == 7313) {
						local175 = anIntArray208[--anInt3185];
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub14_1.method8708(local175);
						return;
					}
					if (arg0 == 7314) {
						local175 = anIntArray208[--anInt3185];
						anIntArray208[anInt3185++] = Static305.aClass2_Sub49_15.aClass33_Sub28_2.method8708(local175);
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(IZ)V")
	private static void method2727(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class303 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class303 local35;
		@Pc(210) Class303 local210;
		@Pc(13) int local13;
		@Pc(158) Class303 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt3185 -= 3;
				local13 = anIntArray208[anInt3185];
				local19 = anIntArray208[anInt3185 + 1];
				local25 = anIntArray208[anInt3185 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static43.method1101(local13);
				if (local35.aClass303Array2 == null) {
					local35.aClass303Array2 = new Class303[local25 + 1];
				}
				if (local35.aClass303Array2.length <= local25) {
					@Pc(54) Class303[] local54 = new Class303[local25 + 1];
					for (local56 = 0; local56 < local35.aClass303Array2.length; local56++) {
						local54[local56] = local35.aClass303Array2[local56];
					}
					local35.aClass303Array2 = local54;
				}
				if (local25 > 0 && local35.aClass303Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class303 local99 = new Class303();
				local99.anInt7935 = local19;
				local99.anInt7985 = local99.anInt7962 = local35.anInt7962;
				local99.anInt7983 = local25;
				local35.aClass303Array2[local25] = local99;
				if (arg1) {
					aClass303_7 = local99;
				} else {
					aClass303_8 = local99;
				}
				Static514.method7103(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass303_7 : aClass303_8;
				if (local137.anInt7983 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static43.method1101(local137.anInt7962);
				local158.aClass303Array2[local137.anInt7983] = null;
				Static514.method7103(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static43.method1101(anIntArray208[--anInt3185]);
				local137.aClass303Array2 = null;
				Static514.method7103(local137);
				return;
			}
			if (arg0 == 200) {
				anInt3185 -= 2;
				local13 = anIntArray208[anInt3185];
				local19 = anIntArray208[anInt3185 + 1];
				local210 = Static71.method1631(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray208[anInt3185++] = 1;
					if (arg1) {
						aClass303_7 = local210;
						return;
					}
					aClass303_8 = local210;
					return;
				}
				anIntArray208[anInt3185++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray208[--anInt3185];
				local158 = Static43.method1101(local13);
				if (local158 != null) {
					anIntArray208[anInt3185++] = 1;
					if (arg1) {
						aClass303_7 = local158;
						return;
					}
					aClass303_8 = local158;
					return;
				}
				anIntArray208[anInt3185++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray208[--anInt3185];
				method2733(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray208[--anInt3185];
				method2730(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt3185 -= 2;
					local13 = anIntArray208[anInt3185];
					local19 = anIntArray208[anInt3185 + 1];
					if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static492.anIntArray564.length; local25++) {
						if (Static492.anIntArray564[local25] == local13) {
							Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1.method6513(local19, local25, Static629.aClass177_2);
							return;
						}
					}
					for (local357 = 0; local357 < Static640.anIntArray731.length; local357++) {
						if (Static640.anIntArray731[local357] == local13) {
							Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1.method6513(local19, local357, Static629.aClass177_2);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt3185 -= 2;
					local13 = anIntArray208[anInt3185];
					local19 = anIntArray208[anInt3185 + 1];
					if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1 == null) {
						return;
					}
					Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1.method6515(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray208[--anInt3185] != 0;
					if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1 == null) {
						return;
					}
					Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1.method6516(local420);
					return;
				}
				if (arg0 == 411) {
					anInt3185 -= 2;
					local13 = anIntArray208[anInt3185];
					local19 = anIntArray208[anInt3185 + 1];
					if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1 == null) {
						return;
					}
					Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1.method6514(local13, local19, Static470.aClass250_1);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static43.method1101(anIntArray208[--anInt3185]);
					} else {
						local137 = arg1 ? aClass303_7 : aClass303_8;
					}
					if (arg0 == 1100) {
						anInt3185 -= 2;
						local137.anInt7920 = anIntArray208[anInt3185];
						if (local137.anInt7920 > local137.anInt7943 - local137.anInt7914) {
							local137.anInt7920 = local137.anInt7943 - local137.anInt7914;
						}
						if (local137.anInt7920 < 0) {
							local137.anInt7920 = 0;
						}
						local137.anInt7982 = anIntArray208[anInt3185 + 1];
						if (local137.anInt7982 > local137.anInt7936 - local137.anInt7971) {
							local137.anInt7982 = local137.anInt7936 - local137.anInt7971;
						}
						if (local137.anInt7982 < 0) {
							local137.anInt7982 = 0;
						}
						Static514.method7103(local137);
						if (local137.anInt7983 == -1) {
							Static16.method416(local137.anInt7962);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt7947 = anIntArray208[--anInt3185];
						Static514.method7103(local137);
						if (local137.anInt7983 == -1) {
							Static571.method7944(local137.anInt7962);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean571 = anIntArray208[--anInt3185] == 1;
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt7980 = anIntArray208[--anInt3185];
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt7974 = anIntArray208[--anInt3185];
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray208[--anInt3185];
						if (local137.anInt7949 != local19) {
							local137.anInt7949 = local19;
							Static514.method7103(local137);
						}
						if (local137.anInt7983 == -1) {
							Static225.method3621(local137.anInt7962);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt7929 = anIntArray208[--anInt3185];
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean569 = anIntArray208[--anInt3185] == 1;
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt7956 = 1;
						local137.anInt7992 = anIntArray208[--anInt3185];
						Static514.method7103(local137);
						if (local137.anInt7983 == -1) {
							Static466.method6607(local137.anInt7962);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt3185 -= 6;
						local137.anInt7975 = anIntArray208[anInt3185];
						local137.anInt7939 = anIntArray208[anInt3185 + 1];
						local137.anInt7997 = anIntArray208[anInt3185 + 2];
						local137.anInt7967 = anIntArray208[anInt3185 + 3];
						local137.anInt7937 = anIntArray208[anInt3185 + 4];
						local137.anInt7960 = anIntArray208[anInt3185 + 5];
						Static514.method7103(local137);
						if (local137.anInt7983 == -1) {
							Static80.method1744(local137.anInt7962);
							Static162.method2780(local137.anInt7962);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray208[--anInt3185];
						if (local137.anInt7931 != local19) {
							local137.anInt7931 = local19;
							local137.anInt8005 = 0;
							local137.anInt7913 = 1;
							local137.anInt7990 = 0;
							@Pc(1110) Class228 local1110 = local137.anInt7931 == -1 ? null : Static479.aClass308_2.method7075(local137.anInt7931);
							if (local1110 != null) {
								Static70.method1614(local1110, local137.anInt8005);
							}
							Static514.method7103(local137);
						}
						if (local137.anInt7983 == -1) {
							Static536.method7431(local137.anInt7962);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean575 = anIntArray208[--anInt3185] == 1;
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray19[--anInt3190];
						if (!local1161.equals(local137.aString80)) {
							local137.aString80 = local1161;
							Static514.method7103(local137);
						}
						if (local137.anInt7983 == -1) {
							Static332.method5063(local137.anInt7962);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt7918 = anIntArray208[--anInt3185];
						Static514.method7103(local137);
						if (local137.anInt7983 == -1) {
							Static147.method2610(local137.anInt7962);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt3185 -= 3;
						local137.anInt7978 = anIntArray208[anInt3185];
						local137.anInt7991 = anIntArray208[anInt3185 + 1];
						local137.anInt7938 = anIntArray208[anInt3185 + 2];
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean572 = anIntArray208[--anInt3185] == 1;
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt7932 = anIntArray208[--anInt3185];
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt8000 = anIntArray208[--anInt3185];
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean576 = anIntArray208[--anInt3185] == 1;
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean566 = anIntArray208[--anInt3185] == 1;
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt3185 -= 2;
						local137.anInt7943 = anIntArray208[anInt3185];
						local137.anInt7936 = anIntArray208[anInt3185 + 1];
						Static514.method7103(local137);
						if (local137.anInt7935 == 0) {
							Static103.method1958(local137, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean568 = anIntArray208[--anInt3185] == 1;
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt7960 = anIntArray208[--anInt3185];
						Static514.method7103(local137);
						if (local137.anInt7983 == -1) {
							Static80.method1744(local137.anInt7962);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray208[--anInt3185];
						local137.aBoolean565 = local19 == 1;
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt3185 -= 2;
						local137.anInt7998 = anIntArray208[anInt3185];
						local137.anInt7928 = anIntArray208[anInt3185 + 1];
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt7989 = anIntArray208[--anInt3185];
						Static514.method7103(local137);
						return;
					}
					@Pc(1489) Class328 local1489;
					if (arg0 == 1127) {
						anInt3185 -= 2;
						local19 = anIntArray208[anInt3185];
						local25 = anIntArray208[anInt3185 + 1];
						local1489 = Static106.aClass293_1.method6807(local19);
						if (local25 != local1489.anInt8782) {
							local137.method6936(local25, local19);
							return;
						}
						local137.method6947(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray208[--anInt3185];
						local1523 = aStringArray19[--anInt3190];
						local1489 = Static106.aClass293_1.method6807(local19);
						if (!local1489.aString87.equals(local1523)) {
							local137.method6938(local1523, local19);
							return;
						}
						local137.method6947(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray208[--anInt3185];
						if (local137.anInt7935 != 5 && arg0 == 1129 || local137.anInt7935 != 4 && arg0 == 1130) {
							return;
						}
						if (local137.anInt7946 != local19) {
							local137.anInt7946 = local19;
							Static514.method7103(local137);
						}
						if (local137.anInt7983 == -1) {
							Static11.method142(local137.anInt7962);
						}
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static43.method1101(anIntArray208[--anInt3185]);
					} else {
						local137 = arg1 ? aClass303_7 : aClass303_8;
					}
					Static514.method7103(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt3185 -= 2;
						local19 = anIntArray208[anInt3185];
						local25 = anIntArray208[anInt3185 + 1];
						if (local137.anInt7983 == -1) {
							Static558.method7851(local137.anInt7962);
							Static80.method1744(local137.anInt7962);
							Static162.method2780(local137.anInt7962);
						}
						if (local19 == -1) {
							local137.anInt7956 = 1;
							local137.anInt7992 = -1;
							local137.anInt7964 = -1;
							return;
						}
						local137.anInt7964 = local19;
						local137.anInt7927 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean573 = true;
						} else {
							local137.aBoolean573 = false;
						}
						@Pc(1713) Class327 local1713 = Static470.aClass250_1.method5960(local19);
						local137.anInt7997 = local1713.anInt8723;
						local137.anInt7967 = local1713.anInt8765;
						local137.anInt7937 = local1713.anInt8739;
						local137.anInt7975 = local1713.anInt8724;
						local137.anInt7939 = local1713.lb;
						local137.anInt7960 = local1713.anInt8720;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt7922 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt7922 = 1;
						} else {
							local137.anInt7922 = 2;
						}
						if (local137.anInt7951 > 0) {
							local137.anInt7960 = local137.anInt7960 * 32 / local137.anInt7951;
							return;
						}
						if (local137.anInt7940 > 0) {
							local137.anInt7960 = local137.anInt7960 * 32 / local137.anInt7940;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt7956 = 2;
						local137.anInt7992 = anIntArray208[--anInt3185];
						if (local137.anInt7983 == -1) {
							Static466.method6607(local137.anInt7962);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt7956 = 3;
						local137.anInt7992 = -1;
						if (local137.anInt7983 == -1) {
							Static466.method6607(local137.anInt7962);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt7956 = 6;
						local137.anInt7992 = anIntArray208[--anInt3185];
						if (local137.anInt7983 == -1) {
							Static466.method6607(local137.anInt7962);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt7956 = 5;
						local137.anInt7992 = anIntArray208[--anInt3185];
						if (local137.anInt7983 == -1) {
							Static466.method6607(local137.anInt7962);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt3185 -= 4;
						local137.anInt7993 = anIntArray208[anInt3185];
						local137.anInt7996 = anIntArray208[anInt3185 + 1];
						local137.anInt7984 = anIntArray208[anInt3185 + 2];
						local137.anInt7917 = anIntArray208[anInt3185 + 3];
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt3185 -= 2;
						local137.anInt7963 = anIntArray208[anInt3185];
						local137.anInt7961 = anIntArray208[anInt3185 + 1];
						Static514.method7103(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt3185 -= 4;
						local137.anInt7992 = anIntArray208[anInt3185];
						local137.anInt7945 = anIntArray208[anInt3185 + 1];
						if (anIntArray208[anInt3185 + 2] == 1) {
							local137.anInt7956 = 9;
						} else {
							local137.anInt7956 = 8;
						}
						if (anIntArray208[anInt3185 + 3] == 1) {
							local137.aBoolean573 = true;
						} else {
							local137.aBoolean573 = false;
						}
						if (local137.anInt7983 == -1) {
							Static466.method6607(local137.anInt7962);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt7956 = 5;
						local137.anInt7992 = Static608.anInt10056;
						local137.anInt7945 = 0;
						if (local137.anInt7983 == -1) {
							Static466.method6607(local137.anInt7962);
						}
						return;
					}
				} else {
					@Pc(2373) int local2373;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static43.method1101(anIntArray208[--anInt3185]);
						} else {
							local137 = arg1 ? aClass303_7 : aClass303_8;
						}
						if (arg0 == 1300) {
							local19 = anIntArray208[--anInt3185] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method6944(local19, aStringArray19[--anInt3190]);
								return;
							}
							anInt3190--;
							return;
						}
						if (arg0 == 1301) {
							anInt3185 -= 2;
							local19 = anIntArray208[anInt3185];
							local25 = anIntArray208[anInt3185 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass303_19 = null;
								return;
							}
							local137.aClass303_19 = Static71.method1631(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray208[--anInt3185];
							if (local19 != Static45.anInt1208 && local19 != Static551.anInt8857 && local19 != Static78.anInt1985) {
								return;
							}
							local137.anInt7981 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt7912 = anIntArray208[--anInt3185];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt7941 = anIntArray208[--anInt3185];
							return;
						}
						if (arg0 == 1305) {
							local137.aString78 = aStringArray19[--anInt3190];
							return;
						}
						if (arg0 == 1306) {
							local137.aString77 = aStringArray19[--anInt3190];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray43 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt7976 = anIntArray208[--anInt3185];
							local137.anInt7952 = anIntArray208[--anInt3185];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray208[--anInt3185];
							local25 = anIntArray208[--anInt3185];
							if (local25 >= 1 && local25 <= 10) {
								local137.method6935(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString76 = aStringArray19[--anInt3190];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt7994 = anIntArray208[--anInt3185];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt3185 -= 3;
								local19 = anIntArray208[anInt3185] - 1;
								local25 = anIntArray208[anInt3185 + 1];
								local357 = anIntArray208[anInt3185 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt3185 -= 2;
								local19 = 10;
								local25 = anIntArray208[anInt3185];
								local357 = anIntArray208[anInt3185 + 1];
							}
							if (local137.aByteArray83 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray83 = new byte[11];
								local137.aByteArray84 = new byte[11];
								local137.anIntArray575 = new int[11];
							}
							local137.aByteArray83[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean578 = false;
								for (local2373 = 0; local2373 < local137.aByteArray83.length; local2373++) {
									if (local137.aByteArray83[local2373] != 0) {
										local137.aBoolean578 = true;
										break;
									}
								}
							} else {
								local137.aBoolean578 = true;
							}
							local137.aByteArray84[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt7999 = anIntArray208[--anInt3185];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static43.method1101(anIntArray208[--anInt3185]);
						} else {
							local137 = arg1 ? aClass303_7 : aClass303_8;
						}
						if (arg0 == 1499) {
							local137.method6934();
							return;
						}
						local1161 = aStringArray19[--anInt3190];
						@Pc(2459) int[] local2459 = null;
						if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
							local357 = anIntArray208[--anInt3185];
							if (local357 > 0) {
								local2459 = new int[local357];
								while (local357-- > 0) {
									local2459[local357] = anIntArray208[--anInt3185];
								}
							}
							local1161 = local1161.substring(0, local1161.length() - 1);
						}
						@Pc(2511) Object[] local2511 = new Object[local1161.length() + 1];
						for (local2373 = local2511.length - 1; local2373 >= 1; local2373--) {
							if (local1161.charAt(local2373 - 1) == 's') {
								local2511[local2373] = aStringArray19[--anInt3190];
							} else {
								local2511[local2373] = Integer.valueOf(anIntArray208[--anInt3185]);
							}
						}
						local56 = anIntArray208[--anInt3185];
						if (local56 == -1) {
							local2511 = null;
						} else {
							local2511[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray26 = local2511;
						} else if (arg0 == 1401) {
							local137.anObjectArray27 = local2511;
						} else if (arg0 == 1402) {
							local137.anObjectArray21 = local2511;
						} else if (arg0 == 1403) {
							local137.anObjectArray10 = local2511;
						} else if (arg0 == 1404) {
							local137.anObjectArray33 = local2511;
						} else if (arg0 == 1405) {
							local137.anObjectArray3 = local2511;
						} else if (arg0 == 1406) {
							local137.anObjectArray11 = local2511;
						} else if (arg0 == 1407) {
							local137.anObjectArray29 = local2511;
							local137.anIntArray578 = local2459;
						} else if (arg0 == 1408) {
							local137.anObjectArray22 = local2511;
						} else if (arg0 == 1409) {
							local137.anObjectArray15 = local2511;
						} else if (arg0 == 1410) {
							local137.anObjectArray17 = local2511;
						} else if (arg0 == 1411) {
							local137.anObjectArray25 = local2511;
						} else if (arg0 == 1412) {
							local137.anObjectArray8 = local2511;
						} else if (arg0 == 1414) {
							local137.anObjectArray9 = local2511;
							local137.anIntArray582 = local2459;
						} else if (arg0 == 1415) {
							local137.anObjectArray31 = local2511;
							local137.anIntArray576 = local2459;
						} else if (arg0 == 1416) {
							local137.anObjectArray24 = local2511;
						} else if (arg0 == 1417) {
							local137.anObjectArray5 = local2511;
						} else if (arg0 == 1418) {
							local137.anObjectArray16 = local2511;
						} else if (arg0 == 1419) {
							local137.anObjectArray6 = local2511;
						} else if (arg0 == 1420) {
							local137.anObjectArray12 = local2511;
						} else if (arg0 == 1421) {
							local137.anObjectArray19 = local2511;
						} else if (arg0 == 1422) {
							local137.anObjectArray30 = local2511;
						} else if (arg0 == 1423) {
							local137.anObjectArray4 = local2511;
						} else if (arg0 == 1424) {
							local137.anObjectArray18 = local2511;
						} else if (arg0 == 1425) {
							local137.anObjectArray7 = local2511;
						} else if (arg0 == 1426) {
							local137.anObjectArray14 = local2511;
						} else if (arg0 == 1427) {
							local137.anObjectArray32 = local2511;
						} else if (arg0 == 1428) {
							local137.anObjectArray23 = local2511;
							local137.anIntArray579 = local2459;
						} else if (arg0 == 1429) {
							local137.anObjectArray20 = local2511;
							local137.anIntArray580 = local2459;
						} else if (arg0 == 1430) {
							local137.anObjectArray28 = local2511;
						}
						local137.aBoolean579 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass303_7 : aClass303_8;
						if (arg0 == 1500) {
							anIntArray208[anInt3185++] = local137.anInt7923;
							return;
						}
						if (arg0 == 1501) {
							anIntArray208[anInt3185++] = local137.anInt7955;
							return;
						}
						if (arg0 == 1502) {
							anIntArray208[anInt3185++] = local137.anInt7914;
							return;
						}
						if (arg0 == 1503) {
							anIntArray208[anInt3185++] = local137.anInt7971;
							return;
						}
						if (arg0 == 1504) {
							anIntArray208[anInt3185++] = local137.aBoolean567 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray208[anInt3185++] = local137.anInt7985;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static436.method6287(local137);
							anIntArray208[anInt3185++] = local158 == null ? -1 : local158.anInt7962;
							return;
						}
					} else {
						@Pc(3107) Class328 local3107;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass303_7 : aClass303_8;
							if (arg0 == 1600) {
								anIntArray208[anInt3185++] = local137.anInt7920;
								return;
							}
							if (arg0 == 1601) {
								anIntArray208[anInt3185++] = local137.anInt7982;
								return;
							}
							if (arg0 == 1602) {
								aStringArray19[anInt3190++] = local137.aString80;
								return;
							}
							if (arg0 == 1603) {
								anIntArray208[anInt3185++] = local137.anInt7943;
								return;
							}
							if (arg0 == 1604) {
								anIntArray208[anInt3185++] = local137.anInt7936;
								return;
							}
							if (arg0 == 1605) {
								anIntArray208[anInt3185++] = local137.anInt7960;
								return;
							}
							if (arg0 == 1606) {
								anIntArray208[anInt3185++] = local137.anInt7997;
								return;
							}
							if (arg0 == 1607) {
								anIntArray208[anInt3185++] = local137.anInt7937;
								return;
							}
							if (arg0 == 1608) {
								anIntArray208[anInt3185++] = local137.anInt7967;
								return;
							}
							if (arg0 == 1609) {
								anIntArray208[anInt3185++] = local137.anInt7980;
								return;
							}
							if (arg0 == 1610) {
								anIntArray208[anInt3185++] = local137.anInt7975;
								return;
							}
							if (arg0 == 1611) {
								anIntArray208[anInt3185++] = local137.anInt7939;
								return;
							}
							if (arg0 == 1612) {
								anIntArray208[anInt3185++] = local137.anInt7949;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray208[--anInt3185];
								local3107 = Static106.aClass293_1.method6807(local19);
								if (local3107.method7527()) {
									aStringArray19[anInt3190++] = local137.method6951(local3107.aString87, local19);
									return;
								}
								anIntArray208[anInt3185++] = local137.method6942(local3107.anInt8782, local19);
								return;
							}
							if (arg0 == 1614) {
								anIntArray208[anInt3185++] = local137.anInt7929;
								return;
							}
							if (arg0 == 2614) {
								anIntArray208[anInt3185++] = local137.anInt7956 == 1 ? local137.anInt7992 : -1;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass303_7 : aClass303_8;
							if (arg0 == 1700) {
								anIntArray208[anInt3185++] = local137.anInt7964;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt7964 != -1) {
									anIntArray208[anInt3185++] = local137.anInt7927;
									return;
								}
								anIntArray208[anInt3185++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray208[anInt3185++] = local137.anInt7983;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass303_7 : aClass303_8;
							if (arg0 == 1800) {
								anIntArray208[anInt3185++] = Static79.method1734(local137).method2650();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray208[--anInt3185];
								local19--;
								if (local137.aStringArray43 != null && local19 < local137.aStringArray43.length && local137.aStringArray43[local19] != null) {
									aStringArray19[anInt3190++] = local137.aStringArray43[local19];
									return;
								}
								aStringArray19[anInt3190++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString78 == null) {
									aStringArray19[anInt3190++] = "";
									return;
								}
								aStringArray19[anInt3190++] = local137.aString78;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static43.method1101(anIntArray208[--anInt3185]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass303_7 : aClass303_8;
							}
							if (anInt3197 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray32 == null) {
									return;
								}
								@Pc(3376) Class2_Sub18 local3376 = new Class2_Sub18();
								local3376.aClass303_4 = local137;
								local3376.anObjectArray1 = local137.anObjectArray32;
								local3376.anInt3018 = anInt3197 + 1;
								Static102.aClass114_11.method2771(local3376);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static43.method1101(anIntArray208[--anInt3185]);
							if (arg0 == 2500) {
								anIntArray208[anInt3185++] = local137.anInt7923;
								return;
							}
							if (arg0 == 2501) {
								anIntArray208[anInt3185++] = local137.anInt7955;
								return;
							}
							if (arg0 == 2502) {
								anIntArray208[anInt3185++] = local137.anInt7914;
								return;
							}
							if (arg0 == 2503) {
								anIntArray208[anInt3185++] = local137.anInt7971;
								return;
							}
							if (arg0 == 2504) {
								anIntArray208[anInt3185++] = local137.aBoolean567 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray208[anInt3185++] = local137.anInt7985;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static436.method6287(local137);
								anIntArray208[anInt3185++] = local158 == null ? -1 : local158.anInt7962;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static43.method1101(anIntArray208[--anInt3185]);
							if (arg0 == 2600) {
								anIntArray208[anInt3185++] = local137.anInt7920;
								return;
							}
							if (arg0 == 2601) {
								anIntArray208[anInt3185++] = local137.anInt7982;
								return;
							}
							if (arg0 == 2602) {
								aStringArray19[anInt3190++] = local137.aString80;
								return;
							}
							if (arg0 == 2603) {
								anIntArray208[anInt3185++] = local137.anInt7943;
								return;
							}
							if (arg0 == 2604) {
								anIntArray208[anInt3185++] = local137.anInt7936;
								return;
							}
							if (arg0 == 2605) {
								anIntArray208[anInt3185++] = local137.anInt7960;
								return;
							}
							if (arg0 == 2606) {
								anIntArray208[anInt3185++] = local137.anInt7997;
								return;
							}
							if (arg0 == 2607) {
								anIntArray208[anInt3185++] = local137.anInt7937;
								return;
							}
							if (arg0 == 2608) {
								anIntArray208[anInt3185++] = local137.anInt7967;
								return;
							}
							if (arg0 == 2609) {
								anIntArray208[anInt3185++] = local137.anInt7980;
								return;
							}
							if (arg0 == 2610) {
								anIntArray208[anInt3185++] = local137.anInt7975;
								return;
							}
							if (arg0 == 2611) {
								anIntArray208[anInt3185++] = local137.anInt7939;
								return;
							}
							if (arg0 == 2612) {
								anIntArray208[anInt3185++] = local137.anInt7949;
								return;
							}
							if (arg0 == 2613) {
								anIntArray208[anInt3185++] = local137.anInt7929;
								return;
							}
							if (arg0 == 2614) {
								anIntArray208[anInt3185++] = local137.anInt7956 == 1 ? local137.anInt7992 : -1;
								return;
							}
						} else {
							@Pc(3905) Class2_Sub28 local3905;
							@Pc(3803) Class2_Sub28 local3803;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static43.method1101(anIntArray208[--anInt3185]);
									anIntArray208[anInt3185++] = local137.anInt7964;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static43.method1101(anIntArray208[--anInt3185]);
									if (local137.anInt7964 != -1) {
										anIntArray208[anInt3185++] = local137.anInt7927;
										return;
									}
									anIntArray208[anInt3185++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray208[--anInt3185];
									local3803 = (Class2_Sub28) Static22.aClass323_4.method7484((long) local13);
									if (local3803 != null) {
										anIntArray208[anInt3185++] = 1;
										return;
									}
									anIntArray208[anInt3185++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static43.method1101(anIntArray208[--anInt3185]);
									if (local137.aClass303Array2 == null) {
										anIntArray208[anInt3185++] = 0;
										return;
									}
									local19 = local137.aClass303Array2.length;
									for (local25 = 0; local25 < local137.aClass303Array2.length; local25++) {
										if (local137.aClass303Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray208[anInt3185++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt3185 -= 2;
									local13 = anIntArray208[anInt3185];
									local19 = anIntArray208[anInt3185 + 1];
									local3905 = (Class2_Sub28) Static22.aClass323_4.method7484((long) local13);
									if (local3905 != null && local3905.anInt5454 == local19) {
										anIntArray208[anInt3185++] = 1;
										return;
									}
									anIntArray208[anInt3185++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static43.method1101(anIntArray208[--anInt3185]);
								if (arg0 == 2800) {
									anIntArray208[anInt3185++] = Static79.method1734(local137).method2650();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray208[--anInt3185];
									local19--;
									if (local137.aStringArray43 != null && local19 < local137.aStringArray43.length && local137.aStringArray43[local19] != null) {
										aStringArray19[anInt3190++] = local137.aStringArray43[local19];
										return;
									}
									aStringArray19[anInt3190++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString78 == null) {
										aStringArray19[anInt3190++] = "";
										return;
									}
									aStringArray19[anInt3190++] = local137.aString78;
									return;
								}
							} else {
								@Pc(4042) String local4042;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local4042 = aStringArray19[--anInt3190];
										Static442.method6331(local4042);
										return;
									}
									if (arg0 == 3101) {
										anInt3185 -= 2;
										Static628.method8701(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1, anIntArray208[anInt3185 + 1], anIntArray208[anInt3185]);
										return;
									}
									if (arg0 == 3103) {
										Static99.method1934();
										return;
									}
									if (arg0 == 3104) {
										local4042 = aStringArray19[--anInt3190];
										local19 = 0;
										if (Static445.method6373(local4042)) {
											local19 = Static307.method4785(local4042);
										}
										@Pc(4102) Class2_Sub31 local4102 = Static275.method4480(Static640.aClass314_2, Static271.aClass145_82);
										local4102.aClass2_Sub17_Sub1_2.method2827(local19);
										Static526.method7309(local4102);
										return;
									}
									@Pc(4131) Class2_Sub31 local4131;
									if (arg0 == 3105) {
										local4042 = aStringArray19[--anInt3190];
										local4131 = Static275.method4480(Static640.aClass314_2, Static508.aClass145_145);
										local4131.aClass2_Sub17_Sub1_2.method2837(local4042.length() + 1);
										local4131.aClass2_Sub17_Sub1_2.method2856(local4042);
										Static526.method7309(local4131);
										return;
									}
									if (arg0 == 3106) {
										local4042 = aStringArray19[--anInt3190];
										local4131 = Static275.method4480(Static640.aClass314_2, Static542.aClass145_154);
										local4131.aClass2_Sub17_Sub1_2.method2837(local4042.length() + 1);
										local4131.aClass2_Sub17_Sub1_2.method2856(local4042);
										Static526.method7309(local4131);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray208[--anInt3185];
										local1161 = aStringArray19[--anInt3190];
										Static545.method7529(local1161, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt3185 -= 3;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										local25 = anIntArray208[anInt3185 + 2];
										local35 = Static43.method1101(local25);
										Static74.method7159(local13, local19, local35);
										return;
									}
									if (arg0 == 3109) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										local210 = arg1 ? aClass303_7 : aClass303_8;
										Static74.method7159(local13, local19, local210);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray208[--anInt3185];
										local4131 = Static275.method4480(Static640.aClass314_2, Static325.aClass145_98);
										local4131.aClass2_Sub17_Sub1_2.method2879(local13);
										Static526.method7309(local4131);
										return;
									}
									if (arg0 == 3111) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										local3905 = (Class2_Sub28) Static22.aClass323_4.method7484((long) local13);
										if (local3905 != null) {
											Static4.method71(true, local3905, local3905.anInt5454 != local19);
										}
										Static602.method8473(local13, true, local19, 3);
										return;
									}
									if (arg0 == 3112) {
										anInt3185--;
										local13 = anIntArray208[anInt3185];
										local3803 = (Class2_Sub28) Static22.aClass323_4.method7484((long) local13);
										if (local3803 != null && local3803.anInt5452 == 3) {
											Static4.method71(true, local3803, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static367.method5449(aStringArray19[--anInt3190]);
										return;
									}
									if (arg0 == 3114) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										local1523 = aStringArray19[--anInt3190];
										Static107.method1973(local1523, local19, "", "", local13, "");
										return;
									}
									if (arg0 == 3115) {
										anInt3185 -= 11;
										@Pc(4432) Class97[] local4432 = Static562.method7867();
										@Pc(4435) Class252[] local4435 = Static186.method3192();
										Static611.method8553(local4432[anIntArray208[anInt3185]], anIntArray208[anInt3185 + 2], anIntArray208[anInt3185 + 8], anIntArray208[anInt3185 + 5], anIntArray208[anInt3185 + 7], anIntArray208[anInt3185 + 6], anIntArray208[anInt3185 + 4], anIntArray208[anInt3185 + 9], local4435[anIntArray208[anInt3185 + 1]], anIntArray208[anInt3185 + 3], anIntArray208[anInt3185 + 10]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt3185 -= 3;
										Static565.method7889(anIntArray208[anInt3185 + 1], 255, anIntArray208[anInt3185], anIntArray208[anInt3185 + 2], 256);
										return;
									}
									if (arg0 == 3201) {
										Static283.method4512(50, 255, anIntArray208[--anInt3185]);
										return;
									}
									if (arg0 == 3202) {
										anInt3185 -= 2;
										Static554.method7827(255, anIntArray208[anInt3185], anIntArray208[anInt3185 + 1]);
										return;
									}
									if (arg0 == 3203) {
										anInt3185 -= 4;
										Static565.method7889(anIntArray208[anInt3185 + 1], anIntArray208[anInt3185 + 3], anIntArray208[anInt3185], anIntArray208[anInt3185 + 2], 256);
										return;
									}
									if (arg0 == 3204) {
										anInt3185 -= 3;
										Static283.method4512(anIntArray208[anInt3185 + 2], anIntArray208[anInt3185 + 1], anIntArray208[anInt3185]);
										return;
									}
									if (arg0 == 3205) {
										anInt3185 -= 3;
										Static554.method7827(anIntArray208[anInt3185 + 2], anIntArray208[anInt3185], anIntArray208[anInt3185 + 1]);
										return;
									}
									if (arg0 == 3206) {
										anInt3185 -= 4;
										Static297.method4695(anIntArray208[anInt3185], 256, false, anIntArray208[anInt3185 + 1], anIntArray208[anInt3185 + 2], anIntArray208[anInt3185 + 3]);
										return;
									}
									if (arg0 == 3207) {
										anInt3185 -= 4;
										Static297.method4695(anIntArray208[anInt3185], 256, true, anIntArray208[anInt3185 + 1], anIntArray208[anInt3185 + 2], anIntArray208[anInt3185 + 3]);
										return;
									}
									if (arg0 == 3208) {
										anInt3185 -= 5;
										Static565.method7889(anIntArray208[anInt3185 + 1], anIntArray208[anInt3185 + 3], anIntArray208[anInt3185], anIntArray208[anInt3185 + 2], anIntArray208[anInt3185 + 4]);
										return;
									}
									if (arg0 == 3209) {
										anInt3185 -= 5;
										Static297.method4695(anIntArray208[anInt3185], anIntArray208[anInt3185 + 4], false, anIntArray208[anInt3185 + 1], anIntArray208[anInt3185 + 2], anIntArray208[anInt3185 + 3]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray208[anInt3185++] = Static389.anInt6694;
										return;
									}
									if (arg0 == 3301) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = Static65.method1474(local19, local13, false);
										return;
									}
									if (arg0 == 3302) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = Static206.method3479(local19, false, local13);
										return;
									}
									if (arg0 == 3303) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = Static344.method6790(false, local19, local13);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static177.aClass331_1.method7574(local13).anInt6884;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static216.anIntArray265[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static451.anIntArray502[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static505.anIntArray600[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4960) byte local4960 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109;
										local19 = (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037 >> 9) + Static406.anInt6899;
										local25 = (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034 >> 9) + Static338.anInt5885;
										anIntArray208[anInt3185++] = (local4960 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray208[anInt3185++] = Static158.aBoolean257 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = Static65.method1474(local19, local13, true);
										return;
									}
									if (arg0 == 3314) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = Static206.method3479(local19, true, local13);
										return;
									}
									if (arg0 == 3315) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = Static344.method6790(true, local19, local13);
										return;
									}
									if (arg0 == 3316) {
										if (Static463.anInt7496 >= 2) {
											anIntArray208[anInt3185++] = Static463.anInt7496;
											return;
										}
										anIntArray208[anInt3185++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray208[anInt3185++] = Static626.anInt10190;
										return;
									}
									if (arg0 == 3318) {
										anIntArray208[anInt3185++] = Static262.aClass155_9.anInt4152;
										return;
									}
									if (arg0 == 3321) {
										anIntArray208[anInt3185++] = Static191.anInt3815;
										return;
									}
									if (arg0 == 3322) {
										anIntArray208[anInt3185++] = Static501.anInt8009;
										return;
									}
									if (arg0 == 3323) {
										if (Static316.anInt5591 >= 5 && Static316.anInt5591 <= 9) {
											anIntArray208[anInt3185++] = 1;
											return;
										}
										anIntArray208[anInt3185++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static316.anInt5591 >= 5 && Static316.anInt5591 <= 9) {
											anIntArray208[anInt3185++] = Static316.anInt5591;
											return;
										}
										anIntArray208[anInt3185++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray208[anInt3185++] = Static9.aBoolean20 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray208[anInt3185++] = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8144;
										return;
									}
									if (arg0 == 3327) {
										anIntArray208[anInt3185++] = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1 != null && Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1.aBoolean530 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray208[anInt3185++] = Static539.aBoolean620 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static570.method7936(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = Static598.method3851(local19, local13, false);
										return;
									}
									if (arg0 == 3332) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = Static598.method3851(local19, local13, true);
										return;
									}
									if (arg0 == 3333) {
										anIntArray208[anInt3185++] = Static297.anInt5356;
										return;
									}
									if (arg0 == 3335) {
										anIntArray208[anInt3185++] = Static496.anInt7407;
										return;
									}
									if (arg0 == 3336) {
										anInt3185 -= 4;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										local25 = anIntArray208[anInt3185 + 2];
										local357 = anIntArray208[anInt3185 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local357;
										anIntArray208[anInt3185++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray208[anInt3185++] = Static65.anInt1744;
										return;
									}
									if (arg0 == 3338) {
										anIntArray208[anInt3185++] = Static189.method3248();
										return;
									}
									if (arg0 == 3339) {
										anIntArray208[anInt3185++] = 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray208[anInt3185++] = Static453.aBoolean526 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray208[anInt3185++] = Static193.aBoolean755 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray208[anInt3185++] = Static186.aClass358_1.method8722();
										return;
									}
									if (arg0 == 3343) {
										anIntArray208[anInt3185++] = Static186.aClass358_1.method8721();
										return;
									}
									if (arg0 == 3344) {
										aStringArray19[anInt3190++] = Static118.method2105();
										return;
									}
									if (arg0 == 3345) {
										aStringArray19[anInt3190++] = Static539.method7481();
										return;
									}
									if (arg0 == 3346) {
										anIntArray208[anInt3185++] = Static334.method5085();
										return;
									}
									if (arg0 == 3347) {
										anIntArray208[anInt3185++] = Static21.anInt454;
										return;
									}
									if (arg0 == 3349) {
										anIntArray208[anInt3185++] = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass111_7.method2696() >> 3;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5711) Class295 local5711;
									if (arg0 == 3400) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										local5711 = Static132.aClass184_1.method4465(local13);
										aStringArray19[anInt3190++] = local5711.method6817(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt3185 -= 4;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										local25 = anIntArray208[anInt3185 + 2];
										local357 = anIntArray208[anInt3185 + 3];
										@Pc(5757) Class295 local5757 = Static132.aClass184_1.method4465(local25);
										if (local5757.aChar2 == local13 && local5757.aChar3 == local19) {
											if (local19 == 115) {
												aStringArray19[anInt3190++] = local5757.method6817(local357);
												return;
											}
											anIntArray208[anInt3185++] = local5757.method6823(local357);
											return;
										}
										throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
									}
									if (arg0 == 3409) {
										anInt3185 -= 3;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										local25 = anIntArray208[anInt3185 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5843) Class295 local5843 = Static132.aClass184_1.method4465(local19);
										if (local5843.aChar3 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray208[anInt3185++] = local5843.method6825(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray208[--anInt3185];
										local1161 = aStringArray19[--anInt3190];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5711 = Static132.aClass184_1.method4465(local13);
										if (local5711.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray208[anInt3185++] = local5711.method6818(local1161) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray208[--anInt3185];
										@Pc(5941) Class295 local5941 = Static132.aClass184_1.method4465(local13);
										anIntArray208[anInt3185++] = local5941.aClass323_30.method7483();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static464.anInt7517 == 0) {
											anIntArray208[anInt3185++] = -2;
											return;
										}
										if (Static464.anInt7517 == 1) {
											anIntArray208[anInt3185++] = -1;
											return;
										}
										anIntArray208[anInt3185++] = Static289.anInt5236;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray208[--anInt3185];
										if (Static464.anInt7517 == 2 && local13 < Static289.anInt5236) {
											aStringArray19[anInt3190++] = Static514.aStringArray44[local13];
											if (Static83.aStringArray7[local13] != null) {
												aStringArray19[anInt3190++] = Static83.aStringArray7[local13];
												return;
											}
											aStringArray19[anInt3190++] = "";
											return;
										}
										aStringArray19[anInt3190++] = "";
										aStringArray19[anInt3190++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray208[--anInt3185];
										if (Static464.anInt7517 == 2 && local13 < Static289.anInt5236) {
											anIntArray208[anInt3185++] = Static521.anIntArray622[local13];
											return;
										}
										anIntArray208[anInt3185++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray208[--anInt3185];
										if (Static464.anInt7517 == 2 && local13 < Static289.anInt5236) {
											anIntArray208[anInt3185++] = Static89.anIntArray463[local13];
											return;
										}
										anIntArray208[anInt3185++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local4042 = aStringArray19[--anInt3190];
										local19 = anIntArray208[--anInt3185];
										Static149.method2638(local19, local4042);
										return;
									}
									if (arg0 == 3605) {
										local4042 = aStringArray19[--anInt3190];
										Static403.method6010(local4042);
										return;
									}
									if (arg0 == 3606) {
										local4042 = aStringArray19[--anInt3190];
										Static476.method6757(local4042);
										return;
									}
									if (arg0 == 3607) {
										local4042 = aStringArray19[--anInt3190];
										Static175.method3009(false, local4042);
										return;
									}
									if (arg0 == 3608) {
										local4042 = aStringArray19[--anInt3190];
										Static187.method3200(local4042);
										return;
									}
									if (arg0 == 3609) {
										local4042 = aStringArray19[--anInt3190];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray208[anInt3185++] = Static222.method3605(local4042) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray208[--anInt3185];
										if (Static464.anInt7517 == 2 && local13 < Static289.anInt5236) {
											aStringArray19[anInt3190++] = Static384.aStringArray31[local13];
											return;
										}
										aStringArray19[anInt3190++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static190.aString33 != null) {
											aStringArray19[anInt3190++] = Static296.method4689(Static190.aString33);
											return;
										}
										aStringArray19[anInt3190++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static190.aString33 != null) {
											anIntArray208[anInt3185++] = Static340.anInt5975;
											return;
										}
										anIntArray208[anInt3185++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray208[--anInt3185];
										if (Static190.aString33 != null && local13 < Static340.anInt5975) {
											aStringArray19[anInt3190++] = Static58.aClass75Array1[local13].aString19;
											return;
										}
										aStringArray19[anInt3190++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray208[--anInt3185];
										if (Static190.aString33 != null && local13 < Static340.anInt5975) {
											anIntArray208[anInt3185++] = Static58.aClass75Array1[local13].anInt2335;
											return;
										}
										anIntArray208[anInt3185++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray208[--anInt3185];
										if (Static190.aString33 != null && local13 < Static340.anInt5975) {
											anIntArray208[anInt3185++] = Static58.aClass75Array1[local13].aByte41;
											return;
										}
										anIntArray208[anInt3185++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray208[anInt3185++] = Static114.aByte44;
										return;
									}
									if (arg0 == 3617) {
										local4042 = aStringArray19[--anInt3190];
										Static239.method3871(local4042);
										return;
									}
									if (arg0 == 3618) {
										anIntArray208[anInt3185++] = Static502.aByte131;
										return;
									}
									if (arg0 == 3619) {
										local4042 = aStringArray19[--anInt3190];
										Static56.method1301(local4042);
										return;
									}
									if (arg0 == 3620) {
										Static68.method1589();
										return;
									}
									if (arg0 == 3621) {
										if (Static464.anInt7517 == 0) {
											anIntArray208[anInt3185++] = -1;
											return;
										}
										anIntArray208[anInt3185++] = Static568.anInt9305;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray208[--anInt3185];
										if (Static464.anInt7517 != 0 && local13 < Static568.anInt9305) {
											aStringArray19[anInt3190++] = Static84.aStringArray8[local13];
											if (Static188.aStringArray22[local13] != null) {
												aStringArray19[anInt3190++] = Static188.aStringArray22[local13];
												return;
											}
											aStringArray19[anInt3190++] = "";
											return;
										}
										aStringArray19[anInt3190++] = "";
										aStringArray19[anInt3190++] = "";
										return;
									}
									if (arg0 == 3623) {
										local4042 = aStringArray19[--anInt3190];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray208[anInt3185++] = Static209.method3513(local4042) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray208[--anInt3185];
										if (Static58.aClass75Array1 != null && local13 < Static340.anInt5975 && Static58.aClass75Array1[local13].aString18.equalsIgnoreCase(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aString82)) {
											anIntArray208[anInt3185++] = 1;
											return;
										}
										anIntArray208[anInt3185++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static479.aString72 != null) {
											aStringArray19[anInt3190++] = Static479.aString72;
											return;
										}
										aStringArray19[anInt3190++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray208[--anInt3185];
										if (Static190.aString33 != null && local13 < Static340.anInt5975) {
											aStringArray19[anInt3190++] = Static58.aClass75Array1[local13].aString21;
											return;
										}
										aStringArray19[anInt3190++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray208[--anInt3185];
										if (Static464.anInt7517 == 2 && local13 >= 0 && local13 < Static289.anInt5236) {
											anIntArray208[anInt3185++] = Static471.aBooleanArray22[local13] ? 1 : 0;
											return;
										}
										anIntArray208[anInt3185++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local4042 = aStringArray19[--anInt3190];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray208[anInt3185++] = Static474.method6701(local4042);
										return;
									}
									if (arg0 == 3629) {
										anIntArray208[anInt3185++] = Static309.anInt7824;
										return;
									}
									if (arg0 == 3630) {
										local4042 = aStringArray19[--anInt3190];
										Static175.method3009(true, local4042);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static66.aBooleanArray1[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray208[--anInt3185];
										if (Static190.aString33 != null && local13 < Static340.anInt5975) {
											aStringArray19[anInt3190++] = Static58.aClass75Array1[local13].aString18;
											return;
										}
										aStringArray19[anInt3190++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray208[--anInt3185];
										if (Static464.anInt7517 != 0 && local13 < Static568.anInt9305) {
											aStringArray19[anInt3190++] = Static307.aStringArray33[local13];
											return;
										}
										aStringArray19[anInt3190++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static158.aClass29Array1[local13].method734();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static158.aClass29Array1[local13].anInt660;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static158.aClass29Array1[local13].anInt658;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static158.aClass29Array1[local13].anInt656;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static158.aClass29Array1[local13].anInt657;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static158.aClass29Array1[local13].anInt654;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray208[--anInt3185];
										local19 = Static158.aClass29Array1[local13].method736();
										anIntArray208[anInt3185++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray208[--anInt3185];
										local19 = Static158.aClass29Array1[local13].method736();
										anIntArray208[anInt3185++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray208[--anInt3185];
										local19 = Static158.aClass29Array1[local13].method736();
										anIntArray208[anInt3185++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray208[--anInt3185];
										local19 = Static158.aClass29Array1[local13].method736();
										anIntArray208[anInt3185++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt3185 -= 5;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										local25 = anIntArray208[anInt3185 + 2];
										local357 = anIntArray208[anInt3185 + 3];
										local2373 = anIntArray208[anInt3185 + 4];
										anIntArray208[anInt3185++] = local13 + (local19 - local13) * (local2373 - local25) / (local357 - local25);
										return;
									}
									@Pc(7451) long local7451;
									@Pc(7444) long local7444;
									if (arg0 == 4007) {
										anInt3185 -= 2;
										local7444 = (long) anIntArray208[anInt3185];
										local7451 = (long) anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = (int) (local7444 + local7444 * local7451 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										if (local13 == 0) {
											anIntArray208[anInt3185++] = 0;
											return;
										}
										anIntArray208[anInt3185++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										if (local13 == 0) {
											anIntArray208[anInt3185++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray208[anInt3185++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray208[anInt3185++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt3185 -= 3;
										local7444 = (long) anIntArray208[anInt3185];
										local7451 = (long) anIntArray208[anInt3185 + 1];
										@Pc(7832) long local7832 = (long) anIntArray208[anInt3185 + 2];
										anIntArray208[anInt3185++] = (int) (local7444 * local7832 / local7451);
										return;
									}
									if (arg0 == 4019) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										if (local13 > 700 || local19 > 700) {
											anIntArray208[anInt3185++] = 256;
										}
										@Pc(7891) double local7891 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
										anIntArray208[anInt3185++] = (int) (Math.pow(2.0D, local7891) + 0.5D);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local4042 = aStringArray19[--anInt3190];
										local19 = anIntArray208[--anInt3185];
										aStringArray19[anInt3190++] = local4042 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt3190 -= 2;
										local4042 = aStringArray19[anInt3190];
										local1161 = aStringArray19[anInt3190 + 1];
										aStringArray19[anInt3190++] = local4042 + local1161;
										return;
									}
									if (arg0 == 4102) {
										local4042 = aStringArray19[--anInt3190];
										local19 = anIntArray208[--anInt3185];
										aStringArray19[anInt3190++] = local4042 + Static317.method4873(local19, true);
										return;
									}
									if (arg0 == 4103) {
										local4042 = aStringArray19[--anInt3190];
										aStringArray19[anInt3190++] = local4042.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray19[anInt3190++] = method2740(anIntArray208[--anInt3185]);
										return;
									}
									if (arg0 == 4105) {
										anInt3190 -= 2;
										local4042 = aStringArray19[anInt3190];
										local1161 = aStringArray19[anInt3190 + 1];
										if (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1 != null && Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1.aBoolean530) {
											aStringArray19[anInt3190++] = local1161;
											return;
										}
										aStringArray19[anInt3190++] = local4042;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray208[--anInt3185];
										aStringArray19[anInt3190++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt3190 -= 2;
										anIntArray208[anInt3185++] = Static236.method3799(aStringArray19[anInt3190 + 1], Static496.anInt7407, aStringArray19[anInt3190]);
										return;
									}
									@Pc(8174) Class183 local8174;
									if (arg0 == 4108) {
										local4042 = aStringArray19[--anInt3190];
										anInt3185 -= 2;
										local19 = anIntArray208[anInt3185];
										local25 = anIntArray208[anInt3185 + 1];
										local8174 = Static28.method8897(local25, Static419.aClass238_210);
										anIntArray208[anInt3185++] = local8174.method4450(Static435.aClass31Array12, local19, local4042);
										return;
									}
									if (arg0 == 4109) {
										local4042 = aStringArray19[--anInt3190];
										anInt3185 -= 2;
										local19 = anIntArray208[anInt3185];
										local25 = anIntArray208[anInt3185 + 1];
										local8174 = Static28.method8897(local25, Static419.aClass238_210);
										anIntArray208[anInt3185++] = local8174.method4452(local19, Static435.aClass31Array12, local4042);
										return;
									}
									if (arg0 == 4110) {
										anInt3190 -= 2;
										local4042 = aStringArray19[anInt3190];
										local1161 = aStringArray19[anInt3190 + 1];
										if (anIntArray208[--anInt3185] == 1) {
											aStringArray19[anInt3190++] = local4042;
											return;
										}
										aStringArray19[anInt3190++] = local1161;
										return;
									}
									if (arg0 == 4111) {
										local4042 = aStringArray19[--anInt3190];
										aStringArray19[anInt3190++] = Static355.method5321(local4042);
										return;
									}
									if (arg0 == 4112) {
										local4042 = aStringArray19[--anInt3190];
										local19 = anIntArray208[--anInt3185];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray19[anInt3190++] = local4042 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = method2737((char) local13);
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static152.method2683((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static391.method5796((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static635.method8747((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local4042 = aStringArray19[--anInt3190];
										if (local4042 != null) {
											anIntArray208[anInt3185++] = local4042.length();
											return;
										}
										anIntArray208[anInt3185++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local4042 = aStringArray19[--anInt3190];
										anInt3185 -= 2;
										local19 = anIntArray208[anInt3185];
										local25 = anIntArray208[anInt3185 + 1];
										aStringArray19[anInt3190++] = local4042.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local4042 = aStringArray19[--anInt3190];
										@Pc(8532) StringBuffer local8532 = new StringBuffer(local4042.length());
										@Pc(8534) boolean local8534 = false;
										for (local357 = 0; local357 < local4042.length(); local357++) {
											@Pc(8541) char local8541 = local4042.charAt(local357);
											if (local8541 == '<') {
												local8534 = true;
											} else if (local8541 == '>') {
												local8534 = false;
											} else if (!local8534) {
												local8532.append(local8541);
											}
										}
										aStringArray19[anInt3190++] = local8532.toString();
										return;
									}
									if (arg0 == 4120) {
										local4042 = aStringArray19[--anInt3190];
										anInt3185 -= 2;
										local19 = anIntArray208[anInt3185];
										local25 = anIntArray208[anInt3185 + 1];
										anIntArray208[anInt3185++] = local4042.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt3190 -= 2;
										local4042 = aStringArray19[anInt3190];
										local1161 = aStringArray19[anInt3190 + 1];
										local25 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = local4042.indexOf(local1161, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local420 = anIntArray208[--anInt3185] != 0;
										local19 = anIntArray208[--anInt3185];
										aStringArray19[anInt3190++] = Static176.method3032(0, Static496.anInt7407, (long) local19, local420);
										return;
									}
									if (arg0 == 4125) {
										local4042 = aStringArray19[--anInt3190];
										local19 = anIntArray208[--anInt3185];
										@Pc(8755) Class183 local8755 = Static28.method8897(local19, Static419.aClass238_210);
										anIntArray208[anInt3185++] = local8755.method4454(local4042, Static435.aClass31Array12);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray208[--anInt3185];
										aStringArray19[anInt3190++] = Static470.aClass250_1.method5960(local13).aString86;
										return;
									}
									@Pc(8817) Class327 local8817;
									if (arg0 == 4201) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										local8817 = Static470.aClass250_1.method5960(local13);
										if (local19 >= 1 && local19 <= 5 && local8817.aStringArray49[local19 - 1] != null) {
											aStringArray19[anInt3190++] = local8817.aStringArray49[local19 - 1];
											return;
										}
										aStringArray19[anInt3190++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										local8817 = Static470.aClass250_1.method5960(local13);
										if (local19 >= 1 && local19 <= 5 && local8817.aStringArray48[local19 - 1] != null) {
											aStringArray19[anInt3190++] = local8817.aStringArray48[local19 - 1];
											return;
										}
										aStringArray19[anInt3190++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static470.aClass250_1.method5960(local13).anInt8747;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static470.aClass250_1.method5960(local13).anInt8756 == 1 ? 1 : 0;
										return;
									}
									@Pc(8980) Class327 local8980;
									if (arg0 == 4205) {
										local13 = anIntArray208[--anInt3185];
										local8980 = Static470.aClass250_1.method5960(local13);
										if (local8980.anInt8761 == -1 && local8980.anInt8744 >= 0) {
											anIntArray208[anInt3185++] = local8980.anInt8744;
											return;
										}
										anIntArray208[anInt3185++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray208[--anInt3185];
										local8980 = Static470.aClass250_1.method5960(local13);
										if (local8980.anInt8761 >= 0 && local8980.anInt8744 >= 0) {
											anIntArray208[anInt3185++] = local8980.anInt8744;
											return;
										}
										anIntArray208[anInt3185++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static470.aClass250_1.method5960(local13).aBoolean621 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										local3107 = Static106.aClass293_1.method6807(local19);
										if (local3107.method7527()) {
											aStringArray19[anInt3190++] = Static470.aClass250_1.method5960(local13).method7498(local3107.aString87, local19);
											return;
										}
										anIntArray208[anInt3185++] = Static470.aClass250_1.method5960(local13).method7508(local19, local3107.anInt8782);
										return;
									}
									if (arg0 == 4209) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1] - 1;
										local8817 = Static470.aClass250_1.method5960(local13);
										if (local8817.anInt8750 == local19) {
											anIntArray208[anInt3185++] = local8817.anInt8717;
											return;
										}
										if (local8817.anInt8745 == local19) {
											anIntArray208[anInt3185++] = local8817.anInt8734;
											return;
										}
										anIntArray208[anInt3185++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local4042 = aStringArray19[--anInt3190];
										local19 = anIntArray208[--anInt3185];
										Static97.method1922(local19 == 1, local4042);
										anIntArray208[anInt3185++] = Static336.anInt5883;
										return;
									}
									if (arg0 == 4211) {
										if (Static155.aShortArray48 != null && Static588.anInt9782 < Static336.anInt5883) {
											anIntArray208[anInt3185++] = Static155.aShortArray48[Static588.anInt9782++] & 0xFFFF;
											return;
										}
										anIntArray208[anInt3185++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static588.anInt9782 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray208[--anInt3185];
										anIntArray208[anInt3185++] = Static470.aClass250_1.method5960(local13).anInt8759;
										return;
									}
									if (arg0 == 4214) {
										local4042 = aStringArray19[--anInt3190];
										anInt3185 -= 3;
										local19 = anIntArray208[anInt3185];
										local25 = anIntArray208[anInt3185 + 1];
										local357 = anIntArray208[anInt3185 + 2];
										Static304.method4767(local25, local19 == 1, local4042, local357);
										anIntArray208[anInt3185++] = Static336.anInt5883;
										return;
									}
									if (arg0 == 4215) {
										anInt3190 -= 2;
										anInt3185 -= 2;
										local4042 = aStringArray19[anInt3190];
										local19 = anIntArray208[anInt3185];
										local25 = anIntArray208[anInt3185 + 1];
										@Pc(9379) String local9379 = aStringArray19[anInt3190 + 1];
										Static365.method5436(local9379, local4042, local19 == 1, local25);
										anIntArray208[anInt3185++] = Static336.anInt5883;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										local3107 = Static106.aClass293_1.method6807(local19);
										if (local3107.method7527()) {
											aStringArray19[anInt3190++] = Static137.aClass366_1.method8551(local13).method2751(local3107.aString87, local19);
											return;
										}
										anIntArray208[anInt3185++] = Static137.aClass366_1.method8551(local13).method2744(local3107.anInt8782, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										local3107 = Static106.aClass293_1.method6807(local19);
										if (local3107.method7527()) {
											aStringArray19[anInt3190++] = Static79.aClass304_2.method6956(local13).method79(local3107.aString87, local19);
											return;
										}
										anIntArray208[anInt3185++] = Static79.aClass304_2.method6956(local13).method89(local3107.anInt8782, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt3185 -= 2;
										local13 = anIntArray208[anInt3185];
										local19 = anIntArray208[anInt3185 + 1];
										local3107 = Static106.aClass293_1.method6807(local19);
										if (local3107.method7527()) {
											aStringArray19[anInt3190++] = Static372.aClass60_1.method1793(local13).method3603(local3107.aString87, local19);
											return;
										}
										anIntArray208[anInt3185++] = Static372.aClass60_1.method1793(local13).method3600(local3107.anInt8782, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray208[--anInt3185];
									@Pc(9607) Class291 local9607 = Static6.aClass146_1.method3512(local13);
									if (local9607.anIntArray549 != null && local9607.anIntArray549.length > 0) {
										local25 = 0;
										local357 = local9607.anIntArray551[0];
										for (local2373 = 1; local2373 < local9607.anIntArray549.length; local2373++) {
											if (local9607.anIntArray551[local2373] > local357) {
												local25 = local2373;
												local357 = local9607.anIntArray551[local2373];
											}
										}
										anIntArray208[anInt3185++] = local9607.anIntArray549[local25];
										return;
									}
									anIntArray208[anInt3185++] = local9607.anInt7619;
									return;
								}
							}
						}
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static43.method1101(anIntArray208[--anInt3185]);
				} else {
					local137 = arg1 ? aClass303_7 : aClass303_8;
				}
				if (arg0 == 1000) {
					anInt3185 -= 4;
					local137.anInt7953 = anIntArray208[anInt3185];
					local137.anInt7926 = anIntArray208[anInt3185 + 1];
					local19 = anIntArray208[anInt3185 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray208[anInt3185 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte103 = (byte) local19;
					local137.aByte105 = (byte) local25;
					Static514.method7103(local137);
					Static620.method8619(local137);
					if (local137.anInt7983 == -1) {
						Static172.method2994(local137.anInt7962);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt3185 -= 4;
					local137.anInt7940 = anIntArray208[anInt3185];
					local137.anInt7948 = anIntArray208[anInt3185 + 1];
					local137.anInt7951 = 0;
					local137.anInt7957 = 0;
					local19 = anIntArray208[anInt3185 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray208[anInt3185 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte106 = (byte) local19;
					local137.aByte104 = (byte) local25;
					Static514.method7103(local137);
					Static620.method8619(local137);
					if (local137.anInt7935 == 0) {
						Static103.method1958(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray208[--anInt3185] == 1;
					if (local137.aBoolean567 != local661) {
						local137.aBoolean567 = local661;
						Static514.method7103(local137);
					}
					if (local137.anInt7983 == -1) {
						Static151.method2660(local137.anInt7962);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt3185 -= 2;
					local137.anInt7916 = anIntArray208[anInt3185];
					local137.anInt7924 = anIntArray208[anInt3185 + 1];
					Static514.method7103(local137);
					Static620.method8619(local137);
					if (local137.anInt7935 == 0) {
						Static103.method1958(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean564 = anIntArray208[--anInt3185] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!ev;)V")
	public static void method2728(@OriginalArg(0) Class2_Sub18 arg0) {
		method2732(arg0, 200000);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method2729(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static463.anInt7496 == 0 && (Static279.aBoolean378 && !Static318.aBoolean410 || Static539.aBoolean620)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static573.aClass345_49.method7951(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static573.aClass345_49.method7951(0).length());
		} else if (local11.startsWith(Static573.aClass345_50.method7951(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static573.aClass345_50.method7951(0).length());
		} else if (local11.startsWith(Static573.aClass345_51.method7951(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static573.aClass345_51.method7951(0).length());
		} else if (local11.startsWith(Static573.aClass345_52.method7951(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static573.aClass345_52.method7951(0).length());
		} else if (local11.startsWith(Static573.aClass345_53.method7951(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static573.aClass345_53.method7951(0).length());
		} else if (local11.startsWith(Static573.aClass345_54.method7951(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static573.aClass345_54.method7951(0).length());
		} else if (local11.startsWith(Static573.aClass345_55.method7951(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static573.aClass345_55.method7951(0).length());
		} else if (local11.startsWith(Static573.aClass345_56.method7951(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static573.aClass345_56.method7951(0).length());
		} else if (local11.startsWith(Static573.aClass345_57.method7951(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static573.aClass345_57.method7951(0).length());
		} else if (local11.startsWith(Static573.aClass345_58.method7951(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static573.aClass345_58.method7951(0).length());
		} else if (local11.startsWith(Static573.aClass345_59.method7951(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static573.aClass345_59.method7951(0).length());
		} else if (local11.startsWith(Static573.aClass345_60.method7951(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static573.aClass345_60.method7951(0).length());
		} else if (Static496.anInt7407 != 0) {
			if (local11.startsWith(Static573.aClass345_49.method7951(Static496.anInt7407))) {
				local13 = 0;
				arg0 = arg0.substring(Static573.aClass345_49.method7951(Static496.anInt7407).length());
			} else if (local11.startsWith(Static573.aClass345_50.method7951(Static496.anInt7407))) {
				local13 = 1;
				arg0 = arg0.substring(Static573.aClass345_50.method7951(Static496.anInt7407).length());
			} else if (local11.startsWith(Static573.aClass345_51.method7951(Static496.anInt7407))) {
				local13 = 2;
				arg0 = arg0.substring(Static573.aClass345_51.method7951(Static496.anInt7407).length());
			} else if (local11.startsWith(Static573.aClass345_52.method7951(Static496.anInt7407))) {
				local13 = 3;
				arg0 = arg0.substring(Static573.aClass345_52.method7951(Static496.anInt7407).length());
			} else if (local11.startsWith(Static573.aClass345_53.method7951(Static496.anInt7407))) {
				local13 = 4;
				arg0 = arg0.substring(Static573.aClass345_53.method7951(Static496.anInt7407).length());
			} else if (local11.startsWith(Static573.aClass345_54.method7951(Static496.anInt7407))) {
				local13 = 5;
				arg0 = arg0.substring(Static573.aClass345_54.method7951(Static496.anInt7407).length());
			} else if (local11.startsWith(Static573.aClass345_55.method7951(Static496.anInt7407))) {
				local13 = 6;
				arg0 = arg0.substring(Static573.aClass345_55.method7951(Static496.anInt7407).length());
			} else if (local11.startsWith(Static573.aClass345_56.method7951(Static496.anInt7407))) {
				local13 = 7;
				arg0 = arg0.substring(Static573.aClass345_56.method7951(Static496.anInt7407).length());
			} else if (local11.startsWith(Static573.aClass345_57.method7951(Static496.anInt7407))) {
				local13 = 8;
				arg0 = arg0.substring(Static573.aClass345_57.method7951(Static496.anInt7407).length());
			} else if (local11.startsWith(Static573.aClass345_58.method7951(Static496.anInt7407))) {
				local13 = 9;
				arg0 = arg0.substring(Static573.aClass345_58.method7951(Static496.anInt7407).length());
			} else if (local11.startsWith(Static573.aClass345_59.method7951(Static496.anInt7407))) {
				local13 = 10;
				arg0 = arg0.substring(Static573.aClass345_59.method7951(Static496.anInt7407).length());
			} else if (local11.startsWith(Static573.aClass345_60.method7951(Static496.anInt7407))) {
				local13 = 11;
				arg0 = arg0.substring(Static573.aClass345_60.method7951(Static496.anInt7407).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static573.aClass345_61.method7951(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static573.aClass345_61.method7951(0).length());
		} else if (local11.startsWith(Class345.lb.method7951(0))) {
			local451 = 2;
			arg0 = arg0.substring(Class345.lb.method7951(0).length());
		} else if (local11.startsWith(Static573.aClass345_62.method7951(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static573.aClass345_62.method7951(0).length());
		} else if (local11.startsWith(Static573.aClass345_63.method7951(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static573.aClass345_63.method7951(0).length());
		} else if (local11.startsWith(Static573.aClass345_64.method7951(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static573.aClass345_64.method7951(0).length());
		} else if (Static496.anInt7407 != 0) {
			if (local11.startsWith(Static573.aClass345_61.method7951(Static496.anInt7407))) {
				local451 = 1;
				arg0 = arg0.substring(Static573.aClass345_61.method7951(Static496.anInt7407).length());
			} else if (local11.startsWith(Class345.lb.method7951(Static496.anInt7407))) {
				local451 = 2;
				arg0 = arg0.substring(Class345.lb.method7951(Static496.anInt7407).length());
			} else if (local11.startsWith(Static573.aClass345_62.method7951(Static496.anInt7407))) {
				local451 = 3;
				arg0 = arg0.substring(Static573.aClass345_62.method7951(Static496.anInt7407).length());
			} else if (local11.startsWith(Static573.aClass345_63.method7951(Static496.anInt7407))) {
				local451 = 4;
				arg0 = arg0.substring(Static573.aClass345_63.method7951(Static496.anInt7407).length());
			} else if (local11.startsWith(Static573.aClass345_64.method7951(Static496.anInt7407))) {
				local451 = 5;
				arg0 = arg0.substring(Static573.aClass345_64.method7951(Static496.anInt7407).length());
			}
		}
		@Pc(641) Class2_Sub31 local641 = Static275.method4480(Static640.aClass314_2, Static269.aClass145_80);
		local641.aClass2_Sub17_Sub1_2.method2837(0);
		@Pc(650) int local650 = local641.aClass2_Sub17_Sub1_2.anInt3378;
		local641.aClass2_Sub17_Sub1_2.method2837(local13);
		local641.aClass2_Sub17_Sub1_2.method2837(local451);
		Static476.method6755(local641.aClass2_Sub17_Sub1_2, arg0);
		local641.aClass2_Sub17_Sub1_2.method2840(local641.aClass2_Sub17_Sub1_2.anInt3378 - local650);
		Static526.method7309(local641);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
	private static void method2730(@OriginalArg(0) int arg0) {
		@Pc(3) Class303 local3 = Static43.method1101(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class303[] local13 = Static649.aClass303ArrayArray5[local9];
		if (local13 == null) {
			@Pc(19) Class303[] local19 = Static261.aClass303ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static649.aClass303ArrayArray5[local9] = new Class303[local22];
			Static650.method2268(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static650.method2268(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(IZ)V")
	public static void method2731() {
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!ev;I)V")
	private static void method2732(@OriginalArg(0) Class2_Sub18 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub7_Sub13 local12 = Static57.method1304(local8);
		if (local12 == null) {
			return;
		}
		anIntArray207 = new int[local12.anInt7116];
		@Pc(21) int local21 = 0;
		aStringArray18 = new String[local12.anInt7115];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt3019;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt3016;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass303_4 == null ? -1 : arg0.aClass303_4.anInt7962;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt3015;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass303_4 == null ? -1 : arg0.aClass303_4.anInt7983;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass303_5 == null ? -1 : arg0.aClass303_5.anInt7962;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass303_5 == null ? -1 : arg0.aClass303_5.anInt7983;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt3021;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt3014;
				}
				anIntArray207[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString28;
				}
				aStringArray18[local27++] = local135;
			}
		}
		anInt3197 = arg0.anInt3018;
		method2734(local12, arg1);
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V")
	private static void method2733(@OriginalArg(0) int arg0) {
		@Pc(3) Class303 local3 = Static43.method1101(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class303[] local13 = Static649.aClass303ArrayArray5[local9];
		if (local13 == null) {
			@Pc(19) Class303[] local19 = Static261.aClass303ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static649.aClass303ArrayArray5[local9] = new Class303[local22];
			Static650.method2268(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static650.method2268(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!pc;I)V")
	private static void method2734(@OriginalArg(0) Class2_Sub7_Sub13 arg0, @OriginalArg(1) int arg1) {
		anInt3185 = 0;
		anInt3190 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray480;
		@Pc(11) int[] local11 = arg0.anIntArray479;
		@Pc(13) byte local13 = -1;
		anInt3183 = 0;
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
						method2727(local31, local839);
					} else if (local31 >= 5000 && local31 < 10000) {
						method2726(local31, local839);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray208[anInt3185++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray208[anInt3185++] = Static382.aClass282_1.anIntArray508[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static382.aClass282_1.method6478(local54, anIntArray208[--anInt3185]);
					} else if (local31 == 3) {
						aStringArray19[anInt3190++] = arg0.aStringArray41[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt3185 -= 2;
						if (anIntArray208[anInt3185] != anIntArray208[anInt3185 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt3185 -= 2;
						if (anIntArray208[anInt3185] == anIntArray208[anInt3185 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt3185 -= 2;
						if (anIntArray208[anInt3185] < anIntArray208[anInt3185 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt3185 -= 2;
						if (anIntArray208[anInt3185] > anIntArray208[anInt3185 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt3183 == 0) {
							return;
						}
						@Pc(216) Class266 local216 = aClass266Array1[--anInt3183];
						arg0 = local216.aClass2_Sub7_Sub13_1;
						local8 = arg0.anIntArray480;
						local11 = arg0.anIntArray479;
						local5 = local216.anInt7101;
						anIntArray207 = local216.anIntArray475;
						aStringArray18 = local216.aStringArray40;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray208[anInt3185++] = Static382.aClass282_1.method6472(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static382.aClass282_1.method6479(anIntArray208[--anInt3185], local54);
					} else if (local31 == 31) {
						anInt3185 -= 2;
						if (anIntArray208[anInt3185] <= anIntArray208[anInt3185 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt3185 -= 2;
						if (anIntArray208[anInt3185] >= anIntArray208[anInt3185 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray208[anInt3185++] = anIntArray207[local11[local5]];
					} else if (local31 == 34) {
						anIntArray207[local11[local5]] = anIntArray208[--anInt3185];
					} else if (local31 == 35) {
						aStringArray19[anInt3190++] = aStringArray18[local11[local5]];
					} else if (local31 == 36) {
						aStringArray18[local11[local5]] = aStringArray19[--anInt3190];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt3190 -= local54;
						@Pc(400) String local400 = Static412.method6050(anInt3190, local54, aStringArray19);
						aStringArray19[anInt3190++] = local400;
					} else if (local31 == 38) {
						anInt3185--;
					} else if (local31 == 39) {
						anInt3190--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class2_Sub7_Sub13 local436 = Static57.method1304(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt7116];
							@Pc(450) String[] local450 = new String[local436.anInt7115];
							for (local452 = 0; local452 < local436.anInt7114; local452++) {
								local446[local452] = anIntArray208[anInt3185 + local452 - local436.anInt7114];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt7117; local471++) {
								local450[local471] = aStringArray19[anInt3190 + local471 - local436.anInt7117];
							}
							anInt3185 -= local436.anInt7114;
							anInt3190 -= local436.anInt7117;
							@Pc(502) Class266 local502 = new Class266();
							local502.aClass2_Sub7_Sub13_1 = arg0;
							local502.anInt7101 = local5;
							local502.anIntArray475 = anIntArray207;
							local502.aStringArray40 = aStringArray18;
							if (anInt3183 >= aClass266Array1.length) {
								throw new RuntimeException();
							}
							aClass266Array1[anInt3183++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray480;
							local11 = local436.anIntArray479;
							local5 = -1;
							anIntArray207 = local446;
							aStringArray18 = local450;
						} else if (local31 == 42) {
							anIntArray208[anInt3185++] = Static450.anIntArray501[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static450.anIntArray501[local54] = anIntArray208[--anInt3185];
							Static290.method4610(local54);
							Static342.aBoolean425 |= Static226.aBooleanArray6[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray208[--anInt3185];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray209[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label270;
									}
									anIntArrayArray29[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray208[--anInt3185];
							if (local603 < 0 || local603 >= anIntArray209[local54]) {
								throw new RuntimeException();
							}
							anIntArray208[anInt3185++] = anIntArrayArray29[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt3185 -= 2;
							local603 = anIntArray208[anInt3185];
							if (local603 < 0 || local603 >= anIntArray209[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray29[local54][local603] = anIntArray208[anInt3185 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static192.aStringArray23[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray19[anInt3190++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static192.aStringArray23[local54] = aStringArray19[--anInt3190];
							Static487.method6854(local54);
						} else if (local31 == 51) {
							@Pc(774) Class323 local774 = arg0.aClass323Array1[local11[local5]];
							@Pc(787) Class2_Sub41 local787 = (Class2_Sub41) local774.method7484((long) anIntArray208[--anInt3185]);
							if (local787 != null) {
								local5 += local787.anInt9197;
							}
						} else if (local31 == 86) {
							if (anIntArray208[--anInt3185] == 1) {
								local5 += local11[local5];
							}
						} else if (local31 == 87 && anIntArray208[--anInt3185] == 0) {
							local5 += local11[local5];
						}
					}
				}
			}
		} catch (@Pc(874) Exception local874) {
			@Pc(893) StringBuffer local893;
			if (arg0.aString59 == null) {
				local893 = new StringBuffer(30);
				local893.append("CS2: ").append(arg0.aLong278).append(" ");
				for (local603 = anInt3183 - 1; local603 >= 0; local603--) {
					local893.append("v: ").append(aClass266Array1[local603].aClass2_Sub7_Sub13_1.aLong278).append(" ");
				}
				local893.append("op: ").append(local13);
				Static25.method7457(local874, local893.toString());
			} else {
				Static601.method8468("Clientscript error in: " + arg0.aString59);
				local893 = new StringBuffer(30);
				local893.append("Clientscript error in: ").append(arg0.aString59).append("\n");
				for (local603 = anInt3183 - 1; local603 >= 0; local603--) {
					local893.append("via: ").append(aClass266Array1[local603].aClass2_Sub7_Sub13_1.aString59).append("\n");
				}
				local893.append("Op: ").append(local13).append("\n");
				@Pc(933) String local933 = local874.getMessage();
				if (local933 != null && local933.length() > 0) {
					local893.append("Message: ").append(local933).append("\n");
				}
				Static25.method7457(local874, local893.toString());
				Static575.method7997(local893.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)V")
	public static void method2736(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static31.method728(arg0)) {
			return;
		}
		@Pc(12) Class303[] local12 = Static261.aClass303ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class303 local19 = local12[local14];
			if (local19.anObjectArray13 != null) {
				@Pc(26) Class2_Sub18 local26 = new Class2_Sub18();
				local26.aClass303_4 = local19;
				local26.anObjectArray1 = local19.anObjectArray13;
				method2732(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(C)I")
	private static int method2737(@OriginalArg(0) char arg0) {
		return Static560.method7861(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "()V")
	public static void method2738() {
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!sf;II)V")
	public static void method2739(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub7_Sub13 local5 = Static292.method4626(arg1, arg0, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray207 = new int[local5.anInt7116];
		aStringArray18 = new String[local5.anInt7115];
		if (local5.aClass312_7 == Static368.aClass312_4 || local5.aClass312_7 == Static481.aClass312_11 || local5.aClass312_7 == Static628.aClass312_13) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static422.aClass303_15 != null) {
				local30 = Static422.aClass303_15.anInt7923;
				local32 = Static422.aClass303_15.anInt7955;
			}
			anIntArray207[0] = Static186.aClass358_1.method8722() - local30;
			anIntArray207[1] = Static186.aClass358_1.method8721() - local32;
		}
		method2734(local5, 200000);
	}

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method2740(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray20[local20] + "-" + local24;
	}
}
