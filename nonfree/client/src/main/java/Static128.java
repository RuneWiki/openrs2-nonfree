import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Lclient!ea;")
	public static Class20 aClass20_60;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString4;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!ec;")
	public static Class22 aClass22_935 = Static60.method1113(")4l");

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Lclient!ec;")
	private static Class22 aClass22_936 = Static60.method1113("b12_full");

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "Lclient!ec;")
	private static Class22 aClass22_937 = Static60.method1113("Loading textures )2 ");

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "Lclient!ec;")
	private static Class22 aClass22_944 = Static60.method1113("cyan:");

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!ec;")
	public static Class22 aClass22_938 = aClass22_944;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "Lclient!ec;")
	public static Class22 aClass22_939 = aClass22_937;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "Lclient!ec;")
	public static Class22 aClass22_940 = Static60.method1113(" <col=ffff00>");

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
	public static volatile int anInt3045 = 0;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "Z")
	public static boolean aBoolean274 = false;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "Lclient!ec;")
	public static Class22 aClass22_941 = Static60.method1113(" weitere Optionen");

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "Lclient!ec;")
	public static Class22 aClass22_942 = aClass22_944;

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "Lclient!ec;")
	public static Class22 aClass22_943 = Static60.method1113("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
	public static int anInt3046 = 99;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
	public static void method1973() {
		aClass22_936 = null;
		aBigInteger2 = null;
		aClass22_941 = null;
		aClass20_60 = null;
		aClass22_943 = null;
		aClass22_937 = null;
		aClass22_940 = null;
		aString4 = null;
		aClass22_938 = null;
		aClass22_944 = null;
		aClass22_942 = null;
		aClass22_939 = null;
		aClass22_935 = null;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
	public static void method1976() {
		@Pc(20) int local20;
		if (Static11.anInt2983 == 0) {
			Static134.aClass77_1 = new Class77(4, 104, 104, Static57.anIntArrayArrayArray4);
			for (local20 = 0; local20 < 4; local20++) {
				Static87.aClass60Array1[local20] = new Class60(104, 104);
			}
			Static119.aClass4_Sub1_Sub2_Sub2_7 = new Class4_Sub1_Sub2_Sub2(512, 512);
			Static11.anInt2983 = 20;
			Static61.aClass22_473 = Static7.aClass22_60;
			Static7.anInt160 = 5;
			return;
		}
		@Pc(57) int local57;
		@Pc(67) int local67;
		@Pc(73) int local73;
		@Pc(77) int local77;
		if (Static11.anInt2983 == 20) {
			@Pc(55) int[] local55 = new int[9];
			for (local57 = 0; local57 < 9; local57++) {
				local67 = local57 * 32 + 15 + 128;
				local73 = local67 * 3 + 600;
				local77 = Class4_Sub1_Sub2_Sub1.anIntArray9[local67];
				local55[local57] = local77 * local73 >> 16;
			}
			Static127.method1931(local55);
			Static7.anInt160 = 10;
			Static61.aClass22_473 = Static69.aClass22_510;
			Static11.anInt2983 = 30;
		} else if (Static11.anInt2983 == 30) {
			Static76.aClass20_Sub1_48 = Static110.method1771(0, true, false, true);
			Static33.aClass20_Sub1_22 = Static110.method1771(1, true, false, true);
			Static53.aClass20_Sub1_39 = Static110.method1771(2, true, true, false);
			Static55.aClass20_Sub1_29 = Static110.method1771(3, true, false, true);
			Static1.aClass20_Sub1_1 = Static110.method1771(4, true, false, true);
			Static112.aClass20_Sub1_70 = Static110.method1771(5, true, true, true);
			Static103.aClass20_Sub1_66 = Static110.method1771(6, false, true, true);
			Static124.aClass20_Sub1_77 = Static110.method1771(7, true, false, true);
			Static26.aClass20_Sub1_25 = Static110.method1771(8, true, false, true);
			Static68.aClass20_Sub1_14 = Static110.method1771(9, true, false, true);
			Static59.aClass20_Sub1_43 = Static110.method1771(10, true, false, true);
			Static80.aClass20_Sub1_55 = Static110.method1771(11, true, false, true);
			Static80.aClass20_Sub1_54 = Static110.method1771(12, true, false, true);
			Static132.aClass20_Sub1_82 = Static110.method1771(13, true, true, false);
			Static85.aClass20_Sub1_57 = Static110.method1771(14, false, false, true);
			Static123.aClass20_Sub1_81 = Static110.method1771(15, true, false, true);
			Static7.anInt160 = 20;
			Static61.aClass22_473 = Static57.aClass22_441;
			Static11.anInt2983 = 40;
		} else if (Static11.anInt2983 == 40) {
			local20 = Static76.aClass20_Sub1_48.method616() * 4 / 100;
			local20 += Static33.aClass20_Sub1_22.method616() * 4 / 100;
			local20 += Static53.aClass20_Sub1_39.method616() * 2 / 100;
			local20 += Static55.aClass20_Sub1_29.method616() * 2 / 100;
			local20 += Static1.aClass20_Sub1_1.method616() * 6 / 100;
			local20 += Static112.aClass20_Sub1_70.method616() * 4 / 100;
			local20 += Static103.aClass20_Sub1_66.method616() * 2 / 100;
			local20 += Static124.aClass20_Sub1_77.method616() * 60 / 100;
			local20 += Static26.aClass20_Sub1_25.method616() * 2 / 100;
			local20 += Static68.aClass20_Sub1_14.method616() * 2 / 100;
			local20 += Static59.aClass20_Sub1_43.method616() * 2 / 100;
			local20 += Static80.aClass20_Sub1_55.method616() * 2 / 100;
			local20 += Static80.aClass20_Sub1_54.method616() * 2 / 100;
			local20 += Static132.aClass20_Sub1_82.method616() * 2 / 100;
			local20 += Static85.aClass20_Sub1_57.method616() * 2 / 100;
			local20 += Static123.aClass20_Sub1_81.method616() * 2 / 100;
			if (local20 == 100) {
				Static61.aClass22_473 = Static87.aClass22_654;
				Static11.anInt2983 = 45;
				Static7.anInt160 = 30;
			} else {
				if (local20 != 0) {
					Static61.aClass22_473 = Static44.method856(new Class22[] { Static46.aClass22_319, Static134.method2042(local20), Static106.aClass22_788 });
				}
				Static7.anInt160 = 30;
			}
		} else if (Static11.anInt2983 == 45) {
			Static11.method1909(!Static130.aBoolean279);
			@Pc(460) Class4_Sub4_Sub1 local460 = new Class4_Sub4_Sub1();
			local460.method203();
			Static31.aClass15_2 = Static53.method1007(Static130.aClass17_4, 0, 22050, Static89.aCanvas1);
			Static31.aClass15_2.method1191(local460);
			Static41.method745(Static1.aClass20_Sub1_1, Static85.aClass20_Sub1_57, local460, Static123.aClass20_Sub1_81);
			Static25.aClass15_1 = Static53.method1007(Static130.aClass17_4, 1, 2048, Static89.aCanvas1);
			Static32.aClass4_Sub4_Sub4_1 = new Class4_Sub4_Sub4();
			Static25.aClass15_1.method1191(Static32.aClass4_Sub4_Sub4_1);
			Static108.aClass23_1 = new Class23(22050, Static116.anInt2873);
			Static11.anInt2983 = 50;
			Static7.anInt160 = 35;
			Static61.aClass22_473 = Static49.aClass22_330;
		} else if (Static11.anInt2983 == 50) {
			local20 = 0;
			if (Static18.aClass4_Sub1_Sub2_Sub4_Sub1_1 == null) {
				Static18.aClass4_Sub1_Sub2_Sub4_Sub1_1 = Static93.method1621(Static26.aClass20_Sub1_25, Static132.aClass20_Sub1_82, Static64.aClass22_485, Static43.aClass22_292);
			} else {
				local20++;
			}
			if (Static101.aClass4_Sub1_Sub2_Sub4_Sub1_4 == null) {
				Static101.aClass4_Sub1_Sub2_Sub4_Sub1_4 = Static93.method1621(Static26.aClass20_Sub1_25, Static132.aClass20_Sub1_82, Static64.aClass22_485, Static53.aClass22_376);
			} else {
				local20++;
			}
			if (Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2 == null) {
				Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2 = Static93.method1621(Static26.aClass20_Sub1_25, Static132.aClass20_Sub1_82, Static64.aClass22_485, aClass22_936);
			} else {
				local20++;
			}
			if (local20 < 3) {
				Static61.aClass22_473 = Static44.method856(new Class22[] { Static60.aClass22_469, Static134.method2042(local20 * 100 / 3), Static106.aClass22_788 });
				Static7.anInt160 = 40;
			} else {
				Static61.aClass22_473 = Static25.aClass22_171;
				Static7.anInt160 = 40;
				Static11.anInt2983 = 60;
			}
		} else if (Static11.anInt2983 == 60) {
			local20 = Static119.method1860(Static26.aClass20_Sub1_25, Static59.aClass20_Sub1_43);
			local57 = Static93.method1625();
			if (local57 > local20) {
				Static61.aClass22_473 = Static44.method856(new Class22[] { Static71.aClass22_517, Static134.method2042(local20 * 100 / local57), Static106.aClass22_788 });
				Static7.anInt160 = 50;
			} else {
				Static7.anInt160 = 50;
				Static61.aClass22_473 = Static44.aClass22_303;
				Static46.method888(5);
				Static11.anInt2983 = 70;
			}
		} else if (Static11.anInt2983 == 70) {
			if (Static53.aClass20_Sub1_39.method599()) {
				Static74.method1211(Static53.aClass20_Sub1_39);
				Static44.method863(Static53.aClass20_Sub1_39);
				Static116.method1840(Static124.aClass20_Sub1_77, Static53.aClass20_Sub1_39);
				Static61.method1119(Static124.aClass20_Sub1_77, Static130.aBoolean279, Static53.aClass20_Sub1_39);
				Static114.method1821(Static53.aClass20_Sub1_39, Static124.aClass20_Sub1_77);
				Static15.method282(Static124.aClass20_Sub1_77, Static53.aClass20_Sub1_39, Static123.aBoolean277, Static18.aClass4_Sub1_Sub2_Sub4_Sub1_1);
				Static64.method1142(Static33.aClass20_Sub1_22, Static53.aClass20_Sub1_39, Static76.aClass20_Sub1_48);
				Static3.method11(Static124.aClass20_Sub1_77, Static53.aClass20_Sub1_39);
				Static22.method1815(Static53.aClass20_Sub1_39);
				Static116.method1841(Static53.aClass20_Sub1_39);
				Static71.method1179(Static26.aClass20_Sub1_25, Static124.aClass20_Sub1_77, Static132.aClass20_Sub1_82, Static55.aClass20_Sub1_29);
				Static8.method1571(Static53.aClass20_Sub1_39);
				Static80.method1446(Static53.aClass20_Sub1_39);
				Static61.aClass22_473 = Static37.aClass22_258;
				Static7.anInt160 = 60;
				Static11.anInt2983 = 80;
			} else {
				Static61.aClass22_473 = Static44.method856(new Class22[] { Static55.aClass22_283, Static134.method2042(Static53.aClass20_Sub1_39.method621()), Static106.aClass22_788 });
				Static7.anInt160 = 60;
			}
		} else if (Static11.anInt2983 == 80) {
			local20 = 0;
			if (Static3.aClass4_Sub1_Sub2_Sub2_1 == null) {
				Static3.aClass4_Sub1_Sub2_Sub2_1 = Static2.method8(Static26.aClass20_Sub1_25, Static64.aClass22_485, Static25.aClass22_174);
			} else {
				local20++;
			}
			if (Static42.aClass4_Sub1_Sub2_Sub2_4 == null) {
				Static42.aClass4_Sub1_Sub2_Sub2_4 = Static2.method8(Static26.aClass20_Sub1_25, Static64.aClass22_485, Static3.aClass22_9);
			} else {
				local20++;
			}
			if (Static51.aClass4_Sub1_Sub2_Sub3Array4 == null) {
				Static51.aClass4_Sub1_Sub2_Sub3Array4 = Static48.method906(Static64.aClass22_485, Static19.aClass22_153, Static26.aClass20_Sub1_25);
			} else {
				local20++;
			}
			if (Static92.aClass4_Sub1_Sub2_Sub2Array14 == null) {
				Static92.aClass4_Sub1_Sub2_Sub2Array14 = Static51.method987(Static112.aClass22_863, Static26.aClass20_Sub1_25, Static64.aClass22_485);
			} else {
				local20++;
			}
			if (Static26.aClass4_Sub1_Sub2_Sub2Array9 == null) {
				Static26.aClass4_Sub1_Sub2_Sub2Array9 = Static51.method987(Static27.aClass22_180, Static26.aClass20_Sub1_25, Static64.aClass22_485);
			} else {
				local20++;
			}
			if (Static26.aClass4_Sub1_Sub2_Sub2Array8 == null) {
				Static26.aClass4_Sub1_Sub2_Sub2Array8 = Static51.method987(Static82.aClass22_629, Static26.aClass20_Sub1_25, Static64.aClass22_485);
			} else {
				local20++;
			}
			if (Static8.aClass4_Sub1_Sub2_Sub2Array13 == null) {
				Static8.aClass4_Sub1_Sub2_Sub2Array13 = Static51.method987(Static4.aClass22_23, Static26.aClass20_Sub1_25, Static64.aClass22_485);
			} else {
				local20++;
			}
			if (Static109.aClass4_Sub1_Sub2_Sub2Array4 == null) {
				Static109.aClass4_Sub1_Sub2_Sub2Array4 = Static51.method987(Static4.aClass22_26, Static26.aClass20_Sub1_25, Static64.aClass22_485);
			} else {
				local20++;
			}
			if (Static79.aClass4_Sub1_Sub2_Sub2Array12 == null) {
				Static79.aClass4_Sub1_Sub2_Sub2Array12 = Static51.method987(Static43.aClass22_293, Static26.aClass20_Sub1_25, Static64.aClass22_485);
			} else {
				local20++;
			}
			if (Static1.aClass4_Sub1_Sub2_Sub2Array1 == null) {
				Static1.aClass4_Sub1_Sub2_Sub2Array1 = Static51.method987(Static44.aClass22_300, Static26.aClass20_Sub1_25, Static64.aClass22_485);
			} else {
				local20++;
			}
			if (Static24.aClass4_Sub1_Sub2_Sub2Array5 == null) {
				Static24.aClass4_Sub1_Sub2_Sub2Array5 = Static51.method987(Static121.aClass22_911, Static26.aClass20_Sub1_25, Static64.aClass22_485);
			} else {
				local20++;
			}
			if (Static80.aClass4_Sub1_Sub2_Sub3Array8 == null) {
				Static80.aClass4_Sub1_Sub2_Sub3Array8 = Static48.method906(Static64.aClass22_485, Static120.aClass22_907, Static26.aClass20_Sub1_25);
			} else {
				local20++;
			}
			if (Static110.aClass4_Sub1_Sub2_Sub3Array9 == null) {
				Static110.aClass4_Sub1_Sub2_Sub3Array9 = Static48.method906(Static64.aClass22_485, Static34.aClass22_239, Static26.aClass20_Sub1_25);
			} else {
				local20++;
			}
			if (Static16.aClass4_Sub1_Sub2_Sub3_2 == null) {
				Static16.aClass4_Sub1_Sub2_Sub3_2 = Static114.method1820(Static64.aClass22_485, Static26.aClass20_Sub1_25, Static115.aClass22_885);
			} else {
				local20++;
			}
			if (local20 < 14) {
				Static61.aClass22_473 = Static44.method856(new Class22[] { Static52.aClass22_371, Static134.method2042(local20 * 100 / 14), Static106.aClass22_788 });
				Static7.anInt160 = 70;
			} else {
				Static81.aClass4_Sub1_Sub2_Sub3Array7 = Static110.aClass4_Sub1_Sub2_Sub3Array9;
				local57 = (int) (Math.random() * 21.0D) - 10;
				Static42.aClass4_Sub1_Sub2_Sub2_4.method795();
				local67 = (int) (Math.random() * 21.0D) - 10;
				local73 = (int) (Math.random() * 21.0D) - 10;
				local77 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(973) int local973 = 0; local973 < Static92.aClass4_Sub1_Sub2_Sub2Array14.length; local973++) {
					Static92.aClass4_Sub1_Sub2_Sub2Array14[local973].method810(local77 + local57, local77 + local67, local73 + local77);
				}
				Static51.aClass4_Sub1_Sub2_Sub3Array4[0].method855(local77 + local57, local77 + local67, local73 + local77);
				Static89.method1567();
				Static61.aClass22_473 = Static97.aClass22_743;
				Static7.anInt160 = 70;
				Static11.anInt2983 = 90;
			}
		} else if (Static11.anInt2983 == 90) {
			if (Static68.aClass20_Sub1_14.method599()) {
				@Pc(1066) Class75 local1066 = new Class75(Static68.aClass20_Sub1_14, Static26.aClass20_Sub1_25, 20, 0.8D, Static130.aBoolean279 ? 64 : 128);
				Static6.method125(local1066);
				Static6.method113(0.8D);
				Static11.anInt2983 = 110;
				Static61.aClass22_473 = Static107.aClass22_797;
				Static7.anInt160 = 90;
			} else {
				Static61.aClass22_473 = Static44.method856(new Class22[] { aClass22_939, Static134.method2042(Static68.aClass20_Sub1_14.method621()), Static106.aClass22_788 });
				Static7.anInt160 = 90;
			}
		} else if (Static11.anInt2983 == 110) {
			Static115.aClass70_1 = new Class70();
			Static130.aClass17_4.method383(10, Static115.aClass70_1);
			Static7.anInt160 = 94;
			Static11.anInt2983 = 120;
			Static61.aClass22_473 = Static90.aClass22_695;
		} else if (Static11.anInt2983 == 120) {
			if (Static59.aClass20_Sub1_43.method601(Static105.aClass22_781, Static64.aClass22_485)) {
				@Pc(1135) Class10 local1135 = new Class10(Static59.aClass20_Sub1_43.method610(Static105.aClass22_781, Static64.aClass22_485));
				Static107.method1755(local1135);
				Static61.aClass22_473 = Static71.aClass22_518;
				Static7.anInt160 = 96;
				Static11.anInt2983 = 130;
			} else {
				Static61.aClass22_473 = Static44.method856(new Class22[] { Static132.aClass22_965, Static33.aClass22_232 });
				Static7.anInt160 = 96;
			}
		} else if (Static11.anInt2983 == 130) {
			if (!Static55.aClass20_Sub1_29.method599()) {
				Static61.aClass22_473 = Static44.method856(new Class22[] { Static8.aClass22_687, Static134.method2042(Static55.aClass20_Sub1_29.method621() * 4 / 5), Static106.aClass22_788 });
				Static7.anInt160 = 100;
			} else if (!Static80.aClass20_Sub1_54.method599()) {
				Static61.aClass22_473 = Static44.method856(new Class22[] { Static8.aClass22_687, Static134.method2042(Static80.aClass20_Sub1_54.method621() / 6 + 80), Static106.aClass22_788 });
				Static7.anInt160 = 100;
			} else if (Static132.aClass20_Sub1_82.method599()) {
				Static11.anInt2983 = 140;
				Static61.aClass22_473 = Static71.aClass22_519;
				Static7.anInt160 = 100;
			} else {
				Static61.aClass22_473 = Static44.method856(new Class22[] { Static8.aClass22_687, Static134.method2042(Static132.aClass20_Sub1_82.method621() / 20 + 96), Static106.aClass22_788 });
				Static7.anInt160 = 100;
			}
		} else if (Static11.anInt2983 == 140) {
			Static46.method888(10);
		}
	}
}
