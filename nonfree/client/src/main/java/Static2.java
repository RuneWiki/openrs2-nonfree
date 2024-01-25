import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "S")
	public static short aShort1 = 320;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)I")
	public static int method154(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZLjava/awt/Component;Z)Lclient!to;")
	public static Class228 method155(@OriginalArg(1) Component arg0) {
		return new Class228_Sub1(arg0, true);
	}
}
