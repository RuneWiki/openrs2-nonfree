import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!vk", name = "B", descriptor = "Lclient!kp;")
	public static final Class165 aClass165_5 = new Class165();

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIII)V")
	public static void method7472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(16) int local16 = Static84.method1650(Static328.anInt6154, arg2, Static394.anInt7462);
		@Pc(22) int local22 = Static84.method1650(Static328.anInt6154, arg4, Static394.anInt7462);
		@Pc(28) int local28 = Static84.method1650(Static7.anInt8119, arg3, Static34.anInt603);
		@Pc(34) int local34 = Static84.method1650(Static7.anInt8119, arg0, Static34.anInt603);
		for (@Pc(36) int local36 = local16; local36 <= local22; local36++) {
			Static403.method6377(arg1, Static130.anIntArrayArray89[local36], local34, local28);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
	public static void method7485() {
		Static323.anInt6016 = 0;
		Static448.aClass249_63.method6530();
		Static452.aBoolean600 = false;
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(II)I")
	public static int method7487(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
