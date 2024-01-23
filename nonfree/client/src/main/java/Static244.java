import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "Lclient!wc;")
	public static Class1_Sub3_Sub24 aClass1_Sub3_Sub24_6;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
	public static int anInt4356 = 0;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString289 = "Opened title screen";

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString290 = null;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIII)I")
	public static int method3198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg0;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIII)V")
	public static void method3199(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static206.anInt4449 = 0;
		Static90.anInt2088 = arg1;
		Static170.anInt3814 = 0;
		Static310.anInt6206 = arg0;
	}
}
