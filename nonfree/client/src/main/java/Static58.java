import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cca", name = "ab", descriptor = "I")
	public static int anInt1499 = -1;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IBLclient!wv;I)V")
	public static void method1365(@OriginalArg(0) int arg0, @OriginalArg(2) Class365 arg1, @OriginalArg(3) int arg2) {
		if (Static363.aClass365_14 != null || Static294.aBoolean407 || (arg1 == null || Static64.method1426(arg1) == null)) {
			return;
		}
		Static363.aClass365_14 = arg1;
		Static394.aClass365_11 = Static64.method1426(arg1);
		Static103.aBoolean168 = false;
		Static428.anInt4967 = 0;
		Static212.anInt4159 = arg0;
		Static318.anInt5733 = arg2;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIBII)V")
	public static void method1374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg1) {
			Static250.method4000(arg1, Static478.anIntArrayArray51[arg3], arg2, arg0);
		} else {
			Static250.method4000(arg2, Static478.anIntArrayArray51[arg3], arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method1380(@OriginalArg(0) Class12 arg0) {
		for (@Pc(6) Class20_Sub5 local6 = (Class20_Sub5) Static290.aClass349_7.method7653(); local6 != null; local6 = (Class20_Sub5) Static290.aClass349_7.method7660()) {
			if (local6.aBoolean344) {
				local6.method3662(arg0);
			}
		}
	}
}
