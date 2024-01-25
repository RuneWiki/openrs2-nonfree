import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
	public static int anInt2516;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIIII)V")
	public static void method1871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class224 local3 = new Class224();
		local3.anInt6539 = arg1 >> Static372.anInt7558;
		local3.anInt6548 = arg2 >> Static372.anInt7558;
		local3.anInt6537 = arg3 >> Static372.anInt7558;
		local3.anInt6542 = arg4 >> Static372.anInt7558;
		local3.anInt6545 = arg0;
		local3.anInt6553 = arg1;
		local3.anInt6541 = arg2;
		local3.anInt6544 = arg3;
		local3.anInt6546 = arg4;
		local3.anInt6535 = arg5;
		local3.anInt6549 = arg6;
		Static108.aClass224Array2[Static18.anInt561++] = local3;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)Z")
	public static boolean method1872(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIII)V")
	public static void method1873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static74.anIntArrayArray14 != null) {
			Static74.anIntArrayArray14[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static442.aByteArrayArray21 != null) {
			Static442.aByteArrayArray21[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Static146.aByteArrayArray3 != null) {
			Static146.aByteArrayArray3[arg0][arg1] = (byte) arg4;
		}
	}
}
