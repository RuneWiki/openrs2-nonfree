import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
	public static int anInt7031;

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
	public static int anInt7029 = 0;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BI)I")
	public static int method5757(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(CBLjava/lang/String;)I")
	public static int method5759(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg1.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			if (arg0 == arg1.charAt(local15)) {
				local10++;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBIIIIII)V")
	public static void method5760(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static28.anInt644 <= arg6 && Static125.anInt2545 >= arg4 && arg5 >= Static108.anInt2276 && Static173.anInt3208 >= arg0) {
			Static370.method5069(arg4, arg3, arg2, arg1, arg6, arg0, arg5);
		} else {
			Static299.method641(arg4, arg5, arg3, arg2, arg1, arg6, arg0);
		}
	}
}
