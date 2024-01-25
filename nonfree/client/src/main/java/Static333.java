import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static333 {

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "Z")
	public static boolean aBoolean434 = false;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
	public static final int anInt5081 = 0;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Z")
	public static boolean method4610(@OriginalArg(1) int arg0) {
		return arg0 == 49 || arg0 == 30 || arg0 == 2 || arg0 == 46 || arg0 == 22 || arg0 == 60 || arg0 == 9;
	}
}
