import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!td;")
	public static Class156 aClass156_3;

	@OriginalMember(owner = "client!fb", name = "lb", descriptor = "I")
	public static int anInt1504;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	public static int anInt1462 = 0;

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
	public static int anInt1472 = 0;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Lclient!in;")
	public static Class71 aClass71_9 = null;

	@OriginalMember(owner = "client!fb", name = "G", descriptor = "[I")
	public static int[] anIntArray142 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!fb", name = "nb", descriptor = "I")
	public static int anInt1506 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B")
	public static byte[] method1255(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(17) byte[] local17 = (byte[]) arg0;
			return arg1 ? Static90.method1584(local17) : local17;
		} else if (arg0 instanceof Class2) {
			@Pc(36) Class2 local36 = (Class2) arg0;
			return local36.method41();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
