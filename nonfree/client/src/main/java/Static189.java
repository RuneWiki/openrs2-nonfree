import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static189 {

	@OriginalMember(owner = "client!hn", name = "hc", descriptor = "F")
	public static float aFloat208;

	@OriginalMember(owner = "client!hn", name = "u", descriptor = "Lclient!kl;")
	public static final Class174 aClass174_6 = new Class174(4);

	@OriginalMember(owner = "client!hn", name = "Tb", descriptor = "[B")
	public static final byte[] aByteArray57 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!hn", name = "Yb", descriptor = "[B")
	public static final byte[] aByteArray58 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!hn", name = "ic", descriptor = "I")
	public static int anInt4752 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIBII)Z")
	public static boolean method4028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static429.aByteArrayArrayArray17[0][arg1][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static429.aByteArrayArrayArray17[arg3][arg1][arg0] & 0x10) == 0) {
			return arg2 == Static395.method5751(arg1, arg3, arg0);
		} else {
			return false;
		}
	}
}
