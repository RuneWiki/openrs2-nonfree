import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray32;

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "Lclient!ic;")
	private static Class108 aClass108_1;

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "[I")
	private static int[] anIntArray341;

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "Lclient!jk;")
	private static Class124 aClass124_8;

	@OriginalMember(owner = "client!ou", name = "q", descriptor = "Lclient!jk;")
	private static Class124 aClass124_9;

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "[I")
	private static final int[] anIntArray339 = new int[5];

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "[[I")
	private static final int[][] anIntArrayArray45 = new int[5][5000];

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "[I")
	private static final int[] anIntArray340 = new int[1000];

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
	private static int anInt5193 = 0;

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "[Lclient!lv;")
	private static final Class148[] aClass148Array1 = new Class148[50];

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ou", name = "o", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray33 = new String[1000];

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
	private static int anInt5195 = 0;

	@OriginalMember(owner = "client!ou", name = "w", descriptor = "I")
	private static int anInt5200 = 0;

	@OriginalMember(owner = "client!ou", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray34 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ou", name = "A", descriptor = "[I")
	private static final int[] anIntArray342 = new int[3];

	@OriginalMember(owner = "client!ou", name = "B", descriptor = "Lclient!hn;")
	public static final Class102 aClass102_40 = new Class102(4);

	@OriginalMember(owner = "client!ou", name = "C", descriptor = "I")
	private static int anInt5203 = 0;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!oq;II)V")
	public static void method4069(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub5_Sub14 local5 = Static16.method251(arg0, arg2, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray341 = new int[local5.anInt4769];
		aStringArray32 = new String[local5.anInt4767];
		if (local5.aClass182_5 == Static5.aClass182_1 || local5.aClass182_5 == Static366.aClass182_9 || local5.aClass182_5 == Static345.aClass182_7) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static253.aClass124_7 != null) {
				local30 = Static253.aClass124_7.anInt3370;
				local32 = Static253.aClass124_7.anInt3414;
			}
			anIntArray341[0] = Static62.aClass96_1.method3872() - local30;
			anIntArray341[1] = Static62.aClass96_1.method3870() - local32;
		}
		method4071(local5, 200000);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IZ)V")
	private static void method4070(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray340[anInt5200++] = Static128.anInt2353;
				return;
			}
			if (arg0 == 5001) {
				anInt5200 -= 3;
				Static128.anInt2353 = anIntArray340[anInt5200];
				Static132.aClass129_1 = Static13.method207(anIntArray340[anInt5200 + 1]);
				if (Static132.aClass129_1 == null) {
					Static132.aClass129_1 = Static414.aClass129_4;
				}
				Static301.anInt5240 = anIntArray340[anInt5200 + 2];
				Static52.method867(Static401.aClass103_236);
				Static18.aClass1_Sub28_Sub1_1.method5398(Static128.anInt2353);
				Static18.aClass1_Sub28_Sub1_1.method5398(Static132.aClass129_1.anInt3566);
				Static18.aClass1_Sub28_Sub1_1.method5398(Static301.anInt5240);
				return;
			}
			if (arg0 == 5002) {
				anInt5193 -= 2;
				local75 = aStringArray33[anInt5193];
				local81 = aStringArray33[anInt5193 + 1];
				anInt5200 -= 2;
				local89 = anIntArray340[anInt5200];
				local95 = anIntArray340[anInt5200 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static52.method867(Static378.aClass103_126);
				Static18.aClass1_Sub28_Sub1_1.method5398(Static349.method4734(local75) + Static349.method4734(local81) + 2);
				Static18.aClass1_Sub28_Sub1_1.method5364(local75);
				Static18.aClass1_Sub28_Sub1_1.method5398(local89 - 1);
				Static18.aClass1_Sub28_Sub1_1.method5398(local95);
				Static18.aClass1_Sub28_Sub1_1.method5364(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray340[--anInt5200];
				local81 = null;
				if (local157 < 100) {
					local81 = Static174.aStringArray14[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray33[anInt5193++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray340[--anInt5200];
				local192 = -1;
				if (local157 < 100 && Static174.aStringArray14[local157] != null) {
					local192 = Static367.anIntArray418[local157];
				}
				anIntArray340[anInt5200++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static132.aClass129_1 == null) {
					anIntArray340[anInt5200++] = -1;
					return;
				}
				anIntArray340[anInt5200++] = Static132.aClass129_1.anInt3566;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray33[--anInt5193];
				method4078(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt5193 -= 2;
				local75 = aStringArray33[anInt5193];
				local81 = aStringArray33[anInt5193 + 1];
				if (Static154.anInt2601 != 0 || (!Static361.aBoolean690 || Static241.aBoolean491) && !Static336.aBoolean652) {
					Static52.method867(Static441.aClass103_251);
					Static18.aClass1_Sub28_Sub1_1.method5398(0);
					local89 = Static18.aClass1_Sub28_Sub1_1.anInt6812;
					Static18.aClass1_Sub28_Sub1_1.method5364(local75);
					Static207.method4750(local81, Static18.aClass1_Sub28_Sub1_1);
					Static18.aClass1_Sub28_Sub1_1.method5352(Static18.aClass1_Sub28_Sub1_1.anInt6812 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray340[--anInt5200];
				local81 = null;
				if (local157 < 100) {
					local81 = Static294.aStringArray31[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray33[anInt5193++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray340[--anInt5200];
				local81 = null;
				if (local157 < 100) {
					local81 = Static452.aStringArray48[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray33[anInt5193++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray340[--anInt5200];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static384.anIntArray427[local157];
				}
				anIntArray340[anInt5200++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static447.aClass25_Sub5_Sub1_Sub2_4 == null || Static447.aClass25_Sub5_Sub1_Sub2_4.aString52 == null) {
					local75 = Static109.aString58;
				} else {
					local75 = Static447.aClass25_Sub5_Sub1_Sub2_4.method3447();
				}
				aStringArray33[anInt5193++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray340[anInt5200++] = Static301.anInt5240;
				return;
			}
			if (arg0 == 5017) {
				anIntArray340[anInt5200++] = Static150.anInt6764;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray340[--anInt5200];
				local192 = 0;
				if (local157 < 100 && Static174.aStringArray14[local157] != null) {
					local192 = Static270.anIntArray307[local157];
				}
				anIntArray340[anInt5200++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray340[--anInt5200];
				local81 = null;
				if (local157 < 100) {
					local81 = Static390.aStringArray45[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray33[anInt5193++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static447.aClass25_Sub5_Sub1_Sub2_4 == null || Static447.aClass25_Sub5_Sub1_Sub2_4.aString52 == null) {
					local75 = Static109.aString58;
				} else {
					local75 = Static447.aClass25_Sub5_Sub1_Sub2_4.method3437();
				}
				aStringArray33[anInt5193++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray340[--anInt5200];
				aStringArray33[anInt5193++] = Static377.aClass121_1.method2691(local157).aString19;
				return;
			}
			@Pc(589) Class1_Sub5_Sub4 local589;
			if (arg0 == 5051) {
				local157 = anIntArray340[--anInt5200];
				local589 = Static377.aClass121_1.method2691(local157);
				if (local589.anIntArray120 == null) {
					anIntArray340[anInt5200++] = 0;
					return;
				}
				anIntArray340[anInt5200++] = local589.anIntArray120.length;
				return;
			}
			if (arg0 == 5052) {
				anInt5200 -= 2;
				local157 = anIntArray340[anInt5200];
				local192 = anIntArray340[anInt5200 + 1];
				@Pc(634) Class1_Sub5_Sub4 local634 = Static377.aClass121_1.method2691(local157);
				local95 = local634.anIntArray120[local192];
				anIntArray340[anInt5200++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray340[--anInt5200];
				local589 = Static377.aClass121_1.method2691(local157);
				if (local589.anIntArray121 == null) {
					anIntArray340[anInt5200++] = 0;
					return;
				}
				anIntArray340[anInt5200++] = local589.anIntArray121.length;
				return;
			}
			if (arg0 == 5054) {
				anInt5200 -= 2;
				local157 = anIntArray340[anInt5200];
				local192 = anIntArray340[anInt5200 + 1];
				anIntArray340[anInt5200++] = Static377.aClass121_1.method2691(local157).anIntArray121[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray340[--anInt5200];
				aStringArray33[anInt5193++] = Static456.aClass9_2.method145(local157).method4897();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray340[--anInt5200];
				@Pc(760) Class1_Sub5_Sub16 local760 = Static456.aClass9_2.method145(local157);
				if (local760.anIntArray419 == null) {
					anIntArray340[anInt5200++] = 0;
					return;
				}
				anIntArray340[anInt5200++] = local760.anIntArray419.length;
				return;
			}
			if (arg0 == 5057) {
				anInt5200 -= 2;
				local157 = anIntArray340[anInt5200];
				local192 = anIntArray340[anInt5200 + 1];
				anIntArray340[anInt5200++] = Static456.aClass9_2.method145(local157).anIntArray419[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass108_1 = new Class108();
				aClass108_1.anInt2743 = anIntArray340[--anInt5200];
				aClass108_1.aClass1_Sub5_Sub16_1 = Static456.aClass9_2.method145(aClass108_1.anInt2743);
				aClass108_1.anIntArray186 = new int[aClass108_1.aClass1_Sub5_Sub16_1.method4909()];
				return;
			}
			if (arg0 == 5059) {
				Static52.method867(Static178.aClass103_133);
				Static18.aClass1_Sub28_Sub1_1.method5398(0);
				local157 = Static18.aClass1_Sub28_Sub1_1.anInt6812;
				Static18.aClass1_Sub28_Sub1_1.method5398(0);
				Static18.aClass1_Sub28_Sub1_1.method5393(aClass108_1.anInt2743);
				aClass108_1.aClass1_Sub5_Sub16_1.method4910(aClass108_1.anIntArray186, Static18.aClass1_Sub28_Sub1_1);
				Static18.aClass1_Sub28_Sub1_1.method5352(Static18.aClass1_Sub28_Sub1_1.anInt6812 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray33[--anInt5193];
				Static52.method867(Static455.aClass103_257);
				Static18.aClass1_Sub28_Sub1_1.method5398(0);
				local192 = Static18.aClass1_Sub28_Sub1_1.anInt6812;
				Static18.aClass1_Sub28_Sub1_1.method5364(local75);
				Static18.aClass1_Sub28_Sub1_1.method5393(aClass108_1.anInt2743);
				aClass108_1.aClass1_Sub5_Sub16_1.method4910(aClass108_1.anIntArray186, Static18.aClass1_Sub28_Sub1_1);
				Static18.aClass1_Sub28_Sub1_1.method5352(Static18.aClass1_Sub28_Sub1_1.anInt6812 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static52.method867(Static178.aClass103_133);
				Static18.aClass1_Sub28_Sub1_1.method5398(0);
				local157 = Static18.aClass1_Sub28_Sub1_1.anInt6812;
				Static18.aClass1_Sub28_Sub1_1.method5398(1);
				Static18.aClass1_Sub28_Sub1_1.method5393(aClass108_1.anInt2743);
				aClass108_1.aClass1_Sub5_Sub16_1.method4910(aClass108_1.anIntArray186, Static18.aClass1_Sub28_Sub1_1);
				Static18.aClass1_Sub28_Sub1_1.method5352(Static18.aClass1_Sub28_Sub1_1.anInt6812 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt5200 -= 2;
				local157 = anIntArray340[anInt5200];
				local192 = anIntArray340[anInt5200 + 1];
				anIntArray340[anInt5200++] = Static377.aClass121_1.method2691(local157).aCharArray3[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt5200 -= 2;
				local157 = anIntArray340[anInt5200];
				local192 = anIntArray340[anInt5200 + 1];
				anIntArray340[anInt5200++] = Static377.aClass121_1.method2691(local157).aCharArray2[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt5200 -= 2;
				local157 = anIntArray340[anInt5200];
				local192 = anIntArray340[anInt5200 + 1];
				if (local192 == -1) {
					anIntArray340[anInt5200++] = -1;
					return;
				}
				anIntArray340[anInt5200++] = Static377.aClass121_1.method2691(local157).method1503((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt5200 -= 2;
				local157 = anIntArray340[anInt5200];
				local192 = anIntArray340[anInt5200 + 1];
				if (local192 == -1) {
					anIntArray340[anInt5200++] = -1;
					return;
				}
				anIntArray340[anInt5200++] = Static377.aClass121_1.method2691(local157).method1511((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray340[--anInt5200];
				anIntArray340[anInt5200++] = Static456.aClass9_2.method145(local157).method4909();
				return;
			}
			if (arg0 == 5067) {
				anInt5200 -= 2;
				local157 = anIntArray340[anInt5200];
				local192 = anIntArray340[anInt5200 + 1];
				local89 = Static456.aClass9_2.method145(local157).method4908(local192).anInt6171;
				anIntArray340[anInt5200++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt5200 -= 2;
				local157 = anIntArray340[anInt5200];
				local192 = anIntArray340[anInt5200 + 1];
				aClass108_1.anIntArray186[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt5200 -= 2;
				local157 = anIntArray340[anInt5200];
				local192 = anIntArray340[anInt5200 + 1];
				aClass108_1.anIntArray186[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt5200 -= 3;
				local157 = anIntArray340[anInt5200];
				local192 = anIntArray340[anInt5200 + 1];
				local89 = anIntArray340[anInt5200 + 2];
				@Pc(1265) Class1_Sub5_Sub16 local1265 = Static456.aClass9_2.method145(local157);
				if (local1265.method4908(local192).anInt6171 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray340[anInt5200++] = local1265.method4911(local89, local192);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray33[--anInt5193];
				local1313 = anIntArray340[--anInt5200] == 1;
				Static369.method4904(local1313, local75);
				anIntArray340[anInt5200++] = Static253.anInt4611;
				return;
			}
			if (arg0 == 5072) {
				if (Static394.aShortArray102 != null && Static401.anInt6678 < Static253.anInt4611) {
					anIntArray340[anInt5200++] = Static394.aShortArray102[Static401.anInt6678++] & 0xFFFF;
					return;
				}
				anIntArray340[anInt5200++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static401.anInt6678 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static52.method867(Static178.aClass103_133);
				Static18.aClass1_Sub28_Sub1_1.method5398(0);
				local157 = Static18.aClass1_Sub28_Sub1_1.anInt6812;
				Static18.aClass1_Sub28_Sub1_1.method5398(2);
				Static18.aClass1_Sub28_Sub1_1.method5393(aClass108_1.anInt2743);
				aClass108_1.aClass1_Sub5_Sub16_1.method4910(aClass108_1.anIntArray186, Static18.aClass1_Sub28_Sub1_1);
				Static18.aClass1_Sub28_Sub1_1.method5352(Static18.aClass1_Sub28_Sub1_1.anInt6812 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static160.aClass123_1.method2750(86)) {
					anIntArray340[anInt5200++] = 1;
					return;
				}
				anIntArray340[anInt5200++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static160.aClass123_1.method2750(82)) {
					anIntArray340[anInt5200++] = 1;
					return;
				}
				anIntArray340[anInt5200++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static160.aClass123_1.method2750(81)) {
					anIntArray340[anInt5200++] = 1;
					return;
				}
				anIntArray340[anInt5200++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static452.method5908(anIntArray340[--anInt5200]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray340[anInt5200++] = Static404.method5249();
					return;
				}
				if (arg0 == 5205) {
					Static360.method4835(anIntArray340[--anInt5200], -1, false, -1);
					return;
				}
				@Pc(1554) Class1_Sub5_Sub18 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray340[--anInt5200];
					local1554 = Static167.method1776(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray340[anInt5200++] = -1;
						return;
					}
					anIntArray340[anInt5200++] = local1554.anInt6637;
					return;
				}
				@Pc(1587) Class1_Sub5_Sub18 local1587;
				if (arg0 == 5207) {
					local1587 = Static167.method1760(anIntArray340[--anInt5200]);
					if (local1587 != null && local1587.aString71 != null) {
						aStringArray33[anInt5193++] = local1587.aString71;
						return;
					}
					aStringArray33[anInt5193++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray340[anInt5200++] = Static411.anInt6756;
					anIntArray340[anInt5200++] = Static360.anInt6147;
					return;
				}
				if (arg0 == 5209) {
					anIntArray340[anInt5200++] = Static441.anInt7355 + Static167.anInt2089;
					anIntArray340[anInt5200++] = Static169.anInt2773 + Static167.anInt2099;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray340[--anInt5200];
					local1554 = Static167.method1760(local157);
					if (local1554 == null) {
						anIntArray340[anInt5200++] = 0;
						anIntArray340[anInt5200++] = 0;
						return;
					}
					anIntArray340[anInt5200++] = local1554.anInt6646 >> 14 & 0x3FFF;
					anIntArray340[anInt5200++] = local1554.anInt6646 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray340[--anInt5200];
					local1554 = Static167.method1760(local157);
					if (local1554 == null) {
						anIntArray340[anInt5200++] = 0;
						anIntArray340[anInt5200++] = 0;
						return;
					}
					anIntArray340[anInt5200++] = local1554.anInt6648 - local1554.anInt6649;
					anIntArray340[anInt5200++] = local1554.anInt6647 - local1554.anInt6642;
					return;
				}
				@Pc(1777) Class1_Sub36 local1777;
				if (arg0 == 5212) {
					local1777 = Static32.method424();
					if (local1777 == null) {
						anIntArray340[anInt5200++] = -1;
						anIntArray340[anInt5200++] = -1;
						return;
					}
					anIntArray340[anInt5200++] = local1777.anInt5632;
					local192 = local1777.anInt5633 << 28 | local1777.anInt5636 + Static167.anInt2089 << 14 | local1777.anInt5634 + Static167.anInt2099;
					anIntArray340[anInt5200++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static223.method4588();
					if (local1777 == null) {
						anIntArray340[anInt5200++] = -1;
						anIntArray340[anInt5200++] = -1;
						return;
					}
					anIntArray340[anInt5200++] = local1777.anInt5632;
					local192 = local1777.anInt5633 << 28 | local1777.anInt5636 + Static167.anInt2089 << 14 | local1777.anInt5634 + Static167.anInt2099;
					anIntArray340[anInt5200++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray340[--anInt5200];
					local1554 = Static172.method2426();
					if (local1554 != null) {
						local1925 = local1554.method5197(local157 >> 28 & 0x3, local157 & 0x3FFF, anIntArray342, local157 >> 14 & 0x3FFF);
						if (local1925) {
							Static7.method89(anIntArray342[2], anIntArray342[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt5200 -= 2;
					local157 = anIntArray340[anInt5200];
					local192 = anIntArray340[anInt5200 + 1];
					@Pc(1963) Class225 local1963 = Static167.method1774(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class1_Sub5_Sub18 local1970 = (Class1_Sub5_Sub18) local1963.method4942(); local1970 != null; local1970 = (Class1_Sub5_Sub18) local1963.method4937()) {
						if (local1970.anInt6637 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray340[anInt5200++] = 1;
						return;
					}
					anIntArray340[anInt5200++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray340[--anInt5200];
					local1554 = Static167.method1760(local157);
					if (local1554 == null) {
						anIntArray340[anInt5200++] = -1;
						return;
					}
					anIntArray340[anInt5200++] = local1554.anInt6641;
					return;
				}
				if (arg0 == 5220) {
					anIntArray340[anInt5200++] = Static442.anInt7365 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray340[--anInt5200];
					Static7.method89(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static172.method2426();
					if (local1587 != null) {
						local1313 = local1587.method5200(Static169.anInt2773 + Static167.anInt2099, anIntArray342, Static441.anInt7355 + Static167.anInt2089);
						if (local1313) {
							anIntArray340[anInt5200++] = anIntArray342[1];
							anIntArray340[anInt5200++] = anIntArray342[2];
							return;
						}
						anIntArray340[anInt5200++] = -1;
						anIntArray340[anInt5200++] = -1;
						return;
					}
					anIntArray340[anInt5200++] = -1;
					anIntArray340[anInt5200++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt5200 -= 2;
					local157 = anIntArray340[anInt5200];
					local192 = anIntArray340[anInt5200 + 1];
					Static360.method4835(local157, local192 & 0x3FFF, false, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray340[--anInt5200];
					local1554 = Static172.method2426();
					if (local1554 != null) {
						local1925 = local1554.method5197(local157 >> 28 & 0x3, local157 & 0x3FFF, anIntArray342, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray340[anInt5200++] = anIntArray342[1];
							anIntArray340[anInt5200++] = anIntArray342[2];
							return;
						}
						anIntArray340[anInt5200++] = -1;
						anIntArray340[anInt5200++] = -1;
						return;
					}
					anIntArray340[anInt5200++] = -1;
					anIntArray340[anInt5200++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray340[--anInt5200];
					local1554 = Static172.method2426();
					if (local1554 != null) {
						local1925 = local1554.method5200(local157 & 0x3FFF, anIntArray342, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray340[anInt5200++] = anIntArray342[1];
							anIntArray340[anInt5200++] = anIntArray342[2];
							return;
						}
						anIntArray340[anInt5200++] = -1;
						anIntArray340[anInt5200++] = -1;
						return;
					}
					anIntArray340[anInt5200++] = -1;
					anIntArray340[anInt5200++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static96.method2906(anIntArray340[--anInt5200]);
					return;
				}
				if (arg0 == 5227) {
					anInt5200 -= 2;
					local157 = anIntArray340[anInt5200];
					local192 = anIntArray340[anInt5200 + 1];
					Static360.method4835(local157, local192 & 0x3FFF, true, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static104.aBoolean226 = anIntArray340[--anInt5200] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray340[anInt5200++] = Static104.aBoolean226 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray340[--anInt5200];
					Static239.method4561(local157);
					return;
				}
				@Pc(2483) Class1 local2483;
				if (arg0 == 5231) {
					anInt5200 -= 2;
					local157 = anIntArray340[anInt5200];
					local1313 = anIntArray340[anInt5200 + 1] == 1;
					if (Static303.aClass199_188 != null) {
						local2483 = Static303.aClass199_188.method4387((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5915();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class1();
							Static303.aClass199_188.method4383((long) local157, local2483);
						}
					}
					return;
				}
				@Pc(2525) Class1 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray340[--anInt5200];
					if (Static303.aClass199_188 != null) {
						local2525 = Static303.aClass199_188.method4387((long) local157);
						anIntArray340[anInt5200++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray340[anInt5200++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt5200 -= 2;
					local157 = anIntArray340[anInt5200];
					local1313 = anIntArray340[anInt5200 + 1] == 1;
					if (Static297.aClass199_156 != null) {
						local2483 = Static297.aClass199_156.method4387((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5915();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class1();
							Static297.aClass199_156.method4383((long) local157, local2483);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray340[--anInt5200];
					if (Static297.aClass199_156 != null) {
						local2525 = Static297.aClass199_156.method4387((long) local157);
						anIntArray340[anInt5200++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray340[anInt5200++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray340[anInt5200++] = Static167.aClass1_Sub5_Sub18_2 == null ? -1 : Static167.aClass1_Sub5_Sub18_2.anInt6637;
					return;
				}
				if (arg0 == 5236) {
					anInt5200 -= 2;
					local157 = anIntArray340[anInt5200];
					local192 = anIntArray340[anInt5200 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static144.method2176(local89, local157, local95);
					if (local2691 < 0) {
						anIntArray340[anInt5200++] = -1;
						return;
					}
					anIntArray340[anInt5200++] = local2691;
					return;
				}
				if (arg0 == 5237) {
					Static434.method5714();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt5200 -= 2;
					local157 = anIntArray340[anInt5200];
					local192 = anIntArray340[anInt5200 + 1];
					Static169.method2392(local157, 3, local192, false);
					anIntArray340[anInt5200++] = Static90.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static90.aFrame1 != null) {
						Static169.method2392(-1, Static453.aClass136_Sub1_1.anInt4455, -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2775) Class116[] local2775 = Static199.method2830();
					anIntArray340[anInt5200++] = local2775.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray340[--anInt5200];
					@Pc(2799) Class116[] local2799 = Static199.method2830();
					anIntArray340[anInt5200++] = local2799[local157].anInt3138;
					anIntArray340[anInt5200++] = local2799[local157].anInt3141;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static453.aClass136_Sub1_1.anInt4445;
					local192 = Static453.aClass136_Sub1_1.anInt4440;
					local89 = -1;
					@Pc(2836) Class116[] local2836 = Static199.method2830();
					for (local2691 = 0; local2691 < local2836.length; local2691++) {
						@Pc(2843) Class116 local2843 = local2836[local2691];
						if (local2843.anInt3138 == local157 && local2843.anInt3141 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray340[anInt5200++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray340[anInt5200++] = Static101.method1560();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray340[--anInt5200];
					if (local157 >= 1 && local157 <= 2) {
						Static169.method2392(-1, local157, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.anInt4455;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray340[--anInt5200];
					if (local157 >= 1 && local157 <= 2) {
						Static453.aClass136_Sub1_1.anInt4455 = local157;
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						return;
					}
					return;
				}
			} else {
				@Pc(3351) String local3351;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt5193 -= 2;
						local75 = aStringArray33[anInt5193];
						local81 = aStringArray33[anInt5193 + 1];
						local89 = anIntArray340[--anInt5200];
						Static52.method867(Static356.aClass103_219);
						Static18.aClass1_Sub28_Sub1_1.method5398(Static349.method4734(local75) + Static349.method4734(local81) + 1);
						Static18.aClass1_Sub28_Sub1_1.method5364(local75);
						Static18.aClass1_Sub28_Sub1_1.method5364(local81);
						Static18.aClass1_Sub28_Sub1_1.method5398(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt5200 -= 2;
						Static34.aShortArray3[anIntArray340[anInt5200]] = (short) Static124.method5692(anIntArray340[anInt5200 + 1]);
						Static342.aClass155_2.method3546();
						Static342.aClass155_2.method3544();
						Static161.aClass231_2.method5026();
						Static65.method1072();
						return;
					}
					if (arg0 == 5405) {
						anInt5200 -= 2;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static370.anIntArrayArrayArray5[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt5200 -= 7;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1] << 1;
						local89 = anIntArray340[anInt5200 + 2];
						local95 = anIntArray340[anInt5200 + 3];
						local2691 = anIntArray340[anInt5200 + 4];
						@Pc(3111) int local3111 = anIntArray340[anInt5200 + 5];
						@Pc(3117) int local3117 = anIntArray340[anInt5200 + 6];
						if (local157 >= 0 && local157 < 2 && Static370.anIntArrayArrayArray5[local157] != null && local192 >= 0 && local192 < Static370.anIntArrayArrayArray5[local157].length) {
							Static370.anIntArrayArrayArray5[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3117 };
							Static370.anIntArrayArrayArray5[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3111, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static370.anIntArrayArrayArray5[anIntArray340[--anInt5200]].length >> 1;
						anIntArray340[anInt5200++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static90.aFrame1 != null) {
							Static169.method2392(-1, Static453.aClass136_Sub1_1.anInt4455, -1, false);
						}
						if (Static411.aFrame2 != null) {
							Static364.method2863();
							System.exit(0);
							return;
						}
						local75 = Static82.aString79 == null ? Static354.method4774() : Static82.aString79;
						Static141.method3869(Static14.anInt293 == 1, local75, false, Static183.aClass83_2);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static8.aClass232_1 != null) {
							if (Static8.aClass232_1.anObject8 == null) {
								local75 = Static380.method5005(Static8.aClass232_1.anInt6401);
							} else {
								local75 = (String) Static8.aClass232_1.anObject8;
							}
						}
						aStringArray33[anInt5193++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray340[anInt5200++] = Static117.anInt2198 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static90.aFrame1 != null) {
							Static169.method2392(-1, Static453.aClass136_Sub1_1.anInt4455, -1, false);
						}
						local75 = aStringArray33[--anInt5193];
						local1313 = anIntArray340[--anInt5200] == 1;
						local3351 = Static354.method4774() + local75;
						Static141.method3869(Static14.anInt293 == 1, local3351, local1313, Static183.aClass83_2);
						return;
					}
					if (arg0 == 5422) {
						anInt5193 -= 2;
						local75 = aStringArray33[anInt5193];
						local81 = aStringArray33[anInt5193 + 1];
						local89 = anIntArray340[--anInt5200];
						if (local75.length() > 0) {
							if (Static431.aStringArray47 == null) {
								Static431.aStringArray47 = new String[Static93.anIntArray118[Static183.aClass48_3.anInt1229]];
							}
							Static431.aStringArray47[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static315.aStringArray35 == null) {
								Static315.aStringArray35 = new String[Static93.anIntArray118[Static183.aClass48_3.anInt1229]];
							}
							Static315.aStringArray35[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray33[--anInt5193]);
						return;
					}
					if (arg0 == 5424) {
						anInt5200 -= 11;
						Static367.anInt6204 = anIntArray340[anInt5200];
						Static269.anInt4853 = anIntArray340[anInt5200 + 1];
						Static287.anInt5030 = anIntArray340[anInt5200 + 2];
						Static327.anInt5584 = anIntArray340[anInt5200 + 3];
						Static84.anInt958 = anIntArray340[anInt5200 + 4];
						Static234.anInt4181 = anIntArray340[anInt5200 + 5];
						Static394.anInt6583 = anIntArray340[anInt5200 + 6];
						Static310.anInt5382 = anIntArray340[anInt5200 + 7];
						Static350.anInt6012 = anIntArray340[anInt5200 + 8];
						Static210.anInt3772 = anIntArray340[anInt5200 + 9];
						Static238.anInt4348 = anIntArray340[anInt5200 + 10];
						Static448.aClass82_104.method1820(Static84.anInt958);
						Static448.aClass82_104.method1820(Static234.anInt4181);
						Static448.aClass82_104.method1820(Static394.anInt6583);
						Static448.aClass82_104.method1820(Static310.anInt5382);
						Static448.aClass82_104.method1820(Static350.anInt6012);
						Static243.aClass6_39 = null;
						Static196.aClass6_51 = null;
						Static142.aClass6_28 = null;
						Static145.aClass6_19 = null;
						Static3.aClass6_46 = null;
						Static340.aClass6_45 = null;
						Static138.aClass6_26 = null;
						Static112.aClass6_21 = null;
						Static382.aBoolean780 = true;
						return;
					}
					if (arg0 == 5425) {
						Static238.method3446();
						Static382.aBoolean780 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt5200 -= 2;
						Static54.anInt973 = anIntArray340[anInt5200];
						Static423.anInt6430 = anIntArray340[anInt5200 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt5200 -= 2;
						Static137.anInt2436 = anIntArray340[anInt5200 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt5200 -= 2;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						anIntArray340[anInt5200++] = Static342.method4597(local192, local157) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static200.method2833(false, aStringArray33[--anInt5193], false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static461.method3101(Static183.aClass83_2.anApplet1, "accountcreated");
							return;
						} catch (@Pc(3646) Throwable local3646) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt5200 -= 4;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						local89 = anIntArray340[anInt5200 + 2];
						local95 = anIntArray340[anInt5200 + 3];
						Static156.method2286((local157 & 0x3FFF) - Static164.anInt2731, local89, false, (local157 >> 14 & 0x3FFF) - Static199.anInt3480, local95, local192);
						return;
					}
					if (arg0 == 5501) {
						anInt5200 -= 4;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						local89 = anIntArray340[anInt5200 + 2];
						local95 = anIntArray340[anInt5200 + 3];
						Static344.method4692((local157 & 0x3FFF) - Static164.anInt2731, local95, (local157 >> 14 & 0x3FFF) - Static199.anInt3480, local192, local89);
						return;
					}
					if (arg0 == 5502) {
						anInt5200 -= 6;
						local157 = anIntArray340[anInt5200];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static283.anInt4984 = local157;
						local192 = anIntArray340[anInt5200 + 1];
						if (local192 + 1 >= Static370.anIntArrayArrayArray5[Static283.anInt4984].length >> 1) {
							throw new RuntimeException();
						}
						Static58.anInt1167 = local192;
						Static357.anInt6112 = 0;
						Static322.anInt5502 = anIntArray340[anInt5200 + 2];
						Static453.anInt7490 = anIntArray340[anInt5200 + 3];
						local89 = anIntArray340[anInt5200 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static142.anInt2499 = local89;
						local95 = anIntArray340[anInt5200 + 5];
						if (local95 + 1 >= Static370.anIntArrayArrayArray5[Static142.anInt2499].length >> 1) {
							throw new RuntimeException();
						}
						Static415.anInt6868 = local95;
						Static333.anInt5693 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static3.method4552();
						return;
					}
					if (arg0 == 5504) {
						anInt5200 -= 2;
						Static127.method2013(anIntArray340[anInt5200], anIntArray340[anInt5200 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray340[anInt5200++] = (int) Static262.aFloat62 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray340[anInt5200++] = (int) Static98.aFloat20 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static342.method4598();
						return;
					}
					if (arg0 == 5508) {
						Static231.method3311();
						return;
					}
					if (arg0 == 5509) {
						Static411.method5299();
						return;
					}
					if (arg0 == 5510) {
						Static205.method2916();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray340[--anInt5200];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static199.anInt3480;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static296.anInt5187) {
							local192 = Static296.anInt5187;
						}
						local89 -= Static164.anInt2731;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static206.anInt3607) {
							local89 = Static206.anInt3607;
						}
						Static436.anInt7317 = (local192 << 7) + 64;
						Static378.anInt2804 = (local89 << 7) + 64;
						Static333.anInt5693 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static449.method5876();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt5193 -= 2;
						local75 = aStringArray33[anInt5193];
						local81 = aStringArray33[anInt5193 + 1];
						local89 = anIntArray340[--anInt5200];
						if (Static312.anInt5414 != 2) {
							return;
						}
						if (Static58.anInt1166 == 0 && Static408.anInt6718 == 0) {
							Static109.aString58 = local75;
							Static47.aString8 = local81;
							Static333.anInt5694 = local89;
							Static203.method4783(5);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static297.method4611();
						return;
					}
					if (arg0 == 5602) {
						if (Static58.anInt1166 == 0) {
							Static357.anInt6116 = -2;
							Static291.anInt5071 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt5200 -= 4;
						if (Static312.anInt5414 != 2) {
							return;
						}
						if (Static58.anInt1166 == 0 && Static408.anInt6718 == 0) {
							Static205.method2911(anIntArray340[anInt5200], anIntArray340[anInt5200 + 3], anIntArray340[anInt5200 + 2], anIntArray340[anInt5200 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt5193--;
						if (Static312.anInt5414 != 2) {
							return;
						}
						if (Static58.anInt1166 == 0 && Static408.anInt6718 == 0) {
							Static134.method2067(Static415.method5404(aStringArray33[anInt5193]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt5193 -= 2;
						if (Static312.anInt5414 != 2) {
							return;
						}
						if (Static58.anInt1166 == 0 && Static408.anInt6718 == 0) {
							Static84.method911(false, Static415.method5404(aStringArray33[anInt5193]), aStringArray33[anInt5193 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static408.anInt6718 == 0) {
							Static411.anInt6757 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray340[anInt5200++] = Static291.anInt5071;
						return;
					}
					if (arg0 == 5608) {
						anIntArray340[anInt5200++] = Static283.anInt4985;
						return;
					}
					if (arg0 == 5609) {
						anIntArray340[anInt5200++] = Static411.anInt6757;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray33[anInt5193++] = Static99.aStringArray11.length > local157 ? Static10.method140(Static99.aStringArray11[local157]) : "";
						}
						Static99.aStringArray11 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray340[anInt5200++] = Static41.anInt714;
						return;
					}
					if (arg0 == 5612) {
						local157 = anIntArray340[--anInt5200];
						if (Static312.anInt5414 != 6) {
							return;
						}
						if (Static58.anInt1166 == 0 && Static408.anInt6718 == 0) {
							if (Static395.aClass131_3 != null) {
								Static395.aClass131_3.method2933();
								Static395.aClass131_3 = null;
							}
							Static333.anInt5694 = local157;
							Static203.method4783(8);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray340[anInt5200++] = Static291.anInt5071;
						return;
					}
					if (arg0 == 5615) {
						anInt5193 -= 2;
						local75 = aStringArray33[anInt5193];
						local81 = aStringArray33[anInt5193 + 1];
						if (Static312.anInt5414 != 2) {
							return;
						}
						if (Static58.anInt1166 == 0 && Static408.anInt6718 == 0) {
							if (Static395.aClass131_3 != null) {
								Static395.aClass131_3.method2933();
								Static395.aClass131_3 = null;
							}
							Static109.aString58 = local75;
							Static47.aString8 = local81;
							Static203.method4783(4);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static368.method4884(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray340[anInt5200++] = Static357.anInt6116;
						return;
					}
					if (arg0 == 5618) {
						local157 = anIntArray340[--anInt5200];
						Static220.method3223(local157, false);
						return;
					}
					if (arg0 == 5619) {
						local157 = anIntArray340[--anInt5200];
						Static220.method3223(local157, true);
						return;
					}
					if (arg0 == 5620) {
						Static369.method4899();
						if (Static146.aString34 != "" && Static146.aString34 != "") {
							anIntArray340[anInt5200++] = 1;
							return;
						}
						anIntArray340[anInt5200++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt5193 -= 2;
						if (Static312.anInt5414 != 2) {
							return;
						}
						if (Static58.anInt1166 == 0 && Static408.anInt6718 == 0) {
							Static84.method911(true, Static415.method5404(aStringArray33[anInt5193]), aStringArray33[anInt5193 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5622) {
						@Pc(4436) Class232 local4436 = Static183.aClass83_2.method1877("3", false);
						while (local4436.anInt6402 == 0) {
							Static223.method4582(1L);
						}
						if (local4436.anInt6402 == 2) {
							throw new RuntimeException("Error opening file");
						}
						@Pc(4456) Class98 local4456 = (Class98) local4436.anObject8;
						if (local4456.method2222().exists()) {
							@Pc(4466) Class1_Sub28 local4466 = new Class1_Sub28(50);
							try {
								local4456.method2221(0, 50, local4466.aByteArray86);
							} catch (@Pc(4475) IOException local4475) {
							}
						}
						try {
							local4456.method2224();
							return;
						} catch (@Pc(4481) Exception local4481) {
							return;
						}
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray340[--anInt5200];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static453.aClass136_Sub1_1.anInt4451 = local157;
						Static353.method4772();
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6002) {
						Static453.aClass136_Sub1_1.method3524(anIntArray340[--anInt5200] == 1);
						Static353.method4772();
						Static319.method4282();
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6003) {
						Static453.aClass136_Sub1_1.aBoolean509 = anIntArray340[--anInt5200] == 1;
						Static319.method4282();
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6005) {
						Static453.aClass136_Sub1_1.aBoolean512 = anIntArray340[--anInt5200] == 1;
						Static353.method4772();
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6006) {
						Static453.aClass136_Sub1_1.aBoolean498 = anIntArray340[--anInt5200] == 1;
						Static185.aClass34_7.method5768(!Static453.aClass136_Sub1_1.aBoolean498);
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6007) {
						Static453.aClass136_Sub1_1.anInt4450 = anIntArray340[--anInt5200];
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6008) {
						Static453.aClass136_Sub1_1.aBoolean500 = anIntArray340[--anInt5200] == 1;
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6009) {
						Static453.aClass136_Sub1_1.aBoolean506 = anIntArray340[--anInt5200] == 1;
						Static353.method4772();
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6010) {
						Static453.aClass136_Sub1_1.aBoolean503 = anIntArray340[--anInt5200] == 1;
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray340[--anInt5200];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static453.aClass136_Sub1_1.method3518(Static14.anInt293, local157);
						Static353.method4772();
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6012) {
						Static453.aClass136_Sub1_1.method3517(Static14.anInt293, anIntArray340[--anInt5200] == 1);
						Static354.method4773();
						Static129.method2031();
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6014) {
						Static453.aClass136_Sub1_1.aBoolean501 = anIntArray340[--anInt5200] == 1;
						Static353.method4772();
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6015) {
						Static453.aClass136_Sub1_1.aBoolean496 = anIntArray340[--anInt5200] == 1;
						Static353.method4772();
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray340[--anInt5200];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static453.aClass136_Sub1_1.anInt4443 = local157;
						Static379.method4990(Static14.anInt293);
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						return;
					}
					if (arg0 == 6017) {
						Static453.aClass136_Sub1_1.aBoolean504 = anIntArray340[--anInt5200] == 1;
						Static157.method2290();
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray340[--anInt5200];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static453.aClass136_Sub1_1.anInt4442 = local157;
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray340[--anInt5200];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static453.aClass136_Sub1_1.anInt4444) {
							if (Static453.aClass136_Sub1_1.anInt4444 == 0 && Static143.anInt2345 != -1) {
								Static322.method4324(Static143.anInt2345, Static447.aClass82_54, local157);
								Static328.aBoolean637 = false;
							} else if (local157 == 0) {
								Static34.method492();
								Static328.aBoolean637 = false;
							} else {
								Static164.method2369(local157);
							}
							Static453.aClass136_Sub1_1.anInt4444 = local157;
						}
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray340[--anInt5200];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static453.aClass136_Sub1_1.anInt4441 = local157;
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6021) {
						Static453.aClass136_Sub1_1.aBoolean513 = anIntArray340[--anInt5200] == 1;
						Static319.method4282();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray340[--anInt5200];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static270.anInt4858 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static300.method4092(local157);
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						anIntArray340[anInt5200++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray340[--anInt5200];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static453.aClass136_Sub1_1.anInt4454 = local157;
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray340[--anInt5200];
						if (local157 < 0 || local157 > Static127.method2012(Static270.anInt4858)) {
							local157 = 0;
						}
						Static453.aClass136_Sub1_1.anInt4446 = local157;
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray340[--anInt5200];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static18.method276(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static453.aClass136_Sub1_1.aBoolean507 = anIntArray340[--anInt5200] != 0;
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						return;
					}
					if (arg0 == 6029) {
						Static453.aClass136_Sub1_1.anInt4450 = anIntArray340[--anInt5200];
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						return;
					}
					if (arg0 == 6030) {
						Static453.aClass136_Sub1_1.aBoolean510 = anIntArray340[--anInt5200] != 0;
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static353.method4772();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray340[--anInt5200];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static379.method4990(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray340[--anInt5200];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static453.aClass136_Sub1_1.anInt4439 = local157;
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray340[--anInt5200];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static453.aClass136_Sub1_1.anInt4459 = local157;
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						return;
					}
					if (arg0 == 6034) {
						Static453.aClass136_Sub1_1.aBoolean505 = anIntArray340[--anInt5200] == 1;
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						Static354.method4773();
						Static303.aBoolean816 = false;
						return;
					}
					if (arg0 == 6035) {
						Static453.aClass136_Sub1_1.aBoolean514 = anIntArray340[--anInt5200] == 1;
						Static353.method4772();
						Static319.method4282();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.anInt4451;
						return;
					}
					if (arg0 == 6102) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.method3526(Static14.anInt293) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.aBoolean509 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.aBoolean512 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.aBoolean498 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.anInt4450;
						return;
					}
					if (arg0 == 6108) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.aBoolean500 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.aBoolean506 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.aBoolean503 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.method3516(Static14.anInt293);
						return;
					}
					if (arg0 == 6112) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.method3519(Static14.anInt293) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.aBoolean501 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.aBoolean496 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.anInt4443;
						return;
					}
					if (arg0 == 6117) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.aBoolean504 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.anInt4442;
						return;
					}
					if (arg0 == 6119) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.anInt4444;
						return;
					}
					if (arg0 == 6120) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.anInt4441;
						return;
					}
					if (arg0 == 6121) {
						anIntArray340[anInt5200++] = Static185.aClass34_7.method5740() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray340[anInt5200++] = Static241.method3473();
						return;
					}
					if (arg0 == 6124) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.anInt4454;
						return;
					}
					if (arg0 == 6125) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.anInt4446;
						return;
					}
					if (arg0 == 6126) {
						anIntArray340[anInt5200++] = Static185.aClass34_7.method5794() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.aBoolean511 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.aBoolean507 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.anInt4450;
						return;
					}
					if (arg0 == 6130) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.aBoolean510 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray340[anInt5200++] = Static14.anInt293;
						return;
					}
					if (arg0 == 6132) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.anInt4439;
						return;
					}
					if (arg0 == 6133) {
						anIntArray340[anInt5200++] = Static117.anInt2198 == 1 || Static117.anInt2198 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray340[anInt5200++] = Static127.method2012(Static270.anInt4858);
						return;
					}
					if (arg0 == 6135) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.anInt4459;
						return;
					}
					if (arg0 == 6136) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.aBoolean505 ? 1 : 0;
						return;
					}
					if (arg0 == 6137) {
						@Pc(5871) boolean local5871 = true;
						try {
							local5871 = jagmisc.getTotalPhysicalMemory() > 268435456L;
						} catch (@Pc(5881) Throwable local5881) {
						}
						anIntArray340[anInt5200++] = local5871 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt5200 -= 2;
						Static240.aShort108 = (short) anIntArray340[anInt5200];
						if (Static240.aShort108 <= 0) {
							Static240.aShort108 = 256;
						}
						Static306.aShort92 = (short) anIntArray340[anInt5200 + 1];
						if (Static306.aShort92 <= 0) {
							Static306.aShort92 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt5200 -= 2;
						Static31.aShort5 = (short) anIntArray340[anInt5200];
						if (Static31.aShort5 <= 0) {
							Static31.aShort5 = 256;
						}
						Static450.aShort114 = (short) anIntArray340[anInt5200 + 1];
						if (Static450.aShort114 <= 0) {
							Static450.aShort114 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt5200 -= 4;
						Static19.aShort4 = (short) anIntArray340[anInt5200];
						if (Static19.aShort4 <= 0) {
							Static19.aShort4 = 1;
						}
						Static335.aShort98 = (short) anIntArray340[anInt5200 + 1];
						if (Static335.aShort98 <= 0) {
							Static335.aShort98 = 32767;
						} else if (Static335.aShort98 < Static19.aShort4) {
							Static335.aShort98 = Static19.aShort4;
						}
						Static223.aShort105 = (short) anIntArray340[anInt5200 + 2];
						if (Static223.aShort105 <= 0) {
							Static223.aShort105 = 1;
						}
						Static364.aShort51 = (short) anIntArray340[anInt5200 + 3];
						if (Static364.aShort51 <= 0) {
							Static364.aShort51 = 32767;
							return;
						}
						if (Static364.aShort51 < Static223.aShort105) {
							Static364.aShort51 = Static223.aShort105;
						}
						return;
					}
					if (arg0 == 6203) {
						Static148.method2216(Static210.aClass124_4.anInt3356, false, Static210.aClass124_4.anInt3376, 0, 0);
						anIntArray340[anInt5200++] = Static293.anInt5132;
						anIntArray340[anInt5200++] = Static312.anInt5417;
						return;
					}
					if (arg0 == 6204) {
						anIntArray340[anInt5200++] = Static31.aShort5;
						anIntArray340[anInt5200++] = Static450.aShort114;
						return;
					}
					if (arg0 == 6205) {
						anIntArray340[anInt5200++] = Static240.aShort108;
						anIntArray340[anInt5200++] = Static306.aShort92;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray340[anInt5200++] = (int) (Static27.method359() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray340[anInt5200++] = (int) (Static27.method359() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt5200 -= 3;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						local89 = anIntArray340[anInt5200 + 2];
						aCalendar1.clear();
						aCalendar1.set(11, 12);
						aCalendar1.set(local89, local192, local157);
						anIntArray340[anInt5200++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6303) {
						aCalendar1.clear();
						aCalendar1.setTime(new Date(Static27.method359()));
						anIntArray340[anInt5200++] = aCalendar1.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray340[--anInt5200];
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
						anIntArray340[anInt5200++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray340[anInt5200++] = Static411.method5300() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray340[anInt5200++] = Static236.method3396() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static312.anInt5414 == 6 && Static58.anInt1166 == 0 && Static408.anInt6718 == 0) {
							if (Static39.aBoolean77) {
								anIntArray340[anInt5200++] = 0;
								return;
							}
							if (Static340.aLong173 > Static27.method359() - 1000L) {
								anIntArray340[anInt5200++] = 1;
								return;
							}
							Static39.aBoolean77 = true;
							Static52.method867(Static159.aClass103_114);
							Static18.aClass1_Sub28_Sub1_1.method5347(Static56.anInt1067);
							anIntArray340[anInt5200++] = 0;
							return;
						}
						anIntArray340[anInt5200++] = 1;
						return;
					}
					@Pc(6408) Class196 local6408;
					@Pc(6375) Class147_Sub1 local6375;
					if (arg0 == 6501) {
						local6375 = Static255.method1033();
						if (local6375 != null) {
							anIntArray340[anInt5200++] = local6375.anInt6663;
							anIntArray340[anInt5200++] = local6375.anInt6657;
							aStringArray33[anInt5193++] = local6375.aString72;
							local6408 = local6375.method5215();
							anIntArray340[anInt5200++] = local6408.anInt5496;
							aStringArray33[anInt5193++] = local6408.aString63;
							anIntArray340[anInt5200++] = local6375.anInt6661;
							anIntArray340[anInt5200++] = local6375.anInt6664;
							aStringArray33[anInt5193++] = local6375.aString73;
							return;
						}
						anIntArray340[anInt5200++] = -1;
						anIntArray340[anInt5200++] = 0;
						aStringArray33[anInt5193++] = "";
						anIntArray340[anInt5200++] = 0;
						aStringArray33[anInt5193++] = "";
						anIntArray340[anInt5200++] = 0;
						anIntArray340[anInt5200++] = 0;
						aStringArray33[anInt5193++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6375 = Static162.method2356();
						if (local6375 != null) {
							anIntArray340[anInt5200++] = local6375.anInt6663;
							anIntArray340[anInt5200++] = local6375.anInt6657;
							aStringArray33[anInt5193++] = local6375.aString72;
							local6408 = local6375.method5215();
							anIntArray340[anInt5200++] = local6408.anInt5496;
							aStringArray33[anInt5193++] = local6408.aString63;
							anIntArray340[anInt5200++] = local6375.anInt6661;
							anIntArray340[anInt5200++] = local6375.anInt6664;
							aStringArray33[anInt5193++] = local6375.aString73;
							return;
						}
						anIntArray340[anInt5200++] = -1;
						anIntArray340[anInt5200++] = 0;
						aStringArray33[anInt5193++] = "";
						anIntArray340[anInt5200++] = 0;
						aStringArray33[anInt5193++] = "";
						anIntArray340[anInt5200++] = 0;
						anIntArray340[anInt5200++] = 0;
						aStringArray33[anInt5193++] = "";
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray340[--anInt5200];
						local81 = aStringArray33[--anInt5193];
						if (Static312.anInt5414 == 6 && Static58.anInt1166 == 0 && Static408.anInt6718 == 0) {
							anIntArray340[anInt5200++] = Static244.method3508(local157, local81) ? 1 : 0;
							return;
						}
						anIntArray340[anInt5200++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static453.aClass136_Sub1_1.anInt4457 = anIntArray340[--anInt5200];
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						return;
					}
					if (arg0 == 6505) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.anInt4457;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray340[--anInt5200];
						@Pc(6765) Class147_Sub1 local6765 = Static363.method4853(local157);
						if (local6765 != null) {
							anIntArray340[anInt5200++] = local6765.anInt6657;
							aStringArray33[anInt5193++] = local6765.aString72;
							@Pc(6789) Class196 local6789 = local6765.method5215();
							anIntArray340[anInt5200++] = local6789.anInt5496;
							aStringArray33[anInt5193++] = local6789.aString63;
							anIntArray340[anInt5200++] = local6765.anInt6661;
							anIntArray340[anInt5200++] = local6765.anInt6664;
							aStringArray33[anInt5193++] = local6765.aString73;
							return;
						}
						anIntArray340[anInt5200++] = -1;
						aStringArray33[anInt5193++] = "";
						anIntArray340[anInt5200++] = 0;
						aStringArray33[anInt5193++] = "";
						anIntArray340[anInt5200++] = 0;
						anIntArray340[anInt5200++] = 0;
						aStringArray33[anInt5193++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt5200 -= 4;
						local157 = anIntArray340[anInt5200];
						local1313 = anIntArray340[anInt5200 + 1] == 1;
						local89 = anIntArray340[anInt5200 + 2];
						local1965 = anIntArray340[anInt5200 + 3] == 1;
						Static392.method5126(local157, local1313, local1965, local89);
						return;
					}
					if (arg0 == 6508) {
						Static418.method5569();
						return;
					}
					if (arg0 == 6509) {
						if (Static312.anInt5414 != 6) {
							return;
						}
						Static371.aBoolean701 = anIntArray340[--anInt5200] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static453.aClass136_Sub1_1.aBoolean495 = anIntArray340[--anInt5200] == 1;
						Static453.aClass136_Sub1_1.method3527(Static183.aClass83_2);
						return;
					}
					if (arg0 == 6601) {
						anIntArray340[anInt5200++] = Static453.aClass136_Sub1_1.aBoolean495 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static57.aClass233_2 == Static52.aClass233_1) {
					if (arg0 == 6700) {
						local157 = Static94.aClass199_54.method4390();
						if (Static207.anInt6026 != -1) {
							local157++;
						}
						anIntArray340[anInt5200++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray340[--anInt5200];
						if (Static207.anInt6026 != -1) {
							if (local157 == 0) {
								anIntArray340[anInt5200++] = Static207.anInt6026;
								return;
							}
							local157--;
						}
						@Pc(7064) Class1_Sub14 local7064 = (Class1_Sub14) Static94.aClass199_54.method4392();
						while (local157-- > 0) {
							local7064 = (Class1_Sub14) Static94.aClass199_54.method4393();
						}
						anIntArray340[anInt5200++] = local7064.anInt1425;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray340[--anInt5200];
						if (Static87.aClass124ArrayArray7[local157] == null) {
							aStringArray33[anInt5193++] = "";
							return;
						}
						local81 = Static87.aClass124ArrayArray7[local157][0].aString41;
						if (local81 == null) {
							aStringArray33[anInt5193++] = "";
							return;
						}
						aStringArray33[anInt5193++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray340[--anInt5200];
						if (Static87.aClass124ArrayArray7[local157] == null) {
							anIntArray340[anInt5200++] = 0;
							return;
						}
						anIntArray340[anInt5200++] = Static87.aClass124ArrayArray7[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt5200 -= 2;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						if (Static87.aClass124ArrayArray7[local157] == null) {
							aStringArray33[anInt5193++] = "";
							return;
						}
						local3351 = Static87.aClass124ArrayArray7[local157][local192].aString41;
						if (local3351 == null) {
							aStringArray33[anInt5193++] = "";
							return;
						}
						aStringArray33[anInt5193++] = local3351;
						return;
					}
					if (arg0 == 6705) {
						anInt5200 -= 2;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						if (Static87.aClass124ArrayArray7[local157] == null) {
							anIntArray340[anInt5200++] = 0;
							return;
						}
						anIntArray340[anInt5200++] = Static87.aClass124ArrayArray7[local157][local192].anInt3364;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt5200 -= 3;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						local89 = anIntArray340[anInt5200 + 2];
						Static238.method3436("", 1, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6708) {
						anInt5200 -= 3;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						local89 = anIntArray340[anInt5200 + 2];
						Static238.method3436("", 2, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6709) {
						anInt5200 -= 3;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						local89 = anIntArray340[anInt5200 + 2];
						Static238.method3436("", 3, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6710) {
						anInt5200 -= 3;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						local89 = anIntArray340[anInt5200 + 2];
						Static238.method3436("", 4, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6711) {
						anInt5200 -= 3;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						local89 = anIntArray340[anInt5200 + 2];
						Static238.method3436("", 5, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6712) {
						anInt5200 -= 3;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						local89 = anIntArray340[anInt5200 + 2];
						Static238.method3436("", 6, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6713) {
						anInt5200 -= 3;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						local89 = anIntArray340[anInt5200 + 2];
						Static238.method3436("", 7, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6714) {
						anInt5200 -= 3;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						local89 = anIntArray340[anInt5200 + 2];
						Static238.method3436("", 8, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6715) {
						anInt5200 -= 3;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						local89 = anIntArray340[anInt5200 + 2];
						Static238.method3436("", 9, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6716) {
						anInt5200 -= 3;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						local89 = anIntArray340[anInt5200 + 2];
						Static238.method3436("", 10, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6717) {
						anInt5200 -= 3;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						local89 = anIntArray340[anInt5200 + 2];
						@Pc(7652) Class124 local7652 = Static334.method4492(local157 << 16 | local192, local89);
						Static124.method5684();
						@Pc(7657) Class1_Sub27 local7657 = Static55.method970(local7652);
						Static190.method2737(local7652, local7657.method2820(), local7657.anInt3465);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7685) Class205 local7685;
					if (arg0 == 6800) {
						local157 = anIntArray340[--anInt5200];
						local7685 = Static392.aClass178_4.method3963(local157);
						if (local7685.aString65 == null) {
							aStringArray33[anInt5193++] = "";
							return;
						}
						aStringArray33[anInt5193++] = local7685.aString65;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray340[--anInt5200];
						local7685 = Static392.aClass178_4.method3963(local157);
						anIntArray340[anInt5200++] = local7685.anInt5765;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray340[--anInt5200];
						local7685 = Static392.aClass178_4.method3963(local157);
						anIntArray340[anInt5200++] = local7685.anInt5745;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray340[--anInt5200];
						local7685 = Static392.aClass178_4.method3963(local157);
						anIntArray340[anInt5200++] = local7685.anInt5747;
						return;
					}
					if (arg0 == 6804) {
						anInt5200 -= 2;
						local157 = anIntArray340[anInt5200];
						local192 = anIntArray340[anInt5200 + 1];
						@Pc(7807) Class106 local7807 = Static65.aClass86_1.method1919(local192);
						if (local7807.method2333()) {
							aStringArray33[anInt5193++] = Static392.aClass178_4.method3963(local157).method4515(local192, local7807.aString35);
							return;
						}
						anIntArray340[anInt5200++] = Static392.aClass178_4.method3963(local157).method4521(local7807.anInt2688, local192);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray340[anInt5200++] = Static361.aBoolean690 && !Static241.aBoolean491 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray340[anInt5200++] = Static190.anInt3295;
						return;
					}
					if (arg0 == 6902) {
						anIntArray340[anInt5200++] = Static357.anInt6118;
						return;
					}
					if (arg0 == 6903) {
						anIntArray340[anInt5200++] = Static58.anInt1165;
						return;
					}
					if (arg0 == 6904) {
						anIntArray340[anInt5200++] = Static346.anInt5939;
						return;
					}
					if (arg0 == 6905) {
						local75 = "";
						if (Static8.aClass232_1 != null) {
							if (Static8.aClass232_1.anObject8 == null) {
								local75 = Static380.method5005(Static8.aClass232_1.anInt6401);
							} else {
								local75 = (String) Static8.aClass232_1.anObject8;
							}
						}
						aStringArray33[anInt5193++] = local75;
						return;
					}
					if (arg0 == 6906) {
						anIntArray340[anInt5200++] = Static151.anInt2589;
						return;
					}
					if (arg0 == 6907) {
						anIntArray340[anInt5200++] = Static399.anInt6635;
						return;
					}
					if (arg0 == 6908) {
						anIntArray340[anInt5200++] = Static330.anInt5624;
						return;
					}
					if (arg0 == 6909) {
						anIntArray340[anInt5200++] = Static79.aBoolean166 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray340[anInt5200++] = Static93.anInt1674;
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!nc;I)V")
	private static void method4071(@OriginalArg(0) Class1_Sub5_Sub14 arg0, @OriginalArg(1) int arg1) {
		anInt5200 = 0;
		anInt5193 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray303;
		@Pc(11) int[] local11 = arg0.anIntArray304;
		@Pc(13) byte local13 = -1;
		anInt5195 = 0;
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
						method4079(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method4070(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray340[anInt5200++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray340[anInt5200++] = Static320.aClass249_2.anIntArray473[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static320.aClass249_2.method5600(local54, anIntArray340[--anInt5200]);
					} else if (local31 == 3) {
						aStringArray33[anInt5193++] = arg0.aStringArray28[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt5200 -= 2;
						if (anIntArray340[anInt5200] != anIntArray340[anInt5200 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt5200 -= 2;
						if (anIntArray340[anInt5200] == anIntArray340[anInt5200 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt5200 -= 2;
						if (anIntArray340[anInt5200] < anIntArray340[anInt5200 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt5200 -= 2;
						if (anIntArray340[anInt5200] > anIntArray340[anInt5200 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt5195 == 0) {
							return;
						}
						@Pc(216) Class148 local216 = aClass148Array1[--anInt5195];
						arg0 = local216.aClass1_Sub5_Sub14_1;
						local8 = arg0.anIntArray303;
						local11 = arg0.anIntArray304;
						local5 = local216.anInt4392;
						anIntArray341 = local216.anIntArray290;
						aStringArray32 = local216.aStringArray22;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray340[anInt5200++] = Static320.aClass249_2.method5594(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static320.aClass249_2.method5603(local54, anIntArray340[--anInt5200]);
					} else if (local31 == 31) {
						anInt5200 -= 2;
						if (anIntArray340[anInt5200] <= anIntArray340[anInt5200 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt5200 -= 2;
						if (anIntArray340[anInt5200] >= anIntArray340[anInt5200 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray340[anInt5200++] = anIntArray341[local11[local5]];
					} else if (local31 == 34) {
						anIntArray341[local11[local5]] = anIntArray340[--anInt5200];
					} else if (local31 == 35) {
						aStringArray33[anInt5193++] = aStringArray32[local11[local5]];
					} else if (local31 == 36) {
						aStringArray32[local11[local5]] = aStringArray33[--anInt5193];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt5193 -= local54;
						@Pc(400) String local400 = Static155.method2275(local54, aStringArray33, anInt5193);
						aStringArray33[anInt5193++] = local400;
					} else if (local31 == 38) {
						anInt5200--;
					} else if (local31 == 39) {
						anInt5193--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class1_Sub5_Sub14 local436 = Static403.method5238(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt4769];
							@Pc(450) String[] local450 = new String[local436.anInt4767];
							for (local452 = 0; local452 < local436.anInt4771; local452++) {
								local446[local452] = anIntArray340[anInt5200 + local452 - local436.anInt4771];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt4766; local471++) {
								local450[local471] = aStringArray33[anInt5193 + local471 - local436.anInt4766];
							}
							anInt5200 -= local436.anInt4771;
							anInt5193 -= local436.anInt4766;
							@Pc(502) Class148 local502 = new Class148();
							local502.aClass1_Sub5_Sub14_1 = arg0;
							local502.anInt4392 = local5;
							local502.anIntArray290 = anIntArray341;
							local502.aStringArray22 = aStringArray32;
							if (anInt5195 >= aClass148Array1.length) {
								throw new RuntimeException();
							}
							aClass148Array1[anInt5195++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray303;
							local11 = local436.anIntArray304;
							local5 = -1;
							anIntArray341 = local446;
							aStringArray32 = local450;
						} else if (local31 == 42) {
							anIntArray340[anInt5200++] = Static352.anIntArray414[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static352.anIntArray414[local54] = anIntArray340[--anInt5200];
							Static124.method5693(local54);
							Static433.aBoolean797 |= Static148.aBooleanArray9[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray340[--anInt5200];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray339[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray45[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray340[--anInt5200];
							if (local603 < 0 || local603 >= anIntArray339[local54]) {
								throw new RuntimeException();
							}
							anIntArray340[anInt5200++] = anIntArrayArray45[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt5200 -= 2;
							local603 = anIntArray340[anInt5200];
							if (local603 < 0 || local603 >= anIntArray339[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray45[local54][local603] = anIntArray340[anInt5200 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static11.aStringArray3[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray33[anInt5193++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static11.aStringArray3[local54] = aStringArray33[--anInt5193];
							Static365.method4854(local54);
						} else if (local31 == 51) {
							@Pc(774) Class199 local774 = arg0.aClass199Array1[local11[local5]];
							@Pc(787) Class1_Sub26 local787 = (Class1_Sub26) local774.method4387((long) anIntArray340[--anInt5200]);
							if (local787 != null) {
								local5 += local787.anInt3459;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString56 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong230).append(" ");
				for (local603 = anInt5195 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass148Array1[local603].aClass1_Sub5_Sub14_1.aLong230).append(" ");
				}
				local855.append("op: ").append(local13);
				Static55.method972(local837, local855.toString());
			} else {
				Static208.method2938("Clientscript error in: " + arg0.aString56);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString56).append("\n");
				for (local603 = anInt5195 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass148Array1[local603].aClass1_Sub5_Sub14_1.aString56).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static55.method972(local837, local855.toString());
				Static324.method4374(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(IZ)V")
	public static void method4072() {
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
	public static void method4073(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static69.method1137(arg0)) {
			return;
		}
		@Pc(12) Class124[] local12 = Static87.aClass124ArrayArray7[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class124 local19 = local12[local14];
			if (local19.anObjectArray14 != null) {
				@Pc(26) Class1_Sub40 local26 = new Class1_Sub40();
				local26.aClass124_14 = local19;
				local26.anObjectArray36 = local19.anObjectArray14;
				method4082(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
	private static void method4074(@OriginalArg(0) int arg0) {
		@Pc(3) Class124 local3 = Static412.method5315(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class124[] local13 = Static46.aClass124ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class124[] local19 = Static87.aClass124ArrayArray7[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static46.aClass124ArrayArray1[local9] = new Class124[local22];
			Static468.method5039(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static468.method5039(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!un;)V")
	public static void method4076(@OriginalArg(0) Class1_Sub40 arg0) {
		method4082(arg0, 200000);
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "()V")
	public static void method4077() {
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4078(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static154.anInt2601 == 0 && (Static361.aBoolean690 && !Static241.aBoolean491 || Static336.aBoolean652)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static457.aClass119_182.method2673(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static457.aClass119_182.method2673(0).length());
		} else if (local11.startsWith(Static357.aClass119_151.method2673(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static357.aClass119_151.method2673(0).length());
		} else if (local11.startsWith(Static320.aClass119_157.method2673(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static320.aClass119_157.method2673(0).length());
		} else if (local11.startsWith(Static453.aClass119_180.method2673(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static453.aClass119_180.method2673(0).length());
		} else if (local11.startsWith(Static289.aClass119_120.method2673(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static289.aClass119_120.method2673(0).length());
		} else if (local11.startsWith(Static184.aClass119_93.method2673(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static184.aClass119_93.method2673(0).length());
		} else if (local11.startsWith(Static431.aClass119_175.method2673(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static431.aClass119_175.method2673(0).length());
		} else if (local11.startsWith(Static304.aClass119_125.method2673(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static304.aClass119_125.method2673(0).length());
		} else if (local11.startsWith(Static164.aClass119_77.method2673(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static164.aClass119_77.method2673(0).length());
		} else if (local11.startsWith(Static181.aClass119_90.method2673(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static181.aClass119_90.method2673(0).length());
		} else if (local11.startsWith(Static459.aClass119_176.method2673(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static459.aClass119_176.method2673(0).length());
		} else if (local11.startsWith(Static410.aClass119_138.method2673(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static410.aClass119_138.method2673(0).length());
		} else if (Static394.anInt6582 != 0) {
			if (local11.startsWith(Static457.aClass119_182.method2673(Static394.anInt6582))) {
				local13 = 0;
				arg0 = arg0.substring(Static457.aClass119_182.method2673(Static394.anInt6582).length());
			} else if (local11.startsWith(Static357.aClass119_151.method2673(Static394.anInt6582))) {
				local13 = 1;
				arg0 = arg0.substring(Static357.aClass119_151.method2673(Static394.anInt6582).length());
			} else if (local11.startsWith(Static320.aClass119_157.method2673(Static394.anInt6582))) {
				local13 = 2;
				arg0 = arg0.substring(Static320.aClass119_157.method2673(Static394.anInt6582).length());
			} else if (local11.startsWith(Static453.aClass119_180.method2673(Static394.anInt6582))) {
				local13 = 3;
				arg0 = arg0.substring(Static453.aClass119_180.method2673(Static394.anInt6582).length());
			} else if (local11.startsWith(Static289.aClass119_120.method2673(Static394.anInt6582))) {
				local13 = 4;
				arg0 = arg0.substring(Static289.aClass119_120.method2673(Static394.anInt6582).length());
			} else if (local11.startsWith(Static184.aClass119_93.method2673(Static394.anInt6582))) {
				local13 = 5;
				arg0 = arg0.substring(Static184.aClass119_93.method2673(Static394.anInt6582).length());
			} else if (local11.startsWith(Static431.aClass119_175.method2673(Static394.anInt6582))) {
				local13 = 6;
				arg0 = arg0.substring(Static431.aClass119_175.method2673(Static394.anInt6582).length());
			} else if (local11.startsWith(Static304.aClass119_125.method2673(Static394.anInt6582))) {
				local13 = 7;
				arg0 = arg0.substring(Static304.aClass119_125.method2673(Static394.anInt6582).length());
			} else if (local11.startsWith(Static164.aClass119_77.method2673(Static394.anInt6582))) {
				local13 = 8;
				arg0 = arg0.substring(Static164.aClass119_77.method2673(Static394.anInt6582).length());
			} else if (local11.startsWith(Static181.aClass119_90.method2673(Static394.anInt6582))) {
				local13 = 9;
				arg0 = arg0.substring(Static181.aClass119_90.method2673(Static394.anInt6582).length());
			} else if (local11.startsWith(Static459.aClass119_176.method2673(Static394.anInt6582))) {
				local13 = 10;
				arg0 = arg0.substring(Static459.aClass119_176.method2673(Static394.anInt6582).length());
			} else if (local11.startsWith(Static410.aClass119_138.method2673(Static394.anInt6582))) {
				local13 = 11;
				arg0 = arg0.substring(Static410.aClass119_138.method2673(Static394.anInt6582).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static58.aClass119_31.method2673(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static58.aClass119_31.method2673(0).length());
		} else if (local11.startsWith(Static352.aClass119_148.method2673(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static352.aClass119_148.method2673(0).length());
		} else if (local11.startsWith(Static287.aClass119_119.method2673(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static287.aClass119_119.method2673(0).length());
		} else if (local11.startsWith(Static18.aClass119_7.method2673(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static18.aClass119_7.method2673(0).length());
		} else if (local11.startsWith(Static66.aClass119_35.method2673(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static66.aClass119_35.method2673(0).length());
		} else if (Static394.anInt6582 != 0) {
			if (local11.startsWith(Static58.aClass119_31.method2673(Static394.anInt6582))) {
				local451 = 1;
				arg0 = arg0.substring(Static58.aClass119_31.method2673(Static394.anInt6582).length());
			} else if (local11.startsWith(Static352.aClass119_148.method2673(Static394.anInt6582))) {
				local451 = 2;
				arg0 = arg0.substring(Static352.aClass119_148.method2673(Static394.anInt6582).length());
			} else if (local11.startsWith(Static287.aClass119_119.method2673(Static394.anInt6582))) {
				local451 = 3;
				arg0 = arg0.substring(Static287.aClass119_119.method2673(Static394.anInt6582).length());
			} else if (local11.startsWith(Static18.aClass119_7.method2673(Static394.anInt6582))) {
				local451 = 4;
				arg0 = arg0.substring(Static18.aClass119_7.method2673(Static394.anInt6582).length());
			} else if (local11.startsWith(Static66.aClass119_35.method2673(Static394.anInt6582))) {
				local451 = 5;
				arg0 = arg0.substring(Static66.aClass119_35.method2673(Static394.anInt6582).length());
			}
		}
		Static52.method867(Static63.aClass103_55);
		Static18.aClass1_Sub28_Sub1_1.method5398(0);
		@Pc(646) int local646 = Static18.aClass1_Sub28_Sub1_1.anInt6812;
		if (arg1 == 5021) {
			Static18.aClass1_Sub28_Sub1_1.method5398(1);
		} else if (arg1 == 5022) {
			Static18.aClass1_Sub28_Sub1_1.method5398(2);
		} else {
			Static18.aClass1_Sub28_Sub1_1.method5398(0);
		}
		Static18.aClass1_Sub28_Sub1_1.method5398(local13);
		Static18.aClass1_Sub28_Sub1_1.method5398(local451);
		Static207.method4750(arg0, Static18.aClass1_Sub28_Sub1_1);
		Static18.aClass1_Sub28_Sub1_1.method5352(Static18.aClass1_Sub28_Sub1_1.anInt6812 - local646);
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(IZ)V")
	private static void method4079(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class124 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class124 local35;
		@Pc(158) Class124 local158;
		@Pc(210) Class124 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt5200 -= 3;
				local13 = anIntArray340[anInt5200];
				local19 = anIntArray340[anInt5200 + 1];
				local25 = anIntArray340[anInt5200 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static412.method5315(local13);
				if (local35.aClass124Array1 == null) {
					local35.aClass124Array1 = new Class124[local25 + 1];
				}
				if (local35.aClass124Array1.length <= local25) {
					@Pc(54) Class124[] local54 = new Class124[local25 + 1];
					for (local56 = 0; local56 < local35.aClass124Array1.length; local56++) {
						local54[local56] = local35.aClass124Array1[local56];
					}
					local35.aClass124Array1 = local54;
				}
				if (local25 > 0 && local35.aClass124Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class124 local99 = new Class124();
				local99.anInt3417 = local19;
				local99.anInt3344 = local99.anInt3348 = local35.anInt3348;
				local99.anInt3430 = local25;
				local35.aClass124Array1[local25] = local99;
				if (arg1) {
					aClass124_9 = local99;
				} else {
					aClass124_8 = local99;
				}
				Static160.method2323(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass124_9 : aClass124_8;
				if (local137.anInt3430 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static412.method5315(local137.anInt3348);
				local158.aClass124Array1[local137.anInt3430] = null;
				Static160.method2323(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static412.method5315(anIntArray340[--anInt5200]);
				local137.aClass124Array1 = null;
				Static160.method2323(local137);
				return;
			}
			if (arg0 == 200) {
				anInt5200 -= 2;
				local13 = anIntArray340[anInt5200];
				local19 = anIntArray340[anInt5200 + 1];
				local210 = Static334.method4492(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray340[anInt5200++] = 1;
					if (arg1) {
						aClass124_9 = local210;
						return;
					}
					aClass124_8 = local210;
					return;
				}
				anIntArray340[anInt5200++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray340[--anInt5200];
				local158 = Static412.method5315(local13);
				if (local158 != null) {
					anIntArray340[anInt5200++] = 1;
					if (arg1) {
						aClass124_9 = local158;
						return;
					}
					aClass124_8 = local158;
					return;
				}
				anIntArray340[anInt5200++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray340[--anInt5200];
				method4074(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray340[--anInt5200];
				method4080(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt5200 -= 2;
					local13 = anIntArray340[anInt5200];
					local19 = anIntArray340[anInt5200 + 1];
					for (local25 = 0; local25 < Static33.anIntArray32.length; local25++) {
						if (Static33.anIntArray32[local25] == local13) {
							Static447.aClass25_Sub5_Sub1_Sub2_4.aClass173_1.method3907(Static339.aClass215_2, local25, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static157.anIntArray181.length; local353++) {
						if (Static157.anIntArray181[local353] == local13) {
							Static447.aClass25_Sub5_Sub1_Sub2_4.aClass173_1.method3907(Static339.aClass215_2, local353, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt5200 -= 2;
					local13 = anIntArray340[anInt5200];
					local19 = anIntArray340[anInt5200 + 1];
					Static447.aClass25_Sub5_Sub1_Sub2_4.aClass173_1.method3911(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray340[--anInt5200] != 0;
					Static447.aClass25_Sub5_Sub1_Sub2_4.aClass173_1.method3913(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static412.method5315(anIntArray340[--anInt5200]);
					} else {
						local137 = arg1 ? aClass124_9 : aClass124_8;
					}
					if (arg0 == 1100) {
						anInt5200 -= 2;
						local137.anInt3390 = anIntArray340[anInt5200];
						if (local137.anInt3390 > local137.anInt3389 - local137.anInt3376) {
							local137.anInt3390 = local137.anInt3389 - local137.anInt3376;
						}
						if (local137.anInt3390 < 0) {
							local137.anInt3390 = 0;
						}
						local137.anInt3418 = anIntArray340[anInt5200 + 1];
						if (local137.anInt3418 > local137.anInt3415 - local137.anInt3356) {
							local137.anInt3418 = local137.anInt3415 - local137.anInt3356;
						}
						if (local137.anInt3418 < 0) {
							local137.anInt3418 = 0;
						}
						Static160.method2323(local137);
						if (local137.anInt3430 == -1) {
							Static244.method3507(local137.anInt3348);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt3399 = anIntArray340[--anInt5200];
						Static160.method2323(local137);
						if (local137.anInt3430 == -1) {
							Static61.method1293(local137.anInt3348);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean398 = anIntArray340[--anInt5200] == 1;
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt3342 = anIntArray340[--anInt5200];
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt3380 = anIntArray340[--anInt5200];
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray340[--anInt5200];
						if (local137.anInt3350 != local19) {
							local137.anInt3350 = local19;
							Static160.method2323(local137);
						}
						if (local137.anInt3430 == -1) {
							Static366.method4860(local137.anInt3348);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt3360 = anIntArray340[--anInt5200];
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean391 = anIntArray340[--anInt5200] == 1;
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt3401 = 1;
						local137.anInt3422 = anIntArray340[--anInt5200];
						Static160.method2323(local137);
						if (local137.anInt3430 == -1) {
							Static70.method1143(local137.anInt3348);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt5200 -= 6;
						local137.anInt3355 = anIntArray340[anInt5200];
						local137.anInt3369 = anIntArray340[anInt5200 + 1];
						local137.anInt3379 = anIntArray340[anInt5200 + 2];
						local137.anInt3428 = anIntArray340[anInt5200 + 3];
						local137.anInt3372 = anIntArray340[anInt5200 + 4];
						local137.anInt3406 = anIntArray340[anInt5200 + 5];
						Static160.method2323(local137);
						if (local137.anInt3430 == -1) {
							Static102.method1564(local137.anInt3348);
							Static265.method3751(local137.anInt3348);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray340[--anInt5200];
						if (local137.anInt3429 != local19) {
							local137.anInt3429 = local19;
							local137.anInt3358 = 0;
							local137.anInt3359 = 1;
							local137.anInt3365 = 0;
							Static160.method2323(local137);
						}
						if (local137.anInt3430 == -1) {
							Static126.method2006(local137.anInt3348);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean387 = anIntArray340[--anInt5200] == 1;
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray33[--anInt5193];
						if (!local1101.equals(local137.aString42)) {
							local137.aString42 = local1101;
							Static160.method2323(local137);
						}
						if (local137.anInt3430 == -1) {
							Static106.method1700(local137.anInt3348);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt3403 = anIntArray340[--anInt5200];
						Static160.method2323(local137);
						if (local137.anInt3430 == -1) {
							Static311.method4234(local137.anInt3348);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt5200 -= 3;
						local137.anInt3421 = anIntArray340[anInt5200];
						local137.anInt3347 = anIntArray340[anInt5200 + 1];
						local137.anInt3409 = anIntArray340[anInt5200 + 2];
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean392 = anIntArray340[--anInt5200] == 1;
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt3410 = anIntArray340[--anInt5200];
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt3412 = anIntArray340[--anInt5200];
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean388 = anIntArray340[--anInt5200] == 1;
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean389 = anIntArray340[--anInt5200] == 1;
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt5200 -= 2;
						local137.anInt3389 = anIntArray340[anInt5200];
						local137.anInt3415 = anIntArray340[anInt5200 + 1];
						Static160.method2323(local137);
						if (local137.anInt3417 == 0) {
							Static177.method2498(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt5200 -= 2;
						local137.anInt3402 = (short) anIntArray340[anInt5200];
						local137.anInt3354 = (short) anIntArray340[anInt5200 + 1];
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean396 = anIntArray340[--anInt5200] == 1;
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt3406 = anIntArray340[--anInt5200];
						Static160.method2323(local137);
						if (local137.anInt3430 == -1) {
							Static102.method1564(local137.anInt3348);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray340[--anInt5200];
						local137.aBoolean395 = local19 == 1;
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt5200 -= 2;
						local137.anInt3426 = anIntArray340[anInt5200];
						local137.anInt3371 = anIntArray340[anInt5200 + 1];
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt3419 = anIntArray340[--anInt5200];
						Static160.method2323(local137);
						return;
					}
					@Pc(1454) Class106 local1454;
					if (arg0 == 1127) {
						anInt5200 -= 2;
						local19 = anIntArray340[anInt5200];
						local25 = anIntArray340[anInt5200 + 1];
						local1454 = Static65.aClass86_1.method1919(local19);
						if (local25 != local1454.anInt2688) {
							local137.method2777(local19, local25);
							return;
						}
						local137.method2776(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray340[--anInt5200];
						local1488 = aStringArray33[--anInt5193];
						local1454 = Static65.aClass86_1.method1919(local19);
						if (!local1454.aString35.equals(local1488)) {
							local137.method2780(local19, local1488);
							return;
						}
						local137.method2776(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static412.method5315(anIntArray340[--anInt5200]);
							} else {
								local137 = arg1 ? aClass124_9 : aClass124_8;
							}
							local1101 = aStringArray33[--anInt5193];
							@Pc(2369) int[] local2369 = null;
							if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
								local353 = anIntArray340[--anInt5200];
								if (local353 > 0) {
									local2369 = new int[local353];
									while (local353-- > 0) {
										local2369[local353] = anIntArray340[--anInt5200];
									}
								}
								local1101 = local1101.substring(0, local1101.length() - 1);
							}
							@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
							for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
								if (local1101.charAt(local2290 - 1) == 's') {
									local2421[local2290] = aStringArray33[--anInt5193];
								} else {
									local2421[local2290] = Integer.valueOf(anIntArray340[--anInt5200]);
								}
							}
							local56 = anIntArray340[--anInt5200];
							if (local56 == -1) {
								local2421 = null;
							} else {
								local2421[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray34 = local2421;
							} else if (arg0 == 1401) {
								local137.anObjectArray31 = local2421;
							} else if (arg0 == 1402) {
								local137.anObjectArray26 = local2421;
							} else if (arg0 == 1403) {
								local137.anObjectArray22 = local2421;
							} else if (arg0 == 1404) {
								local137.anObjectArray8 = local2421;
							} else if (arg0 == 1405) {
								local137.anObjectArray30 = local2421;
							} else if (arg0 == 1406) {
								local137.anObjectArray32 = local2421;
							} else if (arg0 == 1407) {
								local137.anObjectArray25 = local2421;
								local137.anIntArray217 = local2369;
							} else if (arg0 == 1408) {
								local137.anObjectArray20 = local2421;
							} else if (arg0 == 1409) {
								local137.anObjectArray28 = local2421;
							} else if (arg0 == 1410) {
								local137.anObjectArray13 = local2421;
							} else if (arg0 == 1411) {
								local137.anObjectArray12 = local2421;
							} else if (arg0 == 1412) {
								local137.anObjectArray23 = local2421;
							} else if (arg0 == 1414) {
								local137.anObjectArray4 = local2421;
								local137.anIntArray212 = local2369;
							} else if (arg0 == 1415) {
								local137.anObjectArray6 = local2421;
								local137.anIntArray214 = local2369;
							} else if (arg0 == 1416) {
								local137.anObjectArray11 = local2421;
							} else if (arg0 == 1417) {
								local137.anObjectArray21 = local2421;
							} else if (arg0 == 1418) {
								local137.anObjectArray24 = local2421;
							} else if (arg0 == 1419) {
								local137.anObjectArray7 = local2421;
							} else if (arg0 == 1420) {
								local137.anObjectArray18 = local2421;
							} else if (arg0 == 1421) {
								local137.anObjectArray27 = local2421;
							} else if (arg0 == 1422) {
								local137.anObjectArray9 = local2421;
							} else if (arg0 == 1423) {
								local137.anObjectArray16 = local2421;
							} else if (arg0 == 1424) {
								local137.anObjectArray10 = local2421;
							} else if (arg0 == 1425) {
								local137.anObjectArray29 = local2421;
							} else if (arg0 == 1426) {
								local137.anObjectArray15 = local2421;
							} else if (arg0 == 1427) {
								local137.anObjectArray5 = local2421;
							} else if (arg0 == 1428) {
								local137.anObjectArray33 = local2421;
								local137.anIntArray213 = local2369;
							} else if (arg0 == 1429) {
								local137.anObjectArray19 = local2421;
								local137.anIntArray209 = local2369;
							} else if (arg0 == 1430) {
								local137.anObjectArray17 = local2421;
							}
							local137.aBoolean393 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass124_9 : aClass124_8;
							if (arg0 == 1500) {
								anIntArray340[anInt5200++] = local137.anInt3370;
								return;
							}
							if (arg0 == 1501) {
								anIntArray340[anInt5200++] = local137.anInt3414;
								return;
							}
							if (arg0 == 1502) {
								anIntArray340[anInt5200++] = local137.anInt3376;
								return;
							}
							if (arg0 == 1503) {
								anIntArray340[anInt5200++] = local137.anInt3356;
								return;
							}
							if (arg0 == 1504) {
								anIntArray340[anInt5200++] = local137.aBoolean399 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray340[anInt5200++] = local137.anInt3344;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static365.method4856(local137);
								anIntArray340[anInt5200++] = local158 == null ? -1 : local158.anInt3348;
								return;
							}
						} else {
							@Pc(3017) Class106 local3017;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass124_9 : aClass124_8;
								if (arg0 == 1600) {
									anIntArray340[anInt5200++] = local137.anInt3390;
									return;
								}
								if (arg0 == 1601) {
									anIntArray340[anInt5200++] = local137.anInt3418;
									return;
								}
								if (arg0 == 1602) {
									aStringArray33[anInt5193++] = local137.aString42;
									return;
								}
								if (arg0 == 1603) {
									anIntArray340[anInt5200++] = local137.anInt3389;
									return;
								}
								if (arg0 == 1604) {
									anIntArray340[anInt5200++] = local137.anInt3415;
									return;
								}
								if (arg0 == 1605) {
									anIntArray340[anInt5200++] = local137.anInt3406;
									return;
								}
								if (arg0 == 1606) {
									anIntArray340[anInt5200++] = local137.anInt3379;
									return;
								}
								if (arg0 == 1607) {
									anIntArray340[anInt5200++] = local137.anInt3372;
									return;
								}
								if (arg0 == 1608) {
									anIntArray340[anInt5200++] = local137.anInt3428;
									return;
								}
								if (arg0 == 1609) {
									anIntArray340[anInt5200++] = local137.anInt3342;
									return;
								}
								if (arg0 == 1610) {
									anIntArray340[anInt5200++] = local137.anInt3355;
									return;
								}
								if (arg0 == 1611) {
									anIntArray340[anInt5200++] = local137.anInt3369;
									return;
								}
								if (arg0 == 1612) {
									anIntArray340[anInt5200++] = local137.anInt3350;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray340[--anInt5200];
									local3017 = Static65.aClass86_1.method1919(local19);
									if (local3017.method2333()) {
										aStringArray33[anInt5193++] = local137.method2774(local3017.aString35, local19);
									} else {
										anIntArray340[anInt5200++] = local137.method2789(local19, local3017.anInt2688);
									}
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass124_9 : aClass124_8;
								if (arg0 == 1700) {
									anIntArray340[anInt5200++] = local137.anInt3405;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt3405 != -1) {
										anIntArray340[anInt5200++] = local137.anInt3351;
										return;
									}
									anIntArray340[anInt5200++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray340[anInt5200++] = local137.anInt3430;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass124_9 : aClass124_8;
								if (arg0 == 1800) {
									anIntArray340[anInt5200++] = Static55.method970(local137).method2820();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray340[--anInt5200];
									local19--;
									if (local137.aStringArray17 != null && local19 < local137.aStringArray17.length && local137.aStringArray17[local19] != null) {
										aStringArray33[anInt5193++] = local137.aStringArray17[local19];
										return;
									}
									aStringArray33[anInt5193++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString43 == null) {
										aStringArray33[anInt5193++] = "";
										return;
									}
									aStringArray33[anInt5193++] = local137.aString43;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static412.method5315(anIntArray340[--anInt5200]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass124_9 : aClass124_8;
								}
								if (anInt5203 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray5 == null) {
										return;
									}
									@Pc(3254) Class1_Sub40 local3254 = new Class1_Sub40();
									local3254.aClass124_14 = local137;
									local3254.anObjectArray36 = local137.anObjectArray5;
									local3254.anInt6787 = anInt5203 + 1;
									Static254.aClass227_28.method4972(local3254);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static412.method5315(anIntArray340[--anInt5200]);
								if (arg0 == 2500) {
									anIntArray340[anInt5200++] = local137.anInt3370;
									return;
								}
								if (arg0 == 2501) {
									anIntArray340[anInt5200++] = local137.anInt3414;
									return;
								}
								if (arg0 == 2502) {
									anIntArray340[anInt5200++] = local137.anInt3376;
									return;
								}
								if (arg0 == 2503) {
									anIntArray340[anInt5200++] = local137.anInt3356;
									return;
								}
								if (arg0 == 2504) {
									anIntArray340[anInt5200++] = local137.aBoolean399 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray340[anInt5200++] = local137.anInt3344;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static365.method4856(local137);
									anIntArray340[anInt5200++] = local158 == null ? -1 : local158.anInt3348;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static412.method5315(anIntArray340[--anInt5200]);
								if (arg0 == 2600) {
									anIntArray340[anInt5200++] = local137.anInt3390;
									return;
								}
								if (arg0 == 2601) {
									anIntArray340[anInt5200++] = local137.anInt3418;
									return;
								}
								if (arg0 == 2602) {
									aStringArray33[anInt5193++] = local137.aString42;
									return;
								}
								if (arg0 == 2603) {
									anIntArray340[anInt5200++] = local137.anInt3389;
									return;
								}
								if (arg0 == 2604) {
									anIntArray340[anInt5200++] = local137.anInt3415;
									return;
								}
								if (arg0 == 2605) {
									anIntArray340[anInt5200++] = local137.anInt3406;
									return;
								}
								if (arg0 == 2606) {
									anIntArray340[anInt5200++] = local137.anInt3379;
									return;
								}
								if (arg0 == 2607) {
									anIntArray340[anInt5200++] = local137.anInt3372;
									return;
								}
								if (arg0 == 2608) {
									anIntArray340[anInt5200++] = local137.anInt3428;
									return;
								}
								if (arg0 == 2609) {
									anIntArray340[anInt5200++] = local137.anInt3342;
									return;
								}
								if (arg0 == 2610) {
									anIntArray340[anInt5200++] = local137.anInt3355;
									return;
								}
								if (arg0 == 2611) {
									anIntArray340[anInt5200++] = local137.anInt3369;
									return;
								}
								if (arg0 == 2612) {
									anIntArray340[anInt5200++] = local137.anInt3350;
									return;
								}
							} else {
								@Pc(3751) Class1_Sub14 local3751;
								@Pc(3649) Class1_Sub14 local3649;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static412.method5315(anIntArray340[--anInt5200]);
										anIntArray340[anInt5200++] = local137.anInt3405;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static412.method5315(anIntArray340[--anInt5200]);
										if (local137.anInt3405 != -1) {
											anIntArray340[anInt5200++] = local137.anInt3351;
											return;
										}
										anIntArray340[anInt5200++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray340[--anInt5200];
										local3649 = (Class1_Sub14) Static94.aClass199_54.method4387((long) local13);
										if (local3649 != null) {
											anIntArray340[anInt5200++] = 1;
											return;
										}
										anIntArray340[anInt5200++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static412.method5315(anIntArray340[--anInt5200]);
										if (local137.aClass124Array1 == null) {
											anIntArray340[anInt5200++] = 0;
											return;
										}
										local19 = local137.aClass124Array1.length;
										for (local25 = 0; local25 < local137.aClass124Array1.length; local25++) {
											if (local137.aClass124Array1[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray340[anInt5200++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt5200 -= 2;
										local13 = anIntArray340[anInt5200];
										local19 = anIntArray340[anInt5200 + 1];
										local3751 = (Class1_Sub14) Static94.aClass199_54.method4387((long) local13);
										if (local3751 != null && local3751.anInt1425 == local19) {
											anIntArray340[anInt5200++] = 1;
											return;
										}
										anIntArray340[anInt5200++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static412.method5315(anIntArray340[--anInt5200]);
									if (arg0 == 2800) {
										anIntArray340[anInt5200++] = Static55.method970(local137).method2820();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray340[--anInt5200];
										local19--;
										if (local137.aStringArray17 != null && local19 < local137.aStringArray17.length && local137.aStringArray17[local19] != null) {
											aStringArray33[anInt5193++] = local137.aStringArray17[local19];
											return;
										}
										aStringArray33[anInt5193++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString43 == null) {
											aStringArray33[anInt5193++] = "";
											return;
										}
										aStringArray33[anInt5193++] = local137.aString43;
										return;
									}
								} else {
									@Pc(3888) String local3888;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local3888 = aStringArray33[--anInt5193];
											Static208.method2938(local3888);
											return;
										}
										if (arg0 == 3101) {
											anInt5200 -= 2;
											Static272.method3805(anIntArray340[anInt5200 + 1], anIntArray340[anInt5200], Static447.aClass25_Sub5_Sub1_Sub2_4);
											return;
										}
										if (arg0 == 3103) {
											Static250.method3551();
											return;
										}
										if (arg0 == 3104) {
											local3888 = aStringArray33[--anInt5193];
											local19 = 0;
											if (Static48.method797(local3888)) {
												local19 = Static219.method3201(local3888);
											}
											Static52.method867(Static36.aClass103_231);
											Static18.aClass1_Sub28_Sub1_1.method5347(local19);
											return;
										}
										if (arg0 == 3105) {
											local3888 = aStringArray33[--anInt5193];
											Static52.method867(Static82.aClass103_258);
											Static18.aClass1_Sub28_Sub1_1.method5398(local3888.length() + 1);
											Static18.aClass1_Sub28_Sub1_1.method5364(local3888);
											return;
										}
										if (arg0 == 3106) {
											local3888 = aStringArray33[--anInt5193];
											Static52.method867(Static50.aClass103_39);
											Static18.aClass1_Sub28_Sub1_1.method5398(local3888.length() + 1);
											Static18.aClass1_Sub28_Sub1_1.method5364(local3888);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray340[--anInt5200];
											local1101 = aStringArray33[--anInt5193];
											Static338.method4536(local13, local1101);
											return;
										}
										if (arg0 == 3108) {
											anInt5200 -= 3;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											local25 = anIntArray340[anInt5200 + 2];
											local35 = Static412.method5315(local25);
											Static427.method5661(local19, local35, local13);
											return;
										}
										if (arg0 == 3109) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											local210 = arg1 ? aClass124_9 : aClass124_8;
											Static427.method5661(local19, local210, local13);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray340[--anInt5200];
											Static52.method867(Class25_Sub5_Sub2.lb);
											Static18.aClass1_Sub28_Sub1_1.method5393(local13);
											return;
										}
										if (arg0 == 3111) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											local3751 = (Class1_Sub14) Static94.aClass199_54.method4387((long) local13);
											if (local3751 != null) {
												Static452.method5911(true, local3751.anInt1425 != local19, local3751);
											}
											Static33.method428(local19, 3, true, local13);
											return;
										}
										if (arg0 == 3112) {
											anInt5200--;
											local13 = anIntArray340[anInt5200];
											local3649 = (Class1_Sub14) Static94.aClass199_54.method4387((long) local13);
											if (local3649 != null && local3649.anInt1427 == 3) {
												Static452.method5911(true, true, local3649);
											}
											return;
										}
										if (arg0 == 3113) {
											Static141.method3877(aStringArray33[--anInt5193]);
											return;
										}
										if (arg0 == 3114) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											local1488 = aStringArray33[--anInt5193];
											Static90.method1430(local1488, "", local13, "", local19);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt5200 -= 3;
											Static426.method5635(255, anIntArray340[anInt5200 + 1], anIntArray340[anInt5200 + 2], anIntArray340[anInt5200]);
											return;
										}
										if (arg0 == 3201) {
											Static217.method3178(anIntArray340[--anInt5200], 255, 50);
											return;
										}
										if (arg0 == 3202) {
											anInt5200 -= 2;
											Static263.method3725(anIntArray340[anInt5200 + 1], 255, anIntArray340[anInt5200]);
											return;
										}
										if (arg0 == 3203) {
											anInt5200 -= 4;
											Static426.method5635(anIntArray340[anInt5200 + 3], anIntArray340[anInt5200 + 1], anIntArray340[anInt5200 + 2], anIntArray340[anInt5200]);
											return;
										}
										if (arg0 == 3204) {
											anInt5200 -= 3;
											Static217.method3178(anIntArray340[anInt5200], anIntArray340[anInt5200 + 1], anIntArray340[anInt5200 + 2]);
											return;
										}
										if (arg0 == 3205) {
											anInt5200 -= 3;
											Static263.method3725(anIntArray340[anInt5200 + 1], anIntArray340[anInt5200 + 2], anIntArray340[anInt5200]);
											return;
										}
										if (arg0 == 3206) {
											anInt5200 -= 4;
											Static152.method2249(anIntArray340[anInt5200], anIntArray340[anInt5200 + 2], anIntArray340[anInt5200 + 3], anIntArray340[anInt5200 + 1]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray340[anInt5200++] = Static236.anInt4213;
											return;
										}
										if (arg0 == 3301) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = Static401.method5219(false, local13, local19);
											return;
										}
										if (arg0 == 3302) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = Static59.method1037(local13, local19, false);
											return;
										}
										if (arg0 == 3303) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = Static240.method5207(local13, local19, false);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static8.aClass132_1.method2939(local13).anInt2045;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static132.anIntArray158[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static53.anIntArray48[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static411.anIntArray455[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4605) byte local4605 = Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94;
											local19 = (Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518 >> 7) + Static199.anInt3480;
											local25 = (Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514 >> 7) + Static164.anInt2731;
											anIntArray340[anInt5200++] = (local4605 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray340[anInt5200++] = Static337.aBoolean654 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = Static401.method5219(true, local13, local19);
											return;
										}
										if (arg0 == 3314) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = Static59.method1037(local13, local19, true);
											return;
										}
										if (arg0 == 3315) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = Static240.method5207(local13, local19, true);
											return;
										}
										if (arg0 == 3316) {
											if (Static154.anInt2601 >= 2) {
												anIntArray340[anInt5200++] = Static154.anInt2601;
												return;
											}
											anIntArray340[anInt5200++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray340[anInt5200++] = Static338.anInt5778;
											return;
										}
										if (arg0 == 3318) {
											anIntArray340[anInt5200++] = Static259.aClass156_4.anInt4501;
											return;
										}
										if (arg0 == 3321) {
											anIntArray340[anInt5200++] = Static253.anInt4601;
											return;
										}
										if (arg0 == 3322) {
											anIntArray340[anInt5200++] = Static376.anInt6336;
											return;
										}
										if (arg0 == 3323) {
											if (Static63.anInt1205 >= 5 && Static63.anInt1205 <= 9) {
												anIntArray340[anInt5200++] = 1;
												return;
											}
											anIntArray340[anInt5200++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static63.anInt1205 >= 5 && Static63.anInt1205 <= 9) {
												anIntArray340[anInt5200++] = Static63.anInt1205;
												return;
											}
											anIntArray340[anInt5200++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray340[anInt5200++] = Static334.aBoolean649 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray340[anInt5200++] = Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4324;
											return;
										}
										if (arg0 == 3327) {
											anIntArray340[anInt5200++] = Static447.aClass25_Sub5_Sub1_Sub2_4.aClass173_1.aBoolean564 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray340[anInt5200++] = Static336.aBoolean652 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static126.method2009(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = Static199.method2831(local13, local19, false);
											return;
										}
										if (arg0 == 3332) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = Static199.method2831(local13, local19, true);
											return;
										}
										if (arg0 == 3333) {
											anIntArray340[anInt5200++] = Static333.anInt5694;
											return;
										}
										if (arg0 == 3335) {
											anIntArray340[anInt5200++] = Static394.anInt6582;
											return;
										}
										if (arg0 == 3336) {
											anInt5200 -= 4;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											local25 = anIntArray340[anInt5200 + 2];
											local353 = anIntArray340[anInt5200 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray340[anInt5200++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray340[anInt5200++] = Static83.anInt1575;
											return;
										}
										if (arg0 == 3338) {
											anIntArray340[anInt5200++] = Static380.method5015();
											return;
										}
										if (arg0 == 3339) {
											anIntArray340[anInt5200++] = Static13.aBoolean28 ? 1 : 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray340[anInt5200++] = Static138.aBoolean285 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray340[anInt5200++] = Static241.aBoolean492 ? 1 : 0;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5261) Class144 local5261;
										if (arg0 == 3400) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											local5261 = Static18.aClass40_1.method983(local13);
											aStringArray33[anInt5193++] = local5261.method3278(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt5200 -= 4;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											local25 = anIntArray340[anInt5200 + 2];
											local353 = anIntArray340[anInt5200 + 3];
											@Pc(5307) Class144 local5307 = Static18.aClass40_1.method983(local25);
											if (local5307.aChar4 == local13 && local5307.aChar3 == local19) {
												if (local19 == 115) {
													aStringArray33[anInt5193++] = local5307.method3278(local353);
													return;
												}
												anIntArray340[anInt5200++] = local5307.method3277(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt5200 -= 3;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											local25 = anIntArray340[anInt5200 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5383) Class144 local5383 = Static18.aClass40_1.method983(local19);
											if (local5383.aChar3 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray340[anInt5200++] = local5383.method3282(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray340[--anInt5200];
											local1101 = aStringArray33[--anInt5193];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5261 = Static18.aClass40_1.method983(local13);
											if (local5261.aChar3 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray340[anInt5200++] = local5261.method3283(local1101) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray340[--anInt5200];
											@Pc(5481) Class144 local5481 = Static18.aClass40_1.method983(local13);
											anIntArray340[anInt5200++] = local5481.aClass199_117.method4390();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static240.anInt6654 == 0) {
												anIntArray340[anInt5200++] = -2;
												return;
											}
											if (Static240.anInt6654 == 1) {
												anIntArray340[anInt5200++] = -1;
												return;
											}
											anIntArray340[anInt5200++] = Static107.anInt2042;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray340[--anInt5200];
											if (Static240.anInt6654 == 2 && local13 < Static107.anInt2042) {
												aStringArray33[anInt5193++] = Static320.aStringArray44[local13];
												if (Static355.aStringArray41[local13] != null) {
													aStringArray33[anInt5193++] = Static355.aStringArray41[local13];
													return;
												}
												aStringArray33[anInt5193++] = "";
												return;
											}
											aStringArray33[anInt5193++] = "";
											aStringArray33[anInt5193++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray340[--anInt5200];
											if (Static240.anInt6654 == 2 && local13 < Static107.anInt2042) {
												anIntArray340[anInt5200++] = Static434.anIntArray492[local13];
												return;
											}
											anIntArray340[anInt5200++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray340[--anInt5200];
											if (Static240.anInt6654 == 2 && local13 < Static107.anInt2042) {
												anIntArray340[anInt5200++] = Static71.anIntArray63[local13];
												return;
											}
											anIntArray340[anInt5200++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local3888 = aStringArray33[--anInt5193];
											local19 = anIntArray340[--anInt5200];
											Static158.method1895(local3888, local19);
											return;
										}
										if (arg0 == 3605) {
											local3888 = aStringArray33[--anInt5193];
											Static288.method3958(local3888);
											return;
										}
										if (arg0 == 3606) {
											local3888 = aStringArray33[--anInt5193];
											Static399.method5202(local3888);
											return;
										}
										if (arg0 == 3607) {
											local3888 = aStringArray33[--anInt5193];
											Static239.method4559(false, local3888);
											return;
										}
										if (arg0 == 3608) {
											local3888 = aStringArray33[--anInt5193];
											Static188.method2692(local3888);
											return;
										}
										if (arg0 == 3609) {
											local3888 = aStringArray33[--anInt5193];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray340[anInt5200++] = Static378.method2425(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray340[--anInt5200];
											if (Static240.anInt6654 == 2 && local13 < Static107.anInt2042) {
												aStringArray33[anInt5193++] = Static3.aStringArray39[local13];
												return;
											}
											aStringArray33[anInt5193++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static192.aString39 != null) {
												aStringArray33[anInt5193++] = Static10.method140(Static192.aString39);
												return;
											}
											aStringArray33[anInt5193++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static192.aString39 != null) {
												anIntArray340[anInt5200++] = Static258.anInt7124;
												return;
											}
											anIntArray340[anInt5200++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray340[--anInt5200];
											if (Static192.aString39 != null && local13 < Static258.anInt7124) {
												aStringArray33[anInt5193++] = Static400.aClass16Array1[local13].aString4;
												return;
											}
											aStringArray33[anInt5193++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray340[--anInt5200];
											if (Static192.aString39 != null && local13 < Static258.anInt7124) {
												anIntArray340[anInt5200++] = Static400.aClass16Array1[local13].anInt414;
												return;
											}
											anIntArray340[anInt5200++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray340[--anInt5200];
											if (Static192.aString39 != null && local13 < Static258.anInt7124) {
												anIntArray340[anInt5200++] = Static400.aClass16Array1[local13].aByte3;
												return;
											}
											anIntArray340[anInt5200++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray340[anInt5200++] = Static24.aByte4;
											return;
										}
										if (arg0 == 3617) {
											local3888 = aStringArray33[--anInt5193];
											Static351.method4747(local3888);
											return;
										}
										if (arg0 == 3618) {
											anIntArray340[anInt5200++] = Static384.aByte100;
											return;
										}
										if (arg0 == 3619) {
											local3888 = aStringArray33[--anInt5193];
											Static429.method5671(local3888);
											return;
										}
										if (arg0 == 3620) {
											Static450.method5885();
											return;
										}
										if (arg0 == 3621) {
											if (Static240.anInt6654 == 0) {
												anIntArray340[anInt5200++] = -1;
												return;
											}
											anIntArray340[anInt5200++] = Static446.anInt7396;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray340[--anInt5200];
											if (Static240.anInt6654 != 0 && local13 < Static446.anInt7396) {
												aStringArray33[anInt5193++] = Static264.aStringArray29[local13];
												if (Static80.aStringArray10[local13] != null) {
													aStringArray33[anInt5193++] = Static80.aStringArray10[local13];
													return;
												}
												aStringArray33[anInt5193++] = "";
												return;
											}
											aStringArray33[anInt5193++] = "";
											aStringArray33[anInt5193++] = "";
											return;
										}
										if (arg0 == 3623) {
											local3888 = aStringArray33[--anInt5193];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray340[anInt5200++] = Static406.method5265(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray340[--anInt5200];
											if (Static400.aClass16Array1 != null && local13 < Static258.anInt7124 && Static400.aClass16Array1[local13].aString5.equalsIgnoreCase(Static447.aClass25_Sub5_Sub1_Sub2_4.aString51)) {
												anIntArray340[anInt5200++] = 1;
												return;
											}
											anIntArray340[anInt5200++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static199.aString45 != null) {
												aStringArray33[anInt5193++] = Static199.aString45;
												return;
											}
											aStringArray33[anInt5193++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray340[--anInt5200];
											if (Static192.aString39 != null && local13 < Static258.anInt7124) {
												aStringArray33[anInt5193++] = Static400.aClass16Array1[local13].aString3;
												return;
											}
											aStringArray33[anInt5193++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray340[--anInt5200];
											if (Static240.anInt6654 == 2 && local13 >= 0 && local13 < Static107.anInt2042) {
												anIntArray340[anInt5200++] = Static64.aBooleanArray3[local13] ? 1 : 0;
												return;
											}
											anIntArray340[anInt5200++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local3888 = aStringArray33[--anInt5193];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray340[anInt5200++] = Static38.method568(local3888);
											return;
										}
										if (arg0 == 3629) {
											anIntArray340[anInt5200++] = Static414.anInt6794;
											return;
										}
										if (arg0 == 3630) {
											local3888 = aStringArray33[--anInt5193];
											Static239.method4559(true, local3888);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static294.aBooleanArray17[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray340[--anInt5200];
											if (Static192.aString39 != null && local13 < Static258.anInt7124) {
												aStringArray33[anInt5193++] = Static400.aClass16Array1[local13].aString5;
												return;
											}
											aStringArray33[anInt5193++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray340[--anInt5200];
											if (Static240.anInt6654 != 0 && local13 < Static446.anInt7396) {
												aStringArray33[anInt5193++] = Static131.aStringArray13[local13];
												return;
											}
											aStringArray33[anInt5193++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static205.aClass179Array1[local13].method3968();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static205.aClass179Array1[local13].anInt5065;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static205.aClass179Array1[local13].anInt5066;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static205.aClass179Array1[local13].anInt5067;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static205.aClass179Array1[local13].anInt5068;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static205.aClass179Array1[local13].anInt5064;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray340[--anInt5200];
											local19 = Static205.aClass179Array1[local13].method3971();
											anIntArray340[anInt5200++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray340[--anInt5200];
											local19 = Static205.aClass179Array1[local13].method3971();
											anIntArray340[anInt5200++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray340[--anInt5200];
											local19 = Static205.aClass179Array1[local13].method3971();
											anIntArray340[anInt5200++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray340[--anInt5200];
											local19 = Static205.aClass179Array1[local13].method3971();
											anIntArray340[anInt5200++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt5200 -= 5;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											local25 = anIntArray340[anInt5200 + 2];
											local353 = anIntArray340[anInt5200 + 3];
											local2290 = anIntArray340[anInt5200 + 4];
											anIntArray340[anInt5200++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
											return;
										}
										@Pc(6991) long local6991;
										@Pc(6984) long local6984;
										if (arg0 == 4007) {
											anInt5200 -= 2;
											local6984 = anIntArray340[anInt5200];
											local6991 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = (int) (local6984 + local6984 * local6991 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											if (local13 == 0) {
												anIntArray340[anInt5200++] = 0;
												return;
											}
											anIntArray340[anInt5200++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											if (local13 == 0) {
												anIntArray340[anInt5200++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray340[anInt5200++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray340[anInt5200++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt5200 -= 3;
											local6984 = anIntArray340[anInt5200];
											local6991 = anIntArray340[anInt5200 + 1];
											@Pc(7372) long local7372 = (long) anIntArray340[anInt5200 + 2];
											anIntArray340[anInt5200++] = (int) (local6984 * local7372 / local6991);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local3888 = aStringArray33[--anInt5193];
											local19 = anIntArray340[--anInt5200];
											aStringArray33[anInt5193++] = local3888 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt5193 -= 2;
											local3888 = aStringArray33[anInt5193];
											local1101 = aStringArray33[anInt5193 + 1];
											aStringArray33[anInt5193++] = local3888 + local1101;
											return;
										}
										if (arg0 == 4102) {
											local3888 = aStringArray33[--anInt5193];
											local19 = anIntArray340[--anInt5200];
											aStringArray33[anInt5193++] = local3888 + Static335.method4500(local19);
											return;
										}
										if (arg0 == 4103) {
											local3888 = aStringArray33[--anInt5193];
											aStringArray33[anInt5193++] = local3888.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray33[anInt5193++] = method4081(anIntArray340[--anInt5200]);
											return;
										}
										if (arg0 == 4105) {
											anInt5193 -= 2;
											local3888 = aStringArray33[anInt5193];
											local1101 = aStringArray33[anInt5193 + 1];
											if (Static447.aClass25_Sub5_Sub1_Sub2_4.aClass173_1 != null && Static447.aClass25_Sub5_Sub1_Sub2_4.aClass173_1.aBoolean564) {
												aStringArray33[anInt5193++] = local1101;
												return;
											}
											aStringArray33[anInt5193++] = local3888;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray340[--anInt5200];
											aStringArray33[anInt5193++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt5193 -= 2;
											anIntArray340[anInt5200++] = Static293.method4020(aStringArray33[anInt5193], aStringArray33[anInt5193 + 1], Static394.anInt6582);
											return;
										}
										@Pc(7655) Class89 local7655;
										if (arg0 == 4108) {
											local3888 = aStringArray33[--anInt5193];
											anInt5200 -= 2;
											local19 = anIntArray340[anInt5200];
											local25 = anIntArray340[anInt5200 + 1];
											local7655 = Static341.method4571(local25, Static332.aClass82_76);
											anIntArray340[anInt5200++] = local7655.method1985(local3888, Static352.aClass6Array11, local19);
											return;
										}
										if (arg0 == 4109) {
											local3888 = aStringArray33[--anInt5193];
											anInt5200 -= 2;
											local19 = anIntArray340[anInt5200];
											local25 = anIntArray340[anInt5200 + 1];
											local7655 = Static341.method4571(local25, Static332.aClass82_76);
											anIntArray340[anInt5200++] = local7655.method1997(local3888, local19, Static352.aClass6Array11);
											return;
										}
										if (arg0 == 4110) {
											anInt5193 -= 2;
											local3888 = aStringArray33[anInt5193];
											local1101 = aStringArray33[anInt5193 + 1];
											if (anIntArray340[--anInt5200] == 1) {
												aStringArray33[anInt5193++] = local3888;
												return;
											}
											aStringArray33[anInt5193++] = local1101;
											return;
										}
										if (arg0 == 4111) {
											local3888 = aStringArray33[--anInt5193];
											aStringArray33[anInt5193++] = Static328.method4413(local3888);
											return;
										}
										if (arg0 == 4112) {
											local3888 = aStringArray33[--anInt5193];
											local19 = anIntArray340[--anInt5200];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray33[anInt5193++] = local3888 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static227.method3271((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static257.method3680((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static97.method1506((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static249.method3549((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local3888 = aStringArray33[--anInt5193];
											if (local3888 != null) {
												anIntArray340[anInt5200++] = local3888.length();
												return;
											}
											anIntArray340[anInt5200++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local3888 = aStringArray33[--anInt5193];
											anInt5200 -= 2;
											local19 = anIntArray340[anInt5200];
											local25 = anIntArray340[anInt5200 + 1];
											aStringArray33[anInt5193++] = local3888.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local3888 = aStringArray33[--anInt5193];
											@Pc(8018) StringBuffer local8018 = new StringBuffer(local3888.length());
											@Pc(8020) boolean local8020 = false;
											for (local353 = 0; local353 < local3888.length(); local353++) {
												@Pc(8027) char local8027 = local3888.charAt(local353);
												if (local8027 == '<') {
													local8020 = true;
												} else if (local8027 == '>') {
													local8020 = false;
												} else if (!local8020) {
													local8018.append(local8027);
												}
											}
											aStringArray33[anInt5193++] = local8018.toString();
											return;
										}
										if (arg0 == 4120) {
											local3888 = aStringArray33[--anInt5193];
											anInt5200 -= 2;
											local19 = anIntArray340[anInt5200];
											local25 = anIntArray340[anInt5200 + 1];
											anIntArray340[anInt5200++] = local3888.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt5193 -= 2;
											local3888 = aStringArray33[anInt5193];
											local1101 = aStringArray33[anInt5193 + 1];
											local25 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = local3888.indexOf(local1101, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray340[--anInt5200] != 0;
											local19 = anIntArray340[--anInt5200];
											aStringArray33[anInt5193++] = Static177.method2496((long) local19, local412, 0, Static394.anInt6582);
											return;
										}
										if (arg0 == 4125) {
											local3888 = aStringArray33[--anInt5193];
											local19 = anIntArray340[--anInt5200];
											@Pc(8241) Class89 local8241 = Static341.method4571(local19, Static332.aClass82_76);
											anIntArray340[anInt5200++] = local8241.method1987(local3888, Static352.aClass6Array11);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray340[--anInt5200];
											aStringArray33[anInt5193++] = Static342.aClass155_2.method3548(local13).aString55;
											return;
										}
										@Pc(8303) Class162 local8303;
										if (arg0 == 4201) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											local8303 = Static342.aClass155_2.method3548(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray27[local19 - 1] != null) {
												aStringArray33[anInt5193++] = local8303.aStringArray27[local19 - 1];
												return;
											}
											aStringArray33[anInt5193++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											local8303 = Static342.aClass155_2.method3548(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray26[local19 - 1] != null) {
												aStringArray33[anInt5193++] = local8303.aStringArray26[local19 - 1];
												return;
											}
											aStringArray33[anInt5193++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static342.aClass155_2.method3548(local13).anInt4744;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static342.aClass155_2.method3548(local13).anInt4715 == 1 ? 1 : 0;
											return;
										}
										@Pc(8466) Class162 local8466;
										if (arg0 == 4205) {
											local13 = anIntArray340[--anInt5200];
											local8466 = Static342.aClass155_2.method3548(local13);
											if (local8466.anInt4711 == -1 && local8466.lb >= 0) {
												anIntArray340[anInt5200++] = local8466.lb;
												return;
											}
											anIntArray340[anInt5200++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray340[--anInt5200];
											local8466 = Static342.aClass155_2.method3548(local13);
											if (local8466.anInt4711 >= 0 && local8466.lb >= 0) {
												anIntArray340[anInt5200++] = local8466.lb;
												return;
											}
											anIntArray340[anInt5200++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray340[--anInt5200];
											anIntArray340[anInt5200++] = Static342.aClass155_2.method3548(local13).aBoolean536 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											local3017 = Static65.aClass86_1.method1919(local19);
											if (local3017.method2333()) {
												aStringArray33[anInt5193++] = Static342.aClass155_2.method3548(local13).method3703(local3017.aString35, local19);
												return;
											}
											anIntArray340[anInt5200++] = Static342.aClass155_2.method3548(local13).method3710(local3017.anInt2688, local19);
											return;
										}
										if (arg0 == 4209) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1] - 1;
											local8303 = Static342.aClass155_2.method3548(local13);
											if (local8303.anInt4698 == local19) {
												anIntArray340[anInt5200++] = local8303.anInt4699;
												return;
											}
											if (local8303.anInt4729 == local19) {
												anIntArray340[anInt5200++] = local8303.anInt4749;
												return;
											}
											anIntArray340[anInt5200++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local3888 = aStringArray33[--anInt5193];
											local19 = anIntArray340[--anInt5200];
											Static124.method5697(local19 == 1, local3888);
											anIntArray340[anInt5200++] = Static253.anInt4611;
											return;
										}
										if (arg0 == 4211) {
											if (Static394.aShortArray102 != null && Static401.anInt6678 < Static253.anInt4611) {
												anIntArray340[anInt5200++] = Static394.aShortArray102[Static401.anInt6678++] & 0xFFFF;
												return;
											}
											anIntArray340[anInt5200++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static401.anInt6678 = 0;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											local3017 = Static65.aClass86_1.method1919(local19);
											if (local3017.method2333()) {
												aStringArray33[anInt5193++] = Static161.aClass231_2.method5022(local13).method1157(local19, local3017.aString35);
												return;
											}
											anIntArray340[anInt5200++] = Static161.aClass231_2.method5022(local13).method1152(local3017.anInt2688, local19);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											local3017 = Static65.aClass86_1.method1919(local19);
											if (local3017.method2333()) {
												aStringArray33[anInt5193++] = Static341.aClass75_4.method1616(local13).method1539(local19, local3017.aString35);
												return;
											}
											anIntArray340[anInt5200++] = Static341.aClass75_4.method1616(local13).method1551(local3017.anInt2688, local19);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt5200 -= 2;
											local13 = anIntArray340[anInt5200];
											local19 = anIntArray340[anInt5200 + 1];
											local3017 = Static65.aClass86_1.method1919(local19);
											if (local3017.method2333()) {
												aStringArray33[anInt5193++] = Static271.aClass180_2.method3973(local13).method2093(local19, local3017.aString35);
												return;
											}
											anIntArray340[anInt5200++] = Static271.aClass180_2.method3973(local13).method2094(local3017.anInt2688, local19);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray340[--anInt5200];
										@Pc(8967) Class236 local8967 = Static291.aClass21_1.method396(local13);
										if (local8967.anIntArray435 != null && local8967.anIntArray435.length > 0) {
											local25 = 0;
											local353 = local8967.anIntArray434[0];
											for (local2290 = 1; local2290 < local8967.anIntArray435.length; local2290++) {
												if (local8967.anIntArray434[local2290] > local353) {
													local25 = local2290;
													local353 = local8967.anIntArray434[local2290];
												}
											}
											anIntArray340[anInt5200++] = local8967.anIntArray435[local25];
											return;
										}
										anIntArray340[anInt5200++] = local8967.anInt6444;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static412.method5315(anIntArray340[--anInt5200]);
						} else {
							local137 = arg1 ? aClass124_9 : aClass124_8;
						}
						if (arg0 == 1300) {
							local19 = anIntArray340[--anInt5200] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method2784(aStringArray33[--anInt5193], local19);
								return;
							}
							anInt5193--;
							return;
						}
						if (arg0 == 1301) {
							anInt5200 -= 2;
							local19 = anIntArray340[anInt5200];
							local25 = anIntArray340[anInt5200 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass124_3 = null;
								return;
							}
							local137.aClass124_3 = Static334.method4492(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray340[--anInt5200];
							if (local19 != Static103.anInt1912 && local19 != Static154.anInt2614 && local19 != Static344.anInt5931) {
								return;
							}
							local137.anInt3367 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt3394 = anIntArray340[--anInt5200];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt3366 = anIntArray340[--anInt5200];
							return;
						}
						if (arg0 == 1305) {
							local137.aString43 = aStringArray33[--anInt5193];
							return;
						}
						if (arg0 == 1306) {
							local137.aString44 = aStringArray33[--anInt5193];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray17 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt3400 = anIntArray340[--anInt5200];
							local137.anInt3378 = anIntArray340[--anInt5200];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray340[--anInt5200];
							local25 = anIntArray340[--anInt5200];
							if (local25 >= 1 && local25 <= 10) {
								local137.method2778(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString40 = aStringArray33[--anInt5193];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt3427 = anIntArray340[--anInt5200];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt5200 -= 3;
								local19 = anIntArray340[anInt5200] - 1;
								local25 = anIntArray340[anInt5200 + 1];
								local353 = anIntArray340[anInt5200 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt5200 -= 2;
								local19 = 10;
								local25 = anIntArray340[anInt5200];
								local353 = anIntArray340[anInt5200 + 1];
							}
							if (local137.aByteArray38 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray38 = new byte[11];
								local137.aByteArray39 = new byte[11];
								local137.anIntArray211 = new int[11];
							}
							local137.aByteArray38[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean397 = false;
								for (local2290 = 0; local2290 < local137.aByteArray38.length; local2290++) {
									if (local137.aByteArray38[local2290] != 0) {
										local137.aBoolean397 = true;
										break;
									}
								}
							} else {
								local137.aBoolean397 = true;
							}
							local137.aByteArray39[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt3393 = anIntArray340[--anInt5200];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static412.method5315(anIntArray340[--anInt5200]);
					} else {
						local137 = arg1 ? aClass124_9 : aClass124_8;
					}
					Static160.method2323(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt5200 -= 2;
						local19 = anIntArray340[anInt5200];
						local25 = anIntArray340[anInt5200 + 1];
						if (local137.anInt3430 == -1) {
							Static268.method3787(local137.anInt3348);
							Static102.method1564(local137.anInt3348);
							Static265.method3751(local137.anInt3348);
						}
						if (local19 == -1) {
							local137.anInt3401 = 1;
							local137.anInt3422 = -1;
							local137.anInt3405 = -1;
							return;
						}
						local137.anInt3405 = local19;
						local137.anInt3351 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean390 = true;
						} else {
							local137.aBoolean390 = false;
						}
						@Pc(1630) Class162 local1630 = Static342.aClass155_2.method3548(local19);
						local137.anInt3379 = local1630.anInt4730;
						local137.anInt3428 = local1630.anInt4697;
						local137.anInt3372 = local1630.anInt4743;
						local137.anInt3355 = local1630.anInt4700;
						local137.anInt3369 = local1630.anInt4718;
						local137.anInt3406 = local1630.anInt4709;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt3420 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt3420 = 1;
						} else {
							local137.anInt3420 = 2;
						}
						if (local137.anInt3352 > 0) {
							local137.anInt3406 = local137.anInt3406 * 32 / local137.anInt3352;
							return;
						}
						if (local137.anInt3377 > 0) {
							local137.anInt3406 = local137.anInt3406 * 32 / local137.anInt3377;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt3401 = 2;
						local137.anInt3422 = anIntArray340[--anInt5200];
						if (local137.anInt3430 == -1) {
							Static70.method1143(local137.anInt3348);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt3401 = 3;
						local137.anInt3422 = -1;
						if (local137.anInt3430 == -1) {
							Static70.method1143(local137.anInt3348);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt3401 = 6;
						local137.anInt3422 = anIntArray340[--anInt5200];
						if (local137.anInt3430 == -1) {
							Static70.method1143(local137.anInt3348);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt3401 = 5;
						local137.anInt3422 = anIntArray340[--anInt5200];
						if (local137.anInt3430 == -1) {
							Static70.method1143(local137.anInt3348);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt5200 -= 4;
						local137.anInt3361 = anIntArray340[anInt5200];
						local137.anInt3423 = anIntArray340[anInt5200 + 1];
						local137.anInt3343 = anIntArray340[anInt5200 + 2];
						local137.anInt3398 = anIntArray340[anInt5200 + 3];
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt5200 -= 2;
						local137.anInt3357 = anIntArray340[anInt5200];
						local137.anInt3345 = anIntArray340[anInt5200 + 1];
						Static160.method2323(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt5200 -= 4;
						local137.anInt3422 = anIntArray340[anInt5200];
						local137.anInt3363 = anIntArray340[anInt5200 + 1];
						if (anIntArray340[anInt5200 + 2] == 1) {
							local137.anInt3401 = 9;
						} else {
							local137.anInt3401 = 8;
						}
						if (anIntArray340[anInt5200 + 3] == 1) {
							local137.aBoolean390 = true;
						} else {
							local137.aBoolean390 = false;
						}
						if (local137.anInt3430 == -1) {
							Static70.method1143(local137.anInt3348);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt3401 = 5;
						local137.anInt3422 = Static296.anInt5181;
						local137.anInt3363 = 0;
						if (local137.anInt3430 == -1) {
							Static70.method1143(local137.anInt3348);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static412.method5315(anIntArray340[--anInt5200]);
				} else {
					local137 = arg1 ? aClass124_9 : aClass124_8;
				}
				if (arg0 == 1000) {
					anInt5200 -= 4;
					local137.anInt3397 = anIntArray340[anInt5200];
					local137.anInt3385 = anIntArray340[anInt5200 + 1];
					local19 = anIntArray340[anInt5200 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray340[anInt5200 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte46 = (byte) local19;
					local137.aByte49 = (byte) local25;
					Static160.method2323(local137);
					Static13.method205(local137);
					if (local137.anInt3430 == -1) {
						Static382.method5590(local137.anInt3348);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt5200 -= 4;
					local137.anInt3377 = anIntArray340[anInt5200];
					local137.anInt3346 = anIntArray340[anInt5200 + 1];
					local137.anInt3352 = 0;
					local137.anInt3381 = 0;
					local19 = anIntArray340[anInt5200 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray340[anInt5200 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte48 = (byte) local19;
					local137.aByte47 = (byte) local25;
					Static160.method2323(local137);
					Static13.method205(local137);
					if (local137.anInt3417 == 0) {
						Static177.method2498(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray340[--anInt5200] == 1;
					if (local137.aBoolean399 != local620) {
						local137.aBoolean399 = local620;
						Static160.method2323(local137);
					}
					if (local137.anInt3430 == -1) {
						Static209.method3076(local137.anInt3348);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt5200 -= 2;
					local137.lb = anIntArray340[anInt5200];
					local137.anInt3362 = anIntArray340[anInt5200 + 1];
					Static160.method2323(local137);
					Static13.method205(local137);
					if (local137.anInt3417 == 0) {
						Static177.method2498(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean385 = anIntArray340[--anInt5200] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V")
	private static void method4080(@OriginalArg(0) int arg0) {
		@Pc(3) Class124 local3 = Static412.method5315(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class124[] local13 = Static46.aClass124ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class124[] local19 = Static87.aClass124ArrayArray7[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static46.aClass124ArrayArray1[local9] = new Class124[local22];
			Static468.method5039(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static468.method5039(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method4081(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray34[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!un;I)V")
	private static void method4082(@OriginalArg(0) Class1_Sub40 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray36;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub5_Sub14 local12 = Static403.method5238(local8);
		if (local12 == null) {
			return;
		}
		anIntArray341 = new int[local12.anInt4769];
		@Pc(21) int local21 = 0;
		aStringArray32 = new String[local12.anInt4767];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt6789;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt6793;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass124_14 == null ? -1 : arg0.aClass124_14.anInt3348;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt6792;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass124_14 == null ? -1 : arg0.aClass124_14.anInt3430;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass124_13 == null ? -1 : arg0.aClass124_13.anInt3348;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass124_13 == null ? -1 : arg0.aClass124_13.anInt3430;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt6790;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt6791;
				}
				anIntArray341[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString75;
				}
				aStringArray32[local27++] = local135;
			}
		}
		anInt5203 = arg0.anInt6787;
		method4071(local12, arg1);
	}
}
