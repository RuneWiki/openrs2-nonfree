import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "Lclient!dp;")
	public static Class53 aClass53_130;

	@OriginalMember(owner = "client!rs", name = "s", descriptor = "I")
	public static int anInt5340 = 2;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)V")
	public static void method4847(@OriginalArg(0) int arg0) {
		Static171.anInt3191 = arg0;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZ)V")
	public static void method4849(@OriginalArg(0) int arg0) {
		Static305.anInt5783 = arg0;
		@Pc(7) Class70 local7 = Static206.aClass70_66;
		synchronized (Static206.aClass70_66) {
			Static206.aClass70_66.method1399();
		}
		local7 = Static80.aClass70_97;
		synchronized (Static80.aClass70_97) {
			Static80.aClass70_97.method1399();
		}
	}
}
