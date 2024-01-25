import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!tba", name = "i", descriptor = "I")
	public static int anInt8197 = 0;

	@OriginalMember(owner = "client!tba", name = "j", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!tba", name = "n", descriptor = "[I")
	public static final int[] anIntArray626 = new int[25];

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IB)Z")
	public static boolean method6872(@OriginalArg(0) int arg0) {
		if (arg0 == 60 || arg0 == 3 || arg0 == 22 || arg0 == 50 || arg0 == 4) {
			return true;
		} else {
			return arg0 == 17 || arg0 == 1002;
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)I")
	public static int method6873(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(28) int local28 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local28;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(BII)Z")
	public static boolean method6875(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
