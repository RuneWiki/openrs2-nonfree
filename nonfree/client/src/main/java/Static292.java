import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!wca;")
	public static Class310 aClass310_13;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
	public static int anInt5375;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	public static int anInt5366 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ps;I)Ljava/lang/String;")
	public static String method4616(@OriginalArg(0) Class2_Sub29 arg0) {
		return Static348.method5484(arg0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)V")
	public static void method4619(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static387.anInt7341 != -1) {
				Static277.method4362(Static387.anInt7341);
			}
			for (@Pc(19) Class2_Sub9 local19 = (Class2_Sub9) Static110.aClass127_21.method3203(); local19 != null; local19 = (Class2_Sub9) Static110.aClass127_21.method3212()) {
				if (!local19.method7799()) {
					local19 = (Class2_Sub9) Static110.aClass127_21.method3203();
					if (local19 == null) {
						break;
					}
				}
				Static368.method5870(true, local19, false);
			}
			Static387.anInt7341 = -1;
			Static110.aClass127_21 = new Class127(8);
			Static266.method4290();
			Static387.anInt7341 = Static110.anInt2138;
			Static191.method6947(false);
			Static190.method3102();
			Static258.method4039(Static387.anInt7341);
		}
		Static243.aBoolean332 = false;
		Static454.aString170 = "";
		Static43.aString22 = "";
		Static180.method2997();
		Static94.anInt1853 = -1;
		Static532.method7661(Static161.anInt2925);
		Static266.aClass1_Sub1_Sub2_Sub1_1 = new Class1_Sub1_Sub2_Sub1();
		Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659 = Static511.anInt8889 * 128 / 2;
		Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660 = Static363.anInt1158 * 128 / 2;
		Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray450[0] = Static363.anInt1158 / 2;
		Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray449[0] = Static511.anInt8889 / 2;
		Static353.anInt5258 = 0;
		Static187.anInt3432 = 0;
		if (Static427.anInt7875 == 2) {
			Static187.anInt3432 = Static212.anInt3814 << 7;
			Static353.anInt5258 = Static329.anInt3845 << 7;
		} else {
			Static456.method6973();
		}
		Static330.method3998();
	}
}
