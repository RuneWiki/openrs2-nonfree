import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "Lclient!rr;")
	public static final Class220 aClass220_14 = new Class220(12, 0, 1, 0);

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "Lclient!fr;")
	public static final Class91 aClass91_103 = new Class91(8);

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "I")
	public static int anInt7957 = -1;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!ch;)I")
	public static int method6182(@OriginalArg(1) Class30_Sub1_Sub1_Sub2 arg0) {
		@Pc(14) int local14 = arg0.anInt1338;
		@Pc(18) Class212 local18 = arg0.method948();
		if (arg0.aBoolean81) {
			local14 = arg0.anInt1333;
		} else if (arg0.anInt1255 == local18.anInt6253 || arg0.anInt1255 == local18.anInt6267 || arg0.anInt1255 == local18.anInt6291 || arg0.anInt1255 == local18.anInt6278) {
			local14 = arg0.anInt1346;
		} else if (arg0.anInt1255 == local18.anInt6275 || arg0.anInt1255 == local18.anInt6259 || local18.anInt6280 == arg0.anInt1255 || local18.anInt6245 == arg0.anInt1255) {
			local14 = arg0.anInt1354;
		}
		return local14;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
	public static void method6183() {
		Static389.method5419(Static12.aClass34_Sub1_1.aBoolean443);
		Static253.aClass1_Sub19_Sub3_3 = new Class1_Sub19_Sub3();
		Static253.aClass1_Sub19_Sub3_3.method5322();
		Static193.aClass31_2 = Static176.method2982(0, Static150.aClass183_3, 22050, Static443.aCanvas33);
		Static193.aClass31_2.method2004(Static253.aClass1_Sub19_Sub3_3);
		Static221.method3427(Static112.aClass211_31, Static68.aClass211_20, Static253.aClass1_Sub19_Sub3_3, Static125.aClass211_33);
		Static99.aClass31_1 = Static176.method2982(1, Static150.aClass183_3, 2048, Static443.aCanvas33);
		Static12.aClass1_Sub19_Sub2_1 = new Class1_Sub19_Sub2();
		Static99.aClass31_1.method2004(Static12.aClass1_Sub19_Sub2_1);
		Static441.aClass233_1 = new Class233(22050, Static84.anInt2035);
		Static85.anInt2043 = Static362.aClass211_75.method4759("scape main");
	}
}
