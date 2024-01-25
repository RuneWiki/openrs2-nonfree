import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!on", name = "j", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_107 = new Class85("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!on", name = "k", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!on", name = "l", descriptor = "Z")
	public static boolean aBoolean381 = false;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!of;B)V")
	public static void method4165(@OriginalArg(0) Class4_Sub5_Sub2_Sub1 arg0) {
		@Pc(15) Class5_Sub7 local15 = (Class5_Sub7) Static199.aClass190_22.method5466((long) arg0.anInt5386);
		if (local15 == null) {
			Static114.method1985(null, 0, arg0.anIntArray522[0], arg0, null, arg0.anIntArray523[0], Static239.anInt4811);
		} else {
			local15.method409();
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZLclient!of;)V")
	public static void method4167(@OriginalArg(1) Class4_Sub5_Sub2_Sub1 arg0) {
		@Pc(15) Class5_Sub7 local15 = (Class5_Sub7) Static199.aClass190_22.method5466((long) arg0.anInt5386);
		if (local15 == null) {
			return;
		}
		if (local15.aClass5_Sub16_Sub3_1 != null) {
			Static114.aClass5_Sub16_Sub4_1.method5798(local15.aClass5_Sub16_Sub3_1);
			local15.aClass5_Sub16_Sub3_1 = null;
		}
		local15.method6005();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!vi;Lclient!vi;Z)V")
	public static void method4169(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1) {
		if (arg1.aClass5_252 != null) {
			arg1.method6005();
		}
		arg1.aClass5_251 = arg0;
		arg1.aClass5_252 = arg0.aClass5_252;
		arg1.aClass5_252.aClass5_251 = arg1;
		arg1.aClass5_251.aClass5_252 = arg1;
	}
}
