import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray18;

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "Lclient!dt;")
	private static Class62 aClass62_7;

	@OriginalMember(owner = "client!gt", name = "o", descriptor = "[I")
	private static int[] anIntArray241;

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "Lclient!so;")
	private static Class216 aClass216_1;

	@OriginalMember(owner = "client!gt", name = "x", descriptor = "Lclient!dt;")
	private static Class62 aClass62_8;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray17 = new String[1000];

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "[[I")
	private static final int[][] anIntArrayArray22 = new int[5][5000];

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "[Lclient!pn;")
	private static final Class185[] aClass185Array1 = new Class185[50];

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "[I")
	private static final int[] anIntArray239 = new int[1000];

	@OriginalMember(owner = "client!gt", name = "n", descriptor = "[I")
	private static final int[] anIntArray240 = new int[5];

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!gt", name = "s", descriptor = "I")
	private static int anInt2371 = 0;

	@OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
	private static int anInt2372 = 0;

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "I")
	private static int anInt2375 = 0;

	@OriginalMember(owner = "client!gt", name = "z", descriptor = "[I")
	private static final int[] anIntArray242 = new int[3];

	@OriginalMember(owner = "client!gt", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray19 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!gt", name = "B", descriptor = "Lclient!ku;")
	public static final Class139 aClass139_28 = new Class139(4);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZ)V")
	private static void method1998(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1292) boolean local1292;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(89) int local89;
		@Pc(81) String local81;
		@Pc(75) String local75;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray239[anInt2375++] = Static335.anInt5689;
				return;
			}
			if (arg0 == 5001) {
				anInt2375 -= 3;
				Static335.anInt5689 = anIntArray239[anInt2375];
				Static257.aClass128_18 = Static219.method3670(anIntArray239[anInt2375 + 1]);
				if (Static257.aClass128_18 == null) {
					Static257.aClass128_18 = Static154.aClass128_26;
				}
				Static257.anInt4619 = anIntArray239[anInt2375 + 2];
				Static229.method3783(Static349.aClass244_86);
				Static23.aClass3_Sub5_Sub1_1.method2791(Static335.anInt5689);
				Static23.aClass3_Sub5_Sub1_1.method2791(Static257.aClass128_18.anInt3174);
				Static23.aClass3_Sub5_Sub1_1.method2791(Static257.anInt4619);
				return;
			}
			if (arg0 == 5002) {
				anInt2371 -= 2;
				local75 = aStringArray17[anInt2371];
				local81 = aStringArray17[anInt2371 + 1];
				anInt2375 -= 2;
				local89 = anIntArray239[anInt2375];
				local95 = anIntArray239[anInt2375 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static229.method3783(Static175.aClass244_43);
				Static23.aClass3_Sub5_Sub1_1.method2791(Static269.method4260(local75) + Static269.method4260(local81) + 2);
				Static23.aClass3_Sub5_Sub1_1.method2768(local75);
				Static23.aClass3_Sub5_Sub1_1.method2791(local89 - 1);
				Static23.aClass3_Sub5_Sub1_1.method2791(local95);
				Static23.aClass3_Sub5_Sub1_1.method2768(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray239[--anInt2375];
				local81 = null;
				if (local157 < 100) {
					local81 = Static179.aStringArray24[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray17[anInt2371++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray239[--anInt2375];
				local192 = -1;
				if (local157 < 100 && Static179.aStringArray24[local157] != null) {
					local192 = Static84.anIntArray167[local157];
				}
				anIntArray239[anInt2375++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static257.aClass128_18 == null) {
					anIntArray239[anInt2375++] = -1;
					return;
				}
				anIntArray239[anInt2375++] = Static257.aClass128_18.anInt3174;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021) {
				local75 = aStringArray17[--anInt2371];
				method2004(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt2371 -= 2;
				local75 = aStringArray17[anInt2371];
				local81 = aStringArray17[anInt2371 + 1];
				if (Static315.anInt5429 != 0 || (!Static246.aBoolean345 || Static345.aBoolean446) && !Static348.aBoolean347) {
					Static229.method3783(Static275.aClass244_64);
					Static23.aClass3_Sub5_Sub1_1.method2791(0);
					local89 = Static23.aClass3_Sub5_Sub1_1.anInt3121;
					Static23.aClass3_Sub5_Sub1_1.method2768(local75);
					Static322.method5670(Static23.aClass3_Sub5_Sub1_1, local81);
					Static23.aClass3_Sub5_Sub1_1.method2771(Static23.aClass3_Sub5_Sub1_1.anInt3121 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray239[--anInt2375];
				local81 = null;
				if (local157 < 100) {
					local81 = Static69.aStringArray7[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray17[anInt2371++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray239[--anInt2375];
				local81 = null;
				if (local157 < 100) {
					local81 = Static329.aStringArray38[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray17[anInt2371++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray239[--anInt2375];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static304.anIntArray360[local157];
				}
				anIntArray239[anInt2375++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static226.aClass28_Sub1_Sub1_Sub2_2 == null || Static226.aClass28_Sub1_Sub1_Sub2_2.aString50 == null) {
					local75 = Static27.aString6;
				} else {
					local75 = Static226.aClass28_Sub1_Sub1_Sub2_2.method4031();
				}
				aStringArray17[anInt2371++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray239[anInt2375++] = Static257.anInt4619;
				return;
			}
			if (arg0 == 5017) {
				anIntArray239[anInt2375++] = Static30.anInt547;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray239[--anInt2375];
				local192 = 0;
				if (local157 < 100 && Static179.aStringArray24[local157] != null) {
					local192 = Static84.anIntArray167[local157];
				}
				anIntArray239[anInt2375++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray239[--anInt2375];
				local81 = null;
				if (local157 < 100) {
					local81 = Static261.aStringArray31[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray17[anInt2371++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static226.aClass28_Sub1_Sub1_Sub2_2 == null || Static226.aClass28_Sub1_Sub1_Sub2_2.aString50 == null) {
					local75 = Static27.aString6;
				} else {
					local75 = Static226.aClass28_Sub1_Sub1_Sub2_2.method4020();
				}
				aStringArray17[anInt2371++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray239[--anInt2375];
				aStringArray17[anInt2371++] = Static251.method4079(local157).aString39;
				return;
			}
			@Pc(584) Class3_Sub7_Sub9 local584;
			if (arg0 == 5051) {
				local157 = anIntArray239[--anInt2375];
				local584 = Static251.method4079(local157);
				if (local584.anIntArray411 == null) {
					anIntArray239[anInt2375++] = 0;
					return;
				}
				anIntArray239[anInt2375++] = local584.anIntArray411.length;
				return;
			}
			if (arg0 == 5052) {
				anInt2375 -= 2;
				local157 = anIntArray239[anInt2375];
				local192 = anIntArray239[anInt2375 + 1];
				@Pc(628) Class3_Sub7_Sub9 local628 = Static251.method4079(local157);
				local95 = local628.anIntArray411[local192];
				anIntArray239[anInt2375++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray239[--anInt2375];
				local584 = Static251.method4079(local157);
				if (local584.anIntArray412 == null) {
					anIntArray239[anInt2375++] = 0;
					return;
				}
				anIntArray239[anInt2375++] = local584.anIntArray412.length;
				return;
			}
			if (arg0 == 5054) {
				anInt2375 -= 2;
				local157 = anIntArray239[anInt2375];
				local192 = anIntArray239[anInt2375 + 1];
				anIntArray239[anInt2375++] = Static251.method4079(local157).anIntArray412[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray239[--anInt2375];
				aStringArray17[anInt2371++] = Static222.method3706(local157).method1635();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray239[--anInt2375];
				@Pc(750) Class3_Sub7_Sub5 local750 = Static222.method3706(local157);
				if (local750.anIntArray197 == null) {
					anIntArray239[anInt2375++] = 0;
					return;
				}
				anIntArray239[anInt2375++] = local750.anIntArray197.length;
				return;
			}
			if (arg0 == 5057) {
				anInt2375 -= 2;
				local157 = anIntArray239[anInt2375];
				local192 = anIntArray239[anInt2375 + 1];
				anIntArray239[anInt2375++] = Static222.method3706(local157).anIntArray197[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass216_1 = new Class216();
				aClass216_1.anInt5450 = anIntArray239[--anInt2375];
				aClass216_1.aClass3_Sub7_Sub5_1 = Static222.method3706(aClass216_1.anInt5450);
				aClass216_1.anIntArray596 = new int[aClass216_1.aClass3_Sub7_Sub5_1.method1638()];
				return;
			}
			if (arg0 == 5059) {
				Static229.method3783(Static155.aClass244_41);
				Static23.aClass3_Sub5_Sub1_1.method2791(0);
				local157 = Static23.aClass3_Sub5_Sub1_1.anInt3121;
				Static23.aClass3_Sub5_Sub1_1.method2791(0);
				Static23.aClass3_Sub5_Sub1_1.method2749(aClass216_1.anInt5450);
				aClass216_1.aClass3_Sub7_Sub5_1.method1630(Static23.aClass3_Sub5_Sub1_1, aClass216_1.anIntArray596);
				Static23.aClass3_Sub5_Sub1_1.method2771(Static23.aClass3_Sub5_Sub1_1.anInt3121 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray17[--anInt2371];
				Static229.method3783(Static295.aClass244_71);
				Static23.aClass3_Sub5_Sub1_1.method2791(0);
				local192 = Static23.aClass3_Sub5_Sub1_1.anInt3121;
				Static23.aClass3_Sub5_Sub1_1.method2768(local75);
				Static23.aClass3_Sub5_Sub1_1.method2749(aClass216_1.anInt5450);
				aClass216_1.aClass3_Sub7_Sub5_1.method1630(Static23.aClass3_Sub5_Sub1_1, aClass216_1.anIntArray596);
				Static23.aClass3_Sub5_Sub1_1.method2771(Static23.aClass3_Sub5_Sub1_1.anInt3121 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static229.method3783(Static155.aClass244_41);
				Static23.aClass3_Sub5_Sub1_1.method2791(0);
				local157 = Static23.aClass3_Sub5_Sub1_1.anInt3121;
				Static23.aClass3_Sub5_Sub1_1.method2791(1);
				Static23.aClass3_Sub5_Sub1_1.method2749(aClass216_1.anInt5450);
				aClass216_1.aClass3_Sub7_Sub5_1.method1630(Static23.aClass3_Sub5_Sub1_1, aClass216_1.anIntArray596);
				Static23.aClass3_Sub5_Sub1_1.method2771(Static23.aClass3_Sub5_Sub1_1.anInt3121 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt2375 -= 2;
				local157 = anIntArray239[anInt2375];
				local192 = anIntArray239[anInt2375 + 1];
				anIntArray239[anInt2375++] = Static251.method4079(local157).aCharArray8[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt2375 -= 2;
				local157 = anIntArray239[anInt2375];
				local192 = anIntArray239[anInt2375 + 1];
				anIntArray239[anInt2375++] = Static251.method4079(local157).aCharArray9[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt2375 -= 2;
				local157 = anIntArray239[anInt2375];
				local192 = anIntArray239[anInt2375 + 1];
				if (local192 == -1) {
					anIntArray239[anInt2375++] = -1;
					return;
				}
				anIntArray239[anInt2375++] = Static251.method4079(local157).method3323((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt2375 -= 2;
				local157 = anIntArray239[anInt2375];
				local192 = anIntArray239[anInt2375 + 1];
				if (local192 == -1) {
					anIntArray239[anInt2375++] = -1;
					return;
				}
				anIntArray239[anInt2375++] = Static251.method4079(local157).method3318((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray239[--anInt2375];
				anIntArray239[anInt2375++] = Static222.method3706(local157).method1638();
				return;
			}
			if (arg0 == 5067) {
				anInt2375 -= 2;
				local157 = anIntArray239[anInt2375];
				local192 = anIntArray239[anInt2375 + 1];
				local89 = Static222.method3706(local157).method1632(local192);
				anIntArray239[anInt2375++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt2375 -= 2;
				local157 = anIntArray239[anInt2375];
				local192 = anIntArray239[anInt2375 + 1];
				aClass216_1.anIntArray596[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt2375 -= 2;
				local157 = anIntArray239[anInt2375];
				local192 = anIntArray239[anInt2375 + 1];
				aClass216_1.anIntArray596[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt2375 -= 3;
				local157 = anIntArray239[anInt2375];
				local192 = anIntArray239[anInt2375 + 1];
				local89 = anIntArray239[anInt2375 + 2];
				@Pc(1245) Class3_Sub7_Sub5 local1245 = Static222.method3706(local157);
				if (local1245.method1632(local192) != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray239[anInt2375++] = local1245.method1634(local192, local89);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray17[--anInt2371];
				local1292 = anIntArray239[--anInt2375] == 1;
				Static342.method5175(local75, local1292);
				anIntArray239[anInt2375++] = Static189.anInt3424;
				return;
			}
			if (arg0 == 5072) {
				if (Static127.aShortArray44 != null && Static290.anInt5036 < Static189.anInt3424) {
					anIntArray239[anInt2375++] = Static127.aShortArray44[Static290.anInt5036++] & 0xFFFF;
					return;
				}
				anIntArray239[anInt2375++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static290.anInt5036 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static322.aClass89_25.method1847(86)) {
					anIntArray239[anInt2375++] = 1;
					return;
				}
				anIntArray239[anInt2375++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static322.aClass89_25.method1847(82)) {
					anIntArray239[anInt2375++] = 1;
					return;
				}
				anIntArray239[anInt2375++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static322.aClass89_25.method1847(81)) {
					anIntArray239[anInt2375++] = 1;
					return;
				}
				anIntArray239[anInt2375++] = 0;
				return;
			}
		} else {
			@Pc(1903) boolean local1903;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static262.method1042(anIntArray239[--anInt2375]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray239[anInt2375++] = Static341.method5163();
					return;
				}
				if (arg0 == 5205) {
					Static221.method3684(anIntArray239[--anInt2375], -1, false, -1);
					return;
				}
				@Pc(1492) Class3_Sub7_Sub16 local1492;
				if (arg0 == 5206) {
					local157 = anIntArray239[--anInt2375];
					local1492 = Static42.method460(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1492 == null) {
						anIntArray239[anInt2375++] = -1;
						return;
					}
					anIntArray239[anInt2375++] = local1492.anInt6373;
					return;
				}
				@Pc(1525) Class3_Sub7_Sub16 local1525;
				if (arg0 == 5207) {
					local1525 = Static42.method469(anIntArray239[--anInt2375]);
					if (local1525 != null && local1525.aString65 != null) {
						aStringArray17[anInt2371++] = local1525.aString65;
						return;
					}
					aStringArray17[anInt2371++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray239[anInt2375++] = Static252.anInt4549;
					anIntArray239[anInt2375++] = Static325.anInt5542;
					return;
				}
				if (arg0 == 5209) {
					anIntArray239[anInt2375++] = Static325.anInt5538 + Static42.anInt542;
					anIntArray239[anInt2375++] = Static257.anInt4618 + Static42.anInt534;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray239[--anInt2375];
					local1492 = Static42.method469(local157);
					if (local1492 == null) {
						anIntArray239[anInt2375++] = 0;
						anIntArray239[anInt2375++] = 0;
						return;
					}
					anIntArray239[anInt2375++] = local1492.anInt6364 >> 14 & 0x3FFF;
					anIntArray239[anInt2375++] = local1492.anInt6364 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray239[--anInt2375];
					local1492 = Static42.method469(local157);
					if (local1492 == null) {
						anIntArray239[anInt2375++] = 0;
						anIntArray239[anInt2375++] = 0;
						return;
					}
					anIntArray239[anInt2375++] = local1492.anInt6359 - local1492.anInt6361;
					anIntArray239[anInt2375++] = local1492.anInt6360 - local1492.anInt6367;
					return;
				}
				@Pc(1715) Class3_Sub41 local1715;
				if (arg0 == 5212) {
					local1715 = Static345.method5227();
					if (local1715 == null) {
						anIntArray239[anInt2375++] = -1;
						anIntArray239[anInt2375++] = -1;
						return;
					}
					anIntArray239[anInt2375++] = local1715.anInt6279;
					local192 = local1715.anInt6278 << 28 | local1715.anInt6276 + Static42.anInt542 << 14 | local1715.anInt6277 + Static42.anInt534;
					anIntArray239[anInt2375++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1715 = Static209.method3227();
					if (local1715 == null) {
						anIntArray239[anInt2375++] = -1;
						anIntArray239[anInt2375++] = -1;
						return;
					}
					anIntArray239[anInt2375++] = local1715.anInt6279;
					local192 = local1715.anInt6278 << 28 | local1715.anInt6276 + Static42.anInt542 << 14 | local1715.anInt6277 + Static42.anInt534;
					anIntArray239[anInt2375++] = local192;
					return;
				}
				@Pc(1863) boolean local1863;
				if (arg0 == 5214) {
					local157 = anIntArray239[--anInt2375];
					local1492 = Static6.method92();
					if (local1492 != null) {
						local1863 = local1492.method5629(anIntArray242, local157 & 0x3FFF, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3);
						if (local1863) {
							Static89.method5438(anIntArray242[2], anIntArray242[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt2375 -= 2;
					local157 = anIntArray239[anInt2375];
					local192 = anIntArray239[anInt2375 + 1];
					@Pc(1901) Class162 local1901 = Static42.method466(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1903 = false;
					for (@Pc(1908) Class3_Sub7_Sub16 local1908 = (Class3_Sub7_Sub16) local1901.method3734(); local1908 != null; local1908 = (Class3_Sub7_Sub16) local1901.method3730()) {
						if (local1908.anInt6373 == local192) {
							local1903 = true;
							break;
						}
					}
					if (local1903) {
						anIntArray239[anInt2375++] = 1;
						return;
					}
					anIntArray239[anInt2375++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray239[--anInt2375];
					local1492 = Static42.method469(local157);
					if (local1492 == null) {
						anIntArray239[anInt2375++] = -1;
						return;
					}
					anIntArray239[anInt2375++] = local1492.anInt6362;
					return;
				}
				if (arg0 == 5220) {
					anIntArray239[anInt2375++] = Static130.anInt2452 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray239[--anInt2375];
					Static89.method5438(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1525 = Static6.method92();
					if (local1525 != null) {
						local1292 = local1525.method5628(anIntArray242, Static325.anInt5538 + Static42.anInt542, Static257.anInt4618 + Static42.anInt534);
						if (local1292) {
							anIntArray239[anInt2375++] = anIntArray242[1];
							anIntArray239[anInt2375++] = anIntArray242[2];
							return;
						}
						anIntArray239[anInt2375++] = -1;
						anIntArray239[anInt2375++] = -1;
						return;
					}
					anIntArray239[anInt2375++] = -1;
					anIntArray239[anInt2375++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt2375 -= 2;
					local157 = anIntArray239[anInt2375];
					local192 = anIntArray239[anInt2375 + 1];
					Static221.method3684(local157, local192 & 0x3FFF, false, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray239[--anInt2375];
					local1492 = Static6.method92();
					if (local1492 != null) {
						local1863 = local1492.method5629(anIntArray242, local157 & 0x3FFF, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3);
						if (local1863) {
							anIntArray239[anInt2375++] = anIntArray242[1];
							anIntArray239[anInt2375++] = anIntArray242[2];
							return;
						}
						anIntArray239[anInt2375++] = -1;
						anIntArray239[anInt2375++] = -1;
						return;
					}
					anIntArray239[anInt2375++] = -1;
					anIntArray239[anInt2375++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray239[--anInt2375];
					local1492 = Static6.method92();
					if (local1492 != null) {
						local1863 = local1492.method5628(anIntArray242, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1863) {
							anIntArray239[anInt2375++] = anIntArray242[1];
							anIntArray239[anInt2375++] = anIntArray242[2];
							return;
						}
						anIntArray239[anInt2375++] = -1;
						anIntArray239[anInt2375++] = -1;
						return;
					}
					anIntArray239[anInt2375++] = -1;
					anIntArray239[anInt2375++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static210.method3278(anIntArray239[--anInt2375]);
					return;
				}
				if (arg0 == 5227) {
					anInt2375 -= 2;
					local157 = anIntArray239[anInt2375];
					local192 = anIntArray239[anInt2375 + 1];
					Static221.method3684(local157, local192 & 0x3FFF, true, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static214.aBoolean272 = anIntArray239[--anInt2375] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray239[anInt2375++] = Static214.aBoolean272 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray239[--anInt2375];
					Static67.method1154(local157);
					return;
				}
				@Pc(2421) Class3 local2421;
				if (arg0 == 5231) {
					anInt2375 -= 2;
					local157 = anIntArray239[anInt2375];
					local1292 = anIntArray239[anInt2375 + 1] == 1;
					if (Static25.aClass44_5 != null) {
						local2421 = Static25.aClass44_5.method942((long) local157);
						if (local2421 != null && !local1292) {
							local2421.method5700();
							return;
						}
						if (local2421 == null && local1292) {
							local2421 = new Class3();
							Static25.aClass44_5.method948((long) local157, local2421);
						}
					}
					return;
				}
				@Pc(2463) Class3 local2463;
				if (arg0 == 5232) {
					local157 = anIntArray239[--anInt2375];
					if (Static25.aClass44_5 != null) {
						local2463 = Static25.aClass44_5.method942((long) local157);
						anIntArray239[anInt2375++] = local2463 == null ? 0 : 1;
						return;
					}
					anIntArray239[anInt2375++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt2375 -= 2;
					local157 = anIntArray239[anInt2375];
					local1292 = anIntArray239[anInt2375 + 1] == 1;
					if (Static20.aClass44_3 != null) {
						local2421 = Static20.aClass44_3.method942((long) local157);
						if (local2421 != null && !local1292) {
							local2421.method5700();
							return;
						}
						if (local2421 == null && local1292) {
							local2421 = new Class3();
							Static20.aClass44_3.method948((long) local157, local2421);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray239[--anInt2375];
					if (Static20.aClass44_3 != null) {
						local2463 = Static20.aClass44_3.method942((long) local157);
						anIntArray239[anInt2375++] = local2463 == null ? 0 : 1;
						return;
					}
					anIntArray239[anInt2375++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray239[anInt2375++] = Static42.aClass3_Sub7_Sub16_2 == null ? -1 : Static42.aClass3_Sub7_Sub16_2.anInt6373;
					return;
				}
			} else {
				@Pc(2717) int local2717;
				if (arg0 < 5400) {
					if (arg0 == 5300) {
						anInt2375 -= 2;
						local157 = anIntArray239[anInt2375];
						local192 = anIntArray239[anInt2375 + 1];
						Static175.method2696(3, local192, false, local157);
						anIntArray239[anInt2375++] = Static225.aFrame2 == null ? 0 : 1;
						return;
					}
					if (arg0 == 5301) {
						if (Static225.aFrame2 != null) {
							Static175.method2696(Static164.aClass154_Sub1_1.anInt6068, -1, false, -1);
						}
						return;
					}
					if (arg0 == 5302) {
						@Pc(2654) Class5[] local2654 = Static347.method5257();
						anIntArray239[anInt2375++] = local2654.length;
						return;
					}
					if (arg0 == 5303) {
						local157 = anIntArray239[--anInt2375];
						@Pc(2678) Class5[] local2678 = Static347.method5257();
						anIntArray239[anInt2375++] = local2678[local157].anInt115;
						anIntArray239[anInt2375++] = local2678[local157].anInt116;
						return;
					}
					if (arg0 == 5305) {
						local157 = Static164.aClass154_Sub1_1.anInt6067;
						local192 = Static164.aClass154_Sub1_1.anInt6062;
						local89 = -1;
						@Pc(2715) Class5[] local2715 = Static347.method5257();
						for (local2717 = 0; local2717 < local2715.length; local2717++) {
							@Pc(2722) Class5 local2722 = local2715[local2717];
							if (local2722.anInt115 == local157 && local2722.anInt116 == local192) {
								local89 = local2717;
								break;
							}
						}
						anIntArray239[anInt2375++] = local89;
						return;
					}
					if (arg0 == 5306) {
						anIntArray239[anInt2375++] = Static200.method3135();
						return;
					}
					if (arg0 == 5307) {
						local157 = anIntArray239[--anInt2375];
						if (local157 >= 1 && local157 <= 2) {
							Static175.method2696(local157, -1, false, -1);
							return;
						}
						return;
					}
					if (arg0 == 5308) {
						anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.anInt6068;
						return;
					}
					if (arg0 == 5309) {
						local157 = anIntArray239[--anInt2375];
						if (local157 >= 1 && local157 <= 2) {
							Static164.aClass154_Sub1_1.anInt6068 = local157;
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							return;
						}
						return;
					}
				} else {
					@Pc(3230) String local3230;
					if (arg0 < 5500) {
						if (arg0 == 5400) {
							anInt2371 -= 2;
							local75 = aStringArray17[anInt2371];
							local81 = aStringArray17[anInt2371 + 1];
							local89 = anIntArray239[--anInt2375];
							Static229.method3783(Static139.aClass244_39);
							Static23.aClass3_Sub5_Sub1_1.method2791(Static269.method4260(local75) + Static269.method4260(local81) + 1);
							Static23.aClass3_Sub5_Sub1_1.method2768(local75);
							Static23.aClass3_Sub5_Sub1_1.method2768(local81);
							Static23.aClass3_Sub5_Sub1_1.method2791(local89);
							return;
						}
						if (arg0 == 5401) {
							anInt2375 -= 2;
							Static66.aShortArray29[anIntArray239[anInt2375]] = (short) Static37.method611(anIntArray239[anInt2375 + 1]);
							Static176.aClass78_3.method1651();
							Static176.aClass78_3.method1645();
							Static90.aClass83_2.method1720();
							Static71.method1197();
							return;
						}
						if (arg0 == 5405) {
							anInt2375 -= 2;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							if (local157 >= 0 && local157 < 2) {
								Static207.anIntArrayArrayArray11[local157] = new int[local192 << 1][4];
							}
							return;
						}
						if (arg0 == 5406) {
							anInt2375 -= 7;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1] << 1;
							local89 = anIntArray239[anInt2375 + 2];
							local95 = anIntArray239[anInt2375 + 3];
							local2717 = anIntArray239[anInt2375 + 4];
							@Pc(2990) int local2990 = anIntArray239[anInt2375 + 5];
							@Pc(2996) int local2996 = anIntArray239[anInt2375 + 6];
							if (local157 >= 0 && local157 < 2 && Static207.anIntArrayArrayArray11[local157] != null && local192 >= 0 && local192 < Static207.anIntArrayArrayArray11[local157].length) {
								Static207.anIntArrayArrayArray11[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) * 128, local95, (local89 & 0x3FFF) * 128, local2996 };
								Static207.anIntArrayArrayArray11[local157][local192 + 1] = new int[] { (local2717 >> 14 & 0x3FFF) * 128, local2990, (local2717 & 0x3FFF) * 128 };
							}
							return;
						}
						if (arg0 == 5407) {
							local157 = Static207.anIntArrayArrayArray11[anIntArray239[--anInt2375]].length >> 1;
							anIntArray239[anInt2375++] = local157;
							return;
						}
						if (arg0 == 5411) {
							if (Static225.aFrame2 != null) {
								Static175.method2696(Static164.aClass154_Sub1_1.anInt6068, -1, false, -1);
							}
							if (Static34.aFrame1 != null) {
								Static314.method4813();
								System.exit(0);
								return;
							}
							local75 = Static14.aString1 == null ? Static346.method5252() : Static14.aString1;
							Static164.method2516(false, Static2.anInt68 == 1, Static61.aClass156_1, local75);
							return;
						}
						if (arg0 == 5419) {
							local75 = "";
							if (Static77.aClass133_2 != null) {
								if (Static77.aClass133_2.anObject3 == null) {
									local75 = Static321.method2985(Static77.aClass133_2.anInt3258);
								} else {
									local75 = (String) Static77.aClass133_2.anObject3;
								}
							}
							aStringArray17[anInt2371++] = local75;
							return;
						}
						if (arg0 == 5420) {
							anIntArray239[anInt2375++] = Static218.anInt3887 == 3 ? 1 : 0;
							return;
						}
						if (arg0 == 5421) {
							if (Static225.aFrame2 != null) {
								Static175.method2696(Static164.aClass154_Sub1_1.anInt6068, -1, false, -1);
							}
							local75 = aStringArray17[--anInt2371];
							local1292 = anIntArray239[--anInt2375] == 1;
							local3230 = Static346.method5252() + local75;
							Static164.method2516(local1292, Static2.anInt68 == 1, Static61.aClass156_1, local3230);
							return;
						}
						if (arg0 == 5422) {
							anInt2371 -= 2;
							local75 = aStringArray17[anInt2371];
							local81 = aStringArray17[anInt2371 + 1];
							local89 = anIntArray239[--anInt2375];
							if (local75.length() > 0) {
								if (Static359.aStringArray41 == null) {
									Static359.aStringArray41 = new String[Static165.anIntArray308[Static121.aClass63_2.anInt1618]];
								}
								Static359.aStringArray41[local89] = local75;
							}
							if (local81.length() > 0) {
								if (Static71.aStringArray9 == null) {
									Static71.aStringArray9 = new String[Static165.anIntArray308[Static121.aClass63_2.anInt1618]];
								}
								Static71.aStringArray9[local89] = local81;
							}
							return;
						}
						if (arg0 == 5423) {
							System.out.println(aStringArray17[--anInt2371]);
							return;
						}
						if (arg0 == 5424) {
							anInt2375 -= 11;
							Static254.anInt1039 = anIntArray239[anInt2375];
							Static224.anInt3981 = anIntArray239[anInt2375 + 1];
							Static138.anInt2625 = anIntArray239[anInt2375 + 2];
							Static23.anInt300 = anIntArray239[anInt2375 + 3];
							Static242.anInt4267 = anIntArray239[anInt2375 + 4];
							Static43.anInt776 = anIntArray239[anInt2375 + 5];
							Static390.anInt6094 = anIntArray239[anInt2375 + 6];
							Static187.anInt3395 = anIntArray239[anInt2375 + 7];
							Static119.anInt2255 = anIntArray239[anInt2375 + 8];
							Static220.anInt3913 = anIntArray239[anInt2375 + 9];
							Static233.anInt4155 = anIntArray239[anInt2375 + 10];
							Static77.aClass20_19.method226(Static242.anInt4267);
							Static77.aClass20_19.method226(Static43.anInt776);
							Static77.aClass20_19.method226(Static390.anInt6094);
							Static77.aClass20_19.method226(Static187.anInt3395);
							Static77.aClass20_19.method226(Static119.anInt2255);
							Static276.aClass110_13 = null;
							Static331.aClass110_16 = null;
							Static45.aClass110_1 = null;
							Static285.aClass110_14 = null;
							Static108.aClass110_6 = null;
							Static233.aClass110_9 = null;
							Static180.aClass110_8 = null;
							Static350.aClass110_18 = null;
							Static349.aBoolean449 = true;
							return;
						}
						if (arg0 == 5425) {
							Static304.method2789();
							Static349.aBoolean449 = false;
							return;
						}
						if (arg0 == 5426) {
							anInt2375 -= 2;
							Static93.anInt1914 = anIntArray239[anInt2375];
							Static30.anInt546 = anIntArray239[anInt2375 + 1];
							return;
						}
						if (arg0 == 5427) {
							anInt2375 -= 2;
							Static185.anInt3278 = anIntArray239[anInt2375 + 1];
							return;
						}
						if (arg0 == 5428) {
							anInt2375 -= 2;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							anIntArray239[anInt2375++] = Static264.method4213(local192, local157) ? 1 : 0;
							return;
						}
						if (arg0 == 5429) {
							Static296.method4571(false, aStringArray17[--anInt2371]);
							return;
						}
					} else if (arg0 < 5600) {
						if (arg0 == 5500) {
							anInt2375 -= 4;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							local89 = anIntArray239[anInt2375 + 2];
							local95 = anIntArray239[anInt2375 + 3];
							Static135.method2132(local192, local89, (local157 >> 14 & 0x3FFF) - Static21.anInt265, false, (local157 & 0x3FFF) - Static103.anInt2044, local95);
							return;
						}
						if (arg0 == 5501) {
							anInt2375 -= 4;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							local89 = anIntArray239[anInt2375 + 2];
							local95 = anIntArray239[anInt2375 + 3];
							Static255.method4138(local192, local95, (local157 & 0x3FFF) - Static103.anInt2044, local89, (local157 >> 14 & 0x3FFF) - Static21.anInt265);
							return;
						}
						if (arg0 == 5502) {
							anInt2375 -= 6;
							local157 = anIntArray239[anInt2375];
							if (local157 >= 2) {
								throw new RuntimeException();
							}
							Static302.anInt5239 = local157;
							local192 = anIntArray239[anInt2375 + 1];
							if (local192 + 1 >= Static207.anIntArrayArrayArray11[Static302.anInt5239].length >> 1) {
								throw new RuntimeException();
							}
							Static286.anInt5989 = local192;
							Static89.anInt6128 = 0;
							Static75.anInt1616 = anIntArray239[anInt2375 + 2];
							Static76.anInt1625 = anIntArray239[anInt2375 + 3];
							local89 = anIntArray239[anInt2375 + 4];
							if (local89 >= 2) {
								throw new RuntimeException();
							}
							Static254.anInt1042 = local89;
							local95 = anIntArray239[anInt2375 + 5];
							if (local95 + 1 >= Static207.anIntArrayArrayArray11[Static254.anInt1042].length >> 1) {
								throw new RuntimeException();
							}
							Static25.anInt339 = local95;
							Static88.anInt1815 = 3;
							return;
						}
						if (arg0 == 5503) {
							Static266.method4234();
							return;
						}
						if (arg0 == 5504) {
							anInt2375 -= 2;
							Static113.method1829(anIntArray239[anInt2375 + 1], anIntArray239[anInt2375]);
							return;
						}
						if (arg0 == 5505) {
							anIntArray239[anInt2375++] = (int) Static279.aFloat67 >> 3;
							return;
						}
						if (arg0 == 5506) {
							anIntArray239[anInt2375++] = (int) Static352.aFloat68 >> 3;
							return;
						}
						if (arg0 == 5507) {
							Static364.method5431();
							return;
						}
						if (arg0 == 5508) {
							Static157.method2412();
							return;
						}
						if (arg0 == 5509) {
							Static67.method1155();
							return;
						}
						if (arg0 == 5510) {
							Static59.method1069();
							return;
						}
						if (arg0 == 5511) {
							local157 = anIntArray239[--anInt2375];
							local192 = local157 >> 14 & 0x3FFF;
							local89 = local157 & 0x3FFF;
							local192 -= Static21.anInt265;
							if (local192 < 0) {
								local192 = 0;
							} else if (local192 >= Static12.anInt161) {
								local192 = Static12.anInt161;
							}
							local89 -= Static103.anInt2044;
							if (local89 < 0) {
								local89 = 0;
							} else if (local89 >= Static44.anInt787) {
								local89 = Static44.anInt787;
							}
							Static71.anInt1429 = local192 * 128 + 64;
							Static268.anInt4726 = local89 * 128 + 64;
							Static88.anInt1815 = 4;
							return;
						}
						if (arg0 == 5512) {
							Static358.method5344();
							return;
						}
					} else if (arg0 < 5700) {
						if (arg0 == 5600) {
							anInt2371 -= 2;
							local75 = aStringArray17[anInt2371];
							local81 = aStringArray17[anInt2371 + 1];
							local89 = anIntArray239[--anInt2375];
							if (Static348.anInt4439 != 10) {
								return;
							}
							if (Static329.anInt5569 == 0 && Static193.anInt3497 == 0 && Static270.anInt5905 == 0 && Static255.anInt4584 == 0) {
								Static119.method1901(local89, local75, local81);
								return;
							}
							return;
						}
						if (arg0 == 5601) {
							Static261.method4208();
							return;
						}
						if (arg0 == 5602) {
							if (Static193.anInt3497 == 0) {
								Static158.anInt2849 = -2;
							}
							return;
						}
						if (arg0 == 5603) {
							anInt2375 -= 4;
							if (Static348.anInt4439 != 10) {
								return;
							}
							if (Static329.anInt5569 == 0 && Static193.anInt3497 == 0 && Static270.anInt5905 == 0 && Static255.anInt4584 == 0) {
								Static201.method3146(anIntArray239[anInt2375 + 3], anIntArray239[anInt2375], anIntArray239[anInt2375 + 2], anIntArray239[anInt2375 + 1]);
								return;
							}
							return;
						}
						if (arg0 == 5604) {
							anInt2371--;
							if (Static348.anInt4439 != 10) {
								return;
							}
							if (Static329.anInt5569 == 0 && Static193.anInt3497 == 0 && Static270.anInt5905 == 0 && Static255.anInt4584 == 0) {
								Static54.method991(Static21.method260(aStringArray17[anInt2371]));
								return;
							}
							return;
						}
						if (arg0 == 5605) {
							anInt2371 -= 3;
							anInt2375 -= 7;
							if (Static348.anInt4439 != 10) {
								return;
							}
							if (Static329.anInt5569 == 0 && Static193.anInt3497 == 0 && Static270.anInt5905 == 0 && Static255.anInt4584 == 0) {
								Static48.method921(aStringArray17[anInt2371 + 1], anIntArray239[anInt2375 + 2], Static21.method260(aStringArray17[anInt2371]), anIntArray239[anInt2375 + 4] == 1, anIntArray239[anInt2375 + 5] == 1, anIntArray239[anInt2375], aStringArray17[anInt2371 + 2], anIntArray239[anInt2375 + 1], anIntArray239[anInt2375 + 6] == 1, anIntArray239[anInt2375 + 3]);
								return;
							}
							return;
						}
						if (arg0 == 5606) {
							if (Static270.anInt5905 == 0) {
								Static116.anInt2222 = -2;
							}
							return;
						}
						if (arg0 == 5607) {
							anIntArray239[anInt2375++] = Static158.anInt2849;
							return;
						}
						if (arg0 == 5608) {
							anIntArray239[anInt2375++] = Static294.anInt5085;
							return;
						}
						if (arg0 == 5609) {
							anIntArray239[anInt2375++] = Static116.anInt2222;
							return;
						}
						if (arg0 == 5610) {
							for (local157 = 0; local157 < 5; local157++) {
								aStringArray17[anInt2371++] = Static351.aStringArray25.length > local157 ? Static238.method3917(Static351.aStringArray25[local157]) : "";
							}
							Static351.aStringArray25 = null;
							return;
						}
						if (arg0 == 5611) {
							anIntArray239[anInt2375++] = Static355.anInt5982;
							return;
						}
					} else if (arg0 < 6100) {
						if (arg0 == 6001) {
							local157 = anIntArray239[--anInt2375];
							if (local157 < 1) {
								local157 = 1;
							}
							if (local157 > 4) {
								local157 = 4;
							}
							Static164.aClass154_Sub1_1.anInt6069 = local157;
							Static151.method2380();
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6002) {
							Static164.aClass154_Sub1_1.method5401(anIntArray239[--anInt2375] == 1);
							Static151.method2380();
							Static326.method5013();
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6003) {
							Static164.aClass154_Sub1_1.aBoolean473 = anIntArray239[--anInt2375] == 1;
							Static326.method5013();
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6005) {
							Static164.aClass154_Sub1_1.aBoolean475 = anIntArray239[--anInt2375] == 1;
							Static151.method2380();
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6006) {
							Static164.aClass154_Sub1_1.aBoolean461 = anIntArray239[--anInt2375] == 1;
							Static347.aClass155_9.method4917(!Static164.aClass154_Sub1_1.aBoolean461);
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6007) {
							Static164.aClass154_Sub1_1.anInt6056 = anIntArray239[--anInt2375];
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6008) {
							Static164.aClass154_Sub1_1.aBoolean467 = anIntArray239[--anInt2375] == 1;
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6009) {
							Static164.aClass154_Sub1_1.aBoolean464 = anIntArray239[--anInt2375] == 1;
							Static151.method2380();
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6010) {
							Static164.aClass154_Sub1_1.aBoolean474 = anIntArray239[--anInt2375] == 1;
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6011) {
							local157 = anIntArray239[--anInt2375];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							Static164.aClass154_Sub1_1.anInt6057 = local157;
							Static151.method2380();
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6012) {
							Static164.aClass154_Sub1_1.aBoolean463 = anIntArray239[--anInt2375] == 1;
							Static182.method2843();
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6014) {
							Static164.aClass154_Sub1_1.aBoolean471 = anIntArray239[--anInt2375] == 1;
							Static151.method2380();
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6015) {
							Static164.aClass154_Sub1_1.aBoolean459 = anIntArray239[--anInt2375] == 1;
							Static151.method2380();
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6016) {
							local157 = anIntArray239[--anInt2375];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							Static164.aClass154_Sub1_1.anInt6058 = local157;
							Static204.method4472();
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							return;
						}
						if (arg0 == 6017) {
							Static164.aClass154_Sub1_1.aBoolean462 = anIntArray239[--anInt2375] == 1;
							Static142.method2269();
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6018) {
							local157 = anIntArray239[--anInt2375];
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 127) {
								local157 = 127;
							}
							Static164.aClass154_Sub1_1.anInt6066 = local157;
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6019) {
							local157 = anIntArray239[--anInt2375];
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 255) {
								local157 = 255;
							}
							if (local157 != Static164.aClass154_Sub1_1.anInt6064) {
								if (Static164.aClass154_Sub1_1.anInt6064 == 0 && Static4.anInt110 != -1) {
									Static323.method4975(local157, Static103.aClass20_26, Static4.anInt110);
									Static298.aBoolean402 = false;
								} else if (local157 == 0) {
									Static303.method4698();
									Static298.aBoolean402 = false;
								} else {
									Static276.method4308(local157);
								}
								Static164.aClass154_Sub1_1.anInt6064 = local157;
							}
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6020) {
							local157 = anIntArray239[--anInt2375];
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 127) {
								local157 = 127;
							}
							Static164.aClass154_Sub1_1.anInt6055 = local157;
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6021) {
							Static164.aClass154_Sub1_1.aBoolean477 = anIntArray239[--anInt2375] == 1;
							Static326.method5013();
							return;
						}
						if (arg0 == 6023) {
							local157 = anIntArray239[--anInt2375];
							local1292 = false;
							if (local157 < 0) {
								local157 = 0;
							}
							if (local157 > 2) {
								local157 = 2;
							}
							if (Static368.anInt6173 < 96) {
								local157 = 0;
								local1292 = true;
							}
							Static139.method2215(local157);
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							anIntArray239[anInt2375++] = local1292 ? 0 : 1;
							return;
						}
						if (arg0 == 6024) {
							local157 = anIntArray239[--anInt2375];
							if (local157 < 0 || local157 > 2) {
								local157 = 0;
							}
							Static164.aClass154_Sub1_1.anInt6059 = local157;
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							return;
						}
						if (arg0 == 6025) {
							local157 = anIntArray239[--anInt2375];
							if (local157 < 0 || local157 > Static276.method4310(Static368.anInt6173)) {
								local157 = 0;
							}
							Static164.aClass154_Sub1_1.anInt6063 = local157;
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6027) {
							local157 = anIntArray239[--anInt2375];
							if (local157 < 0 || local157 > 1) {
								local157 = 0;
							}
							Static266.method4236(local157 == 1);
							return;
						}
						if (arg0 == 6028) {
							Static164.aClass154_Sub1_1.aBoolean470 = anIntArray239[--anInt2375] != 0;
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							return;
						}
						if (arg0 == 6029) {
							Static164.aClass154_Sub1_1.anInt6056 = anIntArray239[--anInt2375];
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							return;
						}
						if (arg0 == 6030) {
							Static164.aClass154_Sub1_1.aBoolean460 = anIntArray239[--anInt2375] != 0;
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static151.method2380();
							return;
						}
						if (arg0 == 6031) {
							local157 = anIntArray239[--anInt2375];
							if (local157 < 0 || local157 > 3) {
								local157 = 2;
							}
							Static186.method2929(local157);
							return;
						}
						if (arg0 == 6032) {
							local157 = anIntArray239[--anInt2375];
							if (local157 < 0 || local157 > 3) {
								local157 = 2;
							}
							Static164.aClass154_Sub1_1.anInt6060 = local157;
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							Static47.aBoolean45 = false;
							return;
						}
						if (arg0 == 6033) {
							local157 = anIntArray239[--anInt2375];
							if (local157 < 0 || local157 > 4) {
								local157 = 2;
							}
							Static164.aClass154_Sub1_1.anInt6061 = local157;
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							return;
						}
						if (arg0 == 6035) {
							Static164.aClass154_Sub1_1.aBoolean476 = anIntArray239[--anInt2375] == 1;
							Static151.method2380();
							Static326.method5013();
							return;
						}
					} else if (arg0 < 6200) {
						if (arg0 == 6101) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.anInt6069;
							return;
						}
						if (arg0 == 6102) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.method5397(Static2.anInt68) ? 1 : 0;
							return;
						}
						if (arg0 == 6103) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.aBoolean473 ? 1 : 0;
							return;
						}
						if (arg0 == 6105) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.aBoolean475 ? 1 : 0;
							return;
						}
						if (arg0 == 6106) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.aBoolean461 ? 1 : 0;
							return;
						}
						if (arg0 == 6107) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.anInt6056;
							return;
						}
						if (arg0 == 6108) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.aBoolean467 ? 1 : 0;
							return;
						}
						if (arg0 == 6109) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.aBoolean464 ? 1 : 0;
							return;
						}
						if (arg0 == 6110) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.aBoolean474 ? 1 : 0;
							return;
						}
						if (arg0 == 6111) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.anInt6057;
							return;
						}
						if (arg0 == 6112) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.aBoolean463 ? 1 : 0;
							return;
						}
						if (arg0 == 6114) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.aBoolean471 ? 1 : 0;
							return;
						}
						if (arg0 == 6115) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.aBoolean459 ? 1 : 0;
							return;
						}
						if (arg0 == 6116) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.anInt6058;
							return;
						}
						if (arg0 == 6117) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.aBoolean462 ? 1 : 0;
							return;
						}
						if (arg0 == 6118) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.anInt6066;
							return;
						}
						if (arg0 == 6119) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.anInt6064;
							return;
						}
						if (arg0 == 6120) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.anInt6055;
							return;
						}
						if (arg0 == 6121) {
							anIntArray239[anInt2375++] = Static347.aClass155_9.method4924() ? 1 : 0;
							return;
						}
						if (arg0 == 6123) {
							anIntArray239[anInt2375++] = Static287.method4504();
							return;
						}
						if (arg0 == 6124) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.anInt6059;
							return;
						}
						if (arg0 == 6125) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.anInt6063;
							return;
						}
						if (arg0 == 6126) {
							anIntArray239[anInt2375++] = Static347.aClass155_9.method4858() ? 1 : 0;
							return;
						}
						if (arg0 == 6127) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.aBoolean472 ? 1 : 0;
							return;
						}
						if (arg0 == 6128) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.aBoolean470 ? 1 : 0;
							return;
						}
						if (arg0 == 6129) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.anInt6056;
							return;
						}
						if (arg0 == 6130) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.aBoolean460 ? 1 : 0;
							return;
						}
						if (arg0 == 6131) {
							anIntArray239[anInt2375++] = Static2.anInt68;
							return;
						}
						if (arg0 == 6132) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.anInt6060;
							return;
						}
						if (arg0 == 6133) {
							anIntArray239[anInt2375++] = Static218.anInt3887 == 1 || Static218.anInt3887 == 4 ? 1 : 0;
							return;
						}
						if (arg0 == 6134) {
							anIntArray239[anInt2375++] = Static276.method4310(Static368.anInt6173);
							return;
						}
						if (arg0 == 6135) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.anInt6061;
							return;
						}
					} else if (arg0 < 6300) {
						if (arg0 == 6200) {
							anInt2375 -= 2;
							Static29.aShort63 = (short) anIntArray239[anInt2375];
							if (Static29.aShort63 <= 0) {
								Static29.aShort63 = 256;
							}
							Static342.aShort86 = (short) anIntArray239[anInt2375 + 1];
							if (Static342.aShort86 <= 0) {
								Static342.aShort86 = 205;
							}
							return;
						}
						if (arg0 == 6201) {
							anInt2375 -= 2;
							Static316.aShort81 = (short) anIntArray239[anInt2375];
							if (Static316.aShort81 <= 0) {
								Static316.aShort81 = 256;
							}
							Static16.aShort2 = (short) anIntArray239[anInt2375 + 1];
							if (Static16.aShort2 <= 0) {
								Static16.aShort2 = 320;
							}
							return;
						}
						if (arg0 == 6202) {
							anInt2375 -= 4;
							Static13.aShort69 = (short) anIntArray239[anInt2375];
							if (Static13.aShort69 <= 0) {
								Static13.aShort69 = 1;
							}
							Static305.aShort76 = (short) anIntArray239[anInt2375 + 1];
							if (Static305.aShort76 <= 0) {
								Static305.aShort76 = 32767;
							} else if (Static305.aShort76 < Static13.aShort69) {
								Static305.aShort76 = Static13.aShort69;
							}
							Static80.aShort24 = (short) anIntArray239[anInt2375 + 2];
							if (Static80.aShort24 <= 0) {
								Static80.aShort24 = 1;
							}
							Static223.aShort50 = (short) anIntArray239[anInt2375 + 3];
							if (Static223.aShort50 <= 0) {
								Static223.aShort50 = 32767;
								return;
							}
							if (Static223.aShort50 < Static80.aShort24) {
								Static223.aShort50 = Static80.aShort24;
							}
							return;
						}
						if (arg0 == 6203) {
							Static344.method5212(Static141.aClass62_9.anInt1551, 0, 0, false, Static141.aClass62_9.anInt1546);
							anIntArray239[anInt2375++] = Static74.anInt1593;
							anIntArray239[anInt2375++] = Static333.anInt5649;
							return;
						}
						if (arg0 == 6204) {
							anIntArray239[anInt2375++] = Static316.aShort81;
							anIntArray239[anInt2375++] = Static16.aShort2;
							return;
						}
						if (arg0 == 6205) {
							anIntArray239[anInt2375++] = Static29.aShort63;
							anIntArray239[anInt2375++] = Static342.aShort86;
							return;
						}
					} else if (arg0 < 6400) {
						if (arg0 == 6300) {
							anIntArray239[anInt2375++] = (int) (Static288.method4512() / 60000L);
							return;
						}
						if (arg0 == 6301) {
							anIntArray239[anInt2375++] = (int) (Static288.method4512() / 86400000L) - 11745;
							return;
						}
						if (arg0 == 6302) {
							anInt2375 -= 3;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							local89 = anIntArray239[anInt2375 + 2];
							aCalendar1.clear();
							aCalendar1.set(11, 12);
							aCalendar1.set(local89, local192, local157);
							anIntArray239[anInt2375++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
							return;
						}
						if (arg0 == 6303) {
							aCalendar1.clear();
							aCalendar1.setTime(new Date(Static288.method4512()));
							anIntArray239[anInt2375++] = aCalendar1.get(1);
							return;
						}
						if (arg0 == 6304) {
							local157 = anIntArray239[--anInt2375];
							local1292 = true;
							if (local157 < 0) {
								local1292 = (local157 + 1) % 4 == 0;
							} else if (local157 < 1582) {
								local1292 = local157 % 4 == 0;
							} else if (local157 % 4 != 0) {
								local1292 = false;
							} else if (local157 % 100 != 0) {
								local1292 = true;
							} else if (local157 % 400 != 0) {
								local1292 = false;
							}
							anIntArray239[anInt2375++] = local1292 ? 1 : 0;
							return;
						}
					} else if (arg0 < 6500) {
						if (arg0 == 6405) {
							anIntArray239[anInt2375++] = Static330.method5049() ? 1 : 0;
							return;
						}
						if (arg0 == 6406) {
							anIntArray239[anInt2375++] = Static376.method5589() ? 1 : 0;
							return;
						}
					} else if (arg0 < 6600) {
						if (arg0 == 6500) {
							if (Static348.anInt4439 == 10 && Static329.anInt5569 == 0 && Static193.anInt3497 == 0 && Static270.anInt5905 == 0) {
								anIntArray239[anInt2375++] = Static361.method5391() == -1 ? 0 : 1;
								return;
							}
							anIntArray239[anInt2375++] = 1;
							return;
						}
						@Pc(5979) Class129 local5979;
						@Pc(5946) Class23_Sub1 local5946;
						if (arg0 == 6501) {
							local5946 = Static328.method5020();
							if (local5946 != null) {
								anIntArray239[anInt2375++] = local5946.anInt333;
								anIntArray239[anInt2375++] = local5946.anInt319;
								aStringArray17[anInt2371++] = local5946.aString4;
								local5979 = local5946.method310();
								anIntArray239[anInt2375++] = local5979.anInt3176;
								aStringArray17[anInt2371++] = local5979.aString31;
								anIntArray239[anInt2375++] = local5946.anInt329;
								anIntArray239[anInt2375++] = local5946.anInt335;
								return;
							}
							anIntArray239[anInt2375++] = -1;
							anIntArray239[anInt2375++] = 0;
							aStringArray17[anInt2371++] = "";
							anIntArray239[anInt2375++] = 0;
							aStringArray17[anInt2371++] = "";
							anIntArray239[anInt2375++] = 0;
							anIntArray239[anInt2375++] = 0;
							return;
						}
						if (arg0 == 6502) {
							local5946 = Static325.method4997();
							if (local5946 != null) {
								anIntArray239[anInt2375++] = local5946.anInt333;
								anIntArray239[anInt2375++] = local5946.anInt319;
								aStringArray17[anInt2371++] = local5946.aString4;
								local5979 = local5946.method310();
								anIntArray239[anInt2375++] = local5979.anInt3176;
								aStringArray17[anInt2371++] = local5979.aString31;
								anIntArray239[anInt2375++] = local5946.anInt329;
								anIntArray239[anInt2375++] = local5946.anInt335;
								return;
							}
							anIntArray239[anInt2375++] = -1;
							anIntArray239[anInt2375++] = 0;
							aStringArray17[anInt2371++] = "";
							anIntArray239[anInt2375++] = 0;
							aStringArray17[anInt2371++] = "";
							anIntArray239[anInt2375++] = 0;
							anIntArray239[anInt2375++] = 0;
							return;
						}
						if (arg0 == 6503) {
							local157 = anIntArray239[--anInt2375];
							if (Static348.anInt4439 == 10 && Static329.anInt5569 == 0 && Static193.anInt3497 == 0 && Static270.anInt5905 == 0) {
								anIntArray239[anInt2375++] = Static223.method3715(local157) ? 1 : 0;
								return;
							}
							anIntArray239[anInt2375++] = 0;
							return;
						}
						if (arg0 == 6504) {
							Static164.aClass154_Sub1_1.anInt6065 = anIntArray239[--anInt2375];
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							return;
						}
						if (arg0 == 6505) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.anInt6065;
							return;
						}
						if (arg0 == 6506) {
							local157 = anIntArray239[--anInt2375];
							@Pc(6295) Class23_Sub1 local6295 = Static144.method2280(local157);
							if (local6295 != null) {
								anIntArray239[anInt2375++] = local6295.anInt319;
								aStringArray17[anInt2371++] = local6295.aString4;
								@Pc(6319) Class129 local6319 = local6295.method310();
								anIntArray239[anInt2375++] = local6319.anInt3176;
								aStringArray17[anInt2371++] = local6319.aString31;
								anIntArray239[anInt2375++] = local6295.anInt329;
								anIntArray239[anInt2375++] = local6295.anInt335;
								return;
							}
							anIntArray239[anInt2375++] = -1;
							aStringArray17[anInt2371++] = "";
							anIntArray239[anInt2375++] = 0;
							aStringArray17[anInt2371++] = "";
							anIntArray239[anInt2375++] = 0;
							anIntArray239[anInt2375++] = 0;
							return;
						}
						if (arg0 == 6507) {
							anInt2375 -= 4;
							local157 = anIntArray239[anInt2375];
							local1292 = anIntArray239[anInt2375 + 1] == 1;
							local89 = anIntArray239[anInt2375 + 2];
							local1903 = anIntArray239[anInt2375 + 3] == 1;
							Static141.method2245(local89, local1903, local157, local1292);
							return;
						}
						if (arg0 == 6508) {
							Static333.method5077();
							return;
						}
						if (arg0 == 6509) {
							if (Static348.anInt4439 != 10) {
								return;
							}
							Static72.aBoolean104 = anIntArray239[--anInt2375] == 1;
							return;
						}
					} else if (arg0 < 6700) {
						if (arg0 == 6600) {
							Static164.aClass154_Sub1_1.aBoolean466 = anIntArray239[--anInt2375] == 1;
							Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
							return;
						}
						if (arg0 == 6601) {
							anIntArray239[anInt2375++] = Static164.aClass154_Sub1_1.aBoolean466 ? 1 : 0;
							return;
						}
					} else if (arg0 < 6800 && Static270.aClass213_17 == Static136.aClass213_10) {
						if (arg0 == 6700) {
							local157 = Static29.aClass44_26.method943();
							if (Static68.anInt1346 != -1) {
								local157++;
							}
							anIntArray239[anInt2375++] = local157;
							return;
						}
						if (arg0 == 6701) {
							local157 = anIntArray239[--anInt2375];
							if (Static68.anInt1346 != -1) {
								if (local157 == 0) {
									anIntArray239[anInt2375++] = Static68.anInt1346;
									return;
								}
								local157--;
							}
							@Pc(6577) Class3_Sub22 local6577 = (Class3_Sub22) Static29.aClass44_26.method950();
							while (local157-- > 0) {
								local6577 = (Class3_Sub22) Static29.aClass44_26.method949();
							}
							anIntArray239[anInt2375++] = local6577.anInt3029;
							return;
						}
						if (arg0 == 6702) {
							local157 = anIntArray239[--anInt2375];
							if (Static375.aClass62ArrayArray2[local157] == null) {
								aStringArray17[anInt2371++] = "";
								return;
							}
							local81 = Static375.aClass62ArrayArray2[local157][0].aString20;
							if (local81 == null) {
								aStringArray17[anInt2371++] = "";
								return;
							}
							aStringArray17[anInt2371++] = local81.substring(0, local81.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local157 = anIntArray239[--anInt2375];
							if (Static375.aClass62ArrayArray2[local157] == null) {
								anIntArray239[anInt2375++] = 0;
								return;
							}
							anIntArray239[anInt2375++] = Static375.aClass62ArrayArray2[local157].length;
							return;
						}
						if (arg0 == 6704) {
							anInt2375 -= 2;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							if (Static375.aClass62ArrayArray2[local157] == null) {
								aStringArray17[anInt2371++] = "";
								return;
							}
							local3230 = Static375.aClass62ArrayArray2[local157][local192].aString20;
							if (local3230 == null) {
								aStringArray17[anInt2371++] = "";
								return;
							}
							aStringArray17[anInt2371++] = local3230;
							return;
						}
						if (arg0 == 6705) {
							anInt2375 -= 2;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							if (Static375.aClass62ArrayArray2[local157] == null) {
								anIntArray239[anInt2375++] = 0;
								return;
							}
							anIntArray239[anInt2375++] = Static375.aClass62ArrayArray2[local157][local192].anInt1568;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt2375 -= 3;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							local89 = anIntArray239[anInt2375 + 2];
							Static274.method4277("", 1, local89, local157 << 16 | local192);
							return;
						}
						if (arg0 == 6708) {
							anInt2375 -= 3;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							local89 = anIntArray239[anInt2375 + 2];
							Static274.method4277("", 2, local89, local157 << 16 | local192);
							return;
						}
						if (arg0 == 6709) {
							anInt2375 -= 3;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							local89 = anIntArray239[anInt2375 + 2];
							Static274.method4277("", 3, local89, local157 << 16 | local192);
							return;
						}
						if (arg0 == 6710) {
							anInt2375 -= 3;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							local89 = anIntArray239[anInt2375 + 2];
							Static274.method4277("", 4, local89, local157 << 16 | local192);
							return;
						}
						if (arg0 == 6711) {
							anInt2375 -= 3;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							local89 = anIntArray239[anInt2375 + 2];
							Static274.method4277("", 5, local89, local157 << 16 | local192);
							return;
						}
						if (arg0 == 6712) {
							anInt2375 -= 3;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							local89 = anIntArray239[anInt2375 + 2];
							Static274.method4277("", 6, local89, local157 << 16 | local192);
							return;
						}
						if (arg0 == 6713) {
							anInt2375 -= 3;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							local89 = anIntArray239[anInt2375 + 2];
							Static274.method4277("", 7, local89, local157 << 16 | local192);
							return;
						}
						if (arg0 == 6714) {
							anInt2375 -= 3;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							local89 = anIntArray239[anInt2375 + 2];
							Static274.method4277("", 8, local89, local157 << 16 | local192);
							return;
						}
						if (arg0 == 6715) {
							anInt2375 -= 3;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							local89 = anIntArray239[anInt2375 + 2];
							Static274.method4277("", 9, local89, local157 << 16 | local192);
							return;
						}
						if (arg0 == 6716) {
							anInt2375 -= 3;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							local89 = anIntArray239[anInt2375 + 2];
							Static274.method4277("", 10, local89, local157 << 16 | local192);
							return;
						}
						if (arg0 == 6717) {
							anInt2375 -= 3;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							local89 = anIntArray239[anInt2375 + 2];
							@Pc(7165) Class62 local7165 = Static80.method1338(local157 << 16 | local192, local89);
							Static203.method3169();
							@Pc(7170) Class3_Sub42 local7170 = Static48.method915(local7165);
							Static82.method1361(local7165.anInt1519, local7165.anInt1570, local7170.method5603(), local157 << 16 | local192, local89, local7170.anInt6288);
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(7207) Class196 local7207;
						if (arg0 == 6800) {
							local157 = anIntArray239[--anInt2375];
							local7207 = Static326.aClass195_4.method4500(local157);
							if (local7207.aString53 == null) {
								aStringArray17[anInt2371++] = "";
								return;
							}
							aStringArray17[anInt2371++] = local7207.aString53;
							return;
						}
						if (arg0 == 6801) {
							local157 = anIntArray239[--anInt2375];
							local7207 = Static326.aClass195_4.method4500(local157);
							anIntArray239[anInt2375++] = local7207.anInt4994;
							return;
						}
						if (arg0 == 6802) {
							local157 = anIntArray239[--anInt2375];
							local7207 = Static326.aClass195_4.method4500(local157);
							anIntArray239[anInt2375++] = local7207.anInt5011;
							return;
						}
						if (arg0 == 6803) {
							local157 = anIntArray239[--anInt2375];
							local7207 = Static326.aClass195_4.method4500(local157);
							anIntArray239[anInt2375++] = local7207.anInt5001;
							return;
						}
						if (arg0 == 6804) {
							anInt2375 -= 2;
							local157 = anIntArray239[anInt2375];
							local192 = anIntArray239[anInt2375 + 1];
							@Pc(7329) Class104 local7329 = Static255.aClass187_2.method4279(local192);
							if (local7329.method2213()) {
								aStringArray17[anInt2371++] = Static326.aClass195_4.method4500(local157).method4507(local7329.aString25, local192);
								return;
							}
							anIntArray239[anInt2375++] = Static326.aClass195_4.method4500(local157).method4502(local7329.anInt2631, local192);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(IZ)V")
	private static void method1999(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class62 local137;
		@Pc(25) int local25;
		@Pc(35) Class62 local35;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(210) Class62 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt2375 -= 3;
				local13 = anIntArray239[anInt2375];
				local19 = anIntArray239[anInt2375 + 1];
				local25 = anIntArray239[anInt2375 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static115.method1862(local13);
				if (local35.aClass62Array1 == null) {
					local35.aClass62Array1 = new Class62[local25 + 1];
				}
				if (local35.aClass62Array1.length <= local25) {
					@Pc(54) Class62[] local54 = new Class62[local25 + 1];
					for (local56 = 0; local56 < local35.aClass62Array1.length; local56++) {
						local54[local56] = local35.aClass62Array1[local56];
					}
					local35.aClass62Array1 = local54;
				}
				if (local25 > 0 && local35.aClass62Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class62 local99 = new Class62();
				local99.anInt1575 = local19;
				local99.anInt1506 = local99.anInt1500 = local35.anInt1500;
				local99.anInt1510 = local25;
				local35.aClass62Array1[local25] = local99;
				if (arg1) {
					aClass62_7 = local99;
				} else {
					aClass62_8 = local99;
				}
				Static158.method2441(local35);
				return;
			}
			@Pc(158) Class62 local158;
			if (arg0 == 101) {
				local137 = arg1 ? aClass62_7 : aClass62_8;
				if (local137.anInt1510 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static115.method1862(local137.anInt1500);
				local158.aClass62Array1[local137.anInt1510] = null;
				Static158.method2441(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static115.method1862(anIntArray239[--anInt2375]);
				local137.aClass62Array1 = null;
				Static158.method2441(local137);
				return;
			}
			if (arg0 == 200) {
				anInt2375 -= 2;
				local13 = anIntArray239[anInt2375];
				local19 = anIntArray239[anInt2375 + 1];
				local210 = Static80.method1338(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray239[anInt2375++] = 1;
					if (arg1) {
						aClass62_7 = local210;
						return;
					}
					aClass62_8 = local210;
					return;
				}
				anIntArray239[anInt2375++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray239[--anInt2375];
				local158 = Static115.method1862(local13);
				if (local158 != null) {
					anIntArray239[anInt2375++] = 1;
					if (arg1) {
						aClass62_7 = local158;
						return;
					}
					aClass62_8 = local158;
					return;
				}
				anIntArray239[anInt2375++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray239[--anInt2375];
				method2009(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray239[--anInt2375];
				method2002(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt2375 -= 2;
					local13 = anIntArray239[anInt2375];
					local19 = anIntArray239[anInt2375 + 1];
					for (local25 = 0; local25 < Static47.anIntArray89.length; local25++) {
						if (Static47.anIntArray89[local25] == local13) {
							Static226.aClass28_Sub1_Sub1_Sub2_2.aClass49_1.method1003(Static102.aClass223_1, local19, local25);
							return;
						}
					}
					for (local353 = 0; local353 < Static221.anIntArray423.length; local353++) {
						if (Static221.anIntArray423[local353] == local13) {
							Static226.aClass28_Sub1_Sub1_Sub2_2.aClass49_1.method1003(Static102.aClass223_1, local19, local353);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt2375 -= 2;
					local13 = anIntArray239[anInt2375];
					local19 = anIntArray239[anInt2375 + 1];
					Static226.aClass28_Sub1_Sub1_Sub2_2.aClass49_1.method1006(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray239[--anInt2375] != 0;
					Static226.aClass28_Sub1_Sub1_Sub2_2.aClass49_1.method999(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static115.method1862(anIntArray239[--anInt2375]);
					} else {
						local137 = arg1 ? aClass62_7 : aClass62_8;
					}
					if (arg0 == 1100) {
						anInt2375 -= 2;
						local137.anInt1574 = anIntArray239[anInt2375];
						if (local137.anInt1574 > local137.anInt1562 - local137.anInt1546) {
							local137.anInt1574 = local137.anInt1562 - local137.anInt1546;
						}
						if (local137.anInt1574 < 0) {
							local137.anInt1574 = 0;
						}
						local137.anInt1504 = anIntArray239[anInt2375 + 1];
						if (local137.anInt1504 > local137.anInt1537 - local137.anInt1551) {
							local137.anInt1504 = local137.anInt1537 - local137.anInt1551;
						}
						if (local137.anInt1504 < 0) {
							local137.anInt1504 = 0;
						}
						Static158.method2441(local137);
						if (local137.anInt1510 == -1) {
							Static230.method3807(local137.anInt1500);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt1542 = anIntArray239[--anInt2375];
						Static158.method2441(local137);
						if (local137.anInt1510 == -1) {
							Static279.method5260(local137.anInt1500);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean111 = anIntArray239[--anInt2375] == 1;
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt1495 = anIntArray239[--anInt2375];
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt1498 = anIntArray239[--anInt2375];
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray239[--anInt2375];
						if (local137.anInt1526 != local19) {
							local137.anInt1526 = local19;
							Static158.method2441(local137);
						}
						if (local137.anInt1510 == -1) {
							Static345.method5231(local137.anInt1500);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt1530 = anIntArray239[--anInt2375];
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean121 = anIntArray239[--anInt2375] == 1;
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt1571 = 1;
						local137.anInt1515 = anIntArray239[--anInt2375];
						Static158.method2441(local137);
						if (local137.anInt1510 == -1) {
							Static119.method1903(local137.anInt1500);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt2375 -= 6;
						local137.anInt1553 = anIntArray239[anInt2375];
						local137.anInt1527 = anIntArray239[anInt2375 + 1];
						local137.anInt1567 = anIntArray239[anInt2375 + 2];
						local137.anInt1538 = anIntArray239[anInt2375 + 3];
						local137.anInt1513 = anIntArray239[anInt2375 + 4];
						local137.anInt1550 = anIntArray239[anInt2375 + 5];
						Static158.method2441(local137);
						if (local137.anInt1510 == -1) {
							Static133.method2096(local137.anInt1500);
							Static348.method4048(local137.anInt1500);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray239[--anInt2375];
						if (local137.anInt1520 != local19) {
							local137.anInt1520 = local19;
							local137.anInt1547 = 0;
							local137.anInt1566 = 1;
							local137.anInt1535 = 0;
							Static158.method2441(local137);
						}
						if (local137.anInt1510 == -1) {
							Static254.method888(local137.anInt1500);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean120 = anIntArray239[--anInt2375] == 1;
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray17[--anInt2371];
						if (!local1101.equals(local137.aString21)) {
							local137.aString21 = local1101;
							Static158.method2441(local137);
						}
						if (local137.anInt1510 == -1) {
							Static181.method2839(local137.anInt1500);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt1514 = anIntArray239[--anInt2375];
						Static158.method2441(local137);
						if (local137.anInt1510 == -1) {
							Static115.method1863(local137.anInt1500);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt2375 -= 3;
						local137.anInt1536 = anIntArray239[anInt2375];
						local137.anInt1509 = anIntArray239[anInt2375 + 1];
						local137.anInt1533 = anIntArray239[anInt2375 + 2];
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean113 = anIntArray239[--anInt2375] == 1;
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt1508 = anIntArray239[--anInt2375];
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt1577 = anIntArray239[--anInt2375];
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean110 = anIntArray239[--anInt2375] == 1;
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean114 = anIntArray239[--anInt2375] == 1;
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt2375 -= 2;
						local137.anInt1562 = anIntArray239[anInt2375];
						local137.anInt1537 = anIntArray239[anInt2375 + 1];
						Static158.method2441(local137);
						if (local137.anInt1575 == 0) {
							Static54.method993(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt2375 -= 2;
						local137.aShort22 = (short) anIntArray239[anInt2375];
						local137.aShort23 = (short) anIntArray239[anInt2375 + 1];
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean123 = anIntArray239[--anInt2375] == 1;
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt1550 = anIntArray239[--anInt2375];
						Static158.method2441(local137);
						if (local137.anInt1510 == -1) {
							Static133.method2096(local137.anInt1500);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray239[--anInt2375];
						local137.aBoolean124 = local19 == 1;
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt2375 -= 2;
						local137.anInt1556 = anIntArray239[anInt2375];
						local137.anInt1563 = anIntArray239[anInt2375 + 1];
						Static158.method2441(local137);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static115.method1862(anIntArray239[--anInt2375]);
					} else {
						local137 = arg1 ? aClass62_7 : aClass62_8;
					}
					Static158.method2441(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt2375 -= 2;
						local19 = anIntArray239[anInt2375];
						local25 = anIntArray239[anInt2375 + 1];
						if (local137.anInt1510 == -1) {
							Static303.method4700(local137.anInt1500);
							Static133.method2096(local137.anInt1500);
							Static348.method4048(local137.anInt1500);
						}
						if (local19 == -1) {
							local137.anInt1571 = 1;
							local137.anInt1515 = -1;
							local137.anInt1549 = -1;
							return;
						}
						local137.anInt1549 = local19;
						local137.anInt1507 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean117 = true;
						} else {
							local137.aBoolean117 = false;
						}
						@Pc(1537) Class51 local1537 = Static176.aClass78_3.method1641(local19);
						local137.anInt1567 = local1537.anInt1166;
						local137.anInt1538 = local1537.anInt1161;
						local137.anInt1513 = local1537.anInt1142;
						local137.anInt1553 = local1537.anInt1132;
						local137.anInt1527 = local1537.anInt1165;
						local137.anInt1550 = local1537.anInt1174;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt1511 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt1511 = 1;
						} else {
							local137.anInt1511 = 2;
						}
						if (local137.anInt1531 > 0) {
							local137.anInt1550 = local137.anInt1550 * 32 / local137.anInt1531;
							return;
						}
						if (local137.anInt1541 > 0) {
							local137.anInt1550 = local137.anInt1550 * 32 / local137.anInt1541;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt1571 = 2;
						local137.anInt1515 = anIntArray239[--anInt2375];
						if (local137.anInt1510 == -1) {
							Static119.method1903(local137.anInt1500);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt1571 = 3;
						local137.anInt1515 = -1;
						if (local137.anInt1510 == -1) {
							Static119.method1903(local137.anInt1500);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt1571 = 6;
						local137.anInt1515 = anIntArray239[--anInt2375];
						if (local137.anInt1510 == -1) {
							Static119.method1903(local137.anInt1500);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt1571 = 5;
						local137.anInt1515 = anIntArray239[--anInt2375];
						if (local137.anInt1510 == -1) {
							Static119.method1903(local137.anInt1500);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt2375 -= 4;
						local137.anInt1505 = anIntArray239[anInt2375];
						local137.anInt1540 = anIntArray239[anInt2375 + 1];
						local137.anInt1576 = anIntArray239[anInt2375 + 2];
						local137.anInt1573 = anIntArray239[anInt2375 + 3];
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt2375 -= 2;
						local137.anInt1564 = anIntArray239[anInt2375];
						local137.anInt1516 = anIntArray239[anInt2375 + 1];
						Static158.method2441(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt2375 -= 4;
						local137.anInt1515 = anIntArray239[anInt2375];
						local137.anInt1548 = anIntArray239[anInt2375 + 1];
						if (anIntArray239[anInt2375 + 2] == 1) {
							local137.anInt1571 = 9;
						} else {
							local137.anInt1571 = 8;
						}
						if (anIntArray239[anInt2375 + 3] == 1) {
							local137.aBoolean117 = true;
						} else {
							local137.aBoolean117 = false;
						}
						if (local137.anInt1510 == -1) {
							Static119.method1903(local137.anInt1500);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt1571 = 5;
						local137.anInt1515 = Static376.anInt6265;
						local137.anInt1548 = 0;
						if (local137.anInt1510 == -1) {
							Static119.method1903(local137.anInt1500);
						}
						return;
					}
				} else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static115.method1862(anIntArray239[--anInt2375]);
					} else {
						local137 = arg1 ? aClass62_7 : aClass62_8;
					}
					if (arg0 == 1300) {
						local19 = anIntArray239[--anInt2375] - 1;
						if (local19 >= 0 && local19 <= 9) {
							local137.method1285(aStringArray17[--anInt2371], local19);
							return;
						}
						anInt2371--;
						return;
					}
					if (arg0 == 1301) {
						anInt2375 -= 2;
						local19 = anIntArray239[anInt2375];
						local25 = anIntArray239[anInt2375 + 1];
						local137.aClass62_3 = Static80.method1338(local19, local25);
						return;
					}
					if (arg0 == 1302) {
						local19 = anIntArray239[--anInt2375];
						if (local19 != Static364.anInt6112 && local19 != Static307.anInt5414 && local19 != Static247.anInt4441) {
							return;
						}
						local137.anInt1534 = local19;
						return;
					}
					if (arg0 == 1303) {
						local137.anInt1552 = anIntArray239[--anInt2375];
						return;
					}
					if (arg0 == 1304) {
						local137.anInt1499 = anIntArray239[--anInt2375];
						return;
					}
					if (arg0 == 1305) {
						local137.aString18 = aStringArray17[--anInt2371];
						return;
					}
					if (arg0 == 1306) {
						local137.aString19 = aStringArray17[--anInt2371];
						return;
					}
					if (arg0 == 1307) {
						local137.aStringArray11 = null;
						return;
					}
					if (arg0 == 1308) {
						local137.anInt1570 = anIntArray239[--anInt2375];
						local137.anInt1519 = anIntArray239[--anInt2375];
						return;
					}
					if (arg0 == 1309) {
						local19 = anIntArray239[--anInt2375];
						local25 = anIntArray239[--anInt2375];
						if (local25 >= 1 && local25 <= 10) {
							local137.method1288(local19, local25 - 1);
						}
						return;
					}
					if (arg0 == 1310) {
						local137.aString22 = aStringArray17[--anInt2371];
						return;
					}
					if (arg0 == 1311) {
						local137.anInt1497 = anIntArray239[--anInt2375];
						return;
					}
				} else {
					@Pc(2194) int local2194;
					if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static115.method1862(anIntArray239[--anInt2375]);
						} else {
							local137 = arg1 ? aClass62_7 : aClass62_8;
						}
						local1101 = aStringArray17[--anInt2371];
						@Pc(2137) int[] local2137 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray239[--anInt2375];
							if (local353 > 0) {
								local2137 = new int[local353];
								while (local353-- > 0) {
									local2137[local353] = anIntArray239[--anInt2375];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2189) Object[] local2189 = new Object[local1101.length() + 1];
						for (local2194 = local2189.length - 1; local2194 >= 1; local2194--) {
							if (local1101.charAt(local2194 - 1) == 's') {
								local2189[local2194] = aStringArray17[--anInt2371];
							} else {
								local2189[local2194] = Integer.valueOf(anIntArray239[--anInt2375]);
							}
						}
						local56 = anIntArray239[--anInt2375];
						if (local56 == -1) {
							local2189 = null;
						} else {
							local2189[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray10 = local2189;
						} else if (arg0 == 1401) {
							local137.anObjectArray20 = local2189;
						} else if (arg0 == 1402) {
							local137.lb = local2189;
						} else if (arg0 == 1403) {
							local137.anObjectArray12 = local2189;
						} else if (arg0 == 1404) {
							local137.anObjectArray23 = local2189;
						} else if (arg0 == 1405) {
							local137.anObjectArray15 = local2189;
						} else if (arg0 == 1406) {
							local137.anObjectArray8 = local2189;
						} else if (arg0 == 1407) {
							local137.anObjectArray16 = local2189;
							local137.anIntArray149 = local2137;
						} else if (arg0 == 1408) {
							local137.anObjectArray5 = local2189;
						} else if (arg0 == 1409) {
							local137.anObjectArray7 = local2189;
						} else if (arg0 == 1410) {
							local137.anObjectArray2 = local2189;
						} else if (arg0 == 1411) {
							local137.anObjectArray19 = local2189;
						} else if (arg0 == 1412) {
							local137.anObjectArray30 = local2189;
						} else if (arg0 == 1414) {
							local137.anObjectArray27 = local2189;
							local137.anIntArray150 = local2137;
						} else if (arg0 == 1415) {
							local137.anObjectArray11 = local2189;
							local137.anIntArray151 = local2137;
						} else if (arg0 == 1416) {
							local137.anObjectArray24 = local2189;
						} else if (arg0 == 1417) {
							local137.anObjectArray22 = local2189;
						} else if (arg0 == 1418) {
							local137.anObjectArray18 = local2189;
						} else if (arg0 == 1419) {
							local137.anObjectArray29 = local2189;
						} else if (arg0 == 1420) {
							local137.anObjectArray25 = local2189;
						} else if (arg0 == 1421) {
							local137.anObjectArray3 = local2189;
						} else if (arg0 == 1422) {
							local137.anObjectArray6 = local2189;
						} else if (arg0 == 1423) {
							local137.anObjectArray13 = local2189;
						} else if (arg0 == 1424) {
							local137.anObjectArray17 = local2189;
						} else if (arg0 == 1425) {
							local137.anObjectArray28 = local2189;
						} else if (arg0 == 1426) {
							local137.anObjectArray21 = local2189;
						} else if (arg0 == 1427) {
							local137.anObjectArray26 = local2189;
						} else if (arg0 == 1428) {
							local137.anObjectArray4 = local2189;
							local137.anIntArray154 = local2137;
						} else if (arg0 == 1429) {
							local137.anObjectArray14 = local2189;
							local137.anIntArray157 = local2137;
						}
						local137.aBoolean119 = true;
						return;
					}
					if (arg0 < 1600) {
						local137 = arg1 ? aClass62_7 : aClass62_8;
						if (arg0 == 1500) {
							anIntArray239[anInt2375++] = local137.anInt1523;
							return;
						}
						if (arg0 == 1501) {
							anIntArray239[anInt2375++] = local137.anInt1559;
							return;
						}
						if (arg0 == 1502) {
							anIntArray239[anInt2375++] = local137.anInt1546;
							return;
						}
						if (arg0 == 1503) {
							anIntArray239[anInt2375++] = local137.anInt1551;
							return;
						}
						if (arg0 == 1504) {
							anIntArray239[anInt2375++] = local137.aBoolean115 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray239[anInt2375++] = local137.anInt1506;
							return;
						}
					} else if (arg0 < 1700) {
						local137 = arg1 ? aClass62_7 : aClass62_8;
						if (arg0 == 1600) {
							anIntArray239[anInt2375++] = local137.anInt1574;
							return;
						}
						if (arg0 == 1601) {
							anIntArray239[anInt2375++] = local137.anInt1504;
							return;
						}
						if (arg0 == 1602) {
							aStringArray17[anInt2371++] = local137.aString21;
							return;
						}
						if (arg0 == 1603) {
							anIntArray239[anInt2375++] = local137.anInt1562;
							return;
						}
						if (arg0 == 1604) {
							anIntArray239[anInt2375++] = local137.anInt1537;
							return;
						}
						if (arg0 == 1605) {
							anIntArray239[anInt2375++] = local137.anInt1550;
							return;
						}
						if (arg0 == 1606) {
							anIntArray239[anInt2375++] = local137.anInt1567;
							return;
						}
						if (arg0 == 1607) {
							anIntArray239[anInt2375++] = local137.anInt1513;
							return;
						}
						if (arg0 == 1608) {
							anIntArray239[anInt2375++] = local137.anInt1538;
							return;
						}
						if (arg0 == 1609) {
							anIntArray239[anInt2375++] = local137.anInt1495;
							return;
						}
						if (arg0 == 1610) {
							anIntArray239[anInt2375++] = local137.anInt1553;
							return;
						}
						if (arg0 == 1611) {
							anIntArray239[anInt2375++] = local137.anInt1527;
							return;
						}
						if (arg0 == 1612) {
							anIntArray239[anInt2375++] = local137.anInt1526;
							return;
						}
					} else if (arg0 < 1800) {
						local137 = arg1 ? aClass62_7 : aClass62_8;
						if (arg0 == 1700) {
							anIntArray239[anInt2375++] = local137.anInt1549;
							return;
						}
						if (arg0 == 1701) {
							if (local137.anInt1549 != -1) {
								anIntArray239[anInt2375++] = local137.anInt1507;
								return;
							}
							anIntArray239[anInt2375++] = 0;
							return;
						}
						if (arg0 == 1702) {
							anIntArray239[anInt2375++] = local137.anInt1510;
							return;
						}
					} else if (arg0 < 1900) {
						local137 = arg1 ? aClass62_7 : aClass62_8;
						if (arg0 == 1800) {
							anIntArray239[anInt2375++] = Static48.method915(local137).method5603();
							return;
						}
						if (arg0 == 1801) {
							local19 = anIntArray239[--anInt2375];
							local19--;
							if (local137.aStringArray11 != null && local19 < local137.aStringArray11.length && local137.aStringArray11[local19] != null) {
								aStringArray17[anInt2371++] = local137.aStringArray11[local19];
								return;
							}
							aStringArray17[anInt2371++] = "";
							return;
						}
						if (arg0 == 1802) {
							if (local137.aString18 == null) {
								aStringArray17[anInt2371++] = "";
								return;
							}
							aStringArray17[anInt2371++] = local137.aString18;
							return;
						}
					} else if (arg0 < 2600) {
						local137 = Static115.method1862(anIntArray239[--anInt2375]);
						if (arg0 == 2500) {
							anIntArray239[anInt2375++] = local137.anInt1523;
							return;
						}
						if (arg0 == 2501) {
							anIntArray239[anInt2375++] = local137.anInt1559;
							return;
						}
						if (arg0 == 2502) {
							anIntArray239[anInt2375++] = local137.anInt1546;
							return;
						}
						if (arg0 == 2503) {
							anIntArray239[anInt2375++] = local137.anInt1551;
							return;
						}
						if (arg0 == 2504) {
							anIntArray239[anInt2375++] = local137.aBoolean115 ? 1 : 0;
							return;
						}
						if (arg0 == 2505) {
							anIntArray239[anInt2375++] = local137.anInt1506;
							return;
						}
					} else if (arg0 < 2700) {
						local137 = Static115.method1862(anIntArray239[--anInt2375]);
						if (arg0 == 2600) {
							anIntArray239[anInt2375++] = local137.anInt1574;
							return;
						}
						if (arg0 == 2601) {
							anIntArray239[anInt2375++] = local137.anInt1504;
							return;
						}
						if (arg0 == 2602) {
							aStringArray17[anInt2371++] = local137.aString21;
							return;
						}
						if (arg0 == 2603) {
							anIntArray239[anInt2375++] = local137.anInt1562;
							return;
						}
						if (arg0 == 2604) {
							anIntArray239[anInt2375++] = local137.anInt1537;
							return;
						}
						if (arg0 == 2605) {
							anIntArray239[anInt2375++] = local137.anInt1550;
							return;
						}
						if (arg0 == 2606) {
							anIntArray239[anInt2375++] = local137.anInt1567;
							return;
						}
						if (arg0 == 2607) {
							anIntArray239[anInt2375++] = local137.anInt1513;
							return;
						}
						if (arg0 == 2608) {
							anIntArray239[anInt2375++] = local137.anInt1538;
							return;
						}
						if (arg0 == 2609) {
							anIntArray239[anInt2375++] = local137.anInt1495;
							return;
						}
						if (arg0 == 2610) {
							anIntArray239[anInt2375++] = local137.anInt1553;
							return;
						}
						if (arg0 == 2611) {
							anIntArray239[anInt2375++] = local137.anInt1527;
							return;
						}
						if (arg0 == 2612) {
							anIntArray239[anInt2375++] = local137.anInt1526;
							return;
						}
					} else {
						@Pc(3356) Class3_Sub22 local3356;
						@Pc(3254) Class3_Sub22 local3254;
						if (arg0 < 2800) {
							if (arg0 == 2700) {
								local137 = Static115.method1862(anIntArray239[--anInt2375]);
								anIntArray239[anInt2375++] = local137.anInt1549;
								return;
							}
							if (arg0 == 2701) {
								local137 = Static115.method1862(anIntArray239[--anInt2375]);
								if (local137.anInt1549 != -1) {
									anIntArray239[anInt2375++] = local137.anInt1507;
									return;
								}
								anIntArray239[anInt2375++] = 0;
								return;
							}
							if (arg0 == 2702) {
								local13 = anIntArray239[--anInt2375];
								local3254 = (Class3_Sub22) Static29.aClass44_26.method942((long) local13);
								if (local3254 != null) {
									anIntArray239[anInt2375++] = 1;
									return;
								}
								anIntArray239[anInt2375++] = 0;
								return;
							}
							if (arg0 == 2703) {
								local137 = Static115.method1862(anIntArray239[--anInt2375]);
								if (local137.aClass62Array1 == null) {
									anIntArray239[anInt2375++] = 0;
									return;
								}
								local19 = local137.aClass62Array1.length;
								for (local25 = 0; local25 < local137.aClass62Array1.length; local25++) {
									if (local137.aClass62Array1[local25] == null) {
										local19 = local25;
										break;
									}
								}
								anIntArray239[anInt2375++] = local19;
								return;
							}
							if (arg0 == 2704 || arg0 == 2705) {
								anInt2375 -= 2;
								local13 = anIntArray239[anInt2375];
								local19 = anIntArray239[anInt2375 + 1];
								local3356 = (Class3_Sub22) Static29.aClass44_26.method942((long) local13);
								if (local3356 != null && local3356.anInt3029 == local19) {
									anIntArray239[anInt2375++] = 1;
									return;
								} else {
									anIntArray239[anInt2375++] = 0;
									return;
								}
							}
						} else if (arg0 < 2900) {
							local137 = Static115.method1862(anIntArray239[--anInt2375]);
							if (arg0 == 2800) {
								anIntArray239[anInt2375++] = Static48.method915(local137).method5603();
								return;
							}
							if (arg0 == 2801) {
								local19 = anIntArray239[--anInt2375];
								local19--;
								if (local137.aStringArray11 != null && local19 < local137.aStringArray11.length && local137.aStringArray11[local19] != null) {
									aStringArray17[anInt2371++] = local137.aStringArray11[local19];
									return;
								}
								aStringArray17[anInt2371++] = "";
								return;
							}
							if (arg0 == 2802) {
								if (local137.aString18 == null) {
									aStringArray17[anInt2371++] = "";
									return;
								}
								aStringArray17[anInt2371++] = local137.aString18;
								return;
							}
						} else {
							@Pc(3493) String local3493;
							if (arg0 < 3200) {
								if (arg0 == 3100) {
									local3493 = aStringArray17[--anInt2371];
									Static166.method5554(local3493);
									return;
								}
								if (arg0 == 3101) {
									anInt2375 -= 2;
									Static140.method2226(Static226.aClass28_Sub1_Sub1_Sub2_2, anIntArray239[anInt2375 + 1], anIntArray239[anInt2375]);
									return;
								}
								if (arg0 == 3103) {
									Static93.method1549();
									return;
								}
								if (arg0 == 3104) {
									local3493 = aStringArray17[--anInt2371];
									local19 = 0;
									if (Static245.method4021(local3493)) {
										local19 = Static321.method2984(local3493);
									}
									Static229.method3783(Static225.aClass244_56);
									Static23.aClass3_Sub5_Sub1_1.method2782(local19);
									return;
								}
								if (arg0 == 3105) {
									local3493 = aStringArray17[--anInt2371];
									Static229.method3783(Static140.aClass244_40);
									Static23.aClass3_Sub5_Sub1_1.method2791(local3493.length() + 1);
									Static23.aClass3_Sub5_Sub1_1.method2768(local3493);
									return;
								}
								if (arg0 == 3106) {
									local3493 = aStringArray17[--anInt2371];
									Static229.method3783(Static381.aClass244_96);
									Static23.aClass3_Sub5_Sub1_1.method2791(local3493.length() + 1);
									Static23.aClass3_Sub5_Sub1_1.method2768(local3493);
									return;
								}
								if (arg0 == 3107) {
									local13 = anIntArray239[--anInt2375];
									local1101 = aStringArray17[--anInt2371];
									Static305.method4702(local1101, local13);
									return;
								}
								if (arg0 == 3108) {
									anInt2375 -= 3;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									local25 = anIntArray239[anInt2375 + 2];
									local35 = Static115.method1862(local25);
									Static286.method5337(local35, local19, local13);
									return;
								}
								if (arg0 == 3109) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									local210 = arg1 ? aClass62_7 : aClass62_8;
									Static286.method5337(local210, local19, local13);
									return;
								}
								if (arg0 == 3110) {
									local13 = anIntArray239[--anInt2375];
									Static229.method3783(Static65.aClass244_18);
									Static23.aClass3_Sub5_Sub1_1.method2749(local13);
									return;
								}
								if (arg0 == 3111) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									local3356 = (Class3_Sub22) Static29.aClass44_26.method942((long) local13);
									if (local3356 != null) {
										Static53.method985(local3356, true, local3356.anInt3029 != local19);
									}
									Static319.method4848(local19, true, local13, 3);
									return;
								}
								if (arg0 == 3112) {
									anInt2375--;
									local13 = anIntArray239[anInt2375];
									local3254 = (Class3_Sub22) Static29.aClass44_26.method942((long) local13);
									if (local3254 != null && local3254.anInt3027 == 3) {
										Static53.method985(local3254, true, true);
									}
									return;
								}
							} else if (arg0 < 3300) {
								if (arg0 == 3200) {
									anInt2375 -= 3;
									Static12.method161(anIntArray239[anInt2375], anIntArray239[anInt2375 + 1], anIntArray239[anInt2375 + 2], 255);
									return;
								}
								if (arg0 == 3201) {
									Static320.method4850(anIntArray239[--anInt2375], 255, 50);
									return;
								}
								if (arg0 == 3202) {
									anInt2375 -= 2;
									Static164.method2513(anIntArray239[anInt2375], 255, anIntArray239[anInt2375 + 1]);
									return;
								}
								if (arg0 == 3203) {
									anInt2375 -= 4;
									Static12.method161(anIntArray239[anInt2375], anIntArray239[anInt2375 + 1], anIntArray239[anInt2375 + 2], anIntArray239[anInt2375 + 3]);
									return;
								}
								if (arg0 == 3204) {
									anInt2375 -= 3;
									Static320.method4850(anIntArray239[anInt2375], anIntArray239[anInt2375 + 1], anIntArray239[anInt2375 + 2]);
									return;
								}
								if (arg0 == 3205) {
									anInt2375 -= 3;
									Static164.method2513(anIntArray239[anInt2375], anIntArray239[anInt2375 + 2], anIntArray239[anInt2375 + 1]);
									return;
								}
							} else if (arg0 < 3400) {
								if (arg0 == 3300) {
									anIntArray239[anInt2375++] = Static76.anInt1617;
									return;
								}
								if (arg0 == 3301) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = Static307.method4817(local19, local13, false);
									return;
								}
								if (arg0 == 3302) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = Static245.method4029(false, local19, local13);
									return;
								}
								if (arg0 == 3303) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = Static314.method4811(local19, false, local13);
									return;
								}
								if (arg0 == 3304) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Static12.aClass142_1.method3104(local13).anInt4151;
									return;
								}
								if (arg0 == 3305) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Static363.anIntArray663[local13];
									return;
								}
								if (arg0 == 3306) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Static152.anIntArray299[local13];
									return;
								}
								if (arg0 == 3307) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Static33.anIntArray56[local13];
									return;
								}
								if (arg0 == 3308) {
									@Pc(4136) byte local4136 = Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73;
									local19 = (Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 >> 7) + Static21.anInt265;
									local25 = (Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 >> 7) + Static103.anInt2044;
									anIntArray239[anInt2375++] = (local4136 << 28) + (local19 << 14) + local25;
									return;
								}
								if (arg0 == 3309) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = local13 >> 14 & 0x3FFF;
									return;
								}
								if (arg0 == 3310) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = local13 >> 28;
									return;
								}
								if (arg0 == 3311) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = local13 & 0x3FFF;
									return;
								}
								if (arg0 == 3312) {
									anIntArray239[anInt2375++] = Static241.aBoolean330 ? 1 : 0;
									return;
								}
								if (arg0 == 3313) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = Static307.method4817(local19, local13, true);
									return;
								}
								if (arg0 == 3314) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = Static245.method4029(true, local19, local13);
									return;
								}
								if (arg0 == 3315) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = Static314.method4811(local19, true, local13);
									return;
								}
								if (arg0 == 3316) {
									if (Static315.anInt5429 >= 2) {
										anIntArray239[anInt2375++] = Static315.anInt5429;
										return;
									}
									anIntArray239[anInt2375++] = 0;
									return;
								}
								if (arg0 == 3317) {
									anIntArray239[anInt2375++] = Static139.anInt2636;
									return;
								}
								if (arg0 == 3318) {
									anIntArray239[anInt2375++] = Static41.anInt765;
									return;
								}
								if (arg0 == 3321) {
									anIntArray239[anInt2375++] = Static174.anInt3042;
									return;
								}
								if (arg0 == 3322) {
									anIntArray239[anInt2375++] = Static212.anInt3743;
									return;
								}
								if (arg0 == 3323) {
									if (Static257.anInt4620 >= 5 && Static257.anInt4620 <= 9) {
										anIntArray239[anInt2375++] = 1;
										return;
									}
									anIntArray239[anInt2375++] = 0;
									return;
								}
								if (arg0 == 3324) {
									if (Static257.anInt4620 >= 5 && Static257.anInt4620 <= 9) {
										anIntArray239[anInt2375++] = Static257.anInt4620;
										return;
									}
									anIntArray239[anInt2375++] = 0;
									return;
								}
								if (arg0 == 3325) {
									anIntArray239[anInt2375++] = Static220.aBoolean317 ? 1 : 0;
									return;
								}
								if (arg0 == 3326) {
									anIntArray239[anInt2375++] = Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4381;
									return;
								}
								if (arg0 == 3327) {
									anIntArray239[anInt2375++] = Static226.aClass28_Sub1_Sub1_Sub2_2.aClass49_1.aBoolean63 ? 1 : 0;
									return;
								}
								if (arg0 == 3328) {
									anIntArray239[anInt2375++] = Static246.aBoolean345 && !Static345.aBoolean446 ? 1 : 0;
									return;
								}
								if (arg0 == 3329) {
									anIntArray239[anInt2375++] = Static348.aBoolean347 ? 1 : 0;
									return;
								}
								if (arg0 == 3330) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Static236.method3902(local13);
									return;
								}
								if (arg0 == 3331) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = Static80.method1334(false, local19, local13);
									return;
								}
								if (arg0 == 3332) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = Static80.method1334(true, local19, local13);
									return;
								}
								if (arg0 == 3333) {
									anIntArray239[anInt2375++] = Static21.anInt261;
									return;
								}
								if (arg0 == 3335) {
									anIntArray239[anInt2375++] = Static66.anInt1307;
									return;
								}
								if (arg0 == 3336) {
									anInt2375 -= 4;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									local25 = anIntArray239[anInt2375 + 2];
									local353 = anIntArray239[anInt2375 + 3];
									local13 += local19 << 14;
									local13 += local25 << 28;
									local13 += local353;
									anIntArray239[anInt2375++] = local13;
									return;
								}
								if (arg0 == 3337) {
									anIntArray239[anInt2375++] = Static68.anInt1341;
									return;
								}
								if (arg0 == 3338) {
									anIntArray239[anInt2375++] = Static281.method4460();
									return;
								}
							} else if (arg0 < 3500) {
								@Pc(4761) Class146 local4761;
								if (arg0 == 3400) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									local4761 = Static194.aClass103_1.method2198(local13);
									aStringArray17[anInt2371++] = local4761.method3155(local19);
									return;
								}
								if (arg0 == 3408) {
									anInt2375 -= 4;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									local25 = anIntArray239[anInt2375 + 2];
									local353 = anIntArray239[anInt2375 + 3];
									@Pc(4807) Class146 local4807 = Static194.aClass103_1.method2198(local25);
									if (local4807.aChar4 == local13 && local4807.aChar3 == local19) {
										if (local19 == 115) {
											aStringArray17[anInt2371++] = local4807.method3155(local353);
											return;
										}
										anIntArray239[anInt2375++] = local4807.method3154(local353);
										return;
									}
									throw new RuntimeException("C3408-1");
								}
								if (arg0 == 3409) {
									anInt2375 -= 3;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									local25 = anIntArray239[anInt2375 + 2];
									if (local19 == -1) {
										throw new RuntimeException("C3409-2");
									}
									@Pc(4883) Class146 local4883 = Static194.aClass103_1.method2198(local19);
									if (local4883.aChar3 != local13) {
										throw new RuntimeException("C3409-1");
									}
									anIntArray239[anInt2375++] = local4883.method3156(local25) ? 1 : 0;
									return;
								}
								if (arg0 == 3410) {
									local13 = anIntArray239[--anInt2375];
									local1101 = aStringArray17[--anInt2371];
									if (local13 == -1) {
										throw new RuntimeException("C3410-2");
									}
									local4761 = Static194.aClass103_1.method2198(local13);
									if (local4761.aChar3 != 's') {
										throw new RuntimeException("C3410-1");
									}
									anIntArray239[anInt2375++] = local4761.method3152(local1101) ? 1 : 0;
									return;
								}
								if (arg0 == 3411) {
									local13 = anIntArray239[--anInt2375];
									@Pc(4981) Class146 local4981 = Static194.aClass103_1.method2198(local13);
									anIntArray239[anInt2375++] = local4981.aClass44_22.method943();
									return;
								}
							} else if (arg0 < 3700) {
								if (arg0 == 3600) {
									if (Static331.anInt5599 == 0) {
										anIntArray239[anInt2375++] = -2;
										return;
									}
									if (Static331.anInt5599 == 1) {
										anIntArray239[anInt2375++] = -1;
										return;
									}
									anIntArray239[anInt2375++] = Static351.anInt3266;
									return;
								}
								if (arg0 == 3601) {
									local13 = anIntArray239[--anInt2375];
									if (Static331.anInt5599 == 2 && local13 < Static351.anInt3266) {
										aStringArray17[anInt2371++] = Static244.aStringArray28[local13];
										if (Static275.aStringArray33[local13] != null) {
											aStringArray17[anInt2371++] = Static275.aStringArray33[local13];
											return;
										}
										aStringArray17[anInt2371++] = "";
										return;
									}
									aStringArray17[anInt2371++] = "";
									aStringArray17[anInt2371++] = "";
									return;
								}
								if (arg0 == 3602) {
									local13 = anIntArray239[--anInt2375];
									if (Static331.anInt5599 == 2 && local13 < Static351.anInt3266) {
										anIntArray239[anInt2375++] = Static110.anIntArray215[local13];
										return;
									}
									anIntArray239[anInt2375++] = 0;
									return;
								}
								if (arg0 == 3603) {
									local13 = anIntArray239[--anInt2375];
									if (Static331.anInt5599 == 2 && local13 < Static351.anInt3266) {
										anIntArray239[anInt2375++] = Static351.anIntArray370[local13];
										return;
									}
									anIntArray239[anInt2375++] = 0;
									return;
								}
								if (arg0 == 3604) {
									local3493 = aStringArray17[--anInt2371];
									local19 = anIntArray239[--anInt2375];
									Static156.method2401(local19, local3493);
									return;
								}
								if (arg0 == 3605) {
									local3493 = aStringArray17[--anInt2371];
									Static302.method4688(local3493);
									return;
								}
								if (arg0 == 3606) {
									local3493 = aStringArray17[--anInt2371];
									Static335.method5113(local3493);
									return;
								}
								if (arg0 == 3607) {
									local3493 = aStringArray17[--anInt2371];
									Static235.method3893(local3493, false);
									return;
								}
								if (arg0 == 3608) {
									local3493 = aStringArray17[--anInt2371];
									Static193.method3061(local3493);
									return;
								}
								if (arg0 == 3609) {
									local3493 = aStringArray17[--anInt2371];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									anIntArray239[anInt2375++] = Static47.method862(local3493) ? 1 : 0;
									return;
								}
								if (arg0 == 3610) {
									local13 = anIntArray239[--anInt2375];
									if (Static331.anInt5599 == 2 && local13 < Static351.anInt3266) {
										aStringArray17[anInt2371++] = Static346.aStringArray39[local13];
										return;
									}
									aStringArray17[anInt2371++] = "";
									return;
								}
								if (arg0 == 3611) {
									if (Static316.aString55 != null) {
										aStringArray17[anInt2371++] = Static238.method3917(Static316.aString55);
										return;
									}
									aStringArray17[anInt2371++] = "";
									return;
								}
								if (arg0 == 3612) {
									if (Static316.aString55 != null) {
										anIntArray239[anInt2375++] = Static12.anInt159;
										return;
									}
									anIntArray239[anInt2375++] = 0;
									return;
								}
								if (arg0 == 3613) {
									local13 = anIntArray239[--anInt2375];
									if (Static316.aString55 != null && local13 < Static12.anInt159) {
										aStringArray17[anInt2371++] = Static54.aClass236Array1[local13].aString59;
										return;
									}
									aStringArray17[anInt2371++] = "";
									return;
								}
								if (arg0 == 3614) {
									local13 = anIntArray239[--anInt2375];
									if (Static316.aString55 != null && local13 < Static12.anInt159) {
										anIntArray239[anInt2375++] = Static54.aClass236Array1[local13].anInt6178;
										return;
									}
									anIntArray239[anInt2375++] = 0;
									return;
								}
								if (arg0 == 3615) {
									local13 = anIntArray239[--anInt2375];
									if (Static316.aString55 != null && local13 < Static12.anInt159) {
										anIntArray239[anInt2375++] = Static54.aClass236Array1[local13].aByte76;
										return;
									}
									anIntArray239[anInt2375++] = 0;
									return;
								}
								if (arg0 == 3616) {
									anIntArray239[anInt2375++] = Static123.aByte35;
									return;
								}
								if (arg0 == 3617) {
									local3493 = aStringArray17[--anInt2371];
									Static313.method5208(local3493);
									return;
								}
								if (arg0 == 3618) {
									anIntArray239[anInt2375++] = Static44.aByte9;
									return;
								}
								if (arg0 == 3619) {
									local3493 = aStringArray17[--anInt2371];
									Static127.method2040(local3493);
									return;
								}
								if (arg0 == 3620) {
									Static255.method4134();
									return;
								}
								if (arg0 == 3621) {
									if (Static331.anInt5599 == 0) {
										anIntArray239[anInt2375++] = -1;
										return;
									}
									anIntArray239[anInt2375++] = Static196.anInt5194;
									return;
								}
								if (arg0 == 3622) {
									local13 = anIntArray239[--anInt2375];
									if (Static331.anInt5599 != 0 && local13 < Static196.anInt5194) {
										aStringArray17[anInt2371++] = Static152.aStringArray23[local13];
										if (Static295.aStringArray36[local13] != null) {
											aStringArray17[anInt2371++] = Static295.aStringArray36[local13];
											return;
										}
										aStringArray17[anInt2371++] = "";
										return;
									}
									aStringArray17[anInt2371++] = "";
									aStringArray17[anInt2371++] = "";
									return;
								}
								if (arg0 == 3623) {
									local3493 = aStringArray17[--anInt2371];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									anIntArray239[anInt2375++] = Static185.method2922(local3493) ? 1 : 0;
									return;
								}
								if (arg0 == 3624) {
									local13 = anIntArray239[--anInt2375];
									if (Static54.aClass236Array1 != null && local13 < Static12.anInt159 && Static54.aClass236Array1[local13].aString58.equalsIgnoreCase(Static226.aClass28_Sub1_Sub1_Sub2_2.aString51)) {
										anIntArray239[anInt2375++] = 1;
										return;
									}
									anIntArray239[anInt2375++] = 0;
									return;
								}
								if (arg0 == 3625) {
									if (Static372.aString64 != null) {
										aStringArray17[anInt2371++] = Static372.aString64;
										return;
									}
									aStringArray17[anInt2371++] = "";
									return;
								}
								if (arg0 == 3626) {
									local13 = anIntArray239[--anInt2375];
									if (Static316.aString55 != null && local13 < Static12.anInt159) {
										aStringArray17[anInt2371++] = Static54.aClass236Array1[local13].aString60;
										return;
									}
									aStringArray17[anInt2371++] = "";
									return;
								}
								if (arg0 == 3627) {
									local13 = anIntArray239[--anInt2375];
									if (Static331.anInt5599 == 2 && local13 >= 0 && local13 < Static351.anInt3266) {
										anIntArray239[anInt2375++] = Static23.aBooleanArray7[local13] ? 1 : 0;
										return;
									}
									anIntArray239[anInt2375++] = 0;
									return;
								}
								if (arg0 == 3628) {
									local3493 = aStringArray17[--anInt2371];
									if (local3493.startsWith("<img=0>") || local3493.startsWith("<img=1>")) {
										local3493 = local3493.substring(7);
									}
									anIntArray239[anInt2375++] = Static145.method2285(local3493);
									return;
								}
								if (arg0 == 3629) {
									anIntArray239[anInt2375++] = Static155.anInt2789;
									return;
								}
								if (arg0 == 3630) {
									local3493 = aStringArray17[--anInt2371];
									Static235.method3893(local3493, true);
									return;
								}
								if (arg0 == 3631) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Static122.aBooleanArray55[local13] ? 1 : 0;
									return;
								}
								if (arg0 == 3632) {
									local13 = anIntArray239[--anInt2375];
									if (Static316.aString55 != null && local13 < Static12.anInt159) {
										aStringArray17[anInt2371++] = Static54.aClass236Array1[local13].aString58;
										return;
									}
									aStringArray17[anInt2371++] = "";
									return;
								}
								if (arg0 == 3633) {
									local13 = anIntArray239[--anInt2375];
									if (Static331.anInt5599 != 0 && local13 < Static196.anInt5194) {
										aStringArray17[anInt2371++] = Static78.aStringArray12[local13];
										return;
									}
									aStringArray17[anInt2371++] = "";
									return;
								}
							} else if (arg0 < 4000) {
								if (arg0 == 3903) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Static8.aClass157Array119[local13].method3679();
									return;
								}
								if (arg0 == 3904) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Static8.aClass157Array119[local13].anInt3909;
									return;
								}
								if (arg0 == 3905) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Static8.aClass157Array119[local13].anInt3911;
									return;
								}
								if (arg0 == 3906) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Static8.aClass157Array119[local13].anInt3908;
									return;
								}
								if (arg0 == 3907) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Static8.aClass157Array119[local13].anInt3906;
									return;
								}
								if (arg0 == 3908) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Static8.aClass157Array119[local13].anInt3912;
									return;
								}
								if (arg0 == 3910) {
									local13 = anIntArray239[--anInt2375];
									local19 = Static8.aClass157Array119[local13].method3676();
									anIntArray239[anInt2375++] = local19 == 0 ? 1 : 0;
									return;
								}
								if (arg0 == 3911) {
									local13 = anIntArray239[--anInt2375];
									local19 = Static8.aClass157Array119[local13].method3676();
									anIntArray239[anInt2375++] = local19 == 2 ? 1 : 0;
									return;
								}
								if (arg0 == 3912) {
									local13 = anIntArray239[--anInt2375];
									local19 = Static8.aClass157Array119[local13].method3676();
									anIntArray239[anInt2375++] = local19 == 5 ? 1 : 0;
									return;
								}
								if (arg0 == 3913) {
									local13 = anIntArray239[--anInt2375];
									local19 = Static8.aClass157Array119[local13].method3676();
									anIntArray239[anInt2375++] = local19 == 1 ? 1 : 0;
									return;
								}
							} else if (arg0 < 4100) {
								if (arg0 == 4000) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = local13 + local19;
									return;
								}
								if (arg0 == 4001) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = local13 - local19;
									return;
								}
								if (arg0 == 4002) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = local13 * local19;
									return;
								}
								if (arg0 == 4003) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = local13 / local19;
									return;
								}
								if (arg0 == 4004) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = (int) (Math.random() * (double) local13);
									return;
								}
								if (arg0 == 4005) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = (int) (Math.random() * (double) (local13 + 1));
									return;
								}
								if (arg0 == 4006) {
									anInt2375 -= 5;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									local25 = anIntArray239[anInt2375 + 2];
									local353 = anIntArray239[anInt2375 + 3];
									local2194 = anIntArray239[anInt2375 + 4];
									anIntArray239[anInt2375++] = local13 + (local19 - local13) * (local2194 - local25) / (local353 - local25);
									return;
								}
								@Pc(6491) long local6491;
								@Pc(6484) long local6484;
								if (arg0 == 4007) {
									anInt2375 -= 2;
									local6484 = anIntArray239[anInt2375];
									local6491 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = (int) (local6484 + local6484 * local6491 / 100L);
									return;
								}
								if (arg0 == 4008) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = local13 | 0x1 << local19;
									return;
								}
								if (arg0 == 4009) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = local13 & -(0x1 << local19) - 1;
									return;
								}
								if (arg0 == 4010) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
									return;
								}
								if (arg0 == 4011) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = local13 % local19;
									return;
								}
								if (arg0 == 4012) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									if (local13 == 0) {
										anIntArray239[anInt2375++] = 0;
										return;
									}
									anIntArray239[anInt2375++] = (int) Math.pow((double) local13, (double) local19);
									return;
								}
								if (arg0 == 4013) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									if (local13 == 0) {
										anIntArray239[anInt2375++] = 0;
										return;
									}
									if (local19 == 0) {
										anIntArray239[anInt2375++] = Integer.MAX_VALUE;
										return;
									}
									anIntArray239[anInt2375++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
									return;
								}
								if (arg0 == 4014) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = local13 & local19;
									return;
								}
								if (arg0 == 4015) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = local13 | local19;
									return;
								}
								if (arg0 == 4016) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = local13 < local19 ? local13 : local19;
									return;
								}
								if (arg0 == 4017) {
									anInt2375 -= 2;
									local13 = anIntArray239[anInt2375];
									local19 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = local13 > local19 ? local13 : local19;
									return;
								}
								if (arg0 == 4018) {
									anInt2375 -= 3;
									local6484 = anIntArray239[anInt2375];
									local6491 = anIntArray239[anInt2375 + 1];
									@Pc(6872) long local6872 = (long) anIntArray239[anInt2375 + 2];
									anIntArray239[anInt2375++] = (int) (local6484 * local6872 / local6491);
									return;
								}
							} else if (arg0 < 4200) {
								if (arg0 == 4100) {
									local3493 = aStringArray17[--anInt2371];
									local19 = anIntArray239[--anInt2375];
									aStringArray17[anInt2371++] = local3493 + local19;
									return;
								}
								if (arg0 == 4101) {
									anInt2371 -= 2;
									local3493 = aStringArray17[anInt2371];
									local1101 = aStringArray17[anInt2371 + 1];
									aStringArray17[anInt2371++] = local3493 + local1101;
									return;
								}
								if (arg0 == 4102) {
									local3493 = aStringArray17[--anInt2371];
									local19 = anIntArray239[--anInt2375];
									aStringArray17[anInt2371++] = local3493 + Static244.method3986(local19);
									return;
								}
								if (arg0 == 4103) {
									local3493 = aStringArray17[--anInt2371];
									aStringArray17[anInt2371++] = local3493.toLowerCase();
									return;
								}
								if (arg0 == 4104) {
									aStringArray17[anInt2371++] = method2001(anIntArray239[--anInt2375]);
									return;
								}
								if (arg0 == 4105) {
									anInt2371 -= 2;
									local3493 = aStringArray17[anInt2371];
									local1101 = aStringArray17[anInt2371 + 1];
									if (Static226.aClass28_Sub1_Sub1_Sub2_2.aClass49_1 != null && Static226.aClass28_Sub1_Sub1_Sub2_2.aClass49_1.aBoolean63) {
										aStringArray17[anInt2371++] = local1101;
										return;
									}
									aStringArray17[anInt2371++] = local3493;
									return;
								}
								if (arg0 == 4106) {
									local13 = anIntArray239[--anInt2375];
									aStringArray17[anInt2371++] = Integer.toString(local13);
									return;
								}
								if (arg0 == 4107) {
									anInt2371 -= 2;
									anIntArray239[anInt2375++] = Static228.method3741(Static66.anInt1307, aStringArray17[anInt2371 + 1], aStringArray17[anInt2371]);
									return;
								}
								@Pc(7155) Class190 local7155;
								if (arg0 == 4108) {
									local3493 = aStringArray17[--anInt2371];
									anInt2375 -= 2;
									local19 = anIntArray239[anInt2375];
									local25 = anIntArray239[anInt2375 + 1];
									local7155 = Static93.method1548(Static368.aClass20_95, local25);
									anIntArray239[anInt2375++] = local7155.method4353(local3493, Static110.aClass110Array4, local19);
									return;
								}
								if (arg0 == 4109) {
									local3493 = aStringArray17[--anInt2371];
									anInt2375 -= 2;
									local19 = anIntArray239[anInt2375];
									local25 = anIntArray239[anInt2375 + 1];
									local7155 = Static93.method1548(Static368.aClass20_95, local25);
									anIntArray239[anInt2375++] = local7155.method4350(Static110.aClass110Array4, local3493, local19);
									return;
								}
								if (arg0 == 4110) {
									anInt2371 -= 2;
									local3493 = aStringArray17[anInt2371];
									local1101 = aStringArray17[anInt2371 + 1];
									if (anIntArray239[--anInt2375] == 1) {
										aStringArray17[anInt2371++] = local3493;
										return;
									}
									aStringArray17[anInt2371++] = local1101;
									return;
								}
								if (arg0 == 4111) {
									local3493 = aStringArray17[--anInt2371];
									aStringArray17[anInt2371++] = Static256.method4150(local3493);
									return;
								}
								if (arg0 == 4112) {
									local3493 = aStringArray17[--anInt2371];
									local19 = anIntArray239[--anInt2375];
									if (local19 == -1) {
										throw new RuntimeException("null char");
									}
									aStringArray17[anInt2371++] = local3493 + (char) local19;
									return;
								}
								if (arg0 == 4113) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Static246.method4034((char) local13) ? 1 : 0;
									return;
								}
								if (arg0 == 4114) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Static340.method5151((char) local13) ? 1 : 0;
									return;
								}
								if (arg0 == 4115) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Static167.method2526((char) local13) ? 1 : 0;
									return;
								}
								if (arg0 == 4116) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Static229.method3782((char) local13) ? 1 : 0;
									return;
								}
								if (arg0 == 4117) {
									local3493 = aStringArray17[--anInt2371];
									if (local3493 != null) {
										anIntArray239[anInt2375++] = local3493.length();
										return;
									}
									anIntArray239[anInt2375++] = 0;
									return;
								}
								if (arg0 == 4118) {
									local3493 = aStringArray17[--anInt2371];
									anInt2375 -= 2;
									local19 = anIntArray239[anInt2375];
									local25 = anIntArray239[anInt2375 + 1];
									aStringArray17[anInt2371++] = local3493.substring(local19, local25);
									return;
								}
								if (arg0 == 4119) {
									local3493 = aStringArray17[--anInt2371];
									@Pc(7518) StringBuffer local7518 = new StringBuffer(local3493.length());
									@Pc(7520) boolean local7520 = false;
									for (local353 = 0; local353 < local3493.length(); local353++) {
										@Pc(7527) char local7527 = local3493.charAt(local353);
										if (local7527 == '<') {
											local7520 = true;
										} else if (local7527 == '>') {
											local7520 = false;
										} else if (!local7520) {
											local7518.append(local7527);
										}
									}
									aStringArray17[anInt2371++] = local7518.toString();
									return;
								}
								if (arg0 == 4120) {
									local3493 = aStringArray17[--anInt2371];
									anInt2375 -= 2;
									local19 = anIntArray239[anInt2375];
									local25 = anIntArray239[anInt2375 + 1];
									anIntArray239[anInt2375++] = local3493.indexOf(local19, local25);
									return;
								}
								if (arg0 == 4121) {
									anInt2371 -= 2;
									local3493 = aStringArray17[anInt2371];
									local1101 = aStringArray17[anInt2371 + 1];
									local25 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = local3493.indexOf(local1101, local25);
									return;
								}
								if (arg0 == 4122) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Character.toLowerCase((char) local13);
									return;
								}
								if (arg0 == 4123) {
									local13 = anIntArray239[--anInt2375];
									anIntArray239[anInt2375++] = Character.toUpperCase((char) local13);
									return;
								}
								if (arg0 == 4124) {
									local412 = anIntArray239[--anInt2375] != 0;
									local19 = anIntArray239[--anInt2375];
									aStringArray17[anInt2371++] = Static146.method2297((long) local19, 0, Static66.anInt1307, local412);
									return;
								}
								if (arg0 == 4125) {
									local3493 = aStringArray17[--anInt2371];
									local19 = anIntArray239[--anInt2375];
									@Pc(7741) Class190 local7741 = Static93.method1548(Static368.aClass20_95, local19);
									anIntArray239[anInt2375++] = local7741.method4356(Static110.aClass110Array4, local3493);
									return;
								}
							} else {
								@Pc(8083) Class104 local8083;
								if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray239[--anInt2375];
										aStringArray17[anInt2371++] = Static176.aClass78_3.method1641(local13).aString13;
										return;
									}
									@Pc(7803) Class51 local7803;
									if (arg0 == 4201) {
										anInt2375 -= 2;
										local13 = anIntArray239[anInt2375];
										local19 = anIntArray239[anInt2375 + 1];
										local7803 = Static176.aClass78_3.method1641(local13);
										if (local19 >= 1 && local19 <= 5 && local7803.aStringArray5[local19 - 1] != null) {
											aStringArray17[anInt2371++] = local7803.aStringArray5[local19 - 1];
											return;
										}
										aStringArray17[anInt2371++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt2375 -= 2;
										local13 = anIntArray239[anInt2375];
										local19 = anIntArray239[anInt2375 + 1];
										local7803 = Static176.aClass78_3.method1641(local13);
										if (local19 >= 1 && local19 <= 5 && local7803.aStringArray4[local19 - 1] != null) {
											aStringArray17[anInt2371++] = local7803.aStringArray4[local19 - 1];
											return;
										}
										aStringArray17[anInt2371++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray239[--anInt2375];
										anIntArray239[anInt2375++] = Static176.aClass78_3.method1641(local13).anInt1148;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray239[--anInt2375];
										anIntArray239[anInt2375++] = Static176.aClass78_3.method1641(local13).anInt1175 == 1 ? 1 : 0;
										return;
									}
									@Pc(7966) Class51 local7966;
									if (arg0 == 4205) {
										local13 = anIntArray239[--anInt2375];
										local7966 = Static176.aClass78_3.method1641(local13);
										if (local7966.anInt1187 == -1 && local7966.anInt1192 >= 0) {
											anIntArray239[anInt2375++] = local7966.anInt1192;
											return;
										}
										anIntArray239[anInt2375++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray239[--anInt2375];
										local7966 = Static176.aClass78_3.method1641(local13);
										if (local7966.anInt1187 >= 0 && local7966.anInt1192 >= 0) {
											anIntArray239[anInt2375++] = local7966.anInt1192;
											return;
										}
										anIntArray239[anInt2375++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray239[--anInt2375];
										anIntArray239[anInt2375++] = Static176.aClass78_3.method1641(local13).aBoolean67 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt2375 -= 2;
										local13 = anIntArray239[anInt2375];
										local19 = anIntArray239[anInt2375 + 1];
										local8083 = Static255.aClass187_2.method4279(local19);
										if (local8083.method2213()) {
											aStringArray17[anInt2371++] = Static176.aClass78_3.method1641(local13).method1029(local19, local8083.aString25);
											return;
										}
										anIntArray239[anInt2375++] = Static176.aClass78_3.method1641(local13).method1017(local19, local8083.anInt2631);
										return;
									}
									if (arg0 == 4209) {
										anInt2375 -= 2;
										local13 = anIntArray239[anInt2375];
										local19 = anIntArray239[anInt2375 + 1] - 1;
										local7803 = Static176.aClass78_3.method1641(local13);
										if (local7803.anInt1195 == local19) {
											anIntArray239[anInt2375++] = local7803.anInt1145;
											return;
										}
										if (local7803.anInt1141 == local19) {
											anIntArray239[anInt2375++] = local7803.anInt1154;
											return;
										}
										anIntArray239[anInt2375++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3493 = aStringArray17[--anInt2371];
										local19 = anIntArray239[--anInt2375];
										Static380.method5630(local19 == 1, local3493);
										anIntArray239[anInt2375++] = Static189.anInt3424;
										return;
									}
									if (arg0 == 4211) {
										if (Static127.aShortArray44 != null && Static290.anInt5036 < Static189.anInt3424) {
											anIntArray239[anInt2375++] = Static127.aShortArray44[Static290.anInt5036++] & 0xFFFF;
											return;
										}
										anIntArray239[anInt2375++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static290.anInt5036 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt2375 -= 2;
										local13 = anIntArray239[anInt2375];
										local19 = anIntArray239[anInt2375 + 1];
										local8083 = Static255.aClass187_2.method4279(local19);
										if (local8083.method2213()) {
											aStringArray17[anInt2371++] = Static90.aClass83_2.method1716(local13).method1205(local8083.aString25, local19);
											return;
										}
										anIntArray239[anInt2375++] = Static90.aClass83_2.method1716(local13).method1207(local19, local8083.anInt2631);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt2375 -= 2;
										local13 = anIntArray239[anInt2375];
										local19 = anIntArray239[anInt2375 + 1];
										local8083 = Static255.aClass187_2.method4279(local19);
										if (local8083.method2213()) {
											aStringArray17[anInt2371++] = Static97.aClass217_4.method5007(local13).method1196(local19, local8083.aString25);
											return;
										}
										anIntArray239[anInt2375++] = Static97.aClass217_4.method5007(local13).method1193(local8083.anInt2631, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt2375 -= 2;
										local13 = anIntArray239[anInt2375];
										local19 = anIntArray239[anInt2375 + 1];
										local8083 = Static255.aClass187_2.method4279(local19);
										if (local8083.method2213()) {
											aStringArray17[anInt2371++] = Static125.aClass212_1.method4795(local13).method5229(local8083.aString25, local19);
											return;
										}
										anIntArray239[anInt2375++] = Static125.aClass212_1.method4795(local13).method5225(local19, local8083.anInt2631);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray239[--anInt2375];
									@Pc(8467) Class36 local8467 = Static79.aClass124_1.method2628(local13);
									if (local8467.anIntArray63 != null && local8467.anIntArray63.length > 0) {
										local25 = 0;
										local353 = local8467.anIntArray66[0];
										for (local2194 = 1; local2194 < local8467.anIntArray63.length; local2194++) {
											if (local8467.anIntArray66[local2194] > local353) {
												local25 = local2194;
												local353 = local8467.anIntArray66[local2194];
											}
										}
										anIntArray239[anInt2375++] = local8467.anIntArray63[local25];
										return;
									}
									anIntArray239[anInt2375++] = local8467.anInt682;
									return;
								}
							}
						}
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static115.method1862(anIntArray239[--anInt2375]);
				} else {
					local137 = arg1 ? aClass62_7 : aClass62_8;
				}
				if (arg0 == 1000) {
					anInt2375 -= 4;
					local137.anInt1529 = anIntArray239[anInt2375];
					local137.anInt1532 = anIntArray239[anInt2375 + 1];
					local19 = anIntArray239[anInt2375 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray239[anInt2375 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte23 = (byte) local19;
					local137.aByte25 = (byte) local25;
					Static158.method2441(local137);
					Static335.method5112(local137);
					if (local137.anInt1510 == -1) {
						Static59.method1067(local137.anInt1500);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt2375 -= 4;
					local137.anInt1541 = anIntArray239[anInt2375];
					local137.anInt1560 = anIntArray239[anInt2375 + 1];
					local137.anInt1531 = 0;
					local137.anInt1569 = 0;
					local19 = anIntArray239[anInt2375 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray239[anInt2375 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte24 = (byte) local19;
					local137.aByte22 = (byte) local25;
					Static158.method2441(local137);
					Static335.method5112(local137);
					if (local137.anInt1575 == 0) {
						Static54.method993(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray239[--anInt2375] == 1;
					if (local137.aBoolean115 != local620) {
						local137.aBoolean115 = local620;
						Static158.method2441(local137);
					}
					if (local137.anInt1510 == -1) {
						Static200.method3133(local137.anInt1500);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt2375 -= 2;
					local137.anInt1558 = anIntArray239[anInt2375];
					local137.anInt1539 = anIntArray239[anInt2375 + 1];
					Static158.method2441(local137);
					Static335.method5112(local137);
					if (local137.anInt1575 == 0) {
						Static54.method993(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean125 = anIntArray239[--anInt2375] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!hd;I)V")
	private static void method2000(@OriginalArg(0) Class3_Sub7_Sub7 arg0, @OriginalArg(1) int arg1) {
		anInt2375 = 0;
		anInt2371 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray250;
		@Pc(11) int[] local11 = arg0.anIntArray251;
		@Pc(13) byte local13 = -1;
		anInt2372 = 0;
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
						method1999(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method1998(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray239[anInt2375++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray239[anInt2375++] = Static331.aClass115_1.anIntArray301[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static331.aClass115_1.method2408(local54, anIntArray239[--anInt2375]);
					} else if (local31 == 3) {
						aStringArray17[anInt2371++] = arg0.aStringArray20[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt2375 -= 2;
						if (anIntArray239[anInt2375] != anIntArray239[anInt2375 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt2375 -= 2;
						if (anIntArray239[anInt2375] == anIntArray239[anInt2375 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt2375 -= 2;
						if (anIntArray239[anInt2375] < anIntArray239[anInt2375 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt2375 -= 2;
						if (anIntArray239[anInt2375] > anIntArray239[anInt2375 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt2372 == 0) {
							return;
						}
						@Pc(216) Class185 local216 = aClass185Array1[--anInt2372];
						arg0 = local216.aClass3_Sub7_Sub7_1;
						local8 = arg0.anIntArray250;
						local11 = arg0.anIntArray251;
						local5 = local216.anInt4746;
						anIntArray241 = local216.anIntArray525;
						aStringArray18 = local216.aStringArray32;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray239[anInt2375++] = Static331.aClass115_1.method2397(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static331.aClass115_1.method2403(local54, anIntArray239[--anInt2375]);
					} else if (local31 == 31) {
						anInt2375 -= 2;
						if (anIntArray239[anInt2375] <= anIntArray239[anInt2375 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt2375 -= 2;
						if (anIntArray239[anInt2375] >= anIntArray239[anInt2375 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray239[anInt2375++] = anIntArray241[local11[local5]];
					} else if (local31 == 34) {
						anIntArray241[local11[local5]] = anIntArray239[--anInt2375];
					} else if (local31 == 35) {
						aStringArray17[anInt2371++] = aStringArray18[local11[local5]];
					} else if (local31 == 36) {
						aStringArray18[local11[local5]] = aStringArray17[--anInt2371];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt2371 -= local54;
						@Pc(400) String local400 = Static334.method5110(local54, aStringArray17, anInt2371);
						aStringArray17[anInt2371++] = local400;
					} else if (local31 == 38) {
						anInt2375--;
					} else if (local31 == 39) {
						anInt2371--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class3_Sub7_Sub7 local436 = Static226.method3728(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt2453];
							@Pc(450) String[] local450 = new String[local436.anInt2449];
							for (local452 = 0; local452 < local436.anInt2454; local452++) {
								local446[local452] = anIntArray239[anInt2375 + local452 - local436.anInt2454];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt2448; local471++) {
								local450[local471] = aStringArray17[anInt2371 + local471 - local436.anInt2448];
							}
							anInt2375 -= local436.anInt2454;
							anInt2371 -= local436.anInt2448;
							@Pc(502) Class185 local502 = new Class185();
							local502.aClass3_Sub7_Sub7_1 = arg0;
							local502.anInt4746 = local5;
							local502.anIntArray525 = anIntArray241;
							local502.aStringArray32 = aStringArray18;
							if (anInt2372 >= aClass185Array1.length) {
								throw new RuntimeException();
							}
							aClass185Array1[anInt2372++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray250;
							local11 = local436.anIntArray251;
							local5 = -1;
							anIntArray241 = local446;
							aStringArray18 = local450;
						} else if (local31 == 42) {
							anIntArray239[anInt2375++] = Static97.anIntArray196[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static97.anIntArray196[local54] = anIntArray239[--anInt2375];
							Static69.method1179(local54);
							Static363.aBoolean483 |= Static29.aBooleanArray105[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray239[--anInt2375];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray240[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray22[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray239[--anInt2375];
							if (local603 < 0 || local603 >= anIntArray240[local54]) {
								throw new RuntimeException();
							}
							anIntArray239[anInt2375++] = anIntArrayArray22[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt2375 -= 2;
							local603 = anIntArray239[anInt2375];
							if (local603 < 0 || local603 >= anIntArray240[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray22[local54][local603] = anIntArray239[anInt2375 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static138.aStringArray22[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray17[anInt2371++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static138.aStringArray22[local54] = aStringArray17[--anInt2371];
							Static366.method4386(local54);
						} else if (local31 == 51) {
							@Pc(774) Class44 local774 = arg0.aClass44Array1[local11[local5]];
							@Pc(787) Class3_Sub28 local787 = (Class3_Sub28) local774.method942((long) anIntArray239[--anInt2375]);
							if (local787 != null) {
								local5 += local787.anInt3982;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString24 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong240).append(" ");
				for (local603 = anInt2372 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass185Array1[local603].aClass3_Sub7_Sub7_1.aLong240).append(" ");
				}
				local855.append("op: ").append(local13);
				Static355.method5328(local855.toString(), local837);
			} else {
				Static166.method5554("Clientscript error in: " + arg0.aString24);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString24).append("\n");
				for (local603 = anInt2372 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass185Array1[local603].aClass3_Sub7_Sub7_1.aString24).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static355.method5328(local855.toString(), local837);
				Static171.method2654(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Ljava/lang/String;")
	private static String method2001(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray19[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V")
	private static void method2002(@OriginalArg(0) int arg0) {
		@Pc(3) Class62 local3 = Static115.method1862(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class62[] local13 = Static181.aClass62ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class62[] local19 = Static375.aClass62ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static181.aClass62ArrayArray1[local9] = new Class62[local22];
			Static400.method1879(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static400.method1879(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method2004(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static315.anInt5429 == 0 && (Static246.aBoolean345 && !Static345.aBoolean446 || Static348.aBoolean347)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static198.aClass57_60.method1122(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static198.aClass57_60.method1122(0).length());
		} else if (local11.startsWith(Static379.aClass57_99.method1122(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static379.aClass57_99.method1122(0).length());
		} else if (local11.startsWith(Static245.aClass57_69.method1122(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static245.aClass57_69.method1122(0).length());
		} else if (local11.startsWith(Static328.aClass57_82.method1122(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static328.aClass57_82.method1122(0).length());
		} else if (local11.startsWith(Static76.aClass57_28.method1122(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static76.aClass57_28.method1122(0).length());
		} else if (local11.startsWith(Static315.aClass57_80.method1122(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static315.aClass57_80.method1122(0).length());
		} else if (local11.startsWith(Static355.aClass57_91.method1122(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static355.aClass57_91.method1122(0).length());
		} else if (local11.startsWith(Static83.aClass57_31.method1122(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static83.aClass57_31.method1122(0).length());
		} else if (local11.startsWith(Static153.aClass57_49.method1122(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static153.aClass57_49.method1122(0).length());
		} else if (local11.startsWith(Static6.aClass57_2.method1122(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static6.aClass57_2.method1122(0).length());
		} else if (local11.startsWith(Static373.aClass57_97.method1122(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static373.aClass57_97.method1122(0).length());
		} else if (local11.startsWith(Static260.aClass57_72.method1122(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static260.aClass57_72.method1122(0).length());
		} else if (Static66.anInt1307 != 0) {
			if (local11.startsWith(Static198.aClass57_60.method1122(Static66.anInt1307))) {
				local13 = 0;
				arg0 = arg0.substring(Static198.aClass57_60.method1122(Static66.anInt1307).length());
			} else if (local11.startsWith(Static379.aClass57_99.method1122(Static66.anInt1307))) {
				local13 = 1;
				arg0 = arg0.substring(Static379.aClass57_99.method1122(Static66.anInt1307).length());
			} else if (local11.startsWith(Static245.aClass57_69.method1122(Static66.anInt1307))) {
				local13 = 2;
				arg0 = arg0.substring(Static245.aClass57_69.method1122(Static66.anInt1307).length());
			} else if (local11.startsWith(Static328.aClass57_82.method1122(Static66.anInt1307))) {
				local13 = 3;
				arg0 = arg0.substring(Static328.aClass57_82.method1122(Static66.anInt1307).length());
			} else if (local11.startsWith(Static76.aClass57_28.method1122(Static66.anInt1307))) {
				local13 = 4;
				arg0 = arg0.substring(Static76.aClass57_28.method1122(Static66.anInt1307).length());
			} else if (local11.startsWith(Static315.aClass57_80.method1122(Static66.anInt1307))) {
				local13 = 5;
				arg0 = arg0.substring(Static315.aClass57_80.method1122(Static66.anInt1307).length());
			} else if (local11.startsWith(Static355.aClass57_91.method1122(Static66.anInt1307))) {
				local13 = 6;
				arg0 = arg0.substring(Static355.aClass57_91.method1122(Static66.anInt1307).length());
			} else if (local11.startsWith(Static83.aClass57_31.method1122(Static66.anInt1307))) {
				local13 = 7;
				arg0 = arg0.substring(Static83.aClass57_31.method1122(Static66.anInt1307).length());
			} else if (local11.startsWith(Static153.aClass57_49.method1122(Static66.anInt1307))) {
				local13 = 8;
				arg0 = arg0.substring(Static153.aClass57_49.method1122(Static66.anInt1307).length());
			} else if (local11.startsWith(Static6.aClass57_2.method1122(Static66.anInt1307))) {
				local13 = 9;
				arg0 = arg0.substring(Static6.aClass57_2.method1122(Static66.anInt1307).length());
			} else if (local11.startsWith(Static373.aClass57_97.method1122(Static66.anInt1307))) {
				local13 = 10;
				arg0 = arg0.substring(Static373.aClass57_97.method1122(Static66.anInt1307).length());
			} else if (local11.startsWith(Static260.aClass57_72.method1122(Static66.anInt1307))) {
				local13 = 11;
				arg0 = arg0.substring(Static260.aClass57_72.method1122(Static66.anInt1307).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static202.aClass57_63.method1122(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static202.aClass57_63.method1122(0).length());
		} else if (local11.startsWith(Static44.aClass57_19.method1122(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static44.aClass57_19.method1122(0).length());
		} else if (local11.startsWith(Static75.aClass57_27.method1122(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static75.aClass57_27.method1122(0).length());
		} else if (local11.startsWith(Static61.aClass57_23.method1122(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static61.aClass57_23.method1122(0).length());
		} else if (local11.startsWith(Static200.aClass57_61.method1122(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static200.aClass57_61.method1122(0).length());
		} else if (Static66.anInt1307 != 0) {
			if (local11.startsWith(Static202.aClass57_63.method1122(Static66.anInt1307))) {
				local451 = 1;
				arg0 = arg0.substring(Static202.aClass57_63.method1122(Static66.anInt1307).length());
			} else if (local11.startsWith(Static44.aClass57_19.method1122(Static66.anInt1307))) {
				local451 = 2;
				arg0 = arg0.substring(Static44.aClass57_19.method1122(Static66.anInt1307).length());
			} else if (local11.startsWith(Static75.aClass57_27.method1122(Static66.anInt1307))) {
				local451 = 3;
				arg0 = arg0.substring(Static75.aClass57_27.method1122(Static66.anInt1307).length());
			} else if (local11.startsWith(Static61.aClass57_23.method1122(Static66.anInt1307))) {
				local451 = 4;
				arg0 = arg0.substring(Static61.aClass57_23.method1122(Static66.anInt1307).length());
			} else if (local11.startsWith(Static200.aClass57_61.method1122(Static66.anInt1307))) {
				local451 = 5;
				arg0 = arg0.substring(Static200.aClass57_61.method1122(Static66.anInt1307).length());
			}
		}
		Static229.method3783(Static278.aClass244_67);
		Static23.aClass3_Sub5_Sub1_1.method2791(0);
		@Pc(646) int local646 = Static23.aClass3_Sub5_Sub1_1.anInt3121;
		if (arg1 == 5021) {
			Static23.aClass3_Sub5_Sub1_1.method2791(1);
		} else {
			Static23.aClass3_Sub5_Sub1_1.method2791(0);
		}
		Static23.aClass3_Sub5_Sub1_1.method2791(local13);
		Static23.aClass3_Sub5_Sub1_1.method2791(local451);
		Static322.method5670(Static23.aClass3_Sub5_Sub1_1, arg0);
		Static23.aClass3_Sub5_Sub1_1.method2771(Static23.aClass3_Sub5_Sub1_1.anInt3121 - local646);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!vp;II)V")
	public static void method2005(@OriginalArg(0) Class240 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub7_Sub7 local5 = Static173.method2679(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray241 = new int[local5.anInt2453];
		aStringArray18 = new String[local5.anInt2449];
		if (local5.aClass240_55 == Static318.aClass240_43 || local5.aClass240_55 == Static321.aClass240_73 || local5.aClass240_55 == Static34.aClass240_9) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static16.aClass62_1 != null) {
				local30 = Static16.aClass62_1.anInt1523;
				local32 = Static16.aClass62_1.anInt1559;
			}
			anIntArray241[0] = Static200.aClass10_1.method5242() - local30;
			anIntArray241[1] = Static200.aClass10_1.method5240() - local32;
		}
		method2000(local5, 200000);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!jo;)V")
	public static void method2006(@OriginalArg(0) Class3_Sub23 arg0) {
		method2007(arg0, 200000);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lclient!jo;I)V")
	private static void method2007(@OriginalArg(0) Class3_Sub23 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray31;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub7_Sub7 local12 = Static226.method3728(local8);
		if (local12 == null) {
			return;
		}
		anIntArray241 = new int[local12.anInt2453];
		@Pc(21) int local21 = 0;
		aStringArray18 = new String[local12.anInt2449];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt3034;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt3037;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass62_11 == null ? -1 : arg0.aClass62_11.anInt1500;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt3039;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass62_11 == null ? -1 : arg0.aClass62_11.anInt1510;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass62_10 == null ? -1 : arg0.aClass62_10.anInt1500;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass62_10 == null ? -1 : arg0.aClass62_10.anInt1510;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt3038;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt3040;
				}
				anIntArray241[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString30;
				}
				aStringArray18[local27++] = local135;
			}
		}
		method2000(local12, arg1);
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V")
	public static void method2008(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static212.method3305(arg0)) {
			return;
		}
		@Pc(12) Class62[] local12 = Static375.aClass62ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class62 local19 = local12[local14];
			if (local19.anObjectArray9 != null) {
				@Pc(26) Class3_Sub23 local26 = new Class3_Sub23();
				local26.aClass62_11 = local19;
				local26.anObjectArray31 = local19.anObjectArray9;
				method2007(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)V")
	private static void method2009(@OriginalArg(0) int arg0) {
		@Pc(3) Class62 local3 = Static115.method1862(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class62[] local13 = Static181.aClass62ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class62[] local19 = Static375.aClass62ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static181.aClass62ArrayArray1[local9] = new Class62[local22];
			Static400.method1879(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static400.method1879(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}
}
