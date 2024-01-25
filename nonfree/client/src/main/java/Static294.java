import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "Lclient!wl;")
	public static Class29 aClass29_4;

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
	public static int anInt5915;

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "[S")
	public static short[] aShortArray101;

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
	public static int anInt5918 = 0;

	@OriginalMember(owner = "client!tg", name = "N", descriptor = "Ljava/lang/String;")
	public static final String aString234 = "red:";

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZZB)V")
	public static void method5154(@OriginalArg(0) boolean arg0) {
		Static41.anInt1132--;
		if (Static41.anInt1132 == 0) {
			Static94.anIntArray150 = null;
		}
		if (!arg0) {
			return;
		}
		Static182.anInt3806--;
		if (Static182.anInt3806 == 0) {
			Static77.anIntArray118 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lclient!fn;")
	public static Class72 method5157(@OriginalArg(1) int arg0) {
		@Pc(18) Class72 local18 = (Class72) Static211.aClass37_69.method915((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static159.aClass134_143.method3009(arg0, 29);
		local18 = new Class72();
		if (local28 != null) {
			local18.method1434(new Class1_Sub21(local28), arg0);
		}
		Static211.aClass37_69.method922((long) arg0, local18);
		return local18;
	}
}
