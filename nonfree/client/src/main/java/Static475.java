import java.awt.Canvas;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static475 {

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas12;

	@OriginalMember(owner = "client!sea", name = "h", descriptor = "Z")
	public static boolean aBoolean431 = false;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "([JB[I)V")
	public static void method4820(@OriginalArg(0) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static79.method1265(arg0, 0, arg1, arg0.length - 1);
	}
}
