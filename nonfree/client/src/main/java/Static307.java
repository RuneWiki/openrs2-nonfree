import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "Lclient!ae;")
	public static Class8 aClass8_83;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "[I")
	public static final int[] anIntArray306 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4405(@OriginalArg(1) String arg0) {
		if (Static365.aClass232Array1 != null) {
			@Pc(23) Class6_Sub26 local23 = Static268.method3981(Static377.aClass15_2, Static283.aClass289_71);
			local23.aClass6_Sub23_Sub1_2.method8366(Static622.method8568(arg0));
			local23.aClass6_Sub23_Sub1_2.method8398(arg0);
			Static670.method9077(local23);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Z")
	public static boolean method4407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static173.method2463(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | Static3.method1022(arg0, arg1) | Static619.method8540(arg0, arg1) ? true : (Static673.method9097(arg0, arg1) | Static210.method3102(arg0, arg1)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)I")
	public static int method4408(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
