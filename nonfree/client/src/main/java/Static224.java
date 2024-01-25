import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!oe", name = "K", descriptor = "Lclient!sl;")
	public static Class115 aClass115_1;

	@OriginalMember(owner = "client!oe", name = "L", descriptor = "Z")
	public static boolean aBoolean333 = false;

	@OriginalMember(owner = "client!oe", name = "O", descriptor = "I")
	public static int anInt4512 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZI)B")
	public static byte method4158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(IZI)V")
	public static void method4160(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub4_Sub17 local13 = Static132.method2717(arg0, 14);
		local13.method3480();
		local13.anInt3727 = arg1;
	}
}
