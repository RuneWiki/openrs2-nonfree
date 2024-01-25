import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static266 {

	@OriginalMember(owner = "client!iu", name = "B", descriptor = "I")
	public static int anInt10256 = -60;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!d;Ljava/awt/Canvas;IBI)Lclient!ha;")
	public static Class144 method8781(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return new oa(arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z")
	public static boolean method8783(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		if (arg2 == null || arg3 == null) {
			return false;
		} else if (arg2.startsWith("#") || arg3.startsWith("#")) {
			return arg2.equals(arg3);
		} else {
			return arg0.equals(arg1);
		}
	}
}
