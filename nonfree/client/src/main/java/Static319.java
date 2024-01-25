import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Lclient!fk;")
	public static Class71 aClass71_7;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!ij;")
	public static Class93 aClass93_121;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
	public static int anInt6185 = -1;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Z")
	public static boolean aBoolean514 = false;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ij;ILclient!ij;Lclient!ij;Lclient!ij;)V")
	public static void method5549(@OriginalArg(0) Class93 arg0, @OriginalArg(2) Class93 arg1, @OriginalArg(3) Class93 arg2, @OriginalArg(4) Class93 arg3) {
		Static248.aClass93_95 = arg3;
		Static255.aClass93_100 = arg2;
		Static254.aClass93_98 = arg0;
		Static52.aClass93_18 = arg1;
		Static304.aClass201ArrayArray1 = new Class201[Static248.aClass93_95.method2417()][];
		Static98.aBooleanArray8 = new boolean[Static248.aClass93_95.method2417()];
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIZ)Lclient!f;")
	public static Class5_Sub14 method5550(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(17) long local17 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class5_Sub14) Static118.aClass190_11.method5466(local17);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIBIIZ)V")
	public static void method5551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static263.anInt5213 = arg4;
		Static28.anInt709 = arg1;
		Static238.anInt4735 = arg0;
		Static274.anInt5431 = arg2;
		Static181.anInt3653 = arg3;
		if (arg5 && Static263.anInt5213 >= 100) {
			Static271.anInt5301 = Static181.anInt3653 * 128 + 64;
			Static21.anInt466 = Static238.anInt4735 * 128 + 64;
			Static102.anInt1934 = Static208.method3804(Static239.anInt4811, Static271.anInt5301, Static21.anInt466) - Static274.anInt5431;
		}
		Static53.anInt992 = 2;
	}
}
