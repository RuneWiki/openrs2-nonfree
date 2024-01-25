import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static391 {

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "Lclient!iv;")
	public static Class120 aClass120_2;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
	public static int anInt6412;

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "[[S")
	public static short[][] aShortArrayArray14;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIB)V")
	public static void method5105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static305.method3794(arg0)) {
			Static15.method265(Static34.aClass76ArrayArray1[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII)I")
	public static int method5106(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < arg0) {
			return arg0;
		} else if (arg2 < arg1) {
			return arg2;
		} else {
			return arg1;
		}
	}
}
