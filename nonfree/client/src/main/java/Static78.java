import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
	public static int anInt1933;

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_27 = new Class90(111, -1);

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "Lclient!eq;")
	public static final Class96 aClass96_4 = new Class96();

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIIII)V")
	public static void method1613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(158) Class182 local158 = Static571.aClass182ArrayArrayArray3[arg1][arg3][arg2];
		if (local158 == null) {
			local158 = new Class182(arg1);
		}
		if (arg0 == 1) {
			local158.aShort79 = (short) arg4;
			local158.aShort77 = (short) arg5;
		} else if (arg0 == 2) {
			local158.aShort78 = (short) arg5;
			local158.aShort76 = (short) arg4;
		}
		if (Static595.aBoolean721) {
			Static232.method3764();
		}
	}
}
