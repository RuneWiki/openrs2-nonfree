import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
	public static int anInt6626;

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_170 = new Class381(78, 3);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	public static void method5787() {
		for (@Pc(10) Class4_Sub3 local10 = (Class4_Sub3) Static605.aClass387_8.method9013(); local10 != null; local10 = (Class4_Sub3) Static605.aClass387_8.method9013()) {
			Static488.method6857(local10);
		}
		@Pc(38) int local38;
		@Pc(36) int local36;
		if (Static577.aClass5_Sub19_25.aClass17_Sub27_1.method9058() == 1) {
			local36 = 3;
			local38 = 0;
		} else {
			local36 = Static8.anInt112;
			local38 = Static8.anInt112;
		}
		Static73.method1214();
		for (@Pc(54) int local54 = local38; local54 <= local36; local54++) {
			Static73.method1225();
			Static73.method1210(local54);
			Static73.method1212(local54);
		}
		Static73.method1211();
		Static73.method1215();
	}
}
