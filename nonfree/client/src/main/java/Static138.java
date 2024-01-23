import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static138 {

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
	public static int anInt3087 = 2;

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "Z")
	public static boolean aBoolean138 = false;

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
	public static int anInt3088 = -1;

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1085 = Static64.method1101("Lade Sprites )2 ");

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "[I")
	public static int[] anIntArray205 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BIIIIZI)V")
	public static void method2456(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static118.anInt2545 = arg2;
		Static4.anInt76 = arg1;
		Static120.anInt2656 = arg5;
		Static194.anInt4189 = arg0;
		Static129.anInt2900 = arg3;
		if (arg4 && Static4.anInt76 >= 100) {
			Static122.anInt2706 = Static194.anInt4189 * 128 + 64;
			Static118.anInt2544 = Static118.anInt2545 * 128 + 64;
			Static191.anInt4119 = Static26.method2454(Static197.anInt2422, Static118.anInt2544, Static122.anInt2706) - Static129.anInt2900;
		}
		Static70.anInt1624 = 2;
	}
}
