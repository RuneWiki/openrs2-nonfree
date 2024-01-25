import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "Lclient!jb;")
	private static Class126 aClass126_7;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "[I")
	private static int[] anIntArray264;

	@OriginalMember(owner = "client!im", name = "g", descriptor = "Lclient!ot;")
	private static Class180 aClass180_1;

	@OriginalMember(owner = "client!im", name = "l", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray21;

	@OriginalMember(owner = "client!im", name = "s", descriptor = "Lclient!jb;")
	private static Class126 aClass126_8;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray20 = new String[1000];

	@OriginalMember(owner = "client!im", name = "d", descriptor = "I")
	private static int anInt3182 = 0;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "[Lclient!hr;")
	private static final Class111[] aClass111Array1 = new Class111[50];

	@OriginalMember(owner = "client!im", name = "f", descriptor = "[[I")
	private static final int[][] anIntArrayArray31 = new int[5][5000];

	@OriginalMember(owner = "client!im", name = "j", descriptor = "I")
	private static int anInt3185 = 0;

	@OriginalMember(owner = "client!im", name = "k", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!im", name = "r", descriptor = "I")
	private static int anInt3191 = 0;

	@OriginalMember(owner = "client!im", name = "v", descriptor = "[I")
	private static final int[] anIntArray265 = new int[5];

	@OriginalMember(owner = "client!im", name = "y", descriptor = "[I")
	private static final int[] anIntArray266 = new int[1000];

	@OriginalMember(owner = "client!im", name = "z", descriptor = "Lclient!er;")
	public static final Class69 aClass69_35 = new Class69(4);

	@OriginalMember(owner = "client!im", name = "A", descriptor = "[I")
	private static final int[] anIntArray267 = new int[3];

	@OriginalMember(owner = "client!im", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray22 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!im", name = "C", descriptor = "I")
	private static int anInt3196 = 0;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!uk;I)V")
	private static void method2502(@OriginalArg(0) Class4_Sub40 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray35;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class4_Sub1_Sub4 local12 = Static319.method4403(local8);
		if (local12 == null) {
			return;
		}
		anIntArray264 = new int[local12.anInt1386];
		@Pc(21) int local21 = 0;
		aStringArray21 = new String[local12.anInt1384];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt6868;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt6874;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass126_16 == null ? -1 : arg0.aClass126_16.anInt3397;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt6872;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass126_16 == null ? -1 : arg0.aClass126_16.anInt3392;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass126_15 == null ? -1 : arg0.aClass126_15.anInt3397;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass126_15 == null ? -1 : arg0.aClass126_15.anInt3392;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt6875;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt6871;
				}
				anIntArray264[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString67;
				}
				aStringArray21[local27++] = local135;
			}
		}
		anInt3196 = arg0.anInt6873;
		method2512(local12, arg1);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IZ)V")
	private static void method2503(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray266[anInt3182++] = Static202.anInt3888;
				return;
			}
			if (arg0 == 5001) {
				anInt3182 -= 3;
				Static202.anInt3888 = anIntArray266[anInt3182];
				Static208.aClass49_4 = Static369.method5082(anIntArray266[anInt3182 + 1]);
				if (Static208.aClass49_4 == null) {
					Static208.aClass49_4 = Static105.aClass49_2;
				}
				Static77.anInt1824 = anIntArray266[anInt3182 + 2];
				Static209.method2982(Static56.aClass36_27);
				Static116.aClass4_Sub30_Sub1_1.method4871(Static202.anInt3888);
				Static116.aClass4_Sub30_Sub1_1.method4871(Static208.aClass49_4.anInt1823);
				Static116.aClass4_Sub30_Sub1_1.method4871(Static77.anInt1824);
				return;
			}
			if (arg0 == 5002) {
				anInt3191 -= 2;
				local75 = aStringArray20[anInt3191];
				local81 = aStringArray20[anInt3191 + 1];
				anInt3182 -= 2;
				local89 = anIntArray266[anInt3182];
				local95 = anIntArray266[anInt3182 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static209.method2982(Static163.aClass36_67);
				Static116.aClass4_Sub30_Sub1_1.method4871(Static226.method592(local75) + Static226.method592(local81) + 2);
				Static116.aClass4_Sub30_Sub1_1.method4849(local75);
				Static116.aClass4_Sub30_Sub1_1.method4871(local89 - 1);
				Static116.aClass4_Sub30_Sub1_1.method4871(local95);
				Static116.aClass4_Sub30_Sub1_1.method4849(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray266[--anInt3182];
				local81 = null;
				if (local157 < 100) {
					local81 = Static259.aStringArray30[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray20[anInt3191++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray266[--anInt3182];
				local192 = -1;
				if (local157 < 100 && Static259.aStringArray30[local157] != null) {
					local192 = Static166.anIntArray261[local157];
				}
				anIntArray266[anInt3182++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static208.aClass49_4 == null) {
					anIntArray266[anInt3182++] = -1;
					return;
				}
				anIntArray266[anInt3182++] = Static208.aClass49_4.anInt1823;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray20[--anInt3191];
				method2506(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3191 -= 2;
				local75 = aStringArray20[anInt3191];
				local81 = aStringArray20[anInt3191 + 1];
				if (Static189.anInt3643 != 0 || (!Static386.aBoolean448 || Static146.aBoolean200) && !Static444.aBoolean494) {
					Static209.method2982(Static72.aClass36_38);
					Static116.aClass4_Sub30_Sub1_1.method4871(0);
					local89 = Static116.aClass4_Sub30_Sub1_1.anInt6244;
					Static116.aClass4_Sub30_Sub1_1.method4849(local75);
					Static75.method1364(local81, Static116.aClass4_Sub30_Sub1_1);
					Static116.aClass4_Sub30_Sub1_1.method4842(Static116.aClass4_Sub30_Sub1_1.anInt6244 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray266[--anInt3182];
				local81 = null;
				if (local157 < 100) {
					local81 = Static333.aStringArray37[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray20[anInt3191++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray266[--anInt3182];
				local81 = null;
				if (local157 < 100) {
					local81 = Static256.aStringArray32[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray20[anInt3191++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray266[--anInt3182];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static310.anIntArray476[local157];
				}
				anIntArray266[anInt3182++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static375.aClass6_Sub2_Sub1_Sub1_3 == null || Static375.aClass6_Sub2_Sub1_Sub1_3.aString12 == null) {
					local75 = Static248.aString48;
				} else {
					local75 = Static375.aClass6_Sub2_Sub1_Sub1_3.method706();
				}
				aStringArray20[anInt3191++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray266[anInt3182++] = Static77.anInt1824;
				return;
			}
			if (arg0 == 5017) {
				anIntArray266[anInt3182++] = Static26.anInt671;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray266[--anInt3182];
				local192 = 0;
				if (local157 < 100 && Static259.aStringArray30[local157] != null) {
					local192 = Static166.anIntArray261[local157];
				}
				anIntArray266[anInt3182++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray266[--anInt3182];
				local81 = null;
				if (local157 < 100) {
					local81 = Static17.aStringArray2[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray20[anInt3191++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static375.aClass6_Sub2_Sub1_Sub1_3 == null || Static375.aClass6_Sub2_Sub1_Sub1_3.aString12 == null) {
					local75 = Static248.aString48;
				} else {
					local75 = Static375.aClass6_Sub2_Sub1_Sub1_3.method709();
				}
				aStringArray20[anInt3191++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray266[--anInt3182];
				aStringArray20[anInt3191++] = Static428.aClass19_1.method532(local157).aString4;
				return;
			}
			@Pc(589) Class4_Sub1_Sub1 local589;
			if (arg0 == 5051) {
				local157 = anIntArray266[--anInt3182];
				local589 = Static428.aClass19_1.method532(local157);
				if (local589.anIntArray11 == null) {
					anIntArray266[anInt3182++] = 0;
					return;
				}
				anIntArray266[anInt3182++] = local589.anIntArray11.length;
				return;
			}
			if (arg0 == 5052) {
				anInt3182 -= 2;
				local157 = anIntArray266[anInt3182];
				local192 = anIntArray266[anInt3182 + 1];
				@Pc(634) Class4_Sub1_Sub1 local634 = Static428.aClass19_1.method532(local157);
				local95 = local634.anIntArray11[local192];
				anIntArray266[anInt3182++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray266[--anInt3182];
				local589 = Static428.aClass19_1.method532(local157);
				if (local589.anIntArray12 == null) {
					anIntArray266[anInt3182++] = 0;
					return;
				}
				anIntArray266[anInt3182++] = local589.anIntArray12.length;
				return;
			}
			if (arg0 == 5054) {
				anInt3182 -= 2;
				local157 = anIntArray266[anInt3182];
				local192 = anIntArray266[anInt3182 + 1];
				anIntArray266[anInt3182++] = Static428.aClass19_1.method532(local157).anIntArray12[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray266[--anInt3182];
				aStringArray20[anInt3191++] = Static390.aClass221_2.method5054(local157).method3463();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray266[--anInt3182];
				@Pc(760) Class4_Sub1_Sub10 local760 = Static390.aClass221_2.method5054(local157);
				if (local760.anIntArray381 == null) {
					anIntArray266[anInt3182++] = 0;
					return;
				}
				anIntArray266[anInt3182++] = local760.anIntArray381.length;
				return;
			}
			if (arg0 == 5057) {
				anInt3182 -= 2;
				local157 = anIntArray266[anInt3182];
				local192 = anIntArray266[anInt3182 + 1];
				anIntArray266[anInt3182++] = Static390.aClass221_2.method5054(local157).anIntArray381[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass180_1 = new Class180();
				aClass180_1.anInt5303 = anIntArray266[--anInt3182];
				aClass180_1.aClass4_Sub1_Sub10_1 = Static390.aClass221_2.method5054(aClass180_1.anInt5303);
				aClass180_1.anIntArray462 = new int[aClass180_1.aClass4_Sub1_Sub10_1.method3461()];
				return;
			}
			if (arg0 == 5059) {
				Static209.method2982(Static162.aClass36_113);
				Static116.aClass4_Sub30_Sub1_1.method4871(0);
				local157 = Static116.aClass4_Sub30_Sub1_1.anInt6244;
				Static116.aClass4_Sub30_Sub1_1.method4871(0);
				Static116.aClass4_Sub30_Sub1_1.method4846(aClass180_1.anInt5303);
				aClass180_1.aClass4_Sub1_Sub10_1.method3466(Static116.aClass4_Sub30_Sub1_1, aClass180_1.anIntArray462);
				Static116.aClass4_Sub30_Sub1_1.method4842(Static116.aClass4_Sub30_Sub1_1.anInt6244 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray20[--anInt3191];
				Static209.method2982(Static28.aClass36_16);
				Static116.aClass4_Sub30_Sub1_1.method4871(0);
				local192 = Static116.aClass4_Sub30_Sub1_1.anInt6244;
				Static116.aClass4_Sub30_Sub1_1.method4849(local75);
				Static116.aClass4_Sub30_Sub1_1.method4846(aClass180_1.anInt5303);
				aClass180_1.aClass4_Sub1_Sub10_1.method3466(Static116.aClass4_Sub30_Sub1_1, aClass180_1.anIntArray462);
				Static116.aClass4_Sub30_Sub1_1.method4842(Static116.aClass4_Sub30_Sub1_1.anInt6244 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static209.method2982(Static162.aClass36_113);
				Static116.aClass4_Sub30_Sub1_1.method4871(0);
				local157 = Static116.aClass4_Sub30_Sub1_1.anInt6244;
				Static116.aClass4_Sub30_Sub1_1.method4871(1);
				Static116.aClass4_Sub30_Sub1_1.method4846(aClass180_1.anInt5303);
				aClass180_1.aClass4_Sub1_Sub10_1.method3466(Static116.aClass4_Sub30_Sub1_1, aClass180_1.anIntArray462);
				Static116.aClass4_Sub30_Sub1_1.method4842(Static116.aClass4_Sub30_Sub1_1.anInt6244 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt3182 -= 2;
				local157 = anIntArray266[anInt3182];
				local192 = anIntArray266[anInt3182 + 1];
				anIntArray266[anInt3182++] = Static428.aClass19_1.method532(local157).aCharArray2[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt3182 -= 2;
				local157 = anIntArray266[anInt3182];
				local192 = anIntArray266[anInt3182 + 1];
				anIntArray266[anInt3182++] = Static428.aClass19_1.method532(local157).aCharArray1[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt3182 -= 2;
				local157 = anIntArray266[anInt3182];
				local192 = anIntArray266[anInt3182 + 1];
				if (local192 == -1) {
					anIntArray266[anInt3182++] = -1;
					return;
				}
				anIntArray266[anInt3182++] = Static428.aClass19_1.method532(local157).method109((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt3182 -= 2;
				local157 = anIntArray266[anInt3182];
				local192 = anIntArray266[anInt3182 + 1];
				if (local192 == -1) {
					anIntArray266[anInt3182++] = -1;
					return;
				}
				anIntArray266[anInt3182++] = Static428.aClass19_1.method532(local157).method111((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray266[--anInt3182];
				anIntArray266[anInt3182++] = Static390.aClass221_2.method5054(local157).method3461();
				return;
			}
			if (arg0 == 5067) {
				anInt3182 -= 2;
				local157 = anIntArray266[anInt3182];
				local192 = anIntArray266[anInt3182 + 1];
				local89 = Static390.aClass221_2.method5054(local157).method3462(local192).anInt7392;
				anIntArray266[anInt3182++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt3182 -= 2;
				local157 = anIntArray266[anInt3182];
				local192 = anIntArray266[anInt3182 + 1];
				aClass180_1.anIntArray462[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt3182 -= 2;
				local157 = anIntArray266[anInt3182];
				local192 = anIntArray266[anInt3182 + 1];
				aClass180_1.anIntArray462[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt3182 -= 3;
				local157 = anIntArray266[anInt3182];
				local192 = anIntArray266[anInt3182 + 1];
				local89 = anIntArray266[anInt3182 + 2];
				@Pc(1265) Class4_Sub1_Sub10 local1265 = Static390.aClass221_2.method5054(local157);
				if (local1265.method3462(local192).anInt7392 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray266[anInt3182++] = local1265.method3459(local89, local192);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray20[--anInt3191];
				local1313 = anIntArray266[--anInt3182] == 1;
				Static217.method3095(local1313, local75);
				anIntArray266[anInt3182++] = Static227.anInt4176;
				return;
			}
			if (arg0 == 5072) {
				if (Static98.aShortArray17 != null && Static344.anInt6182 < Static227.anInt4176) {
					anIntArray266[anInt3182++] = Static98.aShortArray17[Static344.anInt6182++] & 0xFFFF;
					return;
				}
				anIntArray266[anInt3182++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static344.anInt6182 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static209.method2982(Static162.aClass36_113);
				Static116.aClass4_Sub30_Sub1_1.method4871(0);
				local157 = Static116.aClass4_Sub30_Sub1_1.anInt6244;
				Static116.aClass4_Sub30_Sub1_1.method4871(2);
				Static116.aClass4_Sub30_Sub1_1.method4846(aClass180_1.anInt5303);
				aClass180_1.aClass4_Sub1_Sub10_1.method3466(Static116.aClass4_Sub30_Sub1_1, aClass180_1.anIntArray462);
				Static116.aClass4_Sub30_Sub1_1.method4842(Static116.aClass4_Sub30_Sub1_1.anInt6244 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static23.aClass14_1.method1510(86)) {
					anIntArray266[anInt3182++] = 1;
					return;
				}
				anIntArray266[anInt3182++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static23.aClass14_1.method1510(82)) {
					anIntArray266[anInt3182++] = 1;
					return;
				}
				anIntArray266[anInt3182++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static23.aClass14_1.method1510(81)) {
					anIntArray266[anInt3182++] = 1;
					return;
				}
				anIntArray266[anInt3182++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static282.method3778(anIntArray266[--anInt3182]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray266[anInt3182++] = Static349.method4905();
					return;
				}
				if (arg0 == 5205) {
					Static82.method1419(anIntArray266[--anInt3182], -1, false, -1);
					return;
				}
				@Pc(1554) Class4_Sub1_Sub16 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray266[--anInt3182];
					local1554 = Static137.method4282(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray266[anInt3182++] = -1;
						return;
					}
					anIntArray266[anInt3182++] = local1554.anInt6326;
					return;
				}
				@Pc(1587) Class4_Sub1_Sub16 local1587;
				if (arg0 == 5207) {
					local1587 = Static137.method4293(anIntArray266[--anInt3182]);
					if (local1587 != null && local1587.aString57 != null) {
						aStringArray20[anInt3191++] = local1587.aString57;
						return;
					}
					aStringArray20[anInt3191++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray266[anInt3182++] = Static139.anInt2672;
					anIntArray266[anInt3182++] = Static341.anInt6056;
					return;
				}
				if (arg0 == 5209) {
					anIntArray266[anInt3182++] = Static348.anInt6296 + Static137.anInt5581;
					anIntArray266[anInt3182++] = Static4.anInt162 + Static137.anInt5584;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray266[--anInt3182];
					local1554 = Static137.method4293(local157);
					if (local1554 == null) {
						anIntArray266[anInt3182++] = 0;
						anIntArray266[anInt3182++] = 0;
						return;
					}
					anIntArray266[anInt3182++] = local1554.anInt6328 >> 14 & 0x3FFF;
					anIntArray266[anInt3182++] = local1554.anInt6328 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray266[--anInt3182];
					local1554 = Static137.method4293(local157);
					if (local1554 == null) {
						anIntArray266[anInt3182++] = 0;
						anIntArray266[anInt3182++] = 0;
						return;
					}
					anIntArray266[anInt3182++] = local1554.anInt6317 - local1554.anInt6329;
					anIntArray266[anInt3182++] = local1554.anInt6315 - local1554.anInt6327;
					return;
				}
				@Pc(1777) Class4_Sub32 local1777;
				if (arg0 == 5212) {
					local1777 = Static202.method2932();
					if (local1777 == null) {
						anIntArray266[anInt3182++] = -1;
						anIntArray266[anInt3182++] = -1;
						return;
					}
					anIntArray266[anInt3182++] = local1777.anInt5601;
					local192 = local1777.anInt5606 << 28 | local1777.anInt5605 + Static137.anInt5581 << 14 | local1777.anInt5602 + Static137.anInt5584;
					anIntArray266[anInt3182++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static380.method5183();
					if (local1777 == null) {
						anIntArray266[anInt3182++] = -1;
						anIntArray266[anInt3182++] = -1;
						return;
					}
					anIntArray266[anInt3182++] = local1777.anInt5601;
					local192 = local1777.anInt5606 << 28 | local1777.anInt5605 + Static137.anInt5581 << 14 | local1777.anInt5602 + Static137.anInt5584;
					anIntArray266[anInt3182++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray266[--anInt3182];
					local1554 = Static181.method2911();
					if (local1554 != null) {
						local1925 = local1554.method4923(local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3, local157 & 0x3FFF, anIntArray267);
						if (local1925) {
							Static287.method4003(anIntArray267[1], anIntArray267[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt3182 -= 2;
					local157 = anIntArray266[anInt3182];
					local192 = anIntArray266[anInt3182 + 1];
					@Pc(1963) Class140 local1963 = Static137.method4289(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class4_Sub1_Sub16 local1970 = (Class4_Sub1_Sub16) local1963.method3014(); local1970 != null; local1970 = (Class4_Sub1_Sub16) local1963.method3018()) {
						if (local1970.anInt6326 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray266[anInt3182++] = 1;
						return;
					}
					anIntArray266[anInt3182++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray266[--anInt3182];
					local1554 = Static137.method4293(local157);
					if (local1554 == null) {
						anIntArray266[anInt3182++] = -1;
						return;
					}
					anIntArray266[anInt3182++] = local1554.anInt6316;
					return;
				}
				if (arg0 == 5220) {
					anIntArray266[anInt3182++] = Static231.anInt4229 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray266[--anInt3182];
					Static287.method4003(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static181.method2911();
					if (local1587 != null) {
						local1313 = local1587.method4922(Static348.anInt6296 + Static137.anInt5581, Static4.anInt162 + Static137.anInt5584, anIntArray267);
						if (local1313) {
							anIntArray266[anInt3182++] = anIntArray267[1];
							anIntArray266[anInt3182++] = anIntArray267[2];
							return;
						}
						anIntArray266[anInt3182++] = -1;
						anIntArray266[anInt3182++] = -1;
						return;
					}
					anIntArray266[anInt3182++] = -1;
					anIntArray266[anInt3182++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt3182 -= 2;
					local157 = anIntArray266[anInt3182];
					local192 = anIntArray266[anInt3182 + 1];
					Static82.method1419(local157, local192 & 0x3FFF, false, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray266[--anInt3182];
					local1554 = Static181.method2911();
					if (local1554 != null) {
						local1925 = local1554.method4923(local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3, local157 & 0x3FFF, anIntArray267);
						if (local1925) {
							anIntArray266[anInt3182++] = anIntArray267[1];
							anIntArray266[anInt3182++] = anIntArray267[2];
							return;
						}
						anIntArray266[anInt3182++] = -1;
						anIntArray266[anInt3182++] = -1;
						return;
					}
					anIntArray266[anInt3182++] = -1;
					anIntArray266[anInt3182++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray266[--anInt3182];
					local1554 = Static181.method2911();
					if (local1554 != null) {
						local1925 = local1554.method4922(local157 >> 14 & 0x3FFF, local157 & 0x3FFF, anIntArray267);
						if (local1925) {
							anIntArray266[anInt3182++] = anIntArray267[1];
							anIntArray266[anInt3182++] = anIntArray267[2];
							return;
						}
						anIntArray266[anInt3182++] = -1;
						anIntArray266[anInt3182++] = -1;
						return;
					}
					anIntArray266[anInt3182++] = -1;
					anIntArray266[anInt3182++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static273.method3697(anIntArray266[--anInt3182]);
					return;
				}
				if (arg0 == 5227) {
					anInt3182 -= 2;
					local157 = anIntArray266[anInt3182];
					local192 = anIntArray266[anInt3182 + 1];
					Static82.method1419(local157, local192 & 0x3FFF, true, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static433.aBoolean484 = anIntArray266[--anInt3182] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray266[anInt3182++] = Static433.aBoolean484 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray266[--anInt3182];
					Static351.method4926(local157);
					return;
				}
				@Pc(2483) Class4 local2483;
				if (arg0 == 5231) {
					anInt3182 -= 2;
					local157 = anIntArray266[anInt3182];
					local1313 = anIntArray266[anInt3182 + 1] == 1;
					if (Static233.aClass196_21 != null) {
						local2483 = Static233.aClass196_21.method4477((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5854();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class4();
							Static233.aClass196_21.method4474((long) local157, local2483);
						}
					}
					return;
				}
				@Pc(2525) Class4 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray266[--anInt3182];
					if (Static233.aClass196_21 != null) {
						local2525 = Static233.aClass196_21.method4477((long) local157);
						anIntArray266[anInt3182++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray266[anInt3182++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt3182 -= 2;
					local157 = anIntArray266[anInt3182];
					local1313 = anIntArray266[anInt3182 + 1] == 1;
					if (Static414.aClass196_39 != null) {
						local2483 = Static414.aClass196_39.method4477((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5854();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class4();
							Static414.aClass196_39.method4474((long) local157, local2483);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray266[--anInt3182];
					if (Static414.aClass196_39 != null) {
						local2525 = Static414.aClass196_39.method4477((long) local157);
						anIntArray266[anInt3182++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray266[anInt3182++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray266[anInt3182++] = Static137.aClass4_Sub1_Sub16_2 == null ? -1 : Static137.aClass4_Sub1_Sub16_2.anInt6326;
					return;
				}
				if (arg0 == 5236) {
					anInt3182 -= 2;
					local157 = anIntArray266[anInt3182];
					local192 = anIntArray266[anInt3182 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static430.method5523(local89, local157, local95);
					if (local2691 < 0) {
						anIntArray266[anInt3182++] = -1;
						return;
					}
					anIntArray266[anInt3182++] = local2691;
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt3182 -= 2;
					local157 = anIntArray266[anInt3182];
					local192 = anIntArray266[anInt3182 + 1];
					Static352.method4941(local157, local192, 3, false);
					anIntArray266[anInt3182++] = Static269.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static269.aFrame1 != null) {
						Static352.method4941(-1, -1, Static126.aClass67_Sub1_1.anInt5863, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2769) Class155[] local2769 = Static51.method1040();
					anIntArray266[anInt3182++] = local2769.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray266[--anInt3182];
					@Pc(2793) Class155[] local2793 = Static51.method1040();
					anIntArray266[anInt3182++] = local2793[local157].anInt4448;
					anIntArray266[anInt3182++] = local2793[local157].anInt4445;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static126.aClass67_Sub1_1.anInt5860;
					local192 = Static126.aClass67_Sub1_1.anInt5847;
					local89 = -1;
					@Pc(2830) Class155[] local2830 = Static51.method1040();
					for (local2691 = 0; local2691 < local2830.length; local2691++) {
						@Pc(2837) Class155 local2837 = local2830[local2691];
						if (local2837.anInt4448 == local157 && local2837.anInt4445 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray266[anInt3182++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray266[anInt3182++] = Static144.method2104();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray266[--anInt3182];
					if (local157 >= 1 && local157 <= 2) {
						Static352.method4941(-1, -1, local157, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.anInt5863;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray266[--anInt3182];
					if (local157 >= 1 && local157 <= 2) {
						Static126.aClass67_Sub1_1.anInt5863 = local157;
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						return;
					}
					return;
				}
			} else {
				@Pc(3345) String local3345;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt3191 -= 2;
						local75 = aStringArray20[anInt3191];
						local81 = aStringArray20[anInt3191 + 1];
						local89 = anIntArray266[--anInt3182];
						Static209.method2982(Static282.aClass36_91);
						Static116.aClass4_Sub30_Sub1_1.method4871(Static226.method592(local75) + Static226.method592(local81) + 1);
						Static116.aClass4_Sub30_Sub1_1.method4849(local75);
						Static116.aClass4_Sub30_Sub1_1.method4849(local81);
						Static116.aClass4_Sub30_Sub1_1.method4871(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt3182 -= 2;
						Static69.aShortArray16[anIntArray266[anInt3182]] = (short) Static177.method2595(anIntArray266[anInt3182 + 1]);
						Static390.aClass204_2.method4625();
						Static390.aClass204_2.method4630();
						Static388.aClass211_1.method4930();
						Static262.method3574();
						return;
					}
					if (arg0 == 5405) {
						anInt3182 -= 2;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static99.anIntArrayArrayArray12[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt3182 -= 7;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1] << 1;
						local89 = anIntArray266[anInt3182 + 2];
						local95 = anIntArray266[anInt3182 + 3];
						local2691 = anIntArray266[anInt3182 + 4];
						@Pc(3105) int local3105 = anIntArray266[anInt3182 + 5];
						@Pc(3111) int local3111 = anIntArray266[anInt3182 + 6];
						if (local157 >= 0 && local157 < 2 && Static99.anIntArrayArrayArray12[local157] != null && local192 >= 0 && local192 < Static99.anIntArrayArrayArray12[local157].length) {
							Static99.anIntArrayArrayArray12[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3111 };
							Static99.anIntArrayArrayArray12[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3105, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static99.anIntArrayArrayArray12[anIntArray266[--anInt3182]].length >> 1;
						anIntArray266[anInt3182++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static269.aFrame1 != null) {
							Static352.method4941(-1, -1, Static126.aClass67_Sub1_1.anInt5863, false);
						}
						if (Static373.aFrame2 != null) {
							Static130.method1932();
							System.exit(0);
							return;
						}
						local75 = Static1.aString3 == null ? Static130.method1933() : Static1.aString3;
						Static145.method2120(false, Static89.aClass114_3, Static286.anInt5207 == 1, local75);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static421.aClass108_9 != null) {
							if (Static421.aClass108_9.anObject4 == null) {
								local75 = Static230.method3200(Static421.aClass108_9.anInt2805);
							} else {
								local75 = (String) Static421.aClass108_9.anObject4;
							}
						}
						aStringArray20[anInt3191++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray266[anInt3182++] = Static159.anInt3000 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static269.aFrame1 != null) {
							Static352.method4941(-1, -1, Static126.aClass67_Sub1_1.anInt5863, false);
						}
						local75 = aStringArray20[--anInt3191];
						local1313 = anIntArray266[--anInt3182] == 1;
						local3345 = Static130.method1933() + local75;
						Static145.method2120(local1313, Static89.aClass114_3, Static286.anInt5207 == 1, local3345);
						return;
					}
					if (arg0 == 5422) {
						anInt3191 -= 2;
						local75 = aStringArray20[anInt3191];
						local81 = aStringArray20[anInt3191 + 1];
						local89 = anIntArray266[--anInt3182];
						if (local75.length() > 0) {
							if (Static210.aStringArray27 == null) {
								Static210.aStringArray27 = new String[Static177.anIntArray276[Static441.aClass95_5.anInt2635]];
							}
							Static210.aStringArray27[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static434.aStringArray42 == null) {
								Static434.aStringArray42 = new String[Static177.anIntArray276[Static441.aClass95_5.anInt2635]];
							}
							Static434.aStringArray42[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray20[--anInt3191]);
						return;
					}
					if (arg0 == 5424) {
						anInt3182 -= 11;
						Static371.anInt6554 = anIntArray266[anInt3182];
						Static129.anInt2585 = anIntArray266[anInt3182 + 1];
						Static342.anInt6166 = anIntArray266[anInt3182 + 2];
						Static162.anInt6355 = anIntArray266[anInt3182 + 3];
						Static280.anInt4897 = anIntArray266[anInt3182 + 4];
						Static94.anInt2045 = anIntArray266[anInt3182 + 5];
						Static442.anInt7380 = anIntArray266[anInt3182 + 6];
						Static174.anInt3240 = anIntArray266[anInt3182 + 7];
						Static153.anInt2913 = anIntArray266[anInt3182 + 8];
						Static45.anInt1299 = anIntArray266[anInt3182 + 9];
						Static237.anInt4356 = anIntArray266[anInt3182 + 10];
						Static149.aClass166_105.method3670(Static280.anInt4897);
						Static149.aClass166_105.method3670(Static94.anInt2045);
						Static149.aClass166_105.method3670(Static442.anInt7380);
						Static149.aClass166_105.method3670(Static174.anInt3240);
						Static149.aClass166_105.method3670(Static153.anInt2913);
						Static362.aClass3_20 = null;
						Static314.aClass3_15 = null;
						Static277.aClass3_14 = null;
						Static105.aClass3_6 = null;
						Static157.aClass3_9 = null;
						Static414.aClass3_24 = null;
						Static345.aClass3_19 = null;
						Static133.aClass3_7 = null;
						Static60.aBoolean103 = true;
						return;
					}
					if (arg0 == 5425) {
						Static13.method324();
						Static60.aBoolean103 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt3182 -= 2;
						Static105.anInt2235 = anIntArray266[anInt3182];
						Static214.anInt4012 = anIntArray266[anInt3182 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt3182 -= 2;
						Static104.anInt2227 = anIntArray266[anInt3182 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt3182 -= 2;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						anIntArray266[anInt3182++] = Static448.method5742(local192, local157) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static304.method4192(aStringArray20[--anInt3191], false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static459.method3567(Static89.aClass114_3.anApplet1, "accountcreated");
							return;
						} catch (@Pc(3639) Throwable local3639) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt3182 -= 4;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						local89 = anIntArray266[anInt3182 + 2];
						local95 = anIntArray266[anInt3182 + 3];
						Static303.method4188((local157 >> 14 & 0x3FFF) - Static381.anInt6688, false, local89, local95, local192, (local157 & 0x3FFF) - Static285.anInt5187);
						return;
					}
					if (arg0 == 5501) {
						anInt3182 -= 4;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						local89 = anIntArray266[anInt3182 + 2];
						local95 = anIntArray266[anInt3182 + 3];
						Static363.method5031((local157 >> 14 & 0x3FFF) - Static381.anInt6688, local192, (local157 & 0x3FFF) - Static285.anInt5187, local95, local89);
						return;
					}
					if (arg0 == 5502) {
						anInt3182 -= 6;
						local157 = anIntArray266[anInt3182];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static52.anInt1388 = local157;
						local192 = anIntArray266[anInt3182 + 1];
						if (local192 + 1 >= Static99.anIntArrayArrayArray12[Static52.anInt1388].length >> 1) {
							throw new RuntimeException();
						}
						Static264.anInt4722 = local192;
						Static300.anInt5428 = 0;
						Static342.anInt6169 = anIntArray266[anInt3182 + 2];
						Static39.anInt1897 = anIntArray266[anInt3182 + 3];
						local89 = anIntArray266[anInt3182 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static282.anInt4959 = local89;
						local95 = anIntArray266[anInt3182 + 5];
						if (local95 + 1 >= Static99.anIntArrayArrayArray12[Static282.anInt4959].length >> 1) {
							throw new RuntimeException();
						}
						Static440.anInt7377 = local95;
						Static134.anInt2621 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static26.method529();
						return;
					}
					if (arg0 == 5504) {
						anInt3182 -= 2;
						Static398.method5292(anIntArray266[anInt3182], anIntArray266[anInt3182 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray266[anInt3182++] = (int) Static416.aFloat208 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray266[anInt3182++] = (int) Static146.aFloat82 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static141.method2014();
						return;
					}
					if (arg0 == 5508) {
						Static50.method1029();
						return;
					}
					if (arg0 == 5509) {
						Static150.method2231();
						return;
					}
					if (arg0 == 5510) {
						Static308.method4243();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray266[--anInt3182];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static381.anInt6688;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static126.anInt2569) {
							local192 = Static126.anInt2569;
						}
						local89 -= Static285.anInt5187;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static190.anInt3697) {
							local89 = Static190.anInt3697;
						}
						Static207.anInt3914 = (local192 << 7) + 64;
						Static110.anInt2331 = (local89 << 7) + 64;
						Static134.anInt2621 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static280.method3737();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt3191 -= 2;
						local75 = aStringArray20[anInt3191];
						local81 = aStringArray20[anInt3191 + 1];
						local89 = anIntArray266[--anInt3182];
						if (Static73.anInt1749 != 10) {
							return;
						}
						if (Static205.anInt3906 == 0 && Static341.anInt6053 == 0 && Static272.anInt4809 == 0 && Static433.anInt7201 == 0) {
							Static440.method5686(local89, local75, local81);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static327.method4457();
						return;
					}
					if (arg0 == 5602) {
						if (Static341.anInt6053 == 0) {
							Static452.anInt7565 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt3182 -= 4;
						if (Static73.anInt1749 != 10) {
							return;
						}
						if (Static205.anInt3906 == 0 && Static341.anInt6053 == 0 && Static272.anInt4809 == 0 && Static433.anInt7201 == 0) {
							Static162.method4952(anIntArray266[anInt3182], anIntArray266[anInt3182 + 1], anIntArray266[anInt3182 + 2], anIntArray266[anInt3182 + 3]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt3191--;
						if (Static73.anInt1749 != 10) {
							return;
						}
						if (Static205.anInt3906 == 0 && Static341.anInt6053 == 0 && Static272.anInt4809 == 0 && Static433.anInt7201 == 0) {
							Static16.method4755(Static13.method317(aStringArray20[anInt3191]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt3191 -= 3;
						anInt3182 -= 7;
						if (Static73.anInt1749 != 10) {
							return;
						}
						if (Static205.anInt3906 == 0 && Static341.anInt6053 == 0 && Static272.anInt4809 == 0 && Static433.anInt7201 == 0) {
							Static254.method3493(aStringArray20[anInt3191 + 2], anIntArray266[anInt3182 + 5] == 1, anIntArray266[anInt3182 + 4] == 1, anIntArray266[anInt3182], Static13.method317(aStringArray20[anInt3191]), anIntArray266[anInt3182 + 2], anIntArray266[anInt3182 + 3], anIntArray266[anInt3182 + 1], aStringArray20[anInt3191 + 1], anIntArray266[anInt3182 + 6] == 1);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static272.anInt4809 == 0) {
							Static198.anInt3783 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray266[anInt3182++] = Static452.anInt7565;
						return;
					}
					if (arg0 == 5608) {
						anIntArray266[anInt3182++] = Static216.anInt4045;
						return;
					}
					if (arg0 == 5609) {
						anIntArray266[anInt3182++] = Static198.anInt3783;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray20[anInt3191++] = Static419.aStringArray41.length > local157 ? Static235.method3266(Static419.aStringArray41[local157]) : "";
						}
						Static419.aStringArray41 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray266[anInt3182++] = Static52.anInt1387;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray266[--anInt3182];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static126.aClass67_Sub1_1.anInt5842 = local157;
						Static399.method5302();
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6002) {
						Static126.aClass67_Sub1_1.method4534(anIntArray266[--anInt3182] == 1);
						Static399.method5302();
						Static176.method2582();
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6003) {
						Static126.aClass67_Sub1_1.aBoolean405 = anIntArray266[--anInt3182] == 1;
						Static176.method2582();
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6005) {
						Static126.aClass67_Sub1_1.aBoolean389 = anIntArray266[--anInt3182] == 1;
						Static399.method5302();
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6006) {
						Static126.aClass67_Sub1_1.aBoolean392 = anIntArray266[--anInt3182] == 1;
						Static16.aClass30_11.method4646(!Static126.aClass67_Sub1_1.aBoolean392);
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6007) {
						Static126.aClass67_Sub1_1.anInt5856 = anIntArray266[--anInt3182];
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6008) {
						Static126.aClass67_Sub1_1.aBoolean395 = anIntArray266[--anInt3182] == 1;
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6009) {
						Static126.aClass67_Sub1_1.aBoolean404 = anIntArray266[--anInt3182] == 1;
						Static399.method5302();
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6010) {
						Static126.aClass67_Sub1_1.aBoolean400 = anIntArray266[--anInt3182] == 1;
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray266[--anInt3182];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static126.aClass67_Sub1_1.method4519(local157, Static286.anInt5207);
						Static399.method5302();
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6012) {
						Static126.aClass67_Sub1_1.method4520(Static286.anInt5207, anIntArray266[--anInt3182] == 1);
						Static88.method1487();
						Static429.method5520();
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6014) {
						Static126.aClass67_Sub1_1.aBoolean388 = anIntArray266[--anInt3182] == 1;
						Static399.method5302();
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6015) {
						Static126.aClass67_Sub1_1.aBoolean399 = anIntArray266[--anInt3182] == 1;
						Static399.method5302();
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray266[--anInt3182];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static126.aClass67_Sub1_1.anInt5848 = local157;
						Static435.method5598(Static286.anInt5207);
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						return;
					}
					if (arg0 == 6017) {
						Static126.aClass67_Sub1_1.aBoolean391 = anIntArray266[--anInt3182] == 1;
						Static215.method5516();
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray266[--anInt3182];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static126.aClass67_Sub1_1.anInt5852 = local157;
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray266[--anInt3182];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static126.aClass67_Sub1_1.anInt5859) {
							if (Static126.aClass67_Sub1_1.anInt5859 == 0 && Static49.anInt1347 != -1) {
								Static216.method3074(local157, Static49.anInt1347, Static273.aClass166_193);
								Static156.aBoolean213 = false;
							} else if (local157 == 0) {
								Static130.method1931();
								Static156.aBoolean213 = false;
							} else {
								Static201.method5144(local157);
							}
							Static126.aClass67_Sub1_1.anInt5859 = local157;
						}
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray266[--anInt3182];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static126.aClass67_Sub1_1.anInt5855 = local157;
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6021) {
						Static126.aClass67_Sub1_1.aBoolean406 = anIntArray266[--anInt3182] == 1;
						Static176.method2582();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray266[--anInt3182];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static346.anInt6291 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static324.method5215(local157);
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						anIntArray266[anInt3182++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray266[--anInt3182];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static126.aClass67_Sub1_1.anInt5858 = local157;
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray266[--anInt3182];
						if (local157 < 0 || local157 > Static236.method3282(Static346.anInt6291)) {
							local157 = 0;
						}
						Static126.aClass67_Sub1_1.anInt5854 = local157;
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray266[--anInt3182];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static415.method5436(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static126.aClass67_Sub1_1.aBoolean393 = anIntArray266[--anInt3182] != 0;
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						return;
					}
					if (arg0 == 6029) {
						Static126.aClass67_Sub1_1.anInt5856 = anIntArray266[--anInt3182];
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						return;
					}
					if (arg0 == 6030) {
						Static126.aClass67_Sub1_1.aBoolean397 = anIntArray266[--anInt3182] != 0;
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static399.method5302();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray266[--anInt3182];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static435.method5598(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray266[--anInt3182];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static126.aClass67_Sub1_1.anInt5866 = local157;
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray266[--anInt3182];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static126.aClass67_Sub1_1.anInt5845 = local157;
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						return;
					}
					if (arg0 == 6034) {
						Static126.aClass67_Sub1_1.aBoolean396 = anIntArray266[--anInt3182] == 1;
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						Static88.method1487();
						Static120.aBoolean189 = false;
						return;
					}
					if (arg0 == 6035) {
						Static126.aClass67_Sub1_1.aBoolean407 = anIntArray266[--anInt3182] == 1;
						Static399.method5302();
						Static176.method2582();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.anInt5842;
						return;
					}
					if (arg0 == 6102) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.method4530(Static286.anInt5207) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.aBoolean405 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.aBoolean389 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.aBoolean392 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.anInt5856;
						return;
					}
					if (arg0 == 6108) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.aBoolean395 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.aBoolean404 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.aBoolean400 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.method4523(Static286.anInt5207);
						return;
					}
					if (arg0 == 6112) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.method4524(Static286.anInt5207) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.aBoolean388 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.aBoolean399 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.anInt5848;
						return;
					}
					if (arg0 == 6117) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.aBoolean391 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.anInt5852;
						return;
					}
					if (arg0 == 6119) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.anInt5859;
						return;
					}
					if (arg0 == 6120) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.anInt5855;
						return;
					}
					if (arg0 == 6121) {
						anIntArray266[anInt3182++] = Static16.aClass30_11.method4634() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray266[anInt3182++] = Static344.method4802();
						return;
					}
					if (arg0 == 6124) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.anInt5858;
						return;
					}
					if (arg0 == 6125) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.anInt5854;
						return;
					}
					if (arg0 == 6126) {
						anIntArray266[anInt3182++] = Static16.aClass30_11.method4680() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.aBoolean398 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.aBoolean393 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.anInt5856;
						return;
					}
					if (arg0 == 6130) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.aBoolean397 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray266[anInt3182++] = Static286.anInt5207;
						return;
					}
					if (arg0 == 6132) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.anInt5866;
						return;
					}
					if (arg0 == 6133) {
						anIntArray266[anInt3182++] = Static159.anInt3000 == 1 || Static159.anInt3000 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray266[anInt3182++] = Static236.method3282(Static346.anInt6291);
						return;
					}
					if (arg0 == 6135) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.anInt5845;
						return;
					}
					if (arg0 == 6136) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.aBoolean396 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt3182 -= 2;
						Static252.aShort46 = (short) anIntArray266[anInt3182];
						if (Static252.aShort46 <= 0) {
							Static252.aShort46 = 256;
						}
						Static15.aShort11 = (short) anIntArray266[anInt3182 + 1];
						if (Static15.aShort11 <= 0) {
							Static15.aShort11 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt3182 -= 2;
						Static410.aShort91 = (short) anIntArray266[anInt3182];
						if (Static410.aShort91 <= 0) {
							Static410.aShort91 = 256;
						}
						Static369.aShort87 = (short) anIntArray266[anInt3182 + 1];
						if (Static369.aShort87 <= 0) {
							Static369.aShort87 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt3182 -= 4;
						Static31.aShort24 = (short) anIntArray266[anInt3182];
						if (Static31.aShort24 <= 0) {
							Static31.aShort24 = 1;
						}
						Static14.aShort73 = (short) anIntArray266[anInt3182 + 1];
						if (Static14.aShort73 <= 0) {
							Static14.aShort73 = 32767;
						} else if (Static14.aShort73 < Static31.aShort24) {
							Static14.aShort73 = Static31.aShort24;
						}
						Static128.aShort47 = (short) anIntArray266[anInt3182 + 2];
						if (Static128.aShort47 <= 0) {
							Static128.aShort47 = 1;
						}
						Static175.aShort58 = (short) anIntArray266[anInt3182 + 3];
						if (Static175.aShort58 <= 0) {
							Static175.aShort58 = 32767;
							return;
						}
						if (Static175.aShort58 < Static128.aShort47) {
							Static175.aShort58 = Static128.aShort47;
						}
						return;
					}
					if (arg0 == 6203) {
						Static44.method896(Static310.aClass126_13.anInt3442, false, Static310.aClass126_13.anInt3421, 0, 0);
						anIntArray266[anInt3182++] = Static103.anInt2206;
						anIntArray266[anInt3182++] = Static416.anInt7075;
						return;
					}
					if (arg0 == 6204) {
						anIntArray266[anInt3182++] = Static410.aShort91;
						anIntArray266[anInt3182++] = Static369.aShort87;
						return;
					}
					if (arg0 == 6205) {
						anIntArray266[anInt3182++] = Static252.aShort46;
						anIntArray266[anInt3182++] = Static15.aShort11;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray266[anInt3182++] = (int) (Static199.method2845() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray266[anInt3182++] = (int) (Static199.method2845() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt3182 -= 3;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						local89 = anIntArray266[anInt3182 + 2];
						aCalendar2.clear();
						aCalendar2.set(11, 12);
						aCalendar2.set(local89, local192, local157);
						anIntArray266[anInt3182++] = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6303) {
						aCalendar2.clear();
						aCalendar2.setTime(new Date(Static199.method2845()));
						anIntArray266[anInt3182++] = aCalendar2.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray266[--anInt3182];
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
						anIntArray266[anInt3182++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray266[anInt3182++] = Static438.method5655() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray266[anInt3182++] = Static226.method590() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static73.anInt1749 == 10 && Static205.anInt3906 == 0 && Static341.anInt6053 == 0 && Static272.anInt4809 == 0) {
							anIntArray266[anInt3182++] = Static94.method1540() == -1 ? 0 : 1;
							return;
						}
						anIntArray266[anInt3182++] = 1;
						return;
					}
					@Pc(6160) Class214 local6160;
					@Pc(6127) Class84_Sub1 local6127;
					if (arg0 == 6501) {
						local6127 = Static85.method1459();
						if (local6127 != null) {
							anIntArray266[anInt3182++] = local6127.anInt6832;
							anIntArray266[anInt3182++] = local6127.anInt6822;
							aStringArray20[anInt3191++] = local6127.aString65;
							local6160 = local6127.method5301();
							anIntArray266[anInt3182++] = local6160.anInt6360;
							aStringArray20[anInt3191++] = local6160.aString59;
							anIntArray266[anInt3182++] = local6127.anInt6828;
							anIntArray266[anInt3182++] = local6127.anInt6835;
							return;
						}
						anIntArray266[anInt3182++] = -1;
						anIntArray266[anInt3182++] = 0;
						aStringArray20[anInt3191++] = "";
						anIntArray266[anInt3182++] = 0;
						aStringArray20[anInt3191++] = "";
						anIntArray266[anInt3182++] = 0;
						anIntArray266[anInt3182++] = 0;
						return;
					}
					if (arg0 == 6502) {
						local6127 = Static196.method2831();
						if (local6127 != null) {
							anIntArray266[anInt3182++] = local6127.anInt6832;
							anIntArray266[anInt3182++] = local6127.anInt6822;
							aStringArray20[anInt3191++] = local6127.aString65;
							local6160 = local6127.method5301();
							anIntArray266[anInt3182++] = local6160.anInt6360;
							aStringArray20[anInt3191++] = local6160.aString59;
							anIntArray266[anInt3182++] = local6127.anInt6828;
							anIntArray266[anInt3182++] = local6127.anInt6835;
							return;
						}
						anIntArray266[anInt3182++] = -1;
						anIntArray266[anInt3182++] = 0;
						aStringArray20[anInt3191++] = "";
						anIntArray266[anInt3182++] = 0;
						aStringArray20[anInt3191++] = "";
						anIntArray266[anInt3182++] = 0;
						anIntArray266[anInt3182++] = 0;
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray266[--anInt3182];
						if (Static73.anInt1749 == 10 && Static205.anInt3906 == 0 && Static341.anInt6053 == 0 && Static272.anInt4809 == 0) {
							anIntArray266[anInt3182++] = Static136.method1968(local157) ? 1 : 0;
							return;
						}
						anIntArray266[anInt3182++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static126.aClass67_Sub1_1.anInt5851 = anIntArray266[--anInt3182];
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						return;
					}
					if (arg0 == 6505) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.anInt5851;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray266[--anInt3182];
						@Pc(6476) Class84_Sub1 local6476 = Static246.method3391(local157);
						if (local6476 != null) {
							anIntArray266[anInt3182++] = local6476.anInt6822;
							aStringArray20[anInt3191++] = local6476.aString65;
							@Pc(6500) Class214 local6500 = local6476.method5301();
							anIntArray266[anInt3182++] = local6500.anInt6360;
							aStringArray20[anInt3191++] = local6500.aString59;
							anIntArray266[anInt3182++] = local6476.anInt6828;
							anIntArray266[anInt3182++] = local6476.anInt6835;
							return;
						}
						anIntArray266[anInt3182++] = -1;
						aStringArray20[anInt3191++] = "";
						anIntArray266[anInt3182++] = 0;
						aStringArray20[anInt3191++] = "";
						anIntArray266[anInt3182++] = 0;
						anIntArray266[anInt3182++] = 0;
						return;
					}
					if (arg0 == 6507) {
						anInt3182 -= 4;
						local157 = anIntArray266[anInt3182];
						local1313 = anIntArray266[anInt3182 + 1] == 1;
						local89 = anIntArray266[anInt3182 + 2];
						local1965 = anIntArray266[anInt3182 + 3] == 1;
						Static367.method5072(local89, local1313, local1965, local157);
						return;
					}
					if (arg0 == 6508) {
						Static433.method5557();
						return;
					}
					if (arg0 == 6509) {
						if (Static73.anInt1749 != 10) {
							return;
						}
						Static194.aBoolean282 = anIntArray266[--anInt3182] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static126.aClass67_Sub1_1.aBoolean402 = anIntArray266[--anInt3182] == 1;
						Static126.aClass67_Sub1_1.method4528(Static89.aClass114_3);
						return;
					}
					if (arg0 == 6601) {
						anIntArray266[anInt3182++] = Static126.aClass67_Sub1_1.aBoolean402 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static259.aClass170_2 == Static11.aClass170_1) {
					if (arg0 == 6700) {
						local157 = Static391.aClass196_37.method4473();
						if (Static404.anInt6892 != -1) {
							local157++;
						}
						anIntArray266[anInt3182++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray266[--anInt3182];
						if (Static404.anInt6892 != -1) {
							if (local157 == 0) {
								anIntArray266[anInt3182++] = Static404.anInt6892;
								return;
							}
							local157--;
						}
						@Pc(6758) Class4_Sub4 local6758 = (Class4_Sub4) Static391.aClass196_37.method4482();
						while (local157-- > 0) {
							local6758 = (Class4_Sub4) Static391.aClass196_37.method4472();
						}
						anIntArray266[anInt3182++] = local6758.anInt573;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray266[--anInt3182];
						if (Static320.aClass126ArrayArray2[local157] == null) {
							aStringArray20[anInt3191++] = "";
							return;
						}
						local81 = Static320.aClass126ArrayArray2[local157][0].aString39;
						if (local81 == null) {
							aStringArray20[anInt3191++] = "";
							return;
						}
						aStringArray20[anInt3191++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray266[--anInt3182];
						if (Static320.aClass126ArrayArray2[local157] == null) {
							anIntArray266[anInt3182++] = 0;
							return;
						}
						anIntArray266[anInt3182++] = Static320.aClass126ArrayArray2[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt3182 -= 2;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						if (Static320.aClass126ArrayArray2[local157] == null) {
							aStringArray20[anInt3191++] = "";
							return;
						}
						local3345 = Static320.aClass126ArrayArray2[local157][local192].aString39;
						if (local3345 == null) {
							aStringArray20[anInt3191++] = "";
							return;
						}
						aStringArray20[anInt3191++] = local3345;
						return;
					}
					if (arg0 == 6705) {
						anInt3182 -= 2;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						if (Static320.aClass126ArrayArray2[local157] == null) {
							anIntArray266[anInt3182++] = 0;
							return;
						}
						anIntArray266[anInt3182++] = Static320.aClass126ArrayArray2[local157][local192].anInt3452;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt3182 -= 3;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						local89 = anIntArray266[anInt3182 + 2];
						Static346.method4897(local89, 1, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6708) {
						anInt3182 -= 3;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						local89 = anIntArray266[anInt3182 + 2];
						Static346.method4897(local89, 2, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6709) {
						anInt3182 -= 3;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						local89 = anIntArray266[anInt3182 + 2];
						Static346.method4897(local89, 3, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6710) {
						anInt3182 -= 3;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						local89 = anIntArray266[anInt3182 + 2];
						Static346.method4897(local89, 4, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6711) {
						anInt3182 -= 3;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						local89 = anIntArray266[anInt3182 + 2];
						Static346.method4897(local89, 5, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6712) {
						anInt3182 -= 3;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						local89 = anIntArray266[anInt3182 + 2];
						Static346.method4897(local89, 6, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6713) {
						anInt3182 -= 3;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						local89 = anIntArray266[anInt3182 + 2];
						Static346.method4897(local89, 7, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6714) {
						anInt3182 -= 3;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						local89 = anIntArray266[anInt3182 + 2];
						Static346.method4897(local89, 8, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6715) {
						anInt3182 -= 3;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						local89 = anIntArray266[anInt3182 + 2];
						Static346.method4897(local89, 9, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6716) {
						anInt3182 -= 3;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						local89 = anIntArray266[anInt3182 + 2];
						Static346.method4897(local89, 10, local157 << 16 | local192, "");
						return;
					}
					if (arg0 == 6717) {
						anInt3182 -= 3;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						local89 = anIntArray266[anInt3182 + 2];
						@Pc(7346) Class126 local7346 = Static299.method4154(local157 << 16 | local192, local89);
						Static1.method29();
						@Pc(7351) Class4_Sub34 local7351 = Static55.method1118(local7346);
						Static409.method5390(local7351.method4447(), local7351.anInt5773, local7346);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7379) Class25 local7379;
					if (arg0 == 6800) {
						local157 = anIntArray266[--anInt3182];
						local7379 = Static236.aClass198_3.method4491(local157);
						if (local7379.aString8 == null) {
							aStringArray20[anInt3191++] = "";
							return;
						}
						aStringArray20[anInt3191++] = local7379.aString8;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray266[--anInt3182];
						local7379 = Static236.aClass198_3.method4491(local157);
						anIntArray266[anInt3182++] = local7379.anInt855;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray266[--anInt3182];
						local7379 = Static236.aClass198_3.method4491(local157);
						anIntArray266[anInt3182++] = local7379.anInt861;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray266[--anInt3182];
						local7379 = Static236.aClass198_3.method4491(local157);
						anIntArray266[anInt3182++] = local7379.anInt865;
						return;
					}
					if (arg0 == 6804) {
						anInt3182 -= 2;
						local157 = anIntArray266[anInt3182];
						local192 = anIntArray266[anInt3182 + 1];
						@Pc(7501) Class247 local7501 = Static110.aClass262_1.method5689(local192);
						if (local7501.method5431()) {
							aStringArray20[anInt3191++] = Static236.aClass198_3.method4491(local157).method663(local7501.aString69, local192);
							return;
						}
						anIntArray266[anInt3182++] = Static236.aClass198_3.method4491(local157).method667(local7501.anInt7035, local192);
						return;
					}
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	private static void method2504(@OriginalArg(0) int arg0) {
		@Pc(3) Class126 local3 = Static53.method1056(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class126[] local13 = Static70.aClass126ArrayArray4[local9];
		if (local13 == null) {
			@Pc(19) Class126[] local19 = Static320.aClass126ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static70.aClass126ArrayArray4[local9] = new Class126[local22];
			Static457.method1214(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static457.method1214(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V")
	public static void method2505(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static413.method5427(arg0)) {
			return;
		}
		@Pc(12) Class126[] local12 = Static320.aClass126ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class126 local19 = local12[local14];
			if (local19.anObjectArray21 != null) {
				@Pc(26) Class4_Sub40 local26 = new Class4_Sub40();
				local26.aClass126_16 = local19;
				local26.anObjectArray35 = local19.anObjectArray21;
				method2502(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method2506(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static189.anInt3643 == 0 && (Static386.aBoolean448 && !Static146.aBoolean200 || Static444.aBoolean494)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static448.aClass242_105.method5320(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static448.aClass242_105.method5320(0).length());
		} else if (local11.startsWith(Static223.aClass242_57.method5320(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static223.aClass242_57.method5320(0).length());
		} else if (local11.startsWith(Static21.aClass242_6.method5320(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static21.aClass242_6.method5320(0).length());
		} else if (local11.startsWith(Static321.aClass242_73.method5320(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static321.aClass242_73.method5320(0).length());
		} else if (local11.startsWith(Static369.aClass242_90.method5320(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static369.aClass242_90.method5320(0).length());
		} else if (local11.startsWith(Static51.aClass242_14.method5320(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static51.aClass242_14.method5320(0).length());
		} else if (local11.startsWith(Static223.aClass242_58.method5320(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static223.aClass242_58.method5320(0).length());
		} else if (local11.startsWith(Static328.aClass242_78.method5320(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static328.aClass242_78.method5320(0).length());
		} else if (local11.startsWith(Static374.aClass242_92.method5320(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static374.aClass242_92.method5320(0).length());
		} else if (local11.startsWith(Static41.aClass242_10.method5320(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static41.aClass242_10.method5320(0).length());
		} else if (local11.startsWith(Static107.aClass242_29.method5320(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static107.aClass242_29.method5320(0).length());
		} else if (local11.startsWith(Static176.aClass242_45.method5320(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static176.aClass242_45.method5320(0).length());
		} else if (Static139.anInt2670 != 0) {
			if (local11.startsWith(Static448.aClass242_105.method5320(Static139.anInt2670))) {
				local13 = 0;
				arg0 = arg0.substring(Static448.aClass242_105.method5320(Static139.anInt2670).length());
			} else if (local11.startsWith(Static223.aClass242_57.method5320(Static139.anInt2670))) {
				local13 = 1;
				arg0 = arg0.substring(Static223.aClass242_57.method5320(Static139.anInt2670).length());
			} else if (local11.startsWith(Static21.aClass242_6.method5320(Static139.anInt2670))) {
				local13 = 2;
				arg0 = arg0.substring(Static21.aClass242_6.method5320(Static139.anInt2670).length());
			} else if (local11.startsWith(Static321.aClass242_73.method5320(Static139.anInt2670))) {
				local13 = 3;
				arg0 = arg0.substring(Static321.aClass242_73.method5320(Static139.anInt2670).length());
			} else if (local11.startsWith(Static369.aClass242_90.method5320(Static139.anInt2670))) {
				local13 = 4;
				arg0 = arg0.substring(Static369.aClass242_90.method5320(Static139.anInt2670).length());
			} else if (local11.startsWith(Static51.aClass242_14.method5320(Static139.anInt2670))) {
				local13 = 5;
				arg0 = arg0.substring(Static51.aClass242_14.method5320(Static139.anInt2670).length());
			} else if (local11.startsWith(Static223.aClass242_58.method5320(Static139.anInt2670))) {
				local13 = 6;
				arg0 = arg0.substring(Static223.aClass242_58.method5320(Static139.anInt2670).length());
			} else if (local11.startsWith(Static328.aClass242_78.method5320(Static139.anInt2670))) {
				local13 = 7;
				arg0 = arg0.substring(Static328.aClass242_78.method5320(Static139.anInt2670).length());
			} else if (local11.startsWith(Static374.aClass242_92.method5320(Static139.anInt2670))) {
				local13 = 8;
				arg0 = arg0.substring(Static374.aClass242_92.method5320(Static139.anInt2670).length());
			} else if (local11.startsWith(Static41.aClass242_10.method5320(Static139.anInt2670))) {
				local13 = 9;
				arg0 = arg0.substring(Static41.aClass242_10.method5320(Static139.anInt2670).length());
			} else if (local11.startsWith(Static107.aClass242_29.method5320(Static139.anInt2670))) {
				local13 = 10;
				arg0 = arg0.substring(Static107.aClass242_29.method5320(Static139.anInt2670).length());
			} else if (local11.startsWith(Static176.aClass242_45.method5320(Static139.anInt2670))) {
				local13 = 11;
				arg0 = arg0.substring(Static176.aClass242_45.method5320(Static139.anInt2670).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static77.aClass242_21.method5320(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static77.aClass242_21.method5320(0).length());
		} else if (local11.startsWith(Static110.aClass242_31.method5320(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static110.aClass242_31.method5320(0).length());
		} else if (local11.startsWith(Static222.aClass242_56.method5320(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static222.aClass242_56.method5320(0).length());
		} else if (local11.startsWith(Static10.aClass242_4.method5320(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static10.aClass242_4.method5320(0).length());
		} else if (local11.startsWith(Static371.aClass242_91.method5320(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static371.aClass242_91.method5320(0).length());
		} else if (Static139.anInt2670 != 0) {
			if (local11.startsWith(Static77.aClass242_21.method5320(Static139.anInt2670))) {
				local451 = 1;
				arg0 = arg0.substring(Static77.aClass242_21.method5320(Static139.anInt2670).length());
			} else if (local11.startsWith(Static110.aClass242_31.method5320(Static139.anInt2670))) {
				local451 = 2;
				arg0 = arg0.substring(Static110.aClass242_31.method5320(Static139.anInt2670).length());
			} else if (local11.startsWith(Static222.aClass242_56.method5320(Static139.anInt2670))) {
				local451 = 3;
				arg0 = arg0.substring(Static222.aClass242_56.method5320(Static139.anInt2670).length());
			} else if (local11.startsWith(Static10.aClass242_4.method5320(Static139.anInt2670))) {
				local451 = 4;
				arg0 = arg0.substring(Static10.aClass242_4.method5320(Static139.anInt2670).length());
			} else if (local11.startsWith(Static371.aClass242_91.method5320(Static139.anInt2670))) {
				local451 = 5;
				arg0 = arg0.substring(Static371.aClass242_91.method5320(Static139.anInt2670).length());
			}
		}
		Static209.method2982(Static77.aClass36_39);
		Static116.aClass4_Sub30_Sub1_1.method4871(0);
		@Pc(646) int local646 = Static116.aClass4_Sub30_Sub1_1.anInt6244;
		if (arg1 == 5021) {
			Static116.aClass4_Sub30_Sub1_1.method4871(1);
		} else if (arg1 == 5022) {
			Static116.aClass4_Sub30_Sub1_1.method4871(2);
		} else {
			Static116.aClass4_Sub30_Sub1_1.method4871(0);
		}
		Static116.aClass4_Sub30_Sub1_1.method4871(local13);
		Static116.aClass4_Sub30_Sub1_1.method4871(local451);
		Static75.method1364(arg0, Static116.aClass4_Sub30_Sub1_1);
		Static116.aClass4_Sub30_Sub1_1.method4842(Static116.aClass4_Sub30_Sub1_1.anInt6244 - local646);
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V")
	private static void method2507(@OriginalArg(0) int arg0) {
		@Pc(3) Class126 local3 = Static53.method1056(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class126[] local13 = Static70.aClass126ArrayArray4[local9];
		if (local13 == null) {
			@Pc(19) Class126[] local19 = Static320.aClass126ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static70.aClass126ArrayArray4[local9] = new Class126[local22];
			Static457.method1214(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static457.method1214(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "()V")
	public static void method2508() {
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!gl;II)V")
	public static void method2509(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class4_Sub1_Sub4 local5 = Static296.method4106(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray264 = new int[local5.anInt1386];
		aStringArray21 = new String[local5.anInt1384];
		if (local5.aClass93_4 == Static119.aClass93_5 || local5.aClass93_4 == Static407.aClass93_9 || local5.aClass93_4 == Static352.aClass93_6) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static124.aClass126_5 != null) {
				local30 = Static124.aClass126_5.anInt3406;
				local32 = Static124.aClass126_5.anInt3415;
			}
			anIntArray264[0] = Static284.aClass12_1.method4220() - local30;
			anIntArray264[1] = Static284.aClass12_1.method4219() - local32;
		}
		method2512(local5, 200000);
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method2511(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray22[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!ci;I)V")
	private static void method2512(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		anInt3182 = 0;
		anInt3191 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray86;
		@Pc(11) int[] local11 = arg0.anIntArray88;
		@Pc(13) byte local13 = -1;
		anInt3185 = 0;
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
						method2515(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method2503(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray266[anInt3182++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray266[anInt3182++] = Static155.aClass149_1.anIntArray344[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static155.aClass149_1.method3219(anIntArray266[--anInt3182], local54);
					} else if (local31 == 3) {
						aStringArray20[anInt3191++] = arg0.aStringArray7[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt3182 -= 2;
						if (anIntArray266[anInt3182] != anIntArray266[anInt3182 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt3182 -= 2;
						if (anIntArray266[anInt3182] == anIntArray266[anInt3182 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt3182 -= 2;
						if (anIntArray266[anInt3182] < anIntArray266[anInt3182 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt3182 -= 2;
						if (anIntArray266[anInt3182] > anIntArray266[anInt3182 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt3185 == 0) {
							return;
						}
						@Pc(216) Class111 local216 = aClass111Array1[--anInt3185];
						arg0 = local216.aClass4_Sub1_Sub4_1;
						local8 = arg0.anIntArray86;
						local11 = arg0.anIntArray88;
						local5 = local216.anInt2978;
						anIntArray264 = local216.anIntArray248;
						aStringArray21 = local216.aStringArray19;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray266[anInt3182++] = Static155.aClass149_1.method3212(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static155.aClass149_1.method3218(local54, anIntArray266[--anInt3182]);
					} else if (local31 == 31) {
						anInt3182 -= 2;
						if (anIntArray266[anInt3182] <= anIntArray266[anInt3182 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt3182 -= 2;
						if (anIntArray266[anInt3182] >= anIntArray266[anInt3182 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray266[anInt3182++] = anIntArray264[local11[local5]];
					} else if (local31 == 34) {
						anIntArray264[local11[local5]] = anIntArray266[--anInt3182];
					} else if (local31 == 35) {
						aStringArray20[anInt3191++] = aStringArray21[local11[local5]];
					} else if (local31 == 36) {
						aStringArray21[local11[local5]] = aStringArray20[--anInt3191];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt3191 -= local54;
						@Pc(400) String local400 = Static398.method5290(local54, aStringArray20, anInt3191);
						aStringArray20[anInt3191++] = local400;
					} else if (local31 == 38) {
						anInt3182--;
					} else if (local31 == 39) {
						anInt3191--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class4_Sub1_Sub4 local436 = Static319.method4403(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt1386];
							@Pc(450) String[] local450 = new String[local436.anInt1384];
							for (local452 = 0; local452 < local436.anInt1383; local452++) {
								local446[local452] = anIntArray266[anInt3182 + local452 - local436.anInt1383];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt1385; local471++) {
								local450[local471] = aStringArray20[anInt3191 + local471 - local436.anInt1385];
							}
							anInt3182 -= local436.anInt1383;
							anInt3191 -= local436.anInt1385;
							@Pc(502) Class111 local502 = new Class111();
							local502.aClass4_Sub1_Sub4_1 = arg0;
							local502.anInt2978 = local5;
							local502.anIntArray248 = anIntArray264;
							local502.aStringArray19 = aStringArray21;
							if (anInt3185 >= aClass111Array1.length) {
								throw new RuntimeException();
							}
							aClass111Array1[anInt3185++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray86;
							local11 = local436.anIntArray88;
							local5 = -1;
							anIntArray264 = local446;
							aStringArray21 = local450;
						} else if (local31 == 42) {
							anIntArray266[anInt3182++] = Static327.anIntArray505[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static327.anIntArray505[local54] = anIntArray266[--anInt3182];
							Static112.method1771(local54);
							Static111.aBoolean437 |= Static291.aBooleanArray18[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray266[--anInt3182];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray265[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray31[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray266[--anInt3182];
							if (local603 < 0 || local603 >= anIntArray265[local54]) {
								throw new RuntimeException();
							}
							anIntArray266[anInt3182++] = anIntArrayArray31[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt3182 -= 2;
							local603 = anIntArray266[anInt3182];
							if (local603 < 0 || local603 >= anIntArray265[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray31[local54][local603] = anIntArray266[anInt3182 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static78.aStringArray11[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray20[anInt3191++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static78.aStringArray11[local54] = aStringArray20[--anInt3191];
							Static307.method5823(local54);
						} else if (local31 == 51) {
							@Pc(774) Class196 local774 = arg0.aClass196Array1[local11[local5]];
							@Pc(787) Class4_Sub15 local787 = (Class4_Sub15) local774.method4477((long) anIntArray266[--anInt3182]);
							if (local787 != null) {
								local5 += local787.anInt2603;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString17 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong225).append(" ");
				for (local603 = anInt3185 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass111Array1[local603].aClass4_Sub1_Sub4_1.aLong225).append(" ");
				}
				local855.append("op: ").append(local13);
				Static273.method3690(local855.toString(), local837);
			} else {
				Static196.method2835("Clientscript error in: " + arg0.aString17);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString17).append("\n");
				for (local603 = anInt3185 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass111Array1[local603].aClass4_Sub1_Sub4_1.aString17).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static273.method3690(local855.toString(), local837);
				Static267.method3631(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!uk;)V")
	public static void method2513(@OriginalArg(0) Class4_Sub40 arg0) {
		method2502(arg0, 200000);
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(IZ)V")
	public static void method2514() {
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(IZ)V")
	private static void method2515(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class126 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class126 local35;
		@Pc(13) int local13;
		@Pc(210) Class126 local210;
		@Pc(158) Class126 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt3182 -= 3;
				local13 = anIntArray266[anInt3182];
				local19 = anIntArray266[anInt3182 + 1];
				local25 = anIntArray266[anInt3182 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static53.method1056(local13);
				if (local35.aClass126Array3 == null) {
					local35.aClass126Array3 = new Class126[local25 + 1];
				}
				if (local35.aClass126Array3.length <= local25) {
					@Pc(54) Class126[] local54 = new Class126[local25 + 1];
					for (local56 = 0; local56 < local35.aClass126Array3.length; local56++) {
						local54[local56] = local35.aClass126Array3[local56];
					}
					local35.aClass126Array3 = local54;
				}
				if (local25 > 0 && local35.aClass126Array3[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class126 local99 = new Class126();
				local99.anInt3426 = local19;
				local99.anInt3405 = local99.anInt3397 = local35.anInt3397;
				local99.anInt3392 = local25;
				local35.aClass126Array3[local25] = local99;
				if (arg1) {
					aClass126_8 = local99;
				} else {
					aClass126_7 = local99;
				}
				Static430.method5524(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass126_8 : aClass126_7;
				if (local137.anInt3392 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static53.method1056(local137.anInt3397);
				local158.aClass126Array3[local137.anInt3392] = null;
				Static430.method5524(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static53.method1056(anIntArray266[--anInt3182]);
				local137.aClass126Array3 = null;
				Static430.method5524(local137);
				return;
			}
			if (arg0 == 200) {
				anInt3182 -= 2;
				local13 = anIntArray266[anInt3182];
				local19 = anIntArray266[anInt3182 + 1];
				local210 = Static299.method4154(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray266[anInt3182++] = 1;
					if (arg1) {
						aClass126_8 = local210;
						return;
					}
					aClass126_7 = local210;
					return;
				}
				anIntArray266[anInt3182++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray266[--anInt3182];
				local158 = Static53.method1056(local13);
				if (local158 != null) {
					anIntArray266[anInt3182++] = 1;
					if (arg1) {
						aClass126_8 = local158;
						return;
					}
					aClass126_7 = local158;
					return;
				}
				anIntArray266[anInt3182++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray266[--anInt3182];
				method2507(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray266[--anInt3182];
				method2504(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt3182 -= 2;
					local13 = anIntArray266[anInt3182];
					local19 = anIntArray266[anInt3182 + 1];
					for (local25 = 0; local25 < Static420.anIntArray672.length; local25++) {
						if (Static420.anIntArray672[local25] == local13) {
							Static375.aClass6_Sub2_Sub1_Sub1_3.aClass188_1.method4324(local19, Static116.aClass50_1, local25);
							return;
						}
					}
					for (local353 = 0; local353 < Static139.anIntArray178.length; local353++) {
						if (Static139.anIntArray178[local353] == local13) {
							Static375.aClass6_Sub2_Sub1_Sub1_3.aClass188_1.method4324(local19, Static116.aClass50_1, local353);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt3182 -= 2;
					local13 = anIntArray266[anInt3182];
					local19 = anIntArray266[anInt3182 + 1];
					Static375.aClass6_Sub2_Sub1_Sub1_3.aClass188_1.method4322(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray266[--anInt3182] != 0;
					Static375.aClass6_Sub2_Sub1_Sub1_3.aClass188_1.method4320(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static53.method1056(anIntArray266[--anInt3182]);
					} else {
						local137 = arg1 ? aClass126_8 : aClass126_7;
					}
					if (arg0 == 1100) {
						anInt3182 -= 2;
						local137.anInt3458 = anIntArray266[anInt3182];
						if (local137.anInt3458 > local137.anInt3391 - local137.anInt3421) {
							local137.anInt3458 = local137.anInt3391 - local137.anInt3421;
						}
						if (local137.anInt3458 < 0) {
							local137.anInt3458 = 0;
						}
						local137.anInt3444 = anIntArray266[anInt3182 + 1];
						if (local137.anInt3444 > local137.anInt3386 - local137.anInt3442) {
							local137.anInt3444 = local137.anInt3386 - local137.anInt3442;
						}
						if (local137.anInt3444 < 0) {
							local137.anInt3444 = 0;
						}
						Static430.method5524(local137);
						if (local137.anInt3392 == -1) {
							Static381.method5200(local137.anInt3397);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt3459 = anIntArray266[--anInt3182];
						Static430.method5524(local137);
						if (local137.anInt3392 == -1) {
							Static241.method3325(local137.anInt3397);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean249 = anIntArray266[--anInt3182] == 1;
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt3422 = anIntArray266[--anInt3182];
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt3400 = anIntArray266[--anInt3182];
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray266[--anInt3182];
						if (local137.anInt3394 != local19) {
							local137.anInt3394 = local19;
							Static430.method5524(local137);
						}
						if (local137.anInt3392 == -1) {
							Static399.method5303(local137.anInt3397);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt3423 = anIntArray266[--anInt3182];
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean254 = anIntArray266[--anInt3182] == 1;
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt3439 = 1;
						local137.anInt3428 = anIntArray266[--anInt3182];
						Static430.method5524(local137);
						if (local137.anInt3392 == -1) {
							Static197.method5040(local137.anInt3397);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt3182 -= 6;
						local137.anInt3403 = anIntArray266[anInt3182];
						local137.anInt3416 = anIntArray266[anInt3182 + 1];
						local137.anInt3393 = anIntArray266[anInt3182 + 2];
						local137.anInt3408 = anIntArray266[anInt3182 + 3];
						local137.anInt3420 = anIntArray266[anInt3182 + 4];
						local137.anInt3460 = anIntArray266[anInt3182 + 5];
						Static430.method5524(local137);
						if (local137.anInt3392 == -1) {
							Static94.method1546(local137.anInt3397);
							Static229.method3193(local137.anInt3397);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray266[--anInt3182];
						if (local137.anInt3468 != local19) {
							local137.anInt3468 = local19;
							local137.anInt3455 = 0;
							local137.anInt3414 = 1;
							local137.anInt3384 = 0;
							Static430.method5524(local137);
						}
						if (local137.anInt3392 == -1) {
							Static67.method1268(local137.anInt3397);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean258 = anIntArray266[--anInt3182] == 1;
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray20[--anInt3191];
						if (!local1101.equals(local137.aString42)) {
							local137.aString42 = local1101;
							Static430.method5524(local137);
						}
						if (local137.anInt3392 == -1) {
							Static179.method2616(local137.anInt3397);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt3413 = anIntArray266[--anInt3182];
						Static430.method5524(local137);
						if (local137.anInt3392 == -1) {
							Static426.method4728(local137.anInt3397);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt3182 -= 3;
						local137.anInt3462 = anIntArray266[anInt3182];
						local137.anInt3424 = anIntArray266[anInt3182 + 1];
						local137.anInt3407 = anIntArray266[anInt3182 + 2];
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean256 = anIntArray266[--anInt3182] == 1;
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt3454 = anIntArray266[--anInt3182];
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt3446 = anIntArray266[--anInt3182];
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean246 = anIntArray266[--anInt3182] == 1;
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean260 = anIntArray266[--anInt3182] == 1;
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt3182 -= 2;
						local137.anInt3391 = anIntArray266[anInt3182];
						local137.anInt3386 = anIntArray266[anInt3182 + 1];
						Static430.method5524(local137);
						if (local137.anInt3426 == 0) {
							Static114.method1812(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt3182 -= 2;
						local137.anInt3427 = (short) anIntArray266[anInt3182];
						local137.anInt3463 = (short) anIntArray266[anInt3182 + 1];
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean247 = anIntArray266[--anInt3182] == 1;
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt3460 = anIntArray266[--anInt3182];
						Static430.method5524(local137);
						if (local137.anInt3392 == -1) {
							Static94.method1546(local137.anInt3397);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray266[--anInt3182];
						local137.aBoolean255 = local19 == 1;
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt3182 -= 2;
						local137.anInt3431 = anIntArray266[anInt3182];
						local137.anInt3387 = anIntArray266[anInt3182 + 1];
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt3404 = anIntArray266[--anInt3182];
						Static430.method5524(local137);
						return;
					}
					@Pc(1454) Class247 local1454;
					if (arg0 == 1127) {
						anInt3182 -= 2;
						local19 = anIntArray266[anInt3182];
						local25 = anIntArray266[anInt3182 + 1];
						local1454 = Static110.aClass262_1.method5689(local19);
						if (local25 != local1454.anInt7035) {
							local137.method2676(local19, local25);
							return;
						}
						local137.method2673(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray266[--anInt3182];
						local1488 = aStringArray20[--anInt3191];
						local1454 = Static110.aClass262_1.method5689(local19);
						if (!local1454.aString69.equals(local1488)) {
							local137.method2668(local19, local1488);
							return;
						}
						local137.method2673(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static53.method1056(anIntArray266[--anInt3182]);
						} else {
							local137 = arg1 ? aClass126_8 : aClass126_7;
						}
						if (arg0 == 1300) {
							local19 = anIntArray266[--anInt3182] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method2672(local19, aStringArray20[--anInt3191]);
								return;
							}
							anInt3191--;
							return;
						}
						if (arg0 == 1301) {
							anInt3182 -= 2;
							local19 = anIntArray266[anInt3182];
							local25 = anIntArray266[anInt3182 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass126_9 = null;
								return;
							}
							local137.aClass126_9 = Static299.method4154(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray266[--anInt3182];
							if (local19 != Static442.anInt7386 && local19 != Static213.anInt3997 && local19 != Static149.anInt2832) {
								return;
							}
							local137.anInt3471 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt3390 = anIntArray266[--anInt3182];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt3432 = anIntArray266[--anInt3182];
							return;
						}
						if (arg0 == 1305) {
							local137.aString38 = aStringArray20[--anInt3191];
							return;
						}
						if (arg0 == 1306) {
							local137.aString41 = aStringArray20[--anInt3191];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray24 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt3417 = anIntArray266[--anInt3182];
							local137.anInt3469 = anIntArray266[--anInt3182];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray266[--anInt3182];
							local25 = anIntArray266[--anInt3182];
							if (local25 >= 1 && local25 <= 10) {
								local137.method2675(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString40 = aStringArray20[--anInt3191];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt3466 = anIntArray266[--anInt3182];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt3182 -= 3;
								local19 = anIntArray266[anInt3182] - 1;
								local25 = anIntArray266[anInt3182 + 1];
								local353 = anIntArray266[anInt3182 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt3182 -= 2;
								local19 = 10;
								local25 = anIntArray266[anInt3182];
								local353 = anIntArray266[anInt3182 + 1];
							}
							if (local137.aByteArray36 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray36 = new byte[11];
								local137.aByteArray35 = new byte[11];
								local137.anIntArray281 = new int[11];
							}
							local137.aByteArray36[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean245 = false;
								for (local2290 = 0; local2290 < local137.aByteArray36.length; local2290++) {
									if (local137.aByteArray36[local2290] != 0) {
										local137.aBoolean245 = true;
										break;
									}
								}
							} else {
								local137.aBoolean245 = true;
							}
							local137.aByteArray35[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt3457 = anIntArray266[--anInt3182];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static53.method1056(anIntArray266[--anInt3182]);
						} else {
							local137 = arg1 ? aClass126_8 : aClass126_7;
						}
						local1101 = aStringArray20[--anInt3191];
						@Pc(2369) int[] local2369 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray266[--anInt3182];
							if (local353 > 0) {
								local2369 = new int[local353];
								while (local353-- > 0) {
									local2369[local353] = anIntArray266[--anInt3182];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
						for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2421[local2290] = aStringArray20[--anInt3191];
							} else {
								local2421[local2290] = Integer.valueOf(anIntArray266[--anInt3182]);
							}
						}
						local56 = anIntArray266[--anInt3182];
						if (local56 == -1) {
							local2421 = null;
						} else {
							local2421[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray29 = local2421;
						} else if (arg0 == 1401) {
							local137.anObjectArray26 = local2421;
						} else if (arg0 == 1402) {
							local137.anObjectArray30 = local2421;
						} else if (arg0 == 1403) {
							local137.anObjectArray22 = local2421;
						} else if (arg0 == 1404) {
							local137.anObjectArray10 = local2421;
						} else if (arg0 == 1405) {
							local137.anObjectArray32 = local2421;
						} else if (arg0 == 1406) {
							local137.anObjectArray7 = local2421;
						} else if (arg0 == 1407) {
							local137.anObjectArray23 = local2421;
							local137.anIntArray287 = local2369;
						} else if (arg0 == 1408) {
							local137.anObjectArray27 = local2421;
						} else if (arg0 == 1409) {
							local137.anObjectArray20 = local2421;
						} else if (arg0 == 1410) {
							local137.anObjectArray25 = local2421;
						} else if (arg0 == 1411) {
							local137.anObjectArray15 = local2421;
						} else if (arg0 == 1412) {
							local137.anObjectArray3 = local2421;
						} else if (arg0 == 1414) {
							local137.anObjectArray12 = local2421;
							local137.anIntArray280 = local2369;
						} else if (arg0 == 1415) {
							local137.anObjectArray19 = local2421;
							local137.anIntArray288 = local2369;
						} else if (arg0 == 1416) {
							local137.anObjectArray16 = local2421;
						} else if (arg0 == 1417) {
							local137.anObjectArray24 = local2421;
						} else if (arg0 == 1418) {
							local137.anObjectArray11 = local2421;
						} else if (arg0 == 1419) {
							local137.anObjectArray13 = local2421;
						} else if (arg0 == 1420) {
							local137.anObjectArray18 = local2421;
						} else if (arg0 == 1421) {
							local137.anObjectArray9 = local2421;
						} else if (arg0 == 1422) {
							local137.anObjectArray4 = local2421;
						} else if (arg0 == 1423) {
							local137.anObjectArray14 = local2421;
						} else if (arg0 == 1424) {
							local137.anObjectArray6 = local2421;
						} else if (arg0 == 1425) {
							local137.anObjectArray5 = local2421;
						} else if (arg0 == 1426) {
							local137.anObjectArray17 = local2421;
						} else if (arg0 == 1427) {
							local137.anObjectArray28 = local2421;
						} else if (arg0 == 1428) {
							local137.anObjectArray8 = local2421;
							local137.anIntArray286 = local2369;
						} else if (arg0 == 1429) {
							local137.lb = local2421;
							local137.anIntArray283 = local2369;
						} else if (arg0 == 1430) {
							local137.anObjectArray31 = local2421;
						}
						local137.aBoolean248 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass126_8 : aClass126_7;
						if (arg0 == 1500) {
							anIntArray266[anInt3182++] = local137.anInt3406;
							return;
						}
						if (arg0 == 1501) {
							anIntArray266[anInt3182++] = local137.anInt3415;
							return;
						}
						if (arg0 == 1502) {
							anIntArray266[anInt3182++] = local137.anInt3421;
							return;
						}
						if (arg0 == 1503) {
							anIntArray266[anInt3182++] = local137.anInt3442;
							return;
						}
						if (arg0 == 1504) {
							anIntArray266[anInt3182++] = local137.aBoolean252 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray266[anInt3182++] = local137.anInt3405;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static389.method5245(local137);
							anIntArray266[anInt3182++] = local158 == null ? -1 : local158.anInt3397;
							return;
						}
					} else {
						@Pc(3017) Class247 local3017;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass126_8 : aClass126_7;
							if (arg0 == 1600) {
								anIntArray266[anInt3182++] = local137.anInt3458;
								return;
							}
							if (arg0 == 1601) {
								anIntArray266[anInt3182++] = local137.anInt3444;
								return;
							}
							if (arg0 == 1602) {
								aStringArray20[anInt3191++] = local137.aString42;
								return;
							}
							if (arg0 == 1603) {
								anIntArray266[anInt3182++] = local137.anInt3391;
								return;
							}
							if (arg0 == 1604) {
								anIntArray266[anInt3182++] = local137.anInt3386;
								return;
							}
							if (arg0 == 1605) {
								anIntArray266[anInt3182++] = local137.anInt3460;
								return;
							}
							if (arg0 == 1606) {
								anIntArray266[anInt3182++] = local137.anInt3393;
								return;
							}
							if (arg0 == 1607) {
								anIntArray266[anInt3182++] = local137.anInt3420;
								return;
							}
							if (arg0 == 1608) {
								anIntArray266[anInt3182++] = local137.anInt3408;
								return;
							}
							if (arg0 == 1609) {
								anIntArray266[anInt3182++] = local137.anInt3422;
								return;
							}
							if (arg0 == 1610) {
								anIntArray266[anInt3182++] = local137.anInt3403;
								return;
							}
							if (arg0 == 1611) {
								anIntArray266[anInt3182++] = local137.anInt3416;
								return;
							}
							if (arg0 == 1612) {
								anIntArray266[anInt3182++] = local137.anInt3394;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray266[--anInt3182];
								local3017 = Static110.aClass262_1.method5689(local19);
								if (local3017.method5431()) {
									aStringArray20[anInt3191++] = local137.method2669(local3017.aString69, local19);
								} else {
									anIntArray266[anInt3182++] = local137.method2670(local19, local3017.anInt7035);
								}
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass126_8 : aClass126_7;
							if (arg0 == 1700) {
								anIntArray266[anInt3182++] = local137.anInt3395;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt3395 != -1) {
									anIntArray266[anInt3182++] = local137.anInt3383;
									return;
								}
								anIntArray266[anInt3182++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray266[anInt3182++] = local137.anInt3392;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass126_8 : aClass126_7;
							if (arg0 == 1800) {
								anIntArray266[anInt3182++] = Static55.method1118(local137).method4447();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray266[--anInt3182];
								local19--;
								if (local137.aStringArray24 != null && local19 < local137.aStringArray24.length && local137.aStringArray24[local19] != null) {
									aStringArray20[anInt3191++] = local137.aStringArray24[local19];
									return;
								}
								aStringArray20[anInt3191++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString38 == null) {
									aStringArray20[anInt3191++] = "";
									return;
								}
								aStringArray20[anInt3191++] = local137.aString38;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static53.method1056(anIntArray266[--anInt3182]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass126_8 : aClass126_7;
							}
							if (anInt3196 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray28 == null) {
									return;
								}
								@Pc(3254) Class4_Sub40 local3254 = new Class4_Sub40();
								local3254.aClass126_16 = local137;
								local3254.anObjectArray35 = local137.anObjectArray28;
								local3254.anInt6873 = anInt3196 + 1;
								Static447.aClass258_49.method5526(local3254);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static53.method1056(anIntArray266[--anInt3182]);
							if (arg0 == 2500) {
								anIntArray266[anInt3182++] = local137.anInt3406;
								return;
							}
							if (arg0 == 2501) {
								anIntArray266[anInt3182++] = local137.anInt3415;
								return;
							}
							if (arg0 == 2502) {
								anIntArray266[anInt3182++] = local137.anInt3421;
								return;
							}
							if (arg0 == 2503) {
								anIntArray266[anInt3182++] = local137.anInt3442;
								return;
							}
							if (arg0 == 2504) {
								anIntArray266[anInt3182++] = local137.aBoolean252 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray266[anInt3182++] = local137.anInt3405;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static389.method5245(local137);
								anIntArray266[anInt3182++] = local158 == null ? -1 : local158.anInt3397;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static53.method1056(anIntArray266[--anInt3182]);
							if (arg0 == 2600) {
								anIntArray266[anInt3182++] = local137.anInt3458;
								return;
							}
							if (arg0 == 2601) {
								anIntArray266[anInt3182++] = local137.anInt3444;
								return;
							}
							if (arg0 == 2602) {
								aStringArray20[anInt3191++] = local137.aString42;
								return;
							}
							if (arg0 == 2603) {
								anIntArray266[anInt3182++] = local137.anInt3391;
								return;
							}
							if (arg0 == 2604) {
								anIntArray266[anInt3182++] = local137.anInt3386;
								return;
							}
							if (arg0 == 2605) {
								anIntArray266[anInt3182++] = local137.anInt3460;
								return;
							}
							if (arg0 == 2606) {
								anIntArray266[anInt3182++] = local137.anInt3393;
								return;
							}
							if (arg0 == 2607) {
								anIntArray266[anInt3182++] = local137.anInt3420;
								return;
							}
							if (arg0 == 2608) {
								anIntArray266[anInt3182++] = local137.anInt3408;
								return;
							}
							if (arg0 == 2609) {
								anIntArray266[anInt3182++] = local137.anInt3422;
								return;
							}
							if (arg0 == 2610) {
								anIntArray266[anInt3182++] = local137.anInt3403;
								return;
							}
							if (arg0 == 2611) {
								anIntArray266[anInt3182++] = local137.anInt3416;
								return;
							}
							if (arg0 == 2612) {
								anIntArray266[anInt3182++] = local137.anInt3394;
								return;
							}
						} else {
							@Pc(3751) Class4_Sub4 local3751;
							@Pc(3649) Class4_Sub4 local3649;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static53.method1056(anIntArray266[--anInt3182]);
									anIntArray266[anInt3182++] = local137.anInt3395;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static53.method1056(anIntArray266[--anInt3182]);
									if (local137.anInt3395 != -1) {
										anIntArray266[anInt3182++] = local137.anInt3383;
										return;
									}
									anIntArray266[anInt3182++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray266[--anInt3182];
									local3649 = (Class4_Sub4) Static391.aClass196_37.method4477((long) local13);
									if (local3649 != null) {
										anIntArray266[anInt3182++] = 1;
										return;
									}
									anIntArray266[anInt3182++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static53.method1056(anIntArray266[--anInt3182]);
									if (local137.aClass126Array3 == null) {
										anIntArray266[anInt3182++] = 0;
										return;
									}
									local19 = local137.aClass126Array3.length;
									for (local25 = 0; local25 < local137.aClass126Array3.length; local25++) {
										if (local137.aClass126Array3[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray266[anInt3182++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt3182 -= 2;
									local13 = anIntArray266[anInt3182];
									local19 = anIntArray266[anInt3182 + 1];
									local3751 = (Class4_Sub4) Static391.aClass196_37.method4477((long) local13);
									if (local3751 != null && local3751.anInt573 == local19) {
										anIntArray266[anInt3182++] = 1;
										return;
									}
									anIntArray266[anInt3182++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static53.method1056(anIntArray266[--anInt3182]);
								if (arg0 == 2800) {
									anIntArray266[anInt3182++] = Static55.method1118(local137).method4447();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray266[--anInt3182];
									local19--;
									if (local137.aStringArray24 != null && local19 < local137.aStringArray24.length && local137.aStringArray24[local19] != null) {
										aStringArray20[anInt3191++] = local137.aStringArray24[local19];
										return;
									}
									aStringArray20[anInt3191++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString38 == null) {
										aStringArray20[anInt3191++] = "";
										return;
									}
									aStringArray20[anInt3191++] = local137.aString38;
									return;
								}
							} else {
								@Pc(3888) String local3888;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3888 = aStringArray20[--anInt3191];
										Static196.method2835(local3888);
										return;
									}
									if (arg0 == 3101) {
										anInt3182 -= 2;
										Static443.method5694(anIntArray266[anInt3182 + 1], anIntArray266[anInt3182], Static375.aClass6_Sub2_Sub1_Sub1_3);
										return;
									}
									if (arg0 == 3103) {
										Static196.method2829();
										return;
									}
									if (arg0 == 3104) {
										local3888 = aStringArray20[--anInt3191];
										local19 = 0;
										if (Static30.method548(local3888)) {
											local19 = Static297.method4115(local3888);
										}
										Static209.method2982(Static208.aClass36_75);
										Static116.aClass4_Sub30_Sub1_1.method4861(local19);
										return;
									}
									if (arg0 == 3105) {
										local3888 = aStringArray20[--anInt3191];
										Static209.method2982(Static453.aClass36_132);
										Static116.aClass4_Sub30_Sub1_1.method4871(local3888.length() + 1);
										Static116.aClass4_Sub30_Sub1_1.method4849(local3888);
										return;
									}
									if (arg0 == 3106) {
										local3888 = aStringArray20[--anInt3191];
										Static209.method2982(Static331.aClass36_104);
										Static116.aClass4_Sub30_Sub1_1.method4871(local3888.length() + 1);
										Static116.aClass4_Sub30_Sub1_1.method4849(local3888);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray266[--anInt3182];
										local1101 = aStringArray20[--anInt3191];
										Static299.method4153(local13, local1101);
										return;
									}
									if (arg0 == 3108) {
										anInt3182 -= 3;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										local25 = anIntArray266[anInt3182 + 2];
										local35 = Static53.method1056(local25);
										Static292.method4054(local19, local13, local35);
										return;
									}
									if (arg0 == 3109) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										local210 = arg1 ? aClass126_8 : aClass126_7;
										Static292.method4054(local19, local13, local210);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray266[--anInt3182];
										Static209.method2982(Static63.aClass36_31);
										Static116.aClass4_Sub30_Sub1_1.method4846(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										local3751 = (Class4_Sub4) Static391.aClass196_37.method4477((long) local13);
										if (local3751 != null) {
											Static219.method3100(true, local3751, local3751.anInt573 != local19);
										}
										Static451.method5798(3, local19, true, local13);
										return;
									}
									if (arg0 == 3112) {
										anInt3182--;
										local13 = anIntArray266[anInt3182];
										local3649 = (Class4_Sub4) Static391.aClass196_37.method4477((long) local13);
										if (local3649 != null && local3649.anInt574 == 3) {
											Static219.method3100(true, local3649, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static185.method5255(aStringArray20[--anInt3191]);
										return;
									}
									if (arg0 == 3114) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										local1488 = aStringArray20[--anInt3191];
										Static262.method3576(local1488, "", local13, local19, "");
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt3182 -= 3;
										Static350.method4918(anIntArray266[anInt3182 + 1], 255, anIntArray266[anInt3182 + 2], anIntArray266[anInt3182]);
										return;
									}
									if (arg0 == 3201) {
										Static187.method2764(anIntArray266[--anInt3182], 255, 50);
										return;
									}
									if (arg0 == 3202) {
										anInt3182 -= 2;
										Static323.method4439(anIntArray266[anInt3182 + 1], anIntArray266[anInt3182], 255);
										return;
									}
									if (arg0 == 3203) {
										anInt3182 -= 4;
										Static350.method4918(anIntArray266[anInt3182 + 1], anIntArray266[anInt3182 + 3], anIntArray266[anInt3182 + 2], anIntArray266[anInt3182]);
										return;
									}
									if (arg0 == 3204) {
										anInt3182 -= 3;
										Static187.method2764(anIntArray266[anInt3182], anIntArray266[anInt3182 + 1], anIntArray266[anInt3182 + 2]);
										return;
									}
									if (arg0 == 3205) {
										anInt3182 -= 3;
										Static323.method4439(anIntArray266[anInt3182 + 1], anIntArray266[anInt3182], anIntArray266[anInt3182 + 2]);
										return;
									}
									if (arg0 == 3206) {
										anInt3182 -= 4;
										Static333.method4508(anIntArray266[anInt3182], anIntArray266[anInt3182 + 3], anIntArray266[anInt3182 + 1], anIntArray266[anInt3182 + 2]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray266[anInt3182++] = Static175.anInt3261;
										return;
									}
									if (arg0 == 3301) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = Static81.method1412(false, local19, local13);
										return;
									}
									if (arg0 == 3302) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = Static402.method1651(local19, local13, false);
										return;
									}
									if (arg0 == 3303) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = Static62.method1210(local19, false, local13);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static88.aClass137_1.method2949(local13).anInt4661;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static195.anIntArray238[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static222.anIntArray335[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static70.anIntArray646[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4605) byte local4605 = Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86;
										local19 = (Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062 >> 7) + Static381.anInt6688;
										local25 = (Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061 >> 7) + Static285.anInt5187;
										anIntArray266[anInt3182++] = (local4605 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray266[anInt3182++] = Static165.aBoolean225 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = Static81.method1412(true, local19, local13);
										return;
									}
									if (arg0 == 3314) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = Static402.method1651(local19, local13, true);
										return;
									}
									if (arg0 == 3315) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = Static62.method1210(local19, true, local13);
										return;
									}
									if (arg0 == 3316) {
										if (Static189.anInt3643 >= 2) {
											anIntArray266[anInt3182++] = Static189.anInt3643;
											return;
										}
										anIntArray266[anInt3182++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray266[anInt3182++] = Static401.anInt6859;
										return;
									}
									if (arg0 == 3318) {
										anIntArray266[anInt3182++] = Static83.anInt1889;
										return;
									}
									if (arg0 == 3321) {
										anIntArray266[anInt3182++] = Static298.anInt5351;
										return;
									}
									if (arg0 == 3322) {
										anIntArray266[anInt3182++] = Static232.anInt4231;
										return;
									}
									if (arg0 == 3323) {
										if (Static31.anInt731 >= 5 && Static31.anInt731 <= 9) {
											anIntArray266[anInt3182++] = 1;
											return;
										}
										anIntArray266[anInt3182++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static31.anInt731 >= 5 && Static31.anInt731 <= 9) {
											anIntArray266[anInt3182++] = Static31.anInt731;
											return;
										}
										anIntArray266[anInt3182++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray266[anInt3182++] = Static404.aBoolean463 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray266[anInt3182++] = Static375.aClass6_Sub2_Sub1_Sub1_3.anInt967;
										return;
									}
									if (arg0 == 3327) {
										anIntArray266[anInt3182++] = Static375.aClass6_Sub2_Sub1_Sub1_3.aClass188_1.aBoolean375 ? 1 : 0;
										return;
									}
									if (arg0 == 3328) {
										anIntArray266[anInt3182++] = Static386.aBoolean448 && !Static146.aBoolean200 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray266[anInt3182++] = Static444.aBoolean494 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static260.method5849(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = Static381.method5201(local13, local19, false);
										return;
									}
									if (arg0 == 3332) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = Static381.method5201(local13, local19, true);
										return;
									}
									if (arg0 == 3333) {
										anIntArray266[anInt3182++] = Static404.anInt6896;
										return;
									}
									if (arg0 == 3335) {
										anIntArray266[anInt3182++] = Static139.anInt2670;
										return;
									}
									if (arg0 == 3336) {
										anInt3182 -= 4;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										local25 = anIntArray266[anInt3182 + 2];
										local353 = anIntArray266[anInt3182 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray266[anInt3182++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray266[anInt3182++] = Static121.anInt2512;
										return;
									}
									if (arg0 == 3338) {
										anIntArray266[anInt3182++] = Static102.method1610();
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5230) Class168 local5230;
									if (arg0 == 3400) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										local5230 = Static126.aClass206_1.method4794(local13);
										aStringArray20[anInt3191++] = local5230.method3718(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt3182 -= 4;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										local25 = anIntArray266[anInt3182 + 2];
										local353 = anIntArray266[anInt3182 + 3];
										@Pc(5276) Class168 local5276 = Static126.aClass206_1.method4794(local25);
										if (local5276.aChar3 == local13 && local5276.aChar4 == local19) {
											if (local19 == 115) {
												aStringArray20[anInt3191++] = local5276.method3718(local353);
												return;
											}
											anIntArray266[anInt3182++] = local5276.method3717(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt3182 -= 3;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										local25 = anIntArray266[anInt3182 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5352) Class168 local5352 = Static126.aClass206_1.method4794(local19);
										if (local5352.aChar4 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray266[anInt3182++] = local5352.method3716(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray266[--anInt3182];
										local1101 = aStringArray20[--anInt3191];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5230 = Static126.aClass206_1.method4794(local13);
										if (local5230.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray266[anInt3182++] = local5230.method3723(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray266[--anInt3182];
										@Pc(5450) Class168 local5450 = Static126.aClass206_1.method4794(local13);
										anIntArray266[anInt3182++] = local5450.aClass196_24.method4473();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static171.anInt3177 == 0) {
											anIntArray266[anInt3182++] = -2;
											return;
										}
										if (Static171.anInt3177 == 1) {
											anIntArray266[anInt3182++] = -1;
											return;
										}
										anIntArray266[anInt3182++] = Static22.anInt6850;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray266[--anInt3182];
										if (Static171.anInt3177 == 2 && local13 < Static22.anInt6850) {
											aStringArray20[anInt3191++] = Static291.aStringArray33[local13];
											if (Static58.aStringArray28[local13] != null) {
												aStringArray20[anInt3191++] = Static58.aStringArray28[local13];
												return;
											}
											aStringArray20[anInt3191++] = "";
											return;
										}
										aStringArray20[anInt3191++] = "";
										aStringArray20[anInt3191++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray266[--anInt3182];
										if (Static171.anInt3177 == 2 && local13 < Static22.anInt6850) {
											anIntArray266[anInt3182++] = Static265.anIntArray275[local13];
											return;
										}
										anIntArray266[anInt3182++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray266[--anInt3182];
										if (Static171.anInt3177 == 2 && local13 < Static22.anInt6850) {
											anIntArray266[anInt3182++] = Static90.anIntArray122[local13];
											return;
										}
										anIntArray266[anInt3182++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3888 = aStringArray20[--anInt3191];
										local19 = anIntArray266[--anInt3182];
										Static57.method1155(local19, local3888);
										return;
									}
									if (arg0 == 3605) {
										local3888 = aStringArray20[--anInt3191];
										Static227.method3151(local3888);
										return;
									}
									if (arg0 == 3606) {
										local3888 = aStringArray20[--anInt3191];
										Static369.method5083(local3888);
										return;
									}
									if (arg0 == 3607) {
										local3888 = aStringArray20[--anInt3191];
										Static57.method1158(false, local3888);
										return;
									}
									if (arg0 == 3608) {
										local3888 = aStringArray20[--anInt3191];
										Static275.method3712(local3888);
										return;
									}
									if (arg0 == 3609) {
										local3888 = aStringArray20[--anInt3191];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray266[anInt3182++] = Static187.method2766(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray266[--anInt3182];
										if (Static171.anInt3177 == 2 && local13 < Static22.anInt6850) {
											aStringArray20[anInt3191++] = Static10.aStringArray1[local13];
											return;
										}
										aStringArray20[anInt3191++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static144.aString25 != null) {
											aStringArray20[anInt3191++] = Static235.method3266(Static144.aString25);
											return;
										}
										aStringArray20[anInt3191++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static144.aString25 != null) {
											anIntArray266[anInt3182++] = Static223.anInt4124;
											return;
										}
										anIntArray266[anInt3182++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray266[--anInt3182];
										if (Static144.aString25 != null && local13 < Static223.anInt4124) {
											aStringArray20[anInt3191++] = Static2.aClass219Array10[local13].aString60;
											return;
										}
										aStringArray20[anInt3191++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray266[--anInt3182];
										if (Static144.aString25 != null && local13 < Static223.anInt4124) {
											anIntArray266[anInt3182++] = Static2.aClass219Array10[local13].anInt6458;
											return;
										}
										anIntArray266[anInt3182++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray266[--anInt3182];
										if (Static144.aString25 != null && local13 < Static223.anInt4124) {
											anIntArray266[anInt3182++] = Static2.aClass219Array10[local13].aByte96;
											return;
										}
										anIntArray266[anInt3182++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray266[anInt3182++] = Static316.aByte84;
										return;
									}
									if (arg0 == 3617) {
										local3888 = aStringArray20[--anInt3191];
										Static74.method1343(local3888);
										return;
									}
									if (arg0 == 3618) {
										anIntArray266[anInt3182++] = Static297.aByte77;
										return;
									}
									if (arg0 == 3619) {
										local3888 = aStringArray20[--anInt3191];
										Static310.method4280(local3888);
										return;
									}
									if (arg0 == 3620) {
										Static382.method5203();
										return;
									}
									if (arg0 == 3621) {
										if (Static171.anInt3177 == 0) {
											anIntArray266[anInt3182++] = -1;
											return;
										}
										anIntArray266[anInt3182++] = Static422.anInt7120;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray266[--anInt3182];
										if (Static171.anInt3177 != 0 && local13 < Static422.anInt7120) {
											aStringArray20[anInt3191++] = Static71.aStringArray9[local13];
											if (Static447.aStringArray44[local13] != null) {
												aStringArray20[anInt3191++] = Static447.aStringArray44[local13];
												return;
											}
											aStringArray20[anInt3191++] = "";
											return;
										}
										aStringArray20[anInt3191++] = "";
										aStringArray20[anInt3191++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3888 = aStringArray20[--anInt3191];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray266[anInt3182++] = Static367.method5077(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray266[--anInt3182];
										if (Static2.aClass219Array10 != null && local13 < Static223.anInt4124 && Static2.aClass219Array10[local13].aString61.equalsIgnoreCase(Static375.aClass6_Sub2_Sub1_Sub1_3.aString11)) {
											anIntArray266[anInt3182++] = 1;
											return;
										}
										anIntArray266[anInt3182++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static10.aString5 != null) {
											aStringArray20[anInt3191++] = Static10.aString5;
											return;
										}
										aStringArray20[anInt3191++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray266[--anInt3182];
										if (Static144.aString25 != null && local13 < Static223.anInt4124) {
											aStringArray20[anInt3191++] = Static2.aClass219Array10[local13].aString62;
											return;
										}
										aStringArray20[anInt3191++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray266[--anInt3182];
										if (Static171.anInt3177 == 2 && local13 >= 0 && local13 < Static22.anInt6850) {
											anIntArray266[anInt3182++] = Static6.aBooleanArray1[local13] ? 1 : 0;
											return;
										}
										anIntArray266[anInt3182++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3888 = aStringArray20[--anInt3191];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray266[anInt3182++] = Static446.method5728(local3888);
										return;
									}
									if (arg0 == 3629) {
										anIntArray266[anInt3182++] = Static47.anInt1314;
										return;
									}
									if (arg0 == 3630) {
										local3888 = aStringArray20[--anInt3191];
										Static57.method1158(true, local3888);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static93.aBooleanArray7[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray266[--anInt3182];
										if (Static144.aString25 != null && local13 < Static223.anInt4124) {
											aStringArray20[anInt3191++] = Static2.aClass219Array10[local13].aString61;
											return;
										}
										aStringArray20[anInt3191++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray266[--anInt3182];
										if (Static171.anInt3177 != 0 && local13 < Static422.anInt7120) {
											aStringArray20[anInt3191++] = Static317.aStringArray34[local13];
											return;
										}
										aStringArray20[anInt3191++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static377.aClass143Array1[local13].method3102();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static377.aClass143Array1[local13].anInt4082;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static377.aClass143Array1[local13].anInt4075;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static377.aClass143Array1[local13].anInt4077;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static377.aClass143Array1[local13].anInt4079;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static377.aClass143Array1[local13].anInt4083;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray266[--anInt3182];
										local19 = Static377.aClass143Array1[local13].method3099();
										anIntArray266[anInt3182++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray266[--anInt3182];
										local19 = Static377.aClass143Array1[local13].method3099();
										anIntArray266[anInt3182++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray266[--anInt3182];
										local19 = Static377.aClass143Array1[local13].method3099();
										anIntArray266[anInt3182++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray266[--anInt3182];
										local19 = Static377.aClass143Array1[local13].method3099();
										anIntArray266[anInt3182++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt3182 -= 5;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										local25 = anIntArray266[anInt3182 + 2];
										local353 = anIntArray266[anInt3182 + 3];
										local2290 = anIntArray266[anInt3182 + 4];
										anIntArray266[anInt3182++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(6960) long local6960;
									@Pc(6953) long local6953;
									if (arg0 == 4007) {
										anInt3182 -= 2;
										local6953 = anIntArray266[anInt3182];
										local6960 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = (int) (local6953 + local6953 * local6960 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										if (local13 == 0) {
											anIntArray266[anInt3182++] = 0;
											return;
										}
										anIntArray266[anInt3182++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										if (local13 == 0) {
											anIntArray266[anInt3182++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray266[anInt3182++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray266[anInt3182++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt3182 -= 3;
										local6953 = anIntArray266[anInt3182];
										local6960 = anIntArray266[anInt3182 + 1];
										@Pc(7341) long local7341 = (long) anIntArray266[anInt3182 + 2];
										anIntArray266[anInt3182++] = (int) (local6953 * local7341 / local6960);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3888 = aStringArray20[--anInt3191];
										local19 = anIntArray266[--anInt3182];
										aStringArray20[anInt3191++] = local3888 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt3191 -= 2;
										local3888 = aStringArray20[anInt3191];
										local1101 = aStringArray20[anInt3191 + 1];
										aStringArray20[anInt3191++] = local3888 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3888 = aStringArray20[--anInt3191];
										local19 = anIntArray266[--anInt3182];
										aStringArray20[anInt3191++] = local3888 + Static100.method1589(local19);
										return;
									}
									if (arg0 == 4103) {
										local3888 = aStringArray20[--anInt3191];
										aStringArray20[anInt3191++] = local3888.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray20[anInt3191++] = method2511(anIntArray266[--anInt3182]);
										return;
									}
									if (arg0 == 4105) {
										anInt3191 -= 2;
										local3888 = aStringArray20[anInt3191];
										local1101 = aStringArray20[anInt3191 + 1];
										if (Static375.aClass6_Sub2_Sub1_Sub1_3.aClass188_1 != null && Static375.aClass6_Sub2_Sub1_Sub1_3.aClass188_1.aBoolean375) {
											aStringArray20[anInt3191++] = local1101;
											return;
										}
										aStringArray20[anInt3191++] = local3888;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray266[--anInt3182];
										aStringArray20[anInt3191++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt3191 -= 2;
										anIntArray266[anInt3182++] = Static254.method3491(Static139.anInt2670, aStringArray20[anInt3191], aStringArray20[anInt3191 + 1]);
										return;
									}
									@Pc(7624) Class215 local7624;
									if (arg0 == 4108) {
										local3888 = aStringArray20[--anInt3191];
										anInt3182 -= 2;
										local19 = anIntArray266[anInt3182];
										local25 = anIntArray266[anInt3182 + 1];
										local7624 = Static437.method5652(local25, Static439.aClass166_293);
										anIntArray266[anInt3182++] = local7624.method4968(Static352.aClass3Array13, local19, local3888);
										return;
									}
									if (arg0 == 4109) {
										local3888 = aStringArray20[--anInt3191];
										anInt3182 -= 2;
										local19 = anIntArray266[anInt3182];
										local25 = anIntArray266[anInt3182 + 1];
										local7624 = Static437.method5652(local25, Static439.aClass166_293);
										anIntArray266[anInt3182++] = local7624.method4969(local19, Static352.aClass3Array13, local3888);
										return;
									}
									if (arg0 == 4110) {
										anInt3191 -= 2;
										local3888 = aStringArray20[anInt3191];
										local1101 = aStringArray20[anInt3191 + 1];
										if (anIntArray266[--anInt3182] == 1) {
											aStringArray20[anInt3191++] = local3888;
											return;
										}
										aStringArray20[anInt3191++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3888 = aStringArray20[--anInt3191];
										aStringArray20[anInt3191++] = Static257.method3525(local3888);
										return;
									}
									if (arg0 == 4112) {
										local3888 = aStringArray20[--anInt3191];
										local19 = anIntArray266[--anInt3182];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray20[anInt3191++] = local3888 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static224.method3137((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static167.method2480((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static118.method1846((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static197.method5039((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3888 = aStringArray20[--anInt3191];
										if (local3888 != null) {
											anIntArray266[anInt3182++] = local3888.length();
											return;
										}
										anIntArray266[anInt3182++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3888 = aStringArray20[--anInt3191];
										anInt3182 -= 2;
										local19 = anIntArray266[anInt3182];
										local25 = anIntArray266[anInt3182 + 1];
										aStringArray20[anInt3191++] = local3888.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3888 = aStringArray20[--anInt3191];
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
										aStringArray20[anInt3191++] = local7987.toString();
										return;
									}
									if (arg0 == 4120) {
										local3888 = aStringArray20[--anInt3191];
										anInt3182 -= 2;
										local19 = anIntArray266[anInt3182];
										local25 = anIntArray266[anInt3182 + 1];
										anIntArray266[anInt3182++] = local3888.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt3191 -= 2;
										local3888 = aStringArray20[anInt3191];
										local1101 = aStringArray20[anInt3191 + 1];
										local25 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = local3888.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray266[--anInt3182] != 0;
										local19 = anIntArray266[--anInt3182];
										aStringArray20[anInt3191++] = Static298.method4125(Static139.anInt2670, 0, local412, (long) local19);
										return;
									}
									if (arg0 == 4125) {
										local3888 = aStringArray20[--anInt3191];
										local19 = anIntArray266[--anInt3182];
										@Pc(8210) Class215 local8210 = Static437.method5652(local19, Static439.aClass166_293);
										anIntArray266[anInt3182++] = local8210.method4973(local3888, Static352.aClass3Array13);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray266[--anInt3182];
										aStringArray20[anInt3191++] = Static390.aClass204_2.method4629(local13).aString43;
										return;
									}
									@Pc(8272) Class127 local8272;
									if (arg0 == 4201) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										local8272 = Static390.aClass204_2.method4629(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray26[local19 - 1] != null) {
											aStringArray20[anInt3191++] = local8272.aStringArray26[local19 - 1];
											return;
										}
										aStringArray20[anInt3191++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										local8272 = Static390.aClass204_2.method4629(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray25[local19 - 1] != null) {
											aStringArray20[anInt3191++] = local8272.aStringArray25[local19 - 1];
											return;
										}
										aStringArray20[anInt3191++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static390.aClass204_2.method4629(local13).anInt3570;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static390.aClass204_2.method4629(local13).anInt3573 == 1 ? 1 : 0;
										return;
									}
									@Pc(8435) Class127 local8435;
									if (arg0 == 4205) {
										local13 = anIntArray266[--anInt3182];
										local8435 = Static390.aClass204_2.method4629(local13);
										if (local8435.anInt3547 == -1 && local8435.anInt3540 >= 0) {
											anIntArray266[anInt3182++] = local8435.anInt3540;
											return;
										}
										anIntArray266[anInt3182++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray266[--anInt3182];
										local8435 = Static390.aClass204_2.method4629(local13);
										if (local8435.anInt3547 >= 0 && local8435.anInt3540 >= 0) {
											anIntArray266[anInt3182++] = local8435.anInt3540;
											return;
										}
										anIntArray266[anInt3182++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray266[--anInt3182];
										anIntArray266[anInt3182++] = Static390.aClass204_2.method4629(local13).aBoolean266 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										local3017 = Static110.aClass262_1.method5689(local19);
										if (local3017.method5431()) {
											aStringArray20[anInt3191++] = Static390.aClass204_2.method4629(local13).method2742(local3017.aString69, local19);
											return;
										}
										anIntArray266[anInt3182++] = Static390.aClass204_2.method4629(local13).method2741(local3017.anInt7035, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1] - 1;
										local8272 = Static390.aClass204_2.method4629(local13);
										if (local8272.anInt3571 == local19) {
											anIntArray266[anInt3182++] = local8272.anInt3552;
											return;
										}
										if (local8272.anInt3546 == local19) {
											anIntArray266[anInt3182++] = local8272.anInt3561;
											return;
										}
										anIntArray266[anInt3182++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3888 = aStringArray20[--anInt3191];
										local19 = anIntArray266[--anInt3182];
										Static372.method5826(local3888, local19 == 1);
										anIntArray266[anInt3182++] = Static227.anInt4176;
										return;
									}
									if (arg0 == 4211) {
										if (Static98.aShortArray17 != null && Static344.anInt6182 < Static227.anInt4176) {
											anIntArray266[anInt3182++] = Static98.aShortArray17[Static344.anInt6182++] & 0xFFFF;
											return;
										}
										anIntArray266[anInt3182++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static344.anInt6182 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										local3017 = Static110.aClass262_1.method5689(local19);
										if (local3017.method5431()) {
											aStringArray20[anInt3191++] = Static388.aClass211_1.method4931(local13).method5336(local19, local3017.aString69);
											return;
										}
										anIntArray266[anInt3182++] = Static388.aClass211_1.method4931(local13).method5332(local19, local3017.anInt7035);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										local3017 = Static110.aClass262_1.method5689(local19);
										if (local3017.method5431()) {
											aStringArray20[anInt3191++] = Static2.aClass74_13.method1683(local13).method1628(local3017.aString69, local19);
											return;
										}
										anIntArray266[anInt3182++] = Static2.aClass74_13.method1683(local13).method1621(local3017.anInt7035, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt3182 -= 2;
										local13 = anIntArray266[anInt3182];
										local19 = anIntArray266[anInt3182 + 1];
										local3017 = Static110.aClass262_1.method5689(local19);
										if (local3017.method5431()) {
											aStringArray20[anInt3191++] = Static311.aClass174_1.method4001(local13).method5069(local3017.aString69, local19);
											return;
										}
										anIntArray266[anInt3182++] = Static311.aClass174_1.method4001(local13).method5070(local19, local3017.anInt7035);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray266[--anInt3182];
									@Pc(8936) Class132 local8936 = Static8.aClass226_1.method5109(local13);
									if (local8936.anIntArray306 != null && local8936.anIntArray306.length > 0) {
										local25 = 0;
										local353 = local8936.anIntArray308[0];
										for (local2290 = 1; local2290 < local8936.anIntArray306.length; local2290++) {
											if (local8936.anIntArray308[local2290] > local353) {
												local25 = local2290;
												local353 = local8936.anIntArray308[local2290];
											}
										}
										anIntArray266[anInt3182++] = local8936.anIntArray306[local25];
										return;
									}
									anIntArray266[anInt3182++] = local8936.anInt3758;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static53.method1056(anIntArray266[--anInt3182]);
					} else {
						local137 = arg1 ? aClass126_8 : aClass126_7;
					}
					Static430.method5524(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt3182 -= 2;
						local19 = anIntArray266[anInt3182];
						local25 = anIntArray266[anInt3182 + 1];
						if (local137.anInt3392 == -1) {
							Static55.method1122(local137.anInt3397);
							Static94.method1546(local137.anInt3397);
							Static229.method3193(local137.anInt3397);
						}
						if (local19 == -1) {
							local137.anInt3439 = 1;
							local137.anInt3428 = -1;
							local137.anInt3395 = -1;
							return;
						}
						local137.anInt3395 = local19;
						local137.anInt3383 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean251 = true;
						} else {
							local137.aBoolean251 = false;
						}
						@Pc(1630) Class127 local1630 = Static390.aClass204_2.method4629(local19);
						local137.anInt3393 = local1630.anInt3580;
						local137.anInt3408 = local1630.anInt3548;
						local137.anInt3420 = local1630.anInt3555;
						local137.anInt3403 = local1630.anInt3556;
						local137.anInt3416 = local1630.anInt3569;
						local137.anInt3460 = local1630.anInt3582;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt3472 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt3472 = 1;
						} else {
							local137.anInt3472 = 2;
						}
						if (local137.anInt3396 > 0) {
							local137.anInt3460 = local137.anInt3460 * 32 / local137.anInt3396;
							return;
						}
						if (local137.anInt3402 > 0) {
							local137.anInt3460 = local137.anInt3460 * 32 / local137.anInt3402;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt3439 = 2;
						local137.anInt3428 = anIntArray266[--anInt3182];
						if (local137.anInt3392 == -1) {
							Static197.method5040(local137.anInt3397);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt3439 = 3;
						local137.anInt3428 = -1;
						if (local137.anInt3392 == -1) {
							Static197.method5040(local137.anInt3397);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt3439 = 6;
						local137.anInt3428 = anIntArray266[--anInt3182];
						if (local137.anInt3392 == -1) {
							Static197.method5040(local137.anInt3397);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt3439 = 5;
						local137.anInt3428 = anIntArray266[--anInt3182];
						if (local137.anInt3392 == -1) {
							Static197.method5040(local137.anInt3397);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt3182 -= 4;
						local137.anInt3464 = anIntArray266[anInt3182];
						local137.anInt3385 = anIntArray266[anInt3182 + 1];
						local137.anInt3411 = anIntArray266[anInt3182 + 2];
						local137.anInt3443 = anIntArray266[anInt3182 + 3];
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt3182 -= 2;
						local137.anInt3448 = anIntArray266[anInt3182];
						local137.anInt3470 = anIntArray266[anInt3182 + 1];
						Static430.method5524(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt3182 -= 4;
						local137.anInt3428 = anIntArray266[anInt3182];
						local137.anInt3401 = anIntArray266[anInt3182 + 1];
						if (anIntArray266[anInt3182 + 2] == 1) {
							local137.anInt3439 = 9;
						} else {
							local137.anInt3439 = 8;
						}
						if (anIntArray266[anInt3182 + 3] == 1) {
							local137.aBoolean251 = true;
						} else {
							local137.aBoolean251 = false;
						}
						if (local137.anInt3392 == -1) {
							Static197.method5040(local137.anInt3397);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt3439 = 5;
						local137.anInt3428 = Static373.anInt6574;
						local137.anInt3401 = 0;
						if (local137.anInt3392 == -1) {
							Static197.method5040(local137.anInt3397);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static53.method1056(anIntArray266[--anInt3182]);
				} else {
					local137 = arg1 ? aClass126_8 : aClass126_7;
				}
				if (arg0 == 1000) {
					anInt3182 -= 4;
					local137.anInt3412 = anIntArray266[anInt3182];
					local137.anInt3429 = anIntArray266[anInt3182 + 1];
					local19 = anIntArray266[anInt3182 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray266[anInt3182 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte66 = (byte) local19;
					local137.aByte65 = (byte) local25;
					Static430.method5524(local137);
					Static427.method5500(local137);
					if (local137.anInt3392 == -1) {
						Static376.method5115(local137.anInt3397);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt3182 -= 4;
					local137.anInt3402 = anIntArray266[anInt3182];
					local137.anInt3418 = anIntArray266[anInt3182 + 1];
					local137.anInt3396 = 0;
					local137.anInt3381 = 0;
					local19 = anIntArray266[anInt3182 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray266[anInt3182 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte64 = (byte) local19;
					local137.aByte63 = (byte) local25;
					Static430.method5524(local137);
					Static427.method5500(local137);
					if (local137.anInt3426 == 0) {
						Static114.method1812(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray266[--anInt3182] == 1;
					if (local137.aBoolean252 != local620) {
						local137.aBoolean252 = local620;
						Static430.method5524(local137);
					}
					if (local137.anInt3392 == -1) {
						Static173.method2534(local137.anInt3397);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt3182 -= 2;
					local137.anInt3436 = anIntArray266[anInt3182];
					local137.anInt3445 = anIntArray266[anInt3182 + 1];
					Static430.method5524(local137);
					Static427.method5500(local137);
					if (local137.anInt3426 == 0) {
						Static114.method1812(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean253 = anIntArray266[--anInt3182] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException();
	}
}
