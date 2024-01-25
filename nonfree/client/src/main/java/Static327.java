import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static327 {

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
	public static int anInt5460;

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "Lclient!uu;")
	public static Class250 aClass250_82;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_133 = new Class163(33, 8);

	@OriginalMember(owner = "client!ps", name = "q", descriptor = "Lclient!la;")
	public static final Class136 aClass136_151 = new Class136(84, -2);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)Z")
	public static boolean method4523(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(B)J")
	public static long method4533() {
		return Static369.aClass63_1.method4637();
	}
}
