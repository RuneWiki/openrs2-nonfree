import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static140 {

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "[I")
	public static final int[] anIntArray613 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_243 = new Class272(62, -1);

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
	public static int anInt7942 = 0;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!fa;B)Lclient!r;")
	public static Class43 method6726(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1) {
		return new l(arg0, arg1);
	}
}
