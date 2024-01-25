import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static374 {

	@OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
	public static int anInt6244;

	@OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
	public static int anInt6249;

	@OriginalMember(owner = "client!vo", name = "x", descriptor = "[I")
	public static final int[] anIntArray682 = new int[14];

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)I")
	public static int method5586(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
