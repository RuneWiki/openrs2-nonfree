import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "Z")
	public static boolean aBoolean356;

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_88 = new Class171(95, 6);

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "Z")
	public static boolean aBoolean358 = false;

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
	public static int anInt5501 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z")
	public static boolean method4723(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZB)V")
	public static void method4725() {
		@Pc(14) Class3_Sub37 local14 = Static90.method1509(Static375.aClass240_81, Static226.aClass144_2);
		Static301.method2678(local14);
		for (@Pc(27) Class3_Sub25 local27 = (Class3_Sub25) Static513.aClass333_33.method7490(); local27 != null; local27 = (Class3_Sub25) Static513.aClass333_33.method7487()) {
			if (!local27.method9036()) {
				local27 = (Class3_Sub25) Static513.aClass333_33.method7490();
				if (local27 == null) {
					break;
				}
			}
			if (local27.anInt3966 == 0) {
				Static186.method2905(local27, true, true);
			}
		}
		if (Static84.aClass265_4 != null) {
			Static218.method3194(Static84.aClass265_4);
			Static84.aClass265_4 = null;
		}
	}
}
