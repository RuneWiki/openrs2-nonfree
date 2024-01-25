import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static246 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "J")
	public static long aLong134;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "[I")
	public static int[] anIntArray367;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
	public static int anInt4914 = 0;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_95 = new Class73(51, 2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLclient!e;Ljava/awt/Canvas;B)Lclient!oa;")
	public static Class14 method4248(@OriginalArg(0) boolean arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) Canvas arg2) {
		return arg0 ? new Class14_Sub1_Sub2(arg2, arg1) : new Class14_Sub1_Sub1(arg2, arg1);
	}
}
