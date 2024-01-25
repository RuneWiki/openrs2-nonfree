import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "[I")
	public static int[] anIntArray635;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
	public static int anInt8359;

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "Lclient!om;")
	public static Class246 aClass246_249;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
	public static int anInt8357 = -1;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZIIB)Lclient!om;")
	public static Class246 method7008(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class97 local5 = null;
		if (Static565.aClass204_5 != null) {
			local5 = new Class97(arg1, Static565.aClass204_5, Static51.aClass204Array1[arg1], 1000000);
		}
		Static478.aClass303_Sub1Array2[arg1] = Static259.aClass296_6.method6471(arg1, local5, Static355.aClass97_1);
		Static478.aClass303_Sub1Array2[arg1].method6960();
		return new Class246(Static478.aClass303_Sub1Array2[arg1], arg0, 1);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)Z")
	public static boolean method7010(@OriginalArg(1) boolean arg0) {
		@Pc(6) boolean local6 = Static4.aClass43_1.method7216();
		if (local6 == arg0) {
			return true;
		}
		if (!arg0) {
			Static4.aClass43_1.method7204();
		} else if (!Static4.aClass43_1.method7180()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static278.aClass3_Sub13_Sub1_1.aBoolean408 = arg0;
			Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
			return true;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZIILclient!om;)V")
	public static void method7011(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(6) Class246 arg2) {
		Static206.anInt4170 = 2;
		Static262.anInt4939 = 0;
		Static478.anInt7778 = arg1;
		Static375.anInt6351 = 1;
		Static10.aClass246_11 = arg2;
		Static487.anInt7851 = arg0;
		Static564.aBoolean704 = false;
	}
}
