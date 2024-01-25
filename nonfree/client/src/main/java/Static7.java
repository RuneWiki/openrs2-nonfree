import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!aca", name = "m", descriptor = "Lclient!dda;")
	public static Class53 aClass53_124;

	@OriginalMember(owner = "client!aca", name = "k", descriptor = "I")
	public static int anInt8119 = 0;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIILclient!dda;IZ)V")
	public static void method6808(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class53 arg2) {
		Static473.anInt8462 = 2;
		Static289.aClass53_83 = arg2;
		Static96.anInt1868 = 0;
		Static336.aBoolean469 = false;
		Static215.anInt8111 = arg0;
		Static117.anInt2343 = arg1;
		Static517.anInt9002 = 1;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!dda;II)Lclient!cb;")
	public static Class2_Sub10 method6810(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) byte[] local10 = arg0.method1599(arg1);
		return local10 == null ? null : new Class2_Sub10(local10);
	}

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "(B)V")
	public static void method6811() {
		if (Static14.aBoolean20) {
			Static515.aClass35_19 = null;
			Static193.aClass35_17 = null;
			Static14.aBoolean20 = false;
		}
	}
}
