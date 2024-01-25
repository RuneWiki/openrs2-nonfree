import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static216 {

	@OriginalMember(owner = "client!ida", name = "l", descriptor = "I")
	public static int anInt3942;

	@OriginalMember(owner = "client!ida", name = "n", descriptor = "Lclient!oca;")
	public static Class238 aClass238_1;

	@OriginalMember(owner = "client!ida", name = "N", descriptor = "Z")
	public static boolean aBoolean283 = false;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IZ)I")
	public static int method3232(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3234(@OriginalArg(1) String arg0) {
		return Static323.method4807(10, arg0);
	}
}
