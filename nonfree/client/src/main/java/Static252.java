import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!te", name = "R", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32 = new String[1000];

	@OriginalMember(owner = "client!te", name = "T", descriptor = "Z")
	public static volatile boolean aBoolean293 = false;

	@OriginalMember(owner = "client!te", name = "Z", descriptor = "Ljava/lang/String;")
	public static String aString177 = "Loading...";

	@OriginalMember(owner = "client!te", name = "fb", descriptor = "[I")
	public static int[] anIntArray557 = new int[32];

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V")
	public static void method4305(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static254.method4243(0, arg0, arg0.length - 1, arg1);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IIII)I")
	public static int method4306(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg1;
		} else if (local14 == 1) {
			return 7 - arg0;
		} else if (local14 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)I")
	public static int method4307(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
