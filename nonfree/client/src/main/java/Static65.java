import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static65 {

	@OriginalMember(owner = "client!ch", name = "R", descriptor = "I")
	public static int anInt1699;

	@OriginalMember(owner = "client!ch", name = "M", descriptor = "Lclient!gga;")
	public static final Class120 aClass120_1 = new Class120();

	@OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
	public static int anInt1698 = 0;

	@OriginalMember(owner = "client!ch", name = "Q", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_22 = new Class276(102, 0);

	@OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
	public static int anInt1700 = -1;

	@OriginalMember(owner = "client!ch", name = "U", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_23 = new Class276(30, -1);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!e;Ljava/awt/Canvas;Z)Lclient!oa;")
	public static Class15 method1642(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) boolean arg2) {
		return arg2 ? new Class15_Sub1_Sub2(arg1, arg0) : new Class15_Sub1_Sub1(arg1, arg0);
	}
}
