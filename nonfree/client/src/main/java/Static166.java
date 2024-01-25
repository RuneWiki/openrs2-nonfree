import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!id", name = "m", descriptor = "Lclient!ts;")
	private static Class239 aClass239_6;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Lclient!ts;")
	private static Class239 aClass239_7;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "[I")
	private static int[] anIntArray205;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "Lclient!p;")
	private static Class189 aClass189_1;

	@OriginalMember(owner = "client!id", name = "y", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray21;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "[I")
	private static final int[] anIntArray203 = new int[1000];

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	private static int anInt3316 = 0;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!id", name = "h", descriptor = "[[I")
	private static final int[][] anIntArrayArray19 = new int[5][5000];

	@OriginalMember(owner = "client!id", name = "k", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray20 = new String[1000];

	@OriginalMember(owner = "client!id", name = "n", descriptor = "[I")
	private static final int[] anIntArray204 = new int[5];

	@OriginalMember(owner = "client!id", name = "s", descriptor = "[Lclient!cv;")
	private static final Class41[] aClass41Array1 = new Class41[50];

	@OriginalMember(owner = "client!id", name = "t", descriptor = "I")
	private static int anInt3324 = 0;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "I")
	private static int anInt3326 = 0;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "[I")
	private static final int[] anIntArray206 = new int[3];

	@OriginalMember(owner = "client!id", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray22 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!id", name = "B", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_23 = new Class44(4);

	@OriginalMember(owner = "client!id", name = "C", descriptor = "I")
	private static int anInt3328 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!vf;)V")
	public static void method2744(@OriginalArg(0) Class6_Sub42 arg0) {
		method2749(arg0, 200000);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)V")
	private static void method2745(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray203[anInt3326++] = Static427.anInt7603;
				return;
			}
			if (arg0 == 5001) {
				anInt3326 -= 3;
				Static427.anInt7603 = anIntArray203[anInt3326];
				Static185.aClass195_1 = Static114.method4752(anIntArray203[anInt3326 + 1]);
				if (Static185.aClass195_1 == null) {
					Static185.aClass195_1 = Static272.aClass195_2;
				}
				Static164.anInt3290 = anIntArray203[anInt3326 + 2];
				Static403.method5961(Static132.aClass92_49);
				Static109.aClass6_Sub1_Sub1_5.method6439(Static427.anInt7603);
				Static109.aClass6_Sub1_Sub1_5.method6439(Static185.aClass195_1.anInt5391);
				Static109.aClass6_Sub1_Sub1_5.method6439(Static164.anInt3290);
				return;
			}
			if (arg0 == 5002) {
				anInt3316 -= 2;
				local75 = aStringArray20[anInt3316];
				local81 = aStringArray20[anInt3316 + 1];
				anInt3326 -= 2;
				local89 = anIntArray203[anInt3326];
				local95 = anIntArray203[anInt3326 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static403.method5961(Static420.aClass92_148);
				Static109.aClass6_Sub1_Sub1_5.method6439(Static16.method471(local75) + Static16.method471(local81) + 2);
				Static109.aClass6_Sub1_Sub1_5.method6448(local75);
				Static109.aClass6_Sub1_Sub1_5.method6439(local89 - 1);
				Static109.aClass6_Sub1_Sub1_5.method6439(local95);
				Static109.aClass6_Sub1_Sub1_5.method6448(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray203[--anInt3326];
				local81 = null;
				if (local157 < 100) {
					local81 = Static352.aStringArray36[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray20[anInt3316++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray203[--anInt3326];
				local192 = -1;
				if (local157 < 100 && Static352.aStringArray36[local157] != null) {
					local192 = Static68.anIntArray511[local157];
				}
				anIntArray203[anInt3326++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static185.aClass195_1 == null) {
					anIntArray203[anInt3326++] = -1;
					return;
				}
				anIntArray203[anInt3326++] = Static185.aClass195_1.anInt5391;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray20[--anInt3316];
				method2751(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3316 -= 2;
				local75 = aStringArray20[anInt3316];
				local81 = aStringArray20[anInt3316 + 1];
				if (Static291.anInt5199 != 0 || (!Static18.aBoolean26 || Static225.aBoolean270) && !Static421.aBoolean475) {
					Static403.method5961(Static426.aClass92_150);
					Static109.aClass6_Sub1_Sub1_5.method6439(0);
					local89 = Static109.aClass6_Sub1_Sub1_5.anInt7898;
					Static109.aClass6_Sub1_Sub1_5.method6448(local75);
					Static268.method4087(local81, Static109.aClass6_Sub1_Sub1_5);
					Static109.aClass6_Sub1_Sub1_5.method6458(Static109.aClass6_Sub1_Sub1_5.anInt7898 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray203[--anInt3326];
				local81 = null;
				if (local157 < 100) {
					local81 = Static443.aStringArray52[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray20[anInt3316++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray203[--anInt3326];
				local81 = null;
				if (local157 < 100) {
					local81 = Static344.aStringArray37[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray20[anInt3316++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray203[--anInt3326];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static229.anIntArray301[local157];
				}
				anIntArray203[anInt3326++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static302.aClass3_Sub2_Sub1_Sub2_2 == null || Static302.aClass3_Sub2_Sub1_Sub2_2.aString53 == null) {
					local75 = Static383.aString57;
				} else {
					local75 = Static302.aClass3_Sub2_Sub1_Sub2_2.method5536();
				}
				aStringArray20[anInt3316++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray203[anInt3326++] = Static164.anInt3290;
				return;
			}
			if (arg0 == 5017) {
				anIntArray203[anInt3326++] = Static181.anInt3575;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray203[--anInt3326];
				local192 = 0;
				if (local157 < 100 && Static352.aStringArray36[local157] != null) {
					local192 = Static68.anIntArray511[local157];
				}
				anIntArray203[anInt3326++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray203[--anInt3326];
				local81 = null;
				if (local157 < 100) {
					local81 = Static285.aStringArray43[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray20[anInt3316++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static302.aClass3_Sub2_Sub1_Sub2_2 == null || Static302.aClass3_Sub2_Sub1_Sub2_2.aString53 == null) {
					local75 = Static383.aString57;
				} else {
					local75 = Static302.aClass3_Sub2_Sub1_Sub2_2.method5532();
				}
				aStringArray20[anInt3316++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray203[--anInt3326];
				aStringArray20[anInt3316++] = Static262.aClass237_2.method5714(local157).aString66;
				return;
			}
			@Pc(589) Class6_Sub2_Sub16 local589;
			if (arg0 == 5051) {
				local157 = anIntArray203[--anInt3326];
				local589 = Static262.aClass237_2.method5714(local157);
				if (local589.anIntArray509 == null) {
					anIntArray203[anInt3326++] = 0;
					return;
				}
				anIntArray203[anInt3326++] = local589.anIntArray509.length;
				return;
			}
			if (arg0 == 5052) {
				anInt3326 -= 2;
				local157 = anIntArray203[anInt3326];
				local192 = anIntArray203[anInt3326 + 1];
				@Pc(634) Class6_Sub2_Sub16 local634 = Static262.aClass237_2.method5714(local157);
				local95 = local634.anIntArray509[local192];
				anIntArray203[anInt3326++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray203[--anInt3326];
				local589 = Static262.aClass237_2.method5714(local157);
				if (local589.anIntArray507 == null) {
					anIntArray203[anInt3326++] = 0;
					return;
				}
				anIntArray203[anInt3326++] = local589.anIntArray507.length;
				return;
			}
			if (arg0 == 5054) {
				anInt3326 -= 2;
				local157 = anIntArray203[anInt3326];
				local192 = anIntArray203[anInt3326 + 1];
				anIntArray203[anInt3326++] = Static262.aClass237_2.method5714(local157).anIntArray507[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray203[--anInt3326];
				aStringArray20[anInt3316++] = Static426.aClass149_2.method3356(local157).method4354();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray203[--anInt3326];
				@Pc(760) Class6_Sub2_Sub12 local760 = Static426.aClass149_2.method3356(local157);
				if (local760.anIntArray345 == null) {
					anIntArray203[anInt3326++] = 0;
					return;
				}
				anIntArray203[anInt3326++] = local760.anIntArray345.length;
				return;
			}
			if (arg0 == 5057) {
				anInt3326 -= 2;
				local157 = anIntArray203[anInt3326];
				local192 = anIntArray203[anInt3326 + 1];
				anIntArray203[anInt3326++] = Static426.aClass149_2.method3356(local157).anIntArray345[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass189_1 = new Class189();
				aClass189_1.anInt5268 = anIntArray203[--anInt3326];
				aClass189_1.aClass6_Sub2_Sub12_1 = Static426.aClass149_2.method3356(aClass189_1.anInt5268);
				aClass189_1.anIntArray356 = new int[aClass189_1.aClass6_Sub2_Sub12_1.method4358()];
				return;
			}
			if (arg0 == 5059) {
				Static403.method5961(Static379.aClass92_137);
				Static109.aClass6_Sub1_Sub1_5.method6439(0);
				local157 = Static109.aClass6_Sub1_Sub1_5.anInt7898;
				Static109.aClass6_Sub1_Sub1_5.method6439(0);
				Static109.aClass6_Sub1_Sub1_5.method6453(aClass189_1.anInt5268);
				aClass189_1.aClass6_Sub2_Sub12_1.method4363(Static109.aClass6_Sub1_Sub1_5, aClass189_1.anIntArray356);
				Static109.aClass6_Sub1_Sub1_5.method6458(Static109.aClass6_Sub1_Sub1_5.anInt7898 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray20[--anInt3316];
				Static403.method5961(Static116.aClass92_42);
				Static109.aClass6_Sub1_Sub1_5.method6439(0);
				local192 = Static109.aClass6_Sub1_Sub1_5.anInt7898;
				Static109.aClass6_Sub1_Sub1_5.method6448(local75);
				Static109.aClass6_Sub1_Sub1_5.method6453(aClass189_1.anInt5268);
				aClass189_1.aClass6_Sub2_Sub12_1.method4363(Static109.aClass6_Sub1_Sub1_5, aClass189_1.anIntArray356);
				Static109.aClass6_Sub1_Sub1_5.method6458(Static109.aClass6_Sub1_Sub1_5.anInt7898 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static403.method5961(Static379.aClass92_137);
				Static109.aClass6_Sub1_Sub1_5.method6439(0);
				local157 = Static109.aClass6_Sub1_Sub1_5.anInt7898;
				Static109.aClass6_Sub1_Sub1_5.method6439(1);
				Static109.aClass6_Sub1_Sub1_5.method6453(aClass189_1.anInt5268);
				aClass189_1.aClass6_Sub2_Sub12_1.method4363(Static109.aClass6_Sub1_Sub1_5, aClass189_1.anIntArray356);
				Static109.aClass6_Sub1_Sub1_5.method6458(Static109.aClass6_Sub1_Sub1_5.anInt7898 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt3326 -= 2;
				local157 = anIntArray203[anInt3326];
				local192 = anIntArray203[anInt3326 + 1];
				anIntArray203[anInt3326++] = Static262.aClass237_2.method5714(local157).aCharArray5[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt3326 -= 2;
				local157 = anIntArray203[anInt3326];
				local192 = anIntArray203[anInt3326 + 1];
				anIntArray203[anInt3326++] = Static262.aClass237_2.method5714(local157).aCharArray6[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt3326 -= 2;
				local157 = anIntArray203[anInt3326];
				local192 = anIntArray203[anInt3326 + 1];
				if (local192 == -1) {
					anIntArray203[anInt3326++] = -1;
					return;
				}
				anIntArray203[anInt3326++] = Static262.aClass237_2.method5714(local157).method6065((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt3326 -= 2;
				local157 = anIntArray203[anInt3326];
				local192 = anIntArray203[anInt3326 + 1];
				if (local192 == -1) {
					anIntArray203[anInt3326++] = -1;
					return;
				}
				anIntArray203[anInt3326++] = Static262.aClass237_2.method5714(local157).method6062((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray203[--anInt3326];
				anIntArray203[anInt3326++] = Static426.aClass149_2.method3356(local157).method4358();
				return;
			}
			if (arg0 == 5067) {
				anInt3326 -= 2;
				local157 = anIntArray203[anInt3326];
				local192 = anIntArray203[anInt3326 + 1];
				local89 = Static426.aClass149_2.method3356(local157).method4359(local192).anInt357;
				anIntArray203[anInt3326++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt3326 -= 2;
				local157 = anIntArray203[anInt3326];
				local192 = anIntArray203[anInt3326 + 1];
				aClass189_1.anIntArray356[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt3326 -= 2;
				local157 = anIntArray203[anInt3326];
				local192 = anIntArray203[anInt3326 + 1];
				aClass189_1.anIntArray356[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt3326 -= 3;
				local157 = anIntArray203[anInt3326];
				local192 = anIntArray203[anInt3326 + 1];
				local89 = anIntArray203[anInt3326 + 2];
				@Pc(1265) Class6_Sub2_Sub12 local1265 = Static426.aClass149_2.method3356(local157);
				if (local1265.method4359(local192).anInt357 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray203[anInt3326++] = local1265.method4364(local89, local192);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray20[--anInt3316];
				local1313 = anIntArray203[--anInt3326] == 1;
				Static132.method2363(local1313, local75);
				anIntArray203[anInt3326++] = Static87.anInt2049;
				return;
			}
			if (arg0 == 5072) {
				if (Static315.aShortArray85 != null && Static40.anInt1169 < Static87.anInt2049) {
					anIntArray203[anInt3326++] = Static315.aShortArray85[Static40.anInt1169++] & 0xFFFF;
					return;
				}
				anIntArray203[anInt3326++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static40.anInt1169 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static403.method5961(Static379.aClass92_137);
				Static109.aClass6_Sub1_Sub1_5.method6439(0);
				local157 = Static109.aClass6_Sub1_Sub1_5.anInt7898;
				Static109.aClass6_Sub1_Sub1_5.method6439(2);
				Static109.aClass6_Sub1_Sub1_5.method6453(aClass189_1.anInt5268);
				aClass189_1.aClass6_Sub2_Sub12_1.method4363(Static109.aClass6_Sub1_Sub1_5, aClass189_1.anIntArray356);
				Static109.aClass6_Sub1_Sub1_5.method6458(Static109.aClass6_Sub1_Sub1_5.anInt7898 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static54.aClass187_1.method4602(86)) {
					anIntArray203[anInt3326++] = 1;
					return;
				}
				anIntArray203[anInt3326++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static54.aClass187_1.method4602(82)) {
					anIntArray203[anInt3326++] = 1;
					return;
				}
				anIntArray203[anInt3326++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static54.aClass187_1.method4602(81)) {
					anIntArray203[anInt3326++] = 1;
					return;
				}
				anIntArray203[anInt3326++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static269.method4097(anIntArray203[--anInt3326]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray203[anInt3326++] = Static317.method1911();
					return;
				}
				if (arg0 == 5205) {
					Static46.method1022(-1, -1, anIntArray203[--anInt3326], false);
					return;
				}
				@Pc(1554) Class6_Sub2_Sub15 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray203[--anInt3326];
					local1554 = Static7.method923(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray203[anInt3326++] = -1;
						return;
					}
					anIntArray203[anInt3326++] = local1554.anInt7184;
					return;
				}
				@Pc(1587) Class6_Sub2_Sub15 local1587;
				if (arg0 == 5207) {
					local1587 = Static7.method918(anIntArray203[--anInt3326]);
					if (local1587 != null && local1587.aString65 != null) {
						aStringArray20[anInt3316++] = local1587.aString65;
						return;
					}
					aStringArray20[anInt3316++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray203[anInt3326++] = Static408.anInt7342;
					anIntArray203[anInt3326++] = Static93.anInt2136;
					return;
				}
				if (arg0 == 5209) {
					anIntArray203[anInt3326++] = Static226.anInt5617 + Static7.anInt1139;
					anIntArray203[anInt3326++] = Static242.anInt4490 + Static7.anInt1150;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray203[--anInt3326];
					local1554 = Static7.method918(local157);
					if (local1554 == null) {
						anIntArray203[anInt3326++] = 0;
						anIntArray203[anInt3326++] = 0;
						return;
					}
					anIntArray203[anInt3326++] = local1554.anInt7193 >> 14 & 0x3FFF;
					anIntArray203[anInt3326++] = local1554.anInt7193 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray203[--anInt3326];
					local1554 = Static7.method918(local157);
					if (local1554 == null) {
						anIntArray203[anInt3326++] = 0;
						anIntArray203[anInt3326++] = 0;
						return;
					}
					anIntArray203[anInt3326++] = local1554.anInt7197 - local1554.anInt7195;
					anIntArray203[anInt3326++] = local1554.anInt7186 - local1554.anInt7192;
					return;
				}
				@Pc(1777) Class6_Sub32 local1777;
				if (arg0 == 5212) {
					local1777 = Static219.method3284();
					if (local1777 == null) {
						anIntArray203[anInt3326++] = -1;
						anIntArray203[anInt3326++] = -1;
						return;
					}
					anIntArray203[anInt3326++] = local1777.anInt5707;
					local192 = local1777.anInt5700 << 28 | local1777.anInt5701 + Static7.anInt1139 << 14 | local1777.anInt5705 + Static7.anInt1150;
					anIntArray203[anInt3326++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static235.method3637();
					if (local1777 == null) {
						anIntArray203[anInt3326++] = -1;
						anIntArray203[anInt3326++] = -1;
						return;
					}
					anIntArray203[anInt3326++] = local1777.anInt5707;
					local192 = local1777.anInt5700 << 28 | local1777.anInt5701 + Static7.anInt1139 << 14 | local1777.anInt5705 + Static7.anInt1150;
					anIntArray203[anInt3326++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray203[--anInt3326];
					local1554 = Static360.method5333();
					if (local1554 != null) {
						local1925 = local1554.method5931(local157 >> 14 & 0x3FFF, anIntArray206, local157 >> 28 & 0x3, local157 & 0x3FFF);
						if (local1925) {
							Static392.method4236(anIntArray206[2], anIntArray206[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt3326 -= 2;
					local157 = anIntArray203[anInt3326];
					local192 = anIntArray203[anInt3326 + 1];
					@Pc(1963) Class170 local1963 = Static7.method939(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class6_Sub2_Sub15 local1970 = (Class6_Sub2_Sub15) local1963.method4006(); local1970 != null; local1970 = (Class6_Sub2_Sub15) local1963.method4000()) {
						if (local1970.anInt7184 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray203[anInt3326++] = 1;
						return;
					}
					anIntArray203[anInt3326++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray203[--anInt3326];
					local1554 = Static7.method918(local157);
					if (local1554 == null) {
						anIntArray203[anInt3326++] = -1;
						return;
					}
					anIntArray203[anInt3326++] = local1554.anInt7188;
					return;
				}
				if (arg0 == 5220) {
					anIntArray203[anInt3326++] = Static263.anInt4747 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray203[--anInt3326];
					Static392.method4236(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static360.method5333();
					if (local1587 != null) {
						local1313 = local1587.method5930(anIntArray206, Static242.anInt4490 + Static7.anInt1150, Static226.anInt5617 + Static7.anInt1139);
						if (local1313) {
							anIntArray203[anInt3326++] = anIntArray206[1];
							anIntArray203[anInt3326++] = anIntArray206[2];
							return;
						}
						anIntArray203[anInt3326++] = -1;
						anIntArray203[anInt3326++] = -1;
						return;
					}
					anIntArray203[anInt3326++] = -1;
					anIntArray203[anInt3326++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt3326 -= 2;
					local157 = anIntArray203[anInt3326];
					local192 = anIntArray203[anInt3326 + 1];
					Static46.method1022(local192 >> 14 & 0x3FFF, local192 & 0x3FFF, local157, false);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray203[--anInt3326];
					local1554 = Static360.method5333();
					if (local1554 != null) {
						local1925 = local1554.method5931(local157 >> 14 & 0x3FFF, anIntArray206, local157 >> 28 & 0x3, local157 & 0x3FFF);
						if (local1925) {
							anIntArray203[anInt3326++] = anIntArray206[1];
							anIntArray203[anInt3326++] = anIntArray206[2];
							return;
						}
						anIntArray203[anInt3326++] = -1;
						anIntArray203[anInt3326++] = -1;
						return;
					}
					anIntArray203[anInt3326++] = -1;
					anIntArray203[anInt3326++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray203[--anInt3326];
					local1554 = Static360.method5333();
					if (local1554 != null) {
						local1925 = local1554.method5930(anIntArray206, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray203[anInt3326++] = anIntArray206[1];
							anIntArray203[anInt3326++] = anIntArray206[2];
							return;
						}
						anIntArray203[anInt3326++] = -1;
						anIntArray203[anInt3326++] = -1;
						return;
					}
					anIntArray203[anInt3326++] = -1;
					anIntArray203[anInt3326++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static165.method2741(anIntArray203[--anInt3326]);
					return;
				}
				if (arg0 == 5227) {
					anInt3326 -= 2;
					local157 = anIntArray203[anInt3326];
					local192 = anIntArray203[anInt3326 + 1];
					Static46.method1022(local192 >> 14 & 0x3FFF, local192 & 0x3FFF, local157, true);
					return;
				}
				if (arg0 == 5228) {
					Static245.aBoolean292 = anIntArray203[--anInt3326] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray203[anInt3326++] = Static245.aBoolean292 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray203[--anInt3326];
					Static292.method4381(local157);
					return;
				}
				@Pc(2483) Class6 local2483;
				if (arg0 == 5231) {
					anInt3326 -= 2;
					local157 = anIntArray203[anInt3326];
					local1313 = anIntArray203[anInt3326 + 1] == 1;
					if (Static386.aClass74_27 != null) {
						local2483 = Static386.aClass74_27.method1883((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6525();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class6();
							Static386.aClass74_27.method1890((long) local157, local2483);
						}
					}
					return;
				}
				@Pc(2525) Class6 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray203[--anInt3326];
					if (Static386.aClass74_27 != null) {
						local2525 = Static386.aClass74_27.method1883((long) local157);
						anIntArray203[anInt3326++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray203[anInt3326++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt3326 -= 2;
					local157 = anIntArray203[anInt3326];
					local1313 = anIntArray203[anInt3326 + 1] == 1;
					if (Static292.aClass74_22 != null) {
						local2483 = Static292.aClass74_22.method1883((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6525();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class6();
							Static292.aClass74_22.method1890((long) local157, local2483);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray203[--anInt3326];
					if (Static292.aClass74_22 != null) {
						local2525 = Static292.aClass74_22.method1883((long) local157);
						anIntArray203[anInt3326++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray203[anInt3326++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray203[anInt3326++] = Static7.aClass6_Sub2_Sub15_2 == null ? -1 : Static7.aClass6_Sub2_Sub15_2.anInt7184;
					return;
				}
				if (arg0 == 5236) {
					anInt3326 -= 2;
					local157 = anIntArray203[anInt3326];
					local192 = anIntArray203[anInt3326 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static375.method5601(local157, local95, local89);
					if (local2691 < 0) {
						anIntArray203[anInt3326++] = -1;
						return;
					}
					anIntArray203[anInt3326++] = local2691;
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt3326 -= 2;
					local157 = anIntArray203[anInt3326];
					local192 = anIntArray203[anInt3326 + 1];
					Static21.method609(3, local157, local192, false);
					anIntArray203[anInt3326++] = Static264.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static264.aFrame2 != null) {
						Static21.method609(Static291.aClass28_Sub1_1.anInt1023, -1, -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2769) Class118[] local2769 = Static418.method6135();
					anIntArray203[anInt3326++] = local2769.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray203[--anInt3326];
					@Pc(2793) Class118[] local2793 = Static418.method6135();
					anIntArray203[anInt3326++] = local2793[local157].anInt3440;
					anIntArray203[anInt3326++] = local2793[local157].anInt3438;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static291.aClass28_Sub1_1.anInt1031;
					local192 = Static291.aClass28_Sub1_1.anInt1024;
					local89 = -1;
					@Pc(2830) Class118[] local2830 = Static418.method6135();
					for (local2691 = 0; local2691 < local2830.length; local2691++) {
						@Pc(2837) Class118 local2837 = local2830[local2691];
						if (local2837.anInt3440 == local157 && local2837.anInt3438 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray203[anInt3326++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray203[anInt3326++] = Static374.method5599();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray203[--anInt3326];
					if (local157 >= 1 && local157 <= 2) {
						Static21.method609(local157, -1, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.anInt1023;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray203[--anInt3326];
					if (local157 >= 1 && local157 <= 2) {
						Static291.aClass28_Sub1_1.anInt1023 = local157;
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						return;
					}
					return;
				}
			} else {
				@Pc(3345) String local3345;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt3316 -= 2;
						local75 = aStringArray20[anInt3316];
						local81 = aStringArray20[anInt3316 + 1];
						local89 = anIntArray203[--anInt3326];
						Static403.method5961(Static215.aClass92_75);
						Static109.aClass6_Sub1_Sub1_5.method6439(Static16.method471(local75) + Static16.method471(local81) + 1);
						Static109.aClass6_Sub1_Sub1_5.method6448(local75);
						Static109.aClass6_Sub1_Sub1_5.method6448(local81);
						Static109.aClass6_Sub1_Sub1_5.method6439(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt3326 -= 2;
						Static301.aShortArray83[anIntArray203[anInt3326]] = (short) Static282.method4272(anIntArray203[anInt3326 + 1]);
						Static380.aClass231_2.method5637();
						Static380.aClass231_2.method5644();
						Static235.aClass263_2.method6413();
						Static206.method3172();
						return;
					}
					if (arg0 == 5405) {
						anInt3326 -= 2;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static345.anIntArrayArrayArray13[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt3326 -= 7;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1] << 1;
						local89 = anIntArray203[anInt3326 + 2];
						local95 = anIntArray203[anInt3326 + 3];
						local2691 = anIntArray203[anInt3326 + 4];
						@Pc(3105) int local3105 = anIntArray203[anInt3326 + 5];
						@Pc(3111) int local3111 = anIntArray203[anInt3326 + 6];
						if (local157 >= 0 && local157 < 2 && Static345.anIntArrayArrayArray13[local157] != null && local192 >= 0 && local192 < Static345.anIntArrayArrayArray13[local157].length) {
							Static345.anIntArrayArrayArray13[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3111 };
							Static345.anIntArrayArrayArray13[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3105, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static345.anIntArrayArrayArray13[anIntArray203[--anInt3326]].length >> 1;
						anIntArray203[anInt3326++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static264.aFrame2 != null) {
							Static21.method609(Static291.aClass28_Sub1_1.anInt1023, -1, -1, false);
						}
						if (Static133.aFrame3 != null) {
							Static327.method4731();
							System.exit(0);
							return;
						}
						local75 = Static362.aString51 == null ? Static389.method5718() : Static362.aString51;
						Static84.method1576(Static45.aClass209_127, Static294.anInt5208 == 1, false, local75);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static245.aClass122_5 != null) {
							if (Static245.aClass122_5.anObject7 == null) {
								local75 = Static212.method3219(Static245.aClass122_5.anInt3556);
							} else {
								local75 = (String) Static245.aClass122_5.anObject7;
							}
						}
						aStringArray20[anInt3316++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray203[anInt3326++] = Static325.anInt5594 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static264.aFrame2 != null) {
							Static21.method609(Static291.aClass28_Sub1_1.anInt1023, -1, -1, false);
						}
						local75 = aStringArray20[--anInt3316];
						local1313 = anIntArray203[--anInt3326] == 1;
						local3345 = Static389.method5718() + local75;
						Static84.method1576(Static45.aClass209_127, Static294.anInt5208 == 1, local1313, local3345);
						return;
					}
					if (arg0 == 5422) {
						anInt3316 -= 2;
						local75 = aStringArray20[anInt3316];
						local81 = aStringArray20[anInt3316 + 1];
						local89 = anIntArray203[--anInt3326];
						if (local75.length() > 0) {
							if (Static387.aStringArray44 == null) {
								Static387.aStringArray44 = new String[Static6.anIntArray10[Static4.aClass36_5.anInt1242]];
							}
							Static387.aStringArray44[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static53.aStringArray6 == null) {
								Static53.aStringArray6 = new String[Static6.anIntArray10[Static4.aClass36_5.anInt1242]];
							}
							Static53.aStringArray6[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray20[--anInt3316]);
						return;
					}
					if (arg0 == 5424) {
						anInt3326 -= 11;
						Static445.anInt7974 = anIntArray203[anInt3326];
						Static39.anInt1158 = anIntArray203[anInt3326 + 1];
						Static408.anInt7339 = anIntArray203[anInt3326 + 2];
						Static21.anInt688 = anIntArray203[anInt3326 + 3];
						Static254.anInt4643 = anIntArray203[anInt3326 + 4];
						Static441.anInt7803 = anIntArray203[anInt3326 + 5];
						Static338.anInt5880 = anIntArray203[anInt3326 + 6];
						Static293.anInt345 = anIntArray203[anInt3326 + 7];
						Static176.anInt3529 = anIntArray203[anInt3326 + 8];
						Static36.anInt1126 = anIntArray203[anInt3326 + 9];
						Static199.anInt3764 = anIntArray203[anInt3326 + 10];
						Static350.aClass100_69.method2492(Static254.anInt4643);
						Static350.aClass100_69.method2492(Static441.anInt7803);
						Static350.aClass100_69.method2492(Static338.anInt5880);
						Static350.aClass100_69.method2492(Static293.anInt345);
						Static350.aClass100_69.method2492(Static176.anInt3529);
						Static447.aClass87_30 = null;
						Static387.aClass87_28 = null;
						Static234.aClass87_19 = null;
						Static330.aClass87_23 = null;
						Static379.aClass87_27 = null;
						Static306.aClass87_21 = null;
						Static100.aClass87_7 = null;
						Static335.aClass87_24 = null;
						Static215.aBoolean261 = true;
						return;
					}
					if (arg0 == 5425) {
						Static201.method3979();
						Static215.aBoolean261 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt3326 -= 2;
						Static28.anInt815 = anIntArray203[anInt3326];
						Static256.anInt4669 = anIntArray203[anInt3326 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt3326 -= 2;
						Static90.anInt2075 = anIntArray203[anInt3326 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt3326 -= 2;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						anIntArray203[anInt3326++] = Static248.method6162(local157, local192) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static431.method6283(false, aStringArray20[--anInt3316]);
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt3326 -= 4;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						local89 = anIntArray203[anInt3326 + 2];
						local95 = anIntArray203[anInt3326 + 3];
						Static414.method5832((local157 & 0x3FFF) - Static348.anInt6273, false, (local157 >> 14 & 0x3FFF) - Static2.anInt6396, local95, local192, local89);
						return;
					}
					if (arg0 == 5501) {
						anInt3326 -= 4;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						local89 = anIntArray203[anInt3326 + 2];
						local95 = anIntArray203[anInt3326 + 3];
						Static384.method5694((local157 >> 14 & 0x3FFF) - Static2.anInt6396, (local157 & 0x3FFF) - Static348.anInt6273, local89, local192, local95);
						return;
					}
					if (arg0 == 5502) {
						anInt3326 -= 6;
						local157 = anIntArray203[anInt3326];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static181.anInt3578 = local157;
						local192 = anIntArray203[anInt3326 + 1];
						if (local192 + 1 >= Static345.anIntArrayArrayArray13[Static181.anInt3578].length >> 1) {
							throw new RuntimeException();
						}
						Static14.anInt444 = local192;
						Static112.anInt2389 = 0;
						Static38.anInt1153 = anIntArray203[anInt3326 + 2];
						Static77.anInt1946 = anIntArray203[anInt3326 + 3];
						local89 = anIntArray203[anInt3326 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static53.anInt1471 = local89;
						local95 = anIntArray203[anInt3326 + 5];
						if (local95 + 1 >= Static345.anIntArrayArrayArray13[Static53.anInt1471].length >> 1) {
							throw new RuntimeException();
						}
						Static110.anInt6977 = local95;
						Static429.anInt7656 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static43.method976();
						return;
					}
					if (arg0 == 5504) {
						anInt3326 -= 2;
						Static179.method2950(anIntArray203[anInt3326 + 1], anIntArray203[anInt3326]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray203[anInt3326++] = (int) Static165.aFloat28 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray203[anInt3326++] = (int) Static265.aFloat51 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static416.method6102();
						return;
					}
					if (arg0 == 5508) {
						Static16.method470();
						return;
					}
					if (arg0 == 5509) {
						Static116.method2020();
						return;
					}
					if (arg0 == 5510) {
						Static172.method2856();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray203[--anInt3326];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static2.anInt6396;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static181.anInt3574) {
							local192 = Static181.anInt3574;
						}
						local89 -= Static348.anInt6273;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static117.anInt2450) {
							local89 = Static117.anInt2450;
						}
						Static261.anInt4746 = (local192 << 7) + 64;
						Static202.anInt3800 = (local89 << 7) + 64;
						Static429.anInt7656 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static194.method3066();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt3316 -= 2;
						local75 = aStringArray20[anInt3316];
						local81 = aStringArray20[anInt3316 + 1];
						local89 = anIntArray203[--anInt3326];
						if (Static217.anInt3941 != 10) {
							return;
						}
						if (Static414.anInt7038 == 0 && Static149.anInt3065 == 0 && Static17.anInt529 == 0 && Static5.anInt245 == 0) {
							Static256.method3936(local81, local75, local89);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static50.method1141();
						return;
					}
					if (arg0 == 5602) {
						if (Static149.anInt3065 == 0) {
							Static107.anInt2300 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt3326 -= 4;
						if (Static217.anInt3941 != 10) {
							return;
						}
						if (Static414.anInt7038 == 0 && Static149.anInt3065 == 0 && Static17.anInt529 == 0 && Static5.anInt245 == 0) {
							Static289.method4357(anIntArray203[anInt3326 + 2], anIntArray203[anInt3326 + 3], anIntArray203[anInt3326], anIntArray203[anInt3326 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt3316--;
						if (Static217.anInt3941 != 10) {
							return;
						}
						if (Static414.anInt7038 == 0 && Static149.anInt3065 == 0 && Static17.anInt529 == 0 && Static5.anInt245 == 0) {
							Static17.method492(Static362.method5353(aStringArray20[anInt3316]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt3316 -= 3;
						anInt3326 -= 7;
						if (Static217.anInt3941 != 10) {
							return;
						}
						if (Static414.anInt7038 == 0 && Static149.anInt3065 == 0 && Static17.anInt529 == 0 && Static5.anInt245 == 0) {
							Static26.method686(anIntArray203[anInt3326 + 3], anIntArray203[anInt3326 + 4] == 1, aStringArray20[anInt3316 + 1], anIntArray203[anInt3326 + 2], aStringArray20[anInt3316 + 2], anIntArray203[anInt3326 + 5] == 1, Static362.method5353(aStringArray20[anInt3316]), anIntArray203[anInt3326 + 6] == 1, anIntArray203[anInt3326 + 1], anIntArray203[anInt3326]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static17.anInt529 == 0) {
							Static203.anInt3801 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray203[anInt3326++] = Static107.anInt2300;
						return;
					}
					if (arg0 == 5608) {
						anIntArray203[anInt3326++] = Static164.anInt3282;
						return;
					}
					if (arg0 == 5609) {
						anIntArray203[anInt3326++] = Static203.anInt3801;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray20[anInt3316++] = Static156.aStringArray18.length > local157 ? Static197.method3085(Static156.aStringArray18[local157]) : "";
						}
						Static156.aStringArray18 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray203[anInt3326++] = Static317.anInt2331;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray203[--anInt3326];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static291.aClass28_Sub1_1.anInt1043 = local157;
						Static29.method731();
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6002) {
						Static291.aClass28_Sub1_1.method834(anIntArray203[--anInt3326] == 1);
						Static29.method731();
						Static346.method5190();
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6003) {
						Static291.aClass28_Sub1_1.aBoolean72 = anIntArray203[--anInt3326] == 1;
						Static346.method5190();
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6005) {
						Static291.aClass28_Sub1_1.aBoolean78 = anIntArray203[--anInt3326] == 1;
						Static29.method731();
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6006) {
						Static291.aClass28_Sub1_1.aBoolean71 = anIntArray203[--anInt3326] == 1;
						Static126.aClass66_5.method4967(!Static291.aClass28_Sub1_1.aBoolean71);
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6007) {
						Static291.aClass28_Sub1_1.anInt1040 = anIntArray203[--anInt3326];
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6008) {
						Static291.aClass28_Sub1_1.aBoolean80 = anIntArray203[--anInt3326] == 1;
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6009) {
						Static291.aClass28_Sub1_1.aBoolean83 = anIntArray203[--anInt3326] == 1;
						Static29.method731();
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6010) {
						Static291.aClass28_Sub1_1.aBoolean77 = anIntArray203[--anInt3326] == 1;
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray203[--anInt3326];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static29.method731();
						Static291.aClass28_Sub1_1.anInt1034 = local157;
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6012) {
						Static291.aClass28_Sub1_1.aBoolean74 = anIntArray203[--anInt3326] == 1;
						Static54.method1228();
						Static245.method3817();
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6014) {
						Static291.aClass28_Sub1_1.aBoolean86 = anIntArray203[--anInt3326] == 1;
						Static29.method731();
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6015) {
						Static291.aClass28_Sub1_1.aBoolean84 = anIntArray203[--anInt3326] == 1;
						Static29.method731();
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray203[--anInt3326];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static291.aClass28_Sub1_1.anInt1038 = local157;
						Static436.method6326(Static294.anInt5208);
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						return;
					}
					if (arg0 == 6017) {
						Static291.aClass28_Sub1_1.aBoolean73 = anIntArray203[--anInt3326] == 1;
						Static228.method3547();
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray203[--anInt3326];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static291.aClass28_Sub1_1.anInt1042 = local157;
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray203[--anInt3326];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static291.aClass28_Sub1_1.anInt1033) {
							if (Static291.aClass28_Sub1_1.anInt1033 == 0 && Static168.anInt3378 != -1) {
								Static210.method3214(local157, Static168.anInt3378, Static263.aClass100_51);
								Static5.aBoolean10 = false;
							} else if (local157 == 0) {
								Static432.method6289();
								Static5.aBoolean10 = false;
							} else {
								Static10.method336(local157);
							}
							Static291.aClass28_Sub1_1.anInt1033 = local157;
						}
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray203[--anInt3326];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static291.aClass28_Sub1_1.anInt1036 = local157;
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6021) {
						Static291.aClass28_Sub1_1.aBoolean89 = anIntArray203[--anInt3326] == 1;
						Static346.method5190();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray203[--anInt3326];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static270.anInt4876 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static88.method4156(local157);
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						anIntArray203[anInt3326++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray203[--anInt3326];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static291.aClass28_Sub1_1.anInt1035 = local157;
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray203[--anInt3326];
						if (local157 < 0 || local157 > Static190.method580(Static270.anInt4876)) {
							local157 = 0;
						}
						Static291.aClass28_Sub1_1.anInt1037 = local157;
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray203[--anInt3326];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static9.method306(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static291.aClass28_Sub1_1.aBoolean81 = anIntArray203[--anInt3326] != 0;
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						return;
					}
					if (arg0 == 6029) {
						Static291.aClass28_Sub1_1.anInt1040 = anIntArray203[--anInt3326];
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						return;
					}
					if (arg0 == 6030) {
						Static291.aClass28_Sub1_1.aBoolean76 = anIntArray203[--anInt3326] != 0;
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static29.method731();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray203[--anInt3326];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static436.method6326(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray203[--anInt3326];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static291.aClass28_Sub1_1.anInt1032 = local157;
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						Static38.aBoolean93 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray203[--anInt3326];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static291.aClass28_Sub1_1.anInt1026 = local157;
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						return;
					}
					if (arg0 == 6035) {
						Static291.aClass28_Sub1_1.aBoolean88 = anIntArray203[--anInt3326] == 1;
						Static29.method731();
						Static346.method5190();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.anInt1043;
						return;
					}
					if (arg0 == 6102) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.method828(Static294.anInt5208) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.aBoolean72 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.aBoolean78 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.aBoolean71 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.anInt1040;
						return;
					}
					if (arg0 == 6108) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.aBoolean80 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.aBoolean83 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.aBoolean77 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.anInt1034;
						return;
					}
					if (arg0 == 6112) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.aBoolean74 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.aBoolean86 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.aBoolean84 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.anInt1038;
						return;
					}
					if (arg0 == 6117) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.aBoolean73 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.anInt1042;
						return;
					}
					if (arg0 == 6119) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.anInt1033;
						return;
					}
					if (arg0 == 6120) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.anInt1036;
						return;
					}
					if (arg0 == 6121) {
						anIntArray203[anInt3326++] = Static126.aClass66_5.method5074() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray203[anInt3326++] = Static193.method3051();
						return;
					}
					if (arg0 == 6124) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.anInt1035;
						return;
					}
					if (arg0 == 6125) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.anInt1037;
						return;
					}
					if (arg0 == 6126) {
						anIntArray203[anInt3326++] = Static126.aClass66_5.method5049() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.aBoolean82 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.aBoolean81 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.anInt1040;
						return;
					}
					if (arg0 == 6130) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.aBoolean76 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray203[anInt3326++] = Static294.anInt5208;
						return;
					}
					if (arg0 == 6132) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.anInt1032;
						return;
					}
					if (arg0 == 6133) {
						anIntArray203[anInt3326++] = Static325.anInt5594 == 1 || Static325.anInt5594 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray203[anInt3326++] = Static190.method580(Static270.anInt4876);
						return;
					}
					if (arg0 == 6135) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.anInt1026;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt3326 -= 2;
						Static91.aShort32 = (short) anIntArray203[anInt3326];
						if (Static91.aShort32 <= 0) {
							Static91.aShort32 = 256;
						}
						Static23.aShort2 = (short) anIntArray203[anInt3326 + 1];
						if (Static23.aShort2 <= 0) {
							Static23.aShort2 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt3326 -= 2;
						Static379.aShort89 = (short) anIntArray203[anInt3326];
						if (Static379.aShort89 <= 0) {
							Static379.aShort89 = 256;
						}
						Static27.aShort4 = (short) anIntArray203[anInt3326 + 1];
						if (Static27.aShort4 <= 0) {
							Static27.aShort4 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt3326 -= 4;
						Static284.aShort65 = (short) anIntArray203[anInt3326];
						if (Static284.aShort65 <= 0) {
							Static284.aShort65 = 1;
						}
						Static5.aShort1 = (short) anIntArray203[anInt3326 + 1];
						if (Static5.aShort1 <= 0) {
							Static5.aShort1 = 32767;
						} else if (Static5.aShort1 < Static284.aShort65) {
							Static5.aShort1 = Static284.aShort65;
						}
						Static283.aShort104 = (short) anIntArray203[anInt3326 + 2];
						if (Static283.aShort104 <= 0) {
							Static283.aShort104 = 1;
						}
						Static270.aShort64 = (short) anIntArray203[anInt3326 + 3];
						if (Static270.aShort64 <= 0) {
							Static270.aShort64 = 32767;
							return;
						}
						if (Static270.aShort64 < Static283.aShort104) {
							Static270.aShort64 = Static283.aShort104;
						}
						return;
					}
					if (arg0 == 6203) {
						Static6.method204(0, false, 0, Static433.aClass239_15.anInt6898, Static433.aClass239_15.anInt6899);
						anIntArray203[anInt3326++] = Static331.anInt5767;
						anIntArray203[anInt3326++] = Static115.anInt2442;
						return;
					}
					if (arg0 == 6204) {
						anIntArray203[anInt3326++] = Static379.aShort89;
						anIntArray203[anInt3326++] = Static27.aShort4;
						return;
					}
					if (arg0 == 6205) {
						anIntArray203[anInt3326++] = Static91.aShort32;
						anIntArray203[anInt3326++] = Static23.aShort2;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray203[anInt3326++] = (int) (Static449.method6552() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray203[anInt3326++] = (int) (Static449.method6552() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt3326 -= 3;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						local89 = anIntArray203[anInt3326 + 2];
						aCalendar2.clear();
						aCalendar2.set(11, 12);
						aCalendar2.set(local89, local192, local157);
						anIntArray203[anInt3326++] = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6303) {
						aCalendar2.clear();
						aCalendar2.setTime(new Date(Static449.method6552()));
						anIntArray203[anInt3326++] = aCalendar2.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray203[--anInt3326];
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
						anIntArray203[anInt3326++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray203[anInt3326++] = Static328.method4756() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray203[anInt3326++] = Static30.method750() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static217.anInt3941 == 10 && Static414.anInt7038 == 0 && Static149.anInt3065 == 0 && Static17.anInt529 == 0) {
							anIntArray203[anInt3326++] = Static66.method1371() == -1 ? 0 : 1;
							return;
						}
						anIntArray203[anInt3326++] = 1;
						return;
					}
					@Pc(6097) Class97 local6097;
					@Pc(6064) Class152_Sub1 local6064;
					if (arg0 == 6501) {
						local6064 = Static151.method2603();
						if (local6064 != null) {
							anIntArray203[anInt3326++] = local6064.anInt5635;
							anIntArray203[anInt3326++] = local6064.anInt5620;
							aStringArray20[anInt3316++] = local6064.aString47;
							local6097 = local6064.method4729();
							anIntArray203[anInt3326++] = local6097.anInt2936;
							aStringArray20[anInt3316++] = local6097.aString20;
							anIntArray203[anInt3326++] = local6064.anInt5622;
							anIntArray203[anInt3326++] = local6064.anInt5638;
							return;
						}
						anIntArray203[anInt3326++] = -1;
						anIntArray203[anInt3326++] = 0;
						aStringArray20[anInt3316++] = "";
						anIntArray203[anInt3326++] = 0;
						aStringArray20[anInt3316++] = "";
						anIntArray203[anInt3326++] = 0;
						anIntArray203[anInt3326++] = 0;
						return;
					}
					if (arg0 == 6502) {
						local6064 = Static333.method4858();
						if (local6064 != null) {
							anIntArray203[anInt3326++] = local6064.anInt5635;
							anIntArray203[anInt3326++] = local6064.anInt5620;
							aStringArray20[anInt3316++] = local6064.aString47;
							local6097 = local6064.method4729();
							anIntArray203[anInt3326++] = local6097.anInt2936;
							aStringArray20[anInt3316++] = local6097.aString20;
							anIntArray203[anInt3326++] = local6064.anInt5622;
							anIntArray203[anInt3326++] = local6064.anInt5638;
							return;
						}
						anIntArray203[anInt3326++] = -1;
						anIntArray203[anInt3326++] = 0;
						aStringArray20[anInt3316++] = "";
						anIntArray203[anInt3326++] = 0;
						aStringArray20[anInt3316++] = "";
						anIntArray203[anInt3326++] = 0;
						anIntArray203[anInt3326++] = 0;
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray203[--anInt3326];
						if (Static217.anInt3941 == 10 && Static414.anInt7038 == 0 && Static149.anInt3065 == 0 && Static17.anInt529 == 0) {
							anIntArray203[anInt3326++] = Static388.method5715(local157) ? 1 : 0;
							return;
						}
						anIntArray203[anInt3326++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static291.aClass28_Sub1_1.anInt1022 = anIntArray203[--anInt3326];
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						return;
					}
					if (arg0 == 6505) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.anInt1022;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray203[--anInt3326];
						@Pc(6413) Class152_Sub1 local6413 = Static101.method1830(local157);
						if (local6413 != null) {
							anIntArray203[anInt3326++] = local6413.anInt5620;
							aStringArray20[anInt3316++] = local6413.aString47;
							@Pc(6437) Class97 local6437 = local6413.method4729();
							anIntArray203[anInt3326++] = local6437.anInt2936;
							aStringArray20[anInt3316++] = local6437.aString20;
							anIntArray203[anInt3326++] = local6413.anInt5622;
							anIntArray203[anInt3326++] = local6413.anInt5638;
							return;
						}
						anIntArray203[anInt3326++] = -1;
						aStringArray20[anInt3316++] = "";
						anIntArray203[anInt3326++] = 0;
						aStringArray20[anInt3316++] = "";
						anIntArray203[anInt3326++] = 0;
						anIntArray203[anInt3326++] = 0;
						return;
					}
					if (arg0 == 6507) {
						anInt3326 -= 4;
						local157 = anIntArray203[anInt3326];
						local1313 = anIntArray203[anInt3326 + 1] == 1;
						local89 = anIntArray203[anInt3326 + 2];
						local1965 = anIntArray203[anInt3326 + 3] == 1;
						Static89.method1612(local1313, local157, local89, local1965);
						return;
					}
					if (arg0 == 6508) {
						Static276.method4168();
						return;
					}
					if (arg0 == 6509) {
						if (Static217.anInt3941 != 10) {
							return;
						}
						Static110.aBoolean451 = anIntArray203[--anInt3326] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static291.aClass28_Sub1_1.aBoolean85 = anIntArray203[--anInt3326] == 1;
						Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
						return;
					}
					if (arg0 == 6601) {
						anIntArray203[anInt3326++] = Static291.aClass28_Sub1_1.aBoolean85 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static111.aClass8_1 == Static252.aClass8_2) {
					if (arg0 == 6700) {
						local157 = Static432.aClass74_33.method1887();
						if (Static36.anInt1129 != -1) {
							local157++;
						}
						anIntArray203[anInt3326++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray203[--anInt3326];
						if (Static36.anInt1129 != -1) {
							if (local157 == 0) {
								anIntArray203[anInt3326++] = Static36.anInt1129;
								return;
							}
							local157--;
						}
						@Pc(6695) Class6_Sub9 local6695 = (Class6_Sub9) Static432.aClass74_33.method1889();
						while (local157-- > 0) {
							local6695 = (Class6_Sub9) Static432.aClass74_33.method1881();
						}
						anIntArray203[anInt3326++] = local6695.anInt1505;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray203[--anInt3326];
						if (Static35.aClass239ArrayArray1[local157] == null) {
							aStringArray20[anInt3316++] = "";
							return;
						}
						local81 = Static35.aClass239ArrayArray1[local157][0].aString63;
						if (local81 == null) {
							aStringArray20[anInt3316++] = "";
							return;
						}
						aStringArray20[anInt3316++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray203[--anInt3326];
						if (Static35.aClass239ArrayArray1[local157] == null) {
							anIntArray203[anInt3326++] = 0;
							return;
						}
						anIntArray203[anInt3326++] = Static35.aClass239ArrayArray1[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt3326 -= 2;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						if (Static35.aClass239ArrayArray1[local157] == null) {
							aStringArray20[anInt3316++] = "";
							return;
						}
						local3345 = Static35.aClass239ArrayArray1[local157][local192].aString63;
						if (local3345 == null) {
							aStringArray20[anInt3316++] = "";
							return;
						}
						aStringArray20[anInt3316++] = local3345;
						return;
					}
					if (arg0 == 6705) {
						anInt3326 -= 2;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						if (Static35.aClass239ArrayArray1[local157] == null) {
							anIntArray203[anInt3326++] = 0;
							return;
						}
						anIntArray203[anInt3326++] = Static35.aClass239ArrayArray1[local157][local192].anInt6913;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt3326 -= 3;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						local89 = anIntArray203[anInt3326 + 2];
						Static115.method2011(local89, local157 << 16 | local192, "", 1);
						return;
					}
					if (arg0 == 6708) {
						anInt3326 -= 3;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						local89 = anIntArray203[anInt3326 + 2];
						Static115.method2011(local89, local157 << 16 | local192, "", 2);
						return;
					}
					if (arg0 == 6709) {
						anInt3326 -= 3;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						local89 = anIntArray203[anInt3326 + 2];
						Static115.method2011(local89, local157 << 16 | local192, "", 3);
						return;
					}
					if (arg0 == 6710) {
						anInt3326 -= 3;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						local89 = anIntArray203[anInt3326 + 2];
						Static115.method2011(local89, local157 << 16 | local192, "", 4);
						return;
					}
					if (arg0 == 6711) {
						anInt3326 -= 3;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						local89 = anIntArray203[anInt3326 + 2];
						Static115.method2011(local89, local157 << 16 | local192, "", 5);
						return;
					}
					if (arg0 == 6712) {
						anInt3326 -= 3;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						local89 = anIntArray203[anInt3326 + 2];
						Static115.method2011(local89, local157 << 16 | local192, "", 6);
						return;
					}
					if (arg0 == 6713) {
						anInt3326 -= 3;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						local89 = anIntArray203[anInt3326 + 2];
						Static115.method2011(local89, local157 << 16 | local192, "", 7);
						return;
					}
					if (arg0 == 6714) {
						anInt3326 -= 3;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						local89 = anIntArray203[anInt3326 + 2];
						Static115.method2011(local89, local157 << 16 | local192, "", 8);
						return;
					}
					if (arg0 == 6715) {
						anInt3326 -= 3;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						local89 = anIntArray203[anInt3326 + 2];
						Static115.method2011(local89, local157 << 16 | local192, "", 9);
						return;
					}
					if (arg0 == 6716) {
						anInt3326 -= 3;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						local89 = anIntArray203[anInt3326 + 2];
						Static115.method2011(local89, local157 << 16 | local192, "", 10);
						return;
					}
					if (arg0 == 6717) {
						anInt3326 -= 3;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						local89 = anIntArray203[anInt3326 + 2];
						@Pc(7283) Class239 local7283 = Static251.method5357(local89, local157 << 16 | local192);
						Static54.method1224();
						@Pc(7288) Class6_Sub8 local7288 = Static50.method1150(local7283);
						Static412.method6083(local7283, local7288.anInt1488, local7288.method1216());
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7316) Class260 local7316;
					if (arg0 == 6800) {
						local157 = anIntArray203[--anInt3326];
						local7316 = Static244.aClass169_29.method3948(local157);
						if (local7316.aString70 == null) {
							aStringArray20[anInt3316++] = "";
							return;
						}
						aStringArray20[anInt3316++] = local7316.aString70;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray203[--anInt3326];
						local7316 = Static244.aClass169_29.method3948(local157);
						anIntArray203[anInt3326++] = local7316.anInt7745;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray203[--anInt3326];
						local7316 = Static244.aClass169_29.method3948(local157);
						anIntArray203[anInt3326++] = local7316.anInt7751;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray203[--anInt3326];
						local7316 = Static244.aClass169_29.method3948(local157);
						anIntArray203[anInt3326++] = local7316.anInt7733;
						return;
					}
					if (arg0 == 6804) {
						anInt3326 -= 2;
						local157 = anIntArray203[anInt3326];
						local192 = anIntArray203[anInt3326 + 1];
						@Pc(7438) Class171 local7438 = Static80.aClass181_1.method4294(local192);
						if (local7438.method4092()) {
							aStringArray20[anInt3316++] = Static244.aClass169_29.method3948(local157).method6327(local7438.aString33, local192);
							return;
						}
						anIntArray203[anInt3326++] = Static244.aClass169_29.method3948(local157).method6329(local192, local7438.anInt4865);
						return;
					}
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Ljava/lang/String;")
	private static String method2746(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray22[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IZ)V")
	public static void method2747() {
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
	public static void method2748() {
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!vf;I)V")
	private static void method2749(@OriginalArg(0) Class6_Sub42 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray36;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class6_Sub2_Sub17 local12 = Static47.method1027(local8);
		if (local12 == null) {
			return;
		}
		anIntArray205 = new int[local12.anInt7491];
		@Pc(21) int local21 = 0;
		aStringArray21 = new String[local12.anInt7493];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt7471;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt7474;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass239_13 == null ? -1 : arg0.aClass239_13.anInt6908;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt7472;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass239_13 == null ? -1 : arg0.aClass239_13.anInt6907;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass239_14 == null ? -1 : arg0.aClass239_14.anInt6908;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass239_14 == null ? -1 : arg0.aClass239_14.anInt6907;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt7475;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt7470;
				}
				anIntArray205[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString67;
				}
				aStringArray21[local27++] = local135;
			}
		}
		anInt3328 = arg0.anInt7473;
		method2755(local12, arg1);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public static void method2750(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static88.method4151(arg0)) {
			return;
		}
		@Pc(12) Class239[] local12 = Static35.aClass239ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class239 local19 = local12[local14];
			if (local19.anObjectArray28 != null) {
				@Pc(26) Class6_Sub42 local26 = new Class6_Sub42();
				local26.aClass239_13 = local19;
				local26.anObjectArray36 = local19.anObjectArray28;
				method2749(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method2751(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static291.anInt5199 == 0 && (Static18.aBoolean26 && !Static225.aBoolean270 || Static421.aBoolean475)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static280.aClass267_66.method6581(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static280.aClass267_66.method6581(0).length());
		} else if (local11.startsWith(Static420.aClass267_103.method6581(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static420.aClass267_103.method6581(0).length());
		} else if (local11.startsWith(Static138.aClass267_60.method6581(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static138.aClass267_60.method6581(0).length());
		} else if (local11.startsWith(Static157.aClass267_48.method6581(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static157.aClass267_48.method6581(0).length());
		} else if (local11.startsWith(Static123.aClass267_41.method6581(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static123.aClass267_41.method6581(0).length());
		} else if (local11.startsWith(Static63.aClass267_21.method6581(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static63.aClass267_21.method6581(0).length());
		} else if (local11.startsWith(Static126.aClass267_44.method6581(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static126.aClass267_44.method6581(0).length());
		} else if (local11.startsWith(Static185.aClass267_50.method6581(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static185.aClass267_50.method6581(0).length());
		} else if (local11.startsWith(Static18.aClass267_7.method6581(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static18.aClass267_7.method6581(0).length());
		} else if (local11.startsWith(Static284.aClass267_67.method6581(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static284.aClass267_67.method6581(0).length());
		} else if (local11.startsWith(Static71.aClass267_23.method6581(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static71.aClass267_23.method6581(0).length());
		} else if (local11.startsWith(Static321.aClass267_75.method6581(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static321.aClass267_75.method6581(0).length());
		} else if (Static161.anInt3239 != 0) {
			if (local11.startsWith(Static280.aClass267_66.method6581(Static161.anInt3239))) {
				local13 = 0;
				arg0 = arg0.substring(Static280.aClass267_66.method6581(Static161.anInt3239).length());
			} else if (local11.startsWith(Static420.aClass267_103.method6581(Static161.anInt3239))) {
				local13 = 1;
				arg0 = arg0.substring(Static420.aClass267_103.method6581(Static161.anInt3239).length());
			} else if (local11.startsWith(Static138.aClass267_60.method6581(Static161.anInt3239))) {
				local13 = 2;
				arg0 = arg0.substring(Static138.aClass267_60.method6581(Static161.anInt3239).length());
			} else if (local11.startsWith(Static157.aClass267_48.method6581(Static161.anInt3239))) {
				local13 = 3;
				arg0 = arg0.substring(Static157.aClass267_48.method6581(Static161.anInt3239).length());
			} else if (local11.startsWith(Static123.aClass267_41.method6581(Static161.anInt3239))) {
				local13 = 4;
				arg0 = arg0.substring(Static123.aClass267_41.method6581(Static161.anInt3239).length());
			} else if (local11.startsWith(Static63.aClass267_21.method6581(Static161.anInt3239))) {
				local13 = 5;
				arg0 = arg0.substring(Static63.aClass267_21.method6581(Static161.anInt3239).length());
			} else if (local11.startsWith(Static126.aClass267_44.method6581(Static161.anInt3239))) {
				local13 = 6;
				arg0 = arg0.substring(Static126.aClass267_44.method6581(Static161.anInt3239).length());
			} else if (local11.startsWith(Static185.aClass267_50.method6581(Static161.anInt3239))) {
				local13 = 7;
				arg0 = arg0.substring(Static185.aClass267_50.method6581(Static161.anInt3239).length());
			} else if (local11.startsWith(Static18.aClass267_7.method6581(Static161.anInt3239))) {
				local13 = 8;
				arg0 = arg0.substring(Static18.aClass267_7.method6581(Static161.anInt3239).length());
			} else if (local11.startsWith(Static284.aClass267_67.method6581(Static161.anInt3239))) {
				local13 = 9;
				arg0 = arg0.substring(Static284.aClass267_67.method6581(Static161.anInt3239).length());
			} else if (local11.startsWith(Static71.aClass267_23.method6581(Static161.anInt3239))) {
				local13 = 10;
				arg0 = arg0.substring(Static71.aClass267_23.method6581(Static161.anInt3239).length());
			} else if (local11.startsWith(Static321.aClass267_75.method6581(Static161.anInt3239))) {
				local13 = 11;
				arg0 = arg0.substring(Static321.aClass267_75.method6581(Static161.anInt3239).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static349.aClass267_82.method6581(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static349.aClass267_82.method6581(0).length());
		} else if (local11.startsWith(Static322.aClass267_76.method6581(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static322.aClass267_76.method6581(0).length());
		} else if (local11.startsWith(Static353.aClass267_83.method6581(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static353.aClass267_83.method6581(0).length());
		} else if (local11.startsWith(Static72.aClass267_24.method6581(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static72.aClass267_24.method6581(0).length());
		} else if (local11.startsWith(Static334.aClass267_78.method6581(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static334.aClass267_78.method6581(0).length());
		} else if (Static161.anInt3239 != 0) {
			if (local11.startsWith(Static349.aClass267_82.method6581(Static161.anInt3239))) {
				local451 = 1;
				arg0 = arg0.substring(Static349.aClass267_82.method6581(Static161.anInt3239).length());
			} else if (local11.startsWith(Static322.aClass267_76.method6581(Static161.anInt3239))) {
				local451 = 2;
				arg0 = arg0.substring(Static322.aClass267_76.method6581(Static161.anInt3239).length());
			} else if (local11.startsWith(Static353.aClass267_83.method6581(Static161.anInt3239))) {
				local451 = 3;
				arg0 = arg0.substring(Static353.aClass267_83.method6581(Static161.anInt3239).length());
			} else if (local11.startsWith(Static72.aClass267_24.method6581(Static161.anInt3239))) {
				local451 = 4;
				arg0 = arg0.substring(Static72.aClass267_24.method6581(Static161.anInt3239).length());
			} else if (local11.startsWith(Static334.aClass267_78.method6581(Static161.anInt3239))) {
				local451 = 5;
				arg0 = arg0.substring(Static334.aClass267_78.method6581(Static161.anInt3239).length());
			}
		}
		Static403.method5961(Static144.aClass92_53);
		Static109.aClass6_Sub1_Sub1_5.method6439(0);
		@Pc(646) int local646 = Static109.aClass6_Sub1_Sub1_5.anInt7898;
		if (arg1 == 5021) {
			Static109.aClass6_Sub1_Sub1_5.method6439(1);
		} else if (arg1 == 5022) {
			Static109.aClass6_Sub1_Sub1_5.method6439(2);
		} else {
			Static109.aClass6_Sub1_Sub1_5.method6439(0);
		}
		Static109.aClass6_Sub1_Sub1_5.method6439(local13);
		Static109.aClass6_Sub1_Sub1_5.method6439(local451);
		Static268.method4087(arg0, Static109.aClass6_Sub1_Sub1_5);
		Static109.aClass6_Sub1_Sub1_5.method6458(Static109.aClass6_Sub1_Sub1_5.anInt7898 - local646);
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	private static void method2752(@OriginalArg(0) int arg0) {
		@Pc(3) Class239 local3 = Static121.method2092(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class239[] local13 = Static373.aClass239ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class239[] local19 = Static35.aClass239ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static373.aClass239ArrayArray2[local9] = new Class239[local22];
			Static459.method6342(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static459.method6342(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!pp;II)V")
	public static void method2753(@OriginalArg(0) Class198 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class6_Sub2_Sub17 local5 = Static223.method3357(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray205 = new int[local5.anInt7491];
		aStringArray21 = new String[local5.anInt7493];
		if (local5.aClass198_8 == Static328.aClass198_6 || local5.aClass198_8 == Static313.aClass198_5 || local5.aClass198_8 == Static448.aClass198_9) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static396.aClass239_10 != null) {
				local30 = Static396.aClass239_10.anInt6922;
				local32 = Static396.aClass239_10.anInt6905;
			}
			anIntArray205[0] = Static186.aClass50_1.method1436() - local30;
			anIntArray205[1] = Static186.aClass50_1.method1446() - local32;
		}
		method2755(local5, 200000);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!vg;I)V")
	private static void method2755(@OriginalArg(0) Class6_Sub2_Sub17 arg0, @OriginalArg(1) int arg1) {
		anInt3326 = 0;
		anInt3316 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray514;
		@Pc(11) int[] local11 = arg0.anIntArray513;
		@Pc(13) byte local13 = -1;
		anInt3324 = 0;
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
						method2757(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method2745(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray203[anInt3326++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray203[anInt3326++] = Static393.aClass207_1.anIntArray381[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static393.aClass207_1.method4637(anIntArray203[--anInt3326], local54);
					} else if (local31 == 3) {
						aStringArray20[anInt3316++] = arg0.aStringArray47[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt3326 -= 2;
						if (anIntArray203[anInt3326] != anIntArray203[anInt3326 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt3326 -= 2;
						if (anIntArray203[anInt3326] == anIntArray203[anInt3326 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt3326 -= 2;
						if (anIntArray203[anInt3326] < anIntArray203[anInt3326 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt3326 -= 2;
						if (anIntArray203[anInt3326] > anIntArray203[anInt3326 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt3324 == 0) {
							return;
						}
						@Pc(216) Class41 local216 = aClass41Array1[--anInt3324];
						arg0 = local216.aClass6_Sub2_Sub17_1;
						local8 = arg0.anIntArray514;
						local11 = arg0.anIntArray513;
						local5 = local216.anInt1670;
						anIntArray205 = local216.anIntArray99;
						aStringArray21 = local216.aStringArray7;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray203[anInt3326++] = Static393.aClass207_1.method4635(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static393.aClass207_1.method4642(local54, anIntArray203[--anInt3326]);
					} else if (local31 == 31) {
						anInt3326 -= 2;
						if (anIntArray203[anInt3326] <= anIntArray203[anInt3326 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt3326 -= 2;
						if (anIntArray203[anInt3326] >= anIntArray203[anInt3326 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray203[anInt3326++] = anIntArray205[local11[local5]];
					} else if (local31 == 34) {
						anIntArray205[local11[local5]] = anIntArray203[--anInt3326];
					} else if (local31 == 35) {
						aStringArray20[anInt3316++] = aStringArray21[local11[local5]];
					} else if (local31 == 36) {
						aStringArray21[local11[local5]] = aStringArray20[--anInt3316];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt3316 -= local54;
						@Pc(400) String local400 = Static171.method2815(aStringArray20, local54, anInt3316);
						aStringArray20[anInt3316++] = local400;
					} else if (local31 == 38) {
						anInt3326--;
					} else if (local31 == 39) {
						anInt3316--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class6_Sub2_Sub17 local436 = Static47.method1027(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt7491];
							@Pc(450) String[] local450 = new String[local436.anInt7493];
							for (local452 = 0; local452 < local436.anInt7492; local452++) {
								local446[local452] = anIntArray203[anInt3326 + local452 - local436.anInt7492];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt7490; local471++) {
								local450[local471] = aStringArray20[anInt3316 + local471 - local436.anInt7490];
							}
							anInt3326 -= local436.anInt7492;
							anInt3316 -= local436.anInt7490;
							@Pc(502) Class41 local502 = new Class41();
							local502.aClass6_Sub2_Sub17_1 = arg0;
							local502.anInt1670 = local5;
							local502.anIntArray99 = anIntArray205;
							local502.aStringArray7 = aStringArray21;
							if (anInt3324 >= aClass41Array1.length) {
								throw new RuntimeException();
							}
							aClass41Array1[anInt3324++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray514;
							local11 = local436.anIntArray513;
							local5 = -1;
							anIntArray205 = local446;
							aStringArray21 = local450;
						} else if (local31 == 42) {
							anIntArray203[anInt3326++] = Static331.anIntArray389[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static331.anIntArray389[local54] = anIntArray203[--anInt3326];
							Static342.method4957(local54);
							Static304.aBoolean346 |= Static384.aBooleanArray25[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray203[--anInt3326];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray204[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray19[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray203[--anInt3326];
							if (local603 < 0 || local603 >= anIntArray204[local54]) {
								throw new RuntimeException();
							}
							anIntArray203[anInt3326++] = anIntArrayArray19[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt3326 -= 2;
							local603 = anIntArray203[anInt3326];
							if (local603 < 0 || local603 >= anIntArray204[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray19[local54][local603] = anIntArray203[anInt3326 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static172.aStringArray23[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray20[anInt3316++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static172.aStringArray23[local54] = aStringArray20[--anInt3316];
							Static197.method3086(local54);
						} else if (local31 == 51) {
							@Pc(774) Class74 local774 = arg0.aClass74Array1[local11[local5]];
							@Pc(787) Class6_Sub39 local787 = (Class6_Sub39) local774.method1883((long) anIntArray203[--anInt3326]);
							if (local787 != null) {
								local5 += local787.anInt6429;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString68 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong229).append(" ");
				for (local603 = anInt3324 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass41Array1[local603].aClass6_Sub2_Sub17_1.aLong229).append(" ");
				}
				local855.append("op: ").append(local13);
				Static390.method5741(local837, local855.toString());
			} else {
				Static61.method1338("Clientscript error in: " + arg0.aString68);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString68).append("\n");
				for (local603 = anInt3324 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass41Array1[local603].aClass6_Sub2_Sub17_1.aString68).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static390.method5741(local837, local855.toString());
				Static36.method908(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
	private static void method2756(@OriginalArg(0) int arg0) {
		@Pc(3) Class239 local3 = Static121.method2092(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class239[] local13 = Static373.aClass239ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class239[] local19 = Static35.aClass239ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static373.aClass239ArrayArray2[local9] = new Class239[local22];
			Static459.method6342(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static459.method6342(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(IZ)V")
	private static void method2757(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class239 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class239 local35;
		@Pc(13) int local13;
		@Pc(210) Class239 local210;
		@Pc(158) Class239 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt3326 -= 3;
				local13 = anIntArray203[anInt3326];
				local19 = anIntArray203[anInt3326 + 1];
				local25 = anIntArray203[anInt3326 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static121.method2092(local13);
				if (local35.aClass239Array2 == null) {
					local35.aClass239Array2 = new Class239[local25 + 1];
				}
				if (local35.aClass239Array2.length <= local25) {
					@Pc(54) Class239[] local54 = new Class239[local25 + 1];
					for (local56 = 0; local56 < local35.aClass239Array2.length; local56++) {
						local54[local56] = local35.aClass239Array2[local56];
					}
					local35.aClass239Array2 = local54;
				}
				if (local25 > 0 && local35.aClass239Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class239 local99 = new Class239();
				local99.anInt6900 = local19;
				local99.anInt6895 = local99.anInt6908 = local35.anInt6908;
				local99.anInt6907 = local25;
				local35.aClass239Array2[local25] = local99;
				if (arg1) {
					aClass239_7 = local99;
				} else {
					aClass239_6 = local99;
				}
				Static437.method6328(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass239_7 : aClass239_6;
				if (local137.anInt6907 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static121.method2092(local137.anInt6908);
				local158.aClass239Array2[local137.anInt6907] = null;
				Static437.method6328(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static121.method2092(anIntArray203[--anInt3326]);
				local137.aClass239Array2 = null;
				Static437.method6328(local137);
				return;
			}
			if (arg0 == 200) {
				anInt3326 -= 2;
				local13 = anIntArray203[anInt3326];
				local19 = anIntArray203[anInt3326 + 1];
				local210 = Static251.method5357(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray203[anInt3326++] = 1;
					if (arg1) {
						aClass239_7 = local210;
						return;
					}
					aClass239_6 = local210;
					return;
				}
				anIntArray203[anInt3326++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray203[--anInt3326];
				local158 = Static121.method2092(local13);
				if (local158 != null) {
					anIntArray203[anInt3326++] = 1;
					if (arg1) {
						aClass239_7 = local158;
						return;
					}
					aClass239_6 = local158;
					return;
				}
				anIntArray203[anInt3326++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray203[--anInt3326];
				method2756(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray203[--anInt3326];
				method2752(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt3326 -= 2;
					local13 = anIntArray203[anInt3326];
					local19 = anIntArray203[anInt3326 + 1];
					for (local25 = 0; local25 < Static137.anIntArray173.length; local25++) {
						if (Static137.anIntArray173[local25] == local13) {
							Static302.aClass3_Sub2_Sub1_Sub2_2.aClass259_1.method6313(local19, local25, Static270.aClass18_1);
							return;
						}
					}
					for (local353 = 0; local353 < Static421.anIntArray517.length; local353++) {
						if (Static421.anIntArray517[local353] == local13) {
							Static302.aClass3_Sub2_Sub1_Sub2_2.aClass259_1.method6313(local19, local353, Static270.aClass18_1);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt3326 -= 2;
					local13 = anIntArray203[anInt3326];
					local19 = anIntArray203[anInt3326 + 1];
					Static302.aClass3_Sub2_Sub1_Sub2_2.aClass259_1.method6314(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray203[--anInt3326] != 0;
					Static302.aClass3_Sub2_Sub1_Sub2_2.aClass259_1.method6309(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static121.method2092(anIntArray203[--anInt3326]);
					} else {
						local137 = arg1 ? aClass239_7 : aClass239_6;
					}
					if (arg0 == 1100) {
						anInt3326 -= 2;
						local137.anInt6931 = anIntArray203[anInt3326];
						if (local137.anInt6931 > local137.anInt6890 - local137.anInt6898) {
							local137.anInt6931 = local137.anInt6890 - local137.anInt6898;
						}
						if (local137.anInt6931 < 0) {
							local137.anInt6931 = 0;
						}
						local137.anInt6887 = anIntArray203[anInt3326 + 1];
						if (local137.anInt6887 > local137.anInt6941 - local137.anInt6899) {
							local137.anInt6887 = local137.anInt6941 - local137.anInt6899;
						}
						if (local137.anInt6887 < 0) {
							local137.anInt6887 = 0;
						}
						Static437.method6328(local137);
						if (local137.anInt6907 == -1) {
							Static207.method3181(local137.anInt6908);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.lb = anIntArray203[--anInt3326];
						Static437.method6328(local137);
						if (local137.anInt6907 == -1) {
							Static200.method3109(local137.anInt6908);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean444 = anIntArray203[--anInt3326] == 1;
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt6914 = anIntArray203[--anInt3326];
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt6901 = anIntArray203[--anInt3326];
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray203[--anInt3326];
						if (local137.anInt6920 != local19) {
							local137.anInt6920 = local19;
							Static437.method6328(local137);
						}
						if (local137.anInt6907 == -1) {
							Static445.method6520(local137.anInt6908);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt6884 = anIntArray203[--anInt3326];
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean441 = anIntArray203[--anInt3326] == 1;
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt6886 = 1;
						local137.anInt6910 = anIntArray203[--anInt3326];
						Static437.method6328(local137);
						if (local137.anInt6907 == -1) {
							Static394.method5790(local137.anInt6908);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt3326 -= 6;
						local137.anInt6966 = anIntArray203[anInt3326];
						local137.anInt6962 = anIntArray203[anInt3326 + 1];
						local137.anInt6885 = anIntArray203[anInt3326 + 2];
						local137.anInt6935 = anIntArray203[anInt3326 + 3];
						local137.anInt6889 = anIntArray203[anInt3326 + 4];
						local137.anInt6943 = anIntArray203[anInt3326 + 5];
						Static437.method6328(local137);
						if (local137.anInt6907 == -1) {
							Static448.method6550(local137.anInt6908);
							Static9.method307(local137.anInt6908);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray203[--anInt3326];
						if (local137.anInt6924 != local19) {
							local137.anInt6924 = local19;
							local137.anInt6932 = 0;
							local137.anInt6929 = 1;
							local137.anInt6934 = 0;
							Static437.method6328(local137);
						}
						if (local137.anInt6907 == -1) {
							Static68.method6109(local137.anInt6908);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean442 = anIntArray203[--anInt3326] == 1;
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray20[--anInt3316];
						if (!local1101.equals(local137.aString62)) {
							local137.aString62 = local1101;
							Static437.method6328(local137);
						}
						if (local137.anInt6907 == -1) {
							Static438.method6348(local137.anInt6908);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt6892 = anIntArray203[--anInt3326];
						Static437.method6328(local137);
						if (local137.anInt6907 == -1) {
							Static79.method1524(local137.anInt6908);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt3326 -= 3;
						local137.anInt6883 = anIntArray203[anInt3326];
						local137.anInt6952 = anIntArray203[anInt3326 + 1];
						local137.anInt6919 = anIntArray203[anInt3326 + 2];
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean439 = anIntArray203[--anInt3326] == 1;
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt6928 = anIntArray203[--anInt3326];
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt6882 = anIntArray203[--anInt3326];
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean437 = anIntArray203[--anInt3326] == 1;
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean436 = anIntArray203[--anInt3326] == 1;
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt3326 -= 2;
						local137.anInt6890 = anIntArray203[anInt3326];
						local137.anInt6941 = anIntArray203[anInt3326 + 1];
						Static437.method6328(local137);
						if (local137.anInt6900 == 0) {
							Static141.method1120(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt3326 -= 2;
						local137.anInt6909 = (short) anIntArray203[anInt3326];
						local137.anInt6965 = (short) anIntArray203[anInt3326 + 1];
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean447 = anIntArray203[--anInt3326] == 1;
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt6943 = anIntArray203[--anInt3326];
						Static437.method6328(local137);
						if (local137.anInt6907 == -1) {
							Static448.method6550(local137.anInt6908);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray203[--anInt3326];
						local137.aBoolean446 = local19 == 1;
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt3326 -= 2;
						local137.anInt6945 = anIntArray203[anInt3326];
						local137.anInt6915 = anIntArray203[anInt3326 + 1];
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt6958 = anIntArray203[--anInt3326];
						Static437.method6328(local137);
						return;
					}
					@Pc(1454) Class171 local1454;
					if (arg0 == 1127) {
						anInt3326 -= 2;
						local19 = anIntArray203[anInt3326];
						local25 = anIntArray203[anInt3326 + 1];
						local1454 = Static80.aClass181_1.method4294(local19);
						if (local25 != local1454.anInt4865) {
							local137.method5727(local25, local19);
							return;
						}
						local137.method5728(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray203[--anInt3326];
						local1488 = aStringArray20[--anInt3316];
						local1454 = Static80.aClass181_1.method4294(local19);
						if (!local1454.aString33.equals(local1488)) {
							local137.method5729(local19, local1488);
							return;
						}
						local137.method5728(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static121.method2092(anIntArray203[--anInt3326]);
						} else {
							local137 = arg1 ? aClass239_7 : aClass239_6;
						}
						if (arg0 == 1300) {
							local19 = anIntArray203[--anInt3326] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method5738(local19, aStringArray20[--anInt3316]);
								return;
							}
							anInt3316--;
							return;
						}
						if (arg0 == 1301) {
							anInt3326 -= 2;
							local19 = anIntArray203[anInt3326];
							local25 = anIntArray203[anInt3326 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass239_12 = null;
								return;
							}
							local137.aClass239_12 = Static251.method5357(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray203[--anInt3326];
							if (local19 != Static131.anInt2785 && local19 != Static69.anInt1818 && local19 != Static141.anInt1372) {
								return;
							}
							local137.anInt6955 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt6948 = anIntArray203[--anInt3326];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt6917 = anIntArray203[--anInt3326];
							return;
						}
						if (arg0 == 1305) {
							local137.aString60 = aStringArray20[--anInt3316];
							return;
						}
						if (arg0 == 1306) {
							local137.aString61 = aStringArray20[--anInt3316];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray45 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt6956 = anIntArray203[--anInt3326];
							local137.anInt6949 = anIntArray203[--anInt3326];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray203[--anInt3326];
							local25 = anIntArray203[--anInt3326];
							if (local25 >= 1 && local25 <= 10) {
								local137.method5733(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString59 = aStringArray20[--anInt3316];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt6957 = anIntArray203[--anInt3326];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt3326 -= 3;
								local19 = anIntArray203[anInt3326] - 1;
								local25 = anIntArray203[anInt3326 + 1];
								local353 = anIntArray203[anInt3326 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt3326 -= 2;
								local19 = 10;
								local25 = anIntArray203[anInt3326];
								local353 = anIntArray203[anInt3326 + 1];
							}
							if (local137.aByteArray86 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray86 = new byte[11];
								local137.aByteArray87 = new byte[11];
								local137.anIntArray476 = new int[11];
							}
							local137.aByteArray86[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean449 = false;
								for (local2290 = 0; local2290 < local137.aByteArray86.length; local2290++) {
									if (local137.aByteArray86[local2290] != 0) {
										local137.aBoolean449 = true;
										break;
									}
								}
							} else {
								local137.aBoolean449 = true;
							}
							local137.aByteArray87[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt6927 = anIntArray203[--anInt3326];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static121.method2092(anIntArray203[--anInt3326]);
						} else {
							local137 = arg1 ? aClass239_7 : aClass239_6;
						}
						local1101 = aStringArray20[--anInt3316];
						@Pc(2369) int[] local2369 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray203[--anInt3326];
							if (local353 > 0) {
								local2369 = new int[local353];
								while (local353-- > 0) {
									local2369[local353] = anIntArray203[--anInt3326];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
						for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2421[local2290] = aStringArray20[--anInt3316];
							} else {
								local2421[local2290] = Integer.valueOf(anIntArray203[--anInt3326]);
							}
						}
						local56 = anIntArray203[--anInt3326];
						if (local56 == -1) {
							local2421 = null;
						} else {
							local2421[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray12 = local2421;
						} else if (arg0 == 1401) {
							local137.anObjectArray20 = local2421;
						} else if (arg0 == 1402) {
							local137.anObjectArray23 = local2421;
						} else if (arg0 == 1403) {
							local137.anObjectArray33 = local2421;
						} else if (arg0 == 1404) {
							local137.anObjectArray18 = local2421;
						} else if (arg0 == 1405) {
							local137.anObjectArray26 = local2421;
						} else if (arg0 == 1406) {
							local137.anObjectArray13 = local2421;
						} else if (arg0 == 1407) {
							local137.anObjectArray22 = local2421;
							local137.anIntArray474 = local2369;
						} else if (arg0 == 1408) {
							local137.anObjectArray15 = local2421;
						} else if (arg0 == 1409) {
							local137.anObjectArray32 = local2421;
						} else if (arg0 == 1410) {
							local137.anObjectArray34 = local2421;
						} else if (arg0 == 1411) {
							local137.anObjectArray9 = local2421;
						} else if (arg0 == 1412) {
							local137.anObjectArray5 = local2421;
						} else if (arg0 == 1414) {
							local137.anObjectArray4 = local2421;
							local137.anIntArray477 = local2369;
						} else if (arg0 == 1415) {
							local137.anObjectArray17 = local2421;
							local137.anIntArray481 = local2369;
						} else if (arg0 == 1416) {
							local137.anObjectArray14 = local2421;
						} else if (arg0 == 1417) {
							local137.anObjectArray16 = local2421;
						} else if (arg0 == 1418) {
							local137.anObjectArray27 = local2421;
						} else if (arg0 == 1419) {
							local137.anObjectArray24 = local2421;
						} else if (arg0 == 1420) {
							local137.anObjectArray19 = local2421;
						} else if (arg0 == 1421) {
							local137.anObjectArray7 = local2421;
						} else if (arg0 == 1422) {
							local137.anObjectArray8 = local2421;
						} else if (arg0 == 1423) {
							local137.anObjectArray10 = local2421;
						} else if (arg0 == 1424) {
							local137.anObjectArray25 = local2421;
						} else if (arg0 == 1425) {
							local137.anObjectArray29 = local2421;
						} else if (arg0 == 1426) {
							local137.anObjectArray30 = local2421;
						} else if (arg0 == 1427) {
							local137.anObjectArray31 = local2421;
						} else if (arg0 == 1428) {
							local137.anObjectArray6 = local2421;
							local137.anIntArray480 = local2369;
						} else if (arg0 == 1429) {
							local137.anObjectArray21 = local2421;
							local137.anIntArray478 = local2369;
						} else if (arg0 == 1430) {
							local137.anObjectArray11 = local2421;
						}
						local137.aBoolean435 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass239_7 : aClass239_6;
						if (arg0 == 1500) {
							anIntArray203[anInt3326++] = local137.anInt6922;
							return;
						}
						if (arg0 == 1501) {
							anIntArray203[anInt3326++] = local137.anInt6905;
							return;
						}
						if (arg0 == 1502) {
							anIntArray203[anInt3326++] = local137.anInt6898;
							return;
						}
						if (arg0 == 1503) {
							anIntArray203[anInt3326++] = local137.anInt6899;
							return;
						}
						if (arg0 == 1504) {
							anIntArray203[anInt3326++] = local137.aBoolean438 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray203[anInt3326++] = local137.anInt6895;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static211.method3216(local137);
							anIntArray203[anInt3326++] = local158 == null ? -1 : local158.anInt6908;
							return;
						}
					} else {
						@Pc(3017) Class171 local3017;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass239_7 : aClass239_6;
							if (arg0 == 1600) {
								anIntArray203[anInt3326++] = local137.anInt6931;
								return;
							}
							if (arg0 == 1601) {
								anIntArray203[anInt3326++] = local137.anInt6887;
								return;
							}
							if (arg0 == 1602) {
								aStringArray20[anInt3316++] = local137.aString62;
								return;
							}
							if (arg0 == 1603) {
								anIntArray203[anInt3326++] = local137.anInt6890;
								return;
							}
							if (arg0 == 1604) {
								anIntArray203[anInt3326++] = local137.anInt6941;
								return;
							}
							if (arg0 == 1605) {
								anIntArray203[anInt3326++] = local137.anInt6943;
								return;
							}
							if (arg0 == 1606) {
								anIntArray203[anInt3326++] = local137.anInt6885;
								return;
							}
							if (arg0 == 1607) {
								anIntArray203[anInt3326++] = local137.anInt6889;
								return;
							}
							if (arg0 == 1608) {
								anIntArray203[anInt3326++] = local137.anInt6935;
								return;
							}
							if (arg0 == 1609) {
								anIntArray203[anInt3326++] = local137.anInt6914;
								return;
							}
							if (arg0 == 1610) {
								anIntArray203[anInt3326++] = local137.anInt6966;
								return;
							}
							if (arg0 == 1611) {
								anIntArray203[anInt3326++] = local137.anInt6962;
								return;
							}
							if (arg0 == 1612) {
								anIntArray203[anInt3326++] = local137.anInt6920;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray203[--anInt3326];
								local3017 = Static80.aClass181_1.method4294(local19);
								if (local3017.method4092()) {
									aStringArray20[anInt3316++] = local137.method5735(local19, local3017.aString33);
								} else {
									anIntArray203[anInt3326++] = local137.method5737(local19, local3017.anInt4865);
								}
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass239_7 : aClass239_6;
							if (arg0 == 1700) {
								anIntArray203[anInt3326++] = local137.anInt6903;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt6903 != -1) {
									anIntArray203[anInt3326++] = local137.anInt6933;
									return;
								}
								anIntArray203[anInt3326++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray203[anInt3326++] = local137.anInt6907;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass239_7 : aClass239_6;
							if (arg0 == 1800) {
								anIntArray203[anInt3326++] = Static50.method1150(local137).method1216();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray203[--anInt3326];
								local19--;
								if (local137.aStringArray45 != null && local19 < local137.aStringArray45.length && local137.aStringArray45[local19] != null) {
									aStringArray20[anInt3316++] = local137.aStringArray45[local19];
									return;
								}
								aStringArray20[anInt3316++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString60 == null) {
									aStringArray20[anInt3316++] = "";
									return;
								}
								aStringArray20[anInt3316++] = local137.aString60;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static121.method2092(anIntArray203[--anInt3326]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass239_7 : aClass239_6;
							}
							if (anInt3328 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray31 == null) {
									return;
								}
								@Pc(3254) Class6_Sub42 local3254 = new Class6_Sub42();
								local3254.aClass239_13 = local137;
								local3254.anObjectArray36 = local137.anObjectArray31;
								local3254.anInt7473 = anInt3328 + 1;
								Static376.aClass244_40.method5966(local3254);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static121.method2092(anIntArray203[--anInt3326]);
							if (arg0 == 2500) {
								anIntArray203[anInt3326++] = local137.anInt6922;
								return;
							}
							if (arg0 == 2501) {
								anIntArray203[anInt3326++] = local137.anInt6905;
								return;
							}
							if (arg0 == 2502) {
								anIntArray203[anInt3326++] = local137.anInt6898;
								return;
							}
							if (arg0 == 2503) {
								anIntArray203[anInt3326++] = local137.anInt6899;
								return;
							}
							if (arg0 == 2504) {
								anIntArray203[anInt3326++] = local137.aBoolean438 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray203[anInt3326++] = local137.anInt6895;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static211.method3216(local137);
								anIntArray203[anInt3326++] = local158 == null ? -1 : local158.anInt6908;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static121.method2092(anIntArray203[--anInt3326]);
							if (arg0 == 2600) {
								anIntArray203[anInt3326++] = local137.anInt6931;
								return;
							}
							if (arg0 == 2601) {
								anIntArray203[anInt3326++] = local137.anInt6887;
								return;
							}
							if (arg0 == 2602) {
								aStringArray20[anInt3316++] = local137.aString62;
								return;
							}
							if (arg0 == 2603) {
								anIntArray203[anInt3326++] = local137.anInt6890;
								return;
							}
							if (arg0 == 2604) {
								anIntArray203[anInt3326++] = local137.anInt6941;
								return;
							}
							if (arg0 == 2605) {
								anIntArray203[anInt3326++] = local137.anInt6943;
								return;
							}
							if (arg0 == 2606) {
								anIntArray203[anInt3326++] = local137.anInt6885;
								return;
							}
							if (arg0 == 2607) {
								anIntArray203[anInt3326++] = local137.anInt6889;
								return;
							}
							if (arg0 == 2608) {
								anIntArray203[anInt3326++] = local137.anInt6935;
								return;
							}
							if (arg0 == 2609) {
								anIntArray203[anInt3326++] = local137.anInt6914;
								return;
							}
							if (arg0 == 2610) {
								anIntArray203[anInt3326++] = local137.anInt6966;
								return;
							}
							if (arg0 == 2611) {
								anIntArray203[anInt3326++] = local137.anInt6962;
								return;
							}
							if (arg0 == 2612) {
								anIntArray203[anInt3326++] = local137.anInt6920;
								return;
							}
						} else {
							@Pc(3751) Class6_Sub9 local3751;
							@Pc(3649) Class6_Sub9 local3649;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static121.method2092(anIntArray203[--anInt3326]);
									anIntArray203[anInt3326++] = local137.anInt6903;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static121.method2092(anIntArray203[--anInt3326]);
									if (local137.anInt6903 != -1) {
										anIntArray203[anInt3326++] = local137.anInt6933;
										return;
									}
									anIntArray203[anInt3326++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray203[--anInt3326];
									local3649 = (Class6_Sub9) Static432.aClass74_33.method1883((long) local13);
									if (local3649 != null) {
										anIntArray203[anInt3326++] = 1;
										return;
									}
									anIntArray203[anInt3326++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static121.method2092(anIntArray203[--anInt3326]);
									if (local137.aClass239Array2 == null) {
										anIntArray203[anInt3326++] = 0;
										return;
									}
									local19 = local137.aClass239Array2.length;
									for (local25 = 0; local25 < local137.aClass239Array2.length; local25++) {
										if (local137.aClass239Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray203[anInt3326++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt3326 -= 2;
									local13 = anIntArray203[anInt3326];
									local19 = anIntArray203[anInt3326 + 1];
									local3751 = (Class6_Sub9) Static432.aClass74_33.method1883((long) local13);
									if (local3751 != null && local3751.anInt1505 == local19) {
										anIntArray203[anInt3326++] = 1;
										return;
									}
									anIntArray203[anInt3326++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static121.method2092(anIntArray203[--anInt3326]);
								if (arg0 == 2800) {
									anIntArray203[anInt3326++] = Static50.method1150(local137).method1216();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray203[--anInt3326];
									local19--;
									if (local137.aStringArray45 != null && local19 < local137.aStringArray45.length && local137.aStringArray45[local19] != null) {
										aStringArray20[anInt3316++] = local137.aStringArray45[local19];
										return;
									}
									aStringArray20[anInt3316++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString60 == null) {
										aStringArray20[anInt3316++] = "";
										return;
									}
									aStringArray20[anInt3316++] = local137.aString60;
									return;
								}
							} else {
								@Pc(3888) String local3888;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3888 = aStringArray20[--anInt3316];
										Static61.method1338(local3888);
										return;
									}
									if (arg0 == 3101) {
										anInt3326 -= 2;
										Static350.method5232(anIntArray203[anInt3326 + 1], anIntArray203[anInt3326], Static302.aClass3_Sub2_Sub1_Sub2_2);
										return;
									}
									if (arg0 == 3103) {
										Static293.method299();
										return;
									}
									if (arg0 == 3104) {
										local3888 = aStringArray20[--anInt3316];
										local19 = 0;
										if (Static57.method1273(local3888)) {
											local19 = Static221.method3333(local3888);
										}
										Static403.method5961(Static410.aClass92_144);
										Static109.aClass6_Sub1_Sub1_5.method6461(local19);
										return;
									}
									if (arg0 == 3105) {
										local3888 = aStringArray20[--anInt3316];
										Static403.method5961(Static306.aClass92_106);
										Static109.aClass6_Sub1_Sub1_5.method6439(local3888.length() + 1);
										Static109.aClass6_Sub1_Sub1_5.method6448(local3888);
										return;
									}
									if (arg0 == 3106) {
										local3888 = aStringArray20[--anInt3316];
										Static403.method5961(Static234.aClass92_98);
										Static109.aClass6_Sub1_Sub1_5.method6439(local3888.length() + 1);
										Static109.aClass6_Sub1_Sub1_5.method6448(local3888);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray203[--anInt3326];
										local1101 = aStringArray20[--anInt3316];
										Static427.method6230(local1101, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt3326 -= 3;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										local25 = anIntArray203[anInt3326 + 2];
										local35 = Static121.method2092(local25);
										Static235.method3636(local19, local35, local13);
										return;
									}
									if (arg0 == 3109) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										local210 = arg1 ? aClass239_7 : aClass239_6;
										Static235.method3636(local19, local210, local13);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray203[--anInt3326];
										Static403.method5961(Static137.aClass92_51);
										Static109.aClass6_Sub1_Sub1_5.method6453(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										local3751 = (Class6_Sub9) Static432.aClass74_33.method1883((long) local13);
										if (local3751 != null) {
											Static37.method917(local3751.anInt1505 != local19, true, local3751);
										}
										Static133.method5721(true, local19, 3, local13);
										return;
									}
									if (arg0 == 3112) {
										anInt3326--;
										local13 = anIntArray203[anInt3326];
										local3649 = (Class6_Sub9) Static432.aClass74_33.method1883((long) local13);
										if (local3649 != null && local3649.anInt1506 == 3) {
											Static37.method917(true, true, local3649);
										}
										return;
									}
									if (arg0 == 3113) {
										Static19.method501(aStringArray20[--anInt3316]);
										return;
									}
									if (arg0 == 3114) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										local1488 = aStringArray20[--anInt3316];
										Static247.method3826(local1488, local19, "", local13, "");
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt3326 -= 3;
										Static235.method3639(255, anIntArray203[anInt3326 + 1], anIntArray203[anInt3326 + 2], anIntArray203[anInt3326]);
										return;
									}
									if (arg0 == 3201) {
										Static416.method6103(255, 50, anIntArray203[--anInt3326]);
										return;
									}
									if (arg0 == 3202) {
										anInt3326 -= 2;
										Static39.method945(anIntArray203[anInt3326], 255, anIntArray203[anInt3326 + 1]);
										return;
									}
									if (arg0 == 3203) {
										anInt3326 -= 4;
										Static235.method3639(anIntArray203[anInt3326 + 3], anIntArray203[anInt3326 + 1], anIntArray203[anInt3326 + 2], anIntArray203[anInt3326]);
										return;
									}
									if (arg0 == 3204) {
										anInt3326 -= 3;
										Static416.method6103(anIntArray203[anInt3326 + 1], anIntArray203[anInt3326 + 2], anIntArray203[anInt3326]);
										return;
									}
									if (arg0 == 3205) {
										anInt3326 -= 3;
										Static39.method945(anIntArray203[anInt3326], anIntArray203[anInt3326 + 2], anIntArray203[anInt3326 + 1]);
										return;
									}
									if (arg0 == 3206) {
										anInt3326 -= 4;
										Static89.method1610(anIntArray203[anInt3326 + 2], anIntArray203[anInt3326 + 3], anIntArray203[anInt3326], anIntArray203[anInt3326 + 1]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray203[anInt3326++] = Static66.anInt1741;
										return;
									}
									if (arg0 == 3301) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = Static2.method5317(local19, false, local13);
										return;
									}
									if (arg0 == 3302) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = Static39.method946(local13, local19, false);
										return;
									}
									if (arg0 == 3303) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = Static86.method826(local19, local13, false);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static300.aClass225_1.method5495(local13).anInt7676;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static256.anIntArray320[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static292.anIntArray349[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static70.anIntArray107[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4605) byte local4605 = Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103;
										local19 = (Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202 >> 7) + Static2.anInt6396;
										local25 = (Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207 >> 7) + Static348.anInt6273;
										anIntArray203[anInt3326++] = (local4605 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray203[anInt3326++] = Static48.aBoolean101 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = Static2.method5317(local19, true, local13);
										return;
									}
									if (arg0 == 3314) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = Static39.method946(local13, local19, true);
										return;
									}
									if (arg0 == 3315) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = Static86.method826(local19, local13, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static291.anInt5199 >= 2) {
											anIntArray203[anInt3326++] = Static291.anInt5199;
											return;
										}
										anIntArray203[anInt3326++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray203[anInt3326++] = Static381.anInt6821;
										return;
									}
									if (arg0 == 3318) {
										anIntArray203[anInt3326++] = Static118.anInt2485;
										return;
									}
									if (arg0 == 3321) {
										anIntArray203[anInt3326++] = Static48.anInt1247;
										return;
									}
									if (arg0 == 3322) {
										anIntArray203[anInt3326++] = Static428.anInt7608;
										return;
									}
									if (arg0 == 3323) {
										if (Static384.anInt6849 >= 5 && Static384.anInt6849 <= 9) {
											anIntArray203[anInt3326++] = 1;
											return;
										}
										anIntArray203[anInt3326++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static384.anInt6849 >= 5 && Static384.anInt6849 <= 9) {
											anIntArray203[anInt3326++] = Static384.anInt6849;
											return;
										}
										anIntArray203[anInt3326++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray203[anInt3326++] = Static130.aBoolean183 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray203[anInt3326++] = Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6631;
										return;
									}
									if (arg0 == 3327) {
										anIntArray203[anInt3326++] = Static302.aClass3_Sub2_Sub1_Sub2_2.aClass259_1.aBoolean483 ? 1 : 0;
										return;
									}
									if (arg0 == 3328) {
										anIntArray203[anInt3326++] = Static18.aBoolean26 && !Static225.aBoolean270 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray203[anInt3326++] = Static421.aBoolean475 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static391.method5743(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = Static49.method1092(false, local19, local13);
										return;
									}
									if (arg0 == 3332) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = Static49.method1092(true, local19, local13);
										return;
									}
									if (arg0 == 3333) {
										anIntArray203[anInt3326++] = Static436.anInt7722;
										return;
									}
									if (arg0 == 3335) {
										anIntArray203[anInt3326++] = Static161.anInt3239;
										return;
									}
									if (arg0 == 3336) {
										anInt3326 -= 4;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										local25 = anIntArray203[anInt3326 + 2];
										local353 = anIntArray203[anInt3326 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray203[anInt3326++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray203[anInt3326++] = Static128.anInt2737;
										return;
									}
									if (arg0 == 3338) {
										anIntArray203[anInt3326++] = Static413.method6087();
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5230) Class79 local5230;
									if (arg0 == 3400) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										local5230 = Static176.aClass192_1.method4482(local13);
										aStringArray20[anInt3316++] = local5230.method2014(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt3326 -= 4;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										local25 = anIntArray203[anInt3326 + 2];
										local353 = anIntArray203[anInt3326 + 3];
										@Pc(5276) Class79 local5276 = Static176.aClass192_1.method4482(local25);
										if (local5276.aChar1 == local13 && local5276.aChar2 == local19) {
											if (local19 == 115) {
												aStringArray20[anInt3316++] = local5276.method2014(local353);
												return;
											}
											anIntArray203[anInt3326++] = local5276.method2008(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt3326 -= 3;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										local25 = anIntArray203[anInt3326 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5352) Class79 local5352 = Static176.aClass192_1.method4482(local19);
										if (local5352.aChar2 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray203[anInt3326++] = local5352.method2012(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray203[--anInt3326];
										local1101 = aStringArray20[--anInt3316];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5230 = Static176.aClass192_1.method4482(local13);
										if (local5230.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray203[anInt3326++] = local5230.method2010(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray203[--anInt3326];
										@Pc(5450) Class79 local5450 = Static176.aClass192_1.method4482(local13);
										anIntArray203[anInt3326++] = local5450.aClass74_12.method1887();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static226.anInt5623 == 0) {
											anIntArray203[anInt3326++] = -2;
											return;
										}
										if (Static226.anInt5623 == 1) {
											anIntArray203[anInt3326++] = -1;
											return;
										}
										anIntArray203[anInt3326++] = Static398.anInt2169;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray203[--anInt3326];
										if (Static226.anInt5623 == 2 && local13 < Static398.anInt2169) {
											aStringArray20[anInt3316++] = Static314.aStringArray32[local13];
											if (Static185.aStringArray24[local13] != null) {
												aStringArray20[anInt3316++] = Static185.aStringArray24[local13];
												return;
											}
											aStringArray20[anInt3316++] = "";
											return;
										}
										aStringArray20[anInt3316++] = "";
										aStringArray20[anInt3316++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray203[--anInt3326];
										if (Static226.anInt5623 == 2 && local13 < Static398.anInt2169) {
											anIntArray203[anInt3326++] = Static137.anIntArray174[local13];
											return;
										}
										anIntArray203[anInt3326++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray203[--anInt3326];
										if (Static226.anInt5623 == 2 && local13 < Static398.anInt2169) {
											anIntArray203[anInt3326++] = Static198.anIntArray239[local13];
											return;
										}
										anIntArray203[anInt3326++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3888 = aStringArray20[--anInt3316];
										local19 = anIntArray203[--anInt3326];
										Static442.method6403(local19, local3888);
										return;
									}
									if (arg0 == 3605) {
										local3888 = aStringArray20[--anInt3316];
										Static442.method6401(local3888);
										return;
									}
									if (arg0 == 3606) {
										local3888 = aStringArray20[--anInt3316];
										Static29.method709(local3888);
										return;
									}
									if (arg0 == 3607) {
										local3888 = aStringArray20[--anInt3316];
										Static442.method6399(local3888, false);
										return;
									}
									if (arg0 == 3608) {
										local3888 = aStringArray20[--anInt3316];
										Static130.method2313(local3888);
										return;
									}
									if (arg0 == 3609) {
										local3888 = aStringArray20[--anInt3316];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray203[anInt3326++] = Static135.method2405(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray203[--anInt3326];
										if (Static226.anInt5623 == 2 && local13 < Static398.anInt2169) {
											aStringArray20[anInt3316++] = Static88.aStringArray29[local13];
											return;
										}
										aStringArray20[anInt3316++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static157.aString23 != null) {
											aStringArray20[anInt3316++] = Static197.method3085(Static157.aString23);
											return;
										}
										aStringArray20[anInt3316++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static157.aString23 != null) {
											anIntArray203[anInt3326++] = Static338.anInt5890;
											return;
										}
										anIntArray203[anInt3326++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray203[--anInt3326];
										if (Static157.aString23 != null && local13 < Static338.anInt5890) {
											aStringArray20[anInt3316++] = Static57.aClass128Array1[local13].aString27;
											return;
										}
										aStringArray20[anInt3316++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray203[--anInt3326];
										if (Static157.aString23 != null && local13 < Static338.anInt5890) {
											anIntArray203[anInt3326++] = Static57.aClass128Array1[local13].anInt3638;
											return;
										}
										anIntArray203[anInt3326++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray203[--anInt3326];
										if (Static157.aString23 != null && local13 < Static338.anInt5890) {
											anIntArray203[anInt3326++] = Static57.aClass128Array1[local13].aByte58;
											return;
										}
										anIntArray203[anInt3326++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray203[anInt3326++] = Static62.aByte27;
										return;
									}
									if (arg0 == 3617) {
										local3888 = aStringArray20[--anInt3316];
										Static8.method282(local3888);
										return;
									}
									if (arg0 == 3618) {
										anIntArray203[anInt3326++] = Static359.aByte83;
										return;
									}
									if (arg0 == 3619) {
										local3888 = aStringArray20[--anInt3316];
										Static219.method3285(local3888);
										return;
									}
									if (arg0 == 3620) {
										Static298.method4404();
										return;
									}
									if (arg0 == 3621) {
										if (Static226.anInt5623 == 0) {
											anIntArray203[anInt3326++] = -1;
											return;
										}
										anIntArray203[anInt3326++] = Static125.anInt2592;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray203[--anInt3326];
										if (Static226.anInt5623 != 0 && local13 < Static125.anInt2592) {
											aStringArray20[anInt3316++] = Static186.aStringArray25[local13];
											if (Static85.aStringArray9[local13] != null) {
												aStringArray20[anInt3316++] = Static85.aStringArray9[local13];
												return;
											}
											aStringArray20[anInt3316++] = "";
											return;
										}
										aStringArray20[anInt3316++] = "";
										aStringArray20[anInt3316++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3888 = aStringArray20[--anInt3316];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray203[anInt3326++] = Static38.method944(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray203[--anInt3326];
										if (Static57.aClass128Array1 != null && local13 < Static338.anInt5890 && Static57.aClass128Array1[local13].aString25.equalsIgnoreCase(Static302.aClass3_Sub2_Sub1_Sub2_2.aString54)) {
											anIntArray203[anInt3326++] = 1;
											return;
										}
										anIntArray203[anInt3326++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static55.aString6 != null) {
											aStringArray20[anInt3316++] = Static55.aString6;
											return;
										}
										aStringArray20[anInt3316++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray203[--anInt3326];
										if (Static157.aString23 != null && local13 < Static338.anInt5890) {
											aStringArray20[anInt3316++] = Static57.aClass128Array1[local13].aString26;
											return;
										}
										aStringArray20[anInt3316++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray203[--anInt3326];
										if (Static226.anInt5623 == 2 && local13 >= 0 && local13 < Static398.anInt2169) {
											anIntArray203[anInt3326++] = Static156.aBooleanArray7[local13] ? 1 : 0;
											return;
										}
										anIntArray203[anInt3326++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3888 = aStringArray20[--anInt3316];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray203[anInt3326++] = Static79.method1523(local3888);
										return;
									}
									if (arg0 == 3629) {
										anIntArray203[anInt3326++] = Static334.anInt5834;
										return;
									}
									if (arg0 == 3630) {
										local3888 = aStringArray20[--anInt3316];
										Static442.method6399(local3888, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static286.aBooleanArray19[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray203[--anInt3326];
										if (Static157.aString23 != null && local13 < Static338.anInt5890) {
											aStringArray20[anInt3316++] = Static57.aClass128Array1[local13].aString25;
											return;
										}
										aStringArray20[anInt3316++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray203[--anInt3326];
										if (Static226.anInt5623 != 0 && local13 < Static125.anInt2592) {
											aStringArray20[anInt3316++] = Static22.aStringArray3[local13];
											return;
										}
										aStringArray20[anInt3316++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static1.aClass13Array1[local13].method396();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static1.aClass13Array1[local13].anInt450;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static1.aClass13Array1[local13].anInt447;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static1.aClass13Array1[local13].anInt449;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static1.aClass13Array1[local13].anInt454;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static1.aClass13Array1[local13].anInt448;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray203[--anInt3326];
										local19 = Static1.aClass13Array1[local13].method391();
										anIntArray203[anInt3326++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray203[--anInt3326];
										local19 = Static1.aClass13Array1[local13].method391();
										anIntArray203[anInt3326++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray203[--anInt3326];
										local19 = Static1.aClass13Array1[local13].method391();
										anIntArray203[anInt3326++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray203[--anInt3326];
										local19 = Static1.aClass13Array1[local13].method391();
										anIntArray203[anInt3326++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt3326 -= 5;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										local25 = anIntArray203[anInt3326 + 2];
										local353 = anIntArray203[anInt3326 + 3];
										local2290 = anIntArray203[anInt3326 + 4];
										anIntArray203[anInt3326++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(6960) long local6960;
									@Pc(6953) long local6953;
									if (arg0 == 4007) {
										anInt3326 -= 2;
										local6953 = anIntArray203[anInt3326];
										local6960 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = (int) (local6953 + local6953 * local6960 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										if (local13 == 0) {
											anIntArray203[anInt3326++] = 0;
											return;
										}
										anIntArray203[anInt3326++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										if (local13 == 0) {
											anIntArray203[anInt3326++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray203[anInt3326++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray203[anInt3326++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt3326 -= 3;
										local6953 = anIntArray203[anInt3326];
										local6960 = anIntArray203[anInt3326 + 1];
										@Pc(7341) long local7341 = (long) anIntArray203[anInt3326 + 2];
										anIntArray203[anInt3326++] = (int) (local6953 * local7341 / local6960);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3888 = aStringArray20[--anInt3316];
										local19 = anIntArray203[--anInt3326];
										aStringArray20[anInt3316++] = local3888 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt3316 -= 2;
										local3888 = aStringArray20[anInt3316];
										local1101 = aStringArray20[anInt3316 + 1];
										aStringArray20[anInt3316++] = local3888 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3888 = aStringArray20[--anInt3316];
										local19 = anIntArray203[--anInt3326];
										aStringArray20[anInt3316++] = local3888 + Static24.method663(local19);
										return;
									}
									if (arg0 == 4103) {
										local3888 = aStringArray20[--anInt3316];
										aStringArray20[anInt3316++] = local3888.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray20[anInt3316++] = method2746(anIntArray203[--anInt3326]);
										return;
									}
									if (arg0 == 4105) {
										anInt3316 -= 2;
										local3888 = aStringArray20[anInt3316];
										local1101 = aStringArray20[anInt3316 + 1];
										if (Static302.aClass3_Sub2_Sub1_Sub2_2.aClass259_1 != null && Static302.aClass3_Sub2_Sub1_Sub2_2.aClass259_1.aBoolean483) {
											aStringArray20[anInt3316++] = local1101;
											return;
										}
										aStringArray20[anInt3316++] = local3888;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray203[--anInt3326];
										aStringArray20[anInt3316++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt3316 -= 2;
										anIntArray203[anInt3326++] = Static268.method4088(aStringArray20[anInt3316], aStringArray20[anInt3316 + 1], Static161.anInt3239);
										return;
									}
									@Pc(7624) Class166 local7624;
									if (arg0 == 4108) {
										local3888 = aStringArray20[--anInt3316];
										anInt3326 -= 2;
										local19 = anIntArray203[anInt3326];
										local25 = anIntArray203[anInt3326 + 1];
										local7624 = Static30.method756(local25, Static410.aClass100_89);
										anIntArray203[anInt3326++] = local7624.method3889(local3888, Static15.aClass87Array1, local19);
										return;
									}
									if (arg0 == 4109) {
										local3888 = aStringArray20[--anInt3316];
										anInt3326 -= 2;
										local19 = anIntArray203[anInt3326];
										local25 = anIntArray203[anInt3326 + 1];
										local7624 = Static30.method756(local25, Static410.aClass100_89);
										anIntArray203[anInt3326++] = local7624.method3887(local19, local3888, Static15.aClass87Array1);
										return;
									}
									if (arg0 == 4110) {
										anInt3316 -= 2;
										local3888 = aStringArray20[anInt3316];
										local1101 = aStringArray20[anInt3316 + 1];
										if (anIntArray203[--anInt3326] == 1) {
											aStringArray20[anInt3316++] = local3888;
											return;
										}
										aStringArray20[anInt3316++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3888 = aStringArray20[--anInt3316];
										aStringArray20[anInt3316++] = Static195.method5951(local3888);
										return;
									}
									if (arg0 == 4112) {
										local3888 = aStringArray20[--anInt3316];
										local19 = anIntArray203[--anInt3326];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray20[anInt3316++] = local3888 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static348.method5210((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static300.method4423((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static422.method6196((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static4.method6476((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3888 = aStringArray20[--anInt3316];
										if (local3888 != null) {
											anIntArray203[anInt3326++] = local3888.length();
											return;
										}
										anIntArray203[anInt3326++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3888 = aStringArray20[--anInt3316];
										anInt3326 -= 2;
										local19 = anIntArray203[anInt3326];
										local25 = anIntArray203[anInt3326 + 1];
										aStringArray20[anInt3316++] = local3888.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3888 = aStringArray20[--anInt3316];
										@Pc(7987) StringBuffer local7987 = new StringBuffer(local3888.length());
										@Pc(7989) boolean local7989 = false;
										for (local353 = 0; local353 < local3888.length(); local353++) {
											@Pc(7996) char local7996 = local3888.charAt(local353);
											if (local7996 == '<') {
												local7989 = true;
											} else if (local7996 == '>') {
												local7989 = false;
											} else if (!local7989) {
												local7987.append(local7996);
											}
										}
										aStringArray20[anInt3316++] = local7987.toString();
										return;
									}
									if (arg0 == 4120) {
										local3888 = aStringArray20[--anInt3316];
										anInt3326 -= 2;
										local19 = anIntArray203[anInt3326];
										local25 = anIntArray203[anInt3326 + 1];
										anIntArray203[anInt3326++] = local3888.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt3316 -= 2;
										local3888 = aStringArray20[anInt3316];
										local1101 = aStringArray20[anInt3316 + 1];
										local25 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = local3888.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray203[--anInt3326] != 0;
										local19 = anIntArray203[--anInt3326];
										aStringArray20[anInt3316++] = Static142.method2452(Static161.anInt3239, 0, (long) local19, local412);
										return;
									}
									if (arg0 == 4125) {
										local3888 = aStringArray20[--anInt3316];
										local19 = anIntArray203[--anInt3326];
										@Pc(8210) Class166 local8210 = Static30.method756(local19, Static410.aClass100_89);
										anIntArray203[anInt3326++] = local8210.method3884(local3888, Static15.aClass87Array1);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray203[--anInt3326];
										aStringArray20[anInt3316++] = Static380.aClass231_2.method5648(local13).aString1;
										return;
									}
									@Pc(8272) Class4 local8272;
									if (arg0 == 4201) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										local8272 = Static380.aClass231_2.method5648(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray1[local19 - 1] != null) {
											aStringArray20[anInt3316++] = local8272.aStringArray1[local19 - 1];
											return;
										}
										aStringArray20[anInt3316++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										local8272 = Static380.aClass231_2.method5648(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray2[local19 - 1] != null) {
											aStringArray20[anInt3316++] = local8272.aStringArray2[local19 - 1];
											return;
										}
										aStringArray20[anInt3316++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static380.aClass231_2.method5648(local13).anInt68;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static380.aClass231_2.method5648(local13).anInt105 == 1 ? 1 : 0;
										return;
									}
									@Pc(8435) Class4 local8435;
									if (arg0 == 4205) {
										local13 = anIntArray203[--anInt3326];
										local8435 = Static380.aClass231_2.method5648(local13);
										if (local8435.anInt130 == -1 && local8435.anInt72 >= 0) {
											anIntArray203[anInt3326++] = local8435.anInt72;
											return;
										}
										anIntArray203[anInt3326++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray203[--anInt3326];
										local8435 = Static380.aClass231_2.method5648(local13);
										if (local8435.anInt130 >= 0 && local8435.anInt72 >= 0) {
											anIntArray203[anInt3326++] = local8435.anInt72;
											return;
										}
										anIntArray203[anInt3326++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray203[--anInt3326];
										anIntArray203[anInt3326++] = Static380.aClass231_2.method5648(local13).aBoolean8 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										local3017 = Static80.aClass181_1.method4294(local19);
										if (local3017.method4092()) {
											aStringArray20[anInt3316++] = Static380.aClass231_2.method5648(local13).method74(local19, local3017.aString33);
											return;
										}
										anIntArray203[anInt3326++] = Static380.aClass231_2.method5648(local13).method63(local19, local3017.anInt4865);
										return;
									}
									if (arg0 == 4209) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1] - 1;
										local8272 = Static380.aClass231_2.method5648(local13);
										if (local8272.anInt122 == local19) {
											anIntArray203[anInt3326++] = local8272.anInt91;
											return;
										}
										if (local8272.anInt121 == local19) {
											anIntArray203[anInt3326++] = local8272.anInt131;
											return;
										}
										anIntArray203[anInt3326++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3888 = aStringArray20[--anInt3316];
										local19 = anIntArray203[--anInt3326];
										Static199.method3101(local3888, local19 == 1);
										anIntArray203[anInt3326++] = Static87.anInt2049;
										return;
									}
									if (arg0 == 4211) {
										if (Static315.aShortArray85 != null && Static40.anInt1169 < Static87.anInt2049) {
											anIntArray203[anInt3326++] = Static315.aShortArray85[Static40.anInt1169++] & 0xFFFF;
											return;
										}
										anIntArray203[anInt3326++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static40.anInt1169 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										local3017 = Static80.aClass181_1.method4294(local19);
										if (local3017.method4092()) {
											aStringArray20[anInt3316++] = Static235.aClass263_2.method6416(local13).method1386(local3017.aString33, local19);
											return;
										}
										anIntArray203[anInt3326++] = Static235.aClass263_2.method6416(local13).method1380(local3017.anInt4865, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										local3017 = Static80.aClass181_1.method4294(local19);
										if (local3017.method4092()) {
											aStringArray20[anInt3316++] = Static448.aClass104_4.method2616(local13).method2637(local3017.aString33, local19);
											return;
										}
										anIntArray203[anInt3326++] = Static448.aClass104_4.method2616(local13).method2624(local3017.anInt4865, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt3326 -= 2;
										local13 = anIntArray203[anInt3326];
										local19 = anIntArray203[anInt3326 + 1];
										local3017 = Static80.aClass181_1.method4294(local19);
										if (local3017.method4092()) {
											aStringArray20[anInt3316++] = Static89.aClass229_1.method5603(local13).method5762(local3017.aString33, local19);
											return;
										}
										anIntArray203[anInt3326++] = Static89.aClass229_1.method5603(local13).method5763(local3017.anInt4865, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray203[--anInt3326];
									@Pc(8936) Class246 local8936 = Static145.aClass27_1.method757(local13);
									if (local8936.anIntArray501 != null && local8936.anIntArray501.length > 0) {
										local25 = 0;
										local353 = local8936.anIntArray502[0];
										for (local2290 = 1; local2290 < local8936.anIntArray501.length; local2290++) {
											if (local8936.anIntArray502[local2290] > local353) {
												local25 = local2290;
												local353 = local8936.anIntArray502[local2290];
											}
										}
										anIntArray203[anInt3326++] = local8936.anIntArray501[local25];
										return;
									}
									anIntArray203[anInt3326++] = local8936.anInt7314;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static121.method2092(anIntArray203[--anInt3326]);
					} else {
						local137 = arg1 ? aClass239_7 : aClass239_6;
					}
					Static437.method6328(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt3326 -= 2;
						local19 = anIntArray203[anInt3326];
						local25 = anIntArray203[anInt3326 + 1];
						if (local137.anInt6907 == -1) {
							Static5.method200(local137.anInt6908);
							Static448.method6550(local137.anInt6908);
							Static9.method307(local137.anInt6908);
						}
						if (local19 == -1) {
							local137.anInt6886 = 1;
							local137.anInt6910 = -1;
							local137.anInt6903 = -1;
							return;
						}
						local137.anInt6903 = local19;
						local137.anInt6933 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean450 = true;
						} else {
							local137.aBoolean450 = false;
						}
						@Pc(1630) Class4 local1630 = Static380.aClass231_2.method5648(local19);
						local137.anInt6885 = local1630.anInt116;
						local137.anInt6935 = local1630.anInt87;
						local137.anInt6889 = local1630.anInt104;
						local137.anInt6966 = local1630.anInt117;
						local137.anInt6962 = local1630.anInt76;
						local137.anInt6943 = local1630.anInt82;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt6902 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt6902 = 1;
						} else {
							local137.anInt6902 = 2;
						}
						if (local137.anInt6923 > 0) {
							local137.anInt6943 = local137.anInt6943 * 32 / local137.anInt6923;
							return;
						}
						if (local137.anInt6896 > 0) {
							local137.anInt6943 = local137.anInt6943 * 32 / local137.anInt6896;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt6886 = 2;
						local137.anInt6910 = anIntArray203[--anInt3326];
						if (local137.anInt6907 == -1) {
							Static394.method5790(local137.anInt6908);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt6886 = 3;
						local137.anInt6910 = -1;
						if (local137.anInt6907 == -1) {
							Static394.method5790(local137.anInt6908);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt6886 = 6;
						local137.anInt6910 = anIntArray203[--anInt3326];
						if (local137.anInt6907 == -1) {
							Static394.method5790(local137.anInt6908);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt6886 = 5;
						local137.anInt6910 = anIntArray203[--anInt3326];
						if (local137.anInt6907 == -1) {
							Static394.method5790(local137.anInt6908);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt3326 -= 4;
						local137.anInt6937 = anIntArray203[anInt3326];
						local137.anInt6967 = anIntArray203[anInt3326 + 1];
						local137.anInt6959 = anIntArray203[anInt3326 + 2];
						local137.anInt6946 = anIntArray203[anInt3326 + 3];
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt3326 -= 2;
						local137.anInt6921 = anIntArray203[anInt3326];
						local137.anInt6939 = anIntArray203[anInt3326 + 1];
						Static437.method6328(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt3326 -= 4;
						local137.anInt6910 = anIntArray203[anInt3326];
						local137.anInt6930 = anIntArray203[anInt3326 + 1];
						if (anIntArray203[anInt3326 + 2] == 1) {
							local137.anInt6886 = 9;
						} else {
							local137.anInt6886 = 8;
						}
						if (anIntArray203[anInt3326 + 3] == 1) {
							local137.aBoolean450 = true;
						} else {
							local137.aBoolean450 = false;
						}
						if (local137.anInt6907 == -1) {
							Static394.method5790(local137.anInt6908);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt6886 = 5;
						local137.anInt6910 = Static4.anInt7923;
						local137.anInt6930 = 0;
						if (local137.anInt6907 == -1) {
							Static394.method5790(local137.anInt6908);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static121.method2092(anIntArray203[--anInt3326]);
				} else {
					local137 = arg1 ? aClass239_7 : aClass239_6;
				}
				if (arg0 == 1000) {
					anInt3326 -= 4;
					local137.anInt6951 = anIntArray203[anInt3326];
					local137.anInt6918 = anIntArray203[anInt3326 + 1];
					local19 = anIntArray203[anInt3326 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray203[anInt3326 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte98 = (byte) local19;
					local137.aByte100 = (byte) local25;
					Static437.method6328(local137);
					Static24.method662(local137);
					if (local137.anInt6907 == -1) {
						Static356.method5274(local137.anInt6908);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt3326 -= 4;
					local137.anInt6896 = anIntArray203[anInt3326];
					local137.anInt6938 = anIntArray203[anInt3326 + 1];
					local137.anInt6923 = 0;
					local137.anInt6925 = 0;
					local19 = anIntArray203[anInt3326 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray203[anInt3326 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte99 = (byte) local19;
					local137.aByte97 = (byte) local25;
					Static437.method6328(local137);
					Static24.method662(local137);
					if (local137.anInt6900 == 0) {
						Static141.method1120(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray203[--anInt3326] == 1;
					if (local137.aBoolean438 != local620) {
						local137.aBoolean438 = local620;
						Static437.method6328(local137);
					}
					if (local137.anInt6907 == -1) {
						Static268.method4089(local137.anInt6908);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt3326 -= 2;
					local137.anInt6942 = anIntArray203[anInt3326];
					local137.anInt6963 = anIntArray203[anInt3326 + 1];
					Static437.method6328(local137);
					Static24.method662(local137);
					if (local137.anInt6900 == 0) {
						Static141.method1120(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean443 = anIntArray203[--anInt3326] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException();
	}
}
