import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "Lclient!uh;")
	public static Class1_Sub46 aClass1_Sub46_1;

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "F")
	public static float aFloat89;

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "Lclient!em;")
	public static Class83 aClass83_74;

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "Z")
	public static boolean aBoolean232 = false;

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "Lclient!em;")
	public static final Class83 aClass83_73 = new Class83(1, -2);

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "Z")
	public static boolean aBoolean233 = false;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "Lclient!tb;")
	public static final Class316 aClass316_3 = new Class316();

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)V")
	public static void method2729(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub8_Sub9 local12 = Static465.method6470(arg0, 4);
		local12.method4835();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!sr;ZIZIILclient!sr;)I")
	public static int method2730(@OriginalArg(0) Class248_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class248_Sub1 arg5) {
		@Pc(10) int local10 = Static184.method2979(arg5, arg2, arg3, arg0);
		if (local10 != 0) {
			return arg3 ? -local10 : local10;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(33) int local33 = Static184.method2979(arg5, arg4, arg1, arg0);
			return arg1 ? -local33 : local33;
		}
	}
}
