import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static36 {

	@OriginalMember(owner = "client!bd", name = "F", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
	public static int anInt654 = 0;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
	public static final int anInt656 = 1337;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!rt;I)I")
	public static int method583(@OriginalArg(0) Class298 arg0) {
		if (arg0 == Static471.aClass298_12) {
			return 5120;
		} else if (arg0 == Static471.aClass298_13) {
			return 5122;
		} else if (Static471.aClass298_14 == arg0) {
			return 5124;
		} else if (arg0 == Static471.aClass298_15) {
			return 5121;
		} else if (arg0 == Static471.aClass298_16) {
			return 5123;
		} else if (Static471.aClass298_17 == arg0) {
			return 5125;
		} else if (arg0 == Static471.aClass298_18) {
			return 5131;
		} else if (Static471.aClass298_19 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILclient!da;II)Lclient!lf;")
	public static Class189 method588(@OriginalArg(1) int arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return arg1 == null ? null : new Class189(arg3, arg2, arg0, arg1.K(), arg1.KA(), arg1.l(), arg1.J(), arg1.H(), arg1.OA(), arg1.za());
	}
}
