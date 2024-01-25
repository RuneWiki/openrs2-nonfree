import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static503 {

	@OriginalMember(owner = "client!tga", name = "h", descriptor = "Lclient!sr;")
	public static Class302 aClass302_3;

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IBI)Z")
	public static boolean method7578(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && Static576.aByteArrayArrayArray21[1].length > arg0 && Static576.aByteArrayArrayArray21[1][arg0].length > arg1) {
			return (Static576.aByteArrayArrayArray21[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
