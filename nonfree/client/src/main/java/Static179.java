import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static179 {

	@OriginalMember(owner = "client!gfa", name = "h", descriptor = "Lclient!wu;")
	public static Class384 aClass384_45;

	@OriginalMember(owner = "client!gfa", name = "f", descriptor = "Lclient!aw;")
	public static final Class23 aClass23_5 = new Class23();

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(III)Z")
	public static boolean method2901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static182.method2926(arg1, arg0) || Static369.method5774(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static194.method3065(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIII)Z")
	public static boolean method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static480.aByteArrayArrayArray19[0][arg0][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static480.aByteArrayArrayArray19[arg3][arg0][arg2] & 0x10) == 0) {
			return Static557.method7820(arg3, arg2, arg0) == arg1;
		} else {
			return false;
		}
	}
}
