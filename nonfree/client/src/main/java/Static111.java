import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
	public static int anInt3012;

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "[S")
	public static short[] aShortArray30 = new short[256];

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIBII)V")
	public static void method2807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static161.anInt7734 && Static38.anInt823 >= arg1) {
			@Pc(24) int local24 = Static317.method5515(Static237.anInt5159, arg0, Static380.anInt7421);
			@Pc(30) int local30 = Static317.method5515(Static237.anInt5159, arg3, Static380.anInt7421);
			Static103.method2668(local30, local24, arg1, arg2);
		}
	}
}
