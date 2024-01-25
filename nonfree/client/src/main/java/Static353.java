import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static353 {

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Lclient!ok;")
	public static Class239 aClass239_2;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_116 = new Class73(99, 2);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)Z")
	public static boolean method5386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static154.aByteArrayArrayArray4[0][arg1][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static154.aByteArrayArrayArray4[arg3][arg1][arg0] & 0x10) == 0) {
			return Static212.method3741(arg1, arg0, arg3) == arg2;
		} else {
			return false;
		}
	}
}
