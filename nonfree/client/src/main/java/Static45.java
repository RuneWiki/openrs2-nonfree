import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_19 = new Class287(60, -1);

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "Lclient!pca;")
	public static Class251 aClass251_3 = null;

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
	public static int anInt1213 = 0;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZIZ)V")
	public static void method1112(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class3_Sub44 local10 = Static470.method6424(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray446.length; local15++) {
				local10.anIntArray446[local15] = -1;
				local10.anIntArray447[local15] = 0;
			}
		}
	}
}
