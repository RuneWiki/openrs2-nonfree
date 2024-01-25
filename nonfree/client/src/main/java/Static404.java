import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static404 {

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
	public static int anInt7098 = 0;

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_89 = new Class212(70, 2);

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_214 = new Class214(76, 14);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIBI)Z")
	public static boolean method5662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static398.aByteArrayArrayArray17[0][arg0][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static398.aByteArrayArrayArray17[arg1][arg0][arg2] & 0x10) == 0) {
			return Static56.method1234(arg1, arg0, arg2) == arg3;
		} else {
			return false;
		}
	}
}
