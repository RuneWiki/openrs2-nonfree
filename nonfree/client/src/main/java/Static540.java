import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "I")
	public static int anInt9139 = 0;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ZB)Z")
	public static boolean method7485(@OriginalArg(0) boolean arg0) {
		@Pc(14) boolean local14 = Static176.aClass121_5.method7141();
		if (local14 == arg0) {
			return true;
		}
		if (!arg0) {
			Static176.aClass121_5.method7114();
		} else if (!Static176.aClass121_5.method7139()) {
			arg0 = false;
		}
		if (arg0 == local14) {
			return false;
		} else {
			Static480.aClass6_Sub37_Sub1_1.aBoolean411 = arg0;
			Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
			return true;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!fca;III)V")
	public static void method7486(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static382.aClass97_10 != null || Static330.aBoolean415 || (arg0 == null || Static96.method1494(arg0) == null)) {
			return;
		}
		Static382.aClass97_10 = arg0;
		Static340.aClass97_9 = Static96.method1494(arg0);
		Static576.aBoolean669 = false;
		Static575.anInt9609 = arg1;
		Static339.anInt6017 = arg2;
		Static334.anInt5970 = 0;
	}
}
