import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!lka", name = "g", descriptor = "S")
	public static short aShort75;

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "D")
	public static double aDouble11;

	@OriginalMember(owner = "client!lka", name = "b", descriptor = "Lclient!faa;")
	public static Class106 aClass106_2;

	@OriginalMember(owner = "client!lka", name = "d", descriptor = "I")
	public static int anInt5891 = 2;

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(ZIIII)V")
	public static void method5135(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static549.anInt5294 <= arg1 && Static334.anInt5381 >= arg1) {
			@Pc(26) int local26 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg0);
			@Pc(32) int local32 = Static689.method9122(Static77.anInt1737, Static82.anInt1902, arg3);
			Static715.method9490(arg2, local26, local32, arg1);
		}
	}
}
