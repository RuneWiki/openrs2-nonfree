import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static129 {

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
	public static int anInt2687;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)I")
	public static int method2029(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIZI)V")
	public static void method2030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static305.anInt5449 = arg2;
		Static194.anInt3883 = arg3;
		Static57.anInt5083 = arg5;
		Static21.anInt707 = arg1;
		Static386.anInt6440 = arg0;
		if (arg4 && Static305.anInt5449 >= 100) {
			Static265.anInt5008 = Static57.anInt5083 * 128 + 64;
			Static276.anInt5105 = Static194.anInt3883 * 128 + 64;
			Static439.anInt7400 = Static231.method3482(Static6.anInt93, Static276.anInt5105, Static265.anInt5008) - Static386.anInt6440;
		}
		Static161.anInt3316 = 2;
	}
}
