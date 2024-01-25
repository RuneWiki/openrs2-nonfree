import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "Lclient!pb;")
	public static Class227 aClass227_1;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "F")
	public static float aFloat225;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
	public static int anInt5474 = 0;

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "[I")
	public static final int[] anIntArray393 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)Z")
	public static boolean method4574(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIZI)V")
	public static void method4575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static236.method4043(local35, false, true);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIBIII)V")
	public static void method4577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == arg3) {
			Static164.method2918(arg1, arg4, arg0, arg2);
		} else if (arg0 - arg2 >= Static398.anInt7144 && Static71.anInt4958 >= arg0 + arg2 && arg1 - arg3 >= Static4.anInt6709 && Static492.anInt8451 >= arg3 + arg1) {
			Static224.method3563(arg0, arg1, arg3, arg4, arg2);
		} else {
			Static533.method7269(arg1, arg3, arg0, arg2, arg4);
		}
	}
}
