import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static341 {

	@OriginalMember(owner = "client!od", name = "e", descriptor = "Lclient!js;")
	public static final Class156 aClass156_15 = new Class156(14, 0, 4, 1);

	@OriginalMember(owner = "client!od", name = "f", descriptor = "I")
	public static int anInt6297 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	public static void method5720() {
		Static237.aClass143_2.method3938();
		Static541.aClass264_5.method6828();
		Static10.aClass179_1.method4889();
		Static398.aClass18_4.method603();
		Static358.aClass95_1.method2358();
		Static181.aClass316_1.method8099();
		Static35.aClass152_1.method4040();
		Static530.aClass195_2.method5437();
		Static363.aClass118_1.method2939();
		Static292.aClass255_1.method6638();
		Static398.aClass167_1.method4602();
		Static152.aClass160_1.method4293();
		Static193.aClass32_2.method1127();
		Static337.aClass48_1.method1523();
		Static440.aClass266_1.method6928();
		Static402.aClass2_1.method180();
		Static435.aClass280_1.method7063();
		Static478.aClass309_1.method7921();
		Static440.aClass273_1.method6994();
		Static99.aClass141_1.method3829();
		Static250.method4432();
		Static152.method2809();
		Static2.method176();
		Static333.method5658();
		Static163.aClass277_25.method7026();
		Static340.aClass277_48.method7026();
		Static402.aClass277_54.method7026();
		Static292.aClass277_41.method7026();
		Static173.aClass277_29.method7026();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5721(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
