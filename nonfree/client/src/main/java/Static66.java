import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "I")
	public static int anInt1197 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method1097() {
		for (@Pc(18) Class10_Sub33 local18 = (Class10_Sub33) Static418.aClass163_44.method3620(); local18 != null; local18 = (Class10_Sub33) Static418.aClass163_44.method3621()) {
			if (local18.anInt5095 == -1) {
				local18.anInt5097 = 0;
				if (local18.anInt5100 >= 0 && local18.anInt5108 >= 0 && local18.anInt5100 < Static2.anInt7 && local18.anInt5108 < Static17.anInt315) {
					Static40.method554(local18);
				}
			} else {
				local18.method6033();
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBI)V")
	public static void method1098(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class10_Sub1_Sub17 local8 = Static154.method2630(16, arg0);
		local8.method5345();
		local8.anInt6806 = arg1;
	}
}
