import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static217 {

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "[Lclient!uha;")
	public static final Class358[] aClass358Array1 = new Class358[8];

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIBIZI)V")
	public static void method3094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static69.anInt1063 = arg1;
		Static92.anInt1528 = arg2;
		Static552.anInt10277 = arg5;
		Static514.anInt8683 = arg3;
		Static293.anInt4550 = arg0;
		if (arg4 && Static69.anInt1063 >= 100) {
			Static570.anInt9347 = Static514.anInt8683 * 512 + 256;
			Static105.anInt1868 = Static293.anInt4550 * 512 + 256;
			Static546.anInt8938 = Static161.method1246(Static458.anInt7955, Static105.anInt1868, Static570.anInt9347) - Static92.anInt1528;
		}
		Static67.anInt1033 = -1;
		Static297.anInt571 = -1;
		Static133.anInt2254 = 2;
	}
}
