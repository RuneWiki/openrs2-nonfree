import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static359 {

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "Lclient!wp;")
	public static Class363 aClass363_174;

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_113 = new Class286(61, 2);

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
	public static void method5305() {
		Static526.method7223();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIBII)V")
	public static void method5310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			Static276.method3099(arg3, Static582.anIntArrayArray69[arg0], arg2, arg1);
		} else {
			Static276.method3099(arg1, Static582.anIntArrayArray69[arg0], arg2, arg3);
		}
	}
}
