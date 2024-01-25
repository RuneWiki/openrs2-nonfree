import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "Lclient!dp;")
	private static Class53 aClass53_1;

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray33;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "Lclient!vg;")
	private static Class250 aClass250_4;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Lclient!vg;")
	private static Class250 aClass250_5;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "[I")
	private static int[] anIntArray226;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "[Lclient!gg;")
	private static final Class93[] aClass93Array1 = new Class93[50];

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "[I")
	private static final int[] anIntArray224 = new int[5];

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
	private static int anInt4225 = 0;

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "[[I")
	private static final int[][] anIntArrayArray103 = new int[5][5000];

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
	private static int anInt4230 = 0;

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "[I")
	private static final int[] anIntArray225 = new int[1000];

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar4 = Calendar.getInstance();

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
	private static int anInt4232 = 0;

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray34 = new String[1000];

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray35 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ni", name = "A", descriptor = "Lclient!ng;")
	public static final Class167 aClass167_64 = new Class167(4);

	@OriginalMember(owner = "client!ni", name = "B", descriptor = "[I")
	private static final int[] anIntArray227 = new int[3];

	@OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
	private static int anInt4238 = 0;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)V")
	public static void method3400() {
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!pd;I)V")
	private static void method3401(@OriginalArg(0) Class1_Sub31 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray5;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub3_Sub12 local12 = Static349.method4414(local8);
		if (local12 == null) {
			return;
		}
		anIntArray226 = new int[local12.anInt4085];
		@Pc(21) int local21 = 0;
		aStringArray33 = new String[local12.anInt4088];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt5071;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt5068;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass250_8 == null ? -1 : arg0.aClass250_8.anInt6994;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt5073;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass250_8 == null ? -1 : arg0.aClass250_8.anInt7038;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass250_9 == null ? -1 : arg0.aClass250_9.anInt6994;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass250_9 == null ? -1 : arg0.aClass250_9.anInt7038;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt5072;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt5070;
				}
				anIntArray226[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString49;
				}
				aStringArray33[local27++] = local135;
			}
		}
		anInt4238 = arg0.anInt5074;
		method3409(local12, arg1);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!pd;)V")
	public static void method3402(@OriginalArg(0) Class1_Sub31 arg0) {
		method3401(arg0, 200000);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	public static void method3403(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static266.method2725(arg0)) {
			return;
		}
		@Pc(12) Class250[] local12 = Static369.aClass250ArrayArray5[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class250 local19 = local12[local14];
			if (local19.anObjectArray17 != null) {
				@Pc(26) Class1_Sub31 local26 = new Class1_Sub31();
				local26.aClass250_8 = local19;
				local26.anObjectArray5 = local19.anObjectArray17;
				method3401(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	private static void method3404(@OriginalArg(0) int arg0) {
		@Pc(3) Class250 local3 = Static96.method1379(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class250[] local13 = Static11.aClass250ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class250[] local19 = Static369.aClass250ArrayArray5[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static11.aClass250ArrayArray1[local9] = new Class250[local22];
			Static459.method2114(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static459.method2114(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(IZ)V")
	private static void method3405(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray225[anInt4232++] = Static224.anInt3659;
				return;
			}
			if (arg0 == 5001) {
				anInt4232 -= 3;
				Static224.anInt3659 = anIntArray225[anInt4232];
				Static182.aClass58_3 = Static132.method1786(anIntArray225[anInt4232 + 1]);
				if (Static182.aClass58_3 == null) {
					Static182.aClass58_3 = Static71.aClass58_2;
				}
				Static307.anInt5117 = anIntArray225[anInt4232 + 2];
				Static5.method94(Static309.aClass137_194);
				Static75.aClass1_Sub11_Sub1_1.method4445(Static224.anInt3659);
				Static75.aClass1_Sub11_Sub1_1.method4445(Static182.aClass58_3.anInt1536);
				Static75.aClass1_Sub11_Sub1_1.method4445(Static307.anInt5117);
				return;
			}
			if (arg0 == 5002) {
				anInt4225 -= 2;
				local75 = aStringArray34[anInt4225];
				local81 = aStringArray34[anInt4225 + 1];
				anInt4232 -= 2;
				local89 = anIntArray225[anInt4232];
				local95 = anIntArray225[anInt4232 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static5.method94(Static116.aClass137_209);
				Static75.aClass1_Sub11_Sub1_1.method4445(Static221.method2944(local75) + Static221.method2944(local81) + 2);
				Static75.aClass1_Sub11_Sub1_1.method4453(local75);
				Static75.aClass1_Sub11_Sub1_1.method4445(local89 - 1);
				Static75.aClass1_Sub11_Sub1_1.method4445(local95);
				Static75.aClass1_Sub11_Sub1_1.method4453(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray225[--anInt4232];
				local81 = null;
				if (local157 < 100) {
					local81 = Static321.aStringArray38[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray34[anInt4225++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray225[--anInt4232];
				local192 = -1;
				if (local157 < 100 && Static321.aStringArray38[local157] != null) {
					local192 = Static71.anIntArray60[local157];
				}
				anIntArray225[anInt4232++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static182.aClass58_3 == null) {
					anIntArray225[anInt4232++] = -1;
					return;
				}
				anIntArray225[anInt4232++] = Static182.aClass58_3.anInt1536;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray34[--anInt4225];
				method3413(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt4225 -= 2;
				local75 = aStringArray34[anInt4225];
				local81 = aStringArray34[anInt4225 + 1];
				if (Static411.anInt6701 != 0 || (!Static146.aBoolean509 || Static136.aBoolean171) && !Static158.aBoolean210) {
					Static5.method94(Static363.aClass137_230);
					Static75.aClass1_Sub11_Sub1_1.method4445(0);
					local89 = Static75.aClass1_Sub11_Sub1_1.anInt5766;
					Static75.aClass1_Sub11_Sub1_1.method4453(local75);
					Static425.method5306(Static75.aClass1_Sub11_Sub1_1, local81);
					Static75.aClass1_Sub11_Sub1_1.method4478(Static75.aClass1_Sub11_Sub1_1.anInt5766 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray225[--anInt4232];
				local81 = null;
				if (local157 < 100) {
					local81 = Static265.aStringArray32[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray34[anInt4225++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray225[--anInt4232];
				local81 = null;
				if (local157 < 100) {
					local81 = Static71.aStringArray9[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray34[anInt4225++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray225[--anInt4232];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static263.anIntArray223[local157];
				}
				anIntArray225[anInt4232++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static239.aClass20_Sub3_Sub3_Sub1_1 == null || Static239.aClass20_Sub3_Sub3_Sub1_1.aString47 == null) {
					local75 = Static108.aString15;
				} else {
					local75 = Static239.aClass20_Sub3_Sub3_Sub1_1.method3880();
				}
				aStringArray34[anInt4225++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray225[anInt4232++] = Static307.anInt5117;
				return;
			}
			if (arg0 == 5017) {
				anIntArray225[anInt4232++] = Static101.anInt6647;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray225[--anInt4232];
				local192 = 0;
				if (local157 < 100 && Static321.aStringArray38[local157] != null) {
					local192 = Static71.anIntArray60[local157];
				}
				anIntArray225[anInt4232++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray225[--anInt4232];
				local81 = null;
				if (local157 < 100) {
					local81 = Static406.aStringArray51[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray34[anInt4225++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static239.aClass20_Sub3_Sub3_Sub1_1 == null || Static239.aClass20_Sub3_Sub3_Sub1_1.aString47 == null) {
					local75 = Static108.aString15;
				} else {
					local75 = Static239.aClass20_Sub3_Sub3_Sub1_1.method3871();
				}
				aStringArray34[anInt4225++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray225[--anInt4232];
				aStringArray34[anInt4225++] = Static166.aClass236_1.method4977(local157).aString23;
				return;
			}
			@Pc(589) Class1_Sub3_Sub8 local589;
			if (arg0 == 5051) {
				local157 = anIntArray225[--anInt4232];
				local589 = Static166.aClass236_1.method4977(local157);
				if (local589.anIntArray128 == null) {
					anIntArray225[anInt4232++] = 0;
					return;
				}
				anIntArray225[anInt4232++] = local589.anIntArray128.length;
				return;
			}
			if (arg0 == 5052) {
				anInt4232 -= 2;
				local157 = anIntArray225[anInt4232];
				local192 = anIntArray225[anInt4232 + 1];
				@Pc(634) Class1_Sub3_Sub8 local634 = Static166.aClass236_1.method4977(local157);
				local95 = local634.anIntArray128[local192];
				anIntArray225[anInt4232++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray225[--anInt4232];
				local589 = Static166.aClass236_1.method4977(local157);
				if (local589.anIntArray129 == null) {
					anIntArray225[anInt4232++] = 0;
					return;
				}
				anIntArray225[anInt4232++] = local589.anIntArray129.length;
				return;
			}
			if (arg0 == 5054) {
				anInt4232 -= 2;
				local157 = anIntArray225[anInt4232];
				local192 = anIntArray225[anInt4232 + 1];
				anIntArray225[anInt4232++] = Static166.aClass236_1.method4977(local157).anIntArray129[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray225[--anInt4232];
				aStringArray34[anInt4225++] = Static109.aClass229_1.method4848(local157).method5202();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray225[--anInt4232];
				@Pc(760) Class1_Sub3_Sub17 local760 = Static109.aClass229_1.method4848(local157);
				if (local760.anIntArray451 == null) {
					anIntArray225[anInt4232++] = 0;
					return;
				}
				anIntArray225[anInt4232++] = local760.anIntArray451.length;
				return;
			}
			if (arg0 == 5057) {
				anInt4232 -= 2;
				local157 = anIntArray225[anInt4232];
				local192 = anIntArray225[anInt4232 + 1];
				anIntArray225[anInt4232++] = Static109.aClass229_1.method4848(local157).anIntArray451[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass53_1 = new Class53();
				aClass53_1.anInt1435 = anIntArray225[--anInt4232];
				aClass53_1.aClass1_Sub3_Sub17_1 = Static109.aClass229_1.method4848(aClass53_1.anInt1435);
				aClass53_1.anIntArray66 = new int[aClass53_1.aClass1_Sub3_Sub17_1.method5198()];
				return;
			}
			if (arg0 == 5059) {
				Static5.method94(Static61.aClass137_60);
				Static75.aClass1_Sub11_Sub1_1.method4445(0);
				local157 = Static75.aClass1_Sub11_Sub1_1.anInt5766;
				Static75.aClass1_Sub11_Sub1_1.method4445(0);
				Static75.aClass1_Sub11_Sub1_1.method4448(aClass53_1.anInt1435);
				aClass53_1.aClass1_Sub3_Sub17_1.method5199(Static75.aClass1_Sub11_Sub1_1, aClass53_1.anIntArray66);
				Static75.aClass1_Sub11_Sub1_1.method4478(Static75.aClass1_Sub11_Sub1_1.anInt5766 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray34[--anInt4225];
				Static5.method94(Static220.aClass137_154);
				Static75.aClass1_Sub11_Sub1_1.method4445(0);
				local192 = Static75.aClass1_Sub11_Sub1_1.anInt5766;
				Static75.aClass1_Sub11_Sub1_1.method4453(local75);
				Static75.aClass1_Sub11_Sub1_1.method4448(aClass53_1.anInt1435);
				aClass53_1.aClass1_Sub3_Sub17_1.method5199(Static75.aClass1_Sub11_Sub1_1, aClass53_1.anIntArray66);
				Static75.aClass1_Sub11_Sub1_1.method4478(Static75.aClass1_Sub11_Sub1_1.anInt5766 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static5.method94(Static61.aClass137_60);
				Static75.aClass1_Sub11_Sub1_1.method4445(0);
				local157 = Static75.aClass1_Sub11_Sub1_1.anInt5766;
				Static75.aClass1_Sub11_Sub1_1.method4445(1);
				Static75.aClass1_Sub11_Sub1_1.method4448(aClass53_1.anInt1435);
				aClass53_1.aClass1_Sub3_Sub17_1.method5199(Static75.aClass1_Sub11_Sub1_1, aClass53_1.anIntArray66);
				Static75.aClass1_Sub11_Sub1_1.method4478(Static75.aClass1_Sub11_Sub1_1.anInt5766 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt4232 -= 2;
				local157 = anIntArray225[anInt4232];
				local192 = anIntArray225[anInt4232 + 1];
				anIntArray225[anInt4232++] = Static166.aClass236_1.method4977(local157).aCharArray2[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt4232 -= 2;
				local157 = anIntArray225[anInt4232];
				local192 = anIntArray225[anInt4232 + 1];
				anIntArray225[anInt4232++] = Static166.aClass236_1.method4977(local157).aCharArray1[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt4232 -= 2;
				local157 = anIntArray225[anInt4232];
				local192 = anIntArray225[anInt4232 + 1];
				if (local192 == -1) {
					anIntArray225[anInt4232++] = -1;
					return;
				}
				anIntArray225[anInt4232++] = Static166.aClass236_1.method4977(local157).method2142((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt4232 -= 2;
				local157 = anIntArray225[anInt4232];
				local192 = anIntArray225[anInt4232 + 1];
				if (local192 == -1) {
					anIntArray225[anInt4232++] = -1;
					return;
				}
				anIntArray225[anInt4232++] = Static166.aClass236_1.method4977(local157).method2145((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray225[--anInt4232];
				anIntArray225[anInt4232++] = Static109.aClass229_1.method4848(local157).method5198();
				return;
			}
			if (arg0 == 5067) {
				anInt4232 -= 2;
				local157 = anIntArray225[anInt4232];
				local192 = anIntArray225[anInt4232 + 1];
				local89 = Static109.aClass229_1.method4848(local157).method5206(local192).anInt2350;
				anIntArray225[anInt4232++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt4232 -= 2;
				local157 = anIntArray225[anInt4232];
				local192 = anIntArray225[anInt4232 + 1];
				aClass53_1.anIntArray66[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt4232 -= 2;
				local157 = anIntArray225[anInt4232];
				local192 = anIntArray225[anInt4232 + 1];
				aClass53_1.anIntArray66[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt4232 -= 3;
				local157 = anIntArray225[anInt4232];
				local192 = anIntArray225[anInt4232 + 1];
				local89 = anIntArray225[anInt4232 + 2];
				@Pc(1265) Class1_Sub3_Sub17 local1265 = Static109.aClass229_1.method4848(local157);
				if (local1265.method5206(local192).anInt2350 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray225[anInt4232++] = local1265.method5201(local89, local192);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray34[--anInt4225];
				local1313 = anIntArray225[--anInt4232] == 1;
				Static133.method1799(local1313, local75);
				anIntArray225[anInt4232++] = Static62.anInt1109;
				return;
			}
			if (arg0 == 5072) {
				if (Static355.aShortArray72 != null && Static441.anInt7348 < Static62.anInt1109) {
					anIntArray225[anInt4232++] = Static355.aShortArray72[Static441.anInt7348++] & 0xFFFF;
					return;
				}
				anIntArray225[anInt4232++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static441.anInt7348 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static5.method94(Static61.aClass137_60);
				Static75.aClass1_Sub11_Sub1_1.method4445(0);
				local157 = Static75.aClass1_Sub11_Sub1_1.anInt5766;
				Static75.aClass1_Sub11_Sub1_1.method4445(2);
				Static75.aClass1_Sub11_Sub1_1.method4448(aClass53_1.anInt1435);
				aClass53_1.aClass1_Sub3_Sub17_1.method5199(Static75.aClass1_Sub11_Sub1_1, aClass53_1.anIntArray66);
				Static75.aClass1_Sub11_Sub1_1.method4478(Static75.aClass1_Sub11_Sub1_1.anInt5766 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static321.aClass31_4.method3798(86)) {
					anIntArray225[anInt4232++] = 1;
					return;
				}
				anIntArray225[anInt4232++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static321.aClass31_4.method3798(82)) {
					anIntArray225[anInt4232++] = 1;
					return;
				}
				anIntArray225[anInt4232++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static321.aClass31_4.method3798(81)) {
					anIntArray225[anInt4232++] = 1;
					return;
				}
				anIntArray225[anInt4232++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static14.method217(anIntArray225[--anInt4232]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray225[anInt4232++] = Static197.method2614();
					return;
				}
				if (arg0 == 5205) {
					Static381.method4864(-1, false, -1, anIntArray225[--anInt4232]);
					return;
				}
				@Pc(1554) Class1_Sub3_Sub16 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray225[--anInt4232];
					local1554 = Static114.method5215(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray225[anInt4232++] = -1;
						return;
					}
					anIntArray225[anInt4232++] = local1554.anInt6748;
					return;
				}
				@Pc(1587) Class1_Sub3_Sub16 local1587;
				if (arg0 == 5207) {
					local1587 = Static114.method5211(anIntArray225[--anInt4232]);
					if (local1587 != null && local1587.aString57 != null) {
						aStringArray34[anInt4225++] = local1587.aString57;
						return;
					}
					aStringArray34[anInt4225++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray225[anInt4232++] = Static249.anInt4070;
					anIntArray225[anInt4232++] = Static197.anInt3151;
					return;
				}
				if (arg0 == 5209) {
					anIntArray225[anInt4232++] = Static257.anInt6932 + Static114.anInt6798;
					anIntArray225[anInt4232++] = Static2.anInt3076 + Static114.anInt6800;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray225[--anInt4232];
					local1554 = Static114.method5211(local157);
					if (local1554 == null) {
						anIntArray225[anInt4232++] = 0;
						anIntArray225[anInt4232++] = 0;
						return;
					}
					anIntArray225[anInt4232++] = local1554.anInt6753 >> 14 & 0x3FFF;
					anIntArray225[anInt4232++] = local1554.anInt6753 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray225[--anInt4232];
					local1554 = Static114.method5211(local157);
					if (local1554 == null) {
						anIntArray225[anInt4232++] = 0;
						anIntArray225[anInt4232++] = 0;
						return;
					}
					anIntArray225[anInt4232++] = local1554.anInt6750 - local1554.anInt6747;
					anIntArray225[anInt4232++] = local1554.anInt6760 - local1554.anInt6749;
					return;
				}
				@Pc(1777) Class1_Sub7 local1777;
				if (arg0 == 5212) {
					local1777 = Static283.method3693();
					if (local1777 == null) {
						anIntArray225[anInt4232++] = -1;
						anIntArray225[anInt4232++] = -1;
						return;
					}
					anIntArray225[anInt4232++] = local1777.anInt969;
					local192 = local1777.anInt970 << 28 | local1777.anInt973 + Static114.anInt6798 << 14 | local1777.anInt968 + Static114.anInt6800;
					anIntArray225[anInt4232++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static215.method2851();
					if (local1777 == null) {
						anIntArray225[anInt4232++] = -1;
						anIntArray225[anInt4232++] = -1;
						return;
					}
					anIntArray225[anInt4232++] = local1777.anInt969;
					local192 = local1777.anInt970 << 28 | local1777.anInt973 + Static114.anInt6798 << 14 | local1777.anInt968 + Static114.anInt6800;
					anIntArray225[anInt4232++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray225[--anInt4232];
					local1554 = Static390.method4941();
					if (local1554 != null) {
						local1925 = local1554.method5178(local157 >> 28 & 0x3, anIntArray227, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1925) {
							Static240.method3129(anIntArray227[2], anIntArray227[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt4232 -= 2;
					local157 = anIntArray225[anInt4232];
					local192 = anIntArray225[anInt4232 + 1];
					@Pc(1963) Class260 local1963 = Static114.method5220(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class1_Sub3_Sub16 local1970 = (Class1_Sub3_Sub16) local1963.method5553(); local1970 != null; local1970 = (Class1_Sub3_Sub16) local1963.method5556()) {
						if (local1970.anInt6748 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray225[anInt4232++] = 1;
						return;
					}
					anIntArray225[anInt4232++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray225[--anInt4232];
					local1554 = Static114.method5211(local157);
					if (local1554 == null) {
						anIntArray225[anInt4232++] = -1;
						return;
					}
					anIntArray225[anInt4232++] = local1554.anInt6755;
					return;
				}
				if (arg0 == 5220) {
					anIntArray225[anInt4232++] = Static37.anInt732 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray225[--anInt4232];
					Static240.method3129(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static390.method4941();
					if (local1587 != null) {
						local1313 = local1587.method5180(Static257.anInt6932 + Static114.anInt6798, anIntArray227, Static2.anInt3076 + Static114.anInt6800);
						if (local1313) {
							anIntArray225[anInt4232++] = anIntArray227[1];
							anIntArray225[anInt4232++] = anIntArray227[2];
							return;
						}
						anIntArray225[anInt4232++] = -1;
						anIntArray225[anInt4232++] = -1;
						return;
					}
					anIntArray225[anInt4232++] = -1;
					anIntArray225[anInt4232++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt4232 -= 2;
					local157 = anIntArray225[anInt4232];
					local192 = anIntArray225[anInt4232 + 1];
					Static381.method4864(local192 >> 14 & 0x3FFF, false, local192 & 0x3FFF, local157);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray225[--anInt4232];
					local1554 = Static390.method4941();
					if (local1554 != null) {
						local1925 = local1554.method5178(local157 >> 28 & 0x3, anIntArray227, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1925) {
							anIntArray225[anInt4232++] = anIntArray227[1];
							anIntArray225[anInt4232++] = anIntArray227[2];
							return;
						}
						anIntArray225[anInt4232++] = -1;
						anIntArray225[anInt4232++] = -1;
						return;
					}
					anIntArray225[anInt4232++] = -1;
					anIntArray225[anInt4232++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray225[--anInt4232];
					local1554 = Static390.method4941();
					if (local1554 != null) {
						local1925 = local1554.method5180(local157 >> 14 & 0x3FFF, anIntArray227, local157 & 0x3FFF);
						if (local1925) {
							anIntArray225[anInt4232++] = anIntArray227[1];
							anIntArray225[anInt4232++] = anIntArray227[2];
							return;
						}
						anIntArray225[anInt4232++] = -1;
						anIntArray225[anInt4232++] = -1;
						return;
					}
					anIntArray225[anInt4232++] = -1;
					anIntArray225[anInt4232++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static300.method3934(anIntArray225[--anInt4232]);
					return;
				}
				if (arg0 == 5227) {
					anInt4232 -= 2;
					local157 = anIntArray225[anInt4232];
					local192 = anIntArray225[anInt4232 + 1];
					Static381.method4864(local192 >> 14 & 0x3FFF, true, local192 & 0x3FFF, local157);
					return;
				}
				if (arg0 == 5228) {
					Static220.aBoolean282 = anIntArray225[--anInt4232] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray225[anInt4232++] = Static220.aBoolean282 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray225[--anInt4232];
					Static124.method1716(local157);
					return;
				}
				@Pc(2483) Class1 local2483;
				if (arg0 == 5231) {
					anInt4232 -= 2;
					local157 = anIntArray225[anInt4232];
					local1313 = anIntArray225[anInt4232 + 1] == 1;
					if (Static120.aClass257_20 != null) {
						local2483 = Static120.aClass257_20.method5503((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5617();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class1();
							Static120.aClass257_20.method5504(local2483, (long) local157);
						}
					}
					return;
				}
				@Pc(2525) Class1 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray225[--anInt4232];
					if (Static120.aClass257_20 != null) {
						local2525 = Static120.aClass257_20.method5503((long) local157);
						anIntArray225[anInt4232++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray225[anInt4232++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt4232 -= 2;
					local157 = anIntArray225[anInt4232];
					local1313 = anIntArray225[anInt4232 + 1] == 1;
					if (Static402.aClass257_31 != null) {
						local2483 = Static402.aClass257_31.method5503((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5617();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class1();
							Static402.aClass257_31.method5504(local2483, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray225[--anInt4232];
					if (Static402.aClass257_31 != null) {
						local2525 = Static402.aClass257_31.method5503((long) local157);
						anIntArray225[anInt4232++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray225[anInt4232++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray225[anInt4232++] = Static114.aClass1_Sub3_Sub16_3 == null ? -1 : Static114.aClass1_Sub3_Sub16_3.anInt6748;
					return;
				}
				if (arg0 == 5236) {
					anInt4232 -= 2;
					local157 = anIntArray225[anInt4232];
					local192 = anIntArray225[anInt4232 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static136.method1824(local157, local95, local89);
					if (local2691 < 0) {
						anIntArray225[anInt4232++] = -1;
						return;
					}
					anIntArray225[anInt4232++] = local2691;
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt4232 -= 2;
					local157 = anIntArray225[anInt4232];
					local192 = anIntArray225[anInt4232 + 1];
					Static421.method5241(local192, false, 3, local157);
					anIntArray225[anInt4232++] = Static70.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static70.aFrame1 != null) {
						Static421.method5241(-1, false, Static336.aClass106_Sub1_1.anInt5679, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2769) Class195[] local2769 = Static390.method4943();
					anIntArray225[anInt4232++] = local2769.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray225[--anInt4232];
					@Pc(2793) Class195[] local2793 = Static390.method4943();
					anIntArray225[anInt4232++] = local2793[local157].anInt5213;
					anIntArray225[anInt4232++] = local2793[local157].anInt5212;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static336.aClass106_Sub1_1.anInt5700;
					local192 = Static336.aClass106_Sub1_1.anInt5683;
					local89 = -1;
					@Pc(2830) Class195[] local2830 = Static390.method4943();
					for (local2691 = 0; local2691 < local2830.length; local2691++) {
						@Pc(2837) Class195 local2837 = local2830[local2691];
						if (local2837.anInt5213 == local157 && local2837.anInt5212 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray225[anInt4232++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray225[anInt4232++] = Static330.method4209();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray225[--anInt4232];
					if (local157 >= 1 && local157 <= 2) {
						Static421.method5241(-1, false, local157, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.anInt5679;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray225[--anInt4232];
					if (local157 >= 1 && local157 <= 2) {
						Static336.aClass106_Sub1_1.anInt5679 = local157;
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						return;
					}
					return;
				}
			} else {
				@Pc(3345) String local3345;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt4225 -= 2;
						local75 = aStringArray34[anInt4225];
						local81 = aStringArray34[anInt4225 + 1];
						local89 = anIntArray225[--anInt4232];
						Static5.method94(Static29.aClass137_38);
						Static75.aClass1_Sub11_Sub1_1.method4445(Static221.method2944(local75) + Static221.method2944(local81) + 1);
						Static75.aClass1_Sub11_Sub1_1.method4453(local75);
						Static75.aClass1_Sub11_Sub1_1.method4453(local81);
						Static75.aClass1_Sub11_Sub1_1.method4445(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt4232 -= 2;
						Static64.aShortArray18[anIntArray225[anInt4232]] = (short) Static189.method2489(anIntArray225[anInt4232 + 1]);
						Static227.aClass65_2.method1332();
						Static227.aClass65_2.method1331();
						Static304.aClass27_1.method587();
						Static183.method4174();
						return;
					}
					if (arg0 == 5405) {
						anInt4232 -= 2;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static1.anIntArrayArrayArray1[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt4232 -= 7;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1] << 1;
						local89 = anIntArray225[anInt4232 + 2];
						local95 = anIntArray225[anInt4232 + 3];
						local2691 = anIntArray225[anInt4232 + 4];
						@Pc(3105) int local3105 = anIntArray225[anInt4232 + 5];
						@Pc(3111) int local3111 = anIntArray225[anInt4232 + 6];
						if (local157 >= 0 && local157 < 2 && Static1.anIntArrayArrayArray1[local157] != null && local192 >= 0 && local192 < Static1.anIntArrayArrayArray1[local157].length) {
							Static1.anIntArrayArrayArray1[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3111 };
							Static1.anIntArrayArrayArray1[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3105, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static1.anIntArrayArrayArray1[anIntArray225[--anInt4232]].length >> 1;
						anIntArray225[anInt4232++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static70.aFrame1 != null) {
							Static421.method5241(-1, false, Static336.aClass106_Sub1_1.anInt5679, -1);
						}
						if (Static158.aFrame2 != null) {
							Static329.method4206();
							System.exit(0);
							return;
						}
						local75 = Static206.aString35 == null ? Static57.method884() : Static206.aString35;
						Static141.method1861(local75, Static410.anInt6680 == 1, Static41.aClass124_2, false);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static446.aClass215_10 != null) {
							if (Static446.aClass215_10.anObject10 == null) {
								local75 = Static96.method1380(Static446.aClass215_10.anInt5790);
							} else {
								local75 = (String) Static446.aClass215_10.anObject10;
							}
						}
						aStringArray34[anInt4225++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray225[anInt4232++] = Static191.anInt3047 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static70.aFrame1 != null) {
							Static421.method5241(-1, false, Static336.aClass106_Sub1_1.anInt5679, -1);
						}
						local75 = aStringArray34[--anInt4225];
						local1313 = anIntArray225[--anInt4232] == 1;
						local3345 = Static57.method884() + local75;
						Static141.method1861(local3345, Static410.anInt6680 == 1, Static41.aClass124_2, local1313);
						return;
					}
					if (arg0 == 5422) {
						anInt4225 -= 2;
						local75 = aStringArray34[anInt4225];
						local81 = aStringArray34[anInt4225 + 1];
						local89 = anIntArray225[--anInt4232];
						if (local75.length() > 0) {
							if (Static121.aStringArray19 == null) {
								Static121.aStringArray19 = new String[Static399.anIntArray401[Static357.aClass6_4.anInt193]];
							}
							Static121.aStringArray19[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static109.aStringArray18 == null) {
								Static109.aStringArray18 = new String[Static399.anIntArray401[Static357.aClass6_4.anInt193]];
							}
							Static109.aStringArray18[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray34[--anInt4225]);
						return;
					}
					if (arg0 == 5424) {
						anInt4232 -= 11;
						Static439.anInt7305 = anIntArray225[anInt4232];
						Static28.anInt562 = anIntArray225[anInt4232 + 1];
						Static418.anInt6789 = anIntArray225[anInt4232 + 2];
						Static277.anInt4385 = anIntArray225[anInt4232 + 3];
						Static452.anInt7407 = anIntArray225[anInt4232 + 4];
						Static249.anInt4071 = anIntArray225[anInt4232 + 5];
						Static410.anInt6666 = anIntArray225[anInt4232 + 6];
						Static33.anInt675 = anIntArray225[anInt4232 + 7];
						Static396.anInt6483 = anIntArray225[anInt4232 + 8];
						Static43.anInt5196 = anIntArray225[anInt4232 + 9];
						Static269.anInt4263 = anIntArray225[anInt4232 + 10];
						Static169.aClass113_55.method2253(Static452.anInt7407);
						Static169.aClass113_55.method2253(Static249.anInt4071);
						Static169.aClass113_55.method2253(Static410.anInt6666);
						Static169.aClass113_55.method2253(Static33.anInt675);
						Static169.aClass113_55.method2253(Static396.anInt6483);
						Static240.aClass49_11 = null;
						Static26.aClass49_2 = null;
						Static283.aClass49_12 = null;
						Static9.aClass49_1 = null;
						Static453.aClass49_22 = null;
						Static415.aClass49_6 = null;
						Static316.aClass49_19 = null;
						Static391.aClass49_20 = null;
						Static411.aBoolean546 = true;
						return;
					}
					if (arg0 == 5425) {
						Static236.method3113();
						Static411.aBoolean546 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt4232 -= 2;
						Static453.anInt7417 = anIntArray225[anInt4232];
						Static229.anInt3720 = anIntArray225[anInt4232 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt4232 -= 2;
						Static299.anInt5002 = anIntArray225[anInt4232 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt4232 -= 2;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						anIntArray225[anInt4232++] = Static288.method3755(local192, local157) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static26.method483(false, aStringArray34[--anInt4225]);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static460.method3422("accountcreated", Static41.aClass124_2.anApplet1);
							return;
						} catch (@Pc(3639) Throwable local3639) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt4232 -= 4;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						local89 = anIntArray225[anInt4232 + 2];
						local95 = anIntArray225[anInt4232 + 3];
						Static107.method1511(local192, false, (local157 >> 14 & 0x3FFF) - Static101.anInt6646, local95, local89, (local157 & 0x3FFF) - Static278.anInt4392);
						return;
					}
					if (arg0 == 5501) {
						anInt4232 -= 4;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						local89 = anIntArray225[anInt4232 + 2];
						local95 = anIntArray225[anInt4232 + 3];
						Static413.method5157((local157 & 0x3FFF) - Static278.anInt4392, local192, local89, local95, (local157 >> 14 & 0x3FFF) - Static101.anInt6646);
						return;
					}
					if (arg0 == 5502) {
						anInt4232 -= 6;
						local157 = anIntArray225[anInt4232];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static367.anInt6214 = local157;
						local192 = anIntArray225[anInt4232 + 1];
						if (local192 + 1 >= Static1.anIntArrayArrayArray1[Static367.anInt6214].length >> 1) {
							throw new RuntimeException();
						}
						Static126.anInt2201 = local192;
						Static128.anInt2229 = 0;
						Static359.anInt5959 = anIntArray225[anInt4232 + 2];
						Static66.anInt1155 = anIntArray225[anInt4232 + 3];
						local89 = anIntArray225[anInt4232 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static214.anInt7430 = local89;
						local95 = anIntArray225[anInt4232 + 5];
						if (local95 + 1 >= Static1.anIntArrayArrayArray1[Static214.anInt7430].length >> 1) {
							throw new RuntimeException();
						}
						Static159.anInt2650 = local95;
						Static100.anInt1781 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static428.method5377();
						return;
					}
					if (arg0 == 5504) {
						anInt4232 -= 2;
						Static440.method5528(anIntArray225[anInt4232], anIntArray225[anInt4232 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray225[anInt4232++] = (int) Static278.aFloat52 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray225[anInt4232++] = (int) Static95.aFloat27 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static395.method5414();
						return;
					}
					if (arg0 == 5508) {
						Static97.method1393();
						return;
					}
					if (arg0 == 5509) {
						Static30.method544();
						return;
					}
					if (arg0 == 5510) {
						Static205.method2786();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray225[--anInt4232];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static101.anInt6646;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static425.anInt6922) {
							local192 = Static425.anInt6922;
						}
						local89 -= Static278.anInt4392;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static251.anInt4072) {
							local89 = Static251.anInt4072;
						}
						Static446.anInt7388 = (local192 << 7) + 64;
						Static317.anInt5271 = (local89 << 7) + 64;
						Static100.anInt1781 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static47.method711();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt4225 -= 2;
						local75 = aStringArray34[anInt4225];
						local81 = aStringArray34[anInt4225 + 1];
						local89 = anIntArray225[--anInt4232];
						if (Static98.anInt1721 != 10) {
							return;
						}
						if (Static144.anInt2432 == 0 && Static354.anInt5868 == 0 && Static48.anInt801 == 0 && Static374.anInt6278 == 0) {
							Static180.method2402(local81, local89, local75);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static446.method5581();
						return;
					}
					if (arg0 == 5602) {
						if (Static354.anInt5868 == 0) {
							Static418.anInt6790 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt4232 -= 4;
						if (Static98.anInt1721 != 10) {
							return;
						}
						if (Static144.anInt2432 == 0 && Static354.anInt5868 == 0 && Static48.anInt801 == 0 && Static374.anInt6278 == 0) {
							Static387.method4934(anIntArray225[anInt4232 + 3], anIntArray225[anInt4232 + 1], anIntArray225[anInt4232], anIntArray225[anInt4232 + 2]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt4225--;
						if (Static98.anInt1721 != 10) {
							return;
						}
						if (Static144.anInt2432 == 0 && Static354.anInt5868 == 0 && Static48.anInt801 == 0 && Static374.anInt6278 == 0) {
							Static442.method5555(Static86.method1266(aStringArray34[anInt4225]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt4225 -= 3;
						anInt4232 -= 7;
						if (Static98.anInt1721 != 10) {
							return;
						}
						if (Static144.anInt2432 == 0 && Static354.anInt5868 == 0 && Static48.anInt801 == 0 && Static374.anInt6278 == 0) {
							Static336.method4291(anIntArray225[anInt4232 + 3], anIntArray225[anInt4232 + 6] == 1, anIntArray225[anInt4232], anIntArray225[anInt4232 + 2], anIntArray225[anInt4232 + 4] == 1, Static86.method1266(aStringArray34[anInt4225]), anIntArray225[anInt4232 + 5] == 1, aStringArray34[anInt4225 + 2], aStringArray34[anInt4225 + 1], anIntArray225[anInt4232 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static48.anInt801 == 0) {
							Static52.anInt942 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray225[anInt4232++] = Static418.anInt6790;
						return;
					}
					if (arg0 == 5608) {
						anIntArray225[anInt4232++] = Static26.anInt547;
						return;
					}
					if (arg0 == 5609) {
						anIntArray225[anInt4232++] = Static52.anInt942;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray34[anInt4225++] = Static390.aStringArray50.length > local157 ? Static438.method5505(Static390.aStringArray50[local157]) : "";
						}
						Static390.aStringArray50 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray225[anInt4232++] = Static4.anInt66;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray225[--anInt4232];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static336.aClass106_Sub1_1.anInt5698 = local157;
						Static266.method2730();
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6002) {
						Static336.aClass106_Sub1_1.method4435(anIntArray225[--anInt4232] == 1);
						Static266.method2730();
						Static275.method3498();
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6003) {
						Static336.aClass106_Sub1_1.aBoolean462 = anIntArray225[--anInt4232] == 1;
						Static275.method3498();
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6005) {
						Static336.aClass106_Sub1_1.aBoolean465 = anIntArray225[--anInt4232] == 1;
						Static266.method2730();
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6006) {
						Static336.aClass106_Sub1_1.aBoolean468 = anIntArray225[--anInt4232] == 1;
						Static213.aClass128_22.method3566(!Static336.aClass106_Sub1_1.aBoolean468);
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6007) {
						Static336.aClass106_Sub1_1.anInt5678 = anIntArray225[--anInt4232];
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6008) {
						Static336.aClass106_Sub1_1.aBoolean471 = anIntArray225[--anInt4232] == 1;
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6009) {
						Static336.aClass106_Sub1_1.aBoolean475 = anIntArray225[--anInt4232] == 1;
						Static266.method2730();
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6010) {
						Static336.aClass106_Sub1_1.aBoolean473 = anIntArray225[--anInt4232] == 1;
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray225[--anInt4232];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static336.aClass106_Sub1_1.method4426(local157, Static410.anInt6680);
						Static266.method2730();
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6012) {
						Static336.aClass106_Sub1_1.method4418(Static410.anInt6680, anIntArray225[--anInt4232] == 1);
						Static312.method4044();
						Static421.method5243();
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6014) {
						Static336.aClass106_Sub1_1.aBoolean466 = anIntArray225[--anInt4232] == 1;
						Static266.method2730();
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6015) {
						Static336.aClass106_Sub1_1.aBoolean474 = anIntArray225[--anInt4232] == 1;
						Static266.method2730();
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray225[--anInt4232];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static336.aClass106_Sub1_1.anInt5675 = local157;
						Static330.method4211(Static410.anInt6680);
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						return;
					}
					if (arg0 == 6017) {
						Static336.aClass106_Sub1_1.aBoolean469 = anIntArray225[--anInt4232] == 1;
						Static109.method1523();
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray225[--anInt4232];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static336.aClass106_Sub1_1.anInt5696 = local157;
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray225[--anInt4232];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static336.aClass106_Sub1_1.anInt5694) {
							if (Static336.aClass106_Sub1_1.anInt5694 == 0 && Static170.anInt2817 != -1) {
								Static299.method3903(Static116.aClass113_101, local157, Static170.anInt2817);
								Static17.aBoolean28 = false;
							} else if (local157 == 0) {
								Static358.method4644();
								Static17.aBoolean28 = false;
							} else {
								Static307.method4003(local157);
							}
							Static336.aClass106_Sub1_1.anInt5694 = local157;
						}
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray225[--anInt4232];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static336.aClass106_Sub1_1.anInt5682 = local157;
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6021) {
						Static336.aClass106_Sub1_1.aBoolean476 = anIntArray225[--anInt4232] == 1;
						Static275.method3498();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray225[--anInt4232];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static144.anInt2437 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static154.method4419(local157);
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						anIntArray225[anInt4232++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray225[--anInt4232];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static336.aClass106_Sub1_1.anInt5685 = local157;
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray225[--anInt4232];
						if (local157 < 0 || local157 > Static203.method2772(Static144.anInt2437)) {
							local157 = 0;
						}
						Static336.aClass106_Sub1_1.anInt5684 = local157;
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray225[--anInt4232];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static47.method712(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static336.aClass106_Sub1_1.aBoolean472 = anIntArray225[--anInt4232] != 0;
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						return;
					}
					if (arg0 == 6029) {
						Static336.aClass106_Sub1_1.anInt5678 = anIntArray225[--anInt4232];
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						return;
					}
					if (arg0 == 6030) {
						Static336.aClass106_Sub1_1.aBoolean467 = anIntArray225[--anInt4232] != 0;
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static266.method2730();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray225[--anInt4232];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static330.method4211(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray225[--anInt4232];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static336.aClass106_Sub1_1.anInt5680 = local157;
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray225[--anInt4232];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static336.aClass106_Sub1_1.anInt5688 = local157;
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						return;
					}
					if (arg0 == 6034) {
						Static336.aClass106_Sub1_1.aBoolean463 = anIntArray225[--anInt4232] == 1;
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						Static312.method4044();
						Static253.aBoolean325 = false;
						return;
					}
					if (arg0 == 6035) {
						Static336.aClass106_Sub1_1.aBoolean477 = anIntArray225[--anInt4232] == 1;
						Static266.method2730();
						Static275.method3498();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.anInt5698;
						return;
					}
					if (arg0 == 6102) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.method4436(Static410.anInt6680) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.aBoolean462 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.aBoolean465 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.aBoolean468 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.anInt5678;
						return;
					}
					if (arg0 == 6108) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.aBoolean471 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.aBoolean475 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.aBoolean473 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.method4424(Static410.anInt6680);
						return;
					}
					if (arg0 == 6112) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.method4423(Static410.anInt6680) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.aBoolean466 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.aBoolean474 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.anInt5675;
						return;
					}
					if (arg0 == 6117) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.aBoolean469 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.anInt5696;
						return;
					}
					if (arg0 == 6119) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.anInt5694;
						return;
					}
					if (arg0 == 6120) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.anInt5682;
						return;
					}
					if (arg0 == 6121) {
						anIntArray225[anInt4232++] = Static213.aClass128_22.method3581() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray225[anInt4232++] = Static218.method4375();
						return;
					}
					if (arg0 == 6124) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.anInt5685;
						return;
					}
					if (arg0 == 6125) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.anInt5684;
						return;
					}
					if (arg0 == 6126) {
						anIntArray225[anInt4232++] = Static213.aClass128_22.method3608() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.aBoolean459 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.aBoolean472 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.anInt5678;
						return;
					}
					if (arg0 == 6130) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.aBoolean467 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray225[anInt4232++] = Static410.anInt6680;
						return;
					}
					if (arg0 == 6132) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.anInt5680;
						return;
					}
					if (arg0 == 6133) {
						anIntArray225[anInt4232++] = Static191.anInt3047 == 1 || Static191.anInt3047 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray225[anInt4232++] = Static203.method2772(Static144.anInt2437);
						return;
					}
					if (arg0 == 6135) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.anInt5688;
						return;
					}
					if (arg0 == 6136) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.aBoolean463 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt4232 -= 2;
						Static154.aShort66 = (short) anIntArray225[anInt4232];
						if (Static154.aShort66 <= 0) {
							Static154.aShort66 = 256;
						}
						Static411.aShort89 = (short) anIntArray225[anInt4232 + 1];
						if (Static411.aShort89 <= 0) {
							Static411.aShort89 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt4232 -= 2;
						Static317.aShort60 = (short) anIntArray225[anInt4232];
						if (Static317.aShort60 <= 0) {
							Static317.aShort60 = 256;
						}
						Static39.aShort103 = (short) anIntArray225[anInt4232 + 1];
						if (Static39.aShort103 <= 0) {
							Static39.aShort103 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt4232 -= 4;
						Static195.aShort32 = (short) anIntArray225[anInt4232];
						if (Static195.aShort32 <= 0) {
							Static195.aShort32 = 1;
						}
						Static108.aShort14 = (short) anIntArray225[anInt4232 + 1];
						if (Static108.aShort14 <= 0) {
							Static108.aShort14 = 32767;
						} else if (Static108.aShort14 < Static195.aShort32) {
							Static108.aShort14 = Static195.aShort32;
						}
						Static168.aShort31 = (short) anIntArray225[anInt4232 + 2];
						if (Static168.aShort31 <= 0) {
							Static168.aShort31 = 1;
						}
						Static112.aShort15 = (short) anIntArray225[anInt4232 + 3];
						if (Static112.aShort15 <= 0) {
							Static112.aShort15 = 32767;
							return;
						}
						if (Static112.aShort15 < Static168.aShort31) {
							Static112.aShort15 = Static168.aShort31;
						}
						return;
					}
					if (arg0 == 6203) {
						Static125.method1722(false, Static298.aClass250_7.anInt6997, 0, Static298.aClass250_7.anInt7041, 0);
						anIntArray225[anInt4232++] = Static162.anInt2668;
						anIntArray225[anInt4232++] = Static226.anInt5821;
						return;
					}
					if (arg0 == 6204) {
						anIntArray225[anInt4232++] = Static317.aShort60;
						anIntArray225[anInt4232++] = Static39.aShort103;
						return;
					}
					if (arg0 == 6205) {
						anIntArray225[anInt4232++] = Static154.aShort66;
						anIntArray225[anInt4232++] = Static411.aShort89;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray225[anInt4232++] = (int) (Static232.method3058() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray225[anInt4232++] = (int) (Static232.method3058() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt4232 -= 3;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						local89 = anIntArray225[anInt4232 + 2];
						aCalendar4.clear();
						aCalendar4.set(11, 12);
						aCalendar4.set(local89, local192, local157);
						anIntArray225[anInt4232++] = (int) (aCalendar4.getTime().getTime() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6303) {
						aCalendar4.clear();
						aCalendar4.setTime(new Date(Static232.method3058()));
						anIntArray225[anInt4232++] = aCalendar4.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray225[--anInt4232];
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
						anIntArray225[anInt4232++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray225[anInt4232++] = Static44.method689() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray225[anInt4232++] = Static344.method4379() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static98.anInt1721 == 10 && Static144.anInt2432 == 0 && Static354.anInt5868 == 0 && Static48.anInt801 == 0) {
							anIntArray225[anInt4232++] = Static103.method1472() == -1 ? 0 : 1;
							return;
						}
						anIntArray225[anInt4232++] = 1;
						return;
					}
					@Pc(6160) Class43 local6160;
					@Pc(6127) Class114_Sub1 local6127;
					if (arg0 == 6501) {
						local6127 = Static419.method5235();
						if (local6127 != null) {
							anIntArray225[anInt4232++] = local6127.anInt2760;
							anIntArray225[anInt4232++] = local6127.anInt2752;
							aStringArray34[anInt4225++] = local6127.aString24;
							local6160 = local6127.method2297();
							anIntArray225[anInt4232++] = local6160.anInt1083;
							aStringArray34[anInt4225++] = local6160.aString8;
							anIntArray225[anInt4232++] = local6127.anInt2758;
							anIntArray225[anInt4232++] = local6127.anInt2761;
							return;
						}
						anIntArray225[anInt4232++] = -1;
						anIntArray225[anInt4232++] = 0;
						aStringArray34[anInt4225++] = "";
						anIntArray225[anInt4232++] = 0;
						aStringArray34[anInt4225++] = "";
						anIntArray225[anInt4232++] = 0;
						anIntArray225[anInt4232++] = 0;
						return;
					}
					if (arg0 == 6502) {
						local6127 = Static369.method3949();
						if (local6127 != null) {
							anIntArray225[anInt4232++] = local6127.anInt2760;
							anIntArray225[anInt4232++] = local6127.anInt2752;
							aStringArray34[anInt4225++] = local6127.aString24;
							local6160 = local6127.method2297();
							anIntArray225[anInt4232++] = local6160.anInt1083;
							aStringArray34[anInt4225++] = local6160.aString8;
							anIntArray225[anInt4232++] = local6127.anInt2758;
							anIntArray225[anInt4232++] = local6127.anInt2761;
							return;
						}
						anIntArray225[anInt4232++] = -1;
						anIntArray225[anInt4232++] = 0;
						aStringArray34[anInt4225++] = "";
						anIntArray225[anInt4232++] = 0;
						aStringArray34[anInt4225++] = "";
						anIntArray225[anInt4232++] = 0;
						anIntArray225[anInt4232++] = 0;
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray225[--anInt4232];
						if (Static98.anInt1721 == 10 && Static144.anInt2432 == 0 && Static354.anInt5868 == 0 && Static48.anInt801 == 0) {
							anIntArray225[anInt4232++] = Static240.method3132(local157) ? 1 : 0;
							return;
						}
						anIntArray225[anInt4232++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static336.aClass106_Sub1_1.anInt5681 = anIntArray225[--anInt4232];
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						return;
					}
					if (arg0 == 6505) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.anInt5681;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray225[--anInt4232];
						@Pc(6476) Class114_Sub1 local6476 = Static19.method334(local157);
						if (local6476 != null) {
							anIntArray225[anInt4232++] = local6476.anInt2752;
							aStringArray34[anInt4225++] = local6476.aString24;
							@Pc(6500) Class43 local6500 = local6476.method2297();
							anIntArray225[anInt4232++] = local6500.anInt1083;
							aStringArray34[anInt4225++] = local6500.aString8;
							anIntArray225[anInt4232++] = local6476.anInt2758;
							anIntArray225[anInt4232++] = local6476.anInt2761;
							return;
						}
						anIntArray225[anInt4232++] = -1;
						aStringArray34[anInt4225++] = "";
						anIntArray225[anInt4232++] = 0;
						aStringArray34[anInt4225++] = "";
						anIntArray225[anInt4232++] = 0;
						anIntArray225[anInt4232++] = 0;
						return;
					}
					if (arg0 == 6507) {
						anInt4232 -= 4;
						local157 = anIntArray225[anInt4232];
						local1313 = anIntArray225[anInt4232 + 1] == 1;
						local89 = anIntArray225[anInt4232 + 2];
						local1965 = anIntArray225[anInt4232 + 3] == 1;
						Static41.method656(local1965, local89, local157, local1313);
						return;
					}
					if (arg0 == 6508) {
						Static8.method5546();
						return;
					}
					if (arg0 == 6509) {
						if (Static98.anInt1721 != 10) {
							return;
						}
						Static246.aBoolean318 = anIntArray225[--anInt4232] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static336.aClass106_Sub1_1.aBoolean470 = anIntArray225[--anInt4232] == 1;
						Static336.aClass106_Sub1_1.method4429(Static41.aClass124_2);
						return;
					}
					if (arg0 == 6601) {
						anIntArray225[anInt4232++] = Static336.aClass106_Sub1_1.aBoolean470 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static180.aClass44_2 == Static234.aClass44_4) {
					if (arg0 == 6700) {
						local157 = Static304.aClass257_21.method5500();
						if (Static169.anInt2522 != -1) {
							local157++;
						}
						anIntArray225[anInt4232++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray225[--anInt4232];
						if (Static169.anInt2522 != -1) {
							if (local157 == 0) {
								anIntArray225[anInt4232++] = Static169.anInt2522;
								return;
							}
							local157--;
						}
						@Pc(6758) Class1_Sub26 local6758 = (Class1_Sub26) Static304.aClass257_21.method5506();
						while (local157-- > 0) {
							local6758 = (Class1_Sub26) Static304.aClass257_21.method5501();
						}
						anIntArray225[anInt4232++] = local6758.anInt3847;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray225[--anInt4232];
						if (Static369.aClass250ArrayArray5[local157] == null) {
							aStringArray34[anInt4225++] = "";
							return;
						}
						local81 = Static369.aClass250ArrayArray5[local157][0].aString61;
						if (local81 == null) {
							aStringArray34[anInt4225++] = "";
							return;
						}
						aStringArray34[anInt4225++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray225[--anInt4232];
						if (Static369.aClass250ArrayArray5[local157] == null) {
							anIntArray225[anInt4232++] = 0;
							return;
						}
						anIntArray225[anInt4232++] = Static369.aClass250ArrayArray5[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt4232 -= 2;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						if (Static369.aClass250ArrayArray5[local157] == null) {
							aStringArray34[anInt4225++] = "";
							return;
						}
						local3345 = Static369.aClass250ArrayArray5[local157][local192].aString61;
						if (local3345 == null) {
							aStringArray34[anInt4225++] = "";
							return;
						}
						aStringArray34[anInt4225++] = local3345;
						return;
					}
					if (arg0 == 6705) {
						anInt4232 -= 2;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						if (Static369.aClass250ArrayArray5[local157] == null) {
							anIntArray225[anInt4232++] = 0;
							return;
						}
						anIntArray225[anInt4232++] = Static369.aClass250ArrayArray5[local157][local192].anInt7010;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt4232 -= 3;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						local89 = anIntArray225[anInt4232 + 2];
						Static362.method4702("", 1, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6708) {
						anInt4232 -= 3;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						local89 = anIntArray225[anInt4232 + 2];
						Static362.method4702("", 2, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6709) {
						anInt4232 -= 3;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						local89 = anIntArray225[anInt4232 + 2];
						Static362.method4702("", 3, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6710) {
						anInt4232 -= 3;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						local89 = anIntArray225[anInt4232 + 2];
						Static362.method4702("", 4, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6711) {
						anInt4232 -= 3;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						local89 = anIntArray225[anInt4232 + 2];
						Static362.method4702("", 5, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6712) {
						anInt4232 -= 3;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						local89 = anIntArray225[anInt4232 + 2];
						Static362.method4702("", 6, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6713) {
						anInt4232 -= 3;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						local89 = anIntArray225[anInt4232 + 2];
						Static362.method4702("", 7, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6714) {
						anInt4232 -= 3;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						local89 = anIntArray225[anInt4232 + 2];
						Static362.method4702("", 8, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6715) {
						anInt4232 -= 3;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						local89 = anIntArray225[anInt4232 + 2];
						Static362.method4702("", 9, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6716) {
						anInt4232 -= 3;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						local89 = anIntArray225[anInt4232 + 2];
						Static362.method4702("", 10, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6717) {
						anInt4232 -= 3;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						local89 = anIntArray225[anInt4232 + 2];
						@Pc(7346) Class250 local7346 = Static359.method4655(local89, local157 << 16 | local192);
						Static172.method2334();
						@Pc(7351) Class1_Sub15 local7351 = Static52.method804(local7346);
						Static72.method1140(local7351.method1723(), local7351.anInt2174, local7346);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7379) Class56 local7379;
					if (arg0 == 6800) {
						local157 = anIntArray225[--anInt4232];
						local7379 = Static330.aClass101_3.method2104(local157);
						if (local7379.aString10 == null) {
							aStringArray34[anInt4225++] = "";
							return;
						}
						aStringArray34[anInt4225++] = local7379.aString10;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray225[--anInt4232];
						local7379 = Static330.aClass101_3.method2104(local157);
						anIntArray225[anInt4232++] = local7379.anInt1476;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray225[--anInt4232];
						local7379 = Static330.aClass101_3.method2104(local157);
						anIntArray225[anInt4232++] = local7379.anInt1475;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray225[--anInt4232];
						local7379 = Static330.aClass101_3.method2104(local157);
						anIntArray225[anInt4232++] = local7379.anInt1479;
						return;
					}
					if (arg0 == 6804) {
						anInt4232 -= 2;
						local157 = anIntArray225[anInt4232];
						local192 = anIntArray225[anInt4232 + 1];
						@Pc(7501) Class78 local7501 = Static85.aClass132_5.method2771(local192);
						if (local7501.method1578()) {
							aStringArray34[anInt4225++] = Static330.aClass101_3.method2104(local157).method1226(local7501.aString21, local192);
							return;
						}
						anIntArray225[anInt4232++] = Static330.aClass101_3.method2104(local157).method1225(local192, local7501.anInt1998);
						return;
					}
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
	private static void method3406(@OriginalArg(0) int arg0) {
		@Pc(3) Class250 local3 = Static96.method1379(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class250[] local13 = Static11.aClass250ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class250[] local19 = Static369.aClass250ArrayArray5[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static11.aClass250ArrayArray1[local9] = new Class250[local22];
			Static459.method2114(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static459.method2114(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(IZ)V")
	private static void method3407(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class250 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class250 local35;
		@Pc(13) int local13;
		@Pc(210) Class250 local210;
		@Pc(158) Class250 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt4232 -= 3;
				local13 = anIntArray225[anInt4232];
				local19 = anIntArray225[anInt4232 + 1];
				local25 = anIntArray225[anInt4232 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static96.method1379(local13);
				if (local35.aClass250Array2 == null) {
					local35.aClass250Array2 = new Class250[local25 + 1];
				}
				if (local35.aClass250Array2.length <= local25) {
					@Pc(54) Class250[] local54 = new Class250[local25 + 1];
					for (local56 = 0; local56 < local35.aClass250Array2.length; local56++) {
						local54[local56] = local35.aClass250Array2[local56];
					}
					local35.aClass250Array2 = local54;
				}
				if (local25 > 0 && local35.aClass250Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class250 local99 = new Class250();
				local99.anInt7009 = local19;
				local99.anInt7002 = local99.anInt6994 = local35.anInt6994;
				local99.anInt7038 = local25;
				local35.aClass250Array2[local25] = local99;
				if (arg1) {
					aClass250_4 = local99;
				} else {
					aClass250_5 = local99;
				}
				Static94.method1357(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass250_4 : aClass250_5;
				if (local137.anInt7038 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static96.method1379(local137.anInt6994);
				local158.aClass250Array2[local137.anInt7038] = null;
				Static94.method1357(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static96.method1379(anIntArray225[--anInt4232]);
				local137.aClass250Array2 = null;
				Static94.method1357(local137);
				return;
			}
			if (arg0 == 200) {
				anInt4232 -= 2;
				local13 = anIntArray225[anInt4232];
				local19 = anIntArray225[anInt4232 + 1];
				local210 = Static359.method4655(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray225[anInt4232++] = 1;
					if (arg1) {
						aClass250_4 = local210;
						return;
					}
					aClass250_5 = local210;
					return;
				}
				anIntArray225[anInt4232++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray225[--anInt4232];
				local158 = Static96.method1379(local13);
				if (local158 != null) {
					anIntArray225[anInt4232++] = 1;
					if (arg1) {
						aClass250_4 = local158;
						return;
					}
					aClass250_5 = local158;
					return;
				}
				anIntArray225[anInt4232++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray225[--anInt4232];
				method3404(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray225[--anInt4232];
				method3406(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt4232 -= 2;
					local13 = anIntArray225[anInt4232];
					local19 = anIntArray225[anInt4232 + 1];
					for (local25 = 0; local25 < Static206.anIntArray181.length; local25++) {
						if (Static206.anIntArray181[local25] == local13) {
							Static239.aClass20_Sub3_Sub3_Sub1_1.aClass45_1.method978(local19, Static221.aClass129_2, local25);
							return;
						}
					}
					for (local353 = 0; local353 < Static94.anIntArray76.length; local353++) {
						if (Static94.anIntArray76[local353] == local13) {
							Static239.aClass20_Sub3_Sub3_Sub1_1.aClass45_1.method978(local19, Static221.aClass129_2, local353);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt4232 -= 2;
					local13 = anIntArray225[anInt4232];
					local19 = anIntArray225[anInt4232 + 1];
					Static239.aClass20_Sub3_Sub3_Sub1_1.aClass45_1.method981(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray225[--anInt4232] != 0;
					Static239.aClass20_Sub3_Sub3_Sub1_1.aClass45_1.method977(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static96.method1379(anIntArray225[--anInt4232]);
					} else {
						local137 = arg1 ? aClass250_4 : aClass250_5;
					}
					if (arg0 == 1100) {
						anInt4232 -= 2;
						local137.anInt7015 = anIntArray225[anInt4232];
						if (local137.anInt7015 > local137.anInt7037 - local137.anInt7041) {
							local137.anInt7015 = local137.anInt7037 - local137.anInt7041;
						}
						if (local137.anInt7015 < 0) {
							local137.anInt7015 = 0;
						}
						local137.anInt6966 = anIntArray225[anInt4232 + 1];
						if (local137.anInt6966 > local137.anInt6998 - local137.anInt6997) {
							local137.anInt6966 = local137.anInt6998 - local137.anInt6997;
						}
						if (local137.anInt6966 < 0) {
							local137.anInt6966 = 0;
						}
						Static94.method1357(local137);
						if (local137.anInt7038 == -1) {
							Static219.method1510(local137.anInt6994);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt7029 = anIntArray225[--anInt4232];
						Static94.method1357(local137);
						if (local137.anInt7038 == -1) {
							Static288.method3754(local137.anInt6994);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean581 = anIntArray225[--anInt4232] == 1;
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt7036 = anIntArray225[--anInt4232];
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt7018 = anIntArray225[--anInt4232];
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray225[--anInt4232];
						if (local137.anInt7021 != local19) {
							local137.anInt7021 = local19;
							Static94.method1357(local137);
						}
						if (local137.anInt7038 == -1) {
							Static37.method635(local137.anInt6994);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt7032 = anIntArray225[--anInt4232];
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean580 = anIntArray225[--anInt4232] == 1;
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt7024 = 1;
						local137.anInt6981 = anIntArray225[--anInt4232];
						Static94.method1357(local137);
						if (local137.anInt7038 == -1) {
							Static40.method3801(local137.anInt6994);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt4232 -= 6;
						local137.anInt7045 = anIntArray225[anInt4232];
						local137.anInt6993 = anIntArray225[anInt4232 + 1];
						local137.anInt7006 = anIntArray225[anInt4232 + 2];
						local137.anInt6961 = anIntArray225[anInt4232 + 3];
						local137.anInt7003 = anIntArray225[anInt4232 + 4];
						local137.anInt6972 = anIntArray225[anInt4232 + 5];
						Static94.method1357(local137);
						if (local137.anInt7038 == -1) {
							Static66.method999(local137.anInt6994);
							Static287.method3732(local137.anInt6994);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray225[--anInt4232];
						if (local137.anInt6960 != local19) {
							local137.anInt6960 = local19;
							local137.anInt7023 = 0;
							local137.anInt6980 = 1;
							local137.anInt6988 = 0;
							Static94.method1357(local137);
						}
						if (local137.anInt7038 == -1) {
							Static63.method983(local137.anInt6994);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean573 = anIntArray225[--anInt4232] == 1;
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray34[--anInt4225];
						if (!local1101.equals(local137.aString62)) {
							local137.aString62 = local1101;
							Static94.method1357(local137);
						}
						if (local137.anInt7038 == -1) {
							Static316.method4089(local137.anInt6994);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt6989 = anIntArray225[--anInt4232];
						Static94.method1357(local137);
						if (local137.anInt7038 == -1) {
							Static335.method4288(local137.anInt6994);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt4232 -= 3;
						local137.anInt6973 = anIntArray225[anInt4232];
						local137.anInt7007 = anIntArray225[anInt4232 + 1];
						local137.anInt6976 = anIntArray225[anInt4232 + 2];
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean578 = anIntArray225[--anInt4232] == 1;
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt6996 = anIntArray225[--anInt4232];
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt6987 = anIntArray225[--anInt4232];
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean586 = anIntArray225[--anInt4232] == 1;
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean585 = anIntArray225[--anInt4232] == 1;
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt4232 -= 2;
						local137.anInt7037 = anIntArray225[anInt4232];
						local137.anInt6998 = anIntArray225[anInt4232 + 1];
						Static94.method1357(local137);
						if (local137.anInt7009 == 0) {
							Static325.method4180(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt4232 -= 2;
						local137.anInt6978 = (short) anIntArray225[anInt4232];
						local137.anInt6975 = (short) anIntArray225[anInt4232 + 1];
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean579 = anIntArray225[--anInt4232] == 1;
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt6972 = anIntArray225[--anInt4232];
						Static94.method1357(local137);
						if (local137.anInt7038 == -1) {
							Static66.method999(local137.anInt6994);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray225[--anInt4232];
						local137.aBoolean584 = local19 == 1;
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt4232 -= 2;
						local137.anInt6995 = anIntArray225[anInt4232];
						local137.anInt6986 = anIntArray225[anInt4232 + 1];
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt7039 = anIntArray225[--anInt4232];
						Static94.method1357(local137);
						return;
					}
					@Pc(1454) Class78 local1454;
					if (arg0 == 1127) {
						anInt4232 -= 2;
						local19 = anIntArray225[anInt4232];
						local25 = anIntArray225[anInt4232 + 1];
						local1454 = Static85.aClass132_5.method2771(local19);
						if (local25 != local1454.anInt1998) {
							local137.method5337(local25, local19);
							return;
						}
						local137.method5344(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray225[--anInt4232];
						local1488 = aStringArray34[--anInt4225];
						local1454 = Static85.aClass132_5.method2771(local19);
						if (!local1454.aString21.equals(local1488)) {
							local137.method5340(local19, local1488);
							return;
						}
						local137.method5344(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static96.method1379(anIntArray225[--anInt4232]);
						} else {
							local137 = arg1 ? aClass250_4 : aClass250_5;
						}
						if (arg0 == 1300) {
							local19 = anIntArray225[--anInt4232] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method5343(aStringArray34[--anInt4225], local19);
								return;
							}
							anInt4225--;
							return;
						}
						if (arg0 == 1301) {
							anInt4232 -= 2;
							local19 = anIntArray225[anInt4232];
							local25 = anIntArray225[anInt4232 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass250_14 = null;
								return;
							}
							local137.aClass250_14 = Static359.method4655(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray225[--anInt4232];
							if (local19 != Static391.anInt6421 && local19 != Static124.anInt2159 && local19 != Static209.anInt3369) {
								return;
							}
							local137.anInt7012 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt6959 = anIntArray225[--anInt4232];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt7004 = anIntArray225[--anInt4232];
							return;
						}
						if (arg0 == 1305) {
							local137.aString63 = aStringArray34[--anInt4225];
							return;
						}
						if (arg0 == 1306) {
							local137.aString60 = aStringArray34[--anInt4225];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray55 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt6977 = anIntArray225[--anInt4232];
							local137.anInt6991 = anIntArray225[--anInt4232];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray225[--anInt4232];
							local25 = anIntArray225[--anInt4232];
							if (local25 >= 1 && local25 <= 10) {
								local137.method5341(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString64 = aStringArray34[--anInt4225];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt6958 = anIntArray225[--anInt4232];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt4232 -= 3;
								local19 = anIntArray225[anInt4232] - 1;
								local25 = anIntArray225[anInt4232 + 1];
								local353 = anIntArray225[anInt4232 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt4232 -= 2;
								local19 = 10;
								local25 = anIntArray225[anInt4232];
								local353 = anIntArray225[anInt4232 + 1];
							}
							if (local137.aByteArray89 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray89 = new byte[11];
								local137.aByteArray90 = new byte[11];
								local137.anIntArray473 = new int[11];
							}
							local137.aByteArray89[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean574 = false;
								for (local2290 = 0; local2290 < local137.aByteArray89.length; local2290++) {
									if (local137.aByteArray89[local2290] != 0) {
										local137.aBoolean574 = true;
										break;
									}
								}
							} else {
								local137.aBoolean574 = true;
							}
							local137.aByteArray90[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt6970 = anIntArray225[--anInt4232];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static96.method1379(anIntArray225[--anInt4232]);
						} else {
							local137 = arg1 ? aClass250_4 : aClass250_5;
						}
						local1101 = aStringArray34[--anInt4225];
						@Pc(2369) int[] local2369 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray225[--anInt4232];
							if (local353 > 0) {
								local2369 = new int[local353];
								while (local353-- > 0) {
									local2369[local353] = anIntArray225[--anInt4232];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
						for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2421[local2290] = aStringArray34[--anInt4225];
							} else {
								local2421[local2290] = Integer.valueOf(anIntArray225[--anInt4232]);
							}
						}
						local56 = anIntArray225[--anInt4232];
						if (local56 == -1) {
							local2421 = null;
						} else {
							local2421[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray16 = local2421;
						} else if (arg0 == 1401) {
							local137.anObjectArray22 = local2421;
						} else if (arg0 == 1402) {
							local137.anObjectArray28 = local2421;
						} else if (arg0 == 1403) {
							local137.anObjectArray9 = local2421;
						} else if (arg0 == 1404) {
							local137.anObjectArray32 = local2421;
						} else if (arg0 == 1405) {
							local137.anObjectArray10 = local2421;
						} else if (arg0 == 1406) {
							local137.anObjectArray7 = local2421;
						} else if (arg0 == 1407) {
							local137.anObjectArray24 = local2421;
							local137.anIntArray472 = local2369;
						} else if (arg0 == 1408) {
							local137.anObjectArray31 = local2421;
						} else if (arg0 == 1409) {
							local137.anObjectArray27 = local2421;
						} else if (arg0 == 1410) {
							local137.anObjectArray15 = local2421;
						} else if (arg0 == 1411) {
							local137.anObjectArray21 = local2421;
						} else if (arg0 == 1412) {
							local137.anObjectArray23 = local2421;
						} else if (arg0 == 1414) {
							local137.anObjectArray20 = local2421;
							local137.anIntArray464 = local2369;
						} else if (arg0 == 1415) {
							local137.anObjectArray29 = local2421;
							local137.anIntArray467 = local2369;
						} else if (arg0 == 1416) {
							local137.anObjectArray12 = local2421;
						} else if (arg0 == 1417) {
							local137.anObjectArray25 = local2421;
						} else if (arg0 == 1418) {
							local137.anObjectArray19 = local2421;
						} else if (arg0 == 1419) {
							local137.anObjectArray13 = local2421;
						} else if (arg0 == 1420) {
							local137.anObjectArray30 = local2421;
						} else if (arg0 == 1421) {
							local137.anObjectArray33 = local2421;
						} else if (arg0 == 1422) {
							local137.anObjectArray26 = local2421;
						} else if (arg0 == 1423) {
							local137.lb = local2421;
						} else if (arg0 == 1424) {
							local137.anObjectArray14 = local2421;
						} else if (arg0 == 1425) {
							local137.anObjectArray34 = local2421;
						} else if (arg0 == 1426) {
							local137.anObjectArray11 = local2421;
						} else if (arg0 == 1427) {
							local137.anObjectArray35 = local2421;
						} else if (arg0 == 1428) {
							local137.anObjectArray18 = local2421;
							local137.anIntArray471 = local2369;
						} else if (arg0 == 1429) {
							local137.anObjectArray6 = local2421;
							local137.anIntArray468 = local2369;
						} else if (arg0 == 1430) {
							local137.anObjectArray8 = local2421;
						}
						local137.aBoolean577 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass250_4 : aClass250_5;
						if (arg0 == 1500) {
							anIntArray225[anInt4232++] = local137.anInt6964;
							return;
						}
						if (arg0 == 1501) {
							anIntArray225[anInt4232++] = local137.anInt7013;
							return;
						}
						if (arg0 == 1502) {
							anIntArray225[anInt4232++] = local137.anInt7041;
							return;
						}
						if (arg0 == 1503) {
							anIntArray225[anInt4232++] = local137.anInt6997;
							return;
						}
						if (arg0 == 1504) {
							anIntArray225[anInt4232++] = local137.aBoolean576 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray225[anInt4232++] = local137.anInt7002;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static266.method2728(local137);
							anIntArray225[anInt4232++] = local158 == null ? -1 : local158.anInt6994;
							return;
						}
					} else {
						@Pc(3017) Class78 local3017;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass250_4 : aClass250_5;
							if (arg0 == 1600) {
								anIntArray225[anInt4232++] = local137.anInt7015;
								return;
							}
							if (arg0 == 1601) {
								anIntArray225[anInt4232++] = local137.anInt6966;
								return;
							}
							if (arg0 == 1602) {
								aStringArray34[anInt4225++] = local137.aString62;
								return;
							}
							if (arg0 == 1603) {
								anIntArray225[anInt4232++] = local137.anInt7037;
								return;
							}
							if (arg0 == 1604) {
								anIntArray225[anInt4232++] = local137.anInt6998;
								return;
							}
							if (arg0 == 1605) {
								anIntArray225[anInt4232++] = local137.anInt6972;
								return;
							}
							if (arg0 == 1606) {
								anIntArray225[anInt4232++] = local137.anInt7006;
								return;
							}
							if (arg0 == 1607) {
								anIntArray225[anInt4232++] = local137.anInt7003;
								return;
							}
							if (arg0 == 1608) {
								anIntArray225[anInt4232++] = local137.anInt6961;
								return;
							}
							if (arg0 == 1609) {
								anIntArray225[anInt4232++] = local137.anInt7036;
								return;
							}
							if (arg0 == 1610) {
								anIntArray225[anInt4232++] = local137.anInt7045;
								return;
							}
							if (arg0 == 1611) {
								anIntArray225[anInt4232++] = local137.anInt6993;
								return;
							}
							if (arg0 == 1612) {
								anIntArray225[anInt4232++] = local137.anInt7021;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray225[--anInt4232];
								local3017 = Static85.aClass132_5.method2771(local19);
								if (local3017.method1578()) {
									aStringArray34[anInt4225++] = local137.method5349(local3017.aString21, local19);
								} else {
									anIntArray225[anInt4232++] = local137.method5345(local3017.anInt1998, local19);
								}
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass250_4 : aClass250_5;
							if (arg0 == 1700) {
								anIntArray225[anInt4232++] = local137.anInt7030;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt7030 != -1) {
									anIntArray225[anInt4232++] = local137.anInt7046;
									return;
								}
								anIntArray225[anInt4232++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray225[anInt4232++] = local137.anInt7038;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass250_4 : aClass250_5;
							if (arg0 == 1800) {
								anIntArray225[anInt4232++] = Static52.method804(local137).method1723();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray225[--anInt4232];
								local19--;
								if (local137.aStringArray55 != null && local19 < local137.aStringArray55.length && local137.aStringArray55[local19] != null) {
									aStringArray34[anInt4225++] = local137.aStringArray55[local19];
									return;
								}
								aStringArray34[anInt4225++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString63 == null) {
									aStringArray34[anInt4225++] = "";
									return;
								}
								aStringArray34[anInt4225++] = local137.aString63;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static96.method1379(anIntArray225[--anInt4232]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass250_4 : aClass250_5;
							}
							if (anInt4238 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray35 == null) {
									return;
								}
								@Pc(3254) Class1_Sub31 local3254 = new Class1_Sub31();
								local3254.aClass250_8 = local137;
								local3254.anObjectArray5 = local137.anObjectArray35;
								local3254.anInt5074 = anInt4238 + 1;
								Static6.aClass254_1.method5430(local3254);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static96.method1379(anIntArray225[--anInt4232]);
							if (arg0 == 2500) {
								anIntArray225[anInt4232++] = local137.anInt6964;
								return;
							}
							if (arg0 == 2501) {
								anIntArray225[anInt4232++] = local137.anInt7013;
								return;
							}
							if (arg0 == 2502) {
								anIntArray225[anInt4232++] = local137.anInt7041;
								return;
							}
							if (arg0 == 2503) {
								anIntArray225[anInt4232++] = local137.anInt6997;
								return;
							}
							if (arg0 == 2504) {
								anIntArray225[anInt4232++] = local137.aBoolean576 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray225[anInt4232++] = local137.anInt7002;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static266.method2728(local137);
								anIntArray225[anInt4232++] = local158 == null ? -1 : local158.anInt6994;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static96.method1379(anIntArray225[--anInt4232]);
							if (arg0 == 2600) {
								anIntArray225[anInt4232++] = local137.anInt7015;
								return;
							}
							if (arg0 == 2601) {
								anIntArray225[anInt4232++] = local137.anInt6966;
								return;
							}
							if (arg0 == 2602) {
								aStringArray34[anInt4225++] = local137.aString62;
								return;
							}
							if (arg0 == 2603) {
								anIntArray225[anInt4232++] = local137.anInt7037;
								return;
							}
							if (arg0 == 2604) {
								anIntArray225[anInt4232++] = local137.anInt6998;
								return;
							}
							if (arg0 == 2605) {
								anIntArray225[anInt4232++] = local137.anInt6972;
								return;
							}
							if (arg0 == 2606) {
								anIntArray225[anInt4232++] = local137.anInt7006;
								return;
							}
							if (arg0 == 2607) {
								anIntArray225[anInt4232++] = local137.anInt7003;
								return;
							}
							if (arg0 == 2608) {
								anIntArray225[anInt4232++] = local137.anInt6961;
								return;
							}
							if (arg0 == 2609) {
								anIntArray225[anInt4232++] = local137.anInt7036;
								return;
							}
							if (arg0 == 2610) {
								anIntArray225[anInt4232++] = local137.anInt7045;
								return;
							}
							if (arg0 == 2611) {
								anIntArray225[anInt4232++] = local137.anInt6993;
								return;
							}
							if (arg0 == 2612) {
								anIntArray225[anInt4232++] = local137.anInt7021;
								return;
							}
						} else {
							@Pc(3751) Class1_Sub26 local3751;
							@Pc(3649) Class1_Sub26 local3649;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static96.method1379(anIntArray225[--anInt4232]);
									anIntArray225[anInt4232++] = local137.anInt7030;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static96.method1379(anIntArray225[--anInt4232]);
									if (local137.anInt7030 != -1) {
										anIntArray225[anInt4232++] = local137.anInt7046;
										return;
									}
									anIntArray225[anInt4232++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray225[--anInt4232];
									local3649 = (Class1_Sub26) Static304.aClass257_21.method5503((long) local13);
									if (local3649 != null) {
										anIntArray225[anInt4232++] = 1;
										return;
									}
									anIntArray225[anInt4232++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static96.method1379(anIntArray225[--anInt4232]);
									if (local137.aClass250Array2 == null) {
										anIntArray225[anInt4232++] = 0;
										return;
									}
									local19 = local137.aClass250Array2.length;
									for (local25 = 0; local25 < local137.aClass250Array2.length; local25++) {
										if (local137.aClass250Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray225[anInt4232++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt4232 -= 2;
									local13 = anIntArray225[anInt4232];
									local19 = anIntArray225[anInt4232 + 1];
									local3751 = (Class1_Sub26) Static304.aClass257_21.method5503((long) local13);
									if (local3751 != null && local3751.anInt3847 == local19) {
										anIntArray225[anInt4232++] = 1;
										return;
									}
									anIntArray225[anInt4232++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static96.method1379(anIntArray225[--anInt4232]);
								if (arg0 == 2800) {
									anIntArray225[anInt4232++] = Static52.method804(local137).method1723();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray225[--anInt4232];
									local19--;
									if (local137.aStringArray55 != null && local19 < local137.aStringArray55.length && local137.aStringArray55[local19] != null) {
										aStringArray34[anInt4225++] = local137.aStringArray55[local19];
										return;
									}
									aStringArray34[anInt4225++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString63 == null) {
										aStringArray34[anInt4225++] = "";
										return;
									}
									aStringArray34[anInt4225++] = local137.aString63;
									return;
								}
							} else {
								@Pc(3888) String local3888;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3888 = aStringArray34[--anInt4225];
										Static360.method4660(local3888);
										return;
									}
									if (arg0 == 3101) {
										anInt4232 -= 2;
										Static144.method1906(anIntArray225[anInt4232], anIntArray225[anInt4232 + 1], Static239.aClass20_Sub3_Sub3_Sub1_1);
										return;
									}
									if (arg0 == 3103) {
										Static243.method4692();
										return;
									}
									if (arg0 == 3104) {
										local3888 = aStringArray34[--anInt4225];
										local19 = 0;
										if (Static327.method4190(local3888)) {
											local19 = Static237.method3118(local3888);
										}
										Static5.method94(Static360.aClass137_228);
										Static75.aClass1_Sub11_Sub1_1.method4450(local19);
										return;
									}
									if (arg0 == 3105) {
										local3888 = aStringArray34[--anInt4225];
										Static5.method94(Static209.aClass137_145);
										Static75.aClass1_Sub11_Sub1_1.method4445(local3888.length() + 1);
										Static75.aClass1_Sub11_Sub1_1.method4453(local3888);
										return;
									}
									if (arg0 == 3106) {
										local3888 = aStringArray34[--anInt4225];
										Static5.method94(Static395.aClass137_258);
										Static75.aClass1_Sub11_Sub1_1.method4445(local3888.length() + 1);
										Static75.aClass1_Sub11_Sub1_1.method4453(local3888);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray225[--anInt4232];
										local1101 = aStringArray34[--anInt4225];
										Static429.method5398(local13, local1101);
										return;
									}
									if (arg0 == 3108) {
										anInt4232 -= 3;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										local25 = anIntArray225[anInt4232 + 2];
										local35 = Static96.method1379(local25);
										Static438.method5502(local35, local19, local13);
										return;
									}
									if (arg0 == 3109) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										local210 = arg1 ? aClass250_4 : aClass250_5;
										Static438.method5502(local210, local19, local13);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray225[--anInt4232];
										Static5.method94(Static156.aClass137_112);
										Static75.aClass1_Sub11_Sub1_1.method4448(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										local3751 = (Class1_Sub26) Static304.aClass257_21.method5503((long) local13);
										if (local3751 != null) {
											Static454.method5610(true, local3751.anInt3847 != local19, local3751);
										}
										Static54.method834(local19, true, local13, 3);
										return;
									}
									if (arg0 == 3112) {
										anInt4232--;
										local13 = anIntArray225[anInt4232];
										local3649 = (Class1_Sub26) Static304.aClass257_21.method5503((long) local13);
										if (local3649 != null && local3649.anInt3846 == 3) {
											Static454.method5610(true, true, local3649);
										}
										return;
									}
									if (arg0 == 3113) {
										Static283.method3692(aStringArray34[--anInt4225]);
										return;
									}
									if (arg0 == 3114) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										local1488 = aStringArray34[--anInt4225];
										Static174.method2341(local13, "", local19, "", local1488);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt4232 -= 3;
										Static263.method3375(255, anIntArray225[anInt4232], anIntArray225[anInt4232 + 1], anIntArray225[anInt4232 + 2]);
										return;
									}
									if (arg0 == 3201) {
										Static27.method880(anIntArray225[--anInt4232], 50, 255);
										return;
									}
									if (arg0 == 3202) {
										anInt4232 -= 2;
										Static59.method948(255, anIntArray225[anInt4232], anIntArray225[anInt4232 + 1]);
										return;
									}
									if (arg0 == 3203) {
										anInt4232 -= 4;
										Static263.method3375(anIntArray225[anInt4232 + 3], anIntArray225[anInt4232], anIntArray225[anInt4232 + 1], anIntArray225[anInt4232 + 2]);
										return;
									}
									if (arg0 == 3204) {
										anInt4232 -= 3;
										Static27.method880(anIntArray225[anInt4232], anIntArray225[anInt4232 + 2], anIntArray225[anInt4232 + 1]);
										return;
									}
									if (arg0 == 3205) {
										anInt4232 -= 3;
										Static59.method948(anIntArray225[anInt4232 + 2], anIntArray225[anInt4232], anIntArray225[anInt4232 + 1]);
										return;
									}
									if (arg0 == 3206) {
										anInt4232 -= 4;
										Static237.method3121(anIntArray225[anInt4232 + 1], anIntArray225[anInt4232], anIntArray225[anInt4232 + 2], anIntArray225[anInt4232 + 3]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray225[anInt4232++] = Static368.anInt6250;
										return;
									}
									if (arg0 == 3301) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = Static356.method4570(local13, false, local19);
										return;
									}
									if (arg0 == 3302) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = Static292.method3818(false, local13, local19);
										return;
									}
									if (arg0 == 3303) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = Static172.method2331(false, local13, local19);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static119.aClass228_1.method4845(local13).anInt5268;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static311.anIntArray310[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static366.anIntArray376[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static202.anIntArray179[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4605) byte local4605 = Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89;
										local19 = (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613 >> 7) + Static101.anInt6646;
										local25 = (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616 >> 7) + Static278.anInt4392;
										anIntArray225[anInt4232++] = (local4605 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray225[anInt4232++] = Static305.aBoolean410 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = Static356.method4570(local13, true, local19);
										return;
									}
									if (arg0 == 3314) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = Static292.method3818(true, local13, local19);
										return;
									}
									if (arg0 == 3315) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = Static172.method2331(true, local13, local19);
										return;
									}
									if (arg0 == 3316) {
										if (Static411.anInt6701 >= 2) {
											anIntArray225[anInt4232++] = Static411.anInt6701;
											return;
										}
										anIntArray225[anInt4232++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray225[anInt4232++] = Static300.anInt5023;
										return;
									}
									if (arg0 == 3318) {
										anIntArray225[anInt4232++] = Static62.anInt1112;
										return;
									}
									if (arg0 == 3321) {
										anIntArray225[anInt4232++] = Static50.anInt823;
										return;
									}
									if (arg0 == 3322) {
										anIntArray225[anInt4232++] = Static163.anInt2687;
										return;
									}
									if (arg0 == 3323) {
										if (Static1.anInt48 >= 5 && Static1.anInt48 <= 9) {
											anIntArray225[anInt4232++] = 1;
											return;
										}
										anIntArray225[anInt4232++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static1.anInt48 >= 5 && Static1.anInt48 <= 9) {
											anIntArray225[anInt4232++] = Static1.anInt48;
											return;
										}
										anIntArray225[anInt4232++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray225[anInt4232++] = Static164.aBoolean215 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray225[anInt4232++] = Static239.aClass20_Sub3_Sub3_Sub1_1.anInt4949;
										return;
									}
									if (arg0 == 3327) {
										anIntArray225[anInt4232++] = Static239.aClass20_Sub3_Sub3_Sub1_1.aClass45_1.aBoolean93 ? 1 : 0;
										return;
									}
									if (arg0 == 3328) {
										anIntArray225[anInt4232++] = Static146.aBoolean509 && !Static136.aBoolean171 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray225[anInt4232++] = Static158.aBoolean210 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static317.method4103(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = Static84.method1261(false, local13, local19);
										return;
									}
									if (arg0 == 3332) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = Static84.method1261(true, local13, local19);
										return;
									}
									if (arg0 == 3333) {
										anIntArray225[anInt4232++] = Static405.anInt6545;
										return;
									}
									if (arg0 == 3335) {
										anIntArray225[anInt4232++] = Static188.anInt3028;
										return;
									}
									if (arg0 == 3336) {
										anInt4232 -= 4;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										local25 = anIntArray225[anInt4232 + 2];
										local353 = anIntArray225[anInt4232 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray225[anInt4232++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray225[anInt4232++] = Static28.anInt564;
										return;
									}
									if (arg0 == 3338) {
										anIntArray225[anInt4232++] = Static290.method3792();
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5230) Class64 local5230;
									if (arg0 == 3400) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										local5230 = Static248.aClass242_1.method5027(local13);
										aStringArray34[anInt4225++] = local5230.method1325(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt4232 -= 4;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										local25 = anIntArray225[anInt4232 + 2];
										local353 = anIntArray225[anInt4232 + 3];
										@Pc(5276) Class64 local5276 = Static248.aClass242_1.method5027(local25);
										if (local5276.aChar2 == local13 && local5276.aChar1 == local19) {
											if (local19 == 115) {
												aStringArray34[anInt4225++] = local5276.method1325(local353);
												return;
											}
											anIntArray225[anInt4232++] = local5276.method1322(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt4232 -= 3;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										local25 = anIntArray225[anInt4232 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5352) Class64 local5352 = Static248.aClass242_1.method5027(local19);
										if (local5352.aChar1 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray225[anInt4232++] = local5352.method1321(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray225[--anInt4232];
										local1101 = aStringArray34[--anInt4225];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5230 = Static248.aClass242_1.method5027(local13);
										if (local5230.aChar1 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray225[anInt4232++] = local5230.method1320(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray225[--anInt4232];
										@Pc(5450) Class64 local5450 = Static248.aClass242_1.method5027(local13);
										anIntArray225[anInt4232++] = local5450.aClass257_5.method5500();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static89.anInt1571 == 0) {
											anIntArray225[anInt4232++] = -2;
											return;
										}
										if (Static89.anInt1571 == 1) {
											anIntArray225[anInt4232++] = -1;
											return;
										}
										anIntArray225[anInt4232++] = Static145.anInt2445;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray225[--anInt4232];
										if (Static89.anInt1571 == 2 && local13 < Static145.anInt2445) {
											aStringArray34[anInt4225++] = Static108.aStringArray17[local13];
											if (Static244.aStringArray29[local13] != null) {
												aStringArray34[anInt4225++] = Static244.aStringArray29[local13];
												return;
											}
											aStringArray34[anInt4225++] = "";
											return;
										}
										aStringArray34[anInt4225++] = "";
										aStringArray34[anInt4225++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray225[--anInt4232];
										if (Static89.anInt1571 == 2 && local13 < Static145.anInt2445) {
											anIntArray225[anInt4232++] = Static163.anIntArray137[local13];
											return;
										}
										anIntArray225[anInt4232++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray225[--anInt4232];
										if (Static89.anInt1571 == 2 && local13 < Static145.anInt2445) {
											anIntArray225[anInt4232++] = Static154.anIntArray343[local13];
											return;
										}
										anIntArray225[anInt4232++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3888 = aStringArray34[--anInt4225];
										local19 = anIntArray225[--anInt4232];
										Static422.method5257(local3888, local19);
										return;
									}
									if (arg0 == 3605) {
										local3888 = aStringArray34[--anInt4225];
										Static133.method1798(local3888);
										return;
									}
									if (arg0 == 3606) {
										local3888 = aStringArray34[--anInt4225];
										Static321.method3571(local3888);
										return;
									}
									if (arg0 == 3607) {
										local3888 = aStringArray34[--anInt4225];
										Static146.method4740(false, local3888);
										return;
									}
									if (arg0 == 3608) {
										local3888 = aStringArray34[--anInt4225];
										Static160.method5151(local3888);
										return;
									}
									if (arg0 == 3609) {
										local3888 = aStringArray34[--anInt4225];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray225[anInt4232++] = Static249.method3243(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray225[--anInt4232];
										if (Static89.anInt1571 == 2 && local13 < Static145.anInt2445) {
											aStringArray34[anInt4225++] = Static226.aStringArray47[local13];
											return;
										}
										aStringArray34[anInt4225++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static234.aString38 != null) {
											aStringArray34[anInt4225++] = Static438.method5505(Static234.aString38);
											return;
										}
										aStringArray34[anInt4225++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static234.aString38 != null) {
											anIntArray225[anInt4232++] = Static73.anInt1389;
											return;
										}
										anIntArray225[anInt4232++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray225[--anInt4232];
										if (Static234.aString38 != null && local13 < Static73.anInt1389) {
											aStringArray34[anInt4225++] = Static401.aClass76Array2[local13].aString19;
											return;
										}
										aStringArray34[anInt4225++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray225[--anInt4232];
										if (Static234.aString38 != null && local13 < Static73.anInt1389) {
											anIntArray225[anInt4232++] = Static401.aClass76Array2[local13].anInt1926;
											return;
										}
										anIntArray225[anInt4232++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray225[--anInt4232];
										if (Static234.aString38 != null && local13 < Static73.anInt1389) {
											anIntArray225[anInt4232++] = Static401.aClass76Array2[local13].aByte15;
											return;
										}
										anIntArray225[anInt4232++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray225[anInt4232++] = Static370.aByte83;
										return;
									}
									if (arg0 == 3617) {
										local3888 = aStringArray34[--anInt4225];
										Static78.method1214(local3888);
										return;
									}
									if (arg0 == 3618) {
										anIntArray225[anInt4232++] = Static433.aByte103;
										return;
									}
									if (arg0 == 3619) {
										local3888 = aStringArray34[--anInt4225];
										Static169.method2128(local3888);
										return;
									}
									if (arg0 == 3620) {
										Static135.method1815();
										return;
									}
									if (arg0 == 3621) {
										if (Static89.anInt1571 == 0) {
											anIntArray225[anInt4232++] = -1;
											return;
										}
										anIntArray225[anInt4232++] = Static360.anInt5990;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray225[--anInt4232];
										if (Static89.anInt1571 != 0 && local13 < Static360.anInt5990) {
											aStringArray34[anInt4225++] = Static76.aStringArray10[local13];
											if (Static11.aStringArray1[local13] != null) {
												aStringArray34[anInt4225++] = Static11.aStringArray1[local13];
												return;
											}
											aStringArray34[anInt4225++] = "";
											return;
										}
										aStringArray34[anInt4225++] = "";
										aStringArray34[anInt4225++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3888 = aStringArray34[--anInt4225];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray225[anInt4232++] = Static281.method3533(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray225[--anInt4232];
										if (Static401.aClass76Array2 != null && local13 < Static73.anInt1389 && Static401.aClass76Array2[local13].aString16.equalsIgnoreCase(Static239.aClass20_Sub3_Sub3_Sub1_1.aString48)) {
											anIntArray225[anInt4232++] = 1;
											return;
										}
										anIntArray225[anInt4232++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static4.aString1 != null) {
											aStringArray34[anInt4225++] = Static4.aString1;
											return;
										}
										aStringArray34[anInt4225++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray225[--anInt4232];
										if (Static234.aString38 != null && local13 < Static73.anInt1389) {
											aStringArray34[anInt4225++] = Static401.aClass76Array2[local13].aString17;
											return;
										}
										aStringArray34[anInt4225++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray225[--anInt4232];
										if (Static89.anInt1571 == 2 && local13 >= 0 && local13 < Static145.anInt2445) {
											anIntArray225[anInt4232++] = Static82.aBooleanArray10[local13] ? 1 : 0;
											return;
										}
										anIntArray225[anInt4232++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3888 = aStringArray34[--anInt4225];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray225[anInt4232++] = Static229.method3033(local3888);
										return;
									}
									if (arg0 == 3629) {
										anIntArray225[anInt4232++] = Static160.anInt6707;
										return;
									}
									if (arg0 == 3630) {
										local3888 = aStringArray34[--anInt4225];
										Static146.method4740(true, local3888);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static304.aBooleanArray23[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray225[--anInt4232];
										if (Static234.aString38 != null && local13 < Static73.anInt1389) {
											aStringArray34[anInt4225++] = Static401.aClass76Array2[local13].aString16;
											return;
										}
										aStringArray34[anInt4225++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray225[--anInt4232];
										if (Static89.anInt1571 != 0 && local13 < Static360.anInt5990) {
											aStringArray34[anInt4225++] = Static43.aStringArray44[local13];
											return;
										}
										aStringArray34[anInt4225++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static290.aClass237Array1[local13].method4997();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static290.aClass237Array1[local13].anInt6489;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static290.aClass237Array1[local13].anInt6486;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static290.aClass237Array1[local13].anInt6491;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static290.aClass237Array1[local13].anInt6495;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static290.aClass237Array1[local13].anInt6490;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray225[--anInt4232];
										local19 = Static290.aClass237Array1[local13].method4999();
										anIntArray225[anInt4232++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray225[--anInt4232];
										local19 = Static290.aClass237Array1[local13].method4999();
										anIntArray225[anInt4232++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray225[--anInt4232];
										local19 = Static290.aClass237Array1[local13].method4999();
										anIntArray225[anInt4232++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray225[--anInt4232];
										local19 = Static290.aClass237Array1[local13].method4999();
										anIntArray225[anInt4232++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt4232 -= 5;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										local25 = anIntArray225[anInt4232 + 2];
										local353 = anIntArray225[anInt4232 + 3];
										local2290 = anIntArray225[anInt4232 + 4];
										anIntArray225[anInt4232++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(6960) long local6960;
									@Pc(6953) long local6953;
									if (arg0 == 4007) {
										anInt4232 -= 2;
										local6953 = anIntArray225[anInt4232];
										local6960 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = (int) (local6953 + local6953 * local6960 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										if (local13 == 0) {
											anIntArray225[anInt4232++] = 0;
											return;
										}
										anIntArray225[anInt4232++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										if (local13 == 0) {
											anIntArray225[anInt4232++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray225[anInt4232++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray225[anInt4232++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt4232 -= 3;
										local6953 = anIntArray225[anInt4232];
										local6960 = anIntArray225[anInt4232 + 1];
										@Pc(7341) long local7341 = (long) anIntArray225[anInt4232 + 2];
										anIntArray225[anInt4232++] = (int) (local6953 * local7341 / local6960);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3888 = aStringArray34[--anInt4225];
										local19 = anIntArray225[--anInt4232];
										aStringArray34[anInt4225++] = local3888 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt4225 -= 2;
										local3888 = aStringArray34[anInt4225];
										local1101 = aStringArray34[anInt4225 + 1];
										aStringArray34[anInt4225++] = local3888 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3888 = aStringArray34[--anInt4225];
										local19 = anIntArray225[--anInt4232];
										aStringArray34[anInt4225++] = local3888 + Static333.method4259(local19);
										return;
									}
									if (arg0 == 4103) {
										local3888 = aStringArray34[--anInt4225];
										aStringArray34[anInt4225++] = local3888.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray34[anInt4225++] = method3410(anIntArray225[--anInt4232]);
										return;
									}
									if (arg0 == 4105) {
										anInt4225 -= 2;
										local3888 = aStringArray34[anInt4225];
										local1101 = aStringArray34[anInt4225 + 1];
										if (Static239.aClass20_Sub3_Sub3_Sub1_1.aClass45_1 != null && Static239.aClass20_Sub3_Sub3_Sub1_1.aClass45_1.aBoolean93) {
											aStringArray34[anInt4225++] = local1101;
											return;
										}
										aStringArray34[anInt4225++] = local3888;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray225[--anInt4232];
										aStringArray34[anInt4225++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt4225 -= 2;
										anIntArray225[anInt4232++] = Static306.method3997(Static188.anInt3028, aStringArray34[anInt4225 + 1], aStringArray34[anInt4225]);
										return;
									}
									@Pc(7624) Class122 local7624;
									if (arg0 == 4108) {
										local3888 = aStringArray34[--anInt4225];
										anInt4232 -= 2;
										local19 = anIntArray225[anInt4232];
										local25 = anIntArray225[anInt4232 + 1];
										local7624 = Static41.method653(Static166.aClass113_59, local25);
										anIntArray225[anInt4232++] = local7624.method2471(local3888, local19, Static361.aClass49Array120);
										return;
									}
									if (arg0 == 4109) {
										local3888 = aStringArray34[--anInt4225];
										anInt4232 -= 2;
										local19 = anIntArray225[anInt4232];
										local25 = anIntArray225[anInt4232 + 1];
										local7624 = Static41.method653(Static166.aClass113_59, local25);
										anIntArray225[anInt4232++] = local7624.method2473(local19, Static361.aClass49Array120, local3888);
										return;
									}
									if (arg0 == 4110) {
										anInt4225 -= 2;
										local3888 = aStringArray34[anInt4225];
										local1101 = aStringArray34[anInt4225 + 1];
										if (anIntArray225[--anInt4232] == 1) {
											aStringArray34[anInt4225++] = local3888;
											return;
										}
										aStringArray34[anInt4225++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3888 = aStringArray34[--anInt4225];
										aStringArray34[anInt4225++] = Static25.method476(local3888);
										return;
									}
									if (arg0 == 4112) {
										local3888 = aStringArray34[--anInt4225];
										local19 = anIntArray225[--anInt4232];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray34[anInt4225++] = local3888 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static253.method3256((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static63.method972((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static437.method5475((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static246.method3213((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3888 = aStringArray34[--anInt4225];
										if (local3888 != null) {
											anIntArray225[anInt4232++] = local3888.length();
											return;
										}
										anIntArray225[anInt4232++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3888 = aStringArray34[--anInt4225];
										anInt4232 -= 2;
										local19 = anIntArray225[anInt4232];
										local25 = anIntArray225[anInt4232 + 1];
										aStringArray34[anInt4225++] = local3888.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3888 = aStringArray34[--anInt4225];
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
										aStringArray34[anInt4225++] = local7987.toString();
										return;
									}
									if (arg0 == 4120) {
										local3888 = aStringArray34[--anInt4225];
										anInt4232 -= 2;
										local19 = anIntArray225[anInt4232];
										local25 = anIntArray225[anInt4232 + 1];
										anIntArray225[anInt4232++] = local3888.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt4225 -= 2;
										local3888 = aStringArray34[anInt4225];
										local1101 = aStringArray34[anInt4225 + 1];
										local25 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = local3888.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray225[--anInt4232] != 0;
										local19 = anIntArray225[--anInt4232];
										aStringArray34[anInt4225++] = Static388.method790((long) local19, local412, Static188.anInt3028, 0);
										return;
									}
									if (arg0 == 4125) {
										local3888 = aStringArray34[--anInt4225];
										local19 = anIntArray225[--anInt4232];
										@Pc(8210) Class122 local8210 = Static41.method653(Static166.aClass113_59, local19);
										anIntArray225[anInt4232++] = local8210.method2474(local3888, Static361.aClass49Array120);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray225[--anInt4232];
										aStringArray34[anInt4225++] = Static227.aClass65_2.method1327(local13).aString14;
										return;
									}
									@Pc(8272) Class74 local8272;
									if (arg0 == 4201) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										local8272 = Static227.aClass65_2.method1327(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray15[local19 - 1] != null) {
											aStringArray34[anInt4225++] = local8272.aStringArray15[local19 - 1];
											return;
										}
										aStringArray34[anInt4225++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										local8272 = Static227.aClass65_2.method1327(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray16[local19 - 1] != null) {
											aStringArray34[anInt4225++] = local8272.aStringArray16[local19 - 1];
											return;
										}
										aStringArray34[anInt4225++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static227.aClass65_2.method1327(local13).anInt1880;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static227.aClass65_2.method1327(local13).anInt1894 == 1 ? 1 : 0;
										return;
									}
									@Pc(8435) Class74 local8435;
									if (arg0 == 4205) {
										local13 = anIntArray225[--anInt4232];
										local8435 = Static227.aClass65_2.method1327(local13);
										if (local8435.anInt1848 == -1 && local8435.anInt1857 >= 0) {
											anIntArray225[anInt4232++] = local8435.anInt1857;
											return;
										}
										anIntArray225[anInt4232++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray225[--anInt4232];
										local8435 = Static227.aClass65_2.method1327(local13);
										if (local8435.anInt1848 >= 0 && local8435.anInt1857 >= 0) {
											anIntArray225[anInt4232++] = local8435.anInt1857;
											return;
										}
										anIntArray225[anInt4232++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray225[--anInt4232];
										anIntArray225[anInt4232++] = Static227.aClass65_2.method1327(local13).aBoolean138 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										local3017 = Static85.aClass132_5.method2771(local19);
										if (local3017.method1578()) {
											aStringArray34[anInt4225++] = Static227.aClass65_2.method1327(local13).method1489(local3017.aString21, local19);
											return;
										}
										anIntArray225[anInt4232++] = Static227.aClass65_2.method1327(local13).method1504(local19, local3017.anInt1998);
										return;
									}
									if (arg0 == 4209) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1] - 1;
										local8272 = Static227.aClass65_2.method1327(local13);
										if (local8272.anInt1895 == local19) {
											anIntArray225[anInt4232++] = local8272.anInt1897;
											return;
										}
										if (local8272.anInt1899 == local19) {
											anIntArray225[anInt4232++] = local8272.anInt1861;
											return;
										}
										anIntArray225[anInt4232++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3888 = aStringArray34[--anInt4225];
										local19 = anIntArray225[--anInt4232];
										Static25.method481(local3888, local19 == 1);
										anIntArray225[anInt4232++] = Static62.anInt1109;
										return;
									}
									if (arg0 == 4211) {
										if (Static355.aShortArray72 != null && Static441.anInt7348 < Static62.anInt1109) {
											anIntArray225[anInt4232++] = Static355.aShortArray72[Static441.anInt7348++] & 0xFFFF;
											return;
										}
										anIntArray225[anInt4232++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static441.anInt7348 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										local3017 = Static85.aClass132_5.method2771(local19);
										if (local3017.method1578()) {
											aStringArray34[anInt4225++] = Static304.aClass27_1.method588(local13).method5249(local3017.aString21, local19);
											return;
										}
										anIntArray225[anInt4232++] = Static304.aClass27_1.method588(local13).method5259(local3017.anInt1998, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										local3017 = Static85.aClass132_5.method2771(local19);
										if (local3017.method1578()) {
											aStringArray34[anInt4225++] = Static259.aClass95_3.method1821(local13).method2829(local19, local3017.aString21);
											return;
										}
										anIntArray225[anInt4232++] = Static259.aClass95_3.method1821(local13).method2828(local3017.anInt1998, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt4232 -= 2;
										local13 = anIntArray225[anInt4232];
										local19 = anIntArray225[anInt4232 + 1];
										local3017 = Static85.aClass132_5.method2771(local19);
										if (local3017.method1578()) {
											aStringArray34[anInt4225++] = Static120.aClass267_2.method5602(local13).method732(local3017.aString21, local19);
											return;
										}
										anIntArray225[anInt4232++] = Static120.aClass267_2.method5602(local13).method729(local3017.anInt1998, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray225[--anInt4232];
									@Pc(8936) Class51 local8936 = Static332.aClass174_1.method3490(local13);
									if (local8936.anIntArray57 != null && local8936.anIntArray57.length > 0) {
										local25 = 0;
										local353 = local8936.anIntArray59[0];
										for (local2290 = 1; local2290 < local8936.anIntArray57.length; local2290++) {
											if (local8936.anIntArray59[local2290] > local353) {
												local25 = local2290;
												local353 = local8936.anIntArray59[local2290];
											}
										}
										anIntArray225[anInt4232++] = local8936.anIntArray57[local25];
										return;
									}
									anIntArray225[anInt4232++] = local8936.anInt1318;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static96.method1379(anIntArray225[--anInt4232]);
					} else {
						local137 = arg1 ? aClass250_4 : aClass250_5;
					}
					Static94.method1357(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt4232 -= 2;
						local19 = anIntArray225[anInt4232];
						local25 = anIntArray225[anInt4232 + 1];
						if (local137.anInt7038 == -1) {
							Static312.method4047(local137.anInt6994);
							Static66.method999(local137.anInt6994);
							Static287.method3732(local137.anInt6994);
						}
						if (local19 == -1) {
							local137.anInt7024 = 1;
							local137.anInt6981 = -1;
							local137.anInt7030 = -1;
							return;
						}
						local137.anInt7030 = local19;
						local137.anInt7046 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean582 = true;
						} else {
							local137.aBoolean582 = false;
						}
						@Pc(1630) Class74 local1630 = Static227.aClass65_2.method1327(local19);
						local137.anInt7006 = local1630.anInt1863;
						local137.anInt6961 = local1630.anInt1860;
						local137.anInt7003 = local1630.anInt1841;
						local137.anInt7045 = local1630.anInt1856;
						local137.anInt6993 = local1630.anInt1876;
						local137.anInt6972 = local1630.anInt1870;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt7019 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt7019 = 1;
						} else {
							local137.anInt7019 = 2;
						}
						if (local137.anInt7027 > 0) {
							local137.anInt6972 = local137.anInt6972 * 32 / local137.anInt7027;
							return;
						}
						if (local137.anInt7022 > 0) {
							local137.anInt6972 = local137.anInt6972 * 32 / local137.anInt7022;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt7024 = 2;
						local137.anInt6981 = anIntArray225[--anInt4232];
						if (local137.anInt7038 == -1) {
							Static40.method3801(local137.anInt6994);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt7024 = 3;
						local137.anInt6981 = -1;
						if (local137.anInt7038 == -1) {
							Static40.method3801(local137.anInt6994);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt7024 = 6;
						local137.anInt6981 = anIntArray225[--anInt4232];
						if (local137.anInt7038 == -1) {
							Static40.method3801(local137.anInt6994);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt7024 = 5;
						local137.anInt6981 = anIntArray225[--anInt4232];
						if (local137.anInt7038 == -1) {
							Static40.method3801(local137.anInt6994);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt4232 -= 4;
						local137.anInt6957 = anIntArray225[anInt4232];
						local137.anInt7044 = anIntArray225[anInt4232 + 1];
						local137.anInt7028 = anIntArray225[anInt4232 + 2];
						local137.anInt7048 = anIntArray225[anInt4232 + 3];
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt4232 -= 2;
						local137.anInt7026 = anIntArray225[anInt4232];
						local137.anInt7000 = anIntArray225[anInt4232 + 1];
						Static94.method1357(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt4232 -= 4;
						local137.anInt6981 = anIntArray225[anInt4232];
						local137.anInt6982 = anIntArray225[anInt4232 + 1];
						if (anIntArray225[anInt4232 + 2] == 1) {
							local137.anInt7024 = 9;
						} else {
							local137.anInt7024 = 8;
						}
						if (anIntArray225[anInt4232 + 3] == 1) {
							local137.aBoolean582 = true;
						} else {
							local137.aBoolean582 = false;
						}
						if (local137.anInt7038 == -1) {
							Static40.method3801(local137.anInt6994);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt7024 = 5;
						local137.anInt6981 = Static348.anInt5668;
						local137.anInt6982 = 0;
						if (local137.anInt7038 == -1) {
							Static40.method3801(local137.anInt6994);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static96.method1379(anIntArray225[--anInt4232]);
				} else {
					local137 = arg1 ? aClass250_4 : aClass250_5;
				}
				if (arg0 == 1000) {
					anInt4232 -= 4;
					local137.anInt7040 = anIntArray225[anInt4232];
					local137.anInt7005 = anIntArray225[anInt4232 + 1];
					local19 = anIntArray225[anInt4232 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray225[anInt4232 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte98 = (byte) local19;
					local137.aByte100 = (byte) local25;
					Static94.method1357(local137);
					Static370.method4801(local137);
					if (local137.anInt7038 == -1) {
						Static14.method214(local137.anInt6994);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt4232 -= 4;
					local137.anInt7022 = anIntArray225[anInt4232];
					local137.anInt6974 = anIntArray225[anInt4232 + 1];
					local137.anInt7027 = 0;
					local137.anInt6955 = 0;
					local19 = anIntArray225[anInt4232 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray225[anInt4232 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte99 = (byte) local19;
					local137.aByte101 = (byte) local25;
					Static94.method1357(local137);
					Static370.method4801(local137);
					if (local137.anInt7009 == 0) {
						Static325.method4180(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray225[--anInt4232] == 1;
					if (local137.aBoolean576 != local620) {
						local137.aBoolean576 = local620;
						Static94.method1357(local137);
					}
					if (local137.anInt7038 == -1) {
						Static225.method2998(local137.anInt6994);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt4232 -= 2;
					local137.anInt7034 = anIntArray225[anInt4232];
					local137.anInt6967 = anIntArray225[anInt4232 + 1];
					Static94.method1357(local137);
					Static370.method4801(local137);
					if (local137.anInt7009 == 0) {
						Static325.method4180(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean572 = anIntArray225[--anInt4232] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!wt;II)V")
	public static void method3408(@OriginalArg(0) Class268 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub3_Sub12 local5 = Static6.method107(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray226 = new int[local5.anInt4085];
		aStringArray33 = new String[local5.anInt4088];
		if (local5.aClass268_86 == Static392.aClass268_130 || local5.aClass268_86 == Static160.aClass268_133 || local5.aClass268_86 == Static281.aClass268_94) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static289.aClass250_6 != null) {
				local30 = Static289.aClass250_6.anInt6964;
				local32 = Static289.aClass250_6.anInt7013;
			}
			anIntArray226[0] = Static210.aClass26_1.method576() - local30;
			anIntArray226[1] = Static210.aClass26_1.method574() - local32;
		}
		method3409(local5, 200000);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!mo;I)V")
	private static void method3409(@OriginalArg(0) Class1_Sub3_Sub12 arg0, @OriginalArg(1) int arg1) {
		anInt4232 = 0;
		anInt4225 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray217;
		@Pc(11) int[] local11 = arg0.anIntArray216;
		@Pc(13) byte local13 = -1;
		anInt4230 = 0;
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
						method3407(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method3405(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray225[anInt4232++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray225[anInt4232++] = Static364.aClass259_1.anIntArray487[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static364.aClass259_1.method5522(local54, anIntArray225[--anInt4232]);
					} else if (local31 == 3) {
						aStringArray34[anInt4225++] = arg0.aStringArray30[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt4232 -= 2;
						if (anIntArray225[anInt4232] != anIntArray225[anInt4232 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt4232 -= 2;
						if (anIntArray225[anInt4232] == anIntArray225[anInt4232 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt4232 -= 2;
						if (anIntArray225[anInt4232] < anIntArray225[anInt4232 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt4232 -= 2;
						if (anIntArray225[anInt4232] > anIntArray225[anInt4232 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt4230 == 0) {
							return;
						}
						@Pc(216) Class93 local216 = aClass93Array1[--anInt4230];
						arg0 = local216.aClass1_Sub3_Sub12_1;
						local8 = arg0.anIntArray217;
						local11 = arg0.anIntArray216;
						local5 = local216.anInt2279;
						anIntArray226 = local216.anIntArray108;
						aStringArray33 = local216.aStringArray20;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray225[anInt4232++] = Static364.aClass259_1.method5519(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static364.aClass259_1.method5530(anIntArray225[--anInt4232], local54);
					} else if (local31 == 31) {
						anInt4232 -= 2;
						if (anIntArray225[anInt4232] <= anIntArray225[anInt4232 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt4232 -= 2;
						if (anIntArray225[anInt4232] >= anIntArray225[anInt4232 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray225[anInt4232++] = anIntArray226[local11[local5]];
					} else if (local31 == 34) {
						anIntArray226[local11[local5]] = anIntArray225[--anInt4232];
					} else if (local31 == 35) {
						aStringArray34[anInt4225++] = aStringArray33[local11[local5]];
					} else if (local31 == 36) {
						aStringArray33[local11[local5]] = aStringArray34[--anInt4225];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt4225 -= local54;
						@Pc(400) String local400 = Static25.method478(anInt4225, aStringArray34, local54);
						aStringArray34[anInt4225++] = local400;
					} else if (local31 == 38) {
						anInt4232--;
					} else if (local31 == 39) {
						anInt4225--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class1_Sub3_Sub12 local436 = Static349.method4414(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt4085];
							@Pc(450) String[] local450 = new String[local436.anInt4088];
							for (local452 = 0; local452 < local436.anInt4086; local452++) {
								local446[local452] = anIntArray225[anInt4232 + local452 - local436.anInt4086];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt4089; local471++) {
								local450[local471] = aStringArray34[anInt4225 + local471 - local436.anInt4089];
							}
							anInt4232 -= local436.anInt4086;
							anInt4225 -= local436.anInt4089;
							@Pc(502) Class93 local502 = new Class93();
							local502.aClass1_Sub3_Sub12_1 = arg0;
							local502.anInt2279 = local5;
							local502.anIntArray108 = anIntArray226;
							local502.aStringArray20 = aStringArray33;
							if (anInt4230 >= aClass93Array1.length) {
								throw new RuntimeException();
							}
							aClass93Array1[anInt4230++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray217;
							local11 = local436.anIntArray216;
							local5 = -1;
							anIntArray226 = local446;
							aStringArray33 = local450;
						} else if (local31 == 42) {
							anIntArray225[anInt4232++] = Static156.anIntArray134[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static156.anIntArray134[local54] = anIntArray225[--anInt4232];
							Static437.method5474(local54);
							Static447.aBoolean604 |= Static389.aBooleanArray12[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray225[--anInt4232];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray224[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray103[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray225[--anInt4232];
							if (local603 < 0 || local603 >= anIntArray224[local54]) {
								throw new RuntimeException();
							}
							anIntArray225[anInt4232++] = anIntArrayArray103[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt4232 -= 2;
							local603 = anIntArray225[anInt4232];
							if (local603 < 0 || local603 >= anIntArray224[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray103[local54][local603] = anIntArray225[anInt4232 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static260.aStringArray46[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray34[anInt4225++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static260.aStringArray46[local54] = aStringArray34[--anInt4225];
							Static366.method4765(local54);
						} else if (local31 == 51) {
							@Pc(774) Class257 local774 = arg0.aClass257Array1[local11[local5]];
							@Pc(787) Class1_Sub6 local787 = (Class1_Sub6) local774.method5503((long) anIntArray225[--anInt4232]);
							if (local787 != null) {
								local5 += local787.anInt796;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString41 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong226).append(" ");
				for (local603 = anInt4230 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass93Array1[local603].aClass1_Sub3_Sub12_1.aLong226).append(" ");
				}
				local855.append("op: ").append(local13);
				Static211.method2815(local837, local855.toString());
			} else {
				Static360.method4660("Clientscript error in: " + arg0.aString41);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString41).append("\n");
				for (local603 = anInt4230 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass93Array1[local603].aClass1_Sub3_Sub12_1.aString41).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static211.method2815(local837, local855.toString());
				Static382.method4881(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method3410(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar4.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar4.get(5);
		@Pc(20) int local20 = aCalendar4.get(2);
		@Pc(24) int local24 = aCalendar4.get(1);
		return local16 + "-" + aStringArray35[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "()V")
	public static void method3412() {
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method3413(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static411.anInt6701 == 0 && (Static146.aBoolean509 && !Static136.aBoolean171 || Static158.aBoolean210)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static7.aClass151_198.method3122(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static7.aClass151_198.method3122(0).length());
		} else if (local11.startsWith(Static148.aClass151_83.method3122(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static148.aClass151_83.method3122(0).length());
		} else if (local11.startsWith(Static117.aClass151_68.method3122(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static117.aClass151_68.method3122(0).length());
		} else if (local11.startsWith(Static332.aClass151_173.method3122(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static332.aClass151_173.method3122(0).length());
		} else if (local11.startsWith(Static222.aClass151_118.method3122(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static222.aClass151_118.method3122(0).length());
		} else if (local11.startsWith(Static283.aClass151_147.method3122(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static283.aClass151_147.method3122(0).length());
		} else if (local11.startsWith(Static68.aClass151_42.method3122(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static68.aClass151_42.method3122(0).length());
		} else if (local11.startsWith(Static95.aClass151_55.method3122(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static95.aClass151_55.method3122(0).length());
		} else if (local11.startsWith(Static33.aClass151_22.method3122(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static33.aClass151_22.method3122(0).length());
		} else if (local11.startsWith(Static397.aClass151_202.method3122(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static397.aClass151_202.method3122(0).length());
		} else if (local11.startsWith(Static353.aClass151_182.method3122(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static353.aClass151_182.method3122(0).length());
		} else if (local11.startsWith(Static203.aClass151_106.method3122(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static203.aClass151_106.method3122(0).length());
		} else if (Static188.anInt3028 != 0) {
			if (local11.startsWith(Static7.aClass151_198.method3122(Static188.anInt3028))) {
				local13 = 0;
				arg0 = arg0.substring(Static7.aClass151_198.method3122(Static188.anInt3028).length());
			} else if (local11.startsWith(Static148.aClass151_83.method3122(Static188.anInt3028))) {
				local13 = 1;
				arg0 = arg0.substring(Static148.aClass151_83.method3122(Static188.anInt3028).length());
			} else if (local11.startsWith(Static117.aClass151_68.method3122(Static188.anInt3028))) {
				local13 = 2;
				arg0 = arg0.substring(Static117.aClass151_68.method3122(Static188.anInt3028).length());
			} else if (local11.startsWith(Static332.aClass151_173.method3122(Static188.anInt3028))) {
				local13 = 3;
				arg0 = arg0.substring(Static332.aClass151_173.method3122(Static188.anInt3028).length());
			} else if (local11.startsWith(Static222.aClass151_118.method3122(Static188.anInt3028))) {
				local13 = 4;
				arg0 = arg0.substring(Static222.aClass151_118.method3122(Static188.anInt3028).length());
			} else if (local11.startsWith(Static283.aClass151_147.method3122(Static188.anInt3028))) {
				local13 = 5;
				arg0 = arg0.substring(Static283.aClass151_147.method3122(Static188.anInt3028).length());
			} else if (local11.startsWith(Static68.aClass151_42.method3122(Static188.anInt3028))) {
				local13 = 6;
				arg0 = arg0.substring(Static68.aClass151_42.method3122(Static188.anInt3028).length());
			} else if (local11.startsWith(Static95.aClass151_55.method3122(Static188.anInt3028))) {
				local13 = 7;
				arg0 = arg0.substring(Static95.aClass151_55.method3122(Static188.anInt3028).length());
			} else if (local11.startsWith(Static33.aClass151_22.method3122(Static188.anInt3028))) {
				local13 = 8;
				arg0 = arg0.substring(Static33.aClass151_22.method3122(Static188.anInt3028).length());
			} else if (local11.startsWith(Static397.aClass151_202.method3122(Static188.anInt3028))) {
				local13 = 9;
				arg0 = arg0.substring(Static397.aClass151_202.method3122(Static188.anInt3028).length());
			} else if (local11.startsWith(Static353.aClass151_182.method3122(Static188.anInt3028))) {
				local13 = 10;
				arg0 = arg0.substring(Static353.aClass151_182.method3122(Static188.anInt3028).length());
			} else if (local11.startsWith(Static203.aClass151_106.method3122(Static188.anInt3028))) {
				local13 = 11;
				arg0 = arg0.substring(Static203.aClass151_106.method3122(Static188.anInt3028).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static280.aClass151_144.method3122(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static280.aClass151_144.method3122(0).length());
		} else if (local11.startsWith(Static178.aClass151_98.method3122(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static178.aClass151_98.method3122(0).length());
		} else if (local11.startsWith(Static348.aClass151_180.method3122(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static348.aClass151_180.method3122(0).length());
		} else if (local11.startsWith(Static205.aClass151_108.method3122(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static205.aClass151_108.method3122(0).length());
		} else if (local11.startsWith(Static115.aClass151_66.method3122(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static115.aClass151_66.method3122(0).length());
		} else if (Static188.anInt3028 != 0) {
			if (local11.startsWith(Static280.aClass151_144.method3122(Static188.anInt3028))) {
				local451 = 1;
				arg0 = arg0.substring(Static280.aClass151_144.method3122(Static188.anInt3028).length());
			} else if (local11.startsWith(Static178.aClass151_98.method3122(Static188.anInt3028))) {
				local451 = 2;
				arg0 = arg0.substring(Static178.aClass151_98.method3122(Static188.anInt3028).length());
			} else if (local11.startsWith(Static348.aClass151_180.method3122(Static188.anInt3028))) {
				local451 = 3;
				arg0 = arg0.substring(Static348.aClass151_180.method3122(Static188.anInt3028).length());
			} else if (local11.startsWith(Static205.aClass151_108.method3122(Static188.anInt3028))) {
				local451 = 4;
				arg0 = arg0.substring(Static205.aClass151_108.method3122(Static188.anInt3028).length());
			} else if (local11.startsWith(Static115.aClass151_66.method3122(Static188.anInt3028))) {
				local451 = 5;
				arg0 = arg0.substring(Static115.aClass151_66.method3122(Static188.anInt3028).length());
			}
		}
		Static5.method94(Static454.aClass137_266);
		Static75.aClass1_Sub11_Sub1_1.method4445(0);
		@Pc(646) int local646 = Static75.aClass1_Sub11_Sub1_1.anInt5766;
		if (arg1 == 5021) {
			Static75.aClass1_Sub11_Sub1_1.method4445(1);
		} else if (arg1 == 5022) {
			Static75.aClass1_Sub11_Sub1_1.method4445(2);
		} else {
			Static75.aClass1_Sub11_Sub1_1.method4445(0);
		}
		Static75.aClass1_Sub11_Sub1_1.method4445(local13);
		Static75.aClass1_Sub11_Sub1_1.method4445(local451);
		Static425.method5306(Static75.aClass1_Sub11_Sub1_1, arg0);
		Static75.aClass1_Sub11_Sub1_1.method4478(Static75.aClass1_Sub11_Sub1_1.anInt5766 - local646);
	}
}
