import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static579 {

	@OriginalMember(owner = "client!tia", name = "x", descriptor = "Lclient!ifa;")
	public static final Class163 aClass163_61 = new Class163();

	@OriginalMember(owner = "client!tia", name = "z", descriptor = "I")
	public static int anInt8938 = 0;

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(II)I")
	public static int method7635(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
