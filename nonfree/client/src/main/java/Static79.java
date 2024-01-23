import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
	public static int anInt1903;

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "Lclient!g;")
	public static Class56 aClass56_8;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
	public static int anInt1900 = 0;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Lclient!ch;")
	public static Class27 method1467(@OriginalArg(1) int arg0) {
		@Pc(10) Class27 local10 = (Class27) Static145.aClass157_27.method4031((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static260.aClass42_82.method1256(3, arg0);
		local10 = new Class27();
		if (local21 != null) {
			local10.method714(new Class2_Sub16(local21));
		}
		Static145.aClass157_27.method4026((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)V")
	public static void method1468() {
		Static80.aClass157_14.method4034(5);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZLclient!gb;BZILclient!gb;I)I")
	public static int method1469(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class58_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class58_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16 = Static261.method4096(arg5, arg1, arg4, arg0);
		if (local16 != 0) {
			return arg0 ? -local16 : local16;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(41) int local41 = Static261.method4096(arg3, arg1, arg4, arg2);
			return arg2 ? -local41 : local41;
		}
	}
}
