import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static367 {

	@OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
	public static int anInt6528;

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "[I")
	public static final int[] anIntArray449 = new int[] { 7500, 500 };

	@OriginalMember(owner = "client!nq", name = "v", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_114 = new Class286(46, 8);

	@OriginalMember(owner = "client!nq", name = "x", descriptor = "I")
	public static int anInt6534 = 0;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IC)Z")
	public static boolean method5475(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
