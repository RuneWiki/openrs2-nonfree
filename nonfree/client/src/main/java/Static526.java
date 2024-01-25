import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!uda", name = "e", descriptor = "[I")
	public static int[] anIntArray550;

	@OriginalMember(owner = "client!uda", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!uda", name = "h", descriptor = "F")
	public static float aFloat231;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "Lclient!aba;")
	public static final Class4 aClass4_7 = new Class4();

	@OriginalMember(owner = "client!uda", name = "f", descriptor = "Z")
	public static boolean aBoolean671 = false;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
	public static void method7237() {
		Static392.method5631();
		Static275.method4012();
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BII)I")
	public static int method7239(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIB)V")
	public static void method7240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class1_Sub8_Sub9 local10 = Static465.method6470(arg0, 7);
		local10.method4833();
		local10.anInt5968 = arg1;
	}
}
