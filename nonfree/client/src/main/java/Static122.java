import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZZ)V")
	public static void method2335(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static328.anInt6167 != -1) {
				Static62.method1530(Static328.anInt6167);
			}
			for (@Pc(18) Class1_Sub35 local18 = (Class1_Sub35) Static362.aClass230_45.method6137(); local18 != null; local18 = (Class1_Sub35) Static362.aClass230_45.method6140()) {
				if (!local18.method8241()) {
					local18 = (Class1_Sub35) Static362.aClass230_45.method6137();
					if (local18 == null) {
						break;
					}
				}
				Static537.method8142(local18, false, true);
			}
			Static328.anInt6167 = -1;
			Static362.aClass230_45 = new Class230(8);
			Static51.method1405();
			Static328.anInt6167 = Static39.anInt1109;
			Static220.method4021(false);
			Static402.method6385();
			Static173.method3206(Static328.anInt6167);
		}
		Static125.aBoolean217 = false;
		Static150.aString62 = "";
		Static309.aString140 = "";
		Static160.method7801();
		Static245.anInt4711 = -1;
		Static54.method1452(Static449.anInt7879);
		Static107.aClass20_Sub1_Sub1_Sub1_1 = new Class20_Sub1_Sub1_Sub1();
		Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray780[0] = Static237.anInt4563 / 2;
		Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949 = Static373.anInt6694 * 128 / 2;
		Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954 = Static237.anInt4563 * 128 / 2;
		Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray781[0] = Static373.anInt6694 / 2;
		Static46.anInt1256 = 0;
		Static321.anInt6064 = 0;
		if (Static170.anInt3418 == 2) {
			Static321.anInt6064 = Static241.anInt4647 << 7;
			Static46.anInt1256 = Static460.anInt7959 << 7;
		} else {
			Static180.method3529();
		}
		Static22.method601();
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!dn;IZ)Lclient!tc;")
	public static Class1_Sub47 method2336(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method1890(arg1);
		return local13 == null ? null : new Class1_Sub47(local13);
	}
}
