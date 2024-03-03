import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "Lclient!r;")
	public static Class197 aClass197_54;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIB)V", line = 6)
	public static void method3560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class21 local13 = Static309.aClass21ArrayArray3[arg0][arg1];
		if (local13 != null) {
			Class71.lb = local13.anInt632;
			Class97.anInt2590 = local13.anInt640;
			Class83.anInt2343 = local13.anInt636;
		}
		Static268.method5030();
	}
}
