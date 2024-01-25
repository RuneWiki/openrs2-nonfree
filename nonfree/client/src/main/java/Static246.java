import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static246 {

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "Z")
	public static boolean aBoolean359 = false;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)Z")
	public static boolean method3936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I")
	public static int method3937(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!tv;ILclient!tv;)V")
	public static void method3938(@OriginalArg(0) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg0.aClass4_285 != null) {
			arg0.method8193();
		}
		arg0.aClass4_286 = arg1;
		arg0.aClass4_285 = arg1.aClass4_285;
		arg0.aClass4_285.aClass4_286 = arg0;
		arg0.aClass4_286.aClass4_285 = arg0;
	}
}
