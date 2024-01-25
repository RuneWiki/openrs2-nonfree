import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Lclient!ta;")
	public static Class91 aClass91_7;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
	public static int anInt6701;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_80 = new Class61(25, 8);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method5597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg1 < 512 || arg4 < 512 || arg1 > (Static38.anInt740 - 2) * 512 || Static38.anInt741 * 512 - 1024 < arg4) {
			Static458.anIntArray627[0] = Static458.anIntArray627[1] = -1;
			return;
		}
		@Pc(54) int local54 = Static160.method3164(arg1, arg0, arg4) - arg3;
		Static488.aClass134_6.G(arg2, 0, 0);
		Static185.aClass66_14.method6823(Static488.aClass134_6);
		Static185.aClass66_14.na(arg1, local54, arg4, Static458.anIntArray627);
		Static488.aClass134_6.G(-arg2, 0, 0);
		Static185.aClass66_14.method6823(Static488.aClass134_6);
	}
}
