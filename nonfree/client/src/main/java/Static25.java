import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static25 {

	@OriginalMember(owner = "client!at", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject2;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BIIZZ)V")
	public static void method352(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		Static584.method7941(arg3, arg0, Static446.aClass139_Sub1Array2.length - 1, arg1, 0, arg2);
		Static471.aClass6_Sub16_1 = null;
		Static510.anInt8786 = 0;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)Z")
	public static boolean method353(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BI)I")
	public static int method355(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
