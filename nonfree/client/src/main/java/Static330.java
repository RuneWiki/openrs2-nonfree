import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static330 {

	@OriginalMember(owner = "client!lca", name = "v", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas5;

	@OriginalMember(owner = "client!lca", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString71 = "";

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "(B)V")
	public static void method4700() {
		Static585.anInt9524 = 0;
		Static643.anInt10566 = -1;
		Static622.anInt10293 = -1;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IZ)Z")
	public static boolean method4701(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}
}
