import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!lba", name = "j", descriptor = "I")
	public static int anInt5897;

	@OriginalMember(owner = "client!lba", name = "r", descriptor = "I")
	public static int anInt5904;

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "[I")
	public static final int[] anIntArray311 = new int[3];

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public static void method5142(@OriginalArg(0) Canvas arg0) {
		@Pc(11) Dimension local11 = arg0.getSize();
		Static434.method6781(local11.width, local11.height);
		if (Static234.anInt4427 == 1) {
			Static398.aClass5_13.method7554(arg0, Static476.anInt8315, Static430.anInt7728);
		} else {
			Static398.aClass5_13.method7554(arg0, Static245.anInt4546, Static107.anInt2317);
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IZI)Z")
	public static boolean method5143(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
