import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!uda", name = "F", descriptor = "Lclient!md;")
	public static Class215 aClass215_1;

	@OriginalMember(owner = "client!uda", name = "H", descriptor = "I")
	public static int anInt9422;

	@OriginalMember(owner = "client!uda", name = "C", descriptor = "Lclient!n;")
	public static Class225 aClass225_48 = null;

	@OriginalMember(owner = "client!uda", name = "G", descriptor = "I")
	public static int anInt9421 = -1;

	@OriginalMember(owner = "client!uda", name = "L", descriptor = "I")
	public static final int anInt9426 = 2;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILclient!dc;)I")
	public static int method7679(@OriginalArg(1) Class4_Sub11_Sub1 arg0) {
		@Pc(10) int local10 = arg0.method1530(2);
		@Pc(28) int local28;
		if (local10 == 0) {
			local28 = 0;
		} else if (local10 == 1) {
			local28 = arg0.method1530(5);
		} else if (local10 == 2) {
			local28 = arg0.method1530(8);
		} else {
			local28 = arg0.method1530(11);
		}
		return local28;
	}
}
