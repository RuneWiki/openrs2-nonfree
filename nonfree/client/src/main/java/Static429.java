import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static429 {

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
	public static int anInt6931;

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
	public static int anInt6935;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
	public static int anInt6930 = 0;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIII)V")
	public static void method5374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static329.anIntArrayArray42 != null) {
			Static329.anIntArrayArray42[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static116.aShortArrayArray2 != null) {
			Static116.aShortArrayArray2[arg0][arg1] = (short) arg3;
		}
		if (Static94.aByteArrayArray60 != null) {
			Static94.aByteArrayArray60[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)Lclient!gk;")
	public static Class65_Sub1 method5375() {
		Static16.anInt207 = 0;
		return Static263.method2959();
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(JI)V")
	public static void method5376(@OriginalArg(0) long arg0) {
		if ((long) 0 >= arg0) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static43.method648(arg0 - 1L);
			Static43.method648(1L);
		} else {
			Static43.method648(arg0);
		}
	}
}
