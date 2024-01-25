import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static462 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "Lclient!p;")
	public static Class182 aClass182_4;

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "S")
	public static short aShort111 = 1;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)Z")
	public static boolean method6276(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static229.method3308(arg1, arg0) | (arg0 & 0x40000) != 0 || Static5.method68(arg1, arg0);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIII)V")
	public static void method6277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static39.aClass79_Sub1_1.anInt2158 != 0 && arg2 != 0 && Static139.anInt2476 < 50 && arg3 != -1) {
			Static342.aClass216Array1[Static139.anInt2476++] = new Class216((byte) 1, arg3, arg2, arg1, arg0, 0);
		}
	}
}
