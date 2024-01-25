import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static379 {

	@OriginalMember(owner = "client!oq", name = "B", descriptor = "I")
	public static int anInt6947;

	@OriginalMember(owner = "client!oq", name = "y", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!oq", name = "F", descriptor = "[I")
	public static final int[] anIntArray492 = new int[13];

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIZZ)V")
	public static void method5565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (Static76.method1083(arg1)) {
			Static110.method1698(arg0, arg3, -1, Static360.aClass97ArrayArray2[arg1], arg2);
		}
	}
}
