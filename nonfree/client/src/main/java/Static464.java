import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!oo", name = "E", descriptor = "I")
	public static int anInt7546;

	@OriginalMember(owner = "client!oo", name = "G", descriptor = "[I")
	public static int[] anIntArray538;

	@OriginalMember(owner = "client!oo", name = "L", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_136 = new Class225(115, 3);

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZI)V")
	public static void method6715(@OriginalArg(1) int arg0) {
		Static107.anInt1822 = arg0;
		@Pc(7) Class85 local7 = Static146.aClass85_18;
		synchronized (Static146.aClass85_18) {
			Static146.aClass85_18.method1748();
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method6717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(13) int local13 = arg2; local13 <= arg1; local13++) {
			for (@Pc(19) int local19 = arg0; local19 <= arg3; local19++) {
				if (Static506.anIntArrayArray50[local13][local19] == arg4 && Static648.anIntArrayArray62[local13][local19] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
