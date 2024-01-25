import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "Lclient!ph;")
	public static Class187 aClass187_50;

	@OriginalMember(owner = "client!fw", name = "g", descriptor = "I")
	public static int anInt2604;

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_46 = new Class27(14, 3);

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "Lclient!wm;")
	public static final Class267 aClass267_20 = new Class267(20);

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
	public static void method2215() {
		if (Static208.aClass151_6 != Static284.aClass151_8) {
			try {
				Static464.method2259(Static232.aClient5, "tbrefresh");
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)V")
	public static void method2216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class10_Sub1_Sub17 local13 = Static154.method2630(12, arg0);
		local13.method5345();
		local13.anInt6806 = arg1;
	}
}
