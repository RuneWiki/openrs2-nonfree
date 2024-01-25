import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static238 {

	@OriginalMember(owner = "client!jda", name = "v", descriptor = "I")
	public static int anInt9921;

	@OriginalMember(owner = "client!jda", name = "z", descriptor = "I")
	public static int anInt9925;

	@OriginalMember(owner = "client!jda", name = "A", descriptor = "[Lclient!ga;")
	public static final Class3_Sub4_Sub12[] aClass3_Sub4_Sub12Array6 = new Class3_Sub4_Sub12[14];

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)V")
	public static void method8056() {
		Static426.aClass25_32.method948();
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(III)Z")
	public static boolean method8060(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static387.method6201(arg1, arg0) | (arg0 & 0x10000) != 0 || Static425.method6774(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static251.method4498(arg0, arg1);
		}
	}
}
