import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString67 = "";

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "Z")
	public static boolean aBoolean467 = true;

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "Z")
	public static boolean aBoolean468 = false;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIB)I")
	public static int method5626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15 = 65536 - Class177.anIntArray844[arg1 * 8192 / arg2] >> 1;
		return (arg0 * local15 >> 16) + (arg3 * (65536 - local15) >> 16);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V")
	public static void method5630() {
		Static55.aClass160_9.method3595();
	}
}
