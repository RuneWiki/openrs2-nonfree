import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "[Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3[] aClass3_Sub2_Sub3_Sub3Array9;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Lclient!hb;")
	public static Class3_Sub2_Sub8 aClass3_Sub2_Sub8_1;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
	public static int anInt2435 = 0;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!kb;")
	public static Class46 aClass46_807 = Static65.method1172("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Lclient!kb;")
	public static Class46 aClass46_808 = Static65.method1172("Welt");

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "Lclient!kb;")
	public static Class46 aClass46_809 = Static65.method1172("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!kb;")
	public static Class46 aClass46_810 = Static65.method1172("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "Lclient!kb;")
	public static Class46 aClass46_811 = Static65.method1172("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZLclient!jg;ILclient!jg;)Lclient!ef;")
	public static Class3_Sub2_Sub3_Sub1_Sub1 method1653(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class44 arg3) {
		return Static122.method2089(arg0, arg1, arg2) ? Static179.method2876(arg3.method1624(arg2, arg0)) : null;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
	public static void method1654() {
		aClass46_807 = null;
		aClass46_809 = null;
		aClass46_808 = null;
		aClass46_811 = null;
		aClass46_810 = null;
		aClass3_Sub2_Sub3_Sub3Array9 = null;
		aClass3_Sub2_Sub8_1 = null;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public static void method1655() {
		@Pc(3) Class85 local3 = Static178.aClass85_1;
		synchronized (Static178.aClass85_1) {
			Static96.anInt2352 = Static161.anInt3576;
			@Pc(11) int local11;
			if (Static143.anInt3282 < 0) {
				for (local11 = 0; local11 < 112; local11++) {
					Static97.aBooleanArray9[local11] = false;
				}
				Static143.anInt3282 = Static18.anInt425;
			} else {
				while (Static18.anInt425 != Static143.anInt3282) {
					local11 = Static148.anIntArray406[Static18.anInt425];
					Static18.anInt425 = Static18.anInt425 + 1 & 0x7F;
					if (local11 < 0) {
						Static97.aBooleanArray9[~local11] = false;
					} else {
						Static97.aBooleanArray9[local11] = true;
					}
				}
			}
			Static161.anInt3576 = Static180.anInt3972;
		}
	}
}
