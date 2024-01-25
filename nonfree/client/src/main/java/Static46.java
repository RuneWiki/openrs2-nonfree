import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static46 {

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "Lclient!pf;")
	public static Class260 aClass260_1;

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(CI)I")
	public static int method588(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && Class4_Sub5_Sub8.anIntArray186.length > arg0 ? Class4_Sub5_Sub8.anIntArray186[arg0] : -1;
	}
}
