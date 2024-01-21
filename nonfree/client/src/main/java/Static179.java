import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!we", name = "H", descriptor = "I")
	public static int anInt4264 = 0;

	@OriginalMember(owner = "client!we", name = "K", descriptor = "I")
	public static int anInt4266 = 0;

	@OriginalMember(owner = "client!we", name = "M", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1636 = Static169.method2903("Fertigkeit)2");

	@OriginalMember(owner = "client!we", name = "S", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1637 = Static169.method2903("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!we", name = "V", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1638 = Static169.method2903("sl_stars");

	@OriginalMember(owner = "client!we", name = "g", descriptor = "(I)V")
	public static void method3082() {
		aClass23_1638 = null;
		aClass23_1636 = null;
		aClass23_1637 = null;
	}

	@OriginalMember(owner = "client!we", name = "h", descriptor = "(I)V")
	public static void method3083() {
		if (!Static156.aBoolean195) {
			return;
		}
		@Pc(16) Class60 local16 = Static120.method2104(Static52.anInt1969, Static178.anInt4245);
		if (local16 != null && local16.anObjectArray9 != null) {
			@Pc(25) Class1_Sub13 local25 = new Class1_Sub13();
			local25.anObjectArray3 = local16.anObjectArray9;
			local25.aClass60_6 = local16;
			Static178.method3065(local25);
		}
		Static156.aBoolean195 = false;
		Static39.method659(local16);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!ga;)V")
	public static void method3084(@OriginalArg(1) Class30 arg0) {
		Static76.aClass30_30 = arg0;
		Static133.anInt3410 = Static76.aClass30_30.method1278(16);
	}
}
