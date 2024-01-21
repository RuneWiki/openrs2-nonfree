import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "Lclient!oh;")
	public static Class11_Sub1 aClass11_Sub1_12;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
	public static int anInt1208 = 0;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
	public static int anInt1209 = 0;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "Lclient!lf;")
	public static Class49 aClass49_609 = Static32.method683("Angreifen");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!bg;ZLclient!bg;)V")
	public static void method962(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		Static6.aClass11_8 = arg0;
		Static154.aClass11_120 = arg1;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public static void method963() {
		if (!Static108.aBoolean93) {
			return;
		}
		@Pc(16) Class85 local16 = Static114.method1938(Static148.anInt3151, Static7.anInt138);
		if (local16 != null && local16.anObjectArray5 != null) {
			@Pc(25) Class2_Sub12 local25 = new Class2_Sub12();
			local25.anObjectArray2 = local16.anObjectArray5;
			local25.aClass85_4 = local16;
			Static38.method766(local25);
		}
		Static108.aBoolean93 = false;
		Static102.method1756(local16);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	public static void method964() {
		aClass11_Sub1_12 = null;
		aClass49_609 = null;
	}
}
