import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
	public static int anInt7475;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "[Lclient!xa;")
	public static Class71[] aClass71Array44;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Z")
	public static boolean aBoolean506 = false;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "[I")
	public static final int[] anIntArray511 = new int[1000];

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)I")
	public static int method5970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == arg0) {
			return arg0;
		}
		@Pc(13) int local13 = 128 - arg1;
		@Pc(28) int local28 = local13 * (arg0 & 0x7F) + (arg2 & 0x7F) * arg1 >> 7;
		@Pc(42) int local42 = (arg0 & 0x380) * local13 + arg1 * (arg2 & 0x380) >> 7;
		@Pc(61) int local61 = (arg2 & 0xFC00) * arg1 + local13 * (arg0 & 0xFC00) >> 7;
		return local28 & 0x7F | local42 & 0x380 | local61 & 0xFC00;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIII)V")
	public static void method5972(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 >= Static529.anInt9806 && Static205.anInt3906 >= arg3 && Static133.anInt2531 <= arg2 && arg1 <= Static52.anInt1226) {
			Static555.method7725(arg3, arg4, arg1, arg2, arg0);
		} else {
			Static425.method5991(arg2, arg3, arg0, arg4, arg1);
		}
	}
}
