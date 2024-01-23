import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "[S")
	public static short[] aShortArray68;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "Lclient!l;")
	public static Class98 aClass98_18 = new Class98(64);

	@OriginalMember(owner = "client!jn", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString98 = " is already on your ignore list.";

	@OriginalMember(owner = "client!jn", name = "C", descriptor = "I")
	public static int anInt2643 = 0;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZIIIIIIII)V")
	public static void method2337(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
			Static67.anInt1246 = -1;
			Static244.anInt4957 = -1;
			return;
		}
		@Pc(37) int local37 = Static122.method2036(arg1, arg0, Static99.anInt1826) - arg6;
		@Pc(41) int local41 = arg1 - Static173.anInt3251;
		@Pc(45) int local45 = local37 - Static224.anInt6075;
		@Pc(49) int local49 = arg0 - Static230.anInt4492;
		@Pc(53) int local53 = Class11.anIntArray26[Static79.anInt1912];
		@Pc(57) int local57 = Class11.anIntArray27[Static79.anInt1912];
		@Pc(61) int local61 = Class11.anIntArray26[Static113.anInt2103];
		@Pc(65) int local65 = Class11.anIntArray27[Static113.anInt2103];
		@Pc(75) int local75 = local65 * local49 + local41 * local61 >> 16;
		@Pc(86) int local86 = local65 * local41 - local61 * local49 >> 16;
		@Pc(88) int local88 = local75;
		@Pc(99) int local99 = local45 * local57 - local86 * local53 >> 16;
		@Pc(103) int local103 = local88 + arg2;
		@Pc(113) int local113 = local53 * local45 + local86 * local57 >> 16;
		if (local113 < 50) {
			Static244.anInt4957 = -1;
			Static67.anInt1246 = -1;
		} else if (Static283.aBoolean393) {
			@Pc(132) int local132 = arg5 * 512 >> 8;
			@Pc(138) int local138 = arg7 * 512 >> 8;
			Static67.anInt1246 = local99 * local138 / local113 + arg4;
			Static244.anInt4957 = local103 * local132 / local113 + arg3;
		} else {
			Static67.anInt1246 = (local99 << 9) / local113 + arg4;
			Static244.anInt4957 = (local103 << 9) / local113 + arg3;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BC)Z")
	public static boolean method2338(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
