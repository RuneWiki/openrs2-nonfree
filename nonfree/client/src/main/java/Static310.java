import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static310 {

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZLclient!ei;)I")
	public static int method4870(@OriginalArg(1) Class79 arg0) {
		if (arg0 == Static382.aClass79_10) {
			return 9216;
		} else if (arg0 == Static431.aClass79_12) {
			return 34065;
		} else if (Static469.aClass79_13 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIIBI)V")
	public static void method4871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static522.anInt8772 = arg0;
		Static193.anInt7222 = arg1;
		Static470.anInt7899 = arg2;
		Static204.anInt4021 = arg4;
		Static227.anInt4495 = arg3;
		Static155.anInt2824 = arg5;
	}
}
