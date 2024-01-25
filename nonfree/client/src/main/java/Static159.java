import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "Lclient!go;")
	private static Class95 aClass95_7;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray22;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "[I")
	private static int[] anIntArray255;

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "Lclient!ol;")
	private static Class179 aClass179_1;

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "Lclient!go;")
	private static Class95 aClass95_8;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
	private static int anInt2922 = 0;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "[Lclient!cf;")
	private static final Class38[] aClass38Array1 = new Class38[50];

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "[I")
	private static final int[] anIntArray254 = new int[5];

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
	private static int anInt2928 = 0;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray23 = new String[1000];

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "[[I")
	private static final int[][] anIntArrayArray24 = new int[5][5000];

	@OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
	private static int anInt2934 = 0;

	@OriginalMember(owner = "client!hn", name = "x", descriptor = "[I")
	private static final int[] anIntArray256 = new int[1000];

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "[I")
	private static final int[] anIntArray257 = new int[3];

	@OriginalMember(owner = "client!hn", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray24 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!hn", name = "B", descriptor = "Lclient!jo;")
	public static final Class126 aClass126_23 = new Class126(4);

	@OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
	private static int anInt2936 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)V")
	public static void method2343() {
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(IZ)V")
	private static void method2344(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray256[anInt2922++] = Static127.anInt2456;
				return;
			}
			if (arg0 == 5001) {
				anInt2922 -= 3;
				Static127.anInt2456 = anIntArray256[anInt2922];
				Static344.aClass175_3 = Static384.method5647(anIntArray256[anInt2922 + 1]);
				if (Static344.aClass175_3 == null) {
					Static344.aClass175_3 = Static248.aClass175_2;
				}
				Static76.anInt1558 = anIntArray256[anInt2922 + 2];
				Static81.method1414(Static101.aClass2_39);
				Static255.aClass7_Sub14_Sub1_2.method3970(Static127.anInt2456);
				Static255.aClass7_Sub14_Sub1_2.method3970(Static344.aClass175_3.anInt4655);
				Static255.aClass7_Sub14_Sub1_2.method3970(Static76.anInt1558);
				return;
			}
			if (arg0 == 5002) {
				anInt2934 -= 2;
				local75 = aStringArray23[anInt2934];
				local81 = aStringArray23[anInt2934 + 1];
				anInt2922 -= 2;
				local89 = anIntArray256[anInt2922];
				local95 = anIntArray256[anInt2922 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static81.method1414(Static47.aClass2_16);
				Static255.aClass7_Sub14_Sub1_2.method3970(Static268.method3593(local75) + Static268.method3593(local81) + 2);
				Static255.aClass7_Sub14_Sub1_2.method3947(local75);
				Static255.aClass7_Sub14_Sub1_2.method3970(local89 - 1);
				Static255.aClass7_Sub14_Sub1_2.method3970(local95);
				Static255.aClass7_Sub14_Sub1_2.method3947(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray256[--anInt2922];
				local81 = null;
				if (local157 < 100) {
					local81 = Static381.aStringArray49[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray23[anInt2934++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray256[--anInt2922];
				local192 = -1;
				if (local157 < 100 && Static381.aStringArray49[local157] != null) {
					local192 = Static454.anIntArray625[local157];
				}
				anIntArray256[anInt2922++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static344.aClass175_3 == null) {
					anIntArray256[anInt2922++] = -1;
					return;
				}
				anIntArray256[anInt2922++] = Static344.aClass175_3.anInt4655;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray23[--anInt2934];
				method2351(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt2934 -= 2;
				local75 = aStringArray23[anInt2934];
				local81 = aStringArray23[anInt2934 + 1];
				if (Static157.anInt2920 != 0 || (!Static148.aBoolean171 || Static419.aBoolean437) && !Static22.aBoolean309) {
					Static81.method1414(Static261.aClass2_70);
					Static255.aClass7_Sub14_Sub1_2.method3970(0);
					local89 = Static255.aClass7_Sub14_Sub1_2.anInt4989;
					Static255.aClass7_Sub14_Sub1_2.method3947(local75);
					Static47.method615(Static255.aClass7_Sub14_Sub1_2, local81);
					Static255.aClass7_Sub14_Sub1_2.method3960(Static255.aClass7_Sub14_Sub1_2.anInt4989 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray256[--anInt2922];
				local81 = null;
				if (local157 < 100) {
					local81 = Static121.aStringArray16[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray23[anInt2934++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray256[--anInt2922];
				local81 = null;
				if (local157 < 100) {
					local81 = Static225.aStringArray38[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray23[anInt2934++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray256[--anInt2922];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static377.anIntArray551[local157];
				}
				anIntArray256[anInt2922++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static104.aClass26_Sub2_Sub4_Sub2_2 == null || Static104.aClass26_Sub2_Sub4_Sub2_2.aString70 == null) {
					local75 = Static199.aString38;
				} else {
					local75 = Static104.aClass26_Sub2_Sub4_Sub2_2.method5527();
				}
				aStringArray23[anInt2934++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray256[anInt2922++] = Static76.anInt1558;
				return;
			}
			if (arg0 == 5017) {
				anIntArray256[anInt2922++] = Static223.anInt3931;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray256[--anInt2922];
				local192 = 0;
				if (local157 < 100 && Static381.aStringArray49[local157] != null) {
					local192 = Static171.anIntArray268[local157];
				}
				anIntArray256[anInt2922++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray256[--anInt2922];
				local81 = null;
				if (local157 < 100) {
					local81 = Static87.aStringArray9[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray23[anInt2934++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static104.aClass26_Sub2_Sub4_Sub2_2 == null || Static104.aClass26_Sub2_Sub4_Sub2_2.aString70 == null) {
					local75 = Static199.aString38;
				} else {
					local75 = Static104.aClass26_Sub2_Sub4_Sub2_2.method5529();
				}
				aStringArray23[anInt2934++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray256[--anInt2922];
				aStringArray23[anInt2934++] = Static62.aClass227_1.method4617(local157).aString62;
				return;
			}
			@Pc(589) Class7_Sub4_Sub15 local589;
			if (arg0 == 5051) {
				local157 = anIntArray256[--anInt2922];
				local589 = Static62.aClass227_1.method4617(local157);
				if (local589.anIntArray558 == null) {
					anIntArray256[anInt2922++] = 0;
					return;
				}
				anIntArray256[anInt2922++] = local589.anIntArray558.length;
				return;
			}
			if (arg0 == 5052) {
				anInt2922 -= 2;
				local157 = anIntArray256[anInt2922];
				local192 = anIntArray256[anInt2922 + 1];
				@Pc(634) Class7_Sub4_Sub15 local634 = Static62.aClass227_1.method4617(local157);
				local95 = local634.anIntArray558[local192];
				anIntArray256[anInt2922++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray256[--anInt2922];
				local589 = Static62.aClass227_1.method4617(local157);
				if (local589.anIntArray557 == null) {
					anIntArray256[anInt2922++] = 0;
					return;
				}
				anIntArray256[anInt2922++] = local589.anIntArray557.length;
				return;
			}
			if (arg0 == 5054) {
				anInt2922 -= 2;
				local157 = anIntArray256[anInt2922];
				local192 = anIntArray256[anInt2922 + 1];
				anIntArray256[anInt2922++] = Static62.aClass227_1.method4617(local157).anIntArray557[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray256[--anInt2922];
				aStringArray23[anInt2934++] = Static209.aClass204_1.method4288(local157).method4274();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray256[--anInt2922];
				@Pc(760) Class7_Sub4_Sub13 local760 = Static209.aClass204_1.method4288(local157);
				if (local760.anIntArray480 == null) {
					anIntArray256[anInt2922++] = 0;
					return;
				}
				anIntArray256[anInt2922++] = local760.anIntArray480.length;
				return;
			}
			if (arg0 == 5057) {
				anInt2922 -= 2;
				local157 = anIntArray256[anInt2922];
				local192 = anIntArray256[anInt2922 + 1];
				anIntArray256[anInt2922++] = Static209.aClass204_1.method4288(local157).anIntArray480[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass179_1 = new Class179();
				aClass179_1.anInt4841 = anIntArray256[--anInt2922];
				aClass179_1.aClass7_Sub4_Sub13_1 = Static209.aClass204_1.method4288(aClass179_1.anInt4841);
				aClass179_1.anIntArray432 = new int[aClass179_1.aClass7_Sub4_Sub13_1.method4275()];
				return;
			}
			if (arg0 == 5059) {
				Static81.method1414(Static269.aClass2_71);
				Static255.aClass7_Sub14_Sub1_2.method3970(0);
				local157 = Static255.aClass7_Sub14_Sub1_2.anInt4989;
				Static255.aClass7_Sub14_Sub1_2.method3970(0);
				Static255.aClass7_Sub14_Sub1_2.method3993(aClass179_1.anInt4841);
				aClass179_1.aClass7_Sub4_Sub13_1.method4278(aClass179_1.anIntArray432, Static255.aClass7_Sub14_Sub1_2);
				Static255.aClass7_Sub14_Sub1_2.method3960(Static255.aClass7_Sub14_Sub1_2.anInt4989 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray23[--anInt2934];
				Static81.method1414(Static357.aClass2_91);
				Static255.aClass7_Sub14_Sub1_2.method3970(0);
				local192 = Static255.aClass7_Sub14_Sub1_2.anInt4989;
				Static255.aClass7_Sub14_Sub1_2.method3947(local75);
				Static255.aClass7_Sub14_Sub1_2.method3993(aClass179_1.anInt4841);
				aClass179_1.aClass7_Sub4_Sub13_1.method4278(aClass179_1.anIntArray432, Static255.aClass7_Sub14_Sub1_2);
				Static255.aClass7_Sub14_Sub1_2.method3960(Static255.aClass7_Sub14_Sub1_2.anInt4989 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static81.method1414(Static269.aClass2_71);
				Static255.aClass7_Sub14_Sub1_2.method3970(0);
				local157 = Static255.aClass7_Sub14_Sub1_2.anInt4989;
				Static255.aClass7_Sub14_Sub1_2.method3970(1);
				Static255.aClass7_Sub14_Sub1_2.method3993(aClass179_1.anInt4841);
				aClass179_1.aClass7_Sub4_Sub13_1.method4278(aClass179_1.anIntArray432, Static255.aClass7_Sub14_Sub1_2);
				Static255.aClass7_Sub14_Sub1_2.method3960(Static255.aClass7_Sub14_Sub1_2.anInt4989 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt2922 -= 2;
				local157 = anIntArray256[anInt2922];
				local192 = anIntArray256[anInt2922 + 1];
				anIntArray256[anInt2922++] = Static62.aClass227_1.method4617(local157).aCharArray10[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt2922 -= 2;
				local157 = anIntArray256[anInt2922];
				local192 = anIntArray256[anInt2922 + 1];
				anIntArray256[anInt2922++] = Static62.aClass227_1.method4617(local157).aCharArray9[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt2922 -= 2;
				local157 = anIntArray256[anInt2922];
				local192 = anIntArray256[anInt2922 + 1];
				if (local192 == -1) {
					anIntArray256[anInt2922++] = -1;
					return;
				}
				anIntArray256[anInt2922++] = Static62.aClass227_1.method4617(local157).method4947((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt2922 -= 2;
				local157 = anIntArray256[anInt2922];
				local192 = anIntArray256[anInt2922 + 1];
				if (local192 == -1) {
					anIntArray256[anInt2922++] = -1;
					return;
				}
				anIntArray256[anInt2922++] = Static62.aClass227_1.method4617(local157).method4945((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray256[--anInt2922];
				anIntArray256[anInt2922++] = Static209.aClass204_1.method4288(local157).method4275();
				return;
			}
			if (arg0 == 5067) {
				anInt2922 -= 2;
				local157 = anIntArray256[anInt2922];
				local192 = anIntArray256[anInt2922 + 1];
				local89 = Static209.aClass204_1.method4288(local157).method4279(local192).anInt2400;
				anIntArray256[anInt2922++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt2922 -= 2;
				local157 = anIntArray256[anInt2922];
				local192 = anIntArray256[anInt2922 + 1];
				aClass179_1.anIntArray432[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt2922 -= 2;
				local157 = anIntArray256[anInt2922];
				local192 = anIntArray256[anInt2922 + 1];
				aClass179_1.anIntArray432[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt2922 -= 3;
				local157 = anIntArray256[anInt2922];
				local192 = anIntArray256[anInt2922 + 1];
				local89 = anIntArray256[anInt2922 + 2];
				@Pc(1265) Class7_Sub4_Sub13 local1265 = Static209.aClass204_1.method4288(local157);
				if (local1265.method4279(local192).anInt2400 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray256[anInt2922++] = local1265.method4282(local89, local192);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray23[--anInt2934];
				local1313 = anIntArray256[--anInt2922] == 1;
				Static212.method3045(local75, local1313);
				anIntArray256[anInt2922++] = Static238.anInt4078;
				return;
			}
			if (arg0 == 5072) {
				if (Static89.aShortArray29 != null && Static117.anInt2381 < Static238.anInt4078) {
					anIntArray256[anInt2922++] = Static89.aShortArray29[Static117.anInt2381++] & 0xFFFF;
					return;
				}
				anIntArray256[anInt2922++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static117.anInt2381 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static81.method1414(Static269.aClass2_71);
				Static255.aClass7_Sub14_Sub1_2.method3970(0);
				local157 = Static255.aClass7_Sub14_Sub1_2.anInt4989;
				Static255.aClass7_Sub14_Sub1_2.method3970(2);
				Static255.aClass7_Sub14_Sub1_2.method3993(aClass179_1.anInt4841);
				aClass179_1.aClass7_Sub4_Sub13_1.method4278(aClass179_1.anIntArray432, Static255.aClass7_Sub14_Sub1_2);
				Static255.aClass7_Sub14_Sub1_2.method3960(Static255.aClass7_Sub14_Sub1_2.anInt4989 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static310.aClass130_1.method5069(86)) {
					anIntArray256[anInt2922++] = 1;
					return;
				}
				anIntArray256[anInt2922++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static310.aClass130_1.method5069(82)) {
					anIntArray256[anInt2922++] = 1;
					return;
				}
				anIntArray256[anInt2922++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static310.aClass130_1.method5069(81)) {
					anIntArray256[anInt2922++] = 1;
					return;
				}
				anIntArray256[anInt2922++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static84.method3645(anIntArray256[--anInt2922]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray256[anInt2922++] = Static147.method2251();
					return;
				}
				if (arg0 == 5205) {
					Static320.method4226(anIntArray256[--anInt2922], -1, -1, false);
					return;
				}
				@Pc(1554) Class7_Sub4_Sub9 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray256[--anInt2922];
					local1554 = Static93.method3404(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray256[anInt2922++] = -1;
						return;
					}
					anIntArray256[anInt2922++] = local1554.anInt3002;
					return;
				}
				@Pc(1587) Class7_Sub4_Sub9 local1587;
				if (arg0 == 5207) {
					local1587 = Static93.method3413(anIntArray256[--anInt2922]);
					if (local1587 != null && local1587.aString34 != null) {
						aStringArray23[anInt2934++] = local1587.aString34;
						return;
					}
					aStringArray23[anInt2934++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray256[anInt2922++] = Static56.anInt942;
					anIntArray256[anInt2922++] = Static153.anInt5628;
					return;
				}
				if (arg0 == 5209) {
					anIntArray256[anInt2922++] = Static203.anInt3590 + Static93.anInt4322;
					anIntArray256[anInt2922++] = Static21.anInt321 + Static93.anInt4323;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray256[--anInt2922];
					local1554 = Static93.method3413(local157);
					if (local1554 == null) {
						anIntArray256[anInt2922++] = 0;
						anIntArray256[anInt2922++] = 0;
						return;
					}
					anIntArray256[anInt2922++] = local1554.anInt3009 >> 14 & 0x3FFF;
					anIntArray256[anInt2922++] = local1554.anInt3009 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray256[--anInt2922];
					local1554 = Static93.method3413(local157);
					if (local1554 == null) {
						anIntArray256[anInt2922++] = 0;
						anIntArray256[anInt2922++] = 0;
						return;
					}
					anIntArray256[anInt2922++] = local1554.anInt3005 - local1554.anInt3013;
					anIntArray256[anInt2922++] = local1554.anInt2999 - local1554.anInt3006;
					return;
				}
				@Pc(1777) Class7_Sub11 local1777;
				if (arg0 == 5212) {
					local1777 = Static362.method4648();
					if (local1777 == null) {
						anIntArray256[anInt2922++] = -1;
						anIntArray256[anInt2922++] = -1;
						return;
					}
					anIntArray256[anInt2922++] = local1777.anInt1062;
					local192 = local1777.anInt1067 << 28 | local1777.anInt1059 + Static93.anInt4322 << 14 | local1777.anInt1058 + Static93.anInt4323;
					anIntArray256[anInt2922++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static359.method4610();
					if (local1777 == null) {
						anIntArray256[anInt2922++] = -1;
						anIntArray256[anInt2922++] = -1;
						return;
					}
					anIntArray256[anInt2922++] = local1777.anInt1062;
					local192 = local1777.anInt1067 << 28 | local1777.anInt1059 + Static93.anInt4322 << 14 | local1777.anInt1058 + Static93.anInt4323;
					anIntArray256[anInt2922++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray256[--anInt2922];
					local1554 = Static343.method4440();
					if (local1554 != null) {
						local1925 = local1554.method2409(local157 >> 28 & 0x3, local157 >> 14 & 0x3FFF, local157 & 0x3FFF, anIntArray257);
						if (local1925) {
							Static162.method2367(anIntArray257[2], anIntArray257[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt2922 -= 2;
					local157 = anIntArray256[anInt2922];
					local192 = anIntArray256[anInt2922 + 1];
					@Pc(1963) Class24 local1963 = Static93.method3415(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class7_Sub4_Sub9 local1970 = (Class7_Sub4_Sub9) local1963.method303(); local1970 != null; local1970 = (Class7_Sub4_Sub9) local1963.method301()) {
						if (local1970.anInt3002 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray256[anInt2922++] = 1;
						return;
					}
					anIntArray256[anInt2922++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray256[--anInt2922];
					local1554 = Static93.method3413(local157);
					if (local1554 == null) {
						anIntArray256[anInt2922++] = -1;
						return;
					}
					anIntArray256[anInt2922++] = local1554.anInt3000;
					return;
				}
				if (arg0 == 5220) {
					anIntArray256[anInt2922++] = Static24.anInt346 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray256[--anInt2922];
					Static162.method2367(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static343.method4440();
					if (local1587 != null) {
						local1313 = local1587.method2412(Static21.anInt321 + Static93.anInt4323, Static203.anInt3590 + Static93.anInt4322, anIntArray257);
						if (local1313) {
							anIntArray256[anInt2922++] = anIntArray257[1];
							anIntArray256[anInt2922++] = anIntArray257[2];
							return;
						}
						anIntArray256[anInt2922++] = -1;
						anIntArray256[anInt2922++] = -1;
						return;
					}
					anIntArray256[anInt2922++] = -1;
					anIntArray256[anInt2922++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt2922 -= 2;
					local157 = anIntArray256[anInt2922];
					local192 = anIntArray256[anInt2922 + 1];
					Static320.method4226(local157, local192 >> 14 & 0x3FFF, local192 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray256[--anInt2922];
					local1554 = Static343.method4440();
					if (local1554 != null) {
						local1925 = local1554.method2409(local157 >> 28 & 0x3, local157 >> 14 & 0x3FFF, local157 & 0x3FFF, anIntArray257);
						if (local1925) {
							anIntArray256[anInt2922++] = anIntArray257[1];
							anIntArray256[anInt2922++] = anIntArray257[2];
							return;
						}
						anIntArray256[anInt2922++] = -1;
						anIntArray256[anInt2922++] = -1;
						return;
					}
					anIntArray256[anInt2922++] = -1;
					anIntArray256[anInt2922++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray256[--anInt2922];
					local1554 = Static343.method4440();
					if (local1554 != null) {
						local1925 = local1554.method2412(local157 & 0x3FFF, local157 >> 14 & 0x3FFF, anIntArray257);
						if (local1925) {
							anIntArray256[anInt2922++] = anIntArray257[1];
							anIntArray256[anInt2922++] = anIntArray257[2];
							return;
						}
						anIntArray256[anInt2922++] = -1;
						anIntArray256[anInt2922++] = -1;
						return;
					}
					anIntArray256[anInt2922++] = -1;
					anIntArray256[anInt2922++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static335.method4377(anIntArray256[--anInt2922]);
					return;
				}
				if (arg0 == 5227) {
					anInt2922 -= 2;
					local157 = anIntArray256[anInt2922];
					local192 = anIntArray256[anInt2922 + 1];
					Static320.method4226(local157, local192 >> 14 & 0x3FFF, local192 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static314.aBoolean330 = anIntArray256[--anInt2922] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray256[anInt2922++] = Static314.aBoolean330 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray256[--anInt2922];
					Static236.method3227(local157);
					return;
				}
				@Pc(2483) Class7 local2483;
				if (arg0 == 5231) {
					anInt2922 -= 2;
					local157 = anIntArray256[anInt2922];
					local1313 = anIntArray256[anInt2922 + 1] == 1;
					if (Static406.aClass164_37 != null) {
						local2483 = Static406.aClass164_37.method3512((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5802();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class7();
							Static406.aClass164_37.method3508((long) local157, local2483);
						}
					}
					return;
				}
				@Pc(2525) Class7 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray256[--anInt2922];
					if (Static406.aClass164_37 != null) {
						local2525 = Static406.aClass164_37.method3512((long) local157);
						anIntArray256[anInt2922++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray256[anInt2922++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt2922 -= 2;
					local157 = anIntArray256[anInt2922];
					local1313 = anIntArray256[anInt2922 + 1] == 1;
					if (Static1.aClass164_1 != null) {
						local2483 = Static1.aClass164_1.method3512((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5802();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class7();
							Static1.aClass164_1.method3508((long) local157, local2483);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray256[--anInt2922];
					if (Static1.aClass164_1 != null) {
						local2525 = Static1.aClass164_1.method3512((long) local157);
						anIntArray256[anInt2922++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray256[anInt2922++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray256[anInt2922++] = Static93.aClass7_Sub4_Sub9_3 == null ? -1 : Static93.aClass7_Sub4_Sub9_3.anInt3002;
					return;
				}
				if (arg0 == 5236) {
					anInt2922 -= 2;
					local157 = anIntArray256[anInt2922];
					local192 = anIntArray256[anInt2922 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static282.method3735(local157, local95, local89);
					if (local2691 < 0) {
						anIntArray256[anInt2922++] = -1;
						return;
					}
					anIntArray256[anInt2922++] = local2691;
					return;
				}
				if (arg0 == 5237) {
					Static101.method1747();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt2922 -= 2;
					local157 = anIntArray256[anInt2922];
					local192 = anIntArray256[anInt2922 + 1];
					Static335.method4379(3, local192, false, local157);
					anIntArray256[anInt2922++] = Static145.aFrame4 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static145.aFrame4 != null) {
						Static335.method4379(Static130.aClass153_Sub1_1.anInt5233, -1, false, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2775) Class234[] local2775 = Static98.method1710();
					anIntArray256[anInt2922++] = local2775.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray256[--anInt2922];
					@Pc(2799) Class234[] local2799 = Static98.method1710();
					anIntArray256[anInt2922++] = local2799[local157].anInt6123;
					anIntArray256[anInt2922++] = local2799[local157].anInt6121;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static130.aClass153_Sub1_1.anInt5241;
					local192 = Static130.aClass153_Sub1_1.anInt5239;
					local89 = -1;
					@Pc(2836) Class234[] local2836 = Static98.method1710();
					for (local2691 = 0; local2691 < local2836.length; local2691++) {
						@Pc(2843) Class234 local2843 = local2836[local2691];
						if (local2843.anInt6123 == local157 && local2843.anInt6121 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray256[anInt2922++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray256[anInt2922++] = Static120.method1994();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray256[--anInt2922];
					if (local157 >= 1 && local157 <= 2) {
						Static335.method4379(local157, -1, false, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.anInt5233;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray256[--anInt2922];
					if (local157 >= 1 && local157 <= 2) {
						Static130.aClass153_Sub1_1.anInt5233 = local157;
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						return;
					}
					return;
				}
			} else {
				@Pc(3351) String local3351;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt2934 -= 2;
						local75 = aStringArray23[anInt2934];
						local81 = aStringArray23[anInt2934 + 1];
						local89 = anIntArray256[--anInt2922];
						Static81.method1414(Static252.aClass2_67);
						Static255.aClass7_Sub14_Sub1_2.method3970(Static268.method3593(local75) + Static268.method3593(local81) + 1);
						Static255.aClass7_Sub14_Sub1_2.method3947(local75);
						Static255.aClass7_Sub14_Sub1_2.method3947(local81);
						Static255.aClass7_Sub14_Sub1_2.method3970(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt2922 -= 2;
						Static180.aShortArray63[anIntArray256[anInt2922]] = (short) Static283.method3743(anIntArray256[anInt2922 + 1]);
						Static259.aClass206_2.method4318();
						Static259.aClass206_2.method4325();
						Static442.aClass98_1.method2240();
						Static193.method2788();
						return;
					}
					if (arg0 == 5405) {
						anInt2922 -= 2;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static412.anIntArrayArrayArray13[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt2922 -= 7;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1] << 1;
						local89 = anIntArray256[anInt2922 + 2];
						local95 = anIntArray256[anInt2922 + 3];
						local2691 = anIntArray256[anInt2922 + 4];
						@Pc(3111) int local3111 = anIntArray256[anInt2922 + 5];
						@Pc(3117) int local3117 = anIntArray256[anInt2922 + 6];
						if (local157 >= 0 && local157 < 2 && Static412.anIntArrayArrayArray13[local157] != null && local192 >= 0 && local192 < Static412.anIntArrayArrayArray13[local157].length) {
							Static412.anIntArrayArrayArray13[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3117 };
							Static412.anIntArrayArrayArray13[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3111, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static412.anIntArrayArrayArray13[anIntArray256[--anInt2922]].length >> 1;
						anIntArray256[anInt2922++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static145.aFrame4 != null) {
							Static335.method4379(Static130.aClass153_Sub1_1.anInt5233, -1, false, -1);
						}
						if (Static452.aFrame5 != null) {
							Static157.method2340();
							System.exit(0);
							return;
						}
						local75 = Static457.aString73 == null ? Static178.method2596() : Static457.aString73;
						Static361.method4643(false, Static377.anInt6113 == 1, Static230.aClass61_4, local75);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static421.aClass236_7 != null) {
							if (Static421.aClass236_7.anObject8 == null) {
								local75 = Static189.method4310(Static421.aClass236_7.anInt6180);
							} else {
								local75 = (String) Static421.aClass236_7.anObject8;
							}
						}
						aStringArray23[anInt2934++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray256[anInt2922++] = Static85.anInt1679 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static145.aFrame4 != null) {
							Static335.method4379(Static130.aClass153_Sub1_1.anInt5233, -1, false, -1);
						}
						local75 = aStringArray23[--anInt2934];
						local1313 = anIntArray256[--anInt2922] == 1;
						local3351 = Static178.method2596() + local75;
						Static361.method4643(local1313, Static377.anInt6113 == 1, Static230.aClass61_4, local3351);
						return;
					}
					if (arg0 == 5422) {
						anInt2934 -= 2;
						local75 = aStringArray23[anInt2934];
						local81 = aStringArray23[anInt2934 + 1];
						local89 = anIntArray256[--anInt2922];
						if (local75.length() > 0) {
							if (Static209.aStringArray32 == null) {
								Static209.aStringArray32 = new String[Static71.anIntArray102[Static191.aClass137_3.anInt3868]];
							}
							Static209.aStringArray32[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static317.aStringArray42 == null) {
								Static317.aStringArray42 = new String[Static71.anIntArray102[Static191.aClass137_3.anInt3868]];
							}
							Static317.aStringArray42[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray23[--anInt2934]);
						return;
					}
					if (arg0 == 5424) {
						anInt2922 -= 11;
						Static366.anInt5866 = anIntArray256[anInt2922];
						Static259.anInt4366 = anIntArray256[anInt2922 + 1];
						Static427.anInt7127 = anIntArray256[anInt2922 + 2];
						Static4.anInt7499 = anIntArray256[anInt2922 + 3];
						Static426.anInt7021 = anIntArray256[anInt2922 + 4];
						Static127.anInt2463 = anIntArray256[anInt2922 + 5];
						Static322.anInt5340 = anIntArray256[anInt2922 + 6];
						Static374.anInt6088 = anIntArray256[anInt2922 + 7];
						Static220.anInt3888 = anIntArray256[anInt2922 + 8];
						Static233.anInt5381 = anIntArray256[anInt2922 + 9];
						Static413.anInt6557 = anIntArray256[anInt2922 + 10];
						Static25.aClass178_9.method3848(Static426.anInt7021);
						Static25.aClass178_9.method3848(Static127.anInt2463);
						Static25.aClass178_9.method3848(Static322.anInt5340);
						Static25.aClass178_9.method3848(Static374.anInt6088);
						Static25.aClass178_9.method3848(Static220.anInt3888);
						Static218.aClass11_13 = null;
						Static245.aClass11_14 = null;
						Static293.aClass11_15 = null;
						Static21.aClass11_2 = null;
						Static368.aClass11_19 = null;
						Static446.aClass11_20 = null;
						Static336.aClass11_17 = null;
						Static3.aClass11_1 = null;
						Static425.aBoolean471 = true;
						return;
					}
					if (arg0 == 5425) {
						Static292.method3874();
						Static425.aBoolean471 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt2922 -= 2;
						Static313.anInt5179 = anIntArray256[anInt2922];
						Static357.anInt5687 = anIntArray256[anInt2922 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt2922 -= 2;
						Static296.anInt4919 = anIntArray256[anInt2922 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt2922 -= 2;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						anIntArray256[anInt2922++] = Static211.method3038(local157, local192) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static167.method2414(aStringArray23[--anInt2934], false, false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static468.method5098(Static230.aClass61_4.anApplet1, "accountcreated");
							return;
						} catch (@Pc(3646) Throwable local3646) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt2922 -= 4;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						local89 = anIntArray256[anInt2922 + 2];
						local95 = anIntArray256[anInt2922 + 3];
						Static442.method5639(local95, (local157 & 0x3FFF) - Static314.anInt5181, false, (local157 >> 14 & 0x3FFF) - Static359.anInt5713, local89, local192);
						return;
					}
					if (arg0 == 5501) {
						anInt2922 -= 4;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						local89 = anIntArray256[anInt2922 + 2];
						local95 = anIntArray256[anInt2922 + 3];
						Static350.method4524(local192, (local157 >> 14 & 0x3FFF) - Static359.anInt5713, local89, local95, (local157 & 0x3FFF) - Static314.anInt5181);
						return;
					}
					if (arg0 == 5502) {
						anInt2922 -= 6;
						local157 = anIntArray256[anInt2922];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static31.anInt529 = local157;
						local192 = anIntArray256[anInt2922 + 1];
						if (local192 + 1 >= Static412.anIntArrayArrayArray13[Static31.anInt529].length >> 1) {
							throw new RuntimeException();
						}
						Static79.anInt1608 = local192;
						Static392.anInt6271 = 0;
						Static53.anInt3263 = anIntArray256[anInt2922 + 2];
						Static69.anInt1362 = anIntArray256[anInt2922 + 3];
						local89 = anIntArray256[anInt2922 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static352.anInt5640 = local89;
						local95 = anIntArray256[anInt2922 + 5];
						if (local95 + 1 >= Static412.anIntArrayArrayArray13[Static352.anInt5640].length >> 1) {
							throw new RuntimeException();
						}
						Static77.anInt1587 = local95;
						Static9.anInt60 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static362.method4645();
						return;
					}
					if (arg0 == 5504) {
						anInt2922 -= 2;
						Static68.method1151(anIntArray256[anInt2922], anIntArray256[anInt2922 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray256[anInt2922++] = (int) Static67.aFloat36 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray256[anInt2922++] = (int) Static97.aFloat52 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static410.method5153();
						return;
					}
					if (arg0 == 5508) {
						Static247.method4215();
						return;
					}
					if (arg0 == 5509) {
						Static137.method2148();
						return;
					}
					if (arg0 == 5510) {
						Static258.method3435();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray256[--anInt2922];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static359.anInt5713;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static333.anInt3375) {
							local192 = Static333.anInt3375;
						}
						local89 -= Static314.anInt5181;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static102.anInt2086) {
							local89 = Static102.anInt2086;
						}
						Static197.anInt3481 = (local192 << 7) + 64;
						Static17.anInt264 = (local89 << 7) + 64;
						Static9.anInt60 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static359.method4613();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt2934 -= 2;
						local75 = aStringArray23[anInt2934];
						local81 = aStringArray23[anInt2934 + 1];
						local89 = anIntArray256[--anInt2922];
						if (Static206.anInt3642 != 2) {
							return;
						}
						if (Static64.anInt1229 == 0 && Static196.anInt3465 == 0) {
							Static199.aString38 = local75;
							Static308.aString53 = local81;
							Static233.anInt5382 = local89;
							Static138.method2151(5);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static344.method4450();
						return;
					}
					if (arg0 == 5602) {
						if (Static64.anInt1229 == 0) {
							Static250.anInt4247 = -2;
							Static445.anInt1109 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt2922 -= 4;
						if (Static206.anInt3642 != 2) {
							return;
						}
						if (Static64.anInt1229 == 0 && Static196.anInt3465 == 0) {
							Static372.method4776(anIntArray256[anInt2922], anIntArray256[anInt2922 + 2], anIntArray256[anInt2922 + 1], anIntArray256[anInt2922 + 3]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt2934--;
						if (Static206.anInt3642 != 2) {
							return;
						}
						if (Static64.anInt1229 == 0 && Static196.anInt3465 == 0) {
							Static12.method106(Static301.method4015(aStringArray23[anInt2934]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt2934 -= 3;
						anInt2922 -= 7;
						if (Static206.anInt3642 != 2) {
							return;
						}
						if (Static64.anInt1229 == 0 && Static196.anInt3465 == 0) {
							Static30.method395(anIntArray256[anInt2922 + 5] == 1, false, anIntArray256[anInt2922 + 3], anIntArray256[anInt2922 + 2], aStringArray23[anInt2934 + 1], Static301.method4015(aStringArray23[anInt2934]), anIntArray256[anInt2922 + 1], anIntArray256[anInt2922 + 4] == 1, anIntArray256[anInt2922 + 6] == 1, aStringArray23[anInt2934 + 2], anIntArray256[anInt2922]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static196.anInt3465 == 0) {
							Static179.anInt7441 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray256[anInt2922++] = Static445.anInt1109;
						return;
					}
					if (arg0 == 5608) {
						anIntArray256[anInt2922++] = Static432.anInt7270;
						return;
					}
					if (arg0 == 5609) {
						anIntArray256[anInt2922++] = Static179.anInt7441;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray23[anInt2934++] = Static347.aStringArray48.length > local157 ? Static330.method4333(Static347.aStringArray48[local157]) : "";
						}
						Static347.aStringArray48 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray256[anInt2922++] = Static164.anInt2971;
						return;
					}
					if (arg0 == 5612) {
						local157 = anIntArray256[--anInt2922];
						if (Static206.anInt3642 != 6) {
							return;
						}
						if (Static64.anInt1229 == 0 && Static196.anInt3465 == 0) {
							if (Static211.aClass247_4 != null) {
								Static211.aClass247_4.method5162();
								Static211.aClass247_4 = null;
							}
							Static233.anInt5382 = local157;
							Static138.method2151(8);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray256[anInt2922++] = Static445.anInt1109;
						return;
					}
					if (arg0 == 5615) {
						anInt2934 -= 2;
						local75 = aStringArray23[anInt2934];
						local81 = aStringArray23[anInt2934 + 1];
						if (Static206.anInt3642 != 2) {
							return;
						}
						if (Static64.anInt1229 == 0 && Static196.anInt3465 == 0) {
							if (Static211.aClass247_4 != null) {
								Static211.aClass247_4.method5162();
								Static211.aClass247_4 = null;
							}
							Static199.aString38 = local75;
							Static308.aString53 = local81;
							Static138.method2151(4);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static362.method4646(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray256[anInt2922++] = Static250.anInt4247;
						return;
					}
					if (arg0 == 5618) {
						local157 = anIntArray256[--anInt2922];
						Static151.method2278(local157, false);
						return;
					}
					if (arg0 == 5619) {
						local157 = anIntArray256[--anInt2922];
						Static151.method2278(local157, true);
						return;
					}
					if (arg0 == 5620) {
						Static173.method2510();
						if (Static189.aString54 != "" && Static189.aString54 != "") {
							anIntArray256[anInt2922++] = 1;
							return;
						}
						anIntArray256[anInt2922++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt2934 -= 3;
						anInt2922 -= 7;
						if (Static206.anInt3642 != 2) {
							return;
						}
						if (Static64.anInt1229 == 0 && Static196.anInt3465 == 0) {
							Static30.method395(anIntArray256[anInt2922 + 5] == 1, true, anIntArray256[anInt2922 + 3], anIntArray256[anInt2922 + 2], aStringArray23[anInt2934 + 1], Static301.method4015(aStringArray23[anInt2934]), anIntArray256[anInt2922 + 1], anIntArray256[anInt2922 + 4] == 1, anIntArray256[anInt2922 + 6] == 1, aStringArray23[anInt2934 + 2], anIntArray256[anInt2922]);
							return;
						}
						return;
					}
					if (arg0 == 5622) {
						@Pc(4550) Class236 local4550 = Static230.aClass61_4.method1456("3", false);
						while (local4550.anInt6178 == 0) {
							Static214.method2089(1L);
						}
						if (local4550.anInt6178 == 2) {
							throw new RuntimeException("Error opening file");
						}
						@Pc(4570) Class266 local4570 = (Class266) local4550.anObject8;
						if (local4570.method5675().exists()) {
							@Pc(4580) Class7_Sub14 local4580 = new Class7_Sub14(50);
							try {
								local4570.method5678(0, 50, local4580.aByteArray75);
							} catch (@Pc(4589) IOException local4589) {
							}
						}
						try {
							local4570.method5674();
							return;
						} catch (@Pc(4595) Exception local4595) {
							return;
						}
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray256[--anInt2922];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static130.aClass153_Sub1_1.anInt5250 = local157;
						Static145.method2628();
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6002) {
						Static130.aClass153_Sub1_1.method4231(anIntArray256[--anInt2922] == 1);
						Static145.method2628();
						Static456.method5792();
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6003) {
						Static130.aClass153_Sub1_1.aBoolean349 = anIntArray256[--anInt2922] == 1;
						Static456.method5792();
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6005) {
						Static130.aClass153_Sub1_1.aBoolean347 = anIntArray256[--anInt2922] == 1;
						Static145.method2628();
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6006) {
						Static130.aClass153_Sub1_1.aBoolean340 = anIntArray256[--anInt2922] == 1;
						Static269.aClass51_9.method5279(!Static130.aClass153_Sub1_1.aBoolean340);
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6007) {
						Static130.aClass153_Sub1_1.anInt5238 = anIntArray256[--anInt2922];
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6008) {
						Static130.aClass153_Sub1_1.aBoolean354 = anIntArray256[--anInt2922] == 1;
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6009) {
						Static130.aClass153_Sub1_1.aBoolean350 = anIntArray256[--anInt2922] == 1;
						Static145.method2628();
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6010) {
						Static130.aClass153_Sub1_1.aBoolean351 = anIntArray256[--anInt2922] == 1;
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray256[--anInt2922];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static130.aClass153_Sub1_1.method4220(Static377.anInt6113, local157);
						Static145.method2628();
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6012) {
						Static130.aClass153_Sub1_1.method4219(Static377.anInt6113, anIntArray256[--anInt2922] == 1);
						Static281.method5553();
						Static379.method4655();
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6014) {
						Static130.aClass153_Sub1_1.aBoolean341 = anIntArray256[--anInt2922] == 1;
						Static145.method2628();
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6015) {
						Static130.aClass153_Sub1_1.aBoolean343 = anIntArray256[--anInt2922] == 1;
						Static145.method2628();
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray256[--anInt2922];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static130.aClass153_Sub1_1.anInt5244 = local157;
						Static90.method1613(Static377.anInt6113);
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						return;
					}
					if (arg0 == 6017) {
						Static130.aClass153_Sub1_1.aBoolean344 = anIntArray256[--anInt2922] == 1;
						Static156.method2337();
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray256[--anInt2922];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static130.aClass153_Sub1_1.anInt5237 = local157;
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray256[--anInt2922];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static130.aClass153_Sub1_1.anInt5240) {
							if (Static130.aClass153_Sub1_1.anInt5240 == 0 && Static128.anInt2476 != -1) {
								Static96.method1689(Static128.anInt2476, Static122.aClass178_39, local157);
								Static226.aBoolean244 = false;
							} else if (local157 == 0) {
								Static16.method5101();
								Static226.aBoolean244 = false;
							} else {
								Static272.method3649(local157);
							}
							Static130.aClass153_Sub1_1.anInt5240 = local157;
						}
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray256[--anInt2922];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static130.aClass153_Sub1_1.anInt5246 = local157;
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6021) {
						Static130.aClass153_Sub1_1.aBoolean356 = anIntArray256[--anInt2922] == 1;
						Static456.method5792();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray256[--anInt2922];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static268.anInt4537 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static36.method513(local157);
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						anIntArray256[anInt2922++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray256[--anInt2922];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static130.aClass153_Sub1_1.anInt5242 = local157;
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray256[--anInt2922];
						if (local157 < 0 || local157 > Static435.method5603(Static268.anInt4537)) {
							local157 = 0;
						}
						Static130.aClass153_Sub1_1.anInt5234 = local157;
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray256[--anInt2922];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static143.method2214(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static130.aClass153_Sub1_1.aBoolean353 = anIntArray256[--anInt2922] != 0;
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						return;
					}
					if (arg0 == 6029) {
						Static130.aClass153_Sub1_1.anInt5238 = anIntArray256[--anInt2922];
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						return;
					}
					if (arg0 == 6030) {
						Static130.aClass153_Sub1_1.aBoolean348 = anIntArray256[--anInt2922] != 0;
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static145.method2628();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray256[--anInt2922];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static90.method1613(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray256[--anInt2922];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static130.aClass153_Sub1_1.anInt5245 = local157;
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray256[--anInt2922];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static130.aClass153_Sub1_1.anInt5230 = local157;
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						return;
					}
					if (arg0 == 6034) {
						Static130.aClass153_Sub1_1.aBoolean338 = anIntArray256[--anInt2922] == 1;
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						Static281.method5553();
						Static169.aBoolean182 = false;
						return;
					}
					if (arg0 == 6035) {
						Static130.aClass153_Sub1_1.aBoolean355 = anIntArray256[--anInt2922] == 1;
						Static145.method2628();
						Static456.method5792();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.anInt5250;
						return;
					}
					if (arg0 == 6102) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.method4227(Static377.anInt6113) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.aBoolean349 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.aBoolean347 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.aBoolean340 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.anInt5238;
						return;
					}
					if (arg0 == 6108) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.aBoolean354 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.aBoolean350 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.aBoolean351 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.method4217(Static377.anInt6113);
						return;
					}
					if (arg0 == 6112) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.method4218(Static377.anInt6113) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.aBoolean341 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.aBoolean343 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.anInt5244;
						return;
					}
					if (arg0 == 6117) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.aBoolean344 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.anInt5237;
						return;
					}
					if (arg0 == 6119) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.anInt5240;
						return;
					}
					if (arg0 == 6120) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.anInt5246;
						return;
					}
					if (arg0 == 6121) {
						anIntArray256[anInt2922++] = Static269.aClass51_9.method5321() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray256[anInt2922++] = Static35.method3785();
						return;
					}
					if (arg0 == 6124) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.anInt5242;
						return;
					}
					if (arg0 == 6125) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.anInt5234;
						return;
					}
					if (arg0 == 6126) {
						anIntArray256[anInt2922++] = Static269.aClass51_9.method5327() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.aBoolean352 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.aBoolean353 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.anInt5238;
						return;
					}
					if (arg0 == 6130) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.aBoolean348 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray256[anInt2922++] = Static377.anInt6113;
						return;
					}
					if (arg0 == 6132) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.anInt5245;
						return;
					}
					if (arg0 == 6133) {
						anIntArray256[anInt2922++] = Static85.anInt1679 == 1 || Static85.anInt1679 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray256[anInt2922++] = Static435.method5603(Static268.anInt4537);
						return;
					}
					if (arg0 == 6135) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.anInt5230;
						return;
					}
					if (arg0 == 6136) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.aBoolean338 ? 1 : 0;
						return;
					}
					if (arg0 == 6137) {
						@Pc(5985) boolean local5985 = true;
						try {
							local5985 = jagmisc.getTotalPhysicalMemory() > 268435456L;
						} catch (@Pc(5995) Throwable local5995) {
						}
						anIntArray256[anInt2922++] = local5985 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt2922 -= 2;
						Static343.aShort68 = (short) anIntArray256[anInt2922];
						if (Static343.aShort68 <= 0) {
							Static343.aShort68 = 256;
						}
						Static6.aShort1 = (short) anIntArray256[anInt2922 + 1];
						if (Static6.aShort1 <= 0) {
							Static6.aShort1 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt2922 -= 2;
						Static395.aShort89 = (short) anIntArray256[anInt2922];
						if (Static395.aShort89 <= 0) {
							Static395.aShort89 = 256;
						}
						Static134.aShort33 = (short) anIntArray256[anInt2922 + 1];
						if (Static134.aShort33 <= 0) {
							Static134.aShort33 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt2922 -= 4;
						Static76.aShort23 = (short) anIntArray256[anInt2922];
						if (Static76.aShort23 <= 0) {
							Static76.aShort23 = 1;
						}
						Static46.aShort12 = (short) anIntArray256[anInt2922 + 1];
						if (Static46.aShort12 <= 0) {
							Static46.aShort12 = 32767;
						} else if (Static46.aShort12 < Static76.aShort23) {
							Static46.aShort12 = Static76.aShort23;
						}
						Static371.aShort84 = (short) anIntArray256[anInt2922 + 2];
						if (Static371.aShort84 <= 0) {
							Static371.aShort84 = 1;
						}
						Static26.aShort2 = (short) anIntArray256[anInt2922 + 3];
						if (Static26.aShort2 <= 0) {
							Static26.aShort2 = 32767;
							return;
						}
						if (Static26.aShort2 < Static371.aShort84) {
							Static26.aShort2 = Static371.aShort84;
						}
						return;
					}
					if (arg0 == 6203) {
						Static89.method1592(Static119.aClass95_3.anInt2595, 0, false, Static119.aClass95_3.anInt2638, 0);
						anIntArray256[anInt2922++] = Static269.anInt4578;
						anIntArray256[anInt2922++] = Static180.anInt3243;
						return;
					}
					if (arg0 == 6204) {
						anIntArray256[anInt2922++] = Static395.aShort89;
						anIntArray256[anInt2922++] = Static134.aShort33;
						return;
					}
					if (arg0 == 6205) {
						anIntArray256[anInt2922++] = Static343.aShort68;
						anIntArray256[anInt2922++] = Static6.aShort1;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray256[anInt2922++] = (int) (Static158.method2342() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray256[anInt2922++] = (int) (Static158.method2342() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt2922 -= 3;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						local89 = anIntArray256[anInt2922 + 2];
						aCalendar2.clear();
						aCalendar2.set(11, 12);
						aCalendar2.set(local89, local192, local157);
						anIntArray256[anInt2922++] = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6303) {
						aCalendar2.clear();
						aCalendar2.setTime(new Date(Static158.method2342()));
						anIntArray256[anInt2922++] = aCalendar2.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray256[--anInt2922];
						local1313 = true;
						if (local157 < 0) {
							local1313 = (local157 + 1) % 4 == 0;
						} else if (local157 < 1582) {
							local1313 = local157 % 4 == 0;
						} else if (local157 % 4 != 0) {
							local1313 = false;
						} else if (local157 % 100 != 0) {
							local1313 = true;
						} else if (local157 % 400 != 0) {
							local1313 = false;
						}
						anIntArray256[anInt2922++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray256[anInt2922++] = Static166.method2399() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray256[anInt2922++] = Static78.method1383() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static206.anInt3642 == 6 && Static64.anInt1229 == 0 && Static196.anInt3465 == 0) {
							if (Static202.aBoolean217) {
								anIntArray256[anInt2922++] = 0;
								return;
							}
							if (Static56.aLong37 > Static158.method2342() - 1000L) {
								anIntArray256[anInt2922++] = 1;
								return;
							}
							Static202.aBoolean217 = true;
							Static81.method1414(Static71.aClass2_27);
							Static255.aClass7_Sub14_Sub1_2.method3933(Static281.anInt7178);
							anIntArray256[anInt2922++] = 0;
							return;
						}
						anIntArray256[anInt2922++] = 1;
						return;
					}
					@Pc(6522) Class97 local6522;
					@Pc(6489) Class19_Sub1 local6489;
					if (arg0 == 6501) {
						local6489 = Static18.method199();
						if (local6489 != null) {
							anIntArray256[anInt2922++] = local6489.anInt2225;
							anIntArray256[anInt2922++] = local6489.anInt2207;
							aStringArray23[anInt2934++] = local6489.aString19;
							local6522 = local6489.method1892();
							anIntArray256[anInt2922++] = local6522.anInt2743;
							aStringArray23[anInt2934++] = local6522.aString33;
							anIntArray256[anInt2922++] = local6489.anInt2214;
							anIntArray256[anInt2922++] = local6489.anInt2228;
							aStringArray23[anInt2934++] = local6489.aString18;
							return;
						}
						anIntArray256[anInt2922++] = -1;
						anIntArray256[anInt2922++] = 0;
						aStringArray23[anInt2934++] = "";
						anIntArray256[anInt2922++] = 0;
						aStringArray23[anInt2934++] = "";
						anIntArray256[anInt2922++] = 0;
						anIntArray256[anInt2922++] = 0;
						aStringArray23[anInt2934++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6489 = Static195.method2808();
						if (local6489 != null) {
							anIntArray256[anInt2922++] = local6489.anInt2225;
							anIntArray256[anInt2922++] = local6489.anInt2207;
							aStringArray23[anInt2934++] = local6489.aString19;
							local6522 = local6489.method1892();
							anIntArray256[anInt2922++] = local6522.anInt2743;
							aStringArray23[anInt2934++] = local6522.aString33;
							anIntArray256[anInt2922++] = local6489.anInt2214;
							anIntArray256[anInt2922++] = local6489.anInt2228;
							aStringArray23[anInt2934++] = local6489.aString18;
							return;
						}
						anIntArray256[anInt2922++] = -1;
						anIntArray256[anInt2922++] = 0;
						aStringArray23[anInt2934++] = "";
						anIntArray256[anInt2922++] = 0;
						aStringArray23[anInt2934++] = "";
						anIntArray256[anInt2922++] = 0;
						anIntArray256[anInt2922++] = 0;
						aStringArray23[anInt2934++] = "";
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray256[--anInt2922];
						local81 = aStringArray23[--anInt2934];
						if (Static206.anInt3642 == 6 && Static64.anInt1229 == 0 && Static196.anInt3465 == 0) {
							anIntArray256[anInt2922++] = Static410.method5160(local81, local157) ? 1 : 0;
							return;
						}
						anIntArray256[anInt2922++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static130.aClass153_Sub1_1.anInt5231 = anIntArray256[--anInt2922];
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						return;
					}
					if (arg0 == 6505) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.anInt5231;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray256[--anInt2922];
						@Pc(6879) Class19_Sub1 local6879 = Static333.method2746(local157);
						if (local6879 != null) {
							anIntArray256[anInt2922++] = local6879.anInt2207;
							aStringArray23[anInt2934++] = local6879.aString19;
							@Pc(6903) Class97 local6903 = local6879.method1892();
							anIntArray256[anInt2922++] = local6903.anInt2743;
							aStringArray23[anInt2934++] = local6903.aString33;
							anIntArray256[anInt2922++] = local6879.anInt2214;
							anIntArray256[anInt2922++] = local6879.anInt2228;
							aStringArray23[anInt2934++] = local6879.aString18;
							return;
						}
						anIntArray256[anInt2922++] = -1;
						aStringArray23[anInt2934++] = "";
						anIntArray256[anInt2922++] = 0;
						aStringArray23[anInt2934++] = "";
						anIntArray256[anInt2922++] = 0;
						anIntArray256[anInt2922++] = 0;
						aStringArray23[anInt2934++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt2922 -= 4;
						local157 = anIntArray256[anInt2922];
						local1313 = anIntArray256[anInt2922 + 1] == 1;
						local89 = anIntArray256[anInt2922 + 2];
						local1965 = anIntArray256[anInt2922 + 3] == 1;
						Static78.method1380(local89, local1965, local1313, local157);
						return;
					}
					if (arg0 == 6508) {
						Static20.method1884();
						return;
					}
					if (arg0 == 6509) {
						if (Static206.anInt3642 != 6) {
							return;
						}
						Static178.aBoolean197 = anIntArray256[--anInt2922] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static130.aClass153_Sub1_1.aBoolean337 = anIntArray256[--anInt2922] == 1;
						Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
						return;
					}
					if (arg0 == 6601) {
						anIntArray256[anInt2922++] = Static130.aClass153_Sub1_1.aBoolean337 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static451.aClass181_7 == Static258.aClass181_4) {
					if (arg0 == 6700) {
						local157 = Static23.aClass164_3.method3515();
						if (Static183.anInt3293 != -1) {
							local157++;
						}
						anIntArray256[anInt2922++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray256[--anInt2922];
						if (Static183.anInt3293 != -1) {
							if (local157 == 0) {
								anIntArray256[anInt2922++] = Static183.anInt3293;
								return;
							}
							local157--;
						}
						@Pc(7178) Class7_Sub44 local7178 = (Class7_Sub44) Static23.aClass164_3.method3514();
						while (local157-- > 0) {
							local7178 = (Class7_Sub44) Static23.aClass164_3.method3519();
						}
						anIntArray256[anInt2922++] = local7178.anInt7165;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray256[--anInt2922];
						if (Static294.aClass95ArrayArray3[local157] == null) {
							aStringArray23[anInt2934++] = "";
							return;
						}
						local81 = Static294.aClass95ArrayArray3[local157][0].aString27;
						if (local81 == null) {
							aStringArray23[anInt2934++] = "";
							return;
						}
						aStringArray23[anInt2934++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray256[--anInt2922];
						if (Static294.aClass95ArrayArray3[local157] == null) {
							anIntArray256[anInt2922++] = 0;
							return;
						}
						anIntArray256[anInt2922++] = Static294.aClass95ArrayArray3[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt2922 -= 2;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						if (Static294.aClass95ArrayArray3[local157] == null) {
							aStringArray23[anInt2934++] = "";
							return;
						}
						local3351 = Static294.aClass95ArrayArray3[local157][local192].aString27;
						if (local3351 == null) {
							aStringArray23[anInt2934++] = "";
							return;
						}
						aStringArray23[anInt2934++] = local3351;
						return;
					}
					if (arg0 == 6705) {
						anInt2922 -= 2;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						if (Static294.aClass95ArrayArray3[local157] == null) {
							anIntArray256[anInt2922++] = 0;
							return;
						}
						anIntArray256[anInt2922++] = Static294.aClass95ArrayArray3[local157][local192].anInt2657;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt2922 -= 3;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						local89 = anIntArray256[anInt2922 + 2];
						Static10.method92(local157 << 16 | local192, "", local89, 1);
						return;
					}
					if (arg0 == 6708) {
						anInt2922 -= 3;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						local89 = anIntArray256[anInt2922 + 2];
						Static10.method92(local157 << 16 | local192, "", local89, 2);
						return;
					}
					if (arg0 == 6709) {
						anInt2922 -= 3;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						local89 = anIntArray256[anInt2922 + 2];
						Static10.method92(local157 << 16 | local192, "", local89, 3);
						return;
					}
					if (arg0 == 6710) {
						anInt2922 -= 3;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						local89 = anIntArray256[anInt2922 + 2];
						Static10.method92(local157 << 16 | local192, "", local89, 4);
						return;
					}
					if (arg0 == 6711) {
						anInt2922 -= 3;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						local89 = anIntArray256[anInt2922 + 2];
						Static10.method92(local157 << 16 | local192, "", local89, 5);
						return;
					}
					if (arg0 == 6712) {
						anInt2922 -= 3;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						local89 = anIntArray256[anInt2922 + 2];
						Static10.method92(local157 << 16 | local192, "", local89, 6);
						return;
					}
					if (arg0 == 6713) {
						anInt2922 -= 3;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						local89 = anIntArray256[anInt2922 + 2];
						Static10.method92(local157 << 16 | local192, "", local89, 7);
						return;
					}
					if (arg0 == 6714) {
						anInt2922 -= 3;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						local89 = anIntArray256[anInt2922 + 2];
						Static10.method92(local157 << 16 | local192, "", local89, 8);
						return;
					}
					if (arg0 == 6715) {
						anInt2922 -= 3;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						local89 = anIntArray256[anInt2922 + 2];
						Static10.method92(local157 << 16 | local192, "", local89, 9);
						return;
					}
					if (arg0 == 6716) {
						anInt2922 -= 3;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						local89 = anIntArray256[anInt2922 + 2];
						Static10.method92(local157 << 16 | local192, "", local89, 10);
						return;
					}
					if (arg0 == 6717) {
						anInt2922 -= 3;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						local89 = anIntArray256[anInt2922 + 2];
						@Pc(7766) Class95 local7766 = Static407.method5110(local157 << 16 | local192, local89);
						Static23.method249();
						@Pc(7771) Class7_Sub16 local7771 = Static52.method725(local7766);
						Static201.method2883(local7771.method1903(), local7766, local7771.anInt2247);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7799) Class20 local7799;
					if (arg0 == 6800) {
						local157 = anIntArray256[--anInt2922];
						local7799 = Static106.aClass62_3.method1481(local157);
						if (local7799.aString2 == null) {
							aStringArray23[anInt2934++] = "";
							return;
						}
						aStringArray23[anInt2934++] = local7799.aString2;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray256[--anInt2922];
						local7799 = Static106.aClass62_3.method1481(local157);
						anIntArray256[anInt2922++] = local7799.anInt295;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray256[--anInt2922];
						local7799 = Static106.aClass62_3.method1481(local157);
						anIntArray256[anInt2922++] = local7799.anInt287;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray256[--anInt2922];
						local7799 = Static106.aClass62_3.method1481(local157);
						anIntArray256[anInt2922++] = local7799.anInt314;
						return;
					}
					if (arg0 == 6804) {
						anInt2922 -= 2;
						local157 = anIntArray256[anInt2922];
						local192 = anIntArray256[anInt2922 + 1];
						@Pc(7921) Class256 local7921 = Static443.aClass193_4.method4068(local192);
						if (local7921.method5444()) {
							aStringArray23[anInt2934++] = Static106.aClass62_3.method1481(local157).method217(local7921.aString67, local192);
							return;
						}
						anIntArray256[anInt2922++] = Static106.aClass62_3.method1481(local157).method224(local192, local7921.anInt6961);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray256[anInt2922++] = Static148.aBoolean171 && !Static419.aBoolean437 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray256[anInt2922++] = Static301.anInt5053;
						return;
					}
					if (arg0 == 6902) {
						anIntArray256[anInt2922++] = Static206.anInt3636;
						return;
					}
					if (arg0 == 6903) {
						anIntArray256[anInt2922++] = Static323.anInt5342;
						return;
					}
					if (arg0 == 6904) {
						anIntArray256[anInt2922++] = Static147.anInt2782;
						return;
					}
					if (arg0 == 6905) {
						local75 = "";
						if (Static421.aClass236_7 != null) {
							if (Static421.aClass236_7.anObject8 == null) {
								local75 = Static189.method4310(Static421.aClass236_7.anInt6180);
							} else {
								local75 = (String) Static421.aClass236_7.anObject8;
							}
						}
						aStringArray23[anInt2934++] = local75;
						return;
					}
					if (arg0 == 6906) {
						anIntArray256[anInt2922++] = Static383.anInt6160;
						return;
					}
					if (arg0 == 6907) {
						anIntArray256[anInt2922++] = Static338.anInt5484;
						return;
					}
					if (arg0 == 6908) {
						anIntArray256[anInt2922++] = Static451.anInt7440;
						return;
					}
					if (arg0 == 6909) {
						anIntArray256[anInt2922++] = Static118.aBoolean132 ? 1 : 0;
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!gb;I)V")
	private static void method2345(@OriginalArg(0) Class7_Sub18 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class7_Sub4_Sub16 local12 = Static299.method3995(local8);
		if (local12 == null) {
			return;
		}
		anIntArray255 = new int[local12.anInt6298];
		@Pc(21) int local21 = 0;
		aStringArray22 = new String[local12.anInt6301];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt2469;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt2474;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass95_5 == null ? -1 : arg0.aClass95_5.anInt2583;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2472;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass95_5 == null ? -1 : arg0.aClass95_5.anInt2602;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass95_4 == null ? -1 : arg0.aClass95_4.anInt2583;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass95_4 == null ? -1 : arg0.aClass95_4.anInt2602;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt2475;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt2473;
				}
				anIntArray255[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString23;
				}
				aStringArray22[local27++] = local135;
			}
		}
		anInt2936 = arg0.anInt2471;
		method2346(local12, arg1);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!tq;I)V")
	private static void method2346(@OriginalArg(0) Class7_Sub4_Sub16 arg0, @OriginalArg(1) int arg1) {
		anInt2922 = 0;
		anInt2934 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray567;
		@Pc(11) int[] local11 = arg0.anIntArray568;
		@Pc(13) byte local13 = -1;
		anInt2928 = 0;
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
						method2355(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method2344(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray256[anInt2922++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray256[anInt2922++] = Static224.aClass239_7.anIntArray564[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static224.aClass239_7.method4995(anIntArray256[--anInt2922], local54);
					} else if (local31 == 3) {
						aStringArray23[anInt2934++] = arg0.aStringArray50[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt2922 -= 2;
						if (anIntArray256[anInt2922] != anIntArray256[anInt2922 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt2922 -= 2;
						if (anIntArray256[anInt2922] == anIntArray256[anInt2922 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt2922 -= 2;
						if (anIntArray256[anInt2922] < anIntArray256[anInt2922 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt2922 -= 2;
						if (anIntArray256[anInt2922] > anIntArray256[anInt2922 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt2928 == 0) {
							return;
						}
						@Pc(216) Class38 local216 = aClass38Array1[--anInt2928];
						arg0 = local216.aClass7_Sub4_Sub16_1;
						local8 = arg0.anIntArray567;
						local11 = arg0.anIntArray568;
						local5 = local216.anInt736;
						anIntArray255 = local216.anIntArray69;
						aStringArray22 = local216.aStringArray2;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray256[anInt2922++] = Static224.aClass239_7.method4992(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static224.aClass239_7.method4998(anIntArray256[--anInt2922], local54);
					} else if (local31 == 31) {
						anInt2922 -= 2;
						if (anIntArray256[anInt2922] <= anIntArray256[anInt2922 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt2922 -= 2;
						if (anIntArray256[anInt2922] >= anIntArray256[anInt2922 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray256[anInt2922++] = anIntArray255[local11[local5]];
					} else if (local31 == 34) {
						anIntArray255[local11[local5]] = anIntArray256[--anInt2922];
					} else if (local31 == 35) {
						aStringArray23[anInt2934++] = aStringArray22[local11[local5]];
					} else if (local31 == 36) {
						aStringArray22[local11[local5]] = aStringArray23[--anInt2934];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt2934 -= local54;
						@Pc(400) String local400 = Static332.method4371(aStringArray23, local54, anInt2934);
						aStringArray23[anInt2934++] = local400;
					} else if (local31 == 38) {
						anInt2922--;
					} else if (local31 == 39) {
						anInt2934--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class7_Sub4_Sub16 local436 = Static299.method3995(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt6298];
							@Pc(450) String[] local450 = new String[local436.anInt6301];
							for (local452 = 0; local452 < local436.anInt6296; local452++) {
								local446[local452] = anIntArray256[anInt2922 + local452 - local436.anInt6296];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt6302; local471++) {
								local450[local471] = aStringArray23[anInt2934 + local471 - local436.anInt6302];
							}
							anInt2922 -= local436.anInt6296;
							anInt2934 -= local436.anInt6302;
							@Pc(502) Class38 local502 = new Class38();
							local502.aClass7_Sub4_Sub16_1 = arg0;
							local502.anInt736 = local5;
							local502.anIntArray69 = anIntArray255;
							local502.aStringArray2 = aStringArray22;
							if (anInt2928 >= aClass38Array1.length) {
								throw new RuntimeException();
							}
							aClass38Array1[anInt2928++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray567;
							local11 = local436.anIntArray568;
							local5 = -1;
							anIntArray255 = local446;
							aStringArray22 = local450;
						} else if (local31 == 42) {
							anIntArray256[anInt2922++] = Static101.anIntArray136[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static101.anIntArray136[local54] = anIntArray256[--anInt2922];
							Static454.method5775(local54);
							Static351.aBoolean381 |= Static196.aBooleanArray18[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray256[--anInt2922];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray254[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray24[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray256[--anInt2922];
							if (local603 < 0 || local603 >= anIntArray254[local54]) {
								throw new RuntimeException();
							}
							anIntArray256[anInt2922++] = anIntArrayArray24[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt2922 -= 2;
							local603 = anIntArray256[anInt2922];
							if (local603 < 0 || local603 >= anIntArray254[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray24[local54][local603] = anIntArray256[anInt2922 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static91.aStringArray13[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray23[anInt2934++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static91.aStringArray13[local54] = aStringArray23[--anInt2934];
							Static68.method1150(local54);
						} else if (local31 == 51) {
							@Pc(774) Class164 local774 = arg0.aClass164Array1[local11[local5]];
							@Pc(787) Class7_Sub2 local787 = (Class7_Sub2) local774.method3512((long) anIntArray256[--anInt2922]);
							if (local787 != null) {
								local5 += local787.anInt128;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString63 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong230).append(" ");
				for (local603 = anInt2928 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass38Array1[local603].aClass7_Sub4_Sub16_1.aLong230).append(" ");
				}
				local855.append("op: ").append(local13);
				Static419.method5247(local837, local855.toString());
			} else {
				Static90.method1616("Clientscript error in: " + arg0.aString63);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString63).append("\n");
				for (local603 = anInt2928 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass38Array1[local603].aClass7_Sub4_Sub16_1.aString63).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static419.method5247(local837, local855.toString());
				Static269.method3626(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	public static void method2348(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static252.method3355(arg0)) {
			return;
		}
		@Pc(12) Class95[] local12 = Static294.aClass95ArrayArray3[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class95 local19 = local12[local14];
			if (local19.anObjectArray4 != null) {
				@Pc(26) Class7_Sub18 local26 = new Class7_Sub18();
				local26.aClass95_5 = local19;
				local26.anObjectArray1 = local19.anObjectArray4;
				method2345(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method2349(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray24[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "()V")
	public static void method2350() {
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method2351(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static157.anInt2920 == 0 && (Static148.aBoolean171 && !Static419.aBoolean437 || Static22.aBoolean309)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static80.aClass55_37.method1205(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static80.aClass55_37.method1205(0).length());
		} else if (local11.startsWith(Static119.aClass55_53.method1205(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static119.aClass55_53.method1205(0).length());
		} else if (local11.startsWith(Static167.aClass55_67.method1205(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static167.aClass55_67.method1205(0).length());
		} else if (local11.startsWith(Static351.aClass55_120.method1205(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static351.aClass55_120.method1205(0).length());
		} else if (local11.startsWith(Static327.aClass55_116.method1205(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static327.aClass55_116.method1205(0).length());
		} else if (local11.startsWith(Static4.aClass55_152.method1205(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static4.aClass55_152.method1205(0).length());
		} else if (local11.startsWith(Static395.aClass55_130.method1205(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static395.aClass55_130.method1205(0).length());
		} else if (local11.startsWith(Static245.aClass55_91.method1205(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static245.aClass55_91.method1205(0).length());
		} else if (local11.startsWith(Static422.aClass55_139.method1205(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static422.aClass55_139.method1205(0).length());
		} else if (local11.startsWith(Static305.aClass55_144.method1205(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static305.aClass55_144.method1205(0).length());
		} else if (local11.startsWith(Static307.aClass55_108.method1205(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static307.aClass55_108.method1205(0).length());
		} else if (local11.startsWith(Static42.aClass55_22.method1205(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static42.aClass55_22.method1205(0).length());
		} else if (Static5.anInt20 != 0) {
			if (local11.startsWith(Static80.aClass55_37.method1205(Static5.anInt20))) {
				local13 = 0;
				arg0 = arg0.substring(Static80.aClass55_37.method1205(Static5.anInt20).length());
			} else if (local11.startsWith(Static119.aClass55_53.method1205(Static5.anInt20))) {
				local13 = 1;
				arg0 = arg0.substring(Static119.aClass55_53.method1205(Static5.anInt20).length());
			} else if (local11.startsWith(Static167.aClass55_67.method1205(Static5.anInt20))) {
				local13 = 2;
				arg0 = arg0.substring(Static167.aClass55_67.method1205(Static5.anInt20).length());
			} else if (local11.startsWith(Static351.aClass55_120.method1205(Static5.anInt20))) {
				local13 = 3;
				arg0 = arg0.substring(Static351.aClass55_120.method1205(Static5.anInt20).length());
			} else if (local11.startsWith(Static327.aClass55_116.method1205(Static5.anInt20))) {
				local13 = 4;
				arg0 = arg0.substring(Static327.aClass55_116.method1205(Static5.anInt20).length());
			} else if (local11.startsWith(Static4.aClass55_152.method1205(Static5.anInt20))) {
				local13 = 5;
				arg0 = arg0.substring(Static4.aClass55_152.method1205(Static5.anInt20).length());
			} else if (local11.startsWith(Static395.aClass55_130.method1205(Static5.anInt20))) {
				local13 = 6;
				arg0 = arg0.substring(Static395.aClass55_130.method1205(Static5.anInt20).length());
			} else if (local11.startsWith(Static245.aClass55_91.method1205(Static5.anInt20))) {
				local13 = 7;
				arg0 = arg0.substring(Static245.aClass55_91.method1205(Static5.anInt20).length());
			} else if (local11.startsWith(Static422.aClass55_139.method1205(Static5.anInt20))) {
				local13 = 8;
				arg0 = arg0.substring(Static422.aClass55_139.method1205(Static5.anInt20).length());
			} else if (local11.startsWith(Static305.aClass55_144.method1205(Static5.anInt20))) {
				local13 = 9;
				arg0 = arg0.substring(Static305.aClass55_144.method1205(Static5.anInt20).length());
			} else if (local11.startsWith(Static307.aClass55_108.method1205(Static5.anInt20))) {
				local13 = 10;
				arg0 = arg0.substring(Static307.aClass55_108.method1205(Static5.anInt20).length());
			} else if (local11.startsWith(Static42.aClass55_22.method1205(Static5.anInt20))) {
				local13 = 11;
				arg0 = arg0.substring(Static42.aClass55_22.method1205(Static5.anInt20).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static412.aClass55_133.method1205(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static412.aClass55_133.method1205(0).length());
		} else if (local11.startsWith(Static419.aClass55_135.method1205(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static419.aClass55_135.method1205(0).length());
		} else if (local11.startsWith(Static438.aClass55_143.method1205(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static438.aClass55_143.method1205(0).length());
		} else if (local11.startsWith(Static445.aClass55_27.method1205(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static445.aClass55_27.method1205(0).length());
		} else if (local11.startsWith(Static391.aClass55_128.method1205(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static391.aClass55_128.method1205(0).length());
		} else if (Static5.anInt20 != 0) {
			if (local11.startsWith(Static412.aClass55_133.method1205(Static5.anInt20))) {
				local451 = 1;
				arg0 = arg0.substring(Static412.aClass55_133.method1205(Static5.anInt20).length());
			} else if (local11.startsWith(Static419.aClass55_135.method1205(Static5.anInt20))) {
				local451 = 2;
				arg0 = arg0.substring(Static419.aClass55_135.method1205(Static5.anInt20).length());
			} else if (local11.startsWith(Static438.aClass55_143.method1205(Static5.anInt20))) {
				local451 = 3;
				arg0 = arg0.substring(Static438.aClass55_143.method1205(Static5.anInt20).length());
			} else if (local11.startsWith(Static445.aClass55_27.method1205(Static5.anInt20))) {
				local451 = 4;
				arg0 = arg0.substring(Static445.aClass55_27.method1205(Static5.anInt20).length());
			} else if (local11.startsWith(Static391.aClass55_128.method1205(Static5.anInt20))) {
				local451 = 5;
				arg0 = arg0.substring(Static391.aClass55_128.method1205(Static5.anInt20).length());
			}
		}
		Static81.method1414(Static94.aClass2_38);
		Static255.aClass7_Sub14_Sub1_2.method3970(0);
		@Pc(646) int local646 = Static255.aClass7_Sub14_Sub1_2.anInt4989;
		if (arg1 == 5021) {
			Static255.aClass7_Sub14_Sub1_2.method3970(1);
		} else if (arg1 == 5022) {
			Static255.aClass7_Sub14_Sub1_2.method3970(2);
		} else {
			Static255.aClass7_Sub14_Sub1_2.method3970(0);
		}
		Static255.aClass7_Sub14_Sub1_2.method3970(local13);
		Static255.aClass7_Sub14_Sub1_2.method3970(local451);
		Static47.method615(Static255.aClass7_Sub14_Sub1_2, arg0);
		Static255.aClass7_Sub14_Sub1_2.method3960(Static255.aClass7_Sub14_Sub1_2.anInt4989 - local646);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!gb;)V")
	public static void method2352(@OriginalArg(0) Class7_Sub18 arg0) {
		method2345(arg0, 200000);
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
	private static void method2353(@OriginalArg(0) int arg0) {
		@Pc(3) Class95 local3 = Static313.method4088(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class95[] local13 = Static216.aClass95ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class95[] local19 = Static294.aClass95ArrayArray3[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static216.aClass95ArrayArray2[local9] = new Class95[local22];
			Static464.method3637(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static464.method3637(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V")
	private static void method2354(@OriginalArg(0) int arg0) {
		@Pc(3) Class95 local3 = Static313.method4088(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class95[] local13 = Static216.aClass95ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class95[] local19 = Static294.aClass95ArrayArray3[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static216.aClass95ArrayArray2[local9] = new Class95[local22];
			Static464.method3637(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static464.method3637(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(IZ)V")
	private static void method2355(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class95 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class95 local35;
		@Pc(210) Class95 local210;
		@Pc(13) int local13;
		@Pc(158) Class95 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt2922 -= 3;
				local13 = anIntArray256[anInt2922];
				local19 = anIntArray256[anInt2922 + 1];
				local25 = anIntArray256[anInt2922 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static313.method4088(local13);
				if (local35.aClass95Array1 == null) {
					local35.aClass95Array1 = new Class95[local25 + 1];
				}
				if (local35.aClass95Array1.length <= local25) {
					@Pc(54) Class95[] local54 = new Class95[local25 + 1];
					for (local56 = 0; local56 < local35.aClass95Array1.length; local56++) {
						local54[local56] = local35.aClass95Array1[local56];
					}
					local35.aClass95Array1 = local54;
				}
				if (local25 > 0 && local35.aClass95Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class95 local99 = new Class95();
				local99.anInt2616 = local19;
				local99.anInt2646 = local99.anInt2583 = local35.anInt2583;
				local99.anInt2602 = local25;
				local35.aClass95Array1[local25] = local99;
				if (arg1) {
					aClass95_7 = local99;
				} else {
					aClass95_8 = local99;
				}
				Static413.method5189(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass95_7 : aClass95_8;
				if (local137.anInt2602 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static313.method4088(local137.anInt2583);
				local158.aClass95Array1[local137.anInt2602] = null;
				Static413.method5189(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static313.method4088(anIntArray256[--anInt2922]);
				local137.aClass95Array1 = null;
				Static413.method5189(local137);
				return;
			}
			if (arg0 == 200) {
				anInt2922 -= 2;
				local13 = anIntArray256[anInt2922];
				local19 = anIntArray256[anInt2922 + 1];
				local210 = Static407.method5110(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray256[anInt2922++] = 1;
					if (arg1) {
						aClass95_7 = local210;
						return;
					}
					aClass95_8 = local210;
					return;
				}
				anIntArray256[anInt2922++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray256[--anInt2922];
				local158 = Static313.method4088(local13);
				if (local158 != null) {
					anIntArray256[anInt2922++] = 1;
					if (arg1) {
						aClass95_7 = local158;
						return;
					}
					aClass95_8 = local158;
					return;
				}
				anIntArray256[anInt2922++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray256[--anInt2922];
				method2353(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray256[--anInt2922];
				method2354(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt2922 -= 2;
					local13 = anIntArray256[anInt2922];
					local19 = anIntArray256[anInt2922 + 1];
					for (local25 = 0; local25 < Static218.anIntArray337.length; local25++) {
						if (Static218.anIntArray337[local25] == local13) {
							Static104.aClass26_Sub2_Sub4_Sub2_2.aClass75_1.method1847(Static430.aClass162_2, local25, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static21.anIntArray30.length; local353++) {
						if (Static21.anIntArray30[local353] == local13) {
							Static104.aClass26_Sub2_Sub4_Sub2_2.aClass75_1.method1847(Static430.aClass162_2, local353, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt2922 -= 2;
					local13 = anIntArray256[anInt2922];
					local19 = anIntArray256[anInt2922 + 1];
					Static104.aClass26_Sub2_Sub4_Sub2_2.aClass75_1.method1850(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray256[--anInt2922] != 0;
					Static104.aClass26_Sub2_Sub4_Sub2_2.aClass75_1.method1842(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static313.method4088(anIntArray256[--anInt2922]);
					} else {
						local137 = arg1 ? aClass95_7 : aClass95_8;
					}
					if (arg0 == 1100) {
						anInt2922 -= 2;
						local137.anInt2627 = anIntArray256[anInt2922];
						if (local137.anInt2627 > local137.anInt2581 - local137.anInt2595) {
							local137.anInt2627 = local137.anInt2581 - local137.anInt2595;
						}
						if (local137.anInt2627 < 0) {
							local137.anInt2627 = 0;
						}
						local137.anInt2585 = anIntArray256[anInt2922 + 1];
						if (local137.anInt2585 > local137.anInt2645 - local137.anInt2638) {
							local137.anInt2585 = local137.anInt2645 - local137.anInt2638;
						}
						if (local137.anInt2585 < 0) {
							local137.anInt2585 = 0;
						}
						Static413.method5189(local137);
						if (local137.anInt2602 == -1) {
							Static296.method3898(local137.anInt2583);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt2653 = anIntArray256[--anInt2922];
						Static413.method5189(local137);
						if (local137.anInt2602 == -1) {
							Static52.method731(local137.anInt2583);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean158 = anIntArray256[--anInt2922] == 1;
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt2669 = anIntArray256[--anInt2922];
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt2654 = anIntArray256[--anInt2922];
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray256[--anInt2922];
						if (local137.anInt2636 != local19) {
							local137.anInt2636 = local19;
							Static413.method5189(local137);
						}
						if (local137.anInt2602 == -1) {
							Static96.method1687(local137.anInt2583);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt2615 = anIntArray256[--anInt2922];
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean165 = anIntArray256[--anInt2922] == 1;
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt2673 = 1;
						local137.anInt2665 = anIntArray256[--anInt2922];
						Static413.method5189(local137);
						if (local137.anInt2602 == -1) {
							Static351.method4541(local137.anInt2583);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt2922 -= 6;
						local137.anInt2650 = anIntArray256[anInt2922];
						local137.anInt2631 = anIntArray256[anInt2922 + 1];
						local137.anInt2670 = anIntArray256[anInt2922 + 2];
						local137.anInt2618 = anIntArray256[anInt2922 + 3];
						local137.anInt2625 = anIntArray256[anInt2922 + 4];
						local137.anInt2667 = anIntArray256[anInt2922 + 5];
						Static413.method5189(local137);
						if (local137.anInt2602 == -1) {
							Static51.method676(local137.anInt2583);
							Static224.method4577(local137.anInt2583);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray256[--anInt2922];
						if (local137.anInt2659 != local19) {
							local137.anInt2659 = local19;
							local137.anInt2621 = 0;
							local137.anInt2639 = 1;
							local137.anInt2582 = 0;
							Static413.method5189(local137);
						}
						if (local137.anInt2602 == -1) {
							Static76.method1352(local137.anInt2583);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean159 = anIntArray256[--anInt2922] == 1;
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray23[--anInt2934];
						if (!local1101.equals(local137.aString28)) {
							local137.aString28 = local1101;
							Static413.method5189(local137);
						}
						if (local137.anInt2602 == -1) {
							Static207.method2973(local137.anInt2583);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt2649 = anIntArray256[--anInt2922];
						Static413.method5189(local137);
						if (local137.anInt2602 == -1) {
							Static262.method5696(local137.anInt2583);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt2922 -= 3;
						local137.anInt2597 = anIntArray256[anInt2922];
						local137.anInt2628 = anIntArray256[anInt2922 + 1];
						local137.anInt2655 = anIntArray256[anInt2922 + 2];
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean154 = anIntArray256[--anInt2922] == 1;
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt2648 = anIntArray256[--anInt2922];
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt2596 = anIntArray256[--anInt2922];
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean155 = anIntArray256[--anInt2922] == 1;
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean150 = anIntArray256[--anInt2922] == 1;
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt2922 -= 2;
						local137.anInt2581 = anIntArray256[anInt2922];
						local137.anInt2645 = anIntArray256[anInt2922 + 1];
						Static413.method5189(local137);
						if (local137.anInt2616 == 0) {
							Static118.method1991(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt2922 -= 2;
						local137.anInt2594 = (short) anIntArray256[anInt2922];
						local137.anInt2647 = (short) anIntArray256[anInt2922 + 1];
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean157 = anIntArray256[--anInt2922] == 1;
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt2667 = anIntArray256[--anInt2922];
						Static413.method5189(local137);
						if (local137.anInt2602 == -1) {
							Static51.method676(local137.anInt2583);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray256[--anInt2922];
						local137.aBoolean156 = local19 == 1;
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt2922 -= 2;
						local137.anInt2644 = anIntArray256[anInt2922];
						local137.anInt2662 = anIntArray256[anInt2922 + 1];
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt2643 = anIntArray256[--anInt2922];
						Static413.method5189(local137);
						return;
					}
					@Pc(1454) Class256 local1454;
					if (arg0 == 1127) {
						anInt2922 -= 2;
						local19 = anIntArray256[anInt2922];
						local25 = anIntArray256[anInt2922 + 1];
						local1454 = Static443.aClass193_4.method4068(local19);
						if (local25 != local1454.anInt6961) {
							local137.method2162(local19, local25);
							return;
						}
						local137.method2164(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray256[--anInt2922];
						local1488 = aStringArray23[--anInt2934];
						local1454 = Static443.aClass193_4.method4068(local19);
						if (!local1454.aString67.equals(local1488)) {
							local137.method2161(local19, local1488);
							return;
						}
						local137.method2164(local19);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static313.method4088(anIntArray256[--anInt2922]);
					} else {
						local137 = arg1 ? aClass95_7 : aClass95_8;
					}
					Static413.method5189(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt2922 -= 2;
						local19 = anIntArray256[anInt2922];
						local25 = anIntArray256[anInt2922 + 1];
						if (local137.anInt2602 == -1) {
							Static344.method4444(local137.anInt2583);
							Static51.method676(local137.anInt2583);
							Static224.method4577(local137.anInt2583);
						}
						if (local19 == -1) {
							local137.anInt2673 = 1;
							local137.anInt2665 = -1;
							local137.anInt2599 = -1;
							return;
						}
						local137.anInt2599 = local19;
						local137.anInt2604 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean151 = true;
						} else {
							local137.aBoolean151 = false;
						}
						@Pc(1630) Class45 local1630 = Static259.aClass206_2.method4320(local19);
						local137.anInt2670 = local1630.anInt991;
						local137.anInt2618 = local1630.anInt984;
						local137.anInt2625 = local1630.anInt993;
						local137.anInt2650 = local1630.anInt987;
						local137.anInt2631 = local1630.anInt1000;
						local137.anInt2667 = local1630.anInt955;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt2609 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt2609 = 1;
						} else {
							local137.anInt2609 = 2;
						}
						if (local137.anInt2635 > 0) {
							local137.anInt2667 = local137.anInt2667 * 32 / local137.anInt2635;
							return;
						}
						if (local137.anInt2598 > 0) {
							local137.anInt2667 = local137.anInt2667 * 32 / local137.anInt2598;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt2673 = 2;
						local137.anInt2665 = anIntArray256[--anInt2922];
						if (local137.anInt2602 == -1) {
							Static351.method4541(local137.anInt2583);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt2673 = 3;
						local137.anInt2665 = -1;
						if (local137.anInt2602 == -1) {
							Static351.method4541(local137.anInt2583);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt2673 = 6;
						local137.anInt2665 = anIntArray256[--anInt2922];
						if (local137.anInt2602 == -1) {
							Static351.method4541(local137.anInt2583);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt2673 = 5;
						local137.anInt2665 = anIntArray256[--anInt2922];
						if (local137.anInt2602 == -1) {
							Static351.method4541(local137.anInt2583);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt2922 -= 4;
						local137.anInt2663 = anIntArray256[anInt2922];
						local137.anInt2614 = anIntArray256[anInt2922 + 1];
						local137.anInt2605 = anIntArray256[anInt2922 + 2];
						local137.anInt2630 = anIntArray256[anInt2922 + 3];
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt2922 -= 2;
						local137.anInt2591 = anIntArray256[anInt2922];
						local137.anInt2606 = anIntArray256[anInt2922 + 1];
						Static413.method5189(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt2922 -= 4;
						local137.anInt2665 = anIntArray256[anInt2922];
						local137.anInt2626 = anIntArray256[anInt2922 + 1];
						if (anIntArray256[anInt2922 + 2] == 1) {
							local137.anInt2673 = 9;
						} else {
							local137.anInt2673 = 8;
						}
						if (anIntArray256[anInt2922 + 3] == 1) {
							local137.aBoolean151 = true;
						} else {
							local137.aBoolean151 = false;
						}
						if (local137.anInt2602 == -1) {
							Static351.method4541(local137.anInt2583);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt2673 = 5;
						local137.anInt2665 = Static296.anInt4920;
						local137.anInt2626 = 0;
						if (local137.anInt2602 == -1) {
							Static351.method4541(local137.anInt2583);
						}
						return;
					}
				} else {
					@Pc(2290) int local2290;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static313.method4088(anIntArray256[--anInt2922]);
							} else {
								local137 = arg1 ? aClass95_7 : aClass95_8;
							}
							local1101 = aStringArray23[--anInt2934];
							@Pc(2369) int[] local2369 = null;
							if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
								local353 = anIntArray256[--anInt2922];
								if (local353 > 0) {
									local2369 = new int[local353];
									while (local353-- > 0) {
										local2369[local353] = anIntArray256[--anInt2922];
									}
								}
								local1101 = local1101.substring(0, local1101.length() - 1);
							}
							@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
							for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
								if (local1101.charAt(local2290 - 1) == 's') {
									local2421[local2290] = aStringArray23[--anInt2934];
								} else {
									local2421[local2290] = Integer.valueOf(anIntArray256[--anInt2922]);
								}
							}
							local56 = anIntArray256[--anInt2922];
							if (local56 == -1) {
								local2421 = null;
							} else {
								local2421[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray32 = local2421;
							} else if (arg0 == 1401) {
								local137.anObjectArray11 = local2421;
							} else if (arg0 == 1402) {
								local137.anObjectArray19 = local2421;
							} else if (arg0 == 1403) {
								local137.anObjectArray8 = local2421;
							} else if (arg0 == 1404) {
								local137.anObjectArray34 = local2421;
							} else if (arg0 == 1405) {
								local137.anObjectArray22 = local2421;
							} else if (arg0 == 1406) {
								local137.anObjectArray33 = local2421;
							} else if (arg0 == 1407) {
								local137.anObjectArray5 = local2421;
								local137.anIntArray220 = local2369;
							} else if (arg0 == 1408) {
								local137.anObjectArray24 = local2421;
							} else if (arg0 == 1409) {
								local137.anObjectArray30 = local2421;
							} else if (arg0 == 1410) {
								local137.anObjectArray23 = local2421;
							} else if (arg0 == 1411) {
								local137.anObjectArray13 = local2421;
							} else if (arg0 == 1412) {
								local137.anObjectArray26 = local2421;
							} else if (arg0 == 1414) {
								local137.anObjectArray27 = local2421;
								local137.anIntArray221 = local2369;
							} else if (arg0 == 1415) {
								local137.anObjectArray16 = local2421;
								local137.anIntArray214 = local2369;
							} else if (arg0 == 1416) {
								local137.anObjectArray18 = local2421;
							} else if (arg0 == 1417) {
								local137.anObjectArray17 = local2421;
							} else if (arg0 == 1418) {
								local137.anObjectArray12 = local2421;
							} else if (arg0 == 1419) {
								local137.anObjectArray7 = local2421;
							} else if (arg0 == 1420) {
								local137.anObjectArray21 = local2421;
							} else if (arg0 == 1421) {
								local137.anObjectArray15 = local2421;
							} else if (arg0 == 1422) {
								local137.anObjectArray10 = local2421;
							} else if (arg0 == 1423) {
								local137.anObjectArray6 = local2421;
							} else if (arg0 == 1424) {
								local137.anObjectArray14 = local2421;
							} else if (arg0 == 1425) {
								local137.anObjectArray9 = local2421;
							} else if (arg0 == 1426) {
								local137.anObjectArray25 = local2421;
							} else if (arg0 == 1427) {
								local137.anObjectArray29 = local2421;
							} else if (arg0 == 1428) {
								local137.anObjectArray31 = local2421;
								local137.anIntArray216 = local2369;
							} else if (arg0 == 1429) {
								local137.anObjectArray20 = local2421;
								local137.anIntArray222 = local2369;
							} else if (arg0 == 1430) {
								local137.anObjectArray28 = local2421;
							}
							local137.aBoolean162 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass95_7 : aClass95_8;
							if (arg0 == 1500) {
								anIntArray256[anInt2922++] = local137.anInt2601;
								return;
							}
							if (arg0 == 1501) {
								anIntArray256[anInt2922++] = local137.anInt2584;
								return;
							}
							if (arg0 == 1502) {
								anIntArray256[anInt2922++] = local137.anInt2595;
								return;
							}
							if (arg0 == 1503) {
								anIntArray256[anInt2922++] = local137.anInt2638;
								return;
							}
							if (arg0 == 1504) {
								anIntArray256[anInt2922++] = local137.aBoolean164 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray256[anInt2922++] = local137.anInt2646;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static58.method808(local137);
								anIntArray256[anInt2922++] = local158 == null ? -1 : local158.anInt2583;
								return;
							}
						} else {
							@Pc(3017) Class256 local3017;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass95_7 : aClass95_8;
								if (arg0 == 1600) {
									anIntArray256[anInt2922++] = local137.anInt2627;
									return;
								}
								if (arg0 == 1601) {
									anIntArray256[anInt2922++] = local137.anInt2585;
									return;
								}
								if (arg0 == 1602) {
									aStringArray23[anInt2934++] = local137.aString28;
									return;
								}
								if (arg0 == 1603) {
									anIntArray256[anInt2922++] = local137.anInt2581;
									return;
								}
								if (arg0 == 1604) {
									anIntArray256[anInt2922++] = local137.anInt2645;
									return;
								}
								if (arg0 == 1605) {
									anIntArray256[anInt2922++] = local137.anInt2667;
									return;
								}
								if (arg0 == 1606) {
									anIntArray256[anInt2922++] = local137.anInt2670;
									return;
								}
								if (arg0 == 1607) {
									anIntArray256[anInt2922++] = local137.anInt2625;
									return;
								}
								if (arg0 == 1608) {
									anIntArray256[anInt2922++] = local137.anInt2618;
									return;
								}
								if (arg0 == 1609) {
									anIntArray256[anInt2922++] = local137.anInt2669;
									return;
								}
								if (arg0 == 1610) {
									anIntArray256[anInt2922++] = local137.anInt2650;
									return;
								}
								if (arg0 == 1611) {
									anIntArray256[anInt2922++] = local137.anInt2631;
									return;
								}
								if (arg0 == 1612) {
									anIntArray256[anInt2922++] = local137.anInt2636;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray256[--anInt2922];
									local3017 = Static443.aClass193_4.method4068(local19);
									if (local3017.method5444()) {
										aStringArray23[anInt2934++] = local137.method2168(local19, local3017.aString67);
									} else {
										anIntArray256[anInt2922++] = local137.method2157(local19, local3017.anInt6961);
									}
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass95_7 : aClass95_8;
								if (arg0 == 1700) {
									anIntArray256[anInt2922++] = local137.anInt2599;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt2599 != -1) {
										anIntArray256[anInt2922++] = local137.anInt2604;
										return;
									}
									anIntArray256[anInt2922++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray256[anInt2922++] = local137.anInt2602;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass95_7 : aClass95_8;
								if (arg0 == 1800) {
									anIntArray256[anInt2922++] = Static52.method725(local137).method1903();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray256[--anInt2922];
									local19--;
									if (local137.aStringArray17 != null && local19 < local137.aStringArray17.length && local137.aStringArray17[local19] != null) {
										aStringArray23[anInt2934++] = local137.aStringArray17[local19];
										return;
									}
									aStringArray23[anInt2934++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString30 == null) {
										aStringArray23[anInt2934++] = "";
										return;
									}
									aStringArray23[anInt2934++] = local137.aString30;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static313.method4088(anIntArray256[--anInt2922]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass95_7 : aClass95_8;
								}
								if (anInt2936 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray29 == null) {
										return;
									}
									@Pc(3254) Class7_Sub18 local3254 = new Class7_Sub18();
									local3254.aClass95_5 = local137;
									local3254.anObjectArray1 = local137.anObjectArray29;
									local3254.anInt2471 = anInt2936 + 1;
									Static451.aClass85_48.method2011(local3254);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static313.method4088(anIntArray256[--anInt2922]);
								if (arg0 == 2500) {
									anIntArray256[anInt2922++] = local137.anInt2601;
									return;
								}
								if (arg0 == 2501) {
									anIntArray256[anInt2922++] = local137.anInt2584;
									return;
								}
								if (arg0 == 2502) {
									anIntArray256[anInt2922++] = local137.anInt2595;
									return;
								}
								if (arg0 == 2503) {
									anIntArray256[anInt2922++] = local137.anInt2638;
									return;
								}
								if (arg0 == 2504) {
									anIntArray256[anInt2922++] = local137.aBoolean164 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray256[anInt2922++] = local137.anInt2646;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static58.method808(local137);
									anIntArray256[anInt2922++] = local158 == null ? -1 : local158.anInt2583;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static313.method4088(anIntArray256[--anInt2922]);
								if (arg0 == 2600) {
									anIntArray256[anInt2922++] = local137.anInt2627;
									return;
								}
								if (arg0 == 2601) {
									anIntArray256[anInt2922++] = local137.anInt2585;
									return;
								}
								if (arg0 == 2602) {
									aStringArray23[anInt2934++] = local137.aString28;
									return;
								}
								if (arg0 == 2603) {
									anIntArray256[anInt2922++] = local137.anInt2581;
									return;
								}
								if (arg0 == 2604) {
									anIntArray256[anInt2922++] = local137.anInt2645;
									return;
								}
								if (arg0 == 2605) {
									anIntArray256[anInt2922++] = local137.anInt2667;
									return;
								}
								if (arg0 == 2606) {
									anIntArray256[anInt2922++] = local137.anInt2670;
									return;
								}
								if (arg0 == 2607) {
									anIntArray256[anInt2922++] = local137.anInt2625;
									return;
								}
								if (arg0 == 2608) {
									anIntArray256[anInt2922++] = local137.anInt2618;
									return;
								}
								if (arg0 == 2609) {
									anIntArray256[anInt2922++] = local137.anInt2669;
									return;
								}
								if (arg0 == 2610) {
									anIntArray256[anInt2922++] = local137.anInt2650;
									return;
								}
								if (arg0 == 2611) {
									anIntArray256[anInt2922++] = local137.anInt2631;
									return;
								}
								if (arg0 == 2612) {
									anIntArray256[anInt2922++] = local137.anInt2636;
									return;
								}
							} else {
								@Pc(3751) Class7_Sub44 local3751;
								@Pc(3649) Class7_Sub44 local3649;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static313.method4088(anIntArray256[--anInt2922]);
										anIntArray256[anInt2922++] = local137.anInt2599;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static313.method4088(anIntArray256[--anInt2922]);
										if (local137.anInt2599 != -1) {
											anIntArray256[anInt2922++] = local137.anInt2604;
											return;
										}
										anIntArray256[anInt2922++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray256[--anInt2922];
										local3649 = (Class7_Sub44) Static23.aClass164_3.method3512((long) local13);
										if (local3649 != null) {
											anIntArray256[anInt2922++] = 1;
											return;
										}
										anIntArray256[anInt2922++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static313.method4088(anIntArray256[--anInt2922]);
										if (local137.aClass95Array1 == null) {
											anIntArray256[anInt2922++] = 0;
											return;
										}
										local19 = local137.aClass95Array1.length;
										for (local25 = 0; local25 < local137.aClass95Array1.length; local25++) {
											if (local137.aClass95Array1[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray256[anInt2922++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt2922 -= 2;
										local13 = anIntArray256[anInt2922];
										local19 = anIntArray256[anInt2922 + 1];
										local3751 = (Class7_Sub44) Static23.aClass164_3.method3512((long) local13);
										if (local3751 != null && local3751.anInt7165 == local19) {
											anIntArray256[anInt2922++] = 1;
											return;
										}
										anIntArray256[anInt2922++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static313.method4088(anIntArray256[--anInt2922]);
									if (arg0 == 2800) {
										anIntArray256[anInt2922++] = Static52.method725(local137).method1903();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray256[--anInt2922];
										local19--;
										if (local137.aStringArray17 != null && local19 < local137.aStringArray17.length && local137.aStringArray17[local19] != null) {
											aStringArray23[anInt2934++] = local137.aStringArray17[local19];
											return;
										}
										aStringArray23[anInt2934++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString30 == null) {
											aStringArray23[anInt2934++] = "";
											return;
										}
										aStringArray23[anInt2934++] = local137.aString30;
										return;
									}
								} else {
									@Pc(3888) String local3888;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local3888 = aStringArray23[--anInt2934];
											Static90.method1616(local3888);
											return;
										}
										if (arg0 == 3101) {
											anInt2922 -= 2;
											Static381.method4853(Static104.aClass26_Sub2_Sub4_Sub2_2, anIntArray256[anInt2922], anIntArray256[anInt2922 + 1]);
											return;
										}
										if (arg0 == 3103) {
											Static146.method5131();
											return;
										}
										if (arg0 == 3104) {
											local3888 = aStringArray23[--anInt2934];
											local19 = 0;
											if (Static106.method1840(local3888)) {
												local19 = Static259.method3459(local3888);
											}
											Static81.method1414(Static370.aClass2_97);
											Static255.aClass7_Sub14_Sub1_2.method3933(local19);
											return;
										}
										if (arg0 == 3105) {
											local3888 = aStringArray23[--anInt2934];
											Static81.method1414(Static252.aClass2_68);
											Static255.aClass7_Sub14_Sub1_2.method3970(local3888.length() + 1);
											Static255.aClass7_Sub14_Sub1_2.method3947(local3888);
											return;
										}
										if (arg0 == 3106) {
											local3888 = aStringArray23[--anInt2934];
											Static81.method1414(Static439.aClass2_107);
											Static255.aClass7_Sub14_Sub1_2.method3970(local3888.length() + 1);
											Static255.aClass7_Sub14_Sub1_2.method3947(local3888);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray256[--anInt2922];
											local1101 = aStringArray23[--anInt2934];
											Static379.method4665(local1101, local13);
											return;
										}
										if (arg0 == 3108) {
											anInt2922 -= 3;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											local25 = anIntArray256[anInt2922 + 2];
											local35 = Static313.method4088(local25);
											Static454.method5773(local19, local35, local13);
											return;
										}
										if (arg0 == 3109) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											local210 = arg1 ? aClass95_7 : aClass95_8;
											Static454.method5773(local19, local210, local13);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray256[--anInt2922];
											Static81.method1414(Static444.aClass2_111);
											Static255.aClass7_Sub14_Sub1_2.method3993(local13);
											return;
										}
										if (arg0 == 3111) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											local3751 = (Class7_Sub44) Static23.aClass164_3.method3512((long) local13);
											if (local3751 != null) {
												Static255.method3394(local3751.anInt7165 != local19, local3751, true);
											}
											Static436.method5609(3, local13, local19, true);
											return;
										}
										if (arg0 == 3112) {
											anInt2922--;
											local13 = anIntArray256[anInt2922];
											local3649 = (Class7_Sub44) Static23.aClass164_3.method3512((long) local13);
											if (local3649 != null && local3649.anInt7164 == 3) {
												Static255.method3394(true, local3649, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static3.method9(aStringArray23[--anInt2934]);
											return;
										}
										if (arg0 == 3114) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											local1488 = aStringArray23[--anInt2934];
											Static336.method4383(local13, local19, "", local1488, "");
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt2922 -= 3;
											Static90.method1614(anIntArray256[anInt2922 + 2], 255, anIntArray256[anInt2922], anIntArray256[anInt2922 + 1]);
											return;
										}
										if (arg0 == 3201) {
											Static394.method5008(255, 50, anIntArray256[--anInt2922]);
											return;
										}
										if (arg0 == 3202) {
											anInt2922 -= 2;
											Static109.method1893(255, anIntArray256[anInt2922 + 1], anIntArray256[anInt2922]);
											return;
										}
										if (arg0 == 3203) {
											anInt2922 -= 4;
											Static90.method1614(anIntArray256[anInt2922 + 2], anIntArray256[anInt2922 + 3], anIntArray256[anInt2922], anIntArray256[anInt2922 + 1]);
											return;
										}
										if (arg0 == 3204) {
											anInt2922 -= 3;
											Static394.method5008(anIntArray256[anInt2922 + 1], anIntArray256[anInt2922 + 2], anIntArray256[anInt2922]);
											return;
										}
										if (arg0 == 3205) {
											anInt2922 -= 3;
											Static109.method1893(anIntArray256[anInt2922 + 2], anIntArray256[anInt2922 + 1], anIntArray256[anInt2922]);
											return;
										}
										if (arg0 == 3206) {
											anInt2922 -= 4;
											Static341.method4428(anIntArray256[anInt2922 + 1], anIntArray256[anInt2922 + 3], anIntArray256[anInt2922], anIntArray256[anInt2922 + 2]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray256[anInt2922++] = Static274.anInt4617;
											return;
										}
										if (arg0 == 3301) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = Static62.method921(false, local19, local13);
											return;
										}
										if (arg0 == 3302) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = Static199.method2856(local13, local19, false);
											return;
										}
										if (arg0 == 3303) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = Static381.method4855(local13, false, local19);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static395.aClass207_1.method4332(local13).anInt7334;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static29.anIntArray46[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static326.anIntArray624[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static446.anIntArray621[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4605) byte local4605 = Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102;
											local19 = (Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388 >> 7) + Static359.anInt5713;
											local25 = (Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383 >> 7) + Static314.anInt5181;
											anIntArray256[anInt2922++] = (local4605 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray256[anInt2922++] = Static87.aBoolean98 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = Static62.method921(true, local19, local13);
											return;
										}
										if (arg0 == 3314) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = Static199.method2856(local13, local19, true);
											return;
										}
										if (arg0 == 3315) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = Static381.method4855(local13, true, local19);
											return;
										}
										if (arg0 == 3316) {
											if (Static157.anInt2920 >= 2) {
												anIntArray256[anInt2922++] = Static157.anInt2920;
												return;
											}
											anIntArray256[anInt2922++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray256[anInt2922++] = Static37.anInt654;
											return;
										}
										if (arg0 == 3318) {
											anIntArray256[anInt2922++] = Static393.aClass124_5.anInt3453;
											return;
										}
										if (arg0 == 3321) {
											anIntArray256[anInt2922++] = Static443.anInt7238;
											return;
										}
										if (arg0 == 3322) {
											anIntArray256[anInt2922++] = Static133.anInt2522;
											return;
										}
										if (arg0 == 3323) {
											if (Static380.anInt4486 >= 5 && Static380.anInt4486 <= 9) {
												anIntArray256[anInt2922++] = 1;
												return;
											}
											anIntArray256[anInt2922++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static380.anInt4486 >= 5 && Static380.anInt4486 <= 9) {
												anIntArray256[anInt2922++] = Static380.anInt4486;
												return;
											}
											anIntArray256[anInt2922++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray256[anInt2922++] = Static263.aBoolean285 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray256[anInt2922++] = Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7143;
											return;
										}
										if (arg0 == 3327) {
											anIntArray256[anInt2922++] = Static104.aClass26_Sub2_Sub4_Sub2_2.aClass75_1.aBoolean120 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray256[anInt2922++] = Static22.aBoolean309 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static68.method1152(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = Static350.method4528(false, local13, local19);
											return;
										}
										if (arg0 == 3332) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = Static350.method4528(true, local13, local19);
											return;
										}
										if (arg0 == 3333) {
											anIntArray256[anInt2922++] = Static233.anInt5382;
											return;
										}
										if (arg0 == 3335) {
											anIntArray256[anInt2922++] = Static5.anInt20;
											return;
										}
										if (arg0 == 3336) {
											anInt2922 -= 4;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											local25 = anIntArray256[anInt2922 + 2];
											local353 = anIntArray256[anInt2922 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray256[anInt2922++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray256[anInt2922++] = Static274.anInt4622;
											return;
										}
										if (arg0 == 3338) {
											anIntArray256[anInt2922++] = Static289.method3845();
											return;
										}
										if (arg0 == 3339) {
											anIntArray256[anInt2922++] = Static204.aBoolean411 ? 1 : 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray256[anInt2922++] = Static173.aBoolean186 ? 1 : 0;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5245) Class218 local5245;
										if (arg0 == 3400) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											local5245 = Static258.aClass208_1.method4373(local13);
											aStringArray23[anInt2934++] = local5245.method4462(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt2922 -= 4;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											local25 = anIntArray256[anInt2922 + 2];
											local353 = anIntArray256[anInt2922 + 3];
											@Pc(5291) Class218 local5291 = Static258.aClass208_1.method4373(local25);
											if (local5291.aChar2 == local13 && local5291.aChar1 == local19) {
												if (local19 == 115) {
													aStringArray23[anInt2934++] = local5291.method4462(local353);
													return;
												}
												anIntArray256[anInt2922++] = local5291.method4460(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt2922 -= 3;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											local25 = anIntArray256[anInt2922 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5367) Class218 local5367 = Static258.aClass208_1.method4373(local19);
											if (local5367.aChar1 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray256[anInt2922++] = local5367.method4457(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray256[--anInt2922];
											local1101 = aStringArray23[--anInt2934];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5245 = Static258.aClass208_1.method4373(local13);
											if (local5245.aChar1 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray256[anInt2922++] = local5245.method4456(local1101) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray256[--anInt2922];
											@Pc(5465) Class218 local5465 = Static258.aClass208_1.method4373(local13);
											anIntArray256[anInt2922++] = local5465.aClass164_32.method3515();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static458.anInt7538 == 0) {
												anIntArray256[anInt2922++] = -2;
												return;
											}
											if (Static458.anInt7538 == 1) {
												anIntArray256[anInt2922++] = -1;
												return;
											}
											anIntArray256[anInt2922++] = Static184.anInt3296;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray256[--anInt2922];
											if (Static458.anInt7538 == 2 && local13 < Static184.anInt3296) {
												aStringArray23[anInt2934++] = Static193.aStringArray30[local13];
												if (Static448.aStringArray53[local13] != null) {
													aStringArray23[anInt2934++] = Static448.aStringArray53[local13];
													return;
												}
												aStringArray23[anInt2934++] = "";
												return;
											}
											aStringArray23[anInt2934++] = "";
											aStringArray23[anInt2934++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray256[--anInt2922];
											if (Static458.anInt7538 == 2 && local13 < Static184.anInt3296) {
												anIntArray256[anInt2922++] = Static37.anIntArray54[local13];
												return;
											}
											anIntArray256[anInt2922++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray256[--anInt2922];
											if (Static458.anInt7538 == 2 && local13 < Static184.anInt3296) {
												anIntArray256[anInt2922++] = Static123.anIntArray169[local13];
												return;
											}
											anIntArray256[anInt2922++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local3888 = aStringArray23[--anInt2934];
											local19 = anIntArray256[--anInt2922];
											Static52.method727(local3888, local19);
											return;
										}
										if (arg0 == 3605) {
											local3888 = aStringArray23[--anInt2934];
											Static220.method3100(local3888);
											return;
										}
										if (arg0 == 3606) {
											local3888 = aStringArray23[--anInt2934];
											Static276.method3695(local3888);
											return;
										}
										if (arg0 == 3607) {
											local3888 = aStringArray23[--anInt2934];
											Static405.method4102(local3888, false);
											return;
										}
										if (arg0 == 3608) {
											local3888 = aStringArray23[--anInt2934];
											Static355.method2952(local3888);
											return;
										}
										if (arg0 == 3609) {
											local3888 = aStringArray23[--anInt2934];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray256[anInt2922++] = Static220.method3098(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray256[--anInt2922];
											if (Static458.anInt7538 == 2 && local13 < Static184.anInt3296) {
												aStringArray23[anInt2934++] = Static70.aStringArray6[local13];
												return;
											}
											aStringArray23[anInt2934++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static364.aString17 != null) {
												aStringArray23[anInt2934++] = Static330.method4333(Static364.aString17);
												return;
											}
											aStringArray23[anInt2934++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static364.aString17 != null) {
												anIntArray256[anInt2922++] = Static267.anInt4534;
												return;
											}
											anIntArray256[anInt2922++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray256[--anInt2922];
											if (Static364.aString17 != null && local13 < Static267.anInt4534) {
												aStringArray23[anInt2934++] = Static76.aClass129Array1[local13].aString40;
												return;
											}
											aStringArray23[anInt2934++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray256[--anInt2922];
											if (Static364.aString17 != null && local13 < Static267.anInt4534) {
												anIntArray256[anInt2922++] = Static76.aClass129Array1[local13].anInt3588;
												return;
											}
											anIntArray256[anInt2922++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray256[--anInt2922];
											if (Static364.aString17 != null && local13 < Static267.anInt4534) {
												anIntArray256[anInt2922++] = Static76.aClass129Array1[local13].aByte33;
												return;
											}
											anIntArray256[anInt2922++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray256[anInt2922++] = Static248.aByte42;
											return;
										}
										if (arg0 == 3617) {
											local3888 = aStringArray23[--anInt2934];
											Static163.method3573(local3888);
											return;
										}
										if (arg0 == 3618) {
											anIntArray256[anInt2922++] = Static62.aByte12;
											return;
										}
										if (arg0 == 3619) {
											local3888 = aStringArray23[--anInt2934];
											Static1.method2(local3888);
											return;
										}
										if (arg0 == 3620) {
											Static359.method4612();
											return;
										}
										if (arg0 == 3621) {
											if (Static458.anInt7538 == 0) {
												anIntArray256[anInt2922++] = -1;
												return;
											}
											anIntArray256[anInt2922++] = Static206.anInt3640;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray256[--anInt2922];
											if (Static458.anInt7538 != 0 && local13 < Static206.anInt3640) {
												aStringArray23[anInt2934++] = Static84.aStringArray37[local13];
												if (Static332.aStringArray46[local13] != null) {
													aStringArray23[anInt2934++] = Static332.aStringArray46[local13];
													return;
												}
												aStringArray23[anInt2934++] = "";
												return;
											}
											aStringArray23[anInt2934++] = "";
											aStringArray23[anInt2934++] = "";
											return;
										}
										if (arg0 == 3623) {
											local3888 = aStringArray23[--anInt2934];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray256[anInt2922++] = Static21.method221(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray256[--anInt2922];
											if (Static76.aClass129Array1 != null && local13 < Static267.anInt4534 && Static76.aClass129Array1[local13].aString39.equalsIgnoreCase(Static104.aClass26_Sub2_Sub4_Sub2_2.aString69)) {
												anIntArray256[anInt2922++] = 1;
												return;
											}
											anIntArray256[anInt2922++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static44.aString5 != null) {
												aStringArray23[anInt2934++] = Static44.aString5;
												return;
											}
											aStringArray23[anInt2934++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray256[--anInt2922];
											if (Static364.aString17 != null && local13 < Static267.anInt4534) {
												aStringArray23[anInt2934++] = Static76.aClass129Array1[local13].aString41;
												return;
											}
											aStringArray23[anInt2934++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray256[--anInt2922];
											if (Static458.anInt7538 == 2 && local13 >= 0 && local13 < Static184.anInt3296) {
												anIntArray256[anInt2922++] = Static88.aBooleanArray5[local13] ? 1 : 0;
												return;
											}
											anIntArray256[anInt2922++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local3888 = aStringArray23[--anInt2934];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray256[anInt2922++] = Static350.method4529(local3888);
											return;
										}
										if (arg0 == 3629) {
											anIntArray256[anInt2922++] = Static191.anInt3399;
											return;
										}
										if (arg0 == 3630) {
											local3888 = aStringArray23[--anInt2934];
											Static405.method4102(local3888, true);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static45.aBooleanArray1[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray256[--anInt2922];
											if (Static364.aString17 != null && local13 < Static267.anInt4534) {
												aStringArray23[anInt2934++] = Static76.aClass129Array1[local13].aString39;
												return;
											}
											aStringArray23[anInt2934++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray256[--anInt2922];
											if (Static458.anInt7538 != 0 && local13 < Static206.anInt3640) {
												aStringArray23[anInt2934++] = Static248.aStringArray35[local13];
												return;
											}
											aStringArray23[anInt2934++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static286.aClass242Array3[local13].method5061();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static286.aClass242Array3[local13].anInt6371;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static286.aClass242Array3[local13].anInt6368;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static286.aClass242Array3[local13].anInt6369;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static286.aClass242Array3[local13].anInt6373;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static286.aClass242Array3[local13].anInt6367;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray256[--anInt2922];
											local19 = Static286.aClass242Array3[local13].method5063();
											anIntArray256[anInt2922++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray256[--anInt2922];
											local19 = Static286.aClass242Array3[local13].method5063();
											anIntArray256[anInt2922++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray256[--anInt2922];
											local19 = Static286.aClass242Array3[local13].method5063();
											anIntArray256[anInt2922++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray256[--anInt2922];
											local19 = Static286.aClass242Array3[local13].method5063();
											anIntArray256[anInt2922++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt2922 -= 5;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											local25 = anIntArray256[anInt2922 + 2];
											local353 = anIntArray256[anInt2922 + 3];
											local2290 = anIntArray256[anInt2922 + 4];
											anIntArray256[anInt2922++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
											return;
										}
										@Pc(6975) long local6975;
										@Pc(6968) long local6968;
										if (arg0 == 4007) {
											anInt2922 -= 2;
											local6968 = anIntArray256[anInt2922];
											local6975 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = (int) (local6968 + local6968 * local6975 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											if (local13 == 0) {
												anIntArray256[anInt2922++] = 0;
												return;
											}
											anIntArray256[anInt2922++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											if (local13 == 0) {
												anIntArray256[anInt2922++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray256[anInt2922++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray256[anInt2922++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt2922 -= 3;
											local6968 = anIntArray256[anInt2922];
											local6975 = anIntArray256[anInt2922 + 1];
											@Pc(7356) long local7356 = (long) anIntArray256[anInt2922 + 2];
											anIntArray256[anInt2922++] = (int) (local6968 * local7356 / local6975);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local3888 = aStringArray23[--anInt2934];
											local19 = anIntArray256[--anInt2922];
											aStringArray23[anInt2934++] = local3888 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt2934 -= 2;
											local3888 = aStringArray23[anInt2934];
											local1101 = aStringArray23[anInt2934 + 1];
											aStringArray23[anInt2934++] = local3888 + local1101;
											return;
										}
										if (arg0 == 4102) {
											local3888 = aStringArray23[--anInt2934];
											local19 = anIntArray256[--anInt2922];
											aStringArray23[anInt2934++] = local3888 + Static115.method1951(local19);
											return;
										}
										if (arg0 == 4103) {
											local3888 = aStringArray23[--anInt2934];
											aStringArray23[anInt2934++] = local3888.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray23[anInt2934++] = method2349(anIntArray256[--anInt2922]);
											return;
										}
										if (arg0 == 4105) {
											anInt2934 -= 2;
											local3888 = aStringArray23[anInt2934];
											local1101 = aStringArray23[anInt2934 + 1];
											if (Static104.aClass26_Sub2_Sub4_Sub2_2.aClass75_1 != null && Static104.aClass26_Sub2_Sub4_Sub2_2.aClass75_1.aBoolean120) {
												aStringArray23[anInt2934++] = local1101;
												return;
											}
											aStringArray23[anInt2934++] = local3888;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray256[--anInt2922];
											aStringArray23[anInt2934++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt2934 -= 2;
											anIntArray256[anInt2922++] = Static290.method3850(aStringArray23[anInt2934 + 1], Static5.anInt20, aStringArray23[anInt2934]);
											return;
										}
										@Pc(7639) Class57 local7639;
										if (arg0 == 4108) {
											local3888 = aStringArray23[--anInt2934];
											anInt2922 -= 2;
											local19 = anIntArray256[anInt2922];
											local25 = anIntArray256[anInt2922 + 1];
											local7639 = Static254.method3389(Static249.aClass178_74, local25);
											anIntArray256[anInt2922++] = local7639.method1393(local19, Static321.aClass11Array9, local3888);
											return;
										}
										if (arg0 == 4109) {
											local3888 = aStringArray23[--anInt2934];
											anInt2922 -= 2;
											local19 = anIntArray256[anInt2922];
											local25 = anIntArray256[anInt2922 + 1];
											local7639 = Static254.method3389(Static249.aClass178_74, local25);
											anIntArray256[anInt2922++] = local7639.method1390(local19, Static321.aClass11Array9, local3888);
											return;
										}
										if (arg0 == 4110) {
											anInt2934 -= 2;
											local3888 = aStringArray23[anInt2934];
											local1101 = aStringArray23[anInt2934 + 1];
											if (anIntArray256[--anInt2922] == 1) {
												aStringArray23[anInt2934++] = local3888;
												return;
											}
											aStringArray23[anInt2934++] = local1101;
											return;
										}
										if (arg0 == 4111) {
											local3888 = aStringArray23[--anInt2934];
											aStringArray23[anInt2934++] = Static7.method43(local3888);
											return;
										}
										if (arg0 == 4112) {
											local3888 = aStringArray23[--anInt2934];
											local19 = anIntArray256[--anInt2922];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray23[anInt2934++] = local3888 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static127.method2053((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static247.method4214((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static100.method1742((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static316.method4110((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local3888 = aStringArray23[--anInt2934];
											if (local3888 != null) {
												anIntArray256[anInt2922++] = local3888.length();
												return;
											}
											anIntArray256[anInt2922++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local3888 = aStringArray23[--anInt2934];
											anInt2922 -= 2;
											local19 = anIntArray256[anInt2922];
											local25 = anIntArray256[anInt2922 + 1];
											aStringArray23[anInt2934++] = local3888.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local3888 = aStringArray23[--anInt2934];
											@Pc(8002) StringBuffer local8002 = new StringBuffer(local3888.length());
											@Pc(8004) boolean local8004 = false;
											for (local353 = 0; local353 < local3888.length(); local353++) {
												@Pc(8011) char local8011 = local3888.charAt(local353);
												if (local8011 == '<') {
													local8004 = true;
												} else if (local8011 == '>') {
													local8004 = false;
												} else if (!local8004) {
													local8002.append(local8011);
												}
											}
											aStringArray23[anInt2934++] = local8002.toString();
											return;
										}
										if (arg0 == 4120) {
											local3888 = aStringArray23[--anInt2934];
											anInt2922 -= 2;
											local19 = anIntArray256[anInt2922];
											local25 = anIntArray256[anInt2922 + 1];
											anIntArray256[anInt2922++] = local3888.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt2934 -= 2;
											local3888 = aStringArray23[anInt2934];
											local1101 = aStringArray23[anInt2934 + 1];
											local25 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = local3888.indexOf(local1101, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray256[--anInt2922] != 0;
											local19 = anIntArray256[--anInt2922];
											aStringArray23[anInt2934++] = Static350.method4525((long) local19, 0, Static5.anInt20, local412);
											return;
										}
										if (arg0 == 4125) {
											local3888 = aStringArray23[--anInt2934];
											local19 = anIntArray256[--anInt2922];
											@Pc(8225) Class57 local8225 = Static254.method3389(Static249.aClass178_74, local19);
											anIntArray256[anInt2922++] = local8225.method1384(Static321.aClass11Array9, local3888);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray256[--anInt2922];
											aStringArray23[anInt2934++] = Static259.aClass206_2.method4320(local13).aString6;
											return;
										}
										@Pc(8287) Class45 local8287;
										if (arg0 == 4201) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											local8287 = Static259.aClass206_2.method4320(local13);
											if (local19 >= 1 && local19 <= 5 && local8287.aStringArray4[local19 - 1] != null) {
												aStringArray23[anInt2934++] = local8287.aStringArray4[local19 - 1];
												return;
											}
											aStringArray23[anInt2934++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											local8287 = Static259.aClass206_2.method4320(local13);
											if (local19 >= 1 && local19 <= 5 && local8287.aStringArray5[local19 - 1] != null) {
												aStringArray23[anInt2934++] = local8287.aStringArray5[local19 - 1];
												return;
											}
											aStringArray23[anInt2934++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static259.aClass206_2.method4320(local13).anInt997;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static259.aClass206_2.method4320(local13).anInt961 == 1 ? 1 : 0;
											return;
										}
										@Pc(8450) Class45 local8450;
										if (arg0 == 4205) {
											local13 = anIntArray256[--anInt2922];
											local8450 = Static259.aClass206_2.method4320(local13);
											if (local8450.anInt953 == -1 && local8450.anInt962 >= 0) {
												anIntArray256[anInt2922++] = local8450.anInt962;
												return;
											}
											anIntArray256[anInt2922++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray256[--anInt2922];
											local8450 = Static259.aClass206_2.method4320(local13);
											if (local8450.anInt953 >= 0 && local8450.anInt962 >= 0) {
												anIntArray256[anInt2922++] = local8450.anInt962;
												return;
											}
											anIntArray256[anInt2922++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray256[--anInt2922];
											anIntArray256[anInt2922++] = Static259.aClass206_2.method4320(local13).aBoolean61 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											local3017 = Static443.aClass193_4.method4068(local19);
											if (local3017.method5444()) {
												aStringArray23[anInt2934++] = Static259.aClass206_2.method4320(local13).method763(local19, local3017.aString67);
												return;
											}
											anIntArray256[anInt2922++] = Static259.aClass206_2.method4320(local13).method769(local19, local3017.anInt6961);
											return;
										}
										if (arg0 == 4209) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1] - 1;
											local8287 = Static259.aClass206_2.method4320(local13);
											if (local8287.anInt988 == local19) {
												anIntArray256[anInt2922++] = local8287.anInt948;
												return;
											}
											if (local8287.anInt959 == local19) {
												anIntArray256[anInt2922++] = local8287.anInt994;
												return;
											}
											anIntArray256[anInt2922++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local3888 = aStringArray23[--anInt2934];
											local19 = anIntArray256[--anInt2922];
											Static341.method4430(local19 == 1, local3888);
											anIntArray256[anInt2922++] = Static238.anInt4078;
											return;
										}
										if (arg0 == 4211) {
											if (Static89.aShortArray29 != null && Static117.anInt2381 < Static238.anInt4078) {
												anIntArray256[anInt2922++] = Static89.aShortArray29[Static117.anInt2381++] & 0xFFFF;
												return;
											}
											anIntArray256[anInt2922++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static117.anInt2381 = 0;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											local3017 = Static443.aClass193_4.method4068(local19);
											if (local3017.method5444()) {
												aStringArray23[anInt2934++] = Static442.aClass98_1.method2241(local13).method5177(local3017.aString67, local19);
												return;
											}
											anIntArray256[anInt2922++] = Static442.aClass98_1.method2241(local13).method5180(local19, local3017.anInt6961);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											local3017 = Static443.aClass193_4.method4068(local19);
											if (local3017.method5444()) {
												aStringArray23[anInt2934++] = Static411.aClass142_4.method3148(local13).method4028(local19, local3017.aString67);
												return;
											}
											anIntArray256[anInt2922++] = Static411.aClass142_4.method3148(local13).method4018(local3017.anInt6961, local19);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt2922 -= 2;
											local13 = anIntArray256[anInt2922];
											local19 = anIntArray256[anInt2922 + 1];
											local3017 = Static443.aClass193_4.method4068(local19);
											if (local3017.method5444()) {
												aStringArray23[anInt2934++] = Static109.aClass18_1.method204(local13).method2733(local3017.aString67, local19);
												return;
											}
											anIntArray256[anInt2922++] = Static109.aClass18_1.method204(local13).method2738(local19, local3017.anInt6961);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray256[--anInt2922];
										@Pc(8951) Class78 local8951 = Static223.aClass154_1.method3341(local13);
										if (local8951.anIntArray160 != null && local8951.anIntArray160.length > 0) {
											local25 = 0;
											local353 = local8951.anIntArray159[0];
											for (local2290 = 1; local2290 < local8951.anIntArray160.length; local2290++) {
												if (local8951.anIntArray159[local2290] > local353) {
													local25 = local2290;
													local353 = local8951.anIntArray159[local2290];
												}
											}
											anIntArray256[anInt2922++] = local8951.anIntArray160[local25];
											return;
										}
										anIntArray256[anInt2922++] = local8951.anInt2267;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static313.method4088(anIntArray256[--anInt2922]);
						} else {
							local137 = arg1 ? aClass95_7 : aClass95_8;
						}
						if (arg0 == 1300) {
							local19 = anIntArray256[--anInt2922] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method2155(aStringArray23[--anInt2934], local19);
								return;
							}
							anInt2934--;
							return;
						}
						if (arg0 == 1301) {
							anInt2922 -= 2;
							local19 = anIntArray256[anInt2922];
							local25 = anIntArray256[anInt2922 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass95_6 = null;
								return;
							}
							local137.aClass95_6 = Static407.method5110(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray256[--anInt2922];
							if (local19 != Static352.anInt5642 && local19 != Static441.anInt7336 && local19 != Static153.anInt5629) {
								return;
							}
							local137.anInt2589 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt2590 = anIntArray256[--anInt2922];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt2603 = anIntArray256[--anInt2922];
							return;
						}
						if (arg0 == 1305) {
							local137.aString30 = aStringArray23[--anInt2934];
							return;
						}
						if (arg0 == 1306) {
							local137.aString29 = aStringArray23[--anInt2934];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray17 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt2668 = anIntArray256[--anInt2922];
							local137.anInt2632 = anIntArray256[--anInt2922];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray256[--anInt2922];
							local25 = anIntArray256[--anInt2922];
							if (local25 >= 1 && local25 <= 10) {
								local137.method2158(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString31 = aStringArray23[--anInt2934];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt2612 = anIntArray256[--anInt2922];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt2922 -= 3;
								local19 = anIntArray256[anInt2922] - 1;
								local25 = anIntArray256[anInt2922 + 1];
								local353 = anIntArray256[anInt2922 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt2922 -= 2;
								local19 = 10;
								local25 = anIntArray256[anInt2922];
								local353 = anIntArray256[anInt2922 + 1];
							}
							if (local137.aByteArray34 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray34 = new byte[11];
								local137.aByteArray33 = new byte[11];
								local137.anIntArray215 = new int[11];
							}
							local137.aByteArray34[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean153 = false;
								for (local2290 = 0; local2290 < local137.aByteArray34.length; local2290++) {
									if (local137.aByteArray34[local2290] != 0) {
										local137.aBoolean153 = true;
										break;
									}
								}
							} else {
								local137.aBoolean153 = true;
							}
							local137.aByteArray33[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt2641 = anIntArray256[--anInt2922];
							return;
						}
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static313.method4088(anIntArray256[--anInt2922]);
				} else {
					local137 = arg1 ? aClass95_7 : aClass95_8;
				}
				if (arg0 == 1000) {
					anInt2922 -= 4;
					local137.anInt2675 = anIntArray256[anInt2922];
					local137.anInt2586 = anIntArray256[anInt2922 + 1];
					local19 = anIntArray256[anInt2922 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray256[anInt2922 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte26 = (byte) local19;
					local137.aByte25 = (byte) local25;
					Static413.method5189(local137);
					Static182.method2657(local137);
					if (local137.anInt2602 == -1) {
						Static127.method2052(local137.anInt2583);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt2922 -= 4;
					local137.anInt2598 = anIntArray256[anInt2922];
					local137.anInt2633 = anIntArray256[anInt2922 + 1];
					local137.anInt2635 = 0;
					local137.anInt2588 = 0;
					local19 = anIntArray256[anInt2922 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray256[anInt2922 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte24 = (byte) local19;
					local137.aByte23 = (byte) local25;
					Static413.method5189(local137);
					Static182.method2657(local137);
					if (local137.anInt2616 == 0) {
						Static118.method1991(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray256[--anInt2922] == 1;
					if (local137.aBoolean164 != local620) {
						local137.aBoolean164 = local620;
						Static413.method5189(local137);
					}
					if (local137.anInt2602 == -1) {
						Static206.method2970(local137.anInt2583);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt2922 -= 2;
					local137.anInt2600 = anIntArray256[anInt2922];
					local137.anInt2656 = anIntArray256[anInt2922 + 1];
					Static413.method5189(local137);
					Static182.method2657(local137);
					if (local137.anInt2616 == 0) {
						Static118.method1991(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean163 = anIntArray256[--anInt2922] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!sl;II)V")
	public static void method2356(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class7_Sub4_Sub16 local5 = Static271.method3647(arg2, arg0, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray255 = new int[local5.anInt6298];
		aStringArray22 = new String[local5.anInt6301];
		if (local5.aClass229_11 == Static41.aClass229_1 || local5.aClass229_11 == Static116.aClass229_9 || local5.aClass229_11 == Static45.aClass229_2) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static282.aClass95_11 != null) {
				local30 = Static282.aClass95_11.anInt2601;
				local32 = Static282.aClass95_11.anInt2584;
			}
			anIntArray255[0] = Static154.aClass50_1.method1860() - local30;
			anIntArray255[1] = Static154.aClass50_1.method1870() - local32;
		}
		method2346(local5, 200000);
	}
}
