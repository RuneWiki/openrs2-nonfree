import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static107 {

	@OriginalMember(owner = "client!eaa", name = "n", descriptor = "Lclient!jo;")
	public static Class168 aClass168_27;

	@OriginalMember(owner = "client!eaa", name = "o", descriptor = "I")
	public static int anInt2436;

	@OriginalMember(owner = "client!eaa", name = "q", descriptor = "Z")
	public static boolean aBoolean206 = false;

	@OriginalMember(owner = "client!eaa", name = "r", descriptor = "J")
	public static volatile long aLong55 = 0L;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILclient!e;ZLjava/awt/Canvas;)Lclient!oa;")
	public static Class9 method2206(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Canvas arg2) {
		return arg1 ? new Class9_Sub1_Sub1(arg2, arg0) : new Class9_Sub1_Sub2(arg2, arg0);
	}
}
