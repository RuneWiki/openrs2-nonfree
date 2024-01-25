import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static266 {

	@OriginalMember(owner = "client!jga", name = "K", descriptor = "Lclient!gu;")
	public static Class135 aClass135_1;

	@OriginalMember(owner = "client!jga", name = "kb", descriptor = "Lclient!ha;")
	public static Class82 aClass82_8;

	@OriginalMember(owner = "client!jga", name = "mb", descriptor = "[Lclient!fd;")
	public static Class103[] aClass103Array8;

	@OriginalMember(owner = "client!jga", name = "V", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_151 = new Class194(39, 6);

	@OriginalMember(owner = "client!jga", name = "nb", descriptor = "[I")
	public static final int[] anIntArray282 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z[BI)I")
	public static int method4462(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static574.method8063(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(II)Z")
	public static boolean method4464(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIII)V")
	public static void method4465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static411.anIntArrayArray48 != null) {
			Static411.anIntArrayArray48[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static616.aShortArrayArray20 != null) {
			Static616.aShortArrayArray20[arg0][arg1] = (short) arg3;
		}
		if (Static52.aByteArrayArray4 != null) {
			Static52.aByteArrayArray4[arg0][arg1] = (byte) arg4;
		}
	}
}
