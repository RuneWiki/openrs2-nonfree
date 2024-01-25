import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static107 {

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_61 = new Class151(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
	public static int anInt1912 = -1;

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "Z")
	public static volatile boolean aBoolean140 = true;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZBIIII)V")
	public static void method1511(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static235.anInt3807 = arg4;
		Static48.anInt803 = arg0;
		Static65.anInt1146 = arg5;
		Static149.anInt7379 = arg3;
		Static253.anInt4091 = arg2;
		if (arg1 && Static149.anInt7379 >= 100) {
			Static8.anInt7337 = Static65.anInt1146 * 128 + 64;
			Static278.anInt4391 = Static253.anInt4091 * 128 + 64;
			Static5.anInt113 = Static183.method4175(Static8.anInt7337, Static278.anInt4391, Static138.anInt3548) - Static48.anInt803;
		}
		Static100.anInt1781 = 2;
	}
}
