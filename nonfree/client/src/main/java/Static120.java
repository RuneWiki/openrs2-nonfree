import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	public static int anInt3381;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Lclient!ia;")
	public static Class31 aClass31_1 = new Class31();

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
	public static void method2353(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class1_Sub11 local10 = (Class1_Sub11) Static131.aClass14_9.method563(); local10 != null; local10 = (Class1_Sub11) Static131.aClass14_9.method571()) {
			if ((long) arg0 == (local10.aLong139 >> 48 & 0xFFFFL)) {
				local10.method3198();
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public static void method2354() {
		aClass31_1 = null;
		aLongArray4 = null;
	}
}
