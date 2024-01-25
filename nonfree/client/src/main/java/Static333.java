import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "Lclient!eb;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!vk", name = "r", descriptor = "[Lclient!hm;")
	public static Class8_Sub4_Sub1_Sub1[] aClass8_Sub4_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!vk", name = "u", descriptor = "[S")
	public static short[] aShortArray111;

	@OriginalMember(owner = "client!vk", name = "o", descriptor = "Z")
	public static boolean aBoolean435 = true;

	@OriginalMember(owner = "client!vk", name = "q", descriptor = "[I")
	public static final int[] anIntArray540 = new int[6];

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V")
	public static void method5471() {
		Static91.method1448();
		Static317.method4693();
		Static267.method4543();
		Static42.method728();
		Static85.method1380();
		Static63.method1014();
		Static204.method3547();
		Static110.method1881();
		Static297.method5055();
		Static267.method4545();
		Static314.method5232();
		Static186.method2540();
		Static73.method1120();
		Static116.method2030();
		Static220.method3863();
		Static91.method1449();
		Static15.method388();
		Static237.method4029();
		Static316.method5247();
		Static85.method1377();
		Static56.method934();
		Static163.method2596();
		if (Static310.anInt6141 != 0) {
			for (@Pc(62) int local62 = 0; local62 < Static94.aByteArrayArray10.length; local62++) {
				Static94.aByteArrayArray10[local62] = null;
			}
			Static260.anInt5194 = 0;
		}
		Static8.method153();
		Static42.method734();
		Static95.method1577();
		Static26.method561();
		Static222.method3876();
		Static139.aClass198_22.method5236();
		Static212.aClass122_2.method4764();
		Static58.aClass188_1.method5058();
		Static221.method3873();
		Static192.aClass100_84.method2295();
		Static44.aClass100_17.method2295();
		Static296.aClass100_115.method2295();
		Static178.aClass100_75.method2295();
		Static3.aClass100_1.method2295();
		Static50.aClass100_20.method2295();
		Static244.aClass100_98.method2295();
		Static100.aClass100_38.method2295();
		Static317.aClass100_112.method2295();
		Static118.aClass100_51.method2295();
		Static185.aClass100_82.method2295();
		Static293.aClass100_121.method2295();
		Static69.aClass100_25.method2295();
		Static86.aClass100_86.method2295();
		Static90.aClass100_34.method2295();
		Static102.aClass100_39.method2295();
		Static227.aClass100_95.method2295();
		Static277.aClass100_111.method2295();
		Static175.aClass100_74.method2295();
		Static107.aClass100_45.method2295();
		Static147.aClass100_63.method2295();
		Static38.aClass100_14.method2295();
		Static72.aClass100_26.method2295();
		Static124.aClass100_58.method2295();
		Static185.aClass100_83.method2295();
		Static179.aClass100_80.method2295();
		Static179.aClass100_81.method2295();
		Static102.aClass100_40.method2295();
		Static125.aClass100_60.method2295();
		Static258.aClass198_48.method5236();
		Static2.aClass198_1.method5236();
		Static99.aClass198_19.method5236();
		Static115.aClass198_21.method5236();
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(DB)V")
	public static void method5472(@OriginalArg(0) double arg0) {
		if (arg0 == Static66.aDouble10) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(31) int local31 = (int) (Math.pow((double) local19 / 255.0D, arg0) * 255.0D);
			Static140.anIntArray193[local19] = local31 <= 255 ? local31 : 255;
		}
		Static66.aDouble10 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BZ)V")
	public static void method5473(@OriginalArg(1) boolean arg0) {
		Static291.aClass3_Sub4_Sub2_3.method3682(82);
		for (@Pc(18) Class3_Sub32 local18 = (Class3_Sub32) Static188.aClass24_21.method595(); local18 != null; local18 = (Class3_Sub32) Static188.aClass24_21.method602()) {
			if (!local18.method5718()) {
				local18 = (Class3_Sub32) Static188.aClass24_21.method595();
				if (local18 == null) {
					break;
				}
			}
			if (local18.anInt4349 == 0) {
				Static42.method732(local18, true, arg0);
			}
		}
		if (Static346.aClass181_57 != null) {
			Static316.method5250(Static346.aClass181_57);
			Static346.aClass181_57 = null;
		}
	}
}
