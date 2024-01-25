import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
	public static int anInt6196;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "Lclient!js;")
	public static final Class156 aClass156_14 = new Class156(8, 0, 4, 1);

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
	public static int anInt6195 = -1;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
	public static void method5626() {
		if (Static458.aBoolean588) {
			return;
		}
		if (Static286.aClass1_Sub15_Sub1_1.aBoolean528) {
			Static49.aFloat29 = (int) Static49.aFloat29 + 47 & 0xFFFFFFF0;
		} else {
			Static349.aFloat136 += (12.0F - Static349.aFloat136) / 2.0F;
		}
		Static458.aBoolean588 = true;
		Static506.aBoolean670 = true;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIIII)I")
	public static int method5629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg2 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(21) int local21 = arg3;
			arg3 = arg1;
			arg1 = local21;
		}
		if (local7 == 0) {
			return arg5;
		} else if (local7 == 1) {
			return 1 + 7 - arg4 - arg3;
		} else if (local7 == 2) {
			return 1 + 7 - arg1 - arg5;
		} else {
			return arg4;
		}
	}
}
