import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static189 {

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "J")
	public static long aLong146;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "[I")
	public static int[] anIntArray350;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
	public static int anInt3906;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
	public static int anInt3908;

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
	public static int anInt3910;

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "[I")
	public static int[] anIntArray351 = new int[100];

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "Z")
	public static boolean aBoolean296 = false;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "J")
	public static long aLong147 = 0L;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
	public static volatile int anInt3907 = 0;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIZ)V")
	public static void method3146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static224.anInt4436 <= arg0 - arg1 && Static68.anInt1451 >= arg0 + arg1 && Static297.anInt5619 <= arg2 - arg1 && arg2 + arg1 <= Static49.anInt1129) {
			Static259.method3979(arg1, arg3, arg2, arg0);
		} else {
			Static212.method3367(arg2, arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZLclient!km;)V")
	public static void method3147(@OriginalArg(1) Class91 arg0) {
		Static72.aClass91_57 = arg0;
	}
}
