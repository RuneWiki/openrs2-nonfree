import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static259 {

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "Lclient!qa;")
	public static Class62 aClass62_27;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "Lclient!mj;")
	public static Class197 aClass197_2;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject12;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BIIIIZI)V")
	public static void method4373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static394.anInt7079 = arg0;
		Static6.anInt135 = arg3;
		Static382.anInt6976 = arg5;
		Static408.anInt7278 = arg2;
		Static65.anInt1250 = arg1;
		if (arg4 && Static6.anInt135 >= 100) {
			Static364.anInt6817 = Static394.anInt7079 * 128 + 64;
			Static367.anInt6861 = Static65.anInt1250 * 128 + 64;
			Static182.anInt3520 = Static191.method5464(Static367.anInt6861, Static364.anInt6817, Static367.anInt6860) - Static382.anInt6976;
		}
		Static166.anInt3343 = 2;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	public static void method4374() {
		Static138.aClass42_7.method1108();
	}
}
