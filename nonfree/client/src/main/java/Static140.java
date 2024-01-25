import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static140 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
	public static int anInt2835;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	public static int anInt2836 = -1;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	public static int anInt2841 = 0;

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
	public static int anInt2845 = -1;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLjava/awt/Component;)Lclient!up;")
	public static Class244 method2398(@OriginalArg(1) Component arg0) {
		return new Class244_Sub1(arg0);
	}
}
